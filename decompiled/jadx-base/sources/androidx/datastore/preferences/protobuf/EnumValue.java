package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class EnumValue extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<androidx.datastore.preferences.protobuf.EnumValue, androidx.datastore.preferences.protobuf.EnumValue.Builder> implements androidx.datastore.preferences.protobuf.EnumValueOrBuilder {
    private static final androidx.datastore.preferences.protobuf.EnumValue DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.protobuf.EnumValue> PARSER;
    private int number_;
    private java.lang.String name_ = "";
    private androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.datastore.preferences.protobuf.Option> options_ = emptyProtobufList();

    private EnumValue() {
    }

    @Override // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
    public java.lang.String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
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

    @Override // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
    public int getNumber() {
        return this.number_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumber(int value) {
        this.number_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumber() {
        this.number_ = 0;
    }

    @Override // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
    public java.util.List<androidx.datastore.preferences.protobuf.Option> getOptionsList() {
        return this.options_;
    }

    public java.util.List<? extends androidx.datastore.preferences.protobuf.OptionOrBuilder> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
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

    public static androidx.datastore.preferences.protobuf.EnumValue parseFrom(java.nio.ByteBuffer data) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.EnumValue) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static androidx.datastore.preferences.protobuf.EnumValue parseFrom(java.nio.ByteBuffer data, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.EnumValue) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.EnumValue parseFrom(androidx.datastore.preferences.protobuf.ByteString data) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.EnumValue) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static androidx.datastore.preferences.protobuf.EnumValue parseFrom(androidx.datastore.preferences.protobuf.ByteString data, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.EnumValue) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.EnumValue parseFrom(byte[] data) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.EnumValue) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static androidx.datastore.preferences.protobuf.EnumValue parseFrom(byte[] data, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.EnumValue) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.EnumValue parseFrom(java.io.InputStream input) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.EnumValue) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static androidx.datastore.preferences.protobuf.EnumValue parseFrom(java.io.InputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.EnumValue) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.EnumValue parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.EnumValue) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static androidx.datastore.preferences.protobuf.EnumValue parseDelimitedFrom(java.io.InputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.EnumValue) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.EnumValue parseFrom(androidx.datastore.preferences.protobuf.CodedInputStream input) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.EnumValue) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static androidx.datastore.preferences.protobuf.EnumValue parseFrom(androidx.datastore.preferences.protobuf.CodedInputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.EnumValue) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.EnumValue.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static androidx.datastore.preferences.protobuf.EnumValue.Builder newBuilder(androidx.datastore.preferences.protobuf.EnumValue prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder<androidx.datastore.preferences.protobuf.EnumValue, androidx.datastore.preferences.protobuf.EnumValue.Builder> implements androidx.datastore.preferences.protobuf.EnumValueOrBuilder {
        /* synthetic */ Builder(androidx.datastore.preferences.protobuf.EnumValue.AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(androidx.datastore.preferences.protobuf.EnumValue.DEFAULT_INSTANCE);
        }

        @Override // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
        public java.lang.String getName() {
            return ((androidx.datastore.preferences.protobuf.EnumValue) this.instance).getName();
        }

        @Override // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
        public androidx.datastore.preferences.protobuf.ByteString getNameBytes() {
            return ((androidx.datastore.preferences.protobuf.EnumValue) this.instance).getNameBytes();
        }

        public androidx.datastore.preferences.protobuf.EnumValue.Builder setName(java.lang.String value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.EnumValue) this.instance).setName(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.EnumValue.Builder clearName() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.EnumValue) this.instance).clearName();
            return this;
        }

        public androidx.datastore.preferences.protobuf.EnumValue.Builder setNameBytes(androidx.datastore.preferences.protobuf.ByteString value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.EnumValue) this.instance).setNameBytes(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
        public int getNumber() {
            return ((androidx.datastore.preferences.protobuf.EnumValue) this.instance).getNumber();
        }

        public androidx.datastore.preferences.protobuf.EnumValue.Builder setNumber(int value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.EnumValue) this.instance).setNumber(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.EnumValue.Builder clearNumber() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.EnumValue) this.instance).clearNumber();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
        public java.util.List<androidx.datastore.preferences.protobuf.Option> getOptionsList() {
            return java.util.Collections.unmodifiableList(((androidx.datastore.preferences.protobuf.EnumValue) this.instance).getOptionsList());
        }

        @Override // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
        public int getOptionsCount() {
            return ((androidx.datastore.preferences.protobuf.EnumValue) this.instance).getOptionsCount();
        }

        @Override // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
        public androidx.datastore.preferences.protobuf.Option getOptions(int index) {
            return ((androidx.datastore.preferences.protobuf.EnumValue) this.instance).getOptions(index);
        }

        public androidx.datastore.preferences.protobuf.EnumValue.Builder setOptions(int index, androidx.datastore.preferences.protobuf.Option value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.EnumValue) this.instance).setOptions(index, value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.EnumValue.Builder setOptions(int index, androidx.datastore.preferences.protobuf.Option.Builder builderForValue) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.EnumValue) this.instance).setOptions(index, builderForValue.build());
            return this;
        }

        public androidx.datastore.preferences.protobuf.EnumValue.Builder addOptions(androidx.datastore.preferences.protobuf.Option value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.EnumValue) this.instance).addOptions(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.EnumValue.Builder addOptions(int index, androidx.datastore.preferences.protobuf.Option value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.EnumValue) this.instance).addOptions(index, value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.EnumValue.Builder addOptions(androidx.datastore.preferences.protobuf.Option.Builder builderForValue) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.EnumValue) this.instance).addOptions(builderForValue.build());
            return this;
        }

        public androidx.datastore.preferences.protobuf.EnumValue.Builder addOptions(int index, androidx.datastore.preferences.protobuf.Option.Builder builderForValue) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.EnumValue) this.instance).addOptions(index, builderForValue.build());
            return this;
        }

        public androidx.datastore.preferences.protobuf.EnumValue.Builder addAllOptions(java.lang.Iterable<? extends androidx.datastore.preferences.protobuf.Option> values) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.EnumValue) this.instance).addAllOptions(values);
            return this;
        }

        public androidx.datastore.preferences.protobuf.EnumValue.Builder clearOptions() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.EnumValue) this.instance).clearOptions();
            return this;
        }

        public androidx.datastore.preferences.protobuf.EnumValue.Builder removeOptions(int index) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.EnumValue) this.instance).removeOptions(index);
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.EnumValue$1, reason: invalid class name */
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
        androidx.datastore.preferences.protobuf.EnumValue.AnonymousClass1 anonymousClass1 = null;
        switch (androidx.datastore.preferences.protobuf.EnumValue.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
            case 1:
                return new androidx.datastore.preferences.protobuf.EnumValue();
            case 2:
                return new androidx.datastore.preferences.protobuf.EnumValue.Builder(anonymousClass1);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\u001b", new java.lang.Object[]{"name_", "number_", "options_", androidx.datastore.preferences.protobuf.Option.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.protobuf.EnumValue> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (androidx.datastore.preferences.protobuf.EnumValue.class) {
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
        androidx.datastore.preferences.protobuf.EnumValue enumValue = new androidx.datastore.preferences.protobuf.EnumValue();
        DEFAULT_INSTANCE = enumValue;
        androidx.datastore.preferences.protobuf.GeneratedMessageLite.registerDefaultInstance(androidx.datastore.preferences.protobuf.EnumValue.class, enumValue);
    }

    public static androidx.datastore.preferences.protobuf.EnumValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.protobuf.EnumValue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
