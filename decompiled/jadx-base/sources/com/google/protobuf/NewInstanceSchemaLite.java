package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
@com.google.protobuf.CheckReturnValue
final class NewInstanceSchemaLite implements com.google.protobuf.NewInstanceSchema {
    NewInstanceSchemaLite() {
    }

    @Override // com.google.protobuf.NewInstanceSchema
    public java.lang.Object newInstance(java.lang.Object obj) {
        return ((com.google.protobuf.GeneratedMessageLite) obj).newMutableInstance();
    }
}
