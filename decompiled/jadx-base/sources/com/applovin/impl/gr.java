package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class gr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.os.PowerManager f833a;
    private android.os.PowerManager.WakeLock b;
    private boolean c;
    private boolean d;

    public gr(android.content.Context context) {
        this.f833a = (android.os.PowerManager) context.getApplicationContext().getSystemService("power");
    }

    public void a(boolean z) {
        if (z && this.b == null) {
            android.os.PowerManager powerManager = this.f833a;
            if (powerManager == null) {
                com.applovin.impl.oc.d("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            } else {
                android.os.PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                this.b = wakeLockNewWakeLock;
                wakeLockNewWakeLock.setReferenceCounted(false);
            }
        }
        this.c = z;
        a();
    }

    public void b(boolean z) {
        this.d = z;
        a();
    }

    private void a() {
        android.os.PowerManager.WakeLock wakeLock = this.b;
        if (wakeLock == null) {
            return;
        }
        if (this.c && this.d) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }
}
