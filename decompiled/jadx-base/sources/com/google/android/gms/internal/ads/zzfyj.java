package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
abstract class zzfyj extends java.util.AbstractMap {

    @javax.annotation.CheckForNull
    private transient java.util.Set zza;

    @javax.annotation.CheckForNull
    private transient java.util.Set zzb;

    @javax.annotation.CheckForNull
    private transient java.util.Collection zzc;

    zzfyj() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        java.util.Set set = this.zza;
        if (set != null) {
            return set;
        }
        java.util.Set setZzb = zzb();
        this.zza = setZzb;
        return setZzb;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set keySet() {
        java.util.Set set = this.zzb;
        if (set != null) {
            return set;
        }
        java.util.Set setZze = zze();
        this.zzb = setZze;
        return setZze;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Collection values() {
        java.util.Collection collection = this.zzc;
        if (collection != null) {
            return collection;
        }
        com.google.android.gms.internal.ads.zzfyi zzfyiVar = new com.google.android.gms.internal.ads.zzfyi(this);
        this.zzc = zzfyiVar;
        return zzfyiVar;
    }

    abstract java.util.Set zzb();

    java.util.Set zze() {
        return new com.google.android.gms.internal.ads.zzfyh(this);
    }
}
