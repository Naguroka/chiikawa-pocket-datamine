package com.google.android.gms.ads.internal.util.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzn extends com.google.android.gms.ads.internal.util.client.zzx {
    private final int zza;
    private final int zzb;
    private final double zzc;
    private final boolean zzd;

    zzn(int i, int i2, double d, boolean z) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = d;
        this.zzd = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.ads.internal.util.client.zzx) {
            com.google.android.gms.ads.internal.util.client.zzx zzxVar = (com.google.android.gms.ads.internal.util.client.zzx) obj;
            if (this.zza == zzxVar.zzc() && this.zzb == zzxVar.zzb() && java.lang.Double.doubleToLongBits(this.zzc) == java.lang.Double.doubleToLongBits(zzxVar.zza()) && this.zzd == zzxVar.zzd()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((int) ((java.lang.Double.doubleToLongBits(this.zzc) >>> 32) ^ java.lang.Double.doubleToLongBits(this.zzc))) ^ ((((this.zza ^ 1000003) * 1000003) ^ this.zzb) * 1000003)) * 1000003) ^ (true != this.zzd ? 1237 : 1231);
    }

    public final java.lang.String toString() {
        return "PingStrategy{maxAttempts=" + this.zza + ", initialBackoffMs=" + this.zzb + ", backoffMultiplier=" + this.zzc + ", bufferAfterMaxAttempts=" + this.zzd + "}";
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzx
    public final double zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzx
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzx
    public final int zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzx
    public final boolean zzd() {
        return this.zzd;
    }
}
