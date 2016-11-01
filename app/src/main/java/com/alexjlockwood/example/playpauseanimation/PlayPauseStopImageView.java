package com.alexjlockwood.example.playpauseanimation;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.IntDef;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * An image view that displays a play, pause, or stop icon.
 */
public class PlayPauseStopImageView extends AppCompatImageView {
  private static final int[] STATE_SET_PLAY =
      {R.attr.state_play, -R.attr.state_pause, -R.attr.state_stop};
  private static final int[] STATE_SET_PAUSE =
      {-R.attr.state_play, R.attr.state_pause, -R.attr.state_stop};
  private static final int[] STATE_SET_STOP =
      {-R.attr.state_play, -R.attr.state_pause, R.attr.state_stop};

  @IconType
  private int iconType;

  public PlayPauseStopImageView(Context context) {
    this(context, null);
  }

  public PlayPauseStopImageView(Context context, AttributeSet attrs) {
    this(context, attrs, 0);
  }

  public PlayPauseStopImageView(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
    setImageResource(R.drawable.asl_play_pause_stop);

    final TypedArray array =
        context.obtainStyledAttributes(attrs, R.styleable.PlayPauseStopImageView);
    //noinspection WrongConstant
    setIconType(array.getInt(R.styleable.PlayPauseStopImageView_iconType, IconType.PLAY));
    array.recycle();
  }

  public void setIconType(@IconType int iconType) {
    final int[] stateSet;
    if (iconType == IconType.PLAY) {
      stateSet = STATE_SET_PLAY;
    } else if (iconType == IconType.PAUSE) {
      stateSet = STATE_SET_PAUSE;
    } else if (iconType == IconType.STOP) {
      stateSet = STATE_SET_STOP;
    } else {
      throw new IllegalArgumentException("Invalid icon type: " + iconType);
    }
    this.iconType = iconType;
    setImageState(stateSet, true);
  }

  @IconType
  public int getIconType() {
    return iconType;
  }

  @Retention(RetentionPolicy.SOURCE)
  @IntDef({IconType.PLAY, IconType.PAUSE, IconType.STOP})
  public @interface IconType {
    int PLAY = 0;
    int PAUSE = 1;
    int STOP = 2;
  }
}
