package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzba {
    private final java.lang.String zza;
    private final long zzb;

    zzba(java.lang.String str, long j) {
        this.zza = str;
        this.zzb = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.nearby.zzba) {
            com.google.android.gms.internal.nearby.zzba zzbaVar = (com.google.android.gms.internal.nearby.zzba) obj;
            if (com.google.android.gms.common.internal.Objects.equal(this.zza, zzbaVar.zza) && com.google.android.gms.common.internal.Objects.equal(java.lang.Long.valueOf(this.zzb), java.lang.Long.valueOf(zzbaVar.zzb))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, java.lang.Long.valueOf(this.zzb));
    }

    public final java.lang.String zza() {
        return this.zza;
    }
}
