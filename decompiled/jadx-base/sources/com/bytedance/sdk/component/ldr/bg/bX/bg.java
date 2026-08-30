package com.bytedance.sdk.component.ldr.bg.bX;

/* JADX INFO: loaded from: classes3.dex */
public class bg {
    private static final java.util.LinkedList<java.lang.String> bg = new java.util.LinkedList<>();
    private static final java.util.LinkedList<java.lang.String> IL = new java.util.LinkedList<>();
    private static final java.util.LinkedList<java.lang.String> bX = new java.util.LinkedList<>();
    private static final java.util.LinkedList<java.lang.String> eqN = new java.util.LinkedList<>();
    private static final java.util.Map<java.lang.String, java.lang.Integer> zx = new java.util.HashMap();
    private static java.util.HashMap<java.lang.String, java.lang.Integer> ldr = null;
    private static java.lang.String iR = "upload_init";
    private static int Kg = 0;
    private static int WR = 0;

    public static java.lang.String bg(int i) {
        switch (i) {
            case 1:
                return "flush once";
            case 2:
                return "flush memory db";
            case 3:
                return "flush memory";
            case 4:
                return "new event";
            case 5:
                return "server busy";
            case 6:
                return "empty message";
            case 7:
                return "net error";
            default:
                return "default";
        }
    }

