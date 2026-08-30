package org.objectweb.asm;

/* JADX INFO: loaded from: classes6.dex */
public class TypeReference {
    public static final int CAST = 71;
    public static final int CLASS_EXTENDS = 16;
    public static final int CLASS_TYPE_PARAMETER = 0;
    public static final int CLASS_TYPE_PARAMETER_BOUND = 17;
    public static final int CONSTRUCTOR_INVOCATION_TYPE_ARGUMENT = 72;
    public static final int CONSTRUCTOR_REFERENCE = 69;
    public static final int CONSTRUCTOR_REFERENCE_TYPE_ARGUMENT = 74;
    public static final int EXCEPTION_PARAMETER = 66;
    public static final int FIELD = 19;
    public static final int INSTANCEOF = 67;
    public static final int LOCAL_VARIABLE = 64;
    public static final int METHOD_FORMAL_PARAMETER = 22;
    public static final int METHOD_INVOCATION_TYPE_ARGUMENT = 73;
    public static final int METHOD_RECEIVER = 21;
    public static final int METHOD_REFERENCE = 70;
    public static final int METHOD_REFERENCE_TYPE_ARGUMENT = 75;
    public static final int METHOD_RETURN = 20;
    public static final int METHOD_TYPE_PARAMETER = 1;
    public static final int METHOD_TYPE_PARAMETER_BOUND = 18;
    public static final int NEW = 68;
    public static final int RESOURCE_VARIABLE = 65;
    public static final int THROWS = 23;
    private final int targetTypeAndInfo;

    public TypeReference(int i) {
        this.targetTypeAndInfo = i;
    }

    public static org.objectweb.asm.TypeReference newTypeReference(int i) {
        return new org.objectweb.asm.TypeReference(i << 24);
    }

    public static org.objectweb.asm.TypeReference newTypeParameterReference(int i, int i2) {
        return new org.objectweb.asm.TypeReference((i << 24) | (i2 << 16));
    }

    public static org.objectweb.asm.TypeReference newTypeParameterBoundReference(int i, int i2, int i3) {
        return new org.objectweb.asm.TypeReference((i << 24) | (i2 << 16) | (i3 << 8));
    }

    public static org.objectweb.asm.TypeReference newSuperTypeReference(int i) {
        return new org.objectweb.asm.TypeReference(((i & 65535) << 8) | 268435456);
    }

    public static org.objectweb.asm.TypeReference newFormalParameterReference(int i) {
        return new org.objectweb.asm.TypeReference((i << 16) | 369098752);
    }

    public static org.objectweb.asm.TypeReference newExceptionReference(int i) {
        return new org.objectweb.asm.TypeReference((i << 8) | 385875968);
    }

    public static org.objectweb.asm.TypeReference newTryCatchReference(int i) {
        return new org.objectweb.asm.TypeReference((i << 8) | 1107296256);
    }

    public static org.objectweb.asm.TypeReference newTypeArgumentReference(int i, int i2) {
        return new org.objectweb.asm.TypeReference((i << 24) | i2);
    }

    public int getSort() {
        return this.targetTypeAndInfo >>> 24;
    }

    public int getTypeParameterIndex() {
        return (this.targetTypeAndInfo & 16711680) >> 16;
    }

    public int getTypeParameterBoundIndex() {
        return (this.targetTypeAndInfo & androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
    }

    public int getSuperTypeIndex() {
        return (short) ((this.targetTypeAndInfo & 16776960) >> 8);
    }

    public int getFormalParameterIndex() {
        return (this.targetTypeAndInfo & 16711680) >> 16;
    }

    public int getExceptionIndex() {
        return (this.targetTypeAndInfo & 16776960) >> 8;
    }

    public int getTryCatchBlockIndex() {
        return (this.targetTypeAndInfo & 16776960) >> 8;
    }

    public int getTypeArgumentIndex() {
        return this.targetTypeAndInfo & 255;
    }

    public int getValue() {
        return this.targetTypeAndInfo;
    }

    static void putTarget(int i, org.objectweb.asm.ByteVector byteVector) {
        int i2 = i >>> 24;
        if (i2 != 0 && i2 != 1) {
            switch (i2) {
                case 16:
                case 17:
                case 18:
                case 23:
                    break;
                case 19:
                case 20:
                case 21:
                    byteVector.putByte(i2);
                    return;
                case 22:
                    break;
                default:
                    switch (i2) {
                        case 66:
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                            break;
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                            byteVector.putInt(i);
                            return;
                        default:
                            throw new java.lang.IllegalArgumentException();
                    }
                    break;
            }
            byteVector.put12(i2, (i & 16776960) >> 8);
            return;
        }
        byteVector.putShort(i >>> 16);
    }
}
