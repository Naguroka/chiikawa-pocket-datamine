package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzjr extends com.google.android.gms.internal.drive.zzjb {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.android.gms.internal.drive.zzjr.class.getName());
    private static final boolean zzog = com.google.android.gms.internal.drive.zznd.zzfd();
    com.google.android.gms.internal.drive.zzjt zzoh;

    public static int zzad(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int zzaf(int i) {
        return 4;
    }

    public static int zzag(int i) {
        return 4;
    }

    private static int zzai(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static int zzb(double d) {
        return 8;
    }

    public static int zzb(float f) {
        return 4;
    }

    public static com.google.android.gms.internal.drive.zzjr zzb(byte[] bArr) {
        return new com.google.android.gms.internal.drive.zzjr.zza(bArr, 0, bArr.length);
    }

    public static int zzd(boolean z) {
        return 1;
    }

    public static int zzp(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static int zzr(long j) {
        return 8;
    }

    public static int zzs(long j) {
        return 8;
    }

    private static long zzt(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public abstract void zza(int i, long j) throws java.io.IOException;

    public abstract void zza(int i, com.google.android.gms.internal.drive.zzjc zzjcVar) throws java.io.IOException;

    public abstract void zza(int i, com.google.android.gms.internal.drive.zzlq zzlqVar) throws java.io.IOException;

    abstract void zza(int i, com.google.android.gms.internal.drive.zzlq zzlqVar, com.google.android.gms.internal.drive.zzmf zzmfVar) throws java.io.IOException;

    public abstract void zza(int i, java.lang.String str) throws java.io.IOException;

    public abstract void zza(com.google.android.gms.internal.drive.zzjc zzjcVar) throws java.io.IOException;

    public abstract void zzaa(int i) throws java.io.IOException;

    public abstract void zzb(int i, int i2) throws java.io.IOException;

    public abstract void zzb(int i, com.google.android.gms.internal.drive.zzjc zzjcVar) throws java.io.IOException;

    public abstract void zzb(int i, boolean z) throws java.io.IOException;

    public abstract void zzb(com.google.android.gms.internal.drive.zzlq zzlqVar) throws java.io.IOException;

    public abstract void zzc(byte b) throws java.io.IOException;

    public abstract void zzc(int i, int i2) throws java.io.IOException;

    public abstract void zzc(int i, long j) throws java.io.IOException;

    public abstract int zzca();

    public abstract void zzd(int i, int i2) throws java.io.IOException;

    abstract void zzd(byte[] bArr, int i, int i2) throws java.io.IOException;

    public abstract void zzf(int i, int i2) throws java.io.IOException;

    public abstract void zzl(long j) throws java.io.IOException;

    public abstract void zzl(java.lang.String str) throws java.io.IOException;

    public abstract void zzn(long j) throws java.io.IOException;

    public abstract void zzx(int i) throws java.io.IOException;

    public abstract void zzy(int i) throws java.io.IOException;

    public static class zzb extends java.io.IOException {
        zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zzb(java.lang.Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        zzb(java.lang.String str, java.lang.Throwable th) {
            java.lang.String strValueOf = java.lang.String.valueOf(str);
            super(strValueOf.length() != 0 ? "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(strValueOf) : new java.lang.String("CodedOutputStream was writing to a flat byte array and ran out of space.: "), th);
        }
    }

    private zzjr() {
    }

    public final void zze(int i, int i2) throws java.io.IOException {
        zzd(i, zzai(i2));
    }

    public final void zzb(int i, long j) throws java.io.IOException {
        zza(i, zzt(j));
    }

    public final void zza(int i, float f) throws java.io.IOException {
        zzf(i, java.lang.Float.floatToRawIntBits(f));
    }

    public final void zza(int i, double d) throws java.io.IOException {
        zzc(i, java.lang.Double.doubleToRawLongBits(d));
    }

    public final void zzz(int i) throws java.io.IOException {
        zzy(zzai(i));
    }

    static class zza extends com.google.android.gms.internal.drive.zzjr {
        private final byte[] buffer;
        private final int limit;
        private final int offset;
        private int position;

        zza(byte[] bArr, int i, int i2) {
            super();
            if (bArr == null) {
                throw new java.lang.NullPointerException("buffer");
            }
            int i3 = i2 + 0;
            if ((i2 | 0 | (bArr.length - i3)) < 0) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", java.lang.Integer.valueOf(bArr.length), 0, java.lang.Integer.valueOf(i2)));
            }
            this.buffer = bArr;
            this.offset = 0;
            this.position = 0;
            this.limit = i3;
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zzb(int i, int i2) throws java.io.IOException {
            zzy((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zzc(int i, int i2) throws java.io.IOException {
            zzb(i, 0);
            zzx(i2);
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zzd(int i, int i2) throws java.io.IOException {
            zzb(i, 0);
            zzy(i2);
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zzf(int i, int i2) throws java.io.IOException {
            zzb(i, 5);
            zzaa(i2);
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zza(int i, long j) throws java.io.IOException {
            zzb(i, 0);
            zzl(j);
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zzc(int i, long j) throws java.io.IOException {
            zzb(i, 1);
            zzn(j);
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zzb(int i, boolean z) throws java.io.IOException {
            zzb(i, 0);
            zzc(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zza(int i, java.lang.String str) throws java.io.IOException {
            zzb(i, 2);
            zzl(str);
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zza(int i, com.google.android.gms.internal.drive.zzjc zzjcVar) throws java.io.IOException {
            zzb(i, 2);
            zza(zzjcVar);
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zza(com.google.android.gms.internal.drive.zzjc zzjcVar) throws java.io.IOException {
            zzy(zzjcVar.size());
            zzjcVar.zza(this);
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zzd(byte[] bArr, int i, int i2) throws java.io.IOException {
            zzy(i2);
            write(bArr, 0, i2);
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        final void zza(int i, com.google.android.gms.internal.drive.zzlq zzlqVar, com.google.android.gms.internal.drive.zzmf zzmfVar) throws java.io.IOException {
            zzb(i, 2);
            com.google.android.gms.internal.drive.zzit zzitVar = (com.google.android.gms.internal.drive.zzit) zzlqVar;
            int iZzbm = zzitVar.zzbm();
            if (iZzbm == -1) {
                iZzbm = zzmfVar.zzn(zzitVar);
                zzitVar.zzo(iZzbm);
            }
            zzy(iZzbm);
            zzmfVar.zza(zzlqVar, this.zzoh);
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zza(int i, com.google.android.gms.internal.drive.zzlq zzlqVar) throws java.io.IOException {
            zzb(1, 3);
            zzd(2, i);
            zzb(3, 2);
            zzb(zzlqVar);
            zzb(1, 4);
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zzb(int i, com.google.android.gms.internal.drive.zzjc zzjcVar) throws java.io.IOException {
            zzb(1, 3);
            zzd(2, i);
            zza(3, zzjcVar);
            zzb(1, 4);
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zzb(com.google.android.gms.internal.drive.zzlq zzlqVar) throws java.io.IOException {
            zzy(zzlqVar.zzcx());
            zzlqVar.zzb(this);
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zzc(byte b) throws java.io.IOException {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                this.position = i + 1;
                bArr[i] = b;
            } catch (java.lang.IndexOutOfBoundsException e) {
                throw new com.google.android.gms.internal.drive.zzjr.zzb(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.position), java.lang.Integer.valueOf(this.limit), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zzx(int i) throws java.io.IOException {
            if (i >= 0) {
                zzy(i);
            } else {
                zzl(i);
            }
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zzy(int i) throws java.io.IOException {
            if (!com.google.android.gms.internal.drive.zzjr.zzog || com.google.android.gms.internal.drive.zzix.zzbr() || zzca() < 5) {
                while ((i & (-128)) != 0) {
                    try {
                        byte[] bArr = this.buffer;
                        int i2 = this.position;
                        this.position = i2 + 1;
                        bArr[i2] = (byte) ((i & 127) | 128);
                        i >>>= 7;
                    } catch (java.lang.IndexOutOfBoundsException e) {
                        throw new com.google.android.gms.internal.drive.zzjr.zzb(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.position), java.lang.Integer.valueOf(this.limit), 1), e);
                    }
                }
                byte[] bArr2 = this.buffer;
                int i3 = this.position;
                this.position = i3 + 1;
                bArr2[i3] = (byte) i;
                return;
            }
            if ((i & (-128)) == 0) {
                byte[] bArr3 = this.buffer;
                int i4 = this.position;
                this.position = i4 + 1;
                com.google.android.gms.internal.drive.zznd.zza(bArr3, i4, (byte) i);
                return;
            }
            byte[] bArr4 = this.buffer;
            int i5 = this.position;
            this.position = i5 + 1;
            com.google.android.gms.internal.drive.zznd.zza(bArr4, i5, (byte) (i | 128));
            int i6 = i >>> 7;
            if ((i6 & (-128)) == 0) {
                byte[] bArr5 = this.buffer;
                int i7 = this.position;
                this.position = i7 + 1;
                com.google.android.gms.internal.drive.zznd.zza(bArr5, i7, (byte) i6);
                return;
            }
            byte[] bArr6 = this.buffer;
            int i8 = this.position;
            this.position = i8 + 1;
            com.google.android.gms.internal.drive.zznd.zza(bArr6, i8, (byte) (i6 | 128));
            int i9 = i6 >>> 7;
            if ((i9 & (-128)) == 0) {
                byte[] bArr7 = this.buffer;
                int i10 = this.position;
                this.position = i10 + 1;
                com.google.android.gms.internal.drive.zznd.zza(bArr7, i10, (byte) i9);
                return;
            }
            byte[] bArr8 = this.buffer;
            int i11 = this.position;
            this.position = i11 + 1;
            com.google.android.gms.internal.drive.zznd.zza(bArr8, i11, (byte) (i9 | 128));
            int i12 = i9 >>> 7;
            if ((i12 & (-128)) == 0) {
                byte[] bArr9 = this.buffer;
                int i13 = this.position;
                this.position = i13 + 1;
                com.google.android.gms.internal.drive.zznd.zza(bArr9, i13, (byte) i12);
                return;
            }
            byte[] bArr10 = this.buffer;
            int i14 = this.position;
            this.position = i14 + 1;
            com.google.android.gms.internal.drive.zznd.zza(bArr10, i14, (byte) (i12 | 128));
            byte[] bArr11 = this.buffer;
            int i15 = this.position;
            this.position = i15 + 1;
            com.google.android.gms.internal.drive.zznd.zza(bArr11, i15, (byte) (i12 >>> 7));
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zzaa(int i) throws java.io.IOException {
            try {
                byte[] bArr = this.buffer;
                int i2 = this.position;
                int i3 = i2 + 1;
                bArr[i2] = (byte) i;
                int i4 = i3 + 1;
                bArr[i3] = (byte) (i >> 8);
                int i5 = i4 + 1;
                bArr[i4] = (byte) (i >> 16);
                this.position = i5 + 1;
                bArr[i5] = (byte) (i >>> 24);
            } catch (java.lang.IndexOutOfBoundsException e) {
                throw new com.google.android.gms.internal.drive.zzjr.zzb(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.position), java.lang.Integer.valueOf(this.limit), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zzl(long j) throws java.io.IOException {
            if (com.google.android.gms.internal.drive.zzjr.zzog && zzca() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i = this.position;
                    this.position = i + 1;
                    com.google.android.gms.internal.drive.zznd.zza(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i2 = this.position;
                this.position = i2 + 1;
                com.google.android.gms.internal.drive.zznd.zza(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.buffer;
                    int i3 = this.position;
                    this.position = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (java.lang.IndexOutOfBoundsException e) {
                    throw new com.google.android.gms.internal.drive.zzjr.zzb(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.position), java.lang.Integer.valueOf(this.limit), 1), e);
                }
            }
            byte[] bArr4 = this.buffer;
            int i4 = this.position;
            this.position = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zzn(long j) throws java.io.IOException {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                int i2 = i + 1;
                bArr[i] = (byte) j;
                int i3 = i2 + 1;
                bArr[i2] = (byte) (j >> 8);
                int i4 = i3 + 1;
                bArr[i3] = (byte) (j >> 16);
                int i5 = i4 + 1;
                bArr[i4] = (byte) (j >> 24);
                int i6 = i5 + 1;
                bArr[i5] = (byte) (j >> 32);
                int i7 = i6 + 1;
                bArr[i6] = (byte) (j >> 40);
                int i8 = i7 + 1;
                bArr[i7] = (byte) (j >> 48);
                this.position = i8 + 1;
                bArr[i8] = (byte) (j >> 56);
            } catch (java.lang.IndexOutOfBoundsException e) {
                throw new com.google.android.gms.internal.drive.zzjr.zzb(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.position), java.lang.Integer.valueOf(this.limit), 1), e);
            }
        }

        private final void write(byte[] bArr, int i, int i2) throws java.io.IOException {
            try {
                java.lang.System.arraycopy(bArr, i, this.buffer, this.position, i2);
                this.position += i2;
            } catch (java.lang.IndexOutOfBoundsException e) {
                throw new com.google.android.gms.internal.drive.zzjr.zzb(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.position), java.lang.Integer.valueOf(this.limit), java.lang.Integer.valueOf(i2)), e);
            }
        }

        @Override // com.google.android.gms.internal.drive.zzjb
        public final void zza(byte[] bArr, int i, int i2) throws java.io.IOException {
            write(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zzl(java.lang.String str) throws java.io.IOException {
            int i = this.position;
            try {
                int iZzad = zzad(str.length() * 3);
                int iZzad2 = zzad(str.length());
                if (iZzad2 == iZzad) {
                    int i2 = i + iZzad2;
                    this.position = i2;
                    int iZza = com.google.android.gms.internal.drive.zznf.zza(str, this.buffer, i2, zzca());
                    this.position = i;
                    zzy((iZza - i) - iZzad2);
                    this.position = iZza;
                    return;
                }
                zzy(com.google.android.gms.internal.drive.zznf.zza(str));
                this.position = com.google.android.gms.internal.drive.zznf.zza(str, this.buffer, this.position, zzca());
            } catch (com.google.android.gms.internal.drive.zznj e) {
                this.position = i;
                zza(str, e);
            } catch (java.lang.IndexOutOfBoundsException e2) {
                throw new com.google.android.gms.internal.drive.zzjr.zzb(e2);
            }
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final int zzca() {
            return this.limit - this.position;
        }
    }

    public final void zzm(long j) throws java.io.IOException {
        zzl(zzt(j));
    }

    public final void zza(float f) throws java.io.IOException {
        zzaa(java.lang.Float.floatToRawIntBits(f));
    }

    public final void zza(double d) throws java.io.IOException {
        zzn(java.lang.Double.doubleToRawLongBits(d));
    }

    public final void zzc(boolean z) throws java.io.IOException {
        zzc(z ? (byte) 1 : (byte) 0);
    }

    public static int zzg(int i, int i2) {
        return zzab(i) + zzac(i2);
    }

    public static int zzh(int i, int i2) {
        return zzab(i) + zzad(i2);
    }

    public static int zzi(int i, int i2) {
        return zzab(i) + zzad(zzai(i2));
    }

    public static int zzj(int i, int i2) {
        return zzab(i) + 4;
    }

    public static int zzk(int i, int i2) {
        return zzab(i) + 4;
    }

    public static int zzd(int i, long j) {
        return zzab(i) + zzp(j);
    }

    public static int zze(int i, long j) {
        return zzab(i) + zzp(j);
    }

    public static int zzf(int i, long j) {
        return zzab(i) + zzp(zzt(j));
    }

    public static int zzg(int i, long j) {
        return zzab(i) + 8;
    }

    public static int zzh(int i, long j) {
        return zzab(i) + 8;
    }

    public static int zzb(int i, float f) {
        return zzab(i) + 4;
    }

    public static int zzb(int i, double d) {
        return zzab(i) + 8;
    }

    public static int zzc(int i, boolean z) {
        return zzab(i) + 1;
    }

    public static int zzl(int i, int i2) {
        return zzab(i) + zzac(i2);
    }

    public static int zzb(int i, java.lang.String str) {
        return zzab(i) + zzm(str);
    }

    public static int zzc(int i, com.google.android.gms.internal.drive.zzjc zzjcVar) {
        int iZzab = zzab(i);
        int size = zzjcVar.size();
        return iZzab + zzad(size) + size;
    }

    public static int zza(int i, com.google.android.gms.internal.drive.zzkx zzkxVar) {
        int iZzab = zzab(i);
        int iZzcx = zzkxVar.zzcx();
        return iZzab + zzad(iZzcx) + iZzcx;
    }

    static int zzb(int i, com.google.android.gms.internal.drive.zzlq zzlqVar, com.google.android.gms.internal.drive.zzmf zzmfVar) {
        return zzab(i) + zza(zzlqVar, zzmfVar);
    }

    public static int zzb(int i, com.google.android.gms.internal.drive.zzlq zzlqVar) {
        return (zzab(1) << 1) + zzh(2, i) + zzab(3) + zzc(zzlqVar);
    }

    public static int zzd(int i, com.google.android.gms.internal.drive.zzjc zzjcVar) {
        return (zzab(1) << 1) + zzh(2, i) + zzc(3, zzjcVar);
    }

    public static int zzb(int i, com.google.android.gms.internal.drive.zzkx zzkxVar) {
        return (zzab(1) << 1) + zzh(2, i) + zza(3, zzkxVar);
    }

    public static int zzab(int i) {
        return zzad(i << 3);
    }

    public static int zzac(int i) {
        if (i >= 0) {
            return zzad(i);
        }
        return 10;
    }

    public static int zzae(int i) {
        return zzad(zzai(i));
    }

    public static int zzo(long j) {
        return zzp(j);
    }

    public static int zzq(long j) {
        return zzp(zzt(j));
    }

    public static int zzah(int i) {
        return zzac(i);
    }

    public static int zzm(java.lang.String str) {
        int length;
        try {
            length = com.google.android.gms.internal.drive.zznf.zza(str);
        } catch (com.google.android.gms.internal.drive.zznj unused) {
            length = str.getBytes(com.google.android.gms.internal.drive.zzkm.UTF_8).length;
        }
        return zzad(length) + length;
    }

    public static int zza(com.google.android.gms.internal.drive.zzkx zzkxVar) {
        int iZzcx = zzkxVar.zzcx();
        return zzad(iZzcx) + iZzcx;
    }

    public static int zzb(com.google.android.gms.internal.drive.zzjc zzjcVar) {
        int size = zzjcVar.size();
        return zzad(size) + size;
    }

    public static int zzc(byte[] bArr) {
        int length = bArr.length;
        return zzad(length) + length;
    }

    public static int zzc(com.google.android.gms.internal.drive.zzlq zzlqVar) {
        int iZzcx = zzlqVar.zzcx();
        return zzad(iZzcx) + iZzcx;
    }

    static int zza(com.google.android.gms.internal.drive.zzlq zzlqVar, com.google.android.gms.internal.drive.zzmf zzmfVar) {
        com.google.android.gms.internal.drive.zzit zzitVar = (com.google.android.gms.internal.drive.zzit) zzlqVar;
        int iZzbm = zzitVar.zzbm();
        if (iZzbm == -1) {
            iZzbm = zzmfVar.zzn(zzitVar);
            zzitVar.zzo(iZzbm);
        }
        return zzad(iZzbm) + iZzbm;
    }

    public final void zzcb() {
        if (zzca() != 0) {
            throw new java.lang.IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void zza(java.lang.String str, com.google.android.gms.internal.drive.zznj zznjVar) throws java.io.IOException {
        logger.logp(java.util.logging.Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (java.lang.Throwable) zznjVar);
        byte[] bytes = str.getBytes(com.google.android.gms.internal.drive.zzkm.UTF_8);
        try {
            zzy(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (com.google.android.gms.internal.drive.zzjr.zzb e) {
            throw e;
        } catch (java.lang.IndexOutOfBoundsException e2) {
            throw new com.google.android.gms.internal.drive.zzjr.zzb(e2);
        }
    }

    @java.lang.Deprecated
    static int zzc(int i, com.google.android.gms.internal.drive.zzlq zzlqVar, com.google.android.gms.internal.drive.zzmf zzmfVar) {
        int iZzab = zzab(i) << 1;
        com.google.android.gms.internal.drive.zzit zzitVar = (com.google.android.gms.internal.drive.zzit) zzlqVar;
        int iZzbm = zzitVar.zzbm();
        if (iZzbm == -1) {
            iZzbm = zzmfVar.zzn(zzitVar);
            zzitVar.zzo(iZzbm);
        }
        return iZzab + iZzbm;
    }

    @java.lang.Deprecated
    public static int zzd(com.google.android.gms.internal.drive.zzlq zzlqVar) {
        return zzlqVar.zzcx();
    }

    @java.lang.Deprecated
    public static int zzaj(int i) {
        return zzad(i);
    }
}
