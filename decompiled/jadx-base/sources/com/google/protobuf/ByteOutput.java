package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ByteOutput {
    public abstract void write(byte b) throws java.io.IOException;

    public abstract void write(java.nio.ByteBuffer byteBuffer) throws java.io.IOException;

    public abstract void write(byte[] bArr, int i, int i2) throws java.io.IOException;

    public abstract void writeLazy(java.nio.ByteBuffer byteBuffer) throws java.io.IOException;

    public abstract void writeLazy(byte[] bArr, int i, int i2) throws java.io.IOException;
}
