package com.bykv.vk.openvk.bg.bg.IL.bg;

/* JADX INFO: loaded from: classes3.dex */
public class bg extends android.media.MediaDataSource {
    public static final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bykv.vk.openvk.bg.bg.IL.bg.bg> bg = new java.util.concurrent.ConcurrentHashMap<>();
    private final com.bykv.vk.openvk.bg.bg.IL.bg.bg.bX IL;
    private long bX = -2147483648L;
    private final android.content.Context eqN;
    private final com.bykv.vk.openvk.bg.bg.bg.bX.bX zx;

    public bg(android.content.Context context, com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar) {
        this.eqN = context;
        this.zx = bXVar;
        this.IL = new com.bykv.vk.openvk.bg.bg.IL.bg.bg.IL(context, bXVar);
    }

    @Override // android.media.MediaDataSource
    public int readAt(long j, byte[] bArr, int i, int i2) throws java.io.IOException {
        int iBg = this.IL.bg(j, bArr, i, i2);
        new java.lang.StringBuilder("readAt: position = ").append(j).append("  buffer.length =").append(bArr.length).append("  offset = ").append(i).append(" size =").append(iBg).append("  current = ").append(java.lang.Thread.currentThread());
        return iBg;
    }

    @Override // android.media.MediaDataSource
    public long getSize() throws java.io.IOException {
        if (this.bX == -2147483648L) {
            if (this.eqN == null || android.text.TextUtils.isEmpty(this.zx.Ta())) {
                return -1L;
            }
            this.bX = this.IL.bX();
        }
        return this.bX;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        java.lang.Object[] objArr = new java.lang.Object[2];
        this.zx.Ta();
        com.bykv.vk.openvk.bg.bg.IL.bg.bg.bX bXVar = this.IL;
        if (bXVar != null) {
            bXVar.IL();
        }
        bg.remove(this.zx.yDt());
    }

    public com.bykv.vk.openvk.bg.bg.bg.bX.bX bg() {
        return this.zx;
    }

    public static com.bykv.vk.openvk.bg.bg.IL.bg.bg bg(android.content.Context context, com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar) {
        com.bykv.vk.openvk.bg.bg.IL.bg.bg bgVar = new com.bykv.vk.openvk.bg.bg.IL.bg.bg(context, bXVar);
        bg.put(bXVar.yDt(), bgVar);
        return bgVar;
    }
}
