package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfl {
    private byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    public zzfl(byte[] bArr, int i, int i2) {
        this.zza = bArr;
        this.zzc = i;
        this.zzb = i2;
        zzj();
    }

    private final int zzi() {
        int i = 0;
        while (!zzh()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? zza(i) : 0);
    }

    private final void zzj() {
        int i;
        int i2 = this.zzc;
        boolean z = false;
        if (i2 >= 0 && (i2 < (i = this.zzb) || (i2 == i && this.zzd == 0))) {
            z = true;
        }
        com.google.android.gms.internal.ads.zzcw.zzf(z);
    }

    private final boolean zzk(int i) {
        if (i < 2 || i >= this.zzb) {
            return false;
        }
        byte[] bArr = this.zza;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i + (-1)] == 0;
    }

    public final int zza(int i) {
        int i2;
        this.zzd += i;
        int i3 = 0;
        while (true) {
            i2 = this.zzd;
            int i4 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.zzd = i5;
            byte[] bArr = this.zza;
            int i6 = this.zzc;
            i3 |= (bArr[i6] & 255) << i5;
            if (true != zzk(i6 + 1)) {
                i4 = 1;
            }
            this.zzc = i6 + i4;
        }
        byte[] bArr2 = this.zza;
        int i7 = this.zzc;
        int i8 = i3 | ((bArr2[i7] & 255) >> (8 - i2));
        int i9 = 32 - i;
        if (i2 == 8) {
            this.zzd = 0;
            this.zzc = i7 + (true != zzk(i7 + 1) ? 1 : 2);
        }
        int i10 = ((-1) >>> i9) & i8;
        zzj();
        return i10;
    }

    public final int zzb() {
        int iZzi = zzi();
        return (iZzi % 2 == 0 ? -1 : 1) * ((iZzi + 1) / 2);
    }

    public final int zzc() {
        return zzi();
    }

    public final void zzd() {
        int i = this.zzd;
        if (i > 0) {
            zzf(8 - i);
        }
    }

    public final void zze() {
        int i = this.zzd + 1;
        this.zzd = i;
        if (i == 8) {
            this.zzd = 0;
            int i2 = this.zzc;
            this.zzc = i2 + (true == zzk(i2 + 1) ? 2 : 1);
        }
        zzj();
    }

    public final void zzf(int i) {
        int i2 = this.zzc;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.zzc = i4;
        int i5 = this.zzd + (i - (i3 * 8));
        this.zzd = i5;
        if (i5 > 7) {
            this.zzc = i4 + 1;
            this.zzd = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.zzc) {
                zzj();
                return;
            } else if (zzk(i2)) {
                this.zzc++;
                i2 += 2;
            }
        }
    }

    public final boolean zzg(int i) {
        int i2 = this.zzc;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.zzd + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.zzb) {
                break;
            }
            if (zzk(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.zzb;
        if (i4 >= i6) {
            return i4 == i6 && i5 == 0;
        }
        return true;
    }

    public final boolean zzh() {
        int i = this.zza[this.zzc] & (128 >> this.zzd);
        zze();
        return i != 0;
    }
}
