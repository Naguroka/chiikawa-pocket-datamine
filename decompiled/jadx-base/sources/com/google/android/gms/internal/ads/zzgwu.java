package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgwu extends com.google.android.gms.internal.ads.zzgwr {
    private final java.io.OutputStream zzg;

    zzgwu(java.io.OutputStream outputStream, int i) {
        super(i);
        if (outputStream == null) {
            throw new java.lang.NullPointerException("out");
        }
        this.zzg = outputStream;
    }

    private final void zzI() throws java.io.IOException {
        this.zzg.write(this.zza, 0, this.zzc);
        this.zzc = 0;
    }

    private final void zzJ(int i) throws java.io.IOException {
        if (this.zzb - this.zzc < i) {
            zzI();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzK() throws java.io.IOException {
        if (this.zzc > 0) {
            zzI();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzL(byte b) throws java.io.IOException {
        if (this.zzc == this.zzb) {
            zzI();
        }
        zzc(b);
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzM(int i, boolean z) throws java.io.IOException {
        zzJ(11);
        zzf(i << 3);
        zzc(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzN(int i, com.google.android.gms.internal.ads.zzgwj zzgwjVar) throws java.io.IOException {
        zzu((i << 3) | 2);
        zzu(zzgwjVar.zzd());
        zzgwjVar.zzo(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgww, com.google.android.gms.internal.ads.zzgwa
    public final void zza(byte[] bArr, int i, int i2) throws java.io.IOException {
        zzr(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzh(int i, int i2) throws java.io.IOException {
        zzJ(14);
        zzf((i << 3) | 5);
        zzd(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzi(int i) throws java.io.IOException {
        zzJ(4);
        zzd(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzj(int i, long j) throws java.io.IOException {
        zzJ(18);
        zzf((i << 3) | 1);
        zze(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzk(long j) throws java.io.IOException {
        zzJ(8);
        zze(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzl(int i, int i2) throws java.io.IOException {
        zzJ(20);
        zzf(i << 3);
        if (i2 >= 0) {
            zzf(i2);
        } else {
            zzg(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzm(int i) throws java.io.IOException {
        if (i >= 0) {
            zzu(i);
        } else {
            zzw(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    final void zzn(int i, com.google.android.gms.internal.ads.zzgzc zzgzcVar, com.google.android.gms.internal.ads.zzgzv zzgzvVar) throws java.io.IOException {
        zzu((i << 3) | 2);
        zzu(((com.google.android.gms.internal.ads.zzgvs) zzgzcVar).zzaM(zzgzvVar));
        zzgzvVar.zzj(zzgzcVar, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzo(int i, com.google.android.gms.internal.ads.zzgzc zzgzcVar) throws java.io.IOException {
        zzu(11);
        zzt(2, i);
        zzu(26);
        zzu(zzgzcVar.zzaY());
        zzgzcVar.zzcY(this);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzp(int i, com.google.android.gms.internal.ads.zzgwj zzgwjVar) throws java.io.IOException {
        zzu(11);
        zzt(2, i);
        zzN(3, zzgwjVar);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzq(int i, java.lang.String str) throws java.io.IOException {
        zzu((i << 3) | 2);
        zzx(str);
    }

    public final void zzr(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = this.zzb;
        int i4 = this.zzc;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            java.lang.System.arraycopy(bArr, i, this.zza, i4, i2);
            this.zzc += i2;
            this.zzd += i2;
            return;
        }
        java.lang.System.arraycopy(bArr, i, this.zza, i4, i5);
        int i6 = i + i5;
        this.zzc = this.zzb;
        this.zzd += i5;
        zzI();
        int i7 = i2 - i5;
        if (i7 <= this.zzb) {
            java.lang.System.arraycopy(bArr, i6, this.zza, 0, i7);
            this.zzc = i7;
        } else {
            this.zzg.write(bArr, i6, i7);
        }
        this.zzd += i7;
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzs(int i, int i2) throws java.io.IOException {
        zzu((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzt(int i, int i2) throws java.io.IOException {
        zzJ(20);
        zzf(i << 3);
        zzf(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzu(int i) throws java.io.IOException {
        zzJ(5);
        zzf(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzv(int i, long j) throws java.io.IOException {
        zzJ(20);
        zzf(i << 3);
        zzg(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzw(long j) throws java.io.IOException {
        zzJ(10);
        zzg(j);
    }

    public final void zzx(java.lang.String str) throws java.io.IOException {
        int iZze;
        try {
            int length = str.length() * 3;
            int iZzD = zzD(length);
            int i = iZzD + length;
            int i2 = this.zzb;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int iZzd = com.google.android.gms.internal.ads.zzhat.zzd(str, bArr, 0, length);
                zzu(iZzd);
                zzr(bArr, 0, iZzd);
                return;
            }
            if (i > i2 - this.zzc) {
                zzI();
            }
            int iZzD2 = zzD(str.length());
            int i3 = this.zzc;
            try {
                if (iZzD2 == iZzD) {
                    int i4 = i3 + iZzD2;
                    this.zzc = i4;
                    int iZzd2 = com.google.android.gms.internal.ads.zzhat.zzd(str, this.zza, i4, this.zzb - i4);
                    this.zzc = i3;
                    iZze = (iZzd2 - i3) - iZzD2;
                    zzf(iZze);
                    this.zzc = iZzd2;
                } else {
                    iZze = com.google.android.gms.internal.ads.zzhat.zze(str);
                    zzf(iZze);
                    this.zzc = com.google.android.gms.internal.ads.zzhat.zzd(str, this.zza, this.zzc, iZze);
                }
                this.zzd += iZze;
            } catch (com.google.android.gms.internal.ads.zzhas e) {
                this.zzd -= this.zzc - i3;
                this.zzc = i3;
                throw e;
            } catch (java.lang.ArrayIndexOutOfBoundsException e2) {
                throw new com.google.android.gms.internal.ads.zzgwt(e2);
            }
        } catch (com.google.android.gms.internal.ads.zzhas e3) {
            zzG(str, e3);
        }
    }
}
