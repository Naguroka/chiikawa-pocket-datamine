package com.iab.omid.library.applovin.internal;

/* JADX INFO: loaded from: classes5.dex */
public class f {
    private static final java.util.regex.Pattern b = java.util.regex.Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List<com.iab.omid.library.applovin.internal.e> f2358a = new java.util.ArrayList();

    private com.iab.omid.library.applovin.internal.e b(android.view.View view) {
        for (com.iab.omid.library.applovin.internal.e eVar : this.f2358a) {
            if (eVar.c().get() == view) {
                return eVar;
            }
        }
        return null;
    }

    public java.util.List<com.iab.omid.library.applovin.internal.e> a() {
        return this.f2358a;
    }

    public void c(android.view.View view) {
        a(view);
        com.iab.omid.library.applovin.internal.e eVarB = b(view);
        if (eVarB != null) {
            this.f2358a.remove(eVarB);
        }
    }

    private void a(android.view.View view) {
        if (view == null) {
            throw new java.lang.IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    public void b() {
        this.f2358a.clear();
    }

    public void a(android.view.View view, com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose friendlyObstructionPurpose, java.lang.String str) {
        a(view);
        a(str);
        if (b(view) == null) {
            this.f2358a.add(new com.iab.omid.library.applovin.internal.e(view, friendlyObstructionPurpose, str));
        }
    }

    private void a(java.lang.String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new java.lang.IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!b.matcher(str).matches()) {
                throw new java.lang.IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }
}
