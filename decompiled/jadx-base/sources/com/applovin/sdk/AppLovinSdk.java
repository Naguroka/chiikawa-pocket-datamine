package com.applovin.sdk;

/* JADX INFO: loaded from: classes3.dex */
public final class AppLovinSdk {
    private static final java.lang.String TAG = "AppLovinSdk";
    private static com.applovin.sdk.AppLovinSdk instance;
    private final com.applovin.impl.sdk.j coreSdk;
    public static final java.lang.String VERSION = getVersion();
    public static final int VERSION_CODE = getVersionCode();
    private static final java.lang.Object instanceLock = new java.lang.Object();
    private static final java.util.Map<java.lang.String, com.applovin.sdk.AppLovinSdk> sdkInstances = new java.util.HashMap(1);
    private static final java.lang.Object sdkInstancesLock = new java.lang.Object();

    public interface SdkInitializationListener {
        void onSdkInitialized(com.applovin.sdk.AppLovinSdkConfiguration appLovinSdkConfiguration);
    }

    private static class a extends com.applovin.sdk.AppLovinSdkSettings {
        a(android.content.Context context) {
            super(context);
        }
    }

    private AppLovinSdk(com.applovin.impl.sdk.j jVar) {
        this.coreSdk = jVar;
    }

    public static com.applovin.sdk.AppLovinSdk getInstance(android.content.Context context) {
        com.applovin.sdk.AppLovinSdk appLovinSdk;
        if (context == null) {
            throw new java.lang.IllegalArgumentException("No context specified");
        }
        if (com.applovin.impl.t0.a(context).a("applovin.sdk.key", (java.lang.String) null) != null) {
            return getInstance(new com.applovin.sdk.AppLovinSdk.a(context), context);
        }
        synchronized (instanceLock) {
            if (instance == null) {
                com.applovin.impl.sdk.j jVar = new com.applovin.impl.sdk.j(context);
                com.applovin.sdk.AppLovinSdk appLovinSdk2 = new com.applovin.sdk.AppLovinSdk(jVar);
                jVar.a(appLovinSdk2);
                instance = appLovinSdk2;
            }
            appLovinSdk = instance;
        }
        return appLovinSdk;
    }

    private static java.util.Collection<com.applovin.sdk.AppLovinSdk> getInstances() {
        java.util.Collection<com.applovin.sdk.AppLovinSdk> collectionValues;
        com.applovin.sdk.AppLovinSdk appLovinSdk = instance;
        if (appLovinSdk != null) {
            return java.util.Arrays.asList(appLovinSdk);
        }
        synchronized (sdkInstancesLock) {
            collectionValues = sdkInstances.values();
        }
        return collectionValues;
    }

    private static java.lang.String getVersion() {
        return "13.0.1";
    }

    private static int getVersionCode() {
        return 13000199;
    }

