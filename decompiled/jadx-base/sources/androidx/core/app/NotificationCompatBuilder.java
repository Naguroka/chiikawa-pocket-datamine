package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
class NotificationCompatBuilder implements androidx.core.app.NotificationBuilderWithBuilderAccessor {
    private android.widget.RemoteViews mBigContentView;
    private final android.app.Notification.Builder mBuilder;
    private final androidx.core.app.NotificationCompat.Builder mBuilderCompat;
    private android.widget.RemoteViews mContentView;
    private final android.content.Context mContext;
    private int mGroupAlertBehavior;
    private android.widget.RemoteViews mHeadsUpContentView;
    private final java.util.List<android.os.Bundle> mActionExtrasList = new java.util.ArrayList();
    private final android.os.Bundle mExtras = new android.os.Bundle();

    NotificationCompatBuilder(androidx.core.app.NotificationCompat.Builder builder) {
        java.util.List listCombineLists;
        this.mBuilderCompat = builder;
        this.mContext = builder.mContext;
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            this.mBuilder = new android.app.Notification.Builder(builder.mContext, builder.mChannelId);
        } else {
            this.mBuilder = new android.app.Notification.Builder(builder.mContext);
        }
        android.app.Notification notification = builder.mNotification;
        this.mBuilder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, builder.mTickerView).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(builder.mContentTitle).setContentText(builder.mContentText).setContentInfo(builder.mContentInfo).setContentIntent(builder.mContentIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(builder.mFullScreenIntent, (notification.flags & 128) != 0).setLargeIcon(builder.mLargeIcon).setNumber(builder.mNumber).setProgress(builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate);
        this.mBuilder.setSubText(builder.mSubText).setUsesChronometer(builder.mUseChronometer).setPriority(builder.mPriority);
        java.util.Iterator<androidx.core.app.NotificationCompat.Action> it = builder.mActions.iterator();
        while (it.hasNext()) {
            addAction(it.next());
        }
        if (builder.mExtras != null) {
            this.mExtras.putAll(builder.mExtras);
        }
        this.mContentView = builder.mContentView;
        this.mBigContentView = builder.mBigContentView;
        this.mBuilder.setShowWhen(builder.mShowWhen);
        this.mBuilder.setLocalOnly(builder.mLocalOnly).setGroup(builder.mGroupKey).setGroupSummary(builder.mGroupSummary).setSortKey(builder.mSortKey);
        this.mGroupAlertBehavior = builder.mGroupAlertBehavior;
        this.mBuilder.setCategory(builder.mCategory).setColor(builder.mColor).setVisibility(builder.mVisibility).setPublicVersion(builder.mPublicVersion).setSound(notification.sound, notification.audioAttributes);
        if (android.os.Build.VERSION.SDK_INT < 28) {
            listCombineLists = combineLists(getPeople(builder.mPersonList), builder.mPeople);
        } else {
            listCombineLists = builder.mPeople;
        }
        if (listCombineLists != null && !listCombineLists.isEmpty()) {
            java.util.Iterator it2 = listCombineLists.iterator();
            while (it2.hasNext()) {
                this.mBuilder.addPerson((java.lang.String) it2.next());
            }
        }
        this.mHeadsUpContentView = builder.mHeadsUpContentView;
        if (builder.mInvisibleActions.size() > 0) {
            android.os.Bundle bundle = builder.getExtras().getBundle("android.car.EXTENSIONS");
            bundle = bundle == null ? new android.os.Bundle() : bundle;
            android.os.Bundle bundle2 = new android.os.Bundle(bundle);
            android.os.Bundle bundle3 = new android.os.Bundle();
            for (int i = 0; i < builder.mInvisibleActions.size(); i++) {
                bundle3.putBundle(java.lang.Integer.toString(i), androidx.core.app.NotificationCompatJellybean.getBundleForAction(builder.mInvisibleActions.get(i)));
            }
            bundle.putBundle("invisible_actions", bundle3);
            bundle2.putBundle("invisible_actions", bundle3);
            builder.getExtras().putBundle("android.car.EXTENSIONS", bundle);
            this.mExtras.putBundle("android.car.EXTENSIONS", bundle2);
        }
        if (builder.mSmallIcon != null) {
            this.mBuilder.setSmallIcon(builder.mSmallIcon);
        }
        this.mBuilder.setExtras(builder.mExtras).setRemoteInputHistory(builder.mRemoteInputHistory);
        if (builder.mContentView != null) {
            this.mBuilder.setCustomContentView(builder.mContentView);
        }
        if (builder.mBigContentView != null) {
            this.mBuilder.setCustomBigContentView(builder.mBigContentView);
        }
        if (builder.mHeadsUpContentView != null) {
            this.mBuilder.setCustomHeadsUpContentView(builder.mHeadsUpContentView);
        }
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            this.mBuilder.setBadgeIconType(builder.mBadgeIcon).setSettingsText(builder.mSettingsText).setShortcutId(builder.mShortcutId).setTimeoutAfter(builder.mTimeout).setGroupAlertBehavior(builder.mGroupAlertBehavior);
            if (builder.mColorizedSet) {
                this.mBuilder.setColorized(builder.mColorized);
            }
            if (!android.text.TextUtils.isEmpty(builder.mChannelId)) {
                this.mBuilder.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            java.util.Iterator<androidx.core.app.Person> it3 = builder.mPersonList.iterator();
            while (it3.hasNext()) {
                this.mBuilder.addPerson(it3.next().toAndroidPerson());
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            this.mBuilder.setAllowSystemGeneratedContextualActions(builder.mAllowSystemGeneratedContextualActions);
            this.mBuilder.setBubbleMetadata(androidx.core.app.NotificationCompat.BubbleMetadata.toPlatform(builder.mBubbleMetadata));
            if (builder.mLocusId != null) {
                this.mBuilder.setLocusId(builder.mLocusId.toLocusId());
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 31 && builder.mFgsDeferBehavior != 0) {
            this.mBuilder.setForegroundServiceBehavior(builder.mFgsDeferBehavior);
        }
        if (builder.mSilent) {
            if (this.mBuilderCompat.mGroupSummary) {
                this.mGroupAlertBehavior = 2;
            } else {
                this.mGroupAlertBehavior = 1;
            }
            this.mBuilder.setVibrate(null);
            this.mBuilder.setSound(null);
            notification.defaults &= -2;
            notification.defaults &= -3;
            this.mBuilder.setDefaults(notification.defaults);
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                if (android.text.TextUtils.isEmpty(this.mBuilderCompat.mGroupKey)) {
                    this.mBuilder.setGroup(androidx.core.app.NotificationCompat.GROUP_KEY_SILENT);
                }
                this.mBuilder.setGroupAlertBehavior(this.mGroupAlertBehavior);
            }
        }
    }

    private static java.util.List<java.lang.String> combineLists(java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        androidx.collection.ArraySet arraySet = new androidx.collection.ArraySet(list.size() + list2.size());
        arraySet.addAll(list);
        arraySet.addAll(list2);
        return new java.util.ArrayList(arraySet);
    }

    private static java.util.List<java.lang.String> getPeople(java.util.List<androidx.core.app.Person> list) {
        if (list == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator<androidx.core.app.Person> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().resolveToLegacyUri());
        }
        return arrayList;
    }

    @Override // androidx.core.app.NotificationBuilderWithBuilderAccessor
    public android.app.Notification.Builder getBuilder() {
        return this.mBuilder;
    }

    android.content.Context getContext() {
        return this.mContext;
    }

    public android.app.Notification build() {
        android.os.Bundle extras;
        android.widget.RemoteViews remoteViewsMakeHeadsUpContentView;
        android.widget.RemoteViews remoteViewsMakeBigContentView;
        androidx.core.app.NotificationCompat.Style style = this.mBuilderCompat.mStyle;
        if (style != null) {
            style.apply(this);
        }
        android.widget.RemoteViews remoteViewsMakeContentView = style != null ? style.makeContentView(this) : null;
        android.app.Notification notificationBuildInternal = buildInternal();
        if (remoteViewsMakeContentView != null) {
            notificationBuildInternal.contentView = remoteViewsMakeContentView;
        } else if (this.mBuilderCompat.mContentView != null) {
            notificationBuildInternal.contentView = this.mBuilderCompat.mContentView;
        }
        if (style != null && (remoteViewsMakeBigContentView = style.makeBigContentView(this)) != null) {
            notificationBuildInternal.bigContentView = remoteViewsMakeBigContentView;
        }
        if (style != null && (remoteViewsMakeHeadsUpContentView = this.mBuilderCompat.mStyle.makeHeadsUpContentView(this)) != null) {
            notificationBuildInternal.headsUpContentView = remoteViewsMakeHeadsUpContentView;
        }
        if (style != null && (extras = androidx.core.app.NotificationCompat.getExtras(notificationBuildInternal)) != null) {
            style.addCompatExtras(extras);
        }
        return notificationBuildInternal;
    }

    private void addAction(androidx.core.app.NotificationCompat.Action action) {
        android.os.Bundle bundle;
        androidx.core.graphics.drawable.IconCompat iconCompat = action.getIconCompat();
        android.app.Notification.Action.Builder builder = new android.app.Notification.Action.Builder(iconCompat != null ? iconCompat.toIcon() : null, action.getTitle(), action.getActionIntent());
        if (action.getRemoteInputs() != null) {
            for (android.app.RemoteInput remoteInput : androidx.core.app.RemoteInput.fromCompat(action.getRemoteInputs())) {
                builder.addRemoteInput(remoteInput);
            }
        }
        if (action.getExtras() != null) {
            bundle = new android.os.Bundle(action.getExtras());
        } else {
            bundle = new android.os.Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
        builder.setAllowGeneratedReplies(action.getAllowGeneratedReplies());
        bundle.putInt("android.support.action.semanticAction", action.getSemanticAction());
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            builder.setSemanticAction(action.getSemanticAction());
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            builder.setContextual(action.isContextual());
        }
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            builder.setAuthenticationRequired(action.isAuthenticationRequired());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", action.getShowsUserInterface());
        builder.addExtras(bundle);
        this.mBuilder.addAction(builder.build());
    }

    protected android.app.Notification buildInternal() {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return this.mBuilder.build();
        }
        android.app.Notification notificationBuild = this.mBuilder.build();
        if (this.mGroupAlertBehavior != 0) {
            if (notificationBuild.getGroup() != null && (notificationBuild.flags & 512) != 0 && this.mGroupAlertBehavior == 2) {
                removeSoundAndVibration(notificationBuild);
            }
            if (notificationBuild.getGroup() != null && (notificationBuild.flags & 512) == 0 && this.mGroupAlertBehavior == 1) {
                removeSoundAndVibration(notificationBuild);
            }
        }
        return notificationBuild;
    }

    private void removeSoundAndVibration(android.app.Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }
}
