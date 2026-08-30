package com.google.android.gms.drive;

/* JADX INFO: loaded from: classes4.dex */
public final class MetadataBuffer extends com.google.android.gms.common.data.AbstractDataBuffer<com.google.android.gms.drive.Metadata> {
    private com.google.android.gms.drive.MetadataBuffer.zza zzau;

    public MetadataBuffer(com.google.android.gms.common.data.DataHolder dataHolder) {
        super(dataHolder);
        dataHolder.getMetadata().setClassLoader(com.google.android.gms.drive.MetadataBuffer.class.getClassLoader());
    }

    @java.lang.Deprecated
    public final java.lang.String getNextPageToken() {
        return null;
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    public final com.google.android.gms.drive.Metadata get(int i) {
        com.google.android.gms.drive.MetadataBuffer.zza zzaVar = this.zzau;
        if (zzaVar != null && zzaVar.row == i) {
            return zzaVar;
        }
        com.google.android.gms.drive.MetadataBuffer.zza zzaVar2 = new com.google.android.gms.drive.MetadataBuffer.zza(this.mDataHolder, i);
        this.zzau = zzaVar2;
        return zzaVar2;
    }

    static class zza extends com.google.android.gms.drive.Metadata {
        private final int row;
        private final com.google.android.gms.common.data.DataHolder zzav;
        private final int zzaw;

        public zza(com.google.android.gms.common.data.DataHolder dataHolder, int i) {
            this.zzav = dataHolder;
            this.row = i;
            this.zzaw = dataHolder.getWindowIndex(i);
        }

        @Override // com.google.android.gms.drive.Metadata
        public final <T> T zza(com.google.android.gms.drive.metadata.MetadataField<T> metadataField) {
            return metadataField.zza(this.zzav, this.row, this.zzaw);
        }

        @Override // com.google.android.gms.common.data.Freezable
        public final boolean isDataValid() {
            return !this.zzav.isClosed();
        }

        @Override // com.google.android.gms.common.data.Freezable
        public final /* synthetic */ com.google.android.gms.drive.Metadata freeze() {
            com.google.android.gms.drive.metadata.internal.MetadataBundle metadataBundleZzbe = com.google.android.gms.drive.metadata.internal.MetadataBundle.zzbe();
            for (com.google.android.gms.drive.metadata.MetadataField<?> metadataField : com.google.android.gms.drive.metadata.internal.zzf.zzbc()) {
                if (metadataField != com.google.android.gms.internal.drive.zzhs.zzkq) {
                    metadataField.zza(this.zzav, metadataBundleZzbe, this.row, this.zzaw);
                }
            }
            return new com.google.android.gms.internal.drive.zzaa(metadataBundleZzbe);
        }
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer, com.google.android.gms.common.api.Releasable
    public final void release() {
        if (this.mDataHolder != null) {
            com.google.android.gms.drive.metadata.internal.zzf.zza(this.mDataHolder);
        }
        super.release();
    }
}
