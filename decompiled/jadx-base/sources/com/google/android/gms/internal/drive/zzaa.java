package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaa extends com.google.android.gms.drive.Metadata {
    private final com.google.android.gms.drive.metadata.internal.MetadataBundle zzdt;

    public zzaa(com.google.android.gms.drive.metadata.internal.MetadataBundle metadataBundle) {
        this.zzdt = metadataBundle;
    }

    @Override // com.google.android.gms.drive.Metadata
    public final <T> T zza(com.google.android.gms.drive.metadata.MetadataField<T> metadataField) {
        return (T) this.zzdt.zza(metadataField);
    }

    public final java.lang.String toString() {
        java.lang.String strValueOf = java.lang.String.valueOf(this.zzdt);
        return new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 17).append("Metadata [mImpl=").append(strValueOf).append(com.ironsource.y8.i.e).toString();
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return this.zzdt != null;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* synthetic */ com.google.android.gms.drive.Metadata freeze() {
        return new com.google.android.gms.internal.drive.zzaa(this.zzdt.zzbf());
    }
}
