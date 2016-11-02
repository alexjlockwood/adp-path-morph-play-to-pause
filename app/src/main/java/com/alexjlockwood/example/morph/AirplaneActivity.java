package com.alexjlockwood.example.morph;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AirplaneActivity extends AppCompatActivity implements View.OnClickListener {

  private CheckableImageView iconView;
  private Button button;
  private boolean isChecked;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_airplane);

    iconView = (CheckableImageView) findViewById(R.id.icon);
    button = (Button) findViewById(R.id.button);
    button.setOnClickListener(this);
  }

  @Override
  public void onClick(View view) {
    if (view.getId() == R.id.button) {
      isChecked = !isChecked;
      button.setText(isChecked ? R.string.disable : R.string.enable);
      iconView.setChecked(isChecked);
    }
  }
}
