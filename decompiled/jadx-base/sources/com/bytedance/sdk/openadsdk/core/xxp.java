package com.bytedance.sdk.openadsdk.core;

/* JADX INFO: loaded from: classes4.dex */
public class xxp {
    private com.bytedance.sdk.openadsdk.VzQ.bg.bg.ldr IL;
    private long Kg;
    private com.bytedance.sdk.openadsdk.core.IL.IL Ta;
    private com.bykv.vk.openvk.bg.bg.bg.eqN.bX VB;
    private final android.content.Context bX;
    private final com.bytedance.sdk.openadsdk.core.model.tuV bg;
    private final com.bytedance.sdk.openadsdk.bg.IL.bg eo;
    private final com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd eqN;
    private com.bytedance.sdk.openadsdk.bg.IL.ldr iR;
    private final java.lang.String ldr;
    private com.bytedance.sdk.openadsdk.core.IL.bg yDt;
    private java.util.List<android.view.View> zx = new java.util.ArrayList();
    private final com.bytedance.sdk.openadsdk.eqN.iR WR = new com.bytedance.sdk.openadsdk.eqN.iR();
    private final java.util.concurrent.atomic.AtomicBoolean PX = new java.util.concurrent.atomic.AtomicBoolean(false);

    public com.bytedance.sdk.openadsdk.eqN.iR bg() {
        return this.WR;
    }

    public xxp(android.content.Context context, com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, com.bytedance.sdk.openadsdk.bg.IL.bg bgVar) {
        this.eqN = pAGNativeAd;
        this.bg = tuv;
        this.bX = context;
        this.ldr = str;
        this.eo = bgVar;
        if (tuv.jz() == 4) {
            this.IL = com.bytedance.sdk.openadsdk.VzQ.bg.bg.iR.bg(context, tuv, str);
        }
    }

    public void bg(android.view.View view, int i) {
        com.bytedance.sdk.openadsdk.bg.IL.ldr ldrVar = this.iR;
        if (ldrVar != null) {
            ldrVar.onAdClicked();
        }
    }

    public void bg(android.view.ViewGroup viewGroup, java.util.List<android.view.View> list, java.util.List<android.view.View> list2, java.util.List<android.view.View> list3, android.view.View view, com.bytedance.sdk.openadsdk.bg.IL.ldr ldrVar) {
        bg(viewGroup, list, list2, list3, ldrVar);
        bg(viewGroup, view);
        bg(viewGroup, list2, list3);
    }

    private void bg(android.view.ViewGroup viewGroup, java.util.List<android.view.View> list, java.util.List<android.view.View> list2, java.util.List<android.view.View> list3, com.bytedance.sdk.openadsdk.bg.IL.ldr ldrVar) {
        this.iR = ldrVar;
        viewGroup.addOnLayoutChangeListener(new com.bytedance.sdk.openadsdk.core.xxp.bg(this.WR, viewGroup));
        this.zx = list;
        bg(list2, (com.bytedance.sdk.openadsdk.core.IL.bX) null);
        if (list != null) {
            for (android.view.View view : this.zx) {
                if (view != null) {
                    view.setTag(520093762, java.lang.Boolean.TRUE);
                }
            }
            if (list3 != null) {
                list3.addAll(list);
            }
        }
        bg(list3, (com.bytedance.sdk.openadsdk.core.IL.bX) null);
    }

    private void bg(java.util.List<android.view.View> list, com.bytedance.sdk.openadsdk.core.IL.bX bXVar) {
        if (com.bytedance.sdk.component.utils.eo.IL(list)) {
            for (android.view.View view : list) {
                if (view != null) {
                    view.setOnClickListener(bXVar);
                    view.setOnTouchListener(bXVar);
                }
            }
        }
    }

