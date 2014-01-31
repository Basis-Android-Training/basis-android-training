
package com.basis.listviewsample.adapter;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.basis.listviewsample.R;
import com.basis.listviewsample.entiity.Student;

public class SimpleArrayAdapter extends ArrayAdapter<Student> {
    ArrayList<Student> studentDataHolder;
    Context adapterContext;

    public SimpleArrayAdapter(Context context, int resource, ArrayList<Student> students) {
        super(context, resource, students);
        studentDataHolder = students;
        adapterContext = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) adapterContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.custome_adapter_list_row_item, parent, false);

        TextView lblStudentName = (TextView) rowView.findViewById(R.id.lblStudentName);
        TextView lblStudentAge = (TextView) rowView.findViewById(R.id.lblStudentAge);

        Student student = studentDataHolder.get(position);

        if (student != null) {
            lblStudentName.setText(student.getName());
            lblStudentAge.setText("Age : " + student.getAge());
        }
        return rowView;
    }
}
