package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: loaded from: classes5.dex */
class CrashlyticsFileMarker {
    private final com.google.firebase.crashlytics.internal.persistence.FileStore fileStore;
    private final java.lang.String markerName;

    public CrashlyticsFileMarker(java.lang.String str, com.google.firebase.crashlytics.internal.persistence.FileStore fileStore) {
        this.markerName = str;
        this.fileStore = fileStore;
    }

    public boolean create() {
        try {
            return getMarkerFile().createNewFile();
        } catch (java.io.IOException e) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().e("Error creating marker: " + this.markerName, e);
            return false;
        }
    }

    public boolean isPresent() {
        return getMarkerFile().exists();
    }

    public boolean remove() {
        return getMarkerFile().delete();
    }

    private java.io.File getMarkerFile() {
        return this.fileStore.getCommonFile(this.markerName);
    }
}
