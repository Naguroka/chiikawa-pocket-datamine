package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzdxp implements com.google.android.gms.internal.ads.zzgcd {
    final /* synthetic */ android.content.Context zza;

    zzdxp(android.content.Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(java.lang.Throwable th) {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbed.zzh.zze()).booleanValue() && (th instanceof com.google.android.gms.ads.internal.util.zzba)) {
            com.google.android.gms.internal.ads.zzbbv.zze(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbed.zzj.zze()).booleanValue()) {
            com.google.android.gms.internal.ads.zzbbv.zze(this.zza);
        }
    }
}
