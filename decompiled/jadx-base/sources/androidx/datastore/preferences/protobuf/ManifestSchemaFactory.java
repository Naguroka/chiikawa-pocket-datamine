package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
@androidx.datastore.preferences.protobuf.CheckReturnValue
final class ManifestSchemaFactory implements androidx.datastore.preferences.protobuf.SchemaFactory {
    private static final androidx.datastore.preferences.protobuf.MessageInfoFactory EMPTY_FACTORY = new androidx.datastore.preferences.protobuf.MessageInfoFactory() { // from class: androidx.datastore.preferences.protobuf.ManifestSchemaFactory.1
        @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
        public boolean isSupported(java.lang.Class<?> clazz) {
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
        public androidx.datastore.preferences.protobuf.MessageInfo messageInfoFor(java.lang.Class<?> clazz) {
            throw new java.lang.IllegalStateException("This should never be called.");
        }
    };
    private final androidx.datastore.preferences.protobuf.MessageInfoFactory messageInfoFactory;

    public ManifestSchemaFactory() {
        this(getDefaultMessageInfoFactory());
    }

    private ManifestSchemaFactory(androidx.datastore.preferences.protobuf.MessageInfoFactory messageInfoFactory) {
        this.messageInfoFactory = (androidx.datastore.preferences.protobuf.MessageInfoFactory) androidx.datastore.preferences.protobuf.Internal.checkNotNull(messageInfoFactory, "messageInfoFactory");
    }

    @Override // androidx.datastore.preferences.protobuf.SchemaFactory
    public <T> androidx.datastore.preferences.protobuf.Schema<T> createSchema(java.lang.Class<T> messageType) {
        androidx.datastore.preferences.protobuf.SchemaUtil.requireGeneratedMessage(messageType);
        androidx.datastore.preferences.protobuf.MessageInfo messageInfoMessageInfoFor = this.messageInfoFactory.messageInfoFor(messageType);
        if (messageInfoMessageInfoFor.isMessageSetWireFormat()) {
            if (useLiteRuntime(messageType)) {
                return androidx.datastore.preferences.protobuf.MessageSetSchema.newSchema(androidx.datastore.preferences.protobuf.SchemaUtil.unknownFieldSetLiteSchema(), androidx.datastore.preferences.protobuf.ExtensionSchemas.lite(), messageInfoMessageInfoFor.getDefaultInstance());
            }
            return androidx.datastore.preferences.protobuf.MessageSetSchema.newSchema(androidx.datastore.preferences.protobuf.SchemaUtil.unknownFieldSetFullSchema(), androidx.datastore.preferences.protobuf.ExtensionSchemas.full(), messageInfoMessageInfoFor.getDefaultInstance());
        }
        return newSchema(messageType, messageInfoMessageInfoFor);
    }

    private static <T> androidx.datastore.preferences.protobuf.Schema<T> newSchema(java.lang.Class<T> messageType, androidx.datastore.preferences.protobuf.MessageInfo messageInfo) {
        if (useLiteRuntime(messageType)) {
            return androidx.datastore.preferences.protobuf.MessageSchema.newSchema(messageType, messageInfo, androidx.datastore.preferences.protobuf.NewInstanceSchemas.lite(), androidx.datastore.preferences.protobuf.ListFieldSchemas.lite(), androidx.datastore.preferences.protobuf.SchemaUtil.unknownFieldSetLiteSchema(), allowExtensions(messageInfo) ? androidx.datastore.preferences.protobuf.ExtensionSchemas.lite() : null, androidx.datastore.preferences.protobuf.MapFieldSchemas.lite());
        }
        return androidx.datastore.preferences.protobuf.MessageSchema.newSchema(messageType, messageInfo, androidx.datastore.preferences.protobuf.NewInstanceSchemas.full(), androidx.datastore.preferences.protobuf.ListFieldSchemas.full(), androidx.datastore.preferences.protobuf.SchemaUtil.unknownFieldSetFullSchema(), allowExtensions(messageInfo) ? androidx.datastore.preferences.protobuf.ExtensionSchemas.full() : null, androidx.datastore.preferences.protobuf.MapFieldSchemas.full());
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ManifestSchemaFactory$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$ProtoSyntax;

        static {
            int[] iArr = new int[androidx.datastore.preferences.protobuf.ProtoSyntax.values().length];
            $SwitchMap$com$google$protobuf$ProtoSyntax = iArr;
            try {
                iArr[androidx.datastore.preferences.protobuf.ProtoSyntax.PROTO3.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
        }
    }

    private static boolean allowExtensions(androidx.datastore.preferences.protobuf.MessageInfo messageInfo) {
        return androidx.datastore.preferences.protobuf.ManifestSchemaFactory.AnonymousClass2.$SwitchMap$com$google$protobuf$ProtoSyntax[messageInfo.getSyntax().ordinal()] != 1;
    }

    private static androidx.datastore.preferences.protobuf.MessageInfoFactory getDefaultMessageInfoFactory() {
        return new androidx.datastore.preferences.protobuf.ManifestSchemaFactory.CompositeMessageInfoFactory(androidx.datastore.preferences.protobuf.GeneratedMessageInfoFactory.getInstance(), getDescriptorMessageInfoFactory());
    }

    private static class CompositeMessageInfoFactory implements androidx.datastore.preferences.protobuf.MessageInfoFactory {
        private androidx.datastore.preferences.protobuf.MessageInfoFactory[] factories;

        CompositeMessageInfoFactory(androidx.datastore.preferences.protobuf.MessageInfoFactory... factories) {
            this.factories = factories;
        }

        @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
        public boolean isSupported(java.lang.Class<?> clazz) {
            for (androidx.datastore.preferences.protobuf.MessageInfoFactory messageInfoFactory : this.factories) {
                if (messageInfoFactory.isSupported(clazz)) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
        public androidx.datastore.preferences.protobuf.MessageInfo messageInfoFor(java.lang.Class<?> clazz) {
            for (androidx.datastore.preferences.protobuf.MessageInfoFactory messageInfoFactory : this.factories) {
                if (messageInfoFactory.isSupported(clazz)) {
                    return messageInfoFactory.messageInfoFor(clazz);
                }
            }
            throw new java.lang.UnsupportedOperationException("No factory is available for message type: " + clazz.getName());
        }
    }

    private static androidx.datastore.preferences.protobuf.MessageInfoFactory getDescriptorMessageInfoFactory() {
        if (androidx.datastore.preferences.protobuf.Protobuf.assumeLiteRuntime) {
            return EMPTY_FACTORY;
        }
        try {
            return (androidx.datastore.preferences.protobuf.MessageInfoFactory) java.lang.Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return EMPTY_FACTORY;
        }
    }

    private static boolean useLiteRuntime(java.lang.Class<?> messageType) {
        return androidx.datastore.preferences.protobuf.Protobuf.assumeLiteRuntime || androidx.datastore.preferences.protobuf.GeneratedMessageLite.class.isAssignableFrom(messageType);
    }
}
