package com.json.sdk.controller;

/* JADX INFO: loaded from: classes5.dex */
class d {
    static final java.lang.String h = "controllerSourceData";
    private static final java.lang.String i = "next_";
    private static final java.lang.String j = "fallback_";
    private static final java.lang.String k = "controllerSourceCode";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f3289a;
    private int b;
    private com.ironsource.sdk.controller.d.c c;
    private com.json.sdk.controller.d.EnumC0245d d = com.json.sdk.controller.d.EnumC0245d.NONE;
    private java.lang.String e;
    private java.lang.String f;
    private com.json.db g;

    class a extends org.json.JSONObject {
        a() throws org.json.JSONException {
            putOpt(com.ironsource.y8.a.j, java.lang.Integer.valueOf(com.json.sdk.controller.d.this.b));
            putOpt(com.json.sdk.controller.d.k, java.lang.Integer.valueOf(com.json.sdk.controller.d.this.d.a()));
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3291a;

        static {
            int[] iArr = new int[com.ironsource.sdk.controller.d.c.values().length];
            f3291a = iArr;
            try {
                iArr[com.ironsource.sdk.controller.d.c.FETCH_FROM_SERVER_NO_FALLBACK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f3291a[com.ironsource.sdk.controller.d.c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f3291a[com.ironsource.sdk.controller.d.c.FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public enum c {
        FETCH_FROM_SERVER_NO_FALLBACK,
        FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK,
        FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.d$d, reason: collision with other inner class name */
    public enum EnumC0245d {
        NONE(0),
        PREPARED_CONTROLLER_LOADED(1),
        CONTROLLER_FROM_SERVER(2),
        MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(3),
        FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(4),
        FALLBACK_CONTROLLER_RECOVERY(5);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f3293a;

        EnumC0245d(int i) {
            this.f3293a = i;
        }

        public int a() {
            return this.f3293a;
        }
    }

    d(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2, com.json.db dbVar) {
        int iOptInt = jSONObject.optInt(com.ironsource.y8.a.j, -1);
        this.b = iOptInt;
        this.c = a(iOptInt);
        this.e = str;
        this.f = str2;
        this.g = dbVar;
    }

    private com.ironsource.sdk.controller.d.c a(int i2) {
        if (i2 != 1) {
            return i2 != 2 ? com.ironsource.sdk.controller.d.c.FETCH_FROM_SERVER_NO_FALLBACK : com.ironsource.sdk.controller.d.c.FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL;
        }
        return com.ironsource.sdk.controller.d.c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK;
    }

    private void a(com.json.ih ihVar) {
        if (this.g.c()) {
            return;
        }
        this.g.a(ihVar, this.f);
    }

    private void a(com.json.sdk.controller.d.EnumC0245d enumC0245d) {
        com.json.bh bhVarA = new com.json.bh().a(com.json.zb.y, java.lang.Integer.valueOf(this.b)).a(com.json.zb.z, java.lang.Integer.valueOf(enumC0245d.a()));
        if (this.f3289a > 0) {
            bhVarA.a(com.json.zb.B, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f3289a));
        }
        com.json.gh.a(com.json.ar.w, bhVarA.a());
    }

    private boolean a() {
        try {
            if (j()) {
                return com.json.sdk.utils.IronSourceStorageUtils.renameFile(h().getPath(), g().getPath());
            }
            return false;
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            return false;
        }
    }

    private boolean b() throws java.lang.Exception {
        return com.json.sdk.utils.IronSourceStorageUtils.renameFile(i().getPath(), g().getPath());
    }

    private void c() {
        try {
            com.json.ih ihVarG = g();
            if (ihVarG.exists()) {
                com.json.ih ihVarH = h();
                if (ihVarH.exists()) {
                    ihVarH.delete();
                }
                com.json.sdk.utils.IronSourceStorageUtils.renameFile(ihVarG.getPath(), ihVarH.getPath());
            }
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
        }
    }

    private void d() {
        com.json.sdk.utils.IronSourceStorageUtils.deleteFile(h());
    }

    private void e() {
        com.json.sdk.utils.IronSourceStorageUtils.deleteFile(g());
    }

    private com.json.ih h() {
        return new com.json.ih(this.e, "fallback_mobileController.html");
    }

    private com.json.ih i() {
        return new com.json.ih(this.e, "next_mobileController.html");
    }

    private boolean j() {
        return h().exists();
    }

    private void l() {
        com.json.bh bhVarA = new com.json.bh().a(com.json.zb.y, java.lang.Integer.valueOf(this.b));
        if (this.f3289a > 0) {
            bhVarA.a(com.json.zb.B, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f3289a));
        }
        com.json.gh.a(com.json.ar.x, bhVarA.a());
    }

    void a(com.json.bh bhVar) {
        bhVar.a(com.json.zb.y, java.lang.Integer.valueOf(this.b));
        com.json.gh.a(com.json.ar.v, bhVar.a());
        this.f3289a = java.lang.System.currentTimeMillis();
    }

    void a(java.lang.Runnable runnable) {
        if (m()) {
            return;
        }
        if (this.c == com.ironsource.sdk.controller.d.c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK) {
            d();
        }
        com.json.sdk.controller.d.EnumC0245d enumC0245d = com.json.sdk.controller.d.EnumC0245d.CONTROLLER_FROM_SERVER;
        this.d = enumC0245d;
        a(enumC0245d);
        runnable.run();
    }

    void a(java.lang.Runnable runnable, java.lang.Runnable runnable2) {
        if (m()) {
            return;
        }
        if (this.c != com.ironsource.sdk.controller.d.c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK || !a()) {
            l();
            runnable2.run();
        } else {
            com.json.sdk.controller.d.EnumC0245d enumC0245d = com.json.sdk.controller.d.EnumC0245d.FALLBACK_CONTROLLER_RECOVERY;
            this.d = enumC0245d;
            a(enumC0245d);
            runnable.run();
        }
    }

    org.json.JSONObject f() throws org.json.JSONException {
        return new com.ironsource.sdk.controller.d.a();
    }

    com.json.ih g() {
        return new com.json.ih(this.e, com.json.y8.f);
    }

    boolean k() {
        com.json.ih ihVar;
        int i2 = com.ironsource.sdk.controller.d.b.f3291a[this.c.ordinal()];
        if (i2 == 1) {
            e();
            ihVar = new com.json.ih(this.e, com.json.sdk.utils.SDKUtils.getFileName(this.f));
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    try {
                        com.json.ih ihVarG = g();
                        com.json.ih ihVarI = i();
                        if (!ihVarI.exists() && !ihVarG.exists()) {
                            a(new com.json.ih(this.e, com.json.sdk.utils.SDKUtils.getFileName(this.f)));
                            return false;
                        }
                        if (!ihVarI.exists() && ihVarG.exists()) {
                            com.json.sdk.controller.d.EnumC0245d enumC0245d = com.json.sdk.controller.d.EnumC0245d.MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                            this.d = enumC0245d;
                            a(enumC0245d);
                            a(new com.json.ih(this.e, ihVarI.getName()));
                            return true;
                        }
                        c();
                        if (b()) {
                            com.json.sdk.controller.d.EnumC0245d enumC0245d2 = com.json.sdk.controller.d.EnumC0245d.PREPARED_CONTROLLER_LOADED;
                            this.d = enumC0245d2;
                            a(enumC0245d2);
                            d();
                            a(new com.json.ih(this.e, ihVarI.getName()));
                            return true;
                        }
                        if (!a()) {
                            a(new com.json.ih(this.e, com.json.sdk.utils.SDKUtils.getFileName(this.f)));
                            return false;
                        }
                        com.json.sdk.controller.d.EnumC0245d enumC0245d3 = com.json.sdk.controller.d.EnumC0245d.FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                        this.d = enumC0245d3;
                        a(enumC0245d3);
                        a(new com.json.ih(this.e, ihVarI.getName()));
                        return true;
                    } catch (java.lang.Exception e) {
                        com.json.l9.d().a(e);
                    }
                }
                return false;
            }
            c();
            ihVar = new com.json.ih(this.e, com.json.sdk.utils.SDKUtils.getFileName(this.f));
        }
        a(ihVar);
        return false;
    }

    boolean m() {
        return this.d != com.json.sdk.controller.d.EnumC0245d.NONE;
    }
}
