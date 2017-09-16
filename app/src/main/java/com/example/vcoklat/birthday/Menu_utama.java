package com.example.vcoklat.birthday;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by vcoklat on 2/21/17.
 */

public class Menu_utama extends AppCompatActivity{
    Button btnvideo,btnyoutube, btnquote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        btnquote =(Button) findViewById(R.id.quote);
        btnvideo =(Button) findViewById(R.id.video);
        btnyoutube =(Button) findViewById(R.id.youtube);

        btnvideo.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent intentkamar2 = new Intent(Menu_utama.this,video.class);
                // intentkamar2.putExtra(EXTRA_ADDRESS, address); //this will be received at ledControl (class) Activity
                startActivity(intentkamar2);

            }
        });
        btnyoutube.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=6QhwWghC9Ec")));
                // intentkamar2.putExtra(EXTRA_ADDRESS, address); //this will be received at ledControl (class) Activity

            }
        });
        btnquote.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent intentkamar2 = new Intent(Menu_utama.this,quote.class);
                // intentkamar2.putExtra(EXTRA_ADDRESS, address); //this will be received at ledControl (class) Activity
                startActivity(intentkamar2);

            }
        });
    }

}
