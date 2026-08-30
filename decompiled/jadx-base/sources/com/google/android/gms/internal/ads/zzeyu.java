package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeyu implements com.google.android.gms.internal.ads.zzezf {
    private com.google.android.gms.internal.ads.zzcuz zza;

    @Override // com.google.android.gms.internal.ads.zzezf
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized com.google.android.gms.internal.ads.zzcuz zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzezf
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzezg zzezgVar, com.google.android.gms.internal.ads.zzeze zzezeVar, java.lang.Object obj) {
        return zzb(zzezgVar, zzezeVar, null);
    }

    public final synchronized com.google.common.util.concurrent.ListenableFuture zzb(com.google.android.gms.internal.ads.zzezg zzezgVar, com.google.android.gms.internal.ads.zzeze zzezeVar, com.google.android.gms.internal.ads.zzcuz zzcuzVar) {
        com.google.android.gms.internal.ads.zzcsd zzcsdVarZzb;
        try {
            if (zzcuzVar != null) {
                this.zza = zzcuzVar;
            } else {
                this.zza = (com.google.android.gms.internal.ads.zzcuz) zzezeVar.zza(zzezgVar.zzb).zzh();
            }
            zzcsdVarZzb = this.zza.zzb();
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return zzcsdVarZzb.zzh(zzcsdVarZzb.zzi());
    }
}
