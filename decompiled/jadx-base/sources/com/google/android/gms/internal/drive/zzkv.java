package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzkv<K> implements java.util.Map.Entry<K, java.lang.Object> {
    private java.util.Map.Entry<K, com.google.android.gms.internal.drive.zzkt> zztf;

    private zzkv(java.util.Map.Entry<K, com.google.android.gms.internal.drive.zzkt> entry) {
        this.zztf = entry;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.zztf.getKey();
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        if (this.zztf.getValue() == null) {
            return null;
        }
        return com.google.android.gms.internal.drive.zzkt.zzdp();
    }

    public final com.google.android.gms.internal.drive.zzkt zzdq() {
        return this.zztf.getValue();
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.drive.zzlq)) {
            throw new java.lang.IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        return this.zztf.getValue().zzi((com.google.android.gms.internal.drive.zzlq) obj);
    }
}
