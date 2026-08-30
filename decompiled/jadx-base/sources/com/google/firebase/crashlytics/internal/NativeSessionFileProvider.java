package com.google.firebase.crashlytics.internal;

/* JADX INFO: loaded from: classes5.dex */
public interface NativeSessionFileProvider {
    java.io.File getAppFile();

    com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo getApplicationExitInto();

    java.io.File getBinaryImagesFile();

    java.io.File getDeviceFile();

    java.io.File getMetadataFile();

    java.io.File getMinidumpFile();

    java.io.File getOsFile();

    java.io.File getSessionFile();
}
