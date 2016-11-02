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
    findViewById(R.id.enable).setOnClickListener(this);
    findViewById(R.id.disable).setOnClickListener(this);
  }

  @Override
  public void onClick(View view) {
    if (view.getId() == R.id.enable) {
      iconView.setChecked(false);
    } else if (view.getId() == R.id.disable) {
      iconView.setChecked(true);
    }
  }
}
