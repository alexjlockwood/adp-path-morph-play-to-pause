package com.alexjlockwood.example.playpauseanimation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    final CheckableFloatingActionButton fab =
        (CheckableFloatingActionButton) findViewById(R.id.checkable_fab);
    fab.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        fab.toggle();
      }
    });
    final PlayPauseView ppv = (PlayPauseView) findViewById(R.id.play_pause_view);
    ppv.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        ppv.toggle();
      }
    });
  }
}
