package com.bytedance.sdk.component.IL.bg;

/* JADX INFO: loaded from: classes3.dex */
public final class WR {
    private java.lang.String IL;
    private java.lang.String bg;

    private WR(java.lang.String str) {
        this.bg = str;
    }

    public static com.bytedance.sdk.component.IL.bg.WR bg(java.lang.String str) {
        return new com.bytedance.sdk.component.IL.bg.WR(str);
    }

    public java.lang.String bg() {
        return this.bg;
    }

    public java.nio.charset.Charset bg(java.nio.charset.Charset charset) {
        try {
            java.lang.String str = this.IL;
            return str != null ? java.nio.charset.Charset.forName(str) : charset;
        } catch (java.lang.IllegalArgumentException unused) {
            return charset;
        }
    }
}
