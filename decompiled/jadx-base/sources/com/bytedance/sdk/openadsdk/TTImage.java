package com.bytedance.sdk.openadsdk;

/* JADX INFO: loaded from: classes4.dex */
public class TTImage {
    private final int IL;
    private final java.lang.String bX;
    private final int bg;
    private double eqN;

    public TTImage(int i, int i2, java.lang.String str, double d) {
        this.bg = i;
        this.IL = i2;
        this.bX = str;
        this.eqN = d;
    }

    public TTImage(int i, int i2, java.lang.String str) {
        this(i, i2, str, 0.0d);
    }

    public int getHeight() {
        return this.bg;
    }

    public int getWidth() {
        return this.IL;
    }

    public java.lang.String getImageUrl() {
        return this.bX;
    }

    public double getDuration() {
        return this.eqN;
    }

    public boolean isValid() {
        java.lang.String str;
        return this.bg > 0 && this.IL > 0 && (str = this.bX) != null && str.length() > 0;
    }
}
