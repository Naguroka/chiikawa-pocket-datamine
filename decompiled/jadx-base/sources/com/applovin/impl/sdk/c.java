package com.applovin.impl.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class c {
    private static final java.io.File b = new java.io.File(com.applovin.impl.sdk.j.m().getFilesDir(), "al/persisted-ads");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f1283a;

    public static class a implements com.applovin.impl.hh {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.String f1284a;
        private final com.applovin.sdk.AppLovinAdType b;
        private final boolean c;
        private final long d;

        public a(java.lang.String str, com.applovin.sdk.AppLovinAdType appLovinAdType, boolean z, long j) {
            this.f1284a = str;
            this.b = appLovinAdType;
            this.c = z;
            this.d = j;
        }

        protected boolean a(java.lang.Object obj) {
            return obj instanceof com.applovin.impl.sdk.c.a;
        }

        public long b() {
            return this.d;
        }

        public java.lang.String c() {
            return this.f1284a + "_" + this.b;
        }

        public java.lang.String d() {
            return this.f1284a;
        }

        public com.applovin.sdk.AppLovinAdType e() {
            return this.b;
        }

        public boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.applovin.impl.sdk.c.a)) {
                return false;
            }
            com.applovin.impl.sdk.c.a aVar = (com.applovin.impl.sdk.c.a) obj;
            if (!aVar.a(this)) {
                return false;
            }
            java.lang.String strD = d();
            java.lang.String strD2 = aVar.d();
            if (strD != null ? !strD.equals(strD2) : strD2 != null) {
                return false;
            }
            com.applovin.sdk.AppLovinAdType appLovinAdTypeE = e();
            com.applovin.sdk.AppLovinAdType appLovinAdTypeE2 = aVar.e();
            return appLovinAdTypeE != null ? appLovinAdTypeE.equals(appLovinAdTypeE2) : appLovinAdTypeE2 == null;
        }

        public boolean f() {
            return this.c;
        }

        public int hashCode() {
            java.lang.String strD = d();
            int iHashCode = strD == null ? 43 : strD.hashCode();
            com.applovin.sdk.AppLovinAdType appLovinAdTypeE = e();
            return ((iHashCode + 59) * 59) + (appLovinAdTypeE != null ? appLovinAdTypeE.hashCode() : 43);
        }

        public java.lang.String toString() {
            return "AdPersistenceFileService.PersistedAdFilePath(id=" + d() + ", type=" + e() + ", isAdServerAd=" + f() + ", expiryTimeMillis=" + b() + ")";
        }

        public static com.applovin.impl.sdk.c.a a(com.applovin.impl.sdk.ad.b bVar) {
            return a(bVar, 0L);
        }

        public static com.applovin.impl.sdk.c.a a(com.applovin.impl.sdk.ad.b bVar, long j) {
            if (bVar == null) {
                return null;
            }
            return new com.applovin.impl.sdk.c.a(com.applovin.impl.sdk.utils.StringUtils.isValidString(bVar.I()) ? bVar.I() : java.util.UUID.randomUUID().toString(), bVar.getType(), bVar instanceof com.applovin.impl.sdk.ad.a, android.os.SystemClock.elapsedRealtime() + j);
        }

        public static com.applovin.impl.sdk.c.a a(org.json.JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
            java.lang.String string = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "id", "");
            java.lang.String string2 = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "type", "");
            java.lang.Boolean bool = com.applovin.impl.sdk.utils.JsonUtils.getBoolean(jSONObject, "is_ad_server_ad", null);
            long j = com.applovin.impl.sdk.utils.JsonUtils.getLong(jSONObject, "expiry_time_millis", 0L);
            if (android.text.TextUtils.isEmpty(string) || android.text.TextUtils.isEmpty(string2) || bool == null) {
                return null;
            }
            return new com.applovin.impl.sdk.c.a(string, com.applovin.sdk.AppLovinAdType.fromString(string2), bool.booleanValue(), j);
        }

        @Override // com.applovin.impl.hh
        public org.json.JSONObject a() {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "id", this.f1284a);
            com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "type", this.b.toString());
            com.applovin.impl.sdk.utils.JsonUtils.putBoolean(jSONObject, "is_ad_server_ad", this.c);
            com.applovin.impl.sdk.utils.JsonUtils.putLong(jSONObject, "expiry_time_millis", this.d);
            return jSONObject;
        }
    }

    public interface b {
        void a(com.applovin.impl.sdk.c.a aVar);
    }

    /* JADX INFO: renamed from: com.applovin.impl.sdk.c$c, reason: collision with other inner class name */
    public interface InterfaceC0053c {
        void a(com.applovin.impl.sdk.ad.b bVar, java.lang.String str);
    }

    public c(com.applovin.impl.sdk.j jVar) {
        this.f1283a = jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.c.b bVar2) {
        com.applovin.impl.sdk.c.a aVarA = com.applovin.impl.sdk.c.a.a(bVar, ((java.lang.Long) this.f1283a.a(com.applovin.impl.sj.a1)).longValue());
        java.io.File fileA = a(aVarA);
        if (fileA == null) {
            a("Could not persist incompatible ad", bVar, bVar2);
            return;
        }
        try {
            org.json.JSONObject jSONObjectA = bVar.a();
            if (jSONObjectA == null) {
                a("Could not serialize ad for persistence", bVar, bVar2);
                return;
            }
            if (this.f1283a.A().b(new java.io.ByteArrayInputStream(jSONObjectA.toString().getBytes(com.adjust.sdk.Constants.ENCODING)), fileA, true)) {
                a(aVarA, bVar, bVar2);
            } else {
                a("Failed to write persisted ad to disk", bVar, bVar2);
            }
        } catch (java.lang.Throwable th) {
            a("Ad could not be persisted", bVar, bVar2);
            this.f1283a.D().a("AdPersistenceFileService", th, com.applovin.impl.sdk.utils.CollectionUtils.map("error_message", "Ad could not be persisted"));
        }
    }

    public void b(final com.applovin.impl.sdk.ad.b bVar, final com.applovin.impl.sdk.c.b bVar2) {
        if (b()) {
            this.f1283a.i0().a((com.applovin.impl.yl) new com.applovin.impl.jn(this.f1283a, "persistAd", new java.lang.Runnable() { // from class: com.applovin.impl.sdk.c$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(bVar, bVar2);
                }
            }), com.applovin.impl.tm.b.CACHING);
        } else {
            a("Ad Persistence directory could not be created", bVar, bVar2);
        }
    }

    private boolean b() {
        java.io.File file = b;
        if (file.exists()) {
            return true;
        }
        return file.mkdir();
    }

    public void b(com.applovin.impl.sdk.c.a aVar) {
        java.io.File fileA = a(aVar);
        if (fileA != null) {
            fileA.delete();
        }
    }

    public void a(final com.applovin.impl.sdk.c.a aVar, final com.applovin.impl.sdk.c.InterfaceC0053c interfaceC0053c) {
        final java.io.File fileA = a(aVar);
        if (fileA != null && fileA.exists()) {
            this.f1283a.i0().a((com.applovin.impl.yl) new com.applovin.impl.jn(this.f1283a, "retrievePersistedAd", new java.lang.Runnable() { // from class: com.applovin.impl.sdk.c$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() throws java.lang.Throwable {
                    this.f$0.a(fileA, interfaceC0053c, aVar);
                }
            }), com.applovin.impl.tm.b.OTHER);
        } else {
            interfaceC0053c.a(null, "Persisted ad could not be retrieved: Retrieval failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(java.io.File file, com.applovin.impl.sdk.c.InterfaceC0053c interfaceC0053c, com.applovin.impl.sdk.c.a aVar) throws java.lang.Throwable {
        com.applovin.impl.sdk.ad.b bVarA;
        java.lang.String strE = this.f1283a.A().e(file);
        if (strE == null) {
            interfaceC0053c.a(null, "Persisted ad could not be retrieved: Read failed");
            return;
        }
        try {
            org.json.JSONObject jSONObjectJsonObjectFromJsonString = com.applovin.impl.sdk.utils.JsonUtils.jsonObjectFromJsonString(strE, new org.json.JSONObject());
            com.applovin.impl.sdk.utils.JsonUtils.putBoolean(com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONObjectJsonObjectFromJsonString, "full_response", new org.json.JSONObject()), "is_persisted_ad", true);
            if (aVar.f()) {
                bVarA = com.applovin.impl.sdk.ad.a.a(jSONObjectJsonObjectFromJsonString, this.f1283a);
            } else {
                bVarA = com.applovin.impl.aq.a(jSONObjectJsonObjectFromJsonString, this.f1283a);
            }
            if (bVarA == null) {
                interfaceC0053c.a(null, "Persisted ad could not be retrieved: Deserialization failed");
            } else {
                interfaceC0053c.a(bVarA, null);
            }
        } catch (java.lang.Throwable th) {
            interfaceC0053c.a(null, "Persisted ad could not be retrieved: Deserialization failed");
            this.f1283a.D().a("AdPersistenceFileService", th, com.applovin.impl.sdk.utils.CollectionUtils.map("error_message", "Persisted ad could not be retrieved: Deserialization failed"));
        }
    }

    private java.io.File a(com.applovin.impl.sdk.c.a aVar) {
        if (aVar == null) {
            return null;
        }
        return new java.io.File(b.getAbsolutePath() + "/" + aVar.c());
    }

    private void a(com.applovin.impl.sdk.c.a aVar, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.c.b bVar2) {
        if (bVar2 == null) {
            return;
        }
        this.f1283a.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.f1283a.I().a("AdPersistenceFileService", "Ad was persisted successfully");
        }
        bVar2.a(aVar);
        this.f1283a.D().a(com.applovin.impl.ka.q, bVar);
    }

    private void a(java.lang.String str, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.c.b bVar2) {
        if (bVar2 == null) {
            return;
        }
        this.f1283a.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.f1283a.I().a("AdPersistenceFileService", str);
        }
        bVar2.a(null);
        java.util.Map mapA = com.applovin.impl.la.a(bVar);
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("error_message", str, mapA);
        this.f1283a.D().a(com.applovin.impl.ka.r, mapA);
    }

    public void a(java.util.List list) {
        java.io.File[] fileArrListFiles = b.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        boolean z = false;
        for (java.io.File file : fileArrListFiles) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((com.applovin.impl.sdk.c.a) it.next()).c().equals(file.getName())) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                file.delete();
            }
        }
    }

    public void a() {
        java.io.File[] fileArrListFiles;
        java.io.File file = b;
        if (file.exists() && (fileArrListFiles = file.listFiles()) != null) {
            for (java.io.File file2 : fileArrListFiles) {
                file2.delete();
            }
        }
    }
}
