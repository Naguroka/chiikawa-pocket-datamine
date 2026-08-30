package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgz implements java.util.Map.Entry, java.lang.Comparable {
    final /* synthetic */ com.google.android.gms.internal.play_billing.zzhd zza;
    private final java.lang.Comparable zzb;
    private java.lang.Object zzc;

    zzgz(com.google.android.gms.internal.play_billing.zzhd zzhdVar, java.lang.Comparable comparable, java.lang.Object obj) {
        java.util.Objects.requireNonNull(zzhdVar);
        this.zza = zzhdVar;
        this.zzb = comparable;
        this.zzc = obj;
    }

    private static final boolean zzb(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        return this.zzb.compareTo(((com.google.android.gms.internal.play_billing.zzgz) obj).zzb);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        return zzb(this.zzb, entry.getKey()) && zzb(this.zzc, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ java.lang.Object getKey() {
        return this.zzb;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        return this.zzc;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        java.lang.Comparable comparable = this.zzb;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        java.lang.Object obj = this.zzc;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        this.zza.zzo();
        java.lang.Object obj2 = this.zzc;
        this.zzc = obj;
        return obj2;
    }

    public final java.lang.String toString() {
        return java.lang.String.valueOf(this.zzb) + com.ironsource.y8.i.b + java.lang.String.valueOf(this.zzc);
    }

    public final java.lang.Comparable zza() {
        return this.zzb;
    }
}
