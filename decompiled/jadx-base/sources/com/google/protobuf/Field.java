package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
public final class Field extends com.google.protobuf.GeneratedMessageLite<com.google.protobuf.Field, com.google.protobuf.Field.Builder> implements com.google.protobuf.FieldOrBuilder {
    public static final int CARDINALITY_FIELD_NUMBER = 2;
    private static final com.google.protobuf.Field DEFAULT_INSTANCE;
    public static final int DEFAULT_VALUE_FIELD_NUMBER = 11;
    public static final int JSON_NAME_FIELD_NUMBER = 10;
    public static final int KIND_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int NUMBER_FIELD_NUMBER = 3;
    public static final int ONEOF_INDEX_FIELD_NUMBER = 7;
    public static final int OPTIONS_FIELD_NUMBER = 9;
    public static final int PACKED_FIELD_NUMBER = 8;
    private static volatile com.google.protobuf.Parser<com.google.protobuf.Field> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 6;
    private int cardinality_;
    private int kind_;
    private int number_;
    private int oneofIndex_;
    private boolean packed_;
    private java.lang.String name_ = "";
    private java.lang.String typeUrl_ = "";
    private com.google.protobuf.Internal.ProtobufList<com.google.protobuf.Option> options_ = emptyProtobufList();
    private java.lang.String jsonName_ = "";
    private java.lang.String defaultValue_ = "";

    private Field() {
    }

    public enum Kind implements com.google.protobuf.Internal.EnumLite {
        TYPE_UNKNOWN(0),
        TYPE_DOUBLE(1),
        TYPE_FLOAT(2),
        TYPE_INT64(3),
        TYPE_UINT64(4),
        TYPE_INT32(5),
        TYPE_FIXED64(6),
        TYPE_FIXED32(7),
        TYPE_BOOL(8),
        TYPE_STRING(9),
        TYPE_GROUP(10),
        TYPE_MESSAGE(11),
        TYPE_BYTES(12),
        TYPE_UINT32(13),
        TYPE_ENUM(14),
        TYPE_SFIXED32(15),
        TYPE_SFIXED64(16),
        TYPE_SINT32(17),
        TYPE_SINT64(18),
        UNRECOGNIZED(-1);

        public static final int TYPE_BOOL_VALUE = 8;
        public static final int TYPE_BYTES_VALUE = 12;
        public static final int TYPE_DOUBLE_VALUE = 1;
        public static final int TYPE_ENUM_VALUE = 14;
        public static final int TYPE_FIXED32_VALUE = 7;
        public static final int TYPE_FIXED64_VALUE = 6;
        public static final int TYPE_FLOAT_VALUE = 2;
        public static final int TYPE_GROUP_VALUE = 10;
        public static final int TYPE_INT32_VALUE = 5;
        public static final int TYPE_INT64_VALUE = 3;
        public static final int TYPE_MESSAGE_VALUE = 11;
        public static final int TYPE_SFIXED32_VALUE = 15;
        public static final int TYPE_SFIXED64_VALUE = 16;
        public static final int TYPE_SINT32_VALUE = 17;
        public static final int TYPE_SINT64_VALUE = 18;
        public static final int TYPE_STRING_VALUE = 9;
        public static final int TYPE_UINT32_VALUE = 13;
        public static final int TYPE_UINT64_VALUE = 4;
        public static final int TYPE_UNKNOWN_VALUE = 0;
        private static final com.google.protobuf.Internal.EnumLiteMap<com.google.protobuf.Field.Kind> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<com.google.protobuf.Field.Kind>() { // from class: com.google.protobuf.Field.Kind.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public com.google.protobuf.Field.Kind findValueByNumber(int i) {
                return com.google.protobuf.Field.Kind.forNumber(i);
            }
        };
        private final int value;

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @java.lang.Deprecated
        public static com.google.protobuf.Field.Kind valueOf(int i) {
            return forNumber(i);
        }

        public static com.google.protobuf.Field.Kind forNumber(int i) {
            switch (i) {
                case 0:
                    return TYPE_UNKNOWN;
                case 1:
                    return TYPE_DOUBLE;
                case 2:
                    return TYPE_FLOAT;
                case 3:
                    return TYPE_INT64;
                case 4:
                    return TYPE_UINT64;
                case 5:
                    return TYPE_INT32;
                case 6:
                    return TYPE_FIXED64;
                case 7:
                    return TYPE_FIXED32;
                case 8:
                    return TYPE_BOOL;
                case 9:
                    return TYPE_STRING;
                case 10:
                    return TYPE_GROUP;
                case 11:
                    return TYPE_MESSAGE;
                case 12:
                    return TYPE_BYTES;
                case 13:
                    return TYPE_UINT32;
                case 14:
                    return TYPE_ENUM;
                case 15:
                    return TYPE_SFIXED32;
                case 16:
                    return TYPE_SFIXED64;
                case 17:
                    return TYPE_SINT32;
                case 18:
                    return TYPE_SINT64;
                default:
                    return null;
            }
        }

