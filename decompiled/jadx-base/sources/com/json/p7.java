package com.json;

/* JADX INFO: loaded from: classes5.dex */
public abstract class p7 implements com.json.mf {
    private int[] A;
    private int[] B;
    private int[] C;
    int G;
    java.lang.String H;
    java.lang.String I;
    java.util.Set<java.lang.Integer> J;
    private com.json.yb K;
    private com.json.mediationsdk.IronSourceSegment L;
    private com.json.is M;
    private com.json.mediationsdk.events.ISErrorListener N;
    private boolean l;
    private com.json.aa p;
    private com.json.e q;
    private java.util.ArrayList<com.json.wb> r;
    private int t;
    private com.json.sh u;
    private android.content.Context v;
    private int[] z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f3148a = 1;
    final int b = 100;
    final int c = 5000;
    final int d = 90000;
    final int e = 1024;
    final int f = 5;
    final java.lang.String g = "supersonic_sdk.db";
    final java.lang.String h = com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER;
    final java.lang.String i = "placement";
    private final java.lang.String j = com.json.ce.E0;
    private final java.lang.String k = com.json.ce.P0;
    private boolean m = false;
    private boolean n = false;
    private int o = -1;
    private boolean s = true;
    private int w = 100;
    private int x = 5000;
    private int y = 1;
    private java.util.Map<java.lang.String, java.lang.String> D = new java.util.HashMap();
    private java.util.Map<java.lang.String, java.lang.String> E = new java.util.HashMap();
    private java.lang.String F = "";
    private final java.lang.Object O = new java.lang.Object();

    class a implements java.lang.Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.p7.this.a();
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.wb f3150a;
        final /* synthetic */ com.ironsource.mediationsdk.IronSource.AD_UNIT b;

