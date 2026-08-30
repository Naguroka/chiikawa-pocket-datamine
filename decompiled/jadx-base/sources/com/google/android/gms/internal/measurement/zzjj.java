package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzjj extends com.google.android.gms.internal.measurement.zzkg {
    private final android.content.Context zza;

    @javax.annotation.Nullable
    private final com.google.common.base.Supplier zzb;

    zzjj(android.content.Context context, @javax.annotation.Nullable com.google.common.base.Supplier supplier) {
        this.zza = context;
        this.zzb = supplier;
    }

    public final boolean equals(java.lang.Object obj) {
        com.google.common.base.Supplier supplier;
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.measurement.zzkg) {
            com.google.android.gms.internal.measurement.zzkg zzkgVar = (com.google.android.gms.internal.measurement.zzkg) obj;
            if (this.zza.equals(zzkgVar.zza()) && ((supplier = this.zzb) != null ? supplier.equals(zzkgVar.zzb()) : zzkgVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        com.google.common.base.Supplier supplier = this.zzb;
        return (iHashCode * 1000003) ^ (supplier == null ? 0 : supplier.hashCode());
    }

    public final java.lang.String toString() {
        com.google.common.base.Supplier supplier = this.zzb;
        return "FlagsContext{context=" + this.zza.toString() + ", hermeticFileOverrides=" + java.lang.String.valueOf(supplier) + "}";
    }

    @Override // com.google.android.gms.internal.measurement.zzkg
    final android.content.Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzkg
    @javax.annotation.Nullable
    final com.google.common.base.Supplier zzb() {
        return this.zzb;
    }
}
