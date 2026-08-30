package com.bytedance.sdk.openadsdk.component.reward.bg;

/* JADX INFO: loaded from: classes4.dex */
public class eqN {
    private final com.bytedance.sdk.openadsdk.core.model.tuV IL;
    private final java.lang.String bX;
    com.bytedance.sdk.openadsdk.VzQ.bg.bg.ldr bg;
    private boolean eqN;
    private final com.bytedance.sdk.openadsdk.component.reward.bg.bg zx;

    public interface bg {
        void bg(android.view.View view, float f, float f2, float f3, float f4, android.util.SparseArray<com.bytedance.sdk.openadsdk.core.IL.bX.bg> sparseArray, int i, int i2, int i3);

        void bg(java.lang.String str, org.json.JSONObject jSONObject);
    }

    public eqN(com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar) {
        this.zx = bgVar;
        this.IL = bgVar.IL;
        this.bX = bgVar.zx;
    }

    public void bg() {
        if (this.eqN) {
            return;
        }
        this.eqN = true;
        eqN();
    }

    private void eqN() {
        if (!com.bytedance.sdk.openadsdk.multipro.IL.bX() && this.IL.jz() == 4) {
            this.bg = com.bytedance.sdk.openadsdk.VzQ.bg.bg.iR.bg(this.zx.Dxa, this.IL, this.bX);
        }
        if (this.bg == null) {
            this.bg = com.bytedance.sdk.openadsdk.VzQ.bg.bg.iR.bg(this.zx.uu, this.IL, this.bX);
        }
    }

    public void IL() {
        com.bytedance.sdk.openadsdk.VzQ.bg.bg.ldr ldrVar = this.bg;
        if (ldrVar != null) {
            ldrVar.eqN();
        }
    }

    public com.bytedance.sdk.openadsdk.VzQ.bg.bg.ldr bX() {
        return this.bg;
    }

    public void bg(android.view.View view, float f, float f2, float f3, float f4, android.util.SparseArray<com.bytedance.sdk.openadsdk.core.IL.bX.bg> sparseArray, int i, int i2, int i3, com.bytedance.sdk.openadsdk.component.reward.bg.eqN.bg bgVar) {
        if (this.bg != null) {
            int id = view.getId();
            if (id == com.bytedance.sdk.openadsdk.utils.Ta.zx) {
                bgVar.bg("click_play_star_level", null);
                return;
            }
            if (id == com.bytedance.sdk.openadsdk.utils.Ta.eqN) {
                bgVar.bg("click_play_star_nums", null);
                return;
            } else if (id == com.bytedance.sdk.openadsdk.utils.Ta.bX) {
                bgVar.bg("click_play_source", null);
                return;
            } else {
                if (id == com.bytedance.sdk.openadsdk.utils.Ta.IL) {
                    bgVar.bg("click_play_logo", null);
                    return;
                }
                return;
            }
        }
        bgVar.bg(view, f, f2, f3, f4, sparseArray, i, i2, i3);
    }
}
