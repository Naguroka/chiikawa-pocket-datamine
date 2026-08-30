package com.bytedance.sdk.openadsdk.core.PX.IL;

/* JADX INFO: loaded from: classes4.dex */
public class bX {
    private com.bytedance.sdk.openadsdk.core.PX.IL.bX.EnumC0135bX IL;
    private boolean bX;
    private final java.lang.String bg;
    private boolean eqN;
    private static final java.util.Map<java.lang.String, com.bytedance.sdk.openadsdk.core.PX.IL.bX.IL> zx = new java.util.concurrent.ConcurrentHashMap();
    private static final java.util.concurrent.atomic.AtomicBoolean ldr = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.PX.IL.bX$bX, reason: collision with other inner class name */
    enum EnumC0135bX {
        TRACKING_URL,
        QUARTILE_EVENT
    }

    static {
        com.bytedance.sdk.component.utils.rri.bg(new com.bytedance.sdk.component.utils.rri.bg() { // from class: com.bytedance.sdk.openadsdk.core.PX.IL.bX.1
            @Override // com.bytedance.sdk.component.utils.rri.bg
            public void bg(android.content.Context context, android.content.Intent intent, boolean z, int i) {
                if (i == 0 || com.bytedance.sdk.openadsdk.core.PX.IL.bX.zx.size() <= 0) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.PX.IL.bX.IL();
            }
        }, com.bytedance.sdk.openadsdk.core.VzQ.bg());
    }

    protected bX(java.lang.String str, com.bytedance.sdk.openadsdk.core.PX.IL.bX.EnumC0135bX enumC0135bX, java.lang.Boolean bool) {
        this.bg = str;
        this.IL = enumC0135bX;
        this.bX = bool.booleanValue();
    }

    public java.lang.String bX() {
        return this.bg;
    }

    public boolean eqN() {
        return this.bX;
    }

    public void j_() {
        this.eqN = true;
    }

    public static class bg {
        private com.bytedance.sdk.openadsdk.core.PX.IL.bX.EnumC0135bX IL = com.bytedance.sdk.openadsdk.core.PX.IL.bX.EnumC0135bX.TRACKING_URL;
        private boolean bX = false;
        private final java.lang.String bg;

        public bg(java.lang.String str) {
            this.bg = str;
        }

        public com.bytedance.sdk.openadsdk.core.PX.IL.bX.bg bg(boolean z) {
            this.bX = z;
            return this;
        }

        public com.bytedance.sdk.openadsdk.core.PX.IL.bX bg() {
            return new com.bytedance.sdk.openadsdk.core.PX.IL.bX(this.bg, this.IL, java.lang.Boolean.valueOf(this.bX));
        }
    }

    public boolean zx() {
        return this.eqN;
    }

