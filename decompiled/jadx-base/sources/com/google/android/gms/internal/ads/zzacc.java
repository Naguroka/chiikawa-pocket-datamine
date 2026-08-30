package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzacc implements com.google.android.gms.internal.ads.zzaco {
    private final com.google.android.gms.internal.ads.zzl zzb;
    private final long zzc;
    private long zzd;
    private int zzf;
    private int zzg;
    private byte[] zze = new byte[65536];
    private final byte[] zza = new byte[4096];

    static {
        com.google.android.gms.internal.ads.zzas.zzb("media3.extractor");
    }

    public zzacc(com.google.android.gms.internal.ads.zzl zzlVar, long j, long j2) {
        this.zzb = zzlVar;
        this.zzd = j;
        this.zzc = j2;
    }

    private final int zzp(byte[] bArr, int i, int i2) {
        int i3 = this.zzg;
        if (i3 == 0) {
            return 0;
        }
        int iMin = java.lang.Math.min(i3, i2);
        java.lang.System.arraycopy(this.zze, 0, bArr, i, iMin);
        zzu(iMin);
        return iMin;
    }

    private final int zzq(byte[] bArr, int i, int i2, int i3, boolean z) throws java.io.IOException {
        if (java.lang.Thread.interrupted()) {
            throw new java.io.InterruptedIOException();
        }
        int iZza = this.zzb.zza(bArr, i + i3, i2 - i3);
        if (iZza != -1) {
            return i3 + iZza;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new java.io.EOFException();
    }

    private final int zzr(int i) {
        int iMin = java.lang.Math.min(this.zzg, i);
        zzu(iMin);
        return iMin;
    }

    private final void zzs(int i) {
        if (i != -1) {
            this.zzd += (long) i;
        }
    }

    private final void zzt(int i) {
        int i2 = this.zzf + i;
        int length = this.zze.length;
        if (i2 > length) {
            this.zze = java.util.Arrays.copyOf(this.zze, java.lang.Math.max(65536 + i2, java.lang.Math.min(length + length, i2 + 524288)));
        }
    }

    private final void zzu(int i) {
        int i2 = this.zzg - i;
        this.zzg = i2;
        this.zzf = 0;
        byte[] bArr = this.zze;
        byte[] bArr2 = i2 < bArr.length + (-524288) ? new byte[65536 + i2] : bArr;
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
        this.zze = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzaco, com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i, int i2) throws java.io.IOException {
        int iZzp = zzp(bArr, i, i2);
        if (iZzp == 0) {
            iZzp = zzq(bArr, i, i2, 0, true);
        }
        zzs(iZzp);
        return iZzp;
    }

    @Override // com.google.android.gms.internal.ads.zzaco
    public final int zzb(byte[] bArr, int i, int i2) throws java.io.IOException {
        int iMin;
        zzt(i2);
        int i3 = this.zzg;
        int i4 = this.zzf;
        int i5 = i3 - i4;
        if (i5 == 0) {
            iMin = zzq(this.zze, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.zzg += iMin;
        } else {
            iMin = java.lang.Math.min(i2, i5);
        }
        java.lang.System.arraycopy(this.zze, this.zzf, bArr, i, iMin);
        this.zzf += iMin;
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzaco
    public final int zzc(int i) throws java.io.IOException {
        int iZzr = zzr(1);
        if (iZzr == 0) {
            iZzr = zzq(this.zza, 0, java.lang.Math.min(1, 4096), 0, true);
        }
        zzs(iZzr);
        return iZzr;
    }

    @Override // com.google.android.gms.internal.ads.zzaco
    public final long zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaco
    public final long zze() {
        return this.zzd + ((long) this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzaco
    public final long zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzaco
    public final void zzg(int i) throws java.io.IOException {
        zzl(i, false);
    }

    @Override // com.google.android.gms.internal.ads.zzaco
    public final void zzh(byte[] bArr, int i, int i2) throws java.io.IOException {
        zzm(bArr, i, i2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzaco
    public final void zzi(byte[] bArr, int i, int i2) throws java.io.IOException {
        zzn(bArr, i, i2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzaco
    public final void zzj() {
        this.zzf = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaco
    public final void zzk(int i) throws java.io.IOException {
        zzo(i, false);
    }

    public final boolean zzl(int i, boolean z) throws java.io.IOException {
        zzt(i);
        int iZzq = this.zzg - this.zzf;
        while (iZzq < i) {
            iZzq = zzq(this.zze, this.zzf, i, iZzq, z);
            if (iZzq == -1) {
                return false;
            }
            this.zzg = this.zzf + iZzq;
        }
        this.zzf += i;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaco
    public final boolean zzm(byte[] bArr, int i, int i2, boolean z) throws java.io.IOException {
        if (!zzl(i2, z)) {
            return false;
        }
        java.lang.System.arraycopy(this.zze, this.zzf - i2, bArr, i, i2);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaco
    public final boolean zzn(byte[] bArr, int i, int i2, boolean z) throws java.io.IOException {
        int iZzp = zzp(bArr, i, i2);
        while (iZzp < i2 && iZzp != -1) {
            iZzp = zzq(bArr, i, i2, iZzp, z);
        }
        zzs(iZzp);
        return iZzp != -1;
    }

    public final boolean zzo(int i, boolean z) throws java.io.IOException {
        int iZzr = zzr(i);
        while (iZzr < i && iZzr != -1) {
            iZzr = zzq(this.zza, -iZzr, java.lang.Math.min(i, iZzr + 4096), iZzr, false);
        }
        zzs(iZzr);
        return iZzr != -1;
    }
}
