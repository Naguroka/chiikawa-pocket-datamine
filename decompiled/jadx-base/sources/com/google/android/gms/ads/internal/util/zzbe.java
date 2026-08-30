package com.google.android.gms.ads.internal.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbe {
    public final java.lang.String zza;
    public final double zzb;
    public final double zzc;
    public final double zzd;
    public final int zze;

    public zzbe(java.lang.String str, double d, double d2, double d3, int i) {
        this.zza = str;
        this.zzc = d;
        this.zzb = d2;
        this.zzd = d3;
        this.zze = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.ads.internal.util.zzbe)) {
            return false;
        }
        com.google.android.gms.ads.internal.util.zzbe zzbeVar = (com.google.android.gms.ads.internal.util.zzbe) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, zzbeVar.zza) && this.zzb == zzbeVar.zzb && this.zzc == zzbeVar.zzc && this.zze == zzbeVar.zze && java.lang.Double.compare(this.zzd, zzbeVar.zzd) == 0;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, java.lang.Double.valueOf(this.zzb), java.lang.Double.valueOf(this.zzc), java.lang.Double.valueOf(this.zzd), java.lang.Integer.valueOf(this.zze));
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("name", this.zza).add("minBound", java.lang.Double.valueOf(this.zzc)).add("maxBound", java.lang.Double.valueOf(this.zzb)).add("percent", java.lang.Double.valueOf(this.zzd)).add("count", java.lang.Integer.valueOf(this.zze)).toString();
    }
}
