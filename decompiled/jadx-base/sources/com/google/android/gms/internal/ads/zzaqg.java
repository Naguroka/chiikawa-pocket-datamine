package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaqg extends java.io.FilterInputStream {
    private final long zza;
    private long zzb;

    zzaqg(java.io.InputStream inputStream, long j) {
        super(inputStream);
        this.zza = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws java.io.IOException {
        int i = super.read();
        if (i != -1) {
            this.zzb++;
        }
        return i;
    }

    final long zza() {
        return this.zza - this.zzb;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = super.read(bArr, i, i2);
        if (i3 != -1) {
            this.zzb += (long) i3;
        }
        return i3;
    }
}
