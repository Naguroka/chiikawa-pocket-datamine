package com.bytedance.sdk.openadsdk.core.VB.eqN;

/* JADX INFO: loaded from: classes4.dex */
public class zx extends com.bytedance.sdk.openadsdk.core.VB.eqN.bX {
    @Override // com.bytedance.sdk.openadsdk.core.VB.eqN.bX
    protected com.bytedance.adsdk.ugeno.IL.bX iR() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.VB.eqN.bX, com.bytedance.sdk.component.adexpress.dynamic.eqN
    public void setSoundMute(boolean z) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.VB.eqN.bX, com.bytedance.sdk.component.adexpress.dynamic.eqN
    public void setTime(java.lang.CharSequence charSequence, int i, int i2, boolean z) {
    }

    public zx(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv, boolean z, com.bytedance.sdk.openadsdk.core.VB.eqN.bg bgVar, android.view.ViewGroup viewGroup) {
        super(context, tuv, z, bgVar, viewGroup);
    }

    @Override // com.bytedance.sdk.openadsdk.core.VB.eqN.bX
    protected org.json.JSONObject bg() {
        org.json.JSONObject jSONObjectBX = this.ldr.bX();
        if (jSONObjectBX != null) {
            return jSONObjectBX.optJSONObject("xTemplate");
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.VB.eqN.bX
    protected org.json.JSONObject IL() {
        return this.ldr.bX();
    }

    @Override // com.bytedance.sdk.openadsdk.core.VB.eqN.bX, com.bytedance.adsdk.ugeno.core.PX
    public void bg(com.bytedance.adsdk.ugeno.IL.bX bXVar, java.lang.String str, com.bytedance.adsdk.ugeno.eqN.IL.bg bgVar) {
        if (this.Kg == null || bgVar == null) {
            return;
        }
        java.lang.String strIL = bgVar.IL();
        strIL.hashCode();
        int i = 6;
        boolean z = true;
        switch (strIL) {
            case "openPrivacy":
                i = 7;
                break;
            case "pauseVideo":
            case "videoControl":
                i = 4;
                break;
            case "skip":
                break;
            case "convert":
                i = 2;
                break;
            case "muteVideo":
                i = 5;
                break;
            case "dislike":
                i = 3;
                break;
            default:
                i = 0;
                break;
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        if (this.Fy != null) {
            int[] iArrBg = com.bytedance.sdk.openadsdk.utils.ZQc.bg(this.Fy.get());
            if (iArrBg != null) {
                iArr = iArrBg;
            }
            int[] iArrBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.Fy.get());
            if (iArrBX != null) {
                iArr2 = iArrBX;
            }
        }
        com.bytedance.sdk.openadsdk.core.model.yDt.bg bgVarBg = new com.bytedance.sdk.openadsdk.core.model.yDt.bg().eqN(this.PX).bX(this.Ta).IL(this.yDt).bg(this.Lq).IL(this.vb).bg(this.xxp).bX(iArr[0]).eqN(iArr[1]).zx(iArr2[0]).ldr(iArr2[1]).bg(this.LZ);
        if (str.equals("tap") && !this.VzQ) {
            z = false;
        }
        this.Kg.bg(bXVar.WR(), i, bgVarBg.bg(z).bg(bXVar.VW()).IL(false).bg());
    }

    @Override // com.bytedance.sdk.openadsdk.core.VB.eqN.bX
    protected int eqN() {
        Kg();
        this.bg.bg((com.bytedance.adsdk.ugeno.core.PX) this);
        this.bg.bg((com.bytedance.adsdk.ugeno.core.Ta) this);
        com.bytedance.sdk.openadsdk.core.model.Ja jaUu = this.zx.uu();
        try {
            if (jaUu != null) {
                this.bX = this.bg.bg(this.eqN, this.tC, jaUu.zx());
            } else {
                this.bX = this.bg.bg(this.eqN, this.tC, null);
            }
            this.ldr.Uq().IL();
            this.ldr.Uq().bX();
            return 0;
        } catch (java.lang.UnsatisfiedLinkError unused) {
            return 139;
        }
    }

    private void Kg() {
        com.bytedance.adsdk.ugeno.core.Kg kg = new com.bytedance.adsdk.ugeno.core.Kg();
        java.util.HashMap map = new java.util.HashMap();
        map.put("image_info", this.ldr.VB());
        map.put("cache_dir", this.ldr.yDt());
        kg.bg(map);
        kg.bg(this.IL);
        kg.bg(this.eqN);
        kg.IL(this.tC);
        this.bg.bg("ad", kg);
    }

    @Override // com.bytedance.sdk.openadsdk.core.VB.eqN.bX
    protected com.bytedance.adsdk.ugeno.IL.bX ldr() {
        if (this.bX == null) {
            return null;
        }
        return this.bX.eqN("VideoV3");
    }
}
