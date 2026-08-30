package com.google.common.io;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
public final class LittleEndianDataInputStream extends java.io.FilterInputStream implements java.io.DataInput {
    public LittleEndianDataInputStream(java.io.InputStream in) {
        super((java.io.InputStream) com.google.common.base.Preconditions.checkNotNull(in));
    }

    @Override // java.io.DataInput
    public java.lang.String readLine() {
        throw new java.lang.UnsupportedOperationException("readLine is not supported");
    }

    @Override // java.io.DataInput
    public void readFully(byte[] b) throws java.io.IOException {
        com.google.common.io.ByteStreams.readFully(this, b);
    }

    @Override // java.io.DataInput
    public void readFully(byte[] b, int off, int len) throws java.io.IOException {
        com.google.common.io.ByteStreams.readFully(this, b, off, len);
    }

    @Override // java.io.DataInput
    public int skipBytes(int n) throws java.io.IOException {
        return (int) this.in.skip(n);
    }

    @Override // java.io.DataInput
    public int readUnsignedByte() throws java.io.IOException {
        int i = this.in.read();
        if (i >= 0) {
            return i;
        }
        throw new java.io.EOFException();
    }

    @Override // java.io.DataInput
    public int readUnsignedShort() throws java.io.IOException {
        return com.google.common.primitives.Ints.fromBytes((byte) 0, (byte) 0, readAndCheckByte(), readAndCheckByte());
    }

    @Override // java.io.DataInput
    public int readInt() throws java.io.IOException {
        byte andCheckByte = readAndCheckByte();
        byte andCheckByte2 = readAndCheckByte();
        return com.google.common.primitives.Ints.fromBytes(readAndCheckByte(), readAndCheckByte(), andCheckByte2, andCheckByte);
    }

    @Override // java.io.DataInput
    public long readLong() throws java.io.IOException {
        byte andCheckByte = readAndCheckByte();
        byte andCheckByte2 = readAndCheckByte();
        byte andCheckByte3 = readAndCheckByte();
        byte andCheckByte4 = readAndCheckByte();
        byte andCheckByte5 = readAndCheckByte();
        byte andCheckByte6 = readAndCheckByte();
        return com.google.common.primitives.Longs.fromBytes(readAndCheckByte(), readAndCheckByte(), andCheckByte6, andCheckByte5, andCheckByte4, andCheckByte3, andCheckByte2, andCheckByte);
    }

    @Override // java.io.DataInput
    public float readFloat() throws java.io.IOException {
        return java.lang.Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public double readDouble() throws java.io.IOException {
        return java.lang.Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public java.lang.String readUTF() throws java.io.IOException {
        return new java.io.DataInputStream(this.in).readUTF();
    }

    @Override // java.io.DataInput
    public short readShort() throws java.io.IOException {
        return (short) readUnsignedShort();
    }

    @Override // java.io.DataInput
    public char readChar() throws java.io.IOException {
        return (char) readUnsignedShort();
    }

    @Override // java.io.DataInput
    public byte readByte() throws java.io.IOException {
        return (byte) readUnsignedByte();
    }

    @Override // java.io.DataInput
    public boolean readBoolean() throws java.io.IOException {
        return readUnsignedByte() != 0;
    }

    private byte readAndCheckByte() throws java.io.IOException {
        int i = this.in.read();
        if (-1 != i) {
            return (byte) i;
        }
        throw new java.io.EOFException();
    }
}
