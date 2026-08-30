package com.bytedance.sdk.openadsdk.core.settings;

/* JADX INFO: loaded from: classes4.dex */
public class IL {
    public int CQc;
    public int DDQ;
    public java.lang.String Dxa;
    public int Fy;
    public int IL;
    public int JAA;
    public int Ja;
    public int Kg;
    public int LKE;
    public boolean LZ;
    public int Lq;
    public int PX;
    public java.util.List<com.bytedance.sdk.openadsdk.core.settings.Kg> Pae;
    public org.json.JSONObject RJ;
    public int Ta;
    public boolean Uq;
    public int Uw;
    public int VB;
    public int VJ;
    public boolean VW;
    public int VzQ;
    public int WR;
    public int ZQc;
    public boolean aGH;
    public boolean ayS;
    public java.lang.String bN;
    public int bX;
    public java.lang.String bg;
    public int daV;
    public int eo;
    public int eqN;
    public int iR;
    public java.util.List<com.bytedance.sdk.openadsdk.core.settings.Kg> jz;
    public int kMt;
    public int ldr;
    public long qC;
    public java.util.List<java.lang.String> rri;
    public int tC;
    public int tuV;
    public int uu;
    public int vb;
    public int xxp;
    public int yDt;
    public int zx;

    private static boolean bg(int i) {
        return i == 1 || i == 2;
    }

