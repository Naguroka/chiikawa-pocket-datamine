package com.bykv.vk.openvk.bg.bg.IL.bg.IL;

/* JADX INFO: loaded from: classes3.dex */
public class IL {
    private com.bykv.vk.openvk.bg.bg.bg.bX.bX IL;
    private android.content.Context bg;
    private java.io.File eqN;
    private java.io.File zx;
    private volatile boolean bX = false;
    private final java.util.List<com.bykv.vk.openvk.bg.bg.bg.zx.bg.InterfaceC0072bg> ldr = new java.util.ArrayList();
    private volatile boolean iR = false;

    public IL(android.content.Context context, com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar) {
        this.eqN = null;
        this.zx = null;
        this.bg = context;
        this.IL = bXVar;
        this.eqN = com.bykv.vk.openvk.bg.bg.IL.zx.IL.IL(bXVar.IL(), bXVar.yDt());
        this.zx = com.bykv.vk.openvk.bg.bg.IL.zx.IL.bX(bXVar.IL(), bXVar.yDt());
    }

    public void bg(com.bykv.vk.openvk.bg.bg.bg.zx.bg.InterfaceC0072bg interfaceC0072bg) {
        if (this.iR) {
            synchronized (com.bykv.vk.openvk.bg.bg.bg.zx.bg.InterfaceC0072bg.class) {
                this.ldr.add(interfaceC0072bg);
            }
            return;
        }
        this.ldr.add(interfaceC0072bg);
        if (IL()) {
            this.IL.iR(1);
            bg(this.IL, 200);
            com.bykv.vk.openvk.bg.bg.IL.bg.IL.bX.bg(this.IL);
        } else {
            this.iR = true;
            this.IL.iR(0);
            bX();
        }
    }

    private boolean IL() {
        if (this.zx.exists()) {
            return true;
        }
        if (!this.IL.eo()) {
            if (this.eqN.length() >= this.IL.bX()) {
                return true;
            }
            if (this.IL.bg() > 0 && this.eqN.length() >= this.IL.bg()) {
                return true;
            }
        }
        return false;
    }

