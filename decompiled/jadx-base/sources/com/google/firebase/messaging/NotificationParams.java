package com.google.firebase.messaging;

/* JADX INFO: loaded from: classes5.dex */
public class NotificationParams {
    private static final int COLOR_TRANSPARENT_IN_HEX = -16777216;
    private static final int EMPTY_JSON_ARRAY_LENGTH = 1;
    private static final java.lang.String TAG = "NotificationParams";
    private static final int VISIBILITY_MAX = 1;
    private static final int VISIBILITY_MIN = -1;
    private final android.os.Bundle data;

    public NotificationParams(android.os.Bundle bundle) {
        if (bundle == null) {
            throw new java.lang.NullPointerException("data");
        }
        this.data = new android.os.Bundle(bundle);
    }

    java.lang.Integer getNotificationCount() {
        java.lang.Integer integer = getInteger(com.google.firebase.messaging.Constants.MessageNotificationKeys.NOTIFICATION_COUNT);
        if (integer == null) {
            return null;
        }
        if (integer.intValue() >= 0) {
            return integer;
        }
        android.util.Log.w(com.google.firebase.messaging.Constants.TAG, "notificationCount is invalid: " + integer + ". Skipping setting notificationCount.");
        return null;
    }

    java.lang.Integer getNotificationPriority() {
        java.lang.Integer integer = getInteger(com.google.firebase.messaging.Constants.MessageNotificationKeys.NOTIFICATION_PRIORITY);
        if (integer == null) {
            return null;
        }
        if (integer.intValue() >= -2 && integer.intValue() <= 2) {
            return integer;
        }
        android.util.Log.w(com.google.firebase.messaging.Constants.TAG, "notificationPriority is invalid " + integer + ". Skipping setting notificationPriority.");
        return null;
    }

    java.lang.Integer getVisibility() {
        java.lang.Integer integer = getInteger(com.google.firebase.messaging.Constants.MessageNotificationKeys.VISIBILITY);
        if (integer == null) {
            return null;
        }
        if (integer.intValue() >= -1 && integer.intValue() <= 1) {
            return integer;
        }
        android.util.Log.w(TAG, "visibility is invalid: " + integer + ". Skipping setting visibility.");
        return null;
    }

    public java.lang.String getString(java.lang.String str) {
        return this.data.getString(normalizePrefix(str));
    }

    private java.lang.String normalizePrefix(java.lang.String str) {
        if (!this.data.containsKey(str) && str.startsWith(com.google.firebase.messaging.Constants.MessageNotificationKeys.NOTIFICATION_PREFIX)) {
            java.lang.String strKeyWithOldPrefix = keyWithOldPrefix(str);
            if (this.data.containsKey(strKeyWithOldPrefix)) {
                return strKeyWithOldPrefix;
            }
        }
        return str;
    }

    public boolean getBoolean(java.lang.String str) {
        java.lang.String string = getString(str);
        return "1".equals(string) || java.lang.Boolean.parseBoolean(string);
    }

    public java.lang.Integer getInteger(java.lang.String str) {
        java.lang.String string = getString(str);
        if (android.text.TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return java.lang.Integer.valueOf(java.lang.Integer.parseInt(string));
        } catch (java.lang.NumberFormatException unused) {
            android.util.Log.w(TAG, "Couldn't parse value of " + userFriendlyKey(str) + "(" + string + ") into an int");
            return null;
        }
    }

    public java.lang.Long getLong(java.lang.String str) {
        java.lang.String string = getString(str);
        if (android.text.TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return java.lang.Long.valueOf(java.lang.Long.parseLong(string));
        } catch (java.lang.NumberFormatException unused) {
            android.util.Log.w(TAG, "Couldn't parse value of " + userFriendlyKey(str) + "(" + string + ") into a long");
            return null;
        }
    }

    public java.lang.String getLocalizationResourceForKey(java.lang.String str) {
        return getString(str + com.google.firebase.messaging.Constants.MessageNotificationKeys.TEXT_RESOURCE_SUFFIX);
    }

