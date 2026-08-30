package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdkg implements com.google.android.gms.internal.ads.zzcwn {
    private final com.google.android.gms.internal.ads.zzdif zza;
    private final com.google.android.gms.internal.ads.zzdik zzb;
    private final java.util.concurrent.Executor zzc;
    private final java.util.concurrent.Executor zzd;

    public zzdkg(com.google.android.gms.internal.ads.zzdif zzdifVar, com.google.android.gms.internal.ads.zzdik zzdikVar, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2) {
        this.zza = zzdifVar;
        this.zzb = zzdikVar;
        this.zzc = executor;
        this.zzd = executor2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(final com.google.android.gms.internal.ads.zzcex zzcexVar) {
        this.zzc.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdke
            @Override // java.lang.Runnable
            public final void run() {
                zzcexVar.zzd("onSdkImpression", new androidx.collection.ArrayMap());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void zzr() {
        if (this.zzb.zzd()) {
            com.google.android.gms.internal.ads.zzdif zzdifVar = this.zza;
            com.google.android.gms.internal.ads.zzecr zzecrVarZzu = zzdifVar.zzu();
            if (zzecrVarZzu == null && zzdifVar.zzw() != null && ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfl)).booleanValue()) {
                com.google.android.gms.internal.ads.zzdif zzdifVar2 = this.zza;
                com.google.common.util.concurrent.ListenableFuture listenableFutureZzw = zzdifVar2.zzw();
                com.google.android.gms.internal.ads.zzcab zzcabVarZzp = zzdifVar2.zzp();
                if (listenableFutureZzw == null || zzcabVarZzp == null) {
                    return;
                }
                com.google.android.gms.internal.ads.zzgch.zzr(com.google.android.gms.internal.ads.zzgch.zzl(listenableFutureZzw, zzcabVarZzp), new com.google.android.gms.internal.ads.zzdkf(this), this.zzd);
                return;
            }
            if (zzecrVarZzu != null) {
                com.google.android.gms.internal.ads.zzdif zzdifVar3 = this.zza;
                com.google.android.gms.internal.ads.zzcex zzcexVarZzr = zzdifVar3.zzr();
                com.google.android.gms.internal.ads.zzcex zzcexVarZzs = zzdifVar3.zzs();
                if (zzcexVarZzr == null) {
                    zzcexVarZzr = zzcexVarZzs != null ? zzcexVarZzs : null;
                }
                if (zzcexVarZzr != null) {
                    zzb(zzcexVarZzr);
                }
            }
        }
    }
}
