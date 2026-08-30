package com.bytedance.sdk.openadsdk.tuV.bg;

/* JADX INFO: loaded from: classes4.dex */
public class eqN {
    private static volatile com.bytedance.sdk.openadsdk.tuV.bg.eqN IL;
    private final android.os.Handler bg;
    private int bX = 0;
    private int eqN = 2;
    private int zx = com.adjust.sdk.Constants.ONE_HOUR;
    private final java.util.ArrayList<com.bytedance.sdk.openadsdk.tuV.bg.IL> ldr = new java.util.ArrayList<>();

    public static com.bytedance.sdk.openadsdk.tuV.bg.eqN bg() {
        if (IL == null) {
            synchronized (com.bytedance.sdk.openadsdk.tuV.bg.eqN.class) {
                if (IL == null) {
                    IL = new com.bytedance.sdk.openadsdk.tuV.bg.eqN();
                }
            }
        }
        return IL;
    }

    private eqN() {
        com.bytedance.sdk.openadsdk.utils.VJ.IL(new com.bytedance.sdk.component.Kg.Kg("pag_pre_render_init") { // from class: com.bytedance.sdk.openadsdk.tuV.bg.eqN.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.tuV.bg.eqN.this.bX = com.bytedance.sdk.openadsdk.Fy.bg.bg("plb_pre_render_enable", 0);
                com.bytedance.sdk.openadsdk.tuV.bg.eqN.this.eqN = com.bytedance.sdk.openadsdk.Fy.bg.bg("plb_pre_render_max_count", 2);
                if (com.bytedance.sdk.openadsdk.tuV.bg.eqN.this.eqN <= 0 || com.bytedance.sdk.openadsdk.tuV.bg.eqN.this.eqN > 4) {
                    com.bytedance.sdk.openadsdk.tuV.bg.eqN.this.eqN = 2;
                }
                com.bytedance.sdk.openadsdk.tuV.bg.eqN.this.zx = com.bytedance.sdk.openadsdk.Fy.bg.bg("plb_pre_render_alive_time", com.adjust.sdk.Constants.ONE_HOUR);
                if (com.bytedance.sdk.openadsdk.tuV.bg.eqN.this.zx <= 0 || com.bytedance.sdk.openadsdk.tuV.bg.eqN.this.zx > 3600000) {
                    com.bytedance.sdk.openadsdk.tuV.bg.eqN.this.zx = com.adjust.sdk.Constants.ONE_HOUR;
                }
            }
        });
        this.bg = new android.os.Handler(android.os.Looper.getMainLooper(), new android.os.Handler.Callback() { // from class: com.bytedance.sdk.openadsdk.tuV.bg.eqN.2
            @Override // android.os.Handler.Callback
            public boolean handleMessage(android.os.Message message) {
                if (!(message.obj instanceof com.bytedance.sdk.openadsdk.tuV.bg.IL)) {
                    return false;
                }
                com.bytedance.sdk.openadsdk.tuV.bg.eqN.this.ldr.remove(message.obj);
                ((com.bytedance.sdk.openadsdk.tuV.bg.IL) message.obj).eqN();
                return true;
            }
        });
    }

    public void bg(final com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (IL() && tuv != null && com.bytedance.sdk.openadsdk.core.model.rri.ldr(tuv)) {
            final java.lang.String strWaE = tuv.waE();
            if (android.text.TextUtils.isEmpty(strWaE)) {
                return;
            }
            com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.tuV.bg.eqN.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (com.bytedance.sdk.openadsdk.tuV.bg.eqN.this.ldr.size() >= com.bytedance.sdk.openadsdk.tuV.bg.eqN.this.eqN) {
                            java.lang.Object[] objArr = new java.lang.Object[3];
                            java.lang.Integer.valueOf(com.bytedance.sdk.openadsdk.tuV.bg.eqN.this.ldr.size());
                            com.bytedance.sdk.openadsdk.tuV.bg.IL il = (com.bytedance.sdk.openadsdk.tuV.bg.IL) com.bytedance.sdk.openadsdk.tuV.bg.eqN.this.ldr.remove(0);
                            if (il != null) {
                                com.bytedance.sdk.openadsdk.tuV.bg.eqN.this.bg.removeMessages(il.Kg().hashCode());
                                il.eqN();
                            }
                        }
                        tuv.eo(true);
                        android.content.Context contextBg = com.bytedance.sdk.openadsdk.core.VzQ.bg();
                        com.bytedance.sdk.openadsdk.core.model.tuV tuv2 = tuv;
                        final com.bytedance.sdk.openadsdk.tuV.bg.IL il2 = new com.bytedance.sdk.openadsdk.tuV.bg.IL(contextBg, tuv2, tuv2.xFs(), true, new android.widget.FrameLayout(com.bytedance.sdk.openadsdk.core.VzQ.bg()), strWaE);
                        com.bytedance.sdk.openadsdk.tuV.bg.eqN.this.ldr.add(il2);
                        il2.iR();
                        android.os.Message messageObtain = android.os.Message.obtain();
                        messageObtain.what = strWaE.hashCode();
                        messageObtain.obj = il2;
                        com.bytedance.sdk.openadsdk.tuV.bg.eqN.this.bg.sendMessageDelayed(messageObtain, com.bytedance.sdk.openadsdk.tuV.bg.eqN.this.zx);
                        il2.bg(new com.bytedance.sdk.openadsdk.tuV.bg.bg.InterfaceC0166bg() { // from class: com.bytedance.sdk.openadsdk.tuV.bg.eqN.3.1
                            @Override // com.bytedance.sdk.openadsdk.tuV.bg.bg.InterfaceC0166bg
                            public void bg() {
                                com.bytedance.sdk.openadsdk.tuV.bg.eqN.this.bg.removeMessages(strWaE.hashCode());
                                com.bytedance.sdk.openadsdk.tuV.bg.eqN.this.ldr.remove(il2);
                                il2.eqN();
                            }
                        });
                        com.bytedance.sdk.openadsdk.core.model.tuV tuv3 = tuv;
                        com.bytedance.sdk.openadsdk.eqN.bX.bg(tuv3, com.bytedance.sdk.openadsdk.utils.ayS.bX(tuv3.VW().getDurationSlotType()), "PL_start_pre_render", new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.bg.eqN.3.2
                            @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
                            public org.json.JSONObject bg() {
                                org.json.JSONObject jSONObject = new org.json.JSONObject();
                                try {
                                    jSONObject.put("is_pre_render", 1);
                                } catch (org.json.JSONException unused) {
                                }
                                return jSONObject;
                            }
                        });
                    } catch (java.lang.Throwable th) {
                        java.lang.Object[] objArr2 = new java.lang.Object[2];
                        th.getMessage();
                    }
                }
            });
        }
    }

    public com.bytedance.sdk.openadsdk.tuV.bg.IL bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, android.widget.FrameLayout frameLayout, com.bytedance.sdk.openadsdk.PX.zx zxVar) {
        com.bytedance.sdk.openadsdk.tuV.bg.IL il;
        if (IL() && tuv.VW() != null && !android.text.TextUtils.isEmpty(tuv.VW().getBidAdm()) && com.bytedance.sdk.openadsdk.core.model.rri.ldr(tuv) && frameLayout != null) {
            java.lang.String strWaE = tuv.waE();
            if (android.text.TextUtils.isEmpty(strWaE)) {
                return null;
            }
            int i = 0;
            while (true) {
                if (i >= this.ldr.size()) {
                    i = -1;
                    il = null;
                    break;
                }
                il = this.ldr.get(i);
                if (strWaE.equals(il.Kg())) {
                    break;
                }
                i++;
            }
            if (il != null) {
                this.bg.removeMessages(strWaE.hashCode());
                this.ldr.remove(i);
                java.lang.Object[] objArr = new java.lang.Object[2];
                java.lang.Integer.valueOf(this.ldr.size());
                tuv.eo(true);
                il.bg(frameLayout, zxVar);
                com.bytedance.sdk.openadsdk.eqN.bX.bg(tuv, com.bytedance.sdk.openadsdk.utils.ayS.bX(tuv.VW().getDurationSlotType()), "PL_use_pre_render", new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.bg.eqN.4
                    @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
                    public org.json.JSONObject bg() {
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        try {
                            jSONObject.put("is_pre_render", 1);
                        } catch (org.json.JSONException unused) {
                        }
                        return jSONObject;
                    }
                });
                return il;
            }
        }
        return null;
    }

    public boolean IL() {
        return this.bX == 1;
    }
}
