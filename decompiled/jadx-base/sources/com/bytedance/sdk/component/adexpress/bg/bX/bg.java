package com.bytedance.sdk.component.adexpress.bg.bX;

/* JADX INFO: loaded from: classes3.dex */
public class bg {
    private java.lang.String IL;
    private java.lang.String bX;
    private java.lang.String bg;
    private java.util.List<com.bytedance.sdk.component.adexpress.bg.bX.bg.C0104bg> eqN;
    private java.util.Map<java.lang.String, com.bytedance.sdk.component.adexpress.bg.bX.bg> ldr = new java.util.concurrent.ConcurrentHashMap();
    private com.bytedance.sdk.component.adexpress.bg.bX.bg.IL zx;

    public java.util.Map<java.lang.String, com.bytedance.sdk.component.adexpress.bg.bX.bg> bg() {
        return this.ldr;
    }

    public java.lang.String IL() {
        return this.bg;
    }

    public void bg(java.lang.String str) {
        this.bg = str;
    }

    public java.lang.String bX() {
        return this.IL;
    }

    public void IL(java.lang.String str) {
        this.IL = str;
    }

    public java.lang.String eqN() {
        return this.bX;
    }

    public void bX(java.lang.String str) {
        this.bX = str;
    }

    public void bg(com.bytedance.sdk.component.adexpress.bg.bX.bg.IL il) {
        this.zx = il;
    }

    public com.bytedance.sdk.component.adexpress.bg.bX.bg.IL zx() {
        return this.zx;
    }

    public java.util.List<com.bytedance.sdk.component.adexpress.bg.bX.bg.C0104bg> ldr() {
        if (this.eqN == null) {
            this.eqN = new java.util.ArrayList();
        }
        return this.eqN;
    }

    public void bg(java.util.List<com.bytedance.sdk.component.adexpress.bg.bX.bg.C0104bg> list) {
        if (list == null) {
            list = new java.util.ArrayList<>();
        }
        this.eqN = list;
    }

    public boolean iR() {
        return (android.text.TextUtils.isEmpty(eqN()) || android.text.TextUtils.isEmpty(bX()) || android.text.TextUtils.isEmpty(IL())) ? false : true;
    }

