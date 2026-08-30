package com.iab.omid.library.unity3d.walking;

/* JADX INFO: loaded from: classes5.dex */
public class b implements com.iab.omid.library.unity3d.walking.async.b.InterfaceC0228b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.json.JSONObject f2483a;
    private final com.iab.omid.library.unity3d.walking.async.c b;

    public b(com.iab.omid.library.unity3d.walking.async.c cVar) {
        this.b = cVar;
    }

    @Override // com.iab.omid.library.unity3d.walking.async.b.InterfaceC0228b
    public org.json.JSONObject a() {
        return this.f2483a;
    }

    @Override // com.iab.omid.library.unity3d.walking.async.b.InterfaceC0228b
    public void a(org.json.JSONObject jSONObject) {
        this.f2483a = jSONObject;
    }

    public void a(org.json.JSONObject jSONObject, java.util.HashSet<java.lang.String> hashSet, long j) {
        this.b.b(new com.iab.omid.library.unity3d.walking.async.e(this, hashSet, jSONObject, j));
    }

    public void b() {
        this.b.b(new com.iab.omid.library.unity3d.walking.async.d(this));
    }

    public void b(org.json.JSONObject jSONObject, java.util.HashSet<java.lang.String> hashSet, long j) {
        this.b.b(new com.iab.omid.library.unity3d.walking.async.f(this, hashSet, jSONObject, j));
    }
}
