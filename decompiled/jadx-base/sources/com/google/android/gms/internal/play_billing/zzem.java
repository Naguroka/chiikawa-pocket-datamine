package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzem extends com.google.android.gms.internal.play_billing.zzep {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    zzem(byte[] bArr, int i, int i2) {
        super(null);
        int length = bArr.length;
        if (((length - i2) | i2) < 0) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", java.lang.Integer.valueOf(length), 0, java.lang.Integer.valueOf(i2)));
        }
        this.zzc = bArr;
        this.zze = 0;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final int zza() {
        return this.zzd - this.zze;
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
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
                throw new com.google.android.gms.internal.play_billing.zzen(i, this.zzd, 1, indexOutOfBoundsException);
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
            throw new com.google.android.gms.internal.play_billing.zzen(this.zze, this.zzd, i2, e);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzd(int i, boolean z) throws java.io.IOException {
        zzv(i << 3);
        zzb(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zze(int i, com.google.android.gms.internal.play_billing.zzei zzeiVar) throws java.io.IOException {
        zzv((i << 3) | 2);
        zzf(zzeiVar);
    }

    public final void zzf(com.google.android.gms.internal.play_billing.zzei zzeiVar) throws java.io.IOException {
        zzv(zzeiVar.zzd());
        zzeiVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzg(int i, int i2) throws java.io.IOException {
        zzv((i << 3) | 5);
        zzh(i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzh(int i) throws java.io.IOException {
        int i2 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.zze = i2 + 4;
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new com.google.android.gms.internal.play_billing.zzen(i2, this.zzd, 4, e);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzi(int i, long j) throws java.io.IOException {
        zzv((i << 3) | 1);
        zzj(j);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzj(long j) throws java.io.IOException {
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
            throw new com.google.android.gms.internal.play_billing.zzen(i, this.zzd, 8, e);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzk(int i, int i2) throws java.io.IOException {
        zzv(i << 3);
        zzl(i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzl(int i) throws java.io.IOException {
        if (i >= 0) {
            zzv(i);
        } else {
            zzx(i);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzm(byte[] bArr, int i, int i2) throws java.io.IOException {
        zzc(bArr, 0, i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    final void zzn(int i, com.google.android.gms.internal.play_billing.zzgl zzglVar, com.google.android.gms.internal.play_billing.zzgv zzgvVar) throws java.io.IOException {
        zzv((i << 3) | 2);
        zzv(((com.google.android.gms.internal.play_billing.zzds) zzglVar).zze(zzgvVar));
        zzgvVar.zzi(zzglVar, this.zza);
    }

    public final void zzo(com.google.android.gms.internal.play_billing.zzgl zzglVar) throws java.io.IOException {
        zzv(zzglVar.zzj());
        zzglVar.zzL(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzp(int i, com.google.android.gms.internal.play_billing.zzgl zzglVar) throws java.io.IOException {
        zzv(11);
        zzu(2, i);
        zzv(26);
        zzo(zzglVar);
        zzv(12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzq(int i, com.google.android.gms.internal.play_billing.zzei zzeiVar) throws java.io.IOException {
        zzv(11);
        zzu(2, i);
        zze(3, zzeiVar);
        zzv(12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzr(int i, java.lang.String str) throws java.io.IOException {
        zzv((i << 3) | 2);
        zzs(str);
    }

    public final void zzs(java.lang.String str) throws java.io.IOException {
        int i = this.zze;
        try {
            int iZzC = zzC(str.length() * 3);
            int iZzC2 = zzC(str.length());
            if (iZzC2 != iZzC) {
                zzv(com.google.android.gms.internal.play_billing.zzhr.zzc(str));
                byte[] bArr = this.zzc;
                int i2 = this.zze;
                this.zze = com.google.android.gms.internal.play_billing.zzhr.zzb(str, bArr, i2, this.zzd - i2);
                return;
            }
            int i3 = i + iZzC2;
            this.zze = i3;
            int iZzb = com.google.android.gms.internal.play_billing.zzhr.zzb(str, this.zzc, i3, this.zzd - i3);
            this.zze = i;
            zzv((iZzb - i) - iZzC2);
            this.zze = iZzb;
        } catch (com.google.android.gms.internal.play_billing.zzhq e) {
            this.zze = i;
            zzF(str, e);
        } catch (java.lang.IndexOutOfBoundsException e2) {
            throw new com.google.android.gms.internal.play_billing.zzen(e2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzt(int i, int i2) throws java.io.IOException {
        zzv((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzu(int i, int i2) throws java.io.IOException {
        zzv(i << 3);
        zzv(i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzw(int i, long j) throws java.io.IOException {
        zzv(i << 3);
        zzx(j);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzv(int i) throws java.io.IOException {
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
                    throw new com.google.android.gms.internal.play_billing.zzen(i3, this.zzd, 1, indexOutOfBoundsException);
                }
            } catch (java.lang.IndexOutOfBoundsException e2) {
                indexOutOfBoundsException = e2;
                throw new com.google.android.gms.internal.play_billing.zzen(i3, this.zzd, 1, indexOutOfBoundsException);
            }
        }
        i2 = i3 + 1;
        this.zzc[i3] = (byte) i;
        this.zze = i2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzx(long j) throws java.io.IOException {
        int i;
        java.lang.IndexOutOfBoundsException indexOutOfBoundsException;
        int i2 = this.zze;
        if (!com.google.android.gms.internal.play_billing.zzep.zzd || this.zzd - i2 < 10) {
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
                        throw new com.google.android.gms.internal.play_billing.zzen(i2, this.zzd, 1, indexOutOfBoundsException);
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
                throw new com.google.android.gms.internal.play_billing.zzen(i2, this.zzd, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j & (-128)) != 0) {
                com.google.android.gms.internal.play_billing.zzho.zzn(this.zzc, i2, (byte) (((int) j) | 128));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            com.google.android.gms.internal.play_billing.zzho.zzn(this.zzc, i2, (byte) j);
        }
        this.zze = i;
    }
}
