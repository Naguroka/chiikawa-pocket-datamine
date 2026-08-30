package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzqt {
    private static final byte[] zza = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};
    private static final byte[] zzb = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    private java.nio.ByteBuffer zzc = com.google.android.gms.internal.ads.zzch.zza;
    private int zze = 0;
    private int zzd = 2;

    private static final void zzc(java.nio.ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(true != z ? (byte) 0 : (byte) 2);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        byteBuffer.put(com.google.android.gms.internal.ads.zzgat.zza(i2));
    }

    public final void zza(com.google.android.gms.internal.ads.zzhh zzhhVar, java.util.List list) {
        int length;
        java.nio.ByteBuffer byteBuffer = zzhhVar.zzc;
        byteBuffer.getClass();
        if (byteBuffer.limit() - zzhhVar.zzc.position() == 0) {
            return;
        }
        byte[] bArr = null;
        if (this.zzd == 2 && (list.size() == 1 || list.size() == 3)) {
            bArr = (byte[]) list.get(0);
        }
        java.nio.ByteBuffer byteBuffer2 = zzhhVar.zzc;
        int iPosition = byteBuffer2.position();
        int iLimit = byteBuffer2.limit();
        int i = iLimit - iPosition;
        int i2 = (i + 255) / 255;
        int i3 = i2 + 27 + i;
        if (this.zzd == 2) {
            length = bArr != null ? bArr.length + 28 : 47;
            i3 += length + 44;
        } else {
            length = 0;
        }
        if (this.zzc.capacity() < i3) {
            this.zzc = java.nio.ByteBuffer.allocate(i3).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        } else {
            this.zzc.clear();
        }
        java.nio.ByteBuffer byteBuffer3 = this.zzc;
        if (this.zzd == 2) {
            if (bArr != null) {
                zzc(byteBuffer3, 0L, 0, 1, true);
                int length2 = bArr.length;
                byteBuffer3.put(com.google.android.gms.internal.ads.zzgat.zza(length2));
                byteBuffer3.put(bArr);
                int i4 = length2 + 28;
                byteBuffer3.putInt(22, com.google.android.gms.internal.ads.zzei.zzf(byteBuffer3.array(), byteBuffer3.arrayOffset(), i4, 0));
                byteBuffer3.position(i4);
            } else {
                byteBuffer3.put(zza);
            }
            byteBuffer3.put(zzb);
        }
        int iZzc = this.zze + com.google.android.gms.internal.ads.zzadi.zzc(byteBuffer2);
        this.zze = iZzc;
        zzc(byteBuffer3, iZzc, this.zzd, i2, false);
        for (int i5 = 0; i5 < i2; i5++) {
            if (i >= 255) {
                byteBuffer3.put((byte) -1);
                i -= 255;
            } else {
                byteBuffer3.put((byte) i);
                i = 0;
            }
        }
        while (iPosition < iLimit) {
            byteBuffer3.put(byteBuffer2.get(iPosition));
            iPosition++;
        }
        byteBuffer2.position(byteBuffer2.limit());
        byteBuffer3.flip();
        if (this.zzd == 2) {
            byteBuffer3.putInt(length + 66, com.google.android.gms.internal.ads.zzei.zzf(byteBuffer3.array(), byteBuffer3.arrayOffset() + length + 44, byteBuffer3.limit() - byteBuffer3.position(), 0));
        } else {
            byteBuffer3.putInt(22, com.google.android.gms.internal.ads.zzei.zzf(byteBuffer3.array(), byteBuffer3.arrayOffset(), byteBuffer3.limit() - byteBuffer3.position(), 0));
        }
        this.zzd++;
        this.zzc = byteBuffer3;
        zzhhVar.zzb();
        zzhhVar.zzj(this.zzc.remaining());
        zzhhVar.zzc.put(this.zzc);
        zzhhVar.zzk();
    }

    public final void zzb() {
        this.zzc = com.google.android.gms.internal.ads.zzch.zza;
        this.zze = 0;
        this.zzd = 2;
    }
}
