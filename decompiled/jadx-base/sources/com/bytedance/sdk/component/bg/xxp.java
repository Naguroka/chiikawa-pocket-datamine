package com.bytedance.sdk.component.bg;

/* JADX INFO: loaded from: classes3.dex */
public class xxp {
    public final java.lang.String IL;
    public final java.lang.String Kg;
    public final java.lang.String bX;
    public final int bg;
    public final java.lang.String eqN;
    public final java.lang.String iR;
    public final java.lang.String ldr;
    public final java.lang.String zx;

    public static com.bytedance.sdk.component.bg.xxp.bg bg() {
        return new com.bytedance.sdk.component.bg.xxp.bg();
    }

    public static com.bytedance.sdk.component.bg.xxp bg(java.lang.String str, int i) {
        return new com.bytedance.sdk.component.bg.xxp(str, i);
    }

    private xxp(java.lang.String str, int i) {
        this.IL = null;
        this.bX = null;
        this.eqN = null;
        this.zx = null;
        this.ldr = str;
        this.iR = null;
        this.bg = i;
        this.Kg = null;
    }

    private xxp(com.bytedance.sdk.component.bg.xxp.bg bgVar) {
        this.IL = bgVar.bg;
        this.bX = bgVar.IL;
        this.eqN = bgVar.bX;
        this.zx = bgVar.eqN;
        this.ldr = bgVar.zx;
        this.iR = bgVar.ldr;
        this.bg = 1;
        this.Kg = bgVar.iR;
    }

    public static boolean bg(com.bytedance.sdk.component.bg.xxp xxpVar) {
        return xxpVar == null || xxpVar.bg != 1 || android.text.TextUtils.isEmpty(xxpVar.eqN) || android.text.TextUtils.isEmpty(xxpVar.zx);
    }

    public java.lang.String toString() {
        return "methodName: " + this.eqN + ", params: " + this.zx + ", callbackId: " + this.ldr + ", type: " + this.bX + ", version: " + this.IL + ", ";
    }

    public static final class bg {
        private java.lang.String IL;
        private java.lang.String bX;
        private java.lang.String bg;
        private java.lang.String eqN;
        private java.lang.String iR;
        private java.lang.String ldr;
        private java.lang.String zx;

        private bg() {
        }

        public com.bytedance.sdk.component.bg.xxp.bg bg(java.lang.String str) {
            this.bg = str;
            return this;
        }

        public com.bytedance.sdk.component.bg.xxp.bg IL(java.lang.String str) {
            this.IL = str;
            return this;
        }

        public com.bytedance.sdk.component.bg.xxp.bg bX(java.lang.String str) {
            this.bX = str;
            return this;
        }

        public com.bytedance.sdk.component.bg.xxp.bg eqN(java.lang.String str) {
            this.eqN = str;
            return this;
        }

        public com.bytedance.sdk.component.bg.xxp.bg zx(java.lang.String str) {
            this.zx = str;
            return this;
        }

        public com.bytedance.sdk.component.bg.xxp.bg ldr(java.lang.String str) {
            this.ldr = str;
            return this;
        }

        public com.bytedance.sdk.component.bg.xxp.bg iR(java.lang.String str) {
            this.iR = str;
            return this;
        }

        public com.bytedance.sdk.component.bg.xxp bg() {
            return new com.bytedance.sdk.component.bg.xxp(this);
        }
    }
}
