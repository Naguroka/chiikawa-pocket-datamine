package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaq implements com.google.android.gms.drive.DriveApi.MetadataBufferResult {
    private final com.google.android.gms.common.api.Status zzdy;
    private final com.google.android.gms.drive.MetadataBuffer zzdz;
    private final boolean zzea;

    public zzaq(com.google.android.gms.common.api.Status status, com.google.android.gms.drive.MetadataBuffer metadataBuffer, boolean z) {
        this.zzdy = status;
        this.zzdz = metadataBuffer;
        this.zzea = z;
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.zzdy;
    }

    @Override // com.google.android.gms.drive.DriveApi.MetadataBufferResult
    public final com.google.android.gms.drive.MetadataBuffer getMetadataBuffer() {
        return this.zzdz;
    }

    @Override // com.google.android.gms.common.api.Releasable
    public final void release() {
        com.google.android.gms.drive.MetadataBuffer metadataBuffer = this.zzdz;
        if (metadataBuffer != null) {
            metadataBuffer.release();
        }
    }
}
