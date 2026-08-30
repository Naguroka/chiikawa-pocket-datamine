package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzccn implements com.google.android.gms.internal.ads.zzhed {
    private final java.nio.ByteBuffer zza;

    zzccn(java.nio.ByteBuffer byteBuffer) {
        this.zza = byteBuffer.duplicate();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzhed
    public final int zza(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        if (this.zza.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int iMin = java.lang.Math.min(byteBuffer.remaining(), this.zza.remaining());
        byte[] bArr = new byte[iMin];
        this.zza.get(bArr);
        byteBuffer.put(bArr);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzhed
    public final long zzb() throws java.io.IOException {
        return this.zza.position();
    }

    @Override // com.google.android.gms.internal.ads.zzhed
    public final long zzc() throws java.io.IOException {
        return this.zza.limit();
    }

    @Override // com.google.android.gms.internal.ads.zzhed
    public final java.nio.ByteBuffer zzd(long j, long j2) throws java.io.IOException {
        java.nio.ByteBuffer byteBuffer = this.zza;
        int iPosition = byteBuffer.position();
        byteBuffer.position((int) j);
        java.nio.ByteBuffer byteBufferSlice = this.zza.slice();
        byteBufferSlice.limit((int) j2);
        this.zza.position(iPosition);
        return byteBufferSlice;
    }

    @Override // com.google.android.gms.internal.ads.zzhed
    public final void zze(long j) throws java.io.IOException {
        this.zza.position((int) j);
    }
}
