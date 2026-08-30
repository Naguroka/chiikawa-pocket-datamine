package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzdty implements com.google.android.gms.internal.ads.zzgcd {
    final /* synthetic */ com.google.android.gms.internal.ads.zzdua zza;

    zzdty(com.google.android.gms.internal.ads.zzdua zzduaVar) {
        this.zza = zzduaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(java.lang.Throwable th) {
        synchronized (this) {
            this.zza.zzc = true;
            this.zza.zzv("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - this.zza.zzd));
            this.zza.zze.zzd(new java.lang.Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(@javax.annotation.Nullable java.lang.Object obj) {
        final java.lang.String str = (java.lang.String) obj;
        synchronized (this) {
            this.zza.zzc = true;
            this.zza.zzv("com.google.android.gms.ads.MobileAds", true, "", (int) (com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - this.zza.zzd));
            this.zza.zzi.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdtx
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.internal.ads.zzdua.zzj(this.zza.zza, str);
                }
            });
        }
    }
}
