package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfwy extends com.google.android.gms.internal.ads.zzfyy implements java.io.Serializable {
    final java.util.Comparator zza;

    zzfwy(java.util.Comparator comparator) {
        this.zza = comparator;
    }

    @Override // com.google.android.gms.internal.ads.zzfyy, java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        return this.zza.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.ads.zzfwy) {
            return this.zza.equals(((com.google.android.gms.internal.ads.zzfwy) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final java.lang.String toString() {
        return this.zza.toString();
    }
}
