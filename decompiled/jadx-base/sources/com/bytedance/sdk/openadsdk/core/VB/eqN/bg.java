package com.bytedance.sdk.openadsdk.core.VB.eqN;

/* JADX INFO: loaded from: classes4.dex */
public class bg extends com.bytedance.sdk.component.adexpress.IL.Ta {
    private com.bytedance.adsdk.ugeno.core.Lq IL;
    private float bX;
    private org.json.JSONObject bg;
    private float eqN;

    public bg(com.bytedance.sdk.openadsdk.core.VB.eqN.bg.C0147bg c0147bg) {
        super(c0147bg);
        this.bg = c0147bg.bg;
        this.IL = c0147bg.IL;
        this.bX = c0147bg.bX;
        this.eqN = c0147bg.eqN;
    }

    public float Ja() {
        return this.bX;
    }

    public float Uw() {
        return this.eqN;
    }

    public org.json.JSONObject DDQ() {
        return this.bg;
    }

    public com.bytedance.adsdk.ugeno.core.Lq Uq() {
        return this.IL;
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.VB.eqN.bg$bg, reason: collision with other inner class name */
    public static class C0147bg extends com.bytedance.sdk.component.adexpress.IL.Ta.bg {
        private com.bytedance.adsdk.ugeno.core.Lq IL;
        private float bX;
        private org.json.JSONObject bg;
        private float eqN;

        public com.bytedance.sdk.openadsdk.core.VB.eqN.bg.C0147bg bg(org.json.JSONObject jSONObject) {
            this.bg = jSONObject;
            return this;
        }

        public com.bytedance.sdk.openadsdk.core.VB.eqN.bg.C0147bg bg(com.bytedance.adsdk.ugeno.core.Lq lq) {
            this.IL = lq;
            return this;
        }

        public com.bytedance.sdk.openadsdk.core.VB.eqN.bg.C0147bg bg(float f) {
            this.bX = f;
            return this;
        }

        public com.bytedance.sdk.openadsdk.core.VB.eqN.bg.C0147bg IL(float f) {
            this.eqN = f;
            return this;
        }

        @Override // com.bytedance.sdk.component.adexpress.IL.Ta.bg
        /* JADX INFO: renamed from: IL, reason: merged with bridge method [inline-methods] */
        public com.bytedance.sdk.openadsdk.core.VB.eqN.bg bg() {
            return new com.bytedance.sdk.openadsdk.core.VB.eqN.bg(this);
        }
    }
}
