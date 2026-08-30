package com.bytedance.sdk.openadsdk.core;

/* JADX INFO: loaded from: classes4.dex */
public class bX {
    private static volatile com.bytedance.sdk.openadsdk.core.bX bg;

    private bX() {
    }

    public static com.bytedance.sdk.openadsdk.core.bX bg(android.content.Context context) {
        if (bg == null) {
            synchronized (com.bytedance.sdk.openadsdk.core.bX.class) {
                if (bg == null) {
                    bg = new com.bytedance.sdk.openadsdk.core.bX();
                }
            }
        }
        return bg;
    }

    public void bg(java.lang.String str, java.lang.String str2) {
        com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("ttopenadsdk", str, str2);
    }

    public java.lang.String IL(java.lang.String str, java.lang.String str2) {
        return com.bytedance.sdk.openadsdk.multipro.eqN.eqN.IL("ttopenadsdk", str, str2);
    }

    public void bg(java.lang.String str, int i) {
        com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("ttopenadsdk", str, java.lang.Integer.valueOf(i));
    }

    public int IL(java.lang.String str, int i) {
        return com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("ttopenadsdk", str, i);
    }

    public void bg(java.lang.String str, long j) {
        com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("ttopenadsdk", str, java.lang.Long.valueOf(j));
    }

    public java.lang.Long IL(java.lang.String str, long j) {
        return java.lang.Long.valueOf(com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("ttopenadsdk", str, j));
    }
}
