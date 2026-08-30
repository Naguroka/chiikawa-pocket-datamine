package com.google.common.io;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
public interface ByteArrayDataInput extends java.io.DataInput {
    @Override // java.io.DataInput
    boolean readBoolean();

    @Override // java.io.DataInput
    byte readByte();

    @Override // java.io.DataInput
    char readChar();

    @Override // java.io.DataInput
    double readDouble();

    @Override // java.io.DataInput
    float readFloat();

    @Override // java.io.DataInput
    void readFully(byte[] b);

    @Override // java.io.DataInput
    void readFully(byte[] b, int off, int len);

    @Override // java.io.DataInput
    int readInt();

    @Override // java.io.DataInput
    @javax.annotation.CheckForNull
    java.lang.String readLine();

    @Override // java.io.DataInput
    long readLong();

    @Override // java.io.DataInput
    short readShort();

    @Override // java.io.DataInput
    java.lang.String readUTF();

    @Override // java.io.DataInput
    int readUnsignedByte();

    @Override // java.io.DataInput
    int readUnsignedShort();

    @Override // java.io.DataInput
    int skipBytes(int n);
}
