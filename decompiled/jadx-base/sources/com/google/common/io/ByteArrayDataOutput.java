package com.google.common.io;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
public interface ByteArrayDataOutput extends java.io.DataOutput {
    byte[] toByteArray();

    @Override // java.io.DataOutput
    void write(int b);

    @Override // java.io.DataOutput
    void write(byte[] b);

    @Override // java.io.DataOutput
    void write(byte[] b, int off, int len);

    @Override // java.io.DataOutput
    void writeBoolean(boolean v);

    @Override // java.io.DataOutput
    void writeByte(int v);

    @Override // java.io.DataOutput
    @java.lang.Deprecated
    void writeBytes(java.lang.String s);

    @Override // java.io.DataOutput
    void writeChar(int v);

    @Override // java.io.DataOutput
    void writeChars(java.lang.String s);

    @Override // java.io.DataOutput
    void writeDouble(double v);

    @Override // java.io.DataOutput
    void writeFloat(float v);

    @Override // java.io.DataOutput
    void writeInt(int v);

    @Override // java.io.DataOutput
    void writeLong(long v);

    @Override // java.io.DataOutput
    void writeShort(int v);

    @Override // java.io.DataOutput
    void writeUTF(java.lang.String s);
}
