package com.bytedance.sdk.openadsdk.multipro.eqN;

/* JADX INFO: loaded from: classes4.dex */
public class eqN {
    private static boolean bg() {
        return com.bytedance.sdk.openadsdk.core.VzQ.bg() == null;
    }

    private static java.lang.String IL(java.lang.String str) {
        return android.text.TextUtils.isEmpty(str) ? "tt_sp" : str;
    }

    public static void bg(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        if (bg()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg(IL(str), str2, bool);
        } else {
            bg(IL(str), str2, bool);
        }
    }

    public static void bg(java.lang.String str, java.lang.String str2, java.lang.Long l) {
        if (bg()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg(IL(str), str2, l);
        } else {
            bg(IL(str), str2, l);
        }
    }

    public static void bg(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (bg()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg(IL(str), str2, str3);
        } else {
            bg(IL(str), str2, str3);
        }
    }

    public static void bg(java.lang.String str, java.lang.String str2, java.lang.Integer num) {
        if (bg()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg(IL(str), str2, num);
        } else {
            bg(IL(str), str2, num);
        }
    }

    public static int bg(java.lang.String str, java.lang.String str2, int i) {
        if (bg()) {
            return i;
        }
        if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            return com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg(IL(str), str2, i);
        }
        return com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), IL(str), str2, i);
    }

    public static boolean bg(java.lang.String str, java.lang.String str2, boolean z) {
        if (bg()) {
            return z;
        }
        if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            return com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg(IL(str), str2, z);
        }
        return com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), IL(str), str2, z);
    }

    public static long bg(java.lang.String str, java.lang.String str2, long j) {
        if (bg()) {
            return j;
        }
        if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            return com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg(IL(str), str2, j);
        }
        return com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), IL(str), str2, j);
    }

    public static java.lang.String IL(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (bg()) {
            return str3;
        }
        if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            return com.bytedance.sdk.openadsdk.multipro.eqN.bg.IL(IL(str), str2, str3);
        }
        return com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), IL(str), str2, str3);
    }

    public static void bg(java.lang.String str, java.lang.String str2) {
        if (bg()) {
            return;
        }
        try {
            if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
                com.bytedance.sdk.openadsdk.multipro.eqN.bg.IL(IL(str), str2);
            } else {
                com.bytedance.sdk.openadsdk.multipro.eqN.IL.IL(com.bytedance.sdk.openadsdk.core.VzQ.bg(), IL(str), str2);
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public static void bg(java.lang.String str) {
        if (bg()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg(IL(str));
        } else {
            com.bytedance.sdk.openadsdk.multipro.eqN.IL.IL(com.bytedance.sdk.openadsdk.core.VzQ.bg(), IL(str));
        }
    }

    private static <T> void bg(java.lang.String str, java.lang.String str2, T t) {
        java.lang.String strBg = com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg(str, str2);
        if (com.bytedance.sdk.openadsdk.core.WR.iR(strBg)) {
            com.bytedance.sdk.component.IL.bX bXVarIL = com.bytedance.sdk.component.IL.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), IL(strBg)).IL();
            com.bytedance.sdk.openadsdk.multipro.eqN.IL.bg(bXVarIL, str2, (java.lang.Object) t);
            bXVarIL.apply();
        } else {
            android.content.SharedPreferences sharedPreferencesBg = com.bytedance.sdk.openadsdk.multipro.eqN.IL.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), IL(strBg));
            if (sharedPreferencesBg == null) {
                return;
            }
            android.content.SharedPreferences.Editor editorEdit = sharedPreferencesBg.edit();
            com.bytedance.sdk.openadsdk.multipro.eqN.IL.bg(editorEdit, str2, t);
            editorEdit.apply();
        }
    }
}