    public static void bg() {
        if (ldr != null) {
            return;
        }
        java.lang.String[] strArr = {"first_view", "open_splash", "ad_landing_webview_init", "show_failed_topview", "adstyle_template_show", "splash_init_monitor_first", "download_video_succeed", "shake_skip", "receive", "video_over_auto", "render_time", "splash_ad", "preload_start", "mute", "covered", "download_image_failed", "splash_init_monitor_all", "preload_success_time", "download_video_start_sdk", "download_video_count", "not_showing_reason", "download_image_succeed", "load_video_success", "launch_covered", "download_video_prepare", "download_video_start", "boarding", "ad_wap_stat", "splash_pick", "preload_fail", "should_show", "adstyle_template_fill", "unmute", "preload_success", "show_failed", "stop_showing_monitor", "download_video_no_download", "track_url", "download_creative_duration", "adstyle_template_render", "download_video_count_splash_sdk", "landing_preload_finish", "adstyle_template_load", "load_ad_duration", "client_false_show", "client_false", "download_video_failed", "data_invalid", "topview_boarding", "topview_start_download", "topview_show_confirmed", "splash_start_download", "topview_show_rejected", "splash_no_download", "redownload_video_count", "topview_other_show", "topview_no_download", "ad_selected", "invalid_model", "topview_deliver", "ad_no_selected", "topview_ad_download_retry_label", "request", com.json.hs.n, "parse_finished", "front_performance", "ad_resp", "ad_resp_nodata", "preload_finish", "transit_show", "splash_switch", "block_splash_F2", "render_picture_time", "network_type", "play_start_error", "load_video_error", "render_picture_timeout", "py_loading_success", "download_status", "first_screen_load_finish", "landing_preload_failed", "data_received", "preload_result", "show_result", "reponse", "valid_time", "brand_satefy_context", "topview_ad_link_fail_label", "end_feed_request", "start_feed_request", "set_feed_data", "delayinstall_conflict_with_back_dialog", "clean_fetch_apk_head_failed", "cleanspace_download_after_quite_clean", "fps_too_low", "open_policy", "landing_perf_stats", "preload_topview", "show_effect_start", "dislike_monitor", "hour_show", "hour_skip", "triggered", "click_sound_switch", "enter_loft", "download_resume", "install_view_result", "contiguous_ad_event", "contiguous_ad_remove_event", "report_monitor", "open_landing_blank", "dynamic_ad", "report_load_failed", "ad_download_failed", "download_video_start_first_sdk", "splash_receive", "video_play", "clean_fetch_apk_head_switch_close", "label_external_permission", "pause_reserve_wifi_switch_status", "landing_download_dialog_show", "download_connect", "download_uncompleted", "pause_reserve_wifi_dialog_show", "download_io", "pause_reserve_wifi_confirm", "skvc_load_time", "segment_io", "click_no", "pause_reserve_wifi_cancel_on_wifi", "udp_stop", "mma_url", "error_save_sp", "download_notification_try_show", "ttd_pref_monitor", "item_above_the_fold_stay_time", "ttdownloader_unity", "bdad_query_log", "bdad_load_finish", "bdad_load", "bdad_load_fail", com.google.android.gms.ads.AdError.UNDEFINED_DOMAIN, "valid_stock", "show_filter", "splash_pk_result", "endcard_page_info", "page_on_create", "statistics_feed_docker", "show_search_card_word", "ad_new_video_render_start_label", "ad_new_video_play_start_label", "ad_new_video_ad_patch_data_set_null_label", "ad_new_video_ad_patch_play_label", "ad_new_video_ad_patch_render_label", "debug_touch_start", "try_second_request", "egg_unzip_success", "tap_2", "anti_0_result", "anti_2_result", "egg_unzip_no_start", "preload_no_start", "bind_impression_212202", "guide_auth_dialog_cancel", "show_im_entry", "sub_reco_impression_v2", "sync_request_log_mask", "no_send_sync_request", "load_timeout", "send_sync_request", "sync_request_not_show", "show_subv_tt_video_food", "track", "custom_event", "rd_landing_page_stat", "update_local_data", "showlimit", "upload_result", "debug_othershow", "debug_otherclick", "ad_show_time", "push_launch", "union_send_duplicate", "mnpl_js_finish_load", "mnpl_resource_finish_load", "mnpl_material_render_timeout", "mnpl_render_timing", "mnpl_vedio_interactive_timegap", "click_non_rectify_area", "start_impression", "end_impression", "picture_render_time", "splash_stop_show", "skip_post", "skan_show_start", "skan_show_end", "load_video_start", "rifle_ad_monitor", "download_video_redownload", "splash_video_quality", "splash_video_end", "splash_video_pause", "splash_video_failed", "adtrace_start_clear", "adtrace_clear_past_data", "adtrace_end_clear", "adtrace_write_success", "adtrace_write_failed", "adtrace_read_result", "adtrace_read_success", "adtrace_read_failed", "pick_model", "cache_model", "adtrace_reparse_file", "deeplink_failed_all", "ad_live_degenerate", "ad_live_miss", "live_play_fail", "sko_show_success", "sko_show_fail", "commerce_apps_open", "commerce_apps_jump", "pic_card_show", "live_ad_card_render_finish", "adtrace_select", "received_card_status", "live_ad_page_load_success", "mp_download_result", "download_video_cancel", "jump_count", "adtrace_try_show", "show_cart_entrance", "live_ad_page_load_fail", "click_interacted", "pop_up", "pop_up_cancel", "stream_loadtime", "mnpl_guide_comp_render", "thirdquartile", "customer_feed_pause", "customer_play_start", "customer_feed_break", "click_area_log", "customer_feed_continue", "customer_feed_play", "mnpl_resource_start_preload", "mnpl_resource_finish_preload", "customer_feed_over", "get_preload_ad", "web_inspect_status", "web_report_status", "preload_begin", "preload_end", "open_begin", "open_end", "pangle_live_sdk_monitor", "success", "rifle_load_state", "rifle_uri_load_state", "component_init", "component_release", "ad_lynx_download_sendAdLog", "dynamic2_render", "lynx_card_show", "pop_up_download", "live_shelf_commodity_show", "unity_fe_click", "enter_ads_explain", "adx_ads_switch", "personal_ads_switch", "qc_product_picture_cancel", "qc_product_picture_save", "qc_product_picture_press", "qc_product_detail_show", "qc_price_instruction_click", "qc_edit_sku_num_click", "service_description_page_duration", "enter_business_qualification_page ", "service_description_page_show", "order_words_fe", "qc_payment_mode_show", "qc_click_ali_pay", "qc_district_addr_click", "qc_auto_information_add", "qc_dial_consult_cancel_btn_click", "qc_dial_consult_show", "qc_maomadeng_click", "qc_maomadeng_show", "slide_product_big_picture", "qc_service_description_close", "appstore_manager_request", "preload_video_result", "preload_video_start", "adtrace_bind", "topview_ad_link_match_event", "skip_leisure_interact_render", "click_start_download", "ad_lynx_landing_page_exception", "lynx_page_res_download_monitor_event", "live_fail", "live_over", "render_live_picture_success", "render_live_picture_fail", "live_play_success", "live_play_close", "item_play_pver", "ad_gap_info", "item_play_over", "has_period_first_chance", "enter_live_auto", "mnpl_material_video_scene_show", "ad_rerank", "in_web_click", "post_request_failed", "destroy", "bidding_load", "bidding_receive", "in_web_scroll", "tobsdk_livesdk_live_show", "xigua_ad_rerank", "applink_unity", "top_ad_show", "top_button_show", "skip_button_show", "skip_click", "shake_show", "skip_result", "show_personal_compliance_button_click", "personal_compliance_click", "ad_click_result", "ad_preload_video", "popup_show", "topview_feed_down", "qr_scan", "qr_show", "topview_popup_show", "topview_feed_over", "topview_feed_show", "feed_down", "engine_ad_send", "permission_click", "policy_click", "download_start_click", "mini_playable_style_report", "load_detect", "aweme_show_info", "click_convert_anchor_detail_page", "click_anchor_gift_button", "show_anchor_gift_page", "click_anchor_gift_card", "show_anchor_gift_card", "anchor_convert_button", "show_anchor_page", "search_result_click", "sdk_session_launch", "not_use_app_link_sdk", "click_ios_check", "auto_open", "bind_click_area", "page_load", "show_finish", "next_fresh", "play_ready", "splash_pk_time", "unshow", "feed_show_failed", "othershow_cancel", "lu_cache", "realtime_splash_result", "channel_override_result", "internal_jump_live_status", "mnpl_video_play_backward", "splash_enter_foreground", "splash_enter_background", "button_light", "long_press", "webview_material_missing_key_error", "live_life_project_click_card", "mnpl_click_event", "show_anchor_convert_button", "bdar_log_info", "bdar_ad_request", "bdar_lynx_template_load_time", "bdar_lynx_fallback", "bdar_fetch_template_data", "bdar_lynx_render_time", "bdar_video_play_effective", "bdar_video_first_frame", "bdar_lynx_jsb_error", "invalidate_back_url_monitor_event", "lynx_page_plugin_exception_event", "live_custom_interaction", "pinch", "if_splash_card", "splash_card_show", "card_show_fail", "splash_card_click", "splash_card_close", "wind_icon_click", "excluded", "show_error", "toutiao_ad_receive", "show_ad", "toutiao_ad_excluded", "close_card", "lynx_status", "qpon_join", "apk_download_user", "comment_key_word_show", "v3_show_ad", "show_wish_button", "enterSection", "single_comment_show", "enter_product_detail", "xigua_ad_request", "qpon_apply", "splash_total_duration", "splash_render_duration", "download_template_duration", "homepage_hot", "homepage_follow", "homepage_fresh", "video_play_success", "general_search", "video_render_cost", "single_ad_render_cost", "unexpected_accurate_pause", "mnpl_interact_skip", "web_report_request_url", "web_report_init_status", "first_request", "video_ended", "mnpl_script_error", "open_wechat_failed_shake", "open_wechat_shacke", "open_wechat_success_shake", "options_popup", "close_pers_ads_type", "check_closed_type", "ad_guide_panel", "learn_ads", "learn_adx_ads", "learn_pers_ads", "resume_closed_type", "twist", "open_wechat_shake"};
        ldr = new java.util.HashMap<>(446);
        for (int i = 0; i < 446; i++) {
            ldr.put(strArr[i], 1);
        }
    }

