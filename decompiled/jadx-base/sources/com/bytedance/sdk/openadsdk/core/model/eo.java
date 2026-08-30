package com.bytedance.sdk.openadsdk.core.model;

/* JADX INFO: loaded from: classes4.dex */
public class eo {
    private final int[] IL;
    private final float Kg;
    private final android.util.SparseArray<com.bytedance.sdk.openadsdk.core.IL.bX.bg> Lq;
    private final int PX;
    private final int Ta;
    private final int VB;
    private final java.lang.String VzQ;
    private final long WR;
    private final int[] bX;
    private final int[] bg;
    private final long eo;
    private final int[] eqN;
    private final float iR;
    private final float ldr;
    private final org.json.JSONObject tuV;
    private final int vb;
    private final org.json.JSONObject xxp;
    private final int yDt;
    private final float zx;

    private eo(com.bytedance.sdk.openadsdk.core.model.eo.bg bgVar) {
        this.bg = bgVar.VB;
        this.IL = bgVar.PX;
        this.eqN = bgVar.Ta;
        this.bX = bgVar.eo;
        this.zx = bgVar.WR;
        this.ldr = bgVar.Kg;
        this.iR = bgVar.iR;
        this.Kg = bgVar.ldr;
        this.WR = bgVar.zx;
        this.eo = bgVar.eqN;
        this.VB = bgVar.yDt;
        this.PX = bgVar.Lq;
        this.Ta = bgVar.vb;
        this.yDt = bgVar.VzQ;
        this.Lq = bgVar.xxp;
        this.VzQ = bgVar.tuV;
        this.vb = bgVar.Fy;
        this.xxp = bgVar.LZ;
        this.tuV = bgVar.tC;
    }

