package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfmr implements java.lang.Runnable {
    zzfmr() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (com.google.android.gms.internal.ads.zzfmu.zzc != null) {
            com.google.android.gms.internal.ads.zzfmu.zzc.post(com.google.android.gms.internal.ads.zzfmu.zzd);
            com.google.android.gms.internal.ads.zzfmu.zzc.postDelayed(com.google.android.gms.internal.ads.zzfmu.zze, 200L);
        }
    }
}
