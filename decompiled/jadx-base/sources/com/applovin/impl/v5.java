package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class v5 implements com.applovin.impl.h5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f1420a;
    private final com.applovin.impl.xo b;
    private final com.applovin.impl.h5.a c;

    public v5(android.content.Context context, com.applovin.impl.xo xoVar, com.applovin.impl.h5.a aVar) {
        this.f1420a = context.getApplicationContext();
        this.b = xoVar;
        this.c = aVar;
    }

    @Override // com.applovin.impl.h5.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.applovin.impl.u5 a() {
        com.applovin.impl.u5 u5Var = new com.applovin.impl.u5(this.f1420a, this.c.a());
        com.applovin.impl.xo xoVar = this.b;
        if (xoVar != null) {
            u5Var.a(xoVar);
        }
        return u5Var;
    }

    public v5(android.content.Context context, java.lang.String str) {
        this(context, str, (com.applovin.impl.xo) null);
    }

    public v5(android.content.Context context, java.lang.String str, com.applovin.impl.xo xoVar) {
        this(context, xoVar, new com.applovin.impl.c6.b().a(str));
    }
}
