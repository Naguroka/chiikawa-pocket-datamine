package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class xh extends com.applovin.impl.cc {
    private final com.applovin.impl.a4.a n;
    private final android.content.Context o;
    private final boolean p;

    @Override // com.applovin.impl.cc
    public android.text.SpannedString f() {
        return new android.text.SpannedString(this.n.a(this.o));
    }

    @Override // com.applovin.impl.cc
    public boolean o() {
        return false;
    }

    public xh(com.applovin.impl.a4.a aVar, boolean z, android.content.Context context) {
        super(com.applovin.impl.cc.c.RIGHT_DETAIL);
        this.n = aVar;
        this.o = context;
        this.c = new android.text.SpannedString(aVar.a());
        this.p = z;
    }

    @Override // com.applovin.impl.cc
    public boolean p() {
        java.lang.Boolean boolB = this.n.b(this.o);
        if (boolB != null) {
            return boolB.equals(java.lang.Boolean.valueOf(this.p));
        }
        return false;
    }
}
