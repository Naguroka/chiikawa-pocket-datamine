package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class b9 extends com.applovin.impl.z1 {
    private static final int i = java.lang.Float.floatToIntBits(Float.NaN);

    b9() {
    }

    @Override // com.applovin.impl.z1
    public com.applovin.impl.p1.a b(com.applovin.impl.p1.a aVar) throws com.applovin.impl.p1.b {
        int i2 = aVar.c;
        if (!com.applovin.impl.xp.f(i2)) {
            throw new com.applovin.impl.p1.b(aVar);
        }
        if (i2 != 4) {
            return new com.applovin.impl.p1.a(aVar.f1139a, aVar.b, 4);
        }
        return com.applovin.impl.p1.a.e;
    }

    @Override // com.applovin.impl.p1
    public void a(java.nio.ByteBuffer byteBuffer) {
        java.nio.ByteBuffer byteBufferA;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        int i3 = this.b.c;
        if (i3 == 536870912) {
            byteBufferA = a((i2 / 3) * 4);
            while (iPosition < iLimit) {
                a(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferA);
                iPosition += 3;
            }
        } else if (i3 == 805306368) {
            byteBufferA = a(i2);
            while (iPosition < iLimit) {
                a((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferA);
                iPosition += 4;
            }
        } else {
            throw new java.lang.IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferA.flip();
    }

    private static void a(int i2, java.nio.ByteBuffer byteBuffer) {
        int iFloatToIntBits = java.lang.Float.floatToIntBits((float) (((double) i2) * 4.656612875245797E-10d));
        if (iFloatToIntBits == i) {
            iFloatToIntBits = java.lang.Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }
}
