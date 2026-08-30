package com.unity.androidnotifications;

/* JADX INFO: loaded from: classes3.dex */
class UnityNotificationUtilities {
    private static final int INTENT_SERIALIZATION_VERSION = 0;
    private static final int NOTIFICATION_SERIALIZATION_VERSION = 3;
    static final java.lang.String SAVED_NOTIFICATION_FALLBACK_KEY = "fallback.data";
    static final java.lang.String SAVED_NOTIFICATION_PRIMARY_KEY = "data";
    static final byte[] UNITY_MAGIC_NUMBER = {85, 77, 78, 78};
    private static final byte[] UNITY_MAGIC_NUMBER_PARCELLED = {85, 77, 78, 80};

    UnityNotificationUtilities() {
    }

    protected static int findResourceIdInContextByName(android.content.Context context, java.lang.String str) {
        if (str == null) {
            return 0;
        }
        try {
            android.content.res.Resources resources = context.getResources();
            if (resources != null) {
                int identifier = resources.getIdentifier(str, "mipmap", context.getPackageName());
                return identifier == 0 ? resources.getIdentifier(str, "drawable", context.getPackageName()) : identifier;
            }
        } catch (android.content.res.Resources.NotFoundException unused) {
        }
        return 0;
    }

    protected static void serializeNotification(android.content.SharedPreferences sharedPreferences, android.app.Notification notification, boolean z) {
        java.lang.String strEncodeToString;
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(byteArrayOutputStream);
            if (z) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra(com.unity.androidnotifications.UnityNotificationManager.KEY_NOTIFICATION, notification);
                if (!serializeNotificationParcel(intent, dataOutputStream)) {
                    return;
                }
                dataOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                strEncodeToString = android.util.Base64.encodeToString(byteArray, 0, byteArray.length, 0);
            } else {
                if (!serializeNotificationCustom(notification, dataOutputStream)) {
                    return;
                }
                dataOutputStream.flush();
                byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                strEncodeToString = android.util.Base64.encodeToString(byteArray2, 0, byteArray2.length, 0);
            }
            android.content.SharedPreferences.Editor editorClear = sharedPreferences.edit().clear();
            editorClear.putString("data", strEncodeToString);
            editorClear.apply();
        } catch (java.lang.Exception e) {
            android.util.Log.e("UnityNotifications", "Failed to serialize notification", e);
        }
    }

    static boolean serializeNotificationParcel(android.content.Intent intent, java.io.DataOutputStream dataOutputStream) {
        try {
            byte[] bArrSerializeParcelable = serializeParcelable(intent);
            if (bArrSerializeParcelable != null && bArrSerializeParcelable.length != 0) {
                dataOutputStream.write(UNITY_MAGIC_NUMBER_PARCELLED);
                dataOutputStream.writeInt(0);
                dataOutputStream.writeInt(bArrSerializeParcelable.length);
                dataOutputStream.write(bArrSerializeParcelable);
                return true;
            }
            return false;
        } catch (java.lang.Exception e) {
            android.util.Log.e("UnityNotifications", "Failed to serialize notification as Parcel", e);
            return false;
        } catch (java.lang.OutOfMemoryError e2) {
            android.util.Log.e("UnityNotifications", "Failed to serialize notification as Parcel", e2);
            return false;
        }
    }

    private static boolean serializeNotificationCustom(android.app.Notification notification, java.io.DataOutputStream dataOutputStream) {
        try {
            dataOutputStream.write(UNITY_MAGIC_NUMBER);
            dataOutputStream.writeInt(3);
            boolean z = notification.extras.getBoolean(androidx.core.app.NotificationCompat.EXTRA_SHOW_WHEN, false);
            dataOutputStream.writeInt(notification.extras.getInt("id"));
            serializeString(dataOutputStream, notification.extras.getString(androidx.core.app.NotificationCompat.EXTRA_TITLE));
            serializeString(dataOutputStream, notification.extras.getString(androidx.core.app.NotificationCompat.EXTRA_TEXT));
            serializeString(dataOutputStream, notification.extras.getString(com.unity.androidnotifications.UnityNotificationManager.KEY_SMALL_ICON));
            serializeString(dataOutputStream, notification.extras.getString(com.unity.androidnotifications.UnityNotificationManager.KEY_LARGE_ICON));
            dataOutputStream.writeLong(notification.extras.getLong(com.unity.androidnotifications.UnityNotificationManager.KEY_FIRE_TIME, -1L));
            dataOutputStream.writeLong(notification.extras.getLong(com.unity.androidnotifications.UnityNotificationManager.KEY_REPEAT_INTERVAL, -1L));
            serializeString(dataOutputStream, notification.extras.getString(androidx.core.app.NotificationCompat.EXTRA_BIG_TEXT));
            dataOutputStream.writeBoolean(notification.extras.getBoolean(androidx.core.app.NotificationCompat.EXTRA_SHOW_CHRONOMETER, false));
            dataOutputStream.writeBoolean(z);
            serializeString(dataOutputStream, notification.extras.getString("data"));
            dataOutputStream.writeBoolean(notification.extras.getBoolean(com.unity.androidnotifications.UnityNotificationManager.KEY_SHOW_IN_FOREGROUND, true));
            java.lang.String string = notification.extras.getString(com.unity.androidnotifications.UnityNotificationManager.KEY_BIG_PICTURE);
            serializeString(dataOutputStream, string);
            if (string != null && string.length() > 0) {
                serializeString(dataOutputStream, notification.extras.getString(com.unity.androidnotifications.UnityNotificationManager.KEY_BIG_LARGE_ICON));
                serializeString(dataOutputStream, notification.extras.getString(com.unity.androidnotifications.UnityNotificationManager.KEY_BIG_CONTENT_TITLE));
                serializeString(dataOutputStream, notification.extras.getString(com.unity.androidnotifications.UnityNotificationManager.KEY_BIG_CONTENT_DESCRIPTION));
                serializeString(dataOutputStream, notification.extras.getString(com.unity.androidnotifications.UnityNotificationManager.KEY_BIG_SUMMARY_TEXT));
                dataOutputStream.writeBoolean(notification.extras.getBoolean(com.unity.androidnotifications.UnityNotificationManager.KEY_BIG_SHOW_WHEN_COLLAPSED, false));
            }
            serializeString(dataOutputStream, android.os.Build.VERSION.SDK_INT < 26 ? null : notification.getChannelId());
            java.lang.Integer notificationColor = com.unity.androidnotifications.UnityNotificationManager.getNotificationColor(notification);
            dataOutputStream.writeBoolean(notificationColor != null);
            if (notificationColor != null) {
                dataOutputStream.writeInt(notificationColor.intValue());
            }
            dataOutputStream.writeInt(notification.number);
            dataOutputStream.writeBoolean((notification.flags & 16) != 0);
            serializeString(dataOutputStream, notification.getGroup());
            dataOutputStream.writeBoolean((notification.flags & 512) != 0);
            dataOutputStream.writeInt(com.unity.androidnotifications.UnityNotificationManager.getNotificationGroupAlertBehavior(notification));
            serializeString(dataOutputStream, notification.getSortKey());
            if (z) {
                dataOutputStream.writeLong(notification.when);
            }
            return true;
        } catch (java.lang.Exception e) {
            android.util.Log.e("UnityNotifications", "Failed to serialize notification", e);
            return false;
        }
    }

    static void serializeString(java.io.DataOutputStream dataOutputStream, java.lang.String str) throws java.io.IOException {
        if (str == null || str.length() == 0) {
            dataOutputStream.writeInt(0);
            return;
        }
        byte[] bytes = str.getBytes(java.nio.charset.StandardCharsets.UTF_8);
        dataOutputStream.writeInt(bytes.length);
        dataOutputStream.write(bytes);
    }

    static byte[] serializeParcelable(android.os.Parcelable parcelable) {
        try {
            android.os.Parcel parcelObtain = android.os.Parcel.obtain();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("obj", parcelable);
            parcelObtain.writeParcelable(bundle, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            return bArrMarshall;
        } catch (java.lang.Exception e) {
            android.util.Log.e("UnityNotifications", "Failed to serialize Parcelable", e);
            return null;
        } catch (java.lang.OutOfMemoryError e2) {
            android.util.Log.e("UnityNotifications", "Failed to serialize Parcelable", e2);
            return null;
        }
    }

    protected static java.lang.Object deserializeNotification(android.content.Context context, android.content.SharedPreferences sharedPreferences) {
        java.lang.String string = sharedPreferences.getString("data", "");
        if (string != null && string.length() > 0) {
            java.lang.Object objDeserializeNotification = deserializeNotification(context, android.util.Base64.decode(string, 0));
            if (objDeserializeNotification != null) {
                return objDeserializeNotification;
            }
            java.lang.String string2 = sharedPreferences.getString(SAVED_NOTIFICATION_FALLBACK_KEY, "");
            if (string2 != null && string2.length() > 0) {
                return deserializeNotification(context, android.util.Base64.decode(string2, 0));
            }
        }
        return null;
    }

    private static java.lang.Object deserializeNotification(android.content.Context context, byte[] bArr) {
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
        java.io.DataInputStream dataInputStream = new java.io.DataInputStream(byteArrayInputStream);
        android.app.Notification notificationDeserializeNotificationParcelable = deserializeNotificationParcelable(dataInputStream);
        if (notificationDeserializeNotificationParcelable != null) {
            return notificationDeserializeNotificationParcelable;
        }
        byteArrayInputStream.reset();
        android.app.Notification.Builder builderDeserializeNotificationCustom = deserializeNotificationCustom(context, dataInputStream);
        return builderDeserializeNotificationCustom == null ? deserializedFromOldIntent(context, bArr) : builderDeserializeNotificationCustom;
    }

    private static boolean readAndCheckMagicNumber(java.io.DataInputStream dataInputStream, byte[] bArr) {
        for (byte b : bArr) {
            try {
                if (dataInputStream.readByte() != b) {
                    return false;
                }
            } catch (java.lang.Exception unused) {
                return false;
            }
        }
        return true;
    }

    private static android.app.Notification deserializeNotificationParcelable(java.io.DataInputStream dataInputStream) {
        int i;
        try {
            if (readAndCheckMagicNumber(dataInputStream, UNITY_MAGIC_NUMBER_PARCELLED) && (i = dataInputStream.readInt()) >= 0 && i <= 0) {
                return (android.app.Notification) ((android.content.Intent) deserializeParcelable(dataInputStream)).getParcelableExtra(com.unity.androidnotifications.UnityNotificationManager.KEY_NOTIFICATION);
            }
            return null;
        } catch (java.lang.Exception e) {
            android.util.Log.e("UnityNotifications", "Failed to deserialize notification intent", e);
            return null;
        } catch (java.lang.OutOfMemoryError e2) {
            android.util.Log.e("UnityNotifications", "Failed to deserialize notification intent", e2);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x013e A[Catch: OutOfMemoryError -> 0x0233, Exception -> 0x0239, TryCatch #3 {Exception -> 0x0239, OutOfMemoryError -> 0x0233, blocks: (B:34:0x0134, B:36:0x013e, B:38:0x0145, B:40:0x0169, B:42:0x0170, B:44:0x017e, B:56:0x01c9, B:58:0x01ce, B:61:0x01d5, B:65:0x01ed, B:67:0x01f4, B:68:0x01f9, B:70:0x0205, B:72:0x020b, B:73:0x0210, B:75:0x021c, B:77:0x0222, B:79:0x0229, B:63:0x01e4, B:45:0x0184, B:47:0x019b, B:50:0x01aa, B:53:0x01b5, B:54:0x01bc), top: B:96:0x0134 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0143  */
    /* JADX WARN: Code duplicated, block: B:40:0x0169 A[Catch: OutOfMemoryError -> 0x0233, Exception -> 0x0239, TryCatch #3 {Exception -> 0x0239, OutOfMemoryError -> 0x0233, blocks: (B:34:0x0134, B:36:0x013e, B:38:0x0145, B:40:0x0169, B:42:0x0170, B:44:0x017e, B:56:0x01c9, B:58:0x01ce, B:61:0x01d5, B:65:0x01ed, B:67:0x01f4, B:68:0x01f9, B:70:0x0205, B:72:0x020b, B:73:0x0210, B:75:0x021c, B:77:0x0222, B:79:0x0229, B:63:0x01e4, B:45:0x0184, B:47:0x019b, B:50:0x01aa, B:53:0x01b5, B:54:0x01bc), top: B:96:0x0134 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x016e  */
    /* JADX WARN: Code duplicated, block: B:44:0x017e A[Catch: OutOfMemoryError -> 0x0233, Exception -> 0x0239, TryCatch #3 {Exception -> 0x0239, OutOfMemoryError -> 0x0233, blocks: (B:34:0x0134, B:36:0x013e, B:38:0x0145, B:40:0x0169, B:42:0x0170, B:44:0x017e, B:56:0x01c9, B:58:0x01ce, B:61:0x01d5, B:65:0x01ed, B:67:0x01f4, B:68:0x01f9, B:70:0x0205, B:72:0x020b, B:73:0x0210, B:75:0x021c, B:77:0x0222, B:79:0x0229, B:63:0x01e4, B:45:0x0184, B:47:0x019b, B:50:0x01aa, B:53:0x01b5, B:54:0x01bc), top: B:96:0x0134 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0184 A[Catch: OutOfMemoryError -> 0x0233, Exception -> 0x0239, TryCatch #3 {Exception -> 0x0239, OutOfMemoryError -> 0x0233, blocks: (B:34:0x0134, B:36:0x013e, B:38:0x0145, B:40:0x0169, B:42:0x0170, B:44:0x017e, B:56:0x01c9, B:58:0x01ce, B:61:0x01d5, B:65:0x01ed, B:67:0x01f4, B:68:0x01f9, B:70:0x0205, B:72:0x020b, B:73:0x0210, B:75:0x021c, B:77:0x0222, B:79:0x0229, B:63:0x01e4, B:45:0x0184, B:47:0x019b, B:50:0x01aa, B:53:0x01b5, B:54:0x01bc), top: B:96:0x0134 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x019b A[Catch: OutOfMemoryError -> 0x0233, Exception -> 0x0239, TryCatch #3 {Exception -> 0x0239, OutOfMemoryError -> 0x0233, blocks: (B:34:0x0134, B:36:0x013e, B:38:0x0145, B:40:0x0169, B:42:0x0170, B:44:0x017e, B:56:0x01c9, B:58:0x01ce, B:61:0x01d5, B:65:0x01ed, B:67:0x01f4, B:68:0x01f9, B:70:0x0205, B:72:0x020b, B:73:0x0210, B:75:0x021c, B:77:0x0222, B:79:0x0229, B:63:0x01e4, B:45:0x0184, B:47:0x019b, B:50:0x01aa, B:53:0x01b5, B:54:0x01bc), top: B:96:0x0134 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x01aa A[Catch: OutOfMemoryError -> 0x0233, Exception -> 0x0239, TryCatch #3 {Exception -> 0x0239, OutOfMemoryError -> 0x0233, blocks: (B:34:0x0134, B:36:0x013e, B:38:0x0145, B:40:0x0169, B:42:0x0170, B:44:0x017e, B:56:0x01c9, B:58:0x01ce, B:61:0x01d5, B:65:0x01ed, B:67:0x01f4, B:68:0x01f9, B:70:0x0205, B:72:0x020b, B:73:0x0210, B:75:0x021c, B:77:0x0222, B:79:0x0229, B:63:0x01e4, B:45:0x0184, B:47:0x019b, B:50:0x01aa, B:53:0x01b5, B:54:0x01bc), top: B:96:0x0134 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x01b5 A[Catch: OutOfMemoryError -> 0x0233, Exception -> 0x0239, TryCatch #3 {Exception -> 0x0239, OutOfMemoryError -> 0x0233, blocks: (B:34:0x0134, B:36:0x013e, B:38:0x0145, B:40:0x0169, B:42:0x0170, B:44:0x017e, B:56:0x01c9, B:58:0x01ce, B:61:0x01d5, B:65:0x01ed, B:67:0x01f4, B:68:0x01f9, B:70:0x0205, B:72:0x020b, B:73:0x0210, B:75:0x021c, B:77:0x0222, B:79:0x0229, B:63:0x01e4, B:45:0x0184, B:47:0x019b, B:50:0x01aa, B:53:0x01b5, B:54:0x01bc), top: B:96:0x0134 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x01c9 A[Catch: OutOfMemoryError -> 0x0233, Exception -> 0x0239, TryCatch #3 {Exception -> 0x0239, OutOfMemoryError -> 0x0233, blocks: (B:34:0x0134, B:36:0x013e, B:38:0x0145, B:40:0x0169, B:42:0x0170, B:44:0x017e, B:56:0x01c9, B:58:0x01ce, B:61:0x01d5, B:65:0x01ed, B:67:0x01f4, B:68:0x01f9, B:70:0x0205, B:72:0x020b, B:73:0x0210, B:75:0x021c, B:77:0x0222, B:79:0x0229, B:63:0x01e4, B:45:0x0184, B:47:0x019b, B:50:0x01aa, B:53:0x01b5, B:54:0x01bc), top: B:96:0x0134 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x01ce A[Catch: OutOfMemoryError -> 0x0233, Exception -> 0x0239, TryCatch #3 {Exception -> 0x0239, OutOfMemoryError -> 0x0233, blocks: (B:34:0x0134, B:36:0x013e, B:38:0x0145, B:40:0x0169, B:42:0x0170, B:44:0x017e, B:56:0x01c9, B:58:0x01ce, B:61:0x01d5, B:65:0x01ed, B:67:0x01f4, B:68:0x01f9, B:70:0x0205, B:72:0x020b, B:73:0x0210, B:75:0x021c, B:77:0x0222, B:79:0x0229, B:63:0x01e4, B:45:0x0184, B:47:0x019b, B:50:0x01aa, B:53:0x01b5, B:54:0x01bc), top: B:96:0x0134 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x01d5 A[Catch: OutOfMemoryError -> 0x0233, Exception -> 0x0239, TryCatch #3 {Exception -> 0x0239, OutOfMemoryError -> 0x0233, blocks: (B:34:0x0134, B:36:0x013e, B:38:0x0145, B:40:0x0169, B:42:0x0170, B:44:0x017e, B:56:0x01c9, B:58:0x01ce, B:61:0x01d5, B:65:0x01ed, B:67:0x01f4, B:68:0x01f9, B:70:0x0205, B:72:0x020b, B:73:0x0210, B:75:0x021c, B:77:0x0222, B:79:0x0229, B:63:0x01e4, B:45:0x0184, B:47:0x019b, B:50:0x01aa, B:53:0x01b5, B:54:0x01bc), top: B:96:0x0134 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x01e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x01e4 A[Catch: OutOfMemoryError -> 0x0233, Exception -> 0x0239, TryCatch #3 {Exception -> 0x0239, OutOfMemoryError -> 0x0233, blocks: (B:34:0x0134, B:36:0x013e, B:38:0x0145, B:40:0x0169, B:42:0x0170, B:44:0x017e, B:56:0x01c9, B:58:0x01ce, B:61:0x01d5, B:65:0x01ed, B:67:0x01f4, B:68:0x01f9, B:70:0x0205, B:72:0x020b, B:73:0x0210, B:75:0x021c, B:77:0x0222, B:79:0x0229, B:63:0x01e4, B:45:0x0184, B:47:0x019b, B:50:0x01aa, B:53:0x01b5, B:54:0x01bc), top: B:96:0x0134 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x01ed A[Catch: OutOfMemoryError -> 0x0233, Exception -> 0x0239, TryCatch #3 {Exception -> 0x0239, OutOfMemoryError -> 0x0233, blocks: (B:34:0x0134, B:36:0x013e, B:38:0x0145, B:40:0x0169, B:42:0x0170, B:44:0x017e, B:56:0x01c9, B:58:0x01ce, B:61:0x01d5, B:65:0x01ed, B:67:0x01f4, B:68:0x01f9, B:70:0x0205, B:72:0x020b, B:73:0x0210, B:75:0x021c, B:77:0x0222, B:79:0x0229, B:63:0x01e4, B:45:0x0184, B:47:0x019b, B:50:0x01aa, B:53:0x01b5, B:54:0x01bc), top: B:96:0x0134 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x01f4 A[Catch: OutOfMemoryError -> 0x0233, Exception -> 0x0239, TryCatch #3 {Exception -> 0x0239, OutOfMemoryError -> 0x0233, blocks: (B:34:0x0134, B:36:0x013e, B:38:0x0145, B:40:0x0169, B:42:0x0170, B:44:0x017e, B:56:0x01c9, B:58:0x01ce, B:61:0x01d5, B:65:0x01ed, B:67:0x01f4, B:68:0x01f9, B:70:0x0205, B:72:0x020b, B:73:0x0210, B:75:0x021c, B:77:0x0222, B:79:0x0229, B:63:0x01e4, B:45:0x0184, B:47:0x019b, B:50:0x01aa, B:53:0x01b5, B:54:0x01bc), top: B:96:0x0134 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0229 A[Catch: OutOfMemoryError -> 0x0233, Exception -> 0x0239, TRY_LEAVE, TryCatch #3 {Exception -> 0x0239, OutOfMemoryError -> 0x0233, blocks: (B:34:0x0134, B:36:0x013e, B:38:0x0145, B:40:0x0169, B:42:0x0170, B:44:0x017e, B:56:0x01c9, B:58:0x01ce, B:61:0x01d5, B:65:0x01ed, B:67:0x01f4, B:68:0x01f9, B:70:0x0205, B:72:0x020b, B:73:0x0210, B:75:0x021c, B:77:0x0222, B:79:0x0229, B:63:0x01e4, B:45:0x0184, B:47:0x019b, B:50:0x01aa, B:53:0x01b5, B:54:0x01bc), top: B:96:0x0134 }] */
    private static android.app.Notification.Builder deserializeNotificationCustom(android.content.Context context, java.io.DataInputStream dataInputStream) {
        java.lang.String str;
        java.lang.String str2;
        long j;
        boolean z;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String strDeserializeString;
        java.lang.String strDeserializeString2;
        int i;
        boolean z2;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        long j2;
        java.lang.String str10;
        boolean z3;
        java.lang.String string;
        boolean z4;
        long j3;
        boolean z5;
        int i2;
        int i3;
        java.lang.String strDeserializeString3;
        java.lang.String strDeserializeString4;
        long j4;
        long j5;
        com.unity.androidnotifications.UnityNotificationManager notificationManagerImpl;
        android.app.Notification.Builder builderCreateNotificationBuilder;
        long j6;
        java.lang.String str11;
        java.lang.String str12;
        try {
            if (!readAndCheckMagicNumber(dataInputStream, UNITY_MAGIC_NUMBER)) {
                return null;
            }
            int i4 = dataInputStream.readInt();
            if (i4 >= 0 && i4 <= 3) {
                android.os.Bundle bundle = i4 < 2 ? (android.os.Bundle) deserializeParcelable(dataInputStream) : null;
                try {
                    if (bundle == null) {
                        int i5 = dataInputStream.readInt();
                        java.lang.String strDeserializeString5 = deserializeString(dataInputStream);
                        java.lang.String strDeserializeString6 = deserializeString(dataInputStream);
                        java.lang.String strDeserializeString7 = deserializeString(dataInputStream);
                        java.lang.String strDeserializeString8 = deserializeString(dataInputStream);
                        j = dataInputStream.readLong();
                        long j7 = dataInputStream.readLong();
                        java.lang.String strDeserializeString9 = deserializeString(dataInputStream);
                        boolean z6 = dataInputStream.readBoolean();
                        z = dataInputStream.readBoolean();
                        java.lang.String strDeserializeString10 = deserializeString(dataInputStream);
                        boolean z7 = i4 > 0 ? dataInputStream.readBoolean() : true;
                        if (i4 >= 3) {
                            java.lang.String strDeserializeString11 = deserializeString(dataInputStream);
                            if (strDeserializeString11 == null || strDeserializeString11.length() <= 0) {
                                str4 = strDeserializeString11;
                                str3 = null;
                                str5 = null;
                            } else {
                                java.lang.String strDeserializeString12 = deserializeString(dataInputStream);
                                java.lang.String strDeserializeString13 = deserializeString(dataInputStream);
                                str7 = strDeserializeString6;
                                str8 = strDeserializeString7;
                                str9 = strDeserializeString8;
                                j2 = j7;
                                str10 = strDeserializeString9;
                                z3 = z6;
                                string = strDeserializeString10;
                                z4 = z7;
                                strDeserializeString = deserializeString(dataInputStream);
                                strDeserializeString2 = deserializeString(dataInputStream);
                                z2 = dataInputStream.readBoolean();
                                str4 = strDeserializeString11;
                                str3 = strDeserializeString12;
                                i = i5;
                                str6 = strDeserializeString5;
                                j3 = j;
                                str5 = strDeserializeString13;
                            }
                            java.lang.String strDeserializeString14 = deserializeString(dataInputStream);
                            z5 = dataInputStream.readBoolean();
                            if (z5) {
                                i2 = dataInputStream.readInt();
                            } else {
                                i2 = 0;
                            }
                            i3 = dataInputStream.readInt();
                            boolean z8 = dataInputStream.readBoolean();
                            strDeserializeString3 = deserializeString(dataInputStream);
                            boolean z9 = dataInputStream.readBoolean();
                            int i6 = dataInputStream.readInt();
                            strDeserializeString4 = deserializeString(dataInputStream);
                            if (z) {
                                j4 = dataInputStream.readLong();
                            } else {
                                j4 = 0;
                            }
                            j5 = j4;
                            notificationManagerImpl = com.unity.androidnotifications.UnityNotificationManager.getNotificationManagerImpl(context);
                            builderCreateNotificationBuilder = notificationManagerImpl.createNotificationBuilder(strDeserializeString14);
                            if (bundle != null) {
                                builderCreateNotificationBuilder.setExtras(bundle);
                            } else {
                                builderCreateNotificationBuilder.getExtras().putInt("id", i);
                                com.unity.androidnotifications.UnityNotificationManager.setNotificationIcon(builderCreateNotificationBuilder, com.unity.androidnotifications.UnityNotificationManager.KEY_SMALL_ICON, str8);
                                com.unity.androidnotifications.UnityNotificationManager.setNotificationIcon(builderCreateNotificationBuilder, com.unity.androidnotifications.UnityNotificationManager.KEY_LARGE_ICON, str9);
                                if (j3 != -1) {
                                    builderCreateNotificationBuilder.getExtras().putLong(com.unity.androidnotifications.UnityNotificationManager.KEY_FIRE_TIME, j3);
                                }
                                j6 = j2;
                                if (j6 != -1) {
                                    builderCreateNotificationBuilder.getExtras().putLong(com.unity.androidnotifications.UnityNotificationManager.KEY_REPEAT_INTERVAL, j6);
                                }
                                str11 = string;
                                if (str11 != null) {
                                    builderCreateNotificationBuilder.getExtras().putString("data", str11);
                                }
                                builderCreateNotificationBuilder.getExtras().putBoolean(com.unity.androidnotifications.UnityNotificationManager.KEY_SHOW_IN_FOREGROUND, z4);
                            }
                            if (str6 != null) {
                                builderCreateNotificationBuilder.setContentTitle(str6);
                            }
                            if (str7 != null) {
                                builderCreateNotificationBuilder.setContentText(str7);
                            }
                            str12 = str10;
                            if (str12 != null) {
                                builderCreateNotificationBuilder.setStyle(new android.app.Notification.BigTextStyle().bigText(str12));
                            } else if (str4 != null) {
                                notificationManagerImpl.setupBigPictureStyle(builderCreateNotificationBuilder, str3, str4, str5, strDeserializeString, strDeserializeString2, z2);
                            }
                            if (z5) {
                                com.unity.androidnotifications.UnityNotificationManager.setNotificationColor(builderCreateNotificationBuilder, i2);
                            }
                            if (i3 >= 0) {
                                builderCreateNotificationBuilder.setNumber(i3);
                            }
                            builderCreateNotificationBuilder.setAutoCancel(z8);
                            com.unity.androidnotifications.UnityNotificationManager.setNotificationUsesChronometer(builderCreateNotificationBuilder, z3);
                            if (strDeserializeString3 != null && strDeserializeString3.length() > 0) {
                                builderCreateNotificationBuilder.setGroup(strDeserializeString3);
                            }
                            builderCreateNotificationBuilder.setGroupSummary(z9);
                            com.unity.androidnotifications.UnityNotificationManager.setNotificationGroupAlertBehavior(builderCreateNotificationBuilder, i6);
                            if (strDeserializeString4 != null && strDeserializeString4.length() > 0) {
                                builderCreateNotificationBuilder.setSortKey(strDeserializeString4);
                            }
                            if (z) {
                                builderCreateNotificationBuilder.setShowWhen(true);
                                builderCreateNotificationBuilder.setWhen(j5);
                            }
                            return builderCreateNotificationBuilder;
                        }
                        str3 = null;
                        str4 = null;
                        str5 = null;
                        strDeserializeString = str5;
                        strDeserializeString2 = strDeserializeString;
                        z2 = false;
                        i = i5;
                        str6 = strDeserializeString5;
                        str7 = strDeserializeString6;
                        str8 = strDeserializeString7;
                        str9 = strDeserializeString8;
                        j2 = j7;
                        str10 = strDeserializeString9;
                        z3 = z6;
                        string = strDeserializeString10;
                        z4 = z7;
                    } else {
                        java.lang.String string2 = bundle.getString(androidx.core.app.NotificationCompat.EXTRA_TITLE);
                        java.lang.String string3 = bundle.getString(androidx.core.app.NotificationCompat.EXTRA_TEXT);
                        java.lang.String string4 = bundle.getString(com.unity.androidnotifications.UnityNotificationManager.KEY_SMALL_ICON);
                        java.lang.String string5 = bundle.getString(com.unity.androidnotifications.UnityNotificationManager.KEY_LARGE_ICON);
                        j = bundle.getLong(com.unity.androidnotifications.UnityNotificationManager.KEY_FIRE_TIME, -1L);
                        long j8 = bundle.getLong(com.unity.androidnotifications.UnityNotificationManager.KEY_REPEAT_INTERVAL, -1L);
                        java.lang.String string6 = bundle.getString(androidx.core.app.NotificationCompat.EXTRA_BIG_TEXT);
                        boolean z10 = bundle.getBoolean(androidx.core.app.NotificationCompat.EXTRA_SHOW_CHRONOMETER, false);
                        z = bundle.getBoolean(androidx.core.app.NotificationCompat.EXTRA_SHOW_WHEN, false);
                        str3 = null;
                        str4 = null;
                        str5 = null;
                        strDeserializeString = null;
                        strDeserializeString2 = null;
                        i = 0;
                        z2 = false;
                        str6 = string2;
                        str7 = string3;
                        str8 = string4;
                        str9 = string5;
                        j2 = j8;
                        str10 = string6;
                        z3 = z10;
                        string = bundle.getString("data");
                        z4 = true;
                    }
                    java.lang.String strDeserializeString15 = deserializeString(dataInputStream);
                    z5 = dataInputStream.readBoolean();
                    if (z5) {
                        i2 = dataInputStream.readInt();
                    } else {
                        i2 = 0;
                    }
                    i3 = dataInputStream.readInt();
                    boolean z11 = dataInputStream.readBoolean();
                    strDeserializeString3 = deserializeString(dataInputStream);
                    boolean z12 = dataInputStream.readBoolean();
                    int i7 = dataInputStream.readInt();
                    strDeserializeString4 = deserializeString(dataInputStream);
                    if (z) {
                        j4 = dataInputStream.readLong();
                    } else {
                        j4 = 0;
                    }
                    j5 = j4;
                    notificationManagerImpl = com.unity.androidnotifications.UnityNotificationManager.getNotificationManagerImpl(context);
                    builderCreateNotificationBuilder = notificationManagerImpl.createNotificationBuilder(strDeserializeString15);
                    if (bundle != null) {
                        builderCreateNotificationBuilder.setExtras(bundle);
                    } else {
                        builderCreateNotificationBuilder.getExtras().putInt("id", i);
                        com.unity.androidnotifications.UnityNotificationManager.setNotificationIcon(builderCreateNotificationBuilder, com.unity.androidnotifications.UnityNotificationManager.KEY_SMALL_ICON, str8);
                        com.unity.androidnotifications.UnityNotificationManager.setNotificationIcon(builderCreateNotificationBuilder, com.unity.androidnotifications.UnityNotificationManager.KEY_LARGE_ICON, str9);
                        if (j3 != -1) {
                            builderCreateNotificationBuilder.getExtras().putLong(com.unity.androidnotifications.UnityNotificationManager.KEY_FIRE_TIME, j3);
                        }
                        j6 = j2;
                        if (j6 != -1) {
                            builderCreateNotificationBuilder.getExtras().putLong(com.unity.androidnotifications.UnityNotificationManager.KEY_REPEAT_INTERVAL, j6);
                        }
                        str11 = string;
                        if (str11 != null) {
                            builderCreateNotificationBuilder.getExtras().putString("data", str11);
                        }
                        builderCreateNotificationBuilder.getExtras().putBoolean(com.unity.androidnotifications.UnityNotificationManager.KEY_SHOW_IN_FOREGROUND, z4);
                    }
                    if (str6 != null) {
                        builderCreateNotificationBuilder.setContentTitle(str6);
                    }
                    if (str7 != null) {
                        builderCreateNotificationBuilder.setContentText(str7);
                    }
                    str12 = str10;
                    if (str12 != null) {
                        builderCreateNotificationBuilder.setStyle(new android.app.Notification.BigTextStyle().bigText(str12));
                    } else if (str4 != null) {
                        notificationManagerImpl.setupBigPictureStyle(builderCreateNotificationBuilder, str3, str4, str5, strDeserializeString, strDeserializeString2, z2);
                    }
                    if (z5) {
                        com.unity.androidnotifications.UnityNotificationManager.setNotificationColor(builderCreateNotificationBuilder, i2);
                    }
                    if (i3 >= 0) {
                        builderCreateNotificationBuilder.setNumber(i3);
                    }
                    builderCreateNotificationBuilder.setAutoCancel(z11);
                    com.unity.androidnotifications.UnityNotificationManager.setNotificationUsesChronometer(builderCreateNotificationBuilder, z3);
                    if (strDeserializeString3 != null) {
                        builderCreateNotificationBuilder.setGroup(strDeserializeString3);
                    }
                    builderCreateNotificationBuilder.setGroupSummary(z12);
                    com.unity.androidnotifications.UnityNotificationManager.setNotificationGroupAlertBehavior(builderCreateNotificationBuilder, i7);
                    if (strDeserializeString4 != null) {
                        builderCreateNotificationBuilder.setSortKey(strDeserializeString4);
                    }
                    if (z) {
                        builderCreateNotificationBuilder.setShowWhen(true);
                        builderCreateNotificationBuilder.setWhen(j5);
                    }
                    return builderCreateNotificationBuilder;
                } catch (java.lang.Exception e) {
                    e = e;
                    str2 = "UnityNotifications";
                    android.util.Log.e(str2, "Failed to deserialize notification", e);
                    return null;
                } catch (java.lang.OutOfMemoryError e2) {
                    e = e2;
                    str = r2;
                    android.util.Log.e(str, "Failed to deserialize notification", e);
                    return null;
                }
                j3 = j;
            }
            return null;
        } catch (java.lang.Exception e3) {
            e = e3;
            str2 = "UnityNotifications";
        } catch (java.lang.OutOfMemoryError e4) {
            e = e4;
            str = "UnityNotifications";
        }
    }

    private static android.app.Notification.Builder deserializedFromOldIntent(android.content.Context context, byte[] bArr) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        try {
            android.os.Parcel parcelObtain = android.os.Parcel.obtain();
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.readFromParcel(parcelObtain);
            int i = bundle.getInt("id", -1);
            java.lang.String string = bundle.getString(com.unity.androidnotifications.UnityNotificationManager.KEY_CHANNEL_ID);
            java.lang.String string2 = bundle.getString("textTitle");
            java.lang.String string3 = bundle.getString("textContent");
            java.lang.String string4 = bundle.getString("smallIconStr");
            boolean z = bundle.getBoolean("autoCancel", false);
            boolean z2 = bundle.getBoolean("usesChronometer", false);
            long j = bundle.getLong(com.unity.androidnotifications.UnityNotificationManager.KEY_FIRE_TIME, -1L);
            long j2 = bundle.getLong(com.unity.androidnotifications.UnityNotificationManager.KEY_REPEAT_INTERVAL, -1L);
            try {
                java.lang.String string5 = bundle.getString("largeIconStr");
                try {
                    int i2 = bundle.getInt(androidx.media3.extractor.text.ttml.TtmlNode.TAG_STYLE, -1);
                    int i3 = bundle.getInt("color", 0);
                    int i4 = bundle.getInt("number", 0);
                    java.lang.String string6 = bundle.getString("data");
                    java.lang.String string7 = bundle.getString("group");
                    boolean z3 = bundle.getBoolean("groupSummary", false);
                    java.lang.String string8 = bundle.getString("sortKey");
                    int i5 = bundle.getInt("groupAlertBehaviour", -1);
                    boolean z4 = bundle.getBoolean("showTimestamp", false);
                    android.app.Notification.Builder builderCreateNotificationBuilder = com.unity.androidnotifications.UnityNotificationManager.getNotificationManagerImpl(context).createNotificationBuilder(string);
                    builderCreateNotificationBuilder.getExtras().putInt("id", i);
                    builderCreateNotificationBuilder.setContentTitle(string2);
                    builderCreateNotificationBuilder.setContentText(string3);
                    com.unity.androidnotifications.UnityNotificationManager.setNotificationIcon(builderCreateNotificationBuilder, com.unity.androidnotifications.UnityNotificationManager.KEY_SMALL_ICON, string4);
                    builderCreateNotificationBuilder.setAutoCancel(z);
                    builderCreateNotificationBuilder.setUsesChronometer(z2);
                    builderCreateNotificationBuilder.getExtras().putLong(com.unity.androidnotifications.UnityNotificationManager.KEY_FIRE_TIME, j);
                    builderCreateNotificationBuilder.getExtras().putLong(com.unity.androidnotifications.UnityNotificationManager.KEY_REPEAT_INTERVAL, j2);
                    com.unity.androidnotifications.UnityNotificationManager.setNotificationIcon(builderCreateNotificationBuilder, com.unity.androidnotifications.UnityNotificationManager.KEY_LARGE_ICON, string5);
                    if (i2 == 2) {
                        builderCreateNotificationBuilder.setStyle(new android.app.Notification.BigTextStyle().bigText(string3));
                    }
                    if (i3 != 0) {
                        com.unity.androidnotifications.UnityNotificationManager.setNotificationColor(builderCreateNotificationBuilder, i3);
                    }
                    if (i4 >= 0) {
                        builderCreateNotificationBuilder.setNumber(i4);
                    }
                    if (string6 != null) {
                        builderCreateNotificationBuilder.getExtras().putString("data", string6);
                    }
                    if (string7 != null && string7.length() > 0) {
                        builderCreateNotificationBuilder.setGroup(string7);
                    }
                    builderCreateNotificationBuilder.setGroupSummary(z3);
                    if (string8 != null && string8.length() > 0) {
                        builderCreateNotificationBuilder.setSortKey(string8);
                    }
                    com.unity.androidnotifications.UnityNotificationManager.setNotificationGroupAlertBehavior(builderCreateNotificationBuilder, i5);
                    builderCreateNotificationBuilder.setShowWhen(z4);
                    return builderCreateNotificationBuilder;
                } catch (java.lang.Exception e) {
                    e = e;
                    str3 = "Failed to deserialize old style notification";
                    str4 = "UnityNotifications";
                    android.util.Log.e(str4, str3, e);
                    return null;
                } catch (java.lang.OutOfMemoryError e2) {
                    e = e2;
                    str = "Failed to deserialize old style notification";
                    str2 = "UnityNotifications";
                    android.util.Log.e(str2, str, e);
                    return null;
                }
            } catch (java.lang.Exception e3) {
                e = e3;
                str4 = "UnityNotifications";
                str3 = "Failed to deserialize old style notification";
            } catch (java.lang.OutOfMemoryError e4) {
                e = e4;
                str2 = "UnityNotifications";
                str = "Failed to deserialize old style notification";
            }
        } catch (java.lang.Exception e5) {
            e = e5;
            str3 = "Failed to deserialize old style notification";
            str4 = "UnityNotifications";
        } catch (java.lang.OutOfMemoryError e6) {
            e = e6;
            str = "Failed to deserialize old style notification";
            str2 = "UnityNotifications";
        }
    }

    private static java.lang.String deserializeString(java.io.DataInputStream dataInputStream) throws java.io.IOException {
        int i = dataInputStream.readInt();
        if (i <= 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        if (dataInputStream.read(bArr) != i) {
            throw new java.io.IOException("Insufficient amount of bytes read");
        }
        return new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
    }

    private static <T extends android.os.Parcelable> T deserializeParcelable(java.io.DataInputStream dataInputStream) throws java.io.IOException {
        int i = dataInputStream.readInt();
        if (i <= 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        if (dataInputStream.read(bArr) != i) {
            throw new java.io.IOException("Insufficient amount of bytes read");
        }
        try {
            android.os.Parcel parcelObtain = android.os.Parcel.obtain();
            parcelObtain.unmarshall(bArr, 0, i);
            parcelObtain.setDataPosition(0);
            android.os.Bundle bundle = (android.os.Bundle) parcelObtain.readParcelable(com.unity.androidnotifications.UnityNotificationUtilities.class.getClassLoader());
            parcelObtain.recycle();
            if (bundle != null) {
                return (T) bundle.getParcelable("obj");
            }
        } catch (java.lang.Exception e) {
            android.util.Log.e("UnityNotifications", "Failed to deserialize parcelable", e);
        } catch (java.lang.OutOfMemoryError e2) {
            android.util.Log.e("UnityNotifications", "Failed to deserialize parcelable", e2);
        }
        return null;
    }

    protected static java.lang.Class<?> getOpenAppActivity(android.content.Context context) {
        try {
            try {
                android.content.pm.PackageManager packageManager = context.getPackageManager();
                android.os.Bundle bundle = packageManager.getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle.containsKey("custom_notification_android_activity")) {
                    try {
                        return java.lang.Class.forName(bundle.getString("custom_notification_android_activity"));
                    } catch (java.lang.ClassNotFoundException e) {
                        android.util.Log.e("UnityNotifications", "Specified activity class for notifications not found: " + e.getMessage());
                    }
                }
                android.util.Log.w("UnityNotifications", "No custom_notification_android_activity found, attempting to find app activity class");
                boolean z = true;
                android.content.pm.ActivityInfo[] activityInfoArr = packageManager.getPackageInfo(context.getPackageName(), 1).activities;
                if (activityInfoArr == null) {
                    android.util.Log.e("UnityNotifications", "Could not get package activities");
                    return null;
                }
                int length = activityInfoArr.length;
                java.lang.String str = null;
                int i = 0;
                boolean z2 = false;
                boolean z3 = false;
                while (true) {
                    if (i >= length) {
                        z = z3;
                        break;
                    }
                    android.content.pm.ActivityInfo activityInfo = activityInfoArr[i];
                    if (activityInfo.enabled && activityInfo.targetActivity == null) {
                        boolean zIsUnityActivity = isUnityActivity(activityInfo.name);
                        if (str == null) {
                            str = activityInfo.name;
                        } else if (z2 == zIsUnityActivity) {
                            if (z2 && zIsUnityActivity) {
                                break;
                            }
                            z3 = true;
                        } else if (zIsUnityActivity) {
                            str = activityInfo.name;
                            z3 = false;
                        }
                        z2 = zIsUnityActivity;
                    }
                    i++;
                }
                if (z) {
                    android.util.Log.e("UnityNotifications", "Multiple choices for activity for notifications, set activity explicitly in Notification Settings");
                    return null;
                }
                if (str == null) {
                    android.util.Log.e("UnityNotifications", "Activity class for notifications not found");
                    return null;
                }
                return java.lang.Class.forName(str);
            } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
                e2.printStackTrace();
                return null;
            }
        } catch (java.lang.ClassNotFoundException e3) {
            android.util.Log.e("UnityNotifications", "Failed to find activity class: " + e3.getMessage());
            return null;
        }
    }

    private static boolean isUnityActivity(java.lang.String str) {
        return str.endsWith(".UnityPlayerActivity") || str.endsWith(".UnityPlayerGameActivity");
    }

    protected static android.app.Notification.Builder recoverBuilder(android.content.Context context, android.app.Notification notification) {
        try {
            android.app.Notification.Builder builderRecoverBuilder = android.app.Notification.Builder.recoverBuilder(context, notification);
            builderRecoverBuilder.setExtras(notification.extras);
            return builderRecoverBuilder;
        } catch (java.lang.Exception e) {
            android.util.Log.e("UnityNotifications", "Failed to recover builder for notification!", e);
            return recoverBuilderCustom(context, notification);
        } catch (java.lang.OutOfMemoryError e2) {
            android.util.Log.e("UnityNotifications", "Failed to recover builder for notification!", e2);
            return recoverBuilderCustom(context, notification);
        }
    }

    private static android.app.Notification.Builder recoverBuilderCustom(android.content.Context context, android.app.Notification notification) {
        android.app.Notification.Builder builderCreateNotificationBuilder = com.unity.androidnotifications.UnityNotificationManager.getNotificationManagerImpl(context).createNotificationBuilder(notification.extras.getString(com.unity.androidnotifications.UnityNotificationManager.KEY_CHANNEL_ID));
        com.unity.androidnotifications.UnityNotificationManager.setNotificationIcon(builderCreateNotificationBuilder, com.unity.androidnotifications.UnityNotificationManager.KEY_SMALL_ICON, notification.extras.getString(com.unity.androidnotifications.UnityNotificationManager.KEY_SMALL_ICON));
        java.lang.String string = notification.extras.getString(com.unity.androidnotifications.UnityNotificationManager.KEY_LARGE_ICON);
        if (string != null && !string.isEmpty()) {
            com.unity.androidnotifications.UnityNotificationManager.setNotificationIcon(builderCreateNotificationBuilder, com.unity.androidnotifications.UnityNotificationManager.KEY_LARGE_ICON, string);
        }
        builderCreateNotificationBuilder.setContentTitle(notification.extras.getString(androidx.core.app.NotificationCompat.EXTRA_TITLE));
        builderCreateNotificationBuilder.setContentText(notification.extras.getString(androidx.core.app.NotificationCompat.EXTRA_TEXT));
        builderCreateNotificationBuilder.setAutoCancel((notification.flags & 16) != 0);
        if (notification.number >= 0) {
            builderCreateNotificationBuilder.setNumber(notification.number);
        }
        java.lang.String string2 = notification.extras.getString(androidx.core.app.NotificationCompat.EXTRA_BIG_TEXT);
        if (string2 != null) {
            builderCreateNotificationBuilder.setStyle(new android.app.Notification.BigTextStyle().bigText(string2));
        }
        builderCreateNotificationBuilder.setWhen(notification.when);
        java.lang.String group = notification.getGroup();
        if (group != null && !group.isEmpty()) {
            builderCreateNotificationBuilder.setGroup(group);
        }
        builderCreateNotificationBuilder.setGroupSummary((notification.flags & 512) != 0);
        java.lang.String sortKey = notification.getSortKey();
        if (sortKey != null && !sortKey.isEmpty()) {
            builderCreateNotificationBuilder.setSortKey(sortKey);
        }
        builderCreateNotificationBuilder.setShowWhen(notification.extras.getBoolean(androidx.core.app.NotificationCompat.EXTRA_SHOW_WHEN, false));
        java.lang.Integer notificationColor = com.unity.androidnotifications.UnityNotificationManager.getNotificationColor(notification);
        if (notificationColor != null) {
            com.unity.androidnotifications.UnityNotificationManager.setNotificationColor(builderCreateNotificationBuilder, notificationColor.intValue());
        }
        com.unity.androidnotifications.UnityNotificationManager.setNotificationUsesChronometer(builderCreateNotificationBuilder, notification.extras.getBoolean(androidx.core.app.NotificationCompat.EXTRA_SHOW_CHRONOMETER, false));
        com.unity.androidnotifications.UnityNotificationManager.setNotificationGroupAlertBehavior(builderCreateNotificationBuilder, com.unity.androidnotifications.UnityNotificationManager.getNotificationGroupAlertBehavior(notification));
        builderCreateNotificationBuilder.getExtras().putInt("id", notification.extras.getInt("id", 0));
        builderCreateNotificationBuilder.getExtras().putLong(com.unity.androidnotifications.UnityNotificationManager.KEY_REPEAT_INTERVAL, notification.extras.getLong(com.unity.androidnotifications.UnityNotificationManager.KEY_REPEAT_INTERVAL, 0L));
        builderCreateNotificationBuilder.getExtras().putLong(com.unity.androidnotifications.UnityNotificationManager.KEY_FIRE_TIME, notification.extras.getLong(com.unity.androidnotifications.UnityNotificationManager.KEY_FIRE_TIME, 0L));
        java.lang.String string3 = notification.extras.getString("data");
        if (string3 != null && !string3.isEmpty()) {
            builderCreateNotificationBuilder.getExtras().putString("data", string3);
        }
        return builderCreateNotificationBuilder;
    }
}
