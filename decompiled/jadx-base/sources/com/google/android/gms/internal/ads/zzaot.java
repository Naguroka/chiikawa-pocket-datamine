package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaot {
    public static long zza(java.nio.ByteBuffer byteBuffer) {
        zzg(byteBuffer);
        return zze(byteBuffer, byteBuffer.position() + 16);
    }

    public static long zzb(java.nio.ByteBuffer byteBuffer) {
        zzg(byteBuffer);
        return zze(byteBuffer, byteBuffer.position() + 12);
    }

    static android.util.Pair zzc(java.io.RandomAccessFile randomAccessFile) throws java.io.IOException {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        android.util.Pair pairZzf = zzf(randomAccessFile, 0);
        return pairZzf != null ? pairZzf : zzf(randomAccessFile, 65535);
    }

    public static void zzd(java.nio.ByteBuffer byteBuffer, long j) {
        zzg(byteBuffer);
        int iPosition = byteBuffer.position() + 16;
        if (j >= 0 && j <= androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE) {
            byteBuffer.putInt(byteBuffer.position() + iPosition, (int) j);
        } else {
            throw new java.lang.IllegalArgumentException("uint32 value of out range: " + j);
        }
    }

    private static long zze(java.nio.ByteBuffer byteBuffer, int i) {
        return ((long) byteBuffer.getInt(i)) & androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE;
    }

    private static android.util.Pair zzf(java.io.RandomAccessFile randomAccessFile, int i) throws java.io.IOException {
        int i2;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(((int) java.lang.Math.min(i, (-22) + length)) + 22);
        byteBufferAllocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        long jCapacity = length - ((long) byteBufferAllocate.capacity());
        randomAccessFile.seek(jCapacity);
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        zzg(byteBufferAllocate);
        int iCapacity = byteBufferAllocate.capacity();
        if (iCapacity >= 22) {
            int i3 = iCapacity - 22;
            int iMin = java.lang.Math.min(i3, 65535);
            int i4 = 0;
            while (true) {
                if (i4 >= iMin) {
                    i2 = -1;
                    break;
                }
                i2 = i3 - i4;
                if (byteBufferAllocate.getInt(i2) == 101010256 && ((char) byteBufferAllocate.getShort(i2 + 20)) == i4) {
                    break;
                }
                i4++;
            }
        } else {
            i2 = -1;
            break;
        }
        if (i2 == -1) {
            return null;
        }
        byteBufferAllocate.position(i2);
        java.nio.ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
        byteBufferSlice.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        return android.util.Pair.create(byteBufferSlice, java.lang.Long.valueOf(jCapacity + ((long) i2)));
    }

    private static void zzg(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.order() != java.nio.ByteOrder.LITTLE_ENDIAN) {
            throw new java.lang.IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }
}
