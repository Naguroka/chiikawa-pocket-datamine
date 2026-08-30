package com.bytedance.sdk.component.ldr.bg;

/* JADX INFO: loaded from: classes3.dex */
public class Kg {
    private static com.bytedance.sdk.component.ldr.bg.Kg Ta;
    private static volatile com.bytedance.sdk.component.ldr.bg.zx.bg eo;
    private volatile com.bytedance.sdk.component.ldr.bg.eqN.IL.bg IL;
    private volatile boolean Kg;
    private long Lq;
    private volatile java.util.Map<java.lang.Integer, com.bytedance.sdk.component.ldr.bg.IL.bX> PX;
    private volatile com.bytedance.sdk.component.ldr.bg.IL.bX VB;
    private volatile com.bytedance.sdk.component.ldr.bg.zx WR;
    private volatile com.bytedance.sdk.component.ldr.bg.eqN.IL.bg bX;
    private volatile android.content.Context bg;
    private volatile com.bytedance.sdk.component.ldr.bg.eqN.IL.bg eqN;
    private volatile com.bytedance.sdk.component.ldr.bg.bg.zx iR;
    private volatile com.bytedance.sdk.component.ldr.bg.eqN.IL.bg ldr;
    private final java.util.concurrent.atomic.AtomicBoolean yDt = new java.util.concurrent.atomic.AtomicBoolean(false);
    private volatile com.bytedance.sdk.component.ldr.bg.eqN.IL.bg zx;

    public boolean bg() {
        return this.yDt.get();
    }

    public void bg(boolean z) {
        this.yDt.set(z);
    }

    public boolean IL() {
        return this.Kg;
    }

    public void IL(boolean z) {
        this.Kg = z;
    }

    public java.util.Map<java.lang.Integer, com.bytedance.sdk.component.ldr.bg.IL.bX> bX() {
        return this.PX;
    }

    public com.bytedance.sdk.component.ldr.bg.bg.zx eqN() {
        return this.iR;
    }

    public static com.bytedance.sdk.component.ldr.bg.zx.bg zx() {
        if (eo == null) {
            synchronized (com.bytedance.sdk.component.ldr.bg.Kg.class) {
                if (eo == null) {
                    eo = new com.bytedance.sdk.component.ldr.bg.zx.IL();
                }
            }
        }
        return eo;
    }

    public void bg(com.bytedance.sdk.component.ldr.bg.bg.zx zxVar) {
        this.iR = zxVar;
    }

    public android.content.Context ldr() {
        return this.bg;
    }

    public void bg(android.content.Context context) {
        this.bg = context;
    }

    private Kg() {
    }

    public static synchronized com.bytedance.sdk.component.ldr.bg.Kg iR() {
        if (Ta == null) {
            Ta = new com.bytedance.sdk.component.ldr.bg.Kg();
        }
        return Ta;
    }

    public void bg(com.bytedance.sdk.component.ldr.bg.IL.bX bXVar) {
        this.VB = bXVar;
    }

    public com.bytedance.sdk.component.ldr.bg.IL.bX Kg() {
        return this.VB;
    }

    public void WR() {
        com.bytedance.sdk.component.ldr.bg.IL.eqN.bg.IL();
    }

    public com.bytedance.sdk.component.ldr.bg.eqN.IL.bg eo() {
        return this.ldr;
    }

    public void bg(com.bytedance.sdk.component.ldr.bg.eqN.IL.bg bgVar) {
        this.ldr = bgVar;
    }

    public void VB() {
        com.bytedance.sdk.component.ldr.bg.IL.eqN.bg.bX();
    }

    public void bg(com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar) {
        if (bgVar == null) {
            return;
        }
        bgVar.bg(java.lang.System.currentTimeMillis());
        com.bytedance.sdk.component.ldr.bg.IL.eqN.bg.bg(bgVar, bgVar.eqN());
    }

    public void bg(java.lang.String str, boolean z) {
        com.bytedance.sdk.component.ldr.bg.ldr.bg.bg().bg(str, z);
    }

    public void bg(java.lang.String str, java.util.List<java.lang.String> list, boolean z, java.util.Map<java.lang.String, java.lang.String> map, int i, java.lang.String str2) {
        com.bytedance.sdk.component.ldr.bg.ldr.bg.bg().bg(str, list, z, map, i, str2);
    }

    public void IL(com.bytedance.sdk.component.ldr.bg.eqN.IL.bg bgVar) {
        this.IL = bgVar;
    }

    public com.bytedance.sdk.component.ldr.bg.eqN.IL.bg PX() {
        return this.IL;
    }

    public void bX(com.bytedance.sdk.component.ldr.bg.eqN.IL.bg bgVar) {
        this.bX = bgVar;
    }

    public com.bytedance.sdk.component.ldr.bg.eqN.IL.bg Ta() {
        return this.bX;
    }

    public void eqN(com.bytedance.sdk.component.ldr.bg.eqN.IL.bg bgVar) {
        this.eqN = bgVar;
    }

    public com.bytedance.sdk.component.ldr.bg.eqN.IL.bg yDt() {
        return this.eqN;
    }

    public com.bytedance.sdk.component.ldr.bg.eqN.IL.bg Lq() {
        return this.zx;
    }

    public void zx(com.bytedance.sdk.component.ldr.bg.eqN.IL.bg bgVar) {
        this.zx = bgVar;
    }

    public void bg(com.bytedance.sdk.component.ldr.bg.zx zxVar) {
        this.WR = zxVar;
    }

    public com.bytedance.sdk.component.ldr.bg.zx vb() {
        return this.WR;
    }

    public void bg(long j) {
        this.Lq = j;
    }

    public long xxp() {
        return this.Lq * 24 * 60 * 60 * 1000;
    }
}
