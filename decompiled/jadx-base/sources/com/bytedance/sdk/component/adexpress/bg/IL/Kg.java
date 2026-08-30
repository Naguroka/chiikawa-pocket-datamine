package com.bytedance.sdk.component.adexpress.bg.IL;

/* JADX INFO: loaded from: classes3.dex */
public class Kg {
    private static com.bytedance.sdk.component.adexpress.bg.bX.bg bg;

    public static void bg() {
        java.io.FileInputStream fileInputStream;
        java.lang.Throwable th;
        java.io.FileInputStream fileInputStream2 = null;
        try {
            java.io.File file = new java.io.File(com.bytedance.sdk.component.adexpress.bg.IL.zx.Kg(), "temp_pkg_info.json");
            java.lang.Long lValueOf = java.lang.Long.valueOf(file.length());
            if (lValueOf.longValue() > 0 && file.exists() && file.isFile()) {
                byte[] bArr = new byte[lValueOf.intValue()];
                fileInputStream = new java.io.FileInputStream(file);
                try {
                    fileInputStream.read(bArr);
                    com.bytedance.sdk.component.adexpress.bg.bX.bg bgVarBg = com.bytedance.sdk.component.adexpress.bg.bX.bg.bg(new org.json.JSONObject(new java.lang.String(bArr, com.json.zb.N)));
                    if (bgVarBg != null) {
                        bg = bgVarBg;
                        bg.bX();
                    }
                    fileInputStream2 = fileInputStream;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    try {
                        com.bytedance.sdk.component.utils.PX.bg("Version", "version init error", th);
                        if (fileInputStream != null) {
                            try {
                                return;
                            } catch (java.io.IOException unused) {
                                return;
                            }
                        }
                        return;
                    } finally {
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (java.io.IOException unused2) {
                            }
                        }
                    }
                }
            }
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (java.io.IOException unused3) {
                }
            }
        } catch (java.lang.Throwable th3) {
            fileInputStream = null;
            th = th3;
        }
    }

    public static synchronized com.bytedance.sdk.component.adexpress.bg.bX.bg IL() {
        return bg;
    }

    public static synchronized void bg(com.bytedance.sdk.component.adexpress.bg.bX.bg bgVar) {
        if (bgVar != null) {
            if (bgVar.iR()) {
                bg = bgVar;
            }
        }
    }

    public static void bX() {
        com.bytedance.sdk.component.adexpress.bg.IL.zx.bg(com.bytedance.sdk.component.adexpress.bg.IL.zx.Kg(), IL(), "temp_pkg_info.json");
    }

    public static boolean bg(java.lang.String str) {
        return com.bytedance.sdk.component.adexpress.bg.IL.zx.bg(IL(), str);
    }

    public static boolean IL(com.bytedance.sdk.component.adexpress.bg.bX.bg bgVar) {
        return com.bytedance.sdk.component.adexpress.bg.IL.zx.bX(IL(), bgVar);
    }

    public static void eqN() {
        com.bytedance.sdk.component.adexpress.bg.IL.zx.IL(com.bytedance.sdk.component.adexpress.bg.IL.zx.Kg(), IL(), "temp_pkg_info.json");
        bg = null;
    }
}
