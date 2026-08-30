package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzblj implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.ads.zzblm zza;

    zzblj(com.google.android.gms.internal.ads.zzblm zzblmVar) {
        this.zza = zzblmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.ads.zzblm.zzc(this.zza);
    }
}
