package com.bytedance.sdk.component.zx.IL;

/* JADX INFO: loaded from: classes3.dex */
public class eqN<T> implements com.bytedance.sdk.component.zx.ldr {
    private int IL;
    private T bX;
    java.util.Map<java.lang.String, java.lang.String> bg;
    private java.lang.String eqN;
    private com.bytedance.sdk.component.zx.iR zx;

    public eqN(int i, T t, java.lang.String str) {
        this.IL = i;
        this.bX = t;
        this.eqN = str;
    }

    public eqN(int i, T t, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        this(i, t, str);
        this.bg = map;
    }

    @Override // com.bytedance.sdk.component.zx.ldr
    public com.bytedance.sdk.component.zx.iR bg() {
        return this.zx;
    }

    public void bg(com.bytedance.sdk.component.zx.iR iRVar) {
        this.zx = iRVar;
    }

    @Override // com.bytedance.sdk.component.zx.ldr
    public int IL() {
        return this.IL;
    }

    @Override // com.bytedance.sdk.component.zx.ldr
    public T bX() {
        return this.bX;
    }

    @Override // com.bytedance.sdk.component.zx.ldr
    public java.lang.String eqN() {
        return this.eqN;
    }

    @Override // com.bytedance.sdk.component.zx.ldr
    public java.util.Map<java.lang.String, java.lang.String> zx() {
        return this.bg;
    }
}
