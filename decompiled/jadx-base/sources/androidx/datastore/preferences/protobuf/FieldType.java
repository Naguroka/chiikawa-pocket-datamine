package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public enum FieldType {
    DOUBLE(0, androidx.datastore.preferences.protobuf.FieldType.Collection.SCALAR, androidx.datastore.preferences.protobuf.JavaType.DOUBLE),
    FLOAT(1, androidx.datastore.preferences.protobuf.FieldType.Collection.SCALAR, androidx.datastore.preferences.protobuf.JavaType.FLOAT),
    INT64(2, androidx.datastore.preferences.protobuf.FieldType.Collection.SCALAR, androidx.datastore.preferences.protobuf.JavaType.LONG),
    UINT64(3, androidx.datastore.preferences.protobuf.FieldType.Collection.SCALAR, androidx.datastore.preferences.protobuf.JavaType.LONG),
    INT32(4, androidx.datastore.preferences.protobuf.FieldType.Collection.SCALAR, androidx.datastore.preferences.protobuf.JavaType.INT),
    FIXED64(5, androidx.datastore.preferences.protobuf.FieldType.Collection.SCALAR, androidx.datastore.preferences.protobuf.JavaType.LONG),
    FIXED32(6, androidx.datastore.preferences.protobuf.FieldType.Collection.SCALAR, androidx.datastore.preferences.protobuf.JavaType.INT),
    BOOL(7, androidx.datastore.preferences.protobuf.FieldType.Collection.SCALAR, androidx.datastore.preferences.protobuf.JavaType.BOOLEAN),
    STRING(8, androidx.datastore.preferences.protobuf.FieldType.Collection.SCALAR, androidx.datastore.preferences.protobuf.JavaType.STRING),
    MESSAGE(9, androidx.datastore.preferences.protobuf.FieldType.Collection.SCALAR, androidx.datastore.preferences.protobuf.JavaType.MESSAGE),
    BYTES(10, androidx.datastore.preferences.protobuf.FieldType.Collection.SCALAR, androidx.datastore.preferences.protobuf.JavaType.BYTE_STRING),
    UINT32(11, androidx.datastore.preferences.protobuf.FieldType.Collection.SCALAR, androidx.datastore.preferences.protobuf.JavaType.INT),
    ENUM(12, androidx.datastore.preferences.protobuf.FieldType.Collection.SCALAR, androidx.datastore.preferences.protobuf.JavaType.ENUM),
    SFIXED32(13, androidx.datastore.preferences.protobuf.FieldType.Collection.SCALAR, androidx.datastore.preferences.protobuf.JavaType.INT),
    SFIXED64(14, androidx.datastore.preferences.protobuf.FieldType.Collection.SCALAR, androidx.datastore.preferences.protobuf.JavaType.LONG),
    SINT32(15, androidx.datastore.preferences.protobuf.FieldType.Collection.SCALAR, androidx.datastore.preferences.protobuf.JavaType.INT),
    SINT64(16, androidx.datastore.preferences.protobuf.FieldType.Collection.SCALAR, androidx.datastore.preferences.protobuf.JavaType.LONG),
    GROUP(17, androidx.datastore.preferences.protobuf.FieldType.Collection.SCALAR, androidx.datastore.preferences.protobuf.JavaType.MESSAGE),
    DOUBLE_LIST(18, androidx.datastore.preferences.protobuf.FieldType.Collection.VECTOR, androidx.datastore.preferences.protobuf.JavaType.DOUBLE),
    FLOAT_LIST(19, androidx.datastore.preferences.protobuf.FieldType.Collection.VECTOR, androidx.datastore.preferences.protobuf.JavaType.FLOAT),
    INT64_LIST(20, androidx.datastore.preferences.protobuf.FieldType.Collection.VECTOR, androidx.datastore.preferences.protobuf.JavaType.LONG),
    UINT64_LIST(21, androidx.datastore.preferences.protobuf.FieldType.Collection.VECTOR, androidx.datastore.preferences.protobuf.JavaType.LONG),
    INT32_LIST(22, androidx.datastore.preferences.protobuf.FieldType.Collection.VECTOR, androidx.datastore.preferences.protobuf.JavaType.INT),
    FIXED64_LIST(23, androidx.datastore.preferences.protobuf.FieldType.Collection.VECTOR, androidx.datastore.preferences.protobuf.JavaType.LONG),
    FIXED32_LIST(24, androidx.datastore.preferences.protobuf.FieldType.Collection.VECTOR, androidx.datastore.preferences.protobuf.JavaType.INT),
    BOOL_LIST(25, androidx.datastore.preferences.protobuf.FieldType.Collection.VECTOR, androidx.datastore.preferences.protobuf.JavaType.BOOLEAN),
    STRING_LIST(26, androidx.datastore.preferences.protobuf.FieldType.Collection.VECTOR, androidx.datastore.preferences.protobuf.JavaType.STRING),
    MESSAGE_LIST(27, androidx.datastore.preferences.protobuf.FieldType.Collection.VECTOR, androidx.datastore.preferences.protobuf.JavaType.MESSAGE),
    BYTES_LIST(28, androidx.datastore.preferences.protobuf.FieldType.Collection.VECTOR, androidx.datastore.preferences.protobuf.JavaType.BYTE_STRING),
    UINT32_LIST(29, androidx.datastore.preferences.protobuf.FieldType.Collection.VECTOR, androidx.datastore.preferences.protobuf.JavaType.INT),
    ENUM_LIST(30, androidx.datastore.preferences.protobuf.FieldType.Collection.VECTOR, androidx.datastore.preferences.protobuf.JavaType.ENUM),
    SFIXED32_LIST(31, androidx.datastore.preferences.protobuf.FieldType.Collection.VECTOR, androidx.datastore.preferences.protobuf.JavaType.INT),
    SFIXED64_LIST(32, androidx.datastore.preferences.protobuf.FieldType.Collection.VECTOR, androidx.datastore.preferences.protobuf.JavaType.LONG),
    SINT32_LIST(33, androidx.datastore.preferences.protobuf.FieldType.Collection.VECTOR, androidx.datastore.preferences.protobuf.JavaType.INT),
    SINT64_LIST(34, androidx.datastore.preferences.protobuf.FieldType.Collection.VECTOR, androidx.datastore.preferences.protobuf.JavaType.LONG),
    DOUBLE_LIST_PACKED(35, androidx.datastore.preferences.protobuf.FieldType.Collection.PACKED_VECTOR, androidx.datastore.preferences.protobuf.JavaType.DOUBLE),
    FLOAT_LIST_PACKED(36, androidx.datastore.preferences.protobuf.FieldType.Collection.PACKED_VECTOR, androidx.datastore.preferences.protobuf.JavaType.FLOAT),
    INT64_LIST_PACKED(37, androidx.datastore.preferences.protobuf.FieldType.Collection.PACKED_VECTOR, androidx.datastore.preferences.protobuf.JavaType.LONG),
    UINT64_LIST_PACKED(38, androidx.datastore.preferences.protobuf.FieldType.Collection.PACKED_VECTOR, androidx.datastore.preferences.protobuf.JavaType.LONG),
    INT32_LIST_PACKED(39, androidx.datastore.preferences.protobuf.FieldType.Collection.PACKED_VECTOR, androidx.datastore.preferences.protobuf.JavaType.INT),
    FIXED64_LIST_PACKED(40, androidx.datastore.preferences.protobuf.FieldType.Collection.PACKED_VECTOR, androidx.datastore.preferences.protobuf.JavaType.LONG),
    FIXED32_LIST_PACKED(41, androidx.datastore.preferences.protobuf.FieldType.Collection.PACKED_VECTOR, androidx.datastore.preferences.protobuf.JavaType.INT),
    BOOL_LIST_PACKED(42, androidx.datastore.preferences.protobuf.FieldType.Collection.PACKED_VECTOR, androidx.datastore.preferences.protobuf.JavaType.BOOLEAN),
    UINT32_LIST_PACKED(43, androidx.datastore.preferences.protobuf.FieldType.Collection.PACKED_VECTOR, androidx.datastore.preferences.protobuf.JavaType.INT),
    ENUM_LIST_PACKED(44, androidx.datastore.preferences.protobuf.FieldType.Collection.PACKED_VECTOR, androidx.datastore.preferences.protobuf.JavaType.ENUM),
    SFIXED32_LIST_PACKED(45, androidx.datastore.preferences.protobuf.FieldType.Collection.PACKED_VECTOR, androidx.datastore.preferences.protobuf.JavaType.INT),
    SFIXED64_LIST_PACKED(46, androidx.datastore.preferences.protobuf.FieldType.Collection.PACKED_VECTOR, androidx.datastore.preferences.protobuf.JavaType.LONG),
    SINT32_LIST_PACKED(47, androidx.datastore.preferences.protobuf.FieldType.Collection.PACKED_VECTOR, androidx.datastore.preferences.protobuf.JavaType.INT),
    SINT64_LIST_PACKED(48, androidx.datastore.preferences.protobuf.FieldType.Collection.PACKED_VECTOR, androidx.datastore.preferences.protobuf.JavaType.LONG),
    GROUP_LIST(49, androidx.datastore.preferences.protobuf.FieldType.Collection.VECTOR, androidx.datastore.preferences.protobuf.JavaType.MESSAGE),
    MAP(50, androidx.datastore.preferences.protobuf.FieldType.Collection.MAP, androidx.datastore.preferences.protobuf.JavaType.VOID);

    private static final java.lang.reflect.Type[] EMPTY_TYPES = new java.lang.reflect.Type[0];
    private static final androidx.datastore.preferences.protobuf.FieldType[] VALUES;
    private final androidx.datastore.preferences.protobuf.FieldType.Collection collection;
    private final java.lang.Class<?> elementType;
    private final int id;
    private final androidx.datastore.preferences.protobuf.JavaType javaType;
    private final boolean primitiveScalar;

    static {
        androidx.datastore.preferences.protobuf.FieldType[] fieldTypeArrValues = values();
        VALUES = new androidx.datastore.preferences.protobuf.FieldType[fieldTypeArrValues.length];
        for (androidx.datastore.preferences.protobuf.FieldType fieldType : fieldTypeArrValues) {
            VALUES[fieldType.id] = fieldType;
        }
    }

    FieldType(int id, androidx.datastore.preferences.protobuf.FieldType.Collection collection, androidx.datastore.preferences.protobuf.JavaType javaType) {
        int i;
        this.id = id;
        this.collection = collection;
        this.javaType = javaType;
        int i2 = androidx.datastore.preferences.protobuf.FieldType.AnonymousClass1.$SwitchMap$com$google$protobuf$FieldType$Collection[collection.ordinal()];
        if (i2 == 1 || i2 == 2) {
            this.elementType = javaType.getBoxedType();
        } else {
            this.elementType = null;
        }
        this.primitiveScalar = (collection != androidx.datastore.preferences.protobuf.FieldType.Collection.SCALAR || (i = androidx.datastore.preferences.protobuf.FieldType.AnonymousClass1.$SwitchMap$com$google$protobuf$JavaType[javaType.ordinal()]) == 1 || i == 2 || i == 3) ? false : true;
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.FieldType$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$FieldType$Collection;
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$JavaType;

        static {
            int[] iArr = new int[androidx.datastore.preferences.protobuf.JavaType.values().length];
            $SwitchMap$com$google$protobuf$JavaType = iArr;
            try {
                iArr[androidx.datastore.preferences.protobuf.JavaType.BYTE_STRING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$JavaType[androidx.datastore.preferences.protobuf.JavaType.MESSAGE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$JavaType[androidx.datastore.preferences.protobuf.JavaType.STRING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[androidx.datastore.preferences.protobuf.FieldType.Collection.values().length];
            $SwitchMap$com$google$protobuf$FieldType$Collection = iArr2;
            try {
                iArr2[androidx.datastore.preferences.protobuf.FieldType.Collection.MAP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$FieldType$Collection[androidx.datastore.preferences.protobuf.FieldType.Collection.VECTOR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$FieldType$Collection[androidx.datastore.preferences.protobuf.FieldType.Collection.SCALAR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    public int id() {
        return this.id;
    }

    public androidx.datastore.preferences.protobuf.JavaType getJavaType() {
        return this.javaType;
    }

    public boolean isPacked() {
        return androidx.datastore.preferences.protobuf.FieldType.Collection.PACKED_VECTOR.equals(this.collection);
    }

    public boolean isPrimitiveScalar() {
        return this.primitiveScalar;
    }

    public boolean isScalar() {
        return this.collection == androidx.datastore.preferences.protobuf.FieldType.Collection.SCALAR;
    }

    public boolean isList() {
        return this.collection.isList();
    }

    public boolean isMap() {
        return this.collection == androidx.datastore.preferences.protobuf.FieldType.Collection.MAP;
    }

    public boolean isValidForField(java.lang.reflect.Field field) {
        if (androidx.datastore.preferences.protobuf.FieldType.Collection.VECTOR.equals(this.collection)) {
            return isValidForList(field);
        }
        return this.javaType.getType().isAssignableFrom(field.getType());
    }

    private boolean isValidForList(java.lang.reflect.Field field) {
        java.lang.Class<?> type = field.getType();
        if (!this.javaType.getType().isAssignableFrom(type)) {
            return false;
        }
        java.lang.reflect.Type[] actualTypeArguments = EMPTY_TYPES;
        if (field.getGenericType() instanceof java.lang.reflect.ParameterizedType) {
            actualTypeArguments = ((java.lang.reflect.ParameterizedType) field.getGenericType()).getActualTypeArguments();
        }
        java.lang.reflect.Type listParameter = getListParameter(type, actualTypeArguments);
        if (listParameter instanceof java.lang.Class) {
            return this.elementType.isAssignableFrom((java.lang.Class) listParameter);
        }
        return true;
    }

    public static androidx.datastore.preferences.protobuf.FieldType forId(int id) {
        if (id < 0) {
            return null;
        }
        androidx.datastore.preferences.protobuf.FieldType[] fieldTypeArr = VALUES;
        if (id >= fieldTypeArr.length) {
            return null;
        }
        return fieldTypeArr[id];
    }

    private static java.lang.reflect.Type getGenericSuperList(java.lang.Class<?> clazz) {
        for (java.lang.reflect.Type type : clazz.getGenericInterfaces()) {
            if ((type instanceof java.lang.reflect.ParameterizedType) && java.util.List.class.isAssignableFrom((java.lang.Class) ((java.lang.reflect.ParameterizedType) type).getRawType())) {
                return type;
            }
        }
        java.lang.reflect.Type genericSuperclass = clazz.getGenericSuperclass();
        if ((genericSuperclass instanceof java.lang.reflect.ParameterizedType) && java.util.List.class.isAssignableFrom((java.lang.Class) ((java.lang.reflect.ParameterizedType) genericSuperclass).getRawType())) {
            return genericSuperclass;
        }
        return null;
    }

    private static java.lang.reflect.Type getListParameter(java.lang.Class<?> clazz, java.lang.reflect.Type[] realTypes) {
        boolean z;
        while (true) {
            int i = 0;
            if (clazz != java.util.List.class) {
                java.lang.reflect.Type genericSuperList = getGenericSuperList(clazz);
                if (genericSuperList instanceof java.lang.reflect.ParameterizedType) {
                    java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) genericSuperList;
                    java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    for (int i2 = 0; i2 < actualTypeArguments.length; i2++) {
                        java.lang.reflect.Type type = actualTypeArguments[i2];
                        if (type instanceof java.lang.reflect.TypeVariable) {
                            java.lang.reflect.TypeVariable<java.lang.Class<?>>[] typeParameters = clazz.getTypeParameters();
                            if (realTypes.length != typeParameters.length) {
                                throw new java.lang.RuntimeException("Type array mismatch");
                            }
                            int i3 = 0;
                            while (true) {
                                if (i3 >= typeParameters.length) {
                                    z = false;
                                    break;
                                }
                                if (type == typeParameters[i3]) {
                                    actualTypeArguments[i2] = realTypes[i3];
                                    z = true;
                                    break;
                                }
                                i3++;
                            }
                            if (!z) {
                                throw new java.lang.RuntimeException("Unable to find replacement for " + type);
                            }
                        }
                    }
                    clazz = (java.lang.Class) parameterizedType.getRawType();
                    realTypes = actualTypeArguments;
                } else {
                    realTypes = EMPTY_TYPES;
                    java.lang.Class<?>[] interfaces = clazz.getInterfaces();
                    int length = interfaces.length;
                    while (true) {
                        if (i < length) {
                            java.lang.Class<?> cls = interfaces[i];
                            if (java.util.List.class.isAssignableFrom(cls)) {
                                clazz = cls;
                                break;
                            }
                            i++;
                        } else {
                            clazz = clazz.getSuperclass();
                            break;
                        }
                    }
                }
            } else {
                if (realTypes.length != 1) {
                    throw new java.lang.RuntimeException("Unable to identify parameter type for List<T>");
                }
                return realTypes[0];
            }
        }
    }

    enum Collection {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);

        private final boolean isList;

        Collection(boolean isList) {
            this.isList = isList;
        }

        public boolean isList() {
            return this.isList;
        }
    }
}
