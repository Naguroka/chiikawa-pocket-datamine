package com.bytedance.sdk.openadsdk.core.model;

/* JADX INFO: loaded from: classes4.dex */
public class rri {
    private int IL;
    private int Kg;
    private int WR;
    private boolean bX;
    private int bg;
    private boolean eo;
    private int eqN;
    private int iR;
    private java.lang.String ldr;
    private java.lang.String zx;

    private static int IL(int i) {
        return i == 1 ? 10 : 5;
    }

    public static int bg(int i) {
        return i + 10;
    }

    public static boolean yDt(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        return true;
    }

    public rri(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.bX = jSONObject.optBoolean("is_playable");
        this.eqN = jSONObject.optInt("playable_type", 0);
        this.zx = jSONObject.optString("playable_style");
        org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("playable");
        if (jSONObjectOptJSONObject != null) {
            this.ldr = jSONObjectOptJSONObject.optString("playable_url", "");
            this.iR = jSONObjectOptJSONObject.optInt("playable_orientation", 0);
            this.IL = jSONObjectOptJSONObject.optInt("new_style", 0);
            this.bg = jSONObjectOptJSONObject.optInt("close_2_app", 0);
            int iIL = IL(this.eqN);
            this.Kg = jSONObjectOptJSONObject.optInt("playable_webview_timeout", iIL);
            this.WR = jSONObjectOptJSONObject.optInt("playable_js_timeout", iIL);
            this.eo = jSONObjectOptJSONObject.optInt("playable_backup_enable", 0) == 1;
        }
    }

