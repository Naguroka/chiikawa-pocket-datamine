package com.bytedance.sdk.component.adexpress.eqN;

/* JADX INFO: loaded from: classes3.dex */
public class Kg {
    private static boolean bg;

    public static int bg(float f, float f2, float f3, float f4) {
        return (((int) ((f * 255.0f) + 0.5f)) << 24) | (((int) ((f2 * 255.0f) + 0.5f)) << 16) | (((int) ((f3 * 255.0f) + 0.5f)) << 8) | ((int) ((f4 * 255.0f) + 0.5f));
    }

    public static float bg(android.content.Context context, float f) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().bX().IL();
        }
        return (f * eqN(context)) + 0.5f;
    }

    public static int IL(android.content.Context context, float f) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().bX().IL();
        }
        float fEqN = eqN(context);
        if (fEqN <= 0.0f) {
            fEqN = 1.0f;
        }
        return (int) ((f / fEqN) + 0.5f);
    }

    public static float bX(android.content.Context context, float f) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().bX().IL();
        }
        return f * eqN(context);
    }

    private static float eqN(android.content.Context context) {
        try {
            if (bg) {
                java.lang.Class<?> clsLoadClass = context.getClassLoader().loadClass("android.util.DisplayMetrics");
                java.lang.reflect.Method declaredMethod = clsLoadClass.getDeclaredMethod("getDeviceDensity", new java.lang.Class[0]);
                declaredMethod.setAccessible(true);
                return ((java.lang.Integer) declaredMethod.invoke(clsLoadClass, new java.lang.Object[0])).intValue() / 160.0f;
            }
        } catch (java.lang.Exception unused) {
        }
        return context.getResources().getDisplayMetrics().density;
    }

    public static int bg(android.content.Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().bX().IL();
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int IL(android.content.Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().bX().IL();
        }
        android.view.Display defaultDisplay = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay();
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static java.lang.String bX(android.content.Context context) {
        java.lang.String language;
        try {
            java.util.Locale locale = com.bytedance.sdk.component.utils.Fy.IL(context).getConfiguration().getLocales().get(0);
            language = locale.getLanguage();
            try {
                if (locale.getCountry().equals("TW")) {
                    language = "zhHant";
                }
            } catch (java.lang.Throwable unused) {
            }
        } catch (java.lang.Throwable unused2) {
            language = "";
        }
        return bg(language);
    }

    private static java.lang.String bg(java.lang.String str) {
        str.hashCode();
        switch (str) {
            case "ar":
                return "aa";
            case "ja":
                return "japan";
            case "ko":
                return "korea";
            case "ms":
                return "my";
            case "zh":
                return "cn";
            default:
                return str;
        }
    }
}
