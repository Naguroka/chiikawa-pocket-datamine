package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfwq extends java.util.AbstractSet {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfww zza;

    zzfwq(com.google.android.gms.internal.ads.zzfww zzfwwVar) {
        this.zza = zzfwwVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
        java.util.Map mapZzl = this.zza.zzl();
        if (mapZzl != null) {
            return mapZzl.entrySet().contains(obj);
        }
        if (obj instanceof java.util.Map.Entry) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            int iZzw = this.zza.zzw(entry.getKey());
            if (iZzw != -1 && com.google.android.gms.internal.ads.zzfuk.zza(com.google.android.gms.internal.ads.zzfww.zzj(this.zza, iZzw), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        com.google.android.gms.internal.ads.zzfww zzfwwVar = this.zza;
        java.util.Map mapZzl = zzfwwVar.zzl();
        return mapZzl != null ? mapZzl.entrySet().iterator() : new com.google.android.gms.internal.ads.zzfwo(zzfwwVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@javax.annotation.CheckForNull java.lang.Object obj) {
        java.util.Map mapZzl = this.zza.zzl();
        if (mapZzl != null) {
            return mapZzl.entrySet().remove(obj);
        }
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        com.google.android.gms.internal.ads.zzfww zzfwwVar = this.zza;
        if (zzfwwVar.zzr()) {
            return false;
        }
        int iZzv = zzfwwVar.zzv();
        java.lang.Object key = entry.getKey();
        java.lang.Object value = entry.getValue();
        com.google.android.gms.internal.ads.zzfww zzfwwVar2 = this.zza;
        int iZzb = com.google.android.gms.internal.ads.zzfwx.zzb(key, value, iZzv, java.util.Objects.requireNonNull(zzfwwVar2.zze), zzfwwVar2.zzA(), zzfwwVar2.zzB(), zzfwwVar2.zzC());
        if (iZzb == -1) {
            return false;
        }
        this.zza.zzq(iZzb, iZzv);
        this.zza.zzg--;
        this.zza.zzo();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
