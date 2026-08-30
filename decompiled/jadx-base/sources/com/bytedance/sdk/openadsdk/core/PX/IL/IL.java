package com.bytedance.sdk.openadsdk.core.PX.IL;

/* JADX INFO: loaded from: classes4.dex */
public class IL extends com.bytedance.sdk.openadsdk.core.PX.IL.bX implements java.lang.Comparable<com.bytedance.sdk.openadsdk.core.PX.IL.IL> {
    private final float bg;

    private IL(float f, java.lang.String str, com.bytedance.sdk.openadsdk.core.PX.IL.bX.EnumC0135bX enumC0135bX, java.lang.Boolean bool) {
        super(str, enumC0135bX, bool);
        this.bg = f;
    }

    public boolean bg(float f) {
        return this.bg <= f && !zx();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
    public int compareTo(com.bytedance.sdk.openadsdk.core.PX.IL.IL il) {
        if (il == null) {
            return 1;
        }
        float f = this.bg;
        float f2 = il.bg;
        if (f > f2) {
            return 1;
        }
        return f < f2 ? -1 : 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.PX.IL.bX
    public void j_() {
        super.j_();
    }

    public static class bg {
        private final float IL;
        private final java.lang.String bg;
        private com.bytedance.sdk.openadsdk.core.PX.IL.bX.EnumC0135bX bX = com.bytedance.sdk.openadsdk.core.PX.IL.bX.EnumC0135bX.TRACKING_URL;
        private boolean eqN = false;

        public bg(java.lang.String str, float f) {
            this.bg = str;
            this.IL = f;
        }

        public com.bytedance.sdk.openadsdk.core.PX.IL.IL bg() {
            return new com.bytedance.sdk.openadsdk.core.PX.IL.IL(this.IL, this.bg, this.bX, java.lang.Boolean.valueOf(this.eqN));
        }
    }

    public org.json.JSONObject IL() throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("content", bX());
        jSONObject.put("trackingFraction", this.bg);
        return jSONObject;
    }
}
