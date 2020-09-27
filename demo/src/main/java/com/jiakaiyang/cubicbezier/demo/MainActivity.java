package com.jiakaiyang.cubicbezier.demo;

import java.util.List;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
  private static long DURATION = 500;

  private LinearLayout linearContainer;
  private List<TranslationXItem> translationXItems;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    initView();
  }

  private void initView() {
    initLinearContainer();
  }

  private void initLinearContainer() {
    if (linearContainer == null) {
      linearContainer = findViewById(R.id.linear_container);
      translationXItems = TranslationXItem.createItems();
    }

    for (TranslationXItem item : translationXItems) {
      View view = createItemView(item);
      linearContainer.addView(view);
    }
  }

  private View createItemView(TranslationXItem item) {
    View view = LayoutInflater.from(this).inflate(R.layout.translate_x_item, linearContainer, false);
    TextView nameView = view.findViewById(R.id.name);
    nameView.setText(item.getName());
    return view;
  }

  private Animator createAnimator(TranslationXItem item, View itemView) {
    int itemWidth = itemView.getWidth();

    View robotView = itemView.findViewById(R.id.android_robot);
    int robotWidth = robotView.getWidth();
    ObjectAnimator animator = ObjectAnimator.ofFloat(robotView, "translationX"
        , 0, itemWidth - robotWidth);
    animator.setDuration(DURATION);
    animator.setInterpolator(item.getInterpolator());

    return animator;
  }

  public void runAll(View view) {
    int count = linearContainer.getChildCount();

    for (int i = 0; i < count; i++) {
      View child = linearContainer.getChildAt(i);

      Animator animator = null;
      if (child.getTag() == null) {
        TranslationXItem item = translationXItems.get(i);
        animator = createAnimator(item, child);
        view.setTag(animator);
      } else {
        animator = (Animator) child.getTag();
      }
      animator.start();
    }
  }

  public void reset(View view) {
    if (linearContainer == null) {
      return;
    }

    linearContainer.removeAllViews();
    initLinearContainer();
  }
}
