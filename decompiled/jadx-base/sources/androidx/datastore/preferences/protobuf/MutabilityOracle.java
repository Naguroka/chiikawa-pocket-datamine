package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
interface MutabilityOracle {
    public static final androidx.datastore.preferences.protobuf.MutabilityOracle IMMUTABLE = new androidx.datastore.preferences.protobuf.MutabilityOracle() { // from class: androidx.datastore.preferences.protobuf.MutabilityOracle.1
        @Override // androidx.datastore.preferences.protobuf.MutabilityOracle
        public void ensureMutable() {
            throw new java.lang.UnsupportedOperationException();
        }
    };

    void ensureMutable();
}