    public org.json.JSONObject Kg() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.putOpt("name", IL());
            jSONObject.putOpt("version", bX());
            jSONObject.putOpt(com.ironsource.y8.h.Z, eqN());
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            if (ldr() != null) {
                for (com.bytedance.sdk.component.adexpress.bg.bX.bg.C0104bg c0104bg : ldr()) {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.putOpt("url", c0104bg.bg());
                    jSONObject2.putOpt("md5", c0104bg.IL());
                    jSONObject2.putOpt("level", java.lang.Integer.valueOf(c0104bg.bX()));
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.putOpt("resources", jSONArray);
            if (!this.ldr.isEmpty()) {
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                boolean z = false;
                for (java.lang.String str : this.ldr.keySet()) {
                    com.bytedance.sdk.component.adexpress.bg.bX.bg bgVar = this.ldr.get(str);
                    if (bgVar != null) {
                        jSONObject3.put(str, bgVar.Kg());
                        z = true;
                    }
                }
                if (z) {
                    jSONObject.put("engines", jSONObject3);
                }
            }
            com.bytedance.sdk.component.adexpress.bg.bX.bg.IL ilZx = zx();
            if (ilZx != null) {
                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                jSONObject4.put("url", ilZx.bg);
                jSONObject4.put("md5", ilZx.IL);
                org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                java.util.List<android.util.Pair<java.lang.String, java.lang.String>> listIL = ilZx.IL();
                if (listIL != null) {
                    for (android.util.Pair<java.lang.String, java.lang.String> pair : listIL) {
                        jSONObject5.put((java.lang.String) pair.first, pair.second);
                    }
                }
                jSONObject4.put("map", jSONObject5);
                jSONObject.putOpt("resources_archive", jSONObject4);
            }
            return jSONObject;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public java.lang.String WR() {
        org.json.JSONObject jSONObjectKg;
        if (!iR() || (jSONObjectKg = Kg()) == null) {
            return null;
        }
        return jSONObjectKg.toString();
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.bg.bX.bg$bg, reason: collision with other inner class name */
    public static class C0104bg {
        private java.lang.String IL;
        private int bX;
        private java.lang.String bg;

        public boolean equals(java.lang.Object obj) {
            java.lang.String str;
            if (obj instanceof com.bytedance.sdk.component.adexpress.bg.bX.bg.C0104bg) {
                java.lang.String str2 = this.bg;
                if (str2 != null) {
                    com.bytedance.sdk.component.adexpress.bg.bX.bg.C0104bg c0104bg = (com.bytedance.sdk.component.adexpress.bg.bX.bg.C0104bg) obj;
                    if (str2.equals(c0104bg.bg()) && (str = this.IL) != null && str.equals(c0104bg.IL())) {
                        return true;
                    }
                }
                return false;
            }
            return super.equals(obj);
        }

        public java.lang.String bg() {
            return this.bg;
        }

        public void bg(java.lang.String str) {
            this.bg = str;
        }

        public java.lang.String IL() {
            return this.IL;
        }

        public void IL(java.lang.String str) {
            this.IL = str;
        }

        public int bX() {
            return this.bX;
        }

        public void bg(int i) {
            this.bX = i;
        }
    }

    public static class IL {
        private java.lang.String IL;
        private java.util.List<android.util.Pair<java.lang.String, java.lang.String>> bX;
        private java.lang.String bg;

        public java.lang.String bg() {
            return this.bg;
        }

        public void bg(java.lang.String str) {
            this.bg = str;
        }

        public void IL(java.lang.String str) {
            this.IL = str;
        }

        public void bg(java.util.List<android.util.Pair<java.lang.String, java.lang.String>> list) {
            this.bX = list;
        }

        public java.util.List<android.util.Pair<java.lang.String, java.lang.String>> IL() {
            return this.bX;
        }
    }

    public static com.bytedance.sdk.component.adexpress.bg.bX.bg eqN(java.lang.String str) {
        if (str == null) {
            return null;
        }
        try {
            return bg(new org.json.JSONObject(str));
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static com.bytedance.sdk.component.adexpress.bg.bX.bg bg(org.json.JSONObject jSONObject) {
        org.json.JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.bg.bX.bg bgVar = new com.bytedance.sdk.component.adexpress.bg.bX.bg();
        bgVar.bg(jSONObject.optString("name"));
        bgVar.IL(jSONObject.optString("version"));
        bgVar.bX(jSONObject.optString(com.ironsource.y8.h.Z));
        org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("resources");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                org.json.JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                com.bytedance.sdk.component.adexpress.bg.bX.bg.C0104bg c0104bg = new com.bytedance.sdk.component.adexpress.bg.bX.bg.C0104bg();
                c0104bg.bg(jSONObjectOptJSONObject2.optString("url"));
                c0104bg.IL(jSONObjectOptJSONObject2.optString("md5"));
                c0104bg.bg(jSONObjectOptJSONObject2.optInt("level"));
                arrayList.add(c0104bg);
            }
        }
        bgVar.bg(arrayList);
        try {
            org.json.JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("engines");
            if (jSONObjectOptJSONObject3 != null) {
                java.util.Iterator<java.lang.String> itKeys = jSONObjectOptJSONObject3.keys();
                while (itKeys.hasNext()) {
                    java.lang.String next = itKeys.next();
                    com.bytedance.sdk.component.adexpress.bg.bX.bg bgVarBg = bg(jSONObjectOptJSONObject3.optJSONObject(next));
                    if (bgVarBg != null) {
                        bgVar.bg().put(next, bgVarBg);
                    }
                }
            }
        } catch (java.lang.Exception e) {
            e.getMessage();
        }
        if (jSONObject.has("resources_archive") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("resources_archive")) != null) {
            com.bytedance.sdk.component.adexpress.bg.bX.bg.IL il = new com.bytedance.sdk.component.adexpress.bg.bX.bg.IL();
            il.bg(jSONObjectOptJSONObject.optString("url"));
            il.IL(jSONObjectOptJSONObject.optString("md5"));
            org.json.JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject.optJSONObject("map");
            if (jSONObjectOptJSONObject4 != null) {
                java.util.Iterator<java.lang.String> itKeys2 = jSONObjectOptJSONObject4.keys();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                while (itKeys2.hasNext()) {
                    java.lang.String next2 = itKeys2.next();
                    arrayList2.add(new android.util.Pair<>(next2, jSONObjectOptJSONObject4.optString(next2)));
                }
                il.bg(arrayList2);
            }
            bgVar.bg(il);
        }
        if (bgVar.iR()) {
            return bgVar;
        }
        return null;
    }
}
