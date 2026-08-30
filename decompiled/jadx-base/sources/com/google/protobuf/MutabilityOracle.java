package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
interface MutabilityOracle {
    public static final com.google.protobuf.MutabilityOracle IMMUTABLE = new com.google.protobuf.MutabilityOracle() { // from class: com.google.protobuf.MutabilityOracle.1
        @Override // com.google.protobuf.MutabilityOracle
        public void ensureMutable() {
            throw new java.lang.UnsupportedOperationException();
        }
    };

    void ensureMutable();
}
