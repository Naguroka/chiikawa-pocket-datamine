package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgyj implements java.util.Map.Entry {
    private final java.util.Map.Entry zza;

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.zza.getKey();
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        if (((com.google.android.gms.internal.ads.zzgym) this.zza.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.ads.zzgzc) {
            return ((com.google.android.gms.internal.ads.zzgym) this.zza.getValue()).zzc((com.google.android.gms.internal.ads.zzgzc) obj);
        }
        throw new java.lang.IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    public final com.google.android.gms.internal.ads.zzgym zza() {
        return (com.google.android.gms.internal.ads.zzgym) this.zza.getValue();
    }
}
