package com.bytedance.sdk.openadsdk.core.Kg;

/* JADX INFO: loaded from: classes4.dex */
public class tC implements com.bytedance.sdk.openadsdk.core.VB.zx.bX {
    private java.lang.String ldr;
    private long bg = 0;
    private long IL = 0;
    private int bX = 0;
    private java.lang.String eqN = null;
    private java.lang.String zx = null;
    private final java.util.concurrent.atomic.AtomicBoolean iR = new java.util.concurrent.atomic.AtomicBoolean(false);

    @Override // com.bytedance.sdk.openadsdk.core.VB.zx.bX
    public void bg(java.lang.String str) {
        this.ldr = str;
        this.bg = android.os.SystemClock.elapsedRealtime();
    }

    @Override // com.bytedance.sdk.openadsdk.core.VB.zx.bX
    public void bg(int i, java.lang.String str, java.lang.String str2) {
        this.bX = i;
        this.eqN = str;
        this.zx = str2;
        this.IL = android.os.SystemClock.elapsedRealtime();
        this.iR.set(false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.VB.zx.bX
    public void IL(java.lang.String str) {
        this.zx = str;
        this.IL = android.os.SystemClock.elapsedRealtime();
        this.iR.set(true);
    }

    public void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str) {
        if (this.iR.get()) {
            com.bytedance.sdk.openadsdk.eqN.bX.bg(tuv, false, str, "success", this.IL - this.bg, this.zx, this.ldr, 0, null);
        } else {
            com.bytedance.sdk.openadsdk.eqN.bX.bg(tuv, false, str, com.ironsource.y8.f.e, this.IL - this.bg, this.zx, this.ldr, this.bX, this.eqN);
        }
    }
}
