package com.bytedance.sdk.openadsdk.multipro.eqN;

/* JADX INFO: loaded from: classes4.dex */
public class bg {
    public static java.util.HashSet<java.lang.String> bg = new java.util.HashSet<java.lang.String>() { // from class: com.bytedance.sdk.openadsdk.multipro.eqN.bg.1
        {
            add("did");
            add("app_id");
            add("global_coppa");
            add("tt_gdpr");
            add("global_ccpa");
            add("keywords");
            add("extra_data");
            add(com.json.ce.K0);
            add("sdk_app_sha1");
            add("uuid");
            add("android_system_ua");
            add("sdk_local_web_ua");
            add("sdk_local_rom_info");
        }
    };

    public static boolean bg() {
        if (com.bytedance.sdk.openadsdk.core.VzQ.bg() != null) {
            return true;
        }
        com.bytedance.sdk.component.utils.PX.IL("The context of SPHelper is null, please initialize sdk in main process");
        return false;
    }

    private static com.bytedance.sdk.component.ldr.bg.ldr IL() {
        try {
            if (bg()) {
                return com.bytedance.sdk.openadsdk.multipro.bg.bg.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg());
            }
            return null;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private static android.content.Context bX() {
        return com.bytedance.sdk.openadsdk.core.VzQ.bg();
    }

    private static java.lang.String eqN() {
        return com.bytedance.sdk.openadsdk.multipro.eqN.IL + "/t_sp/";
    }

    private static java.lang.String IL(java.lang.String str) {
        return android.text.TextUtils.isEmpty(str) ? "" : "?sp_file_name=".concat(java.lang.String.valueOf(str));
    }

    public static synchronized void bg(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        if (bg()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
                    com.bytedance.sdk.openadsdk.multipro.eqN.IL.bg(bX(), str, str2, bool);
                    return;
                }
                com.bytedance.sdk.component.ldr.bg.ldr ldrVarIL = IL();
                if (ldrVarIL != null) {
                    android.net.Uri uri = android.net.Uri.parse(eqN() + "boolean/" + str2 + IL(str));
                    android.content.ContentValues contentValues = new android.content.ContentValues();
                    contentValues.put("value", bool);
                    ldrVarIL.bg(uri, contentValues, null, null);
                }
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public static synchronized void bg(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (bg()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
                    com.bytedance.sdk.openadsdk.multipro.eqN.IL.bg(bX(), str, str2, str3);
                    return;
                }
                com.bytedance.sdk.component.ldr.bg.ldr ldrVarIL = IL();
                if (ldrVarIL != null) {
                    android.net.Uri uri = android.net.Uri.parse(eqN() + "string/" + str2 + IL(str));
                    android.content.ContentValues contentValues = new android.content.ContentValues();
                    contentValues.put("value", str3);
                    ldrVarIL.bg(uri, contentValues, null, null);
                }
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public static synchronized void bg(java.lang.String str, java.lang.String str2, java.lang.Integer num) {
        if (bg()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
                    com.bytedance.sdk.openadsdk.multipro.eqN.IL.bg(bX(), str, str2, num);
                    return;
                }
                com.bytedance.sdk.component.ldr.bg.ldr ldrVarIL = IL();
                if (ldrVarIL != null) {
                    android.net.Uri uri = android.net.Uri.parse(eqN() + "int/" + str2 + IL(str));
                    android.content.ContentValues contentValues = new android.content.ContentValues();
                    contentValues.put("value", num);
                    ldrVarIL.bg(uri, contentValues, null, null);
                }
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public static synchronized void bg(java.lang.String str, java.lang.String str2, java.lang.Long l) {
        if (bg()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
                    com.bytedance.sdk.openadsdk.multipro.eqN.IL.bg(bX(), str, str2, l);
                    return;
                }
                com.bytedance.sdk.component.ldr.bg.ldr ldrVarIL = IL();
                if (ldrVarIL != null) {
                    android.net.Uri uri = android.net.Uri.parse(eqN() + "long/" + str2 + IL(str));
                    android.content.ContentValues contentValues = new android.content.ContentValues();
                    contentValues.put("value", l);
                    ldrVarIL.bg(uri, contentValues, null, null);
                }
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public static synchronized void bg(java.lang.String str, java.lang.String str2, java.lang.Float f) {
        if (bg()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
                    com.bytedance.sdk.openadsdk.multipro.eqN.IL.bg(bX(), str, str2, f);
                    return;
                }
                com.bytedance.sdk.component.ldr.bg.ldr ldrVarIL = IL();
                if (ldrVarIL != null) {
                    android.net.Uri uri = android.net.Uri.parse(eqN() + "float/" + str2 + IL(str));
                    android.content.ContentValues contentValues = new android.content.ContentValues();
                    contentValues.put("value", f);
                    ldrVarIL.bg(uri, contentValues, null, null);
                }
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public static java.lang.String IL(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String strBg;
        if (!bg()) {
            return str3;
        }
        try {
            if (!com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
                return bg(bX(), str, str2, str3);
            }
            com.bytedance.sdk.component.ldr.bg.ldr ldrVarIL = IL();
            return (ldrVarIL == null || (strBg = ldrVarIL.bg(android.net.Uri.parse(new java.lang.StringBuilder().append(eqN()).append("string/").append(str2).append(IL(str)).toString()))) == null || strBg.equals("null")) ? str3 : strBg;
        } catch (java.lang.Throwable unused) {
        }
    }

    protected static java.lang.String bg(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String strBg = bg(str, str2);
        if (com.bytedance.sdk.openadsdk.core.WR.iR(strBg)) {
            return com.bytedance.sdk.component.IL.bg(context, strBg).bg(str2, str3);
        }
        android.content.SharedPreferences sharedPreferencesBg = com.bytedance.sdk.openadsdk.multipro.eqN.IL.bg(context, strBg);
        return sharedPreferencesBg == null ? str3 : sharedPreferencesBg.getString(str2, str3);
    }

    public static java.lang.String bg(java.lang.String str, java.lang.String str2) {
        return bg.contains(str2) ? "pag_sp_bad_par" : str;
    }

    public static int bg(java.lang.String str, java.lang.String str2, int i) {
        java.lang.String strBg;
        if (!bg()) {
            return i;
        }
        try {
            if (!com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
                return bg(bX(), str, str2, i);
            }
            com.bytedance.sdk.component.ldr.bg.ldr ldrVarIL = IL();
            if (ldrVarIL != null && (strBg = ldrVarIL.bg(android.net.Uri.parse(eqN() + "int/" + str2 + IL(str)))) != null && !strBg.equals("null")) {
                return java.lang.Integer.parseInt(strBg);
            }
            return i;
        } catch (java.lang.Throwable unused) {
        }
    }

    protected static int bg(android.content.Context context, java.lang.String str, java.lang.String str2, int i) {
        java.lang.String strBg = bg(str, str2);
        if (com.bytedance.sdk.openadsdk.core.WR.iR(strBg)) {
            return com.bytedance.sdk.component.IL.bg(context, strBg).bg(str2, i);
        }
        android.content.SharedPreferences sharedPreferencesBg = com.bytedance.sdk.openadsdk.multipro.eqN.IL.bg(context, strBg);
        return sharedPreferencesBg == null ? i : sharedPreferencesBg.getInt(str2, i);
    }

    protected static float bg(android.content.Context context, java.lang.String str, java.lang.String str2, float f) {
        java.lang.String strBg = bg(str, str2);
        if (com.bytedance.sdk.openadsdk.core.WR.iR(strBg)) {
            return com.bytedance.sdk.component.IL.bg(context, strBg).bg(str2, f);
        }
        android.content.SharedPreferences sharedPreferencesBg = com.bytedance.sdk.openadsdk.multipro.eqN.IL.bg(context, strBg);
        return sharedPreferencesBg == null ? f : sharedPreferencesBg.getFloat(str2, f);
    }

    public static boolean bg(java.lang.String str, java.lang.String str2, boolean z) {
        java.lang.String strBg;
        if (!bg()) {
            return z;
        }
        try {
            if (!com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
                return bg(bX(), str, str2, z);
            }
            com.bytedance.sdk.component.ldr.bg.ldr ldrVarIL = IL();
            if (ldrVarIL != null && (strBg = ldrVarIL.bg(android.net.Uri.parse(eqN() + "boolean/" + str2 + IL(str)))) != null && !strBg.equals("null")) {
                return java.lang.Boolean.parseBoolean(strBg);
            }
            return z;
        } catch (java.lang.Throwable unused) {
        }
    }

    protected static boolean bg(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z) {
        java.lang.String strBg = bg(str, str2);
        if (com.bytedance.sdk.openadsdk.core.WR.iR(strBg)) {
            return com.bytedance.sdk.component.IL.bg(context, strBg).bg(str2, z);
        }
        android.content.SharedPreferences sharedPreferencesBg = com.bytedance.sdk.openadsdk.multipro.eqN.IL.bg(context, strBg);
        return sharedPreferencesBg == null ? z : sharedPreferencesBg.getBoolean(str2, z);
    }

    public static long bg(java.lang.String str, java.lang.String str2, long j) {
        java.lang.String strBg;
        if (!bg()) {
            return j;
        }
        try {
            if (!com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
                return bg(bX(), str, str2, j);
            }
            com.bytedance.sdk.component.ldr.bg.ldr ldrVarIL = IL();
            if (ldrVarIL != null && (strBg = ldrVarIL.bg(android.net.Uri.parse(eqN() + "long/" + str2 + IL(str)))) != null && !strBg.equals("null")) {
                return java.lang.Long.parseLong(strBg);
            }
            return j;
        } catch (java.lang.Throwable unused) {
        }
    }

    protected static long bg(android.content.Context context, java.lang.String str, java.lang.String str2, long j) {
        java.lang.String strBg = bg(str, str2);
        if (com.bytedance.sdk.openadsdk.core.WR.iR(strBg)) {
            return com.bytedance.sdk.component.IL.bg(context, strBg).bg(str2, j);
        }
        android.content.SharedPreferences sharedPreferencesBg = com.bytedance.sdk.openadsdk.multipro.eqN.IL.bg(context, strBg);
        return sharedPreferencesBg == null ? j : sharedPreferencesBg.getLong(str2, j);
    }

    public static void IL(java.lang.String str, java.lang.String str2) {
        if (bg()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
                    com.bytedance.sdk.openadsdk.multipro.eqN.IL.IL(bX(), str, str2);
                    return;
                }
                com.bytedance.sdk.component.ldr.bg.ldr ldrVarIL = IL();
                if (ldrVarIL != null) {
                    ldrVarIL.bg(android.net.Uri.parse(eqN() + "long/" + str2 + IL(str)), null, null);
                }
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public static void bg(java.lang.String str) {
        if (bg()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
                    com.bytedance.sdk.openadsdk.multipro.eqN.IL.IL(bX(), str);
                    return;
                }
                com.bytedance.sdk.component.ldr.bg.ldr ldrVarIL = IL();
                if (ldrVarIL != null) {
                    ldrVarIL.bg(android.net.Uri.parse(eqN() + "clean" + IL(str)), null, null);
                }
            } catch (java.lang.Throwable unused) {
            }
        }
    }
}
