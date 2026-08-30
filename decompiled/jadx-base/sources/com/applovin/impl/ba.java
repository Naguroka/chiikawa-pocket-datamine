package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class ba {
    private static final java.util.Set b = new java.util.HashSet(32);
    private static final java.util.Set c = new java.util.HashSet(16);
    public static final com.applovin.impl.ba d = a(com.unity3d.services.core.di.ServiceProvider.NAMED_AD_REQ);
    public static final com.applovin.impl.ba e = a("ad_imp");
    public static final com.applovin.impl.ba f = a("max_ad_imp");
    public static final com.applovin.impl.ba g = a("ad_session_start");
    public static final com.applovin.impl.ba h = a("ad_imp_session");
    public static final com.applovin.impl.ba i = a("max_ad_imp_session");
    public static final com.applovin.impl.ba j = a("cached_files_expired");
    public static final com.applovin.impl.ba k = a("cache_drop_count");
    public static final com.applovin.impl.ba l = a("sdk_reset_state_count", true);
    public static final com.applovin.impl.ba m = a("ad_response_process_failures", true);
    public static final com.applovin.impl.ba n = a("response_process_failures", true);
    public static final com.applovin.impl.ba o = a("incent_failed_to_display_count", true);
    public static final com.applovin.impl.ba p = a("app_paused_and_resumed");
    public static final com.applovin.impl.ba q = a("ad_rendered_with_mismatched_sdk_key", true);
    public static final com.applovin.impl.ba r = a("ad_shown_outside_app_count");
    public static final com.applovin.impl.ba s = a("med_ad_req");
    public static final com.applovin.impl.ba t = a("med_ad_response_process_failures", true);
    public static final com.applovin.impl.ba u = a("med_waterfall_ad_no_fill", true);
    public static final com.applovin.impl.ba v = a("med_waterfall_ad_adapter_load_failed", true);
    public static final com.applovin.impl.ba w = a("med_waterfall_ad_invalid_response", true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f639a;

    static {
        a("fullscreen_ad_nil_vc_count");
        a("applovin_bundle_missing");
    }

    public java.lang.String b() {
        return this.f639a;
    }

    private ba(java.lang.String str) {
        this.f639a = str;
    }

    private static com.applovin.impl.ba a(java.lang.String str) {
        return a(str, false);
    }

    private static com.applovin.impl.ba a(java.lang.String str, boolean z) {
        if (!android.text.TextUtils.isEmpty(str)) {
            java.util.Set set = b;
            if (!set.contains(str)) {
                set.add(str);
                com.applovin.impl.ba baVar = new com.applovin.impl.ba(str);
                if (z) {
                    c.add(baVar);
                }
                return baVar;
            }
            throw new java.lang.IllegalArgumentException("Key has already been used: " + str);
        }
        throw new java.lang.IllegalArgumentException("No key name specified");
    }

    public static java.util.Set a() {
        return c;
    }
}
