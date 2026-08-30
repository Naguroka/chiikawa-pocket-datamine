package com.google.android.gms.drive.query.internal;

/* JADX INFO: loaded from: classes4.dex */
final class zzi {
    static com.google.android.gms.drive.metadata.MetadataField<?> zza(com.google.android.gms.drive.metadata.internal.MetadataBundle metadataBundle) {
        java.util.Set<com.google.android.gms.drive.metadata.MetadataField<?>> setZzbg = metadataBundle.zzbg();
        if (setZzbg.size() == 1) {
            return setZzbg.iterator().next();
        }
        throw new java.lang.IllegalArgumentException("bundle should have exactly 1 populated field");
    }
}
