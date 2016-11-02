package com.alexjlockwood.example.morph;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class AirplaneActivity extends AppCompatActivity implements View.OnClickListener {

  private ImageView iconView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_airplane);

    iconView = (ImageView) findViewById(R.id.icon);
    findViewById(R.id.enable).setOnClickListener(this);
    findViewById(R.id.disable).setOnClickListener(this);
  }

  @Override
  public void onClick(View view) {
    if (view.getId() == R.id.enable) {
      iconView.setEnabled(true);
    } else if (view.getId() == R.id.disable) {
      iconView.setEnabled(false);
    }
  }
}
