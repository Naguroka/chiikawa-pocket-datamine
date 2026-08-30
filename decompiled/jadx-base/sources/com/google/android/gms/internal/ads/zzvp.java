package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzvp extends com.google.android.gms.internal.ads.zztf implements com.google.android.gms.internal.ads.zzvg {
    private final com.google.android.gms.internal.ads.zzfx zza;
    private final com.google.android.gms.internal.ads.zzrf zzb;
    private final int zzc;
    private boolean zzd = true;
    private long zze = androidx.media3.common.C.TIME_UNSET;
    private boolean zzf;
    private boolean zzg;
    private com.google.android.gms.internal.ads.zzgy zzh;
    private com.google.android.gms.internal.ads.zzar zzi;
    private final com.google.android.gms.internal.ads.zzvm zzj;
    private final com.google.android.gms.internal.ads.zzyo zzk;

    /* synthetic */ zzvp(com.google.android.gms.internal.ads.zzar zzarVar, com.google.android.gms.internal.ads.zzfx zzfxVar, com.google.android.gms.internal.ads.zzvm zzvmVar, com.google.android.gms.internal.ads.zzrf zzrfVar, com.google.android.gms.internal.ads.zzyo zzyoVar, int i, boolean z, com.google.android.gms.internal.ads.zzfvf zzfvfVar, com.google.android.gms.internal.ads.zzvo zzvoVar) {
        this.zzi = zzarVar;
        this.zza = zzfxVar;
        this.zzj = zzvmVar;
        this.zzb = zzrfVar;
        this.zzk = zzyoVar;
        this.zzc = i;
    }

    private final void zzw() {
        long j = this.zze;
        boolean z = this.zzf;
        boolean z2 = this.zzg;
        com.google.android.gms.internal.ads.zzar zzarVarZzJ = zzJ();
        com.google.android.gms.internal.ads.zzwc zzwcVar = new com.google.android.gms.internal.ads.zzwc(androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, j, j, 0L, 0L, z, false, false, null, zzarVarZzJ, z2 ? zzarVarZzJ.zzc : null);
        zzo(this.zzd ? new com.google.android.gms.internal.ads.zzvl(this, zzwcVar) : zzwcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final void zzG(com.google.android.gms.internal.ads.zzue zzueVar) {
        ((com.google.android.gms.internal.ads.zzvk) zzueVar).zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final com.google.android.gms.internal.ads.zzue zzI(com.google.android.gms.internal.ads.zzug zzugVar, com.google.android.gms.internal.ads.zzyk zzykVar, long j) {
        com.google.android.gms.internal.ads.zzfy zzfyVarZza = this.zza.zza();
        com.google.android.gms.internal.ads.zzgy zzgyVar = this.zzh;
        if (zzgyVar != null) {
            zzfyVarZza.zzf(zzgyVar);
        }
        com.google.android.gms.internal.ads.zzam zzamVar = zzJ().zzb;
        zzamVar.getClass();
        android.net.Uri uri = zzamVar.zza;
        com.google.android.gms.internal.ads.zzvm zzvmVar = this.zzj;
        zzb();
        return new com.google.android.gms.internal.ads.zzvk(uri, zzfyVarZza, new com.google.android.gms.internal.ads.zzti(zzvmVar.zza), this.zzb, zzc(zzugVar), this.zzk, zze(zzugVar), this, zzykVar, null, this.zzc, false, com.google.android.gms.internal.ads.zzei.zzs(androidx.media3.common.C.TIME_UNSET), null);
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final synchronized com.google.android.gms.internal.ads.zzar zzJ() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzvg
    public final void zza(long j, boolean z, boolean z2) {
        if (j == androidx.media3.common.C.TIME_UNSET) {
            j = this.zze;
        }
        if (!this.zzd && this.zze == j && this.zzf == z && this.zzg == z2) {
            return;
        }
        this.zze = j;
        this.zzf = z;
        this.zzg = z2;
        this.zzd = false;
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zztf
    protected final void zzn(com.google.android.gms.internal.ads.zzgy zzgyVar) {
        this.zzh = zzgyVar;
        android.os.Looper.myLooper().getClass();
        zzb();
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zztf
    protected final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zztf, com.google.android.gms.internal.ads.zzui
    public final synchronized void zzt(com.google.android.gms.internal.ads.zzar zzarVar) {
        this.zzi = zzarVar;
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final void zzz() {
    }
}
