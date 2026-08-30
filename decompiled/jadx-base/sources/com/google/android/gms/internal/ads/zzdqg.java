package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdqg implements com.google.android.gms.internal.ads.zzher {
    private final com.google.android.gms.internal.ads.zzhfj zza;

    public zzdqg(com.google.android.gms.internal.ads.zzhfj zzhfjVar, com.google.android.gms.internal.ads.zzhfj zzhfjVar2) {
        this.zza = zzhfjVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        com.google.android.gms.internal.ads.zzgcs zzgcsVarZzc = com.google.android.gms.internal.ads.zzffh.zzc();
        java.util.Set setSingleton = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzeW)).booleanValue() ? java.util.Collections.singleton(new com.google.android.gms.internal.ads.zzddk(((com.google.android.gms.internal.ads.zzdqz) this.zza).zzb(), zzgcsVarZzc)) : java.util.Collections.emptySet();
        com.google.android.gms.internal.ads.zzhez.zzb(setSingleton);
        return setSingleton;
    }
}
