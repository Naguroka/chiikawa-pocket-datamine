package org.objectweb.asm;

/* JADX INFO: loaded from: classes6.dex */
final class Constants {
    static final int ACC_CONSTRUCTOR = 262144;
    static final int ALOAD_0 = 42;
    static final int ALOAD_1 = 43;
    static final int ALOAD_2 = 44;
    static final int ALOAD_3 = 45;
    static final java.lang.String ANNOTATION_DEFAULT = "AnnotationDefault";
    static final int ASM_GOTO = 216;
    static final int ASM_GOTO_W = 220;
    static final int ASM_IFEQ = 202;
    static final int ASM_IFGE = 205;
    static final int ASM_IFGT = 206;
    static final int ASM_IFLE = 207;
    static final int ASM_IFLT = 204;
    static final int ASM_IFNE = 203;
    static final int ASM_IFNONNULL = 219;
    static final int ASM_IFNULL = 218;
    static final int ASM_IFNULL_OPCODE_DELTA = 20;
    static final int ASM_IF_ACMPEQ = 214;
    static final int ASM_IF_ACMPNE = 215;
    static final int ASM_IF_ICMPEQ = 208;
    static final int ASM_IF_ICMPGE = 211;
    static final int ASM_IF_ICMPGT = 212;
    static final int ASM_IF_ICMPLE = 213;
    static final int ASM_IF_ICMPLT = 210;
    static final int ASM_IF_ICMPNE = 209;
    static final int ASM_JSR = 217;
    static final int ASM_OPCODE_DELTA = 49;
    static final int ASTORE_0 = 75;
    static final int ASTORE_1 = 76;
    static final int ASTORE_2 = 77;
    static final int ASTORE_3 = 78;
    static final java.lang.String BOOTSTRAP_METHODS = "BootstrapMethods";
    static final java.lang.String CODE = "Code";
    static final java.lang.String CONSTANT_VALUE = "ConstantValue";
    static final java.lang.String DEPRECATED = "Deprecated";
    static final int DLOAD_0 = 38;
    static final int DLOAD_1 = 39;
    static final int DLOAD_2 = 40;
    static final int DLOAD_3 = 41;
    static final int DSTORE_0 = 71;
    static final int DSTORE_1 = 72;
    static final int DSTORE_2 = 73;
    static final int DSTORE_3 = 74;
    static final java.lang.String ENCLOSING_METHOD = "EnclosingMethod";
    static final java.lang.String EXCEPTIONS = "Exceptions";
    static final int FLOAD_0 = 34;
    static final int FLOAD_1 = 35;
    static final int FLOAD_2 = 36;
    static final int FLOAD_3 = 37;
    static final int FSTORE_0 = 67;
    static final int FSTORE_1 = 68;
    static final int FSTORE_2 = 69;
    static final int FSTORE_3 = 70;
    static final int F_INSERT = 256;
    static final int GOTO_W = 200;
    static final int ILOAD_0 = 26;
    static final int ILOAD_1 = 27;
    static final int ILOAD_2 = 28;
    static final int ILOAD_3 = 29;
    static final java.lang.String INNER_CLASSES = "InnerClasses";
    static final int ISTORE_0 = 59;
    static final int ISTORE_1 = 60;
    static final int ISTORE_2 = 61;
    static final int ISTORE_3 = 62;
    static final int JSR_W = 201;
    static final int LDC2_W = 20;
    static final int LDC_W = 19;
    static final java.lang.String LINE_NUMBER_TABLE = "LineNumberTable";
    static final int LLOAD_0 = 30;
    static final int LLOAD_1 = 31;
    static final int LLOAD_2 = 32;
    static final int LLOAD_3 = 33;
    static final java.lang.String LOCAL_VARIABLE_TABLE = "LocalVariableTable";
    static final java.lang.String LOCAL_VARIABLE_TYPE_TABLE = "LocalVariableTypeTable";
    static final int LSTORE_0 = 63;
    static final int LSTORE_1 = 64;
    static final int LSTORE_2 = 65;
    static final int LSTORE_3 = 66;
    static final java.lang.String METHOD_PARAMETERS = "MethodParameters";
    static final java.lang.String MODULE = "Module";
    static final java.lang.String MODULE_MAIN_CLASS = "ModuleMainClass";
    static final java.lang.String MODULE_PACKAGES = "ModulePackages";
    static final java.lang.String NEST_HOST = "NestHost";
    static final java.lang.String NEST_MEMBERS = "NestMembers";
    static final java.lang.String PERMITTED_SUBCLASSES = "PermittedSubclasses";
    static final java.lang.String RECORD = "Record";
    static final java.lang.String RUNTIME_INVISIBLE_ANNOTATIONS = "RuntimeInvisibleAnnotations";
    static final java.lang.String RUNTIME_INVISIBLE_PARAMETER_ANNOTATIONS = "RuntimeInvisibleParameterAnnotations";
    static final java.lang.String RUNTIME_INVISIBLE_TYPE_ANNOTATIONS = "RuntimeInvisibleTypeAnnotations";
    static final java.lang.String RUNTIME_VISIBLE_ANNOTATIONS = "RuntimeVisibleAnnotations";
    static final java.lang.String RUNTIME_VISIBLE_PARAMETER_ANNOTATIONS = "RuntimeVisibleParameterAnnotations";
    static final java.lang.String RUNTIME_VISIBLE_TYPE_ANNOTATIONS = "RuntimeVisibleTypeAnnotations";
    static final java.lang.String SIGNATURE = "Signature";
    static final java.lang.String SOURCE_DEBUG_EXTENSION = "SourceDebugExtension";
    static final java.lang.String SOURCE_FILE = "SourceFile";
    static final java.lang.String STACK_MAP_TABLE = "StackMapTable";
    static final java.lang.String SYNTHETIC = "Synthetic";
    static final int WIDE = 196;
    static final int WIDE_JUMP_OPCODE_DELTA = 33;

