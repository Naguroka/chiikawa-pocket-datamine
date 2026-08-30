package com.google.firebase.messaging;

/* JADX INFO: loaded from: classes5.dex */
public final class RemoteMessage extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.firebase.messaging.RemoteMessage> CREATOR = new com.google.firebase.messaging.RemoteMessageCreator();
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_NORMAL = 2;
    public static final int PRIORITY_UNKNOWN = 0;
    android.os.Bundle bundle;
    private java.util.Map<java.lang.String, java.lang.String> data;
    private com.google.firebase.messaging.RemoteMessage.Notification notification;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface MessagePriority {
    }

    public RemoteMessage(android.os.Bundle bundle) {
        this.bundle = bundle;
    }

    void populateSendMessageIntent(android.content.Intent intent) {
        intent.putExtras(this.bundle);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.firebase.messaging.RemoteMessageCreator.writeToParcel(this, parcel, i);
    }

    public java.lang.String getSenderId() {
        return this.bundle.getString(com.google.firebase.messaging.Constants.MessagePayloadKeys.SENDER_ID);
    }

    public java.lang.String getFrom() {
        return this.bundle.getString("from");
    }

    @java.lang.Deprecated
    public java.lang.String getTo() {
        return this.bundle.getString(com.google.firebase.messaging.Constants.MessagePayloadKeys.TO);
    }

    public java.util.Map<java.lang.String, java.lang.String> getData() {
        if (this.data == null) {
            this.data = com.google.firebase.messaging.Constants.MessagePayloadKeys.extractDeveloperDefinedPayload(this.bundle);
        }
        return this.data;
    }

    public byte[] getRawData() {
        return this.bundle.getByteArray(com.google.firebase.messaging.Constants.MessagePayloadKeys.RAW_DATA);
    }

    public java.lang.String getCollapseKey() {
        return this.bundle.getString(com.google.firebase.messaging.Constants.MessagePayloadKeys.COLLAPSE_KEY);
    }

    public java.lang.String getMessageId() {
        java.lang.String string = this.bundle.getString(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID);
        return string == null ? this.bundle.getString(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER) : string;
    }

    public java.lang.String getMessageType() {
        return this.bundle.getString(com.google.firebase.messaging.Constants.MessagePayloadKeys.MESSAGE_TYPE);
    }

    public long getSentTime() {
        java.lang.Object obj = this.bundle.get(com.google.firebase.messaging.Constants.MessagePayloadKeys.SENT_TIME);
        if (obj instanceof java.lang.Long) {
            return ((java.lang.Long) obj).longValue();
        }
        if (!(obj instanceof java.lang.String)) {
            return 0L;
        }
        try {
            return java.lang.Long.parseLong((java.lang.String) obj);
        } catch (java.lang.NumberFormatException unused) {
            android.util.Log.w(com.google.firebase.messaging.Constants.TAG, "Invalid sent time: " + obj);
            return 0L;
        }
    }

    public int getTtl() {
        java.lang.Object obj = this.bundle.get(com.google.firebase.messaging.Constants.MessagePayloadKeys.TTL);
        if (obj instanceof java.lang.Integer) {
            return ((java.lang.Integer) obj).intValue();
        }
        if (!(obj instanceof java.lang.String)) {
            return 0;
        }
        try {
            return java.lang.Integer.parseInt((java.lang.String) obj);
        } catch (java.lang.NumberFormatException unused) {
            android.util.Log.w(com.google.firebase.messaging.Constants.TAG, "Invalid TTL: " + obj);
            return 0;
        }
    }

    public int getOriginalPriority() {
        java.lang.String string = this.bundle.getString(com.google.firebase.messaging.Constants.MessagePayloadKeys.ORIGINAL_PRIORITY);
        if (string == null) {
            string = this.bundle.getString(com.google.firebase.messaging.Constants.MessagePayloadKeys.PRIORITY_V19);
        }
        return getMessagePriority(string);
    }

    public int getPriority() {
        java.lang.String string = this.bundle.getString(com.google.firebase.messaging.Constants.MessagePayloadKeys.DELIVERED_PRIORITY);
        if (string == null) {
            if ("1".equals(this.bundle.getString(com.google.firebase.messaging.Constants.MessagePayloadKeys.PRIORITY_REDUCED_V19))) {
                return 2;
            }
            string = this.bundle.getString(com.google.firebase.messaging.Constants.MessagePayloadKeys.PRIORITY_V19);
        }
        return getMessagePriority(string);
    }

    private int getMessagePriority(java.lang.String str) {
        if (com.adjust.sdk.Constants.HIGH.equals(str)) {
            return 1;
        }
        return com.adjust.sdk.Constants.NORMAL.equals(str) ? 2 : 0;
    }

    public com.google.firebase.messaging.RemoteMessage.Notification getNotification() {
        if (this.notification == null && com.google.firebase.messaging.NotificationParams.isNotification(this.bundle)) {
            this.notification = new com.google.firebase.messaging.RemoteMessage.Notification(new com.google.firebase.messaging.NotificationParams(this.bundle));
        }
        return this.notification;
    }

    public android.content.Intent toIntent() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtras(this.bundle);
        return intent;
    }

    public static class Builder {
        private final android.os.Bundle bundle;
        private final java.util.Map<java.lang.String, java.lang.String> data;

        public Builder(java.lang.String str) {
            android.os.Bundle bundle = new android.os.Bundle();
            this.bundle = bundle;
            this.data = new androidx.collection.ArrayMap();
            if (android.text.TextUtils.isEmpty(str)) {
                throw new java.lang.IllegalArgumentException("Invalid to: " + str);
            }
            bundle.putString(com.google.firebase.messaging.Constants.MessagePayloadKeys.TO, str);
        }

        public com.google.firebase.messaging.RemoteMessage build() {
            android.os.Bundle bundle = new android.os.Bundle();
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : this.data.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
            bundle.putAll(this.bundle);
            this.bundle.remove("from");
            return new com.google.firebase.messaging.RemoteMessage(bundle);
        }

        public com.google.firebase.messaging.RemoteMessage.Builder addData(java.lang.String str, java.lang.String str2) {
            this.data.put(str, str2);
            return this;
        }

        public com.google.firebase.messaging.RemoteMessage.Builder setData(java.util.Map<java.lang.String, java.lang.String> map) {
            this.data.clear();
            this.data.putAll(map);
            return this;
        }

        public java.util.Map<java.lang.String, java.lang.String> getData() {
            return this.data;
        }

        public com.google.firebase.messaging.RemoteMessage.Builder clearData() {
            this.data.clear();
            return this;
        }

        public java.lang.String getMessageId() {
            return this.bundle.getString(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID, "");
        }

        public java.lang.String getMessageType() {
            return this.bundle.getString(com.google.firebase.messaging.Constants.MessagePayloadKeys.MESSAGE_TYPE);
        }

        public java.lang.String getCollapseKey() {
            return this.bundle.getString(com.google.firebase.messaging.Constants.MessagePayloadKeys.COLLAPSE_KEY);
        }

        public int getTtl() {
            return java.lang.Integer.parseInt(this.bundle.getString(com.google.firebase.messaging.Constants.MessagePayloadKeys.TTL, "0"));
        }

        public com.google.firebase.messaging.RemoteMessage.Builder setRawData(byte[] bArr) {
            this.bundle.putByteArray(com.google.firebase.messaging.Constants.MessagePayloadKeys.RAW_DATA, bArr);
            return this;
        }

        public com.google.firebase.messaging.RemoteMessage.Builder setMessageId(java.lang.String str) {
            this.bundle.putString(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID, str);
            return this;
        }

        public com.google.firebase.messaging.RemoteMessage.Builder setMessageType(java.lang.String str) {
            this.bundle.putString(com.google.firebase.messaging.Constants.MessagePayloadKeys.MESSAGE_TYPE, str);
            return this;
        }

        public com.google.firebase.messaging.RemoteMessage.Builder setTtl(int i) {
            this.bundle.putString(com.google.firebase.messaging.Constants.MessagePayloadKeys.TTL, java.lang.String.valueOf(i));
            return this;
        }

        public com.google.firebase.messaging.RemoteMessage.Builder setCollapseKey(java.lang.String str) {
            this.bundle.putString(com.google.firebase.messaging.Constants.MessagePayloadKeys.COLLAPSE_KEY, str);
            return this;
        }
    }

    public static class Notification {
        private final java.lang.String body;
        private final java.lang.String[] bodyLocArgs;
        private final java.lang.String bodyLocKey;
        private final java.lang.String channelId;
        private final java.lang.String clickAction;
        private final java.lang.String color;
        private final boolean defaultLightSettings;
        private final boolean defaultSound;
        private final boolean defaultVibrateTimings;
        private final java.lang.Long eventTime;
        private final java.lang.String icon;
        private final java.lang.String imageUrl;
        private final int[] lightSettings;
        private final android.net.Uri link;
        private final boolean localOnly;
        private final java.lang.Integer notificationCount;
        private final java.lang.Integer notificationPriority;
        private final java.lang.String sound;
        private final boolean sticky;
        private final java.lang.String tag;
        private final java.lang.String ticker;
        private final java.lang.String title;
        private final java.lang.String[] titleLocArgs;
        private final java.lang.String titleLocKey;
        private final long[] vibrateTimings;
        private final java.lang.Integer visibility;

        private Notification(com.google.firebase.messaging.NotificationParams notificationParams) {
            this.title = notificationParams.getString(com.google.firebase.messaging.Constants.MessageNotificationKeys.TITLE);
            this.titleLocKey = notificationParams.getLocalizationResourceForKey(com.google.firebase.messaging.Constants.MessageNotificationKeys.TITLE);
            this.titleLocArgs = getLocalizationArgs(notificationParams, com.google.firebase.messaging.Constants.MessageNotificationKeys.TITLE);
            this.body = notificationParams.getString(com.google.firebase.messaging.Constants.MessageNotificationKeys.BODY);
            this.bodyLocKey = notificationParams.getLocalizationResourceForKey(com.google.firebase.messaging.Constants.MessageNotificationKeys.BODY);
            this.bodyLocArgs = getLocalizationArgs(notificationParams, com.google.firebase.messaging.Constants.MessageNotificationKeys.BODY);
            this.icon = notificationParams.getString(com.google.firebase.messaging.Constants.MessageNotificationKeys.ICON);
            this.sound = notificationParams.getSoundResourceName();
            this.tag = notificationParams.getString(com.google.firebase.messaging.Constants.MessageNotificationKeys.TAG);
            this.color = notificationParams.getString(com.google.firebase.messaging.Constants.MessageNotificationKeys.COLOR);
            this.clickAction = notificationParams.getString(com.google.firebase.messaging.Constants.MessageNotificationKeys.CLICK_ACTION);
            this.channelId = notificationParams.getString(com.google.firebase.messaging.Constants.MessageNotificationKeys.CHANNEL);
            this.link = notificationParams.getLink();
            this.imageUrl = notificationParams.getString(com.google.firebase.messaging.Constants.MessageNotificationKeys.IMAGE_URL);
            this.ticker = notificationParams.getString(com.google.firebase.messaging.Constants.MessageNotificationKeys.TICKER);
            this.notificationPriority = notificationParams.getInteger(com.google.firebase.messaging.Constants.MessageNotificationKeys.NOTIFICATION_PRIORITY);
            this.visibility = notificationParams.getInteger(com.google.firebase.messaging.Constants.MessageNotificationKeys.VISIBILITY);
            this.notificationCount = notificationParams.getInteger(com.google.firebase.messaging.Constants.MessageNotificationKeys.NOTIFICATION_COUNT);
            this.sticky = notificationParams.getBoolean(com.google.firebase.messaging.Constants.MessageNotificationKeys.STICKY);
            this.localOnly = notificationParams.getBoolean(com.google.firebase.messaging.Constants.MessageNotificationKeys.LOCAL_ONLY);
            this.defaultSound = notificationParams.getBoolean(com.google.firebase.messaging.Constants.MessageNotificationKeys.DEFAULT_SOUND);
            this.defaultVibrateTimings = notificationParams.getBoolean(com.google.firebase.messaging.Constants.MessageNotificationKeys.DEFAULT_VIBRATE_TIMINGS);
            this.defaultLightSettings = notificationParams.getBoolean(com.google.firebase.messaging.Constants.MessageNotificationKeys.DEFAULT_LIGHT_SETTINGS);
            this.eventTime = notificationParams.getLong(com.google.firebase.messaging.Constants.MessageNotificationKeys.EVENT_TIME);
            this.lightSettings = notificationParams.getLightSettings();
            this.vibrateTimings = notificationParams.getVibrateTimings();
        }

        private static java.lang.String[] getLocalizationArgs(com.google.firebase.messaging.NotificationParams notificationParams, java.lang.String str) {
            java.lang.Object[] localizationArgsForKey = notificationParams.getLocalizationArgsForKey(str);
            if (localizationArgsForKey == null) {
                return null;
            }
            java.lang.String[] strArr = new java.lang.String[localizationArgsForKey.length];
            for (int i = 0; i < localizationArgsForKey.length; i++) {
                strArr[i] = java.lang.String.valueOf(localizationArgsForKey[i]);
            }
            return strArr;
        }

        public java.lang.String getTitle() {
            return this.title;
        }

        public java.lang.String getTitleLocalizationKey() {
            return this.titleLocKey;
        }

        public java.lang.String[] getTitleLocalizationArgs() {
            return this.titleLocArgs;
        }

        public java.lang.String getBody() {
            return this.body;
        }

        public java.lang.String getBodyLocalizationKey() {
            return this.bodyLocKey;
        }

        public java.lang.String[] getBodyLocalizationArgs() {
            return this.bodyLocArgs;
        }

        public java.lang.String getIcon() {
            return this.icon;
        }

        public android.net.Uri getImageUrl() {
            java.lang.String str = this.imageUrl;
            if (str != null) {
                return android.net.Uri.parse(str);
            }
            return null;
        }

        public java.lang.String getSound() {
            return this.sound;
        }

        public java.lang.String getTag() {
            return this.tag;
        }

        public java.lang.String getColor() {
            return this.color;
        }

        public java.lang.String getClickAction() {
            return this.clickAction;
        }

        public java.lang.String getChannelId() {
            return this.channelId;
        }

        public android.net.Uri getLink() {
            return this.link;
        }

        public java.lang.String getTicker() {
            return this.ticker;
        }

        public boolean getSticky() {
            return this.sticky;
        }

        public boolean getLocalOnly() {
            return this.localOnly;
        }

        public boolean getDefaultSound() {
            return this.defaultSound;
        }

        public boolean getDefaultVibrateSettings() {
            return this.defaultVibrateTimings;
        }

        public boolean getDefaultLightSettings() {
            return this.defaultLightSettings;
        }

        public java.lang.Integer getNotificationPriority() {
            return this.notificationPriority;
        }

        public java.lang.Integer getVisibility() {
            return this.visibility;
        }

        public java.lang.Integer getNotificationCount() {
            return this.notificationCount;
        }

        public java.lang.Long getEventTime() {
            return this.eventTime;
        }

        public int[] getLightSettings() {
            return this.lightSettings;
        }

        public long[] getVibrateTimings() {
            return this.vibrateTimings;
        }
    }
}
