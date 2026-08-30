package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class gh {
    private static com.json.gh b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.json.hc f2692a;

    private gh() {
    }

    private static com.json.gh a() {
        if (b == null) {
            b = new com.json.gh();
        }
        return b;
    }

    public static void a(com.ironsource.ar.a aVar) {
        a(aVar, new java.util.HashMap());
    }

    public static void a(com.ironsource.ar.a aVar, java.util.Map<java.lang.String, java.lang.Object> map) {
        com.json.hc hcVar = a().f2692a;
        if (hcVar == null) {
            android.util.Log.d(com.json.zb.f3611a, com.json.zb.U);
            return;
        }
        if (map != null) {
            map.put("eventid", java.lang.Integer.valueOf(aVar.b));
        }
        hcVar.a(aVar.f2515a, map);
    }

    public static void a(com.json.bc bcVar, com.json.eh ehVar) {
        if (bcVar != null) {
            try {
                a().f2692a = new com.json.hc(bcVar, ehVar);
            } catch (java.lang.Exception e) {
                com.json.l9.d().a(e);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            }
        }
    }
}
