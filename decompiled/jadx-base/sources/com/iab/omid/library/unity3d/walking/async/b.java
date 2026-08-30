package com.iab.omid.library.unity3d.walking.async;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b extends android.os.AsyncTask<java.lang.Object, java.lang.Void, java.lang.String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.iab.omid.library.unity3d.walking.async.b.a f2481a;
    protected final com.iab.omid.library.unity3d.walking.async.b.InterfaceC0228b b;

    public interface a {
        void a(com.iab.omid.library.unity3d.walking.async.b bVar);
    }

    /* JADX INFO: renamed from: com.iab.omid.library.unity3d.walking.async.b$b, reason: collision with other inner class name */
    public interface InterfaceC0228b {
        org.json.JSONObject a();

        void a(org.json.JSONObject jSONObject);
    }

    public b(com.iab.omid.library.unity3d.walking.async.b.InterfaceC0228b interfaceC0228b) {
        this.b = interfaceC0228b;
    }

    public void a(com.iab.omid.library.unity3d.walking.async.b.a aVar) {
        this.f2481a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(java.lang.String str) {
        com.iab.omid.library.unity3d.walking.async.b.a aVar = this.f2481a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void a(java.util.concurrent.ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new java.lang.Object[0]);
    }
}