    public static java.util.List<java.lang.String> bg(java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bX> list, com.bytedance.sdk.openadsdk.core.PX.bg.bg bgVar, long j, java.lang.String str) {
        if (list == null) {
            return new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        for (com.bytedance.sdk.openadsdk.core.PX.IL.bX bXVar : list) {
            if (bXVar != null && (!bXVar.zx() || bXVar.eqN())) {
                arrayList.add(bXVar.bX());
                bXVar.j_();
            }
        }
        return new com.bytedance.sdk.openadsdk.core.PX.bX.bX(arrayList).bg(bgVar).bg(j).bg(str).bg();
    }

    public static void bg(java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bX> list, com.bytedance.sdk.openadsdk.core.PX.bg.bg bgVar, long j, java.lang.String str, com.bytedance.sdk.openadsdk.core.PX.IL.bX.IL il) {
        bg(bg(list, bgVar, j, str), il);
    }

    public static void IL(java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bX> list, com.bytedance.sdk.openadsdk.core.PX.bg.bg bgVar, long j, java.lang.String str) {
        bg(list, bgVar, j, str, null);
    }

    public static void bg(java.util.List<java.lang.String> list, com.bytedance.sdk.openadsdk.core.PX.IL.bX.IL il) {
        for (int i = 0; i < list.size(); i++) {
            java.lang.String str = list.get(i);
            if (!android.text.TextUtils.isEmpty(str)) {
                bg(str, il, false);
            }
        }
    }

    private static void bg(final java.lang.String str, final com.bytedance.sdk.openadsdk.core.PX.IL.bX.IL il, final boolean z) {
        com.bytedance.sdk.component.iR.IL.IL ilBX = com.bytedance.sdk.openadsdk.xxp.bX.bg().IL().bX();
        if (ilBX == null) {
            return;
        }
        ilBX.bg(true);
        ilBX.IL(str);
        ilBX.bg(new com.bytedance.sdk.component.iR.bg.bg() { // from class: com.bytedance.sdk.openadsdk.core.PX.IL.bX.2
            @Override // com.bytedance.sdk.component.iR.bg.bg
            public void bg(com.bytedance.sdk.component.iR.IL.bX bXVar, com.bytedance.sdk.component.iR.IL il2) {
                boolean z2;
                com.bytedance.sdk.openadsdk.core.PX.IL.bX.IL il3 = il;
                if (il3 == null || il3.IL == null) {
                    return;
                }
                java.lang.String str2 = null;
                if (il2 == null || !il2.ldr()) {
                    z2 = false;
                    if (il2 != null) {
                        str2 = il2.bg() + ":" + il2.IL();
                        if (!z && (il2.bg() <= 300 || il2.bg() >= 400)) {
                            com.bytedance.sdk.openadsdk.core.PX.IL.bX.zx.put(str, il);
                        }
                    }
                } else {
                    z2 = true;
                }
                com.bytedance.sdk.openadsdk.core.PX.IL.bX.IL(z2, str2, com.bytedance.sdk.openadsdk.utils.ayS.bX(il.IL.Fx()), il, str, z);
                if (il2 == null || il2.bg() != 200 || com.bytedance.sdk.openadsdk.core.PX.IL.bX.zx.size() <= 0) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.PX.IL.bX.IL();
            }

            @Override // com.bytedance.sdk.component.iR.bg.bg
            public void bg(com.bytedance.sdk.component.iR.IL.bX bXVar, java.io.IOException iOException) {
                com.bytedance.sdk.openadsdk.core.PX.IL.bX.IL il2 = il;
                if (il2 != null && il2.IL != null) {
                    com.bytedance.sdk.openadsdk.core.PX.IL.bX.IL(false, iOException != null ? iOException.getMessage() : null, com.bytedance.sdk.openadsdk.utils.ayS.bX(il.IL.Fx()), il, str, z);
                }
                if (z || il == null) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.PX.IL.bX.zx.put(str, il);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void IL() {
        if (ldr.compareAndSet(false, true)) {
            java.util.Map<java.lang.String, com.bytedance.sdk.openadsdk.core.PX.IL.bX.IL> map = zx;
            java.util.HashSet<java.util.Map.Entry> hashSet = new java.util.HashSet(map.entrySet());
            map.clear();
            for (java.util.Map.Entry entry : hashSet) {
                if (entry != null) {
                    bg((java.lang.String) entry.getKey(), (com.bytedance.sdk.openadsdk.core.PX.IL.bX.IL) entry.getValue(), true);
                }
            }
            ldr.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void IL(final boolean z, final java.lang.String str, final java.lang.String str2, final com.bytedance.sdk.openadsdk.core.PX.IL.bX.IL il, final java.lang.String str3, final boolean z2) {
        com.bytedance.sdk.openadsdk.eqN.bX.bg(new com.bytedance.sdk.component.Kg.Kg("dsp_track_link_result") { // from class: com.bytedance.sdk.openadsdk.core.PX.IL.bX.3
            @Override // java.lang.Runnable
            public void run() {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("type", il.bg);
                    jSONObject.put("success", z);
                    if (!android.text.TextUtils.isEmpty(str)) {
                        jSONObject.put("description", str);
                    }
                    jSONObject.put("url", str3);
                    if (il.bX >= 0.0f) {
                        jSONObject.put("progress", ((double) java.lang.Math.round(il.bX * 100.0f)) / 100.0d);
                    }
                    if (z2) {
                        jSONObject.put("retry", true);
                    }
                } catch (java.lang.Throwable unused) {
                }
                com.bytedance.sdk.openadsdk.eqN.bX.IL(il.IL, str2, "dsp_track_link_result", jSONObject);
            }
        });
    }

    public static org.json.JSONArray bg(java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bX> list) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (int i = 0; i < list.size(); i++) {
            jSONArray.put(list.get(i).bX());
        }
        return jSONArray;
    }

    public static java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bX> bg(org.json.JSONArray jSONArray) {
        return bg(jSONArray, false);
    }

    public static java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bX> bg(org.json.JSONArray jSONArray, boolean z) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                java.lang.String strOptString = jSONArray.optString(i);
                if (!android.text.TextUtils.isEmpty(strOptString)) {
                    arrayList.add(new com.bytedance.sdk.openadsdk.core.PX.IL.bX.bg(strOptString).bg(z).bg());
                }
            }
        }
        return arrayList;
    }

    public static java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.IL> IL(org.json.JSONArray jSONArray) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                org.json.JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new com.bytedance.sdk.openadsdk.core.PX.IL.IL.bg(jSONObjectOptJSONObject.optString("content"), (float) jSONObjectOptJSONObject.optDouble("trackingFraction", 0.0d)).bg());
                }
            }
        }
        return arrayList;
    }

    public static java.util.List<com.bytedance.sdk.openadsdk.core.PX.IL.bg> bX(org.json.JSONArray jSONArray) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                org.json.JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new com.bytedance.sdk.openadsdk.core.PX.IL.bg.C0136bg(jSONObjectOptJSONObject.optString("content"), jSONObjectOptJSONObject.optLong("trackingMilliseconds", 0L)).bg());
                }
            }
        }
        return arrayList;
    }

    public static class IL {
        com.bytedance.sdk.openadsdk.core.model.tuV IL;
        float bX;
        java.lang.String bg;

        public IL(java.lang.String str, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
            this(str, tuv, -1.0f);
        }

        public IL(java.lang.String str, com.bytedance.sdk.openadsdk.core.model.tuV tuv, float f) {
            this.bg = str;
            this.IL = tuv;
            this.bX = f;
        }
    }
}
