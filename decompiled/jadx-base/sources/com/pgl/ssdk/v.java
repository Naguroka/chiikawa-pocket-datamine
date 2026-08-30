package com.pgl.ssdk;

/* JADX INFO: loaded from: classes3.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f3812a = -1;
    public static int b = -1;

    static class a implements java.lang.Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.pgl.ssdk.v.b = com.pgl.ssdk.v.b(com.pgl.ssdk.x.b());
            android.content.SharedPreferences sharedPreferencesA = com.pgl.ssdk.u0.a(com.pgl.ssdk.x.b());
            if (sharedPreferencesA != null) {
                sharedPreferencesA.edit().putInt("camera_count", com.pgl.ssdk.v.b).apply();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(android.content.Context context) {
        int i = b;
        if (i != -1) {
            return i;
        }
        android.hardware.camera2.CameraManager cameraManager = (android.hardware.camera2.CameraManager) context.getSystemService("camera");
        if (cameraManager != null) {
            try {
                b = cameraManager.getCameraIdList().length;
            } catch (java.lang.Throwable unused) {
                b = -1;
            }
        } else {
            b = -2;
        }
        return b;
    }

    public static int c(android.content.Context context) {
        android.telephony.TelephonyManager telephonyManager;
        if (f3812a == -1 && (telephonyManager = (android.telephony.TelephonyManager) context.getSystemService("phone")) != null) {
            f3812a = telephonyManager.getSimState();
        }
        return f3812a;
    }

    public static int a() {
        int i;
        int i2 = b;
        if (i2 != -1) {
            return i2;
        }
        android.content.SharedPreferences sharedPreferencesA = com.pgl.ssdk.u0.a(com.pgl.ssdk.x.b());
        if (sharedPreferencesA == null || (i = sharedPreferencesA.getInt("camera_count", -1)) == -1) {
            com.pgl.ssdk.o0.b(new com.pgl.ssdk.v.a());
            return -1;
        }
        b = i;
        return i;
    }
}
