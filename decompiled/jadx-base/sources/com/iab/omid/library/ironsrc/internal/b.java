package com.iab.omid.library.ironsrc.internal;

/* JADX INFO: loaded from: classes5.dex */
public class b extends com.iab.omid.library.ironsrc.internal.d {
    private static com.iab.omid.library.ironsrc.internal.b d = new com.iab.omid.library.ironsrc.internal.b();

    private b() {
    }

    public static com.iab.omid.library.ironsrc.internal.b g() {
        return d;
    }

    @Override // com.iab.omid.library.ironsrc.internal.d
    public void b(boolean z) {
        java.util.Iterator<com.iab.omid.library.ironsrc.adsession.a> it = com.iab.omid.library.ironsrc.internal.c.c().b().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(z);
        }
    }

    @Override // com.iab.omid.library.ironsrc.internal.d
    public boolean d() {
        java.util.Iterator<com.iab.omid.library.ironsrc.adsession.a> it = com.iab.omid.library.ironsrc.internal.c.c().a().iterator();
        while (it.hasNext()) {
            android.view.View viewC = it.next().c();
            if (viewC != null && viewC.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
