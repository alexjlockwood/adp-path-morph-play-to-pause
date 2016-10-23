package com.alexjlockwood.example.playpauseanimation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SoundEffectConstants;
import android.widget.Checkable;
import android.widget.ImageButton;

/**
 * An extension to {@link ImageButton} which implements the {@link Checkable} interface.
 */
public class CheckableImageButton extends ImageButton implements Checkable {
  private static final int[] CHECKED_STATE_SET = {android.R.attr.state_checked};

  private boolean isChecked;

  public CheckableImageButton(Context context) {
    this(context, null);
  }

  public CheckableImageButton(Context context, AttributeSet attrs) {
    this(context, attrs, 0);
  }

  public CheckableImageButton(Context context, AttributeSet attrs, int defStyleAttr) {
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
  public boolean performClick() {
    // Borrowed from CompoundButton#performClick().
    toggle();
    final boolean handled = super.performClick();
    if (!handled) {
      // View only makes a sound effect if the onClickListener was
      // called, so we'll need to make one here instead.
      playSoundEffect(SoundEffectConstants.CLICK);
    }
    return handled;
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