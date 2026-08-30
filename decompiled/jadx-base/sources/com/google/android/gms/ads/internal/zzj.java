package com.google.android.gms.ads.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzj implements com.google.android.gms.internal.ads.zzfol {
    final /* synthetic */ com.google.android.gms.ads.internal.zzk zza;

    zzj(com.google.android.gms.ads.internal.zzk zzkVar) {
        this.zza = zzkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfol
    public final void zza(int i, long j) {
        this.zza.zzi.zzd(i, java.lang.System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzfol
    public final void zzb(int i, long j, java.lang.String str) {
        this.zza.zzi.zze(i, java.lang.System.currentTimeMillis() - j, str);
    }
}
