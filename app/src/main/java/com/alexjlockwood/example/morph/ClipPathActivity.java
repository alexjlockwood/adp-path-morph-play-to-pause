package com.alexjlockwood.example.morph;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ClipPathActivity extends AppCompatActivity {

  @BindView(R.id.airplane) CheckableImageView airplaneView;
  @BindView(R.id.flashlight) CheckableImageView flashlightView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_clippath);
    ButterKnife.bind(this);
  }

  @OnClick(R.id.rootview)
  void onClick() {
    airplaneView.toggle();
    flashlightView.toggle();
  }
}
