package com.google.firebase.messaging;

/* JADX INFO: loaded from: classes5.dex */
public final class CommonNotificationBuilder {
    private static final java.lang.String ACTION_RECEIVER = "com.google.android.c2dm.intent.RECEIVE";
    public static final java.lang.String FCM_FALLBACK_NOTIFICATION_CHANNEL = "fcm_fallback_notification_channel";
    public static final java.lang.String FCM_FALLBACK_NOTIFICATION_CHANNEL_LABEL = "fcm_fallback_notification_channel_label";
    private static final java.lang.String FCM_FALLBACK_NOTIFICATION_CHANNEL_NAME_NO_RESOURCE = "Misc";
    private static final int ILLEGAL_RESOURCE_ID = 0;
    public static final java.lang.String METADATA_DEFAULT_CHANNEL_ID = "com.google.firebase.messaging.default_notification_channel_id";
    public static final java.lang.String METADATA_DEFAULT_COLOR = "com.google.firebase.messaging.default_notification_color";
    public static final java.lang.String METADATA_DEFAULT_ICON = "com.google.firebase.messaging.default_notification_icon";
    private static final java.util.concurrent.atomic.AtomicInteger requestCodeProvider = new java.util.concurrent.atomic.AtomicInteger((int) android.os.SystemClock.elapsedRealtime());

    private static int getPendingIntentFlags(int i) {
        return i | 67108864;
    }

    private CommonNotificationBuilder() {
    }

    static com.google.firebase.messaging.CommonNotificationBuilder.DisplayNotificationInfo createNotificationInfo(android.content.Context context, com.google.firebase.messaging.NotificationParams notificationParams) {
        android.os.Bundle manifestMetadata = getManifestMetadata(context.getPackageManager(), context.getPackageName());
        return createNotificationInfo(context, context, notificationParams, getOrCreateChannel(context, notificationParams.getNotificationChannelId(), manifestMetadata), manifestMetadata);
    }

