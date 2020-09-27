package com.jiakaiyang.cubicbezier;

import android.view.animation.Interpolator;

import androidx.core.view.animation.PathInterpolatorCompat;


/**
 * Some commonly used {@link Interpolator}s implemented by Cubic Bezier
 */
public class CubicBezierInterpolators {

  /**
   * create interpolator by type
   *
   * @param type
   * @return
   */
  public static Interpolator createInterpolator(Type type) {
    return type.create();
  }


  public enum Type {
    EASE("EASE", 0.25f, 0.1f, 0.25f, 1f),
    LINEAR("LINEAR", 0f, 0f, 1f, 1f),
    EASE_IN("EASE_IN", 0.42f, 0f, 1f, 1f),
    EASE_OUT("EASE_OUT", 0f, 0f, 0.58f, 1f),
    EASE_IN_OUT("EASE_IN_OUT", 0.42f, 0f, 0.58f, 1f),
    EASE_IN_SINE("EASE_IN_SINE", 0.47f, 0f, 0.75f, 0.72f),
    EASE_OUT_SINE("EASE_OUT_SINE", 0.39f, 0.57f, 0.56f, 1f),
    EASE_IN_OUT_SINE("EASE_IN_OUT_SINE", 0.45f, 0.05f, 0.55f, 0.95f),
    EASE_IN_QUAD("EASE_IN_QUAD", 0.55f, 0.09f, 0.68f, 0.53f),
    EASE_OUT_QUAD("EASE_OUT_QUAD", 0.25f, 0.46f, 0.45f, 0.94f),
    EASE_IN_OUT_QUAD("EASE_IN_OUT_QUAD", 0.46f, 0.03f, 0.52f, 0.96f),
    EASE_IN_CUBIC("EASE_IN_CUBIC", 0.55f, 0.06f, 0.68f, 0.19f),
    EASE_OUT_CUBIC("EASE_OUT_CUBIC", 0.22f, 0.61f, 0.36f, 1f),
    EASE_IN_OUT_CUBIC("EASE_IN_OUT_CUBIC", 0.65f, 0.05f, 0.36f, 1f),
    EASE_IN_QUART("EASE_IN_QUART", 0.9f, 0.03f, 0.69f, 0.22f),
    EASE_OUT_QUART("EASE_OUT_QUART", 0.17f, 0.84f, 0.44f, 1f),
    EASE_IN_OUT_QUART("EASE_IN_OUT_QUART", 0.77f, 0f, 0.18f, 1f),
    EASE_IN_QUINT("EASE_IN_QUINT", 0.76f, 0.05f, 0.86f, 0.06f),
    EASE_OUT_QUINT("EASE_OUT_QUINT", 0.23f, 1f, 0.32f, 1f),
    EASE_IN_OUT_QUINT("EASE_IN_OUT_QUINT", 0.86f, 0f, 0.07f, 1f),
    EASE_IN_EXPO("EASE_IN_EXPO", 0.95f, 0.05f, 0.8f, 0.04f),
    EASE_OUT_EXPO("EASE_OUT_EXPO", 0.19f, 1f, 0.22f, 1f),
    EASE_IN_CIRC("EASE_IN_CIRC", 0.6f, 0.04f, 0.98f, 0.34f),
    EASE_OUT_CIRC("EASE_OUT_CIRC", 0.08f, 0.82f, 0.17f, 1f),
    EASE_IN_OUT_CIRC("EASE_IN_OUT_CIRC", 0.79f, 0.14f, 0.15f, 0.86f),
    EASE_IN_BACK("EASE_IN_BACK", 0.6f, -0.28f, 0.74f, 0.05f),
    EASE_OUT_BACK("EASE_OUT_BACK", 0.18f, 0.89f, 0.32f, 1.27f),
    EASE_IN_OUT_BACK("EASE_IN_OUT_BACK", 0.68f, -0.55f, 0.27f, 1.55f),
    ;

    private String name;
    private float x1;
    private float y1;
    private float x2;
    private float y2;

    Type(float x1, float y1, float x2, float y2) {
      this.x1 = x1;
      this.y1 = y1;
      this.x2 = x2;
      this.y2 = y2;
    }

    Type(String name, float x1, float y1, float x2, float y2) {
      this.name = name;
      this.x1 = x1;
      this.y1 = y1;
      this.x2 = x2;
      this.y2 = y2;
    }

    public String getName() {
      return name;
    }

    public Interpolator create() {
      return PathInterpolatorCompat.create(x1, y1, x2, y2);
    }
  }
}
