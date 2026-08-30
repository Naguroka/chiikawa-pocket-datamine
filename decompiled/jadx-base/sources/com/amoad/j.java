package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
final class j {
    private static com.amoad.j d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final android.content.Context f311a;
    boolean b;
    private final java.util.Map<java.lang.String, com.amoad.aq> c = new java.util.HashMap();

    private j(android.content.Context context) {
        this.f311a = context.getApplicationContext();
    }

    public static synchronized com.amoad.j a(android.content.Context context) {
        if (d == null) {
            d = new com.amoad.j(context);
        }
        return d;
    }

    final synchronized com.amoad.aq a(java.lang.String str) {
        if (!b(str)) {
            this.c.put(str, new com.amoad.aq(this.f311a, str));
        }
        return this.c.get(str);
    }

    public final void a(java.lang.String str, int i, int i2, boolean z, boolean z2) {
        a(str).a(i, i2, z, z2);
    }

    final void a(java.lang.String str, final com.amoad.av avVar) {
        final com.amoad.aq aqVarA = a(str);
        if (!aqVarA.g) {
            com.amoad.AMoAdLogger.getInstance().w("先にAMoAdNativeManager#prepareAd()を呼んでください。");
            aqVarA.a(null, com.amoad.AMoAdNativeListener.Result.Failure, avVar);
            return;
        }
        aqVarA.f233a = com.amoad.aq.a(java.lang.System.currentTimeMillis(), aqVarA.f233a);
        final int iA = aqVarA.a();
        com.amoad.i iVarA = aqVarA.a(iA);
        if (iVarA == null) {
            com.amoad.bc.a(aqVarA.b, new java.lang.Runnable() { // from class: com.amoad.aq.4
                @Override // java.lang.Runnable
                public final void run() {
                    if (com.amoad.aq.this.f233a.isEmpty() && com.amoad.AMoAdNativeListener.Result.Empty == com.amoad.aq.b(com.amoad.aq.this)) {
                        com.amoad.aq.this.a(null, com.amoad.AMoAdNativeListener.Result.Empty, avVar);
                        return;
                    }
                    com.amoad.i iVarA2 = com.amoad.aq.this.a(iA);
                    if (iVarA2 != null) {
                        com.amoad.aq.this.a(iVarA2, com.amoad.AMoAdNativeListener.Result.Success, avVar);
                    } else {
                        com.amoad.aq.this.a(null, com.amoad.AMoAdNativeListener.Result.Failure, avVar);
                    }
                }
            });
        } else {
            aqVarA.a(iVarA, com.amoad.AMoAdNativeListener.Result.Success, avVar);
            com.amoad.bc.a(aqVarA.b, new java.lang.Runnable() { // from class: com.amoad.aq.3
                @Override // java.lang.Runnable
                public final void run() {
                    if (com.amoad.aq.c(com.amoad.aq.this)) {
                        com.amoad.aq.b(com.amoad.aq.this);
                    }
                }
            });
        }
    }

    public final void a(java.lang.String str, boolean z, boolean z2) {
        a(str, 0, 0, z, z2);
    }

    final synchronized boolean b(java.lang.String str) {
        com.amoad.l.a(str);
        return this.c.get(str) != null;
    }
}
