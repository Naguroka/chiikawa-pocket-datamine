package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
class GeneratedMessageInfoFactory implements androidx.datastore.preferences.protobuf.MessageInfoFactory {
    private static final androidx.datastore.preferences.protobuf.GeneratedMessageInfoFactory instance = new androidx.datastore.preferences.protobuf.GeneratedMessageInfoFactory();

    private GeneratedMessageInfoFactory() {
    }

    public static androidx.datastore.preferences.protobuf.GeneratedMessageInfoFactory getInstance() {
        return instance;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
    public boolean isSupported(java.lang.Class<?> messageType) {
        return androidx.datastore.preferences.protobuf.GeneratedMessageLite.class.isAssignableFrom(messageType);
    }

    @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
    public androidx.datastore.preferences.protobuf.MessageInfo messageInfoFor(java.lang.Class<?> messageType) {
        if (!androidx.datastore.preferences.protobuf.GeneratedMessageLite.class.isAssignableFrom(messageType)) {
            throw new java.lang.IllegalArgumentException("Unsupported message type: " + messageType.getName());
        }
        try {
            return (androidx.datastore.preferences.protobuf.MessageInfo) androidx.datastore.preferences.protobuf.GeneratedMessageLite.getDefaultInstance(messageType.asSubclass(androidx.datastore.preferences.protobuf.GeneratedMessageLite.class)).buildMessageInfo();
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException("Unable to get message info for " + messageType.getName(), e);
        }
    }
}
