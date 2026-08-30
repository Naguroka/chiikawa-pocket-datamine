package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
@com.google.protobuf.CheckReturnValue
final class MessageSchema<T> implements com.google.protobuf.Schema<T> {
    private static final int ENFORCE_UTF8_MASK = 536870912;
    private static final int FIELD_TYPE_MASK = 267386880;
    private static final int INTS_PER_FIELD = 3;
    private static final int NO_PRESENCE_SENTINEL = 1048575;
    private static final int OFFSET_BITS = 20;
    private static final int OFFSET_MASK = 1048575;
    static final int ONEOF_TYPE_OFFSET = 51;
    private static final int REQUIRED_MASK = 268435456;
    private final int[] buffer;
    private final int checkInitializedCount;
    private final com.google.protobuf.MessageLite defaultInstance;
    private final com.google.protobuf.ExtensionSchema<?> extensionSchema;
    private final boolean hasExtensions;
    private final int[] intArray;
    private final com.google.protobuf.ListFieldSchema listFieldSchema;
    private final boolean lite;
    private final com.google.protobuf.MapFieldSchema mapFieldSchema;
    private final int maxFieldNumber;
    private final int minFieldNumber;
    private final com.google.protobuf.NewInstanceSchema newInstanceSchema;
    private final java.lang.Object[] objects;
    private final boolean proto3;
    private final int repeatedFieldOffsetStart;
    private final com.google.protobuf.UnknownFieldSchema<?, ?> unknownFieldSchema;
    private final boolean useCachedSizeField;
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final sun.misc.Unsafe UNSAFE = com.google.protobuf.UnsafeUtil.getUnsafe();

    private static boolean isEnforceUtf8(int i) {
        return (i & 536870912) != 0;
    }

    private static boolean isRequired(int i) {
        return (i & 268435456) != 0;
    }

    private static long offset(int i) {
        return i & 1048575;
    }

    private static int type(int i) {
        return (i & FIELD_TYPE_MASK) >>> 20;
    }

    private MessageSchema(int[] iArr, java.lang.Object[] objArr, int i, int i2, com.google.protobuf.MessageLite messageLite, boolean z, boolean z2, int[] iArr2, int i3, int i4, com.google.protobuf.NewInstanceSchema newInstanceSchema, com.google.protobuf.ListFieldSchema listFieldSchema, com.google.protobuf.UnknownFieldSchema<?, ?> unknownFieldSchema, com.google.protobuf.ExtensionSchema<?> extensionSchema, com.google.protobuf.MapFieldSchema mapFieldSchema) {
        this.buffer = iArr;
        this.objects = objArr;
        this.minFieldNumber = i;
        this.maxFieldNumber = i2;
        this.lite = messageLite instanceof com.google.protobuf.GeneratedMessageLite;
        this.proto3 = z;
        this.hasExtensions = extensionSchema != null && extensionSchema.hasExtensions(messageLite);
        this.useCachedSizeField = z2;
        this.intArray = iArr2;
        this.checkInitializedCount = i3;
        this.repeatedFieldOffsetStart = i4;
        this.newInstanceSchema = newInstanceSchema;
        this.listFieldSchema = listFieldSchema;
        this.unknownFieldSchema = unknownFieldSchema;
        this.extensionSchema = extensionSchema;
        this.defaultInstance = messageLite;
        this.mapFieldSchema = mapFieldSchema;
    }

