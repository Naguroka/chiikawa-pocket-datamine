package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
@com.google.protobuf.CheckReturnValue
interface SchemaFactory {
    <T> com.google.protobuf.Schema<T> createSchema(java.lang.Class<T> cls);
}
