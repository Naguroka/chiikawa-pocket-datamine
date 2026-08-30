package com.bytedance.sdk.openadsdk.api.nativeAd;

/* JADX INFO: loaded from: classes4.dex */
public class PAGImageItem {
    private final int IL;
    private final java.lang.String bX;
    private final int bg;
    private float eqN;

    public PAGImageItem(int i, int i2, java.lang.String str, float f) {
        this.bg = i;
        this.IL = i2;
        this.bX = str;
        this.eqN = f;
    }

    public PAGImageItem(int i, int i2, java.lang.String str) {
        this(i, i2, str, 0.0f);
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

    public float getDuration() {
        return this.eqN;
    }
}
