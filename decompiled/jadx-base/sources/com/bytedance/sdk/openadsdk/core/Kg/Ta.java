package com.bytedance.sdk.openadsdk.core.Kg;

/* JADX INFO: loaded from: classes4.dex */
public class Ta implements com.bytedance.adsdk.ugeno.core.Lq, com.bytedance.sdk.component.adexpress.IL.WR {
    private final java.lang.String IL;
    private final com.bytedance.sdk.openadsdk.core.model.tuV bX;
    private final com.bytedance.sdk.openadsdk.eqN.eqN.zx bg;
    private final java.lang.String eqN;
    private long zx;

    public Ta(com.bytedance.sdk.openadsdk.eqN.eqN.zx zxVar, java.lang.String str, com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str2) {
        this.bg = zxVar;
        this.IL = str;
        this.eqN = str2;
        this.bX = tuv;
    }

    @Override // com.bytedance.sdk.component.adexpress.IL.WR
    public void eqN() {
        this.bg.bg();
    }

    @Override // com.bytedance.sdk.component.adexpress.IL.WR
    public void bg(boolean z) {
        this.bg.bg(z ? 1 : 0);
    }

    @Override // com.bytedance.sdk.component.adexpress.IL.WR
    public void zx() {
        this.bg.IL();
    }

    @Override // com.bytedance.sdk.component.adexpress.IL.WR
    public void bg(int i, java.lang.String str) {
        this.bg.bg(i, str);
        com.bytedance.sdk.openadsdk.core.Kg.VB.bg("Web", i, str, this.IL, this.eqN, this.bX);
    }

    @Override // com.bytedance.sdk.component.adexpress.IL.WR
    public void bg(int i) {
        this.zx = java.lang.System.currentTimeMillis();
        if (i == 3) {
            this.bg.bX("dynamic_render2_start");
        } else {
            this.bg.bX("dynamic_render_start");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.IL.WR
    public void IL(int i) {
        if (i == 3) {
            this.bg.eqN("dynamic_sub_analysis2_start");
        } else {
            this.bg.eqN("dynamic_sub_analysis_start");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.IL.WR
    public void bX(int i) {
        if (i == 3) {
            this.bg.eqN("dynamic_sub_analysis2_end");
        } else {
            this.bg.eqN("dynamic_sub_analysis_end");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.IL.WR
    public void eqN(int i) {
        if (i == 3) {
            this.bg.eqN("dynamic_sub_render2_start");
        } else {
            this.bg.eqN("dynamic_sub_render_start");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.IL.WR
    public void zx(int i) {
        if (i == 3) {
            this.bg.eqN("dynamic_sub_render2_end");
        } else {
            this.bg.eqN("dynamic_sub_render_end");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.IL.WR
    public void ldr(int i) {
        final java.lang.String str;
        java.lang.System.currentTimeMillis();
        if (i == 3) {
            this.bg.iR("dynamic_render2_success");
            str = "dynamic2_render";
        } else {
            this.bg.iR("dynamic_render_success");
            str = "dynamic_backup_native_render";
        }
        this.bg.bg(true);
        com.bytedance.sdk.openadsdk.utils.VJ.IL(new com.bytedance.sdk.component.Kg.Kg("dynamic_success") { // from class: com.bytedance.sdk.openadsdk.core.Kg.Ta.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.eqN.bX.IL(com.bytedance.sdk.openadsdk.core.Kg.Ta.this.bX, com.bytedance.sdk.openadsdk.core.Kg.Ta.this.IL, str, (org.json.JSONObject) null);
            }
        }, 10);
    }

    @Override // com.bytedance.sdk.component.adexpress.IL.WR
    public void bg(int i, int i2, java.lang.String str, boolean z) {
        if (!z) {
            this.bg.bg(true);
        }
        if (i == 3) {
            this.bg.IL(i2, "dynamic_render2_error");
        } else {
            this.bg.IL(i2, "dynamic_render_error");
        }
        com.bytedance.sdk.openadsdk.core.Kg.VB.bg("NDR", i2, str, this.IL, this.eqN, this.bX);
    }

    @Override // com.bytedance.sdk.component.adexpress.IL.WR
    public void ldr() {
        this.bg.bX();
    }

    @Override // com.bytedance.sdk.component.adexpress.IL.WR
    public void iR() {
        this.bg.bg(true);
        this.bg.Ta();
        com.bytedance.sdk.openadsdk.utils.VJ.IL(new com.bytedance.sdk.component.Kg.Kg("native_success") { // from class: com.bytedance.sdk.openadsdk.core.Kg.Ta.2
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.eqN.bX.IL(com.bytedance.sdk.openadsdk.core.Kg.Ta.this.bX, com.bytedance.sdk.openadsdk.core.Kg.Ta.this.IL, "dynamic_backup_render", (org.json.JSONObject) null);
            }
        }, 10);
    }

    @Override // com.bytedance.sdk.component.adexpress.IL.WR
    public void Kg() {
        this.bg.yDt();
    }

    @Override // com.bytedance.sdk.component.adexpress.IL.WR
    public void WR() {
        this.bg.Lq();
    }

    @Override // com.bytedance.sdk.component.adexpress.IL.WR
    public void eo() {
        this.bg.IL();
    }

    public void VB() {
        this.bg.VB();
        this.bg.PX();
    }

    @Override // com.bytedance.adsdk.ugeno.core.Lq
    public void bg() {
        this.bg.zx("ugen_render_start");
        this.bg.zx("ugen_sub_analysis_start");
    }

    @Override // com.bytedance.adsdk.ugeno.core.Lq
    public void IL() {
        this.bg.zx("ugen_sub_analysis_end");
    }

    @Override // com.bytedance.adsdk.ugeno.core.Lq
    public void bX() {
        this.bg.zx("ugen_sub_render_start");
    }

    @Override // com.bytedance.adsdk.ugeno.core.Lq
    public void bg(com.bytedance.adsdk.ugeno.core.yDt ydt) {
        if (ydt.bg() == 0) {
            this.bg.zx("ugen_sub_render_end");
            this.bg.ldr("ugen_render_success");
        } else {
            this.bg.bX(ydt.bg(), "ugen_render_error");
            com.bytedance.sdk.openadsdk.core.Kg.VB.bg("UGen", ydt.bg(), ydt.IL(), this.IL, this.eqN, this.bX);
        }
        this.bg.bg(true);
    }
}
