package com.example.databaseexample2;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class StudentGateway {
	
	private SQLiteDatabase sqLiteDB;
	private DBOpenHelper dbOpenHelper;
	long insertId;
	String[] allColumns = { DBOpenHelper.COLUMN_ID,
			DBOpenHelper.COLUMN_NAME, DBOpenHelper.COLUMN_REGNO };				

	public StudentGateway(Context context)
	{
		dbOpenHelper = new DBOpenHelper(context);
	}
	
	public List<Student> getAll()
	{
		open();
		List<Student> students = new ArrayList<Student>();
	    Cursor cursor = sqLiteDB.query(DBOpenHelper.TABLE_STUDENT,
	        allColumns, null, null, null, null, null);
	    cursor.moveToFirst();
	    while (!cursor.isAfterLast()) {
	    	Student aStudent = new Student(cursor.getLong(0),cursor.getString(1),cursor.getString(2));
	      students.add(aStudent);
	      cursor.moveToNext();
	    }
	    cursor.close();
	    return students;		
	}
	
	public void open() throws SQLException
	{
		sqLiteDB = dbOpenHelper.getWritableDatabase();
	}
	
	public void close()
	{
		sqLiteDB.close();
	}
	
	
	public void delete(Student aStudent)
	{
		open();
		sqLiteDB.delete(DBOpenHelper.TABLE_STUDENT, DBOpenHelper.COLUMN_ID
		        + " = " + aStudent.getId(), null);
		close();
	}
	
	public Student save(Student aStudent)
	{
		ContentValues contentValues = new ContentValues();
		contentValues.put(DBOpenHelper.COLUMN_NAME, aStudent.getName());
		contentValues.put(DBOpenHelper.COLUMN_REGNO, aStudent.getRegNo());
		open();
		insertId = sqLiteDB.insert(DBOpenHelper.TABLE_STUDENT, null, contentValues);
		close();
		return get(insertId);
	
	}
	
	
	
	
	public Student get(long id)
	{
		open();
		Cursor cursor = sqLiteDB.query(DBOpenHelper.TABLE_STUDENT,
		        allColumns, DBOpenHelper.COLUMN_ID + " = " + insertId, null,
		        null, null, null);
		cursor.moveToFirst();
		Student newStudent = new Student(cursor.getLong(0),cursor.getString(1),cursor.getString(2));
		cursor.close();
		    return newStudent;
		    
	}
}
