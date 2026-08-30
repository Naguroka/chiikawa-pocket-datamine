package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
class zzfvu implements java.util.Iterator {
    final java.util.Iterator zza;

    @javax.annotation.CheckForNull
    java.util.Collection zzb = null;
    java.util.Iterator zzc = com.google.android.gms.internal.ads.zzfxv.INSTANCE;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfwg zzd;

    zzfvu(com.google.android.gms.internal.ads.zzfwg zzfwgVar) {
        this.zzd = zzfwgVar;
        this.zza = zzfwgVar.zza.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext() || this.zzc.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!this.zzc.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) this.zza.next();
            entry.getKey();
            java.util.Collection collection = (java.util.Collection) entry.getValue();
            this.zzb = collection;
            this.zzc = collection.iterator();
        }
        return this.zzc.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zzc.remove();
        if (((java.util.Collection) java.util.Objects.requireNonNull(this.zzb)).isEmpty()) {
            this.zza.remove();
        }
        this.zzd.zzb--;
    }
}
