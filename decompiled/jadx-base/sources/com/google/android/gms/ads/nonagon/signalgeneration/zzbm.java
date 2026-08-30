package com.google.android.gms.ads.nonagon.signalgeneration;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbm implements com.google.android.gms.internal.ads.zzdee {
    private final com.google.android.gms.ads.nonagon.signalgeneration.zzb zza;
    private final int zzb;
    private final java.lang.String zzc;

    public zzbm(com.google.android.gms.ads.nonagon.signalgeneration.zzb zzbVar, int i, java.lang.String str) {
        this.zza = zzbVar;
        this.zzb = i;
        this.zzc = str;
    }

    final /* synthetic */ void zza(com.google.android.gms.ads.nonagon.signalgeneration.zzbk zzbkVar) {
        this.zza.zzd(this.zzc, zzbkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdee
    public final void zze(final com.google.android.gms.ads.nonagon.signalgeneration.zzbk zzbkVar) {
        if (zzbkVar == null || this.zzb != 2 || android.text.TextUtils.isEmpty(this.zzc)) {
            return;
        }
        com.google.android.gms.ads.internal.util.zzs.zzh(new java.lang.Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbl
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza(zzbkVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdee
    public final void zzf(java.lang.String str) {
    }
}
