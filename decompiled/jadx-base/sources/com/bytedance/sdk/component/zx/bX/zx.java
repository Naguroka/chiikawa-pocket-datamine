package com.bytedance.sdk.component.zx.bX;

/* JADX INFO: loaded from: classes3.dex */
public class zx implements com.bytedance.sdk.component.zx.Ta {
    private java.util.concurrent.ExecutorService IL;
    private com.bytedance.sdk.component.zx.IL Kg;
    private com.bytedance.sdk.component.zx.tC WR;
    private com.bytedance.sdk.component.zx.eqN bX;
    private com.bytedance.sdk.component.zx.PX bg;
    private com.bytedance.sdk.component.zx.tuV eqN;
    private com.bytedance.sdk.component.zx.VzQ iR;
    private com.bytedance.sdk.component.zx.bX ldr;
    private com.bytedance.sdk.component.zx.Fy zx;

    private zx(com.bytedance.sdk.component.zx.bX.zx.bg bgVar) {
        this.bg = bgVar.bg;
        this.IL = bgVar.IL;
        this.bX = bgVar.bX;
        this.eqN = bgVar.eqN;
        this.zx = bgVar.zx;
        this.ldr = bgVar.ldr;
        this.Kg = bgVar.Kg;
        this.iR = bgVar.iR;
        this.WR = bgVar.WR;
    }

    @Override // com.bytedance.sdk.component.zx.Ta
    public com.bytedance.sdk.component.zx.PX bg() {
        return this.bg;
    }

    @Override // com.bytedance.sdk.component.zx.Ta
    public java.util.concurrent.ExecutorService IL() {
        return this.IL;
    }

    @Override // com.bytedance.sdk.component.zx.Ta
    public com.bytedance.sdk.component.zx.eqN eqN() {
        return this.bX;
    }

    @Override // com.bytedance.sdk.component.zx.Ta
    public com.bytedance.sdk.component.zx.tuV zx() {
        return this.eqN;
    }

    @Override // com.bytedance.sdk.component.zx.Ta
    public com.bytedance.sdk.component.zx.Fy ldr() {
        return this.zx;
    }

    @Override // com.bytedance.sdk.component.zx.Ta
    public com.bytedance.sdk.component.zx.bX iR() {
        return this.ldr;
    }

    @Override // com.bytedance.sdk.component.zx.Ta
    public com.bytedance.sdk.component.zx.VzQ Kg() {
        return this.iR;
    }

    @Override // com.bytedance.sdk.component.zx.Ta
    public com.bytedance.sdk.component.zx.tC bX() {
        return this.WR;
    }

    @Override // com.bytedance.sdk.component.zx.Ta
    public com.bytedance.sdk.component.zx.IL WR() {
        return this.Kg;
    }

    public static com.bytedance.sdk.component.zx.bX.zx bg(android.content.Context context) {
        return new com.bytedance.sdk.component.zx.bX.zx.bg().bg();
    }

    public static class bg {
        private java.util.concurrent.ExecutorService IL;
        private com.bytedance.sdk.component.zx.IL Kg;
        private com.bytedance.sdk.component.zx.tC WR;
        private com.bytedance.sdk.component.zx.eqN bX;
        private com.bytedance.sdk.component.zx.PX bg;
        private com.bytedance.sdk.component.zx.tuV eqN;
        private com.bytedance.sdk.component.zx.VzQ iR;
        private com.bytedance.sdk.component.zx.bX ldr;
        private com.bytedance.sdk.component.zx.Fy zx;

        public com.bytedance.sdk.component.zx.bX.zx.bg bg(com.bytedance.sdk.component.zx.IL il) {
            this.Kg = il;
            return this;
        }

        public com.bytedance.sdk.component.zx.bX.zx.bg bg(com.bytedance.sdk.component.zx.tC tCVar) {
            this.WR = tCVar;
            return this;
        }

        public com.bytedance.sdk.component.zx.bX.zx.bg bg(com.bytedance.sdk.component.zx.eqN eqn) {
            this.bX = eqn;
            return this;
        }

        public com.bytedance.sdk.component.zx.bX.zx bg() {
            return new com.bytedance.sdk.component.zx.bX.zx(this);
        }
    }
}
