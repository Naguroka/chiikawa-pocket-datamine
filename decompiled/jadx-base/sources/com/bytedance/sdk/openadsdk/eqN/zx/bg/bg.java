package com.bytedance.sdk.openadsdk.eqN.zx.bg;

/* JADX INFO: loaded from: classes4.dex */
public class bg {
    private static final java.util.Map<com.bykv.vk.openvk.bg.bg.bg.IL.bg, com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq> bg = java.util.Collections.synchronizedMap(new java.util.WeakHashMap());

    public static org.json.JSONObject bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, int i, com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            if (!android.text.TextUtils.isEmpty(str)) {
                jSONObject.put("session_id", str);
            }
            if (i > 0) {
                jSONObject.put("play_type", java.lang.String.valueOf(i));
            }
            if (tuv != null) {
                com.bykv.vk.openvk.bg.bg.bg.bX.IL ilDxa = tuv.Dxa();
                if (ilDxa != null) {
                    jSONObject.put("video_resolution", ilDxa.WR());
                    jSONObject.put("video_size", java.lang.Long.valueOf(ilDxa.zx()));
                    jSONObject.put("video_url", ilDxa.VB());
                    jSONObject.put("player_type", bXVar.Lq());
                    jSONObject.put("video_encode_type", bXVar.VB() ? 1 : 0);
                }
                jSONObject.put("dp_creative_type", tuv.OLh());
            }
        } catch (org.json.JSONException e) {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.VideoEventManager", "", e);
        }
        return jSONObject;
    }

    public static void bg(com.bytedance.sdk.openadsdk.eqN.zx.IL.bg<com.bytedance.sdk.openadsdk.eqN.zx.IL.eo> bgVar) {
        com.bytedance.sdk.openadsdk.yDt.bX.bg("load_video_error", bgVar);
    }

    public static void IL(com.bytedance.sdk.openadsdk.eqN.zx.IL.bg<com.bytedance.sdk.openadsdk.eqN.zx.IL.WR> bgVar) {
        com.bytedance.sdk.openadsdk.yDt.bX.bg("load_video_cancel", bgVar);
    }

    public static void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bykv.vk.openvk.bg.bg.bg.IL.bg bgVar, com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar) {
        if (tuv == null || bgVar == null || bXVar == null) {
            return;
        }
        java.lang.String strBg = com.bytedance.sdk.openadsdk.utils.rri.bg();
        int i = com.bytedance.sdk.openadsdk.CacheDirFactory.getICacheDir(tuv.uV()).bg(bXVar) ? 1 : 2;
        bg.put(bgVar, new com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq(android.os.SystemClock.elapsedRealtime(), strBg, i, bXVar, tuv));
        org.json.JSONObject jSONObjectBg = bg(tuv, strBg, i, bXVar);
        java.lang.String strBg2 = com.bytedance.sdk.openadsdk.utils.ayS.bg(tuv);
        if (bXVar.eqN > 0) {
            try {
                jSONObjectBg.put("play_time", bXVar.eqN);
            } catch (org.json.JSONException e) {
                com.bytedance.sdk.component.utils.PX.bg("TTAD.VideoEventManager", "", e);
            }
        }
        com.bytedance.sdk.openadsdk.eqN.zx.IL.bg bgVar2 = new com.bytedance.sdk.openadsdk.eqN.zx.IL.bg(tuv, strBg2, jSONObjectBg, null);
        bgVar2.bg(bXVar.Lq() == -1);
        bg(bgVar2, "play_start");
    }

    public static void bg(android.content.Context context, com.bykv.vk.openvk.bg.bg.bg.IL.bg bgVar, com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq.bg bgVar2, com.bytedance.sdk.openadsdk.eqN.iR iRVar) {
        com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq lq;
        if (context == null || bgVar == null || bgVar2 == null || (lq = bg.get(bgVar)) == null) {
            return;
        }
        com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVarEqN = lq.eqN();
        com.bytedance.sdk.openadsdk.core.model.tuV tuvZx = lq.zx();
        if (bXVarEqN == null || tuvZx == null) {
            return;
        }
        if (!bgVar2.eo()) {
            bg(tuvZx, bXVarEqN, bgVar2);
        }
        com.bytedance.sdk.openadsdk.eqN.zx.IL.Kg kg = new com.bytedance.sdk.openadsdk.eqN.zx.IL.Kg();
        kg.bg(bgVar2.VB() ? 1 : 0);
        kg.IL(com.bytedance.sdk.openadsdk.CacheDirFactory.getICacheDir(tuvZx.uV()).IL(bXVarEqN));
        kg.bg(android.os.SystemClock.elapsedRealtime() - lq.bg());
        org.json.JSONObject jSONObjectBg = bg(tuvZx, lq.IL(), lq.bX(), bXVarEqN);
        if (bXVarEqN.eqN > 0) {
            try {
                jSONObjectBg.put("play_time", bXVarEqN.eqN);
            } catch (org.json.JSONException e) {
                com.bytedance.sdk.component.utils.PX.bg("TTAD.VideoEventManager", "", e);
            }
        }
        com.bytedance.sdk.openadsdk.eqN.zx.IL.bg bgVar3 = new com.bytedance.sdk.openadsdk.eqN.zx.IL.bg(tuvZx, com.bytedance.sdk.openadsdk.utils.ayS.bg(tuvZx), jSONObjectBg, kg);
        bgVar3.bg(bgVar2.eo());
        bg(bgVar3, "feed_play", iRVar);
    }

    public static void bg(com.bykv.vk.openvk.bg.bg.bg.IL.bg bgVar, com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq.bg bgVar2) {
        com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq lq;
        if (bgVar == null || bgVar2 == null || (lq = bg.get(bgVar)) == null) {
            return;
        }
        com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVarEqN = lq.eqN();
        com.bytedance.sdk.openadsdk.core.model.tuV tuvZx = lq.zx();
        if (bXVarEqN == null || tuvZx == null) {
            return;
        }
        long jBg = bgVar2.bg();
        long jBX = bgVar2.bX();
        if (jBX <= 0 || jBg <= 0) {
            return;
        }
        com.bytedance.sdk.openadsdk.eqN.zx.IL.iR iRVar = new com.bytedance.sdk.openadsdk.eqN.zx.IL.iR();
        iRVar.bg(bgVar2.IL());
        iRVar.IL(jBX);
        org.json.JSONObject jSONObjectBg = bg(tuvZx, lq.IL(), lq.bX(), bXVarEqN);
        if (bXVarEqN.eqN > 0) {
            try {
                jSONObjectBg.put("play_time", bXVarEqN.eqN);
            } catch (org.json.JSONException e) {
                com.bytedance.sdk.component.utils.PX.bg("TTAD.VideoEventManager", "", e);
            }
        }
        com.bytedance.sdk.openadsdk.eqN.zx.IL.bg bgVar3 = new com.bytedance.sdk.openadsdk.eqN.zx.IL.bg(tuvZx, com.bytedance.sdk.openadsdk.utils.ayS.bg(tuvZx), jSONObjectBg, iRVar);
        bgVar3.bg(bgVar2.eo());
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("duration", jBg);
            jSONObject.put("percent", bgVar2.ldr());
            bg(bgVar3, "feed_pause", jSONObject);
        } catch (org.json.JSONException e2) {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.VideoEventManager", "", e2);
        }
    }

    public static void IL(com.bykv.vk.openvk.bg.bg.bg.IL.bg bgVar, com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq.bg bgVar2) {
        com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq lq;
        if (bgVar == null || bgVar2 == null || (lq = bg.get(bgVar)) == null) {
            return;
        }
        com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVarEqN = lq.eqN();
        com.bytedance.sdk.openadsdk.core.model.tuV tuvZx = lq.zx();
        if (bXVarEqN == null || tuvZx == null) {
            return;
        }
        long jBg = bgVar2.bg();
        long jBX = bgVar2.bX();
        if (jBX <= 0 || jBg <= 0) {
            return;
        }
        com.bytedance.sdk.openadsdk.eqN.zx.IL.zx zxVar = new com.bytedance.sdk.openadsdk.eqN.zx.IL.zx();
        zxVar.bg(bgVar2.IL());
        zxVar.IL(jBX);
        org.json.JSONObject jSONObjectBg = bg(tuvZx, lq.IL(), lq.bX(), bXVarEqN);
        if (bXVarEqN.eqN > 0) {
            try {
                jSONObjectBg.put("play_time", bXVarEqN.eqN);
            } catch (org.json.JSONException e) {
                com.bytedance.sdk.component.utils.PX.bg("TTAD.VideoEventManager", "", e);
            }
        }
        com.bytedance.sdk.openadsdk.eqN.zx.IL.bg bgVar3 = new com.bytedance.sdk.openadsdk.eqN.zx.IL.bg(tuvZx, com.bytedance.sdk.openadsdk.utils.ayS.bg(tuvZx), jSONObjectBg, zxVar);
        bgVar3.bg(bgVar2.eo());
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("duration", jBg);
            jSONObject.put("percent", bgVar2.ldr());
            bg(bgVar3, "feed_continue", jSONObject);
        } catch (org.json.JSONException e2) {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.VideoEventManager", "", e2);
        }
    }

    public static void bX(com.bykv.vk.openvk.bg.bg.bg.IL.bg bgVar, com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq.bg bgVar2) {
        com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq lq;
        if (bgVar == null || bgVar2 == null || (lq = bg.get(bgVar)) == null) {
            return;
        }
        com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVarEqN = lq.eqN();
        com.bytedance.sdk.openadsdk.core.model.tuV tuvZx = lq.zx();
        if (bXVarEqN == null || tuvZx == null) {
            return;
        }
        long jBg = bgVar2.bg();
        long jBX = bgVar2.bX();
        com.bytedance.sdk.openadsdk.eqN.zx.IL.yDt ydt = new com.bytedance.sdk.openadsdk.eqN.zx.IL.yDt(bgVar2.PX());
        ydt.bg(bgVar2.IL());
        ydt.IL(jBX);
        org.json.JSONObject jSONObjectBg = bg(tuvZx, lq.IL(), lq.bX(), bXVarEqN);
        if (bXVarEqN.eqN > 0) {
            try {
                jSONObjectBg.put("play_time", bXVarEqN.eqN);
            } catch (org.json.JSONException e) {
                com.bytedance.sdk.component.utils.PX.bg("TTAD.VideoEventManager", "", e);
            }
        }
        com.bytedance.sdk.openadsdk.eqN.zx.IL.bg bgVar3 = new com.bytedance.sdk.openadsdk.eqN.zx.IL.bg(tuvZx, com.bytedance.sdk.openadsdk.utils.ayS.bg(tuvZx), jSONObjectBg, ydt);
        bgVar3.bg(bgVar2.eo());
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("duration", jBg);
            jSONObject.put("percent", bgVar2.ldr());
            bg(bgVar3, "play_error", jSONObject);
        } catch (org.json.JSONException e2) {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.VideoEventManager", "", e2);
        }
        bg.remove(bgVar);
    }

    public static void eqN(com.bykv.vk.openvk.bg.bg.bg.IL.bg bgVar, com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq.bg bgVar2) {
        com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq lq;
        if (bgVar == null || bgVar2 == null || (lq = bg.get(bgVar)) == null) {
            return;
        }
        com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVarEqN = lq.eqN();
        com.bytedance.sdk.openadsdk.core.model.tuV tuvZx = lq.zx();
        if (bXVarEqN == null || tuvZx == null) {
            return;
        }
        long jBg = bgVar2.bg();
        long jBX = bgVar2.bX();
        com.bytedance.sdk.openadsdk.eqN.zx.IL.IL il = new com.bytedance.sdk.openadsdk.eqN.zx.IL.IL();
        il.bg(bgVar2.IL());
        il.IL(jBX);
        il.bg(bgVar2.eqN());
        il.IL(bgVar2.zx());
        com.bytedance.sdk.openadsdk.eqN.zx.IL.bg bgVar3 = new com.bytedance.sdk.openadsdk.eqN.zx.IL.bg(tuvZx, com.bytedance.sdk.openadsdk.utils.ayS.bg(tuvZx), bg(tuvZx, lq.IL(), lq.bX(), bXVarEqN), il);
        bgVar3.bg(bgVar2.eo());
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("duration", jBg);
            jSONObject.put("percent", bgVar2.ldr());
            bg(bgVar3, "endcard_skip", jSONObject);
        } catch (org.json.JSONException e) {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.VideoEventManager", "", e);
        }
    }

    public static void bg(com.bykv.vk.openvk.bg.bg.bg.IL.bg bgVar, com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq.bg bgVar2, com.bytedance.sdk.openadsdk.eqN.iR iRVar) {
        com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq lq;
        if (bgVar == null || bgVar2 == null || (lq = bg.get(bgVar)) == null) {
            return;
        }
        com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVarEqN = lq.eqN();
        com.bytedance.sdk.openadsdk.core.model.tuV tuvZx = lq.zx();
        if (bXVarEqN == null || tuvZx == null) {
            return;
        }
        long jBg = bgVar2.bg();
        long jBX = bgVar2.bX();
        com.bytedance.sdk.openadsdk.eqN.zx.IL.eqN eqn = new com.bytedance.sdk.openadsdk.eqN.zx.IL.eqN();
        eqn.IL(bgVar2.IL());
        eqn.bg(jBX);
        eqn.bg(bgVar2.iR());
        eqn.IL(bgVar2.Kg());
        org.json.JSONObject jSONObjectBg = bg(tuvZx, lq.IL(), lq.bX(), bXVarEqN);
        if (bXVarEqN.eqN > 0) {
            try {
                jSONObjectBg.put("play_time", bXVarEqN.eqN);
            } catch (org.json.JSONException e) {
                com.bytedance.sdk.component.utils.PX.bg("TTAD.VideoEventManager", "", e);
            }
        }
        com.bytedance.sdk.openadsdk.eqN.zx.IL.bg bgVar3 = new com.bytedance.sdk.openadsdk.eqN.zx.IL.bg(tuvZx, com.bytedance.sdk.openadsdk.utils.ayS.bg(tuvZx), jSONObjectBg, eqn);
        bgVar3.bg(bgVar2.eo());
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("duration", jBg);
            jSONObject.put("percent", bgVar2.ldr());
            bg(bgVar3, "feed_break", jSONObject, iRVar);
        } catch (org.json.JSONException e2) {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.VideoEventManager", "", e2);
        }
    }

    public static void IL(com.bykv.vk.openvk.bg.bg.bg.IL.bg bgVar, com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq.bg bgVar2, com.bytedance.sdk.openadsdk.eqN.iR iRVar) {
        if (bgVar == null || bgVar2 == null) {
            return;
        }
        zx(bgVar, bgVar2);
        com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq lq = bg.get(bgVar);
        if (lq == null) {
            return;
        }
        com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVarEqN = lq.eqN();
        com.bytedance.sdk.openadsdk.core.model.tuV tuvZx = lq.zx();
        if (bXVarEqN == null || tuvZx == null) {
            return;
        }
        long jBg = bgVar2.bg();
        long jBX = bgVar2.bX();
        com.bytedance.sdk.openadsdk.eqN.zx.IL.ldr ldrVar = new com.bytedance.sdk.openadsdk.eqN.zx.IL.ldr();
        ldrVar.IL(bgVar2.IL());
        ldrVar.bg(jBX);
        ldrVar.bg(bgVar2.Kg());
        org.json.JSONObject jSONObjectBg = bg(tuvZx, lq.IL(), lq.bX(), bXVarEqN);
        if (bXVarEqN.eqN > 0) {
            try {
                jSONObjectBg.put("play_time", bXVarEqN.eqN);
            } catch (org.json.JSONException e) {
                com.bytedance.sdk.component.utils.PX.bg("TTAD.VideoEventManager", "", e);
            }
        }
        com.bytedance.sdk.openadsdk.eqN.zx.IL.bg bgVar3 = new com.bytedance.sdk.openadsdk.eqN.zx.IL.bg(tuvZx, com.bytedance.sdk.openadsdk.utils.ayS.bg(tuvZx), jSONObjectBg, ldrVar);
        bgVar3.bg(bgVar2.eo());
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("duration", jBg);
            jSONObject.put("percent", bgVar2.ldr());
            bg(bgVar3, "feed_over", jSONObject, iRVar);
        } catch (org.json.JSONException e2) {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.VideoEventManager", "", e2);
        }
        bg.remove(bgVar);
    }

    public static void zx(com.bykv.vk.openvk.bg.bg.bg.IL.bg bgVar, com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq.bg bgVar2) {
        com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq lq;
        if (bgVar == null || bgVar2 == null || bgVar2.WR() <= 0 || (lq = bg.get(bgVar)) == null) {
            return;
        }
        com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVarEqN = lq.eqN();
        com.bytedance.sdk.openadsdk.core.model.tuV tuvZx = lq.zx();
        if (bXVarEqN == null || tuvZx == null) {
            return;
        }
        long jBX = bgVar2.bX();
        com.bytedance.sdk.openadsdk.eqN.zx.IL.Ta ta = new com.bytedance.sdk.openadsdk.eqN.zx.IL.Ta();
        ta.bg(bgVar2.IL());
        ta.IL(jBX);
        ta.bg(bgVar2.WR());
        org.json.JSONObject jSONObjectBg = bg(tuvZx, lq.IL(), lq.bX(), bXVarEqN);
        if (bXVarEqN.eqN > 0) {
            try {
                jSONObjectBg.put("play_time", bXVarEqN.eqN);
            } catch (org.json.JSONException e) {
                com.bytedance.sdk.component.utils.PX.bg("TTAD.VideoEventManager", "", e);
            }
        }
        com.bytedance.sdk.openadsdk.eqN.zx.IL.bg bgVar3 = new com.bytedance.sdk.openadsdk.eqN.zx.IL.bg(tuvZx, com.bytedance.sdk.openadsdk.utils.ayS.bg(tuvZx), jSONObjectBg, ta);
        bgVar3.bg(bgVar2.eo());
        bg(bgVar3, "play_buffer");
    }

    private static void bg(com.bytedance.sdk.openadsdk.eqN.zx.IL.bg bgVar, java.lang.String str) {
        bg(bgVar, str, (org.json.JSONObject) null, (com.bytedance.sdk.openadsdk.eqN.iR) null);
    }

    private static void bg(com.bytedance.sdk.openadsdk.eqN.zx.IL.bg bgVar, java.lang.String str, org.json.JSONObject jSONObject) {
        bg(bgVar, str, jSONObject, (com.bytedance.sdk.openadsdk.eqN.iR) null);
    }

    private static void bg(com.bytedance.sdk.openadsdk.eqN.zx.IL.bg bgVar, java.lang.String str, com.bytedance.sdk.openadsdk.eqN.iR iRVar) {
        bg(bgVar, str, (org.json.JSONObject) null, iRVar);
    }

    private static void bg(final com.bytedance.sdk.openadsdk.eqN.zx.IL.bg bgVar, java.lang.String str, final org.json.JSONObject jSONObject, final com.bytedance.sdk.openadsdk.eqN.iR iRVar) {
        if (bgVar == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        if (bgVar.zx() && !android.text.TextUtils.isEmpty(bgVar.IL())) {
            java.lang.String strIL = bgVar.IL();
            strIL.hashCode();
            if (strIL.equals("stream") || strIL.equals("embeded_ad")) {
                str = "customer_".concat(java.lang.String.valueOf(str));
            }
        }
        final java.lang.String str2 = str;
        com.bytedance.sdk.openadsdk.eqN.bX.bg(java.lang.System.currentTimeMillis(), bgVar.bg(), bgVar.IL(), str2, new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.zx.bg.bg.1
            @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
            public org.json.JSONObject bg() {
                com.bytedance.sdk.openadsdk.eqN.iR iRVar2;
                try {
                    org.json.JSONObject jSONObjectBX = bgVar.bX();
                    if (bgVar.eqN() != null) {
                        bgVar.eqN().bg(jSONObjectBX);
                    }
                    if (("feed_play".equals(str2) || "feed_over".equals(str2) || "feed_break".equals(str2)) && (iRVar2 = iRVar) != null) {
                        iRVar2.bg(jSONObjectBX);
                    }
                    jSONObject.put("ad_extra_data", jSONObjectBX.toString());
                } catch (java.lang.Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    private static void bg(final com.bytedance.sdk.openadsdk.core.model.tuV tuv, final com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar, final com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq.bg bgVar) {
        com.bytedance.sdk.openadsdk.yDt.bX.bg();
        com.bytedance.sdk.openadsdk.yDt.bX.bg("pangle_video_play_state", false, new com.bytedance.sdk.openadsdk.yDt.IL() { // from class: com.bytedance.sdk.openadsdk.eqN.zx.bg.bg.2
            @Override // com.bytedance.sdk.openadsdk.yDt.IL
            public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("service_duration", com.bytedance.sdk.openadsdk.eqN.zx.bg.bg.bX(bXVar));
                jSONObject.put("player_duration", bgVar.bX());
                jSONObject.put("cache_path_type", com.bytedance.sdk.openadsdk.CacheDirFactory.getCacheType());
                jSONObject.put("url", bXVar.Ta());
                jSONObject.put("path", com.bytedance.sdk.openadsdk.eqN.zx.bg.bg.eqN(bXVar));
                jSONObject.put("player_type", bXVar.Lq());
                com.bytedance.sdk.openadsdk.yDt.bg.eqN eqnBg = com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg("pangle_video_play_state");
                com.bytedance.sdk.openadsdk.core.model.tuV tuv2 = tuv;
                return eqnBg.bg(tuv2 != null ? tuv2.Fx() : 0).IL(jSONObject.toString());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long bX(com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar) {
        if (bXVar == null) {
            return 0L;
        }
        com.bykv.vk.openvk.bg.bg.bg.bX.IL ilLZ = bXVar.VB() ? bXVar.LZ() : bXVar.Fy();
        if (ilLZ != null) {
            return java.lang.Double.valueOf(ilLZ.ldr() * 1000.0d).longValue();
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String eqN(com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar) {
        return new java.io.File(bXVar.IL(), bXVar.yDt()).getAbsolutePath();
    }
}
