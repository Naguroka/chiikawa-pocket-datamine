package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
public final class ListValue extends com.google.protobuf.GeneratedMessageLite<com.google.protobuf.ListValue, com.google.protobuf.ListValue.Builder> implements com.google.protobuf.ListValueOrBuilder {
    private static final com.google.protobuf.ListValue DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.google.protobuf.ListValue> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.ProtobufList<com.google.protobuf.Value> values_ = emptyProtobufList();

    private ListValue() {
    }

    @Override // com.google.protobuf.ListValueOrBuilder
    public java.util.List<com.google.protobuf.Value> getValuesList() {
        return this.values_;
    }

    public java.util.List<? extends com.google.protobuf.ValueOrBuilder> getValuesOrBuilderList() {
        return this.values_;
    }

    @Override // com.google.protobuf.ListValueOrBuilder
    public int getValuesCount() {
        return this.values_.size();
    }

    @Override // com.google.protobuf.ListValueOrBuilder
    public com.google.protobuf.Value getValues(int i) {
        return this.values_.get(i);
    }

    public com.google.protobuf.ValueOrBuilder getValuesOrBuilder(int i) {
        return this.values_.get(i);
    }

    private void ensureValuesIsMutable() {
        com.google.protobuf.Internal.ProtobufList<com.google.protobuf.Value> protobufList = this.values_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.values_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValues(int i, com.google.protobuf.Value value) {
        value.getClass();
        ensureValuesIsMutable();
        this.values_.set(i, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValues(com.google.protobuf.Value value) {
        value.getClass();
        ensureValuesIsMutable();
        this.values_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValues(int i, com.google.protobuf.Value value) {
        value.getClass();
        ensureValuesIsMutable();
        this.values_.add(i, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllValues(java.lang.Iterable<? extends com.google.protobuf.Value> iterable) {
        ensureValuesIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.values_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValues() {
        this.values_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeValues(int i) {
        ensureValuesIsMutable();
        this.values_.remove(i);
    }

    public static com.google.protobuf.ListValue parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.ListValue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.ListValue parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.ListValue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.google.protobuf.ListValue parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.ListValue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.google.protobuf.ListValue parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.ListValue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.google.protobuf.ListValue parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.ListValue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.google.protobuf.ListValue parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.ListValue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.google.protobuf.ListValue parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.protobuf.ListValue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.protobuf.ListValue parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.protobuf.ListValue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.protobuf.ListValue parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.protobuf.ListValue) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.protobuf.ListValue parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.protobuf.ListValue) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.protobuf.ListValue parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        return (com.google.protobuf.ListValue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.google.protobuf.ListValue parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.protobuf.ListValue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.google.protobuf.ListValue.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.google.protobuf.ListValue.Builder newBuilder(com.google.protobuf.ListValue listValue) {
        return DEFAULT_INSTANCE.createBuilder(listValue);
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.google.protobuf.ListValue, com.google.protobuf.ListValue.Builder> implements com.google.protobuf.ListValueOrBuilder {
        /* synthetic */ Builder(com.google.protobuf.ListValue.AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(com.google.protobuf.ListValue.DEFAULT_INSTANCE);
        }

        @Override // com.google.protobuf.ListValueOrBuilder
        public java.util.List<com.google.protobuf.Value> getValuesList() {
            return java.util.Collections.unmodifiableList(((com.google.protobuf.ListValue) this.instance).getValuesList());
        }

        @Override // com.google.protobuf.ListValueOrBuilder
        public int getValuesCount() {
            return ((com.google.protobuf.ListValue) this.instance).getValuesCount();
        }

        @Override // com.google.protobuf.ListValueOrBuilder
        public com.google.protobuf.Value getValues(int i) {
            return ((com.google.protobuf.ListValue) this.instance).getValues(i);
        }

        public com.google.protobuf.ListValue.Builder setValues(int i, com.google.protobuf.Value value) {
            copyOnWrite();
            ((com.google.protobuf.ListValue) this.instance).setValues(i, value);
            return this;
        }

        public com.google.protobuf.ListValue.Builder setValues(int i, com.google.protobuf.Value.Builder builder) {
            copyOnWrite();
            ((com.google.protobuf.ListValue) this.instance).setValues(i, builder.build());
            return this;
        }

        public com.google.protobuf.ListValue.Builder addValues(com.google.protobuf.Value value) {
            copyOnWrite();
            ((com.google.protobuf.ListValue) this.instance).addValues(value);
            return this;
        }

        public com.google.protobuf.ListValue.Builder addValues(int i, com.google.protobuf.Value value) {
            copyOnWrite();
            ((com.google.protobuf.ListValue) this.instance).addValues(i, value);
            return this;
        }

        public com.google.protobuf.ListValue.Builder addValues(com.google.protobuf.Value.Builder builder) {
            copyOnWrite();
            ((com.google.protobuf.ListValue) this.instance).addValues(builder.build());
            return this;
        }

        public com.google.protobuf.ListValue.Builder addValues(int i, com.google.protobuf.Value.Builder builder) {
            copyOnWrite();
            ((com.google.protobuf.ListValue) this.instance).addValues(i, builder.build());
            return this;
        }

        public com.google.protobuf.ListValue.Builder addAllValues(java.lang.Iterable<? extends com.google.protobuf.Value> iterable) {
            copyOnWrite();
            ((com.google.protobuf.ListValue) this.instance).addAllValues(iterable);
            return this;
        }

        public com.google.protobuf.ListValue.Builder clearValues() {
            copyOnWrite();
            ((com.google.protobuf.ListValue) this.instance).clearValues();
            return this;
        }

        public com.google.protobuf.ListValue.Builder removeValues(int i) {
            copyOnWrite();
            ((com.google.protobuf.ListValue) this.instance).removeValues(i);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.ListValue$1, reason: invalid class name */
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
        com.google.protobuf.ListValue.AnonymousClass1 anonymousClass1 = null;
        switch (com.google.protobuf.ListValue.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new com.google.protobuf.ListValue();
            case 2:
                return new com.google.protobuf.ListValue.Builder(anonymousClass1);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"values_", com.google.protobuf.Value.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.google.protobuf.ListValue> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (com.google.protobuf.ListValue.class) {
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
        com.google.protobuf.ListValue listValue = new com.google.protobuf.ListValue();
        DEFAULT_INSTANCE = listValue;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.google.protobuf.ListValue.class, listValue);
    }

    public static com.google.protobuf.ListValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.protobuf.Parser<com.google.protobuf.ListValue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
