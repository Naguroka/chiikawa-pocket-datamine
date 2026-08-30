package com.bykv.vk.openvk.bg.bg.IL.bg.bg;

/* JADX INFO: loaded from: classes3.dex */
public class IL implements com.bykv.vk.openvk.bg.bg.IL.bg.bg.bX {
    private java.io.RandomAccessFile WR;
    private java.io.File bX;
    private final com.bykv.vk.openvk.bg.bg.bg.bX.bX eo;
    private java.io.File eqN;
    private long zx;
    private volatile long bg = -2147483648L;
    private final java.lang.Object IL = new java.lang.Object();
    private volatile long ldr = -1;
    private volatile boolean iR = false;
    private volatile boolean Kg = false;

    public IL(android.content.Context context, com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar) {
        this.zx = 0L;
        this.WR = null;
        this.eo = bXVar;
        try {
            this.bX = com.bykv.vk.openvk.bg.bg.IL.zx.IL.IL(bXVar.IL(), bXVar.yDt());
            this.eqN = com.bykv.vk.openvk.bg.bg.IL.zx.IL.bX(bXVar.IL(), bXVar.yDt());
            if (eqN()) {
                this.WR = new java.io.RandomAccessFile(this.eqN, com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
            } else {
                this.WR = new java.io.RandomAccessFile(this.bX, "rw");
            }
            if (eqN()) {
                return;
            }
            this.zx = this.bX.length();
            bg();
        } catch (java.lang.Throwable unused) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            bXVar.Ta();
        }
    }

    private boolean eqN() {
        return this.eqN.exists();
    }

