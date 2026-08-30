package com.bytedance.sdk.component.adexpress.bg.IL;

/* JADX INFO: loaded from: classes3.dex */
public class zx extends com.bytedance.sdk.component.adexpress.bg.IL.bX {
    private static volatile com.bytedance.sdk.component.adexpress.bg.IL.zx IL;
    private static java.io.File bg;
    private java.util.concurrent.atomic.AtomicBoolean bX = new java.util.concurrent.atomic.AtomicBoolean(true);
    private java.util.concurrent.atomic.AtomicBoolean eqN = new java.util.concurrent.atomic.AtomicBoolean(false);
    private boolean zx = false;
    private java.util.concurrent.atomic.AtomicBoolean ldr = new java.util.concurrent.atomic.AtomicBoolean(false);
    private java.util.concurrent.atomic.AtomicInteger iR = new java.util.concurrent.atomic.AtomicInteger(0);
    private java.util.concurrent.atomic.AtomicLong Kg = new java.util.concurrent.atomic.AtomicLong();

    public static com.bytedance.sdk.component.adexpress.bg.IL.zx IL() {
        if (IL == null) {
            synchronized (com.bytedance.sdk.component.adexpress.bg.IL.zx.class) {
                if (IL == null) {
                    IL = new com.bytedance.sdk.component.adexpress.bg.IL.zx();
                }
            }
        }
        return IL;
    }

    private zx() {
        eo();
    }

    public void bX() {
        eo();
    }

    private void eo() {
        com.bytedance.sdk.component.adexpress.eqN.eqN.IL(new com.bytedance.sdk.component.Kg.Kg(com.ironsource.y8.a.f) { // from class: com.bytedance.sdk.component.adexpress.bg.IL.zx.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.adexpress.bg.IL.Kg.bg();
                com.bytedance.sdk.component.adexpress.bg.IL.zx.this.bX.set(false);
                com.bytedance.sdk.component.adexpress.bg.IL.zx.this.eqN();
                com.bytedance.sdk.component.adexpress.bg.IL.zx.this.iR();
                if (com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().bX() == null || !com.bytedance.sdk.component.utils.VzQ.bg(com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().bX().IL())) {
                    return;
                }
                com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().bX().bX().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.component.adexpress.bg.IL.zx.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().bX() != null) {
                            com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().bX().eqN();
                        }
                    }
                });
            }
        }, 10);
    }

    public void eqN() {
        com.bytedance.sdk.component.adexpress.bg.bX.bg bgVarIL = com.bytedance.sdk.component.adexpress.bg.IL.Kg.IL();
        if (bgVarIL == null || !bgVarIL.iR()) {
            return;
        }
        boolean zBg = bg(bgVarIL);
        if (!zBg) {
            com.bytedance.sdk.component.adexpress.bg.IL.Kg.eqN();
        }
        this.zx = zBg;
    }

    public boolean bg(com.bytedance.sdk.component.adexpress.bg.bX.bg bgVar) {
        if (bgVar == null) {
            return false;
        }
        return bg(bgVar.bg()) || bg(bgVar.zx()) || bg(bgVar.ldr());
    }

    public boolean zx() {
        return this.zx;
    }

    public com.bytedance.sdk.component.adexpress.bg.bX.bg ldr() {
        return com.bytedance.sdk.component.adexpress.bg.IL.Kg.IL();
    }

    @Override // com.bytedance.sdk.component.adexpress.bg.IL.bX
    public java.io.File bg() {
        return Kg();
    }

    public void iR() {
        bg(false);
    }

    public void bg(boolean z) {
        java.util.List<com.bytedance.sdk.component.adexpress.bg.bX.bg.C0104bg> listBg;
        boolean z2;
        if (this.bX.get()) {
            return;
        }
        try {
            if (this.eqN.get()) {
                if (z) {
                    this.iR.getAndIncrement();
                    return;
                }
                return;
            }
            boolean z3 = true;
            this.eqN.set(true);
            com.bytedance.sdk.component.adexpress.bg.bX.bg bgVarZx = com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().bX().zx();
            com.bytedance.sdk.component.adexpress.bg.bX.bg bgVarIL = com.bytedance.sdk.component.adexpress.bg.IL.Kg.IL();
            if (bgVarZx != null && bgVarZx.iR()) {
                if (!com.bytedance.sdk.component.adexpress.bg.IL.Kg.IL(bgVarZx)) {
                    this.eqN.set(false);
                    this.Kg.set(java.lang.System.currentTimeMillis());
                    return;
                }
                if (com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().bX() != null) {
                    com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().bX().bX().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.component.adexpress.bg.IL.zx.2
                        @Override // java.lang.Runnable
                        public void run() {
                            com.bytedance.sdk.component.adexpress.zx.zx.bg().IL();
                        }
                    });
                }
                com.bytedance.sdk.component.adexpress.bg.IL.Kg.bg(bgVarZx);
                boolean zBg = (bgVarZx.zx() == null || android.text.TextUtils.isEmpty(bgVarZx.zx().bg())) ? false : bg(bgVarZx.zx().bg());
                if (bgVarZx.bg().size() != 0) {
                    listBg = bg(bgVarZx, bgVarIL);
                    z2 = listBg != null;
                } else {
                    listBg = null;
                    z2 = zBg;
                }
                if (!zBg) {
                    java.util.List<com.bytedance.sdk.component.adexpress.bg.bX.bg.C0104bg> listIL = IL(bgVarZx, bgVarIL);
                    if (listBg == null || listIL == null) {
                        listBg = listIL;
                    } else {
                        listBg.addAll(listIL);
                    }
                    if (listIL == null) {
                        z3 = false;
                    }
                    if (listIL == null) {
                        this.eqN.set(false);
                    }
                    z2 = z3;
                }
                if (z2 && bg(bgVarZx)) {
                    com.bytedance.sdk.component.adexpress.bg.IL.Kg.bg(bgVarZx);
                    com.bytedance.sdk.component.adexpress.bg.IL.Kg.bX();
                    IL(listBg);
                }
                eqN();
                this.eqN.set(false);
                this.Kg.set(java.lang.System.currentTimeMillis());
                VB();
                return;
            }
            this.eqN.set(false);
            bg(109);
        } catch (java.lang.Throwable unused) {
        }
    }

    private void VB() {
        if (this.iR.getAndSet(0) <= 0 || java.lang.System.currentTimeMillis() - this.Kg.get() <= com.bytedance.sdk.openadsdk.TTAdConstant.AD_MAX_EVENT_TIME) {
            return;
        }
        iR();
    }

    public static java.io.File Kg() {
        if (bg == null) {
            try {
                java.io.File file = new java.io.File(new java.io.File(com.bytedance.sdk.component.adexpress.bg.IL.eqN.bg(), "tt_tmpl_pkg"), "template");
                file.mkdirs();
                bg = file;
            } catch (java.lang.Throwable th) {
                com.bytedance.sdk.component.utils.PX.bg("TemplateManager", "getTemplateDir error", th);
            }
        }
        return bg;
    }

    public void IL(boolean z) {
        this.ldr.set(z);
    }

    public void WR() {
        this.ldr.set(true);
        this.zx = false;
        this.eqN.set(false);
    }
}
