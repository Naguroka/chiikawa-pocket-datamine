package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfry extends com.google.android.gms.internal.ads.zzfta {
    private final int zza;
    private final java.lang.String zzb;

    /* synthetic */ zzfry(int i, java.lang.String str, com.google.android.gms.internal.ads.zzfrx zzfrxVar) {
        this.zza = i;
        this.zzb = str;
    }

    public final boolean equals(java.lang.Object obj) {
        java.lang.String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.ads.zzfta) {
            com.google.android.gms.internal.ads.zzfta zzftaVar = (com.google.android.gms.internal.ads.zzfta) obj;
            if (this.zza == zzftaVar.zza() && ((str = this.zzb) != null ? str.equals(zzftaVar.zzb()) : zzftaVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.zzb;
        return (str == null ? 0 : str.hashCode()) ^ ((this.zza ^ 1000003) * 1000003);
    }

    public final java.lang.String toString() {
        return "OverlayDisplayState{statusCode=" + this.zza + ", sessionToken=" + this.zzb + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzfta
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfta
    public final java.lang.String zzb() {
        return this.zzb;
    }
}
