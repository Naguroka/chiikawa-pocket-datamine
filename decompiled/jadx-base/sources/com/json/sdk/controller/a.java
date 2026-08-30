package com.json.sdk.controller;

/* JADX INFO: loaded from: classes5.dex */
public class a implements com.json.rg {
    private static final java.lang.String d = "loadWithUrl";
    private static final java.lang.String e = "sendMessage";
    public static final java.lang.String f = "removeAdView";
    public static final java.lang.String g = "webviewAction";
    public static final java.lang.String h = "handleGetViewVisibility";
    private static final java.lang.String i = "functionName";
    private static final java.lang.String j = "functionParams";
    private static final java.lang.String k = "success";
    private static final java.lang.String l = "fail";
    public static final java.lang.String m = "errMsg";
    private static final java.lang.String n = "%s | unsupported AdViews API";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.json.fw f3286a;
    private com.json.wg b = com.json.wg.a();
    private android.content.Context c;

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        java.lang.String f3287a;
        org.json.JSONObject b;
        java.lang.String c;
        java.lang.String d;

        private b() {
        }
    }

    public a(android.content.Context context) {
        this.c = context;
    }

    private com.ironsource.sdk.controller.a.b a(java.lang.String str) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        com.ironsource.sdk.controller.a.b bVar = new com.ironsource.sdk.controller.a.b();
        bVar.f3287a = jSONObject.optString("functionName");
        bVar.b = jSONObject.optJSONObject("functionParams");
        bVar.c = jSONObject.optString("success");
        bVar.d = jSONObject.optString("fail");
        return bVar;
    }

    public void a(com.json.fw fwVar) {
        this.f3286a = fwVar;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    void a(java.lang.String str, com.json.mk mkVar) throws java.lang.Exception {
        byte b2;
        com.ironsource.sdk.controller.a.b bVarA = a(str);
        com.json.br brVar = new com.json.br();
        try {
            java.lang.String str2 = bVarA.f3287a;
            switch (str2.hashCode()) {
                case -1384357108:
                    if (!str2.equals(f)) {
                        b2 = -1;
                    } else {
                        b2 = 2;
                    }
                    break;
                case 691453791:
                    if (!str2.equals("sendMessage")) {
                        b2 = -1;
                    } else {
                        b2 = 1;
                    }
                    break;
                case 842351363:
                    if (!str2.equals("loadWithUrl")) {
                        b2 = -1;
                    } else {
                        b2 = 0;
                    }
                    break;
                case 1182065477:
                    if (!str2.equals("handleGetViewVisibility")) {
                        b2 = -1;
                    } else {
                        b2 = 3;
                    }
                    break;
                case 1491535759:
                    if (!str2.equals(g)) {
                        b2 = -1;
                    } else {
                        b2 = 4;
                    }
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 == 0) {
                this.b.a(this, bVarA.b, this.c, bVarA.c, bVarA.d);
                return;
            }
            if (b2 == 1) {
                this.b.d(bVarA.b, bVarA.c, bVarA.d);
                return;
            }
            if (b2 == 2) {
                this.b.c(bVarA.b, bVarA.c, bVarA.d);
            } else if (b2 == 3) {
                this.b.a(bVarA.b, bVarA.c, bVarA.d);
            } else {
                if (b2 != 4) {
                    throw new java.lang.IllegalArgumentException(java.lang.String.format(n, bVarA.f3287a));
                }
                this.b.b(bVarA.b, bVarA.c, bVarA.d);
            }
        } catch (java.lang.Exception e2) {
            com.json.l9.d().a(e2);
            brVar.b("errMsg", e2.getMessage());
            java.lang.String strC = this.b.c(bVarA.b);
            if (!android.text.TextUtils.isEmpty(strC)) {
                brVar.b("adViewId", strC);
            }
            mkVar.a(false, bVarA.d, brVar);
        }
    }

    @Override // com.json.rg
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        a(str, com.json.qv.a(str2, str3));
    }

    @Override // com.json.rg
    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        if (this.f3286a == null || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.f3286a.a(str, jSONObject);
    }
}
