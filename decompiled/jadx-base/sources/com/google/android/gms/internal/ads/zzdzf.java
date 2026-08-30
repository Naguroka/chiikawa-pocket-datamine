package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzdzf implements com.google.android.gms.internal.ads.zzgcd {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbuu zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbvd zzb;

    zzdzf(com.google.android.gms.internal.ads.zzdzl zzdzlVar, com.google.android.gms.internal.ads.zzbvd zzbvdVar, com.google.android.gms.internal.ads.zzbuu zzbuuVar) {
        this.zzb = zzbvdVar;
        this.zza = zzbuuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(java.lang.Throwable th) {
        try {
            this.zzb.zze(com.google.android.gms.ads.internal.util.zzbb.zzb(th));
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        try {
            this.zzb.zzf((java.lang.String) obj, this.zza);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e);
        }
    }
}
