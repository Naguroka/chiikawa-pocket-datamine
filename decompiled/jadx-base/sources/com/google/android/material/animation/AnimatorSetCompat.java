package com.google.android.material.animation;

/* JADX INFO: loaded from: classes5.dex */
public class AnimatorSetCompat {
    public static void playTogether(android.animation.AnimatorSet animatorSet, java.util.List<android.animation.Animator> list) {
        int size = list.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            android.animation.Animator animator = list.get(i);
            jMax = java.lang.Math.max(jMax, animator.getStartDelay() + animator.getDuration());
        }
        android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        list.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(list);
    }
}
