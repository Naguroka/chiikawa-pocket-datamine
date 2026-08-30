package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzciw implements com.google.android.gms.internal.ads.zzdsz {
    private final java.lang.Long zza;
    private final java.lang.String zzb;
    private final com.google.android.gms.internal.ads.zzcih zzc;
    private final com.google.android.gms.internal.ads.zzciy zzd;

    /* synthetic */ zzciw(com.google.android.gms.internal.ads.zzcih zzcihVar, com.google.android.gms.internal.ads.zzciy zzciyVar, java.lang.Long l, java.lang.String str, com.google.android.gms.internal.ads.zzcjm zzcjmVar) {
        this.zzc = zzcihVar;
        this.zzd = zzciyVar;
        this.zza = l;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdsz
    public final com.google.android.gms.internal.ads.zzdtj zza() {
        com.google.android.gms.internal.ads.zzciy zzciyVar = this.zzd;
        return com.google.android.gms.internal.ads.zzdtk.zza(this.zza.longValue(), zzciyVar.zza, com.google.android.gms.internal.ads.zzdtd.zzc(zzciyVar.zzb), this.zzc, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdsz
    public final com.google.android.gms.internal.ads.zzdtn zzb() {
        com.google.android.gms.internal.ads.zzciy zzciyVar = this.zzd;
        return com.google.android.gms.internal.ads.zzdto.zza(this.zza.longValue(), zzciyVar.zza, com.google.android.gms.internal.ads.zzdtd.zzc(zzciyVar.zzb), this.zzc, this.zzb);
    }
}
