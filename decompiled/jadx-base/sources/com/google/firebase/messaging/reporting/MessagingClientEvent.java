package com.google.firebase.messaging.reporting;

/* JADX INFO: loaded from: classes5.dex */
public final class MessagingClientEvent {
    private static final com.google.firebase.messaging.reporting.MessagingClientEvent DEFAULT_INSTANCE = new com.google.firebase.messaging.reporting.MessagingClientEvent.Builder().build();
    private final java.lang.String analytics_label_;
    private final long bulk_id_;
    private final long campaign_id_;
    private final java.lang.String collapse_key_;
    private final java.lang.String composer_label_;
    private final com.google.firebase.messaging.reporting.MessagingClientEvent.Event event_;
    private final java.lang.String instance_id_;
    private final java.lang.String message_id_;
    private final com.google.firebase.messaging.reporting.MessagingClientEvent.MessageType message_type_;
    private final java.lang.String package_name_;
    private final int priority_;
    private final long project_number_;
    private final com.google.firebase.messaging.reporting.MessagingClientEvent.SDKPlatform sdk_platform_;
    private final java.lang.String topic_;
    private final int ttl_;

    MessagingClientEvent(long j, java.lang.String str, java.lang.String str2, com.google.firebase.messaging.reporting.MessagingClientEvent.MessageType messageType, com.google.firebase.messaging.reporting.MessagingClientEvent.SDKPlatform sDKPlatform, java.lang.String str3, java.lang.String str4, int i, int i2, java.lang.String str5, long j2, com.google.firebase.messaging.reporting.MessagingClientEvent.Event event, java.lang.String str6, long j3, java.lang.String str7) {
        this.project_number_ = j;
        this.message_id_ = str;
        this.instance_id_ = str2;
        this.message_type_ = messageType;
        this.sdk_platform_ = sDKPlatform;
        this.package_name_ = str3;
        this.collapse_key_ = str4;
        this.priority_ = i;
        this.ttl_ = i2;
        this.topic_ = str5;
        this.bulk_id_ = j2;
        this.event_ = event;
        this.analytics_label_ = str6;
        this.campaign_id_ = j3;
        this.composer_label_ = str7;
    }

    public static com.google.firebase.messaging.reporting.MessagingClientEvent.Builder newBuilder() {
        return new com.google.firebase.messaging.reporting.MessagingClientEvent.Builder();
    }

    public long getProjectNumber() {
        return this.project_number_;
    }

    public java.lang.String getMessageId() {
        return this.message_id_;
    }

    public java.lang.String getInstanceId() {
        return this.instance_id_;
    }

    public com.google.firebase.messaging.reporting.MessagingClientEvent.MessageType getMessageType() {
        return this.message_type_;
    }

    public com.google.firebase.messaging.reporting.MessagingClientEvent.SDKPlatform getSdkPlatform() {
        return this.sdk_platform_;
    }

    public java.lang.String getPackageName() {
        return this.package_name_;
    }

    public java.lang.String getCollapseKey() {
        return this.collapse_key_;
    }

    public int getPriority() {
        return this.priority_;
    }

    public int getTtl() {
        return this.ttl_;
    }

    public java.lang.String getTopic() {
        return this.topic_;
    }

    public long getBulkId() {
        return this.bulk_id_;
    }

    public com.google.firebase.messaging.reporting.MessagingClientEvent.Event getEvent() {
        return this.event_;
    }

    public java.lang.String getAnalyticsLabel() {
        return this.analytics_label_;
    }

    public long getCampaignId() {
        return this.campaign_id_;
    }

    public java.lang.String getComposerLabel() {
        return this.composer_label_;
    }

