package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzdya implements com.google.android.gms.internal.ads.zzcyq {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzbyi zzb;

    zzdya(android.content.Context context, com.google.android.gms.internal.ads.zzbyi zzbyiVar) {
        this.zza = context;
        this.zzb = zzbyiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzdl(com.google.android.gms.internal.ads.zzbvk zzbvkVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzdm(com.google.android.gms.internal.ads.zzfca zzfcaVar) {
        if (android.text.TextUtils.isEmpty(zzfcaVar.zzb.zzb.zze)) {
            return;
        }
        this.zzb.zzm(this.zza, zzfcaVar.zza.zza.zzd);
        this.zzb.zzi(this.zza, zzfcaVar.zzb.zzb.zze);
    }
}
