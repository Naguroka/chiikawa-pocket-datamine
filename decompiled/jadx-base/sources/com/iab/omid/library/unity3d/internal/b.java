package com.iab.omid.library.unity3d.internal;

/* JADX INFO: loaded from: classes5.dex */
public class b extends com.iab.omid.library.unity3d.internal.d {
    private static com.iab.omid.library.unity3d.internal.b d = new com.iab.omid.library.unity3d.internal.b();

    private b() {
    }

    public static com.iab.omid.library.unity3d.internal.b g() {
        return d;
    }

    @Override // com.iab.omid.library.unity3d.internal.d
    public void b(boolean z) {
        java.util.Iterator<com.iab.omid.library.unity3d.adsession.a> it = com.iab.omid.library.unity3d.internal.c.c().b().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(z);
        }
    }

    @Override // com.iab.omid.library.unity3d.internal.d
    public boolean d() {
        java.util.Iterator<com.iab.omid.library.unity3d.adsession.a> it = com.iab.omid.library.unity3d.internal.c.c().a().iterator();
        while (it.hasNext()) {
            android.view.View viewC = it.next().c();
            if (viewC != null && viewC.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
