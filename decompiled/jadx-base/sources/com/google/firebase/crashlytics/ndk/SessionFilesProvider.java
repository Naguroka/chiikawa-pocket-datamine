package com.google.firebase.crashlytics.ndk;

/* JADX INFO: loaded from: classes5.dex */
class SessionFilesProvider implements com.google.firebase.crashlytics.internal.NativeSessionFileProvider {
    private final com.google.firebase.crashlytics.ndk.SessionFiles sessionFiles;

    SessionFilesProvider(com.google.firebase.crashlytics.ndk.SessionFiles sessionFiles) {
        this.sessionFiles = sessionFiles;
    }

    @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
    public java.io.File getMinidumpFile() {
        return this.sessionFiles.nativeCore.minidump;
    }

    @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo getApplicationExitInto() {
        if (this.sessionFiles.nativeCore != null) {
            return this.sessionFiles.nativeCore.applicationExitInfo;
        }
        return null;
    }

    @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
    public java.io.File getBinaryImagesFile() {
        return this.sessionFiles.binaryImages;
    }

    @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
    public java.io.File getMetadataFile() {
        return this.sessionFiles.metadata;
    }

    @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
    public java.io.File getSessionFile() {
        return this.sessionFiles.session;
    }

    @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
    public java.io.File getAppFile() {
        return this.sessionFiles.app;
    }

    @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
    public java.io.File getDeviceFile() {
        return this.sessionFiles.device;
    }

    @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
    public java.io.File getOsFile() {
        return this.sessionFiles.os;
    }
}
