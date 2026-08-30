package com.applovin.impl.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f1325a;
    private final java.util.concurrent.Executor b;
    private final android.adservices.measurement.MeasurementManager e;
    private final android.adservices.topics.TopicsManager h;
    private final java.util.Set c = new java.util.HashSet();
    private final java.lang.Object d = new java.lang.Object();
    private final java.util.concurrent.atomic.AtomicReference f = new java.util.concurrent.atomic.AtomicReference(new org.json.JSONArray());
    private final com.applovin.impl.sdk.q.d g = new com.applovin.impl.sdk.q.d(this, null);

    class a implements android.os.OutcomeReceiver {
        a() {
        }

        @Override // android.os.OutcomeReceiver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(java.lang.Exception exc) {
            com.applovin.impl.sdk.q.this.f1325a.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.q.this.f1325a.I().a("PrivacySandboxService", "Failed to register impression", exc);
            }
        }

        @Override // android.os.OutcomeReceiver
        public void onResult(java.lang.Object obj) {
            com.applovin.impl.sdk.q.this.f1325a.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.q.this.f1325a.I().a("PrivacySandboxService", "Successfully registered impression");
            }
        }
    }

    class b implements android.os.OutcomeReceiver {
        b() {
        }

        @Override // android.os.OutcomeReceiver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(java.lang.Exception exc) {
            com.applovin.impl.sdk.q.this.f1325a.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.q.this.f1325a.I().a("PrivacySandboxService", "Failed to register click", exc);
            }
        }

        @Override // android.os.OutcomeReceiver
        public void onResult(java.lang.Object obj) {
            com.applovin.impl.sdk.q.this.f1325a.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.q.this.f1325a.I().a("PrivacySandboxService", "Successfully registered click");
            }
        }
    }

    class c implements android.os.OutcomeReceiver {
        c() {
        }

        @Override // android.os.OutcomeReceiver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(java.lang.Exception exc) {
            com.applovin.impl.sdk.q.this.f1325a.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.q.this.f1325a.I().a("PrivacySandboxService", "Failed to register conversion", exc);
            }
        }

        @Override // android.os.OutcomeReceiver
        public void onResult(java.lang.Object obj) {
            com.applovin.impl.sdk.q.this.f1325a.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.q.this.f1325a.I().a("PrivacySandboxService", "Successfully registered conversion");
            }
        }
    }

    private class d implements android.os.OutcomeReceiver {
        private d() {
        }

        @Override // android.os.OutcomeReceiver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(android.adservices.topics.GetTopicsResponse getTopicsResponse) {
            java.util.List<android.adservices.topics.Topic> topics = getTopicsResponse.getTopics();
            int size = topics.size();
            com.applovin.impl.sdk.q.this.f1325a.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.q.this.f1325a.I().d("PrivacySandboxService", size + " topic(s) received");
            }
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            for (android.adservices.topics.Topic topic : topics) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                com.applovin.impl.sdk.utils.JsonUtils.putInt(jSONObject, "id", topic.getTopicId());
                com.applovin.impl.sdk.utils.JsonUtils.putLong(jSONObject, com.json.ce.v, topic.getModelVersion());
                com.applovin.impl.sdk.utils.JsonUtils.putLong(jSONObject, "taxonomy", topic.getTaxonomyVersion());
                jSONArray.put(jSONObject);
            }
            com.applovin.impl.sdk.q.this.f.set(jSONArray);
            com.applovin.impl.sdk.q.this.b(((java.lang.Boolean) com.applovin.impl.sdk.q.this.f1325a.a(com.applovin.impl.sj.y6)).booleanValue(), ((java.lang.Long) com.applovin.impl.sdk.q.this.f1325a.a(com.applovin.impl.sj.w6)).longValue());
        }

        /* synthetic */ d(com.applovin.impl.sdk.q qVar, com.applovin.impl.sdk.q.a aVar) {
            this();
        }

        @Override // android.os.OutcomeReceiver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(java.lang.Exception exc) {
            java.lang.Long l = (java.lang.Long) com.applovin.impl.sdk.q.this.f1325a.a(com.applovin.impl.sj.x6);
            boolean z = l.longValue() == -1;
            com.applovin.impl.sdk.q.this.f1325a.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.q.this.f1325a.I().a("PrivacySandboxService", "Failed to retrieve topics" + (z ? "" : ", retrying in " + l + " ms"), exc);
            }
            if (z) {
                return;
            }
            com.applovin.impl.sdk.q.this.b(((java.lang.Boolean) com.applovin.impl.sdk.q.this.f1325a.a(com.applovin.impl.sj.z6)).booleanValue(), l.longValue());
        }
    }

    protected q(com.applovin.impl.sdk.j jVar) {
        this.f1325a = jVar;
        this.b = jVar.i0().a();
        android.content.Context contextM = com.applovin.impl.sdk.j.m();
        this.e = (android.adservices.measurement.MeasurementManager) contextM.getSystemService(android.adservices.measurement.MeasurementManager.class);
        this.h = (android.adservices.topics.TopicsManager) contextM.getSystemService(android.adservices.topics.TopicsManager.class);
        if (((java.lang.Boolean) jVar.a(com.applovin.impl.sj.v6)).booleanValue()) {
            b(((java.lang.Boolean) jVar.a(com.applovin.impl.sj.y6)).booleanValue(), 0L);
        }
    }

    private boolean c(java.lang.String str) {
        synchronized (this.d) {
            if (this.c.contains(str)) {
                return false;
            }
            this.c.add(str);
            return true;
        }
    }

    public void b(final java.util.List list) {
        a("register impression", new java.lang.Runnable() { // from class: com.applovin.impl.sdk.q$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(java.util.List list) {
        if (list == null || list.isEmpty() || this.e == null || !com.applovin.impl.wh.e(com.applovin.impl.sdk.j.v0)) {
            return;
        }
        this.f1325a.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.f1325a.I().a("PrivacySandboxService", "Registering impression...");
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            this.e.registerSource(android.net.Uri.parse((java.lang.String) it.next()), null, this.b, new com.applovin.impl.sdk.q.a());
        }
    }

    public void b(final java.util.List list, final android.view.InputEvent inputEvent) {
        a("register click", new java.lang.Runnable() { // from class: com.applovin.impl.sdk.q$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(list, inputEvent);
            }
        });
    }

    public void b(final java.lang.String str) {
        a("register conversion trigger event", new java.lang.Runnable() { // from class: com.applovin.impl.sdk.q$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final boolean z, final long j) {
        a("retrieve topics", new java.lang.Runnable() { // from class: com.applovin.impl.sdk.q$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(z, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(java.util.List list, android.view.InputEvent inputEvent) {
        if (list == null || list.isEmpty() || this.e == null || !com.applovin.impl.wh.e(com.applovin.impl.sdk.j.v0)) {
            return;
        }
        this.f1325a.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.f1325a.I().a("PrivacySandboxService", "Registering click...");
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            this.e.registerSource(android.net.Uri.parse((java.lang.String) it.next()), inputEvent, this.b, new com.applovin.impl.sdk.q.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str) || this.e == null || !com.applovin.impl.wh.e(com.applovin.impl.sdk.j.v0)) {
            return;
        }
        this.f1325a.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.f1325a.I().a("PrivacySandboxService", "Registering conversion: " + str);
        }
        this.e.registerTrigger(android.net.Uri.parse(str), this.b, new com.applovin.impl.sdk.q.c());
    }

    public org.json.JSONArray a() {
        return (org.json.JSONArray) this.f.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z, long j) {
        if (this.h == null) {
            return;
        }
        final android.adservices.topics.GetTopicsRequest getTopicsRequestBuild = new android.adservices.topics.GetTopicsRequest.Builder().setShouldRecordObservation(z).setAdsSdkName("AppLovin").build();
        if (j > 0) {
            this.f1325a.i0().a(new com.applovin.impl.jn(this.f1325a, true, "getTopics", new java.lang.Runnable() { // from class: com.applovin.impl.sdk.q$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(getTopicsRequestBuild);
                }
            }), com.applovin.impl.tm.b.OTHER, j);
        } else {
            this.h.getTopics(getTopicsRequestBuild, this.b, this.g);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(android.adservices.topics.GetTopicsRequest getTopicsRequest) {
        this.h.getTopics(getTopicsRequest, this.b, this.g);
    }

    private void a(java.lang.String str, java.lang.Runnable runnable) {
        try {
            this.f1325a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f1325a.I().a("PrivacySandboxService", "Running operation: " + str);
            }
            runnable.run();
        } catch (java.lang.Throwable th) {
            this.f1325a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f1325a.I().a("PrivacySandboxService", "Failed to run operation: " + str, th);
            }
            if (c(str)) {
                this.f1325a.D().a("PrivacySandboxService", str, th);
            }
        }
    }
}
