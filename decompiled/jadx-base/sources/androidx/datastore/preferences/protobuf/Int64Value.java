package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class Int64Value extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<androidx.datastore.preferences.protobuf.Int64Value, androidx.datastore.preferences.protobuf.Int64Value.Builder> implements androidx.datastore.preferences.protobuf.Int64ValueOrBuilder {
    private static final androidx.datastore.preferences.protobuf.Int64Value DEFAULT_INSTANCE;
    private static volatile androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.protobuf.Int64Value> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long value_;

    private Int64Value() {
    }

    @Override // androidx.datastore.preferences.protobuf.Int64ValueOrBuilder
    public long getValue() {
        return this.value_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(long value) {
        this.value_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0L;
    }

    public static androidx.datastore.preferences.protobuf.Int64Value parseFrom(java.nio.ByteBuffer data) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.Int64Value) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static androidx.datastore.preferences.protobuf.Int64Value parseFrom(java.nio.ByteBuffer data, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.Int64Value) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.Int64Value parseFrom(androidx.datastore.preferences.protobuf.ByteString data) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.Int64Value) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static androidx.datastore.preferences.protobuf.Int64Value parseFrom(androidx.datastore.preferences.protobuf.ByteString data, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.Int64Value) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.Int64Value parseFrom(byte[] data) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.Int64Value) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static androidx.datastore.preferences.protobuf.Int64Value parseFrom(byte[] data, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.Int64Value) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.Int64Value parseFrom(java.io.InputStream input) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.Int64Value) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static androidx.datastore.preferences.protobuf.Int64Value parseFrom(java.io.InputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.Int64Value) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.Int64Value parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.Int64Value) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static androidx.datastore.preferences.protobuf.Int64Value parseDelimitedFrom(java.io.InputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.Int64Value) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.Int64Value parseFrom(androidx.datastore.preferences.protobuf.CodedInputStream input) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.Int64Value) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static androidx.datastore.preferences.protobuf.Int64Value parseFrom(androidx.datastore.preferences.protobuf.CodedInputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.Int64Value) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.Int64Value.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static androidx.datastore.preferences.protobuf.Int64Value.Builder newBuilder(androidx.datastore.preferences.protobuf.Int64Value prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder<androidx.datastore.preferences.protobuf.Int64Value, androidx.datastore.preferences.protobuf.Int64Value.Builder> implements androidx.datastore.preferences.protobuf.Int64ValueOrBuilder {
        /* synthetic */ Builder(androidx.datastore.preferences.protobuf.Int64Value.AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(androidx.datastore.preferences.protobuf.Int64Value.DEFAULT_INSTANCE);
        }

        @Override // androidx.datastore.preferences.protobuf.Int64ValueOrBuilder
        public long getValue() {
            return ((androidx.datastore.preferences.protobuf.Int64Value) this.instance).getValue();
        }

        public androidx.datastore.preferences.protobuf.Int64Value.Builder setValue(long value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Int64Value) this.instance).setValue(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Int64Value.Builder clearValue() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Int64Value) this.instance).clearValue();
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Int64Value$1, reason: invalid class name */
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
        androidx.datastore.preferences.protobuf.Int64Value.AnonymousClass1 anonymousClass1 = null;
        switch (androidx.datastore.preferences.protobuf.Int64Value.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
            case 1:
                return new androidx.datastore.preferences.protobuf.Int64Value();
            case 2:
                return new androidx.datastore.preferences.protobuf.Int64Value.Builder(anonymousClass1);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new java.lang.Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.protobuf.Int64Value> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (androidx.datastore.preferences.protobuf.Int64Value.class) {
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
        androidx.datastore.preferences.protobuf.Int64Value int64Value = new androidx.datastore.preferences.protobuf.Int64Value();
        DEFAULT_INSTANCE = int64Value;
        androidx.datastore.preferences.protobuf.GeneratedMessageLite.registerDefaultInstance(androidx.datastore.preferences.protobuf.Int64Value.class, int64Value);
    }

    public static androidx.datastore.preferences.protobuf.Int64Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static androidx.datastore.preferences.protobuf.Int64Value of(long value) {
        return newBuilder().setValue(value).build();
    }

    public static androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.protobuf.Int64Value> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
