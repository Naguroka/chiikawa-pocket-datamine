package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class Struct extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<androidx.datastore.preferences.protobuf.Struct, androidx.datastore.preferences.protobuf.Struct.Builder> implements androidx.datastore.preferences.protobuf.StructOrBuilder {
    private static final androidx.datastore.preferences.protobuf.Struct DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.protobuf.Struct> PARSER;
    private androidx.datastore.preferences.protobuf.MapFieldLite<java.lang.String, androidx.datastore.preferences.protobuf.Value> fields_ = androidx.datastore.preferences.protobuf.MapFieldLite.emptyMapField();

    private Struct() {
    }

    private static final class FieldsDefaultEntryHolder {
        static final androidx.datastore.preferences.protobuf.MapEntryLite<java.lang.String, androidx.datastore.preferences.protobuf.Value> defaultEntry = androidx.datastore.preferences.protobuf.MapEntryLite.newDefaultInstance(androidx.datastore.preferences.protobuf.WireFormat.FieldType.STRING, "", androidx.datastore.preferences.protobuf.WireFormat.FieldType.MESSAGE, androidx.datastore.preferences.protobuf.Value.getDefaultInstance());

        private FieldsDefaultEntryHolder() {
        }
    }

    private androidx.datastore.preferences.protobuf.MapFieldLite<java.lang.String, androidx.datastore.preferences.protobuf.Value> internalGetFields() {
        return this.fields_;
    }

    private androidx.datastore.preferences.protobuf.MapFieldLite<java.lang.String, androidx.datastore.preferences.protobuf.Value> internalGetMutableFields() {
        if (!this.fields_.isMutable()) {
            this.fields_ = this.fields_.mutableCopy();
        }
        return this.fields_;
    }

    @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
    public int getFieldsCount() {
        return internalGetFields().size();
    }

    @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
    public boolean containsFields(java.lang.String key) {
        key.getClass();
        return internalGetFields().containsKey(key);
    }

    @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, androidx.datastore.preferences.protobuf.Value> getFields() {
        return getFieldsMap();
    }

    @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
    public java.util.Map<java.lang.String, androidx.datastore.preferences.protobuf.Value> getFieldsMap() {
        return java.util.Collections.unmodifiableMap(internalGetFields());
    }

    @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
    public androidx.datastore.preferences.protobuf.Value getFieldsOrDefault(java.lang.String key, androidx.datastore.preferences.protobuf.Value defaultValue) {
        key.getClass();
        androidx.datastore.preferences.protobuf.MapFieldLite<java.lang.String, androidx.datastore.preferences.protobuf.Value> mapFieldLiteInternalGetFields = internalGetFields();
        return mapFieldLiteInternalGetFields.containsKey(key) ? mapFieldLiteInternalGetFields.get(key) : defaultValue;
    }

    @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
    public androidx.datastore.preferences.protobuf.Value getFieldsOrThrow(java.lang.String key) {
        key.getClass();
        androidx.datastore.preferences.protobuf.MapFieldLite<java.lang.String, androidx.datastore.preferences.protobuf.Value> mapFieldLiteInternalGetFields = internalGetFields();
        if (!mapFieldLiteInternalGetFields.containsKey(key)) {
            throw new java.lang.IllegalArgumentException();
        }
        return mapFieldLiteInternalGetFields.get(key);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.util.Map<java.lang.String, androidx.datastore.preferences.protobuf.Value> getMutableFieldsMap() {
        return internalGetMutableFields();
    }

    public static androidx.datastore.preferences.protobuf.Struct parseFrom(java.nio.ByteBuffer data) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.Struct) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static androidx.datastore.preferences.protobuf.Struct parseFrom(java.nio.ByteBuffer data, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.Struct) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.Struct parseFrom(androidx.datastore.preferences.protobuf.ByteString data) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.Struct) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static androidx.datastore.preferences.protobuf.Struct parseFrom(androidx.datastore.preferences.protobuf.ByteString data, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.Struct) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.Struct parseFrom(byte[] data) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.Struct) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static androidx.datastore.preferences.protobuf.Struct parseFrom(byte[] data, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.Struct) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.Struct parseFrom(java.io.InputStream input) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.Struct) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static androidx.datastore.preferences.protobuf.Struct parseFrom(java.io.InputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.Struct) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.Struct parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.Struct) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static androidx.datastore.preferences.protobuf.Struct parseDelimitedFrom(java.io.InputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.Struct) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.Struct parseFrom(androidx.datastore.preferences.protobuf.CodedInputStream input) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.Struct) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static androidx.datastore.preferences.protobuf.Struct parseFrom(androidx.datastore.preferences.protobuf.CodedInputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.Struct) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.Struct.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static androidx.datastore.preferences.protobuf.Struct.Builder newBuilder(androidx.datastore.preferences.protobuf.Struct prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder<androidx.datastore.preferences.protobuf.Struct, androidx.datastore.preferences.protobuf.Struct.Builder> implements androidx.datastore.preferences.protobuf.StructOrBuilder {
        /* synthetic */ Builder(androidx.datastore.preferences.protobuf.Struct.AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(androidx.datastore.preferences.protobuf.Struct.DEFAULT_INSTANCE);
        }

        @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
        public int getFieldsCount() {
            return ((androidx.datastore.preferences.protobuf.Struct) this.instance).getFieldsMap().size();
        }

        @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
        public boolean containsFields(java.lang.String key) {
            key.getClass();
            return ((androidx.datastore.preferences.protobuf.Struct) this.instance).getFieldsMap().containsKey(key);
        }

        public androidx.datastore.preferences.protobuf.Struct.Builder clearFields() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Struct) this.instance).getMutableFieldsMap().clear();
            return this;
        }

        public androidx.datastore.preferences.protobuf.Struct.Builder removeFields(java.lang.String key) {
            key.getClass();
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Struct) this.instance).getMutableFieldsMap().remove(key);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
        @java.lang.Deprecated
        public java.util.Map<java.lang.String, androidx.datastore.preferences.protobuf.Value> getFields() {
            return getFieldsMap();
        }

        @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
        public java.util.Map<java.lang.String, androidx.datastore.preferences.protobuf.Value> getFieldsMap() {
            return java.util.Collections.unmodifiableMap(((androidx.datastore.preferences.protobuf.Struct) this.instance).getFieldsMap());
        }

        @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
        public androidx.datastore.preferences.protobuf.Value getFieldsOrDefault(java.lang.String key, androidx.datastore.preferences.protobuf.Value defaultValue) {
            key.getClass();
            java.util.Map<java.lang.String, androidx.datastore.preferences.protobuf.Value> fieldsMap = ((androidx.datastore.preferences.protobuf.Struct) this.instance).getFieldsMap();
            return fieldsMap.containsKey(key) ? fieldsMap.get(key) : defaultValue;
        }

        @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
        public androidx.datastore.preferences.protobuf.Value getFieldsOrThrow(java.lang.String key) {
            key.getClass();
            java.util.Map<java.lang.String, androidx.datastore.preferences.protobuf.Value> fieldsMap = ((androidx.datastore.preferences.protobuf.Struct) this.instance).getFieldsMap();
            if (!fieldsMap.containsKey(key)) {
                throw new java.lang.IllegalArgumentException();
            }
            return fieldsMap.get(key);
        }

        public androidx.datastore.preferences.protobuf.Struct.Builder putFields(java.lang.String key, androidx.datastore.preferences.protobuf.Value value) {
            key.getClass();
            value.getClass();
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Struct) this.instance).getMutableFieldsMap().put(key, value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Struct.Builder putAllFields(java.util.Map<java.lang.String, androidx.datastore.preferences.protobuf.Value> values) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Struct) this.instance).getMutableFieldsMap().putAll(values);
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Struct$1, reason: invalid class name */
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
        androidx.datastore.preferences.protobuf.Struct.AnonymousClass1 anonymousClass1 = null;
        switch (androidx.datastore.preferences.protobuf.Struct.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
            case 1:
                return new androidx.datastore.preferences.protobuf.Struct();
            case 2:
                return new androidx.datastore.preferences.protobuf.Struct.Builder(anonymousClass1);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new java.lang.Object[]{"fields_", androidx.datastore.preferences.protobuf.Struct.FieldsDefaultEntryHolder.defaultEntry});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.protobuf.Struct> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (androidx.datastore.preferences.protobuf.Struct.class) {
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
        androidx.datastore.preferences.protobuf.Struct struct = new androidx.datastore.preferences.protobuf.Struct();
        DEFAULT_INSTANCE = struct;
        androidx.datastore.preferences.protobuf.GeneratedMessageLite.registerDefaultInstance(androidx.datastore.preferences.protobuf.Struct.class, struct);
    }

    public static androidx.datastore.preferences.protobuf.Struct getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.protobuf.Struct> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
