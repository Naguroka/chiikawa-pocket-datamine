package com.bytedance.sdk.openadsdk.utils;

/* JADX INFO: loaded from: classes4.dex */
public class Kg {
    private static final java.util.Map<java.lang.String, android.util.Pair<? extends android.graphics.drawable.Drawable, java.lang.Integer>> bg = new java.util.HashMap();
    private static java.lang.Integer IL = null;

    public static android.graphics.drawable.Drawable bg(android.content.Context context, java.lang.String str) {
        return bg(context, str, true);
    }

    public static android.graphics.drawable.Drawable bg(android.content.Context context, java.lang.String str, boolean z) {
        android.util.Pair<? extends android.graphics.drawable.Drawable, java.lang.Integer> pair;
        IL = java.lang.Integer.valueOf(com.bytedance.sdk.openadsdk.core.VzQ.eqN().ZTq());
        java.lang.Object[] objArr = new java.lang.Object[2];
        "drawable name is: ".concat(java.lang.String.valueOf(str));
        java.lang.Object[] objArr2 = new java.lang.Object[4];
        java.util.Map<java.lang.String, android.util.Pair<? extends android.graphics.drawable.Drawable, java.lang.Integer>> map = bg;
        java.lang.Integer.valueOf(map.size());
        if (map.containsKey(str) && (pair = map.get(str)) != null) {
            android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) pair.first;
            map.put(str, new android.util.Pair<>(drawable, java.lang.Integer.valueOf(((java.lang.Integer) pair.second).intValue() + 1)));
            return drawable;
        }
        bg();
        return bg(str, context, z);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static android.graphics.drawable.Drawable bg(java.lang.String str, android.content.Context context, boolean z) {
        byte b;
        android.graphics.drawable.Drawable layerDrawable;
        android.graphics.drawable.Drawable drawableBg;
        str.hashCode();
        switch (str.hashCode()) {
            case -2137782317:
                b = !str.equals("tt_leftbackicon_selector_for_dark") ? (byte) -1 : (byte) 0;
                break;
            case -2023672829:
                b = !str.equals("tt_dislike_dialog_bg") ? (byte) -1 : (byte) 1;
                break;
            case -2010340681:
                b = !str.equals("tt_leftbackbutton_titlebar_photo_preview") ? (byte) -1 : (byte) 2;
                break;
            case -1888785259:
                b = !str.equals("tt_seek_progress") ? (byte) -1 : (byte) 3;
                break;
            case -1883903877:
                b = !str.equals("tt_dislike_middle_seletor") ? (byte) -1 : (byte) 4;
                break;
            case -1881901373:
                b = !str.equals("tt_ad_cover_btn_begin_bg") ? (byte) -1 : (byte) 5;
                break;
            case -1818605128:
                b = !str.equals("tt_leftbackicon_selector") ? (byte) -1 : (byte) 6;
                break;
            case -1724866088:
                b = !str.equals("tt_seek_thumb_normal") ? (byte) -1 : (byte) 7;
                break;
            case -1698792361:
                b = !str.equals("tt_stop_movebar_textpage") ? (byte) -1 : (byte) 8;
                break;
            case -1500492368:
                b = !str.equals("tt_backup_btn_1") ? (byte) -1 : (byte) 9;
                break;
            case -1308443384:
                b = !str.equals("tt_ad_report_info_bg") ? (byte) -1 : (byte) 10;
                break;
            case -1222892514:
                b = !str.equals("tt_playable_btn_bk") ? (byte) -1 : (byte) 11;
                break;
            case -1163545839:
                b = !str.equals("tt_dislike_bottom_seletor") ? (byte) -1 : (byte) 12;
                break;
            case -1150582740:
                b = !str.equals("tt_seek_thumb_fullscreen") ? (byte) -1 : (byte) 13;
                break;
            case -1147412691:
                b = !str.equals("tt_custom_dialog_bg") ? (byte) -1 : (byte) 14;
                break;
            case -1107858393:
                b = !str.equals("tt_ad_loading_three_mid") ? (byte) -1 : (byte) 15;
                break;
            case -876774215:
                b = !str.equals("tt_close_move_detail") ? (byte) -1 : (byte) 16;
                break;
            case -875200849:
                b = !str.equals("tt_mute_btn_bg") ? (byte) -1 : (byte) 17;
                break;
            case -847552402:
                b = !str.equals("tt_seek_thumb") ? (byte) -1 : (byte) 18;
                break;
            case -561153052:
                b = !str.equals("tt_reward_countdown_bg") ? (byte) -1 : (byte) 19;
                break;
            case -508263579:
                b = !str.equals("tt_play_movebar_textpage") ? (byte) -1 : (byte) 20;
                break;
            case -473198695:
                b = !str.equals("tt_refreshing_video_textpage") ? (byte) -1 : (byte) 21;
                break;
            case -404284879:
                b = !str.equals("tt_playable_progress_style") ? (byte) -1 : (byte) 22;
                break;
            case -292612462:
                b = !str.equals("tt_seek_thumb_fullscreen_selector") ? (byte) -1 : (byte) 23;
                break;
            case -226695937:
                b = !str.equals("tt_ad_landing_loading_three_mid") ? (byte) -1 : (byte) 24;
                break;
            case -154809169:
                b = !str.equals("tt_pangle_ad_mute_btn_bg") ? (byte) -1 : (byte) 25;
                break;
            case -97103333:
                b = !str.equals("tt_video_black_desc_gradient") ? (byte) -1 : (byte) 26;
                break;
            case 16094728:
                b = !str.equals("tt_ad_loading_three_left") ? (byte) -1 : (byte) 27;
                break;
            case 27541452:
                b = !str.equals("tt_mute_wrapper") ? (byte) -1 : (byte) 28;
                break;
            case 57270120:
                b = !str.equals("tt_dislike_top_bg") ? (byte) -1 : (byte) 29;
                break;
            case 106179457:
                b = !str.equals("tt_comment_tv") ? (byte) -1 : (byte) 30;
                break;
            case 242455215:
                b = !str.equals("tt_reward_full_new_bar_bg") ? (byte) -1 : (byte) 31;
                break;
            case 247520514:
                b = !str.equals("tt_reward_full_video_backup_btn_bg") ? (byte) -1 : (byte) 32;
                break;
            case 310787585:
                b = !str.equals("tt_full_reward_loading_progress_style") ? (byte) -1 : (byte) 33;
                break;
            case 314734139:
                b = !str.equals("tt_detail_video_btn_bg") ? (byte) -1 : (byte) 34;
                break;
            case 410262782:
                b = !str.equals("tt_pangle_banner_btn_bg") ? (byte) -1 : (byte) 35;
                break;
            case 484030064:
                b = !str.equals("tt_seek_thumb_fullscreen_press") ? (byte) -1 : (byte) 36;
                break;
            case 494589792:
                b = !str.equals("tt_browser_download_selector") ? (byte) -1 : (byte) 37;
                break;
            case 504597563:
                b = !str.equals("tt_ad_loading_three_right") ? (byte) -1 : (byte) 38;
                break;
            case 507305701:
                b = !str.equals("tt_pangle_btn_bg") ? (byte) -1 : (byte) 39;
                break;
            case 708409173:
                b = !str.equals("tt_privacy_progress_style") ? (byte) -1 : (byte) 40;
                break;
            case 991946046:
                b = !str.equals("tt_privacy_btn_bg") ? (byte) -1 : (byte) 41;
                break;
            case 1054661938:
                b = !str.equals("tt_seek_thumb_press") ? (byte) -1 : (byte) 42;
                break;
            case 1094767909:
                b = !str.equals("tt_unmute_wrapper") ? (byte) -1 : (byte) 43;
                break;
            case 1115144587:
                b = !str.equals("tt_titlebar_close_seletor_for_dark") ? (byte) -1 : (byte) 44;
                break;
            case 1193160467:
                b = !str.equals("tt_ad_landing_loading_three_right") ? (byte) -1 : (byte) 45;
                break;
            case 1234814491:
                b = !str.equals("tt_landingpage_loading_text_rect") ? (byte) -1 : (byte) 46;
                break;
            case 1241312517:
                b = !str.equals("tt_shadow_btn_back_withoutnight") ? (byte) -1 : (byte) 47;
                break;
            case 1360033453:
                b = !str.equals("tt_circle_solid_mian") ? (byte) -1 : (byte) 48;
                break;
            case 1391934389:
                b = !str.equals("tt_browser_progress_style") ? (byte) -1 : (byte) 49;
                break;
            case 1459143575:
                b = !str.equals("tt_download_corner_bg") ? (byte) -1 : (byte) 50;
                break;
            case 1473061455:
                b = !str.equals("tt_ad_report_info_button_bg") ? (byte) -1 : (byte) 51;
                break;
            case 1562327088:
                b = !str.equals("tt_ad_landing_loading_three_left") ? (byte) -1 : (byte) 52;
                break;
            case 1635801742:
                b = !str.equals("tt_pangle_ad_close_btn_bg") ? (byte) -1 : (byte) 53;
                break;
            case 1733712735:
                b = !str.equals("tt_lefterbackicon_titlebar_press_wrapper") ? (byte) -1 : (byte) 54;
                break;
            case 1859118378:
                b = !str.equals("tt_reward_video_download_btn_bg") ? (byte) -1 : (byte) 55;
                break;
            case 1908435428:
                b = !str.equals("tt_ad_loading_rect") ? (byte) -1 : (byte) 56;
                break;
            case 1967077738:
                b = !str.equals("tt_shadow_btn_back") ? (byte) -1 : (byte) 57;
                break;
            case 1986221289:
                b = !str.equals("tt_dislike_top_seletor") ? (byte) -1 : (byte) 58;
                break;
            case 1987199879:
                b = !str.equals("tt_video_loading_progress_bar") ? (byte) -1 : (byte) 59;
                break;
            case 1995246663:
                b = !str.equals("tt_ad_skip_btn_bg2") ? (byte) -1 : (byte) 60;
                break;
            case 2051103617:
                b = !str.equals("tt_privacy_webview_bg") ? (byte) -1 : kotlin.io.encoding.Base64.padSymbol;
                break;
            case 2091139328:
                b = !str.equals("tt_titlebar_close_seletor") ? (byte) -1 : (byte) 62;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                drawableBg = bg(com.bytedance.sdk.component.utils.Fy.bX(context, "tt_lefterbackicon_titlebar_press_for_dark"), com.bytedance.sdk.component.utils.Fy.bX(context, "tt_lefterbackicon_titlebar_for_dark"));
                break;
            case 1:
                drawableBg = bg(0, -1, new int[]{com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 8.0f)}, null, null, null);
                break;
            case 2:
                drawableBg = bg(com.bytedance.sdk.component.utils.Fy.bX(context, "tt_white_lefterbackicon_titlebar_press"), com.bytedance.sdk.component.utils.Fy.bX(context, "tt_white_lefterbackicon_titlebar"));
                break;
            case 3:
                layerDrawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{bg(0, java.lang.Integer.valueOf(android.graphics.Color.parseColor("#A5FFFFFF")), new int[]{com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 1.5f)}, new int[]{-1, com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 1.0f)}, null, null), new android.graphics.drawable.ClipDrawable(bg(0, -1, new int[]{com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 1.5f)}, new int[]{-1, com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 1.0f)}, null, null), androidx.core.view.GravityCompat.START, 1), new android.graphics.drawable.ClipDrawable(bg(0, java.lang.Integer.valueOf(android.graphics.Color.parseColor("#fff85959")), new int[]{com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 1.5f)}, new int[]{-1, com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 1.0f)}, null, null), androidx.core.view.GravityCompat.START, 1)});
                drawableBg = layerDrawable;
                break;
            case 4:
                drawableBg = bg(bg(0, java.lang.Integer.valueOf(com.bytedance.sdk.component.utils.Fy.iR(context, "tt_fde6e6e6")), null, null, null, null), bg(0, java.lang.Integer.valueOf(com.bytedance.sdk.component.utils.Fy.iR(context, "tt_fdffffff")), null, null, null, null));
                break;
            case 5:
                drawableBg = bg(bg(0, java.lang.Integer.valueOf(com.bytedance.sdk.component.utils.Fy.iR(context, "tt_2a90d7")), new int[]{com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 6.0f)}, null, java.lang.Integer.valueOf(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 1.0f)), java.lang.Integer.valueOf(com.bytedance.sdk.component.utils.Fy.iR(context, "@color/tt_7f2a90d7"))), bg(0, java.lang.Integer.valueOf(com.bytedance.sdk.component.utils.Fy.iR(context, "tt_2a90d7")), new int[]{com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 6.0f)}, null, java.lang.Integer.valueOf(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 1.0f)), java.lang.Integer.valueOf(com.bytedance.sdk.component.utils.Fy.iR(context, "@color/tt_2a90d7"))));
                break;
            case 6:
                drawableBg = com.bytedance.sdk.component.utils.Fy.bX(context, "tt_lefterbackicon_titlebar");
                break;
            case 7:
                drawableBg = bg(1, -1, null, new int[]{com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 15.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 15.0f)}, java.lang.Integer.valueOf(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 1.0f)), 0);
                break;
            case 8:
                drawableBg = bg(com.bytedance.sdk.component.utils.Fy.bX(context, "tt_new_pause_video_press"), com.bytedance.sdk.component.utils.Fy.bX(context, "tt_new_pause_video"));
                break;
            case 9:
                drawableBg = bg(bg(0, java.lang.Integer.valueOf(android.graphics.Color.parseColor("#33f32830")), new int[]{com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 4.0f)}, null, null, null), bg(0, java.lang.Integer.valueOf(android.graphics.Color.parseColor("#f32830")), new int[]{com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 4.0f)}, null, null, null));
                break;
            case 10:
                drawableBg = bg(0, -1, new int[]{com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 12.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 12.0f), 0, 0}, null, null, null);
                break;
            case 11:
                drawableBg = bg(0, java.lang.Integer.valueOf(com.bytedance.sdk.component.utils.Fy.iR(context, "tt_00000000")), new int[]{com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 30.0f)}, null, java.lang.Integer.valueOf(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 1.0f)), -1);
                break;
            case 12:
                drawableBg = bg(bg(0, java.lang.Integer.valueOf(com.bytedance.sdk.component.utils.Fy.iR(context, "tt_fde6e6e6")), new int[]{0, 0, com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 5.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 5.0f)}, null, null, null), bg(0, java.lang.Integer.valueOf(com.bytedance.sdk.component.utils.Fy.iR(context, "tt_fdffffff")), new int[]{0, 0, com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 5.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 5.0f)}, null, null, null));
                break;
            case 13:
                drawableBg = bg(1, -1, null, new int[]{com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 18.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 18.0f)}, null, null);
                break;
            case 14:
                drawableBg = bg(0, -1, new int[]{com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 6.0f)}, null, java.lang.Integer.valueOf(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 0.8f)), -1);
                break;
            case 15:
                drawableBg = bg(0, null, null, null, java.lang.Integer.valueOf(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 1.5f)), -1);
                break;
            case 16:
                drawableBg = bg(com.bytedance.sdk.component.utils.Fy.bX(context, "tt_close_move_details_pressed"), com.bytedance.sdk.component.utils.Fy.bX(context, "tt_close_move_details_normal"));
                break;
            case 17:
                drawableBg = bg(1, java.lang.Integer.valueOf(android.graphics.Color.parseColor("#99333333")), null, new int[]{com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 28.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 28.0f)}, null, null);
                break;
            case 18:
                drawableBg = bg(bg(1, -1, null, new int[]{com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 22.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 22.0f)}, java.lang.Integer.valueOf(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 1.0f)), 0), bg(1, -1, null, new int[]{com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 15.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 15.0f)}, java.lang.Integer.valueOf(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 1.0f)), 0));
                break;
            case 19:
                drawableBg = bg(1, java.lang.Integer.valueOf(android.graphics.Color.parseColor("#99333333")), null, new int[]{com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 28.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 28.0f)}, null, null);
                break;
            case 20:
                drawableBg = bg(com.bytedance.sdk.component.utils.Fy.bX(context, "tt_new_play_video"), com.bytedance.sdk.component.utils.Fy.bX(context, "tt_new_play_video"));
                break;
            case 21:
                drawableBg = bg(com.bytedance.sdk.component.utils.Fy.bX(context, "tt_refreshing_video_textpage_pressed"), com.bytedance.sdk.component.utils.Fy.bX(context, "tt_refreshing_video_textpage_normal"));
                break;
            case 22:
                layerDrawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{bg(0, java.lang.Integer.valueOf(android.graphics.Color.parseColor("#4DFC625C")), new int[]{com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 3.0f)}, null, null, null), new android.graphics.drawable.ClipDrawable(bg(0, java.lang.Integer.valueOf(android.graphics.Color.parseColor("#FC625C")), new int[]{com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 3.0f)}, null, null, null), androidx.core.view.GravityCompat.START, 1)});
                drawableBg = layerDrawable;
                break;
            case 23:
                drawableBg = bg(bg(1, -1, null, new int[]{com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 18.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 18.0f)}, java.lang.Integer.valueOf(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 1.0f)), 0), bg(1, -1, null, new int[]{com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 18.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 18.0f)}, java.lang.Integer.valueOf(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 1.0f)), 0));
                break;
            case 24:
                drawableBg = bg(0, null, null, null, java.lang.Integer.valueOf(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 1.5f)), java.lang.Integer.valueOf(android.graphics.Color.parseColor("#ABACB0")));
                break;
            case 25:
                drawableBg = bg(1, java.lang.Integer.valueOf(android.graphics.Color.parseColor("#99333333")), null, new int[]{com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 28.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 28.0f)}, null, null);
                break;
            case 26:
                android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setGradientType(0);
                gradientDrawable.setColors(new int[]{com.bytedance.sdk.component.utils.Fy.iR(context, "tt_ff1a1a1a"), com.bytedance.sdk.component.utils.Fy.iR(context, "tt_00000000")});
                gradientDrawable.setOrientation(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM);
                layerDrawable = gradientDrawable;
                drawableBg = layerDrawable;
                break;
            case 27:
                drawableBg = bg(0, null, new int[]{com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 6.0f), 0, 0, com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 6.0f)}, null, java.lang.Integer.valueOf(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 1.5f)), -1);
                break;
            case 28:
                android.graphics.drawable.Drawable drawableBX = com.bytedance.sdk.component.utils.Fy.bX(context, "tt_mute");
                android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
                stateListDrawable.addState(new int[0], drawableBX);
                stateListDrawable.setAutoMirrored(true);
                layerDrawable = stateListDrawable;
                drawableBg = layerDrawable;
                break;
            case 29:
                drawableBg = bg(0, java.lang.Integer.valueOf(com.bytedance.sdk.component.utils.Fy.iR(context, "tt_fdffffff")), new int[]{com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 5.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 5.0f), 0, 0}, null, null, null);
                break;
            case 30:
                drawableBg = bg(0, -1, new int[]{com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 4.0f)}, null, java.lang.Integer.valueOf(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 1.0f)), java.lang.Integer.valueOf(android.graphics.Color.parseColor("#0F161823")));
                break;
            case 31:
                drawableBg = bg(0, java.lang.Integer.valueOf(android.graphics.Color.parseColor("#ccffffff")), new int[]{com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 18.0f)}, null, null, null);
                break;
            case 32:
                drawableBg = bg(0, java.lang.Integer.valueOf(android.graphics.Color.parseColor("#ff0088ff")), new int[]{com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 6.0f)}, null, null, null);
                break;
            case 33:
                android.graphics.drawable.GradientDrawable gradientDrawableBg = bg(0, java.lang.Integer.valueOf(android.graphics.Color.parseColor("#EAEAEA")), new int[]{com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 50.0f)}, null, null, null);
                android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 15.0f));
                gradientDrawable2.setColors(new int[]{android.graphics.Color.parseColor("#1A73E8"), android.graphics.Color.parseColor("#569FFF")});
                gradientDrawable2.setGradientType(0);
                gradientDrawable2.setOrientation(android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP);
                drawableBg = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{gradientDrawableBg, new android.graphics.drawable.ScaleDrawable(gradientDrawable2, androidx.core.view.GravityCompat.START, 1.0f, -1.0f)});
                break;
            case 34:
                drawableBg = bg(0, java.lang.Integer.valueOf(android.graphics.Color.parseColor("#26000000")), new int[]{com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 4.0f)}, null, null, null);
                break;
            case 35:
                drawableBg = bg(0, java.lang.Integer.valueOf(android.graphics.Color.parseColor("#ff2f87f8")), new int[]{com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 2.0f)}, new int[]{com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 98.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 25.0f)}, null, null);
                break;
            case 36:
                drawableBg = bg(1, -1, null, new int[]{com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 18.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 18.0f)}, java.lang.Integer.valueOf(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 1.0f)), 0);
                break;
            case 37:
                drawableBg = bg(bg(0, java.lang.Integer.valueOf(android.graphics.Color.parseColor("#2582c3")), null, null, null, null), bg(0, java.lang.Integer.valueOf(android.graphics.Color.parseColor("#2a90d7")), null, null, null, null));
                break;
            case 38:
                drawableBg = bg(0, null, new int[]{0, com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 6.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 6.0f), 0}, null, java.lang.Integer.valueOf(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 1.5f)), -1);
                break;
            case 39:
                android.graphics.drawable.GradientDrawable gradientDrawable3 = new android.graphics.drawable.GradientDrawable();
                gradientDrawable3.setShape(0);
                gradientDrawable3.setSize(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 280.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 38.0f));
                gradientDrawable3.setCornerRadius(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 19.0f));
                gradientDrawable3.setOrientation(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT);
                gradientDrawable3.setColors(new int[]{android.graphics.Color.parseColor("#fff02d42"), android.graphics.Color.parseColor("#fffc4b3c")});
                gradientDrawable3.setGradientType(0);
                gradientDrawable3.setUseLevel(true);
                layerDrawable = gradientDrawable3;
                drawableBg = layerDrawable;
                break;
            case 40:
                drawableBg = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{bg(0, java.lang.Integer.valueOf(android.graphics.Color.parseColor("#33007AFF")), null, null, null, null), new android.graphics.drawable.ClipDrawable(bg(0, java.lang.Integer.valueOf(android.graphics.Color.parseColor("#007AFF")), null, null, null, null), androidx.core.view.GravityCompat.START, 1)});
                break;
            case 41:
                android.graphics.drawable.GradientDrawable gradientDrawable4 = new android.graphics.drawable.GradientDrawable();
                gradientDrawable4.setShape(0);
                gradientDrawable4.setSize(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 258.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 43.0f));
                gradientDrawable4.setCornerRadius(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 22.0f));
                gradientDrawable4.setColors(new int[]{android.graphics.Color.parseColor("#73CBFC"), android.graphics.Color.parseColor("#3F9CF7")});
                gradientDrawable4.setGradientType(0);
                layerDrawable = gradientDrawable4;
                drawableBg = layerDrawable;
                break;
            case 42:
                drawableBg = bg(1, -1, null, new int[]{com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 22.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 22.0f)}, java.lang.Integer.valueOf(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 1.0f)), 0);
                break;
            case 43:
                android.graphics.drawable.Drawable drawableBX2 = com.bytedance.sdk.component.utils.Fy.bX(context, "tt_unmute");
                android.graphics.drawable.StateListDrawable stateListDrawable2 = new android.graphics.drawable.StateListDrawable();
                stateListDrawable2.addState(new int[0], drawableBX2);
                stateListDrawable2.setAutoMirrored(true);
                layerDrawable = stateListDrawable2;
                drawableBg = layerDrawable;
                break;
            case 44:
                drawableBg = bg(com.bytedance.sdk.component.utils.Fy.bX(context, "tt_titlebar_close_press_for_dark"), com.bytedance.sdk.component.utils.Fy.bX(context, "tt_titlebar_close_for_dark"));
                break;
            case 45:
                drawableBg = bg(0, null, new int[]{0, com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 6.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 6.0f), 0}, null, java.lang.Integer.valueOf(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 1.5f)), java.lang.Integer.valueOf(android.graphics.Color.parseColor("#ABACB0")));
                break;
            case 46:
                drawableBg = bg(0, java.lang.Integer.valueOf(android.graphics.Color.parseColor("#141A73E8")), new int[]{com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 5.0f)}, null, null, null);
                break;
            case 47:
                android.graphics.drawable.Drawable drawableBX3 = com.bytedance.sdk.component.utils.Fy.bX(context, "tt_shadow_lefterback_titlebar_press_withoutnight");
                android.graphics.drawable.StateListDrawable stateListDrawableBg = bg(drawableBX3, com.bytedance.sdk.component.utils.Fy.bX(context, "tt_shadow_lefterback_titlebar_withoutnight"));
                stateListDrawableBg.addState(new int[]{-16842910}, drawableBX3);
                drawableBg = stateListDrawableBg;
                break;
            case 48:
                drawableBg = bg(1, java.lang.Integer.valueOf(com.bytedance.sdk.component.utils.Fy.iR(context, "tt_e0e0e0")), null, null, null, null);
                break;
            case 49:
                drawableBg = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{bg(0, -1, new int[]{0}, null, null, null), new android.graphics.drawable.ClipDrawable(bg(0, java.lang.Integer.valueOf(android.graphics.Color.parseColor("#1A73E8")), new int[]{0}, null, null, null), 3, 1)});
                break;
            case 50:
                drawableBg = bg(0, java.lang.Integer.valueOf(com.bytedance.sdk.component.utils.Fy.iR(context, "tt_4a90e2")), new int[]{com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 4.0f)}, null, null, null);
                break;
            case 51:
                drawableBg = bg(bg(0, java.lang.Integer.valueOf(android.graphics.Color.parseColor("#0D000000")), new int[]{com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 2.0f)}, null, java.lang.Integer.valueOf(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 1.0f)), java.lang.Integer.valueOf(android.graphics.Color.parseColor("#1F000000"))), bg(0, -1, new int[]{com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 2.0f)}, null, java.lang.Integer.valueOf(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 1.0f)), java.lang.Integer.valueOf(android.graphics.Color.parseColor("#1618231F"))));
                break;
            case 52:
                drawableBg = bg(0, null, new int[]{com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 6.0f), 0, 0, com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 6.0f)}, null, java.lang.Integer.valueOf(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 1.5f)), java.lang.Integer.valueOf(android.graphics.Color.parseColor("#ABACB0")));
                break;
            case 53:
                drawableBg = bg(1, java.lang.Integer.valueOf(android.graphics.Color.parseColor("#30333333")), null, new int[]{com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 28.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 28.0f)}, null, null);
                break;
            case 54:
                android.graphics.drawable.Drawable drawableBX4 = com.bytedance.sdk.component.utils.Fy.bX(context, "tt_lefterbackicon_titlebar_press");
                android.graphics.drawable.StateListDrawable stateListDrawable3 = new android.graphics.drawable.StateListDrawable();
                stateListDrawable3.addState(new int[0], drawableBX4);
                stateListDrawable3.setAutoMirrored(true);
                layerDrawable = stateListDrawable3;
                drawableBg = layerDrawable;
                break;
            case 55:
                drawableBg = bg(0, java.lang.Integer.valueOf(android.graphics.Color.parseColor("#ff007aff")), new int[]{com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 18.0f)}, null, null, null);
                break;
            case 56:
                drawableBg = bg(0, java.lang.Integer.valueOf(android.graphics.Color.parseColor("#33FFFFFF")), new int[]{com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 15.0f)}, null, null, null);
                break;
            case 57:
                android.graphics.drawable.Drawable drawableBX5 = com.bytedance.sdk.component.utils.Fy.bX(context, "tt_shadow_lefterback_titlebar_press");
                android.graphics.drawable.StateListDrawable stateListDrawableBg2 = bg(drawableBX5, com.bytedance.sdk.component.utils.Fy.bX(context, "tt_shadow_lefterback_titlebar"));
                stateListDrawableBg2.addState(new int[]{-16842910}, drawableBX5);
                drawableBg = stateListDrawableBg2;
                break;
            case 58:
                drawableBg = bg(bg(0, java.lang.Integer.valueOf(com.bytedance.sdk.component.utils.Fy.iR(context, "tt_fde6e6e6")), new int[]{com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 5.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 5.0f), 0, 0}, null, null, null), bg(0, java.lang.Integer.valueOf(com.bytedance.sdk.component.utils.Fy.iR(context, "tt_fdffffff")), new int[]{com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 5.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 5.0f), 0, 0}, null, null, null));
                break;
            case 59:
                android.graphics.drawable.RotateDrawable rotateDrawable = new android.graphics.drawable.RotateDrawable();
                rotateDrawable.setDrawable(com.bytedance.sdk.component.utils.Fy.bX(context, "tt_normalscreen_loading"));
                rotateDrawable.setFromDegrees(0.0f);
                rotateDrawable.setToDegrees(360.0f);
                rotateDrawable.setPivotX(0.5f);
                rotateDrawable.setPivotY(0.5f);
                layerDrawable = rotateDrawable;
                drawableBg = layerDrawable;
                break;
            case 60:
                drawableBg = bg(0, java.lang.Integer.valueOf(android.graphics.Color.parseColor("#66161823")), new int[]{com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 14.0f)}, null, null, null);
                break;
            case 61:
                drawableBg = bg(0, -1, new int[]{com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 14.5f)}, null, null, null);
                break;
            case 62:
                drawableBg = com.bytedance.sdk.component.utils.Fy.bX(context, "tt_titlebar_close_drawable");
                break;
            default:
                drawableBg = null;
                break;
        }
        if (z) {
            bg.put(str, new android.util.Pair<>(drawableBg, 1));
        }
        return drawableBg;
    }

    private static void bg() {
        java.util.Map<java.lang.String, android.util.Pair<? extends android.graphics.drawable.Drawable, java.lang.Integer>> map = bg;
        if (map.size() < IL.intValue()) {
            return;
        }
        java.lang.String key = null;
        int iIntValue = Integer.MAX_VALUE;
        for (java.util.Map.Entry<java.lang.String, android.util.Pair<? extends android.graphics.drawable.Drawable, java.lang.Integer>> entry : map.entrySet()) {
            if (((java.lang.Integer) entry.getValue().second).intValue() < iIntValue) {
                key = entry.getKey();
                iIntValue = ((java.lang.Integer) entry.getValue().second).intValue();
                if (iIntValue == 1) {
                    break;
                }
            }
        }
        bg.remove(key);
    }

    private static android.graphics.drawable.GradientDrawable bg(int i, java.lang.Integer num, int[] iArr, int[] iArr2, java.lang.Integer num2, java.lang.Integer num3) {
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(i);
        if (num != null) {
            gradientDrawable.setColor(num.intValue());
        }
        int length = iArr != null ? iArr.length : 0;
        if (length == 1) {
            gradientDrawable.setCornerRadius(iArr[0]);
        } else if (length == 4) {
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int i5 = iArr[3];
            gradientDrawable.setCornerRadii(new float[]{i2, i2, i3, i3, i4, i4, i5, i5});
        }
        if (iArr2 != null && iArr2.length == 2) {
            gradientDrawable.setSize(iArr2[0], iArr2[1]);
        }
        if (num2 != null && num3 != null) {
            gradientDrawable.setStroke(num2.intValue(), num3.intValue());
        }
        return gradientDrawable;
    }

    private static android.graphics.drawable.StateListDrawable bg(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2) {
        android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
        if (drawable != null) {
            stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, drawable);
        }
        if (drawable2 != null) {
            stateListDrawable.addState(new int[0], drawable2);
        }
        return stateListDrawable;
    }

    public static android.graphics.drawable.Drawable bg(android.content.Context context, int i) {
        return bg(context, android.graphics.Color.parseColor("#1A73E8"), i);
    }

    public static android.graphics.drawable.Drawable bg(android.content.Context context, int i, int i2) {
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, i2));
        return gradientDrawable;
    }
}
