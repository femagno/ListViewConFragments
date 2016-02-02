package com.amg.wm.project3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.amg.wm.project3.fragments.Fragment_ListView;

public class MainActivity extends AppCompatActivity {
    Fragment_ListView fragmentlv;
    public static final String TAG_TITLE = "objlv";
    public static final String TAG_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState==null){
            fragmentlv = new Fragment_ListView().newInstance();
            getSupportFragmentManager().beginTransaction().add(R.id.flistview, fragmentlv).commit();
        }
    }
}