package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
public final class Method extends com.google.protobuf.GeneratedMessageLite<com.google.protobuf.Method, com.google.protobuf.Method.Builder> implements com.google.protobuf.MethodOrBuilder {
    private static final com.google.protobuf.Method DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 6;
    private static volatile com.google.protobuf.Parser<com.google.protobuf.Method> PARSER = null;
    public static final int REQUEST_STREAMING_FIELD_NUMBER = 3;
    public static final int REQUEST_TYPE_URL_FIELD_NUMBER = 2;
    public static final int RESPONSE_STREAMING_FIELD_NUMBER = 5;
    public static final int RESPONSE_TYPE_URL_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    private boolean requestStreaming_;
    private boolean responseStreaming_;
    private int syntax_;
    private java.lang.String name_ = "";
    private java.lang.String requestTypeUrl_ = "";
    private java.lang.String responseTypeUrl_ = "";
    private com.google.protobuf.Internal.ProtobufList<com.google.protobuf.Option> options_ = emptyProtobufList();

    private Method() {
    }

    @Override // com.google.protobuf.MethodOrBuilder
    public java.lang.String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.MethodOrBuilder
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

    @Override // com.google.protobuf.MethodOrBuilder
    public java.lang.String getRequestTypeUrl() {
        return this.requestTypeUrl_;
    }

