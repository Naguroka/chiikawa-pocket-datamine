package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
public final class Struct extends com.google.protobuf.GeneratedMessageLite<com.google.protobuf.Struct, com.google.protobuf.Struct.Builder> implements com.google.protobuf.StructOrBuilder {
    private static final com.google.protobuf.Struct DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.Parser<com.google.protobuf.Struct> PARSER;
    private com.google.protobuf.MapFieldLite<java.lang.String, com.google.protobuf.Value> fields_ = com.google.protobuf.MapFieldLite.emptyMapField();

    private Struct() {
    }

    private static final class FieldsDefaultEntryHolder {
        static final com.google.protobuf.MapEntryLite<java.lang.String, com.google.protobuf.Value> defaultEntry = com.google.protobuf.MapEntryLite.newDefaultInstance(com.google.protobuf.WireFormat.FieldType.STRING, "", com.google.protobuf.WireFormat.FieldType.MESSAGE, com.google.protobuf.Value.getDefaultInstance());

        private FieldsDefaultEntryHolder() {
        }
    }

    private com.google.protobuf.MapFieldLite<java.lang.String, com.google.protobuf.Value> internalGetFields() {
        return this.fields_;
    }

    private com.google.protobuf.MapFieldLite<java.lang.String, com.google.protobuf.Value> internalGetMutableFields() {
        if (!this.fields_.isMutable()) {
            this.fields_ = this.fields_.mutableCopy();
        }
        return this.fields_;
    }

    @Override // com.google.protobuf.StructOrBuilder
    public int getFieldsCount() {
        return internalGetFields().size();
    }

    @Override // com.google.protobuf.StructOrBuilder
    public boolean containsFields(java.lang.String str) {
        str.getClass();
        return internalGetFields().containsKey(str);
    }

    @Override // com.google.protobuf.StructOrBuilder
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.protobuf.Value> getFields() {
        return getFieldsMap();
    }

    @Override // com.google.protobuf.StructOrBuilder
    public java.util.Map<java.lang.String, com.google.protobuf.Value> getFieldsMap() {
        return java.util.Collections.unmodifiableMap(internalGetFields());
    }

    @Override // com.google.protobuf.StructOrBuilder
    public com.google.protobuf.Value getFieldsOrDefault(java.lang.String str, com.google.protobuf.Value value) {
        str.getClass();
        com.google.protobuf.MapFieldLite<java.lang.String, com.google.protobuf.Value> mapFieldLiteInternalGetFields = internalGetFields();
        return mapFieldLiteInternalGetFields.containsKey(str) ? mapFieldLiteInternalGetFields.get(str) : value;
    }