    private Constants() {
    }

    static void checkAsmExperimental(java.lang.Object obj) {
        java.lang.Class<?> cls = obj.getClass();
        java.lang.String strReplace = cls.getName().replace('.', '/');
        if (isWhitelisted(strReplace)) {
            return;
        }
        checkIsPreview(cls.getClassLoader().getResourceAsStream(strReplace + ".class"));
    }

    static boolean isWhitelisted(java.lang.String str) {
        if (str.startsWith("org/objectweb/asm/")) {
            return str.contains("Test$") || java.util.regex.Pattern.matches("org/objectweb/asm/util/Trace(Annotation|Class|Field|Method|Module|RecordComponent|Signature)Visitor(\\$.*)?", str) || java.util.regex.Pattern.matches("org/objectweb/asm/util/Check(Annotation|Class|Field|Method|Module|RecordComponent|Signature)Adapter(\\$.*)?", str);
        }
        return false;
    }

    static void checkIsPreview(java.io.InputStream inputStream) {
        if (inputStream == null) {
            throw new java.lang.IllegalStateException("Bytecode not available, can't check class version");
        }
        try {
            java.io.DataInputStream dataInputStream = new java.io.DataInputStream(inputStream);
            try {
                dataInputStream.readInt();
                int unsignedShort = dataInputStream.readUnsignedShort();
                dataInputStream.close();
                if (unsignedShort != 65535) {
                    throw new java.lang.IllegalStateException("ASM9_EXPERIMENTAL can only be used by classes compiled with --enable-preview");
                }
            } catch (java.lang.Throwable th) {
                try {
                    dataInputStream.close();
                } catch (java.lang.Throwable unused) {
                }
                throw th;
            }
        } catch (java.io.IOException e) {
            throw new java.lang.IllegalStateException("I/O error, can't check class version", e);
        }
    }
}
