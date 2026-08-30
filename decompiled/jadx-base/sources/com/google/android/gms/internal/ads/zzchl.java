package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzchl implements com.google.android.gms.internal.ads.zzher {
    private final com.google.android.gms.internal.ads.zzhfj zza;

    public zzchl(com.google.android.gms.internal.ads.zzhfj zzhfjVar, com.google.android.gms.internal.ads.zzhfj zzhfjVar2) {
        this.zza = zzhfjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        java.util.Set setSingleton = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbL)).booleanValue() ? java.util.Collections.singleton(new com.google.android.gms.internal.ads.zzddk((com.google.android.gms.internal.ads.zzduc) this.zza.zzb(), com.google.android.gms.internal.ads.zzffh.zzc())) : java.util.Collections.emptySet();
        com.google.android.gms.internal.ads.zzhez.zzb(setSingleton);
        return setSingleton;
    }
}
