package com.unity.androidnotifications;

/* JADX INFO: loaded from: classes3.dex */
public class UnityNotificationManager extends android.content.BroadcastReceiver {
    public static final java.lang.String KEY_BIG_CONTENT_DESCRIPTION = "com.unity.BigContentDescription";
    public static final java.lang.String KEY_BIG_CONTENT_TITLE = "com.unity.BigContentTytle";
    public static final java.lang.String KEY_BIG_LARGE_ICON = "com.unity.BigLargeIcon";
    public static final java.lang.String KEY_BIG_PICTURE = "com.unity.BigPicture";
    public static final java.lang.String KEY_BIG_SHOW_WHEN_COLLAPSED = "com.unity.BigShowWhenCollapsed";
    public static final java.lang.String KEY_BIG_SUMMARY_TEXT = "com.unity.BigSummaryText";
    public static final java.lang.String KEY_CHANNEL_ID = "channelID";
    public static final java.lang.String KEY_FIRE_TIME = "fireTime";
    public static final java.lang.String KEY_ID = "id";
    public static final java.lang.String KEY_INTENT_DATA = "data";
    public static final java.lang.String KEY_LARGE_ICON = "largeIcon";
    public static final java.lang.String KEY_NOTIFICATION = "unityNotification";
    public static final java.lang.String KEY_NOTIFICATION_DISMISSED = "com.unity.NotificationDismissed";
    public static final java.lang.String KEY_NOTIFICATION_ID = "com.unity.NotificationID";
    public static final java.lang.String KEY_REPEAT_INTERVAL = "repeatInterval";
    public static final java.lang.String KEY_SHOW_IN_FOREGROUND = "com.unity.showInForeground";
    public static final java.lang.String KEY_SMALL_ICON = "smallIcon";
    static final java.lang.String NOTIFICATION_CHANNELS_SHARED_PREFS = "UNITY_NOTIFICATIONS";
    static final java.lang.String NOTIFICATION_CHANNELS_SHARED_PREFS_KEY = "ChannelIDs";
    static final java.lang.String NOTIFICATION_IDS_SHARED_PREFS = "UNITY_STORED_NOTIFICATION_IDS";
    static final java.lang.String NOTIFICATION_IDS_SHARED_PREFS_KEY = "UNITY_NOTIFICATION_IDS";
    private static final int PERMISSION_STATUS_ALLOWED = 1;
    private static final int PERMISSION_STATUS_DENIED = 2;
    private static final int PERMISSION_STATUS_NOTIFICATIONS_BLOCKED_FOR_APP = 5;
    static final java.lang.String TAG_UNITY = "UnityNotifications";
    static com.unity.androidnotifications.UnityNotificationManager mUnityNotificationManager;
    private com.unity.androidnotifications.UnityNotificationBackgroundThread mBackgroundThread;
    private com.unity.androidnotifications.NotificationCallback mNotificationCallback;
    private java.util.Random mRandom;
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, android.app.Notification.Builder> mScheduledNotifications;
    private java.util.HashSet<java.lang.Integer> mVisibleNotifications;
    private android.content.Context mContext = null;
    private android.app.Activity mActivity = null;
    private java.lang.Class mOpenActivity = null;
    private int mExactSchedulingSetting = -1;

    private void initialize(android.app.Activity activity, com.unity.androidnotifications.NotificationCallback notificationCallback) {
        this.mContext = activity.getApplicationContext();
        this.mActivity = activity;
        this.mNotificationCallback = notificationCallback;
        if (this.mScheduledNotifications == null) {
            this.mScheduledNotifications = new java.util.concurrent.ConcurrentHashMap<>();
        }
        com.unity.androidnotifications.UnityNotificationBackgroundThread unityNotificationBackgroundThread = this.mBackgroundThread;
        if (unityNotificationBackgroundThread == null || !unityNotificationBackgroundThread.isAlive()) {
            this.mBackgroundThread = new com.unity.androidnotifications.UnityNotificationBackgroundThread(this, this.mScheduledNotifications);
        }
        if (this.mRandom == null) {
            this.mRandom = new java.util.Random();
        }
        if (this.mVisibleNotifications == null) {
            this.mVisibleNotifications = new java.util.HashSet<>();
        }
        getAppMetadata();
        java.lang.Class<?> openAppActivity = com.unity.androidnotifications.UnityNotificationUtilities.getOpenAppActivity(this.mContext);
        this.mOpenActivity = openAppActivity;
        if (openAppActivity == null) {
            throw new java.lang.RuntimeException("Failed to determine Activity to be opened when tapping notification");
        }
        if (this.mBackgroundThread.isAlive()) {
            return;
        }
        this.mBackgroundThread.start();
    }

    static synchronized com.unity.androidnotifications.UnityNotificationManager getNotificationManagerImpl(android.content.Context context) {
        if (mUnityNotificationManager == null) {
            com.unity.androidnotifications.UnityNotificationManager unityNotificationManager = new com.unity.androidnotifications.UnityNotificationManager();
            mUnityNotificationManager = unityNotificationManager;
            unityNotificationManager.mVisibleNotifications = new java.util.HashSet<>();
            mUnityNotificationManager.mScheduledNotifications = new java.util.concurrent.ConcurrentHashMap<>();
        }
        mUnityNotificationManager.mContext = context.getApplicationContext();
        return mUnityNotificationManager;
    }

