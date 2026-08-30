package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class SharedPreferencesManager {
    private static final int INDEX_CLICK_TIME = 1;
    private static final int INDEX_IS_SENDING = 2;
    private static final int INDEX_RAW_REFERRER = 0;
    private static final java.lang.String PREFS_KEY_CONTROL_PARAMS = "control_params";
    private static final java.lang.String PREFS_KEY_DEEPLINK_CLICK_TIME = "deeplink_click_time";
    private static final java.lang.String PREFS_KEY_DEEPLINK_URL = "deeplink_url";
    private static final java.lang.String PREFS_KEY_DEEPLINK_URL_CACHED = "deeplink_url_cached";
    private static final java.lang.String PREFS_KEY_GDPR_FORGET_ME = "gdpr_forget_me";
    private static final java.lang.String PREFS_KEY_INSTALL_TRACKED = "install_tracked";
    private static final java.lang.String PREFS_KEY_PREINSTALL_PAYLOAD_READ_STATUS = "preinstall_payload_read_status";
    private static final java.lang.String PREFS_KEY_PREINSTALL_SYSTEM_INSTALLER_REFERRER = "preinstall_system_installer_referrer";
    private static final java.lang.String PREFS_KEY_PUSH_TOKEN = "push_token";
    private static final java.lang.String PREFS_KEY_RAW_REFERRERS = "raw_referrers";
    private static final java.lang.String PREFS_NAME = "adjust_preferences";
    private static final int REFERRERS_COUNT = 10;
    private static com.adjust.sdk.SharedPreferencesManager defaultInstance;
    private static android.content.SharedPreferences sharedPreferences;
    private static android.content.SharedPreferences.Editor sharedPreferencesEditor;

    private SharedPreferencesManager(android.content.Context context) {
        try {
            android.content.SharedPreferences sharedPreferences2 = context.getSharedPreferences(PREFS_NAME, 0);
            sharedPreferences = sharedPreferences2;
            sharedPreferencesEditor = sharedPreferences2.edit();
        } catch (java.lang.Exception e) {
            com.adjust.sdk.AdjustFactory.getLogger().error("Cannot access to SharedPreferences", e.getMessage());
            sharedPreferences = null;
            sharedPreferencesEditor = null;
        }
    }

    private synchronized boolean getBoolean(java.lang.String str, boolean z) {
        android.content.SharedPreferences sharedPreferences2 = sharedPreferences;
        if (sharedPreferences2 == null) {
            return z;
        }
        try {
            return sharedPreferences2.getBoolean(str, z);
        } catch (java.lang.ClassCastException unused) {
            return z;
        }
    }

    public static synchronized com.adjust.sdk.SharedPreferencesManager getDefaultInstance(android.content.Context context) {
        if (defaultInstance == null) {
            defaultInstance = new com.adjust.sdk.SharedPreferencesManager(context);
        }
        return defaultInstance;
    }

    private synchronized long getLong(java.lang.String str, long j) {
        android.content.SharedPreferences sharedPreferences2 = sharedPreferences;
        if (sharedPreferences2 == null) {
            return j;
        }
        try {
            return sharedPreferences2.getLong(str, j);
        } catch (java.lang.ClassCastException unused) {
            return j;
        }
    }

    private synchronized int getRawReferrerIndex(java.lang.String str, long j) {
        try {
            org.json.JSONArray rawReferrerArray = getRawReferrerArray();
            for (int i = 0; i < rawReferrerArray.length(); i++) {
                org.json.JSONArray jSONArray = rawReferrerArray.getJSONArray(i);
                java.lang.String strOptString = jSONArray.optString(0, null);
                if (strOptString != null && strOptString.equals(str) && jSONArray.optLong(1, -1L) == j) {
                    return i;
                }
            }
        } catch (org.json.JSONException unused) {
        }
        return -1;
    }

    private synchronized java.lang.String getString(java.lang.String str) {
        android.content.SharedPreferences sharedPreferences2 = sharedPreferences;
        if (sharedPreferences2 == null) {
            return null;
        }
        try {
            return sharedPreferences2.getString(str, null);
        } catch (java.lang.ClassCastException unused) {
            return null;
        } catch (java.lang.Throwable unused2) {
            if (str.equals(PREFS_KEY_RAW_REFERRERS)) {
                remove(PREFS_KEY_RAW_REFERRERS);
            }
            return null;
        }
    }

    private synchronized void remove(java.lang.String str) {
        android.content.SharedPreferences.Editor editor = sharedPreferencesEditor;
        if (editor != null) {
            editor.remove(str).apply();
        }
    }

    private synchronized void saveBoolean(java.lang.String str, boolean z) {
        android.content.SharedPreferences.Editor editor = sharedPreferencesEditor;
        if (editor != null) {
            editor.putBoolean(str, z).apply();
        }
    }

    private synchronized void saveInteger(java.lang.String str, int i) {
        android.content.SharedPreferences.Editor editor = sharedPreferencesEditor;
        if (editor != null) {
            editor.putInt(str, i).apply();
        }
    }

    private synchronized void saveLong(java.lang.String str, long j) {
        android.content.SharedPreferences.Editor editor = sharedPreferencesEditor;
        if (editor != null) {
            editor.putLong(str, j).apply();
        }
    }

    private synchronized void saveString(java.lang.String str, java.lang.String str2) {
        android.content.SharedPreferences.Editor editor = sharedPreferencesEditor;
        if (editor != null) {
            editor.putString(str, str2).apply();
        }
    }

    public synchronized void cacheDeeplink(android.net.Uri uri) {
        if (uri == null) {
            return;
        }
        saveString(PREFS_KEY_DEEPLINK_URL_CACHED, uri.toString());
    }

    public synchronized void clear() {
        android.content.SharedPreferences.Editor editor = sharedPreferencesEditor;
        if (editor != null) {
            editor.clear().apply();
        }
    }

    public synchronized java.lang.String getCachedDeeplink() {
        return getString(PREFS_KEY_DEEPLINK_URL_CACHED);
    }

    public synchronized org.json.JSONObject getControlParamsJson() {
        java.lang.String string = getString(PREFS_KEY_CONTROL_PARAMS);
        if (string != null) {
            try {
                return new org.json.JSONObject(string);
            } catch (java.lang.Throwable unused) {
            }
        }
        return null;
    }

    public synchronized long getDeeplinkClickTime() {
        return getLong(PREFS_KEY_DEEPLINK_CLICK_TIME, -1L);
    }

    public synchronized java.lang.String getDeeplinkUrl() {
        return getString(PREFS_KEY_DEEPLINK_URL);
    }

    public synchronized boolean getGdprForgetMe() {
        return getBoolean(PREFS_KEY_GDPR_FORGET_ME, false);
    }

    public synchronized boolean getInstallTracked() {
        return getBoolean(PREFS_KEY_INSTALL_TRACKED, false);
    }

    public synchronized long getPreinstallPayloadReadStatus() {
        return getLong(PREFS_KEY_PREINSTALL_PAYLOAD_READ_STATUS, 0L);
    }

    public synchronized java.lang.String getPreinstallReferrer() {
        return getString(PREFS_KEY_PREINSTALL_SYSTEM_INSTALLER_REFERRER);
    }

    public synchronized java.lang.String getPushToken() {
        return getString(PREFS_KEY_PUSH_TOKEN);
    }

    public synchronized org.json.JSONArray getRawReferrer(java.lang.String str, long j) {
        int rawReferrerIndex = getRawReferrerIndex(str, j);
        if (rawReferrerIndex >= 0) {
            try {
                return getRawReferrerArray().getJSONArray(rawReferrerIndex);
            } catch (org.json.JSONException unused) {
            }
        }
        return null;
    }

    public synchronized org.json.JSONArray getRawReferrerArray() {
        java.lang.String string = getString(PREFS_KEY_RAW_REFERRERS);
        if (string != null) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(string);
                if (jSONArray.length() <= 10) {
                    return new org.json.JSONArray(string);
                }
                org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                for (int i = 0; i < 10; i++) {
                    jSONArray2.put(jSONArray.get(i));
                }
                saveRawReferrerArray(jSONArray2);
                return jSONArray2;
            } catch (java.lang.Throwable unused) {
            }
        }
        return new org.json.JSONArray();
    }

    public synchronized void removeDeeplink() {
        remove(PREFS_KEY_DEEPLINK_URL);
        remove(PREFS_KEY_DEEPLINK_CLICK_TIME);
    }

    public synchronized void removeGdprForgetMe() {
        remove(PREFS_KEY_GDPR_FORGET_ME);
    }

    public synchronized void removePreinstallReferrer() {
        remove(PREFS_KEY_PREINSTALL_SYSTEM_INSTALLER_REFERRER);
    }

    public synchronized void removePushToken() {
        remove(PREFS_KEY_PUSH_TOKEN);
    }

    public synchronized void removeRawReferrer(java.lang.String str, long j) {
        if (str != null) {
            if (str.length() != 0) {
                int rawReferrerIndex = getRawReferrerIndex(str, j);
                if (rawReferrerIndex < 0) {
                    return;
                }
                org.json.JSONArray rawReferrerArray = getRawReferrerArray();
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                for (int i = 0; i < rawReferrerArray.length(); i++) {
                    if (i != rawReferrerIndex) {
                        try {
                            jSONArray.put(rawReferrerArray.getJSONArray(i));
                        } catch (org.json.JSONException unused) {
                        }
                    }
                }
                saveString(PREFS_KEY_RAW_REFERRERS, jSONArray.toString());
            }
        }
    }

    public synchronized void saveControlParams(org.json.JSONObject jSONObject) {
        try {
            saveString(PREFS_KEY_CONTROL_PARAMS, jSONObject.toString());
        } catch (java.lang.Throwable unused) {
        }
    }

    public synchronized void saveDeeplink(android.net.Uri uri, long j) {
        if (uri == null) {
            return;
        }
        saveString(PREFS_KEY_DEEPLINK_URL, uri.toString());
        saveLong(PREFS_KEY_DEEPLINK_CLICK_TIME, j);
    }

    public synchronized void savePreinstallReferrer(java.lang.String str) {
        saveString(PREFS_KEY_PREINSTALL_SYSTEM_INSTALLER_REFERRER, str);
    }

    public synchronized void savePushToken(java.lang.String str) {
        saveString(PREFS_KEY_PUSH_TOKEN, str);
    }

    public synchronized void saveRawReferrer(java.lang.String str, long j) {
        try {
            if (getRawReferrer(str, j) != null) {
                return;
            }
            org.json.JSONArray rawReferrerArray = getRawReferrerArray();
            if (rawReferrerArray.length() == 10) {
                return;
            }
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            jSONArray.put(0, str);
            jSONArray.put(1, j);
            jSONArray.put(2, 0);
            rawReferrerArray.put(jSONArray);
            saveRawReferrerArray(rawReferrerArray);
        } catch (org.json.JSONException unused) {
        }
    }

    public synchronized void saveRawReferrerArray(org.json.JSONArray jSONArray) {
        try {
            saveString(PREFS_KEY_RAW_REFERRERS, jSONArray.toString());
        } catch (java.lang.Throwable unused) {
            remove(PREFS_KEY_RAW_REFERRERS);
        }
    }

    public synchronized void setGdprForgetMe() {
        saveBoolean(PREFS_KEY_GDPR_FORGET_ME, true);
    }

    public synchronized void setInstallTracked() {
        saveBoolean(PREFS_KEY_INSTALL_TRACKED, true);
    }

    public synchronized void setPreinstallPayloadReadStatus(long j) {
        saveLong(PREFS_KEY_PREINSTALL_PAYLOAD_READ_STATUS, j);
    }

    public synchronized void setSendingReferrersAsNotSent() {
        try {
            org.json.JSONArray rawReferrerArray = getRawReferrerArray();
            boolean z = false;
            for (int i = 0; i < rawReferrerArray.length(); i++) {
                org.json.JSONArray jSONArray = rawReferrerArray.getJSONArray(i);
                if (jSONArray.optInt(2, -1) == 1) {
                    jSONArray.put(2, 0);
                    z = true;
                }
            }
            if (z) {
                saveRawReferrerArray(rawReferrerArray);
            }
        } catch (org.json.JSONException unused) {
        }
    }
}
