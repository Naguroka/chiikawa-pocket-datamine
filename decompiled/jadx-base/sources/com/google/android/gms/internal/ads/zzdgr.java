package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdgr implements com.google.android.gms.internal.ads.zzher {
    private final com.google.android.gms.internal.ads.zzhfj zza;

    public zzdgr(com.google.android.gms.internal.ads.zzhfj zzhfjVar) {
        this.zza = zzhfjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        java.util.Set setSingleton = ((com.google.android.gms.internal.ads.zzdgo) this.zza).zza().zze() != null ? java.util.Collections.singleton("banner") : java.util.Collections.emptySet();
        com.google.android.gms.internal.ads.zzhez.zzb(setSingleton);
        return setSingleton;
    }
}
