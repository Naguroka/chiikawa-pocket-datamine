package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzor {
    public static final com.google.android.gms.internal.ads.zzor zza = new com.google.android.gms.internal.ads.zzop().zzd();
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;

    /* synthetic */ zzor(com.google.android.gms.internal.ads.zzop zzopVar, com.google.android.gms.internal.ads.zzoq zzoqVar) {
        this.zzb = zzopVar.zza;
        this.zzc = zzopVar.zzb;
        this.zzd = zzopVar.zzc;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzor zzorVar = (com.google.android.gms.internal.ads.zzor) obj;
            if (this.zzb == zzorVar.zzb && this.zzc == zzorVar.zzc && this.zzd == zzorVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z = this.zzb;
        boolean z2 = this.zzc;
        return ((z ? 1 : 0) << 2) + (z2 ? 1 : 0) + (z2 ? 1 : 0) + (this.zzd ? 1 : 0);
    }
}
