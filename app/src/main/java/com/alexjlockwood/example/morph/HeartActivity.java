package com.alexjlockwood.example.morph;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.BindView;
import butterknife.OnClick;

public class HeartActivity extends AppCompatActivity {

  @BindView(R.id.icon) CheckableImageView iconView;
  @BindView(R.id.button) Button button;

  private boolean isChecked;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_heart);

  }

  @OnClick(R.id.button)
  void onButtonClick() {
    isChecked = !isChecked;
    button.setText(isChecked ? R.string.break_heart : R.string.fill_heart);
    iconView.setChecked(isChecked);
  }
}
