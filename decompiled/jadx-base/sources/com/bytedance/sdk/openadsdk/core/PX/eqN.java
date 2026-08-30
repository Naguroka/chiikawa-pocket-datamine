package com.bytedance.sdk.openadsdk.core.PX;

/* JADX INFO: loaded from: classes4.dex */
public class eqN {
    private boolean Fy;
    private java.lang.String LZ;
    private final com.bytedance.sdk.openadsdk.core.PX.bg Ta;
    private boolean VzQ;
    private boolean tuV;
    private long vb;
    private com.bytedance.sdk.openadsdk.core.model.tuV xxp;
    public java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bX> bg = new java.util.ArrayList();
    public java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bX> IL = new java.util.ArrayList();
    public java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bX> bX = new java.util.ArrayList();
    public java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bX> eqN = new java.util.ArrayList();
    public java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bX> zx = new java.util.ArrayList();
    public java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bX> ldr = new java.util.ArrayList();
    public java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bX> iR = new java.util.ArrayList();
    public java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bX> Kg = new java.util.ArrayList();
    public java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bX> WR = new java.util.ArrayList();
    public java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bX> eo = new java.util.ArrayList();
    public java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.IL> VB = new java.util.ArrayList();
    public java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bg> PX = new java.util.ArrayList();
    private final java.util.concurrent.atomic.AtomicBoolean yDt = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.concurrent.atomic.AtomicBoolean Lq = new java.util.concurrent.atomic.AtomicBoolean(false);

    public eqN(com.bytedance.sdk.openadsdk.core.PX.bg bgVar) {
        this.Ta = bgVar;
    }

    public void bg(com.bytedance.sdk.openadsdk.core.PX.bg.bg bgVar) {
        bg(-1L, this.bg, bgVar);
    }

    public void bg(long j) {
        if (this.yDt.compareAndSet(false, true)) {
            bg(j, this.IL, null, new com.bytedance.sdk.openadsdk.core.PX.IL.bX.IL("show_impression", this.xxp));
        }
    }

    public void IL(long j) {
        bg(j, this.bX, (com.bytedance.sdk.openadsdk.core.PX.bg.bg) null);
    }

    public void bX(long j) {
        bg(j, this.eqN, (com.bytedance.sdk.openadsdk.core.PX.bg.bg) null);
    }

    public void eqN(long j) {
        bg(j, this.zx, null, new com.bytedance.sdk.openadsdk.core.PX.IL.bX.IL("video_progress", this.xxp, 1.0f));
    }

    public void zx(long j) {
        if (this.Lq.compareAndSet(false, true)) {
            bg(j, this.ldr, (com.bytedance.sdk.openadsdk.core.PX.bg.bg) null);
        }
    }

    public void ldr(long j) {
        bg(j, this.iR, (com.bytedance.sdk.openadsdk.core.PX.bg.bg) null);
    }

    public void iR(long j) {
        bg(j, this.Kg, null, new com.bytedance.sdk.openadsdk.core.PX.IL.bX.IL(com.json.z8.CLICK, this.xxp));
    }

    public void Kg(long j) {
        bg(j, this.WR, (com.bytedance.sdk.openadsdk.core.PX.bg.bg) null);
    }

