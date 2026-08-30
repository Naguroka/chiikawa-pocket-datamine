package com.google.firebase.messaging;

/* JADX INFO: loaded from: classes5.dex */
public final class Constants {
    public static final java.lang.String FCM_WAKE_LOCK = "wake:com.google.firebase.messaging";
    public static final java.lang.String IPC_BUNDLE_KEY_SEND_ERROR = "error";
    public static final java.lang.String TAG = "FirebaseMessaging";
    public static final long WAKE_LOCK_ACQUIRE_TIMEOUT_MILLIS = java.util.concurrent.TimeUnit.MINUTES.toMillis(3);

    public static final class MessageTypes {
        public static final java.lang.String DELETED = "deleted_messages";
        public static final java.lang.String MESSAGE = "gcm";
        public static final java.lang.String SEND_ERROR = "send_error";
        public static final java.lang.String SEND_EVENT = "send_event";

        private MessageTypes() {
        }
    }

    public static final class MessagePayloadKeys {
        public static final java.lang.String COLLAPSE_KEY = "collapse_key";
        public static final java.lang.String DELIVERED_PRIORITY = "google.delivered_priority";
        public static final java.lang.String FROM = "from";
        public static final java.lang.String MESSAGE_TYPE = "message_type";
        public static final java.lang.String MSGID = "google.message_id";
        public static final java.lang.String MSGID_SERVER = "message_id";
        public static final java.lang.String ORIGINAL_PRIORITY = "google.original_priority";
        public static final java.lang.String PRIORITY_REDUCED_V19 = "google.priority_reduced";
        public static final java.lang.String PRIORITY_V19 = "google.priority";
        public static final java.lang.String PRODUCT_ID = "google.product_id";
        public static final java.lang.String RAW_DATA = "rawData";
        public static final java.lang.String RESERVED_CLIENT_LIB_PREFIX = "google.c.";
        public static final java.lang.String RESERVED_PREFIX = "google.";
        public static final java.lang.String SENDER_ID = "google.c.sender.id";
        public static final java.lang.String SENT_TIME = "google.sent_time";
        public static final java.lang.String TO = "google.to";
        public static final java.lang.String TTL = "google.ttl";

        public static androidx.collection.ArrayMap<java.lang.String, java.lang.String> extractDeveloperDefinedPayload(android.os.Bundle bundle) {
            androidx.collection.ArrayMap<java.lang.String, java.lang.String> arrayMap = new androidx.collection.ArrayMap<>();
            for (java.lang.String str : bundle.keySet()) {
                java.lang.Object obj = bundle.get(str);
                if (obj instanceof java.lang.String) {
                    java.lang.String str2 = (java.lang.String) obj;
                    if (!str.startsWith(RESERVED_PREFIX) && !str.startsWith(com.google.firebase.messaging.Constants.MessageNotificationKeys.RESERVED_PREFIX) && !str.equals("from") && !str.equals(MESSAGE_TYPE) && !str.equals(COLLAPSE_KEY)) {
                        arrayMap.put(str, str2);
                    }
                }
            }
            return arrayMap;
        }

        private MessagePayloadKeys() {
        }
    }

