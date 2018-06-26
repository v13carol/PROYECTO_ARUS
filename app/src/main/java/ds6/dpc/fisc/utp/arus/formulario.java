package ds6.dpc.fisc.utp.arus;

import android.content.ContentValues;
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

import java.util.ArrayList;

import ds6.dpc.fisc.utp.arus.BaseDatos.DbHelper;

import static ds6.dpc.fisc.utp.arus.BaseDatos.DbHelper.tabla;

public class formulario extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
 Button btn;
 EditText name,tel,num,cant,dire;
 Spinner tip;
 ArrayAdapter <String> adapter;
 String [] tipo;
 String des;
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


    public void GuardarDatos() {
        String nom = name.getText().toString();
        String numero = num.getText().toString();
        String telefono = tel.getText().toString();
        String  cantidad = cant.getText().toString();
        String direccion = dire.getText().toString();


        DbHelper basedeDatos = new DbHelper(this, "DEMODB", null, 1);

        SQLiteDatabase db = basedeDatos.getWritableDatabase();
        if (db != null && des != "") {

            ContentValues registronuevo = new ContentValues();
            registronuevo.put("Nombre", nom);
            registronuevo.put("Examinar",numero);
            registronuevo.put("Telefono",telefono);
            registronuevo.put("Tipo",des);
            registronuevo.put("Cantidad",cantidad);
            registronuevo.put("Direccion",direccion);

            db.insert( tabla , null, registronuevo);
            Toast.makeText(this, "Datos Almacenados", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(getApplicationContext(),"Campos vacios, llenelos correctamentes",Toast.LENGTH_SHORT).show();
        }
    }


    @Override
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
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
