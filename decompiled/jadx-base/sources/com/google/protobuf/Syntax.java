package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
public enum Syntax implements com.google.protobuf.Internal.EnumLite {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    UNRECOGNIZED(-1);

    public static final int SYNTAX_PROTO2_VALUE = 0;
    public static final int SYNTAX_PROTO3_VALUE = 1;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.google.protobuf.Syntax> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<com.google.protobuf.Syntax>() { // from class: com.google.protobuf.Syntax.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public com.google.protobuf.Syntax findValueByNumber(int i) {
            return com.google.protobuf.Syntax.forNumber(i);
        }
    };
    private final int value;

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) {
            throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return this.value;
    }

    @java.lang.Deprecated
    public static com.google.protobuf.Syntax valueOf(int i) {
        return forNumber(i);
    }

    public static com.google.protobuf.Syntax forNumber(int i) {
        if (i == 0) {
            return SYNTAX_PROTO2;
        }
        if (i != 1) {
            return null;
        }
        return SYNTAX_PROTO3;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.google.protobuf.Syntax> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.google.protobuf.Syntax.SyntaxVerifier.INSTANCE;
    }

    private static final class SyntaxVerifier implements com.google.protobuf.Internal.EnumVerifier {
        static final com.google.protobuf.Internal.EnumVerifier INSTANCE = new com.google.protobuf.Syntax.SyntaxVerifier();

        private SyntaxVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return com.google.protobuf.Syntax.forNumber(i) != null;
        }
    }

    Syntax(int i) {
        this.value = i;
    }
}