    public void bg() {
        com.bytedance.sdk.component.IL.bg.VB.bg bgVar;
        if (com.bykv.vk.openvk.bg.bg.bg.bX.eqN() != null) {
            bgVar = com.bykv.vk.openvk.bg.bg.bg.bX.eqN().IL();
        } else {
            bgVar = new com.bytedance.sdk.component.IL.bg.VB.bg("v_cache");
        }
        bgVar.bg(this.eo.vb(), java.util.concurrent.TimeUnit.MILLISECONDS).IL(this.eo.xxp(), java.util.concurrent.TimeUnit.MILLISECONDS).bX(this.eo.VzQ(), java.util.concurrent.TimeUnit.MILLISECONDS);
        com.bytedance.sdk.component.IL.bg.VB vbBg = bgVar.bg();
        java.lang.Object[] objArr = new java.lang.Object[4];
        java.lang.Long.valueOf(this.zx);
        this.eo.yDt();
        vbBg.bg(new com.bytedance.sdk.component.IL.bg.Ta.bg().bg("RANGE", "bytes=" + this.zx + "-").IL(this.eo.Ta()).bg().bg("videoLoadWhenPlaying").bg(9).IL()).bg(new com.bytedance.sdk.component.IL.bg.bX() { // from class: com.bykv.vk.openvk.bg.bg.IL.bg.bg.IL.1
            @Override // com.bytedance.sdk.component.IL.bg.bX
            public void bg(com.bytedance.sdk.component.IL.bg.IL il, java.io.IOException iOException) {
                com.bykv.vk.openvk.bg.bg.IL.bg.bg.IL.this.Kg = false;
                com.bykv.vk.openvk.bg.bg.IL.bg.bg.IL.this.bg = -1L;
            }

            /* JADX WARN: Code duplicated, block: B:85:0x01c6 A[Catch: all -> 0x01ef, TryCatch #7 {all -> 0x01ef, blocks: (B:83:0x01c1, B:85:0x01c6, B:87:0x01cb, B:88:0x01ce, B:90:0x01d6, B:92:0x01ea), top: B:114:0x01c1 }] */
            /* JADX WARN: Code duplicated, block: B:87:0x01cb A[Catch: all -> 0x01ef, TryCatch #7 {all -> 0x01ef, blocks: (B:83:0x01c1, B:85:0x01c6, B:87:0x01cb, B:88:0x01ce, B:90:0x01d6, B:92:0x01ea), top: B:114:0x01c1 }] */
            @Override // com.bytedance.sdk.component.IL.bg.bX
            public void bg(com.bytedance.sdk.component.IL.bg.IL il, com.bytedance.sdk.component.IL.bg.Lq lq) throws java.io.IOException {
                com.bytedance.sdk.component.IL.bg.xxp xxpVarLdr;
                java.io.InputStream inputStream;
                long length;
                long j;
                boolean z;
                if (lq == null) {
                    com.bykv.vk.openvk.bg.bg.IL.bg.bg.IL.this.Kg = false;
                    com.bykv.vk.openvk.bg.bg.IL.bg.bg.IL il2 = com.bykv.vk.openvk.bg.bg.IL.bg.bg.IL.this;
                    il2.bg = il2.ldr;
                    return;
                }
                java.io.InputStream inputStreamBX = null;
                try {
                    com.bykv.vk.openvk.bg.bg.IL.bg.bg.IL.this.Kg = lq.eqN();
                    if (com.bykv.vk.openvk.bg.bg.IL.bg.bg.IL.this.Kg) {
                        xxpVarLdr = lq.ldr();
                        try {
                            if (com.bykv.vk.openvk.bg.bg.IL.bg.bg.IL.this.Kg && xxpVarLdr != null) {
                                com.bykv.vk.openvk.bg.bg.IL.bg.bg.IL.this.bg = xxpVarLdr.bg() + com.bykv.vk.openvk.bg.bg.IL.bg.bg.IL.this.zx;
                                inputStreamBX = xxpVarLdr.bX();
                            }
                            inputStream = inputStreamBX;
                            if (inputStream == null) {
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (java.lang.Throwable unused) {
                                        return;
                                    }
                                }
                                if (xxpVarLdr != null) {
                                    xxpVarLdr.close();
                                }
                                if (lq != null) {
                                    lq.close();
                                }
                                if (com.bykv.vk.openvk.bg.bg.IL.bg.bg.IL.this.Kg && com.bykv.vk.openvk.bg.bg.IL.bg.bg.IL.this.bX.length() == com.bykv.vk.openvk.bg.bg.IL.bg.bg.IL.this.bg) {
                                    com.bykv.vk.openvk.bg.bg.IL.bg.bg.IL.this.ldr();
                                    return;
                                }
                                return;
                            }
                            try {
                                byte[] bArr = new byte[8192];
                                long j2 = com.bykv.vk.openvk.bg.bg.IL.bg.bg.IL.this.zx;
                                int i = 0;
                                long j3 = 0;
                                while (true) {
                                    int i2 = inputStream.read(bArr, i, 8192 - i);
                                    z = true;
                                    if (i2 == -1) {
                                        break;
                                    }
                                    i += i2;
                                    j3 += (long) i2;
                                    if (j3 % 8192 != 0 && j3 != com.bykv.vk.openvk.bg.bg.IL.bg.bg.IL.this.bg - com.bykv.vk.openvk.bg.bg.IL.bg.bg.IL.this.zx) {
                                        z = false;
                                    }
                                    java.lang.Object[] objArr2 = new java.lang.Object[14];
                                    java.lang.Boolean.valueOf(z);
                                    java.lang.Integer.valueOf(i);
                                    java.lang.Long.valueOf(com.bykv.vk.openvk.bg.bg.IL.bg.bg.IL.this.bg);
                                    java.lang.Long.valueOf(j3);
                                    java.lang.Long.valueOf(com.bykv.vk.openvk.bg.bg.IL.bg.bg.IL.this.zx);
                                    com.bykv.vk.openvk.bg.bg.IL.bg.bg.IL.this.eo.yDt();
                                    com.bykv.vk.openvk.bg.bg.IL.bg.bg.IL.this.eo.Ta();
                                    if (z) {
                                        synchronized (com.bykv.vk.openvk.bg.bg.IL.bg.bg.IL.this.IL) {
                                            com.bykv.vk.openvk.bg.bg.IL.zx.IL.bg(com.bykv.vk.openvk.bg.bg.IL.bg.bg.IL.this.WR, bArr, java.lang.Long.valueOf(j2).intValue(), i, com.bykv.vk.openvk.bg.bg.IL.bg.bg.IL.this.eo.yDt());
                                        }
                                        j2 += (long) i;
                                        i = 0;
                                    }
                                }
                                java.lang.Object[] objArr3 = new java.lang.Object[10];
                                java.lang.Long.valueOf(com.bykv.vk.openvk.bg.bg.IL.bg.bg.IL.this.zx);
                                java.lang.Long.valueOf(com.bykv.vk.openvk.bg.bg.IL.bg.bg.IL.this.bg);
                                java.lang.Long.valueOf(j3);
                                if (j3 != com.bykv.vk.openvk.bg.bg.IL.bg.bg.IL.this.bg - com.bykv.vk.openvk.bg.bg.IL.bg.bg.IL.this.zx) {
                                    z = false;
                                }
                                java.lang.Boolean.valueOf(z);
                                com.bykv.vk.openvk.bg.bg.IL.bg.bg.IL.this.eo.Ta();
                                inputStreamBX = inputStream;
                            } catch (java.lang.Throwable unused2) {
                                try {
                                    com.bykv.vk.openvk.bg.bg.IL.bg.bg.IL.this.Kg = false;
                                    com.bykv.vk.openvk.bg.bg.IL.bg.bg.IL il3 = com.bykv.vk.openvk.bg.bg.IL.bg.bg.IL.this;
                                    il3.bg = il3.ldr;
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (java.lang.Throwable unused3) {
                                            return;
                                        }
                                    }
                                    if (xxpVarLdr != null) {
                                        xxpVarLdr.close();
                                    }
                                    if (lq != null) {
                                        lq.close();
                                    }
                                    if (com.bykv.vk.openvk.bg.bg.IL.bg.bg.IL.this.Kg) {
                                        if (length == j) {
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                    return;
                                } finally {
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                            if (xxpVarLdr != null) {
                                                xxpVarLdr.close();
                                            }
                                            if (lq != null) {
                                                lq.close();
                                            }
                                            if (com.bykv.vk.openvk.bg.bg.IL.bg.bg.IL.this.Kg && com.bykv.vk.openvk.bg.bg.IL.bg.bg.IL.this.bX.length() == com.bykv.vk.openvk.bg.bg.IL.bg.bg.IL.this.bg) {
                                                com.bykv.vk.openvk.bg.bg.IL.bg.bg.IL.this.ldr();
                                            }
                                        } catch (java.lang.Throwable unused4) {
                                        }
                                    } else {
                                        if (xxpVarLdr != null) {
                                            xxpVarLdr.close();
                                        }
                                        if (lq != null) {
                                            lq.close();
                                        }
                                        if (com.bykv.vk.openvk.bg.bg.IL.bg.bg.IL.this.Kg) {
                                            com.bykv.vk.openvk.bg.bg.IL.bg.bg.IL.this.ldr();
                                        }
                                    }
                                }
                            }
                        } catch (java.lang.Throwable unused5) {
                            inputStream = null;
                        }
                    } else {
                        com.bykv.vk.openvk.bg.bg.IL.bg.bg.IL.this.Kg = false;
                        com.bykv.vk.openvk.bg.bg.IL.bg.bg.IL il4 = com.bykv.vk.openvk.bg.bg.IL.bg.bg.IL.this;
                        il4.bg = il4.ldr;
                        xxpVarLdr = null;
                    }
                    if (inputStreamBX != null) {
                        try {
                            inputStreamBX.close();
                        } catch (java.lang.Throwable unused6) {
                            return;
                        }
                    }
                    if (xxpVarLdr != null) {
                        xxpVarLdr.close();
                    }
                    if (lq != null) {
                        lq.close();
                    }
                    if (com.bykv.vk.openvk.bg.bg.IL.bg.bg.IL.this.Kg && com.bykv.vk.openvk.bg.bg.IL.bg.bg.IL.this.bX.length() == com.bykv.vk.openvk.bg.bg.IL.bg.bg.IL.this.bg) {
                        com.bykv.vk.openvk.bg.bg.IL.bg.bg.IL.this.ldr();
                    }
                } catch (java.lang.Throwable unused7) {
                    xxpVarLdr = null;
                    inputStream = null;
                }
            }
        });
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.bg.bg.bX
    public int bg(long j, byte[] bArr, int i, int i2) throws java.io.IOException {
        try {
            if (j == this.bg) {
                return -1;
            }
            int i3 = 0;
            int i4 = 0;
            while (!this.iR) {
                synchronized (this.IL) {
                    long jZx = zx();
                    if (j < jZx) {
                        new java.lang.StringBuilder("read:  read ").append(j);
                        this.WR.seek(j);
                        i4 = this.WR.read(bArr, i, i2);
                    } else {
                        java.lang.Object[] objArr = new java.lang.Object[4];
                        java.lang.Long.valueOf(j);
                        java.lang.Long.valueOf(jZx);
                        i3 += 33;
                        this.IL.wait(33L);
                    }
                }
                if (i4 > 0) {
                    return i4;
                }
                if (i3 >= 20000) {
                    throw new java.net.SocketTimeoutException();
                }
            }
            return -1;
        } catch (java.lang.Throwable th) {
            if (th instanceof java.io.IOException) {
                throw th;
            }
            throw new java.io.IOException();
        }
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.bg.bg.bX
    public void IL() {
        try {
            if (!this.iR) {
                this.WR.close();
            }
            java.io.File file = this.bX;
            if (file != null) {
                file.setLastModified(java.lang.System.currentTimeMillis());
            }
            java.io.File file2 = this.eqN;
            if (file2 != null) {
                file2.setLastModified(java.lang.System.currentTimeMillis());
            }
        } catch (java.lang.Throwable unused) {
        }
        this.iR = true;
    }

    private long zx() {
        if (eqN()) {
            return this.eqN.length();
        }
        return this.bX.length();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ldr() throws java.io.IOException {
        synchronized (this.IL) {
            if (eqN()) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                this.eo.Ta();
                this.eo.yDt();
                return;
            }
            try {
                if (!this.bX.renameTo(this.eqN)) {
                    throw new java.io.IOException("Error renaming file " + this.bX + " to " + this.eqN + " for completion!");
                }
                java.io.RandomAccessFile randomAccessFile = this.WR;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.WR = new java.io.RandomAccessFile(this.eqN, "rw");
                java.lang.Object[] objArr2 = new java.lang.Object[3];
                this.eo.yDt();
                this.eo.Ta();
            } catch (java.lang.Throwable th) {
                th.getMessage();
            }
        }
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.bg.bg.bX
    public long bX() throws java.io.IOException {
        if (eqN()) {
            this.bg = this.eqN.length();
        } else {
            synchronized (this.IL) {
                int i = 0;
                while (this.bg == -2147483648L) {
                    i += 15;
                    try {
                        this.IL.wait(5L);
                        if (i > 20000) {
                            return -1L;
                        }
                    } catch (java.lang.InterruptedException unused) {
                        throw new java.io.IOException("total length InterruptException");
                    }
                }
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        java.lang.Long.valueOf(this.bg);
        return this.bg;
    }
}
