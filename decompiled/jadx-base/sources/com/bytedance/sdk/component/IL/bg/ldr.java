package com.bytedance.sdk.component.IL.bg;

/* JADX INFO: loaded from: classes3.dex */
public final class ldr {
    private final java.lang.String[] bg;

    public ldr(java.lang.String[] strArr) {
        this.bg = strArr;
    }

    public int bg() {
        return this.bg.length / 2;
    }

    public java.lang.String bg(int i) {
        return this.bg[i * 2];
    }

    public java.lang.String IL(int i) {
        return this.bg[(i * 2) + 1];
    }
}
