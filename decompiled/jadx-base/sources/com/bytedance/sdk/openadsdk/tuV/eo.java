package com.bytedance.sdk.openadsdk.tuV;

/* JADX INFO: loaded from: classes4.dex */
public class eo {
    public static java.lang.ref.WeakReference<com.bytedance.sdk.openadsdk.tuV.bg> bg;
    protected static final float[] IL = new float[3];
    protected static final float[] bX = new float[3];
    protected static final float[] eqN = new float[9];
    protected static final float[] zx = new float[3];

    public static void bg(android.content.Context context, android.hardware.SensorEventListener sensorEventListener) {
    }

    public static void bg(com.bytedance.sdk.openadsdk.tuV.bg bgVar) {
        bg = new java.lang.ref.WeakReference<>(bgVar);
    }

    public static void bg(android.content.Context context, android.hardware.SensorEventListener sensorEventListener, int i) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            java.lang.ref.WeakReference<com.bytedance.sdk.openadsdk.tuV.bg> weakReference = bg;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.openadsdk.tuV.iR.bg("SensorHub", "startListenAccelerometer error", th);
        }
    }

    public static void IL(android.content.Context context, android.hardware.SensorEventListener sensorEventListener, int i) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            java.lang.ref.WeakReference<com.bytedance.sdk.openadsdk.tuV.bg> weakReference = bg;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.openadsdk.tuV.iR.bg("SensorHub", "startListenGyroscope error", th);
        }
    }

    public static void bX(android.content.Context context, android.hardware.SensorEventListener sensorEventListener, int i) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            java.lang.ref.WeakReference<com.bytedance.sdk.openadsdk.tuV.bg> weakReference = bg;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.openadsdk.tuV.iR.bg("SensorHub", "startListenLinearAcceleration error", th);
        }
    }

    public static void eqN(android.content.Context context, android.hardware.SensorEventListener sensorEventListener, int i) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            java.lang.ref.WeakReference<com.bytedance.sdk.openadsdk.tuV.bg> weakReference = bg;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.openadsdk.tuV.iR.bg("SensorHub", "startListenRotationVector err", th);
        }
    }

    public static void bg(android.content.Context context, long j) {
        if (context == null) {
            return;
        }
        ((android.os.Vibrator) context.getSystemService("vibrator")).vibrate(j);
    }
}
