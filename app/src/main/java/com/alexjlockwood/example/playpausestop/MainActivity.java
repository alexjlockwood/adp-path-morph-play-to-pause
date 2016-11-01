package com.alexjlockwood.example.playpausestop;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

  private PlayPauseStopImageView iconView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    iconView = (PlayPauseStopImageView) findViewById(R.id.icon);
    findViewById(R.id.play).setOnClickListener(this);
    findViewById(R.id.pause).setOnClickListener(this);
    findViewById(R.id.stop).setOnClickListener(this);
  }

  @Override
  public void onClick(View view) {
    if (view.getId() == R.id.play) {
      iconView.setIconType(PlayPauseStopImageView.IconType.PLAY);
    } else if (view.getId() == R.id.pause) {
      iconView.setIconType(PlayPauseStopImageView.IconType.PAUSE);
    } else if (view.getId() == R.id.stop) {
      iconView.setIconType(PlayPauseStopImageView.IconType.STOP);
    }
  }
}
