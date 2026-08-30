package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class zzdeu {
    private final com.google.android.gms.internal.ads.zzdgc zza;
    private final com.google.android.gms.internal.ads.zzcex zzb;

    public zzdeu(com.google.android.gms.internal.ads.zzdgc zzdgcVar, com.google.android.gms.internal.ads.zzcex zzcexVar) {
        this.zza = zzdgcVar;
        this.zzb = zzcexVar;
    }

    public final android.view.View zza() {
        com.google.android.gms.internal.ads.zzcex zzcexVar = this.zzb;
        if (zzcexVar == null) {
            return null;
        }
        return zzcexVar.zzG();
    }

    public final android.view.View zzb() {
        com.google.android.gms.internal.ads.zzcex zzcexVar = this.zzb;
        if (zzcexVar != null) {
            return zzcexVar.zzG();
        }
        return null;
    }

    public final com.google.android.gms.internal.ads.zzcex zzc() {
        return this.zzb;
    }

    public final com.google.android.gms.internal.ads.zzddk zzd(java.util.concurrent.Executor executor) {
        final com.google.android.gms.internal.ads.zzcex zzcexVar = this.zzb;
        return new com.google.android.gms.internal.ads.zzddk(new com.google.android.gms.internal.ads.zzdai() { // from class: com.google.android.gms.internal.ads.zzdet
            @Override // com.google.android.gms.internal.ads.zzdai
            public final void zza() {
                com.google.android.gms.ads.internal.overlay.zzm zzmVarZzL;
                com.google.android.gms.internal.ads.zzcex zzcexVar2 = zzcexVar;
                if (zzcexVar2 == null || (zzmVarZzL = zzcexVar2.zzL()) == null) {
                    return;
                }
                zzmVarZzL.zzb();
            }
        }, executor);
    }

    public final com.google.android.gms.internal.ads.zzdgc zze() {
        return this.zza;
    }

    public java.util.Set zzf(com.google.android.gms.internal.ads.zzcuo zzcuoVar) {
        return java.util.Collections.singleton(new com.google.android.gms.internal.ads.zzddk(zzcuoVar, com.google.android.gms.internal.ads.zzbzw.zzg));
    }

    public java.util.Set zzg(com.google.android.gms.internal.ads.zzcuo zzcuoVar) {
        return java.util.Collections.singleton(new com.google.android.gms.internal.ads.zzddk(zzcuoVar, com.google.android.gms.internal.ads.zzbzw.zzg));
    }
}
