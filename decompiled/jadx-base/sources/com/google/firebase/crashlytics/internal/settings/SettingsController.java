package com.google.firebase.crashlytics.internal.settings;

/* JADX INFO: loaded from: classes5.dex */
public class SettingsController implements com.google.firebase.crashlytics.internal.settings.SettingsProvider {
    private static final java.lang.String PREFS_BUILD_INSTANCE_IDENTIFIER = "existing_instance_identifier";
    private static final java.lang.String SETTINGS_URL_FORMAT = "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings";
    private final com.google.firebase.crashlytics.internal.settings.CachedSettingsIo cachedSettingsIo;
    private final android.content.Context context;
    private final com.google.firebase.crashlytics.internal.common.CurrentTimeProvider currentTimeProvider;
    private final com.google.firebase.crashlytics.internal.common.DataCollectionArbiter dataCollectionArbiter;
    private final java.util.concurrent.atomic.AtomicReference<com.google.firebase.crashlytics.internal.settings.Settings> settings;
    private final com.google.firebase.crashlytics.internal.settings.SettingsJsonParser settingsJsonParser;
    private final com.google.firebase.crashlytics.internal.settings.SettingsRequest settingsRequest;
    private final com.google.firebase.crashlytics.internal.settings.SettingsSpiCall settingsSpiCall;
    private final java.util.concurrent.atomic.AtomicReference<com.google.android.gms.tasks.TaskCompletionSource<com.google.firebase.crashlytics.internal.settings.Settings>> settingsTask;

    SettingsController(android.content.Context context, com.google.firebase.crashlytics.internal.settings.SettingsRequest settingsRequest, com.google.firebase.crashlytics.internal.common.CurrentTimeProvider currentTimeProvider, com.google.firebase.crashlytics.internal.settings.SettingsJsonParser settingsJsonParser, com.google.firebase.crashlytics.internal.settings.CachedSettingsIo cachedSettingsIo, com.google.firebase.crashlytics.internal.settings.SettingsSpiCall settingsSpiCall, com.google.firebase.crashlytics.internal.common.DataCollectionArbiter dataCollectionArbiter) {
        java.util.concurrent.atomic.AtomicReference<com.google.firebase.crashlytics.internal.settings.Settings> atomicReference = new java.util.concurrent.atomic.AtomicReference<>();
        this.settings = atomicReference;
        this.settingsTask = new java.util.concurrent.atomic.AtomicReference<>(new com.google.android.gms.tasks.TaskCompletionSource());
        this.context = context;
        this.settingsRequest = settingsRequest;
        this.currentTimeProvider = currentTimeProvider;
        this.settingsJsonParser = settingsJsonParser;
        this.cachedSettingsIo = cachedSettingsIo;
        this.settingsSpiCall = settingsSpiCall;
        this.dataCollectionArbiter = dataCollectionArbiter;
        atomicReference.set(com.google.firebase.crashlytics.internal.settings.DefaultSettingsJsonTransform.defaultSettings(currentTimeProvider));
    }

