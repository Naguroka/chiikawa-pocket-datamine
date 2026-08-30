package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class ew {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f2635a;
    private android.content.Context b;
    private com.json.b9 c;
    private com.json.ta d;
    private int e;
    private com.json.db f;
    private int g;
    private int h;
    private final java.lang.String i = "ew";
    private com.ironsource.ew.a j;

    protected enum a {
        NOT_RECOVERED,
        RECOVERED,
        IN_RECOVERING,
        NOT_ALLOWED
    }

    public ew(android.content.Context context, com.json.b9 b9Var, com.json.ta taVar, int i, com.json.db dbVar, java.lang.String str) {
        com.ironsource.ew.a aVarH = h();
        this.j = aVarH;
        if (aVarH != com.ironsource.ew.a.NOT_ALLOWED) {
            this.b = context;
            this.c = b9Var;
            this.d = taVar;
            this.e = i;
            this.f = dbVar;
            this.g = 0;
        }
        this.f2635a = str;
    }

    private com.ironsource.ew.a h() {
        this.h = com.json.sdk.controller.FeaturesManager.getInstance().getInitRecoverTrials();
        com.json.sdk.utils.Logger.i(this.i, "getInitialState mMaxAllowedTrials: " + this.h);
        if (this.h > 0) {
            return com.ironsource.ew.a.NOT_RECOVERED;
        }
        com.json.sdk.utils.Logger.i(this.i, "recovery is not allowed by config");
        return com.ironsource.ew.a.NOT_ALLOWED;
    }

    private void j() {
        if (this.g != this.h) {
            this.j = com.ironsource.ew.a.NOT_RECOVERED;
            return;
        }
        com.json.sdk.utils.Logger.i(this.i, "handleRecoveringEndedFailed | Reached max trials");
        this.j = com.ironsource.ew.a.NOT_ALLOWED;
        a();
    }

    private void k() {
        a();
        this.j = com.ironsource.ew.a.RECOVERED;
    }

    public void a() {
        this.b = null;
        this.c = null;
        this.d = null;
        this.f = null;
    }

    public void a(boolean z) {
        if (this.j != com.ironsource.ew.a.IN_RECOVERING) {
            return;
        }
        if (z) {
            k();
        } else {
            j();
        }
    }

    public boolean a(com.ironsource.zg.c cVar, com.ironsource.zg.b bVar) {
        com.json.sdk.utils.Logger.i(this.i, "shouldRecoverWebController: ");
        com.ironsource.ew.a aVar = this.j;
        if (aVar == com.ironsource.ew.a.NOT_ALLOWED) {
            com.json.sdk.utils.Logger.i(this.i, "shouldRecoverWebController: false | recover is not allowed");
            return false;
        }
        if (cVar != com.ironsource.zg.c.Native) {
            com.json.sdk.utils.Logger.i(this.i, "shouldRecoverWebController: false | current controller type is: " + cVar);
            return false;
        }
        if (bVar == com.ironsource.zg.b.Loading || bVar == com.ironsource.zg.b.None) {
            com.json.sdk.utils.Logger.i(this.i, "shouldRecoverWebController: false | a Controller is currently loading");
            return false;
        }
        if (aVar == com.ironsource.ew.a.RECOVERED) {
            com.json.sdk.utils.Logger.i(this.i, "shouldRecoverWebController: false | already recovered");
            return false;
        }
        if (aVar == com.ironsource.ew.a.IN_RECOVERING) {
            com.json.sdk.utils.Logger.i(this.i, "shouldRecoverWebController: false | currently in recovering");
            return false;
        }
        if (this.b == null || this.c == null || this.d == null) {
            com.json.sdk.utils.Logger.i(this.i, "shouldRecoverWebController: false | missing mandatory param");
            return false;
        }
        com.json.sdk.utils.Logger.i(this.i, "shouldRecoverWebController: true | allow recovering ");
        return true;
    }

    public android.content.Context b() {
        return this.b;
    }

    public java.lang.String c() {
        return this.f2635a;
    }

    public com.json.b9 d() {
        return this.c;
    }

    public int e() {
        return this.e;
    }

    public com.json.ta f() {
        return this.d;
    }

    public com.json.db g() {
        return this.f;
    }

    public org.json.JSONObject i() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.ironsource.y8.h.A0, m());
            jSONObject.put(com.ironsource.y8.h.B0, this.g);
            jSONObject.put(com.ironsource.y8.h.C0, this.h);
        } catch (org.json.JSONException e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
        return jSONObject;
    }

    public boolean l() {
        return this.j == com.ironsource.ew.a.IN_RECOVERING;
    }

    public boolean m() {
        return this.j == com.ironsource.ew.a.RECOVERED;
    }

    public void n() {
        com.ironsource.ew.a aVar = this.j;
        com.ironsource.ew.a aVar2 = com.ironsource.ew.a.IN_RECOVERING;
        if (aVar != aVar2) {
            this.g++;
            com.json.sdk.utils.Logger.i(this.i, "recoveringStarted - trial number " + this.g);
            this.j = aVar2;
        }
    }
}
