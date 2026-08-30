package org.objectweb.asm;

/* JADX INFO: loaded from: classes6.dex */
public final class Type {
    public static final int ARRAY = 9;
    public static final int BOOLEAN = 1;
    public static final int BYTE = 3;
    public static final int CHAR = 2;
    public static final int DOUBLE = 8;
    public static final int FLOAT = 6;
    public static final int INT = 5;
    private static final int INTERNAL = 12;
    public static final int LONG = 7;
    public static final int METHOD = 11;
    public static final int OBJECT = 10;
    public static final int SHORT = 4;
    public static final int VOID = 0;
    private final int sort;
    private final int valueBegin;
    private final java.lang.String valueBuffer;
    private final int valueEnd;
    private static final java.lang.String PRIMITIVE_DESCRIPTORS = "VZCBSIFJD";
    public static final org.objectweb.asm.Type VOID_TYPE = new org.objectweb.asm.Type(0, PRIMITIVE_DESCRIPTORS, 0, 1);
    public static final org.objectweb.asm.Type BOOLEAN_TYPE = new org.objectweb.asm.Type(1, PRIMITIVE_DESCRIPTORS, 1, 2);
    public static final org.objectweb.asm.Type CHAR_TYPE = new org.objectweb.asm.Type(2, PRIMITIVE_DESCRIPTORS, 2, 3);
    public static final org.objectweb.asm.Type BYTE_TYPE = new org.objectweb.asm.Type(3, PRIMITIVE_DESCRIPTORS, 3, 4);
    public static final org.objectweb.asm.Type SHORT_TYPE = new org.objectweb.asm.Type(4, PRIMITIVE_DESCRIPTORS, 4, 5);
    public static final org.objectweb.asm.Type INT_TYPE = new org.objectweb.asm.Type(5, PRIMITIVE_DESCRIPTORS, 5, 6);
    public static final org.objectweb.asm.Type FLOAT_TYPE = new org.objectweb.asm.Type(6, PRIMITIVE_DESCRIPTORS, 6, 7);
    public static final org.objectweb.asm.Type LONG_TYPE = new org.objectweb.asm.Type(7, PRIMITIVE_DESCRIPTORS, 7, 8);
    public static final org.objectweb.asm.Type DOUBLE_TYPE = new org.objectweb.asm.Type(8, PRIMITIVE_DESCRIPTORS, 8, 9);

    private Type(int i, java.lang.String str, int i2, int i3) {
        this.sort = i;
        this.valueBuffer = str;
        this.valueBegin = i2;
        this.valueEnd = i3;
    }

    public static org.objectweb.asm.Type getType(java.lang.String str) {
        return getTypeInternal(str, 0, str.length());
    }

    public static org.objectweb.asm.Type getType(java.lang.Class<?> cls) {
        if (cls.isPrimitive()) {
            if (cls == java.lang.Integer.TYPE) {
                return INT_TYPE;
            }
            if (cls == java.lang.Void.TYPE) {
                return VOID_TYPE;
            }
            if (cls == java.lang.Boolean.TYPE) {
                return BOOLEAN_TYPE;
            }
            if (cls == java.lang.Byte.TYPE) {
                return BYTE_TYPE;
            }
            if (cls == java.lang.Character.TYPE) {
                return CHAR_TYPE;
            }
            if (cls == java.lang.Short.TYPE) {
                return SHORT_TYPE;
            }
            if (cls == java.lang.Double.TYPE) {
                return DOUBLE_TYPE;
            }
            if (cls == java.lang.Float.TYPE) {
                return FLOAT_TYPE;
            }
            if (cls == java.lang.Long.TYPE) {
                return LONG_TYPE;
            }
            throw new java.lang.AssertionError();
        }
        return getType(getDescriptor(cls));
    }

    public static org.objectweb.asm.Type getType(java.lang.reflect.Constructor<?> constructor) {
        return getType(getConstructorDescriptor(constructor));
    }

    public static org.objectweb.asm.Type getType(java.lang.reflect.Method method) {
        return getType(getMethodDescriptor(method));
    }

    public org.objectweb.asm.Type getElementType() {
        return getTypeInternal(this.valueBuffer, this.valueBegin + getDimensions(), this.valueEnd);
    }

