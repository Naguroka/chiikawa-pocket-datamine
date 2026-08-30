package com.bytedance.sdk.openadsdk.utils;

/* JADX INFO: loaded from: classes4.dex */
public class eo {
    private static java.lang.String bg;

    public static java.lang.String bg() {
        if (android.text.TextUtils.isEmpty(bg)) {
            bg = com.bykv.vk.openvk.bg.bg.bg.bX.bg().getCacheDir() + java.io.File.separator + "proxy_cache";
        }
        return bg;
    }

    public static void bg(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.lang.Throwable th) {
                th.getMessage();
            }
        }
    }
}
