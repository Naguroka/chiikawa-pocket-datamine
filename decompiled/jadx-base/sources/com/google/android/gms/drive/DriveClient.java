package com.google.android.gms.drive;

/* JADX INFO: loaded from: classes4.dex */
@java.lang.Deprecated
public abstract class DriveClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.drive.Drive.zza> {
    public DriveClient(android.content.Context context, com.google.android.gms.drive.Drive.zza zzaVar) {
        super(context, com.google.android.gms.drive.Drive.zzw, zzaVar, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<com.google.android.gms.drive.DriveId> getDriveId(java.lang.String str);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<com.google.android.gms.drive.TransferPreferences> getUploadPreferences();

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<android.content.IntentSender> newCreateFileActivityIntentSender(com.google.android.gms.drive.CreateFileActivityOptions createFileActivityOptions);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<android.content.IntentSender> newOpenFileActivityIntentSender(com.google.android.gms.drive.OpenFileActivityOptions openFileActivityOptions);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<java.lang.Void> requestSync();

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<java.lang.Void> setUploadPreferences(com.google.android.gms.drive.TransferPreferences transferPreferences);

    public DriveClient(android.app.Activity activity, com.google.android.gms.drive.Drive.zza zzaVar) {
        super(activity, com.google.android.gms.drive.Drive.zzw, zzaVar, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
