package com.bytedance.sdk.openadsdk.component.reward.IL;

/* JADX INFO: loaded from: classes4.dex */
public class zx extends com.bytedance.sdk.openadsdk.component.reward.IL.IL implements com.bytedance.sdk.openadsdk.PX.ldr {
    private final com.bytedance.sdk.openadsdk.core.model.Fy Lq;
    private boolean vb;

    @Override // com.bytedance.sdk.openadsdk.component.reward.IL.IL
    protected boolean DDQ() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.IL.IL
    public void bg(android.widget.FrameLayout frameLayout) {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.IL.IL
    public void iR() {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.IL.IL
    public boolean ldr() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.IL.IL
    public boolean zx() {
        return true;
    }

    public zx(com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar) {
        super(bgVar);
        this.Lq = (com.bytedance.sdk.openadsdk.core.model.Fy) bgVar.IL;
    }

    public static void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, boolean z, java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("is_backup", java.lang.Boolean.valueOf(z));
        com.bytedance.sdk.openadsdk.eqN.bX.bg("choose_ad_start_show", tuv, str, map);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("req_id", tuv.waE());
            jSONObject.put("is_backup", z);
        } catch (org.json.JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.yDt.bX.bg().bg("choose_ad_start_show", jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.IL.IL
    public void bg(com.bytedance.sdk.openadsdk.component.reward.view.iR iRVar) {
        if (com.bytedance.sdk.openadsdk.component.reward.IL.bX.bg(this.Lq)) {
            com.bytedance.sdk.openadsdk.component.reward.IL.bX.bg(this.Lq, iRVar, this.bg);
        } else {
            super.bg(iRVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.IL.bg
    public boolean IL() {
        return this.vb;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.IL.IL
    public void Ja() {
        com.bytedance.sdk.openadsdk.core.aGH jsObject;
        if (this.bg.uu.isFinishing()) {
            return;
        }
        if (this.bg.Ja.Kg() || this.vb) {
            super.Ja();
            if (this.bg.Ja.Kg()) {
                Uw();
                this.bg.ZQc.IL();
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.view.IL ilBg = this.bg.Ja.bg();
        if (ilBg == null || (jsObject = ilBg.getJsObject()) == null) {
            return;
        }
        jsObject.bg(this);
    }

    @Override // com.bytedance.sdk.openadsdk.PX.ldr
    public void bg(int i, long j) {
        this.vb = true;
        int i2 = i - 1;
        this.Lq.jz(i2);
        com.bytedance.sdk.openadsdk.eqN.bX.bg(this.Lq, this.bg.zx, i, j);
        com.bytedance.sdk.openadsdk.component.reward.bg.bg(this.Lq.eD(), i2, this.bg.eqN);
        com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.IL.zx.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.component.reward.IL.zx.this.Ja();
                if (com.bytedance.sdk.openadsdk.component.reward.IL.zx.this.bg.jz) {
                    com.bytedance.sdk.openadsdk.component.reward.IL.zx.this.Uw();
                    com.bytedance.sdk.openadsdk.component.reward.IL.zx.this.bg.ZQc.IL();
                } else {
                    com.bytedance.sdk.openadsdk.component.reward.bg.zx.bg bgVarLdr = com.bytedance.sdk.openadsdk.component.reward.IL.zx.this.bg.ZQc.ldr();
                    if (bgVarLdr != null) {
                        bgVarLdr.vb();
                    }
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.PX.ldr
    public void bg(com.bytedance.sdk.component.adexpress.IL.yDt ydt) {
        this.bg.Ja.bg().IL(ydt);
    }

    public void IL(boolean z) {
        if (this.vb) {
            return;
        }
        java.util.HashMap map = new java.util.HashMap();
        map.put("has_focus", java.lang.Boolean.valueOf(z));
        com.bytedance.sdk.openadsdk.eqN.bX.bg("choose_ad_focus_changed", this.Lq, this.bg.zx, map);
    }
}
