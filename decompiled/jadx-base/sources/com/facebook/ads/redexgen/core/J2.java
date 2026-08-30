package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class J2 extends android.os.Handler {
    public static byte[] A03;
    public static java.lang.String[] A04 = {"4udqyVbWZXJvSc0AlbflTWwfFOYrDaDf", "2YLZ8zu95yTf3T209", "2VJPb0Yp69Qd6undQokFBSWI7sS3NGkE", "Nq0QHebF7aCImjCS8", "WfWu3jj6ZslW8HMUv7JinXygwhejXyBb", "C4PEiJW5iwJTin2vYgbWRkUl1o", "sWvNSKALPWxj", "lJrPEKSWvzui7DJNo"};
    public static final java.lang.String A05;
    public final android.content.Context A00;
    public final com.facebook.ads.internal.api.AudienceNetworkRemoteServiceApi.MessageHandler A01;
    public final com.facebook.ads.redexgen.core.C1107Wb A02;

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 102);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A04() {
        byte[] bArr = {-8, -16, -13, -6, -16, -14, -66, -53, -53, -56, -37, -59, -49, -37, -62, -47, -54, -54, -63, -56, -37, -56, -53, -61, -61, -63, -64, -13, -12, -14, -1, -31, -28, -1, -23, -28, -1, -21, -27, -7, 17, 18, 16, 29, 17, 3, 16, 20, 7, 1, 3, 29, 3, 22, 18, 16, -1, 17, -48, -47, -49, -36, -48, -62, -49, -45, -58, -64, -62, -36, -48, -63, -56, -36, -45, -62, -49, -48, -58, -52, -53};
        if (A04[5].length() == 23) {
            throw new java.lang.RuntimeException();
        }
        A04[5] = "AJ3";
        A03 = bArr;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) throws java.lang.Throwable {
        android.content.pm.PackageManager packageManager;
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
        }
        try {
            if (this.A01 == null || !this.A01.handleMessage(message)) {
                android.os.Messenger messenger = message.replyTo;
                if (message.what == 1) {
                    if (messenger != null) {
                        com.facebook.ads.redexgen.core.C1107Wb.A00().A07(2, null, A00(), messenger);
                        return;
                    }
                    return;
                }
                java.lang.String string = message.getData().getString(A03(27, 13, 58));
                if (string == null) {
                    return;
                }
                com.facebook.ads.redexgen.core.C1199Zs c1199ZsA05 = com.facebook.ads.redexgen.core.C04465b.A05(this.A00, string);
                c1199ZsA05.A0E().AGR(message.getData().getBoolean(A03(6, 21, 22), false));
                java.lang.String nameForUid = null;
                if (android.os.Build.VERSION.SDK_INT >= 21 && (packageManager = this.A00.getPackageManager()) != null) {
                    nameForUid = packageManager.getNameForUid(message.sendingUid);
                }
                if (nameForUid == null) {
                    if (messenger != null) {
                        com.facebook.ads.redexgen.core.C1107Wb.A00().A07(20, string, null, messenger);
                    }
                    c1199ZsA05.A0E().AFD();
                    return;
                }
                switch (message.what) {
                    case 1010:
                        if (messenger != null) {
                            com.facebook.ads.redexgen.core.C0773Iz c0773IzA04 = com.facebook.ads.redexgen.core.C1107Wb.A00().A04(string);
                            if (c0773IzA04 == null) {
                                c0773IzA04 = com.facebook.ads.redexgen.core.C1107Wb.A00().A05(string, messenger, nameForUid);
                            }
                            com.facebook.ads.redexgen.core.C1299bX c1299bXA04 = com.facebook.ads.redexgen.core.C2J.A04(c1199ZsA05, message.getData(), nameForUid);
                            if (c0773IzA04.A00 == null) {
                                c0773IzA04.A00 = A01(c1299bXA04, string);
                            } else if (c0773IzA04.A00 instanceof com.facebook.ads.redexgen.core.C1303bb) {
                                ((com.facebook.ads.redexgen.core.C1303bb) c0773IzA04.A00).A0G(c1299bXA04.A0B(), c1299bXA04.A07());
                            }
                            com.facebook.ads.redexgen.core.C1107Wb.A00().A07(1011, string, A00(), messenger);
                            break;
                        }
                        break;
                    case 1012:
                    case 2002:
                        com.facebook.ads.redexgen.core.C1107Wb.A00().A08(string);
                        break;
                    case 2000:
                        if (messenger != null) {
                            com.facebook.ads.redexgen.core.C0773Iz c0773IzA05 = com.facebook.ads.redexgen.core.C1107Wb.A00().A04(string);
                            if (c0773IzA05 == null) {
                                c0773IzA05 = com.facebook.ads.redexgen.core.C1107Wb.A00().A05(string, messenger, nameForUid);
                            }
                            com.facebook.ads.redexgen.core.C1290bO c1290bOA05 = com.facebook.ads.redexgen.core.C2J.A05(c1199ZsA05, message.getData(), nameForUid);
                            if (c0773IzA05.A00 == null) {
                                c0773IzA05.A00 = A02(c1290bOA05, string);
                            } else if (c0773IzA05.A00 instanceof com.facebook.ads.redexgen.core.C1300bY) {
                                ((com.facebook.ads.redexgen.core.C1300bY) c0773IzA05.A00).A0J(c1290bOA05.A05, c1290bOA05.A02, c1290bOA05.A08);
                            }
                            com.facebook.ads.redexgen.core.C1107Wb.A00().A07(2001, string, A00(), messenger);
                            break;
                        }
                        break;
                    case 2003:
                        com.facebook.ads.redexgen.core.AnonymousClass22 anonymousClass22A03 = com.facebook.ads.redexgen.core.C1107Wb.A00().A03(string);
                        if (anonymousClass22A03 instanceof com.facebook.ads.redexgen.core.C1300bY) {
                            com.facebook.ads.RewardData rewardDataA01 = com.facebook.ads.redexgen.core.C2K.A01(message.getData());
                            com.facebook.ads.redexgen.core.C1300bY c1300bY = (com.facebook.ads.redexgen.core.C1300bY) anonymousClass22A03;
                            if (rewardDataA01 != null) {
                                c1300bY.A0I(rewardDataA01);
                            }
                        }
                        break;
                    default:
                        break;
                }
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }

    static {
        A04();
        A05 = com.facebook.ads.redexgen.core.J2.class.getSimpleName();
    }

    public J2(android.content.Context context, com.facebook.ads.internal.api.AudienceNetworkRemoteServiceApi.MessageHandler messageHandler) {
        super(android.os.Looper.getMainLooper());
        this.A00 = context;
        this.A02 = com.facebook.ads.redexgen.core.C1107Wb.A00();
        this.A01 = messageHandler;
    }

    public static android.os.Bundle A00() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(A03(58, 23, 23), A03(0, 6, 92));
        bundle.putString(A03(40, 18, 88), new org.json.JSONObject().toString());
        return bundle;
    }

    private com.facebook.ads.redexgen.core.C1303bb A01(com.facebook.ads.redexgen.core.C1299bX c1299bX, java.lang.String str) {
        com.facebook.ads.redexgen.core.C1303bb c1303bb = new com.facebook.ads.redexgen.core.C1303bb(c1299bX, this.A02, str);
        c1303bb.A0G(c1299bX.A0B(), c1299bX.A07());
        return c1303bb;
    }

    private com.facebook.ads.redexgen.core.C1300bY A02(com.facebook.ads.redexgen.core.C1290bO c1290bO, java.lang.String str) {
        com.facebook.ads.redexgen.core.C1300bY c1300bY = new com.facebook.ads.redexgen.core.C1300bY(c1290bO, this.A02, str);
        c1300bY.A0J(c1290bO.A05, c1290bO.A02, c1290bO.A08);
        return c1300bY;
    }
}
