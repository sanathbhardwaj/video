package com.bugscript.ngo;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static com.bugscript.ngo.Utilities.Constants.MP4_URI;
import static com.bugscript.ngo.Utilities.Constants.MP4_URI_2;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        FloatingActionButton fab = findViewById(R.id.floatingActionButton);
        FloatingActionButton fab2 = findViewById(R.id.floatingActionButton2);

        final String link1 = "http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4";
        final String link2 = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerBlazes.mp4";

//        public static final Uri MP4_URI = Uri.parse("http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4");
//        public static final Uri MP4_URI_2 = Uri.parse("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4");


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toVideoActivity = new Intent(InfoActivity.this, VideoActivity.class).putExtra("name", link1);
                startActivity(toVideoActivity);
            }
        });

        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toVideoActivity = new Intent(InfoActivity.this, VideoActivity.class).putExtra("name", link2);
                startActivity(toVideoActivity);
            }
        });
    }
}
