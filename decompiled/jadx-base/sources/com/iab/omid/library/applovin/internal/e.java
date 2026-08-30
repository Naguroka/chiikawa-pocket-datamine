package com.iab.omid.library.applovin.internal;

/* JADX INFO: loaded from: classes5.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.applovin.weakreference.a f2357a;
    private final java.lang.String b;
    private final com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose c;
    private final java.lang.String d;

    public e(android.view.View view, com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose friendlyObstructionPurpose, java.lang.String str) {
        this.f2357a = new com.iab.omid.library.applovin.weakreference.a(view);
        this.b = view.getClass().getCanonicalName();
        this.c = friendlyObstructionPurpose;
        this.d = str;
    }

    public java.lang.String a() {
        return this.d;
    }

    public com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose b() {
        return this.c;
    }

    public com.iab.omid.library.applovin.weakreference.a c() {
        return this.f2357a;
    }

    public java.lang.String d() {
        return this.b;
    }
}
