package com.jiakaiyang.cubicbezier.demo;

import java.util.ArrayList;
import java.util.List;

import android.view.animation.Interpolator;

import com.jiakaiyang.cubicbezier.CubicBezierInterpolators;

public class TranslationXItem {
  private String name;
  private Interpolator interpolator;

  public static List<TranslationXItem> createItems() {
    List<TranslationXItem> result = new ArrayList<>();

    result.add(new TranslationXItem(CubicBezierInterpolators.Type.EASE));
    result.add(new TranslationXItem(CubicBezierInterpolators.Type.LINEAR));
    result.add(new TranslationXItem(CubicBezierInterpolators.Type.EASE_IN));
    result.add(new TranslationXItem(CubicBezierInterpolators.Type.EASE_OUT));
    result.add(new TranslationXItem(CubicBezierInterpolators.Type.EASE_IN_OUT));
    result.add(new TranslationXItem(CubicBezierInterpolators.Type.EASE_IN_SINE));
    result.add(new TranslationXItem(CubicBezierInterpolators.Type.EASE_OUT_SINE));
    result.add(new TranslationXItem(CubicBezierInterpolators.Type.EASE_IN_OUT_SINE));
    result.add(new TranslationXItem(CubicBezierInterpolators.Type.EASE_IN_QUAD));
    result.add(new TranslationXItem(CubicBezierInterpolators.Type.EASE_OUT_QUAD));
    result.add(new TranslationXItem(CubicBezierInterpolators.Type.EASE_IN_OUT_QUAD));
    result.add(new TranslationXItem(CubicBezierInterpolators.Type.EASE_IN_CUBIC));
    result.add(new TranslationXItem(CubicBezierInterpolators.Type.EASE_OUT_CUBIC));
    result.add(new TranslationXItem(CubicBezierInterpolators.Type.EASE_IN_OUT_CUBIC));
    result.add(new TranslationXItem(CubicBezierInterpolators.Type.EASE_IN_QUART));
    result.add(new TranslationXItem(CubicBezierInterpolators.Type.EASE_OUT_QUART));
    result.add(new TranslationXItem(CubicBezierInterpolators.Type.EASE_IN_OUT_QUART));
    result.add(new TranslationXItem(CubicBezierInterpolators.Type.EASE_IN_QUINT));
    result.add(new TranslationXItem(CubicBezierInterpolators.Type.EASE_OUT_QUINT));
    result.add(new TranslationXItem(CubicBezierInterpolators.Type.EASE_IN_OUT_QUINT));
    result.add(new TranslationXItem(CubicBezierInterpolators.Type.EASE_IN_EXPO));
    result.add(new TranslationXItem(CubicBezierInterpolators.Type.EASE_OUT_EXPO));
    result.add(new TranslationXItem(CubicBezierInterpolators.Type.EASE_IN_CIRC));
    result.add(new TranslationXItem(CubicBezierInterpolators.Type.EASE_OUT_CIRC));
    result.add(new TranslationXItem(CubicBezierInterpolators.Type.EASE_IN_OUT_CIRC));
    result.add(new TranslationXItem(CubicBezierInterpolators.Type.EASE_IN_BACK));
    result.add(new TranslationXItem(CubicBezierInterpolators.Type.EASE_OUT_BACK));
    result.add(new TranslationXItem(CubicBezierInterpolators.Type.EASE_IN_OUT_BACK));
    return result;
  }


  public TranslationXItem(CubicBezierInterpolators.Type type) {
    this.name = type.getName();
    this.interpolator = type.create();
  }

  public TranslationXItem(String name, Interpolator interpolator) {
    this.name = name;
    this.interpolator = interpolator;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Interpolator getInterpolator() {
    return interpolator;
  }

  public void setInterpolator(Interpolator interpolator) {
    this.interpolator = interpolator;
  }
}
