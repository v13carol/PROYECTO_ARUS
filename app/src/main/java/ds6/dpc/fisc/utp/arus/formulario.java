package ds6.dpc.fisc.utp.arus;

import android.content.Intent;
import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import ds6.dpc.fisc.utp.arus.BaseDatos.DbHelper;
import static ds6.dpc.fisc.utp.arus.BaseDatos.Esquema.Zona.DATABASE_NAME;
import static ds6.dpc.fisc.utp.arus.BaseDatos.Esquema.Zona.DATABASE_VERSION;
import static ds6.dpc.fisc.utp.arus.BaseDatos.Esquema2.Formulario.CANTIDAD;
import static ds6.dpc.fisc.utp.arus.BaseDatos.Esquema2.Formulario.DIRECCION;
import static ds6.dpc.fisc.utp.arus.BaseDatos.Esquema2.Formulario.NOMBRE;
import static ds6.dpc.fisc.utp.arus.BaseDatos.Esquema2.Formulario.NUM_CLI;
import static ds6.dpc.fisc.utp.arus.BaseDatos.Esquema2.Formulario.TABLE_FORM;
import static ds6.dpc.fisc.utp.arus.BaseDatos.Esquema2.Formulario.TELEFONO;
import static ds6.dpc.fisc.utp.arus.BaseDatos.Esquema2.Formulario.TIPO;


public class formulario extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Button btn;
    EditText name,tel,num,cant,dire;
    Spinner tip;
    ArrayAdapter<String> adapter;
    String [] tipo;
    String des, nom, numero ,telefono , cantidad ,direccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
        btn = (Button) findViewById(R.id.button);
        name = (EditText) findViewById(R.id.editText8);
         num = (EditText) findViewById(R.id.editText);
         tel = (EditText) findViewById(R.id.editText3);
        cant = (EditText) findViewById(R.id.editText2);
        dire = (EditText) findViewById(R.id.editText6);
         tip = (Spinner)findViewById(R.id.spinner);

        tipo = getResources().getStringArray(R.array.tipo);
        adapter= new ArrayAdapter<String> (this, android.R.layout.simple_spinner_item,tipo);
        tip.setAdapter(adapter);
        tip.setOnItemSelectedListener(this);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               GuardarDatos();
            }
        });
    }

    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (position)
        {
            case 0: des="";
                break;
            case 1: des="Residuos de construcción y demolición";
                break;

            case 2:des="Vehículos y neumáticos fuera de uso";
                break;

            case 3:des="Residuos agrarios";
                break;
        }
        insert_des(des);
    }

    private void insert_des(String des) {
        this.des = des;
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


    public void GuardarDatos() {
         nom = name.getText().toString();
         numero = num.getText().toString();
         telefono = tel.getText().toString();
         cantidad = cant.getText().toString();
         direccion = dire.getText().toString();

        DbHelper cnn = new DbHelper(this, DATABASE_NAME, null, DATABASE_VERSION);

        SQLiteDatabase db = cnn.getWritableDatabase();

            try{
                    if(nom != "" && des!= "" && numero !=null && telefono !=null && cantidad !=null && direccion!= null){

                db.execSQL("INSERT INTO "+TABLE_FORM+"("+NOMBRE+","+NUM_CLI+","+TIPO+","+TELEFONO+","+CANTIDAD+","+DIRECCION+
                            " ) VALUES ('"+nom+"','"+numero+"','"+des+"','"+telefono+"','"+cantidad+"','"+direccion+"')");

                Toast.makeText(this, "Datos Almacenados", Toast.LENGTH_SHORT).show();
                limpiar();
                 db.close();

                    }else
                        { Toast.makeText(this,"llene los datos correctamentes",Toast.LENGTH_SHORT).show();}




            }
            catch(SQLException e){Toast.makeText(this,"Error al guardar datos",Toast.LENGTH_SHORT).show();}

    }

    private void limpiar()
    {


        name.setText("");
        num.setText("");
        tel.setText("");
        cant.setText("");
        dire.setText("");

    }


}
