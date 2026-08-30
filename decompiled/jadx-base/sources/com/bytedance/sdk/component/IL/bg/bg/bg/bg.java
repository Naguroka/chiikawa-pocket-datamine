package com.bytedance.sdk.component.IL.bg.bg.bg;

/* JADX INFO: loaded from: classes3.dex */
public class bg extends com.bytedance.sdk.component.IL.bg.eqN {
    public static volatile com.bytedance.sdk.component.IL.bg.bg.bg.WR bg;
    private java.util.List<com.bytedance.sdk.component.IL.bg.IL> IL = new java.util.concurrent.CopyOnWriteArrayList();
    private java.util.List<com.bytedance.sdk.component.IL.bg.IL> bX = new java.util.concurrent.CopyOnWriteArrayList();
    private java.util.concurrent.ExecutorService eqN;

    @Override // com.bytedance.sdk.component.IL.bg.eqN
    public int bg() {
        return 0;
    }

    @Override // com.bytedance.sdk.component.IL.bg.eqN
    public void bg(int i) {
    }

    public bg(java.util.concurrent.ExecutorService executorService) {
        this.eqN = executorService;
    }

    public static void bg(com.bytedance.sdk.component.IL.bg.bg.bg.WR wr) {
        bg = wr;
    }

    @Override // com.bytedance.sdk.component.IL.bg.eqN
    public java.util.concurrent.ExecutorService IL() {
        java.util.concurrent.ExecutorService executorServiceBg = bg != null ? bg.bg() : null;
        return executorServiceBg != null ? executorServiceBg : this.eqN;
    }

    public boolean zx() {
        return (bg == null || bg.bg() == null) ? false : true;
    }

    @Override // com.bytedance.sdk.component.IL.bg.eqN
    public java.util.List<com.bytedance.sdk.component.IL.bg.IL> bX() {
        return this.IL;
    }

    @Override // com.bytedance.sdk.component.IL.bg.eqN
    public java.util.List<com.bytedance.sdk.component.IL.bg.IL> eqN() {
        return this.bX;
    }
}
