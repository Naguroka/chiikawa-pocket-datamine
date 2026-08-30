package com.bykv.vk.openvk.bg.bg.IL.IL;

/* JADX INFO: loaded from: classes3.dex */
abstract class bg implements com.bykv.vk.openvk.bg.bg.IL.IL.VB {
    private static final java.util.concurrent.atomic.AtomicLong Ta = new java.util.concurrent.atomic.AtomicLong();
    protected final com.bykv.vk.openvk.bg.bg.IL.IL.IL.bX IL;
    protected volatile java.lang.String Kg;
    protected volatile com.bykv.vk.openvk.bg.bg.IL.IL.WR WR;
    protected volatile com.bykv.vk.openvk.bg.bg.IL.IL.bg.bg bg;
    protected volatile com.bykv.vk.openvk.bg.bg.IL.IL.PX eo;
    protected volatile java.lang.String iR;
    protected volatile java.util.List<com.bykv.vk.openvk.bg.bg.IL.IL.WR.IL> ldr;
    protected com.bykv.vk.openvk.bg.bg.IL.IL.eqN.bg zx;
    protected final java.util.concurrent.atomic.AtomicInteger bX = new java.util.concurrent.atomic.AtomicInteger();
    protected final java.util.concurrent.atomic.AtomicLong eqN = new java.util.concurrent.atomic.AtomicLong();
    protected volatile boolean VB = false;
    public final long PX = Ta.incrementAndGet();
    private final java.util.concurrent.atomic.AtomicInteger yDt = new java.util.concurrent.atomic.AtomicInteger(0);
    private int Lq = -1;

    public bg(com.bykv.vk.openvk.bg.bg.IL.IL.bg.bg bgVar, com.bykv.vk.openvk.bg.bg.IL.IL.IL.bX bXVar) {
        this.bg = bgVar;
        this.IL = bXVar;
    }

    public void bg() {
        this.yDt.compareAndSet(0, 1);
    }

    public boolean IL() {
        return this.yDt.get() == 1;
    }

    protected void bX() {
        this.yDt.compareAndSet(0, 2);
    }

    public boolean eqN() {
        return this.yDt.get() == 2;
    }

    protected void zx() throws com.bykv.vk.openvk.bg.bg.IL.IL.bX.bg {
        if (IL()) {
            throw new com.bykv.vk.openvk.bg.bg.IL.IL.bX.bg();
        }
    }

    protected com.bykv.vk.openvk.bg.bg.IL.IL.zx.bg bg(com.bykv.vk.openvk.bg.bg.IL.IL.PX.bg bgVar, int i, int i2, java.lang.String str) throws java.io.IOException {
        com.bykv.vk.openvk.bg.bg.IL.IL.zx.IL IL = com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX.bg().IL();
        com.bykv.vk.openvk.bg.bg.IL.IL.zx.zx zxVar = new com.bykv.vk.openvk.bg.bg.IL.IL.zx.zx();
        java.util.HashMap map = new java.util.HashMap();
        zxVar.IL = bgVar.bg;
        zxVar.bg = 0;
        if ("HEAD".equalsIgnoreCase(str)) {
            zxVar.bg = 4;
        }
        java.util.List<com.bykv.vk.openvk.bg.bg.IL.IL.WR.IL> list = this.ldr;
        if (list != null && !list.isEmpty()) {
            for (com.bykv.vk.openvk.bg.bg.IL.IL.WR.IL il : list) {
                if (!com.google.common.net.HttpHeaders.RANGE.equalsIgnoreCase(il.bg) && !com.google.common.net.HttpHeaders.CONNECTION.equalsIgnoreCase(il.bg) && !"Proxy-Connection".equalsIgnoreCase(il.bg) && !com.google.common.net.HttpHeaders.HOST.equalsIgnoreCase(il.bg)) {
                    map.put(il.bg, il.IL);
                }
            }
        }
        java.lang.String strBg = com.bykv.vk.openvk.bg.bg.IL.bX.bg.bg(i, i2);
        if (strBg != null) {
            map.put(com.google.common.net.HttpHeaders.RANGE, strBg);
        }
        if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.ldr) {
            map.put(com.google.common.net.HttpHeaders.CACHE_CONTROL, "no-cache");
        }
        com.bykv.vk.openvk.bg.bg.IL.IL.eqN eqnBX = com.bykv.vk.openvk.bg.bg.IL.IL.eqN.bX();
        com.bykv.vk.openvk.bg.bg.IL.IL.ldr ldrVarBg = com.bykv.vk.openvk.bg.bg.IL.IL.ldr.bg();
        boolean z = this.WR == null;
        com.bykv.vk.openvk.bg.bg.IL.IL.bX bXVarBg = z ? eqnBX.bg() : ldrVarBg.IL();
        com.bykv.vk.openvk.bg.bg.IL.IL.bX bXVarIL = z ? eqnBX.IL() : ldrVarBg.bX();
        if ((bXVarBg != null || bXVarIL != null) && (bXVarBg != null || bXVarIL != null)) {
            throw null;
        }
        zxVar.zx = map;
        if (this.VB) {
            this.VB = false;
            return null;
        }
        return IL.bg(zxVar);
    }

    protected int ldr() {
        if (this.WR != null) {
            return this.WR.bX.bg;
        }
        return this.bg instanceof com.bykv.vk.openvk.bg.bg.IL.IL.bg.IL ? 1 : 0;
    }

    protected boolean iR() {
        return ldr() == 1;
    }

    protected void bg(int i, int i2) {
        if (i <= 0 || i2 < 0) {
            return;
        }
        int i3 = com.bykv.vk.openvk.bg.bg.IL.IL.zx.iR;
        int iLdr = ldr();
        if (i3 == 1 || (i3 == 2 && iLdr == 1)) {
            int i4 = (int) ((i2 / i) * 100.0f);
            if (i4 > 100) {
                i4 = 100;
            }
            synchronized (this) {
                if (i4 <= this.Lq) {
                    return;
                }
                this.Lq = i4;
                com.bykv.vk.openvk.bg.bg.IL.bX.bg.bg(new java.lang.Runnable() { // from class: com.bykv.vk.openvk.bg.bg.IL.IL.bg.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (com.bykv.vk.openvk.bg.bg.IL.IL.bg.this.zx != null) {
                            com.bykv.vk.openvk.bg.bg.IL.IL.PX px = com.bykv.vk.openvk.bg.bg.IL.IL.bg.this.eo;
                            int unused = com.bykv.vk.openvk.bg.bg.IL.IL.bg.this.Lq;
                        }
                    }
                });
            }
        }
    }
}
