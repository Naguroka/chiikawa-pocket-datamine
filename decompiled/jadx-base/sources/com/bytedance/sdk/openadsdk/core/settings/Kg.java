package com.bytedance.sdk.openadsdk.core.settings;

/* JADX INFO: loaded from: classes4.dex */
public class Kg implements java.lang.Comparable<com.bytedance.sdk.openadsdk.core.settings.Kg> {
    private final java.lang.String IL;
    private final java.lang.String Kg;
    private final int bX;
    private final java.lang.String bg;
    private final int eqN;
    private final int iR;
    private final int ldr;
    private java.lang.String zx;

    public Kg(java.lang.String str, java.lang.String str2, int i, int i2, java.lang.String str3, int i3, int i4, java.lang.String str4) {
        this.bg = str;
        this.IL = str2;
        this.bX = i;
        this.eqN = i2;
        this.zx = str3;
        if (android.text.TextUtils.isEmpty(str3)) {
            this.zx = "0";
        }
        this.ldr = i3;
        this.iR = i4;
        this.Kg = str4;
    }

    public int bg() {
        return this.ldr;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
    public int compareTo(com.bytedance.sdk.openadsdk.core.settings.Kg kg) {
        if (this.ldr < kg.bg()) {
            return -1;
        }
        return this.ldr == kg.bg() ? 0 : 1;
    }
}
