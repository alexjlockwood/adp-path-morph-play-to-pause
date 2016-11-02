package com.alexjlockwood.example.morph;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class FingerprintActivity extends AppCompatActivity implements View.OnClickListener {
  private static final int[] STATE_SET_ON =
      {R.attr.state_on, -R.attr.state_off, -R.attr.state_error};
  private static final int[] STATE_SET_OFF =
      {-R.attr.state_on, R.attr.state_off, -R.attr.state_error};
  private static final int[] STATE_SET_ERROR =
      {-R.attr.state_on, -R.attr.state_off, R.attr.state_error};

  private ImageView iconView;
  private View onButton;
  private View offButton;
  private View errorButton;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_fingerprint);

    iconView = (ImageView) findViewById(R.id.icon);
    onButton = findViewById(R.id.on);
    onButton.setOnClickListener(this);
    offButton = findViewById(R.id.off);
    offButton.setOnClickListener(this);
    errorButton = findViewById(R.id.error);
    errorButton.setOnClickListener(this);
  }

  @Override
  public void onClick(View view) {
    Drawable d = iconView.getDrawable();
    if (view.getId() == R.id.on) {
      setFingerprintOn();
    } else if (view.getId() == R.id.off) {
      setFingerprintOff();
    } else if (view.getId() == R.id.error) {
      setFingerprintError();
    }
  }

  private void setFingerprintOn() {
    onButton.setEnabled(false);
    offButton.setEnabled(true);
    errorButton.setEnabled(true);
    iconView.setImageState(STATE_SET_ON, true);
  }

  private void setFingerprintOff() {
    onButton.setEnabled(true);
    offButton.setEnabled(false);
    errorButton.setEnabled(false);
    iconView.setImageState(STATE_SET_OFF, true);
  }

  private void setFingerprintError() {
    onButton.setEnabled(true);
    offButton.setEnabled(false);
    errorButton.setEnabled(false);
    iconView.setImageState(STATE_SET_ERROR, true);
  }
}
