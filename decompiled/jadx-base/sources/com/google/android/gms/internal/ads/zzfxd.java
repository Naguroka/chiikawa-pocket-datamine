package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzfxd extends com.google.android.gms.internal.ads.zzfxe implements java.util.Map {
    protected zzfxd() {
    }

    @Override // java.util.Map
    public final void clear() {
        zzb().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object obj) {
        return zzb().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(@javax.annotation.CheckForNull java.lang.Object obj) {
        return zzb().containsValue(obj);
    }

    @Override // java.util.Map
    public java.util.Set entrySet() {
        return zzb().entrySet();
    }

    @Override // java.util.Map
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        return obj == this || zzb().equals(obj);
    }

    @Override // java.util.Map
    @javax.annotation.CheckForNull
    public java.lang.Object get(@javax.annotation.CheckForNull java.lang.Object obj) {
        return zzb().get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return zzb().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return zzb().isEmpty();
    }

    @Override // java.util.Map
    public java.util.Set keySet() {
        return zzb().keySet();
    }

    @Override // java.util.Map
    @javax.annotation.CheckForNull
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        return zzb().put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        zzb().putAll(map);
    }

    @Override // java.util.Map
    @javax.annotation.CheckForNull
    public final java.lang.Object remove(@javax.annotation.CheckForNull java.lang.Object obj) {
        return zzb().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return zzb().size();
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        return zzb().values();
    }

    @Override // com.google.android.gms.internal.ads.zzfxe
    protected /* bridge */ /* synthetic */ java.lang.Object zza() {
        throw null;
    }

    protected abstract java.util.Map zzb();

    protected final int zzc() {
        return com.google.android.gms.internal.ads.zzfzp.zza(entrySet());
    }

    protected final boolean zzd(@javax.annotation.CheckForNull java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzfyf zzfyfVar = new com.google.android.gms.internal.ads.zzfyf(entrySet().iterator());
        if (obj == null) {
            while (zzfyfVar.hasNext()) {
                if (zzfyfVar.next() == null) {
                    return true;
                }
            }
        } else {
            while (zzfyfVar.hasNext()) {
                if (obj.equals(zzfyfVar.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    protected final boolean zze(@javax.annotation.CheckForNull java.lang.Object obj) {
        return com.google.android.gms.internal.ads.zzfyk.zzb(this, obj);
    }
}
