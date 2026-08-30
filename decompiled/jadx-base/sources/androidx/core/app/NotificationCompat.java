package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public class NotificationCompat {
    public static final int BADGE_ICON_LARGE = 2;
    public static final int BADGE_ICON_NONE = 0;
    public static final int BADGE_ICON_SMALL = 1;
    public static final java.lang.String CATEGORY_ALARM = "alarm";
    public static final java.lang.String CATEGORY_CALL = "call";
    public static final java.lang.String CATEGORY_EMAIL = "email";
    public static final java.lang.String CATEGORY_ERROR = "err";
    public static final java.lang.String CATEGORY_EVENT = "event";
    public static final java.lang.String CATEGORY_LOCATION_SHARING = "location_sharing";
    public static final java.lang.String CATEGORY_MESSAGE = "msg";
    public static final java.lang.String CATEGORY_MISSED_CALL = "missed_call";
    public static final java.lang.String CATEGORY_NAVIGATION = "navigation";
    public static final java.lang.String CATEGORY_PROGRESS = "progress";
    public static final java.lang.String CATEGORY_PROMO = "promo";
    public static final java.lang.String CATEGORY_RECOMMENDATION = "recommendation";
    public static final java.lang.String CATEGORY_REMINDER = "reminder";
    public static final java.lang.String CATEGORY_SERVICE = "service";
    public static final java.lang.String CATEGORY_SOCIAL = "social";
    public static final java.lang.String CATEGORY_STATUS = "status";
    public static final java.lang.String CATEGORY_STOPWATCH = "stopwatch";
    public static final java.lang.String CATEGORY_SYSTEM = "sys";
    public static final java.lang.String CATEGORY_TRANSPORT = "transport";
    public static final java.lang.String CATEGORY_WORKOUT = "workout";
    public static final int COLOR_DEFAULT = 0;
    public static final int DEFAULT_ALL = -1;
    public static final int DEFAULT_LIGHTS = 4;
    public static final int DEFAULT_SOUND = 1;
    public static final int DEFAULT_VIBRATE = 2;
    public static final java.lang.String EXTRA_AUDIO_CONTENTS_URI = "android.audioContents";
    public static final java.lang.String EXTRA_BACKGROUND_IMAGE_URI = "android.backgroundImageUri";
    public static final java.lang.String EXTRA_BIG_TEXT = "android.bigText";
    public static final java.lang.String EXTRA_CHANNEL_GROUP_ID = "android.intent.extra.CHANNEL_GROUP_ID";
    public static final java.lang.String EXTRA_CHANNEL_ID = "android.intent.extra.CHANNEL_ID";
    public static final java.lang.String EXTRA_CHRONOMETER_COUNT_DOWN = "android.chronometerCountDown";
    public static final java.lang.String EXTRA_COLORIZED = "android.colorized";
    public static final java.lang.String EXTRA_COMPACT_ACTIONS = "android.compactActions";
    public static final java.lang.String EXTRA_COMPAT_TEMPLATE = "androidx.core.app.extra.COMPAT_TEMPLATE";
    public static final java.lang.String EXTRA_CONVERSATION_TITLE = "android.conversationTitle";
    public static final java.lang.String EXTRA_HIDDEN_CONVERSATION_TITLE = "android.hiddenConversationTitle";
    public static final java.lang.String EXTRA_HISTORIC_MESSAGES = "android.messages.historic";
    public static final java.lang.String EXTRA_INFO_TEXT = "android.infoText";
    public static final java.lang.String EXTRA_IS_GROUP_CONVERSATION = "android.isGroupConversation";
    public static final java.lang.String EXTRA_LARGE_ICON = "android.largeIcon";
    public static final java.lang.String EXTRA_LARGE_ICON_BIG = "android.largeIcon.big";
    public static final java.lang.String EXTRA_MEDIA_SESSION = "android.mediaSession";
    public static final java.lang.String EXTRA_MESSAGES = "android.messages";
    public static final java.lang.String EXTRA_MESSAGING_STYLE_USER = "android.messagingStyleUser";
    public static final java.lang.String EXTRA_NOTIFICATION_ID = "android.intent.extra.NOTIFICATION_ID";
    public static final java.lang.String EXTRA_NOTIFICATION_TAG = "android.intent.extra.NOTIFICATION_TAG";

    @java.lang.Deprecated
    public static final java.lang.String EXTRA_PEOPLE = "android.people";
    public static final java.lang.String EXTRA_PEOPLE_LIST = "android.people.list";
    public static final java.lang.String EXTRA_PICTURE = "android.picture";
    public static final java.lang.String EXTRA_PICTURE_CONTENT_DESCRIPTION = "android.pictureContentDescription";
    public static final java.lang.String EXTRA_PICTURE_ICON = "android.pictureIcon";
    public static final java.lang.String EXTRA_PROGRESS = "android.progress";
    public static final java.lang.String EXTRA_PROGRESS_INDETERMINATE = "android.progressIndeterminate";
    public static final java.lang.String EXTRA_PROGRESS_MAX = "android.progressMax";
    public static final java.lang.String EXTRA_REMOTE_INPUT_HISTORY = "android.remoteInputHistory";
    public static final java.lang.String EXTRA_SELF_DISPLAY_NAME = "android.selfDisplayName";
    public static final java.lang.String EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED = "android.showBigPictureWhenCollapsed";
    public static final java.lang.String EXTRA_SHOW_CHRONOMETER = "android.showChronometer";
    public static final java.lang.String EXTRA_SHOW_WHEN = "android.showWhen";
    public static final java.lang.String EXTRA_SMALL_ICON = "android.icon";
    public static final java.lang.String EXTRA_SUB_TEXT = "android.subText";
    public static final java.lang.String EXTRA_SUMMARY_TEXT = "android.summaryText";
    public static final java.lang.String EXTRA_TEMPLATE = "android.template";
    public static final java.lang.String EXTRA_TEXT = "android.text";
    public static final java.lang.String EXTRA_TEXT_LINES = "android.textLines";
    public static final java.lang.String EXTRA_TITLE = "android.title";
    public static final java.lang.String EXTRA_TITLE_BIG = "android.title.big";
    public static final int FLAG_AUTO_CANCEL = 16;
    public static final int FLAG_BUBBLE = 4096;
    public static final int FLAG_FOREGROUND_SERVICE = 64;
    public static final int FLAG_GROUP_SUMMARY = 512;

    @java.lang.Deprecated
    public static final int FLAG_HIGH_PRIORITY = 128;
    public static final int FLAG_INSISTENT = 4;
    public static final int FLAG_LOCAL_ONLY = 256;
    public static final int FLAG_NO_CLEAR = 32;
    public static final int FLAG_ONGOING_EVENT = 2;
    public static final int FLAG_ONLY_ALERT_ONCE = 8;
    public static final int FLAG_SHOW_LIGHTS = 1;
    public static final int FOREGROUND_SERVICE_DEFAULT = 0;
    public static final int FOREGROUND_SERVICE_DEFERRED = 2;
    public static final int FOREGROUND_SERVICE_IMMEDIATE = 1;
    public static final int GROUP_ALERT_ALL = 0;
    public static final int GROUP_ALERT_CHILDREN = 2;
    public static final int GROUP_ALERT_SUMMARY = 1;
    public static final java.lang.String GROUP_KEY_SILENT = "silent";
    public static final java.lang.String INTENT_CATEGORY_NOTIFICATION_PREFERENCES = "android.intent.category.NOTIFICATION_PREFERENCES";
    public static final int PRIORITY_DEFAULT = 0;
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_LOW = -1;
    public static final int PRIORITY_MAX = 2;
    public static final int PRIORITY_MIN = -2;
    public static final int STREAM_DEFAULT = -1;
    public static final int VISIBILITY_PRIVATE = 0;
    public static final int VISIBILITY_PUBLIC = 1;
    public static final int VISIBILITY_SECRET = -1;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface BadgeIconType {
    }

    public interface Extender {
        androidx.core.app.NotificationCompat.Builder extend(androidx.core.app.NotificationCompat.Builder builder);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface GroupAlertBehavior {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface NotificationVisibility {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ServiceNotificationBehavior {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface StreamType {
    }

    public static class Builder {
        private static final int MAX_CHARSEQUENCE_LENGTH = 5120;
        public java.util.ArrayList<androidx.core.app.NotificationCompat.Action> mActions;
        boolean mAllowSystemGeneratedContextualActions;
        int mBadgeIcon;
        android.widget.RemoteViews mBigContentView;
        androidx.core.app.NotificationCompat.BubbleMetadata mBubbleMetadata;
        java.lang.String mCategory;
        java.lang.String mChannelId;
        boolean mChronometerCountDown;
        int mColor;
        boolean mColorized;
        boolean mColorizedSet;
        java.lang.CharSequence mContentInfo;
        android.app.PendingIntent mContentIntent;
        java.lang.CharSequence mContentText;
        java.lang.CharSequence mContentTitle;
        android.widget.RemoteViews mContentView;
        public android.content.Context mContext;
        android.os.Bundle mExtras;
        int mFgsDeferBehavior;
        android.app.PendingIntent mFullScreenIntent;
        int mGroupAlertBehavior;
        java.lang.String mGroupKey;
        boolean mGroupSummary;
        android.widget.RemoteViews mHeadsUpContentView;
        java.util.ArrayList<androidx.core.app.NotificationCompat.Action> mInvisibleActions;
        android.graphics.Bitmap mLargeIcon;
        boolean mLocalOnly;
        androidx.core.content.LocusIdCompat mLocusId;
        android.app.Notification mNotification;
        int mNumber;

        @java.lang.Deprecated
        public java.util.ArrayList<java.lang.String> mPeople;
        public java.util.ArrayList<androidx.core.app.Person> mPersonList;
        int mPriority;
        int mProgress;
        boolean mProgressIndeterminate;
        int mProgressMax;
        android.app.Notification mPublicVersion;
        java.lang.CharSequence[] mRemoteInputHistory;
        java.lang.CharSequence mSettingsText;
        java.lang.String mShortcutId;
        boolean mShowWhen;
        boolean mSilent;
        android.graphics.drawable.Icon mSmallIcon;
        java.lang.String mSortKey;
        androidx.core.app.NotificationCompat.Style mStyle;
        java.lang.CharSequence mSubText;
        android.widget.RemoteViews mTickerView;
        long mTimeout;
        boolean mUseChronometer;
        int mVisibility;

        public Builder(android.content.Context context, android.app.Notification notification) {
            java.util.ArrayList parcelableArrayList;
            this(context, androidx.core.app.NotificationCompat.getChannelId(notification));
            android.os.Bundle bundle = notification.extras;
            androidx.core.app.NotificationCompat.Style styleExtractStyleFromNotification = androidx.core.app.NotificationCompat.Style.extractStyleFromNotification(notification);
            setContentTitle(androidx.core.app.NotificationCompat.getContentTitle(notification)).setContentText(androidx.core.app.NotificationCompat.getContentText(notification)).setContentInfo(androidx.core.app.NotificationCompat.getContentInfo(notification)).setSubText(androidx.core.app.NotificationCompat.getSubText(notification)).setSettingsText(androidx.core.app.NotificationCompat.getSettingsText(notification)).setStyle(styleExtractStyleFromNotification).setContentIntent(notification.contentIntent).setGroup(androidx.core.app.NotificationCompat.getGroup(notification)).setGroupSummary(androidx.core.app.NotificationCompat.isGroupSummary(notification)).setLocusId(androidx.core.app.NotificationCompat.getLocusId(notification)).setWhen(notification.when).setShowWhen(androidx.core.app.NotificationCompat.getShowWhen(notification)).setUsesChronometer(androidx.core.app.NotificationCompat.getUsesChronometer(notification)).setAutoCancel(androidx.core.app.NotificationCompat.getAutoCancel(notification)).setOnlyAlertOnce(androidx.core.app.NotificationCompat.getOnlyAlertOnce(notification)).setOngoing(androidx.core.app.NotificationCompat.getOngoing(notification)).setLocalOnly(androidx.core.app.NotificationCompat.getLocalOnly(notification)).setLargeIcon(notification.largeIcon).setBadgeIconType(androidx.core.app.NotificationCompat.getBadgeIconType(notification)).setCategory(androidx.core.app.NotificationCompat.getCategory(notification)).setBubbleMetadata(androidx.core.app.NotificationCompat.getBubbleMetadata(notification)).setNumber(notification.number).setTicker(notification.tickerText).setContentIntent(notification.contentIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(notification.fullScreenIntent, androidx.core.app.NotificationCompat.getHighPriority(notification)).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setDefaults(notification.defaults).setPriority(notification.priority).setColor(androidx.core.app.NotificationCompat.getColor(notification)).setVisibility(androidx.core.app.NotificationCompat.getVisibility(notification)).setPublicVersion(androidx.core.app.NotificationCompat.getPublicVersion(notification)).setSortKey(androidx.core.app.NotificationCompat.getSortKey(notification)).setTimeoutAfter(androidx.core.app.NotificationCompat.getTimeoutAfter(notification)).setShortcutId(androidx.core.app.NotificationCompat.getShortcutId(notification)).setProgress(bundle.getInt(androidx.core.app.NotificationCompat.EXTRA_PROGRESS_MAX), bundle.getInt(androidx.core.app.NotificationCompat.EXTRA_PROGRESS), bundle.getBoolean(androidx.core.app.NotificationCompat.EXTRA_PROGRESS_INDETERMINATE)).setAllowSystemGeneratedContextualActions(androidx.core.app.NotificationCompat.getAllowSystemGeneratedContextualActions(notification)).setSmallIcon(notification.icon, notification.iconLevel).addExtras(getExtrasWithoutDuplicateData(notification, styleExtractStyleFromNotification));
            this.mSmallIcon = notification.getSmallIcon();
            if (notification.actions != null && notification.actions.length != 0) {
                for (android.app.Notification.Action action : notification.actions) {
                    addAction(androidx.core.app.NotificationCompat.Action.Builder.fromAndroidAction(action).build());
                }
            }
            java.util.List<androidx.core.app.NotificationCompat.Action> invisibleActions = androidx.core.app.NotificationCompat.getInvisibleActions(notification);
            if (!invisibleActions.isEmpty()) {
                java.util.Iterator<androidx.core.app.NotificationCompat.Action> it = invisibleActions.iterator();
                while (it.hasNext()) {
                    addInvisibleAction(it.next());
                }
            }
            java.lang.String[] stringArray = notification.extras.getStringArray(androidx.core.app.NotificationCompat.EXTRA_PEOPLE);
            if (stringArray != null && stringArray.length != 0) {
                for (java.lang.String str : stringArray) {
                    addPerson(str);
                }
            }
            if (android.os.Build.VERSION.SDK_INT >= 28 && (parcelableArrayList = notification.extras.getParcelableArrayList(androidx.core.app.NotificationCompat.EXTRA_PEOPLE_LIST)) != null && !parcelableArrayList.isEmpty()) {
                java.util.Iterator it2 = parcelableArrayList.iterator();
                while (it2.hasNext()) {
                    addPerson(androidx.core.app.Person.fromAndroidPerson((android.app.Person) it2.next()));
                }
            }
            if (bundle.containsKey(androidx.core.app.NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN)) {
                setChronometerCountDown(bundle.getBoolean(androidx.core.app.NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN));
            }
            if (android.os.Build.VERSION.SDK_INT < 26 || !bundle.containsKey(androidx.core.app.NotificationCompat.EXTRA_COLORIZED)) {
                return;
            }
            setColorized(bundle.getBoolean(androidx.core.app.NotificationCompat.EXTRA_COLORIZED));
        }

        private static android.os.Bundle getExtrasWithoutDuplicateData(android.app.Notification notification, androidx.core.app.NotificationCompat.Style style) {
            if (notification.extras == null) {
                return null;
            }
            android.os.Bundle bundle = new android.os.Bundle(notification.extras);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_TITLE);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_TEXT);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_INFO_TEXT);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_SUB_TEXT);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_CHANNEL_ID);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_CHANNEL_GROUP_ID);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_SHOW_WHEN);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_PROGRESS);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_PROGRESS_MAX);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_PROGRESS_INDETERMINATE);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_COLORIZED);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_PEOPLE_LIST);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_PEOPLE);
            bundle.remove(androidx.core.app.NotificationCompatExtras.EXTRA_SORT_KEY);
            bundle.remove(androidx.core.app.NotificationCompatExtras.EXTRA_GROUP_KEY);
            bundle.remove(androidx.core.app.NotificationCompatExtras.EXTRA_GROUP_SUMMARY);
            bundle.remove(androidx.core.app.NotificationCompatExtras.EXTRA_LOCAL_ONLY);
            bundle.remove(androidx.core.app.NotificationCompatExtras.EXTRA_ACTION_EXTRAS);
            android.os.Bundle bundle2 = bundle.getBundle("android.car.EXTENSIONS");
            if (bundle2 != null) {
                android.os.Bundle bundle3 = new android.os.Bundle(bundle2);
                bundle3.remove("invisible_actions");
                bundle.putBundle("android.car.EXTENSIONS", bundle3);
            }
            if (style != null) {
                style.clearCompatExtraKeys(bundle);
            }
            return bundle;
        }

        public Builder(android.content.Context context, java.lang.String str) {
            this.mActions = new java.util.ArrayList<>();
            this.mPersonList = new java.util.ArrayList<>();
            this.mInvisibleActions = new java.util.ArrayList<>();
            this.mShowWhen = true;
            this.mLocalOnly = false;
            this.mColor = 0;
            this.mVisibility = 0;
            this.mBadgeIcon = 0;
            this.mGroupAlertBehavior = 0;
            this.mFgsDeferBehavior = 0;
            android.app.Notification notification = new android.app.Notification();
            this.mNotification = notification;
            this.mContext = context;
            this.mChannelId = str;
            notification.when = java.lang.System.currentTimeMillis();
            this.mNotification.audioStreamType = -1;
            this.mPriority = 0;
            this.mPeople = new java.util.ArrayList<>();
            this.mAllowSystemGeneratedContextualActions = true;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @java.lang.Deprecated
        public Builder(android.content.Context context) {
            this(context, (java.lang.String) null);
        }

        public androidx.core.app.NotificationCompat.Builder setWhen(long j) {
            this.mNotification.when = j;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setShowWhen(boolean z) {
            this.mShowWhen = z;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setSmallIcon(androidx.core.graphics.drawable.IconCompat iconCompat) {
            this.mSmallIcon = iconCompat.toIcon(this.mContext);
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setUsesChronometer(boolean z) {
            this.mUseChronometer = z;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setChronometerCountDown(boolean z) {
            this.mChronometerCountDown = z;
            getExtras().putBoolean(androidx.core.app.NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN, z);
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setSmallIcon(int i) {
            this.mNotification.icon = i;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setSmallIcon(int i, int i2) {
            this.mNotification.icon = i;
            this.mNotification.iconLevel = i2;
            return this;
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.Builder setNotificationSilent() {
            this.mSilent = true;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setSilent(boolean z) {
            this.mSilent = z;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setContentTitle(java.lang.CharSequence charSequence) {
            this.mContentTitle = limitCharSequenceLength(charSequence);
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setContentText(java.lang.CharSequence charSequence) {
            this.mContentText = limitCharSequenceLength(charSequence);
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setSubText(java.lang.CharSequence charSequence) {
            this.mSubText = limitCharSequenceLength(charSequence);
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setSettingsText(java.lang.CharSequence charSequence) {
            this.mSettingsText = limitCharSequenceLength(charSequence);
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setRemoteInputHistory(java.lang.CharSequence[] charSequenceArr) {
            this.mRemoteInputHistory = charSequenceArr;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setNumber(int i) {
            this.mNumber = i;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setContentInfo(java.lang.CharSequence charSequence) {
            this.mContentInfo = limitCharSequenceLength(charSequence);
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setProgress(int i, int i2, boolean z) {
            this.mProgressMax = i;
            this.mProgress = i2;
            this.mProgressIndeterminate = z;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setContent(android.widget.RemoteViews remoteViews) {
            this.mNotification.contentView = remoteViews;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setContentIntent(android.app.PendingIntent pendingIntent) {
            this.mContentIntent = pendingIntent;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setDeleteIntent(android.app.PendingIntent pendingIntent) {
            this.mNotification.deleteIntent = pendingIntent;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setFullScreenIntent(android.app.PendingIntent pendingIntent, boolean z) {
            this.mFullScreenIntent = pendingIntent;
            setFlag(128, z);
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setTicker(java.lang.CharSequence charSequence) {
            this.mNotification.tickerText = limitCharSequenceLength(charSequence);
            return this;
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.Builder setTicker(java.lang.CharSequence charSequence, android.widget.RemoteViews remoteViews) {
            this.mNotification.tickerText = limitCharSequenceLength(charSequence);
            this.mTickerView = remoteViews;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setLargeIcon(android.graphics.Bitmap bitmap) {
            this.mLargeIcon = reduceLargeIconSize(bitmap);
            return this;
        }

        private android.graphics.Bitmap reduceLargeIconSize(android.graphics.Bitmap bitmap) {
            if (bitmap == null || android.os.Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            android.content.res.Resources resources = this.mContext.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(androidx.core.R.dimen.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(androidx.core.R.dimen.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double dMin = java.lang.Math.min(((double) dimensionPixelSize) / ((double) java.lang.Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) java.lang.Math.max(1, bitmap.getHeight())));
            return android.graphics.Bitmap.createScaledBitmap(bitmap, (int) java.lang.Math.ceil(((double) bitmap.getWidth()) * dMin), (int) java.lang.Math.ceil(((double) bitmap.getHeight()) * dMin), true);
        }

        public androidx.core.app.NotificationCompat.Builder setSound(android.net.Uri uri) {
            this.mNotification.sound = uri;
            this.mNotification.audioStreamType = -1;
            this.mNotification.audioAttributes = new android.media.AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setSound(android.net.Uri uri, int i) {
            this.mNotification.sound = uri;
            this.mNotification.audioStreamType = i;
            this.mNotification.audioAttributes = new android.media.AudioAttributes.Builder().setContentType(4).setLegacyStreamType(i).build();
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setVibrate(long[] jArr) {
            this.mNotification.vibrate = jArr;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setLights(int i, int i2, int i3) {
            this.mNotification.ledARGB = i;
            this.mNotification.ledOnMS = i2;
            this.mNotification.ledOffMS = i3;
            int i4 = (this.mNotification.ledOnMS == 0 || this.mNotification.ledOffMS == 0) ? 0 : 1;
            android.app.Notification notification = this.mNotification;
            notification.flags = i4 | (notification.flags & (-2));
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setOngoing(boolean z) {
            setFlag(2, z);
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setColorized(boolean z) {
            this.mColorized = z;
            this.mColorizedSet = true;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setOnlyAlertOnce(boolean z) {
            setFlag(8, z);
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setAutoCancel(boolean z) {
            setFlag(16, z);
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setLocalOnly(boolean z) {
            this.mLocalOnly = z;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setCategory(java.lang.String str) {
            this.mCategory = str;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setDefaults(int i) {
            this.mNotification.defaults = i;
            if ((i & 4) != 0) {
                this.mNotification.flags |= 1;
            }
            return this;
        }

        private void setFlag(int i, boolean z) {
            if (z) {
                android.app.Notification notification = this.mNotification;
                notification.flags = i | notification.flags;
            } else {
                android.app.Notification notification2 = this.mNotification;
                notification2.flags = (~i) & notification2.flags;
            }
        }

        public androidx.core.app.NotificationCompat.Builder setPriority(int i) {
            this.mPriority = i;
            return this;
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.Builder addPerson(java.lang.String str) {
            if (str != null && !str.isEmpty()) {
                this.mPeople.add(str);
            }
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder addPerson(androidx.core.app.Person person) {
            if (person != null) {
                this.mPersonList.add(person);
            }
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder clearPeople() {
            this.mPersonList.clear();
            this.mPeople.clear();
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setGroup(java.lang.String str) {
            this.mGroupKey = str;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setGroupSummary(boolean z) {
            this.mGroupSummary = z;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setSortKey(java.lang.String str) {
            this.mSortKey = str;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder addExtras(android.os.Bundle bundle) {
            if (bundle != null) {
                android.os.Bundle bundle2 = this.mExtras;
                if (bundle2 == null) {
                    this.mExtras = new android.os.Bundle(bundle);
                } else {
                    bundle2.putAll(bundle);
                }
            }
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setExtras(android.os.Bundle bundle) {
            this.mExtras = bundle;
            return this;
        }

        public android.os.Bundle getExtras() {
            if (this.mExtras == null) {
                this.mExtras = new android.os.Bundle();
            }
            return this.mExtras;
        }

        public androidx.core.app.NotificationCompat.Builder addAction(int i, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent) {
            this.mActions.add(new androidx.core.app.NotificationCompat.Action(i, charSequence, pendingIntent));
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder addAction(androidx.core.app.NotificationCompat.Action action) {
            if (action != null) {
                this.mActions.add(action);
            }
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder clearActions() {
            this.mActions.clear();
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder addInvisibleAction(int i, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent) {
            this.mInvisibleActions.add(new androidx.core.app.NotificationCompat.Action(i, charSequence, pendingIntent));
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder addInvisibleAction(androidx.core.app.NotificationCompat.Action action) {
            if (action != null) {
                this.mInvisibleActions.add(action);
            }
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder clearInvisibleActions() {
            this.mInvisibleActions.clear();
            android.os.Bundle bundle = this.mExtras.getBundle("android.car.EXTENSIONS");
            if (bundle != null) {
                android.os.Bundle bundle2 = new android.os.Bundle(bundle);
                bundle2.remove("invisible_actions");
                this.mExtras.putBundle("android.car.EXTENSIONS", bundle2);
            }
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setStyle(androidx.core.app.NotificationCompat.Style style) {
            if (this.mStyle != style) {
                this.mStyle = style;
                if (style != null) {
                    style.setBuilder(this);
                }
            }
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setColor(int i) {
            this.mColor = i;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setVisibility(int i) {
            this.mVisibility = i;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setPublicVersion(android.app.Notification notification) {
            this.mPublicVersion = notification;
            return this;
        }

        private boolean useExistingRemoteView() {
            androidx.core.app.NotificationCompat.Style style = this.mStyle;
            return style == null || !style.displayCustomViewInline();
        }

        public android.widget.RemoteViews createContentView() {
            android.widget.RemoteViews remoteViewsMakeContentView;
            if (this.mContentView != null && useExistingRemoteView()) {
                return this.mContentView;
            }
            androidx.core.app.NotificationCompatBuilder notificationCompatBuilder = new androidx.core.app.NotificationCompatBuilder(this);
            androidx.core.app.NotificationCompat.Style style = this.mStyle;
            return (style == null || (remoteViewsMakeContentView = style.makeContentView(notificationCompatBuilder)) == null) ? android.app.Notification.Builder.recoverBuilder(this.mContext, notificationCompatBuilder.build()).createContentView() : remoteViewsMakeContentView;
        }

        public android.widget.RemoteViews createBigContentView() {
            android.widget.RemoteViews remoteViewsMakeBigContentView;
            if (this.mBigContentView != null && useExistingRemoteView()) {
                return this.mBigContentView;
            }
            androidx.core.app.NotificationCompatBuilder notificationCompatBuilder = new androidx.core.app.NotificationCompatBuilder(this);
            androidx.core.app.NotificationCompat.Style style = this.mStyle;
            return (style == null || (remoteViewsMakeBigContentView = style.makeBigContentView(notificationCompatBuilder)) == null) ? android.app.Notification.Builder.recoverBuilder(this.mContext, notificationCompatBuilder.build()).createBigContentView() : remoteViewsMakeBigContentView;
        }

        public android.widget.RemoteViews createHeadsUpContentView() {
            android.widget.RemoteViews remoteViewsMakeHeadsUpContentView;
            if (this.mHeadsUpContentView != null && useExistingRemoteView()) {
                return this.mHeadsUpContentView;
            }
            androidx.core.app.NotificationCompatBuilder notificationCompatBuilder = new androidx.core.app.NotificationCompatBuilder(this);
            androidx.core.app.NotificationCompat.Style style = this.mStyle;
            return (style == null || (remoteViewsMakeHeadsUpContentView = style.makeHeadsUpContentView(notificationCompatBuilder)) == null) ? android.app.Notification.Builder.recoverBuilder(this.mContext, notificationCompatBuilder.build()).createHeadsUpContentView() : remoteViewsMakeHeadsUpContentView;
        }

        public androidx.core.app.NotificationCompat.Builder setCustomContentView(android.widget.RemoteViews remoteViews) {
            this.mContentView = remoteViews;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setCustomBigContentView(android.widget.RemoteViews remoteViews) {
            this.mBigContentView = remoteViews;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setCustomHeadsUpContentView(android.widget.RemoteViews remoteViews) {
            this.mHeadsUpContentView = remoteViews;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setChannelId(java.lang.String str) {
            this.mChannelId = str;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setTimeoutAfter(long j) {
            this.mTimeout = j;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setShortcutId(java.lang.String str) {
            this.mShortcutId = str;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setShortcutInfo(androidx.core.content.pm.ShortcutInfoCompat shortcutInfoCompat) {
            if (shortcutInfoCompat == null) {
                return this;
            }
            this.mShortcutId = shortcutInfoCompat.getId();
            if (this.mLocusId == null) {
                if (shortcutInfoCompat.getLocusId() != null) {
                    this.mLocusId = shortcutInfoCompat.getLocusId();
                } else if (shortcutInfoCompat.getId() != null) {
                    this.mLocusId = new androidx.core.content.LocusIdCompat(shortcutInfoCompat.getId());
                }
            }
            if (this.mContentTitle == null) {
                setContentTitle(shortcutInfoCompat.getShortLabel());
            }
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setLocusId(androidx.core.content.LocusIdCompat locusIdCompat) {
            this.mLocusId = locusIdCompat;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setBadgeIconType(int i) {
            this.mBadgeIcon = i;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setGroupAlertBehavior(int i) {
            this.mGroupAlertBehavior = i;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setForegroundServiceBehavior(int i) {
            this.mFgsDeferBehavior = i;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setBubbleMetadata(androidx.core.app.NotificationCompat.BubbleMetadata bubbleMetadata) {
            this.mBubbleMetadata = bubbleMetadata;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder extend(androidx.core.app.NotificationCompat.Extender extender) {
            extender.extend(this);
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setAllowSystemGeneratedContextualActions(boolean z) {
            this.mAllowSystemGeneratedContextualActions = z;
            return this;
        }

        @java.lang.Deprecated
        public android.app.Notification getNotification() {
            return build();
        }

        public android.app.Notification build() {
            return new androidx.core.app.NotificationCompatBuilder(this).build();
        }

        protected static java.lang.CharSequence limitCharSequenceLength(java.lang.CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > MAX_CHARSEQUENCE_LENGTH) ? charSequence.subSequence(0, MAX_CHARSEQUENCE_LENGTH) : charSequence;
        }

        public android.widget.RemoteViews getContentView() {
            return this.mContentView;
        }

        public android.widget.RemoteViews getBigContentView() {
            return this.mBigContentView;
        }

        public android.widget.RemoteViews getHeadsUpContentView() {
            return this.mHeadsUpContentView;
        }

        public long getWhenIfShowing() {
            if (this.mShowWhen) {
                return this.mNotification.when;
            }
            return 0L;
        }

        public int getPriority() {
            return this.mPriority;
        }

        public int getForegroundServiceBehavior() {
            return this.mFgsDeferBehavior;
        }

        public int getColor() {
            return this.mColor;
        }

        public androidx.core.app.NotificationCompat.BubbleMetadata getBubbleMetadata() {
            return this.mBubbleMetadata;
        }
    }

    public static abstract class Style {
        java.lang.CharSequence mBigContentTitle;
        protected androidx.core.app.NotificationCompat.Builder mBuilder;
        java.lang.CharSequence mSummaryText;
        boolean mSummaryTextSet = false;

        private static float constrain(float f, float f2, float f3) {
            if (f < f2) {
                return f2;
            }
            return f > f3 ? f3 : f;
        }

        public void apply(androidx.core.app.NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        }

        public boolean displayCustomViewInline() {
            return false;
        }

        protected java.lang.String getClassName() {
            return null;
        }

        public android.widget.RemoteViews makeBigContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        public android.widget.RemoteViews makeContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        public android.widget.RemoteViews makeHeadsUpContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        public void setBuilder(androidx.core.app.NotificationCompat.Builder builder) {
            if (this.mBuilder != builder) {
                this.mBuilder = builder;
                if (builder != null) {
                    builder.setStyle(this);
                }
            }
        }

        public android.app.Notification build() {
            androidx.core.app.NotificationCompat.Builder builder = this.mBuilder;
            if (builder != null) {
                return builder.build();
            }
            return null;
        }

        public void addCompatExtras(android.os.Bundle bundle) {
            if (this.mSummaryTextSet) {
                bundle.putCharSequence(androidx.core.app.NotificationCompat.EXTRA_SUMMARY_TEXT, this.mSummaryText);
            }
            java.lang.CharSequence charSequence = this.mBigContentTitle;
            if (charSequence != null) {
                bundle.putCharSequence(androidx.core.app.NotificationCompat.EXTRA_TITLE_BIG, charSequence);
            }
            java.lang.String className = getClassName();
            if (className != null) {
                bundle.putString(androidx.core.app.NotificationCompat.EXTRA_COMPAT_TEMPLATE, className);
            }
        }

        protected void restoreFromCompatExtras(android.os.Bundle bundle) {
            if (bundle.containsKey(androidx.core.app.NotificationCompat.EXTRA_SUMMARY_TEXT)) {
                this.mSummaryText = bundle.getCharSequence(androidx.core.app.NotificationCompat.EXTRA_SUMMARY_TEXT);
                this.mSummaryTextSet = true;
            }
            this.mBigContentTitle = bundle.getCharSequence(androidx.core.app.NotificationCompat.EXTRA_TITLE_BIG);
        }

        protected void clearCompatExtraKeys(android.os.Bundle bundle) {
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_SUMMARY_TEXT);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_TITLE_BIG);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_COMPAT_TEMPLATE);
        }

        public static androidx.core.app.NotificationCompat.Style extractStyleFromNotification(android.app.Notification notification) {
            android.os.Bundle extras = androidx.core.app.NotificationCompat.getExtras(notification);
            if (extras == null) {
                return null;
            }
            return constructStyleForExtras(extras);
        }

        private static androidx.core.app.NotificationCompat.Style constructCompatStyleByPlatformName(java.lang.String str) {
            if (str == null) {
                return null;
            }
            if (str.equals(android.app.Notification.BigPictureStyle.class.getName())) {
                return new androidx.core.app.NotificationCompat.BigPictureStyle();
            }
            if (str.equals(android.app.Notification.BigTextStyle.class.getName())) {
                return new androidx.core.app.NotificationCompat.BigTextStyle();
            }
            if (str.equals(android.app.Notification.InboxStyle.class.getName())) {
                return new androidx.core.app.NotificationCompat.InboxStyle();
            }
            if (str.equals(android.app.Notification.MessagingStyle.class.getName())) {
                return new androidx.core.app.NotificationCompat.MessagingStyle();
            }
            if (str.equals(android.app.Notification.DecoratedCustomViewStyle.class.getName())) {
                return new androidx.core.app.NotificationCompat.DecoratedCustomViewStyle();
            }
            return null;
        }

        static androidx.core.app.NotificationCompat.Style constructCompatStyleByName(java.lang.String str) {
            if (str == null) {
                return null;
            }
            str.hashCode();
            switch (str) {
                case "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle":
                    return new androidx.core.app.NotificationCompat.DecoratedCustomViewStyle();
                case "androidx.core.app.NotificationCompat$BigPictureStyle":
                    return new androidx.core.app.NotificationCompat.BigPictureStyle();
                case "androidx.core.app.NotificationCompat$InboxStyle":
                    return new androidx.core.app.NotificationCompat.InboxStyle();
                case "androidx.core.app.NotificationCompat$BigTextStyle":
                    return new androidx.core.app.NotificationCompat.BigTextStyle();
                case "androidx.core.app.NotificationCompat$MessagingStyle":
                    return new androidx.core.app.NotificationCompat.MessagingStyle();
                default:
                    return null;
            }
        }

        static androidx.core.app.NotificationCompat.Style constructCompatStyleForBundle(android.os.Bundle bundle) {
            androidx.core.app.NotificationCompat.Style styleConstructCompatStyleByName = constructCompatStyleByName(bundle.getString(androidx.core.app.NotificationCompat.EXTRA_COMPAT_TEMPLATE));
            if (styleConstructCompatStyleByName != null) {
                return styleConstructCompatStyleByName;
            }
            if (bundle.containsKey(androidx.core.app.NotificationCompat.EXTRA_SELF_DISPLAY_NAME) || bundle.containsKey(androidx.core.app.NotificationCompat.EXTRA_MESSAGING_STYLE_USER)) {
                return new androidx.core.app.NotificationCompat.MessagingStyle();
            }
            if (bundle.containsKey(androidx.core.app.NotificationCompat.EXTRA_PICTURE) || bundle.containsKey(androidx.core.app.NotificationCompat.EXTRA_PICTURE_ICON)) {
                return new androidx.core.app.NotificationCompat.BigPictureStyle();
            }
            if (bundle.containsKey(androidx.core.app.NotificationCompat.EXTRA_BIG_TEXT)) {
                return new androidx.core.app.NotificationCompat.BigTextStyle();
            }
            if (bundle.containsKey(androidx.core.app.NotificationCompat.EXTRA_TEXT_LINES)) {
                return new androidx.core.app.NotificationCompat.InboxStyle();
            }
            return constructCompatStyleByPlatformName(bundle.getString(androidx.core.app.NotificationCompat.EXTRA_TEMPLATE));
        }

        static androidx.core.app.NotificationCompat.Style constructStyleForExtras(android.os.Bundle bundle) {
            androidx.core.app.NotificationCompat.Style styleConstructCompatStyleForBundle = constructCompatStyleForBundle(bundle);
            if (styleConstructCompatStyleForBundle == null) {
                return null;
            }
            try {
                styleConstructCompatStyleForBundle.restoreFromCompatExtras(bundle);
                return styleConstructCompatStyleForBundle;
            } catch (java.lang.ClassCastException unused) {
                return null;
            }
        }

        /* JADX WARN: Code duplicated, block: B:34:0x0118  */
        /* JADX WARN: Code duplicated, block: B:36:0x0127  */
        /* JADX WARN: Code duplicated, block: B:37:0x0137  */
        /* JADX WARN: Code duplicated, block: B:38:0x013c  */
        /* JADX WARN: Code duplicated, block: B:40:0x013f A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:41:0x0141  */
        /* JADX WARN: Code duplicated, block: B:45:0x0163  */
        /* JADX WARN: Code duplicated, block: B:47:0x0169  */
        /* JADX WARN: Code duplicated, block: B:49:0x0192  */
        /* JADX WARN: Code duplicated, block: B:50:0x019c  */
        /* JADX WARN: Code duplicated, block: B:51:0x01af  */
        /* JADX WARN: Code duplicated, block: B:54:0x01b4  */
        /* JADX WARN: Code duplicated, block: B:55:0x01b6  */
        /* JADX WARN: Code duplicated, block: B:59:0x01bf  */
        public android.widget.RemoteViews applyStandardTemplate(boolean z, int i, boolean z2) {
            boolean z3;
            boolean z4;
            boolean z5;
            int i2;
            android.content.res.Resources resources = this.mBuilder.mContext.getResources();
            android.widget.RemoteViews remoteViews = new android.widget.RemoteViews(this.mBuilder.mContext.getPackageName(), i);
            this.mBuilder.getPriority();
            if (this.mBuilder.mLargeIcon != null) {
                remoteViews.setViewVisibility(androidx.core.R.id.icon, 0);
                remoteViews.setImageViewBitmap(androidx.core.R.id.icon, this.mBuilder.mLargeIcon);
                if (z && this.mBuilder.mNotification.icon != 0) {
                    int dimensionPixelSize = resources.getDimensionPixelSize(androidx.core.R.dimen.notification_right_icon_size);
                    remoteViews.setImageViewBitmap(androidx.core.R.id.right_icon, createIconWithBackground(this.mBuilder.mNotification.icon, dimensionPixelSize, dimensionPixelSize - (resources.getDimensionPixelSize(androidx.core.R.dimen.notification_small_icon_background_padding) * 2), this.mBuilder.getColor()));
                    remoteViews.setViewVisibility(androidx.core.R.id.right_icon, 0);
                }
            } else if (z && this.mBuilder.mNotification.icon != 0) {
                remoteViews.setViewVisibility(androidx.core.R.id.icon, 0);
                remoteViews.setImageViewBitmap(androidx.core.R.id.icon, createIconWithBackground(this.mBuilder.mNotification.icon, resources.getDimensionPixelSize(androidx.core.R.dimen.notification_large_icon_width) - resources.getDimensionPixelSize(androidx.core.R.dimen.notification_big_circle_margin), resources.getDimensionPixelSize(androidx.core.R.dimen.notification_small_icon_size_as_large), this.mBuilder.getColor()));
            }
            if (this.mBuilder.mContentTitle != null) {
                remoteViews.setTextViewText(androidx.core.R.id.title, this.mBuilder.mContentTitle);
            }
            boolean z6 = true;
            if (this.mBuilder.mContentText != null) {
                remoteViews.setTextViewText(androidx.core.R.id.text, this.mBuilder.mContentText);
                z3 = true;
            } else {
                z3 = false;
            }
            if (this.mBuilder.mContentInfo != null) {
                remoteViews.setTextViewText(androidx.core.R.id.info, this.mBuilder.mContentInfo);
                remoteViews.setViewVisibility(androidx.core.R.id.info, 0);
            } else {
                if (this.mBuilder.mNumber > 0) {
                    if (this.mBuilder.mNumber > resources.getInteger(androidx.core.R.integer.status_bar_notification_info_maxnum)) {
                        remoteViews.setTextViewText(androidx.core.R.id.info, resources.getString(androidx.core.R.string.status_bar_notification_info_overflow));
                    } else {
                        remoteViews.setTextViewText(androidx.core.R.id.info, java.text.NumberFormat.getIntegerInstance().format(this.mBuilder.mNumber));
                    }
                    remoteViews.setViewVisibility(androidx.core.R.id.info, 0);
                } else {
                    remoteViews.setViewVisibility(androidx.core.R.id.info, 8);
                    z4 = false;
                }
                if (this.mBuilder.mSubText != null) {
                    remoteViews.setTextViewText(androidx.core.R.id.text, this.mBuilder.mSubText);
                    if (this.mBuilder.mContentText != null) {
                        remoteViews.setTextViewText(androidx.core.R.id.text2, this.mBuilder.mContentText);
                        remoteViews.setViewVisibility(androidx.core.R.id.text2, 0);
                        z5 = true;
                    } else {
                        remoteViews.setViewVisibility(androidx.core.R.id.text2, 8);
                        z5 = false;
                    }
                } else {
                    z5 = false;
                }
                if (z5) {
                    if (z2) {
                        remoteViews.setTextViewTextSize(androidx.core.R.id.text, 0, resources.getDimensionPixelSize(androidx.core.R.dimen.notification_subtext_size));
                    }
                    remoteViews.setViewPadding(androidx.core.R.id.line1, 0, 0, 0, 0);
                }
                if (this.mBuilder.getWhenIfShowing() != 0) {
                    z6 = z4;
                } else if (this.mBuilder.mUseChronometer) {
                    remoteViews.setViewVisibility(androidx.core.R.id.chronometer, 0);
                    remoteViews.setLong(androidx.core.R.id.chronometer, "setBase", this.mBuilder.getWhenIfShowing() + (android.os.SystemClock.elapsedRealtime() - java.lang.System.currentTimeMillis()));
                    remoteViews.setBoolean(androidx.core.R.id.chronometer, "setStarted", true);
                    if (this.mBuilder.mChronometerCountDown) {
                        remoteViews.setChronometerCountDown(androidx.core.R.id.chronometer, this.mBuilder.mChronometerCountDown);
                    }
                } else {
                    remoteViews.setViewVisibility(androidx.core.R.id.time, 0);
                    remoteViews.setLong(androidx.core.R.id.time, "setTime", this.mBuilder.getWhenIfShowing());
                }
                int i3 = androidx.core.R.id.right_side;
                if (z6) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                remoteViews.setViewVisibility(i3, i2);
                remoteViews.setViewVisibility(androidx.core.R.id.line3, z3 ? 0 : 8);
                return remoteViews;
            }
            z3 = true;
            z4 = true;
            if (this.mBuilder.mSubText != null) {
                remoteViews.setTextViewText(androidx.core.R.id.text, this.mBuilder.mSubText);
                if (this.mBuilder.mContentText != null) {
                    remoteViews.setTextViewText(androidx.core.R.id.text2, this.mBuilder.mContentText);
                    remoteViews.setViewVisibility(androidx.core.R.id.text2, 0);
                    z5 = true;
                } else {
                    remoteViews.setViewVisibility(androidx.core.R.id.text2, 8);
                    z5 = false;
                }
            } else {
                z5 = false;
            }
            if (z5) {
                if (z2) {
                    remoteViews.setTextViewTextSize(androidx.core.R.id.text, 0, resources.getDimensionPixelSize(androidx.core.R.dimen.notification_subtext_size));
                }
                remoteViews.setViewPadding(androidx.core.R.id.line1, 0, 0, 0, 0);
            }
            if (this.mBuilder.getWhenIfShowing() != 0) {
                z6 = z4;
            } else if (this.mBuilder.mUseChronometer) {
                remoteViews.setViewVisibility(androidx.core.R.id.chronometer, 0);
                remoteViews.setLong(androidx.core.R.id.chronometer, "setBase", this.mBuilder.getWhenIfShowing() + (android.os.SystemClock.elapsedRealtime() - java.lang.System.currentTimeMillis()));
                remoteViews.setBoolean(androidx.core.R.id.chronometer, "setStarted", true);
                if (this.mBuilder.mChronometerCountDown) {
                    remoteViews.setChronometerCountDown(androidx.core.R.id.chronometer, this.mBuilder.mChronometerCountDown);
                }
            } else {
                remoteViews.setViewVisibility(androidx.core.R.id.time, 0);
                remoteViews.setLong(androidx.core.R.id.time, "setTime", this.mBuilder.getWhenIfShowing());
            }
            int i4 = androidx.core.R.id.right_side;
            if (z6) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            remoteViews.setViewVisibility(i4, i2);
            remoteViews.setViewVisibility(androidx.core.R.id.line3, z3 ? 0 : 8);
            return remoteViews;
        }

        public android.graphics.Bitmap createColoredBitmap(int i, int i2) {
            return createColoredBitmap(i, i2, 0);
        }

        android.graphics.Bitmap createColoredBitmap(androidx.core.graphics.drawable.IconCompat iconCompat, int i) {
            return createColoredBitmap(iconCompat, i, 0);
        }

        private android.graphics.Bitmap createColoredBitmap(int i, int i2, int i3) {
            return createColoredBitmap(androidx.core.graphics.drawable.IconCompat.createWithResource(this.mBuilder.mContext, i), i2, i3);
        }

        private android.graphics.Bitmap createColoredBitmap(androidx.core.graphics.drawable.IconCompat iconCompat, int i, int i2) {
            android.graphics.drawable.Drawable drawableLoadDrawable = iconCompat.loadDrawable(this.mBuilder.mContext);
            int intrinsicWidth = i2 == 0 ? drawableLoadDrawable.getIntrinsicWidth() : i2;
            if (i2 == 0) {
                i2 = drawableLoadDrawable.getIntrinsicHeight();
            }
            android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(intrinsicWidth, i2, android.graphics.Bitmap.Config.ARGB_8888);
            drawableLoadDrawable.setBounds(0, 0, intrinsicWidth, i2);
            if (i != 0) {
                drawableLoadDrawable.mutate().setColorFilter(new android.graphics.PorterDuffColorFilter(i, android.graphics.PorterDuff.Mode.SRC_IN));
            }
            drawableLoadDrawable.draw(new android.graphics.Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        }

        private android.graphics.Bitmap createIconWithBackground(int i, int i2, int i3, int i4) {
            int i5 = androidx.core.R.drawable.notification_icon_background;
            if (i4 == 0) {
                i4 = 0;
            }
            android.graphics.Bitmap bitmapCreateColoredBitmap = createColoredBitmap(i5, i4, i2);
            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateColoredBitmap);
            android.graphics.drawable.Drawable drawableMutate = this.mBuilder.mContext.getResources().getDrawable(i).mutate();
            drawableMutate.setFilterBitmap(true);
            int i6 = (i2 - i3) / 2;
            int i7 = i3 + i6;
            drawableMutate.setBounds(i6, i6, i7, i7);
            drawableMutate.setColorFilter(new android.graphics.PorterDuffColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_ATOP));
            drawableMutate.draw(canvas);
            return bitmapCreateColoredBitmap;
        }

        public void buildIntoRemoteViews(android.widget.RemoteViews remoteViews, android.widget.RemoteViews remoteViews2) {
            hideNormalContent(remoteViews);
            remoteViews.removeAllViews(androidx.core.R.id.notification_main_column);
            remoteViews.addView(androidx.core.R.id.notification_main_column, remoteViews2.clone());
            remoteViews.setViewVisibility(androidx.core.R.id.notification_main_column, 0);
            remoteViews.setViewPadding(androidx.core.R.id.notification_main_column_container, 0, calculateTopPadding(), 0, 0);
        }

        private void hideNormalContent(android.widget.RemoteViews remoteViews) {
            remoteViews.setViewVisibility(androidx.core.R.id.title, 8);
            remoteViews.setViewVisibility(androidx.core.R.id.text2, 8);
            remoteViews.setViewVisibility(androidx.core.R.id.text, 8);
        }

        private int calculateTopPadding() {
            android.content.res.Resources resources = this.mBuilder.mContext.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(androidx.core.R.dimen.notification_top_pad);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(androidx.core.R.dimen.notification_top_pad_large_text);
            float fConstrain = (constrain(resources.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
            return java.lang.Math.round(((1.0f - fConstrain) * dimensionPixelSize) + (fConstrain * dimensionPixelSize2));
        }
    }

    public static class BigPictureStyle extends androidx.core.app.NotificationCompat.Style {
        private static final java.lang.String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$BigPictureStyle";
        private androidx.core.graphics.drawable.IconCompat mBigLargeIcon;
        private boolean mBigLargeIconSet;
        private java.lang.CharSequence mPictureContentDescription;
        private androidx.core.graphics.drawable.IconCompat mPictureIcon;
        private boolean mShowBigPictureWhenCollapsed;

        @Override // androidx.core.app.NotificationCompat.Style
        protected java.lang.String getClassName() {
            return TEMPLATE_CLASS_NAME;
        }

        public BigPictureStyle() {
        }

        public BigPictureStyle(androidx.core.app.NotificationCompat.Builder builder) {
            setBuilder(builder);
        }

        public androidx.core.app.NotificationCompat.BigPictureStyle setBigContentTitle(java.lang.CharSequence charSequence) {
            this.mBigContentTitle = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(charSequence);
            return this;
        }

        public androidx.core.app.NotificationCompat.BigPictureStyle setSummaryText(java.lang.CharSequence charSequence) {
            this.mSummaryText = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(charSequence);
            this.mSummaryTextSet = true;
            return this;
        }

        public androidx.core.app.NotificationCompat.BigPictureStyle setContentDescription(java.lang.CharSequence charSequence) {
            this.mPictureContentDescription = charSequence;
            return this;
        }

        public androidx.core.app.NotificationCompat.BigPictureStyle bigPicture(android.graphics.Bitmap bitmap) {
            this.mPictureIcon = bitmap == null ? null : androidx.core.graphics.drawable.IconCompat.createWithBitmap(bitmap);
            return this;
        }

        public androidx.core.app.NotificationCompat.BigPictureStyle bigPicture(android.graphics.drawable.Icon icon) {
            this.mPictureIcon = androidx.core.graphics.drawable.IconCompat.createFromIcon(icon);
            return this;
        }

        public androidx.core.app.NotificationCompat.BigPictureStyle showBigPictureWhenCollapsed(boolean z) {
            this.mShowBigPictureWhenCollapsed = z;
            return this;
        }

        public androidx.core.app.NotificationCompat.BigPictureStyle bigLargeIcon(android.graphics.Bitmap bitmap) {
            this.mBigLargeIcon = bitmap == null ? null : androidx.core.graphics.drawable.IconCompat.createWithBitmap(bitmap);
            this.mBigLargeIconSet = true;
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(androidx.core.app.NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            android.app.Notification.BigPictureStyle bigContentTitle = new android.app.Notification.BigPictureStyle(notificationBuilderWithBuilderAccessor.getBuilder()).setBigContentTitle(this.mBigContentTitle);
            if (this.mPictureIcon != null) {
                if (android.os.Build.VERSION.SDK_INT >= 31) {
                    androidx.core.app.NotificationCompat.BigPictureStyle.Api31Impl.setBigPicture(bigContentTitle, this.mPictureIcon.toIcon(notificationBuilderWithBuilderAccessor instanceof androidx.core.app.NotificationCompatBuilder ? ((androidx.core.app.NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).getContext() : null));
                } else if (this.mPictureIcon.getType() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.mPictureIcon.getBitmap());
                }
            }
            if (this.mBigLargeIconSet) {
                if (this.mBigLargeIcon == null) {
                    androidx.core.app.NotificationCompat.BigPictureStyle.Api16Impl.setBigLargeIcon(bigContentTitle, null);
                } else {
                    androidx.core.app.NotificationCompat.BigPictureStyle.Api23Impl.setBigLargeIcon(bigContentTitle, this.mBigLargeIcon.toIcon(notificationBuilderWithBuilderAccessor instanceof androidx.core.app.NotificationCompatBuilder ? ((androidx.core.app.NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).getContext() : null));
                }
            }
            if (this.mSummaryTextSet) {
                androidx.core.app.NotificationCompat.BigPictureStyle.Api16Impl.setSummaryText(bigContentTitle, this.mSummaryText);
            }
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                androidx.core.app.NotificationCompat.BigPictureStyle.Api31Impl.showBigPictureWhenCollapsed(bigContentTitle, this.mShowBigPictureWhenCollapsed);
                androidx.core.app.NotificationCompat.BigPictureStyle.Api31Impl.setContentDescription(bigContentTitle, this.mPictureContentDescription);
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void restoreFromCompatExtras(android.os.Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            if (bundle.containsKey(androidx.core.app.NotificationCompat.EXTRA_LARGE_ICON_BIG)) {
                this.mBigLargeIcon = asIconCompat(bundle.getParcelable(androidx.core.app.NotificationCompat.EXTRA_LARGE_ICON_BIG));
                this.mBigLargeIconSet = true;
            }
            this.mPictureIcon = getPictureIcon(bundle);
            this.mShowBigPictureWhenCollapsed = bundle.getBoolean(androidx.core.app.NotificationCompat.EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED);
        }

        public static androidx.core.graphics.drawable.IconCompat getPictureIcon(android.os.Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            android.os.Parcelable parcelable = bundle.getParcelable(androidx.core.app.NotificationCompat.EXTRA_PICTURE);
            if (parcelable != null) {
                return asIconCompat(parcelable);
            }
            return asIconCompat(bundle.getParcelable(androidx.core.app.NotificationCompat.EXTRA_PICTURE_ICON));
        }

        private static androidx.core.graphics.drawable.IconCompat asIconCompat(android.os.Parcelable parcelable) {
            if (parcelable == null) {
                return null;
            }
            if (parcelable instanceof android.graphics.drawable.Icon) {
                return androidx.core.graphics.drawable.IconCompat.createFromIcon((android.graphics.drawable.Icon) parcelable);
            }
            if (parcelable instanceof android.graphics.Bitmap) {
                return androidx.core.graphics.drawable.IconCompat.createWithBitmap((android.graphics.Bitmap) parcelable);
            }
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void clearCompatExtraKeys(android.os.Bundle bundle) {
            super.clearCompatExtraKeys(bundle);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_LARGE_ICON_BIG);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_PICTURE);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_PICTURE_ICON);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED);
        }

        private static class Api16Impl {
            private Api16Impl() {
            }

            static void setBigLargeIcon(android.app.Notification.BigPictureStyle bigPictureStyle, android.graphics.Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            static void setSummaryText(android.app.Notification.BigPictureStyle bigPictureStyle, java.lang.CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        private static class Api23Impl {
            private Api23Impl() {
            }

            static void setBigLargeIcon(android.app.Notification.BigPictureStyle bigPictureStyle, android.graphics.drawable.Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        private static class Api31Impl {
            private Api31Impl() {
            }

            static void showBigPictureWhenCollapsed(android.app.Notification.BigPictureStyle bigPictureStyle, boolean z) {
                bigPictureStyle.showBigPictureWhenCollapsed(z);
            }

            static void setContentDescription(android.app.Notification.BigPictureStyle bigPictureStyle, java.lang.CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            static void setBigPicture(android.app.Notification.BigPictureStyle bigPictureStyle, android.graphics.drawable.Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }
        }
    }

    public static class BigTextStyle extends androidx.core.app.NotificationCompat.Style {
        private static final java.lang.String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$BigTextStyle";
        private java.lang.CharSequence mBigText;

        @Override // androidx.core.app.NotificationCompat.Style
        protected java.lang.String getClassName() {
            return TEMPLATE_CLASS_NAME;
        }

        public BigTextStyle() {
        }

        public BigTextStyle(androidx.core.app.NotificationCompat.Builder builder) {
            setBuilder(builder);
        }

        public androidx.core.app.NotificationCompat.BigTextStyle setBigContentTitle(java.lang.CharSequence charSequence) {
            this.mBigContentTitle = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(charSequence);
            return this;
        }

        public androidx.core.app.NotificationCompat.BigTextStyle setSummaryText(java.lang.CharSequence charSequence) {
            this.mSummaryText = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(charSequence);
            this.mSummaryTextSet = true;
            return this;
        }

        public androidx.core.app.NotificationCompat.BigTextStyle bigText(java.lang.CharSequence charSequence) {
            this.mBigText = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(charSequence);
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(androidx.core.app.NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            android.app.Notification.BigTextStyle bigTextStyleBigText = new android.app.Notification.BigTextStyle(notificationBuilderWithBuilderAccessor.getBuilder()).setBigContentTitle(this.mBigContentTitle).bigText(this.mBigText);
            if (this.mSummaryTextSet) {
                bigTextStyleBigText.setSummaryText(this.mSummaryText);
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void restoreFromCompatExtras(android.os.Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            this.mBigText = bundle.getCharSequence(androidx.core.app.NotificationCompat.EXTRA_BIG_TEXT);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void addCompatExtras(android.os.Bundle bundle) {
            super.addCompatExtras(bundle);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void clearCompatExtraKeys(android.os.Bundle bundle) {
            super.clearCompatExtraKeys(bundle);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_BIG_TEXT);
        }
    }

    public static class MessagingStyle extends androidx.core.app.NotificationCompat.Style {
        public static final int MAXIMUM_RETAINED_MESSAGES = 25;
        private static final java.lang.String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$MessagingStyle";
        private java.lang.CharSequence mConversationTitle;
        private java.lang.Boolean mIsGroupConversation;
        private androidx.core.app.Person mUser;
        private final java.util.List<androidx.core.app.NotificationCompat.MessagingStyle.Message> mMessages = new java.util.ArrayList();
        private final java.util.List<androidx.core.app.NotificationCompat.MessagingStyle.Message> mHistoricMessages = new java.util.ArrayList();

        @Override // androidx.core.app.NotificationCompat.Style
        protected java.lang.String getClassName() {
            return TEMPLATE_CLASS_NAME;
        }

        MessagingStyle() {
        }

        @java.lang.Deprecated
        public MessagingStyle(java.lang.CharSequence charSequence) {
            this.mUser = new androidx.core.app.Person.Builder().setName(charSequence).build();
        }

        public MessagingStyle(androidx.core.app.Person person) {
            if (android.text.TextUtils.isEmpty(person.getName())) {
                throw new java.lang.IllegalArgumentException("User's name must not be empty.");
            }
            this.mUser = person;
        }

        @java.lang.Deprecated
        public java.lang.CharSequence getUserDisplayName() {
            return this.mUser.getName();
        }

        public androidx.core.app.Person getUser() {
            return this.mUser;
        }

        public androidx.core.app.NotificationCompat.MessagingStyle setConversationTitle(java.lang.CharSequence charSequence) {
            this.mConversationTitle = charSequence;
            return this;
        }

        public java.lang.CharSequence getConversationTitle() {
            return this.mConversationTitle;
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.MessagingStyle addMessage(java.lang.CharSequence charSequence, long j, java.lang.CharSequence charSequence2) {
            this.mMessages.add(new androidx.core.app.NotificationCompat.MessagingStyle.Message(charSequence, j, new androidx.core.app.Person.Builder().setName(charSequence2).build()));
            if (this.mMessages.size() > 25) {
                this.mMessages.remove(0);
            }
            return this;
        }

        public androidx.core.app.NotificationCompat.MessagingStyle addMessage(java.lang.CharSequence charSequence, long j, androidx.core.app.Person person) {
            addMessage(new androidx.core.app.NotificationCompat.MessagingStyle.Message(charSequence, j, person));
            return this;
        }

        public androidx.core.app.NotificationCompat.MessagingStyle addMessage(androidx.core.app.NotificationCompat.MessagingStyle.Message message) {
            if (message != null) {
                this.mMessages.add(message);
                if (this.mMessages.size() > 25) {
                    this.mMessages.remove(0);
                }
            }
            return this;
        }

        public androidx.core.app.NotificationCompat.MessagingStyle addHistoricMessage(androidx.core.app.NotificationCompat.MessagingStyle.Message message) {
            if (message != null) {
                this.mHistoricMessages.add(message);
                if (this.mHistoricMessages.size() > 25) {
                    this.mHistoricMessages.remove(0);
                }
            }
            return this;
        }

        public java.util.List<androidx.core.app.NotificationCompat.MessagingStyle.Message> getMessages() {
            return this.mMessages;
        }

        public java.util.List<androidx.core.app.NotificationCompat.MessagingStyle.Message> getHistoricMessages() {
            return this.mHistoricMessages;
        }

        public androidx.core.app.NotificationCompat.MessagingStyle setGroupConversation(boolean z) {
            this.mIsGroupConversation = java.lang.Boolean.valueOf(z);
            return this;
        }

        public boolean isGroupConversation() {
            if (this.mBuilder != null && this.mBuilder.mContext.getApplicationInfo().targetSdkVersion < 28 && this.mIsGroupConversation == null) {
                return this.mConversationTitle != null;
            }
            java.lang.Boolean bool = this.mIsGroupConversation;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        public static androidx.core.app.NotificationCompat.MessagingStyle extractMessagingStyleFromNotification(android.app.Notification notification) {
            androidx.core.app.NotificationCompat.Style styleExtractStyleFromNotification = androidx.core.app.NotificationCompat.Style.extractStyleFromNotification(notification);
            if (styleExtractStyleFromNotification instanceof androidx.core.app.NotificationCompat.MessagingStyle) {
                return (androidx.core.app.NotificationCompat.MessagingStyle) styleExtractStyleFromNotification;
            }
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(androidx.core.app.NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            android.app.Notification.MessagingStyle messagingStyle;
            setGroupConversation(isGroupConversation());
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                messagingStyle = new android.app.Notification.MessagingStyle(this.mUser.toAndroidPerson());
            } else {
                messagingStyle = new android.app.Notification.MessagingStyle(this.mUser.getName());
            }
            java.util.Iterator<androidx.core.app.NotificationCompat.MessagingStyle.Message> it = this.mMessages.iterator();
            while (it.hasNext()) {
                messagingStyle.addMessage(it.next().toAndroidMessage());
            }
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                java.util.Iterator<androidx.core.app.NotificationCompat.MessagingStyle.Message> it2 = this.mHistoricMessages.iterator();
                while (it2.hasNext()) {
                    messagingStyle.addHistoricMessage(it2.next().toAndroidMessage());
                }
            }
            if (this.mIsGroupConversation.booleanValue() || android.os.Build.VERSION.SDK_INT >= 28) {
                messagingStyle.setConversationTitle(this.mConversationTitle);
            }
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                messagingStyle.setGroupConversation(this.mIsGroupConversation.booleanValue());
            }
            messagingStyle.setBuilder(notificationBuilderWithBuilderAccessor.getBuilder());
        }

        private androidx.core.app.NotificationCompat.MessagingStyle.Message findLatestIncomingMessage() {
            for (int size = this.mMessages.size() - 1; size >= 0; size--) {
                androidx.core.app.NotificationCompat.MessagingStyle.Message message = this.mMessages.get(size);
                if (message.getPerson() != null && !android.text.TextUtils.isEmpty(message.getPerson().getName())) {
                    return message;
                }
            }
            if (this.mMessages.isEmpty()) {
                return null;
            }
            java.util.List<androidx.core.app.NotificationCompat.MessagingStyle.Message> list = this.mMessages;
            return list.get(list.size() - 1);
        }

        private boolean hasMessagesWithoutSender() {
            for (int size = this.mMessages.size() - 1; size >= 0; size--) {
                androidx.core.app.NotificationCompat.MessagingStyle.Message message = this.mMessages.get(size);
                if (message.getPerson() != null && message.getPerson().getName() == null) {
                    return true;
                }
            }
            return false;
        }

        private java.lang.CharSequence makeMessageLine(androidx.core.app.NotificationCompat.MessagingStyle.Message message) {
            androidx.core.text.BidiFormatter bidiFormatter = androidx.core.text.BidiFormatter.getInstance();
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            java.lang.CharSequence name = message.getPerson() == null ? "" : message.getPerson().getName();
            boolean zIsEmpty = android.text.TextUtils.isEmpty(name);
            int color = androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
            if (zIsEmpty) {
                name = this.mUser.getName();
                if (this.mBuilder.getColor() != 0) {
                    color = this.mBuilder.getColor();
                }
            }
            java.lang.CharSequence charSequenceUnicodeWrap = bidiFormatter.unicodeWrap(name);
            spannableStringBuilder.append(charSequenceUnicodeWrap);
            spannableStringBuilder.setSpan(makeFontColorSpan(color), spannableStringBuilder.length() - charSequenceUnicodeWrap.length(), spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((java.lang.CharSequence) "  ").append(bidiFormatter.unicodeWrap(message.getText() != null ? message.getText() : ""));
            return spannableStringBuilder;
        }

        private android.text.style.TextAppearanceSpan makeFontColorSpan(int i) {
            return new android.text.style.TextAppearanceSpan(null, 0, 0, android.content.res.ColorStateList.valueOf(i), null);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void addCompatExtras(android.os.Bundle bundle) {
            super.addCompatExtras(bundle);
            bundle.putCharSequence(androidx.core.app.NotificationCompat.EXTRA_SELF_DISPLAY_NAME, this.mUser.getName());
            bundle.putBundle(androidx.core.app.NotificationCompat.EXTRA_MESSAGING_STYLE_USER, this.mUser.toBundle());
            bundle.putCharSequence(androidx.core.app.NotificationCompat.EXTRA_HIDDEN_CONVERSATION_TITLE, this.mConversationTitle);
            if (this.mConversationTitle != null && this.mIsGroupConversation.booleanValue()) {
                bundle.putCharSequence(androidx.core.app.NotificationCompat.EXTRA_CONVERSATION_TITLE, this.mConversationTitle);
            }
            if (!this.mMessages.isEmpty()) {
                bundle.putParcelableArray(androidx.core.app.NotificationCompat.EXTRA_MESSAGES, androidx.core.app.NotificationCompat.MessagingStyle.Message.getBundleArrayForMessages(this.mMessages));
            }
            if (!this.mHistoricMessages.isEmpty()) {
                bundle.putParcelableArray(androidx.core.app.NotificationCompat.EXTRA_HISTORIC_MESSAGES, androidx.core.app.NotificationCompat.MessagingStyle.Message.getBundleArrayForMessages(this.mHistoricMessages));
            }
            java.lang.Boolean bool = this.mIsGroupConversation;
            if (bool != null) {
                bundle.putBoolean(androidx.core.app.NotificationCompat.EXTRA_IS_GROUP_CONVERSATION, bool.booleanValue());
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void restoreFromCompatExtras(android.os.Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            this.mMessages.clear();
            if (bundle.containsKey(androidx.core.app.NotificationCompat.EXTRA_MESSAGING_STYLE_USER)) {
                this.mUser = androidx.core.app.Person.fromBundle(bundle.getBundle(androidx.core.app.NotificationCompat.EXTRA_MESSAGING_STYLE_USER));
            } else {
                this.mUser = new androidx.core.app.Person.Builder().setName(bundle.getString(androidx.core.app.NotificationCompat.EXTRA_SELF_DISPLAY_NAME)).build();
            }
            java.lang.CharSequence charSequence = bundle.getCharSequence(androidx.core.app.NotificationCompat.EXTRA_CONVERSATION_TITLE);
            this.mConversationTitle = charSequence;
            if (charSequence == null) {
                this.mConversationTitle = bundle.getCharSequence(androidx.core.app.NotificationCompat.EXTRA_HIDDEN_CONVERSATION_TITLE);
            }
            android.os.Parcelable[] parcelableArray = bundle.getParcelableArray(androidx.core.app.NotificationCompat.EXTRA_MESSAGES);
            if (parcelableArray != null) {
                this.mMessages.addAll(androidx.core.app.NotificationCompat.MessagingStyle.Message.getMessagesFromBundleArray(parcelableArray));
            }
            android.os.Parcelable[] parcelableArray2 = bundle.getParcelableArray(androidx.core.app.NotificationCompat.EXTRA_HISTORIC_MESSAGES);
            if (parcelableArray2 != null) {
                this.mHistoricMessages.addAll(androidx.core.app.NotificationCompat.MessagingStyle.Message.getMessagesFromBundleArray(parcelableArray2));
            }
            if (bundle.containsKey(androidx.core.app.NotificationCompat.EXTRA_IS_GROUP_CONVERSATION)) {
                this.mIsGroupConversation = java.lang.Boolean.valueOf(bundle.getBoolean(androidx.core.app.NotificationCompat.EXTRA_IS_GROUP_CONVERSATION));
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void clearCompatExtraKeys(android.os.Bundle bundle) {
            super.clearCompatExtraKeys(bundle);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_MESSAGING_STYLE_USER);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_SELF_DISPLAY_NAME);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_CONVERSATION_TITLE);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_HIDDEN_CONVERSATION_TITLE);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_MESSAGES);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_HISTORIC_MESSAGES);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_IS_GROUP_CONVERSATION);
        }

        public static final class Message {
            static final java.lang.String KEY_DATA_MIME_TYPE = "type";
            static final java.lang.String KEY_DATA_URI = "uri";
            static final java.lang.String KEY_EXTRAS_BUNDLE = "extras";
            static final java.lang.String KEY_NOTIFICATION_PERSON = "sender_person";
            static final java.lang.String KEY_PERSON = "person";
            static final java.lang.String KEY_SENDER = "sender";
            static final java.lang.String KEY_TEXT = "text";
            static final java.lang.String KEY_TIMESTAMP = "time";
            private java.lang.String mDataMimeType;
            private android.net.Uri mDataUri;
            private android.os.Bundle mExtras;
            private final androidx.core.app.Person mPerson;
            private final java.lang.CharSequence mText;
            private final long mTimestamp;

            public Message(java.lang.CharSequence charSequence, long j, androidx.core.app.Person person) {
                this.mExtras = new android.os.Bundle();
                this.mText = charSequence;
                this.mTimestamp = j;
                this.mPerson = person;
            }

            @java.lang.Deprecated
            public Message(java.lang.CharSequence charSequence, long j, java.lang.CharSequence charSequence2) {
                this(charSequence, j, new androidx.core.app.Person.Builder().setName(charSequence2).build());
            }

            public androidx.core.app.NotificationCompat.MessagingStyle.Message setData(java.lang.String str, android.net.Uri uri) {
                this.mDataMimeType = str;
                this.mDataUri = uri;
                return this;
            }

            public java.lang.CharSequence getText() {
                return this.mText;
            }

            public long getTimestamp() {
                return this.mTimestamp;
            }

            public android.os.Bundle getExtras() {
                return this.mExtras;
            }

            @java.lang.Deprecated
            public java.lang.CharSequence getSender() {
                androidx.core.app.Person person = this.mPerson;
                if (person == null) {
                    return null;
                }
                return person.getName();
            }

            public androidx.core.app.Person getPerson() {
                return this.mPerson;
            }

            public java.lang.String getDataMimeType() {
                return this.mDataMimeType;
            }

            public android.net.Uri getDataUri() {
                return this.mDataUri;
            }

            private android.os.Bundle toBundle() {
                android.os.Bundle bundle = new android.os.Bundle();
                java.lang.CharSequence charSequence = this.mText;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong(KEY_TIMESTAMP, this.mTimestamp);
                androidx.core.app.Person person = this.mPerson;
                if (person != null) {
                    bundle.putCharSequence(KEY_SENDER, person.getName());
                    if (android.os.Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable(KEY_NOTIFICATION_PERSON, this.mPerson.toAndroidPerson());
                    } else {
                        bundle.putBundle(KEY_PERSON, this.mPerson.toBundle());
                    }
                }
                java.lang.String str = this.mDataMimeType;
                if (str != null) {
                    bundle.putString("type", str);
                }
                android.net.Uri uri = this.mDataUri;
                if (uri != null) {
                    bundle.putParcelable(KEY_DATA_URI, uri);
                }
                android.os.Bundle bundle2 = this.mExtras;
                if (bundle2 != null) {
                    bundle.putBundle(KEY_EXTRAS_BUNDLE, bundle2);
                }
                return bundle;
            }

            static android.os.Bundle[] getBundleArrayForMessages(java.util.List<androidx.core.app.NotificationCompat.MessagingStyle.Message> list) {
                android.os.Bundle[] bundleArr = new android.os.Bundle[list.size()];
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    bundleArr[i] = list.get(i).toBundle();
                }
                return bundleArr;
            }

            static java.util.List<androidx.core.app.NotificationCompat.MessagingStyle.Message> getMessagesFromBundleArray(android.os.Parcelable[] parcelableArr) {
                androidx.core.app.NotificationCompat.MessagingStyle.Message messageFromBundle;
                java.util.ArrayList arrayList = new java.util.ArrayList(parcelableArr.length);
                for (android.os.Parcelable parcelable : parcelableArr) {
                    if ((parcelable instanceof android.os.Bundle) && (messageFromBundle = getMessageFromBundle((android.os.Bundle) parcelable)) != null) {
                        arrayList.add(messageFromBundle);
                    }
                }
                return arrayList;
            }

            static androidx.core.app.NotificationCompat.MessagingStyle.Message getMessageFromBundle(android.os.Bundle bundle) {
                androidx.core.app.Person personBuild;
                try {
                    if (bundle.containsKey("text") && bundle.containsKey(KEY_TIMESTAMP)) {
                        if (bundle.containsKey(KEY_PERSON)) {
                            personBuild = androidx.core.app.Person.fromBundle(bundle.getBundle(KEY_PERSON));
                        } else if (bundle.containsKey(KEY_NOTIFICATION_PERSON) && android.os.Build.VERSION.SDK_INT >= 28) {
                            personBuild = androidx.core.app.Person.fromAndroidPerson((android.app.Person) bundle.getParcelable(KEY_NOTIFICATION_PERSON));
                        } else {
                            personBuild = bundle.containsKey(KEY_SENDER) ? new androidx.core.app.Person.Builder().setName(bundle.getCharSequence(KEY_SENDER)).build() : null;
                        }
                        androidx.core.app.NotificationCompat.MessagingStyle.Message message = new androidx.core.app.NotificationCompat.MessagingStyle.Message(bundle.getCharSequence("text"), bundle.getLong(KEY_TIMESTAMP), personBuild);
                        if (bundle.containsKey("type") && bundle.containsKey(KEY_DATA_URI)) {
                            message.setData(bundle.getString("type"), (android.net.Uri) bundle.getParcelable(KEY_DATA_URI));
                        }
                        if (bundle.containsKey(KEY_EXTRAS_BUNDLE)) {
                            message.getExtras().putAll(bundle.getBundle(KEY_EXTRAS_BUNDLE));
                        }
                        return message;
                    }
                } catch (java.lang.ClassCastException unused) {
                }
                return null;
            }

            android.app.Notification.MessagingStyle.Message toAndroidMessage() {
                android.app.Notification.MessagingStyle.Message message;
                androidx.core.app.Person person = getPerson();
                if (android.os.Build.VERSION.SDK_INT >= 28) {
                    message = new android.app.Notification.MessagingStyle.Message(getText(), getTimestamp(), person != null ? person.toAndroidPerson() : null);
                } else {
                    message = new android.app.Notification.MessagingStyle.Message(getText(), getTimestamp(), person != null ? person.getName() : null);
                }
                if (getDataMimeType() != null) {
                    message.setData(getDataMimeType(), getDataUri());
                }
                return message;
            }
        }
    }

    public static class InboxStyle extends androidx.core.app.NotificationCompat.Style {
        private static final java.lang.String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$InboxStyle";
        private java.util.ArrayList<java.lang.CharSequence> mTexts = new java.util.ArrayList<>();

        @Override // androidx.core.app.NotificationCompat.Style
        protected java.lang.String getClassName() {
            return TEMPLATE_CLASS_NAME;
        }

        public InboxStyle() {
        }

        public InboxStyle(androidx.core.app.NotificationCompat.Builder builder) {
            setBuilder(builder);
        }

        public androidx.core.app.NotificationCompat.InboxStyle setBigContentTitle(java.lang.CharSequence charSequence) {
            this.mBigContentTitle = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(charSequence);
            return this;
        }

        public androidx.core.app.NotificationCompat.InboxStyle setSummaryText(java.lang.CharSequence charSequence) {
            this.mSummaryText = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(charSequence);
            this.mSummaryTextSet = true;
            return this;
        }

        public androidx.core.app.NotificationCompat.InboxStyle addLine(java.lang.CharSequence charSequence) {
            if (charSequence != null) {
                this.mTexts.add(androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(charSequence));
            }
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(androidx.core.app.NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            android.app.Notification.InboxStyle bigContentTitle = new android.app.Notification.InboxStyle(notificationBuilderWithBuilderAccessor.getBuilder()).setBigContentTitle(this.mBigContentTitle);
            if (this.mSummaryTextSet) {
                bigContentTitle.setSummaryText(this.mSummaryText);
            }
            java.util.Iterator<java.lang.CharSequence> it = this.mTexts.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine(it.next());
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void restoreFromCompatExtras(android.os.Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            this.mTexts.clear();
            if (bundle.containsKey(androidx.core.app.NotificationCompat.EXTRA_TEXT_LINES)) {
                java.util.Collections.addAll(this.mTexts, bundle.getCharSequenceArray(androidx.core.app.NotificationCompat.EXTRA_TEXT_LINES));
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void clearCompatExtraKeys(android.os.Bundle bundle) {
            super.clearCompatExtraKeys(bundle);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_TEXT_LINES);
        }
    }

    public static class DecoratedCustomViewStyle extends androidx.core.app.NotificationCompat.Style {
        private static final int MAX_ACTION_BUTTONS = 3;
        private static final java.lang.String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";

        @Override // androidx.core.app.NotificationCompat.Style
        public boolean displayCustomViewInline() {
            return true;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected java.lang.String getClassName() {
            return TEMPLATE_CLASS_NAME;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public android.widget.RemoteViews makeBigContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public android.widget.RemoteViews makeContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public android.widget.RemoteViews makeHeadsUpContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(androidx.core.app.NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            notificationBuilderWithBuilderAccessor.getBuilder().setStyle(new android.app.Notification.DecoratedCustomViewStyle());
        }

        private android.widget.RemoteViews createRemoteViews(android.widget.RemoteViews remoteViews, boolean z) {
            int iMin;
            boolean z2 = true;
            android.widget.RemoteViews remoteViewsApplyStandardTemplate = applyStandardTemplate(true, androidx.core.R.layout.notification_template_custom_big, false);
            remoteViewsApplyStandardTemplate.removeAllViews(androidx.core.R.id.actions);
            java.util.List<androidx.core.app.NotificationCompat.Action> nonContextualActions = getNonContextualActions(this.mBuilder.mActions);
            if (!z || nonContextualActions == null || (iMin = java.lang.Math.min(nonContextualActions.size(), 3)) <= 0) {
                z2 = false;
            } else {
                for (int i = 0; i < iMin; i++) {
                    remoteViewsApplyStandardTemplate.addView(androidx.core.R.id.actions, generateActionButton(nonContextualActions.get(i)));
                }
            }
            int i2 = z2 ? 0 : 8;
            remoteViewsApplyStandardTemplate.setViewVisibility(androidx.core.R.id.actions, i2);
            remoteViewsApplyStandardTemplate.setViewVisibility(androidx.core.R.id.action_divider, i2);
            buildIntoRemoteViews(remoteViewsApplyStandardTemplate, remoteViews);
            return remoteViewsApplyStandardTemplate;
        }

        private static java.util.List<androidx.core.app.NotificationCompat.Action> getNonContextualActions(java.util.List<androidx.core.app.NotificationCompat.Action> list) {
            if (list == null) {
                return null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (androidx.core.app.NotificationCompat.Action action : list) {
                if (!action.isContextual()) {
                    arrayList.add(action);
                }
            }
            return arrayList;
        }

        private android.widget.RemoteViews generateActionButton(androidx.core.app.NotificationCompat.Action action) {
            int i;
            boolean z = action.actionIntent == null;
            java.lang.String packageName = this.mBuilder.mContext.getPackageName();
            if (z) {
                i = androidx.core.R.layout.notification_action_tombstone;
            } else {
                i = androidx.core.R.layout.notification_action;
            }
            android.widget.RemoteViews remoteViews = new android.widget.RemoteViews(packageName, i);
            androidx.core.graphics.drawable.IconCompat iconCompat = action.getIconCompat();
            if (iconCompat != null) {
                remoteViews.setImageViewBitmap(androidx.core.R.id.action_image, createColoredBitmap(iconCompat, this.mBuilder.mContext.getResources().getColor(androidx.core.R.color.notification_action_color_filter)));
            }
            remoteViews.setTextViewText(androidx.core.R.id.action_text, action.title);
            if (!z) {
                remoteViews.setOnClickPendingIntent(androidx.core.R.id.action_container, action.actionIntent);
            }
            remoteViews.setContentDescription(androidx.core.R.id.action_container, action.title);
            return remoteViews;
        }
    }

    public static class Action {
        static final java.lang.String EXTRA_SEMANTIC_ACTION = "android.support.action.semanticAction";
        static final java.lang.String EXTRA_SHOWS_USER_INTERFACE = "android.support.action.showsUserInterface";
        public static final int SEMANTIC_ACTION_ARCHIVE = 5;
        public static final int SEMANTIC_ACTION_CALL = 10;
        public static final int SEMANTIC_ACTION_DELETE = 4;
        public static final int SEMANTIC_ACTION_MARK_AS_READ = 2;
        public static final int SEMANTIC_ACTION_MARK_AS_UNREAD = 3;
        public static final int SEMANTIC_ACTION_MUTE = 6;
        public static final int SEMANTIC_ACTION_NONE = 0;
        public static final int SEMANTIC_ACTION_REPLY = 1;
        public static final int SEMANTIC_ACTION_THUMBS_DOWN = 9;
        public static final int SEMANTIC_ACTION_THUMBS_UP = 8;
        public static final int SEMANTIC_ACTION_UNMUTE = 7;
        public android.app.PendingIntent actionIntent;

        @java.lang.Deprecated
        public int icon;
        private boolean mAllowGeneratedReplies;
        private boolean mAuthenticationRequired;
        private final androidx.core.app.RemoteInput[] mDataOnlyRemoteInputs;
        final android.os.Bundle mExtras;
        private androidx.core.graphics.drawable.IconCompat mIcon;
        private final boolean mIsContextual;
        private final androidx.core.app.RemoteInput[] mRemoteInputs;
        private final int mSemanticAction;
        boolean mShowsUserInterface;
        public java.lang.CharSequence title;

        public interface Extender {
            androidx.core.app.NotificationCompat.Action.Builder extend(androidx.core.app.NotificationCompat.Action.Builder builder);
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface SemanticAction {
        }

        public Action(int i, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent) {
            this(i != 0 ? androidx.core.graphics.drawable.IconCompat.createWithResource(null, "", i) : null, charSequence, pendingIntent);
        }

        public Action(androidx.core.graphics.drawable.IconCompat iconCompat, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new android.os.Bundle(), (androidx.core.app.RemoteInput[]) null, (androidx.core.app.RemoteInput[]) null, true, 0, true, false, false);
        }

        Action(int i, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent, android.os.Bundle bundle, androidx.core.app.RemoteInput[] remoteInputArr, androidx.core.app.RemoteInput[] remoteInputArr2, boolean z, int i2, boolean z2, boolean z3, boolean z4) {
            this(i != 0 ? androidx.core.graphics.drawable.IconCompat.createWithResource(null, "", i) : null, charSequence, pendingIntent, bundle, remoteInputArr, remoteInputArr2, z, i2, z2, z3, z4);
        }

        Action(androidx.core.graphics.drawable.IconCompat iconCompat, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent, android.os.Bundle bundle, androidx.core.app.RemoteInput[] remoteInputArr, androidx.core.app.RemoteInput[] remoteInputArr2, boolean z, int i, boolean z2, boolean z3, boolean z4) {
            this.mShowsUserInterface = true;
            this.mIcon = iconCompat;
            if (iconCompat != null && iconCompat.getType() == 2) {
                this.icon = iconCompat.getResId();
            }
            this.title = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(charSequence);
            this.actionIntent = pendingIntent;
            this.mExtras = bundle == null ? new android.os.Bundle() : bundle;
            this.mRemoteInputs = remoteInputArr;
            this.mDataOnlyRemoteInputs = remoteInputArr2;
            this.mAllowGeneratedReplies = z;
            this.mSemanticAction = i;
            this.mShowsUserInterface = z2;
            this.mIsContextual = z3;
            this.mAuthenticationRequired = z4;
        }

        @java.lang.Deprecated
        public int getIcon() {
            return this.icon;
        }

        public androidx.core.graphics.drawable.IconCompat getIconCompat() {
            int i;
            if (this.mIcon == null && (i = this.icon) != 0) {
                this.mIcon = androidx.core.graphics.drawable.IconCompat.createWithResource(null, "", i);
            }
            return this.mIcon;
        }

        public java.lang.CharSequence getTitle() {
            return this.title;
        }

        public android.app.PendingIntent getActionIntent() {
            return this.actionIntent;
        }

        public android.os.Bundle getExtras() {
            return this.mExtras;
        }

        public boolean getAllowGeneratedReplies() {
            return this.mAllowGeneratedReplies;
        }

        public boolean isAuthenticationRequired() {
            return this.mAuthenticationRequired;
        }

        public androidx.core.app.RemoteInput[] getRemoteInputs() {
            return this.mRemoteInputs;
        }

        public int getSemanticAction() {
            return this.mSemanticAction;
        }

        public boolean isContextual() {
            return this.mIsContextual;
        }

        public androidx.core.app.RemoteInput[] getDataOnlyRemoteInputs() {
            return this.mDataOnlyRemoteInputs;
        }

        public boolean getShowsUserInterface() {
            return this.mShowsUserInterface;
        }

        public static final class Builder {
            private boolean mAllowGeneratedReplies;
            private boolean mAuthenticationRequired;
            private final android.os.Bundle mExtras;
            private final androidx.core.graphics.drawable.IconCompat mIcon;
            private final android.app.PendingIntent mIntent;
            private boolean mIsContextual;
            private java.util.ArrayList<androidx.core.app.RemoteInput> mRemoteInputs;
            private int mSemanticAction;
            private boolean mShowsUserInterface;
            private final java.lang.CharSequence mTitle;

            public static androidx.core.app.NotificationCompat.Action.Builder fromAndroidAction(android.app.Notification.Action action) {
                androidx.core.app.NotificationCompat.Action.Builder builder;
                if (action.getIcon() != null) {
                    builder = new androidx.core.app.NotificationCompat.Action.Builder(androidx.core.graphics.drawable.IconCompat.createFromIcon(action.getIcon()), action.title, action.actionIntent);
                } else {
                    builder = new androidx.core.app.NotificationCompat.Action.Builder(action.icon, action.title, action.actionIntent);
                }
                android.app.RemoteInput[] remoteInputs = action.getRemoteInputs();
                if (remoteInputs != null && remoteInputs.length != 0) {
                    for (android.app.RemoteInput remoteInput : remoteInputs) {
                        builder.addRemoteInput(androidx.core.app.RemoteInput.fromPlatform(remoteInput));
                    }
                }
                builder.mAllowGeneratedReplies = action.getAllowGeneratedReplies();
                if (android.os.Build.VERSION.SDK_INT >= 28) {
                    builder.setSemanticAction(action.getSemanticAction());
                }
                if (android.os.Build.VERSION.SDK_INT >= 29) {
                    builder.setContextual(action.isContextual());
                }
                if (android.os.Build.VERSION.SDK_INT >= 31) {
                    builder.setAuthenticationRequired(action.isAuthenticationRequired());
                }
                return builder;
            }

            public Builder(androidx.core.graphics.drawable.IconCompat iconCompat, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new android.os.Bundle(), null, true, 0, true, false, false);
            }

            public Builder(int i, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent) {
                this(i != 0 ? androidx.core.graphics.drawable.IconCompat.createWithResource(null, "", i) : null, charSequence, pendingIntent, new android.os.Bundle(), null, true, 0, true, false, false);
            }

            public Builder(androidx.core.app.NotificationCompat.Action action) {
                this(action.getIconCompat(), action.title, action.actionIntent, new android.os.Bundle(action.mExtras), action.getRemoteInputs(), action.getAllowGeneratedReplies(), action.getSemanticAction(), action.mShowsUserInterface, action.isContextual(), action.isAuthenticationRequired());
            }

            private Builder(androidx.core.graphics.drawable.IconCompat iconCompat, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent, android.os.Bundle bundle, androidx.core.app.RemoteInput[] remoteInputArr, boolean z, int i, boolean z2, boolean z3, boolean z4) {
                this.mAllowGeneratedReplies = true;
                this.mShowsUserInterface = true;
                this.mIcon = iconCompat;
                this.mTitle = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(charSequence);
                this.mIntent = pendingIntent;
                this.mExtras = bundle;
                this.mRemoteInputs = remoteInputArr == null ? null : new java.util.ArrayList<>(java.util.Arrays.asList(remoteInputArr));
                this.mAllowGeneratedReplies = z;
                this.mSemanticAction = i;
                this.mShowsUserInterface = z2;
                this.mIsContextual = z3;
                this.mAuthenticationRequired = z4;
            }

            public androidx.core.app.NotificationCompat.Action.Builder addExtras(android.os.Bundle bundle) {
                if (bundle != null) {
                    this.mExtras.putAll(bundle);
                }
                return this;
            }

            public android.os.Bundle getExtras() {
                return this.mExtras;
            }

            public androidx.core.app.NotificationCompat.Action.Builder addRemoteInput(androidx.core.app.RemoteInput remoteInput) {
                if (this.mRemoteInputs == null) {
                    this.mRemoteInputs = new java.util.ArrayList<>();
                }
                if (remoteInput != null) {
                    this.mRemoteInputs.add(remoteInput);
                }
                return this;
            }

            public androidx.core.app.NotificationCompat.Action.Builder setAllowGeneratedReplies(boolean z) {
                this.mAllowGeneratedReplies = z;
                return this;
            }

            public androidx.core.app.NotificationCompat.Action.Builder setSemanticAction(int i) {
                this.mSemanticAction = i;
                return this;
            }

            public androidx.core.app.NotificationCompat.Action.Builder setContextual(boolean z) {
                this.mIsContextual = z;
                return this;
            }

            public androidx.core.app.NotificationCompat.Action.Builder setAuthenticationRequired(boolean z) {
                this.mAuthenticationRequired = z;
                return this;
            }

            public androidx.core.app.NotificationCompat.Action.Builder setShowsUserInterface(boolean z) {
                this.mShowsUserInterface = z;
                return this;
            }

            public androidx.core.app.NotificationCompat.Action.Builder extend(androidx.core.app.NotificationCompat.Action.Extender extender) {
                extender.extend(this);
                return this;
            }

            private void checkContextualActionNullFields() {
                if (this.mIsContextual && this.mIntent == null) {
                    throw new java.lang.NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            public androidx.core.app.NotificationCompat.Action build() {
                checkContextualActionNullFields();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.ArrayList<androidx.core.app.RemoteInput> arrayList3 = this.mRemoteInputs;
                if (arrayList3 != null) {
                    for (androidx.core.app.RemoteInput remoteInput : arrayList3) {
                        if (remoteInput.isDataOnly()) {
                            arrayList.add(remoteInput);
                        } else {
                            arrayList2.add(remoteInput);
                        }
                    }
                }
                androidx.core.app.RemoteInput[] remoteInputArr = arrayList.isEmpty() ? null : (androidx.core.app.RemoteInput[]) arrayList.toArray(new androidx.core.app.RemoteInput[arrayList.size()]);
                return new androidx.core.app.NotificationCompat.Action(this.mIcon, this.mTitle, this.mIntent, this.mExtras, arrayList2.isEmpty() ? null : (androidx.core.app.RemoteInput[]) arrayList2.toArray(new androidx.core.app.RemoteInput[arrayList2.size()]), remoteInputArr, this.mAllowGeneratedReplies, this.mSemanticAction, this.mShowsUserInterface, this.mIsContextual, this.mAuthenticationRequired);
            }
        }

        public static final class WearableExtender implements androidx.core.app.NotificationCompat.Action.Extender {
            private static final int DEFAULT_FLAGS = 1;
            private static final java.lang.String EXTRA_WEARABLE_EXTENSIONS = "android.wearable.EXTENSIONS";
            private static final int FLAG_AVAILABLE_OFFLINE = 1;
            private static final int FLAG_HINT_DISPLAY_INLINE = 4;
            private static final int FLAG_HINT_LAUNCHES_ACTIVITY = 2;
            private static final java.lang.String KEY_CANCEL_LABEL = "cancelLabel";
            private static final java.lang.String KEY_CONFIRM_LABEL = "confirmLabel";
            private static final java.lang.String KEY_FLAGS = "flags";
            private static final java.lang.String KEY_IN_PROGRESS_LABEL = "inProgressLabel";
            private java.lang.CharSequence mCancelLabel;
            private java.lang.CharSequence mConfirmLabel;
            private int mFlags;
            private java.lang.CharSequence mInProgressLabel;

            public WearableExtender() {
                this.mFlags = 1;
            }

            public WearableExtender(androidx.core.app.NotificationCompat.Action action) {
                this.mFlags = 1;
                android.os.Bundle bundle = action.getExtras().getBundle(EXTRA_WEARABLE_EXTENSIONS);
                if (bundle != null) {
                    this.mFlags = bundle.getInt(KEY_FLAGS, 1);
                    this.mInProgressLabel = bundle.getCharSequence(KEY_IN_PROGRESS_LABEL);
                    this.mConfirmLabel = bundle.getCharSequence(KEY_CONFIRM_LABEL);
                    this.mCancelLabel = bundle.getCharSequence(KEY_CANCEL_LABEL);
                }
            }

            @Override // androidx.core.app.NotificationCompat.Action.Extender
            public androidx.core.app.NotificationCompat.Action.Builder extend(androidx.core.app.NotificationCompat.Action.Builder builder) {
                android.os.Bundle bundle = new android.os.Bundle();
                int i = this.mFlags;
                if (i != 1) {
                    bundle.putInt(KEY_FLAGS, i);
                }
                java.lang.CharSequence charSequence = this.mInProgressLabel;
                if (charSequence != null) {
                    bundle.putCharSequence(KEY_IN_PROGRESS_LABEL, charSequence);
                }
                java.lang.CharSequence charSequence2 = this.mConfirmLabel;
                if (charSequence2 != null) {
                    bundle.putCharSequence(KEY_CONFIRM_LABEL, charSequence2);
                }
                java.lang.CharSequence charSequence3 = this.mCancelLabel;
                if (charSequence3 != null) {
                    bundle.putCharSequence(KEY_CANCEL_LABEL, charSequence3);
                }
                builder.getExtras().putBundle(EXTRA_WEARABLE_EXTENSIONS, bundle);
                return builder;
            }

            /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
            public androidx.core.app.NotificationCompat.Action.WearableExtender m18clone() {
                androidx.core.app.NotificationCompat.Action.WearableExtender wearableExtender = new androidx.core.app.NotificationCompat.Action.WearableExtender();
                wearableExtender.mFlags = this.mFlags;
                wearableExtender.mInProgressLabel = this.mInProgressLabel;
                wearableExtender.mConfirmLabel = this.mConfirmLabel;
                wearableExtender.mCancelLabel = this.mCancelLabel;
                return wearableExtender;
            }

            public androidx.core.app.NotificationCompat.Action.WearableExtender setAvailableOffline(boolean z) {
                setFlag(1, z);
                return this;
            }

            public boolean isAvailableOffline() {
                return (this.mFlags & 1) != 0;
            }

            private void setFlag(int i, boolean z) {
                if (z) {
                    this.mFlags = i | this.mFlags;
                } else {
                    this.mFlags = (~i) & this.mFlags;
                }
            }

            @java.lang.Deprecated
            public androidx.core.app.NotificationCompat.Action.WearableExtender setInProgressLabel(java.lang.CharSequence charSequence) {
                this.mInProgressLabel = charSequence;
                return this;
            }

            @java.lang.Deprecated
            public java.lang.CharSequence getInProgressLabel() {
                return this.mInProgressLabel;
            }

            @java.lang.Deprecated
            public androidx.core.app.NotificationCompat.Action.WearableExtender setConfirmLabel(java.lang.CharSequence charSequence) {
                this.mConfirmLabel = charSequence;
                return this;
            }

            @java.lang.Deprecated
            public java.lang.CharSequence getConfirmLabel() {
                return this.mConfirmLabel;
            }

            @java.lang.Deprecated
            public androidx.core.app.NotificationCompat.Action.WearableExtender setCancelLabel(java.lang.CharSequence charSequence) {
                this.mCancelLabel = charSequence;
                return this;
            }

            @java.lang.Deprecated
            public java.lang.CharSequence getCancelLabel() {
                return this.mCancelLabel;
            }

            public androidx.core.app.NotificationCompat.Action.WearableExtender setHintLaunchesActivity(boolean z) {
                setFlag(2, z);
                return this;
            }

            public boolean getHintLaunchesActivity() {
                return (this.mFlags & 2) != 0;
            }

            public androidx.core.app.NotificationCompat.Action.WearableExtender setHintDisplayActionInline(boolean z) {
                setFlag(4, z);
                return this;
            }

            public boolean getHintDisplayActionInline() {
                return (this.mFlags & 4) != 0;
            }
        }
    }

    public static final class WearableExtender implements androidx.core.app.NotificationCompat.Extender {
        private static final int DEFAULT_CONTENT_ICON_GRAVITY = 8388613;
        private static final int DEFAULT_FLAGS = 1;
        private static final int DEFAULT_GRAVITY = 80;
        private static final java.lang.String EXTRA_WEARABLE_EXTENSIONS = "android.wearable.EXTENSIONS";
        private static final int FLAG_BIG_PICTURE_AMBIENT = 32;
        private static final int FLAG_CONTENT_INTENT_AVAILABLE_OFFLINE = 1;
        private static final int FLAG_HINT_AVOID_BACKGROUND_CLIPPING = 16;
        private static final int FLAG_HINT_CONTENT_INTENT_LAUNCHES_ACTIVITY = 64;
        private static final int FLAG_HINT_HIDE_ICON = 2;
        private static final int FLAG_HINT_SHOW_BACKGROUND_ONLY = 4;
        private static final int FLAG_START_SCROLL_BOTTOM = 8;
        private static final java.lang.String KEY_ACTIONS = "actions";
        private static final java.lang.String KEY_BACKGROUND = "background";
        private static final java.lang.String KEY_BRIDGE_TAG = "bridgeTag";
        private static final java.lang.String KEY_CONTENT_ACTION_INDEX = "contentActionIndex";
        private static final java.lang.String KEY_CONTENT_ICON = "contentIcon";
        private static final java.lang.String KEY_CONTENT_ICON_GRAVITY = "contentIconGravity";
        private static final java.lang.String KEY_CUSTOM_CONTENT_HEIGHT = "customContentHeight";
        private static final java.lang.String KEY_CUSTOM_SIZE_PRESET = "customSizePreset";
        private static final java.lang.String KEY_DISMISSAL_ID = "dismissalId";
        private static final java.lang.String KEY_DISPLAY_INTENT = "displayIntent";
        private static final java.lang.String KEY_FLAGS = "flags";
        private static final java.lang.String KEY_GRAVITY = "gravity";
        private static final java.lang.String KEY_HINT_SCREEN_TIMEOUT = "hintScreenTimeout";
        private static final java.lang.String KEY_PAGES = "pages";

        @java.lang.Deprecated
        public static final int SCREEN_TIMEOUT_LONG = -1;

        @java.lang.Deprecated
        public static final int SCREEN_TIMEOUT_SHORT = 0;

        @java.lang.Deprecated
        public static final int SIZE_DEFAULT = 0;

        @java.lang.Deprecated
        public static final int SIZE_FULL_SCREEN = 5;

        @java.lang.Deprecated
        public static final int SIZE_LARGE = 4;

        @java.lang.Deprecated
        public static final int SIZE_MEDIUM = 3;

        @java.lang.Deprecated
        public static final int SIZE_SMALL = 2;

        @java.lang.Deprecated
        public static final int SIZE_XSMALL = 1;
        public static final int UNSET_ACTION_INDEX = -1;
        private java.util.ArrayList<androidx.core.app.NotificationCompat.Action> mActions;
        private android.graphics.Bitmap mBackground;
        private java.lang.String mBridgeTag;
        private int mContentActionIndex;
        private int mContentIcon;
        private int mContentIconGravity;
        private int mCustomContentHeight;
        private int mCustomSizePreset;
        private java.lang.String mDismissalId;
        private android.app.PendingIntent mDisplayIntent;
        private int mFlags;
        private int mGravity;
        private int mHintScreenTimeout;
        private java.util.ArrayList<android.app.Notification> mPages;

        public WearableExtender() {
            this.mActions = new java.util.ArrayList<>();
            this.mFlags = 1;
            this.mPages = new java.util.ArrayList<>();
            this.mContentIconGravity = 8388613;
            this.mContentActionIndex = -1;
            this.mCustomSizePreset = 0;
            this.mGravity = 80;
        }

        public WearableExtender(android.app.Notification notification) {
            this.mActions = new java.util.ArrayList<>();
            this.mFlags = 1;
            this.mPages = new java.util.ArrayList<>();
            this.mContentIconGravity = 8388613;
            this.mContentActionIndex = -1;
            this.mCustomSizePreset = 0;
            this.mGravity = 80;
            android.os.Bundle extras = androidx.core.app.NotificationCompat.getExtras(notification);
            android.os.Bundle bundle = extras != null ? extras.getBundle(EXTRA_WEARABLE_EXTENSIONS) : null;
            if (bundle != null) {
                java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(KEY_ACTIONS);
                if (parcelableArrayList != null) {
                    int size = parcelableArrayList.size();
                    androidx.core.app.NotificationCompat.Action[] actionArr = new androidx.core.app.NotificationCompat.Action[size];
                    for (int i = 0; i < size; i++) {
                        actionArr[i] = androidx.core.app.NotificationCompat.getActionCompatFromAction((android.app.Notification.Action) parcelableArrayList.get(i));
                    }
                    java.util.Collections.addAll(this.mActions, actionArr);
                }
                this.mFlags = bundle.getInt(KEY_FLAGS, 1);
                this.mDisplayIntent = (android.app.PendingIntent) bundle.getParcelable(KEY_DISPLAY_INTENT);
                android.app.Notification[] notificationArrayFromBundle = androidx.core.app.NotificationCompat.getNotificationArrayFromBundle(bundle, KEY_PAGES);
                if (notificationArrayFromBundle != null) {
                    java.util.Collections.addAll(this.mPages, notificationArrayFromBundle);
                }
                this.mBackground = (android.graphics.Bitmap) bundle.getParcelable(KEY_BACKGROUND);
                this.mContentIcon = bundle.getInt(KEY_CONTENT_ICON);
                this.mContentIconGravity = bundle.getInt(KEY_CONTENT_ICON_GRAVITY, 8388613);
                this.mContentActionIndex = bundle.getInt(KEY_CONTENT_ACTION_INDEX, -1);
                this.mCustomSizePreset = bundle.getInt(KEY_CUSTOM_SIZE_PRESET, 0);
                this.mCustomContentHeight = bundle.getInt(KEY_CUSTOM_CONTENT_HEIGHT);
                this.mGravity = bundle.getInt(KEY_GRAVITY, 80);
                this.mHintScreenTimeout = bundle.getInt(KEY_HINT_SCREEN_TIMEOUT);
                this.mDismissalId = bundle.getString(KEY_DISMISSAL_ID);
                this.mBridgeTag = bundle.getString(KEY_BRIDGE_TAG);
            }
        }

        @Override // androidx.core.app.NotificationCompat.Extender
        public androidx.core.app.NotificationCompat.Builder extend(androidx.core.app.NotificationCompat.Builder builder) {
            android.os.Bundle bundle = new android.os.Bundle();
            if (!this.mActions.isEmpty()) {
                java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>(this.mActions.size());
                java.util.Iterator<androidx.core.app.NotificationCompat.Action> it = this.mActions.iterator();
                while (it.hasNext()) {
                    arrayList.add(getActionFromActionCompat(it.next()));
                }
                bundle.putParcelableArrayList(KEY_ACTIONS, arrayList);
            }
            int i = this.mFlags;
            if (i != 1) {
                bundle.putInt(KEY_FLAGS, i);
            }
            android.app.PendingIntent pendingIntent = this.mDisplayIntent;
            if (pendingIntent != null) {
                bundle.putParcelable(KEY_DISPLAY_INTENT, pendingIntent);
            }
            if (!this.mPages.isEmpty()) {
                java.util.ArrayList<android.app.Notification> arrayList2 = this.mPages;
                bundle.putParcelableArray(KEY_PAGES, (android.os.Parcelable[]) arrayList2.toArray(new android.app.Notification[arrayList2.size()]));
            }
            android.graphics.Bitmap bitmap = this.mBackground;
            if (bitmap != null) {
                bundle.putParcelable(KEY_BACKGROUND, bitmap);
            }
            int i2 = this.mContentIcon;
            if (i2 != 0) {
                bundle.putInt(KEY_CONTENT_ICON, i2);
            }
            int i3 = this.mContentIconGravity;
            if (i3 != 8388613) {
                bundle.putInt(KEY_CONTENT_ICON_GRAVITY, i3);
            }
            int i4 = this.mContentActionIndex;
            if (i4 != -1) {
                bundle.putInt(KEY_CONTENT_ACTION_INDEX, i4);
            }
            int i5 = this.mCustomSizePreset;
            if (i5 != 0) {
                bundle.putInt(KEY_CUSTOM_SIZE_PRESET, i5);
            }
            int i6 = this.mCustomContentHeight;
            if (i6 != 0) {
                bundle.putInt(KEY_CUSTOM_CONTENT_HEIGHT, i6);
            }
            int i7 = this.mGravity;
            if (i7 != 80) {
                bundle.putInt(KEY_GRAVITY, i7);
            }
            int i8 = this.mHintScreenTimeout;
            if (i8 != 0) {
                bundle.putInt(KEY_HINT_SCREEN_TIMEOUT, i8);
            }
            java.lang.String str = this.mDismissalId;
            if (str != null) {
                bundle.putString(KEY_DISMISSAL_ID, str);
            }
            java.lang.String str2 = this.mBridgeTag;
            if (str2 != null) {
                bundle.putString(KEY_BRIDGE_TAG, str2);
            }
            builder.getExtras().putBundle(EXTRA_WEARABLE_EXTENSIONS, bundle);
            return builder;
        }

        private static android.app.Notification.Action getActionFromActionCompat(androidx.core.app.NotificationCompat.Action action) {
            android.os.Bundle bundle;
            androidx.core.graphics.drawable.IconCompat iconCompat = action.getIconCompat();
            android.app.Notification.Action.Builder builder = new android.app.Notification.Action.Builder(iconCompat == null ? null : iconCompat.toIcon(), action.getTitle(), action.getActionIntent());
            if (action.getExtras() != null) {
                bundle = new android.os.Bundle(action.getExtras());
            } else {
                bundle = new android.os.Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
            builder.setAllowGeneratedReplies(action.getAllowGeneratedReplies());
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                builder.setAuthenticationRequired(action.isAuthenticationRequired());
            }
            builder.addExtras(bundle);
            androidx.core.app.RemoteInput[] remoteInputs = action.getRemoteInputs();
            if (remoteInputs != null) {
                for (android.app.RemoteInput remoteInput : androidx.core.app.RemoteInput.fromCompat(remoteInputs)) {
                    builder.addRemoteInput(remoteInput);
                }
            }
            return builder.build();
        }

        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public androidx.core.app.NotificationCompat.WearableExtender m19clone() {
            androidx.core.app.NotificationCompat.WearableExtender wearableExtender = new androidx.core.app.NotificationCompat.WearableExtender();
            wearableExtender.mActions = new java.util.ArrayList<>(this.mActions);
            wearableExtender.mFlags = this.mFlags;
            wearableExtender.mDisplayIntent = this.mDisplayIntent;
            wearableExtender.mPages = new java.util.ArrayList<>(this.mPages);
            wearableExtender.mBackground = this.mBackground;
            wearableExtender.mContentIcon = this.mContentIcon;
            wearableExtender.mContentIconGravity = this.mContentIconGravity;
            wearableExtender.mContentActionIndex = this.mContentActionIndex;
            wearableExtender.mCustomSizePreset = this.mCustomSizePreset;
            wearableExtender.mCustomContentHeight = this.mCustomContentHeight;
            wearableExtender.mGravity = this.mGravity;
            wearableExtender.mHintScreenTimeout = this.mHintScreenTimeout;
            wearableExtender.mDismissalId = this.mDismissalId;
            wearableExtender.mBridgeTag = this.mBridgeTag;
            return wearableExtender;
        }

        public androidx.core.app.NotificationCompat.WearableExtender addAction(androidx.core.app.NotificationCompat.Action action) {
            this.mActions.add(action);
            return this;
        }

        public androidx.core.app.NotificationCompat.WearableExtender addActions(java.util.List<androidx.core.app.NotificationCompat.Action> list) {
            this.mActions.addAll(list);
            return this;
        }

        public androidx.core.app.NotificationCompat.WearableExtender clearActions() {
            this.mActions.clear();
            return this;
        }

        public java.util.List<androidx.core.app.NotificationCompat.Action> getActions() {
            return this.mActions;
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender setDisplayIntent(android.app.PendingIntent pendingIntent) {
            this.mDisplayIntent = pendingIntent;
            return this;
        }

        @java.lang.Deprecated
        public android.app.PendingIntent getDisplayIntent() {
            return this.mDisplayIntent;
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender addPage(android.app.Notification notification) {
            this.mPages.add(notification);
            return this;
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender addPages(java.util.List<android.app.Notification> list) {
            this.mPages.addAll(list);
            return this;
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender clearPages() {
            this.mPages.clear();
            return this;
        }

        @java.lang.Deprecated
        public java.util.List<android.app.Notification> getPages() {
            return this.mPages;
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender setBackground(android.graphics.Bitmap bitmap) {
            this.mBackground = bitmap;
            return this;
        }

        @java.lang.Deprecated
        public android.graphics.Bitmap getBackground() {
            return this.mBackground;
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender setContentIcon(int i) {
            this.mContentIcon = i;
            return this;
        }

        @java.lang.Deprecated
        public int getContentIcon() {
            return this.mContentIcon;
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender setContentIconGravity(int i) {
            this.mContentIconGravity = i;
            return this;
        }

        @java.lang.Deprecated
        public int getContentIconGravity() {
            return this.mContentIconGravity;
        }

        public androidx.core.app.NotificationCompat.WearableExtender setContentAction(int i) {
            this.mContentActionIndex = i;
            return this;
        }

        public int getContentAction() {
            return this.mContentActionIndex;
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender setGravity(int i) {
            this.mGravity = i;
            return this;
        }

        @java.lang.Deprecated
        public int getGravity() {
            return this.mGravity;
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender setCustomSizePreset(int i) {
            this.mCustomSizePreset = i;
            return this;
        }

        @java.lang.Deprecated
        public int getCustomSizePreset() {
            return this.mCustomSizePreset;
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender setCustomContentHeight(int i) {
            this.mCustomContentHeight = i;
            return this;
        }

        @java.lang.Deprecated
        public int getCustomContentHeight() {
            return this.mCustomContentHeight;
        }

        public androidx.core.app.NotificationCompat.WearableExtender setStartScrollBottom(boolean z) {
            setFlag(8, z);
            return this;
        }

        public boolean getStartScrollBottom() {
            return (this.mFlags & 8) != 0;
        }

        public androidx.core.app.NotificationCompat.WearableExtender setContentIntentAvailableOffline(boolean z) {
            setFlag(1, z);
            return this;
        }

        public boolean getContentIntentAvailableOffline() {
            return (this.mFlags & 1) != 0;
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender setHintHideIcon(boolean z) {
            setFlag(2, z);
            return this;
        }

        @java.lang.Deprecated
        public boolean getHintHideIcon() {
            return (this.mFlags & 2) != 0;
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender setHintShowBackgroundOnly(boolean z) {
            setFlag(4, z);
            return this;
        }

        @java.lang.Deprecated
        public boolean getHintShowBackgroundOnly() {
            return (this.mFlags & 4) != 0;
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender setHintAvoidBackgroundClipping(boolean z) {
            setFlag(16, z);
            return this;
        }

        @java.lang.Deprecated
        public boolean getHintAvoidBackgroundClipping() {
            return (this.mFlags & 16) != 0;
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender setHintScreenTimeout(int i) {
            this.mHintScreenTimeout = i;
            return this;
        }

        @java.lang.Deprecated
        public int getHintScreenTimeout() {
            return this.mHintScreenTimeout;
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender setHintAmbientBigPicture(boolean z) {
            setFlag(32, z);
            return this;
        }

        @java.lang.Deprecated
        public boolean getHintAmbientBigPicture() {
            return (this.mFlags & 32) != 0;
        }

        public androidx.core.app.NotificationCompat.WearableExtender setHintContentIntentLaunchesActivity(boolean z) {
            setFlag(64, z);
            return this;
        }

        public boolean getHintContentIntentLaunchesActivity() {
            return (this.mFlags & 64) != 0;
        }

        public androidx.core.app.NotificationCompat.WearableExtender setDismissalId(java.lang.String str) {
            this.mDismissalId = str;
            return this;
        }

        public java.lang.String getDismissalId() {
            return this.mDismissalId;
        }

        public androidx.core.app.NotificationCompat.WearableExtender setBridgeTag(java.lang.String str) {
            this.mBridgeTag = str;
            return this;
        }

        public java.lang.String getBridgeTag() {
            return this.mBridgeTag;
        }

        private void setFlag(int i, boolean z) {
            if (z) {
                this.mFlags = i | this.mFlags;
            } else {
                this.mFlags = (~i) & this.mFlags;
            }
        }
    }

    public static final class CarExtender implements androidx.core.app.NotificationCompat.Extender {
        static final java.lang.String EXTRA_CAR_EXTENDER = "android.car.EXTENSIONS";
        private static final java.lang.String EXTRA_COLOR = "app_color";
        private static final java.lang.String EXTRA_CONVERSATION = "car_conversation";
        static final java.lang.String EXTRA_INVISIBLE_ACTIONS = "invisible_actions";
        private static final java.lang.String EXTRA_LARGE_ICON = "large_icon";
        private static final java.lang.String KEY_AUTHOR = "author";
        private static final java.lang.String KEY_MESSAGES = "messages";
        private static final java.lang.String KEY_ON_READ = "on_read";
        private static final java.lang.String KEY_ON_REPLY = "on_reply";
        private static final java.lang.String KEY_PARTICIPANTS = "participants";
        private static final java.lang.String KEY_REMOTE_INPUT = "remote_input";
        private static final java.lang.String KEY_TEXT = "text";
        private static final java.lang.String KEY_TIMESTAMP = "timestamp";
        private int mColor;
        private android.graphics.Bitmap mLargeIcon;
        private androidx.core.app.NotificationCompat.CarExtender.UnreadConversation mUnreadConversation;

        public CarExtender() {
            this.mColor = 0;
        }

        public CarExtender(android.app.Notification notification) {
            this.mColor = 0;
            android.os.Bundle bundle = androidx.core.app.NotificationCompat.getExtras(notification) == null ? null : androidx.core.app.NotificationCompat.getExtras(notification).getBundle(EXTRA_CAR_EXTENDER);
            if (bundle != null) {
                this.mLargeIcon = (android.graphics.Bitmap) bundle.getParcelable(EXTRA_LARGE_ICON);
                this.mColor = bundle.getInt(EXTRA_COLOR, 0);
                this.mUnreadConversation = getUnreadConversationFromBundle(bundle.getBundle(EXTRA_CONVERSATION));
            }
        }

        private static androidx.core.app.NotificationCompat.CarExtender.UnreadConversation getUnreadConversationFromBundle(android.os.Bundle bundle) {
            java.lang.String[] strArr;
            boolean z;
            androidx.core.app.RemoteInput remoteInput = null;
            if (bundle == null) {
                return null;
            }
            android.os.Parcelable[] parcelableArray = bundle.getParcelableArray(KEY_MESSAGES);
            if (parcelableArray != null) {
                int length = parcelableArray.length;
                java.lang.String[] strArr2 = new java.lang.String[length];
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = true;
                        break;
                    }
                    android.os.Parcelable parcelable = parcelableArray[i];
                    if (parcelable instanceof android.os.Bundle) {
                        java.lang.String string = ((android.os.Bundle) parcelable).getString("text");
                        strArr2[i] = string;
                        if (string != null) {
                            i++;
                        }
                    }
                    z = false;
                    break;
                }
                if (!z) {
                    return null;
                }
                strArr = strArr2;
            } else {
                strArr = null;
            }
            android.app.PendingIntent pendingIntent = (android.app.PendingIntent) bundle.getParcelable(KEY_ON_READ);
            android.app.PendingIntent pendingIntent2 = (android.app.PendingIntent) bundle.getParcelable(KEY_ON_REPLY);
            android.app.RemoteInput remoteInput2 = (android.app.RemoteInput) bundle.getParcelable(KEY_REMOTE_INPUT);
            java.lang.String[] stringArray = bundle.getStringArray(KEY_PARTICIPANTS);
            if (stringArray == null || stringArray.length != 1) {
                return null;
            }
            if (remoteInput2 != null) {
                remoteInput = new androidx.core.app.RemoteInput(remoteInput2.getResultKey(), remoteInput2.getLabel(), remoteInput2.getChoices(), remoteInput2.getAllowFreeFormInput(), android.os.Build.VERSION.SDK_INT >= 29 ? remoteInput2.getEditChoicesBeforeSending() : 0, remoteInput2.getExtras(), null);
            }
            return new androidx.core.app.NotificationCompat.CarExtender.UnreadConversation(strArr, remoteInput, pendingIntent2, pendingIntent, stringArray, bundle.getLong("timestamp"));
        }

        private static android.os.Bundle getBundleForUnreadConversation(androidx.core.app.NotificationCompat.CarExtender.UnreadConversation unreadConversation) {
            android.os.Bundle bundle = new android.os.Bundle();
            java.lang.String str = (unreadConversation.getParticipants() == null || unreadConversation.getParticipants().length <= 1) ? null : unreadConversation.getParticipants()[0];
            int length = unreadConversation.getMessages().length;
            android.os.Parcelable[] parcelableArr = new android.os.Parcelable[length];
            for (int i = 0; i < length; i++) {
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putString("text", unreadConversation.getMessages()[i]);
                bundle2.putString(KEY_AUTHOR, str);
                parcelableArr[i] = bundle2;
            }
            bundle.putParcelableArray(KEY_MESSAGES, parcelableArr);
            androidx.core.app.RemoteInput remoteInput = unreadConversation.getRemoteInput();
            if (remoteInput != null) {
                bundle.putParcelable(KEY_REMOTE_INPUT, new android.app.RemoteInput.Builder(remoteInput.getResultKey()).setLabel(remoteInput.getLabel()).setChoices(remoteInput.getChoices()).setAllowFreeFormInput(remoteInput.getAllowFreeFormInput()).addExtras(remoteInput.getExtras()).build());
            }
            bundle.putParcelable(KEY_ON_REPLY, unreadConversation.getReplyPendingIntent());
            bundle.putParcelable(KEY_ON_READ, unreadConversation.getReadPendingIntent());
            bundle.putStringArray(KEY_PARTICIPANTS, unreadConversation.getParticipants());
            bundle.putLong("timestamp", unreadConversation.getLatestTimestamp());
            return bundle;
        }

        @Override // androidx.core.app.NotificationCompat.Extender
        public androidx.core.app.NotificationCompat.Builder extend(androidx.core.app.NotificationCompat.Builder builder) {
            android.os.Bundle bundle = new android.os.Bundle();
            android.graphics.Bitmap bitmap = this.mLargeIcon;
            if (bitmap != null) {
                bundle.putParcelable(EXTRA_LARGE_ICON, bitmap);
            }
            int i = this.mColor;
            if (i != 0) {
                bundle.putInt(EXTRA_COLOR, i);
            }
            androidx.core.app.NotificationCompat.CarExtender.UnreadConversation unreadConversation = this.mUnreadConversation;
            if (unreadConversation != null) {
                bundle.putBundle(EXTRA_CONVERSATION, getBundleForUnreadConversation(unreadConversation));
            }
            builder.getExtras().putBundle(EXTRA_CAR_EXTENDER, bundle);
            return builder;
        }

        public androidx.core.app.NotificationCompat.CarExtender setColor(int i) {
            this.mColor = i;
            return this;
        }

        public int getColor() {
            return this.mColor;
        }

        public androidx.core.app.NotificationCompat.CarExtender setLargeIcon(android.graphics.Bitmap bitmap) {
            this.mLargeIcon = bitmap;
            return this;
        }

        public android.graphics.Bitmap getLargeIcon() {
            return this.mLargeIcon;
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.CarExtender setUnreadConversation(androidx.core.app.NotificationCompat.CarExtender.UnreadConversation unreadConversation) {
            this.mUnreadConversation = unreadConversation;
            return this;
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.CarExtender.UnreadConversation getUnreadConversation() {
            return this.mUnreadConversation;
        }

        @java.lang.Deprecated
        public static class UnreadConversation {
            private final long mLatestTimestamp;
            private final java.lang.String[] mMessages;
            private final java.lang.String[] mParticipants;
            private final android.app.PendingIntent mReadPendingIntent;
            private final androidx.core.app.RemoteInput mRemoteInput;
            private final android.app.PendingIntent mReplyPendingIntent;

            UnreadConversation(java.lang.String[] strArr, androidx.core.app.RemoteInput remoteInput, android.app.PendingIntent pendingIntent, android.app.PendingIntent pendingIntent2, java.lang.String[] strArr2, long j) {
                this.mMessages = strArr;
                this.mRemoteInput = remoteInput;
                this.mReadPendingIntent = pendingIntent2;
                this.mReplyPendingIntent = pendingIntent;
                this.mParticipants = strArr2;
                this.mLatestTimestamp = j;
            }

            public java.lang.String[] getMessages() {
                return this.mMessages;
            }

            public androidx.core.app.RemoteInput getRemoteInput() {
                return this.mRemoteInput;
            }

            public android.app.PendingIntent getReplyPendingIntent() {
                return this.mReplyPendingIntent;
            }

            public android.app.PendingIntent getReadPendingIntent() {
                return this.mReadPendingIntent;
            }

            public java.lang.String[] getParticipants() {
                return this.mParticipants;
            }

            public java.lang.String getParticipant() {
                java.lang.String[] strArr = this.mParticipants;
                if (strArr.length > 0) {
                    return strArr[0];
                }
                return null;
            }

            public long getLatestTimestamp() {
                return this.mLatestTimestamp;
            }

            public static class Builder {
                private long mLatestTimestamp;
                private final java.util.List<java.lang.String> mMessages = new java.util.ArrayList();
                private final java.lang.String mParticipant;
                private android.app.PendingIntent mReadPendingIntent;
                private androidx.core.app.RemoteInput mRemoteInput;
                private android.app.PendingIntent mReplyPendingIntent;

                public Builder(java.lang.String str) {
                    this.mParticipant = str;
                }

                public androidx.core.app.NotificationCompat.CarExtender.UnreadConversation.Builder addMessage(java.lang.String str) {
                    if (str != null) {
                        this.mMessages.add(str);
                    }
                    return this;
                }

                public androidx.core.app.NotificationCompat.CarExtender.UnreadConversation.Builder setReplyAction(android.app.PendingIntent pendingIntent, androidx.core.app.RemoteInput remoteInput) {
                    this.mRemoteInput = remoteInput;
                    this.mReplyPendingIntent = pendingIntent;
                    return this;
                }

                public androidx.core.app.NotificationCompat.CarExtender.UnreadConversation.Builder setReadPendingIntent(android.app.PendingIntent pendingIntent) {
                    this.mReadPendingIntent = pendingIntent;
                    return this;
                }

                public androidx.core.app.NotificationCompat.CarExtender.UnreadConversation.Builder setLatestTimestamp(long j) {
                    this.mLatestTimestamp = j;
                    return this;
                }

                public androidx.core.app.NotificationCompat.CarExtender.UnreadConversation build() {
                    java.util.List<java.lang.String> list = this.mMessages;
                    return new androidx.core.app.NotificationCompat.CarExtender.UnreadConversation((java.lang.String[]) list.toArray(new java.lang.String[list.size()]), this.mRemoteInput, this.mReplyPendingIntent, this.mReadPendingIntent, new java.lang.String[]{this.mParticipant}, this.mLatestTimestamp);
                }
            }
        }
    }

    public static final class BubbleMetadata {
        private static final int FLAG_AUTO_EXPAND_BUBBLE = 1;
        private static final int FLAG_SUPPRESS_NOTIFICATION = 2;
        private android.app.PendingIntent mDeleteIntent;
        private int mDesiredHeight;
        private int mDesiredHeightResId;
        private int mFlags;
        private androidx.core.graphics.drawable.IconCompat mIcon;
        private android.app.PendingIntent mPendingIntent;
        private java.lang.String mShortcutId;

        private BubbleMetadata(android.app.PendingIntent pendingIntent, android.app.PendingIntent pendingIntent2, androidx.core.graphics.drawable.IconCompat iconCompat, int i, int i2, int i3, java.lang.String str) {
            this.mPendingIntent = pendingIntent;
            this.mIcon = iconCompat;
            this.mDesiredHeight = i;
            this.mDesiredHeightResId = i2;
            this.mDeleteIntent = pendingIntent2;
            this.mFlags = i3;
            this.mShortcutId = str;
        }

        public android.app.PendingIntent getIntent() {
            return this.mPendingIntent;
        }

        public java.lang.String getShortcutId() {
            return this.mShortcutId;
        }

        public android.app.PendingIntent getDeleteIntent() {
            return this.mDeleteIntent;
        }

        public androidx.core.graphics.drawable.IconCompat getIcon() {
            return this.mIcon;
        }

        public int getDesiredHeight() {
            return this.mDesiredHeight;
        }

        public int getDesiredHeightResId() {
            return this.mDesiredHeightResId;
        }

        public boolean getAutoExpandBubble() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isNotificationSuppressed() {
            return (this.mFlags & 2) != 0;
        }

        public void setFlags(int i) {
            this.mFlags = i;
        }

        public static android.app.Notification.BubbleMetadata toPlatform(androidx.core.app.NotificationCompat.BubbleMetadata bubbleMetadata) {
            if (bubbleMetadata == null) {
                return null;
            }
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                return androidx.core.app.NotificationCompat.BubbleMetadata.Api30Impl.toPlatform(bubbleMetadata);
            }
            if (android.os.Build.VERSION.SDK_INT == 29) {
                return androidx.core.app.NotificationCompat.BubbleMetadata.Api29Impl.toPlatform(bubbleMetadata);
            }
            return null;
        }

        public static androidx.core.app.NotificationCompat.BubbleMetadata fromPlatform(android.app.Notification.BubbleMetadata bubbleMetadata) {
            if (bubbleMetadata == null) {
                return null;
            }
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                return androidx.core.app.NotificationCompat.BubbleMetadata.Api30Impl.fromPlatform(bubbleMetadata);
            }
            if (android.os.Build.VERSION.SDK_INT == 29) {
                return androidx.core.app.NotificationCompat.BubbleMetadata.Api29Impl.fromPlatform(bubbleMetadata);
            }
            return null;
        }

        public static final class Builder {
            private android.app.PendingIntent mDeleteIntent;
            private int mDesiredHeight;
            private int mDesiredHeightResId;
            private int mFlags;
            private androidx.core.graphics.drawable.IconCompat mIcon;
            private android.app.PendingIntent mPendingIntent;
            private java.lang.String mShortcutId;

            @java.lang.Deprecated
            public Builder() {
            }

            public Builder(java.lang.String str) {
                if (android.text.TextUtils.isEmpty(str)) {
                    throw new java.lang.NullPointerException("Bubble requires a non-null shortcut id");
                }
                this.mShortcutId = str;
            }

            public Builder(android.app.PendingIntent pendingIntent, androidx.core.graphics.drawable.IconCompat iconCompat) {
                if (pendingIntent == null) {
                    throw new java.lang.NullPointerException("Bubble requires non-null pending intent");
                }
                if (iconCompat == null) {
                    throw new java.lang.NullPointerException("Bubbles require non-null icon");
                }
                this.mPendingIntent = pendingIntent;
                this.mIcon = iconCompat;
            }

            public androidx.core.app.NotificationCompat.BubbleMetadata.Builder setIntent(android.app.PendingIntent pendingIntent) {
                if (this.mShortcutId != null) {
                    throw new java.lang.IllegalStateException("Created as a shortcut bubble, cannot set a PendingIntent. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
                }
                if (pendingIntent == null) {
                    throw new java.lang.NullPointerException("Bubble requires non-null pending intent");
                }
                this.mPendingIntent = pendingIntent;
                return this;
            }

            public androidx.core.app.NotificationCompat.BubbleMetadata.Builder setIcon(androidx.core.graphics.drawable.IconCompat iconCompat) {
                if (this.mShortcutId != null) {
                    throw new java.lang.IllegalStateException("Created as a shortcut bubble, cannot set an Icon. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
                }
                if (iconCompat == null) {
                    throw new java.lang.NullPointerException("Bubbles require non-null icon");
                }
                this.mIcon = iconCompat;
                return this;
            }

            public androidx.core.app.NotificationCompat.BubbleMetadata.Builder setDesiredHeight(int i) {
                this.mDesiredHeight = java.lang.Math.max(i, 0);
                this.mDesiredHeightResId = 0;
                return this;
            }

            public androidx.core.app.NotificationCompat.BubbleMetadata.Builder setDesiredHeightResId(int i) {
                this.mDesiredHeightResId = i;
                this.mDesiredHeight = 0;
                return this;
            }

            public androidx.core.app.NotificationCompat.BubbleMetadata.Builder setAutoExpandBubble(boolean z) {
                setFlag(1, z);
                return this;
            }

            public androidx.core.app.NotificationCompat.BubbleMetadata.Builder setSuppressNotification(boolean z) {
                setFlag(2, z);
                return this;
            }

            public androidx.core.app.NotificationCompat.BubbleMetadata.Builder setDeleteIntent(android.app.PendingIntent pendingIntent) {
                this.mDeleteIntent = pendingIntent;
                return this;
            }

            public androidx.core.app.NotificationCompat.BubbleMetadata build() {
                java.lang.String str = this.mShortcutId;
                if (str == null && this.mPendingIntent == null) {
                    throw new java.lang.NullPointerException("Must supply pending intent or shortcut to bubble");
                }
                if (str == null && this.mIcon == null) {
                    throw new java.lang.NullPointerException("Must supply an icon or shortcut for the bubble");
                }
                androidx.core.app.NotificationCompat.BubbleMetadata bubbleMetadata = new androidx.core.app.NotificationCompat.BubbleMetadata(this.mPendingIntent, this.mDeleteIntent, this.mIcon, this.mDesiredHeight, this.mDesiredHeightResId, this.mFlags, this.mShortcutId);
                bubbleMetadata.setFlags(this.mFlags);
                return bubbleMetadata;
            }

            private androidx.core.app.NotificationCompat.BubbleMetadata.Builder setFlag(int i, boolean z) {
                if (z) {
                    this.mFlags = i | this.mFlags;
                } else {
                    this.mFlags = (~i) & this.mFlags;
                }
                return this;
            }
        }

        private static class Api29Impl {
            private Api29Impl() {
            }

            static android.app.Notification.BubbleMetadata toPlatform(androidx.core.app.NotificationCompat.BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null || bubbleMetadata.getIntent() == null) {
                    return null;
                }
                android.app.Notification.BubbleMetadata.Builder suppressNotification = new android.app.Notification.BubbleMetadata.Builder().setIcon(bubbleMetadata.getIcon().toIcon()).setIntent(bubbleMetadata.getIntent()).setDeleteIntent(bubbleMetadata.getDeleteIntent()).setAutoExpandBubble(bubbleMetadata.getAutoExpandBubble()).setSuppressNotification(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    suppressNotification.setDesiredHeight(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    suppressNotification.setDesiredHeightResId(bubbleMetadata.getDesiredHeightResId());
                }
                return suppressNotification.build();
            }

            static androidx.core.app.NotificationCompat.BubbleMetadata fromPlatform(android.app.Notification.BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null || bubbleMetadata.getIntent() == null) {
                    return null;
                }
                androidx.core.app.NotificationCompat.BubbleMetadata.Builder suppressNotification = new androidx.core.app.NotificationCompat.BubbleMetadata.Builder(bubbleMetadata.getIntent(), androidx.core.graphics.drawable.IconCompat.createFromIcon(bubbleMetadata.getIcon())).setAutoExpandBubble(bubbleMetadata.getAutoExpandBubble()).setDeleteIntent(bubbleMetadata.getDeleteIntent()).setSuppressNotification(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    suppressNotification.setDesiredHeight(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    suppressNotification.setDesiredHeightResId(bubbleMetadata.getDesiredHeightResId());
                }
                return suppressNotification.build();
            }
        }

        private static class Api30Impl {
            private Api30Impl() {
            }

            static android.app.Notification.BubbleMetadata toPlatform(androidx.core.app.NotificationCompat.BubbleMetadata bubbleMetadata) {
                android.app.Notification.BubbleMetadata.Builder builder;
                if (bubbleMetadata == null) {
                    return null;
                }
                if (bubbleMetadata.getShortcutId() != null) {
                    builder = new android.app.Notification.BubbleMetadata.Builder(bubbleMetadata.getShortcutId());
                } else {
                    builder = new android.app.Notification.BubbleMetadata.Builder(bubbleMetadata.getIntent(), bubbleMetadata.getIcon().toIcon());
                }
                builder.setDeleteIntent(bubbleMetadata.getDeleteIntent()).setAutoExpandBubble(bubbleMetadata.getAutoExpandBubble()).setSuppressNotification(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    builder.setDesiredHeight(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    builder.setDesiredHeightResId(bubbleMetadata.getDesiredHeightResId());
                }
                return builder.build();
            }

            static androidx.core.app.NotificationCompat.BubbleMetadata fromPlatform(android.app.Notification.BubbleMetadata bubbleMetadata) {
                androidx.core.app.NotificationCompat.BubbleMetadata.Builder builder;
                if (bubbleMetadata == null) {
                    return null;
                }
                if (bubbleMetadata.getShortcutId() != null) {
                    builder = new androidx.core.app.NotificationCompat.BubbleMetadata.Builder(bubbleMetadata.getShortcutId());
                } else {
                    builder = new androidx.core.app.NotificationCompat.BubbleMetadata.Builder(bubbleMetadata.getIntent(), androidx.core.graphics.drawable.IconCompat.createFromIcon(bubbleMetadata.getIcon()));
                }
                builder.setAutoExpandBubble(bubbleMetadata.getAutoExpandBubble()).setDeleteIntent(bubbleMetadata.getDeleteIntent()).setSuppressNotification(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    builder.setDesiredHeight(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    builder.setDesiredHeightResId(bubbleMetadata.getDesiredHeightResId());
                }
                return builder.build();
            }
        }
    }

    static android.app.Notification[] getNotificationArrayFromBundle(android.os.Bundle bundle, java.lang.String str) {
        android.os.Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof android.app.Notification[]) || parcelableArray == null) {
            return (android.app.Notification[]) parcelableArray;
        }
        android.app.Notification[] notificationArr = new android.app.Notification[parcelableArray.length];
        for (int i = 0; i < parcelableArray.length; i++) {
            notificationArr[i] = (android.app.Notification) parcelableArray[i];
        }
        bundle.putParcelableArray(str, notificationArr);
        return notificationArr;
    }

    public static android.os.Bundle getExtras(android.app.Notification notification) {
        return notification.extras;
    }

    public static int getActionCount(android.app.Notification notification) {
        if (notification.actions != null) {
            return notification.actions.length;
        }
        return 0;
    }

    public static androidx.core.app.NotificationCompat.Action getAction(android.app.Notification notification, int i) {
        return getActionCompatFromAction(notification.actions[i]);
    }

    public static androidx.core.app.NotificationCompat.BubbleMetadata getBubbleMetadata(android.app.Notification notification) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return androidx.core.app.NotificationCompat.BubbleMetadata.fromPlatform(notification.getBubbleMetadata());
        }
        return null;
    }

    static androidx.core.app.NotificationCompat.Action getActionCompatFromAction(android.app.Notification.Action action) {
        androidx.core.app.RemoteInput[] remoteInputArr;
        int semanticAction;
        android.app.RemoteInput[] remoteInputs = action.getRemoteInputs();
        if (remoteInputs == null) {
            remoteInputArr = null;
        } else {
            androidx.core.app.RemoteInput[] remoteInputArr2 = new androidx.core.app.RemoteInput[remoteInputs.length];
            for (int i = 0; i < remoteInputs.length; i++) {
                android.app.RemoteInput remoteInput = remoteInputs[i];
                remoteInputArr2[i] = new androidx.core.app.RemoteInput(remoteInput.getResultKey(), remoteInput.getLabel(), remoteInput.getChoices(), remoteInput.getAllowFreeFormInput(), android.os.Build.VERSION.SDK_INT >= 29 ? remoteInput.getEditChoicesBeforeSending() : 0, remoteInput.getExtras(), null);
            }
            remoteInputArr = remoteInputArr2;
        }
        boolean z = action.getExtras().getBoolean("android.support.allowGeneratedReplies") || action.getAllowGeneratedReplies();
        boolean z2 = action.getExtras().getBoolean("android.support.action.showsUserInterface", true);
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            semanticAction = action.getSemanticAction();
        } else {
            semanticAction = action.getExtras().getInt("android.support.action.semanticAction", 0);
        }
        int i2 = semanticAction;
        boolean zIsContextual = android.os.Build.VERSION.SDK_INT >= 29 ? action.isContextual() : false;
        boolean zIsAuthenticationRequired = android.os.Build.VERSION.SDK_INT >= 31 ? action.isAuthenticationRequired() : false;
        if (action.getIcon() == null && action.icon != 0) {
            return new androidx.core.app.NotificationCompat.Action(action.icon, action.title, action.actionIntent, action.getExtras(), remoteInputArr, (androidx.core.app.RemoteInput[]) null, z, i2, z2, zIsContextual, zIsAuthenticationRequired);
        }
        return new androidx.core.app.NotificationCompat.Action(action.getIcon() != null ? androidx.core.graphics.drawable.IconCompat.createFromIconOrNullIfZeroResId(action.getIcon()) : null, action.title, action.actionIntent, action.getExtras(), remoteInputArr, (androidx.core.app.RemoteInput[]) null, z, i2, z2, zIsContextual, zIsAuthenticationRequired);
    }

    public static java.util.List<androidx.core.app.NotificationCompat.Action> getInvisibleActions(android.app.Notification notification) {
        android.os.Bundle bundle;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.os.Bundle bundle2 = notification.extras.getBundle("android.car.EXTENSIONS");
        if (bundle2 != null && (bundle = bundle2.getBundle("invisible_actions")) != null) {
            for (int i = 0; i < bundle.size(); i++) {
                arrayList.add(androidx.core.app.NotificationCompatJellybean.getActionFromBundle(bundle.getBundle(java.lang.Integer.toString(i))));
            }
        }
        return arrayList;
    }

    public static java.util.List<androidx.core.app.Person> getPeople(android.app.Notification notification) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            java.util.ArrayList parcelableArrayList = notification.extras.getParcelableArrayList(EXTRA_PEOPLE_LIST);
            if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                java.util.Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    arrayList.add(androidx.core.app.Person.fromAndroidPerson((android.app.Person) it.next()));
                }
            }
        } else {
            java.lang.String[] stringArray = notification.extras.getStringArray(EXTRA_PEOPLE);
            if (stringArray != null && stringArray.length != 0) {
                for (java.lang.String str : stringArray) {
                    arrayList.add(new androidx.core.app.Person.Builder().setUri(str).build());
                }
            }
        }
        return arrayList;
    }

    public static java.lang.CharSequence getContentTitle(android.app.Notification notification) {
        return notification.extras.getCharSequence(EXTRA_TITLE);
    }

    public static java.lang.CharSequence getContentText(android.app.Notification notification) {
        return notification.extras.getCharSequence(EXTRA_TEXT);
    }

    public static java.lang.CharSequence getContentInfo(android.app.Notification notification) {
        return notification.extras.getCharSequence(EXTRA_INFO_TEXT);
    }

    public static java.lang.CharSequence getSubText(android.app.Notification notification) {
        return notification.extras.getCharSequence(EXTRA_SUB_TEXT);
    }

    public static java.lang.String getCategory(android.app.Notification notification) {
        return notification.category;
    }

    public static boolean getLocalOnly(android.app.Notification notification) {
        return (notification.flags & 256) != 0;
    }

    public static java.lang.String getGroup(android.app.Notification notification) {
        return notification.getGroup();
    }

    public static boolean getShowWhen(android.app.Notification notification) {
        return notification.extras.getBoolean(EXTRA_SHOW_WHEN);
    }

    public static boolean getUsesChronometer(android.app.Notification notification) {
        return notification.extras.getBoolean(EXTRA_SHOW_CHRONOMETER);
    }

    public static boolean getOnlyAlertOnce(android.app.Notification notification) {
        return (notification.flags & 8) != 0;
    }

    public static boolean getAutoCancel(android.app.Notification notification) {
        return (notification.flags & 16) != 0;
    }

    public static boolean getOngoing(android.app.Notification notification) {
        return (notification.flags & 2) != 0;
    }

    public static int getColor(android.app.Notification notification) {
        return notification.color;
    }

    public static int getVisibility(android.app.Notification notification) {
        return notification.visibility;
    }

    public static android.app.Notification getPublicVersion(android.app.Notification notification) {
        return notification.publicVersion;
    }

    static boolean getHighPriority(android.app.Notification notification) {
        return (notification.flags & 128) != 0;
    }

    public static boolean isGroupSummary(android.app.Notification notification) {
        return (notification.flags & 512) != 0;
    }

    public static java.lang.String getSortKey(android.app.Notification notification) {
        return notification.getSortKey();
    }

    public static java.lang.String getChannelId(android.app.Notification notification) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return notification.getChannelId();
        }
        return null;
    }

    public static long getTimeoutAfter(android.app.Notification notification) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return notification.getTimeoutAfter();
        }
        return 0L;
    }

    public static int getBadgeIconType(android.app.Notification notification) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return notification.getBadgeIconType();
        }
        return 0;
    }

    public static java.lang.String getShortcutId(android.app.Notification notification) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return notification.getShortcutId();
        }
        return null;
    }

    public static java.lang.CharSequence getSettingsText(android.app.Notification notification) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return notification.getSettingsText();
        }
        return null;
    }

    public static androidx.core.content.LocusIdCompat getLocusId(android.app.Notification notification) {
        android.content.LocusId locusId;
        if (android.os.Build.VERSION.SDK_INT < 29 || (locusId = notification.getLocusId()) == null) {
            return null;
        }
        return androidx.core.content.LocusIdCompat.toLocusIdCompat(locusId);
    }

    public static int getGroupAlertBehavior(android.app.Notification notification) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return notification.getGroupAlertBehavior();
        }
        return 0;
    }

    public static boolean getAllowSystemGeneratedContextualActions(android.app.Notification notification) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return notification.getAllowSystemGeneratedContextualActions();
        }
        return false;
    }

    @java.lang.Deprecated
    public NotificationCompat() {
    }
}
