package com.bytedance.sdk.openadsdk.xxp.bg;

/* JADX INFO: loaded from: classes4.dex */
public class bg {

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.xxp.bg.bg$bg, reason: collision with other inner class name */
    public interface InterfaceC0169bg {
        void bg(int i, java.lang.String str, java.lang.Throwable th);

        void bg(java.lang.String str, com.bytedance.sdk.openadsdk.xxp.bg.IL il);
    }

    public void bg(com.bytedance.sdk.openadsdk.xxp.bg bgVar, final com.bytedance.sdk.openadsdk.xxp.bg.bg.InterfaceC0169bg interfaceC0169bg, int i, int i2, android.widget.ImageView.ScaleType scaleType, java.lang.String str, final int i3, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        com.bytedance.sdk.openadsdk.WR.eqN.bg(bgVar.bg).bg(bgVar.IL).bg(i).IL(i2).zx(com.bytedance.sdk.openadsdk.utils.ZQc.eqN(com.bytedance.sdk.openadsdk.core.VzQ.bg())).eqN(com.bytedance.sdk.openadsdk.utils.ZQc.bX(com.bytedance.sdk.openadsdk.core.VzQ.bg())).IL(str).bg(android.graphics.Bitmap.Config.RGB_565).bg(scaleType).bg(!android.text.TextUtils.isEmpty(str)).bg(new com.bytedance.sdk.component.zx.Kg() { // from class: com.bytedance.sdk.openadsdk.xxp.bg.bg.2
            @Override // com.bytedance.sdk.component.zx.Kg
            public android.graphics.Bitmap bg(android.graphics.Bitmap bitmap) {
                return i3 <= 0 ? bitmap : com.bytedance.sdk.component.adexpress.eqN.bg.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), bitmap, i3);
            }
        }).bg(new com.bytedance.sdk.openadsdk.WR.IL(tuv, bgVar.bg, new com.bytedance.sdk.component.zx.xxp() { // from class: com.bytedance.sdk.openadsdk.xxp.bg.bg.1
            @Override // com.bytedance.sdk.component.zx.xxp
            public void bg(com.bytedance.sdk.component.zx.VB vb) {
                com.bytedance.sdk.openadsdk.xxp.bg.bg.this.bg(vb, interfaceC0169bg);
            }

            @Override // com.bytedance.sdk.component.zx.xxp
            public void bg(int i4, java.lang.String str2, java.lang.Throwable th) {
                com.bytedance.sdk.openadsdk.xxp.bg.bg.this.bg(i4, str2, th, interfaceC0169bg);
            }
        }));
    }

    protected void bg(com.bytedance.sdk.component.zx.VB vb, com.bytedance.sdk.openadsdk.xxp.bg.bg.InterfaceC0169bg interfaceC0169bg) {
        if (interfaceC0169bg != null) {
            java.lang.Object objIL = vb.IL();
            int iBg = bg(vb);
            if (objIL instanceof byte[]) {
                interfaceC0169bg.bg(vb.bg(), new com.bytedance.sdk.openadsdk.xxp.bg.IL((byte[]) objIL, iBg));
                return;
            }
            if (objIL instanceof android.graphics.Bitmap) {
                interfaceC0169bg.bg(vb.bg(), new com.bytedance.sdk.openadsdk.xxp.bg.IL((android.graphics.Bitmap) objIL, vb.bX() instanceof android.graphics.Bitmap ? (android.graphics.Bitmap) vb.bX() : null, iBg));
            } else {
                interfaceC0169bg.bg(0, "not bitmap or gif result!", null);
            }
        }
    }

    private int bg(com.bytedance.sdk.component.zx.VB vb) {
        java.lang.Object obj;
        java.util.Map<java.lang.String, java.lang.String> mapEqN = vb.eqN();
        if (mapEqN == null || (obj = mapEqN.get("image_size")) == null || !(obj instanceof java.lang.Integer)) {
            return 0;
        }
        return ((java.lang.Integer) obj).intValue();
    }

    protected void bg(int i, java.lang.String str, java.lang.Throwable th, com.bytedance.sdk.openadsdk.xxp.bg.bg.InterfaceC0169bg interfaceC0169bg) {
        if (interfaceC0169bg != null) {
            interfaceC0169bg.bg(i, str, th);
        }
    }
}
