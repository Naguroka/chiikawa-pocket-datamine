package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2A, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2A extends android.os.Handler {
    public static byte[] A08;
    public static java.lang.String[] A09 = {"huWs6nyYMzfxZtpl5l", "fgwmKB6Qyc6FtxfQKB9IkKk97cCBhoPq", "Jv452jFQqMHbXRCew", "VJzjxvVEvnwAHRNG0UVfEBBm35lAgOcC", "2O55YLspBlua8aaDjHW6JYUsijhI69vr", "eg8WpOT66b5I3PrsSw6YGr9", "zIsMPTJraAXX1U7X8ddpQ67iDmaNCfrq", "78M1aKJi48odvK"};
    public android.os.Messenger A00;
    public com.facebook.ads.redexgen.core.LZ A01;
    public boolean A02;
    public final android.content.ServiceConnection A03;
    public final android.os.Handler A04;
    public final android.os.Messenger A05;
    public final com.facebook.ads.redexgen.core.C1198Zr A06;
    public final com.facebook.ads.redexgen.core.KY A07;

    public static java.lang.String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 57);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A06() {
        A08 = new byte[]{-102, -83, -85, -83, -79, -66, -83, -84, 104, -80, -87, -74, -84, -69, -80, -87, -77, -83, 104, -82, -87, -79, -76, -83, -84, 116, 104, -85, -73, -84, -83, -126, 104, -116, -115, -117, -104, -119, 122, 124, -124, 122, -128, 126, -104, 122, -123, -117, 126, 122, 125, -110, -104, 126, -111, -126, -116, -115, -116, -104, -124, 126, -110, 0, 1, -1, 12, -3, -18, -16, -8, -18, -12, -14, 12, -10, -5, 0, 1, -18, -7, -7, -14, -15, 12, -8, -14, 6, -28, -27, -29, -16, -31, -46, -44, -36, -46, -40, -42, -16, -36, -42, -22};
    }

    static {
        A06();
    }

    public C2A(com.facebook.ads.redexgen.core.C1198Zr c1198Zr) {
        super(android.os.Looper.getMainLooper());
        this.A04 = new android.os.Handler(android.os.Looper.getMainLooper());
        this.A03 = new android.content.ServiceConnection() { // from class: com.facebook.ads.redexgen.X.29
            @Override // android.content.ServiceConnection
            public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
                this.A00.A04.removeCallbacks(this.A00.A07);
                this.A00.A00 = new android.os.Messenger(iBinder);
                if (!com.facebook.ads.redexgen.core.AbstractC0764Ip.A07(this.A00.A06)) {
                    return;
                }
                this.A00.A07(this.A00.A00);
            }

            @Override // android.content.ServiceConnection
            public final void onServiceDisconnected(android.content.ComponentName componentName) {
                this.A00.A09();
            }
        };
        this.A06 = c1198Zr;
        this.A05 = new android.os.Messenger(this);
        this.A07 = new com.facebook.ads.redexgen.core.C1293bR(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(android.os.Messenger messenger) {
        android.os.Message messageObtain = android.os.Message.obtain((android.os.Handler) null, 1);
        messageObtain.replyTo = this.A05;
        messageObtain.setData(com.facebook.ads.redexgen.core.C2J.A00(this.A06));
        try {
            messenger.send(messageObtain);
        } catch (android.os.RemoteException unused) {
        }
    }

    public final void A09() {
        if (this.A02) {
            this.A02 = false;
            this.A06.unbindService(this.A03);
            this.A00 = null;
        }
    }

    public final void A0A(java.lang.String str, com.facebook.ads.redexgen.core.LZ lz, int i) {
        if (this.A02) {
            this.A01 = lz;
            android.os.Message messageObtain = android.os.Message.obtain((android.os.Handler) null, i);
            messageObtain.replyTo = this.A05;
            if (str != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString(A05(88, 15, 88), str);
                messageObtain.setData(bundle);
            }
            try {
                if (this.A00 != null) {
                    this.A00.send(messageObtain);
                }
            } catch (android.os.RemoteException unused) {
            }
        }
    }

    public final void A0B(boolean z) {
        this.A02 = com.facebook.ads.redexgen.core.AnonymousClass28.A04(this.A06, z, this.A03);
        if (this.A02) {
            android.os.Handler handler = this.A04;
            com.facebook.ads.redexgen.core.KY ky = this.A07;
            if (A09[6].charAt(31) != 'q') {
                throw new java.lang.RuntimeException();
            }
            A09[2] = "62SHD49IwhaYJMd1y";
            handler.postDelayed(ky, com.facebook.ads.redexgen.core.AbstractC0764Ip.A01(this.A06));
            return;
        }
        com.facebook.ads.redexgen.core.AbstractC05168f.A04(this.A06);
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            if (message.what == 2) {
                com.facebook.ads.redexgen.core.AnonymousClass28.A02(this.A06, message);
                return;
            }
            if (message.what == 20 || message.what == 40 || message.what == 30) {
                if (message.what == 20) {
                    com.facebook.ads.redexgen.core.AbstractC0764Ip.A06(this.A06);
                }
                java.lang.String str = A05(0, 33, 15) + message.what;
                com.facebook.ads.redexgen.core.AbstractC05168f.A04(this.A06);
                return;
            }
            if (message.what == 4) {
                android.os.Bundle data = message.getData();
                if (this.A01 != null) {
                    boolean z = data.getBoolean(A05(33, 30, 0), false);
                    java.lang.String strA05 = A05(88, 15, 88);
                    if (z) {
                        this.A01.ACu(data.getString(strA05));
                    } else if (data.getBoolean(A05(63, 25, 116), false)) {
                        this.A01.ACv(data.getString(strA05));
                    }
                }
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
