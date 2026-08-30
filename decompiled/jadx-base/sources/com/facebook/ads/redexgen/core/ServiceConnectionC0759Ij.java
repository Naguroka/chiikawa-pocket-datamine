package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ij, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ServiceConnectionC0759Ij implements android.content.ServiceConnection {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"Vw4807oGxAdaHl5Al", "61OeIm55zagm9eF8TwwypJ2x", "EMmzBhTNP4w9g", "EYH0yzb9nIvkx5HKrwnVnQphst8", "oJpEUQYv6dauwAdzygMcXKep8asdjHHS", "ZEL", "ZTCWoVSxq9DuX", "VaiI"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0760Ik A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = (byte) ((bArrCopyOfRange[i4] - i3) - 13);
            if (A02[7].length() != 4) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A02;
            strArr[6] = "dt08HEEvYnWJr";
            strArr[2] = "T3OITLjrwLx4m";
            bArrCopyOfRange[i4] = b;
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{98, 116, -127, -123, 120, 114, 116, 47, 114, 126, 125, 125, 116, 114, -125, 116, 115, -66, -48, -35, -31, -44, -50, -48, -117, -49, -44, -34, -50, -38, -39, -39, -48, -50, -33, -48, -49};
    }

    static {
        A01();
    }

    public ServiceConnectionC0759Ij(com.facebook.ads.redexgen.core.C0760Ik c0760Ik) {
        this.A00 = c0760Ik;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        this.A00.A08(com.facebook.ads.redexgen.core.C8E.A1r, new com.facebook.ads.redexgen.core.C8F(A00(0, 17, 2)));
        this.A00.A01 = true;
        this.A00.A00 = new android.os.Messenger(iBinder);
        android.os.Message messageObtain = android.os.Message.obtain((android.os.Handler) null, 1);
        messageObtain.setData(this.A00.A00());
        try {
            this.A00.A00.send(messageObtain);
        } catch (android.os.RemoteException e) {
            this.A00.A07(com.facebook.ads.redexgen.core.C8E.A1q, new com.facebook.ads.redexgen.core.C8F(e));
        }
        this.A00.A03.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        this.A00.A08(com.facebook.ads.redexgen.core.C8E.A1s, new com.facebook.ads.redexgen.core.C8F(A00(17, 20, 94)));
        try {
            this.A00.A03.unbindService(this);
        } catch (java.lang.IllegalArgumentException unused) {
        }
        this.A00.A00 = null;
        this.A00.A01 = false;
    }
}
