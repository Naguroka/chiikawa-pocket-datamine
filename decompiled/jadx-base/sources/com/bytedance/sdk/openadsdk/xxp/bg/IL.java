package com.bytedance.sdk.openadsdk.xxp.bg;

/* JADX INFO: loaded from: classes4.dex */
public class IL {
    private byte[] IL;
    private android.graphics.Bitmap bX;
    int bg;
    private android.graphics.Bitmap eqN;
    private java.util.Map<java.lang.String, java.lang.String> ldr;
    private java.util.List<java.lang.Object> zx;

    public IL(byte[] bArr, int i) {
        this.bX = null;
        this.eqN = null;
        this.zx = null;
        this.ldr = null;
        this.IL = bArr;
        this.bg = i;
    }

    public IL(android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2, int i) {
        this.IL = null;
        this.zx = null;
        this.ldr = null;
        this.eqN = bitmap2;
        this.bX = bitmap;
        this.bg = i;
    }

    public android.graphics.Bitmap bg() {
        return this.bX;
    }

    public android.graphics.Bitmap IL() {
        return this.eqN;
    }

    public byte[] bX() {
        try {
            if (this.IL == null) {
                this.IL = com.bytedance.sdk.component.utils.eqN.bg(this.bX);
            }
        } catch (java.lang.OutOfMemoryError e) {
            com.bytedance.sdk.component.utils.PX.bg("GifRequestResult", e.getMessage());
        }
        return this.IL;
    }

    public boolean eqN() {
        if (this.bX != null) {
            return true;
        }
        byte[] bArr = this.IL;
        return bArr != null && bArr.length > 0;
    }
}
