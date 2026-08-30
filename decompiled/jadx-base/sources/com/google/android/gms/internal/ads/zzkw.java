package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzkw implements com.google.android.gms.internal.ads.zzur, com.google.android.gms.internal.ads.zzrb {
    final /* synthetic */ com.google.android.gms.internal.ads.zzla zza;
    private final com.google.android.gms.internal.ads.zzky zzb;

    public zzkw(com.google.android.gms.internal.ads.zzla zzlaVar, com.google.android.gms.internal.ads.zzky zzkyVar) {
        this.zza = zzlaVar;
        this.zzb = zzkyVar;
    }

    private final android.util.Pair zzf(int i, com.google.android.gms.internal.ads.zzug zzugVar) {
        com.google.android.gms.internal.ads.zzug zzugVarZza;
        com.google.android.gms.internal.ads.zzug zzugVar2 = null;
        if (zzugVar != null) {
            com.google.android.gms.internal.ads.zzky zzkyVar = this.zzb;
            int i2 = 0;
            while (true) {
                if (i2 >= zzkyVar.zzc.size()) {
                    zzugVarZza = null;
                    break;
                }
                if (((com.google.android.gms.internal.ads.zzug) zzkyVar.zzc.get(i2)).zzd == zzugVar.zzd) {
                    zzugVarZza = zzugVar.zza(android.util.Pair.create(zzkyVar.zzb, zzugVar.zza));
                    break;
                }
                i2++;
            }
            if (zzugVarZza == null) {
                return null;
            }
            zzugVar2 = zzugVarZza;
        }
        return android.util.Pair.create(java.lang.Integer.valueOf(this.zzb.zzd), zzugVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzaf(int i, com.google.android.gms.internal.ads.zzug zzugVar, final com.google.android.gms.internal.ads.zzuc zzucVar) {
        final android.util.Pair pairZzf = zzf(0, zzugVar);
        if (pairZzf != null) {
            this.zza.zzi.zzh(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzku
                @Override // java.lang.Runnable
                public final void run() {
                    android.util.Pair pair = pairZzf;
                    this.zza.zza.zzh.zzaf(((java.lang.Integer) pair.first).intValue(), (com.google.android.gms.internal.ads.zzug) pair.second, zzucVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzag(int i, com.google.android.gms.internal.ads.zzug zzugVar, final com.google.android.gms.internal.ads.zztx zztxVar, final com.google.android.gms.internal.ads.zzuc zzucVar) {
        final android.util.Pair pairZzf = zzf(0, zzugVar);
        if (pairZzf != null) {
            this.zza.zzi.zzh(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzks
                @Override // java.lang.Runnable
                public final void run() {
                    android.util.Pair pair = pairZzf;
                    this.zza.zza.zzh.zzag(((java.lang.Integer) pair.first).intValue(), (com.google.android.gms.internal.ads.zzug) pair.second, zztxVar, zzucVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzah(int i, com.google.android.gms.internal.ads.zzug zzugVar, final com.google.android.gms.internal.ads.zztx zztxVar, final com.google.android.gms.internal.ads.zzuc zzucVar) {
        final android.util.Pair pairZzf = zzf(0, zzugVar);
        if (pairZzf != null) {
            this.zza.zzi.zzh(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzkv
                @Override // java.lang.Runnable
                public final void run() {
                    android.util.Pair pair = pairZzf;
                    this.zza.zza.zzh.zzah(((java.lang.Integer) pair.first).intValue(), (com.google.android.gms.internal.ads.zzug) pair.second, zztxVar, zzucVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzai(int i, com.google.android.gms.internal.ads.zzug zzugVar, final com.google.android.gms.internal.ads.zztx zztxVar, final com.google.android.gms.internal.ads.zzuc zzucVar, final java.io.IOException iOException, final boolean z) {
        final android.util.Pair pairZzf = zzf(0, zzugVar);
        if (pairZzf != null) {
            this.zza.zzi.zzh(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzkr
                @Override // java.lang.Runnable
                public final void run() {
                    android.util.Pair pair = pairZzf;
                    this.zza.zza.zzh.zzai(((java.lang.Integer) pair.first).intValue(), (com.google.android.gms.internal.ads.zzug) pair.second, zztxVar, zzucVar, iOException, z);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzaj(int i, com.google.android.gms.internal.ads.zzug zzugVar, final com.google.android.gms.internal.ads.zztx zztxVar, final com.google.android.gms.internal.ads.zzuc zzucVar) {
        final android.util.Pair pairZzf = zzf(0, zzugVar);
        if (pairZzf != null) {
            this.zza.zzi.zzh(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzkt
                @Override // java.lang.Runnable
                public final void run() {
                    android.util.Pair pair = pairZzf;
                    this.zza.zza.zzh.zzaj(((java.lang.Integer) pair.first).intValue(), (com.google.android.gms.internal.ads.zzug) pair.second, zztxVar, zzucVar);
                }
            });
        }
    }
}
