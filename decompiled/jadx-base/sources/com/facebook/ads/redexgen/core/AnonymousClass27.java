package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.27, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass27 extends android.os.Handler {
    public static byte[] A0A;
    public android.os.Messenger A00;
    public boolean A01;
    public boolean A02;
    public final android.content.ServiceConnection A03;
    public final android.os.Handler A04;
    public final android.os.Messenger A05;
    public final com.facebook.ads.redexgen.core.AbstractC1310bi A06;
    public final com.facebook.ads.redexgen.core.C1199Zs A07;
    public final com.facebook.ads.redexgen.core.C1198Zr A08;
    public final com.facebook.ads.redexgen.core.KY A09;

    static {
        A07();
    }

    public static java.lang.String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 86);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A07() {
        A0A = new byte[]{-22, -17, -11, 0, -13, -9, 0, -30, -15, -15, 0, -16, -13, -22, -26, -17, -11, -30, -11, -22, -16, -17, 0, -20, -26, -6, -55, -36, -28, -26, -21, -36, -105, -22, -36, -23, -19, -32, -38, -36, -105, -36, -23, -23, -26, -23, -91, -53, -52, -54, -41, -71, -68, -41, -63, -68, -41, -61, -67, -47, -49, -62, -66, -48, -83, -46, -55, -66};
    }

    public AnonymousClass27(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.AbstractC1310bi abstractC1310bi) {
        super(android.os.Looper.getMainLooper());
        this.A04 = new android.os.Handler(android.os.Looper.getMainLooper());
        this.A03 = new android.content.ServiceConnection() { // from class: com.facebook.ads.redexgen.X.26
            public static java.lang.String[] A01 = {"5NfIE0YcA1j7k4kI09Qd", "GOyJyQVDSAttzLj2dwW1R", "UEE9UjADaku6tgIVG7TE", "AlbuaripePsmIRlIONJuvTINhX", "hDpBwlS77lkTDgpWlwn57aFtHcNJW0B1", "G5FnfniCDoZltv23hjG8RcIHEgm214hW", "K1Tu", "8SU16w9FmjIzUCDhhEyMBCCw6KqJKOI3"};

            @Override // android.content.ServiceConnection
            public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
                this.A00.A07.A0E().AFO();
                this.A00.A04.removeCallbacks(this.A00.A09);
                if (iBinder != null) {
                    this.A00.A00 = new android.os.Messenger(iBinder);
                    if (this.A00.A02) {
                        this.A00.A02 = false;
                        this.A00.A06.A06();
                        return;
                    }
                    return;
                }
                this.A00.A07.A0E().AFQ();
                com.facebook.ads.redexgen.core.AnonymousClass27 anonymousClass27 = this.A00;
                if (A01[3].length() != 26) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A01;
                strArr[0] = "klTZBPtNd5GFvPmgAP3f";
                strArr[2] = "mBOUVEJ7kKkpCLxr10ij";
                anonymousClass27.A06();
            }

            @Override // android.content.ServiceConnection
            public final void onServiceDisconnected(android.content.ComponentName componentName) {
                this.A00.A07.A0E().AFP();
                if (!this.A00.A01) {
                    return;
                }
                this.A00.A06();
            }
        };
        this.A07 = c1199Zs;
        this.A08 = c1199Zs.A01();
        this.A05 = new android.os.Messenger(this);
        this.A06 = abstractC1310bi;
        this.A09 = new com.facebook.ads.redexgen.core.C1295bT(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        if (this.A01) {
            A0C();
            this.A00 = null;
        }
        this.A06.A09();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06() {
        this.A00 = null;
        A0C();
        if (this.A06.A03().A6J() == com.facebook.ads.redexgen.core.EnumC03681z.A06 || this.A06.A03().A6K() == com.facebook.ads.redexgen.core.EnumC03681z.A07) {
            this.A07.A0E().AFF();
            this.A06.A0B(10, com.facebook.ads.internal.protocol.AdErrorType.INTERNAL_ERROR, null);
        } else {
            if (this.A06.A03().A6J() != com.facebook.ads.redexgen.core.EnumC03681z.A05) {
                return;
            }
            this.A07.A0E().AFL();
            this.A06.A03().AGQ(new com.facebook.ads.AdError(2008, A04(26, 21, 33)));
        }
    }

    private void A08(android.os.Messenger messenger, int i, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Message messageObtain = android.os.Message.obtain((android.os.Handler) null, i);
        messageObtain.replyTo = this.A05;
        if (bundle != null) {
            messageObtain.setData(bundle);
        }
        messageObtain.getData().putString(A04(47, 13, 34), this.A06.A04());
        messenger.send(messageObtain);
    }

    public static void A0B(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        c1199Zs.A0E().AF9();
        com.facebook.ads.redexgen.core.InterfaceC04967f interfaceC04967fA0F = c1199Zs.A0F();
        if (interfaceC04967fA0F != null && interfaceC04967fA0F.A6I() != null && interfaceC04967fA0F.A6E() != null) {
            interfaceC04967fA0F.A6I().onError(interfaceC04967fA0F.A6E(), com.facebook.ads.AdError.AD_PRESENTATION_ERROR);
        }
    }

    public final void A0C() {
        if (this.A01) {
            this.A07.A0E().AFW();
            this.A01 = false;
            this.A08.unbindService(this.A03);
        }
    }

    public final void A0D(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, int i) {
        this.A07.A0E().AFV();
        com.facebook.ads.internal.util.activity.AdActivityIntent adActivityIntentA04 = com.facebook.ads.redexgen.core.C0813Kq.A04(c1199Zs);
        adActivityIntentA04.putExtra(A04(60, 8, 3), com.facebook.ads.redexgen.core.KG.A0E);
        adActivityIntentA04.putExtra(A04(47, 13, 34), this.A06.A04());
        adActivityIntentA04.putExtra(A04(0, 26, 75), i);
        try {
            if (!com.facebook.ads.redexgen.core.C0813Kq.A0E(c1199Zs, adActivityIntentA04)) {
                A0B(c1199Zs);
            }
        } catch (com.facebook.ads.redexgen.core.C0811Ko unused) {
            A0B(c1199Zs);
        }
    }

    public final void A0E(boolean z) {
        this.A01 = com.facebook.ads.redexgen.core.AnonymousClass28.A04(this.A08, z, this.A03);
        if (this.A01) {
            this.A07.A0E().AFB();
            this.A04.postDelayed(this.A09, com.facebook.ads.redexgen.core.AbstractC0764Ip.A00(this.A08));
        } else {
            this.A07.A0E().AFJ();
            this.A02 = false;
            this.A06.A09();
        }
    }

    public final boolean A0F(int i, android.os.Bundle bundle) {
        try {
            android.os.Messenger service = this.A00;
            if (service != null) {
                A08(service, i, bundle);
                return true;
            }
            return false;
        } catch (android.os.RemoteException e) {
            A0C();
            this.A07.A0E().AFE(e);
            return false;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            if (message.what == 3) {
                return;
            }
            if (message.what == 20 || message.what == 30 || message.what == 40) {
                if (message.what == 20) {
                    this.A07.A0E().AFS();
                    com.facebook.ads.redexgen.core.AbstractC0764Ip.A06(this.A08);
                } else {
                    this.A07.A0E().AFR();
                }
                A05();
                return;
            }
            java.lang.String adId = message.getData().getString(A04(47, 13, 34));
            if (!this.A06.A04().equals(adId)) {
                this.A07.A0E().AFX();
            } else if (message.what == 2001 || message.what == 1011) {
                com.facebook.ads.redexgen.core.AnonymousClass28.A02(this.A08, message);
            } else {
                this.A07.A0E().AFK(message.what);
                this.A06.A0C(message);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
