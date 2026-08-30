package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaqq extends java.io.ByteArrayOutputStream {
    private final com.google.android.gms.internal.ads.zzaqd zza;

    public zzaqq(com.google.android.gms.internal.ads.zzaqd zzaqdVar, int i) {
        this.zza = zzaqdVar;
        this.buf = zzaqdVar.zzb(java.lang.Math.max(i, 256));
    }

    private final void zza(int i) {
        if (this.count + i <= this.buf.length) {
            return;
        }
        com.google.android.gms.internal.ads.zzaqd zzaqdVar = this.zza;
        int i2 = this.count + i;
        byte[] bArrZzb = zzaqdVar.zzb(i2 + i2);
        java.lang.System.arraycopy(this.buf, 0, bArrZzb, 0, this.count);
        this.zza.zza(this.buf);
        this.buf = bArrZzb;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.zza.zza(this.buf);
        this.buf = null;
        super.close();
    }

    public final void finalize() {
        this.zza.zza(this.buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i) {
        zza(1);
        super.write(i);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        zza(i2);
        super.write(bArr, i, i2);
    }
}
