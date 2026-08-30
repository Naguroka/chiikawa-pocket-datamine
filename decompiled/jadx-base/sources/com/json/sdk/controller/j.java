package com.json.sdk.controller;

/* JADX INFO: loaded from: classes5.dex */
class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f3323a;
    private final com.json.tc b;

    class a implements com.json.lo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.ok f3324a;
        final /* synthetic */ com.json.nk b;

        a(com.json.ok okVar, com.json.nk nkVar) {
            this.f3324a = okVar;
            this.b = nkVar;
        }

        @Override // com.json.lo
        public void a(com.json.ih ihVar) {
            try {
                com.json.ok okVar = this.f3324a;
                com.json.nk nkVar = this.b;
                okVar.b(nkVar, com.json.sdk.controller.j.this.a(nkVar, ihVar.a()));
            } catch (java.lang.Exception e) {
                com.json.l9.d().a(e);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            }
        }

        @Override // com.json.lo
        public void a(com.json.ih ihVar, com.json.ah ahVar) {
            try {
                com.json.ok okVar = this.f3324a;
                com.json.nk nkVar = this.b;
                okVar.a(nkVar, com.json.sdk.controller.j.this.a(nkVar, ahVar.b()));
            } catch (java.lang.Exception e) {
                com.json.l9.d().a(e);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            }
        }
    }

    j(java.lang.String str, com.json.tc tcVar) {
        this.f3323a = str;
        this.b = tcVar;
    }

    private com.json.ih a(org.json.JSONObject jSONObject, java.lang.String str) throws java.lang.Exception {
        if (jSONObject.has(com.ironsource.rc.c.d)) {
            return new com.json.ih(com.json.sdk.utils.IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, jSONObject.getString(com.ironsource.rc.c.d)));
        }
        throw new java.lang.Exception(com.ironsource.rc.a.b);
    }

    private com.json.lo a(com.json.nk nkVar, com.json.ok okVar) {
        return new com.ironsource.sdk.controller.j.a(okVar, nkVar);
    }

    private org.json.JSONObject a(com.json.nk nkVar, long j) {
        try {
            return nkVar.e().put("result", j);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            return new org.json.JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.json.JSONObject a(com.json.nk nkVar, java.lang.String str) {
        try {
            return nkVar.e().put("errMsg", str);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            return new org.json.JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.json.JSONObject a(com.json.nk nkVar, org.json.JSONObject jSONObject) {
        try {
            return nkVar.e().put("result", jSONObject);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            return new org.json.JSONObject();
        }
    }

    private com.json.ih b(org.json.JSONObject jSONObject, java.lang.String str) throws java.lang.Exception {
        if (!jSONObject.has(com.ironsource.rc.c.c) || !jSONObject.has(com.ironsource.rc.c.b)) {
            throw new java.lang.Exception(com.ironsource.rc.a.f3238a);
        }
        java.lang.String string = jSONObject.getString(com.ironsource.rc.c.c);
        return new com.json.ih(com.json.sdk.utils.IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, string), jSONObject.getString(com.ironsource.rc.c.b));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    void a(org.json.JSONObject jSONObject, com.json.mk mkVar) {
        byte b;
        org.json.JSONObject jSONObjectA;
        org.json.JSONObject jSONObjectA2;
        com.json.nk nkVar = new com.json.nk(jSONObject);
        com.json.ok okVar = new com.json.ok(mkVar);
        try {
            java.lang.String strB = nkVar.b();
            org.json.JSONObject jSONObjectC = nkVar.c();
            com.json.ih ihVarB = b(jSONObjectC, this.f3323a);
            com.json.sdk.utils.IronSourceStorageUtils.ensurePathSafety(ihVarB, this.f3323a);
            switch (strB.hashCode()) {
                case -2073025383:
                    if (!strB.equals(com.ironsource.rc.b.f3239a)) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case -1137024519:
                    if (!strB.equals(com.ironsource.rc.b.c)) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case -318115535:
                    if (!strB.equals(com.ironsource.rc.b.e)) {
                        b = -1;
                    } else {
                        b = 4;
                    }
                    break;
                case 537556755:
                    if (!strB.equals(com.ironsource.rc.b.f)) {
                        b = -1;
                    } else {
                        b = 5;
                    }
                    break;
                case 1764172231:
                    if (!strB.equals(com.ironsource.rc.b.b)) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case 1953259713:
                    if (!strB.equals(com.ironsource.rc.b.d)) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                this.b.a(ihVarB, jSONObjectC.optString(com.ironsource.rc.c.f3240a), jSONObjectC.optInt("connectionTimeout"), jSONObjectC.optInt("readTimeout"), a(nkVar, okVar));
                return;
            }
            if (b == 1) {
                this.b.a(ihVarB);
                jSONObjectA = ihVarB.a();
            } else if (b == 2) {
                this.b.b(ihVarB);
                jSONObjectA = ihVarB.a();
            } else {
                if (b != 3) {
                    if (b == 4) {
                        jSONObjectA2 = a(nkVar, this.b.d(ihVarB));
                    } else {
                        if (b != 5) {
                            return;
                        }
                        this.b.a(ihVarB, jSONObjectC.optJSONObject(com.ironsource.rc.c.g));
                        jSONObjectA = ihVarB.a();
                    }
                    okVar.b(nkVar, jSONObjectA2);
                }
                jSONObjectA = this.b.c(ihVarB);
            }
            jSONObjectA2 = a(nkVar, jSONObjectA);
            okVar.b(nkVar, jSONObjectA2);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            okVar.a(nkVar, a(nkVar, e.getMessage()));
        }
    }
}
