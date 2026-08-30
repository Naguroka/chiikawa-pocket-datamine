package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzog {
    public final java.lang.String zza;
    private final com.google.android.gms.internal.ads.zzof zzb;
    private final java.lang.Object zzc;

    static {
        if (com.google.android.gms.internal.ads.zzei.zza < 31) {
            new com.google.android.gms.internal.ads.zzog("");
        } else {
            int i = com.google.android.gms.internal.ads.zzof.zzb;
        }
    }

    public zzog(android.media.metrics.LogSessionId logSessionId, java.lang.String str) {
        this.zzb = new com.google.android.gms.internal.ads.zzof(logSessionId);
        this.zza = str;
        this.zzc = new java.lang.Object();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.zzog)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzog zzogVar = (com.google.android.gms.internal.ads.zzog) obj;
        return java.util.Objects.equals(this.zza, zzogVar.zza) && java.util.Objects.equals(this.zzb, zzogVar.zzb) && java.util.Objects.equals(this.zzc, zzogVar.zzc);
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.zza, this.zzb, this.zzc);
    }

    public zzog(java.lang.String str) {
        com.google.android.gms.internal.ads.zzcw.zzf(com.google.android.gms.internal.ads.zzei.zza < 31);
        this.zza = str;
        this.zzb = null;
        this.zzc = new java.lang.Object();
    }

    public final android.media.metrics.LogSessionId zza() {
        com.google.android.gms.internal.ads.zzof zzofVar = this.zzb;
        zzofVar.getClass();
        return zzofVar.zza;
    }
}