    static <T> com.google.protobuf.MessageSchema<T> newSchema(java.lang.Class<T> cls, com.google.protobuf.MessageInfo messageInfo, com.google.protobuf.NewInstanceSchema newInstanceSchema, com.google.protobuf.ListFieldSchema listFieldSchema, com.google.protobuf.UnknownFieldSchema<?, ?> unknownFieldSchema, com.google.protobuf.ExtensionSchema<?> extensionSchema, com.google.protobuf.MapFieldSchema mapFieldSchema) {
        if (messageInfo instanceof com.google.protobuf.RawMessageInfo) {
            return newSchemaForRawMessageInfo((com.google.protobuf.RawMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
        }
        return newSchemaForMessageInfo((com.google.protobuf.StructuralMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    /* JADX WARN: Code duplicated, block: B:122:0x024e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0251  */
    /* JADX WARN: Code duplicated, block: B:126:0x0269  */
    /* JADX WARN: Code duplicated, block: B:127:0x026c  */
    /* JADX WARN: Code duplicated, block: B:161:0x031a  */
    /* JADX WARN: Code duplicated, block: B:162:0x031d  */
    /* JADX WARN: Code duplicated, block: B:164:0x0320  */
    /* JADX WARN: Code duplicated, block: B:179:0x036d  */
    /* JADX WARN: Code duplicated, block: B:182:0x037a  */
    static <T> com.google.protobuf.MessageSchema<T> newSchemaForRawMessageInfo(com.google.protobuf.RawMessageInfo rawMessageInfo, com.google.protobuf.NewInstanceSchema newInstanceSchema, com.google.protobuf.ListFieldSchema listFieldSchema, com.google.protobuf.UnknownFieldSchema<?, ?> unknownFieldSchema, com.google.protobuf.ExtensionSchema<?> extensionSchema, com.google.protobuf.MapFieldSchema mapFieldSchema) {
        int i;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int iCharAt4;
        int iCharAt5;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        char cCharAt;
        int i5;
        char cCharAt2;
        int i6;
        char cCharAt3;
        int i7;
        char cCharAt4;
        int i8;
        char cCharAt5;
        int i9;
        char cCharAt6;
        int i10;
        char cCharAt7;
        int i11;
        char cCharAt8;
        int i12;
        int i13;
        int i14;
        boolean z;
        int i15;
        int iObjectFieldOffset;
        boolean z2;
        int iObjectFieldOffset2;
        int i16;
        int i17;
        java.lang.reflect.Field fieldReflectField;
        char cCharAt9;
        int i18;
        int i19;
        int i20;
        java.lang.Object obj;
        java.lang.reflect.Field fieldReflectField2;
        int i21;
        java.lang.Object obj2;
        java.lang.reflect.Field fieldReflectField3;
        int i22;
        char cCharAt10;
        int i23;
        char cCharAt11;
        int i24;
        char cCharAt12;
        int i25;
        char cCharAt13;
        boolean z3 = rawMessageInfo.getSyntax() == com.google.protobuf.ProtoSyntax.PROTO3;
        java.lang.String stringInfo = rawMessageInfo.getStringInfo();
        int length = stringInfo.length();
        char c = 55296;
        if (stringInfo.charAt(0) >= 55296) {
            int i26 = 1;
            while (true) {
                i = i26 + 1;
                if (stringInfo.charAt(i26) < 55296) {
                    break;
                }
                i26 = i;
            }
        } else {
            i = 1;
        }
        int i27 = i + 1;
        int iCharAt6 = stringInfo.charAt(i);
        if (iCharAt6 >= 55296) {
            int i28 = iCharAt6 & 8191;
            int i29 = 13;
            while (true) {
                i25 = i27 + 1;
                cCharAt13 = stringInfo.charAt(i27);
                if (cCharAt13 < 55296) {
                    break;
                }
                i28 |= (cCharAt13 & 8191) << i29;
                i29 += 13;
                i27 = i25;
            }
            iCharAt6 = i28 | (cCharAt13 << i29);
            i27 = i25;
        }
        if (iCharAt6 == 0) {
            iCharAt = 0;
            iCharAt2 = 0;
            iCharAt3 = 0;
            iCharAt4 = 0;
            iCharAt5 = 0;
            i2 = 0;
            iArr = EMPTY_INT_ARRAY;
            i3 = 0;
        } else {
            int i30 = i27 + 1;
            int iCharAt7 = stringInfo.charAt(i27);
            if (iCharAt7 >= 55296) {
                int i31 = iCharAt7 & 8191;
                int i32 = 13;
                while (true) {
                    i11 = i30 + 1;
                    cCharAt8 = stringInfo.charAt(i30);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i31 |= (cCharAt8 & 8191) << i32;
                    i32 += 13;
                    i30 = i11;
                }
                iCharAt7 = i31 | (cCharAt8 << i32);
                i30 = i11;
            }
            int i33 = i30 + 1;
            int iCharAt8 = stringInfo.charAt(i30);
            if (iCharAt8 >= 55296) {
                int i34 = iCharAt8 & 8191;
                int i35 = 13;
                while (true) {
                    i10 = i33 + 1;
                    cCharAt7 = stringInfo.charAt(i33);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i34 |= (cCharAt7 & 8191) << i35;
                    i35 += 13;
                    i33 = i10;
                }
                iCharAt8 = i34 | (cCharAt7 << i35);
                i33 = i10;
            }
            int i36 = i33 + 1;
            iCharAt = stringInfo.charAt(i33);
            if (iCharAt >= 55296) {
                int i37 = iCharAt & 8191;
                int i38 = 13;
                while (true) {
                    i9 = i36 + 1;
                    cCharAt6 = stringInfo.charAt(i36);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i37 |= (cCharAt6 & 8191) << i38;
                    i38 += 13;
                    i36 = i9;
                }
                iCharAt = i37 | (cCharAt6 << i38);
                i36 = i9;
            }
            int i39 = i36 + 1;
            iCharAt2 = stringInfo.charAt(i36);
            if (iCharAt2 >= 55296) {
                int i40 = iCharAt2 & 8191;
                int i41 = 13;
                while (true) {
                    i8 = i39 + 1;
                    cCharAt5 = stringInfo.charAt(i39);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i40 |= (cCharAt5 & 8191) << i41;
                    i41 += 13;
                    i39 = i8;
                }
                iCharAt2 = i40 | (cCharAt5 << i41);
                i39 = i8;
            }
            int i42 = i39 + 1;
            iCharAt3 = stringInfo.charAt(i39);
            if (iCharAt3 >= 55296) {
                int i43 = iCharAt3 & 8191;
                int i44 = 13;
                while (true) {
                    i7 = i42 + 1;
                    cCharAt4 = stringInfo.charAt(i42);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt4 & 8191) << i44;
                    i44 += 13;
                    i42 = i7;
                }
                iCharAt3 = i43 | (cCharAt4 << i44);
                i42 = i7;
            }
            int i45 = i42 + 1;
            iCharAt4 = stringInfo.charAt(i42);
            if (iCharAt4 >= 55296) {
                int i46 = iCharAt4 & 8191;
                int i47 = 13;
                while (true) {
                    i6 = i45 + 1;
                    cCharAt3 = stringInfo.charAt(i45);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt3 & 8191) << i47;
                    i47 += 13;
                    i45 = i6;
                }
                iCharAt4 = i46 | (cCharAt3 << i47);
                i45 = i6;
            }
            int i48 = i45 + 1;
            int iCharAt9 = stringInfo.charAt(i45);
            if (iCharAt9 >= 55296) {
                int i49 = iCharAt9 & 8191;
                int i50 = 13;
                while (true) {
                    i5 = i48 + 1;
                    cCharAt2 = stringInfo.charAt(i48);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt2 & 8191) << i50;
                    i50 += 13;
                    i48 = i5;
                }
                iCharAt9 = i49 | (cCharAt2 << i50);
                i48 = i5;
            }
            int i51 = i48 + 1;
            iCharAt5 = stringInfo.charAt(i48);
            if (iCharAt5 >= 55296) {
                int i52 = iCharAt5 & 8191;
                int i53 = 13;
                while (true) {
                    i4 = i51 + 1;
                    cCharAt = stringInfo.charAt(i51);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i52 |= (cCharAt & 8191) << i53;
                    i53 += 13;
                    i51 = i4;
                }
                iCharAt5 = i52 | (cCharAt << i53);
                i51 = i4;
            }
            iArr = new int[iCharAt5 + iCharAt4 + iCharAt9];
            i2 = (iCharAt7 * 2) + iCharAt8;
            i3 = iCharAt7;
            i27 = i51;
        }
        sun.misc.Unsafe unsafe = UNSAFE;
        java.lang.Object[] objects = rawMessageInfo.getObjects();
        java.lang.Class<?> cls = rawMessageInfo.getDefaultInstance().getClass();
        int[] iArr2 = new int[iCharAt3 * 3];
        java.lang.Object[] objArr = new java.lang.Object[iCharAt3 * 2];
        int i54 = iCharAt5 + iCharAt4;
        int i55 = iCharAt5;
        int i56 = i54;
        int i57 = 0;
        int i58 = 0;
        while (i27 < length) {
            int i59 = i27 + 1;
            int iCharAt10 = stringInfo.charAt(i27);
            if (iCharAt10 >= c) {
                int i60 = iCharAt10 & 8191;
                int i61 = i59;
                int i62 = 13;
                while (true) {
                    i24 = i61 + 1;
                    cCharAt12 = stringInfo.charAt(i61);
                    if (cCharAt12 < c) {
                        break;
                    }
                    i60 |= (cCharAt12 & 8191) << i62;
                    i62 += 13;
                    i61 = i24;
                }
                iCharAt10 = i60 | (cCharAt12 << i62);
                i12 = i24;
            } else {
                i12 = i59;
            }
            int i63 = i12 + 1;
            int iCharAt11 = stringInfo.charAt(i12);
            if (iCharAt11 >= c) {
                int i64 = iCharAt11 & 8191;
                int i65 = i63;
                int i66 = 13;
                while (true) {
                    i23 = i65 + 1;
                    cCharAt11 = stringInfo.charAt(i65);
                    i13 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i64 |= (cCharAt11 & 8191) << i66;
                    i66 += 13;
                    i65 = i23;
                    length = i13;
                }
                iCharAt11 = i64 | (cCharAt11 << i66);
                i14 = i23;
            } else {
                i13 = length;
                i14 = i63;
            }
            int i67 = iCharAt11 & 255;
            int i68 = iCharAt5;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i57] = i58;
                i57++;
            }
            int i69 = i57;
            if (i67 >= 51) {
                int i70 = i14 + 1;
                int iCharAt12 = stringInfo.charAt(i14);
                char c2 = 55296;
                if (iCharAt12 >= 55296) {
                    int i71 = iCharAt12 & 8191;
                    int i72 = 13;
                    while (true) {
                        i22 = i70 + 1;
                        cCharAt10 = stringInfo.charAt(i70);
                        if (cCharAt10 < c2) {
                            break;
                        }
                        i71 |= (cCharAt10 & 8191) << i72;
                        i72 += 13;
                        i70 = i22;
                        c2 = 55296;
                    }
                    iCharAt12 = i71 | (cCharAt10 << i72);
                    i70 = i22;
                }
                int i73 = i67 - 51;
                int i74 = i70;
                if (i73 == 9 || i73 == 17) {
                    i19 = i2 + 1;
                    objArr[((i58 / 3) * 2) + 1] = objects[i2];
                } else {
                    if (i73 == 12 && !z3) {
                        i19 = i2 + 1;
                        objArr[((i58 / 3) * 2) + 1] = objects[i2];
                    }
                    i20 = iCharAt12 * 2;
                    obj = objects[i20];
                    if (obj instanceof java.lang.reflect.Field) {
                        fieldReflectField2 = (java.lang.reflect.Field) obj;
                    } else {
                        fieldReflectField2 = reflectField(cls, (java.lang.String) obj);
                        objects[i20] = fieldReflectField2;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldReflectField2);
                    i21 = i20 + 1;
                    obj2 = objects[i21];
                    if (obj2 instanceof java.lang.reflect.Field) {
                        fieldReflectField3 = (java.lang.reflect.Field) obj2;
                    } else {
                        fieldReflectField3 = reflectField(cls, (java.lang.String) obj2);
                        objects[i21] = fieldReflectField3;
                    }
                    stringInfo = stringInfo;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldReflectField3);
                    z3 = z3;
                    i16 = i74;
                    iObjectFieldOffset = iObjectFieldOffset3;
                    i17 = 0;
                }
                i2 = i19;
                i20 = iCharAt12 * 2;
                obj = objects[i20];
                if (obj instanceof java.lang.reflect.Field) {
                    fieldReflectField2 = (java.lang.reflect.Field) obj;
                } else {
                    fieldReflectField2 = reflectField(cls, (java.lang.String) obj);
                    objects[i20] = fieldReflectField2;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldReflectField2);
                i21 = i20 + 1;
                obj2 = objects[i21];
                if (obj2 instanceof java.lang.reflect.Field) {
                    fieldReflectField3 = (java.lang.reflect.Field) obj2;
                } else {
                    fieldReflectField3 = reflectField(cls, (java.lang.String) obj2);
                    objects[i21] = fieldReflectField3;
                }
                stringInfo = stringInfo;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldReflectField3);
                z3 = z3;
                i16 = i74;
                iObjectFieldOffset = iObjectFieldOffset4;
                i17 = 0;
            } else {
                int i75 = i2 + 1;
                java.lang.reflect.Field fieldReflectField4 = reflectField(cls, (java.lang.String) objects[i2]);
                if (i67 == 9 || i67 == 17) {
                    z = true;
                    objArr[((i58 / 3) * 2) + 1] = fieldReflectField4.getType();
                } else {
                    if (i67 == 27 || i67 == 49) {
                        z = true;
                        i18 = i75 + 1;
                        objArr[((i58 / 3) * 2) + 1] = objects[i75];
                    } else {
                        if (i67 == 12 || i67 == 30 || i67 == 44) {
                            if (!z3) {
                                z = true;
                                i18 = i75 + 1;
                                objArr[((i58 / 3) * 2) + 1] = objects[i75];
                            }
                        } else if (i67 == 50) {
                            int i76 = i55 + 1;
                            iArr[i55] = i58;
                            int i77 = (i58 / 3) * 2;
                            int i78 = i75 + 1;
                            objArr[i77] = objects[i75];
                            if ((iCharAt11 & 2048) != 0) {
                                i75 = i78 + 1;
                                objArr[i77 + 1] = objects[i78];
                                i55 = i76;
                            } else {
                                i55 = i76;
                                i15 = i78;
                                z = true;
                            }
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField4);
                            int i79 = i15;
                            if ((iCharAt11 & 4096) == 4096) {
                                z2 = z;
                            } else {
                                z2 = false;
                            }
                            if (z2 || i67 > 17) {
                                iObjectFieldOffset2 = 1048575;
                                i16 = i14;
                                i17 = 0;
                            } else {
                                int i80 = i14 + 1;
                                int iCharAt13 = stringInfo.charAt(i14);
                                if (iCharAt13 >= 55296) {
                                    int i81 = iCharAt13 & 8191;
                                    int i82 = 13;
                                    while (true) {
                                        i16 = i80 + 1;
                                        cCharAt9 = stringInfo.charAt(i80);
                                        if (cCharAt9 < 55296) {
                                            break;
                                        }
                                        i81 |= (cCharAt9 & 8191) << i82;
                                        i82 += 13;
                                        i80 = i16;
                                    }
                                    iCharAt13 = i81 | (cCharAt9 << i82);
                                } else {
                                    i16 = i80;
                                }
                                int i83 = (i3 * 2) + (iCharAt13 / 32);
                                java.lang.Object obj3 = objects[i83];
                                if (obj3 instanceof java.lang.reflect.Field) {
                                    fieldReflectField = (java.lang.reflect.Field) obj3;
                                } else {
                                    fieldReflectField = reflectField(cls, (java.lang.String) obj3);
                                    objects[i83] = fieldReflectField;
                                }
                                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldReflectField);
                                i17 = iCharAt13 % 32;
                            }
                            if (i67 >= 18 && i67 <= 49) {
                                iArr[i56] = iObjectFieldOffset;
                                i56++;
                            }
                            i2 = i79;
                        }
                        z = true;
                    }
                    i15 = i18;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField4);
                    int i710 = i15;
                    if ((iCharAt11 & 4096) == 4096) {
                        z2 = z;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        iObjectFieldOffset2 = 1048575;
                        i16 = i14;
                        i17 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i16 = i14;
                        i17 = 0;
                    }
                    if (i67 >= 18) {
                        iArr[i56] = iObjectFieldOffset;
                        i56++;
                    }
                    i2 = i710;
                }
                i15 = i75;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField4);
                int i711 = i15;
                if ((iCharAt11 & 4096) == 4096) {
                    z2 = z;
                } else {
                    z2 = false;
                }
                if (z2) {
                    iObjectFieldOffset2 = 1048575;
                    i16 = i14;
                    i17 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i16 = i14;
                    i17 = 0;
                }
                if (i67 >= 18) {
                    iArr[i56] = iObjectFieldOffset;
                    i56++;
                }
                i2 = i711;
            }
            int i84 = i58 + 1;
            iArr2[i58] = iCharAt10;
            int i85 = i84 + 1;
            iArr2[i84] = ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | (i67 << 20) | iObjectFieldOffset;
            i58 = i85 + 1;
            iArr2[i85] = (i17 << 20) | iObjectFieldOffset2;
            z3 = z3;
            iCharAt = iCharAt;
            iCharAt5 = i68;
            length = i13;
            i27 = i16;
            i57 = i69;
            stringInfo = stringInfo;
            iCharAt2 = iCharAt2;
            c = 55296;
        }
        return new com.google.protobuf.MessageSchema<>(iArr2, objArr, iCharAt, iCharAt2, rawMessageInfo.getDefaultInstance(), z3, false, iArr, iCharAt5, i54, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    private static java.lang.reflect.Field reflectField(java.lang.Class<?> cls, java.lang.String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (java.lang.NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new java.lang.RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + java.util.Arrays.toString(declaredFields));
        }
    }

    static <T> com.google.protobuf.MessageSchema<T> newSchemaForMessageInfo(com.google.protobuf.StructuralMessageInfo structuralMessageInfo, com.google.protobuf.NewInstanceSchema newInstanceSchema, com.google.protobuf.ListFieldSchema listFieldSchema, com.google.protobuf.UnknownFieldSchema<?, ?> unknownFieldSchema, com.google.protobuf.ExtensionSchema<?> extensionSchema, com.google.protobuf.MapFieldSchema mapFieldSchema) {
        int fieldNumber;
        int fieldNumber2;
        boolean z = structuralMessageInfo.getSyntax() == com.google.protobuf.ProtoSyntax.PROTO3;
        com.google.protobuf.FieldInfo[] fields = structuralMessageInfo.getFields();
        if (fields.length == 0) {
            fieldNumber = 0;
            fieldNumber2 = 0;
        } else {
            fieldNumber = fields[0].getFieldNumber();
            fieldNumber2 = fields[fields.length - 1].getFieldNumber();
        }
        int length = fields.length;
        int[] iArr = new int[length * 3];
        java.lang.Object[] objArr = new java.lang.Object[length * 2];
        int i = 0;
        int i2 = 0;
        for (com.google.protobuf.FieldInfo fieldInfo : fields) {
            if (fieldInfo.getType() == com.google.protobuf.FieldType.MAP) {
                i++;
            } else if (fieldInfo.getType().id() >= 18 && fieldInfo.getType().id() <= 49) {
                i2++;
            }
        }
        int[] iArr2 = i > 0 ? new int[i] : null;
        int[] iArr3 = i2 > 0 ? new int[i2] : null;
        int[] checkInitialized = structuralMessageInfo.getCheckInitialized();
        if (checkInitialized == null) {
            checkInitialized = EMPTY_INT_ARRAY;
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i3 < fields.length) {
            com.google.protobuf.FieldInfo fieldInfo2 = fields[i3];
            int fieldNumber3 = fieldInfo2.getFieldNumber();
            storeFieldData(fieldInfo2, iArr, i4, objArr);
            if (i5 < checkInitialized.length && checkInitialized[i5] == fieldNumber3) {
                checkInitialized[i5] = i4;
                i5++;
            }
            if (fieldInfo2.getType() == com.google.protobuf.FieldType.MAP) {
                iArr2[i6] = i4;
                i6++;
            } else {
                if (fieldInfo2.getType().id() >= 18 && fieldInfo2.getType().id() <= 49) {
                    iArr3[i7] = (int) com.google.protobuf.UnsafeUtil.objectFieldOffset(fieldInfo2.getField());
                    i7++;
                }
                i3++;
                i4 += 3;
            }
            i3++;
            i4 += 3;
        }
        if (iArr2 == null) {
            iArr2 = EMPTY_INT_ARRAY;
        }
        if (iArr3 == null) {
            iArr3 = EMPTY_INT_ARRAY;
        }
        int[] iArr4 = new int[checkInitialized.length + iArr2.length + iArr3.length];
        java.lang.System.arraycopy(checkInitialized, 0, iArr4, 0, checkInitialized.length);
        java.lang.System.arraycopy(iArr2, 0, iArr4, checkInitialized.length, iArr2.length);
        java.lang.System.arraycopy(iArr3, 0, iArr4, checkInitialized.length + iArr2.length, iArr3.length);
        return new com.google.protobuf.MessageSchema<>(iArr, objArr, fieldNumber, fieldNumber2, structuralMessageInfo.getDefaultInstance(), z, true, iArr4, checkInitialized.length, checkInitialized.length + iArr2.length, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007a  */
    /* JADX WARN: Code duplicated, block: B:22:0x007d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0084  */
    /* JADX WARN: Code duplicated, block: B:28:0x009e  */
    /* JADX WARN: Code duplicated, block: B:30:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:31:0x00af  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    private static void storeFieldData(com.google.protobuf.FieldInfo fieldInfo, int[] iArr, int i, java.lang.Object[] objArr) {
        int iObjectFieldOffset;
        int iId;
        long jObjectFieldOffset;
        int iObjectFieldOffset2;
        int iNumberOfTrailingZeros;
        int i2;
        java.lang.Class<?> messageFieldClass;
        int i3;
        com.google.protobuf.OneofInfo oneof = fieldInfo.getOneof();
        if (oneof != null) {
            iId = fieldInfo.getType().id() + 51;
            iObjectFieldOffset = (int) com.google.protobuf.UnsafeUtil.objectFieldOffset(oneof.getValueField());
            jObjectFieldOffset = com.google.protobuf.UnsafeUtil.objectFieldOffset(oneof.getCaseField());
        } else {
            com.google.protobuf.FieldType type = fieldInfo.getType();
            iObjectFieldOffset = (int) com.google.protobuf.UnsafeUtil.objectFieldOffset(fieldInfo.getField());
            iId = type.id();
            if (!type.isList() && !type.isMap()) {
                java.lang.reflect.Field presenceField = fieldInfo.getPresenceField();
                iObjectFieldOffset2 = presenceField == null ? 1048575 : (int) com.google.protobuf.UnsafeUtil.objectFieldOffset(presenceField);
                iNumberOfTrailingZeros = java.lang.Integer.numberOfTrailingZeros(fieldInfo.getPresenceMask());
            } else if (fieldInfo.getCachedSizeField() == null) {
                iObjectFieldOffset2 = 0;
                iNumberOfTrailingZeros = 0;
            } else {
                jObjectFieldOffset = com.google.protobuf.UnsafeUtil.objectFieldOffset(fieldInfo.getCachedSizeField());
            }
            iArr[i] = fieldInfo.getFieldNumber();
            int i4 = i + 1;
            if (fieldInfo.isEnforceUtf8()) {
                i2 = 536870912;
            } else {
                i2 = 0;
            }
            iArr[i4] = (fieldInfo.isRequired() ? 268435456 : 0) | i2 | (iId << 20) | iObjectFieldOffset;
            iArr[i + 2] = iObjectFieldOffset2 | (iNumberOfTrailingZeros << 20);
            messageFieldClass = fieldInfo.getMessageFieldClass();
            if (fieldInfo.getMapDefaultEntry() != null) {
                if (messageFieldClass != null) {
                    objArr[((i / 3) * 2) + 1] = messageFieldClass;
                    return;
                } else {
                    if (fieldInfo.getEnumVerifier() != null) {
                        objArr[((i / 3) * 2) + 1] = fieldInfo.getEnumVerifier();
                        return;
                    }
                    return;
                }
            }
            i3 = (i / 3) * 2;
            objArr[i3] = fieldInfo.getMapDefaultEntry();
            if (messageFieldClass != null) {
                objArr[i3 + 1] = messageFieldClass;
            } else if (fieldInfo.getEnumVerifier() != null) {
                objArr[i3 + 1] = fieldInfo.getEnumVerifier();
            }
        }
        iObjectFieldOffset2 = (int) jObjectFieldOffset;
        iNumberOfTrailingZeros = 0;
        iArr[i] = fieldInfo.getFieldNumber();
        int i5 = i + 1;
        if (fieldInfo.isEnforceUtf8()) {
            i2 = 536870912;
        } else {
            i2 = 0;
        }
        iArr[i5] = (fieldInfo.isRequired() ? 268435456 : 0) | i2 | (iId << 20) | iObjectFieldOffset;
        iArr[i + 2] = iObjectFieldOffset2 | (iNumberOfTrailingZeros << 20);
        messageFieldClass = fieldInfo.getMessageFieldClass();
        if (fieldInfo.getMapDefaultEntry() != null) {
            if (messageFieldClass != null) {
                objArr[((i / 3) * 2) + 1] = messageFieldClass;
                return;
            } else {
                if (fieldInfo.getEnumVerifier() != null) {
                    objArr[((i / 3) * 2) + 1] = fieldInfo.getEnumVerifier();
                    return;
                }
                return;
            }
        }
        i3 = (i / 3) * 2;
        objArr[i3] = fieldInfo.getMapDefaultEntry();
        if (messageFieldClass != null) {
            objArr[i3 + 1] = messageFieldClass;
        } else if (fieldInfo.getEnumVerifier() != null) {
            objArr[i3 + 1] = fieldInfo.getEnumVerifier();
        }
    }

    @Override // com.google.protobuf.Schema
    public T newInstance() {
        return (T) this.newInstanceSchema.newInstance(this.defaultInstance);
    }

    @Override // com.google.protobuf.Schema
    public boolean equals(T t, T t2) {
        int length = this.buffer.length;
        for (int i = 0; i < length; i += 3) {
            if (!equals(t, t2, i)) {
                return false;
            }
        }
        if (!this.unknownFieldSchema.getFromMessage(t).equals(this.unknownFieldSchema.getFromMessage(t2))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(t).equals(this.extensionSchema.getExtensions(t2));
        }
        return true;
    }

    private boolean equals(T t, T t2, int i) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                return arePresentForEquals(t, t2, i) && java.lang.Double.doubleToLongBits(com.google.protobuf.UnsafeUtil.getDouble(t, jOffset)) == java.lang.Double.doubleToLongBits(com.google.protobuf.UnsafeUtil.getDouble(t2, jOffset));
            case 1:
                return arePresentForEquals(t, t2, i) && java.lang.Float.floatToIntBits(com.google.protobuf.UnsafeUtil.getFloat(t, jOffset)) == java.lang.Float.floatToIntBits(com.google.protobuf.UnsafeUtil.getFloat(t2, jOffset));
            case 2:
                return arePresentForEquals(t, t2, i) && com.google.protobuf.UnsafeUtil.getLong(t, jOffset) == com.google.protobuf.UnsafeUtil.getLong(t2, jOffset);
            case 3:
                return arePresentForEquals(t, t2, i) && com.google.protobuf.UnsafeUtil.getLong(t, jOffset) == com.google.protobuf.UnsafeUtil.getLong(t2, jOffset);
            case 4:
                return arePresentForEquals(t, t2, i) && com.google.protobuf.UnsafeUtil.getInt(t, jOffset) == com.google.protobuf.UnsafeUtil.getInt(t2, jOffset);
            case 5:
                return arePresentForEquals(t, t2, i) && com.google.protobuf.UnsafeUtil.getLong(t, jOffset) == com.google.protobuf.UnsafeUtil.getLong(t2, jOffset);
            case 6:
                return arePresentForEquals(t, t2, i) && com.google.protobuf.UnsafeUtil.getInt(t, jOffset) == com.google.protobuf.UnsafeUtil.getInt(t2, jOffset);
            case 7:
                return arePresentForEquals(t, t2, i) && com.google.protobuf.UnsafeUtil.getBoolean(t, jOffset) == com.google.protobuf.UnsafeUtil.getBoolean(t2, jOffset);
            case 8:
                return arePresentForEquals(t, t2, i) && com.google.protobuf.SchemaUtil.safeEquals(com.google.protobuf.UnsafeUtil.getObject(t, jOffset), com.google.protobuf.UnsafeUtil.getObject(t2, jOffset));
            case 9:
                return arePresentForEquals(t, t2, i) && com.google.protobuf.SchemaUtil.safeEquals(com.google.protobuf.UnsafeUtil.getObject(t, jOffset), com.google.protobuf.UnsafeUtil.getObject(t2, jOffset));
            case 10:
                return arePresentForEquals(t, t2, i) && com.google.protobuf.SchemaUtil.safeEquals(com.google.protobuf.UnsafeUtil.getObject(t, jOffset), com.google.protobuf.UnsafeUtil.getObject(t2, jOffset));
            case 11:
                return arePresentForEquals(t, t2, i) && com.google.protobuf.UnsafeUtil.getInt(t, jOffset) == com.google.protobuf.UnsafeUtil.getInt(t2, jOffset);
            case 12:
                return arePresentForEquals(t, t2, i) && com.google.protobuf.UnsafeUtil.getInt(t, jOffset) == com.google.protobuf.UnsafeUtil.getInt(t2, jOffset);
            case 13:
                return arePresentForEquals(t, t2, i) && com.google.protobuf.UnsafeUtil.getInt(t, jOffset) == com.google.protobuf.UnsafeUtil.getInt(t2, jOffset);
            case 14:
                return arePresentForEquals(t, t2, i) && com.google.protobuf.UnsafeUtil.getLong(t, jOffset) == com.google.protobuf.UnsafeUtil.getLong(t2, jOffset);
            case 15:
                return arePresentForEquals(t, t2, i) && com.google.protobuf.UnsafeUtil.getInt(t, jOffset) == com.google.protobuf.UnsafeUtil.getInt(t2, jOffset);
            case 16:
                return arePresentForEquals(t, t2, i) && com.google.protobuf.UnsafeUtil.getLong(t, jOffset) == com.google.protobuf.UnsafeUtil.getLong(t2, jOffset);
            case 17:
                return arePresentForEquals(t, t2, i) && com.google.protobuf.SchemaUtil.safeEquals(com.google.protobuf.UnsafeUtil.getObject(t, jOffset), com.google.protobuf.UnsafeUtil.getObject(t2, jOffset));
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                return com.google.protobuf.SchemaUtil.safeEquals(com.google.protobuf.UnsafeUtil.getObject(t, jOffset), com.google.protobuf.UnsafeUtil.getObject(t2, jOffset));
            case 50:
                return com.google.protobuf.SchemaUtil.safeEquals(com.google.protobuf.UnsafeUtil.getObject(t, jOffset), com.google.protobuf.UnsafeUtil.getObject(t2, jOffset));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                return isOneofCaseEqual(t, t2, i) && com.google.protobuf.SchemaUtil.safeEquals(com.google.protobuf.UnsafeUtil.getObject(t, jOffset), com.google.protobuf.UnsafeUtil.getObject(t2, jOffset));
            default:
                return true;
        }
    }

    @Override // com.google.protobuf.Schema
    public int hashCode(T t) {
        int i;
        int iHashLong;
        int length = this.buffer.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i3);
            int iNumberAt = numberAt(i3);
            long jOffset = offset(iTypeAndOffsetAt);
            int iHashCode = 37;
            switch (type(iTypeAndOffsetAt)) {
                case 0:
                    i = i2 * 53;
                    iHashLong = com.google.protobuf.Internal.hashLong(java.lang.Double.doubleToLongBits(com.google.protobuf.UnsafeUtil.getDouble(t, jOffset)));
                    i2 = i + iHashLong;
                    break;
                case 1:
                    i = i2 * 53;
                    iHashLong = java.lang.Float.floatToIntBits(com.google.protobuf.UnsafeUtil.getFloat(t, jOffset));
                    i2 = i + iHashLong;
                    break;
                case 2:
                    i = i2 * 53;
                    iHashLong = com.google.protobuf.Internal.hashLong(com.google.protobuf.UnsafeUtil.getLong(t, jOffset));
                    i2 = i + iHashLong;
                    break;
                case 3:
                    i = i2 * 53;
                    iHashLong = com.google.protobuf.Internal.hashLong(com.google.protobuf.UnsafeUtil.getLong(t, jOffset));
                    i2 = i + iHashLong;
                    break;
                case 4:
                    i = i2 * 53;
                    iHashLong = com.google.protobuf.UnsafeUtil.getInt(t, jOffset);
                    i2 = i + iHashLong;
                    break;
                case 5:
                    i = i2 * 53;
                    iHashLong = com.google.protobuf.Internal.hashLong(com.google.protobuf.UnsafeUtil.getLong(t, jOffset));
                    i2 = i + iHashLong;
                    break;
                case 6:
                    i = i2 * 53;
                    iHashLong = com.google.protobuf.UnsafeUtil.getInt(t, jOffset);
                    i2 = i + iHashLong;
                    break;
                case 7:
                    i = i2 * 53;
                    iHashLong = com.google.protobuf.Internal.hashBoolean(com.google.protobuf.UnsafeUtil.getBoolean(t, jOffset));
                    i2 = i + iHashLong;
                    break;
                case 8:
                    i = i2 * 53;
                    iHashLong = ((java.lang.String) com.google.protobuf.UnsafeUtil.getObject(t, jOffset)).hashCode();
                    i2 = i + iHashLong;
                    break;
                case 9:
                    java.lang.Object object = com.google.protobuf.UnsafeUtil.getObject(t, jOffset);
                    if (object != null) {
                        iHashCode = object.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 10:
                    i = i2 * 53;
                    iHashLong = com.google.protobuf.UnsafeUtil.getObject(t, jOffset).hashCode();
                    i2 = i + iHashLong;
                    break;
                case 11:
                    i = i2 * 53;
                    iHashLong = com.google.protobuf.UnsafeUtil.getInt(t, jOffset);
                    i2 = i + iHashLong;
                    break;
                case 12:
                    i = i2 * 53;
                    iHashLong = com.google.protobuf.UnsafeUtil.getInt(t, jOffset);
                    i2 = i + iHashLong;
                    break;
                case 13:
                    i = i2 * 53;
                    iHashLong = com.google.protobuf.UnsafeUtil.getInt(t, jOffset);
                    i2 = i + iHashLong;
                    break;
                case 14:
                    i = i2 * 53;
                    iHashLong = com.google.protobuf.Internal.hashLong(com.google.protobuf.UnsafeUtil.getLong(t, jOffset));
                    i2 = i + iHashLong;
                    break;
                case 15:
                    i = i2 * 53;
                    iHashLong = com.google.protobuf.UnsafeUtil.getInt(t, jOffset);
                    i2 = i + iHashLong;
                    break;
                case 16:
                    i = i2 * 53;
                    iHashLong = com.google.protobuf.Internal.hashLong(com.google.protobuf.UnsafeUtil.getLong(t, jOffset));
                    i2 = i + iHashLong;
                    break;
                case 17:
                    java.lang.Object object2 = com.google.protobuf.UnsafeUtil.getObject(t, jOffset);
                    if (object2 != null) {
                        iHashCode = object2.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i2 * 53;
                    iHashLong = com.google.protobuf.UnsafeUtil.getObject(t, jOffset).hashCode();
                    i2 = i + iHashLong;
                    break;
                case 50:
                    i = i2 * 53;
                    iHashLong = com.google.protobuf.UnsafeUtil.getObject(t, jOffset).hashCode();
                    i2 = i + iHashLong;
                    break;
                case 51:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = com.google.protobuf.Internal.hashLong(java.lang.Double.doubleToLongBits(oneofDoubleAt(t, jOffset)));
                        i2 = i + iHashLong;
                    }
                    break;
                case 52:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = java.lang.Float.floatToIntBits(oneofFloatAt(t, jOffset));
                        i2 = i + iHashLong;
                    }
                    break;
                case 53:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = com.google.protobuf.Internal.hashLong(oneofLongAt(t, jOffset));
                        i2 = i + iHashLong;
                    }
                    break;
                case 54:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = com.google.protobuf.Internal.hashLong(oneofLongAt(t, jOffset));
                        i2 = i + iHashLong;
                    }
                    break;
                case 55:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = oneofIntAt(t, jOffset);
                        i2 = i + iHashLong;
                    }
                    break;
                case 56:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = com.google.protobuf.Internal.hashLong(oneofLongAt(t, jOffset));
                        i2 = i + iHashLong;
                    }
                    break;
                case 57:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = oneofIntAt(t, jOffset);
                        i2 = i + iHashLong;
                    }
                    break;
                case 58:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = com.google.protobuf.Internal.hashBoolean(oneofBooleanAt(t, jOffset));
                        i2 = i + iHashLong;
                    }
                    break;
                case 59:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = ((java.lang.String) com.google.protobuf.UnsafeUtil.getObject(t, jOffset)).hashCode();
                        i2 = i + iHashLong;
                    }
                    break;
                case 60:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = com.google.protobuf.UnsafeUtil.getObject(t, jOffset).hashCode();
                        i2 = i + iHashLong;
                    }
                    break;
                case 61:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = com.google.protobuf.UnsafeUtil.getObject(t, jOffset).hashCode();
                        i2 = i + iHashLong;
                    }
                    break;
                case 62:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = oneofIntAt(t, jOffset);
                        i2 = i + iHashLong;
                    }
                    break;
                case 63:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = oneofIntAt(t, jOffset);
                        i2 = i + iHashLong;
                    }
                    break;
                case 64:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = oneofIntAt(t, jOffset);
                        i2 = i + iHashLong;
                    }
                    break;
                case 65:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = com.google.protobuf.Internal.hashLong(oneofLongAt(t, jOffset));
                        i2 = i + iHashLong;
                    }
                    break;
                case 66:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = oneofIntAt(t, jOffset);
                        i2 = i + iHashLong;
                    }
                    break;
                case 67:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = com.google.protobuf.Internal.hashLong(oneofLongAt(t, jOffset));
                        i2 = i + iHashLong;
                    }
                    break;
                case 68:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = com.google.protobuf.UnsafeUtil.getObject(t, jOffset).hashCode();
                        i2 = i + iHashLong;
                    }
                    break;
            }
        }
        int iHashCode2 = (i2 * 53) + this.unknownFieldSchema.getFromMessage(t).hashCode();
        return this.hasExtensions ? (iHashCode2 * 53) + this.extensionSchema.getExtensions(t).hashCode() : iHashCode2;
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T t, T t2) {
        checkMutable(t);
        t2.getClass();
        for (int i = 0; i < this.buffer.length; i += 3) {
            mergeSingleField(t, t2, i);
        }
        com.google.protobuf.SchemaUtil.mergeUnknownFields(this.unknownFieldSchema, t, t2);
        if (this.hasExtensions) {
            com.google.protobuf.SchemaUtil.mergeExtensions(this.extensionSchema, t, t2);
        }
    }

    private void mergeSingleField(T t, T t2, int i) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i);
        long jOffset = offset(iTypeAndOffsetAt);
        int iNumberAt = numberAt(i);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                if (isFieldPresent(t2, i)) {
                    com.google.protobuf.UnsafeUtil.putDouble(t, jOffset, com.google.protobuf.UnsafeUtil.getDouble(t2, jOffset));
                    setFieldPresent(t, i);
                }
                break;
            case 1:
                if (isFieldPresent(t2, i)) {
                    com.google.protobuf.UnsafeUtil.putFloat(t, jOffset, com.google.protobuf.UnsafeUtil.getFloat(t2, jOffset));
                    setFieldPresent(t, i);
                }
                break;
            case 2:
                if (isFieldPresent(t2, i)) {
                    com.google.protobuf.UnsafeUtil.putLong(t, jOffset, com.google.protobuf.UnsafeUtil.getLong(t2, jOffset));
                    setFieldPresent(t, i);
                }
                break;
            case 3:
                if (isFieldPresent(t2, i)) {
                    com.google.protobuf.UnsafeUtil.putLong(t, jOffset, com.google.protobuf.UnsafeUtil.getLong(t2, jOffset));
                    setFieldPresent(t, i);
                }
                break;
            case 4:
                if (isFieldPresent(t2, i)) {
                    com.google.protobuf.UnsafeUtil.putInt(t, jOffset, com.google.protobuf.UnsafeUtil.getInt(t2, jOffset));
                    setFieldPresent(t, i);
                }
                break;
            case 5:
                if (isFieldPresent(t2, i)) {
                    com.google.protobuf.UnsafeUtil.putLong(t, jOffset, com.google.protobuf.UnsafeUtil.getLong(t2, jOffset));
                    setFieldPresent(t, i);
                }
                break;
            case 6:
                if (isFieldPresent(t2, i)) {
                    com.google.protobuf.UnsafeUtil.putInt(t, jOffset, com.google.protobuf.UnsafeUtil.getInt(t2, jOffset));
                    setFieldPresent(t, i);
                }
                break;
            case 7:
                if (isFieldPresent(t2, i)) {
                    com.google.protobuf.UnsafeUtil.putBoolean(t, jOffset, com.google.protobuf.UnsafeUtil.getBoolean(t2, jOffset));
                    setFieldPresent(t, i);
                }
                break;
            case 8:
                if (isFieldPresent(t2, i)) {
                    com.google.protobuf.UnsafeUtil.putObject(t, jOffset, com.google.protobuf.UnsafeUtil.getObject(t2, jOffset));
                    setFieldPresent(t, i);
                }
                break;
            case 9:
                mergeMessage(t, t2, i);
                break;
            case 10:
                if (isFieldPresent(t2, i)) {
                    com.google.protobuf.UnsafeUtil.putObject(t, jOffset, com.google.protobuf.UnsafeUtil.getObject(t2, jOffset));
                    setFieldPresent(t, i);
                }
                break;
            case 11:
                if (isFieldPresent(t2, i)) {
                    com.google.protobuf.UnsafeUtil.putInt(t, jOffset, com.google.protobuf.UnsafeUtil.getInt(t2, jOffset));
                    setFieldPresent(t, i);
                }
                break;
            case 12:
                if (isFieldPresent(t2, i)) {
                    com.google.protobuf.UnsafeUtil.putInt(t, jOffset, com.google.protobuf.UnsafeUtil.getInt(t2, jOffset));
                    setFieldPresent(t, i);
                }
                break;
            case 13:
                if (isFieldPresent(t2, i)) {
                    com.google.protobuf.UnsafeUtil.putInt(t, jOffset, com.google.protobuf.UnsafeUtil.getInt(t2, jOffset));
                    setFieldPresent(t, i);
                }
                break;
            case 14:
                if (isFieldPresent(t2, i)) {
                    com.google.protobuf.UnsafeUtil.putLong(t, jOffset, com.google.protobuf.UnsafeUtil.getLong(t2, jOffset));
                    setFieldPresent(t, i);
                }
                break;
            case 15:
                if (isFieldPresent(t2, i)) {
                    com.google.protobuf.UnsafeUtil.putInt(t, jOffset, com.google.protobuf.UnsafeUtil.getInt(t2, jOffset));
                    setFieldPresent(t, i);
                }
                break;
            case 16:
                if (isFieldPresent(t2, i)) {
                    com.google.protobuf.UnsafeUtil.putLong(t, jOffset, com.google.protobuf.UnsafeUtil.getLong(t2, jOffset));
                    setFieldPresent(t, i);
                }
                break;
            case 17:
                mergeMessage(t, t2, i);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.listFieldSchema.mergeListsAt(t, t2, jOffset);
                break;
            case 50:
                com.google.protobuf.SchemaUtil.mergeMap(this.mapFieldSchema, t, t2, jOffset);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (isOneofPresent(t2, iNumberAt, i)) {
                    com.google.protobuf.UnsafeUtil.putObject(t, jOffset, com.google.protobuf.UnsafeUtil.getObject(t2, jOffset));
                    setOneofPresent(t, iNumberAt, i);
                }
                break;
            case 60:
                mergeOneofMessage(t, t2, i);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (isOneofPresent(t2, iNumberAt, i)) {
                    com.google.protobuf.UnsafeUtil.putObject(t, jOffset, com.google.protobuf.UnsafeUtil.getObject(t2, jOffset));
                    setOneofPresent(t, iNumberAt, i);
                }
                break;
            case 68:
                mergeOneofMessage(t, t2, i);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeMessage(T t, T t2, int i) {
        if (isFieldPresent(t2, i)) {
            long jOffset = offset(typeAndOffsetAt(i));
            sun.misc.Unsafe unsafe = UNSAFE;
            java.lang.Object object = unsafe.getObject(t2, jOffset);
            if (object == null) {
                throw new java.lang.IllegalStateException("Source subfield " + numberAt(i) + " is present but null: " + t2);
            }
            com.google.protobuf.Schema messageFieldSchema = getMessageFieldSchema(i);
            if (!isFieldPresent(t, i)) {
                if (!isMutable(object)) {
                    unsafe.putObject(t, jOffset, object);
                } else {
                    java.lang.Object objNewInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t, jOffset, objNewInstance);
                }
                setFieldPresent(t, i);
                return;
            }
            java.lang.Object object2 = unsafe.getObject(t, jOffset);
            if (!isMutable(object2)) {
                java.lang.Object objNewInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(t, jOffset, objNewInstance2);
                object2 = objNewInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeOneofMessage(T t, T t2, int i) {
        int iNumberAt = numberAt(i);
        if (isOneofPresent(t2, iNumberAt, i)) {
            long jOffset = offset(typeAndOffsetAt(i));
            sun.misc.Unsafe unsafe = UNSAFE;
            java.lang.Object object = unsafe.getObject(t2, jOffset);
            if (object == null) {
                throw new java.lang.IllegalStateException("Source subfield " + numberAt(i) + " is present but null: " + t2);
            }
            com.google.protobuf.Schema messageFieldSchema = getMessageFieldSchema(i);
            if (!isOneofPresent(t, iNumberAt, i)) {
                if (!isMutable(object)) {
                    unsafe.putObject(t, jOffset, object);
                } else {
                    java.lang.Object objNewInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t, jOffset, objNewInstance);
                }
                setOneofPresent(t, iNumberAt, i);
                return;
            }
            java.lang.Object object2 = unsafe.getObject(t, jOffset);
            if (!isMutable(object2)) {
                java.lang.Object objNewInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(t, jOffset, objNewInstance2);
                object2 = objNewInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    @Override // com.google.protobuf.Schema
    public int getSerializedSize(T t) {
        return this.proto3 ? getSerializedSizeProto3(t) : getSerializedSizeProto2(t);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:185:0x0420 A[PHI: r6
  0x0420: PHI (r6v4 int) = 
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v8 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v9 int)
  (r6v1 int)
 binds: [B:20:0x005d, B:224:0x04c7, B:221:0x04bc, B:215:0x04a0, B:212:0x048f, B:209:0x0480, B:206:0x0473, B:203:0x0466, B:199:0x045b, B:196:0x0452, B:193:0x0445, B:190:0x0438, B:187:0x0425, B:160:0x0332, B:154:0x0315, B:148:0x02f8, B:142:0x02db, B:136:0x02bd, B:130:0x029f, B:124:0x0281, B:118:0x0263, B:112:0x0245, B:106:0x0227, B:100:0x0209, B:94:0x01eb, B:88:0x01cd, B:82:0x01af, B:77:0x017b, B:74:0x016f, B:71:0x015f, B:68:0x014f, B:65:0x013f, B:62:0x0133, B:59:0x0126, B:56:0x0119, B:50:0x00fb, B:47:0x00e7, B:44:0x00d5, B:41:0x00c5, B:38:0x00b5, B:201:0x0462, B:35:0x00a8, B:32:0x009c, B:29:0x008c, B:26:0x007c, B:184:0x041f, B:23:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    private int getSerializedSizeProto2(T t) {
        int i;
        int i2;
        int iComputeDoubleSize;
        int iComputeBoolSize;
        int iComputeSFixed32Size;
        boolean z;
        int iComputeSizeFixed32List;
        int iComputeSizeFixed64ListNoTag;
        int iComputeTagSize;
        int iComputeUInt32SizeNoTag;
        sun.misc.Unsafe unsafe = UNSAFE;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < this.buffer.length) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i5);
            int iNumberAt = numberAt(i5);
            int iType = type(iTypeAndOffsetAt);
            if (iType <= 17) {
                i = this.buffer[i5 + 2];
                int i8 = i & i3;
                i2 = 1 << (i >>> 20);
                if (i8 != i4) {
                    i7 = unsafe.getInt(t, i8);
                    i4 = i8;
                }
            } else {
                i = (!this.useCachedSizeField || iType < com.google.protobuf.FieldType.DOUBLE_LIST_PACKED.id() || iType > com.google.protobuf.FieldType.SINT64_LIST_PACKED.id()) ? 0 : this.buffer[i5 + 2] & i3;
                i2 = 0;
            }
            long jOffset = offset(iTypeAndOffsetAt);
            switch (iType) {
                case 0:
                    if ((i7 & i2) != 0) {
                        iComputeDoubleSize = com.google.protobuf.CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        i6 += iComputeDoubleSize;
                    }
                    break;
                case 1:
                    if ((i7 & i2) != 0) {
                        iComputeDoubleSize = com.google.protobuf.CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        i6 += iComputeDoubleSize;
                    }
                    break;
                case 2:
                    if ((i7 & i2) != 0) {
                        iComputeDoubleSize = com.google.protobuf.CodedOutputStream.computeInt64Size(iNumberAt, unsafe.getLong(t, jOffset));
                        i6 += iComputeDoubleSize;
                    }
                    break;
                case 3:
                    if ((i7 & i2) != 0) {
                        iComputeDoubleSize = com.google.protobuf.CodedOutputStream.computeUInt64Size(iNumberAt, unsafe.getLong(t, jOffset));
                        i6 += iComputeDoubleSize;
                    }
                    break;
                case 4:
                    if ((i7 & i2) != 0) {
                        iComputeDoubleSize = com.google.protobuf.CodedOutputStream.computeInt32Size(iNumberAt, unsafe.getInt(t, jOffset));
                        i6 += iComputeDoubleSize;
                    }
                    break;
                case 5:
                    if ((i7 & i2) != 0) {
                        iComputeDoubleSize = com.google.protobuf.CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        i6 += iComputeDoubleSize;
                    }
                    break;
                case 6:
                    if ((i7 & i2) != 0) {
                        iComputeDoubleSize = com.google.protobuf.CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        i6 += iComputeDoubleSize;
                    }
                    break;
                case 7:
                    if ((i7 & i2) != 0) {
                        iComputeBoolSize = com.google.protobuf.CodedOutputStream.computeBoolSize(iNumberAt, true);
                        i6 += iComputeBoolSize;
                    }
                    break;
                case 8:
                    if ((i7 & i2) != 0) {
                        java.lang.Object object = unsafe.getObject(t, jOffset);
                        if (object instanceof com.google.protobuf.ByteString) {
                            iComputeBoolSize = com.google.protobuf.CodedOutputStream.computeBytesSize(iNumberAt, (com.google.protobuf.ByteString) object);
                        } else {
                            iComputeBoolSize = com.google.protobuf.CodedOutputStream.computeStringSize(iNumberAt, (java.lang.String) object);
                        }
                        i6 += iComputeBoolSize;
                    }
                    break;
                case 9:
                    if ((i7 & i2) != 0) {
                        iComputeBoolSize = com.google.protobuf.SchemaUtil.computeSizeMessage(iNumberAt, unsafe.getObject(t, jOffset), getMessageFieldSchema(i5));
                        i6 += iComputeBoolSize;
                    }
                    break;
                case 10:
                    if ((i7 & i2) != 0) {
                        iComputeBoolSize = com.google.protobuf.CodedOutputStream.computeBytesSize(iNumberAt, (com.google.protobuf.ByteString) unsafe.getObject(t, jOffset));
                        i6 += iComputeBoolSize;
                    }
                    break;
                case 11:
                    if ((i7 & i2) != 0) {
                        iComputeBoolSize = com.google.protobuf.CodedOutputStream.computeUInt32Size(iNumberAt, unsafe.getInt(t, jOffset));
                        i6 += iComputeBoolSize;
                    }
                    break;
                case 12:
                    if ((i7 & i2) != 0) {
                        iComputeBoolSize = com.google.protobuf.CodedOutputStream.computeEnumSize(iNumberAt, unsafe.getInt(t, jOffset));
                        i6 += iComputeBoolSize;
                    }
                    break;
                case 13:
                    if ((i7 & i2) != 0) {
                        iComputeSFixed32Size = com.google.protobuf.CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        i6 += iComputeSFixed32Size;
                    }
                    break;
                case 14:
                    if ((i7 & i2) != 0) {
                        iComputeBoolSize = com.google.protobuf.CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        i6 += iComputeBoolSize;
                    }
                    break;
                case 15:
                    if ((i7 & i2) != 0) {
                        iComputeBoolSize = com.google.protobuf.CodedOutputStream.computeSInt32Size(iNumberAt, unsafe.getInt(t, jOffset));
                        i6 += iComputeBoolSize;
                    }
                    break;
                case 16:
                    if ((i7 & i2) != 0) {
                        iComputeBoolSize = com.google.protobuf.CodedOutputStream.computeSInt64Size(iNumberAt, unsafe.getLong(t, jOffset));
                        i6 += iComputeBoolSize;
                    }
                    break;
                case 17:
                    if ((i7 & i2) != 0) {
                        iComputeBoolSize = com.google.protobuf.CodedOutputStream.computeGroupSize(iNumberAt, (com.google.protobuf.MessageLite) unsafe.getObject(t, jOffset), getMessageFieldSchema(i5));
                        i6 += iComputeBoolSize;
                    }
                    break;
                case 18:
                    iComputeBoolSize = com.google.protobuf.SchemaUtil.computeSizeFixed64List(iNumberAt, (java.util.List) unsafe.getObject(t, jOffset), false);
                    i6 += iComputeBoolSize;
                    break;
                case 19:
                    z = false;
                    iComputeSizeFixed32List = com.google.protobuf.SchemaUtil.computeSizeFixed32List(iNumberAt, (java.util.List) unsafe.getObject(t, jOffset), false);
                    i6 += iComputeSizeFixed32List;
                    break;
                case 20:
                    z = false;
                    iComputeSizeFixed32List = com.google.protobuf.SchemaUtil.computeSizeInt64List(iNumberAt, (java.util.List) unsafe.getObject(t, jOffset), false);
                    i6 += iComputeSizeFixed32List;
                    break;
                case 21:
                    z = false;
                    iComputeSizeFixed32List = com.google.protobuf.SchemaUtil.computeSizeUInt64List(iNumberAt, (java.util.List) unsafe.getObject(t, jOffset), false);
                    i6 += iComputeSizeFixed32List;
                    break;
                case 22:
                    z = false;
                    iComputeSizeFixed32List = com.google.protobuf.SchemaUtil.computeSizeInt32List(iNumberAt, (java.util.List) unsafe.getObject(t, jOffset), false);
                    i6 += iComputeSizeFixed32List;
                    break;
                case 23:
                    z = false;
                    iComputeSizeFixed32List = com.google.protobuf.SchemaUtil.computeSizeFixed64List(iNumberAt, (java.util.List) unsafe.getObject(t, jOffset), false);
                    i6 += iComputeSizeFixed32List;
                    break;
                case 24:
                    z = false;
                    iComputeSizeFixed32List = com.google.protobuf.SchemaUtil.computeSizeFixed32List(iNumberAt, (java.util.List) unsafe.getObject(t, jOffset), false);
                    i6 += iComputeSizeFixed32List;
                    break;
                case 25:
                    z = false;
                    iComputeSizeFixed32List = com.google.protobuf.SchemaUtil.computeSizeBoolList(iNumberAt, (java.util.List) unsafe.getObject(t, jOffset), false);
                    i6 += iComputeSizeFixed32List;
                    break;
                case 26:
                    iComputeBoolSize = com.google.protobuf.SchemaUtil.computeSizeStringList(iNumberAt, (java.util.List) unsafe.getObject(t, jOffset));
                    i6 += iComputeBoolSize;
                    break;
                case 27:
                    iComputeBoolSize = com.google.protobuf.SchemaUtil.computeSizeMessageList(iNumberAt, (java.util.List) unsafe.getObject(t, jOffset), getMessageFieldSchema(i5));
                    i6 += iComputeBoolSize;
                    break;
                case 28:
                    iComputeBoolSize = com.google.protobuf.SchemaUtil.computeSizeByteStringList(iNumberAt, (java.util.List) unsafe.getObject(t, jOffset));
                    i6 += iComputeBoolSize;
                    break;
                case 29:
                    iComputeBoolSize = com.google.protobuf.SchemaUtil.computeSizeUInt32List(iNumberAt, (java.util.List) unsafe.getObject(t, jOffset), false);
                    i6 += iComputeBoolSize;
                    break;
                case 30:
                    z = false;
                    iComputeSizeFixed32List = com.google.protobuf.SchemaUtil.computeSizeEnumList(iNumberAt, (java.util.List) unsafe.getObject(t, jOffset), false);
                    i6 += iComputeSizeFixed32List;
                    break;
                case 31:
                    z = false;
                    iComputeSizeFixed32List = com.google.protobuf.SchemaUtil.computeSizeFixed32List(iNumberAt, (java.util.List) unsafe.getObject(t, jOffset), false);
                    i6 += iComputeSizeFixed32List;
                    break;
                case 32:
                    z = false;
                    iComputeSizeFixed32List = com.google.protobuf.SchemaUtil.computeSizeFixed64List(iNumberAt, (java.util.List) unsafe.getObject(t, jOffset), false);
                    i6 += iComputeSizeFixed32List;
                    break;
                case 33:
                    z = false;
                    iComputeSizeFixed32List = com.google.protobuf.SchemaUtil.computeSizeSInt32List(iNumberAt, (java.util.List) unsafe.getObject(t, jOffset), false);
                    i6 += iComputeSizeFixed32List;
                    break;
                case 34:
                    z = false;
                    iComputeSizeFixed32List = com.google.protobuf.SchemaUtil.computeSizeSInt64List(iNumberAt, (java.util.List) unsafe.getObject(t, jOffset), false);
                    i6 += iComputeSizeFixed32List;
                    break;
                case 35:
                    iComputeSizeFixed64ListNoTag = com.google.protobuf.SchemaUtil.computeSizeFixed64ListNoTag((java.util.List) unsafe.getObject(t, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = com.google.protobuf.CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i6 += iComputeSFixed32Size;
                    }
                    break;
                case 36:
                    iComputeSizeFixed64ListNoTag = com.google.protobuf.SchemaUtil.computeSizeFixed32ListNoTag((java.util.List) unsafe.getObject(t, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = com.google.protobuf.CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i6 += iComputeSFixed32Size;
                    }
                    break;
                case 37:
                    iComputeSizeFixed64ListNoTag = com.google.protobuf.SchemaUtil.computeSizeInt64ListNoTag((java.util.List) unsafe.getObject(t, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = com.google.protobuf.CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i6 += iComputeSFixed32Size;
                    }
                    break;
                case 38:
                    iComputeSizeFixed64ListNoTag = com.google.protobuf.SchemaUtil.computeSizeUInt64ListNoTag((java.util.List) unsafe.getObject(t, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = com.google.protobuf.CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i6 += iComputeSFixed32Size;
                    }
                    break;
                case 39:
                    iComputeSizeFixed64ListNoTag = com.google.protobuf.SchemaUtil.computeSizeInt32ListNoTag((java.util.List) unsafe.getObject(t, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = com.google.protobuf.CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i6 += iComputeSFixed32Size;
                    }
                    break;
                case 40:
                    iComputeSizeFixed64ListNoTag = com.google.protobuf.SchemaUtil.computeSizeFixed64ListNoTag((java.util.List) unsafe.getObject(t, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = com.google.protobuf.CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i6 += iComputeSFixed32Size;
                    }
                    break;
                case 41:
                    iComputeSizeFixed64ListNoTag = com.google.protobuf.SchemaUtil.computeSizeFixed32ListNoTag((java.util.List) unsafe.getObject(t, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = com.google.protobuf.CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i6 += iComputeSFixed32Size;
                    }
                    break;
                case 42:
                    iComputeSizeFixed64ListNoTag = com.google.protobuf.SchemaUtil.computeSizeBoolListNoTag((java.util.List) unsafe.getObject(t, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = com.google.protobuf.CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i6 += iComputeSFixed32Size;
                    }
                    break;
                case 43:
                    iComputeSizeFixed64ListNoTag = com.google.protobuf.SchemaUtil.computeSizeUInt32ListNoTag((java.util.List) unsafe.getObject(t, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = com.google.protobuf.CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i6 += iComputeSFixed32Size;
                    }
                    break;
                case 44:
                    iComputeSizeFixed64ListNoTag = com.google.protobuf.SchemaUtil.computeSizeEnumListNoTag((java.util.List) unsafe.getObject(t, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = com.google.protobuf.CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i6 += iComputeSFixed32Size;
                    }
                    break;
                case 45:
                    iComputeSizeFixed64ListNoTag = com.google.protobuf.SchemaUtil.computeSizeFixed32ListNoTag((java.util.List) unsafe.getObject(t, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = com.google.protobuf.CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i6 += iComputeSFixed32Size;
                    }
                    break;
                case 46:
                    iComputeSizeFixed64ListNoTag = com.google.protobuf.SchemaUtil.computeSizeFixed64ListNoTag((java.util.List) unsafe.getObject(t, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = com.google.protobuf.CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i6 += iComputeSFixed32Size;
                    }
                    break;
                case 47:
                    iComputeSizeFixed64ListNoTag = com.google.protobuf.SchemaUtil.computeSizeSInt32ListNoTag((java.util.List) unsafe.getObject(t, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = com.google.protobuf.CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i6 += iComputeSFixed32Size;
                    }
                    break;
                case 48:
                    iComputeSizeFixed64ListNoTag = com.google.protobuf.SchemaUtil.computeSizeSInt64ListNoTag((java.util.List) unsafe.getObject(t, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = com.google.protobuf.CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i6 += iComputeSFixed32Size;
                    }
                    break;
                case 49:
                    iComputeBoolSize = com.google.protobuf.SchemaUtil.computeSizeGroupList(iNumberAt, (java.util.List) unsafe.getObject(t, jOffset), getMessageFieldSchema(i5));
                    i6 += iComputeBoolSize;
                    break;
                case 50:
                    iComputeBoolSize = this.mapFieldSchema.getSerializedSize(iNumberAt, unsafe.getObject(t, jOffset), getMapFieldDefaultEntry(i5));
                    i6 += iComputeBoolSize;
                    break;
                case 51:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        iComputeBoolSize = com.google.protobuf.CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        i6 += iComputeBoolSize;
                    }
                    break;
                case 52:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        iComputeBoolSize = com.google.protobuf.CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        i6 += iComputeBoolSize;
                    }
                    break;
                case 53:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        iComputeBoolSize = com.google.protobuf.CodedOutputStream.computeInt64Size(iNumberAt, oneofLongAt(t, jOffset));
                        i6 += iComputeBoolSize;
                    }
                    break;
                case 54:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        iComputeBoolSize = com.google.protobuf.CodedOutputStream.computeUInt64Size(iNumberAt, oneofLongAt(t, jOffset));
                        i6 += iComputeBoolSize;
                    }
                    break;
                case 55:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        iComputeBoolSize = com.google.protobuf.CodedOutputStream.computeInt32Size(iNumberAt, oneofIntAt(t, jOffset));
                        i6 += iComputeBoolSize;
                    }
                    break;
                case 56:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        iComputeBoolSize = com.google.protobuf.CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        i6 += iComputeBoolSize;
                    }
                    break;
                case 57:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        iComputeSFixed32Size = com.google.protobuf.CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        i6 += iComputeSFixed32Size;
                    }
                    break;
                case 58:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        iComputeBoolSize = com.google.protobuf.CodedOutputStream.computeBoolSize(iNumberAt, true);
                        i6 += iComputeBoolSize;
                    }
                    break;
                case 59:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        java.lang.Object object2 = unsafe.getObject(t, jOffset);
                        if (object2 instanceof com.google.protobuf.ByteString) {
                            iComputeBoolSize = com.google.protobuf.CodedOutputStream.computeBytesSize(iNumberAt, (com.google.protobuf.ByteString) object2);
                        } else {
                            iComputeBoolSize = com.google.protobuf.CodedOutputStream.computeStringSize(iNumberAt, (java.lang.String) object2);
                        }
                        i6 += iComputeBoolSize;
                    }
                    break;
                case 60:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        iComputeBoolSize = com.google.protobuf.SchemaUtil.computeSizeMessage(iNumberAt, unsafe.getObject(t, jOffset), getMessageFieldSchema(i5));
                        i6 += iComputeBoolSize;
                    }
                    break;
                case 61:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        iComputeBoolSize = com.google.protobuf.CodedOutputStream.computeBytesSize(iNumberAt, (com.google.protobuf.ByteString) unsafe.getObject(t, jOffset));
                        i6 += iComputeBoolSize;
                    }
                    break;
                case 62:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        iComputeBoolSize = com.google.protobuf.CodedOutputStream.computeUInt32Size(iNumberAt, oneofIntAt(t, jOffset));
                        i6 += iComputeBoolSize;
                    }
                    break;
                case 63:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        iComputeBoolSize = com.google.protobuf.CodedOutputStream.computeEnumSize(iNumberAt, oneofIntAt(t, jOffset));
                        i6 += iComputeBoolSize;
                    }
                    break;
                case 64:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        iComputeSFixed32Size = com.google.protobuf.CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        i6 += iComputeSFixed32Size;
                    }
                    break;
                case 65:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        iComputeBoolSize = com.google.protobuf.CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        i6 += iComputeBoolSize;
                    }
                    break;
                case 66:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        iComputeBoolSize = com.google.protobuf.CodedOutputStream.computeSInt32Size(iNumberAt, oneofIntAt(t, jOffset));
                        i6 += iComputeBoolSize;
                    }
                    break;
                case 67:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        iComputeBoolSize = com.google.protobuf.CodedOutputStream.computeSInt64Size(iNumberAt, oneofLongAt(t, jOffset));
                        i6 += iComputeBoolSize;
                    }
                    break;
                case 68:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        iComputeBoolSize = com.google.protobuf.CodedOutputStream.computeGroupSize(iNumberAt, (com.google.protobuf.MessageLite) unsafe.getObject(t, jOffset), getMessageFieldSchema(i5));
                        i6 += iComputeBoolSize;
                    }
                    break;
                default:
                    break;
            }
            i5 += 3;
            i3 = 1048575;
        }
        int unknownFieldsSerializedSize = i6 + getUnknownFieldsSerializedSize(this.unknownFieldSchema, t);
        return this.hasExtensions ? unknownFieldsSerializedSize + this.extensionSchema.getExtensions(t).getSerializedSize() : unknownFieldsSerializedSize;
    }

    private int getSerializedSizeProto3(T t) {
        int iComputeDoubleSize;
        int iComputeSizeFixed64ListNoTag;
        int iComputeTagSize;
        int iComputeUInt32SizeNoTag;
        sun.misc.Unsafe unsafe = UNSAFE;
        int i = 0;
        for (int i2 = 0; i2 < this.buffer.length; i2 += 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i2);
            int iType = type(iTypeAndOffsetAt);
            int iNumberAt = numberAt(i2);
            long jOffset = offset(iTypeAndOffsetAt);
            int i3 = (iType < com.google.protobuf.FieldType.DOUBLE_LIST_PACKED.id() || iType > com.google.protobuf.FieldType.SINT64_LIST_PACKED.id()) ? 0 : this.buffer[i2 + 2] & 1048575;
            switch (iType) {
                case 0:
                    if (isFieldPresent(t, i2)) {
                        iComputeDoubleSize = com.google.protobuf.CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        i += iComputeDoubleSize;
                    }
                    break;
                case 1:
                    if (isFieldPresent(t, i2)) {
                        iComputeDoubleSize = com.google.protobuf.CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        i += iComputeDoubleSize;
                    }
                    break;
                case 2:
                    if (isFieldPresent(t, i2)) {
                        iComputeDoubleSize = com.google.protobuf.CodedOutputStream.computeInt64Size(iNumberAt, com.google.protobuf.UnsafeUtil.getLong(t, jOffset));
                        i += iComputeDoubleSize;
                    }
                    break;
                case 3:
                    if (isFieldPresent(t, i2)) {
                        iComputeDoubleSize = com.google.protobuf.CodedOutputStream.computeUInt64Size(iNumberAt, com.google.protobuf.UnsafeUtil.getLong(t, jOffset));
                        i += iComputeDoubleSize;
                    }
                    break;
                case 4:
                    if (isFieldPresent(t, i2)) {
                        iComputeDoubleSize = com.google.protobuf.CodedOutputStream.computeInt32Size(iNumberAt, com.google.protobuf.UnsafeUtil.getInt(t, jOffset));
                        i += iComputeDoubleSize;
                    }
                    break;
                case 5:
                    if (isFieldPresent(t, i2)) {
                        iComputeDoubleSize = com.google.protobuf.CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        i += iComputeDoubleSize;
                    }
                    break;
                case 6:
                    if (isFieldPresent(t, i2)) {
                        iComputeDoubleSize = com.google.protobuf.CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        i += iComputeDoubleSize;
                    }
                    break;
                case 7:
                    if (isFieldPresent(t, i2)) {
                        iComputeDoubleSize = com.google.protobuf.CodedOutputStream.computeBoolSize(iNumberAt, true);
                        i += iComputeDoubleSize;
                    }
                    break;
                case 8:
                    if (isFieldPresent(t, i2)) {
                        java.lang.Object object = com.google.protobuf.UnsafeUtil.getObject(t, jOffset);
                        if (object instanceof com.google.protobuf.ByteString) {
                            iComputeDoubleSize = com.google.protobuf.CodedOutputStream.computeBytesSize(iNumberAt, (com.google.protobuf.ByteString) object);
                        } else {
                            iComputeDoubleSize = com.google.protobuf.CodedOutputStream.computeStringSize(iNumberAt, (java.lang.String) object);
                        }
                        i += iComputeDoubleSize;
                    }
                    break;
                case 9:
                    if (isFieldPresent(t, i2)) {
                        iComputeDoubleSize = com.google.protobuf.SchemaUtil.computeSizeMessage(iNumberAt, com.google.protobuf.UnsafeUtil.getObject(t, jOffset), getMessageFieldSchema(i2));
                        i += iComputeDoubleSize;
                    }
                    break;
                case 10:
                    if (isFieldPresent(t, i2)) {
                        iComputeDoubleSize = com.google.protobuf.CodedOutputStream.computeBytesSize(iNumberAt, (com.google.protobuf.ByteString) com.google.protobuf.UnsafeUtil.getObject(t, jOffset));
                        i += iComputeDoubleSize;
                    }
                    break;
                case 11:
                    if (isFieldPresent(t, i2)) {
                        iComputeDoubleSize = com.google.protobuf.CodedOutputStream.computeUInt32Size(iNumberAt, com.google.protobuf.UnsafeUtil.getInt(t, jOffset));
                        i += iComputeDoubleSize;
                    }
                    break;
                case 12:
                    if (isFieldPresent(t, i2)) {
                        iComputeDoubleSize = com.google.protobuf.CodedOutputStream.computeEnumSize(iNumberAt, com.google.protobuf.UnsafeUtil.getInt(t, jOffset));
                        i += iComputeDoubleSize;
                    }
                    break;
                case 13:
                    if (isFieldPresent(t, i2)) {
                        iComputeDoubleSize = com.google.protobuf.CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        i += iComputeDoubleSize;
                    }
                    break;
                case 14:
                    if (isFieldPresent(t, i2)) {
                        iComputeDoubleSize = com.google.protobuf.CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        i += iComputeDoubleSize;
                    }
                    break;
                case 15:
                    if (isFieldPresent(t, i2)) {
                        iComputeDoubleSize = com.google.protobuf.CodedOutputStream.computeSInt32Size(iNumberAt, com.google.protobuf.UnsafeUtil.getInt(t, jOffset));
                        i += iComputeDoubleSize;
                    }
                    break;
                case 16:
                    if (isFieldPresent(t, i2)) {
                        iComputeDoubleSize = com.google.protobuf.CodedOutputStream.computeSInt64Size(iNumberAt, com.google.protobuf.UnsafeUtil.getLong(t, jOffset));
                        i += iComputeDoubleSize;
                    }
                    break;
                case 17:
                    if (isFieldPresent(t, i2)) {
                        iComputeDoubleSize = com.google.protobuf.CodedOutputStream.computeGroupSize(iNumberAt, (com.google.protobuf.MessageLite) com.google.protobuf.UnsafeUtil.getObject(t, jOffset), getMessageFieldSchema(i2));
                        i += iComputeDoubleSize;
                    }
                    break;
                case 18:
                    iComputeDoubleSize = com.google.protobuf.SchemaUtil.computeSizeFixed64List(iNumberAt, listAt(t, jOffset), false);
                    i += iComputeDoubleSize;
                    break;
                case 19:
                    iComputeDoubleSize = com.google.protobuf.SchemaUtil.computeSizeFixed32List(iNumberAt, listAt(t, jOffset), false);
                    i += iComputeDoubleSize;
                    break;
                case 20:
                    iComputeDoubleSize = com.google.protobuf.SchemaUtil.computeSizeInt64List(iNumberAt, listAt(t, jOffset), false);
                    i += iComputeDoubleSize;
                    break;
                case 21:
                    iComputeDoubleSize = com.google.protobuf.SchemaUtil.computeSizeUInt64List(iNumberAt, listAt(t, jOffset), false);
                    i += iComputeDoubleSize;
                    break;
                case 22:
                    iComputeDoubleSize = com.google.protobuf.SchemaUtil.computeSizeInt32List(iNumberAt, listAt(t, jOffset), false);
                    i += iComputeDoubleSize;
                    break;
                case 23:
                    iComputeDoubleSize = com.google.protobuf.SchemaUtil.computeSizeFixed64List(iNumberAt, listAt(t, jOffset), false);
                    i += iComputeDoubleSize;
                    break;
                case 24:
                    iComputeDoubleSize = com.google.protobuf.SchemaUtil.computeSizeFixed32List(iNumberAt, listAt(t, jOffset), false);
                    i += iComputeDoubleSize;
                    break;
                case 25:
                    iComputeDoubleSize = com.google.protobuf.SchemaUtil.computeSizeBoolList(iNumberAt, listAt(t, jOffset), false);
                    i += iComputeDoubleSize;
                    break;
                case 26:
                    iComputeDoubleSize = com.google.protobuf.SchemaUtil.computeSizeStringList(iNumberAt, listAt(t, jOffset));
                    i += iComputeDoubleSize;
                    break;
                case 27:
                    iComputeDoubleSize = com.google.protobuf.SchemaUtil.computeSizeMessageList(iNumberAt, listAt(t, jOffset), getMessageFieldSchema(i2));
                    i += iComputeDoubleSize;
                    break;
                case 28:
                    iComputeDoubleSize = com.google.protobuf.SchemaUtil.computeSizeByteStringList(iNumberAt, listAt(t, jOffset));
                    i += iComputeDoubleSize;
                    break;
                case 29:
                    iComputeDoubleSize = com.google.protobuf.SchemaUtil.computeSizeUInt32List(iNumberAt, listAt(t, jOffset), false);
                    i += iComputeDoubleSize;
                    break;
                case 30:
                    iComputeDoubleSize = com.google.protobuf.SchemaUtil.computeSizeEnumList(iNumberAt, listAt(t, jOffset), false);
                    i += iComputeDoubleSize;
                    break;
                case 31:
                    iComputeDoubleSize = com.google.protobuf.SchemaUtil.computeSizeFixed32List(iNumberAt, listAt(t, jOffset), false);
                    i += iComputeDoubleSize;
                    break;
                case 32:
                    iComputeDoubleSize = com.google.protobuf.SchemaUtil.computeSizeFixed64List(iNumberAt, listAt(t, jOffset), false);
                    i += iComputeDoubleSize;
                    break;
                case 33:
                    iComputeDoubleSize = com.google.protobuf.SchemaUtil.computeSizeSInt32List(iNumberAt, listAt(t, jOffset), false);
                    i += iComputeDoubleSize;
                    break;
                case 34:
                    iComputeDoubleSize = com.google.protobuf.SchemaUtil.computeSizeSInt64List(iNumberAt, listAt(t, jOffset), false);
                    i += iComputeDoubleSize;
                    break;
                case 35:
                    iComputeSizeFixed64ListNoTag = com.google.protobuf.SchemaUtil.computeSizeFixed64ListNoTag((java.util.List) unsafe.getObject(t, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i3, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = com.google.protobuf.CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i += iComputeDoubleSize;
                    }
                    break;
                case 36:
                    iComputeSizeFixed64ListNoTag = com.google.protobuf.SchemaUtil.computeSizeFixed32ListNoTag((java.util.List) unsafe.getObject(t, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i3, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = com.google.protobuf.CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i += iComputeDoubleSize;
                    }
                    break;
                case 37:
                    iComputeSizeFixed64ListNoTag = com.google.protobuf.SchemaUtil.computeSizeInt64ListNoTag((java.util.List) unsafe.getObject(t, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i3, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = com.google.protobuf.CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i += iComputeDoubleSize;
                    }
                    break;
                case 38:
                    iComputeSizeFixed64ListNoTag = com.google.protobuf.SchemaUtil.computeSizeUInt64ListNoTag((java.util.List) unsafe.getObject(t, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i3, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = com.google.protobuf.CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i += iComputeDoubleSize;
                    }
                    break;
                case 39:
                    iComputeSizeFixed64ListNoTag = com.google.protobuf.SchemaUtil.computeSizeInt32ListNoTag((java.util.List) unsafe.getObject(t, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i3, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = com.google.protobuf.CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i += iComputeDoubleSize;
                    }
                    break;
                case 40:
                    iComputeSizeFixed64ListNoTag = com.google.protobuf.SchemaUtil.computeSizeFixed64ListNoTag((java.util.List) unsafe.getObject(t, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i3, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = com.google.protobuf.CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i += iComputeDoubleSize;
                    }
                    break;
                case 41:
                    iComputeSizeFixed64ListNoTag = com.google.protobuf.SchemaUtil.computeSizeFixed32ListNoTag((java.util.List) unsafe.getObject(t, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i3, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = com.google.protobuf.CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i += iComputeDoubleSize;
                    }
                    break;
                case 42:
                    iComputeSizeFixed64ListNoTag = com.google.protobuf.SchemaUtil.computeSizeBoolListNoTag((java.util.List) unsafe.getObject(t, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i3, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = com.google.protobuf.CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i += iComputeDoubleSize;
                    }
                    break;
                case 43:
                    iComputeSizeFixed64ListNoTag = com.google.protobuf.SchemaUtil.computeSizeUInt32ListNoTag((java.util.List) unsafe.getObject(t, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i3, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = com.google.protobuf.CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i += iComputeDoubleSize;
                    }
                    break;
                case 44:
                    iComputeSizeFixed64ListNoTag = com.google.protobuf.SchemaUtil.computeSizeEnumListNoTag((java.util.List) unsafe.getObject(t, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i3, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = com.google.protobuf.CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i += iComputeDoubleSize;
                    }
                    break;
                case 45:
                    iComputeSizeFixed64ListNoTag = com.google.protobuf.SchemaUtil.computeSizeFixed32ListNoTag((java.util.List) unsafe.getObject(t, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i3, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = com.google.protobuf.CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i += iComputeDoubleSize;
                    }
                    break;
                case 46:
                    iComputeSizeFixed64ListNoTag = com.google.protobuf.SchemaUtil.computeSizeFixed64ListNoTag((java.util.List) unsafe.getObject(t, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i3, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = com.google.protobuf.CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i += iComputeDoubleSize;
                    }
                    break;
                case 47:
                    iComputeSizeFixed64ListNoTag = com.google.protobuf.SchemaUtil.computeSizeSInt32ListNoTag((java.util.List) unsafe.getObject(t, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i3, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = com.google.protobuf.CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i += iComputeDoubleSize;
                    }
                    break;
                case 48:
                    iComputeSizeFixed64ListNoTag = com.google.protobuf.SchemaUtil.computeSizeSInt64ListNoTag((java.util.List) unsafe.getObject(t, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i3, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = com.google.protobuf.CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i += iComputeDoubleSize;
                    }
                    break;
                case 49:
                    iComputeDoubleSize = com.google.protobuf.SchemaUtil.computeSizeGroupList(iNumberAt, listAt(t, jOffset), getMessageFieldSchema(i2));
                    i += iComputeDoubleSize;
                    break;
                case 50:
                    iComputeDoubleSize = this.mapFieldSchema.getSerializedSize(iNumberAt, com.google.protobuf.UnsafeUtil.getObject(t, jOffset), getMapFieldDefaultEntry(i2));
                    i += iComputeDoubleSize;
                    break;
                case 51:
                    if (isOneofPresent(t, iNumberAt, i2)) {
                        iComputeDoubleSize = com.google.protobuf.CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        i += iComputeDoubleSize;
                    }
                    break;
                case 52:
                    if (isOneofPresent(t, iNumberAt, i2)) {
                        iComputeDoubleSize = com.google.protobuf.CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        i += iComputeDoubleSize;
                    }
                    break;
                case 53:
                    if (isOneofPresent(t, iNumberAt, i2)) {
                        iComputeDoubleSize = com.google.protobuf.CodedOutputStream.computeInt64Size(iNumberAt, oneofLongAt(t, jOffset));
                        i += iComputeDoubleSize;
                    }
                    break;
                case 54:
                    if (isOneofPresent(t, iNumberAt, i2)) {
                        iComputeDoubleSize = com.google.protobuf.CodedOutputStream.computeUInt64Size(iNumberAt, oneofLongAt(t, jOffset));
                        i += iComputeDoubleSize;
                    }
                    break;
                case 55:
                    if (isOneofPresent(t, iNumberAt, i2)) {
                        iComputeDoubleSize = com.google.protobuf.CodedOutputStream.computeInt32Size(iNumberAt, oneofIntAt(t, jOffset));
                        i += iComputeDoubleSize;
                    }
                    break;
                case 56:
                    if (isOneofPresent(t, iNumberAt, i2)) {
                        iComputeDoubleSize = com.google.protobuf.CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        i += iComputeDoubleSize;
                    }
                    break;
                case 57:
                    if (isOneofPresent(t, iNumberAt, i2)) {
                        iComputeDoubleSize = com.google.protobuf.CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        i += iComputeDoubleSize;
                    }
                    break;
                case 58:
                    if (isOneofPresent(t, iNumberAt, i2)) {
                        iComputeDoubleSize = com.google.protobuf.CodedOutputStream.computeBoolSize(iNumberAt, true);
                        i += iComputeDoubleSize;
                    }
                    break;
                case 59:
                    if (isOneofPresent(t, iNumberAt, i2)) {
                        java.lang.Object object2 = com.google.protobuf.UnsafeUtil.getObject(t, jOffset);
                        if (object2 instanceof com.google.protobuf.ByteString) {
                            iComputeDoubleSize = com.google.protobuf.CodedOutputStream.computeBytesSize(iNumberAt, (com.google.protobuf.ByteString) object2);
                        } else {
                            iComputeDoubleSize = com.google.protobuf.CodedOutputStream.computeStringSize(iNumberAt, (java.lang.String) object2);
                        }
                        i += iComputeDoubleSize;
                    }
                    break;
                case 60:
                    if (isOneofPresent(t, iNumberAt, i2)) {
                        iComputeDoubleSize = com.google.protobuf.SchemaUtil.computeSizeMessage(iNumberAt, com.google.protobuf.UnsafeUtil.getObject(t, jOffset), getMessageFieldSchema(i2));
                        i += iComputeDoubleSize;
                    }
                    break;
                case 61:
                    if (isOneofPresent(t, iNumberAt, i2)) {
                        iComputeDoubleSize = com.google.protobuf.CodedOutputStream.computeBytesSize(iNumberAt, (com.google.protobuf.ByteString) com.google.protobuf.UnsafeUtil.getObject(t, jOffset));
                        i += iComputeDoubleSize;
                    }
                    break;
                case 62:
                    if (isOneofPresent(t, iNumberAt, i2)) {
                        iComputeDoubleSize = com.google.protobuf.CodedOutputStream.computeUInt32Size(iNumberAt, oneofIntAt(t, jOffset));
                        i += iComputeDoubleSize;
                    }
                    break;
                case 63:
                    if (isOneofPresent(t, iNumberAt, i2)) {
                        iComputeDoubleSize = com.google.protobuf.CodedOutputStream.computeEnumSize(iNumberAt, oneofIntAt(t, jOffset));
                        i += iComputeDoubleSize;
                    }
                    break;
                case 64:
                    if (isOneofPresent(t, iNumberAt, i2)) {
                        iComputeDoubleSize = com.google.protobuf.CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        i += iComputeDoubleSize;
                    }
                    break;
                case 65:
                    if (isOneofPresent(t, iNumberAt, i2)) {
                        iComputeDoubleSize = com.google.protobuf.CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        i += iComputeDoubleSize;
                    }
                    break;
                case 66:
                    if (isOneofPresent(t, iNumberAt, i2)) {
                        iComputeDoubleSize = com.google.protobuf.CodedOutputStream.computeSInt32Size(iNumberAt, oneofIntAt(t, jOffset));
                        i += iComputeDoubleSize;
                    }
                    break;
                case 67:
                    if (isOneofPresent(t, iNumberAt, i2)) {
                        iComputeDoubleSize = com.google.protobuf.CodedOutputStream.computeSInt64Size(iNumberAt, oneofLongAt(t, jOffset));
                        i += iComputeDoubleSize;
                    }
                    break;
                case 68:
                    if (isOneofPresent(t, iNumberAt, i2)) {
                        iComputeDoubleSize = com.google.protobuf.CodedOutputStream.computeGroupSize(iNumberAt, (com.google.protobuf.MessageLite) com.google.protobuf.UnsafeUtil.getObject(t, jOffset), getMessageFieldSchema(i2));
                        i += iComputeDoubleSize;
                    }
                    break;
            }
        }
        return i + getUnknownFieldsSerializedSize(this.unknownFieldSchema, t);
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(com.google.protobuf.UnknownFieldSchema<UT, UB> unknownFieldSchema, T t) {
        return unknownFieldSchema.getSerializedSize(unknownFieldSchema.getFromMessage(t));
    }

    private static java.util.List<?> listAt(java.lang.Object obj, long j) {
        return (java.util.List) com.google.protobuf.UnsafeUtil.getObject(obj, j);
    }

    @Override // com.google.protobuf.Schema
    public void writeTo(T t, com.google.protobuf.Writer writer) throws java.io.IOException {
        if (writer.fieldOrder() == com.google.protobuf.Writer.FieldOrder.DESCENDING) {
            writeFieldsInDescendingOrder(t, writer);
        } else if (this.proto3) {
            writeFieldsInAscendingOrderProto3(t, writer);
        } else {
            writeFieldsInAscendingOrderProto2(t, writer);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    private void writeFieldsInAscendingOrderProto2(T t, com.google.protobuf.Writer writer) throws java.io.IOException {
        java.util.Iterator it;
        java.util.Map.Entry<?, ?> entry;
        int i;
        if (this.hasExtensions) {
            com.google.protobuf.FieldSet<T> extensions = this.extensionSchema.getExtensions(t);
            if (extensions.isEmpty()) {
                it = null;
                entry = null;
            } else {
                it = extensions.iterator();
                entry = (java.util.Map.Entry) it.next();
            }
        } else {
            it = null;
            entry = null;
        }
        int length = this.buffer.length;
        sun.misc.Unsafe unsafe = UNSAFE;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i4);
            int iNumberAt = numberAt(i4);
            int iType = type(iTypeAndOffsetAt);
            if (iType <= 17) {
                int i6 = this.buffer[i4 + 2];
                int i7 = i6 & i2;
                if (i7 != i3) {
                    i5 = unsafe.getInt(t, i7);
                    i3 = i7;
                }
                i = 1 << (i6 >>> 20);
            } else {
                i = 0;
            }
            while (entry != null && this.extensionSchema.extensionNumber(entry) <= iNumberAt) {
                this.extensionSchema.serializeExtension(writer, entry);
                entry = it.hasNext() ? (java.util.Map.Entry) it.next() : null;
            }
            long jOffset = offset(iTypeAndOffsetAt);
            switch (iType) {
                case 0:
                    if ((i & i5) != 0) {
                        writer.writeDouble(iNumberAt, doubleAt(t, jOffset));
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 1:
                    if ((i & i5) != 0) {
                        writer.writeFloat(iNumberAt, floatAt(t, jOffset));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 2:
                    if ((i & i5) != 0) {
                        writer.writeInt64(iNumberAt, unsafe.getLong(t, jOffset));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 3:
                    if ((i & i5) != 0) {
                        writer.writeUInt64(iNumberAt, unsafe.getLong(t, jOffset));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 4:
                    if ((i & i5) != 0) {
                        writer.writeInt32(iNumberAt, unsafe.getInt(t, jOffset));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 5:
                    if ((i & i5) != 0) {
                        writer.writeFixed64(iNumberAt, unsafe.getLong(t, jOffset));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 6:
                    if ((i & i5) != 0) {
                        writer.writeFixed32(iNumberAt, unsafe.getInt(t, jOffset));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 7:
                    if ((i & i5) != 0) {
                        writer.writeBool(iNumberAt, booleanAt(t, jOffset));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 8:
                    if ((i & i5) != 0) {
                        writeString(iNumberAt, unsafe.getObject(t, jOffset), writer);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 9:
                    if ((i & i5) != 0) {
                        writer.writeMessage(iNumberAt, unsafe.getObject(t, jOffset), getMessageFieldSchema(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 10:
                    if ((i & i5) != 0) {
                        writer.writeBytes(iNumberAt, (com.google.protobuf.ByteString) unsafe.getObject(t, jOffset));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 11:
                    if ((i & i5) != 0) {
                        writer.writeUInt32(iNumberAt, unsafe.getInt(t, jOffset));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 12:
                    if ((i & i5) != 0) {
                        writer.writeEnum(iNumberAt, unsafe.getInt(t, jOffset));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 13:
                    if ((i & i5) != 0) {
                        writer.writeSFixed32(iNumberAt, unsafe.getInt(t, jOffset));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 14:
                    if ((i & i5) != 0) {
                        writer.writeSFixed64(iNumberAt, unsafe.getLong(t, jOffset));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 15:
                    if ((i & i5) != 0) {
                        writer.writeSInt32(iNumberAt, unsafe.getInt(t, jOffset));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 16:
                    if ((i & i5) != 0) {
                        writer.writeSInt64(iNumberAt, unsafe.getLong(t, jOffset));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 17:
                    if ((i & i5) != 0) {
                        writer.writeGroup(iNumberAt, unsafe.getObject(t, jOffset), getMessageFieldSchema(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 18:
                    com.google.protobuf.SchemaUtil.writeDoubleList(numberAt(i4), (java.util.List) unsafe.getObject(t, jOffset), writer, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 19:
                    com.google.protobuf.SchemaUtil.writeFloatList(numberAt(i4), (java.util.List) unsafe.getObject(t, jOffset), writer, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 20:
                    com.google.protobuf.SchemaUtil.writeInt64List(numberAt(i4), (java.util.List) unsafe.getObject(t, jOffset), writer, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 21:
                    com.google.protobuf.SchemaUtil.writeUInt64List(numberAt(i4), (java.util.List) unsafe.getObject(t, jOffset), writer, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 22:
                    com.google.protobuf.SchemaUtil.writeInt32List(numberAt(i4), (java.util.List) unsafe.getObject(t, jOffset), writer, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 23:
                    com.google.protobuf.SchemaUtil.writeFixed64List(numberAt(i4), (java.util.List) unsafe.getObject(t, jOffset), writer, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 24:
                    com.google.protobuf.SchemaUtil.writeFixed32List(numberAt(i4), (java.util.List) unsafe.getObject(t, jOffset), writer, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 25:
                    com.google.protobuf.SchemaUtil.writeBoolList(numberAt(i4), (java.util.List) unsafe.getObject(t, jOffset), writer, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 26:
                    com.google.protobuf.SchemaUtil.writeStringList(numberAt(i4), (java.util.List) unsafe.getObject(t, jOffset), writer);
                    break;
                case 27:
                    com.google.protobuf.SchemaUtil.writeMessageList(numberAt(i4), (java.util.List) unsafe.getObject(t, jOffset), writer, getMessageFieldSchema(i4));
                    break;
                case 28:
                    com.google.protobuf.SchemaUtil.writeBytesList(numberAt(i4), (java.util.List) unsafe.getObject(t, jOffset), writer);
                    break;
                case 29:
                    com.google.protobuf.SchemaUtil.writeUInt32List(numberAt(i4), (java.util.List) unsafe.getObject(t, jOffset), writer, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 30:
                    com.google.protobuf.SchemaUtil.writeEnumList(numberAt(i4), (java.util.List) unsafe.getObject(t, jOffset), writer, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 31:
                    com.google.protobuf.SchemaUtil.writeSFixed32List(numberAt(i4), (java.util.List) unsafe.getObject(t, jOffset), writer, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 32:
                    com.google.protobuf.SchemaUtil.writeSFixed64List(numberAt(i4), (java.util.List) unsafe.getObject(t, jOffset), writer, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 33:
                    com.google.protobuf.SchemaUtil.writeSInt32List(numberAt(i4), (java.util.List) unsafe.getObject(t, jOffset), writer, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 34:
                    com.google.protobuf.SchemaUtil.writeSInt64List(numberAt(i4), (java.util.List) unsafe.getObject(t, jOffset), writer, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 35:
                    com.google.protobuf.SchemaUtil.writeDoubleList(numberAt(i4), (java.util.List) unsafe.getObject(t, jOffset), writer, true);
                    break;
                case 36:
                    com.google.protobuf.SchemaUtil.writeFloatList(numberAt(i4), (java.util.List) unsafe.getObject(t, jOffset), writer, true);
                    break;
                case 37:
                    com.google.protobuf.SchemaUtil.writeInt64List(numberAt(i4), (java.util.List) unsafe.getObject(t, jOffset), writer, true);
                    break;
                case 38:
                    com.google.protobuf.SchemaUtil.writeUInt64List(numberAt(i4), (java.util.List) unsafe.getObject(t, jOffset), writer, true);
                    break;
                case 39:
                    com.google.protobuf.SchemaUtil.writeInt32List(numberAt(i4), (java.util.List) unsafe.getObject(t, jOffset), writer, true);
                    break;
                case 40:
                    com.google.protobuf.SchemaUtil.writeFixed64List(numberAt(i4), (java.util.List) unsafe.getObject(t, jOffset), writer, true);
                    break;
                case 41:
                    com.google.protobuf.SchemaUtil.writeFixed32List(numberAt(i4), (java.util.List) unsafe.getObject(t, jOffset), writer, true);
                    break;
                case 42:
                    com.google.protobuf.SchemaUtil.writeBoolList(numberAt(i4), (java.util.List) unsafe.getObject(t, jOffset), writer, true);
                    break;
                case 43:
                    com.google.protobuf.SchemaUtil.writeUInt32List(numberAt(i4), (java.util.List) unsafe.getObject(t, jOffset), writer, true);
                    break;
                case 44:
                    com.google.protobuf.SchemaUtil.writeEnumList(numberAt(i4), (java.util.List) unsafe.getObject(t, jOffset), writer, true);
                    break;
                case 45:
                    com.google.protobuf.SchemaUtil.writeSFixed32List(numberAt(i4), (java.util.List) unsafe.getObject(t, jOffset), writer, true);
                    break;
                case 46:
                    com.google.protobuf.SchemaUtil.writeSFixed64List(numberAt(i4), (java.util.List) unsafe.getObject(t, jOffset), writer, true);
                    break;
                case 47:
                    com.google.protobuf.SchemaUtil.writeSInt32List(numberAt(i4), (java.util.List) unsafe.getObject(t, jOffset), writer, true);
                    break;
                case 48:
                    com.google.protobuf.SchemaUtil.writeSInt64List(numberAt(i4), (java.util.List) unsafe.getObject(t, jOffset), writer, true);
                    break;
                case 49:
                    com.google.protobuf.SchemaUtil.writeGroupList(numberAt(i4), (java.util.List) unsafe.getObject(t, jOffset), writer, getMessageFieldSchema(i4));
                    break;
                case 50:
                    writeMapHelper(writer, iNumberAt, unsafe.getObject(t, jOffset), i4);
                    break;
                case 51:
                    if (isOneofPresent(t, iNumberAt, i4)) {
                        writer.writeDouble(iNumberAt, oneofDoubleAt(t, jOffset));
                    }
                    break;
                case 52:
                    if (isOneofPresent(t, iNumberAt, i4)) {
                        writer.writeFloat(iNumberAt, oneofFloatAt(t, jOffset));
                    }
                    break;
                case 53:
                    if (isOneofPresent(t, iNumberAt, i4)) {
                        writer.writeInt64(iNumberAt, oneofLongAt(t, jOffset));
                    }
                    break;
                case 54:
                    if (isOneofPresent(t, iNumberAt, i4)) {
                        writer.writeUInt64(iNumberAt, oneofLongAt(t, jOffset));
                    }
                    break;
                case 55:
                    if (isOneofPresent(t, iNumberAt, i4)) {
                        writer.writeInt32(iNumberAt, oneofIntAt(t, jOffset));
                    }
                    break;
                case 56:
                    if (isOneofPresent(t, iNumberAt, i4)) {
                        writer.writeFixed64(iNumberAt, oneofLongAt(t, jOffset));
                    }
                    break;
                case 57:
                    if (isOneofPresent(t, iNumberAt, i4)) {
                        writer.writeFixed32(iNumberAt, oneofIntAt(t, jOffset));
                    }
                    break;
                case 58:
                    if (isOneofPresent(t, iNumberAt, i4)) {
                        writer.writeBool(iNumberAt, oneofBooleanAt(t, jOffset));
                    }
                    break;
                case 59:
                    if (isOneofPresent(t, iNumberAt, i4)) {
                        writeString(iNumberAt, unsafe.getObject(t, jOffset), writer);
                    }
                    break;
                case 60:
                    if (isOneofPresent(t, iNumberAt, i4)) {
                        writer.writeMessage(iNumberAt, unsafe.getObject(t, jOffset), getMessageFieldSchema(i4));
                    }
                    break;
                case 61:
                    if (isOneofPresent(t, iNumberAt, i4)) {
                        writer.writeBytes(iNumberAt, (com.google.protobuf.ByteString) unsafe.getObject(t, jOffset));
                    }
                    break;
                case 62:
                    if (isOneofPresent(t, iNumberAt, i4)) {
                        writer.writeUInt32(iNumberAt, oneofIntAt(t, jOffset));
                    }
                    break;
                case 63:
                    if (isOneofPresent(t, iNumberAt, i4)) {
                        writer.writeEnum(iNumberAt, oneofIntAt(t, jOffset));
                    }
                    break;
                case 64:
                    if (isOneofPresent(t, iNumberAt, i4)) {
                        writer.writeSFixed32(iNumberAt, oneofIntAt(t, jOffset));
                    }
                    break;
                case 65:
                    if (isOneofPresent(t, iNumberAt, i4)) {
                        writer.writeSFixed64(iNumberAt, oneofLongAt(t, jOffset));
                    }
                    break;
                case 66:
                    if (isOneofPresent(t, iNumberAt, i4)) {
                        writer.writeSInt32(iNumberAt, oneofIntAt(t, jOffset));
                    }
                    break;
                case 67:
                    if (isOneofPresent(t, iNumberAt, i4)) {
                        writer.writeSInt64(iNumberAt, oneofLongAt(t, jOffset));
                    }
                    break;
                case 68:
                    if (isOneofPresent(t, iNumberAt, i4)) {
                        writer.writeGroup(iNumberAt, unsafe.getObject(t, jOffset), getMessageFieldSchema(i4));
                    }
                    break;
            }
            i4 += 3;
            i2 = 1048575;
        }
        while (entry != null) {
            this.extensionSchema.serializeExtension(writer, entry);
            entry = it.hasNext() ? (java.util.Map.Entry) it.next() : null;
        }
        writeUnknownInMessageTo(this.unknownFieldSchema, t, writer);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    private void writeFieldsInAscendingOrderProto3(T t, com.google.protobuf.Writer writer) throws java.io.IOException {
        java.util.Iterator it;
        java.util.Map.Entry<?, ?> entry;
        if (this.hasExtensions) {
            com.google.protobuf.FieldSet<T> extensions = this.extensionSchema.getExtensions(t);
            if (extensions.isEmpty()) {
                it = null;
                entry = null;
            } else {
                it = extensions.iterator();
                entry = (java.util.Map.Entry) it.next();
            }
        } else {
            it = null;
            entry = null;
        }
        int length = this.buffer.length;
        for (int i = 0; i < length; i += 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i);
            int iNumberAt = numberAt(i);
            while (entry != null && this.extensionSchema.extensionNumber(entry) <= iNumberAt) {
                this.extensionSchema.serializeExtension(writer, entry);
                entry = it.hasNext() ? (java.util.Map.Entry) it.next() : null;
            }
            switch (type(iTypeAndOffsetAt)) {
                case 0:
                    if (isFieldPresent(t, i)) {
                        writer.writeDouble(iNumberAt, doubleAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 1:
                    if (isFieldPresent(t, i)) {
                        writer.writeFloat(iNumberAt, floatAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 2:
                    if (isFieldPresent(t, i)) {
                        writer.writeInt64(iNumberAt, longAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 3:
                    if (isFieldPresent(t, i)) {
                        writer.writeUInt64(iNumberAt, longAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 4:
                    if (isFieldPresent(t, i)) {
                        writer.writeInt32(iNumberAt, intAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 5:
                    if (isFieldPresent(t, i)) {
                        writer.writeFixed64(iNumberAt, longAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 6:
                    if (isFieldPresent(t, i)) {
                        writer.writeFixed32(iNumberAt, intAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 7:
                    if (isFieldPresent(t, i)) {
                        writer.writeBool(iNumberAt, booleanAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 8:
                    if (isFieldPresent(t, i)) {
                        writeString(iNumberAt, com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer);
                    }
                    break;
                case 9:
                    if (isFieldPresent(t, i)) {
                        writer.writeMessage(iNumberAt, com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), getMessageFieldSchema(i));
                    }
                    break;
                case 10:
                    if (isFieldPresent(t, i)) {
                        writer.writeBytes(iNumberAt, (com.google.protobuf.ByteString) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 11:
                    if (isFieldPresent(t, i)) {
                        writer.writeUInt32(iNumberAt, intAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 12:
                    if (isFieldPresent(t, i)) {
                        writer.writeEnum(iNumberAt, intAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 13:
                    if (isFieldPresent(t, i)) {
                        writer.writeSFixed32(iNumberAt, intAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 14:
                    if (isFieldPresent(t, i)) {
                        writer.writeSFixed64(iNumberAt, longAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 15:
                    if (isFieldPresent(t, i)) {
                        writer.writeSInt32(iNumberAt, intAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 16:
                    if (isFieldPresent(t, i)) {
                        writer.writeSInt64(iNumberAt, longAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 17:
                    if (isFieldPresent(t, i)) {
                        writer.writeGroup(iNumberAt, com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), getMessageFieldSchema(i));
                    }
                    break;
                case 18:
                    com.google.protobuf.SchemaUtil.writeDoubleList(numberAt(i), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 19:
                    com.google.protobuf.SchemaUtil.writeFloatList(numberAt(i), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 20:
                    com.google.protobuf.SchemaUtil.writeInt64List(numberAt(i), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 21:
                    com.google.protobuf.SchemaUtil.writeUInt64List(numberAt(i), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 22:
                    com.google.protobuf.SchemaUtil.writeInt32List(numberAt(i), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 23:
                    com.google.protobuf.SchemaUtil.writeFixed64List(numberAt(i), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 24:
                    com.google.protobuf.SchemaUtil.writeFixed32List(numberAt(i), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 25:
                    com.google.protobuf.SchemaUtil.writeBoolList(numberAt(i), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 26:
                    com.google.protobuf.SchemaUtil.writeStringList(numberAt(i), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer);
                    break;
                case 27:
                    com.google.protobuf.SchemaUtil.writeMessageList(numberAt(i), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, getMessageFieldSchema(i));
                    break;
                case 28:
                    com.google.protobuf.SchemaUtil.writeBytesList(numberAt(i), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer);
                    break;
                case 29:
                    com.google.protobuf.SchemaUtil.writeUInt32List(numberAt(i), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 30:
                    com.google.protobuf.SchemaUtil.writeEnumList(numberAt(i), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 31:
                    com.google.protobuf.SchemaUtil.writeSFixed32List(numberAt(i), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 32:
                    com.google.protobuf.SchemaUtil.writeSFixed64List(numberAt(i), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 33:
                    com.google.protobuf.SchemaUtil.writeSInt32List(numberAt(i), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 34:
                    com.google.protobuf.SchemaUtil.writeSInt64List(numberAt(i), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 35:
                    com.google.protobuf.SchemaUtil.writeDoubleList(numberAt(i), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 36:
                    com.google.protobuf.SchemaUtil.writeFloatList(numberAt(i), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 37:
                    com.google.protobuf.SchemaUtil.writeInt64List(numberAt(i), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 38:
                    com.google.protobuf.SchemaUtil.writeUInt64List(numberAt(i), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 39:
                    com.google.protobuf.SchemaUtil.writeInt32List(numberAt(i), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 40:
                    com.google.protobuf.SchemaUtil.writeFixed64List(numberAt(i), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 41:
                    com.google.protobuf.SchemaUtil.writeFixed32List(numberAt(i), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 42:
                    com.google.protobuf.SchemaUtil.writeBoolList(numberAt(i), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 43:
                    com.google.protobuf.SchemaUtil.writeUInt32List(numberAt(i), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 44:
                    com.google.protobuf.SchemaUtil.writeEnumList(numberAt(i), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 45:
                    com.google.protobuf.SchemaUtil.writeSFixed32List(numberAt(i), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 46:
                    com.google.protobuf.SchemaUtil.writeSFixed64List(numberAt(i), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 47:
                    com.google.protobuf.SchemaUtil.writeSInt32List(numberAt(i), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 48:
                    com.google.protobuf.SchemaUtil.writeSInt64List(numberAt(i), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 49:
                    com.google.protobuf.SchemaUtil.writeGroupList(numberAt(i), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, getMessageFieldSchema(i));
                    break;
                case 50:
                    writeMapHelper(writer, iNumberAt, com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), i);
                    break;
                case 51:
                    if (isOneofPresent(t, iNumberAt, i)) {
                        writer.writeDouble(iNumberAt, oneofDoubleAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 52:
                    if (isOneofPresent(t, iNumberAt, i)) {
                        writer.writeFloat(iNumberAt, oneofFloatAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 53:
                    if (isOneofPresent(t, iNumberAt, i)) {
                        writer.writeInt64(iNumberAt, oneofLongAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 54:
                    if (isOneofPresent(t, iNumberAt, i)) {
                        writer.writeUInt64(iNumberAt, oneofLongAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 55:
                    if (isOneofPresent(t, iNumberAt, i)) {
                        writer.writeInt32(iNumberAt, oneofIntAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 56:
                    if (isOneofPresent(t, iNumberAt, i)) {
                        writer.writeFixed64(iNumberAt, oneofLongAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 57:
                    if (isOneofPresent(t, iNumberAt, i)) {
                        writer.writeFixed32(iNumberAt, oneofIntAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 58:
                    if (isOneofPresent(t, iNumberAt, i)) {
                        writer.writeBool(iNumberAt, oneofBooleanAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 59:
                    if (isOneofPresent(t, iNumberAt, i)) {
                        writeString(iNumberAt, com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer);
                    }
                    break;
                case 60:
                    if (isOneofPresent(t, iNumberAt, i)) {
                        writer.writeMessage(iNumberAt, com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), getMessageFieldSchema(i));
                    }
                    break;
                case 61:
                    if (isOneofPresent(t, iNumberAt, i)) {
                        writer.writeBytes(iNumberAt, (com.google.protobuf.ByteString) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 62:
                    if (isOneofPresent(t, iNumberAt, i)) {
                        writer.writeUInt32(iNumberAt, oneofIntAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 63:
                    if (isOneofPresent(t, iNumberAt, i)) {
                        writer.writeEnum(iNumberAt, oneofIntAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 64:
                    if (isOneofPresent(t, iNumberAt, i)) {
                        writer.writeSFixed32(iNumberAt, oneofIntAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 65:
                    if (isOneofPresent(t, iNumberAt, i)) {
                        writer.writeSFixed64(iNumberAt, oneofLongAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 66:
                    if (isOneofPresent(t, iNumberAt, i)) {
                        writer.writeSInt32(iNumberAt, oneofIntAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 67:
                    if (isOneofPresent(t, iNumberAt, i)) {
                        writer.writeSInt64(iNumberAt, oneofLongAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 68:
                    if (isOneofPresent(t, iNumberAt, i)) {
                        writer.writeGroup(iNumberAt, com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), getMessageFieldSchema(i));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.extensionSchema.serializeExtension(writer, entry);
            entry = it.hasNext() ? (java.util.Map.Entry) it.next() : null;
        }
        writeUnknownInMessageTo(this.unknownFieldSchema, t, writer);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    private void writeFieldsInDescendingOrder(T t, com.google.protobuf.Writer writer) throws java.io.IOException {
        java.util.Iterator itDescendingIterator;
        java.util.Map.Entry<?, ?> entry;
        writeUnknownInMessageTo(this.unknownFieldSchema, t, writer);
        if (this.hasExtensions) {
            com.google.protobuf.FieldSet<T> extensions = this.extensionSchema.getExtensions(t);
            if (extensions.isEmpty()) {
                itDescendingIterator = null;
                entry = null;
            } else {
                itDescendingIterator = extensions.descendingIterator();
                entry = (java.util.Map.Entry) itDescendingIterator.next();
            }
        } else {
            itDescendingIterator = null;
            entry = null;
        }
        for (int length = this.buffer.length - 3; length >= 0; length -= 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(length);
            int iNumberAt = numberAt(length);
            while (entry != null && this.extensionSchema.extensionNumber(entry) > iNumberAt) {
                this.extensionSchema.serializeExtension(writer, entry);
                entry = itDescendingIterator.hasNext() ? (java.util.Map.Entry) itDescendingIterator.next() : null;
            }
            switch (type(iTypeAndOffsetAt)) {
                case 0:
                    if (isFieldPresent(t, length)) {
                        writer.writeDouble(iNumberAt, doubleAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 1:
                    if (isFieldPresent(t, length)) {
                        writer.writeFloat(iNumberAt, floatAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 2:
                    if (isFieldPresent(t, length)) {
                        writer.writeInt64(iNumberAt, longAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 3:
                    if (isFieldPresent(t, length)) {
                        writer.writeUInt64(iNumberAt, longAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 4:
                    if (isFieldPresent(t, length)) {
                        writer.writeInt32(iNumberAt, intAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 5:
                    if (isFieldPresent(t, length)) {
                        writer.writeFixed64(iNumberAt, longAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 6:
                    if (isFieldPresent(t, length)) {
                        writer.writeFixed32(iNumberAt, intAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 7:
                    if (isFieldPresent(t, length)) {
                        writer.writeBool(iNumberAt, booleanAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 8:
                    if (isFieldPresent(t, length)) {
                        writeString(iNumberAt, com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer);
                    }
                    break;
                case 9:
                    if (isFieldPresent(t, length)) {
                        writer.writeMessage(iNumberAt, com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
                case 10:
                    if (isFieldPresent(t, length)) {
                        writer.writeBytes(iNumberAt, (com.google.protobuf.ByteString) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 11:
                    if (isFieldPresent(t, length)) {
                        writer.writeUInt32(iNumberAt, intAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 12:
                    if (isFieldPresent(t, length)) {
                        writer.writeEnum(iNumberAt, intAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 13:
                    if (isFieldPresent(t, length)) {
                        writer.writeSFixed32(iNumberAt, intAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 14:
                    if (isFieldPresent(t, length)) {
                        writer.writeSFixed64(iNumberAt, longAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 15:
                    if (isFieldPresent(t, length)) {
                        writer.writeSInt32(iNumberAt, intAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 16:
                    if (isFieldPresent(t, length)) {
                        writer.writeSInt64(iNumberAt, longAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 17:
                    if (isFieldPresent(t, length)) {
                        writer.writeGroup(iNumberAt, com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
                case 18:
                    com.google.protobuf.SchemaUtil.writeDoubleList(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 19:
                    com.google.protobuf.SchemaUtil.writeFloatList(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 20:
                    com.google.protobuf.SchemaUtil.writeInt64List(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 21:
                    com.google.protobuf.SchemaUtil.writeUInt64List(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 22:
                    com.google.protobuf.SchemaUtil.writeInt32List(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 23:
                    com.google.protobuf.SchemaUtil.writeFixed64List(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 24:
                    com.google.protobuf.SchemaUtil.writeFixed32List(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 25:
                    com.google.protobuf.SchemaUtil.writeBoolList(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 26:
                    com.google.protobuf.SchemaUtil.writeStringList(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer);
                    break;
                case 27:
                    com.google.protobuf.SchemaUtil.writeMessageList(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, getMessageFieldSchema(length));
                    break;
                case 28:
                    com.google.protobuf.SchemaUtil.writeBytesList(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer);
                    break;
                case 29:
                    com.google.protobuf.SchemaUtil.writeUInt32List(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 30:
                    com.google.protobuf.SchemaUtil.writeEnumList(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 31:
                    com.google.protobuf.SchemaUtil.writeSFixed32List(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 32:
                    com.google.protobuf.SchemaUtil.writeSFixed64List(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 33:
                    com.google.protobuf.SchemaUtil.writeSInt32List(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 34:
                    com.google.protobuf.SchemaUtil.writeSInt64List(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 35:
                    com.google.protobuf.SchemaUtil.writeDoubleList(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 36:
                    com.google.protobuf.SchemaUtil.writeFloatList(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 37:
                    com.google.protobuf.SchemaUtil.writeInt64List(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 38:
                    com.google.protobuf.SchemaUtil.writeUInt64List(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 39:
                    com.google.protobuf.SchemaUtil.writeInt32List(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 40:
                    com.google.protobuf.SchemaUtil.writeFixed64List(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 41:
                    com.google.protobuf.SchemaUtil.writeFixed32List(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 42:
                    com.google.protobuf.SchemaUtil.writeBoolList(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 43:
                    com.google.protobuf.SchemaUtil.writeUInt32List(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 44:
                    com.google.protobuf.SchemaUtil.writeEnumList(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 45:
                    com.google.protobuf.SchemaUtil.writeSFixed32List(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 46:
                    com.google.protobuf.SchemaUtil.writeSFixed64List(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 47:
                    com.google.protobuf.SchemaUtil.writeSInt32List(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 48:
                    com.google.protobuf.SchemaUtil.writeSInt64List(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 49:
                    com.google.protobuf.SchemaUtil.writeGroupList(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, getMessageFieldSchema(length));
                    break;
                case 50:
                    writeMapHelper(writer, iNumberAt, com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), length);
                    break;
                case 51:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeDouble(iNumberAt, oneofDoubleAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 52:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeFloat(iNumberAt, oneofFloatAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 53:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeInt64(iNumberAt, oneofLongAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 54:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeUInt64(iNumberAt, oneofLongAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 55:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeInt32(iNumberAt, oneofIntAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 56:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeFixed64(iNumberAt, oneofLongAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 57:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeFixed32(iNumberAt, oneofIntAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 58:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeBool(iNumberAt, oneofBooleanAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 59:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writeString(iNumberAt, com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer);
                    }
                    break;
                case 60:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeMessage(iNumberAt, com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
                case 61:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeBytes(iNumberAt, (com.google.protobuf.ByteString) com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 62:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeUInt32(iNumberAt, oneofIntAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 63:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeEnum(iNumberAt, oneofIntAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 64:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeSFixed32(iNumberAt, oneofIntAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 65:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeSFixed64(iNumberAt, oneofLongAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 66:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeSInt32(iNumberAt, oneofIntAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 67:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeSInt64(iNumberAt, oneofLongAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 68:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeGroup(iNumberAt, com.google.protobuf.UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.extensionSchema.serializeExtension(writer, entry);
            entry = itDescendingIterator.hasNext() ? (java.util.Map.Entry) itDescendingIterator.next() : null;
        }
    }

    private <K, V> void writeMapHelper(com.google.protobuf.Writer writer, int i, java.lang.Object obj, int i2) throws java.io.IOException {
        if (obj != null) {
            writer.writeMap(i, this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i2)), this.mapFieldSchema.forMapData(obj));
        }
    }

    private <UT, UB> void writeUnknownInMessageTo(com.google.protobuf.UnknownFieldSchema<UT, UB> unknownFieldSchema, T t, com.google.protobuf.Writer writer) throws java.io.IOException {
        unknownFieldSchema.writeTo(unknownFieldSchema.getFromMessage(t), writer);
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T t, com.google.protobuf.Reader reader, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.lang.Throwable {
        extensionRegistryLite.getClass();
        checkMutable(t);
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, t, reader, extensionRegistryLite);
    }

    /* JADX WARN: Code duplicated, block: B:169:0x0646 A[Catch: all -> 0x069e, TRY_LEAVE, TryCatch #13 {all -> 0x069e, blocks: (B:156:0x0617, B:167:0x0640, B:169:0x0646, B:179:0x066e, B:180:0x0673), top: B:210:0x0617 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x0653 A[LOOP:2: B:172:0x064f->B:174:0x0653, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:176:0x0668  */
    /* JADX WARN: Code duplicated, block: B:178:0x066c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:179:0x066e A[Catch: all -> 0x069e, TRY_ENTER, TryCatch #13 {all -> 0x069e, blocks: (B:156:0x0617, B:167:0x0640, B:169:0x0646, B:179:0x066e, B:180:0x0673), top: B:210:0x0617 }] */
    /* JADX WARN: Code duplicated, block: B:185:0x0680 A[LOOP:3: B:183:0x067c->B:185:0x0680, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:187:0x0695  */
    /* JADX WARN: Code duplicated, block: B:201:0x06b0 A[LOOP:4: B:199:0x06ac->B:201:0x06b0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:203:0x06c5  */
    /* JADX WARN: Code duplicated, block: B:233:0x064c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x0679 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v0, types: [com.google.protobuf.Reader] */
    private <UT, UB, ET extends com.google.protobuf.FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(com.google.protobuf.UnknownFieldSchema<UT, UB> unknownFieldSchema, com.google.protobuf.ExtensionSchema<ET> extensionSchema, T t, com.google.protobuf.Reader reader, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.lang.Throwable {
        com.google.protobuf.UnknownFieldSchema unknownFieldSchema2;
        T t2;
        int i;
        java.lang.Object objFilterMapUnknownEnumValues;
        T t3;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite2;
        int i2;
        java.lang.Object objFilterMapUnknownEnumValues2;
        int i3;
        java.lang.Object objFilterMapUnknownEnumValues3;
        java.lang.Object obj;
        com.google.protobuf.UnknownFieldSchema unknownFieldSchema3 = unknownFieldSchema;
        T t4 = t;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite3 = extensionRegistryLite;
        java.lang.Object builderFromMessage = null;
        com.google.protobuf.FieldSet mutableExtensions = null;
        while (true) {
            try {
                int fieldNumber = reader.getFieldNumber();
                int iPositionForFieldNumber = positionForFieldNumber(fieldNumber);
                if (iPositionForFieldNumber >= 0) {
                    t2 = t4;
                    try {
                        int iTypeAndOffsetAt = typeAndOffsetAt(iPositionForFieldNumber);
                        try {
                            switch (type(iTypeAndOffsetAt)) {
                                case 0:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    com.google.protobuf.UnsafeUtil.putDouble(t2, offset(iTypeAndOffsetAt), reader.readDouble());
                                    setFieldPresent(t2, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 1:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    com.google.protobuf.UnsafeUtil.putFloat(t2, offset(iTypeAndOffsetAt), reader.readFloat());
                                    setFieldPresent(t2, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 2:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    com.google.protobuf.UnsafeUtil.putLong(t2, offset(iTypeAndOffsetAt), reader.readInt64());
                                    setFieldPresent(t2, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 3:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    com.google.protobuf.UnsafeUtil.putLong(t2, offset(iTypeAndOffsetAt), reader.readUInt64());
                                    setFieldPresent(t2, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 4:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    com.google.protobuf.UnsafeUtil.putInt(t2, offset(iTypeAndOffsetAt), reader.readInt32());
                                    setFieldPresent(t2, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 5:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    com.google.protobuf.UnsafeUtil.putLong(t2, offset(iTypeAndOffsetAt), reader.readFixed64());
                                    setFieldPresent(t2, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 6:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    com.google.protobuf.UnsafeUtil.putInt(t2, offset(iTypeAndOffsetAt), reader.readFixed32());
                                    setFieldPresent(t2, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 7:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    com.google.protobuf.UnsafeUtil.putBoolean(t2, offset(iTypeAndOffsetAt), reader.readBool());
                                    setFieldPresent(t2, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 8:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    readString(t2, iTypeAndOffsetAt, reader);
                                    setFieldPresent(t2, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 9:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    com.google.protobuf.MessageLite messageLite = (com.google.protobuf.MessageLite) mutableMessageFieldForMerge(t2, iPositionForFieldNumber);
                                    reader.mergeMessageField(messageLite, getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite2);
                                    storeMessageField(t2, iPositionForFieldNumber, messageLite);
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 10:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    com.google.protobuf.UnsafeUtil.putObject(t2, offset(iTypeAndOffsetAt), reader.readBytes());
                                    setFieldPresent(t2, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 11:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    com.google.protobuf.UnsafeUtil.putInt(t2, offset(iTypeAndOffsetAt), reader.readUInt32());
                                    setFieldPresent(t2, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 12:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    int i4 = reader.readEnum();
                                    com.google.protobuf.Internal.EnumVerifier enumFieldVerifier = getEnumFieldVerifier(iPositionForFieldNumber);
                                    if (enumFieldVerifier == null || enumFieldVerifier.isInRange(i4)) {
                                        com.google.protobuf.UnsafeUtil.putInt(t2, offset(iTypeAndOffsetAt), i4);
                                        setFieldPresent(t2, iPositionForFieldNumber);
                                        builderFromMessage = obj;
                                    } else {
                                        builderFromMessage = com.google.protobuf.SchemaUtil.storeUnknownEnum(t2, fieldNumber, i4, obj, unknownFieldSchema2);
                                    }
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 13:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    com.google.protobuf.UnsafeUtil.putInt(t2, offset(iTypeAndOffsetAt), reader.readSFixed32());
                                    setFieldPresent(t2, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 14:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    com.google.protobuf.UnsafeUtil.putLong(t2, offset(iTypeAndOffsetAt), reader.readSFixed64());
                                    setFieldPresent(t2, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 15:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    com.google.protobuf.UnsafeUtil.putInt(t2, offset(iTypeAndOffsetAt), reader.readSInt32());
                                    setFieldPresent(t2, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 16:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    com.google.protobuf.UnsafeUtil.putLong(t2, offset(iTypeAndOffsetAt), reader.readSInt64());
                                    setFieldPresent(t2, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 17:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    com.google.protobuf.MessageLite messageLite2 = (com.google.protobuf.MessageLite) mutableMessageFieldForMerge(t2, iPositionForFieldNumber);
                                    reader.mergeGroupField(messageLite2, getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite2);
                                    storeMessageField(t2, iPositionForFieldNumber, messageLite2);
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 18:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readDoubleList(this.listFieldSchema.mutableListAt(t2, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 19:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readFloatList(this.listFieldSchema.mutableListAt(t2, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 20:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readInt64List(this.listFieldSchema.mutableListAt(t2, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 21:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readUInt64List(this.listFieldSchema.mutableListAt(t2, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 22:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readInt32List(this.listFieldSchema.mutableListAt(t2, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 23:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readFixed64List(this.listFieldSchema.mutableListAt(t2, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 24:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readFixed32List(this.listFieldSchema.mutableListAt(t2, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 25:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readBoolList(this.listFieldSchema.mutableListAt(t2, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 26:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    readStringList(t2, iTypeAndOffsetAt, reader);
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 27:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    readMessageList(t, iTypeAndOffsetAt, reader, getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite);
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 28:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readBytesList(this.listFieldSchema.mutableListAt(t2, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 29:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readUInt32List(this.listFieldSchema.mutableListAt(t2, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 30:
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    java.util.List listMutableListAt = this.listFieldSchema.mutableListAt(t2, offset(iTypeAndOffsetAt));
                                    reader.readEnumList(listMutableListAt);
                                    builderFromMessage = com.google.protobuf.SchemaUtil.filterUnknownEnumList(t, fieldNumber, (java.util.List<java.lang.Integer>) listMutableListAt, getEnumFieldVerifier(iPositionForFieldNumber), builderFromMessage, unknownFieldSchema);
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 31:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readSFixed32List(this.listFieldSchema.mutableListAt(t2, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 32:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readSFixed64List(this.listFieldSchema.mutableListAt(t2, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 33:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readSInt32List(this.listFieldSchema.mutableListAt(t2, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 34:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readSInt64List(this.listFieldSchema.mutableListAt(t2, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 35:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readDoubleList(this.listFieldSchema.mutableListAt(t2, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 36:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readFloatList(this.listFieldSchema.mutableListAt(t2, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 37:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readInt64List(this.listFieldSchema.mutableListAt(t2, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 38:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readUInt64List(this.listFieldSchema.mutableListAt(t2, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 39:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readInt32List(this.listFieldSchema.mutableListAt(t2, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 40:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readFixed64List(this.listFieldSchema.mutableListAt(t2, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 41:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readFixed32List(this.listFieldSchema.mutableListAt(t2, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 42:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readBoolList(this.listFieldSchema.mutableListAt(t2, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 43:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readUInt32List(this.listFieldSchema.mutableListAt(t2, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 44:
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    java.util.List listMutableListAt2 = this.listFieldSchema.mutableListAt(t2, offset(iTypeAndOffsetAt));
                                    reader.readEnumList(listMutableListAt2);
                                    builderFromMessage = com.google.protobuf.SchemaUtil.filterUnknownEnumList(t, fieldNumber, (java.util.List<java.lang.Integer>) listMutableListAt2, getEnumFieldVerifier(iPositionForFieldNumber), builderFromMessage, unknownFieldSchema);
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 45:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readSFixed32List(this.listFieldSchema.mutableListAt(t2, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 46:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readSFixed64List(this.listFieldSchema.mutableListAt(t2, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 47:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readSInt32List(this.listFieldSchema.mutableListAt(t2, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 48:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    reader.readSInt64List(this.listFieldSchema.mutableListAt(t2, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 49:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    readGroupList(t, offset(iTypeAndOffsetAt), reader, getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite);
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 50:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    try {
                                        mergeMap(t, iPositionForFieldNumber, getMapFieldDefaultEntry(iPositionForFieldNumber), extensionRegistryLite, reader);
                                        unknownFieldSchema2 = unknownFieldSchema3;
                                        builderFromMessage = obj;
                                    } catch (com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException unused) {
                                        unknownFieldSchema2 = unknownFieldSchema3;
                                        builderFromMessage = obj;
                                        if (unknownFieldSchema2.shouldDiscardUnknownFields(reader)) {
                                            if (builderFromMessage == null) {
                                                builderFromMessage = unknownFieldSchema2.getBuilderFromMessage(t2);
                                            }
                                            if (!unknownFieldSchema2.mergeOneFieldFrom(builderFromMessage, reader)) {
                                                objFilterMapUnknownEnumValues2 = builderFromMessage;
                                                for (i2 = this.checkInitializedCount; i2 < this.repeatedFieldOffsetStart; i2++) {
                                                    objFilterMapUnknownEnumValues2 = filterMapUnknownEnumValues(t, this.intArray[i2], objFilterMapUnknownEnumValues2, unknownFieldSchema, t);
                                                }
                                                if (objFilterMapUnknownEnumValues2 != null) {
                                                    unknownFieldSchema2.setBuilderToMessage(t2, objFilterMapUnknownEnumValues2);
                                                    return;
                                                }
                                                return;
                                            }
                                        } else if (!reader.skipField()) {
                                            objFilterMapUnknownEnumValues3 = builderFromMessage;
                                            for (i3 = this.checkInitializedCount; i3 < this.repeatedFieldOffsetStart; i3++) {
                                                objFilterMapUnknownEnumValues3 = filterMapUnknownEnumValues(t, this.intArray[i3], objFilterMapUnknownEnumValues3, unknownFieldSchema, t);
                                            }
                                            if (objFilterMapUnknownEnumValues3 != null) {
                                                unknownFieldSchema2.setBuilderToMessage(t2, objFilterMapUnknownEnumValues3);
                                                return;
                                            }
                                            return;
                                        }
                                    } catch (java.lang.Throwable th) {
                                        th = th;
                                        unknownFieldSchema2 = unknownFieldSchema3;
                                        builderFromMessage = obj;
                                        objFilterMapUnknownEnumValues = builderFromMessage;
                                        for (i = this.checkInitializedCount; i < this.repeatedFieldOffsetStart; i++) {
                                            objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(t, this.intArray[i], objFilterMapUnknownEnumValues, unknownFieldSchema, t);
                                        }
                                        if (objFilterMapUnknownEnumValues != null) {
                                            unknownFieldSchema2.setBuilderToMessage(t2, objFilterMapUnknownEnumValues);
                                        }
                                        throw th;
                                    }
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 51:
                                    com.google.protobuf.UnsafeUtil.putObject(t2, offset(iTypeAndOffsetAt), java.lang.Double.valueOf(reader.readDouble()));
                                    setOneofPresent(t2, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 52:
                                    com.google.protobuf.UnsafeUtil.putObject(t2, offset(iTypeAndOffsetAt), java.lang.Float.valueOf(reader.readFloat()));
                                    setOneofPresent(t2, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 53:
                                    com.google.protobuf.UnsafeUtil.putObject(t2, offset(iTypeAndOffsetAt), java.lang.Long.valueOf(reader.readInt64()));
                                    setOneofPresent(t2, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 54:
                                    com.google.protobuf.UnsafeUtil.putObject(t2, offset(iTypeAndOffsetAt), java.lang.Long.valueOf(reader.readUInt64()));
                                    setOneofPresent(t2, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 55:
                                    com.google.protobuf.UnsafeUtil.putObject(t2, offset(iTypeAndOffsetAt), java.lang.Integer.valueOf(reader.readInt32()));
                                    setOneofPresent(t2, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 56:
                                    com.google.protobuf.UnsafeUtil.putObject(t2, offset(iTypeAndOffsetAt), java.lang.Long.valueOf(reader.readFixed64()));
                                    setOneofPresent(t2, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 57:
                                    com.google.protobuf.UnsafeUtil.putObject(t2, offset(iTypeAndOffsetAt), java.lang.Integer.valueOf(reader.readFixed32()));
                                    setOneofPresent(t2, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 58:
                                    com.google.protobuf.UnsafeUtil.putObject(t2, offset(iTypeAndOffsetAt), java.lang.Boolean.valueOf(reader.readBool()));
                                    setOneofPresent(t2, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 59:
                                    readString(t2, iTypeAndOffsetAt, reader);
                                    setOneofPresent(t2, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 60:
                                    com.google.protobuf.MessageLite messageLite3 = (com.google.protobuf.MessageLite) mutableOneofMessageFieldForMerge(t2, fieldNumber, iPositionForFieldNumber);
                                    reader.mergeMessageField(messageLite3, getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite3);
                                    storeOneofMessageField(t2, fieldNumber, iPositionForFieldNumber, messageLite3);
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 61:
                                    com.google.protobuf.UnsafeUtil.putObject(t2, offset(iTypeAndOffsetAt), reader.readBytes());
                                    setOneofPresent(t2, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 62:
                                    com.google.protobuf.UnsafeUtil.putObject(t2, offset(iTypeAndOffsetAt), java.lang.Integer.valueOf(reader.readUInt32()));
                                    setOneofPresent(t2, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 63:
                                    int i5 = reader.readEnum();
                                    com.google.protobuf.Internal.EnumVerifier enumFieldVerifier2 = getEnumFieldVerifier(iPositionForFieldNumber);
                                    if (enumFieldVerifier2 == null || enumFieldVerifier2.isInRange(i5)) {
                                        com.google.protobuf.UnsafeUtil.putObject(t2, offset(iTypeAndOffsetAt), java.lang.Integer.valueOf(i5));
                                        setOneofPresent(t2, fieldNumber, iPositionForFieldNumber);
                                        obj = builderFromMessage;
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        unknownFieldSchema2 = unknownFieldSchema3;
                                        builderFromMessage = obj;
                                    } else {
                                        builderFromMessage = com.google.protobuf.SchemaUtil.storeUnknownEnum(t2, fieldNumber, i5, builderFromMessage, unknownFieldSchema3);
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        unknownFieldSchema2 = unknownFieldSchema3;
                                    }
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 64:
                                    com.google.protobuf.UnsafeUtil.putObject(t2, offset(iTypeAndOffsetAt), java.lang.Integer.valueOf(reader.readSFixed32()));
                                    setOneofPresent(t2, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 65:
                                    com.google.protobuf.UnsafeUtil.putObject(t2, offset(iTypeAndOffsetAt), java.lang.Long.valueOf(reader.readSFixed64()));
                                    setOneofPresent(t2, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 66:
                                    com.google.protobuf.UnsafeUtil.putObject(t2, offset(iTypeAndOffsetAt), java.lang.Integer.valueOf(reader.readSInt32()));
                                    setOneofPresent(t2, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 67:
                                    com.google.protobuf.UnsafeUtil.putObject(t2, offset(iTypeAndOffsetAt), java.lang.Long.valueOf(reader.readSInt64()));
                                    setOneofPresent(t2, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    builderFromMessage = obj;
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                case 68:
                                    try {
                                        com.google.protobuf.MessageLite messageLite4 = (com.google.protobuf.MessageLite) mutableOneofMessageFieldForMerge(t2, fieldNumber, iPositionForFieldNumber);
                                        reader.mergeGroupField(messageLite4, getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite3);
                                        storeOneofMessageField(t2, fieldNumber, iPositionForFieldNumber, messageLite4);
                                        obj = builderFromMessage;
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        unknownFieldSchema2 = unknownFieldSchema3;
                                        builderFromMessage = obj;
                                    } catch (com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException unused2) {
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        unknownFieldSchema2 = unknownFieldSchema3;
                                        if (unknownFieldSchema2.shouldDiscardUnknownFields(reader)) {
                                            if (builderFromMessage == null) {
                                                builderFromMessage = unknownFieldSchema2.getBuilderFromMessage(t2);
                                            }
                                            if (!unknownFieldSchema2.mergeOneFieldFrom(builderFromMessage, reader)) {
                                                objFilterMapUnknownEnumValues2 = builderFromMessage;
                                                while (i2 < this.repeatedFieldOffsetStart) {
                                                    objFilterMapUnknownEnumValues2 = filterMapUnknownEnumValues(t, this.intArray[i2], objFilterMapUnknownEnumValues2, unknownFieldSchema, t);
                                                }
                                                if (objFilterMapUnknownEnumValues2 != null) {
                                                    unknownFieldSchema2.setBuilderToMessage(t2, objFilterMapUnknownEnumValues2);
                                                    return;
                                                }
                                                return;
                                            }
                                        } else if (!reader.skipField()) {
                                            objFilterMapUnknownEnumValues3 = builderFromMessage;
                                            while (i3 < this.repeatedFieldOffsetStart) {
                                                objFilterMapUnknownEnumValues3 = filterMapUnknownEnumValues(t, this.intArray[i3], objFilterMapUnknownEnumValues3, unknownFieldSchema, t);
                                            }
                                            if (objFilterMapUnknownEnumValues3 != null) {
                                                unknownFieldSchema2.setBuilderToMessage(t2, objFilterMapUnknownEnumValues3);
                                                return;
                                            }
                                            return;
                                        }
                                    } catch (java.lang.Throwable th2) {
                                        th = th2;
                                        unknownFieldSchema2 = unknownFieldSchema3;
                                        objFilterMapUnknownEnumValues = builderFromMessage;
                                        while (i < this.repeatedFieldOffsetStart) {
                                            objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(t, this.intArray[i], objFilterMapUnknownEnumValues, unknownFieldSchema, t);
                                        }
                                        if (objFilterMapUnknownEnumValues != null) {
                                            unknownFieldSchema2.setBuilderToMessage(t2, objFilterMapUnknownEnumValues);
                                        }
                                        throw th;
                                    }
                                    t4 = t2;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    break;
                                default:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    if (obj == null) {
                                        try {
                                            builderFromMessage = unknownFieldSchema2.getBuilderFromMessage(t2);
                                        } catch (com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException unused3) {
                                            builderFromMessage = obj;
                                            if (unknownFieldSchema2.shouldDiscardUnknownFields(reader)) {
                                                if (builderFromMessage == null) {
                                                    builderFromMessage = unknownFieldSchema2.getBuilderFromMessage(t2);
                                                }
                                                if (!unknownFieldSchema2.mergeOneFieldFrom(builderFromMessage, reader)) {
                                                    objFilterMapUnknownEnumValues2 = builderFromMessage;
                                                    while (i2 < this.repeatedFieldOffsetStart) {
                                                        objFilterMapUnknownEnumValues2 = filterMapUnknownEnumValues(t, this.intArray[i2], objFilterMapUnknownEnumValues2, unknownFieldSchema, t);
                                                    }
                                                    if (objFilterMapUnknownEnumValues2 != null) {
                                                        unknownFieldSchema2.setBuilderToMessage(t2, objFilterMapUnknownEnumValues2);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            } else if (!reader.skipField()) {
                                                objFilterMapUnknownEnumValues3 = builderFromMessage;
                                                while (i3 < this.repeatedFieldOffsetStart) {
                                                    objFilterMapUnknownEnumValues3 = filterMapUnknownEnumValues(t, this.intArray[i3], objFilterMapUnknownEnumValues3, unknownFieldSchema, t);
                                                }
                                                if (objFilterMapUnknownEnumValues3 != null) {
                                                    unknownFieldSchema2.setBuilderToMessage(t2, objFilterMapUnknownEnumValues3);
                                                    return;
                                                }
                                                return;
                                            }
                                            t4 = t2;
                                            extensionRegistryLite3 = extensionRegistryLite2;
                                            unknownFieldSchema3 = unknownFieldSchema2;
                                        } catch (java.lang.Throwable th3) {
                                            th = th3;
                                            builderFromMessage = obj;
                                        }
                                    } else {
                                        builderFromMessage = obj;
                                    }
                                    try {
                                        try {
                                            if (!unknownFieldSchema2.mergeOneFieldFrom(builderFromMessage, reader)) {
                                                java.lang.Object objFilterMapUnknownEnumValues4 = builderFromMessage;
                                                for (int i6 = this.checkInitializedCount; i6 < this.repeatedFieldOffsetStart; i6++) {
                                                    objFilterMapUnknownEnumValues4 = filterMapUnknownEnumValues(t, this.intArray[i6], objFilterMapUnknownEnumValues4, unknownFieldSchema, t);
                                                }
                                                if (objFilterMapUnknownEnumValues4 != null) {
                                                    unknownFieldSchema2.setBuilderToMessage(t2, objFilterMapUnknownEnumValues4);
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException unused4) {
                                            if (unknownFieldSchema2.shouldDiscardUnknownFields(reader)) {
                                                if (builderFromMessage == null) {
                                                    builderFromMessage = unknownFieldSchema2.getBuilderFromMessage(t2);
                                                }
                                                if (!unknownFieldSchema2.mergeOneFieldFrom(builderFromMessage, reader)) {
                                                    objFilterMapUnknownEnumValues2 = builderFromMessage;
                                                    while (i2 < this.repeatedFieldOffsetStart) {
                                                        objFilterMapUnknownEnumValues2 = filterMapUnknownEnumValues(t, this.intArray[i2], objFilterMapUnknownEnumValues2, unknownFieldSchema, t);
                                                    }
                                                    if (objFilterMapUnknownEnumValues2 != null) {
                                                        unknownFieldSchema2.setBuilderToMessage(t2, objFilterMapUnknownEnumValues2);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            } else if (!reader.skipField()) {
                                                objFilterMapUnknownEnumValues3 = builderFromMessage;
                                                while (i3 < this.repeatedFieldOffsetStart) {
                                                    objFilterMapUnknownEnumValues3 = filterMapUnknownEnumValues(t, this.intArray[i3], objFilterMapUnknownEnumValues3, unknownFieldSchema, t);
                                                }
                                                if (objFilterMapUnknownEnumValues3 != null) {
                                                    unknownFieldSchema2.setBuilderToMessage(t2, objFilterMapUnknownEnumValues3);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        t4 = t2;
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        unknownFieldSchema3 = unknownFieldSchema2;
                                    } catch (java.lang.Throwable th4) {
                                        th = th4;
                                    }
                                    break;
                            }
                        } catch (com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException unused5) {
                        }
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                    }
                } else {
                    if (fieldNumber == Integer.MAX_VALUE) {
                        java.lang.Object objFilterMapUnknownEnumValues5 = builderFromMessage;
                        for (int i7 = this.checkInitializedCount; i7 < this.repeatedFieldOffsetStart; i7++) {
                            objFilterMapUnknownEnumValues5 = filterMapUnknownEnumValues(t, this.intArray[i7], objFilterMapUnknownEnumValues5, unknownFieldSchema, t);
                        }
                        if (objFilterMapUnknownEnumValues5 != null) {
                            unknownFieldSchema3.setBuilderToMessage(t4, objFilterMapUnknownEnumValues5);
                            return;
                        }
                        return;
                    }
                    try {
                        java.lang.Object objFindExtensionByNumber = !this.hasExtensions ? null : extensionSchema.findExtensionByNumber(extensionRegistryLite3, this.defaultInstance, fieldNumber);
                        if (objFindExtensionByNumber != null) {
                            if (mutableExtensions == null) {
                                try {
                                    mutableExtensions = extensionSchema.getMutableExtensions(t);
                                } catch (java.lang.Throwable th6) {
                                    th = th6;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    t2 = t4;
                                    objFilterMapUnknownEnumValues = builderFromMessage;
                                    while (i < this.repeatedFieldOffsetStart) {
                                        objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(t, this.intArray[i], objFilterMapUnknownEnumValues, unknownFieldSchema, t);
                                    }
                                    if (objFilterMapUnknownEnumValues != null) {
                                        unknownFieldSchema2.setBuilderToMessage(t2, objFilterMapUnknownEnumValues);
                                    }
                                    throw th;
                                }
                            }
                            com.google.protobuf.FieldSet fieldSet = mutableExtensions;
                            t3 = t4;
                            try {
                                builderFromMessage = extensionSchema.parseExtension(t, reader, objFindExtensionByNumber, extensionRegistryLite, fieldSet, builderFromMessage, unknownFieldSchema);
                                mutableExtensions = fieldSet;
                            } catch (java.lang.Throwable th7) {
                                th = th7;
                                t2 = t3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                objFilterMapUnknownEnumValues = builderFromMessage;
                                while (i < this.repeatedFieldOffsetStart) {
                                    objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(t, this.intArray[i], objFilterMapUnknownEnumValues, unknownFieldSchema, t);
                                }
                                if (objFilterMapUnknownEnumValues != null) {
                                    unknownFieldSchema2.setBuilderToMessage(t2, objFilterMapUnknownEnumValues);
                                }
                                throw th;
                            }
                        } else {
                            t3 = t4;
                            if (unknownFieldSchema3.shouldDiscardUnknownFields(reader)) {
                                if (!reader.skipField()) {
                                }
                                mutableExtensions = mutableExtensions;
                            } else {
                                if (builderFromMessage == null) {
                                    builderFromMessage = unknownFieldSchema3.getBuilderFromMessage(t3);
                                }
                                if (!unknownFieldSchema3.mergeOneFieldFrom(builderFromMessage, reader)) {
                                }
                                mutableExtensions = mutableExtensions;
                            }
                        }
                        t4 = t3;
                    } catch (java.lang.Throwable th8) {
                        th = th8;
                        t2 = t4;
                    }
                }
            } catch (java.lang.Throwable th9) {
                th = th9;
            }
            objFilterMapUnknownEnumValues = builderFromMessage;
            while (i < this.repeatedFieldOffsetStart) {
                objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(t, this.intArray[i], objFilterMapUnknownEnumValues, unknownFieldSchema, t);
            }
            if (objFilterMapUnknownEnumValues != null) {
                unknownFieldSchema2.setBuilderToMessage(t2, objFilterMapUnknownEnumValues);
            }
            throw th;
        }
        int i8 = this.checkInitializedCount;
        java.lang.Object objFilterMapUnknownEnumValues6 = builderFromMessage;
        while (i8 < this.repeatedFieldOffsetStart) {
            objFilterMapUnknownEnumValues6 = filterMapUnknownEnumValues(t, this.intArray[i8], objFilterMapUnknownEnumValues6, unknownFieldSchema, t);
            i8++;
            t3 = t3;
        }
        T t5 = t3;
        if (objFilterMapUnknownEnumValues6 != null) {
            unknownFieldSchema3.setBuilderToMessage(t5, objFilterMapUnknownEnumValues6);
        }
    }

    static com.google.protobuf.UnknownFieldSetLite getMutableUnknownFields(java.lang.Object obj) {
        com.google.protobuf.GeneratedMessageLite generatedMessageLite = (com.google.protobuf.GeneratedMessageLite) obj;
        com.google.protobuf.UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != com.google.protobuf.UnknownFieldSetLite.getDefaultInstance()) {
            return unknownFieldSetLite;
        }
        com.google.protobuf.UnknownFieldSetLite unknownFieldSetLiteNewInstance = com.google.protobuf.UnknownFieldSetLite.newInstance();
        generatedMessageLite.unknownFields = unknownFieldSetLiteNewInstance;
        return unknownFieldSetLiteNewInstance;
    }

    /* JADX INFO: renamed from: com.google.protobuf.MessageSchema$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[com.google.protobuf.WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[com.google.protobuf.WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.FIXED32.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.SFIXED32.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.FLOAT.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.ENUM.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.INT32.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.INT64.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.UINT64.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.MESSAGE.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.SINT32.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.SINT64.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.STRING.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
        }
    }

    private int decodeMapEntryValue(byte[] bArr, int i, int i2, com.google.protobuf.WireFormat.FieldType fieldType, java.lang.Class<?> cls, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        switch (com.google.protobuf.MessageSchema.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                int iDecodeVarint64 = com.google.protobuf.ArrayDecoders.decodeVarint64(bArr, i, registers);
                registers.object1 = java.lang.Boolean.valueOf(registers.long1 != 0);
                return iDecodeVarint64;
            case 2:
                return com.google.protobuf.ArrayDecoders.decodeBytes(bArr, i, registers);
            case 3:
                registers.object1 = java.lang.Double.valueOf(com.google.protobuf.ArrayDecoders.decodeDouble(bArr, i));
                return i + 8;
            case 4:
            case 5:
                registers.object1 = java.lang.Integer.valueOf(com.google.protobuf.ArrayDecoders.decodeFixed32(bArr, i));
                return i + 4;
            case 6:
            case 7:
                registers.object1 = java.lang.Long.valueOf(com.google.protobuf.ArrayDecoders.decodeFixed64(bArr, i));
                return i + 8;
            case 8:
                registers.object1 = java.lang.Float.valueOf(com.google.protobuf.ArrayDecoders.decodeFloat(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int iDecodeVarint32 = com.google.protobuf.ArrayDecoders.decodeVarint32(bArr, i, registers);
                registers.object1 = java.lang.Integer.valueOf(registers.int1);
                return iDecodeVarint32;
            case 12:
            case 13:
                int iDecodeVarint65 = com.google.protobuf.ArrayDecoders.decodeVarint64(bArr, i, registers);
                registers.object1 = java.lang.Long.valueOf(registers.long1);
                return iDecodeVarint65;
            case 14:
                return com.google.protobuf.ArrayDecoders.decodeMessageField(com.google.protobuf.Protobuf.getInstance().schemaFor((java.lang.Class) cls), bArr, i, i2, registers);
            case 15:
                int iDecodeVarint33 = com.google.protobuf.ArrayDecoders.decodeVarint32(bArr, i, registers);
                registers.object1 = java.lang.Integer.valueOf(com.google.protobuf.CodedInputStream.decodeZigZag32(registers.int1));
                return iDecodeVarint33;
            case 16:
                int iDecodeVarint66 = com.google.protobuf.ArrayDecoders.decodeVarint64(bArr, i, registers);
                registers.object1 = java.lang.Long.valueOf(com.google.protobuf.CodedInputStream.decodeZigZag64(registers.long1));
                return iDecodeVarint66;
            case 17:
                return com.google.protobuf.ArrayDecoders.decodeStringRequireUtf8(bArr, i, registers);
            default:
                throw new java.lang.RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <K, V> int decodeMapEntry(byte[] bArr, int i, int i2, com.google.protobuf.MapEntryLite.Metadata<K, V> metadata, java.util.Map<K, V> map, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        int iDecodeVarint32;
        int iDecodeVarint33 = com.google.protobuf.ArrayDecoders.decodeVarint32(bArr, i, registers);
        int i3 = registers.int1;
        if (i3 < 0 || i3 > i2 - iDecodeVarint33) {
            throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }
        int i4 = iDecodeVarint33 + i3;
        java.lang.Object obj = metadata.defaultKey;
        java.lang.Object obj2 = metadata.defaultValue;
        while (iDecodeVarint33 < i4) {
            int i5 = iDecodeVarint33 + 1;
            int i6 = bArr[iDecodeVarint33];
            if (i6 < 0) {
                iDecodeVarint32 = com.google.protobuf.ArrayDecoders.decodeVarint32(i6, bArr, i5, registers);
                i6 = registers.int1;
            } else {
                iDecodeVarint32 = i5;
            }
            int i7 = i6 >>> 3;
            int i8 = i6 & 7;
            if (i7 == 1) {
                if (i8 == metadata.keyType.getWireType()) {
                    iDecodeVarint33 = decodeMapEntryValue(bArr, iDecodeVarint32, i2, metadata.keyType, null, registers);
                    obj = registers.object1;
                } else {
                    iDecodeVarint33 = com.google.protobuf.ArrayDecoders.skipField(i6, bArr, iDecodeVarint32, i2, registers);
                }
            } else if (i7 == 2 && i8 == metadata.valueType.getWireType()) {
                iDecodeVarint33 = decodeMapEntryValue(bArr, iDecodeVarint32, i2, metadata.valueType, metadata.defaultValue.getClass(), registers);
                obj2 = registers.object1;
            } else {
                iDecodeVarint33 = com.google.protobuf.ArrayDecoders.skipField(i6, bArr, iDecodeVarint32, i2, registers);
            }
        }
        if (iDecodeVarint33 != i4) {
            throw com.google.protobuf.InvalidProtocolBufferException.parseFailure();
        }
        map.put(obj, obj2);
        return i4;
    }

    private int parseRepeatedField(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        int iDecodeVarint32List;
        sun.misc.Unsafe unsafe = UNSAFE;
        com.google.protobuf.Internal.ProtobufList protobufListMutableCopyWithCapacity2 = (com.google.protobuf.Internal.ProtobufList) unsafe.getObject(t, j2);
        if (!protobufListMutableCopyWithCapacity2.isModifiable()) {
            int size = protobufListMutableCopyWithCapacity2.size();
            protobufListMutableCopyWithCapacity2 = protobufListMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            unsafe.putObject(t, j2, protobufListMutableCopyWithCapacity2);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    return com.google.protobuf.ArrayDecoders.decodePackedDoubleList(bArr, i, protobufListMutableCopyWithCapacity2, registers);
                }
                return i5 == 1 ? com.google.protobuf.ArrayDecoders.decodeDoubleList(i3, bArr, i, i2, protobufListMutableCopyWithCapacity2, registers) : i;
            case 19:
            case 36:
                if (i5 == 2) {
                    return com.google.protobuf.ArrayDecoders.decodePackedFloatList(bArr, i, protobufListMutableCopyWithCapacity2, registers);
                }
                return i5 == 5 ? com.google.protobuf.ArrayDecoders.decodeFloatList(i3, bArr, i, i2, protobufListMutableCopyWithCapacity2, registers) : i;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    return com.google.protobuf.ArrayDecoders.decodePackedVarint64List(bArr, i, protobufListMutableCopyWithCapacity2, registers);
                }
                return i5 == 0 ? com.google.protobuf.ArrayDecoders.decodeVarint64List(i3, bArr, i, i2, protobufListMutableCopyWithCapacity2, registers) : i;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return com.google.protobuf.ArrayDecoders.decodePackedVarint32List(bArr, i, protobufListMutableCopyWithCapacity2, registers);
                }
                return i5 == 0 ? com.google.protobuf.ArrayDecoders.decodeVarint32List(i3, bArr, i, i2, protobufListMutableCopyWithCapacity2, registers) : i;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    return com.google.protobuf.ArrayDecoders.decodePackedFixed64List(bArr, i, protobufListMutableCopyWithCapacity2, registers);
                }
                return i5 == 1 ? com.google.protobuf.ArrayDecoders.decodeFixed64List(i3, bArr, i, i2, protobufListMutableCopyWithCapacity2, registers) : i;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    return com.google.protobuf.ArrayDecoders.decodePackedFixed32List(bArr, i, protobufListMutableCopyWithCapacity2, registers);
                }
                return i5 == 5 ? com.google.protobuf.ArrayDecoders.decodeFixed32List(i3, bArr, i, i2, protobufListMutableCopyWithCapacity2, registers) : i;
            case 25:
            case 42:
                if (i5 == 2) {
                    return com.google.protobuf.ArrayDecoders.decodePackedBoolList(bArr, i, protobufListMutableCopyWithCapacity2, registers);
                }
                return i5 == 0 ? com.google.protobuf.ArrayDecoders.decodeBoolList(i3, bArr, i, i2, protobufListMutableCopyWithCapacity2, registers) : i;
            case 26:
                if (i5 != 2) {
                    return i;
                }
                if ((j & 536870912) == 0) {
                    return com.google.protobuf.ArrayDecoders.decodeStringList(i3, bArr, i, i2, protobufListMutableCopyWithCapacity2, registers);
                }
                return com.google.protobuf.ArrayDecoders.decodeStringListRequireUtf8(i3, bArr, i, i2, protobufListMutableCopyWithCapacity2, registers);
            case 27:
                return i5 == 2 ? com.google.protobuf.ArrayDecoders.decodeMessageList(getMessageFieldSchema(i6), i3, bArr, i, i2, protobufListMutableCopyWithCapacity2, registers) : i;
            case 28:
                return i5 == 2 ? com.google.protobuf.ArrayDecoders.decodeBytesList(i3, bArr, i, i2, protobufListMutableCopyWithCapacity2, registers) : i;
            case 30:
            case 44:
                if (i5 == 2) {
                    iDecodeVarint32List = com.google.protobuf.ArrayDecoders.decodePackedVarint32List(bArr, i, protobufListMutableCopyWithCapacity2, registers);
                } else {
                    if (i5 != 0) {
                        return i;
                    }
                    iDecodeVarint32List = com.google.protobuf.ArrayDecoders.decodeVarint32List(i3, bArr, i, i2, protobufListMutableCopyWithCapacity2, registers);
                }
                com.google.protobuf.SchemaUtil.filterUnknownEnumList((java.lang.Object) t, i4, (java.util.List<java.lang.Integer>) protobufListMutableCopyWithCapacity2, getEnumFieldVerifier(i6), (java.lang.Object) null, (com.google.protobuf.UnknownFieldSchema<UT, java.lang.Object>) this.unknownFieldSchema);
                return iDecodeVarint32List;
            case 33:
            case 47:
                if (i5 == 2) {
                    return com.google.protobuf.ArrayDecoders.decodePackedSInt32List(bArr, i, protobufListMutableCopyWithCapacity2, registers);
                }
                return i5 == 0 ? com.google.protobuf.ArrayDecoders.decodeSInt32List(i3, bArr, i, i2, protobufListMutableCopyWithCapacity2, registers) : i;
            case 34:
            case 48:
                if (i5 == 2) {
                    return com.google.protobuf.ArrayDecoders.decodePackedSInt64List(bArr, i, protobufListMutableCopyWithCapacity2, registers);
                }
                return i5 == 0 ? com.google.protobuf.ArrayDecoders.decodeSInt64List(i3, bArr, i, i2, protobufListMutableCopyWithCapacity2, registers) : i;
            case 49:
                return i5 == 3 ? com.google.protobuf.ArrayDecoders.decodeGroupList(getMessageFieldSchema(i6), i3, bArr, i, i2, protobufListMutableCopyWithCapacity2, registers) : i;
            default:
                return i;
        }
    }

    private <K, V> int parseMapField(T t, byte[] bArr, int i, int i2, int i3, long j, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        sun.misc.Unsafe unsafe = UNSAFE;
        java.lang.Object mapFieldDefaultEntry = getMapFieldDefaultEntry(i3);
        java.lang.Object object = unsafe.getObject(t, j);
        if (this.mapFieldSchema.isImmutable(object)) {
            java.lang.Object objNewMapField = this.mapFieldSchema.newMapField(mapFieldDefaultEntry);
            this.mapFieldSchema.mergeFrom(objNewMapField, object);
            unsafe.putObject(t, j, objNewMapField);
            object = objNewMapField;
        }
        return decodeMapEntry(bArr, i, i2, this.mapFieldSchema.forMapMetadata(mapFieldDefaultEntry), this.mapFieldSchema.forMutableMapData(object), registers);
    }

    private int parseOneofField(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        sun.misc.Unsafe unsafe = UNSAFE;
        long j2 = this.buffer[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(t, j, java.lang.Double.valueOf(com.google.protobuf.ArrayDecoders.decodeDouble(bArr, i)));
                int i9 = i + 8;
                unsafe.putInt(t, j2, i4);
                return i9;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(t, j, java.lang.Float.valueOf(com.google.protobuf.ArrayDecoders.decodeFloat(bArr, i)));
                int i10 = i + 4;
                unsafe.putInt(t, j2, i4);
                return i10;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int iDecodeVarint64 = com.google.protobuf.ArrayDecoders.decodeVarint64(bArr, i, registers);
                unsafe.putObject(t, j, java.lang.Long.valueOf(registers.long1));
                unsafe.putInt(t, j2, i4);
                return iDecodeVarint64;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int iDecodeVarint32 = com.google.protobuf.ArrayDecoders.decodeVarint32(bArr, i, registers);
                unsafe.putObject(t, j, java.lang.Integer.valueOf(registers.int1));
                unsafe.putInt(t, j2, i4);
                return iDecodeVarint32;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(t, j, java.lang.Long.valueOf(com.google.protobuf.ArrayDecoders.decodeFixed64(bArr, i)));
                int i11 = i + 8;
                unsafe.putInt(t, j2, i4);
                return i11;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(t, j, java.lang.Integer.valueOf(com.google.protobuf.ArrayDecoders.decodeFixed32(bArr, i)));
                int i12 = i + 4;
                unsafe.putInt(t, j2, i4);
                return i12;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int iDecodeVarint65 = com.google.protobuf.ArrayDecoders.decodeVarint64(bArr, i, registers);
                unsafe.putObject(t, j, java.lang.Boolean.valueOf(registers.long1 != 0));
                unsafe.putInt(t, j2, i4);
                return iDecodeVarint65;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int iDecodeVarint33 = com.google.protobuf.ArrayDecoders.decodeVarint32(bArr, i, registers);
                int i13 = registers.int1;
                if (i13 == 0) {
                    unsafe.putObject(t, j, "");
                } else {
                    if ((i6 & 536870912) != 0 && !com.google.protobuf.Utf8.isValidUtf8(bArr, iDecodeVarint33, iDecodeVarint33 + i13)) {
                        throw com.google.protobuf.InvalidProtocolBufferException.invalidUtf8();
                    }
                    unsafe.putObject(t, j, new java.lang.String(bArr, iDecodeVarint33, i13, com.google.protobuf.Internal.UTF_8));
                    iDecodeVarint33 += i13;
                }
                unsafe.putInt(t, j2, i4);
                return iDecodeVarint33;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                java.lang.Object objMutableOneofMessageFieldForMerge = mutableOneofMessageFieldForMerge(t, i4, i8);
                int iMergeMessageField = com.google.protobuf.ArrayDecoders.mergeMessageField(objMutableOneofMessageFieldForMerge, getMessageFieldSchema(i8), bArr, i, i2, registers);
                storeOneofMessageField(t, i4, i8, objMutableOneofMessageFieldForMerge);
                return iMergeMessageField;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                int iDecodeBytes = com.google.protobuf.ArrayDecoders.decodeBytes(bArr, i, registers);
                unsafe.putObject(t, j, registers.object1);
                unsafe.putInt(t, j2, i4);
                return iDecodeBytes;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int iDecodeVarint34 = com.google.protobuf.ArrayDecoders.decodeVarint32(bArr, i, registers);
                int i14 = registers.int1;
                com.google.protobuf.Internal.EnumVerifier enumFieldVerifier = getEnumFieldVerifier(i8);
                if (enumFieldVerifier == null || enumFieldVerifier.isInRange(i14)) {
                    unsafe.putObject(t, j, java.lang.Integer.valueOf(i14));
                    unsafe.putInt(t, j2, i4);
                } else {
                    getMutableUnknownFields(t).storeField(i3, java.lang.Long.valueOf(i14));
                }
                return iDecodeVarint34;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                int iDecodeVarint35 = com.google.protobuf.ArrayDecoders.decodeVarint32(bArr, i, registers);
                unsafe.putObject(t, j, java.lang.Integer.valueOf(com.google.protobuf.CodedInputStream.decodeZigZag32(registers.int1)));
                unsafe.putInt(t, j2, i4);
                return iDecodeVarint35;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                int iDecodeVarint66 = com.google.protobuf.ArrayDecoders.decodeVarint64(bArr, i, registers);
                unsafe.putObject(t, j, java.lang.Long.valueOf(com.google.protobuf.CodedInputStream.decodeZigZag64(registers.long1)));
                unsafe.putInt(t, j2, i4);
                return iDecodeVarint66;
            case 68:
                if (i5 != 3) {
                    return i;
                }
                java.lang.Object objMutableOneofMessageFieldForMerge2 = mutableOneofMessageFieldForMerge(t, i4, i8);
                int iMergeGroupField = com.google.protobuf.ArrayDecoders.mergeGroupField(objMutableOneofMessageFieldForMerge2, getMessageFieldSchema(i8), bArr, i, i2, (i3 & (-8)) | 4, registers);
                storeOneofMessageField(t, i4, i8, objMutableOneofMessageFieldForMerge2);
                return iMergeGroupField;
            default:
                return i;
        }
    }

    private com.google.protobuf.Schema getMessageFieldSchema(int i) {
        int i2 = (i / 3) * 2;
        com.google.protobuf.Schema schema = (com.google.protobuf.Schema) this.objects[i2];
        if (schema != null) {
            return schema;
        }
        com.google.protobuf.Schema<T> schemaSchemaFor = com.google.protobuf.Protobuf.getInstance().schemaFor((java.lang.Class) this.objects[i2 + 1]);
        this.objects[i2] = schemaSchemaFor;
        return schemaSchemaFor;
    }

    private java.lang.Object getMapFieldDefaultEntry(int i) {
        return this.objects[(i / 3) * 2];
    }

    private com.google.protobuf.Internal.EnumVerifier getEnumFieldVerifier(int i) {
        return (com.google.protobuf.Internal.EnumVerifier) this.objects[((i / 3) * 2) + 1];
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x008f. Please report as an issue. */
    int parseProto2Message(T t, byte[] bArr, int i, int i2, int i3, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        sun.misc.Unsafe unsafe;
        com.google.protobuf.MessageSchema<T> messageSchema;
        int i4;
        int i5;
        int i6;
        int i7;
        T t2;
        int i8;
        int iPositionForFieldNumber;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        byte[] bArr2;
        int iDecodeVarint64;
        int i19;
        int i20;
        com.google.protobuf.MessageSchema<T> messageSchema2 = this;
        T t3 = t;
        byte[] bArr3 = bArr;
        int i21 = i2;
        i3 = i3;
        com.google.protobuf.ArrayDecoders.Registers registers2 = registers;
        checkMutable(t);
        sun.misc.Unsafe unsafe2 = UNSAFE;
        int iDecodeUnknownField = i;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = -1;
        int i26 = 1048575;
        while (true) {
            if (iDecodeUnknownField < i21) {
                int i27 = iDecodeUnknownField + 1;
                byte b = bArr3[iDecodeUnknownField];
                if (b < 0) {
                    int iDecodeVarint32 = com.google.protobuf.ArrayDecoders.decodeVarint32(b, bArr3, i27, registers2);
                    i8 = registers2.int1;
                    i27 = iDecodeVarint32;
                } else {
                    i8 = b;
                }
                int i28 = i8 >>> 3;
                int i29 = i8 & 7;
                if (i28 > i25) {
                    iPositionForFieldNumber = messageSchema2.positionForFieldNumber(i28, i22 / 3);
                } else {
                    iPositionForFieldNumber = messageSchema2.positionForFieldNumber(i28);
                }
                int i30 = iPositionForFieldNumber;
                if (i30 == -1) {
                    i9 = i28;
                    i10 = i27;
                    i5 = i8;
                    i11 = i24;
                    i12 = i26;
                    unsafe = unsafe2;
                    i3 = i3;
                    i13 = 0;
                } else {
                    int i31 = messageSchema2.buffer[i30 + 1];
                    int iType = type(i31);
                    long jOffset = offset(i31);
                    int i32 = i8;
                    if (iType <= 17) {
                        int i33 = messageSchema2.buffer[i30 + 2];
                        int i34 = 1 << (i33 >>> 20);
                        int i35 = i33 & 1048575;
                        if (i35 != i26) {
                            if (i26 != 1048575) {
                                unsafe2.putInt(t3, i26, i24);
                            }
                            i15 = i35;
                            i14 = unsafe2.getInt(t3, i35);
                        } else {
                            i14 = i24;
                            i15 = i26;
                        }
                        switch (iType) {
                            case 0:
                                bArr2 = bArr;
                                i9 = i28;
                                i18 = i30;
                                i16 = i15;
                                i17 = i32;
                                if (i29 == 1) {
                                    com.google.protobuf.UnsafeUtil.putDouble(t3, jOffset, com.google.protobuf.ArrayDecoders.decodeDouble(bArr2, i27));
                                    iDecodeUnknownField = i27 + 8;
                                    i24 = i14 | i34;
                                    i22 = i18;
                                    i23 = i17;
                                    i25 = i9;
                                    i26 = i16;
                                    bArr3 = bArr2;
                                } else {
                                    i12 = i16;
                                    i3 = i3;
                                    i10 = i27;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i5 = i17;
                                }
                                break;
                            case 1:
                                bArr2 = bArr;
                                i9 = i28;
                                i18 = i30;
                                i16 = i15;
                                i17 = i32;
                                if (i29 == 5) {
                                    com.google.protobuf.UnsafeUtil.putFloat(t3, jOffset, com.google.protobuf.ArrayDecoders.decodeFloat(bArr2, i27));
                                    iDecodeUnknownField = i27 + 4;
                                    i24 = i14 | i34;
                                    i22 = i18;
                                    i23 = i17;
                                    i25 = i9;
                                    i26 = i16;
                                    bArr3 = bArr2;
                                } else {
                                    i12 = i16;
                                    i3 = i3;
                                    i10 = i27;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i5 = i17;
                                }
                                break;
                            case 2:
                            case 3:
                                bArr2 = bArr;
                                i9 = i28;
                                i18 = i30;
                                i16 = i15;
                                i17 = i32;
                                if (i29 == 0) {
                                    iDecodeVarint64 = com.google.protobuf.ArrayDecoders.decodeVarint64(bArr2, i27, registers2);
                                    unsafe2.putLong(t, jOffset, registers2.long1);
                                    i24 = i14 | i34;
                                    i22 = i18;
                                    iDecodeUnknownField = iDecodeVarint64;
                                    i23 = i17;
                                    i25 = i9;
                                    i26 = i16;
                                    bArr3 = bArr2;
                                } else {
                                    i12 = i16;
                                    i3 = i3;
                                    i10 = i27;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i5 = i17;
                                }
                                break;
                            case 4:
                            case 11:
                                bArr2 = bArr;
                                i9 = i28;
                                i18 = i30;
                                i16 = i15;
                                i17 = i32;
                                if (i29 == 0) {
                                    iDecodeUnknownField = com.google.protobuf.ArrayDecoders.decodeVarint32(bArr2, i27, registers2);
                                    unsafe2.putInt(t3, jOffset, registers2.int1);
                                    i24 = i14 | i34;
                                    i22 = i18;
                                    i23 = i17;
                                    i25 = i9;
                                    i26 = i16;
                                    bArr3 = bArr2;
                                } else {
                                    i12 = i16;
                                    i3 = i3;
                                    i10 = i27;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i5 = i17;
                                }
                                break;
                            case 5:
                            case 14:
                                bArr2 = bArr;
                                i9 = i28;
                                i18 = i30;
                                i16 = i15;
                                i17 = i32;
                                if (i29 == 1) {
                                    unsafe2.putLong(t, jOffset, com.google.protobuf.ArrayDecoders.decodeFixed64(bArr2, i27));
                                    iDecodeUnknownField = i27 + 8;
                                    i24 = i14 | i34;
                                    i22 = i18;
                                    i23 = i17;
                                    i25 = i9;
                                    i26 = i16;
                                    bArr3 = bArr2;
                                } else {
                                    i12 = i16;
                                    i3 = i3;
                                    i10 = i27;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i5 = i17;
                                }
                                break;
                            case 6:
                            case 13:
                                bArr2 = bArr;
                                i9 = i28;
                                i18 = i30;
                                i16 = i15;
                                i17 = i32;
                                if (i29 == 5) {
                                    unsafe2.putInt(t3, jOffset, com.google.protobuf.ArrayDecoders.decodeFixed32(bArr2, i27));
                                    iDecodeUnknownField = i27 + 4;
                                    i24 = i14 | i34;
                                    i22 = i18;
                                    i23 = i17;
                                    i25 = i9;
                                    i26 = i16;
                                    bArr3 = bArr2;
                                } else {
                                    i12 = i16;
                                    i3 = i3;
                                    i10 = i27;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i5 = i17;
                                }
                                break;
                            case 7:
                                bArr2 = bArr;
                                i9 = i28;
                                i18 = i30;
                                i16 = i15;
                                i17 = i32;
                                if (i29 == 0) {
                                    iDecodeUnknownField = com.google.protobuf.ArrayDecoders.decodeVarint64(bArr2, i27, registers2);
                                    com.google.protobuf.UnsafeUtil.putBoolean(t3, jOffset, registers2.long1 != 0);
                                    i24 = i14 | i34;
                                    i22 = i18;
                                    i23 = i17;
                                    i25 = i9;
                                    i26 = i16;
                                    bArr3 = bArr2;
                                } else {
                                    i12 = i16;
                                    i3 = i3;
                                    i10 = i27;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i5 = i17;
                                }
                                break;
                            case 8:
                                bArr2 = bArr;
                                i9 = i28;
                                i18 = i30;
                                i16 = i15;
                                i17 = i32;
                                if (i29 == 2) {
                                    if ((536870912 & i31) == 0) {
                                        iDecodeUnknownField = com.google.protobuf.ArrayDecoders.decodeString(bArr2, i27, registers2);
                                    } else {
                                        iDecodeUnknownField = com.google.protobuf.ArrayDecoders.decodeStringRequireUtf8(bArr2, i27, registers2);
                                    }
                                    unsafe2.putObject(t3, jOffset, registers2.object1);
                                    i24 = i14 | i34;
                                    i22 = i18;
                                    i23 = i17;
                                    i25 = i9;
                                    i26 = i16;
                                    bArr3 = bArr2;
                                } else {
                                    i12 = i16;
                                    i3 = i3;
                                    i10 = i27;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i5 = i17;
                                }
                                break;
                            case 9:
                                bArr2 = bArr;
                                i9 = i28;
                                i18 = i30;
                                i16 = i15;
                                i17 = i32;
                                if (i29 == 2) {
                                    java.lang.Object objMutableMessageFieldForMerge = messageSchema2.mutableMessageFieldForMerge(t3, i18);
                                    iDecodeUnknownField = com.google.protobuf.ArrayDecoders.mergeMessageField(objMutableMessageFieldForMerge, messageSchema2.getMessageFieldSchema(i18), bArr, i27, i2, registers);
                                    messageSchema2.storeMessageField(t3, i18, objMutableMessageFieldForMerge);
                                    i24 = i14 | i34;
                                    i22 = i18;
                                    i23 = i17;
                                    i25 = i9;
                                    i26 = i16;
                                    bArr3 = bArr2;
                                } else {
                                    i12 = i16;
                                    i3 = i3;
                                    i10 = i27;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i5 = i17;
                                }
                                break;
                            case 10:
                                bArr2 = bArr;
                                i9 = i28;
                                i18 = i30;
                                i16 = i15;
                                i17 = i32;
                                if (i29 == 2) {
                                    iDecodeUnknownField = com.google.protobuf.ArrayDecoders.decodeBytes(bArr2, i27, registers2);
                                    unsafe2.putObject(t3, jOffset, registers2.object1);
                                    i24 = i14 | i34;
                                    i22 = i18;
                                    i23 = i17;
                                    i25 = i9;
                                    i26 = i16;
                                    bArr3 = bArr2;
                                } else {
                                    i12 = i16;
                                    i3 = i3;
                                    i10 = i27;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i5 = i17;
                                }
                                break;
                            case 12:
                                bArr2 = bArr;
                                i9 = i28;
                                i18 = i30;
                                i16 = i15;
                                i17 = i32;
                                if (i29 == 0) {
                                    iDecodeUnknownField = com.google.protobuf.ArrayDecoders.decodeVarint32(bArr2, i27, registers2);
                                    int i36 = registers2.int1;
                                    com.google.protobuf.Internal.EnumVerifier enumFieldVerifier = messageSchema2.getEnumFieldVerifier(i18);
                                    if (enumFieldVerifier == null || enumFieldVerifier.isInRange(i36)) {
                                        unsafe2.putInt(t3, jOffset, i36);
                                        i24 = i14 | i34;
                                        i22 = i18;
                                        i23 = i17;
                                        i25 = i9;
                                        i26 = i16;
                                    } else {
                                        getMutableUnknownFields(t).storeField(i17, java.lang.Long.valueOf(i36));
                                        i22 = i18;
                                        i24 = i14;
                                        i23 = i17;
                                        i25 = i9;
                                        i26 = i16;
                                        i3 = i3;
                                    }
                                    bArr3 = bArr2;
                                } else {
                                    i12 = i16;
                                    i3 = i3;
                                    i10 = i27;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i5 = i17;
                                }
                                break;
                            case 15:
                                bArr2 = bArr;
                                i9 = i28;
                                i18 = i30;
                                i16 = i15;
                                i17 = i32;
                                if (i29 == 0) {
                                    iDecodeUnknownField = com.google.protobuf.ArrayDecoders.decodeVarint32(bArr2, i27, registers2);
                                    unsafe2.putInt(t3, jOffset, com.google.protobuf.CodedInputStream.decodeZigZag32(registers2.int1));
                                    i24 = i14 | i34;
                                    i22 = i18;
                                    i23 = i17;
                                    i25 = i9;
                                    i26 = i16;
                                    bArr3 = bArr2;
                                } else {
                                    i12 = i16;
                                    i3 = i3;
                                    i10 = i27;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i5 = i17;
                                }
                                break;
                            case 16:
                                i9 = i28;
                                i18 = i30;
                                i16 = i15;
                                i17 = i32;
                                bArr2 = bArr;
                                if (i29 == 0) {
                                    iDecodeVarint64 = com.google.protobuf.ArrayDecoders.decodeVarint64(bArr2, i27, registers2);
                                    unsafe2.putLong(t, jOffset, com.google.protobuf.CodedInputStream.decodeZigZag64(registers2.long1));
                                    i24 = i14 | i34;
                                    i22 = i18;
                                    iDecodeUnknownField = iDecodeVarint64;
                                    i23 = i17;
                                    i25 = i9;
                                    i26 = i16;
                                    bArr3 = bArr2;
                                } else {
                                    i12 = i16;
                                    i3 = i3;
                                    i10 = i27;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i5 = i17;
                                }
                                break;
                            case 17:
                                if (i29 == 3) {
                                    java.lang.Object objMutableMessageFieldForMerge2 = messageSchema2.mutableMessageFieldForMerge(t3, i30);
                                    iDecodeUnknownField = com.google.protobuf.ArrayDecoders.mergeGroupField(objMutableMessageFieldForMerge2, messageSchema2.getMessageFieldSchema(i30), bArr, i27, i2, (i28 << 3) | 4, registers);
                                    messageSchema2.storeMessageField(t3, i30, objMutableMessageFieldForMerge2);
                                    i24 = i14 | i34;
                                    i26 = i15;
                                    i3 = i3;
                                    i22 = i30;
                                    i23 = i32;
                                    i25 = i28;
                                    bArr3 = bArr;
                                } else {
                                    i9 = i28;
                                    i16 = i15;
                                    i17 = i32;
                                    i18 = i30;
                                    i12 = i16;
                                    i3 = i3;
                                    i10 = i27;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i5 = i17;
                                }
                                break;
                            default:
                                i9 = i28;
                                i18 = i30;
                                i16 = i15;
                                i17 = i32;
                                i12 = i16;
                                i3 = i3;
                                i10 = i27;
                                i13 = i18;
                                unsafe = unsafe2;
                                i11 = i14;
                                i5 = i17;
                                break;
                        }
                    } else {
                        i9 = i28;
                        i12 = i26;
                        i11 = i24;
                        if (iType == 27) {
                            if (i29 == 2) {
                                com.google.protobuf.Internal.ProtobufList protobufListMutableCopyWithCapacity2 = (com.google.protobuf.Internal.ProtobufList) unsafe2.getObject(t3, jOffset);
                                if (!protobufListMutableCopyWithCapacity2.isModifiable()) {
                                    int size = protobufListMutableCopyWithCapacity2.size();
                                    protobufListMutableCopyWithCapacity2 = protobufListMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
                                    unsafe2.putObject(t3, jOffset, protobufListMutableCopyWithCapacity2);
                                }
                                iDecodeUnknownField = com.google.protobuf.ArrayDecoders.decodeMessageList(messageSchema2.getMessageFieldSchema(i30), i32, bArr, i27, i2, protobufListMutableCopyWithCapacity2, registers);
                                i22 = i30;
                                i23 = i32;
                                i26 = i12;
                                i24 = i11;
                                i25 = i9;
                                bArr3 = bArr;
                                i3 = i3;
                            } else {
                                i19 = i27;
                                unsafe = unsafe2;
                                i13 = i30;
                                i20 = i32;
                                i10 = i19;
                                i5 = i20;
                            }
                        } else if (iType <= 49) {
                            int i37 = i27;
                            unsafe = unsafe2;
                            i13 = i30;
                            i20 = i32;
                            iDecodeUnknownField = parseRepeatedField(t, bArr, i27, i2, i32, i9, i29, i30, i31, iType, jOffset, registers);
                            if (iDecodeUnknownField != i37) {
                                messageSchema2 = this;
                                t3 = t;
                                bArr3 = bArr;
                                i21 = i2;
                                i3 = i3;
                                registers2 = registers;
                                i26 = i12;
                                i24 = i11;
                                i22 = i13;
                                i23 = i20;
                                i25 = i9;
                                unsafe2 = unsafe;
                            } else {
                                i10 = iDecodeUnknownField;
                                i5 = i20;
                            }
                        } else {
                            i19 = i27;
                            unsafe = unsafe2;
                            i13 = i30;
                            i20 = i32;
                            if (iType != 50) {
                                iDecodeUnknownField = parseOneofField(t, bArr, i19, i2, i20, i9, i29, i31, iType, jOffset, i13, registers);
                                if (iDecodeUnknownField != i19) {
                                    messageSchema2 = this;
                                    t3 = t;
                                    bArr3 = bArr;
                                    i21 = i2;
                                    i3 = i3;
                                    registers2 = registers;
                                    i26 = i12;
                                    i24 = i11;
                                    i22 = i13;
                                    i23 = i20;
                                    i25 = i9;
                                    unsafe2 = unsafe;
                                } else {
                                    i10 = iDecodeUnknownField;
                                    i5 = i20;
                                }
                            } else if (i29 == 2) {
                                iDecodeUnknownField = parseMapField(t, bArr, i19, i2, i13, jOffset, registers);
                                if (iDecodeUnknownField != i19) {
                                    messageSchema2 = this;
                                    t3 = t;
                                    bArr3 = bArr;
                                    i21 = i2;
                                    i3 = i3;
                                    registers2 = registers;
                                    i26 = i12;
                                    i24 = i11;
                                    i22 = i13;
                                    i23 = i20;
                                    i25 = i9;
                                    unsafe2 = unsafe;
                                } else {
                                    i10 = iDecodeUnknownField;
                                    i5 = i20;
                                }
                            } else {
                                i10 = i19;
                                i5 = i20;
                            }
                        }
                    }
                }
                if (i5 != i3 || i3 == 0) {
                    if (this.hasExtensions && registers.extensionRegistry != com.google.protobuf.ExtensionRegistryLite.getEmptyRegistry()) {
                        iDecodeUnknownField = com.google.protobuf.ArrayDecoders.decodeExtensionOrUnknownField(i5, bArr, i10, i2, t, this.defaultInstance, this.unknownFieldSchema, registers);
                    } else {
                        iDecodeUnknownField = com.google.protobuf.ArrayDecoders.decodeUnknownField(i5, bArr, i10, i2, getMutableUnknownFields(t), registers);
                    }
                    t3 = t;
                    bArr3 = bArr;
                    i21 = i2;
                    i23 = i5;
                    messageSchema2 = this;
                    registers2 = registers;
                    i26 = i12;
                    i24 = i11;
                    i22 = i13;
                    i25 = i9;
                    unsafe2 = unsafe;
                    i3 = i3;
                } else {
                    i7 = 1048575;
                    messageSchema = this;
                    i4 = i10;
                    i6 = i12;
                    i24 = i11;
                }
            } else {
                int i38 = i26;
                unsafe = unsafe2;
                i3 = i3;
                messageSchema = messageSchema2;
                i4 = iDecodeUnknownField;
                i5 = i23;
                i6 = i38;
                i7 = 1048575;
            }
        }
        if (i6 != i7) {
            t2 = t;
            unsafe.putInt(t2, i6, i24);
        } else {
            t2 = t;
        }
        com.google.protobuf.UnknownFieldSetLite unknownFieldSetLite = null;
        for (int i39 = messageSchema.checkInitializedCount; i39 < messageSchema.repeatedFieldOffsetStart; i39++) {
            unknownFieldSetLite = (com.google.protobuf.UnknownFieldSetLite) filterMapUnknownEnumValues(t, messageSchema.intArray[i39], unknownFieldSetLite, messageSchema.unknownFieldSchema, t);
        }
        if (unknownFieldSetLite != null) {
            messageSchema.unknownFieldSchema.setBuilderToMessage(t2, unknownFieldSetLite);
        }
        if (i3 == 0) {
            if (i4 != i2) {
                throw com.google.protobuf.InvalidProtocolBufferException.parseFailure();
            }
        } else if (i4 > i2 || i5 != i3) {
            throw com.google.protobuf.InvalidProtocolBufferException.parseFailure();
        }
        return i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private java.lang.Object mutableMessageFieldForMerge(T t, int i) {
        com.google.protobuf.Schema messageFieldSchema = getMessageFieldSchema(i);
        long jOffset = offset(typeAndOffsetAt(i));
        if (!isFieldPresent(t, i)) {
            return messageFieldSchema.newInstance();
        }
        java.lang.Object object = UNSAFE.getObject(t, jOffset);
        if (isMutable(object)) {
            return object;
        }
        java.lang.Object objNewInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    private void storeMessageField(T t, int i, java.lang.Object obj) {
        UNSAFE.putObject(t, offset(typeAndOffsetAt(i)), obj);
        setFieldPresent(t, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private java.lang.Object mutableOneofMessageFieldForMerge(T t, int i, int i2) {
        com.google.protobuf.Schema messageFieldSchema = getMessageFieldSchema(i2);
        if (!isOneofPresent(t, i, i2)) {
            return messageFieldSchema.newInstance();
        }
        java.lang.Object object = UNSAFE.getObject(t, offset(typeAndOffsetAt(i2)));
        if (isMutable(object)) {
            return object;
        }
        java.lang.Object objNewInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    private void storeOneofMessageField(T t, int i, int i2, java.lang.Object obj) {
        UNSAFE.putObject(t, offset(typeAndOffsetAt(i2)), obj);
        setOneofPresent(t, i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0307 A[PHI: r0 r19 r22 r26 r27 r28
  0x0307: PHI (r0v18 int) = (r0v14 int), (r0v17 int), (r0v21 int) binds: [B:110:0x0304, B:105:0x02e1, B:98:0x029c] A[DONT_GENERATE, DONT_INLINE]
  0x0307: PHI (r19v3 int) = (r19v2 int), (r19v2 int), (r19v5 int) binds: [B:110:0x0304, B:105:0x02e1, B:98:0x029c] A[DONT_GENERATE, DONT_INLINE]
  0x0307: PHI (r22v1 int) = (r22v0 int), (r22v0 int), (r22v3 int) binds: [B:110:0x0304, B:105:0x02e1, B:98:0x029c] A[DONT_GENERATE, DONT_INLINE]
  0x0307: PHI (r26v2 int) = (r26v1 int), (r26v1 int), (r26v4 int) binds: [B:110:0x0304, B:105:0x02e1, B:98:0x029c] A[DONT_GENERATE, DONT_INLINE]
  0x0307: PHI (r27v4 int) = (r27v3 int), (r27v3 int), (r27v6 int) binds: [B:110:0x0304, B:105:0x02e1, B:98:0x029c] A[DONT_GENERATE, DONT_INLINE]
  0x0307: PHI (r28v5 sun.misc.Unsafe) = (r28v4 sun.misc.Unsafe), (r28v4 sun.misc.Unsafe), (r28v7 sun.misc.Unsafe) binds: [B:110:0x0304, B:105:0x02e1, B:98:0x029c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:99:0x029e A[PHI: r0 r19 r22 r26 r27 r28
  0x029e: PHI (r0v19 int) = (r0v14 int), (r0v17 int), (r0v21 int) binds: [B:110:0x0304, B:105:0x02e1, B:98:0x029c] A[DONT_GENERATE, DONT_INLINE]
  0x029e: PHI (r19v4 int) = (r19v2 int), (r19v2 int), (r19v5 int) binds: [B:110:0x0304, B:105:0x02e1, B:98:0x029c] A[DONT_GENERATE, DONT_INLINE]
  0x029e: PHI (r22v2 int) = (r22v0 int), (r22v0 int), (r22v3 int) binds: [B:110:0x0304, B:105:0x02e1, B:98:0x029c] A[DONT_GENERATE, DONT_INLINE]
  0x029e: PHI (r26v3 int) = (r26v1 int), (r26v1 int), (r26v4 int) binds: [B:110:0x0304, B:105:0x02e1, B:98:0x029c] A[DONT_GENERATE, DONT_INLINE]
  0x029e: PHI (r27v5 int) = (r27v3 int), (r27v3 int), (r27v6 int) binds: [B:110:0x0304, B:105:0x02e1, B:98:0x029c] A[DONT_GENERATE, DONT_INLINE]
  0x029e: PHI (r28v6 sun.misc.Unsafe) = (r28v4 sun.misc.Unsafe), (r28v4 sun.misc.Unsafe), (r28v7 sun.misc.Unsafe) binds: [B:110:0x0304, B:105:0x02e1, B:98:0x029c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0088. Please report as an issue. */
    private int parseProto3Message(T t, byte[] bArr, int i, int i2, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        int i3;
        int iDecodeVarint32;
        int iPositionForFieldNumber;
        int i4;
        int i5;
        int i6;
        sun.misc.Unsafe unsafe;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int iDecodeBytes;
        this = this;
        t = t;
        bArr = bArr;
        i2 = i2;
        registers = registers;
        checkMutable(t);
        sun.misc.Unsafe unsafe2 = UNSAFE;
        int i14 = -1;
        int iDecodeUnknownField = i;
        int i15 = -1;
        int i16 = 0;
        int i17 = 0;
        int i18 = 1048575;
        while (iDecodeUnknownField < i2) {
            int i19 = iDecodeUnknownField + 1;
            byte b = bArr[iDecodeUnknownField];
            if (b < 0) {
                iDecodeVarint32 = com.google.protobuf.ArrayDecoders.decodeVarint32(b, bArr, i19, registers);
                i3 = registers.int1;
            } else {
                i3 = b;
                iDecodeVarint32 = i19;
            }
            int i20 = i3 >>> 3;
            int i21 = i3 & 7;
            if (i20 > i15) {
                iPositionForFieldNumber = this.positionForFieldNumber(i20, i16 / 3);
            } else {
                iPositionForFieldNumber = this.positionForFieldNumber(i20);
            }
            int i22 = iPositionForFieldNumber;
            if (i22 == i14) {
                i4 = iDecodeVarint32;
                i5 = i20;
                i6 = i14;
                unsafe = unsafe2;
                i7 = 0;
            } else {
                int i23 = this.buffer[i22 + 1];
                int iType = type(i23);
                long jOffset = offset(i23);
                if (iType <= 17) {
                    int i24 = this.buffer[i22 + 2];
                    int i25 = 1 << (i24 >>> 20);
                    int i26 = 1048575;
                    int i27 = i24 & 1048575;
                    if (i27 != i18) {
                        if (i18 != 1048575) {
                            unsafe2.putInt(t, i18, i17);
                            i26 = 1048575;
                        }
                        if (i27 != i26) {
                            i17 = unsafe2.getInt(t, i27);
                        }
                        i18 = i27;
                    }
                    switch (iType) {
                        case 0:
                            i5 = i20;
                            i11 = i22;
                            i12 = iDecodeVarint32;
                            i13 = i17;
                            if (i21 != 1) {
                                i17 = i13;
                                i7 = i11;
                                unsafe = unsafe2;
                                i4 = i12;
                                i6 = -1;
                            } else {
                                com.google.protobuf.UnsafeUtil.putDouble(t, jOffset, com.google.protobuf.ArrayDecoders.decodeDouble(bArr, i12));
                                iDecodeUnknownField = i12 + 8;
                                i17 = i13 | i25;
                                i16 = i11;
                                i15 = i5;
                                i14 = -1;
                            }
                            break;
                        case 1:
                            i5 = i20;
                            registers = registers;
                            i12 = iDecodeVarint32;
                            i13 = i17;
                            i11 = i22;
                            if (i21 != 5) {
                                i17 = i13;
                                i7 = i11;
                                unsafe = unsafe2;
                                i4 = i12;
                                i6 = -1;
                            } else {
                                com.google.protobuf.UnsafeUtil.putFloat(t, jOffset, com.google.protobuf.ArrayDecoders.decodeFloat(bArr, i12));
                                iDecodeUnknownField = i12 + 4;
                                i17 = i13 | i25;
                                i16 = i11;
                                i15 = i5;
                                i14 = -1;
                            }
                            break;
                        case 2:
                        case 3:
                            i5 = i20;
                            registers = registers;
                            i11 = i22;
                            i12 = iDecodeVarint32;
                            i13 = i17;
                            if (i21 != 0) {
                                i17 = i13;
                                i7 = i11;
                                unsafe = unsafe2;
                                i4 = i12;
                                i6 = -1;
                            } else {
                                int iDecodeVarint64 = com.google.protobuf.ArrayDecoders.decodeVarint64(bArr, i12, registers);
                                unsafe2.putLong(t, jOffset, registers.long1);
                                i17 = i13 | i25;
                                i16 = i11;
                                iDecodeUnknownField = iDecodeVarint64;
                                i15 = i5;
                                i14 = -1;
                            }
                            break;
                        case 4:
                        case 11:
                            i5 = i20;
                            registers = registers;
                            i11 = i22;
                            i12 = iDecodeVarint32;
                            i13 = i17;
                            if (i21 != 0) {
                                i17 = i13;
                                i7 = i11;
                                unsafe = unsafe2;
                                i4 = i12;
                                i6 = -1;
                            } else {
                                iDecodeUnknownField = com.google.protobuf.ArrayDecoders.decodeVarint32(bArr, i12, registers);
                                unsafe2.putInt(t, jOffset, registers.int1);
                                i17 = i13 | i25;
                                i16 = i11;
                                i15 = i5;
                                i14 = -1;
                            }
                            break;
                        case 5:
                        case 14:
                            i5 = i20;
                            i11 = i22;
                            i13 = i17;
                            if (i21 != 1) {
                                i12 = iDecodeVarint32;
                                i17 = i13;
                                i7 = i11;
                                unsafe = unsafe2;
                                i4 = i12;
                                i6 = -1;
                            } else {
                                i12 = iDecodeVarint32;
                                unsafe2.putLong(t, jOffset, com.google.protobuf.ArrayDecoders.decodeFixed64(bArr, iDecodeVarint32));
                                iDecodeUnknownField = i12 + 8;
                                i17 = i13 | i25;
                                i16 = i11;
                                i15 = i5;
                                i14 = -1;
                            }
                            break;
                        case 6:
                        case 13:
                            i5 = i20;
                            registers = registers;
                            i13 = i17;
                            i11 = i22;
                            if (i21 != 5) {
                                i12 = iDecodeVarint32;
                                i17 = i13;
                                i7 = i11;
                                unsafe = unsafe2;
                                i4 = i12;
                                i6 = -1;
                            } else {
                                unsafe2.putInt(t, jOffset, com.google.protobuf.ArrayDecoders.decodeFixed32(bArr, iDecodeVarint32));
                                iDecodeUnknownField = iDecodeVarint32 + 4;
                                i17 = i13 | i25;
                                i16 = i11;
                                i15 = i5;
                                i14 = -1;
                            }
                            break;
                        case 7:
                            i5 = i20;
                            registers = registers;
                            i11 = i22;
                            i13 = i17;
                            if (i21 != 0) {
                                i12 = iDecodeVarint32;
                                i17 = i13;
                                i7 = i11;
                                unsafe = unsafe2;
                                i4 = i12;
                                i6 = -1;
                            } else {
                                int iDecodeVarint65 = com.google.protobuf.ArrayDecoders.decodeVarint64(bArr, iDecodeVarint32, registers);
                                com.google.protobuf.UnsafeUtil.putBoolean(t, jOffset, registers.long1 != 0);
                                i17 = i13 | i25;
                                iDecodeUnknownField = iDecodeVarint65;
                                i16 = i11;
                                i15 = i5;
                                i14 = -1;
                            }
                            break;
                        case 8:
                            i5 = i20;
                            registers = registers;
                            i11 = i22;
                            i13 = i17;
                            if (i21 != 2) {
                                i12 = iDecodeVarint32;
                                i17 = i13;
                                i7 = i11;
                                unsafe = unsafe2;
                                i4 = i12;
                                i6 = -1;
                            } else {
                                if ((536870912 & i23) == 0) {
                                    iDecodeUnknownField = com.google.protobuf.ArrayDecoders.decodeString(bArr, iDecodeVarint32, registers);
                                } else {
                                    iDecodeUnknownField = com.google.protobuf.ArrayDecoders.decodeStringRequireUtf8(bArr, iDecodeVarint32, registers);
                                }
                                unsafe2.putObject(t, jOffset, registers.object1);
                                i17 = i13 | i25;
                                i16 = i11;
                                i15 = i5;
                                i14 = -1;
                            }
                            break;
                        case 9:
                            i5 = i20;
                            registers = registers;
                            i11 = i22;
                            if (i21 != 2) {
                                i12 = iDecodeVarint32;
                                i13 = i17;
                                i17 = i13;
                                i7 = i11;
                                unsafe = unsafe2;
                                i4 = i12;
                                i6 = -1;
                            } else {
                                java.lang.Object objMutableMessageFieldForMerge = this.mutableMessageFieldForMerge(t, i11);
                                iDecodeUnknownField = com.google.protobuf.ArrayDecoders.mergeMessageField(objMutableMessageFieldForMerge, this.getMessageFieldSchema(i11), bArr, iDecodeVarint32, i2, registers);
                                this.storeMessageField(t, i11, objMutableMessageFieldForMerge);
                                i17 |= i25;
                                i16 = i11;
                                i15 = i5;
                                i14 = -1;
                            }
                            break;
                        case 10:
                            i5 = i20;
                            registers = registers;
                            i11 = i22;
                            if (i21 != 2) {
                                i12 = iDecodeVarint32;
                                i13 = i17;
                                i17 = i13;
                                i7 = i11;
                                unsafe = unsafe2;
                                i4 = i12;
                                i6 = -1;
                            } else {
                                iDecodeBytes = com.google.protobuf.ArrayDecoders.decodeBytes(bArr, iDecodeVarint32, registers);
                                unsafe2.putObject(t, jOffset, registers.object1);
                                i17 |= i25;
                                iDecodeUnknownField = iDecodeBytes;
                                i16 = i11;
                                i15 = i5;
                                i14 = -1;
                            }
                            break;
                        case 12:
                            i5 = i20;
                            registers = registers;
                            i11 = i22;
                            if (i21 != 0) {
                                i12 = iDecodeVarint32;
                                i13 = i17;
                                i17 = i13;
                                i7 = i11;
                                unsafe = unsafe2;
                                i4 = i12;
                                i6 = -1;
                            } else {
                                iDecodeBytes = com.google.protobuf.ArrayDecoders.decodeVarint32(bArr, iDecodeVarint32, registers);
                                unsafe2.putInt(t, jOffset, registers.int1);
                                i17 |= i25;
                                iDecodeUnknownField = iDecodeBytes;
                                i16 = i11;
                                i15 = i5;
                                i14 = -1;
                            }
                            break;
                        case 15:
                            i5 = i20;
                            registers = registers;
                            i11 = i22;
                            if (i21 != 0) {
                                i12 = iDecodeVarint32;
                                i13 = i17;
                                i17 = i13;
                                i7 = i11;
                                unsafe = unsafe2;
                                i4 = i12;
                                i6 = -1;
                            } else {
                                iDecodeUnknownField = com.google.protobuf.ArrayDecoders.decodeVarint32(bArr, iDecodeVarint32, registers);
                                unsafe2.putInt(t, jOffset, com.google.protobuf.CodedInputStream.decodeZigZag32(registers.int1));
                                i17 |= i25;
                                i16 = i11;
                                i15 = i5;
                                i14 = -1;
                            }
                            break;
                        case 16:
                            if (i21 != 0) {
                                i5 = i20;
                                i11 = i22;
                                i12 = iDecodeVarint32;
                                i13 = i17;
                                i17 = i13;
                                i7 = i11;
                                unsafe = unsafe2;
                                i4 = i12;
                                i6 = -1;
                            } else {
                                registers = registers;
                                int iDecodeVarint66 = com.google.protobuf.ArrayDecoders.decodeVarint64(bArr, iDecodeVarint32, registers);
                                i5 = i20;
                                unsafe2.putLong(t, jOffset, com.google.protobuf.CodedInputStream.decodeZigZag64(registers.long1));
                                i17 |= i25;
                                i16 = i22;
                                iDecodeUnknownField = iDecodeVarint66;
                                i15 = i5;
                                i14 = -1;
                            }
                            break;
                        default:
                            i5 = i20;
                            i11 = i22;
                            i12 = iDecodeVarint32;
                            i13 = i17;
                            i17 = i13;
                            i7 = i11;
                            unsafe = unsafe2;
                            i4 = i12;
                            i6 = -1;
                            break;
                    }
                } else {
                    i5 = i20;
                    int i28 = i17;
                    registers = registers;
                    int i29 = iDecodeVarint32;
                    if (iType != 27) {
                        if (iType <= 49) {
                            i8 = i28;
                            i7 = i22;
                            i6 = -1;
                            unsafe = unsafe2;
                            i9 = i18;
                            iDecodeUnknownField = parseRepeatedField(t, bArr, i29, i2, i3, i5, i21, i22, i23, iType, jOffset, registers);
                            if (iDecodeUnknownField != i29) {
                                i15 = i5;
                                i16 = i7;
                                i18 = i9;
                                i17 = i8;
                            } else {
                                i4 = iDecodeUnknownField;
                                i18 = i9;
                                i17 = i8;
                            }
                        } else {
                            i8 = i28;
                            i9 = i18;
                            i7 = i22;
                            unsafe = unsafe2;
                            i10 = i29;
                            i6 = -1;
                            if (iType == 50) {
                                if (i21 == 2) {
                                    iDecodeUnknownField = parseMapField(t, bArr, i10, i2, i7, jOffset, registers);
                                    if (iDecodeUnknownField != i10) {
                                        i15 = i5;
                                        i16 = i7;
                                        i18 = i9;
                                        i17 = i8;
                                    } else {
                                        i4 = iDecodeUnknownField;
                                    }
                                }
                                i18 = i9;
                                i17 = i8;
                            } else {
                                iDecodeUnknownField = parseOneofField(t, bArr, i10, i2, i3, i5, i21, i23, iType, jOffset, i7, registers);
                                if (iDecodeUnknownField != i10) {
                                    i15 = i5;
                                    i16 = i7;
                                    i18 = i9;
                                    i17 = i8;
                                } else {
                                    i4 = iDecodeUnknownField;
                                    i18 = i9;
                                    i17 = i8;
                                }
                            }
                        }
                        i14 = i6;
                        unsafe2 = unsafe;
                    } else if (i21 == 2) {
                        com.google.protobuf.Internal.ProtobufList protobufListMutableCopyWithCapacity2 = (com.google.protobuf.Internal.ProtobufList) unsafe2.getObject(t, jOffset);
                        if (!protobufListMutableCopyWithCapacity2.isModifiable()) {
                            int size = protobufListMutableCopyWithCapacity2.size();
                            protobufListMutableCopyWithCapacity2 = protobufListMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
                            unsafe2.putObject(t, jOffset, protobufListMutableCopyWithCapacity2);
                        }
                        iDecodeUnknownField = com.google.protobuf.ArrayDecoders.decodeMessageList(this.getMessageFieldSchema(i22), i3, bArr, i29, i2, protobufListMutableCopyWithCapacity2, registers);
                        i16 = i22;
                        i17 = i28;
                        i15 = i5;
                        i14 = -1;
                    } else {
                        i9 = i18;
                        i7 = i22;
                        unsafe = unsafe2;
                        i10 = i29;
                        i8 = i28;
                        i6 = -1;
                    }
                    i4 = i10;
                    i18 = i9;
                    i17 = i8;
                }
            }
            iDecodeUnknownField = com.google.protobuf.ArrayDecoders.decodeUnknownField(i3, bArr, i4, i2, getMutableUnknownFields(t), registers);
            i15 = i5;
            i16 = i7;
            i14 = i6;
            unsafe2 = unsafe;
        }
        int i30 = i17;
        sun.misc.Unsafe unsafe3 = unsafe2;
        if (i18 != 1048575) {
            unsafe3.putInt(t, i18, i30);
        }
        if (iDecodeUnknownField == i2) {
            return iDecodeUnknownField;
        }
        throw com.google.protobuf.InvalidProtocolBufferException.parseFailure();
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T t, byte[] bArr, int i, int i2, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        if (this.proto3) {
            parseProto3Message(t, bArr, i, i2, registers);
        } else {
            parseProto2Message(t, bArr, i, i2, 0, registers);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0049  */
    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.Schema
    public void makeImmutable(T t) {
        if (isMutable(t)) {
            if (t instanceof com.google.protobuf.GeneratedMessageLite) {
                com.google.protobuf.GeneratedMessageLite generatedMessageLite = (com.google.protobuf.GeneratedMessageLite) t;
                generatedMessageLite.clearMemoizedSerializedSize();
                generatedMessageLite.clearMemoizedHashCode();
                generatedMessageLite.markImmutable();
            }
            int length = this.buffer.length;
            for (int i = 0; i < length; i += 3) {
                int iTypeAndOffsetAt = typeAndOffsetAt(i);
                long jOffset = offset(iTypeAndOffsetAt);
                int iType = type(iTypeAndOffsetAt);
                if (iType != 9) {
                    switch (iType) {
                        case 17:
                            if (isFieldPresent(t, i)) {
                                getMessageFieldSchema(i).makeImmutable(UNSAFE.getObject(t, jOffset));
                            }
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.listFieldSchema.makeImmutableListAt(t, jOffset);
                            break;
                        case 50:
                            sun.misc.Unsafe unsafe = UNSAFE;
                            java.lang.Object object = unsafe.getObject(t, jOffset);
                            if (object != null) {
                                unsafe.putObject(t, jOffset, this.mapFieldSchema.toImmutable(object));
                            }
                            break;
                    }
                } else if (isFieldPresent(t, i)) {
                    getMessageFieldSchema(i).makeImmutable(UNSAFE.getObject(t, jOffset));
                }
            }
            this.unknownFieldSchema.makeImmutable(t);
            if (this.hasExtensions) {
                this.extensionSchema.makeImmutable(t);
            }
        }
    }

    private final <K, V> void mergeMap(java.lang.Object obj, int i, java.lang.Object obj2, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite, com.google.protobuf.Reader reader) throws java.io.IOException {
        long jOffset = offset(typeAndOffsetAt(i));
        java.lang.Object object = com.google.protobuf.UnsafeUtil.getObject(obj, jOffset);
        if (object == null) {
            object = this.mapFieldSchema.newMapField(obj2);
            com.google.protobuf.UnsafeUtil.putObject(obj, jOffset, object);
        } else if (this.mapFieldSchema.isImmutable(object)) {
            java.lang.Object objNewMapField = this.mapFieldSchema.newMapField(obj2);
            this.mapFieldSchema.mergeFrom(objNewMapField, object);
            com.google.protobuf.UnsafeUtil.putObject(obj, jOffset, objNewMapField);
            object = objNewMapField;
        }
        reader.readMap(this.mapFieldSchema.forMutableMapData(object), this.mapFieldSchema.forMapMetadata(obj2), extensionRegistryLite);
    }

    private <UT, UB> UB filterMapUnknownEnumValues(java.lang.Object obj, int i, UB ub, com.google.protobuf.UnknownFieldSchema<UT, UB> unknownFieldSchema, java.lang.Object obj2) {
        com.google.protobuf.Internal.EnumVerifier enumFieldVerifier;
        int iNumberAt = numberAt(i);
        java.lang.Object object = com.google.protobuf.UnsafeUtil.getObject(obj, offset(typeAndOffsetAt(i)));
        return (object == null || (enumFieldVerifier = getEnumFieldVerifier(i)) == null) ? ub : (UB) filterUnknownEnumMap(i, iNumberAt, this.mapFieldSchema.forMutableMapData(object), enumFieldVerifier, ub, unknownFieldSchema, obj2);
    }

    private <K, V, UT, UB> UB filterUnknownEnumMap(int i, int i2, java.util.Map<K, V> map, com.google.protobuf.Internal.EnumVerifier enumVerifier, UB ub, com.google.protobuf.UnknownFieldSchema<UT, UB> unknownFieldSchema, java.lang.Object obj) {
        com.google.protobuf.MapEntryLite.Metadata<?, ?> metadataForMapMetadata = this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i));
        java.util.Iterator<java.util.Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry<K, V> next = it.next();
            if (!enumVerifier.isInRange(((java.lang.Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = unknownFieldSchema.getBuilderFromMessage(obj);
                }
                com.google.protobuf.ByteString.CodedBuilder codedBuilderNewCodedBuilder = com.google.protobuf.ByteString.newCodedBuilder(com.google.protobuf.MapEntryLite.computeSerializedSize(metadataForMapMetadata, next.getKey(), next.getValue()));
                try {
                    com.google.protobuf.MapEntryLite.writeTo(codedBuilderNewCodedBuilder.getCodedOutput(), metadataForMapMetadata, next.getKey(), next.getValue());
                    unknownFieldSchema.addLengthDelimited(ub, i2, codedBuilderNewCodedBuilder.build());
                    it.remove();
                } catch (java.io.IOException e) {
                    throw new java.lang.RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:58:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa A[SYNTHETIC] */
    @Override // com.google.protobuf.Schema
    public final boolean isInitialized(T t) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.checkInitializedCount) {
            int i6 = this.intArray[i5];
            int iNumberAt = numberAt(i6);
            int iTypeAndOffsetAt = typeAndOffsetAt(i6);
            int i7 = this.buffer[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i3) {
                if (i8 != 1048575) {
                    i4 = UNSAFE.getInt(t, i8);
                }
                i2 = i4;
                i = i8;
            } else {
                i = i3;
                i2 = i4;
            }
            if (isRequired(iTypeAndOffsetAt) && !isFieldPresent(t, i6, i, i2, i9)) {
                return false;
            }
            int iType = type(iTypeAndOffsetAt);
            if (iType == 9 || iType == 17) {
                if (isFieldPresent(t, i6, i, i2, i9) && !isInitialized(t, iTypeAndOffsetAt, getMessageFieldSchema(i6))) {
                    return false;
                }
            } else if (iType == 27) {
                if (!isListInitialized(t, iTypeAndOffsetAt, i6)) {
                    return false;
                }
            } else if (iType == 60 || iType == 68) {
                if (isOneofPresent(t, iNumberAt, i6) && !isInitialized(t, iTypeAndOffsetAt, getMessageFieldSchema(i6))) {
                    return false;
                }
            } else if (iType == 49) {
                if (!isListInitialized(t, iTypeAndOffsetAt, i6)) {
                    return false;
                }
            } else if (iType == 50 && !isMapInitialized(t, iTypeAndOffsetAt, i6)) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        return !this.hasExtensions || this.extensionSchema.getExtensions(t).isInitialized();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isInitialized(java.lang.Object obj, int i, com.google.protobuf.Schema schema) {
        return schema.isInitialized(com.google.protobuf.UnsafeUtil.getObject(obj, offset(i)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean isListInitialized(java.lang.Object obj, int i, int i2) {
        java.util.List list = (java.util.List) com.google.protobuf.UnsafeUtil.getObject(obj, offset(i));
        if (list.isEmpty()) {
            return true;
        }
        com.google.protobuf.Schema messageFieldSchema = getMessageFieldSchema(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!messageFieldSchema.isInitialized(list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.google.protobuf.Schema] */
    private boolean isMapInitialized(T t, int i, int i2) {
        java.util.Map<?, ?> mapForMapData = this.mapFieldSchema.forMapData(com.google.protobuf.UnsafeUtil.getObject(t, offset(i)));
        if (mapForMapData.isEmpty()) {
            return true;
        }
        if (this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i2)).valueType.getJavaType() != com.google.protobuf.WireFormat.JavaType.MESSAGE) {
            return true;
        }
        ?? SchemaFor = 0;
        for (java.lang.Object obj : mapForMapData.values()) {
            if (SchemaFor == 0) {
                SchemaFor = SchemaFor;
                SchemaFor = com.google.protobuf.Protobuf.getInstance().schemaFor((java.lang.Class) obj.getClass());
            }
            SchemaFor = SchemaFor;
            if (!SchemaFor.isInitialized(obj)) {
                return false;
            }
        }
        return true;
    }

    private void writeString(int i, java.lang.Object obj, com.google.protobuf.Writer writer) throws java.io.IOException {
        if (obj instanceof java.lang.String) {
            writer.writeString(i, (java.lang.String) obj);
        } else {
            writer.writeBytes(i, (com.google.protobuf.ByteString) obj);
        }
    }

    private void readString(java.lang.Object obj, int i, com.google.protobuf.Reader reader) throws java.io.IOException {
        if (isEnforceUtf8(i)) {
            com.google.protobuf.UnsafeUtil.putObject(obj, offset(i), reader.readStringRequireUtf8());
        } else if (this.lite) {
            com.google.protobuf.UnsafeUtil.putObject(obj, offset(i), reader.readString());
        } else {
            com.google.protobuf.UnsafeUtil.putObject(obj, offset(i), reader.readBytes());
        }
    }

    private void readStringList(java.lang.Object obj, int i, com.google.protobuf.Reader reader) throws java.io.IOException {
        if (isEnforceUtf8(i)) {
            reader.readStringListRequireUtf8(this.listFieldSchema.mutableListAt(obj, offset(i)));
        } else {
            reader.readStringList(this.listFieldSchema.mutableListAt(obj, offset(i)));
        }
    }

    private <E> void readMessageList(java.lang.Object obj, int i, com.google.protobuf.Reader reader, com.google.protobuf.Schema<E> schema, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        reader.readMessageList(this.listFieldSchema.mutableListAt(obj, offset(i)), schema, extensionRegistryLite);
    }

    private <E> void readGroupList(java.lang.Object obj, long j, com.google.protobuf.Reader reader, com.google.protobuf.Schema<E> schema, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        reader.readGroupList(this.listFieldSchema.mutableListAt(obj, j), schema, extensionRegistryLite);
    }

    private int numberAt(int i) {
        return this.buffer[i];
    }

    private int typeAndOffsetAt(int i) {
        return this.buffer[i + 1];
    }

    private int presenceMaskAndOffsetAt(int i) {
        return this.buffer[i + 2];
    }

    private static boolean isMutable(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof com.google.protobuf.GeneratedMessageLite) {
            return ((com.google.protobuf.GeneratedMessageLite) obj).isMutable();
        }
        return true;
    }

    private static void checkMutable(java.lang.Object obj) {
        if (!isMutable(obj)) {
            throw new java.lang.IllegalArgumentException("Mutating immutable message: " + obj);
        }
    }

    private static <T> double doubleAt(T t, long j) {
        return com.google.protobuf.UnsafeUtil.getDouble(t, j);
    }

    private static <T> float floatAt(T t, long j) {
        return com.google.protobuf.UnsafeUtil.getFloat(t, j);
    }

    private static <T> int intAt(T t, long j) {
        return com.google.protobuf.UnsafeUtil.getInt(t, j);
    }

    private static <T> long longAt(T t, long j) {
        return com.google.protobuf.UnsafeUtil.getLong(t, j);
    }

    private static <T> boolean booleanAt(T t, long j) {
        return com.google.protobuf.UnsafeUtil.getBoolean(t, j);
    }

    private static <T> double oneofDoubleAt(T t, long j) {
        return ((java.lang.Double) com.google.protobuf.UnsafeUtil.getObject(t, j)).doubleValue();
    }

    private static <T> float oneofFloatAt(T t, long j) {
        return ((java.lang.Float) com.google.protobuf.UnsafeUtil.getObject(t, j)).floatValue();
    }

    private static <T> int oneofIntAt(T t, long j) {
        return ((java.lang.Integer) com.google.protobuf.UnsafeUtil.getObject(t, j)).intValue();
    }

    private static <T> long oneofLongAt(T t, long j) {
        return ((java.lang.Long) com.google.protobuf.UnsafeUtil.getObject(t, j)).longValue();
    }

    private static <T> boolean oneofBooleanAt(T t, long j) {
        return ((java.lang.Boolean) com.google.protobuf.UnsafeUtil.getObject(t, j)).booleanValue();
    }

    private boolean arePresentForEquals(T t, T t2, int i) {
        return isFieldPresent(t, i) == isFieldPresent(t2, i);
    }

    private boolean isFieldPresent(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return isFieldPresent(t, i);
        }
        return (i3 & i4) != 0;
    }

    private boolean isFieldPresent(T t, int i) {
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i);
        long j = 1048575 & iPresenceMaskAndOffsetAt;
        if (j != 1048575) {
            return (com.google.protobuf.UnsafeUtil.getInt(t, j) & (1 << (iPresenceMaskAndOffsetAt >>> 20))) != 0;
        }
        int iTypeAndOffsetAt = typeAndOffsetAt(i);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                return java.lang.Double.doubleToRawLongBits(com.google.protobuf.UnsafeUtil.getDouble(t, jOffset)) != 0;
            case 1:
                return java.lang.Float.floatToRawIntBits(com.google.protobuf.UnsafeUtil.getFloat(t, jOffset)) != 0;
            case 2:
                return com.google.protobuf.UnsafeUtil.getLong(t, jOffset) != 0;
            case 3:
                return com.google.protobuf.UnsafeUtil.getLong(t, jOffset) != 0;
            case 4:
                return com.google.protobuf.UnsafeUtil.getInt(t, jOffset) != 0;
            case 5:
                return com.google.protobuf.UnsafeUtil.getLong(t, jOffset) != 0;
            case 6:
                return com.google.protobuf.UnsafeUtil.getInt(t, jOffset) != 0;
            case 7:
                return com.google.protobuf.UnsafeUtil.getBoolean(t, jOffset);
            case 8:
                java.lang.Object object = com.google.protobuf.UnsafeUtil.getObject(t, jOffset);
                if (object instanceof java.lang.String) {
                    return !((java.lang.String) object).isEmpty();
                }
                if (object instanceof com.google.protobuf.ByteString) {
                    return !com.google.protobuf.ByteString.EMPTY.equals(object);
                }
                throw new java.lang.IllegalArgumentException();
            case 9:
                return com.google.protobuf.UnsafeUtil.getObject(t, jOffset) != null;
            case 10:
                return !com.google.protobuf.ByteString.EMPTY.equals(com.google.protobuf.UnsafeUtil.getObject(t, jOffset));
            case 11:
                return com.google.protobuf.UnsafeUtil.getInt(t, jOffset) != 0;
            case 12:
                return com.google.protobuf.UnsafeUtil.getInt(t, jOffset) != 0;
            case 13:
                return com.google.protobuf.UnsafeUtil.getInt(t, jOffset) != 0;
            case 14:
                return com.google.protobuf.UnsafeUtil.getLong(t, jOffset) != 0;
            case 15:
                return com.google.protobuf.UnsafeUtil.getInt(t, jOffset) != 0;
            case 16:
                return com.google.protobuf.UnsafeUtil.getLong(t, jOffset) != 0;
            case 17:
                return com.google.protobuf.UnsafeUtil.getObject(t, jOffset) != null;
            default:
                throw new java.lang.IllegalArgumentException();
        }
    }

    private void setFieldPresent(T t, int i) {
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i);
        long j = 1048575 & iPresenceMaskAndOffsetAt;
        if (j == 1048575) {
            return;
        }
        com.google.protobuf.UnsafeUtil.putInt(t, j, (1 << (iPresenceMaskAndOffsetAt >>> 20)) | com.google.protobuf.UnsafeUtil.getInt(t, j));
    }

    private boolean isOneofPresent(T t, int i, int i2) {
        return com.google.protobuf.UnsafeUtil.getInt(t, (long) (presenceMaskAndOffsetAt(i2) & 1048575)) == i;
    }

    private boolean isOneofCaseEqual(T t, T t2, int i) {
        long jPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i) & 1048575;
        return com.google.protobuf.UnsafeUtil.getInt(t, jPresenceMaskAndOffsetAt) == com.google.protobuf.UnsafeUtil.getInt(t2, jPresenceMaskAndOffsetAt);
    }

    private void setOneofPresent(T t, int i, int i2) {
        com.google.protobuf.UnsafeUtil.putInt(t, presenceMaskAndOffsetAt(i2) & 1048575, i);
    }

    private int positionForFieldNumber(int i) {
        if (i < this.minFieldNumber || i > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i, 0);
    }

    private int positionForFieldNumber(int i, int i2) {
        if (i < this.minFieldNumber || i > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i, i2);
    }

    private int slowPositionForFieldNumber(int i, int i2) {
        int length = (this.buffer.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int iNumberAt = numberAt(i4);
            if (i == iNumberAt) {
                return i4;
            }
            if (i < iNumberAt) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    int getSchemaSize() {
        return this.buffer.length * 3;
    }
}
