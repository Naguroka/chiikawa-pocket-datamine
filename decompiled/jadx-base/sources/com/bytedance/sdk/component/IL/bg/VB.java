package com.bytedance.sdk.component.IL.bg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class VB implements java.lang.Cloneable {
    public long IL;
    public java.util.concurrent.TimeUnit bX;
    public java.util.List<com.bytedance.sdk.component.IL.bg.Kg> bg;
    public long eqN;
    public java.util.concurrent.TimeUnit iR;
    public long ldr;
    public java.util.concurrent.TimeUnit zx;

    public abstract com.bytedance.sdk.component.IL.bg.IL bg(com.bytedance.sdk.component.IL.bg.Ta ta);

    public abstract com.bytedance.sdk.component.IL.bg.eqN bg();

    public VB(com.bytedance.sdk.component.IL.bg.VB.bg bgVar) {
        this.IL = bgVar.IL;
        this.eqN = bgVar.eqN;
        this.ldr = bgVar.ldr;
        this.bg = bgVar.bg;
        this.bX = bgVar.bX;
        this.zx = bgVar.zx;
        this.iR = bgVar.iR;
        this.bg = bgVar.bg;
    }

    public static final class bg {
        public long IL;
        public java.util.concurrent.TimeUnit bX;
        public final java.util.List<com.bytedance.sdk.component.IL.bg.Kg> bg;
        public long eqN;
        public java.util.concurrent.TimeUnit iR;
        public long ldr;
        public java.util.concurrent.TimeUnit zx;

        public bg() {
            this.bg = new java.util.ArrayList();
            this.IL = 10000L;
            this.bX = java.util.concurrent.TimeUnit.MILLISECONDS;
            this.eqN = 10000L;
            this.zx = java.util.concurrent.TimeUnit.MILLISECONDS;
            this.ldr = 10000L;
            this.iR = java.util.concurrent.TimeUnit.MILLISECONDS;
        }

        public bg(java.lang.String str) {
            this.bg = new java.util.ArrayList();
            this.IL = 10000L;
            this.bX = java.util.concurrent.TimeUnit.MILLISECONDS;
            this.eqN = 10000L;
            this.zx = java.util.concurrent.TimeUnit.MILLISECONDS;
            this.ldr = 10000L;
            this.iR = java.util.concurrent.TimeUnit.MILLISECONDS;
        }

        public bg(com.bytedance.sdk.component.IL.bg.VB vb) {
            this.bg = new java.util.ArrayList();
            this.IL = 10000L;
            this.bX = java.util.concurrent.TimeUnit.MILLISECONDS;
            this.eqN = 10000L;
            this.zx = java.util.concurrent.TimeUnit.MILLISECONDS;
            this.ldr = 10000L;
            this.iR = java.util.concurrent.TimeUnit.MILLISECONDS;
            this.IL = vb.IL;
            this.bX = vb.bX;
            this.eqN = vb.eqN;
            this.zx = vb.zx;
            this.ldr = vb.ldr;
            this.iR = vb.iR;
        }

        public com.bytedance.sdk.component.IL.bg.VB.bg bg(long j, java.util.concurrent.TimeUnit timeUnit) {
            this.IL = j;
            this.bX = timeUnit;
            return this;
        }

        public com.bytedance.sdk.component.IL.bg.VB.bg IL(long j, java.util.concurrent.TimeUnit timeUnit) {
            this.eqN = j;
            this.zx = timeUnit;
            return this;
        }

        public com.bytedance.sdk.component.IL.bg.VB.bg bX(long j, java.util.concurrent.TimeUnit timeUnit) {
            this.ldr = j;
            this.iR = timeUnit;
            return this;
        }

        public com.bytedance.sdk.component.IL.bg.VB.bg bg(com.bytedance.sdk.component.IL.bg.Kg kg) {
            this.bg.add(kg);
            return this;
        }

        public com.bytedance.sdk.component.IL.bg.VB bg() {
            return com.bytedance.sdk.component.IL.bg.bg.bg.bg(this);
        }
    }

    public com.bytedance.sdk.component.IL.bg.VB.bg IL() {
        return new com.bytedance.sdk.component.IL.bg.VB.bg(this);
    }
}
