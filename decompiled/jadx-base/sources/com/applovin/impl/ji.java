package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ji {
    private static com.applovin.impl.ji.a b(byte[] bArr) {
        com.applovin.impl.ah ahVar = new com.applovin.impl.ah(bArr);
        if (ahVar.e() < 32) {
            return null;
        }
        ahVar.f(0);
        if (ahVar.j() != ahVar.a() + 4 || ahVar.j() != 1886614376) {
            return null;
        }
        int iC = com.applovin.impl.j1.c(ahVar.j());
        if (iC > 1) {
            com.applovin.impl.oc.d("PsshAtomUtil", "Unsupported pssh version: " + iC);
            return null;
        }
        java.util.UUID uuid = new java.util.UUID(ahVar.s(), ahVar.s());
        if (iC == 1) {
            ahVar.g(ahVar.A() * 16);
        }
        int iA = ahVar.A();
        if (iA != ahVar.a()) {
            return null;
        }
        byte[] bArr2 = new byte[iA];
        ahVar.a(bArr2, 0, iA);
        return new com.applovin.impl.ji.a(uuid, iC, bArr2);
    }

    public static byte[] a(java.util.UUID uuid, byte[] bArr) {
        return a(uuid, null, bArr);
    }

    public static byte[] a(java.util.UUID uuid, java.util.UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(androidx.media3.extractor.mp4.Atom.TYPE_pssh);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (java.util.UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static java.util.UUID c(byte[] bArr) {
        com.applovin.impl.ji.a aVarB = b(bArr);
        if (aVarB == null) {
            return null;
        }
        return aVarB.f926a;
    }

    public static int d(byte[] bArr) {
        com.applovin.impl.ji.a aVarB = b(bArr);
        if (aVarB == null) {
            return -1;
        }
        return aVarB.b;
    }

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.UUID f926a;
        private final int b;
        private final byte[] c;

        public a(java.util.UUID uuid, int i, byte[] bArr) {
            this.f926a = uuid;
            this.b = i;
            this.c = bArr;
        }
    }

    public static boolean a(byte[] bArr) {
        return b(bArr) != null;
    }

    public static byte[] a(byte[] bArr, java.util.UUID uuid) {
        com.applovin.impl.ji.a aVarB = b(bArr);
        if (aVarB == null) {
            return null;
        }
        if (!uuid.equals(aVarB.f926a)) {
            com.applovin.impl.oc.d("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + aVarB.f926a + ".");
            return null;
        }
        return aVarB.c;
    }
}
