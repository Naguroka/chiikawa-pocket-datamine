package com.bytedance.sdk.openadsdk.eqN.bg;

/* JADX INFO: loaded from: classes4.dex */
public class eo implements com.bytedance.sdk.component.ldr.bg.IL.bX {
    private final com.bytedance.sdk.openadsdk.eqN.bg.bX IL = com.bytedance.sdk.openadsdk.eqN.bg.bX.bg();
    public com.bytedance.sdk.openadsdk.core.Fy<com.bytedance.sdk.openadsdk.eqN.bg> bg;

    @Override // com.bytedance.sdk.component.ldr.bg.IL.bX
    public void bg(final java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> list, final com.bytedance.sdk.component.ldr.bg.IL.IL il) {
        com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar;
        if (list == null || list.isEmpty() || (bgVar = list.get(0)) == null) {
            return;
        }
        byte bEqN = bgVar.eqN();
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        if (bEqN == 0) {
            com.bytedance.sdk.openadsdk.p002vb.eqN.bg(new com.bytedance.sdk.openadsdk.p002vb.zx() { // from class: com.bytedance.sdk.openadsdk.eqN.bg.eo.1
                @Override // com.bytedance.sdk.openadsdk.p002vb.zx
                public com.bytedance.sdk.openadsdk.p002vb.IL.bg generatorModel() {
                    com.bytedance.sdk.openadsdk.p002vb.IL.bg bgVar2 = new com.bytedance.sdk.openadsdk.p002vb.IL.bg();
                    bgVar2.IL("applog");
                    return bgVar2;
                }
            });
            com.bytedance.sdk.openadsdk.utils.VJ.bg(new com.bytedance.sdk.component.Kg.bX.IL(7, "upload_ad_event") { // from class: com.bytedance.sdk.openadsdk.eqN.bg.eo.2
                @Override // java.lang.Runnable
                public void run() {
                    java.util.Iterator it;
                    try {
                        it = com.bytedance.sdk.openadsdk.eqN.bg.eo.this.eqN(list).entrySet().iterator();
                    } catch (java.lang.Throwable th) {
                        com.bytedance.sdk.component.utils.PX.bg("OverSeaEventUploadImp", th.getMessage());
                        it = null;
                    }
                    if (it == null) {
                        com.bytedance.sdk.component.ldr.bg.IL.IL il2 = il;
                        if (il2 != null) {
                            il2.bg(arrayList);
                            return;
                        }
                        return;
                    }
                    while (it.hasNext()) {
                        try {
                            com.bytedance.sdk.openadsdk.eqN.bg.bg.bg(com.bytedance.sdk.openadsdk.eqN.bg.bg.eqN);
                            java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> list2 = (java.util.List) ((java.util.Map.Entry) it.next()).getValue();
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            for (com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar2 : list2) {
                                arrayList2.add(new com.bytedance.sdk.openadsdk.eqN.bg(bgVar2.bX(), bgVar2.iR()));
                            }
                            com.bytedance.sdk.openadsdk.eqN.zx zxVarBg = com.bytedance.sdk.openadsdk.eqN.bg.eo.this.bg(arrayList2);
                            if (il != null && zxVarBg != null) {
                                boolean z = zxVarBg.eqN;
                                if (com.bytedance.sdk.openadsdk.eqN.bg.eo.this.bg(arrayList2, zxVarBg)) {
                                    z = true;
                                }
                                arrayList.add(new com.bytedance.sdk.component.ldr.bg.IL.bX.bg(new com.bytedance.sdk.component.ldr.bg.IL.bX.IL(zxVarBg.bg, zxVarBg.IL, zxVarBg.bX, z, ""), list2));
                                if (zxVarBg.IL == 200) {
                                    com.bytedance.sdk.openadsdk.eqN.bg.bg.bg(com.bytedance.sdk.openadsdk.eqN.bg.bg.eqN, true);
                                    com.bytedance.sdk.openadsdk.p002vb.eqN.IL(new com.bytedance.sdk.openadsdk.p002vb.zx() { // from class: com.bytedance.sdk.openadsdk.eqN.bg.eo.2.1
                                        @Override // com.bytedance.sdk.openadsdk.p002vb.zx
                                        public com.bytedance.sdk.openadsdk.p002vb.IL.bg generatorModel() {
                                            com.bytedance.sdk.openadsdk.p002vb.IL.bg bgVar3 = new com.bytedance.sdk.openadsdk.p002vb.IL.bg();
                                            bgVar3.IL("applog");
                                            return bgVar3;
                                        }
                                    });
                                } else if (z) {
                                    com.bytedance.sdk.openadsdk.eqN.bg.bg.bg(com.bytedance.sdk.openadsdk.eqN.bg.bg.eqN, false);
                                    com.bytedance.sdk.openadsdk.p002vb.eqN.bX(new com.bytedance.sdk.openadsdk.p002vb.zx() { // from class: com.bytedance.sdk.openadsdk.eqN.bg.eo.2.2
                                        @Override // com.bytedance.sdk.openadsdk.p002vb.zx
                                        public com.bytedance.sdk.openadsdk.p002vb.IL.bg generatorModel() {
                                            com.bytedance.sdk.openadsdk.p002vb.IL.bg bgVar3 = new com.bytedance.sdk.openadsdk.p002vb.IL.bg();
                                            bgVar3.IL("applog");
                                            return bgVar3;
                                        }
                                    });
                                } else {
                                    com.bytedance.sdk.openadsdk.p002vb.eqN.bX(new com.bytedance.sdk.openadsdk.p002vb.zx() { // from class: com.bytedance.sdk.openadsdk.eqN.bg.eo.2.3
                                        @Override // com.bytedance.sdk.openadsdk.p002vb.zx
                                        public com.bytedance.sdk.openadsdk.p002vb.IL.bg generatorModel() {
                                            com.bytedance.sdk.openadsdk.p002vb.IL.bg bgVar3 = new com.bytedance.sdk.openadsdk.p002vb.IL.bg();
                                            bgVar3.IL("applog");
                                            return bgVar3;
                                        }
                                    });
                                }
                            }
                            if (il != null && zxVarBg == null) {
                                com.bytedance.sdk.openadsdk.p002vb.eqN.bX(new com.bytedance.sdk.openadsdk.p002vb.zx() { // from class: com.bytedance.sdk.openadsdk.eqN.bg.eo.2.4
                                    @Override // com.bytedance.sdk.openadsdk.p002vb.zx
                                    public com.bytedance.sdk.openadsdk.p002vb.IL.bg generatorModel() {
                                        com.bytedance.sdk.openadsdk.p002vb.IL.bg bgVar3 = new com.bytedance.sdk.openadsdk.p002vb.IL.bg();
                                        bgVar3.IL("applog");
                                        return bgVar3;
                                    }
                                });
                            }
                        } catch (java.lang.Throwable th2) {
                            com.bytedance.sdk.component.utils.PX.bg("OverSeaEventUploadImp", th2.getMessage());
                        }
                    }
                    com.bytedance.sdk.component.ldr.bg.IL.IL il3 = il;
                    if (il3 != null) {
                        il3.bg(arrayList);
                    }
                }
            });
            return;
        }
        if (bEqN == 1) {
            final java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar2 : list) {
                arrayList2.add(new com.bytedance.sdk.openadsdk.yDt.bX.bX.bg(bgVar2.bX(), bgVar2.iR()));
            }
            com.bytedance.sdk.openadsdk.eqN.bg.bg.bg(com.bytedance.sdk.openadsdk.eqN.bg.bg.zx);
            if (arrayList2.size() > 0) {
                com.bytedance.sdk.openadsdk.p002vb.eqN.bg(new com.bytedance.sdk.openadsdk.p002vb.zx() { // from class: com.bytedance.sdk.openadsdk.eqN.bg.eo.3
                    @Override // com.bytedance.sdk.openadsdk.p002vb.zx
                    public com.bytedance.sdk.openadsdk.p002vb.IL.bg generatorModel() {
                        com.bytedance.sdk.openadsdk.p002vb.IL.bg bgVar3 = new com.bytedance.sdk.openadsdk.p002vb.IL.bg();
                        bgVar3.IL("stats");
                        return bgVar3;
                    }
                });
                com.bytedance.sdk.openadsdk.utils.VJ.bg(new com.bytedance.sdk.component.Kg.bX.IL(6, "upload_stats_event") { // from class: com.bytedance.sdk.openadsdk.eqN.bg.eo.4
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.openadsdk.eqN.zx zxVarIL = com.bytedance.sdk.openadsdk.eqN.bg.eo.this.IL(arrayList2);
                        if (il != null && zxVarIL != null) {
                            arrayList.add(new com.bytedance.sdk.component.ldr.bg.IL.bX.bg(new com.bytedance.sdk.component.ldr.bg.IL.bX.IL(zxVarIL.bg, zxVarIL.IL, zxVarIL.bX, zxVarIL.eqN, ""), list));
                            il.bg(arrayList);
                            if (zxVarIL.IL == 200) {
                                com.bytedance.sdk.openadsdk.eqN.bg.bg.bg(com.bytedance.sdk.openadsdk.eqN.bg.bg.zx, true);
                                com.bytedance.sdk.openadsdk.p002vb.eqN.IL(new com.bytedance.sdk.openadsdk.p002vb.zx() { // from class: com.bytedance.sdk.openadsdk.eqN.bg.eo.4.1
                                    @Override // com.bytedance.sdk.openadsdk.p002vb.zx
                                    public com.bytedance.sdk.openadsdk.p002vb.IL.bg generatorModel() {
                                        com.bytedance.sdk.openadsdk.p002vb.IL.bg bgVar3 = new com.bytedance.sdk.openadsdk.p002vb.IL.bg();
                                        bgVar3.IL("stats");
                                        return bgVar3;
                                    }
                                });
                            } else if (zxVarIL.eqN) {
                                com.bytedance.sdk.openadsdk.eqN.bg.bg.bg(com.bytedance.sdk.openadsdk.eqN.bg.bg.zx, false);
                                com.bytedance.sdk.openadsdk.p002vb.eqN.bX(new com.bytedance.sdk.openadsdk.p002vb.zx() { // from class: com.bytedance.sdk.openadsdk.eqN.bg.eo.4.2
                                    @Override // com.bytedance.sdk.openadsdk.p002vb.zx
                                    public com.bytedance.sdk.openadsdk.p002vb.IL.bg generatorModel() {
                                        com.bytedance.sdk.openadsdk.p002vb.IL.bg bgVar3 = new com.bytedance.sdk.openadsdk.p002vb.IL.bg();
                                        bgVar3.IL("stats");
                                        return bgVar3;
                                    }
                                });
                            } else {
                                com.bytedance.sdk.openadsdk.p002vb.eqN.bX(new com.bytedance.sdk.openadsdk.p002vb.zx() { // from class: com.bytedance.sdk.openadsdk.eqN.bg.eo.4.3
                                    @Override // com.bytedance.sdk.openadsdk.p002vb.zx
                                    public com.bytedance.sdk.openadsdk.p002vb.IL.bg generatorModel() {
                                        com.bytedance.sdk.openadsdk.p002vb.IL.bg bgVar3 = new com.bytedance.sdk.openadsdk.p002vb.IL.bg();
                                        bgVar3.IL("stats");
                                        return bgVar3;
                                    }
                                });
                            }
                        }
                        if (il == null || zxVarIL != null) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.p002vb.eqN.bX(new com.bytedance.sdk.openadsdk.p002vb.zx() { // from class: com.bytedance.sdk.openadsdk.eqN.bg.eo.4.4
                            @Override // com.bytedance.sdk.openadsdk.p002vb.zx
                            public com.bytedance.sdk.openadsdk.p002vb.IL.bg generatorModel() {
                                com.bytedance.sdk.openadsdk.p002vb.IL.bg bgVar3 = new com.bytedance.sdk.openadsdk.p002vb.IL.bg();
                                bgVar3.IL("stats");
                                return bgVar3;
                            }
                        });
                    }
                });
            }
        }
    }

    private boolean bX(java.util.List<com.bytedance.sdk.openadsdk.eqN.bg> list) {
        org.json.JSONObject jSONObjectBX;
        if (list == null || list.size() == 0 || (jSONObjectBX = list.get(0).bX()) == null) {
            return true;
        }
        return android.text.TextUtils.isEmpty(jSONObjectBX.optString("app_log_url"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean bg(java.util.List<com.bytedance.sdk.openadsdk.eqN.bg> list, com.bytedance.sdk.openadsdk.eqN.zx zxVar) {
        return !bX(list) && zxVar.IL >= 400 && zxVar.IL < 500;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.util.HashMap<java.lang.String, java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg>> eqN(java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> list) {
        java.util.HashMap<java.lang.String, java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg>> map = new java.util.HashMap<>();
        new java.util.ArrayList();
        for (int i = 0; i < list.size(); i++) {
            com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar = list.get(i);
            org.json.JSONObject jSONObjectIR = bgVar.iR();
            if (jSONObjectIR != null) {
                java.lang.String strOptString = jSONObjectIR.optString("app_log_url");
                java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> arrayList = map.get(strOptString);
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList<>();
                    map.put(strOptString, arrayList);
                }
                arrayList.add(bgVar);
            }
        }
        return map;
    }

    public com.bytedance.sdk.openadsdk.eqN.zx bg(java.util.List<com.bytedance.sdk.openadsdk.eqN.bg> list) {
        if (this.bg == null) {
            this.bg = com.bytedance.sdk.openadsdk.core.VzQ.bX();
        }
        if (this.bg == null) {
            return null;
        }
        int iDS = com.bytedance.sdk.openadsdk.core.settings.xxp.zU().dS();
        if (3 == iDS) {
            return this.bg.bg(this.IL.bg(this.IL.bg(list, false), java.lang.System.currentTimeMillis(), this.IL.IL(), true), this.IL.bg(list), true);
        }
        if (2 == iDS) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            org.json.JSONObject jSONObjectIL = this.IL.IL();
            this.bg.bg(this.IL.bg(this.IL.bg(list, true), jCurrentTimeMillis, jSONObjectIL, true), this.IL.bg(list), true);
            return this.bg.bg(this.IL.bg(this.IL.IL(list), jCurrentTimeMillis, jSONObjectIL, false), this.IL.bg(list), false);
        }
        return this.bg.bg(this.IL.bg(list, java.lang.System.currentTimeMillis(), this.IL.IL(), false), this.IL.bg(list), false);
    }

    public com.bytedance.sdk.openadsdk.eqN.zx IL(java.util.List<com.bytedance.sdk.openadsdk.yDt.bX.bX.bg> list) {
        if (this.bg == null) {
            this.bg = com.bytedance.sdk.openadsdk.core.VzQ.bX();
        }
        if (list != null && list.size() != 0 && com.bytedance.sdk.openadsdk.core.settings.PX.bg()) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                java.util.Iterator<com.bytedance.sdk.openadsdk.yDt.bX.bX.bg> it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().IL);
                }
                jSONObject.put("stats_list", jSONArray);
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                long j = jCurrentTimeMillis / 1000;
                jSONObject.put("ts", j);
                jSONObject.put("ts_ms", jCurrentTimeMillis);
                java.lang.String strEqN = com.bytedance.sdk.openadsdk.core.WR.IL().eqN();
                if (strEqN == null) {
                    strEqN = "";
                }
                java.lang.String strBg = com.bytedance.sdk.openadsdk.utils.rri.bg();
                java.lang.StringBuilder sbAppend = new java.lang.StringBuilder(strEqN).append(j).append(com.bytedance.sdk.openadsdk.BuildConfig.VERSION_NAME);
                java.lang.StringBuilder sbAppend2 = new java.lang.StringBuilder(strBg).append("-").append(jCurrentTimeMillis);
                jSONObject.put("req_sign", com.bytedance.sdk.component.utils.zx.bg(sbAppend.toString()));
                jSONObject.put("req_uniq", com.bytedance.sdk.component.utils.zx.bg(sbAppend2.toString()));
                return this.bg.IL(jSONObject);
            } catch (java.lang.Throwable unused) {
            }
        }
        return null;
    }
}
