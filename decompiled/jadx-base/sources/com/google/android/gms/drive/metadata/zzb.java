package com.google.android.gms.drive.metadata;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzb<T> extends com.google.android.gms.drive.metadata.zza<java.util.Collection<T>> {
    protected zzb(java.lang.String str, java.util.Collection<java.lang.String> collection, java.util.Collection<java.lang.String> collection2, int i) {
        super(str, collection, collection2, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.drive.metadata.zza
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public java.util.Collection<T> zzc(com.google.android.gms.common.data.DataHolder dataHolder, int i, int i2) {
        throw new java.lang.UnsupportedOperationException("Cannot read collections from a dataHolder.");
    }
}
