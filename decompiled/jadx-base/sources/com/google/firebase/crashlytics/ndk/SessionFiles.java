package com.google.firebase.crashlytics.ndk;

/* JADX INFO: loaded from: classes5.dex */
final class SessionFiles {
    public final java.io.File app;
    public final java.io.File binaryImages;
    public final java.io.File device;
    public final java.io.File metadata;
    public final com.google.firebase.crashlytics.ndk.SessionFiles.NativeCore nativeCore;
    public final java.io.File os;
    public final java.io.File session;

    static final class NativeCore {
        public final com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo applicationExitInfo;
        public final java.io.File minidump;

        NativeCore(java.io.File file, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
            this.minidump = file;
            this.applicationExitInfo = applicationExitInfo;
        }

        boolean hasCore() {
            java.io.File file = this.minidump;
            return (file != null && file.exists()) || this.applicationExitInfo != null;
        }
    }

    static final class Builder {
        private java.io.File app;
        private java.io.File binaryImages;
        private java.io.File device;
        private java.io.File metadata;
        private com.google.firebase.crashlytics.ndk.SessionFiles.NativeCore nativeCore;
        private java.io.File os;
        private java.io.File session;

        Builder() {
        }

        com.google.firebase.crashlytics.ndk.SessionFiles.Builder nativeCore(com.google.firebase.crashlytics.ndk.SessionFiles.NativeCore nativeCore) {
            this.nativeCore = nativeCore;
            return this;
        }

        com.google.firebase.crashlytics.ndk.SessionFiles.Builder binaryImagesFile(java.io.File file) {
            this.binaryImages = file;
            return this;
        }

        com.google.firebase.crashlytics.ndk.SessionFiles.Builder metadataFile(java.io.File file) {
            this.metadata = file;
            return this;
        }

        com.google.firebase.crashlytics.ndk.SessionFiles.Builder sessionFile(java.io.File file) {
            this.session = file;
            return this;
        }

        com.google.firebase.crashlytics.ndk.SessionFiles.Builder appFile(java.io.File file) {
            this.app = file;
            return this;
        }

        com.google.firebase.crashlytics.ndk.SessionFiles.Builder deviceFile(java.io.File file) {
            this.device = file;
            return this;
        }

        com.google.firebase.crashlytics.ndk.SessionFiles.Builder osFile(java.io.File file) {
            this.os = file;
            return this;
        }

        com.google.firebase.crashlytics.ndk.SessionFiles build() {
            return new com.google.firebase.crashlytics.ndk.SessionFiles(this);
        }
    }

    private SessionFiles(com.google.firebase.crashlytics.ndk.SessionFiles.Builder builder) {
        this.nativeCore = builder.nativeCore;
        this.binaryImages = builder.binaryImages;
        this.metadata = builder.metadata;
        this.session = builder.session;
        this.app = builder.app;
        this.device = builder.device;
        this.os = builder.os;
    }
}
