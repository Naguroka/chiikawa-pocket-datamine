package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbe {
    public static final com.google.android.gms.internal.ads.zzbe zza = new com.google.android.gms.internal.ads.zzbe(1.0f, 1.0f);
    public final float zzb;
    public final float zzc;
    private final int zzd;

    static {
        java.lang.Integer.toString(0, 36);
        java.lang.Integer.toString(1, 36);
    }

    public zzbe(float f, float f2) {
        com.google.android.gms.internal.ads.zzcw.zzd(f > 0.0f);
        com.google.android.gms.internal.ads.zzcw.zzd(f2 > 0.0f);
        this.zzb = f;
        this.zzc = f2;
        this.zzd = java.lang.Math.round(f * 1000.0f);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzbe zzbeVar = (com.google.android.gms.internal.ads.zzbe) obj;
            if (this.zzb == zzbeVar.zzb && this.zzc == zzbeVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((java.lang.Float.floatToRawIntBits(this.zzb) + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + java.lang.Float.floatToRawIntBits(this.zzc);
    }

    public final java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", java.lang.Float.valueOf(this.zzb), java.lang.Float.valueOf(this.zzc));
    }

    public final long zza(long j) {
        return j * ((long) this.zzd);
    }
}
