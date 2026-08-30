package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgxa {
    private final java.lang.Object zza;
    private final int zzb;

    zzgxa(java.lang.Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.zzgxa)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzgxa zzgxaVar = (com.google.android.gms.internal.ads.zzgxa) obj;
        return this.zza == zzgxaVar.zza && this.zzb == zzgxaVar.zzb;
    }

    public final int hashCode() {
        return (java.lang.System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
