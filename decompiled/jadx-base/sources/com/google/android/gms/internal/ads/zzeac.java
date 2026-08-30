package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeac {
    private final com.google.android.gms.internal.ads.zzdzy zza;
    private final com.google.android.gms.internal.ads.zzgcs zzb;

    public zzeac(com.google.android.gms.internal.ads.zzdzy zzdzyVar, com.google.android.gms.internal.ads.zzgcs zzgcsVar) {
        this.zza = zzdzyVar;
        this.zzb = zzgcsVar;
    }

    public final void zza(com.google.android.gms.internal.ads.zzffr zzffrVar) {
        final com.google.android.gms.internal.ads.zzdzy zzdzyVar = this.zza;
        java.util.Objects.requireNonNull(zzdzyVar);
        com.google.android.gms.internal.ads.zzgch.zzr(this.zzb.zzb(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzeaa
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return zzdzyVar.getWritableDatabase();
            }
        }), new com.google.android.gms.internal.ads.zzeab(this, zzffrVar), this.zzb);
    }
}
