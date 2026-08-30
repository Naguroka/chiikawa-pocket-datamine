package com.google.firebase.installations.local;

/* JADX INFO: loaded from: classes5.dex */
public class PersistedInstallation {
    private static final java.lang.String AUTH_TOKEN_KEY = "AuthToken";
    private static final java.lang.String EXPIRES_IN_SECONDS_KEY = "ExpiresInSecs";
    private static final java.lang.String FIREBASE_INSTALLATION_ID_KEY = "Fid";
    private static final java.lang.String FIS_ERROR_KEY = "FisError";
    private static final java.lang.String PERSISTED_STATUS_KEY = "Status";
    private static final java.lang.String REFRESH_TOKEN_KEY = "RefreshToken";
    private static final java.lang.String SETTINGS_FILE_NAME_PREFIX = "PersistedInstallation";
    private static final java.lang.String TOKEN_CREATION_TIME_IN_SECONDS_KEY = "TokenCreationEpochInSecs";
    private java.io.File dataFile;
    private final com.google.firebase.FirebaseApp firebaseApp;

    public enum RegistrationStatus {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public PersistedInstallation(com.google.firebase.FirebaseApp firebaseApp) {
        this.firebaseApp = firebaseApp;
    }

    private java.io.File getDataFile() {
        if (this.dataFile == null) {
            synchronized (this) {
                if (this.dataFile == null) {
                    this.dataFile = new java.io.File(this.firebaseApp.getApplicationContext().getFilesDir(), "PersistedInstallation." + this.firebaseApp.getPersistenceKey() + ".json");
                }
            }
        }
        return this.dataFile;
    }

    public com.google.firebase.installations.local.PersistedInstallationEntry readPersistedInstallationEntryValue() {
        org.json.JSONObject jSONFromFile = readJSONFromFile();
        java.lang.String strOptString = jSONFromFile.optString(FIREBASE_INSTALLATION_ID_KEY, null);
        int iOptInt = jSONFromFile.optInt(PERSISTED_STATUS_KEY, com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION.ordinal());
        java.lang.String strOptString2 = jSONFromFile.optString(AUTH_TOKEN_KEY, null);
        java.lang.String strOptString3 = jSONFromFile.optString(REFRESH_TOKEN_KEY, null);
        long jOptLong = jSONFromFile.optLong(TOKEN_CREATION_TIME_IN_SECONDS_KEY, 0L);
        long jOptLong2 = jSONFromFile.optLong(EXPIRES_IN_SECONDS_KEY, 0L);
        return com.google.firebase.installations.local.PersistedInstallationEntry.builder().setFirebaseInstallationId(strOptString).setRegistrationStatus(com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.values()[iOptInt]).setAuthToken(strOptString2).setRefreshToken(strOptString3).setTokenCreationEpochInSecs(jOptLong).setExpiresInSecs(jOptLong2).setFisError(jSONFromFile.optString(FIS_ERROR_KEY, null)).build();
    }

    private org.json.JSONObject readJSONFromFile() {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(getDataFile());
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, 16384);
                    if (i >= 0) {
                        byteArrayOutputStream.write(bArr, 0, i);
                    } else {
                        org.json.JSONObject jSONObject = new org.json.JSONObject(byteArrayOutputStream.toString());
                        fileInputStream.close();
                        return jSONObject;
                    }
                } catch (java.lang.Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (java.io.IOException | org.json.JSONException unused) {
            return new org.json.JSONObject();
        }
    }

    public com.google.firebase.installations.local.PersistedInstallationEntry insertOrUpdatePersistedInstallationEntry(com.google.firebase.installations.local.PersistedInstallationEntry persistedInstallationEntry) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(FIREBASE_INSTALLATION_ID_KEY, persistedInstallationEntry.getFirebaseInstallationId());
            jSONObject.put(PERSISTED_STATUS_KEY, persistedInstallationEntry.getRegistrationStatus().ordinal());
            jSONObject.put(AUTH_TOKEN_KEY, persistedInstallationEntry.getAuthToken());
            jSONObject.put(REFRESH_TOKEN_KEY, persistedInstallationEntry.getRefreshToken());
            jSONObject.put(TOKEN_CREATION_TIME_IN_SECONDS_KEY, persistedInstallationEntry.getTokenCreationEpochInSecs());
            jSONObject.put(EXPIRES_IN_SECONDS_KEY, persistedInstallationEntry.getExpiresInSecs());
            jSONObject.put(FIS_ERROR_KEY, persistedInstallationEntry.getFisError());
            java.io.File fileCreateTempFile = java.io.File.createTempFile(SETTINGS_FILE_NAME_PREFIX, "tmp", this.firebaseApp.getApplicationContext().getFilesDir());
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes(com.adjust.sdk.Constants.ENCODING));
            fileOutputStream.close();
            if (!fileCreateTempFile.renameTo(getDataFile())) {
                throw new java.io.IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (java.io.IOException | org.json.JSONException unused) {
        }
        return persistedInstallationEntry;
    }

    public void clearForTesting() {
        getDataFile().delete();
    }
}
