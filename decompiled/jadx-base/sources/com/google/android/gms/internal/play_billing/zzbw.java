package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbw implements java.util.Map, java.io.Serializable {
    private transient com.google.android.gms.internal.play_billing.zzbx zza;
    private transient com.google.android.gms.internal.play_billing.zzbx zzb;
    private transient com.google.android.gms.internal.play_billing.zzbq zzc;

    zzbw() {
    }

    public static com.google.android.gms.internal.play_billing.zzbw zzc(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
        com.google.android.gms.internal.play_billing.zzbo.zza("com.android.vending.billing.PURCHASES_UPDATED", obj2);
        com.google.android.gms.internal.play_billing.zzbo.zza("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", obj4);
        com.google.android.gms.internal.play_billing.zzbo.zza("com.android.vending.billing.ALTERNATIVE_BILLING", obj6);
        return com.google.android.gms.internal.play_billing.zzcf.zzg(3, new java.lang.Object[]{"com.android.vending.billing.PURCHASES_UPDATED", obj2, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", obj4, "com.android.vending.billing.ALTERNATIVE_BILLING", obj6}, null);
    }

    @Override // java.util.Map
    @java.lang.Deprecated
    public final void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof java.util.Map) {
            return entrySet().equals(((java.util.Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract java.lang.Object get(java.lang.Object obj);

    @Override // java.util.Map
    public final java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return com.google.android.gms.internal.play_billing.zzcg.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ java.util.Set keySet() {
        com.google.android.gms.internal.play_billing.zzbx zzbxVar = this.zzb;
        if (zzbxVar != null) {
            return zzbxVar;
        }
        com.google.android.gms.internal.play_billing.zzbx zzbxVarZze = zze();
        this.zzb = zzbxVarZze;
        return zzbxVarZze;
    }

    @Override // java.util.Map
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
    @java.lang.Deprecated
    public final java.lang.Object remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    public final java.lang.String toString() {
        int size = size();
        if (size < 0) {
            throw new java.lang.IllegalArgumentException("size cannot be negative but was: " + size);
        }
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

    abstract com.google.android.gms.internal.play_billing.zzbq zza();

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.play_billing.zzbq values() {
        com.google.android.gms.internal.play_billing.zzbq zzbqVar = this.zzc;
        if (zzbqVar != null) {
            return zzbqVar;
        }
        com.google.android.gms.internal.play_billing.zzbq zzbqVarZza = zza();
        this.zzc = zzbqVarZza;
        return zzbqVarZza;
    }

    abstract com.google.android.gms.internal.play_billing.zzbx zzd();

    abstract com.google.android.gms.internal.play_billing.zzbx zze();

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.play_billing.zzbx entrySet() {
        com.google.android.gms.internal.play_billing.zzbx zzbxVar = this.zza;
        if (zzbxVar != null) {
            return zzbxVar;
        }
        com.google.android.gms.internal.play_billing.zzbx zzbxVarZzd = zzd();
        this.zza = zzbxVarZzd;
        return zzbxVarZzd;
    }
}
