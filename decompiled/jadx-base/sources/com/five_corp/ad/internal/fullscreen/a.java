package com.five_corp.ad.internal.fullscreen;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.os.Handler f1901a = new android.os.Handler(android.os.Looper.getMainLooper());
    public com.five_corp.ad.internal.fullscreen.b b = null;

    public final void a() {
        com.five_corp.ad.internal.fullscreen.b bVar = this.b;
        if (bVar != null) {
            ((com.five_corp.ad.f) bVar).a(0, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.M6, null, null, null));
            this.b = null;
        }
    }

    public final void a(android.content.Context context, com.five_corp.ad.internal.fullscreen.b bVar) {
        if (this.b != null) {
            ((com.five_corp.ad.f) bVar).a(0, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.L6, null, null, null));
            return;
        }
        this.b = bVar;
        this.f1901a.postDelayed(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.fullscreen.a$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a();
            }
        }, 1000L);
        try {
            context.startActivity(new android.content.Intent(context, (java.lang.Class<?>) com.five_corp.ad.AdActivity.class).setFlags(268435456));
        } catch (java.lang.Exception e) {
            ((com.five_corp.ad.f) bVar).a(0, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.N6, null, e, null));
            this.b = null;
        }
    }
}
