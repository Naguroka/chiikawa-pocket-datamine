package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzebb extends com.google.android.gms.internal.ads.zzebx {
    private final android.app.Activity zza;
    private final com.google.android.gms.ads.internal.overlay.zzm zzb;
    private final java.lang.String zzc;
    private final java.lang.String zzd;

    /* synthetic */ zzebb(android.app.Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzeba zzebaVar) {
        this.zza = activity;
        this.zzb = zzmVar;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar;
        java.lang.String str;
        java.lang.String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.ads.zzebx) {
            com.google.android.gms.internal.ads.zzebx zzebxVar = (com.google.android.gms.internal.ads.zzebx) obj;
            if (this.zza.equals(zzebxVar.zza()) && ((zzmVar = this.zzb) != null ? zzmVar.equals(zzebxVar.zzb()) : zzebxVar.zzb() == null) && ((str = this.zzc) != null ? str.equals(zzebxVar.zzc()) : zzebxVar.zzc() == null) && ((str2 = this.zzd) != null ? str2.equals(zzebxVar.zzd()) : zzebxVar.zzd() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzb;
        int iHashCode2 = ((iHashCode * 1000003) ^ (zzmVar == null ? 0 : zzmVar.hashCode())) * 1000003;
        java.lang.String str = this.zzc;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        java.lang.String str2 = this.zzd;
        return iHashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzb;
        return "OfflineUtilsParams{activity=" + this.zza.toString() + ", adOverlay=" + java.lang.String.valueOf(zzmVar) + ", gwsQueryId=" + this.zzc + ", uri=" + this.zzd + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzebx
    public final android.app.Activity zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzebx
    public final com.google.android.gms.ads.internal.overlay.zzm zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzebx
    public final java.lang.String zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzebx
    public final java.lang.String zzd() {
        return this.zzd;
    }
}
