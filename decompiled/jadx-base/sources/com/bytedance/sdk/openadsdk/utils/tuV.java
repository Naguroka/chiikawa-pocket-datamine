package com.bytedance.sdk.openadsdk.utils;

/* JADX INFO: loaded from: classes4.dex */
public class tuV {
    public static void bg(com.bytedance.sdk.component.WR.eqN eqn, java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        map.put(com.google.common.net.HttpHeaders.REFERER, com.bytedance.sdk.openadsdk.TTAdConstant.REQUEST_HEAD_REFERER);
        eqn.bg(str, map);
    }
}
