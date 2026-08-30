package com.bytedance.sdk.openadsdk.core.IL;

/* JADX INFO: loaded from: classes4.dex */
public class bg extends com.bytedance.sdk.openadsdk.core.IL.IL {
    private boolean IL;
    private int ZQc;
    private java.lang.ref.WeakReference<com.bytedance.sdk.openadsdk.core.IL.bg.InterfaceC0132bg> ayS;
    private boolean bX;
    private boolean bg;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.IL.bg$bg, reason: collision with other inner class name */
    public interface InterfaceC0132bg {
        long getVideoProgress();
    }

    public boolean IL() {
        return false;
    }

    public boolean bX() {
        return false;
    }

    public bg(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, int i) {
        super(context, tuv, str, i);
        this.bg = true;
        this.IL = false;
        this.bX = false;
    }

    public void bg(boolean z) {
        this.bg = z;
    }

    public void IL(boolean z) {
        this.IL = z;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0269  */
    /* JADX WARN: Code duplicated, block: B:158:0x034b  */
    /* JADX WARN: Code duplicated, block: B:171:0x0390  */
    /* JADX WARN: Code duplicated, block: B:173:0x0394  */
    /* JADX WARN: Code duplicated, block: B:175:0x0398  */
    /* JADX WARN: Code duplicated, block: B:177:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:178:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:183:0x03b7 A[Catch: Exception -> 0x03d0, TryCatch #0 {Exception -> 0x03d0, blocks: (B:181:0x03ae, B:183:0x03b7, B:187:0x03cd, B:185:0x03bb), top: B:205:0x03ae }] */
    /* JADX WARN: Code duplicated, block: B:185:0x03bb A[Catch: Exception -> 0x03d0, TryCatch #0 {Exception -> 0x03d0, blocks: (B:181:0x03ae, B:183:0x03b7, B:187:0x03cd, B:185:0x03bb), top: B:205:0x03ae }] */
    /* JADX WARN: Code duplicated, block: B:187:0x03cd A[Catch: Exception -> 0x03d0, TRY_LEAVE, TryCatch #0 {Exception -> 0x03d0, blocks: (B:181:0x03ae, B:183:0x03b7, B:187:0x03cd, B:185:0x03bb), top: B:205:0x03ae }] */
    /* JADX WARN: Code duplicated, block: B:189:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:191:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:192:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:195:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:197:0x0405  */
    /* JADX WARN: Code duplicated, block: B:198:0x0408  */
    /* JADX WARN: Code duplicated, block: B:205:0x03ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ef  */
    @Override // com.bytedance.sdk.openadsdk.core.IL.IL, com.bytedance.sdk.openadsdk.core.IL.bX
    public void bg(android.view.View view, float f, float f2, float f3, float f4, android.util.SparseArray<com.bytedance.sdk.openadsdk.core.IL.bX.bg> sparseArray, boolean z) {
        org.json.JSONObject jSONObject;
        boolean z2;
        int i;
        org.json.JSONObject jSONObject2;
        android.view.View view2;
        int i2;
        android.app.Activity activityBg;
        android.content.Context context;
        boolean zBg;
        int i3;
        java.lang.Boolean bool;
        java.lang.String strGvG;
        java.lang.String str;
        if (bg(view, 2, f, f2, f3, f4, sparseArray, z)) {
            return;
        }
        this.ldr.zx(true);
        this.ldr.fkt();
        if (!this.ldr.zx()) {
            this.ldr.bg(true);
        }
        if (com.bytedance.sdk.openadsdk.core.model.tuV.zx(this.ldr)) {
            com.bytedance.sdk.openadsdk.eqN.bX.IL(this.ldr, this.iR, this.ldr.xZ());
        }
        if (this.yDt != null) {
            if (this.xxp == null) {
                this.xxp = new java.util.HashMap();
            }
            this.xxp.put("duration", java.lang.Long.valueOf(this.yDt.zx()));
        }
        int iMZk = this.ldr.mZk();
        this.ldr.daV(0);
        if (this.vb != null) {
            this.vb.bg(iMZk > 0 ? iMZk : 0);
        }
        if (this.xxp != null) {
            this.xxp.remove("dsp_click_type");
            this.xxp.remove("click_probability_jump");
            this.xxp.remove("auto_click");
        }
        if (iMZk > 0) {
            if (this.xxp == null) {
                this.xxp = new java.util.HashMap();
            }
            if (this.ldr.HXG() && iMZk < 11) {
                this.xxp.put("dsp_click_type", java.lang.Integer.valueOf(iMZk));
            }
            if (iMZk >= 11 && this.ldr.OLh() == 0) {
                this.xxp.put("click_probability_jump", java.lang.Integer.valueOf(com.bytedance.sdk.openadsdk.core.model.ldr.bg(iMZk)));
            }
        }
        if (this.ldr.HXG()) {
            if (view != null) {
                java.lang.Object tag = view.getTag(570425345);
                if (tag instanceof java.lang.String) {
                    str = (java.lang.String) tag;
                } else {
                    str = "VAST_ACTION_BUTTON";
                }
            } else {
                str = "VAST_ACTION_BUTTON";
            }
            this.ldr.hi().zx(str);
            if (!android.text.TextUtils.isEmpty(str)) {
                bg(str);
            }
            java.lang.ref.WeakReference<com.bytedance.sdk.openadsdk.core.IL.bg.InterfaceC0132bg> weakReference = this.ayS;
            long videoProgress = (weakReference == null || weakReference.get() == null) ? 0L : this.ayS.get().getVideoProgress();
            if ("VAST_ICON".equals(str)) {
                if (this.ldr.hi().IL() != null) {
                    this.ldr.hi().IL().bg(videoProgress);
                }
            } else if ("VAST_END_CARD".equals(str)) {
                if (this.ldr.hi().bX() != null) {
                    this.ldr.hi().bX().bg(videoProgress);
                }
            } else {
                this.ldr.hi().bg().iR(videoProgress);
            }
        }
        if (eo() && eqN(view) && !this.bX) {
            super.bg(view, f, f2, f3, f4, sparseArray, z);
            return;
        }
        if (this.eqN == null) {
            this.eqN = com.bytedance.sdk.openadsdk.core.VzQ.bg();
        }
        if (this.eqN != null && bg(view, z)) {
            org.json.JSONObject jSONObjectBg = com.bytedance.sdk.openadsdk.core.Kg.Fy.bg(view);
            if (this.zx != null) {
                i = this.zx.PX;
                jSONObject = this.zx.Ta;
                jSONObject2 = this.zx.xxp;
                z2 = this.zx.VzQ;
            } else {
                jSONObject = jSONObjectBg;
                z2 = false;
                i = -1;
                jSONObject2 = null;
            }
            this.VB = bg(f, f2, f3, f4, sparseArray, this.JAA, this.Ja, this.WR == null ? eqN() : this.WR.get(), this.eo == null ? zx() : this.eo.get(), ldr(), com.bytedance.sdk.openadsdk.utils.ZQc.zx(this.eqN), com.bytedance.sdk.openadsdk.utils.ZQc.iR(this.eqN), com.bytedance.sdk.openadsdk.utils.ZQc.ldr(this.eqN), i, jSONObject, jSONObject2);
            if (z2) {
                com.bytedance.sdk.openadsdk.eqN.bX.bg(com.json.z8.CLICK, this.ldr, this.VB, this.iR, true, this.xxp, z ? 1 : 2);
                return;
            }
            int iJz = this.ldr.jz();
            if (iJz == 2 || iJz == 3) {
                view2 = view;
                if (iJz == 3) {
                    strGvG = this.ldr.GvG();
                    if (android.text.TextUtils.isEmpty(strGvG) && strGvG.contains("play.google.com/store")) {
                        if (com.bytedance.sdk.openadsdk.VzQ.bg.bg.eqN.bg(this.eqN, strGvG, strGvG.substring(strGvG.indexOf("?id=") + 4), this.iR, this.ldr)) {
                            if (this.bg) {
                                com.bytedance.sdk.openadsdk.eqN.bX.bg(com.json.z8.CLICK, this.ldr, this.VB, this.iR, true, this.xxp, z ? 1 : 2);
                            }
                        } else {
                            if (this.Ta == null) {
                                com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.ldr;
                                com.bytedance.sdk.openadsdk.core.model.eo eoVar = this.VB;
                                java.lang.String str2 = this.iR;
                                java.util.Map<java.lang.String, java.lang.Object> map = this.xxp;
                                if (z) {
                                    i2 = 1;
                                } else {
                                    i2 = 2;
                                }
                                com.bytedance.sdk.openadsdk.eqN.bX.bg("click_button", tuv, eoVar, str2, true, map, i2);
                            } else {
                                com.bytedance.sdk.openadsdk.core.model.tuV tuv2 = this.ldr;
                                com.bytedance.sdk.openadsdk.core.model.eo eoVar2 = this.VB;
                                java.lang.String str3 = this.iR;
                                java.util.Map<java.lang.String, java.lang.Object> map2 = this.xxp;
                                if (z) {
                                    i2 = 1;
                                } else {
                                    i2 = 2;
                                }
                                com.bytedance.sdk.openadsdk.eqN.bX.bg("click_button", tuv2, eoVar2, str3, true, map2, i2);
                            }
                            if (view2 != null) {
                                if (view.getId() == 520093726) {
                                }
                                com.bytedance.sdk.openadsdk.core.VJ.bg(true);
                            } else {
                                bool = (java.lang.Boolean) view2.getTag(520093762);
                                if (bool.booleanValue()) {
                                    com.bytedance.sdk.openadsdk.core.VJ.bg(true);
                                }
                            }
                            if (view2 != null) {
                            }
                            if (activityBg == null) {
                                context = this.eqN;
                            } else {
                                context = activityBg;
                            }
                            zBg = com.bytedance.sdk.openadsdk.core.VJ.bg(context, this.ldr, this.Kg, this.Ta, this.VzQ, this.iR, this.vb, true, iMZk);
                            com.bytedance.sdk.openadsdk.core.VJ.bg(false);
                            if (this.bg) {
                                com.bytedance.sdk.openadsdk.core.model.tuV tuv3 = this.ldr;
                                com.bytedance.sdk.openadsdk.core.model.eo eoVar3 = this.VB;
                                java.lang.String str4 = this.iR;
                                java.util.Map<java.lang.String, java.lang.Object> map3 = this.xxp;
                                if (z) {
                                    i3 = 1;
                                } else {
                                    i3 = 2;
                                }
                                com.bytedance.sdk.openadsdk.eqN.bX.bg(com.json.z8.CLICK, tuv3, eoVar3, str4, zBg, map3, i3);
                            }
                        }
                    } else {
                        if (this.Ta == null || this.IL) {
                            com.bytedance.sdk.openadsdk.core.model.tuV tuv4 = this.ldr;
                            com.bytedance.sdk.openadsdk.core.model.eo eoVar4 = this.VB;
                            java.lang.String str5 = this.iR;
                            java.util.Map<java.lang.String, java.lang.Object> map4 = this.xxp;
                            if (z) {
                                i2 = 1;
                            } else {
                                i2 = 2;
                            }
                            com.bytedance.sdk.openadsdk.eqN.bX.bg("click_button", tuv4, eoVar4, str5, true, map4, i2);
                        }
                        if (view2 != null) {
                            try {
                                if (view.getId() == 520093726 && !(view2 instanceof com.bytedance.sdk.openadsdk.core.Ta.IL.ldr)) {
                                    bool = (java.lang.Boolean) view2.getTag(520093762);
                                    if (bool.booleanValue()) {
                                        com.bytedance.sdk.openadsdk.core.VJ.bg(true);
                                    }
                                } else {
                                    com.bytedance.sdk.openadsdk.core.VJ.bg(true);
                                }
                            } catch (java.lang.Exception unused) {
                            }
                        } else {
                            bool = (java.lang.Boolean) view2.getTag(520093762);
                            if (bool.booleanValue()) {
                                com.bytedance.sdk.openadsdk.core.VJ.bg(true);
                            }
                        }
                        activityBg = view2 != null ? com.bytedance.sdk.component.utils.IL.bg(view) : null;
                        if (activityBg == null) {
                            context = this.eqN;
                        } else {
                            context = activityBg;
                        }
                        zBg = com.bytedance.sdk.openadsdk.core.VJ.bg(context, this.ldr, this.Kg, this.Ta, this.VzQ, this.iR, this.vb, true, iMZk);
                        com.bytedance.sdk.openadsdk.core.VJ.bg(false);
                        if (this.bg) {
                            com.bytedance.sdk.openadsdk.core.model.tuV tuv5 = this.ldr;
                            com.bytedance.sdk.openadsdk.core.model.eo eoVar5 = this.VB;
                            java.lang.String str6 = this.iR;
                            java.util.Map<java.lang.String, java.lang.Object> map5 = this.xxp;
                            if (z) {
                                i3 = 1;
                            } else {
                                i3 = 2;
                            }
                            com.bytedance.sdk.openadsdk.eqN.bX.bg(com.json.z8.CLICK, tuv5, eoVar5, str6, zBg, map5, i3);
                        }
                    }
                } else {
                    if (this.Ta == null) {
                        com.bytedance.sdk.openadsdk.core.model.tuV tuv6 = this.ldr;
                        com.bytedance.sdk.openadsdk.core.model.eo eoVar6 = this.VB;
                        java.lang.String str7 = this.iR;
                        java.util.Map<java.lang.String, java.lang.Object> map6 = this.xxp;
                        if (z) {
                            i2 = 1;
                        } else {
                            i2 = 2;
                        }
                        com.bytedance.sdk.openadsdk.eqN.bX.bg("click_button", tuv6, eoVar6, str7, true, map6, i2);
                    } else {
                        com.bytedance.sdk.openadsdk.core.model.tuV tuv7 = this.ldr;
                        com.bytedance.sdk.openadsdk.core.model.eo eoVar7 = this.VB;
                        java.lang.String str8 = this.iR;
                        java.util.Map<java.lang.String, java.lang.Object> map7 = this.xxp;
                        if (z) {
                            i2 = 1;
                        } else {
                            i2 = 2;
                        }
                        com.bytedance.sdk.openadsdk.eqN.bX.bg("click_button", tuv7, eoVar7, str8, true, map7, i2);
                    }
                    if (view2 != null) {
                        if (view.getId() == 520093726) {
                        }
                        com.bytedance.sdk.openadsdk.core.VJ.bg(true);
                    } else {
                        bool = (java.lang.Boolean) view2.getTag(520093762);
                        if (bool.booleanValue()) {
                            com.bytedance.sdk.openadsdk.core.VJ.bg(true);
                        }
                    }
                    if (view2 != null) {
                    }
                    if (activityBg == null) {
                        context = this.eqN;
                    } else {
                        context = activityBg;
                    }
                    zBg = com.bytedance.sdk.openadsdk.core.VJ.bg(context, this.ldr, this.Kg, this.Ta, this.VzQ, this.iR, this.vb, true, iMZk);
                    com.bytedance.sdk.openadsdk.core.VJ.bg(false);
                    if (this.bg) {
                        com.bytedance.sdk.openadsdk.core.model.tuV tuv8 = this.ldr;
                        com.bytedance.sdk.openadsdk.core.model.eo eoVar8 = this.VB;
                        java.lang.String str9 = this.iR;
                        java.util.Map<java.lang.String, java.lang.Object> map8 = this.xxp;
                        if (z) {
                            i3 = 1;
                        } else {
                            i3 = 2;
                        }
                        com.bytedance.sdk.openadsdk.eqN.bX.bg(com.json.z8.CLICK, tuv8, eoVar8, str9, zBg, map8, i3);
                    }
                }
            } else if (iJz != 4) {
                if (iJz == 5) {
                    java.lang.String strIL = IL(this.iR);
                    if (!android.text.TextUtils.isEmpty(strIL)) {
                        com.bytedance.sdk.openadsdk.eqN.bX.bg("click_call", this.ldr, this.VB, strIL, true, this.xxp, z ? 1 : 2);
                    }
                    com.bytedance.sdk.openadsdk.eqN.bX.bg(com.json.z8.CLICK, this.ldr, this.VB, this.iR, com.bytedance.sdk.openadsdk.utils.ayS.bX(view.getContext(), this.ldr.gXn()), this.xxp, z ? 1 : 2);
                    view2 = view;
                } else if (iJz != 8) {
                    view2 = view;
                    iJz = -1;
                } else {
                    view2 = view;
                    if (iJz == 3) {
                        strGvG = this.ldr.GvG();
                        if (android.text.TextUtils.isEmpty(strGvG)) {
                            if (this.Ta == null) {
                                com.bytedance.sdk.openadsdk.core.model.tuV tuv9 = this.ldr;
                                com.bytedance.sdk.openadsdk.core.model.eo eoVar9 = this.VB;
                                java.lang.String str10 = this.iR;
                                java.util.Map<java.lang.String, java.lang.Object> map9 = this.xxp;
                                if (z) {
                                    i2 = 1;
                                } else {
                                    i2 = 2;
                                }
                                com.bytedance.sdk.openadsdk.eqN.bX.bg("click_button", tuv9, eoVar9, str10, true, map9, i2);
                            } else {
                                com.bytedance.sdk.openadsdk.core.model.tuV tuv10 = this.ldr;
                                com.bytedance.sdk.openadsdk.core.model.eo eoVar10 = this.VB;
                                java.lang.String str11 = this.iR;
                                java.util.Map<java.lang.String, java.lang.Object> map10 = this.xxp;
                                if (z) {
                                    i2 = 1;
                                } else {
                                    i2 = 2;
                                }
                                com.bytedance.sdk.openadsdk.eqN.bX.bg("click_button", tuv10, eoVar10, str11, true, map10, i2);
                            }
                            if (view2 != null) {
                                if (view.getId() == 520093726) {
                                }
                                com.bytedance.sdk.openadsdk.core.VJ.bg(true);
                            } else {
                                bool = (java.lang.Boolean) view2.getTag(520093762);
                                if (bool.booleanValue()) {
                                    com.bytedance.sdk.openadsdk.core.VJ.bg(true);
                                }
                            }
                            if (view2 != null) {
                            }
                            if (activityBg == null) {
                                context = this.eqN;
                            } else {
                                context = activityBg;
                            }
                            zBg = com.bytedance.sdk.openadsdk.core.VJ.bg(context, this.ldr, this.Kg, this.Ta, this.VzQ, this.iR, this.vb, true, iMZk);
                            com.bytedance.sdk.openadsdk.core.VJ.bg(false);
                            if (this.bg) {
                                com.bytedance.sdk.openadsdk.core.model.tuV tuv11 = this.ldr;
                                com.bytedance.sdk.openadsdk.core.model.eo eoVar11 = this.VB;
                                java.lang.String str12 = this.iR;
                                java.util.Map<java.lang.String, java.lang.Object> map11 = this.xxp;
                                if (z) {
                                    i3 = 1;
                                } else {
                                    i3 = 2;
                                }
                                com.bytedance.sdk.openadsdk.eqN.bX.bg(com.json.z8.CLICK, tuv11, eoVar11, str12, zBg, map11, i3);
                            }
                        } else {
                            if (this.Ta == null) {
                                com.bytedance.sdk.openadsdk.core.model.tuV tuv12 = this.ldr;
                                com.bytedance.sdk.openadsdk.core.model.eo eoVar12 = this.VB;
                                java.lang.String str13 = this.iR;
                                java.util.Map<java.lang.String, java.lang.Object> map12 = this.xxp;
                                if (z) {
                                    i2 = 1;
                                } else {
                                    i2 = 2;
                                }
                                com.bytedance.sdk.openadsdk.eqN.bX.bg("click_button", tuv12, eoVar12, str13, true, map12, i2);
                            } else {
                                com.bytedance.sdk.openadsdk.core.model.tuV tuv13 = this.ldr;
                                com.bytedance.sdk.openadsdk.core.model.eo eoVar13 = this.VB;
                                java.lang.String str14 = this.iR;
                                java.util.Map<java.lang.String, java.lang.Object> map13 = this.xxp;
                                if (z) {
                                    i2 = 1;
                                } else {
                                    i2 = 2;
                                }
                                com.bytedance.sdk.openadsdk.eqN.bX.bg("click_button", tuv13, eoVar13, str14, true, map13, i2);
                            }
                            if (view2 != null) {
                                if (view.getId() == 520093726) {
                                }
                                com.bytedance.sdk.openadsdk.core.VJ.bg(true);
                            } else {
                                bool = (java.lang.Boolean) view2.getTag(520093762);
                                if (bool.booleanValue()) {
                                    com.bytedance.sdk.openadsdk.core.VJ.bg(true);
                                }
                            }
                            if (view2 != null) {
                            }
                            if (activityBg == null) {
                                context = this.eqN;
                            } else {
                                context = activityBg;
                            }
                            zBg = com.bytedance.sdk.openadsdk.core.VJ.bg(context, this.ldr, this.Kg, this.Ta, this.VzQ, this.iR, this.vb, true, iMZk);
                            com.bytedance.sdk.openadsdk.core.VJ.bg(false);
                            if (this.bg) {
                                com.bytedance.sdk.openadsdk.core.model.tuV tuv14 = this.ldr;
                                com.bytedance.sdk.openadsdk.core.model.eo eoVar14 = this.VB;
                                java.lang.String str15 = this.iR;
                                java.util.Map<java.lang.String, java.lang.Object> map14 = this.xxp;
                                if (z) {
                                    i3 = 1;
                                } else {
                                    i3 = 2;
                                }
                                com.bytedance.sdk.openadsdk.eqN.bX.bg(com.json.z8.CLICK, tuv14, eoVar14, str15, zBg, map14, i3);
                            }
                        }
                    } else {
                        if (this.Ta == null) {
                            com.bytedance.sdk.openadsdk.core.model.tuV tuv15 = this.ldr;
                            com.bytedance.sdk.openadsdk.core.model.eo eoVar15 = this.VB;
                            java.lang.String str16 = this.iR;
                            java.util.Map<java.lang.String, java.lang.Object> map15 = this.xxp;
                            if (z) {
                                i2 = 1;
                            } else {
                                i2 = 2;
                            }
                            com.bytedance.sdk.openadsdk.eqN.bX.bg("click_button", tuv15, eoVar15, str16, true, map15, i2);
                        } else {
                            com.bytedance.sdk.openadsdk.core.model.tuV tuv16 = this.ldr;
                            com.bytedance.sdk.openadsdk.core.model.eo eoVar16 = this.VB;
                            java.lang.String str17 = this.iR;
                            java.util.Map<java.lang.String, java.lang.Object> map16 = this.xxp;
                            if (z) {
                                i2 = 1;
                            } else {
                                i2 = 2;
                            }
                            com.bytedance.sdk.openadsdk.eqN.bX.bg("click_button", tuv16, eoVar16, str17, true, map16, i2);
                        }
                        if (view2 != null) {
                            if (view.getId() == 520093726) {
                            }
                            com.bytedance.sdk.openadsdk.core.VJ.bg(true);
                        } else {
                            bool = (java.lang.Boolean) view2.getTag(520093762);
                            if (bool.booleanValue()) {
                                com.bytedance.sdk.openadsdk.core.VJ.bg(true);
                            }
                        }
                        if (view2 != null) {
                        }
                        if (activityBg == null) {
                            context = this.eqN;
                        } else {
                            context = activityBg;
                        }
                        zBg = com.bytedance.sdk.openadsdk.core.VJ.bg(context, this.ldr, this.Kg, this.Ta, this.VzQ, this.iR, this.vb, true, iMZk);
                        com.bytedance.sdk.openadsdk.core.VJ.bg(false);
                        if (this.bg) {
                            com.bytedance.sdk.openadsdk.core.model.tuV tuv17 = this.ldr;
                            com.bytedance.sdk.openadsdk.core.model.eo eoVar17 = this.VB;
                            java.lang.String str18 = this.iR;
                            java.util.Map<java.lang.String, java.lang.Object> map17 = this.xxp;
                            if (z) {
                                i3 = 1;
                            } else {
                                i3 = 2;
                            }
                            com.bytedance.sdk.openadsdk.eqN.bX.bg(com.json.z8.CLICK, tuv17, eoVar17, str18, zBg, map17, i3);
                        }
                    }
                }
            } else if (com.bytedance.sdk.openadsdk.core.model.rri.IL(this.ldr) && (this.Ta != null || this.VzQ != null)) {
                view2 = view;
                activityBg = view2 != null ? com.bytedance.sdk.component.utils.IL.bg(view) : null;
                boolean zBg2 = com.bytedance.sdk.openadsdk.core.VJ.bg(activityBg == null ? this.eqN : activityBg, this.ldr, this.Kg, this.Ta, this.VzQ, this.iR, this.vb, true, iMZk);
                if (this.bg) {
                    com.bytedance.sdk.openadsdk.eqN.bX.bg(com.json.z8.CLICK, this.ldr, this.VB, this.iR, zBg2, this.xxp, z ? 1 : 2);
                }
            } else {
                view2 = view;
                if (this.vb != null) {
                    this.vb.eqN();
                    java.util.Map<java.lang.String, java.lang.Object> map18 = this.xxp;
                    if (this.ldr.zx() && !this.ldr.eqN()) {
                        map18.put("auto_click", java.lang.Boolean.TRUE);
                        this.ldr.IL(false);
                    }
                    if (this.bg) {
                        com.bytedance.sdk.openadsdk.eqN.bX.bg(com.json.z8.CLICK, this.ldr, this.VB, this.iR, true, map18, z ? 1 : 2);
                    }
                }
            }
            if (this.PX != null) {
                this.PX.bg(view2, iJz);
            }
        }
    }

    protected boolean bg() {
        if (this.ldr == null) {
            return true;
        }
        int iIL = com.bytedance.sdk.openadsdk.core.VzQ.eqN().IL(this.ldr.IGR());
        int iBX = com.bytedance.sdk.component.utils.Lq.bX(com.bytedance.sdk.openadsdk.core.VzQ.bg());
        if (iIL == 1) {
            return com.bytedance.sdk.openadsdk.utils.ayS.eqN(iBX);
        }
        if (iIL == 2) {
            return com.bytedance.sdk.openadsdk.utils.ayS.zx(iBX) || com.bytedance.sdk.openadsdk.utils.ayS.eqN(iBX) || com.bytedance.sdk.openadsdk.utils.ayS.ldr(iBX);
        }
        if (iIL != 3) {
            return iIL != 5 || com.bytedance.sdk.openadsdk.utils.ayS.eqN(iBX) || com.bytedance.sdk.openadsdk.utils.ayS.ldr(iBX);
        }
        return false;
    }

    private boolean Kg() {
        return com.bytedance.sdk.openadsdk.core.model.tuV.zx(this.ldr) && this.ldr.kMt() == 1;
    }

    private boolean eqN(android.view.View view) {
        if (view == null) {
            return false;
        }
        if ((view instanceof com.bytedance.sdk.openadsdk.core.Ta.IL.ldr) || view.getId() == com.bytedance.sdk.openadsdk.utils.Ta.ews || view.getId() == com.bytedance.sdk.openadsdk.utils.Ta.qC || view.getId() == com.bytedance.sdk.openadsdk.utils.Ta.Dxa || view.getId() == com.bytedance.sdk.openadsdk.utils.Ta.bN || view.getId() == com.bytedance.sdk.openadsdk.utils.Ta.jz || view.getId() == 520093726 || view.getId() == com.bytedance.sdk.openadsdk.utils.Ta.yda) {
            return true;
        }
        if (!(view instanceof android.view.ViewGroup)) {
            return false;
        }
        int i = 0;
        while (true) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            if (i >= viewGroup.getChildCount()) {
                return false;
            }
            if (eqN(viewGroup.getChildAt(i))) {
                return true;
            }
            i++;
        }
    }

