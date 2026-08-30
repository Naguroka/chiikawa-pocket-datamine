package com.google.firebase.messaging;

/* JADX INFO: loaded from: classes5.dex */
final class ByteStreams {
    private static final int BUFFER_SIZE = 8192;
    private static final int MAX_ARRAY_LEN = 2147483639;
    private static final int TO_BYTE_ARRAY_DEQUE_SIZE = 20;

    static byte[] createBuffer() {
        return new byte[8192];
    }

    private static int saturatedCast(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    private ByteStreams() {
    }

    private static byte[] toByteArrayInternal(java.io.InputStream inputStream, java.util.Queue<byte[]> queue, int i) throws java.io.IOException {
        int iMin = java.lang.Math.min(8192, java.lang.Math.max(128, java.lang.Integer.highestOneBit(i) * 2));
        while (i < MAX_ARRAY_LEN) {
            int iMin2 = java.lang.Math.min(iMin, MAX_ARRAY_LEN - i);
            byte[] bArr = new byte[iMin2];
            queue.add(bArr);
            int i2 = 0;
            while (i2 < iMin2) {
                int i3 = inputStream.read(bArr, i2, iMin2 - i2);
                if (i3 == -1) {
                    return combineBuffers(queue, i);
                }
                i2 += i3;
                i += i3;
            }
            iMin = saturatedCast(((long) iMin) * ((long) (iMin < 4096 ? 4 : 2)));
        }
        if (inputStream.read() == -1) {
            return combineBuffers(queue, MAX_ARRAY_LEN);
        }
        throw new java.lang.OutOfMemoryError("input is too large to fit in a byte array");
    }

    private static byte[] combineBuffers(java.util.Queue<byte[]> queue, int i) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArrRemove = queue.remove();
        if (bArrRemove.length == i) {
            return bArrRemove;
        }
        int length = i - bArrRemove.length;
        byte[] bArrCopyOf = java.util.Arrays.copyOf(bArrRemove, i);
        while (length > 0) {
            byte[] bArrRemove2 = queue.remove();
            int iMin = java.lang.Math.min(length, bArrRemove2.length);
            java.lang.System.arraycopy(bArrRemove2, 0, bArrCopyOf, i - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static byte[] toByteArray(java.io.InputStream inputStream) throws java.io.IOException {
        return toByteArrayInternal(inputStream, new java.util.ArrayDeque(20), 0);
    }

    public static java.io.InputStream limit(java.io.InputStream inputStream, long j) {
        return new com.google.firebase.messaging.ByteStreams.LimitedInputStream(inputStream, j);
    }

    private static final class LimitedInputStream extends java.io.FilterInputStream {
        private long left;
        private long mark;

        LimitedInputStream(java.io.InputStream inputStream, long j) {
            super(inputStream);
            this.mark = -1L;
            this.left = j;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() throws java.io.IOException {
            return (int) java.lang.Math.min(this.in.available(), this.left);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i) {
            this.in.mark(i);
            this.mark = this.left;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws java.io.IOException {
            if (this.left == 0) {
                return -1;
            }
            int i = this.in.read();
            if (i != -1) {
                this.left--;
            }
            return i;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
            long j = this.left;
            if (j == 0) {
                return -1;
            }
            int i3 = this.in.read(bArr, i, (int) java.lang.Math.min(i2, j));
            if (i3 != -1) {
                this.left -= (long) i3;
            }
            return i3;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() throws java.io.IOException {
            if (!this.in.markSupported()) {
                throw new java.io.IOException("Mark not supported");
            }
            if (this.mark == -1) {
                throw new java.io.IOException("Mark not set");
            }
            this.in.reset();
            this.left = this.mark;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j) throws java.io.IOException {
            long jSkip = this.in.skip(java.lang.Math.min(j, this.left));
            this.left -= jSkip;
            return jSkip;
        }
    }
}
