package org.objectweb.asm.commons;

/* JADX INFO: loaded from: classes6.dex */
public class Method {
    private static final java.util.Map<java.lang.String, java.lang.String> PRIMITIVE_TYPE_DESCRIPTORS;
    private final java.lang.String descriptor;
    private final java.lang.String name;

    static {
        java.util.HashMap map = new java.util.HashMap();
        map.put("void", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
        map.put("byte", "B");
        map.put("char", "C");
        map.put("double", "D");
        map.put(androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_FLOAT, "F");
        map.put("int", "I");
        map.put(com.adjust.sdk.Constants.LONG, "J");
        map.put("short", androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH);
        map.put(androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_BOOLEAN, "Z");
        PRIMITIVE_TYPE_DESCRIPTORS = map;
    }

    public Method(java.lang.String str, java.lang.String str2) {
        this.name = str;
        this.descriptor = str2;
    }

    public Method(java.lang.String str, org.objectweb.asm.Type type, org.objectweb.asm.Type[] typeArr) {
        this(str, org.objectweb.asm.Type.getMethodDescriptor(type, typeArr));
    }

    public static org.objectweb.asm.commons.Method getMethod(java.lang.reflect.Method method) {
        return new org.objectweb.asm.commons.Method(method.getName(), org.objectweb.asm.Type.getMethodDescriptor(method));
    }

    public static org.objectweb.asm.commons.Method getMethod(java.lang.reflect.Constructor<?> constructor) {
        return new org.objectweb.asm.commons.Method("<init>", org.objectweb.asm.Type.getConstructorDescriptor(constructor));
    }

    public static org.objectweb.asm.commons.Method getMethod(java.lang.String str) {
        return getMethod(str, false);
    }

    public static org.objectweb.asm.commons.Method getMethod(java.lang.String str, boolean z) {
        int iIndexOf;
        java.lang.String descriptorInternal;
        int iIndexOf2 = str.indexOf(32);
        int iIndexOf3 = str.indexOf(40, iIndexOf2) + 1;
        int iIndexOf4 = str.indexOf(41, iIndexOf3);
        if (iIndexOf2 == -1 || iIndexOf3 == 0 || iIndexOf4 == -1) {
            throw new java.lang.IllegalArgumentException();
        }
        java.lang.String strSubstring = str.substring(0, iIndexOf2);
        java.lang.String strTrim = str.substring(iIndexOf2 + 1, iIndexOf3 - 1).trim();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
        do {
            iIndexOf = str.indexOf(44, iIndexOf3);
            if (iIndexOf == -1) {
                descriptorInternal = getDescriptorInternal(str.substring(iIndexOf3, iIndexOf4).trim(), z);
            } else {
                descriptorInternal = getDescriptorInternal(str.substring(iIndexOf3, iIndexOf).trim(), z);
                iIndexOf3 = iIndexOf + 1;
            }
            sb.append(descriptorInternal);
        } while (iIndexOf != -1);
        sb.append(')').append(getDescriptorInternal(strSubstring, z));
        return new org.objectweb.asm.commons.Method(strTrim, sb.toString());
    }

    private static java.lang.String getDescriptorInternal(java.lang.String str, boolean z) {
        if ("".equals(str)) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int iIndexOf = 0;
        while (true) {
            iIndexOf = str.indexOf(okhttp3.HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, iIndexOf) + 1;
            if (iIndexOf <= 0) {
                break;
            }
            sb.append('[');
        }
        java.lang.String strSubstring = str.substring(0, str.length() - (sb.length() * 2));
        java.lang.String str2 = PRIMITIVE_TYPE_DESCRIPTORS.get(strSubstring);
        if (str2 != null) {
            sb.append(str2);
        } else {
            sb.append('L');
            if (strSubstring.indexOf(46) < 0) {
                if (!z) {
                    sb.append("java/lang/");
                }
                sb.append(strSubstring);
            } else {
                sb.append(strSubstring.replace('.', '/'));
            }
            sb.append(';');
        }
        return sb.toString();
    }

    public java.lang.String getName() {
        return this.name;
    }

    public java.lang.String getDescriptor() {
        return this.descriptor;
    }

    public org.objectweb.asm.Type getReturnType() {
        return org.objectweb.asm.Type.getReturnType(this.descriptor);
    }

    public org.objectweb.asm.Type[] getArgumentTypes() {
        return org.objectweb.asm.Type.getArgumentTypes(this.descriptor);
    }

    public java.lang.String toString() {
        return this.name + this.descriptor;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof org.objectweb.asm.commons.Method)) {
            return false;
        }
        org.objectweb.asm.commons.Method method = (org.objectweb.asm.commons.Method) obj;
        return this.name.equals(method.name) && this.descriptor.equals(method.descriptor);
    }

    public int hashCode() {
        return this.name.hashCode() ^ this.descriptor.hashCode();
    }
}
