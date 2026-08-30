package com.bytedance.sdk.component.ldr.bg.eqN.IL;

/* JADX INFO: loaded from: classes3.dex */
public class bg {
    private int IL;
    private int bg;

    public int bg() {
        return this.bg;
    }

    public int IL() {
        return this.IL;
    }

    bg(int i, int i2, long j) {
        if (i2 < i) {
            throw new java.lang.IllegalStateException("atMostBatchSendCount should meet a condition (atMostBatchSendCount >= maxCacheCount)");
        }
        this.bg = i;
        this.IL = i2;
    }

    public static com.bytedance.sdk.component.ldr.bg.eqN.IL.bg bX() {
        return new com.bytedance.sdk.component.ldr.bg.eqN.IL.bg(1, 100, 172800000L);
    }

    public static com.bytedance.sdk.component.ldr.bg.eqN.IL.bg eqN() {
        return new com.bytedance.sdk.component.ldr.bg.eqN.IL.bg(1, 100, -1L);
    }

    public static com.bytedance.sdk.component.ldr.bg.eqN.IL.bg zx() {
        return new com.bytedance.sdk.component.ldr.bg.eqN.IL.bg(3, 100, 172800000L);
    }
}
