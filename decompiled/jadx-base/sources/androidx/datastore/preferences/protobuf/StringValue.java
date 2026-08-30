package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class StringValue extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<androidx.datastore.preferences.protobuf.StringValue, androidx.datastore.preferences.protobuf.StringValue.Builder> implements androidx.datastore.preferences.protobuf.StringValueOrBuilder {
    private static final androidx.datastore.preferences.protobuf.StringValue DEFAULT_INSTANCE;
    private static volatile androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.protobuf.StringValue> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private java.lang.String value_ = "";

    private StringValue() {
    }

    @Override // androidx.datastore.preferences.protobuf.StringValueOrBuilder
    public java.lang.String getValue() {
        return this.value_;
    }

    @Override // androidx.datastore.preferences.protobuf.StringValueOrBuilder
    public androidx.datastore.preferences.protobuf.ByteString getValueBytes() {
        return androidx.datastore.preferences.protobuf.ByteString.copyFromUtf8(this.value_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(java.lang.String value) {
        value.getClass();
        this.value_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = getDefaultInstance().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueBytes(androidx.datastore.preferences.protobuf.ByteString value) {
        checkByteStringIsUtf8(value);
        this.value_ = value.toStringUtf8();
    }

    public static androidx.datastore.preferences.protobuf.StringValue parseFrom(java.nio.ByteBuffer data) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.StringValue) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static androidx.datastore.preferences.protobuf.StringValue parseFrom(java.nio.ByteBuffer data, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.StringValue) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.StringValue parseFrom(androidx.datastore.preferences.protobuf.ByteString data) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.StringValue) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static androidx.datastore.preferences.protobuf.StringValue parseFrom(androidx.datastore.preferences.protobuf.ByteString data, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.StringValue) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.StringValue parseFrom(byte[] data) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.StringValue) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static androidx.datastore.preferences.protobuf.StringValue parseFrom(byte[] data, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.StringValue) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.StringValue parseFrom(java.io.InputStream input) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.StringValue) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static androidx.datastore.preferences.protobuf.StringValue parseFrom(java.io.InputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.StringValue) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.StringValue parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.StringValue) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static androidx.datastore.preferences.protobuf.StringValue parseDelimitedFrom(java.io.InputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.StringValue) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.StringValue parseFrom(androidx.datastore.preferences.protobuf.CodedInputStream input) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.StringValue) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static androidx.datastore.preferences.protobuf.StringValue parseFrom(androidx.datastore.preferences.protobuf.CodedInputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.StringValue) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.StringValue.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static androidx.datastore.preferences.protobuf.StringValue.Builder newBuilder(androidx.datastore.preferences.protobuf.StringValue prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder<androidx.datastore.preferences.protobuf.StringValue, androidx.datastore.preferences.protobuf.StringValue.Builder> implements androidx.datastore.preferences.protobuf.StringValueOrBuilder {
        /* synthetic */ Builder(androidx.datastore.preferences.protobuf.StringValue.AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(androidx.datastore.preferences.protobuf.StringValue.DEFAULT_INSTANCE);
        }

        @Override // androidx.datastore.preferences.protobuf.StringValueOrBuilder
        public java.lang.String getValue() {
            return ((androidx.datastore.preferences.protobuf.StringValue) this.instance).getValue();
        }

        @Override // androidx.datastore.preferences.protobuf.StringValueOrBuilder
        public androidx.datastore.preferences.protobuf.ByteString getValueBytes() {
            return ((androidx.datastore.preferences.protobuf.StringValue) this.instance).getValueBytes();
        }

        public androidx.datastore.preferences.protobuf.StringValue.Builder setValue(java.lang.String value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.StringValue) this.instance).setValue(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.StringValue.Builder clearValue() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.StringValue) this.instance).clearValue();
            return this;
        }

        public androidx.datastore.preferences.protobuf.StringValue.Builder setValueBytes(androidx.datastore.preferences.protobuf.ByteString value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.StringValue) this.instance).setValueBytes(value);
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.StringValue$1, reason: invalid class name */
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
        androidx.datastore.preferences.protobuf.StringValue.AnonymousClass1 anonymousClass1 = null;
        switch (androidx.datastore.preferences.protobuf.StringValue.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
            case 1:
                return new androidx.datastore.preferences.protobuf.StringValue();
            case 2:
                return new androidx.datastore.preferences.protobuf.StringValue.Builder(anonymousClass1);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new java.lang.Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.protobuf.StringValue> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (androidx.datastore.preferences.protobuf.StringValue.class) {
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
        androidx.datastore.preferences.protobuf.StringValue stringValue = new androidx.datastore.preferences.protobuf.StringValue();
        DEFAULT_INSTANCE = stringValue;
        androidx.datastore.preferences.protobuf.GeneratedMessageLite.registerDefaultInstance(androidx.datastore.preferences.protobuf.StringValue.class, stringValue);
    }

    public static androidx.datastore.preferences.protobuf.StringValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static androidx.datastore.preferences.protobuf.StringValue of(java.lang.String value) {
        return newBuilder().setValue(value).build();
    }

    public static androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.protobuf.StringValue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
