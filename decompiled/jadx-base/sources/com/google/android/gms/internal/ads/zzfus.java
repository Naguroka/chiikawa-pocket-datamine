package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfus extends com.google.android.gms.internal.ads.zzful {
    private final java.lang.Object zza;

    zzfus(java.lang.Object obj) {
        this.zza = obj;
    }

    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.ads.zzfus) {
            return this.zza.equals(((com.google.android.gms.internal.ads.zzfus) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final java.lang.String toString() {
        return "Optional.of(" + this.zza.toString() + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzful
    public final com.google.android.gms.internal.ads.zzful zza(com.google.android.gms.internal.ads.zzfuc zzfucVar) {
        java.lang.Object objApply = zzfucVar.apply(this.zza);
        com.google.android.gms.internal.ads.zzfun.zzc(objApply, "the Function passed to Optional.transform() must not return null.");
        return new com.google.android.gms.internal.ads.zzfus(objApply);
    }

    @Override // com.google.android.gms.internal.ads.zzful
    public final java.lang.Object zzb(java.lang.Object obj) {
        return this.zza;
    }
}
