package com.bytedance.sdk.component.adexpress.IL;

/* JADX INFO: loaded from: classes3.dex */
public class xxp implements com.bytedance.sdk.component.adexpress.IL.eo {
    private com.bytedance.sdk.component.adexpress.zx.bg IL;
    private com.bytedance.sdk.component.adexpress.IL.Kg bX;
    private android.content.Context bg;
    private com.bytedance.sdk.component.adexpress.IL.Ta eqN;
    private java.util.concurrent.atomic.AtomicBoolean ldr = new java.util.concurrent.atomic.AtomicBoolean(false);
    private java.util.concurrent.ScheduledFuture<?> zx;

    public xxp(android.content.Context context, com.bytedance.sdk.component.adexpress.IL.Ta ta, com.bytedance.sdk.component.adexpress.zx.bg bgVar, com.bytedance.sdk.component.adexpress.IL.Kg kg) {
        this.bg = context;
        this.eqN = ta;
        this.bX = kg;
        this.IL = bgVar;
        bgVar.bg(this.bX);
    }

    @Override // com.bytedance.sdk.component.adexpress.IL.eo
    public boolean bg(final com.bytedance.sdk.component.adexpress.IL.eo.bg bgVar) {
        int iLdr = this.eqN.ldr();
        if (iLdr < 0) {
            bg(bgVar, 107, "time is ".concat(java.lang.String.valueOf(iLdr)));
        } else {
            this.zx = com.bytedance.sdk.component.adexpress.eqN.eqN.bg(new com.bytedance.sdk.component.adexpress.IL.xxp.bg(1, bgVar), iLdr, java.util.concurrent.TimeUnit.MILLISECONDS);
            this.IL.bg(new com.bytedance.sdk.component.adexpress.IL.iR() { // from class: com.bytedance.sdk.component.adexpress.IL.xxp.1
                @Override // com.bytedance.sdk.component.adexpress.IL.iR
                public void bg(android.view.View view, com.bytedance.sdk.component.adexpress.IL.yDt ydt) {
                    com.bytedance.sdk.component.adexpress.IL.Lq lqIL;
                    com.bytedance.sdk.component.adexpress.IL.xxp.this.bX();
                    if (bgVar.bX() || (lqIL = bgVar.IL()) == null) {
                        return;
                    }
                    lqIL.bg(com.bytedance.sdk.component.adexpress.IL.xxp.this.IL, ydt);
                    bgVar.bg(true);
                }

                @Override // com.bytedance.sdk.component.adexpress.IL.iR
                public void bg(int i, java.lang.String str) {
                    com.bytedance.sdk.component.adexpress.IL.xxp.this.bg(bgVar, i, str);
                }
            });
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.IL.eo
    public void bg() {
        this.IL.eqN();
        bX();
    }

    public com.bytedance.sdk.component.adexpress.zx.bg IL() {
        return this.IL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bX() {
        try {
            java.util.concurrent.ScheduledFuture<?> scheduledFuture = this.zx;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.zx.cancel(false);
            this.zx = null;
        } catch (java.lang.Throwable unused) {
        }
    }

    private class bg implements java.lang.Runnable {
        private int bX;
        com.bytedance.sdk.component.adexpress.IL.eo.bg bg;

        public bg(int i, com.bytedance.sdk.component.adexpress.IL.eo.bg bgVar) {
            this.bX = i;
            this.bg = bgVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.bX == 1) {
                com.bytedance.sdk.component.adexpress.IL.xxp.this.IL.bg(true);
                com.bytedance.sdk.component.adexpress.IL.xxp.this.bg(this.bg, 107, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(com.bytedance.sdk.component.adexpress.IL.eo.bg bgVar, int i, java.lang.String str) {
        com.bytedance.sdk.component.adexpress.IL.Lq lqIL;
        if (bgVar.bX() || this.ldr.get()) {
            return;
        }
        bX();
        this.eqN.zx().bg(i, str);
        if (bgVar.IL(this)) {
            bgVar.bg(this);
        } else {
            if (bgVar.bX() || (lqIL = bgVar.IL()) == null) {
                return;
            }
            bgVar.bg(true);
            lqIL.a_(i);
        }
        this.ldr.getAndSet(true);
    }
}
