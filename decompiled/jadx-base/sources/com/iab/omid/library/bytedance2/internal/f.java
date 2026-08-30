package com.iab.omid.library.bytedance2.internal;

/* JADX INFO: loaded from: classes5.dex */
public class f {
    private static final java.util.regex.Pattern b = java.util.regex.Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List<com.iab.omid.library.bytedance2.internal.e> f2393a = new java.util.ArrayList();

    private void a(android.view.View view) {
        if (view == null) {
            throw new java.lang.IllegalArgumentException("FriendlyObstruction is null");
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

    private com.iab.omid.library.bytedance2.internal.e b(android.view.View view) {
        for (com.iab.omid.library.bytedance2.internal.e eVar : this.f2393a) {
            if (eVar.c().get() == view) {
                return eVar;
            }
        }
        return null;
    }

    public java.util.List<com.iab.omid.library.bytedance2.internal.e> a() {
        return this.f2393a;
    }

    public void a(android.view.View view, com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose friendlyObstructionPurpose, java.lang.String str) {
        a(view);
        a(str);
        if (b(view) == null) {
            this.f2393a.add(new com.iab.omid.library.bytedance2.internal.e(view, friendlyObstructionPurpose, str));
        }
    }

    public void b() {
        this.f2393a.clear();
    }

    public void c(android.view.View view) {
        a(view);
        com.iab.omid.library.bytedance2.internal.e eVarB = b(view);
        if (eVarB != null) {
            this.f2393a.remove(eVarB);
        }
    }
}
