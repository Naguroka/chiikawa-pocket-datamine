package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzban implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbar zza;

    zzban(com.google.android.gms.internal.ads.zzbar zzbarVar) {
        this.zza = zzbarVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.ads.zzbar.zzh(this.zza);
    }
}
