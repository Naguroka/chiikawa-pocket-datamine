package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class Field extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<androidx.datastore.preferences.protobuf.Field, androidx.datastore.preferences.protobuf.Field.Builder> implements androidx.datastore.preferences.protobuf.FieldOrBuilder {
    public static final int CARDINALITY_FIELD_NUMBER = 2;
    private static final androidx.datastore.preferences.protobuf.Field DEFAULT_INSTANCE;
    public static final int DEFAULT_VALUE_FIELD_NUMBER = 11;
    public static final int JSON_NAME_FIELD_NUMBER = 10;
    public static final int KIND_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int NUMBER_FIELD_NUMBER = 3;
    public static final int ONEOF_INDEX_FIELD_NUMBER = 7;
    public static final int OPTIONS_FIELD_NUMBER = 9;
    public static final int PACKED_FIELD_NUMBER = 8;
    private static volatile androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.protobuf.Field> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 6;
    private int cardinality_;
    private int kind_;
    private int number_;
    private int oneofIndex_;
    private boolean packed_;
    private java.lang.String name_ = "";
    private java.lang.String typeUrl_ = "";
    private androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.datastore.preferences.protobuf.Option> options_ = emptyProtobufList();
    private java.lang.String jsonName_ = "";
    private java.lang.String defaultValue_ = "";

    private Field() {
    }

    public enum Kind implements androidx.datastore.preferences.protobuf.Internal.EnumLite {
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
        private static final androidx.datastore.preferences.protobuf.Internal.EnumLiteMap<androidx.datastore.preferences.protobuf.Field.Kind> internalValueMap = new androidx.datastore.preferences.protobuf.Internal.EnumLiteMap<androidx.datastore.preferences.protobuf.Field.Kind>() { // from class: androidx.datastore.preferences.protobuf.Field.Kind.1
            @Override // androidx.datastore.preferences.protobuf.Internal.EnumLiteMap
            public androidx.datastore.preferences.protobuf.Field.Kind findValueByNumber(int number) {
                return androidx.datastore.preferences.protobuf.Field.Kind.forNumber(number);
            }
        };
        private final int value;

        @Override // androidx.datastore.preferences.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @java.lang.Deprecated
        public static androidx.datastore.preferences.protobuf.Field.Kind valueOf(int value) {
            return forNumber(value);
        }

        public static androidx.datastore.preferences.protobuf.Field.Kind forNumber(int value) {
            switch (value) {
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

        public static androidx.datastore.preferences.protobuf.Internal.EnumLiteMap<androidx.datastore.preferences.protobuf.Field.Kind> internalGetValueMap() {
            return internalValueMap;
        }

        public static androidx.datastore.preferences.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return androidx.datastore.preferences.protobuf.Field.Kind.KindVerifier.INSTANCE;
        }

        private static final class KindVerifier implements androidx.datastore.preferences.protobuf.Internal.EnumVerifier {
            static final androidx.datastore.preferences.protobuf.Internal.EnumVerifier INSTANCE = new androidx.datastore.preferences.protobuf.Field.Kind.KindVerifier();

            private KindVerifier() {
            }

            @Override // androidx.datastore.preferences.protobuf.Internal.EnumVerifier
            public boolean isInRange(int number) {
                return androidx.datastore.preferences.protobuf.Field.Kind.forNumber(number) != null;
            }
        }

        Kind(int value) {
            this.value = value;
        }
    }

    public enum Cardinality implements androidx.datastore.preferences.protobuf.Internal.EnumLite {
        CARDINALITY_UNKNOWN(0),
        CARDINALITY_OPTIONAL(1),
        CARDINALITY_REQUIRED(2),
        CARDINALITY_REPEATED(3),
        UNRECOGNIZED(-1);

        public static final int CARDINALITY_OPTIONAL_VALUE = 1;
        public static final int CARDINALITY_REPEATED_VALUE = 3;
        public static final int CARDINALITY_REQUIRED_VALUE = 2;
        public static final int CARDINALITY_UNKNOWN_VALUE = 0;
        private static final androidx.datastore.preferences.protobuf.Internal.EnumLiteMap<androidx.datastore.preferences.protobuf.Field.Cardinality> internalValueMap = new androidx.datastore.preferences.protobuf.Internal.EnumLiteMap<androidx.datastore.preferences.protobuf.Field.Cardinality>() { // from class: androidx.datastore.preferences.protobuf.Field.Cardinality.1
            @Override // androidx.datastore.preferences.protobuf.Internal.EnumLiteMap
            public androidx.datastore.preferences.protobuf.Field.Cardinality findValueByNumber(int number) {
                return androidx.datastore.preferences.protobuf.Field.Cardinality.forNumber(number);
            }
        };
        private final int value;

        @Override // androidx.datastore.preferences.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @java.lang.Deprecated
        public static androidx.datastore.preferences.protobuf.Field.Cardinality valueOf(int value) {
            return forNumber(value);
        }

        public static androidx.datastore.preferences.protobuf.Field.Cardinality forNumber(int value) {
            if (value == 0) {
                return CARDINALITY_UNKNOWN;
            }
            if (value == 1) {
                return CARDINALITY_OPTIONAL;
            }
            if (value == 2) {
                return CARDINALITY_REQUIRED;
            }
            if (value != 3) {
                return null;
            }
            return CARDINALITY_REPEATED;
        }

        public static androidx.datastore.preferences.protobuf.Internal.EnumLiteMap<androidx.datastore.preferences.protobuf.Field.Cardinality> internalGetValueMap() {
            return internalValueMap;
        }

        public static androidx.datastore.preferences.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return androidx.datastore.preferences.protobuf.Field.Cardinality.CardinalityVerifier.INSTANCE;
        }

        private static final class CardinalityVerifier implements androidx.datastore.preferences.protobuf.Internal.EnumVerifier {
            static final androidx.datastore.preferences.protobuf.Internal.EnumVerifier INSTANCE = new androidx.datastore.preferences.protobuf.Field.Cardinality.CardinalityVerifier();

            private CardinalityVerifier() {
            }

            @Override // androidx.datastore.preferences.protobuf.Internal.EnumVerifier
            public boolean isInRange(int number) {
                return androidx.datastore.preferences.protobuf.Field.Cardinality.forNumber(number) != null;
            }
        }

        Cardinality(int value) {
            this.value = value;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public int getKindValue() {
        return this.kind_;
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public androidx.datastore.preferences.protobuf.Field.Kind getKind() {
        androidx.datastore.preferences.protobuf.Field.Kind kindForNumber = androidx.datastore.preferences.protobuf.Field.Kind.forNumber(this.kind_);
        return kindForNumber == null ? androidx.datastore.preferences.protobuf.Field.Kind.UNRECOGNIZED : kindForNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKindValue(int value) {
        this.kind_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKind(androidx.datastore.preferences.protobuf.Field.Kind value) {
        this.kind_ = value.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKind() {
        this.kind_ = 0;
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public int getCardinalityValue() {
        return this.cardinality_;
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public androidx.datastore.preferences.protobuf.Field.Cardinality getCardinality() {
        androidx.datastore.preferences.protobuf.Field.Cardinality cardinalityForNumber = androidx.datastore.preferences.protobuf.Field.Cardinality.forNumber(this.cardinality_);
        return cardinalityForNumber == null ? androidx.datastore.preferences.protobuf.Field.Cardinality.UNRECOGNIZED : cardinalityForNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardinalityValue(int value) {
        this.cardinality_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardinality(androidx.datastore.preferences.protobuf.Field.Cardinality value) {
        this.cardinality_ = value.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCardinality() {
        this.cardinality_ = 0;
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
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

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public java.lang.String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
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

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public java.lang.String getTypeUrl() {
        return this.typeUrl_;
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public androidx.datastore.preferences.protobuf.ByteString getTypeUrlBytes() {
        return androidx.datastore.preferences.protobuf.ByteString.copyFromUtf8(this.typeUrl_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeUrl(java.lang.String value) {
        value.getClass();
        this.typeUrl_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypeUrl() {
        this.typeUrl_ = getDefaultInstance().getTypeUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeUrlBytes(androidx.datastore.preferences.protobuf.ByteString value) {
        checkByteStringIsUtf8(value);
        this.typeUrl_ = value.toStringUtf8();
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public int getOneofIndex() {
        return this.oneofIndex_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOneofIndex(int value) {
        this.oneofIndex_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOneofIndex() {
        this.oneofIndex_ = 0;
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public boolean getPacked() {
        return this.packed_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPacked(boolean value) {
        this.packed_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPacked() {
        this.packed_ = false;
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public java.util.List<androidx.datastore.preferences.protobuf.Option> getOptionsList() {
        return this.options_;
    }

    public java.util.List<? extends androidx.datastore.preferences.protobuf.OptionOrBuilder> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
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

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public java.lang.String getJsonName() {
        return this.jsonName_;
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public androidx.datastore.preferences.protobuf.ByteString getJsonNameBytes() {
        return androidx.datastore.preferences.protobuf.ByteString.copyFromUtf8(this.jsonName_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJsonName(java.lang.String value) {
        value.getClass();
        this.jsonName_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJsonName() {
        this.jsonName_ = getDefaultInstance().getJsonName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJsonNameBytes(androidx.datastore.preferences.protobuf.ByteString value) {
        checkByteStringIsUtf8(value);
        this.jsonName_ = value.toStringUtf8();
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public java.lang.String getDefaultValue() {
        return this.defaultValue_;
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public androidx.datastore.preferences.protobuf.ByteString getDefaultValueBytes() {
        return androidx.datastore.preferences.protobuf.ByteString.copyFromUtf8(this.defaultValue_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultValue(java.lang.String value) {
        value.getClass();
        this.defaultValue_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDefaultValue() {
        this.defaultValue_ = getDefaultInstance().getDefaultValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultValueBytes(androidx.datastore.preferences.protobuf.ByteString value) {
        checkByteStringIsUtf8(value);
        this.defaultValue_ = value.toStringUtf8();
    }

    public static androidx.datastore.preferences.protobuf.Field parseFrom(java.nio.ByteBuffer data) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.Field) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static androidx.datastore.preferences.protobuf.Field parseFrom(java.nio.ByteBuffer data, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.Field) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.Field parseFrom(androidx.datastore.preferences.protobuf.ByteString data) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.Field) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static androidx.datastore.preferences.protobuf.Field parseFrom(androidx.datastore.preferences.protobuf.ByteString data, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.Field) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.Field parseFrom(byte[] data) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.Field) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static androidx.datastore.preferences.protobuf.Field parseFrom(byte[] data, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.datastore.preferences.protobuf.Field) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.Field parseFrom(java.io.InputStream input) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.Field) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static androidx.datastore.preferences.protobuf.Field parseFrom(java.io.InputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.Field) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.Field parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.Field) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static androidx.datastore.preferences.protobuf.Field parseDelimitedFrom(java.io.InputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.Field) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.Field parseFrom(androidx.datastore.preferences.protobuf.CodedInputStream input) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.Field) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static androidx.datastore.preferences.protobuf.Field parseFrom(androidx.datastore.preferences.protobuf.CodedInputStream input, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (androidx.datastore.preferences.protobuf.Field) androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static androidx.datastore.preferences.protobuf.Field.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static androidx.datastore.preferences.protobuf.Field.Builder newBuilder(androidx.datastore.preferences.protobuf.Field prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder<androidx.datastore.preferences.protobuf.Field, androidx.datastore.preferences.protobuf.Field.Builder> implements androidx.datastore.preferences.protobuf.FieldOrBuilder {
        /* synthetic */ Builder(androidx.datastore.preferences.protobuf.Field.AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(androidx.datastore.preferences.protobuf.Field.DEFAULT_INSTANCE);
        }

        @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public int getKindValue() {
            return ((androidx.datastore.preferences.protobuf.Field) this.instance).getKindValue();
        }

        public androidx.datastore.preferences.protobuf.Field.Builder setKindValue(int value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Field) this.instance).setKindValue(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public androidx.datastore.preferences.protobuf.Field.Kind getKind() {
            return ((androidx.datastore.preferences.protobuf.Field) this.instance).getKind();
        }

        public androidx.datastore.preferences.protobuf.Field.Builder setKind(androidx.datastore.preferences.protobuf.Field.Kind value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Field) this.instance).setKind(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Field.Builder clearKind() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Field) this.instance).clearKind();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public int getCardinalityValue() {
            return ((androidx.datastore.preferences.protobuf.Field) this.instance).getCardinalityValue();
        }

        public androidx.datastore.preferences.protobuf.Field.Builder setCardinalityValue(int value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Field) this.instance).setCardinalityValue(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public androidx.datastore.preferences.protobuf.Field.Cardinality getCardinality() {
            return ((androidx.datastore.preferences.protobuf.Field) this.instance).getCardinality();
        }

        public androidx.datastore.preferences.protobuf.Field.Builder setCardinality(androidx.datastore.preferences.protobuf.Field.Cardinality value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Field) this.instance).setCardinality(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Field.Builder clearCardinality() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Field) this.instance).clearCardinality();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public int getNumber() {
            return ((androidx.datastore.preferences.protobuf.Field) this.instance).getNumber();
        }

        public androidx.datastore.preferences.protobuf.Field.Builder setNumber(int value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Field) this.instance).setNumber(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Field.Builder clearNumber() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Field) this.instance).clearNumber();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public java.lang.String getName() {
            return ((androidx.datastore.preferences.protobuf.Field) this.instance).getName();
        }

        @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public androidx.datastore.preferences.protobuf.ByteString getNameBytes() {
            return ((androidx.datastore.preferences.protobuf.Field) this.instance).getNameBytes();
        }

        public androidx.datastore.preferences.protobuf.Field.Builder setName(java.lang.String value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Field) this.instance).setName(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Field.Builder clearName() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Field) this.instance).clearName();
            return this;
        }

        public androidx.datastore.preferences.protobuf.Field.Builder setNameBytes(androidx.datastore.preferences.protobuf.ByteString value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Field) this.instance).setNameBytes(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public java.lang.String getTypeUrl() {
            return ((androidx.datastore.preferences.protobuf.Field) this.instance).getTypeUrl();
        }

        @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public androidx.datastore.preferences.protobuf.ByteString getTypeUrlBytes() {
            return ((androidx.datastore.preferences.protobuf.Field) this.instance).getTypeUrlBytes();
        }

        public androidx.datastore.preferences.protobuf.Field.Builder setTypeUrl(java.lang.String value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Field) this.instance).setTypeUrl(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Field.Builder clearTypeUrl() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Field) this.instance).clearTypeUrl();
            return this;
        }

        public androidx.datastore.preferences.protobuf.Field.Builder setTypeUrlBytes(androidx.datastore.preferences.protobuf.ByteString value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Field) this.instance).setTypeUrlBytes(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public int getOneofIndex() {
            return ((androidx.datastore.preferences.protobuf.Field) this.instance).getOneofIndex();
        }

        public androidx.datastore.preferences.protobuf.Field.Builder setOneofIndex(int value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Field) this.instance).setOneofIndex(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Field.Builder clearOneofIndex() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Field) this.instance).clearOneofIndex();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public boolean getPacked() {
            return ((androidx.datastore.preferences.protobuf.Field) this.instance).getPacked();
        }

        public androidx.datastore.preferences.protobuf.Field.Builder setPacked(boolean value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Field) this.instance).setPacked(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Field.Builder clearPacked() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Field) this.instance).clearPacked();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public java.util.List<androidx.datastore.preferences.protobuf.Option> getOptionsList() {
            return java.util.Collections.unmodifiableList(((androidx.datastore.preferences.protobuf.Field) this.instance).getOptionsList());
        }

        @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public int getOptionsCount() {
            return ((androidx.datastore.preferences.protobuf.Field) this.instance).getOptionsCount();
        }

        @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public androidx.datastore.preferences.protobuf.Option getOptions(int index) {
            return ((androidx.datastore.preferences.protobuf.Field) this.instance).getOptions(index);
        }

        public androidx.datastore.preferences.protobuf.Field.Builder setOptions(int index, androidx.datastore.preferences.protobuf.Option value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Field) this.instance).setOptions(index, value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Field.Builder setOptions(int index, androidx.datastore.preferences.protobuf.Option.Builder builderForValue) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Field) this.instance).setOptions(index, builderForValue.build());
            return this;
        }

        public androidx.datastore.preferences.protobuf.Field.Builder addOptions(androidx.datastore.preferences.protobuf.Option value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Field) this.instance).addOptions(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Field.Builder addOptions(int index, androidx.datastore.preferences.protobuf.Option value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Field) this.instance).addOptions(index, value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Field.Builder addOptions(androidx.datastore.preferences.protobuf.Option.Builder builderForValue) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Field) this.instance).addOptions(builderForValue.build());
            return this;
        }

        public androidx.datastore.preferences.protobuf.Field.Builder addOptions(int index, androidx.datastore.preferences.protobuf.Option.Builder builderForValue) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Field) this.instance).addOptions(index, builderForValue.build());
            return this;
        }

        public androidx.datastore.preferences.protobuf.Field.Builder addAllOptions(java.lang.Iterable<? extends androidx.datastore.preferences.protobuf.Option> values) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Field) this.instance).addAllOptions(values);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Field.Builder clearOptions() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Field) this.instance).clearOptions();
            return this;
        }

        public androidx.datastore.preferences.protobuf.Field.Builder removeOptions(int index) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Field) this.instance).removeOptions(index);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public java.lang.String getJsonName() {
            return ((androidx.datastore.preferences.protobuf.Field) this.instance).getJsonName();
        }

        @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public androidx.datastore.preferences.protobuf.ByteString getJsonNameBytes() {
            return ((androidx.datastore.preferences.protobuf.Field) this.instance).getJsonNameBytes();
        }

        public androidx.datastore.preferences.protobuf.Field.Builder setJsonName(java.lang.String value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Field) this.instance).setJsonName(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Field.Builder clearJsonName() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Field) this.instance).clearJsonName();
            return this;
        }

        public androidx.datastore.preferences.protobuf.Field.Builder setJsonNameBytes(androidx.datastore.preferences.protobuf.ByteString value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Field) this.instance).setJsonNameBytes(value);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public java.lang.String getDefaultValue() {
            return ((androidx.datastore.preferences.protobuf.Field) this.instance).getDefaultValue();
        }

        @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public androidx.datastore.preferences.protobuf.ByteString getDefaultValueBytes() {
            return ((androidx.datastore.preferences.protobuf.Field) this.instance).getDefaultValueBytes();
        }

        public androidx.datastore.preferences.protobuf.Field.Builder setDefaultValue(java.lang.String value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Field) this.instance).setDefaultValue(value);
            return this;
        }

        public androidx.datastore.preferences.protobuf.Field.Builder clearDefaultValue() {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Field) this.instance).clearDefaultValue();
            return this;
        }

        public androidx.datastore.preferences.protobuf.Field.Builder setDefaultValueBytes(androidx.datastore.preferences.protobuf.ByteString value) {
            copyOnWrite();
            ((androidx.datastore.preferences.protobuf.Field) this.instance).setDefaultValueBytes(value);
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Field$1, reason: invalid class name */
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
        androidx.datastore.preferences.protobuf.Field.AnonymousClass1 anonymousClass1 = null;
        switch (androidx.datastore.preferences.protobuf.Field.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
            case 1:
                return new androidx.datastore.preferences.protobuf.Field();
            case 2:
                return new androidx.datastore.preferences.protobuf.Field.Builder(anonymousClass1);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\u000b\n\u0000\u0001\u0000\u0001\f\u0002\f\u0003\u0004\u0004Ȉ\u0006Ȉ\u0007\u0004\b\u0007\t\u001b\nȈ\u000bȈ", new java.lang.Object[]{"kind_", "cardinality_", "number_", "name_", "typeUrl_", "oneofIndex_", "packed_", "options_", androidx.datastore.preferences.protobuf.Option.class, "jsonName_", "defaultValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.protobuf.Field> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (androidx.datastore.preferences.protobuf.Field.class) {
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
        androidx.datastore.preferences.protobuf.Field field = new androidx.datastore.preferences.protobuf.Field();
        DEFAULT_INSTANCE = field;
        androidx.datastore.preferences.protobuf.GeneratedMessageLite.registerDefaultInstance(androidx.datastore.preferences.protobuf.Field.class, field);
    }

    public static androidx.datastore.preferences.protobuf.Field getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.protobuf.Field> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