    public static com.google.firebase.messaging.CommonNotificationBuilder.DisplayNotificationInfo createNotificationInfo(android.content.Context context, android.content.Context context2, com.google.firebase.messaging.NotificationParams notificationParams, java.lang.String str, android.os.Bundle bundle) {
        java.lang.String packageName = context2.getPackageName();
        android.content.res.Resources resources = context2.getResources();
        android.content.pm.PackageManager packageManager = context2.getPackageManager();
        androidx.core.app.NotificationCompat.Builder builder = new androidx.core.app.NotificationCompat.Builder(context2, str);
        java.lang.String possiblyLocalizedString = notificationParams.getPossiblyLocalizedString(resources, packageName, com.google.firebase.messaging.Constants.MessageNotificationKeys.TITLE);
        if (!android.text.TextUtils.isEmpty(possiblyLocalizedString)) {
            builder.setContentTitle(possiblyLocalizedString);
        }
        java.lang.String possiblyLocalizedString2 = notificationParams.getPossiblyLocalizedString(resources, packageName, com.google.firebase.messaging.Constants.MessageNotificationKeys.BODY);
        if (!android.text.TextUtils.isEmpty(possiblyLocalizedString2)) {
            builder.setContentText(possiblyLocalizedString2);
            builder.setStyle(new androidx.core.app.NotificationCompat.BigTextStyle().bigText(possiblyLocalizedString2));
        }
        builder.setSmallIcon(getSmallIcon(packageManager, resources, packageName, notificationParams.getString(com.google.firebase.messaging.Constants.MessageNotificationKeys.ICON), bundle));
        android.net.Uri sound = getSound(packageName, notificationParams, resources);
        if (sound != null) {
            builder.setSound(sound);
        }
        builder.setContentIntent(createContentIntent(context, notificationParams, packageName, packageManager));
        android.app.PendingIntent pendingIntentCreateDeleteIntent = createDeleteIntent(context, context2, notificationParams);
        if (pendingIntentCreateDeleteIntent != null) {
            builder.setDeleteIntent(pendingIntentCreateDeleteIntent);
        }
        java.lang.Integer color = getColor(context2, notificationParams.getString(com.google.firebase.messaging.Constants.MessageNotificationKeys.COLOR), bundle);
        if (color != null) {
            builder.setColor(color.intValue());
        }
        builder.setAutoCancel(!notificationParams.getBoolean(com.google.firebase.messaging.Constants.MessageNotificationKeys.STICKY));
        builder.setLocalOnly(notificationParams.getBoolean(com.google.firebase.messaging.Constants.MessageNotificationKeys.LOCAL_ONLY));
        java.lang.String string = notificationParams.getString(com.google.firebase.messaging.Constants.MessageNotificationKeys.TICKER);
        if (string != null) {
            builder.setTicker(string);
        }
        java.lang.Integer notificationPriority = notificationParams.getNotificationPriority();
        if (notificationPriority != null) {
            builder.setPriority(notificationPriority.intValue());
        }
        java.lang.Integer visibility = notificationParams.getVisibility();
        if (visibility != null) {
            builder.setVisibility(visibility.intValue());
        }
        java.lang.Integer notificationCount = notificationParams.getNotificationCount();
        if (notificationCount != null) {
            builder.setNumber(notificationCount.intValue());
        }
        java.lang.Long l = notificationParams.getLong(com.google.firebase.messaging.Constants.MessageNotificationKeys.EVENT_TIME);
        if (l != null) {
            builder.setShowWhen(true);
            builder.setWhen(l.longValue());
        }
        long[] vibrateTimings = notificationParams.getVibrateTimings();
        if (vibrateTimings != null) {
            builder.setVibrate(vibrateTimings);
        }
        int[] lightSettings = notificationParams.getLightSettings();
        if (lightSettings != null) {
            builder.setLights(lightSettings[0], lightSettings[1], lightSettings[2]);
        }
        builder.setDefaults(getConsolidatedDefaults(notificationParams));
        return new com.google.firebase.messaging.CommonNotificationBuilder.DisplayNotificationInfo(builder, getTag(notificationParams), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    private static int getConsolidatedDefaults(com.google.firebase.messaging.NotificationParams notificationParams) {
        boolean z = notificationParams.getBoolean(com.google.firebase.messaging.Constants.MessageNotificationKeys.DEFAULT_SOUND);
        ?? r0 = z;
        if (notificationParams.getBoolean(com.google.firebase.messaging.Constants.MessageNotificationKeys.DEFAULT_VIBRATE_TIMINGS)) {
            r0 = (z ? 1 : 0) | 2;
        }
        return notificationParams.getBoolean(com.google.firebase.messaging.Constants.MessageNotificationKeys.DEFAULT_LIGHT_SETTINGS) ? r0 | 4 : r0;
    }

    private static boolean isValidIcon(android.content.res.Resources resources, int i) {
        if (android.os.Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i, null) instanceof android.graphics.drawable.AdaptiveIconDrawable)) {
                return true;
            }
            android.util.Log.e(com.google.firebase.messaging.Constants.TAG, "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i);
            return false;
        } catch (android.content.res.Resources.NotFoundException unused) {
            android.util.Log.e(com.google.firebase.messaging.Constants.TAG, "Couldn't find resource " + i + ", treating it as an invalid icon");
            return false;
        }
    }

    private static int getSmallIcon(android.content.pm.PackageManager packageManager, android.content.res.Resources resources, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        if (!android.text.TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && isValidIcon(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && isValidIcon(resources, identifier2)) {
                return identifier2;
            }
            android.util.Log.w(com.google.firebase.messaging.Constants.TAG, "Icon resource " + str2 + " not found. Notification will use default icon.");
        }
        int i = bundle.getInt(METADATA_DEFAULT_ICON, 0);
        if (i == 0 || !isValidIcon(resources, i)) {
            try {
                i = packageManager.getApplicationInfo(str, 0).icon;
            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                android.util.Log.w(com.google.firebase.messaging.Constants.TAG, "Couldn't get own application info: " + e);
            }
        }
        return (i == 0 || !isValidIcon(resources, i)) ? android.R.drawable.sym_def_app_icon : i;
    }

