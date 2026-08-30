package com.pgl.ssdk;

/* JADX INFO: loaded from: classes3.dex */
public class l implements com.pgl.ssdk.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.nio.channels.FileChannel f3796a;
    private final long b;
    private final long c;

    public l(java.nio.channels.FileChannel fileChannel, long j, long j2) {
        if (j < 0) {
            throw new java.lang.IndexOutOfBoundsException("offset: ".concat(java.lang.String.valueOf(j2)));
        }
        if (j2 < 0) {
            throw new java.lang.IndexOutOfBoundsException("size: ".concat(java.lang.String.valueOf(j2)));
        }
        this.f3796a = fileChannel;
        this.b = j;
        this.c = j2;
    }

    @Override // com.pgl.ssdk.o
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.pgl.ssdk.l a(long j, long j2) {
        long jA = a();
        a(j, j2, jA);
        return (j == 0 && j2 == jA) ? this : new com.pgl.ssdk.l(this.f3796a, this.b + j, j2);
    }

    @Override // com.pgl.ssdk.o
    public long a() {
        long j = this.c;
        if (j != -1) {
            return j;
        }
        try {
            return this.f3796a.size();
        } catch (java.io.IOException unused) {
            return 0L;
        }
    }

    public void a(long j, int i, java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        int i2;
        a(j, i, a());
        if (i == 0) {
            return;
        }
        if (i <= byteBuffer.remaining()) {
            long j2 = this.b + j;
            int iLimit = byteBuffer.limit();
            try {
                byteBuffer.limit(byteBuffer.position() + i);
                while (i > 0) {
                    synchronized (this.f3796a) {
                        this.f3796a.position(j2);
                        i2 = this.f3796a.read(byteBuffer);
                    }
                    j2 += (long) i2;
                    i -= i2;
                }
                byteBuffer.limit(iLimit);
                return;
            } catch (java.lang.Throwable th) {
                byteBuffer.limit(iLimit);
                throw th;
            }
        }
        throw new java.nio.BufferOverflowException();
    }

    @Override // com.pgl.ssdk.o
    public java.nio.ByteBuffer a(long j, int i) throws java.io.IOException {
        if (i >= 0) {
            java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(i);
            a(j, i, byteBufferAllocate);
            byteBufferAllocate.flip();
            return byteBufferAllocate;
        }
        throw new java.lang.IndexOutOfBoundsException("size: ".concat(java.lang.String.valueOf(i)));
    }

    private static void a(long j, long j2, long j3) {
        if (j < 0) {
            throw new java.lang.IndexOutOfBoundsException("offset: ".concat(java.lang.String.valueOf(j)));
        }
        if (j2 < 0) {
            throw new java.lang.IndexOutOfBoundsException("size: ".concat(java.lang.String.valueOf(j2)));
        }
        if (j > j3) {
            throw new java.lang.IndexOutOfBoundsException("offset (" + j + ") > source size (" + j3 + ")");
        }
        long j4 = j + j2;
        if (j4 < j) {
            throw new java.lang.IndexOutOfBoundsException("offset (" + j + ") + size (" + j2 + ") overflow");
        }
        if (j4 > j3) {
            throw new java.lang.IndexOutOfBoundsException("offset (" + j + ") + size (" + j2 + ") > source size (" + j3 + ")");
        }
    }
}
