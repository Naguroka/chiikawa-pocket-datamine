package com.google.android.gms.drive.metadata;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zza<T> implements com.google.android.gms.drive.metadata.MetadataField<T> {
    private final java.lang.String fieldName;
    private final java.util.Set<java.lang.String> zziw;
    private final java.util.Set<java.lang.String> zzix;
    private final int zziy;

    protected zza(java.lang.String str, int i) {
        this.fieldName = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "fieldName");
        this.zziw = java.util.Collections.singleton(str);
        this.zzix = java.util.Collections.emptySet();
        this.zziy = i;
    }

    protected abstract void zza(android.os.Bundle bundle, T t);

    protected abstract T zzb(android.os.Bundle bundle);

    protected abstract T zzc(com.google.android.gms.common.data.DataHolder dataHolder, int i, int i2);

    protected zza(java.lang.String str, java.util.Collection<java.lang.String> collection, java.util.Collection<java.lang.String> collection2, int i) {
        this.fieldName = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "fieldName");
        this.zziw = java.util.Collections.unmodifiableSet(new java.util.HashSet(collection));
        this.zzix = java.util.Collections.unmodifiableSet(new java.util.HashSet(collection2));
        this.zziy = i;
    }

    @Override // com.google.android.gms.drive.metadata.MetadataField
    public final java.lang.String getName() {
        return this.fieldName;
    }

    public final java.util.Collection<java.lang.String> zzaz() {
        return this.zziw;
    }

    @Override // com.google.android.gms.drive.metadata.MetadataField
    public final T zza(android.os.Bundle bundle) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(bundle, "bundle");
        if (bundle.get(this.fieldName) != null) {
            return zzb(bundle);
        }
        return null;
    }

    @Override // com.google.android.gms.drive.metadata.MetadataField
    public final void zza(T t, android.os.Bundle bundle) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(bundle, "bundle");
        if (t == null) {
            bundle.putString(this.fieldName, null);
        } else {
            zza(bundle, t);
        }
    }

    @Override // com.google.android.gms.drive.metadata.MetadataField
    public final void zza(com.google.android.gms.common.data.DataHolder dataHolder, com.google.android.gms.drive.metadata.internal.MetadataBundle metadataBundle, int i, int i2) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(dataHolder, "dataHolder");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(metadataBundle, "bundle");
        if (zzb(dataHolder, i, i2)) {
            metadataBundle.zzb(this, zzc(dataHolder, i, i2));
        }
    }

    public java.lang.String toString() {
        return this.fieldName;
    }

    @Override // com.google.android.gms.drive.metadata.MetadataField
    public final T zza(com.google.android.gms.common.data.DataHolder dataHolder, int i, int i2) {
        if (zzb(dataHolder, i, i2)) {
            return zzc(dataHolder, i, i2);
        }
        return null;
    }

    protected boolean zzb(com.google.android.gms.common.data.DataHolder dataHolder, int i, int i2) {
        for (java.lang.String str : this.zziw) {
            if (dataHolder.isClosed() || !dataHolder.hasColumn(str) || dataHolder.hasNull(str, i, i2)) {
                return false;
            }
        }
        return true;
    }
}
