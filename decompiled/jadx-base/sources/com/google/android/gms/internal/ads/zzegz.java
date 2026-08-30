package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzegz {
    private com.google.android.gms.internal.ads.zzegq zza;

    zzegz() {
    }

    private zzegz(com.google.android.gms.internal.ads.zzegq zzegqVar) {
        this.zza = zzegqVar;
    }

    public static com.google.android.gms.internal.ads.zzegz zzb(com.google.android.gms.internal.ads.zzegq zzegqVar) {
        return new com.google.android.gms.internal.ads.zzegz(zzegqVar);
    }

    public final com.google.android.gms.internal.ads.zzegq zza(com.google.android.gms.common.util.Clock clock, com.google.android.gms.internal.ads.zzegs zzegsVar, com.google.android.gms.internal.ads.zzedb zzedbVar, com.google.android.gms.internal.ads.zzfja zzfjaVar) {
        com.google.android.gms.internal.ads.zzegq zzegqVar = this.zza;
        return zzegqVar != null ? zzegqVar : new com.google.android.gms.internal.ads.zzegq(clock, zzegsVar, zzedbVar, zzfjaVar);
    }
}
