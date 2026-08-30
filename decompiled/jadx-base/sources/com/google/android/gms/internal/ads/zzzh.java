package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzzh implements com.google.android.gms.internal.ads.zzabh {
    private final com.google.android.gms.internal.ads.zzaal zza;
    private final com.google.android.gms.internal.ads.zzaaq zzb;
    private com.google.android.gms.internal.ads.zzab zzc = new com.google.android.gms.internal.ads.zzz().zzag();

    public zzzh(com.google.android.gms.internal.ads.zzaal zzaalVar, com.google.android.gms.internal.ads.zzaaq zzaaqVar) {
        this.zza = zzaalVar;
        this.zzb = zzaaqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final android.view.Surface zza() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzb() {
        this.zza.zzm(null);
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzc() {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzd(boolean z) {
        if (z) {
            this.zza.zzi();
        }
        this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zze(com.google.android.gms.internal.ads.zzab zzabVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzf(boolean z) {
        this.zza.zzc(z);
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzg(int i, com.google.android.gms.internal.ads.zzab zzabVar) {
        com.google.android.gms.internal.ads.zzab zzabVar2 = this.zzc;
        int i2 = zzabVar2.zzv;
        int i3 = zzabVar.zzv;
        if (i3 != i2 || zzabVar.zzw != zzabVar2.zzw) {
            this.zzb.zzb(i3, zzabVar.zzw);
        }
        float f = zzabVar.zzx;
        if (f != this.zzc.zzx) {
            this.zza.zzl(f);
        }
        this.zzc = zzabVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzh() {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzi(boolean z) {
        this.zza.zze(z);
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzj() {
        this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzk() {
        this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzl() {
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzn(int i) {
        this.zza.zzj(i);
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzo(com.google.android.gms.internal.ads.zzabe zzabeVar, java.util.concurrent.Executor executor) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzp(android.view.Surface surface, com.google.android.gms.internal.ads.zzdz zzdzVar) {
        this.zza.zzm(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzq(float f) {
        this.zza.zzn(f);
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzr(long j, long j2, long j3, long j4) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzs(java.util.List list) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzt(com.google.android.gms.internal.ads.zzaai zzaaiVar) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final boolean zzu(long j, boolean z, long j2, long j3, com.google.android.gms.internal.ads.zzabf zzabfVar) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final boolean zzv() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final boolean zzw() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final boolean zzx(boolean z) {
        return this.zza.zzo(z);
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzm(long j, long j2) throws com.google.android.gms.internal.ads.zzabg {
        try {
            this.zzb.zzd(j, j2);
        } catch (com.google.android.gms.internal.ads.zzib e) {
            throw new com.google.android.gms.internal.ads.zzabg(e, this.zzc);
        }
    }
}
