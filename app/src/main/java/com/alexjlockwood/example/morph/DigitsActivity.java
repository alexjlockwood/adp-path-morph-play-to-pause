package com.alexjlockwood.example.morph;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class DigitsActivity extends AppCompatActivity implements View.OnClickListener {

  private ImageView iconView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_digits);

    iconView = (ImageView) findViewById(R.id.icon);
    findViewById(R.id.one).setOnClickListener(this);
    findViewById(R.id.two).setOnClickListener(this);
    findViewById(R.id.three).setOnClickListener(this);
    findViewById(R.id.four).setOnClickListener(this);
    findViewById(R.id.five).setOnClickListener(this);
    findViewById(R.id.six).setOnClickListener(this);
    findViewById(R.id.seven).setOnClickListener(this);
    findViewById(R.id.eight).setOnClickListener(this);
    findViewById(R.id.nine).setOnClickListener(this);
    findViewById(R.id.zero).setOnClickListener(this);
  }

  @Override
  public void onClick(View view) {
    if (view.getId() == R.id.zero) {
      iconView.setImageState(new int[0], false);
    } else if (view.getId() == R.id.one) {
      iconView.setImageState(new int[]{R.attr.state_one}, false);
    } else if (view.getId() == R.id.two) {
      iconView.setImageState(new int[]{R.attr.state_two}, false);
    } else if (view.getId() == R.id.three) {
      iconView.setImageState(new int[]{R.attr.state_three}, false);
    } else if (view.getId() == R.id.four) {
      iconView.setImageState(new int[]{R.attr.state_four}, false);
    } else if (view.getId() == R.id.five) {
      iconView.setImageState(new int[]{R.attr.state_five}, false);
    } else if (view.getId() == R.id.six) {
      iconView.setImageState(new int[]{R.attr.state_six}, false);
    } else if (view.getId() == R.id.seven) {
      iconView.setImageState(new int[]{R.attr.state_seven}, false);
    } else if (view.getId() == R.id.eight) {
      iconView.setImageState(new int[]{R.attr.state_eight}, false);
    } else if (view.getId() == R.id.nine) {
      iconView.setImageState(new int[]{R.attr.state_nine}, false);
    }
  }
}
