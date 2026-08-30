package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdqv implements com.google.android.gms.internal.ads.zzher {
    private final com.google.android.gms.internal.ads.zzhfj zza;
    private final com.google.android.gms.internal.ads.zzhfj zzb;
    private final com.google.android.gms.internal.ads.zzhfj zzc;

    public zzdqv(com.google.android.gms.internal.ads.zzhfj zzhfjVar, com.google.android.gms.internal.ads.zzhfj zzhfjVar2, com.google.android.gms.internal.ads.zzhfj zzhfjVar3, com.google.android.gms.internal.ads.zzhfj zzhfjVar4) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
        this.zzc = zzhfjVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        java.util.Set setEmptySet;
        final java.lang.String strZza = ((com.google.android.gms.internal.ads.zzewd) this.zza).zza();
        android.content.Context contextZza = ((com.google.android.gms.internal.ads.zzche) this.zzb).zza();
        com.google.android.gms.internal.ads.zzgcs zzgcsVarZzc = com.google.android.gms.internal.ads.zzffh.zzc();
        java.util.Map mapZzb = ((com.google.android.gms.internal.ads.zzhev) this.zzc).zzb();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzeW)).booleanValue()) {
            com.google.android.gms.internal.ads.zzbbj zzbbjVar = new com.google.android.gms.internal.ads.zzbbj(new com.google.android.gms.internal.ads.zzbbp(contextZza));
            zzbbjVar.zzb(new com.google.android.gms.internal.ads.zzbbi() { // from class: com.google.android.gms.internal.ads.zzdqw
                @Override // com.google.android.gms.internal.ads.zzbbi
                public final void zza(com.google.android.gms.internal.ads.zzbbq.zzt.zza zzaVar) {
                    zzaVar.zzO(strZza);
                }
            });
            setEmptySet = java.util.Collections.singleton(new com.google.android.gms.internal.ads.zzddk(new com.google.android.gms.internal.ads.zzdqy(zzbbjVar, mapZzb), zzgcsVarZzc));
        } else {
            setEmptySet = java.util.Collections.emptySet();
        }
        com.google.android.gms.internal.ads.zzhez.zzb(setEmptySet);
        return setEmptySet;
    }
}
