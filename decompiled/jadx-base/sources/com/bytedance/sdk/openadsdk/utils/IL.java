package com.bytedance.sdk.openadsdk.utils;

/* JADX INFO: loaded from: classes4.dex */
public class IL {
    public static java.lang.ref.SoftReference<com.bytedance.sdk.openadsdk.core.model.tuV> bg;

    public static com.bytedance.sdk.openadsdk.core.model.tuV bg() {
        java.lang.ref.SoftReference<com.bytedance.sdk.openadsdk.core.model.tuV> softReference = bg;
        if (softReference != null) {
            return softReference.get();
        }
        return null;
    }

    public static void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (tuv == null) {
            return;
        }
        bg = new java.lang.ref.SoftReference<>(tuv);
    }
}
