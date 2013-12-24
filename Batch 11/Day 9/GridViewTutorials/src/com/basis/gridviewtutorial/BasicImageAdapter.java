package com.basis.gridviewtutorial;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.basis.gridviewtutorial.entity.PictureDetail;
import com.basis.gridviewtutorial.util.ImageUtils;

public class BasicImageAdapter extends ArrayAdapter<PictureDetail> {

    private Context context;
    private ArrayList<PictureDetail> pictureHolders;

    public BasicImageAdapter(Context context, int resource,
            List<PictureDetail> pictureHolders) {
        super(context, resource, pictureHolders);
        this.context = context;
        this.pictureHolders = (ArrayList<PictureDetail>) pictureHolders;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowItem = inflater.inflate(R.layout.custom_adapter_grid_view_row_item, null);
        // set value into textview
        TextView textView = (TextView) rowItem
                .findViewById(R.id.grid_item_label);
        textView.setText(pictureHolders.get(position).getPictureName());

        // set image based on selected text
        ImageView imageView = (ImageView) rowItem
                .findViewById(R.id.grid_item_image);

        imageView.setImageBitmap(ImageUtils.decodeSampledBitmapFromResource(
                this.context.getResources(), pictureHolders.get(position).getPictureResourceId(),
                100, 100));

        return rowItem;
    }

    @Override
    public int getCount() {
        return pictureHolders.size();
    }

    @Override
    public PictureDetail getItem(int position) {

        return pictureHolders.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

}