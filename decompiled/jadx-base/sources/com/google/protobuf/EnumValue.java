package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
public final class EnumValue extends com.google.protobuf.GeneratedMessageLite<com.google.protobuf.EnumValue, com.google.protobuf.EnumValue.Builder> implements com.google.protobuf.EnumValueOrBuilder {
    private static final com.google.protobuf.EnumValue DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile com.google.protobuf.Parser<com.google.protobuf.EnumValue> PARSER;
    private int number_;
    private java.lang.String name_ = "";
    private com.google.protobuf.Internal.ProtobufList<com.google.protobuf.Option> options_ = emptyProtobufList();

    private EnumValue() {
    }

    @Override // com.google.protobuf.EnumValueOrBuilder
    public java.lang.String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.EnumValueOrBuilder
    public com.google.protobuf.ByteString getNameBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.name_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(java.lang.String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(com.google.protobuf.ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.EnumValueOrBuilder
    public int getNumber() {
        return this.number_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumber(int i) {
        this.number_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumber() {
        this.number_ = 0;
    }

    @Override // com.google.protobuf.EnumValueOrBuilder
    public java.util.List<com.google.protobuf.Option> getOptionsList() {
        return this.options_;
    }

    public java.util.List<? extends com.google.protobuf.OptionOrBuilder> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // com.google.protobuf.EnumValueOrBuilder
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.protobuf.EnumValueOrBuilder
    public com.google.protobuf.Option getOptions(int i) {
        return this.options_.get(i);
    }

    public com.google.protobuf.OptionOrBuilder getOptionsOrBuilder(int i) {
        return this.options_.get(i);
    }

    private void ensureOptionsIsMutable() {
        com.google.protobuf.Internal.ProtobufList<com.google.protobuf.Option> protobufList = this.options_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.options_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptions(int i, com.google.protobuf.Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.set(i, option);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(com.google.protobuf.Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(option);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(int i, com.google.protobuf.Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(i, option);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOptions(java.lang.Iterable<? extends com.google.protobuf.Option> iterable) {
        ensureOptionsIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOptions(int i) {
        ensureOptionsIsMutable();
        this.options_.remove(i);
    }

    public static com.google.protobuf.EnumValue parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.EnumValue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.EnumValue parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.EnumValue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.google.protobuf.EnumValue parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.EnumValue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.google.protobuf.EnumValue parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.EnumValue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.google.protobuf.EnumValue parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.EnumValue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.google.protobuf.EnumValue parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.EnumValue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.google.protobuf.EnumValue parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.protobuf.EnumValue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.protobuf.EnumValue parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.protobuf.EnumValue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.protobuf.EnumValue parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.protobuf.EnumValue) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.protobuf.EnumValue parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.protobuf.EnumValue) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.protobuf.EnumValue parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        return (com.google.protobuf.EnumValue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.google.protobuf.EnumValue parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.protobuf.EnumValue) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.google.protobuf.EnumValue.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.google.protobuf.EnumValue.Builder newBuilder(com.google.protobuf.EnumValue enumValue) {
        return DEFAULT_INSTANCE.createBuilder(enumValue);
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.google.protobuf.EnumValue, com.google.protobuf.EnumValue.Builder> implements com.google.protobuf.EnumValueOrBuilder {
        /* synthetic */ Builder(com.google.protobuf.EnumValue.AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(com.google.protobuf.EnumValue.DEFAULT_INSTANCE);
        }

        @Override // com.google.protobuf.EnumValueOrBuilder
        public java.lang.String getName() {
            return ((com.google.protobuf.EnumValue) this.instance).getName();
        }

        @Override // com.google.protobuf.EnumValueOrBuilder
        public com.google.protobuf.ByteString getNameBytes() {
            return ((com.google.protobuf.EnumValue) this.instance).getNameBytes();
        }

        public com.google.protobuf.EnumValue.Builder setName(java.lang.String str) {
            copyOnWrite();
            ((com.google.protobuf.EnumValue) this.instance).setName(str);
            return this;
        }

        public com.google.protobuf.EnumValue.Builder clearName() {
            copyOnWrite();
            ((com.google.protobuf.EnumValue) this.instance).clearName();
            return this;
        }

        public com.google.protobuf.EnumValue.Builder setNameBytes(com.google.protobuf.ByteString byteString) {
            copyOnWrite();
            ((com.google.protobuf.EnumValue) this.instance).setNameBytes(byteString);
            return this;
        }

        @Override // com.google.protobuf.EnumValueOrBuilder
        public int getNumber() {
            return ((com.google.protobuf.EnumValue) this.instance).getNumber();
        }

        public com.google.protobuf.EnumValue.Builder setNumber(int i) {
            copyOnWrite();
            ((com.google.protobuf.EnumValue) this.instance).setNumber(i);
            return this;
        }

        public com.google.protobuf.EnumValue.Builder clearNumber() {
            copyOnWrite();
            ((com.google.protobuf.EnumValue) this.instance).clearNumber();
            return this;
        }

        @Override // com.google.protobuf.EnumValueOrBuilder
        public java.util.List<com.google.protobuf.Option> getOptionsList() {
            return java.util.Collections.unmodifiableList(((com.google.protobuf.EnumValue) this.instance).getOptionsList());
        }

        @Override // com.google.protobuf.EnumValueOrBuilder
        public int getOptionsCount() {
            return ((com.google.protobuf.EnumValue) this.instance).getOptionsCount();
        }

        @Override // com.google.protobuf.EnumValueOrBuilder
        public com.google.protobuf.Option getOptions(int i) {
            return ((com.google.protobuf.EnumValue) this.instance).getOptions(i);
        }

        public com.google.protobuf.EnumValue.Builder setOptions(int i, com.google.protobuf.Option option) {
            copyOnWrite();
            ((com.google.protobuf.EnumValue) this.instance).setOptions(i, option);
            return this;
        }

        public com.google.protobuf.EnumValue.Builder setOptions(int i, com.google.protobuf.Option.Builder builder) {
            copyOnWrite();
            ((com.google.protobuf.EnumValue) this.instance).setOptions(i, builder.build());
            return this;
        }

        public com.google.protobuf.EnumValue.Builder addOptions(com.google.protobuf.Option option) {
            copyOnWrite();
            ((com.google.protobuf.EnumValue) this.instance).addOptions(option);
            return this;
        }

        public com.google.protobuf.EnumValue.Builder addOptions(int i, com.google.protobuf.Option option) {
            copyOnWrite();
            ((com.google.protobuf.EnumValue) this.instance).addOptions(i, option);
            return this;
        }

        public com.google.protobuf.EnumValue.Builder addOptions(com.google.protobuf.Option.Builder builder) {
            copyOnWrite();
            ((com.google.protobuf.EnumValue) this.instance).addOptions(builder.build());
            return this;
        }

        public com.google.protobuf.EnumValue.Builder addOptions(int i, com.google.protobuf.Option.Builder builder) {
            copyOnWrite();
            ((com.google.protobuf.EnumValue) this.instance).addOptions(i, builder.build());
            return this;
        }

        public com.google.protobuf.EnumValue.Builder addAllOptions(java.lang.Iterable<? extends com.google.protobuf.Option> iterable) {
            copyOnWrite();
            ((com.google.protobuf.EnumValue) this.instance).addAllOptions(iterable);
            return this;
        }

        public com.google.protobuf.EnumValue.Builder clearOptions() {
            copyOnWrite();
            ((com.google.protobuf.EnumValue) this.instance).clearOptions();
            return this;
        }

        public com.google.protobuf.EnumValue.Builder removeOptions(int i) {
            copyOnWrite();
            ((com.google.protobuf.EnumValue) this.instance).removeOptions(i);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.EnumValue$1, reason: invalid class name */
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
        com.google.protobuf.EnumValue.AnonymousClass1 anonymousClass1 = null;
        switch (com.google.protobuf.EnumValue.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new com.google.protobuf.EnumValue();
            case 2:
                return new com.google.protobuf.EnumValue.Builder(anonymousClass1);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\u001b", new java.lang.Object[]{"name_", "number_", "options_", com.google.protobuf.Option.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.google.protobuf.EnumValue> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (com.google.protobuf.EnumValue.class) {
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
        com.google.protobuf.EnumValue enumValue = new com.google.protobuf.EnumValue();
        DEFAULT_INSTANCE = enumValue;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.google.protobuf.EnumValue.class, enumValue);
    }

    public static com.google.protobuf.EnumValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.protobuf.Parser<com.google.protobuf.EnumValue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