    public static com.google.firebase.crashlytics.internal.settings.SettingsController create(android.content.Context context, java.lang.String str, com.google.firebase.crashlytics.internal.common.IdManager idManager, com.google.firebase.crashlytics.internal.network.HttpRequestFactory httpRequestFactory, java.lang.String str2, java.lang.String str3, com.google.firebase.crashlytics.internal.persistence.FileStore fileStore, com.google.firebase.crashlytics.internal.common.DataCollectionArbiter dataCollectionArbiter) {
        java.lang.String installerPackageName = idManager.getInstallerPackageName();
        com.google.firebase.crashlytics.internal.common.SystemCurrentTimeProvider systemCurrentTimeProvider = new com.google.firebase.crashlytics.internal.common.SystemCurrentTimeProvider();
        return new com.google.firebase.crashlytics.internal.settings.SettingsController(context, new com.google.firebase.crashlytics.internal.settings.SettingsRequest(str, idManager.getModelName(), idManager.getOsBuildVersionString(), idManager.getOsDisplayVersionString(), idManager, com.google.firebase.crashlytics.internal.common.CommonUtils.createInstanceIdFrom(com.google.firebase.crashlytics.internal.common.CommonUtils.getMappingFileId(context), str, str3, str2), str3, str2, com.google.firebase.crashlytics.internal.common.DeliveryMechanism.determineFrom(installerPackageName).getId()), systemCurrentTimeProvider, new com.google.firebase.crashlytics.internal.settings.SettingsJsonParser(systemCurrentTimeProvider), new com.google.firebase.crashlytics.internal.settings.CachedSettingsIo(fileStore), new com.google.firebase.crashlytics.internal.settings.DefaultSettingsSpiCall(java.lang.String.format(java.util.Locale.US, SETTINGS_URL_FORMAT, str), httpRequestFactory), dataCollectionArbiter);
    }

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsProvider
    public com.google.android.gms.tasks.Task<com.google.firebase.crashlytics.internal.settings.Settings> getSettingsAsync() {
        return this.settingsTask.get().getTask();
    }

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsProvider
    public com.google.firebase.crashlytics.internal.settings.Settings getSettingsSync() {
        return this.settings.get();
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> loadSettingsData(com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers crashlyticsWorkers) {
        return loadSettingsData(com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior.USE_CACHE, crashlyticsWorkers);
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> loadSettingsData(com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior settingsCacheBehavior, com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers crashlyticsWorkers) throws java.lang.Throwable {
        com.google.firebase.crashlytics.internal.settings.Settings cachedSettingsData;
        if (!buildInstanceIdentifierChanged() && (cachedSettingsData = getCachedSettingsData(settingsCacheBehavior)) != null) {
            this.settings.set(cachedSettingsData);
            this.settingsTask.get().trySetResult(cachedSettingsData);
            return com.google.android.gms.tasks.Tasks.forResult(null);
        }
        com.google.firebase.crashlytics.internal.settings.Settings cachedSettingsData2 = getCachedSettingsData(com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION);
        if (cachedSettingsData2 != null) {
            this.settings.set(cachedSettingsData2);
            this.settingsTask.get().trySetResult(cachedSettingsData2);
        }
        return this.dataCollectionArbiter.waitForDataCollectionPermission().onSuccessTask(crashlyticsWorkers.common, new com.google.firebase.crashlytics.internal.settings.SettingsController.AnonymousClass1(crashlyticsWorkers));
    }

    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.settings.SettingsController$1, reason: invalid class name */
    class AnonymousClass1 implements com.google.android.gms.tasks.SuccessContinuation<java.lang.Void, java.lang.Void> {
        final /* synthetic */ com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers val$crashlyticsWorkers;

        AnonymousClass1(com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers crashlyticsWorkers) {
            this.val$crashlyticsWorkers = crashlyticsWorkers;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        public com.google.android.gms.tasks.Task<java.lang.Void> then(java.lang.Void r5) throws java.lang.Exception {
            org.json.JSONObject jSONObject = (org.json.JSONObject) this.val$crashlyticsWorkers.network.getExecutor().submit(new java.util.concurrent.Callable() { // from class: com.google.firebase.crashlytics.internal.settings.SettingsController$1$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return this.f$0.m856xd7ba6dd6();
                }
            }).get();
            if (jSONObject != null) {
                com.google.firebase.crashlytics.internal.settings.Settings settingsJson = com.google.firebase.crashlytics.internal.settings.SettingsController.this.settingsJsonParser.parseSettingsJson(jSONObject);
                com.google.firebase.crashlytics.internal.settings.SettingsController.this.cachedSettingsIo.writeCachedSettings(settingsJson.expiresAtMillis, jSONObject);
                com.google.firebase.crashlytics.internal.settings.SettingsController.this.logSettings(jSONObject, "Loaded settings: ");
                com.google.firebase.crashlytics.internal.settings.SettingsController settingsController = com.google.firebase.crashlytics.internal.settings.SettingsController.this;
                settingsController.setStoredBuildInstanceIdentifier(settingsController.settingsRequest.instanceId);
                com.google.firebase.crashlytics.internal.settings.SettingsController.this.settings.set(settingsJson);
                ((com.google.android.gms.tasks.TaskCompletionSource) com.google.firebase.crashlytics.internal.settings.SettingsController.this.settingsTask.get()).trySetResult(settingsJson);
            }
            return com.google.android.gms.tasks.Tasks.forResult(null);
        }

        /* JADX INFO: renamed from: lambda$then$0$com-google-firebase-crashlytics-internal-settings-SettingsController$1, reason: not valid java name */
        /* synthetic */ org.json.JSONObject m856xd7ba6dd6() throws java.lang.Exception {
            return com.google.firebase.crashlytics.internal.settings.SettingsController.this.settingsSpiCall.invoke(com.google.firebase.crashlytics.internal.settings.SettingsController.this.settingsRequest, true);
        }
    }

    private com.google.firebase.crashlytics.internal.settings.Settings getCachedSettingsData(com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior settingsCacheBehavior) throws java.lang.Throwable {
        com.google.firebase.crashlytics.internal.settings.Settings settings = null;
        try {
            if (!com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior.SKIP_CACHE_LOOKUP.equals(settingsCacheBehavior)) {
                org.json.JSONObject cachedSettings = this.cachedSettingsIo.readCachedSettings();
                if (cachedSettings != null) {
                    com.google.firebase.crashlytics.internal.settings.Settings settingsJson = this.settingsJsonParser.parseSettingsJson(cachedSettings);
                    if (settingsJson != null) {
                        logSettings(cachedSettings, "Loaded cached settings: ");
                        long currentTimeMillis = this.currentTimeProvider.getCurrentTimeMillis();
                        if (com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION.equals(settingsCacheBehavior) || !settingsJson.isExpired(currentTimeMillis)) {
                            try {
                                com.google.firebase.crashlytics.internal.Logger.getLogger().v("Returning cached settings.");
                                settings = settingsJson;
                            } catch (java.lang.Exception e) {
                                e = e;
                                settings = settingsJson;
                                com.google.firebase.crashlytics.internal.Logger.getLogger().e("Failed to get cached settings", e);
                            }
                        } else {
                            com.google.firebase.crashlytics.internal.Logger.getLogger().v("Cached settings have expired.");
                        }
                    } else {
                        com.google.firebase.crashlytics.internal.Logger.getLogger().e("Failed to parse cached settings data.", null);
                    }
                } else {
                    com.google.firebase.crashlytics.internal.Logger.getLogger().d("No cached settings data found.");
                }
            }
        } catch (java.lang.Exception e2) {
            e = e2;
        }
        return settings;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logSettings(org.json.JSONObject jSONObject, java.lang.String str) {
        com.google.firebase.crashlytics.internal.Logger.getLogger().d(str + jSONObject.toString());
    }

    private java.lang.String getStoredBuildInstanceIdentifier() {
        return com.google.firebase.crashlytics.internal.common.CommonUtils.getSharedPrefs(this.context).getString(PREFS_BUILD_INSTANCE_IDENTIFIER, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean setStoredBuildInstanceIdentifier(java.lang.String str) {
        android.content.SharedPreferences.Editor editorEdit = com.google.firebase.crashlytics.internal.common.CommonUtils.getSharedPrefs(this.context).edit();
        editorEdit.putString(PREFS_BUILD_INSTANCE_IDENTIFIER, str);
        editorEdit.apply();
        return true;
    }

    boolean buildInstanceIdentifierChanged() {
        return !getStoredBuildInstanceIdentifier().equals(this.settingsRequest.instanceId);
    }
}
