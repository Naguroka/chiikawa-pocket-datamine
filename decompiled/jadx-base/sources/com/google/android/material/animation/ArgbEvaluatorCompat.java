package com.google.android.material.animation;

/* JADX INFO: loaded from: classes5.dex */
public class ArgbEvaluatorCompat implements android.animation.TypeEvaluator<java.lang.Integer> {
    private static final com.google.android.material.animation.ArgbEvaluatorCompat instance = new com.google.android.material.animation.ArgbEvaluatorCompat();

    public static com.google.android.material.animation.ArgbEvaluatorCompat getInstance() {
        return instance;
    }

    @Override // android.animation.TypeEvaluator
    public java.lang.Integer evaluate(float f, java.lang.Integer num, java.lang.Integer num2) {
        int iIntValue = num.intValue();
        float f2 = ((iIntValue >> 24) & 255) / 255.0f;
        int iIntValue2 = num2.intValue();
        float fPow = (float) java.lang.Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) java.lang.Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) java.lang.Math.pow((iIntValue & 255) / 255.0f, 2.2d);
        float fPow4 = (float) java.lang.Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
        float f3 = f2 + (((((iIntValue2 >> 24) & 255) / 255.0f) - f2) * f);
        float fPow5 = fPow2 + ((((float) java.lang.Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d)) - fPow2) * f);
        float fPow6 = fPow3 + (f * (((float) java.lang.Math.pow((iIntValue2 & 255) / 255.0f, 2.2d)) - fPow3));
        return java.lang.Integer.valueOf((java.lang.Math.round(((float) java.lang.Math.pow(fPow + ((fPow4 - fPow) * f), 0.45454545454545453d)) * 255.0f) << 16) | (java.lang.Math.round(f3 * 255.0f) << 24) | (java.lang.Math.round(((float) java.lang.Math.pow(fPow5, 0.45454545454545453d)) * 255.0f) << 8) | java.lang.Math.round(((float) java.lang.Math.pow(fPow6, 0.45454545454545453d)) * 255.0f));
    }
}
