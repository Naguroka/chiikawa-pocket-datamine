package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5E, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C5E {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"TTkBeT", "dgqPpyxawDBTokVKz6usds7DGGljbLlG", "Om", "1", "lOfLhIubd0jJyTpTkNltmpZf14oHCLV9", "yX0qRkYxaN2cv8t3SuJSwpxSeia", "n9D4XHOOTGgVdLWa6Wuko3wZCERnKgc", "NKR9b6EIrIhl49GaATLNKeLdYiLud"};
    public final com.facebook.ads.redexgen.core.C1276bA<com.facebook.ads.redexgen.core.AnonymousClass56, com.facebook.ads.redexgen.core.C5C> A00 = new com.facebook.ads.redexgen.core.C1276bA<>();
    public final com.facebook.ads.redexgen.core.C03872s<com.facebook.ads.redexgen.core.AnonymousClass56> A01 = new com.facebook.ads.redexgen.core.C03872s<>();

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 13);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        byte[] bArr = {78, 118, 112, 119, 35, 115, 113, 108, 117, 106, 103, 102, 35, 101, 111, 98, 100, 35, 83, 81, 70, 35, 108, 113, 35, 83, 76, 80, 87};
        if (A03[1].charAt(27) != 'j') {
            throw new java.lang.RuntimeException();
        }
        A03[0] = "DMTuNl";
        A02 = bArr;
    }

    static {
        A02();
    }

    private com.facebook.ads.redexgen.core.C04294j A00(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56, int i) {
        com.facebook.ads.redexgen.core.C5C c5cA0B;
        com.facebook.ads.redexgen.core.C04294j info;
        int iA08 = this.A00.A08(anonymousClass56);
        if (iA08 >= 0 && (c5cA0B = this.A00.A0B(iA08)) != null) {
            int i2 = c5cA0B.A00;
            if (A03[2].length() != 2) {
                throw new java.lang.RuntimeException();
            }
            A03[2] = "6x";
            if ((i2 & i) != 0) {
                int index = i ^ (-1);
                c5cA0B.A00 &= index;
                if (i == 4) {
                    info = c5cA0B.A02;
                } else if (i == 8) {
                    info = c5cA0B.A01;
                } else {
                    throw new java.lang.IllegalArgumentException(A01(0, 29, 14));
                }
                int index2 = c5cA0B.A00;
                if ((index2 & 12) == 0) {
                    this.A00.A0A(iA08);
                    com.facebook.ads.redexgen.core.C5C.A02(c5cA0B);
                }
                return info;
            }
        }
        return null;
    }

    public final com.facebook.ads.redexgen.core.C04294j A03(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56) {
        return A00(anonymousClass56, 8);
    }

    public final com.facebook.ads.redexgen.core.C04294j A04(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56) {
        return A00(anonymousClass56, 4);
    }

    public final com.facebook.ads.redexgen.core.AnonymousClass56 A05(long j) {
        return this.A01.A08(j);
    }

    public final void A06() {
        this.A00.clear();
        this.A01.A09();
    }

    public final void A07() {
        com.facebook.ads.redexgen.core.C5C.A01();
    }

    public final void A08(long j, com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56) {
        this.A01.A0B(j, anonymousClass56);
    }

    public final void A09(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56) {
        com.facebook.ads.redexgen.core.C5C c5cA00 = this.A00.get(anonymousClass56);
        if (c5cA00 == null) {
            c5cA00 = com.facebook.ads.redexgen.core.C5C.A00();
            this.A00.put(anonymousClass56, c5cA00);
        }
        c5cA00.A00 |= 1;
    }

    public final void A0A(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56) {
        com.facebook.ads.redexgen.core.C5C c5c = this.A00.get(anonymousClass56);
        if (c5c == null) {
            return;
        }
        c5c.A00 &= -2;
    }

    public final void A0B(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56) {
        for (int iA06 = this.A01.A06() - 1; iA06 >= 0; iA06--) {
            if (anonymousClass56 == this.A01.A07(iA06)) {
                this.A01.A0A(iA06);
                break;
            }
        }
        com.facebook.ads.redexgen.core.C5C info = this.A00.remove(anonymousClass56);
        if (info != null) {
            com.facebook.ads.redexgen.core.C5C.A02(info);
        }
    }

    public final void A0C(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56) {
        A0A(anonymousClass56);
    }

    public final void A0D(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56, com.facebook.ads.redexgen.core.C04294j c04294j) {
        com.facebook.ads.redexgen.core.C5C c5cA00 = this.A00.get(anonymousClass56);
        if (c5cA00 == null) {
            c5cA00 = com.facebook.ads.redexgen.core.C5C.A00();
            this.A00.put(anonymousClass56, c5cA00);
        }
        c5cA00.A00 |= 2;
        c5cA00.A02 = c04294j;
    }

    public final void A0E(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56, com.facebook.ads.redexgen.core.C04294j c04294j) {
        com.facebook.ads.redexgen.core.C5C c5cA00 = this.A00.get(anonymousClass56);
        if (c5cA00 == null) {
            c5cA00 = com.facebook.ads.redexgen.core.C5C.A00();
            this.A00.put(anonymousClass56, c5cA00);
        }
        c5cA00.A01 = c04294j;
        c5cA00.A00 |= 8;
    }

    public final void A0F(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56, com.facebook.ads.redexgen.core.C04294j c04294j) {
        com.facebook.ads.redexgen.core.C5C c5cA00 = this.A00.get(anonymousClass56);
        if (c5cA00 == null) {
            c5cA00 = com.facebook.ads.redexgen.core.C5C.A00();
            this.A00.put(anonymousClass56, c5cA00);
        }
        c5cA00.A02 = c04294j;
        c5cA00.A00 |= 4;
    }

    public final void A0G(com.facebook.ads.redexgen.core.C5D c5d) {
        for (int size = this.A00.size() - 1; size >= 0; size--) {
            com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56A09 = this.A00.A09(size);
            com.facebook.ads.redexgen.core.C5C c5cA0A = this.A00.A0A(size);
            if ((c5cA0A.A00 & 3) == 3) {
                c5d.AHG(anonymousClass56A09);
            } else {
                int index = c5cA0A.A00;
                if ((index & 1) != 0) {
                    if (c5cA0A.A02 == null) {
                        c5d.AHG(anonymousClass56A09);
                    } else {
                        c5d.AEe(anonymousClass56A09, c5cA0A.A02, c5cA0A.A01);
                    }
                } else if ((c5cA0A.A00 & 14) == 14) {
                    c5d.AEc(anonymousClass56A09, c5cA0A.A02, c5cA0A.A01);
                } else if ((c5cA0A.A00 & 12) == 12) {
                    c5d.AEg(anonymousClass56A09, c5cA0A.A02, c5cA0A.A01);
                } else {
                    int index2 = c5cA0A.A00;
                    if ((index2 & 4) != 0) {
                        c5d.AEe(anonymousClass56A09, c5cA0A.A02, null);
                    } else {
                        int index3 = c5cA0A.A00;
                        if ((index3 & 8) != 0) {
                            com.facebook.ads.redexgen.core.C04294j c04294j = c5cA0A.A02;
                            if (A03[4].charAt(6) == 'y') {
                                throw new java.lang.RuntimeException();
                            }
                            A03[7] = "pRTOxDzzIVV0VuKMKqyuKOShfW9n8";
                            c5d.AEc(anonymousClass56A09, c04294j, c5cA0A.A01);
                        } else {
                            continue;
                        }
                    }
                }
            }
            com.facebook.ads.redexgen.core.C5C.A02(c5cA0A);
        }
    }

    public final boolean A0H(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56) {
        com.facebook.ads.redexgen.core.C5C record = this.A00.get(anonymousClass56);
        return (record == null || (record.A00 & 1) == 0) ? false : true;
    }

    public final boolean A0I(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56) {
        com.facebook.ads.redexgen.core.C5C record = this.A00.get(anonymousClass56);
        return (record == null || (record.A00 & 4) == 0) ? false : true;
    }
}
