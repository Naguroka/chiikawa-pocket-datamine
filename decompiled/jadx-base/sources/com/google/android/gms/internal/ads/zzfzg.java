package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfzg extends com.google.android.gms.internal.ads.zzfyy implements java.io.Serializable {
    static final com.google.android.gms.internal.ads.zzfzg zza = new com.google.android.gms.internal.ads.zzfzg();

    private zzfzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzfyy, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        java.lang.Comparable comparable2 = (java.lang.Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final java.lang.String toString() {
        return "Ordering.natural().reverse()";
    }
}