    private com.bytedance.sdk.openadsdk.core.iR IL(android.view.ViewGroup viewGroup, java.util.List<android.view.View> list, java.util.List<android.view.View> list2, java.util.List<android.view.View> list3, com.bytedance.sdk.openadsdk.bg.IL.ldr ldrVar) {
        this.iR = ldrVar;
        viewGroup.addOnLayoutChangeListener(new com.bytedance.sdk.openadsdk.core.xxp.bg(this.WR, viewGroup));
        this.zx = list;
        com.bytedance.sdk.openadsdk.core.iR iRVarEqN = eqN(viewGroup);
        if (iRVarEqN == null) {
            iRVarEqN = new com.bytedance.sdk.openadsdk.core.iR(this.bX, viewGroup);
            viewGroup.addView(iRVarEqN);
        }
        iRVarEqN.bg();
        iRVarEqN.setRefClickViews(list2);
        if (list != null) {
            for (android.view.View view : this.zx) {
                if (view != null) {
                    view.setTag(520093762, java.lang.Boolean.TRUE);
                }
            }
            if (list3 != null) {
                list3.addAll(list);
            }
        }
        iRVarEqN.setRefCreativeViews(list3);
        return iRVarEqN;
    }

    public void bg(com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar) {
        this.VB = bXVar;
        com.bytedance.sdk.openadsdk.core.IL.IL il = this.Ta;
        if (il != null) {
            il.bg(bXVar);
        }
        com.bytedance.sdk.openadsdk.core.IL.bg bgVar = this.yDt;
        if (bgVar != null) {
            bgVar.bg(bXVar);
        }
    }

    private static class bg implements android.view.View.OnLayoutChangeListener {
        private final android.view.ViewGroup IL;
        private final com.bytedance.sdk.openadsdk.eqN.iR bg;

        public bg(com.bytedance.sdk.openadsdk.eqN.iR iRVar, android.view.ViewGroup viewGroup) {
            this.bg = iRVar;
            this.IL = viewGroup;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.bg.bg(java.lang.System.currentTimeMillis(), com.bytedance.sdk.openadsdk.core.VW.bg(this.IL));
        }
    }

