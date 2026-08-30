package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
@androidx.datastore.preferences.protobuf.CheckReturnValue
final class FieldInfo implements java.lang.Comparable<androidx.datastore.preferences.protobuf.FieldInfo> {
    private final java.lang.reflect.Field cachedSizeField;
    private final boolean enforceUtf8;
    private final androidx.datastore.preferences.protobuf.Internal.EnumVerifier enumVerifier;
    private final java.lang.reflect.Field field;
    private final int fieldNumber;
    private final java.lang.Object mapDefaultEntry;
    private final java.lang.Class<?> messageClass;
    private final androidx.datastore.preferences.protobuf.OneofInfo oneof;
    private final java.lang.Class<?> oneofStoredType;
    private final java.lang.reflect.Field presenceField;
    private final int presenceMask;
    private final boolean required;
    private final androidx.datastore.preferences.protobuf.FieldType type;

    private static boolean isExactlyOneBitSet(int value) {
        return value != 0 && (value & (value + (-1))) == 0;
    }

    public static androidx.datastore.preferences.protobuf.FieldInfo forField(java.lang.reflect.Field field, int fieldNumber, androidx.datastore.preferences.protobuf.FieldType fieldType, boolean enforceUtf8) {
        checkFieldNumber(fieldNumber);
        androidx.datastore.preferences.protobuf.Internal.checkNotNull(field, "field");
        androidx.datastore.preferences.protobuf.Internal.checkNotNull(fieldType, "fieldType");
        if (fieldType == androidx.datastore.preferences.protobuf.FieldType.MESSAGE_LIST || fieldType == androidx.datastore.preferences.protobuf.FieldType.GROUP_LIST) {
            throw new java.lang.IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new androidx.datastore.preferences.protobuf.FieldInfo(field, fieldNumber, fieldType, null, null, 0, false, enforceUtf8, null, null, null, null, null);
    }

    public static androidx.datastore.preferences.protobuf.FieldInfo forPackedField(java.lang.reflect.Field field, int fieldNumber, androidx.datastore.preferences.protobuf.FieldType fieldType, java.lang.reflect.Field cachedSizeField) {
        checkFieldNumber(fieldNumber);
        androidx.datastore.preferences.protobuf.Internal.checkNotNull(field, "field");
        androidx.datastore.preferences.protobuf.Internal.checkNotNull(fieldType, "fieldType");
        if (fieldType == androidx.datastore.preferences.protobuf.FieldType.MESSAGE_LIST || fieldType == androidx.datastore.preferences.protobuf.FieldType.GROUP_LIST) {
            throw new java.lang.IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new androidx.datastore.preferences.protobuf.FieldInfo(field, fieldNumber, fieldType, null, null, 0, false, false, null, null, null, null, cachedSizeField);
    }

    public static androidx.datastore.preferences.protobuf.FieldInfo forRepeatedMessageField(java.lang.reflect.Field field, int fieldNumber, androidx.datastore.preferences.protobuf.FieldType fieldType, java.lang.Class<?> messageClass) {
        checkFieldNumber(fieldNumber);
        androidx.datastore.preferences.protobuf.Internal.checkNotNull(field, "field");
        androidx.datastore.preferences.protobuf.Internal.checkNotNull(fieldType, "fieldType");
        androidx.datastore.preferences.protobuf.Internal.checkNotNull(messageClass, "messageClass");
        return new androidx.datastore.preferences.protobuf.FieldInfo(field, fieldNumber, fieldType, messageClass, null, 0, false, false, null, null, null, null, null);
    }

    public static androidx.datastore.preferences.protobuf.FieldInfo forFieldWithEnumVerifier(java.lang.reflect.Field field, int fieldNumber, androidx.datastore.preferences.protobuf.FieldType fieldType, androidx.datastore.preferences.protobuf.Internal.EnumVerifier enumVerifier) {
        checkFieldNumber(fieldNumber);
        androidx.datastore.preferences.protobuf.Internal.checkNotNull(field, "field");
        return new androidx.datastore.preferences.protobuf.FieldInfo(field, fieldNumber, fieldType, null, null, 0, false, false, null, null, null, enumVerifier, null);
    }

    public static androidx.datastore.preferences.protobuf.FieldInfo forPackedFieldWithEnumVerifier(java.lang.reflect.Field field, int fieldNumber, androidx.datastore.preferences.protobuf.FieldType fieldType, androidx.datastore.preferences.protobuf.Internal.EnumVerifier enumVerifier, java.lang.reflect.Field cachedSizeField) {
        checkFieldNumber(fieldNumber);
        androidx.datastore.preferences.protobuf.Internal.checkNotNull(field, "field");
        return new androidx.datastore.preferences.protobuf.FieldInfo(field, fieldNumber, fieldType, null, null, 0, false, false, null, null, null, enumVerifier, cachedSizeField);
    }

    public static androidx.datastore.preferences.protobuf.FieldInfo forExplicitPresenceField(java.lang.reflect.Field field, int fieldNumber, androidx.datastore.preferences.protobuf.FieldType fieldType, java.lang.reflect.Field presenceField, int presenceMask, boolean enforceUtf8, androidx.datastore.preferences.protobuf.Internal.EnumVerifier enumVerifier) {
        checkFieldNumber(fieldNumber);
        androidx.datastore.preferences.protobuf.Internal.checkNotNull(field, "field");
        androidx.datastore.preferences.protobuf.Internal.checkNotNull(fieldType, "fieldType");
        androidx.datastore.preferences.protobuf.Internal.checkNotNull(presenceField, "presenceField");
        if (presenceField != null && !isExactlyOneBitSet(presenceMask)) {
            throw new java.lang.IllegalArgumentException("presenceMask must have exactly one bit set: " + presenceMask);
        }
        return new androidx.datastore.preferences.protobuf.FieldInfo(field, fieldNumber, fieldType, null, presenceField, presenceMask, false, enforceUtf8, null, null, null, enumVerifier, null);
    }

    public static androidx.datastore.preferences.protobuf.FieldInfo forOneofMemberField(int fieldNumber, androidx.datastore.preferences.protobuf.FieldType fieldType, androidx.datastore.preferences.protobuf.OneofInfo oneof, java.lang.Class<?> oneofStoredType, boolean enforceUtf8, androidx.datastore.preferences.protobuf.Internal.EnumVerifier enumVerifier) {
        checkFieldNumber(fieldNumber);
        androidx.datastore.preferences.protobuf.Internal.checkNotNull(fieldType, "fieldType");
        androidx.datastore.preferences.protobuf.Internal.checkNotNull(oneof, "oneof");
        androidx.datastore.preferences.protobuf.Internal.checkNotNull(oneofStoredType, "oneofStoredType");
        if (!fieldType.isScalar()) {
            throw new java.lang.IllegalArgumentException("Oneof is only supported for scalar fields. Field " + fieldNumber + " is of type " + fieldType);
        }
        return new androidx.datastore.preferences.protobuf.FieldInfo(null, fieldNumber, fieldType, null, null, 0, false, enforceUtf8, oneof, oneofStoredType, null, enumVerifier, null);
    }

    private static void checkFieldNumber(int fieldNumber) {
        if (fieldNumber <= 0) {
            throw new java.lang.IllegalArgumentException("fieldNumber must be positive: " + fieldNumber);
        }
    }

    public static androidx.datastore.preferences.protobuf.FieldInfo forLegacyRequiredField(java.lang.reflect.Field field, int fieldNumber, androidx.datastore.preferences.protobuf.FieldType fieldType, java.lang.reflect.Field presenceField, int presenceMask, boolean enforceUtf8, androidx.datastore.preferences.protobuf.Internal.EnumVerifier enumVerifier) {
        checkFieldNumber(fieldNumber);
        androidx.datastore.preferences.protobuf.Internal.checkNotNull(field, "field");
        androidx.datastore.preferences.protobuf.Internal.checkNotNull(fieldType, "fieldType");
        androidx.datastore.preferences.protobuf.Internal.checkNotNull(presenceField, "presenceField");
        if (presenceField != null && !isExactlyOneBitSet(presenceMask)) {
            throw new java.lang.IllegalArgumentException("presenceMask must have exactly one bit set: " + presenceMask);
        }
        return new androidx.datastore.preferences.protobuf.FieldInfo(field, fieldNumber, fieldType, null, presenceField, presenceMask, true, enforceUtf8, null, null, null, enumVerifier, null);
    }

    public static androidx.datastore.preferences.protobuf.FieldInfo forMapField(java.lang.reflect.Field field, int fieldNumber, java.lang.Object mapDefaultEntry, androidx.datastore.preferences.protobuf.Internal.EnumVerifier enumVerifier) {
        androidx.datastore.preferences.protobuf.Internal.checkNotNull(mapDefaultEntry, "mapDefaultEntry");
        checkFieldNumber(fieldNumber);
        androidx.datastore.preferences.protobuf.Internal.checkNotNull(field, "field");
        return new androidx.datastore.preferences.protobuf.FieldInfo(field, fieldNumber, androidx.datastore.preferences.protobuf.FieldType.MAP, null, null, 0, false, true, null, null, mapDefaultEntry, enumVerifier, null);
    }

    private FieldInfo(java.lang.reflect.Field field, int fieldNumber, androidx.datastore.preferences.protobuf.FieldType type, java.lang.Class<?> messageClass, java.lang.reflect.Field presenceField, int presenceMask, boolean required, boolean enforceUtf8, androidx.datastore.preferences.protobuf.OneofInfo oneof, java.lang.Class<?> oneofStoredType, java.lang.Object mapDefaultEntry, androidx.datastore.preferences.protobuf.Internal.EnumVerifier enumVerifier, java.lang.reflect.Field cachedSizeField) {
        this.field = field;
        this.type = type;
        this.messageClass = messageClass;
        this.fieldNumber = fieldNumber;
        this.presenceField = presenceField;
        this.presenceMask = presenceMask;
        this.required = required;
        this.enforceUtf8 = enforceUtf8;
        this.oneof = oneof;
        this.oneofStoredType = oneofStoredType;
        this.mapDefaultEntry = mapDefaultEntry;
        this.enumVerifier = enumVerifier;
        this.cachedSizeField = cachedSizeField;
    }

    public int getFieldNumber() {
        return this.fieldNumber;
    }

    public java.lang.reflect.Field getField() {
        return this.field;
    }

    public androidx.datastore.preferences.protobuf.FieldType getType() {
        return this.type;
    }

    public androidx.datastore.preferences.protobuf.OneofInfo getOneof() {
        return this.oneof;
    }

    public java.lang.Class<?> getOneofStoredType() {
        return this.oneofStoredType;
    }

    public androidx.datastore.preferences.protobuf.Internal.EnumVerifier getEnumVerifier() {
        return this.enumVerifier;
    }

    @Override // java.lang.Comparable
    public int compareTo(androidx.datastore.preferences.protobuf.FieldInfo o) {
        return this.fieldNumber - o.fieldNumber;
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

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.FieldInfo$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$FieldType;

        static {
            int[] iArr = new int[androidx.datastore.preferences.protobuf.FieldType.values().length];
            $SwitchMap$com$google$protobuf$FieldType = iArr;
            try {
                iArr[androidx.datastore.preferences.protobuf.FieldType.MESSAGE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$FieldType[androidx.datastore.preferences.protobuf.FieldType.GROUP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$FieldType[androidx.datastore.preferences.protobuf.FieldType.MESSAGE_LIST.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$FieldType[androidx.datastore.preferences.protobuf.FieldType.GROUP_LIST.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    public java.lang.Class<?> getMessageFieldClass() {
        int i = androidx.datastore.preferences.protobuf.FieldInfo.AnonymousClass1.$SwitchMap$com$google$protobuf$FieldType[this.type.ordinal()];
        if (i == 1 || i == 2) {
            java.lang.reflect.Field field = this.field;
            return field != null ? field.getType() : this.oneofStoredType;
        }
        if (i == 3 || i == 4) {
            return this.messageClass;
        }
        return null;
    }

    public static androidx.datastore.preferences.protobuf.FieldInfo.Builder newBuilder() {
        return new androidx.datastore.preferences.protobuf.FieldInfo.Builder(null);
    }

    public static final class Builder {
        private java.lang.reflect.Field cachedSizeField;
        private boolean enforceUtf8;
        private androidx.datastore.preferences.protobuf.Internal.EnumVerifier enumVerifier;
        private java.lang.reflect.Field field;
        private int fieldNumber;
        private java.lang.Object mapDefaultEntry;
        private androidx.datastore.preferences.protobuf.OneofInfo oneof;
        private java.lang.Class<?> oneofStoredType;
        private java.lang.reflect.Field presenceField;
        private int presenceMask;
        private boolean required;
        private androidx.datastore.preferences.protobuf.FieldType type;

        /* synthetic */ Builder(androidx.datastore.preferences.protobuf.FieldInfo.AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
        }

        public androidx.datastore.preferences.protobuf.FieldInfo.Builder withField(java.lang.reflect.Field field) {
            if (this.oneof != null) {
                throw new java.lang.IllegalStateException("Cannot set field when building a oneof.");
            }
            this.field = field;
            return this;
        }

        public androidx.datastore.preferences.protobuf.FieldInfo.Builder withType(androidx.datastore.preferences.protobuf.FieldType type) {
            this.type = type;
            return this;
        }

        public androidx.datastore.preferences.protobuf.FieldInfo.Builder withFieldNumber(int fieldNumber) {
            this.fieldNumber = fieldNumber;
            return this;
        }

        public androidx.datastore.preferences.protobuf.FieldInfo.Builder withPresence(java.lang.reflect.Field presenceField, int presenceMask) {
            this.presenceField = (java.lang.reflect.Field) androidx.datastore.preferences.protobuf.Internal.checkNotNull(presenceField, "presenceField");
            this.presenceMask = presenceMask;
            return this;
        }

        public androidx.datastore.preferences.protobuf.FieldInfo.Builder withOneof(androidx.datastore.preferences.protobuf.OneofInfo oneof, java.lang.Class<?> oneofStoredType) {
            if (this.field != null || this.presenceField != null) {
                throw new java.lang.IllegalStateException("Cannot set oneof when field or presenceField have been provided");
            }
            this.oneof = oneof;
            this.oneofStoredType = oneofStoredType;
            return this;
        }

        public androidx.datastore.preferences.protobuf.FieldInfo.Builder withRequired(boolean required) {
            this.required = required;
            return this;
        }

        public androidx.datastore.preferences.protobuf.FieldInfo.Builder withMapDefaultEntry(java.lang.Object mapDefaultEntry) {
            this.mapDefaultEntry = mapDefaultEntry;
            return this;
        }

        public androidx.datastore.preferences.protobuf.FieldInfo.Builder withEnforceUtf8(boolean enforceUtf8) {
            this.enforceUtf8 = enforceUtf8;
            return this;
        }

        public androidx.datastore.preferences.protobuf.FieldInfo.Builder withEnumVerifier(androidx.datastore.preferences.protobuf.Internal.EnumVerifier enumVerifier) {
            this.enumVerifier = enumVerifier;
            return this;
        }

        public androidx.datastore.preferences.protobuf.FieldInfo.Builder withCachedSizeField(java.lang.reflect.Field cachedSizeField) {
            this.cachedSizeField = cachedSizeField;
            return this;
        }

        public androidx.datastore.preferences.protobuf.FieldInfo build() {
            androidx.datastore.preferences.protobuf.OneofInfo oneofInfo = this.oneof;
            if (oneofInfo != null) {
                return androidx.datastore.preferences.protobuf.FieldInfo.forOneofMemberField(this.fieldNumber, this.type, oneofInfo, this.oneofStoredType, this.enforceUtf8, this.enumVerifier);
            }
            java.lang.Object obj = this.mapDefaultEntry;
            if (obj != null) {
                return androidx.datastore.preferences.protobuf.FieldInfo.forMapField(this.field, this.fieldNumber, obj, this.enumVerifier);
            }
            java.lang.reflect.Field field = this.presenceField;
            if (field != null) {
                if (this.required) {
                    return androidx.datastore.preferences.protobuf.FieldInfo.forLegacyRequiredField(this.field, this.fieldNumber, this.type, field, this.presenceMask, this.enforceUtf8, this.enumVerifier);
                }
                return androidx.datastore.preferences.protobuf.FieldInfo.forExplicitPresenceField(this.field, this.fieldNumber, this.type, field, this.presenceMask, this.enforceUtf8, this.enumVerifier);
            }
            androidx.datastore.preferences.protobuf.Internal.EnumVerifier enumVerifier = this.enumVerifier;
            if (enumVerifier != null) {
                java.lang.reflect.Field field2 = this.cachedSizeField;
                if (field2 == null) {
                    return androidx.datastore.preferences.protobuf.FieldInfo.forFieldWithEnumVerifier(this.field, this.fieldNumber, this.type, enumVerifier);
                }
                return androidx.datastore.preferences.protobuf.FieldInfo.forPackedFieldWithEnumVerifier(this.field, this.fieldNumber, this.type, enumVerifier, field2);
            }
            java.lang.reflect.Field field3 = this.cachedSizeField;
            if (field3 == null) {
                return androidx.datastore.preferences.protobuf.FieldInfo.forField(this.field, this.fieldNumber, this.type, this.enforceUtf8);
            }
            return androidx.datastore.preferences.protobuf.FieldInfo.forPackedField(this.field, this.fieldNumber, this.type, field3);
        }
    }
}
