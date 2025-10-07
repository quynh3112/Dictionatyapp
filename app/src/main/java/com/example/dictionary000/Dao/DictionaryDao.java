package com.example.dictionary000.Dao;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.dictionary000.DB.DictionaryDBHelper;

import java.util.ArrayList;
import java.util.List;
public class DictionaryDao {
    private DictionaryDBHelper dbhelper ;
    public static final String TABLE_DICT = "dictionary";
    public static final String TABLE_TOPIC = "topic";
    public static final String TABLE_USER = "user";
    public static final String TABLE_QUIZ = "quiz";

    public DictionaryDao(Context context){
        dbhelper=new DictionaryDBHelper(context);
    }
//     DB cho người dùng

    public void addUseradmin(String email,String password,String role){
        SQLiteDatabase db=dbhelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("email",email);
        values.put("password",password);
        values.put("role",role);
        db.insert(TABLE_USER,null,values);
        db.close();
    }

    public void addClient(String name,String email,String password){
        SQLiteDatabase db=dbhelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("name",name);
        values.put("email",email);
        values.put("password",password);
        db.insert(TABLE_USER,null,values);
        db.close();
    }
    public boolean checkLogin(String email, String password) {
        SQLiteDatabase db = dbhelper.getReadableDatabase();
        Cursor cursor = db.rawQuery(
                "SELECT * FROM " + TABLE_USER + " WHERE lower(email)=? AND password=?",
                new String[]{email.trim().toLowerCase(), password.trim()}
        );
        boolean result = cursor.moveToFirst();
        cursor.close();
        db.close();
        return result;
    }


// Thêm chủ đề

    public void addTopic(String name){
        SQLiteDatabase db =dbhelper.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put("name",name);
        db.insert(TABLE_TOPIC,null,values);
        db.close();

    }
    public int updateTopic(int id,String newName){
        SQLiteDatabase db=dbhelper.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put("name",newName);
       int row=db.update(TABLE_TOPIC,values,"id=?",new String[]{String.valueOf(id)});
       return  row;

    }

    public String getUserRole(String email) {
        SQLiteDatabase db = dbhelper.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT role FROM " + TABLE_USER + " WHERE email=?",
                new String[]{email});
        String role = null;
        if (cursor.moveToFirst()) {
            role = cursor.getString(0);
        }
        cursor.close();
        db.close();
        return role;
    }


    public int deleteTopic(int id){
        SQLiteDatabase db =dbhelper.getWritableDatabase();
        int row= db.delete(TABLE_TOPIC,"id=?",new String[]{String.valueOf(id)});
        db.close();
        return  row;
    }
    public List<String> getAllTopics() {
        List<String> topics = new ArrayList<>();
        SQLiteDatabase db = dbhelper.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_TOPIC, null);
        if (cursor.moveToFirst()) {
            do {
                topics.add(cursor.getString(cursor.getColumnIndexOrThrow("name")));
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return topics;
    }



    //Từ vựng
    public void addWord(String word, String meaning,String type,String example,int topicId){
        SQLiteDatabase db=dbhelper.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put("word",word);
        values.put("meaning",meaning);
        values.put("word_type",type);
        values.put("example",example);
        values.put("topic_id",topicId);
        db.insert(TABLE_DICT,null,values);
        db.close();

    }
    public int updateWord(int id,String word, String meaning,String type,String example,int topicId){
        SQLiteDatabase db=dbhelper.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put("word", word);
        values.put("meaning", meaning);
        values.put("word_type", type);
        values.put("example", example);
        values.put("topic_id", topicId);
        int row=db.update(TABLE_DICT, values, "id=?", new String[]{String.valueOf(id)});
        return  row;
    }

    public  int deleteWord(int id){
        SQLiteDatabase db=dbhelper.getWritableDatabase();
        int row= db.delete(TABLE_DICT,"id=?",new String[]{String.valueOf(id)});
        return  row;
    }

    public Cursor getWordsByTopic(int topicId){
        SQLiteDatabase db=dbhelper.getReadableDatabase();
        return db.rawQuery("SELECT * FROM "+ TABLE_DICT+ " WHERE topic_id=?",
                new String[]{String.valueOf(topicId)}
        );
    }


    public Cursor searchWord(String keyword){
        SQLiteDatabase db=dbhelper.getReadableDatabase();
        return db.rawQuery("SELECT * FROM " + TABLE_DICT + " WHERE word LIKE ?",
                new String[]{"%" + keyword + "%"});
    }


}
