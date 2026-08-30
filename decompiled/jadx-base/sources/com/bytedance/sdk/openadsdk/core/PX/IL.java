package com.bytedance.sdk.openadsdk.core.PX;

/* JADX INFO: loaded from: classes4.dex */
public class IL extends com.bytedance.sdk.openadsdk.core.PX.bX {
    private long VB;
    private long eo;

    public IL(int i, int i2, long j, long j2, com.bytedance.sdk.openadsdk.core.PX.bX.bg.EnumC0137bg enumC0137bg, com.bytedance.sdk.openadsdk.core.PX.bX.bg.IL il, java.lang.String str, java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bX> list, java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bX> list2, java.lang.String str2) {
        super(i, i2, enumC0137bg, il, str, list, list2, str2);
        this.eo = j;
        this.VB = j2;
        this.WR = "icon_click";
    }

    @Override // com.bytedance.sdk.openadsdk.core.PX.bX
    public org.json.JSONObject bg() throws org.json.JSONException {
        org.json.JSONObject jSONObjectBg = super.bg();
        if (jSONObjectBg != null) {
            jSONObjectBg.put(androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET, this.eo);
            jSONObjectBg.put("duration", this.VB);
        }
        return jSONObjectBg;
    }

    public static com.bytedance.sdk.openadsdk.core.PX.IL bg(org.json.JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.PX.bX bXVarIL = com.bytedance.sdk.openadsdk.core.PX.bX.IL(jSONObject);
        if (bXVarIL == null) {
            return null;
        }
        return new com.bytedance.sdk.openadsdk.core.PX.IL(bXVarIL.bg, bXVarIL.IL, jSONObject.optLong(androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET, -1L), jSONObject.optLong("duration", -1L), bXVarIL.bX, bXVarIL.eqN, bXVarIL.zx, bXVarIL.ldr, bXVarIL.iR, bXVarIL.Kg);
    }
}
