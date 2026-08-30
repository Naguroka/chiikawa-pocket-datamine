package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class WireFormat {
    static final int FIXED32_SIZE = 4;
    static final int FIXED64_SIZE = 8;
    static final int MAX_VARINT32_SIZE = 5;
    static final int MAX_VARINT64_SIZE = 10;
    static final int MAX_VARINT_SIZE = 10;
    static final int MESSAGE_SET_ITEM = 1;
    static final int MESSAGE_SET_MESSAGE = 3;
    static final int MESSAGE_SET_TYPE_ID = 2;
    static final int TAG_TYPE_BITS = 3;
    static final int TAG_TYPE_MASK = 7;
    public static final int WIRETYPE_END_GROUP = 4;
    public static final int WIRETYPE_FIXED32 = 5;
    public static final int WIRETYPE_FIXED64 = 1;
    public static final int WIRETYPE_LENGTH_DELIMITED = 2;
    public static final int WIRETYPE_START_GROUP = 3;
    public static final int WIRETYPE_VARINT = 0;
    static final int MESSAGE_SET_ITEM_TAG = makeTag(1, 3);
    static final int MESSAGE_SET_ITEM_END_TAG = makeTag(1, 4);
    static final int MESSAGE_SET_TYPE_ID_TAG = makeTag(2, 0);
    static final int MESSAGE_SET_MESSAGE_TAG = makeTag(3, 2);

    public static int getTagFieldNumber(final int tag) {
        return tag >>> 3;
    }

    public static int getTagWireType(final int tag) {
        return tag & 7;
    }

    static int makeTag(final int fieldNumber, final int wireType) {
        return (fieldNumber << 3) | wireType;
    }

    private WireFormat() {
    }

    public enum JavaType {
        INT(0),
        LONG(0L),
        FLOAT(java.lang.Float.valueOf(0.0f)),
        DOUBLE(java.lang.Double.valueOf(0.0d)),
        BOOLEAN(false),
        STRING(""),
        BYTE_STRING(androidx.datastore.preferences.protobuf.ByteString.EMPTY),
        ENUM(null),
        MESSAGE(null);

        private final java.lang.Object defaultDefault;

        JavaType(final java.lang.Object defaultDefault) {
            this.defaultDefault = defaultDefault;
        }

        java.lang.Object getDefaultDefault() {
            return this.defaultDefault;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'STRING' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static class FieldType {
        private static final /* synthetic */ androidx.datastore.preferences.protobuf.WireFormat.FieldType[] $VALUES;
        public static final androidx.datastore.preferences.protobuf.WireFormat.FieldType BOOL;
        public static final androidx.datastore.preferences.protobuf.WireFormat.FieldType BYTES;
        public static final androidx.datastore.preferences.protobuf.WireFormat.FieldType DOUBLE;
        public static final androidx.datastore.preferences.protobuf.WireFormat.FieldType ENUM;
        public static final androidx.datastore.preferences.protobuf.WireFormat.FieldType FIXED32;
        public static final androidx.datastore.preferences.protobuf.WireFormat.FieldType FIXED64;
        public static final androidx.datastore.preferences.protobuf.WireFormat.FieldType FLOAT;
        public static final androidx.datastore.preferences.protobuf.WireFormat.FieldType GROUP;
        public static final androidx.datastore.preferences.protobuf.WireFormat.FieldType INT32;
        public static final androidx.datastore.preferences.protobuf.WireFormat.FieldType INT64;
        public static final androidx.datastore.preferences.protobuf.WireFormat.FieldType MESSAGE;
        public static final androidx.datastore.preferences.protobuf.WireFormat.FieldType SFIXED32;
        public static final androidx.datastore.preferences.protobuf.WireFormat.FieldType SFIXED64;
        public static final androidx.datastore.preferences.protobuf.WireFormat.FieldType SINT32;
        public static final androidx.datastore.preferences.protobuf.WireFormat.FieldType SINT64;
        public static final androidx.datastore.preferences.protobuf.WireFormat.FieldType STRING;
        public static final androidx.datastore.preferences.protobuf.WireFormat.FieldType UINT32;
        public static final androidx.datastore.preferences.protobuf.WireFormat.FieldType UINT64;
        private final androidx.datastore.preferences.protobuf.WireFormat.JavaType javaType;
        private final int wireType;

        public boolean isPackable() {
            return true;
        }

        /* synthetic */ FieldType(java.lang.String str, int i, androidx.datastore.preferences.protobuf.WireFormat.JavaType javaType, int i2, androidx.datastore.preferences.protobuf.WireFormat.AnonymousClass1 anonymousClass1) {
            this(str, i, javaType, i2);
        }

        public static androidx.datastore.preferences.protobuf.WireFormat.FieldType valueOf(java.lang.String name) {
            return (androidx.datastore.preferences.protobuf.WireFormat.FieldType) java.lang.Enum.valueOf(androidx.datastore.preferences.protobuf.WireFormat.FieldType.class, name);
        }

        public static androidx.datastore.preferences.protobuf.WireFormat.FieldType[] values() {
            return (androidx.datastore.preferences.protobuf.WireFormat.FieldType[]) $VALUES.clone();
        }

        static {
            androidx.datastore.preferences.protobuf.WireFormat.FieldType fieldType = new androidx.datastore.preferences.protobuf.WireFormat.FieldType("DOUBLE", 0, androidx.datastore.preferences.protobuf.WireFormat.JavaType.DOUBLE, 1);
            DOUBLE = fieldType;
            androidx.datastore.preferences.protobuf.WireFormat.FieldType fieldType2 = new androidx.datastore.preferences.protobuf.WireFormat.FieldType("FLOAT", 1, androidx.datastore.preferences.protobuf.WireFormat.JavaType.FLOAT, 5);
            FLOAT = fieldType2;
            int i = 2;
            androidx.datastore.preferences.protobuf.WireFormat.FieldType fieldType3 = new androidx.datastore.preferences.protobuf.WireFormat.FieldType("INT64", 2, androidx.datastore.preferences.protobuf.WireFormat.JavaType.LONG, 0);
            INT64 = fieldType3;
            androidx.datastore.preferences.protobuf.WireFormat.FieldType fieldType4 = new androidx.datastore.preferences.protobuf.WireFormat.FieldType("UINT64", 3, androidx.datastore.preferences.protobuf.WireFormat.JavaType.LONG, 0);
            UINT64 = fieldType4;
            androidx.datastore.preferences.protobuf.WireFormat.FieldType fieldType5 = new androidx.datastore.preferences.protobuf.WireFormat.FieldType("INT32", 4, androidx.datastore.preferences.protobuf.WireFormat.JavaType.INT, 0);
            INT32 = fieldType5;
            androidx.datastore.preferences.protobuf.WireFormat.FieldType fieldType6 = new androidx.datastore.preferences.protobuf.WireFormat.FieldType("FIXED64", 5, androidx.datastore.preferences.protobuf.WireFormat.JavaType.LONG, 1);
            FIXED64 = fieldType6;
            androidx.datastore.preferences.protobuf.WireFormat.FieldType fieldType7 = new androidx.datastore.preferences.protobuf.WireFormat.FieldType("FIXED32", 6, androidx.datastore.preferences.protobuf.WireFormat.JavaType.INT, 5);
            FIXED32 = fieldType7;
            androidx.datastore.preferences.protobuf.WireFormat.FieldType fieldType8 = new androidx.datastore.preferences.protobuf.WireFormat.FieldType("BOOL", 7, androidx.datastore.preferences.protobuf.WireFormat.JavaType.BOOLEAN, 0);
            BOOL = fieldType8;
            androidx.datastore.preferences.protobuf.WireFormat.FieldType fieldType9 = new androidx.datastore.preferences.protobuf.WireFormat.FieldType("STRING", 8, androidx.datastore.preferences.protobuf.WireFormat.JavaType.STRING, i) { // from class: androidx.datastore.preferences.protobuf.WireFormat.FieldType.1
                @Override // androidx.datastore.preferences.protobuf.WireFormat.FieldType
                public boolean isPackable() {
                    return false;
                }

                {
                    androidx.datastore.preferences.protobuf.WireFormat.AnonymousClass1 anonymousClass1 = null;
                }
            };
            STRING = fieldType9;
            androidx.datastore.preferences.protobuf.WireFormat.FieldType fieldType10 = new androidx.datastore.preferences.protobuf.WireFormat.FieldType("GROUP", 9, androidx.datastore.preferences.protobuf.WireFormat.JavaType.MESSAGE, 3) { // from class: androidx.datastore.preferences.protobuf.WireFormat.FieldType.2
                @Override // androidx.datastore.preferences.protobuf.WireFormat.FieldType
                public boolean isPackable() {
                    return false;
                }

                {
                    androidx.datastore.preferences.protobuf.WireFormat.AnonymousClass1 anonymousClass1 = null;
                }
            };
            GROUP = fieldType10;
            androidx.datastore.preferences.protobuf.WireFormat.FieldType fieldType11 = new androidx.datastore.preferences.protobuf.WireFormat.FieldType("MESSAGE", 10, androidx.datastore.preferences.protobuf.WireFormat.JavaType.MESSAGE, i) { // from class: androidx.datastore.preferences.protobuf.WireFormat.FieldType.3
                @Override // androidx.datastore.preferences.protobuf.WireFormat.FieldType
                public boolean isPackable() {
                    return false;
                }

                {
                    androidx.datastore.preferences.protobuf.WireFormat.AnonymousClass1 anonymousClass1 = null;
                }
            };
            MESSAGE = fieldType11;
            androidx.datastore.preferences.protobuf.WireFormat.FieldType fieldType12 = new androidx.datastore.preferences.protobuf.WireFormat.FieldType("BYTES", 11, androidx.datastore.preferences.protobuf.WireFormat.JavaType.BYTE_STRING, i) { // from class: androidx.datastore.preferences.protobuf.WireFormat.FieldType.4
                @Override // androidx.datastore.preferences.protobuf.WireFormat.FieldType
                public boolean isPackable() {
                    return false;
                }

                {
                    androidx.datastore.preferences.protobuf.WireFormat.AnonymousClass1 anonymousClass1 = null;
                }
            };
            BYTES = fieldType12;
            androidx.datastore.preferences.protobuf.WireFormat.FieldType fieldType13 = new androidx.datastore.preferences.protobuf.WireFormat.FieldType("UINT32", 12, androidx.datastore.preferences.protobuf.WireFormat.JavaType.INT, 0);
            UINT32 = fieldType13;
            androidx.datastore.preferences.protobuf.WireFormat.FieldType fieldType14 = new androidx.datastore.preferences.protobuf.WireFormat.FieldType("ENUM", 13, androidx.datastore.preferences.protobuf.WireFormat.JavaType.ENUM, 0);
            ENUM = fieldType14;
            androidx.datastore.preferences.protobuf.WireFormat.FieldType fieldType15 = new androidx.datastore.preferences.protobuf.WireFormat.FieldType("SFIXED32", 14, androidx.datastore.preferences.protobuf.WireFormat.JavaType.INT, 5);
            SFIXED32 = fieldType15;
            androidx.datastore.preferences.protobuf.WireFormat.FieldType fieldType16 = new androidx.datastore.preferences.protobuf.WireFormat.FieldType("SFIXED64", 15, androidx.datastore.preferences.protobuf.WireFormat.JavaType.LONG, 1);
            SFIXED64 = fieldType16;
            androidx.datastore.preferences.protobuf.WireFormat.FieldType fieldType17 = new androidx.datastore.preferences.protobuf.WireFormat.FieldType("SINT32", 16, androidx.datastore.preferences.protobuf.WireFormat.JavaType.INT, 0);
            SINT32 = fieldType17;
            androidx.datastore.preferences.protobuf.WireFormat.FieldType fieldType18 = new androidx.datastore.preferences.protobuf.WireFormat.FieldType("SINT64", 17, androidx.datastore.preferences.protobuf.WireFormat.JavaType.LONG, 0);
            SINT64 = fieldType18;
            $VALUES = new androidx.datastore.preferences.protobuf.WireFormat.FieldType[]{fieldType, fieldType2, fieldType3, fieldType4, fieldType5, fieldType6, fieldType7, fieldType8, fieldType9, fieldType10, fieldType11, fieldType12, fieldType13, fieldType14, fieldType15, fieldType16, fieldType17, fieldType18};
        }

        private FieldType(java.lang.String $enum$name, int $enum$ordinal, final androidx.datastore.preferences.protobuf.WireFormat.JavaType javaType, final int wireType) {
            super($enum$name, $enum$ordinal);
            this.javaType = javaType;
            this.wireType = wireType;
        }

        public androidx.datastore.preferences.protobuf.WireFormat.JavaType getJavaType() {
            return this.javaType;
        }

        public int getWireType() {
            return this.wireType;
        }
    }

    enum Utf8Validation {
        LOOSE { // from class: androidx.datastore.preferences.protobuf.WireFormat.Utf8Validation.1
            @Override // androidx.datastore.preferences.protobuf.WireFormat.Utf8Validation
            java.lang.Object readString(androidx.datastore.preferences.protobuf.CodedInputStream input) throws java.io.IOException {
                return input.readString();
            }
        },
        STRICT { // from class: androidx.datastore.preferences.protobuf.WireFormat.Utf8Validation.2
            @Override // androidx.datastore.preferences.protobuf.WireFormat.Utf8Validation
            java.lang.Object readString(androidx.datastore.preferences.protobuf.CodedInputStream input) throws java.io.IOException {
                return input.readStringRequireUtf8();
            }
        },
        LAZY { // from class: androidx.datastore.preferences.protobuf.WireFormat.Utf8Validation.3
            @Override // androidx.datastore.preferences.protobuf.WireFormat.Utf8Validation
            java.lang.Object readString(androidx.datastore.preferences.protobuf.CodedInputStream input) throws java.io.IOException {
                return input.readBytes();
            }
        };

        abstract java.lang.Object readString(androidx.datastore.preferences.protobuf.CodedInputStream input) throws java.io.IOException;

        /* synthetic */ Utf8Validation(androidx.datastore.preferences.protobuf.WireFormat.AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.WireFormat$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[androidx.datastore.preferences.protobuf.WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[androidx.datastore.preferences.protobuf.WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.BYTES.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT32.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED32.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED64.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT32.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT64.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.STRING.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.GROUP.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.MESSAGE.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.ENUM.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
        }
    }

    static java.lang.Object readPrimitiveField(androidx.datastore.preferences.protobuf.CodedInputStream input, androidx.datastore.preferences.protobuf.WireFormat.FieldType type, androidx.datastore.preferences.protobuf.WireFormat.Utf8Validation utf8Validation) throws java.io.IOException {
        switch (androidx.datastore.preferences.protobuf.WireFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[type.ordinal()]) {
            case 1:
                return java.lang.Double.valueOf(input.readDouble());
            case 2:
                return java.lang.Float.valueOf(input.readFloat());
            case 3:
                return java.lang.Long.valueOf(input.readInt64());
            case 4:
                return java.lang.Long.valueOf(input.readUInt64());
            case 5:
                return java.lang.Integer.valueOf(input.readInt32());
            case 6:
                return java.lang.Long.valueOf(input.readFixed64());
            case 7:
                return java.lang.Integer.valueOf(input.readFixed32());
            case 8:
                return java.lang.Boolean.valueOf(input.readBool());
            case 9:
                return input.readBytes();
            case 10:
                return java.lang.Integer.valueOf(input.readUInt32());
            case 11:
                return java.lang.Integer.valueOf(input.readSFixed32());
            case 12:
                return java.lang.Long.valueOf(input.readSFixed64());
            case 13:
                return java.lang.Integer.valueOf(input.readSInt32());
            case 14:
                return java.lang.Long.valueOf(input.readSInt64());
            case 15:
                return utf8Validation.readString(input);
            case 16:
                throw new java.lang.IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new java.lang.IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new java.lang.IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new java.lang.RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
