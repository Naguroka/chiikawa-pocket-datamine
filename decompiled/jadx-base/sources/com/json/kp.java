package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class kp implements com.json.wf, com.ironsource.wf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.String f2859a = "CappingManager.IS_DELIVERY_ENABLED";
    private static final java.lang.String b = "CappingManager.IS_CAPPING_ENABLED";
    private static final java.lang.String c = "CappingManager.IS_PACING_ENABLED";
    private static final java.lang.String d = "CappingManager.MAX_NUMBER_OF_SHOWS";
    private static final java.lang.String e = "CappingManager.CAPPING_TYPE";
    private static final java.lang.String f = "CappingManager.SECONDS_BETWEEN_SHOWS";
    private static final java.lang.String g = "CappingManager.CURRENT_NUMBER_OF_SHOWS";
    private static final java.lang.String h = "CappingManager.CAPPING_TIME_THRESHOLD";
    private static final java.lang.String i = "CappingManager.TIME_OF_THE_PREVIOUS_SHOW";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2860a;

        static {
            int[] iArr = new int[com.json.lp.values().length];
            f2860a = iArr;
            try {
                iArr[com.json.lp.PER_DAY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f2860a[com.json.lp.PER_HOUR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    public enum b {
        CAPPED_PER_DELIVERY,
        CAPPED_PER_COUNT,
        CAPPED_PER_PACE,
        NOT_CAPPED
    }

    private long a(com.json.lp lpVar) {
        java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getTimeZone("UTC"));
        int i2 = com.ironsource.kp.a.f2860a[lpVar.ordinal()];
        if (i2 == 1) {
            calendar.set(14, 0);
            calendar.set(13, 0);
            calendar.set(12, 0);
            calendar.set(11, 0);
            calendar.add(6, 1);
        } else if (i2 == 2) {
            calendar.set(14, 0);
            calendar.set(13, 0);
            calendar.set(12, 0);
            calendar.add(11, 1);
        }
        return calendar.getTimeInMillis();
    }

    private java.lang.String a(com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit) {
        if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO) {
            return com.json.mediationsdk.utils.IronSourceConstants.REWARDED_VIDEO_AD_UNIT;
        }
        if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL) {
            return "Interstitial";
        }
        if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER) {
            return "Banner";
        }
        return ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.NATIVE_AD ? com.json.mediationsdk.utils.IronSourceConstants.NATIVE_AD_UNIT : ad_unit.toString();
    }

    private java.lang.String a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return str + "_" + str2 + "_" + str3;
    }

    private void a(android.content.Context context, java.lang.String str, java.lang.String str2) {
        com.json.lp lpVar;
        int i2 = 0;
        if (com.json.mediationsdk.utils.IronSourceUtils.getBooleanFromSharedPrefs(context, a(str, c, str2), false)) {
            com.json.mediationsdk.utils.IronSourceUtils.saveLongToSharedPrefs(context, a(str, i, str2), java.lang.System.currentTimeMillis());
        }
        if (com.json.mediationsdk.utils.IronSourceUtils.getBooleanFromSharedPrefs(context, a(str, b, str2), false)) {
            java.lang.String strA = a(str, g, str2);
            int intFromSharedPrefs = com.json.mediationsdk.utils.IronSourceUtils.getIntFromSharedPrefs(context, strA, 0);
            if (intFromSharedPrefs == 0) {
                java.lang.String stringFromSharedPrefs = com.json.mediationsdk.utils.IronSourceUtils.getStringFromSharedPrefs(context, a(str, e, str2), com.json.lp.PER_DAY.toString());
                com.json.lp[] lpVarArrValues = com.json.lp.values();
                int length = lpVarArrValues.length;
                while (true) {
                    if (i2 >= length) {
                        lpVar = null;
                        break;
                    }
                    lpVar = lpVarArrValues[i2];
                    if (lpVar.f2896a.equals(stringFromSharedPrefs)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                com.json.mediationsdk.utils.IronSourceUtils.saveLongToSharedPrefs(context, a(str, h, str2), a(lpVar));
            }
            com.json.mediationsdk.utils.IronSourceUtils.saveIntToSharedPrefs(context, strA, intFromSharedPrefs + 1);
        }
    }

    private void a(android.content.Context context, java.lang.String str, java.lang.String str2, com.json.hp hpVar) {
        boolean zE = hpVar.e();
        com.json.mediationsdk.utils.IronSourceUtils.saveBooleanToSharedPrefs(context, a(str, f2859a, str2), zE);
        if (zE) {
            boolean zD = hpVar.d();
            com.json.mediationsdk.utils.IronSourceUtils.saveBooleanToSharedPrefs(context, a(str, b, str2), zD);
            if (zD) {
                com.json.mediationsdk.utils.IronSourceUtils.saveIntToSharedPrefs(context, a(str, d, str2), hpVar.b());
                com.json.mediationsdk.utils.IronSourceUtils.saveStringToSharedPrefs(context, a(str, e, str2), hpVar.a().toString());
            }
            boolean zF = hpVar.f();
            com.json.mediationsdk.utils.IronSourceUtils.saveBooleanToSharedPrefs(context, a(str, c, str2), zF);
            if (zF) {
                com.json.mediationsdk.utils.IronSourceUtils.saveIntToSharedPrefs(context, a(str, f, str2), hpVar.c());
            }
        }
    }

    private com.ironsource.kp.b b(android.content.Context context, java.lang.String str, java.lang.String str2) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (!com.json.mediationsdk.utils.IronSourceUtils.getBooleanFromSharedPrefs(context, a(str, f2859a, str2), true)) {
            return com.ironsource.kp.b.CAPPED_PER_DELIVERY;
        }
        if (com.json.mediationsdk.utils.IronSourceUtils.getBooleanFromSharedPrefs(context, a(str, c, str2), false)) {
            if (jCurrentTimeMillis - com.json.mediationsdk.utils.IronSourceUtils.getLongFromSharedPrefs(context, a(str, i, str2), 0L) < com.json.mediationsdk.utils.IronSourceUtils.getIntFromSharedPrefs(context, a(str, f, str2), 0) * 1000) {
                return com.ironsource.kp.b.CAPPED_PER_PACE;
            }
        }
        if (com.json.mediationsdk.utils.IronSourceUtils.getBooleanFromSharedPrefs(context, a(str, b, str2), false)) {
            int intFromSharedPrefs = com.json.mediationsdk.utils.IronSourceUtils.getIntFromSharedPrefs(context, a(str, d, str2), 0);
            java.lang.String strA = a(str, g, str2);
            int intFromSharedPrefs2 = com.json.mediationsdk.utils.IronSourceUtils.getIntFromSharedPrefs(context, strA, 0);
            java.lang.String strA2 = a(str, h, str2);
            if (jCurrentTimeMillis >= com.json.mediationsdk.utils.IronSourceUtils.getLongFromSharedPrefs(context, strA2, 0L)) {
                com.json.mediationsdk.utils.IronSourceUtils.saveIntToSharedPrefs(context, strA, 0);
                com.json.mediationsdk.utils.IronSourceUtils.saveLongToSharedPrefs(context, strA2, 0L);
            } else if (intFromSharedPrefs2 >= intFromSharedPrefs) {
                return com.ironsource.kp.b.CAPPED_PER_COUNT;
            }
        }
        return com.ironsource.kp.b.NOT_CAPPED;
    }

    @Override // com.json.wf
    public synchronized com.ironsource.kp.b a(android.content.Context context, com.json.mediationsdk.model.BasePlacement basePlacement, com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit) {
        try {
            if (context == null) {
                return com.ironsource.kp.b.NOT_CAPPED;
            }
            if (basePlacement == null) {
                return com.ironsource.kp.b.NOT_CAPPED;
            }
            java.lang.String strA = a(ad_unit);
            if (basePlacement.getCom.ironsource.op.d java.lang.String() == null) {
                return com.ironsource.kp.b.NOT_CAPPED;
            }
            if (basePlacement.getPlacementAvailabilitySettings() == null) {
                return com.ironsource.kp.b.NOT_CAPPED;
            }
            return b(context, strA, basePlacement.getCom.ironsource.op.d java.lang.String());
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // com.ironsource.wf.a
    public synchronized void a(android.content.Context context, java.lang.String str, com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit) {
        if (context == null) {
            return;
        }
        if (str == null) {
            return;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        a(context, a(ad_unit), str);
    }

    @Override // com.json.wf
    public synchronized boolean b(android.content.Context context, com.json.mediationsdk.model.BasePlacement basePlacement, com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit) {
        return a(context, basePlacement, ad_unit) != com.ironsource.kp.b.NOT_CAPPED;
    }

    @Override // com.ironsource.wf.a
    public synchronized void c(android.content.Context context, com.json.mediationsdk.model.BasePlacement basePlacement, com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit) {
        if (context == null || basePlacement == null) {
            return;
        }
        com.json.hp placementAvailabilitySettings = basePlacement.getPlacementAvailabilitySettings();
        if (placementAvailabilitySettings == null) {
            return;
        }
        a(context, a(ad_unit), basePlacement.getCom.ironsource.op.d java.lang.String(), placementAvailabilitySettings);
    }
}
