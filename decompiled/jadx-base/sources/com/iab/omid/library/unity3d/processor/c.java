package com.iab.omid.library.unity3d.processor;

/* JADX INFO: loaded from: classes5.dex */
public class c implements com.iab.omid.library.unity3d.processor.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.unity3d.processor.a f2466a;

    public c(com.iab.omid.library.unity3d.processor.a aVar) {
        this.f2466a = aVar;
    }

    java.util.ArrayList<android.view.View> a() {
        android.view.View rootView;
        java.util.ArrayList<android.view.View> arrayList = new java.util.ArrayList<>();
        com.iab.omid.library.unity3d.internal.c cVarC = com.iab.omid.library.unity3d.internal.c.c();
        if (cVarC != null) {
            java.util.Collection<com.iab.omid.library.unity3d.adsession.a> collectionA = cVarC.a();
            java.util.IdentityHashMap identityHashMap = new java.util.IdentityHashMap((collectionA.size() * 2) + 3);
            java.util.Iterator<com.iab.omid.library.unity3d.adsession.a> it = collectionA.iterator();
            while (it.hasNext()) {
                android.view.View viewC = it.next().c();
                if (viewC != null && com.iab.omid.library.unity3d.utils.h.e(viewC) && (rootView = viewC.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float fC = com.iab.omid.library.unity3d.utils.h.c(rootView);
                    int size = arrayList.size();
                    while (size > 0 && com.iab.omid.library.unity3d.utils.h.c(arrayList.get(size - 1)) > fC) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.unity3d.processor.a
    public org.json.JSONObject a(android.view.View view) {
        org.json.JSONObject jSONObjectA = com.iab.omid.library.unity3d.utils.c.a(0, 0, 0, 0);
        com.iab.omid.library.unity3d.utils.c.a(jSONObjectA, com.iab.omid.library.unity3d.utils.e.a());
        return jSONObjectA;
    }

    @Override // com.iab.omid.library.unity3d.processor.a
    public void a(android.view.View view, org.json.JSONObject jSONObject, com.iab.omid.library.unity3d.processor.a.InterfaceC0225a interfaceC0225a, boolean z, boolean z2) {
        java.util.Iterator<android.view.View> it = a().iterator();
        while (it.hasNext()) {
            interfaceC0225a.a(it.next(), this.f2466a, jSONObject, z2);
        }
    }
}
