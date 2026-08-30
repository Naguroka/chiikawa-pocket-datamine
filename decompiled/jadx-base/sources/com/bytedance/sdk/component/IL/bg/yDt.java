package com.bytedance.sdk.component.IL.bg;

/* JADX INFO: loaded from: classes3.dex */
public class yDt {
    public com.bytedance.sdk.component.IL.bg.WR bX;
    public java.lang.String eqN;
    public com.bytedance.sdk.component.IL.bg.yDt.bg ldr;
    public byte[] zx;

    public enum bg {
        STRING_TYPE,
        BYTE_ARRAY_TYPE
    }

    public yDt() {
    }

    public java.lang.String bg() {
        return this.eqN;
    }

    public yDt(com.bytedance.sdk.component.IL.bg.WR wr, java.lang.String str, com.bytedance.sdk.component.IL.bg.yDt.bg bgVar) {
        this.bX = wr;
        this.eqN = str;
        this.ldr = bgVar;
    }

    public yDt(com.bytedance.sdk.component.IL.bg.WR wr, byte[] bArr, com.bytedance.sdk.component.IL.bg.yDt.bg bgVar) {
        this.bX = wr;
        this.zx = bArr;
        this.ldr = bgVar;
    }

    public static com.bytedance.sdk.component.IL.bg.yDt bg(com.bytedance.sdk.component.IL.bg.WR wr, java.lang.String str) {
        return new com.bytedance.sdk.component.IL.bg.yDt(wr, str, com.bytedance.sdk.component.IL.bg.yDt.bg.STRING_TYPE);
    }

    public static com.bytedance.sdk.component.IL.bg.yDt bg(com.bytedance.sdk.component.IL.bg.WR wr, byte[] bArr) {
        return new com.bytedance.sdk.component.IL.bg.yDt(wr, bArr, com.bytedance.sdk.component.IL.bg.yDt.bg.BYTE_ARRAY_TYPE);
    }
}
