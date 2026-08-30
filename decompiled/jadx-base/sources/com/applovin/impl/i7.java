package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class i7 extends com.applovin.impl.ek {
    private final com.applovin.impl.j7 o;

    public i7(java.util.List list) {
        super("DvbDecoder");
        com.applovin.impl.ah ahVar = new com.applovin.impl.ah((byte[]) list.get(0));
        this.o = new com.applovin.impl.j7(ahVar.C(), ahVar.C());
    }

    @Override // com.applovin.impl.ek
    protected com.applovin.impl.nl a(byte[] bArr, int i, boolean z) {
        if (z) {
            this.o.d();
        }
        return new com.applovin.impl.k7(this.o.a(bArr, i));
    }
}
