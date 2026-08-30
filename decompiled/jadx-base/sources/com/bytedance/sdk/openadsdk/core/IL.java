package com.bytedance.sdk.openadsdk.core;

/* JADX INFO: loaded from: classes4.dex */
public class IL {
    private static boolean bg(int i) {
        return i == 2 || i == 3 || i == 8;
    }

    public static android.util.Pair<com.bytedance.sdk.openadsdk.core.model.bg, java.util.ArrayList<java.lang.Integer>> bg(org.json.JSONObject jSONObject, com.bytedance.sdk.openadsdk.AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.LZ lz, com.bytedance.sdk.openadsdk.core.model.IL il) {
        if (jSONObject == null) {
            return null;
        }
        try {
            com.bytedance.sdk.openadsdk.core.model.bg bgVar = new com.bytedance.sdk.openadsdk.core.model.bg();
            bgVar.bg(jSONObject.optString("request_id"));
            bgVar.bg(jSONObject.optInt("ret"));
            int i = 0;
            bgVar.IL(jSONObject.optInt("multi_ad_style", 0));
            bgVar.IL(jSONObject.optString(com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE));
            java.lang.String strOptString = jSONObject.optString("gdid_encrypted");
            if (jSONObject.has("choose_ui_data")) {
                bgVar.bg(jSONObject.optJSONObject("choose_ui_data"));
                bgVar.bg(true);
            }
            java.lang.String strOptString2 = jSONObject.optString("auction_price");
            if (bgVar.IL() != 0) {
                return null;
            }
            org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("creatives");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                java.util.ArrayList arrayList2 = bgVar.VB() ? new java.util.ArrayList() : null;
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    com.bytedance.sdk.openadsdk.core.model.tuV tuvBg = bg(jSONArrayOptJSONArray.optJSONObject(i2), adSlot, lz);
                    if (tuvBg != null && bgVar.VB()) {
                        if (tuvBg.vb() == 30) {
                            tuvBg.WR(true);
                        } else {
                            bgVar.IL(0);
                            arrayList2 = null;
                        }
                    }
                    int iBg = bg(tuvBg);
                    if (iBg != 200) {
                        if (tuvBg != null) {
                            com.bytedance.sdk.openadsdk.eqN.bX.IL(tuvBg, com.bytedance.sdk.openadsdk.utils.ayS.bX(tuvBg.JMw()), iBg);
                        } else {
                            com.bytedance.sdk.openadsdk.eqN.bX.IL((com.bytedance.sdk.openadsdk.core.model.tuV) null, "", iBg);
                        }
                        arrayList.add(java.lang.Integer.valueOf(iBg));
                        if (arrayList2 != null && tuvBg != null) {
                            arrayList2.add(new com.bytedance.sdk.openadsdk.core.IL.bg(tuvBg.MM(), iBg));
                        }
                    } else {
                        tuvBg.WR(strOptString2);
                        if (!android.text.TextUtils.isEmpty(strOptString)) {
                            tuvBg.Ja(strOptString);
                        }
                        bgVar.bg(tuvBg);
                    }
                }
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    bg((java.util.ArrayList<com.bytedance.sdk.openadsdk.core.IL.bg>) arrayList2);
                }
                i = length;
            }
            bg(i, bgVar, (java.util.ArrayList<java.lang.Integer>) arrayList, il);
            return new android.util.Pair<>(bgVar, arrayList);
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.AdInfoFactory", th.getMessage());
            return null;
        }
    }

    private static void bg(int i, final com.bytedance.sdk.openadsdk.core.model.bg bgVar, final java.util.ArrayList<java.lang.Integer> arrayList, final com.bytedance.sdk.openadsdk.core.model.IL il) {
        if (bgVar == null || i < 2 || !bgVar.iR()) {
            return;
        }
        final int size = i - (bgVar.bX() != null ? bgVar.bX().size() : 0);
        final boolean z = bgVar.Kg() == null;
        if (size > 0 || z) {
            com.bytedance.sdk.openadsdk.yDt.bX.bg();
            com.bytedance.sdk.openadsdk.yDt.bX.bg("choose_ad_parsing_error", false, new com.bytedance.sdk.openadsdk.yDt.IL() { // from class: com.bytedance.sdk.openadsdk.core.IL.1
                @Override // com.bytedance.sdk.openadsdk.yDt.IL
                public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("req_id", bgVar.bg());
                    jSONObject.put("material_error", size);
                    jSONObject.put("choose_ui_error", z ? 1 : 0);
                    java.util.ArrayList arrayList2 = arrayList;
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        jSONObject.put("mate_unavailable_code_list", new org.json.JSONArray((java.util.Collection) arrayList).toString());
                    }
                    com.bytedance.sdk.openadsdk.core.model.IL il2 = il;
                    if (il2 != null) {
                        jSONObject.put("server_res_str", il2.bg());
                    }
                    return com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg("choose_ad_parsing_error").IL(jSONObject.toString());
                }
            });
        }
    }

    public static com.bytedance.sdk.openadsdk.core.model.tuV bg(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return bg(jSONObject, (com.bytedance.sdk.openadsdk.AdSlot) null, (com.bytedance.sdk.openadsdk.core.model.LZ) null);
    }

    /* JADX WARN: Code duplicated, block: B:140:0x05bd A[PHI: r14
  0x05bd: PHI (r14v83 int) = (r14v82 int), (r14v124 int) binds: [B:133:0x05a9, B:138:0x05ba] A[DONT_GENERATE, DONT_INLINE]] */
    private static com.bytedance.sdk.openadsdk.core.model.tuV bg(org.json.JSONObject jSONObject, com.bytedance.sdk.openadsdk.AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.LZ lz) {
        com.bykv.vk.openvk.bg.bg.bg.bX.IL ilBg;
        com.bykv.vk.openvk.bg.bg.bg.bX.IL ilBg2;
        int i;
        com.bytedance.sdk.openadsdk.core.PX.bg bgVarBg;
        com.bytedance.sdk.openadsdk.core.PX.bg.IL.bg bgVar;
        org.json.JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.tuV tuvBX = com.bytedance.sdk.openadsdk.core.model.tuV.bX();
        tuvBX.tuV(jSONObject.optInt("interaction_type"));
        tuvBX.VzQ(jSONObject.optInt(com.bytedance.sdk.openadsdk.core.model.tuV.eqN, 0));
        tuvBX.Fy(jSONObject.optInt(com.bytedance.sdk.openadsdk.core.model.tuV.bX, 0));
        tuvBX.LZ(jSONObject.optInt(com.bytedance.sdk.openadsdk.core.model.tuV.zx, 0));
        tuvBX.Ta(jSONObject.optString("target_url"));
        tuvBX.VzQ(jSONObject.optString("ad_id"));
        tuvBX.tuV(jSONObject.optString("app_log_url"));
        tuvBX.VB(jSONObject.optString("source"));
        tuvBX.PX(jSONObject.optString("app_name"));
        tuvBX.JAA(jSONObject.optInt("dislike_control", 0));
        tuvBX.Ta(jSONObject.optInt("play_bar_show_time", com.applovin.sdk.AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES));
        tuvBX.LZ(jSONObject.optString("gecko_id"));
        if (jSONObject.has("set_click_type")) {
            org.json.JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("set_click_type");
            tuvBX.IL(jSONObjectOptJSONObject2.optDouble(com.ironsource.y8.h.G0, 2.0d));
            tuvBX.bg(jSONObjectOptJSONObject2.optDouble("other", 1.0d));
        }
        tuvBX.zx(jSONObject.optJSONObject("extension"));
        org.json.JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject(com.ironsource.y8.h.H0);
        tuvBX.eqN(jSONObject.optBoolean("screenshot", false));
        tuvBX.VB(jSONObject.optInt("play_bar_style", 0));
        tuvBX.tC(jSONObject.optString("market_url", ""));
        tuvBX.WR(jSONObject.optInt("video_adaptation", 0));
        tuvBX.ldr(jSONObject.optInt("feed_video_opentype", 0));
        tuvBX.bX(jSONObject.optJSONObject("session_params"));
        tuvBX.WR(jSONObject.optString("auction_price", ""));
        tuvBX.aGH(jSONObject.optInt("mrc_report", 0));
        if (jSONObject.optBoolean("isMrcReportFinish", false)) {
            tuvBX.uny();
        }
        org.json.JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("render");
        if (jSONObjectOptJSONObject4 != null) {
            tuvBX.iR(jSONObjectOptJSONObject4.optInt("render_sequence", 0));
            tuvBX.Kg(jSONObjectOptJSONObject4.optInt("backup_render_control", 1));
            tuvBX.VW(jSONObjectOptJSONObject4.optInt("reserve_time", 100));
            tuvBX.VJ(jSONObjectOptJSONObject4.optInt("render_thread", 0));
        }
        tuvBX.eqN(jSONObject.optInt("render_control", lz != null ? lz.Kg : 1));
        if (jSONObjectOptJSONObject3 != null) {
            com.bytedance.sdk.openadsdk.core.model.Lq lq = new com.bytedance.sdk.openadsdk.core.model.Lq();
            lq.bg(jSONObjectOptJSONObject3.optString("url"));
            lq.IL(jSONObjectOptJSONObject3.optInt("height"));
            lq.bg(jSONObjectOptJSONObject3.optInt("width"));
            tuvBX.bg(lq);
        }
        org.json.JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("reward_data");
        if (jSONObjectOptJSONObject5 != null) {
            tuvBX.bX(jSONObjectOptJSONObject5.optInt("reward_amount", 0));
            tuvBX.iR(jSONObjectOptJSONObject5.optString("reward_name", ""));
        }
        org.json.JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("cover_image");
        if (jSONObjectOptJSONObject6 != null) {
            com.bytedance.sdk.openadsdk.core.model.Lq lq2 = new com.bytedance.sdk.openadsdk.core.model.Lq();
            lq2.bg(jSONObjectOptJSONObject6.optString("url"));
            lq2.IL(jSONObjectOptJSONObject6.optInt("height"));
            lq2.bg(jSONObjectOptJSONObject6.optInt("width"));
            tuvBX.IL(lq2);
        }
        org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("image");
        if (jSONArrayOptJSONArray != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                com.bytedance.sdk.openadsdk.core.model.Lq lq3 = new com.bytedance.sdk.openadsdk.core.model.Lq();
                org.json.JSONObject jSONObjectOptJSONObject7 = jSONArrayOptJSONArray.optJSONObject(i2);
                lq3.bg(jSONObjectOptJSONObject7.optString("url"));
                lq3.IL(jSONObjectOptJSONObject7.optInt("height"));
                lq3.bg(jSONObjectOptJSONObject7.optInt("width"));
                lq3.bg(jSONObjectOptJSONObject7.optBoolean("image_preview"));
                lq3.IL(jSONObjectOptJSONObject7.optString("image_key"));
                tuvBX.bX(lq3);
            }
        }
        org.json.JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("show_url");
        if (jSONArrayOptJSONArray2 != null) {
            for (int i3 = 0; i3 < jSONArrayOptJSONArray2.length(); i3++) {
                tuvBX.GZ().add(jSONArrayOptJSONArray2.optString(i3));
            }
        }
        org.json.JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("click_url");
        if (jSONArrayOptJSONArray3 != null) {
            for (int i4 = 0; i4 < jSONArrayOptJSONArray3.length(); i4++) {
                tuvBX.bCU().add(jSONArrayOptJSONArray3.optString(i4));
            }
        }
        org.json.JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("play_start");
        if (jSONArrayOptJSONArray4 != null) {
            for (int i5 = 0; i5 < jSONArrayOptJSONArray4.length(); i5++) {
                tuvBX.Ld().add(jSONArrayOptJSONArray4.optString(i5));
            }
        }
        org.json.JSONObject jSONObjectOptJSONObject8 = jSONObject.optJSONObject("click_area");
        if (jSONObjectOptJSONObject8 != null) {
            com.bytedance.sdk.openadsdk.core.model.WR wr = new com.bytedance.sdk.openadsdk.core.model.WR();
            wr.bg = jSONObjectOptJSONObject8.optBoolean("click_upper_content_area", true);
            wr.IL = jSONObjectOptJSONObject8.optBoolean("click_upper_non_content_area", true);
            wr.bX = jSONObjectOptJSONObject8.optBoolean("click_lower_content_area", true);
            wr.eqN = jSONObjectOptJSONObject8.optBoolean("click_lower_non_content_area", true);
            wr.zx = jSONObjectOptJSONObject8.optBoolean("click_button_area", true);
            wr.ldr = jSONObjectOptJSONObject8.optBoolean("click_video_area", true);
            tuvBX.bg(wr);
        }
        org.json.JSONObject jSONObjectOptJSONObject9 = jSONObject.optJSONObject("adslot");
        if (jSONObjectOptJSONObject9 != null) {
            tuvBX.bg(IL(jSONObjectOptJSONObject9));
        } else {
            tuvBX.bg(adSlot);
        }
        if (adSlot != null) {
            java.util.Map<java.lang.String, java.lang.Object> requestExtraMap = adSlot.getRequestExtraMap();
            if (requestExtraMap != null && requestExtraMap.containsKey(com.google.ads.mediation.pangle.PangleRequestHelper.ADMOB_WATERMARK_KEY)) {
                tuvBX.Uw(java.lang.String.valueOf(requestExtraMap.get(com.google.ads.mediation.pangle.PangleRequestHelper.ADMOB_WATERMARK_KEY)));
            }
        } else {
            tuvBX.Uw(jSONObject.optString("identificationOverlayContent"));
        }
        tuvBX.PX(jSONObject.optInt("intercept_flag", 0));
        tuvBX.yDt(jSONObject.optString("phone_num"));
        tuvBX.Lq(jSONObject.optString(com.ironsource.y8.h.D0));
        tuvBX.vb(jSONObject.optString("description"));
        tuvBX.xxp(jSONObject.optString("button_text"));
        tuvBX.eo(jSONObject.optInt("ad_logo", 1));
        tuvBX.Fy(jSONObject.optString("ext"));
        tuvBX.vb(jSONObject.optInt("cover_click_area", 0));
        tuvBX.tC(jSONObject.optInt("image_mode"));
        tuvBX.kMt(jSONObject.optInt("orientation", 1));
        tuvBX.bg((float) jSONObject.optDouble("aspect_ratio", 100.0d));
        tuvBX.vb(jSONObject.optInt("cover_click_area", 0));
        org.json.JSONObject jSONObjectOptJSONObject10 = jSONObject.optJSONObject("app");
        org.json.JSONObject jSONObjectOptJSONObject11 = jSONObject.optJSONObject("deep_link");
        tuvBX.bg(com.bytedance.sdk.openadsdk.core.model.tC.bg(jSONObject.optJSONObject("oem")));
        tuvBX.bg(ldr(jSONObjectOptJSONObject10));
        org.json.JSONObject jSONObjectOptJSONObject12 = jSONObject.optJSONObject("interaction_method_params");
        tuvBX.bg(Kg(jSONObject.optJSONObject("arbitrage_interceptor_params")));
        tuvBX.bg(iR(jSONObjectOptJSONObject12));
        tuvBX.bg(eo(jSONObjectOptJSONObject11));
        tuvBX.bg(new com.bytedance.sdk.openadsdk.core.model.rri(jSONObject));
        org.json.JSONArray jSONArrayOptJSONArray5 = jSONObject.optJSONArray("filter_words");
        if (jSONArrayOptJSONArray5 != null) {
            for (int i6 = 0; i6 < jSONArrayOptJSONArray5.length(); i6++) {
                com.bytedance.sdk.openadsdk.FilterWord filterWordZx = zx(jSONArrayOptJSONArray5.optJSONObject(i6));
                if (filterWordZx != null && filterWordZx.isValid()) {
                    tuvBX.bg(filterWordZx);
                }
            }
        }
        tuvBX.rri(jSONObject.optInt("count_down"));
        tuvBX.IL(jSONObject.optLong("expiration_time"));
        tuvBX.ZQc(jSONObject.optInt("video_encode_type", 0));
        tuvBX.ayS(0);
        org.json.JSONObject jSONObjectOptJSONObject13 = jSONObject.optJSONObject("video");
        if (jSONObjectOptJSONObject13 != null) {
            ilBg = bg(jSONObjectOptJSONObject13, tuvBX, true);
            tuvBX.IL(ilBg);
            tuvBX.Dxa(jSONObjectOptJSONObject13.optInt("multi_played_percent", 50));
        } else {
            ilBg = null;
        }
        org.json.JSONObject jSONObjectOptJSONObject14 = jSONObject.optJSONObject("h265_video");
        if (jSONObjectOptJSONObject14 != null) {
            ilBg2 = bg(jSONObjectOptJSONObject14, tuvBX, false);
            tuvBX.bX(ilBg2);
        } else {
            ilBg2 = null;
        }
        if (android.os.Build.VERSION.SDK_INT < 26 || tuvBX.qSG() == 0) {
            tuvBX.bg(ilBg);
            tuvBX.ZQc(0);
        } else {
            if (ilBg2 != null && ilBg != null) {
                if (android.text.TextUtils.isEmpty(ilBg2.PX())) {
                    ilBg2.eqN(ilBg.PX());
                }
                if (android.text.TextUtils.isEmpty(ilBg2.Ta())) {
                    ilBg2.zx(ilBg.Ta());
                }
                if (ilBg2.eqN() == -1) {
                    ilBg2.eqN(ilBg.eqN());
                }
            }
            if (ilBg2 != null) {
                tuvBX.bg(ilBg2);
            } else {
                tuvBX.bg(ilBg);
            }
        }
        org.json.JSONObject jSONObjectOptJSONObject15 = jSONObject.optJSONObject("download_conf");
        if (jSONObjectOptJSONObject15 != null) {
            tuvBX.bg(WR(jSONObjectOptJSONObject15));
        }
        tuvBX.bg(VB(jSONObject.optJSONObject("media_ext")));
        org.json.JSONObject jSONObjectOptJSONObject16 = jSONObject.optJSONObject("tpl_info");
        if (jSONObjectOptJSONObject16 != null) {
            com.bytedance.sdk.openadsdk.core.model.tuV.bg bgVar2 = new com.bytedance.sdk.openadsdk.core.model.tuV.bg();
            bgVar2.bX(jSONObjectOptJSONObject16.optString("id"));
            bgVar2.eqN(jSONObjectOptJSONObject16.optString("md5"));
            bgVar2.zx(jSONObjectOptJSONObject16.optString("url"));
            bgVar2.ldr(jSONObjectOptJSONObject16.optString("data"));
            bgVar2.iR(jSONObjectOptJSONObject16.optString("diff_data"));
            java.lang.String strOptString = jSONObjectOptJSONObject16.optString("dynamic_creative");
            bgVar2.Kg(strOptString);
            bgVar2.IL(jSONObjectOptJSONObject16.optString("version"));
            bgVar2.WR(jSONObjectOptJSONObject16.optString("media_view"));
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(strOptString);
                org.json.JSONArray jSONArrayOptJSONArray6 = jSONObject2.optJSONArray("tag_ids");
                if (jSONArrayOptJSONArray6 != null) {
                    for (int i7 = 0; i7 < jSONArrayOptJSONArray6.length(); i7++) {
                        arrayList.add(java.lang.Integer.valueOf(jSONArrayOptJSONArray6.optInt(i7)));
                    }
                }
                java.lang.String strOptString2 = jSONObject2.optString("music_url");
                bgVar2.bg(arrayList);
                bgVar2.bg(strOptString2);
            } catch (org.json.JSONException e) {
                com.bytedance.sdk.component.utils.PX.bg("TTAD.AdInfoFactory", e.getMessage());
            }
            bgVar2.eo(jSONObjectOptJSONObject16.optString("engine_version"));
            bgVar2.VB(jSONObjectOptJSONObject16.optString("ugen_url"));
            bgVar2.PX(jSONObjectOptJSONObject16.optString("ugen_md5"));
            bgVar2.Ta(jSONObjectOptJSONObject16.optString("ugen_data"));
            tuvBX.bg(bgVar2);
        }
        org.json.JSONObject jSONObjectOptJSONObject17 = jSONObject.optJSONObject("tpl_info_v3");
        if (jSONObjectOptJSONObject17 != null) {
            tuvBX.bg(com.bytedance.sdk.openadsdk.core.model.Ja.bg(jSONObjectOptJSONObject17));
        }
        org.json.JSONObject jSONObjectOptJSONObject18 = jSONObject.optJSONObject("dynamic_creative");
        if (jSONObjectOptJSONObject18 != null) {
            tuvBX.IL(jSONObjectOptJSONObject18);
        }
        tuvBX.eo(jSONObject.optString("creative_extra"));
        tuvBX.zx(jSONObject.optInt("if_block_lp", 0));
        tuvBX.yDt(jSONObject.optInt("cache_sort", 1));
        tuvBX.Lq(jSONObject.optInt("if_sp_cache", 0));
        org.json.JSONObject jSONObjectOptJSONObject19 = jSONObject.optJSONObject("splash_control");
        if (jSONObjectOptJSONObject19 != null) {
            tuvBX.bg(eqN(jSONObjectOptJSONObject19));
        }
        tuvBX.Ja(jSONObject.optInt("is_package_open", 1));
        tuvBX.Kg(jSONObject.optString("ad_info", null));
        tuvBX.xxp(jSONObject.optInt("ua_policy", 2));
        tuvBX.Uw(jSONObject.optInt("playable_duration_time", 20));
        tuvBX.DDQ(jSONObject.optInt("playable_endcard_close_time", -1));
        tuvBX.Uq(jSONObject.optInt("endcard_close_time", -1));
        tuvBX.bg(jSONObject.optInt("interaction_method"));
        tuvBX.rri(jSONObject.optString("dsp_html"));
        tuvBX.bN(jSONObject.optInt("image_stay", 0));
        int iOptInt = jSONObject.optInt("dsp_material_type", 0);
        if (iOptInt < 0 || iOptInt > 3) {
            iOptInt = 0;
        }
        if (iOptInt == 0) {
            if (jSONObject.optBoolean("is_vast", false)) {
                iOptInt = 1;
            }
            i = jSONObject.optBoolean("is_html", false) ? 2 : iOptInt;
        }
        tuvBX.CQc(i);
        if (i == 1 || i == 3) {
            int iJMw = tuvBX.JMw();
            if (iJMw < 0) {
                if (tuvBX.VW() != null) {
                    iJMw = tuvBX.VW().getDurationSlotType();
                } else {
                    iJMw = tuvBX.Fx();
                }
            }
            java.lang.String strBX = com.bytedance.sdk.openadsdk.utils.ayS.bX(iJMw);
            if (jSONObject.has("vast_json")) {
                bgVarBg = com.bytedance.sdk.openadsdk.core.PX.bg.bg(jSONObject.optJSONObject("vast_json"));
            } else {
                java.lang.String strOptString3 = jSONObject.optString("dsp_vast");
                if (android.text.TextUtils.isEmpty(strOptString3)) {
                    bg(tuvBX, strBX);
                    return null;
                }
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                android.util.Pair<com.bytedance.sdk.openadsdk.core.PX.bg, com.bytedance.sdk.openadsdk.core.PX.bg.IL.bg> pairBg = bg(strOptString3, tuvBX.xFs(), iJMw);
                if (pairBg != null) {
                    com.bytedance.sdk.openadsdk.core.PX.bg bgVar3 = (com.bytedance.sdk.openadsdk.core.PX.bg) pairBg.first;
                    bgVar = (com.bytedance.sdk.openadsdk.core.PX.bg.IL.bg) pairBg.second;
                    bgVarBg = bgVar3;
                } else {
                    bgVarBg = null;
                    bgVar = null;
                }
                bg(tuvBX, strBX, bgVarBg, jCurrentTimeMillis, bgVar);
            }
            if (bgVarBg != null) {
                bgVarBg.ldr(strBX);
            }
            if (bgVarBg == null) {
                return null;
            }
            bg(bgVarBg, tuvBX);
        }
        tuvBX.kMt(jSONObject.optString("deep_link_appname", ""));
        tuvBX.LKE(jSONObject.optInt("landing_page_download_clicktype", 1));
        org.json.JSONObject jSONObjectOptJSONObject20 = jSONObject.optJSONObject("dsp_style");
        if (jSONObjectOptJSONObject20 != null) {
            tuvBX.bg(new com.bytedance.sdk.openadsdk.core.model.Ta(jSONObjectOptJSONObject20));
        }
        org.json.JSONObject jSONObjectOptJSONObject21 = jSONObject.optJSONObject("dsp_adchoices");
        if (jSONObjectOptJSONObject21 != null) {
            tuvBX.zx(jSONObjectOptJSONObject21.optString("adchoices_icon", ""));
            tuvBX.ldr(jSONObjectOptJSONObject21.optString("adchoices_url", ""));
        }
        java.lang.String strOptString4 = jSONObject.optString("gdid_encrypted");
        if (!android.text.TextUtils.isEmpty(strOptString4)) {
            tuvBX.Ja(strOptString4);
        }
        int iOptInt2 = jSONObject.optInt("jump_probability", 0);
        if (iOptInt2 < 0 || iOptInt2 > 100) {
            iOptInt2 = 0;
        }
        tuvBX.uu(iOptInt2);
        tuvBX.jwM();
        org.json.JSONObject jSONObjectOptJSONObject22 = jSONObject.optJSONObject("ugen");
        if (jSONObjectOptJSONObject22 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject22.optJSONObject("endcard")) != null) {
            tuvBX.bg(bX(jSONObjectOptJSONObject));
            org.json.JSONObject jSONObjectOptJSONObject23 = jSONObjectOptJSONObject.optJSONObject("overlay");
            if (jSONObjectOptJSONObject23 != null) {
                tuvBX.IL(bX(jSONObjectOptJSONObject23));
            }
        }
        tuvBX.qC(jSONObject.optInt("preload_h5_type", 0));
        tuvBX.Kg(jSONObject.optBoolean("hasReportShow", false));
        tuvBX.DDQ(jSONObject.optString("endcard_creative", ""));
        return tuvBX;
    }

    private static com.bytedance.sdk.openadsdk.core.VB.ldr.bg bX(org.json.JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.VB.ldr.bg bgVar = new com.bytedance.sdk.openadsdk.core.VB.ldr.bg();
        bgVar.bg(jSONObject.optString("id"));
        bgVar.IL(jSONObject.optString("md5"));
        bgVar.bX(jSONObject.optString("url"));
        return bgVar;
    }

    private static void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("reason_code", -1);
            jSONObject.put("error_code", -1);
            com.bytedance.sdk.openadsdk.eqN.bX.IL(tuv, str, "load_vast_fail", jSONObject);
        } catch (java.lang.Exception unused) {
        }
    }

    private static void bg(final com.bytedance.sdk.openadsdk.core.model.tuV tuv, final java.lang.String str, final com.bytedance.sdk.openadsdk.core.PX.bg bgVar, final long j, final com.bytedance.sdk.openadsdk.core.PX.bg.IL.bg bgVar2) {
        com.bytedance.sdk.openadsdk.eqN.bX.bg(new com.bytedance.sdk.component.Kg.Kg("vast_parser") { // from class: com.bytedance.sdk.openadsdk.core.IL.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    com.bytedance.sdk.openadsdk.core.PX.bg bgVar3 = bgVar;
                    java.lang.String str2 = "load_vast_fail";
                    if (bgVar3 != null) {
                        if (android.text.TextUtils.isEmpty(bgVar3.WR()) || android.text.TextUtils.isEmpty(bgVar.ldr()) || bgVar.Kg() <= 0.0d) {
                            jSONObject.put("reason_code", -3);
                            jSONObject.put("error_code", -3);
                        } else {
                            jSONObject.put("duration", java.lang.System.currentTimeMillis() - j);
                            com.bytedance.sdk.openadsdk.core.PX.bg.IL.bg bgVar4 = bgVar2;
                            if (bgVar4 != null) {
                                jSONObject.put("wrapper_count", bgVar4.IL);
                                jSONObject.put("impression_links_null", bgVar2.bX);
                            }
                            str2 = "load_vast_success";
                        }
                    } else {
                        jSONObject.put("reason_code", -2);
                        com.bytedance.sdk.openadsdk.core.PX.bg.IL.bg bgVar5 = bgVar2;
                        if (bgVar5 != null) {
                            jSONObject.put("error_code", bgVar5.bg);
                        }
                    }
                    com.bytedance.sdk.openadsdk.eqN.bX.IL(tuv, str, str2, jSONObject);
                    com.bytedance.sdk.openadsdk.core.PX.bg bgVar6 = bgVar;
                    if (bgVar6 == null || bgVar6.IL() == null || !android.text.TextUtils.isEmpty(bgVar.IL().ldr())) {
                        return;
                    }
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    try {
                        jSONObject2.put("error_code", 1000);
                        jSONObject2.put("description", "1000:Image url is null");
                    } catch (java.lang.Throwable unused) {
                    }
                    com.bytedance.sdk.openadsdk.eqN.bX.IL(tuv, str, "load_vast_icon_fail", jSONObject2);
                    bgVar.bg((com.bytedance.sdk.openadsdk.core.PX.IL) null);
                } catch (java.lang.Exception unused2) {
                }
            }
        });
    }

    private static android.util.Pair<com.bytedance.sdk.openadsdk.core.PX.bg, com.bytedance.sdk.openadsdk.core.PX.bg.IL.bg> bg(java.lang.String str, int i, int i2) {
        int iBX;
        int iEqN;
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        if (i2 == 1 || i2 == 5) {
            iBX = 0;
            iEqN = 0;
        } else {
            iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(com.bytedance.sdk.openadsdk.core.VzQ.bg());
            iEqN = com.bytedance.sdk.openadsdk.utils.ZQc.eqN(com.bytedance.sdk.openadsdk.core.VzQ.bg());
            if (i == 2) {
                iEqN = iBX;
                iBX = iEqN;
            }
        }
        com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx zxVar = new com.bytedance.sdk.openadsdk.core.PX.bg.bg.zx(com.bytedance.sdk.openadsdk.core.VzQ.bg(), iBX, iEqN);
        return new android.util.Pair<>(zxVar.bg(str, new java.util.ArrayList()), zxVar.ldr);
    }

    private static void bg(com.bytedance.sdk.openadsdk.core.PX.bg bgVar, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        bgVar.bg(tuv);
        if (!bg(tuv.jz())) {
            tuv.tuV(2);
        }
        tuv.eqN(1);
        tuv.bg(bgVar);
        if (!android.text.TextUtils.isEmpty(bgVar.eqN())) {
            tuv.Lq(bgVar.eqN());
        }
        if (!android.text.TextUtils.isEmpty(bgVar.zx())) {
            tuv.vb(bgVar.zx());
        }
        tuv.Ta(bgVar.ldr());
        tuv.bg((com.bytedance.sdk.openadsdk.core.model.bX) null);
        com.bykv.vk.openvk.bg.bg.bg.bX.IL ilDxa = tuv.Dxa();
        if (ilDxa == null) {
            ilDxa = new com.bykv.vk.openvk.bg.bg.bg.bX.IL();
        }
        ilDxa.bX(bgVar.iR());
        ilDxa.bg(bgVar.Kg());
        ilDxa.ldr((java.lang.String) null);
        ilDxa.IL((java.lang.String) null);
        ilDxa.eqN((java.lang.String) null);
        tuv.bg(ilDxa);
        if (bgVar.IL() != null && !android.text.TextUtils.isEmpty(bgVar.IL().zx())) {
            com.bytedance.sdk.openadsdk.core.model.Lq lq = new com.bytedance.sdk.openadsdk.core.model.Lq();
            lq.bg(bgVar.IL().zx());
            lq.bg(bgVar.IL().IL());
            lq.IL(bgVar.IL().bX());
            tuv.bg(lq);
            return;
        }
        if (tuv.sVc() == null) {
            com.bytedance.sdk.openadsdk.core.model.Lq lq2 = new com.bytedance.sdk.openadsdk.core.model.Lq();
            lq2.bg("https://sf16-fe-tos-sg.i18n-pglstatp.com/obj/ad-pattern-sg/static/images/2023620white.jpeg");
            lq2.bg(98);
            lq2.IL(98);
            tuv.bg(lq2);
        }
    }

    private static com.bytedance.sdk.openadsdk.core.model.eqN eqN(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("splash_clickarea", 2);
        int iOptInt2 = jSONObject.optInt("splash_layout_id", 1);
        long jOptLong = jSONObject.optLong("load_wait_time", 0L);
        long j = jOptLong >= 0 ? jOptLong : 0L;
        com.bytedance.sdk.openadsdk.core.model.eqN eqn = new com.bytedance.sdk.openadsdk.core.model.eqN();
        eqn.bg(iOptInt);
        eqn.IL(iOptInt2);
        eqn.bg(j);
        return eqn;
    }

    public static com.bytedance.sdk.openadsdk.AdSlot IL(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        java.lang.String strOptString = jSONObject.optString("mCodeId", "");
        int iOptInt = jSONObject.optInt("mImgAcceptedWidth", 0);
        int iOptInt2 = jSONObject.optInt("mImgAcceptedHeight", 0);
        float fOptDouble = (float) jSONObject.optDouble("mExpressViewAcceptedWidth", 0.0d);
        float fOptDouble2 = (float) jSONObject.optDouble("mExpressViewAcceptedHeight", 0.0d);
        int iOptInt3 = jSONObject.optInt("mAdCount", 6);
        boolean zOptBoolean = jSONObject.optBoolean("mSupportDeepLink", true);
        java.lang.String strOptString2 = jSONObject.optString("mRewardName", "");
        int iOptInt4 = jSONObject.optInt("mRewardAmount", 0);
        java.lang.String strOptString3 = jSONObject.optString("mMediaExtra", "");
        java.lang.String strOptString4 = jSONObject.optString("mUserID", "");
        jSONObject.optInt("mOrientation", 2);
        int iOptInt5 = jSONObject.optInt("mNativeAdType", 0);
        boolean zOptBoolean2 = jSONObject.optBoolean("mIsAutoPlay", false);
        boolean zOptBoolean3 = jSONObject.optBoolean("mIsExpressAd", false);
        java.lang.String strOptString5 = jSONObject.optString("mBidAdm", "");
        return new com.bytedance.sdk.openadsdk.AdSlot.Builder().setCodeId(strOptString).setImageAcceptedSize(iOptInt, iOptInt2).setExpressViewAcceptedSize(fOptDouble, fOptDouble2).setAdCount(iOptInt3).setSupportDeepLink(zOptBoolean).setRewardName(strOptString2).setRewardAmount(iOptInt4).setMediaExtra(strOptString3).setUserID(strOptString4).setNativeAdType(iOptInt5).setIsAutoPlay(zOptBoolean2).isExpressAd(zOptBoolean3).withBid(strOptString5).setDurationSlotType(jSONObject.optInt("mDurationSlotType", 0)).build();
    }

    private static com.bytedance.sdk.openadsdk.FilterWord zx(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            com.bytedance.sdk.openadsdk.FilterWord filterWord = new com.bytedance.sdk.openadsdk.FilterWord();
            filterWord.setId(jSONObject.optString("id"));
            filterWord.setName(jSONObject.optString("name"));
            filterWord.setIsSelected(jSONObject.optBoolean("is_selected"));
            org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("options");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    com.bytedance.sdk.openadsdk.FilterWord filterWordZx = zx(jSONArrayOptJSONArray.optJSONObject(i));
                    if (filterWordZx != null && filterWordZx.isValid()) {
                        filterWord.addOption(filterWordZx);
                    }
                }
            }
            return filterWord;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private static com.bytedance.sdk.openadsdk.core.model.bX ldr(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.bX bXVar = new com.bytedance.sdk.openadsdk.core.model.bX();
        bXVar.IL(jSONObject.optString("app_name"));
        bXVar.bX(jSONObject.optString(com.ironsource.y8.h.V));
        bXVar.bg(jSONObject.optString("download_url"));
        bXVar.bg(jSONObject.optDouble(com.google.firebase.analytics.FirebaseAnalytics.Param.SCORE, -1.0d));
        bXVar.bg(jSONObject.optInt("comment_num", -1));
        bXVar.IL(jSONObject.optInt("app_size", 0));
        bXVar.eqN(jSONObject.optString("app_category"));
        return bXVar;
    }

    private static com.bytedance.sdk.openadsdk.core.model.VzQ iR(org.json.JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.VzQ vzQ = new com.bytedance.sdk.openadsdk.core.model.VzQ();
        if (jSONObject == null) {
            vzQ.bg(10L);
            vzQ.IL(20L);
            vzQ.bX(10L);
            vzQ.eqN(20L);
            vzQ.bg("");
            return vzQ;
        }
        vzQ.bg(jSONObject.optLong("onlylp_loading_maxtime", 10L));
        vzQ.IL(jSONObject.optLong("straight_lp_showtime", 20L));
        vzQ.bX(jSONObject.optLong("onlyagg_loading_maxtime", 10L));
        vzQ.eqN(jSONObject.optLong("straight_agg_showtime", 20L));
        vzQ.bg(jSONObject.optString("loading_text", ""));
        return vzQ;
    }

    private static com.bytedance.sdk.openadsdk.core.model.zx Kg(org.json.JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.zx zxVar = new com.bytedance.sdk.openadsdk.core.model.zx();
        if (jSONObject == null) {
            zxVar.bX(0);
            zxVar.eqN(0);
            zxVar.IL(new java.util.ArrayList());
            zxVar.zx(0);
            zxVar.bg(new java.util.ArrayList());
            zxVar.IL(0);
            zxVar.bg(0);
            return zxVar;
        }
        zxVar.bX(jSONObject.optInt("interceptor_x", 0));
        zxVar.eqN(jSONObject.optInt("interceptor_y", 0));
        org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("interceptor_page");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayList.add(java.lang.Integer.valueOf(jSONArrayOptJSONArray.optInt(i)));
            }
        }
        zxVar.IL(arrayList);
        zxVar.zx(jSONObject.optInt("interceptor_interval_time", 0));
        org.json.JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("url_regular");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                arrayList2.add(jSONArrayOptJSONArray2.optString(i2));
            }
        }
        zxVar.bg(arrayList2);
        zxVar.IL(jSONObject.optInt("boc_index", 0));
        zxVar.bg(jSONObject.optInt("is_act", 0));
        return zxVar;
    }

    private static com.bytedance.sdk.openadsdk.core.model.PX WR(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.PX px = new com.bytedance.sdk.openadsdk.core.model.PX();
        px.bg(jSONObject.optInt("if_send_click", 0));
        return px;
    }

    private static com.bytedance.sdk.openadsdk.core.model.VB eo(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.VB vb = new com.bytedance.sdk.openadsdk.core.model.VB();
        vb.bg(jSONObject.optString("deeplink_url"));
        vb.IL(jSONObject.optString("fallback_url"));
        vb.bg(jSONObject.optInt("fallback_type"));
        return vb;
    }

    private static com.bykv.vk.openvk.bg.bg.bg.bX.IL bg(org.json.JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.tuV tuv, boolean z) {
        int iOptInt;
        if (jSONObject == null) {
            return null;
        }
        com.bykv.vk.openvk.bg.bg.bg.bX.IL il = new com.bykv.vk.openvk.bg.bg.bg.bX.IL();
        il.IL(jSONObject.optInt("cover_height"));
        il.bX(jSONObject.optInt("cover_width"));
        il.bg(jSONObject.optString("resolution"));
        il.bg(jSONObject.optLong("size"));
        double dOptDouble = jSONObject.optDouble("video_duration", 0.0d);
        il.bg(dOptDouble);
        int i = 1;
        int iOptInt2 = jSONObject.optInt("replay_time", 1);
        if (dOptDouble <= 15.0d && tuv.tC() != 1 && com.bytedance.sdk.openadsdk.core.model.tuV.zx(tuv)) {
            i = iOptInt2;
        }
        il.eo(i);
        il.IL(jSONObject.optString("cover_url"));
        il.bX(jSONObject.optString("video_url"));
        il.eqN(jSONObject.optString("endcard"));
        il.zx(jSONObject.optString("playable_download_url"));
        il.ldr(jSONObject.optString("file_hash"));
        il.Kg(jSONObject.optInt("if_playable_loading_show", 0));
        il.WR(jSONObject.optInt("remove_loading_page_type", 0));
        il.bg(jSONObject.optInt("fallback_endcard_judge", 0));
        il.zx(jSONObject.optInt("video_preload_size", 307200));
        il.ldr(jSONObject.optInt("reward_video_cached_type", 0));
        il.iR(jSONObject.optInt("execute_cached_type", 0));
        if (z) {
            iOptInt = jSONObject.optInt("endcard_render", 0);
        } else {
            iOptInt = jSONObject.optInt("endcard_render", -1);
        }
        il.eqN(iOptInt);
        return il;
    }

    private static java.util.Map<java.lang.String, java.lang.Object> VB(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        java.util.HashMap map = new java.util.HashMap();
        java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            if (!android.text.TextUtils.isEmpty(next)) {
                map.put(next, jSONObject.opt(next));
            }
        }
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0089  */
    /* JADX WARN: Code duplicated, block: B:46:0x0097  */
    /* JADX WARN: Code duplicated, block: B:48:0x009b  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a5  */
    private static int bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        int iBg;
        int iBg2;
        if (tuv == null) {
            com.bytedance.sdk.openadsdk.eqN.bX.bX((com.bytedance.sdk.openadsdk.core.model.tuV) null, "", 401);
            return 401;
        }
        java.lang.String strBX = com.bytedance.sdk.openadsdk.utils.ayS.bX(tuv.JMw());
        if (android.text.TextUtils.isEmpty(tuv.Ys()) || tuv.Ys().length() <= 1) {
            com.bytedance.sdk.openadsdk.eqN.bX.bX(tuv, strBX, 402);
            return 402;
        }
        if (tuv.eK()) {
            if (tuv.JMw() < 0) {
                if (tuv.VW() != null) {
                    tuv.VW().getDurationSlotType();
                } else {
                    tuv.Fx();
                }
            }
            if (tuv.Fb()) {
                strBX = "fullscreen_interstitial_ad";
            }
            if (android.text.TextUtils.isEmpty(tuv.rgo())) {
                com.bytedance.sdk.openadsdk.eqN.bX.IL(tuv, strBX, "load_html_fail", (org.json.JSONObject) null);
                return 401;
            }
            com.bytedance.sdk.openadsdk.eqN.bX.IL(tuv, strBX, "load_html_success", (org.json.JSONObject) null);
        }
        if (tuv.OLh() == 0) {
            int iBOf = tuv.bOf();
            if (iBOf == 2 || iBOf == 3 || iBOf == 4) {
                iBg = bg(tuv.lM());
                if (iBg != 200) {
                    com.bytedance.sdk.openadsdk.eqN.bX.bX(tuv, strBX, iBg);
                    return iBg;
                }
            } else if (iBOf == 5 || iBOf == 15) {
                iBg2 = bg(tuv.Dxa(), tuv.HXG());
                if (iBg2 != 200) {
                    com.bytedance.sdk.openadsdk.eqN.bX.bX(tuv, strBX, iBg2);
                    return iBg2;
                }
            } else if (iBOf == 16) {
                iBg = bg(tuv.lM());
                if (iBg != 200) {
                    com.bytedance.sdk.openadsdk.eqN.bX.bX(tuv, strBX, iBg);
                    return iBg;
                }
            } else if (iBOf == 50) {
                iBg2 = bg(tuv.Dxa(), tuv.HXG());
                if (iBg2 != 200) {
                    com.bytedance.sdk.openadsdk.eqN.bX.bX(tuv, strBX, iBg2);
                    return iBg2;
                }
            }
        }
        if (com.bytedance.sdk.openadsdk.core.settings.xxp.zU().HXG()) {
            return bX(tuv);
        }
        return IL(tuv);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0079  */
    private static int IL(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        int iBg;
        java.lang.String strBX = com.bytedance.sdk.openadsdk.utils.ayS.bX(tuv.JMw());
        if (tuv.OLh() == 0) {
            iBg = bg(tuv.Dt());
            com.bytedance.sdk.openadsdk.eqN.bX.bX(tuv, strBX, iBg);
        } else {
            iBg = 200;
        }
        int iJz = tuv.jz();
        if (iJz == 2 || iJz == 3) {
            if (eqN(tuv) && android.text.TextUtils.isEmpty(tuv.GvG())) {
                com.bytedance.sdk.openadsdk.eqN.bX.bX(tuv, strBX, 406);
                iBg = 406;
            }
        } else if (iJz == 4) {
            com.bytedance.sdk.openadsdk.core.model.bX bXVarRiO = tuv.RiO();
            if (bXVarRiO == null) {
                com.bytedance.sdk.openadsdk.eqN.bX.bX(tuv, strBX, 407);
                iBg = 407;
            } else if (android.text.TextUtils.isEmpty(bXVarRiO.bX()) && android.text.TextUtils.isEmpty(bXVarRiO.bg())) {
                com.bytedance.sdk.openadsdk.eqN.bX.bX(tuv, strBX, com.bytedance.sdk.openadsdk.TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME);
                iBg = 417;
            } else if (android.text.TextUtils.isEmpty(bXVarRiO.bX())) {
                iBg = 416;
                com.bytedance.sdk.openadsdk.eqN.bX.bX(tuv, strBX, 416);
            } else if (android.text.TextUtils.isEmpty(bXVarRiO.bg())) {
                iBg = 408;
                com.bytedance.sdk.openadsdk.eqN.bX.bX(tuv, strBX, 408);
            }
        } else if (iJz == 8) {
            if (eqN(tuv)) {
                com.bytedance.sdk.openadsdk.eqN.bX.bX(tuv, strBX, 406);
                iBg = 406;
            }
        }
        if (iBg == 417 || iBg == 407 || iBg == 406) {
            return iBg;
        }
        if (iBg != 200) {
            com.bytedance.sdk.openadsdk.eqN.bX.IL(tuv, strBX, iBg);
        }
        return 200;
    }

    private static int bX(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        int iBg;
        java.lang.String strBX = com.bytedance.sdk.openadsdk.utils.ayS.bX(tuv.JMw());
        if (tuv.OLh() == 0) {
            iBg = bg(tuv.Dt());
            if (iBg != 200) {
                com.bytedance.sdk.openadsdk.eqN.bX.bX(tuv, strBX, iBg);
                return iBg;
            }
        } else {
            iBg = 200;
        }
        int iJz = tuv.jz();
        if (iJz != 2 && iJz != 3) {
            if (iJz == 4) {
                int iBg2 = bg(tuv.RiO());
                if (iBg2 == 200) {
                    return iBg2;
                }
                com.bytedance.sdk.openadsdk.eqN.bX.bX(tuv, strBX, iBg2);
                return iBg2;
            }
            if (iJz != 8) {
                return iBg;
            }
        }
        if (!eqN(tuv) || !android.text.TextUtils.isEmpty(tuv.GvG())) {
            return iBg;
        }
        com.bytedance.sdk.openadsdk.eqN.bX.bX(tuv, strBX, 406);
        return 406;
    }

    private static boolean eqN(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        return (tuv.HXG() || tuv.eK()) ? false : true;
    }

    private static int bg(com.bytedance.sdk.openadsdk.core.model.VB vb) {
        if (vb == null) {
            return 200;
        }
        if (android.text.TextUtils.isEmpty(vb.bg())) {
            return 403;
        }
        if (android.text.TextUtils.isEmpty(vb.IL())) {
            return 404;
        }
        return (vb.bX() == 1 || vb.bX() == 2) ? 200 : 405;
    }

    private static int bg(com.bykv.vk.openvk.bg.bg.bg.bX.IL il, boolean z) {
        if (il == null) {
            return com.bytedance.sdk.openadsdk.TTAdConstant.VIDEO_INFO_CODE;
        }
        if (android.text.TextUtils.isEmpty(il.VB())) {
            return com.bytedance.sdk.openadsdk.TTAdConstant.VIDEO_URL_CODE;
        }
        if (z || !android.text.TextUtils.isEmpty(il.eo())) {
            return 200;
        }
        return com.bytedance.sdk.openadsdk.TTAdConstant.VIDEO_COVER_URL_CODE;
    }

    private static int bg(com.bytedance.sdk.openadsdk.core.model.bX bXVar) {
        if (bXVar == null) {
            return 407;
        }
        if (android.text.TextUtils.isEmpty(bXVar.bg())) {
            return 408;
        }
        return android.text.TextUtils.isEmpty(bXVar.bX()) ? 416 : 200;
    }

    private static int bg(java.util.List<com.bytedance.sdk.openadsdk.core.model.Lq> list) {
        if (list == null) {
            return 409;
        }
        if (list.size() <= 0) {
            return 410;
        }
        for (com.bytedance.sdk.openadsdk.core.model.Lq lq : list) {
            if (lq == null) {
                return 411;
            }
            if (android.text.TextUtils.isEmpty(lq.bg())) {
                return com.bytedance.sdk.openadsdk.TTAdConstant.IMAGE_URL_CODE;
            }
        }
        return 200;
    }

    private static void bg(final java.util.ArrayList<com.bytedance.sdk.openadsdk.core.IL.bg> arrayList) {
        com.bytedance.sdk.openadsdk.yDt.bX.bg("multiple_ads_parsing_error", false, new com.bytedance.sdk.openadsdk.yDt.IL() { // from class: com.bytedance.sdk.openadsdk.core.IL.3
            @Override // com.bytedance.sdk.openadsdk.yDt.IL
            public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("material_error", arrayList.size());
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                for (com.bytedance.sdk.openadsdk.core.IL.bg bgVar : arrayList) {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put(androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_CONTENT_ID, bgVar.bg);
                    jSONObject2.put("error_msg", bgVar.IL);
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("error_cid_list", jSONArray);
                return com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg("multiple_ads_parsing_error").IL(jSONObject.toString());
            }
        });
    }

    private static class bg {
        public int IL;
        public java.lang.String bg;

        public bg(java.lang.String str, int i) {
            this.bg = str;
            this.IL = i;
        }
    }
}
