package com.bytedance.sdk.openadsdk.VB.bg;

/* JADX INFO: loaded from: classes4.dex */
public class iR extends com.bytedance.sdk.component.bg.zx<org.json.JSONObject, org.json.JSONObject> {
    private final java.lang.String IL;
    private final com.bytedance.sdk.openadsdk.core.aGH bg;

    public iR(com.bytedance.sdk.openadsdk.core.aGH agh, java.lang.String str) {
        this.bg = agh;
        this.IL = str;
    }

    public static void bg(com.bytedance.sdk.component.bg.VzQ vzQ, com.bytedance.sdk.openadsdk.core.aGH agh) {
        vzQ.bg("endcardDynamicCreatives", new com.bytedance.sdk.openadsdk.VB.bg.iR(agh, "endcardDynamicCreatives"));
        vzQ.bg("multiOpenCovert", new com.bytedance.sdk.openadsdk.VB.bg.iR(agh, "multiOpenCovert"));
    }

    @Override // com.bytedance.sdk.component.bg.zx
    public org.json.JSONObject bg(org.json.JSONObject jSONObject, com.bytedance.sdk.component.bg.ldr ldrVar) throws java.lang.Exception {
        if ("endcardDynamicCreatives".equals(this.IL)) {
            return this.bg.ldr(jSONObject);
        }
        if (!"multiOpenCovert".equals(this.IL)) {
            return null;
        }
        this.bg.iR(jSONObject);
        return null;
    }
}
