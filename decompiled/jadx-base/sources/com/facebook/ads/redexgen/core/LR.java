package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class LR implements java.lang.reflect.InvocationHandler {
    public static byte[] A03;
    public final /* synthetic */ int A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C7j A01;
    public final /* synthetic */ java.util.concurrent.LinkedBlockingQueue A02;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 52);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{40, 42, 33, 42, kotlin.io.encoding.Base64.padSymbol, 38, 44, 43, 41, 56, 31, 60, 32, 37, 56, 2, 45, 33, 41, 43, 41, 56, 24, 53, 60, 41, 73, 75, 90, 120, 79, 66, 91, 75, 29, 28, 49, 26, 23, 17, 25, 1, 7, 31, 1, 32, 23, 19, 22, 11};
    }

    public LR(int i, java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue, com.facebook.ads.redexgen.core.C7j c7j) {
        this.A00 = i;
        this.A02 = linkedBlockingQueue;
        this.A01 = c7j;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) throws java.lang.Throwable {
        try {
            if (method.getName().equals(A00(34, 16, 70)) && objArr.length == 1 && (objArr[0] instanceof java.util.List)) {
                for (java.lang.Object c : (java.util.List) objArr[0]) {
                    java.lang.String str = (java.lang.String) c.getClass().getMethod(A00(7, 12, 120), new java.lang.Class[0]).invoke(c, new java.lang.Object[0]);
                    int iIntValue = ((java.lang.Integer) c.getClass().getMethod(A00(19, 7, 120), new java.lang.Class[0]).invoke(c, new java.lang.Object[0])).intValue();
                    if (str == null && iIntValue == this.A00) {
                        byte[] value = (byte[]) c.getClass().getMethod(A00(26, 8, 26), new java.lang.Class[0]).invoke(c, new java.lang.Object[0]);
                        this.A02.put(value);
                        return null;
                    }
                }
                this.A02.put(null);
            }
        } catch (java.lang.Throwable t) {
            this.A01.A07().AA0(A00(0, 7, 123), com.facebook.ads.redexgen.core.C8E.A1G, new com.facebook.ads.redexgen.core.C8F(t));
        }
        return null;
    }
}
