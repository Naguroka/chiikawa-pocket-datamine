package com.iab.omid.library.unity3d.walking.async;

/* JADX INFO: loaded from: classes5.dex */
public class e extends com.iab.omid.library.unity3d.walking.async.a {
    public e(com.iab.omid.library.unity3d.walking.async.b.InterfaceC0228b interfaceC0228b, java.util.HashSet<java.lang.String> hashSet, org.json.JSONObject jSONObject, long j) {
        super(interfaceC0228b, hashSet, jSONObject, j);
    }

    private void b(java.lang.String str) {
        com.iab.omid.library.unity3d.internal.c cVarC = com.iab.omid.library.unity3d.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.unity3d.adsession.a aVar : cVarC.b()) {
                if (this.c.contains(aVar.getAdSessionId())) {
                    aVar.getAdSessionStatePublisher().a(str, this.e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public java.lang.String doInBackground(java.lang.Object... objArr) {
        return this.d.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.unity3d.walking.async.b, android.os.AsyncTask
    /* JADX INFO: renamed from: a */
    public void onPostExecute(java.lang.String str) {
        b(str);
        super.onPostExecute(str);
    }
}
