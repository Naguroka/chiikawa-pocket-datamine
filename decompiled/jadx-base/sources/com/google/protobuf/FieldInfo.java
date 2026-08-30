package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
@com.google.protobuf.CheckReturnValue
final class FieldInfo implements java.lang.Comparable<com.google.protobuf.FieldInfo> {
    private final java.lang.reflect.Field cachedSizeField;
    private final boolean enforceUtf8;
    private final com.google.protobuf.Internal.EnumVerifier enumVerifier;
    private final java.lang.reflect.Field field;
    private final int fieldNumber;
    private final java.lang.Object mapDefaultEntry;
    private final java.lang.Class<?> messageClass;
    private final com.google.protobuf.OneofInfo oneof;
    private final java.lang.Class<?> oneofStoredType;
    private final java.lang.reflect.Field presenceField;
    private final int presenceMask;
    private final boolean required;
    private final com.google.protobuf.FieldType type;

    private static boolean isExactlyOneBitSet(int i) {
        return i != 0 && (i & (i + (-1))) == 0;
    }

    public static com.google.protobuf.FieldInfo forField(java.lang.reflect.Field field, int i, com.google.protobuf.FieldType fieldType, boolean z) {
        checkFieldNumber(i);
        com.google.protobuf.Internal.checkNotNull(field, "field");
        com.google.protobuf.Internal.checkNotNull(fieldType, "fieldType");
        if (fieldType == com.google.protobuf.FieldType.MESSAGE_LIST || fieldType == com.google.protobuf.FieldType.GROUP_LIST) {
            throw new java.lang.IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new com.google.protobuf.FieldInfo(field, i, fieldType, null, null, 0, false, z, null, null, null, null, null);
    }

    public static com.google.protobuf.FieldInfo forPackedField(java.lang.reflect.Field field, int i, com.google.protobuf.FieldType fieldType, java.lang.reflect.Field field2) {
        checkFieldNumber(i);
        com.google.protobuf.Internal.checkNotNull(field, "field");
        com.google.protobuf.Internal.checkNotNull(fieldType, "fieldType");
        if (fieldType == com.google.protobuf.FieldType.MESSAGE_LIST || fieldType == com.google.protobuf.FieldType.GROUP_LIST) {
            throw new java.lang.IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new com.google.protobuf.FieldInfo(field, i, fieldType, null, null, 0, false, false, null, null, null, null, field2);
    }

    public static com.google.protobuf.FieldInfo forRepeatedMessageField(java.lang.reflect.Field field, int i, com.google.protobuf.FieldType fieldType, java.lang.Class<?> cls) {
        checkFieldNumber(i);
        com.google.protobuf.Internal.checkNotNull(field, "field");
        com.google.protobuf.Internal.checkNotNull(fieldType, "fieldType");
        com.google.protobuf.Internal.checkNotNull(cls, "messageClass");
        return new com.google.protobuf.FieldInfo(field, i, fieldType, cls, null, 0, false, false, null, null, null, null, null);
    }

    public static com.google.protobuf.FieldInfo forFieldWithEnumVerifier(java.lang.reflect.Field field, int i, com.google.protobuf.FieldType fieldType, com.google.protobuf.Internal.EnumVerifier enumVerifier) {
        checkFieldNumber(i);
        com.google.protobuf.Internal.checkNotNull(field, "field");
        return new com.google.protobuf.FieldInfo(field, i, fieldType, null, null, 0, false, false, null, null, null, enumVerifier, null);
    }

    public static com.google.protobuf.FieldInfo forPackedFieldWithEnumVerifier(java.lang.reflect.Field field, int i, com.google.protobuf.FieldType fieldType, com.google.protobuf.Internal.EnumVerifier enumVerifier, java.lang.reflect.Field field2) {
        checkFieldNumber(i);
        com.google.protobuf.Internal.checkNotNull(field, "field");
        return new com.google.protobuf.FieldInfo(field, i, fieldType, null, null, 0, false, false, null, null, null, enumVerifier, field2);
    }

    public static com.google.protobuf.FieldInfo forProto2OptionalField(java.lang.reflect.Field field, int i, com.google.protobuf.FieldType fieldType, java.lang.reflect.Field field2, int i2, boolean z, com.google.protobuf.Internal.EnumVerifier enumVerifier) {
        checkFieldNumber(i);
        com.google.protobuf.Internal.checkNotNull(field, "field");
        com.google.protobuf.Internal.checkNotNull(fieldType, "fieldType");
        com.google.protobuf.Internal.checkNotNull(field2, "presenceField");
        if (field2 != null && !isExactlyOneBitSet(i2)) {
            throw new java.lang.IllegalArgumentException("presenceMask must have exactly one bit set: " + i2);
        }
        return new com.google.protobuf.FieldInfo(field, i, fieldType, null, field2, i2, false, z, null, null, null, enumVerifier, null);
    }

    public static com.google.protobuf.FieldInfo forOneofMemberField(int i, com.google.protobuf.FieldType fieldType, com.google.protobuf.OneofInfo oneofInfo, java.lang.Class<?> cls, boolean z, com.google.protobuf.Internal.EnumVerifier enumVerifier) {
        checkFieldNumber(i);
        com.google.protobuf.Internal.checkNotNull(fieldType, "fieldType");
        com.google.protobuf.Internal.checkNotNull(oneofInfo, "oneof");
        com.google.protobuf.Internal.checkNotNull(cls, "oneofStoredType");
        if (!fieldType.isScalar()) {
            throw new java.lang.IllegalArgumentException("Oneof is only supported for scalar fields. Field " + i + " is of type " + fieldType);
        }
        return new com.google.protobuf.FieldInfo(null, i, fieldType, null, null, 0, false, z, oneofInfo, cls, null, enumVerifier, null);
    }

    private static void checkFieldNumber(int i) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("fieldNumber must be positive: " + i);
        }
    }

