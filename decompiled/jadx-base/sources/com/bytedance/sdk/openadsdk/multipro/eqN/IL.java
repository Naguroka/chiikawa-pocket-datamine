package com.bytedance.sdk.openadsdk.multipro.eqN;

/* JADX INFO: loaded from: classes4.dex */
class IL {
    private static java.lang.ref.SoftReference<java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>>> bg;

    public static android.content.SharedPreferences bg(android.content.Context context, java.lang.String str) {
        if (context == null) {
            return null;
        }
        try {
            return context.getSharedPreferences(bg(str), 0);
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("SPMultiHelperImpl", "getSharedPreferences error ", th.getMessage());
            return null;
        }
    }

    private static java.lang.String bg(java.lang.String str) {
        return android.text.TextUtils.isEmpty(str) ? "sphelper_ttopenadsdk" : str;
    }

    private static java.lang.Object bg(java.lang.String str, java.lang.String str2) {
        java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> concurrentHashMap;
        java.util.Map<java.lang.String, java.lang.Object> map;
        java.lang.ref.SoftReference<java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>>> softReference = bg;
        if (softReference == null || (concurrentHashMap = softReference.get()) == null || (map = concurrentHashMap.get(bg(str))) == null) {
            return null;
        }
        return map.get(str2);
    }

    private static void bg(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        java.lang.ref.SoftReference<java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>>> softReference = bg;
        if (softReference == null || softReference.get() == null) {
            bg = new java.lang.ref.SoftReference<>(new java.util.concurrent.ConcurrentHashMap());
        }
        java.lang.String strBg = bg(str);
        java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> concurrentHashMap = bg.get();
        if (concurrentHashMap.get(strBg) == null) {
            concurrentHashMap.put(strBg, new java.util.HashMap());
        }
        concurrentHashMap.get(strBg).put(str2, obj);
    }

    private static void IL(java.lang.String str) {
        java.util.Map<java.lang.String, java.lang.Object> map;
        java.lang.ref.SoftReference<java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>>> softReference = bg;
        if (softReference == null || softReference.get() == null || (map = bg.get().get(bg(str))) == null) {
            return;
        }
        map.clear();
    }

