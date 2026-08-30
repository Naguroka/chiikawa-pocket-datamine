package com.unity3d.ads.datastore;

/* JADX INFO: loaded from: classes6.dex */
public final class UniversalRequestStoreOuterClass {

    public interface UniversalRequestStoreOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        boolean containsUniversalRequestMap(java.lang.String str);

        @java.lang.Deprecated
        java.util.Map<java.lang.String, com.google.protobuf.ByteString> getUniversalRequestMap();

        int getUniversalRequestMapCount();

        java.util.Map<java.lang.String, com.google.protobuf.ByteString> getUniversalRequestMapMap();

        com.google.protobuf.ByteString getUniversalRequestMapOrDefault(java.lang.String str, com.google.protobuf.ByteString byteString);

        com.google.protobuf.ByteString getUniversalRequestMapOrThrow(java.lang.String str);
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
    }

    private UniversalRequestStoreOuterClass() {
    }

    public static final class UniversalRequestStore extends com.google.protobuf.GeneratedMessageLite<com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore, com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder> implements com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStoreOrBuilder {
        private static final com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore> PARSER = null;
        public static final int UNIVERSAL_REQUEST_MAP_FIELD_NUMBER = 1;
        private com.google.protobuf.MapFieldLite<java.lang.String, com.google.protobuf.ByteString> universalRequestMap_ = com.google.protobuf.MapFieldLite.emptyMapField();

        private UniversalRequestStore() {
        }

        private static final class UniversalRequestMapDefaultEntryHolder {
            static final com.google.protobuf.MapEntryLite<java.lang.String, com.google.protobuf.ByteString> defaultEntry = com.google.protobuf.MapEntryLite.newDefaultInstance(com.google.protobuf.WireFormat.FieldType.STRING, "", com.google.protobuf.WireFormat.FieldType.BYTES, com.google.protobuf.ByteString.EMPTY);

            private UniversalRequestMapDefaultEntryHolder() {
            }
        }

        private com.google.protobuf.MapFieldLite<java.lang.String, com.google.protobuf.ByteString> internalGetUniversalRequestMap() {
            return this.universalRequestMap_;
        }

        private com.google.protobuf.MapFieldLite<java.lang.String, com.google.protobuf.ByteString> internalGetMutableUniversalRequestMap() {
            if (!this.universalRequestMap_.isMutable()) {
                this.universalRequestMap_ = this.universalRequestMap_.mutableCopy();
            }
            return this.universalRequestMap_;
        }

        @Override // com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStoreOrBuilder
        public int getUniversalRequestMapCount() {
            return internalGetUniversalRequestMap().size();
        }

        @Override // com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStoreOrBuilder
        public boolean containsUniversalRequestMap(java.lang.String str) {
            str.getClass();
            return internalGetUniversalRequestMap().containsKey(str);
        }

        @Override // com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStoreOrBuilder
        @java.lang.Deprecated
        public java.util.Map<java.lang.String, com.google.protobuf.ByteString> getUniversalRequestMap() {
            return getUniversalRequestMapMap();
        }

        @Override // com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStoreOrBuilder
        public java.util.Map<java.lang.String, com.google.protobuf.ByteString> getUniversalRequestMapMap() {
            return java.util.Collections.unmodifiableMap(internalGetUniversalRequestMap());
        }

        @Override // com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStoreOrBuilder
        public com.google.protobuf.ByteString getUniversalRequestMapOrDefault(java.lang.String str, com.google.protobuf.ByteString byteString) {
            str.getClass();
            com.google.protobuf.MapFieldLite<java.lang.String, com.google.protobuf.ByteString> mapFieldLiteInternalGetUniversalRequestMap = internalGetUniversalRequestMap();
            return mapFieldLiteInternalGetUniversalRequestMap.containsKey(str) ? mapFieldLiteInternalGetUniversalRequestMap.get(str) : byteString;
        }

        @Override // com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStoreOrBuilder
        public com.google.protobuf.ByteString getUniversalRequestMapOrThrow(java.lang.String str) {
            str.getClass();
            com.google.protobuf.MapFieldLite<java.lang.String, com.google.protobuf.ByteString> mapFieldLiteInternalGetUniversalRequestMap = internalGetUniversalRequestMap();
            if (!mapFieldLiteInternalGetUniversalRequestMap.containsKey(str)) {
                throw new java.lang.IllegalArgumentException();
            }
            return mapFieldLiteInternalGetUniversalRequestMap.get(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public java.util.Map<java.lang.String, com.google.protobuf.ByteString> getMutableUniversalRequestMapMap() {
            return internalGetMutableUniversalRequestMap();
        }

        public static com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder newBuilder(com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStore) {
            return DEFAULT_INSTANCE.createBuilder(universalRequestStore);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore, com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder> implements com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStoreOrBuilder {
            /* synthetic */ Builder(com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.DEFAULT_INSTANCE);
            }

            @Override // com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStoreOrBuilder
            public int getUniversalRequestMapCount() {
                return ((com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore) this.instance).getUniversalRequestMapMap().size();
            }

            @Override // com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStoreOrBuilder
            public boolean containsUniversalRequestMap(java.lang.String str) {
                str.getClass();
                return ((com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore) this.instance).getUniversalRequestMapMap().containsKey(str);
            }

            public com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder clearUniversalRequestMap() {
                copyOnWrite();
                ((com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore) this.instance).getMutableUniversalRequestMapMap().clear();
                return this;
            }

            public com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder removeUniversalRequestMap(java.lang.String str) {
                str.getClass();
                copyOnWrite();
                ((com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore) this.instance).getMutableUniversalRequestMapMap().remove(str);
                return this;
            }

            @Override // com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStoreOrBuilder
            @java.lang.Deprecated
            public java.util.Map<java.lang.String, com.google.protobuf.ByteString> getUniversalRequestMap() {
                return getUniversalRequestMapMap();
            }

            @Override // com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStoreOrBuilder
            public java.util.Map<java.lang.String, com.google.protobuf.ByteString> getUniversalRequestMapMap() {
                return java.util.Collections.unmodifiableMap(((com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore) this.instance).getUniversalRequestMapMap());
            }

            @Override // com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStoreOrBuilder
            public com.google.protobuf.ByteString getUniversalRequestMapOrDefault(java.lang.String str, com.google.protobuf.ByteString byteString) {
                str.getClass();
                java.util.Map<java.lang.String, com.google.protobuf.ByteString> universalRequestMapMap = ((com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore) this.instance).getUniversalRequestMapMap();
                return universalRequestMapMap.containsKey(str) ? universalRequestMapMap.get(str) : byteString;
            }

            @Override // com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStoreOrBuilder
            public com.google.protobuf.ByteString getUniversalRequestMapOrThrow(java.lang.String str) {
                str.getClass();
                java.util.Map<java.lang.String, com.google.protobuf.ByteString> universalRequestMapMap = ((com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore) this.instance).getUniversalRequestMapMap();
                if (!universalRequestMapMap.containsKey(str)) {
                    throw new java.lang.IllegalArgumentException();
                }
                return universalRequestMapMap.get(str);
            }

            public com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder putUniversalRequestMap(java.lang.String str, com.google.protobuf.ByteString byteString) {
                str.getClass();
                byteString.getClass();
                copyOnWrite();
                ((com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore) this.instance).getMutableUniversalRequestMapMap().put(str, byteString);
                return this;
            }

            public com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder putAllUniversalRequestMap(java.util.Map<java.lang.String, com.google.protobuf.ByteString> map) {
                copyOnWrite();
                ((com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore) this.instance).getMutableUniversalRequestMapMap().putAll(map);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore();
                case 2:
                    return new com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new java.lang.Object[]{"universalRequestMap_", com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.UniversalRequestMapDefaultEntryHolder.defaultEntry});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.class) {
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
            com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStore = new com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore();
            DEFAULT_INSTANCE = universalRequestStore;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.class, universalRequestStore);
        }

        public static com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$1, reason: invalid class name */
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
