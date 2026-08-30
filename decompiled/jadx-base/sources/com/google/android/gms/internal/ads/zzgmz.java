package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgmz {
    private final java.lang.Class zza;
    private final java.lang.Class zzb;

    /* synthetic */ zzgmz(java.lang.Class cls, java.lang.Class cls2, com.google.android.gms.internal.ads.zzgna zzgnaVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.zzgmz)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzgmz zzgmzVar = (com.google.android.gms.internal.ads.zzgmz) obj;
        return zzgmzVar.zza.equals(this.zza) && zzgmzVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.zza, this.zzb);
    }

    public final java.lang.String toString() {
        java.lang.Class cls = this.zzb;
        return this.zza.getSimpleName() + " with primitive type: " + cls.getSimpleName();
    }
}