    private void reinitialize(java.lang.Boolean bool, java.lang.Boolean bool2) {
        if (this.coreSdk.x0().get() || this.coreSdk.u0()) {
            this.coreSdk.O0();
        }
        this.coreSdk.L0();
        if (bool != null) {
            this.coreSdk.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.coreSdk.I().d(TAG, "Toggled 'huc' to " + bool);
            }
            getEventService().trackEvent("huc", com.applovin.impl.sdk.utils.CollectionUtils.map("value", bool.toString()));
        }
        if (bool2 != null) {
            this.coreSdk.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.coreSdk.I().d(TAG, "Toggled 'dns' to " + bool2);
            }
            getEventService().trackEvent("dns", com.applovin.impl.sdk.utils.CollectionUtils.map("value", bool2.toString()));
        }
    }

    static void reinitializeAll(java.lang.Boolean bool, java.lang.Boolean bool2) {
        synchronized (sdkInstancesLock) {
            java.util.Iterator<com.applovin.sdk.AppLovinSdk> it = getInstances().iterator();
            while (it.hasNext()) {
                it.next().reinitialize(bool, bool2);
            }
        }
    }

    public com.applovin.impl.sdk.j a() {
        return this.coreSdk;
    }

    public com.applovin.sdk.AppLovinAdService getAdService() {
        return this.coreSdk.j();
    }

    public java.util.List<com.applovin.mediation.MaxMediatedNetworkInfo> getAvailableMediatedNetworks() {
        org.json.JSONArray jSONArrayA = com.applovin.impl.ze.a(this.coreSdk);
        java.util.ArrayList arrayList = new java.util.ArrayList(jSONArrayA.length());
        for (int i = 0; i < jSONArrayA.length(); i++) {
            arrayList.add(new com.applovin.impl.mediation.MaxMediatedNetworkInfoImpl(com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONArrayA, i, (org.json.JSONObject) null)));
        }
        return arrayList;
    }

    public com.applovin.sdk.AppLovinCmpService getCmpService() {
        return this.coreSdk.p();
    }

    public com.applovin.sdk.AppLovinSdkConfiguration getConfiguration() {
        return this.coreSdk.s();
    }

    public com.applovin.sdk.AppLovinEventService getEventService() {
        return this.coreSdk.z();
    }

    public java.lang.String getMediationProvider() {
        return this.coreSdk.N();
    }

    @java.lang.Deprecated
    public com.applovin.sdk.AppLovinPostbackService getPostbackService() {
        return this.coreSdk.X();
    }

    public java.lang.String getSdkKey() {
        return this.coreSdk.a0();
    }

    public com.applovin.mediation.MaxSegmentCollection getSegmentCollection() {
        return this.coreSdk.b0();
    }

    public com.applovin.sdk.AppLovinSdkSettings getSettings() {
        return this.coreSdk.f0();
    }

    @java.lang.Deprecated
    public java.lang.String getUserIdentifier() {
        return this.coreSdk.n0();
    }

    public void initialize(com.applovin.sdk.AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration, com.applovin.sdk.AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        this.coreSdk.a(appLovinSdkInitializationConfiguration, sdkInitializationListener);
    }

    @java.lang.Deprecated
    public void initializeSdk() {
    }

    public boolean isInitialized() {
        return this.coreSdk.s0();
    }

    @java.lang.Deprecated
    public void setMediationProvider(java.lang.String str) {
        this.coreSdk.f(str);
    }

    @java.lang.Deprecated
    public void setPluginVersion(java.lang.String str) {
        this.coreSdk.g(str);
    }

    @java.lang.Deprecated
    public void setUserIdentifier(java.lang.String str) {
        this.coreSdk.h(str);
    }

    public void showCreativeDebugger() {
        this.coreSdk.S0();
    }

    public void showMediationDebugger() {
        this.coreSdk.T0();
    }

    public java.lang.String toString() {
        return "AppLovinSdk{sdkKey='" + getSdkKey() + "', isInitialized=" + isInitialized() + ", isFirstSession=" + this.coreSdk.t0() + '}';
    }

    @java.lang.Deprecated
    public void initializeSdk(com.applovin.sdk.AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        this.coreSdk.a(sdkInitializationListener);
    }

    public void showMediationDebugger(java.util.Map<java.lang.String, java.util.List<?>> map) {
        this.coreSdk.a(map);
    }

    @java.lang.Deprecated
    public static void initializeSdk(android.content.Context context) {
        initializeSdk(context, null);
    }

    @java.lang.Deprecated
    public static void initializeSdk(android.content.Context context, com.applovin.sdk.AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        if (context != null) {
            com.applovin.sdk.AppLovinSdk appLovinSdk = getInstance(context);
            if (appLovinSdk != null) {
                appLovinSdk.initializeSdk(sdkInitializationListener);
                return;
            } else {
                com.applovin.impl.sdk.n.h(TAG, "Unable to initialize AppLovin SDK: SDK object not created");
                return;
            }
        }
        throw new java.lang.IllegalArgumentException("No context specified");
    }

    @java.lang.Deprecated
    public static com.applovin.sdk.AppLovinSdk getInstance(com.applovin.sdk.AppLovinSdkSettings appLovinSdkSettings, android.content.Context context) {
        if (context != null) {
            return getInstance(com.applovin.impl.t0.a(context).a("applovin.sdk.key", ""), appLovinSdkSettings, context);
        }
        throw new java.lang.IllegalArgumentException("No context specified");
    }

    @java.lang.Deprecated
    public static com.applovin.sdk.AppLovinSdk getInstance(java.lang.String str, com.applovin.sdk.AppLovinSdkSettings appLovinSdkSettings, android.content.Context context) {
        com.applovin.sdk.AppLovinSdk appLovinSdk;
        if (appLovinSdkSettings == null) {
            throw new java.lang.IllegalArgumentException("No userSettings specified");
        }
        if (context != null) {
            synchronized (instanceLock) {
                com.applovin.sdk.AppLovinSdk appLovinSdk2 = instance;
                if (appLovinSdk2 != null && str.equals(appLovinSdk2.getSdkKey())) {
                    return instance;
                }
                synchronized (sdkInstancesLock) {
                    java.util.Map<java.lang.String, com.applovin.sdk.AppLovinSdk> map = sdkInstances;
                    if (map.containsKey(str)) {
                        appLovinSdk = map.get(str);
                    } else {
                        if (!android.text.TextUtils.isEmpty(str)) {
                            java.lang.String str2 = java.io.File.separator;
                            if (str.contains(str2)) {
                                com.applovin.impl.sdk.n.h(TAG, "\n**************************************************\nINVALID SDK KEY: " + str + "\n**************************************************\n");
                                if (!map.isEmpty()) {
                                    return map.values().iterator().next();
                                }
                                str = str.replace(str2, "");
                            }
                        }
                        com.applovin.impl.sdk.j jVar = new com.applovin.impl.sdk.j(context);
                        jVar.a(str, appLovinSdkSettings);
                        com.applovin.sdk.AppLovinSdk appLovinSdk3 = new com.applovin.sdk.AppLovinSdk(jVar);
                        jVar.a(appLovinSdk3);
                        appLovinSdkSettings.attachAppLovinSdk(jVar);
                        map.put(str, appLovinSdk3);
                        appLovinSdk = appLovinSdk3;
                    }
                    return appLovinSdk;
                }
            }
        }
        throw new java.lang.IllegalArgumentException("No context specified");
    }
}
