package com.bytedance.sdk.openadsdk.core.settings;

/* JADX INFO: loaded from: classes4.dex */
public class Ta extends com.bytedance.sdk.openadsdk.core.settings.Lq {
    static final java.util.ArrayList<java.lang.String> eqN = new java.util.ArrayList<>(java.util.Arrays.asList("ja", "en", "ko", "zh", "th", "vi", "id", "ru", "ar", "fr", "de", "it", "es", "hi", "pt", "zh-Hant", "ms", "pl", "tr"));
    public boolean bX;
    private java.util.Set<java.lang.String> zx;

    public Ta(com.bytedance.sdk.openadsdk.core.settings.Lq.bg bgVar) {
        super("tt_sdk_settings.prop", bgVar);
        this.zx = java.util.Collections.synchronizedSet(new java.util.HashSet());
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.zx
    public void bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
        int iOptInt;
        com.bytedance.sdk.openadsdk.core.settings.zx.bg bgVarBg = bg();
        org.json.JSONObject jSONObjectZx = com.bytedance.sdk.openadsdk.core.settings.xxp.zU().zx();
        org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("digest");
        this.bX = (jSONObjectOptJSONObject == null || jSONObjectZx == null || !jSONObjectOptJSONObject.toString().equals(jSONObjectZx.toString())) ? false : true;
        if (jSONObjectOptJSONObject != null) {
            bgVarBg.bg("digest", jSONObjectOptJSONObject.toString());
        } else {
            bgVarBg.bg("digest");
        }
        bgVarBg.bg("data_time", jSONObject.optLong("data_time"));
        if (jSONObject.has("req_inter_min")) {
            long jOptLong = jSONObject.optLong("req_inter_min", 10L) * 60 * 1000;
            if (jOptLong < 0 || jOptLong > 86400000) {
                jOptLong = com.bytedance.sdk.openadsdk.TTAdConstant.AD_MAX_EVENT_TIME;
            }
            bgVarBg.bg("req_inter_min", jOptLong);
        }
        if (jSONObject.has("lp_new_style")) {
            bgVarBg.bg("landingpage_new_style", jSONObject.optInt("lp_new_style", Integer.MAX_VALUE));
        }
        if (jSONObject.has("blank_detect_rate")) {
            int iOptInt2 = jSONObject.optInt("blank_detect_rate", 30);
            if (iOptInt2 < 0 || iOptInt2 > 100) {
                iOptInt2 = 30;
            }
            bgVarBg.bg("blank_detect_rate", iOptInt2);
        }
        org.json.JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("feq_policy");
        if (jSONObjectOptJSONObject2 != null) {
            if (jSONObjectOptJSONObject2.has("duration")) {
                bgVarBg.bg("duration", jSONObjectOptJSONObject2.optLong("duration") * 1000);
            }
            if (jSONObjectOptJSONObject2.has(com.applovin.sdk.AppLovinMediationProvider.MAX)) {
                bgVarBg.bg(com.applovin.sdk.AppLovinMediationProvider.MAX, jSONObjectOptJSONObject2.optInt(com.applovin.sdk.AppLovinMediationProvider.MAX));
            }
        }
        if (jSONObject.has("vbtt")) {
            bgVarBg.bg("vbtt", jSONObject.optInt("vbtt", 5));
        }
        org.json.JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("abtest");
        if (jSONObjectOptJSONObject3 != null) {
            if (jSONObjectOptJSONObject3.has("version")) {
                bgVarBg.bg("ab_test_version", jSONObjectOptJSONObject3.optString("version"));
            }
            if (jSONObjectOptJSONObject3.has("param")) {
                bgVarBg.bg("ab_test_param", jSONObjectOptJSONObject3.optString("param"));
            }
        } else {
            com.bytedance.sdk.openadsdk.core.settings.xxp.zU().iR();
        }
        org.json.JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("log_rate_conf");
        if (jSONObjectOptJSONObject4 != null && jSONObjectOptJSONObject4.has("global_rate")) {
            bgVarBg.bg("global_rate", (float) jSONObjectOptJSONObject4.optDouble("global_rate", 1.0d));
        }
        if (jSONObject.has("pyload_h5")) {
            bgVarBg.bg("pyload_h5", jSONObject.optString("pyload_h5"));
        }
        if (jSONObject.has("pure_pyload_h5")) {
            bgVarBg.bg("playableLoadH5Url", jSONObject.optString("pure_pyload_h5"));
        }
        if (jSONObject.has("ads_url")) {
            bgVarBg.bg("ads_url", jSONObject.optString("ads_url"));
        }
        if (jSONObject.has("app_log_url")) {
            bgVarBg.bg("app_log_url", jSONObject.optString("app_log_url"));
        }
        if (jSONObject.has("coppa")) {
            int iOptInt3 = jSONObject.optInt("coppa", -99);
            com.bytedance.sdk.openadsdk.core.WR.IL().eqN(iOptInt3);
            bgVarBg.bg("coppa", iOptInt3);
        }
        if (jSONObject.has("privacy_url")) {
            bgVarBg.bg("policy_url", jSONObject.optString("privacy_url"));
        }
        if (jSONObject.has("consent_url")) {
            bgVarBg.bg("consent_url", jSONObject.optString("consent_url"));
        }
        if (jSONObject.has("ivrv_downward")) {
            bgVarBg.bg("ivrv_downward", jSONObject.optInt("ivrv_downward", 0));
        }
        if (jSONObject.has("dc")) {
            bgVarBg.bg("dc", jSONObject.optString("dc"));
        }
        com.bytedance.sdk.openadsdk.core.settings.xxp.zU().bg(jSONObject, bgVarBg);
        com.bytedance.sdk.openadsdk.core.settings.xxp.zU().IL(jSONObject, bgVarBg);
        if (jSONObject.has("if_both_open")) {
            bgVarBg.bg("if_both_open", jSONObject.optInt("if_both_open", 0));
        }
        if (jSONObject.has("support_tnc")) {
            bgVarBg.bg("support_tnc", jSONObject.optInt("support_tnc", 1));
        }
        if (jSONObject.has("insert_js_config")) {
            bgVarBg.bg("insert_js_config", jSONObject.optString("insert_js_config", ""));
        }
        if (jSONObject.has("max_tpl_cnts")) {
            bgVarBg.bg("max_tpl_cnts", jSONObject.optInt("max_tpl_cnts", 100));
        }
        org.json.JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("app_common_config");
        if (jSONObjectOptJSONObject5 != null) {
            if (jSONObjectOptJSONObject5.has("force_language")) {
                java.lang.String strOptString = jSONObjectOptJSONObject5.optString("force_language");
                if (!android.text.TextUtils.isEmpty(strOptString) && eqN.contains(strOptString)) {
                    bgVarBg.bg("force_language", strOptString);
                }
            }
            if (jSONObjectOptJSONObject5.has("fetch_tpl_timeout_ctrl")) {
                bgVarBg.bg("fetch_tpl_timeout_ctrl", jSONObjectOptJSONObject5.optInt("fetch_tpl_timeout_ctrl", 3000));
            }
            if (jSONObjectOptJSONObject5.has("fetch_tpl_second")) {
                bgVarBg.bg("fetch_tpl_second", jSONObjectOptJSONObject5.optInt("fetch_tpl_second", 0));
            }
            if (jSONObjectOptJSONObject5.has("support_gzip")) {
                bgVarBg.bg("support_gzip", jSONObjectOptJSONObject5.optBoolean("support_gzip", false));
            }
            if (jSONObjectOptJSONObject5.has("aes_key")) {
                bgVarBg.bg("aes_key", jSONObjectOptJSONObject5.optString("aes_key"));
            }
            if (jSONObjectOptJSONObject5.has("support_rtl")) {
                bgVarBg.bg("support_rtl", jSONObjectOptJSONObject5.optBoolean("support_rtl", false));
            }
            if (jSONObjectOptJSONObject5.has("ad_revenue_enable")) {
                bgVarBg.bg("ad_revenue_enable", jSONObjectOptJSONObject5.optBoolean("ad_revenue_enable", false));
            }
            if (jSONObjectOptJSONObject5.has("gecko_hosts")) {
                try {
                    this.zx.clear();
                    org.json.JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject5.optJSONArray("gecko_hosts");
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
                        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                            this.zx.add(jSONArrayOptJSONArray.getString(i));
                        }
                    }
                    this.zx = bg(this.zx);
                    bgVarBg.bg("gecko_hosts", jSONArrayOptJSONArray.toString());
                } catch (java.lang.Throwable th) {
                    com.bytedance.sdk.component.utils.PX.IL("GeckoLog: settings json error ".concat(java.lang.String.valueOf(th)));
                }
            }
        }
        if (jSONObject.has("read_video_from_cache")) {
            bgVarBg.bg("read_video_from_cache", jSONObject.optInt("read_video_from_cache", 1));
        }
        com.bytedance.sdk.openadsdk.core.settings.bX.bg(jSONObject.optJSONArray("ad_slot_conf_list"));
        org.json.JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("privacy");
        if (jSONObjectOptJSONObject6 != null) {
            if (jSONObjectOptJSONObject6.has("ad_enable")) {
                bgVarBg.bg("privacy_ad_enable", jSONObjectOptJSONObject6.optInt("ad_enable", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject6.has("personalized_ad")) {
                bgVarBg.bg("privacy_personalized_ad", jSONObjectOptJSONObject6.optInt("personalized_ad", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject6.has("sladar_enable")) {
                bgVarBg.bg("privacy_sladar_enable", jSONObjectOptJSONObject6.optInt("sladar_enable", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject6.has("app_log_enable")) {
                bgVarBg.bg("privacy_app_log_enable", jSONObjectOptJSONObject6.optInt("app_log_enable", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject6.has("debug_unlock")) {
                bgVarBg.bg("privacy_debug_unlock", jSONObjectOptJSONObject6.optInt("debug_unlock", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject6.has("fields_allowed")) {
                java.lang.String strOptString2 = jSONObjectOptJSONObject6.optString("fields_allowed", "");
                if (!android.text.TextUtils.isEmpty(strOptString2)) {
                    bgVarBg.bg("privacy_fields_allowed", strOptString2);
                } else {
                    bgVarBg.bg("privacy_fields_allowed");
                }
            }
        }
        if (jSONObject.has("video_cache_config")) {
            bgVarBg.bg("video_cache_config", jSONObject.optString("video_cache_config"));
        }
        if (jSONObject.has("loaded_recall_time")) {
            int iOptInt4 = jSONObject.optInt("loaded_recall_time", 0);
            if (iOptInt4 != 0 && iOptInt4 != 1) {
                iOptInt4 = 0;
            }
            bgVarBg.bg("loadedCallbackOpportunity", iOptInt4);
        }
        if (jSONObject.has("load_strategy")) {
            int iOptInt5 = jSONObject.optInt("load_strategy", 0);
            if (iOptInt5 != 0 && iOptInt5 != 1) {
                iOptInt5 = 0;
            }
            bgVarBg.bg("load_callback_strategy", iOptInt5);
        }
        if (jSONObject.has("splash_video_load_strategy")) {
            int iOptInt6 = jSONObject.optInt("splash_video_load_strategy", 0);
            if (iOptInt6 < 0 || iOptInt6 > 3) {
                iOptInt6 = 0;
            }
            bgVarBg.bg("splash_video_load_strategy", iOptInt6);
        }
        if (jSONObject.has("allow_blind_mode_request_ad")) {
            bgVarBg.bg("allow_blind_mode_request_ad", jSONObject.optBoolean("allow_blind_mode_request_ad", false));
        }
        org.json.JSONObject jSONObjectOptJSONObject7 = jSONObject.optJSONObject("bus_con");
        if (jSONObjectOptJSONObject7 != null) {
            if (jSONObjectOptJSONObject7.has("bus_con_send_log_type")) {
                bgVarBg.bg("bus_con_send_log_type", jSONObjectOptJSONObject7.optInt("bus_con_send_log_type", 1));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_sec_type")) {
                bgVarBg.bg("bus_con_sec_type", jSONObjectOptJSONObject7.optInt("bus_con_sec_type", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_dislike_report_raw")) {
                bgVarBg.bg("bus_con_dislike_report_raw", jSONObjectOptJSONObject7.optBoolean("bus_con_dislike_report_raw", false));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_adshow_check_enable")) {
                bgVarBg.bg("bus_con_adshow_check_enable", jSONObjectOptJSONObject7.optBoolean("bus_con_adshow_check_enable", true));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_tnc_interval")) {
                bgVarBg.bg("bus_con_tnc_interval", jSONObjectOptJSONObject7.optLong("bus_con_tnc_interval", com.bytedance.sdk.openadsdk.TTAdConstant.AD_MAX_EVENT_TIME));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_token_thread_count")) {
                bgVarBg.bg("bus_con_token_thread_count", jSONObjectOptJSONObject7.optInt("bus_con_token_thread_count", 4));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_video_keep_screen_on")) {
                bgVarBg.bg("bus_con_video_keep_screen_on", jSONObjectOptJSONObject7.optInt("bus_con_video_keep_screen_on", 1));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_auto_click_delay")) {
                bgVarBg.bg("bus_con_auto_click_delay", jSONObjectOptJSONObject7.optInt("bus_con_auto_click_delay", 3000));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_express_host")) {
                bgVarBg.bg("bus_con_express_host", jSONObjectOptJSONObject7.optString("bus_con_express_host", "https://sf16-static.i18n-pglstatp.com/obj/ad-pattern-sg/"));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_rewardedfull_link")) {
                bgVarBg.bg("bus_con_rewardedfull_link", jSONObjectOptJSONObject7.optInt("bus_con_rewardedfull_link", 0));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_check_clz")) {
                bgVarBg.bg("bus_con_check_clz", jSONObjectOptJSONObject7.optString("bus_con_check_clz", ""));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_url_check")) {
                bgVarBg.bg("bus_con_url_check", jSONObjectOptJSONObject7.optInt("bus_con_url_check", 1));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_behavior_count")) {
                bgVarBg.bg("bus_con_behavior_count", jSONObjectOptJSONObject7.optInt("bus_con_behavior_count", com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT));
            }
            if (jSONObjectOptJSONObject7.has(com.bytedance.sdk.openadsdk.core.settings.xxp.bg)) {
                bgVarBg.bg(com.bytedance.sdk.openadsdk.core.settings.xxp.bg, jSONObjectOptJSONObject7.optBoolean(com.bytedance.sdk.openadsdk.core.settings.xxp.bg, false));
            }
            if (jSONObjectOptJSONObject7.has(com.bytedance.sdk.openadsdk.core.settings.xxp.IL)) {
                bgVarBg.bg(com.bytedance.sdk.openadsdk.core.settings.xxp.IL, jSONObjectOptJSONObject7.optInt(com.bytedance.sdk.openadsdk.core.settings.xxp.IL, 10000));
            }
            if (jSONObjectOptJSONObject7.has(com.bytedance.sdk.openadsdk.core.settings.xxp.bX)) {
                bgVarBg.bg(com.bytedance.sdk.openadsdk.core.settings.xxp.bX, (float) jSONObjectOptJSONObject7.optDouble(com.bytedance.sdk.openadsdk.core.settings.xxp.bX, 1.0d));
            }
        }
        if (jSONObject.has("perf_con")) {
            try {
                org.json.JSONObject jSONObjectOptJSONObject8 = jSONObject.optJSONObject("perf_con");
                if (jSONObjectOptJSONObject8 != null) {
                    if (jSONObjectOptJSONObject8.has("perf_con_stats_rate")) {
                        java.lang.String strOptString3 = jSONObjectOptJSONObject8.optString("perf_con_stats_rate");
                        if (!android.text.TextUtils.isEmpty(strOptString3)) {
                            bgVarBg.bg("perf_con_stats_rate", strOptString3);
                        }
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_applog_send")) {
                        java.lang.String strOptString4 = jSONObjectOptJSONObject8.optString("perf_con_applog_send");
                        if (!android.text.TextUtils.isEmpty(strOptString4)) {
                            bgVarBg.bg("perf_con_applog_send", strOptString4);
                        }
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_apm_native")) {
                        bgVarBg.bg("perf_con_apm_native", jSONObjectOptJSONObject8.optInt("perf_con_apm_native"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_webview_preload_cache")) {
                        bgVarBg.bg("perf_con_webview_preload_cache", jSONObjectOptJSONObject8.optInt("perf_con_webview_preload_cache"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_webview_preload_cache_v3")) {
                        bgVarBg.bg("perf_con_webview_preload_cache_v3", jSONObjectOptJSONObject8.optInt("perf_con_webview_preload_cache_v3"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_webview_cache_count")) {
                        bgVarBg.bg("perf_con_webview_cache_count", jSONObjectOptJSONObject8.optInt("perf_con_webview_cache_count", 0));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_webview_cache_count_v3")) {
                        bgVarBg.bg("perf_con_webview_cache_count_v3", jSONObjectOptJSONObject8.optInt("perf_con_webview_cache_count_v3", 0));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_thread_stack_size") && (iOptInt = jSONObjectOptJSONObject8.optInt("perf_con_thread_stack_size")) >= -524288 && iOptInt <= 0) {
                        bgVarBg.bg("perf_con_thread_stack_size", iOptInt);
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_use_new_thread_pool")) {
                        bgVarBg.bg("perf_con_use_new_thread_pool", jSONObjectOptJSONObject8.optInt("perf_con_use_new_thread_pool", 0));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_thread_pool_config")) {
                        java.lang.String strOptString5 = jSONObjectOptJSONObject8.optString("perf_con_thread_pool_config");
                        if (!android.text.TextUtils.isEmpty(strOptString5)) {
                            bgVarBg.bg("perf_con_thread_pool_config", strOptString5);
                        }
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_is_new_net_thread")) {
                        bgVarBg.bg("perf_con_is_new_net_thread", jSONObjectOptJSONObject8.optInt("perf_con_is_new_net_thread", 0));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_use_prop")) {
                        com.bytedance.sdk.openadsdk.utils.kMt.bg(jSONObjectOptJSONObject8.optInt("perf_con_use_prop", 1));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_adlog_expire_time")) {
                        bgVarBg.bg("perf_con_adlog_expire_time", jSONObjectOptJSONObject8.optLong("perf_con_adlog_expire_time"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_adlog_turn_off_retry_ad")) {
                        bgVarBg.bg("perf_con_adlog_turn_off_retry_ad", jSONObjectOptJSONObject8.optLong("perf_con_adlog_turn_off_retry_ad"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_adlog_turn_off_retry_stats")) {
                        bgVarBg.bg("perf_con_adlog_turn_off_retry_stats", jSONObjectOptJSONObject8.optLong("perf_con_adlog_turn_off_retry_stats"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_applog_rate")) {
                        bgVarBg.bg("perf_con_applog_rate", jSONObjectOptJSONObject8.optString("perf_con_applog_rate"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_track_url_strategy")) {
                        bgVarBg.bg("perf_con_track_url_strategy", jSONObjectOptJSONObject8.optString("perf_con_track_url_strategy"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_drawable_code")) {
                        bgVarBg.bg("perf_con_drawable_code", jSONObjectOptJSONObject8.optInt("perf_con_drawable_code", 0));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_close_button_delay_check_time")) {
                        bgVarBg.bg("perf_con_close_button_delay_check_time", jSONObjectOptJSONObject8.optInt("perf_con_close_button_delay_check_time", -1));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_drop2rt_skip_label_list")) {
                        bgVarBg.bg("perf_con_drop2rt_skip_label_list", jSONObjectOptJSONObject8.optString("perf_con_drop2rt_skip_label_list"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_crypt_V4_get_ad")) {
                        bgVarBg.bg("perf_con_crypt_V4_get_ad", jSONObjectOptJSONObject8.optBoolean("perf_con_crypt_V4_get_ad", false));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_crypt_V4_applog")) {
                        bgVarBg.bg("perf_con_crypt_V4_applog", jSONObjectOptJSONObject8.optBoolean("perf_con_crypt_V4_applog", false));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_crypt_V4")) {
                        bgVarBg.bg("perf_con_crypt_V4", jSONObjectOptJSONObject8.optBoolean("perf_con_crypt_V4", false));
                    }
                }
            } catch (java.lang.Throwable th2) {
                com.bytedance.sdk.component.utils.PX.bg("SettingsDefaultRepository", th2.getMessage());
            }
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("app_common_config", jSONObjectOptJSONObject5);
            jSONObject2.put("perf_con", jSONObject.optJSONObject("perf_con"));
            jSONObject2.put("bus_con", jSONObject.optJSONObject("bus_con"));
        } catch (org.json.JSONException e) {
            com.bytedance.sdk.component.utils.PX.bg("SettingsDefaultRepository", "coreSettingJson", e.getMessage());
        }
        bgVarBg.bg("core_settings", jSONObject2.toString());
        if (jSONObject.has("dual_event_url")) {
            bgVarBg.bg("dual_event_url", jSONObject.optString("dual_event_url"));
        }
        bgVarBg.bg();
        com.bytedance.sdk.openadsdk.core.settings.xxp.zU().Uq();
        eqN();
    }

    public static java.util.Set<java.lang.String> bg(java.util.Set<java.lang.String> set) {
        try {
            if (set == null) {
                return new java.util.HashSet();
            }
            java.util.HashSet hashSet = new java.util.HashSet();
            for (java.lang.String str : set) {
                if (!android.text.TextUtils.isEmpty(str)) {
                    hashSet.add(str);
                }
            }
            return hashSet;
        } catch (java.lang.Throwable unused) {
            return new java.util.HashSet();
        }
    }
}
