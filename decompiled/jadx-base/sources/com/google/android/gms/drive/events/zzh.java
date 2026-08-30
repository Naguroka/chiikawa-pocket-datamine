package com.google.android.gms.drive.events;

/* JADX INFO: loaded from: classes4.dex */
final class zzh extends java.lang.Thread {
    private final /* synthetic */ java.util.concurrent.CountDownLatch zzcn;
    private final /* synthetic */ com.google.android.gms.drive.events.DriveEventService zzco;

    zzh(com.google.android.gms.drive.events.DriveEventService driveEventService, java.util.concurrent.CountDownLatch countDownLatch) {
        this.zzco = driveEventService;
        this.zzcn = countDownLatch;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            android.os.Looper.prepare();
            this.zzco.zzck = new com.google.android.gms.drive.events.DriveEventService.zza(this.zzco, null);
            this.zzco.zzcl = false;
            this.zzcn.countDown();
            android.os.Looper.loop();
        } finally {
            if (this.zzco.zzcj != null) {
                this.zzco.zzcj.countDown();
            }
        }
    }
}
