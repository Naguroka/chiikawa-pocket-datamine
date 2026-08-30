package com.pgl.ssdk;

/* JADX INFO: loaded from: classes3.dex */
public class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f3780a;
    public static int b;
    private static int c;
    public static int d;
    private static int e;
    private static int f;

    private static void a(android.content.Context context) {
        if (context == null) {
            return;
        }
        try {
            new android.util.DisplayMetrics();
            android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            c = (int) displayMetrics.density;
            d = displayMetrics.densityDpi;
        } catch (java.lang.Throwable unused) {
        }
    }

    private static void b(android.content.Context context) {
        try {
            new android.util.DisplayMetrics();
            android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            e = (int) displayMetrics.xdpi;
            f = (int) displayMetrics.ydpi;
        } catch (java.lang.Throwable unused) {
        }
    }

    private static void c(android.content.Context context) {
        try {
            android.view.Display defaultDisplay = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay();
            android.graphics.Point point = new android.graphics.Point();
            defaultDisplay.getRealSize(point);
            f3780a = point.x;
            b = point.y;
        } catch (java.lang.Throwable unused) {
        }
    }

    public static java.lang.String d(android.content.Context context) {
        int i = -1;
        if (context != null) {
            try {
                i = android.provider.Settings.System.getInt(context.getContentResolver(), "screen_brightness", -1);
            } catch (java.lang.Throwable unused) {
            }
        }
        return java.lang.String.valueOf(i);
    }

    public static java.lang.String e(android.content.Context context) {
        try {
            c(context);
            a(context);
            b(context);
        } catch (java.lang.Throwable unused) {
        }
        return d + "[<!>]" + f3780a + "," + b + "[<!>]";
    }
}
