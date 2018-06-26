package ds6.dpc.fisc.utp.arus.BaseDatos;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


import static ds6.dpc.fisc.utp.arus.BaseDatos.Esquema.Zona.CREAR_TABLA;
import static ds6.dpc.fisc.utp.arus.BaseDatos.Esquema.Zona.CREAR_TABLA2;
import static ds6.dpc.fisc.utp.arus.BaseDatos.Esquema.Zona.CREAR_TABLA3;
import static ds6.dpc.fisc.utp.arus.BaseDatos.Esquema.Zona.CREAR_TABLA4;
import static ds6.dpc.fisc.utp.arus.BaseDatos.Esquema.Zona.CREAR_TABLA5;
import static ds6.dpc.fisc.utp.arus.BaseDatos.Esquema2.Formulario.CREAR_FORM;

/** Manejador de la BD*/
public class DbHelper extends SQLiteOpenHelper
{
    private SQLiteDatabase db;

    public DbHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREAR_TABLA);
        db.execSQL(CREAR_TABLA2);
        db.execSQL(CREAR_TABLA3);
        db.execSQL(CREAR_TABLA4);
        db.execSQL(CREAR_TABLA5);
        db.execSQL(CREAR_FORM);

        // INSERTA LOS DATOS A LAS TABLAS
        Tabla_A(db);
        Tabla_B(db);
        Tabla_C(db);
        Tabla_D(db);
        Tabla_E(db);
    }


    private void Tabla_A(SQLiteDatabase db) {
        long idRes;
        ContentValues values = new ContentValues();
        values.put(Esquema.Zona.ID, "1");
        values.put(Esquema.Zona.LUNES,"San Felipe-Peatonal");
        values.put(Esquema.Zona.MARTES, "San Felipe-Peatonal");
        values.put(Esquema.Zona.MIERCOLES, "San Felipe-Peatonal");
        values.put(Esquema.Zona.JUEVES,"San Felipe-Peatonal");
        values.put(Esquema.Zona.VIERNES, "San Felipe-Peatonal");
        values.put(Esquema.Zona.SABADO,"San Felipe-Peatonal");
        values.put(Esquema.Zona.DOMINGO, "San Felipe-Peatonal");

        idRes = db.insert(Esquema.Zona.TABLE_NAME, null, values );

        values.put(Esquema.Zona.ID, "2");
        values.put(Esquema.Zona.LUNES,"Curundu");
        values.put(Esquema.Zona.MARTES, "Curundu");
        values.put(Esquema.Zona.MIERCOLES, "Curundu");
        values.put(Esquema.Zona.JUEVES,"Curundu");
        values.put(Esquema.Zona.VIERNES, "Curundu");
        values.put(Esquema.Zona.SABADO,"Curundu");
        values.put(Esquema.Zona.DOMINGO, "Curundu");

        idRes = db.insert(Esquema.Zona.TABLE_NAME, null, values );


        values.put(Esquema.Zona.ID, "3");
        values.put(Esquema.Zona.LUNES,"El Chorillo 1 ");
        values.put(Esquema.Zona.MARTES, "El Chorillo 1 ");
        values.put(Esquema.Zona.MIERCOLES, "El Chorillo 1 ");
        values.put(Esquema.Zona.JUEVES,"El Chorillo 1 ");
        values.put(Esquema.Zona.VIERNES, "El Chorillo 1 ");
        values.put(Esquema.Zona.SABADO,"El Chorillo 1 ");
        values.put(Esquema.Zona.DOMINGO, "El Chorillo 1 ");

        idRes = db.insert(Esquema.Zona.TABLE_NAME, null, values );


        values.put(Esquema.Zona.ID, "4");
        values.put(Esquema.Zona.LUNES,"El Chorillo 2 ");
        values.put(Esquema.Zona.MARTES, "El Chorillo 2 ");
        values.put(Esquema.Zona.MIERCOLES, "El Chorillo 2 ");
        values.put(Esquema.Zona.JUEVES,"El Chorillo 2 ");
        values.put(Esquema.Zona.VIERNES, "El Chorillo 2 ");
        values.put(Esquema.Zona.SABADO,"El Chorillo 2 ");
        values.put(Esquema.Zona.DOMINGO, "El Chorillo 2 ");

        idRes = db.insert(Esquema.Zona.TABLE_NAME, null, values );


        values.put(Esquema.Zona.ID, "5");
        values.put(Esquema.Zona.LUNES,"San Miguel ");
        values.put(Esquema.Zona.MARTES, "San Miguel ");
        values.put(Esquema.Zona.MIERCOLES, "San Miguel ");
        values.put(Esquema.Zona.JUEVES,"San Miguel ");
        values.put(Esquema.Zona.VIERNES, "San Miguel ");
        values.put(Esquema.Zona.SABADO,"San Miguel ");
        values.put(Esquema.Zona.DOMINGO, "San Miguel ");

        idRes = db.insert(Esquema.Zona.TABLE_NAME, null, values );


        values.put(Esquema.Zona.ID, "6");
        values.put(Esquema.Zona.LUNES,"San Joaquín 2");
        values.put(Esquema.Zona.MARTES, "Jardin Olimpico 2 ");
        values.put(Esquema.Zona.MIERCOLES, "San Joaquín 2");
        values.put(Esquema.Zona.JUEVES,"Jardin Olimpico 2 ");
        values.put(Esquema.Zona.VIERNES, "San Joaquín 2");
        values.put(Esquema.Zona.SABADO,"Jardin Olimpico 2 ");
        values.put(Esquema.Zona.DOMINGO, "San Joaquín 2");

        idRes = db.insert(Esquema.Zona.TABLE_NAME, null, values );


        values.put(Esquema.Zona.ID, "7");
        values.put(Esquema.Zona.LUNES,"Santa Ana 1 ");
        values.put(Esquema.Zona.MARTES, "Santa Ana 1 ");
        values.put(Esquema.Zona.MIERCOLES, "Santa Ana 1 ");
        values.put(Esquema.Zona.JUEVES,"Santa Ana 1 ");
        values.put(Esquema.Zona.VIERNES, "Santa Ana 1 ");
        values.put(Esquema.Zona.SABADO,"Santa Ana 1 ");
        values.put(Esquema.Zona.DOMINGO, "Santa Ana 1 ");

        idRes = db.insert(Esquema.Zona.TABLE_NAME, null, values );


        values.put(Esquema.Zona.ID, "8");
        values.put(Esquema.Zona.LUNES,"Santa Ana 2");
        values.put(Esquema.Zona.MARTES, "Santa Ana 2");
        values.put(Esquema.Zona.MIERCOLES, "Santa Ana 2");
        values.put(Esquema.Zona.JUEVES,"Santa Ana 2");
        values.put(Esquema.Zona.VIERNES, "Santa Ana 2");
        values.put(Esquema.Zona.SABADO,"Santa Ana 2");
        values.put(Esquema.Zona.DOMINGO, "Santa Ana 2");

        idRes = db.insert(Esquema.Zona.TABLE_NAME, null, values );


        values.put(Esquema.Zona.ID, "9");
        values.put(Esquema.Zona.LUNES,"Balboa ");
        values.put(Esquema.Zona.MARTES, "Pedro Miguel");
        values.put(Esquema.Zona.MIERCOLES, "Balboa ");
        values.put(Esquema.Zona.JUEVES,"Pedro Miguel");
        values.put(Esquema.Zona.VIERNES, "Balboa ");
        values.put(Esquema.Zona.SABADO,"Pedro Miguel");
        values.put(Esquema.Zona.DOMINGO, " ");

        idRes = db.insert(Esquema.Zona.TABLE_NAME, null, values );



        values.put(Esquema.Zona.ID, "10");
        values.put(Esquema.Zona.LUNES,"Albrook ");
        values.put(Esquema.Zona.MARTES, "Ancon ");
        values.put(Esquema.Zona.MIERCOLES, "Albrook ");
        values.put(Esquema.Zona.JUEVES,"Ancon ");
        values.put(Esquema.Zona.VIERNES, "Albrook ");
        values.put(Esquema.Zona.SABADO,"Ancon ");
        values.put(Esquema.Zona.DOMINGO, " ");

        idRes = db.insert(Esquema.Zona.TABLE_NAME, null, values );



        values.put(Esquema.Zona.ID, "11");
        values.put(Esquema.Zona.LUNES,"Clayton ");
        values.put(Esquema.Zona.MARTES, "Llanos de Curundu ");
        values.put(Esquema.Zona.MIERCOLES, "Clayton ");
        values.put(Esquema.Zona.JUEVES,"Llanos de Curundu ");
        values.put(Esquema.Zona.VIERNES, "Clayton ");
        values.put(Esquema.Zona.SABADO,"Llanos de Curundu ");
        values.put(Esquema.Zona.DOMINGO, " ");

        idRes = db.insert(Esquema.Zona.TABLE_NAME, null, values );



        values.put(Esquema.Zona.ID, "12");
        values.put(Esquema.Zona.LUNES,"Diablo");
        values.put(Esquema.Zona.MARTES, "Los Ríos ");
        values.put(Esquema.Zona.MIERCOLES, "Diablo");
        values.put(Esquema.Zona.JUEVES,"Los Ríos ");
        values.put(Esquema.Zona.VIERNES, "Diablo");
        values.put(Esquema.Zona.SABADO,"Los Ríos ");
        values.put(Esquema.Zona.DOMINGO, " ");

        idRes = db.insert(Esquema.Zona.TABLE_NAME, null, values );


        values.put(Esquema.Zona.ID, "13");
        values.put(Esquema.Zona.LUNES,"Locería ");
        values.put(Esquema.Zona.MARTES, "Alameda ");
        values.put(Esquema.Zona.MIERCOLES, "Locería ");
        values.put(Esquema.Zona.JUEVES,"Alameda ");
        values.put(Esquema.Zona.VIERNES, "Locería ");
        values.put(Esquema.Zona.SABADO,"Alameda ");
        values.put(Esquema.Zona.DOMINGO, "Locería ");

        idRes = db.insert(Esquema.Zona.TABLE_NAME, null, values );


        values.put(Esquema.Zona.ID, "14");
        values.put(Esquema.Zona.LUNES,"Los Ángeles ");
        values.put(Esquema.Zona.MARTES, "Los Ángeles ");
        values.put(Esquema.Zona.MIERCOLES, "Los Ángeles ");
        values.put(Esquema.Zona.JUEVES,"Los Ángeles ");
        values.put(Esquema.Zona.VIERNES, "Los Ángeles ");
        values.put(Esquema.Zona.SABADO,"Los Ángeles ");
        values.put(Esquema.Zona.DOMINGO, " ");

        idRes = db.insert(Esquema.Zona.TABLE_NAME, null, values );

        values.put(Esquema.Zona.ID, "15");
        values.put(Esquema.Zona.LUNES,"Santa María ");
        values.put(Esquema.Zona.MARTES, "Santa María ");
        values.put(Esquema.Zona.MIERCOLES, "Santa María ");
        values.put(Esquema.Zona.JUEVES,"Santa María ");
        values.put(Esquema.Zona.VIERNES, "Santa María ");
        values.put(Esquema.Zona.SABADO,"Santa María ");
        values.put(Esquema.Zona.DOMINGO, "Santa María ");

        idRes = db.insert(Esquema.Zona.TABLE_NAME, null, values );

        values.put(Esquema.Zona.ID, "16");
        values.put(Esquema.Zona.LUNES,"Miraflores ");
        values.put(Esquema.Zona.MARTES, "Miraflores ");
        values.put(Esquema.Zona.MIERCOLES, "Miraflores ");
        values.put(Esquema.Zona.JUEVES,"Miraflores ");
        values.put(Esquema.Zona.VIERNES, "Miraflores ");
        values.put(Esquema.Zona.SABADO,"Miraflores ");
        values.put(Esquema.Zona.DOMINGO, "Miraflores ");

        idRes = db.insert(Esquema.Zona.TABLE_NAME, null, values );


        values.put(Esquema.Zona.ID, "17");
        values.put(Esquema.Zona.LUNES,"C. del Rey ");
        values.put(Esquema.Zona.MARTES, "C. del Rey ");
        values.put(Esquema.Zona.MIERCOLES, "C. del Rey ");
        values.put(Esquema.Zona.JUEVES,"C. del Rey ");
        values.put(Esquema.Zona.VIERNES, "C. del Rey ");
        values.put(Esquema.Zona.SABADO,"C. del Rey ");
        values.put(Esquema.Zona.DOMINGO, "C. del Rey ");

        idRes = db.insert(Esquema.Zona.TABLE_NAME, null, values );

        values.put(Esquema.Zona.ID, "18");
        values.put(Esquema.Zona.LUNES,"A. De Panamá");
        values.put(Esquema.Zona.MARTES, "A. De Panamá");
        values.put(Esquema.Zona.MIERCOLES, "A. De Panamá");
        values.put(Esquema.Zona.JUEVES,"A. De Panamá");
        values.put(Esquema.Zona.VIERNES, "A. De Panamá");
        values.put(Esquema.Zona.SABADO,"A. De Panamá");
        values.put(Esquema.Zona.DOMINGO, "A. De Panamá");

        idRes = db.insert(Esquema.Zona.TABLE_NAME, null, values );


        values.put(Esquema.Zona.ID, "19");
        values.put(Esquema.Zona.LUNES," ");
        values.put(Esquema.Zona.MARTES, " ");
        values.put(Esquema.Zona.MIERCOLES, " ");
        values.put(Esquema.Zona.JUEVES," ");
        values.put(Esquema.Zona.VIERNES, " ");
        values.put(Esquema.Zona.SABADO," ");
        values.put(Esquema.Zona.DOMINGO, " ");

        idRes = db.insert(Esquema.Zona.TABLE_NAME, null, values );
    }

    private void Tabla_B(SQLiteDatabase db) {
        long idRes;
        ContentValues values = new ContentValues();
        values.put(Esquema.Zona.ID, "1");
        values.put(Esquema.Zona.LUNES,"Las Sabanas");
        values.put(Esquema.Zona.MARTES, "Río Abajo 1");
        values.put(Esquema.Zona.MIERCOLES, "Las Sabanas");
        values.put(Esquema.Zona.JUEVES,"Río Abajo 1");
        values.put(Esquema.Zona.VIERNES, "Las Sabanas");
        values.put(Esquema.Zona.SABADO,"Río Abajo 1");
        values.put(Esquema.Zona.DOMINGO, "Río Abajo 1");


        idRes = db.insert(Esquema.Zona.TABLE_NAME2, null, values );


        values.put(Esquema.Zona.ID, "2");
        values.put(Esquema.Zona.LUNES,"Costa del Este 1 ");
        values.put(Esquema.Zona.MARTES, "Costa del Este 1 ");
        values.put(Esquema.Zona.MIERCOLES, "Costa del Este 1 ");
        values.put(Esquema.Zona.JUEVES,"Costa del Este 1 ");
        values.put(Esquema.Zona.VIERNES, "Costa del Este 1 ");
        values.put(Esquema.Zona.SABADO,"Costa del Este 1 ");
        values.put(Esquema.Zona.DOMINGO, "Costa del Este 1 ");


        idRes = db.insert(Esquema.Zona.TABLE_NAME2, null, values );


        values.put(Esquema.Zona.ID, "3");
        values.put(Esquema.Zona.LUNES,"Costa del Este 2 ");
        values.put(Esquema.Zona.MARTES, "Costa del Este 2 ");
        values.put(Esquema.Zona.MIERCOLES, "Costa del Este 2 ");
        values.put(Esquema.Zona.JUEVES,"Costa del Este 2 ");
        values.put(Esquema.Zona.VIERNES, "Costa del Este 2 ");
        values.put(Esquema.Zona.SABADO,"Costa del Este 2 ");
        values.put(Esquema.Zona.DOMINGO, "Costa del Este 2 ");


        idRes = db.insert(Esquema.Zona.TABLE_NAME2, null, values );


        values.put(Esquema.Zona.ID, "4");
        values.put(Esquema.Zona.LUNES,"Costa del Este 3");
        values.put(Esquema.Zona.MARTES, "Costa del Este 3");
        values.put(Esquema.Zona.MIERCOLES, "Costa del Este 3");
        values.put(Esquema.Zona.JUEVES,"Costa del Este 3");
        values.put(Esquema.Zona.VIERNES, "Costa del Este 3");
        values.put(Esquema.Zona.SABADO,"Costa del Este 3");
        values.put(Esquema.Zona.DOMINGO, " ");


        idRes = db.insert(Esquema.Zona.TABLE_NAME2, null, values );


        values.put(Esquema.Zona.ID, "5");
        values.put(Esquema.Zona.LUNES,"Costa del Este 4 ");
        values.put(Esquema.Zona.MARTES, "Río Abajo 4 ");
        values.put(Esquema.Zona.MIERCOLES, "Costa del Este 4 ");
        values.put(Esquema.Zona.JUEVES,"Río Abajo 4 ");
        values.put(Esquema.Zona.VIERNES, "Costa del Este 4 ");
        values.put(Esquema.Zona.SABADO,"Río Abajo 4 ");
        values.put(Esquema.Zona.DOMINGO, "Río Abajo 4 ");


        idRes = db.insert(Esquema.Zona.TABLE_NAME2, null, values );


        values.put(Esquema.Zona.ID, "6");
        values.put(Esquema.Zona.LUNES,"Río Abajo  3 ");
        values.put(Esquema.Zona.MARTES, "Río Abajo  3 ");
        values.put(Esquema.Zona.MIERCOLES, "Río Abajo  3 ");
        values.put(Esquema.Zona.JUEVES,"Río Abajo  3 ");
        values.put(Esquema.Zona.VIERNES, "Río Abajo  3 ");
        values.put(Esquema.Zona.SABADO,"Río Abajo  3 ");
        values.put(Esquema.Zona.DOMINGO, "Río Abajo  3 ");


        idRes = db.insert(Esquema.Zona.TABLE_NAME2, null, values );


        values.put(Esquema.Zona.ID, "7");
        values.put(Esquema.Zona.LUNES,"Panamá Viejo 1");
        values.put(Esquema.Zona.MARTES, "Panamá Viejo 1");
        values.put(Esquema.Zona.MIERCOLES, "Panamá Viejo 1");
        values.put(Esquema.Zona.JUEVES,"Panamá Viejo 1");
        values.put(Esquema.Zona.VIERNES, "Panamá Viejo 1");
        values.put(Esquema.Zona.SABADO,"Panamá Viejo 1");
        values.put(Esquema.Zona.DOMINGO, "Panamá Viejo 1");

        idRes = db.insert(Esquema.Zona.TABLE_NAME2, null, values );


        values.put(Esquema.Zona.ID, "8");
        values.put(Esquema.Zona.LUNES,"Panamá Viejo 2 ");
        values.put(Esquema.Zona.MARTES, "Panamá Viejo 2 ");
        values.put(Esquema.Zona.MIERCOLES, "Panamá Viejo 2 ");
        values.put(Esquema.Zona.JUEVES,"Panamá Viejo 2 ");
        values.put(Esquema.Zona.VIERNES, "Panamá Viejo 2 ");
        values.put(Esquema.Zona.SABADO,"Panamá Viejo 2 ");
        values.put(Esquema.Zona.DOMINGO, "Panamá Viejo 2 ");

        idRes = db.insert(Esquema.Zona.TABLE_NAME2, null, values );


        values.put(Esquema.Zona.ID, "9");
        values.put(Esquema.Zona.LUNES,"Parque Lefevre");
        values.put(Esquema.Zona.MARTES, "Parque Lefevre");
        values.put(Esquema.Zona.MIERCOLES, "Parque Lefevre");
        values.put(Esquema.Zona.JUEVES,"Parque Lefevre");
        values.put(Esquema.Zona.VIERNES, "Parque Lefevre");
        values.put(Esquema.Zona.SABADO,"Parque Lefevre");
        values.put(Esquema.Zona.DOMINGO, "Parque Lefevre");

        idRes = db.insert(Esquema.Zona.TABLE_NAME2, null, values );


        values.put(Esquema.Zona.ID, "10");
        values.put(Esquema.Zona.LUNES,"Chanis 1");
        values.put(Esquema.Zona.MARTES, "Chanis 2");
        values.put(Esquema.Zona.MIERCOLES, "Chanis 1");
        values.put(Esquema.Zona.JUEVES,"Chanis 2");
        values.put(Esquema.Zona.VIERNES, "Chanis 1");
        values.put(Esquema.Zona.SABADO,"Chanis 2");
        values.put(Esquema.Zona.DOMINGO, " ");

        idRes = db.insert(Esquema.Zona.TABLE_NAME2, null, values );



        values.put(Esquema.Zona.ID, "11");
        values.put(Esquema.Zona.LUNES,"Rio Abajo 2");
        values.put(Esquema.Zona.MARTES, "Rio Abajo 2");
        values.put(Esquema.Zona.MIERCOLES, "Rio Abajo 2");
        values.put(Esquema.Zona.JUEVES,"Rio Abajo 2");
        values.put(Esquema.Zona.VIERNES, "Rio Abajo 2");
        values.put(Esquema.Zona.SABADO,"Rio Abajo 2");
        values.put(Esquema.Zona.DOMINGO, "Rio Abajo 2");

        idRes = db.insert(Esquema.Zona.TABLE_NAME2, null, values );



        values.put(Esquema.Zona.ID, "12");
        values.put(Esquema.Zona.LUNES,"El Porvenir ");
        values.put(Esquema.Zona.MARTES, "El Porvenir ");
        values.put(Esquema.Zona.MIERCOLES, "El Porvenir ");
        values.put(Esquema.Zona.JUEVES,"El Porvenir ");
        values.put(Esquema.Zona.VIERNES, "El Porvenir ");
        values.put(Esquema.Zona.SABADO,"El Porvenir ");
        values.put(Esquema.Zona.DOMINGO, " ");

        idRes = db.insert(Esquema.Zona.TABLE_NAME2, null, values );



        values.put(Esquema.Zona.ID, "13");
        values.put(Esquema.Zona.LUNES,"Pueblo Nuevo");
        values.put(Esquema.Zona.MARTES, "Pueblo Nuevo");
        values.put(Esquema.Zona.MIERCOLES, "Pueblo Nuevo");
        values.put(Esquema.Zona.JUEVES,"Pueblo Nuevo");
        values.put(Esquema.Zona.VIERNES, "Pueblo Nuevo");
        values.put(Esquema.Zona.SABADO,"Pueblo Nuevo");
        values.put(Esquema.Zona.DOMINGO, " ");

        idRes = db.insert(Esquema.Zona.TABLE_NAME2, null, values );


        values.put(Esquema.Zona.ID, "14");
        values.put(Esquema.Zona.LUNES,"Boca La Caja");
        values.put(Esquema.Zona.MARTES, "Boca La Caja");
        values.put(Esquema.Zona.MIERCOLES, "Boca La Caja");
        values.put(Esquema.Zona.JUEVES,"Boca La Caja");
        values.put(Esquema.Zona.VIERNES, "Boca La Caja");
        values.put(Esquema.Zona.SABADO,"Boca La Caja");
        values.put(Esquema.Zona.DOMINGO, "Boca La Caja");

        idRes = db.insert(Esquema.Zona.TABLE_NAME2, null, values );



        values.put(Esquema.Zona.ID, "15");
        values.put(Esquema.Zona.LUNES," ");
        values.put(Esquema.Zona.MARTES, " ");
        values.put(Esquema.Zona.MIERCOLES, " ");
        values.put(Esquema.Zona.JUEVES," ");
        values.put(Esquema.Zona.VIERNES, " ");
        values.put(Esquema.Zona.SABADO," ");
        values.put(Esquema.Zona.DOMINGO, " ");

        idRes = db.insert(Esquema.Zona.TABLE_NAME2, null, values );
    }

    private void Tabla_C(SQLiteDatabase db) {
        long idRes;
        ContentValues values = new ContentValues();
        values.put(Esquema.Zona.ID, "1");
        values.put(Esquema.Zona.LUNES,"Aeropuerto (Int)");
        values.put(Esquema.Zona.MARTES, "Aeropuerto (Int)");
        values.put(Esquema.Zona.MIERCOLES, "Aeropuerto (Int)");
        values.put(Esquema.Zona.JUEVES,"Aeropuerto (Int)");
        values.put(Esquema.Zona.VIERNES, "Aeropuerto (Int)");
        values.put(Esquema.Zona.SABADO,"Aeropuerto (Int)");
        values.put(Esquema.Zona.DOMINGO, "Aeropuerto (Int)");

        idRes = db.insert(Esquema.Zona.TABLE_NAME3, null, values );


        values.put(Esquema.Zona.ID, "2");
        values.put(Esquema.Zona.LUNES,"24 de Diciembre (Izq)");
        values.put(Esquema.Zona.MARTES, "24 de Diciembre (Izq)");
        values.put(Esquema.Zona.MIERCOLES, "24 de Diciembre (Izq)");
        values.put(Esquema.Zona.JUEVES,"24 de Diciembre (Izq)");
        values.put(Esquema.Zona.VIERNES, "24 de Diciembre (Izq)");
        values.put(Esquema.Zona.SABADO,"24 de Diciembre (Izq)");
        values.put(Esquema.Zona.DOMINGO, "24 de Diciembre (Izq)");

        idRes = db.insert(Esquema.Zona.TABLE_NAME3, null, values );



        values.put(Esquema.Zona.ID, "3");
        values.put(Esquema.Zona.LUNES,"24 de Diciembre (Der)");
        values.put(Esquema.Zona.MARTES, "24 de Diciembre (Der)");
        values.put(Esquema.Zona.MIERCOLES, "24 de Diciembre (Der)");
        values.put(Esquema.Zona.JUEVES,"24 de Diciembre (Der)");
        values.put(Esquema.Zona.VIERNES, "24 de Diciembre (Der)");
        values.put(Esquema.Zona.SABADO,"24 de Diciembre (Der)");
        values.put(Esquema.Zona.DOMINGO, "24 de Diciembre (Der)");

        idRes = db.insert(Esquema.Zona.TABLE_NAME3, null, values );


        values.put(Esquema.Zona.ID, "4");
        values.put(Esquema.Zona.LUNES,"Pacora 1 ");
        values.put(Esquema.Zona.MARTES, "Pacora 1 ");
        values.put(Esquema.Zona.MIERCOLES, "Pacora 1 ");
        values.put(Esquema.Zona.JUEVES,"Pacora 1 ");
        values.put(Esquema.Zona.VIERNES, "Pacora 1 ");
        values.put(Esquema.Zona.SABADO,"Pacora 1 ");
        values.put(Esquema.Zona.DOMINGO, "Pacora 1 ");

        idRes = db.insert(Esquema.Zona.TABLE_NAME3, null, values );


        values.put(Esquema.Zona.ID, "5");
        values.put(Esquema.Zona.LUNES,"Pacora 2 ");
        values.put(Esquema.Zona.MARTES, "Pacora 2 ");
        values.put(Esquema.Zona.MIERCOLES, "Pacora 2 ");
        values.put(Esquema.Zona.JUEVES,"Pacora 2 ");
        values.put(Esquema.Zona.VIERNES, "Pacora 2 ");
        values.put(Esquema.Zona.SABADO,"Pacora 2 ");
        values.put(Esquema.Zona.DOMINGO, "Pacora 2 ");

        idRes = db.insert(Esquema.Zona.TABLE_NAME3, null, values );


        values.put(Esquema.Zona.ID, "6");
        values.put(Esquema.Zona.LUNES,"Morelos 1 ");
        values.put(Esquema.Zona.MARTES, "Morelos 1 ");
        values.put(Esquema.Zona.MIERCOLES, "Morelos 1 ");
        values.put(Esquema.Zona.JUEVES,"Morelos 1 ");
        values.put(Esquema.Zona.VIERNES, "Morelos 1 ");
        values.put(Esquema.Zona.SABADO,"Morelos 1 ");
        values.put(Esquema.Zona.DOMINGO, "Morelos 1 ");

        idRes = db.insert(Esquema.Zona.TABLE_NAME3, null, values );



        values.put(Esquema.Zona.ID, "7");
        values.put(Esquema.Zona.LUNES,"Mañanitas 1 ");
        values.put(Esquema.Zona.MARTES, "Mañanitas 1 ");
        values.put(Esquema.Zona.MIERCOLES, "Mañanitas 1 ");
        values.put(Esquema.Zona.JUEVES,"Mañanitas 1 ");
        values.put(Esquema.Zona.VIERNES, "Mañanitas 1 ");
        values.put(Esquema.Zona.SABADO,"Mañanitas 1 ");
        values.put(Esquema.Zona.DOMINGO, "Mañanitas 1 ");

        idRes = db.insert(Esquema.Zona.TABLE_NAME3, null, values );


        values.put(Esquema.Zona.ID, "8");
        values.put(Esquema.Zona.LUNES,"Mañanitas 2 ");
        values.put(Esquema.Zona.MARTES, "Mañanitas 2 ");
        values.put(Esquema.Zona.MIERCOLES, "Mañanitas 2 ");
        values.put(Esquema.Zona.JUEVES,"Mañanitas 2 ");
        values.put(Esquema.Zona.VIERNES, "Mañanitas 2 ");
        values.put(Esquema.Zona.SABADO,"Mañanitas 2 ");
        values.put(Esquema.Zona.DOMINGO, "Mañanitas 2 ");

        idRes = db.insert(Esquema.Zona.TABLE_NAME3, null, values );



        values.put(Esquema.Zona.ID, "9");
        values.put(Esquema.Zona.LUNES,"Las Garzas 1");
        values.put(Esquema.Zona.MARTES, "Las Garzas 2");
        values.put(Esquema.Zona.MIERCOLES, "Las Garzas 1");
        values.put(Esquema.Zona.JUEVES,"Las Garzas 2");
        values.put(Esquema.Zona.VIERNES, "Las Garzas 1");
        values.put(Esquema.Zona.SABADO,"Las Garzas 2");
        values.put(Esquema.Zona.DOMINGO, " ");

        idRes = db.insert(Esquema.Zona.TABLE_NAME3, null, values );



        values.put(Esquema.Zona.ID, "10");
        values.put(Esquema.Zona.LUNES,"La Siesta (Rural) ");
        values.put(Esquema.Zona.MARTES, "Morelos 2");
        values.put(Esquema.Zona.MIERCOLES, "La Siesta (Rural) ");
        values.put(Esquema.Zona.JUEVES,"Morelos 2");
        values.put(Esquema.Zona.VIERNES, "La Siesta (Rural) ");
        values.put(Esquema.Zona.SABADO,"Morelos 2");
        values.put(Esquema.Zona.DOMINGO, " ");

        idRes = db.insert(Esquema.Zona.TABLE_NAME3, null, values );



        values.put(Esquema.Zona.ID, "11");
        values.put(Esquema.Zona.LUNES,"Belén 1");
        values.put(Esquema.Zona.MARTES, "Belén 2");
        values.put(Esquema.Zona.MIERCOLES, "Belén 1");
        values.put(Esquema.Zona.JUEVES,"Belén 2");
        values.put(Esquema.Zona.VIERNES, "Belén 1");
        values.put(Esquema.Zona.SABADO,"Belén 2");
        values.put(Esquema.Zona.DOMINGO, " ");

        idRes = db.insert(Esquema.Zona.TABLE_NAME3, null, values );


        values.put(Esquema.Zona.ID, "12");
        values.put(Esquema.Zona.LUNES,"Felipillo");
        values.put(Esquema.Zona.MARTES, "San Martín ");
        values.put(Esquema.Zona.MIERCOLES, "Felipillo");
        values.put(Esquema.Zona.JUEVES,"San Martín ");
        values.put(Esquema.Zona.VIERNES, "Felipillo");
        values.put(Esquema.Zona.SABADO,"San Martín ");
        values.put(Esquema.Zona.DOMINGO, " ");

        idRes = db.insert(Esquema.Zona.TABLE_NAME3, null, values );


        values.put(Esquema.Zona.ID, "13");
        values.put(Esquema.Zona.LUNES,"Nueva Esperanza");
        values.put(Esquema.Zona.MARTES, " ");
        values.put(Esquema.Zona.MIERCOLES, "Nueva Esperanza");
        values.put(Esquema.Zona.JUEVES," ");
        values.put(Esquema.Zona.VIERNES, "Nueva Esperanza");
        values.put(Esquema.Zona.SABADO," ");
        values.put(Esquema.Zona.DOMINGO, " ");

        idRes = db.insert(Esquema.Zona.TABLE_NAME3, null, values );


        values.put(Esquema.Zona.ID, "14");
        values.put(Esquema.Zona.LUNES," ");
        values.put(Esquema.Zona.MARTES, " ");
        values.put(Esquema.Zona.MIERCOLES, " ");
        values.put(Esquema.Zona.JUEVES," ");
        values.put(Esquema.Zona.VIERNES, " ");
        values.put(Esquema.Zona.SABADO," ");
        values.put(Esquema.Zona.DOMINGO, " ");

        idRes = db.insert(Esquema.Zona.TABLE_NAME3, null, values );
    }

    private void Tabla_D(SQLiteDatabase db) {
        long idRes;
        ContentValues values = new ContentValues();
        values.put(Esquema.Zona.ID, "1");
        values.put(Esquema.Zona.LUNES,"Chilibre1 (Qda Ancha)");
        values.put(Esquema.Zona.MARTES, "Chilibre1 (Qda Ancha)");
        values.put(Esquema.Zona.MIERCOLES, "Chilibre1 (Qda Ancha)");
        values.put(Esquema.Zona.JUEVES,"Chilibre1 (Qda Ancha)");
        values.put(Esquema.Zona.VIERNES, "Chilibre1 (Qda Ancha)");
        values.put(Esquema.Zona.SABADO,"Chilibre1 (Qda Ancha)");
        values.put(Esquema.Zona.DOMINGO, "Chilibre1 (Qda Ancha)");

        idRes = db.insert(Esquema.Zona.TABLE_NAME4, null, values );


        values.put(Esquema.Zona.ID, "2");
        values.put(Esquema.Zona.LUNES,"Chilibre2 (Chagres)");
        values.put(Esquema.Zona.MARTES, "Chilibre2 (Chagres)");
        values.put(Esquema.Zona.MIERCOLES, "Chilibre2 (Chagres)");
        values.put(Esquema.Zona.JUEVES,"Chilibre2 (Chagres)");
        values.put(Esquema.Zona.VIERNES, "Chilibre2 (Chagres)");
        values.put(Esquema.Zona.SABADO,"Chilibre2 (Chagres)");
        values.put(Esquema.Zona.DOMINGO, "Chilibre2 (Chagres)");

        idRes = db.insert(Esquema.Zona.TABLE_NAME4, null, values );



        values.put(Esquema.Zona.ID, "3");
        values.put(Esquema.Zona.LUNES,"Chilibre3 (Madden)");
        values.put(Esquema.Zona.MARTES, "Chilibre3 (Madden)");
        values.put(Esquema.Zona.MIERCOLES, "Chilibre3 (Madden)");
        values.put(Esquema.Zona.JUEVES,"Chilibre3 (Madden)");
        values.put(Esquema.Zona.VIERNES, "Chilibre3 (Madden)");
        values.put(Esquema.Zona.SABADO,"Chilibre3 (Madden)");
        values.put(Esquema.Zona.DOMINGO, "Chilibre3 (Madden)");

        idRes = db.insert(Esquema.Zona.TABLE_NAME4, null, values );


        values.put(Esquema.Zona.ID, "4");
        values.put(Esquema.Zona.LUNES,"Chilibre4 (Caimitillo)");
        values.put(Esquema.Zona.MARTES, "Chilibre4 (Caimitillo)");
        values.put(Esquema.Zona.MIERCOLES, "Chilibre4 (Caimitillo)");
        values.put(Esquema.Zona.JUEVES,"Chilibre4 (Caimitillo)");
        values.put(Esquema.Zona.VIERNES, "Chilibre4 (Caimitillo)");
        values.put(Esquema.Zona.SABADO,"Chilibre4 (Caimitillo)");
        values.put(Esquema.Zona.DOMINGO, "Chilibre4 (Caimitillo)");

        idRes = db.insert(Esquema.Zona.TABLE_NAME4, null, values );


        values.put(Esquema.Zona.ID, "5");
        values.put(Esquema.Zona.LUNES,"Chilibre5 (San Antonio)");
        values.put(Esquema.Zona.MARTES, "Chilibre5 (San Antonio)");
        values.put(Esquema.Zona.MIERCOLES, "Chilibre5 (San Antonio)");
        values.put(Esquema.Zona.JUEVES,"Chilibre5 (San Antonio)");
        values.put(Esquema.Zona.VIERNES, "Chilibre5 (San Antonio)");
        values.put(Esquema.Zona.SABADO,"Chilibre5 (San Antonio)");
        values.put(Esquema.Zona.DOMINGO, "Chilibre5 (San Antonio)");

        idRes = db.insert(Esquema.Zona.TABLE_NAME4, null, values );


        values.put(Esquema.Zona.ID, "6");
        values.put(Esquema.Zona.LUNES,"Las Lajas 1 (Gonzalillo)");
        values.put(Esquema.Zona.MARTES, "Las Lajas 1 (Gonzalillo)");
        values.put(Esquema.Zona.MIERCOLES, "Las Lajas 1 (Gonzalillo)");
        values.put(Esquema.Zona.JUEVES,"Las Lajas 1 (Gonzalillo)");
        values.put(Esquema.Zona.VIERNES, "Las Lajas 1 (Gonzalillo)");
        values.put(Esquema.Zona.SABADO,"Las Lajas 1 (Gonzalillo)");
        values.put(Esquema.Zona.DOMINGO, "Las Lajas 1 (Gonzalillo)");

        idRes = db.insert(Esquema.Zona.TABLE_NAME4, null, values );


        values.put(Esquema.Zona.ID, "7");
        values.put(Esquema.Zona.LUNES,"La Cabima1(Ma Henriquez)");
        values.put(Esquema.Zona.MARTES, "La Cabima1(Ma Henriquez)");
        values.put(Esquema.Zona.MIERCOLES, "La Cabima1(Ma Henriquez)");
        values.put(Esquema.Zona.JUEVES,"La Cabima1(Ma Henriquez)");
        values.put(Esquema.Zona.VIERNES, "La Cabima1(Ma Henriquez)");
        values.put(Esquema.Zona.SABADO,"La Cabima1(Ma Henriquez)");
        values.put(Esquema.Zona.DOMINGO, "La Cabima1(Ma Henriquez)");

        idRes = db.insert(Esquema.Zona.TABLE_NAME4, null, values );


        values.put(Esquema.Zona.ID, "8");
        values.put(Esquema.Zona.LUNES,"Las Lajas 2 ");
        values.put(Esquema.Zona.MARTES, "Las Lajas 2 ");
        values.put(Esquema.Zona.MIERCOLES, "Las Lajas 2 ");
        values.put(Esquema.Zona.JUEVES,"Las Lajas 2 ");
        values.put(Esquema.Zona.VIERNES, "Las Lajas 2 ");
        values.put(Esquema.Zona.SABADO,"Las Lajas 2 ");
        values.put(Esquema.Zona.DOMINGO, "Las Lajas 2 ");

        idRes = db.insert(Esquema.Zona.TABLE_NAME4, null, values );


        values.put(Esquema.Zona.ID, "9");
        values.put(Esquema.Zona.LUNES,"Villa Grecia1 (Alcalde Díaz)");
        values.put(Esquema.Zona.MARTES, "Villa Grecia1 (Alcalde Díaz)");
        values.put(Esquema.Zona.MIERCOLES, "Villa Grecia1 (Alcalde Díaz)");
        values.put(Esquema.Zona.JUEVES,"Villa Grecia1 (Alcalde Díaz)");
        values.put(Esquema.Zona.VIERNES, "Villa Grecia1 (Alcalde Díaz)");
        values.put(Esquema.Zona.SABADO,"Villa Grecia1 (Alcalde Díaz)");
        values.put(Esquema.Zona.DOMINGO, "Villa Grecia1 (Alcalde Díaz)");

        idRes = db.insert(Esquema.Zona.TABLE_NAME4, null, values );



        values.put(Esquema.Zona.ID, "10");
        values.put(Esquema.Zona.LUNES,"Villa Grecia 2");
        values.put(Esquema.Zona.MARTES, "Villa Grecia 2");
        values.put(Esquema.Zona.MIERCOLES, "Villa Grecia 2");
        values.put(Esquema.Zona.JUEVES,"Villa Grecia 2");
        values.put(Esquema.Zona.VIERNES, "Villa Grecia 2");
        values.put(Esquema.Zona.SABADO,"Villa Grecia 2");
        values.put(Esquema.Zona.DOMINGO, "Villa Grecia 2");

        idRes = db.insert(Esquema.Zona.TABLE_NAME4, null, values );



        values.put(Esquema.Zona.ID, "11");
        values.put(Esquema.Zona.LUNES,"La Cabima 2 ");
        values.put(Esquema.Zona.MARTES, "La Cabima 2 ");
        values.put(Esquema.Zona.MIERCOLES, "La Cabima 2 ");
        values.put(Esquema.Zona.JUEVES,"La Cabima 2 ");
        values.put(Esquema.Zona.VIERNES, "La Cabima 2 ");
        values.put(Esquema.Zona.SABADO,"La Cabima 2 ");
        values.put(Esquema.Zona.DOMINGO, "La Cabima 2 ");

        idRes = db.insert(Esquema.Zona.TABLE_NAME4, null, values );


        values.put(Esquema.Zona.ID, "12");
        values.put(Esquema.Zona.LUNES,"Villa Zaita ");
        values.put(Esquema.Zona.MARTES, "Villa Zaita ");
        values.put(Esquema.Zona.MIERCOLES, "Villa Zaita ");
        values.put(Esquema.Zona.JUEVES,"Villa Zaita ");
        values.put(Esquema.Zona.VIERNES, "Villa Zaita ");
        values.put(Esquema.Zona.SABADO,"Villa Zaita ");
        values.put(Esquema.Zona.DOMINGO, "Villa Zaita ");

        idRes = db.insert(Esquema.Zona.TABLE_NAME4, null, values );


        values.put(Esquema.Zona.ID, "13");
        values.put(Esquema.Zona.LUNES," ");
        values.put(Esquema.Zona.MARTES, " ");
        values.put(Esquema.Zona.MIERCOLES, " ");
        values.put(Esquema.Zona.JUEVES," ");
        values.put(Esquema.Zona.VIERNES, " ");
        values.put(Esquema.Zona.SABADO," ");
        values.put(Esquema.Zona.DOMINGO, " ");

        idRes = db.insert(Esquema.Zona.TABLE_NAME4, null, values );
    }

    private void Tabla_E(SQLiteDatabase db) {
        long idRes;
        ContentValues values = new ContentValues();
        values.put(Esquema.Zona.ID, "1");
        values.put(Esquema.Zona.LUNES,"La Industrial 1");
        values.put(Esquema.Zona.MARTES, "La Industrial 1");
        values.put(Esquema.Zona.MIERCOLES, "La Industrial 1");
        values.put(Esquema.Zona.JUEVES,"La Industrial 1");
        values.put(Esquema.Zona.VIERNES, "La Industrial 1");
        values.put(Esquema.Zona.SABADO,"La Industrial 1");
        values.put(Esquema.Zona.DOMINGO, "La Industrial 1");

        idRes = db.insert(Esquema.Zona.TABLE_NAME5, null, values );


        values.put(Esquema.Zona.ID, "2");
        values.put(Esquema.Zona.LUNES,"La Riviera Pedregal");
        values.put(Esquema.Zona.MARTES, "La Industrial 2");
        values.put(Esquema.Zona.MIERCOLES, "La Riviera Pedregal");
        values.put(Esquema.Zona.JUEVES,"La Industrial 2");
        values.put(Esquema.Zona.VIERNES, "La Riviera Pedregal");
        values.put(Esquema.Zona.SABADO,"La Industrial 2");
        values.put(Esquema.Zona.DOMINGO, "La Riviera Pedregal");

        idRes = db.insert(Esquema.Zona.TABLE_NAME5, null, values );



        values.put(Esquema.Zona.ID, "3");
        values.put(Esquema.Zona.LUNES,"San Pedro 1 ");
        values.put(Esquema.Zona.MARTES, "San Pedro 1 ");
        values.put(Esquema.Zona.MIERCOLES, "San Pedro 1 ");
        values.put(Esquema.Zona.JUEVES,"San Pedro 1 ");
        values.put(Esquema.Zona.VIERNES, "San Pedro 1 ");
        values.put(Esquema.Zona.SABADO,"San Pedro 1 ");
        values.put(Esquema.Zona.DOMINGO, "San Pedro 1 ");

        idRes = db.insert(Esquema.Zona.TABLE_NAME5, null, values );


        values.put(Esquema.Zona.ID, "4");
        values.put(Esquema.Zona.LUNES,"Panasal");
        values.put(Esquema.Zona.MARTES, "San Pedro 2");
        values.put(Esquema.Zona.MIERCOLES, "Panasal");
        values.put(Esquema.Zona.JUEVES,"San Pedro 2");
        values.put(Esquema.Zona.VIERNES, "Panasal");
        values.put(Esquema.Zona.SABADO,"San Pedro 2");
        values.put(Esquema.Zona.DOMINGO, "Panasal");

        idRes = db.insert(Esquema.Zona.TABLE_NAME5, null, values );


        values.put(Esquema.Zona.ID, "5");
        values.put(Esquema.Zona.LUNES,"Jardin Olimpico 1 ");
        values.put(Esquema.Zona.MARTES, "Jardin Olimpico 1 ");
        values.put(Esquema.Zona.MIERCOLES, "Jardin Olimpico 1 ");
        values.put(Esquema.Zona.JUEVES,"Jardin Olimpico 1 ");
        values.put(Esquema.Zona.VIERNES, "Jardin Olimpico 1 ");
        values.put(Esquema.Zona.SABADO,"Jardin Olimpico 1 ");
        values.put(Esquema.Zona.DOMINGO, "Jardin Olimpico 1 ");

        idRes = db.insert(Esquema.Zona.TABLE_NAME5, null, values );


        values.put(Esquema.Zona.ID, "6");
        values.put(Esquema.Zona.LUNES,"San Joaquín 2");
        values.put(Esquema.Zona.MARTES, "Jardin Olimpico 2 ");
        values.put(Esquema.Zona.MIERCOLES, "San Joaquín 2");
        values.put(Esquema.Zona.JUEVES,"Jardin Olimpico 2 ");
        values.put(Esquema.Zona.VIERNES, "San Joaquín 2");
        values.put(Esquema.Zona.SABADO,"Jardin Olimpico 2 ");
        values.put(Esquema.Zona.DOMINGO, "San Joaquín 2");

        idRes = db.insert(Esquema.Zona.TABLE_NAME5, null, values );


        values.put(Esquema.Zona.ID, "7");
        values.put(Esquema.Zona.LUNES,"San Joaquín 1");
        values.put(Esquema.Zona.MARTES, "San Joaquín 1");
        values.put(Esquema.Zona.MIERCOLES, "San Joaquín 1");
        values.put(Esquema.Zona.JUEVES,"San Joaquín 1");
        values.put(Esquema.Zona.VIERNES, "San Joaquín 1");
        values.put(Esquema.Zona.SABADO,"San Joaquín 1");
        values.put(Esquema.Zona.DOMINGO, "San Joaquín 1");

        idRes = db.insert(Esquema.Zona.TABLE_NAME5, null, values );


        values.put(Esquema.Zona.ID, "8");
        values.put(Esquema.Zona.LUNES,"Concepción 1");
        values.put(Esquema.Zona.MARTES, "Concepción 1");
        values.put(Esquema.Zona.MIERCOLES, "Concepción 1");
        values.put(Esquema.Zona.JUEVES,"Concepción 1");
        values.put(Esquema.Zona.VIERNES, "Concepción 1");
        values.put(Esquema.Zona.SABADO,"Concepción 1");
        values.put(Esquema.Zona.DOMINGO, "Concepción 1");

        idRes = db.insert(Esquema.Zona.TABLE_NAME5, null, values );


        values.put(Esquema.Zona.ID, "9");
        values.put(Esquema.Zona.LUNES,"Rana de Oro 1");
        values.put(Esquema.Zona.MARTES, "San Fernando - CT25");
        values.put(Esquema.Zona.MIERCOLES, "Rana de Oro 1");
        values.put(Esquema.Zona.JUEVES,"San Fernando - CT25");
        values.put(Esquema.Zona.VIERNES, "Rana de Oro 1");
        values.put(Esquema.Zona.SABADO,"San Fernando - CT25");
        values.put(Esquema.Zona.DOMINGO, "Rana de Oro 1");

        idRes = db.insert(Esquema.Zona.TABLE_NAME5, null, values );



        values.put(Esquema.Zona.ID, "10");
        values.put(Esquema.Zona.LUNES,"Rana de Oro 2  ");
        values.put(Esquema.Zona.MARTES, "Radial 1 - CT20");
        values.put(Esquema.Zona.MIERCOLES, "Rana de Oro 2  ");
        values.put(Esquema.Zona.JUEVES,"Radial 1 - CT20");
        values.put(Esquema.Zona.VIERNES, "Rana de Oro 2  ");
        values.put(Esquema.Zona.SABADO,"Radial 1 - CT20");
        values.put(Esquema.Zona.DOMINGO, "Rana de Oro 2  ");

        idRes = db.insert(Esquema.Zona.TABLE_NAME5, null, values );



        values.put(Esquema.Zona.ID, "11");
        values.put(Esquema.Zona.LUNES,"Villalobos 1");
        values.put(Esquema.Zona.MARTES, "Radial 2 -CT25");
        values.put(Esquema.Zona.MIERCOLES, "Villalobos 1");
        values.put(Esquema.Zona.JUEVES,"Radial 2 -CT25");
        values.put(Esquema.Zona.VIERNES, "Villalobos 1");
        values.put(Esquema.Zona.SABADO,"Radial 2 -CT25");
        values.put(Esquema.Zona.DOMINGO, "Villalobos 1");

        idRes = db.insert(Esquema.Zona.TABLE_NAME5, null, values );



        values.put(Esquema.Zona.ID, "12");
        values.put(Esquema.Zona.LUNES,"Villalobos 2");
        values.put(Esquema.Zona.MARTES, "Brisas del Norte");
        values.put(Esquema.Zona.MIERCOLES, "Villalobos 2");
        values.put(Esquema.Zona.JUEVES,"Brisas del Norte");
        values.put(Esquema.Zona.VIERNES, "Villalobos 2");
        values.put(Esquema.Zona.SABADO,"Brisas del Norte");
        values.put(Esquema.Zona.DOMINGO, "Villalobos 2");

        idRes = db.insert(Esquema.Zona.TABLE_NAME5, null, values );


        values.put(Esquema.Zona.ID, "13");
        values.put(Esquema.Zona.LUNES," ");
        values.put(Esquema.Zona.MARTES, " ");
        values.put(Esquema.Zona.MIERCOLES, " ");
        values.put(Esquema.Zona.JUEVES," ");
        values.put(Esquema.Zona.VIERNES, " ");
        values.put(Esquema.Zona.SABADO," ");
        values.put(Esquema.Zona.DOMINGO, " ");

        idRes = db.insert(Esquema.Zona.TABLE_NAME5, null, values );

    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
         db.execSQL("DROP TABLE IF EXISTS "+ Esquema.Zona.TABLE_NAME);
         db.execSQL("DROP TABLE IF EXISTS "+ Esquema.Zona.TABLE_NAME2);
         db.execSQL("DROP TABLE IF EXISTS "+ Esquema.Zona.TABLE_NAME3);
         db.execSQL("DROP TABLE IF EXISTS "+ Esquema.Zona.TABLE_NAME4);
         db.execSQL("DROP TABLE IF EXISTS "+ Esquema.Zona.TABLE_NAME5);
         db.execSQL("DROP TABLE IF EXISTS "+ Esquema2.Formulario.TABLE_FORM );

          onCreate(db);

    }
}

