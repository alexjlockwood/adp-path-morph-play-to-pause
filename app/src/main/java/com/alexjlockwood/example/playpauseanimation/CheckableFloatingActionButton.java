package com.alexjlockwood.example.playpauseanimation;

import android.content.Context;
import android.support.design.widget.FloatingActionButton;
import android.util.AttributeSet;
import android.widget.Checkable;

public class CheckableFloatingActionButton extends FloatingActionButton implements Checkable {
  private static final int[] CHECKED_STATE_SET = {android.R.attr.state_checked};

  private boolean isChecked;

  public CheckableFloatingActionButton(Context context) {
    this(context, null);
  }

  public CheckableFloatingActionButton(Context context, AttributeSet attrs) {
    this(context, attrs, 0);
  }

  public CheckableFloatingActionButton(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  @Override
  public boolean isChecked() {
    return isChecked;
  }

  @Override
  public void setChecked(boolean isChecked) {
    if (this.isChecked != isChecked) {
      this.isChecked = isChecked;
      refreshDrawableState();
    }
  }

  @Override
  public void toggle() {
    setChecked(!isChecked);
  }

  @Override
  public int[] onCreateDrawableState(int extraSpace) {
    final int[] drawableState = super.onCreateDrawableState(extraSpace + 1);
    if (isChecked()) {
      mergeDrawableStates(drawableState, CHECKED_STATE_SET);
    }
    return drawableState;
  }
}