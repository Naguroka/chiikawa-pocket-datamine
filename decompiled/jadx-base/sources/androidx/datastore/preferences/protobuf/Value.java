package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class Value extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<androidx.datastore.preferences.protobuf.Value, androidx.datastore.preferences.protobuf.Value.Builder> implements androidx.datastore.preferences.protobuf.ValueOrBuilder {
    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    private static final androidx.datastore.preferences.protobuf.Value DEFAULT_INSTANCE;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    private static volatile androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.protobuf.Value> PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
    private int kindCase_ = 0;
    private java.lang.Object kind_;

    private Value() {
    }

    public enum KindCase {
        NULL_VALUE(1),
        NUMBER_VALUE(2),
        STRING_VALUE(3),
        BOOL_VALUE(4),
        STRUCT_VALUE(5),
        LIST_VALUE(6),
        KIND_NOT_SET(0);

        private final int value;

        KindCase(int value) {
            this.value = value;
        }

        @java.lang.Deprecated
        public static androidx.datastore.preferences.protobuf.Value.KindCase valueOf(int value) {
            return forNumber(value);
        }

        public static androidx.datastore.preferences.protobuf.Value.KindCase forNumber(int value) {
            switch (value) {
                case 0:
                    return KIND_NOT_SET;
                case 1:
                    return NULL_VALUE;
                case 2:
                    return NUMBER_VALUE;
                case 3:
                    return STRING_VALUE;
                case 4:
                    return BOOL_VALUE;
                case 5:
                    return STRUCT_VALUE;
                case 6:
                    return LIST_VALUE;
                default:
                    return null;
            }
        }

        public int getNumber() {
            return this.value;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public androidx.datastore.preferences.protobuf.Value.KindCase getKindCase() {
        return androidx.datastore.preferences.protobuf.Value.KindCase.forNumber(this.kindCase_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKind() {
        this.kindCase_ = 0;
        this.kind_ = null;
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public boolean hasNullValue() {
        return this.kindCase_ == 1;
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public int getNullValueValue() {
        if (this.kindCase_ == 1) {
            return ((java.lang.Integer) this.kind_).intValue();
        }
        return 0;
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public androidx.datastore.preferences.protobuf.NullValue getNullValue() {
        if (this.kindCase_ == 1) {
            androidx.datastore.preferences.protobuf.NullValue nullValueForNumber = androidx.datastore.preferences.protobuf.NullValue.forNumber(((java.lang.Integer) this.kind_).intValue());
            return nullValueForNumber == null ? androidx.datastore.preferences.protobuf.NullValue.UNRECOGNIZED : nullValueForNumber;
        }
        return androidx.datastore.preferences.protobuf.NullValue.NULL_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNullValueValue(int value) {
        this.kindCase_ = 1;
        this.kind_ = java.lang.Integer.valueOf(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNullValue(androidx.datastore.preferences.protobuf.NullValue value) {
        this.kind_ = java.lang.Integer.valueOf(value.getNumber());
        this.kindCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNullValue() {
        if (this.kindCase_ == 1) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public boolean hasNumberValue() {
        return this.kindCase_ == 2;
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public double getNumberValue() {
        if (this.kindCase_ == 2) {
            return ((java.lang.Double) this.kind_).doubleValue();
        }
        return 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumberValue(double value) {
        this.kindCase_ = 2;
        this.kind_ = java.lang.Double.valueOf(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumberValue() {
        if (this.kindCase_ == 2) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public boolean hasStringValue() {
        return this.kindCase_ == 3;
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public java.lang.String getStringValue() {
        return this.kindCase_ == 3 ? (java.lang.String) this.kind_ : "";
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public androidx.datastore.preferences.protobuf.ByteString getStringValueBytes() {
        return androidx.datastore.preferences.protobuf.ByteString.copyFromUtf8(this.kindCase_ == 3 ? (java.lang.String) this.kind_ : "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValue(java.lang.String value) {
        value.getClass();
        this.kindCase_ = 3;
        this.kind_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStringValue() {
        if (this.kindCase_ == 3) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValueBytes(androidx.datastore.preferences.protobuf.ByteString value) {
        checkByteStringIsUtf8(value);
        this.kind_ = value.toStringUtf8();
        this.kindCase_ = 3;
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public boolean hasBoolValue() {
        return this.kindCase_ == 4;
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public boolean getBoolValue() {
        if (this.kindCase_ == 4) {
            return ((java.lang.Boolean) this.kind_).booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBoolValue(boolean value) {
        this.kindCase_ = 4;
        this.kind_ = java.lang.Boolean.valueOf(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBoolValue() {
        if (this.kindCase_ == 4) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public boolean hasStructValue() {
        return this.kindCase_ == 5;
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public androidx.datastore.preferences.protobuf.Struct getStructValue() {
        if (this.kindCase_ == 5) {
            return (androidx.datastore.preferences.protobuf.Struct) this.kind_;
        }
        return androidx.datastore.preferences.protobuf.Struct.getDefaultInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStructValue(androidx.datastore.preferences.protobuf.Struct value) {
        value.getClass();
        this.kind_ = value;
        this.kindCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStructValue(androidx.datastore.preferences.protobuf.Struct value) {
        value.getClass();
        if (this.kindCase_ == 5 && this.kind_ != androidx.datastore.preferences.protobuf.Struct.getDefaultInstance()) {
            this.kind_ = androidx.datastore.preferences.protobuf.Struct.newBuilder((androidx.datastore.preferences.protobuf.Struct) this.kind_).mergeFrom(value).buildPartial();
        } else {
            this.kind_ = value;
        }
        this.kindCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStructValue() {
        if (this.kindCase_ == 5) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public boolean hasListValue() {
        return this.kindCase_ == 6;
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public androidx.datastore.preferences.protobuf.ListValue getListValue() {
        if (this.kindCase_ == 6) {
            return (androidx.datastore.preferences.protobuf.ListValue) this.kind_;
        }
        return androidx.datastore.preferences.protobuf.ListValue.getDefaultInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setListValue(androidx.datastore.preferences.protobuf.ListValue value) {
        value.getClass();
        this.kind_ = value;
        this.kindCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeListValue(androidx.datastore.preferences.protobuf.ListValue value) {
        value.getClass();
        if (this.kindCase_ == 6 && this.kind_ != androidx.datastore.preferences.protobuf.ListValue.getDefaultInstance()) {
            this.kind_ = androidx.datastore.preferences.protobuf.ListValue.newBuilder((androidx.datastore.preferences.protobuf.ListValue) this.kind_).mergeFrom(value).buildPartial();
        } else {
            this.kind_ = value;
        }
        this.kindCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearListValue() {
        if (this.kindCase_ == 6) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    public static androidx.datastore.preferences.protobuf.Value parseFrom(java.nio.ByteBuffer data) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.Value) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static androidx.datastore.preferences.protobuf.Value parseFrom(java.nio.ByteBuffer data, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.Value) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.Value parseFrom(androidx.datastore.preferences.protobuf.ByteString data) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.Value) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static androidx.datastore.preferences.protobuf.Value parseFrom(androidx.datastore.preferences.protobuf.ByteString data, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.Value) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.Value parseFrom(byte[] data) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.Value) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static androidx.datastore.preferences.protobuf.Value parseFrom(byte[] data, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.Value) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.Value parseFrom(java.io.InputStream input) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.Value) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static androidx.datastore.preferences.protobuf.Value parseFrom(java.io.InputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.Value) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.Value parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.Value) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static androidx.datastore.preferences.protobuf.Value parseDelimitedFrom(java.io.InputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.Value) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.Value parseFrom(androidx.datastore.preferences.protobuf.CodedInputStream input) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.Value) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static androidx.datastore.preferences.protobuf.Value parseFrom(androidx.datastore.preferences.protobuf.CodedInputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.Value) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.Value.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static androidx.datastore.preferences.protobuf.Value.Builder newBuilder(androidx.datastore.preferences.protobuf.Value prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder<androidx.datastore.preferences.protobuf.Value, androidx.datastore.preferences.protobuf.Value.Builder> implements androidx.datastore.preferences.protobuf.ValueOrBuilder {
        /* synthetic */ Builder(androidx.datastore.preferences.protobuf.Value.AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(androidx.datastore.preferences.protobuf.Value.DEFAULT_INSTANCE);
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public androidx.datastore.preferences.protobuf.Value.KindCase getKindCase() {
            return ((androidx.datastore.preferences.protobuf.Value) this.instance).getKindCase();
        }

        public androidx.datastore.preferences.protobuf.Value.Builder clearKind() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Value) this.instance).clearKind();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public boolean hasNullValue() {
            return ((androidx.datastore.preferences.protobuf.Value) this.instance).hasNullValue();
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public int getNullValueValue() {
            return ((androidx.datastore.preferences.protobuf.Value) this.instance).getNullValueValue();
        }

        public androidx.datastore.preferences.protobuf.Value.Builder setNullValueValue(int value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Value) this.instance).setNullValueValue(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public androidx.datastore.preferences.protobuf.NullValue getNullValue() {
            return ((androidx.datastore.preferences.protobuf.Value) this.instance).getNullValue();
        }

        public androidx.datastore.preferences.protobuf.Value.Builder setNullValue(androidx.datastore.preferences.protobuf.NullValue value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Value) this.instance).setNullValue(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Value.Builder clearNullValue() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Value) this.instance).clearNullValue();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public boolean hasNumberValue() {
            return ((androidx.datastore.preferences.protobuf.Value) this.instance).hasNumberValue();
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public double getNumberValue() {
            return ((androidx.datastore.preferences.protobuf.Value) this.instance).getNumberValue();
        }

        public androidx.datastore.preferences.protobuf.Value.Builder setNumberValue(double value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Value) this.instance).setNumberValue(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Value.Builder clearNumberValue() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Value) this.instance).clearNumberValue();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public boolean hasStringValue() {
            return ((androidx.datastore.preferences.protobuf.Value) this.instance).hasStringValue();
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public java.lang.String getStringValue() {
            return ((androidx.datastore.preferences.protobuf.Value) this.instance).getStringValue();
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public androidx.datastore.preferences.protobuf.ByteString getStringValueBytes() {
            return ((androidx.datastore.preferences.protobuf.Value) this.instance).getStringValueBytes();
        }

        public androidx.datastore.preferences.protobuf.Value.Builder setStringValue(java.lang.String value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Value) this.instance).setStringValue(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Value.Builder clearStringValue() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Value) this.instance).clearStringValue();
            return this;
        }

        public androidx.datastore.preferences.protobuf.Value.Builder setStringValueBytes(androidx.datastore.preferences.protobuf.ByteString value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Value) this.instance).setStringValueBytes(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public boolean hasBoolValue() {
            return ((androidx.datastore.preferences.protobuf.Value) this.instance).hasBoolValue();
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public boolean getBoolValue() {
            return ((androidx.datastore.preferences.protobuf.Value) this.instance).getBoolValue();
        }

        public androidx.datastore.preferences.protobuf.Value.Builder setBoolValue(boolean value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Value) this.instance).setBoolValue(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Value.Builder clearBoolValue() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Value) this.instance).clearBoolValue();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public boolean hasStructValue() {
            return ((androidx.datastore.preferences.protobuf.Value) this.instance).hasStructValue();
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public androidx.datastore.preferences.protobuf.Struct getStructValue() {
            return ((androidx.datastore.preferences.protobuf.Value) this.instance).getStructValue();
        }

        public androidx.datastore.preferences.protobuf.Value.Builder setStructValue(androidx.datastore.preferences.protobuf.Struct value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Value) this.instance).setStructValue(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Value.Builder setStructValue(androidx.datastore.preferences.protobuf.Struct.Builder builderForValue) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Value) this.instance).setStructValue(builderForValue.build());
            return this;
        }

        public androidx.datastore.preferences.protobuf.Value.Builder mergeStructValue(androidx.datastore.preferences.protobuf.Struct value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Value) this.instance).mergeStructValue(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Value.Builder clearStructValue() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Value) this.instance).clearStructValue();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public boolean hasListValue() {
            return ((androidx.datastore.preferences.protobuf.Value) this.instance).hasListValue();
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public androidx.datastore.preferences.protobuf.ListValue getListValue() {
            return ((androidx.datastore.preferences.protobuf.Value) this.instance).getListValue();
        }

        public androidx.datastore.preferences.protobuf.Value.Builder setListValue(androidx.datastore.preferences.protobuf.ListValue value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Value) this.instance).setListValue(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Value.Builder setListValue(androidx.datastore.preferences.protobuf.ListValue.Builder builderForValue) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Value) this.instance).setListValue(builderForValue.build());
            return this;
        }

        public androidx.datastore.preferences.protobuf.Value.Builder mergeListValue(androidx.datastore.preferences.protobuf.ListValue value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Value) this.instance).mergeListValue(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Value.Builder clearListValue() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Value) this.instance).clearListValue();
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Value$1, reason: invalid class name */
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
        androidx.datastore.preferences.protobuf.Value.AnonymousClass1 anonymousClass1 = null;
        switch (androidx.datastore.preferences.protobuf.Value.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
            case 1:
                return new androidx.datastore.preferences.protobuf.Value();
            case 2:
                return new androidx.datastore.preferences.protobuf.Value.Builder(anonymousClass1);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new java.lang.Object[]{"kind_", "kindCase_", androidx.datastore.preferences.protobuf.Struct.class, androidx.datastore.preferences.protobuf.ListValue.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.protobuf.Value> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (androidx.datastore.preferences.protobuf.Value.class) {
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
        androidx.datastore.preferences.protobuf.Value value = new androidx.datastore.preferences.protobuf.Value();
        DEFAULT_INSTANCE = value;
        androidx.datastore.preferences.protobuf.GeneratedMessageLite.registerDefaultInstance(androidx.datastore.preferences.protobuf.Value.class, value);
    }

    public static androidx.datastore.preferences.protobuf.Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.protobuf.Value> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
