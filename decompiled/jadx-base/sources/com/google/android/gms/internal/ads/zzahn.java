package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzahn {
    private final com.google.android.gms.internal.ads.zzdy zza = new com.google.android.gms.internal.ads.zzdy(8);
    private int zzb;

    private final long zzb(com.google.android.gms.internal.ads.zzaco zzacoVar) throws java.io.IOException {
        int i;
        com.google.android.gms.internal.ads.zzacc zzaccVar = (com.google.android.gms.internal.ads.zzacc) zzacoVar;
        int i2 = 0;
        zzaccVar.zzm(this.zza.zzN(), 0, 1, false);
        int i3 = this.zza.zzN()[0] & 255;
        if (i3 == 0) {
            return Long.MIN_VALUE;
        }
        int i4 = 128;
        int i5 = 0;
        while (true) {
            i = i5 + 1;
            if ((i3 & i4) != 0) {
                break;
            }
            i4 >>= 1;
            i5 = i;
        }
        int i6 = i3 & (~i4);
        zzaccVar.zzm(this.zza.zzN(), 1, i5, false);
        while (i2 < i5) {
            i2++;
            i6 = (this.zza.zzN()[i2] & 255) + (i6 << 8);
        }
        this.zzb += i;
        return i6;
    }

    public final boolean zza(com.google.android.gms.internal.ads.zzaco zzacoVar) throws java.io.IOException {
        long jZzd = zzacoVar.zzd();
        long j = 1024;
        if (jZzd != -1 && jZzd <= 1024) {
            j = jZzd;
        }
        com.google.android.gms.internal.ads.zzacc zzaccVar = (com.google.android.gms.internal.ads.zzacc) zzacoVar;
        zzaccVar.zzm(this.zza.zzN(), 0, 4, false);
        long jZzu = this.zza.zzu();
        this.zzb = 4;
        while (jZzu != 440786851) {
            int i = (int) j;
            int i2 = this.zzb + 1;
            this.zzb = i2;
            if (i2 == i) {
                return false;
            }
            zzaccVar.zzm(this.zza.zzN(), 0, 1, false);
            jZzu = ((jZzu << 8) & (-256)) | ((long) (this.zza.zzN()[0] & 255));
        }
        long jZzb = zzb(zzacoVar);
        long j2 = this.zzb;
        if (jZzb != Long.MIN_VALUE) {
            long j3 = j2 + jZzb;
            if (jZzd == -1 || j3 < jZzd) {
                while (true) {
                    long j4 = this.zzb;
                    if (j4 < j3) {
                        if (zzb(zzacoVar) == Long.MIN_VALUE) {
                            return false;
                        }
                        long jZzb2 = zzb(zzacoVar);
                        if (jZzb2 < 0) {
                            return false;
                        }
                        if (jZzb2 != 0) {
                            int i3 = (int) jZzb2;
                            zzaccVar.zzl(i3, false);
                            this.zzb += i3;
                        }
                    } else if (j4 == j3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
