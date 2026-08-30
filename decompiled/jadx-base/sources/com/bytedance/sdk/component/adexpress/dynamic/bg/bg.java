package com.bytedance.sdk.component.adexpress.dynamic.bg;

/* JADX INFO: loaded from: classes3.dex */
public class bg implements com.bytedance.sdk.component.adexpress.IL.VB, com.bytedance.sdk.component.adexpress.IL.eqN<com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView> {
    private com.bytedance.sdk.component.adexpress.dynamic.zx.Kg IL;
    private java.util.concurrent.atomic.AtomicBoolean Kg = new java.util.concurrent.atomic.AtomicBoolean(false);
    private android.content.Context bX;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView bg;
    private com.bytedance.sdk.component.adexpress.IL.iR eqN;
    private java.util.concurrent.ScheduledFuture<?> iR;
    private com.bytedance.sdk.component.adexpress.IL.Ta ldr;
    private com.bytedance.sdk.component.adexpress.IL.Kg zx;

    public bg(android.content.Context context, com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z, com.bytedance.sdk.component.adexpress.dynamic.zx.Kg kg, com.bytedance.sdk.component.adexpress.IL.Ta ta, com.bytedance.sdk.component.adexpress.dynamic.ldr.bg bgVar) {
        this.bX = context;
        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView dynamicRootView = new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView(context, themeStatusBroadcastReceiver, z, ta, bgVar);
        this.bg = dynamicRootView;
        this.IL = kg;
        this.ldr = ta;
        dynamicRootView.setRenderListener(this);
        this.ldr = ta;
    }

