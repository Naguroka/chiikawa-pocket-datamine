package com.iab.omid.library.bytedance2.walking.async;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b extends android.os.AsyncTask<java.lang.Object, java.lang.Void, java.lang.String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.walking.async.b.a f2414a;
    protected final com.iab.omid.library.bytedance2.walking.async.b.InterfaceC0221b b;

    public interface a {
        void a(com.iab.omid.library.bytedance2.walking.async.b bVar);
    }

    /* JADX INFO: renamed from: com.iab.omid.library.bytedance2.walking.async.b$b, reason: collision with other inner class name */
    public interface InterfaceC0221b {
        org.json.JSONObject a();

        void a(org.json.JSONObject jSONObject);
    }

    public b(com.iab.omid.library.bytedance2.walking.async.b.InterfaceC0221b interfaceC0221b) {
        this.b = interfaceC0221b;
    }

    public void a(com.iab.omid.library.bytedance2.walking.async.b.a aVar) {
        this.f2414a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(java.lang.String str) {
        com.iab.omid.library.bytedance2.walking.async.b.a aVar = this.f2414a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void a(java.util.concurrent.ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new java.lang.Object[0]);
    }
}
