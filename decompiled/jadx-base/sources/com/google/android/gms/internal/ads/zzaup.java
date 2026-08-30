package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaup implements com.google.android.gms.internal.ads.zzfol {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfni zza;

    zzaup(com.google.android.gms.internal.ads.zzfni zzfniVar) {
        this.zza = zzfniVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfol
    public final void zza(int i, long j) {
        this.zza.zzd(i, java.lang.System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzfol
    public final void zzb(int i, long j, java.lang.String str) {
        this.zza.zze(i, java.lang.System.currentTimeMillis() - j, str);
    }
}
