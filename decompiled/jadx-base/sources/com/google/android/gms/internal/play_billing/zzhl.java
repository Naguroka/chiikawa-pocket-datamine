package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzhl extends com.google.android.gms.internal.play_billing.zzhn {
    zzhl(sun.misc.Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhn
    public final double zza(java.lang.Object obj, long j) {
        return java.lang.Double.longBitsToDouble(this.zza.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.play_billing.zzhn
    public final float zzb(java.lang.Object obj, long j) {
        return java.lang.Float.intBitsToFloat(this.zza.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.play_billing.zzhn
    public final void zzc(java.lang.Object obj, long j, boolean z) {
        if (com.google.android.gms.internal.play_billing.zzho.zzb) {
            com.google.android.gms.internal.play_billing.zzho.zzD(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            com.google.android.gms.internal.play_billing.zzho.zzE(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhn
    public final void zzd(java.lang.Object obj, long j, byte b) {
        if (com.google.android.gms.internal.play_billing.zzho.zzb) {
            com.google.android.gms.internal.play_billing.zzho.zzD(obj, j, b);
        } else {
            com.google.android.gms.internal.play_billing.zzho.zzE(obj, j, b);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhn
    public final void zze(java.lang.Object obj, long j, double d) {
        this.zza.putLong(obj, j, java.lang.Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.play_billing.zzhn
    public final void zzf(java.lang.Object obj, long j, float f) {
        this.zza.putInt(obj, j, java.lang.Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.play_billing.zzhn
    public final boolean zzg(java.lang.Object obj, long j) {
        return com.google.android.gms.internal.play_billing.zzho.zzb ? com.google.android.gms.internal.play_billing.zzho.zzt(obj, j) : com.google.android.gms.internal.play_billing.zzho.zzu(obj, j);
    }
}
