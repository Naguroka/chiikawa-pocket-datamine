package com.bykv.vk.openvk.bg.bg.IL.eqN;

/* JADX INFO: loaded from: classes3.dex */
public class eqN implements com.bykv.vk.openvk.bg.bg.IL.eqN.bX.IL, com.bykv.vk.openvk.bg.bg.IL.eqN.bX.InterfaceC0069bX, com.bykv.vk.openvk.bg.bg.IL.eqN.bX.bg, com.bykv.vk.openvk.bg.bg.IL.eqN.bX.eqN, com.bykv.vk.openvk.bg.bg.IL.eqN.bX.iR, com.bykv.vk.openvk.bg.bg.IL.eqN.bX.ldr, com.bykv.vk.openvk.bg.bg.IL.eqN.bX.zx, com.bykv.vk.openvk.bg.bg.bg.bg, com.bytedance.sdk.component.utils.JAA.bg {
    private static final android.util.SparseIntArray kMt = new android.util.SparseIntArray();
    private boolean Fy;
    private android.view.SurfaceHolder IL;
    private boolean JAA;
    private java.util.ArrayList<java.lang.Runnable> LZ;
    private com.bytedance.sdk.component.utils.JAA Ta;
    private boolean WR;
    private volatile boolean ZQc;
    private android.graphics.SurfaceTexture bg;
    private boolean eo;
    private int eqN;
    private int bX = 0;
    private boolean zx = false;
    private volatile com.bykv.vk.openvk.bg.bg.IL.eqN.bX ldr = null;
    private final boolean iR = false;
    private boolean Kg = false;
    private volatile int VB = com.ironsource.g3.c.b.b;
    private long PX = -1;
    private boolean yDt = false;
    private long Lq = 0;
    private long vb = Long.MIN_VALUE;
    private long xxp = 0;
    private long VzQ = 0;
    private long tuV = 0;
    private int tC = 0;
    private java.lang.String rri = "0";
    private final java.util.List<java.lang.ref.WeakReference<com.bykv.vk.openvk.bg.bg.bg.bg.InterfaceC0070bg>> Ja = new java.util.concurrent.CopyOnWriteArrayList();
    private com.bykv.vk.openvk.bg.bg.bg.bX.bX Uw = null;
    private boolean DDQ = false;
    private java.util.concurrent.CountDownLatch Uq = new java.util.concurrent.CountDownLatch(1);
    private volatile int aGH = 200;
    private java.util.concurrent.atomic.AtomicBoolean VW = new java.util.concurrent.atomic.AtomicBoolean(false);
    private android.view.Surface VJ = null;
    private final java.lang.Runnable daV = new java.lang.Runnable() { // from class: com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.1
        @Override // java.lang.Runnable
        public void run() {
            if (com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.ldr == null) {
                return;
            }
            long jXxp = com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.xxp();
            if (jXxp > 0 && com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.ldr() && com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.vb != Long.MIN_VALUE) {
                try {
                    if (com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.vb == jXxp) {
                        if (!com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.yDt && com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.xxp >= 400) {
                            com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.IL(701, 800);
                            com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.yDt = true;
                        }
                        com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.xxp += (long) com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.aGH;
                    } else {
                        if (com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.yDt) {
                            com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.Lq += com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.xxp;
                            com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.IL(702, 800);
                            java.lang.Object[] objArr = new java.lang.Object[4];
                            java.lang.Long.valueOf(com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.Lq);
                            java.lang.Integer.valueOf(com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.bX);
                        }
                        com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.xxp = 0L;
                        com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.yDt = false;
                    }
                } catch (java.lang.Throwable th) {
                    th.getMessage();
                }
            }
            if (com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.vb() > 0) {
                if (com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.vb != jXxp) {
                    if (com.bykv.vk.openvk.bg.bg.bg.bX.zx()) {
                        java.lang.Object[] objArr2 = new java.lang.Object[4];
                        java.lang.Long.valueOf(com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.vb);
                        java.lang.Long.valueOf(jXxp);
                    }
                    com.bykv.vk.openvk.bg.bg.IL.eqN.eqN eqn = com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this;
                    eqn.bg(jXxp, eqn.vb());
                }
                com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.vb = jXxp;
            }
            if (!com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.IL()) {
                if (com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.Ta != null) {
                    com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.Ta.postDelayed(this, com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.aGH);
                }
            } else {
                com.bykv.vk.openvk.bg.bg.IL.eqN.eqN eqn2 = com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this;
                eqn2.bg(eqn2.vb(), com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.vb());
            }
        }
    };
    private final com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.bg ayS = new com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.bg();
    private long LKE = 0;
    private long CQc = 0;
    private boolean uu = false;

