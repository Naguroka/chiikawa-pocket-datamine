package com.google.android.gms.drive;

/* JADX INFO: loaded from: classes4.dex */
@java.lang.Deprecated
public class OpenFileActivityBuilder {
    public static final java.lang.String EXTRA_RESPONSE_DRIVE_ID = "response_drive_id";
    private java.lang.String zzba;
    private java.lang.String[] zzbb;
    private com.google.android.gms.drive.query.Filter zzbc;
    private com.google.android.gms.drive.DriveId zzbd;

    public com.google.android.gms.drive.OpenFileActivityBuilder setActivityTitle(java.lang.String str) {
        this.zzba = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        return this;
    }

    final java.lang.String getTitle() {
        return this.zzba;
    }

    public com.google.android.gms.drive.OpenFileActivityBuilder setMimeType(java.lang.String[] strArr) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(strArr != null, "mimeTypes may not be null");
        this.zzbb = strArr;
        return this;
    }

    final java.lang.String[] zzs() {
        return this.zzbb;
    }

    public com.google.android.gms.drive.OpenFileActivityBuilder setSelectionFilter(com.google.android.gms.drive.query.Filter filter) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(filter != null, "filter may not be null");
        com.google.android.gms.common.internal.Preconditions.checkArgument(true ^ com.google.android.gms.drive.query.internal.zzk.zza(filter), "FullTextSearchFilter cannot be used as a selection filter");
        this.zzbc = filter;
        return this;
    }

    final com.google.android.gms.drive.query.Filter zzt() {
        return this.zzbc;
    }

    public com.google.android.gms.drive.OpenFileActivityBuilder setActivityStartFolder(com.google.android.gms.drive.DriveId driveId) {
        this.zzbd = (com.google.android.gms.drive.DriveId) com.google.android.gms.common.internal.Preconditions.checkNotNull(driveId);
        return this;
    }

    final com.google.android.gms.drive.DriveId zzu() {
        return this.zzbd;
    }

    final void zzg() {
        if (this.zzbb == null) {
            this.zzbb = new java.lang.String[0];
        }
        if (this.zzbb.length > 0 && this.zzbc != null) {
            throw new java.lang.IllegalStateException("Cannot use a selection filter and set mimetypes simultaneously");
        }
    }

    public android.content.IntentSender build(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        com.google.android.gms.common.internal.Preconditions.checkState(googleApiClient.isConnected(), "Client must be connected");
        zzg();
        try {
            return ((com.google.android.gms.internal.drive.zzeo) ((com.google.android.gms.internal.drive.zzaw) googleApiClient.getClient(com.google.android.gms.drive.Drive.CLIENT_KEY)).getService()).zza(new com.google.android.gms.internal.drive.zzgm(this.zzba, this.zzbb, this.zzbd, this.zzbc == null ? null : new com.google.android.gms.drive.query.internal.FilterHolder(this.zzbc)));
        } catch (android.os.RemoteException e) {
            throw new java.lang.RuntimeException("Unable to connect Drive Play Service", e);
        }
    }
}
