package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzadf {
    public int zza;
    public java.lang.String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;

    public zzadf() {
    }

    public zzadf(com.google.android.gms.internal.ads.zzadf zzadfVar) {
        this.zza = zzadfVar.zza;
        this.zzb = zzadfVar.zzb;
        this.zzc = zzadfVar.zzc;
        this.zzd = zzadfVar.zzd;
        this.zze = zzadfVar.zze;
        this.zzf = zzadfVar.zzf;
        this.zzg = zzadfVar.zzg;
    }

    public final boolean zza(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (!com.google.android.gms.internal.ads.zzadg.zzm(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        int i6 = i4 - 1;
        this.zza = i2;
        this.zzb = com.google.android.gms.internal.ads.zzadg.zza[3 - i3];
        int i7 = com.google.android.gms.internal.ads.zzadg.zzb[i5];
        this.zzd = i7;
        if (i2 == 2) {
            i7 /= 2;
            this.zzd = i7;
        } else if (i2 == 0) {
            i7 /= 4;
            this.zzd = i7;
        }
        int i8 = (i >>> 9) & 1;
        this.zzg = com.google.android.gms.internal.ads.zzadg.zzl(i2, i3);
        if (i3 == 3) {
            int i9 = i2 == 3 ? com.google.android.gms.internal.ads.zzadg.zzc[i6] : com.google.android.gms.internal.ads.zzadg.zzd[i6];
            this.zzf = i9;
            this.zzc = (((i9 * 12) / i7) + i8) * 4;
        } else {
            int i10 = org.objectweb.asm.Opcodes.D2F;
            if (i2 == 3) {
                int i11 = i3 == 2 ? com.google.android.gms.internal.ads.zzadg.zze[i6] : com.google.android.gms.internal.ads.zzadg.zzf[i6];
                this.zzf = i11;
                this.zzc = ((i11 * org.objectweb.asm.Opcodes.D2F) / i7) + i8;
            } else {
                int i12 = com.google.android.gms.internal.ads.zzadg.zzg[i6];
                this.zzf = i12;
                if (i3 == 1) {
                    i10 = 72;
                }
                this.zzc = ((i10 * i12) / i7) + i8;
            }
        }
        this.zze = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
