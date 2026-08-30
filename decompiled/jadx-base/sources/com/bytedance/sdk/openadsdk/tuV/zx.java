package com.bytedance.sdk.openadsdk.tuV;

/* JADX INFO: loaded from: classes4.dex */
public class zx {
    protected static java.lang.String IL = null;
    public static int Kg = 2;
    public static int PX = 32;
    public static int VB = 16;
    public static int WR = 4;
    protected static int bX = 1;
    protected static java.lang.String bg = "images";
    public static int eo = 8;
    protected static int eqN = 30;
    public static int iR = 1;
    public static int ldr = 0;
    protected static long zx = 15360;

    protected static boolean bg(android.content.Context context, java.lang.String str) {
        return false;
    }

    protected static android.graphics.Bitmap bg(java.lang.String str) {
        byte[] bArrDecode = android.util.Base64.decode(str, 2);
        return android.graphics.BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
    }

    public static boolean bg(android.content.Context context, int i) {
        boolean zBg;
        boolean zBg2;
        if (ldr == 0) {
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                zBg = bg(context, "android.permission.READ_MEDIA_IMAGES");
                zBg2 = true;
            } else {
                zBg = bg(context, "android.permission.READ_EXTERNAL_STORAGE");
                zBg2 = bg(context, "android.permission.WRITE_EXTERNAL_STORAGE");
            }
            boolean zBg3 = bg(context, "android.permission.CAMERA");
            boolean zBg4 = bg(context, "android.permission.RECORD_AUDIO");
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            if (zBg && zBg2) {
                ldr |= iR;
            }
            if (zBg3 && packageManager.hasSystemFeature("android.hardware.camera")) {
                ldr |= Kg;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.gyroscope")) {
                ldr |= WR;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.accelerometer")) {
                ldr |= eo;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.compass")) {
                ldr |= VB;
            }
            if (zBg4 && packageManager.hasSystemFeature("android.hardware.microphone")) {
                ldr |= PX;
            }
        }
        return (ldr & i) != 0;
    }

    public static boolean bg(android.content.Context context) {
        boolean z;
        boolean z2;
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            z = context.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0;
        } else {
            z = context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0;
            if (context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                z2 = false;
            }
            return !z2 && z;
        }
        z2 = true;
        if (z2) {
        }
    }

    public static boolean IL(android.content.Context context, java.lang.String str) {
        return context.checkSelfPermission(str) == 0;
    }

    public static float IL(android.content.Context context) {
        if (context == null) {
            return 0.0f;
        }
        return context.getResources().getDisplayMetrics().density;
    }
}
