package com.bytedance.sdk.openadsdk.core.Kg.bg;

/* JADX INFO: loaded from: classes4.dex */
public class IL {
    private static java.lang.String IL = "";
    public static java.lang.String bg = "https://pag_open_icon_id/appicon.png";

    public static boolean IL() {
        return true;
    }

    public static java.lang.String bg() {
        return IL;
    }

    public static org.json.JSONObject bg(float f, float f2, boolean z, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.json.ce.A, "android");
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("width", f);
            jSONObject2.put("height", f2);
            if (z) {
                jSONObject2.put("isLandscape", true);
            }
            jSONObject.put("AdSize", jSONObject2);
            if ((tuv instanceof com.bytedance.sdk.openadsdk.core.model.Fy) && ((com.bytedance.sdk.openadsdk.core.model.Fy) tuv).Uzu()) {
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject.put("choose_ui_data", jSONObject3);
                com.bytedance.sdk.openadsdk.core.model.bg.C0154bg c0154bgIN = ((com.bytedance.sdk.openadsdk.core.model.Fy) tuv).IN();
                org.json.JSONObject jSONObjectIL = c0154bgIN.IL();
                if (android.text.TextUtils.isEmpty(c0154bgIN.WR())) {
                    jSONObjectIL.put("data", IL(c0154bgIN));
                }
                jSONObject3.put("tpl_info", jSONObjectIL);
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                jSONObject.put("creatives", jSONArray);
                for (com.bytedance.sdk.openadsdk.core.model.tuV tuv2 : ((com.bytedance.sdk.openadsdk.core.model.Fy) tuv).mm()) {
                    org.json.JSONObject jSONObjectBg = bg(false, tuv2);
                    if (jSONObjectBg != null) {
                        jSONObjectBg.put("template_Plugin", IL(tuv2.LKE()));
                        jSONObjectBg.put("diff_template_Plugin", bg(tuv2.LKE()));
                        jSONArray.put(jSONObjectBg);
                    }
                }
                return jSONObject;
            }
            jSONObject.put("creative", bg(false, tuv));
            jSONObject.put("template_Plugin", IL(tuv.LKE()));
            jSONObject.put("diff_template_Plugin", bg(tuv.LKE()));
            return jSONObject;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static org.json.JSONObject bg(float f, float f2, boolean z, com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, com.bytedance.sdk.openadsdk.core.VB.zx.bX bXVar) {
        IL = "";
        org.json.JSONObject jSONObjectZTq = null;
        if (tuv == null) {
            return null;
        }
        try {
            jSONObjectZTq = tuv.ZTq();
            bg(jSONObjectZTq, tuv, str);
            org.json.JSONObject jSONObjectIL = com.bytedance.sdk.openadsdk.core.aGH.IL(tuv);
            jSONObjectIL.put("language", com.bytedance.sdk.openadsdk.core.PX.bg());
            jSONObjectZTq.put("xSetting", jSONObjectIL);
            jSONObjectZTq.put("xAdInfo", bg(str, IL(tuv), tuv));
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            com.bytedance.sdk.openadsdk.core.aGH.IL(jSONObject);
            jSONObject.put(com.json.ce.A, "android");
            jSONObjectZTq.put("xAppInfo", jSONObject);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("width", f);
            jSONObject2.put("height", f2);
            if (z) {
                jSONObject2.put("isLandscape", true);
            }
            jSONObjectZTq.put("xSize", jSONObject2);
            bXVar.bg("adv3");
            com.bytedance.sdk.openadsdk.core.model.Ja jaUu = tuv.uu();
            if (jaUu != null) {
                java.lang.String strEqN = jaUu.eqN();
                if (!android.text.TextUtils.isEmpty(strEqN)) {
                    jSONObjectZTq.put("xTemplate", new org.json.JSONObject(strEqN));
                    IL = "getTemplate success by local data";
                    bXVar.IL("local");
                } else {
                    java.lang.String strBg = com.bytedance.sdk.openadsdk.core.VB.bg.IL.bg().bg("adv3", jaUu.bg(), jaUu.IL());
                    if (!android.text.TextUtils.isEmpty(strBg)) {
                        jSONObjectZTq.put("xTemplate", new org.json.JSONObject(strBg));
                        IL = "getTemplate success by db data";
                        bXVar.IL("local");
                    } else {
                        java.lang.String str2 = "local db data is null id is " + jaUu.bg() + " md5 is " + jaUu.IL();
                        IL = str2;
                        bXVar.bg(3, str2, "net");
                    }
                }
            }
        } catch (java.lang.Exception e) {
            java.lang.String str3 = "load template exception " + e.getMessage();
            IL = str3;
            bXVar.bg(3, str3, "net");
        }
        return jSONObjectZTq;
    }