    static synchronized <T> void bg(android.content.Context context, java.lang.String str, java.lang.String str2, T t) {
        java.lang.String strBg = com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg(str, str2);
        if (com.bytedance.sdk.openadsdk.core.WR.iR(strBg)) {
            com.bytedance.sdk.component.IL ilBg = com.bytedance.sdk.component.IL.bg(context, strBg);
            if (t.equals(bg(strBg, str2))) {
                return;
            }
            com.bytedance.sdk.component.IL.bX bXVarIL = ilBg.IL();
            bg(bXVarIL, str2, (java.lang.Object) t);
            bXVarIL.apply();
            bg(strBg, str2, t);
            return;
        }
        android.content.SharedPreferences sharedPreferencesBg = bg(context, strBg);
        if (sharedPreferencesBg == null) {
            return;
        }
        if (t.equals(bg(strBg, str2))) {
            return;
        }
        android.content.SharedPreferences.Editor editorEdit = sharedPreferencesBg.edit();
        bg(editorEdit, str2, t);
        editorEdit.apply();
        bg(strBg, str2, t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected static <T> void bg(android.content.SharedPreferences.Editor editor, java.lang.String str, T t) {
        if (t instanceof java.lang.Integer) {
            editor.putInt(str, ((java.lang.Integer) t).intValue());
        }
        if (t instanceof java.lang.Long) {
            editor.putLong(str, ((java.lang.Long) t).longValue());
        }
        if (t instanceof java.lang.Float) {
            editor.putFloat(str, ((java.lang.Float) t).floatValue());
        }
        if (t instanceof java.lang.Boolean) {
            editor.putBoolean(str, ((java.lang.Boolean) t).booleanValue());
        }
        if (t instanceof java.lang.String) {
            editor.putString(str, (java.lang.String) t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected static <T> void bg(com.bytedance.sdk.component.IL.bX bXVar, java.lang.String str, T t) {
        if (t instanceof java.lang.Integer) {
            bXVar.putInt(str, ((java.lang.Integer) t).intValue());
        }
        if (t instanceof java.lang.Long) {
            bXVar.putLong(str, ((java.lang.Long) t).longValue());
        }
        if (t instanceof java.lang.Float) {
            bXVar.putFloat(str, ((java.lang.Float) t).floatValue());
        }
        if (t instanceof java.lang.Boolean) {
            bXVar.putBoolean(str, ((java.lang.Boolean) t).booleanValue());
        }
        if (t instanceof java.lang.String) {
            bXVar.putString(str, (java.lang.String) t);
        }
    }

    static java.lang.String bg(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.Object objBg = bg(str, str2);
        if (objBg != null) {
            return java.lang.String.valueOf(objBg);
        }
        java.lang.Object objIL = IL(context, str, str2, str3);
        bg(str, str2, objIL);
        return java.lang.String.valueOf(objIL);
    }

    private static java.lang.Object IL(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String strBg = bg(str);
        if (!bg(context, strBg, str2)) {
            return null;
        }
        if (str3.equalsIgnoreCase(androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_STRING)) {
            return com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg(context, strBg, str2, (java.lang.String) null);
        }
        if (str3.equalsIgnoreCase(androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_BOOLEAN)) {
            return java.lang.Boolean.valueOf(com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg(context, strBg, str2, false));
        }
        if (str3.equalsIgnoreCase("int")) {
            return java.lang.Integer.valueOf(com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg(context, strBg, str2, 0));
        }
        if (str3.equalsIgnoreCase(com.adjust.sdk.Constants.LONG)) {
            return java.lang.Long.valueOf(com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg(context, strBg, str2, 0L));
        }
        if (str3.equalsIgnoreCase(androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_FLOAT)) {
            return java.lang.Float.valueOf(com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg(context, strBg, str2, 0.0f));
        }
        if (str3.equalsIgnoreCase("string_set")) {
            return com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg(context, strBg, str2, (java.lang.String) null);
        }
        return null;
    }

    static boolean bg(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.lang.String strBg = com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg(str, str2);
        if (com.bytedance.sdk.openadsdk.core.WR.iR(strBg)) {
            return com.bytedance.sdk.component.IL.bg(context, strBg).bg(str2);
        }
        android.content.SharedPreferences sharedPreferencesBg = bg(context, strBg);
        return sharedPreferencesBg != null && sharedPreferencesBg.contains(str2);
    }

    public static void IL(android.content.Context context, java.lang.String str, java.lang.String str2) {
        try {
            java.lang.String strBg = com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg(str, str2);
            if (com.bytedance.sdk.openadsdk.core.WR.iR(strBg)) {
                com.bytedance.sdk.component.IL.bg(context, strBg).IL().remove(str2).apply();
                return;
            }
            android.content.SharedPreferences sharedPreferencesBg = bg(context, strBg);
            if (sharedPreferencesBg == null) {
                return;
            }
            android.content.SharedPreferences.Editor editorEdit = sharedPreferencesBg.edit();
            editorEdit.remove(str2);
            editorEdit.apply();
            java.lang.ref.SoftReference<java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>>> softReference = bg;
            if (softReference == null || softReference.get() == null) {
                return;
            }
            java.util.Map<java.lang.String, java.lang.Object> map = bg.get().get(bg(strBg));
            if (map != null && map.size() != 0) {
                map.remove(str2);
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    static void IL(android.content.Context context, java.lang.String str) {
        if (com.bytedance.sdk.openadsdk.core.WR.iR(str)) {
            com.bytedance.sdk.component.IL.bg(context, str).IL().clear().apply();
            IL(str);
            return;
        }
        android.content.SharedPreferences sharedPreferencesBg = bg(context, str);
        if (sharedPreferencesBg == null) {
            return;
        }
        android.content.SharedPreferences.Editor editorEdit = sharedPreferencesBg.edit();
        editorEdit.clear();
        editorEdit.apply();
        IL(str);
    }

    static java.util.Map<java.lang.String, ?> bX(android.content.Context context, java.lang.String str) {
        android.content.SharedPreferences sharedPreferencesBg = bg(context, str);
        if (sharedPreferencesBg == null) {
            return null;
        }
        return sharedPreferencesBg.getAll();
    }
}
