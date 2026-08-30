package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzanj implements com.google.android.gms.internal.ads.zzacn {
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private long zzh;
    private com.google.android.gms.internal.ads.zzang zzi;
    private com.google.android.gms.internal.ads.zzacq zzj;
    private boolean zzk;
    private final com.google.android.gms.internal.ads.zzef zza = new com.google.android.gms.internal.ads.zzef(0);
    private final com.google.android.gms.internal.ads.zzdy zzc = new com.google.android.gms.internal.ads.zzdy(4096);
    private final android.util.SparseArray zzb = new android.util.SparseArray();
    private final com.google.android.gms.internal.ads.zzanh zzd = new com.google.android.gms.internal.ads.zzanh();

    /* JADX WARN: Code duplicated, block: B:64:0x0149  */
    @Override // com.google.android.gms.internal.ads.zzacn
    public final int zzb(com.google.android.gms.internal.ads.zzaco zzacoVar, com.google.android.gms.internal.ads.zzadj zzadjVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzamj zzamlVar;
        com.google.android.gms.internal.ads.zzcw.zzb(this.zzj);
        long jZzd = zzacoVar.zzd();
        if (jZzd != -1) {
            com.google.android.gms.internal.ads.zzanh zzanhVar = this.zzd;
            if (!zzanhVar.zze()) {
                return zzanhVar.zza(zzacoVar, zzadjVar);
            }
        }
        if (!this.zzk) {
            this.zzk = true;
            com.google.android.gms.internal.ads.zzanh zzanhVar2 = this.zzd;
            if (zzanhVar2.zzb() != androidx.media3.common.C.TIME_UNSET) {
                com.google.android.gms.internal.ads.zzang zzangVar = new com.google.android.gms.internal.ads.zzang(zzanhVar2.zzd(), zzanhVar2.zzb(), jZzd);
                this.zzi = zzangVar;
                this.zzj.zzO(zzangVar.zzb());
            } else {
                this.zzj.zzO(new com.google.android.gms.internal.ads.zzadl(zzanhVar2.zzb(), 0L));
            }
        }
        com.google.android.gms.internal.ads.zzang zzangVar2 = this.zzi;
        if (zzangVar2 != null && zzangVar2.zze()) {
            return zzangVar2.zza(zzacoVar, zzadjVar);
        }
        zzacoVar.zzj();
        long jZze = jZzd != -1 ? jZzd - zzacoVar.zze() : -1L;
        if ((jZze != -1 && jZze < 4) || !zzacoVar.zzm(this.zzc.zzN(), 0, 4, true)) {
            return -1;
        }
        this.zzc.zzL(0);
        int iZzg = this.zzc.zzg();
        if (iZzg == 441) {
            return -1;
        }
        if (iZzg == 442) {
            zzacoVar.zzh(this.zzc.zzN(), 0, 10);
            this.zzc.zzL(9);
            zzacoVar.zzk((this.zzc.zzm() & 7) + 14);
            return 0;
        }
        if (iZzg == 443) {
            zzacoVar.zzh(this.zzc.zzN(), 0, 2);
            this.zzc.zzL(0);
            zzacoVar.zzk(this.zzc.zzq() + 6);
            return 0;
        }
        if ((iZzg >> 8) != 1) {
            zzacoVar.zzk(1);
            return 0;
        }
        int i = iZzg & 255;
        com.google.android.gms.internal.ads.zzani zzaniVar = (com.google.android.gms.internal.ads.zzani) this.zzb.get(i);
        if (!this.zze) {
            if (zzaniVar == null) {
                com.google.android.gms.internal.ads.zzamj zzamjVar = null;
                if (i == 189) {
                    zzamlVar = new com.google.android.gms.internal.ads.zzamb(null, 0);
                    this.zzf = true;
                    this.zzh = zzacoVar.zzf();
                } else if ((i & 224) == 192) {
                    zzamlVar = new com.google.android.gms.internal.ads.zzamv(null, 0);
                    this.zzf = true;
                    this.zzh = zzacoVar.zzf();
                } else if ((i & androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK) == 224) {
                    zzamlVar = new com.google.android.gms.internal.ads.zzaml(null);
                    this.zzg = true;
                    this.zzh = zzacoVar.zzf();
                } else if (zzamjVar != null) {
                    zzamjVar.zzb(this.zzj, new com.google.android.gms.internal.ads.zzanx(Integer.MIN_VALUE, i, 256));
                    com.google.android.gms.internal.ads.zzani zzaniVar2 = new com.google.android.gms.internal.ads.zzani(zzamjVar, this.zza);
                    this.zzb.put(i, zzaniVar2);
                    zzaniVar = zzaniVar2;
                }
                zzamjVar = zzamlVar;
                if (zzamjVar != null) {
                    zzamjVar.zzb(this.zzj, new com.google.android.gms.internal.ads.zzanx(Integer.MIN_VALUE, i, 256));
                    com.google.android.gms.internal.ads.zzani zzaniVar3 = new com.google.android.gms.internal.ads.zzani(zzamjVar, this.zza);
                    this.zzb.put(i, zzaniVar3);
                    zzaniVar = zzaniVar3;
                }
            }
            long j = 1048576;
            if (this.zzf && this.zzg) {
                j = this.zzh + 8192;
            }
            if (zzacoVar.zzf() > j) {
                this.zze = true;
                this.zzj.zzD();
            }
        }
        zzacoVar.zzh(this.zzc.zzN(), 0, 2);
        this.zzc.zzL(0);
        int iZzq = this.zzc.zzq() + 6;
        if (zzaniVar == null) {
            zzacoVar.zzk(iZzq);
        } else {
            this.zzc.zzI(iZzq);
            zzacoVar.zzi(this.zzc.zzN(), 0, iZzq);
            this.zzc.zzL(6);
            zzaniVar.zza(this.zzc);
            com.google.android.gms.internal.ads.zzdy zzdyVar = this.zzc;
            zzdyVar.zzK(zzdyVar.zzc());
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
        this.zzj = zzacqVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzf(long j, long j2) {
        com.google.android.gms.internal.ads.zzef zzefVar = this.zza;
        if (zzefVar.zzf() != androidx.media3.common.C.TIME_UNSET) {
            long jZzd = zzefVar.zzd();
            if (jZzd != androidx.media3.common.C.TIME_UNSET && jZzd != 0 && jZzd != j2) {
                zzefVar.zzi(j2);
            }
        } else {
            zzefVar.zzi(j2);
        }
        com.google.android.gms.internal.ads.zzang zzangVar = this.zzi;
        if (zzangVar != null) {
            zzangVar.zzd(j2);
        }
        for (int i = 0; i < this.zzb.size(); i++) {
            ((com.google.android.gms.internal.ads.zzani) this.zzb.valueAt(i)).zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final boolean zzi(com.google.android.gms.internal.ads.zzaco zzacoVar) throws java.io.IOException {
        byte[] bArr = new byte[14];
        com.google.android.gms.internal.ads.zzacc zzaccVar = (com.google.android.gms.internal.ads.zzacc) zzacoVar;
        zzaccVar.zzm(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        zzaccVar.zzl(bArr[13] & 7, false);
        zzaccVar.zzm(bArr, 0, 3, false);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }
}