    private static void bg(org.json.JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str) {
        com.bykv.vk.openvk.bg.bg.bg.bX.IL ilDxa;
        if (tuv == null || jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.has("h265_video")) {
                jSONObject.remove("h265_video");
            }
            if (!jSONObject.has("video") || (ilDxa = tuv.Dxa()) == null) {
                return;
            }
            org.json.JSONObject jSONObjectVzQ = ilDxa.VzQ();
            if (jSONObjectVzQ != null) {
                if ("open_ad".equals(str)) {
                    jSONObjectVzQ.put("video_duration", com.bytedance.sdk.openadsdk.core.VzQ.eqN().rri(java.lang.String.valueOf(tuv.IGR())));
                } else {
                    jSONObjectVzQ.put("video_duration", ilDxa.ldr() * ((double) ilDxa.tC()));
                }
            }
            jSONObject.put("video", jSONObjectVzQ);
        } catch (java.lang.Exception e) {
            e.getMessage();
        }
    }

    private static org.json.JSONObject bg(java.lang.String str, org.json.JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (tuv == null) {
            return jSONObject;
        }
        try {
            if ("open_ad".equals(str)) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("app_name", com.bytedance.sdk.openadsdk.core.WR.IL().ldr());
                int iIR = com.bytedance.sdk.openadsdk.core.WR.IL().iR();
                if (iIR != 0) {
                    int iJAA = tuv.JAA();
                    if (9 == iJAA) {
                        jSONObject2.put("app_icon", bg);
                    } else if (10 == iJAA) {
                        jSONObject2.put("app_icon", "@".concat(java.lang.String.valueOf(iIR)));
                    }
                }
                jSONObject.put("open_app_info", jSONObject2);
            }
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    public static org.json.JSONObject bg(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        if (jSONObject2 == null) {
            return jSONObject;
        }
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        if (jSONObject == null) {
            return jSONObject3;
        }
        try {
            org.json.JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray(com.google.firebase.crashlytics.internal.metadata.UserMetadata.KEYDATA_FILENAME);
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    java.lang.String strOptString = jSONArrayOptJSONArray.optString(i);
                    if (jSONObject.has(strOptString)) {
                        jSONObject3.put(strOptString, jSONObject.opt(strOptString));
                    }
                }
                jSONObject3.put("xSetting", jSONObject.opt("xSetting"));
                jSONObject3.put("xAdInfo", jSONObject.opt("xAdInfo"));
                jSONObject3.put("xAppInfo", jSONObject.opt("xAppInfo"));
                jSONObject3.put("xSize", jSONObject.opt("xSize"));
                jSONObject3.put("xTemplate", jSONObject.opt("xTemplate"));
                return jSONObject3;
            }
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    private static org.json.JSONObject IL(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            com.bytedance.sdk.openadsdk.core.aGH.bg(jSONObject, tuv);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    private static java.lang.String bg(com.bytedance.sdk.openadsdk.core.model.tuV.bg bgVar) {
        return bgVar != null ? bgVar.eo() : "";
    }

    private static java.lang.String IL(com.bytedance.sdk.openadsdk.core.model.tuV.bg bgVar) {
        com.bytedance.sdk.component.adexpress.bg.bX.IL ilBX;
        if (bgVar == null) {
            return "";
        }
        java.lang.String strWR = bgVar.WR();
        return (!android.text.TextUtils.isEmpty(strWR) || (ilBX = com.bytedance.sdk.component.adexpress.bg.IL.IL.bX(bgVar.ldr())) == null) ? strWR : ilBX.zx();
    }

    public static org.json.JSONObject bg(boolean z, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("button_text", tuv.zCS());
            if (tuv.sVc() != null) {
                if (tuv.sVc() != null && !android.text.TextUtils.isEmpty(tuv.sVc().bg())) {
                    jSONObject.put(com.ironsource.y8.h.H0, tuv.sVc().bg());
                } else {
                    jSONObject.put(com.ironsource.y8.h.H0, "");
                }
            }
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            if (tuv.lM() != null) {
                for (int i = 0; i < tuv.lM().size(); i++) {
                    com.bytedance.sdk.openadsdk.core.model.Lq lq = tuv.lM().get(i);
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("height", lq.bX());
                    jSONObject2.put("width", lq.IL());
                    jSONObject2.put("url", lq.bg());
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("image", jSONArray);
            jSONObject.put("image_mode", tuv.bOf());
            jSONObject.put("interaction_type", tuv.jz());
            jSONObject.put("interaction_method", tuv.xxp());
            jSONObject.put("is_compliance_template", IL());
            jSONObject.put(com.ironsource.y8.h.D0, tuv.wS());
            jSONObject.put("description", tuv.cZH());
            jSONObject.put("source", tuv.bN());
            if (tuv.RiO() != null) {
                jSONObject.put("comment_num", tuv.RiO().zx());
                jSONObject.put(com.google.firebase.analytics.FirebaseAnalytics.Param.SCORE, tuv.RiO().eqN());
                jSONObject.put("app_size", tuv.RiO().ldr());
                jSONObject.put("app", tuv.RiO().Kg());
            }
            com.bykv.vk.openvk.bg.bg.bg.bX.IL ilDxa = tuv.Dxa();
            if (ilDxa != null) {
                org.json.JSONObject jSONObjectVzQ = ilDxa.VzQ();
                jSONObjectVzQ.put("video_duration", ilDxa.ldr() * ((double) ilDxa.tC()));
                jSONObject.put("video", jSONObjectVzQ);
            }
            if (tuv.LKE() != null) {
                jSONObject.put("dynamic_creative", tuv.LKE().VB());
            }
            return jSONObject;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static java.lang.String bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str) {
        java.util.List<com.bytedance.sdk.openadsdk.core.model.Lq> listLM;
        if (tuv != null && (listLM = tuv.lM()) != null && listLM.size() > 0) {
            for (com.bytedance.sdk.openadsdk.core.model.Lq lq : listLM) {
                if (lq != null && android.text.TextUtils.equals(str, lq.bg())) {
                    return lq.iR();
                }
            }
        }
        return null;
    }

    public static java.util.Map<java.lang.String, java.lang.String> bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        java.util.HashMap map = null;
        if (tuv == null) {
            return null;
        }
        java.util.List<com.bytedance.sdk.openadsdk.core.model.Lq> listLM = tuv.lM();
        if (listLM != null && listLM.size() > 0) {
            map = new java.util.HashMap();
            for (com.bytedance.sdk.openadsdk.core.model.Lq lq : listLM) {
                if (lq != null) {
                    map.put(lq.bg(), lq.iR());
                }
            }
            com.bytedance.sdk.openadsdk.core.model.Lq lqSVc = tuv.sVc();
            if (lqSVc != null) {
                map.put(lqSVc.bg(), lqSVc.iR());
            }
        }
        return map;
    }
}
