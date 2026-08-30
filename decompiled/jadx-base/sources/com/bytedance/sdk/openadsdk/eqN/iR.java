package com.bytedance.sdk.openadsdk.eqN;

/* JADX INFO: loaded from: classes4.dex */
public class iR {
    private long IL;
    private long bX;
    private long bg;
    private long eqN;
    private long zx;

    public void bg(long j) {
        if (this.bg <= 0) {
            this.bg = j;
        }
    }

    public void IL(long j) {
        if (this.IL <= 0) {
            this.IL = j;
        }
    }

    public void bX(long j) {
        if (this.bX <= 0) {
            this.bX = j;
        }
    }

    public void eqN(long j) {
        if (this.eqN <= 0) {
            this.eqN = j;
        }
    }

    public void zx(long j) {
        if (this.zx <= 0) {
            this.zx = j;
        }
    }

    public boolean bg() {
        return this.bg > 0;
    }

    public void bg(long j, float f) {
        if (f > 0.0f) {
            bg(j);
        }
        double d = f;
        if (d >= 0.25d) {
            bg(j);
            IL(j);
        }
        if (d >= 0.5d) {
            bg(j);
            IL(j);
            bX(j);
        }
        if (d >= 0.75d) {
            bg(j);
            IL(j);
            bX(j);
            eqN(j);
        }
        if (f >= 1.0f) {
            bg(j);
            IL(j);
            bX(j);
            eqN(j);
            zx(j);
        }
    }

    public org.json.JSONObject IL() {
        return bg((org.json.JSONObject) null);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026 A[Catch: Exception -> 0x0042, TryCatch #0 {Exception -> 0x0042, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x0010, B:8:0x001b, B:10:0x0026, B:12:0x0031, B:14:0x003c), top: B:17:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:12:0x0031 A[Catch: Exception -> 0x0042, TryCatch #0 {Exception -> 0x0042, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x0010, B:8:0x001b, B:10:0x0026, B:12:0x0031, B:14:0x003c), top: B:17:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x003c A[Catch: Exception -> 0x0042, TRY_LEAVE, TryCatch #0 {Exception -> 0x0042, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x0010, B:8:0x001b, B:10:0x0026, B:12:0x0031, B:14:0x003c), top: B:17:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:6:0x0010 A[Catch: Exception -> 0x0042, TryCatch #0 {Exception -> 0x0042, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x0010, B:8:0x001b, B:10:0x0026, B:12:0x0031, B:14:0x003c), top: B:17:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001b A[Catch: Exception -> 0x0042, TryCatch #0 {Exception -> 0x0042, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x0010, B:8:0x001b, B:10:0x0026, B:12:0x0031, B:14:0x003c), top: B:17:0x0002 }] */
    public org.json.JSONObject bg(org.json.JSONObject jSONObject) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        if (jSONObject == null) {
            try {
                jSONObject = new org.json.JSONObject();
                j = this.bg;
                if (j > 0) {
                    jSONObject.put("show_start", j);
                    j2 = this.IL;
                    if (j2 > 0) {
                        jSONObject.put("show_firstQuartile", j2);
                        j3 = this.bX;
                        if (j3 > 0) {
                            jSONObject.put("show_mid", j3);
                            j4 = this.eqN;
                            if (j4 > 0) {
                                jSONObject.put("show_thirdQuartile", j4);
                                j5 = this.zx;
                                if (j5 > 0) {
                                    jSONObject.put("show_full", j5);
                                }
                            }
                        }
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        } else {
            j = this.bg;
            if (j > 0) {
                jSONObject.put("show_start", j);
                j2 = this.IL;
                if (j2 > 0) {
                    jSONObject.put("show_firstQuartile", j2);
                    j3 = this.bX;
                    if (j3 > 0) {
                        jSONObject.put("show_mid", j3);
                        j4 = this.eqN;
                        if (j4 > 0) {
                            jSONObject.put("show_thirdQuartile", j4);
                            j5 = this.zx;
                            if (j5 > 0) {
                                jSONObject.put("show_full", j5);
                            }
                        }
                    }
                }
            }
        }
        return jSONObject;
    }
}
