package com.bytedance.sdk.component.ldr.bg.IL;

/* JADX INFO: loaded from: classes3.dex */
public class eqN {
    private final java.util.concurrent.PriorityBlockingQueue<com.bytedance.sdk.component.ldr.bg.eqN.bg> PX;
    private final java.util.Comparator<com.bytedance.sdk.component.ldr.bg.eqN.bg> VB;
    private volatile com.bytedance.sdk.component.ldr.bg.IL.bX.bX WR;
    private volatile android.os.Handler eo;
    public static final com.bytedance.sdk.component.ldr.bg.IL.eqN bg = new com.bytedance.sdk.component.ldr.bg.IL.eqN();
    public static final com.bytedance.sdk.component.ldr.bg.IL.bg.bg eqN = new com.bytedance.sdk.component.ldr.bg.IL.bg.bg();
    public static final java.util.concurrent.atomic.AtomicLong zx = new java.util.concurrent.atomic.AtomicLong(0);
    public static final java.util.concurrent.atomic.AtomicLong ldr = new java.util.concurrent.atomic.AtomicLong(0);
    public static final long iR = java.lang.System.currentTimeMillis();
    public static long Kg = 0;
    public volatile boolean IL = false;
    public volatile boolean bX = false;

    public java.util.concurrent.PriorityBlockingQueue<com.bytedance.sdk.component.ldr.bg.eqN.bg> bg() {
        return this.PX;
    }

    private eqN() {
        java.util.Comparator<com.bytedance.sdk.component.ldr.bg.eqN.bg> comparator = new java.util.Comparator<com.bytedance.sdk.component.ldr.bg.eqN.bg>() { // from class: com.bytedance.sdk.component.ldr.bg.IL.eqN.1
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
            public int compare(com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar, com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar2) {
                return com.bytedance.sdk.component.ldr.bg.IL.eqN.this.bg(bgVar, bgVar2);
            }
        };
        this.VB = comparator;
        this.PX = new java.util.concurrent.PriorityBlockingQueue<>(8, comparator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int bg(com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar, com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar2) {
        long jBg;
        long jIL;
        long jIL2;
        long jBg2;
        if (bgVar == null) {
            return bgVar2 == null ? 0 : -1;
        }
        if (bgVar2 == null) {
            return 1;
        }
        if (bgVar.zx() == bgVar2.zx()) {
            if (bgVar.bg() != null) {
                jBg = bgVar.bg().bg();
                jIL = bgVar.bg().IL();
            } else {
                jBg = 0;
                jIL = 0;
            }
            if (bgVar2.bg() != null) {
                jBg2 = bgVar2.bg().bg();
                jIL2 = bgVar2.bg().IL();
            } else {
                jIL2 = 0;
                jBg2 = 0;
            }
            if (jBg == 0 || jBg2 == 0) {
                return 0;
            }
            long j = jBg - jBg2;
            if (java.lang.Math.abs(j) > 2147483647L) {
                return 0;
            }
            if (j != 0) {
                return (int) j;
            }
            if (jIL == 0 || jIL2 == 0) {
                return 0;
            }
            return (int) (jIL - jIL2);
        }
        return bgVar.zx() - bgVar2.zx();
    }

    public void IL() {
        eqN();
        zx();
    }

    public void bg(android.os.Handler handler) {
        this.eo = handler;
    }

    public void bX() {
        if (this.WR == null || !this.WR.isAlive()) {
            return;
        }
        synchronized (this) {
            if (this.WR != null && this.WR.isAlive()) {
                if (this.eo != null) {
                    this.eo.removeCallbacksAndMessages(null);
                }
                this.WR.bg(false);
                this.WR.quitSafely();
                this.WR = null;
            }
        }
    }

    public boolean eqN() {
        try {
            if (this.WR != null || com.bytedance.sdk.component.ldr.bg.IL.IL()) {
                return false;
            }
            synchronized (this) {
                if (this.WR != null) {
                    return false;
                }
                this.WR = new com.bytedance.sdk.component.ldr.bg.IL.bX.bX(this.PX);
                this.WR.start();
                return true;
            }
        } catch (java.lang.Throwable th) {
            th.getMessage();
            return false;
        }
    }

    public void bg(com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar, int i) {
        eqN();
        com.bytedance.sdk.component.ldr.bg.zx zxVarVb = com.bytedance.sdk.component.ldr.bg.Kg.iR().vb();
        com.bytedance.sdk.component.ldr.bg.IL.bX.bX bXVar = this.WR;
        if (bXVar != null) {
            bg(zxVarVb, bgVar);
            bXVar.bg(bgVar, bgVar.zx() == 4);
        }
    }

    private void bg(final com.bytedance.sdk.component.ldr.bg.zx zxVar, com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar) {
        if (zxVar != null) {
            try {
                if (zxVar.iR()) {
                    final long jIL = (bgVar == null || bgVar.bg() == null) ? 0L : bgVar.bg().IL();
                    if (jIL == 1) {
                        Kg = java.lang.System.currentTimeMillis();
                    }
                    java.util.concurrent.atomic.AtomicLong atomicLongLd = eqN.Ld();
                    com.bytedance.sdk.component.ldr.bg.bX.IL.bg(atomicLongLd, 1);
                    if (atomicLongLd.get() == 200) {
                        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
                            java.util.concurrent.Executor executorEqN = zxVar.eqN();
                            if (executorEqN == null) {
                                executorEqN = zxVar.zx();
                            }
                            if (executorEqN != null) {
                                executorEqN.execute(new com.bytedance.sdk.component.ldr.bg.zx.zx("report") { // from class: com.bytedance.sdk.component.ldr.bg.IL.eqN.2
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        com.bytedance.sdk.component.ldr.bg.IL.eqN.this.bg(zxVar, jIL);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        bg(zxVar, jIL);
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(com.bytedance.sdk.component.ldr.bg.zx zxVar, long j) {
        com.bytedance.sdk.component.ldr.bg.IL.bX.bX bXVar = this.WR;
        if (zxVar == null || bXVar == null) {
            return;
        }
        com.bytedance.sdk.component.ldr.bg.IL.bg.bg bgVar = eqN;
        bXVar.bg(zxVar.bg(bgVar.IL(j)), true);
        bgVar.jz();
    }

    public void zx() {
        com.bytedance.sdk.component.ldr.bg.bX.IL.bg(eqN.ayS(), 1);
        final com.bytedance.sdk.component.ldr.bg.IL.bX.bX bXVar = this.WR;
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            if (bXVar != null) {
                bXVar.bX(2);
                return;
            }
            return;
        }
        com.bytedance.sdk.component.ldr.bg.zx zxVarVb = com.bytedance.sdk.component.ldr.bg.Kg.iR().vb();
        if (zxVarVb != null) {
            java.util.concurrent.Executor executorEqN = zxVarVb.eqN();
            if (executorEqN == null) {
                executorEqN = zxVarVb.zx();
            }
            if (executorEqN != null) {
                executorEqN.execute(new com.bytedance.sdk.component.ldr.bg.zx.zx("flush") { // from class: com.bytedance.sdk.component.ldr.bg.IL.eqN.3
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.component.ldr.bg.IL.bX.bX bXVar2 = bXVar;
                        if (bXVar2 != null) {
                            bXVar2.bX(2);
                        }
                    }
                });
            }
        }
    }
}
