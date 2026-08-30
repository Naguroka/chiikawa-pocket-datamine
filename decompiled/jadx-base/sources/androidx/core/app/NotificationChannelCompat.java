package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public class NotificationChannelCompat {
    public static final java.lang.String DEFAULT_CHANNEL_ID = "miscellaneous";
    private static final int DEFAULT_LIGHT_COLOR = 0;
    private static final boolean DEFAULT_SHOW_BADGE = true;
    android.media.AudioAttributes mAudioAttributes;
    private boolean mBypassDnd;
    private boolean mCanBubble;
    java.lang.String mConversationId;
    java.lang.String mDescription;
    java.lang.String mGroupId;
    final java.lang.String mId;
    int mImportance;
    private boolean mImportantConversation;
    int mLightColor;
    boolean mLights;
    private int mLockscreenVisibility;
    java.lang.CharSequence mName;
    java.lang.String mParentId;
    boolean mShowBadge;
    android.net.Uri mSound;
    boolean mVibrationEnabled;
    long[] mVibrationPattern;

    public static class Builder {
        private final androidx.core.app.NotificationChannelCompat mChannel;

        public Builder(java.lang.String str, int i) {
            this.mChannel = new androidx.core.app.NotificationChannelCompat(str, i);
        }

        public androidx.core.app.NotificationChannelCompat.Builder setName(java.lang.CharSequence charSequence) {
            this.mChannel.mName = charSequence;
            return this;
        }

        public androidx.core.app.NotificationChannelCompat.Builder setImportance(int i) {
            this.mChannel.mImportance = i;
            return this;
        }

        public androidx.core.app.NotificationChannelCompat.Builder setDescription(java.lang.String str) {
            this.mChannel.mDescription = str;
            return this;
        }

        public androidx.core.app.NotificationChannelCompat.Builder setGroup(java.lang.String str) {
            this.mChannel.mGroupId = str;
            return this;
        }

        public androidx.core.app.NotificationChannelCompat.Builder setShowBadge(boolean z) {
            this.mChannel.mShowBadge = z;
            return this;
        }

        public androidx.core.app.NotificationChannelCompat.Builder setSound(android.net.Uri uri, android.media.AudioAttributes audioAttributes) {
            this.mChannel.mSound = uri;
            this.mChannel.mAudioAttributes = audioAttributes;
            return this;
        }

        public androidx.core.app.NotificationChannelCompat.Builder setLightsEnabled(boolean z) {
            this.mChannel.mLights = z;
            return this;
        }

        public androidx.core.app.NotificationChannelCompat.Builder setLightColor(int i) {
            this.mChannel.mLightColor = i;
            return this;
        }

        public androidx.core.app.NotificationChannelCompat.Builder setVibrationEnabled(boolean z) {
            this.mChannel.mVibrationEnabled = z;
            return this;
        }

        public androidx.core.app.NotificationChannelCompat.Builder setVibrationPattern(long[] jArr) {
            this.mChannel.mVibrationEnabled = jArr != null && jArr.length > 0;
            this.mChannel.mVibrationPattern = jArr;
            return this;
        }

        public androidx.core.app.NotificationChannelCompat.Builder setConversationId(java.lang.String str, java.lang.String str2) {
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                this.mChannel.mParentId = str;
                this.mChannel.mConversationId = str2;
            }
            return this;
        }

        public androidx.core.app.NotificationChannelCompat build() {
            return this.mChannel;
        }
    }

    NotificationChannelCompat(java.lang.String str, int i) {
        this.mShowBadge = true;
        this.mSound = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI;
        this.mLightColor = 0;
        this.mId = (java.lang.String) androidx.core.util.Preconditions.checkNotNull(str);
        this.mImportance = i;
        this.mAudioAttributes = android.app.Notification.AUDIO_ATTRIBUTES_DEFAULT;
    }

    NotificationChannelCompat(android.app.NotificationChannel notificationChannel) {
        this(notificationChannel.getId(), notificationChannel.getImportance());
        this.mName = notificationChannel.getName();
        this.mDescription = notificationChannel.getDescription();
        this.mGroupId = notificationChannel.getGroup();
        this.mShowBadge = notificationChannel.canShowBadge();
        this.mSound = notificationChannel.getSound();
        this.mAudioAttributes = notificationChannel.getAudioAttributes();
        this.mLights = notificationChannel.shouldShowLights();
        this.mLightColor = notificationChannel.getLightColor();
        this.mVibrationEnabled = notificationChannel.shouldVibrate();
        this.mVibrationPattern = notificationChannel.getVibrationPattern();
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            this.mParentId = notificationChannel.getParentChannelId();
            this.mConversationId = notificationChannel.getConversationId();
        }
        this.mBypassDnd = notificationChannel.canBypassDnd();
        this.mLockscreenVisibility = notificationChannel.getLockscreenVisibility();
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            this.mCanBubble = notificationChannel.canBubble();
        }
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            this.mImportantConversation = notificationChannel.isImportantConversation();
        }
    }

    android.app.NotificationChannel getNotificationChannel() {
        java.lang.String str;
        java.lang.String str2;
        if (android.os.Build.VERSION.SDK_INT < 26) {
            return null;
        }
        android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel(this.mId, this.mName, this.mImportance);
        notificationChannel.setDescription(this.mDescription);
        notificationChannel.setGroup(this.mGroupId);
        notificationChannel.setShowBadge(this.mShowBadge);
        notificationChannel.setSound(this.mSound, this.mAudioAttributes);
        notificationChannel.enableLights(this.mLights);
        notificationChannel.setLightColor(this.mLightColor);
        notificationChannel.setVibrationPattern(this.mVibrationPattern);
        notificationChannel.enableVibration(this.mVibrationEnabled);
        if (android.os.Build.VERSION.SDK_INT >= 30 && (str = this.mParentId) != null && (str2 = this.mConversationId) != null) {
            notificationChannel.setConversationId(str, str2);
        }
        return notificationChannel;
    }

    public androidx.core.app.NotificationChannelCompat.Builder toBuilder() {
        return new androidx.core.app.NotificationChannelCompat.Builder(this.mId, this.mImportance).setName(this.mName).setDescription(this.mDescription).setGroup(this.mGroupId).setShowBadge(this.mShowBadge).setSound(this.mSound, this.mAudioAttributes).setLightsEnabled(this.mLights).setLightColor(this.mLightColor).setVibrationEnabled(this.mVibrationEnabled).setVibrationPattern(this.mVibrationPattern).setConversationId(this.mParentId, this.mConversationId);
    }

    public java.lang.String getId() {
        return this.mId;
    }

    public java.lang.CharSequence getName() {
        return this.mName;
    }

    public java.lang.String getDescription() {
        return this.mDescription;
    }

    public int getImportance() {
        return this.mImportance;
    }

    public android.net.Uri getSound() {
        return this.mSound;
    }

    public android.media.AudioAttributes getAudioAttributes() {
        return this.mAudioAttributes;
    }

    public boolean shouldShowLights() {
        return this.mLights;
    }

    public int getLightColor() {
        return this.mLightColor;
    }

    public boolean shouldVibrate() {
        return this.mVibrationEnabled;
    }

    public long[] getVibrationPattern() {
        return this.mVibrationPattern;
    }

    public boolean canShowBadge() {
        return this.mShowBadge;
    }

    public java.lang.String getGroup() {
        return this.mGroupId;
    }

    public java.lang.String getParentChannelId() {
        return this.mParentId;
    }

    public java.lang.String getConversationId() {
        return this.mConversationId;
    }

    public boolean canBypassDnd() {
        return this.mBypassDnd;
    }

    public int getLockscreenVisibility() {
        return this.mLockscreenVisibility;
    }

    public boolean canBubble() {
        return this.mCanBubble;
    }

    public boolean isImportantConversation() {
        return this.mImportantConversation;
    }
}
