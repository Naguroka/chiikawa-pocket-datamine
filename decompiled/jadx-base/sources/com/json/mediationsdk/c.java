package com.json.mediationsdk;

/* JADX INFO: loaded from: classes5.dex */
public class c {
    private static final java.lang.String k = "IronSource";
    private static final java.lang.String l = "com.ironsource.adapters";
    private static final java.lang.String m = "aps";
    private static final com.json.mediationsdk.c n = new com.json.mediationsdk.c();
    private static final java.lang.Object o = new java.lang.Object();
    private java.lang.String c;
    private java.lang.String d;
    private java.lang.Boolean e;
    private final java.util.concurrent.atomic.AtomicBoolean h = new java.util.concurrent.atomic.AtomicBoolean(false);
    private com.json.w8 i = new com.json.w8();
    private final com.json.hn j = new com.json.hn();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.json.mediationsdk.AbstractAdapter> f2939a = new java.util.concurrent.ConcurrentHashMap<>();
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.json.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper> b = new java.util.concurrent.ConcurrentHashMap<>();
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<java.lang.String>> f = new java.util.concurrent.ConcurrentHashMap<>();
    private final java.util.concurrent.ConcurrentHashMap<com.ironsource.mediationsdk.IronSource.AD_UNIT, org.json.JSONObject> g = new java.util.concurrent.ConcurrentHashMap<>();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2940a;

        static {
            int[] iArr = new int[com.ironsource.mediationsdk.IronSource.AD_UNIT.values().length];
            f2940a = iArr;
            try {
                iArr[com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f2940a[com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f2940a[com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f2940a[com.ironsource.mediationsdk.IronSource.AD_UNIT.NATIVE_AD.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    private com.json.mediationsdk.AbstractAdapter a(java.lang.String str, java.lang.String str2) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("com.ironsource.adapters." + com.json.environment.StringUtils.toLowerCase(str2) + "." + str2 + "Adapter");
            return (com.json.mediationsdk.AbstractAdapter) cls.getMethod(com.json.mediationsdk.utils.IronSourceConstants.START_ADAPTER, java.lang.String.class).invoke(cls, str);
        } catch (java.lang.Exception e) {
            java.lang.String str3 = "Error while loading adapter - exception = " + e.getLocalizedMessage();
            a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str3);
            a(str3);
            return null;
        }
    }

    private com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface a(java.lang.String str, java.lang.String str2, com.json.mediationsdk.model.NetworkSettings networkSettings) {
        if (networkSettings.isCustomNetwork() && android.text.TextUtils.isEmpty(networkSettings.getCustomNetworkPackage())) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.error("missing package definition for " + str);
            return null;
        }
        java.lang.String str3 = (networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkPackage() : l) + "." + str2;
        try {
            com.json.mediationsdk.adunit.adapter.BaseAdapter baseAdapter = (com.json.mediationsdk.adunit.adapter.BaseAdapter) java.lang.Class.forName(str3).newInstance();
            com.json.mediationsdk.logger.IronLog.INTERNAL.info(str3 + " was allocated (adapter version: " + baseAdapter.getAdapterVersion() + ", sdk version: " + baseAdapter.getNetworkSDKVersion() + ")");
            a(baseAdapter);
            this.i.a(baseAdapter, networkSettings);
            this.b.put(str, new com.json.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper(baseAdapter, networkSettings));
            return baseAdapter;
        } catch (java.lang.Exception unused) {
            if (networkSettings.isCustomNetwork()) {
                java.lang.String str4 = "failed to load " + str3;
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(str4);
                a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str4);
            }
            return null;
        }
    }

    private com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, ?> a(com.json.mediationsdk.model.NetworkSettings networkSettings, com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit) {
        if (networkSettings.isCustomNetwork() && android.text.TextUtils.isEmpty(networkSettings.getCustomNetworkPackage())) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.error("missing package definition for " + networkSettings.getProviderTypeForReflection());
            return null;
        }
        java.lang.String str = (networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkPackage() : l) + "." + (networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkAdapterName(ad_unit) : networkSettings.getProviderTypeForReflection());
        try {
            return (com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter) java.lang.Class.forName(str).getConstructor(com.json.mediationsdk.model.NetworkSettings.class).newInstance(networkSettings);
        } catch (java.lang.Exception unused) {
            if (networkSettings.isCustomNetwork()) {
                java.lang.String str2 = "failed to load " + str;
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(str2);
                a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
            }
            return null;
        }
    }

