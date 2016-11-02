package com.alexjlockwood.example.morph;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    findViewById(R.id.playpausestop).setOnClickListener(this);
    findViewById(R.id.digits).setOnClickListener(this);
    findViewById(R.id.search).setOnClickListener(this);
    findViewById(R.id.airplane).setOnClickListener(this);
    findViewById(R.id.heart).setOnClickListener(this);
    findViewById(R.id.fingerprint).setOnClickListener(this);
  }

  @Override
  public void onClick(View view) {
    if (view.getId() == R.id.playpausestop) {
      startActivity(new Intent(this, PlayPauseStopActivity.class));
    } else if (view.getId() == R.id.digits) {
      startActivity(new Intent(this, DigitsActivity.class));
    } else if (view.getId() == R.id.search) {
      startActivity(new Intent(this, SearchActivity.class));
    } else if (view.getId() == R.id.airplane) {
      startActivity(new Intent(this, AirplaneActivity.class));
    } else if (view.getId() == R.id.heart) {
      startActivity(new Intent(this, HeartActivity.class));
    } else if (view.getId() == R.id.fingerprint) {
      startActivity(new Intent(this, FingerprintActivity.class));
    }
  }
}
