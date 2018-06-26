package ds6.dpc.fisc.utp.arus.BaseDatos;

import android.provider.BaseColumns;


/**
 * Esquema de la base de datos para Tabla Zonas
 */

public  class Esquema {

   public static abstract class Zona implements BaseColumns {
         // ZONA A
       public static final int DATABASE_VERSION = 1;
       public static final String DATABASE_NAME = "ARUS_JIC.db";
       public static final String TABLE_NAME = "Horario_Zonas";
       public static final String ID = "id";
       public static final String LUNES = "lunes";
       public static final String MARTES = "martes";
       public static final String MIERCOLES = "miercoles";
       public static final String JUEVES = "jueves";
       public static final String VIERNES = "viernes";
       public static final String SABADO = "sabado";
       public static final String DOMINGO = "domingo";



       public static final String CREAR_TABLA = " CREATE TABLE  "
               + Zona.TABLE_NAME
               + "(" + Zona.ID + " INTEGER PRIMARY KEY AUTOINCREMENT ,"
               + Zona.LUNES + " TEXT NULL,"
               + Zona.MARTES + " TEXT NULL,"
               + Zona.MIERCOLES + " TEXT NULL,"
               + Zona.JUEVES + " TEXT NULL,"
               + Zona.VIERNES + " TEXT NULL,"
               + Zona.SABADO + " TEXT NULL,"
               + Zona.DOMINGO + " TEXT NULL); ";


       // ZONA B
       public static final String TABLE_NAME2 = "Horario_Zonas2";

       public static final String CREAR_TABLA2 = " CREATE TABLE  "
               + Zona.TABLE_NAME2
               + "(" + Zona.ID + " INTEGER PRIMARY KEY AUTOINCREMENT ,"
               + Zona.LUNES + " TEXT NULL,"
               + Zona.MARTES + " TEXT NULL,"
               + Zona.MIERCOLES + " TEXT NULL,"
               + Zona.JUEVES + " TEXT NULL,"
               + Zona.VIERNES + " TEXT NULL,"
               + Zona.SABADO  + " TEXT NULL,"
               + Zona.DOMINGO + " TEXT NULL); ";

       // ZONA C
       public static final String TABLE_NAME3 = "Horario_Zonas3";

       public static final String CREAR_TABLA3 = " CREATE TABLE  "
               + Zona.TABLE_NAME3
               + "(" + Zona.ID + " INTEGER PRIMARY KEY AUTOINCREMENT ,"
               + Zona.LUNES + " TEXT NULL,"
               + Zona.MARTES + " TEXT NULL,"
               + Zona.MIERCOLES + " TEXT NULL,"
               + Zona.JUEVES + " TEXT NULL,"
               + Zona.VIERNES + " TEXT NULL,"
               + Zona.SABADO + " TEXT NULL,"
               + Zona.DOMINGO + " TEXT NULL); ";



       // ZONA D
       public static final String TABLE_NAME4 = "Horario_Zonas4";

       public static final String CREAR_TABLA4 = " CREATE TABLE  "
               + Zona.TABLE_NAME4
               + "(" + Zona.ID + " INTEGER PRIMARY KEY AUTOINCREMENT ,"
               + Zona.LUNES + " TEXT NULL,"
               + Zona.MARTES + " TEXT NULL,"
               + Zona.MIERCOLES + " TEXT NULL,"
               + Zona.JUEVES + " TEXT NULL,"
               + Zona.VIERNES + " TEXT NULL,"
               + Zona.SABADO + " TEXT NULL,"
               + Zona.DOMINGO + " TEXT NULL); ";


       // ZONA D
       public static final String TABLE_NAME5 = "Horario_Zonas5";

       public static final String CREAR_TABLA5 = " CREATE TABLE  "
               + Zona.TABLE_NAME5
               + "(" + Zona.ID + " INTEGER PRIMARY KEY AUTOINCREMENT ,"
               + Zona.LUNES + " TEXT NULL,"
               + Zona.MARTES + " TEXT NULL,"
               + Zona.MIERCOLES + " TEXT NULL,"
               + Zona.JUEVES + " TEXT NULL,"
               + Zona.VIERNES + " TEXT NULL,"
               + Zona.SABADO + " TEXT NULL,"
               + Zona.DOMINGO + " TEXT NULL); ";


   }


}