    private static synchronized java.lang.String IL(java.lang.String str) {
        java.lang.StringBuilder sb;
        java.util.LinkedList<java.lang.String> linkedList = IL;
        if (linkedList.size() >= 10) {
            linkedList.removeFirst();
            linkedList.add(str);
        } else {
            linkedList.add(str);
        }
        sb = new java.lang.StringBuilder();
        java.util.Iterator<java.lang.String> it = linkedList.iterator();
        while (it.hasNext()) {
            sb.append(it.next()).append(",");
        }
        return sb.toString();
    }

    private static synchronized java.lang.String bX(java.lang.String str) {
        java.lang.StringBuilder sb;
        java.util.LinkedList<java.lang.String> linkedList = bX;
        if (linkedList.size() >= 10) {
            linkedList.removeFirst();
            linkedList.add(str);
        } else {
            linkedList.add(str);
        }
        sb = new java.lang.StringBuilder();
        java.util.Iterator<java.lang.String> it = linkedList.iterator();
        while (it.hasNext()) {
            sb.append(it.next()).append(",");
        }
        return sb.toString();
    }

    private static synchronized java.lang.String ldr() {
        java.lang.StringBuilder sb;
        sb = new java.lang.StringBuilder();
        java.util.Iterator<java.lang.String> it = eqN.iterator();
        while (it.hasNext()) {
            sb.append(it.next()).append(",");
        }
        return sb.toString();
    }

