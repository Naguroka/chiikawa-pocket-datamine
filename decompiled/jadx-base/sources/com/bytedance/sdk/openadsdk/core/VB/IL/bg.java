package com.bytedance.sdk.openadsdk.core.VB.IL;

/* JADX INFO: loaded from: classes4.dex */
public class bg extends com.bytedance.adsdk.ugeno.WR.ldr.IL {
    public bg(android.content.Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.WR.ldr.IL
    public void iR(java.lang.String str) {
        super.iR(str);
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.equals("null", str)) {
            return;
        }
        try {
            ((com.bytedance.adsdk.ugeno.WR.ldr.bg) this.ldr).setText("(" + java.lang.String.format(com.bytedance.sdk.component.utils.Fy.bg(this.bX, "tt_comment_num"), java.lang.Integer.valueOf(java.lang.Integer.parseInt(str))) + ")");
        } catch (java.lang.Exception unused) {
        }
    }
}
