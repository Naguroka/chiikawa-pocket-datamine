package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeyv implements com.google.android.gms.internal.ads.zzezf {
    private final com.google.android.gms.internal.ads.zzezf zza;
    private com.google.android.gms.internal.ads.zzcuz zzb;

    public zzeyv(com.google.android.gms.internal.ads.zzezf zzezfVar) {
        this.zza = zzezfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzezf
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized com.google.android.gms.internal.ads.zzcuz zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzezf
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzezg zzezgVar, com.google.android.gms.internal.ads.zzeze zzezeVar, java.lang.Object obj) {
        return zzb(zzezgVar, zzezeVar, null);
    }

    public final synchronized com.google.common.util.concurrent.ListenableFuture zzb(com.google.android.gms.internal.ads.zzezg zzezgVar, com.google.android.gms.internal.ads.zzeze zzezeVar, com.google.android.gms.internal.ads.zzcuz zzcuzVar) {
        this.zzb = zzcuzVar;
        if (zzcuzVar == null || zzezgVar.zza == null) {
            return ((com.google.android.gms.internal.ads.zzeyu) this.zza).zzb(zzezgVar, zzezeVar, zzcuzVar);
        }
        com.google.android.gms.internal.ads.zzbvk zzbvkVar = zzezgVar.zza;
        com.google.android.gms.internal.ads.zzcsd zzcsdVarZzb = zzcuzVar.zzb();
        return zzcsdVarZzb.zzh(zzcsdVarZzb.zzj(com.google.android.gms.internal.ads.zzgch.zzh(zzbvkVar)));
    }
}
