package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzlh extends com.google.android.gms.internal.measurement.zzlk {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    zzlh(byte[] bArr, int i, int i2) {
        super(null);
        int length = bArr.length;
        if (((length - i2) | i2) < 0) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", java.lang.Integer.valueOf(length), 0, java.lang.Integer.valueOf(i2)));
        }
        this.zzc = bArr;
        this.zze = 0;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final int zza() {
        return this.zzd - this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzb(byte b) throws java.io.IOException {
        java.lang.IndexOutOfBoundsException indexOutOfBoundsException;
        int i = this.zze;
        try {
            int i2 = i + 1;
            try {
                this.zzc[i] = b;
                this.zze = i2;
            } catch (java.lang.IndexOutOfBoundsException e) {
                indexOutOfBoundsException = e;
                i = i2;
                throw new com.google.android.gms.internal.measurement.zzli(i, this.zzd, 1, indexOutOfBoundsException);
            }
        } catch (java.lang.IndexOutOfBoundsException e2) {
            indexOutOfBoundsException = e2;
        }
    }

    public final void zzc(byte[] bArr, int i, int i2) throws java.io.IOException {
        try {
            java.lang.System.arraycopy(bArr, 0, this.zzc, this.zze, i2);
            this.zze += i2;
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new com.google.android.gms.internal.measurement.zzli(this.zze, this.zzd, i2, e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzd(int i, boolean z) throws java.io.IOException {
        zzt(i << 3);
        zzb(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zze(int i, com.google.android.gms.internal.measurement.zzld zzldVar) throws java.io.IOException {
        zzt((i << 3) | 2);
        zzt(zzldVar.zzd());
        zzldVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzf(int i, int i2) throws java.io.IOException {
        zzt((i << 3) | 5);
        zzg(i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzg(int i) throws java.io.IOException {
        int i2 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.zze = i2 + 4;
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new com.google.android.gms.internal.measurement.zzli(i2, this.zzd, 4, e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzh(int i, long j) throws java.io.IOException {
        zzt((i << 3) | 1);
        zzi(j);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzi(long j) throws java.io.IOException {
        int i = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.zze = i + 8;
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new com.google.android.gms.internal.measurement.zzli(i, this.zzd, 8, e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzj(int i, int i2) throws java.io.IOException {
        zzt(i << 3);
        zzk(i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzk(int i) throws java.io.IOException {
        if (i >= 0) {
            zzt(i);
        } else {
            zzv(i);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzl(byte[] bArr, int i, int i2) throws java.io.IOException {
        zzc(bArr, 0, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    final void zzm(int i, com.google.android.gms.internal.measurement.zznh zznhVar, com.google.android.gms.internal.measurement.zzns zznsVar) throws java.io.IOException {
        zzt((i << 3) | 2);
        zzt(((com.google.android.gms.internal.measurement.zzko) zznhVar).zzca(zznsVar));
        zznsVar.zzi(zznhVar, this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzn(int i, com.google.android.gms.internal.measurement.zznh zznhVar) throws java.io.IOException {
        zzt(11);
        zzs(2, i);
        zzt(26);
        zzt(zznhVar.zzcf());
        zznhVar.zzcB(this);
        zzt(12);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzo(int i, com.google.android.gms.internal.measurement.zzld zzldVar) throws java.io.IOException {
        zzt(11);
        zzs(2, i);
        zze(3, zzldVar);
        zzt(12);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzp(int i, java.lang.String str) throws java.io.IOException {
        zzt((i << 3) | 2);
        zzq(str);
    }

    public final void zzq(java.lang.String str) throws java.io.IOException {
        int i = this.zze;
        try {
            int iZzz = zzz(str.length() * 3);
            int iZzz2 = zzz(str.length());
            if (iZzz2 != iZzz) {
                zzt(com.google.android.gms.internal.measurement.zzoo.zzc(str));
                byte[] bArr = this.zzc;
                int i2 = this.zze;
                this.zze = com.google.android.gms.internal.measurement.zzoo.zzb(str, bArr, i2, this.zzd - i2);
                return;
            }
            int i3 = i + iZzz2;
            this.zze = i3;
            int iZzb = com.google.android.gms.internal.measurement.zzoo.zzb(str, this.zzc, i3, this.zzd - i3);
            this.zze = i;
            zzt((iZzb - i) - iZzz2);
            this.zze = iZzb;
        } catch (com.google.android.gms.internal.measurement.zzon e) {
            this.zze = i;
            zzC(str, e);
        } catch (java.lang.IndexOutOfBoundsException e2) {
            throw new com.google.android.gms.internal.measurement.zzli(e2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzr(int i, int i2) throws java.io.IOException {
        zzt((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzs(int i, int i2) throws java.io.IOException {
        zzt(i << 3);
        zzt(i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzu(int i, long j) throws java.io.IOException {
        zzt(i << 3);
        zzv(j);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzt(int i) throws java.io.IOException {
        int i2;
        java.lang.IndexOutOfBoundsException indexOutOfBoundsException;
        int i3 = this.zze;
        while ((i & (-128)) != 0) {
            try {
                i2 = i3 + 1;
                try {
                    this.zzc[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (java.lang.IndexOutOfBoundsException e) {
                    indexOutOfBoundsException = e;
                    i3 = i2;
                    throw new com.google.android.gms.internal.measurement.zzli(i3, this.zzd, 1, indexOutOfBoundsException);
                }
            } catch (java.lang.IndexOutOfBoundsException e2) {
                indexOutOfBoundsException = e2;
                throw new com.google.android.gms.internal.measurement.zzli(i3, this.zzd, 1, indexOutOfBoundsException);
            }
        }
        i2 = i3 + 1;
        this.zzc[i3] = (byte) i;
        this.zze = i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzv(long j) throws java.io.IOException {
        int i;
        java.lang.IndexOutOfBoundsException indexOutOfBoundsException;
        int i2 = this.zze;
        if (!com.google.android.gms.internal.measurement.zzlk.zzd || this.zzd - i2 < 10) {
            while ((j & (-128)) != 0) {
                try {
                    int i3 = i2 + 1;
                    try {
                        this.zzc[i2] = (byte) (((int) j) | 128);
                        j >>>= 7;
                        i2 = i3;
                    } catch (java.lang.IndexOutOfBoundsException e) {
                        e = e;
                        i2 = i3;
                        indexOutOfBoundsException = e;
                        throw new com.google.android.gms.internal.measurement.zzli(i2, this.zzd, 1, indexOutOfBoundsException);
                    }
                } catch (java.lang.IndexOutOfBoundsException e2) {
                    e = e2;
                }
            }
            i = i2 + 1;
            try {
                this.zzc[i2] = (byte) j;
            } catch (java.lang.IndexOutOfBoundsException e3) {
                indexOutOfBoundsException = e3;
                i2 = i;
                throw new com.google.android.gms.internal.measurement.zzli(i2, this.zzd, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j & (-128)) != 0) {
                com.google.android.gms.internal.measurement.zzol.zzn(this.zzc, i2, (byte) (((int) j) | 128));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            com.google.android.gms.internal.measurement.zzol.zzn(this.zzc, i2, (byte) j);
        }
        this.zze = i;
    }
}
