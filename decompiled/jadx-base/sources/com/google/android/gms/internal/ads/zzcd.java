package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcd {
    public static final com.google.android.gms.internal.ads.zzcd zza = new com.google.android.gms.internal.ads.zzcd(0, 0, 1.0f);
    public final int zzb;
    public final int zzc;
    public final float zzd;

    static {
        java.lang.Integer.toString(0, 36);
        java.lang.Integer.toString(1, 36);
        java.lang.Integer.toString(3, 36);
    }

    public zzcd(int i, int i2, float f) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.ads.zzcd) {
            com.google.android.gms.internal.ads.zzcd zzcdVar = (com.google.android.gms.internal.ads.zzcd) obj;
            if (this.zzb == zzcdVar.zzb && this.zzc == zzcdVar.zzc && this.zzd == zzcdVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zzb + 217) * 31) + this.zzc) * 31) + java.lang.Float.floatToRawIntBits(this.zzd);
    }
}
