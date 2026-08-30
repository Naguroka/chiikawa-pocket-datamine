package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzhek {
    public static final com.google.android.gms.internal.ads.zzhek zza = new com.google.android.gms.internal.ads.zzhek(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final com.google.android.gms.internal.ads.zzhek zzb = new com.google.android.gms.internal.ads.zzhek(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final com.google.android.gms.internal.ads.zzhek zzc = new com.google.android.gms.internal.ads.zzhek(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final com.google.android.gms.internal.ads.zzhek zzd = new com.google.android.gms.internal.ads.zzhek(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double zze;
    public final double zzf;
    public final double zzg;
    public final double zzh;
    public final double zzi;
    public final double zzj;
    public final double zzk;
    public final double zzl;
    public final double zzm;

    public zzhek(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.zze = d5;
        this.zzf = d6;
        this.zzg = d7;
        this.zzh = d;
        this.zzi = d2;
        this.zzj = d3;
        this.zzk = d4;
        this.zzl = d8;
        this.zzm = d9;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.google.android.gms.internal.ads.zzhek zzhekVar = (com.google.android.gms.internal.ads.zzhek) obj;
        return java.lang.Double.compare(zzhekVar.zzh, this.zzh) == 0 && java.lang.Double.compare(zzhekVar.zzi, this.zzi) == 0 && java.lang.Double.compare(zzhekVar.zzj, this.zzj) == 0 && java.lang.Double.compare(zzhekVar.zzk, this.zzk) == 0 && java.lang.Double.compare(zzhekVar.zzl, this.zzl) == 0 && java.lang.Double.compare(zzhekVar.zzm, this.zzm) == 0 && java.lang.Double.compare(zzhekVar.zze, this.zze) == 0 && java.lang.Double.compare(zzhekVar.zzf, this.zzf) == 0 && java.lang.Double.compare(zzhekVar.zzg, this.zzg) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = java.lang.Double.doubleToLongBits(this.zze);
        long j = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
        long jDoubleToLongBits2 = java.lang.Double.doubleToLongBits(this.zzf);
        long j2 = jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32);
        long jDoubleToLongBits3 = java.lang.Double.doubleToLongBits(this.zzg);
        long j3 = jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32);
        long jDoubleToLongBits4 = java.lang.Double.doubleToLongBits(this.zzh);
        long j4 = jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32);
        long jDoubleToLongBits5 = java.lang.Double.doubleToLongBits(this.zzi);
        long j5 = jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32);
        long jDoubleToLongBits6 = java.lang.Double.doubleToLongBits(this.zzj);
        long j6 = jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32);
        long jDoubleToLongBits7 = java.lang.Double.doubleToLongBits(this.zzk);
        long j7 = jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32);
        long jDoubleToLongBits8 = java.lang.Double.doubleToLongBits(this.zzl);
        long j8 = jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32);
        long jDoubleToLongBits9 = java.lang.Double.doubleToLongBits(this.zzm);
        return (((((((((((((((((int) j) * 31) + ((int) j2)) * 31) + ((int) j3)) * 31) + ((int) j4)) * 31) + ((int) j5)) * 31) + ((int) j6)) * 31) + ((int) j7)) * 31) + ((int) j8)) * 31) + ((int) (jDoubleToLongBits9 ^ (jDoubleToLongBits9 >>> 32)));
    }

    public final java.lang.String toString() {
        if (equals(zza)) {
            return "Rotate 0°";
        }
        if (equals(zzb)) {
            return "Rotate 90°";
        }
        if (equals(zzc)) {
            return "Rotate 180°";
        }
        if (equals(zzd)) {
            return "Rotate 270°";
        }
        double d = this.zze;
        double d2 = this.zzf;
        double d3 = this.zzg;
        double d4 = this.zzh;
        double d5 = this.zzi;
        double d6 = this.zzj;
        double d7 = this.zzk;
        double d8 = this.zzl;
        double d9 = this.zzm;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d);
        sb.append(", v=");
        sb.append(d2);
        sb.append(", w=");
        sb.append(d3);
        sb.append(", a=");
        sb.append(d4);
        sb.append(", b=");
        sb.append(d5);
        sb.append(", c=");
        sb.append(d6);
        sb.append(", d=");
        sb.append(d7);
        sb.append(", tx=");
        sb.append(d8);
        sb.append(", ty=");
        sb.append(d9);
        sb.append("}");
        return sb.toString();
    }
}
