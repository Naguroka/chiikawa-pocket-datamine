package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class uj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f1405a;
    private final java.lang.Class b;
    public static final com.applovin.impl.uj c = new com.applovin.impl.uj("com.applovin.sdk.impl.isFirstRun", java.lang.String.class);
    public static final com.applovin.impl.uj d = new com.applovin.impl.uj("com.applovin.sdk.launched_before", java.lang.Boolean.class);
    public static final com.applovin.impl.uj e = new com.applovin.impl.uj("com.applovin.sdk.latest_installed_version", java.lang.String.class);
    public static final com.applovin.impl.uj f = new com.applovin.impl.uj("com.applovin.sdk.install_date", java.lang.Long.class);
    public static final com.applovin.impl.uj g = new com.applovin.impl.uj("com.applovin.sdk.user_id", java.lang.String.class);
    public static final com.applovin.impl.uj h = new com.applovin.impl.uj("com.applovin.sdk.compass_id", java.lang.String.class);
    public static final com.applovin.impl.uj i = new com.applovin.impl.uj("com.applovin.sdk.compass_random_token", java.lang.String.class);
    public static final com.applovin.impl.uj j = new com.applovin.impl.uj("com.applovin.sdk.applovin_random_token", java.lang.String.class);
    public static final com.applovin.impl.uj k = new com.applovin.impl.uj("com.applovin.sdk.device_test_group", java.lang.String.class);
    public static final com.applovin.impl.uj l = new com.applovin.impl.uj("com.applovin.sdk.compliance.has_user_consent", java.lang.Boolean.class);
    public static final com.applovin.impl.uj m = new com.applovin.impl.uj("com.applovin.sdk.compliance.is_age_restricted_user", java.lang.Boolean.class);
    public static final com.applovin.impl.uj n = new com.applovin.impl.uj("com.applovin.sdk.compliance.is_do_not_sell", java.lang.Boolean.class);
    public static final com.applovin.impl.uj o = new com.applovin.impl.uj("com.applovin.sdk.has_seen_but_not_accepted_privacy_policy", java.lang.Boolean.class);
    public static final com.applovin.impl.uj p = new com.applovin.impl.uj("IABTCF_CmpSdkID", java.lang.Object.class);
    public static final com.applovin.impl.uj q = new com.applovin.impl.uj("IABTCF_CmpSdkVersion", java.lang.Object.class);
    public static final com.applovin.impl.uj r = new com.applovin.impl.uj("IABTCF_gdprApplies", java.lang.Object.class);
    public static final com.applovin.impl.uj s = new com.applovin.impl.uj(com.unity3d.ads.core.data.datasource.AndroidTcfDataSource.TCF_TCSTRING_KEY, java.lang.String.class);
    public static final com.applovin.impl.uj t = new com.applovin.impl.uj("IABTCF_AddtlConsent", java.lang.String.class);
    public static final com.applovin.impl.uj u = new com.applovin.impl.uj("IABTCF_VendorConsents", java.lang.String.class);
    public static final com.applovin.impl.uj v = new com.applovin.impl.uj("IABTCF_VendorLegitimateInterests", java.lang.String.class);
    public static final com.applovin.impl.uj w = new com.applovin.impl.uj("IABTCF_PurposeConsents", java.lang.String.class);
    public static final com.applovin.impl.uj x = new com.applovin.impl.uj("IABTCF_PurposeLegitimateInterests", java.lang.String.class);
    public static final com.applovin.impl.uj y = new com.applovin.impl.uj("IABTCF_SpecialFeaturesOptIns", java.lang.String.class);
    public static final com.applovin.impl.uj z = new com.applovin.impl.uj("com.applovin.sdk.stats", java.lang.String.class);
    public static final com.applovin.impl.uj A = new com.applovin.impl.uj("com.applovin.sdk.task.stats", java.util.HashSet.class);
    public static final com.applovin.impl.uj B = new com.applovin.impl.uj("com.applovin.sdk.network_response_code_mapping", java.lang.String.class);
    public static final com.applovin.impl.uj C = new com.applovin.impl.uj("com.applovin.sdk.impl.ad.persistence.queue", java.lang.String.class);
    public static final com.applovin.impl.uj D = new com.applovin.impl.uj("com.applovin.sdk.last_video_position", java.lang.Integer.class);
    public static final com.applovin.impl.uj E = new com.applovin.impl.uj("com.applovin.sdk.should_resume_video", java.lang.Boolean.class);
    public static final com.applovin.impl.uj F = new com.applovin.impl.uj("com.applovin.sdk.mediation.signal_providers", java.lang.String.class);
    public static final com.applovin.impl.uj G = new com.applovin.impl.uj("com.applovin.sdk.mediation.auto_init_adapters", java.lang.String.class);
    public static final com.applovin.impl.uj H = new com.applovin.impl.uj("com.applovin.sdk.persisted_data", java.lang.String.class);
    public static final com.applovin.impl.uj I = new com.applovin.impl.uj("com.applovin.sdk.mediation_provider", java.lang.String.class);
    public static final com.applovin.impl.uj J = new com.applovin.impl.uj("com.applovin.sdk.mediation.test_mode_enabled", java.lang.Boolean.class);
    public static final com.applovin.impl.uj K = new com.applovin.impl.uj("com.applovin.sdk.user_agent", java.lang.String.class);
    public static final com.applovin.impl.uj L = new com.applovin.impl.uj("com.applovin.sdk.last_os_version_user_agent_collected_for", java.lang.String.class);
    public static final com.applovin.impl.uj M = new com.applovin.impl.uj("com.applovin.sdk.last_fullscreen_ad_timestamp_ms", java.lang.Long.class);
    public static final com.applovin.impl.uj N = new com.applovin.impl.uj("com.applovin.sdk.last_fullscreen_ad_duration_ms", java.lang.Long.class);
    public static final com.applovin.impl.uj O = new com.applovin.impl.uj("com.applovin.sdk.app_killed_urls_from_last_ad", java.lang.String.class);
    public static final com.applovin.impl.uj P = new com.applovin.impl.uj("com.applovin.sdk.app_killed_last_ad_data", java.lang.String.class);

    public java.lang.String toString() {
        return "Key{name='" + this.f1405a + "', type=" + this.b + '}';
    }

    public uj(java.lang.String str, java.lang.Class cls) {
        this.f1405a = str;
        this.b = cls;
    }

    public java.lang.String a() {
        return this.f1405a;
    }

    public java.lang.Class b() {
        return this.b;
    }
}
