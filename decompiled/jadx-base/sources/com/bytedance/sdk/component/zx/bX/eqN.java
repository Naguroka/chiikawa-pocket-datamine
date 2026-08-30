package com.bytedance.sdk.component.zx.bX;

/* JADX INFO: loaded from: classes3.dex */
public class eqN<T> implements com.bytedance.sdk.component.zx.VB {
    private java.lang.String IL;
    private boolean Kg;
    private int VB;
    private boolean WR;
    private T bX;
    private java.lang.String bg;
    private com.bytedance.sdk.component.zx.iR eo;
    private T eqN;
    private java.util.Map<java.lang.String, java.lang.String> iR;
    private int ldr;
    private int zx;

    public com.bytedance.sdk.component.zx.bX.eqN bg(com.bytedance.sdk.component.zx.bX.bX bXVar, T t) {
        this.bX = t;
        this.bg = bXVar.zx();
        this.IL = bXVar.bg();
        this.zx = bXVar.IL();
        this.ldr = bXVar.bX();
        this.WR = bXVar.Lq();
        this.eo = bXVar.vb();
        this.VB = bXVar.xxp();
        return this;
    }

    public com.bytedance.sdk.component.zx.bX.eqN bg(com.bytedance.sdk.component.zx.bX.bX bXVar, T t, java.util.Map<java.lang.String, java.lang.String> map, boolean z) {
        this.iR = map;
        this.Kg = z;
        return bg(bXVar, t);
    }

    @Override // com.bytedance.sdk.component.zx.VB
    public java.lang.String bg() {
        return this.IL;
    }

    @Override // com.bytedance.sdk.component.zx.VB
    public T IL() {
        return this.bX;
    }

    @Override // com.bytedance.sdk.component.zx.VB
    public T bX() {
        return this.eqN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.component.zx.VB
    public void bg(java.lang.Object obj) {
        this.eqN = this.bX;
        this.bX = obj;
    }

    @Override // com.bytedance.sdk.component.zx.VB
    public java.util.Map<java.lang.String, java.lang.String> eqN() {
        return this.iR;
    }

    @Override // com.bytedance.sdk.component.zx.VB
    public boolean zx() {
        return this.Kg;
    }

    @Override // com.bytedance.sdk.component.zx.VB
    public boolean ldr() {
        return this.WR;
    }

    @Override // com.bytedance.sdk.component.zx.VB
    public int iR() {
        return this.VB;
    }
}
