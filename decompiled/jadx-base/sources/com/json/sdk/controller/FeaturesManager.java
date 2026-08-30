package com.json.sdk.controller;

/* JADX INFO: loaded from: classes5.dex */
public class FeaturesManager {
    private static volatile com.json.sdk.controller.FeaturesManager d = null;
    private static final java.lang.String e = "debugMode";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.util.Map<java.lang.String, ?> f3278a;
    private final java.util.ArrayList<java.lang.String> b = new com.ironsource.sdk.controller.FeaturesManager.a();
    private com.json.xg c = com.json.im.S().z();

    class a extends java.util.ArrayList<java.lang.String> {
        a() {
            add(com.ironsource.y8.d.f);
            add(com.ironsource.y8.d.e);
            add(com.ironsource.y8.d.g);
            add(com.ironsource.y8.d.h);
            add(com.ironsource.y8.d.i);
            add(com.ironsource.y8.d.j);
            add(com.ironsource.y8.d.k);
            add(com.ironsource.y8.d.l);
            add(com.ironsource.y8.d.m);
        }
    }

    private FeaturesManager() {
        if (d != null) {
            throw new java.lang.RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
        this.f3278a = new java.util.HashMap();
    }

    public static com.json.sdk.controller.FeaturesManager getInstance() {
        if (d == null) {
            synchronized (com.json.sdk.controller.FeaturesManager.class) {
                if (d == null) {
                    d = new com.json.sdk.controller.FeaturesManager();
                }
            }
        }
        return d;
    }

    java.util.ArrayList<java.lang.String> a() {
        return new java.util.ArrayList<>(this.b);
    }

    public org.json.JSONObject getDataManagerConfig() {
        org.json.JSONObject networkConfiguration = com.json.sdk.utils.SDKUtils.getNetworkConfiguration();
        return networkConfiguration.has(com.ironsource.y8.a.d) ? networkConfiguration.optJSONObject(com.ironsource.y8.a.d) : new org.json.JSONObject();
    }

    public int getDebugMode() {
        java.lang.Integer num = 0;
        try {
            if (this.f3278a.containsKey("debugMode")) {
                num = (java.lang.Integer) this.f3278a.get("debugMode");
            }
        } catch (java.lang.Exception e2) {
            com.json.l9.d().a(e2);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public com.json.l8 getFeatureFlagCatchUrlError() {
        return new com.json.l8(com.json.sdk.utils.SDKUtils.getNetworkConfiguration().optJSONObject(com.ironsource.l8.a.FLAG_NAME));
    }

    public com.json.m8 getFeatureFlagClickCheck() {
        return new com.json.m8(com.json.sdk.utils.SDKUtils.getNetworkConfiguration());
    }

    public com.json.oe getFeatureFlagHealthCheck() {
        org.json.JSONObject jSONObjectA = this.c.a(com.ironsource.y8.a.r);
        return jSONObjectA instanceof org.json.JSONObject ? new com.json.oe(jSONObjectA) : new com.json.oe(null);
    }

    public int getInitRecoverTrials() {
        org.json.JSONObject jSONObjectOptJSONObject = com.json.sdk.utils.SDKUtils.getNetworkConfiguration().optJSONObject(com.ironsource.y8.a.f);
        if (jSONObjectOptJSONObject != null) {
            return jSONObjectOptJSONObject.optInt(com.ironsource.y8.a.e, 0);
        }
        return 0;
    }

    public com.json.os getSessionHistoryConfig() {
        org.json.JSONObject networkConfiguration = com.json.sdk.utils.SDKUtils.getNetworkConfiguration();
        return new com.json.os(networkConfiguration.has(com.ironsource.y8.a.s) ? networkConfiguration.optJSONObject(com.ironsource.y8.a.s) : new org.json.JSONObject());
    }

    public boolean getStopUseOnResumeAndPause() {
        return java.lang.Boolean.TRUE.equals(this.c.c(com.ironsource.y8.a.u));
    }

    public void updateDebugConfigurations(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (map == null) {
            return;
        }
        this.f3278a = map;
    }
}
