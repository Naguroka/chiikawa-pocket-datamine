package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzadu {
    private final byte[] zza = new byte[10];
    private boolean zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public final void zza(com.google.android.gms.internal.ads.zzadt zzadtVar, com.google.android.gms.internal.ads.zzads zzadsVar) {
        if (this.zzc > 0) {
            zzadtVar.zzt(this.zzd, this.zze, this.zzf, this.zzg, zzadsVar);
            this.zzc = 0;
        }
    }

    public final void zzb() {
        this.zzb = false;
        this.zzc = 0;
    }

    public final void zzc(com.google.android.gms.internal.ads.zzadt zzadtVar, long j, int i, int i2, int i3, com.google.android.gms.internal.ads.zzads zzadsVar) {
        com.google.android.gms.internal.ads.zzcw.zzg(this.zzg <= i2 + i3, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.zzb) {
            int i4 = this.zzc;
            int i5 = i4 + 1;
            this.zzc = i5;
            if (i4 == 0) {
                this.zzd = j;
                this.zze = i;
                this.zzf = 0;
            }
            this.zzf += i2;
            this.zzg = i3;
            if (i5 >= 16) {
                zza(zzadtVar, zzadsVar);
            }
        }
    }

    public final void zzd(com.google.android.gms.internal.ads.zzaco zzacoVar) throws java.io.IOException {
        if (this.zzb) {
            return;
        }
        zzacoVar.zzh(this.zza, 0, 10);
        zzacoVar.zzj();
        byte[] bArr = this.zza;
        int i = com.google.android.gms.internal.ads.zzabn.zza;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.zzb = true;
        }
    }
}
