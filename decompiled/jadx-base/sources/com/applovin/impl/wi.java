package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class wi extends com.applovin.impl.z1 {
    wi() {
    }

    @Override // com.applovin.impl.z1
    public com.applovin.impl.p1.a b(com.applovin.impl.p1.a aVar) throws com.applovin.impl.p1.b {
        int i = aVar.c;
        if (i != 3 && i != 2 && i != 268435456 && i != 536870912 && i != 805306368 && i != 4) {
            throw new com.applovin.impl.p1.b(aVar);
        }
        if (i != 2) {
            return new com.applovin.impl.p1.a(aVar.f1139a, aVar.b, 2);
        }
        return com.applovin.impl.p1.a.e;
    }

    @Override // com.applovin.impl.p1
    public void a(java.nio.ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.b.c;
        if (i2 == 3) {
            i *= 2;
        } else if (i2 == 4) {
            i /= 2;
        } else if (i2 != 268435456) {
            if (i2 == 536870912) {
                i /= 3;
                i *= 2;
            } else {
                if (i2 != 805306368) {
                    throw new java.lang.IllegalStateException();
                }
                i /= 2;
            }
        }
        java.nio.ByteBuffer byteBufferA = a(i);
        int i3 = this.b.c;
        if (i3 == 3) {
            while (iPosition < iLimit) {
                byteBufferA.put((byte) 0);
                byteBufferA.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i3 == 4) {
            while (iPosition < iLimit) {
                short sA = (short) (com.applovin.impl.xp.a(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferA.put((byte) (sA & 255));
                byteBufferA.put((byte) ((sA >> 8) & 255));
                iPosition += 4;
            }
        } else if (i3 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferA.put(byteBuffer.get(iPosition + 1));
                byteBufferA.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i3 == 536870912) {
            while (iPosition < iLimit) {
                byteBufferA.put(byteBuffer.get(iPosition + 1));
                byteBufferA.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else {
            if (i3 != 805306368) {
                throw new java.lang.IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferA.put(byteBuffer.get(iPosition + 2));
                byteBufferA.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferA.flip();
    }
}
