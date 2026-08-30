package com.google.android.gms.drive;

/* JADX INFO: loaded from: classes4.dex */
public final class CreateFileActivityOptions extends com.google.android.gms.internal.drive.zzq {
    public static final java.lang.String EXTRA_RESPONSE_DRIVE_ID = "response_drive_id";

    private CreateFileActivityOptions(com.google.android.gms.drive.metadata.internal.MetadataBundle metadataBundle, java.lang.Integer num, java.lang.String str, com.google.android.gms.drive.DriveId driveId, int i) {
        super(metadataBundle, num, str, driveId, i);
    }

    public static class Builder {
        protected final com.google.android.gms.drive.CreateFileActivityBuilder builder = new com.google.android.gms.drive.CreateFileActivityBuilder();

        public com.google.android.gms.drive.CreateFileActivityOptions.Builder setInitialMetadata(com.google.android.gms.drive.MetadataChangeSet metadataChangeSet) {
            this.builder.setInitialMetadata(metadataChangeSet);
            return this;
        }

        public com.google.android.gms.drive.CreateFileActivityOptions.Builder setActivityStartFolder(com.google.android.gms.drive.DriveId driveId) {
            this.builder.setActivityStartFolder(driveId);
            return this;
        }

        public com.google.android.gms.drive.CreateFileActivityOptions.Builder setActivityTitle(java.lang.String str) {
            this.builder.setActivityTitle(str);
            return this;
        }

        public com.google.android.gms.drive.CreateFileActivityOptions.Builder setInitialDriveContents(com.google.android.gms.drive.DriveContents driveContents) {
            this.builder.setInitialDriveContents(driveContents);
            return this;
        }

        public com.google.android.gms.drive.CreateFileActivityOptions build() {
            this.builder.zzg();
            return new com.google.android.gms.drive.CreateFileActivityOptions(this.builder.zzc().zzq(), java.lang.Integer.valueOf(this.builder.getRequestId()), this.builder.zze(), this.builder.zzd(), this.builder.zzf());
        }
    }
}
