package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfup implements java.io.Serializable, com.google.android.gms.internal.ads.zzfuo {
    private final java.util.List zza;

    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.ads.zzfup) {
            return this.zza.equals(((com.google.android.gms.internal.ads.zzfup) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 306654252;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Predicates.and(");
        boolean z = true;
        for (java.lang.Object obj : this.zza) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfuo
    public final boolean zza(java.lang.Object obj) {
        for (int i = 0; i < this.zza.size(); i++) {
            if (!((com.google.android.gms.internal.ads.zzfuo) this.zza.get(i)).zza(obj)) {
                return false;
            }
        }
        return true;
    }
}
