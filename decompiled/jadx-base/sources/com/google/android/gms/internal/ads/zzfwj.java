package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
abstract class zzfwj implements com.google.android.gms.internal.ads.zzfyl {

    @javax.annotation.CheckForNull
    private transient java.util.Set zza;

    @javax.annotation.CheckForNull
    private transient java.util.Collection zzb;

    @javax.annotation.CheckForNull
    private transient java.util.Map zzc;

    zzfwj() {
    }

    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.ads.zzfyl) {
            return zzs().equals(((com.google.android.gms.internal.ads.zzfyl) obj).zzs());
        }
        return false;
    }

    public final int hashCode() {
        return zzs().hashCode();
    }

    public final java.lang.String toString() {
        return zzs().toString();
    }

    abstract java.util.Collection zzf();

    java.util.Iterator zzg() {
        throw null;
    }

    abstract java.util.Map zzj();

    abstract java.util.Set zzl();

    @Override // com.google.android.gms.internal.ads.zzfyl
    public boolean zzq(java.lang.Object obj, java.lang.Object obj2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfyl
    public final java.util.Collection zzr() {
        java.util.Collection collection = this.zzb;
        if (collection != null) {
            return collection;
        }
        java.util.Collection collectionZzf = zzf();
        this.zzb = collectionZzf;
        return collectionZzf;
    }

    @Override // com.google.android.gms.internal.ads.zzfyl
    public final java.util.Map zzs() {
        java.util.Map map = this.zzc;
        if (map != null) {
            return map;
        }
        java.util.Map mapZzj = zzj();
        this.zzc = mapZzj;
        return mapZzj;
    }

    public final java.util.Set zzt() {
        java.util.Set set = this.zza;
        if (set != null) {
            return set;
        }
        java.util.Set setZzl = zzl();
        this.zza = setZzl;
        return setZzl;
    }
}
