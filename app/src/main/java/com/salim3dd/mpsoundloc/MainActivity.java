package com.salim3dd.mpsoundloc;
/**
 * Created by Salim3DD on 27/12/2016.
 */
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new CountDownTimer(2000, 1000) {
            @Override
            public void onTick(long l) {

            }
            @Override
            public void onFinish() {
                gotoSoundactivity();
            }
        }.start();
    }

    public void gotoSoundactivity() {
      startActivity(new Intent(MainActivity.this, SoundActivity.class));

    }
}
