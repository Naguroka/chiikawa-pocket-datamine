package com.bykv.vk.openvk.bg.bg.IL.IL.zx;

/* JADX INFO: loaded from: classes3.dex */
public class eqN implements com.bykv.vk.openvk.bg.bg.IL.IL.zx.IL {
    private com.bytedance.sdk.component.IL.bg.VB bg;

    public eqN() {
        this.bg = null;
        this.bg = com.bykv.vk.openvk.bg.bg.bg.bX.eqN();
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.IL.zx.IL
    public com.bykv.vk.openvk.bg.bg.IL.IL.zx.bg bg(com.bykv.vk.openvk.bg.bg.IL.IL.zx.zx zxVar) throws java.io.IOException {
        com.bytedance.sdk.component.IL.bg.Ta.bg bgVar = new com.bytedance.sdk.component.IL.bg.Ta.bg();
        try {
            if (zxVar.zx != null) {
                for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : zxVar.zx.entrySet()) {
                    java.lang.String key = entry.getKey();
                    if (!android.text.TextUtils.isEmpty(key)) {
                        java.lang.String value = entry.getValue();
                        if (value == null) {
                            value = "";
                        }
                        bgVar.IL(key, value);
                    }
                }
            }
            com.bytedance.sdk.component.IL.bg.Lq lqIL = this.bg.bg(bgVar.IL(zxVar.IL).bg().bg("videoPreloadLowVersion").bg(6).IL()).IL();
            java.lang.Object[] objArr = new java.lang.Object[2];
            java.lang.Integer.valueOf(lqIL.bX());
            return new com.bykv.vk.openvk.bg.bg.IL.IL.zx.ldr(lqIL, zxVar);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