    public static com.google.firebase.messaging.reporting.MessagingClientEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder {
        private long project_number_ = 0;
        private java.lang.String message_id_ = "";
        private java.lang.String instance_id_ = "";
        private com.google.firebase.messaging.reporting.MessagingClientEvent.MessageType message_type_ = com.google.firebase.messaging.reporting.MessagingClientEvent.MessageType.UNKNOWN;
        private com.google.firebase.messaging.reporting.MessagingClientEvent.SDKPlatform sdk_platform_ = com.google.firebase.messaging.reporting.MessagingClientEvent.SDKPlatform.UNKNOWN_OS;
        private java.lang.String package_name_ = "";
        private java.lang.String collapse_key_ = "";
        private int priority_ = 0;
        private int ttl_ = 0;
        private java.lang.String topic_ = "";
        private long bulk_id_ = 0;
        private com.google.firebase.messaging.reporting.MessagingClientEvent.Event event_ = com.google.firebase.messaging.reporting.MessagingClientEvent.Event.UNKNOWN_EVENT;
        private java.lang.String analytics_label_ = "";
        private long campaign_id_ = 0;
        private java.lang.String composer_label_ = "";

        Builder() {
        }

        public com.google.firebase.messaging.reporting.MessagingClientEvent build() {
            return new com.google.firebase.messaging.reporting.MessagingClientEvent(this.project_number_, this.message_id_, this.instance_id_, this.message_type_, this.sdk_platform_, this.package_name_, this.collapse_key_, this.priority_, this.ttl_, this.topic_, this.bulk_id_, this.event_, this.analytics_label_, this.campaign_id_, this.composer_label_);
        }

        public com.google.firebase.messaging.reporting.MessagingClientEvent.Builder setProjectNumber(long j) {
            this.project_number_ = j;
            return this;
        }

        public com.google.firebase.messaging.reporting.MessagingClientEvent.Builder setMessageId(java.lang.String str) {
            this.message_id_ = str;
            return this;
        }

        public com.google.firebase.messaging.reporting.MessagingClientEvent.Builder setInstanceId(java.lang.String str) {
            this.instance_id_ = str;
            return this;
        }

        public com.google.firebase.messaging.reporting.MessagingClientEvent.Builder setMessageType(com.google.firebase.messaging.reporting.MessagingClientEvent.MessageType messageType) {
            this.message_type_ = messageType;
            return this;
        }

        public com.google.firebase.messaging.reporting.MessagingClientEvent.Builder setSdkPlatform(com.google.firebase.messaging.reporting.MessagingClientEvent.SDKPlatform sDKPlatform) {
            this.sdk_platform_ = sDKPlatform;
            return this;
        }

        public com.google.firebase.messaging.reporting.MessagingClientEvent.Builder setPackageName(java.lang.String str) {
            this.package_name_ = str;
            return this;
        }

        public com.google.firebase.messaging.reporting.MessagingClientEvent.Builder setCollapseKey(java.lang.String str) {
            this.collapse_key_ = str;
            return this;
        }

        public com.google.firebase.messaging.reporting.MessagingClientEvent.Builder setPriority(int i) {
            this.priority_ = i;
            return this;
        }

        public com.google.firebase.messaging.reporting.MessagingClientEvent.Builder setTtl(int i) {
            this.ttl_ = i;
            return this;
        }

        public com.google.firebase.messaging.reporting.MessagingClientEvent.Builder setTopic(java.lang.String str) {
            this.topic_ = str;
            return this;
        }

        public com.google.firebase.messaging.reporting.MessagingClientEvent.Builder setBulkId(long j) {
            this.bulk_id_ = j;
            return this;
        }

        public com.google.firebase.messaging.reporting.MessagingClientEvent.Builder setEvent(com.google.firebase.messaging.reporting.MessagingClientEvent.Event event) {
            this.event_ = event;
            return this;
        }

        public com.google.firebase.messaging.reporting.MessagingClientEvent.Builder setAnalyticsLabel(java.lang.String str) {
            this.analytics_label_ = str;
            return this;
        }

        public com.google.firebase.messaging.reporting.MessagingClientEvent.Builder setCampaignId(long j) {
            this.campaign_id_ = j;
            return this;
        }

        public com.google.firebase.messaging.reporting.MessagingClientEvent.Builder setComposerLabel(java.lang.String str) {
            this.composer_label_ = str;
            return this;
        }
    }

    public enum MessageType implements com.google.firebase.encoders.proto.ProtoEnum {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);

        private final int number_;

        MessageType(int i) {
            this.number_ = i;
        }

        @Override // com.google.firebase.encoders.proto.ProtoEnum
        public int getNumber() {
            return this.number_;
        }
    }

    public enum SDKPlatform implements com.google.firebase.encoders.proto.ProtoEnum {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);

        private final int number_;

        SDKPlatform(int i) {
            this.number_ = i;
        }

        @Override // com.google.firebase.encoders.proto.ProtoEnum
        public int getNumber() {
            return this.number_;
        }
    }

    public enum Event implements com.google.firebase.encoders.proto.ProtoEnum {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);

        private final int number_;

        Event(int i) {
            this.number_ = i;
        }

        @Override // com.google.firebase.encoders.proto.ProtoEnum
        public int getNumber() {
            return this.number_;
        }
    }
}