        b(com.json.wb wbVar, com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit) {
            this.f3150a = wbVar;
            this.b = ad_unit;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3150a.a("eventSessionId", com.json.p7.this.u.b());
            this.f3150a.a("essn", java.lang.Integer.valueOf(com.json.p7.this.u.c()));
            java.lang.String connectionType = com.json.mediationsdk.utils.IronSourceUtils.getConnectionType(com.json.p7.this.v);
            if (com.json.p7.this.g(this.f3150a)) {
                this.f3150a.a(com.ironsource.y8.i.t, connectionType);
            }
            if (com.json.p7.this.a(connectionType, this.f3150a)) {
                com.json.wb wbVar = this.f3150a;
                wbVar.a(com.json.p7.this.b(wbVar));
            }
            java.lang.String strD = com.json.v8.d(com.json.p7.this.v);
            if (strD != null) {
                this.f3150a.a(com.ironsource.y8.i.u, strD);
            }
            int iA = com.json.p7.this.a(this.f3150a.c(), this.b);
            if (iA != com.ironsource.p7.e.NOT_SUPPORTED.a()) {
                this.f3150a.a("adUnit", java.lang.Integer.valueOf(iA));
            }
            com.json.p7.this.a(this.f3150a, "reason");
            com.json.p7.this.a(this.f3150a, com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1);
            if (!com.json.p7.this.E.isEmpty()) {
                for (java.util.Map.Entry entry : com.json.p7.this.E.entrySet()) {
                    if (!this.f3150a.b().has((java.lang.String) entry.getKey()) && entry.getKey() != "eventId" && entry.getKey() != com.ironsource.aa.a.d) {
                        this.f3150a.a((java.lang.String) entry.getKey(), entry.getValue());
                    }
                }
            }
            if (com.json.p7.this.i(this.f3150a)) {
                if (com.json.p7.this.h(this.f3150a) && !com.json.p7.this.e(this.f3150a)) {
                    this.f3150a.a("sessionDepth", java.lang.Integer.valueOf(com.json.p7.this.c(this.f3150a)));
                }
                if (com.json.p7.this.j(this.f3150a)) {
                    com.json.p7.this.f(this.f3150a);
                }
                long jA = com.json.p7.this.u.a();
                if (jA > 0) {
                    this.f3150a.a("firstSessionTimestamp", java.lang.Long.valueOf(jA));
                }
                com.json.mediationsdk.logger.IronLog.EVENT.verbose(this.f3150a.toString());
                com.json.p7.this.r.add(this.f3150a);
                com.json.p7.d(com.json.p7.this);
            }
            com.json.p7 p7Var = com.json.p7.this;
            boolean zA = p7Var.a(p7Var.B) ? com.json.p7.this.a(this.f3150a.c(), com.json.p7.this.B) : com.json.p7.this.d(this.f3150a);
            if (!com.json.p7.this.m && zA) {
                com.json.p7.this.m = true;
            }
            if (com.json.p7.this.p != null) {
                if (com.json.p7.this.g()) {
                    com.json.p7.this.f();
                    return;
                }
                com.json.p7 p7Var2 = com.json.p7.this;
                if (p7Var2.b((java.util.ArrayList<com.json.wb>) p7Var2.r) || zA) {
                    com.json.p7.this.a();
                }
            }
        }
    }

    class c implements com.json.nf {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(com.ironsource.nf.a aVar) {
            try {
                if (aVar.c()) {
                    java.util.ArrayList<com.json.wb> arrayListA = com.json.p7.this.p.a(com.json.p7.this.I);
                    com.json.p7.this.t = arrayListA.size() + com.json.p7.this.r.size();
                } else {
                    com.json.mediationsdk.logger.IronLog.INTERNAL.error("Failed to send events. Saving them back to storage.");
                    com.json.p7.this.a(com.json.p7.this.a(aVar.b(), aVar.a()));
                }
            } catch (java.lang.Exception e) {
                com.json.l9.d().a(e);
                if (com.json.p7.this.N != null) {
                    com.json.p7.this.N.onError(new java.lang.IllegalStateException("Error on sending data ", e));
                }
            }
            a(aVar.b());
        }

        @Override // com.json.nf
        public synchronized void a(final com.ironsource.nf.a aVar) {
            com.json.p7.this.K.a(new java.lang.Runnable() { // from class: com.ironsource.p7$c$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.b(aVar);
                }
            });
        }

        public void a(java.util.ArrayList<com.json.wb> arrayList) {
            if (arrayList != null) {
                try {
                    arrayList.clear();
                } catch (java.lang.Exception e) {
                    com.json.l9.d().a(e);
                    com.json.mediationsdk.logger.IronLog.INTERNAL.error("clearData exception: " + e.getMessage());
                }
            }
        }
    }

    class d implements java.lang.Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.p7.this.f();
        }
    }

    public enum e {
        NOT_SUPPORTED(-1),
        INTERSTITIAL(2),
        REWARDED_VIDEO(3),
        NATIVE_AD(4),
        BANNER(8);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f3153a;

        e(int i) {
            this.f3153a = i;
        }

        public int a() {
            return this.f3153a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i, com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit) {
        com.ironsource.p7.e eVar;
        int iA = com.ironsource.p7.e.NOT_SUPPORTED.a();
        if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO || ((i >= 1000 && i < 2000) || (i >= 91000 && i < 92000))) {
            eVar = com.ironsource.p7.e.REWARDED_VIDEO;
        } else if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL || ((i >= 2000 && i < 3000) || (i >= 92000 && i < 93000))) {
            eVar = com.ironsource.p7.e.INTERSTITIAL;
        } else if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER || ((i >= 3000 && i < 4000) || (i >= 93000 && i < 94000))) {
            eVar = com.ironsource.p7.e.BANNER;
        } else {
            if (ad_unit != com.ironsource.mediationsdk.IronSource.AD_UNIT.NATIVE_AD && ((i < 4000 || i >= 5000) && (i < 94000 || i >= 95000))) {
                return iA;
            }
            eVar = com.ironsource.p7.e.NATIVE_AD;
        }
        return eVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.util.ArrayList<com.json.wb> a(java.util.ArrayList<com.json.wb> arrayList, java.lang.String str) {
        java.lang.String strA = a(str, 1024);
        java.util.Iterator<com.json.wb> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a(strA);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        synchronized (this.O) {
            this.p.a(this.r, this.I);
            this.r.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.json.wb wbVar, java.lang.String str) {
        a(wbVar, str, 1024);
    }

    private void a(com.json.wb wbVar, java.lang.String str, int i) {
        org.json.JSONObject jSONObjectB = wbVar.b();
        if (jSONObjectB == null || !jSONObjectB.has(str)) {
            return;
        }
        try {
            wbVar.a(str, a(jSONObjectB.optString(str, null), i));
        } catch (java.lang.Exception e2) {
            com.json.l9.d().a(e2);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
        }
    }

    private void a(org.json.JSONObject jSONObject) {
        try {
            com.json.mediationsdk.IronSourceSegment ironSourceSegment = this.L;
            if (ironSourceSegment != null) {
                if (ironSourceSegment.getAge() > 0) {
                    jSONObject.put(com.json.mediationsdk.IronSourceSegment.AGE, this.L.getAge());
                }
                if (!android.text.TextUtils.isEmpty(this.L.getGender())) {
                    jSONObject.put(com.json.mediationsdk.IronSourceSegment.GENDER, this.L.getGender());
                }
                if (this.L.getLevel() > 0) {
                    jSONObject.put(com.json.mediationsdk.IronSourceSegment.LEVEL, this.L.getLevel());
                }
                if (this.L.getIsPaying() != null) {
                    jSONObject.put(com.json.mediationsdk.IronSourceSegment.PAYING, this.L.getIsPaying().get());
                }
                if (this.L.getIapt() > 0.0d) {
                    jSONObject.put(com.json.mediationsdk.IronSourceSegment.IAPT, this.L.getIapt());
                }
                if (this.L.getUcd() > 0) {
                    jSONObject.put(com.json.mediationsdk.IronSourceSegment.USER_CREATION_DATE, this.L.getUcd());
                }
            }
            com.json.is isVar = this.M;
            if (isVar != null) {
                java.lang.String strB = isVar.b();
                if (!android.text.TextUtils.isEmpty(strB)) {
                    jSONObject.put("segmentId", strB);
                }
                org.json.JSONObject jSONObjectA = this.M.a();
                java.util.Iterator<java.lang.String> itKeys = jSONObjectA.keys();
                while (itKeys.hasNext()) {
                    java.lang.String next = itKeys.next();
                    jSONObject.put(next, jSONObjectA.get(next));
                }
            }
        } catch (org.json.JSONException e2) {
            com.json.l9.d().a(e2);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i, int[] iArr) {
        if (!a(iArr)) {
            return false;
        }
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean a(java.lang.String str, com.json.wb wbVar) {
        if (str.equalsIgnoreCase("none")) {
            return a(this.C) ? a(wbVar.c(), this.C) : this.J.contains(java.lang.Integer.valueOf(wbVar.c()));
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int[] iArr) {
        return iArr != null && iArr.length > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized int b(com.json.wb wbVar) {
        return wbVar.c() + 90000;
    }

    private void b(java.lang.String str) {
        com.json.e eVar = this.q;
        if (eVar == null || !eVar.c().equals(str)) {
            this.q = com.json.dc.a(str, this.G);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(java.util.ArrayList<com.json.wb> arrayList) {
        return arrayList != null && arrayList.size() >= this.y;
    }

    static /* synthetic */ int d(com.json.p7 p7Var) {
        int i = p7Var.t;
        p7Var.t = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(com.json.wb wbVar) {
        org.json.JSONObject jSONObjectB = wbVar.b();
        if (jSONObjectB == null) {
            return false;
        }
        return jSONObjectB.has("sessionDepth");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void f() {
        java.util.ArrayList<com.json.wb> arrayListA;
        try {
            this.m = false;
            java.util.ArrayList<com.json.wb> arrayList = new java.util.ArrayList<>();
            try {
                synchronized (this.O) {
                    arrayListA = this.p.a(this.I);
                    this.p.b(this.I);
                }
                com.ironsource.ac.c cVar = new com.ironsource.ac.c(new com.ironsource.ac.a(arrayListA, this.r), this.x);
                this.p.a(cVar.a(), this.I);
                arrayList.addAll(cVar.b());
            } catch (java.lang.Throwable th) {
                com.json.l9.d().a(th);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error("CombinedEventList exception: " + th.getMessage());
                com.json.mediationsdk.events.ISErrorListener iSErrorListener = this.N;
                if (iSErrorListener != null) {
                    iSErrorListener.onError(new java.lang.IllegalStateException("Combined event exception: ", th));
                }
                arrayList.clear();
                arrayList.addAll(this.r);
            }
            if (arrayList.size() > 0) {
                this.r.clear();
                this.t = 0;
                org.json.JSONObject jSONObjectB = com.json.zd.a().b();
                try {
                    a(jSONObjectB);
                    java.lang.String strB = b();
                    if (!android.text.TextUtils.isEmpty(strB)) {
                        jSONObjectB.put(com.json.ce.E0, strB);
                    }
                    java.lang.String strQ = com.json.mediationsdk.p.m().q();
                    if (!android.text.TextUtils.isEmpty(strQ)) {
                        jSONObjectB.put(com.json.ce.P0, strQ);
                    }
                    java.util.Map<java.lang.String, java.lang.String> mapC = c();
                    if (!mapC.isEmpty()) {
                        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : mapC.entrySet()) {
                            if (!jSONObjectB.has(entry.getKey())) {
                                jSONObjectB.put(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                    org.json.JSONObject jSONObjectA = new com.json.fc().a();
                    java.util.Iterator<java.lang.String> itKeys = jSONObjectA.keys();
                    while (itKeys.hasNext()) {
                        java.lang.String next = itKeys.next();
                        jSONObjectB.put(next, jSONObjectA.get(next));
                    }
                } catch (java.lang.Throwable th2) {
                    com.json.l9.d().a(th2);
                    com.json.mediationsdk.logger.IronLog.INTERNAL.error("Exception while building the event general properties: " + th2.getMessage());
                }
                java.lang.String strA = this.q.a(arrayList, jSONObjectB);
                if (android.text.TextUtils.isEmpty(strA)) {
                    com.json.mediationsdk.logger.IronLog.INTERNAL.error("Failed to parse events.");
                    com.json.mediationsdk.events.ISErrorListener iSErrorListener2 = this.N;
                    if (iSErrorListener2 != null) {
                        iSErrorListener2.onError(new java.lang.IllegalStateException("Event parse failed"));
                        return;
                    }
                    return;
                }
                if (this.n) {
                    try {
                        strA = android.util.Base64.encodeToString(com.json.sj.a(strA, this.o), 0);
                    } catch (java.lang.Exception e2) {
                        com.json.l9.d().a(e2);
                        com.json.mediationsdk.events.ISErrorListener iSErrorListener3 = this.N;
                        if (iSErrorListener3 != null) {
                            iSErrorListener3.onError(new java.lang.IllegalStateException("Error on compression: ", e2));
                        }
                    }
                }
                com.json.st.f3417a.a(new com.json.gc(new com.ironsource.p7.c(), strA, this.q.b(), arrayList));
            }
        } catch (java.lang.Throwable th3) {
            com.json.l9.d().a(th3);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error("Send event exception: " + th3.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        return (this.t >= this.w || this.m) && this.l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i(com.json.wb wbVar) {
        if (wbVar == null) {
            return false;
        }
        if (a(this.z)) {
            return true ^ a(wbVar.c(), this.z);
        }
        if (a(this.A)) {
            return a(wbVar.c(), this.A);
        }
        return true;
    }

    java.lang.String a(java.lang.String str, int i) {
        return (android.text.TextUtils.isEmpty(str) || str.length() <= i) ? str : str.substring(0, i);
    }

    @Override // com.json.mf
    public void a(int i) {
        if (i > 0) {
            this.x = i;
        }
    }

    public synchronized void a(android.content.Context context, com.json.mediationsdk.IronSourceSegment ironSourceSegment) {
        java.lang.String defaultEventsFormatterType = com.json.mediationsdk.utils.IronSourceUtils.getDefaultEventsFormatterType(context, this.I, this.H);
        this.H = defaultEventsFormatterType;
        b(defaultEventsFormatterType);
        this.q.a(com.json.mediationsdk.utils.IronSourceUtils.getDefaultEventsURL(context, this.I, null));
        this.p = com.json.aa.a(context, "supersonic_sdk.db", 5);
        this.K.a(new com.ironsource.p7.a());
        this.z = com.json.mediationsdk.utils.IronSourceUtils.getDefaultOptOutEvents(context, this.I);
        this.A = com.json.mediationsdk.utils.IronSourceUtils.getDefaultOptInEvents(context, this.I);
        this.B = com.json.mediationsdk.utils.IronSourceUtils.getDefaultTriggerEvents(context, this.I);
        this.C = com.json.mediationsdk.utils.IronSourceUtils.getDefaultNonConnectivityEvents(context, this.I);
        this.L = ironSourceSegment;
        this.v = context;
    }

    public synchronized void a(com.json.is isVar) {
        this.M = isVar;
    }

    public void a(com.json.mediationsdk.IronSourceSegment ironSourceSegment) {
        this.L = ironSourceSegment;
    }

    public void a(com.json.mediationsdk.events.ISErrorListener iSErrorListener) {
        this.N = iSErrorListener;
    }

    @Override // com.json.mf
    public synchronized void a(com.json.wb wbVar) {
        a(wbVar, (com.ironsource.mediationsdk.IronSource.AD_UNIT) null);
    }

    public synchronized void a(com.json.wb wbVar, com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit) {
        if (wbVar != null) {
            if (this.s) {
                this.K.a(new com.ironsource.p7.b(wbVar, ad_unit));
            }
        }
    }

    void a(java.lang.Runnable runnable) {
        this.K.a(runnable);
    }

    public void a(java.lang.String str) {
        this.F = str;
    }

    @Override // com.json.mf
    public void a(java.lang.String str, android.content.Context context) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.H = str;
        com.json.mediationsdk.utils.IronSourceUtils.saveDefaultEventsFormatterType(context, this.I, str);
        b(str);
    }

    protected void a(java.util.ArrayList<com.json.wb> arrayList) {
        if (arrayList != null) {
            synchronized (this.O) {
                this.p.a(arrayList, this.I);
                this.t = this.p.a(this.I).size() + this.r.size();
            }
        }
    }

    public void a(java.util.Map<java.lang.String, java.lang.String> map) {
        this.D.putAll(map);
    }

    public void a(java.util.Map<java.lang.String, java.lang.Object> map, int i, java.lang.String str) {
        map.put(com.json.mediationsdk.utils.IronSourceConstants.AUCTION_TRIALS, java.lang.Integer.valueOf(i));
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        map.put(com.json.mediationsdk.utils.IronSourceConstants.AUCTION_FALLBACK, str);
    }

    @Override // com.json.mf
    public void a(boolean z) {
        this.n = z;
    }

    @Override // com.json.mf
    public void a(int[] iArr, android.content.Context context) {
        this.A = iArr;
        com.json.mediationsdk.utils.IronSourceUtils.saveDefaultOptInEvents(context, this.I, iArr);
    }

    public java.lang.String b() {
        return this.F;
    }

    @Override // com.json.mf
    public void b(int i) {
        if (i > 0) {
            this.w = i;
        }
    }

    @Override // com.json.mf
    public void b(java.lang.String str, android.content.Context context) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.json.e eVar = this.q;
        if (eVar != null) {
            eVar.a(str);
        }
        com.json.mediationsdk.utils.IronSourceUtils.saveDefaultEventsURL(context, this.I, str);
    }

    public void b(java.util.Map<java.lang.String, java.lang.String> map) {
        this.E.putAll(map);
    }

    @Override // com.json.mf
    public void b(boolean z) {
        this.s = z;
    }

    @Override // com.json.mf
    public void b(int[] iArr, android.content.Context context) {
        this.B = iArr;
        com.json.mediationsdk.utils.IronSourceUtils.saveDefaultTriggerEvents(context, this.I, iArr);
    }

    protected abstract int c(com.json.wb wbVar);

    public java.util.Map<java.lang.String, java.lang.String> c() {
        return this.D;
    }

    @Override // com.json.mf
    public void c(int i) {
        if (i > 0) {
            this.y = i;
        }
    }

    public void c(boolean z) {
        this.l = z;
    }

    @Override // com.json.mf
    public void c(int[] iArr, android.content.Context context) {
        this.z = iArr;
        com.json.mediationsdk.utils.IronSourceUtils.saveDefaultOptOutEvents(context, this.I, iArr);
    }

    abstract void d();

    @Override // com.json.mf
    public void d(int i) {
        this.o = i;
    }

    @Override // com.json.mf
    public void d(int[] iArr, android.content.Context context) {
        this.C = iArr;
        com.json.mediationsdk.utils.IronSourceUtils.saveDefaultNonConnectivityEvents(context, this.I, iArr);
    }

    protected abstract boolean d(com.json.wb wbVar);

    protected abstract java.lang.String e(int i);

    void e() {
        this.r = new java.util.ArrayList<>();
        this.t = 0;
        this.q = com.json.dc.a(this.H, this.G);
        com.json.yb ybVar = new com.json.yb(this.I + "EventThread");
        this.K = ybVar;
        ybVar.start();
        this.K.a();
        this.u = com.json.im.S().h();
        this.J = new java.util.HashSet();
        d();
    }

    protected int f(int i) {
        return a(i, (com.ironsource.mediationsdk.IronSource.AD_UNIT) null);
    }

    protected abstract void f(com.json.wb wbVar);

    protected boolean g(com.json.wb wbVar) {
        return (wbVar.c() == 40 || wbVar.c() == 41 || wbVar.c() == 50 || wbVar.c() == 51 || wbVar.c() == 52) ? false : true;
    }

    public void h() {
        this.K.a(new com.ironsource.p7.d());
    }

    protected boolean h(com.json.wb wbVar) {
        return (wbVar.c() == 14 || wbVar.c() == 114 || wbVar.c() == 514 || wbVar.c() == 515 || wbVar.c() == 516 || wbVar.c() == 140 || wbVar.c() == 40 || wbVar.c() == 41 || wbVar.c() == 50 || wbVar.c() == 51 || wbVar.c() == 52) ? false : true;
    }

    protected abstract boolean j(com.json.wb wbVar);
}
