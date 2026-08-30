package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
abstract class zzfwh implements java.util.Map.Entry {
    zzfwh() {
    }

    @Override // java.util.Map.Entry
    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj instanceof java.util.Map.Entry) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            if (com.google.android.gms.internal.ads.zzfuk.zza(getKey(), entry.getKey()) && com.google.android.gms.internal.ads.zzfuk.zza(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public abstract java.lang.Object getKey();

    @Override // java.util.Map.Entry
    public abstract java.lang.Object getValue();

    @Override // java.util.Map.Entry
    public final int hashCode() {
        java.lang.Object key = getKey();
        java.lang.Object value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public java.lang.Object setValue(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    public final java.lang.String toString() {
        return java.lang.String.valueOf(getKey()) + com.ironsource.y8.i.b + java.lang.String.valueOf(getValue());
    }
}
