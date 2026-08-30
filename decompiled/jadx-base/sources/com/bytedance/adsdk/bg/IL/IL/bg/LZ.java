package com.bytedance.adsdk.bg.IL.IL.bg;

/* JADX INFO: loaded from: classes3.dex */
public class LZ implements com.bytedance.adsdk.bg.IL.IL.bg {
    private final java.lang.String bg;

    public LZ(java.lang.String str) {
        this.bg = str;
    }

    @Override // com.bytedance.adsdk.bg.IL.IL.bg
    public java.lang.Object bg(java.util.Map<java.lang.String, org.json.JSONObject> map) {
        return this.bg;
    }

    @Override // com.bytedance.adsdk.bg.IL.IL.bg
    public com.bytedance.adsdk.bg.IL.eqN.zx bg() {
        return com.bytedance.adsdk.bg.IL.eqN.ldr.STRING;
    }

    @Override // com.bytedance.adsdk.bg.IL.IL.bg
    public java.lang.String IL() {
        return "'" + this.bg + "'";
    }

    public java.lang.String toString() {
        return IL();
    }
}
