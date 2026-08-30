package com.bytedance.adsdk.ugeno.core;

/* JADX INFO: loaded from: classes3.dex */
public class bg {
    private float IL;
    private java.util.List<com.bytedance.adsdk.ugeno.core.bg.C0088bg> bX;
    private java.lang.String bg;
    private long eqN;
    private java.lang.String ldr;
    private long zx;

    public java.lang.String bg() {
        return this.bg;
    }

    public void bg(java.lang.String str) {
        this.bg = str;
    }

    public void bg(float f) {
        this.IL = f;
    }

    public float IL() {
        return this.IL;
    }

    public java.util.List<com.bytedance.adsdk.ugeno.core.bg.C0088bg> bX() {
        return this.bX;
    }

    public void bg(java.util.List<com.bytedance.adsdk.ugeno.core.bg.C0088bg> list) {
        this.bX = list;
    }

    public long eqN() {
        return this.eqN;
    }

    public void bg(long j) {
        this.eqN = j;
    }

    public long zx() {
        return this.zx;
    }

    public void IL(long j) {
        this.zx = j;
    }

    public java.lang.String ldr() {
        return this.ldr;
    }

    public void IL(java.lang.String str) {
        this.ldr = str;
    }

    public static com.bytedance.adsdk.ugeno.core.bg bg(java.lang.String str, com.bytedance.adsdk.ugeno.IL.bX bXVar) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return bg(new org.json.JSONObject(str), bXVar);
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    public static com.bytedance.adsdk.ugeno.core.bg bg(org.json.JSONObject jSONObject, com.bytedance.adsdk.ugeno.IL.bX bXVar) {
        return bg(jSONObject, null, bXVar);
    }

