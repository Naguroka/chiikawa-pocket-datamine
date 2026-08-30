package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgno {
    private final java.lang.Class zza;
    private final com.google.android.gms.internal.ads.zzgvo zzb;

    /* synthetic */ zzgno(java.lang.Class cls, com.google.android.gms.internal.ads.zzgvo zzgvoVar, com.google.android.gms.internal.ads.zzgnq zzgnqVar) {
        this.zza = cls;
        this.zzb = zzgvoVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.zzgno)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzgno zzgnoVar = (com.google.android.gms.internal.ads.zzgno) obj;
        return zzgnoVar.zza.equals(this.zza) && zzgnoVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.zza, this.zzb);
    }

    public final java.lang.String toString() {
        com.google.android.gms.internal.ads.zzgvo zzgvoVar = this.zzb;
        return this.zza.getSimpleName() + ", object identifier: " + java.lang.String.valueOf(zzgvoVar);
    }
}
