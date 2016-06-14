package k.piyamon.pbrurun;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by lap324-06 on 6/14/2016 AD.
 */
public class MyOpenHelper extends SQLiteOpenHelper{

    //Explicit
    public static final String database_name = "pbru_run.db";
    private static final int database_version = 1;
    private static final String create_user_table = "create table userTABLE(" +
            "_id integer primary key," +
            "Name text," +
            "User text," +
            "Password text," +
            "Avata text," +
            "Gold text);";


    public MyOpenHelper(Context context) {
        super(context,database_name,null,database_version);
    } // Constructor  เชื่อมต่อฐานข้อมูล

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(create_user_table);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
} // Main Class
