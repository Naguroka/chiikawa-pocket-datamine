package com.unity3d.ads.datastore;

/* JADX INFO: loaded from: classes6.dex */
public final class ByteStringStoreOuterClass {

    public interface ByteStringStoreOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        com.google.protobuf.ByteString getData();
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
    }

    private ByteStringStoreOuterClass() {
    }

    public static final class ByteStringStore extends com.google.protobuf.GeneratedMessageLite<com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore, com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.Builder> implements com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStoreOrBuilder {
        public static final int DATA_FIELD_NUMBER = 1;
        private static final com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore> PARSER;
        private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;

        private ByteStringStore() {
        }

        @Override // com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStoreOrBuilder
        public com.google.protobuf.ByteString getData() {
            return this.data_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData(com.google.protobuf.ByteString byteString) {
            byteString.getClass();
            this.data_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData() {
            this.data_ = getDefaultInstance().getData();
        }

        public static com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.Builder newBuilder(com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore byteStringStore) {
            return DEFAULT_INSTANCE.createBuilder(byteStringStore);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore, com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.Builder> implements com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStoreOrBuilder {
            /* synthetic */ Builder(com.unity3d.ads.datastore.ByteStringStoreOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.DEFAULT_INSTANCE);
            }

            @Override // com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStoreOrBuilder
            public com.google.protobuf.ByteString getData() {
                return ((com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) this.instance).getData();
            }

            public com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.Builder setData(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) this.instance).setData(byteString);
                return this;
            }

            public com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.Builder clearData() {
                copyOnWrite();
                ((com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) this.instance).clearData();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.unity3d.ads.datastore.ByteStringStoreOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (com.unity3d.ads.datastore.ByteStringStoreOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore();
                case 2:
                    return new com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new java.lang.Object[]{"data_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.class) {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                            break;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new java.lang.UnsupportedOperationException();
            }
        }

        static {
            com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore byteStringStore = new com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore();
            DEFAULT_INSTANCE = byteStringStore;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.class, byteStringStore);
        }

        public static com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.datastore.ByteStringStoreOuterClass$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }
}
