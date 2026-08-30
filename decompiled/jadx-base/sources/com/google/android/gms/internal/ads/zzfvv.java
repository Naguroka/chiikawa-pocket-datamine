package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfvv implements java.util.Iterator {

    @javax.annotation.CheckForNull
    java.util.Map.Entry zza;
    final /* synthetic */ java.util.Iterator zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfvw zzc;

    zzfvv(com.google.android.gms.internal.ads.zzfvw zzfvwVar, java.util.Iterator it) {
        this.zzb = it;
        this.zzc = zzfvwVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        java.util.Map.Entry entry = (java.util.Map.Entry) this.zzb.next();
        this.zza = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        com.google.android.gms.internal.ads.zzfun.zzm(this.zza != null, "no calls to next() since the last call to remove()");
        java.util.Collection collection = (java.util.Collection) this.zza.getValue();
        this.zzb.remove();
        this.zzc.zza.zzb -= collection.size();
        collection.clear();
        this.zza = null;
    }
}
