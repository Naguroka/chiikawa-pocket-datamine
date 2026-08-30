package com.google.android.gms.drive;

/* JADX INFO: loaded from: classes4.dex */
public final class OpenFileActivityOptions {
    public static final java.lang.String EXTRA_RESPONSE_DRIVE_ID = "response_drive_id";
    public final java.lang.String zzba;
    public final java.lang.String[] zzbb;
    public final com.google.android.gms.drive.DriveId zzbd;
    public final com.google.android.gms.drive.query.internal.FilterHolder zzbe;

    private OpenFileActivityOptions(java.lang.String str, java.lang.String[] strArr, com.google.android.gms.drive.query.Filter filter, com.google.android.gms.drive.DriveId driveId) {
        this.zzba = str;
        this.zzbb = strArr;
        this.zzbe = filter == null ? null : new com.google.android.gms.drive.query.internal.FilterHolder(filter);
        this.zzbd = driveId;
    }

    public static class Builder {
        private final com.google.android.gms.drive.OpenFileActivityBuilder zzbf = new com.google.android.gms.drive.OpenFileActivityBuilder();

        public com.google.android.gms.drive.OpenFileActivityOptions.Builder setActivityTitle(java.lang.String str) {
            this.zzbf.setActivityTitle(str);
            return this;
        }

        public com.google.android.gms.drive.OpenFileActivityOptions.Builder setMimeType(java.util.List<java.lang.String> list) {
            this.zzbf.setMimeType((java.lang.String[]) list.toArray(new java.lang.String[0]));
            return this;
        }

        public com.google.android.gms.drive.OpenFileActivityOptions.Builder setSelectionFilter(com.google.android.gms.drive.query.Filter filter) {
            this.zzbf.setSelectionFilter(filter);
            return this;
        }

        public com.google.android.gms.drive.OpenFileActivityOptions.Builder setActivityStartFolder(com.google.android.gms.drive.DriveId driveId) {
            this.zzbf.setActivityStartFolder(driveId);
            return this;
        }

        public com.google.android.gms.drive.OpenFileActivityOptions build() {
            this.zzbf.zzg();
            return new com.google.android.gms.drive.OpenFileActivityOptions(this.zzbf.getTitle(), this.zzbf.zzs(), this.zzbf.zzt(), this.zzbf.zzu());
        }
    }
}
