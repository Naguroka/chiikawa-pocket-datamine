package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class va {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.String f3491a = "va";

    public static org.json.JSONObject a(android.content.Context context) {
        com.json.sdk.utils.SDKUtils.loadGoogleAdvertiserInfo(context);
        java.lang.String advertiserId = com.json.sdk.utils.SDKUtils.getAdvertiserId();
        java.lang.String limitAdTracking = com.json.sdk.utils.SDKUtils.getLimitAdTracking();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            if (!android.text.TextUtils.isEmpty(advertiserId)) {
                com.json.sdk.utils.Logger.i(f3491a, "add AID");
                jSONObject.put("deviceIds[AID]", com.json.sdk.utils.SDKUtils.encodeString(advertiserId));
            }
            if (!android.text.TextUtils.isEmpty(limitAdTracking)) {
                com.json.sdk.utils.Logger.i(f3491a, "add LAT");
                jSONObject.put(com.ironsource.y8.i.M, java.lang.Boolean.parseBoolean(limitAdTracking));
            }
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
        return jSONObject;
    }

    private static void a(android.content.Context context, org.json.JSONObject jSONObject) {
        com.json.Cif cifF = com.json.im.S().f();
        try {
            if (a(com.ironsource.y8.i.m0)) {
                jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.m0), cifF.c(context));
            }
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    private static void a(org.json.JSONObject jSONObject) {
        com.json.Cif cifF = com.json.im.S().f();
        try {
            a(jSONObject, com.ironsource.y8.i.H, java.lang.String.valueOf(cifF.d()));
            a(jSONObject, com.ironsource.y8.i.I, java.lang.String.valueOf(cifF.j()));
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    private static void a(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2) {
        try {
            if (android.text.TextUtils.isEmpty(str2)) {
                return;
            }
            jSONObject.put(str, com.json.sdk.utils.SDKUtils.encodeString(str2));
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    private static boolean a(java.lang.String str) {
        return com.json.sdk.utils.SDKUtils.getControllerConfigAsJSONObject().optBoolean(str);
    }

    public static org.json.JSONObject b(android.content.Context context) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        a(jSONObject);
        d(context, jSONObject);
        c(jSONObject);
        b(context, jSONObject);
        g(context, jSONObject);
        e(context, jSONObject);
        b(jSONObject);
        f(context, jSONObject);
        c(context, jSONObject);
        a(context, jSONObject);
        h(context, jSONObject);
        return jSONObject;
    }

    private static void b(android.content.Context context, org.json.JSONObject jSONObject) {
        try {
            jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.Y), com.json.im.S().f().x(context));
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    private static void b(org.json.JSONObject jSONObject) {
        com.json.Cif cifF = com.json.im.S().f();
        try {
            if (a(com.ironsource.y8.i.i0)) {
                jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.i0), cifF.c());
            }
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    public static org.json.JSONObject c(android.content.Context context) {
        com.json.Cif cifF = com.json.im.S().f();
        com.json.wa waVarB = com.json.wa.b(context);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String strD = waVarB.d();
            if (strD != null) {
                jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.k), com.json.sdk.utils.SDKUtils.encodeString(strD));
            }
            java.lang.String strC = waVarB.c();
            if (strC != null) {
                jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.l), com.json.sdk.utils.SDKUtils.encodeString(strC));
            }
            java.lang.String strE = waVarB.e();
            if (strE != null) {
                jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.m), com.json.sdk.utils.SDKUtils.encodeString(strE));
            }
            java.lang.String strF = waVarB.f();
            if (strF != null) {
                jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.n), strF.replaceAll("[^0-9/.]", ""));
            }
            java.lang.String strF2 = waVarB.f();
            if (strF2 != null) {
                jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.o), com.json.sdk.utils.SDKUtils.encodeString(strF2));
            }
            jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.p), java.lang.String.valueOf(waVarB.a()));
            jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.q), com.json.sdk.utils.SDKUtils.encodeString(com.json.sdk.utils.SDKUtils.getSDKVersion()));
            if (waVarB.b() != null && waVarB.b().length() > 0) {
                jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.r), com.json.sdk.utils.SDKUtils.encodeString(waVarB.b()));
            }
            java.lang.String language = context.getResources().getConfiguration().locale.getLanguage();
            if (!android.text.TextUtils.isEmpty(language)) {
                jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.x), com.json.sdk.utils.SDKUtils.encodeString(language.toUpperCase(java.util.Locale.getDefault())));
            }
            if (a(com.ironsource.y8.i.j0)) {
                jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.j0), com.json.sdk.utils.SDKUtils.encodeString(java.lang.String.valueOf(cifF.h(context))));
            }
            java.lang.String strG = com.json.z3.g(context);
            if (!android.text.TextUtils.isEmpty(strG)) {
                jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString("bundleId"), com.json.sdk.utils.SDKUtils.encodeString(strG));
            }
            java.lang.String strValueOf = java.lang.String.valueOf(cifF.h());
            if (!android.text.TextUtils.isEmpty(strValueOf)) {
                jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.K), com.json.sdk.utils.SDKUtils.encodeString(strValueOf));
            }
            java.lang.String strValueOf2 = java.lang.String.valueOf(cifF.f());
            if (!android.text.TextUtils.isEmpty(strValueOf2)) {
                jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.O), com.json.sdk.utils.SDKUtils.encodeString(strValueOf2));
            }
            jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString("gpi"), com.json.zo.d(context));
            jSONObject.put("mcc", com.json.u8.b(context));
            jSONObject.put("mnc", com.json.u8.c(context));
            jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.S), com.json.u8.f(context));
            jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.R), com.json.sdk.utils.SDKUtils.encodeString(com.json.u8.g(context)));
            jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.V), com.json.z3.f(context));
            jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.X), com.json.z3.d(context));
            jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.W), com.json.sdk.utils.SDKUtils.encodeString(com.json.z3.b(context)));
            jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString("stid"), com.json.zo.c(context));
            java.lang.String strE2 = com.json.z3.e(context);
            if (!android.text.TextUtils.isEmpty(strE2)) {
                jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.c0), com.json.sdk.utils.SDKUtils.encodeString(strE2));
            }
            jSONObject.put(com.ironsource.y8.i.d0, com.json.sdk.utils.SDKUtils.encodeString(java.lang.String.valueOf(cifF.i())));
            jSONObject.put(com.ironsource.y8.i.e0, com.json.sdk.utils.SDKUtils.encodeString(java.lang.String.valueOf(cifF.p())));
            java.lang.String strN = cifF.n(context);
            if (!android.text.TextUtils.isEmpty(strN)) {
                jSONObject.put("icc", strN);
            }
            java.lang.String strB = cifF.b();
            if (!android.text.TextUtils.isEmpty(strB)) {
                jSONObject.put("tz", com.json.sdk.utils.SDKUtils.encodeString(strB));
            }
            jSONObject.put("uxt", com.json.sdk.utils.IronSourceStorageUtils.isUxt());
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
        return jSONObject;
    }

    private static void c(android.content.Context context, org.json.JSONObject jSONObject) {
        com.json.Cif cifF = com.json.im.S().f();
        try {
            if (a(com.ironsource.y8.i.l0)) {
                jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.l0), cifF.l(context));
            }
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    private static void c(org.json.JSONObject jSONObject) {
        try {
            jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.y), com.json.sdk.utils.SDKUtils.encodeString(java.lang.String.valueOf(com.json.im.S().f().n())));
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    private static void d(android.content.Context context, org.json.JSONObject jSONObject) {
        try {
            java.lang.String strB = com.json.v8.b(context);
            java.lang.String strD = com.json.v8.d(context);
            if (!android.text.TextUtils.isEmpty(strD)) {
                jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.u), com.json.sdk.utils.SDKUtils.encodeString(strD));
            }
            if (!android.text.TextUtils.isEmpty(strB) && !strB.equals("none")) {
                jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.t), com.json.sdk.utils.SDKUtils.encodeString(strB));
            }
            jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.v), com.json.v8.e(context));
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    private static void e(android.content.Context context, org.json.JSONObject jSONObject) {
        try {
            jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.P), com.json.wa.b(context).a(context));
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    private static void f(android.content.Context context, org.json.JSONObject jSONObject) {
        com.json.Cif cifF = com.json.im.S().f();
        try {
            if (a(com.ironsource.y8.i.k0)) {
                jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.k0), cifF.H(context));
            }
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    private static void g(android.content.Context context, org.json.JSONObject jSONObject) {
        try {
            jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.json.ce.O0), com.json.im.S().f().q(context));
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    private static void h(android.content.Context context, org.json.JSONObject jSONObject) {
        com.json.Cif cifF = com.json.im.S().f();
        try {
            if (a(com.ironsource.y8.i.n0)) {
                jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.n0), cifF.d(context));
            }
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }
}
