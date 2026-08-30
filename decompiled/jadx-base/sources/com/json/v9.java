package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class v9 {
    private static final java.lang.String c = "v9";
    private static final java.lang.String d = "setSharedSignal";
    private static final java.lang.String e = "getSharedSignal";
    private static final java.lang.String f = "functionName";
    private static final java.lang.String g = "functionParams";
    private static final java.lang.String h = "success";
    private static final java.lang.String i = "fail";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f3489a;
    com.json.u9 b;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        java.lang.String f3490a;
        org.json.JSONObject b;
        java.lang.String c;
        java.lang.String d;

        private a() {
        }

        public static com.ironsource.v9.a a(org.json.JSONObject jSONObject) {
            com.ironsource.v9.a aVar = new com.ironsource.v9.a();
            aVar.f3490a = jSONObject.optString("functionName");
            aVar.b = jSONObject.optJSONObject("functionParams");
            aVar.c = jSONObject.optString("success");
            aVar.d = jSONObject.optString("fail");
            return aVar;
        }
    }

    public v9(android.content.Context context, com.json.u9 u9Var) {
        this.f3489a = context;
        this.b = u9Var;
    }

    private com.ironsource.v9.a a(java.lang.String str) throws org.json.JSONException {
        return com.ironsource.v9.a.a(new org.json.JSONObject(str));
    }

    private void a(android.content.Context context, com.ironsource.v9.a aVar, com.json.mk mkVar) {
        com.json.br brVar = new com.json.br();
        org.json.JSONObject jSONObject = aVar.b;
        brVar.b("data", this.b.a(context, com.json.t9.a(jSONObject.optString("source")), jSONObject.optString(com.ironsource.y8.h.W)));
        mkVar.a(true, aVar.c, brVar);
    }

    private void a(com.ironsource.v9.a aVar, com.json.mk mkVar, java.lang.Exception exc) {
        com.json.l9.d().a(exc);
        java.lang.String message = exc.getMessage();
        com.json.sdk.utils.Logger.i(c, aVar.f3490a + " exception " + message);
        com.json.br brVar = new com.json.br();
        if (android.text.TextUtils.isEmpty(message)) {
            message = "Unknown error";
        }
        brVar.b("error", message);
        mkVar.a(false, aVar.d, brVar);
    }

    private void b(android.content.Context context, com.ironsource.v9.a aVar, com.json.mk mkVar) {
        com.json.br brVar = new com.json.br();
        org.json.JSONObject jSONObject = aVar.b;
        this.b.a(context, com.json.t9.a(jSONObject.optString("source")), jSONObject.optString(com.ironsource.y8.h.W), jSONObject.optString("data"));
        mkVar.a(true, aVar.c, brVar);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002c  */
    public void a(java.lang.String str, com.json.mk mkVar) throws java.lang.Exception {
        byte b;
        com.ironsource.v9.a aVarA = a(str);
        try {
            java.lang.String str2 = aVarA.f3490a;
            int iHashCode = str2.hashCode();
            if (iHashCode != 576059875) {
                if (iHashCode == 1486812399 && str2.equals(d)) {
                    b = 0;
                } else {
                    b = -1;
                }
            } else if (str2.equals(e)) {
                b = 1;
            } else {
                b = -1;
            }
            if (b == 0) {
                b(this.f3489a, aVarA, mkVar);
            } else {
                if (b != 1) {
                    throw new java.lang.UnsupportedOperationException("unsupported API: " + str);
                }
                a(this.f3489a, aVarA, mkVar);
            }
        } catch (java.lang.Exception e2) {
            a(aVarA, mkVar, e2);
        }
    }
}
