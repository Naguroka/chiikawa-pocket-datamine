package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static java.lang.String f336a;

    static final com.amoad.c a(android.content.Context context) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
            java.lang.Object objInvoke = cls.getMethod("getAdvertisingIdInfo", android.content.Context.class).invoke(cls, context);
            if (objInvoke == null) {
                return null;
            }
            java.lang.Class<?> cls2 = objInvoke.getClass();
            return new com.amoad.c("idfa", (java.lang.String) cls2.getMethod("getId", new java.lang.Class[0]).invoke(objInvoke, new java.lang.Object[0]), ((java.lang.Boolean) cls2.getMethod(com.ironsource.y8.i.M, new java.lang.Class[0]).invoke(objInvoke, new java.lang.Object[0])).booleanValue());
        } catch (java.lang.Exception e) {
            com.amoad.Logger.w("AdvertisingIdInfoUtils", e);
            return null;
        } catch (java.lang.NoClassDefFoundError e2) {
            com.amoad.Logger.e("AdvertisingIdInfoUtils", e2);
            return null;
        }
    }

    private static synchronized java.lang.String a() {
        if (f336a == null) {
            f336a = java.util.UUID.randomUUID().toString();
        }
        return f336a;
    }

    static final com.amoad.c b(android.content.Context context) {
        com.amoad.c cVarA = a(context);
        return cVarA == null ? new com.amoad.c("uuid", a(), true) : cVarA;
    }
}