    @Override // com.bytedance.sdk.component.adexpress.IL.eqN
    public void bg(com.bytedance.sdk.component.adexpress.IL.iR iRVar) {
        this.eqN = iRVar;
        int iLdr = this.ldr.ldr();
        if (iLdr < 0) {
            this.bg.callBackRenderFail(this.IL instanceof com.bytedance.sdk.component.adexpress.dynamic.zx.iR ? 127 : 117, "time is ".concat(java.lang.String.valueOf(iLdr)));
            return;
        }
        this.iR = com.bytedance.sdk.component.adexpress.eqN.eqN.bg(new com.bytedance.sdk.component.adexpress.dynamic.bg.bg.RunnableC0105bg(2), iLdr, java.util.concurrent.TimeUnit.MILLISECONDS);
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper() && this.ldr.WR() <= 0) {
            ldr();
        } else {
            com.bytedance.sdk.component.utils.iR.IL().postDelayed(new java.lang.Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.bg.bg.1
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.component.adexpress.dynamic.bg.bg.this.ldr();
                }
            }, this.ldr.WR());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ldr() {
        this.ldr.zx().IL(bX());
        org.json.JSONObject jSONObjectBX = this.ldr.bX();
        if (!com.bytedance.sdk.component.adexpress.bg.IL.IL.bg(jSONObjectBX)) {
            this.bg.callBackRenderFail(this.IL instanceof com.bytedance.sdk.component.adexpress.dynamic.zx.iR ? 123 : 113, "data null is " + (jSONObjectBX == null));
        } else {
            this.IL.bg(new com.bytedance.sdk.component.adexpress.dynamic.ldr.IL() { // from class: com.bytedance.sdk.component.adexpress.dynamic.bg.bg.2
                @Override // com.bytedance.sdk.component.adexpress.dynamic.ldr.IL
                public void bg(final com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg) {
                    com.bytedance.sdk.component.adexpress.dynamic.bg.bg.this.Kg();
                    com.bytedance.sdk.component.adexpress.dynamic.bg.bg.this.ldr.zx().bX(com.bytedance.sdk.component.adexpress.dynamic.bg.bg.this.bX());
                    com.bytedance.sdk.component.adexpress.dynamic.bg.bg.this.bg(kg);
                    com.bytedance.sdk.component.adexpress.dynamic.bg.bg.this.IL(kg);
                    if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
                        com.bytedance.sdk.component.adexpress.dynamic.bg.bg.this.bX(kg);
                    } else {
                        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.bg.bg.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                com.bytedance.sdk.component.adexpress.dynamic.bg.bg.this.bX(kg);
                            }
                        });
                    }
                    if (com.bytedance.sdk.component.adexpress.dynamic.bg.bg.this.bg == null || kg == null) {
                        return;
                    }
                    com.bytedance.sdk.component.adexpress.dynamic.bg.bg.this.bg.setBgColor(kg.bg());
                    com.bytedance.sdk.component.adexpress.dynamic.bg.bg.this.bg.setBgMaterialCenterCalcColor(kg.IL());
                }
            });
            this.IL.bg(this.ldr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg) {
        java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg> listVB;
        if (kg == null || (listVB = kg.VB()) == null || listVB.size() <= 0) {
            return;
        }
        java.util.Collections.sort(listVB, new java.util.Comparator<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg>() { // from class: com.bytedance.sdk.component.adexpress.dynamic.bg.bg.3
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
            public int compare(com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg2, com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg3) {
                com.bytedance.sdk.component.adexpress.dynamic.eqN.ldr ldrVarZx = kg2.eo().zx();
                com.bytedance.sdk.component.adexpress.dynamic.eqN.ldr ldrVarZx2 = kg3.eo().zx();
                if (ldrVarZx == null || ldrVarZx2 == null) {
                    return 0;
                }
                return ldrVarZx.jf() >= ldrVarZx2.jf() ? 1 : -1;
            }
        });
        for (com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg2 : listVB) {
            if (kg2 != null) {
                bg(kg2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IL(com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg) {
        float fIR;
        float fLdr;
        java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg> listVB;
        if (kg == null) {
            return;
        }
        java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg> listVB2 = kg.VB();
        if (listVB2 == null || listVB2.size() <= 0) {
            fIR = 0.0f;
        } else {
            fIR = 0.0f;
            for (com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg2 : listVB2) {
                if (kg2.iR() > kg.iR() - kg2.WR() || (listVB = kg2.VB()) == null || listVB.size() <= 0) {
                    fLdr = 0.0f;
                } else {
                    fLdr = 0.0f;
                    for (com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg3 : listVB) {
                        if (kg3.eo().IL().equals("logo-union")) {
                            fLdr = kg3.eo().ldr();
                            fIR = (((-fLdr) + kg.iR()) - kg2.iR()) + kg2.eo().zx().rgo();
                        }
                    }
                }
                IL(kg2);
                if (fLdr <= -15.0f) {
                    kg2.ldr(kg2.WR() - fLdr);
                    kg2.eqN(kg2.iR() + fLdr);
                    for (com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg4 : kg2.VB()) {
                        kg4.eqN(kg4.iR() - fLdr);
                    }
                }
            }
        }
        com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kgPX = kg.PX();
        if (kgPX == null) {
            return;
        }
        float fLdr2 = kg.ldr() - kgPX.ldr();
        float fIR2 = kg.iR() - kgPX.iR();
        kg.bX(fLdr2);
        kg.eqN(fIR2);
        if (fIR > 0.0f) {
            kg.eqN(kg.iR() - fIR);
            kg.ldr(kg.WR() + fIR);
            for (com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg5 : kg.VB()) {
                kg5.eqN(kg5.iR() + fIR);
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.IL.eqN
    /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView zx() {
        return eqN();
    }

    public void IL() {
        bg(zx());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void bg(android.view.View view) {
        if (view == 0) {
            return;
        }
        if (view instanceof android.view.ViewGroup) {
            int i = 0;
            while (true) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                if (i >= viewGroup.getChildCount()) {
                    break;
                }
                bg(viewGroup.getChildAt(i));
                i++;
            }
        }
        if (view instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ZQc) {
            ((com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ZQc) view).IL();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.IL.eqN
    public int bX() {
        return this.IL instanceof com.bytedance.sdk.component.adexpress.dynamic.zx.iR ? 3 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bX(com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg) {
        if (kg == null) {
            this.bg.callBackRenderFail(this.IL instanceof com.bytedance.sdk.component.adexpress.dynamic.zx.iR ? 123 : 113, "layoutUnit is null");
            return;
        }
        this.ldr.zx().eqN(bX());
        try {
            this.bg.render(kg, bX());
        } catch (java.lang.Exception e) {
            this.bg.callBackRenderFail(this.IL instanceof com.bytedance.sdk.component.adexpress.dynamic.zx.iR ? 128 : 118, "exception is " + e.getMessage());
        }
    }

    public com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView eqN() {
        return this.bg;
    }

    public void bg(com.bytedance.sdk.component.adexpress.IL.Kg kg) {
        this.zx = kg;
    }

    private boolean iR() {
        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView dynamicRootView = this.bg;
        return (dynamicRootView == null || dynamicRootView.getChildCount() == 0) ? false : true;
    }

    @Override // com.bytedance.sdk.component.adexpress.IL.VB
    public void bg(com.bytedance.sdk.component.adexpress.IL.yDt ydt) {
        if (this.Kg.get()) {
            return;
        }
        this.Kg.set(true);
        if (ydt.bX() && iR()) {
            this.bg.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            this.eqN.bg(zx(), ydt);
            return;
        }
        this.eqN.bg(ydt.VB(), ydt.eo());
    }

    @Override // com.bytedance.sdk.component.adexpress.IL.VB
    public void bg(android.view.View view, int i, com.bytedance.sdk.component.adexpress.bX bXVar) {
        com.bytedance.sdk.component.adexpress.IL.Kg kg = this.zx;
        if (kg != null) {
            kg.bg(view, i, bXVar);
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.bg.bg$bg, reason: collision with other inner class name */
    private class RunnableC0105bg implements java.lang.Runnable {
        private int IL;

        public RunnableC0105bg(int i) {
            this.IL = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.IL == 2) {
                com.bytedance.sdk.component.adexpress.dynamic.bg.bg.this.bg.callBackRenderFail(com.bytedance.sdk.component.adexpress.dynamic.bg.bg.this.IL instanceof com.bytedance.sdk.component.adexpress.dynamic.zx.iR ? 127 : 117, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Kg() {
        try {
            java.util.concurrent.ScheduledFuture<?> scheduledFuture = this.iR;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.iR.cancel(false);
            this.iR = null;
        } catch (java.lang.Throwable unused) {
        }
    }
}
