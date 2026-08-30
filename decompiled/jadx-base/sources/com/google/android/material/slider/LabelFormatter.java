package com.google.android.material.slider;

/* JADX INFO: loaded from: classes5.dex */
public interface LabelFormatter {
    public static final int LABEL_FLOATING = 0;
    public static final int LABEL_GONE = 2;
    public static final int LABEL_VISIBLE = 3;
    public static final int LABEL_WITHIN_BOUNDS = 1;

    java.lang.String getFormattedValue(float f);
}
