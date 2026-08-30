package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzcas implements java.lang.Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcaw zzc;

    zzcas(com.google.android.gms.internal.ads.zzcaw zzcawVar, int i, int i2) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = zzcawVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.ads.zzcaw zzcawVar = this.zzc;
        if (zzcawVar.zzq != null) {
            zzcawVar.zzq.zzj(this.zza, this.zzb);
        }
    }
}
