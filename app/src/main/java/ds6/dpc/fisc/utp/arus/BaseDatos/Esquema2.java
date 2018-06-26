package ds6.dpc.fisc.utp.arus.BaseDatos;

import android.provider.BaseColumns;


public class Esquema2 {
    public static abstract class Formulario implements BaseColumns
    {
        // Formulario
        public static final String TABLE_FORM = "Formulario";
        public static final String ID_F = "id_form";
        public static final String NOMBRE = "Nombre";
        public static final String NUM_CLI = "NumeroCliente";
        public static final String TIPO = "Tipo";
        public static final String TELEFONO = "Telefono";
        public static final String CANTIDAD = "Cantidad";
        public static final String DIRECCION = "Direccion";


        public static final String CREAR_FORM = "CREATE TABLE "+
                TABLE_FORM+" (" +
                ID_F + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                NOMBRE + " TEXT NOT NULL , " +
                NUM_CLI + "  TEXT NOT NULL ," +
                TIPO +" TEXT NOT NULL , " +
                TELEFONO + " TEXT NOT NULL ," +
                CANTIDAD + " TEXT NOT NULL , " +
                DIRECCION + " TEXT NOT NULL ); ";


    }
}
