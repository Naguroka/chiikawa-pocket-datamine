package com.google.firebase.crashlytics.internal.settings;

/* JADX INFO: loaded from: classes5.dex */
public class CachedSettingsIo {
    private static final java.lang.String SETTINGS_CACHE_FILENAME = "com.crashlytics.settings.json";
    private final java.io.File cachedSettingsFile;

    public CachedSettingsIo(com.google.firebase.crashlytics.internal.persistence.FileStore fileStore) {
        this.cachedSettingsFile = fileStore.getCommonFile(SETTINGS_CACHE_FILENAME);
    }

    private java.io.File getSettingsFile() {
        return this.cachedSettingsFile;
    }

    public org.json.JSONObject readCachedSettings() throws java.lang.Throwable {
        java.lang.Throwable th;
        java.io.FileInputStream fileInputStream;
        org.json.JSONObject jSONObject;
        com.google.firebase.crashlytics.internal.Logger.getLogger().d("Checking for cached settings...");
        java.io.FileInputStream fileInputStream2 = null;
        try {
            try {
                java.io.File settingsFile = getSettingsFile();
                if (settingsFile.exists()) {
                    fileInputStream = new java.io.FileInputStream(settingsFile);
                    try {
                        jSONObject = new org.json.JSONObject(com.google.firebase.crashlytics.internal.common.CommonUtils.streamToString(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (java.lang.Exception e) {
                        e = e;
                        com.google.firebase.crashlytics.internal.Logger.getLogger().e("Failed to fetch cached settings", e);
                        com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    com.google.firebase.crashlytics.internal.Logger.getLogger().v("Settings file does not exist.");
                    jSONObject = null;
                }
                com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (java.lang.Throwable th2) {
                th = th2;
                com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(null, "Error while closing settings cache file.");
                throw th;
            }
        } catch (java.lang.Exception e2) {
            e = e2;
            fileInputStream = null;
        } catch (java.lang.Throwable th3) {
            th = th3;
            com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(null, "Error while closing settings cache file.");
            throw th;
        }
    }

    public void writeCachedSettings(long j, org.json.JSONObject jSONObject) throws java.lang.Throwable {
        com.google.firebase.crashlytics.internal.Logger.getLogger().v("Writing settings to cache file...");
        if (jSONObject != null) {
            java.io.FileWriter fileWriter = null;
            try {
                try {
                    jSONObject.put("expires_at", j);
                    java.io.FileWriter fileWriter2 = new java.io.FileWriter(getSettingsFile());
                    try {
                        fileWriter2.write(jSONObject.toString());
                        fileWriter2.flush();
                        com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(fileWriter2, "Failed to close settings writer.");
                    } catch (java.lang.Exception e) {
                        e = e;
                        fileWriter = fileWriter2;
                        com.google.firebase.crashlytics.internal.Logger.getLogger().e("Failed to cache settings", e);
                        com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(fileWriter, "Failed to close settings writer.");
                    } catch (java.lang.Throwable th) {
                        th = th;
                        fileWriter = fileWriter2;
                        com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(fileWriter, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
            } catch (java.lang.Exception e2) {
                e = e2;
            }
        }
    }
}
