package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1322bu implements com.facebook.ads.redexgen.core.K8 {
    public static byte[] A0D;
    public static java.lang.String[] A0E = {"mx9sJqsz4sgJcdPgoYbgRIW9VnwzqRx6", "rFbyGWP2Ub8PQhtH", "vlmOFoI5eqS6Nw0ENJhYNh6o4BRmenqE", "", "JTMxf3amnDxIP84vbXSIdB2jgXN5bQ", "LkG9NIMCA2H26FKF", "xLNm9V1ZNmyFYJ5qhdZubuzSePd6Iimu", "7SoM7bEoo8CKfR8pxc6QG8O9JCd0xBEh"};
    public static final android.os.Handler A0F;
    public static final com.facebook.ads.redexgen.core.C03370u A0G = null;
    public static final com.facebook.ads.redexgen.core.K9 A0H = null;
    public static final java.lang.String A0I;
    public com.facebook.ads.redexgen.core.InterfaceC03320p A00;
    public com.facebook.ads.redexgen.core.InterfaceC03320p A01;
    public com.facebook.ads.redexgen.core.C8W A04;
    public com.facebook.ads.redexgen.core.K6 A05;
    public com.facebook.ads.redexgen.core.K9 A06;
    public com.facebook.ads.redexgen.core.AbstractC03330q A07;
    public final com.facebook.ads.redexgen.core.C03621t A08;
    public final com.facebook.ads.redexgen.core.J7 A09;
    public final com.facebook.ads.redexgen.core.C03370u A0A;
    public final com.facebook.ads.redexgen.core.C1199Zs A0B;
    public volatile boolean A0C;
    public long A03 = -1;
    public java.lang.String A02 = null;

    public static java.lang.String A07(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 95);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A08() {
        A0D = new byte[]{-58, -23, -26, -11, -7, -22, -9, -91, -23, -12, -22, -8, -91, -13, -12, -7, -91, -22, -3, -18, -8, -7, -14, 21, 18, 33, 37, 22, 35, -47, 26, 36, -47, 31, 38, 29, 29, -47, -39, 20, 25, 18, 26, 31, -47, 31, 32, 37, -47, 29, 32, 18, 21, 22, 21, -38, -56, -21, -24, -9, -5, -20, -7, -89, -16, -6, -89, -11, -4, -13, -13, -89, -81, -22, -17, -24, -16, -11, -20, -21, -80, -91, -56, -59, -44, -40, -55, -42, -124, -51, -41, -124, -46, -39, -48, -48, -124, -116, -46, -45, -124, -57, -52, -59, -51, -46, -115, 6, 41, 38, 53, 57, 42, 55, -27, 46, 56, -27, 51, 58, 49, 49, -27, 52, 51, -27, 56, 57, 38, 55, 57, 6, 41, -21, 12, -67, 10, 12, 15, 2, -67, -2, 1, -67, 0, -2, 11, 1, 6, 1, -2, 17, 2, 16, -53, -50, -23, -26, -27, -34, -105, -40, -37, -40, -25, -21, -36, -23, -105, -21, -16, -25, -36, -91, okio.Utf8.REPLACEMENT_BYTE, 66, -2, okio.Utf8.REPLACEMENT_BYTE, 74, 80, 67, okio.Utf8.REPLACEMENT_BYTE, 66, 87, -2, 81, 82, okio.Utf8.REPLACEMENT_BYTE, 80, 82, 67, 66, 47, 50, 65, -51, -36, -43, 62, 67, 60, 68, 73, 58, 75, 60, 77, 60, 72, 78, -50, -33, -29, -32, -13, -32, -50, -31, -23, -28, -30, -13, -97, -24, -14, -97, -19, -12, -21, -21, 19, 28, 17, 32, 39, 30, 34, 19, 18, 13, 23, 18, 60, 69, 77, 64, 73, 70, 69, 68, 60, 69, 75, -9, 64, 74, -9, 60, 68, 71, 75, 80, 51, 57, 46, 64, 53, 44, 48, 60, 59, 51, 54, 52, 21, 33, 20, 32, 36, 20, 29, 18, 40, 14, 18, 16, 31, 31, 24, 29, 22, -3, 2, 10, -11, 0, -3, -8, -76, 4, 0, -11, -9, -7, 1, -7, 2, 8, -76, -3, 2, -76, 6, -7, 7, 4, 3, 2, 7, -7, 36, 39, 25, 28, 23, 44, 33, 37, 29, 23, 37, 43, 17, 4, 16, 20, 4, 18, 19, -2, 8, 3, 10, 5, -7, -10, 9, -6, -12, 9, -2, 2, -6, 8, 9, -10, 2, 5};
    }

    public abstract void A0O();

    public abstract void A0Q(com.facebook.ads.redexgen.core.InterfaceC03320p interfaceC03320p, com.facebook.ads.redexgen.core.C8W c8w, com.facebook.ads.redexgen.core.C8U c8u, com.facebook.ads.redexgen.core.C03631u c03631u);

    static {
        A08();
        com.facebook.ads.redexgen.core.M5.A02();
        A0I = com.facebook.ads.redexgen.core.AbstractC1322bu.class.getSimpleName();
        A0F = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    public AbstractC1322bu(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.C03621t c03621t) {
        this.A0B = c1199Zs;
        this.A08 = c03621t;
        if (A0H != null) {
            this.A06 = A0H;
        } else {
            this.A06 = new com.facebook.ads.redexgen.core.K9(this.A0B);
        }
        this.A06.A0Q(this);
        if (A0G != null) {
            this.A0A = A0G;
        } else {
            this.A0A = new com.facebook.ads.redexgen.core.C03370u();
        }
        com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(this.A0B).getInitApi().onAdLoadInvoked(this.A0B);
        this.A09 = c1199Zs.A09();
        this.A0B.A0E().A5D();
    }

    private void A09(com.facebook.ads.redexgen.core.C8W c8w) {
        if (com.facebook.ads.internal.util.process.ProcessUtils.isRemoteRenderingProcess()) {
            return;
        }
        android.content.SharedPreferences sharedPreferences = com.facebook.ads.internal.dynamicloading.FlashPreferences.getSharedPreferences(this.A0B);
        if (c8w.A0C() != null) {
            sharedPreferences.edit().putString(A07(262, 12, 110), c8w.A0C()).putLong(A07(342, 16, 54), java.lang.System.currentTimeMillis()).apply();
            return;
        }
        sharedPreferences.edit().clear().apply();
    }

    private void A0A(com.facebook.ads.redexgen.core.Vu vu) {
        com.facebook.ads.redexgen.core.C8W placement = vu.A00();
        if (placement == null || placement.A05() == null) {
            java.lang.String strA07 = A07(291, 29, 53);
            com.facebook.ads.redexgen.core.C0779Jg error = new com.facebook.ads.redexgen.core.C0779Jg(com.facebook.ads.internal.protocol.AdErrorType.NO_AD_PLACEMENT, strA07);
            this.A0B.A0E().A5F(error.A03().getErrorCode(), strA07);
            if (this.A07 != null) {
                this.A07.A0G(error);
                return;
            }
            return;
        }
        this.A04 = placement;
        this.A00 = null;
        com.facebook.ads.redexgen.core.C8W c8w = this.A04;
        org.json.JSONObject jSONObjectA0E = c8w.A0E();
        java.lang.String strA08 = A07(org.objectweb.asm.Opcodes.MONITOREXIT, 3, 13);
        if (jSONObjectA0E == null) {
            com.facebook.ads.redexgen.core.C8U c8uA04 = c8w.A04();
            if (!A0E(c8w, c8uA04)) {
                return;
            }
            if (this.A00 == null) {
                this.A0B.A07().AA0(strA08, com.facebook.ads.redexgen.core.C8E.A0a, new com.facebook.ads.redexgen.core.C8F(A07(81, 26, 5), c8uA04.A02()));
                ABs(com.facebook.ads.redexgen.core.C0779Jg.A00(com.facebook.ads.internal.protocol.AdErrorType.INTERNAL_ERROR));
                return;
            }
            A0Q(this.A00, c8w, c8uA04, new com.facebook.ads.redexgen.core.C03631u(c8uA04.A04(), c8w.A05(), this.A08.A0A, c8w.A05().A0C()));
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.facebook.ads.redexgen.core.C8U c8uA05 = c8w.A04();
            do {
                if (arrayList.isEmpty()) {
                    if (A0E(c8w, c8uA05)) {
                        arrayList.add(c8uA05);
                    } else {
                        return;
                    }
                } else if (A0D(c8uA05)) {
                    arrayList.add(c8uA05);
                }
                c8uA05 = c8w.A04();
            } while (c8uA05 != null);
            com.facebook.ads.redexgen.core.InterfaceC03320p interfaceC03320p = this.A00;
            java.lang.String[] strArr = A0E;
            if (strArr[7].charAt(26) != strArr[6].charAt(26)) {
                throw new java.lang.RuntimeException();
            }
            A0E[2] = "ioxWOihgwDfBac41kTr6w1CF9LpRHapv";
            if (interfaceC03320p == null) {
                this.A0B.A07().AA0(strA08, com.facebook.ads.redexgen.core.C8E.A0a, new com.facebook.ads.redexgen.core.C8F(A07(56, 25, 40), ((com.facebook.ads.redexgen.core.C8U) arrayList.get(0)).A02()));
                ABs(com.facebook.ads.redexgen.core.C0779Jg.A00(com.facebook.ads.internal.protocol.AdErrorType.INTERNAL_ERROR));
                return;
            }
            boolean z = false;
            try {
                if (arrayList.size() > 1 && this.A00 != null && this.A00.AH5()) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    org.json.JSONArray jSONArray = new org.json.JSONArray();
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(((com.facebook.ads.redexgen.core.C8U) it.next()).A04());
                    }
                    jSONObject.put(A07(192, 3, 111), jSONArray);
                    jSONObject.put(A07(org.objectweb.asm.Opcodes.IFNULL, 12, 124), c8w.A0E());
                    A0Q(this.A00, c8w, c8uA05, new com.facebook.ads.redexgen.core.C03631u(jSONObject, c8w.A05(), this.A08.A0A, c8w.A05().A0C()));
                    z = true;
                }
            } catch (java.lang.Exception unused) {
                z = false;
            }
            if (!z) {
                if (arrayList.isEmpty()) {
                    com.facebook.ads.redexgen.core.C0779Jg c0779JgA01 = com.facebook.ads.redexgen.core.C0779Jg.A01(com.facebook.ads.internal.protocol.AdErrorType.NO_FILL, A07(0, 0, 103));
                    this.A0B.A0E().A5F(c0779JgA01.A03().getErrorCode(), A07(org.objectweb.asm.Opcodes.I2L, 22, 62));
                    if (this.A07 != null) {
                        this.A07.A0G(c0779JgA01);
                        return;
                    }
                    return;
                }
                if (this.A00 == null) {
                    this.A0B.A07().AA0(strA08, com.facebook.ads.redexgen.core.C8E.A0a, new com.facebook.ads.redexgen.core.C8F(A07(22, 34, 82), ((com.facebook.ads.redexgen.core.C8U) arrayList.get(0)).A02()));
                    ABs(com.facebook.ads.redexgen.core.C0779Jg.A00(com.facebook.ads.internal.protocol.AdErrorType.INTERNAL_ERROR));
                    return;
                }
                com.facebook.ads.redexgen.core.C8U c8u = (com.facebook.ads.redexgen.core.C8U) arrayList.get(0);
                A0Q(this.A00, c8w, c8u, new com.facebook.ads.redexgen.core.C03631u(c8u.A04(), c8w.A05(), this.A08.A0A, c8w.A05().A0C()));
            }
        }
        A09(placement);
    }

    private final void A0B(java.lang.String str, com.facebook.ads.AdExperienceType adExperienceType) {
        this.A0B.A0E().A5G(str != null);
        this.A03 = java.lang.System.currentTimeMillis();
        if (android.os.Build.VERSION.SDK_INT < 17) {
            ABs(new com.facebook.ads.redexgen.core.C0779Jg(com.facebook.ads.internal.protocol.AdErrorType.API_NOT_SUPPORTED, A07(0, 0, 103)));
            return;
        }
        try {
            com.facebook.ads.redexgen.core.C0788Jq bidPayload = new com.facebook.ads.redexgen.core.C0788Jq(this.A0B, str, this.A08.A0A, this.A08.A09);
            this.A05 = this.A08.A00(this.A0B, bidPayload, adExperienceType);
            if (this.A06 != null) {
                this.A06.A0P(this.A05);
            }
        } catch (com.facebook.ads.redexgen.core.C0780Jh e) {
            ABs(com.facebook.ads.redexgen.core.C0779Jg.A02(e));
        }
    }

    private void A0C(org.json.JSONObject jSONObject) {
        if (jSONObject != null) {
            this.A02 = jSONObject.optString(A07(230, 12, 79));
            com.facebook.ads.redexgen.core.C03390w.A01(this.A0B).A0O(jSONObject);
        }
    }

    private boolean A0D(com.facebook.ads.redexgen.core.C8U c8u) {
        return (c8u == null || c8u.A04() == null) ? false : true;
    }

    private boolean A0E(com.facebook.ads.redexgen.core.C8W c8w, com.facebook.ads.redexgen.core.C8U c8u) {
        java.lang.String strA07 = A07(0, 0, 103);
        if (c8u == null) {
            com.facebook.ads.redexgen.core.C0779Jg c0779JgA01 = com.facebook.ads.redexgen.core.C0779Jg.A01(com.facebook.ads.internal.protocol.AdErrorType.NO_FILL, strA07);
            this.A0B.A0E().A5F(c0779JgA01.A03().getErrorCode(), A07(org.objectweb.asm.Opcodes.I2L, 22, 62));
            if (this.A07 != null) {
                this.A07.A0G(c0779JgA01);
            }
            return false;
        }
        java.lang.String strA02 = c8u.A02();
        com.facebook.ads.redexgen.core.InterfaceC03320p interfaceC03320pA00 = this.A0A.A00(this.A0B, c8w.A05().A0D());
        if (interfaceC03320pA00 == null) {
            this.A0B.A07().AA0(A07(org.objectweb.asm.Opcodes.MONITOREXIT, 3, 13), com.facebook.ads.redexgen.core.C8E.A0a, new com.facebook.ads.redexgen.core.C8F(A07(0, 22, 38), strA02));
            ABs(com.facebook.ads.redexgen.core.C0779Jg.A00(com.facebook.ads.internal.protocol.AdErrorType.INTERNAL_ERROR));
            return false;
        }
        if (!this.A08.A01().contains(interfaceC03320pA00.A82())) {
            com.facebook.ads.redexgen.core.C0779Jg c0779JgA02 = com.facebook.ads.redexgen.core.C0779Jg.A01(com.facebook.ads.internal.protocol.AdErrorType.INTERNAL_ERROR, strA07);
            this.A0B.A0E().A5F(c0779JgA02.A03().getErrorCode(), A07(155, 19, 24));
            if (this.A07 != null) {
                com.facebook.ads.redexgen.core.AbstractC03330q abstractC03330q = this.A07;
                if (A0E[0].length() != 32) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A0E;
                strArr[7] = "XDVsCbJ3K5v8dlUMGtS0uKtjThdAM1fs";
                strArr[6] = "AXbWkB0jI9efrJtSTWvCCcVR8Wd1ee9G";
                abstractC03330q.A0G(c0779JgA02);
            }
            return false;
        }
        this.A00 = interfaceC03320pA00;
        org.json.JSONObject jSONObjectA04 = c8u.A04();
        if (jSONObjectA04 != null) {
            java.lang.String strOptString = jSONObjectA04.optString(A07(332, 10, 64));
            this.A0B.A0E().AGd(strOptString);
            this.A0B.A0C(strOptString);
            com.facebook.ads.redexgen.core.C1198Zr c1198ZrA00 = com.facebook.ads.redexgen.core.AbstractC04997i.A00();
            if (c1198ZrA00 != null) {
                c1198ZrA00.A0C(strOptString);
            }
            org.json.JSONObject dataObject = jSONObjectA04.optJSONObject(A07(274, 17, 80));
            A0C(dataObject);
            if (this.A05 == null) {
                java.lang.String strA08 = A07(242, 20, 120);
                com.facebook.ads.redexgen.core.C0779Jg c0779JgA03 = com.facebook.ads.redexgen.core.C0779Jg.A01(com.facebook.ads.internal.protocol.AdErrorType.UNKNOWN_ERROR, strA08);
                this.A0B.A0E().A5F(c0779JgA03.A03().getErrorCode(), strA08);
                if (this.A07 != null) {
                    this.A07.A0G(c0779JgA03);
                }
                return false;
            }
            return true;
        }
        java.lang.String strA09 = A07(212, 18, 32);
        com.facebook.ads.redexgen.core.C0779Jg c0779JgA04 = com.facebook.ads.redexgen.core.C0779Jg.A01(com.facebook.ads.internal.protocol.AdErrorType.UNKNOWN_ERROR, strA09);
        this.A0B.A0E().A5F(c0779JgA04.A03().getErrorCode(), strA09);
        if (this.A07 != null) {
            this.A07.A0G(c0779JgA04);
        }
        return false;
    }

    public final long A0F() {
        if (this.A04 != null) {
            return this.A04.A03();
        }
        java.lang.String[] strArr = A0E;
        if (strArr[7].charAt(26) != strArr[6].charAt(26)) {
            throw new java.lang.RuntimeException();
        }
        A0E[2] = "cOTrI9DB0oxjTyLR1voyMrEgWVbVphTL";
        return -1L;
    }

    public final android.os.Handler A0G() {
        return A0F;
    }

    public com.facebook.ads.redexgen.core.C1E A0H() {
        if (this.A01 != null) {
            com.facebook.ads.redexgen.core.InterfaceC03320p interfaceC03320p = this.A01;
            if (A0E[2].charAt(15) == 'D') {
                return ((com.facebook.ads.redexgen.core.AbstractC1345cH) interfaceC03320p).A0H();
            }
            A0E[0] = "oRXWb94touLPnP0lmqQIoCQNN81QkmVq";
            return ((com.facebook.ads.redexgen.core.AbstractC1345cH) interfaceC03320p).A0H();
        }
        java.lang.String[] strArr = A0E;
        if (strArr[3].length() == strArr[4].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0E;
        strArr2[7] = "c4mFc8cvcfHQyghvzrB7bYP2aMdrhGND";
        strArr2[6] = "OOjdStzIF6ducmayoMT1WxOsFGdjLtMG";
        return null;
    }

    public final com.facebook.ads.redexgen.core.C8X A0I() {
        if (this.A04 == null) {
            return null;
        }
        return this.A04.A05();
    }

    public final void A0J() {
        if (!com.facebook.ads.redexgen.core.C0762Im.A1l(this.A0B)) {
            return;
        }
        com.facebook.ads.redexgen.core.InterfaceC03320p interfaceC03320p = this.A01;
        java.lang.String[] strArr = A0E;
        if (strArr[3].length() == strArr[4].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0E;
        strArr2[3] = "";
        strArr2[4] = "YS2d1pFjROLoYd3yH38ADYRoaACmCS";
        if (interfaceC03320p != null) {
            com.facebook.ads.redexgen.core.C0805Kh.A00(this.A0B).A0D(this.A01.A82().toString(), this.A01.A6r());
        }
        if (this.A06 != null) {
            this.A06.A0Q(null);
            this.A06 = null;
        }
        this.A07 = null;
        this.A00 = null;
        this.A01 = null;
    }

    public final void A0K() {
        java.lang.String strA6r;
        this.A0B.A0E().A3C(com.facebook.ads.redexgen.core.C0841Lu.A01(this.A03));
        if (this.A01 == null || (strA6r = this.A01.A6r()) == null) {
            return;
        }
        java.util.HashMap map = new java.util.HashMap();
        java.lang.String strA04 = com.facebook.ads.redexgen.core.C0841Lu.A04(this.A03);
        java.lang.String clientToken = A07(320, 12, 89);
        map.put(clientToken, strA04);
        new com.facebook.ads.redexgen.core.JF(strA6r, this.A09).A04(com.facebook.ads.redexgen.core.JE.A08, map);
    }

    public final void A0L() {
        com.facebook.ads.redexgen.core.InterfaceC03320p interfaceC03320p = this.A01;
        java.lang.String strA07 = A07(org.objectweb.asm.Opcodes.MONITOREXIT, 3, 13);
        if (interfaceC03320p == null) {
            java.lang.String strA08 = A07(107, 26, 102);
            this.A0B.A07().AA0(strA07, com.facebook.ads.redexgen.core.C8E.A0Q, new com.facebook.ads.redexgen.core.C8F(strA08));
            com.facebook.ads.internal.protocol.AdErrorType adErrorType = com.facebook.ads.internal.protocol.AdErrorType.INTERNAL_ERROR;
            this.A0B.A0E().A5F(adErrorType.getErrorCode(), strA08);
            if (this.A07 != null) {
                com.facebook.ads.redexgen.core.AbstractC03330q abstractC03330q = this.A07;
                java.lang.String errorMessage = adErrorType.getDefaultErrorMessage();
                abstractC03330q.A0G(com.facebook.ads.redexgen.core.C0779Jg.A01(adErrorType, errorMessage));
            }
            this.A0B.A0E().A5I();
            return;
        }
        if (this.A0C) {
            java.lang.String strA09 = A07(org.objectweb.asm.Opcodes.FRETURN, 18, 127);
            this.A0B.A07().AA0(strA07, com.facebook.ads.redexgen.core.C8E.A0M, new com.facebook.ads.redexgen.core.C8F(strA09));
            com.facebook.ads.internal.protocol.AdErrorType adErrorType2 = com.facebook.ads.internal.protocol.AdErrorType.AD_ALREADY_STARTED;
            this.A0B.A0E().A5F(adErrorType2.getErrorCode(), strA09);
            if (this.A07 != null) {
                com.facebook.ads.redexgen.core.AbstractC03330q abstractC03330q2 = this.A07;
                java.lang.String errorMessage2 = adErrorType2.getDefaultErrorMessage();
                abstractC03330q2.A0G(com.facebook.ads.redexgen.core.C0779Jg.A01(adErrorType2, errorMessage2));
            }
            this.A0B.A0E().A5H();
            return;
        }
        if (!android.text.TextUtils.isEmpty(this.A01.A6r())) {
            this.A09.AAT(this.A01.A6r());
        }
        this.A0B.A0E().A5J();
        this.A0C = true;
        A0O();
    }

    public final void A0M() {
        A0X(false);
    }

    public final void A0N() {
        if (this.A02 != null) {
            com.facebook.ads.redexgen.core.C03390w.A01(this.A0B).A0N(this.A02);
        }
    }

    public final void A0P(com.facebook.ads.redexgen.core.InterfaceC03320p interfaceC03320p) {
        if (interfaceC03320p != null) {
            interfaceC03320p.onDestroy();
        }
    }

    public final void A0R(com.facebook.ads.redexgen.core.AbstractC03330q abstractC03330q) {
        this.A07 = abstractC03330q;
    }

    public final void A0S(com.facebook.ads.redexgen.core.C03631u c03631u) {
        A0U(c03631u.A03().optString(A07(210, 2, 12)));
    }

    public void A0T(java.lang.String str) {
        A0B(str, null);
    }

    public final void A0U(java.lang.String str) {
        this.A0B.A0E().A5C();
        if (!android.text.TextUtils.isEmpty(str)) {
            new com.facebook.ads.redexgen.core.JF(str, this.A09).A04(com.facebook.ads.redexgen.core.JE.A04, null);
        }
    }

    public final void A0V(java.lang.String str) {
        A0T(str);
    }

    public final void A0W(java.lang.String str, com.facebook.ads.AdExperienceType adExperienceType) {
        A0B(str, adExperienceType);
    }

    public void A0X(boolean z) {
        if (!z && !this.A0C) {
            return;
        }
        this.A0B.A0E().A5K();
        A0P(this.A01);
        this.A0C = false;
    }

    public final boolean A0Y() {
        return this.A04 == null || this.A04.A0H();
    }

    @Override // com.facebook.ads.redexgen.core.K8
    public final synchronized void ABs(com.facebook.ads.redexgen.core.C0779Jg c0779Jg) {
        A0G().post(new com.facebook.ads.redexgen.core.C1323bv(this, c0779Jg));
    }

    @Override // com.facebook.ads.redexgen.core.K8
    public final synchronized void ADj(com.facebook.ads.redexgen.core.Vu vu) {
        try {
            A0A(vu);
        } catch (java.lang.Exception e) {
            this.A0B.A07().AA0(A07(org.objectweb.asm.Opcodes.MONITOREXIT, 3, 13), com.facebook.ads.redexgen.core.C8E.A0T, new com.facebook.ads.redexgen.core.C8F(e));
        }
    }
}