    private boolean bg(int i, int i2) {
        boolean z = i == -1010 || i == -1007 || i == -1004 || i == -110 || i == 100 || i == 200;
        if (i2 == 1 || i2 == 700 || i2 == 800) {
            return true;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(long j, long j2) {
        for (java.lang.ref.WeakReference<com.bykv.vk.openvk.bg.bg.bg.bg.InterfaceC0070bg> weakReference : this.Ja) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().bg(this, j, j2);
            }
        }
    }

    public eqN() {
        bg("SSMediaPlayerWrapper");
    }

    private void bg(java.lang.String str) {
        this.tC = 0;
        this.Ta = com.bytedance.sdk.component.Kg.bg.bg.bg().bg(this, com.bytedance.sdk.component.Kg.WR.THREAD_NAME_PRE.concat(java.lang.String.valueOf(str)));
        this.uu = true;
        LZ();
    }

    private void Fy() {
        this.Lq = 0L;
        this.bX = 0;
        this.xxp = 0L;
        this.yDt = false;
        this.vb = Long.MIN_VALUE;
    }

    public void bg(final boolean z) {
        if (Kg()) {
            return;
        }
        this.JAA = z;
        if (this.ldr != null) {
            this.ldr.bg(z);
            return;
        }
        com.bytedance.sdk.component.utils.JAA jaa = this.Ta;
        if (jaa != null) {
            jaa.post(new java.lang.Runnable() { // from class: com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.9
                @Override // java.lang.Runnable
                public void run() {
                    if (com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.ldr != null) {
                        com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.ldr.bg(z);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void LZ() {
        com.bytedance.sdk.component.utils.JAA jaa = this.Ta;
        if (jaa != null) {
            jaa.post(new java.lang.Runnable() { // from class: com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.10
                @Override // java.lang.Runnable
                public void run() {
                    if (com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.ldr == null) {
                        try {
                            com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.ldr = new com.bykv.vk.openvk.bg.bg.IL.eqN.IL();
                        } catch (java.lang.Throwable th) {
                            th.getMessage();
                        }
                        if (com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.ldr == null) {
                            return;
                        }
                        com.bykv.vk.openvk.bg.bg.IL.eqN.bX unused = com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.ldr;
                        com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.rri = "0";
                        com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.ldr.bg((com.bykv.vk.openvk.bg.bg.IL.eqN.bX.zx) com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this);
                        com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.ldr.bg((com.bykv.vk.openvk.bg.bg.IL.eqN.bX.IL) com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this);
                        com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.ldr.bg((com.bykv.vk.openvk.bg.bg.IL.eqN.bX.InterfaceC0069bX) com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this);
                        com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.ldr.bg((com.bykv.vk.openvk.bg.bg.IL.eqN.bX.bg) com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this);
                        com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.ldr.bg((com.bykv.vk.openvk.bg.bg.IL.eqN.bX.ldr) com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this);
                        com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.ldr.bg((com.bykv.vk.openvk.bg.bg.IL.eqN.bX.eqN) com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this);
                        com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.ldr.bg((com.bykv.vk.openvk.bg.bg.IL.eqN.bX.iR) com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this);
                        try {
                            com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.ldr.bX(false);
                        } catch (java.lang.Throwable unused2) {
                        }
                        com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.Kg = false;
                    }
                }
            });
        }
    }

    public void WR() {
        if (Kg() || this.ldr == null) {
            return;
        }
        this.VW.set(true);
        if (this.VB != 206) {
            Fy();
            this.ZQc = false;
            this.ayS.bg(true);
            IL(0L);
            com.bytedance.sdk.component.utils.JAA jaa = this.Ta;
            if (jaa != null) {
                jaa.removeCallbacks(this.daV);
                this.Ta.postDelayed(this.daV, this.aGH);
            }
        }
        this.Uq.countDown();
    }

    public void bg(boolean z, long j, boolean z2) {
        if (Kg()) {
            return;
        }
        LZ();
        this.DDQ = z2;
        this.VW.set(true);
        this.ZQc = false;
        IL(z2);
        if (z) {
            this.PX = j;
            tC();
        } else {
            IL(j);
        }
        com.bytedance.sdk.component.utils.JAA jaa = this.Ta;
        if (jaa != null) {
            jaa.removeCallbacks(this.daV);
            this.Ta.postDelayed(this.daV, this.aGH);
        }
        this.Uq.countDown();
    }

    private void IL(long j) {
        this.ayS.bg(j);
        if (this.JAA) {
            IL(this.ayS);
        } else if (IL(this.Uw)) {
            IL(this.ayS);
        } else {
            bg(this.ayS);
        }
    }

    private boolean IL(com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar) {
        return bXVar != null && bXVar.eqN();
    }

    public void eo() {
        if (Kg() || this.Ta == null) {
            return;
        }
        this.VW.set(true);
        this.Ta.post(new java.lang.Runnable() { // from class: com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.11
            @Override // java.lang.Runnable
            public void run() {
                if (!com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.iR() || com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.ldr == null) {
                    return;
                }
                try {
                    com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.ldr.zx();
                    for (java.lang.ref.WeakReference weakReference : com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.Ja) {
                        if (weakReference != null && weakReference.get() != null) {
                            ((com.bykv.vk.openvk.bg.bg.bg.bg.InterfaceC0070bg) weakReference.get()).zx(com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this);
                        }
                    }
                    com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.VB = com.ironsource.g3.c.b.g;
                } catch (java.lang.Throwable th) {
                    java.lang.Object[] objArr = new java.lang.Object[2];
                    th.getMessage();
                }
            }
        });
    }

    class bg implements java.lang.Runnable {
        private long IL;
        private boolean bX;

        bg() {
        }

        public void bg(boolean z) {
            this.bX = z;
        }

        public void bg(long j) {
            this.IL = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.ldr != null) {
                try {
                    if (!this.bX) {
                        long jWR = com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.ldr.WR();
                        com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.PX = java.lang.Math.max(this.IL, jWR);
                    }
                    long unused = com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.PX;
                } catch (java.lang.Throwable th) {
                    new java.lang.StringBuilder("[video] MediaPlayerProxy#start  error: getCurrentPosition :").append(th);
                }
            }
            if (com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.Ta != null) {
                com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.Ta.sendEmptyMessageDelayed(100, 0L);
            }
        }
    }

    public void VB() {
        com.bytedance.sdk.component.utils.JAA jaa;
        if (Kg() || (jaa = this.Ta) == null) {
            return;
        }
        jaa.removeMessages(100);
        this.ZQc = true;
        if (!this.uu) {
            if (this.Fy || IL(this.Uw)) {
                com.bytedance.sdk.component.utils.JAA jaa2 = this.Ta;
                if (jaa2 != null) {
                    jaa2.sendEmptyMessage(101);
                    return;
                }
                return;
            }
            bg(new java.lang.Runnable() { // from class: com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.12
                @Override // java.lang.Runnable
                public void run() {
                    if (com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.Ta != null) {
                        com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.Ta.sendEmptyMessage(101);
                    }
                }
            });
            return;
        }
        if (this.zx || IL(this.Uw)) {
            com.bytedance.sdk.component.utils.JAA jaa3 = this.Ta;
            if (jaa3 != null) {
                jaa3.sendEmptyMessage(101);
                return;
            }
            return;
        }
        bg(new java.lang.Runnable() { // from class: com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.13
            @Override // java.lang.Runnable
            public void run() {
                if (com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.Ta != null) {
                    com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.Ta.sendEmptyMessage(101);
                }
            }
        });
    }

    public void PX() {
        if (Kg()) {
            return;
        }
        this.eo = true;
        aGH();
        com.bytedance.sdk.component.utils.JAA jaa = this.Ta;
        if (jaa != null) {
            try {
                jaa.removeCallbacksAndMessages(null);
                if (this.ldr != null) {
                    this.Ta.sendEmptyMessage(103);
                }
                kMt();
            } catch (java.lang.Throwable unused) {
                kMt();
            }
        }
    }

    private void tC() {
        IL(new java.lang.Runnable() { // from class: com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.14
            @Override // java.lang.Runnable
            public void run() {
                if (com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.Ta != null) {
                    com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.Ta.sendEmptyMessage(104);
                }
            }
        });
    }

    public void bg(final long j) {
        if (Kg()) {
            return;
        }
        if (this.VB == 207 || this.VB == 206 || this.VB == 209) {
            IL(new java.lang.Runnable() { // from class: com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.2
                @Override // java.lang.Runnable
                public void run() {
                    if (com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.Ta != null) {
                        com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.Ta.obtainMessage(106, java.lang.Long.valueOf(j)).sendToTarget();
                    }
                }
            });
        }
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.bg
    public boolean bg() {
        return this.zx;
    }

    public void bg(final android.graphics.SurfaceTexture surfaceTexture) {
        if (Kg()) {
            return;
        }
        this.bg = surfaceTexture;
        bg(true);
        IL(new java.lang.Runnable() { // from class: com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.3
            @Override // java.lang.Runnable
            public void run() {
                com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.LZ();
                if (com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.Ta != null) {
                    com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.Ta.obtainMessage(111, surfaceTexture).sendToTarget();
                }
            }
        });
    }

    public void bg(final android.view.SurfaceHolder surfaceHolder) {
        if (Kg()) {
            return;
        }
        this.IL = surfaceHolder;
        bg(true);
        IL(new java.lang.Runnable() { // from class: com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.4
            @Override // java.lang.Runnable
            public void run() {
                com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.LZ();
                if (com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.Ta != null) {
                    com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.Ta.obtainMessage(110, surfaceHolder).sendToTarget();
                }
            }
        });
    }

    public void bg(final com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar) {
        if (Kg()) {
            return;
        }
        this.Uw = bXVar;
        if (bXVar != null) {
            this.uu = this.uu && !bXVar.eqN();
        }
        IL(new java.lang.Runnable() { // from class: com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.5
            @Override // java.lang.Runnable
            public void run() {
                com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.LZ();
                if (com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.Ta != null) {
                    com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.Ta.obtainMessage(107, bXVar).sendToTarget();
                }
            }
        });
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.bg
    public boolean ldr() {
        com.bytedance.sdk.component.utils.JAA jaa;
        return (this.VB == 206 || ((jaa = this.Ta) != null && jaa.hasMessages(100))) && !this.ZQc;
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.bg
    public boolean bX() {
        return Ta() || ldr() || iR();
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.bg
    public boolean iR() {
        com.bytedance.sdk.component.utils.JAA jaa;
        return ((this.VB != 207 && !this.ZQc) || (jaa = this.Ta) == null || jaa.hasMessages(100)) ? false : true;
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.bg
    public boolean Kg() {
        return this.eo;
    }

    public boolean Ta() {
        return this.VB == 205;
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.bg
    public boolean IL() {
        return this.VB == 209;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:51:0x0105  */
    /* JADX WARN: Code duplicated, block: B:99:0x01cc  */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0021. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.component.utils.JAA.bg
    public void bg(android.os.Message message) {
        java.lang.Object obj;
        android.os.Message message2 = message;
        int i = this.VB;
        int i2 = message2.what;
        if (this.ldr != null) {
            try {
                try {
                    switch (message2.what) {
                        case 100:
                            message2 = null;
                            if (this.VB == 205 || this.VB == 207 || this.VB == 209) {
                                this.ldr.zx();
                                this.tuV = android.os.SystemClock.elapsedRealtime();
                                this.VB = com.ironsource.g3.c.b.g;
                                if (this.PX > 0) {
                                    this.ldr.bg(this.PX, this.eqN);
                                    this.PX = -1L;
                                }
                                if (this.Uw != null) {
                                    IL(this.DDQ);
                                }
                                obj = message2;
                            } else {
                                obj = 1;
                            }
                            break;
                        case 101:
                            if (this.yDt) {
                                this.Lq += this.xxp;
                            }
                            this.yDt = false;
                            this.xxp = 0L;
                            this.vb = Long.MIN_VALUE;
                            if (this.VB == 206 || this.VB == 207 || this.VB == 209) {
                                this.ldr.iR();
                                this.VB = 207;
                                message2 = null;
                                this.ZQc = false;
                                for (java.lang.ref.WeakReference<com.bykv.vk.openvk.bg.bg.bg.bg.InterfaceC0070bg> weakReference : this.Ja) {
                                    if (weakReference != null && weakReference.get() != null) {
                                        weakReference.get().eqN(this);
                                    }
                                }
                                obj = message2;
                            } else {
                                obj = 1;
                            }
                            break;
                        case 102:
                            this.ldr.PX();
                            this.VB = com.ironsource.g3.c.b.b;
                            message2 = null;
                            obj = message2;
                            break;
                        case 103:
                            try {
                                rri();
                                break;
                            } catch (java.lang.Throwable unused) {
                            }
                            for (java.lang.ref.WeakReference<com.bykv.vk.openvk.bg.bg.bg.bg.InterfaceC0070bg> weakReference2 : this.Ja) {
                                if (weakReference2 != null && weakReference2.get() != null) {
                                    weakReference2.get().bX(this);
                                }
                            }
                            this.VB = com.ironsource.g3.c.b.d;
                            message2 = null;
                            obj = message2;
                            break;
                        case 104:
                            if (this.VB == 202 || this.VB == 208) {
                                this.ldr.Kg();
                                message2 = null;
                                obj = message2;
                            } else {
                                obj = 1;
                            }
                            break;
                        case 105:
                            if (this.VB == 205 || this.VB == 206 || this.VB == 208 || this.VB == 207 || this.VB == 209) {
                                this.ldr.ldr();
                                this.VB = 208;
                                message2 = null;
                                obj = message2;
                            } else {
                                obj = 1;
                            }
                            break;
                        case 106:
                            if (this.VB == 206 || this.VB == 207 || this.VB == 209) {
                                this.ldr.bg(((java.lang.Long) message2.obj).longValue(), this.eqN);
                                message2 = null;
                                obj = message2;
                            } else {
                                obj = 1;
                            }
                            break;
                        case 107:
                            Fy();
                            if (this.VB == 201 || this.VB == 203) {
                                com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar = (com.bykv.vk.openvk.bg.bg.bg.bX.bX) message2.obj;
                                if (android.text.TextUtils.isEmpty(bXVar.IL())) {
                                    bXVar.bg(com.bykv.vk.openvk.bg.bg.bg.bX.IL());
                                }
                                java.io.File file = new java.io.File(bXVar.IL(), bXVar.yDt());
                                if (file.exists()) {
                                    file.getAbsolutePath();
                                    if (com.bykv.vk.openvk.bg.bg.bg.bX.bX()) {
                                        IL(file.getAbsolutePath());
                                    } else {
                                        this.ldr.bg(file.getAbsolutePath());
                                    }
                                } else {
                                    bXVar.Ta();
                                    int i3 = bXVar.IL;
                                    this.ldr.bg(bXVar);
                                    bXVar.Ta();
                                }
                                this.VB = com.ironsource.g3.c.b.c;
                                message2 = null;
                                obj = message2;
                            } else {
                                obj = 1;
                            }
                            break;
                        case 108:
                        case 109:
                        default:
                            message2 = null;
                            obj = message2;
                            break;
                        case 110:
                            this.ldr.bg((android.view.SurfaceHolder) message2.obj);
                            this.ldr.IL(true);
                            this.Uq.await(1L, java.util.concurrent.TimeUnit.SECONDS);
                            Uq();
                            message2 = null;
                            obj = message2;
                            break;
                        case 111:
                            this.VJ = new android.view.Surface((android.graphics.SurfaceTexture) message2.obj);
                            this.ldr.bg(this.VJ);
                            this.ldr.IL(true);
                            this.Uq.await(1L, java.util.concurrent.TimeUnit.SECONDS);
                            Uq();
                            message2 = null;
                            obj = message2;
                            break;
                    }
                } catch (java.lang.Throwable unused2) {
                }
            } catch (java.lang.Throwable unused3) {
            }
        } else {
            message2 = null;
            obj = message2;
        }
        if (obj != 0) {
            this.VB = 200;
            if (this.Kg) {
                return;
            }
            com.bykv.vk.openvk.bg.bg.bg.bX.bg bgVar = new com.bykv.vk.openvk.bg.bg.bg.bX.bg(308, i2);
            bgVar.bg(i + "," + i2);
            for (java.lang.ref.WeakReference<com.bykv.vk.openvk.bg.bg.bg.bg.InterfaceC0070bg> weakReference3 : this.Ja) {
                if (weakReference3 != null && weakReference3.get() != null) {
                    weakReference3.get().bg(this, bgVar);
                }
            }
            this.Kg = true;
        }
    }

    private void IL(java.lang.String str) throws java.lang.Throwable {
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(str);
        this.ldr.bg(fileInputStream.getFD());
        fileInputStream.close();
    }

    private void rri() {
        if (this.ldr == null) {
            return;
        }
        try {
            this.ldr.PX();
        } catch (java.lang.Throwable unused) {
        }
        this.ldr.bg((com.bykv.vk.openvk.bg.bg.IL.eqN.bX.IL) null);
        this.ldr.bg((com.bykv.vk.openvk.bg.bg.IL.eqN.bX.iR) null);
        this.ldr.bg((com.bykv.vk.openvk.bg.bg.IL.eqN.bX.bg) null);
        this.ldr.bg((com.bykv.vk.openvk.bg.bg.IL.eqN.bX.eqN) null);
        this.ldr.bg((com.bykv.vk.openvk.bg.bg.IL.eqN.bX.InterfaceC0069bX) null);
        this.ldr.bg((com.bykv.vk.openvk.bg.bg.IL.eqN.bX.zx) null);
        this.ldr.bg((com.bykv.vk.openvk.bg.bg.IL.eqN.bX.ldr) null);
        try {
            this.ldr.VB();
        } catch (java.lang.Throwable unused2) {
        }
    }

    private void kMt() {
        com.bytedance.sdk.component.utils.JAA jaa = this.Ta;
        if (jaa == null || jaa.getLooper() == null) {
            return;
        }
        this.Ta.post(new java.lang.Runnable() { // from class: com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.6
            @Override // java.lang.Runnable
            public void run() {
                if (com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.Ta == null || com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.Ta.getLooper() == null) {
                    return;
                }
                try {
                    com.bytedance.sdk.component.Kg.bg.bg.bg().bg(com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.Ta);
                    com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.Ta = null;
                } catch (java.lang.Throwable unused) {
                }
            }
        });
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.eqN.bX.bg
    public void bg(com.bykv.vk.openvk.bg.bg.IL.eqN.bX bXVar, int i) {
        if (this.ldr != bXVar) {
            return;
        }
        for (java.lang.ref.WeakReference<com.bykv.vk.openvk.bg.bg.bg.bg.InterfaceC0070bg> weakReference : this.Ja) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().IL(this, i);
            }
        }
    }

    private void JAA() {
        android.util.SparseIntArray sparseIntArray = kMt;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(sparseIntArray.get(this.tC));
        if (numValueOf == null) {
            sparseIntArray.put(this.tC, 1);
        } else {
            sparseIntArray.put(this.tC, numValueOf.intValue() + 1);
        }
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.eqN.bX.IL
    public void bg(com.bykv.vk.openvk.bg.bg.IL.eqN.bX bXVar) {
        this.VB = 209;
        kMt.delete(this.tC);
        com.bytedance.sdk.component.utils.JAA jaa = this.Ta;
        if (jaa != null) {
            jaa.removeCallbacks(this.daV);
        }
        for (java.lang.ref.WeakReference<com.bykv.vk.openvk.bg.bg.bg.bg.InterfaceC0070bg> weakReference : this.Ja) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().bg(this);
            }
        }
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.eqN.bX.InterfaceC0069bX
    public boolean bg(com.bykv.vk.openvk.bg.bg.IL.eqN.bX bXVar, int i, int i2) {
        JAA();
        this.VB = 200;
        com.bytedance.sdk.component.utils.JAA jaa = this.Ta;
        if (jaa != null) {
            jaa.removeCallbacks(this.daV);
        }
        if (bg(i, i2)) {
            kMt();
        }
        if (!this.VW.get()) {
            return true;
        }
        this.VW.set(false);
        com.bykv.vk.openvk.bg.bg.bg.bX.bg bgVar = new com.bykv.vk.openvk.bg.bg.bg.bX.bg(i, i2);
        for (java.lang.ref.WeakReference<com.bykv.vk.openvk.bg.bg.bg.bg.InterfaceC0070bg> weakReference : this.Ja) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().bg(this, bgVar);
            }
        }
        return true;
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.eqN.bX.eqN
    public boolean IL(com.bykv.vk.openvk.bg.bg.IL.eqN.bX bXVar, int i, int i2) {
        if (this.ldr != bXVar) {
            return false;
        }
        if (i2 == -1004) {
            com.bykv.vk.openvk.bg.bg.bg.bX.bg bgVar = new com.bykv.vk.openvk.bg.bg.bg.bX.bg(i, i2);
            for (java.lang.ref.WeakReference<com.bykv.vk.openvk.bg.bg.bg.bg.InterfaceC0070bg> weakReference : this.Ja) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().bg(this, bgVar);
                }
            }
        }
        IL(i, i2);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IL(int i, int i2) {
        if (i == 701) {
            this.LKE = android.os.SystemClock.elapsedRealtime();
            this.bX++;
            for (java.lang.ref.WeakReference<com.bykv.vk.openvk.bg.bg.bg.bg.InterfaceC0070bg> weakReference : this.Ja) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().bg(this, Integer.MAX_VALUE, 0, 0);
                }
            }
            java.lang.Object[] objArr = new java.lang.Object[2];
            java.lang.Integer.valueOf(this.bX);
            return;
        }
        if (i == 702) {
            if (this.LKE > 0) {
                this.CQc += android.os.SystemClock.elapsedRealtime() - this.LKE;
                this.LKE = 0L;
            }
            for (java.lang.ref.WeakReference<com.bykv.vk.openvk.bg.bg.bg.bg.InterfaceC0070bg> weakReference2 : this.Ja) {
                if (weakReference2 != null && weakReference2.get() != null) {
                    weakReference2.get().bg((com.bykv.vk.openvk.bg.bg.bg.bg) this, Integer.MAX_VALUE);
                }
            }
            java.lang.Object[] objArr2 = new java.lang.Object[4];
            java.lang.Integer.valueOf(this.bX);
            java.lang.Long.valueOf(this.CQc);
            return;
        }
        if (this.uu && i == 3) {
            Uq();
            Ja();
            IL(this.DDQ);
        }
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.eqN.bX.zx
    public void IL(com.bykv.vk.openvk.bg.bg.IL.eqN.bX bXVar) {
        if (Kg()) {
            return;
        }
        this.VB = com.ironsource.g3.c.b.f;
        try {
            com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar2 = this.Uw;
            if (bXVar2 != null) {
                float fPX = bXVar2.PX();
                if (fPX > 0.0f) {
                    com.bykv.vk.openvk.bg.bg.bg.IL il = new com.bykv.vk.openvk.bg.bg.bg.IL();
                    il.bg(fPX);
                    this.ldr.bg(il);
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        if (this.Ta != null) {
            if (this.ZQc) {
                Uw();
            } else {
                com.bytedance.sdk.component.utils.JAA jaa = this.Ta;
                jaa.sendMessage(jaa.obtainMessage(100, -1, -1));
            }
        }
        kMt.delete(this.tC);
        boolean z = this.uu;
        boolean z2 = this.Fy;
        if (!z && !z2) {
            Ja();
            this.Fy = true;
        }
        for (java.lang.ref.WeakReference<com.bykv.vk.openvk.bg.bg.bg.bg.InterfaceC0070bg> weakReference : this.Ja) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().IL(this);
            }
        }
    }

    private void Ja() {
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.tuV;
        for (java.lang.ref.WeakReference<com.bykv.vk.openvk.bg.bg.bg.bg.InterfaceC0070bg> weakReference : this.Ja) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().bg(this, jElapsedRealtime);
            }
        }
        this.zx = true;
    }

    private void Uw() {
        com.bytedance.sdk.component.utils.JAA jaa = this.Ta;
        if (jaa != null) {
            jaa.post(new java.lang.Runnable() { // from class: com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.7
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.ldr.iR();
                        com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.VB = 207;
                        com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.ZQc = false;
                    } catch (java.lang.Throwable unused) {
                    }
                }
            });
        }
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.eqN.bX.ldr
    public void bX(com.bykv.vk.openvk.bg.bg.IL.eqN.bX bXVar) {
        for (java.lang.ref.WeakReference<com.bykv.vk.openvk.bg.bg.bg.bg.InterfaceC0070bg> weakReference : this.Ja) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().bg((com.bykv.vk.openvk.bg.bg.bg.bg) this, true);
            }
        }
    }

    private void bg(java.lang.Runnable runnable) {
        try {
            if (this.LZ == null) {
                this.LZ = new java.util.ArrayList<>();
            }
            this.LZ.add(runnable);
        } catch (java.lang.Throwable th) {
            th.getMessage();
        }
    }

    private void DDQ() {
        if (this.WR) {
            return;
        }
        this.WR = true;
        java.util.Iterator it = new java.util.ArrayList(this.LZ).iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
        this.LZ.clear();
        this.WR = false;
    }

    private void Uq() {
        java.util.ArrayList<java.lang.Runnable> arrayList = this.LZ;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        DDQ();
    }

    private void aGH() {
        java.util.ArrayList<java.lang.Runnable> arrayList = this.LZ;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        this.LZ.clear();
    }

    private void IL(java.lang.Runnable runnable) {
        if (runnable == null || Kg()) {
            return;
        }
        if (!this.eo) {
            runnable.run();
        } else {
            bg(runnable);
        }
    }

    public void IL(final boolean z) {
        com.bytedance.sdk.component.utils.JAA jaa;
        if (Kg() || (jaa = this.Ta) == null) {
            return;
        }
        jaa.post(new java.lang.Runnable() { // from class: com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.8
            @Override // java.lang.Runnable
            public void run() {
                if (com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.Kg() || com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.ldr == null) {
                    return;
                }
                try {
                    com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.DDQ = z;
                    com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.this.ldr.eqN(z);
                } catch (java.lang.Throwable unused) {
                }
            }
        });
    }

    public long yDt() {
        if (this.yDt) {
            long j = this.xxp;
            if (j > 0) {
                return this.Lq + j;
            }
        }
        return this.Lq;
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.bg
    public int eqN() {
        if (this.ldr == null || Kg()) {
            return 0;
        }
        return this.ldr.Ta();
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.bg
    public int zx() {
        if (this.ldr == null || Kg()) {
            return 0;
        }
        return this.ldr.yDt();
    }

    public int Lq() {
        return this.bX;
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.eqN.bX.iR
    public void bg(com.bykv.vk.openvk.bg.bg.IL.eqN.bX bXVar, int i, int i2, int i3, int i4) {
        for (java.lang.ref.WeakReference<com.bykv.vk.openvk.bg.bg.bg.bg.InterfaceC0070bg> weakReference : this.Ja) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().bg((com.bykv.vk.openvk.bg.bg.bg.bg) this, i, i2);
            }
        }
    }

    public long vb() {
        long j = this.VzQ;
        if (j != 0) {
            return j;
        }
        if (this.VB == 206 || this.VB == 207) {
            try {
                this.VzQ = this.ldr.eo();
            } catch (java.lang.Throwable unused) {
            }
        }
        return this.VzQ;
    }

    public long xxp() {
        if (Kg()) {
            return 0L;
        }
        if (this.VB == 206 || this.VB == 207) {
            try {
                return this.ldr.WR();
            } catch (java.lang.Throwable unused) {
            }
        }
        return 0L;
    }

    public void bg(com.bykv.vk.openvk.bg.bg.bg.bg.InterfaceC0070bg interfaceC0070bg) {
        if (interfaceC0070bg == null) {
            return;
        }
        for (java.lang.ref.WeakReference<com.bykv.vk.openvk.bg.bg.bg.bg.InterfaceC0070bg> weakReference : this.Ja) {
            if (weakReference != null && weakReference.get() == interfaceC0070bg) {
                return;
            }
        }
        this.Ja.add(new java.lang.ref.WeakReference<>(interfaceC0070bg));
    }

    public void bg(int i) {
        if (Kg()) {
            return;
        }
        this.aGH = i;
    }

    public android.view.SurfaceHolder VzQ() {
        return this.IL;
    }

    public android.graphics.SurfaceTexture tuV() {
        return this.bg;
    }

    public void IL(int i) {
        this.eqN = i;
    }
}
