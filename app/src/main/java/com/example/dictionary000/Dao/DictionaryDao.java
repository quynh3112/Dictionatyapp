package com.example.dictionary000.Dao;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.dictionary000.DB.DictionaryDBHelper;
import com.example.dictionary000.Class.Topic;
import com.example.dictionary000.Class.Word;

import java.util.ArrayList;
import java.util.List;
public class DictionaryDao {
    private DictionaryDBHelper dbhelper;
    public static final String TABLE_DICT = "dictionary";
    public static final String TABLE_TOPIC = "topic";
    public static final String TABLE_USER = "user";

    public DictionaryDao(Context context){
        dbhelper=new DictionaryDBHelper(context);
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




    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        SQLiteDatabase db = dbhelper.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_TOPIC +" Order by name asc" , null);

        if (cursor.moveToFirst()) {
            do {
                int id = cursor.getInt(cursor.getColumnIndexOrThrow("id"));
                String name = cursor.getString(cursor.getColumnIndexOrThrow("name"));
                topics.add(new Topic(id, name));
            } while (cursor.moveToNext());
        }

        cursor.close();
        db.close();
        return topics;
    }
    public boolean checkLogin(String email,String pass){
        SQLiteDatabase db=dbhelper.getReadableDatabase();
        Cursor cursor=db.rawQuery("Select 1 from user Where email= ? and password= ? ",
                new String[]{email.trim(),pass.trim()});
        boolean result = false;
        if(cursor != null) {
            if(cursor.getCount() > 0){
                result = true;
            }
            cursor.close();
        }

        db.close();
        return result;
    }




    public List<Word> Search(String key){
        SQLiteDatabase db=dbhelper.getReadableDatabase();
        Cursor cursor;
        List<Word> words=new ArrayList<>();
        if(key.isEmpty()){
             cursor=db.rawQuery("Select * from "+ TABLE_DICT,null);

        }
        else {
            cursor = db.rawQuery(
                    "SELECT * FROM " + TABLE_DICT +
                            " WHERE word LIKE ? COLLATE NOCASE OR meaning LIKE ? COLLATE NOCASE",
                    new String[]{"%" + key + "%", "%" + key + "%"}
            );
        }
        if (cursor.moveToFirst()){
            do{
                int id=cursor.getInt(cursor.getColumnIndexOrThrow("id"));
                String word=cursor.getString(cursor.getColumnIndexOrThrow("word"));
                String meaning=cursor.getString(cursor.getColumnIndexOrThrow("meaning"));
                String type=cursor.getString(cursor.getColumnIndexOrThrow("word_type"));
                int topic_id=cursor.getInt(cursor.getColumnIndexOrThrow("topic_id"));
                words.add(new Word(id,word,meaning,type,topic_id));
            }while (cursor.moveToNext());

        }
        cursor.close();
        db.close();
        return words;
    }
    public List<Word> getWordsByTopic(int topicID){
        List <Word> words=new ArrayList<>();
        SQLiteDatabase db=dbhelper.getReadableDatabase();
        Cursor cursor=db.rawQuery(
                "Select * from "+ TABLE_DICT + " Where topic_id = ? ",
                new String[]{String.valueOf(topicID)}

        );
        if(cursor.moveToFirst()){
            do{
                int id=cursor.getInt(cursor.getColumnIndexOrThrow("id"));
                String word=cursor.getString(cursor.getColumnIndexOrThrow("word"));
                String meaning=cursor.getString(cursor.getColumnIndexOrThrow("meaning"));
                String word_type=cursor.getString(cursor.getColumnIndexOrThrow("word_type"));
                words.add(new Word(id,word,meaning,word_type,topicID));
            }
            while ( cursor.moveToNext());

        }
        cursor.close();
        db.close();
        return  words;
    }
    public List<Word> getAllWords() {
        List<Word> words = new ArrayList<>();
        SQLiteDatabase db = dbhelper.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_DICT, null);

        if (cursor.moveToFirst()) {
            do {
                int id = cursor.getInt(cursor.getColumnIndexOrThrow("id"));
                String word = cursor.getString(cursor.getColumnIndexOrThrow("word"));
                String meaning = cursor.getString(cursor.getColumnIndexOrThrow("meaning"));
                String word_type = cursor.getString(cursor.getColumnIndexOrThrow("word_type"));
                int topic_id = cursor.getInt(cursor.getColumnIndexOrThrow("topic_id"));

                words.add(new Word(id, word, meaning, word_type, topic_id));
            } while (cursor.moveToNext());
        }

        cursor.close();
        db.close();
        return words;
    }



}
