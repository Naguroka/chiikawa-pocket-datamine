package com.bytedance.sdk.openadsdk.core.VB.IL;

/* JADX INFO: loaded from: classes4.dex */
public class zx implements com.bytedance.sdk.component.adexpress.IL.eo {
    private com.bytedance.sdk.openadsdk.core.VB.eqN.bX IL;
    private com.bytedance.sdk.component.adexpress.IL.Ta bX;
    private android.content.Context bg;
    private java.util.concurrent.ScheduledFuture<?> eqN;
    private java.util.concurrent.atomic.AtomicBoolean zx = new java.util.concurrent.atomic.AtomicBoolean(false);

    @Override // com.bytedance.sdk.component.adexpress.IL.eo
    public void bg() {
    }

    public zx(android.content.Context context, com.bytedance.sdk.openadsdk.core.VB.eqN.bX bXVar, com.bytedance.sdk.component.adexpress.IL.Kg kg, com.bytedance.sdk.component.adexpress.IL.Ta ta) {
        this.bg = context;
        this.IL = bXVar;
        this.bX = ta;
        this.IL.bg(kg);
    }

    @Override // com.bytedance.sdk.component.adexpress.IL.eo
    public boolean bg(final com.bytedance.sdk.component.adexpress.IL.eo.bg bgVar) {
        int iLdr = this.bX.ldr();
        if (iLdr < 0) {
            bg(bgVar, org.objectweb.asm.Opcodes.L2F, "time is ".concat(java.lang.String.valueOf(iLdr)));
        } else {
            this.eqN = com.bytedance.sdk.openadsdk.utils.VJ.bg().schedule(new com.bytedance.sdk.openadsdk.core.VB.IL.zx.bg(1, bgVar), iLdr, java.util.concurrent.TimeUnit.MILLISECONDS);
            this.IL.bg(new com.bytedance.sdk.component.adexpress.IL.iR() { // from class: com.bytedance.sdk.openadsdk.core.VB.IL.zx.1
                @Override // com.bytedance.sdk.component.adexpress.IL.iR
                public void bg(android.view.View view, com.bytedance.sdk.component.adexpress.IL.yDt ydt) {
                    com.bytedance.sdk.openadsdk.core.VB.IL.zx.this.IL();
                    if (bgVar.bX()) {
                        return;
                    }
                    com.bytedance.adsdk.ugeno.core.yDt ydt2 = new com.bytedance.adsdk.ugeno.core.yDt();
                    ydt2.bg(0);
                    ((com.bytedance.sdk.openadsdk.core.VB.eqN.bg) com.bytedance.sdk.openadsdk.core.VB.IL.zx.this.bX).Uq().bg(ydt2);
                    com.bytedance.sdk.openadsdk.core.VB.IL.zx.this.bX.zx().eo();
                    com.bytedance.sdk.component.adexpress.IL.Lq lqIL = bgVar.IL();
                    if (lqIL == null) {
                        return;
                    }
                    lqIL.bg(com.bytedance.sdk.openadsdk.core.VB.IL.zx.this.IL, ydt);
                    bgVar.bg(true);
                }

                @Override // com.bytedance.sdk.component.adexpress.IL.iR
                public void bg(int i, java.lang.String str) {
                    com.bytedance.sdk.openadsdk.core.VB.IL.zx.this.bg(bgVar, i, str);
                }
            });
        }
        return true;
    }

    private class bg implements java.lang.Runnable {
        private int bX;
        com.bytedance.sdk.component.adexpress.IL.eo.bg bg;

        bg(int i, com.bytedance.sdk.component.adexpress.IL.eo.bg bgVar) {
            this.bX = i;
            this.bg = bgVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.bX == 1) {
                com.bytedance.sdk.openadsdk.core.VB.IL.zx.this.IL.bg(true);
                com.bytedance.sdk.openadsdk.core.VB.IL.zx.this.bg(this.bg, org.objectweb.asm.Opcodes.L2F, "real time out" + com.bytedance.sdk.openadsdk.core.VB.IL.zx.this.bX.ldr());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(com.bytedance.sdk.component.adexpress.IL.eo.bg bgVar, int i, java.lang.String str) {
        com.bytedance.sdk.component.adexpress.IL.Lq lqIL;
        if (bgVar.bX() || this.zx.get()) {
            return;
        }
        IL();
        com.bytedance.adsdk.ugeno.core.yDt ydt = new com.bytedance.adsdk.ugeno.core.yDt();
        ydt.bg(i);
        ydt.bg(str);
        ((com.bytedance.sdk.openadsdk.core.VB.eqN.bg) this.bX).Uq().bg(ydt);
        if (bgVar.IL(this)) {
            bgVar.bg(this);
        } else {
            if (bgVar.bX() || (lqIL = bgVar.IL()) == null) {
                return;
            }
            bgVar.bg(true);
            lqIL.a_(i);
        }
        this.zx.getAndSet(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IL() {
        try {
            java.util.concurrent.ScheduledFuture<?> scheduledFuture = this.eqN;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.eqN.cancel(false);
            this.eqN = null;
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("RenderInterceptor", "remove ugen time out task fail", th.getMessage());
        }
    }
}
