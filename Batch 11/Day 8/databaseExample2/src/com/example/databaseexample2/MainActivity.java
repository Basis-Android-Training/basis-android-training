package com.example.databaseexample2;

import java.util.ArrayList;
import java.util.List;

import com.example.databaseexample2.R;
import com.example.databaseexample2.Student;
import com.example.databaseexample2.StudentGateway;

import android.os.Bundle;
import android.app.ListActivity;
import android.support.v4.widget.SimpleCursorAdapter;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;

public class MainActivity extends ListActivity {

	StudentGateway gateway = new StudentGateway(this);
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		updateListView();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void saveButton_Clicked(View view)
	{
		EditText nameEditText = (EditText) findViewById(R.id.nameEditText);
		EditText regNoEditText = (EditText) findViewById(R.id.regNoEditText);
		Student aStudent = new Student(nameEditText.getText().toString(), regNoEditText.getText().toString());
		gateway.save(aStudent);
		updateListView();
	}	
	
	public void deleteButton_Clicked(View view)
	{
		if (getListAdapter().getCount() > 0) {
	        Student aStudent = (Student) getListAdapter().getItem(0);
	        gateway.delete(aStudent);
	        updateListView();
	      }		
	}
	
	private void updateListView()
	{
	    List<Student> students = gateway.getAll();
	    ArrayAdapter<Student> adapter = new ArrayAdapter<Student>(this,
	        android.R.layout.simple_list_item_1, students);
	    setListAdapter(adapter);		
	}
}
