package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class je implements java.lang.Comparable, com.applovin.communicator.AppLovinCommunicatorSubscriber {
    private final java.util.List A;
    private final java.util.List B;
    private final java.util.List C;
    private final java.util.Map D;
    private final boolean E;
    private final boolean F;
    private final com.applovin.impl.rn G;
    private final boolean H;
    private final java.lang.String I;
    private final java.util.Map J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f921a;
    private final com.applovin.impl.je.a b;
    private int c;
    private final boolean d;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    private final java.lang.String o;
    private final java.lang.String p;
    private java.lang.String q;
    private java.lang.String r;
    private final java.lang.String s;
    private final java.lang.String t;
    private final java.lang.String u;
    private final java.lang.String v;
    private final int w;
    private final java.util.List x;
    private final java.util.List y;
    private final java.util.List z;

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public java.lang.String getCommunicatorId() {
        return "MediatedNetwork";
    }

    public java.lang.String toString() {
        return "MediatedNetwork{name=" + this.o + ", displayName=" + this.p + ", sdkAvailable=" + this.d + ", sdkVersion=" + this.r + ", adapterAvailable=" + this.f + ", adapterVersion=" + this.s + "}";
    }

    public enum a {
        MISSING("MISSING"),
        INCOMPLETE_INTEGRATION("INCOMPLETE INTEGRATION"),
        INVALID_INTEGRATION("INVALID INTEGRATION"),
        COMPLETE("COMPLETE");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.String f922a;

        a(java.lang.String str) {
            this.f922a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public java.lang.String b() {
            return this.f922a;
        }
    }

    public enum b {
        NOT_SUPPORTED("Not Supported", -65536, "This network does not support test mode."),
        INVALID_INTEGRATION("Invalid Integration", -65536, "Please address all the integration issue(s) marked in red above."),
        NOT_INITIALIZED("Not Initialized", -65536, "Please configure this network in your MAX dashboard."),
        DISABLED("Enable", -16776961, "Please re-launch the app to enable test ads."),
        READY("", -16776961, "");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.String f923a;
        private final int b;
        private final java.lang.String c;

        b(java.lang.String str, int i, java.lang.String str2) {
            this.f923a = str;
            this.b = i;
            this.c = str2;
        }

        public java.lang.String c() {
            return this.f923a;
        }

        public int d() {
            return this.b;
        }

        public java.lang.String b() {
            return this.c;
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0249 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:68:0x024d  */
    /* JADX WARN: Code duplicated, block: B:71:0x025f  */
    /* JADX WARN: Code duplicated, block: B:72:0x026b  */
    /* JADX WARN: Code duplicated, block: B:75:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:78:0x02bc  */
    public je(org.json.JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        java.lang.String adapterVersion;
        java.lang.String strA;
        boolean zEquals;
        java.lang.String string;
        boolean zIsBeta;
        boolean z;
        boolean z2;
        int iLastIndexOf;
        java.lang.String lowerCase;
        java.lang.Integer numA;
        org.json.JSONObject jSONObject2;
        java.lang.String string2;
        boolean z3;
        this.f921a = jVar;
        java.lang.String string3 = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "name", "");
        this.o = string3;
        this.p = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "display_name", "");
        this.q = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "adapter_class", "");
        this.t = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "latest_adapter_version", "");
        this.A = a(jSONObject);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.k = com.applovin.impl.sdk.utils.JsonUtils.getBoolean(jSONObject, "hide_if_missing", bool).booleanValue();
        org.json.JSONObject jSONObject3 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONObject, "configuration", new org.json.JSONObject());
        this.y = a(jSONObject3, jVar);
        this.n = com.applovin.impl.sdk.utils.JsonUtils.getBoolean(jSONObject3, "java_8_required", bool).booleanValue();
        this.E = com.applovin.impl.sdk.utils.JsonUtils.getBoolean(jSONObject3, "has_micro_sdk", bool).booleanValue();
        this.F = com.applovin.impl.sdk.utils.JsonUtils.getBoolean(jSONObject3, "hide_initialization_status", bool).booleanValue();
        this.B = com.applovin.impl.sdk.utils.JsonUtils.getList(jSONObject3, "live_network_filtering_names", null);
        org.json.JSONObject jSONObject4 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONObject3, "test_mode", new org.json.JSONObject());
        org.json.JSONObject jSONObject5 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONObject4, "network_names", (org.json.JSONObject) null);
        if (jSONObject5 != null && jSONObject5.length() > 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList(java.util.Arrays.asList(string3));
            java.util.HashMap map = new java.util.HashMap(jSONObject5.length());
            java.util.Iterator<java.lang.String> itKeys = jSONObject5.keys();
            while (itKeys.hasNext()) {
                java.lang.String next = itKeys.next();
                com.applovin.mediation.MaxAdFormat fromString = com.applovin.mediation.MaxAdFormat.formatFromString(next);
                java.lang.String string4 = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject5, next, null);
                if (fromString != null && !android.text.TextUtils.isEmpty(string4)) {
                    arrayList.add(string4);
                    map.put(fromString, string4);
                }
            }
            this.C = arrayList;
            this.D = map;
        } else {
            this.C = java.util.Arrays.asList(string3);
            this.D = null;
        }
        org.json.JSONObject jSONObject6 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONObject, "test_mode", new org.json.JSONObject());
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        this.i = com.applovin.impl.sdk.utils.JsonUtils.getBoolean(jSONObject6, "supported", bool2).booleanValue();
        this.j = com.applovin.impl.sdk.utils.JsonUtils.getBoolean(jSONObject, "test_mode_requires_init", java.lang.Boolean.FALSE).booleanValue();
        this.u = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject6, com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, null);
        this.G = new com.applovin.impl.rn(com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONObject3, "tcf_config"), this.p);
        java.util.List list = com.applovin.impl.sdk.utils.JsonUtils.getList(jSONObject, "existence_classes", null);
        if (list != null) {
            this.d = com.applovin.impl.yp.a(list);
        } else {
            this.d = com.applovin.impl.yp.a(com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "existence_class", ""));
        }
        java.util.List listEmptyList = java.util.Collections.emptyList();
        java.lang.String str = this.q;
        java.lang.String string5 = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject3, "init_adapter_class", null);
        if (string5 != null) {
            this.q = string5;
        }
        com.applovin.mediation.adapter.MaxAdapter maxAdapterA = com.applovin.impl.ze.a(str, jVar);
        if (maxAdapterA != null) {
            this.f = true;
            try {
                adapterVersion = maxAdapterA.getAdapterVersion();
                try {
                    strA = com.applovin.impl.ze.a(maxAdapterA);
                    try {
                        listEmptyList = a(maxAdapterA, com.applovin.impl.sdk.utils.JsonUtils.getBoolean(jSONObject4, "is_mrec_supported", bool2).booleanValue());
                        org.json.JSONObject jSONObject7 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONObject3, "native_ad_view_config", (org.json.JSONObject) null);
                        if (jSONObject7 != null) {
                            java.lang.String string6 = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject7, "min_adapter_version", null);
                            z3 = string6 == null || com.applovin.impl.yp.a(adapterVersion, string6) >= 0;
                            try {
                                string = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject7, "network_name", null);
                            } catch (java.lang.Throwable th) {
                                th = th;
                                string = null;
                                com.applovin.impl.sdk.n.h("MediatedNetwork", "Failed to load adapter for network " + this.o + ". Please check that you have a compatible network SDK integrated. Error: " + th);
                                z = z3;
                                zIsBeta = false;
                                java.lang.Class<?> cls = java.lang.Class.forName(this.q);
                                zEquals = cls.getMethod("loadNativeAd", com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters.class, android.app.Activity.class, com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener.class).getDeclaringClass().equals(cls);
                                this.s = adapterVersion;
                                this.r = strA;
                                this.x = listEmptyList;
                                this.l = zEquals;
                                this.m = z;
                                this.v = string;
                                this.z = a(jSONObject3, adapterVersion, jVar);
                                this.h = com.applovin.impl.yp.a(com.applovin.impl.sdk.utils.JsonUtils.getString(com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONObject, "alternative_network", (org.json.JSONObject) null), "adapter_class", ""));
                                this.b = a();
                                if (adapterVersion.equals(this.t)) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                this.g = z2;
                                android.content.Context contextM = com.applovin.impl.sdk.j.m();
                                iLastIndexOf = this.o.lastIndexOf("_");
                                if (iLastIndexOf != -1) {
                                    lowerCase = this.o.toLowerCase().substring(0, iLastIndexOf);
                                } else {
                                    lowerCase = this.o.toLowerCase();
                                }
                                this.w = contextM.getResources().getIdentifier("applovin_ic_mediation_" + lowerCase, "drawable", contextM.getPackageName());
                                this.c = com.applovin.mediation.adapter.MaxAdapter.InitializationStatus.NOT_INITIALIZED.getCode();
                                com.applovin.communicator.AppLovinCommunicator.getInstance(contextM).subscribe(this, "adapter_initialization_status");
                                numA = jVar.K().a(this.q);
                                if (numA != null) {
                                    this.c = numA.intValue();
                                }
                                jSONObject2 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONObject3, "amazon_marketplace", (org.json.JSONObject) null);
                                if (jSONObject2 == null) {
                                }
                                this.H = false;
                                this.I = null;
                                this.J = null;
                            }
                        } else {
                            string = null;
                            z3 = false;
                        }
                        try {
                            z = z3;
                            zIsBeta = maxAdapterA.isBeta();
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            com.applovin.impl.sdk.n.h("MediatedNetwork", "Failed to load adapter for network " + this.o + ". Please check that you have a compatible network SDK integrated. Error: " + th);
                            z = z3;
                            zIsBeta = false;
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        string = null;
                        z3 = false;
                        com.applovin.impl.sdk.n.h("MediatedNetwork", "Failed to load adapter for network " + this.o + ". Please check that you have a compatible network SDK integrated. Error: " + th);
                        z = z3;
                        zIsBeta = false;
                        java.lang.Class<?> cls2 = java.lang.Class.forName(this.q);
                        zEquals = cls2.getMethod("loadNativeAd", com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters.class, android.app.Activity.class, com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener.class).getDeclaringClass().equals(cls2);
                        this.s = adapterVersion;
                        this.r = strA;
                        this.x = listEmptyList;
                        this.l = zEquals;
                        this.m = z;
                        this.v = string;
                        this.z = a(jSONObject3, adapterVersion, jVar);
                        this.h = com.applovin.impl.yp.a(com.applovin.impl.sdk.utils.JsonUtils.getString(com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONObject, "alternative_network", (org.json.JSONObject) null), "adapter_class", ""));
                        this.b = a();
                        if (adapterVersion.equals(this.t)) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        this.g = z2;
                        android.content.Context contextM2 = com.applovin.impl.sdk.j.m();
                        iLastIndexOf = this.o.lastIndexOf("_");
                        if (iLastIndexOf != -1) {
                            lowerCase = this.o.toLowerCase().substring(0, iLastIndexOf);
                        } else {
                            lowerCase = this.o.toLowerCase();
                        }
                        this.w = contextM2.getResources().getIdentifier("applovin_ic_mediation_" + lowerCase, "drawable", contextM2.getPackageName());
                        this.c = com.applovin.mediation.adapter.MaxAdapter.InitializationStatus.NOT_INITIALIZED.getCode();
                        com.applovin.communicator.AppLovinCommunicator.getInstance(contextM2).subscribe(this, "adapter_initialization_status");
                        numA = jVar.K().a(this.q);
                        if (numA != null) {
                            this.c = numA.intValue();
                        }
                        jSONObject2 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONObject3, "amazon_marketplace", (org.json.JSONObject) null);
                        if (jSONObject2 == null) {
                        }
                        this.H = false;
                        this.I = null;
                        this.J = null;
                    }
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    strA = "";
                }
            } catch (java.lang.Throwable th5) {
                th = th5;
                adapterVersion = "";
                strA = adapterVersion;
            }
            try {
                java.lang.Class<?> cls3 = java.lang.Class.forName(this.q);
                zEquals = cls3.getMethod("loadNativeAd", com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters.class, android.app.Activity.class, com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener.class).getDeclaringClass().equals(cls3);
            } catch (java.lang.Throwable th6) {
                jVar.I();
                if (com.applovin.impl.sdk.n.a()) {
                    jVar.I().a("MediatedNetwork", "Failed to check if adapter overrides MaxNativeAdAdapter", th6);
                }
                zEquals = false;
            }
        } else {
            this.f = false;
            adapterVersion = "";
            strA = adapterVersion;
            zEquals = false;
            string = null;
            zIsBeta = false;
            z = false;
        }
        this.s = adapterVersion;
        this.r = strA;
        this.x = listEmptyList;
        this.l = zEquals;
        this.m = z;
        this.v = string;
        this.z = a(jSONObject3, adapterVersion, jVar);
        this.h = com.applovin.impl.yp.a(com.applovin.impl.sdk.utils.JsonUtils.getString(com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONObject, "alternative_network", (org.json.JSONObject) null), "adapter_class", ""));
        this.b = a();
        if (adapterVersion.equals(this.t) || zIsBeta) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.g = z2;
        android.content.Context contextM3 = com.applovin.impl.sdk.j.m();
        iLastIndexOf = this.o.lastIndexOf("_");
        if (iLastIndexOf != -1) {
            lowerCase = this.o.toLowerCase().substring(0, iLastIndexOf);
        } else {
            lowerCase = this.o.toLowerCase();
        }
        this.w = contextM3.getResources().getIdentifier("applovin_ic_mediation_" + lowerCase, "drawable", contextM3.getPackageName());
        this.c = com.applovin.mediation.adapter.MaxAdapter.InitializationStatus.NOT_INITIALIZED.getCode();
        com.applovin.communicator.AppLovinCommunicator.getInstance(contextM3).subscribe(this, "adapter_initialization_status");
        numA = jVar.K().a(this.q);
        if (numA != null) {
            this.c = numA.intValue();
        }
        jSONObject2 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONObject3, "amazon_marketplace", (org.json.JSONObject) null);
        if (jSONObject2 == null && this.d) {
            this.H = true;
            this.I = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject2, "test_mode_app_id", null);
            org.json.JSONObject jSONObject8 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONObject2, "test_mode_slot_ids", new org.json.JSONObject());
            java.util.HashMap map2 = new java.util.HashMap(jSONObject8.length());
            java.util.Iterator<java.lang.String> itKeys2 = jSONObject8.keys();
            while (itKeys2.hasNext()) {
                java.lang.String next2 = itKeys2.next();
                com.applovin.mediation.MaxAdFormat fromString2 = com.applovin.mediation.MaxAdFormat.formatFromString(next2);
                org.json.JSONObject jSONObject9 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONObject8, next2, (org.json.JSONObject) null);
                if (fromString2 != null && jSONObject9 != null && (string2 = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject9, "uuid", null)) != null) {
                    map2.put(fromString2, new com.applovin.impl.p0(string2, jSONObject9, fromString2));
                }
            }
            this.J = map2;
            return;
        }
        this.H = false;
        this.I = null;
        this.J = null;
    }

    public com.applovin.impl.je.a q() {
        return this.b;
    }

    public int i() {
        return this.c;
    }

    public com.applovin.impl.je.b y() {
        if (!this.i) {
            return com.applovin.impl.je.b.NOT_SUPPORTED;
        }
        com.applovin.impl.je.a aVar = this.b;
        if (aVar != com.applovin.impl.je.a.COMPLETE && (aVar != com.applovin.impl.je.a.INCOMPLETE_INTEGRATION || !E() || !A())) {
            return com.applovin.impl.je.b.INVALID_INTEGRATION;
        }
        if (!this.f921a.k0().c()) {
            return com.applovin.impl.je.b.DISABLED;
        }
        if (this.j && (this.c == com.applovin.mediation.adapter.MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() || this.c == com.applovin.mediation.adapter.MaxAdapter.InitializationStatus.INITIALIZING.getCode())) {
            return com.applovin.impl.je.b.NOT_INITIALIZED;
        }
        return com.applovin.impl.je.b.READY;
    }

    public boolean E() {
        return this.d;
    }

    public boolean A() {
        return this.f;
    }

    public boolean B() {
        return this.g;
    }

    public boolean F() {
        return this.b == com.applovin.impl.je.a.MISSING && this.k;
    }

    public java.lang.String m() {
        return this.o;
    }

    public java.lang.String g() {
        return this.p;
    }

    public java.lang.String p() {
        return this.r;
    }

    public java.lang.String c() {
        return this.s;
    }

    public java.lang.String k() {
        return this.t;
    }

    public java.lang.String b() {
        return this.q;
    }

    public java.lang.String w() {
        return this.v;
    }

    public java.util.List u() {
        return this.C;
    }

    public java.util.List l() {
        return this.B;
    }

    public java.util.List s() {
        return this.A;
    }

    public int h() {
        return this.w;
    }

    public java.util.List r() {
        return this.x;
    }

    public boolean H() {
        return this.l;
    }

    public boolean I() {
        return this.m;
    }

    public java.util.List n() {
        return this.y;
    }

    public java.util.List f() {
        return this.z;
    }

    public boolean D() {
        return this.n;
    }

    public boolean G() {
        return this.F;
    }

    public java.util.Map x() {
        return this.D;
    }

    public boolean z() {
        return this.E;
    }

    public java.lang.String v() {
        return this.u;
    }

    public com.applovin.impl.rn t() {
        return this.G;
    }

    public final com.applovin.impl.sdk.j o() {
        return this.f921a;
    }

    public final java.lang.String j() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("\n---------- ");
        java.lang.String str = "UNAVAILABLE";
        java.lang.StringBuilder sbAppend = sb.append(this.o).append(" ----------\nStatus  - ").append(this.b.b()).append("\nSDK     - ").append((!this.d || android.text.TextUtils.isEmpty(this.r)) ? "UNAVAILABLE" : this.r).append("\nAdapter - ");
        if (this.f && !android.text.TextUtils.isEmpty(this.s)) {
            str = this.s;
        }
        sbAppend.append(str);
        for (com.applovin.impl.gh ghVar : n()) {
            if (!ghVar.c()) {
                sb.append("\n* MISSING ").append(ghVar.b()).append(": ").append(ghVar.a());
            }
        }
        for (com.applovin.impl.o6 o6Var : f()) {
            if (!o6Var.c()) {
                sb.append("\n* MISSING ").append(o6Var.b()).append(": ").append(o6Var.a());
            }
        }
        return sb.toString();
    }

    public boolean C() {
        return this.H;
    }

    public java.lang.String e() {
        return this.I;
    }

    public java.util.Map d() {
        return this.J;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(com.applovin.impl.je jeVar) {
        return this.p.compareToIgnoreCase(jeVar.p);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(com.applovin.communicator.AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        java.lang.String string = appLovinCommunicatorMessage.getMessageData().getString("adapter_class", "");
        if (this.q.equals(string)) {
            this.c = appLovinCommunicatorMessage.getMessageData().getInt("init_status", 0);
            com.applovin.mediation.adapter.MaxAdapter maxAdapterA = com.applovin.impl.ze.a(string, this.f921a);
            if (maxAdapterA != null) {
                java.lang.String strA = com.applovin.impl.ze.a(maxAdapterA);
                if (this.r.equals(strA)) {
                    return;
                }
                this.r = strA;
                this.f921a.q().a(this.r, string);
            }
        }
    }

    private com.applovin.impl.je.a a() {
        com.applovin.impl.je.a aVar;
        if (this.d) {
            if (this.f) {
                aVar = com.applovin.impl.je.a.COMPLETE;
            } else if (this.h) {
                aVar = com.applovin.impl.je.a.MISSING;
            } else {
                aVar = com.applovin.impl.je.a.INCOMPLETE_INTEGRATION;
            }
        } else if (this.f) {
            aVar = com.applovin.impl.je.a.INCOMPLETE_INTEGRATION;
        } else {
            aVar = com.applovin.impl.je.a.MISSING;
        }
        if (aVar == com.applovin.impl.je.a.MISSING) {
            return aVar;
        }
        java.util.Iterator it = this.y.iterator();
        while (it.hasNext()) {
            if (!((com.applovin.impl.gh) it.next()).c()) {
                return com.applovin.impl.je.a.INVALID_INTEGRATION;
            }
        }
        java.util.Iterator it2 = this.z.iterator();
        while (it2.hasNext()) {
            if (!((com.applovin.impl.o6) it2.next()).c()) {
                return com.applovin.impl.je.a.INVALID_INTEGRATION;
            }
        }
        return (!this.n || com.applovin.impl.sdk.j.w0()) ? aVar : com.applovin.impl.je.a.INVALID_INTEGRATION;
    }

    private java.util.List a(org.json.JSONObject jSONObject, java.lang.String str, com.applovin.impl.sdk.j jVar) {
        org.json.JSONArray jSONArray = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(jSONObject, "dependencies", new org.json.JSONArray());
        org.json.JSONArray jSONArray2 = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(jSONObject, "dependencies_v2", new org.json.JSONArray());
        java.util.ArrayList arrayList = new java.util.ArrayList(jSONArray.length() + jSONArray2.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            org.json.JSONObject jSONObject2 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONArray, i, (org.json.JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new com.applovin.impl.o6(jSONObject2, jVar));
            }
        }
        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
            org.json.JSONObject jSONObject3 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONArray2, i2, (org.json.JSONObject) null);
            if (jSONObject3 != null && com.applovin.impl.o6.a(str, com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject3, "min_adapter_version", null), com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject3, "max_adapter_version", null))) {
                arrayList.add(new com.applovin.impl.o6(jSONObject3, jVar));
            }
        }
        return arrayList;
    }

    private java.util.List a(org.json.JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.q.equals("com.applovin.mediation.adapters.AppLovinMediationAdapter")) {
            com.applovin.impl.gh ghVar = new com.applovin.impl.gh("com.google.android.gms.permission.AD_ID", "Please add\n<uses-permission android:name=\"com.google.android.gms.permission.AD_ID\" />\nto your AndroidManifest.xml", com.applovin.impl.sdk.j.m());
            if (ghVar.c()) {
                arrayList.add(ghVar);
            }
        }
        org.json.JSONObject jSONObject2 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONObject, "permissions", new org.json.JSONObject());
        java.util.Iterator<java.lang.String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            try {
                java.lang.String next = itKeys.next();
                arrayList.add(new com.applovin.impl.gh(next, jSONObject2.getString(next), com.applovin.impl.sdk.j.m()));
            } catch (org.json.JSONException unused) {
            }
        }
        return arrayList;
    }

    private java.util.List a(com.applovin.mediation.adapter.MaxAdapter maxAdapter, boolean z) {
        java.util.ArrayList arrayList = new java.util.ArrayList(5);
        if (maxAdapter instanceof com.applovin.mediation.adapter.MaxInterstitialAdapter) {
            arrayList.add(com.applovin.mediation.MaxAdFormat.INTERSTITIAL);
        }
        if (maxAdapter instanceof com.applovin.mediation.adapter.MaxAppOpenAdapter) {
            arrayList.add(com.applovin.mediation.MaxAdFormat.APP_OPEN);
        }
        if (maxAdapter instanceof com.applovin.mediation.adapter.MaxRewardedAdapter) {
            arrayList.add(com.applovin.mediation.MaxAdFormat.REWARDED);
        }
        if (maxAdapter instanceof com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter) {
            arrayList.add(com.applovin.mediation.MaxAdFormat.REWARDED_INTERSTITIAL);
        }
        if (maxAdapter instanceof com.applovin.mediation.adapter.MaxAdViewAdapter) {
            arrayList.add(com.applovin.mediation.MaxAdFormat.BANNER);
            arrayList.add(com.applovin.mediation.MaxAdFormat.LEADER);
            if (z) {
                arrayList.add(com.applovin.mediation.MaxAdFormat.MREC);
            }
        }
        if (maxAdapter instanceof com.applovin.mediation.adapter.MaxNativeAdAdapter) {
            arrayList.add(com.applovin.mediation.MaxAdFormat.NATIVE);
        }
        return arrayList;
    }

    private java.util.List a(org.json.JSONObject jSONObject) {
        return com.applovin.impl.sdk.utils.JsonUtils.optList(com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(jSONObject, "supported_regions", null), null);
    }
}
