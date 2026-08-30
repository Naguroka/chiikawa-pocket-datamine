package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03832o {
    public static com.facebook.ads.redexgen.core.C03832o A05;
    public static byte[] A06;
    public static final java.lang.Object A07;
    public final android.content.Context A00;
    public final android.os.Handler A01;
    public final java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<com.facebook.ads.redexgen.core.C03822n>> A04 = new java.util.HashMap<>();
    public final java.util.HashMap<java.lang.String, java.util.ArrayList<com.facebook.ads.redexgen.core.C03822n>> A03 = new java.util.HashMap<>();
    public final java.util.ArrayList<com.facebook.ads.redexgen.core.C03812m> A02 = new java.util.ArrayList<>();

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 63);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A03() {
        A06 = new byte[]{11, 11, 109, 66, 71, 95, 78, 89, 11, 79, 66, 79, 11, 69, 68, 95, 11, 70, 74, 95, 72, 67, 17, 11, 95, 95, 57, 22, 19, 11, 26, 13, 95, 18, 30, 11, 28, 23, 26, 27, 94, 95, 95, 18, 30, 11, 28, 23, 66, 79, 7, 42, 101, 108, 42, 99, 100, 126, 111, 100, 126, 42, 37, 118, 102, 109, 96, 104, 96, 37, 86, 116, 99, 126, 120, 121, 55, 123, 126, 100, 99, 45, 55, 84, 119, 123, 121, 116, 90, 106, 119, 121, 124, 123, 121, 107, 108, 85, 121, 118, 121, 127, 125, 106, 24, 52, 33, 54, kotlin.io.encoding.Base64.padSymbol, 60, 59, 50, 117, 52, 50, 52, 60, 59, 38, 33, 117, 51, 60, 57, 33, 48, 39, 117, 24, 47, 57, 37, 38, 60, 35, 36, 45, 106, 62, 51, 58, 47, 106, 56, 58, 45, 48, 54, 55, 78, 76, 89, 72, 74, 66, 95, 84, 12, 9, 28, 9, 72, 69, 76, 89, 91, 64, 69, 64, 65, 89, 64, 14, 92, 75, 79, 93, 65, 64};
    }

    static {
        A03();
        A07 = new java.lang.Object();
    }

    public C03832o(android.content.Context context) {
        this.A00 = context;
        final android.os.Looper mainLooper = context.getMainLooper();
        this.A01 = new android.os.Handler(mainLooper) { // from class: com.facebook.ads.redexgen.X.2l
            @Override // android.os.Handler
            public final void handleMessage(android.os.Message message) {
                switch (message.what) {
                    case 1:
                        this.A00.A02();
                        break;
                    default:
                        super.handleMessage(message);
                        break;
                }
            }
        };
    }

    public static com.facebook.ads.redexgen.core.C03832o A00(android.content.Context context) {
        com.facebook.ads.redexgen.core.C03832o c03832o;
        synchronized (A07) {
            if (A05 == null) {
                A05 = new com.facebook.ads.redexgen.core.C03832o(context.getApplicationContext());
            }
            c03832o = A05;
        }
        return c03832o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        com.facebook.ads.redexgen.core.C03812m[] c03812mArr;
        while (true) {
            synchronized (this.A04) {
                int size = this.A02.size();
                if (size > 0) {
                    c03812mArr = new com.facebook.ads.redexgen.core.C03812m[size];
                    this.A02.toArray(c03812mArr);
                    this.A02.clear();
                } else {
                    return;
                }
            }
            for (com.facebook.ads.redexgen.core.C03812m c03812m : c03812mArr) {
                int j = c03812m.A01.size();
                for (int nbr = 0; nbr < j; nbr++) {
                    com.facebook.ads.redexgen.core.C03822n c03822n = c03812m.A01.get(nbr);
                    if (!c03822n.A01) {
                        c03822n.A02.onReceive(this.A00, c03812m.A00);
                    }
                }
            }
        }
    }

    public final void A05(android.content.BroadcastReceiver broadcastReceiver) {
        synchronized (this.A04) {
            java.util.ArrayList<com.facebook.ads.redexgen.core.C03822n> arrayListRemove = this.A04.remove(broadcastReceiver);
            if (arrayListRemove == null) {
                return;
            }
            for (int size = arrayListRemove.size() - 1; size >= 0; size--) {
                com.facebook.ads.redexgen.core.C03822n c03822n = arrayListRemove.get(size);
                c03822n.A01 = true;
                for (int j = 0; j < c03822n.A03.countActions(); j++) {
                    java.lang.String action = c03822n.A03.getAction(j);
                    java.util.ArrayList<com.facebook.ads.redexgen.core.C03822n> arrayList = this.A03.get(action);
                    if (arrayList != null) {
                        int i = arrayList.size();
                        for (int i2 = i - 1; i2 >= 0; i2--) {
                            com.facebook.ads.redexgen.core.C03822n c03822n2 = arrayList.get(i2);
                            if (c03822n2.A02 == broadcastReceiver) {
                                c03822n2.A01 = true;
                                arrayList.remove(i2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.A03.remove(action);
                        }
                    }
                }
            }
        }
    }

    public final void A06(android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter) {
        synchronized (this.A04) {
            com.facebook.ads.redexgen.core.C03822n c03822n = new com.facebook.ads.redexgen.core.C03822n(intentFilter, broadcastReceiver);
            java.util.ArrayList<com.facebook.ads.redexgen.core.C03822n> arrayList = this.A04.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList<>(1);
                this.A04.put(broadcastReceiver, arrayList);
            }
            arrayList.add(c03822n);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                java.lang.String action = intentFilter.getAction(i);
                java.util.ArrayList<com.facebook.ads.redexgen.core.C03822n> arrayList2 = this.A03.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new java.util.ArrayList<>(1);
                    this.A03.put(action, arrayList2);
                }
                arrayList2.add(c03822n);
            }
        }
    }

    public final boolean A07(android.content.Intent intent) {
        java.lang.String strA01;
        synchronized (this.A04) {
            java.lang.String action = intent.getAction();
            java.lang.String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.A00.getContentResolver());
            android.net.Uri data = intent.getData();
            java.lang.String action2 = intent.getScheme();
            java.util.Set<java.lang.String> categories = intent.getCategories();
            boolean debug = (intent.getFlags() & 8) != 0;
            if (debug) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.String type = A01(128, 15, 117);
                java.lang.StringBuilder sbAppend = sb.append(type).append(strResolveTypeIfNeeded);
                java.lang.String type2 = A01(62, 8, 58);
                java.lang.StringBuilder sbAppend2 = sbAppend.append(type2).append(action2);
                java.lang.String type3 = A01(51, 11, 53);
                sbAppend2.append(type3).append(intent).toString();
            }
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.facebook.ads.redexgen.core.C03822n>> map = this.A03;
            java.lang.String type4 = intent.getAction();
            java.util.ArrayList<com.facebook.ads.redexgen.core.C03822n> arrayList = map.get(type4);
            if (arrayList != null) {
                if (debug) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    java.lang.String type5 = A01(70, 13, 40);
                    sb2.append(type5).append(arrayList).toString();
                }
                java.util.ArrayList arrayList2 = null;
                for (int i = 0; i < arrayList.size(); i++) {
                    com.facebook.ads.redexgen.core.C03822n c03822n = arrayList.get(i);
                    if (debug) {
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                        java.lang.String type6 = A01(104, 24, 106);
                        sb3.append(type6).append(c03822n.A03).toString();
                    }
                    if (!c03822n.A00) {
                        int iMatch = c03822n.A03.match(action, strResolveTypeIfNeeded, action2, data, categories, A01(83, 21, 39));
                        if (iMatch >= 0) {
                            if (debug) {
                                java.lang.String str = A01(24, 27, 64) + java.lang.Integer.toHexString(iMatch);
                            }
                            if (arrayList2 == null) {
                                arrayList2 = new java.util.ArrayList();
                            }
                            arrayList2.add(c03822n);
                            c03822n.A00 = true;
                        } else if (debug) {
                            switch (iMatch) {
                                case -4:
                                    strA01 = A01(org.objectweb.asm.Opcodes.FCMPL, 8, 18);
                                    break;
                                case -3:
                                    strA01 = A01(org.objectweb.asm.Opcodes.D2L, 6, 102);
                                    break;
                                case -2:
                                    strA01 = A01(157, 4, 87);
                                    break;
                                case -1:
                                    strA01 = A01(org.objectweb.asm.Opcodes.IF_ICMPLT, 4, 3);
                                    break;
                                default:
                                    strA01 = A01(org.objectweb.asm.Opcodes.IF_ACMPEQ, 14, 17);
                                    break;
                            }
                            java.lang.String str2 = A01(0, 24, 20) + strA01;
                        }
                    }
                }
                if (arrayList2 != null) {
                    for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                        ((com.facebook.ads.redexgen.core.C03822n) arrayList2.get(i2)).A00 = false;
                    }
                    this.A02.add(new com.facebook.ads.redexgen.core.C03812m(intent, arrayList2));
                    if (!this.A01.hasMessages(1)) {
                        this.A01.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }
}
