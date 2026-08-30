package com.google.android.material.slider;

/* JADX INFO: loaded from: classes5.dex */
public final class BasicLabelFormatter implements com.google.android.material.slider.LabelFormatter {
    private static final int BILLION = 1000000000;
    private static final int MILLION = 1000000;
    private static final int THOUSAND = 1000;
    private static final long TRILLION = 1000000000000L;

    @Override // com.google.android.material.slider.LabelFormatter
    public java.lang.String getFormattedValue(float f) {
        if (f >= 1.0E12f) {
            return java.lang.String.format(java.util.Locale.US, "%.1fT", java.lang.Float.valueOf(f / 1.0E12f));
        }
        if (f >= 1.0E9f) {
            return java.lang.String.format(java.util.Locale.US, "%.1fB", java.lang.Float.valueOf(f / 1.0E9f));
        }
        if (f >= 1000000.0f) {
            return java.lang.String.format(java.util.Locale.US, "%.1fM", java.lang.Float.valueOf(f / 1000000.0f));
        }
        return f >= 1000.0f ? java.lang.String.format(java.util.Locale.US, "%.1fK", java.lang.Float.valueOf(f / 1000.0f)) : java.lang.String.format(java.util.Locale.US, "%.0f", java.lang.Float.valueOf(f));
    }
}
