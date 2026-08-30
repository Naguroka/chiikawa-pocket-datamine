package com.google.android.gms.drive;

/* JADX INFO: loaded from: classes4.dex */
@java.lang.Deprecated
public class CreateFileActivityBuilder {
    public static final java.lang.String EXTRA_RESPONSE_DRIVE_ID = "response_drive_id";
    private final com.google.android.gms.internal.drive.zzt zzn = new com.google.android.gms.internal.drive.zzt(0);
    private com.google.android.gms.drive.DriveContents zzo;
    private boolean zzp;

    final int zzf() {
        return 0;
    }

    public com.google.android.gms.drive.CreateFileActivityBuilder setInitialDriveContents(com.google.android.gms.drive.DriveContents driveContents) {
        if (driveContents != null) {
            if (!(driveContents instanceof com.google.android.gms.internal.drive.zzbi)) {
                throw new java.lang.IllegalArgumentException("Only DriveContents obtained from the Drive API are accepted.");
            }
            if (driveContents.getDriveId() != null) {
                throw new java.lang.IllegalArgumentException("Only DriveContents obtained through DriveApi.newDriveContents are accepted for file creation.");
            }
            if (driveContents.zzk()) {
                throw new java.lang.IllegalArgumentException("DriveContents are already closed.");
            }
            this.zzn.zzd(driveContents.zzi().zzj);
            this.zzo = driveContents;
        } else {
            this.zzn.zzd(1);
        }
        this.zzp = true;
        return this;
    }

    final int getRequestId() {
        return this.zzn.getRequestId();
    }

    public com.google.android.gms.drive.CreateFileActivityBuilder setInitialMetadata(com.google.android.gms.drive.MetadataChangeSet metadataChangeSet) {
        this.zzn.zza(metadataChangeSet);
        return this;
    }

    final com.google.android.gms.drive.MetadataChangeSet zzc() {
        return this.zzn.zzc();
    }

    public com.google.android.gms.drive.CreateFileActivityBuilder setActivityStartFolder(com.google.android.gms.drive.DriveId driveId) {
        this.zzn.zza(driveId);
        return this;
    }

    final com.google.android.gms.drive.DriveId zzd() {
        return this.zzn.zzd();
    }

    public com.google.android.gms.drive.CreateFileActivityBuilder setActivityTitle(java.lang.String str) {
        this.zzn.zzc(str);
        return this;
    }

    final java.lang.String zze() {
        return this.zzn.zze();
    }

    final void zzg() {
        com.google.android.gms.common.internal.Preconditions.checkState(this.zzp, "Must call setInitialDriveContents.");
        com.google.android.gms.drive.DriveContents driveContents = this.zzo;
        if (driveContents != null) {
            driveContents.zzj();
        }
        this.zzn.zzg();
    }

    public android.content.IntentSender build(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        com.google.android.gms.common.internal.Preconditions.checkState(googleApiClient.isConnected(), "Client must be connected");
        zzg();
        return this.zzn.build(googleApiClient);
    }
}
