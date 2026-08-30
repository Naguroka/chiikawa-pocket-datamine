package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class se extends com.applovin.impl.dc implements com.applovin.communicator.AppLovinCommunicatorSubscriber, com.applovin.impl.y0.a {
    private java.util.List A;
    private java.util.List B;
    private java.util.List C;
    private java.util.List D;
    private java.util.List E;
    private java.util.List F;
    private com.applovin.impl.sdk.j f;
    private java.util.List g;
    private java.util.List h;
    private java.util.List i;
    private java.lang.String j;
    private java.lang.String k;
    private java.lang.String l;
    private java.lang.Boolean m;
    private boolean n;
    private final java.lang.StringBuilder o;
    private final java.util.concurrent.atomic.AtomicBoolean p;
    private boolean q;
    private java.util.List r;
    private java.util.List s;
    private java.util.List t;
    private java.util.List u;
    private java.util.List v;
    private java.util.List w;
    private java.util.List x;
    private java.util.List y;
    private java.util.List z;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1331a;

        static {
            int[] iArr = new int[com.applovin.impl.y0.b.values().length];
            f1331a = iArr;
            try {
                iArr[com.applovin.impl.y0.b.APP_DETAILS_NOT_FOUND.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f1331a[com.applovin.impl.y0.b.INVALID_DEVELOPER_URI.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f1331a[com.applovin.impl.y0.b.APPADSTXT_NOT_FOUND.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f1331a[com.applovin.impl.y0.b.MISSING_APPLOVIN_ENTRIES.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f1331a[com.applovin.impl.y0.b.MISSING_NON_APPLOVIN_ENTRIES.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    public enum b {
        AD_UNITS,
        SELECT_LIVE_NETWORKS,
        SELECT_TEST_MODE_NETWORKS,
        INITIALIZATION_AD_UNITS,
        COUNT
    }

    private enum c {
        SUCCESS,
        WARNING,
        ERROR
    }

    public enum d {
        CMP,
        NETWORK_CONSENT_STATUSES,
        DO_NOT_SELL,
        COUNT
    }

    public enum e {
        APP_INFO,
        MAX,
        PRIVACY,
        ADS,
        INCOMPLETE_NETWORKS,
        MICRO_SDK_PARTNER_NETWORKS,
        COMPLETED_NETWORKS,
        MISSING_NETWORKS,
        COUNT
    }

    private com.applovin.impl.cc l() {
        return com.applovin.impl.cc.a().d("MAX Terms and Privacy Policy Flow").a(this.f719a).a(true).a();
    }

    private com.applovin.impl.cc q() {
        return com.applovin.impl.cc.a().d("Network Consent Statuses").a(this.f719a).a(true).a();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public java.lang.String getCommunicatorId() {
        return "MediationDebuggerListAdapter";
    }

    public java.lang.String toString() {
        return "MediationDebuggerListAdapter{isInitialized=" + this.p.get() + "}";
    }

    public se(android.content.Context context) {
        super(context);
        this.o = new java.lang.StringBuilder("");
        this.p = new java.util.concurrent.atomic.AtomicBoolean();
        this.q = false;
        this.r = new java.util.ArrayList();
        this.s = new java.util.ArrayList();
        this.t = new java.util.ArrayList();
        this.u = new java.util.ArrayList();
        this.v = new java.util.ArrayList();
        this.w = new java.util.ArrayList();
        this.x = new java.util.ArrayList();
        this.y = new java.util.ArrayList();
        this.z = new java.util.ArrayList();
        this.A = new java.util.ArrayList();
        this.B = new java.util.ArrayList();
        this.C = new java.util.ArrayList();
        this.D = new java.util.ArrayList();
        this.E = new java.util.ArrayList();
        this.F = new java.util.ArrayList();
    }

    public boolean v() {
        return this.p.get();
    }

    public boolean d() {
        return this.q;
    }

    public com.applovin.impl.sdk.j s() {
        return this.f;
    }

    public java.util.List e() {
        return this.g;
    }

    public java.util.List n() {
        return this.h;
    }

    public java.lang.String h() {
        return this.j;
    }

    public java.lang.String g() {
        return this.k;
    }

    public java.util.List j() {
        return this.v;
    }

    public java.util.List u() {
        return this.w;
    }

    public java.util.List t() {
        return this.x;
    }

    public java.lang.String o() {
        return this.o.toString();
    }

    @Override // com.applovin.impl.dc
    protected java.util.List c(int i) {
        if (i == com.applovin.impl.se.e.APP_INFO.ordinal()) {
            return this.y;
        }
        if (i == com.applovin.impl.se.e.MAX.ordinal()) {
            return this.z;
        }
        if (i == com.applovin.impl.se.e.PRIVACY.ordinal()) {
            return this.A;
        }
        if (i == com.applovin.impl.se.e.ADS.ordinal()) {
            return this.B;
        }
        if (i == com.applovin.impl.se.e.INCOMPLETE_NETWORKS.ordinal()) {
            return this.C;
        }
        if (i == com.applovin.impl.se.e.MICRO_SDK_PARTNER_NETWORKS.ordinal()) {
            return this.D;
        }
        if (i == com.applovin.impl.se.e.COMPLETED_NETWORKS.ordinal()) {
            return this.E;
        }
        return this.F;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(com.applovin.communicator.AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("privacy_setting_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.A = r();
            c();
            return;
        }
        if ("network_sdk_version_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.C = a(this.r);
            this.D = a(this.s);
            this.E = a(this.t);
            c();
            return;
        }
        if ("live_networks_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.B = a(a((java.util.List) appLovinCommunicatorMessage.getMessageData().getStringArrayList("live_networks"), true), (java.lang.String) null);
            c();
        } else if ("test_mode_networks_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.B = a((java.lang.String) null, a((java.util.List) appLovinCommunicatorMessage.getMessageData().getStringArrayList("test_mode_networks"), false));
            c();
        }
    }

    @Override // com.applovin.impl.dc
    protected int d(int i) {
        if (i == com.applovin.impl.se.e.APP_INFO.ordinal()) {
            return this.y.size();
        }
        if (i == com.applovin.impl.se.e.MAX.ordinal()) {
            return this.z.size();
        }
        if (i == com.applovin.impl.se.e.PRIVACY.ordinal()) {
            return this.A.size();
        }
        if (i == com.applovin.impl.se.e.ADS.ordinal()) {
            return this.B.size();
        }
        if (i == com.applovin.impl.se.e.INCOMPLETE_NETWORKS.ordinal()) {
            return this.C.size();
        }
        if (i == com.applovin.impl.se.e.MICRO_SDK_PARTNER_NETWORKS.ordinal()) {
            return this.D.size();
        }
        if (i == com.applovin.impl.se.e.COMPLETED_NETWORKS.ordinal()) {
            return this.E.size();
        }
        return this.F.size();
    }

    private void w() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("\n========== MEDIATION DEBUGGER ==========");
        sb.append("\n========== APP INFO ==========");
        sb.append("\nDev Build - " + com.applovin.impl.yp.c(this.f));
        sb.append("\nTest Mode - ".concat(this.f.k0().c() ? "enabled" : "disabled"));
        sb.append("\nTarget SDK - " + this.f.x().B().get("target_sdk"));
        sb.append("\n========== MAX ==========");
        java.lang.String str = com.applovin.sdk.AppLovinSdk.VERSION;
        java.lang.String str2 = (java.lang.String) this.f.a(com.applovin.impl.sj.K3);
        java.lang.String strB = com.applovin.impl.v.b();
        sb.append("\nSDK Version - " + str);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("\nPlugin Version - ");
        if (!com.applovin.impl.sdk.utils.StringUtils.isValidString(str2)) {
            str2 = "None";
        }
        sb.append(sb2.append(str2).toString());
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("\nAd Review Version - ");
        if (!com.applovin.impl.sdk.utils.StringUtils.isValidString(strB)) {
            strB = "Disabled";
        }
        sb.append(sb3.append(strB).toString());
        if (this.f.z0()) {
            java.lang.String strA = com.applovin.impl.yp.a(this.f.f0());
            sb.append("\nUnity Version - " + (com.applovin.impl.sdk.utils.StringUtils.isValidString(strA) ? strA : "None"));
        }
        sb.append("\n========== PRIVACY ==========");
        sb.append(com.applovin.impl.a4.a(this.f719a));
        sb.append(this.f.u().f());
        sb.append("\n========== CMP (CONSENT MANAGEMENT PLATFORM) ==========");
        sb.append(this.f.j0().j());
        sb.append("\n========== NETWORK CONSENT STATUSES ==========");
        java.util.Iterator it = this.f.j0().i().iterator();
        while (it.hasNext()) {
            sb.append(((com.applovin.impl.rn) it.next()).e());
        }
        sb.append("\n========== NETWORKS ==========");
        java.util.Iterator it2 = this.s.iterator();
        while (it2.hasNext()) {
            a(sb, ((com.applovin.impl.je) it2.next()).j());
        }
        java.util.Iterator it3 = this.t.iterator();
        while (it3.hasNext()) {
            a(sb, ((com.applovin.impl.je) it3.next()).j());
        }
        java.util.Iterator it4 = this.r.iterator();
        while (it4.hasNext()) {
            a(sb, ((com.applovin.impl.je) it4.next()).j());
        }
        sb.append("\n========== AD UNITS ==========");
        java.util.Iterator it5 = this.g.iterator();
        while (it5.hasNext()) {
            a(sb, ((com.applovin.impl.z) it5.next()).e());
        }
        sb.append("\n========== END ==========");
        com.applovin.impl.sdk.n.g("MediationDebuggerListAdapter", sb.toString());
        this.o.append(sb.toString());
    }

    @Override // com.applovin.impl.dc
    protected com.applovin.impl.cc e(int i) {
        if (i == com.applovin.impl.se.e.APP_INFO.ordinal()) {
            return new com.applovin.impl.fj("APP INFO");
        }
        if (i == com.applovin.impl.se.e.MAX.ordinal()) {
            return new com.applovin.impl.fj("MAX");
        }
        if (i == com.applovin.impl.se.e.PRIVACY.ordinal()) {
            return new com.applovin.impl.fj("PRIVACY");
        }
        if (i == com.applovin.impl.se.e.ADS.ordinal()) {
            return new com.applovin.impl.fj("ADS");
        }
        if (i == com.applovin.impl.se.e.INCOMPLETE_NETWORKS.ordinal()) {
            return new com.applovin.impl.fj("INCOMPLETE SDK INTEGRATIONS");
        }
        if (i == com.applovin.impl.se.e.MICRO_SDK_PARTNER_NETWORKS.ordinal()) {
            return new com.applovin.impl.fj("APPLOVIN MICRO SDK PARTNERS");
        }
        if (i == com.applovin.impl.se.e.COMPLETED_NETWORKS.ordinal()) {
            return new com.applovin.impl.fj("COMPLETED SDK INTEGRATIONS");
        }
        return new com.applovin.impl.fj("MISSING SDK INTEGRATIONS");
    }

    private void a(java.lang.StringBuilder sb, java.lang.String str) {
        java.lang.String string = sb.toString();
        if (string.length() + str.length() >= ((java.lang.Integer) this.f.a(com.applovin.impl.sj.t)).intValue()) {
            com.applovin.impl.sdk.n.g("MediationDebuggerListAdapter", string);
            this.o.append(string);
            sb.setLength(1);
        }
        sb.append(str);
    }

    private java.util.List i() {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList(7);
        try {
            str = this.f719a.getPackageManager().getPackageInfo(this.f719a.getPackageName(), 0).versionName;
        } catch (java.lang.Throwable unused) {
            str = null;
        }
        arrayList.add(com.applovin.impl.cc.a().d("Package Name").c(this.f719a.getPackageName()).a());
        com.applovin.impl.cc.b bVarD = com.applovin.impl.cc.a().d("App Version");
        if (!com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) {
            str = "None";
        }
        arrayList.add(bVarD.c(str).a());
        arrayList.add(com.applovin.impl.cc.a().d("OS").c(com.applovin.impl.yp.d()).a());
        arrayList.add(com.applovin.impl.cc.a().d("Account").c(com.applovin.impl.sdk.utils.StringUtils.isValidString(this.l) ? this.l : "None").a());
        arrayList.add(com.applovin.impl.cc.a().d("Mediation Provider").c(com.applovin.impl.sdk.utils.StringUtils.isValidString(this.f.N()) ? this.f.N() : "None").a());
        arrayList.add(com.applovin.impl.cc.a().d("OM SDK Version").c(this.f.V().c()).a());
        arrayList.add(a(com.applovin.impl.sdk.j.w0()));
        if (this.m != null) {
            arrayList.add(com.applovin.impl.cc.a().d("Google Families Policy").c(java.lang.String.valueOf(this.m)).a());
        }
        return arrayList;
    }

    private java.util.List p() {
        java.util.ArrayList arrayList = new java.util.ArrayList(7);
        arrayList.add(com.applovin.impl.cc.a().d("SDK Version").c(com.applovin.sdk.AppLovinSdk.VERSION).a());
        java.lang.String str = (java.lang.String) this.f.a(com.applovin.impl.sj.K3);
        com.applovin.impl.cc.b bVarD = com.applovin.impl.cc.a().d("Plugin Version");
        if (!com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) {
            str = "None";
        }
        arrayList.add(bVarD.c(str).a());
        com.applovin.impl.cc.b bVarD2 = com.applovin.impl.cc.a().d("Ad Review Version");
        java.lang.String strB = com.applovin.impl.v.b();
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strB)) {
            java.lang.String strA = com.applovin.impl.v.a();
            if (!com.applovin.impl.sdk.utils.StringUtils.isValidString(strA) || strA.equals(this.f.a0())) {
                bVarD2.c(strB);
            } else {
                a(bVarD2, "MAX Ad Review integrated with wrong SDK key. Please check that your " + (this.f.z0() ? "SDK key is downloaded" : "Gradle plugin snippet is integrated") + " from the correct account.");
            }
        } else {
            a(bVarD2, "Integrating MAX Ad review is OPTIONAL. This feature gives developers unprecedented transparency into the creatives the users see in their apps.");
        }
        arrayList.add(bVarD2.a());
        if (this.f.z0()) {
            java.lang.String strA2 = com.applovin.impl.yp.a(this.f.f0());
            arrayList.add(b("Unity Version", com.applovin.impl.sdk.utils.StringUtils.isValidString(strA2) ? strA2 : "None"));
        }
        if (this.f.u().j()) {
            arrayList.add(l());
            arrayList.add(m());
        }
        return arrayList;
    }

    private java.util.List r() {
        java.util.ArrayList arrayList = new java.util.ArrayList(com.applovin.impl.se.d.COUNT.ordinal());
        arrayList.add(k());
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(this.f.j0().k())) {
            arrayList.add(q());
        } else {
            arrayList.add(new com.applovin.impl.xh(com.applovin.impl.a4.b(), false, this.f719a));
        }
        arrayList.add(new com.applovin.impl.xh(com.applovin.impl.a4.a(), true, this.f719a));
        return arrayList;
    }

    private java.util.List f() {
        boolean zC = this.f.k0().c();
        java.util.List listB = this.f.k0().b();
        if (zC) {
            return a((java.lang.String) null, a(listB, false));
        }
        return a(a(listB, true), (java.lang.String) null);
    }

    private com.applovin.impl.cc b(java.lang.String str, java.lang.String str2) {
        com.applovin.impl.cc.b bVarD = com.applovin.impl.cc.a().d(str);
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(str2)) {
            bVarD.c(str2);
        } else {
            bVarD.a(com.applovin.sdk.R.drawable.applovin_ic_x_mark);
            bVarD.b(com.applovin.impl.t3.a(com.applovin.sdk.R.color.applovin_sdk_xmarkColor, this.f719a));
        }
        return bVarD.a();
    }

    private com.applovin.impl.cc m() {
        boolean zHasSupportedCmp = this.f.p().hasSupportedCmp();
        return com.applovin.impl.cc.a().d("Google UMP SDK").a(zHasSupportedCmp ? com.applovin.sdk.R.drawable.applovin_ic_check_mark_bordered : com.applovin.sdk.R.drawable.applovin_ic_x_mark).b(com.applovin.impl.t3.a(zHasSupportedCmp ? com.applovin.sdk.R.color.applovin_sdk_checkmarkColor : com.applovin.sdk.R.color.applovin_sdk_xmarkColor, this.f719a)).b("Google UMP SDK").a("In order to use MAX Terms and Privacy Policy Flow, you must add the Google User Messaging Platform SDK as a dependency.\n\nFor more details, see:\nhttps://developers.applovin.com/en/android/overview/terms-and-privacy-policy-flow").a(!zHasSupportedCmp).a();
    }

    private com.applovin.impl.cc k() {
        java.lang.String strD = this.f.j0().d();
        boolean zIsValidString = com.applovin.impl.sdk.utils.StringUtils.isValidString(strD);
        boolean zIsValidString2 = com.applovin.impl.sdk.utils.StringUtils.isValidString(this.f.j0().k());
        com.applovin.impl.cc.b bVarD = com.applovin.impl.cc.a(com.applovin.impl.cc.c.DETAIL).d("CMP (Consent Management Platform)");
        if (!zIsValidString) {
            strD = zIsValidString2 ? "Unknown" : "None";
        }
        com.applovin.impl.cc.b bVarC = bVarD.c(strD);
        if (this.n) {
            bVarC.a(true);
            if (zIsValidString2) {
                bVarC.a(this.f719a);
            } else {
                bVarC.b("TC Data Not Found");
                bVarC.a("By January 16, 2024, if you use Google AdMob or Google Ad Manager, you must also use a Google-certified CMP. Test your app in EEA and UK regions to ensure that this warning doesn't appear in those regions.\n\nFor more details, see:\nhttps://support.google.com/admob/answer/13554116");
                boolean z = this.f.s().getConsentFlowUserGeography() == com.applovin.sdk.AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
                bVarC.a(z ? com.applovin.sdk.R.drawable.applovin_ic_x_mark : com.applovin.sdk.R.drawable.applovin_ic_warning);
                bVarC.b(com.applovin.impl.t3.a(z ? com.applovin.sdk.R.color.applovin_sdk_xmarkColor : com.applovin.sdk.R.color.applovin_sdk_warningColor, this.f719a));
            }
        }
        return bVarC.a();
    }

    private void c(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.applovin.impl.je jeVar = (com.applovin.impl.je) it.next();
            if (!jeVar.F()) {
                if (jeVar.q() != com.applovin.impl.je.a.INCOMPLETE_INTEGRATION && jeVar.q() != com.applovin.impl.je.a.INVALID_INTEGRATION) {
                    if (jeVar.q() == com.applovin.impl.je.a.COMPLETE) {
                        if (jeVar.z()) {
                            this.s.add(jeVar);
                        } else {
                            this.t.add(jeVar);
                        }
                    } else if (jeVar.q() == com.applovin.impl.je.a.MISSING) {
                        this.u.add(jeVar);
                    }
                } else if (jeVar.z()) {
                    this.s.add(jeVar);
                } else {
                    this.r.add(jeVar);
                }
            }
        }
    }

    private void d(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.applovin.impl.je jeVar = (com.applovin.impl.je) it.next();
            if (jeVar.y() == com.applovin.impl.je.b.READY) {
                this.x.add(jeVar);
            }
        }
    }

    private java.util.List a(java.lang.String str, java.lang.String str2) {
        java.util.ArrayList arrayList = new java.util.ArrayList(3);
        arrayList.add(com.applovin.impl.cc.a().d("View Ad Units (" + this.g.size() + ")").a(this.f719a).a(true).a());
        arrayList.add(a(str));
        arrayList.add(b(str2));
        if (!this.h.isEmpty()) {
            arrayList.add(com.applovin.impl.cc.a().d("Selective Init Ad Units (" + this.h.size() + ")").a(this.f719a).a(true).a());
        }
        arrayList.add(com.applovin.impl.cc.a().d("Test Mode Enabled").c(java.lang.String.valueOf(this.f.k0().c())).a());
        return arrayList;
    }

    private com.applovin.impl.cc b(java.lang.String str) {
        com.applovin.impl.cc.b bVarA = com.applovin.impl.cc.a();
        if (this.f.k0().c()) {
            bVarA.a(this.f719a);
        }
        com.applovin.impl.cc.b bVarD = bVarA.d((com.applovin.impl.sdk.utils.StringUtils.isValidString(str) ? "" : "Select ").concat("Test Mode Network"));
        if (!this.f.k0().c()) {
            str = "Enable";
        }
        return bVarD.c(str).c(-16776961).a("Please re-launch the app to enable test mode. This will allow the selection of test mode networks.").a(true).a();
    }

    private void b(java.util.List list) {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashSet hashSet2 = new java.util.HashSet();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.applovin.impl.a0 a0VarF = ((com.applovin.impl.z) it.next()).f();
            java.util.Iterator it2 = a0VarF.a().iterator();
            while (it2.hasNext()) {
                hashSet.add(((com.applovin.impl.ir) it2.next()).b());
            }
            java.util.Iterator it3 = a0VarF.e().iterator();
            while (it3.hasNext()) {
                hashSet2.add(((com.applovin.impl.ir) it3.next()).b());
            }
        }
        this.v = new java.util.ArrayList(hashSet);
        this.w = new java.util.ArrayList(hashSet2);
        java.util.Collections.sort(this.v);
        java.util.Collections.sort(this.w);
    }

    private java.lang.String a(com.applovin.impl.y0.b bVar, java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
            str = "app-ads.txt URL";
        }
        int i = com.applovin.impl.se.a.f1331a[bVar.ordinal()];
        if (i == 1) {
            return "Could not retrieve app details from the Play Store for this package name. Check back once this app has been published on the Play Store.";
        }
        if (i == 2) {
            return "Unable to find a valid developer URL from the Play Store listing.";
        }
        if (i == 3) {
            return "Unable to find app-ads.txt file or parse entries of the file at " + str + ".\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt";
        }
        if (i != 4) {
            return i != 5 ? "" : "Text file at " + str + " is missing some of the suggested lines.\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt";
        }
        return "Text file at " + str + " is missing the required AppLovin line:\n\n" + str2 + "\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt";
    }

    public void b(boolean z) {
        this.q = z;
    }

    @Override // com.applovin.impl.dc
    protected int b() {
        return com.applovin.impl.se.e.COUNT.ordinal();
    }

    private com.applovin.impl.cc a(java.lang.String str, com.applovin.impl.se.c cVar) {
        int i;
        int iA;
        if (cVar == com.applovin.impl.se.c.SUCCESS) {
            i = com.applovin.sdk.R.drawable.applovin_ic_check_mark_bordered;
            iA = com.applovin.impl.t3.a(com.applovin.sdk.R.color.applovin_sdk_checkmarkColor, this.f719a);
        } else if (cVar == com.applovin.impl.se.c.WARNING) {
            i = com.applovin.sdk.R.drawable.applovin_ic_warning;
            iA = com.applovin.impl.t3.a(com.applovin.sdk.R.color.applovin_sdk_warningColor, this.f719a);
        } else {
            i = com.applovin.sdk.R.drawable.applovin_ic_x_mark;
            iA = com.applovin.impl.t3.a(com.applovin.sdk.R.color.applovin_sdk_xmarkColor, this.f719a);
        }
        return com.applovin.impl.cc.a().d("app-ads.txt").a(i).b(iA).b("app-ads.txt").a(str).a(true).a();
    }

    private com.applovin.impl.cc a(boolean z) {
        return com.applovin.impl.cc.a().d("Java 8").a(z ? com.applovin.sdk.R.drawable.applovin_ic_check_mark_bordered : com.applovin.sdk.R.drawable.applovin_ic_x_mark).b(com.applovin.impl.t3.a(z ? com.applovin.sdk.R.color.applovin_sdk_checkmarkColor : com.applovin.sdk.R.color.applovin_sdk_xmarkColor, this.f719a)).b("Upgrade to Java 8").a("For optimal performance, please enable Java 8 support. This will be required in a future SDK release. See: https://developers.applovin.com/en/android/overview/integration").a(!z).a();
    }

    private java.lang.String a(java.util.List list, boolean z) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (z) {
            for (com.applovin.impl.ic icVar : this.v) {
                if (list.equals(icVar.b())) {
                    return icVar.a();
                }
            }
            for (com.applovin.impl.ic icVar2 : this.w) {
                if (list.equals(icVar2.b())) {
                    return icVar2.a();
                }
            }
        } else {
            for (com.applovin.impl.je jeVar : this.x) {
                if (list.equals(jeVar.u())) {
                    return jeVar.g();
                }
            }
        }
        return kotlin.UByte$$ExternalSyntheticBackport0.m(",", list);
    }

    private java.util.List a(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.applovin.impl.bg((com.applovin.impl.je) it.next(), this.f719a));
        }
        return arrayList;
    }

    private com.applovin.impl.cc a(java.lang.String str) {
        com.applovin.impl.cc.b bVarA = com.applovin.impl.cc.a();
        if (!this.f.k0().c()) {
            bVarA.a(this.f719a);
        }
        com.applovin.impl.cc.b bVarD = bVarA.d((com.applovin.impl.sdk.utils.StringUtils.isValidString(str) ? "" : "Select ").concat("Live Network"));
        if (this.f.k0().c()) {
            str = "Enable";
        }
        return bVarD.c(str).c(-16776961).a("Ad loads are not supported while Test Mode is enabled. Please restart the app and make sure your GAID has not been enabled for test mode and that you are not on an emulator.").a(true).a();
    }

    public void a(java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Boolean bool, boolean z, com.applovin.impl.sdk.j jVar) {
        this.f = jVar;
        this.g = list2;
        this.h = list3;
        this.i = list4;
        this.j = str;
        this.k = str2;
        this.l = str3;
        this.m = bool;
        this.n = z;
        if (list != null && this.p.compareAndSet(false, true)) {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.I().a("MediationDebuggerListAdapter", "Populating networks...");
            }
            jVar.j0().a(list);
            c(list);
            b(list2);
            d(this.t);
            this.y.addAll(i());
            this.z.addAll(p());
            this.A.addAll(r());
            this.B.addAll(f());
            this.C = a(this.r);
            this.D = a(this.s);
            this.E = a(this.t);
            this.F = a(this.u);
            java.util.ArrayList arrayList = new java.util.ArrayList(3);
            arrayList.add("privacy_setting_updated");
            arrayList.add("network_sdk_version_updated");
            arrayList.add("live_networks_updated");
            arrayList.add("test_mode_networks_updated");
            com.applovin.communicator.AppLovinCommunicator.getInstance(this.f719a).subscribe(this, arrayList);
            w();
        }
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.se$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.notifyDataSetChanged();
            }
        });
    }

    public boolean a(com.applovin.impl.cc ccVar) {
        if (ccVar.k() == null) {
            return false;
        }
        return "MAX Terms and Privacy Policy Flow".equals(ccVar.k().toString());
    }

    @Override // com.applovin.impl.y0.a
    public void a(com.applovin.impl.y0.b bVar, java.lang.String str) {
        if (bVar == com.applovin.impl.y0.b.APP_DETAILS_NOT_FOUND) {
            this.f.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f.I().a("MediationDebuggerListAdapter", "Could not retrieve app details for this package name; app-ads.txt row will not show on the mediation debugger.");
                return;
            }
            return;
        }
        this.z.add(a(a(bVar, str, null), a(bVar)));
        c();
    }

    @Override // com.applovin.impl.y0.a
    public void a(com.applovin.impl.w0 w0Var, java.lang.String str) {
        com.applovin.impl.x0 x0Var;
        java.lang.String strA;
        com.applovin.impl.se.c cVarA;
        com.applovin.impl.se.c cVar;
        java.lang.String str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.applovin.impl.x0 x0Var2 : this.i) {
            java.util.List list = (java.util.List) w0Var.a().get(x0Var2.b());
            if (list == null || !list.contains(x0Var2)) {
                this.f.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f.I().b("MediationDebuggerListAdapter", str + " is missing a required entry: " + x0Var2.d());
                }
                arrayList.add(x0Var2);
            }
        }
        if (arrayList.isEmpty()) {
            str2 = "All required entries found at " + str + ".";
            cVar = com.applovin.impl.se.c.SUCCESS;
        } else {
            java.util.Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    x0Var = null;
                    break;
                }
                x0Var = (com.applovin.impl.x0) it.next();
            } while (!x0Var.g());
            if (x0Var != null) {
                com.applovin.impl.y0.b bVar = com.applovin.impl.y0.b.MISSING_APPLOVIN_ENTRIES;
                strA = a(bVar, str, x0Var.d());
                cVarA = a(bVar);
            } else {
                com.applovin.impl.y0.b bVar2 = com.applovin.impl.y0.b.MISSING_NON_APPLOVIN_ENTRIES;
                strA = a(bVar2, str, null);
                cVarA = a(bVar2);
            }
            java.lang.String str3 = strA;
            cVar = cVarA;
            str2 = str3;
        }
        this.z.add(a(str2, cVar));
        c();
    }

    private void a(com.applovin.impl.cc.b bVar, java.lang.String str) {
        bVar.b("MAX Ad Review").a(str).a(com.applovin.sdk.R.drawable.applovin_ic_x_mark).b(com.applovin.impl.t3.a(com.applovin.sdk.R.color.applovin_sdk_xmarkColor, this.f719a)).a(true);
    }

    private com.applovin.impl.se.c a(com.applovin.impl.y0.b bVar) {
        int i = com.applovin.impl.se.a.f1331a[bVar.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return com.applovin.impl.se.c.ERROR;
        }
        if (i != 5) {
            return com.applovin.impl.se.c.ERROR;
        }
        return com.applovin.impl.se.c.WARNING;
    }
}
