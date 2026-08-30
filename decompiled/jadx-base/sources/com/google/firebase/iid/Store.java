package com.google.firebase.iid;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.1.0 */
/* JADX INFO: loaded from: classes5.dex */
class Store {
    final android.content.Context context;
    final android.content.SharedPreferences store;
    private final java.util.Map<java.lang.String, java.lang.Long> subtypeCreationTimes = new androidx.collection.ArrayMap();

    /* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.1.0 */
    static class Token {
        private static final long REFRESH_PERIOD_MILLIS = java.util.concurrent.TimeUnit.DAYS.toMillis(7);
        final java.lang.String appVersion;
        final long timestamp;
        final java.lang.String token;

        private Token(java.lang.String str, java.lang.String str2, long j) {
            this.token = str;
            this.appVersion = str2;
            this.timestamp = j;
        }

        static java.lang.String encode(java.lang.String str, java.lang.String str2, long j) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("token", str);
                jSONObject.put(com.ironsource.y8.i.W, str2);
                jSONObject.put(com.ironsource.aa.a.d, j);
                return jSONObject.toString();
            } catch (org.json.JSONException e) {
                java.lang.String strValueOf = java.lang.String.valueOf(e);
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 24);
                sb.append("Failed to encode token: ");
                sb.append(strValueOf);
                android.util.Log.w("FirebaseInstanceId", sb.toString());
                return null;
            }
        }

        static java.lang.String getTokenOrNull(com.google.firebase.iid.Store.Token token) {
            if (token == null) {
                return null;
            }
            return token.token;
        }

        static com.google.firebase.iid.Store.Token parse(java.lang.String str) {
            if (android.text.TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new com.google.firebase.iid.Store.Token(str, null, 0L);
            }
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                return new com.google.firebase.iid.Store.Token(jSONObject.getString("token"), jSONObject.getString(com.ironsource.y8.i.W), jSONObject.getLong(com.ironsource.aa.a.d));
            } catch (org.json.JSONException e) {
                java.lang.String strValueOf = java.lang.String.valueOf(e);
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 23);
                sb.append("Failed to parse token: ");
                sb.append(strValueOf);
                android.util.Log.w("FirebaseInstanceId", sb.toString());
                return null;
            }
        }

        boolean needsRefresh(java.lang.String str) {
            return java.lang.System.currentTimeMillis() > this.timestamp + REFRESH_PERIOD_MILLIS || !str.equals(this.appVersion);
        }
    }

    public Store(android.content.Context context) {
        this.context = context;
        this.store = context.getSharedPreferences("com.google.android.gms.appid", 0);
        checkForRestore("com.google.android.gms.appid-no-backup");
    }

    private void checkForRestore(java.lang.String str) {
        java.io.File file = new java.io.File(androidx.core.content.ContextCompat.getNoBackupFilesDir(this.context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || isEmpty()) {
                return;
            }
            android.util.Log.i("FirebaseInstanceId", "App restored, clearing state");
            deleteAll();
        } catch (java.io.IOException e) {
            if (android.util.Log.isLoggable("FirebaseInstanceId", 3)) {
                java.lang.String strValueOf = java.lang.String.valueOf(e.getMessage());
                android.util.Log.d("FirebaseInstanceId", strValueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(strValueOf) : new java.lang.String("Error creating file in no backup dir: "));
            }
        }
    }

    static java.lang.String createSubtypeInfoKey(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 6);
        sb.append(str);
        sb.append("|S|cre");
        return sb.toString();
    }

    private java.lang.String createTokenKey(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        int length = java.lang.String.valueOf(str).length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 4 + java.lang.String.valueOf(str2).length() + java.lang.String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    private long getCreationTimeFromSharedPreferences(java.lang.String str) {
        java.lang.String string = this.store.getString(createSubtypeInfoKey(str, "cre"), null);
        if (string == null) {
            return 0L;
        }
        try {
            return java.lang.Long.parseLong(string);
        } catch (java.lang.NumberFormatException unused) {
            return 0L;
        }
    }

    private long writeCreationTimeToSharedPreferences(java.lang.String str) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (this.store.contains(createSubtypeInfoKey(str, "cre"))) {
            return getCreationTimeFromSharedPreferences(str);
        }
        android.content.SharedPreferences.Editor editorEdit = this.store.edit();
        editorEdit.putString(createSubtypeInfoKey(str, "cre"), java.lang.String.valueOf(jCurrentTimeMillis));
        editorEdit.commit();
        return jCurrentTimeMillis;
    }

    public synchronized void deleteAll() {
        this.subtypeCreationTimes.clear();
        this.store.edit().clear().commit();
    }

    public synchronized void deleteToken(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String strCreateTokenKey = createTokenKey(str, str2, str3);
        android.content.SharedPreferences.Editor editorEdit = this.store.edit();
        editorEdit.remove(strCreateTokenKey);
        editorEdit.commit();
    }

    public synchronized long getCreationTime(java.lang.String str) {
        java.lang.Long l = this.subtypeCreationTimes.get(str);
        if (l != null) {
            return l.longValue();
        }
        return getCreationTimeFromSharedPreferences(str);
    }

    public synchronized com.google.firebase.iid.Store.Token getToken(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return com.google.firebase.iid.Store.Token.parse(this.store.getString(createTokenKey(str, str2, str3), null));
    }

    public synchronized boolean isEmpty() {
        return this.store.getAll().isEmpty();
    }

    public synchronized void saveToken(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        java.lang.String strEncode = com.google.firebase.iid.Store.Token.encode(str4, str5, java.lang.System.currentTimeMillis());
        if (strEncode == null) {
            return;
        }
        android.content.SharedPreferences.Editor editorEdit = this.store.edit();
        editorEdit.putString(createTokenKey(str, str2, str3), strEncode);
        editorEdit.commit();
    }

    public synchronized long setCreationTime(java.lang.String str) {
        long jWriteCreationTimeToSharedPreferences;
        jWriteCreationTimeToSharedPreferences = writeCreationTimeToSharedPreferences(str);
        this.subtypeCreationTimes.put(str, java.lang.Long.valueOf(jWriteCreationTimeToSharedPreferences));
        return jWriteCreationTimeToSharedPreferences;
    }
}
