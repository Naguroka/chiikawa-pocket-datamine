package com.google.firebase.messaging;

/* JADX INFO: loaded from: classes5.dex */
class Store {
    static final java.lang.String NO_BACKUP_FILE = "com.google.android.gms.appid-no-backup";
    static final java.lang.String PREFERENCES = "com.google.android.gms.appid";
    private static final java.lang.String SCOPE_ALL = "*";
    private static final java.lang.String STORE_KEY_TOKEN = "|T|";
    final android.content.SharedPreferences store;

    public Store(android.content.Context context) {
        this.store = context.getSharedPreferences(PREFERENCES, 0);
        checkForRestore(context, NO_BACKUP_FILE);
    }

    private void checkForRestore(android.content.Context context, java.lang.String str) {
        java.io.File file = new java.io.File(androidx.core.content.ContextCompat.getNoBackupFilesDir(context), str);
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || isEmpty()) {
                return;
            }
            android.util.Log.i(com.google.firebase.messaging.Constants.TAG, "App restored, clearing state");
            deleteAll();
        } catch (java.io.IOException e) {
            if (android.util.Log.isLoggable(com.google.firebase.messaging.Constants.TAG, 3)) {
                android.util.Log.d(com.google.firebase.messaging.Constants.TAG, "Error creating file in no backup dir: " + e.getMessage());
            }
        }
    }

    public synchronized boolean isEmpty() {
        return this.store.getAll().isEmpty();
    }

    private java.lang.String createTokenKey(java.lang.String str, java.lang.String str2) {
        return str + STORE_KEY_TOKEN + str2 + "|*";
    }

    public synchronized void deleteAll() {
        this.store.edit().clear().commit();
    }

    public synchronized com.google.firebase.messaging.Store.Token getToken(java.lang.String str, java.lang.String str2) {
        return com.google.firebase.messaging.Store.Token.parse(this.store.getString(createTokenKey(str, str2), null));
    }

    public synchronized void saveToken(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.lang.String strEncode = com.google.firebase.messaging.Store.Token.encode(str3, str4, java.lang.System.currentTimeMillis());
        if (strEncode == null) {
            return;
        }
        android.content.SharedPreferences.Editor editorEdit = this.store.edit();
        editorEdit.putString(createTokenKey(str, str2), strEncode);
        editorEdit.commit();
    }

    public synchronized void deleteToken(java.lang.String str, java.lang.String str2) {
        java.lang.String strCreateTokenKey = createTokenKey(str, str2);
        android.content.SharedPreferences.Editor editorEdit = this.store.edit();
        editorEdit.remove(strCreateTokenKey);
        editorEdit.commit();
    }

    static class Token {
        private static final java.lang.String KEY_APP_VERSION = "appVersion";
        private static final java.lang.String KEY_TIMESTAMP = "timestamp";
        private static final java.lang.String KEY_TOKEN = "token";
        private static final long REFRESH_PERIOD_MILLIS = java.util.concurrent.TimeUnit.DAYS.toMillis(7);
        final java.lang.String appVersion;
        final long timestamp;
        final java.lang.String token;

        private Token(java.lang.String str, java.lang.String str2, long j) {
            this.token = str;
            this.appVersion = str2;
            this.timestamp = j;
        }

        static com.google.firebase.messaging.Store.Token parse(java.lang.String str) {
            if (android.text.TextUtils.isEmpty(str)) {
                return null;
            }
            if (str.startsWith("{")) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                    return new com.google.firebase.messaging.Store.Token(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
                } catch (org.json.JSONException e) {
                    android.util.Log.w(com.google.firebase.messaging.Constants.TAG, "Failed to parse token: " + e);
                    return null;
                }
            }
            return new com.google.firebase.messaging.Store.Token(str, null, 0L);
        }

        static java.lang.String encode(java.lang.String str, java.lang.String str2, long j) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j);
                return jSONObject.toString();
            } catch (org.json.JSONException e) {
                android.util.Log.w(com.google.firebase.messaging.Constants.TAG, "Failed to encode token: " + e);
                return null;
            }
        }

        boolean needsRefresh(java.lang.String str) {
            return java.lang.System.currentTimeMillis() > this.timestamp + REFRESH_PERIOD_MILLIS || !str.equals(this.appVersion);
        }
    }
}