    public java.lang.Object[] getLocalizationArgsForKey(java.lang.String str) {
        org.json.JSONArray jSONArray = getJSONArray(str + com.google.firebase.messaging.Constants.MessageNotificationKeys.TEXT_ARGS_SUFFIX);
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        java.lang.String[] strArr = new java.lang.String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = jSONArray.optString(i);
        }
        return strArr;
    }

    public org.json.JSONArray getJSONArray(java.lang.String str) {
        java.lang.String string = getString(str);
        if (android.text.TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return new org.json.JSONArray(string);
        } catch (org.json.JSONException unused) {
            android.util.Log.w(TAG, "Malformed JSON for key " + userFriendlyKey(str) + ": " + string + ", falling back to default");
            return null;
        }
    }

    private static java.lang.String userFriendlyKey(java.lang.String str) {
        return str.startsWith(com.google.firebase.messaging.Constants.MessageNotificationKeys.NOTIFICATION_PREFIX) ? str.substring(6) : str;
    }

    public android.net.Uri getLink() {
        java.lang.String string = getString(com.google.firebase.messaging.Constants.MessageNotificationKeys.LINK_ANDROID);
        if (android.text.TextUtils.isEmpty(string)) {
            string = getString(com.google.firebase.messaging.Constants.MessageNotificationKeys.LINK);
        }
        if (android.text.TextUtils.isEmpty(string)) {
            return null;
        }
        return android.net.Uri.parse(string);
    }

    public java.lang.String getSoundResourceName() {
        java.lang.String string = getString(com.google.firebase.messaging.Constants.MessageNotificationKeys.SOUND_2);
        return android.text.TextUtils.isEmpty(string) ? getString(com.google.firebase.messaging.Constants.MessageNotificationKeys.SOUND) : string;
    }

    public long[] getVibrateTimings() {
        org.json.JSONArray jSONArray = getJSONArray(com.google.firebase.messaging.Constants.MessageNotificationKeys.VIBRATE_TIMINGS);
        if (jSONArray == null) {
            return null;
        }
        try {
            if (jSONArray.length() <= 1) {
                throw new org.json.JSONException("vibrateTimings have invalid length");
            }
            int length = jSONArray.length();
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                jArr[i] = jSONArray.optLong(i);
            }
            return jArr;
        } catch (java.lang.NumberFormatException | org.json.JSONException unused) {
            android.util.Log.w(TAG, "User defined vibrateTimings is invalid: " + jSONArray + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    int[] getLightSettings() {
        org.json.JSONArray jSONArray = getJSONArray(com.google.firebase.messaging.Constants.MessageNotificationKeys.LIGHT_SETTINGS);
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (jSONArray.length() != 3) {
                throw new org.json.JSONException("lightSettings don't have all three fields");
            }
            iArr[0] = getLightColor(jSONArray.optString(0));
            iArr[1] = jSONArray.optInt(1);
            iArr[2] = jSONArray.optInt(2);
            return iArr;
        } catch (java.lang.IllegalArgumentException e) {
            android.util.Log.w(TAG, "LightSettings is invalid: " + jSONArray + ". " + e.getMessage() + ". Skipping setting LightSettings");
            return null;
        } catch (org.json.JSONException unused) {
            android.util.Log.w(TAG, "LightSettings is invalid: " + jSONArray + ". Skipping setting LightSettings");
            return null;
        }
    }

    public android.os.Bundle paramsWithReservedKeysRemoved() {
        android.os.Bundle bundle = new android.os.Bundle(this.data);
        for (java.lang.String str : this.data.keySet()) {
            if (isReservedKey(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public android.os.Bundle paramsForAnalyticsIntent() {
        android.os.Bundle bundle = new android.os.Bundle(this.data);
        for (java.lang.String str : this.data.keySet()) {
            if (!isAnalyticsKey(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public java.lang.String getLocalizedString(android.content.res.Resources resources, java.lang.String str, java.lang.String str2) {
        java.lang.String localizationResourceForKey = getLocalizationResourceForKey(str2);
        if (android.text.TextUtils.isEmpty(localizationResourceForKey)) {
            return null;
        }
        int identifier = resources.getIdentifier(localizationResourceForKey, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_STRING, str);
        if (identifier == 0) {
            android.util.Log.w(TAG, userFriendlyKey(str2 + com.google.firebase.messaging.Constants.MessageNotificationKeys.TEXT_RESOURCE_SUFFIX) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        java.lang.Object[] localizationArgsForKey = getLocalizationArgsForKey(str2);
        if (localizationArgsForKey == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, localizationArgsForKey);
        } catch (java.util.MissingFormatArgumentException e) {
            android.util.Log.w(TAG, "Missing format argument for " + userFriendlyKey(str2) + ": " + java.util.Arrays.toString(localizationArgsForKey) + " Default value will be used.", e);
            return null;
        }
    }

    public java.lang.String getPossiblyLocalizedString(android.content.res.Resources resources, java.lang.String str, java.lang.String str2) {
        java.lang.String string = getString(str2);
        return !android.text.TextUtils.isEmpty(string) ? string : getLocalizedString(resources, str, str2);
    }

    public boolean hasImage() {
        return !android.text.TextUtils.isEmpty(getString(com.google.firebase.messaging.Constants.MessageNotificationKeys.IMAGE_URL));
    }

    public java.lang.String getNotificationChannelId() {
        return getString(com.google.firebase.messaging.Constants.MessageNotificationKeys.CHANNEL);
    }

    private static boolean isAnalyticsKey(java.lang.String str) {
        return str.startsWith(com.google.firebase.messaging.Constants.AnalyticsKeys.PREFIX) || str.equals("from");
    }

    private static boolean isReservedKey(java.lang.String str) {
        return str.startsWith(com.google.firebase.messaging.Constants.MessagePayloadKeys.RESERVED_CLIENT_LIB_PREFIX) || str.startsWith(com.google.firebase.messaging.Constants.MessageNotificationKeys.NOTIFICATION_PREFIX) || str.startsWith(com.google.firebase.messaging.Constants.MessageNotificationKeys.NOTIFICATION_PREFIX_OLD);
    }

    private static int getLightColor(java.lang.String str) {
        int color = android.graphics.Color.parseColor(str);
        if (color != -16777216) {
            return color;
        }
        throw new java.lang.IllegalArgumentException("Transparent color is invalid");
    }

    public boolean isNotification() {
        return getBoolean(com.google.firebase.messaging.Constants.MessageNotificationKeys.ENABLE_NOTIFICATION);
    }

    public static boolean isNotification(android.os.Bundle bundle) {
        return "1".equals(bundle.getString(com.google.firebase.messaging.Constants.MessageNotificationKeys.ENABLE_NOTIFICATION)) || "1".equals(bundle.getString(keyWithOldPrefix(com.google.firebase.messaging.Constants.MessageNotificationKeys.ENABLE_NOTIFICATION)));
    }

    private static java.lang.String keyWithOldPrefix(java.lang.String str) {
        return !str.startsWith(com.google.firebase.messaging.Constants.MessageNotificationKeys.NOTIFICATION_PREFIX) ? str : str.replace(com.google.firebase.messaging.Constants.MessageNotificationKeys.NOTIFICATION_PREFIX, com.google.firebase.messaging.Constants.MessageNotificationKeys.NOTIFICATION_PREFIX_OLD);
    }
}