    public static org.objectweb.asm.Type getObjectType(java.lang.String str) {
        return new org.objectweb.asm.Type(str.charAt(0) == '[' ? 9 : 12, str, 0, str.length());
    }

    public static org.objectweb.asm.Type getMethodType(java.lang.String str) {
        return new org.objectweb.asm.Type(11, str, 0, str.length());
    }

    public static org.objectweb.asm.Type getMethodType(org.objectweb.asm.Type type, org.objectweb.asm.Type... typeArr) {
        return getType(getMethodDescriptor(type, typeArr));
    }

    public org.objectweb.asm.Type[] getArgumentTypes() {
        return getArgumentTypes(getDescriptor());
    }

    public static org.objectweb.asm.Type[] getArgumentTypes(java.lang.String str) {
        int i = 0;
        int i2 = 0;
        int iMax = 1;
        while (str.charAt(iMax) != ')') {
            while (str.charAt(iMax) == '[') {
                iMax++;
            }
            int i3 = iMax + 1;
            iMax = str.charAt(iMax) == 'L' ? java.lang.Math.max(i3, str.indexOf(59, i3) + 1) : i3;
            i2++;
        }
        org.objectweb.asm.Type[] typeArr = new org.objectweb.asm.Type[i2];
        int i4 = 1;
        while (str.charAt(i4) != ')') {
            int i5 = i4;
            while (str.charAt(i5) == '[') {
                i5++;
            }
            int iMax2 = i5 + 1;
            if (str.charAt(i5) == 'L') {
                iMax2 = java.lang.Math.max(iMax2, str.indexOf(59, iMax2) + 1);
            }
            typeArr[i] = getTypeInternal(str, i4, iMax2);
            i++;
            i4 = iMax2;
        }
        return typeArr;
    }

    public static org.objectweb.asm.Type[] getArgumentTypes(java.lang.reflect.Method method) {
        java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
        org.objectweb.asm.Type[] typeArr = new org.objectweb.asm.Type[parameterTypes.length];
        for (int length = parameterTypes.length - 1; length >= 0; length--) {
            typeArr[length] = getType(parameterTypes[length]);
        }
        return typeArr;
    }

    public org.objectweb.asm.Type getReturnType() {
        return getReturnType(getDescriptor());
    }

    public static org.objectweb.asm.Type getReturnType(java.lang.String str) {
        return getTypeInternal(str, getReturnTypeOffset(str), str.length());
    }

    public static org.objectweb.asm.Type getReturnType(java.lang.reflect.Method method) {
        return getType(method.getReturnType());
    }

    static int getReturnTypeOffset(java.lang.String str) {
        int iMax = 1;
        while (str.charAt(iMax) != ')') {
            while (str.charAt(iMax) == '[') {
                iMax++;
            }
            int i = iMax + 1;
            iMax = str.charAt(iMax) == 'L' ? java.lang.Math.max(i, str.indexOf(59, i) + 1) : i;
        }
        return iMax + 1;
    }

    private static org.objectweb.asm.Type getTypeInternal(java.lang.String str, int i, int i2) {
        char cCharAt = str.charAt(i);
        if (cCharAt == '(') {
            return new org.objectweb.asm.Type(11, str, i, i2);
        }
        if (cCharAt == 'F') {
            return FLOAT_TYPE;
        }
        if (cCharAt == 'L') {
            return new org.objectweb.asm.Type(10, str, i + 1, i2 - 1);
        }
        if (cCharAt == 'S') {
            return SHORT_TYPE;
        }
        if (cCharAt == 'V') {
            return VOID_TYPE;
        }
        if (cCharAt == 'I') {
            return INT_TYPE;
        }
        if (cCharAt == 'J') {
            return LONG_TYPE;
        }
        if (cCharAt == 'Z') {
            return BOOLEAN_TYPE;
        }
        if (cCharAt != '[') {
            switch (cCharAt) {
                case 'B':
                    return BYTE_TYPE;
                case 'C':
                    return CHAR_TYPE;
                case 'D':
                    return DOUBLE_TYPE;
                default:
                    throw new java.lang.IllegalArgumentException();
            }
        }
        return new org.objectweb.asm.Type(9, str, i, i2);
    }

