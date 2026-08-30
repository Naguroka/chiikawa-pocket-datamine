package com.json.sdk.controller;

/* JADX INFO: loaded from: classes5.dex */
public class o {
    private static final java.lang.String c = "o";
    private static final java.lang.String d = "activate";
    private static final java.lang.String e = "startSession";
    private static final java.lang.String f = "finishSession";
    private static final java.lang.String g = "impressionOccurred";
    private static final java.lang.String h = "getOmidData";
    private static final java.lang.String i = "omidFunction";
    private static final java.lang.String j = "omidParams";
    private static final java.lang.String k = "success";
    private static final java.lang.String l = "fail";
    private static final java.lang.String m = "%s | unsupported OMID API";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f3338a;
    private final com.json.Cdo b = new com.json.Cdo();

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        java.lang.String f3339a;
        org.json.JSONObject b;
        java.lang.String c;
        java.lang.String d;

        private b() {
        }
    }

    public o(android.content.Context context) {
        this.f3338a = context;
    }

    private com.ironsource.sdk.controller.o.b a(java.lang.String str) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        com.ironsource.sdk.controller.o.b bVar = new com.ironsource.sdk.controller.o.b();
        bVar.f3339a = jSONObject.optString(i);
        bVar.b = jSONObject.optJSONObject(j);
        bVar.c = jSONObject.optString("success");
        bVar.d = jSONObject.optString("fail");
        return bVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005f  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    void a(java.lang.String str, com.json.mk mkVar) throws java.lang.Exception {
        byte b2;
        com.ironsource.sdk.controller.o.b bVarA = a(str);
        com.json.br brVar = new com.json.br();
        org.json.JSONObject jSONObject = bVarA.b;
        if (jSONObject != null) {
            java.lang.String strOptString = jSONObject.optString("adViewId", "");
            if (!android.text.TextUtils.isEmpty(strOptString)) {
                brVar.b("adViewId", strOptString);
            }
        }
        try {
            java.lang.String str2 = bVarA.f3339a;
            switch (str2.hashCode()) {
                case -1655974669:
                    if (!str2.equals(d)) {
                        b2 = -1;
                    } else {
                        b2 = 0;
                    }
                    break;
                case -984459207:
                    if (!str2.equals(h)) {
                        b2 = -1;
                    } else {
                        b2 = 4;
                    }
                    break;
                case 70701699:
                    if (!str2.equals(f)) {
                        b2 = -1;
                    } else {
                        b2 = 2;
                    }
                    break;
                case 1208109646:
                    if (!str2.equals(g)) {
                        b2 = -1;
                    } else {
                        b2 = 3;
                    }
                    break;
                case 1850541012:
                    if (!str2.equals(e)) {
                        b2 = -1;
                    } else {
                        b2 = 1;
                    }
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 != 0) {
                if (b2 == 1) {
                    this.b.d(bVarA.b);
                } else if (b2 == 2) {
                    this.b.b(bVarA.b);
                } else if (b2 == 3) {
                    this.b.c(bVarA.b);
                } else if (b2 != 4) {
                    throw new java.lang.IllegalArgumentException(java.lang.String.format(m, bVarA.f3339a));
                }
                mkVar.a(true, bVarA.c, brVar);
            }
            this.b.a(this.f3338a);
            brVar = this.b.a();
            mkVar.a(true, bVarA.c, brVar);
        } catch (java.lang.Exception e2) {
            com.json.l9.d().a(e2);
            brVar.b("errMsg", e2.getMessage());
            com.json.sdk.utils.Logger.i(c, "OMIDJSAdapter " + bVarA.f3339a + " Exception: " + e2.getMessage());
            mkVar.a(false, bVarA.d, brVar);
        }
    }
}