    public IL(org.json.JSONObject jSONObject) {
        this.IL = 1;
        this.bX = 1;
        this.eqN = 2;
        this.zx = 1;
        this.ldr = 100;
        this.iR = 0;
        this.Kg = 2;
        this.WR = 1;
        this.eo = 3;
        this.VB = 30;
        this.PX = 30;
        this.Ta = 1;
        this.yDt = 1;
        this.Lq = 2;
        this.vb = 1500;
        this.xxp = 2;
        this.VzQ = com.json.mediationsdk.utils.IronSourceConstants.BN_AUCTION_REQUEST;
        this.tuV = 0;
        this.Fy = 5;
        this.LZ = false;
        this.tC = 0;
        this.kMt = 2;
        this.JAA = -1;
        this.Ja = 0;
        this.Uw = 0;
        this.DDQ = 5;
        this.Uq = true;
        this.aGH = false;
        this.VW = false;
        this.VJ = 0;
        this.daV = -1;
        this.ayS = false;
        this.ZQc = 60000;
        this.LKE = 2;
        this.CQc = 1000;
        this.uu = 1;
        this.jz = new java.util.ArrayList();
        this.Pae = new java.util.ArrayList();
        new org.json.JSONObject();
        this.RJ = jSONObject;
        if (jSONObject == null) {
            return;
        }
        this.bg = jSONObject.optString("code_id");
        this.IL = jSONObject.optInt("auto_play", 1);
        this.daV = jSONObject.optInt("endcard_close_time", -1);
        this.bX = jSONObject.optInt("voice_control", 1);
        this.eqN = jSONObject.optInt("rv_preload", 2);
        this.zx = jSONObject.optInt("nv_preload", 1);
        this.ldr = java.lang.Math.min(100, java.lang.Math.max(0, jSONObject.optInt("proportion_watching", 100)));
        this.iR = jSONObject.optInt("skip_time_displayed", 0);
        this.Kg = jSONObject.optInt("video_skip_result", 2);
        this.WR = jSONObject.optInt("reg_creative_control", 1);
        this.eo = jSONObject.optInt("play_bar_show_time", 3);
        int iOptInt = jSONObject.optInt("rv_skip_time", 30);
        this.VB = iOptInt;
        if (iOptInt < 0) {
            this.VB = 30;
        }
        this.Ta = jSONObject.optInt("voice_control", 2);
        this.yDt = jSONObject.optInt("if_show_win", 1);
        this.Lq = jSONObject.optInt("sp_preload", 2);
        this.vb = jSONObject.optInt("stop_time", 1500);
        this.xxp = jSONObject.optInt("native_playable_delay", 2);
        this.VzQ = jSONObject.optInt("time_out_control", -1);
        this.JAA = jSONObject.optInt("playable_close_time", -1);
        this.tuV = jSONObject.optInt("playable_reward_type", 0);
        this.tC = jSONObject.optInt("reward_is_callback", 0);
        int iOptInt2 = jSONObject.optInt("iv_skip_time", 5);
        this.Fy = iOptInt2;
        if (iOptInt2 < 0) {
            this.Fy = 5;
        }
        bg(jSONObject.optJSONArray("parent_tpl_ids"));
        this.kMt = jSONObject.optInt("slot_type", 2);
        this.LZ = jSONObject.optBoolean("close_on_click", false);
        this.Ja = jSONObject.optInt("allow_system_back", 0);
        this.Uw = jSONObject.optInt("splash_skip_time", 0);
        this.DDQ = jSONObject.optInt("splash_image_count_down_time", 5);
        this.aGH = jSONObject.optBoolean("splash_count_down_time_off", false);
        this.VW = jSONObject.optBoolean("splash_close_on_click", false);
        int iOptInt3 = jSONObject.optInt("splash_load_strategy", 0);
        this.VJ = iOptInt3;
        if (iOptInt3 < 0 || iOptInt3 > 1) {
            this.VJ = 0;
        }
        this.Uq = jSONObject.optBoolean("allow_mediaview_click", true);
        int iOptInt4 = jSONObject.optInt("total_time_out", 60000);
        this.ZQc = iOptInt4;
        if (iOptInt4 <= 0 || iOptInt4 > 1800000) {
            this.ZQc = 60000;
        }
        int iOptInt5 = jSONObject.optInt("req_parallel_num", 2);
        this.LKE = iOptInt5;
        if (iOptInt5 <= 0 || iOptInt5 > 4) {
            this.LKE = 2;
        }
        this.CQc = jSONObject.optInt("bidding_token_tmax", 1000);
        int iOptInt6 = jSONObject.optInt("ad_load_type", 1);
        this.uu = iOptInt6;
        if (iOptInt6 <= 0 || iOptInt6 > 2) {
            this.uu = 1;
        }
        boolean zOptBoolean = jSONObject.optBoolean("is_mediation", false);
        this.ayS = zOptBoolean;
        if (zOptBoolean) {
            com.bytedance.sdk.openadsdk.core.settings.xxp.zU().zCS();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("mediation_config");
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                org.json.JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                java.lang.String strOptString = jSONObjectOptJSONObject.optString("adn_name");
                java.lang.String strOptString2 = jSONObjectOptJSONObject.optString("adn_slot_id");
                int iOptInt7 = jSONObjectOptJSONObject.optInt("ad_expired_time", com.adjust.sdk.Constants.ONE_HOUR);
                int iOptInt8 = jSONObjectOptJSONObject.optInt("req_bidding_type", 2);
                java.lang.String strOptString3 = jSONObjectOptJSONObject.optString("rit_cpm");
                int iOptInt9 = jSONObjectOptJSONObject.optInt("show_sort");
                int iOptInt10 = jSONObjectOptJSONObject.optInt("layer_time_out", 2000);
                int i2 = (iOptInt10 <= 0 || iOptInt10 > 60000) ? 2000 : iOptInt10;
                org.json.JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("server_params");
                if (iOptInt8 == 2) {
                    arrayList.add(new com.bytedance.sdk.openadsdk.core.settings.Kg(strOptString, strOptString2, iOptInt7, iOptInt8, strOptString3, iOptInt9, i2, jSONObjectOptJSONObject2 == null ? "" : jSONObjectOptJSONObject2.toString()));
                } else if (iOptInt8 == 0) {
                    arrayList2.add(new com.bytedance.sdk.openadsdk.core.settings.Kg(strOptString, strOptString2, iOptInt7, iOptInt8, strOptString3, iOptInt9, i2, jSONObjectOptJSONObject2 == null ? "" : jSONObjectOptJSONObject2.toString()));
                }
            }
            this.jz = arrayList;
            this.Pae = arrayList2;
            java.util.Collections.sort(arrayList);
            java.util.Collections.sort(this.Pae);
        }
        if (!bg(this.bX)) {
            this.bX = 1;
        }
        if (!bg(this.Ta)) {
            this.Ta = 1;
        }
        this.qC = jSONObject.optLong("waterfall_id");
        java.lang.String strOptString4 = jSONObject.optString("waterfall_version");
        this.Dxa = strOptString4;
        this.bN = strOptString4;
        this.PX = jSONObject.optInt("multi_rv_skip_time", 30);
    }

    public IL(java.lang.String str, int i) {
        this.IL = 1;
        this.bX = 1;
        this.eqN = 2;
        this.zx = 1;
        this.ldr = 100;
        this.iR = 0;
        this.Kg = 2;
        this.WR = 1;
        this.eo = 3;
        this.VB = 30;
        this.PX = 30;
        this.Ta = 1;
        this.yDt = 1;
        this.Lq = 2;
        this.vb = 1500;
        this.xxp = 2;
        this.VzQ = com.json.mediationsdk.utils.IronSourceConstants.BN_AUCTION_REQUEST;
        this.tuV = 0;
        this.Fy = 5;
        this.LZ = false;
        this.tC = 0;
        this.kMt = 2;
        this.JAA = -1;
        this.Ja = 0;
        this.Uw = 0;
        this.DDQ = 5;
        this.Uq = true;
        this.aGH = false;
        this.VW = false;
        this.VJ = 0;
        this.daV = -1;
        this.ayS = false;
        this.ZQc = 60000;
        this.LKE = 2;
        this.CQc = 1000;
        this.uu = 1;
        this.jz = new java.util.ArrayList();
        this.Pae = new java.util.ArrayList();
        this.RJ = new org.json.JSONObject();
        this.bg = str;
        this.bX = i;
    }

    public void bg(org.json.JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        this.rri = new java.util.ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                this.rri.add(jSONArray.get(i).toString());
            } catch (java.lang.Exception unused) {
                return;
            }
        }
    }
}
