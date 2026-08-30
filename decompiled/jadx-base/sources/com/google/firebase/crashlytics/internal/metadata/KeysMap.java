package com.google.firebase.crashlytics.internal.metadata;

/* JADX INFO: loaded from: classes5.dex */
class KeysMap {
    private final java.util.Map<java.lang.String, java.lang.String> keys = new java.util.HashMap();
    private final int maxEntries;
    private final int maxEntryLength;

    public KeysMap(int i, int i2) {
        this.maxEntries = i;
        this.maxEntryLength = i2;
    }

    public synchronized java.util.Map<java.lang.String, java.lang.String> getKeys() {
        return java.util.Collections.unmodifiableMap(new java.util.HashMap(this.keys));
    }

    public synchronized boolean setKey(java.lang.String str, java.lang.String str2) {
        java.lang.String strSanitizeKey = sanitizeKey(str);
        if (this.keys.size() >= this.maxEntries && !this.keys.containsKey(strSanitizeKey)) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().w("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.maxEntries);
            return false;
        }
        java.lang.String strSanitizeString = sanitizeString(str2, this.maxEntryLength);
        if (com.google.firebase.crashlytics.internal.common.CommonUtils.nullSafeEquals(this.keys.get(strSanitizeKey), strSanitizeString)) {
            return false;
        }
        java.util.Map<java.lang.String, java.lang.String> map = this.keys;
        if (str2 == null) {
            strSanitizeString = "";
        }
        map.put(strSanitizeKey, strSanitizeString);
        return true;
    }

    public synchronized void setKeys(java.util.Map<java.lang.String, java.lang.String> map) {
        int i = 0;
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            java.lang.String strSanitizeKey = sanitizeKey(entry.getKey());
            if (this.keys.size() < this.maxEntries || this.keys.containsKey(strSanitizeKey)) {
                java.lang.String value = entry.getValue();
                this.keys.put(strSanitizeKey, value == null ? "" : sanitizeString(value, this.maxEntryLength));
            } else {
                i++;
            }
        }
        if (i > 0) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().w("Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.maxEntries);
        }
    }

    private java.lang.String sanitizeKey(java.lang.String str) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("Custom attribute key must not be null.");
        }
        return sanitizeString(str, this.maxEntryLength);
    }

    public static java.lang.String sanitizeString(java.lang.String str, int i) {
        if (str == null) {
            return str;
        }
        java.lang.String strTrim = str.trim();
        return strTrim.length() > i ? strTrim.substring(0, i) : strTrim;
    }
}
