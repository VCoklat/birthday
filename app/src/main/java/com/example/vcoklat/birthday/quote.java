package com.example.vcoklat.birthday;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by vcoklat on 2/21/17.
 */

public class quote extends AppCompatActivity{
    ImageView image;
    MediaPlayer mp = new MediaPlayer();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quote);
        image = (ImageView) findViewById(R.id.feli);
        mp = MediaPlayer.create(this, R.raw.relax);
        mp.start();
        image.setImageResource(R.drawable.feli1);

        new CountDownTimer(8000, 1000) {

            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
                image.setImageResource(R.drawable.feli2);
            }
        }.start();
        new CountDownTimer(15000, 1000) {

            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {

                image.setImageResource(R.drawable.feli3);
            }
        }.start();
        image.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                mp.stop();
                Intent intentkamar2 = new Intent(quote.this,Menu_utama.class);
                startActivity(intentkamar2);
            }
        });
    }
}
