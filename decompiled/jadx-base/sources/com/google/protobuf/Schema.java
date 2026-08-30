package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
@com.google.protobuf.CheckReturnValue
interface Schema<T> {
    boolean equals(T t, T t2);

    int getSerializedSize(T t);

    int hashCode(T t);

    boolean isInitialized(T t);

    void makeImmutable(T t);

    void mergeFrom(T t, com.google.protobuf.Reader reader, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException;

    void mergeFrom(T t, T t2);

    void mergeFrom(T t, byte[] bArr, int i, int i2, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException;

    T newInstance();

    void writeTo(T t, com.google.protobuf.Writer writer) throws java.io.IOException;
}