    private void bX() {
        com.bytedance.sdk.component.IL.bg.VB.bg bgVar;
        if (com.bykv.vk.openvk.bg.bg.bg.bX.eqN() != null) {
            bgVar = com.bykv.vk.openvk.bg.bg.bg.bX.eqN().IL();
        } else {
            bgVar = new com.bytedance.sdk.component.IL.bg.VB.bg("v_preload");
        }
        bgVar.bg(this.IL.vb(), java.util.concurrent.TimeUnit.MILLISECONDS).IL(this.IL.xxp(), java.util.concurrent.TimeUnit.MILLISECONDS).bX(this.IL.VzQ(), java.util.concurrent.TimeUnit.MILLISECONDS);
        com.bytedance.sdk.component.IL.bg.VB vbBg = bgVar.bg();
        com.bytedance.sdk.component.IL.bg.Ta.bg bgVar2 = new com.bytedance.sdk.component.IL.bg.Ta.bg();
        final long length = this.eqN.length();
        int iBX = this.IL.bX();
        boolean zEo = this.IL.eo();
        int iBg = this.IL.bg();
        if (iBg > 0) {
            if (iBg >= this.IL.WR()) {
                zEo = true;
            } else {
                iBX = iBg;
            }
        }
        bgVar2.bg("videoPreload").bg(6);
        if (zEo) {
            bgVar2.bg("RANGE", "bytes=" + length + "-").IL(this.IL.Ta()).bg().IL();
        } else {
            bgVar2.bg("RANGE", "bytes=" + length + "-" + iBX).IL(this.IL.Ta()).bg().IL();
        }
        vbBg.bg(bgVar2.IL()).bg(new com.bytedance.sdk.component.IL.bg.bX() { // from class: com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL.1
            @Override // com.bytedance.sdk.component.IL.bg.bX
            public void bg(com.bytedance.sdk.component.IL.bg.IL il, java.io.IOException iOException) {
                com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL il2 = com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL.this;
                il2.bg(il2.IL, 601, iOException.getMessage());
                com.bykv.vk.openvk.bg.bg.IL.bg.IL.bX.bg(com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL.this.IL);
            }

            /* JADX WARN: Code duplicated, block: B:72:0x017e A[Catch: all -> 0x0199, TryCatch #3 {all -> 0x0199, blocks: (B:70:0x0171, B:72:0x017e, B:73:0x0182), top: B:83:0x0171 }] */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r14v0 */
            /* JADX WARN: Type inference failed for: r14v1 */
            /* JADX WARN: Type inference failed for: r14v2 */
            /* JADX WARN: Type inference failed for: r14v3 */
            /* JADX WARN: Type inference failed for: r14v4 */
            /* JADX WARN: Type inference failed for: r14v5, types: [java.io.Closeable, java.io.RandomAccessFile] */
            /* JADX WARN: Type inference failed for: r14v6, types: [java.io.Closeable] */
            /* JADX WARN: Type inference failed for: r14v7 */
            /* JADX WARN: Type inference failed for: r14v8 */
            /* JADX WARN: Type inference failed for: r14v9 */
            /* JADX WARN: Type inference failed for: r7v10 */
            /* JADX WARN: Type inference failed for: r7v12, types: [java.io.Closeable] */
            /* JADX WARN: Type inference failed for: r7v13 */
            /* JADX WARN: Type inference failed for: r7v14 */
            /* JADX WARN: Type inference failed for: r7v16 */
            /* JADX WARN: Type inference failed for: r7v17 */
            /* JADX WARN: Type inference failed for: r7v3 */
            /* JADX WARN: Type inference failed for: r7v6 */
            @Override // com.bytedance.sdk.component.IL.bg.bX
            public void bg(com.bytedance.sdk.component.IL.bg.IL il, com.bytedance.sdk.component.IL.bg.Lq lq) throws java.io.IOException {
                java.io.InputStream inputStreamBX;
                ?? r14;
                int iBX2;
                com.bytedance.sdk.component.IL.bg.xxp xxpVarLdr;
                ?? randomAccessFile;
                long jBg;
                ?? r15;
                long j = length;
                int i = 4;
                com.bytedance.sdk.component.IL.bg.xxp xxpVar = null;
                ?? r7 = 0;
                xxpVar = null;
                 = 0;
                ?? r8 = 0;
                if (lq != null) {
                    try {
                        boolean zEqN = lq.eqN();
                        if (zEqN) {
                            xxpVarLdr = lq.ldr();
                            try {
                                xxpVarLdr = lq.ldr();
                                if (!zEqN || xxpVarLdr == null) {
                                    inputStreamBX = null;
                                    jBg = 0;
                                } else {
                                    jBg = length + xxpVarLdr.bg();
                                    inputStreamBX = xxpVarLdr.bX();
                                }
                                try {
                                    if (inputStreamBX == null) {
                                        com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL il2 = com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL.this;
                                        il2.bg(il2.IL, lq.bX(), lq.zx());
                                        com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL.this.bg((java.io.Closeable) null);
                                    } else {
                                        randomAccessFile = new java.io.RandomAccessFile(com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL.this.eqN, "rw");
                                        try {
                                            byte[] bArr = new byte[8192];
                                            long j2 = 0;
                                            int i2 = 0;
                                            while (true) {
                                                int i3 = inputStreamBX.read(bArr, i2, 8192 - i2);
                                                if (i3 == -1) {
                                                    if (com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL.this.IL.eo() && jBg == com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL.this.eqN.length()) {
                                                        com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL.this.zx();
                                                    }
                                                    com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL il3 = com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL.this;
                                                    il3.bg(il3.IL, lq.bX());
                                                    r7 = randomAccessFile;
                                                    com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL.this.bg((java.io.Closeable) r7);
                                                    com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL.this.bg(inputStreamBX);
                                                    com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL.this.bg(xxpVarLdr);
                                                    com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL.this.bg(lq);
                                                    java.lang.Object[] objArr = new java.lang.Object[4];
                                                } else if (com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL.this.bX) {
                                                    com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL il4 = com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL.this;
                                                    il4.IL(il4.IL, lq.bX());
                                                    com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL.this.bg((java.io.Closeable) randomAccessFile);
                                                    r8 = i3;
                                                } else {
                                                    i2 += i3;
                                                    j2 += (long) i3;
                                                    if (j2 % 8192 == 0 || j2 == jBg - length) {
                                                        com.bykv.vk.openvk.bg.bg.IL.zx.IL.bg(randomAccessFile, bArr, java.lang.Long.valueOf(j).intValue(), i2, com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL.this.IL.yDt());
                                                        j += (long) i2;
                                                        i2 = 0;
                                                    }
                                                    i = 4;
                                                }
                                            }
                                        } catch (java.lang.Throwable th) {
                                            th = th;
                                            xxpVar = xxpVarLdr;
                                            r14 = randomAccessFile;
                                            iBX2 = 601;
                                            r15 = r14;
                                            try {
                                                com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL.this.eqN();
                                                com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL il5 = com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL.this;
                                                com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar = il5.IL;
                                                if (lq != null) {
                                                    iBX2 = lq.bX();
                                                }
                                                il5.bg(bXVar, iBX2, th.getMessage());
                                                com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL.this.bg((java.io.Closeable) r15);
                                                com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL.this.bg(inputStreamBX);
                                                com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL.this.bg(xxpVar);
                                            } finally {
                                                com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL.this.bg((java.io.Closeable) r15);
                                                com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL.this.bg(inputStreamBX);
                                                com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL.this.bg(xxpVar);
                                                com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL.this.bg(lq);
                                                java.lang.Object[] objArr2 = new java.lang.Object[4];
                                                com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL.this.IL.Ta();
                                                java.lang.Integer.valueOf(com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL.this.IL.bX());
                                                com.bykv.vk.openvk.bg.bg.IL.bg.IL.bX.bg(com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL.this.IL);
                                            }
                                        }
                                    }
                                    com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL.this.bg(inputStreamBX);
                                    com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL.this.bg(xxpVarLdr);
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                    randomAccessFile = r8;
                                }
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                                inputStreamBX = null;
                                randomAccessFile = 0;
                            }
                        } else {
                            com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL il6 = com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL.this;
                            il6.bg(il6.IL, lq.bX(), lq.zx());
                            com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL.this.bg((java.io.Closeable) null);
                            com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL.this.bg((java.io.Closeable) null);
                            com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL.this.bg((java.io.Closeable) null);
                        }
                        com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL.this.bg(lq);
                        java.lang.Object[] objArr3 = new java.lang.Object[i];
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        inputStreamBX = null;
                        r14 = 0;
                    }
                } else {
                    try {
                        com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL il7 = com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL.this;
                        iBX2 = 601;
                        try {
                            il7.bg(il7.IL, 601, "Network link failed.");
                            xxpVarLdr = null;
                            inputStreamBX = null;
                            com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL.this.bg((java.io.Closeable) r7);
                            com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL.this.bg(inputStreamBX);
                            com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL.this.bg(xxpVarLdr);
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                            inputStreamBX = null;
                            r15 = 0;
                            com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL.this.eqN();
                            com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL il8 = com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL.this;
                            com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar2 = il8.IL;
                            if (lq != null) {
                                iBX2 = lq.bX();
                            }
                            il8.bg(bXVar2, iBX2, th.getMessage());
                            com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL.this.bg((java.io.Closeable) r15);
                            com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL.this.bg(inputStreamBX);
                            com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL.this.bg(xxpVar);
                        }
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        iBX2 = 601;
                    }
                    com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL.this.bg(lq);
                    java.lang.Object[] objArr4 = new java.lang.Object[4];
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public com.bykv.vk.openvk.bg.bg.bg.bX.bX bg() {
        return this.IL;
    }

    public void bg(boolean z) {
        this.bX = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar, int i) {
        synchronized (com.bykv.vk.openvk.bg.bg.bg.zx.bg.InterfaceC0072bg.class) {
            for (com.bykv.vk.openvk.bg.bg.bg.zx.bg.InterfaceC0072bg interfaceC0072bg : this.ldr) {
                if (interfaceC0072bg != null) {
                    interfaceC0072bg.bg(bXVar, i);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar, int i, java.lang.String str) {
        synchronized (com.bykv.vk.openvk.bg.bg.bg.zx.bg.InterfaceC0072bg.class) {
            for (com.bykv.vk.openvk.bg.bg.bg.zx.bg.InterfaceC0072bg interfaceC0072bg : this.ldr) {
                if (interfaceC0072bg != null) {
                    interfaceC0072bg.bg(bXVar, i, str);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IL(com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar, int i) {
        synchronized (com.bykv.vk.openvk.bg.bg.bg.zx.bg.InterfaceC0072bg.class) {
            for (com.bykv.vk.openvk.bg.bg.bg.zx.bg.InterfaceC0072bg interfaceC0072bg : this.ldr) {
                if (interfaceC0072bg != null) {
                    interfaceC0072bg.IL(bXVar, i);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void eqN() {
        try {
            this.zx.delete();
            this.eqN.delete();
        } catch (java.lang.Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zx() {
        try {
            if (this.eqN.renameTo(this.zx)) {
            } else {
                throw new java.io.IOException("Error renaming file " + this.eqN + " to " + this.zx + " for completion!");
            }
        } catch (java.lang.Throwable th) {
            th.getMessage();
        }
    }
}
