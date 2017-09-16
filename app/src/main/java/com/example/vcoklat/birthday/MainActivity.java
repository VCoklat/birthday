package com.example.vcoklat.birthday;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp = new MediaPlayer();
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mp = MediaPlayer.create(this, R.raw.happy_birthday);
        mp.start();
        image = (ImageView) findViewById(R.id.imageView);
        new CountDownTimer(7000, 1000) {

            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
                image.setImageResource(R.drawable.isi);
            }
        }.start();
        new CountDownTimer(17000, 1000) {

            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
                image.setImageResource(R.drawable.belakang);
            }
        }.start();
        new CountDownTimer(26000, 1000) {

            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
                mp.stop();
                Intent i = new Intent(MainActivity.this, Menu_utama.class);
                //Change the activity.
                startActivity(i);
            }
        }.start();
    }
}
