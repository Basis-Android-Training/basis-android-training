package com.example.databaseexample2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBOpenHelper extends SQLiteOpenHelper{
	

	public static final String TABLE_STUDENT = "student";
	public static final String COLUMN_ID = "_id";
	public static final String COLUMN_REGNO = "regno";
	public static final String COLUMN_NAME = "name";

	private static final String DATABASE_NAME = "student.db";
	private static final int DATABASE_VERSION = 2;

	private static final String DATABASE_CREATE = "create table "
	      + TABLE_STUDENT + "(" + COLUMN_ID
	      + " integer primary key autoincrement, " + COLUMN_REGNO
	      + " text not null, " + COLUMN_NAME + " text not null);";	
	
	public DBOpenHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase sqLiteDB) {
		sqLiteDB.execSQL(DATABASE_CREATE);
	}

	@Override
	public void onUpgrade(SQLiteDatabase sqLiteDB, int oldVersion, int newVersion) {
		Log.w(DBOpenHelper.class.getName(),
		        "Upgrading database from version " + oldVersion + " to "
		            + newVersion + ", which will destroy all old data");
		sqLiteDB.execSQL("DROP TABLE IF EXISTS " + TABLE_STUDENT);
		    onCreate(sqLiteDB);
		
	}
	

}
