### 说明
cubic_bezier 支持在Android中方便使用一些常见的贝塞尔曲线动画效果。

在CSS中，支持一些很常见的动画效果直接枚举使用，例如 ease、ease-in、ease-out 等常见的动画效果。
现在使用 cubic_bezier 也可以很方便地在Android系统上使用这些常见的动画效果。

### 效果定义如下
![image](https://raw.githubusercontent.com/kaiyangjia/android_cubic_bezier/master/img/cubic-bezier.png)

### 使用
1. 在build.gradle 中添加依赖（Copy 到你的项目中）；

2. cubic_bezier 是使用Android中的插值器来实现的()，你可以简单使用如下：
```java
ObjectAnimator animator = ObjectAnimator.ofFloat(yourView, "translationX", 0, 500);
animator.setDuration(500);
animator.setInterpolator(CubicBezierInterpolators.Type.EASE.create());

animator.start();
```

这样，你就集成了 ease 这个动画效果了。

### 感谢
http://yisibl.github.io/cubic-bezier/#.25,.1,.25,1

### TODO
- [ ]: publish to jcenter