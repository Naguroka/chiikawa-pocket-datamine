package com.applovin.impl.adview;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.json.JSONObject f615a;

    public m(org.json.JSONObject jSONObject) {
        this.f615a = jSONObject;
    }

    java.lang.Integer a() {
        java.lang.String string = com.applovin.impl.sdk.utils.JsonUtils.getString(this.f615a, "mixed_content_mode", null);
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(string)) {
            if ("always_allow".equalsIgnoreCase(string)) {
                return 0;
            }
            if ("never_allow".equalsIgnoreCase(string)) {
                return 1;
            }
            if ("compatibility_mode".equalsIgnoreCase(string)) {
                return 2;
            }
        }
        return null;
    }

    android.webkit.WebSettings.PluginState b() {
        java.lang.String string = com.applovin.impl.sdk.utils.JsonUtils.getString(this.f615a, "plugin_state", null);
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(string)) {
            if (kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_ON.equalsIgnoreCase(string)) {
                return android.webkit.WebSettings.PluginState.ON;
            }
            if ("on_demand".equalsIgnoreCase(string)) {
                return android.webkit.WebSettings.PluginState.ON_DEMAND;
            }
            if (kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_OFF.equalsIgnoreCase(string)) {
                return android.webkit.WebSettings.PluginState.OFF;
            }
        }
        return null;
    }

    java.lang.Boolean c() {
        return com.applovin.impl.sdk.utils.JsonUtils.getBoolean(this.f615a, "geolocation_enabled", null);
    }

    java.lang.Boolean d() {
        return com.applovin.impl.sdk.utils.JsonUtils.getBoolean(this.f615a, "allow_content_access", null);
    }

    java.lang.Boolean e() {
        return com.applovin.impl.sdk.utils.JsonUtils.getBoolean(this.f615a, "allow_file_access", null);
    }

    java.lang.Boolean f() {
        return com.applovin.impl.sdk.utils.JsonUtils.getBoolean(this.f615a, "allow_file_access_from_file_urls", null);
    }

    java.lang.Boolean g() {
        return com.applovin.impl.sdk.utils.JsonUtils.getBoolean(this.f615a, "allow_universal_access_from_file_urls", null);
    }

    java.lang.Boolean h() {
        return com.applovin.impl.sdk.utils.JsonUtils.getBoolean(this.f615a, "display_zoom_controls", null);
    }

    java.lang.Boolean i() {
        return com.applovin.impl.sdk.utils.JsonUtils.getBoolean(this.f615a, "load_with_overview_mode", null);
    }

    java.lang.Boolean j() {
        return com.applovin.impl.sdk.utils.JsonUtils.getBoolean(this.f615a, "need_initial_focus", null);
    }

    java.lang.Boolean k() {
        return com.applovin.impl.sdk.utils.JsonUtils.getBoolean(this.f615a, "offscreen_pre_raster", null);
    }

    java.lang.Boolean l() {
        return com.applovin.impl.sdk.utils.JsonUtils.getBoolean(this.f615a, "save_form_data", null);
    }

    java.lang.Boolean m() {
        return com.applovin.impl.sdk.utils.JsonUtils.getBoolean(this.f615a, "algorithmic_darkening_allowed", null);
    }

    java.lang.Boolean n() {
        return com.applovin.impl.sdk.utils.JsonUtils.getBoolean(this.f615a, "block_network_image", null);
    }

    java.lang.Boolean o() {
        return com.applovin.impl.sdk.utils.JsonUtils.getBoolean(this.f615a, "loads_images_automatically", null);
    }

    java.lang.Boolean p() {
        return com.applovin.impl.sdk.utils.JsonUtils.getBoolean(this.f615a, "use_built_in_zoom_controls", null);
    }

    java.lang.Boolean q() {
        return com.applovin.impl.sdk.utils.JsonUtils.getBoolean(this.f615a, "use_wide_view_port", null);
    }
}
