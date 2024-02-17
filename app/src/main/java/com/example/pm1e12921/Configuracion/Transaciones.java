package com.example.pm1e12921.Configuracion;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.ByteArrayOutputStream;

public class Transaciones {

    // Nombre de la base de datos
    public static final String DBName = "PM1E12921";

    // Creación de la tabla en la base de datos
    public static final String Tablepersonas = "personas";

    // Creación de los campos de la base de datos
    public static final String id = "id";
    public static final String pais = "pais";
    public static final String nombre = "nombre";
    public static final String telefono = "telefono";
    public static final String nota = "nota";
    public static final String foto = "foto";

    // DDL CREATE
    public static final String CreateTablePersonas = "CREATE TABLE " + Tablepersonas + "(" +
            " id  INTEGER PRIMARY KEY AUTOINCREMENT ,  pais  TEXT, nombre  TEXT,  telefono  INTEGER, nota TEXT, " +
            "foto BLOB)";

    // DDL DROP
    public static final String DropTablePersonas = "DROP TABLE IF EXISTS " + Tablepersonas;

    // DML
    public static final String SelectAllPersonas = "SELECT * FROM " + Tablepersonas;

    // Método para convertir Bitmap a byte[]
    public static byte[] bitmapToBytes(Bitmap bitmap) {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);
        return stream.toByteArray();
    }

    // Método para convertir byte[] a Bitmap
    public static Bitmap bytesToBitmap(byte[] byteArray) {
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
    }
}