    @Override // com.google.protobuf.MethodOrBuilder
    public com.google.protobuf.ByteString getRequestTypeUrlBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.requestTypeUrl_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestTypeUrl(java.lang.String str) {
        str.getClass();
        this.requestTypeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestTypeUrl() {
        this.requestTypeUrl_ = getDefaultInstance().getRequestTypeUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestTypeUrlBytes(com.google.protobuf.ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        this.requestTypeUrl_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.MethodOrBuilder
    public boolean getRequestStreaming() {
        return this.requestStreaming_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestStreaming(boolean z) {
        this.requestStreaming_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestStreaming() {
        this.requestStreaming_ = false;
    }

    @Override // com.google.protobuf.MethodOrBuilder
    public java.lang.String getResponseTypeUrl() {
        return this.responseTypeUrl_;
    }

    @Override // com.google.protobuf.MethodOrBuilder
    public com.google.protobuf.ByteString getResponseTypeUrlBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.responseTypeUrl_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseTypeUrl(java.lang.String str) {
        str.getClass();
        this.responseTypeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponseTypeUrl() {
        this.responseTypeUrl_ = getDefaultInstance().getResponseTypeUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseTypeUrlBytes(com.google.protobuf.ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        this.responseTypeUrl_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.MethodOrBuilder
    public boolean getResponseStreaming() {
        return this.responseStreaming_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseStreaming(boolean z) {
        this.responseStreaming_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponseStreaming() {
        this.responseStreaming_ = false;
    }

    @Override // com.google.protobuf.MethodOrBuilder
    public java.util.List<com.google.protobuf.Option> getOptionsList() {
        return this.options_;
    }

    public java.util.List<? extends com.google.protobuf.OptionOrBuilder> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // com.google.protobuf.MethodOrBuilder
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.protobuf.MethodOrBuilder
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

    @Override // com.google.protobuf.MethodOrBuilder
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // com.google.protobuf.MethodOrBuilder
    public com.google.protobuf.Syntax getSyntax() {
        com.google.protobuf.Syntax syntaxForNumber = com.google.protobuf.Syntax.forNumber(this.syntax_);
        return syntaxForNumber == null ? com.google.protobuf.Syntax.UNRECOGNIZED : syntaxForNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyntaxValue(int i) {
        this.syntax_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyntax(com.google.protobuf.Syntax syntax) {
        this.syntax_ = syntax.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSyntax() {
        this.syntax_ = 0;
    }

    public static com.google.protobuf.Method parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Method) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Method parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Method) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.google.protobuf.Method parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Method) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.google.protobuf.Method parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Method) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.google.protobuf.Method parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Method) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.google.protobuf.Method parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Method) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.google.protobuf.Method parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.protobuf.Method) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.protobuf.Method parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.protobuf.Method) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.protobuf.Method parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.protobuf.Method) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.protobuf.Method parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.protobuf.Method) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.protobuf.Method parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        return (com.google.protobuf.Method) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.google.protobuf.Method parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.protobuf.Method) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.google.protobuf.Method.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.google.protobuf.Method.Builder newBuilder(com.google.protobuf.Method method) {
        return DEFAULT_INSTANCE.createBuilder(method);
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.google.protobuf.Method, com.google.protobuf.Method.Builder> implements com.google.protobuf.MethodOrBuilder {
        /* synthetic */ Builder(com.google.protobuf.Method.AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(com.google.protobuf.Method.DEFAULT_INSTANCE);
        }

        @Override // com.google.protobuf.MethodOrBuilder
        public java.lang.String getName() {
            return ((com.google.protobuf.Method) this.instance).getName();
        }

        @Override // com.google.protobuf.MethodOrBuilder
        public com.google.protobuf.ByteString getNameBytes() {
            return ((com.google.protobuf.Method) this.instance).getNameBytes();
        }

        public com.google.protobuf.Method.Builder setName(java.lang.String str) {
            copyOnWrite();
            ((com.google.protobuf.Method) this.instance).setName(str);
            return this;
        }

        public com.google.protobuf.Method.Builder clearName() {
            copyOnWrite();
            ((com.google.protobuf.Method) this.instance).clearName();
            return this;
        }

        public com.google.protobuf.Method.Builder setNameBytes(com.google.protobuf.ByteString byteString) {
            copyOnWrite();
            ((com.google.protobuf.Method) this.instance).setNameBytes(byteString);
            return this;
        }

        @Override // com.google.protobuf.MethodOrBuilder
        public java.lang.String getRequestTypeUrl() {
            return ((com.google.protobuf.Method) this.instance).getRequestTypeUrl();
        }

        @Override // com.google.protobuf.MethodOrBuilder
        public com.google.protobuf.ByteString getRequestTypeUrlBytes() {
            return ((com.google.protobuf.Method) this.instance).getRequestTypeUrlBytes();
        }

        public com.google.protobuf.Method.Builder setRequestTypeUrl(java.lang.String str) {
            copyOnWrite();
            ((com.google.protobuf.Method) this.instance).setRequestTypeUrl(str);
            return this;
        }

        public com.google.protobuf.Method.Builder clearRequestTypeUrl() {
            copyOnWrite();
            ((com.google.protobuf.Method) this.instance).clearRequestTypeUrl();
            return this;
        }

        public com.google.protobuf.Method.Builder setRequestTypeUrlBytes(com.google.protobuf.ByteString byteString) {
            copyOnWrite();
            ((com.google.protobuf.Method) this.instance).setRequestTypeUrlBytes(byteString);
            return this;
        }

        @Override // com.google.protobuf.MethodOrBuilder
        public boolean getRequestStreaming() {
            return ((com.google.protobuf.Method) this.instance).getRequestStreaming();
        }

        public com.google.protobuf.Method.Builder setRequestStreaming(boolean z) {
            copyOnWrite();
            ((com.google.protobuf.Method) this.instance).setRequestStreaming(z);
            return this;
        }

        public com.google.protobuf.Method.Builder clearRequestStreaming() {
            copyOnWrite();
            ((com.google.protobuf.Method) this.instance).clearRequestStreaming();
            return this;
        }

        @Override // com.google.protobuf.MethodOrBuilder
        public java.lang.String getResponseTypeUrl() {
            return ((com.google.protobuf.Method) this.instance).getResponseTypeUrl();
        }

        @Override // com.google.protobuf.MethodOrBuilder
        public com.google.protobuf.ByteString getResponseTypeUrlBytes() {
            return ((com.google.protobuf.Method) this.instance).getResponseTypeUrlBytes();
        }

        public com.google.protobuf.Method.Builder setResponseTypeUrl(java.lang.String str) {
            copyOnWrite();
            ((com.google.protobuf.Method) this.instance).setResponseTypeUrl(str);
            return this;
        }

        public com.google.protobuf.Method.Builder clearResponseTypeUrl() {
            copyOnWrite();
            ((com.google.protobuf.Method) this.instance).clearResponseTypeUrl();
            return this;
        }

        public com.google.protobuf.Method.Builder setResponseTypeUrlBytes(com.google.protobuf.ByteString byteString) {
            copyOnWrite();
            ((com.google.protobuf.Method) this.instance).setResponseTypeUrlBytes(byteString);
            return this;
        }

        @Override // com.google.protobuf.MethodOrBuilder
        public boolean getResponseStreaming() {
            return ((com.google.protobuf.Method) this.instance).getResponseStreaming();
        }

        public com.google.protobuf.Method.Builder setResponseStreaming(boolean z) {
            copyOnWrite();
            ((com.google.protobuf.Method) this.instance).setResponseStreaming(z);
            return this;
        }

        public com.google.protobuf.Method.Builder clearResponseStreaming() {
            copyOnWrite();
            ((com.google.protobuf.Method) this.instance).clearResponseStreaming();
            return this;
        }

        @Override // com.google.protobuf.MethodOrBuilder
        public java.util.List<com.google.protobuf.Option> getOptionsList() {
            return java.util.Collections.unmodifiableList(((com.google.protobuf.Method) this.instance).getOptionsList());
        }

        @Override // com.google.protobuf.MethodOrBuilder
        public int getOptionsCount() {
            return ((com.google.protobuf.Method) this.instance).getOptionsCount();
        }

        @Override // com.google.protobuf.MethodOrBuilder
        public com.google.protobuf.Option getOptions(int i) {
            return ((com.google.protobuf.Method) this.instance).getOptions(i);
        }

        public com.google.protobuf.Method.Builder setOptions(int i, com.google.protobuf.Option option) {
            copyOnWrite();
            ((com.google.protobuf.Method) this.instance).setOptions(i, option);
            return this;
        }

        public com.google.protobuf.Method.Builder setOptions(int i, com.google.protobuf.Option.Builder builder) {
            copyOnWrite();
            ((com.google.protobuf.Method) this.instance).setOptions(i, builder.build());
            return this;
        }

        public com.google.protobuf.Method.Builder addOptions(com.google.protobuf.Option option) {
            copyOnWrite();
            ((com.google.protobuf.Method) this.instance).addOptions(option);
            return this;
        }

        public com.google.protobuf.Method.Builder addOptions(int i, com.google.protobuf.Option option) {
            copyOnWrite();
            ((com.google.protobuf.Method) this.instance).addOptions(i, option);
            return this;
        }

        public com.google.protobuf.Method.Builder addOptions(com.google.protobuf.Option.Builder builder) {
            copyOnWrite();
            ((com.google.protobuf.Method) this.instance).addOptions(builder.build());
            return this;
        }

        public com.google.protobuf.Method.Builder addOptions(int i, com.google.protobuf.Option.Builder builder) {
            copyOnWrite();
            ((com.google.protobuf.Method) this.instance).addOptions(i, builder.build());
            return this;
        }

        public com.google.protobuf.Method.Builder addAllOptions(java.lang.Iterable<? extends com.google.protobuf.Option> iterable) {
            copyOnWrite();
            ((com.google.protobuf.Method) this.instance).addAllOptions(iterable);
            return this;
        }

        public com.google.protobuf.Method.Builder clearOptions() {
            copyOnWrite();
            ((com.google.protobuf.Method) this.instance).clearOptions();
            return this;
        }

        public com.google.protobuf.Method.Builder removeOptions(int i) {
            copyOnWrite();
            ((com.google.protobuf.Method) this.instance).removeOptions(i);
            return this;
        }

        @Override // com.google.protobuf.MethodOrBuilder
        public int getSyntaxValue() {
            return ((com.google.protobuf.Method) this.instance).getSyntaxValue();
        }

        public com.google.protobuf.Method.Builder setSyntaxValue(int i) {
            copyOnWrite();
            ((com.google.protobuf.Method) this.instance).setSyntaxValue(i);
            return this;
        }

        @Override // com.google.protobuf.MethodOrBuilder
        public com.google.protobuf.Syntax getSyntax() {
            return ((com.google.protobuf.Method) this.instance).getSyntax();
        }

        public com.google.protobuf.Method.Builder setSyntax(com.google.protobuf.Syntax syntax) {
            copyOnWrite();
            ((com.google.protobuf.Method) this.instance).setSyntax(syntax);
            return this;
        }

        public com.google.protobuf.Method.Builder clearSyntax() {
            copyOnWrite();
            ((com.google.protobuf.Method) this.instance).clearSyntax();
            return this;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.Method$1, reason: invalid class name */
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
        com.google.protobuf.Method.AnonymousClass1 anonymousClass1 = null;
        switch (com.google.protobuf.Method.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new com.google.protobuf.Method();
            case 2:
                return new com.google.protobuf.Method.Builder(anonymousClass1);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004Ȉ\u0005\u0007\u0006\u001b\u0007\f", new java.lang.Object[]{"name_", "requestTypeUrl_", "requestStreaming_", "responseTypeUrl_", "responseStreaming_", "options_", com.google.protobuf.Option.class, "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.google.protobuf.Method> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (com.google.protobuf.Method.class) {
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
        com.google.protobuf.Method method = new com.google.protobuf.Method();
        DEFAULT_INSTANCE = method;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.google.protobuf.Method.class, method);
    }

    public static com.google.protobuf.Method getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.protobuf.Parser<com.google.protobuf.Method> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
