package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
@com.google.protobuf.CheckReturnValue
final class ManifestSchemaFactory implements com.google.protobuf.SchemaFactory {
    private static final com.google.protobuf.MessageInfoFactory EMPTY_FACTORY = new com.google.protobuf.MessageInfoFactory() { // from class: com.google.protobuf.ManifestSchemaFactory.1
        @Override // com.google.protobuf.MessageInfoFactory
        public boolean isSupported(java.lang.Class<?> cls) {
            return false;
        }

        @Override // com.google.protobuf.MessageInfoFactory
        public com.google.protobuf.MessageInfo messageInfoFor(java.lang.Class<?> cls) {
            throw new java.lang.IllegalStateException("This should never be called.");
        }
    };
    private final com.google.protobuf.MessageInfoFactory messageInfoFactory;

    public ManifestSchemaFactory() {
        this(getDefaultMessageInfoFactory());
    }

    private ManifestSchemaFactory(com.google.protobuf.MessageInfoFactory messageInfoFactory) {
        this.messageInfoFactory = (com.google.protobuf.MessageInfoFactory) com.google.protobuf.Internal.checkNotNull(messageInfoFactory, "messageInfoFactory");
    }

    @Override // com.google.protobuf.SchemaFactory
    public <T> com.google.protobuf.Schema<T> createSchema(java.lang.Class<T> cls) {
        com.google.protobuf.SchemaUtil.requireGeneratedMessage(cls);
        com.google.protobuf.MessageInfo messageInfoMessageInfoFor = this.messageInfoFactory.messageInfoFor(cls);
        if (messageInfoMessageInfoFor.isMessageSetWireFormat()) {
            if (com.google.protobuf.GeneratedMessageLite.class.isAssignableFrom(cls)) {
                return com.google.protobuf.MessageSetSchema.newSchema(com.google.protobuf.SchemaUtil.unknownFieldSetLiteSchema(), com.google.protobuf.ExtensionSchemas.lite(), messageInfoMessageInfoFor.getDefaultInstance());
            }
            return com.google.protobuf.MessageSetSchema.newSchema(com.google.protobuf.SchemaUtil.proto2UnknownFieldSetSchema(), com.google.protobuf.ExtensionSchemas.full(), messageInfoMessageInfoFor.getDefaultInstance());
        }
        return newSchema(cls, messageInfoMessageInfoFor);
    }

    private static <T> com.google.protobuf.Schema<T> newSchema(java.lang.Class<T> cls, com.google.protobuf.MessageInfo messageInfo) {
        if (com.google.protobuf.GeneratedMessageLite.class.isAssignableFrom(cls)) {
            if (isProto2(messageInfo)) {
                return com.google.protobuf.MessageSchema.newSchema(cls, messageInfo, com.google.protobuf.NewInstanceSchemas.lite(), com.google.protobuf.ListFieldSchema.lite(), com.google.protobuf.SchemaUtil.unknownFieldSetLiteSchema(), com.google.protobuf.ExtensionSchemas.lite(), com.google.protobuf.MapFieldSchemas.lite());
            }
            return com.google.protobuf.MessageSchema.newSchema(cls, messageInfo, com.google.protobuf.NewInstanceSchemas.lite(), com.google.protobuf.ListFieldSchema.lite(), com.google.protobuf.SchemaUtil.unknownFieldSetLiteSchema(), null, com.google.protobuf.MapFieldSchemas.lite());
        }
        if (isProto2(messageInfo)) {
            return com.google.protobuf.MessageSchema.newSchema(cls, messageInfo, com.google.protobuf.NewInstanceSchemas.full(), com.google.protobuf.ListFieldSchema.full(), com.google.protobuf.SchemaUtil.proto2UnknownFieldSetSchema(), com.google.protobuf.ExtensionSchemas.full(), com.google.protobuf.MapFieldSchemas.full());
        }
        return com.google.protobuf.MessageSchema.newSchema(cls, messageInfo, com.google.protobuf.NewInstanceSchemas.full(), com.google.protobuf.ListFieldSchema.full(), com.google.protobuf.SchemaUtil.proto3UnknownFieldSetSchema(), null, com.google.protobuf.MapFieldSchemas.full());
    }

    private static boolean isProto2(com.google.protobuf.MessageInfo messageInfo) {
        return messageInfo.getSyntax() == com.google.protobuf.ProtoSyntax.PROTO2;
    }

    private static com.google.protobuf.MessageInfoFactory getDefaultMessageInfoFactory() {
        return new com.google.protobuf.ManifestSchemaFactory.CompositeMessageInfoFactory(com.google.protobuf.GeneratedMessageInfoFactory.getInstance(), getDescriptorMessageInfoFactory());
    }

    private static class CompositeMessageInfoFactory implements com.google.protobuf.MessageInfoFactory {
        private com.google.protobuf.MessageInfoFactory[] factories;

        CompositeMessageInfoFactory(com.google.protobuf.MessageInfoFactory... messageInfoFactoryArr) {
            this.factories = messageInfoFactoryArr;
        }

        @Override // com.google.protobuf.MessageInfoFactory
        public boolean isSupported(java.lang.Class<?> cls) {
            for (com.google.protobuf.MessageInfoFactory messageInfoFactory : this.factories) {
                if (messageInfoFactory.isSupported(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.protobuf.MessageInfoFactory
        public com.google.protobuf.MessageInfo messageInfoFor(java.lang.Class<?> cls) {
            for (com.google.protobuf.MessageInfoFactory messageInfoFactory : this.factories) {
                if (messageInfoFactory.isSupported(cls)) {
                    return messageInfoFactory.messageInfoFor(cls);
                }
            }
            throw new java.lang.UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }
    }

    private static com.google.protobuf.MessageInfoFactory getDescriptorMessageInfoFactory() {
        try {
            return (com.google.protobuf.MessageInfoFactory) java.lang.Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return EMPTY_FACTORY;
        }
    }
}
