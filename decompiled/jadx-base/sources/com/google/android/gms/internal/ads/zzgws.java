package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgws extends com.google.android.gms.internal.ads.zzgww {
    private final byte[] zza;
    private final int zzb;
    private int zzc;

    zzgws(byte[] bArr, int i, int i2) {
        super(null);
        int length = bArr.length;
        if (((length - i2) | i2) < 0) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", java.lang.Integer.valueOf(length), 0, java.lang.Integer.valueOf(i2)));
        }
        this.zza = bArr;
        this.zzc = 0;
        this.zzb = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzK() {
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzL(byte b) throws java.io.IOException {
        java.lang.IndexOutOfBoundsException indexOutOfBoundsException;
        int i = this.zzc;
        try {
            int i2 = i + 1;
            try {
                this.zza[i] = b;
                this.zzc = i2;
            } catch (java.lang.IndexOutOfBoundsException e) {
                indexOutOfBoundsException = e;
                i = i2;
                throw new com.google.android.gms.internal.ads.zzgwt(i, this.zzb, 1, indexOutOfBoundsException);
            }
        } catch (java.lang.IndexOutOfBoundsException e2) {
            indexOutOfBoundsException = e2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzM(int i, boolean z) throws java.io.IOException {
        zzu(i << 3);
        zzL(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzN(int i, com.google.android.gms.internal.ads.zzgwj zzgwjVar) throws java.io.IOException {
        zzu((i << 3) | 2);
        zzu(zzgwjVar.zzd());
        zzgwjVar.zzo(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgww, com.google.android.gms.internal.ads.zzgwa
    public final void zza(byte[] bArr, int i, int i2) throws java.io.IOException {
        zze(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final int zzb() {
        return this.zzb - this.zzc;
    }

    public final void zze(byte[] bArr, int i, int i2) throws java.io.IOException {
        try {
            java.lang.System.arraycopy(bArr, i, this.zza, this.zzc, i2);
            this.zzc += i2;
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new com.google.android.gms.internal.ads.zzgwt(this.zzc, this.zzb, i2, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzh(int i, int i2) throws java.io.IOException {
        zzu((i << 3) | 5);
        zzi(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzi(int i) throws java.io.IOException {
        int i2 = this.zzc;
        try {
            byte[] bArr = this.zza;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.zzc = i2 + 4;
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new com.google.android.gms.internal.ads.zzgwt(i2, this.zzb, 4, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzj(int i, long j) throws java.io.IOException {
        zzu((i << 3) | 1);
        zzk(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzk(long j) throws java.io.IOException {
        int i = this.zzc;
        try {
            byte[] bArr = this.zza;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.zzc = i + 8;
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new com.google.android.gms.internal.ads.zzgwt(i, this.zzb, 8, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzl(int i, int i2) throws java.io.IOException {
        zzu(i << 3);
        zzm(i2);
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
        zzr(str);
    }

    public final void zzr(java.lang.String str) throws java.io.IOException {
        int i = this.zzc;
        try {
            int iZzD = zzD(str.length() * 3);
            int iZzD2 = zzD(str.length());
            if (iZzD2 != iZzD) {
                zzu(com.google.android.gms.internal.ads.zzhat.zze(str));
                byte[] bArr = this.zza;
                int i2 = this.zzc;
                this.zzc = com.google.android.gms.internal.ads.zzhat.zzd(str, bArr, i2, this.zzb - i2);
                return;
            }
            int i3 = i + iZzD2;
            this.zzc = i3;
            int iZzd = com.google.android.gms.internal.ads.zzhat.zzd(str, this.zza, i3, this.zzb - i3);
            this.zzc = i;
            zzu((iZzd - i) - iZzD2);
            this.zzc = iZzd;
        } catch (com.google.android.gms.internal.ads.zzhas e) {
            this.zzc = i;
            zzG(str, e);
        } catch (java.lang.IndexOutOfBoundsException e2) {
            throw new com.google.android.gms.internal.ads.zzgwt(e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzs(int i, int i2) throws java.io.IOException {
        zzu((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzt(int i, int i2) throws java.io.IOException {
        zzu(i << 3);
        zzu(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzv(int i, long j) throws java.io.IOException {
        zzu(i << 3);
        zzw(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzu(int i) throws java.io.IOException {
        int i2;
        java.lang.IndexOutOfBoundsException indexOutOfBoundsException;
        int i3 = this.zzc;
        while ((i & (-128)) != 0) {
            try {
                i2 = i3 + 1;
                try {
                    this.zza[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (java.lang.IndexOutOfBoundsException e) {
                    indexOutOfBoundsException = e;
                    i3 = i2;
                    throw new com.google.android.gms.internal.ads.zzgwt(i3, this.zzb, 1, indexOutOfBoundsException);
                }
            } catch (java.lang.IndexOutOfBoundsException e2) {
                indexOutOfBoundsException = e2;
                throw new com.google.android.gms.internal.ads.zzgwt(i3, this.zzb, 1, indexOutOfBoundsException);
            }
        }
        i2 = i3 + 1;
        this.zza[i3] = (byte) i;
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzw(long j) throws java.io.IOException {
        int i;
        java.lang.IndexOutOfBoundsException indexOutOfBoundsException;
        int i2 = this.zzc;
        if (!com.google.android.gms.internal.ads.zzgww.zzb || this.zzb - i2 < 10) {
            while ((j & (-128)) != 0) {
                try {
                    int i3 = i2 + 1;
                    try {
                        this.zza[i2] = (byte) (((int) j) | 128);
                        j >>>= 7;
                        i2 = i3;
                    } catch (java.lang.IndexOutOfBoundsException e) {
                        e = e;
                        i2 = i3;
                        indexOutOfBoundsException = e;
                        throw new com.google.android.gms.internal.ads.zzgwt(i2, this.zzb, 1, indexOutOfBoundsException);
                    }
                } catch (java.lang.IndexOutOfBoundsException e2) {
                    e = e2;
                }
            }
            i = i2 + 1;
            try {
                this.zza[i2] = (byte) j;
            } catch (java.lang.IndexOutOfBoundsException e3) {
                indexOutOfBoundsException = e3;
                i2 = i;
                throw new com.google.android.gms.internal.ads.zzgwt(i2, this.zzb, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j & (-128)) != 0) {
                com.google.android.gms.internal.ads.zzhao.zzq(this.zza, i2, (byte) (((int) j) | 128));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            com.google.android.gms.internal.ads.zzhao.zzq(this.zza, i2, (byte) j);
        }
        this.zzc = i;
    }
}
