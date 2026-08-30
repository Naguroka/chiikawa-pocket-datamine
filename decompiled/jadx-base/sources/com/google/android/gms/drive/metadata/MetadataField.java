package com.google.android.gms.drive.metadata;

/* JADX INFO: loaded from: classes4.dex */
public interface MetadataField<T> {
    java.lang.String getName();

    T zza(android.os.Bundle bundle);

    T zza(com.google.android.gms.common.data.DataHolder dataHolder, int i, int i2);

    void zza(com.google.android.gms.common.data.DataHolder dataHolder, com.google.android.gms.drive.metadata.internal.MetadataBundle metadataBundle, int i, int i2);

    void zza(T t, android.os.Bundle bundle);
}
