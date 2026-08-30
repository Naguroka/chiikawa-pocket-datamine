package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfvr extends com.google.android.gms.internal.ads.zzfyg {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfvt zza;

    zzfvr(com.google.android.gms.internal.ads.zzfvt zzfvtVar) {
        this.zza = zzfvtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfyg, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
        return com.google.android.gms.internal.ads.zzfwm.zza(this.zza.zza.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        return new com.google.android.gms.internal.ads.zzfvs(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfyg, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (!contains(obj)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) java.util.Objects.requireNonNull((java.util.Map.Entry) obj);
        com.google.android.gms.internal.ads.zzfvt zzfvtVar = this.zza;
        com.google.android.gms.internal.ads.zzfwg.zzo(zzfvtVar.zzb, entry.getKey());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfyg
    final java.util.Map zza() {
        return this.zza;
    }
}
