package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzee {
    private long[] zza;
    private java.lang.Object[] zzb;
    private int zzc;
    private int zzd;

    public zzee() {
        throw null;
    }

    public zzee(int i) {
        this.zza = new long[10];
        this.zzb = new java.lang.Object[10];
    }

    private final java.lang.Object zzf() {
        com.google.android.gms.internal.ads.zzcw.zzf(this.zzd > 0);
        java.lang.Object[] objArr = this.zzb;
        int i = this.zzc;
        java.lang.Object obj = objArr[i];
        objArr[i] = null;
        this.zzc = (i + 1) % objArr.length;
        this.zzd--;
        return obj;
    }

    public final synchronized int zza() {
        return this.zzd;
    }

    public final synchronized java.lang.Object zzb() {
        if (this.zzd == 0) {
            return null;
        }
        return zzf();
    }

    public final synchronized java.lang.Object zzc(long j) {
        java.lang.Object objZzf;
        objZzf = null;
        while (this.zzd > 0 && j - this.zza[this.zzc] >= 0) {
            objZzf = zzf();
        }
        return objZzf;
    }

    public final synchronized void zzd(long j, java.lang.Object obj) {
        int i = this.zzd;
        if (i > 0) {
            if (j <= this.zza[((this.zzc + i) - 1) % this.zzb.length]) {
                zze();
            }
        }
        int length = this.zzb.length;
        if (this.zzd >= length) {
            int i2 = length + length;
            long[] jArr = new long[i2];
            java.lang.Object[] objArr = new java.lang.Object[i2];
            int i3 = this.zzc;
            int i4 = length - i3;
            java.lang.System.arraycopy(this.zza, i3, jArr, 0, i4);
            java.lang.System.arraycopy(this.zzb, this.zzc, objArr, 0, i4);
            int i5 = this.zzc;
            if (i5 > 0) {
                java.lang.System.arraycopy(this.zza, 0, jArr, i4, i5);
                java.lang.System.arraycopy(this.zzb, 0, objArr, i4, this.zzc);
            }
            this.zza = jArr;
            this.zzb = objArr;
            this.zzc = 0;
        }
        int i6 = this.zzc;
        int i7 = this.zzd;
        java.lang.Object[] objArr2 = this.zzb;
        int length2 = (i6 + i7) % objArr2.length;
        this.zza[length2] = j;
        objArr2[length2] = obj;
        this.zzd = i7 + 1;
    }

    public final synchronized void zze() {
        this.zzc = 0;
        this.zzd = 0;
        java.util.Arrays.fill(this.zzb, (java.lang.Object) null);
    }
}
