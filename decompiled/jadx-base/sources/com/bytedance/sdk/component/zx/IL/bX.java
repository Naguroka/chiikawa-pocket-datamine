package com.bytedance.sdk.component.zx.IL;

/* JADX INFO: loaded from: classes3.dex */
public class bX implements com.bytedance.sdk.component.zx.zx {
    private boolean IL;
    private boolean bX;
    private java.lang.String bg;
    private com.bytedance.sdk.component.zx.yDt eqN;

    public bX(java.lang.String str, boolean z, boolean z2, com.bytedance.sdk.component.zx.yDt ydt) {
        this.bg = str;
        this.IL = z;
        this.bX = z2;
        this.eqN = ydt;
    }

    @Override // com.bytedance.sdk.component.zx.zx
    public java.lang.String bg() {
        return this.bg;
    }

    @Override // com.bytedance.sdk.component.zx.zx
    public boolean IL() {
        return this.IL;
    }

    @Override // com.bytedance.sdk.component.zx.zx
    public boolean bX() {
        return this.bX;
    }
}
