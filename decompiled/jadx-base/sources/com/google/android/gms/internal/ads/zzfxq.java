package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzfxq implements java.util.Map, java.io.Serializable {

    @javax.annotation.CheckForNull
    private transient com.google.android.gms.internal.ads.zzfxs zza;

    @javax.annotation.CheckForNull
    private transient com.google.android.gms.internal.ads.zzfxs zzb;

    @javax.annotation.CheckForNull
    private transient com.google.android.gms.internal.ads.zzfxi zzc;

    zzfxq() {
    }

    public static com.google.android.gms.internal.ads.zzfxq zzc(java.util.Map map) {
        java.util.Set setEntrySet = map.entrySet();
        com.google.android.gms.internal.ads.zzfxp zzfxpVar = new com.google.android.gms.internal.ads.zzfxp(setEntrySet instanceof java.util.Collection ? setEntrySet.size() : 4);
        zzfxpVar.zzb(setEntrySet);
        return zzfxpVar.zzc();
    }

    public static com.google.android.gms.internal.ads.zzfxq zzd() {
        return com.google.android.gms.internal.ads.zzfze.zza;
    }

    public static com.google.android.gms.internal.ads.zzfxq zze(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.ads.zzfwk.zzb("dialog_not_shown_reason", obj2);
        return com.google.android.gms.internal.ads.zzfze.zzj(1, new java.lang.Object[]{"dialog_not_shown_reason", obj2}, null);
    }

    @Override // java.util.Map
    @java.lang.Deprecated
    public final void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(@javax.annotation.CheckForNull java.lang.Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(@javax.annotation.CheckForNull java.lang.Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        return com.google.android.gms.internal.ads.zzfyk.zzb(this, obj);
    }

    @Override // java.util.Map
    @javax.annotation.CheckForNull
    public abstract java.lang.Object get(@javax.annotation.CheckForNull java.lang.Object obj);

    @Override // java.util.Map
    @javax.annotation.CheckForNull
    public final java.lang.Object getOrDefault(@javax.annotation.CheckForNull java.lang.Object obj, @javax.annotation.CheckForNull java.lang.Object obj2) {
        java.lang.Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return com.google.android.gms.internal.ads.zzfzp.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    @javax.annotation.CheckForNull
    @java.lang.Deprecated
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    @java.lang.Deprecated
    public final void putAll(java.util.Map map) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    @javax.annotation.CheckForNull
    @java.lang.Deprecated
    public final java.lang.Object remove(@javax.annotation.CheckForNull java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    public final java.lang.String toString() {
        int size = size();
        com.google.android.gms.internal.ads.zzfwk.zza(size, "size");
        java.lang.StringBuilder sb = new java.lang.StringBuilder((int) java.lang.Math.min(((long) size) * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (java.util.Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    abstract com.google.android.gms.internal.ads.zzfxi zza();

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.zzfxi values() {
        com.google.android.gms.internal.ads.zzfxi zzfxiVar = this.zzc;
        if (zzfxiVar != null) {
            return zzfxiVar;
        }
        com.google.android.gms.internal.ads.zzfxi zzfxiVarZza = zza();
        this.zzc = zzfxiVarZza;
        return zzfxiVarZza;
    }

    abstract com.google.android.gms.internal.ads.zzfxs zzf();

    abstract com.google.android.gms.internal.ads.zzfxs zzg();

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.zzfxs entrySet() {
        com.google.android.gms.internal.ads.zzfxs zzfxsVar = this.zza;
        if (zzfxsVar != null) {
            return zzfxsVar;
        }
        com.google.android.gms.internal.ads.zzfxs zzfxsVarZzf = zzf();
        this.zza = zzfxsVarZzf;
        return zzfxsVarZzf;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.zzfxs keySet() {
        com.google.android.gms.internal.ads.zzfxs zzfxsVar = this.zzb;
        if (zzfxsVar != null) {
            return zzfxsVar;
        }
        com.google.android.gms.internal.ads.zzfxs zzfxsVarZzg = zzg();
        this.zzb = zzfxsVarZzg;
        return zzfxsVarZzg;
    }
}