    public static final class MessageNotificationKeys {
        public static final java.lang.String ANALYTICS_DATA = "gcm.n.analytics_data";
        public static final java.lang.String BODY = "gcm.n.body";
        public static final java.lang.String CHANNEL = "gcm.n.android_channel_id";
        public static final java.lang.String CLICK_ACTION = "gcm.n.click_action";
        public static final java.lang.String COLOR = "gcm.n.color";
        public static final java.lang.String DEFAULT_LIGHT_SETTINGS = "gcm.n.default_light_settings";
        public static final java.lang.String DEFAULT_SOUND = "gcm.n.default_sound";
        public static final java.lang.String DEFAULT_VIBRATE_TIMINGS = "gcm.n.default_vibrate_timings";
        public static final java.lang.String DO_NOT_PROXY = "gcm.n.dnp";
        public static final java.lang.String ENABLE_NOTIFICATION = "gcm.n.e";
        public static final java.lang.String EVENT_TIME = "gcm.n.event_time";
        public static final java.lang.String ICON = "gcm.n.icon";
        public static final java.lang.String IMAGE_URL = "gcm.n.image";
        public static final java.lang.String LIGHT_SETTINGS = "gcm.n.light_settings";
        public static final java.lang.String LINK = "gcm.n.link";
        public static final java.lang.String LINK_ANDROID = "gcm.n.link_android";
        public static final java.lang.String LOCAL_ONLY = "gcm.n.local_only";
        public static final java.lang.String NOTIFICATION_COUNT = "gcm.n.notification_count";
        public static final java.lang.String NOTIFICATION_PREFIX = "gcm.n.";
        public static final java.lang.String NOTIFICATION_PREFIX_OLD = "gcm.notification.";
        public static final java.lang.String NOTIFICATION_PRIORITY = "gcm.n.notification_priority";
        public static final java.lang.String NO_UI = "gcm.n.noui";
        public static final java.lang.String RESERVED_PREFIX = "gcm.";
        public static final java.lang.String SOUND = "gcm.n.sound";
        public static final java.lang.String SOUND_2 = "gcm.n.sound2";
        public static final java.lang.String STICKY = "gcm.n.sticky";
        public static final java.lang.String TAG = "gcm.n.tag";
        public static final java.lang.String TEXT_ARGS_SUFFIX = "_loc_args";
        public static final java.lang.String TEXT_RESOURCE_SUFFIX = "_loc_key";
        public static final java.lang.String TICKER = "gcm.n.ticker";
        public static final java.lang.String TITLE = "gcm.n.title";
        public static final java.lang.String VIBRATE_TIMINGS = "gcm.n.vibrate_timings";
        public static final java.lang.String VISIBILITY = "gcm.n.visibility";

        private MessageNotificationKeys() {
        }
    }

    public static final class AnalyticsKeys {
        public static final java.lang.String ABT_EXPERIMENT = "google.c.a.abt";
        public static final java.lang.String COMPOSER_ID = "google.c.a.c_id";
        public static final java.lang.String COMPOSER_LABEL = "google.c.a.c_l";
        public static final java.lang.String ENABLED = "google.c.a.e";
        public static final java.lang.String MESSAGE_CHANNEL = "google.c.a.m_c";
        public static final java.lang.String MESSAGE_LABEL = "google.c.a.m_l";
        public static final java.lang.String MESSAGE_TIMESTAMP = "google.c.a.ts";
        public static final java.lang.String MESSAGE_USE_DEVICE_TIME = "google.c.a.udt";
        public static final java.lang.String PREFIX = "google.c.a.";
        public static final java.lang.String TRACK_CONVERSIONS = "google.c.a.tc";

        private AnalyticsKeys() {
        }
    }

    public static final class FirelogAnalytics {
        public static final java.lang.String FCM_LOG_SOURCE = "FCM_CLIENT_EVENT_LOGGING";

        private FirelogAnalytics() {
        }
    }

    public static final class ScionAnalytics {
        public static final java.lang.String EVENT_FIREBASE_CAMPAIGN = "_cmp";
        public static final java.lang.String EVENT_NOTIFICATION_DISMISS = "_nd";
        public static final java.lang.String EVENT_NOTIFICATION_FOREGROUND = "_nf";
        public static final java.lang.String EVENT_NOTIFICATION_OPEN = "_no";
        public static final java.lang.String EVENT_NOTIFICATION_RECEIVE = "_nr";
        public static final java.lang.String ORIGIN_FCM = "fcm";
        public static final java.lang.String PARAM_CAMPAIGN = "campaign";
        static final java.lang.String PARAM_COMPOSER_ID = "_nmid";
        public static final java.lang.String PARAM_LABEL = "label";
        public static final java.lang.String PARAM_MEDIUM = "medium";
        public static final java.lang.String PARAM_MESSAGE_CHANNEL = "message_channel";
        public static final java.lang.String PARAM_MESSAGE_DEVICE_TIME = "_ndt";
        public static final java.lang.String PARAM_MESSAGE_NAME = "_nmn";
        public static final java.lang.String PARAM_MESSAGE_TIME = "_nmt";
        public static final java.lang.String PARAM_MESSAGE_TYPE = "_nmc";
        public static final java.lang.String PARAM_SOURCE = "source";
        public static final java.lang.String PARAM_TOPIC = "_nt";
        public static final java.lang.String USER_PROPERTY_FIREBASE_LAST_NOTIFICATION = "_ln";

        public @interface MessageType {
            public static final java.lang.String DATA_MESSAGE = "data";
            public static final java.lang.String DISPLAY_NOTIFICATION = "display";
        }

        private ScionAnalytics() {
        }
    }

    private Constants() {
    }
}
