package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgvq extends java.io.FilterInputStream {
    private int zza;

    zzgvq(java.io.InputStream inputStream, int i) {
        super(inputStream);
        this.zza = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws java.io.IOException {
        return java.lang.Math.min(super.available(), this.zza);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws java.io.IOException {
        if (this.zza <= 0) {
            return -1;
        }
        int i = super.read();
        if (i >= 0) {
            this.zza--;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws java.io.IOException {
        int iSkip = (int) super.skip(java.lang.Math.min(j, this.zza));
        if (iSkip >= 0) {
            this.zza -= iSkip;
        }
        return iSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = this.zza;
        if (i3 <= 0) {
            return -1;
        }
        int i4 = super.read(bArr, i, java.lang.Math.min(i2, i3));
        if (i4 >= 0) {
            this.zza -= i4;
        }
        return i4;
    }
}