    @Override // com.google.protobuf.StructOrBuilder
    public com.google.protobuf.Value getFieldsOrThrow(java.lang.String str) {
        str.getClass();
        com.google.protobuf.MapFieldLite<java.lang.String, com.google.protobuf.Value> mapFieldLiteInternalGetFields = internalGetFields();
        if (!mapFieldLiteInternalGetFields.containsKey(str)) {
            throw new java.lang.IllegalArgumentException();
        }
        return mapFieldLiteInternalGetFields.get(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.util.Map<java.lang.String, com.google.protobuf.Value> getMutableFieldsMap() {
        return internalGetMutableFields();
    }

    public static com.google.protobuf.Struct parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Struct) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Struct parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Struct) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.google.protobuf.Struct parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Struct) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.google.protobuf.Struct parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Struct) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.google.protobuf.Struct parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Struct) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.google.protobuf.Struct parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Struct) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.google.protobuf.Struct parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.protobuf.Struct) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.protobuf.Struct parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.protobuf.Struct) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.protobuf.Struct parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.protobuf.Struct) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.protobuf.Struct parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.protobuf.Struct) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.protobuf.Struct parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        return (com.google.protobuf.Struct) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.google.protobuf.Struct parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.protobuf.Struct) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.google.protobuf.Struct.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.google.protobuf.Struct.Builder newBuilder(com.google.protobuf.Struct struct) {
        return DEFAULT_INSTANCE.createBuilder(struct);
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.google.protobuf.Struct, com.google.protobuf.Struct.Builder> implements com.google.protobuf.StructOrBuilder {
        /* synthetic */ Builder(com.google.protobuf.Struct.AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(com.google.protobuf.Struct.DEFAULT_INSTANCE);
        }

        @Override // com.google.protobuf.StructOrBuilder
        public int getFieldsCount() {
            return ((com.google.protobuf.Struct) this.instance).getFieldsMap().size();
        }

        @Override // com.google.protobuf.StructOrBuilder
        public boolean containsFields(java.lang.String str) {
            str.getClass();
            return ((com.google.protobuf.Struct) this.instance).getFieldsMap().containsKey(str);
        }

        public com.google.protobuf.Struct.Builder clearFields() {
            copyOnWrite();
            ((com.google.protobuf.Struct) this.instance).getMutableFieldsMap().clear();
            return this;
        }

        public com.google.protobuf.Struct.Builder removeFields(java.lang.String str) {
            str.getClass();
            copyOnWrite();
            ((com.google.protobuf.Struct) this.instance).getMutableFieldsMap().remove(str);
            return this;
        }

        @Override // com.google.protobuf.StructOrBuilder
        @java.lang.Deprecated
        public java.util.Map<java.lang.String, com.google.protobuf.Value> getFields() {
            return getFieldsMap();
        }

        @Override // com.google.protobuf.StructOrBuilder
        public java.util.Map<java.lang.String, com.google.protobuf.Value> getFieldsMap() {
            return java.util.Collections.unmodifiableMap(((com.google.protobuf.Struct) this.instance).getFieldsMap());
        }

        @Override // com.google.protobuf.StructOrBuilder
        public com.google.protobuf.Value getFieldsOrDefault(java.lang.String str, com.google.protobuf.Value value) {
            str.getClass();
            java.util.Map<java.lang.String, com.google.protobuf.Value> fieldsMap = ((com.google.protobuf.Struct) this.instance).getFieldsMap();
            return fieldsMap.containsKey(str) ? fieldsMap.get(str) : value;
        }

        @Override // com.google.protobuf.StructOrBuilder
        public com.google.protobuf.Value getFieldsOrThrow(java.lang.String str) {
            str.getClass();
            java.util.Map<java.lang.String, com.google.protobuf.Value> fieldsMap = ((com.google.protobuf.Struct) this.instance).getFieldsMap();
            if (!fieldsMap.containsKey(str)) {
                throw new java.lang.IllegalArgumentException();
            }
            return fieldsMap.get(str);
        }

        public com.google.protobuf.Struct.Builder putFields(java.lang.String str, com.google.protobuf.Value value) {
            str.getClass();
            value.getClass();
            copyOnWrite();
            ((com.google.protobuf.Struct) this.instance).getMutableFieldsMap().put(str, value);
            return this;
        }

        public com.google.protobuf.Struct.Builder putAllFields(java.util.Map<java.lang.String, com.google.protobuf.Value> map) {
            copyOnWrite();
            ((com.google.protobuf.Struct) this.instance).getMutableFieldsMap().putAll(map);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.Struct$1, reason: invalid class name */
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
        com.google.protobuf.Struct.AnonymousClass1 anonymousClass1 = null;
        switch (com.google.protobuf.Struct.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new com.google.protobuf.Struct();
            case 2:
                return new com.google.protobuf.Struct.Builder(anonymousClass1);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new java.lang.Object[]{"fields_", com.google.protobuf.Struct.FieldsDefaultEntryHolder.defaultEntry});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.google.protobuf.Struct> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (com.google.protobuf.Struct.class) {
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
        com.google.protobuf.Struct struct = new com.google.protobuf.Struct();
        DEFAULT_INSTANCE = struct;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.google.protobuf.Struct.class, struct);
    }

    public static com.google.protobuf.Struct getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.protobuf.Parser<com.google.protobuf.Struct> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
