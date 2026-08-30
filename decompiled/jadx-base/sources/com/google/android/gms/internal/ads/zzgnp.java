package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgnp {
    private final java.lang.Class zza;
    private final java.lang.Class zzb;

    /* synthetic */ zzgnp(java.lang.Class cls, java.lang.Class cls2, com.google.android.gms.internal.ads.zzgnq zzgnqVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.zzgnp)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzgnp zzgnpVar = (com.google.android.gms.internal.ads.zzgnp) obj;
        return zzgnpVar.zza.equals(this.zza) && zzgnpVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.zza, this.zzb);
    }

    public final java.lang.String toString() {
        java.lang.Class cls = this.zzb;
        return this.zza.getSimpleName() + " with serialization type: " + cls.getSimpleName();
    }
}
