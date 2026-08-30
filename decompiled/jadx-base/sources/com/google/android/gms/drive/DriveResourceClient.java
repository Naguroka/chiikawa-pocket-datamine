package com.google.android.gms.drive;

/* JADX INFO: loaded from: classes4.dex */
@java.lang.Deprecated
public abstract class DriveResourceClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.drive.Drive.zza> {
    public DriveResourceClient(android.content.Context context, com.google.android.gms.drive.Drive.zza zzaVar) {
        super(context, com.google.android.gms.drive.Drive.zzw, zzaVar, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<com.google.android.gms.drive.events.ListenerToken> addChangeListener(com.google.android.gms.drive.DriveResource driveResource, com.google.android.gms.drive.events.OnChangeListener onChangeListener);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<java.lang.Void> addChangeSubscription(com.google.android.gms.drive.DriveResource driveResource);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<java.lang.Boolean> cancelOpenFileCallback(com.google.android.gms.drive.events.ListenerToken listenerToken);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<java.lang.Void> commitContents(com.google.android.gms.drive.DriveContents driveContents, com.google.android.gms.drive.MetadataChangeSet metadataChangeSet);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<java.lang.Void> commitContents(com.google.android.gms.drive.DriveContents driveContents, com.google.android.gms.drive.MetadataChangeSet metadataChangeSet, com.google.android.gms.drive.ExecutionOptions executionOptions);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<com.google.android.gms.drive.DriveContents> createContents();

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<com.google.android.gms.drive.DriveFile> createFile(com.google.android.gms.drive.DriveFolder driveFolder, com.google.android.gms.drive.MetadataChangeSet metadataChangeSet, com.google.android.gms.drive.DriveContents driveContents);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<com.google.android.gms.drive.DriveFile> createFile(com.google.android.gms.drive.DriveFolder driveFolder, com.google.android.gms.drive.MetadataChangeSet metadataChangeSet, com.google.android.gms.drive.DriveContents driveContents, com.google.android.gms.drive.ExecutionOptions executionOptions);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<com.google.android.gms.drive.DriveFolder> createFolder(com.google.android.gms.drive.DriveFolder driveFolder, com.google.android.gms.drive.MetadataChangeSet metadataChangeSet);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<java.lang.Void> delete(com.google.android.gms.drive.DriveResource driveResource);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<java.lang.Void> discardContents(com.google.android.gms.drive.DriveContents driveContents);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<com.google.android.gms.drive.DriveFolder> getAppFolder();

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<com.google.android.gms.drive.Metadata> getMetadata(com.google.android.gms.drive.DriveResource driveResource);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<com.google.android.gms.drive.DriveFolder> getRootFolder();

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<com.google.android.gms.drive.MetadataBuffer> listChildren(com.google.android.gms.drive.DriveFolder driveFolder);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<com.google.android.gms.drive.MetadataBuffer> listParents(com.google.android.gms.drive.DriveResource driveResource);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<com.google.android.gms.drive.DriveContents> openFile(com.google.android.gms.drive.DriveFile driveFile, int i);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<com.google.android.gms.drive.events.ListenerToken> openFile(com.google.android.gms.drive.DriveFile driveFile, int i, com.google.android.gms.drive.events.OpenFileCallback openFileCallback);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<com.google.android.gms.drive.MetadataBuffer> query(com.google.android.gms.drive.query.Query query);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<com.google.android.gms.drive.MetadataBuffer> queryChildren(com.google.android.gms.drive.DriveFolder driveFolder, com.google.android.gms.drive.query.Query query);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<java.lang.Boolean> removeChangeListener(com.google.android.gms.drive.events.ListenerToken listenerToken);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<java.lang.Void> removeChangeSubscription(com.google.android.gms.drive.DriveResource driveResource);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<com.google.android.gms.drive.DriveContents> reopenContentsForWrite(com.google.android.gms.drive.DriveContents driveContents);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<java.lang.Void> setParents(com.google.android.gms.drive.DriveResource driveResource, java.util.Set<com.google.android.gms.drive.DriveId> set);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<java.lang.Void> trash(com.google.android.gms.drive.DriveResource driveResource);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<java.lang.Void> untrash(com.google.android.gms.drive.DriveResource driveResource);

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<com.google.android.gms.drive.Metadata> updateMetadata(com.google.android.gms.drive.DriveResource driveResource, com.google.android.gms.drive.MetadataChangeSet metadataChangeSet);

    public DriveResourceClient(android.app.Activity activity, com.google.android.gms.drive.Drive.zza zzaVar) {
        super(activity, com.google.android.gms.drive.Drive.zzw, zzaVar, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