    public static com.google.protobuf.FieldInfo forProto2RequiredField(java.lang.reflect.Field field, int i, com.google.protobuf.FieldType fieldType, java.lang.reflect.Field field2, int i2, boolean z, com.google.protobuf.Internal.EnumVerifier enumVerifier) {
        checkFieldNumber(i);
        com.google.protobuf.Internal.checkNotNull(field, "field");
        com.google.protobuf.Internal.checkNotNull(fieldType, "fieldType");
        com.google.protobuf.Internal.checkNotNull(field2, "presenceField");
        if (field2 != null && !isExactlyOneBitSet(i2)) {
            throw new java.lang.IllegalArgumentException("presenceMask must have exactly one bit set: " + i2);
        }
        return new com.google.protobuf.FieldInfo(field, i, fieldType, null, field2, i2, true, z, null, null, null, enumVerifier, null);
    }

    public static com.google.protobuf.FieldInfo forMapField(java.lang.reflect.Field field, int i, java.lang.Object obj, com.google.protobuf.Internal.EnumVerifier enumVerifier) {
        com.google.protobuf.Internal.checkNotNull(obj, "mapDefaultEntry");
        checkFieldNumber(i);
        com.google.protobuf.Internal.checkNotNull(field, "field");
        return new com.google.protobuf.FieldInfo(field, i, com.google.protobuf.FieldType.MAP, null, null, 0, false, true, null, null, obj, enumVerifier, null);
    }

    private FieldInfo(java.lang.reflect.Field field, int i, com.google.protobuf.FieldType fieldType, java.lang.Class<?> cls, java.lang.reflect.Field field2, int i2, boolean z, boolean z2, com.google.protobuf.OneofInfo oneofInfo, java.lang.Class<?> cls2, java.lang.Object obj, com.google.protobuf.Internal.EnumVerifier enumVerifier, java.lang.reflect.Field field3) {
        this.field = field;
        this.type = fieldType;
        this.messageClass = cls;
        this.fieldNumber = i;
        this.presenceField = field2;
        this.presenceMask = i2;
        this.required = z;
        this.enforceUtf8 = z2;
        this.oneof = oneofInfo;
        this.oneofStoredType = cls2;
        this.mapDefaultEntry = obj;
        this.enumVerifier = enumVerifier;
        this.cachedSizeField = field3;
    }

    public int getFieldNumber() {
        return this.fieldNumber;
    }

    public java.lang.reflect.Field getField() {
        return this.field;
    }

    public com.google.protobuf.FieldType getType() {
        return this.type;
    }

    public com.google.protobuf.OneofInfo getOneof() {
        return this.oneof;
    }

    public java.lang.Class<?> getOneofStoredType() {
        return this.oneofStoredType;
    }

    public com.google.protobuf.Internal.EnumVerifier getEnumVerifier() {
        return this.enumVerifier;
    }

    @Override // java.lang.Comparable
    public int compareTo(com.google.protobuf.FieldInfo fieldInfo) {
        return this.fieldNumber - fieldInfo.fieldNumber;
    }

    public java.lang.Class<?> getListElementType() {
        return this.messageClass;
    }

    public java.lang.reflect.Field getPresenceField() {
        return this.presenceField;
    }

    public java.lang.Object getMapDefaultEntry() {
        return this.mapDefaultEntry;
    }

    public int getPresenceMask() {
        return this.presenceMask;
    }

    public boolean isRequired() {
        return this.required;
    }

    public boolean isEnforceUtf8() {
        return this.enforceUtf8;
    }

    public java.lang.reflect.Field getCachedSizeField() {
        return this.cachedSizeField;
    }

