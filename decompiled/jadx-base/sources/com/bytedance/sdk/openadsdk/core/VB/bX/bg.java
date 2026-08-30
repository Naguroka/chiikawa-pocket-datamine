package com.bytedance.sdk.openadsdk.core.VB.bX;

/* JADX INFO: loaded from: classes4.dex */
public class bg implements com.bytedance.adsdk.ugeno.core.PX, com.bytedance.adsdk.ugeno.core.Ta {
    private com.bytedance.adsdk.ugeno.IL.bX<android.view.View> IL;
    private com.bytedance.sdk.openadsdk.core.VB.bX.bg.InterfaceC0145bg bX;
    private final android.content.Context bg;
    private com.bytedance.adsdk.ugeno.core.Ta eqN;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.VB.bX.bg$bg, reason: collision with other inner class name */
    interface InterfaceC0145bg {
        void bg(com.bytedance.adsdk.ugeno.core.eo eoVar);
    }

    @Override // com.bytedance.adsdk.ugeno.core.PX
    public void bg(com.bytedance.adsdk.ugeno.IL.bX bXVar, java.lang.String str, com.bytedance.adsdk.ugeno.eqN.IL.bg bgVar) {
    }

    public bg(android.content.Context context) {
        this.bg = context;
    }

    public void bg(final org.json.JSONObject jSONObject, final org.json.JSONObject jSONObject2, final com.bytedance.sdk.openadsdk.core.VB.zx.eqN eqn) {
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            IL(jSONObject, jSONObject2, eqn);
        } else {
            com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.VB.bX.bg.1
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.core.VB.bX.bg.this.IL(jSONObject, jSONObject2, eqn);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IL(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.bytedance.sdk.openadsdk.core.VB.zx.eqN eqn) {
        try {
            com.bytedance.adsdk.ugeno.core.WR wr = new com.bytedance.adsdk.ugeno.core.WR(this.bg);
            com.bytedance.adsdk.ugeno.IL.bX<android.view.View> bXVarBg = wr.bg(jSONObject);
            this.IL = bXVarBg;
            if (bXVarBg == null) {
                if (eqn != null) {
                    eqn.bg(3000, "ugen render fail");
                    return;
                }
                return;
            }
            android.view.View viewWR = bXVarBg.WR();
            if (viewWR != null) {
                viewWR.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.VB.bX.bg.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(android.view.View view) {
                    }
                });
            }
            wr.bg((com.bytedance.adsdk.ugeno.core.PX) this);
            wr.bg((com.bytedance.adsdk.ugeno.core.Ta) this);
            if (jSONObject2 != null) {
                try {
                    jSONObject2.put("language", com.bytedance.sdk.openadsdk.core.PX.bg());
                    jSONObject2.put(com.json.ce.y, com.json.y8.d);
                } catch (org.json.JSONException unused) {
                }
            }
            wr.IL(jSONObject2);
            if (eqn != null) {
                eqn.bg(this.IL);
            }
        } catch (java.lang.Exception e) {
            if (eqn != null) {
                eqn.bg(3000, "ugen render fail exception is" + e.getMessage());
            }
        }
    }

    public void bg(com.bytedance.sdk.openadsdk.core.VB.bX.bg.InterfaceC0145bg interfaceC0145bg) {
        this.bX = interfaceC0145bg;
    }

    public void bg(com.bytedance.adsdk.ugeno.core.Ta ta) {
        this.eqN = ta;
    }

    @Override // com.bytedance.adsdk.ugeno.core.PX
    public void bg(com.bytedance.adsdk.ugeno.core.eo eoVar, com.bytedance.adsdk.ugeno.core.PX.IL il, com.bytedance.adsdk.ugeno.core.PX.bg bgVar) {
        com.bytedance.sdk.openadsdk.core.VB.bX.bg.InterfaceC0145bg interfaceC0145bg;
        if (eoVar == null) {
            return;
        }
        if ((eoVar.IL() == 1 || eoVar.IL() == 4) && (interfaceC0145bg = this.bX) != null) {
            interfaceC0145bg.bg(eoVar);
        }
        if (il == null || eoVar.eqN() == null) {
            return;
        }
        il.bg(eoVar.eqN());
    }

    @Override // com.bytedance.adsdk.ugeno.core.Ta
    public void bg(com.bytedance.adsdk.ugeno.IL.bX bXVar, android.view.MotionEvent motionEvent) {
        com.bytedance.adsdk.ugeno.core.Ta ta = this.eqN;
        if (ta != null) {
            ta.bg(bXVar, motionEvent);
        }
    }
}
