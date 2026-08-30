package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zztm implements com.google.android.gms.internal.ads.zzur, com.google.android.gms.internal.ads.zzrb {
    final /* synthetic */ com.google.android.gms.internal.ads.zzto zza;
    private final java.lang.Object zzb;
    private com.google.android.gms.internal.ads.zzuq zzc;
    private com.google.android.gms.internal.ads.zzra zzd;

    public zztm(com.google.android.gms.internal.ads.zzto zztoVar, java.lang.Object obj) {
        this.zza = zztoVar;
        this.zzc = zztoVar.zze(null);
        this.zzd = zztoVar.zzc(null);
        this.zzb = obj;
    }

    private final com.google.android.gms.internal.ads.zzuc zzf(com.google.android.gms.internal.ads.zzuc zzucVar, com.google.android.gms.internal.ads.zzug zzugVar) {
        com.google.android.gms.internal.ads.zzto zztoVar = this.zza;
        java.lang.Object obj = this.zzb;
        long j = zzucVar.zzc;
        zztoVar.zzx(obj, j, zzugVar);
        com.google.android.gms.internal.ads.zzto zztoVar2 = this.zza;
        java.lang.Object obj2 = this.zzb;
        long j2 = zzucVar.zzd;
        zztoVar2.zzx(obj2, j2, zzugVar);
        return (j == zzucVar.zzc && j2 == zzucVar.zzd) ? zzucVar : new com.google.android.gms.internal.ads.zzuc(1, zzucVar.zza, zzucVar.zzb, 0, null, j, j2);
    }

    private final boolean zzg(int i, com.google.android.gms.internal.ads.zzug zzugVar) {
        com.google.android.gms.internal.ads.zzug zzugVarZzy;
        if (zzugVar != null) {
            zzugVarZzy = this.zza.zzy(this.zzb, zzugVar);
            if (zzugVarZzy == null) {
                return false;
            }
        } else {
            zzugVarZzy = null;
        }
        this.zza.zzw(this.zzb, 0);
        com.google.android.gms.internal.ads.zzuq zzuqVar = this.zzc;
        int i2 = zzuqVar.zza;
        if (!java.util.Objects.equals(zzuqVar.zzb, zzugVarZzy)) {
            this.zzc = this.zza.zzf(0, zzugVarZzy);
        }
        com.google.android.gms.internal.ads.zzra zzraVar = this.zzd;
        int i3 = zzraVar.zza;
        if (java.util.Objects.equals(zzraVar.zzb, zzugVarZzy)) {
            return true;
        }
        this.zzd = this.zza.zzd(0, zzugVarZzy);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzaf(int i, com.google.android.gms.internal.ads.zzug zzugVar, com.google.android.gms.internal.ads.zzuc zzucVar) {
        if (zzg(0, zzugVar)) {
            this.zzc.zzd(zzf(zzucVar, zzugVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzag(int i, com.google.android.gms.internal.ads.zzug zzugVar, com.google.android.gms.internal.ads.zztx zztxVar, com.google.android.gms.internal.ads.zzuc zzucVar) {
        if (zzg(0, zzugVar)) {
            this.zzc.zze(zztxVar, zzf(zzucVar, zzugVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzah(int i, com.google.android.gms.internal.ads.zzug zzugVar, com.google.android.gms.internal.ads.zztx zztxVar, com.google.android.gms.internal.ads.zzuc zzucVar) {
        if (zzg(0, zzugVar)) {
            this.zzc.zzf(zztxVar, zzf(zzucVar, zzugVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzai(int i, com.google.android.gms.internal.ads.zzug zzugVar, com.google.android.gms.internal.ads.zztx zztxVar, com.google.android.gms.internal.ads.zzuc zzucVar, java.io.IOException iOException, boolean z) {
        if (zzg(0, zzugVar)) {
            this.zzc.zzg(zztxVar, zzf(zzucVar, zzugVar), iOException, z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzaj(int i, com.google.android.gms.internal.ads.zzug zzugVar, com.google.android.gms.internal.ads.zztx zztxVar, com.google.android.gms.internal.ads.zzuc zzucVar) {
        if (zzg(0, zzugVar)) {
            this.zzc.zzh(zztxVar, zzf(zzucVar, zzugVar));
        }
    }
}
