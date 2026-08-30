package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class Method extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<androidx.datastore.preferences.protobuf.Method, androidx.datastore.preferences.protobuf.Method.Builder> implements androidx.datastore.preferences.protobuf.MethodOrBuilder {
    private static final androidx.datastore.preferences.protobuf.Method DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 6;
    private static volatile androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.protobuf.Method> PARSER = null;
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
    private androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.datastore.preferences.protobuf.Option> options_ = emptyProtobufList();

    private Method() {
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public java.lang.String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public androidx.datastore.preferences.protobuf.ByteString getNameBytes() {
        return androidx.datastore.preferences.protobuf.ByteString.copyFromUtf8(this.name_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(java.lang.String value) {
        value.getClass();
        this.name_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(androidx.datastore.preferences.protobuf.ByteString value) {
        checkByteStringIsUtf8(value);
        this.name_ = value.toStringUtf8();
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public java.lang.String getRequestTypeUrl() {
        return this.requestTypeUrl_;
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public androidx.datastore.preferences.protobuf.ByteString getRequestTypeUrlBytes() {
        return androidx.datastore.preferences.protobuf.ByteString.copyFromUtf8(this.requestTypeUrl_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestTypeUrl(java.lang.String value) {
        value.getClass();
        this.requestTypeUrl_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestTypeUrl() {
        this.requestTypeUrl_ = getDefaultInstance().getRequestTypeUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestTypeUrlBytes(androidx.datastore.preferences.protobuf.ByteString value) {
        checkByteStringIsUtf8(value);
        this.requestTypeUrl_ = value.toStringUtf8();
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public boolean getRequestStreaming() {
        return this.requestStreaming_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestStreaming(boolean value) {
        this.requestStreaming_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestStreaming() {
        this.requestStreaming_ = false;
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public java.lang.String getResponseTypeUrl() {
        return this.responseTypeUrl_;
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public androidx.datastore.preferences.protobuf.ByteString getResponseTypeUrlBytes() {
        return androidx.datastore.preferences.protobuf.ByteString.copyFromUtf8(this.responseTypeUrl_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseTypeUrl(java.lang.String value) {
        value.getClass();
        this.responseTypeUrl_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponseTypeUrl() {
        this.responseTypeUrl_ = getDefaultInstance().getResponseTypeUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseTypeUrlBytes(androidx.datastore.preferences.protobuf.ByteString value) {
        checkByteStringIsUtf8(value);
        this.responseTypeUrl_ = value.toStringUtf8();
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public boolean getResponseStreaming() {
        return this.responseStreaming_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseStreaming(boolean value) {
        this.responseStreaming_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponseStreaming() {
        this.responseStreaming_ = false;
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public java.util.List<androidx.datastore.preferences.protobuf.Option> getOptionsList() {
        return this.options_;
    }

    public java.util.List<? extends androidx.datastore.preferences.protobuf.OptionOrBuilder> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public androidx.datastore.preferences.protobuf.Option getOptions(int index) {
        return this.options_.get(index);
    }

    public androidx.datastore.preferences.protobuf.OptionOrBuilder getOptionsOrBuilder(int index) {
        return this.options_.get(index);
    }

    private void ensureOptionsIsMutable() {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.datastore.preferences.protobuf.Option> protobufList = this.options_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.options_ = androidx.datastore.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptions(int index, androidx.datastore.preferences.protobuf.Option value) {
        value.getClass();
        ensureOptionsIsMutable();
        this.options_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(androidx.datastore.preferences.protobuf.Option value) {
        value.getClass();
        ensureOptionsIsMutable();
        this.options_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(int index, androidx.datastore.preferences.protobuf.Option value) {
        value.getClass();
        ensureOptionsIsMutable();
        this.options_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOptions(java.lang.Iterable<? extends androidx.datastore.preferences.protobuf.Option> values) {
        ensureOptionsIsMutable();
        androidx.datastore.preferences.protobuf.AbstractMessageLite.addAll(values, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOptions(int index) {
        ensureOptionsIsMutable();
        this.options_.remove(index);
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public androidx.datastore.preferences.protobuf.Syntax getSyntax() {
        androidx.datastore.preferences.protobuf.Syntax syntaxForNumber = androidx.datastore.preferences.protobuf.Syntax.forNumber(this.syntax_);
        return syntaxForNumber == null ? androidx.datastore.preferences.protobuf.Syntax.UNRECOGNIZED : syntaxForNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyntaxValue(int value) {
        this.syntax_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyntax(androidx.datastore.preferences.protobuf.Syntax value) {
        this.syntax_ = value.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSyntax() {
        this.syntax_ = 0;
    }

    public static androidx.datastore.preferences.protobuf.Method parseFrom(java.nio.ByteBuffer data) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.Method) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static androidx.datastore.preferences.protobuf.Method parseFrom(java.nio.ByteBuffer data, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.Method) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.Method parseFrom(androidx.datastore.preferences.protobuf.ByteString data) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.Method) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static androidx.datastore.preferences.protobuf.Method parseFrom(androidx.datastore.preferences.protobuf.ByteString data, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.Method) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.Method parseFrom(byte[] data) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.Method) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static androidx.datastore.preferences.protobuf.Method parseFrom(byte[] data, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.Method) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.Method parseFrom(java.io.InputStream input) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.Method) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static androidx.datastore.preferences.protobuf.Method parseFrom(java.io.InputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.Method) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.Method parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.Method) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static androidx.datastore.preferences.protobuf.Method parseDelimitedFrom(java.io.InputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.Method) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.Method parseFrom(androidx.datastore.preferences.protobuf.CodedInputStream input) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.Method) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static androidx.datastore.preferences.protobuf.Method parseFrom(androidx.datastore.preferences.protobuf.CodedInputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.Method) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.Method.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static androidx.datastore.preferences.protobuf.Method.Builder newBuilder(androidx.datastore.preferences.protobuf.Method prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder<androidx.datastore.preferences.protobuf.Method, androidx.datastore.preferences.protobuf.Method.Builder> implements androidx.datastore.preferences.protobuf.MethodOrBuilder {
        /* synthetic */ Builder(androidx.datastore.preferences.protobuf.Method.AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(androidx.datastore.preferences.protobuf.Method.DEFAULT_INSTANCE);
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public java.lang.String getName() {
            return ((androidx.datastore.preferences.protobuf.Method) this.instance).getName();
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public androidx.datastore.preferences.protobuf.ByteString getNameBytes() {
            return ((androidx.datastore.preferences.protobuf.Method) this.instance).getNameBytes();
        }

        public androidx.datastore.preferences.protobuf.Method.Builder setName(java.lang.String value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Method) this.instance).setName(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Method.Builder clearName() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Method) this.instance).clearName();
            return this;
        }

        public androidx.datastore.preferences.protobuf.Method.Builder setNameBytes(androidx.datastore.preferences.protobuf.ByteString value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Method) this.instance).setNameBytes(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public java.lang.String getRequestTypeUrl() {
            return ((androidx.datastore.preferences.protobuf.Method) this.instance).getRequestTypeUrl();
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public androidx.datastore.preferences.protobuf.ByteString getRequestTypeUrlBytes() {
            return ((androidx.datastore.preferences.protobuf.Method) this.instance).getRequestTypeUrlBytes();
        }

        public androidx.datastore.preferences.protobuf.Method.Builder setRequestTypeUrl(java.lang.String value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Method) this.instance).setRequestTypeUrl(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Method.Builder clearRequestTypeUrl() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Method) this.instance).clearRequestTypeUrl();
            return this;
        }

        public androidx.datastore.preferences.protobuf.Method.Builder setRequestTypeUrlBytes(androidx.datastore.preferences.protobuf.ByteString value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Method) this.instance).setRequestTypeUrlBytes(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public boolean getRequestStreaming() {
            return ((androidx.datastore.preferences.protobuf.Method) this.instance).getRequestStreaming();
        }

        public androidx.datastore.preferences.protobuf.Method.Builder setRequestStreaming(boolean value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Method) this.instance).setRequestStreaming(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Method.Builder clearRequestStreaming() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Method) this.instance).clearRequestStreaming();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public java.lang.String getResponseTypeUrl() {
            return ((androidx.datastore.preferences.protobuf.Method) this.instance).getResponseTypeUrl();
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public androidx.datastore.preferences.protobuf.ByteString getResponseTypeUrlBytes() {
            return ((androidx.datastore.preferences.protobuf.Method) this.instance).getResponseTypeUrlBytes();
        }

        public androidx.datastore.preferences.protobuf.Method.Builder setResponseTypeUrl(java.lang.String value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Method) this.instance).setResponseTypeUrl(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Method.Builder clearResponseTypeUrl() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Method) this.instance).clearResponseTypeUrl();
            return this;
        }

        public androidx.datastore.preferences.protobuf.Method.Builder setResponseTypeUrlBytes(androidx.datastore.preferences.protobuf.ByteString value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Method) this.instance).setResponseTypeUrlBytes(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public boolean getResponseStreaming() {
            return ((androidx.datastore.preferences.protobuf.Method) this.instance).getResponseStreaming();
        }

        public androidx.datastore.preferences.protobuf.Method.Builder setResponseStreaming(boolean value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Method) this.instance).setResponseStreaming(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Method.Builder clearResponseStreaming() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Method) this.instance).clearResponseStreaming();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public java.util.List<androidx.datastore.preferences.protobuf.Option> getOptionsList() {
            return java.util.Collections.unmodifiableList(((androidx.datastore.preferences.protobuf.Method) this.instance).getOptionsList());
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public int getOptionsCount() {
            return ((androidx.datastore.preferences.protobuf.Method) this.instance).getOptionsCount();
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public androidx.datastore.preferences.protobuf.Option getOptions(int index) {
            return ((androidx.datastore.preferences.protobuf.Method) this.instance).getOptions(index);
        }

        public androidx.datastore.preferences.protobuf.Method.Builder setOptions(int index, androidx.datastore.preferences.protobuf.Option value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Method) this.instance).setOptions(index, value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Method.Builder setOptions(int index, androidx.datastore.preferences.protobuf.Option.Builder builderForValue) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Method) this.instance).setOptions(index, builderForValue.build());
            return this;
        }

        public androidx.datastore.preferences.protobuf.Method.Builder addOptions(androidx.datastore.preferences.protobuf.Option value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Method) this.instance).addOptions(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Method.Builder addOptions(int index, androidx.datastore.preferences.protobuf.Option value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Method) this.instance).addOptions(index, value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Method.Builder addOptions(androidx.datastore.preferences.protobuf.Option.Builder builderForValue) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Method) this.instance).addOptions(builderForValue.build());
            return this;
        }

        public androidx.datastore.preferences.protobuf.Method.Builder addOptions(int index, androidx.datastore.preferences.protobuf.Option.Builder builderForValue) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Method) this.instance).addOptions(index, builderForValue.build());
            return this;
        }

        public androidx.datastore.preferences.protobuf.Method.Builder addAllOptions(java.lang.Iterable<? extends androidx.datastore.preferences.protobuf.Option> values) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Method) this.instance).addAllOptions(values);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Method.Builder clearOptions() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Method) this.instance).clearOptions();
            return this;
        }

        public androidx.datastore.preferences.protobuf.Method.Builder removeOptions(int index) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Method) this.instance).removeOptions(index);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public int getSyntaxValue() {
            return ((androidx.datastore.preferences.protobuf.Method) this.instance).getSyntaxValue();
        }

        public androidx.datastore.preferences.protobuf.Method.Builder setSyntaxValue(int value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Method) this.instance).setSyntaxValue(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public androidx.datastore.preferences.protobuf.Syntax getSyntax() {
            return ((androidx.datastore.preferences.protobuf.Method) this.instance).getSyntax();
        }

        public androidx.datastore.preferences.protobuf.Method.Builder setSyntax(androidx.datastore.preferences.protobuf.Syntax value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Method) this.instance).setSyntax(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Method.Builder clearSyntax() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Method) this.instance).clearSyntax();
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Method$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    protected final java.lang.Object dynamicMethod(androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke method, java.lang.Object arg0, java.lang.Object arg1) {
        androidx.datastore.preferences.protobuf.Method.AnonymousClass1 anonymousClass1 = null;
        switch (androidx.datastore.preferences.protobuf.Method.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
            case 1:
                return new androidx.datastore.preferences.protobuf.Method();
            case 2:
                return new androidx.datastore.preferences.protobuf.Method.Builder(anonymousClass1);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004Ȉ\u0005\u0007\u0006\u001b\u0007\f", new java.lang.Object[]{"name_", "requestTypeUrl_", "requestStreaming_", "responseTypeUrl_", "responseStreaming_", "options_", androidx.datastore.preferences.protobuf.Option.class, "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.protobuf.Method> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (androidx.datastore.preferences.protobuf.Method.class) {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new androidx.datastore.preferences.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
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
        androidx.datastore.preferences.protobuf.Method method = new androidx.datastore.preferences.protobuf.Method();
        DEFAULT_INSTANCE = method;
        androidx.datastore.preferences.protobuf.GeneratedMessageLite.registerDefaultInstance(androidx.datastore.preferences.protobuf.Method.class, method);
    }

    public static androidx.datastore.preferences.protobuf.Method getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.protobuf.Method> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
