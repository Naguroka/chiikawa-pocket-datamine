package com.google.android.gms.ads.nonagon.signalgeneration;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbf implements com.google.android.gms.internal.ads.zzher {
    private final com.google.android.gms.internal.ads.zzhfj zza;
    private final com.google.android.gms.internal.ads.zzhfj zzb;
    private final com.google.android.gms.internal.ads.zzhfj zzc;

    public zzbf(com.google.android.gms.internal.ads.zzhfj zzhfjVar, com.google.android.gms.internal.ads.zzhfj zzhfjVar2, com.google.android.gms.internal.ads.zzhfj zzhfjVar3, com.google.android.gms.internal.ads.zzhfj zzhfjVar4) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
        this.zzc = zzhfjVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        java.lang.Object obj = (com.google.android.gms.ads.nonagon.signalgeneration.zzw) this.zza.zzb();
        com.google.android.gms.ads.nonagon.signalgeneration.zzbm zzbmVar = (com.google.android.gms.ads.nonagon.signalgeneration.zzbm) this.zzb.zzb();
        com.google.android.gms.internal.ads.zzgcs zzgcsVarZzc = com.google.android.gms.internal.ads.zzffh.zzc();
        if (((java.lang.Integer) this.zzc.zzb()).intValue() == 2) {
            obj = zzbmVar;
        }
        return new com.google.android.gms.internal.ads.zzddk(obj, zzgcsVarZzc);
    }
}
