package com.google.common.io;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
public final class LittleEndianDataOutputStream extends java.io.FilterOutputStream implements java.io.DataOutput {
    public LittleEndianDataOutputStream(java.io.OutputStream out) {
        super(new java.io.DataOutputStream((java.io.OutputStream) com.google.common.base.Preconditions.checkNotNull(out)));
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.DataOutput
    public void write(byte[] b, int off, int len) throws java.io.IOException {
        this.out.write(b, off, len);
    }

    @Override // java.io.DataOutput
    public void writeBoolean(boolean v) throws java.io.IOException {
        ((java.io.DataOutputStream) this.out).writeBoolean(v);
    }

    @Override // java.io.DataOutput
    public void writeByte(int v) throws java.io.IOException {
        ((java.io.DataOutputStream) this.out).writeByte(v);
    }

    @Override // java.io.DataOutput
    @java.lang.Deprecated
    public void writeBytes(java.lang.String s) throws java.io.IOException {
        ((java.io.DataOutputStream) this.out).writeBytes(s);
    }

    @Override // java.io.DataOutput
    public void writeChar(int v) throws java.io.IOException {
        writeShort(v);
    }

    @Override // java.io.DataOutput
    public void writeChars(java.lang.String s) throws java.io.IOException {
        for (int i = 0; i < s.length(); i++) {
            writeChar(s.charAt(i));
        }
    }

    @Override // java.io.DataOutput
    public void writeDouble(double v) throws java.io.IOException {
        writeLong(java.lang.Double.doubleToLongBits(v));
    }

    @Override // java.io.DataOutput
    public void writeFloat(float v) throws java.io.IOException {
        writeInt(java.lang.Float.floatToIntBits(v));
    }

    @Override // java.io.DataOutput
    public void writeInt(int v) throws java.io.IOException {
        this.out.write(v & 255);
        this.out.write((v >> 8) & 255);
        this.out.write((v >> 16) & 255);
        this.out.write((v >> 24) & 255);
    }

    @Override // java.io.DataOutput
    public void writeLong(long v) throws java.io.IOException {
        byte[] byteArray = com.google.common.primitives.Longs.toByteArray(java.lang.Long.reverseBytes(v));
        write(byteArray, 0, byteArray.length);
    }

    @Override // java.io.DataOutput
    public void writeShort(int v) throws java.io.IOException {
        this.out.write(v & 255);
        this.out.write((v >> 8) & 255);
    }

    @Override // java.io.DataOutput
    public void writeUTF(java.lang.String str) throws java.io.IOException {
        ((java.io.DataOutputStream) this.out).writeUTF(str);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.out.close();
    }
}
