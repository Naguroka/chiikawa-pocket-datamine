package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: loaded from: classes5.dex */
class CrashlyticsController {
    static final java.lang.String APP_EXCEPTION_MARKER_PREFIX = ".ae";
    static final java.lang.String FIREBASE_APPLICATION_EXCEPTION = "_ae";
    static final java.lang.String FIREBASE_CRASH_TYPE = "fatal";
    static final int FIREBASE_CRASH_TYPE_FATAL = 1;
    static final java.lang.String FIREBASE_TIMESTAMP = "timestamp";
    private static final java.lang.String GENERATOR_FORMAT = "Crashlytics Android SDK/%s";
    private static final java.lang.String META_INF_FOLDER = "META-INF/";
    private static final java.lang.String VERSION_CONTROL_INFO_FILE = "version-control-info.textproto";
    private static final java.lang.String VERSION_CONTROL_INFO_KEY = "com.crashlytics.version-control-info";
    private final com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger analyticsEventLogger;
    private final com.google.firebase.crashlytics.internal.common.AppData appData;
    private final android.content.Context context;
    private com.google.firebase.crashlytics.internal.common.CrashlyticsUncaughtExceptionHandler crashHandler;
    private final com.google.firebase.crashlytics.internal.common.CrashlyticsFileMarker crashMarker;
    private final com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers crashlyticsWorkers;
    private final com.google.firebase.crashlytics.internal.common.DataCollectionArbiter dataCollectionArbiter;
    private final com.google.firebase.crashlytics.internal.persistence.FileStore fileStore;
    private final com.google.firebase.crashlytics.internal.common.IdManager idManager;
    private final com.google.firebase.crashlytics.internal.metadata.LogFileManager logFileManager;
    private final com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent nativeComponent;
    private final com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator reportingCoordinator;
    private final com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber sessionsSubscriber;
    private final com.google.firebase.crashlytics.internal.metadata.UserMetadata userMetadata;
    static final java.io.FilenameFilter APP_EXCEPTION_MARKER_FILTER = new java.io.FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController$$ExternalSyntheticLambda0
        @Override // java.io.FilenameFilter
        public final boolean accept(java.io.File file, java.lang.String str) {
            return str.startsWith(com.google.firebase.crashlytics.internal.common.CrashlyticsController.APP_EXCEPTION_MARKER_PREFIX);
        }
    };
    private static final java.nio.charset.Charset UTF_8 = java.nio.charset.Charset.forName(com.adjust.sdk.Constants.ENCODING);
    private com.google.firebase.crashlytics.internal.settings.SettingsProvider settingsProvider = null;
    final com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean> unsentReportsAvailable = new com.google.android.gms.tasks.TaskCompletionSource<>();
    final com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean> reportActionProvided = new com.google.android.gms.tasks.TaskCompletionSource<>();
    final com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> unsentReportsHandled = new com.google.android.gms.tasks.TaskCompletionSource<>();
    final java.util.concurrent.atomic.AtomicBoolean checkForUnsentReportsCalled = new java.util.concurrent.atomic.AtomicBoolean(false);

    CrashlyticsController(android.content.Context context, com.google.firebase.crashlytics.internal.common.IdManager idManager, com.google.firebase.crashlytics.internal.common.DataCollectionArbiter dataCollectionArbiter, com.google.firebase.crashlytics.internal.persistence.FileStore fileStore, com.google.firebase.crashlytics.internal.common.CrashlyticsFileMarker crashlyticsFileMarker, com.google.firebase.crashlytics.internal.common.AppData appData, com.google.firebase.crashlytics.internal.metadata.UserMetadata userMetadata, com.google.firebase.crashlytics.internal.metadata.LogFileManager logFileManager, com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator sessionReportingCoordinator, com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent crashlyticsNativeComponent, com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger analyticsEventLogger, com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber, com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers crashlyticsWorkers) {
        this.context = context;
        this.idManager = idManager;
        this.dataCollectionArbiter = dataCollectionArbiter;
        this.fileStore = fileStore;
        this.crashMarker = crashlyticsFileMarker;
        this.appData = appData;
        this.userMetadata = userMetadata;
        this.logFileManager = logFileManager;
        this.nativeComponent = crashlyticsNativeComponent;
        this.analyticsEventLogger = analyticsEventLogger;
        this.sessionsSubscriber = crashlyticsAppQualitySessionsSubscriber;
        this.reportingCoordinator = sessionReportingCoordinator;
        this.crashlyticsWorkers = crashlyticsWorkers;
    }

    void enableExceptionHandling(java.lang.String str, java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler, com.google.firebase.crashlytics.internal.settings.SettingsProvider settingsProvider) {
        this.settingsProvider = settingsProvider;
        openSession(str);
        com.google.firebase.crashlytics.internal.common.CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler = new com.google.firebase.crashlytics.internal.common.CrashlyticsUncaughtExceptionHandler(new com.google.firebase.crashlytics.internal.common.CrashlyticsUncaughtExceptionHandler.CrashListener() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.1
            @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsUncaughtExceptionHandler.CrashListener
            public void onUncaughtException(com.google.firebase.crashlytics.internal.settings.SettingsProvider settingsProvider2, java.lang.Thread thread, java.lang.Throwable th) {
                com.google.firebase.crashlytics.internal.common.CrashlyticsController.this.handleUncaughtException(settingsProvider2, thread, th);
            }
        }, settingsProvider, uncaughtExceptionHandler, this.nativeComponent);
        this.crashHandler = crashlyticsUncaughtExceptionHandler;
        java.lang.Thread.setDefaultUncaughtExceptionHandler(crashlyticsUncaughtExceptionHandler);
    }

    void handleUncaughtException(com.google.firebase.crashlytics.internal.settings.SettingsProvider settingsProvider, java.lang.Thread thread, java.lang.Throwable th) {
        handleUncaughtException(settingsProvider, thread, th, false);
    }

    synchronized void handleUncaughtException(final com.google.firebase.crashlytics.internal.settings.SettingsProvider settingsProvider, final java.lang.Thread thread, final java.lang.Throwable th, final boolean z) {
        com.google.firebase.crashlytics.internal.Logger.getLogger().d("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        final long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        com.google.android.gms.tasks.Task taskSubmitTask = this.crashlyticsWorkers.common.submitTask(new java.util.concurrent.Callable<com.google.android.gms.tasks.Task<java.lang.Void>>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public com.google.android.gms.tasks.Task<java.lang.Void> call() throws java.lang.Exception {
                long timestampSeconds = com.google.firebase.crashlytics.internal.common.CrashlyticsController.getTimestampSeconds(jCurrentTimeMillis);
                final java.lang.String currentSessionId = com.google.firebase.crashlytics.internal.common.CrashlyticsController.this.getCurrentSessionId();
                if (currentSessionId != null) {
                    com.google.firebase.crashlytics.internal.common.CrashlyticsController.this.crashMarker.create();
                    com.google.firebase.crashlytics.internal.common.CrashlyticsController.this.reportingCoordinator.persistFatalEvent(th, thread, currentSessionId, timestampSeconds);
                    com.google.firebase.crashlytics.internal.common.CrashlyticsController.this.doWriteAppExceptionMarker(jCurrentTimeMillis);
                    com.google.firebase.crashlytics.internal.common.CrashlyticsController.this.doCloseSessions(settingsProvider);
                    com.google.firebase.crashlytics.internal.common.CrashlyticsController.this.doOpenSession(new com.google.firebase.crashlytics.internal.common.CLSUUID().getSessionId(), java.lang.Boolean.valueOf(z));
                    if (!com.google.firebase.crashlytics.internal.common.CrashlyticsController.this.dataCollectionArbiter.isAutomaticDataCollectionEnabled()) {
                        return com.google.android.gms.tasks.Tasks.forResult(null);
                    }
                    return settingsProvider.getSettingsAsync().onSuccessTask(com.google.firebase.crashlytics.internal.common.CrashlyticsController.this.crashlyticsWorkers.common, new com.google.android.gms.tasks.SuccessContinuation<com.google.firebase.crashlytics.internal.settings.Settings, java.lang.Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.2.1
                        @Override // com.google.android.gms.tasks.SuccessContinuation
                        public com.google.android.gms.tasks.Task<java.lang.Void> then(com.google.firebase.crashlytics.internal.settings.Settings settings) throws java.lang.Exception {
                            if (settings != null) {
                                com.google.android.gms.tasks.Task[] taskArr = new com.google.android.gms.tasks.Task[2];
                                taskArr[0] = com.google.firebase.crashlytics.internal.common.CrashlyticsController.this.logAnalyticsAppExceptionEvents();
                                taskArr[1] = com.google.firebase.crashlytics.internal.common.CrashlyticsController.this.reportingCoordinator.sendReports(com.google.firebase.crashlytics.internal.common.CrashlyticsController.this.crashlyticsWorkers.common, z ? currentSessionId : null);
                                return com.google.android.gms.tasks.Tasks.whenAll((com.google.android.gms.tasks.Task<?>[]) taskArr);
                            }
                            com.google.firebase.crashlytics.internal.Logger.getLogger().w("Received null app settings, cannot send reports at crash time.");
                            return com.google.android.gms.tasks.Tasks.forResult(null);
                        }
                    });
                }
                com.google.firebase.crashlytics.internal.Logger.getLogger().e("Tried to write a fatal exception while no session was open.");
                return com.google.android.gms.tasks.Tasks.forResult(null);
            }
        });
        if (!z) {
            try {
                try {
                    com.google.firebase.crashlytics.internal.common.Utils.awaitEvenIfOnMainThread(taskSubmitTask);
                } catch (java.util.concurrent.TimeoutException unused) {
                    com.google.firebase.crashlytics.internal.Logger.getLogger().e("Cannot send reports. Timed out while fetching settings.");
                }
            } catch (java.lang.Exception e) {
                com.google.firebase.crashlytics.internal.Logger.getLogger().e("Error handling uncaught exception", e);
            }
        }
    }

    private com.google.android.gms.tasks.Task<java.lang.Boolean> waitForReportAction() {
        if (this.dataCollectionArbiter.isAutomaticDataCollectionEnabled()) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().d("Automatic data collection is enabled. Allowing upload.");
            this.unsentReportsAvailable.trySetResult(false);
            return com.google.android.gms.tasks.Tasks.forResult(true);
        }
        com.google.firebase.crashlytics.internal.Logger.getLogger().d("Automatic data collection is disabled.");
        com.google.firebase.crashlytics.internal.Logger.getLogger().v("Notifying that unsent reports are available.");
        this.unsentReportsAvailable.trySetResult(true);
        com.google.android.gms.tasks.Task<TContinuationResult> taskOnSuccessTask = this.dataCollectionArbiter.waitForAutomaticDataCollectionEnabled().onSuccessTask(new com.google.android.gms.tasks.SuccessContinuation<java.lang.Void, java.lang.Boolean>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.3
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public com.google.android.gms.tasks.Task<java.lang.Boolean> then(java.lang.Void r1) throws java.lang.Exception {
                return com.google.android.gms.tasks.Tasks.forResult(true);
            }
        });
        com.google.firebase.crashlytics.internal.Logger.getLogger().d("Waiting for send/deleteUnsentReports to be called.");
        return com.google.firebase.crashlytics.internal.concurrency.CrashlyticsTasks.race(taskOnSuccessTask, this.reportActionProvided.getTask());
    }

    boolean didCrashOnPreviousExecution() {
        com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers.checkBackgroundThread();
        if (!this.crashMarker.isPresent()) {
            java.lang.String currentSessionId = getCurrentSessionId();
            return currentSessionId != null && this.nativeComponent.hasCrashDataForSession(currentSessionId);
        }
        com.google.firebase.crashlytics.internal.Logger.getLogger().v("Found previous crash marker.");
        this.crashMarker.remove();
        return java.lang.Boolean.TRUE.booleanValue();
    }

    com.google.android.gms.tasks.Task<java.lang.Boolean> checkForUnsentReports() {
        if (!this.checkForUnsentReportsCalled.compareAndSet(false, true)) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().w("checkForUnsentReports should only be called once per execution.");
            return com.google.android.gms.tasks.Tasks.forResult(false);
        }
        return this.unsentReportsAvailable.getTask();
    }

    com.google.android.gms.tasks.Task<java.lang.Void> sendUnsentReports() {
        this.reportActionProvided.trySetResult(true);
        return this.unsentReportsHandled.getTask();
    }

    com.google.android.gms.tasks.Task<java.lang.Void> deleteUnsentReports() {
        this.reportActionProvided.trySetResult(false);
        return this.unsentReportsHandled.getTask();
    }

    void submitAllReports(final com.google.android.gms.tasks.Task<com.google.firebase.crashlytics.internal.settings.Settings> task) {
        if (!this.reportingCoordinator.hasReportsToSend()) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().v("No crash reports are available to be sent.");
            this.unsentReportsAvailable.trySetResult(false);
        } else {
            com.google.firebase.crashlytics.internal.Logger.getLogger().v("Crash reports are available to be sent.");
            waitForReportAction().onSuccessTask(this.crashlyticsWorkers.common, new com.google.android.gms.tasks.SuccessContinuation<java.lang.Boolean, java.lang.Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.4
                @Override // com.google.android.gms.tasks.SuccessContinuation
                public com.google.android.gms.tasks.Task<java.lang.Void> then(java.lang.Boolean bool) throws java.lang.Exception {
                    if (!bool.booleanValue()) {
                        com.google.firebase.crashlytics.internal.Logger.getLogger().v("Deleting cached crash reports...");
                        com.google.firebase.crashlytics.internal.common.CrashlyticsController.deleteFiles(com.google.firebase.crashlytics.internal.common.CrashlyticsController.this.listAppExceptionMarkerFiles());
                        com.google.firebase.crashlytics.internal.common.CrashlyticsController.this.reportingCoordinator.removeAllReports();
                        com.google.firebase.crashlytics.internal.common.CrashlyticsController.this.unsentReportsHandled.trySetResult(null);
                        return com.google.android.gms.tasks.Tasks.forResult(null);
                    }
                    com.google.firebase.crashlytics.internal.Logger.getLogger().d("Sending cached crash reports...");
                    com.google.firebase.crashlytics.internal.common.CrashlyticsController.this.dataCollectionArbiter.grantDataCollectionPermission(bool.booleanValue());
                    return task.onSuccessTask(com.google.firebase.crashlytics.internal.common.CrashlyticsController.this.crashlyticsWorkers.common, new com.google.android.gms.tasks.SuccessContinuation<com.google.firebase.crashlytics.internal.settings.Settings, java.lang.Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.4.1
                        @Override // com.google.android.gms.tasks.SuccessContinuation
                        public com.google.android.gms.tasks.Task<java.lang.Void> then(com.google.firebase.crashlytics.internal.settings.Settings settings) throws java.lang.Exception {
                            if (settings != null) {
                                com.google.firebase.crashlytics.internal.common.CrashlyticsController.this.logAnalyticsAppExceptionEvents();
                                com.google.firebase.crashlytics.internal.common.CrashlyticsController.this.reportingCoordinator.sendReports(com.google.firebase.crashlytics.internal.common.CrashlyticsController.this.crashlyticsWorkers.common);
                                com.google.firebase.crashlytics.internal.common.CrashlyticsController.this.unsentReportsHandled.trySetResult(null);
                                return com.google.android.gms.tasks.Tasks.forResult(null);
                            }
                            com.google.firebase.crashlytics.internal.Logger.getLogger().w("Received null app settings at app startup. Cannot send cached reports");
                            return com.google.android.gms.tasks.Tasks.forResult(null);
                        }
                    });
                }
            });
        }
    }

    void writeToLog(long j, java.lang.String str) {
        if (isHandlingException()) {
            return;
        }
        this.logFileManager.writeToLog(j, str);
    }

    void writeNonFatalException(java.lang.Thread thread, java.lang.Throwable th, java.util.Map<java.lang.String, java.lang.String> map) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (isHandlingException()) {
            return;
        }
        long timestampSeconds = getTimestampSeconds(jCurrentTimeMillis);
        java.lang.String currentSessionId = getCurrentSessionId();
        if (currentSessionId == null) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().w("Tried to write a non-fatal exception while no session was open.");
        } else {
            this.reportingCoordinator.persistNonFatalEvent(th, thread, new com.google.firebase.crashlytics.internal.metadata.EventMetadata(currentSessionId, timestampSeconds, map));
        }
    }

    void logFatalException(java.lang.Thread thread, java.lang.Throwable th) {
        com.google.firebase.crashlytics.internal.settings.SettingsProvider settingsProvider = this.settingsProvider;
        if (settingsProvider == null) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().w("settingsProvider not set");
        } else {
            handleUncaughtException(settingsProvider, thread, th, true);
        }
    }

    void setUserId(java.lang.String str) {
        this.userMetadata.setUserId(str);
    }

    void setCustomKey(java.lang.String str, java.lang.String str2) {
        try {
            this.userMetadata.setCustomKey(str, str2);
        } catch (java.lang.IllegalArgumentException e) {
            android.content.Context context = this.context;
            if (context != null && com.google.firebase.crashlytics.internal.common.CommonUtils.isAppDebuggable(context)) {
                throw e;
            }
            com.google.firebase.crashlytics.internal.Logger.getLogger().e("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    void setCustomKeys(java.util.Map<java.lang.String, java.lang.String> map) {
        this.userMetadata.setCustomKeys(map);
    }

    void setInternalKey(java.lang.String str, java.lang.String str2) {
        try {
            this.userMetadata.setInternalKey(str, str2);
        } catch (java.lang.IllegalArgumentException e) {
            android.content.Context context = this.context;
            if (context != null && com.google.firebase.crashlytics.internal.common.CommonUtils.isAppDebuggable(context)) {
                throw e;
            }
            com.google.firebase.crashlytics.internal.Logger.getLogger().e("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    void openSession(final java.lang.String str) {
        this.crashlyticsWorkers.common.submit(new java.lang.Runnable() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m832xe0c67ca9(str);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$openSession$1$com-google-firebase-crashlytics-internal-common-CrashlyticsController, reason: not valid java name */
    /* synthetic */ void m832xe0c67ca9(java.lang.String str) {
        doOpenSession(str, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String getCurrentSessionId() {
        java.util.SortedSet<java.lang.String> sortedSetListSortedOpenSessionIds = this.reportingCoordinator.listSortedOpenSessionIds();
        if (sortedSetListSortedOpenSessionIds.isEmpty()) {
            return null;
        }
        return sortedSetListSortedOpenSessionIds.first();
    }

    boolean finalizeSessions(com.google.firebase.crashlytics.internal.settings.SettingsProvider settingsProvider) {
        com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers.checkBackgroundThread();
        if (isHandlingException()) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().w("Skipping session finalization because a crash has already occurred.");
            return java.lang.Boolean.FALSE.booleanValue();
        }
        com.google.firebase.crashlytics.internal.Logger.getLogger().v("Finalizing previously open sessions.");
        try {
            doCloseSessions(true, settingsProvider, true);
            com.google.firebase.crashlytics.internal.Logger.getLogger().v("Closed all previously open sessions.");
            return true;
        } catch (java.lang.Exception e) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().e("Unable to finalize previously open sessions.", e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doOpenSession(java.lang.String str, java.lang.Boolean bool) {
        long currentTimestampSeconds = getCurrentTimestampSeconds();
        com.google.firebase.crashlytics.internal.Logger.getLogger().d("Opening a new session with ID " + str);
        this.nativeComponent.prepareNativeSession(str, java.lang.String.format(java.util.Locale.US, GENERATOR_FORMAT, com.google.firebase.crashlytics.internal.common.CrashlyticsCore.getVersion()), currentTimestampSeconds, com.google.firebase.crashlytics.internal.model.StaticSessionData.create(createAppData(this.idManager, this.appData), createOsData(), createDeviceData(this.context)));
        if (bool.booleanValue() && str != null) {
            this.userMetadata.setNewSession(str);
        }
        this.logFileManager.setCurrentSession(str);
        this.sessionsSubscriber.setSessionId(str);
        this.reportingCoordinator.onBeginSession(str, currentTimestampSeconds);
    }

    void doCloseSessions(com.google.firebase.crashlytics.internal.settings.SettingsProvider settingsProvider) {
        doCloseSessions(false, settingsProvider, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void doCloseSessions(boolean z, com.google.firebase.crashlytics.internal.settings.SettingsProvider settingsProvider, boolean z2) {
        java.lang.String str;
        com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers.checkBackgroundThread();
        java.util.ArrayList arrayList = new java.util.ArrayList(this.reportingCoordinator.listSortedOpenSessionIds());
        if (arrayList.size() <= z) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().v("No open sessions to be closed.");
            return;
        }
        java.lang.String str2 = (java.lang.String) arrayList.get(z ? 1 : 0);
        if (z2 && settingsProvider.getSettingsSync().featureFlagData.collectAnrs) {
            writeApplicationExitInfoEventIfRelevant(str2);
        } else {
            com.google.firebase.crashlytics.internal.Logger.getLogger().v("ANR feature disabled.");
        }
        if (z2 && this.nativeComponent.hasCrashDataForSession(str2)) {
            finalizePreviousNativeSession(str2);
        }
        if (z != 0) {
            str = (java.lang.String) arrayList.get(0);
        } else {
            this.sessionsSubscriber.setSessionId(null);
            str = null;
        }
        this.reportingCoordinator.finalizeSessions(getCurrentTimestampSeconds(), str);
    }

    java.util.List<java.io.File> listAppExceptionMarkerFiles() {
        return this.fileStore.getCommonFiles(APP_EXCEPTION_MARKER_FILTER);
    }

    void saveVersionControlInfo() {
        try {
            java.lang.String versionControlInfo = getVersionControlInfo();
            if (versionControlInfo != null) {
                setInternalKey(VERSION_CONTROL_INFO_KEY, versionControlInfo);
                com.google.firebase.crashlytics.internal.Logger.getLogger().i("Saved version control info");
            }
        } catch (java.io.IOException e) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().w("Unable to save version control info", e);
        }
    }

    java.lang.String getVersionControlInfo() throws java.io.IOException {
        java.lang.String versionControlInfo = com.google.firebase.crashlytics.internal.common.CommonUtils.getVersionControlInfo(this.context);
        if (versionControlInfo != null) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().d("Read version control info from string resource");
            return android.util.Base64.encodeToString(versionControlInfo.getBytes(UTF_8), 0);
        }
        java.io.InputStream resourceAsStream = getResourceAsStream("META-INF/version-control-info.textproto");
        if (resourceAsStream != null) {
            try {
                com.google.firebase.crashlytics.internal.Logger.getLogger().d("Read version control info from file");
                java.lang.String strEncodeToString = android.util.Base64.encodeToString(readResource(resourceAsStream), 0);
                if (resourceAsStream != null) {
                    resourceAsStream.close();
                }
                return strEncodeToString;
            } catch (java.lang.Throwable th) {
                if (resourceAsStream != null) {
                    try {
                        resourceAsStream.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        if (resourceAsStream != null) {
            resourceAsStream.close();
        }
        com.google.firebase.crashlytics.internal.Logger.getLogger().i("No version control information found");
        return null;
    }

    private java.io.InputStream getResourceAsStream(java.lang.String str) {
        java.lang.ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().w("Couldn't get Class Loader");
            return null;
        }
        return classLoader.getResourceAsStream(str);
    }

    private static byte[] readResource(java.io.InputStream inputStream) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStream.read(bArr);
            if (i != -1) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    private void finalizePreviousNativeSession(java.lang.String str) {
        com.google.firebase.crashlytics.internal.Logger.getLogger().v("Finalizing native report for session " + str);
        com.google.firebase.crashlytics.internal.NativeSessionFileProvider sessionFileProvider = this.nativeComponent.getSessionFileProvider(str);
        java.io.File minidumpFile = sessionFileProvider.getMinidumpFile();
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo applicationExitInto = sessionFileProvider.getApplicationExitInto();
        if (nativeCoreAbsent(str, minidumpFile, applicationExitInto)) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().w("No native core present");
            return;
        }
        long jLastModified = minidumpFile.lastModified();
        com.google.firebase.crashlytics.internal.metadata.LogFileManager logFileManager = new com.google.firebase.crashlytics.internal.metadata.LogFileManager(this.fileStore, str);
        java.io.File nativeSessionDir = this.fileStore.getNativeSessionDir(str);
        if (!nativeSessionDir.isDirectory()) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().w("Couldn't create directory to store native session files, aborting.");
            return;
        }
        doWriteAppExceptionMarker(jLastModified);
        java.util.List<com.google.firebase.crashlytics.internal.common.NativeSessionFile> nativeSessionFiles = getNativeSessionFiles(sessionFileProvider, str, this.fileStore, logFileManager.getBytesForLog());
        com.google.firebase.crashlytics.internal.common.NativeSessionFileGzipper.processNativeSessions(nativeSessionDir, nativeSessionFiles);
        com.google.firebase.crashlytics.internal.Logger.getLogger().d("CrashlyticsController#finalizePreviousNativeSession");
        this.reportingCoordinator.finalizeSessionWithNativeEvent(str, nativeSessionFiles, applicationExitInto);
        logFileManager.clearLog();
    }

    private static boolean nativeCoreAbsent(java.lang.String str, java.io.File file, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        if (file == null || !file.exists()) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().w("No minidump data found for session " + str);
        }
        if (applicationExitInfo == null) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().i("No Tombstones data found for session " + str);
        }
        return (file == null || !file.exists()) && applicationExitInfo == null;
    }

    private static long getCurrentTimestampSeconds() {
        return getTimestampSeconds(java.lang.System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getTimestampSeconds(long j) {
        return j / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doWriteAppExceptionMarker(long j) {
        try {
            if (this.fileStore.getCommonFile(APP_EXCEPTION_MARKER_PREFIX + j).createNewFile()) {
            } else {
                throw new java.io.IOException("Create new file failed.");
            }
        } catch (java.io.IOException e) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().w("Could not create app exception marker file.", e);
        }
    }

    private static com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData createAppData(com.google.firebase.crashlytics.internal.common.IdManager idManager, com.google.firebase.crashlytics.internal.common.AppData appData) {
        return com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData.create(idManager.getAppIdentifier(), appData.versionCode, appData.versionName, idManager.getInstallIds().getCrashlyticsInstallId(), com.google.firebase.crashlytics.internal.common.DeliveryMechanism.determineFrom(appData.installerPackageName).getId(), appData.developmentPlatformProvider);
    }

    private static com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData createOsData() {
        return com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData.create(android.os.Build.VERSION.RELEASE, android.os.Build.VERSION.CODENAME, com.google.firebase.crashlytics.internal.common.CommonUtils.isRooted());
    }

    private static com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData createDeviceData(android.content.Context context) {
        android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getDataDirectory().getPath());
        return com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData.create(com.google.firebase.crashlytics.internal.common.CommonUtils.getCpuArchitectureInt(), android.os.Build.MODEL, java.lang.Runtime.getRuntime().availableProcessors(), com.google.firebase.crashlytics.internal.common.CommonUtils.calculateTotalRamInBytes(context), ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()), com.google.firebase.crashlytics.internal.common.CommonUtils.isEmulator(), com.google.firebase.crashlytics.internal.common.CommonUtils.getDeviceState(), android.os.Build.MANUFACTURER, android.os.Build.PRODUCT);
    }

    com.google.firebase.crashlytics.internal.metadata.UserMetadata getUserMetadata() {
        return this.userMetadata;
    }

    boolean isHandlingException() {
        com.google.firebase.crashlytics.internal.common.CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler = this.crashHandler;
        return crashlyticsUncaughtExceptionHandler != null && crashlyticsUncaughtExceptionHandler.isHandlingException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.android.gms.tasks.Task<java.lang.Void> logAnalyticsAppExceptionEvents() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.io.File file : listAppExceptionMarkerFiles()) {
            try {
                arrayList.add(logAnalyticsAppExceptionEvent(java.lang.Long.parseLong(file.getName().substring(3))));
            } catch (java.lang.NumberFormatException unused) {
                com.google.firebase.crashlytics.internal.Logger.getLogger().w("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return com.google.android.gms.tasks.Tasks.whenAll(arrayList);
    }

    private com.google.android.gms.tasks.Task<java.lang.Void> logAnalyticsAppExceptionEvent(final long j) {
        if (firebaseCrashExists()) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().w("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return com.google.android.gms.tasks.Tasks.forResult(null);
        }
        com.google.firebase.crashlytics.internal.Logger.getLogger().d("Logging app exception event to Firebase Analytics");
        return com.google.android.gms.tasks.Tasks.call(new java.util.concurrent.ScheduledThreadPoolExecutor(1), new java.util.concurrent.Callable<java.lang.Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.5
            @Override // java.util.concurrent.Callable
            public java.lang.Void call() throws java.lang.Exception {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt(com.google.firebase.crashlytics.internal.common.CrashlyticsController.FIREBASE_CRASH_TYPE, 1);
                bundle.putLong("timestamp", j);
                com.google.firebase.crashlytics.internal.common.CrashlyticsController.this.analyticsEventLogger.logEvent(com.google.firebase.crashlytics.internal.common.CrashlyticsController.FIREBASE_APPLICATION_EXCEPTION, bundle);
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void deleteFiles(java.util.List<java.io.File> list) {
        java.util.Iterator<java.io.File> it = list.iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    private static boolean firebaseCrashExists() {
        try {
            java.lang.Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (java.lang.ClassNotFoundException unused) {
            return false;
        }
    }

    static java.util.List<com.google.firebase.crashlytics.internal.common.NativeSessionFile> getNativeSessionFiles(com.google.firebase.crashlytics.internal.NativeSessionFileProvider nativeSessionFileProvider, java.lang.String str, com.google.firebase.crashlytics.internal.persistence.FileStore fileStore, byte[] bArr) {
        java.io.File sessionFile = fileStore.getSessionFile(str, com.google.firebase.crashlytics.internal.metadata.UserMetadata.USERDATA_FILENAME);
        java.io.File sessionFile2 = fileStore.getSessionFile(str, com.google.firebase.crashlytics.internal.metadata.UserMetadata.KEYDATA_FILENAME);
        java.io.File sessionFile3 = fileStore.getSessionFile(str, com.google.firebase.crashlytics.internal.metadata.UserMetadata.ROLLOUTS_STATE_FILENAME);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new com.google.firebase.crashlytics.internal.common.BytesBackedNativeSessionFile("logs_file", "logs", bArr));
        arrayList.add(new com.google.firebase.crashlytics.internal.common.FileBackedNativeSessionFile("crash_meta_file", androidx.media3.extractor.text.ttml.TtmlNode.TAG_METADATA, nativeSessionFileProvider.getMetadataFile()));
        arrayList.add(new com.google.firebase.crashlytics.internal.common.FileBackedNativeSessionFile("session_meta_file", "session", nativeSessionFileProvider.getSessionFile()));
        arrayList.add(new com.google.firebase.crashlytics.internal.common.FileBackedNativeSessionFile("app_meta_file", "app", nativeSessionFileProvider.getAppFile()));
        arrayList.add(new com.google.firebase.crashlytics.internal.common.FileBackedNativeSessionFile("device_meta_file", com.ironsource.y8.h.G, nativeSessionFileProvider.getDeviceFile()));
        arrayList.add(new com.google.firebase.crashlytics.internal.common.FileBackedNativeSessionFile("os_meta_file", com.json.ce.y, nativeSessionFileProvider.getOsFile()));
        arrayList.add(nativeCoreFile(nativeSessionFileProvider));
        arrayList.add(new com.google.firebase.crashlytics.internal.common.FileBackedNativeSessionFile("user_meta_file", "user", sessionFile));
        arrayList.add(new com.google.firebase.crashlytics.internal.common.FileBackedNativeSessionFile("keys_file", com.google.firebase.crashlytics.internal.metadata.UserMetadata.KEYDATA_FILENAME, sessionFile2));
        arrayList.add(new com.google.firebase.crashlytics.internal.common.FileBackedNativeSessionFile("rollouts_file", "rollouts", sessionFile3));
        return arrayList;
    }

    private static com.google.firebase.crashlytics.internal.common.NativeSessionFile nativeCoreFile(com.google.firebase.crashlytics.internal.NativeSessionFileProvider nativeSessionFileProvider) {
        java.io.File minidumpFile = nativeSessionFileProvider.getMinidumpFile();
        if (minidumpFile == null || !minidumpFile.exists()) {
            return new com.google.firebase.crashlytics.internal.common.BytesBackedNativeSessionFile("minidump_file", "minidump", new byte[]{0});
        }
        return new com.google.firebase.crashlytics.internal.common.FileBackedNativeSessionFile("minidump_file", "minidump", minidumpFile);
    }

    private void writeApplicationExitInfoEventIfRelevant(java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            java.util.List<android.app.ApplicationExitInfo> historicalProcessExitReasons = ((android.app.ActivityManager) this.context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
            if (historicalProcessExitReasons.size() != 0) {
                this.reportingCoordinator.persistRelevantAppExitInfoEvent(str, historicalProcessExitReasons, new com.google.firebase.crashlytics.internal.metadata.LogFileManager(this.fileStore, str), com.google.firebase.crashlytics.internal.metadata.UserMetadata.loadFromExistingSession(str, this.fileStore, this.crashlyticsWorkers));
                return;
            }
            com.google.firebase.crashlytics.internal.Logger.getLogger().v("No ApplicationExitInfo available. Session: " + str);
            return;
        }
        com.google.firebase.crashlytics.internal.Logger.getLogger().v("ANR feature enabled, but device is API " + android.os.Build.VERSION.SDK_INT);
    }
}
