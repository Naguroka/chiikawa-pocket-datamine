package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbso extends com.google.android.gms.internal.ads.zzbgz {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbsr zza;

    /* synthetic */ zzbso(com.google.android.gms.internal.ads.zzbsr zzbsrVar, com.google.android.gms.internal.ads.zzbsq zzbsqVar) {
        this.zza = zzbsrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void zze(com.google.android.gms.internal.ads.zzbgq zzbgqVar, java.lang.String str) {
        com.google.android.gms.internal.ads.zzbsr zzbsrVar = this.zza;
        if (zzbsrVar.zzb == null) {
            return;
        }
        zzbsrVar.zzb.onCustomClick(zzbsrVar.zzf(zzbgqVar), str);
    }
}
