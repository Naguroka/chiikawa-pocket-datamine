package com.bytedance.sdk.openadsdk.core;

/* JADX INFO: loaded from: classes4.dex */
public class VJ {
    private static boolean bg = false;

    public static void bg(boolean z) {
        bg = z;
    }

    private static com.bytedance.sdk.openadsdk.yDt.bg.IL bg(int i, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        com.bytedance.sdk.openadsdk.yDt.bg.IL il = new com.bytedance.sdk.openadsdk.yDt.bg.IL();
        il.bg(com.bytedance.sdk.openadsdk.eqN.IL.bg.bg);
        il.bg(tuv);
        il.IL(com.bytedance.sdk.openadsdk.utils.ayS.bg(tuv));
        il.bg(i);
        il.bg(false);
        il.IL(tuv.jz());
        return il;
    }

    public static boolean bg(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv, int i, com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.api.PangleAd pangleAd, java.lang.String str, com.bytedance.sdk.openadsdk.VzQ.bg.bg.ldr ldrVar, boolean z, int i2) {
        java.lang.String strBg;
        com.bytedance.sdk.openadsdk.eqN.bX.bg(bg(-1, tuv));
        if (context == null || tuv == null || i == -1) {
            com.bytedance.sdk.openadsdk.eqN.bX.bg(bg(1, tuv));
            return false;
        }
        com.bytedance.sdk.openadsdk.core.model.VB vbDt = tuv.Dt();
        java.util.HashMap map = new java.util.HashMap();
        if (tuv.OLh() == 0) {
            map.put("dpl_probability_jump", java.lang.Boolean.valueOf(i2 >= 11));
        }
        if (i2 != 0 && tuv.HXG()) {
            map.put("dsp_click_type", java.lang.Integer.valueOf(i2));
        }
        if (vbDt != null && !android.text.TextUtils.isEmpty(vbDt.bg())) {
            if (bg(context, tuv, i, str, z, map)) {
                com.bytedance.sdk.openadsdk.eqN.bX.bg(bg(2, tuv));
                return true;
            }
            if (vbDt.bX() != 2 || tuv.bOf() == 5 || tuv.bOf() == 15) {
                if (vbDt.bX() == 1 && !android.text.TextUtils.isEmpty(vbDt.IL())) {
                    strBg = vbDt.IL();
                } else {
                    strBg = bg(tuv);
                }
            } else if (ldrVar != null) {
                if (!ldrVar.bg()) {
                    if (ldrVar.zx()) {
                        com.bytedance.sdk.openadsdk.eqN.bX.bg(tuv, str, "open_fallback_url", map);
                        com.bytedance.sdk.openadsdk.eqN.bX.bg(bg(3, tuv));
                        return true;
                    }
                    strBg = bg(vbDt, tuv);
                    com.bytedance.sdk.openadsdk.eqN.bX.bg(bg(3, tuv));
                } else {
                    com.bytedance.sdk.openadsdk.eqN.bX.bg(tuv, str, "open_fallback_url", map);
                    com.bytedance.sdk.openadsdk.eqN.bX.bg(bg(3, tuv));
                    return true;
                }
            } else {
                strBg = bg(vbDt, tuv);
            }
            com.bytedance.sdk.openadsdk.eqN.bX.bg(tuv, str, "open_fallback_url", map);
        } else {
            strBg = bg(tuv);
        }
        java.lang.String str2 = strBg;
        java.lang.Object[] objArr = new java.lang.Object[2];
        if (tuv.OLh() == 0 && !android.text.TextUtils.isEmpty(str2) && str2.contains("play.google.com/store")) {
            java.lang.String strSubstring = str2.substring(str2.indexOf("?id=") + 4);
            com.bytedance.sdk.openadsdk.eqN.bX.bg(bg(4, tuv));
            return com.bytedance.sdk.openadsdk.VzQ.bg.bg.eqN.bg(context, str2, strSubstring, str, tuv);
        }
        return bg(context, tuv, i, pAGNativeAd, pangleAd, str, z, str2);
    }

    private static java.lang.String bg(com.bytedance.sdk.openadsdk.core.model.VB vb, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (!android.text.TextUtils.isEmpty(vb.IL())) {
            return vb.IL();
        }
        return bg(tuv);
    }

