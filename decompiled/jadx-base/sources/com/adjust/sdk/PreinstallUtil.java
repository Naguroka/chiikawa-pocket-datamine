package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class PreinstallUtil {
    private static final long ALL_LOCATION_BITMASK = 255;
    private static final long CONTENT_PROVIDER_BITMASK = 16;
    private static final long CONTENT_PROVIDER_INTENT_ACTION_BITMASK = 32;
    private static final long CONTENT_PROVIDER_NO_PERMISSION_BITMASK = 128;
    private static final long FILE_SYSTEM_BITMASK = 64;
    private static final long SYSTEM_PROPERTY_BITMASK = 1;
    private static final long SYSTEM_PROPERTY_PATH_BITMASK = 4;
    private static final long SYSTEM_PROPERTY_PATH_REFLECTION_BITMASK = 8;
    private static final long SYSTEM_PROPERTY_REFLECTION_BITMASK = 2;

    public static java.lang.String getPayloadFromContentProviderDefault(android.content.Context context, java.lang.String str, com.adjust.sdk.ILogger iLogger) {
        if (com.adjust.sdk.Util.resolveContentProvider(context, com.adjust.sdk.Constants.ADJUST_PREINSTALL_CONTENT_URI_AUTHORITY)) {
            return readContentProvider(context, com.adjust.sdk.Util.formatString("content://%s/%s", com.adjust.sdk.Constants.ADJUST_PREINSTALL_CONTENT_URI_AUTHORITY, com.adjust.sdk.Constants.ADJUST_PREINSTALL_CONTENT_URI_PATH), str, iLogger);
        }
        return null;
    }

    public static java.lang.String getPayloadFromFileSystem(java.lang.String str, java.lang.String str2, com.adjust.sdk.ILogger iLogger) {
        java.lang.String fileContent = readFileContent(com.adjust.sdk.Constants.ADJUST_PREINSTALL_FILE_SYSTEM_PATH, iLogger);
        if (fileContent == null || fileContent.isEmpty()) {
            if (str2 != null && !str2.isEmpty()) {
                fileContent = readFileContent(str2, iLogger);
            }
            if (fileContent == null || fileContent.isEmpty()) {
                return null;
            }
        }
        return readPayloadFromJsonString(fileContent, str, iLogger);
    }

    public static java.lang.String getPayloadFromSystemProperty(java.lang.String str, com.adjust.sdk.ILogger iLogger) {
        return readSystemProperty(com.adjust.sdk.Constants.ADJUST_PREINSTALL_SYSTEM_PROPERTY_PREFIX + str, iLogger);
    }

    public static java.lang.String getPayloadFromSystemPropertyFilePath(java.lang.String str, com.adjust.sdk.ILogger iLogger) {
        java.lang.String fileContent;
        java.lang.String systemProperty = readSystemProperty(com.adjust.sdk.Constants.ADJUST_PREINSTALL_SYSTEM_PROPERTY_PATH, iLogger);
        if (systemProperty == null || systemProperty.isEmpty() || (fileContent = readFileContent(systemProperty, iLogger)) == null || fileContent.isEmpty()) {
            return null;
        }
        return readPayloadFromJsonString(fileContent, str, iLogger);
    }

    public static java.lang.String getPayloadFromSystemPropertyFilePathReflection(java.lang.String str, com.adjust.sdk.ILogger iLogger) {
        java.lang.String fileContent;
        java.lang.String systemPropertyReflection = readSystemPropertyReflection(com.adjust.sdk.Constants.ADJUST_PREINSTALL_SYSTEM_PROPERTY_PATH, iLogger);
        if (systemPropertyReflection == null || systemPropertyReflection.isEmpty() || (fileContent = readFileContent(systemPropertyReflection, iLogger)) == null || fileContent.isEmpty()) {
            return null;
        }
        return readPayloadFromJsonString(fileContent, str, iLogger);
    }

    public static java.lang.String getPayloadFromSystemPropertyReflection(java.lang.String str, com.adjust.sdk.ILogger iLogger) {
        return readSystemPropertyReflection(com.adjust.sdk.Constants.ADJUST_PREINSTALL_SYSTEM_PROPERTY_PREFIX + str, iLogger);
    }

    public static java.util.List<java.lang.String> getPayloadsFromContentProviderIntentAction(android.content.Context context, java.lang.String str, com.adjust.sdk.ILogger iLogger) {
        return readContentProviderIntentAction(context, str, "android.permission.INSTALL_PACKAGES", iLogger);
    }

    public static java.util.List<java.lang.String> getPayloadsFromContentProviderNoPermission(android.content.Context context, java.lang.String str, com.adjust.sdk.ILogger iLogger) {
        return readContentProviderIntentAction(context, str, null, iLogger);
    }

    public static boolean hasAllLocationsBeenRead(long j) {
        return (j & ALL_LOCATION_BITMASK) == ALL_LOCATION_BITMASK;
    }

    public static boolean hasNotBeenRead(java.lang.String str, long j) {
        str.getClass();
        str.hashCode();
        switch (str) {
            case "content_provider_intent_action":
                return (j & 32) != 32;
            case "system_properties_path_reflection":
                return (j & 8) != 8;
            case "content_provider":
                return (j & 16) != 16;
            case "system_properties_path":
                return (j & 4) != 4;
            case "system_properties_reflection":
                return (j & 2) != 2;
            case "system_properties":
                return (j & 1) != 1;
            case "file_system":
                return (j & 64) != 64;
            case "content_provider_no_permission":
                return (j & 128) != 128;
            default:
                return false;
        }
    }

    public static long markAsRead(java.lang.String str, long j) {
        long j2;
        str.getClass();
        str.hashCode();
        switch (str) {
            case "content_provider_intent_action":
                j2 = 32;
                break;
            case "system_properties_path_reflection":
                j2 = 8;
                break;
            case "content_provider":
                j2 = 16;
                break;
            case "system_properties_path":
                j2 = 4;
                break;
            case "system_properties_reflection":
                j2 = 2;
                break;
            case "system_properties":
                j2 = 1;
                break;
            case "file_system":
                j2 = 64;
                break;
            case "content_provider_no_permission":
                j2 = 128;
                break;
            default:
                return j;
        }
        return j | j2;
    }

    private static java.lang.String readContentProvider(android.content.Context context, java.lang.String str, java.lang.String str2, com.adjust.sdk.ILogger iLogger) {
        try {
            android.database.Cursor cursorQuery = context.getContentResolver().query(android.net.Uri.parse(str), new java.lang.String[]{"encrypted_data"}, "package_name=?", new java.lang.String[]{str2}, null);
            if (cursorQuery == null) {
                iLogger.debug("Read content provider cursor null content uri [%s]", str);
                return null;
            }
            if (cursorQuery.moveToFirst()) {
                java.lang.String string = cursorQuery.getString(0);
                cursorQuery.close();
                return string;
            }
            iLogger.debug("Read content provider cursor empty content uri [%s]", str);
            cursorQuery.close();
            return null;
        } catch (java.lang.Exception e) {
            iLogger.error("Exception read content provider uri [%s] error [%s]", str, e.getMessage());
            return null;
        }
    }

    private static java.util.List<java.lang.String> readContentProviderIntentAction(android.content.Context context, java.lang.String str, java.lang.String str2, com.adjust.sdk.ILogger iLogger) {
        java.lang.String str3;
        java.lang.String contentProvider;
        java.util.List<android.content.pm.ResolveInfo> listQueryIntentContentProviders = android.os.Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().queryIntentContentProviders(new android.content.Intent(com.adjust.sdk.Constants.ADJUST_PREINSTALL_CONTENT_PROVIDER_INTENT_ACTION), android.content.pm.PackageManager.ResolveInfoFlags.of(0L)) : context.getPackageManager().queryIntentContentProviders(new android.content.Intent(com.adjust.sdk.Constants.ADJUST_PREINSTALL_CONTENT_PROVIDER_INTENT_ACTION), 0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.content.pm.ResolveInfo resolveInfo : listQueryIntentContentProviders) {
            if ((str2 == null || context.getPackageManager().checkPermission(str2, resolveInfo.providerInfo.packageName) == 0) && (str3 = resolveInfo.providerInfo.authority) != null && !str3.isEmpty() && (contentProvider = readContentProvider(context, com.adjust.sdk.Util.formatString("content://%s/%s", str3, com.adjust.sdk.Constants.ADJUST_PREINSTALL_CONTENT_URI_PATH), str, iLogger)) != null && !contentProvider.isEmpty()) {
                arrayList.add(contentProvider);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    private static java.lang.String readFileContent(java.lang.String str, com.adjust.sdk.ILogger iLogger) {
        java.io.File file = new java.io.File(str);
        if (file.exists() && file.isFile() && file.canRead()) {
            try {
                int length = (int) file.length();
                if (length <= 0) {
                    iLogger.debug("Read file content empty file", new java.lang.Object[0]);
                    return null;
                }
                byte[] bArr = new byte[length];
                java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
                try {
                    fileInputStream.read(bArr);
                    return new java.lang.String(bArr);
                } catch (java.lang.Exception e) {
                    iLogger.error("Exception read file input stream error [%s]", e.getMessage());
                    return null;
                } finally {
                    fileInputStream.close();
                }
            } catch (java.lang.Exception e2) {
                iLogger.error("Exception read file content error [%s]", e2.getMessage());
            }
        }
        return null;
    }

    private static java.lang.String readPayloadFromJsonString(java.lang.String str, java.lang.String str2, com.adjust.sdk.ILogger iLogger) {
        try {
            return new org.json.JSONObject(str.trim()).optString(str2);
        } catch (java.lang.Exception e) {
            iLogger.error("Exception read payload from json string error [%s]", e.getMessage());
            return null;
        }
    }

    private static java.lang.String readSystemProperty(java.lang.String str, com.adjust.sdk.ILogger iLogger) {
        try {
            return java.lang.System.getProperty(str);
        } catch (java.lang.Exception e) {
            iLogger.error("Exception read system property key [%s] error [%s]", str, e.getMessage());
            return null;
        }
    }

    private static java.lang.String readSystemPropertyReflection(java.lang.String str, com.adjust.sdk.ILogger iLogger) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.os.SystemProperties");
            return (java.lang.String) cls.getDeclaredMethod("get", java.lang.String.class).invoke(cls, str);
        } catch (java.lang.Exception e) {
            iLogger.error("Exception read system property using reflection key [%s] error [%s]", str, e.getMessage());
            return null;
        }
    }
}
