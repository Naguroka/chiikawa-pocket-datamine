package com.bykv.vk.openvk.preload.geckox.buffer.a;

/* JADX INFO: compiled from: BufferPolicy.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements com.bykv.vk.openvk.preload.geckox.buffer.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.io.RandomAccessFile f1722a;
    private java.util.concurrent.atomic.AtomicBoolean b = new java.util.concurrent.atomic.AtomicBoolean(false);
    private java.io.File c;

    public static com.bykv.vk.openvk.preload.geckox.buffer.a a(java.io.File file, long j) throws java.io.IOException {
        com.bykv.vk.openvk.preload.geckox.buffer.a aVarB = b(file, j);
        com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.d("gecko-debug-tag", "buffer type:" + aVarB.getClass());
        return aVarB;
    }

    private static com.bykv.vk.openvk.preload.geckox.buffer.a b(java.io.File file, long j) throws java.io.IOException {
        if (j <= 0) {
            try {
                return new com.bykv.vk.openvk.preload.geckox.buffer.a.a(file);
            } catch (java.lang.Exception e) {
                throw new java.io.IOException("create FileBuffer failed! file:" + file.getAbsolutePath() + " caused by:" + e.getMessage(), e);
            }
        }
        try {
            return new com.bykv.vk.openvk.preload.geckox.buffer.a.b(j, file);
        } catch (java.lang.Exception e2) {
            throw new java.lang.RuntimeException("create random access file failed! file:" + file.getAbsolutePath() + " caused by:" + e2.getMessage(), e2);
        }
    }

    private a(java.io.File file) throws java.io.IOException {
        this.c = file;
        file.getParentFile().mkdirs();
        try {
            this.f1722a = new java.io.RandomAccessFile(file, "rw");
        } catch (java.lang.Exception e) {
            com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils.close(this.f1722a);
            throw new java.io.IOException("create raf mSwap failed! path: " + file.getAbsolutePath() + " caused by: " + e.getMessage(), e);
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void a() throws java.io.IOException {
        if (this.b.get()) {
            throw new java.io.IOException("released!");
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final long b() throws java.io.IOException {
        return this.f1722a.length();
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
        int i;
        if (this.b.get()) {
            throw new java.io.IOException("released!");
        }
        i = (int) j;
        if (i != j) {
            throw new java.io.IOException("too large:".concat(java.lang.String.valueOf(j)));
        }
        return this.f1722a.skipBytes(i);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int a(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (this.b.get()) {
            throw new java.io.IOException("released!");
        }
        if (bArr == null || bArr.length == 0 || i2 <= 0 || i < 0 || i >= bArr.length) {
            return 0;
        }
        if (i + i2 > bArr.length) {
            i2 = bArr.length - i;
        }
        synchronized (this) {
            this.f1722a.write(bArr, i, i2);
        }
        return i2;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final long c() throws java.io.IOException {
        if (this.b.get()) {
            throw new java.io.IOException("released!");
        }
        return this.f1722a.getFilePointer();
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void b(long j) throws java.io.IOException {
        if (this.b.get()) {
            throw new java.io.IOException("released!");
        }
        if (j < 0) {
            j = 0;
        }
        this.f1722a.seek(j);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int d() throws java.io.IOException {
        byte[] bArr = new byte[1];
        if (b(bArr) <= 0) {
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
        int i3;
        if (this.b.get()) {
            throw new java.io.IOException("released!");
        }
        if (bArr == null || i2 <= 0 || i < 0 || i >= bArr.length) {
            return 0;
        }
        if (i + i2 > bArr.length) {
            i2 = bArr.length - i;
        }
        synchronized (this) {
            i3 = this.f1722a.read(bArr, i, i2);
        }
        return i3;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void e() {
        if (this.b.getAndSet(true)) {
            return;
        }
        com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils.close(this.f1722a);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final java.io.File f() {
        return this.c;
    }
}
