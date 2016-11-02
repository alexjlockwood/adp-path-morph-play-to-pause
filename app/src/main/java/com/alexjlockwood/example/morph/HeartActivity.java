package com.alexjlockwood.example.morph;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class HeartActivity extends AppCompatActivity implements View.OnClickListener {

  private CheckableImageView iconView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_heart);

    iconView = (CheckableImageView) findViewById(R.id.icon);
    findViewById(R.id.fill_heart).setOnClickListener(this);
    findViewById(R.id.break_heart).setOnClickListener(this);
  }

  @Override
  public void onClick(View view) {
    if (view.getId() == R.id.fill_heart) {
      iconView.setChecked(true);
    } else if (view.getId() == R.id.break_heart) {
      iconView.setChecked(false);
    }
  }
}
