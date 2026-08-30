package com.google.android.gms.ads.identifier;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzb extends java.lang.Thread {
    final java.util.concurrent.CountDownLatch zza = new java.util.concurrent.CountDownLatch(1);
    boolean zzb = false;
    private final java.lang.ref.WeakReference<com.google.android.gms.ads.identifier.AdvertisingIdClient> zzc;
    private final long zzd;

    public zzb(com.google.android.gms.ads.identifier.AdvertisingIdClient advertisingIdClient, long j) {
        this.zzc = new java.lang.ref.WeakReference<>(advertisingIdClient);
        this.zzd = j;
        start();
    }

    private final void zza() {
        com.google.android.gms.ads.identifier.AdvertisingIdClient advertisingIdClient = this.zzc.get();
        if (advertisingIdClient != null) {
            advertisingIdClient.zza();
            this.zzb = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.zza.await(this.zzd, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                return;
            }
            zza();
        } catch (java.lang.InterruptedException unused) {
            zza();
        }
    }
}
