package com.iab.omid.library.ironsrc.processor;

/* JADX INFO: loaded from: classes5.dex */
public class c implements com.iab.omid.library.ironsrc.processor.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.ironsrc.processor.a f2433a;

    public c(com.iab.omid.library.ironsrc.processor.a aVar) {
        this.f2433a = aVar;
    }

    java.util.ArrayList<android.view.View> a() {
        android.view.View rootView;
        java.util.ArrayList<android.view.View> arrayList = new java.util.ArrayList<>();
        com.iab.omid.library.ironsrc.internal.c cVarC = com.iab.omid.library.ironsrc.internal.c.c();
        if (cVarC != null) {
            java.util.Collection<com.iab.omid.library.ironsrc.adsession.a> collectionA = cVarC.a();
            java.util.IdentityHashMap identityHashMap = new java.util.IdentityHashMap((collectionA.size() * 2) + 3);
            java.util.Iterator<com.iab.omid.library.ironsrc.adsession.a> it = collectionA.iterator();
            while (it.hasNext()) {
                android.view.View viewC = it.next().c();
                if (viewC != null && com.iab.omid.library.ironsrc.utils.h.e(viewC) && (rootView = viewC.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float fC = com.iab.omid.library.ironsrc.utils.h.c(rootView);
                    int size = arrayList.size();
                    while (size > 0 && com.iab.omid.library.ironsrc.utils.h.c(arrayList.get(size - 1)) > fC) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.ironsrc.processor.a
    public org.json.JSONObject a(android.view.View view) {
        org.json.JSONObject jSONObjectA = com.iab.omid.library.ironsrc.utils.c.a(0, 0, 0, 0);
        com.iab.omid.library.ironsrc.utils.c.a(jSONObjectA, com.iab.omid.library.ironsrc.utils.e.a());
        return jSONObjectA;
    }

    @Override // com.iab.omid.library.ironsrc.processor.a
    public void a(android.view.View view, org.json.JSONObject jSONObject, com.iab.omid.library.ironsrc.processor.a.InterfaceC0222a interfaceC0222a, boolean z, boolean z2) {
        java.util.Iterator<android.view.View> it = a().iterator();
        while (it.hasNext()) {
            interfaceC0222a.a(it.next(), this.f2433a, jSONObject, z2);
        }
    }
}
