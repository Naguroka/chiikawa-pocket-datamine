package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class rt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.Map<com.ironsource.mediationsdk.IronSource.AD_UNIT, com.json.n1> f3250a = new java.util.HashMap();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3251a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[com.unity3d.mediation.LevelPlay.AdFormat.values().length];
            b = iArr;
            try {
                iArr[com.unity3d.mediation.LevelPlay.AdFormat.REWARDED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                b[com.unity3d.mediation.LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                b[com.unity3d.mediation.LevelPlay.AdFormat.BANNER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                b[com.unity3d.mediation.LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[com.ironsource.mediationsdk.IronSource.AD_UNIT.values().length];
            f3251a = iArr2;
            try {
                iArr2[com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f3251a[com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                f3251a[com.ironsource.mediationsdk.IronSource.AD_UNIT.NATIVE_AD.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                f3251a[com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.ironsource.mediationsdk.IronSource.AD_UNIT f3252a;

        public b(com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit) {
            this.f3252a = ad_unit;
        }

        private java.lang.String b() {
            com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit = this.f3252a;
            return ad_unit != null ? ad_unit.name() : "";
        }

        public java.lang.String a() {
            return a(null);
        }

        public java.lang.String a(java.lang.String str) {
            return a(str, null);
        }

        public java.lang.String a(java.lang.String str, java.lang.String str2) {
            java.lang.String str3 = b() + (android.text.TextUtils.isEmpty(str2) ? "" : " - " + str2);
            return android.text.TextUtils.isEmpty(str) ? str3 : str3 + " - " + str;
        }
    }

    public static com.json.mediationsdk.IronSourceSegment a() {
        return com.json.mediationsdk.p.m().t();
    }

    private static com.json.n1 a(com.json.t1 t1Var) {
        java.util.Map<com.ironsource.mediationsdk.IronSource.AD_UNIT, com.json.n1> map = f3250a;
        if (map.containsKey(t1Var.getAdProperties().getAdFormat())) {
            return map.get(t1Var.getAdProperties().getAdFormat());
        }
        com.json.n1 n1Var = new com.json.n1();
        map.put(t1Var.getAdProperties().getAdFormat(), n1Var);
        return n1Var;
    }

    public static com.json.p2 a(com.json.t1 t1Var, int i) {
        return a(t1Var).a(t1Var.getAdProperties().getAdUnitId(), t1Var.m(), i);
    }

    public static com.ironsource.rt.b a(com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit) {
        return new com.ironsource.rt.b(ad_unit);
    }

    public static java.lang.String a(com.unity3d.mediation.LevelPlay.AdFormat adFormat) {
        int i = com.ironsource.rt.a.b[adFormat.ordinal()];
        if (i == 1) {
            return "rewarded";
        }
        if (i == 2) {
            return "interstitial";
        }
        if (i != 3) {
            return i != 4 ? "" : "nativeAd";
        }
        return "banner";
    }

    public static void a(int i, org.json.JSONObject jSONObject) {
        com.json.wq.i().a(new com.json.wb(i, com.json.hk.a(com.json.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(false), jSONObject)));
    }

    public static void a(java.lang.Exception exc) {
        com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, "Exception", exc);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("reason", exc.getMessage());
        } catch (org.json.JSONException e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
        a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_LOAD_ARM_DATA_PARSE_ERROR, jSONObject);
    }

    public static void a(java.lang.Throwable th) {
        com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, "SafeRunnable", th);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("reason", th.getMessage());
        } catch (org.json.JSONException e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
        a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_SDK_INTERNAL_ERROR, jSONObject);
    }

    public static boolean a(com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface adapterBaseInterface, com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit, java.lang.String str) {
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose();
        if (com.json.environment.ContextProvider.getInstance().getCurrentActiveActivity() != null || !(adapterBaseInterface instanceof com.json.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface) || !((com.json.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface) adapterBaseInterface).isUsingActivityBeforeImpression(ad_unit)) {
            return false;
        }
        ironLog.verbose(str + " - is using activity before impression and activity is null");
        return true;
    }

    public static int b(com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit) {
        com.ironsource.p7.e eVar;
        int i = com.ironsource.rt.a.f3251a[ad_unit.ordinal()];
        if (i == 1) {
            eVar = com.ironsource.p7.e.REWARDED_VIDEO;
        } else if (i == 2) {
            eVar = com.ironsource.p7.e.INTERSTITIAL;
        } else if (i != 3) {
            eVar = i != 4 ? com.ironsource.p7.e.NOT_SUPPORTED : com.ironsource.p7.e.BANNER;
        } else {
            eVar = com.ironsource.p7.e.NATIVE_AD;
        }
        return eVar.a();
    }
}