    private static java.lang.Integer getColor(android.content.Context context, java.lang.String str, android.os.Bundle bundle) {
        if (!android.text.TextUtils.isEmpty(str)) {
            try {
                return java.lang.Integer.valueOf(android.graphics.Color.parseColor(str));
            } catch (java.lang.IllegalArgumentException unused) {
                android.util.Log.w(com.google.firebase.messaging.Constants.TAG, "Color is invalid: " + str + ". Notification will use default color.");
            }
        }
        int i = bundle.getInt(METADATA_DEFAULT_COLOR, 0);
        if (i == 0) {
            return null;
        }
        try {
            return java.lang.Integer.valueOf(androidx.core.content.ContextCompat.getColor(context, i));
        } catch (android.content.res.Resources.NotFoundException unused2) {
            android.util.Log.w(com.google.firebase.messaging.Constants.TAG, "Cannot find the color resource referenced in AndroidManifest.");
            return null;
        }
    }

    private static android.net.Uri getSound(java.lang.String str, com.google.firebase.messaging.NotificationParams notificationParams, android.content.res.Resources resources) {
        java.lang.String soundResourceName = notificationParams.getSoundResourceName();
        if (android.text.TextUtils.isEmpty(soundResourceName)) {
            return null;
        }
        if (!"default".equals(soundResourceName) && resources.getIdentifier(soundResourceName, "raw", str) != 0) {
            return android.net.Uri.parse("android.resource://" + str + "/raw/" + soundResourceName);
        }
        return android.media.RingtoneManager.getDefaultUri(2);
    }

    private static android.app.PendingIntent createContentIntent(android.content.Context context, com.google.firebase.messaging.NotificationParams notificationParams, java.lang.String str, android.content.pm.PackageManager packageManager) {
        android.content.Intent intentCreateTargetIntent = createTargetIntent(str, notificationParams, packageManager);
        if (intentCreateTargetIntent == null) {
            return null;
        }
        intentCreateTargetIntent.addFlags(67108864);
        intentCreateTargetIntent.putExtras(notificationParams.paramsWithReservedKeysRemoved());
        if (shouldUploadMetrics(notificationParams)) {
            intentCreateTargetIntent.putExtra(com.google.firebase.messaging.Constants.MessageNotificationKeys.ANALYTICS_DATA, notificationParams.paramsForAnalyticsIntent());
        }
        return android.app.PendingIntent.getActivity(context, generatePendingIntentRequestCode(), intentCreateTargetIntent, getPendingIntentFlags(1073741824));
    }