    /* JADX INFO: renamed from: com.google.protobuf.FieldInfo$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$FieldType;

        static {
            int[] iArr = new int[com.google.protobuf.FieldType.values().length];
            $SwitchMap$com$google$protobuf$FieldType = iArr;
            try {
                iArr[com.google.protobuf.FieldType.MESSAGE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$FieldType[com.google.protobuf.FieldType.GROUP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$FieldType[com.google.protobuf.FieldType.MESSAGE_LIST.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$FieldType[com.google.protobuf.FieldType.GROUP_LIST.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    public java.lang.Class<?> getMessageFieldClass() {
        int i = com.google.protobuf.FieldInfo.AnonymousClass1.$SwitchMap$com$google$protobuf$FieldType[this.type.ordinal()];
        if (i == 1 || i == 2) {
            java.lang.reflect.Field field = this.field;
            return field != null ? field.getType() : this.oneofStoredType;
        }
        if (i == 3 || i == 4) {
            return this.messageClass;
        }
        return null;
    }

    public static com.google.protobuf.FieldInfo.Builder newBuilder() {
        return new com.google.protobuf.FieldInfo.Builder(null);
    }

    public static final class Builder {
        private java.lang.reflect.Field cachedSizeField;
        private boolean enforceUtf8;
        private com.google.protobuf.Internal.EnumVerifier enumVerifier;
        private java.lang.reflect.Field field;
        private int fieldNumber;
        private java.lang.Object mapDefaultEntry;
        private com.google.protobuf.OneofInfo oneof;
        private java.lang.Class<?> oneofStoredType;
        private java.lang.reflect.Field presenceField;
        private int presenceMask;
        private boolean required;
        private com.google.protobuf.FieldType type;

        /* synthetic */ Builder(com.google.protobuf.FieldInfo.AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
        }

        public com.google.protobuf.FieldInfo.Builder withField(java.lang.reflect.Field field) {
            if (this.oneof != null) {
                throw new java.lang.IllegalStateException("Cannot set field when building a oneof.");
            }
            this.field = field;
            return this;
        }

        public com.google.protobuf.FieldInfo.Builder withType(com.google.protobuf.FieldType fieldType) {
            this.type = fieldType;
            return this;
        }

        public com.google.protobuf.FieldInfo.Builder withFieldNumber(int i) {
            this.fieldNumber = i;
            return this;
        }

        public com.google.protobuf.FieldInfo.Builder withPresence(java.lang.reflect.Field field, int i) {
            this.presenceField = (java.lang.reflect.Field) com.google.protobuf.Internal.checkNotNull(field, "presenceField");
            this.presenceMask = i;
            return this;
        }

        public com.google.protobuf.FieldInfo.Builder withOneof(com.google.protobuf.OneofInfo oneofInfo, java.lang.Class<?> cls) {
            if (this.field != null || this.presenceField != null) {
                throw new java.lang.IllegalStateException("Cannot set oneof when field or presenceField have been provided");
            }
            this.oneof = oneofInfo;
            this.oneofStoredType = cls;
            return this;
        }

        public com.google.protobuf.FieldInfo.Builder withRequired(boolean z) {
            this.required = z;
            return this;
        }

        public com.google.protobuf.FieldInfo.Builder withMapDefaultEntry(java.lang.Object obj) {
            this.mapDefaultEntry = obj;
            return this;
        }

        public com.google.protobuf.FieldInfo.Builder withEnforceUtf8(boolean z) {
            this.enforceUtf8 = z;
            return this;
        }

        public com.google.protobuf.FieldInfo.Builder withEnumVerifier(com.google.protobuf.Internal.EnumVerifier enumVerifier) {
            this.enumVerifier = enumVerifier;
            return this;
        }

        public com.google.protobuf.FieldInfo.Builder withCachedSizeField(java.lang.reflect.Field field) {
            this.cachedSizeField = field;
            return this;
        }

        public com.google.protobuf.FieldInfo build() {
            com.google.protobuf.OneofInfo oneofInfo = this.oneof;
            if (oneofInfo != null) {
                return com.google.protobuf.FieldInfo.forOneofMemberField(this.fieldNumber, this.type, oneofInfo, this.oneofStoredType, this.enforceUtf8, this.enumVerifier);
            }
            java.lang.Object obj = this.mapDefaultEntry;
            if (obj != null) {
                return com.google.protobuf.FieldInfo.forMapField(this.field, this.fieldNumber, obj, this.enumVerifier);
            }
            java.lang.reflect.Field field = this.presenceField;
            if (field != null) {
                if (this.required) {
                    return com.google.protobuf.FieldInfo.forProto2RequiredField(this.field, this.fieldNumber, this.type, field, this.presenceMask, this.enforceUtf8, this.enumVerifier);
                }
                return com.google.protobuf.FieldInfo.forProto2OptionalField(this.field, this.fieldNumber, this.type, field, this.presenceMask, this.enforceUtf8, this.enumVerifier);
            }
            com.google.protobuf.Internal.EnumVerifier enumVerifier = this.enumVerifier;
            if (enumVerifier != null) {
                java.lang.reflect.Field field2 = this.cachedSizeField;
                if (field2 == null) {
                    return com.google.protobuf.FieldInfo.forFieldWithEnumVerifier(this.field, this.fieldNumber, this.type, enumVerifier);
                }
                return com.google.protobuf.FieldInfo.forPackedFieldWithEnumVerifier(this.field, this.fieldNumber, this.type, enumVerifier, field2);
            }
            java.lang.reflect.Field field3 = this.cachedSizeField;
            if (field3 == null) {
                return com.google.protobuf.FieldInfo.forField(this.field, this.fieldNumber, this.type, this.enforceUtf8);
            }
            return com.google.protobuf.FieldInfo.forPackedField(this.field, this.fieldNumber, this.type, field3);
        }
    }
}
