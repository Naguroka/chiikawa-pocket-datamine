package com.bytedance.sdk.openadsdk.iR;

/* JADX INFO: loaded from: classes4.dex */
public class bg implements com.bykv.vk.openvk.preload.geckox.net.INetWork {
    protected com.bytedance.sdk.component.IL.bg.VB bg = new com.bytedance.sdk.component.IL.bg.VB.bg().bg(10, java.util.concurrent.TimeUnit.SECONDS).IL(10, java.util.concurrent.TimeUnit.SECONDS).bX(10, java.util.concurrent.TimeUnit.SECONDS).bg();
    protected com.bytedance.sdk.component.IL.bg.VB IL = new com.bytedance.sdk.component.IL.bg.VB.bg().bg(10, java.util.concurrent.TimeUnit.SECONDS).IL(30, java.util.concurrent.TimeUnit.SECONDS).bX(30, java.util.concurrent.TimeUnit.SECONDS).bg();

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public void syncDoGet(final java.lang.String str) {
        this.bg.bg(new com.bytedance.sdk.component.IL.bg.Ta.bg().bg().IL(str).IL()).bg(new com.bytedance.sdk.component.IL.bg.bX() { // from class: com.bytedance.sdk.openadsdk.iR.bg.1
            @Override // com.bytedance.sdk.component.IL.bg.bX
            public void bg(com.bytedance.sdk.component.IL.bg.IL il, com.bytedance.sdk.component.IL.bg.Lq lq) throws java.io.IOException {
            }

            @Override // com.bytedance.sdk.component.IL.bg.bX
            public void bg(com.bytedance.sdk.component.IL.bg.IL il, java.io.IOException iOException) {
            }
        });
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public com.bykv.vk.openvk.preload.geckox.net.Response doGet(java.lang.String str) throws java.lang.Exception {
        com.bytedance.sdk.component.IL.bg.Lq lqIL = this.bg.bg(new com.bytedance.sdk.component.IL.bg.Ta.bg().bg().IL(str).IL()).IL();
        return new com.bykv.vk.openvk.preload.geckox.net.Response(bg(lqIL.iR()), lqIL.bX() == 200 ? lqIL.ldr().IL() : null, lqIL.bX(), lqIL.zx());
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public com.bykv.vk.openvk.preload.geckox.net.Response doPost(java.lang.String str, java.util.List<android.util.Pair<java.lang.String, java.lang.String>> list) throws java.lang.Exception {
        com.bytedance.sdk.component.IL.bg.zx.bg bgVar = new com.bytedance.sdk.component.IL.bg.zx.bg();
        if (list != null) {
            for (android.util.Pair<java.lang.String, java.lang.String> pair : list) {
                bgVar.bg((java.lang.String) pair.first, (java.lang.String) pair.second);
            }
        }
        com.bytedance.sdk.component.IL.bg.Lq lqIL = this.bg.bg(new com.bytedance.sdk.component.IL.bg.Ta.bg().IL(str).bg((com.bytedance.sdk.component.IL.bg.yDt) bgVar.bg()).IL()).IL();
        return new com.bykv.vk.openvk.preload.geckox.net.Response(bg(lqIL.iR()), lqIL.bX() == 200 ? lqIL.ldr().IL() : null, lqIL.bX(), lqIL.zx());
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public com.bykv.vk.openvk.preload.geckox.net.Response doPost(java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        com.bytedance.sdk.component.IL.bg.Lq lqIL = this.bg.bg(new com.bytedance.sdk.component.IL.bg.Ta.bg().IL(str).bg(com.bytedance.sdk.component.IL.bg.yDt.bg(com.bytedance.sdk.component.IL.bg.WR.bg("application/json; charset=utf-8"), str2)).IL()).IL();
        return new com.bykv.vk.openvk.preload.geckox.net.Response(bg(lqIL.iR()), lqIL.bX() == 200 ? lqIL.ldr().IL() : null, lqIL.bX(), lqIL.zx());
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x007b: MOVE (r7 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:25:0x007b */
    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public void downloadFile(java.lang.String str, long j, com.bykv.vk.openvk.preload.geckox.buffer.stream.BufferOutputStream bufferOutputStream) throws java.lang.Exception {
        java.io.Closeable closeable;
        java.lang.Exception e;
        java.io.Closeable closeable2 = null;
        int i = 0;
        try {
            try {
                try {
                    com.bytedance.sdk.component.IL.bg.Lq lqIL = this.IL.bg(new com.bytedance.sdk.component.IL.bg.Ta.bg().bg().IL(str).IL()).IL();
                    int iBX = lqIL.bX();
                    try {
                        java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(lqIL.ldr().bX());
                        try {
                            byte[] bArr = new byte[2048];
                            while (true) {
                                int i2 = bufferedInputStream.read(bArr, 0, 2048);
                                if (i2 != -1) {
                                    bufferOutputStream.write(bArr, 0, i2);
                                } else {
                                    com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils.close(bufferedInputStream);
                                    return;
                                }
                            }
                        } catch (java.lang.Exception e2) {
                            e = e2;
                            i = iBX;
                            throw new java.lang.RuntimeException("downloadFile failed, code: " + i + ", url:" + str + ", caused by:" + e.getMessage(), e);
                        }
                    } catch (java.lang.Exception e3) {
                        e = e3;
                    }
                } catch (java.lang.Exception e4) {
                    e = e4;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils.close(closeable2);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            closeable2 = closeable;
        }
    }

    private java.util.Map<java.lang.String, java.lang.String> bg(com.bytedance.sdk.component.IL.bg.ldr ldrVar) {
        if (ldrVar == null) {
            return null;
        }
        java.util.HashMap map = new java.util.HashMap();
        for (int i = 0; i < ldrVar.bg(); i++) {
            map.put(ldrVar.bg(i), ldrVar.IL(i));
        }
        return map;
    }
}
