package com.alexjlockwood.example.morph;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class SearchActivity extends AppCompatActivity implements View.OnClickListener {

  private ImageView iconView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_search);

    iconView = (ImageView) findViewById(R.id.icon);
    findViewById(R.id.search).setOnClickListener(this);
    findViewById(R.id.back).setOnClickListener(this);
  }

  @Override
  public void onClick(View view) {
    if (view.getId() == R.id.search) {
      iconView.setImageState(new int[]{R.attr.state_searching}, true);
    } else if (view.getId() == R.id.back) {
      iconView.setImageState(new int[]{-R.attr.state_searching}, true);
    }
  }
}
