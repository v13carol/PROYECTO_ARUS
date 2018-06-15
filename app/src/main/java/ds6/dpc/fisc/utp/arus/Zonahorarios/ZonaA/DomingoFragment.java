package ds6.dpc.fisc.utp.arus.Zonahorarios.ZonaA;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import ds6.dpc.fisc.utp.arus.BaseDatos.DbHelper;
import ds6.dpc.fisc.utp.arus.BaseDatos.Esquema;
import ds6.dpc.fisc.utp.arus.BaseDatos.data;
import ds6.dpc.fisc.utp.arus.R;


public class DomingoFragment extends Fragment {
    ArrayList<data> horarios;
    ArrayList<String> lista_info;
    ArrayAdapter adapter;
    ListView list_zona;
    DbHelper cnn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {    View rootView = inflater.inflate(R.layout.fragment_domingo, container, false);


        cnn = new DbHelper(getActivity(), Esquema.Zona.DATABASE_NAME,null, Esquema.Zona.DATABASE_VERSION);

        list_zona = (ListView) rootView.findViewById(R.id.list_domingo);
        consultar_lista();
        adapter = new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1,lista_info);
        list_zona.setAdapter(adapter);


        return rootView;
    }

    //   Domingo A
    private void consultar_lista() {

        SQLiteDatabase db = cnn.getReadableDatabase();
        Cursor cursor = null;
        data dat = null;
        horarios = new ArrayList<data>();

        cursor = db.rawQuery("SELECT "+Esquema.Zona.DOMINGO+" FROM "+ Esquema.Zona.TABLE_NAME,null);

        while(cursor.moveToNext())
        {  dat = new data();
            dat.setLunes(cursor.getString(0));

            horarios.add(dat);
        }
        obtenerLista();

        db.close();
    }

    private void obtenerLista() {
        lista_info = new ArrayList<>();
        for(int i = 0; i< horarios.size();i++)
        {
            lista_info.add(horarios.get(i).getLunes());
        }
    }

}