    public org.json.JSONObject bg() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            org.json.JSONObject jSONObject2 = this.tuV;
            if (jSONObject2 != null) {
                try {
                    java.util.Iterator<java.lang.String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        java.lang.String next = itKeys.next();
                        jSONObject.putOpt(next, this.tuV.opt(next));
                    }
                } catch (java.lang.Exception unused) {
                }
            }
            int[] iArr = this.bg;
            if (iArr != null && iArr.length == 2) {
                jSONObject.putOpt("ad_x", java.lang.Integer.valueOf(iArr[0])).putOpt("ad_y", java.lang.Integer.valueOf(this.bg[1]));
            }
            int[] iArr2 = this.IL;
            if (iArr2 != null && iArr2.length == 2) {
                jSONObject.putOpt("width", java.lang.Integer.valueOf(iArr2[0])).putOpt("height", java.lang.Integer.valueOf(this.IL[1]));
            }
            int[] iArr3 = this.bX;
            if (iArr3 != null && iArr3.length == 2) {
                jSONObject.putOpt("button_x", java.lang.Integer.valueOf(iArr3[0])).putOpt("button_y", java.lang.Integer.valueOf(this.bX[1]));
            }
            int[] iArr4 = this.eqN;
            if (iArr4 != null && iArr4.length == 2) {
                jSONObject.putOpt("button_width", java.lang.Integer.valueOf(iArr4[0])).putOpt("button_height", java.lang.Integer.valueOf(this.eqN[1]));
            }
            jSONObject.putOpt("down_x", java.lang.Float.toString(this.zx)).putOpt("down_y", java.lang.Float.toString(this.ldr)).putOpt("up_x", java.lang.Float.toString(this.iR)).putOpt("up_y", java.lang.Float.toString(this.Kg)).putOpt("down_time", java.lang.Long.valueOf(this.WR)).putOpt("up_time", java.lang.Long.valueOf(this.eo)).putOpt("toolType", java.lang.Integer.valueOf(this.VB)).putOpt("deviceId", java.lang.Integer.valueOf(this.PX)).putOpt("source", java.lang.Integer.valueOf(this.Ta)).putOpt("ft", bg(this.Lq, this.yDt)).putOpt("click_area_type", this.VzQ);
            int i = this.vb;
            if (i > 0) {
                jSONObject.putOpt("areaType", java.lang.Integer.valueOf(i));
            }
            org.json.JSONObject jSONObject3 = this.xxp;
            if (jSONObject3 != null) {
                jSONObject.putOpt("rectInfo", jSONObject3);
            }
        } catch (java.lang.Exception unused2) {
        }
        return jSONObject;
    }

    public static org.json.JSONObject bg(android.util.SparseArray<com.bytedance.sdk.openadsdk.core.IL.bX.bg> sparseArray, int i) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            if (sparseArray != null) {
                for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                    com.bytedance.sdk.openadsdk.core.IL.bX.bg bgVarValueAt = sparseArray.valueAt(i2);
                    if (bgVarValueAt != null) {
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        jSONObject2.putOpt("force", java.lang.Double.valueOf(bgVarValueAt.bX)).putOpt("mr", java.lang.Double.valueOf(bgVarValueAt.IL)).putOpt(androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_PHASE, java.lang.Integer.valueOf(bgVarValueAt.bg)).putOpt("ts", java.lang.Long.valueOf(bgVarValueAt.eqN));
                        jSONArray.put(jSONObject2);
                        jSONObject.putOpt("ftc", java.lang.Integer.valueOf(i)).putOpt("info", jSONArray);
                    }
                }
            }
            return jSONObject;
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    public static class bg {
        private int Fy;
        int IL;
        private float Kg;
        private org.json.JSONObject LZ;
        private int Lq;
        private int[] PX;
        private int[] Ta;
        private int[] VB;
        private int VzQ;
        private float WR;
        float bX;
        float bg;
        private int[] eo;
        private long eqN;
        private float iR;
        private float ldr;
        private org.json.JSONObject tC;
        private java.lang.String tuV;
        private int vb;
        private android.util.SparseArray<com.bytedance.sdk.openadsdk.core.IL.bX.bg> xxp;
        private int yDt;
        private long zx;

        public com.bytedance.sdk.openadsdk.core.model.eo.bg bg(int i) {
            this.Fy = i;
            return this;
        }

        public com.bytedance.sdk.openadsdk.core.model.eo.bg bg(org.json.JSONObject jSONObject) {
            this.LZ = jSONObject;
            return this;
        }

        public com.bytedance.sdk.openadsdk.core.model.eo.bg IL(org.json.JSONObject jSONObject) {
            this.tC = jSONObject;
            return this;
        }

        public com.bytedance.sdk.openadsdk.core.model.eo.bg IL(int i) {
            this.VzQ = i;
            return this;
        }

        public com.bytedance.sdk.openadsdk.core.model.eo.bg bg(android.util.SparseArray<com.bytedance.sdk.openadsdk.core.IL.bX.bg> sparseArray) {
            this.xxp = sparseArray;
            return this;
        }

        public com.bytedance.sdk.openadsdk.core.model.eo.bg bg(float f) {
            this.bg = f;
            return this;
        }

        public com.bytedance.sdk.openadsdk.core.model.eo.bg bX(int i) {
            this.IL = i;
            return this;
        }

        public com.bytedance.sdk.openadsdk.core.model.eo.bg IL(float f) {
            this.bX = f;
            return this;
        }

        public com.bytedance.sdk.openadsdk.core.model.eo.bg bg(long j) {
            this.eqN = j;
            return this;
        }

        public com.bytedance.sdk.openadsdk.core.model.eo.bg IL(long j) {
            this.zx = j;
            return this;
        }

        public com.bytedance.sdk.openadsdk.core.model.eo.bg bX(float f) {
            this.ldr = f;
            return this;
        }

        public com.bytedance.sdk.openadsdk.core.model.eo.bg eqN(float f) {
            this.iR = f;
            return this;
        }

        public com.bytedance.sdk.openadsdk.core.model.eo.bg zx(float f) {
            this.Kg = f;
            return this;
        }

        public com.bytedance.sdk.openadsdk.core.model.eo.bg ldr(float f) {
            this.WR = f;
            return this;
        }

        public com.bytedance.sdk.openadsdk.core.model.eo.bg bg(int[] iArr) {
            this.eo = iArr;
            return this;
        }

        public com.bytedance.sdk.openadsdk.core.model.eo.bg IL(int[] iArr) {
            this.VB = iArr;
            return this;
        }

        public com.bytedance.sdk.openadsdk.core.model.eo.bg bX(int[] iArr) {
            this.PX = iArr;
            return this;
        }

        public com.bytedance.sdk.openadsdk.core.model.eo.bg eqN(int[] iArr) {
            this.Ta = iArr;
            return this;
        }

        public com.bytedance.sdk.openadsdk.core.model.eo.bg eqN(int i) {
            this.yDt = i;
            return this;
        }

        public com.bytedance.sdk.openadsdk.core.model.eo.bg zx(int i) {
            this.Lq = i;
            return this;
        }

        public com.bytedance.sdk.openadsdk.core.model.eo.bg ldr(int i) {
            this.vb = i;
            return this;
        }

        public com.bytedance.sdk.openadsdk.core.model.eo.bg bg(java.lang.String str) {
            this.tuV = str;
            return this;
        }

        public com.bytedance.sdk.openadsdk.core.model.eo bg() {
            return new com.bytedance.sdk.openadsdk.core.model.eo(this);
        }
    }
}
