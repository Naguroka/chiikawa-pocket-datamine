package com.bytedance.sdk.openadsdk.core;

/* JADX INFO: loaded from: classes4.dex */
public class tC implements com.bytedance.sdk.component.embedapplog.IDefaultEncrypt {
    private final com.bytedance.sdk.component.embedapplog.PangleEncryptConstant.CryptDataScene bg;

    public tC(com.bytedance.sdk.component.embedapplog.PangleEncryptConstant.CryptDataScene cryptDataScene) {
        this.bg = cryptDataScene;
    }

    @Override // com.bytedance.sdk.component.embedapplog.IDefaultEncrypt
    public org.json.JSONObject encrypt(org.json.JSONObject jSONObject, int i) {
        com.bytedance.sdk.openadsdk.core.rri.bg(1, this.bg, i);
        return com.bytedance.sdk.component.utils.bg.bg(jSONObject);
    }
}
