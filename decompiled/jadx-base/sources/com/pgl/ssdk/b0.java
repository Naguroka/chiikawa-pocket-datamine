package com.pgl.ssdk;

/* JADX INFO: loaded from: classes3.dex */
public class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static double f3778a = -1.0d;

    public static java.lang.String b() {
        java.lang.String displayName;
        try {
            displayName = java.util.TimeZone.getDefault().getDisplayName(false, 0);
        } catch (java.lang.Throwable unused) {
            displayName = null;
        }
        return displayName == null ? "" : displayName.trim();
    }

    public static java.lang.String c() {
        return "";
    }

    public static java.lang.String c(android.content.Context context) {
        return "";
    }

    public static java.lang.String a() {
        return android.os.LocaleList.getDefault().get(0).getLanguage();
    }

    public static java.lang.String b(android.content.Context context) {
        double d = f3778a;
        double dDoubleValue = 0.0d;
        if (d >= 0.0d) {
            return java.lang.Integer.toString((int) d);
        }
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("com.android.internal.os.PowerProfile");
            java.lang.Object objNewInstance = cls.getConstructor(android.content.Context.class).newInstance(context);
            java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("getAveragePower", java.lang.String.class);
            declaredMethod.setAccessible(true);
            dDoubleValue = ((java.lang.Double) declaredMethod.invoke(objNewInstance, "battery.capacity")).doubleValue();
        } catch (java.lang.Throwable unused) {
        }
        f3778a = dDoubleValue;
        return java.lang.Integer.toString((int) dDoubleValue);
    }

    public static java.lang.String a(android.content.Context context) {
        java.lang.String string;
        try {
            string = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (java.lang.Throwable unused) {
            string = null;
        }
        return string == null ? "" : string.trim();
    }
}
