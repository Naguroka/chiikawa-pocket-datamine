package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: loaded from: classes5.dex */
class BatteryState {
    static final int VELOCITY_CHARGING = 2;
    static final int VELOCITY_FULL = 3;
    static final int VELOCITY_UNPLUGGED = 1;
    private final java.lang.Float level;
    private final boolean powerConnected;

    private BatteryState(java.lang.Float f, boolean z) {
        this.powerConnected = z;
        this.level = f;
    }

    boolean isPowerConnected() {
        return this.powerConnected;
    }

    public java.lang.Float getBatteryLevel() {
        return this.level;
    }

    public int getBatteryVelocity() {
        java.lang.Float f;
        if (!this.powerConnected || (f = this.level) == null) {
            return 1;
        }
        return ((double) f.floatValue()) < 0.99d ? 2 : 3;
    }

    public static com.google.firebase.crashlytics.internal.common.BatteryState get(android.content.Context context) {
        boolean zIsPowerConnected = false;
        java.lang.Float level = null;
        try {
            android.content.Intent intentRegisterReceiver = context.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                zIsPowerConnected = isPowerConnected(intentRegisterReceiver);
                level = getLevel(intentRegisterReceiver);
            }
        } catch (java.lang.IllegalStateException e) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().e("An error occurred getting battery state.", e);
        }
        return new com.google.firebase.crashlytics.internal.common.BatteryState(level, zIsPowerConnected);
    }

    private static boolean isPowerConnected(android.content.Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    private static java.lang.Float getLevel(android.content.Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return java.lang.Float.valueOf(intExtra / intExtra2);
    }
}
