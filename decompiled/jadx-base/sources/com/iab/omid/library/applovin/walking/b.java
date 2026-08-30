package com.iab.omid.library.applovin.walking;

/* JADX INFO: loaded from: classes5.dex */
public class b implements com.iab.omid.library.applovin.walking.async.b.InterfaceC0217b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.json.JSONObject f2381a;
    private final com.iab.omid.library.applovin.walking.async.c b;

    public b(com.iab.omid.library.applovin.walking.async.c cVar) {
        this.b = cVar;
    }

    @Override // com.iab.omid.library.applovin.walking.async.b.InterfaceC0217b
    public org.json.JSONObject a() {
        return this.f2381a;
    }

    public void b() {
        this.b.b(new com.iab.omid.library.applovin.walking.async.d(this));
    }

    @Override // com.iab.omid.library.applovin.walking.async.b.InterfaceC0217b
    public void a(org.json.JSONObject jSONObject) {
        this.f2381a = jSONObject;
    }

    public void b(org.json.JSONObject jSONObject, java.util.HashSet<java.lang.String> hashSet, long j) {
        this.b.b(new com.iab.omid.library.applovin.walking.async.f(this, hashSet, jSONObject, j));
    }

    public void a(org.json.JSONObject jSONObject, java.util.HashSet<java.lang.String> hashSet, long j) {
        this.b.b(new com.iab.omid.library.applovin.walking.async.e(this, hashSet, jSONObject, j));
    }
}
