package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfrs extends com.google.android.gms.internal.ads.zzfsd {
    private final java.lang.String zza;
    private final java.lang.String zzb;

    /* synthetic */ zzfrs(java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzfrr zzfrrVar) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.ads.zzfsd) {
            com.google.android.gms.internal.ads.zzfsd zzfsdVar = (com.google.android.gms.internal.ads.zzfsd) obj;
            java.lang.String str = this.zza;
            if (str != null ? str.equals(zzfsdVar.zzb()) : zzfsdVar.zzb() == null) {
                java.lang.String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzfsdVar.zza()) : zzfsdVar.zza() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final java.lang.String toString() {
        return "OverlayDisplayDismissRequest{sessionToken=" + this.zza + ", appId=" + this.zzb + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzfsd
    public final java.lang.String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfsd
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
