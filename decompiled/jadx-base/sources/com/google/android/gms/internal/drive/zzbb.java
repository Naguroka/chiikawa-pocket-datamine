package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbb extends com.google.android.gms.drive.DriveClient {
    public zzbb(android.content.Context context, com.google.android.gms.drive.Drive.zza zzaVar) {
        super(context, zzaVar);
    }

    public zzbb(android.app.Activity activity, com.google.android.gms.drive.Drive.zza zzaVar) {
        super(activity, zzaVar);
    }

    @Override // com.google.android.gms.drive.DriveClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.drive.DriveId> getDriveId(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "resourceId must not be null");
        return doRead(new com.google.android.gms.internal.drive.zzbc(this, str));
    }

    @Override // com.google.android.gms.drive.DriveClient
    public final com.google.android.gms.tasks.Task<android.content.IntentSender> newOpenFileActivityIntentSender(com.google.android.gms.drive.OpenFileActivityOptions openFileActivityOptions) {
        return doRead(new com.google.android.gms.internal.drive.zzbf(this, openFileActivityOptions));
    }

    @Override // com.google.android.gms.drive.DriveClient
    public final com.google.android.gms.tasks.Task<android.content.IntentSender> newCreateFileActivityIntentSender(com.google.android.gms.drive.CreateFileActivityOptions createFileActivityOptions) {
        return doRead(new com.google.android.gms.internal.drive.zzbg(this, createFileActivityOptions));
    }

    @Override // com.google.android.gms.drive.DriveClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> requestSync() {
        return doWrite(new com.google.android.gms.internal.drive.zzbh(this));
    }

    @Override // com.google.android.gms.drive.DriveClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.drive.TransferPreferences> getUploadPreferences() {
        return doRead(new com.google.android.gms.internal.drive.zzbd(this));
    }

    @Override // com.google.android.gms.drive.DriveClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> setUploadPreferences(com.google.android.gms.drive.TransferPreferences transferPreferences) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(transferPreferences, "transferPreferences cannot be null.");
        return doWrite(new com.google.android.gms.internal.drive.zzbe(this, transferPreferences));
    }
}
