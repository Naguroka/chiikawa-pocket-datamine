package com.five_corp.ad.internal.util;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.ArrayDeque f2082a = new java.util.ArrayDeque();
    public final byte[] b = new byte[1];
    public final byte[] c = new byte[2];
    public final byte[] d = new byte[3];
    public final byte[] e = new byte[4];
    public final byte[] f = new byte[8];
    public int h = 0;
    public int g = 0;

    public final com.five_corp.ad.internal.util.g a(byte[] bArr, int i, int i2, int i3) {
        int i4 = this.g;
        if (i3 != i4) {
            return new com.five_corp.ad.internal.util.g(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.L1, java.lang.String.format("mPosition: %d, mLimit: %d, offsetInData: %d, size: %d, offsetInFile: %d", java.lang.Integer.valueOf(this.h), java.lang.Integer.valueOf(this.g), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3)), null, null));
        }
        if (i2 <= 0) {
            return new com.five_corp.ad.internal.util.g(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.U1, java.lang.String.format("mPosition: %d, mLimit: %d, offsetInData: %d, size: %d, offsetInFile: %d", java.lang.Integer.valueOf(this.h), java.lang.Integer.valueOf(this.g), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3)), null, null));
        }
        this.f2082a.addLast(new com.five_corp.ad.internal.util.a(bArr, i, i2, i4));
        this.g += i2;
        return new com.five_corp.ad.internal.util.g(true, null);
    }

    public final int b() {
        com.five_corp.ad.internal.util.g gVarA = a(this.e);
        if (!gVarA.f2085a) {
            gVarA.b.b();
        }
        byte[] bArr = this.e;
        return (bArr[3] & 255) | ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    public final long c() {
        com.five_corp.ad.internal.util.g gVarA = a(this.f);
        if (!gVarA.f2085a) {
            gVarA.b.b();
        }
        byte[] bArr = this.f;
        return (((long) (bArr[0] & 255)) << 56) | (((long) (bArr[1] & 255)) << 48) | (((long) (bArr[2] & 255)) << 40) | (((long) (bArr[3] & 255)) << 32) | (((long) (bArr[4] & 255)) << 24) | (((long) (bArr[5] & 255)) << 16) | (((long) (bArr[6] & 255)) << 8) | ((long) (bArr[7] & 255));
    }

    public final short d() {
        com.five_corp.ad.internal.util.g gVarA = a(this.c);
        if (!gVarA.f2085a) {
            gVarA.b.b();
        }
        byte[] bArr = this.c;
        return (short) (((short) (bArr[1] & 255)) | ((short) ((bArr[0] & 255) << 8)));
    }

    public final com.five_corp.ad.internal.util.g b(int i) {
        int i2;
        if (this.h == i) {
            return new com.five_corp.ad.internal.util.g(true, null);
        }
        if (this.f2082a.isEmpty()) {
            return com.five_corp.ad.internal.util.g.b(com.five_corp.ad.internal.t.I1);
        }
        int i3 = this.h;
        if (i < i3) {
            return new com.five_corp.ad.internal.util.g(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.O1, java.lang.String.format("Current position: %d, Requested position: %d", java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i)), null, null));
        }
        do {
            com.five_corp.ad.internal.util.a aVar = (com.five_corp.ad.internal.util.a) this.f2082a.peekFirst();
            if (aVar.d + aVar.c > i) {
                break;
            }
            com.five_corp.ad.internal.util.a aVar2 = (com.five_corp.ad.internal.util.a) this.f2082a.pollFirst();
            i2 = aVar2.d + aVar2.c;
            if (i2 < i && this.f2082a.isEmpty()) {
                return new com.five_corp.ad.internal.util.g(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.K1, java.lang.String.format("Maximum available position: %d, Request position: %d", java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i)), null, null));
            }
        } while (i2 != i);
        this.h = i;
        return new com.five_corp.ad.internal.util.g(true, null);
    }

    public final com.five_corp.ad.internal.util.f a(int i) {
        if (this.f2082a.isEmpty()) {
            return com.five_corp.ad.internal.util.f.a(com.five_corp.ad.internal.t.N1);
        }
        com.five_corp.ad.internal.util.a aVar = (com.five_corp.ad.internal.util.a) this.f2082a.getFirst();
        int i2 = this.h;
        int i3 = i2 + i;
        int i4 = aVar.d;
        if (i3 <= aVar.c + i4) {
            com.five_corp.ad.internal.util.b bVar = new com.five_corp.ad.internal.util.b(aVar.f2080a, (aVar.b + i2) - i4);
            com.five_corp.ad.internal.util.g gVarB = b(i3);
            if (gVarB.f2085a) {
                return new com.five_corp.ad.internal.util.f(true, null, bVar);
            }
            return new com.five_corp.ad.internal.util.f(false, gVarB.b, null);
        }
        byte[] bArr = new byte[i];
        com.five_corp.ad.internal.util.g gVarA = a(bArr);
        if (!gVarA.f2085a) {
            return new com.five_corp.ad.internal.util.f(false, gVarA.b, null);
        }
        return new com.five_corp.ad.internal.util.f(true, null, new com.five_corp.ad.internal.util.b(bArr, 0));
    }

    public final byte a() {
        com.five_corp.ad.internal.util.g gVarA = a(this.b);
        if (!gVarA.f2085a) {
            gVarA.b.b();
        }
        return this.b[0];
    }

    public final com.five_corp.ad.internal.util.g a(byte[] bArr) {
        int i;
        if (this.f2082a.isEmpty()) {
            return new com.five_corp.ad.internal.util.g(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.P1, java.lang.String.format("Requested data length: %d, current position: %d, current limit: %d", java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(this.h), java.lang.Integer.valueOf(this.g)), null, null));
        }
        if (this.h < ((com.five_corp.ad.internal.util.a) this.f2082a.peekFirst()).d) {
            return new com.five_corp.ad.internal.util.g(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.Q1, java.lang.String.format("Requested data length: %d, current position: %d, current limit: %d", java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(this.h), java.lang.Integer.valueOf(this.g)), null, null));
        }
        if (this.g < this.h + bArr.length) {
            return new com.five_corp.ad.internal.util.g(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.R1, java.lang.String.format("Requested data length: %d, current position: %d, current limit: %d", java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(this.h), java.lang.Integer.valueOf(this.g)), null, null));
        }
        int i2 = 0;
        while (i2 < bArr.length) {
            if (this.f2082a.isEmpty()) {
                return new com.five_corp.ad.internal.util.g(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.S1, java.lang.String.format("Requested data length: %d, available data length: %d, data limit: %d", java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(this.g)), null, null));
            }
            com.five_corp.ad.internal.util.a aVar = (com.five_corp.ad.internal.util.a) this.f2082a.peekFirst();
            int i3 = this.h - aVar.d;
            int i4 = aVar.b + i3;
            int iMin = java.lang.Math.min(bArr.length - i2, aVar.c - i3);
            if (i4 >= 0) {
                byte[] bArr2 = aVar.f2080a;
                if (bArr2.length >= i4 + iMin && i2 >= 0 && bArr.length >= (i = i2 + iMin) && iMin >= 0) {
                    java.lang.System.arraycopy(bArr2, i4, bArr, i2, iMin);
                    com.five_corp.ad.internal.util.g gVarB = b(this.h + iMin);
                    if (!gVarB.f2085a) {
                        return gVarB;
                    }
                    i2 = i;
                }
            }
            return new com.five_corp.ad.internal.util.g(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.T1, java.lang.String.format("mPosition: %d, mLimit: %d, writeLength: %d, bytes.length: %d, node.offsetInFile: %d, node.offsetInData: %d, node.size: %d, node.data.length: %d", java.lang.Integer.valueOf(this.h), java.lang.Integer.valueOf(this.g), java.lang.Integer.valueOf(iMin), java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(aVar.d), java.lang.Integer.valueOf(aVar.b), java.lang.Integer.valueOf(aVar.c), java.lang.Integer.valueOf(aVar.f2080a.length)), null, null));
        }
        return new com.five_corp.ad.internal.util.g(true, null);
    }
}