    public static synchronized com.unity.androidnotifications.UnityNotificationManager getNotificationManagerImpl(android.app.Activity activity, com.unity.androidnotifications.NotificationCallback notificationCallback) {
        if (mUnityNotificationManager == null) {
            mUnityNotificationManager = new com.unity.androidnotifications.UnityNotificationManager();
        }
        mUnityNotificationManager.initialize(activity, notificationCallback);
        return mUnityNotificationManager;
    }

    private android.os.Bundle getAppMetadata() {
        try {
            return this.mContext.getPackageManager().getApplicationInfo(this.mContext.getPackageName(), 128).metaData;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public android.app.NotificationManager getNotificationManager() {
        return (android.app.NotificationManager) this.mContext.getSystemService("notification");
    }

    public int getTargetSdk() {
        return this.mContext.getApplicationInfo().targetSdkVersion;
    }

    public int areNotificationsEnabled() {
        boolean z = android.os.Build.VERSION.SDK_INT < 33 || this.mContext.checkCallingOrSelfPermission("android.permission.POST_NOTIFICATIONS") == 0;
        boolean zAreNotificationsEnabled = getNotificationManager().areNotificationsEnabled();
        if (z) {
            return zAreNotificationsEnabled ? 1 : 5;
        }
        return 2;
    }

    public void registerNotificationChannelGroup(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            android.app.NotificationChannelGroup notificationChannelGroup = new android.app.NotificationChannelGroup(str, str2);
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                notificationChannelGroup.setDescription(str3);
            }
            getNotificationManager().createNotificationChannelGroup(notificationChannelGroup);
        }
    }

    public void deleteNotificationChannelGroup(java.lang.String str) {
        if (str == null) {
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            getNotificationManager().deleteNotificationChannelGroup(str);
            return;
        }
        for (com.unity.androidnotifications.NotificationChannelWrapper notificationChannelWrapper : getNotificationChannels()) {
            if (str.equals(notificationChannelWrapper.group)) {
                deleteNotificationChannel(notificationChannelWrapper.id);
            }
        }
    }

