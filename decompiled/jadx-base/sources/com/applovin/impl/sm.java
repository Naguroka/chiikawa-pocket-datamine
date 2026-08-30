package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class sm extends com.applovin.impl.yl {
    private final com.applovin.impl.sdk.j h;

    @Override // java.lang.Runnable
    public void run() {
        com.applovin.impl.sdk.n nVar;
        java.lang.String str;
        java.lang.StringBuilder sbAppend;
        java.lang.String str2 = "succeeded";
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a(this.b, "Initializing AppLovin SDK v" + com.applovin.sdk.AppLovinSdk.VERSION + "...");
        }
        try {
            this.h.C().e();
            this.h.C().a(com.applovin.impl.ba.h);
            this.h.C().a(com.applovin.impl.ba.i);
            this.h.A().b(a());
            this.h.A().e(a());
            this.h.i0().a((com.applovin.impl.yl) new com.applovin.impl.zl(this.h), com.applovin.impl.tm.b.OTHER);
            this.h.x().P();
            this.h.d0().c();
            this.h.v().l();
            if (com.applovin.impl.yp.c(this.h)) {
                this.h.a();
            }
            this.h.U0();
            this.h.n().collectAppHubData();
            h();
            if (((java.lang.Boolean) this.h.a(com.applovin.impl.sj.i4)).booleanValue()) {
                com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.sm$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.f();
                    }
                });
            }
            g();
            this.h.a(true);
            this.h.W().b();
            this.h.j().maybeFireAppKilledWhilePlayingAdPostback();
            this.h.z().maybeTrackAppOpenEvent();
            this.h.w().a();
            if (((java.lang.Boolean) this.h.a(com.applovin.impl.sj.S2)).booleanValue()) {
                this.h.p0().c();
            }
            if (((java.lang.Boolean) this.h.a(com.applovin.impl.sj.Y0)).booleanValue()) {
                this.h.g().b();
            } else {
                this.h.g().g();
            }
            if (this.h.M().g() || (((java.lang.Boolean) this.h.a(com.applovin.impl.ue.K6)).booleanValue() && com.applovin.impl.yp.c(this.h) && this.h.y0())) {
                this.h.M().e();
            }
            if (this.h.Y() != null) {
                this.h.Y().b((java.lang.String) this.h.a(com.applovin.impl.sj.w));
            }
            this.h.V().i();
            if (com.applovin.impl.sdk.n.a()) {
                nVar = this.c;
                str = this.b;
                sbAppend = new java.lang.StringBuilder().append("AppLovin SDK ").append(com.applovin.sdk.AppLovinSdk.VERSION).append(" initialization ");
                if (!this.h.s0()) {
                    str2 = com.ironsource.y8.h.t;
                }
                nVar.a(str, sbAppend.append(str2).append(" in ").append(java.lang.System.currentTimeMillis() - jCurrentTimeMillis).append("ms").toString());
            }
        } catch (java.lang.Throwable th) {
            try {
                com.applovin.impl.sdk.n.c("AppLovinSdk", "Failed to initialize SDK!", th);
                this.h.a(false);
                a(th);
                if (((java.lang.Boolean) this.h.a(com.applovin.impl.sj.j)).booleanValue()) {
                    this.h.W().a();
                }
                if (((java.lang.Boolean) this.h.a(com.applovin.impl.sj.i)).booleanValue()) {
                    this.h.Q0();
                }
                if (this.h.Y() != null) {
                    this.h.Y().b((java.lang.String) this.h.a(com.applovin.impl.sj.w));
                }
                this.h.V().i();
                if (!com.applovin.impl.sdk.n.a()) {
                    return;
                }
                nVar = this.c;
                str = this.b;
                sbAppend = new java.lang.StringBuilder().append("AppLovin SDK ").append(com.applovin.sdk.AppLovinSdk.VERSION).append(" initialization ");
                if (!this.h.s0()) {
                }
            } catch (java.lang.Throwable th2) {
                if (this.h.Y() != null) {
                    this.h.Y().b((java.lang.String) this.h.a(com.applovin.impl.sj.w));
                }
                this.h.V().i();
                if (com.applovin.impl.sdk.n.a()) {
                    this.c.a(this.b, "AppLovin SDK " + com.applovin.sdk.AppLovinSdk.VERSION + " initialization " + (this.h.s0() ? "succeeded" : com.ironsource.y8.h.t) + " in " + (java.lang.System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
                }
                throw th2;
            }
        }
    }

    public sm(com.applovin.impl.sdk.j jVar) {
        super("TaskInitializeSdk", jVar, true);
        this.h = jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        com.applovin.impl.sr.f(this.h);
    }

    private void g() {
        if (this.h.K().c()) {
            return;
        }
        android.app.Activity activityM0 = this.h.m0();
        if (activityM0 != null) {
            this.h.K().a(activityM0);
        } else {
            this.h.i0().a(new com.applovin.impl.jn(this.h, true, "initializeAdapters", new java.lang.Runnable() { // from class: com.applovin.impl.sm$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.e();
                }
            }), com.applovin.impl.tm.b.CORE, java.util.concurrent.TimeUnit.SECONDS.toMillis(1L));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.h.K().a(this.h.e().b());
    }

    private void h() {
        java.lang.String str;
        boolean zC = this.h.g0().c();
        java.util.Map mapM = this.h.x().m();
        java.util.Map mapG = this.h.x().G();
        java.lang.String strA = zC ? this.h.x().f().a() : "<Enable verbose logging to see the GAID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
        java.lang.String str2 = zC ? mapM.get("idfv") + " (use this for test devices)" : "<Enable verbose logging to see the App Set ID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
        com.applovin.impl.pc pcVar = new com.applovin.impl.pc();
        pcVar.a().a("=====AppLovin SDK=====");
        pcVar.a("===SDK Versions===").a("Version", com.applovin.sdk.AppLovinSdk.VERSION).a("Plugin Version", this.h.a(com.applovin.impl.sj.K3)).a("Ad Review Version", com.applovin.impl.v.b()).a("OM SDK Version", this.h.V().c());
        pcVar.a("===Device Info===").a("OS", com.applovin.impl.yp.d()).a(com.json.mediationsdk.utils.IronSourceConstants.TYPE_GAID, strA).a("App Set ID", str2).a(androidx.exifinterface.media.ExifInterface.TAG_MODEL, mapM.get(com.json.ce.v)).a("Locale", mapM.get("locale")).a("Emulator", mapM.get("sim")).a("Tablet", mapM.get("is_tablet"));
        pcVar.a("===App Info===").a("Application ID", mapG.get(com.ironsource.y8.h.V)).a("Target SDK", mapG.get("target_sdk")).a("ExoPlayer Version", java.lang.Integer.valueOf(com.applovin.impl.yp.f()));
        pcVar.a("===SDK Settings===").a("SDK Key", this.h.a0()).a("Mediation Provider", this.h.N()).a("TG", com.applovin.impl.wp.a(this.h)).a("MD", this.h.a(com.applovin.impl.sj.v)).a("Test Mode On", java.lang.Boolean.valueOf(this.h.k0().c())).a("Verbose Logging On", java.lang.Boolean.valueOf(zC));
        pcVar.a("===Privacy States===\nPlease review AppLovin MAX documentation to be compliant with regional privacy policies.").a(com.applovin.impl.a4.a(a()));
        pcVar.a("===MAX Terms and Privcay Policy Flow===");
        com.applovin.impl.h4 h4VarU = this.h.u();
        boolean zJ = h4VarU.j();
        pcVar.a("Enabled", java.lang.Boolean.valueOf(zJ));
        if (zJ) {
            com.applovin.sdk.AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography = this.h.s().getConsentFlowUserGeography();
            com.applovin.sdk.AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeographyE = h4VarU.e();
            com.applovin.sdk.AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography2 = com.applovin.sdk.AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
            java.lang.String str3 = "Other";
            if (consentFlowUserGeography == consentFlowUserGeography2) {
                str = "GDPR";
            } else {
                str = consentFlowUserGeography == com.applovin.sdk.AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : "Unknown";
            }
            pcVar.a("Consent Flow Geography", str);
            if (com.applovin.impl.yp.c(this.h)) {
                if (consentFlowUserGeographyE == consentFlowUserGeography2) {
                    str3 = "GDPR";
                } else if (consentFlowUserGeography != com.applovin.sdk.AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER) {
                    str3 = "None";
                }
                pcVar.a("Debug User Geography", str3);
            }
        }
        pcVar.a("Privacy Policy URI", h4VarU.g()).a("Terms of Service URI", h4VarU.h());
        pcVar.a("===CMP (CONSENT MANAGEMENT PLATFORM)===").a(this.h.j0().j());
        pcVar.a();
        com.applovin.impl.sdk.n.g("AppLovinSdk", pcVar.toString());
    }
}
