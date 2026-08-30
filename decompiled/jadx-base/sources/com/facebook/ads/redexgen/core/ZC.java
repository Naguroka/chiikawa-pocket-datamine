package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ZC implements com.facebook.ads.redexgen.core.AH {
    public static byte[] A04;
    public static java.lang.String[] A05 = {"dOZBGOfLcl", "6uZ5xK6", "", "aWXZitIb3s7c1Spgern6jNUgdVKtVpLL", "irucub8L3DoxCd6BUALfs2", "TD", "6AS6vcfZrF", "uC"};
    public final int A00;
    public final long A01;
    public final android.content.Context A02;
    public final com.facebook.ads.redexgen.core.InterfaceC0593Bh<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> A03;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 68);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{59, 26, 25, 30, 10, 19, 11, 45, 26, 17, 27, 26, 13, 26, 13, 12, 57, 30, 28, 11, 16, 13, 6, 44, 27, 27, 6, 27, 73, 0, 7, 26, 29, 8, 7, 29, 0, 8, 29, 0, 7, 14, 73, 47, 47, 4, 25, 12, 14, 73, 12, 17, 29, 12, 7, 26, 0, 6, 7, 103, 80, 80, 77, 80, 2, 75, 76, 81, 86, 67, 76, 86, 75, 67, 86, 75, 76, 69, 2, 100, 110, 99, 97, 2, 71, 90, 86, 71, 76, 81, 75, 77, 76, 46, 25, 25, 4, 25, 75, 2, 5, 24, 31, 10, 5, 31, 2, 10, 31, 2, 5, 12, 75, 36, 27, 30, 24, 75, 14, 19, 31, 14, 5, 24, 2, 4, 5, 51, 4, 4, 25, 4, 86, 31, 24, 5, 2, 23, 24, 2, 31, 23, 2, 31, 24, 17, 86, 32, 38, 79, 86, 19, 14, 2, 19, 24, 5, 31, 25, 24, 77, 110, 96, 101, 100, 101, 33, 71, 103, 108, 113, 100, 102, 64, 116, 101, 104, 110, 83, 100, 111, 101, 100, 115, 100, 115, 47, 27, 56, 54, 51, 50, 51, 119, 27, 62, 53, 49, 59, 54, 52, 22, 34, 51, 62, 56, 5, 50, 57, 51, 50, 37, 50, 37, 121, 41, 10, 4, 1, 0, 1, 69, 41, 12, 7, 10, 21, 16, 22, 36, 16, 1, 12, 10, 55, 0, 11, 1, 0, 23, 0, 23, 75, 85, 118, 120, 125, 124, 125, 57, 85, 112, 123, 111, 105, 97, 79, 112, 125, 124, 118, 75, 124, 119, 125, 124, 107, 124, 107, 55, 62, 50, 48, 115, 59, 60, 62, 56, okio.Utf8.REPLACEMENT_BYTE, 50, 50, 54, 115, 60, 57, 46, 115, 52, 51, 41, 56, 47, 51, 60, 49, 115, 56, 37, 50, 45, 49, 60, 36, 56, 47, 111, 115, 56, 37, 41, 115, 59, 59, 48, 45, 56, 58, 115, 27, 59, 48, 45, 56, 58, 28, 40, 57, 52, 50, 15, 56, 51, 57, 56, 47, 56, 47, 94, 82, 80, 19, 91, 92, 94, 88, 95, 82, 82, 86, 19, 92, 89, 78, 19, 84, 83, 73, 88, 79, 83, 92, 81, 19, 88, 69, 82, 77, 81, 92, 68, 88, 79, 15, 19, 88, 69, 73, 19, 91, 81, 92, 94, 19, 113, 84, 95, 91, 81, 92, 94, 124, 72, 89, 84, 82, 111, 88, 83, 89, 88, 79, 88, 79, 96, 108, 110, 45, 101, 98, 96, 102, 97, 108, 108, 104, 45, 98, 103, 112, 45, 106, 109, 119, 102, 113, 109, 98, 111, 45, 102, 123, 108, 115, 111, 98, 122, 102, 113, 49, 45, 102, 123, 119, 45, 108, 115, 118, 112, 45, 79, 106, 97, 108, 115, 118, 112, 66, 118, 103, 106, 108, 81, 102, 109, 103, 102, 113, 102, 113, 21, 25, 27, 88, 16, 23, 21, 19, 20, 25, 25, 29, 88, 23, 18, 5, 88, 31, 24, 2, 19, 4, 24, 23, 26, 88, 19, 14, 25, 6, 26, 23, 15, 19, 4, 68, 88, 19, 14, 2, 88, 0, 6, 79, 88, 58, 31, 20, 0, 6, 14, 32, 31, 18, 19, 25, 36, 19, 24, 18, 19, 4, 19, 4};
    }

    static {
        A01();
    }

    public ZC(android.content.Context context) {
        this(context, 0);
    }

    public ZC(android.content.Context context, int i) {
        this(context, null, i, 5000L);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    @java.lang.Deprecated
    public ZC(android.content.Context context, com.facebook.ads.redexgen.core.InterfaceC0593Bh<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> interfaceC0593Bh, int i, long j) {
        this.A02 = context;
        this.A00 = i;
        this.A01 = j;
        this.A03 = interfaceC0593Bh;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    private final void A02(android.content.Context context, com.facebook.ads.redexgen.core.InterfaceC0593Bh<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> interfaceC0593Bh, long j, android.os.Handler handler, com.facebook.ads.redexgen.core.Ii ii, int extensionRendererIndex, java.util.ArrayList<com.facebook.ads.redexgen.core.ZA> arrayList) throws java.lang.Exception {
        arrayList.add(new com.facebook.ads.redexgen.core.C3F(context, com.facebook.ads.redexgen.core.DR.A00, j, interfaceC0593Bh, false, handler, ii, 50));
        if (extensionRendererIndex == 0) {
            return;
        }
        int extensionRendererIndex2 = arrayList.size();
        if (extensionRendererIndex == 2) {
            extensionRendererIndex2--;
            if (A05[3].charAt(6) != 'I') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A05;
            strArr[5] = "tL";
            strArr[7] = "Fr";
        }
        try {
            try {
                java.lang.Class<?> cls = java.lang.Class.forName(A00(469, 64, 50));
                java.lang.Class<?> clazz = java.lang.Boolean.TYPE;
                java.lang.Class<?> clazz2 = java.lang.Long.TYPE;
                java.lang.Class<?> clazz3 = java.lang.Integer.TYPE;
                try {
                    arrayList.add(extensionRendererIndex2, (com.facebook.ads.redexgen.core.ZA) cls.getConstructor(clazz, clazz2, android.os.Handler.class, com.facebook.ads.redexgen.core.Ii.class, clazz3).newInstance(true, java.lang.Long.valueOf(j), handler, ii, 50));
                    android.util.Log.i(A00(0, 23, 59), A00(243, 27, 93));
                } catch (java.lang.Exception e) {
                    e = e;
                    throw new java.lang.RuntimeException(A00(127, 33, 50), e);
                }
            } catch (java.lang.ClassNotFoundException unused) {
            }
        } catch (java.lang.Exception e2) {
            e = e2;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    private final void A03(android.content.Context context, com.facebook.ads.redexgen.core.InterfaceC0593Bh<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> interfaceC0593Bh, com.facebook.ads.redexgen.core.InterfaceC0568Ag[] interfaceC0568AgArr, android.os.Handler handler, com.facebook.ads.redexgen.core.InterfaceC0576Ao interfaceC0576Ao, int i, java.util.ArrayList<com.facebook.ads.redexgen.core.ZA> arrayList) throws java.lang.Exception {
        int extensionRendererIndex;
        int i2;
        java.lang.String strA00 = A00(0, 23, 59);
        arrayList.add(new com.facebook.ads.redexgen.core.C3G(context, com.facebook.ads.redexgen.core.DR.A00, interfaceC0593Bh, false, handler, interfaceC0576Ao, com.facebook.ads.redexgen.core.AZ.A00(context), interfaceC0568AgArr));
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            extensionRendererIndex = size + 1;
            try {
                arrayList.add(size, (com.facebook.ads.redexgen.core.ZA) java.lang.Class.forName(A00(403, 66, 71)).getConstructor(android.os.Handler.class, com.facebook.ads.redexgen.core.InterfaceC0576Ao.class, com.facebook.ads.redexgen.core.InterfaceC0568Ag[].class).newInstance(handler, interfaceC0576Ao, interfaceC0568AgArr));
                android.util.Log.i(strA00, A00(215, 28, 33));
            } catch (java.lang.ClassNotFoundException unused) {
                size = extensionRendererIndex;
                extensionRendererIndex = size;
            } catch (java.lang.Exception e) {
                e = e;
                throw new java.lang.RuntimeException(A00(93, 34, 47), e);
            }
        } catch (java.lang.ClassNotFoundException unused2) {
        } catch (java.lang.Exception e2) {
            e = e2;
        }
        try {
            i2 = extensionRendererIndex + 1;
            try {
                arrayList.add(extensionRendererIndex, (com.facebook.ads.redexgen.core.ZA) java.lang.Class.forName(A00(337, 66, 121)).getConstructor(android.os.Handler.class, com.facebook.ads.redexgen.core.InterfaceC0576Ao.class, com.facebook.ads.redexgen.core.InterfaceC0568Ag[].class).newInstance(handler, interfaceC0576Ao, interfaceC0568AgArr));
                android.util.Log.i(strA00, A00(org.objectweb.asm.Opcodes.NEW, 28, 19));
            } catch (java.lang.ClassNotFoundException unused3) {
                extensionRendererIndex = i2;
                i2 = extensionRendererIndex;
            } catch (java.lang.Exception e3) {
                e = e3;
                throw new java.lang.RuntimeException(A00(59, 34, 102), e);
            }
        } catch (java.lang.ClassNotFoundException unused4) {
        } catch (java.lang.Exception e4) {
            e = e4;
        }
        try {
            try {
                try {
                    arrayList.add(i2, (com.facebook.ads.redexgen.core.ZA) java.lang.Class.forName(A00(270, 67, 25)).getConstructor(android.os.Handler.class, com.facebook.ads.redexgen.core.InterfaceC0576Ao.class, com.facebook.ads.redexgen.core.InterfaceC0568Ag[].class).newInstance(handler, interfaceC0576Ao, interfaceC0568AgArr));
                    android.util.Log.i(strA00, A00(org.objectweb.asm.Opcodes.IF_ICMPNE, 27, 69));
                } catch (java.lang.Exception e5) {
                    e = e5;
                    throw new java.lang.RuntimeException(A00(23, 36, 45), e);
                }
            } catch (java.lang.ClassNotFoundException unused5) {
            }
        } catch (java.lang.Exception e6) {
            e = e6;
        }
    }

    private final void A04(android.content.Context context, com.facebook.ads.redexgen.core.InterfaceC0641De interfaceC0641De, android.os.Looper looper, int i, java.util.ArrayList<com.facebook.ads.redexgen.core.ZA> arrayList) {
        arrayList.add(new com.facebook.ads.redexgen.core.C6Z(interfaceC0641De, looper));
    }

    private final void A05(android.content.Context context, com.facebook.ads.redexgen.core.InterfaceC0697Fw interfaceC0697Fw, android.os.Looper looper, int i, java.util.ArrayList<com.facebook.ads.redexgen.core.ZA> arrayList) {
        arrayList.add(new com.facebook.ads.redexgen.core.AnonymousClass66(interfaceC0697Fw, looper));
    }

    private final com.facebook.ads.redexgen.core.InterfaceC0568Ag[] A06() {
        return new com.facebook.ads.redexgen.core.InterfaceC0568Ag[0];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    @Override // com.facebook.ads.redexgen.core.AH
    public final com.facebook.ads.redexgen.core.ZA[] A57(android.os.Handler handler, com.facebook.ads.redexgen.core.Ii ii, com.facebook.ads.redexgen.core.InterfaceC0576Ao interfaceC0576Ao, com.facebook.ads.redexgen.core.InterfaceC0697Fw interfaceC0697Fw, com.facebook.ads.redexgen.core.InterfaceC0641De interfaceC0641De, com.facebook.ads.redexgen.core.InterfaceC0593Bh<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> interfaceC0593Bh) throws java.lang.Exception {
        com.facebook.ads.redexgen.core.InterfaceC0593Bh<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> interfaceC0593Bh2 = interfaceC0593Bh;
        if (interfaceC0593Bh2 == null) {
            interfaceC0593Bh2 = null;
        }
        java.util.ArrayList<com.facebook.ads.redexgen.core.ZA> arrayList = new java.util.ArrayList<>();
        A02(this.A02, interfaceC0593Bh2, this.A01, handler, ii, this.A00, arrayList);
        A03(this.A02, interfaceC0593Bh2, A06(), handler, interfaceC0576Ao, this.A00, arrayList);
        A05(this.A02, interfaceC0697Fw, handler.getLooper(), this.A00, arrayList);
        A04(this.A02, interfaceC0641De, handler.getLooper(), this.A00, arrayList);
        return (com.facebook.ads.redexgen.core.ZA[]) arrayList.toArray(new com.facebook.ads.redexgen.core.ZA[arrayList.size()]);
    }
}
