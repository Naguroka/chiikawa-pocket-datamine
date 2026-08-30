package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ze {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.TreeMap f1570a;
    private static final java.util.Map b;
    private static final java.util.List c;
    private static org.json.JSONArray d;
    private static final java.util.Map e = new java.util.HashMap();
    private static final java.lang.Object f = new java.lang.Object();
    private static final java.util.Map g = java.util.Collections.synchronizedMap(new java.util.HashMap(1));

    static {
        java.util.TreeMap treeMap = new java.util.TreeMap();
        f1570a = treeMap;
        treeMap.put("com.applovin.mediation.adapters.AdjoeAdsMediationAdapter", "adjoe Ads");
        treeMap.put("com.applovin.mediation.adapters.AmazonAdMarketplaceMediationAdapter", "Amazon Publisher Services");
        treeMap.put("com.applovin.mediation.adapters.AppLovinMediationAdapter", "AppLovin");
        treeMap.put("com.applovin.mediation.adapters.BidMachineMediationAdapter", "BidMachine");
        treeMap.put("com.applovin.mediation.adapters.BigoAdsMediationAdapter", "Bigo Ads");
        treeMap.put("com.applovin.mediation.adapters.ByteDanceMediationAdapter", "Pangle");
        treeMap.put("com.applovin.mediation.adapters.ChartboostMediationAdapter", "Chartboost");
        treeMap.put("com.applovin.mediation.adapters.CSJMediationAdapter", "CSJ");
        treeMap.put("com.applovin.mediation.adapters.DataseatMediationAdapter", "Dataseat");
        treeMap.put("com.applovin.mediation.adapters.FacebookMediationAdapter", "Facebook");
        treeMap.put("com.applovin.mediation.adapters.GoogleMediationAdapter", "AdMob");
        treeMap.put("com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter", "Google Ad Manager");
        treeMap.put("com.applovin.mediation.adapters.HyprMXMediationAdapter", "HyprMX");
        treeMap.put("com.applovin.mediation.adapters.InMobiMediationAdapter", "InMobi");
        treeMap.put("com.applovin.mediation.adapters.InneractiveMediationAdapter", "Fyber");
        treeMap.put("com.applovin.mediation.adapters.IronSourceMediationAdapter", "ironSource");
        treeMap.put("com.applovin.mediation.adapters.LineMediationAdapter", "LINE");
        treeMap.put("com.applovin.mediation.adapters.MaioMediationAdapter", "Maio");
        treeMap.put("com.applovin.mediation.adapters.MintegralMediationAdapter", "Mintegral");
        treeMap.put("com.applovin.mediation.adapters.MobileFuseMediationAdapter", "MobileFuse");
        treeMap.put("com.applovin.mediation.adapters.MolocoMediationAdapter", "Moloco");
        treeMap.put("com.applovin.mediation.adapters.MyTargetMediationAdapter", "myTarget");
        treeMap.put("com.applovin.mediation.adapters.OguryMediationAdapter", "Ogury");
        treeMap.put("com.applovin.mediation.adapters.OguryPresageMediationAdapter", "Ogury Presage");
        treeMap.put("com.applovin.mediation.adapters.PangleMediationAdapter", "Pangle");
        treeMap.put("com.applovin.mediation.adapters.PubMaticMediationAdapter", "PubMatic");
        treeMap.put("com.applovin.mediation.adapters.SayGamesMediationAdapter", "SayGames");
        treeMap.put("com.applovin.mediation.adapters.SmaatoMediationAdapter", "Smaato");
        treeMap.put("com.applovin.mediation.adapters.TencentMediationAdapter", "Tencent");
        treeMap.put("com.applovin.mediation.adapters.UnityAdsMediationAdapter", "Unity Ads");
        treeMap.put("com.applovin.mediation.adapters.VerveMediationAdapter", "Verve");
        treeMap.put("com.applovin.mediation.adapters.VungleMediationAdapter", "Vungle");
        treeMap.put("com.applovin.mediation.adapters.YandexMediationAdapter", "Yandex");
        treeMap.put("com.applovin.mediation.adapters.LinkedInDSPAdapter", "LinkedIn");
        treeMap.put("com.applovin.mediation.adapters.AdColonyMediationAdapter", "AdColony");
        treeMap.put("com.applovin.mediation.adapters.AmazonMediationAdapter", "Amazon");
        treeMap.put("com.applovin.mediation.adapters.AmazonPublisherServicesMediationAdapter", "Amazon Publisher Services");
        treeMap.put("com.applovin.mediation.adapters.CriteoMediationAdapter", "Criteo");
        treeMap.put("com.applovin.mediation.adapters.NendMediationAdapter", "Nend");
        treeMap.put("com.applovin.mediation.adapters.SnapMediationAdapter", "Snap");
        treeMap.put("com.applovin.mediation.adapters.TapjoyMediationAdapter", "Tapjoy");
        treeMap.put("com.applovin.mediation.adapters.VerizonAdsMediationAdapter", "Verizon");
        treeMap.put("com.applovin.mediation.adapters.YahooMediationAdapter", "Yahoo");
        treeMap.put("com.applovin.mediation.ALYsoNetworkMediationAdapter", "YSO Network");
        treeMap.put("com.applovin.mediation.adapters.YsoNetworkMediationAdapter", "YSO Network");
        c = new java.util.ArrayList(treeMap.keySet());
        java.util.HashMap map = new java.util.HashMap();
        b = map;
        map.put("com.applovin.mediation.adapters.BidMachineMediationAdapter", "3.0.1.1");
        map.put("com.applovin.mediation.adapters.ByteDanceMediationAdapter", "6.2.0.5.2");
        map.put("com.applovin.mediation.adapters.ChartboostMediationAdapter", "9.7.0.3");
        map.put("com.applovin.mediation.adapters.FacebookMediationAdapter", "6.17.0.1");
        map.put("com.applovin.mediation.adapters.GoogleMediationAdapter", "23.3.0.1");
        map.put("com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter", "23.3.0.1");
        map.put("com.applovin.mediation.adapters.HyprMXMediationAdapter", "6.4.2.1");
        map.put("com.applovin.mediation.adapters.InMobiMediationAdapter", "10.7.7.1");
        map.put("com.applovin.mediation.adapters.InneractiveMediationAdapter", "8.3.1.1");
        map.put("com.applovin.mediation.adapters.IronSourceMediationAdapter", "8.3.0.0.2");
        map.put("com.applovin.mediation.adapters.LineMediationAdapter", "2024.8.27.1");
        map.put("com.applovin.mediation.adapters.MintegralMediationAdapter", "16.8.51.1");
        map.put("com.applovin.mediation.adapters.MobileFuseMediationAdapter", "1.7.6.1");
        map.put("com.applovin.mediation.adapters.MolocoMediationAdapter", "3.1.0.1");
        map.put("com.applovin.mediation.adapters.MyTargetMediationAdapter", "5.22.1.1");
        map.put("com.applovin.mediation.adapters.PubMaticMediationAdapter", "3.9.0.2");
        map.put("com.applovin.mediation.adapters.SmaatoMediationAdapter", "22.7.0.1");
        map.put("com.applovin.mediation.adapters.UnityAdsMediationAdapter", "4.12.2.1");
        map.put("com.applovin.mediation.adapters.VerveMediationAdapter", "3.0.4.1");
        map.put("com.applovin.mediation.adapters.VungleMediationAdapter", "7.4.1.1");
        map.put("com.applovin.mediation.adapters.YandexMediationAdapter", "7.4.0.1");
    }

    public static com.applovin.mediation.adapter.MaxAdapter a(java.lang.String str, com.applovin.impl.sdk.j jVar) {
        if (android.text.TextUtils.isEmpty(str)) {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.I().b("AppLovinSdk", "Failed to create adapter instance. No class name provided");
            }
            return null;
        }
        try {
            java.lang.Class<?> cls = java.lang.Class.forName(str);
            if (com.applovin.mediation.adapter.MaxAdapter.class.isAssignableFrom(cls)) {
                return (com.applovin.mediation.adapter.MaxAdapter) cls.getConstructor(com.applovin.sdk.AppLovinSdk.class).newInstance(jVar.q0());
            }
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.I().b("AppLovinSdk", str + " error: not an instance of '" + com.applovin.mediation.adapter.MaxAdapter.class.getName() + "'.");
            }
            return null;
        } catch (java.lang.ClassNotFoundException unused) {
        } catch (java.lang.Throwable th) {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.I().a("AppLovinSdk", "Failed to load: " + str, th);
            }
        }
    }

    public static boolean b(java.lang.Object obj) {
        return (obj instanceof com.applovin.impl.fe) && "APPLOVIN".equals(((com.applovin.impl.fe) obj).k());
    }

    private static void b(com.applovin.impl.sdk.j jVar) {
        com.applovin.mediation.adapter.MaxAdapter maxAdapterA;
        synchronized (f) {
            for (int i = 0; i < d.length(); i++) {
                org.json.JSONObject jSONObject = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(d, i, (org.json.JSONObject) null);
                java.lang.String string = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "class", "");
                if (!com.applovin.impl.sdk.utils.StringUtils.isValidString(com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "sdk_version", "")) && (maxAdapterA = a(string, jVar)) != null) {
                    java.lang.String strA = a(maxAdapterA);
                    if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strA)) {
                        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "sdk_version", strA);
                        e.put(string, new com.applovin.impl.mediation.MaxMediatedNetworkInfoImpl(jSONObject));
                    }
                }
            }
        }
    }

    public static java.lang.String a(com.applovin.mediation.adapter.MaxAdapter maxAdapter) {
        try {
            return com.applovin.impl.sdk.utils.StringUtils.emptyIfNull(maxAdapter.getSdkVersion());
        } catch (java.lang.Throwable th) {
            com.applovin.impl.sdk.n.c("MediationUtils", "Failed to retrieve SDK version for adapter: " + maxAdapter, th);
            return "";
        }
    }

    public static com.applovin.sdk.AppLovinSdkUtils.Size a(int i, com.applovin.mediation.MaxAdFormat maxAdFormat, android.content.Context context) {
        if (i < 0) {
            try {
                i = com.applovin.sdk.AppLovinSdkUtils.pxToDp(context, com.applovin.impl.z3.a(context).x);
            } catch (java.lang.Throwable unused) {
                return maxAdFormat.getSize();
            }
        }
        java.util.Map map = g;
        com.applovin.sdk.AppLovinSdkUtils.Size size = (com.applovin.sdk.AppLovinSdkUtils.Size) map.get(java.lang.Integer.valueOf(i));
        if (size != null) {
            return size;
        }
        java.lang.Class<?> cls = java.lang.Class.forName("com.google.android.gms.ads.AdSize");
        java.lang.reflect.Method method = cls.getMethod("getCurrentOrientationAnchoredAdaptiveBannerAdSize", android.content.Context.class, java.lang.Integer.TYPE);
        java.lang.reflect.Method method2 = cls.getMethod("getWidth", new java.lang.Class[0]);
        java.lang.reflect.Method method3 = cls.getMethod("getHeight", new java.lang.Class[0]);
        java.lang.Object objInvoke = method.invoke(null, context, java.lang.Integer.valueOf(i));
        com.applovin.sdk.AppLovinSdkUtils.Size size2 = new com.applovin.sdk.AppLovinSdkUtils.Size(((java.lang.Integer) method2.invoke(objInvoke, new java.lang.Object[0])).intValue(), ((java.lang.Integer) method3.invoke(objInvoke, new java.lang.Object[0])).intValue());
        map.put(java.lang.Integer.valueOf(i), size2);
        return size2;
    }

    public static boolean a(java.lang.Object obj) {
        return (obj instanceof com.applovin.impl.sdk.ad.b) && com.applovin.impl.sdk.utils.StringUtils.isValidString(((com.applovin.impl.sdk.ad.b) obj).I());
    }

    private static boolean a(com.applovin.mediation.adapter.MaxAdapter maxAdapter, java.lang.String str) {
        return android.text.TextUtils.isEmpty(str) || com.applovin.impl.yp.a(maxAdapter.getAdapterVersion(), str) >= 0;
    }

    public static boolean a(org.json.JSONObject jSONObject, java.lang.String str, com.applovin.impl.sdk.j jVar) {
        if (!com.applovin.impl.sdk.utils.JsonUtils.containsJSONObjectContainingInt(jSONObject.optJSONArray("no_fill_reason"), com.json.mediationsdk.logger.IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES, "code")) {
            return false;
        }
        jVar.D().a(com.applovin.impl.ka.V, "invalid_or_disabled_ad_unit_id", com.applovin.impl.sdk.utils.CollectionUtils.hashMap("ad_unit_id", str), "invalid_or_disabled_ad_unit_id" + str);
        return true;
    }

    public static org.json.JSONArray a(com.applovin.impl.sdk.j jVar) {
        synchronized (f) {
            if (d != null) {
                b(jVar);
                return d;
            }
            d = new org.json.JSONArray();
            for (java.lang.String str : c) {
                com.applovin.mediation.adapter.MaxAdapter maxAdapterA = a(str, jVar);
                if (maxAdapterA != null) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        jSONObject.put("name", f1570a.get(str));
                        jSONObject.put("class", str);
                        jSONObject.put("sdk_version", a(maxAdapterA));
                        jSONObject.put("version", maxAdapterA.getAdapterVersion());
                        jSONObject.put("is_supported", a(maxAdapterA, (java.lang.String) b.get(str)));
                    } catch (java.lang.Throwable unused) {
                    }
                    d.put(jSONObject);
                    e.put(str, new com.applovin.impl.mediation.MaxMediatedNetworkInfoImpl(jSONObject));
                }
            }
            return d;
        }
    }

    public static com.applovin.mediation.MaxMediatedNetworkInfo a(java.lang.String str) {
        com.applovin.mediation.MaxMediatedNetworkInfo maxMediatedNetworkInfo;
        synchronized (f) {
            maxMediatedNetworkInfo = (com.applovin.mediation.MaxMediatedNetworkInfo) e.get(str);
        }
        if (maxMediatedNetworkInfo != null) {
            return maxMediatedNetworkInfo;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "class", str);
        return new com.applovin.impl.mediation.MaxMediatedNetworkInfoImpl(jSONObject);
    }
}
