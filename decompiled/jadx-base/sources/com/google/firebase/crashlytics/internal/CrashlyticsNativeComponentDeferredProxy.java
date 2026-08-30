package com.google.firebase.crashlytics.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class CrashlyticsNativeComponentDeferredProxy implements com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent {
    private static final com.google.firebase.crashlytics.internal.NativeSessionFileProvider MISSING_NATIVE_SESSION_FILE_PROVIDER = new com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy.MissingNativeSessionFileProvider();
    private final java.util.concurrent.atomic.AtomicReference<com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent> availableNativeComponent = new java.util.concurrent.atomic.AtomicReference<>(null);
    private final com.google.firebase.inject.Deferred<com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent> deferredNativeComponent;

    public CrashlyticsNativeComponentDeferredProxy(com.google.firebase.inject.Deferred<com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent> deferred) {
        this.deferredNativeComponent = deferred;
        deferred.whenAvailable(new com.google.firebase.inject.Deferred.DeferredHandler() { // from class: com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy$$ExternalSyntheticLambda0
            @Override // com.google.firebase.inject.Deferred.DeferredHandler
            public final void handle(com.google.firebase.inject.Provider provider) {
                this.f$0.m831x5c12a4b9(provider);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$new$0$com-google-firebase-crashlytics-internal-CrashlyticsNativeComponentDeferredProxy, reason: not valid java name */
    /* synthetic */ void m831x5c12a4b9(com.google.firebase.inject.Provider provider) {
        com.google.firebase.crashlytics.internal.Logger.getLogger().d("Crashlytics native component now available.");
        this.availableNativeComponent.set((com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent) provider.get());
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public boolean hasCrashDataForCurrentSession() {
        com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent crashlyticsNativeComponent = this.availableNativeComponent.get();
        return crashlyticsNativeComponent != null && crashlyticsNativeComponent.hasCrashDataForCurrentSession();
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public boolean hasCrashDataForSession(java.lang.String str) {
        com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent crashlyticsNativeComponent = this.availableNativeComponent.get();
        return crashlyticsNativeComponent != null && crashlyticsNativeComponent.hasCrashDataForSession(str);
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public void prepareNativeSession(final java.lang.String str, final java.lang.String str2, final long j, final com.google.firebase.crashlytics.internal.model.StaticSessionData staticSessionData) {
        com.google.firebase.crashlytics.internal.Logger.getLogger().v("Deferring native open session: " + str);
        this.deferredNativeComponent.whenAvailable(new com.google.firebase.inject.Deferred.DeferredHandler() { // from class: com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy$$ExternalSyntheticLambda1
            @Override // com.google.firebase.inject.Deferred.DeferredHandler
            public final void handle(com.google.firebase.inject.Provider provider) {
                ((com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent) provider.get()).prepareNativeSession(str, str2, j, staticSessionData);
            }
        });
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public com.google.firebase.crashlytics.internal.NativeSessionFileProvider getSessionFileProvider(java.lang.String str) {
        com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent crashlyticsNativeComponent = this.availableNativeComponent.get();
        if (crashlyticsNativeComponent == null) {
            return MISSING_NATIVE_SESSION_FILE_PROVIDER;
        }
        return crashlyticsNativeComponent.getSessionFileProvider(str);
    }

    private static final class MissingNativeSessionFileProvider implements com.google.firebase.crashlytics.internal.NativeSessionFileProvider {
        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public java.io.File getAppFile() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo getApplicationExitInto() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public java.io.File getBinaryImagesFile() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public java.io.File getDeviceFile() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public java.io.File getMetadataFile() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public java.io.File getMinidumpFile() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public java.io.File getOsFile() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public java.io.File getSessionFile() {
            return null;
        }

        private MissingNativeSessionFileProvider() {
        }
    }
}