    public java.lang.String getClassName() {
        switch (this.sort) {
            case 0:
                return "void";
            case 1:
                return androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_BOOLEAN;
            case 2:
                return "char";
            case 3:
                return "byte";
            case 4:
                return "short";
            case 5:
                return "int";
            case 6:
                return androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_FLOAT;
            case 7:
                return com.adjust.sdk.Constants.LONG;
            case 8:
                return "double";
            case 9:
                java.lang.StringBuilder sb = new java.lang.StringBuilder(getElementType().getClassName());
                for (int dimensions = getDimensions(); dimensions > 0; dimensions--) {
                    sb.append(okhttp3.HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
                }
                return sb.toString();
            case 10:
            case 12:
                return this.valueBuffer.substring(this.valueBegin, this.valueEnd).replace('/', '.');
            case 11:
            default:
                throw new java.lang.AssertionError();
        }
    }

    public java.lang.String getInternalName() {
        return this.valueBuffer.substring(this.valueBegin, this.valueEnd);
    }

    public static java.lang.String getInternalName(java.lang.Class<?> cls) {
        return cls.getName().replace('.', '/');
    }

    public java.lang.String getDescriptor() {
        int i = this.sort;
        if (i == 10) {
            return this.valueBuffer.substring(this.valueBegin - 1, this.valueEnd + 1);
        }
        if (i == 12) {
            return "L" + this.valueBuffer.substring(this.valueBegin, this.valueEnd) + ';';
        }
        return this.valueBuffer.substring(this.valueBegin, this.valueEnd);
    }

    public static java.lang.String getDescriptor(java.lang.Class<?> cls) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        appendDescriptor(cls, sb);
        return sb.toString();
    }

