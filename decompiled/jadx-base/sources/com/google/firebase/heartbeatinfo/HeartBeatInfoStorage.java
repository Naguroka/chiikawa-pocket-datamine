package com.google.firebase.heartbeatinfo;

/* JADX INFO: loaded from: classes5.dex */
class HeartBeatInfoStorage {
    private static final java.lang.String GLOBAL = "fire-global";
    private static final java.lang.String HEARTBEAT_PREFERENCES_NAME = "FirebaseHeartBeat";
    private static final int HEART_BEAT_COUNT_LIMIT = 30;
    private static final java.lang.String HEART_BEAT_COUNT_TAG = "fire-count";
    private static final java.lang.String LAST_STORED_DATE = "last-used-date";
    private static final java.lang.String PREFERENCES_NAME = "FirebaseAppHeartBeat";
    private static com.google.firebase.heartbeatinfo.HeartBeatInfoStorage instance;
    private final android.content.SharedPreferences firebaseSharedPreferences;

    public HeartBeatInfoStorage(android.content.Context context, java.lang.String str) {
        this.firebaseSharedPreferences = context.getSharedPreferences(HEARTBEAT_PREFERENCES_NAME + str, 0);
    }

    HeartBeatInfoStorage(android.content.SharedPreferences sharedPreferences) {
        this.firebaseSharedPreferences = sharedPreferences;
    }

    int getHeartBeatCount() {
        return (int) this.firebaseSharedPreferences.getLong(HEART_BEAT_COUNT_TAG, 0L);
    }

    synchronized void deleteAllHeartBeats() {
        android.content.SharedPreferences.Editor editorEdit = this.firebaseSharedPreferences.edit();
        int i = 0;
        for (java.util.Map.Entry<java.lang.String, ?> entry : this.firebaseSharedPreferences.getAll().entrySet()) {
            if (entry.getValue() instanceof java.util.Set) {
                java.util.Set set = (java.util.Set) entry.getValue();
                java.lang.String formattedDate = getFormattedDate(java.lang.System.currentTimeMillis());
                java.lang.String key = entry.getKey();
                if (set.contains(formattedDate)) {
                    java.util.HashSet hashSet = new java.util.HashSet();
                    hashSet.add(formattedDate);
                    i++;
                    editorEdit.putStringSet(key, hashSet);
                } else {
                    editorEdit.remove(key);
                }
            }
        }
        if (i == 0) {
            editorEdit.remove(HEART_BEAT_COUNT_TAG);
        } else {
            editorEdit.putLong(HEART_BEAT_COUNT_TAG, i);
        }
        editorEdit.commit();
    }

