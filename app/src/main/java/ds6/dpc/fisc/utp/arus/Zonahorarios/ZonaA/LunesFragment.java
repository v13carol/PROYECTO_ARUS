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

public class LunesFragment extends Fragment {

    ArrayList<data> horarios;
    ArrayList<String> lista_info;
    ArrayAdapter adapter;
    ListView list_zona;
    DbHelper cnn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {    View  rootView = inflater.inflate(R.layout.fragment_lunes, container, false);

           cnn = new DbHelper(getActivity(), Esquema.Zona.DATABASE_NAME,null, Esquema.Zona.DATABASE_VERSION);
           list_zona = (ListView) rootView.findViewById(R.id.list_lunes);
           consultar_lista();
           adapter = new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1,lista_info);
           list_zona.setAdapter(adapter);



        return rootView;
    }





    /*------------ESTOS 2 METODOS SON ENCONTRADOS EN EL RESTO DE LAS OTRAS CARPETAS--------------------
    * ZONA B
    * ZONA C
    * ZONA D
    * ZONA E
    * SOLO QUE CADA UNA VA EXTRAER LOS DATOS DE SU RESPECTIVA TABLA QUE SE PODRA ENCONTRAR EN
    * BASE DE DATOS/ESQUEMA DONDE ESTAN LOS 5 TIPOS DE TABLAS ZONA CON SUS RESPECTIVOS DATOS*/


    /*Lunes A EL METODO CONSULTA_LISTA EXTRAE LOS DATOS DE LA BASE DE DATOS POR MEDIO DE LA SENTENCIA SQL
    /DONDE GUARDA EN UN TIPO ARRAY- DATA QUE ES UNA CLASE QUE SE ENCUENTRA EN LA CARPETA BASE DE DATOS- DATA
    */
    private void consultar_lista() {
        // EXTRAYENDO DATOS

        SQLiteDatabase db = cnn.getReadableDatabase();
        Cursor cursor = null;
        data dat = null;
        horarios = new ArrayList<data>();

        cursor = db.rawQuery("SELECT "+ Esquema.Zona.LUNES+" FROM "+ Esquema.Zona.TABLE_NAME,null);

        while(cursor.moveToNext())
        {  dat = new data();
            dat.setLunes(cursor.getString(0));

            horarios.add(dat);
        }
        obtenerLista();

        db.close();
    }

    /*METODO OBTENER_LISTA SE CREA UN ARRAY_LISTA DE TIPO STRING QUE ALMACENARA LOS DATOS EXTRAIDOS EN EL METODO ANTERIOR
    * QUE SE ENCUENTRAN GUARDADOS EN HORARIOS(ARRAY_LIST<DATA>)*/
    private void obtenerLista() {
        lista_info = new ArrayList<>();
        for(int i = 0; i< horarios.size();i++)
        {
            lista_info.add(horarios.get(i).getLunes());
        }


    }

}