        public static com.google.protobuf.Internal.EnumLiteMap<com.google.protobuf.Field.Kind> internalGetValueMap() {
            return internalValueMap;
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return com.google.protobuf.Field.Kind.KindVerifier.INSTANCE;
        }

        private static final class KindVerifier implements com.google.protobuf.Internal.EnumVerifier {
            static final com.google.protobuf.Internal.EnumVerifier INSTANCE = new com.google.protobuf.Field.Kind.KindVerifier();

            private KindVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return com.google.protobuf.Field.Kind.forNumber(i) != null;
            }
        }

        Kind(int i) {
            this.value = i;
        }
    }

    public enum Cardinality implements com.google.protobuf.Internal.EnumLite {
        CARDINALITY_UNKNOWN(0),
        CARDINALITY_OPTIONAL(1),
        CARDINALITY_REQUIRED(2),
        CARDINALITY_REPEATED(3),
        UNRECOGNIZED(-1);

        public static final int CARDINALITY_OPTIONAL_VALUE = 1;
        public static final int CARDINALITY_REPEATED_VALUE = 3;
        public static final int CARDINALITY_REQUIRED_VALUE = 2;
        public static final int CARDINALITY_UNKNOWN_VALUE = 0;
        private static final com.google.protobuf.Internal.EnumLiteMap<com.google.protobuf.Field.Cardinality> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<com.google.protobuf.Field.Cardinality>() { // from class: com.google.protobuf.Field.Cardinality.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public com.google.protobuf.Field.Cardinality findValueByNumber(int i) {
                return com.google.protobuf.Field.Cardinality.forNumber(i);
            }
        };
        private final int value;

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @java.lang.Deprecated
        public static com.google.protobuf.Field.Cardinality valueOf(int i) {
            return forNumber(i);
        }

        public static com.google.protobuf.Field.Cardinality forNumber(int i) {
            if (i == 0) {
                return CARDINALITY_UNKNOWN;
            }
            if (i == 1) {
                return CARDINALITY_OPTIONAL;
            }
            if (i == 2) {
                return CARDINALITY_REQUIRED;
            }
            if (i != 3) {
                return null;
            }
            return CARDINALITY_REPEATED;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<com.google.protobuf.Field.Cardinality> internalGetValueMap() {
            return internalValueMap;
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return com.google.protobuf.Field.Cardinality.CardinalityVerifier.INSTANCE;
        }

        private static final class CardinalityVerifier implements com.google.protobuf.Internal.EnumVerifier {
            static final com.google.protobuf.Internal.EnumVerifier INSTANCE = new com.google.protobuf.Field.Cardinality.CardinalityVerifier();

            private CardinalityVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return com.google.protobuf.Field.Cardinality.forNumber(i) != null;
            }
        }

        Cardinality(int i) {
            this.value = i;
        }
    }

    @Override // com.google.protobuf.FieldOrBuilder
    public int getKindValue() {
        return this.kind_;
    }

    @Override // com.google.protobuf.FieldOrBuilder
    public com.google.protobuf.Field.Kind getKind() {
        com.google.protobuf.Field.Kind kindForNumber = com.google.protobuf.Field.Kind.forNumber(this.kind_);
        return kindForNumber == null ? com.google.protobuf.Field.Kind.UNRECOGNIZED : kindForNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKindValue(int i) {
        this.kind_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKind(com.google.protobuf.Field.Kind kind) {
        this.kind_ = kind.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKind() {
        this.kind_ = 0;
    }

    @Override // com.google.protobuf.FieldOrBuilder
    public int getCardinalityValue() {
        return this.cardinality_;
    }

    @Override // com.google.protobuf.FieldOrBuilder
    public com.google.protobuf.Field.Cardinality getCardinality() {
        com.google.protobuf.Field.Cardinality cardinalityForNumber = com.google.protobuf.Field.Cardinality.forNumber(this.cardinality_);
        return cardinalityForNumber == null ? com.google.protobuf.Field.Cardinality.UNRECOGNIZED : cardinalityForNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardinalityValue(int i) {
        this.cardinality_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardinality(com.google.protobuf.Field.Cardinality cardinality) {
        this.cardinality_ = cardinality.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCardinality() {
        this.cardinality_ = 0;
    }

    @Override // com.google.protobuf.FieldOrBuilder
    public int getNumber() {
        return this.number_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumber(int i) {
        this.number_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumber() {
        this.number_ = 0;
    }

    @Override // com.google.protobuf.FieldOrBuilder
    public java.lang.String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.FieldOrBuilder
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

    @Override // com.google.protobuf.FieldOrBuilder
    public java.lang.String getTypeUrl() {
        return this.typeUrl_;
    }

    @Override // com.google.protobuf.FieldOrBuilder
    public com.google.protobuf.ByteString getTypeUrlBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.typeUrl_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeUrl(java.lang.String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypeUrl() {
        this.typeUrl_ = getDefaultInstance().getTypeUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeUrlBytes(com.google.protobuf.ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        this.typeUrl_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.FieldOrBuilder
    public int getOneofIndex() {
        return this.oneofIndex_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOneofIndex(int i) {
        this.oneofIndex_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOneofIndex() {
        this.oneofIndex_ = 0;
    }

    @Override // com.google.protobuf.FieldOrBuilder
    public boolean getPacked() {
        return this.packed_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPacked(boolean z) {
        this.packed_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPacked() {
        this.packed_ = false;
    }

    @Override // com.google.protobuf.FieldOrBuilder
    public java.util.List<com.google.protobuf.Option> getOptionsList() {
        return this.options_;
    }

    public java.util.List<? extends com.google.protobuf.OptionOrBuilder> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // com.google.protobuf.FieldOrBuilder
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.protobuf.FieldOrBuilder
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

    @Override // com.google.protobuf.FieldOrBuilder
    public java.lang.String getJsonName() {
        return this.jsonName_;
    }

    @Override // com.google.protobuf.FieldOrBuilder
    public com.google.protobuf.ByteString getJsonNameBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.jsonName_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJsonName(java.lang.String str) {
        str.getClass();
        this.jsonName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJsonName() {
        this.jsonName_ = getDefaultInstance().getJsonName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJsonNameBytes(com.google.protobuf.ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        this.jsonName_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.FieldOrBuilder
    public java.lang.String getDefaultValue() {
        return this.defaultValue_;
    }

    @Override // com.google.protobuf.FieldOrBuilder
    public com.google.protobuf.ByteString getDefaultValueBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.defaultValue_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultValue(java.lang.String str) {
        str.getClass();
        this.defaultValue_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDefaultValue() {
        this.defaultValue_ = getDefaultInstance().getDefaultValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultValueBytes(com.google.protobuf.ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        this.defaultValue_ = byteString.toStringUtf8();
    }

    public static com.google.protobuf.Field parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Field) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Field parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Field) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.google.protobuf.Field parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Field) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.google.protobuf.Field parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Field) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.google.protobuf.Field parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Field) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.google.protobuf.Field parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Field) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.google.protobuf.Field parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.protobuf.Field) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.protobuf.Field parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.protobuf.Field) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.protobuf.Field parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.protobuf.Field) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.protobuf.Field parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.protobuf.Field) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.protobuf.Field parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        return (com.google.protobuf.Field) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.google.protobuf.Field parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.protobuf.Field) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.google.protobuf.Field.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.google.protobuf.Field.Builder newBuilder(com.google.protobuf.Field field) {
        return DEFAULT_INSTANCE.createBuilder(field);
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.google.protobuf.Field, com.google.protobuf.Field.Builder> implements com.google.protobuf.FieldOrBuilder {
        /* synthetic */ Builder(com.google.protobuf.Field.AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(com.google.protobuf.Field.DEFAULT_INSTANCE);
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public int getKindValue() {
            return ((com.google.protobuf.Field) this.instance).getKindValue();
        }

        public com.google.protobuf.Field.Builder setKindValue(int i) {
            copyOnWrite();
            ((com.google.protobuf.Field) this.instance).setKindValue(i);
            return this;
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public com.google.protobuf.Field.Kind getKind() {
            return ((com.google.protobuf.Field) this.instance).getKind();
        }

        public com.google.protobuf.Field.Builder setKind(com.google.protobuf.Field.Kind kind) {
            copyOnWrite();
            ((com.google.protobuf.Field) this.instance).setKind(kind);
            return this;
        }

        public com.google.protobuf.Field.Builder clearKind() {
            copyOnWrite();
            ((com.google.protobuf.Field) this.instance).clearKind();
            return this;
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public int getCardinalityValue() {
            return ((com.google.protobuf.Field) this.instance).getCardinalityValue();
        }

        public com.google.protobuf.Field.Builder setCardinalityValue(int i) {
            copyOnWrite();
            ((com.google.protobuf.Field) this.instance).setCardinalityValue(i);
            return this;
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public com.google.protobuf.Field.Cardinality getCardinality() {
            return ((com.google.protobuf.Field) this.instance).getCardinality();
        }

        public com.google.protobuf.Field.Builder setCardinality(com.google.protobuf.Field.Cardinality cardinality) {
            copyOnWrite();
            ((com.google.protobuf.Field) this.instance).setCardinality(cardinality);
            return this;
        }

        public com.google.protobuf.Field.Builder clearCardinality() {
            copyOnWrite();
            ((com.google.protobuf.Field) this.instance).clearCardinality();
            return this;
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public int getNumber() {
            return ((com.google.protobuf.Field) this.instance).getNumber();
        }

        public com.google.protobuf.Field.Builder setNumber(int i) {
            copyOnWrite();
            ((com.google.protobuf.Field) this.instance).setNumber(i);
            return this;
        }

        public com.google.protobuf.Field.Builder clearNumber() {
            copyOnWrite();
            ((com.google.protobuf.Field) this.instance).clearNumber();
            return this;
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public java.lang.String getName() {
            return ((com.google.protobuf.Field) this.instance).getName();
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public com.google.protobuf.ByteString getNameBytes() {
            return ((com.google.protobuf.Field) this.instance).getNameBytes();
        }

        public com.google.protobuf.Field.Builder setName(java.lang.String str) {
            copyOnWrite();
            ((com.google.protobuf.Field) this.instance).setName(str);
            return this;
        }

        public com.google.protobuf.Field.Builder clearName() {
            copyOnWrite();
            ((com.google.protobuf.Field) this.instance).clearName();
            return this;
        }

        public com.google.protobuf.Field.Builder setNameBytes(com.google.protobuf.ByteString byteString) {
            copyOnWrite();
            ((com.google.protobuf.Field) this.instance).setNameBytes(byteString);
            return this;
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public java.lang.String getTypeUrl() {
            return ((com.google.protobuf.Field) this.instance).getTypeUrl();
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public com.google.protobuf.ByteString getTypeUrlBytes() {
            return ((com.google.protobuf.Field) this.instance).getTypeUrlBytes();
        }

        public com.google.protobuf.Field.Builder setTypeUrl(java.lang.String str) {
            copyOnWrite();
            ((com.google.protobuf.Field) this.instance).setTypeUrl(str);
            return this;
        }

        public com.google.protobuf.Field.Builder clearTypeUrl() {
            copyOnWrite();
            ((com.google.protobuf.Field) this.instance).clearTypeUrl();
            return this;
        }

        public com.google.protobuf.Field.Builder setTypeUrlBytes(com.google.protobuf.ByteString byteString) {
            copyOnWrite();
            ((com.google.protobuf.Field) this.instance).setTypeUrlBytes(byteString);
            return this;
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public int getOneofIndex() {
            return ((com.google.protobuf.Field) this.instance).getOneofIndex();
        }

        public com.google.protobuf.Field.Builder setOneofIndex(int i) {
            copyOnWrite();
            ((com.google.protobuf.Field) this.instance).setOneofIndex(i);
            return this;
        }

        public com.google.protobuf.Field.Builder clearOneofIndex() {
            copyOnWrite();
            ((com.google.protobuf.Field) this.instance).clearOneofIndex();
            return this;
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public boolean getPacked() {
            return ((com.google.protobuf.Field) this.instance).getPacked();
        }

        public com.google.protobuf.Field.Builder setPacked(boolean z) {
            copyOnWrite();
            ((com.google.protobuf.Field) this.instance).setPacked(z);
            return this;
        }

        public com.google.protobuf.Field.Builder clearPacked() {
            copyOnWrite();
            ((com.google.protobuf.Field) this.instance).clearPacked();
            return this;
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public java.util.List<com.google.protobuf.Option> getOptionsList() {
            return java.util.Collections.unmodifiableList(((com.google.protobuf.Field) this.instance).getOptionsList());
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public int getOptionsCount() {
            return ((com.google.protobuf.Field) this.instance).getOptionsCount();
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public com.google.protobuf.Option getOptions(int i) {
            return ((com.google.protobuf.Field) this.instance).getOptions(i);
        }

        public com.google.protobuf.Field.Builder setOptions(int i, com.google.protobuf.Option option) {
            copyOnWrite();
            ((com.google.protobuf.Field) this.instance).setOptions(i, option);
            return this;
        }

        public com.google.protobuf.Field.Builder setOptions(int i, com.google.protobuf.Option.Builder builder) {
            copyOnWrite();
            ((com.google.protobuf.Field) this.instance).setOptions(i, builder.build());
            return this;
        }

        public com.google.protobuf.Field.Builder addOptions(com.google.protobuf.Option option) {
            copyOnWrite();
            ((com.google.protobuf.Field) this.instance).addOptions(option);
            return this;
        }

        public com.google.protobuf.Field.Builder addOptions(int i, com.google.protobuf.Option option) {
            copyOnWrite();
            ((com.google.protobuf.Field) this.instance).addOptions(i, option);
            return this;
        }

        public com.google.protobuf.Field.Builder addOptions(com.google.protobuf.Option.Builder builder) {
            copyOnWrite();
            ((com.google.protobuf.Field) this.instance).addOptions(builder.build());
            return this;
        }

        public com.google.protobuf.Field.Builder addOptions(int i, com.google.protobuf.Option.Builder builder) {
            copyOnWrite();
            ((com.google.protobuf.Field) this.instance).addOptions(i, builder.build());
            return this;
        }

        public com.google.protobuf.Field.Builder addAllOptions(java.lang.Iterable<? extends com.google.protobuf.Option> iterable) {
            copyOnWrite();
            ((com.google.protobuf.Field) this.instance).addAllOptions(iterable);
            return this;
        }

        public com.google.protobuf.Field.Builder clearOptions() {
            copyOnWrite();
            ((com.google.protobuf.Field) this.instance).clearOptions();
            return this;
        }

        public com.google.protobuf.Field.Builder removeOptions(int i) {
            copyOnWrite();
            ((com.google.protobuf.Field) this.instance).removeOptions(i);
            return this;
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public java.lang.String getJsonName() {
            return ((com.google.protobuf.Field) this.instance).getJsonName();
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public com.google.protobuf.ByteString getJsonNameBytes() {
            return ((com.google.protobuf.Field) this.instance).getJsonNameBytes();
        }

        public com.google.protobuf.Field.Builder setJsonName(java.lang.String str) {
            copyOnWrite();
            ((com.google.protobuf.Field) this.instance).setJsonName(str);
            return this;
        }

        public com.google.protobuf.Field.Builder clearJsonName() {
            copyOnWrite();
            ((com.google.protobuf.Field) this.instance).clearJsonName();
            return this;
        }

        public com.google.protobuf.Field.Builder setJsonNameBytes(com.google.protobuf.ByteString byteString) {
            copyOnWrite();
            ((com.google.protobuf.Field) this.instance).setJsonNameBytes(byteString);
            return this;
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public java.lang.String getDefaultValue() {
            return ((com.google.protobuf.Field) this.instance).getDefaultValue();
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public com.google.protobuf.ByteString getDefaultValueBytes() {
            return ((com.google.protobuf.Field) this.instance).getDefaultValueBytes();
        }

        public com.google.protobuf.Field.Builder setDefaultValue(java.lang.String str) {
            copyOnWrite();
            ((com.google.protobuf.Field) this.instance).setDefaultValue(str);
            return this;
        }

        public com.google.protobuf.Field.Builder clearDefaultValue() {
            copyOnWrite();
            ((com.google.protobuf.Field) this.instance).clearDefaultValue();
            return this;
        }

        public com.google.protobuf.Field.Builder setDefaultValueBytes(com.google.protobuf.ByteString byteString) {
            copyOnWrite();
            ((com.google.protobuf.Field) this.instance).setDefaultValueBytes(byteString);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.Field$1, reason: invalid class name */
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
        com.google.protobuf.Field.AnonymousClass1 anonymousClass1 = null;
        switch (com.google.protobuf.Field.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new com.google.protobuf.Field();
            case 2:
                return new com.google.protobuf.Field.Builder(anonymousClass1);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\u000b\n\u0000\u0001\u0000\u0001\f\u0002\f\u0003\u0004\u0004Ȉ\u0006Ȉ\u0007\u0004\b\u0007\t\u001b\nȈ\u000bȈ", new java.lang.Object[]{"kind_", "cardinality_", "number_", "name_", "typeUrl_", "oneofIndex_", "packed_", "options_", com.google.protobuf.Option.class, "jsonName_", "defaultValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.google.protobuf.Field> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (com.google.protobuf.Field.class) {
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
        com.google.protobuf.Field field = new com.google.protobuf.Field();
        DEFAULT_INSTANCE = field;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.google.protobuf.Field.class, field);
    }

    public static com.google.protobuf.Field getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.protobuf.Parser<com.google.protobuf.Field> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
