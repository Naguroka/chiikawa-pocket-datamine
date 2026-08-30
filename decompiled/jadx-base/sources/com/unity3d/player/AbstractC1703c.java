package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
abstract class AbstractC1703c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f3912a = {android.R.attr.progressBarStyleLarge, android.R.attr.progressBarStyleLargeInverse, android.R.attr.progressBarStyleSmall, android.R.attr.progressBarStyleSmallInverse};
    private static android.widget.ProgressBar b = null;
    private static android.view.View c = null;
    private static int d = -1;

    public static void a() {
        android.widget.ProgressBar progressBar = b;
        if (progressBar != null) {
            if (progressBar != null && c != null) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) progressBar.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(b);
                    viewGroup.removeView(c);
                }
                b = null;
                c = null;
            }
            d = -1;
        }
    }

    public static void a(android.app.Activity activity, com.unity3d.player.UnityPlayer unityPlayer, int i) {
        if (i >= 0) {
            int[] iArr = f3912a;
            if (i >= 4) {
                return;
            }
            if (unityPlayer == null) {
                throw new java.lang.IllegalArgumentException("ViewGroup cannot be null.");
            }
            if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                return;
            }
            if (b != null) {
                if (d == i) {
                    return;
                } else {
                    a();
                }
            }
            d = i;
            android.widget.ProgressBar progressBar = new android.widget.ProgressBar(activity, null, iArr[i]);
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            progressBar.setLayoutParams(layoutParams);
            progressBar.setBackground(new android.graphics.drawable.ColorDrawable(0));
            progressBar.setIndeterminate(true);
            b = progressBar;
            android.view.View view = new android.view.View(activity);
            view.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            view.setBackgroundColor(0);
            view.setFocusableInTouchMode(true);
            view.requestFocus();
            view.setOnTouchListener(new com.unity3d.player.ViewOnTouchListenerC1699a());
            view.setOnKeyListener(new com.unity3d.player.ViewOnKeyListenerC1701b());
            c = view;
            unityPlayer.addView(view);
            unityPlayer.addView(b);
        }
    }
}
