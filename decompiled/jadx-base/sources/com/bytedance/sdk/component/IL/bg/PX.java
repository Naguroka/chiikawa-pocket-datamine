package com.bytedance.sdk.component.IL.bg;

/* JADX INFO: loaded from: classes3.dex */
public enum PX {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");

    private final java.lang.String zx;

    PX(java.lang.String str) {
        this.zx = str;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.zx;
    }
}
