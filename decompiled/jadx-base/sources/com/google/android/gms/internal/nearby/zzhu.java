package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhu<K, V> {
    private final java.util.Map<K, java.lang.ref.WeakReference<V>> zza = new java.util.WeakHashMap();

    public final boolean zza(K k) {
        return zzc(k) != null;
    }

    public final void zzb(K k, V v) {
        this.zza.put(k, new java.lang.ref.WeakReference<>(v));
    }

    public final V zzc(K k) {
        java.lang.ref.WeakReference<V> weakReference = this.zza.get(k);
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public final void zzd(K k) {
        this.zza.remove(k);
    }

    public final void zze() {
        this.zza.clear();
    }
}
