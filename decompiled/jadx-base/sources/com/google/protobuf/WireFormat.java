package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
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

    public static int getTagFieldNumber(int i) {
        return i >>> 3;
    }

    public static int getTagWireType(int i) {
        return i & 7;
    }

    static int makeTag(int i, int i2) {
        return (i << 3) | i2;
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
        BYTE_STRING(com.google.protobuf.ByteString.EMPTY),
        ENUM(null),
        MESSAGE(null);

        private final java.lang.Object defaultDefault;

        JavaType(java.lang.Object obj) {
            this.defaultDefault = obj;
        }

        java.lang.Object getDefaultDefault() {
            return this.defaultDefault;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'STRING' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static class FieldType {
        public static final com.google.protobuf.WireFormat.FieldType BYTES;
        public static final com.google.protobuf.WireFormat.FieldType GROUP = new com.google.protobuf.WireFormat.FieldType("GROUP", 9, com.google.protobuf.WireFormat.JavaType.MESSAGE, 3) { // from class: com.google.protobuf.WireFormat.FieldType.2
            @Override // com.google.protobuf.WireFormat.FieldType
            public boolean isPackable() {
                return false;
            }

            {
                com.google.protobuf.WireFormat.AnonymousClass1 anonymousClass1 = null;
            }
        };
        public static final com.google.protobuf.WireFormat.FieldType MESSAGE;
        public static final com.google.protobuf.WireFormat.FieldType STRING;
        private final com.google.protobuf.WireFormat.JavaType javaType;
        private final int wireType;
        public static final com.google.protobuf.WireFormat.FieldType DOUBLE = new com.google.protobuf.WireFormat.FieldType("DOUBLE", 0, com.google.protobuf.WireFormat.JavaType.DOUBLE, 1);
        public static final com.google.protobuf.WireFormat.FieldType FLOAT = new com.google.protobuf.WireFormat.FieldType("FLOAT", 1, com.google.protobuf.WireFormat.JavaType.FLOAT, 5);
        public static final com.google.protobuf.WireFormat.FieldType INT64 = new com.google.protobuf.WireFormat.FieldType("INT64", 2, com.google.protobuf.WireFormat.JavaType.LONG, 0);
        public static final com.google.protobuf.WireFormat.FieldType UINT64 = new com.google.protobuf.WireFormat.FieldType("UINT64", 3, com.google.protobuf.WireFormat.JavaType.LONG, 0);
        public static final com.google.protobuf.WireFormat.FieldType INT32 = new com.google.protobuf.WireFormat.FieldType("INT32", 4, com.google.protobuf.WireFormat.JavaType.INT, 0);
        public static final com.google.protobuf.WireFormat.FieldType FIXED64 = new com.google.protobuf.WireFormat.FieldType("FIXED64", 5, com.google.protobuf.WireFormat.JavaType.LONG, 1);
        public static final com.google.protobuf.WireFormat.FieldType FIXED32 = new com.google.protobuf.WireFormat.FieldType("FIXED32", 6, com.google.protobuf.WireFormat.JavaType.INT, 5);
        public static final com.google.protobuf.WireFormat.FieldType BOOL = new com.google.protobuf.WireFormat.FieldType("BOOL", 7, com.google.protobuf.WireFormat.JavaType.BOOLEAN, 0);
        public static final com.google.protobuf.WireFormat.FieldType UINT32 = new com.google.protobuf.WireFormat.FieldType("UINT32", 12, com.google.protobuf.WireFormat.JavaType.INT, 0);
        public static final com.google.protobuf.WireFormat.FieldType ENUM = new com.google.protobuf.WireFormat.FieldType("ENUM", 13, com.google.protobuf.WireFormat.JavaType.ENUM, 0);
        public static final com.google.protobuf.WireFormat.FieldType SFIXED32 = new com.google.protobuf.WireFormat.FieldType("SFIXED32", 14, com.google.protobuf.WireFormat.JavaType.INT, 5);
        public static final com.google.protobuf.WireFormat.FieldType SFIXED64 = new com.google.protobuf.WireFormat.FieldType("SFIXED64", 15, com.google.protobuf.WireFormat.JavaType.LONG, 1);
        public static final com.google.protobuf.WireFormat.FieldType SINT32 = new com.google.protobuf.WireFormat.FieldType("SINT32", 16, com.google.protobuf.WireFormat.JavaType.INT, 0);
        public static final com.google.protobuf.WireFormat.FieldType SINT64 = new com.google.protobuf.WireFormat.FieldType("SINT64", 17, com.google.protobuf.WireFormat.JavaType.LONG, 0);
        private static final /* synthetic */ com.google.protobuf.WireFormat.FieldType[] $VALUES = $values();

        public boolean isPackable() {
            return true;
        }

        private static /* synthetic */ com.google.protobuf.WireFormat.FieldType[] $values() {
            return new com.google.protobuf.WireFormat.FieldType[]{DOUBLE, FLOAT, INT64, UINT64, INT32, FIXED64, FIXED32, BOOL, STRING, GROUP, MESSAGE, BYTES, UINT32, ENUM, SFIXED32, SFIXED64, SINT32, SINT64};
        }

        /* synthetic */ FieldType(java.lang.String str, int i, com.google.protobuf.WireFormat.JavaType javaType, int i2, com.google.protobuf.WireFormat.AnonymousClass1 anonymousClass1) {
            this(str, i, javaType, i2);
        }

        public static com.google.protobuf.WireFormat.FieldType valueOf(java.lang.String str) {
            return (com.google.protobuf.WireFormat.FieldType) java.lang.Enum.valueOf(com.google.protobuf.WireFormat.FieldType.class, str);
        }

        public static com.google.protobuf.WireFormat.FieldType[] values() {
            return (com.google.protobuf.WireFormat.FieldType[]) $VALUES.clone();
        }

        static {
            int i = 2;
            STRING = new com.google.protobuf.WireFormat.FieldType("STRING", 8, com.google.protobuf.WireFormat.JavaType.STRING, i) { // from class: com.google.protobuf.WireFormat.FieldType.1
                @Override // com.google.protobuf.WireFormat.FieldType
                public boolean isPackable() {
                    return false;
                }

                {
                    com.google.protobuf.WireFormat.AnonymousClass1 anonymousClass1 = null;
                }
            };
            MESSAGE = new com.google.protobuf.WireFormat.FieldType("MESSAGE", 10, com.google.protobuf.WireFormat.JavaType.MESSAGE, i) { // from class: com.google.protobuf.WireFormat.FieldType.3
                @Override // com.google.protobuf.WireFormat.FieldType
                public boolean isPackable() {
                    return false;
                }

                {
                    com.google.protobuf.WireFormat.AnonymousClass1 anonymousClass1 = null;
                }
            };
            BYTES = new com.google.protobuf.WireFormat.FieldType("BYTES", 11, com.google.protobuf.WireFormat.JavaType.BYTE_STRING, i) { // from class: com.google.protobuf.WireFormat.FieldType.4
                @Override // com.google.protobuf.WireFormat.FieldType
                public boolean isPackable() {
                    return false;
                }

                {
                    com.google.protobuf.WireFormat.AnonymousClass1 anonymousClass1 = null;
                }
            };
        }

        private FieldType(java.lang.String str, int i, com.google.protobuf.WireFormat.JavaType javaType, int i2) {
            super(str, i);
            this.javaType = javaType;
            this.wireType = i2;
        }

        public com.google.protobuf.WireFormat.JavaType getJavaType() {
            return this.javaType;
        }

        public int getWireType() {
            return this.wireType;
        }
    }

    enum Utf8Validation {
        LOOSE { // from class: com.google.protobuf.WireFormat.Utf8Validation.1
            @Override // com.google.protobuf.WireFormat.Utf8Validation
            java.lang.Object readString(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return codedInputStream.readString();
            }
        },
        STRICT { // from class: com.google.protobuf.WireFormat.Utf8Validation.2
            @Override // com.google.protobuf.WireFormat.Utf8Validation
            java.lang.Object readString(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return codedInputStream.readStringRequireUtf8();
            }
        },
        LAZY { // from class: com.google.protobuf.WireFormat.Utf8Validation.3
            @Override // com.google.protobuf.WireFormat.Utf8Validation
            java.lang.Object readString(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
                return codedInputStream.readBytes();
            }
        };

        abstract java.lang.Object readString(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException;

        /* synthetic */ Utf8Validation(com.google.protobuf.WireFormat.AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.WireFormat$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[com.google.protobuf.WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[com.google.protobuf.WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.BYTES.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.UINT32.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.SFIXED32.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.SFIXED64.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.SINT32.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.SINT64.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.STRING.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.GROUP.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.MESSAGE.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.ENUM.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
        }
    }

    static java.lang.Object readPrimitiveField(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.WireFormat.FieldType fieldType, com.google.protobuf.WireFormat.Utf8Validation utf8Validation) throws java.io.IOException {
        switch (com.google.protobuf.WireFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                return java.lang.Double.valueOf(codedInputStream.readDouble());
            case 2:
                return java.lang.Float.valueOf(codedInputStream.readFloat());
            case 3:
                return java.lang.Long.valueOf(codedInputStream.readInt64());
            case 4:
                return java.lang.Long.valueOf(codedInputStream.readUInt64());
            case 5:
                return java.lang.Integer.valueOf(codedInputStream.readInt32());
            case 6:
                return java.lang.Long.valueOf(codedInputStream.readFixed64());
            case 7:
                return java.lang.Integer.valueOf(codedInputStream.readFixed32());
            case 8:
                return java.lang.Boolean.valueOf(codedInputStream.readBool());
            case 9:
                return codedInputStream.readBytes();
            case 10:
                return java.lang.Integer.valueOf(codedInputStream.readUInt32());
            case 11:
                return java.lang.Integer.valueOf(codedInputStream.readSFixed32());
            case 12:
                return java.lang.Long.valueOf(codedInputStream.readSFixed64());
            case 13:
                return java.lang.Integer.valueOf(codedInputStream.readSInt32());
            case 14:
                return java.lang.Long.valueOf(codedInputStream.readSInt64());
            case 15:
                return utf8Validation.readString(codedInputStream);
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
