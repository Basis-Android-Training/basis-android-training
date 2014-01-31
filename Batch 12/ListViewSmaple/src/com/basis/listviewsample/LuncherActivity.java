
package com.basis.listviewsample;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class LuncherActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luncher);
        // gotoSimpleList(this);
        // gotoSimpleListActivity(this);
        gotoCustomAdapterActivity(this);
    }

    private void gotoSimpleList(Context context) {
        Intent intent = new Intent(context, SimpleList.class);
        startActivity(intent);
    }

    private void gotoSimpleListActivity(Context context) {
        Intent intent = new Intent(context, SimpleListActivity.class);
        startActivity(intent);
    }

    private void gotoCustomAdapterActivity(Context context) {
        Intent intent = new Intent(context, CustomAdapterListActivity.class);
        startActivity(intent);
    }

    private void gotoCompaoundAdapterActivity(Context context) {
        Intent intent = new Intent(context, SimpleListActivity.class);
        startActivity(intent);
    }

}
