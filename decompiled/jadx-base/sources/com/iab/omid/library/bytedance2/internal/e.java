package com.iab.omid.library.bytedance2.internal;

/* JADX INFO: loaded from: classes5.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.bytedance2.weakreference.a f2392a;
    private final java.lang.String b;
    private final com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose c;
    private final java.lang.String d;

    public e(android.view.View view, com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose friendlyObstructionPurpose, java.lang.String str) {
        this.f2392a = new com.iab.omid.library.bytedance2.weakreference.a(view);
        this.b = view.getClass().getCanonicalName();
        this.c = friendlyObstructionPurpose;
        this.d = str;
    }

    public java.lang.String a() {
        return this.d;
    }

    public com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose b() {
        return this.c;
    }

    public com.iab.omid.library.bytedance2.weakreference.a c() {
        return this.f2392a;
    }

    public java.lang.String d() {
        return this.b;
    }
}
