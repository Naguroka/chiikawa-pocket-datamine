package com.google.firebase.messaging;

/* JADX INFO: loaded from: classes5.dex */
final class TopicOperation {
    private static final java.lang.String OLD_TOPIC_PREFIX = "/topics/";
    static final java.lang.String OPERATION_PAIR_DIVIDER = "!";
    private static final java.lang.String TOPIC_NAME_PATTERN = "[a-zA-Z0-9-_.~%]{1,900}";
    private static final java.util.regex.Pattern TOPIC_NAME_REGEXP = java.util.regex.Pattern.compile(TOPIC_NAME_PATTERN);
    private final java.lang.String operation;
    private final java.lang.String serializedString;
    private final java.lang.String topic;

    private TopicOperation(java.lang.String str, java.lang.String str2) {
        this.topic = normalizeTopicOrThrow(str2, str);
        this.operation = str;
        this.serializedString = str + OPERATION_PAIR_DIVIDER + str2;
    }

    private static java.lang.String normalizeTopicOrThrow(java.lang.String str, java.lang.String str2) {
        if (str != null && str.startsWith(OLD_TOPIC_PREFIX)) {
            android.util.Log.w(com.google.firebase.messaging.Constants.TAG, java.lang.String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str == null || !TOPIC_NAME_REGEXP.matcher(str).matches()) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Invalid topic name: %s does not match the allowed format %s.", str, TOPIC_NAME_PATTERN));
        }
        return str;
    }

    public static com.google.firebase.messaging.TopicOperation subscribe(java.lang.String str) {
        return new com.google.firebase.messaging.TopicOperation(androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH, str);
    }

    public static com.google.firebase.messaging.TopicOperation unsubscribe(java.lang.String str) {
        return new com.google.firebase.messaging.TopicOperation("U", str);
    }

    static com.google.firebase.messaging.TopicOperation from(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        java.lang.String[] strArrSplit = str.split(OPERATION_PAIR_DIVIDER, -1);
        if (strArrSplit.length != 2) {
            return null;
        }
        return new com.google.firebase.messaging.TopicOperation(strArrSplit[0], strArrSplit[1]);
    }

    public java.lang.String getTopic() {
        return this.topic;
    }

    public java.lang.String getOperation() {
        return this.operation;
    }

    public java.lang.String serialize() {
        return this.serializedString;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.firebase.messaging.TopicOperation)) {
            return false;
        }
        com.google.firebase.messaging.TopicOperation topicOperation = (com.google.firebase.messaging.TopicOperation) obj;
        return this.topic.equals(topicOperation.topic) && this.operation.equals(topicOperation.operation);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.operation, this.topic);
    }
}
