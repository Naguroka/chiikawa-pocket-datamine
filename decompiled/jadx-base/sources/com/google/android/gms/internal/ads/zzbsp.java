package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbsp extends com.google.android.gms.internal.ads.zzbhc {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbsr zza;

    /* synthetic */ zzbsp(com.google.android.gms.internal.ads.zzbsr zzbsrVar, com.google.android.gms.internal.ads.zzbsq zzbsqVar) {
        this.zza = zzbsrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final void zze(com.google.android.gms.internal.ads.zzbgq zzbgqVar) {
        com.google.android.gms.internal.ads.zzbsr zzbsrVar = this.zza;
        zzbsrVar.zza.onCustomFormatAdLoaded(zzbsrVar.zzf(zzbgqVar));
    }
}
