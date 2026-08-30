package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
public final class FieldMask extends com.google.protobuf.GeneratedMessageLite<com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder> implements com.google.protobuf.FieldMaskOrBuilder {
    private static final com.google.protobuf.FieldMask DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.google.protobuf.FieldMask> PARSER = null;
    public static final int PATHS_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.ProtobufList<java.lang.String> paths_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

    private FieldMask() {
    }

    @Override // com.google.protobuf.FieldMaskOrBuilder
    public java.util.List<java.lang.String> getPathsList() {
        return this.paths_;
    }

    @Override // com.google.protobuf.FieldMaskOrBuilder
    public int getPathsCount() {
        return this.paths_.size();
    }

    @Override // com.google.protobuf.FieldMaskOrBuilder
    public java.lang.String getPaths(int i) {
        return this.paths_.get(i);
    }

    @Override // com.google.protobuf.FieldMaskOrBuilder
    public com.google.protobuf.ByteString getPathsBytes(int i) {
        return com.google.protobuf.ByteString.copyFromUtf8(this.paths_.get(i));
    }

    private void ensurePathsIsMutable() {
        com.google.protobuf.Internal.ProtobufList<java.lang.String> protobufList = this.paths_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.paths_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaths(int i, java.lang.String str) {
        str.getClass();
        ensurePathsIsMutable();
        this.paths_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPaths(java.lang.String str) {
        str.getClass();
        ensurePathsIsMutable();
        this.paths_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPaths(java.lang.Iterable<java.lang.String> iterable) {
        ensurePathsIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.paths_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPaths() {
        this.paths_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPathsBytes(com.google.protobuf.ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        ensurePathsIsMutable();
        this.paths_.add(byteString.toStringUtf8());
    }

    public static com.google.protobuf.FieldMask parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.FieldMask) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.FieldMask parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.FieldMask) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.google.protobuf.FieldMask parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.FieldMask) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.google.protobuf.FieldMask parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.FieldMask) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.google.protobuf.FieldMask parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.FieldMask) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.google.protobuf.FieldMask parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.FieldMask) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.google.protobuf.FieldMask parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.protobuf.FieldMask) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.protobuf.FieldMask parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.protobuf.FieldMask) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.protobuf.FieldMask parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.protobuf.FieldMask) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.protobuf.FieldMask parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.protobuf.FieldMask) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.protobuf.FieldMask parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        return (com.google.protobuf.FieldMask) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.google.protobuf.FieldMask parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.protobuf.FieldMask) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.google.protobuf.FieldMask.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.google.protobuf.FieldMask.Builder newBuilder(com.google.protobuf.FieldMask fieldMask) {
        return DEFAULT_INSTANCE.createBuilder(fieldMask);
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder> implements com.google.protobuf.FieldMaskOrBuilder {
        /* synthetic */ Builder(com.google.protobuf.FieldMask.AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(com.google.protobuf.FieldMask.DEFAULT_INSTANCE);
        }

        @Override // com.google.protobuf.FieldMaskOrBuilder
        public java.util.List<java.lang.String> getPathsList() {
            return java.util.Collections.unmodifiableList(((com.google.protobuf.FieldMask) this.instance).getPathsList());
        }

        @Override // com.google.protobuf.FieldMaskOrBuilder
        public int getPathsCount() {
            return ((com.google.protobuf.FieldMask) this.instance).getPathsCount();
        }

        @Override // com.google.protobuf.FieldMaskOrBuilder
        public java.lang.String getPaths(int i) {
            return ((com.google.protobuf.FieldMask) this.instance).getPaths(i);
        }

        @Override // com.google.protobuf.FieldMaskOrBuilder
        public com.google.protobuf.ByteString getPathsBytes(int i) {
            return ((com.google.protobuf.FieldMask) this.instance).getPathsBytes(i);
        }

        public com.google.protobuf.FieldMask.Builder setPaths(int i, java.lang.String str) {
            copyOnWrite();
            ((com.google.protobuf.FieldMask) this.instance).setPaths(i, str);
            return this;
        }

        public com.google.protobuf.FieldMask.Builder addPaths(java.lang.String str) {
            copyOnWrite();
            ((com.google.protobuf.FieldMask) this.instance).addPaths(str);
            return this;
        }

        public com.google.protobuf.FieldMask.Builder addAllPaths(java.lang.Iterable<java.lang.String> iterable) {
            copyOnWrite();
            ((com.google.protobuf.FieldMask) this.instance).addAllPaths(iterable);
            return this;
        }

        public com.google.protobuf.FieldMask.Builder clearPaths() {
            copyOnWrite();
            ((com.google.protobuf.FieldMask) this.instance).clearPaths();
            return this;
        }

        public com.google.protobuf.FieldMask.Builder addPathsBytes(com.google.protobuf.ByteString byteString) {
            copyOnWrite();
            ((com.google.protobuf.FieldMask) this.instance).addPathsBytes(byteString);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.FieldMask$1, reason: invalid class name */
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

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.FieldMask.AnonymousClass1 anonymousClass1 = null;
        switch (com.google.protobuf.FieldMask.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new com.google.protobuf.FieldMask();
            case 2:
                return new com.google.protobuf.FieldMask.Builder(anonymousClass1);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new java.lang.Object[]{"paths_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.google.protobuf.FieldMask> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (com.google.protobuf.FieldMask.class) {
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
        com.google.protobuf.FieldMask fieldMask = new com.google.protobuf.FieldMask();
        DEFAULT_INSTANCE = fieldMask;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.google.protobuf.FieldMask.class, fieldMask);
    }

    public static com.google.protobuf.FieldMask getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.protobuf.Parser<com.google.protobuf.FieldMask> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
