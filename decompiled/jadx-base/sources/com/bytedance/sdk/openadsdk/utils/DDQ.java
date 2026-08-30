package com.bytedance.sdk.openadsdk.utils;

/* JADX INFO: loaded from: classes4.dex */
public class DDQ {
    public static void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.Double d) {
        if (tuv == null || tuv.jA() == null) {
            return;
        }
        java.util.Map<java.lang.String, java.lang.Object> mapJA = tuv.jA();
        try {
            java.lang.Object obj = tuv.jA().get(com.bytedance.sdk.openadsdk.TTAdConstant.SDK_BIDDING_TYPE);
            if (obj != null && java.lang.Integer.parseInt(obj.toString()) == 2) {
                java.lang.String strReplace = (java.lang.String) mapJA.get(com.json.j5.A);
                if (android.text.TextUtils.isEmpty(strReplace)) {
                    return;
                }
                if (d != null) {
                    strReplace = strReplace.replace("${AUCTION_BID_TO_WIN}", java.lang.String.valueOf(d));
                }
                com.bytedance.sdk.openadsdk.core.VzQ.bX().bg(strReplace);
            }
        } catch (java.lang.Throwable unused) {
            com.bytedance.sdk.component.utils.PX.IL("report Win error");
        }
    }

    public static void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.Double d, java.lang.String str, java.lang.String str2) {
        if (tuv == null || tuv.jA() == null) {
            return;
        }
        java.util.Map<java.lang.String, java.lang.Object> mapJA = tuv.jA();
        try {
            java.lang.Object obj = tuv.jA().get(com.bytedance.sdk.openadsdk.TTAdConstant.SDK_BIDDING_TYPE);
            if (obj != null && java.lang.Integer.parseInt(obj.toString()) == 2) {
                java.lang.String strReplace = (java.lang.String) mapJA.get(com.json.j5.z);
                if (android.text.TextUtils.isEmpty(strReplace)) {
                    return;
                }
                if (d != null) {
                    strReplace = strReplace.replace(com.json.mediationsdk.d.n, java.lang.String.valueOf(d));
                }
                if (str != null) {
                    strReplace = strReplace.replace(com.json.mediationsdk.d.l, str);
                }
                if (str2 != null) {
                    strReplace = strReplace.replace("${AUCTION_WINNER}", str2);
                }
                com.bytedance.sdk.openadsdk.core.VzQ.bX().bg(strReplace);
            }
        } catch (java.lang.Throwable unused) {
            com.bytedance.sdk.component.utils.PX.IL("report Loss error");
        }
    }
}
