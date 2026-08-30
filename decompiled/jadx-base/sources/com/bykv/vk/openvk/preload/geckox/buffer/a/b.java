package com.bykv.vk.openvk.preload.geckox.buffer.a;

/* JADX INFO: compiled from: RAFBuffer.java */
/* JADX INFO: loaded from: classes3.dex */
final class b implements com.bykv.vk.openvk.preload.geckox.buffer.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f1723a;
    private long b;
    private java.io.RandomAccessFile c;
    private java.util.concurrent.atomic.AtomicBoolean d = new java.util.concurrent.atomic.AtomicBoolean(false);
    private java.io.File e;

    b(long j, java.io.File file) throws java.io.IOException {
        this.f1723a = j;
        this.e = file;
        file.getParentFile().mkdirs();
        try {
            java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(file, "rw");
            this.c = randomAccessFile;
            randomAccessFile.setLength(j);
        } catch (java.lang.Exception e) {
            com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils.close(this.c);
            throw new java.io.IOException("create raf swap failed! path: " + file.getAbsolutePath() + " caused by: " + e.getMessage(), e);
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void a() throws java.io.IOException {
        if (this.d.get()) {
            throw new java.io.IOException("released!");
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final long b() {
        return this.f1723a;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void a(int i) throws java.io.IOException {
        a(new byte[]{(byte) i});
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void a(byte[] bArr) throws java.io.IOException {
        a(bArr, 0, bArr.length);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final synchronized long a(long j) throws java.io.IOException {
        int iSkipBytes;
        if (this.d.get()) {
            throw new java.io.IOException("released!");
        }
        int i = (int) j;
        if (i != j) {
            throw new java.io.IOException("too large:".concat(java.lang.String.valueOf(j)));
        }
        iSkipBytes = this.c.skipBytes(i);
        this.b = this.c.getFilePointer();
        return iSkipBytes;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int a(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (this.d.get()) {
            throw new java.io.IOException("released!");
        }
        if (bArr == null || bArr.length == 0 || i2 <= 0 || i < 0 || i >= bArr.length) {
            return 0;
        }
        if (i + i2 > bArr.length) {
            i2 = bArr.length - i;
        }
        synchronized (this) {
            long j = this.b;
            long j2 = this.f1723a;
            if (j == j2) {
                return 0;
            }
            if (((long) i2) + j > j2) {
                i2 = (int) (j2 - j);
            }
            this.c.write(bArr, i, i2);
            this.b += (long) i2;
            return i2;
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final long c() throws java.io.IOException {
        if (this.d.get()) {
            throw new java.io.IOException("released!");
        }
        return this.b;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000e A[PHI: r0
  0x000e: PHI (r0v5 long) = (r0v2 long), (r0v3 long) binds: [B:5:0x000c, B:8:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void b(long j) throws java.io.IOException {
        if (this.d.get()) {
            throw new java.io.IOException("released!");
        }
        long j2 = 0;
        if (j < 0) {
            j = j2;
        } else {
            j2 = this.f1723a;
            if (j > j2) {
                j = j2;
            }
        }
        this.b = j;
        this.c.seek(j);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int d() throws java.io.IOException {
        byte[] bArr = new byte[1];
        if (b(bArr) == 0) {
            return -1;
        }
        return bArr[0];
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int b(byte[] bArr) throws java.io.IOException {
        return b(bArr, 0, bArr.length);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int b(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (this.d.get()) {
            throw new java.io.IOException("released!");
        }
        if (bArr == null || i2 <= 0 || i < 0 || i >= bArr.length) {
            return 0;
        }
        if (i + i2 > bArr.length) {
            i2 = bArr.length - i;
        }
        synchronized (this) {
            long j = this.b;
            long j2 = this.f1723a;
            if (j == j2) {
                return -1;
            }
            if (((long) i2) + j > j2) {
                i2 = (int) (j2 - j);
            }
            int i3 = this.c.read(bArr, i, i2);
            if (i3 == -1) {
                return -1;
            }
            this.b += (long) i3;
            return i3;
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void e() {
        if (this.d.getAndSet(true)) {
            return;
        }
        com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils.close(this.c);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final java.io.File f() {
        return this.e;
    }
}