    public void registerNotificationChannel(java.lang.String str, java.lang.String str2, int i, java.lang.String str3, boolean z, boolean z2, boolean z3, boolean z4, long[] jArr, int i2, java.lang.String str4) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel(str, str2, i);
            notificationChannel.setDescription(str3);
            notificationChannel.enableLights(z);
            notificationChannel.enableVibration(z2);
            notificationChannel.setBypassDnd(z3);
            notificationChannel.setShowBadge(z4);
            notificationChannel.setVibrationPattern(jArr);
            notificationChannel.setLockscreenVisibility(i2);
            notificationChannel.setGroup(str4);
            getNotificationManager().createNotificationChannel(notificationChannel);
            return;
        }
        android.content.SharedPreferences sharedPreferences = this.mContext.getSharedPreferences(NOTIFICATION_CHANNELS_SHARED_PREFS, 0);
        java.util.HashSet hashSet = new java.util.HashSet(sharedPreferences.getStringSet(NOTIFICATION_CHANNELS_SHARED_PREFS_KEY, new java.util.HashSet()));
        hashSet.add(str);
        android.content.SharedPreferences.Editor editorClear = sharedPreferences.edit().clear();
        editorClear.putStringSet(NOTIFICATION_CHANNELS_SHARED_PREFS_KEY, hashSet);
        editorClear.apply();
        android.content.SharedPreferences.Editor editorEdit = this.mContext.getSharedPreferences(getSharedPrefsNameByChannelId(str), 0).edit();
        editorEdit.putString(com.ironsource.y8.h.D0, str2);
        editorEdit.putInt("importance", i);
        editorEdit.putString("description", str3);
        editorEdit.putBoolean("enableLights", z);
        editorEdit.putBoolean("enableVibration", z2);
        editorEdit.putBoolean("canBypassDnd", z3);
        editorEdit.putBoolean("canShowBadge", z4);
        editorEdit.putString("vibrationPattern", java.util.Arrays.toString(jArr));
        editorEdit.putInt("lockscreenVisibility", i2);
        editorEdit.putString("group", str4);
        editorEdit.apply();
    }

    private static java.lang.String getSharedPrefsNameByChannelId(java.lang.String str) {
        return java.lang.String.format("unity_notification_channel_%s", str);
    }

    public com.unity.androidnotifications.NotificationChannelWrapper getNotificationChannel(java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            android.app.NotificationChannel notificationChannel = getNotificationManagerImpl(this.mContext).getNotificationManager().getNotificationChannel(str);
            if (notificationChannel == null) {
                return null;
            }
            return notificationChannelToWrapper(notificationChannel);
        }
        android.content.SharedPreferences sharedPreferences = this.mContext.getSharedPreferences(getSharedPrefsNameByChannelId(str), 0);
        com.unity.androidnotifications.NotificationChannelWrapper notificationChannelWrapper = new com.unity.androidnotifications.NotificationChannelWrapper();
        notificationChannelWrapper.id = str;
        notificationChannelWrapper.name = sharedPreferences.getString(com.ironsource.y8.h.D0, com.google.android.gms.ads.AdError.UNDEFINED_DOMAIN);
        notificationChannelWrapper.importance = sharedPreferences.getInt("importance", 3);
        notificationChannelWrapper.description = sharedPreferences.getString("description", com.google.android.gms.ads.AdError.UNDEFINED_DOMAIN);
        notificationChannelWrapper.enableLights = sharedPreferences.getBoolean("enableLights", false);
        notificationChannelWrapper.enableVibration = sharedPreferences.getBoolean("enableVibration", false);
        notificationChannelWrapper.canBypassDnd = sharedPreferences.getBoolean("canBypassDnd", false);
        notificationChannelWrapper.canShowBadge = sharedPreferences.getBoolean("canShowBadge", false);
        notificationChannelWrapper.lockscreenVisibility = sharedPreferences.getInt("lockscreenVisibility", 1);
        notificationChannelWrapper.group = sharedPreferences.getString("group", null);
        java.lang.String[] strArrSplit = sharedPreferences.getString("vibrationPattern", okhttp3.HttpUrl.PATH_SEGMENT_ENCODE_SET_URI).split(",");
        int length = strArrSplit.length;
        long[] jArr = new long[length];
        if (length > 1) {
            for (int i = 0; i < strArrSplit.length; i++) {
                try {
                    jArr[i] = java.lang.Long.parseLong(strArrSplit[i]);
                } catch (java.lang.NumberFormatException unused) {
                    jArr[i] = 1;
                }
            }
        }
        notificationChannelWrapper.vibrationPattern = length > 1 ? jArr : null;
        return notificationChannelWrapper;
    }

    private static com.unity.androidnotifications.NotificationChannelWrapper notificationChannelToWrapper(java.lang.Object obj) {
        android.app.NotificationChannel notificationChannel = (android.app.NotificationChannel) obj;
        com.unity.androidnotifications.NotificationChannelWrapper notificationChannelWrapper = new com.unity.androidnotifications.NotificationChannelWrapper();
        notificationChannelWrapper.id = notificationChannel.getId();
        notificationChannelWrapper.name = notificationChannel.getName().toString();
        notificationChannelWrapper.importance = notificationChannel.getImportance();
        notificationChannelWrapper.description = notificationChannel.getDescription();
        notificationChannelWrapper.enableLights = notificationChannel.shouldShowLights();
        notificationChannelWrapper.enableVibration = notificationChannel.shouldVibrate();
        notificationChannelWrapper.canBypassDnd = notificationChannel.canBypassDnd();
        notificationChannelWrapper.canShowBadge = notificationChannel.canShowBadge();
        notificationChannelWrapper.vibrationPattern = notificationChannel.getVibrationPattern();
        notificationChannelWrapper.lockscreenVisibility = notificationChannel.getLockscreenVisibility();
        notificationChannelWrapper.group = notificationChannel.getGroup();
        return notificationChannelWrapper;
    }

    public void deleteNotificationChannel(java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            getNotificationManager().deleteNotificationChannel(str);
            return;
        }
        android.content.SharedPreferences sharedPreferences = this.mContext.getSharedPreferences(NOTIFICATION_CHANNELS_SHARED_PREFS, 0);
        java.util.Set<java.lang.String> stringSet = sharedPreferences.getStringSet(NOTIFICATION_CHANNELS_SHARED_PREFS_KEY, new java.util.HashSet());
        if (stringSet.contains(str)) {
            java.util.HashSet hashSet = new java.util.HashSet(stringSet);
            hashSet.remove(str);
            android.content.SharedPreferences.Editor editorClear = sharedPreferences.edit().clear();
            editorClear.putStringSet(NOTIFICATION_CHANNELS_SHARED_PREFS_KEY, hashSet);
            editorClear.apply();
            this.mContext.getSharedPreferences(getSharedPrefsNameByChannelId(str), 0).edit().clear().apply();
        }
    }

    public com.unity.androidnotifications.NotificationChannelWrapper[] getNotificationChannels() {
        int i = 0;
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            java.util.List<android.app.NotificationChannel> notificationChannels = getNotificationManager().getNotificationChannels();
            if (notificationChannels.size() == 0) {
                return null;
            }
            com.unity.androidnotifications.NotificationChannelWrapper[] notificationChannelWrapperArr = new com.unity.androidnotifications.NotificationChannelWrapper[notificationChannels.size()];
            java.util.Iterator<android.app.NotificationChannel> it = notificationChannels.iterator();
            while (it.hasNext()) {
                notificationChannelWrapperArr[i] = notificationChannelToWrapper(it.next());
                i++;
            }
            return notificationChannelWrapperArr;
        }
        java.util.Set<java.lang.String> stringSet = this.mContext.getSharedPreferences(NOTIFICATION_CHANNELS_SHARED_PREFS, 0).getStringSet(NOTIFICATION_CHANNELS_SHARED_PREFS_KEY, new java.util.HashSet());
        if (stringSet.size() == 0) {
            return null;
        }
        com.unity.androidnotifications.NotificationChannelWrapper[] notificationChannelWrapperArr2 = new com.unity.androidnotifications.NotificationChannelWrapper[stringSet.size()];
        java.util.Iterator<java.lang.String> it2 = stringSet.iterator();
        while (it2.hasNext()) {
            notificationChannelWrapperArr2[i] = getNotificationChannel(it2.next());
            i++;
        }
        return notificationChannelWrapperArr2;
    }

    private int generateUniqueId() {
        int iNextInt = 0;
        do {
            iNextInt += this.mRandom.nextInt(1000);
        } while (this.mScheduledNotifications.containsKey(java.lang.Integer.valueOf(iNextInt)));
        return iNextInt;
    }

    public int scheduleNotification(android.app.Notification.Builder builder, boolean z) {
        int i;
        android.os.Bundle extras = builder.getExtras();
        if (extras.containsKey("id")) {
            i = builder.getExtras().getInt("id", -1);
        } else {
            int iGenerateUniqueId = generateUniqueId();
            extras.putInt("id", iGenerateUniqueId);
            i = iGenerateUniqueId;
        }
        this.mBackgroundThread.enqueueNotification(i, builder, z, this.mScheduledNotifications.putIfAbsent(java.lang.Integer.valueOf(i), builder) == null);
        return i;
    }

    void performNotificationScheduling(int i, android.app.Notification.Builder builder, boolean z) {
        android.os.Bundle extras = builder.getExtras();
        long j = extras.getLong(KEY_REPEAT_INTERVAL, -1L);
        long j2 = extras.getLong(KEY_FIRE_TIME, -1L);
        boolean z2 = j2 - java.util.Calendar.getInstance().getTime().getTime() < 1000;
        if (!z2 || j > 0) {
            if (z2) {
                j2 += j;
            }
            android.content.Intent intentBuildNotificationIntent = buildNotificationIntent();
            if (intentBuildNotificationIntent != null) {
                saveNotification(builder.build(), z);
                scheduleAlarmWithNotification(builder, intentBuildNotificationIntent, j2);
            }
        }
        if (z2) {
            notify(i, buildNotificationForSending(this.mOpenActivity, builder));
        }
    }

    void scheduleAlarmWithNotification(android.app.Notification.Builder builder, android.content.Intent intent, long j) {
        android.os.Bundle extras = builder.getExtras();
        int i = extras.getInt("id", -1);
        long j2 = extras.getLong(KEY_REPEAT_INTERVAL, -1L);
        this.mScheduledNotifications.put(java.lang.Integer.valueOf(i), builder);
        intent.putExtra(KEY_NOTIFICATION_ID, i);
        scheduleNotificationIntentAlarm(j2, j, getBroadcastPendingIntent(i, intent, androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE));
    }

    void scheduleAlarmWithNotification(android.app.Notification.Builder builder) {
        scheduleAlarmWithNotification(builder, buildNotificationIntent(), builder.getExtras().getLong(KEY_FIRE_TIME, 0L));
    }

    private android.app.Notification buildNotificationForSending(java.lang.Class cls, android.app.Notification.Builder builder) {
        int i = builder.getExtras().getInt("id", -1);
        android.content.Intent intent = new android.content.Intent(this.mContext, (java.lang.Class<?>) cls);
        intent.addFlags(com.google.android.gms.drive.DriveFile.MODE_READ_WRITE);
        intent.putExtra(KEY_NOTIFICATION_ID, i);
        builder.setContentIntent(getActivityPendingIntent(i, intent, 0));
        finalizeNotificationForDisplay(builder);
        return builder.build();
    }

    void performNotificationHousekeeping(java.util.Set<java.lang.String> set) {
        android.util.Log.d(TAG_UNITY, "Checking for invalid notification IDs still hanging around");
        java.util.Set<java.lang.String> setFindInvalidNotificationIds = findInvalidNotificationIds(set);
        java.util.HashSet hashSet = new java.util.HashSet(set);
        for (java.lang.String str : setFindInvalidNotificationIds) {
            hashSet.remove(str);
            this.mScheduledNotifications.remove(str);
        }
        java.util.Iterator<java.lang.String> it = setFindInvalidNotificationIds.iterator();
        while (it.hasNext()) {
            deleteExpiredNotificationIntent(it.next());
        }
    }

    private java.util.Set<java.lang.String> findInvalidNotificationIds(java.util.Set<java.lang.String> set) {
        android.content.Intent intentBuildNotificationIntent = buildNotificationIntent();
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.lang.String str : set) {
            if (getBroadcastPendingIntent(java.lang.Integer.valueOf(str).intValue(), intentBuildNotificationIntent, 536870912) == null) {
                hashSet.add(str);
            }
        }
        for (android.service.notification.StatusBarNotification statusBarNotification : getNotificationManager().getActiveNotifications()) {
            hashSet.remove(java.lang.String.valueOf(statusBarNotification.getId()));
        }
        if (com.unity3d.player.UnityPlayer.currentActivity != null) {
            android.content.Intent intent = com.unity3d.player.UnityPlayer.currentActivity.getIntent();
            if (intent.hasExtra(KEY_NOTIFICATION_ID)) {
                hashSet.remove(java.lang.String.valueOf(intent.getExtras().getInt(KEY_NOTIFICATION_ID)));
            }
        }
        return hashSet;
    }

    private android.content.Intent buildNotificationIntent() {
        android.content.Intent intent = new android.content.Intent(this.mContext, (java.lang.Class<?>) com.unity.androidnotifications.UnityNotificationManager.class);
        intent.setFlags(268468224);
        return intent;
    }

    private android.app.PendingIntent getActivityPendingIntent(int i, android.content.Intent intent, int i2) {
        return android.app.PendingIntent.getActivity(this.mContext, i, intent, i2 | 67108864);
    }

    private android.app.PendingIntent getBroadcastPendingIntent(int i, android.content.Intent intent, int i2) {
        return android.app.PendingIntent.getBroadcast(this.mContext, i, intent, i2 | 67108864);
    }

    synchronized void saveNotification(android.app.Notification notification, boolean z) {
        com.unity.androidnotifications.UnityNotificationUtilities.serializeNotification(this.mContext.getSharedPreferences(getSharedPrefsNameByNotificationId(java.lang.Integer.toString(notification.extras.getInt("id", -1))), 0), notification, z);
    }

    static java.lang.String getSharedPrefsNameByNotificationId(java.lang.String str) {
        return java.lang.String.format("u_notification_data_%s", str);
    }

    synchronized java.util.List<android.app.Notification.Builder> loadSavedNotifications() {
        java.util.ArrayList arrayList;
        android.app.Notification.Builder builderRecoverBuilder;
        java.util.Set<java.lang.String> scheduledNotificationIDs = getScheduledNotificationIDs();
        arrayList = new java.util.ArrayList();
        java.util.HashSet<java.lang.String> hashSet = new java.util.HashSet();
        for (java.lang.String str : scheduledNotificationIDs) {
            java.lang.Object objDeserializeNotification = com.unity.androidnotifications.UnityNotificationUtilities.deserializeNotification(this.mContext, this.mContext.getSharedPreferences(getSharedPrefsNameByNotificationId(str), 0));
            if (objDeserializeNotification == null) {
                builderRecoverBuilder = null;
            } else if (objDeserializeNotification instanceof android.app.Notification.Builder) {
                builderRecoverBuilder = (android.app.Notification.Builder) objDeserializeNotification;
            } else {
                builderRecoverBuilder = com.unity.androidnotifications.UnityNotificationUtilities.recoverBuilder(this.mContext, (android.app.Notification) objDeserializeNotification);
            }
            if (builderRecoverBuilder != null) {
                arrayList.add(builderRecoverBuilder);
            } else {
                hashSet.add(str);
            }
        }
        if (hashSet.size() > 0) {
            java.util.HashSet hashSet2 = new java.util.HashSet(scheduledNotificationIDs);
            for (java.lang.String str2 : hashSet) {
                hashSet2.remove(str2);
                deleteExpiredNotificationIntent(str2);
            }
            saveScheduledNotificationIDs(hashSet2);
        }
        return arrayList;
    }

    private boolean canScheduleExactAlarms(android.app.AlarmManager alarmManager) {
        android.os.Bundle appMetadata;
        if (this.mExactSchedulingSetting < 0 && (appMetadata = getAppMetadata()) != null) {
            this.mExactSchedulingSetting = appMetadata.getInt("com.unity.androidnotifications.exact_scheduling", 1);
        }
        if (this.mExactSchedulingSetting == 0) {
            return false;
        }
        if (android.os.Build.VERSION.SDK_INT < 31) {
            return true;
        }
        return alarmManager.canScheduleExactAlarms();
    }

    public boolean canScheduleExactAlarms() {
        return canScheduleExactAlarms((android.app.AlarmManager) this.mContext.getSystemService(androidx.core.app.NotificationCompat.CATEGORY_ALARM));
    }

    private void scheduleNotificationIntentAlarm(long j, long j2, android.app.PendingIntent pendingIntent) {
        android.app.AlarmManager alarmManager = (android.app.AlarmManager) this.mContext.getSystemService(androidx.core.app.NotificationCompat.CATEGORY_ALARM);
        if (j <= 0) {
            if (canScheduleExactAlarms(alarmManager)) {
                alarmManager.setExactAndAllowWhileIdle(0, j2, pendingIntent);
                return;
            } else {
                alarmManager.set(0, j2, pendingIntent);
                return;
            }
        }
        alarmManager.setInexactRepeating(0, j2, j, pendingIntent);
    }

    public int checkNotificationStatus(int i) {
        for (android.service.notification.StatusBarNotification statusBarNotification : getNotificationManager().getActiveNotifications()) {
            if (i == statusBarNotification.getId()) {
                return 2;
            }
        }
        return (this.mScheduledNotifications.containsKey(java.lang.Integer.valueOf(i)) || checkIfPendingNotificationIsRegistered(i)) ? 1 : 0;
    }

    public boolean checkIfPendingNotificationIsRegistered(int i) {
        return getBroadcastPendingIntent(i, new android.content.Intent(this.mActivity, (java.lang.Class<?>) com.unity.androidnotifications.UnityNotificationManager.class), 536870912) != null;
    }

    public void cancelAllPendingNotificationIntents() {
        this.mBackgroundThread.enqueueCancelAllNotifications();
    }

    private synchronized java.util.Set<java.lang.String> getScheduledNotificationIDs() {
        return this.mContext.getSharedPreferences(NOTIFICATION_IDS_SHARED_PREFS, 0).getStringSet(NOTIFICATION_IDS_SHARED_PREFS_KEY, new java.util.HashSet());
    }

    synchronized void saveScheduledNotificationIDs(java.util.Set<java.lang.String> set) {
        android.content.SharedPreferences.Editor editorClear = this.mContext.getSharedPreferences(NOTIFICATION_IDS_SHARED_PREFS, 0).edit().clear();
        editorClear.putStringSet(NOTIFICATION_IDS_SHARED_PREFS_KEY, set);
        editorClear.apply();
    }

    public void cancelPendingNotification(int i) {
        this.mBackgroundThread.enqueueCancelNotification(i);
    }

    void cancelPendingNotificationIntent(int i) {
        android.app.PendingIntent broadcastPendingIntent = getBroadcastPendingIntent(i, new android.content.Intent(this.mContext, (java.lang.Class<?>) com.unity.androidnotifications.UnityNotificationManager.class), 536870912);
        if (broadcastPendingIntent != null) {
            ((android.app.AlarmManager) this.mContext.getSystemService(androidx.core.app.NotificationCompat.CATEGORY_ALARM)).cancel(broadcastPendingIntent);
            broadcastPendingIntent.cancel();
        }
    }

    synchronized void deleteExpiredNotificationIntent(java.lang.String str) {
        this.mContext.getSharedPreferences(getSharedPrefsNameByNotificationId(str), 0).edit().clear().apply();
    }

    public void cancelDisplayedNotification(int i) {
        getNotificationManager().cancel(i);
    }

    public void cancelAllNotifications() {
        getNotificationManager().cancelAll();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        getNotificationManagerImpl(context).onReceive(intent);
    }

    public void onReceive(android.content.Intent intent) {
        showNotification(intent);
    }

    private void showNotification(android.content.Intent intent) {
        java.lang.Object notificationOrIdForIntent = getNotificationOrIdForIntent(intent);
        if (notificationOrIdForIntent == null) {
            return;
        }
        if (notificationOrIdForIntent instanceof android.app.Notification) {
            android.app.Notification notification = (android.app.Notification) notificationOrIdForIntent;
            notify(notification.extras.getInt("id", -1), notification);
            return;
        }
        final java.lang.Integer num = (java.lang.Integer) notificationOrIdForIntent;
        android.app.Notification.Builder builder = this.mScheduledNotifications.get(num);
        if (builder != null) {
            notify(num.intValue(), builder);
        } else {
            android.os.AsyncTask.execute(new java.lang.Runnable() { // from class: com.unity.androidnotifications.UnityNotificationManager$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1088x329bd7ea(num);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$showNotification$0$com-unity-androidnotifications-UnityNotificationManager, reason: not valid java name */
    /* synthetic */ void m1088x329bd7ea(java.lang.Integer num) {
        android.app.Notification.Builder builderDeserializeNotificationBuilder = deserializeNotificationBuilder(num);
        if (builderDeserializeNotificationBuilder == null) {
            android.util.Log.e(TAG_UNITY, "Failed to recover builder, can't send notification");
        } else {
            notify(num.intValue(), builderDeserializeNotificationBuilder);
        }
    }

    void notify(int i, android.app.Notification.Builder builder) {
        java.lang.Class<?> openAppActivity = this.mOpenActivity;
        if (openAppActivity == null && (openAppActivity = com.unity.androidnotifications.UnityNotificationUtilities.getOpenAppActivity(this.mContext)) == null) {
            android.util.Log.e(TAG_UNITY, "Activity not found, cannot show notification");
            return;
        }
        android.app.Notification notificationBuildNotificationForSending = buildNotificationForSending(openAppActivity, builder);
        if (notificationBuildNotificationForSending != null) {
            notify(i, notificationBuildNotificationForSending);
        }
    }

    private void notify(int i, android.app.Notification notification) {
        boolean z = notification.extras.getBoolean(KEY_SHOW_IN_FOREGROUND, true);
        if (!isInForeground() || z) {
            getNotificationManager().notify(i, notification);
        }
        if (notification.extras.getLong(KEY_REPEAT_INTERVAL, -1L) <= 0) {
            this.mScheduledNotifications.remove(java.lang.Integer.valueOf(i));
            cancelPendingNotificationIntent(i);
        }
        try {
            com.unity.androidnotifications.NotificationCallback notificationCallback = this.mNotificationCallback;
            if (notificationCallback != null) {
                notificationCallback.onSentNotification(notification);
            }
        } catch (java.lang.RuntimeException unused) {
            android.util.Log.w(TAG_UNITY, "Can not invoke OnNotificationReceived event when the app is not running!");
        }
    }

    public static java.lang.Integer getNotificationColor(android.app.Notification notification) {
        if (android.os.Build.VERSION.SDK_INT < 26 || notification.extras.containsKey(androidx.core.app.NotificationCompat.EXTRA_COLORIZED)) {
            return java.lang.Integer.valueOf(notification.color);
        }
        return null;
    }

    public static int getNotificationGroupAlertBehavior(android.app.Notification notification) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return notification.getGroupAlertBehavior();
        }
        return 0;
    }

    private void finalizeNotificationForDisplay(android.app.Notification.Builder builder) {
        java.lang.String string = builder.getExtras().getString(KEY_SMALL_ICON);
        java.lang.Object iconForUri = getIconForUri(string);
        if (iconForUri != null) {
            builder.setSmallIcon((android.graphics.drawable.Icon) iconForUri);
        } else {
            int iFindResourceIdInContextByName = com.unity.androidnotifications.UnityNotificationUtilities.findResourceIdInContextByName(this.mContext, string);
            if (iFindResourceIdInContextByName == 0) {
                iFindResourceIdInContextByName = this.mContext.getApplicationInfo().icon;
            }
            builder.setSmallIcon(iFindResourceIdInContextByName);
        }
        java.lang.Object icon = getIcon(builder.getExtras().getString(KEY_LARGE_ICON));
        if (icon != null) {
            if (icon instanceof android.graphics.drawable.Icon) {
                builder.setLargeIcon((android.graphics.drawable.Icon) icon);
            } else {
                builder.setLargeIcon((android.graphics.Bitmap) icon);
            }
        }
        setupBigPictureStyle(builder);
    }

    private java.lang.Object getIcon(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return android.graphics.BitmapFactory.decodeFile(str);
        }
        java.lang.Object iconForUri = getIconForUri(str);
        return iconForUri != null ? iconForUri : getIconFromResources(str, false);
    }

    private java.lang.Object getIconForUri(java.lang.String str) {
        if (str == null || str.length() == 0 || str.indexOf("://") <= 0) {
            return null;
        }
        return android.graphics.drawable.Icon.createWithContentUri(str);
    }

    private java.lang.Object getIconFromResources(java.lang.String str, boolean z) {
        int iFindResourceIdInContextByName = com.unity.androidnotifications.UnityNotificationUtilities.findResourceIdInContextByName(this.mContext, str);
        if (iFindResourceIdInContextByName == 0) {
            return null;
        }
        if (!z) {
            return android.graphics.drawable.Icon.createWithResource(this.mContext, iFindResourceIdInContextByName);
        }
        return android.graphics.BitmapFactory.decodeResource(this.mContext.getResources(), iFindResourceIdInContextByName);
    }

    private android.graphics.Bitmap loadBitmap(java.lang.String str) {
        try {
            return android.graphics.BitmapFactory.decodeStream(this.mContext.getContentResolver().openInputStream(android.net.Uri.parse(str)));
        } catch (java.lang.Exception e) {
            android.util.Log.e(TAG_UNITY, "Failed to load image " + str, e);
            return null;
        }
    }

    public android.app.Notification.Builder createNotificationBuilder(java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT < 26) {
            android.app.Notification.Builder builder = new android.app.Notification.Builder(this.mContext);
            com.unity.androidnotifications.NotificationChannelWrapper notificationChannel = getNotificationChannel(str);
            int i = -1;
            if (notificationChannel.vibrationPattern != null && notificationChannel.vibrationPattern.length > 0) {
                builder.setDefaults(5);
                builder.setVibrate(notificationChannel.vibrationPattern);
            } else {
                builder.setDefaults(-1);
            }
            builder.setVisibility(notificationChannel.lockscreenVisibility);
            int i2 = notificationChannel.importance;
            if (i2 == 0) {
                i = -2;
            } else if (i2 != 2) {
                i = (i2 == 3 || i2 != 4) ? 0 : 2;
            }
            builder.setPriority(i);
            builder.getExtras().putString(KEY_CHANNEL_ID, str);
            return builder;
        }
        return new android.app.Notification.Builder(this.mContext, str);
    }

    public static void setNotificationIcon(android.app.Notification.Builder builder, java.lang.String str, java.lang.String str2) {
        if (str2 == null || (str2.length() == 0 && builder.getExtras().getString(str) != null)) {
            builder.getExtras().remove(str);
        } else {
            builder.getExtras().putString(str, str2);
        }
    }

    public void setupBigPictureStyle(android.app.Notification.Builder builder, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z) {
        android.os.Bundle extras = builder.getExtras();
        if (str2 == null || str2.length() == 0) {
            return;
        }
        extras.putString(KEY_BIG_LARGE_ICON, str);
        extras.putString(KEY_BIG_PICTURE, str2);
        extras.putString(KEY_BIG_CONTENT_TITLE, str3);
        extras.putString(KEY_BIG_SUMMARY_TEXT, str5);
        extras.putString(KEY_BIG_CONTENT_DESCRIPTION, str4);
        extras.putBoolean(KEY_BIG_SHOW_WHEN_COLLAPSED, z);
    }

    private void setupBigPictureStyle(android.app.Notification.Builder builder) {
        android.os.Bundle extras = builder.getExtras();
        java.lang.String string = extras.getString(KEY_BIG_PICTURE);
        if (string == null) {
            return;
        }
        android.app.Notification.BigPictureStyle bigPictureStyle = new android.app.Notification.BigPictureStyle();
        java.lang.Object icon = getIcon(extras.getString(KEY_BIG_LARGE_ICON));
        if (icon != null) {
            if (icon instanceof android.graphics.drawable.Icon) {
                bigPictureStyle.bigLargeIcon((android.graphics.drawable.Icon) icon);
            } else {
                bigPictureStyle.bigLargeIcon((android.graphics.Bitmap) icon);
            }
        }
        if (string.charAt(0) == '/') {
            bigPictureStyle.bigPicture(android.graphics.BitmapFactory.decodeFile(string));
        } else if (string.indexOf("://") > 0) {
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                bigPictureStyle.bigPicture(android.graphics.drawable.Icon.createWithContentUri(string));
            } else {
                android.graphics.Bitmap bitmapLoadBitmap = loadBitmap(string);
                if (bitmapLoadBitmap != null) {
                    bigPictureStyle.bigPicture(bitmapLoadBitmap);
                }
            }
        } else {
            java.lang.Object iconFromResources = getIconFromResources(string, android.os.Build.VERSION.SDK_INT < 31);
            if (android.os.Build.VERSION.SDK_INT >= 31 && (iconFromResources instanceof android.graphics.drawable.Icon)) {
                bigPictureStyle.bigPicture((android.graphics.drawable.Icon) iconFromResources);
            } else if (iconFromResources instanceof android.graphics.Bitmap) {
                bigPictureStyle.bigPicture((android.graphics.Bitmap) iconFromResources);
            }
        }
        bigPictureStyle.setBigContentTitle(extras.getString(KEY_BIG_CONTENT_TITLE));
        bigPictureStyle.setSummaryText(extras.getString(KEY_BIG_SUMMARY_TEXT));
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            bigPictureStyle.setContentDescription(extras.getString(KEY_BIG_CONTENT_DESCRIPTION));
            bigPictureStyle.showBigPictureWhenCollapsed(extras.getBoolean(KEY_BIG_SHOW_WHEN_COLLAPSED, false));
        }
        builder.setStyle(bigPictureStyle);
    }

    public static void setNotificationColor(android.app.Notification.Builder builder, int i) {
        if (i != 0) {
            builder.setColor(i);
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                builder.setColorized(true);
            }
        }
    }

    public static void setNotificationUsesChronometer(android.app.Notification.Builder builder, boolean z) {
        builder.setUsesChronometer(z);
    }

    public static void setNotificationGroupAlertBehavior(android.app.Notification.Builder builder, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            builder.setGroupAlertBehavior(i);
        }
    }

    public static java.lang.String getNotificationChannelId(android.app.Notification notification) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return notification.getChannelId();
        }
        return null;
    }

    private static boolean isInForeground() {
        android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new android.app.ActivityManager.RunningAppProcessInfo();
        android.app.ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo.importance == 100 || runningAppProcessInfo.importance == 200;
    }

    public android.app.Notification getNotificationFromIntent(android.content.Intent intent) {
        if (intent.hasExtra(KEY_NOTIFICATION_ID)) {
            int i = intent.getExtras().getInt(KEY_NOTIFICATION_ID);
            for (android.service.notification.StatusBarNotification statusBarNotification : getNotificationManager().getActiveNotifications()) {
                if (statusBarNotification.getId() == i) {
                    return statusBarNotification.getNotification();
                }
            }
        }
        java.lang.Object notificationOrBuilderForIntent = getNotificationOrBuilderForIntent(intent);
        if (notificationOrBuilderForIntent == null) {
            return null;
        }
        if (notificationOrBuilderForIntent instanceof android.app.Notification) {
            return (android.app.Notification) notificationOrBuilderForIntent;
        }
        return ((android.app.Notification.Builder) notificationOrBuilderForIntent).build();
    }

    private java.lang.Object getNotificationOrIdForIntent(android.content.Intent intent) {
        if (intent.hasExtra(KEY_NOTIFICATION_ID)) {
            return java.lang.Integer.valueOf(intent.getExtras().getInt(KEY_NOTIFICATION_ID));
        }
        if (intent.hasExtra(KEY_NOTIFICATION)) {
            return intent.getParcelableExtra(KEY_NOTIFICATION);
        }
        return null;
    }

    private java.lang.Object getNotificationOrBuilderForIntent(android.content.Intent intent) {
        java.lang.Object notificationOrIdForIntent = getNotificationOrIdForIntent(intent);
        if (!(notificationOrIdForIntent instanceof java.lang.Integer)) {
            return notificationOrIdForIntent;
        }
        java.lang.Integer num = (java.lang.Integer) notificationOrIdForIntent;
        android.app.Notification.Builder builder = this.mScheduledNotifications.get(num);
        return builder == null ? deserializeNotificationBuilder(num) : builder;
    }

    private android.app.Notification.Builder deserializeNotificationBuilder(java.lang.Integer num) {
        java.lang.Object objDeserializeNotification = com.unity.androidnotifications.UnityNotificationUtilities.deserializeNotification(this.mContext, this.mContext.getSharedPreferences(getSharedPrefsNameByNotificationId(num.toString()), 0));
        if (objDeserializeNotification == null) {
            return null;
        }
        if (objDeserializeNotification instanceof android.app.Notification) {
            return com.unity.androidnotifications.UnityNotificationUtilities.recoverBuilder(this.mContext, (android.app.Notification) objDeserializeNotification);
        }
        return (android.app.Notification.Builder) objDeserializeNotification;
    }

    public void showNotificationSettings(java.lang.String str) {
        android.content.Intent intent;
        if (android.os.Build.VERSION.SDK_INT < 26) {
            intent = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(android.net.Uri.fromParts("package", this.mContext.getPackageName(), null));
        } else {
            if (str != null && str.length() > 0) {
                android.content.Intent intent2 = new android.content.Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
                intent2.putExtra("android.provider.extra.CHANNEL_ID", str);
                intent = intent2;
            } else {
                intent = new android.content.Intent("android.settings.APP_NOTIFICATION_SETTINGS");
            }
            intent.putExtra("android.provider.extra.APP_PACKAGE", this.mContext.getPackageName());
        }
        intent.addFlags(268435456);
        this.mActivity.startActivity(intent);
    }
}
