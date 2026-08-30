package com.google.flatbuffers;

/* JADX INFO: loaded from: classes5.dex */
public class ByteBufferReadWriteBuf implements com.google.flatbuffers.ReadWriteBuf {
    private final java.nio.ByteBuffer buffer;

    public ByteBufferReadWriteBuf(java.nio.ByteBuffer byteBuffer) {
        this.buffer = byteBuffer;
        byteBuffer.order(java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    @Override // com.google.flatbuffers.ReadBuf
    public boolean getBoolean(int i) {
        return get(i) != 0;
    }

    @Override // com.google.flatbuffers.ReadBuf
    public byte get(int i) {
        return this.buffer.get(i);
    }

    @Override // com.google.flatbuffers.ReadBuf
    public short getShort(int i) {
        return this.buffer.getShort(i);
    }

    @Override // com.google.flatbuffers.ReadBuf
    public int getInt(int i) {
        return this.buffer.getInt(i);
    }

    @Override // com.google.flatbuffers.ReadBuf
    public long getLong(int i) {
        return this.buffer.getLong(i);
    }

    @Override // com.google.flatbuffers.ReadBuf
    public float getFloat(int i) {
        return this.buffer.getFloat(i);
    }

    @Override // com.google.flatbuffers.ReadBuf
    public double getDouble(int i) {
        return this.buffer.getDouble(i);
    }

    @Override // com.google.flatbuffers.ReadBuf
    public java.lang.String getString(int i, int i2) {
        return com.google.flatbuffers.Utf8Safe.decodeUtf8Buffer(this.buffer, i, i2);
    }

    @Override // com.google.flatbuffers.ReadBuf
    public byte[] data() {
        return this.buffer.array();
    }

    @Override // com.google.flatbuffers.ReadWriteBuf
    public void putBoolean(boolean z) {
        this.buffer.put(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.flatbuffers.ReadWriteBuf
    public void put(byte[] bArr, int i, int i2) {
        this.buffer.put(bArr, i, i2);
    }

    @Override // com.google.flatbuffers.ReadWriteBuf
    public void put(byte b) {
        this.buffer.put(b);
    }

    @Override // com.google.flatbuffers.ReadWriteBuf
    public void putShort(short s) {
        this.buffer.putShort(s);
    }

    @Override // com.google.flatbuffers.ReadWriteBuf
    public void putInt(int i) {
        this.buffer.putInt(i);
    }

    @Override // com.google.flatbuffers.ReadWriteBuf
    public void putLong(long j) {
        this.buffer.putLong(j);
    }

    @Override // com.google.flatbuffers.ReadWriteBuf
    public void putFloat(float f) {
        this.buffer.putFloat(f);
    }

    @Override // com.google.flatbuffers.ReadWriteBuf
    public void putDouble(double d) {
        this.buffer.putDouble(d);
    }

    @Override // com.google.flatbuffers.ReadWriteBuf
    public void setBoolean(int i, boolean z) {
        set(i, z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.flatbuffers.ReadWriteBuf
    public void set(int i, byte b) {
        requestCapacity(i + 1);
        this.buffer.put(i, b);
    }

    @Override // com.google.flatbuffers.ReadWriteBuf
    public void set(int i, byte[] bArr, int i2, int i3) {
        requestCapacity((i3 - i2) + i);
        int iPosition = this.buffer.position();
        this.buffer.position(i);
        this.buffer.put(bArr, i2, i3);
        this.buffer.position(iPosition);
    }

    @Override // com.google.flatbuffers.ReadWriteBuf
    public void setShort(int i, short s) {
        requestCapacity(i + 2);
        this.buffer.putShort(i, s);
    }

    @Override // com.google.flatbuffers.ReadWriteBuf
    public void setInt(int i, int i2) {
        requestCapacity(i + 4);
        this.buffer.putInt(i, i2);
    }

    @Override // com.google.flatbuffers.ReadWriteBuf
    public void setLong(int i, long j) {
        requestCapacity(i + 8);
        this.buffer.putLong(i, j);
    }

    @Override // com.google.flatbuffers.ReadWriteBuf
    public void setFloat(int i, float f) {
        requestCapacity(i + 4);
        this.buffer.putFloat(i, f);
    }

    @Override // com.google.flatbuffers.ReadWriteBuf
    public void setDouble(int i, double d) {
        requestCapacity(i + 8);
        this.buffer.putDouble(i, d);
    }

    @Override // com.google.flatbuffers.ReadWriteBuf
    public int writePosition() {
        return this.buffer.position();
    }

    @Override // com.google.flatbuffers.ReadWriteBuf, com.google.flatbuffers.ReadBuf
    public int limit() {
        return this.buffer.limit();
    }

    @Override // com.google.flatbuffers.ReadWriteBuf
    public boolean requestCapacity(int i) {
        return i <= this.buffer.limit();
    }
}
