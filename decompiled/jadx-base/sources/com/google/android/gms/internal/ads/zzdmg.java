package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdmg {
    private final java.util.concurrent.Executor zza;
    private final com.google.android.gms.internal.ads.zzcnr zzb;
    private final com.google.android.gms.internal.ads.zzddm zzc;
    private final com.google.android.gms.internal.ads.zzcmk zzd;

    zzdmg(java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzcnr zzcnrVar, com.google.android.gms.internal.ads.zzddm zzddmVar, com.google.android.gms.internal.ads.zzcmk zzcmkVar) {
        this.zza = executor;
        this.zzc = zzddmVar;
        this.zzb = zzcnrVar;
        this.zzd = zzcmkVar;
    }

    public final void zza(final com.google.android.gms.internal.ads.zzcex zzcexVar) {
        if (zzcexVar == null) {
            return;
        }
        this.zzc.zza(zzcexVar.zzF());
        this.zzc.zzo(new com.google.android.gms.internal.ads.zzayk() { // from class: com.google.android.gms.internal.ads.zzdmc
            @Override // com.google.android.gms.internal.ads.zzayk
            public final void zzdn(com.google.android.gms.internal.ads.zzayj zzayjVar) {
                com.google.android.gms.internal.ads.zzcgp zzcgpVarZzN = zzcexVar.zzN();
                android.graphics.Rect rect = zzayjVar.zzd;
                zzcgpVarZzN.zzr(rect.left, rect.top, false);
            }
        }, this.zza);
        this.zzc.zzo(new com.google.android.gms.internal.ads.zzayk() { // from class: com.google.android.gms.internal.ads.zzdmd
            @Override // com.google.android.gms.internal.ads.zzayk
            public final void zzdn(com.google.android.gms.internal.ads.zzayj zzayjVar) {
                java.util.HashMap map = new java.util.HashMap();
                map.put(com.json.pg.k, true != zzayjVar.zzj ? "0" : "1");
                zzcexVar.zzd("onAdVisibilityChanged", map);
            }
        }, this.zza);
        this.zzc.zzo(this.zzb, this.zza);
        this.zzb.zzf(zzcexVar);
        com.google.android.gms.internal.ads.zzcgp zzcgpVarZzN = zzcexVar.zzN();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjY)).booleanValue() && zzcgpVarZzN != null) {
            zzcgpVarZzN.zzL(this.zzd);
            zzcgpVarZzN.zzM(this.zzd, null, null);
        }
        zzcexVar.zzag("/trackActiveViewUnit", new com.google.android.gms.internal.ads.zzbjp() { // from class: com.google.android.gms.internal.ads.zzdme
            @Override // com.google.android.gms.internal.ads.zzbjp
            public final void zza(java.lang.Object obj, java.util.Map map) {
                this.zza.zzb((com.google.android.gms.internal.ads.zzcex) obj, map);
            }
        });
        zzcexVar.zzag("/untrackActiveViewUnit", new com.google.android.gms.internal.ads.zzbjp() { // from class: com.google.android.gms.internal.ads.zzdmf
            @Override // com.google.android.gms.internal.ads.zzbjp
            public final void zza(java.lang.Object obj, java.util.Map map) {
                this.zza.zzc((com.google.android.gms.internal.ads.zzcex) obj, map);
            }
        });
    }

    final /* synthetic */ void zzb(com.google.android.gms.internal.ads.zzcex zzcexVar, java.util.Map map) {
        this.zzb.zzb();
    }

    final /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzcex zzcexVar, java.util.Map map) {
        this.zzb.zza();
    }
}
