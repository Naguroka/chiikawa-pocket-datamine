package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzk {
    public static final com.google.android.gms.internal.ads.zzk zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final byte[] zze;
    public final int zzf;
    public final int zzg;
    private int zzh;

    static {
        com.google.android.gms.internal.ads.zzi zziVar = new com.google.android.gms.internal.ads.zzi();
        zziVar.zzc(1);
        zziVar.zzb(2);
        zziVar.zzd(3);
        zza = zziVar.zzg();
        com.google.android.gms.internal.ads.zzi zziVar2 = new com.google.android.gms.internal.ads.zzi();
        zziVar2.zzc(1);
        zziVar2.zzb(1);
        zziVar2.zzd(2);
        zziVar2.zzg();
        java.lang.Integer.toString(0, 36);
        java.lang.Integer.toString(1, 36);
        java.lang.Integer.toString(2, 36);
        java.lang.Integer.toString(3, 36);
        java.lang.Integer.toString(4, 36);
        java.lang.Integer.toString(5, 36);
    }

    /* synthetic */ zzk(int i, int i2, int i3, byte[] bArr, int i4, int i5, com.google.android.gms.internal.ads.zzj zzjVar) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = bArr;
        this.zzf = i4;
        this.zzg = i5;
    }

    @org.checkerframework.dataflow.qual.Pure
    public static int zza(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    @org.checkerframework.dataflow.qual.Pure
    public static int zzb(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#1"}, result = false)
    public static boolean zzg(com.google.android.gms.internal.ads.zzk zzkVar) {
        int i;
        int i2;
        int i3;
        int i4;
        if (zzkVar == null) {
            return true;
        }
        int i5 = zzkVar.zzb;
        return (i5 == -1 || i5 == 1 || i5 == 2) && ((i = zzkVar.zzc) == -1 || i == 2) && (((i2 = zzkVar.zzd) == -1 || i2 == 3) && zzkVar.zze == null && (((i3 = zzkVar.zzg) == -1 || i3 == 8) && ((i4 = zzkVar.zzf) == -1 || i4 == 8)));
    }

    private static java.lang.String zzh(int i) {
        if (i == -1) {
            return "Unset color range";
        }
        if (i == 1) {
            return "Full range";
        }
        if (i == 2) {
            return "Limited range";
        }
        return "Undefined color range " + i;
    }

    private static java.lang.String zzi(int i) {
        if (i == -1) {
            return "Unset color space";
        }
        if (i == 6) {
            return "BT2020";
        }
        if (i == 1) {
            return "BT709";
        }
        if (i == 2) {
            return "BT601";
        }
        return "Undefined color space " + i;
    }

    private static java.lang.String zzj(int i) {
        if (i == -1) {
            return "Unset color transfer";
        }
        if (i == 10) {
            return "Gamma 2.2";
        }
        if (i == 1) {
            return "Linear";
        }
        if (i == 2) {
            return "sRGB";
        }
        if (i == 3) {
            return "SDR SMPTE 170M";
        }
        if (i == 6) {
            return "ST2084 PQ";
        }
        if (i == 7) {
            return "HLG";
        }
        return "Undefined color transfer " + i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzk zzkVar = (com.google.android.gms.internal.ads.zzk) obj;
            if (this.zzb == zzkVar.zzb && this.zzc == zzkVar.zzc && this.zzd == zzkVar.zzd && java.util.Arrays.equals(this.zze, zzkVar.zze) && this.zzf == zzkVar.zzf && this.zzg == zzkVar.zzg) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzh;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((this.zzb + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzc) * 31) + this.zzd) * 31) + java.util.Arrays.hashCode(this.zze)) * 31) + this.zzf) * 31) + this.zzg;
        this.zzh = iHashCode;
        return iHashCode;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        int i = this.zzf;
        int i2 = this.zzd;
        int i3 = this.zzc;
        java.lang.String strZzi = zzi(this.zzb);
        java.lang.String strZzh = zzh(i3);
        java.lang.String strZzj = zzj(i2);
        java.lang.String str2 = "NA";
        if (i != -1) {
            str = i + "bit Luma";
        } else {
            str = "NA";
        }
        int i4 = this.zzg;
        if (i4 != -1) {
            str2 = i4 + "bit Chroma";
        }
        return "ColorInfo(" + strZzi + ", " + strZzh + ", " + strZzj + ", " + (this.zze != null) + ", " + str + ", " + str2 + ")";
    }

    public final com.google.android.gms.internal.ads.zzi zzc() {
        return new com.google.android.gms.internal.ads.zzi(this, null);
    }

    public final java.lang.String zzd() {
        java.lang.String str;
        java.lang.String str2 = zzf() ? java.lang.String.format(java.util.Locale.US, "%s/%s/%s", zzi(this.zzb), zzh(this.zzc), zzj(this.zzd)) : "NA/NA/NA";
        if (zze()) {
            str = this.zzf + "/" + this.zzg;
        } else {
            str = "NA/NA";
        }
        return str2 + "/" + str;
    }

    public final boolean zze() {
        return (this.zzf == -1 || this.zzg == -1) ? false : true;
    }

    public final boolean zzf() {
        return (this.zzb == -1 || this.zzc == -1 || this.zzd == -1) ? false : true;
    }
}
