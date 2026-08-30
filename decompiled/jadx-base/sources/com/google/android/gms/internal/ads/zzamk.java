package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzamk {
    private static final byte[] zzd = {0, 0, 1};
    public int zza;
    public int zzb;
    public byte[] zzc = new byte[128];
    private boolean zze;

    public zzamk(int i) {
    }

    public final void zza(byte[] bArr, int i, int i2) {
        if (this.zze) {
            int i3 = i2 - i;
            byte[] bArr2 = this.zzc;
            int length = bArr2.length;
            int i4 = this.zza + i3;
            if (length < i4) {
                this.zzc = java.util.Arrays.copyOf(bArr2, i4 + i4);
            }
            java.lang.System.arraycopy(bArr, i, this.zzc, this.zza, i3);
            this.zza += i3;
        }
    }

    public final void zzb() {
        this.zze = false;
        this.zza = 0;
        this.zzb = 0;
    }

    public final boolean zzc(int i, int i2) {
        if (this.zze) {
            int i3 = this.zza - i2;
            this.zza = i3;
            if (this.zzb != 0 || i != 181) {
                this.zze = false;
                return true;
            }
            this.zzb = i3;
        } else if (i == 179) {
            this.zze = true;
        }
        zza(zzd, 0, 3);
        return false;
    }
}
