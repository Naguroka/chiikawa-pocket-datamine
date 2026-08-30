package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzoi extends com.google.android.gms.internal.measurement.zzok {
    zzoi(sun.misc.Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.zzok
    public final double zza(java.lang.Object obj, long j) {
        return java.lang.Double.longBitsToDouble(this.zza.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.zzok
    public final float zzb(java.lang.Object obj, long j) {
        return java.lang.Float.intBitsToFloat(this.zza.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.zzok
    public final void zzc(java.lang.Object obj, long j, boolean z) {
        if (com.google.android.gms.internal.measurement.zzol.zzb) {
            com.google.android.gms.internal.measurement.zzol.zzD(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            com.google.android.gms.internal.measurement.zzol.zzE(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzok
    public final void zzd(java.lang.Object obj, long j, byte b) {
        if (com.google.android.gms.internal.measurement.zzol.zzb) {
            com.google.android.gms.internal.measurement.zzol.zzD(obj, j, b);
        } else {
            com.google.android.gms.internal.measurement.zzol.zzE(obj, j, b);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzok
    public final void zze(java.lang.Object obj, long j, double d) {
        this.zza.putLong(obj, j, java.lang.Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.measurement.zzok
    public final void zzf(java.lang.Object obj, long j, float f) {
        this.zza.putInt(obj, j, java.lang.Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.measurement.zzok
    public final boolean zzg(java.lang.Object obj, long j) {
        return com.google.android.gms.internal.measurement.zzol.zzb ? com.google.android.gms.internal.measurement.zzol.zzt(obj, j) : com.google.android.gms.internal.measurement.zzol.zzu(obj, j);
    }
}
