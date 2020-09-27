package com.jiakaiyang.cubicbezier.demo;

import android.app.Activity;
import android.util.DisplayMetrics;

import androidx.annotation.NonNull;

public class Utils {


  public static int getDisplayWidth(@NonNull Activity activity) {
    DisplayMetrics displayMetrics = new DisplayMetrics();
    activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
    return displayMetrics.widthPixels;
  }
}
