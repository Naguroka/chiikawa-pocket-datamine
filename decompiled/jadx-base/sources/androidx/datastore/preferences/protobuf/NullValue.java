package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public enum NullValue implements androidx.datastore.preferences.protobuf.Internal.EnumLite {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);

    public static final int NULL_VALUE_VALUE = 0;
    private static final androidx.datastore.preferences.protobuf.Internal.EnumLiteMap<androidx.datastore.preferences.protobuf.NullValue> internalValueMap = new androidx.datastore.preferences.protobuf.Internal.EnumLiteMap<androidx.datastore.preferences.protobuf.NullValue>() { // from class: androidx.datastore.preferences.protobuf.NullValue.1
        @Override // androidx.datastore.preferences.protobuf.Internal.EnumLiteMap
        public androidx.datastore.preferences.protobuf.NullValue findValueByNumber(int number) {
            return androidx.datastore.preferences.protobuf.NullValue.forNumber(number);
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
    public static androidx.datastore.preferences.protobuf.NullValue valueOf(int value) {
        return forNumber(value);
    }

    public static androidx.datastore.preferences.protobuf.NullValue forNumber(int value) {
        if (value != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    public static androidx.datastore.preferences.protobuf.Internal.EnumLiteMap<androidx.datastore.preferences.protobuf.NullValue> internalGetValueMap() {
        return internalValueMap;
    }

    public static androidx.datastore.preferences.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return androidx.datastore.preferences.protobuf.NullValue.NullValueVerifier.INSTANCE;
    }

    private static final class NullValueVerifier implements androidx.datastore.preferences.protobuf.Internal.EnumVerifier {
        static final androidx.datastore.preferences.protobuf.Internal.EnumVerifier INSTANCE = new androidx.datastore.preferences.protobuf.NullValue.NullValueVerifier();

        private NullValueVerifier() {
        }

        @Override // androidx.datastore.preferences.protobuf.Internal.EnumVerifier
        public boolean isInRange(int number) {
            return androidx.datastore.preferences.protobuf.NullValue.forNumber(number) != null;
        }
    }

    NullValue(int value) {
        this.value = value;
    }
}