    private static synchronized void eqN(java.lang.String str) {
        java.util.LinkedList<java.lang.String> linkedList = eqN;
        if (linkedList.size() >= 10) {
            linkedList.removeFirst();
            linkedList.add(str);
        } else {
            linkedList.add(str);
        }
    }

    public static java.lang.String bg(com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar) {
        if (bgVar == null || bgVar.iR() == null || bX()) {
            return null;
        }
        if (bgVar.IL() == 3) {
            return bgVar.iR().optString(androidx.core.app.NotificationCompat.CATEGORY_EVENT);
        }
        return bgVar.iR().optString("label");
    }

    public static java.lang.String IL(com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar) {
        if (bgVar == null || bgVar.iR() == null || bX()) {
            return null;
        }
        return bgVar.iR().optString("type");
    }

    public static int bX(com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar) {
        if (bgVar == null || bgVar.iR() == null || !IL()) {
            return -1;
        }
        try {
            return new org.json.JSONObject(bgVar.iR().optString("event_extra")).optInt("stats_index");
        } catch (org.json.JSONException unused) {
            return -1;
        }
    }

    public static synchronized int eqN(com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar) {
        if (bgVar != null) {
            if (bgVar.iR() != null) {
                if (!IL()) {
                    return 0;
                }
                try {
                    return new org.json.JSONObject(bgVar.iR().optString("ad_extra_data")).optInt("sdk_event_self_count");
                } catch (java.lang.Exception unused) {
                    return 0;
                }
            }
        }
        return 0;
    }

    public static java.lang.String zx(com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar) {
        if (bgVar == null || bgVar.iR() == null || bX()) {
            return null;
        }
        java.lang.String strOptString = bgVar.iR().optString("log_extra");
        if (!android.text.TextUtils.isEmpty(strOptString)) {
            try {
                return new org.json.JSONObject(strOptString).optString("req_id");
            } catch (org.json.JSONException unused) {
            }
        }
        return null;
    }

    public static boolean bg(java.lang.String str) {
        java.util.HashMap<java.lang.String, java.lang.Integer> map = ldr;
        if (map == null || str == null) {
            return false;
        }
        return map.containsKey(str);
    }

