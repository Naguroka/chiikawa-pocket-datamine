package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class TV extends com.facebook.ads.redexgen.core.AbstractC04394t {
    public static byte[] A0H;
    public static java.lang.String[] A0I = {"oHxG", "", "w7XeyG7wcXlBDThCLG4YobF5JePdGcu8", "IQ8LgqWvoXOpUTXgnww89j6rU6uuZ1nj", "", "WKMwHhIum9", "0nm7H4VWCUBWNiJwCQAonSVvBZFyt", "hLsDwSpuFLAE"};
    public com.facebook.ads.redexgen.core.PE A02;
    public com.facebook.ads.redexgen.core.C0987Rk A04;
    public java.util.List<com.facebook.ads.redexgen.core.QK> A05;
    public boolean A09;
    public final int A0A;
    public final android.content.Context A0B;
    public final com.facebook.ads.redexgen.core.C1261at A0C;
    public final com.facebook.ads.redexgen.core.AnonymousClass51 A0D;
    public final java.util.Set<java.lang.Integer> A0G = new java.util.HashSet();
    public boolean A08 = true;
    public boolean A06 = true;
    public boolean A07 = true;
    public int A01 = -1;
    public float A00 = 0.0f;
    public final com.facebook.ads.redexgen.core.PI A0F = new com.facebook.ads.redexgen.core.TY(this);
    public com.facebook.ads.redexgen.core.PG A03 = new com.facebook.ads.redexgen.core.TX(this);
    public final com.facebook.ads.redexgen.core.PH A0E = new com.facebook.ads.redexgen.core.TW(this);

    public static java.lang.String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0H, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 7);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A08() {
        java.lang.String[] strArr = A0I;
        if (strArr[0].length() == strArr[5].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0I;
        strArr2[7] = "Cbp585p0FHy9";
        strArr2[6] = "QC7w158vCCR5KGktiGCBodiqPhNZq";
        A0H = new byte[]{-122, -102, -103, -108, -92, -107, -111, -122, -98, -92, -118, -109, -122, -121, -111, -118, -119, -92, -107, -122, -105, -122, -110, 81, 91, 103, 78, 81, 90, 91, 92, 103, 94, 81, 76, 77, 87, 103, 88, 73, 90, 73, 85, -51, -58, -61, -52, -60, -68, -42, -61, -68, -51, -68, -61, -42, -57, -72, -55, -72, -60};
    }

    static {
        A08();
    }

    public TV(com.facebook.ads.redexgen.core.C04123r c04123r, int i, java.util.List<com.facebook.ads.redexgen.core.QK> list, com.facebook.ads.redexgen.core.C0987Rk c0987Rk, android.os.Bundle bundle) {
        this.A0C = c04123r.getLayoutManager();
        this.A0A = i;
        this.A05 = list;
        this.A04 = c0987Rk;
        this.A0D = new com.facebook.ads.redexgen.core.C1260as(c04123r.getContext());
        this.A0B = c04123r.getContext();
        c04123r.A1f(this);
        A0D(bundle);
    }

    private com.facebook.ads.redexgen.core.UO A03(int i, int i2) {
        return A04(i, i2, true);
    }

    private com.facebook.ads.redexgen.core.UO A04(int i, int i2, boolean z) {
        com.facebook.ads.redexgen.core.UO uo = null;
        while (i <= i2) {
            com.facebook.ads.redexgen.core.UO uo2 = (com.facebook.ads.redexgen.core.UO) this.A0C.A1m(i);
            if (uo2 == null || uo2.A17()) {
                return null;
            }
            boolean zA0a = A0a(uo2);
            if (uo == null && uo2.A18() && zA0a && !this.A0G.contains(java.lang.Integer.valueOf(i)) && (!z || A0I(uo2, this.A0A))) {
                uo = uo2;
            }
            if (uo2.A18() && !zA0a) {
                A0C(i, false);
            }
            i++;
        }
        return uo;
    }

    private void A06() {
        if (!this.A07) {
            return;
        }
        int lastVisibleItem = this.A0C.A24();
        int firstVisibleItem = this.A0C.A25();
        com.facebook.ads.redexgen.core.UO uoA03 = A03(lastVisibleItem, firstVisibleItem);
        if (uoA03 != null) {
            uoA03.A15();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        int iA23 = this.A0C.A23();
        if (iA23 != -1) {
            int curPos = this.A05.size();
            if (iA23 < curPos - 1) {
                int curPos2 = iA23 + 1;
                A0U(curPos2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09(int i) {
        com.facebook.ads.redexgen.core.UO uoA04 = A04(i + 1, this.A0C.A25(), false);
        if (uoA04 != null) {
            uoA04.A15();
            A0U(((java.lang.Integer) uoA04.getTag(-1593835536)).intValue());
        }
    }

    private void A0A(int i, int i2) {
        while (i <= i2) {
            A0T(i);
            i++;
        }
    }

    private final void A0B(int i, int i2) {
        A0S(i);
        A0S(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(int i, boolean z) {
        if (z) {
            this.A0G.add(java.lang.Integer.valueOf(i));
        } else {
            this.A0G.remove(java.lang.Integer.valueOf(i));
        }
    }

    private void A0D(android.os.Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.A00 = bundle.getFloat(A05(43, 18, 112), 0.0f);
        this.A07 = bundle.getBoolean(A05(0, 23, 62), true);
        this.A08 = bundle.getBoolean(A05(23, 20, 1), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0H() {
        return this.A0A == 1;
    }

    public static boolean A0I(com.facebook.ads.redexgen.core.AbstractC0907Oi abstractC0907Oi, int i) {
        int allowedAreaMaxX;
        int furthestX;
        if (i == 2) {
            allowedAreaMaxX = com.facebook.ads.redexgen.core.LP.A03.widthPixels - 1;
        } else {
            int width = abstractC0907Oi.getWidth();
            int allowedAreaMinX = com.facebook.ads.redexgen.core.LP.A03.widthPixels;
            allowedAreaMaxX = (int) (((width + allowedAreaMinX) * 1.3f) / 2.0f);
        }
        if (i == 2) {
            furthestX = 1;
        } else {
            int i2 = com.facebook.ads.redexgen.core.LP.A03.widthPixels;
            int allowedAreaMinX2 = abstractC0907Oi.getWidth();
            furthestX = (int) (((i2 - allowedAreaMinX2) * 0.7f) / 2.0f);
        }
        float x = abstractC0907Oi.getX();
        int allowedAreaMinX3 = abstractC0907Oi.getWidth();
        return ((int) (x + ((float) allowedAreaMinX3))) <= allowedAreaMaxX && abstractC0907Oi.getX() >= ((float) furthestX);
    }

    private boolean A0J(com.facebook.ads.redexgen.core.UO uo) {
        if (!this.A08 || !uo.A18()) {
            return false;
        }
        this.A08 = false;
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04394t
    public void A0L(com.facebook.ads.redexgen.core.FL fl, int i) {
        super.A0L(fl, i);
        if (i == 0) {
            this.A09 = true;
            A06();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04394t
    public void A0M(com.facebook.ads.redexgen.core.FL fl, int i, int i2) {
        super.A0M(fl, i, i2);
        this.A09 = false;
        if (this.A06) {
            this.A09 = true;
            A06();
            this.A06 = false;
        }
        int lastVisibleItem = this.A0C.A24();
        int firstVisibleItem = this.A0C.A25();
        A0B(lastVisibleItem, firstVisibleItem);
        A0A(lastVisibleItem, firstVisibleItem);
        A0V(lastVisibleItem, firstVisibleItem, i);
    }

    public final com.facebook.ads.redexgen.core.PG A0N() {
        return this.A03;
    }

    public final com.facebook.ads.redexgen.core.PH A0O() {
        return this.A0E;
    }

    public final com.facebook.ads.redexgen.core.PI A0P() {
        return this.A0F;
    }

    public final void A0Q() {
        this.A01 = -1;
        int iA25 = this.A0C.A25();
        for (int iA24 = this.A0C.A24(); iA24 <= iA25 && iA24 >= 0; iA24++) {
            com.facebook.ads.redexgen.core.UO card = (com.facebook.ads.redexgen.core.UO) this.A0C.A1m(iA24);
            java.lang.String[] strArr = A0I;
            java.lang.String str = strArr[1];
            java.lang.String str2 = strArr[4];
            int lastPos = str.length();
            int firstPos = str2.length();
            if (lastPos != firstPos) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0I;
            strArr2[0] = "4n0r";
            strArr2[5] = "UAml839wpr";
            if (card != null && card.A17()) {
                this.A01 = iA24;
                card.A14();
                return;
            }
        }
    }

    public final void A0R() {
        com.facebook.ads.redexgen.core.UO uo = (com.facebook.ads.redexgen.core.UO) this.A0C.A1m(this.A01);
        if (uo != null && this.A01 >= 0) {
            uo.A15();
        }
    }

    public final void A0S(int i) {
        com.facebook.ads.redexgen.core.UO uo = (com.facebook.ads.redexgen.core.UO) this.A0C.A1m(i);
        if (uo != null && !A0a(uo)) {
            A0Z(uo, false);
        }
    }

    public final void A0T(int i) {
        com.facebook.ads.redexgen.core.UO uo = (com.facebook.ads.redexgen.core.UO) this.A0C.A1m(i);
        if (uo == null) {
            return;
        }
        if (A0a(uo)) {
            A0Z(uo, true);
        }
        if (A0J(uo) && this.A05 != null) {
            this.A0F.setVolume(this.A05.get(((java.lang.Integer) uo.getTag(-1593835536)).intValue()).A03().A0E().A09() ? 0.0f : 1.0f);
        }
    }

    public final void A0U(int i) {
        this.A0D.A0A(i);
        this.A0C.A1L(this.A0D);
    }

    public final void A0V(int i, int i2, int i3) {
        if (!A0H() || this.A02 == null) {
            return;
        }
        int recomputeFrom = this.A0C.A23();
        if (recomputeFrom == -1) {
            recomputeFrom = i3 < 0 ? i : i2;
        }
        this.A02.AHH(recomputeFrom);
    }

    public final void A0W(android.os.Bundle bundle) {
        bundle.putFloat(A05(43, 18, 112), this.A00);
        bundle.putBoolean(A05(0, 23, 62), this.A07);
        bundle.putBoolean(A05(23, 20, 1), this.A08);
    }

    public void A0X(android.view.View view, boolean z) {
        view.setAlpha(z ? 1.0f : 0.5f);
    }

    public final void A0Y(com.facebook.ads.redexgen.core.PE pe) {
        this.A02 = pe;
    }

    public void A0Z(com.facebook.ads.redexgen.core.UO uo, boolean z) {
        if (A0H()) {
            A0X(uo, z);
        }
        if (!z && uo.A17()) {
            uo.A14();
        }
    }

    public boolean A0a(android.view.View view) {
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getGlobalVisibleRect(rect);
        return ((float) rect.width()) / ((float) view.getWidth()) >= 0.15f;
    }
}
