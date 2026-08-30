package com.google.firebase.crashlytics;

/* JADX INFO: loaded from: classes5.dex */
public class FirebaseCrashlytics {
    static final int APP_EXCEPTION_CALLBACK_TIMEOUT_MS = 500;
    static final java.lang.String FIREBASE_CRASHLYTICS_ANALYTICS_ORIGIN = "clx";
    static final java.lang.String LEGACY_CRASH_ANALYTICS_ORIGIN = "crash";
    final com.google.firebase.crashlytics.internal.common.CrashlyticsCore core;

    static com.google.firebase.crashlytics.FirebaseCrashlytics init(com.google.firebase.FirebaseApp firebaseApp, com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallationsApi, com.google.firebase.inject.Deferred<com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent> deferred, com.google.firebase.inject.Deferred<com.google.firebase.analytics.connector.AnalyticsConnector> deferred2, com.google.firebase.inject.Deferred<com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop> deferred3, java.util.concurrent.ExecutorService executorService, java.util.concurrent.ExecutorService executorService2, java.util.concurrent.ExecutorService executorService3) {
        android.content.Context applicationContext = firebaseApp.getApplicationContext();
        java.lang.String packageName = applicationContext.getPackageName();
        com.google.firebase.crashlytics.internal.Logger.getLogger().i("Initializing Firebase Crashlytics " + com.google.firebase.crashlytics.internal.common.CrashlyticsCore.getVersion() + " for " + packageName);
        com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers crashlyticsWorkers = new com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers(executorService, executorService2);
        com.google.firebase.crashlytics.internal.persistence.FileStore fileStore = new com.google.firebase.crashlytics.internal.persistence.FileStore(applicationContext);
        com.google.firebase.crashlytics.internal.common.DataCollectionArbiter dataCollectionArbiter = new com.google.firebase.crashlytics.internal.common.DataCollectionArbiter(firebaseApp);
        com.google.firebase.crashlytics.internal.common.IdManager idManager = new com.google.firebase.crashlytics.internal.common.IdManager(applicationContext, packageName, firebaseInstallationsApi, dataCollectionArbiter);
        com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy crashlyticsNativeComponentDeferredProxy = new com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy(deferred);
        com.google.firebase.crashlytics.AnalyticsDeferredProxy analyticsDeferredProxy = new com.google.firebase.crashlytics.AnalyticsDeferredProxy(deferred2);
        com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber = new com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber(dataCollectionArbiter, fileStore);
        com.google.firebase.sessions.api.FirebaseSessionsDependencies.register(crashlyticsAppQualitySessionsSubscriber);
        com.google.firebase.crashlytics.internal.common.CrashlyticsCore crashlyticsCore = new com.google.firebase.crashlytics.internal.common.CrashlyticsCore(firebaseApp, idManager, crashlyticsNativeComponentDeferredProxy, dataCollectionArbiter, analyticsDeferredProxy.getDeferredBreadcrumbSource(), analyticsDeferredProxy.getAnalyticsEventLogger(), fileStore, crashlyticsAppQualitySessionsSubscriber, new com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy(deferred3), crashlyticsWorkers);
        java.lang.String applicationId = firebaseApp.getOptions().getApplicationId();
        java.lang.String mappingFileId = com.google.firebase.crashlytics.internal.common.CommonUtils.getMappingFileId(applicationContext);
        java.util.List<com.google.firebase.crashlytics.internal.common.BuildIdInfo> buildIdInfo = com.google.firebase.crashlytics.internal.common.CommonUtils.getBuildIdInfo(applicationContext);
        com.google.firebase.crashlytics.internal.Logger.getLogger().d("Mapping file ID is: " + mappingFileId);
        for (com.google.firebase.crashlytics.internal.common.BuildIdInfo buildIdInfo2 : buildIdInfo) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().d(java.lang.String.format("Build id for %s on %s: %s", buildIdInfo2.getLibraryName(), buildIdInfo2.getArch(), buildIdInfo2.getBuildId()));
        }
        try {
            com.google.firebase.crashlytics.internal.common.AppData appDataCreate = com.google.firebase.crashlytics.internal.common.AppData.create(applicationContext, idManager, applicationId, mappingFileId, buildIdInfo, new com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider(applicationContext));
            com.google.firebase.crashlytics.internal.Logger.getLogger().v("Installer package name is: " + appDataCreate.installerPackageName);
            com.google.firebase.crashlytics.internal.settings.SettingsController settingsControllerCreate = com.google.firebase.crashlytics.internal.settings.SettingsController.create(applicationContext, applicationId, idManager, new com.google.firebase.crashlytics.internal.network.HttpRequestFactory(), appDataCreate.versionCode, appDataCreate.versionName, fileStore, dataCollectionArbiter);
            settingsControllerCreate.loadSettingsData(crashlyticsWorkers).addOnFailureListener(executorService3, new com.google.android.gms.tasks.OnFailureListener() { // from class: com.google.firebase.crashlytics.FirebaseCrashlytics$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(java.lang.Exception exc) {
                    com.google.firebase.crashlytics.internal.Logger.getLogger().e("Error fetching settings.", exc);
                }
            });
            if (crashlyticsCore.onPreExecute(appDataCreate, settingsControllerCreate)) {
                crashlyticsCore.doBackgroundInitializationAsync(settingsControllerCreate);
            }
            return new com.google.firebase.crashlytics.FirebaseCrashlytics(crashlyticsCore);
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().e("Error retrieving app package info.", e);
            return null;
        }
    }

    private FirebaseCrashlytics(com.google.firebase.crashlytics.internal.common.CrashlyticsCore crashlyticsCore) {
        this.core = crashlyticsCore;
    }

    public static com.google.firebase.crashlytics.FirebaseCrashlytics getInstance() {
        com.google.firebase.crashlytics.FirebaseCrashlytics firebaseCrashlytics = (com.google.firebase.crashlytics.FirebaseCrashlytics) com.google.firebase.FirebaseApp.getInstance().get(com.google.firebase.crashlytics.FirebaseCrashlytics.class);
        if (firebaseCrashlytics != null) {
            return firebaseCrashlytics;
        }
        throw new java.lang.NullPointerException("FirebaseCrashlytics component is not present.");
    }

    public void recordException(java.lang.Throwable th) {
        if (th == null) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().w("A null value was passed to recordException. Ignoring.");
        } else {
            this.core.logException(th, java.util.Collections.emptyMap());
        }
    }

    public void recordException(java.lang.Throwable th, com.google.firebase.crashlytics.CustomKeysAndValues customKeysAndValues) {
        if (th == null) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().w("A null value was passed to recordException. Ignoring.");
        } else {
            this.core.logException(th, customKeysAndValues.keysAndValues);
        }
    }

    public void log(java.lang.String str) {
        this.core.log(str);
    }

    public void setUserId(java.lang.String str) {
        this.core.setUserId(str);
    }

    public void setCustomKey(java.lang.String str, boolean z) {
        this.core.setCustomKey(str, java.lang.Boolean.toString(z));
    }

    public void setCustomKey(java.lang.String str, double d) {
        this.core.setCustomKey(str, java.lang.Double.toString(d));
    }

    public void setCustomKey(java.lang.String str, float f) {
        this.core.setCustomKey(str, java.lang.Float.toString(f));
    }

    public void setCustomKey(java.lang.String str, int i) {
        this.core.setCustomKey(str, java.lang.Integer.toString(i));
    }

    public void setCustomKey(java.lang.String str, long j) {
        this.core.setCustomKey(str, java.lang.Long.toString(j));
    }

    public void setCustomKey(java.lang.String str, java.lang.String str2) {
        this.core.setCustomKey(str, str2);
    }

    public void setCustomKeys(com.google.firebase.crashlytics.CustomKeysAndValues customKeysAndValues) {
        this.core.setCustomKeys(customKeysAndValues.keysAndValues);
    }

    public com.google.android.gms.tasks.Task<java.lang.Boolean> checkForUnsentReports() {
        return this.core.checkForUnsentReports();
    }

    public void sendUnsentReports() {
        this.core.sendUnsentReports();
    }

    public void deleteUnsentReports() {
        this.core.deleteUnsentReports();
    }

    public boolean didCrashOnPreviousExecution() {
        return this.core.didCrashOnPreviousExecution();
    }

    public boolean isCrashlyticsCollectionEnabled() {
        return this.core.isCrashlyticsCollectionEnabled();
    }

    public void setCrashlyticsCollectionEnabled(boolean z) {
        this.core.setCrashlyticsCollectionEnabled(java.lang.Boolean.valueOf(z));
    }

    public void setCrashlyticsCollectionEnabled(java.lang.Boolean bool) {
        this.core.setCrashlyticsCollectionEnabled(bool);
    }
}
