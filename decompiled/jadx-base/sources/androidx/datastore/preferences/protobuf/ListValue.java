package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class ListValue extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<androidx.datastore.preferences.protobuf.ListValue, androidx.datastore.preferences.protobuf.ListValue.Builder> implements androidx.datastore.preferences.protobuf.ListValueOrBuilder {
    private static final androidx.datastore.preferences.protobuf.ListValue DEFAULT_INSTANCE;
    private static volatile androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.protobuf.ListValue> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.datastore.preferences.protobuf.Value> values_ = emptyProtobufList();

    private ListValue() {
    }

    @Override // androidx.datastore.preferences.protobuf.ListValueOrBuilder
    public java.util.List<androidx.datastore.preferences.protobuf.Value> getValuesList() {
        return this.values_;
    }

    public java.util.List<? extends androidx.datastore.preferences.protobuf.ValueOrBuilder> getValuesOrBuilderList() {
        return this.values_;
    }

    @Override // androidx.datastore.preferences.protobuf.ListValueOrBuilder
    public int getValuesCount() {
        return this.values_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.ListValueOrBuilder
    public androidx.datastore.preferences.protobuf.Value getValues(int index) {
        return this.values_.get(index);
    }

    public androidx.datastore.preferences.protobuf.ValueOrBuilder getValuesOrBuilder(int index) {
        return this.values_.get(index);
    }

    private void ensureValuesIsMutable() {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.datastore.preferences.protobuf.Value> protobufList = this.values_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.values_ = androidx.datastore.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValues(int index, androidx.datastore.preferences.protobuf.Value value) {
        value.getClass();
        ensureValuesIsMutable();
        this.values_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValues(androidx.datastore.preferences.protobuf.Value value) {
        value.getClass();
        ensureValuesIsMutable();
        this.values_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValues(int index, androidx.datastore.preferences.protobuf.Value value) {
        value.getClass();
        ensureValuesIsMutable();
        this.values_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllValues(java.lang.Iterable<? extends androidx.datastore.preferences.protobuf.Value> values) {
        ensureValuesIsMutable();
        androidx.datastore.preferences.protobuf.AbstractMessageLite.addAll(values, this.values_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValues() {
        this.values_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeValues(int index) {
        ensureValuesIsMutable();
        this.values_.remove(index);
    }

    public static androidx.datastore.preferences.protobuf.ListValue parseFrom(java.nio.ByteBuffer data) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.ListValue) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static androidx.datastore.preferences.protobuf.ListValue parseFrom(java.nio.ByteBuffer data, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.ListValue) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.ListValue parseFrom(androidx.datastore.preferences.protobuf.ByteString data) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.ListValue) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static androidx.datastore.preferences.protobuf.ListValue parseFrom(androidx.datastore.preferences.protobuf.ByteString data, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.ListValue) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.ListValue parseFrom(byte[] data) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.ListValue) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static androidx.datastore.preferences.protobuf.ListValue parseFrom(byte[] data, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.ListValue) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.ListValue parseFrom(java.io.InputStream input) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.ListValue) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static androidx.datastore.preferences.protobuf.ListValue parseFrom(java.io.InputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.ListValue) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.ListValue parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.ListValue) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static androidx.datastore.preferences.protobuf.ListValue parseDelimitedFrom(java.io.InputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.ListValue) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.ListValue parseFrom(androidx.datastore.preferences.protobuf.CodedInputStream input) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.ListValue) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static androidx.datastore.preferences.protobuf.ListValue parseFrom(androidx.datastore.preferences.protobuf.CodedInputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.ListValue) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.ListValue.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static androidx.datastore.preferences.protobuf.ListValue.Builder newBuilder(androidx.datastore.preferences.protobuf.ListValue prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder<androidx.datastore.preferences.protobuf.ListValue, androidx.datastore.preferences.protobuf.ListValue.Builder> implements androidx.datastore.preferences.protobuf.ListValueOrBuilder {
        /* synthetic */ Builder(androidx.datastore.preferences.protobuf.ListValue.AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(androidx.datastore.preferences.protobuf.ListValue.DEFAULT_INSTANCE);
        }

        @Override // androidx.datastore.preferences.protobuf.ListValueOrBuilder
        public java.util.List<androidx.datastore.preferences.protobuf.Value> getValuesList() {
            return java.util.Collections.unmodifiableList(((androidx.datastore.preferences.protobuf.ListValue) this.instance).getValuesList());
        }

        @Override // androidx.datastore.preferences.protobuf.ListValueOrBuilder
        public int getValuesCount() {
            return ((androidx.datastore.preferences.protobuf.ListValue) this.instance).getValuesCount();
        }

        @Override // androidx.datastore.preferences.protobuf.ListValueOrBuilder
        public androidx.datastore.preferences.protobuf.Value getValues(int index) {
            return ((androidx.datastore.preferences.protobuf.ListValue) this.instance).getValues(index);
        }

        public androidx.datastore.preferences.protobuf.ListValue.Builder setValues(int index, androidx.datastore.preferences.protobuf.Value value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.ListValue) this.instance).setValues(index, value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.ListValue.Builder setValues(int index, androidx.datastore.preferences.protobuf.Value.Builder builderForValue) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.ListValue) this.instance).setValues(index, builderForValue.build());
            return this;
        }

        public androidx.datastore.preferences.protobuf.ListValue.Builder addValues(androidx.datastore.preferences.protobuf.Value value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.ListValue) this.instance).addValues(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.ListValue.Builder addValues(int index, androidx.datastore.preferences.protobuf.Value value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.ListValue) this.instance).addValues(index, value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.ListValue.Builder addValues(androidx.datastore.preferences.protobuf.Value.Builder builderForValue) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.ListValue) this.instance).addValues(builderForValue.build());
            return this;
        }

        public androidx.datastore.preferences.protobuf.ListValue.Builder addValues(int index, androidx.datastore.preferences.protobuf.Value.Builder builderForValue) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.ListValue) this.instance).addValues(index, builderForValue.build());
            return this;
        }

        public androidx.datastore.preferences.protobuf.ListValue.Builder addAllValues(java.lang.Iterable<? extends androidx.datastore.preferences.protobuf.Value> values) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.ListValue) this.instance).addAllValues(values);
            return this;
        }

        public androidx.datastore.preferences.protobuf.ListValue.Builder clearValues() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.ListValue) this.instance).clearValues();
            return this;
        }

        public androidx.datastore.preferences.protobuf.ListValue.Builder removeValues(int index) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.ListValue) this.instance).removeValues(index);
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ListValue$1, reason: invalid class name */
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
        androidx.datastore.preferences.protobuf.ListValue.AnonymousClass1 anonymousClass1 = null;
        switch (androidx.datastore.preferences.protobuf.ListValue.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
            case 1:
                return new androidx.datastore.preferences.protobuf.ListValue();
            case 2:
                return new androidx.datastore.preferences.protobuf.ListValue.Builder(anonymousClass1);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"values_", androidx.datastore.preferences.protobuf.Value.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.protobuf.ListValue> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (androidx.datastore.preferences.protobuf.ListValue.class) {
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
        androidx.datastore.preferences.protobuf.ListValue listValue = new androidx.datastore.preferences.protobuf.ListValue();
        DEFAULT_INSTANCE = listValue;
        androidx.datastore.preferences.protobuf.GeneratedMessageLite.registerDefaultInstance(androidx.datastore.preferences.protobuf.ListValue.class, listValue);
    }

    public static androidx.datastore.preferences.protobuf.ListValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.protobuf.ListValue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
