package com.bytedance.adsdk.IL.eqN;

/* JADX INFO: loaded from: classes3.dex */
public enum bX {
    JSON(".json"),
    ZIP(".zip");

    public final java.lang.String bX;

    bX(java.lang.String str) {
        this.bX = str;
    }

    public java.lang.String bg() {
        return ".temp" + this.bX;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.bX;
    }
}
