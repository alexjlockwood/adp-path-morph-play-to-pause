package com.alexjlockwood.example.morph;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class PlayPauseStopActivity extends AppCompatActivity implements View.OnClickListener {
  private static final int[] STATE_SET_PLAY =
      {R.attr.state_play, -R.attr.state_pause, -R.attr.state_stop};
  private static final int[] STATE_SET_PAUSE =
      {-R.attr.state_play, R.attr.state_pause, -R.attr.state_stop};
  private static final int[] STATE_SET_STOP =
      {-R.attr.state_play, -R.attr.state_pause, R.attr.state_stop};

  private ImageView iconView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_play_pause_stop);

    iconView = (ImageView) findViewById(R.id.icon);
    findViewById(R.id.play).setOnClickListener(this);
    findViewById(R.id.pause).setOnClickListener(this);
    findViewById(R.id.stop).setOnClickListener(this);
  }

  @Override
  public void onClick(View view) {
    if (view.getId() == R.id.play) {
      iconView.setImageState(STATE_SET_PLAY, true);
    } else if (view.getId() == R.id.pause) {
      iconView.setImageState(STATE_SET_PAUSE, true);
    } else if (view.getId() == R.id.stop) {
      iconView.setImageState(STATE_SET_STOP, true);
    }
  }
}
