package com.applovin.impl.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class i implements com.applovin.communicator.AppLovinCommunicatorSubscriber, com.applovin.communicator.AppLovinCommunicatorPublisher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f1292a;
    private final com.applovin.communicator.AppLovinCommunicator b;

    i(com.applovin.impl.sdk.j jVar) {
        this.f1292a = jVar;
        com.applovin.communicator.AppLovinCommunicator appLovinCommunicator = com.applovin.communicator.AppLovinCommunicator.getInstance(com.applovin.impl.sdk.j.m());
        this.b = appLovinCommunicator;
        if (((java.lang.Boolean) jVar.a(com.applovin.impl.sj.B6)).booleanValue()) {
            appLovinCommunicator.a(jVar);
            appLovinCommunicator.subscribe(this, com.applovin.impl.io.f896a);
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public java.lang.String getCommunicatorId() {
        return "applovin_sdk";
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(com.applovin.communicator.AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        java.util.Map<java.lang.String, java.lang.Object> map;
        if (((java.lang.Boolean) this.f1292a.a(com.applovin.impl.sj.B6)).booleanValue()) {
            if ("send_http_request".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                android.os.Bundle messageData = appLovinCommunicatorMessage.getMessageData();
                java.util.Map<java.lang.String, java.lang.String> stringMap = com.applovin.impl.sdk.utils.BundleUtils.toStringMap(messageData.getBundle("query_params"));
                java.util.Map<java.lang.String, java.lang.Object> map2 = com.applovin.impl.sdk.utils.BundleUtils.toMap(messageData.getBundle("post_body"));
                java.util.Map<java.lang.String, java.lang.String> stringMap2 = com.applovin.impl.sdk.utils.BundleUtils.toStringMap(messageData.getBundle("headers"));
                java.lang.String string = messageData.getString("id", "");
                if (!map2.containsKey(com.applovin.sdk.AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY)) {
                    map2.put(com.applovin.sdk.AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f1292a.a0());
                }
                this.f1292a.W().e(new com.applovin.impl.sdk.network.d.b().d(messageData.getString("url")).a(messageData.getString("backup_url")).b(stringMap).c(map2).a(stringMap2).a(((java.lang.Boolean) this.f1292a.a(com.applovin.impl.sj.a5)).booleanValue()).b(string).a());
                return;
            }
            if (!"send_http_request_v2".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                if ("set_ad_request_query_params".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                    this.f1292a.j().addCustomQueryParams(com.applovin.impl.yp.a((java.util.Map) com.applovin.impl.sdk.utils.BundleUtils.toMap(appLovinCommunicatorMessage.getMessageData())));
                    return;
                } else if ("set_ad_request_post_body".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                    this.f1292a.j().setCustomPostBody(com.applovin.impl.sdk.utils.BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
                    return;
                } else {
                    if ("set_mediate_request_post_body_data".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                        this.f1292a.P().setCustomPostBodyData(com.applovin.impl.sdk.utils.BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
                        return;
                    }
                    return;
                }
            }
            android.os.Bundle messageData2 = appLovinCommunicatorMessage.getMessageData();
            java.lang.String string2 = messageData2.getString("http_method", "POST");
            long millis = messageData2.containsKey("timeout_sec") ? java.util.concurrent.TimeUnit.SECONDS.toMillis(messageData2.getLong("timeout_sec")) : ((java.lang.Long) this.f1292a.a(com.applovin.impl.sj.l3)).longValue();
            int i = messageData2.getInt("retry_count", ((java.lang.Integer) this.f1292a.a(com.applovin.impl.sj.m3)).intValue());
            long millis2 = messageData2.containsKey("retry_delay_sec") ? java.util.concurrent.TimeUnit.SECONDS.toMillis(messageData2.getLong("retry_delay_sec")) : ((java.lang.Long) this.f1292a.a(com.applovin.impl.sj.n3)).longValue();
            java.util.Map<java.lang.String, java.lang.String> stringMap3 = com.applovin.impl.sdk.utils.BundleUtils.toStringMap(messageData2.getBundle("query_params"));
            long j = millis2;
            if ("GET".equalsIgnoreCase(string2)) {
                if (messageData2.getBoolean("include_data_collector_info", true)) {
                    stringMap3.putAll(com.applovin.impl.sdk.utils.BundleUtils.toStringMap(com.applovin.impl.sdk.utils.CollectionUtils.toBundle(this.f1292a.x().a(null, false, false))));
                }
                millis = millis;
                i = i;
                map = null;
            } else {
                map = com.applovin.impl.sdk.utils.BundleUtils.toMap(messageData2.getBundle("post_body"));
                if (messageData2.getBoolean("include_data_collector_info", true)) {
                    java.util.Map mapB = this.f1292a.x().B();
                    java.util.Map mapM = this.f1292a.x().m();
                    if (mapM.containsKey("idfv") && mapM.containsKey("idfv_scope")) {
                        java.lang.String str = (java.lang.String) mapM.get("idfv");
                        java.lang.Integer num = (java.lang.Integer) mapM.get("idfv_scope");
                        num.intValue();
                        mapM.remove("idfv");
                        mapM.remove("idfv_scope");
                        mapB.put("idfv", str);
                        mapB.put("idfv_scope", num);
                    }
                    mapB.put("server_installed_at", this.f1292a.a(com.applovin.impl.sj.p));
                    mapB.put(com.applovin.sdk.AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f1292a.a0());
                    map.put("app", mapB);
                    map.put(com.ironsource.y8.h.G, mapM);
                } else {
                    millis = millis;
                    i = i;
                }
            }
            this.f1292a.i0().a((com.applovin.impl.yl) new com.applovin.impl.v3(appLovinCommunicatorMessage.getPublisherId(), com.applovin.impl.sdk.network.a.a(this.f1292a).b(messageData2.getString("url")).a(messageData2.getString("backup_url")).b(stringMap3).c(string2).a((java.util.Map) com.applovin.impl.sdk.utils.BundleUtils.toStringMap(messageData2.getBundle("headers"))).a(map != null ? new org.json.JSONObject(map) : null).c((int) millis).a(i).b((int) j).a((java.lang.Object) new org.json.JSONObject()).a(messageData2.getBoolean("is_encoding_enabled", false)).a(), this.f1292a), com.applovin.impl.tm.b.OTHER);
        }
    }

    public void b(com.applovin.impl.fe feVar, java.lang.String str) {
        if (((java.lang.Boolean) this.f1292a.a(com.applovin.impl.sj.B6)).booleanValue() && this.b.hasSubscriber("max_ad_events")) {
            android.os.Bundle bundleA = a(feVar);
            bundleA.putString("type", str);
            this.f1292a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f1292a.I().a("CommunicatorService", "Sending \"max_ad_events\" message: " + bundleA);
            }
            a(bundleA, "max_ad_events");
        }
    }

    public void a(com.applovin.impl.fe feVar, java.lang.String str) {
        if (((java.lang.Boolean) this.f1292a.a(com.applovin.impl.sj.B6)).booleanValue() && this.b.hasSubscriber("ad_callback_blocked_after_hidden")) {
            android.os.Bundle bundleA = a(feVar);
            bundleA.putString("callback_name", str);
            a(bundleA, "ad_callback_blocked_after_hidden");
        }
    }

    public void a(org.json.JSONObject jSONObject, boolean z) {
        if (((java.lang.Boolean) this.f1292a.a(com.applovin.impl.sj.B6)).booleanValue() && this.b.hasSubscriber("safedk_init")) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(com.applovin.sdk.AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f1292a.a0());
            bundle.putString("applovin_random_token", this.f1292a.Z());
            bundle.putString("compass_random_token", this.f1292a.r());
            bundle.putString("device_type", com.applovin.sdk.AppLovinSdkUtils.isTablet(com.applovin.impl.sdk.j.m()) ? "tablet" : "phone");
            bundle.putString("init_success", java.lang.String.valueOf(z));
            bundle.putParcelableArrayList("installed_mediation_adapters", com.applovin.impl.sdk.utils.JsonUtils.toBundle(com.applovin.impl.ze.a(this.f1292a)));
            org.json.JSONObject jSONObject2 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONObject, "communicator_settings", (org.json.JSONObject) null);
            android.os.Bundle bundle2 = (android.os.Bundle) bundle.clone();
            bundle2.putString("user_id", this.f1292a.o0().c());
            org.json.JSONObject jSONObject3 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONObject2, "safedk_settings", new org.json.JSONObject());
            if (!((java.lang.Boolean) this.f1292a.a(com.applovin.impl.sj.C6)).booleanValue()) {
                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                com.applovin.impl.sdk.utils.JsonUtils.putBoolean(jSONObject4, "deactivated", true);
                com.applovin.impl.sdk.utils.JsonUtils.putJSONObject(jSONObject3, "safeDKDeactivation", jSONObject4);
            }
            bundle2.putBundle("settings", com.applovin.impl.sdk.utils.JsonUtils.toBundle(jSONObject3));
            this.f1292a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f1292a.I().a("CommunicatorService", "Sending \"safedk_init\" message: " + bundle);
            }
            a(bundle2, "safedk_init");
        }
    }

    public void a(com.applovin.mediation.adapter.MaxAdapter.InitializationStatus initializationStatus, java.lang.String str) {
        if (((java.lang.Boolean) this.f1292a.a(com.applovin.impl.sj.B6)).booleanValue() && this.b.hasSubscriber("adapter_initialization_status")) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("adapter_class", str);
            bundle.putInt("init_status", initializationStatus.getCode());
            a(bundle, "adapter_initialization_status");
        }
    }

    public void a() {
        if (((java.lang.Boolean) this.f1292a.a(com.applovin.impl.sj.B6)).booleanValue() && this.b.hasSubscriber("privacy_setting_updated")) {
            a(new android.os.Bundle(), "privacy_setting_updated");
        }
    }

    public void a(java.lang.String str, java.lang.String str2) {
        if (((java.lang.Boolean) this.f1292a.a(com.applovin.impl.sj.B6)).booleanValue() && this.b.hasSubscriber("network_sdk_version_updated")) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("adapter_class", str2);
            bundle.putString("sdk_version", str);
            a(bundle, "network_sdk_version_updated");
        }
    }

    public void a(java.util.List list) {
        if (((java.lang.Boolean) this.f1292a.a(com.applovin.impl.sj.B6)).booleanValue() && this.b.hasSubscriber("live_networks_updated")) {
            if (list != null && !list.isEmpty()) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putStringArrayList("live_networks", new java.util.ArrayList<>(list));
                a(bundle, "live_networks_updated");
                return;
            }
            a(android.os.Bundle.EMPTY, "live_networks_updated");
        }
    }

    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (((java.lang.Boolean) this.f1292a.a(com.applovin.impl.sj.B6)).booleanValue() && this.b.hasSubscriber("responses")) {
            java.lang.String strMaybeConvertToIndentedString = com.applovin.impl.sdk.utils.JsonUtils.maybeConvertToIndentedString(str3, 2);
            java.lang.String strMaybeConvertToIndentedString2 = com.applovin.impl.sdk.utils.JsonUtils.maybeConvertToIndentedString(str, 2);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("request_url", str2);
            bundle.putString("request_body", strMaybeConvertToIndentedString);
            bundle.putString(com.json.hs.n, strMaybeConvertToIndentedString2);
            a(bundle, "responses");
        }
    }

    public void a(java.lang.String str, java.lang.String str2, int i, java.lang.Object obj, java.lang.String str3, boolean z) {
        if (((java.lang.Boolean) this.f1292a.a(com.applovin.impl.sj.B6)).booleanValue() && this.b.hasSubscriber("receive_http_response")) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("id", str);
            bundle.putString("url", str2);
            bundle.putInt("code", i);
            bundle.putBundle("body", com.applovin.impl.sdk.utils.JsonUtils.toBundle(obj));
            bundle.putBoolean("success", z);
            com.applovin.impl.sdk.utils.BundleUtils.putString("error_message", str3, bundle);
            a(bundle, "receive_http_response");
        }
    }

    public void a(android.os.Bundle bundle, java.lang.String str) {
        if (((java.lang.Boolean) this.f1292a.a(com.applovin.impl.sj.B6)).booleanValue() && this.b.hasSubscriber(str)) {
            this.b.getMessagingService().publish(com.applovin.impl.communicator.CommunicatorMessageImpl.create(bundle, str, this));
        }
    }

    public boolean a(java.lang.String str) {
        return com.applovin.impl.io.f896a.contains(str);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00c3  */
    private android.os.Bundle a(com.applovin.impl.fe feVar) {
        android.view.View viewO0;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("id", feVar.R());
        bundle.putString("network_name", feVar.c());
        bundle.putString("max_ad_unit_id", feVar.getAdUnitId());
        bundle.putString("third_party_ad_placement_id", feVar.T());
        bundle.putString(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, feVar.getFormat().getLabel());
        com.applovin.impl.sdk.utils.BundleUtils.putStringIfValid("creative_id", feVar.getCreativeId(), bundle);
        com.applovin.impl.sdk.utils.BundleUtils.putStringIfValid("adomain", feVar.v(), bundle);
        com.applovin.impl.sdk.utils.BundleUtils.putStringIfValid("dsp_name", feVar.getDspName(), bundle);
        if (feVar.Y()) {
            com.applovin.impl.sdk.utils.BundleUtils.putStringIfValid("hybrid_ad_format", feVar.I().getLabel(), bundle);
        }
        if (feVar.Z()) {
            bundle.putString("custom_js_network_name", feVar.getNetworkName());
        } else if ("CUSTOM_NETWORK_SDK".equalsIgnoreCase(feVar.c())) {
            bundle.putString("custom_sdk_network_name", feVar.getNetworkName());
        }
        bundle.putAll(com.applovin.impl.sdk.utils.JsonUtils.toBundle(feVar.x()));
        if (feVar instanceof com.applovin.impl.me) {
            if (feVar instanceof com.applovin.impl.ge) {
                viewO0 = ((com.applovin.impl.ge) feVar).y();
            } else if (feVar instanceof com.applovin.impl.ie) {
                com.applovin.impl.ie ieVar = (com.applovin.impl.ie) feVar;
                if (ieVar.u0()) {
                    viewO0 = null;
                } else {
                    viewO0 = ieVar.o0() != null ? ieVar.o0() : ieVar.p0();
                }
            } else {
                viewO0 = null;
            }
            bundle.putString("ad_view", viewO0 != null ? com.applovin.impl.zq.a(viewO0) : "N/A");
        } else if (feVar instanceof com.applovin.impl.he) {
            android.os.Bundle bundle2 = ((com.applovin.impl.he) feVar).m0().getBundle("applovin_ad_view_info");
            bundle.putString("ad_view", com.applovin.impl.sdk.utils.BundleUtils.getString("ad_view_address", "N/A", bundle2));
            bundle.putString("video_view", com.applovin.impl.sdk.utils.BundleUtils.getString("video_view_address", "N/A", bundle2));
        }
        return bundle;
    }

    public void b(com.applovin.impl.fe feVar) {
        if (((java.lang.Boolean) this.f1292a.a(com.applovin.impl.sj.B6)).booleanValue() && this.b.hasSubscriber("max_revenue_events")) {
            android.os.Bundle bundleA = a(feVar);
            bundleA.putAll(com.applovin.impl.sdk.utils.JsonUtils.toBundle(feVar.Q()));
            bundleA.putString("country_code", this.f1292a.s().getCountryCode());
            a(bundleA, "max_revenue_events");
        }
    }

    public void b(java.lang.String str, java.lang.String str2) {
        if (((java.lang.Boolean) this.f1292a.a(com.applovin.impl.sj.B6)).booleanValue() && this.b.hasSubscriber("user_info")) {
            android.os.Bundle bundle = new android.os.Bundle(2);
            bundle.putString("user_id", com.applovin.impl.sdk.utils.StringUtils.emptyIfNull(str));
            bundle.putString("applovin_random_token", str2);
            a(bundle, "user_info");
        }
    }

    public void b(java.util.List list) {
        if (((java.lang.Boolean) this.f1292a.a(com.applovin.impl.sj.B6)).booleanValue() && this.b.hasSubscriber("test_mode_networks_updated")) {
            if (list != null && !list.isEmpty()) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putStringArrayList("test_mode_networks", new java.util.ArrayList<>(list));
                a(bundle, "test_mode_networks_updated");
                return;
            }
            a(android.os.Bundle.EMPTY, "test_mode_networks_updated");
        }
    }
}