    private void bg(android.view.ViewGroup viewGroup, android.view.View view) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("click_scence", 1);
        android.content.Context contextBg = viewGroup != null ? com.bytedance.sdk.component.utils.IL.bg(viewGroup) : null;
        if (contextBg == null) {
            contextBg = this.bX;
        }
        if (this.bg.tC() == 2) {
            com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.bg;
            java.lang.String str = this.ldr;
            this.Ta = new com.bytedance.sdk.openadsdk.core.Kg.WR(contextBg, tuv, str, com.bytedance.sdk.openadsdk.utils.ayS.bg(str));
        } else {
            com.bytedance.sdk.openadsdk.core.model.tuV tuv2 = this.bg;
            java.lang.String str2 = this.ldr;
            this.Ta = new com.bytedance.sdk.openadsdk.core.IL.IL(contextBg, tuv2, str2, com.bytedance.sdk.openadsdk.utils.ayS.bg(str2));
        }
        this.Ta.bg(viewGroup);
        this.Ta.bg(this.VB);
        this.Ta.IL(view);
        this.Ta.bg(this.IL);
        this.Ta.bg(this.eqN);
        this.Ta.bg(map);
        this.Ta.bg(new com.bytedance.sdk.openadsdk.core.IL.IL.bg() { // from class: com.bytedance.sdk.openadsdk.core.xxp.1
            @Override // com.bytedance.sdk.openadsdk.core.IL.IL.bg
            public void bg(android.view.View view2, int i) {
                if (com.bytedance.sdk.openadsdk.core.xxp.this.iR != null) {
                    com.bytedance.sdk.openadsdk.core.xxp.this.iR.onAdClicked();
                }
            }
        });
        if (this.bg.tC() == 2) {
            android.content.Context context = this.bX;
            com.bytedance.sdk.openadsdk.core.model.tuV tuv3 = this.bg;
            java.lang.String str3 = this.ldr;
            this.yDt = new com.bytedance.sdk.openadsdk.core.Kg.Kg(context, tuv3, str3, com.bytedance.sdk.openadsdk.utils.ayS.bg(str3));
        } else {
            android.content.Context context2 = this.bX;
            com.bytedance.sdk.openadsdk.core.model.tuV tuv4 = this.bg;
            java.lang.String str4 = this.ldr;
            this.yDt = new com.bytedance.sdk.openadsdk.core.IL.bg(context2, tuv4, str4, com.bytedance.sdk.openadsdk.utils.ayS.bg(str4));
        }
        this.yDt.bg(viewGroup);
        this.yDt.bg(this.VB);
        this.yDt.IL(view);
        this.yDt.bg(this.IL);
        this.yDt.bg(this.eqN);
        this.yDt.bg(map);
        this.yDt.bg(new com.bytedance.sdk.openadsdk.core.IL.IL.bg() { // from class: com.bytedance.sdk.openadsdk.core.xxp.2
            @Override // com.bytedance.sdk.openadsdk.core.IL.IL.bg
            public void bg(android.view.View view2, int i) {
                if (com.bytedance.sdk.openadsdk.core.xxp.this.iR != null) {
                    com.bytedance.sdk.openadsdk.core.xxp.this.iR.onAdClicked();
                }
                com.bytedance.sdk.openadsdk.rri.bg.zx.bg(com.bytedance.sdk.openadsdk.core.xxp.this.bg, 9);
                com.bytedance.sdk.openadsdk.core.xxp.this.eo.Ta();
            }
        });
    }

    private void bg(android.view.ViewGroup viewGroup, com.bytedance.sdk.openadsdk.core.iR iRVar, java.util.List<android.view.View> list, java.util.List<android.view.View> list2) {
        com.bytedance.sdk.openadsdk.core.IL.IL il = this.Ta;
        if (il == null || this.yDt == null) {
            return;
        }
        iRVar.bg(list, il);
        iRVar.bg(list2, this.yDt);
        bg(this.Ta, this.yDt);
        bg(iRVar, viewGroup);
    }

    private void bg(android.view.ViewGroup viewGroup, java.util.List<android.view.View> list, java.util.List<android.view.View> list2) {
        com.bytedance.sdk.openadsdk.core.IL.IL il = this.Ta;
        if (il == null || this.yDt == null) {
            return;
        }
        bg(list, il);
        bg(list2, this.yDt);
        bg(this.Ta, this.yDt);
        bg(viewGroup);
    }

    private void bg(com.bytedance.sdk.openadsdk.core.IL.IL il, com.bytedance.sdk.openadsdk.core.IL.bg bgVar) {
        if (this.bg.tC() == 2) {
            IL(il, bgVar);
        } else {
            bg(bgVar);
        }
    }

    private void IL(com.bytedance.sdk.openadsdk.core.IL.IL il, com.bytedance.sdk.openadsdk.core.IL.bg bgVar) {
        com.bytedance.sdk.openadsdk.bg.IL.bg bgVar2 = this.eo;
        if (bgVar2 != null && bgVar2.IL() != null) {
            com.bytedance.sdk.openadsdk.core.Kg.Fy fyIL = this.eo.IL();
            if ((il instanceof com.bytedance.sdk.openadsdk.core.Kg.WR) && (bgVar instanceof com.bytedance.sdk.openadsdk.core.Kg.Kg)) {
                fyIL.setClickListener((com.bytedance.sdk.openadsdk.core.Kg.WR) il);
                fyIL.setClickCreativeListener((com.bytedance.sdk.openadsdk.core.Kg.Kg) bgVar);
            }
            fyIL.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.ldr() { // from class: com.bytedance.sdk.openadsdk.core.xxp.3
                @Override // com.bytedance.sdk.openadsdk.core.widget.ldr
                public void bg() {
                    if (com.bytedance.sdk.openadsdk.core.xxp.this.iR != null) {
                        com.bytedance.sdk.openadsdk.core.xxp.this.iR.onAdClicked();
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.bg.IL.bg bgVar3 = this.eo;
        if (bgVar3 != null && bgVar3.bg() != null) {
            this.eo.bg().setOnClickListener(bgVar);
            this.eo.bg().setOnTouchListener(bgVar);
        }
        com.bytedance.sdk.openadsdk.bg.IL.bg bgVar4 = this.eo;
        if (bgVar4 != null) {
            bgVar4.bg(bgVar);
            this.eo.bg(il);
        }
    }

    private void bg(com.bytedance.sdk.openadsdk.core.IL.bg bgVar) {
        if (com.bytedance.sdk.openadsdk.core.settings.xxp.zU().eqN(java.lang.String.valueOf(this.bg.IGR()))) {
            com.bytedance.sdk.openadsdk.bg.IL.bg bgVar2 = this.eo;
            if (bgVar2 != null && bgVar2.bg() != null) {
                this.eo.bg().setOnClickListener(bgVar);
                this.eo.bg().setOnTouchListener(bgVar);
            }
            com.bytedance.sdk.openadsdk.bg.IL.bg bgVar3 = this.eo;
            if (bgVar3 != null) {
                bgVar3.bg(bgVar);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.bg.IL.bg bgVar4 = this.eo;
        if (bgVar4 != null && bgVar4.bg() != null) {
            com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView pAGMediaViewBg = this.eo.bg();
            com.bytedance.sdk.openadsdk.core.IL.bX bXVar = new com.bytedance.sdk.openadsdk.core.IL.bX() { // from class: com.bytedance.sdk.openadsdk.core.xxp.4
                @Override // com.bytedance.sdk.openadsdk.core.IL.bX
                protected void bg(android.view.View view, float f, float f2, float f3, float f4, android.util.SparseArray<com.bytedance.sdk.openadsdk.core.IL.bX.bg> sparseArray, boolean z) {
                    if (view instanceof com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView) {
                        ((com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView) view).handleInterruptVideo();
                    }
                }
            };
            pAGMediaViewBg.setOnClickListener(bXVar);
            pAGMediaViewBg.setOnTouchListener(bXVar);
        }
        com.bytedance.sdk.openadsdk.bg.IL.bg bgVar5 = this.eo;
        if (bgVar5 != null) {
            bgVar5.bg((com.bytedance.sdk.openadsdk.core.IL.bg) null);
        }
    }

    private void bg(com.bytedance.sdk.openadsdk.core.iR iRVar, final android.view.ViewGroup viewGroup) {
        iRVar.setCallback(new com.bytedance.sdk.openadsdk.core.iR.bg() { // from class: com.bytedance.sdk.openadsdk.core.xxp.5
            @Override // com.bytedance.sdk.openadsdk.core.iR.bg
            public void bg(boolean z) {
                com.bytedance.sdk.openadsdk.core.xxp.this.bg(z, viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.core.iR.bg
            public void bg() {
                com.bytedance.sdk.openadsdk.core.xxp.this.IL(viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.core.iR.bg
            public void IL() {
                com.bytedance.sdk.openadsdk.core.xxp.this.IL();
            }

            @Override // com.bytedance.sdk.openadsdk.core.iR.bg
            @com.bytedance.JProtect
            public void bg(android.view.View view) {
                com.bytedance.sdk.openadsdk.core.xxp.this.IL(viewGroup, view);
            }
        });
    }

    private void bg(final android.view.ViewGroup viewGroup) {
        com.bytedance.sdk.openadsdk.utils.LKE.bg(viewGroup, true, 5, new com.bytedance.sdk.openadsdk.utils.LKE.IL() { // from class: com.bytedance.sdk.openadsdk.core.xxp.6
            @Override // com.bytedance.sdk.openadsdk.utils.LKE.IL
            public void bg(boolean z) {
                com.bytedance.sdk.openadsdk.core.xxp.this.bg(z, viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.LKE.IL
            public void bg() {
                com.bytedance.sdk.openadsdk.core.xxp.this.IL(viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.LKE.IL
            public void IL() {
                com.bytedance.sdk.openadsdk.core.xxp.this.IL();
            }

            @Override // com.bytedance.sdk.openadsdk.utils.LKE.IL
            public void bg(android.view.View view, boolean z) {
                if (z) {
                    com.bytedance.sdk.openadsdk.core.xxp.this.IL(viewGroup, view);
                }
            }
        }, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(boolean z, android.view.ViewGroup viewGroup) {
        if (z && this.bg.vTg() && !this.bg.NU()) {
            this.bg.iR(true);
            com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.bg;
            com.bytedance.sdk.openadsdk.eqN.bX.bg(tuv, this.ldr, tuv.dRo());
        }
        if (!z && this.Kg > 0) {
            java.lang.String strValueOf = java.lang.String.valueOf(android.os.SystemClock.elapsedRealtime() - this.Kg);
            this.WR.bg(java.lang.System.currentTimeMillis(), com.bytedance.sdk.openadsdk.core.VW.bg(viewGroup));
            com.bytedance.sdk.openadsdk.eqN.bX.bg(strValueOf, this.bg, this.ldr, this.WR);
            this.Kg = 0L;
            return;
        }
        this.WR.bg(java.lang.System.currentTimeMillis(), com.bytedance.sdk.openadsdk.core.VW.bg(viewGroup));
        this.Kg = android.os.SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IL(android.view.ViewGroup viewGroup) {
        this.WR.bg(java.lang.System.currentTimeMillis(), com.bytedance.sdk.openadsdk.core.VW.bg(viewGroup));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IL() {
        if (this.Kg > 0) {
            com.bytedance.sdk.openadsdk.eqN.bX.bg(java.lang.String.valueOf(android.os.SystemClock.elapsedRealtime() - this.Kg), this.bg, this.ldr, this.WR);
            this.Kg = 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IL(android.view.ViewGroup viewGroup, android.view.View view) {
        if (this.PX.get()) {
            return;
        }
        this.PX.set(true);
        if (this.eqN instanceof com.bytedance.sdk.openadsdk.bg.IL.bg.bX) {
            com.bytedance.sdk.openadsdk.core.Kg.Fy fyIL = this.eo.IL();
            if (fyIL != null) {
                fyIL.Kg();
            }
            ((com.bytedance.sdk.openadsdk.bg.IL.bg.bX) this.eqN).bg(true);
        }
        this.WR.bg(java.lang.System.currentTimeMillis(), com.bytedance.sdk.openadsdk.core.VW.bg(viewGroup));
        this.Kg = android.os.SystemClock.elapsedRealtime();
        bX(viewGroup);
        com.bytedance.sdk.openadsdk.bg.IL.ldr ldrVar = this.iR;
        if (ldrVar != null) {
            ldrVar.bg(this.eqN);
        }
        if (this.bg.RFq()) {
            com.bytedance.sdk.openadsdk.utils.ayS.bg(this.bg, view);
        }
        if (this.bg.hi() != null) {
            this.bg.hi().bg().bg(0L);
        }
    }

    private void bX(android.view.ViewGroup viewGroup) {
        com.bytedance.sdk.openadsdk.core.model.tuV tuv;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (this.zx != null) {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                for (android.view.View view : this.zx) {
                    if (view != null) {
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        try {
                            jSONObject2.put("width", view.getWidth());
                            jSONObject2.put("height", view.getHeight());
                            jSONObject2.put("alpha", view.getAlpha());
                        } catch (java.lang.Throwable unused) {
                        }
                        jSONArray.put(jSONObject2);
                    }
                }
                jSONObject.put("image_view", jSONArray.toString());
            }
            if (viewGroup != null) {
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                try {
                    jSONObject3.put("width", viewGroup.getWidth());
                    jSONObject3.put("height", viewGroup.getHeight());
                    jSONObject3.put("alpha", viewGroup.getAlpha());
                } catch (java.lang.Throwable unused2) {
                }
                jSONObject.put("root_view", jSONObject3.toString());
            }
            com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView pAGMediaViewKg = this.eo.Kg();
            if (pAGMediaViewKg != null) {
                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                try {
                    jSONObject4.put("width", com.bytedance.sdk.openadsdk.utils.ZQc.eqN(this.bX, pAGMediaViewKg.getWidth()) * 1.0f);
                    jSONObject4.put("height", com.bytedance.sdk.openadsdk.utils.ZQc.eqN(this.bX, pAGMediaViewKg.getHeight()) * 1.0f);
                } catch (java.lang.Throwable unused3) {
                }
                jSONObject.put("media_view", jSONObject4.toString());
            }
            com.bytedance.sdk.openadsdk.core.Kg.Fy fyIL = this.eo.IL();
            if (fyIL != null && (tuv = this.bg) != null) {
                jSONObject.put("dynamic_show_type", tuv.JAA());
                fyIL.bg(jSONObject, this.bg);
            }
            com.bytedance.sdk.openadsdk.eqN.bX.bg(this.bg, this.ldr, jSONObject);
        } catch (org.json.JSONException e) {
            com.bytedance.sdk.component.utils.PX.bg("InteractionManager", "onShowFun json error", e);
        }
    }

    private com.bytedance.sdk.openadsdk.core.iR eqN(android.view.ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            android.view.View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof com.bytedance.sdk.openadsdk.core.iR) {
                return (com.bytedance.sdk.openadsdk.core.iR) childAt;
            }
        }
        return null;
    }
}
