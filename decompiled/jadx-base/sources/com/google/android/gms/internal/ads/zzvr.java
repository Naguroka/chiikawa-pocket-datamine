package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzvr {
    private final com.google.android.gms.internal.ads.zzdy zza = new com.google.android.gms.internal.ads.zzdy(32);
    private com.google.android.gms.internal.ads.zzvq zzb;
    private com.google.android.gms.internal.ads.zzvq zzc;
    private com.google.android.gms.internal.ads.zzvq zzd;
    private long zze;
    private final com.google.android.gms.internal.ads.zzyk zzf;

    public zzvr(com.google.android.gms.internal.ads.zzyk zzykVar) {
        this.zzf = zzykVar;
        com.google.android.gms.internal.ads.zzvq zzvqVar = new com.google.android.gms.internal.ads.zzvq(0L, 65536);
        this.zzb = zzvqVar;
        this.zzc = zzvqVar;
        this.zzd = zzvqVar;
    }

    private final int zzi(int i) {
        com.google.android.gms.internal.ads.zzvq zzvqVar = this.zzd;
        if (zzvqVar.zzc == null) {
            com.google.android.gms.internal.ads.zzyd zzydVarZzb = this.zzf.zzb();
            com.google.android.gms.internal.ads.zzvq zzvqVar2 = new com.google.android.gms.internal.ads.zzvq(this.zzd.zzb, 65536);
            zzvqVar.zzc = zzydVarZzb;
            zzvqVar.zzd = zzvqVar2;
        }
        return java.lang.Math.min(i, (int) (this.zzd.zzb - this.zze));
    }

    private static com.google.android.gms.internal.ads.zzvq zzj(com.google.android.gms.internal.ads.zzvq zzvqVar, long j) {
        while (j >= zzvqVar.zzb) {
            zzvqVar = zzvqVar.zzd;
        }
        return zzvqVar;
    }

    private static com.google.android.gms.internal.ads.zzvq zzk(com.google.android.gms.internal.ads.zzvq zzvqVar, long j, java.nio.ByteBuffer byteBuffer, int i) {
        com.google.android.gms.internal.ads.zzvq zzvqVarZzj = zzj(zzvqVar, j);
        while (i > 0) {
            int iMin = java.lang.Math.min(i, (int) (zzvqVarZzj.zzb - j));
            byteBuffer.put(zzvqVarZzj.zzc.zza, zzvqVarZzj.zza(j), iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == zzvqVarZzj.zzb) {
                zzvqVarZzj = zzvqVarZzj.zzd;
            }
        }
        return zzvqVarZzj;
    }

    private static com.google.android.gms.internal.ads.zzvq zzl(com.google.android.gms.internal.ads.zzvq zzvqVar, long j, byte[] bArr, int i) {
        com.google.android.gms.internal.ads.zzvq zzvqVarZzj = zzj(zzvqVar, j);
        int i2 = i;
        while (i2 > 0) {
            int iMin = java.lang.Math.min(i2, (int) (zzvqVarZzj.zzb - j));
            java.lang.System.arraycopy(zzvqVarZzj.zzc.zza, zzvqVarZzj.zza(j), bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == zzvqVarZzj.zzb) {
                zzvqVarZzj = zzvqVarZzj.zzd;
            }
        }
        return zzvqVarZzj;
    }

    private static com.google.android.gms.internal.ads.zzvq zzm(com.google.android.gms.internal.ads.zzvq zzvqVar, com.google.android.gms.internal.ads.zzhh zzhhVar, com.google.android.gms.internal.ads.zzvt zzvtVar, com.google.android.gms.internal.ads.zzdy zzdyVar) {
        com.google.android.gms.internal.ads.zzvq zzvqVarZzl;
        if (zzhhVar.zzl()) {
            long j = zzvtVar.zzb;
            int iZzq = 1;
            zzdyVar.zzI(1);
            com.google.android.gms.internal.ads.zzvq zzvqVarZzl2 = zzl(zzvqVar, j, zzdyVar.zzN(), 1);
            long j2 = j + 1;
            byte b = zzdyVar.zzN()[0];
            int i = b & 128;
            int i2 = b & 127;
            com.google.android.gms.internal.ads.zzhe zzheVar = zzhhVar.zzb;
            byte[] bArr = zzheVar.zza;
            if (bArr == null) {
                zzheVar.zza = new byte[16];
            } else {
                java.util.Arrays.fill(bArr, (byte) 0);
            }
            boolean z = i != 0;
            zzvqVarZzl = zzl(zzvqVarZzl2, j2, zzheVar.zza, i2);
            long j3 = j2 + ((long) i2);
            if (z) {
                zzdyVar.zzI(2);
                zzvqVarZzl = zzl(zzvqVarZzl, j3, zzdyVar.zzN(), 2);
                j3 += 2;
                iZzq = zzdyVar.zzq();
            }
            int i3 = iZzq;
            int[] iArr = zzheVar.zzd;
            if (iArr == null || iArr.length < i3) {
                iArr = new int[i3];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzheVar.zze;
            if (iArr3 == null || iArr3.length < i3) {
                iArr3 = new int[i3];
            }
            int[] iArr4 = iArr3;
            if (z) {
                int i4 = i3 * 6;
                zzdyVar.zzI(i4);
                zzvqVarZzl = zzl(zzvqVarZzl, j3, zzdyVar.zzN(), i4);
                j3 += (long) i4;
                zzdyVar.zzL(0);
                for (int i5 = 0; i5 < i3; i5++) {
                    iArr2[i5] = zzdyVar.zzq();
                    iArr4[i5] = zzdyVar.zzp();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzvtVar.zza - ((int) (j3 - zzvtVar.zzb));
            }
            com.google.android.gms.internal.ads.zzads zzadsVar = zzvtVar.zzc;
            int i6 = com.google.android.gms.internal.ads.zzei.zza;
            zzheVar.zzc(i3, iArr2, iArr4, zzadsVar.zzb, zzheVar.zza, zzadsVar.zza, zzadsVar.zzc, zzadsVar.zzd);
            long j4 = zzvtVar.zzb;
            int i7 = (int) (j3 - j4);
            zzvtVar.zzb = j4 + ((long) i7);
            zzvtVar.zza -= i7;
        } else {
            zzvqVarZzl = zzvqVar;
        }
        if (!zzhhVar.zze()) {
            zzhhVar.zzj(zzvtVar.zza);
            return zzk(zzvqVarZzl, zzvtVar.zzb, zzhhVar.zzc, zzvtVar.zza);
        }
        zzdyVar.zzI(4);
        com.google.android.gms.internal.ads.zzvq zzvqVarZzl3 = zzl(zzvqVarZzl, zzvtVar.zzb, zzdyVar.zzN(), 4);
        int iZzp = zzdyVar.zzp();
        zzvtVar.zzb += 4;
        zzvtVar.zza -= 4;
        zzhhVar.zzj(iZzp);
        com.google.android.gms.internal.ads.zzvq zzvqVarZzk = zzk(zzvqVarZzl3, zzvtVar.zzb, zzhhVar.zzc, iZzp);
        zzvtVar.zzb += (long) iZzp;
        int i8 = zzvtVar.zza - iZzp;
        zzvtVar.zza = i8;
        java.nio.ByteBuffer byteBuffer = zzhhVar.zzf;
        if (byteBuffer == null || byteBuffer.capacity() < i8) {
            zzhhVar.zzf = java.nio.ByteBuffer.allocate(i8);
        } else {
            zzhhVar.zzf.clear();
        }
        return zzk(zzvqVarZzk, zzvtVar.zzb, zzhhVar.zzf, zzvtVar.zza);
    }

    private final void zzn(int i) {
        long j = this.zze + ((long) i);
        this.zze = j;
        com.google.android.gms.internal.ads.zzvq zzvqVar = this.zzd;
        if (j == zzvqVar.zzb) {
            this.zzd = zzvqVar.zzd;
        }
    }

    public final int zza(com.google.android.gms.internal.ads.zzl zzlVar, int i, boolean z) throws java.io.IOException {
        int iZzi = zzi(i);
        com.google.android.gms.internal.ads.zzvq zzvqVar = this.zzd;
        int iZza = zzlVar.zza(zzvqVar.zzc.zza, zzvqVar.zza(this.zze), iZzi);
        if (iZza != -1) {
            zzn(iZza);
            return iZza;
        }
        if (z) {
            return -1;
        }
        throw new java.io.EOFException();
    }

    public final long zzb() {
        return this.zze;
    }

    public final void zzc(long j) {
        com.google.android.gms.internal.ads.zzvq zzvqVar;
        if (j != -1) {
            while (true) {
                zzvqVar = this.zzb;
                if (j < zzvqVar.zzb) {
                    break;
                }
                this.zzf.zzc(zzvqVar.zzc);
                this.zzb = this.zzb.zzb();
            }
            if (this.zzc.zza < zzvqVar.zza) {
                this.zzc = zzvqVar;
            }
        }
    }

    public final void zzd(com.google.android.gms.internal.ads.zzhh zzhhVar, com.google.android.gms.internal.ads.zzvt zzvtVar) {
        zzm(this.zzc, zzhhVar, zzvtVar, this.zza);
    }

    public final void zze(com.google.android.gms.internal.ads.zzhh zzhhVar, com.google.android.gms.internal.ads.zzvt zzvtVar) {
        this.zzc = zzm(this.zzc, zzhhVar, zzvtVar, this.zza);
    }

    public final void zzf() {
        com.google.android.gms.internal.ads.zzvq zzvqVar = this.zzb;
        if (zzvqVar.zzc != null) {
            this.zzf.zzd(zzvqVar);
            zzvqVar.zzb();
        }
        this.zzb.zze(0L, 65536);
        com.google.android.gms.internal.ads.zzvq zzvqVar2 = this.zzb;
        this.zzc = zzvqVar2;
        this.zzd = zzvqVar2;
        this.zze = 0L;
        this.zzf.zzg();
    }

    public final void zzg() {
        this.zzc = this.zzb;
    }

    public final void zzh(com.google.android.gms.internal.ads.zzdy zzdyVar, int i) {
        while (i > 0) {
            int iZzi = zzi(i);
            com.google.android.gms.internal.ads.zzvq zzvqVar = this.zzd;
            zzdyVar.zzH(zzvqVar.zzc.zza, zzvqVar.zza(this.zze), iZzi);
            i -= iZzi;
            zzn(iZzi);
        }
    }
}