    public static java.lang.String getConstructorDescriptor(java.lang.reflect.Constructor<?> constructor) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append('(');
        for (java.lang.Class<?> cls : constructor.getParameterTypes()) {
            appendDescriptor(cls, sb);
        }
        return sb.append(")V").toString();
    }

    public static java.lang.String getMethodDescriptor(org.objectweb.asm.Type type, org.objectweb.asm.Type... typeArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append('(');
        for (org.objectweb.asm.Type type2 : typeArr) {
            type2.appendDescriptor(sb);
        }
        sb.append(')');
        type.appendDescriptor(sb);
        return sb.toString();
    }

    public static java.lang.String getMethodDescriptor(java.lang.reflect.Method method) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append('(');
        for (java.lang.Class<?> cls : method.getParameterTypes()) {
            appendDescriptor(cls, sb);
        }
        sb.append(')');
        appendDescriptor(method.getReturnType(), sb);
        return sb.toString();
    }

    private void appendDescriptor(java.lang.StringBuilder sb) {
        int i = this.sort;
        if (i == 10) {
            sb.append((java.lang.CharSequence) this.valueBuffer, this.valueBegin - 1, this.valueEnd + 1);
        } else if (i == 12) {
            sb.append('L').append((java.lang.CharSequence) this.valueBuffer, this.valueBegin, this.valueEnd).append(';');
        } else {
            sb.append((java.lang.CharSequence) this.valueBuffer, this.valueBegin, this.valueEnd);
        }
    }

    private static void appendDescriptor(java.lang.Class<?> cls, java.lang.StringBuilder sb) {
        char c;
        while (cls.isArray()) {
            sb.append('[');
            cls = cls.getComponentType();
        }
        if (cls.isPrimitive()) {
            if (cls == java.lang.Integer.TYPE) {
                c = 'I';
            } else if (cls == java.lang.Void.TYPE) {
                c = 'V';
            } else if (cls == java.lang.Boolean.TYPE) {
                c = 'Z';
            } else if (cls == java.lang.Byte.TYPE) {
                c = 'B';
            } else if (cls == java.lang.Character.TYPE) {
                c = 'C';
            } else if (cls == java.lang.Short.TYPE) {
                c = 'S';
            } else if (cls == java.lang.Double.TYPE) {
                c = 'D';
            } else if (cls == java.lang.Float.TYPE) {
                c = 'F';
            } else {
                if (cls != java.lang.Long.TYPE) {
                    throw new java.lang.AssertionError();
                }
                c = 'J';
            }
            sb.append(c);
            return;
        }
        sb.append('L').append(getInternalName(cls)).append(';');
    }

    public int getSort() {
        int i = this.sort;
        if (i == 12) {
            return 10;
        }
        return i;
    }

    public int getDimensions() {
        int i = 1;
        while (this.valueBuffer.charAt(this.valueBegin + i) == '[') {
            i++;
        }
        return i;
    }

    public int getSize() {
        switch (this.sort) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            case 12:
                return 1;
            case 7:
            case 8:
                return 2;
            case 11:
            default:
                throw new java.lang.AssertionError();
        }
    }

    public int getArgumentsAndReturnSizes() {
        return getArgumentsAndReturnSizes(getDescriptor());
    }

    public static int getArgumentsAndReturnSizes(java.lang.String str) {
        char cCharAt = str.charAt(1);
        int i = 1;
        int i2 = 1;
        while (cCharAt != ')') {
            if (cCharAt == 'J' || cCharAt == 'D') {
                i++;
                i2 += 2;
            } else {
                while (str.charAt(i) == '[') {
                    i++;
                }
                int iMax = i + 1;
                if (str.charAt(i) == 'L') {
                    iMax = java.lang.Math.max(iMax, str.indexOf(59, iMax) + 1);
                }
                i2++;
                i = iMax;
            }
            cCharAt = str.charAt(i);
        }
        char cCharAt2 = str.charAt(i + 1);
        if (cCharAt2 == 'V') {
            return i2 << 2;
        }
        return (i2 << 2) | ((cCharAt2 == 'J' || cCharAt2 == 'D') ? 2 : 1);
    }

    public int getOpcode(int i) {
        if (i == 46 || i == 79) {
            switch (this.sort) {
                case 0:
                case 11:
                    throw new java.lang.UnsupportedOperationException();
                case 1:
                case 3:
                    return i + 5;
                case 2:
                    return i + 6;
                case 4:
                    return i + 7;
                case 5:
                    return i;
                case 6:
                    return i + 2;
                case 7:
                    return i + 1;
                case 8:
                    return i + 3;
                case 9:
                case 10:
                case 12:
                    return i + 4;
                default:
                    throw new java.lang.AssertionError();
            }
        }
        switch (this.sort) {
            case 0:
                if (i == 172) {
                    return org.objectweb.asm.Opcodes.RETURN;
                }
                throw new java.lang.UnsupportedOperationException();
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return i;
            case 6:
                return i + 2;
            case 7:
                return i + 1;
            case 8:
                return i + 3;
            case 9:
            case 10:
            case 12:
                if (i == 21 || i == 54 || i == 172) {
                    return i + 4;
                }
                throw new java.lang.UnsupportedOperationException();
            case 11:
                throw new java.lang.UnsupportedOperationException();
            default:
                throw new java.lang.AssertionError();
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof org.objectweb.asm.Type)) {
            return false;
        }
        org.objectweb.asm.Type type = (org.objectweb.asm.Type) obj;
        int i = this.sort;
        if (i == 12) {
            i = 10;
        }
        int i2 = type.sort;
        if (i != (i2 != 12 ? i2 : 10)) {
            return false;
        }
        int i3 = this.valueBegin;
        int i4 = this.valueEnd;
        int i5 = type.valueBegin;
        if (i4 - i3 != type.valueEnd - i5) {
            return false;
        }
        while (i3 < i4) {
            if (this.valueBuffer.charAt(i3) != type.valueBuffer.charAt(i5)) {
                return false;
            }
            i3++;
            i5++;
        }
        return true;
    }

    public int hashCode() {
        int i = this.sort;
        int iCharAt = (i == 12 ? 10 : i) * 13;
        if (i >= 9) {
            int i2 = this.valueEnd;
            for (int i3 = this.valueBegin; i3 < i2; i3++) {
                iCharAt = (iCharAt + this.valueBuffer.charAt(i3)) * 17;
            }
        }
        return iCharAt;
    }

    public java.lang.String toString() {
        return getDescriptor();
    }
}
