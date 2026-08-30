package com.unity3d.services.core.preferences;

/* JADX INFO: loaded from: classes6.dex */
public class AndroidPreferences {
    public static boolean hasKey(java.lang.String str, java.lang.String str2) {
        android.content.SharedPreferences sharedPreferences = com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getSharedPreferences(str, 0);
        return sharedPreferences != null && sharedPreferences.contains(str2);
    }

    public static java.lang.String getString(java.lang.String str, java.lang.String str2) {
        android.content.SharedPreferences sharedPreferences = com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getSharedPreferences(str, 0);
        if (sharedPreferences != null && sharedPreferences.contains(str2)) {
            try {
                return sharedPreferences.getString(str2, "");
            } catch (java.lang.ClassCastException e) {
                com.unity3d.services.core.log.DeviceLog.warning("Unity Ads failed to cast " + str2 + ": " + e.getMessage());
            }
        }
        return null;
    }

    public static java.lang.Integer getInteger(java.lang.String str, java.lang.String str2) {
        android.content.SharedPreferences sharedPreferences = com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getSharedPreferences(str, 0);
        if (sharedPreferences != null && sharedPreferences.contains(str2)) {
            try {
                return java.lang.Integer.valueOf(sharedPreferences.getInt(str2, -1));
            } catch (java.lang.ClassCastException e) {
                com.unity3d.services.core.log.DeviceLog.warning("Unity Ads failed to cast " + str2 + ": " + e.getMessage());
            }
        }
        return null;
    }

    public static java.lang.Long getLong(java.lang.String str, java.lang.String str2) {
        android.content.SharedPreferences sharedPreferences = com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getSharedPreferences(str, 0);
        if (sharedPreferences != null && sharedPreferences.contains(str2)) {
            try {
                return java.lang.Long.valueOf(sharedPreferences.getLong(str2, -1L));
            } catch (java.lang.ClassCastException e) {
                com.unity3d.services.core.log.DeviceLog.warning("Unity Ads failed to cast " + str2 + ": " + e.getMessage());
            }
        }
        return null;
    }

    public static java.lang.Boolean getBoolean(java.lang.String str, java.lang.String str2) {
        android.content.SharedPreferences sharedPreferences = com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getSharedPreferences(str, 0);
        if (sharedPreferences != null && sharedPreferences.contains(str2)) {
            try {
                return java.lang.Boolean.valueOf(sharedPreferences.getBoolean(str2, false));
            } catch (java.lang.ClassCastException e) {
                com.unity3d.services.core.log.DeviceLog.warning("Unity Ads failed to cast " + str2 + ": " + e.getMessage());
            }
        }
        return null;
    }

    public static java.lang.Float getFloat(java.lang.String str, java.lang.String str2) {
        android.content.SharedPreferences sharedPreferences = com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getSharedPreferences(str, 0);
        if (sharedPreferences != null && sharedPreferences.contains(str2)) {
            try {
                return java.lang.Float.valueOf(sharedPreferences.getFloat(str2, Float.NaN));
            } catch (java.lang.ClassCastException e) {
                com.unity3d.services.core.log.DeviceLog.warning("Unity Ads failed to cast " + str2 + ": " + e.getMessage());
            }
        }
        return null;
    }

    public static void setString(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.content.SharedPreferences sharedPreferences = com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getSharedPreferences(str, 0);
        if (sharedPreferences != null) {
            android.content.SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString(str2, str3);
            editorEdit.commit();
        }
    }

    public static void setInteger(java.lang.String str, java.lang.String str2, java.lang.Integer num) {
        android.content.SharedPreferences sharedPreferences = com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getSharedPreferences(str, 0);
        if (sharedPreferences != null) {
            android.content.SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putInt(str2, num.intValue());
            editorEdit.commit();
        }
    }

    public static void setLong(java.lang.String str, java.lang.String str2, java.lang.Long l) {
        android.content.SharedPreferences sharedPreferences = com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getSharedPreferences(str, 0);
        if (sharedPreferences != null) {
            android.content.SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putLong(str2, l.longValue());
            editorEdit.commit();
        }
    }

    public static void setBoolean(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        android.content.SharedPreferences sharedPreferences = com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getSharedPreferences(str, 0);
        if (sharedPreferences != null) {
            android.content.SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putBoolean(str2, bool.booleanValue());
            editorEdit.commit();
        }
    }

    public static void setFloat(java.lang.String str, java.lang.String str2, java.lang.Double d) {
        android.content.SharedPreferences sharedPreferences = com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getSharedPreferences(str, 0);
        if (sharedPreferences != null) {
            android.content.SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putFloat(str2, d.floatValue());
            editorEdit.commit();
        }
    }

    public static void removeKey(java.lang.String str, java.lang.String str2) {
        android.content.SharedPreferences sharedPreferences = com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getSharedPreferences(str, 0);
        if (sharedPreferences != null) {
            android.content.SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.remove(str2);
            editorEdit.commit();
        }
    }
}
