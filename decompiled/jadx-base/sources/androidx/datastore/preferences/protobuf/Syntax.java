package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public enum Syntax implements androidx.datastore.preferences.protobuf.Internal.EnumLite {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    SYNTAX_EDITIONS(2),
    UNRECOGNIZED(-1);

    public static final int SYNTAX_EDITIONS_VALUE = 2;
    public static final int SYNTAX_PROTO2_VALUE = 0;
    public static final int SYNTAX_PROTO3_VALUE = 1;
    private static final androidx.datastore.preferences.protobuf.Internal.EnumLiteMap<androidx.datastore.preferences.protobuf.Syntax> internalValueMap = new androidx.datastore.preferences.protobuf.Internal.EnumLiteMap<androidx.datastore.preferences.protobuf.Syntax>() { // from class: androidx.datastore.preferences.protobuf.Syntax.1
        @Override // androidx.datastore.preferences.protobuf.Internal.EnumLiteMap
        public androidx.datastore.preferences.protobuf.Syntax findValueByNumber(int number) {
            return androidx.datastore.preferences.protobuf.Syntax.forNumber(number);
        }
    };
    private final int value;

    @Override // androidx.datastore.preferences.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) {
            throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return this.value;
    }

    @java.lang.Deprecated
    public static androidx.datastore.preferences.protobuf.Syntax valueOf(int value) {
        return forNumber(value);
    }

    public static androidx.datastore.preferences.protobuf.Syntax forNumber(int value) {
        if (value == 0) {
            return SYNTAX_PROTO2;
        }
        if (value == 1) {
            return SYNTAX_PROTO3;
        }
        if (value != 2) {
            return null;
        }
        return SYNTAX_EDITIONS;
    }

    public static androidx.datastore.preferences.protobuf.Internal.EnumLiteMap<androidx.datastore.preferences.protobuf.Syntax> internalGetValueMap() {
        return internalValueMap;
    }

    public static androidx.datastore.preferences.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return androidx.datastore.preferences.protobuf.Syntax.SyntaxVerifier.INSTANCE;
    }

    private static final class SyntaxVerifier implements androidx.datastore.preferences.protobuf.Internal.EnumVerifier {
        static final androidx.datastore.preferences.protobuf.Internal.EnumVerifier INSTANCE = new androidx.datastore.preferences.protobuf.Syntax.SyntaxVerifier();

        private SyntaxVerifier() {
        }

        @Override // androidx.datastore.preferences.protobuf.Internal.EnumVerifier
        public boolean isInRange(int number) {
            return androidx.datastore.preferences.protobuf.Syntax.forNumber(number) != null;
        }
    }

    Syntax(int value) {
        this.value = value;
    }
}
