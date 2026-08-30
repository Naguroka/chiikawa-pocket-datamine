package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class tk extends com.applovin.impl.dk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.ah f1366a = new com.applovin.impl.ah();
    private final com.applovin.impl.zg b = new com.applovin.impl.zg();
    private com.applovin.impl.ho c;

    @Override // com.applovin.impl.dk
    protected com.applovin.impl.af a(com.applovin.impl.df dfVar, java.nio.ByteBuffer byteBuffer) {
        com.applovin.impl.af.b vkVar;
        com.applovin.impl.ho hoVar = this.c;
        if (hoVar == null || dfVar.j != hoVar.c()) {
            com.applovin.impl.ho hoVar2 = new com.applovin.impl.ho(dfVar.f);
            this.c = hoVar2;
            hoVar2.a(dfVar.f - dfVar.j);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.f1366a.a(bArrArray, iLimit);
        this.b.a(bArrArray, iLimit);
        this.b.d(39);
        long jA = (((long) this.b.a(1)) << 32) | ((long) this.b.a(32));
        this.b.d(20);
        int iA = this.b.a(12);
        int iA2 = this.b.a(8);
        this.f1366a.g(14);
        if (iA2 == 0) {
            vkVar = new com.applovin.impl.vk();
        } else if (iA2 == 255) {
            vkVar = com.applovin.impl.yh.a(this.f1366a, iA, jA);
        } else if (iA2 == 4) {
            vkVar = com.applovin.impl.wk.a(this.f1366a);
        } else if (iA2 != 5) {
            vkVar = iA2 != 6 ? null : com.applovin.impl.Cdo.a(this.f1366a, jA, this.c);
        } else {
            vkVar = com.applovin.impl.uk.a(this.f1366a, jA, this.c);
        }
        return vkVar == null ? new com.applovin.impl.af(new com.applovin.impl.af.b[0]) : new com.applovin.impl.af(vkVar);
    }
}
