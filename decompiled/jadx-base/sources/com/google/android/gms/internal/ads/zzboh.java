package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzboh implements com.google.android.gms.internal.ads.zzcaf {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbnm zza;
    final /* synthetic */ java.lang.Object zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcab zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbok zzd;

    zzboh(com.google.android.gms.internal.ads.zzbok zzbokVar, com.google.android.gms.internal.ads.zzbnm zzbnmVar, java.lang.Object obj, com.google.android.gms.internal.ads.zzcab zzcabVar) {
        this.zza = zzbnmVar;
        this.zzb = obj;
        this.zzc = zzcabVar;
        this.zzd = zzbokVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise fulfilled");
        java.lang.Object obj2 = this.zzb;
        com.google.android.gms.internal.ads.zzcab zzcabVar = this.zzc;
        com.google.android.gms.internal.ads.zzbok.zzd(this.zzd, this.zza, (com.google.android.gms.internal.ads.zzbnt) obj, obj2, zzcabVar);
    }
}
