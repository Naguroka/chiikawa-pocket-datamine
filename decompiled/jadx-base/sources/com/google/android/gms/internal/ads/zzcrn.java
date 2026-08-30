package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzcrn implements com.google.android.gms.internal.ads.zzgcd {
    final /* synthetic */ com.google.android.gms.internal.ads.zzgcd zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcro zzb;

    zzcrn(com.google.android.gms.internal.ads.zzcro zzcroVar, com.google.android.gms.internal.ads.zzgcd zzgcdVar) {
        this.zza = zzgcdVar;
        this.zzb = zzcroVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(java.lang.Throwable th) {
        com.google.android.gms.internal.ads.zzbzw.zzf.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcri
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd();
            }
        });
        this.zza.zza(th);
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzbzw.zzf.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcri
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd();
            }
        });
        this.zza.zzb((com.google.android.gms.internal.ads.zzcqz) obj);
    }
}