    private java.lang.String a(com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit) {
        return (ad_unit == null || android.text.TextUtils.isEmpty(ad_unit.toString())) ? "" : ad_unit.toString().substring(0, 1).toUpperCase(java.util.Locale.getDefault()) + ad_unit.toString().substring(1);
    }

    private void a(int i, java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (!android.text.TextUtils.isEmpty(str)) {
                jSONObject.put("reason", str);
            }
            com.json.jj.i().a(new com.json.wb(i, jSONObject));
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(com.json.mediationsdk.AbstractAdapter abstractAdapter) {
        if (!com.json.environment.StringUtils.toLowerCase(abstractAdapter.getProviderName()).equals(m) || this.g.size() == 0) {
            return;
        }
        for (com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit : this.g.keySet()) {
            try {
                org.json.JSONObject jSONObject = this.g.get(ad_unit);
                if (jSONObject != null && jSONObject.length() > 0 && (abstractAdapter instanceof com.json.mediationsdk.SetAPSInterface)) {
                    ((com.json.mediationsdk.SetAPSInterface) abstractAdapter).setAPSData(ad_unit, jSONObject);
                }
            } catch (java.lang.Exception e) {
                com.json.l9.d().a(e);
                java.lang.String str = "error while setting aps data: " + e.getLocalizedMessage();
                a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, str);
                b(str);
            }
        }
        this.g.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit, org.json.JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, "APSData is empty");
            a("APSData is empty");
            return;
        }
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(jSONObject.toString());
            if (!this.f2939a.isEmpty()) {
                for (com.json.mediationsdk.AbstractAdapter abstractAdapter : this.f2939a.values()) {
                    if (com.json.environment.StringUtils.toLowerCase(abstractAdapter.getProviderName()).equals(m) && (abstractAdapter instanceof com.json.mediationsdk.SetAPSInterface)) {
                        ((com.json.mediationsdk.SetAPSInterface) abstractAdapter).setAPSData(ad_unit, jSONObject2);
                        return;
                    }
                }
            }
            for (com.json.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper adapterBaseWrapper : this.b.values()) {
                if (com.json.environment.StringUtils.toLowerCase(adapterBaseWrapper.getSettings().getProviderTypeForReflection()).equals(m)) {
                    com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
                    if (adapterBaseInterface != null) {
                        ((com.json.mediationsdk.adunit.adapter.internal.AdapterAPSDataInterface) adapterBaseInterface).setAPSData(ad_unit, jSONObject2);
                        return;
                    }
                    return;
                }
            }
            synchronized (o) {
                this.g.put(ad_unit, jSONObject2);
            }
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            java.lang.String str = "error while setting APSData: " + e.getLocalizedMessage();
            a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, str);
            a(str);
        }
    }

    private void a(com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface adapterBaseInterface) {
        java.lang.Boolean bool = this.e;
        if (bool == null || !(adapterBaseInterface instanceof com.json.mediationsdk.adunit.adapter.AdapterDebugInterface)) {
            return;
        }
        try {
            ((com.json.mediationsdk.adunit.adapter.AdapterDebugInterface) adapterBaseInterface).setAdapterDebug(bool.booleanValue());
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            java.lang.String str = "error while setting adapterDebug of " + adapterBaseInterface.getClass().getSimpleName() + ": " + e.getLocalizedMessage();
            a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
            b(str);
        }
    }

    private void a(java.lang.String str) {
        com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, "AdapterRepository: " + str, 3);
    }

    private void a(org.json.JSONObject jSONObject) {
        java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
            com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER;
            if (!next.equalsIgnoreCase(ad_unit.toString())) {
                ad_unit = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL;
                if (!next.equalsIgnoreCase(ad_unit.toString())) {
                    ad_unit = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO;
                    if (next.equalsIgnoreCase(ad_unit.toString())) {
                    }
                }
            }
            a(ad_unit, jSONObjectOptJSONObject);
        }
    }

    private void a(org.json.JSONObject jSONObject, com.json.mediationsdk.AbstractAdapter abstractAdapter, java.lang.String str) {
        if (str.equalsIgnoreCase("IronSource") && this.h.compareAndSet(false, true)) {
            b("SDK5 earlyInit  <" + str + ">");
            try {
                abstractAdapter.earlyInit(this.c, this.d, jSONObject);
            } catch (java.lang.Exception e) {
                com.json.l9.d().a(e);
                java.lang.String str2 = "error while calling early init for " + abstractAdapter.getProviderName() + ": " + e.getLocalizedMessage();
                a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(str2);
            }
        }
    }

    public static boolean a(java.lang.String str, com.json.mediationsdk.AbstractAdapter abstractAdapter) {
        return (abstractAdapter == null || abstractAdapter.getProviderNetworkKey() == null || !abstractAdapter.getProviderNetworkKey().equalsIgnoreCase(str)) ? false : true;
    }

    public static boolean a(java.lang.String str, com.json.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper adapterBaseWrapper) {
        return (adapterBaseWrapper == null || adapterBaseWrapper.getSettings().getProviderNetworkKey() == null || !adapterBaseWrapper.getSettings().getProviderNetworkKey().equalsIgnoreCase(str)) ? false : true;
    }

    public static com.json.mediationsdk.c b() {
        return n;
    }

    private java.lang.String b(com.json.mediationsdk.model.NetworkSettings networkSettings) {
        return networkSettings.isMultipleInstances() ? networkSettings.getProviderDefaultInstance() : networkSettings.getProviderName();
    }

    private void b(com.json.mediationsdk.AbstractAdapter abstractAdapter) {
        java.lang.Boolean bool = this.e;
        if (bool != null) {
            try {
                abstractAdapter.setAdapterDebug(bool);
            } catch (java.lang.Throwable th) {
                com.json.l9.d().a(th);
                java.lang.String str = "error while setting adapterDebug of " + abstractAdapter.getProviderName() + ": " + th.getLocalizedMessage();
                a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
                b(str);
            }
        }
    }

    private void b(java.lang.String str) {
        com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, "AdapterRepository: " + str, 0);
    }

    private java.lang.String c(com.json.mediationsdk.model.NetworkSettings networkSettings, com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit, java.util.UUID uuid) {
        return (uuid != null ? uuid.toString() : "") + "-" + ad_unit.toString() + "-" + networkSettings.getProviderName();
    }

    private void c(com.json.mediationsdk.AbstractAdapter abstractAdapter) {
        for (java.lang.String str : this.f.keySet()) {
            try {
                java.util.List<java.lang.String> list = this.f.get(str);
                com.json.mediationsdk.utils.IronSourceUtils.sendAutomationLog(abstractAdapter.getProviderName() + "Adapter setMetaData key = " + str + ", values = " + list);
                if (list != null) {
                    abstractAdapter.setMetaData(str, list);
                }
            } catch (java.lang.Throwable th) {
                com.json.l9.d().a(th);
                java.lang.String str2 = "error while setting metadata of " + abstractAdapter.getProviderName() + ": " + th.getLocalizedMessage();
                a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
                b(str2);
            }
        }
    }

    public com.json.mediationsdk.AbstractAdapter a(com.json.mediationsdk.model.NetworkSettings networkSettings) {
        return a(b(networkSettings), networkSettings.getProviderTypeForReflection());
    }

    public com.json.mediationsdk.AbstractAdapter a(com.json.mediationsdk.model.NetworkSettings networkSettings, org.json.JSONObject jSONObject, boolean z) {
        java.lang.String coreSDKVersion;
        java.lang.String strB = b(networkSettings);
        java.lang.String providerTypeForReflection = z ? "IronSource" : networkSettings.getProviderTypeForReflection();
        synchronized (o) {
            if (this.f2939a.containsKey(strB)) {
                return this.f2939a.get(strB);
            }
            com.json.mediationsdk.AbstractAdapter abstractAdapterA = a(strB, providerTypeForReflection);
            if (abstractAdapterA == null) {
                a(strB + " adapter was not loaded");
                return null;
            }
            abstractAdapterA.setProviderNetworkKey(networkSettings.getProviderNetworkKey());
            try {
                coreSDKVersion = abstractAdapterA.getCoreSDKVersion();
            } catch (java.lang.Throwable th) {
                com.json.l9.d().a(th);
                java.lang.String str = "error while retrieving coreSDKVersion " + abstractAdapterA.getProviderName() + ": " + th.getLocalizedMessage();
                a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(str);
                coreSDKVersion = "Unknown";
            }
            b(strB + " was allocated (adapter version: " + abstractAdapterA.getVersion() + ", sdk version: " + coreSDKVersion + ")");
            c(abstractAdapterA);
            this.j.a(abstractAdapterA);
            a(abstractAdapterA);
            this.i.a(abstractAdapterA, networkSettings);
            b(abstractAdapterA);
            a(jSONObject, abstractAdapterA, providerTypeForReflection);
            this.f2939a.put(strB, abstractAdapterA);
            return abstractAdapterA;
        }
    }

    public com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, ?> a(com.json.mediationsdk.model.NetworkSettings networkSettings, com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit, java.util.UUID uuid) {
        com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, ?> baseAdAdapterA = a(networkSettings, ad_unit);
        if (baseAdAdapterA != null || networkSettings.isCustomNetwork()) {
            return baseAdAdapterA;
        }
        com.json.mediationsdk.AbstractAdapter abstractAdapterA = a(networkSettings);
        if (abstractAdapterA != null) {
            return com.json.mediationsdk.a.a(abstractAdapterA, networkSettings, ad_unit, uuid);
        }
        java.lang.String str = "error creating ad adapter " + networkSettings.getProviderName();
        a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
        com.json.mediationsdk.logger.IronLog.INTERNAL.error(str);
        return null;
    }

    public java.util.concurrent.ConcurrentHashMap<java.lang.String, com.json.mediationsdk.AbstractAdapter> a() {
        return this.f2939a;
    }

    public void a(com.json.mediationsdk.v vVar) {
        java.lang.String str;
        if (vVar.getNetworkData().length() == 0) {
            str = "empty network data";
        } else {
            if (!android.text.TextUtils.isEmpty(vVar.getNetworkName())) {
                this.j.a(vVar);
                vVar.a(this.f2939a.values(), this.b.values());
                vVar.b();
                if (com.json.environment.StringUtils.toLowerCase(vVar.getNetworkName()).equals(m)) {
                    a(vVar.getNetworkData());
                    return;
                }
                return;
            }
            str = "empty network key";
        }
        a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, str);
        a(str);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x008d A[Catch: all -> 0x00e6, TryCatch #1 {, blocks: (B:4:0x0005, B:6:0x0015, B:7:0x0039, B:9:0x003f, B:13:0x004a, B:14:0x007d, B:15:0x0087, B:17:0x008d, B:19:0x00a1, B:21:0x00a5, B:24:0x00ad, B:25:0x00e4, B:10:0x0045), top: B:32:0x0005, inners: #0, #2 }] */
    public void a(java.lang.String str, java.util.List<java.lang.String> list) {
        synchronized (o) {
            this.f.put(str, list);
            if (this.f2939a.isEmpty()) {
                for (com.json.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper adapterBaseWrapper : this.b.values()) {
                    com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
                    if (adapterBaseWrapper.getSettings().isCustomNetwork()) {
                    }
                }
            } else {
                com.json.mediationsdk.utils.IronSourceUtils.sendAutomationLog("setMetaData key = " + str + ", values = " + list);
                for (com.json.mediationsdk.AbstractAdapter abstractAdapter : this.f2939a.values()) {
                    try {
                        abstractAdapter.setMetaData(str, list);
                    } catch (java.lang.Throwable th) {
                        com.json.l9.d().a(th);
                        java.lang.String str2 = "error while setting metadata of " + abstractAdapter.getProviderName() + ": " + th.getLocalizedMessage();
                        a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
                        b(str2);
                    }
                }
                while (r0.hasNext()) {
                    com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface adapterBaseInterface2 = adapterBaseWrapper.getAdapterBaseInterface();
                    if (adapterBaseWrapper.getSettings().isCustomNetwork() && (adapterBaseInterface2 instanceof com.json.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface)) {
                        try {
                            ((com.json.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface) adapterBaseInterface2).setMetaData(str, list);
                        } catch (java.lang.Exception e) {
                            com.json.l9.d().a(e);
                            java.lang.String str3 = "error while setting metadata of " + adapterBaseInterface2.getClass().getSimpleName() + ": " + e.getLocalizedMessage();
                            a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str3);
                            b(str3);
                        }
                    }
                }
            }
            throw th;
        }
    }

    public void a(boolean z) {
        synchronized (o) {
            this.e = java.lang.Boolean.valueOf(z);
            java.util.Iterator<com.json.mediationsdk.AbstractAdapter> it = this.f2939a.values().iterator();
            while (it.hasNext()) {
                b(it.next());
            }
        }
    }

    public com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface b(com.json.mediationsdk.model.NetworkSettings networkSettings, com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit, java.util.UUID uuid) {
        org.json.JSONObject rewardedVideoSettings;
        java.lang.String strB = networkSettings.isCustomNetwork() ? b(networkSettings) : c(networkSettings, ad_unit, uuid);
        if (this.b.containsKey(strB)) {
            return this.b.get(strB).getAdapterBaseInterface();
        }
        com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface adapterBaseInterfaceA = a(strB, networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkAdapterName(null) : networkSettings.getProviderTypeForReflection(), networkSettings);
        if (adapterBaseInterfaceA != null || networkSettings.isCustomNetwork()) {
            this.j.a(this.b.put(strB, new com.json.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper(adapterBaseInterfaceA, networkSettings)));
            return adapterBaseInterfaceA;
        }
        int i = com.ironsource.mediationsdk.c.a.f2940a[ad_unit.ordinal()];
        if (i == 1) {
            rewardedVideoSettings = networkSettings.getRewardedVideoSettings();
        } else if (i == 2) {
            rewardedVideoSettings = networkSettings.getInterstitialSettings();
        } else if (i != 3) {
            rewardedVideoSettings = i != 4 ? null : networkSettings.getNativeAdSettings();
        } else {
            rewardedVideoSettings = networkSettings.getBannerSettings();
        }
        com.json.mediationsdk.AbstractAdapter abstractAdapterA = a(networkSettings, rewardedVideoSettings, false);
        if (abstractAdapterA != null) {
            com.json.mediationsdk.u uVar = new com.json.mediationsdk.u(abstractAdapterA);
            this.b.put(strB, new com.json.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper(uVar, networkSettings));
            return uVar;
        }
        java.lang.String str = "error creating network adapter " + networkSettings.getProviderName();
        a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
        com.json.mediationsdk.logger.IronLog.INTERNAL.error(str);
        return null;
    }

    public void b(java.lang.String str, java.lang.String str2) {
        this.c = str;
        this.d = str2;
    }

    public void b(boolean z) {
        synchronized (o) {
            this.i.a(z);
            this.i.a(this.f2939a, this.b);
        }
    }

    public java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<java.lang.String>> c() {
        return this.f;
    }

    public java.util.concurrent.ConcurrentHashMap<java.lang.String, com.json.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper> d() {
        return this.b;
    }

    public void e() {
        this.f2939a.clear();
        this.b.clear();
    }
}
