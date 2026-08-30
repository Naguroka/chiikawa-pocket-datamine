package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaks {
    private final com.google.android.gms.internal.ads.zzdy zza = new com.google.android.gms.internal.ads.zzdy();
    private final int[] zzb = new int[256];
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static /* bridge */ /* synthetic */ void zzb(com.google.android.gms.internal.ads.zzaks zzaksVar, com.google.android.gms.internal.ads.zzdy zzdyVar, int i) {
        int iZzo;
        if (i < 4) {
            return;
        }
        zzdyVar.zzM(3);
        int i2 = i - 4;
        if ((zzdyVar.zzm() & 128) != 0) {
            if (i2 < 7 || (iZzo = zzdyVar.zzo()) < 4) {
                return;
            }
            zzaksVar.zzh = zzdyVar.zzq();
            zzaksVar.zzi = zzdyVar.zzq();
            zzaksVar.zza.zzI(iZzo - 4);
            i2 -= 7;
        }
        com.google.android.gms.internal.ads.zzdy zzdyVar2 = zzaksVar.zza;
        int iZzd = zzdyVar2.zzd();
        int iZze = zzdyVar2.zze();
        if (iZzd >= iZze || i2 <= 0) {
            return;
        }
        int iMin = java.lang.Math.min(i2, iZze - iZzd);
        zzdyVar.zzH(zzdyVar2.zzN(), iZzd, iMin);
        zzaksVar.zza.zzL(iZzd + iMin);
    }

    static /* bridge */ /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzaks zzaksVar, com.google.android.gms.internal.ads.zzdy zzdyVar, int i) {
        if (i < 19) {
            return;
        }
        zzaksVar.zzd = zzdyVar.zzq();
        zzaksVar.zze = zzdyVar.zzq();
        zzdyVar.zzM(11);
        zzaksVar.zzf = zzdyVar.zzq();
        zzaksVar.zzg = zzdyVar.zzq();
    }

    static /* bridge */ /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzaks zzaksVar, com.google.android.gms.internal.ads.zzdy zzdyVar, int i) {
        if (i % 5 != 2) {
            return;
        }
        zzdyVar.zzM(2);
        int i2 = 0;
        java.util.Arrays.fill(zzaksVar.zzb, 0);
        int i3 = i / 5;
        int i4 = 0;
        while (i4 < i3) {
            int iZzm = zzdyVar.zzm();
            int iZzm2 = zzdyVar.zzm();
            int iZzm3 = zzdyVar.zzm();
            int iZzm4 = zzdyVar.zzm();
            int iZzm5 = zzdyVar.zzm();
            double d = iZzm2;
            int[] iArr = zzaksVar.zzb;
            double d2 = iZzm3 - 128;
            int iMax = java.lang.Math.max(i2, java.lang.Math.min((int) ((1.402d * d2) + d), 255)) << 16;
            double d3 = iZzm4 - 128;
            iArr[iZzm] = java.lang.Math.max(0, java.lang.Math.min((int) (d + (d3 * 1.772d)), 255)) | (iZzm5 << 24) | iMax | (java.lang.Math.max(0, java.lang.Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)) << 8);
            i4++;
            i2 = 0;
        }
        zzaksVar.zzc = true;
    }

    public final com.google.android.gms.internal.ads.zzco zza() {
        int i;
        if (this.zzd == 0 || this.zze == 0 || this.zzh == 0 || this.zzi == 0) {
            return null;
        }
        com.google.android.gms.internal.ads.zzdy zzdyVar = this.zza;
        if (zzdyVar.zze() == 0 || zzdyVar.zzd() != zzdyVar.zze() || !this.zzc) {
            return null;
        }
        zzdyVar.zzL(0);
        int i2 = this.zzh * this.zzi;
        int[] iArr = new int[i2];
        int i3 = 0;
        while (i3 < i2) {
            int iZzm = this.zza.zzm();
            if (iZzm != 0) {
                i = i3 + 1;
                iArr[i3] = this.zzb[iZzm];
            } else {
                int iZzm2 = this.zza.zzm();
                if (iZzm2 != 0) {
                    int iZzm3 = iZzm2 & 63;
                    if ((iZzm2 & 64) != 0) {
                        iZzm3 = (iZzm3 << 8) | this.zza.zzm();
                    }
                    i = iZzm3 + i3;
                    java.util.Arrays.fill(iArr, i3, i, (iZzm2 & 128) == 0 ? this.zzb[0] : this.zzb[this.zza.zzm()]);
                }
            }
            i3 = i;
        }
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(iArr, this.zzh, this.zzi, android.graphics.Bitmap.Config.ARGB_8888);
        com.google.android.gms.internal.ads.zzcm zzcmVar = new com.google.android.gms.internal.ads.zzcm();
        zzcmVar.zzc(bitmapCreateBitmap);
        zzcmVar.zzh(this.zzf / this.zzd);
        zzcmVar.zzi(0);
        zzcmVar.zze(this.zzg / this.zze, 0);
        zzcmVar.zzf(0);
        zzcmVar.zzk(this.zzh / this.zzd);
        zzcmVar.zzd(this.zzi / this.zze);
        return zzcmVar.zzp();
    }

    public final void zze() {
        this.zzd = 0;
        this.zze = 0;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = 0;
        this.zza.zzI(0);
        this.zzc = false;
    }
}
