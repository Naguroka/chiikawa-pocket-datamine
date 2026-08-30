package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dn extends com.applovin.impl.yl implements com.applovin.impl.d4.e {
    private final com.applovin.impl.sdk.network.a h;
    private final com.applovin.impl.d4.e i;
    private com.applovin.impl.tm.b j;
    private com.applovin.impl.sj k;
    private com.applovin.impl.sj l;
    protected com.applovin.impl.d4.b m;

    @Override // com.applovin.impl.d4.e
    public abstract void a(java.lang.String str, int i, java.lang.String str2, java.lang.Object obj);

    @Override // com.applovin.impl.d4.e
    public abstract void a(java.lang.String str, java.lang.Object obj, int i);

    public dn(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.j jVar) {
        this(aVar, jVar, false);
    }

    class a implements com.applovin.impl.d4.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.j f734a;

        a(com.applovin.impl.sdk.j jVar) {
            this.f734a = jVar;
        }

        @Override // com.applovin.impl.d4.e
        public void a(java.lang.String str, int i, java.lang.String str2, java.lang.Object obj) {
            long millis;
            boolean z = false;
            boolean z2 = i < 200 || i >= 500;
            boolean z3 = i == 429;
            boolean z4 = i != -1009 || com.applovin.impl.dn.this.h.q();
            boolean z5 = (i == -900 || i == -1000) ? false : true;
            if (z4 && z5 && (z2 || z3 || com.applovin.impl.dn.this.h.p())) {
                java.lang.String strA = com.applovin.impl.dn.this.h.a();
                if (com.applovin.impl.dn.this.h.j() <= 0) {
                    if (strA != null && strA.equals(com.applovin.impl.dn.this.h.f())) {
                        com.applovin.impl.dn dnVar = com.applovin.impl.dn.this;
                        dnVar.a(dnVar.l);
                    } else {
                        com.applovin.impl.dn dnVar2 = com.applovin.impl.dn.this;
                        dnVar2.a(dnVar2.k);
                    }
                    com.applovin.impl.dn dnVar3 = com.applovin.impl.dn.this;
                    dnVar3.a(dnVar3.h.f(), i, str2, obj);
                    return;
                }
                com.applovin.impl.sdk.n nVar = com.applovin.impl.dn.this.c;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.dn dnVar4 = com.applovin.impl.dn.this;
                    dnVar4.c.k(dnVar4.b, "Unable to send request due to server failure (code " + i + "). " + com.applovin.impl.dn.this.h.j() + " attempts left, retrying in " + java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(com.applovin.impl.dn.this.h.k()) + " seconds...");
                }
                int iJ = com.applovin.impl.dn.this.h.j() - 1;
                com.applovin.impl.dn.this.h.a(iJ);
                if (iJ == 0) {
                    com.applovin.impl.dn dnVar5 = com.applovin.impl.dn.this;
                    dnVar5.a(dnVar5.k);
                    if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strA) && strA.length() >= 4) {
                        com.applovin.impl.sdk.n nVar2 = com.applovin.impl.dn.this.c;
                        if (com.applovin.impl.sdk.n.a()) {
                            com.applovin.impl.dn dnVar6 = com.applovin.impl.dn.this;
                            dnVar6.c.d(dnVar6.b, "Switching to backup endpoint " + strA);
                        }
                        com.applovin.impl.dn.this.h.a(strA);
                        z = true;
                    }
                }
                if (((java.lang.Boolean) this.f734a.a(com.applovin.impl.sj.i3)).booleanValue() && z) {
                    millis = 0;
                } else {
                    millis = com.applovin.impl.dn.this.h.n() ? java.util.concurrent.TimeUnit.SECONDS.toMillis((long) java.lang.Math.pow(2.0d, com.applovin.impl.dn.this.h.c())) : com.applovin.impl.dn.this.h.k();
                }
                com.applovin.impl.tm tmVarI0 = this.f734a.i0();
                com.applovin.impl.dn dnVar7 = com.applovin.impl.dn.this;
                tmVarI0.a(dnVar7, dnVar7.j, millis);
                return;
            }
            com.applovin.impl.dn dnVar8 = com.applovin.impl.dn.this;
            dnVar8.a(dnVar8.h.f(), i, str2, obj);
        }

        @Override // com.applovin.impl.d4.e
        public void a(java.lang.String str, java.lang.Object obj, int i) {
            com.applovin.impl.dn.this.h.a(0);
            com.applovin.impl.dn.this.a(str, obj, i);
        }
    }

    public dn(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.j jVar, boolean z) {
        super("TaskRepeatRequest", jVar, z);
        this.j = com.applovin.impl.tm.b.OTHER;
        this.k = null;
        this.l = null;
        if (aVar != null) {
            a(aVar.f());
            this.h = aVar;
            this.m = new com.applovin.impl.d4.b();
            this.i = new com.applovin.impl.dn.a(jVar);
            return;
        }
        throw new java.lang.IllegalArgumentException("No request specified");
    }

    @Override // java.lang.Runnable
    public void run() {
        com.applovin.impl.d4 d4VarT = b().t();
        if (!b().v0() && !b().s0()) {
            com.applovin.impl.sdk.n.h("AppLovinSdk", "AppLovin SDK is disabled");
            a(this.h.f(), -22, null, null);
        } else if (com.applovin.impl.sdk.utils.StringUtils.isValidString(this.h.f()) && this.h.f().length() >= 4) {
            if (android.text.TextUtils.isEmpty(this.h.h())) {
                this.h.b(this.h.b() != null ? "POST" : "GET");
            }
            d4VarT.a(this.h, this.m, this.i);
        } else {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.b(this.b, "Task has an invalid or null request endpoint.");
            }
            a(this.h.f(), com.applovin.sdk.AppLovinErrorCodes.INVALID_URL, null, null);
        }
    }

    public void c(com.applovin.impl.sj sjVar) {
        this.k = sjVar;
    }

    public void b(com.applovin.impl.sj sjVar) {
        this.l = sjVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.sj sjVar) {
        if (sjVar != null) {
            b().g0().a(sjVar, sjVar.a());
        }
    }

    public void a(com.applovin.impl.tm.b bVar) {
        this.j = bVar;
    }
}
