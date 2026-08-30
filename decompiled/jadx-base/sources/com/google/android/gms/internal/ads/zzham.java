package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzham extends com.google.android.gms.internal.ads.zzhan {
    zzham(sun.misc.Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.zzhan
    public final byte zza(long j) {
        return libcore.io.Memory.peekByte(j);
    }

    @Override // com.google.android.gms.internal.ads.zzhan
    public final double zzb(java.lang.Object obj, long j) {
        return java.lang.Double.longBitsToDouble(this.zza.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.ads.zzhan
    public final float zzc(java.lang.Object obj, long j) {
        return java.lang.Float.intBitsToFloat(this.zza.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.ads.zzhan
    public final void zzd(long j, byte[] bArr, long j2, long j3) {
        libcore.io.Memory.peekByteArray(j, bArr, (int) j2, (int) j3);
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.ads.zzhao.zzk(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.ads.zzhao.zzl(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z' boolean)' in method call: com.google.android.gms.internal.ads.zzhao.zzk(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z' boolean)' in method call: com.google.android.gms.internal.ads.zzhao.zzl(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.ads.zzhan
    public final void zze(java.lang.Object obj, long j, boolean z) {
        if (com.google.android.gms.internal.ads.zzhao.zzb) {
            com.google.android.gms.internal.ads.zzhao.zzk(obj, j, z);
        } else {
            com.google.android.gms.internal.ads.zzhao.zzl(obj, j, z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhan
    public final void zzf(java.lang.Object obj, long j, byte b) {
        if (com.google.android.gms.internal.ads.zzhao.zzb) {
            com.google.android.gms.internal.ads.zzhao.zzG(obj, j, b);
        } else {
            com.google.android.gms.internal.ads.zzhao.zzH(obj, j, b);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhan
    public final void zzg(java.lang.Object obj, long j, double d) {
        this.zza.putLong(obj, j, java.lang.Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.ads.zzhan
    public final void zzh(java.lang.Object obj, long j, float f) {
        this.zza.putInt(obj, j, java.lang.Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.ads.zzhan
    public final boolean zzi(java.lang.Object obj, long j) {
        return com.google.android.gms.internal.ads.zzhao.zzb ? com.google.android.gms.internal.ads.zzhao.zzw(obj, j) : com.google.android.gms.internal.ads.zzhao.zzx(obj, j);
    }
}
