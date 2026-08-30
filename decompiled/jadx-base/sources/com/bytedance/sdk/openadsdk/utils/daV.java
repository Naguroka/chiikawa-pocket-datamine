package com.bytedance.sdk.openadsdk.utils;

/* JADX INFO: loaded from: classes4.dex */
public class daV {
    private long IL;
    public long bg;

    private daV(boolean z) {
        if (z) {
            eqN();
        }
    }

    public static com.bytedance.sdk.openadsdk.utils.daV bg() {
        return new com.bytedance.sdk.openadsdk.utils.daV(true);
    }

    public static com.bytedance.sdk.openadsdk.utils.daV IL() {
        return new com.bytedance.sdk.openadsdk.utils.daV(false);
    }

    public long bX() {
        return android.os.SystemClock.elapsedRealtime() - this.IL;
    }

    public long bg(com.bytedance.sdk.openadsdk.utils.daV dav) {
        return java.lang.Math.abs(dav.IL - this.IL);
    }

    public void eqN() {
        this.bg = java.lang.System.currentTimeMillis();
        this.IL = android.os.SystemClock.elapsedRealtime();
    }

    public boolean zx() {
        return this.IL > 0;
    }

    public java.lang.String toString() {
        return java.lang.String.valueOf(this.bg);
    }
}
