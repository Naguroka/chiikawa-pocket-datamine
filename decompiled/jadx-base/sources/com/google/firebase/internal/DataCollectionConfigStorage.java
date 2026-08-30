package com.google.firebase.internal;

/* JADX INFO: loaded from: classes5.dex */
public class DataCollectionConfigStorage {
    public static final java.lang.String DATA_COLLECTION_DEFAULT_ENABLED = "firebase_data_collection_default_enabled";
    private static final java.lang.String FIREBASE_APP_PREFS = "com.google.firebase.common.prefs:";
    private boolean dataCollectionDefaultEnabled;
    private final android.content.Context deviceProtectedContext;
    private final com.google.firebase.events.Publisher publisher;
    private final android.content.SharedPreferences sharedPreferences;

    public DataCollectionConfigStorage(android.content.Context context, java.lang.String str, com.google.firebase.events.Publisher publisher) {
        android.content.Context contextDirectBootSafe = directBootSafe(context);
        this.deviceProtectedContext = contextDirectBootSafe;
        this.sharedPreferences = contextDirectBootSafe.getSharedPreferences(FIREBASE_APP_PREFS + str, 0);
        this.publisher = publisher;
        this.dataCollectionDefaultEnabled = readAutoDataCollectionEnabled();
    }

    private static android.content.Context directBootSafe(android.content.Context context) {
        return androidx.core.content.ContextCompat.createDeviceProtectedStorageContext(context);
    }

    public synchronized boolean isEnabled() {
        return this.dataCollectionDefaultEnabled;
    }

    private synchronized void updateDataCollectionDefaultEnabled(boolean z) {
        if (this.dataCollectionDefaultEnabled != z) {
            this.dataCollectionDefaultEnabled = z;
            this.publisher.publish(new com.google.firebase.events.Event<>(com.google.firebase.DataCollectionDefaultChange.class, new com.google.firebase.DataCollectionDefaultChange(z)));
        }
    }

    public synchronized void setEnabled(java.lang.Boolean bool) {
        try {
            if (bool == null) {
                this.sharedPreferences.edit().remove(DATA_COLLECTION_DEFAULT_ENABLED).apply();
                updateDataCollectionDefaultEnabled(readManifestDataCollectionEnabled());
            } else {
                boolean zEquals = java.lang.Boolean.TRUE.equals(bool);
                this.sharedPreferences.edit().putBoolean(DATA_COLLECTION_DEFAULT_ENABLED, zEquals).apply();
                updateDataCollectionDefaultEnabled(zEquals);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    private boolean readManifestDataCollectionEnabled() {
        android.content.pm.ApplicationInfo applicationInfo;
        try {
            android.content.pm.PackageManager packageManager = this.deviceProtectedContext.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.deviceProtectedContext.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey(DATA_COLLECTION_DEFAULT_ENABLED)) {
                return true;
            }
            return applicationInfo.metaData.getBoolean(DATA_COLLECTION_DEFAULT_ENABLED);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    private boolean readAutoDataCollectionEnabled() {
        if (this.sharedPreferences.contains(DATA_COLLECTION_DEFAULT_ENABLED)) {
            return this.sharedPreferences.getBoolean(DATA_COLLECTION_DEFAULT_ENABLED, true);
        }
        return readManifestDataCollectionEnabled();
    }
}
