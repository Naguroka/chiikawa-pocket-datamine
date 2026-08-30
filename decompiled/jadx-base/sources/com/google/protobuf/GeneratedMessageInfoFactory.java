package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
class GeneratedMessageInfoFactory implements com.google.protobuf.MessageInfoFactory {
    private static final com.google.protobuf.GeneratedMessageInfoFactory instance = new com.google.protobuf.GeneratedMessageInfoFactory();

    private GeneratedMessageInfoFactory() {
    }

    public static com.google.protobuf.GeneratedMessageInfoFactory getInstance() {
        return instance;
    }

    @Override // com.google.protobuf.MessageInfoFactory
    public boolean isSupported(java.lang.Class<?> cls) {
        return com.google.protobuf.GeneratedMessageLite.class.isAssignableFrom(cls);
    }

    @Override // com.google.protobuf.MessageInfoFactory
    public com.google.protobuf.MessageInfo messageInfoFor(java.lang.Class<?> cls) {
        if (!com.google.protobuf.GeneratedMessageLite.class.isAssignableFrom(cls)) {
            throw new java.lang.IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (com.google.protobuf.MessageInfo) com.google.protobuf.GeneratedMessageLite.getDefaultInstance(cls.asSubclass(com.google.protobuf.GeneratedMessageLite.class)).buildMessageInfo();
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException("Unable to get message info for " + cls.getName(), e);
        }
    }
}
