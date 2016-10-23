package com.alexjlockwood.example.playpauseanimation;

import android.os.Build;
import android.os.Bundle;
import android.support.graphics.drawable.AnimatedVectorDrawableCompat;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    final CheckableImageButton fab =
        (CheckableImageButton) findViewById(R.id.checkable_fab);
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
      fab.setImageDrawable(getDrawable(R.drawable.asl_play_pause));
    } else {
      final AnimatedVectorDrawableCompat pauseToPlay =
          AnimatedVectorDrawableCompat.create(this, R.drawable.avd_pause_to_play);
      final AnimatedVectorDrawableCompat playToPause =
          AnimatedVectorDrawableCompat.create(this, R.drawable.avd_play_to_pause);
      fab.setImageDrawable(playToPause);
      fab.setOnClickListener(view -> {
        final AnimatedVectorDrawableCompat avd = fab.isChecked() ? pauseToPlay : playToPause;
        fab.setImageDrawable(avd);
        avd.start();
      });
    }
  }
}
