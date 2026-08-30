package com.bytedance.sdk.openadsdk.utils;

/* JADX INFO: loaded from: classes4.dex */
public class VzQ {
    public static int bg() {
        try {
            int iMaxMemory = (int) (java.lang.Runtime.getRuntime().maxMemory() / 33554432);
            if (iMaxMemory <= 2) {
                return 2;
            }
            if (iMaxMemory >= 5) {
                return 5;
            }
            return iMaxMemory;
        } catch (java.lang.Throwable unused) {
            return 2;
        }
    }
}
