package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaab implements com.google.android.gms.internal.ads.zzabh, com.google.android.gms.internal.ads.zzaac {
    final /* synthetic */ com.google.android.gms.internal.ads.zzaah zza;
    private final int zzb;
    private final java.util.ArrayList zzc;
    private final com.google.android.gms.internal.ads.zzaaj zzd;
    private com.google.android.gms.internal.ads.zzab zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private boolean zzj;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private long zzn;
    private com.google.android.gms.internal.ads.zzabe zzo;
    private java.util.concurrent.Executor zzp;

    public zzaab(com.google.android.gms.internal.ads.zzaah zzaahVar, android.content.Context context) {
        this.zza = zzaahVar;
        this.zzb = true != com.google.android.gms.internal.ads.zzei.zzK(context) ? 5 : 1;
        this.zzc = new java.util.ArrayList();
        this.zzd = new com.google.android.gms.internal.ads.zzaaj();
        this.zzk = androidx.media3.common.C.TIME_UNSET;
        this.zzo = com.google.android.gms.internal.ads.zzabe.zzb;
        this.zzp = com.google.android.gms.internal.ads.zzaah.zza;
    }

    private final void zzB() {
        if (this.zze == null) {
            return;
        }
        new java.util.ArrayList(this.zzc);
        com.google.android.gms.internal.ads.zzab zzabVar = this.zze;
        zzabVar.getClass();
        com.google.android.gms.internal.ads.zzz zzzVarZzb = zzabVar.zzb();
        zzzVarZzb.zzB(com.google.android.gms.internal.ads.zzaah.zzw(zzabVar.zzC));
        zzzVarZzb.zzag();
        com.google.android.gms.internal.ads.zzcb zzcbVar = null;
        com.google.android.gms.internal.ads.zzcw.zzb(null);
        zzcbVar.zzd();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzaac
    public final void zzA(com.google.android.gms.internal.ads.zzaah zzaahVar, final com.google.android.gms.internal.ads.zzcd zzcdVar) {
        final com.google.android.gms.internal.ads.zzabe zzabeVar = this.zzo;
        this.zzp.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzzy
            @Override // java.lang.Runnable
            public final void run() {
                zzabeVar.zzc(this.zza, zzcdVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final android.view.Surface zza() {
        com.google.android.gms.internal.ads.zzcw.zzf(false);
        com.google.android.gms.internal.ads.zzcb zzcbVar = null;
        com.google.android.gms.internal.ads.zzcw.zzb(null);
        zzcbVar.zzb();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzb() {
        this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzc() {
        this.zza.zzh.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzd(boolean z) {
        this.zzl = false;
        this.zzk = androidx.media3.common.C.TIME_UNSET;
        com.google.android.gms.internal.ads.zzaah.zzl(this.zza, z);
        this.zzn = androidx.media3.common.C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zze(com.google.android.gms.internal.ads.zzab zzabVar) throws com.google.android.gms.internal.ads.zzabg {
        com.google.android.gms.internal.ads.zzaah.zzc(this.zza, zzabVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzf(boolean z) {
        this.zza.zzh.zzf(z);
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzg(int i, com.google.android.gms.internal.ads.zzab zzabVar) {
        com.google.android.gms.internal.ads.zzcw.zzf(false);
        this.zze = zzabVar;
        if (this.zzl) {
            com.google.android.gms.internal.ads.zzcw.zzf(this.zzk != androidx.media3.common.C.TIME_UNSET);
            this.zzm = true;
            this.zzn = this.zzk;
        } else {
            zzB();
            this.zzl = true;
            this.zzm = false;
            this.zzn = androidx.media3.common.C.TIME_UNSET;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzh() {
        this.zza.zzh.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzi(boolean z) {
        this.zza.zzh.zzi(z);
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzj() {
        this.zza.zzh.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzk() {
        this.zza.zzh.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzl() {
        this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzm(long j, long j2) throws com.google.android.gms.internal.ads.zzabg {
        this.zza.zzh.zzm(j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzn(int i) {
        this.zza.zzh.zzn(i);
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzo(com.google.android.gms.internal.ads.zzabe zzabeVar, java.util.concurrent.Executor executor) {
        this.zzo = zzabeVar;
        this.zzp = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzp(android.view.Surface surface, com.google.android.gms.internal.ads.zzdz zzdzVar) {
        this.zza.zzt(surface, zzdzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzq(float f) {
        this.zza.zzh.zzq(f);
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzr(long j, long j2, long j3, long j4) {
        boolean z = this.zzj;
        boolean z2 = true;
        if (this.zzg == j2 && this.zzh == j3) {
            z2 = false;
        }
        this.zzj = z | z2;
        this.zzf = j;
        this.zzg = j2;
        this.zzh = j3;
        this.zzi = j4;
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzs(java.util.List list) {
        if (this.zzc.equals(list)) {
            return;
        }
        this.zzc.clear();
        this.zzc.addAll(list);
        this.zzc.addAll(this.zza.zzg);
        zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzt(com.google.android.gms.internal.ads.zzaai zzaaiVar) {
        this.zza.zzk = zzaaiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final boolean zzu(long j, boolean z, long j2, long j3, com.google.android.gms.internal.ads.zzabf zzabfVar) throws com.google.android.gms.internal.ads.zzabg {
        com.google.android.gms.internal.ads.zzcw.zzf(false);
        long j4 = j - this.zzh;
        try {
            if (this.zza.zzd.zza(j4, j2, j3, this.zzf, z, this.zzd) != 4) {
                if (j4 < this.zzi && !z) {
                    com.google.android.gms.internal.ads.zzzm zzzmVar = (com.google.android.gms.internal.ads.zzzm) zzabfVar;
                    zzzmVar.zzd.zzaQ(zzzmVar.zza, zzzmVar.zzb, zzzmVar.zzc);
                    return true;
                }
                this.zza.zzh.zzm(j2, j3);
                if (this.zzm) {
                    long j5 = this.zzn;
                    if (j5 == androidx.media3.common.C.TIME_UNSET || com.google.android.gms.internal.ads.zzaah.zzu(this.zza, j5)) {
                        zzB();
                        this.zzm = false;
                        this.zzn = androidx.media3.common.C.TIME_UNSET;
                    }
                }
                com.google.android.gms.internal.ads.zzcb zzcbVar = null;
                com.google.android.gms.internal.ads.zzcw.zzb(null);
                zzcbVar.zza();
                throw null;
            }
            return false;
        } catch (com.google.android.gms.internal.ads.zzib e) {
            com.google.android.gms.internal.ads.zzab zzabVar = this.zze;
            com.google.android.gms.internal.ads.zzcw.zzb(zzabVar);
            throw new com.google.android.gms.internal.ads.zzabg(e, zzabVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final boolean zzv() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"videoFrameProcessor"}, result = true)
    public final boolean zzw() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final boolean zzx(boolean z) {
        return this.zza.zzh.zzx(false);
    }

    @Override // com.google.android.gms.internal.ads.zzaac
    public final void zzy(com.google.android.gms.internal.ads.zzaah zzaahVar) {
        final com.google.android.gms.internal.ads.zzabe zzabeVar = this.zzo;
        this.zzp.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzzz
            @Override // java.lang.Runnable
            public final void run() {
                zzabeVar.zza(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaac
    public final void zzz(com.google.android.gms.internal.ads.zzaah zzaahVar) {
        final com.google.android.gms.internal.ads.zzabe zzabeVar = this.zzo;
        this.zzp.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzaaa
            @Override // java.lang.Runnable
            public final void run() {
                zzabeVar.zzb(this.zza);
            }
        });
    }
}
