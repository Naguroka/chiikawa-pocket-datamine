package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public class NotificationChannelGroupCompat {
    private boolean mBlocked;
    private java.util.List<androidx.core.app.NotificationChannelCompat> mChannels;
    java.lang.String mDescription;
    final java.lang.String mId;
    java.lang.CharSequence mName;

    public static class Builder {
        final androidx.core.app.NotificationChannelGroupCompat mGroup;

        public Builder(java.lang.String str) {
            this.mGroup = new androidx.core.app.NotificationChannelGroupCompat(str);
        }

        public androidx.core.app.NotificationChannelGroupCompat.Builder setName(java.lang.CharSequence charSequence) {
            this.mGroup.mName = charSequence;
            return this;
        }

        public androidx.core.app.NotificationChannelGroupCompat.Builder setDescription(java.lang.String str) {
            this.mGroup.mDescription = str;
            return this;
        }

        public androidx.core.app.NotificationChannelGroupCompat build() {
            return this.mGroup;
        }
    }

    NotificationChannelGroupCompat(java.lang.String str) {
        this.mChannels = java.util.Collections.emptyList();
        this.mId = (java.lang.String) androidx.core.util.Preconditions.checkNotNull(str);
    }

    NotificationChannelGroupCompat(android.app.NotificationChannelGroup notificationChannelGroup) {
        this(notificationChannelGroup, java.util.Collections.emptyList());
    }

    NotificationChannelGroupCompat(android.app.NotificationChannelGroup notificationChannelGroup, java.util.List<android.app.NotificationChannel> list) {
        this(notificationChannelGroup.getId());
        this.mName = notificationChannelGroup.getName();
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.mDescription = notificationChannelGroup.getDescription();
        }
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.mBlocked = notificationChannelGroup.isBlocked();
            this.mChannels = getChannelsCompat(notificationChannelGroup.getChannels());
        } else {
            this.mChannels = getChannelsCompat(list);
        }
    }

    private java.util.List<androidx.core.app.NotificationChannelCompat> getChannelsCompat(java.util.List<android.app.NotificationChannel> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.app.NotificationChannel notificationChannel : list) {
            if (this.mId.equals(notificationChannel.getGroup())) {
                arrayList.add(new androidx.core.app.NotificationChannelCompat(notificationChannel));
            }
        }
        return arrayList;
    }

    android.app.NotificationChannelGroup getNotificationChannelGroup() {
        if (android.os.Build.VERSION.SDK_INT < 26) {
            return null;
        }
        android.app.NotificationChannelGroup notificationChannelGroup = new android.app.NotificationChannelGroup(this.mId, this.mName);
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            notificationChannelGroup.setDescription(this.mDescription);
        }
        return notificationChannelGroup;
    }

    public androidx.core.app.NotificationChannelGroupCompat.Builder toBuilder() {
        return new androidx.core.app.NotificationChannelGroupCompat.Builder(this.mId).setName(this.mName).setDescription(this.mDescription);
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

    public boolean isBlocked() {
        return this.mBlocked;
    }

    public java.util.List<androidx.core.app.NotificationChannelCompat> getChannels() {
        return this.mChannels;
    }
}
