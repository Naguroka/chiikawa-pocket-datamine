package com.bytedance.sdk.openadsdk.yDt.bg;

/* JADX INFO: loaded from: classes4.dex */
public class zx {
    public static int bg = -10;
    private final int IL;
    private int Kg;
    private int VB;
    private boolean WR;
    private java.lang.String bX;
    private java.lang.String eo;
    private long eqN;
    private int iR;
    private long ldr;
    private long zx;

    public zx(int i) {
        this.IL = i;
    }

    public com.bytedance.sdk.openadsdk.yDt.bg.zx bg(java.lang.String str) {
        this.bX = str;
        return this;
    }

    public com.bytedance.sdk.openadsdk.yDt.bg.zx IL(java.lang.String str) {
        byte[] bytes;
        if (!android.text.TextUtils.isEmpty(str) && (bytes = str.getBytes()) != null) {
            this.iR = bytes.length;
        }
        return this;
    }

    public com.bytedance.sdk.openadsdk.yDt.bg.zx bg(com.bytedance.sdk.component.IL.bg.yDt ydt) {
        if (ydt != null) {
            if (ydt.ldr == com.bytedance.sdk.component.IL.bg.yDt.bg.STRING_TYPE && !android.text.TextUtils.isEmpty(ydt.bg())) {
                this.iR = ydt.bg().getBytes().length;
            }
            if (ydt.ldr == com.bytedance.sdk.component.IL.bg.yDt.bg.BYTE_ARRAY_TYPE && ydt.zx != null) {
                this.iR = ydt.zx.length;
            }
        }
        return this;
    }

    public void bg() {
        this.eqN = android.os.SystemClock.elapsedRealtime();
    }

    public com.bytedance.sdk.openadsdk.yDt.bg.zx bX(java.lang.String str) {
        byte[] bytes;
        if (!android.text.TextUtils.isEmpty(str) && (bytes = str.getBytes()) != null) {
            this.Kg = bytes.length;
        }
        return this;
    }

    public com.bytedance.sdk.openadsdk.yDt.bg.zx bg(int i) {
        this.VB = i;
        return this;
    }

    public void IL() {
        this.ldr = android.os.SystemClock.elapsedRealtime() - this.eqN;
    }

    public com.bytedance.sdk.openadsdk.yDt.bg.zx eqN(java.lang.String str) {
        this.eo = str;
        return this;
    }

    public com.bytedance.sdk.openadsdk.yDt.bg.zx bg(boolean z) {
        this.WR = z;
        return this;
    }

