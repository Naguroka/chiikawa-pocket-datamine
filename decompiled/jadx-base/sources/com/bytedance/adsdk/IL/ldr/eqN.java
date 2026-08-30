package com.bytedance.adsdk.IL.ldr;

/* JADX INFO: loaded from: classes3.dex */
public class eqN {
    private int IL;
    private float bg;

    public void bg(float f) {
        float f2 = this.bg + f;
        this.bg = f2;
        int i = this.IL + 1;
        this.IL = i;
        if (i == Integer.MAX_VALUE) {
            this.bg = f2 / 2.0f;
            this.IL = i / 2;
        }
    }
}
