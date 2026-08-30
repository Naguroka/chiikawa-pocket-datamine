package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class hc {
    private static final java.lang.String e = "EventsTracker";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.json.ye f2710a;
    private com.json.bc b;
    private com.json.qf c;
    private java.util.concurrent.ExecutorService d;

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f2711a;

        a(java.lang.String str) {
            this.f2711a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.json.bq bqVar = new com.json.bq();
                java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> arrayListD = com.json.hc.this.b.d();
                if ("POST".equals(com.json.hc.this.b.e())) {
                    bqVar = com.json.mg.b(com.json.hc.this.b.b(), this.f2711a, arrayListD);
                } else if ("GET".equals(com.json.hc.this.b.e())) {
                    bqVar = com.json.mg.a(com.json.hc.this.b.b(), this.f2711a, arrayListD);
                }
                com.json.hc.this.a("response status code: " + bqVar.f2539a);
            } catch (java.lang.Exception e) {
                com.json.l9.d().a(e);
            }
        }
    }

    public hc(com.json.bc bcVar, com.json.ye yeVar) {
        if (bcVar == null) {
            throw new java.security.InvalidParameterException("Null configuration not supported ");
        }
        if (bcVar.c() == null) {
            throw new java.security.InvalidParameterException("Null formatter not supported ");
        }
        this.b = bcVar;
        this.f2710a = yeVar;
        this.c = bcVar.c();
        this.d = java.util.concurrent.Executors.newSingleThreadExecutor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(java.lang.String str) {
        if (this.b.f()) {
            android.util.Log.d(e, str);
        }
    }

    private void a(java.util.Map<java.lang.String, java.lang.Object> map, java.util.Map<java.lang.String, java.lang.Object> map2) {
        try {
            map.putAll(map2);
        } catch (java.lang.Exception e2) {
            com.json.l9.d().a(e2);
        }
    }

    private void b(java.lang.String str) {
        this.d.submit(new com.ironsource.hc.a(str));
    }

    public void a(java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map) {
        a(java.lang.String.format(java.util.Locale.ENGLISH, "%s %s", str, map.toString()));
        if (this.b.a() && !str.isEmpty()) {
            java.util.HashMap map2 = new java.util.HashMap();
            map2.put("eventname", str);
            a(map2, this.f2710a.a());
            a(map2, map);
            b(this.c.a(map2));
        }
    }
}
