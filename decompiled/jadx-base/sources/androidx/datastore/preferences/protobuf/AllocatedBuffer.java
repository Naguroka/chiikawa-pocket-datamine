package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
@androidx.datastore.preferences.protobuf.CheckReturnValue
abstract class AllocatedBuffer {
    public abstract byte[] array();

    public abstract int arrayOffset();

    public abstract boolean hasArray();

    public abstract boolean hasNioBuffer();

    public abstract int limit();

    public abstract java.nio.ByteBuffer nioBuffer();

    public abstract int position();

    public abstract androidx.datastore.preferences.protobuf.AllocatedBuffer position(int position);

    public abstract int remaining();

    AllocatedBuffer() {
    }

    public static androidx.datastore.preferences.protobuf.AllocatedBuffer wrap(byte[] bytes) {
        return wrapNoCheck(bytes, 0, bytes.length);
    }

    public static androidx.datastore.preferences.protobuf.AllocatedBuffer wrap(final byte[] bytes, final int offset, final int length) {
        if (offset < 0 || length < 0 || offset + length > bytes.length) {
            throw new java.lang.IndexOutOfBoundsException(java.lang.String.format("bytes.length=%d, offset=%d, length=%d", java.lang.Integer.valueOf(bytes.length), java.lang.Integer.valueOf(offset), java.lang.Integer.valueOf(length)));
        }
        return wrapNoCheck(bytes, offset, length);
    }

    public static androidx.datastore.preferences.protobuf.AllocatedBuffer wrap(final java.nio.ByteBuffer buffer) {
        androidx.datastore.preferences.protobuf.Internal.checkNotNull(buffer, "buffer");
        return new androidx.datastore.preferences.protobuf.AllocatedBuffer() { // from class: androidx.datastore.preferences.protobuf.AllocatedBuffer.1
            @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public boolean hasNioBuffer() {
                return true;
            }

            @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public java.nio.ByteBuffer nioBuffer() {
                return buffer;
            }

            @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public boolean hasArray() {
                return buffer.hasArray();
            }

            @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public byte[] array() {
                return buffer.array();
            }

            @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public int arrayOffset() {
                return buffer.arrayOffset();
            }

            @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public int position() {
                return buffer.position();
            }

            @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public androidx.datastore.preferences.protobuf.AllocatedBuffer position(int position) {
                androidx.datastore.preferences.protobuf.Java8Compatibility.position(buffer, position);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public int limit() {
                return buffer.limit();
            }

            @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public int remaining() {
                return buffer.remaining();
            }
        };
    }

    private static androidx.datastore.preferences.protobuf.AllocatedBuffer wrapNoCheck(final byte[] bytes, final int offset, final int length) {
        return new androidx.datastore.preferences.protobuf.AllocatedBuffer() { // from class: androidx.datastore.preferences.protobuf.AllocatedBuffer.2
            private int position;

            @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public boolean hasArray() {
                return true;
            }

            @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public boolean hasNioBuffer() {
                return false;
            }

            @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public java.nio.ByteBuffer nioBuffer() {
                throw new java.lang.UnsupportedOperationException();
            }

            @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public byte[] array() {
                return bytes;
            }

            @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public int arrayOffset() {
                return offset;
            }

            @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public int position() {
                return this.position;
            }

            @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public androidx.datastore.preferences.protobuf.AllocatedBuffer position(int position) {
                if (position < 0 || position > length) {
                    throw new java.lang.IllegalArgumentException("Invalid position: " + position);
                }
                this.position = position;
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public int limit() {
                return length;
            }

            @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public int remaining() {
                return length - this.position;
            }
        };
    }
}
