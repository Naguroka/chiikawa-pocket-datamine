package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzdz implements com.google.android.gms.drive.DriveResource.MetadataResult {
    private final com.google.android.gms.common.api.Status zzdy;
    private final com.google.android.gms.drive.Metadata zzgr;

    public zzdz(com.google.android.gms.common.api.Status status, com.google.android.gms.drive.Metadata metadata) {
        this.zzdy = status;
        this.zzgr = metadata;
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.zzdy;
    }

    @Override // com.google.android.gms.drive.DriveResource.MetadataResult
    public final com.google.android.gms.drive.Metadata getMetadata() {
        return this.zzgr;
    }
}
