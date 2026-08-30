package com.google.android.gms.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zza extends com.google.android.gms.measurement.zzc {
    private final com.google.android.gms.measurement.internal.zzio zza;
    private final com.google.android.gms.measurement.internal.zzlw zzb;

    public zza(com.google.android.gms.measurement.internal.zzio zzioVar) {
        super(null);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzioVar);
        this.zza = zzioVar;
        this.zzb = zzioVar.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final int zza(java.lang.String str) {
        this.zzb.zzi(str);
        return 25;
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final long zzb() {
        return this.zza.zzw().zzs();
    }

    @Override // com.google.android.gms.measurement.zzc
    public final java.lang.Boolean zzc() {
        return this.zzb.zzl();
    }

    @Override // com.google.android.gms.measurement.zzc
    public final java.lang.Double zzd() {
        return this.zzb.zzm();
    }

    @Override // com.google.android.gms.measurement.zzc
    public final java.lang.Integer zze() {
        return this.zzb.zzp();
    }

    @Override // com.google.android.gms.measurement.zzc
    public final java.lang.Long zzf() {
        return this.zzb.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final java.lang.String zzh() {
        return this.zzb.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final java.lang.String zzi() {
        return this.zzb.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final java.lang.String zzj() {
        return this.zzb.zzt();
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final java.lang.String zzk() {
        return this.zzb.zzr();
    }

    @Override // com.google.android.gms.measurement.zzc
    public final java.lang.String zzl() {
        return this.zzb.zzu();
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final java.util.List zzm(java.lang.String str, java.lang.String str2) {
        return this.zzb.zzv(str, str2);
    }

    @Override // com.google.android.gms.measurement.zzc
    public final java.util.Map zzn(boolean z) {
        java.util.List<com.google.android.gms.measurement.internal.zzqb> listZzw = this.zzb.zzw(z);
        androidx.collection.ArrayMap arrayMap = new androidx.collection.ArrayMap(listZzw.size());
        for (com.google.android.gms.measurement.internal.zzqb zzqbVar : listZzw) {
            java.lang.Object objZza = zzqbVar.zza();
            if (objZza != null) {
                arrayMap.put(zzqbVar.zzb, objZza);
            }
        }
        return arrayMap;
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final java.util.Map zzo(java.lang.String str, java.lang.String str2, boolean z) {
        return this.zzb.zzx(str, str2, z);
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final void zzp(java.lang.String str) {
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zza;
        zzioVar.zzd().zzd(str, zzioVar.zzaU().elapsedRealtime());
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final void zzq(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        this.zza.zzq().zzJ(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final void zzr(java.lang.String str) {
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zza;
        zzioVar.zzd().zze(str, zzioVar.zzaU().elapsedRealtime());
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final void zzs(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        this.zzb.zzO(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final void zzt(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j) {
        this.zzb.zzP(str, str2, bundle, true, false, j);
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final void zzu(com.google.android.gms.measurement.internal.zzkc zzkcVar) {
        this.zzb.zzV(zzkcVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final void zzv(android.os.Bundle bundle) {
        this.zzb.zzad(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final void zzw(com.google.android.gms.measurement.internal.zzkb zzkbVar) {
        this.zzb.zzah(zzkbVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final void zzx(com.google.android.gms.measurement.internal.zzkc zzkcVar) {
        this.zzb.zzao(zzkcVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final java.lang.Object zzg(int i) {
        if (i == 0) {
            return this.zzb.zzu();
        }
        if (i == 1) {
            return this.zzb.zzq();
        }
        if (i != 2) {
            return i != 3 ? this.zzb.zzl() : this.zzb.zzp();
        }
        return this.zzb.zzm();
    }
}