    private static java.lang.String bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (!tuv.HXG() || tuv.hi() == null) {
            return tuv.GvG();
        }
        return tuv.hi().WR();
    }

    public static boolean bg(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv, int i, java.lang.String str, boolean z, java.util.Map<java.lang.String, java.lang.Object> map) {
        if (tuv == null) {
            return false;
        }
        com.bytedance.sdk.openadsdk.core.model.VB vbDt = tuv.Dt();
        if (vbDt == null || android.text.TextUtils.isEmpty(vbDt.bg())) {
            com.bytedance.sdk.openadsdk.core.eqN.bg(tuv, str, vbDt == null ? -1 : -2, vbDt != null ? vbDt.eqN() : null);
            return false;
        }
        if (map == null) {
            map = new java.util.HashMap<>();
        }
        java.util.Map<java.lang.String, java.lang.Object> map2 = map;
        java.lang.String strBg = vbDt.bg();
        if (com.bytedance.sdk.openadsdk.VzQ.bg.bg.bX.bg()) {
            return com.bytedance.sdk.openadsdk.VzQ.bg.bg.bX.bg(context, strBg, tuv, i, map2, z);
        }
        android.net.Uri uri = android.net.Uri.parse(strBg);
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        intent.setData(uri);
        if (com.bytedance.sdk.openadsdk.utils.ayS.Kg(context)) {
            com.bytedance.sdk.openadsdk.utils.ayS.IL IL = com.bytedance.sdk.openadsdk.utils.ayS.IL(context, intent);
            if (IL.IL > 0) {
                if (com.bytedance.sdk.openadsdk.core.VzQ.eqN().Kg()) {
                    com.bytedance.sdk.openadsdk.utils.ayS.bg(tuv, str);
                }
                if (!(context instanceof android.app.Activity)) {
                    intent.addFlags(268435456);
                }
                map2.put("can_query_install", 1);
                map2.put("matched_count", java.lang.Integer.valueOf(IL.IL));
                map2.put("url", strBg);
                if (IL.bg != null) {
                    intent.setComponent(IL.bg);
                }
                com.bytedance.sdk.openadsdk.eqN.bX.bg(tuv, str, "open_url_app", map2);
                try {
                    context.startActivity(intent);
                    com.bytedance.sdk.openadsdk.eqN.PX.bg().bg(map2).bg(tuv, str);
                    com.bytedance.sdk.openadsdk.eqN.bX.bg("dp_start_act_success", tuv, str, map2);
                    return true;
                } catch (java.lang.Exception e) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        jSONObject.put("exception", e.getMessage());
                        jSONObject.put("intent", intent.toString());
                        jSONObject.put("can_query_install", 1);
                    } catch (java.lang.Exception unused) {
                    }
                    com.bytedance.sdk.openadsdk.core.eqN.bg(tuv, str, -4, jSONObject);
                    if (!com.bytedance.sdk.openadsdk.core.VzQ.eqN().Kg()) {
                        bg(context, tuv.GvG(), tuv, i, str, z);
                        com.bytedance.sdk.component.utils.PX.bg("WebHelper", "openDetailPage() -> context.startActivity(intent) fail :", e);
                    }
                    return false;
                }
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("intent", intent.toString());
                jSONObject2.put("can_query_install", 1);
            } catch (java.lang.Exception unused2) {
            }
            com.bytedance.sdk.openadsdk.core.eqN.bg(tuv, str, -3, jSONObject2);
        } else {
            try {
                if (com.bytedance.sdk.openadsdk.core.VzQ.eqN().Kg()) {
                    com.bytedance.sdk.openadsdk.utils.ayS.bg(tuv, str);
                }
                if (!(context instanceof android.app.Activity)) {
                    intent.addFlags(268435456);
                }
                map2.put("can_query_install", 0);
                com.bytedance.sdk.openadsdk.eqN.bX.bg(tuv, str, "open_url_app", map2);
                context.startActivity(intent);
                com.bytedance.sdk.openadsdk.eqN.PX.bg().bg(map2).bg(tuv, str);
                return true;
            } catch (java.lang.Throwable unused3) {
            }
        }
        return false;
    }

    public static boolean bg(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv, int i, com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.api.PangleAd pangleAd, java.lang.String str, boolean z, java.lang.String str2) {
        if (!android.text.TextUtils.isEmpty(str2) || com.bytedance.sdk.openadsdk.core.model.rri.IL(tuv)) {
            int iJz = tuv.jz();
            if (iJz == 2 || iJz == 8) {
                return com.bytedance.sdk.openadsdk.utils.Fy.bg(context, str2, tuv, com.bytedance.sdk.openadsdk.eqN.IL.bg.bg);
            }
            com.bytedance.sdk.component.utils.IL.bg(context, bg(context, str2, tuv, i, pAGNativeAd, pangleAd, str, z), null);
            bg = false;
            return true;
        }
        com.bytedance.sdk.openadsdk.eqN.bX.bg(bg(5, tuv));
        return false;
    }

    public static boolean bg(android.content.Context context, java.lang.String str, com.bytedance.sdk.openadsdk.core.model.tuV tuv, int i, java.lang.String str2, boolean z) {
        try {
            context.startActivity(bg(context, str, tuv, i, (com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd) null, (com.bytedance.sdk.openadsdk.api.PangleAd) null, str2, z));
            return true;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public static boolean IL(android.content.Context context, java.lang.String str, com.bytedance.sdk.openadsdk.core.model.tuV tuv, int i, java.lang.String str2, boolean z) {
        try {
            android.content.Intent intentBg = bg(context, str, tuv, i, (com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd) null, (com.bytedance.sdk.openadsdk.api.PangleAd) null, str2, z, true);
            if (!(context instanceof android.app.Activity)) {
                intentBg.addFlags(268435456);
            }
            context.startActivity(intentBg);
            return true;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    private static android.content.Intent bg(android.content.Context context, java.lang.String str, com.bytedance.sdk.openadsdk.core.model.tuV tuv, int i, com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.api.PangleAd pangleAd, java.lang.String str2, boolean z) {
        return bg(context, str, tuv, i, pAGNativeAd, pangleAd, str2, z, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static android.content.Intent bg(android.content.Context context, java.lang.String str, com.bytedance.sdk.openadsdk.core.model.tuV tuv, int i, com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.api.PangleAd pangleAd, java.lang.String str2, boolean z, boolean z2) {
        android.content.Intent intent;
        if (!z2 && com.bytedance.sdk.openadsdk.core.model.rri.IL(tuv) && (pAGNativeAd != 0 || pangleAd != null)) {
            intent = new android.content.Intent(context, (java.lang.Class<?>) com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.class);
            intent.putExtra("ad_pending_download", bg(tuv, z));
            java.lang.String strPX = com.bytedance.sdk.openadsdk.core.model.rri.PX(tuv);
            if (!android.text.TextUtils.isEmpty(strPX)) {
                if (strPX.contains("?")) {
                    str = strPX + "&orientation=portrait";
                } else {
                    str = strPX + "?orientation=portrait";
                }
            }
        } else {
            intent = (z2 || tuv.jz() != 3 || !(tuv.vb() == 2 || (tuv.vb() == 1 && bg)) || tuv.NHy()) ? new android.content.Intent(context, (java.lang.Class<?>) com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.class) : new android.content.Intent(context, (java.lang.Class<?>) com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.class);
        }
        intent.putExtra("url", str);
        intent.putExtra("gecko_id", tuv.qp());
        intent.putExtra("web_title", tuv.wS());
        intent.putExtra("sdk_version", com.bytedance.sdk.openadsdk.BuildConfig.VERSION_CODE);
        intent.putExtra("adid", tuv.Ys());
        intent.putExtra("log_extra", tuv.Ny());
        com.bytedance.sdk.openadsdk.multipro.IL.bg bgVarBX = null;
        intent.putExtra("icon_url", tuv.sVc() == null ? null : tuv.sVc().bg());
        intent.putExtra("event_tag", str2);
        intent.putExtra("source", i);
        if (!(context instanceof android.app.Activity)) {
            intent.addFlags(268435456);
        }
        if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            intent.putExtra(com.bytedance.sdk.openadsdk.TTAdConstant.MULTI_PROCESS_MATERIALMETA, tuv.ZTq().toString());
        } else {
            com.bytedance.sdk.openadsdk.core.JAA.bg().ldr();
            com.bytedance.sdk.openadsdk.core.JAA.bg().bg(tuv);
        }
        if (tuv.bOf() == 5 || tuv.bOf() == 15 || tuv.bOf() == 50) {
            if (pAGNativeAd != 0) {
                if (pAGNativeAd instanceof com.bytedance.sdk.openadsdk.multipro.IL.bg.InterfaceC0162bg) {
                    bgVarBX = ((com.bytedance.sdk.openadsdk.multipro.IL.bg.InterfaceC0162bg) pAGNativeAd).ldr();
                } else if (pAGNativeAd instanceof com.bytedance.sdk.openadsdk.bg.IL.bg.IL) {
                    bgVarBX = ((com.bytedance.sdk.openadsdk.bg.IL.bg.IL) pAGNativeAd).IL();
                }
                if (bgVarBX != null) {
                    intent.putExtra(com.bytedance.sdk.openadsdk.TTAdConstant.MULTI_PROCESS_DATA, bgVarBX.bg().toString());
                }
            }
            if ((pangleAd instanceof com.bytedance.sdk.openadsdk.core.bX.ldr) && (bgVarBX = ((com.bytedance.sdk.openadsdk.core.bX.ldr) pangleAd).bX()) != null) {
                intent.putExtra(com.bytedance.sdk.openadsdk.TTAdConstant.MULTI_PROCESS_DATA, bgVarBX.bg().toString());
            }
            if (bgVarBX != null) {
                intent.putExtra("video_is_auto_play", bgVarBX.eqN);
                if (com.bytedance.sdk.component.utils.PX.eqN()) {
                    bgVarBX.bg().toString();
                }
            }
        }
        return intent;
    }

    private static boolean bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, boolean z) {
        if (z && tuv != null && tuv.jz() == 4) {
            return com.bytedance.sdk.openadsdk.core.model.rri.IL(tuv);
        }
        return false;
    }
}