    public void bX() {
        this.zx = android.os.SystemClock.elapsedRealtime() - this.eqN;
        com.bytedance.sdk.openadsdk.utils.VJ.bX().execute(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.yDt.bg.zx.1
            @Override // java.lang.Runnable
            public void run() {
                org.json.JSONObject jSONObject;
                com.bytedance.sdk.openadsdk.yDt.bg.zx.bg bgVarBg;
                org.json.JSONObject jSONObjectOptJSONObject;
                synchronized (com.bytedance.sdk.openadsdk.yDt.bg.zx.class) {
                    java.lang.String strIL = com.bytedance.sdk.openadsdk.multipro.eqN.eqN.IL("tt_sdk_req_monitor", "req_monitor_data", null);
                    try {
                        if (android.text.TextUtils.isEmpty(strIL)) {
                            jSONObject = new org.json.JSONObject();
                        } else {
                            jSONObject = new org.json.JSONObject(strIL);
                        }
                        if (jSONObject.has(com.bytedance.sdk.openadsdk.yDt.bg.zx.this.bX) && (jSONObjectOptJSONObject = jSONObject.optJSONObject(com.bytedance.sdk.openadsdk.yDt.bg.zx.this.bX)) != null) {
                            bgVarBg = com.bytedance.sdk.openadsdk.yDt.bg.zx.bg.bg(jSONObjectOptJSONObject);
                            bgVarBg.bg(com.bytedance.sdk.openadsdk.yDt.bg.zx.this.WR, com.bytedance.sdk.openadsdk.yDt.bg.zx.this.zx, com.bytedance.sdk.openadsdk.yDt.bg.zx.this.iR, com.bytedance.sdk.openadsdk.yDt.bg.zx.this.Kg, com.bytedance.sdk.openadsdk.yDt.bg.zx.this.VB);
                        } else {
                            com.bytedance.sdk.openadsdk.yDt.bg.zx.bg bgVar = new com.bytedance.sdk.openadsdk.yDt.bg.zx.bg(com.bytedance.sdk.openadsdk.yDt.bg.zx.this.IL, com.bytedance.sdk.openadsdk.yDt.bg.zx.this.WR, com.bytedance.sdk.openadsdk.yDt.bg.zx.this.zx, com.bytedance.sdk.openadsdk.yDt.bg.zx.this.iR, com.bytedance.sdk.openadsdk.yDt.bg.zx.this.Kg, com.bytedance.sdk.openadsdk.yDt.bg.zx.this.VB);
                            bgVarBg = bgVar;
                        }
                        jSONObject.put(com.bytedance.sdk.openadsdk.yDt.bg.zx.this.bX, bgVarBg.bg());
                        com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("tt_sdk_req_monitor", "req_monitor_data", jSONObject.toString());
                    } catch (java.lang.Exception e) {
                        com.bytedance.sdk.component.utils.PX.IL(e.getMessage());
                    }
                }
            }
        });
    }

    public static void eqN() {
        synchronized (com.bytedance.sdk.openadsdk.yDt.bg.zx.class) {
            long jBg = com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("tt_sdk_req_monitor", "req_monitor_las_req", 0L);
            if (jBg <= 0) {
                com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("tt_sdk_req_monitor", "req_monitor_las_req", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                return;
            }
            if (java.lang.System.currentTimeMillis() - jBg >= 86400000) {
                java.lang.String strIL = com.bytedance.sdk.openadsdk.multipro.eqN.eqN.IL("tt_sdk_req_monitor", "req_monitor_data", null);
                if (!android.text.TextUtils.isEmpty(strIL)) {
                    com.bytedance.sdk.openadsdk.yDt.bX.bX(strIL);
                    com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("tt_sdk_req_monitor");
                    com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("tt_sdk_req_monitor", "req_monitor_las_req", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                }
            }
        }
    }

    private static class bg {
        private int IL;
        private final android.util.SparseIntArray Kg;
        private int bX;
        private int bg;
        private long eqN;
        private int iR;
        private int ldr;
        private long zx;

        public bg() {
            this.bg = 0;
            this.IL = 0;
            this.bX = 0;
            this.eqN = 0L;
            this.zx = 0L;
            this.ldr = 0;
            this.iR = 0;
            this.Kg = new android.util.SparseIntArray();
        }

        public bg(int i, boolean z, long j, int i2, int i3, int i4) {
            this.bg = 0;
            this.IL = 0;
            this.bX = 0;
            this.eqN = 0L;
            this.zx = 0L;
            this.ldr = 0;
            this.iR = 0;
            android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
            this.Kg = sparseIntArray;
            this.bg = i;
            if (z) {
                this.IL++;
                this.eqN = j;
            } else {
                this.bX++;
                this.zx = j;
                sparseIntArray.put(i4, 1);
            }
            this.ldr = i2;
            this.iR = i3;
        }

        public void bg(boolean z, long j, int i, int i2, int i3) {
            if (!z) {
                this.Kg.put(i3, this.Kg.get(i3) + 1);
            }
            int i4 = this.IL;
            int i5 = this.bX;
            int i6 = i4 + i5;
            int i7 = (this.ldr * i6) + i;
            int i8 = i6 + 1;
            this.ldr = i7 / i8;
            this.iR = ((this.iR * i6) + i2) / i8;
            if (z) {
                long j2 = (this.eqN * ((long) i4)) + j;
                int i9 = i4 + 1;
                this.IL = i9;
                this.eqN = j2 / ((long) i9);
                return;
            }
            long j3 = (this.zx * ((long) i5)) + j;
            int i10 = i5 + 1;
            this.bX = i10;
            this.zx = j3 / ((long) i10);
        }

        public static com.bytedance.sdk.openadsdk.yDt.bg.zx.bg bg(org.json.JSONObject jSONObject) {
            com.bytedance.sdk.openadsdk.yDt.bg.zx.bg bgVar = new com.bytedance.sdk.openadsdk.yDt.bg.zx.bg();
            bgVar.bg = jSONObject.optInt("type", 0);
            bgVar.IL = jSONObject.optInt("suc_times", 0);
            bgVar.bX = jSONObject.optInt("fail_times", 0);
            bgVar.eqN = jSONObject.optLong("suc_duration", 0L);
            bgVar.zx = jSONObject.optLong("fail_duration", 0L);
            bgVar.ldr = jSONObject.optInt("req_size", 0);
            bgVar.iR = jSONObject.optInt("res_size", 0);
            org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("codes");
            if (jSONObjectOptJSONObject != null) {
                java.util.Iterator<java.lang.String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    java.lang.String next = itKeys.next();
                    bgVar.Kg.put(java.lang.Integer.parseInt(next), jSONObjectOptJSONObject.optInt(next));
                }
            }
            return bgVar;
        }

        public org.json.JSONObject bg() {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("type", this.bg);
                jSONObject.put("suc_times", this.IL);
                jSONObject.put("fail_times", this.bX);
                jSONObject.put("suc_duration", this.eqN);
                jSONObject.put("fail_duration", this.zx);
                jSONObject.put("req_size", this.ldr);
                jSONObject.put("res_size", this.iR);
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                for (int i = 0; i < this.Kg.size(); i++) {
                    jSONObject2.put(java.lang.String.valueOf(this.Kg.keyAt(i)), this.Kg.valueAt(i));
                }
                jSONObject.put("codes", jSONObject2);
            } catch (java.lang.Exception e) {
                com.bytedance.sdk.component.utils.PX.IL(e.getMessage());
            }
            return jSONObject;
        }
    }
}
