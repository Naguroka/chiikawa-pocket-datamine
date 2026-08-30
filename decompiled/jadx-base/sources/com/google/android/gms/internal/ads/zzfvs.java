package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfvs implements java.util.Iterator {
    final java.util.Iterator zza;

    @javax.annotation.CheckForNull
    java.util.Collection zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfvt zzc;

    zzfvs(com.google.android.gms.internal.ads.zzfvt zzfvtVar) {
        this.zzc = zzfvtVar;
        this.zza = zzfvtVar.zza.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        java.util.Map.Entry entry = (java.util.Map.Entry) this.zza.next();
        this.zzb = (java.util.Collection) entry.getValue();
        return this.zzc.zza(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        com.google.android.gms.internal.ads.zzfun.zzm(this.zzb != null, "no calls to next() since the last call to remove()");
        this.zza.remove();
        this.zzc.zzb.zzb -= this.zzb.size();
        this.zzb.clear();
        this.zzb = null;
    }
}
