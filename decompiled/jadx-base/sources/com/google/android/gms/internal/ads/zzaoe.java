package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaoe implements com.google.android.gms.internal.ads.zzacn {
    private com.google.android.gms.internal.ads.zzacq zza;
    private com.google.android.gms.internal.ads.zzadt zzb;
    private com.google.android.gms.internal.ads.zzaoc zze;
    private int zzc = 0;
    private long zzd = -1;
    private int zzf = -1;
    private long zzg = -1;

    /* JADX WARN: Code duplicated, block: B:47:0x00f6  */
    @Override // com.google.android.gms.internal.ads.zzacn
    public final int zzb(com.google.android.gms.internal.ads.zzaco zzacoVar, com.google.android.gms.internal.ads.zzadj zzadjVar) throws java.io.IOException {
        int i;
        com.google.android.gms.internal.ads.zzcw.zzb(this.zzb);
        int i2 = com.google.android.gms.internal.ads.zzei.zza;
        int i3 = this.zzc;
        int iZzn = 4;
        if (i3 == 0) {
            com.google.android.gms.internal.ads.zzcw.zzf(zzacoVar.zzf() == 0);
            int i4 = this.zzf;
            if (i4 != -1) {
                zzacoVar.zzk(i4);
                this.zzc = 4;
            } else {
                if (!com.google.android.gms.internal.ads.zzaoh.zzc(zzacoVar)) {
                    throw com.google.android.gms.internal.ads.zzbc.zza("Unsupported or unrecognized wav file type.", null);
                }
                zzacoVar.zzk((int) (zzacoVar.zze() - zzacoVar.zzf()));
                this.zzc = 1;
            }
            return 0;
        }
        long jZzr = -1;
        if (i3 == 1) {
            com.google.android.gms.internal.ads.zzdy zzdyVar = new com.google.android.gms.internal.ads.zzdy(8);
            com.google.android.gms.internal.ads.zzaog zzaogVarZza = com.google.android.gms.internal.ads.zzaog.zza(zzacoVar, zzdyVar);
            if (zzaogVarZza.zza != 1685272116) {
                zzacoVar.zzj();
            } else {
                zzacoVar.zzg(8);
                zzdyVar.zzL(0);
                zzacoVar.zzh(zzdyVar.zzN(), 0, 8);
                jZzr = zzdyVar.zzr();
                zzacoVar.zzk(((int) zzaogVarZza.zzb) + 8);
            }
            this.zzd = jZzr;
            this.zzc = 2;
            return 0;
        }
        if (i3 == 2) {
            com.google.android.gms.internal.ads.zzaof zzaofVarZzb = com.google.android.gms.internal.ads.zzaoh.zzb(zzacoVar);
            int i5 = zzaofVarZzb.zza;
            if (i5 == 17) {
                this.zze = new com.google.android.gms.internal.ads.zzaob(this.zza, this.zzb, zzaofVarZzb);
            } else if (i5 == 6) {
                this.zze = new com.google.android.gms.internal.ads.zzaod(this.zza, this.zzb, zzaofVarZzb, androidx.media3.common.MimeTypes.AUDIO_ALAW, -1);
            } else if (i5 == 7) {
                this.zze = new com.google.android.gms.internal.ads.zzaod(this.zza, this.zzb, zzaofVarZzb, androidx.media3.common.MimeTypes.AUDIO_MLAW, -1);
            } else {
                int i6 = zzaofVarZzb.zze;
                if (i5 == 1) {
                    iZzn = com.google.android.gms.internal.ads.zzei.zzn(i6);
                    i = iZzn;
                } else {
                    if (i5 != 3) {
                        if (i5 == 65534) {
                            iZzn = com.google.android.gms.internal.ads.zzei.zzn(i6);
                            i = iZzn;
                        }
                    } else if (i6 == 32) {
                        i = iZzn;
                    }
                    i = 0;
                }
                if (i == 0) {
                    throw com.google.android.gms.internal.ads.zzbc.zzc("Unsupported WAV format type: " + i5);
                }
                this.zze = new com.google.android.gms.internal.ads.zzaod(this.zza, this.zzb, zzaofVarZzb, androidx.media3.common.MimeTypes.AUDIO_RAW, i);
            }
            this.zzc = 3;
            return 0;
        }
        if (i3 != 3) {
            com.google.android.gms.internal.ads.zzcw.zzf(this.zzg != -1);
            long jZzf = this.zzg - zzacoVar.zzf();
            com.google.android.gms.internal.ads.zzaoc zzaocVar = this.zze;
            zzaocVar.getClass();
            return zzaocVar.zzc(zzacoVar, jZzf) ? -1 : 0;
        }
        android.util.Pair pairZza = com.google.android.gms.internal.ads.zzaoh.zza(zzacoVar);
        this.zzf = ((java.lang.Long) pairZza.first).intValue();
        long jLongValue = ((java.lang.Long) pairZza.second).longValue();
        long j = this.zzd;
        if (j != -1 && jLongValue == androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE) {
            jLongValue = j;
        }
        long j2 = ((long) this.zzf) + jLongValue;
        this.zzg = j2;
        long jZzd = zzacoVar.zzd();
        if (jZzd != -1 && j2 > jZzd) {
            com.google.android.gms.internal.ads.zzdo.zzf("WavExtractor", "Data exceeds input length: " + j2 + ", " + jZzd);
            this.zzg = jZzd;
            j2 = jZzd;
        }
        com.google.android.gms.internal.ads.zzaoc zzaocVar2 = this.zze;
        zzaocVar2.getClass();
        zzaocVar2.zza(this.zzf, j2);
        this.zzc = 4;
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
        this.zza = zzacqVar;
        this.zzb = zzacqVar.zzw(0, 1);
        zzacqVar.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzf(long j, long j2) {
        this.zzc = j == 0 ? 0 : 4;
        com.google.android.gms.internal.ads.zzaoc zzaocVar = this.zze;
        if (zzaocVar != null) {
            zzaocVar.zzb(j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final boolean zzi(com.google.android.gms.internal.ads.zzaco zzacoVar) throws java.io.IOException {
        return com.google.android.gms.internal.ads.zzaoh.zzc(zzacoVar);
    }
}
