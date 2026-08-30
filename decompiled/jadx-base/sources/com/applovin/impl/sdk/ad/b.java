package com.applovin.impl.sdk.ad;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b extends com.applovin.impl.sdk.ad.AppLovinAdImpl implements com.applovin.impl.hh {
    private final java.util.List f;
    private final java.util.concurrent.atomic.AtomicBoolean g;
    private final java.util.concurrent.atomic.AtomicBoolean h;
    private final java.util.concurrent.atomic.AtomicReference i;
    private final android.os.Bundle j;
    private com.applovin.impl.sdk.ad.b.d k;

    /* JADX INFO: renamed from: com.applovin.impl.sdk.ad.b$b, reason: collision with other inner class name */
    public enum EnumC0052b {
        UNSPECIFIED,
        DISMISS,
        DO_NOT_DISMISS
    }

    public enum c {
        DEFAULT,
        ACTIVITY_PORTRAIT,
        ACTIVITY_LANDSCAPE
    }

    public class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1280a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        private d() {
            this.f1280a = com.applovin.sdk.AppLovinSdkUtils.dpToPx(com.applovin.impl.sdk.j.m(), com.applovin.impl.sdk.ad.b.this.m());
            this.b = com.applovin.sdk.AppLovinSdkUtils.dpToPx(com.applovin.impl.sdk.j.m(), com.applovin.impl.sdk.ad.b.this.o());
            this.c = com.applovin.sdk.AppLovinSdkUtils.dpToPx(com.applovin.impl.sdk.j.m(), com.applovin.impl.sdk.ad.b.this.k());
            this.d = com.applovin.sdk.AppLovinSdkUtils.dpToPx(com.applovin.impl.sdk.j.m(), ((java.lang.Integer) ((com.applovin.impl.sdk.AppLovinAdBase) com.applovin.impl.sdk.ad.b.this).sdk.a(com.applovin.impl.sj.q1)).intValue());
            this.e = com.applovin.sdk.AppLovinSdkUtils.dpToPx(com.applovin.impl.sdk.j.m(), ((java.lang.Integer) ((com.applovin.impl.sdk.AppLovinAdBase) com.applovin.impl.sdk.ad.b.this).sdk.a(com.applovin.impl.sj.p1)).intValue());
        }
    }

    public enum e {
        RESIZE_ASPECT,
        TOP,
        BOTTOM,
        LEFT,
        RIGHT
    }

    public b(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.applovin.impl.sdk.j jVar) {
        super(jSONObject, jSONObject2, jVar);
        this.f = com.applovin.impl.sdk.utils.CollectionUtils.synchronizedList();
        this.g = new java.util.concurrent.atomic.AtomicBoolean();
        this.h = new java.util.concurrent.atomic.AtomicBoolean();
        this.i = new java.util.concurrent.atomic.AtomicReference();
        this.j = new android.os.Bundle();
    }

    private java.util.List K() {
        return getIntegerListFromAdObject("multi_close_style", null);
    }

    private java.lang.String q0() {
        java.lang.String stringFromAdObject = getStringFromAdObject("video_end_url", null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace("{CLCODE}", getClCode());
        }
        return null;
    }

    public java.util.List A() {
        return getStringListFromAdObject("custom_tabs_warmup_urls", java.util.Collections.emptyList());
    }

    public boolean A0() {
        return getBooleanFromAdObject("lhs_close_button", (java.lang.Boolean) this.sdk.a(com.applovin.impl.sj.S1));
    }

    public boolean B() {
        return getBooleanFromAdObject("dismiss_on_skip", java.lang.Boolean.FALSE);
    }

    public boolean B0() {
        return getBooleanFromAdObject("custom_tabs_client_warmup_enabled", java.lang.Boolean.FALSE);
    }

    public int C() {
        return getIntFromAdObject("poststitial_dismiss_forward_delay_millis", -1);
    }

    public boolean C0() {
        return getBooleanFromAdObject("custom_tabs_enabled", java.lang.Boolean.FALSE);
    }

    public int D() {
        return getIntFromAdObject("poststitial_shown_forward_delay_millis", -1);
    }

    public boolean D0() {
        return getBooleanFromAdObject("forward_lifecycle_events_to_webview", java.lang.Boolean.FALSE);
    }

    public int E() {
        return com.applovin.impl.yp.a(getIntFromAdObject("graphic_completion_percent", -1), 90);
    }

    public boolean E0() {
        return getBooleanFromAdObject("gase", java.lang.Boolean.FALSE);
    }

    public java.util.List F() {
        java.util.List listA;
        com.applovin.impl.tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (java.util.List) tlVar.a(new androidx.arch.core.util.Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda13
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return this.f$0.l((com.applovin.impl.tl) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = com.applovin.impl.yp.a(getJsonObjectFromAdObject("imp_urls", new org.json.JSONObject()), getClCode(), null, null, R(), V0(), this.sdk);
        }
        return listA;
    }

    public boolean F0() {
        return getBooleanFromAdObject("lock_current_orientation", java.lang.Boolean.FALSE);
    }

    public int G() {
        return getIntFromAdObject("mdafra", ((java.lang.Integer) this.sdk.a(com.applovin.impl.sj.U0)).intValue());
    }

    public abstract boolean G0();

    public boolean H() {
        return getBooleanFromAdObject("playback_requires_user_action", java.lang.Boolean.TRUE);
    }

    public java.util.concurrent.atomic.AtomicBoolean H0() {
        return this.g;
    }

    public java.lang.String I() {
        return getStringFromFullResponse("event_id", null);
    }

    public boolean I0() {
        return getBooleanFromAdObject("lhs_skip_button", (java.lang.Boolean) this.sdk.a(com.applovin.impl.sj.f2));
    }

    public java.util.List J() {
        java.util.List listK = K();
        if (listK == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(listK.size());
        java.util.Iterator it = listK.iterator();
        while (it.hasNext()) {
            arrayList.add(a(((java.lang.Integer) it.next()).intValue()));
        }
        return arrayList;
    }

    public boolean J0() {
        return getBooleanFromAdObject("video_clickable", java.lang.Boolean.FALSE);
    }

    public abstract boolean K0();

    public java.util.List L() {
        return getIntegerListFromAdObject("multi_close_delay_graphic", null);
    }

    public boolean L0() {
        return getBooleanFromAdObject("web_contents_debugging_enabled", java.lang.Boolean.valueOf(com.applovin.impl.yp.h(com.applovin.impl.sdk.j.m()) || com.applovin.impl.yp.f(com.applovin.impl.sdk.j.m()) || ((java.lang.Boolean) this.sdk.a(com.applovin.impl.sj.f6)).booleanValue()));
    }

    public android.net.Uri M() {
        java.lang.String stringFromAdObject = getStringFromAdObject("mute_image", "https://assets.applovin.com/sound_off.png");
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(stringFromAdObject)) {
            return android.net.Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public boolean M0() {
        return getBooleanFromAdObject("web_video", java.lang.Boolean.FALSE);
    }

    public java.lang.String N() {
        return getStringFromAdObject("nia_button_title", "");
    }

    public abstract void N0();

    public java.lang.String O() {
        return getStringFromAdObject("nia_message", "");
    }

    public boolean O0() {
        return getBooleanFromAdObject("should_apply_mute_setting_to_poststitial", java.lang.Boolean.FALSE);
    }

    public java.lang.String P() {
        return getStringFromAdObject("nia_title", "");
    }

    public boolean P0() {
        return getBooleanFromAdObject("should_apply_web_view_settings_to_web_view_button", (java.lang.Boolean) this.sdk.a(com.applovin.impl.sj.j6));
    }

    public abstract java.lang.String Q();

    public boolean Q0() {
        com.applovin.impl.tl tlVar = this.synchronizedAdObject;
        return tlVar != null ? ((java.lang.Boolean) tlVar.a(new androidx.arch.core.util.Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda25
            @Override // androidx.arch.core.util.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.applovin.impl.sdk.ad.b.t((com.applovin.impl.tl) obj);
            }
        })).booleanValue() : com.applovin.impl.sdk.utils.JsonUtils.getBoolean(getJsonObjectFromAdObject("video_button_properties", null), "should_cache_video_button_html_assets", java.lang.Boolean.FALSE).booleanValue();
    }

    public java.util.Map R() {
        java.util.HashMap map = new java.util.HashMap();
        try {
            com.applovin.impl.tl tlVar = this.synchronizedAdObject;
            map.putAll(tlVar != null ? (java.util.Map) tlVar.a(new androidx.arch.core.util.Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda15
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return com.applovin.impl.sdk.ad.b.m((com.applovin.impl.tl) obj);
                }
            }) : com.applovin.impl.sdk.utils.JsonUtils.toStringMap(getJsonObjectFromAdObject("http_headers_for_postbacks", new org.json.JSONObject())));
        } catch (org.json.JSONException e2) {
            this.sdk.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.sdk.I().a("DirectAd", "Failed to retrieve http headers for postbacks", e2);
            }
        }
        if (getBooleanFromAdObject("use_webview_ua_for_postbacks", java.lang.Boolean.FALSE)) {
            map.put(com.google.common.net.HttpHeaders.USER_AGENT, com.applovin.impl.sr.a());
        }
        return map;
    }

    public boolean R0() {
        com.applovin.impl.tl tlVar = this.synchronizedAdObject;
        return tlVar != null ? ((java.lang.Boolean) tlVar.a(new androidx.arch.core.util.Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda7
            @Override // androidx.arch.core.util.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.applovin.impl.sdk.ad.b.u((com.applovin.impl.tl) obj);
            }
        })).booleanValue() : com.applovin.impl.sdk.utils.JsonUtils.getBoolean(getJsonObjectFromAdObject("video_button_properties", null), "should_cache_video_button_html_url_contents", java.lang.Boolean.FALSE).booleanValue();
    }

    public com.applovin.impl.sdk.ad.b.EnumC0052b S() {
        java.lang.String stringFromAdObject = getStringFromAdObject("poststitial_dismiss_type", null);
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(stringFromAdObject)) {
            if ("dismiss".equalsIgnoreCase(stringFromAdObject)) {
                return com.applovin.impl.sdk.ad.b.EnumC0052b.DISMISS;
            }
            if ("no_dismiss".equalsIgnoreCase(stringFromAdObject)) {
                return com.applovin.impl.sdk.ad.b.EnumC0052b.DO_NOT_DISMISS;
            }
        }
        return com.applovin.impl.sdk.ad.b.EnumC0052b.UNSPECIFIED;
    }

    public boolean S0() {
        return this.h.get();
    }

    public int T() {
        return getColorFromAdObject("postitial_progress_bar_color", -922746881);
    }

    public boolean T0() {
        return getBooleanFromAdObject("custom_tabs_should_track_events", java.lang.Boolean.FALSE);
    }

    public long U() {
        return getLongFromAdObject("postitial_progress_bar_total_ms", -1L);
    }

    public boolean U0() {
        return getBooleanFromAdObject("serfaad", (java.lang.Boolean) this.sdk.a(com.applovin.impl.sj.T0));
    }

    public long V() {
        long longFromAdObject = getLongFromAdObject("report_reward_duration", -1L);
        if (longFromAdObject >= 0) {
            return java.util.concurrent.TimeUnit.SECONDS.toMillis(longFromAdObject);
        }
        return -1L;
    }

    public boolean V0() {
        return getBooleanFromAdObject("fire_postbacks_from_webview", java.lang.Boolean.FALSE);
    }

    public int W() {
        return getIntFromAdObject("report_reward_percent", -1);
    }

    public boolean W0() {
        return getBooleanFromAdObject("should_forward_close_button_tapped_to_poststitial", java.lang.Boolean.FALSE);
    }

    public java.util.List X() {
        java.lang.String stringFromAdObject = getStringFromAdObject("required_html_resources", null);
        return stringFromAdObject != null ? com.applovin.impl.sdk.utils.CollectionUtils.explode(stringFromAdObject) : java.util.Collections.emptyList();
    }

    public boolean X0() {
        return getBooleanFromAdObject("fmsstwvoar", java.lang.Boolean.FALSE);
    }

    public java.util.List Y() {
        java.lang.String stringFromAdObject = getStringFromAdObject("resource_cache_prefix", null);
        return stringFromAdObject != null ? com.applovin.impl.sdk.utils.CollectionUtils.explode(stringFromAdObject) : this.sdk.c(com.applovin.impl.sj.F0);
    }

    public boolean Y0() {
        return getBooleanFromAdObject("avoms", java.lang.Boolean.FALSE);
    }

    public java.util.List Z() {
        return getStringListFromAdObject("rea", X());
    }

    public boolean Z0() {
        return getBooleanFromAdObject("report_reward_percent_include_close_delay", java.lang.Boolean.TRUE);
    }

    public java.lang.String a0() {
        return getStringFromAdObject("text_rewarded_inter_alert_body", "");
    }

    public boolean a1() {
        return getBooleanFromAdObject("require_interaction_for_click", java.lang.Boolean.FALSE);
    }

    public java.lang.String b0() {
        return getStringFromAdObject("text_rewarded_inter_alert_ok_action", "OK!");
    }

    public boolean b1() {
        return getBooleanFromAdObject("sruifwvc", java.lang.Boolean.FALSE);
    }

    public java.lang.String c0() {
        return getStringFromAdObject("text_rewarded_inter_alert_title", "Watch a video to earn a reward!");
    }

    public boolean c1() {
        return getBooleanFromAdObject("respect_adview_fully_watched", java.lang.Boolean.FALSE);
    }

    public com.applovin.impl.adview.e.a d0() {
        int intFromAdObject = getIntFromAdObject("skip_style", -1);
        return intFromAdObject == -1 ? n() : a(intFromAdObject);
    }

    public boolean d1() {
        com.applovin.impl.tl tlVar = this.synchronizedAdObject;
        return tlVar != null ? ((java.lang.Boolean) tlVar.a(new androidx.arch.core.util.Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda3
            @Override // androidx.arch.core.util.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.applovin.impl.sdk.ad.b.v((com.applovin.impl.tl) obj);
            }
        })).booleanValue() : com.applovin.impl.sdk.utils.JsonUtils.getBoolean(getJsonObjectFromAdObject("video_button_properties", null), "should_respect_whitelist_when_retrieving_video_button_html_from_url", java.lang.Boolean.FALSE).booleanValue();
    }

    public java.util.List e0() {
        return getStringListFromAdObject("substrings_for_disabled_click_logic", java.util.Collections.emptyList());
    }

    public boolean e1() {
        return getBooleanFromAdObject("show_nia", java.lang.Boolean.FALSE);
    }

    public com.applovin.impl.sdk.ad.b.c f0() {
        com.applovin.impl.sdk.ad.b.c cVar = com.applovin.impl.sdk.ad.b.c.DEFAULT;
        java.lang.String upperCase = getStringFromAdObject("ad_target", cVar.toString()).toUpperCase(java.util.Locale.ENGLISH);
        if ("ACTIVITY_PORTRAIT".equalsIgnoreCase(upperCase)) {
            return com.applovin.impl.sdk.ad.b.c.ACTIVITY_PORTRAIT;
        }
        return "ACTIVITY_LANDSCAPE".equalsIgnoreCase(upperCase) ? com.applovin.impl.sdk.ad.b.c.ACTIVITY_LANDSCAPE : cVar;
    }

    public boolean f1() {
        return getBooleanFromAdObject("show_rewarded_interstitial_overlay_alert", java.lang.Boolean.valueOf(com.applovin.sdk.AppLovinAdType.AUTO_INCENTIVIZED == getType()));
    }

    public android.net.Uri g0() {
        java.lang.String stringFromAdObject = getStringFromAdObject("unmute_image", "https://assets.applovin.com/sound_on.png");
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(stringFromAdObject)) {
            return android.net.Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public boolean g1() {
        return getBooleanFromAdObject("sscomt", java.lang.Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.kg
    public abstract com.applovin.impl.lg getAdEventTracker();

    public java.lang.String getCachePrefix() {
        return getStringFromAdObject("cache_prefix", null);
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public android.os.Bundle getDirectDownloadParameters() {
        com.applovin.impl.tl tlVar = this.synchronizedAdObject;
        return tlVar != null ? (android.os.Bundle) tlVar.a(new androidx.arch.core.util.Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda1
            @Override // androidx.arch.core.util.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.applovin.impl.sdk.ad.b.k((com.applovin.impl.tl) obj);
            }
        }) : com.applovin.impl.sdk.utils.JsonUtils.toBundle(getJsonObjectFromAdObject("ah_parameters", null));
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public java.lang.String getDirectDownloadToken() {
        return getStringFromAdObject("ah_dd_token", null);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.kg
    public java.lang.String getOpenMeasurementContentUrl() {
        return getStringFromAdObject("omid_content_url", null);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.kg
    public java.lang.String getOpenMeasurementCustomReferenceData() {
        return getStringFromAdObject("omid_custom_ref_data", "");
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.kg
    public java.util.List getOpenMeasurementVerificationScriptResources() {
        java.util.List list;
        final androidx.arch.core.util.Function function = new androidx.arch.core.util.Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda0
            @Override // androidx.arch.core.util.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return this.f$0.a((org.json.JSONArray) obj);
            }
        };
        com.applovin.impl.tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (java.util.List) tlVar.a(new androidx.arch.core.util.Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda11
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return com.applovin.impl.sdk.ad.b.a(function, (com.applovin.impl.tl) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            list = (java.util.List) function.apply(getJsonArrayFromAdObject("omid_verification_script_resources", null));
        }
        return list;
    }

    public java.util.List getPrivacySandboxImpressionAttributionUrls() {
        java.util.List<java.lang.String> stringListFromAdObject = getStringListFromAdObject("privacy_sandbox_impression_attribution_urls", java.util.Collections.emptyList());
        if (stringListFromAdObject.isEmpty()) {
            return stringListFromAdObject;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(stringListFromAdObject.size());
        java.lang.String clCode = getClCode();
        java.util.Iterator<java.lang.String> it = stringListFromAdObject.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().replace("{CLCODE}", clCode));
        }
        return arrayList;
    }

    public java.lang.String h0() {
        com.applovin.impl.tl tlVar = this.synchronizedAdObject;
        return tlVar != null ? (java.lang.String) tlVar.a(new androidx.arch.core.util.Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda12
            @Override // androidx.arch.core.util.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.applovin.impl.sdk.ad.b.n((com.applovin.impl.tl) obj);
            }
        }) : com.applovin.impl.sdk.utils.JsonUtils.getString(getJsonObjectFromAdObject("video_button_properties", null), "video_button_base_url", "/");
    }

    public boolean h1() {
        return getBooleanFromAdObject("track_auto_redirects", java.lang.Boolean.FALSE);
    }

    public java.lang.String i0() {
        com.applovin.impl.tl tlVar = this.synchronizedAdObject;
        return tlVar != null ? (java.lang.String) tlVar.a(new androidx.arch.core.util.Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda6
            @Override // androidx.arch.core.util.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.applovin.impl.sdk.ad.b.o((com.applovin.impl.tl) obj);
            }
        }) : com.applovin.impl.sdk.utils.JsonUtils.getString(getJsonObjectFromAdObject("video_button_properties", null), "video_button_html", "");
    }

    public boolean i1() {
        java.lang.String str = this.sdk.f0().getExtraParameters().get("should_use_exoplayer_if_available");
        return com.applovin.impl.sdk.utils.StringUtils.isValidString(str) ? java.lang.Boolean.parseBoolean(str) : getBooleanFromAdObject("suep", java.lang.Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public boolean isDirectDownloadEnabled() {
        return com.applovin.impl.sdk.utils.StringUtils.isValidString(getDirectDownloadToken());
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.kg
    public abstract boolean isOpenMeasurementEnabled();

    public abstract android.net.Uri j();

    public java.lang.String j0() {
        com.applovin.impl.tl tlVar = this.synchronizedAdObject;
        return tlVar != null ? (java.lang.String) tlVar.a(new androidx.arch.core.util.Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda23
            @Override // androidx.arch.core.util.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.applovin.impl.sdk.ad.b.p((com.applovin.impl.tl) obj);
            }
        }) : com.applovin.impl.sdk.utils.JsonUtils.getString(getJsonObjectFromAdObject("video_button_properties", null), "video_button_html_url", "");
    }

    public boolean j1() {
        return getBooleanFromAdObject("upiosp", java.lang.Boolean.FALSE);
    }

    public abstract android.net.Uri l0();

    public long m0() {
        return getLongFromAdObject("close_delay", 0L);
    }

    public long n0() {
        return java.util.concurrent.TimeUnit.SECONDS.toMillis(getLongFromAdObject("close_delay_max_buffering_time_seconds", 5L));
    }

    public int o0() {
        return com.applovin.impl.yp.a(getIntFromAdObject("video_completion_percent", -1));
    }

    public java.util.List p0() {
        java.util.List listA;
        com.applovin.impl.tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (java.util.List) tlVar.a(new androidx.arch.core.util.Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda20
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return this.f$0.r((com.applovin.impl.tl) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = com.applovin.impl.yp.a(getJsonObjectFromAdObject("video_end_urls", new org.json.JSONObject()), getClCode(), q0(), this.sdk);
        }
        return listA;
    }

    public com.applovin.impl.sdk.ad.b.e r0() {
        java.lang.String stringFromAdObject = getStringFromAdObject("video_gravity", null);
        if ("top".equals(stringFromAdObject)) {
            return com.applovin.impl.sdk.ad.b.e.TOP;
        }
        if ("bottom".equals(stringFromAdObject)) {
            return com.applovin.impl.sdk.ad.b.e.BOTTOM;
        }
        if (androidx.media3.extractor.text.ttml.TtmlNode.LEFT.equals(stringFromAdObject)) {
            return com.applovin.impl.sdk.ad.b.e.LEFT;
        }
        return androidx.media3.extractor.text.ttml.TtmlNode.RIGHT.equals(stringFromAdObject) ? com.applovin.impl.sdk.ad.b.e.RIGHT : com.applovin.impl.sdk.ad.b.e.RESIZE_ASPECT;
    }

    public int s0() {
        return getColorFromAdObject("progress_bar_color", -922746881);
    }

    public boolean t0() {
        return getBooleanFromAdObject("progress_bar_enabled", java.lang.Boolean.FALSE);
    }

    public abstract android.net.Uri u0();

    public int v0() {
        int i;
        if (com.applovin.impl.yp.a(getSize())) {
            i = 1;
        } else {
            i = ((java.lang.Boolean) this.sdk.a(com.applovin.impl.sj.L5)).booleanValue() ? 0 : -1;
        }
        return getIntFromAdObject("whalt", i);
    }

    public java.util.List w() {
        java.util.List listA;
        com.applovin.impl.tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (java.util.List) tlVar.a(new androidx.arch.core.util.Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda5
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return this.f$0.g((com.applovin.impl.tl) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = com.applovin.impl.yp.a(getJsonObjectFromAdObject("custom_tabs_navigation_started_urls", new org.json.JSONObject()), getClCode(), (java.lang.String) null, this.sdk);
        }
        return listA;
    }

    public com.applovin.impl.adview.m w0() {
        com.applovin.impl.tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (com.applovin.impl.adview.m) tlVar.a(new androidx.arch.core.util.Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda9
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return com.applovin.impl.sdk.ad.b.s((com.applovin.impl.tl) obj);
                }
            });
        }
        org.json.JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("web_view_settings", null);
        if (jsonObjectFromAdObject != null) {
            return new com.applovin.impl.adview.m(jsonObjectFromAdObject);
        }
        return null;
    }

    public java.util.List x0() {
        return com.applovin.impl.sdk.utils.CollectionUtils.explode(getStringFromAdObject("wlh", null));
    }

    public java.util.List y() {
        java.util.List listA;
        com.applovin.impl.tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (java.util.List) tlVar.a(new androidx.arch.core.util.Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda14
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return this.f$0.i((com.applovin.impl.tl) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = com.applovin.impl.yp.a(getJsonObjectFromAdObject("custom_tabs_tab_hidden_urls", new org.json.JSONObject()), getClCode(), (java.lang.String) null, this.sdk);
        }
        return listA;
    }

    public java.util.List y0() {
        return com.applovin.impl.sdk.utils.CollectionUtils.explode(getStringFromAdObject("wls", ""));
    }

    public java.util.List z() {
        java.util.List listA;
        com.applovin.impl.tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (java.util.List) tlVar.a(new androidx.arch.core.util.Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda17
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return this.f$0.j((com.applovin.impl.tl) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = com.applovin.impl.yp.a(getJsonObjectFromAdObject("custom_tabs_tab_shown_urls", new org.json.JSONObject()), getClCode(), (java.lang.String) null, this.sdk);
        }
        return listA;
    }

    public boolean z0() {
        return getBooleanFromAdObject("bvde", (java.lang.Boolean) this.sdk.a(com.applovin.impl.sj.R5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ android.os.Bundle k(com.applovin.impl.tl tlVar) {
        return com.applovin.impl.sdk.utils.JsonUtils.toBundle(tlVar.a("ah_parameters", (org.json.JSONObject) null));
    }

    public int k() {
        return getIntFromAdObject("close_button_horizontal_margin", ((java.lang.Integer) this.sdk.a(com.applovin.impl.sj.T1)).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.String p(com.applovin.impl.tl tlVar) {
        return com.applovin.impl.sdk.utils.JsonUtils.getString(tlVar.a("video_button_properties", (org.json.JSONObject) null), "video_button_html_url", "");
    }

    public long p() {
        java.util.List listL = L();
        long longFromAdObject = getLongFromAdObject("close_delay_graphic", (listL == null || listL.size() <= 0) ? 0L : ((java.lang.Integer) listL.get(0)).intValue());
        if (longFromAdObject == -1 || longFromAdObject == -2) {
            return 0L;
        }
        return longFromAdObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Boolean u(com.applovin.impl.tl tlVar) {
        return com.applovin.impl.sdk.utils.JsonUtils.getBoolean(tlVar.a("video_button_properties", (org.json.JSONObject) null), "should_cache_video_button_html_url_contents", java.lang.Boolean.FALSE);
    }

    public java.util.List u() {
        java.util.List listA;
        com.applovin.impl.tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (java.util.List) tlVar.a(new androidx.arch.core.util.Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda21
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return this.f$0.e((com.applovin.impl.tl) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = com.applovin.impl.yp.a(getJsonObjectFromAdObject("custom_tabs_navigation_failed_urls", new org.json.JSONObject()), getClCode(), (java.lang.String) null, this.sdk);
        }
        return listA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Boolean v(com.applovin.impl.tl tlVar) {
        return com.applovin.impl.sdk.utils.JsonUtils.getBoolean(tlVar.a("video_button_properties", (org.json.JSONObject) null), "should_respect_whitelist_when_retrieving_video_button_html_from_url", java.lang.Boolean.FALSE);
    }

    public java.util.List v() {
        java.util.List listA;
        com.applovin.impl.tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (java.util.List) tlVar.a(new androidx.arch.core.util.Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda16
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return this.f$0.f((com.applovin.impl.tl) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = com.applovin.impl.yp.a(getJsonObjectFromAdObject("custom_tabs_navigation_finished_urls", new org.json.JSONObject()), getClCode(), (java.lang.String) null, this.sdk);
        }
        return listA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.String o(com.applovin.impl.tl tlVar) {
        return com.applovin.impl.sdk.utils.JsonUtils.getString(tlVar.a("video_button_properties", (org.json.JSONObject) null), "video_button_html", "");
    }

    public int o() {
        return getIntFromAdObject("close_button_top_margin", ((java.lang.Integer) this.sdk.a(com.applovin.impl.sj.V1)).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Boolean t(com.applovin.impl.tl tlVar) {
        return com.applovin.impl.sdk.utils.JsonUtils.getBoolean(tlVar.a("video_button_properties", (org.json.JSONObject) null), "should_cache_video_button_html_assets", java.lang.Boolean.FALSE);
    }

    public java.util.List t() {
        java.util.List listA;
        com.applovin.impl.tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (java.util.List) tlVar.a(new androidx.arch.core.util.Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda2
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return this.f$0.d((com.applovin.impl.tl) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = com.applovin.impl.yp.a(getJsonObjectFromAdObject("custom_tabs_navigation_aborted_urls", new org.json.JSONObject()), getClCode(), (java.lang.String) null, this.sdk);
        }
        return listA;
    }

    public com.applovin.impl.qq k0() {
        com.applovin.impl.tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (com.applovin.impl.qq) tlVar.a(new androidx.arch.core.util.Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda4
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return this.f$0.q((com.applovin.impl.tl) obj);
                }
            });
        }
        return new com.applovin.impl.qq(getJsonObjectFromAdObject("video_button_properties", null), this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ com.applovin.impl.qq q(com.applovin.impl.tl tlVar) {
        return new com.applovin.impl.qq(tlVar.a("video_button_properties", (org.json.JSONObject) null), this.sdk);
    }

    public int q() {
        return getColorFromAdObject("countdown_color", -922746881);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.util.List r(com.applovin.impl.tl tlVar) {
        return com.applovin.impl.yp.a(tlVar.a("video_end_urls", new org.json.JSONObject()), getClCode(), q0(), this.sdk);
    }

    public int r() {
        return getIntFromAdObject("countdown_length", 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.util.List a(com.applovin.impl.tl tlVar) {
        return com.applovin.impl.yp.a(tlVar.a("ad_closed_urls", new org.json.JSONObject()), getClCode(), (java.lang.String) null, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.util.List b(com.applovin.impl.tl tlVar) {
        return com.applovin.impl.yp.a(tlVar.a("app_killed_urls", new org.json.JSONObject()), getClCode(), (java.lang.String) null, this.sdk);
    }

    public void b(boolean z) {
        com.applovin.impl.tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            tlVar.a("html_resources_cached", z);
            return;
        }
        synchronized (this.adObjectLock) {
            com.applovin.impl.sdk.utils.JsonUtils.putBoolean(this.adObject, "html_resources_cached", z);
        }
    }

    public java.util.List b(final android.view.MotionEvent motionEvent, final boolean z, final boolean z2) {
        java.util.List listA;
        com.applovin.impl.tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (java.util.List) tlVar.a(new androidx.arch.core.util.Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda26
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return this.f$0.a(motionEvent, z, z2, (com.applovin.impl.tl) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = com.applovin.impl.yp.a(getJsonObjectFromAdObject("click_tracking_urls", new org.json.JSONObject()), a(motionEvent, z, z2), c(motionEvent, z, z2), R(), V0(), this.sdk);
        }
        return listA;
    }

    public void b(android.net.Uri uri) {
        com.applovin.impl.tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            tlVar.b("mute_image", uri.toString());
            return;
        }
        synchronized (this.adObjectLock) {
            com.applovin.impl.sdk.utils.JsonUtils.putString(this.adObject, "mute_image", uri.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.util.List l(com.applovin.impl.tl tlVar) {
        return com.applovin.impl.yp.a(tlVar.a("imp_urls", new org.json.JSONObject()), getClCode(), null, null, R(), V0(), this.sdk);
    }

    public com.applovin.impl.sdk.ad.b.d l() {
        if (this.k == null) {
            this.k = new com.applovin.impl.sdk.ad.b.d();
        }
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.util.Map m(com.applovin.impl.tl tlVar) {
        try {
            return com.applovin.impl.sdk.utils.JsonUtils.toStringMap(tlVar.a("http_headers_for_postbacks", new org.json.JSONObject()));
        } catch (org.json.JSONException e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }

    public int m() {
        return getIntFromAdObject("close_button_size", ((java.lang.Integer) this.sdk.a(com.applovin.impl.sj.U1)).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.String n(com.applovin.impl.tl tlVar) {
        return com.applovin.impl.sdk.utils.JsonUtils.getString(tlVar.a("video_button_properties", (org.json.JSONObject) null), "video_button_base_url", "/");
    }

    public com.applovin.impl.adview.e.a n() {
        java.util.List listK = K();
        int intFromAdObject = getIntFromAdObject("close_style", (listK == null || listK.size() <= 0) ? -1 : ((java.lang.Integer) listK.get(0)).intValue());
        return intFromAdObject == -1 ? a(hasVideoUrl()) : a(intFromAdObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.applovin.impl.adview.m s(com.applovin.impl.tl tlVar) {
        org.json.JSONObject jSONObjectA = tlVar.a("web_view_settings", (org.json.JSONObject) null);
        if (jSONObjectA != null) {
            return new com.applovin.impl.adview.m(jSONObjectA);
        }
        return null;
    }

    public android.os.Bundle s() {
        java.util.Map map;
        com.applovin.impl.tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            map = (java.util.Map) tlVar.a(new androidx.arch.core.util.Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda19
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return this.f$0.c((com.applovin.impl.tl) obj);
                }
            });
        } else {
            try {
                map = com.applovin.impl.sdk.utils.JsonUtils.toStringMap(getJsonObjectFromAdObject("custom_tabs_http_headers", new org.json.JSONObject()));
            } catch (org.json.JSONException e2) {
                this.sdk.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.sdk.I().a("DirectAd", "Failed to retrieve http headers for Custom Tabs", e2);
                }
                map = new java.util.HashMap();
            }
        }
        android.os.Bundle bundle = new android.os.Bundle();
        for (java.util.Map.Entry entry : map.entrySet()) {
            bundle.putString((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
        if (getBooleanFromAdObject("custom_tabs_should_use_webview_ua", java.lang.Boolean.FALSE)) {
            bundle.putString(com.google.common.net.HttpHeaders.USER_AGENT, com.applovin.impl.sr.a());
        }
        return bundle;
    }

    public com.applovin.impl.d5 x() {
        com.applovin.impl.tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (com.applovin.impl.d5) tlVar.a(new androidx.arch.core.util.Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda18
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return com.applovin.impl.sdk.ad.b.h((com.applovin.impl.tl) obj);
                }
            });
        }
        org.json.JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("custom_tabs_settings", null);
        if (jsonObjectFromAdObject != null) {
            return new com.applovin.impl.d5(jsonObjectFromAdObject);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.applovin.impl.d5 h(com.applovin.impl.tl tlVar) {
        org.json.JSONObject jSONObjectA = tlVar.a("custom_tabs_settings", (org.json.JSONObject) null);
        if (jSONObjectA != null) {
            return new com.applovin.impl.d5(jSONObjectA);
        }
        return null;
    }

    public java.lang.String h() {
        java.lang.String stringFromAdObject = getStringFromAdObject("base_url", "/");
        if ("null".equalsIgnoreCase(stringFromAdObject)) {
            return null;
        }
        return stringFromAdObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.util.Map c(com.applovin.impl.tl tlVar) {
        try {
            return com.applovin.impl.sdk.utils.JsonUtils.toStringMap(tlVar.a("custom_tabs_http_headers", new org.json.JSONObject()));
        } catch (org.json.JSONException e2) {
            this.sdk.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.sdk.I().a("DirectAd", "Failed to retrieve http headers for Custom Tabs", e2);
            }
            return new java.util.HashMap();
        }
    }

    private java.lang.String c(android.view.MotionEvent motionEvent, boolean z, boolean z2) {
        java.lang.String stringFromAdObject = getStringFromAdObject("click_tracking_url", null);
        java.util.Map mapA = a(motionEvent, z, z2);
        if (stringFromAdObject != null) {
            return com.applovin.impl.sdk.utils.StringUtils.replace(stringFromAdObject, mapA);
        }
        return null;
    }

    public void c(android.net.Uri uri) {
        com.applovin.impl.tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            tlVar.b("unmute_image", uri.toString());
            return;
        }
        synchronized (this.adObjectLock) {
            com.applovin.impl.sdk.utils.JsonUtils.putString(this.adObject, "unmute_image", uri.toString());
        }
    }

    public void c() {
        this.h.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.util.List g(com.applovin.impl.tl tlVar) {
        return com.applovin.impl.yp.a(tlVar.a("custom_tabs_navigation_started_urls", new org.json.JSONObject()), getClCode(), (java.lang.String) null, this.sdk);
    }

    public java.util.List g() {
        java.util.List listA;
        com.applovin.impl.tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (java.util.List) tlVar.a(new androidx.arch.core.util.Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda10
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return this.f$0.b((com.applovin.impl.tl) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = com.applovin.impl.yp.a(getJsonObjectFromAdObject("app_killed_urls", new org.json.JSONObject()), getClCode(), (java.lang.String) null, this.sdk);
        }
        return listA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.util.List e(com.applovin.impl.tl tlVar) {
        return com.applovin.impl.yp.a(tlVar.a("custom_tabs_navigation_failed_urls", new org.json.JSONObject()), getClCode(), (java.lang.String) null, this.sdk);
    }

    public android.os.Bundle e() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.util.List d(com.applovin.impl.tl tlVar) {
        return com.applovin.impl.yp.a(tlVar.a("custom_tabs_navigation_aborted_urls", new org.json.JSONObject()), getClCode(), (java.lang.String) null, this.sdk);
    }

    public java.util.List d() {
        java.util.List listA;
        com.applovin.impl.tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (java.util.List) tlVar.a(new androidx.arch.core.util.Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda22
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return this.f$0.a((com.applovin.impl.tl) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = com.applovin.impl.yp.a(getJsonObjectFromAdObject("ad_closed_urls", new org.json.JSONObject()), getClCode(), (java.lang.String) null, this.sdk);
        }
        return listA;
    }

    public java.util.List d(android.view.MotionEvent motionEvent, boolean z, boolean z2) {
        java.util.List<java.lang.String> stringListFromAdObject = getStringListFromAdObject("privacy_sandbox_click_attribution_urls", java.util.Collections.emptyList());
        if (stringListFromAdObject.isEmpty()) {
            return stringListFromAdObject;
        }
        java.util.Map mapA = a(motionEvent, z, z2);
        java.util.ArrayList arrayList = new java.util.ArrayList(stringListFromAdObject.size());
        java.util.Iterator<java.lang.String> it = stringListFromAdObject.iterator();
        while (it.hasNext()) {
            arrayList.add(com.applovin.impl.sdk.utils.StringUtils.replace(it.next(), mapA));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.util.List j(com.applovin.impl.tl tlVar) {
        return com.applovin.impl.yp.a(tlVar.a("custom_tabs_tab_shown_urls", new org.json.JSONObject()), getClCode(), (java.lang.String) null, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.util.List i(com.applovin.impl.tl tlVar) {
        return com.applovin.impl.yp.a(tlVar.a("custom_tabs_tab_hidden_urls", new org.json.JSONObject()), getClCode(), (java.lang.String) null, this.sdk);
    }

    public java.util.List i() {
        return this.f;
    }

    public com.applovin.impl.eh f() {
        return (com.applovin.impl.eh) this.i.getAndSet(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.util.List a(android.view.MotionEvent motionEvent, boolean z, boolean z2, com.applovin.impl.tl tlVar) {
        return com.applovin.impl.yp.a(tlVar.a("click_tracking_urls", new org.json.JSONObject()), a(motionEvent, z, z2), c(motionEvent, z, z2), R(), V0(), this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.util.List a(androidx.arch.core.util.Function function, com.applovin.impl.tl tlVar) {
        return (java.util.List) function.apply(tlVar.a("omid_verification_script_resources", (org.json.JSONArray) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.util.List f(com.applovin.impl.tl tlVar) {
        return com.applovin.impl.yp.a(tlVar.a("custom_tabs_navigation_finished_urls", new org.json.JSONObject()), getClCode(), (java.lang.String) null, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.util.List a(android.view.MotionEvent motionEvent, boolean z, com.applovin.impl.tl tlVar) {
        return com.applovin.impl.yp.a(tlVar.a("video_click_tracking_urls", new org.json.JSONObject()), a(motionEvent, true, z), null, R(), V0(), this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(java.lang.String str, com.applovin.impl.tl tlVar) {
        com.applovin.impl.sdk.utils.JsonUtils.putString(tlVar.a("video_button_properties", (org.json.JSONObject) null), "video_button_html", str);
    }

    public void a(com.applovin.impl.eh ehVar) {
        this.i.set(ehVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.util.List a(org.json.JSONArray jSONArray) {
        if (jSONArray == null) {
            return java.util.Collections.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            org.json.JSONObject jSONObject = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONArray, i, (org.json.JSONObject) null);
            try {
                java.net.URL url = new java.net.URL(com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "url", null));
                java.lang.String string = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "vendor_key", null);
                java.lang.String string2 = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "parameters", null);
                if (com.applovin.impl.sdk.utils.StringUtils.isValidString(string) && com.applovin.impl.sdk.utils.StringUtils.isValidString(string2)) {
                    arrayList.add(com.iab.omid.library.applovin.adsession.VerificationScriptResource.createVerificationScriptResourceWithParameters(string, url, string2));
                } else {
                    arrayList.add(com.iab.omid.library.applovin.adsession.VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url));
                }
            } catch (java.lang.Throwable th) {
                this.sdk.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.sdk.I().a("DirectAd", "Failed to parse OMID verification script resource", th);
                }
            }
        }
        return arrayList;
    }

    public void a(android.net.Uri uri) {
        this.f.add(uri);
    }

    public void a(final java.lang.String str) {
        com.applovin.impl.tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            tlVar.a(new androidx.core.util.Consumer() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda8
                @Override // androidx.core.util.Consumer
                public final void accept(java.lang.Object obj) {
                    com.applovin.impl.sdk.ad.b.a(str, (com.applovin.impl.tl) obj);
                }
            });
            return;
        }
        synchronized (this.adObjectLock) {
            com.applovin.impl.sdk.utils.JsonUtils.putString(getJsonObjectFromAdObject("video_button_properties", null), "video_button_html", str);
        }
    }

    public java.util.List a(final android.view.MotionEvent motionEvent, final boolean z) {
        java.util.List listA;
        java.util.List list;
        com.applovin.impl.tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            list = (java.util.List) tlVar.a(new androidx.arch.core.util.Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda24
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return this.f$0.a(motionEvent, z, (com.applovin.impl.tl) obj);
                }
            });
        } else {
            synchronized (this.adObjectLock) {
                listA = com.applovin.impl.yp.a(getJsonObjectFromAdObject("video_click_tracking_urls", new org.json.JSONObject()), a(motionEvent, true, z), null, R(), V0(), this.sdk);
            }
            list = listA;
        }
        return list.isEmpty() ? b(motionEvent, true, z) : list;
    }

    private java.util.Map a(android.view.MotionEvent motionEvent, boolean z, boolean z2) {
        android.graphics.Point pointB = com.applovin.impl.z3.b(com.applovin.impl.sdk.j.m());
        java.util.HashMap map = new java.util.HashMap(7);
        map.put("{CLCODE}", getClCode());
        map.put("{CLICK_X}", java.lang.String.valueOf(motionEvent != null ? motionEvent.getRawX() : -1.0f));
        map.put("{CLICK_Y}", java.lang.String.valueOf(motionEvent != null ? motionEvent.getRawY() : -1.0f));
        map.put("{SCREEN_WIDTH}", java.lang.String.valueOf(pointB.x));
        map.put("{SCREEN_HEIGHT}", java.lang.String.valueOf(pointB.y));
        map.put("{IS_VIDEO_CLICK}", java.lang.String.valueOf(z));
        map.put("{IS_INSTALL}", java.lang.String.valueOf(z2));
        return map;
    }

    private com.applovin.impl.adview.e.a a(boolean z) {
        return z ? com.applovin.impl.adview.e.a.WHITE_ON_TRANSPARENT : com.applovin.impl.adview.e.a.WHITE_ON_BLACK;
    }

    protected com.applovin.impl.adview.e.a a(int i) {
        if (i == 1) {
            return com.applovin.impl.adview.e.a.WHITE_ON_TRANSPARENT;
        }
        if (i == 2) {
            return com.applovin.impl.adview.e.a.INVISIBLE;
        }
        if (i == 3) {
            return com.applovin.impl.adview.e.a.TRANSPARENT_SKIP;
        }
        return com.applovin.impl.adview.e.a.WHITE_ON_BLACK;
    }
}
