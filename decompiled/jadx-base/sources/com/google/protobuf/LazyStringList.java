package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
public interface LazyStringList extends com.google.protobuf.ProtocolStringList {
    void add(com.google.protobuf.ByteString byteString);

    void add(byte[] bArr);

    boolean addAllByteArray(java.util.Collection<byte[]> collection);

    boolean addAllByteString(java.util.Collection<? extends com.google.protobuf.ByteString> collection);

    java.util.List<byte[]> asByteArrayList();

    byte[] getByteArray(int i);

    com.google.protobuf.ByteString getByteString(int i);

    java.lang.Object getRaw(int i);

    java.util.List<?> getUnderlyingElements();

    com.google.protobuf.LazyStringList getUnmodifiableView();

    void mergeFrom(com.google.protobuf.LazyStringList lazyStringList);

    void set(int i, com.google.protobuf.ByteString byteString);

    void set(int i, byte[] bArr);
}