    private boolean WR() {
        return this instanceof com.bytedance.sdk.openadsdk.core.Kg.Kg;
    }

    private boolean eo() {
        if (this.ldr == null || WR()) {
            return false;
        }
        if (this.ldr.bOf() != 5 && this.ldr.bOf() != 15) {
            return false;
        }
        if (this.ZQc == 0) {
            this.ZQc = this.ldr.Fx();
        }
        IL();
        bg();
        bX();
        if (this.ZQc == 5 && Kg() && bg() && !IL() && !bX()) {
            return false;
        }
        int i = this.ZQc;
        return i == 1 || i == 2 || i == 5;
    }

    private java.lang.String IL(java.lang.String str) {
        str.hashCode();
        switch (str) {
            case "banner_ad":
                return "banner_call";
            case "open_ad":
                return "open_ad";
            case "embeded_ad":
                return "feed_call";
            case "interaction":
                return "interaction_call";
            case "slide_banner_ad":
                return "banner_call";
            default:
                return "";
        }
    }

    public void bX(boolean z) {
        this.bX = z;
    }

    public void bg(com.bytedance.sdk.openadsdk.core.IL.bg.InterfaceC0132bg interfaceC0132bg) {
        this.ayS = new java.lang.ref.WeakReference<>(interfaceC0132bg);
    }
}
