package com.example.dictionary000.DB;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DictionaryDBHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "dictionary.db";
    private static final int DATABASE_VERSION = 2;

    public static final String TABLE_DICT = "dictionary";
    public static final String TABLE_TOPIC = "topic";
    public static final String TABLE_USER = "user";
    public  static  final  String TABLE_QUIZ="quiz";

    public DictionaryDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Tạo bảng
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_TOPIC + " (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "name TEXT NOT NULL)");

        db.execSQL("CREATE TABLE " + TABLE_DICT + " (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "word TEXT NOT NULL," +
                "meaning TEXT NOT NULL," +
                "word_type TEXT," +
                "example TEXT," +
                "topic_id INTEGER," +
                "FOREIGN KEY(topic_id) REFERENCES " + TABLE_TOPIC + "(id))");

        db.execSQL("CREATE TABLE " + TABLE_USER + " (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "name TEXT NOT NULL,"+
                "email TEXT NOT NULL UNIQUE," +
                "password TEXT NOT NULL," +
                "role TEXT DEFAULT 'user')");
        db.execSQL("CREATE TABLE " + TABLE_QUIZ + " (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "question TEXT NOT NULL," +
                "optionA TEXT NOT NULL," +
                "optionB TEXT NOT NULL," +
                "optionC TEXT NOT NULL," +
                "optionD TEXT NOT NULL," +
                "correctAnswer TEXT NOT NULL," +
                "topic_id INTEGER," +
                "FOREIGN KEY(topic_id) REFERENCES topic(id)" +
                ")");
        db.execSQL("INSERT INTO " + TABLE_USER + " (name, email, password, role) VALUES " +
                "('Nguyen Van A', 'a@gmail.com', '123456', 'user')");

        db.execSQL("INSERT INTO " + TABLE_USER + " (name, email, password, role) VALUES " +
                "('Tran Thi B', 'b@gmail.com', '654321', 'user')");

        db.execSQL("INSERT INTO " + TABLE_USER + " (name, email, password, role) VALUES " +
                "('Admin', 'admin@gmail.com', 'admin123', 'admin')");



    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_DICT);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_TOPIC);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_USER);
        onCreate(db);
    }
}


