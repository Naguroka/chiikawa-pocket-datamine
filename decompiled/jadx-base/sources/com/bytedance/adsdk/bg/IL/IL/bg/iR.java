package com.bytedance.adsdk.bg.IL.IL.bg;

/* JADX INFO: loaded from: classes3.dex */
public class iR implements com.bytedance.adsdk.bg.IL.IL.bg {
    private final java.lang.Object bg;

    public iR(java.lang.String str) {
        if (str.equalsIgnoreCase(com.json.mediationsdk.metadata.a.g)) {
            this.bg = java.lang.Boolean.TRUE;
        } else if (str.equalsIgnoreCase("false")) {
            this.bg = java.lang.Boolean.FALSE;
        } else {
            if (str.equalsIgnoreCase("null")) {
                this.bg = null;
                return;
            }
            throw new java.lang.IllegalArgumentException();
        }
    }

    @Override // com.bytedance.adsdk.bg.IL.IL.bg
    public java.lang.Object bg(java.util.Map<java.lang.String, org.json.JSONObject> map) {
        return this.bg;
    }

    @Override // com.bytedance.adsdk.bg.IL.IL.bg
    public com.bytedance.adsdk.bg.IL.eqN.zx bg() {
        return com.bytedance.adsdk.bg.IL.eqN.ldr.CONSTANT;
    }

    public java.lang.String toString() {
        return "KeywordNode [keywordValue=" + this.bg + com.ironsource.y8.i.e;
    }

    @Override // com.bytedance.adsdk.bg.IL.IL.bg
    public java.lang.String IL() {
        java.lang.Object obj = this.bg;
        return obj != null ? obj.toString() : "NULL";
    }
}
