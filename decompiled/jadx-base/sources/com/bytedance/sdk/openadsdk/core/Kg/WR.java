package com.bytedance.sdk.openadsdk.core.Kg;

/* JADX INFO: loaded from: classes4.dex */
public class WR extends com.bytedance.sdk.openadsdk.core.IL.IL {
    public WR(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, int i) {
        super(context, tuv, str, i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.IL.IL
    protected com.bytedance.sdk.openadsdk.core.model.eo bg(float f, float f2, float f3, float f4, android.util.SparseArray<com.bytedance.sdk.openadsdk.core.IL.bX.bg> sparseArray, long j, long j2, android.view.View view, android.view.View view2, java.lang.String str, float f5, int i, float f6, int i2, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        float f7;
        float f8;
        float f9;
        float fBX;
        int i3;
        int i4;
        int i5;
        long j3;
        long j4;
        char c;
        int iBX;
        int iBX2;
        int[] iArrBg = com.bytedance.sdk.openadsdk.utils.ZQc.bg(view);
        int i6 = 0;
        if (iArrBg == null || iArrBg.length != 2) {
            f7 = f;
            f8 = f2;
            f9 = f3;
            fBX = f4;
            i3 = 0;
            i4 = 0;
        } else {
            i3 = iArrBg[0];
            i4 = iArrBg[1];
            if (this.Fy == 0) {
                float fBX2 = (com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.eqN, f) + i3) - 0.5f;
                float fBX3 = (com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.eqN, f2) + i4) - 0.5f;
                float fBX4 = (com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.eqN, f3) + i3) - 0.5f;
                fBX = (com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.eqN, f4) + i4) - 0.5f;
                f9 = fBX4;
                f7 = fBX2;
                f8 = fBX3;
            } else {
                f7 = f;
                f8 = f2;
                f9 = f3;
                fBX = f4;
            }
        }
        int[] iArrBg2 = new int[2];
        int[] iArrBX = new int[2];
        if (this.zx != null) {
            j3 = this.zx.zx;
            j4 = this.zx.ldr;
            if (this.Fy == 0) {
                iArrBg2[0] = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.eqN, this.zx.iR) + i3;
                iArrBg2[1] = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.eqN, this.zx.Kg) + i4;
                iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.eqN, this.zx.WR);
                iBX2 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.eqN, this.zx.eo);
                c = 0;
                i5 = 1;
            } else {
                c = 0;
                iArrBg2[0] = this.zx.iR;
                i5 = 1;
                iArrBg2[1] = this.zx.Kg;
                iBX = this.zx.WR;
                iBX2 = this.zx.eo;
            }
            iArrBX[c] = iBX;
            iArrBX[i5] = iBX2;
            if (iBX == 0 && iBX2 == 0 && view2 != null) {
                iArrBg2 = com.bytedance.sdk.openadsdk.utils.ZQc.bg(view2);
                iArrBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(view2);
            }
            i6 = 0;
        } else {
            i5 = 1;
            j3 = j;
            j4 = j2;
        }
        this.Fy = i6;
        return new com.bytedance.sdk.openadsdk.core.model.eo.bg().ldr(f7).zx(f8).eqN(f9).bX(fBX).IL(j3).bg(j4).IL(iArrBg).bg(iArrBg2).bX(com.bytedance.sdk.openadsdk.utils.ZQc.bX(view)).eqN(iArrBX).eqN(this.Uw).zx(this.DDQ).ldr(this.Uq).IL(com.bytedance.sdk.openadsdk.core.WR.IL().bg() ? i5 : 2).bg(sparseArray).bg(str).bg(i2).bg(jSONObject).IL(jSONObject2).bg();
    }

    public void bg(com.bytedance.sdk.openadsdk.core.model.yDt ydt) {
        this.zx = ydt;
    }
}
