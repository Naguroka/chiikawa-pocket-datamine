package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
class IterableByteBufferInputStream extends java.io.InputStream {
    private long currentAddress;
    private byte[] currentArray;
    private int currentArrayOffset;
    private java.nio.ByteBuffer currentByteBuffer;
    private int currentByteBufferPos;
    private int currentIndex;
    private int dataSize = 0;
    private boolean hasArray;
    private java.util.Iterator<java.nio.ByteBuffer> iterator;

    IterableByteBufferInputStream(java.lang.Iterable<java.nio.ByteBuffer> data) {
        this.iterator = data.iterator();
        for (java.nio.ByteBuffer byteBuffer : data) {
            this.dataSize++;
        }
        this.currentIndex = -1;
        if (getNextByteBuffer()) {
            return;
        }
        this.currentByteBuffer = androidx.datastore.preferences.protobuf.Internal.EMPTY_BYTE_BUFFER;
        this.currentIndex = 0;
        this.currentByteBufferPos = 0;
        this.currentAddress = 0L;
    }

    private boolean getNextByteBuffer() {
        this.currentIndex++;
        if (!this.iterator.hasNext()) {
            return false;
        }
        java.nio.ByteBuffer next = this.iterator.next();
        this.currentByteBuffer = next;
        this.currentByteBufferPos = next.position();
        if (this.currentByteBuffer.hasArray()) {
            this.hasArray = true;
            this.currentArray = this.currentByteBuffer.array();
            this.currentArrayOffset = this.currentByteBuffer.arrayOffset();
        } else {
            this.hasArray = false;
            this.currentAddress = androidx.datastore.preferences.protobuf.UnsafeUtil.addressOffset(this.currentByteBuffer);
            this.currentArray = null;
        }
        return true;
    }

    private void updateCurrentByteBufferPos(int numberOfBytesRead) {
        int i = this.currentByteBufferPos + numberOfBytesRead;
        this.currentByteBufferPos = i;
        if (i == this.currentByteBuffer.limit()) {
            getNextByteBuffer();
        }
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
        if (this.currentIndex == this.dataSize) {
            return -1;
        }
        if (this.hasArray) {
            int i = this.currentArray[this.currentByteBufferPos + this.currentArrayOffset] & 255;
            updateCurrentByteBufferPos(1);
            return i;
        }
        int i2 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(((long) this.currentByteBufferPos) + this.currentAddress) & 255;
        updateCurrentByteBufferPos(1);
        return i2;
    }

    @Override // java.io.InputStream
    public int read(byte[] output, int offset, int length) throws java.io.IOException {
        if (this.currentIndex == this.dataSize) {
            return -1;
        }
        int iLimit = this.currentByteBuffer.limit();
        int i = this.currentByteBufferPos;
        int i2 = iLimit - i;
        if (length > i2) {
            length = i2;
        }
        if (this.hasArray) {
            java.lang.System.arraycopy(this.currentArray, i + this.currentArrayOffset, output, offset, length);
            updateCurrentByteBufferPos(length);
        } else {
            int iPosition = this.currentByteBuffer.position();
            androidx.datastore.preferences.protobuf.Java8Compatibility.position(this.currentByteBuffer, this.currentByteBufferPos);
            this.currentByteBuffer.get(output, offset, length);
            androidx.datastore.preferences.protobuf.Java8Compatibility.position(this.currentByteBuffer, iPosition);
            updateCurrentByteBufferPos(length);
        }
        return length;
    }
}
