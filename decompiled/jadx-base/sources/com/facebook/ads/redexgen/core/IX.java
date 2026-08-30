package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class IX implements android.view.Choreographer.FrameCallback, android.os.Handler.Callback {
    public static byte[] A05;
    public static java.lang.String[] A06 = {"iaBjp1AwQpLLyKyeruBkx6nhfTHAU7OM", "YE4EgMmckJIUd", "A87", "Ho8PurbR6Cuk9", "5V8W8EI9U29WYa7jcvhHGtBRQdjRXn2G", "xaEjUNqWNgJl7N86hHENKKoi0wcRoA", "gba", "E6ac03H168kqXbQykfGaXhm8c3r5vcbJ"};
    public static final com.facebook.ads.redexgen.core.IX A07;
    public int A00;
    public android.view.Choreographer A01;
    public final android.os.Handler A02;
    public volatile long A04 = androidx.media3.common.C.TIME_UNSET;
    public final android.os.HandlerThread A03 = new android.os.HandlerThread(A01(0, 26, 0));

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 44);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A05() {
        byte[] bArr = {111, 68, 67, 94, 73, 67, 75, 94, 77, 92, 68, 73, 94, 99, 91, 66, 73, 94, 22, 100, 77, 66, 72, 64, 73, 94};
        java.lang.String[] strArr = A06;
        if (strArr[6].length() != strArr[2].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A06;
        strArr2[1] = "IihRFBQ0QWx9C";
        strArr2[3] = "2DRBdjbeYJhWc";
        A05 = bArr;
    }

    static {
        A05();
        A07 = new com.facebook.ads.redexgen.core.IX();
    }

    public IX() {
        this.A03.start();
        this.A02 = new android.os.Handler(this.A03.getLooper(), this);
        this.A02.sendEmptyMessage(0);
    }

    public static com.facebook.ads.redexgen.core.IX A00() {
        return A07;
    }

    private void A02() {
        this.A00++;
        if (this.A00 == 1) {
            this.A01.postFrameCallback(this);
        }
    }

    private void A03() {
        this.A01 = android.view.Choreographer.getInstance();
    }

    private void A04() {
        this.A00--;
        if (this.A00 == 0) {
            this.A01.removeFrameCallback(this);
            this.A04 = androidx.media3.common.C.TIME_UNSET;
        }
    }

    public final void A06() {
        this.A02.sendEmptyMessage(1);
    }

    public final void A07() {
        this.A02.sendEmptyMessage(2);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.A04 = j;
        this.A01.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        switch (message.what) {
            case 0:
                A03();
                return true;
            case 1:
                A02();
                return true;
            case 2:
                A04();
                java.lang.String[] strArr = A06;
                if (strArr[1].length() != strArr[3].length()) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A06;
                strArr2[6] = "Hfi";
                strArr2[2] = "XBf";
                return true;
            default:
                return false;
        }
    }
}
