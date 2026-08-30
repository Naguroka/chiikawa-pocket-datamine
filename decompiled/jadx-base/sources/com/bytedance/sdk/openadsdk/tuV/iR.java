package com.bytedance.sdk.openadsdk.tuV;

/* JADX INFO: loaded from: classes4.dex */
public class iR {
    private static com.bytedance.sdk.openadsdk.tuV.iR.bg bg;

    public interface bg {
        void bg(java.lang.String str, java.lang.String str2, java.lang.Throwable th);
    }

    public static void bg(com.bytedance.sdk.openadsdk.tuV.iR.bg bgVar) {
        bg = bgVar;
    }

    public static boolean bg() {
        return bg != null;
    }

    public static void bg(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        if (bg == null) {
            return;
        }
        if (th == null) {
            th = new java.lang.Throwable();
        }
        bg.bg(str, str2, th);
    }
}
