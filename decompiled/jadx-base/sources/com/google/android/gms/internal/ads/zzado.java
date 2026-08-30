package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzado implements com.google.android.gms.internal.ads.zzacn {
    private final int zza;
    private final int zzb;
    private final java.lang.String zzc;
    private int zzd;
    private int zze;
    private com.google.android.gms.internal.ads.zzacq zzf;
    private com.google.android.gms.internal.ads.zzadt zzg;

    public zzado(int i, int i2, java.lang.String str) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final int zzb(com.google.android.gms.internal.ads.zzaco zzacoVar, com.google.android.gms.internal.ads.zzadj zzadjVar) throws java.io.IOException {
        int i = this.zze;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            throw new java.lang.IllegalStateException();
        }
        com.google.android.gms.internal.ads.zzadt zzadtVar = this.zzg;
        zzadtVar.getClass();
        int iZzf = zzadtVar.zzf(zzacoVar, 1024, true);
        if (iZzf == -1) {
            this.zze = 2;
            this.zzg.zzt(0L, 1, this.zzd, 0, null);
            this.zzd = 0;
        } else {
            this.zzd += iZzf;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final /* synthetic */ com.google.android.gms.internal.ads.zzacn zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final /* synthetic */ java.util.List zzd() {
        return com.google.android.gms.internal.ads.zzfxn.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zze(com.google.android.gms.internal.ads.zzacq zzacqVar) {
        this.zzf = zzacqVar;
        com.google.android.gms.internal.ads.zzadt zzadtVarZzw = zzacqVar.zzw(1024, 4);
        this.zzg = zzadtVarZzw;
        com.google.android.gms.internal.ads.zzz zzzVar = new com.google.android.gms.internal.ads.zzz();
        zzzVar.zzaa(this.zzc);
        zzadtVarZzw.zzm(zzzVar.zzag());
        this.zzf.zzD();
        this.zzf.zzO(new com.google.android.gms.internal.ads.zzadp(androidx.media3.common.C.TIME_UNSET));
        this.zze = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzf(long j, long j2) {
        if (j == 0 || this.zze == 1) {
            this.zze = 1;
            this.zzd = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final boolean zzi(com.google.android.gms.internal.ads.zzaco zzacoVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzcw.zzf((this.zza == -1 || this.zzb == -1) ? false : true);
        com.google.android.gms.internal.ads.zzdy zzdyVar = new com.google.android.gms.internal.ads.zzdy(this.zzb);
        ((com.google.android.gms.internal.ads.zzacc) zzacoVar).zzm(zzdyVar.zzN(), 0, this.zzb, false);
        return zzdyVar.zzq() == this.zza;
    }
}
