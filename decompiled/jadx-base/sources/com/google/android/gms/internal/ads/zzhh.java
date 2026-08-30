package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class zzhh extends com.google.android.gms.internal.ads.zzhb {
    public com.google.android.gms.internal.ads.zzab zza;
    public final com.google.android.gms.internal.ads.zzhe zzb = new com.google.android.gms.internal.ads.zzhe();
    public java.nio.ByteBuffer zzc;
    public boolean zzd;
    public long zze;
    public java.nio.ByteBuffer zzf;
    private final int zzg;

    static {
        com.google.android.gms.internal.ads.zzas.zzb("media3.decoder");
    }

    public zzhh(int i, int i2) {
        this.zzg = i;
    }

    private final java.nio.ByteBuffer zzm(int i) {
        int i2 = this.zzg;
        if (i2 == 1) {
            return java.nio.ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return java.nio.ByteBuffer.allocateDirect(i);
        }
        java.nio.ByteBuffer byteBuffer = this.zzc;
        throw new com.google.android.gms.internal.ads.zzhg(byteBuffer == null ? 0 : byteBuffer.capacity(), i);
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public void zzb() {
        super.zzb();
        java.nio.ByteBuffer byteBuffer = this.zzc;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        java.nio.ByteBuffer byteBuffer2 = this.zzf;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.zzd = false;
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"data"})
    public final void zzj(int i) {
        java.nio.ByteBuffer byteBuffer = this.zzc;
        if (byteBuffer == null) {
            this.zzc = zzm(i);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (iCapacity >= i2) {
            this.zzc = byteBuffer;
            return;
        }
        java.nio.ByteBuffer byteBufferZzm = zzm(i2);
        byteBufferZzm.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferZzm.put(byteBuffer);
        }
        this.zzc = byteBufferZzm;
    }

    public final void zzk() {
        java.nio.ByteBuffer byteBuffer = this.zzc;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        java.nio.ByteBuffer byteBuffer2 = this.zzf;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean zzl() {
        return zzd(1073741824);
    }
}