    synchronized java.util.List<com.google.firebase.heartbeatinfo.HeartBeatResult> getAllHeartBeats() {
        java.util.ArrayList arrayList;
        arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry<java.lang.String, ?> entry : this.firebaseSharedPreferences.getAll().entrySet()) {
            if (entry.getValue() instanceof java.util.Set) {
                java.util.HashSet hashSet = new java.util.HashSet((java.util.Set) entry.getValue());
                hashSet.remove(getFormattedDate(java.lang.System.currentTimeMillis()));
                if (!hashSet.isEmpty()) {
                    arrayList.add(com.google.firebase.heartbeatinfo.HeartBeatResult.create(entry.getKey(), new java.util.ArrayList(hashSet)));
                }
            }
        }
        updateGlobalHeartBeat(java.lang.System.currentTimeMillis());
        return arrayList;
    }

    private synchronized java.lang.String getStoredUserAgentString(java.lang.String str) {
        for (java.util.Map.Entry<java.lang.String, ?> entry : this.firebaseSharedPreferences.getAll().entrySet()) {
            if (entry.getValue() instanceof java.util.Set) {
                java.util.Iterator it = ((java.util.Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((java.lang.String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    private synchronized void updateStoredUserAgent(java.lang.String str, java.lang.String str2) {
        removeStoredDate(str2);
        java.util.HashSet hashSet = new java.util.HashSet(this.firebaseSharedPreferences.getStringSet(str, new java.util.HashSet()));
        hashSet.add(str2);
        this.firebaseSharedPreferences.edit().putStringSet(str, hashSet).commit();
    }

    private synchronized void removeStoredDate(java.lang.String str) {
        java.lang.String storedUserAgentString = getStoredUserAgentString(str);
        if (storedUserAgentString == null) {
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet(this.firebaseSharedPreferences.getStringSet(storedUserAgentString, new java.util.HashSet()));
        hashSet.remove(str);
        if (hashSet.isEmpty()) {
            this.firebaseSharedPreferences.edit().remove(storedUserAgentString).commit();
        } else {
            this.firebaseSharedPreferences.edit().putStringSet(storedUserAgentString, hashSet).commit();
        }
    }

    synchronized void postHeartBeatCleanUp() {
        java.lang.String formattedDate = getFormattedDate(java.lang.System.currentTimeMillis());
        this.firebaseSharedPreferences.edit().putString(LAST_STORED_DATE, formattedDate).commit();
        removeStoredDate(formattedDate);
    }

    private synchronized java.lang.String getFormattedDate(long j) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return new java.util.Date(j).toInstant().atOffset(java.time.ZoneOffset.UTC).toLocalDateTime().format(java.time.format.DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.UK).format(new java.util.Date(j));
    }

    synchronized void storeHeartBeat(long j, java.lang.String str) {
        java.lang.String formattedDate = getFormattedDate(j);
        if (this.firebaseSharedPreferences.getString(LAST_STORED_DATE, "").equals(formattedDate)) {
            java.lang.String storedUserAgentString = getStoredUserAgentString(formattedDate);
            if (storedUserAgentString == null) {
                return;
            }
            if (storedUserAgentString.equals(str)) {
                return;
            }
            updateStoredUserAgent(str, formattedDate);
            return;
        }
        long j2 = this.firebaseSharedPreferences.getLong(HEART_BEAT_COUNT_TAG, 0L);
        if (j2 + 1 == 30) {
            cleanUpStoredHeartBeats();
            j2 = this.firebaseSharedPreferences.getLong(HEART_BEAT_COUNT_TAG, 0L);
        }
        java.util.HashSet hashSet = new java.util.HashSet(this.firebaseSharedPreferences.getStringSet(str, new java.util.HashSet()));
        hashSet.add(formattedDate);
        this.firebaseSharedPreferences.edit().putStringSet(str, hashSet).putLong(HEART_BEAT_COUNT_TAG, j2 + 1).putString(LAST_STORED_DATE, formattedDate).commit();
    }

    private synchronized void cleanUpStoredHeartBeats() {
        long j = this.firebaseSharedPreferences.getLong(HEART_BEAT_COUNT_TAG, 0L);
        java.lang.String key = "";
        java.lang.String str = null;
        for (java.util.Map.Entry<java.lang.String, ?> entry : this.firebaseSharedPreferences.getAll().entrySet()) {
            if (entry.getValue() instanceof java.util.Set) {
                for (java.lang.String str2 : (java.util.Set) entry.getValue()) {
                    if (str == null || str.compareTo(str2) > 0) {
                        key = entry.getKey();
                        str = str2;
                    }
                }
            }
        }
        java.util.HashSet hashSet = new java.util.HashSet(this.firebaseSharedPreferences.getStringSet(key, new java.util.HashSet()));
        hashSet.remove(str);
        this.firebaseSharedPreferences.edit().putStringSet(key, hashSet).putLong(HEART_BEAT_COUNT_TAG, j - 1).commit();
    }

    synchronized long getLastGlobalHeartBeat() {
        return this.firebaseSharedPreferences.getLong(GLOBAL, -1L);
    }

    synchronized void updateGlobalHeartBeat(long j) {
        this.firebaseSharedPreferences.edit().putLong(GLOBAL, j).commit();
    }

    synchronized boolean isSameDateUtc(long j, long j2) {
        return getFormattedDate(j).equals(getFormattedDate(j2));
    }

    synchronized boolean shouldSendSdkHeartBeat(java.lang.String str, long j) {
        if (this.firebaseSharedPreferences.contains(str)) {
            if (isSameDateUtc(this.firebaseSharedPreferences.getLong(str, -1L), j)) {
                return false;
            }
            this.firebaseSharedPreferences.edit().putLong(str, j).commit();
            return true;
        }
        this.firebaseSharedPreferences.edit().putLong(str, j).commit();
        return true;
    }

    synchronized boolean shouldSendGlobalHeartBeat(long j) {
        return shouldSendSdkHeartBeat(GLOBAL, j);
    }
}
