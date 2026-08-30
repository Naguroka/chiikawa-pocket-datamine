package com.bytedance.sdk.openadsdk.utils;

/* JADX INFO: loaded from: classes4.dex */
public class eqN {
    public static java.lang.String bg(java.lang.String str) {
        if (!com.bytedance.sdk.component.utils.PX.eqN() || android.text.TextUtils.isEmpty(str)) {
            return str;
        }
        com.bytedance.sdk.openadsdk.core.model.iR iRVar = new com.bytedance.sdk.openadsdk.core.model.iR(com.bytedance.sdk.openadsdk.core.WR.IL().Ta());
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
        java.util.Iterator<java.lang.String> it = iRVar.IL().iterator();
        while (it.hasNext()) {
            if (sb.toString().contains(it.next())) {
                if (sb.toString().contains("?")) {
                    sb.append(com.ironsource.y8.i.c).append(iRVar.bg());
                } else {
                    sb.append("?").append(iRVar.bg());
                }
            }
        }
        return sb.toString();
    }
}
