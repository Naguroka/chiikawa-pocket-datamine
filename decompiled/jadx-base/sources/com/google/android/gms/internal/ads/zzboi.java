package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzboi implements com.google.android.gms.internal.ads.zzcad {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcab zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbnm zzb;

    zzboi(com.google.android.gms.internal.ads.zzbok zzbokVar, com.google.android.gms.internal.ads.zzcab zzcabVar, com.google.android.gms.internal.ads.zzbnm zzbnmVar) {
        this.zza = zzcabVar;
        this.zzb = zzbnmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcad
    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise rejected");
        this.zza.zzd(new com.google.android.gms.internal.ads.zzbnv("Unable to obtain a JavascriptEngine."));
        this.zzb.zzb();
    }
}
