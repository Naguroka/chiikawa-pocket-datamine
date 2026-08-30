package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzah implements com.google.android.gms.internal.measurement.zzap {
    private final java.lang.Double zza;

    public zzah(java.lang.Double d) {
        if (d == null) {
            this.zza = java.lang.Double.valueOf(Double.NaN);
        } else {
            this.zza = d;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.measurement.zzah) {
            return this.zza.equals(((com.google.android.gms.internal.measurement.zzah) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final java.lang.String toString() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final com.google.android.gms.internal.measurement.zzap zzcz(java.lang.String str, com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        if ("toString".equals(str)) {
            return new com.google.android.gms.internal.measurement.zzat(zzi());
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("%s.%s is not a function.", zzi(), str));
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final com.google.android.gms.internal.measurement.zzap zzd() {
        return new com.google.android.gms.internal.measurement.zzah(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.lang.Boolean zzg() {
        java.lang.Double d = this.zza;
        boolean z = false;
        if (!java.lang.Double.isNaN(d.doubleValue()) && d.doubleValue() != 0.0d) {
            z = true;
        }
        return java.lang.Boolean.valueOf(z);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.lang.Double zzh() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.lang.String zzi() {
        java.lang.Double d = this.zza;
        if (java.lang.Double.isNaN(d.doubleValue())) {
            return "NaN";
        }
        if (java.lang.Double.isInfinite(d.doubleValue())) {
            return d.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        java.math.BigDecimal bigDecimalValueOf = java.math.BigDecimal.valueOf(d.doubleValue());
        java.math.BigDecimal bigDecimal = bigDecimalValueOf.signum() == 0 ? new java.math.BigDecimal(java.math.BigInteger.ZERO, 0) : bigDecimalValueOf.stripTrailingZeros();
        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("0E0");
        decimalFormat.setRoundingMode(java.math.RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimal.scale() > 0 ? bigDecimal.precision() : bigDecimal.scale()) - 1);
        java.lang.String str = decimalFormat.format(bigDecimal);
        int iIndexOf = str.indexOf(androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST);
        if (iIndexOf <= 0) {
            return str;
        }
        int i = java.lang.Integer.parseInt(str.substring(iIndexOf + 1));
        return ((i >= 0 || i <= -7) && (i < 0 || i >= 21)) ? str.replace("E-", "e-").replace(androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "e+") : bigDecimal.toPlainString();
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.util.Iterator zzl() {
        return null;
    }
}
