package com.example.user.estimasi.database;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.widget.PagerSnapHelper;
import android.util.Log;

import com.example.user.estimasi.Login2Activity;
import com.example.user.estimasi.RegisterActivity;

public class EstimasiDB extends SQLiteOpenHelper {
    //==============================================================================================
    private static final String DATABASE_NAME = "estimasi.db";
    private static final int DATABASE_VERSION = 1;
    //==============================================================================================

    private static final String TABLE_NAME_USER = "user";
    private static final String ID = "ID";
    private static final String USER_NAME = "USER_NAME";
    private static final String NAME = "NAME";
    private static final String EMAIL = "EMAIL";
    private static final String PASSWORD = "PASSWORD";

    private static final String TABLE_NAME_ESTIMASI = "ESTIMASI";
    private static final String tg_trx = "tg_trx";
    private static final String no_customer = "no_customer";
    private static final String nama_customer = "nama_customer";
    private static final String sts_ser = "sts_ser";
    private static final String ls_tnh = "ls_tnh";
    private static final String njop = "njop";
    private static final String tg_tbt = "tg_tbt";
    private static final String sts_imb = "sts_imb";
    private static final String harga = "harga";
    private static final String pjk_pjl = "pjk_pjl";
    private static final String pjk_pbl = "pjk_pbl";
    private static final String ajb = "ajb";
    private static final String bn = "bn";
    private static final String cek = "cek";
    private static final String floating = "floating";
    private static final String zona = "zona";
    private static final String validasi = "validasi";
    private static final String pnbp = "pnbp";
    private static final String tg_sosio = "tg_sosio";
    private static final String hs_sosio = "hs_sosio";

    public EstimasiDB(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
            String sqlUser = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME_USER + " (" + ID + "TEXT, " + USER_NAME + "TEXT, "
                    + NAME + "TEXT, " + EMAIL + "TEXT, " + PASSWORD + "TEXT)";
            db.execSQL(sqlUser);

            String sqlEstimasi = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME_ESTIMASI + " (" + tg_trx + "TEXT, " + no_customer + "TEXT, "
                    + nama_customer + "TEXT, " + sts_ser + "TEXT, " + ls_tnh + "TEXT, " + njop + "TEXT, " + tg_tbt + "TEXT, "
                    + sts_imb + "TEXT, " + harga + "TEXT, " + pjk_pjl + "TEXT, " + pjk_pbl + "TEXT, " + ajb + "TEXT, " +
                    bn + "TEXT, " + cek + "TEXT, " + floating + "TEXT, " + zona + "TEXT, " + validasi + "TEXT, " + pnbp + "TEXT, " +
                    tg_sosio + "TEXT, " + hs_sosio + "TEXT);";
            db.execSQL(sqlEstimasi);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME_USER);
        onCreate(db);

    }

    public void dropTable() {
        try {
            SQLiteDatabase database = getWritableDatabase();
            String updateQuery = "DROP TABLE IF EXISTS " + TABLE_NAME_USER;
            database.execSQL(updateQuery);
            database.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void insertUser(String id, String username, String nama, String emal, String passwor) {
        try {
            SQLiteDatabase db = getWritableDatabase();
            String sql = "INSERT INTO " + TABLE_NAME_USER + " (" + ID + ", " + USER_NAME + ", "+NAME+", "+EMAIL+", "+ PASSWORD+") VALUES ('"
                    + id + "', '" + username + "', '" + nama + "', '"+emal+"', '"+passwor+"');";
            db.execSQL(sql);
            RegisterActivity.registerSukses = true;
        } catch (Exception exp) {
            exp.printStackTrace();
            RegisterActivity.registerSukses = false;
        }
    }
    @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
    public void cekUser(String username) {
        SQLiteDatabase db = getWritableDatabase();
        @SuppressLint("Recycle")
        Cursor cursor = db.rawQuery("SELECT " + USER_NAME +" FROM " + TABLE_NAME_USER +
                " WHERE " + USER_NAME + "='" + username + "'", null);
        if (cursor.moveToFirst()) {
            do {
                RegisterActivity.isRegistered = cursor.getString(0) != null && username.equals(cursor.getString(0));
            } while (cursor.moveToNext());
        }
        db.close();
    }
    @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
    public void login(String username, String password) {
        SQLiteDatabase db = getWritableDatabase();
        @SuppressLint("Recycle")
        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_NAME_USER +
                " WHERE " + USER_NAME + "='" + username + "' AND "+PASSWORD+" = '"+password+"'", null);
        if (cursor.moveToFirst()) {
            do {
                Login2Activity.isTerdaftar = cursor.getString(1) != null && username.equals(cursor.getString(1));
                Login2Activity.username = cursor.getString(1);
                Login2Activity.nama = cursor.getString(0);
                Login2Activity.email = cursor.getString(3);
                Login2Activity.password = cursor.getString(4);
            } while (cursor.moveToNext());
        }
        db.close();
    }
}
