package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: loaded from: classes5.dex */
public class DataCollectionArbiter {
    private static final java.lang.String FIREBASE_CRASHLYTICS_COLLECTION_ENABLED = "firebase_crashlytics_collection_enabled";
    private java.lang.Boolean crashlyticsDataCollectionEnabled;
    com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> dataCollectionEnabledTask;
    private final com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> dataCollectionExplicitlyApproved;
    private final com.google.firebase.FirebaseApp firebaseApp;
    private boolean setInManifest;
    private final android.content.SharedPreferences sharedPreferences;
    private final java.lang.Object taskLock;
    boolean taskResolved;

    public DataCollectionArbiter(com.google.firebase.FirebaseApp firebaseApp) {
        java.lang.Object obj = new java.lang.Object();
        this.taskLock = obj;
        this.dataCollectionEnabledTask = new com.google.android.gms.tasks.TaskCompletionSource<>();
        this.taskResolved = false;
        this.setInManifest = false;
        this.dataCollectionExplicitlyApproved = new com.google.android.gms.tasks.TaskCompletionSource<>();
        android.content.Context applicationContext = firebaseApp.getApplicationContext();
        this.firebaseApp = firebaseApp;
        this.sharedPreferences = com.google.firebase.crashlytics.internal.common.CommonUtils.getSharedPrefs(applicationContext);
        java.lang.Boolean dataCollectionValueFromSharedPreferences = getDataCollectionValueFromSharedPreferences();
        this.crashlyticsDataCollectionEnabled = dataCollectionValueFromSharedPreferences == null ? getDataCollectionValueFromManifest(applicationContext) : dataCollectionValueFromSharedPreferences;
        synchronized (obj) {
            if (isAutomaticDataCollectionEnabled()) {
                this.dataCollectionEnabledTask.trySetResult(null);
                this.taskResolved = true;
            }
        }
    }

    public synchronized boolean isAutomaticDataCollectionEnabled() {
        boolean zIsFirebaseDataCollectionDefaultEnabled;
        java.lang.Boolean bool = this.crashlyticsDataCollectionEnabled;
        if (bool != null) {
            zIsFirebaseDataCollectionDefaultEnabled = bool.booleanValue();
        } else {
            zIsFirebaseDataCollectionDefaultEnabled = isFirebaseDataCollectionDefaultEnabled();
        }
        logDataCollectionState(zIsFirebaseDataCollectionDefaultEnabled);
        return zIsFirebaseDataCollectionDefaultEnabled;
    }

    private boolean isFirebaseDataCollectionDefaultEnabled() {
        try {
            return this.firebaseApp.isDataCollectionDefaultEnabled();
        } catch (java.lang.IllegalStateException unused) {
            return false;
        }
    }

    public synchronized void setCrashlyticsDataCollectionEnabled(java.lang.Boolean bool) {
        if (bool != null) {
            try {
                this.setInManifest = false;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        this.crashlyticsDataCollectionEnabled = bool != null ? bool : getDataCollectionValueFromManifest(this.firebaseApp.getApplicationContext());
        storeDataCollectionValueInSharedPreferences(this.sharedPreferences, bool);
        synchronized (this.taskLock) {
            if (isAutomaticDataCollectionEnabled()) {
                if (!this.taskResolved) {
                    this.dataCollectionEnabledTask.trySetResult(null);
                    this.taskResolved = true;
                }
            } else if (this.taskResolved) {
                this.dataCollectionEnabledTask = new com.google.android.gms.tasks.TaskCompletionSource<>();
                this.taskResolved = false;
            }
        }
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> waitForAutomaticDataCollectionEnabled() {
        com.google.android.gms.tasks.Task<java.lang.Void> task;
        synchronized (this.taskLock) {
            task = this.dataCollectionEnabledTask.getTask();
        }
        return task;
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> waitForDataCollectionPermission() {
        return com.google.firebase.crashlytics.internal.concurrency.CrashlyticsTasks.race(this.dataCollectionExplicitlyApproved.getTask(), waitForAutomaticDataCollectionEnabled());
    }

    public void grantDataCollectionPermission(boolean z) {
        if (!z) {
            throw new java.lang.IllegalStateException("An invalid data collection token was used.");
        }
        this.dataCollectionExplicitlyApproved.trySetResult(null);
    }

    private void logDataCollectionState(boolean z) {
        java.lang.String str;
        java.lang.String str2 = z ? "ENABLED" : "DISABLED";
        if (this.crashlyticsDataCollectionEnabled == null) {
            str = "global Firebase setting";
        } else {
            str = this.setInManifest ? "firebase_crashlytics_collection_enabled manifest flag" : "API";
        }
        com.google.firebase.crashlytics.internal.Logger.getLogger().d(java.lang.String.format("Crashlytics automatic data collection %s by %s.", str2, str));
    }

    private java.lang.Boolean getDataCollectionValueFromSharedPreferences() {
        if (!this.sharedPreferences.contains(FIREBASE_CRASHLYTICS_COLLECTION_ENABLED)) {
            return null;
        }
        this.setInManifest = false;
        return java.lang.Boolean.valueOf(this.sharedPreferences.getBoolean(FIREBASE_CRASHLYTICS_COLLECTION_ENABLED, true));
    }

    private java.lang.Boolean getDataCollectionValueFromManifest(android.content.Context context) {
        java.lang.Boolean crashlyticsDataCollectionEnabledFromManifest = readCrashlyticsDataCollectionEnabledFromManifest(context);
        if (crashlyticsDataCollectionEnabledFromManifest == null) {
            this.setInManifest = false;
            return null;
        }
        this.setInManifest = true;
        return java.lang.Boolean.valueOf(java.lang.Boolean.TRUE.equals(crashlyticsDataCollectionEnabledFromManifest));
    }

    private static java.lang.Boolean readCrashlyticsDataCollectionEnabledFromManifest(android.content.Context context) {
        android.content.pm.ApplicationInfo applicationInfo;
        try {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey(FIREBASE_CRASHLYTICS_COLLECTION_ENABLED)) {
                return null;
            }
            return java.lang.Boolean.valueOf(applicationInfo.metaData.getBoolean(FIREBASE_CRASHLYTICS_COLLECTION_ENABLED));
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().e("Could not read data collection permission from manifest", e);
            return null;
        }
    }

    private static void storeDataCollectionValueInSharedPreferences(android.content.SharedPreferences sharedPreferences, java.lang.Boolean bool) {
        android.content.SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        if (bool != null) {
            editorEdit.putBoolean(FIREBASE_CRASHLYTICS_COLLECTION_ENABLED, bool.booleanValue());
        } else {
            editorEdit.remove(FIREBASE_CRASHLYTICS_COLLECTION_ENABLED);
        }
        editorEdit.apply();
    }
}