    public static void bg(java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> list, int i) {
        try {
            if (com.bytedance.sdk.component.ldr.bg.Kg.iR().vb().iR()) {
                for (com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar : list) {
                    if (bgVar != null && bgVar.WR() != 0) {
                        long jCurrentTimeMillis = java.lang.System.currentTimeMillis() - bgVar.WR();
                        com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.RJ().incrementAndGet();
                        com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.lM().getAndAdd(jCurrentTimeMillis);
                        bgVar.bX(java.lang.System.currentTimeMillis());
                    }
                    if (bgVar != null) {
                        ldr(bgVar);
                    }
                }
                com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.sVc().getAndAdd(list.size());
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public static void ldr(com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar) {
        try {
            if (bgVar.eqN() == 0 && com.bytedance.sdk.component.ldr.bg.Kg.iR().vb() != null && com.bytedance.sdk.component.ldr.bg.Kg.iR().vb().bg()) {
                org.json.JSONObject jSONObjectIR = bgVar.iR();
                java.lang.String strBg = bg(bgVar);
                if (bg(strBg)) {
                    return;
                }
                zx(bgVar);
                java.lang.String strOptString = jSONObjectIR.optString("ad_extra_data");
                if (!android.text.TextUtils.isEmpty(strOptString)) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(strOptString);
                    if (android.text.TextUtils.isEmpty(jSONObject.optString("will_send_labels"))) {
                        jSONObject.put("will_send_labels", bX(strBg + "_" + WR(bgVar)));
                        jSONObject.put("send_success_valid_labels", ldr());
                    }
                    jSONObjectIR.put("ad_extra_data", jSONObject.toString());
                    return;
                }
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("will_send_labels", bX(strBg + "_" + WR(bgVar)));
                jSONObject2.put("send_success_valid_labels", ldr());
                jSONObjectIR.put("ad_extra_data", jSONObject2.toString());
            }
        } catch (java.lang.Exception e) {
            e.getMessage();
        }
    }

    public static void iR(com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar) {
        try {
            if (com.bytedance.sdk.component.ldr.bg.Kg.iR().vb().iR()) {
                com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.bg(java.lang.System.currentTimeMillis() - bgVar.Kg());
                bgVar.IL(java.lang.System.currentTimeMillis());
                if (bgVar.eqN() == 0 && com.bytedance.sdk.component.ldr.bg.Kg.iR().vb() != null && com.bytedance.sdk.component.ldr.bg.Kg.iR().vb().bg()) {
                    java.lang.String strBg = bg(bgVar);
                    if (bg(strBg)) {
                        return;
                    }
                    org.json.JSONObject jSONObjectIR = bgVar.iR();
                    java.lang.String strOptString = bgVar.iR().optString("ad_extra_data");
                    if (!android.text.TextUtils.isEmpty(strOptString)) {
                        org.json.JSONObject jSONObject = new org.json.JSONObject(strOptString);
                        if (android.text.TextUtils.isEmpty(jSONObject.optString("save_success_labels"))) {
                            jSONObject.put("save_success_labels", IL(strBg + "_" + WR(bgVar)));
                        }
                        jSONObjectIR.put("ad_extra_data", jSONObject.toString());
                        return;
                    }
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("save_success_labels", IL(strBg + "_" + WR(bgVar)));
                    jSONObjectIR.put("ad_extra_data", jSONObject2.toString());
                }
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public static boolean IL() {
        com.bytedance.sdk.component.ldr.bg.zx zxVarVb = com.bytedance.sdk.component.ldr.bg.Kg.iR().vb();
        return zxVarVb != null && zxVarVb.ldr() == 0;
    }

    public static boolean bX() {
        com.bytedance.sdk.component.ldr.bg.zx zxVarVb = com.bytedance.sdk.component.ldr.bg.Kg.iR().vb();
        return zxVarVb != null && zxVarVb.ldr() == 2;
    }

    public static boolean eqN() {
        com.bytedance.sdk.component.ldr.bg.zx zxVarVb = com.bytedance.sdk.component.ldr.bg.Kg.iR().vb();
        return zxVarVb != null && zxVarVb.ldr() == 1;
    }

    public static boolean zx() {
        return IL() || eqN();
    }

    public static void bg(org.json.JSONObject jSONObject, com.bytedance.sdk.component.ldr.bg.eqN.bg.bg bgVar) {
        com.bytedance.sdk.component.ldr.bg.zx zxVarVb = com.bytedance.sdk.component.ldr.bg.Kg.iR().vb();
        if (zxVarVb != null && zxVarVb.IL() && zx()) {
            jSONObject.optString("label");
            bgVar.zx();
        }
    }

    public static void bg(java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> list, int i, java.lang.String str) {
        com.bytedance.sdk.component.ldr.bg.zx zxVarVb = com.bytedance.sdk.component.ldr.bg.Kg.iR().vb();
        if (zxVarVb == null || !zxVarVb.IL() || list == null || bX()) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        boolean z = false;
        for (com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar : list) {
            if (bgVar.eqN() == 0) {
                org.json.JSONObject jSONObjectIR = bgVar.iR();
                java.lang.String strBg = bg(bgVar);
                if (bgVar.IL() == 3) {
                    if (jSONObjectIR != null) {
                        strBg = jSONObjectIR.optString(androidx.core.app.NotificationCompat.CATEGORY_EVENT);
                    }
                    sb.append(" [v3:").append(strBg).append("] ");
                } else {
                    long jKg = Kg(bgVar);
                    long jWR = WR(bgVar);
                    int iEqN = eqN(bgVar);
                    sb.append(" [").append(jKg).append("_").append(strBg);
                    if (jWR != 0) {
                        sb.append("_").append(jWR);
                    }
                    if (iEqN == 0) {
                        sb.append("] ");
                    } else {
                        sb.append("_").append(iEqN).append("] ");
                    }
                }
                z = true;
            } else if (bgVar.eqN() == 1) {
                sb.append(" [").append(bX(bgVar)).append("_").append(IL(bgVar)).append("] ");
            }
        }
        if (z) {
            new java.lang.StringBuilder("ads:").append((java.lang.Object) sb);
            bg(i);
            list.size();
        } else {
            new java.lang.StringBuilder("stats:").append((java.lang.Object) sb);
            bg(i);
            list.size();
        }
    }

    private static void bg(com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar, java.lang.String str, com.bytedance.sdk.component.ldr.bg.zx zxVar) {
        java.lang.String strBg = bg(bgVar);
        if (bg(strBg)) {
            return;
        }
        java.lang.String strZx = zx(bgVar);
        if (bgVar.eqN() == 0 && zxVar.bg()) {
            eqN(strBg + "_" + WR(bgVar) + "_" + strZx + "_" + str);
        }
    }

    public static long Kg(com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar) {
        if (bgVar == null || bgVar.iR() == null || !IL()) {
            return 0L;
        }
        try {
            return new org.json.JSONObject(bgVar.iR().optString("ad_extra_data")).optLong("sdk_event_index");
        } catch (java.lang.Exception e) {
            e.getMessage();
            return 0L;
        }
    }

    public static long WR(com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar) {
        if (bgVar == null || bgVar.iR() == null || !IL()) {
            return 0L;
        }
        try {
            return new org.json.JSONObject(bgVar.iR().optString("ad_extra_data")).optLong("sdk_event_valid_index");
        } catch (java.lang.Exception e) {
            e.getMessage();
            return 0L;
        }
    }

    public static void bg(boolean z, int i, com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar) {
        com.bytedance.sdk.component.ldr.bg.zx zxVarVb = com.bytedance.sdk.component.ldr.bg.Kg.iR().vb();
        if (bX() || zxVarVb == null || !zxVarVb.IL()) {
            return;
        }
        bg(i);
        android.text.TextUtils.isEmpty(IL(bgVar));
        android.text.TextUtils.isEmpty(bg(bgVar));
    }

    private static java.lang.String VB(com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar) {
        java.lang.String strOptString;
        if (bgVar == null || bgVar.iR() == null || !IL()) {
            return null;
        }
        org.json.JSONObject jSONObjectIR = bgVar.iR();
        if (bgVar.eqN() == 1) {
            strOptString = jSONObjectIR.optString("event_extra");
        } else {
            strOptString = jSONObjectIR.optString("ad_extra_data");
        }
        try {
            return new org.json.JSONObject(strOptString).optString("sdk_session_id");
        } catch (org.json.JSONException e) {
            e.getMessage();
            return null;
        }
    }

    public static void eo(com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar) {
        try {
            if (IL()) {
                com.bytedance.sdk.component.ldr.bg.zx zxVarVb = com.bytedance.sdk.component.ldr.bg.Kg.iR().vb();
                if (!android.text.TextUtils.isEmpty(bgVar.bX())) {
                    com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.GZ(), 1);
                }
                if (zxVarVb == null || !zxVarVb.IL()) {
                    return;
                }
                if (bgVar.eqN() == 1) {
                    IL(bgVar);
                    bX(bgVar);
                    bgVar.bX();
                    VB(bgVar);
                    return;
                }
                if (bgVar.eqN() == 0) {
                    if (bgVar.IL() == 3) {
                        if (bgVar.iR() != null) {
                            bgVar.iR().optString(androidx.core.app.NotificationCompat.CATEGORY_EVENT);
                            int i = (Kg(bgVar) > 0L ? 1 : (Kg(bgVar) == 0L ? 0 : -1));
                            int i2 = (WR(bgVar) > 0L ? 1 : (WR(bgVar) == 0L ? 0 : -1));
                            bgVar.bX();
                            VB(bgVar);
                            return;
                        }
                        return;
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    if (WR(bgVar) != 0) {
                        bg(bgVar);
                    } else {
                        sb.append("v1_debug [label:").append(bg(bgVar));
                    }
                    int i3 = (Kg(bgVar) > 0L ? 1 : (Kg(bgVar) == 0L ? 0 : -1));
                    bgVar.bX();
                    VB(bgVar);
                }
            }
        } catch (java.lang.Exception e) {
            e.getMessage();
        }
    }

    public static void bg(int i, java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> list, long j) {
        if (com.bytedance.sdk.component.ldr.bg.Kg.iR().vb().iR()) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis() - j;
            if (i == 200) {
                com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.RiO().getAndAdd(jCurrentTimeMillis);
                com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.Ys().incrementAndGet();
                com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.wS().getAndAdd(list.size());
                com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.qC().getAndAdd(list.size());
                return;
            }
            if (i == -1) {
                com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.cZH().getAndAdd(list.size());
            } else {
                com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.Pae().getAndAdd(list.size());
            }
            com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.Dt().getAndAdd(jCurrentTimeMillis);
            com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.dS().incrementAndGet();
        }
    }

    public static void bg(java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> list, java.lang.String str) {
        try {
            com.bytedance.sdk.component.ldr.bg.zx zxVarVb = com.bytedance.sdk.component.ldr.bg.Kg.iR().vb();
            if (zxVarVb == null || !zxVarVb.iR() || list == null) {
                return;
            }
            for (com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar : list) {
                if (bgVar != null) {
                    bg(bgVar, str, zxVarVb);
                }
            }
        } catch (java.lang.Exception e) {
            e.getMessage();
        }
    }
}
