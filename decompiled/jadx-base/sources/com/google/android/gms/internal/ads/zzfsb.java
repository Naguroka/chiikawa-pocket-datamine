package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfsb extends com.google.android.gms.internal.ads.zzftd {
    private final java.lang.String zza;
    private final java.lang.String zzb;

    /* synthetic */ zzfsb(java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzfsa zzfsaVar) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.ads.zzftd) {
            com.google.android.gms.internal.ads.zzftd zzftdVar = (com.google.android.gms.internal.ads.zzftd) obj;
            java.lang.String str = this.zza;
            if (str != null ? str.equals(zzftdVar.zzb()) : zzftdVar.zzb() == null) {
                java.lang.String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzftdVar.zza()) : zzftdVar.zza() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final java.lang.String toString() {
        return "OverlayDisplayUpdateRequest{sessionToken=" + this.zza + ", appId=" + this.zzb + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzftd
    public final java.lang.String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzftd
    public final java.lang.String zzb() {
        return this.zza;
    }

    public final int hashCode() {
        java.lang.String str = this.zza;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.zzb;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }
}
