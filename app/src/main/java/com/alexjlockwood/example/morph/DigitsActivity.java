package com.alexjlockwood.example.morph;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class DigitsActivity extends AppCompatActivity {
  private static final int[] DIGIT_STATES = {
      R.attr.state_zero,
      R.attr.state_one,
      R.attr.state_two,
      R.attr.state_three,
      R.attr.state_four,
      R.attr.state_five,
      R.attr.state_six,
      R.attr.state_seven,
      R.attr.state_eight,
      R.attr.state_nine,
  };

  private ImageView iconView;
  private int currentDigitStateIndex;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_digits);

    iconView = (ImageView) findViewById(R.id.icon);

    new CountDownTimer(Long.MAX_VALUE, 1000) {
      @Override
      public void onTick(long millisUntilFinished) {
        final int[] stateSet = new int[10];
        for (int i = 0; i < stateSet.length; i++) {
          if (i == currentDigitStateIndex) {
            stateSet[i] = DIGIT_STATES[i];
          } else {
            stateSet[i] = -DIGIT_STATES[i];
          }
        }
        iconView.setImageState(stateSet, true);
        currentDigitStateIndex = (currentDigitStateIndex + 1) % 10;
      }

      @Override
      public void onFinish() {}
    }.start();
  }
}
