
package com.basis.gridviewtutorial;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import com.basis.gridviewtutorial.entity.PictureDetail;

public class CustomAdapterGridView extends Activity {
    GridView grdShakibsPictureGalarrey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_adapter_grid);
        initializeContorls();
        registerEvents();
        loadGridView();
    }

    private void initializeContorls() {
        grdShakibsPictureGalarrey = (GridView) findViewById(R.id.grdShakibsPictures);

    }

    private void registerEvents() {
        grdShakibsPictureGalarrey.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                    int position, long id) {
                Toast.makeText(getApplicationContext(),
                        "Item clicked ", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private ArrayAdapter<PictureDetail> prepareGirdData() {

        ArrayList<PictureDetail> pictureHolders = new ArrayList<PictureDetail>();

        PictureDetail pd1 = new PictureDetail("Shakib 1 ", R.drawable.s1);
        pictureHolders.add(pd1);
        PictureDetail pd2 = new PictureDetail("Shakib 2 ", R.drawable.s2);
        pictureHolders.add(pd2);
        PictureDetail pd3 = new PictureDetail("Shakib 3 ", R.drawable.s3);
        pictureHolders.add(pd3);
        PictureDetail pd4 = new PictureDetail("Shakib 4 ", R.drawable.s4);
        pictureHolders.add(pd4);
        PictureDetail pd5 = new PictureDetail("Shakib 5 ", R.drawable.s5);
        pictureHolders.add(pd5);
        PictureDetail pd6 = new PictureDetail("Shakib 6 ", R.drawable.s6);
        pictureHolders.add(pd6);
        PictureDetail pd7 = new PictureDetail("Shakib 7 ", R.drawable.s7);
        pictureHolders.add(pd7);
        PictureDetail pd8 = new PictureDetail("Shakib8 ", R.drawable.s8);
        pictureHolders.add(pd8);
        PictureDetail pd9 = new PictureDetail("Shakib 9 ", R.drawable.s9);
        pictureHolders.add(pd9);
        PictureDetail pd10 = new PictureDetail("Shakib 10 ", R.drawable.s10);
        pictureHolders.add(pd10);
        PictureDetail pd11 = new PictureDetail("Shakib 11 ", R.drawable.s11);
        pictureHolders.add(pd11);
        PictureDetail pd12 = new PictureDetail("Shakib 12 ", R.drawable.s12);
        pictureHolders.add(pd12);
        PictureDetail pd13 = new PictureDetail("Shakib 13 ", R.drawable.s13);
        pictureHolders.add(pd13);
        PictureDetail pd14 = new PictureDetail("Shakib 14 ", R.drawable.s14);
        pictureHolders.add(pd14);
        PictureDetail pd15 = new PictureDetail("Shakib 15 ", R.drawable.s15);
        pictureHolders.add(pd15);
        PictureDetail pd16 = new PictureDetail("Shakib 16 ", R.drawable.s16);
        pictureHolders.add(pd16);
        PictureDetail pd17 = new PictureDetail("Shakib 16 ", R.drawable.s17);
        pictureHolders.add(pd17);

        return new BasicImageAdapter(this, android.R.layout.simple_list_item_1, pictureHolders);

    }

    private void loadGridView() {

        grdShakibsPictureGalarrey.setAdapter(prepareGirdData());
    }


}
