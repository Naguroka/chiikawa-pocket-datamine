package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
public final class Option extends com.google.protobuf.GeneratedMessageLite<com.google.protobuf.Option, com.google.protobuf.Option.Builder> implements com.google.protobuf.OptionOrBuilder {
    private static final com.google.protobuf.Option DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.Parser<com.google.protobuf.Option> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private java.lang.String name_ = "";
    private com.google.protobuf.Any value_;

    private Option() {
    }

    @Override // com.google.protobuf.OptionOrBuilder
    public java.lang.String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.OptionOrBuilder
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

    @Override // com.google.protobuf.OptionOrBuilder
    public boolean hasValue() {
        return this.value_ != null;
    }

    @Override // com.google.protobuf.OptionOrBuilder
    public com.google.protobuf.Any getValue() {
        com.google.protobuf.Any any = this.value_;
        return any == null ? com.google.protobuf.Any.getDefaultInstance() : any;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(com.google.protobuf.Any any) {
        any.getClass();
        this.value_ = any;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeValue(com.google.protobuf.Any any) {
        any.getClass();
        com.google.protobuf.Any any2 = this.value_;
        if (any2 != null && any2 != com.google.protobuf.Any.getDefaultInstance()) {
            this.value_ = com.google.protobuf.Any.newBuilder(this.value_).mergeFrom(any).buildPartial();
        } else {
            this.value_ = any;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = null;
    }

    public static com.google.protobuf.Option parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Option) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Option parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Option) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.google.protobuf.Option parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Option) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.google.protobuf.Option parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Option) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.google.protobuf.Option parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Option) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.google.protobuf.Option parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Option) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.google.protobuf.Option parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.protobuf.Option) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.protobuf.Option parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.protobuf.Option) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.protobuf.Option parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.protobuf.Option) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.protobuf.Option parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.protobuf.Option) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.protobuf.Option parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        return (com.google.protobuf.Option) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.google.protobuf.Option parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.protobuf.Option) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.google.protobuf.Option.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.google.protobuf.Option.Builder newBuilder(com.google.protobuf.Option option) {
        return DEFAULT_INSTANCE.createBuilder(option);
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.google.protobuf.Option, com.google.protobuf.Option.Builder> implements com.google.protobuf.OptionOrBuilder {
        /* synthetic */ Builder(com.google.protobuf.Option.AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(com.google.protobuf.Option.DEFAULT_INSTANCE);
        }

        @Override // com.google.protobuf.OptionOrBuilder
        public java.lang.String getName() {
            return ((com.google.protobuf.Option) this.instance).getName();
        }

        @Override // com.google.protobuf.OptionOrBuilder
        public com.google.protobuf.ByteString getNameBytes() {
            return ((com.google.protobuf.Option) this.instance).getNameBytes();
        }

        public com.google.protobuf.Option.Builder setName(java.lang.String str) {
            copyOnWrite();
            ((com.google.protobuf.Option) this.instance).setName(str);
            return this;
        }

        public com.google.protobuf.Option.Builder clearName() {
            copyOnWrite();
            ((com.google.protobuf.Option) this.instance).clearName();
            return this;
        }

        public com.google.protobuf.Option.Builder setNameBytes(com.google.protobuf.ByteString byteString) {
            copyOnWrite();
            ((com.google.protobuf.Option) this.instance).setNameBytes(byteString);
            return this;
        }

        @Override // com.google.protobuf.OptionOrBuilder
        public boolean hasValue() {
            return ((com.google.protobuf.Option) this.instance).hasValue();
        }

        @Override // com.google.protobuf.OptionOrBuilder
        public com.google.protobuf.Any getValue() {
            return ((com.google.protobuf.Option) this.instance).getValue();
        }

        public com.google.protobuf.Option.Builder setValue(com.google.protobuf.Any any) {
            copyOnWrite();
            ((com.google.protobuf.Option) this.instance).setValue(any);
            return this;
        }

        public com.google.protobuf.Option.Builder setValue(com.google.protobuf.Any.Builder builder) {
            copyOnWrite();
            ((com.google.protobuf.Option) this.instance).setValue(builder.build());
            return this;
        }

        public com.google.protobuf.Option.Builder mergeValue(com.google.protobuf.Any any) {
            copyOnWrite();
            ((com.google.protobuf.Option) this.instance).mergeValue(any);
            return this;
        }

        public com.google.protobuf.Option.Builder clearValue() {
            copyOnWrite();
            ((com.google.protobuf.Option) this.instance).clearValue();
            return this;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.Option$1, reason: invalid class name */
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
        com.google.protobuf.Option.AnonymousClass1 anonymousClass1 = null;
        switch (com.google.protobuf.Option.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new com.google.protobuf.Option();
            case 2:
                return new com.google.protobuf.Option.Builder(anonymousClass1);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new java.lang.Object[]{"name_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.google.protobuf.Option> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (com.google.protobuf.Option.class) {
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
        com.google.protobuf.Option option = new com.google.protobuf.Option();
        DEFAULT_INSTANCE = option;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.google.protobuf.Option.class, option);
    }

    public static com.google.protobuf.Option getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.protobuf.Parser<com.google.protobuf.Option> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
