package jp.co.cyberagent.octo.lib;

/* JADX INFO: loaded from: classes6.dex */
final class BufferPool {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3956a;
    public java.util.Deque<java.nio.ByteBuffer> b = new java.util.ArrayDeque();

    public BufferPool(int i) {
        this.f3956a = i;
    }

    public synchronized java.nio.ByteBuffer Borrow() {
        synchronized (this.b) {
            if (this.b.isEmpty()) {
                return java.nio.ByteBuffer.allocate(this.f3956a);
            }
            return this.b.pop();
        }
    }

    public synchronized void Return(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return;
        }
        synchronized (this.b) {
            this.b.add(byteBuffer);
        }
    }
}
