package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class EL {
    public static byte[] A0F;
    public static java.lang.String[] A0G = {"otHTb9LvI8ybF6vrVoO1rTrPCp306O74", "Rx1vO7hG8Az7i2Yj5pT4De7fyKew8lrJ", "xjFXtX9mXqBQEfJw2y9yGwIvt6nkyUB", "C8lHiEVGsA1InycY308zMITezDqlCJlt", "8V8H42NkZamtdcgQEkzyKv1AlHm2P2", "xa3iAkfTrkxPXtVHKDgHiLu9rp62G8cA", "MIua6DThmQIF1vqzpVDjqirjX1nsx6C7", "GEPWk2OCqdzdo4xY0bozaqI"};
    public int A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final android.os.Handler A06;
    public final android.os.Handler A07;
    public final android.os.HandlerThread A08;
    public final com.facebook.ads.redexgen.core.E1 A09;
    public final com.facebook.ads.redexgen.core.EQ A0A;
    public final java.util.ArrayList<com.facebook.ads.redexgen.core.EI> A0B;
    public final java.util.ArrayList<com.facebook.ads.redexgen.core.EI> A0C;
    public final java.util.concurrent.CopyOnWriteArraySet<com.facebook.ads.redexgen.core.EE> A0D;
    public final com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction.Deserializer[] A0E;

    public static java.lang.String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 99);
            java.lang.String[] strArr = A0G;
            if (strArr[4].length() == strArr[7].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0G;
            strArr2[4] = "YsGjonOW8fRp2ADpBQb8BIeWFn3N4H";
            strArr2[7] = "cgMIGSsvrovKZppoEzUMmRP";
            bArrCopyOfRange[i4] = b;
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A0C() {
        A0F = new byte[]{70, 5, 10, 7, 21, 14, 3, 21, 70, 17, 15, 18, 14, 70, 108, 118, 124, 73, 29, 81, 88, 92, 78, 73, 29, 82, 83, 88, 29, 121, 88, 78, 88, 79, 84, 92, 81, 84, 71, 88, 79, 29, 84, 78, 29, 79, 88, 76, 72, 84, 79, 88, 89, 19, 86, 125, 101, 124, 126, 125, 115, 118, 95, 115, 124, 115, 117, 119, 96, 50, 116, 123, 126, 119, 50, 123, kotlin.io.encoding.Base64.padSymbol, 125, 5, 48, 34, 58, 113, 56, 34, 113, 48, 53, 53, 52, 53, 34, 23, 5, 29, 86, 5, 2, 23, 2, 19, 86, 31, 5, 86, 21, 30, 23, 24, 17, 19, 18};
    }

    static {
        A0C();
    }

    public EL(com.facebook.ads.redexgen.core.EQ eq, int i, int i2, java.io.File file, com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction.Deserializer... deserializerArr) {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A05(deserializerArr.length > 0, A05(16, 38, 94));
        this.A0A = eq;
        this.A04 = i;
        this.A05 = i2;
        this.A09 = new com.facebook.ads.redexgen.core.E1(file);
        this.A0E = deserializerArr;
        this.A01 = true;
        this.A0C = new java.util.ArrayList<>();
        this.A0B = new java.util.ArrayList<>();
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        this.A07 = new android.os.Handler(looperMyLooper == null ? android.os.Looper.getMainLooper() : looperMyLooper);
        this.A08 = new android.os.HandlerThread(A05(54, 24, 113));
        this.A08.start();
        this.A06 = new android.os.Handler(this.A08.getLooper());
        this.A0D = new java.util.concurrent.CopyOnWriteArraySet<>();
        A08();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.facebook.ads.redexgen.core.EI A02(com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction downloadAction) {
        int i = this.A00;
        this.A00 = i + 1;
        com.facebook.ads.redexgen.core.EI ei = new com.facebook.ads.redexgen.core.EI(i, this, downloadAction, this.A05, null);
        this.A0C.add(ei);
        A0K(A05(78, 13, 50), ei);
        return ei;
    }

    private void A08() {
        this.A06.post(new com.facebook.ads.redexgen.core.EC(this));
    }

    private void A09() {
        if (!A0S()) {
            return;
        }
        java.util.Iterator<com.facebook.ads.redexgen.core.EE> it = this.A0D.iterator();
        while (it.hasNext()) {
            it.next().AC7(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:13:0x0035  */
    /* JADX WARN: Code duplicated, block: B:25:0x0078 A[PHI: r3
  0x0078: PHI (r3v3 com.facebook.ads.redexgen.X.EI) = (r3v2 com.facebook.ads.redexgen.X.EI), (r3v5 com.facebook.ads.redexgen.X.EI) binds: [B:23:0x0075, B:20:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x0083  */
    /* JADX WARN: Code duplicated, block: B:31:0x0098  */
    /* JADX WARN: Code duplicated, block: B:33:0x009b  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00af  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00de  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:55:0x005c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x005c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00cf A[SYNTHETIC] */
    public void A0A() {
        boolean z;
        com.facebook.ads.redexgen.core.EI ei;
        com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction downloadAction;
        boolean isRemoveAction;
        boolean z2;
        java.lang.String[] strArr;
        int i;
        com.facebook.ads.redexgen.core.EI ei2;
        boolean skipDownloadActions;
        boolean skipDownloadActions2;
        if (!this.A02 || this.A03) {
            return;
        }
        if (this.A01) {
            z = true;
        } else {
            int size = this.A0B.size();
            int i2 = this.A04;
            java.lang.String[] strArr2 = A0G;
            if (strArr2[4].length() == strArr2[7].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr3 = A0G;
            strArr3[0] = "pyCuQ7D83WDNAmOGOSxjDMR9sphT9yhX";
            strArr3[5] = "NeAqTcJwMWXNuqtxGSQmWfxFfpcNJ4wG";
            if (size == i2) {
                z = true;
            } else {
                z = false;
            }
        }
        for (int i3 = 0; i3 < this.A0C.size(); i3++) {
            java.util.ArrayList<com.facebook.ads.redexgen.core.EI> arrayList = this.A0C;
            if (A0G[6].charAt(8) != 'm') {
                ei = arrayList.get(i3);
                boolean skipDownloadActions3 = ei.A0G();
                if (skipDownloadActions3) {
                    downloadAction = ei.A04;
                    isRemoveAction = downloadAction.A03;
                    if (!isRemoveAction || !z) {
                        z2 = true;
                        strArr = A0G;
                        if (strArr[0].charAt(25) != strArr[5].charAt(25)) {
                            i = 0;
                        } else {
                            A0G[2] = "ETbkiSgllba5roJ057l04";
                            i = 0;
                        }
                        while (i < i3) {
                            ei2 = this.A0C.get(i);
                            skipDownloadActions = ei2.A04.A09(downloadAction);
                            if (skipDownloadActions) {
                                if (!isRemoveAction) {
                                    skipDownloadActions2 = ei2.A04.A03;
                                    if (skipDownloadActions2) {
                                        z2 = false;
                                        z = true;
                                        break;
                                    }
                                } else {
                                    z2 = false;
                                    java.lang.String str = ei + A05(0, 14, 5) + ei2;
                                    ei2.A08();
                                }
                            }
                            i++;
                        }
                        if (z2) {
                            ei.A0A();
                            if (!isRemoveAction) {
                                this.A0B.add(ei);
                                if (this.A0B.size() == this.A04) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            }
                        }
                    }
                }
            } else {
                java.lang.String[] strArr4 = A0G;
                strArr4[3] = "uSFDohDf4AZFSqDTIqdIXN7GK83rv1TA";
                strArr4[1] = "PnW2R0X33A4ZX5IMwZJiE9vO4lAP96mt";
                ei = arrayList.get(i3);
                boolean skipDownloadActions4 = ei.A0G();
                if (skipDownloadActions4) {
                    downloadAction = ei.A04;
                    isRemoveAction = downloadAction.A03;
                    if (!isRemoveAction) {
                        z2 = true;
                        strArr = A0G;
                        if (strArr[0].charAt(25) != strArr[5].charAt(25)) {
                            i = 0;
                        } else {
                            A0G[2] = "ETbkiSgllba5roJ057l04";
                            i = 0;
                        }
                        while (i < i3) {
                            ei2 = this.A0C.get(i);
                            skipDownloadActions = ei2.A04.A09(downloadAction);
                            if (skipDownloadActions) {
                                if (!isRemoveAction) {
                                    skipDownloadActions2 = ei2.A04.A03;
                                    if (skipDownloadActions2) {
                                        z2 = false;
                                        z = true;
                                        break;
                                    }
                                } else {
                                    z2 = false;
                                    java.lang.String str2 = ei + A05(0, 14, 5) + ei2;
                                    ei2.A08();
                                }
                            }
                            i++;
                        }
                        if (z2) {
                            ei.A0A();
                            if (!isRemoveAction) {
                                this.A0B.add(ei);
                                if (this.A0B.size() == this.A04) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            }
                        }
                    } else {
                        z2 = true;
                        strArr = A0G;
                        if (strArr[0].charAt(25) != strArr[5].charAt(25)) {
                            i = 0;
                        } else {
                            A0G[2] = "ETbkiSgllba5roJ057l04";
                            i = 0;
                        }
                        while (i < i3) {
                            ei2 = this.A0C.get(i);
                            skipDownloadActions = ei2.A04.A09(downloadAction);
                            if (skipDownloadActions) {
                                if (!isRemoveAction) {
                                    skipDownloadActions2 = ei2.A04.A03;
                                    if (skipDownloadActions2) {
                                        z2 = false;
                                        z = true;
                                        break;
                                    }
                                } else {
                                    z2 = false;
                                    java.lang.String str3 = ei + A05(0, 14, 5) + ei2;
                                    ei2.A08();
                                }
                            }
                            i++;
                        }
                        if (z2) {
                            ei.A0A();
                            if (!isRemoveAction) {
                                this.A0B.add(ei);
                                if (this.A0B.size() == this.A04) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B() {
        if (this.A03) {
            return;
        }
        com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction[] downloadActionArr = new com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction[this.A0C.size()];
        for (int i = 0; i < this.A0C.size(); i++) {
            downloadActionArr[i] = this.A0C.get(i).A04;
        }
        this.A06.post(new com.facebook.ads.redexgen.core.ED(this, downloadActionArr));
    }

    private final void A0D() {
        if (this.A03) {
            return;
        }
        this.A03 = true;
        if (A0G[2].length() == 27) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A0G;
        strArr[0] = "kr6gKh0rssOkehhghCFLcVwB9pZxiZaT";
        strArr[5] = "rfZkRg3bvMesL7GazOt2jRzrapFwd57m";
        for (int i = 0; i < this.A0C.size(); i++) {
            this.A0C.get(i).A0B();
        }
        android.os.ConditionVariable conditionVariable = new android.os.ConditionVariable();
        this.A06.post(new com.facebook.ads.redexgen.core.EA(this, conditionVariable));
        conditionVariable.block();
        this.A08.quit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E(com.facebook.ads.redexgen.core.EI ei) {
        A0K(A05(91, 21, 21), ei);
        com.facebook.ads.redexgen.core.EK ekA0M = ei.A0M();
        java.util.Iterator<com.facebook.ads.redexgen.core.EE> it = this.A0D.iterator();
        while (it.hasNext()) {
            it.next().ADl(this, ekA0M);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F(com.facebook.ads.redexgen.core.EI ei) {
        if (this.A03) {
            return;
        }
        boolean zA0N = ei.A0N();
        if (A0G[2].length() == 27) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A0G;
        strArr[3] = "37NPLrajbAjLzkLuMj2xLkQATtgOEqIn";
        strArr[1] = "qsbydxnKXALymqP4MnHEOj9tIKxnSORB";
        boolean stopped = !zA0N;
        if (stopped) {
            this.A0B.remove(ei);
        }
        A0E(ei);
        if (ei.A0O()) {
            this.A0C.remove(ei);
            A0B();
        }
        if (stopped) {
            A0A();
            A09();
        }
    }

    public static void A0K(java.lang.String str, com.facebook.ads.redexgen.core.EI ei) {
        java.lang.String str2 = str + A05(14, 2, 53) + ei;
    }

    public final int A0P(com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction downloadAction) {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(!this.A03);
        com.facebook.ads.redexgen.core.EI eiA02 = A02(downloadAction);
        if (this.A02) {
            A0B();
            A0A();
            if (eiA02.A06 == 0) {
                A0E(eiA02);
            }
        }
        return eiA02.A02;
    }

    public final void A0Q() {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(!this.A03);
        if (this.A01) {
            this.A01 = false;
            A0A();
        }
    }

    public final void A0R(com.facebook.ads.redexgen.core.EE ee) {
        this.A0D.add(ee);
    }

    public final boolean A0S() {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(!this.A03);
        if (!this.A02) {
            return false;
        }
        int i = 0;
        while (true) {
            java.util.ArrayList<com.facebook.ads.redexgen.core.EI> arrayList = this.A0C;
            if (A0G[2].length() == 27) {
                throw new java.lang.RuntimeException();
            }
            A0G[2] = "lfjS8VPE";
            int i2 = arrayList.size();
            if (i >= i2) {
                return true;
            }
            if (this.A0C.get(i).A0N()) {
                return false;
            }
            i++;
        }
    }

    public final com.facebook.ads.redexgen.core.EK[] A0T() {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(!this.A03);
        com.facebook.ads.redexgen.core.EK[] ekArr = new com.facebook.ads.redexgen.core.EK[this.A0C.size()];
        for (int i = 0; i < ekArr.length; i++) {
            ekArr[i] = this.A0C.get(i).A0M();
        }
        return ekArr;
    }
}
