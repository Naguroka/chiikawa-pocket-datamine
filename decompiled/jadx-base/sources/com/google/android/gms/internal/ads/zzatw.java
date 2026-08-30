package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzatw implements java.lang.Runnable {
    private zzatw() {
        throw null;
    }

    /* synthetic */ zzatw(com.google.android.gms.internal.ads.zzatx zzatxVar) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.CountDownLatch countDownLatch;
        try {
            com.google.android.gms.internal.ads.zzaty.zzd = java.security.MessageDigest.getInstance("MD5");
            countDownLatch = com.google.android.gms.internal.ads.zzaty.zzb;
        } catch (java.security.NoSuchAlgorithmException unused) {
            countDownLatch = com.google.android.gms.internal.ads.zzaty.zzb;
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.ads.zzaty.zzb.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
