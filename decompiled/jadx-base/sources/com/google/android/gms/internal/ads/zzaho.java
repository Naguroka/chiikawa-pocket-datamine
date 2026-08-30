package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaho {
    private static final long[] zza = {128, 64, 32, 16, 8, 4, 2, 1};
    private final byte[] zzb = new byte[8];
    private int zzc;
    private int zzd;

    public static int zzb(int i) {
        int i2 = 0;
        while (i2 < 8) {
            int i3 = i2 + 1;
            if ((zza[i2] & ((long) i)) != 0) {
                return i3;
            }
            i2 = i3;
        }
        return -1;
    }

    public static long zzc(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~zza[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    public final int zza() {
        return this.zzd;
    }

    public final long zzd(com.google.android.gms.internal.ads.zzaco zzacoVar, boolean z, boolean z2, int i) throws java.io.IOException {
        if (this.zzc == 0) {
            if (!zzacoVar.zzn(this.zzb, 0, 1, z)) {
                return -1L;
            }
            int iZzb = zzb(this.zzb[0] & 255);
            this.zzd = iZzb;
            if (iZzb == -1) {
                throw new java.lang.IllegalStateException("No valid varint length mask found");
            }
            this.zzc = 1;
        }
        int i2 = this.zzd;
        if (i2 > i) {
            this.zzc = 0;
            return -2L;
        }
        if (i2 != 1) {
            zzacoVar.zzi(this.zzb, 1, i2 - 1);
        }
        this.zzc = 0;
        return zzc(this.zzb, this.zzd, z2);
    }

    public final void zze() {
        this.zzc = 0;
        this.zzd = 0;
    }
}
