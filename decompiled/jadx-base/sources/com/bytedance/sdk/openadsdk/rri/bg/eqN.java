package com.bytedance.sdk.openadsdk.rri.bg;

/* JADX INFO: loaded from: classes4.dex */
public class eqN {
    public static void bg(final com.bytedance.sdk.openadsdk.core.model.tuV tuv, final com.bytedance.sdk.openadsdk.rri.bg.bg bgVar, final com.bytedance.sdk.openadsdk.rri.bg.zx.bg bgVar2) {
        tuv.uny();
        com.bytedance.sdk.openadsdk.utils.VJ.bX(new com.bytedance.sdk.component.Kg.Kg("mrc_report") { // from class: com.bytedance.sdk.openadsdk.rri.bg.eqN.1
            @Override // java.lang.Runnable
            public void run() {
                if (tuv.zU()) {
                    if (tuv.Fb()) {
                        com.bytedance.sdk.openadsdk.core.PX.IL.bX.bg(tuv.GZ(), new com.bytedance.sdk.openadsdk.core.PX.IL.bX.IL("show_urls", tuv));
                    } else {
                        com.bytedance.sdk.openadsdk.eqN.bX.bg(tuv);
                    }
                }
                java.lang.String strBg = com.bytedance.sdk.openadsdk.utils.ayS.bg(tuv);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                com.bytedance.sdk.openadsdk.rri.bg.bg bgVar3 = bgVar;
                if (bgVar3 != null) {
                    try {
                        jSONObject.put("root_view", com.bytedance.sdk.openadsdk.rri.bg.bg.bg(bgVar3));
                        com.bytedance.sdk.openadsdk.rri.bg.zx.bg bgVar4 = bgVar2;
                        if (bgVar4 != null) {
                            if (bgVar4.bg != -1) {
                                jSONObject.put("dynamic_show_type", bgVar2.bg);
                            }
                            if (bgVar2.IL != -1) {
                                jSONObject.put("ad_show_order", bgVar2.IL + 1);
                            }
                        }
                    } catch (java.lang.Throwable unused) {
                    }
                }
                com.bytedance.sdk.openadsdk.eqN.bX.IL(tuv, strBg, "mrc_show", jSONObject);
            }
        });
    }
}