    public static int bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        int i;
        com.bytedance.sdk.openadsdk.core.model.rri rriVarLq = tuv.Lq();
        if (rriVarLq != null && (i = rriVarLq.bg) >= 0 && i <= 100) {
            return i;
        }
        return 0;
    }

    public void bg(org.json.JSONObject jSONObject) {
        try {
            jSONObject.put("is_playable", this.bX);
        } catch (org.json.JSONException e) {
            com.bytedance.sdk.component.utils.PX.bg("PlayableModel", e.getMessage());
        }
        if (!android.text.TextUtils.isEmpty(this.ldr)) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("playable_url", this.ldr);
                jSONObject2.put("playable_orientation", this.iR);
                jSONObject2.put("new_style", this.IL);
                jSONObject2.put("close_2_app", this.bg);
                jSONObject2.put("playable_webview_timeout", this.Kg);
                jSONObject2.put("playable_js_timeout", this.WR);
                jSONObject2.put("playable_backup_enable", this.eo ? 1 : 0);
                jSONObject.put("playable", jSONObject2);
            } catch (java.lang.Exception e2) {
                com.bytedance.sdk.component.utils.PX.bg("PlayableModel", e2.getMessage());
            }
        }
        try {
            jSONObject.put("playable_type", this.eqN);
        } catch (org.json.JSONException e3) {
            com.bytedance.sdk.component.utils.PX.bg("PlayableModel", e3.getMessage());
        }
        try {
            jSONObject.put("playable_style", this.zx);
        } catch (org.json.JSONException e4) {
            com.bytedance.sdk.component.utils.PX.bg("PlayableModel", e4.getMessage());
        }
    }

    private static com.bytedance.sdk.openadsdk.core.model.rri kMt(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (tuv == null) {
            return null;
        }
        return tuv.Lq();
    }

    public static boolean IL(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        com.bytedance.sdk.openadsdk.core.model.rri rriVarKMt = kMt(tuv);
        return (rriVarKMt == null || !rriVarKMt.bX || android.text.TextUtils.isEmpty(Ta(tuv))) ? false : true;
    }

    public static boolean bX(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        return IL(tuv) && JAA(tuv) == 1;
    }

    public static boolean eqN(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        return bX(tuv) && !WR(tuv);
    }

    public static boolean zx(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        com.bytedance.sdk.openadsdk.core.model.rri rriVarKMt = kMt(tuv);
        return rriVarKMt != null && tuv.kCH() && rriVarKMt.bX && !android.text.TextUtils.isEmpty(Ta(tuv));
    }

    public static boolean ldr(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        return zx(tuv) && JAA(tuv) == 1;
    }

    public static boolean iR(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        com.bytedance.sdk.openadsdk.core.model.rri rriVarKMt = kMt(tuv);
        return (rriVarKMt == null || tuv.kCH() || !rriVarKMt.bX || android.text.TextUtils.isEmpty(Ta(tuv))) ? false : true;
    }

    public static boolean Kg(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        com.bytedance.sdk.openadsdk.core.model.rri rriVarLq = tuv.Lq();
        return rriVarLq != null && !tuv.kCH() && rriVarLq.bX && rriVarLq.IL == 1;
    }

    public static boolean WR(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        com.bytedance.sdk.openadsdk.core.model.rri rriVarLq = tuv.Lq();
        return rriVarLq != null && rriVarLq.bX && rriVarLq.IL == 1;
    }

    public static boolean eo(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        com.bytedance.sdk.openadsdk.core.model.rri rriVarLq = tuv.Lq();
        return rriVarLq != null && tuv.kCH() && rriVarLq.bX && rriVarLq.IL == 1;
    }

    private static int JAA(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        com.bytedance.sdk.openadsdk.core.model.rri rriVarKMt = kMt(tuv);
        if (rriVarKMt == null) {
            return 0;
        }
        return rriVarKMt.eqN;
    }

    public static java.lang.String VB(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        com.bytedance.sdk.openadsdk.core.model.rri rriVarKMt = kMt(tuv);
        if (rriVarKMt == null) {
            return null;
        }
        return rriVarKMt.zx;
    }

    public static java.lang.String PX(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        com.bytedance.sdk.openadsdk.core.model.rri rriVarKMt = kMt(tuv);
        if (rriVarKMt == null) {
            return null;
        }
        return rriVarKMt.ldr;
    }

    public static java.lang.String Ta(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (tuv == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.rri rriVarLq = tuv.Lq();
        if (rriVarLq != null && rriVarLq.bX) {
            java.lang.String str = rriVarLq.ldr;
            if (!android.text.TextUtils.isEmpty(str)) {
                return str;
            }
        }
        if (tuv.vb() == 20) {
            return tuv.GvG();
        }
        if (tuv.Dxa() != null) {
            return tuv.Dxa().PX();
        }
        return null;
    }

    public static boolean Lq(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        return ((tuv == null || tuv.Dxa() == null) ? 0 : tuv.Dxa().Fy()) != 1;
    }

    public static boolean vb(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        com.bykv.vk.openvk.bg.bg.bg.bX.IL ilDxa = tuv.Dxa();
        return ilDxa != null && ilDxa.Fy() == 1;
    }

    public static int xxp(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        com.bytedance.sdk.openadsdk.core.model.rri rriVarKMt = kMt(tuv);
        if (rriVarKMt == null) {
            return 0;
        }
        return rriVarKMt.iR;
    }

    public static boolean VzQ(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        return iR(tuv) && JAA(tuv) == 1;
    }

    public static boolean tuV(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        return iR(tuv) && JAA(tuv) == 0;
    }

    public int bg() {
        return this.Kg;
    }

    public int IL() {
        return this.WR;
    }

    public boolean bX() {
        return this.eo;
    }

    public static long Fy(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        return java.lang.Math.max(LZ(tuv), tC(tuv));
    }

    public static long LZ(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        com.bytedance.sdk.openadsdk.core.model.rri rriVarKMt = kMt(tuv);
        if (rriVarKMt == null) {
            return 5L;
        }
        return rriVarKMt.bg();
    }

    public static long tC(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        com.bytedance.sdk.openadsdk.core.model.rri rriVarKMt = kMt(tuv);
        if (rriVarKMt == null) {
            return 5L;
        }
        return rriVarKMt.IL();
    }

    public static boolean rri(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        com.bytedance.sdk.openadsdk.core.model.rri rriVarKMt = kMt(tuv);
        return rriVarKMt != null && rriVarKMt.bX();
    }
}