    public void WR(long j) {
        bg(j, this.eo, (com.bytedance.sdk.openadsdk.core.PX.bg.bg) null);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0077  */
    public void bg(long j, long j2, com.bytedance.sdk.openadsdk.core.PX.ldr ldrVar) {
        if (java.lang.System.currentTimeMillis() - this.vb >= 1000 && j >= 0 && j2 > 0) {
            this.vb = java.lang.System.currentTimeMillis();
            float f = j / j2;
            java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bX> listBg = bg(j, f);
            float f2 = 0.25f;
            if (f >= 0.25f && !this.VzQ) {
                IL("firstQuartile");
                this.VzQ = true;
                if (ldrVar != null) {
                    bg(ldrVar, 6);
                }
            } else {
                f2 = 0.5f;
                if (f >= 0.5f && !this.tuV) {
                    IL("midpoint");
                    this.tuV = true;
                    if (ldrVar != null) {
                        bg(ldrVar, 7);
                    }
                } else {
                    f2 = 0.75f;
                    if (f >= 0.75f && !this.Fy) {
                        IL("thirdQuartile");
                        this.Fy = true;
                        if (ldrVar != null) {
                            bg(ldrVar, 8);
                        }
                    }
                    if (f < 0.03f) {
                        f = 0.0f;
                    }
                    bg(j, listBg, null, new com.bytedance.sdk.openadsdk.core.PX.IL.bX.IL("video_progress", this.xxp, f));
                }
            }
            f = f2;
            if (f < 0.03f) {
                f = 0.0f;
            }
            bg(j, listBg, null, new com.bytedance.sdk.openadsdk.core.PX.IL.bX.IL("video_progress", this.xxp, f));
        }
    }

    private void bg(final com.bytedance.sdk.openadsdk.core.PX.ldr ldrVar, final int i) {
        com.bytedance.sdk.component.utils.iR.IL().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.PX.eqN.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.core.PX.ldr ldrVar2 = ldrVar;
                if (ldrVar2 != null) {
                    ldrVar2.bg(i);
                }
            }
        });
    }

    private void IL(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(androidx.core.app.NotificationCompat.CATEGORY_EVENT, str);
            com.bytedance.sdk.openadsdk.eqN.bX.IL(this.xxp, this.LZ, "vast_play_track", jSONObject);
        } catch (java.lang.Throwable unused) {
        }
    }

    private void bg(long j, java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bX> list, com.bytedance.sdk.openadsdk.core.PX.bg.bg bgVar, com.bytedance.sdk.openadsdk.core.PX.IL.bX.IL il) {
        com.bytedance.sdk.openadsdk.core.PX.bg bgVar2 = this.Ta;
        com.bytedance.sdk.openadsdk.core.PX.IL.bX.bg(list, bgVar, j, bgVar2 != null ? bgVar2.iR() : null, il);
    }

    private void bg(long j, java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bX> list, com.bytedance.sdk.openadsdk.core.PX.bg.bg bgVar) {
        bg(j, list, bgVar, null);
    }

    public java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bX> bg(long j, float f) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < this.VB.size(); i++) {
            com.bytedance.sdk.openadsdk.core.PX.IL.IL il = this.VB.get(i);
            if (il.bg(f)) {
                arrayList.add(il);
            }
        }
        for (int i2 = 0; i2 < this.PX.size(); i2++) {
            com.bytedance.sdk.openadsdk.core.PX.IL.bg bgVar = this.PX.get(i2);
            if (bgVar.bg(j)) {
                arrayList.add(bgVar);
            }
        }
        return arrayList;
    }

    public void bg(java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bX> list) {
        this.IL.addAll(list);
    }

    public void IL(java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bX> list) {
        this.bX.addAll(list);
    }

    public void bX(java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bX> list) {
        this.eqN.addAll(list);
    }

    public void eqN(java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bX> list) {
        this.zx.addAll(list);
    }

    public void zx(java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bX> list) {
        this.ldr.addAll(list);
    }

    public void ldr(java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bX> list) {
        this.iR.addAll(list);
    }

    public void iR(java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bX> list) {
        this.Kg.addAll(list);
    }

    public void Kg(java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.IL> list) {
        this.VB.addAll(list);
        java.util.Collections.sort(this.VB);
    }

    public void WR(java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bg> list) {
        this.PX.addAll(list);
        java.util.Collections.sort(this.PX);
    }

    public void eo(java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bX> list) {
        this.bg.addAll(list);
    }

    public void VB(java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bX> list) {
        this.WR.addAll(list);
    }

    public void PX(java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bX> list) {
        this.eo.addAll(list);
    }

    public org.json.JSONObject bg() throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("errorTrackers", com.bytedance.sdk.openadsdk.core.PX.IL.bX.bg(this.bg));
        jSONObject.put("impressionTrackers", com.bytedance.sdk.openadsdk.core.PX.IL.bX.bg(this.IL));
        jSONObject.put("pauseTrackers", com.bytedance.sdk.openadsdk.core.PX.IL.bX.bg(this.bX));
        jSONObject.put("resumeTrackers", com.bytedance.sdk.openadsdk.core.PX.IL.bX.bg(this.eqN));
        jSONObject.put("completeTrackers", com.bytedance.sdk.openadsdk.core.PX.IL.bX.bg(this.zx));
        jSONObject.put("closeTrackers", com.bytedance.sdk.openadsdk.core.PX.IL.bX.bg(this.ldr));
        jSONObject.put("skipTrackers", com.bytedance.sdk.openadsdk.core.PX.IL.bX.bg(this.iR));
        jSONObject.put("clickTrackers", com.bytedance.sdk.openadsdk.core.PX.IL.bX.bg(this.Kg));
        jSONObject.put("muteTrackers", com.bytedance.sdk.openadsdk.core.PX.IL.bX.bg(this.WR));
        jSONObject.put("unMuteTrackers", com.bytedance.sdk.openadsdk.core.PX.IL.bX.bg(this.eo));
        jSONObject.put("fractionalTrackers", IL());
        jSONObject.put("absoluteTrackers", bX());
        return jSONObject;
    }

    private org.json.JSONArray IL() throws org.json.JSONException {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator<com.bytedance.sdk.openadsdk.core.PX.IL.IL> it = this.VB.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().IL());
        }
        return jSONArray;
    }

    private org.json.JSONArray bX() throws org.json.JSONException {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator<com.bytedance.sdk.openadsdk.core.PX.IL.bg> it = this.PX.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().bg());
        }
        return jSONArray;
    }

    public void bg(org.json.JSONObject jSONObject) {
        eo(com.bytedance.sdk.openadsdk.core.PX.IL.bX.bg(jSONObject.optJSONArray("errorTrackers")));
        bg(com.bytedance.sdk.openadsdk.core.PX.IL.bX.bg(jSONObject.optJSONArray("impressionTrackers")));
        IL(com.bytedance.sdk.openadsdk.core.PX.IL.bX.bg(jSONObject.optJSONArray("pauseTrackers"), true));
        bX(com.bytedance.sdk.openadsdk.core.PX.IL.bX.bg(jSONObject.optJSONArray("resumeTrackers"), true));
        eqN(com.bytedance.sdk.openadsdk.core.PX.IL.bX.bg(jSONObject.optJSONArray("completeTrackers")));
        zx(com.bytedance.sdk.openadsdk.core.PX.IL.bX.bg(jSONObject.optJSONArray("closeTrackers")));
        ldr(com.bytedance.sdk.openadsdk.core.PX.IL.bX.bg(jSONObject.optJSONArray("skipTrackers")));
        iR(com.bytedance.sdk.openadsdk.core.PX.IL.bX.bg(jSONObject.optJSONArray("clickTrackers")));
        VB(com.bytedance.sdk.openadsdk.core.PX.IL.bX.bg(jSONObject.optJSONArray("muteTrackers"), true));
        PX(com.bytedance.sdk.openadsdk.core.PX.IL.bX.bg(jSONObject.optJSONArray("unMuteTrackers"), true));
        Kg(com.bytedance.sdk.openadsdk.core.PX.IL.bX.IL(jSONObject.optJSONArray("fractionalTrackers")));
        WR(com.bytedance.sdk.openadsdk.core.PX.IL.bX.bX(jSONObject.optJSONArray("absoluteTrackers")));
    }

    public void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        this.xxp = tuv;
    }

    public void bg(java.lang.String str) {
        this.LZ = str;
    }

    public void bg(java.lang.String str, long j) {
        if (android.text.TextUtils.isEmpty(str) || j < 0) {
            return;
        }
        WR(java.util.Collections.singletonList(new com.bytedance.sdk.openadsdk.core.PX.IL.bg.C0136bg(str, j).bg()));
    }

    public void bg(java.lang.String str, float f) {
        if (android.text.TextUtils.isEmpty(str) || f < 0.0f) {
            return;
        }
        Kg(java.util.Collections.singletonList(new com.bytedance.sdk.openadsdk.core.PX.IL.IL.bg(str, f).bg()));
    }

    public void bg(com.bytedance.sdk.openadsdk.core.PX.eqN eqn) {
        eo(eqn.bg);
        bg(eqn.IL);
        IL(eqn.bX);
        bX(eqn.eqN);
        eqN(eqn.zx);
        zx(eqn.ldr);
        ldr(eqn.iR);
        iR(eqn.Kg);
        VB(eqn.WR);
        PX(eqn.eo);
        Kg(eqn.VB);
        WR(eqn.PX);
    }
}