    private static android.content.Intent createTargetIntent(java.lang.String str, com.google.firebase.messaging.NotificationParams notificationParams, android.content.pm.PackageManager packageManager) {
        java.lang.String string = notificationParams.getString(com.google.firebase.messaging.Constants.MessageNotificationKeys.CLICK_ACTION);
        if (!android.text.TextUtils.isEmpty(string)) {
            android.content.Intent intent = new android.content.Intent(string);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        android.net.Uri link = notificationParams.getLink();
        if (link != null) {
            android.content.Intent intent2 = new android.content.Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(link);
            return intent2;
        }
        android.content.Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            android.util.Log.w(com.google.firebase.messaging.Constants.TAG, "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    private static android.os.Bundle getManifestMetadata(android.content.pm.PackageManager packageManager, java.lang.String str) {
        try {
            android.content.pm.ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                return applicationInfo.metaData;
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            android.util.Log.w(com.google.firebase.messaging.Constants.TAG, "Couldn't get own application info: " + e);
        }
        return android.os.Bundle.EMPTY;
    }

    public static java.lang.String getOrCreateChannel(android.content.Context context, java.lang.String str, android.os.Bundle bundle) {
        java.lang.String string;
        if (android.os.Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            android.app.NotificationManager notificationManager = (android.app.NotificationManager) context.getSystemService(android.app.NotificationManager.class);
            if (!android.text.TextUtils.isEmpty(str)) {
                if (notificationManager.getNotificationChannel(str) != null) {
                    return str;
                }
                android.util.Log.w(com.google.firebase.messaging.Constants.TAG, "Notification Channel requested (" + str + ") has not been created by the app. Manifest configuration, or default, value will be used.");
            }
            java.lang.String string2 = bundle.getString(METADATA_DEFAULT_CHANNEL_ID);
            if (!android.text.TextUtils.isEmpty(string2)) {
                if (notificationManager.getNotificationChannel(string2) != null) {
                    return string2;
                }
                android.util.Log.w(com.google.firebase.messaging.Constants.TAG, "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
            } else {
                android.util.Log.w(com.google.firebase.messaging.Constants.TAG, "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
            }
            if (notificationManager.getNotificationChannel(FCM_FALLBACK_NOTIFICATION_CHANNEL) == null) {
                int identifier = context.getResources().getIdentifier(FCM_FALLBACK_NOTIFICATION_CHANNEL_LABEL, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_STRING, context.getPackageName());
                if (identifier == 0) {
                    android.util.Log.e(com.google.firebase.messaging.Constants.TAG, "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                    string = FCM_FALLBACK_NOTIFICATION_CHANNEL_NAME_NO_RESOURCE;
                } else {
                    string = context.getString(identifier);
                }
                notificationManager.createNotificationChannel(new android.app.NotificationChannel(FCM_FALLBACK_NOTIFICATION_CHANNEL, string, 3));
            }
            return FCM_FALLBACK_NOTIFICATION_CHANNEL;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static int generatePendingIntentRequestCode() {
        return requestCodeProvider.incrementAndGet();
    }

    private static android.app.PendingIntent createDeleteIntent(android.content.Context context, android.content.Context context2, com.google.firebase.messaging.NotificationParams notificationParams) {
        if (shouldUploadMetrics(notificationParams)) {
            return createMessagingPendingIntent(context, context2, new android.content.Intent(com.google.android.gms.cloudmessaging.CloudMessagingReceiver.IntentActionKeys.NOTIFICATION_DISMISS).putExtras(notificationParams.paramsForAnalyticsIntent()));
        }
        return null;
    }

    private static android.app.PendingIntent createMessagingPendingIntent(android.content.Context context, android.content.Context context2, android.content.Intent intent) {
        return android.app.PendingIntent.getBroadcast(context, generatePendingIntentRequestCode(), new android.content.Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(context2.getPackageName()).putExtra(com.google.android.gms.cloudmessaging.CloudMessagingReceiver.IntentKeys.WRAPPED_INTENT, intent), getPendingIntentFlags(1073741824));
    }

    static boolean shouldUploadMetrics(com.google.firebase.messaging.NotificationParams notificationParams) {
        return notificationParams.getBoolean(com.google.firebase.messaging.Constants.AnalyticsKeys.ENABLED);
    }

    private static java.lang.String getTag(com.google.firebase.messaging.NotificationParams notificationParams) {
        java.lang.String string = notificationParams.getString(com.google.firebase.messaging.Constants.MessageNotificationKeys.TAG);
        return !android.text.TextUtils.isEmpty(string) ? string : "FCM-Notification:" + android.os.SystemClock.uptimeMillis();
    }

    public static class DisplayNotificationInfo {
        public final int id;
        public final androidx.core.app.NotificationCompat.Builder notificationBuilder;
        public final java.lang.String tag;

        DisplayNotificationInfo(androidx.core.app.NotificationCompat.Builder builder, java.lang.String str, int i) {
            this.notificationBuilder = builder;
            this.tag = str;
            this.id = i;
        }
    }
}
