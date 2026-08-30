package com.iab.omid.library.applovin.processor;

/* JADX INFO: loaded from: classes5.dex */
public class c implements com.iab.omid.library.applovin.processor.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.applovin.processor.a f2364a;

    public c(com.iab.omid.library.applovin.processor.a aVar) {
        this.f2364a = aVar;
    }

    java.util.ArrayList<android.view.View> a() {
        android.view.View rootView;
        java.util.ArrayList<android.view.View> arrayList = new java.util.ArrayList<>();
        com.iab.omid.library.applovin.internal.c cVarC = com.iab.omid.library.applovin.internal.c.c();
        if (cVarC != null) {
            java.util.Collection<com.iab.omid.library.applovin.adsession.a> collectionA = cVarC.a();
            java.util.IdentityHashMap identityHashMap = new java.util.IdentityHashMap((collectionA.size() * 2) + 3);
            java.util.Iterator<com.iab.omid.library.applovin.adsession.a> it = collectionA.iterator();
            while (it.hasNext()) {
                android.view.View viewC = it.next().c();
                if (viewC != null && com.iab.omid.library.applovin.utils.h.e(viewC) && (rootView = viewC.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float fC = com.iab.omid.library.applovin.utils.h.c(rootView);
                    int size = arrayList.size();
                    while (size > 0 && com.iab.omid.library.applovin.utils.h.c(arrayList.get(size - 1)) > fC) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.applovin.processor.a
    public org.json.JSONObject a(android.view.View view) {
        org.json.JSONObject jSONObjectA = com.iab.omid.library.applovin.utils.c.a(0, 0, 0, 0);
        com.iab.omid.library.applovin.utils.c.a(jSONObjectA, com.iab.omid.library.applovin.utils.e.a());
        return jSONObjectA;
    }

    @Override // com.iab.omid.library.applovin.processor.a
    public void a(android.view.View view, org.json.JSONObject jSONObject, com.iab.omid.library.applovin.processor.a.InterfaceC0214a interfaceC0214a, boolean z, boolean z2) {
        java.util.Iterator<android.view.View> it = a().iterator();
        while (it.hasNext()) {
            interfaceC0214a.a(it.next(), this.f2364a, jSONObject, z2);
        }
    }
}
