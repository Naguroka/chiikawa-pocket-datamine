package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1358cU implements com.facebook.ads.redexgen.core.InterfaceC03280k, com.facebook.ads.redexgen.core.InterfaceC03320p {
    public static byte[] A0C;
    public static java.lang.String[] A0D = {"axrzCdv0FVVdCRJ2G5bzsKW6gzdnjkd", "bTiRlDodVRVUvI5asAv5OrmPjdR2kQoL", "0F0kzsbgf", "9OhtkIX5JTQzZAf31yyS0L6RFdCICf7G", "a5UohLNEI7iVSyxaj4LiJgBVL6R7sy1L", "7foeJoxu0TAivWs2uWCvQbVxkZa0ERHH", "EHJaWrfXkxbvFmDXjSXoaOL8kiGJisUm", "EwwWMCMqNj"};
    public static final java.lang.String A0E;
    public int A00;
    public com.facebook.ads.redexgen.core.C1346cI A01;
    public com.facebook.ads.redexgen.core.AnonymousClass14 A02;
    public com.facebook.ads.redexgen.core.AnonymousClass15 A03;
    public com.facebook.ads.redexgen.core.JT A04;
    public java.util.List<com.facebook.ads.redexgen.core.W7> A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final com.facebook.ads.redexgen.core.C1199Zs A0A;
    public final java.lang.String A0B;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 27);
            if (A0D[0].length() != 31) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0D;
            strArr[4] = "ypXQoKhxcHRWJrqojmqi5sMtZ7xfThaX";
            strArr[6] = "2LOy6kLjroQDrfbojOuFHdbjLd88ORkx";
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A04() {
        A0C = new byte[]{55, 18, 23, 6, 2, 19, 4, 86, 23, 26, 4, 19, 23, 18, 15, 86, 26, 25, 23, 18, 19, 18, 86, 18, 23, 2, 23, 2, 45, 40, 34, 42, 97, 41, 32, 49, 49, 36, 47, 36, 37, 97, 46, 47, 97, 45, 46, 34, 42, 50, 34, 51, 36, 36, 47, 97, 32, 37, 87, 120, 125, 119, 127, 52, 120, 123, 115, 115, 113, 112, 119, 117, 120, 120, 113, 102, 64, 109, 100, 113, 46, 44, okio.Utf8.REPLACEMENT_BYTE, 41, 46, 35, 57, 85, 87, 68, 82, 95, 88, 82, 114, 101, 50, kotlin.io.encoding.Base64.padSymbol, 56, 32, 49, 38, 49, 48, 11, 55, 56, kotlin.io.encoding.Base64.padSymbol, 55, okio.Utf8.REPLACEMENT_BYTE, 11, 48, 49, 56, 53, 45, 11, 57, 39, 22, 12, 32, 28, 13, 26, 30, 11, 22, 9, 26, 32, 30, 12, 32, 28, 11, 30, 32, 9, 77, 127, 112, 101, 120, 103, 116, 36, 57, 54, 39, 36, okio.Utf8.REPLACEMENT_BYTE, 56, 35, 106, 113, 118, 110, 106, 122, 86, 123, 10, 21, 25, 11};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A06(java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.String> map2) {
        try {
            new android.os.Handler().postDelayed(new com.facebook.ads.redexgen.core.C1359cV(this, map2, A03(map)), this.A01.A07() * 1000);
        } catch (java.lang.Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0122  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A0M(java.util.Map<java.lang.String, java.lang.String> map) {
        boolean z;
        if (A0R()) {
            if (com.facebook.ads.redexgen.core.C0762Im.A1w(this.A0A) && com.facebook.ads.redexgen.core.M4.A03(map)) {
                android.util.Log.e(A0E, A02(27, 31, 90));
                return;
            }
            java.util.HashMap map2 = new java.util.HashMap();
            if (map != null) {
                map2.putAll(map);
            }
            if (this.A01.A0e()) {
                map2.put(A02(87, 7, 45), java.lang.String.valueOf(A0E().A04()));
                map2.put(A02(80, 7, 86), java.lang.String.valueOf(A0E().A03()));
            }
            map2.put(A02(70, 10, 15), com.facebook.ads.internal.protocol.AdPlacementType.NATIVE.name());
            map2.put(A02(154, 8, 4), this.A0B);
            if (this.A01.A0C() != null) {
                map2.put(A02(119, 21, 100), java.lang.String.valueOf(this.A01.A0C().A17()));
                map2.put(A02(96, 23, 79), java.lang.String.valueOf(this.A01.A0C().A0U()));
            }
            com.facebook.ads.redexgen.core.AbstractC03250h abstractC03250hA00 = com.facebook.ads.redexgen.core.C03260i.A00(this.A0A, this.A0A.A09(), this.A01.A6r(), this.A01.A0B(), map2, this.A01.A0C() != null ? this.A01.A0C().A1Q() : null);
            com.facebook.ads.redexgen.core.EnumC03240g enumC03240gA0C = com.facebook.ads.redexgen.core.EnumC03240g.A09;
            if (abstractC03250hA00 != null) {
                enumC03240gA0C = abstractC03250hA00.A0C();
            }
            if ((abstractC03250hA00 instanceof com.facebook.ads.redexgen.core.GQ) || (abstractC03250hA00 instanceof com.facebook.ads.redexgen.core.C0705Gf)) {
                boolean zA0g = com.facebook.ads.redexgen.core.M3.A0g(this.A0A, enumC03240gA0C, map2);
                java.lang.String[] strArr = A0D;
                if (strArr[4].charAt(16) != strArr[6].charAt(16)) {
                    throw new java.lang.RuntimeException();
                }
                A0D[5] = "kwfiBSqx7XAKe0021CxmCpt6QDry9hKe";
                if (zA0g) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (z || enumC03240gA0C == com.facebook.ads.redexgen.core.EnumC03240g.A06) {
                return;
            }
            com.facebook.ads.redexgen.core.LC.A04(this.A0A, A02(58, 12, 15));
            if (this.A02 != null) {
                com.facebook.ads.redexgen.core.AnonymousClass14 anonymousClass14 = this.A02;
                java.lang.String[] strArr2 = A0D;
                if (strArr2[4].charAt(16) != strArr2[6].charAt(16)) {
                    anonymousClass14.ACn(this);
                } else {
                    A0D[0] = "IDlncozxZ6Zb4pDO4gSYUoZYwzxF1Fi";
                    anonymousClass14.ACn(this);
                }
            }
        }
    }

    static {
        A04();
        A0E = com.facebook.ads.redexgen.core.C1358cU.class.getSimpleName();
    }

    public C1358cU(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        this(c1199Zs, new com.facebook.ads.redexgen.core.C1346cI());
    }

    public C1358cU(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.C1346cI c1346cI) {
        this.A0B = java.util.UUID.randomUUID().toString();
        this.A00 = 200;
        this.A01 = c1346cI;
        this.A0A = c1199Zs;
    }

    private java.util.Map<java.lang.String, java.lang.String> A03(java.util.Map<java.lang.String, java.lang.String> map) {
        java.util.HashMap map2 = new java.util.HashMap();
        java.lang.String strA02 = A02(org.objectweb.asm.Opcodes.IF_ICMPGE, 4, 103);
        if (map.containsKey(strA02)) {
            map2.put(strA02, map.get(strA02));
        }
        java.lang.String strA03 = A02(org.objectweb.asm.Opcodes.I2C, 8, 76);
        if (map.containsKey(strA03)) {
            map2.put(strA03, map.get(strA03));
        }
        return map2;
    }

    private void A05(com.facebook.ads.redexgen.core.C1346cI c1346cI) {
        if (!this.A06) {
            this.A01 = c1346cI;
            java.util.List<com.facebook.ads.redexgen.core.C1346cI> listA0c = this.A01.A0c();
            if (listA0c != null && listA0c.size() > 0) {
                int size = listA0c.size();
                java.util.ArrayList arrayList = new java.util.ArrayList(size);
                for (int i = 0; i < size; i++) {
                    com.facebook.ads.redexgen.core.C1358cU adapter = new com.facebook.ads.redexgen.core.C1358cU(this.A0A);
                    adapter.A05(listA0c.get(i));
                    arrayList.add(new com.facebook.ads.redexgen.core.W7(this.A0A, adapter, (com.facebook.ads.redexgen.core.C8X) null, this.A04));
                }
                this.A05 = arrayList;
            }
            this.A06 = true;
            this.A07 = A07();
            return;
        }
        throw new java.lang.IllegalStateException(A02(0, 27, 109));
    }

    private boolean A07() {
        return (!(this.A01.A0e() || android.text.TextUtils.isEmpty(this.A01.A0V())) || (!android.text.TextUtils.isEmpty(this.A01.A0S()) && this.A01.A0e())) && (this.A01.A0F() != null || this.A01.A0e()) && (this.A01.A0E() != null || A82() == com.facebook.ads.internal.protocol.AdPlacementType.NATIVE_BANNER);
    }

    public final int A08() {
        return this.A01.A02();
    }

    public final int A09() {
        return this.A01.A05();
    }

    public final int A0A() {
        int iA06 = this.A01.A06();
        if (iA06 < 0 || iA06 > 100) {
            return 0;
        }
        return iA06;
    }

    public final int A0B() {
        return this.A00;
    }

    public final int A0C() {
        return this.A01.A08();
    }

    public final int A0D() {
        return this.A01.A09();
    }

    public final com.facebook.ads.redexgen.core.C1346cI A0E() {
        return this.A01;
    }

    public final com.facebook.ads.redexgen.core.AnonymousClass14 A0F() {
        return this.A02;
    }

    public final java.lang.String A0G() {
        return this.A01.A0Y();
    }

    public final java.util.List<com.facebook.ads.redexgen.core.W7> A0H() {
        if (!A0R()) {
            return null;
        }
        return this.A05;
    }

    public final void A0I() {
        if (!this.A09) {
            java.lang.String strA0Z = A0E().A0Z();
            if (strA0Z != null) {
                com.facebook.ads.redexgen.core.J7 j7A09 = this.A0A.A09();
                java.lang.String[] strArr = A0D;
                if (strArr[1].charAt(25) != strArr[3].charAt(25)) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A0D;
                strArr2[4] = "MHNGbcOaMZIG61BxjY7eI95TuiNlx0Gr";
                strArr2[6] = "kvjKrlZQ6RBIZv1Jj5ESJw4vFB55PB3z";
                j7A09.AEU(strA0Z);
            }
            this.A09 = true;
        }
    }

    public final void A0J() {
        if (this.A05 != null && !this.A05.isEmpty()) {
            java.util.Iterator<com.facebook.ads.redexgen.core.W7> it = this.A05.iterator();
            while (it.hasNext()) {
                it.next().unregisterView();
            }
        }
    }

    public final void A0K(com.facebook.ads.redexgen.core.AnonymousClass14 anonymousClass14) {
        this.A02 = anonymousClass14;
    }

    public final void A0L(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.AnonymousClass14 anonymousClass14, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.C03631u c03631u, com.facebook.ads.redexgen.core.JT jt) {
        int iA06;
        this.A02 = anonymousClass14;
        this.A04 = jt;
        org.json.JSONObject jSONObjectA03 = c03631u.A03();
        com.facebook.ads.redexgen.core.C8X c8xA01 = c03631u.A01();
        if (c8xA01 != null) {
            iA06 = c8xA01.A06();
        } else {
            iA06 = 200;
        }
        this.A00 = iA06;
        A05(com.facebook.ads.redexgen.core.AnonymousClass16.A00(c1199Zs, jSONObjectA03, com.facebook.ads.redexgen.core.LV.A02(jSONObjectA03, A02(94, 2, 10))));
        if (com.facebook.ads.redexgen.core.AbstractC03290l.A06(c1199Zs, this, j7)) {
            c1199Zs.A0E().A4g();
            anonymousClass14.ACr(this, com.facebook.ads.redexgen.core.C0779Jg.A00(com.facebook.ads.internal.protocol.AdErrorType.NO_FILL));
        } else {
            if (anonymousClass14 != null) {
                anonymousClass14.ACo(this);
            }
            this.A03 = new com.facebook.ads.redexgen.core.AnonymousClass15(c1199Zs, this.A0B, this, anonymousClass14);
            this.A03.A02();
        }
    }

    public final void A0N(java.util.Map<java.lang.String, java.lang.String> extraData) {
        this.A0A.A09().A9w(this.A01.A6r(), extraData);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    /* JADX WARN: Code duplicated, block: B:19:0x0040  */
    /* JADX WARN: Code duplicated, block: B:22:0x007a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0082  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:36:0x0105  */
    public final void A0O(java.util.Map<java.lang.String, java.lang.String> map) {
        java.util.HashMap map2;
        boolean zA0U;
        java.lang.String strA0X;
        java.lang.String[] strArr;
        if (A0R() && !this.A08) {
            if (this.A02 != null) {
                com.facebook.ads.redexgen.core.AnonymousClass14 anonymousClass14 = this.A02;
                if (A0D[7].length() == 10) {
                    A0D[2] = "N1HzTzVNk";
                    anonymousClass14.ACp(this);
                    map2 = new java.util.HashMap();
                    if (map != null) {
                        map2.putAll(map);
                    }
                    if (this.A01.A0e()) {
                        map2.put(A02(87, 7, 45), java.lang.String.valueOf(A0E().A04()));
                        map2.put(A02(80, 7, 86), java.lang.String.valueOf(A0E().A03()));
                    }
                    if (android.text.TextUtils.isEmpty(A6r())) {
                        if (!this.A01.A0e()) {
                            this.A0A.A0E().A36();
                            strA0X = this.A01.A0X();
                            strArr = A0D;
                            if (strArr[1].charAt(25) == strArr[3].charAt(25)) {
                                java.lang.String[] strArr2 = A0D;
                                strArr2[1] = "Q8Us8dZOubCsANiQB8YQBmsKLdjgWIPJ";
                                strArr2[3] = "Pg8pQUM49Vm5a0t7ebabBeivyd2Kgjff";
                                com.facebook.ads.redexgen.core.C2M.A02(strA0X, com.facebook.ads.redexgen.core.AbstractC0825Le.A00(A02(140, 6, 10)));
                            }
                        }
                        this.A0A.A09().AA6(A6r(), map2);
                        com.facebook.ads.redexgen.core.C0805Kh.A00(this.A0A).A0E(com.facebook.ads.internal.protocol.AdPlacementType.NATIVE.toString(), A6r());
                        if (A0T()) {
                            A06(map, map2);
                        } else {
                            zA0U = A0U();
                            if (A0D[2].length() == 9) {
                                A0D[2] = "BGAjHSzJz";
                                if (zA0U) {
                                    A06(map, map2);
                                }
                            }
                        }
                        this.A08 = true;
                        return;
                    }
                    if (A0T()) {
                        zA0U = A0U();
                        if (A0D[2].length() == 9) {
                            A0D[2] = "BGAjHSzJz";
                            if (zA0U) {
                                A06(map, map2);
                            }
                        }
                    } else {
                        A06(map, map2);
                    }
                    this.A08 = true;
                    return;
                }
            } else {
                map2 = new java.util.HashMap();
                if (map != null) {
                    map2.putAll(map);
                }
                if (this.A01.A0e()) {
                    map2.put(A02(87, 7, 45), java.lang.String.valueOf(A0E().A04()));
                    map2.put(A02(80, 7, 86), java.lang.String.valueOf(A0E().A03()));
                }
                if (android.text.TextUtils.isEmpty(A6r())) {
                    if (!this.A01.A0e()) {
                        this.A0A.A0E().A36();
                        strA0X = this.A01.A0X();
                        strArr = A0D;
                        if (strArr[1].charAt(25) == strArr[3].charAt(25)) {
                            java.lang.String[] strArr3 = A0D;
                            strArr3[1] = "Q8Us8dZOubCsANiQB8YQBmsKLdjgWIPJ";
                            strArr3[3] = "Pg8pQUM49Vm5a0t7ebabBeivyd2Kgjff";
                            com.facebook.ads.redexgen.core.C2M.A02(strA0X, com.facebook.ads.redexgen.core.AbstractC0825Le.A00(A02(140, 6, 10)));
                        }
                    }
                    this.A0A.A09().AA6(A6r(), map2);
                    com.facebook.ads.redexgen.core.C0805Kh.A00(this.A0A).A0E(com.facebook.ads.internal.protocol.AdPlacementType.NATIVE.toString(), A6r());
                    if (A0T()) {
                        zA0U = A0U();
                        if (A0D[2].length() == 9) {
                            A0D[2] = "BGAjHSzJz";
                            if (zA0U) {
                                A06(map, map2);
                            }
                        }
                    } else {
                        A06(map, map2);
                    }
                    this.A08 = true;
                    return;
                }
                if (A0T()) {
                    zA0U = A0U();
                    if (A0D[2].length() == 9) {
                        A0D[2] = "BGAjHSzJz";
                        if (zA0U) {
                            A06(map, map2);
                        }
                    }
                } else {
                    A06(map, map2);
                }
                this.A08 = true;
                return;
            }
            throw new java.lang.RuntimeException();
        }
    }

    public final boolean A0P() {
        return true;
    }

    public final boolean A0Q() {
        return A0R() && this.A01.A0B() != null;
    }

    public final boolean A0R() {
        return this.A06 && this.A07;
    }

    public final boolean A0S() {
        return this.A01.A0d();
    }

    public final boolean A0T() {
        return com.facebook.ads.redexgen.core.C0762Im.A1R(this.A0A) && A0R() && this.A01.A0f();
    }

    public final boolean A0U() {
        return com.facebook.ads.redexgen.core.C0762Im.A1R(this.A0A) && A0R() && this.A01.A0g();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03280k
    public final java.lang.String A6r() {
        return this.A01.A6r();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03280k
    public final java.util.Collection<java.lang.String> A7B() {
        return A0E().A7B();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03280k
    public final com.facebook.ads.redexgen.core.EnumC03270j A7c() {
        return A0E().A7c();
    }

    public com.facebook.ads.internal.protocol.AdPlacementType A82() {
        return com.facebook.ads.internal.protocol.AdPlacementType.NATIVE;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03320p
    public final boolean AH5() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03320p
    public final void onDestroy() {
        if (this.A03 != null) {
            com.facebook.ads.redexgen.core.AnonymousClass15 anonymousClass15 = this.A03;
            java.lang.String[] strArr = A0D;
            if (strArr[4].charAt(16) != strArr[6].charAt(16)) {
                throw new java.lang.RuntimeException();
            }
            A0D[7] = "xLZjaQWgus";
            anonymousClass15.A03();
        }
    }
}
