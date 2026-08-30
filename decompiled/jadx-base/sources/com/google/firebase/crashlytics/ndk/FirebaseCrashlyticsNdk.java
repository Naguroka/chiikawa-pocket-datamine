package com.google.firebase.crashlytics.ndk;

/* JADX INFO: loaded from: classes5.dex */
class FirebaseCrashlyticsNdk implements com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent {
    private static com.google.firebase.crashlytics.ndk.FirebaseCrashlyticsNdk instance;
    private final com.google.firebase.crashlytics.ndk.CrashpadController controller;
    private java.lang.String currentSessionId;
    private boolean installHandlerDuringPrepareSession;
    private com.google.firebase.crashlytics.ndk.FirebaseCrashlyticsNdk.SignalHandlerInstaller signalHandlerInstaller;

    /* JADX INFO: Access modifiers changed from: private */
    interface SignalHandlerInstaller {
        void installHandler();
    }

    static com.google.firebase.crashlytics.ndk.FirebaseCrashlyticsNdk create(android.content.Context context, boolean z) {
        com.google.firebase.crashlytics.ndk.FirebaseCrashlyticsNdk firebaseCrashlyticsNdk = new com.google.firebase.crashlytics.ndk.FirebaseCrashlyticsNdk(new com.google.firebase.crashlytics.ndk.CrashpadController(context, new com.google.firebase.crashlytics.ndk.JniNativeApi(context), new com.google.firebase.crashlytics.internal.persistence.FileStore(context)), z);
        instance = firebaseCrashlyticsNdk;
        return firebaseCrashlyticsNdk;
    }

    FirebaseCrashlyticsNdk(com.google.firebase.crashlytics.ndk.CrashpadController crashpadController, boolean z) {
        this.controller = crashpadController;
        this.installHandlerDuringPrepareSession = z;
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public boolean hasCrashDataForCurrentSession() {
        java.lang.String str = this.currentSessionId;
        return str != null && hasCrashDataForSession(str);
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public boolean hasCrashDataForSession(java.lang.String str) {
        return this.controller.hasCrashDataForSession(str);
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public synchronized void prepareNativeSession(final java.lang.String str, final java.lang.String str2, final long j, final com.google.firebase.crashlytics.internal.model.StaticSessionData staticSessionData) {
        this.currentSessionId = str;
        com.google.firebase.crashlytics.ndk.FirebaseCrashlyticsNdk.SignalHandlerInstaller signalHandlerInstaller = new com.google.firebase.crashlytics.ndk.FirebaseCrashlyticsNdk.SignalHandlerInstaller() { // from class: com.google.firebase.crashlytics.ndk.FirebaseCrashlyticsNdk$$ExternalSyntheticLambda0
            @Override // com.google.firebase.crashlytics.ndk.FirebaseCrashlyticsNdk.SignalHandlerInstaller
            public final void installHandler() {
                this.f$0.m857x251e82b0(str, str2, j, staticSessionData);
            }
        };
        this.signalHandlerInstaller = signalHandlerInstaller;
        if (this.installHandlerDuringPrepareSession) {
            signalHandlerInstaller.installHandler();
        }
    }

    /* JADX INFO: renamed from: lambda$prepareNativeSession$0$com-google-firebase-crashlytics-ndk-FirebaseCrashlyticsNdk, reason: not valid java name */
    /* synthetic */ void m857x251e82b0(java.lang.String str, java.lang.String str2, long j, com.google.firebase.crashlytics.internal.model.StaticSessionData staticSessionData) {
        com.google.firebase.crashlytics.internal.Logger.getLogger().d("Initializing native session: " + str);
        if (this.controller.initialize(str, str2, j, staticSessionData)) {
            return;
        }
        com.google.firebase.crashlytics.internal.Logger.getLogger().w("Failed to initialize Crashlytics NDK for session " + str);
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public com.google.firebase.crashlytics.internal.NativeSessionFileProvider getSessionFileProvider(java.lang.String str) {
        return new com.google.firebase.crashlytics.ndk.SessionFilesProvider(this.controller.getFilesForSession(str));
    }

    public synchronized void installSignalHandler() {
        com.google.firebase.crashlytics.ndk.FirebaseCrashlyticsNdk.SignalHandlerInstaller signalHandlerInstaller = this.signalHandlerInstaller;
        if (signalHandlerInstaller != null) {
            signalHandlerInstaller.installHandler();
            return;
        }
        if (this.installHandlerDuringPrepareSession) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().w("Native signal handler already installed; skipping re-install.");
        } else {
            com.google.firebase.crashlytics.internal.Logger.getLogger().d("Deferring signal handler installation until the FirebaseCrashlyticsNdk session has been prepared");
            this.installHandlerDuringPrepareSession = true;
        }
    }

    public static com.google.firebase.crashlytics.ndk.FirebaseCrashlyticsNdk getInstance() {
        com.google.firebase.crashlytics.ndk.FirebaseCrashlyticsNdk firebaseCrashlyticsNdk = instance;
        if (firebaseCrashlyticsNdk != null) {
            return firebaseCrashlyticsNdk;
        }
        throw new java.lang.NullPointerException("FirebaseCrashlyticsNdk component is not present.");
    }
}
