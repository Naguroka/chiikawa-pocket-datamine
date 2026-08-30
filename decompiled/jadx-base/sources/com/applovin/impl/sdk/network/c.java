package com.applovin.impl.sdk.network;

/* JADX INFO: loaded from: classes3.dex */
public class c extends com.applovin.impl.yl {
    private final com.applovin.impl.sdk.network.b h;
    private final com.applovin.impl.sdk.n i;
    private java.util.concurrent.atomic.AtomicBoolean j;
    private boolean k;

    c(com.applovin.impl.sdk.network.b bVar, com.applovin.impl.sdk.j jVar) {
        super("PersistentPostbackQueueSaveTask", jVar);
        this.j = new java.util.concurrent.atomic.AtomicBoolean();
        this.k = false;
        this.h = bVar;
        this.i = jVar.I();
    }

    public java.util.List a(int i) throws java.lang.Throwable {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.applovin.impl.sdk.l lVarA = this.f1547a.A();
        if (!lVarA.b("persistent_postback_cache.json", com.applovin.impl.sdk.j.m())) {
            com.applovin.impl.sdk.n.h("PersistentPostbackQueueSaveTask", "Postbacks queue file does not exist.");
            return arrayList;
        }
        java.io.File fileA = lVarA.a("persistent_postback_cache.json", com.applovin.impl.sdk.j.m());
        java.lang.String strE = lVarA.e(fileA);
        if (android.text.TextUtils.isEmpty(strE)) {
            com.applovin.impl.sdk.n.h("PersistentPostbackQueueSaveTask", "Postbacks queue file has no content.");
            return arrayList;
        }
        boolean z = false;
        try {
            org.json.JSONArray jSONArray = new org.json.JSONObject(strE).getJSONArray("pb");
            if (com.applovin.impl.sdk.n.a()) {
                this.i.a("PersistentPostbackQueueSaveTask", "Deserializing " + jSONArray.length() + " postback(s)...");
            }
            arrayList.ensureCapacity(java.lang.Math.max(1, jSONArray.length()));
            java.lang.Integer num = (java.lang.Integer) this.f1547a.a(com.applovin.impl.sj.L2);
            for (int i2 = 0; i2 < jSONArray.length() && arrayList.size() < i; i2++) {
                try {
                    com.applovin.impl.sdk.network.d dVar = new com.applovin.impl.sdk.network.d(jSONArray.getJSONObject(i2), this.f1547a);
                    if (dVar.c() < num.intValue()) {
                        arrayList.add(dVar);
                    } else {
                        com.applovin.impl.sdk.n.h("PersistentPostbackQueueSaveTask", "Skipping deserialization because maximum attempt count exceeded for postback: " + dVar);
                    }
                } catch (java.lang.Throwable th) {
                    com.applovin.impl.sdk.n.c("PersistentPostbackQueueSaveTask", "Unable to deserialize postback from json", th);
                    this.f1547a.D().a("PersistentPostbackQueueSaveTask", "deserializePostback", th);
                }
            }
            if (com.applovin.impl.sdk.n.a()) {
                this.i.a("PersistentPostbackQueueSaveTask", "Successfully loaded postback queue with " + arrayList.size() + " postback(s).");
            }
        } catch (java.lang.Throwable th2) {
            try {
                com.applovin.impl.sdk.n.c("PersistentPostbackQueueSaveTask", "Failed to load postback queue", th2);
                try {
                    this.f1547a.D().a("PersistentPostbackQueueSaveTask", "deserializePostbackQueue", th2);
                    if (((java.lang.Boolean) this.f1547a.a(com.applovin.impl.sj.M0)).booleanValue()) {
                        lVarA.a(fileA, "removeAfterDeserializationFail");
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    z = true;
                    if (z && ((java.lang.Boolean) this.f1547a.a(com.applovin.impl.sj.M0)).booleanValue()) {
                        lVarA.a(fileA, "removeAfterDeserializationFail");
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th4) {
                th = th4;
            }
        }
        this.k = arrayList.isEmpty();
        return arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        a(this.h.d());
    }

    private void a(java.util.List list) {
        if (!(this.k && list.isEmpty()) && this.j.compareAndSet(false, true)) {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.applovin.impl.sdk.network.d dVar = (com.applovin.impl.sdk.network.d) it.next();
                try {
                    jSONArray.put(dVar.q());
                } catch (java.lang.Throwable th) {
                    com.applovin.impl.sdk.n.c("PersistentPostbackQueueSaveTask", "Unable to serialize postback to JSON: " + dVar, th);
                    this.f1547a.D().a("PersistentPostbackQueueSaveTask", "serializePostback", th);
                }
            }
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("pb", jSONArray);
                java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(jSONObject.toString().getBytes(com.adjust.sdk.Constants.ENCODING));
                com.applovin.impl.sdk.l lVarA = this.f1547a.A();
                if (lVarA.b(byteArrayInputStream, lVarA.a("persistent_postback_cache.json", com.applovin.impl.sdk.j.m()), true)) {
                    if (com.applovin.impl.sdk.n.a()) {
                        this.i.a("PersistentPostbackQueueSaveTask", "Exported postback queue to disk.");
                    }
                } else if (com.applovin.impl.sdk.n.a()) {
                    this.i.b("PersistentPostbackQueueSaveTask", "Unable to export postback queue to disk.");
                }
            } catch (java.lang.Throwable th2) {
                com.applovin.impl.sdk.n.c("PersistentPostbackQueueSaveTask", "Unable to export postbacks to disk: " + jSONArray, th2);
                this.f1547a.D().a("PersistentPostbackQueueSaveTask", "serializePostbackQueue", th2);
            }
            this.j.set(false);
        }
    }
}