    public static com.bytedance.adsdk.ugeno.core.bg bg(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.bytedance.adsdk.ugeno.IL.bX bXVar) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.adsdk.ugeno.core.bg bgVar = new com.bytedance.adsdk.ugeno.core.bg();
        bgVar.bg(jSONObject.optString("ordering"));
        java.lang.String strOptString = jSONObject.optString("loop");
        if (android.text.TextUtils.equals("infinite", strOptString)) {
            bgVar.bg(-1.0f);
        } else {
            try {
                bgVar.bg(java.lang.Float.parseFloat(strOptString));
            } catch (java.lang.NumberFormatException unused) {
                bgVar.bg(0.0f);
            }
        }
        bgVar.bg(jSONObject.optLong("duration", 0L));
        bgVar.IL(com.bytedance.adsdk.ugeno.iR.bX.bg(com.bytedance.adsdk.ugeno.bX.IL.bg(jSONObject.optString("startDelay"), bXVar.eo()), 0L));
        bgVar.IL(jSONObject.optString("loopMode"));
        org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("animators");
        if (jSONArrayOptJSONArray != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                org.json.JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObject2 != null) {
                    com.bytedance.adsdk.ugeno.iR.IL.bg(jSONObject2, jSONObjectOptJSONObject);
                }
                arrayList.add(com.bytedance.adsdk.ugeno.core.bg.C0088bg.bg(jSONObjectOptJSONObject, bXVar));
            }
            bgVar.bg(arrayList);
        }
        return bgVar;
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.core.bg$bg, reason: collision with other inner class name */
    public static class C0088bg {
        private float IL;
        private float[] Kg;
        private java.lang.String WR;
        private java.lang.String bX;
        private long bg;
        private java.lang.String eo;
        private long eqN;
        private float iR;
        private float ldr;
        private java.lang.String zx;

        public long bg() {
            return this.bg;
        }

        public void bg(long j) {
            this.bg = j;
        }

        public float IL() {
            return this.IL;
        }

        public void bg(float f) {
            this.IL = f;
        }

        public java.lang.String bX() {
            return this.bX;
        }

        public void bg(java.lang.String str) {
            this.bX = str;
        }

        public long eqN() {
            return this.eqN;
        }

        public void IL(long j) {
            this.eqN = j;
        }

        public java.lang.String zx() {
            return this.zx;
        }

        public void IL(java.lang.String str) {
            this.zx = str;
        }

        public float ldr() {
            return this.ldr;
        }

        public void IL(float f) {
            this.ldr = f;
        }

        public float iR() {
            return this.iR;
        }

        public void bX(float f) {
            this.iR = f;
        }

        public float[] Kg() {
            return this.Kg;
        }

        public void bg(float[] fArr) {
            this.Kg = fArr;
        }

        public java.lang.String WR() {
            return this.WR;
        }

        public java.lang.String eo() {
            return this.eo;
        }

        public void bX(java.lang.String str) {
            this.eo = str;
        }

        public void eqN(java.lang.String str) {
            this.WR = str;
        }

        public static com.bytedance.adsdk.ugeno.core.bg.C0088bg bg(org.json.JSONObject jSONObject, com.bytedance.adsdk.ugeno.IL.bX bXVar) {
            if (jSONObject == null) {
                return null;
            }
            com.bytedance.adsdk.ugeno.core.bg.C0088bg c0088bg = new com.bytedance.adsdk.ugeno.core.bg.C0088bg();
            c0088bg.bg(jSONObject.optLong("duration"));
            java.lang.String strOptString = jSONObject.optString("loop");
            if (android.text.TextUtils.equals("infinite", strOptString)) {
                c0088bg.bg(-1.0f);
            } else {
                try {
                    c0088bg.bg(java.lang.Float.parseFloat(strOptString));
                } catch (java.lang.NumberFormatException unused) {
                    c0088bg.bg(0.0f);
                }
            }
            c0088bg.bg(jSONObject.optString("loopMode"));
            c0088bg.IL(jSONObject.optString("type"));
            if (android.text.TextUtils.equals(c0088bg.zx(), "ripple")) {
                c0088bg.bX(jSONObject.optString("rippleColor"));
            }
            android.view.View viewWR = bXVar.WR();
            android.content.Context context = viewWR != null ? viewWR.getContext() : null;
            if (android.text.TextUtils.equals(c0088bg.zx(), androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_BACKGROUND_COLOR)) {
                java.lang.String strBg = com.bytedance.adsdk.ugeno.bX.IL.bg(jSONObject.optString("valueTo"), bXVar.eo());
                int iBg = com.bytedance.adsdk.ugeno.iR.bg.bg(jSONObject.optString("valueFrom"));
                int iBg2 = com.bytedance.adsdk.ugeno.iR.bg.bg(strBg);
                c0088bg.IL(iBg);
                c0088bg.bX(iBg2);
            } else if ((android.text.TextUtils.equals(c0088bg.zx(), "translateX") || android.text.TextUtils.equals(c0088bg.zx(), "translateY")) && context != null) {
                try {
                    float fBg = com.bytedance.adsdk.ugeno.iR.Kg.bg(context, (float) jSONObject.optDouble("valueFrom"));
                    float fBg2 = com.bytedance.adsdk.ugeno.iR.Kg.bg(context, (float) jSONObject.optDouble("valueTo"));
                    c0088bg.IL(fBg);
                    c0088bg.bX(fBg2);
                } catch (java.lang.Exception unused2) {
                    android.util.Log.e("animation", "animation ");
                }
            } else {
                c0088bg.IL((float) jSONObject.optDouble("valueFrom"));
                c0088bg.bX((float) jSONObject.optDouble("valueTo"));
            }
            c0088bg.eqN(jSONObject.optString("interpolator"));
            java.lang.String strBg2 = com.bytedance.adsdk.ugeno.bX.IL.bg(jSONObject.optString("startDelay"), bXVar.eo());
            android.util.Log.d("TAG", "createAnimationModel: ");
            c0088bg.IL(com.bytedance.adsdk.ugeno.iR.bX.bg(strBg2, 0L));
            org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("values");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                float[] fArr = new float[jSONArrayOptJSONArray.length()];
                int i = 0;
                if ((android.text.TextUtils.equals(c0088bg.zx(), "translateX") || android.text.TextUtils.equals(c0088bg.zx(), "translateY")) && context != null) {
                    while (i < jSONArrayOptJSONArray.length()) {
                        fArr[i] = com.bytedance.adsdk.ugeno.iR.Kg.bg(context, (float) com.bytedance.adsdk.ugeno.core.bg.bg(jSONArrayOptJSONArray.optString(i), bXVar.eo()));
                        i++;
                    }
                } else {
                    while (i < jSONArrayOptJSONArray.length()) {
                        fArr[i] = (float) com.bytedance.adsdk.ugeno.core.bg.bg(jSONArrayOptJSONArray.optString(i), bXVar.eo());
                        i++;
                    }
                }
                c0088bg.bg(fArr);
            }
            return c0088bg;
        }
    }

    public static double bg(java.lang.Object obj, org.json.JSONObject jSONObject) {
        if (obj instanceof java.lang.String) {
            return com.bytedance.adsdk.ugeno.iR.bX.bg(com.bytedance.adsdk.ugeno.bX.IL.bg((java.lang.String) obj, jSONObject), 0.0d);
        }
        if (obj instanceof java.lang.Double) {
            return ((java.lang.Double) obj).doubleValue();
        }
        if (obj instanceof java.lang.Long) {
            return ((java.lang.Double) obj).doubleValue();
        }
        if (obj instanceof java.lang.Integer) {
            return ((java.lang.Double) obj).doubleValue();
        }
        return 0.0d;
    }
}
