package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC04344o {
    public static byte[] A0I;
    public static java.lang.String[] A0J = {"xyZ8yvYzp3wrHAf7Yx6bEToOMuLBTkeJ", "zRc0P2oS", "sxpemPSbJ0zjH5L170Fpc8WIJnMfTOYM", "JLvxwq6R3Maitb0M5MelMbaPMbiMlz5H", "qno0WD9sdyP92Tf9SwtsGsNlEh6m7cws", "isTf1gingqqcw8OSNjwv80foOygzMJYI", "cYtNYfyLYrQzxoivZChv", "OeXF3cqFYKXlQ2ABbzPAkdUOYZHirWRh"};
    public int A00;
    public com.facebook.ads.redexgen.core.C4C A01;
    public com.facebook.ads.redexgen.core.AnonymousClass51 A02;
    public com.facebook.ads.redexgen.core.FL A03;
    public boolean A08;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public final com.facebook.ads.redexgen.core.AnonymousClass59 A0G = new com.facebook.ads.redexgen.core.C1253al(this);
    public final com.facebook.ads.redexgen.core.AnonymousClass59 A0H = new com.facebook.ads.redexgen.core.C1252ak(this);
    public com.facebook.ads.redexgen.core.C5B A04 = new com.facebook.ads.redexgen.core.C5B(this.A0G);
    public com.facebook.ads.redexgen.core.C5B A05 = new com.facebook.ads.redexgen.core.C5B(this.A0H);
    public boolean A09 = false;
    public boolean A07 = false;
    public boolean A06 = false;
    public boolean A0F = true;
    public boolean A0E = true;

    public static java.lang.String A07(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0I, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 20);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A08() {
        A0I = new byte[]{99, -122, -122, -121, -122, 66, 120, -117, -121, -103, 66, -118, -125, -107, 66, 116, -121, -123, -101, -123, -114, -121, -108, 120, -117, -121, -103, 66, -125, -107, 66, -110, -125, -108, -121, -112, -106, 66, -124, -105, -106, 66, -104, -117, -121, -103, 66, -117, -107, 66, -112, -111, -106, 66, -125, 66, -108, -121, -125, -114, 66, -123, -118, -117, -114, -122, 80, 66, 119, -112, -120, -117, -114, -106, -121, -108, -121, -122, 66, -117, -112, -122, -121, -102, 92, -88, -58, -45, -45, -44, -39, -123, -46, -44, -37, -54, -123, -58, -123, -56, -51, -50, -47, -55, -123, -53, -41, -44, -46, -123, -45, -44, -45, -110, -54, -35, -50, -40, -39, -50, -45, -52, -123, -50, -45, -55, -54, -35, -97};
    }

    public abstract int A1d(int i, com.facebook.ads.redexgen.core.C04414w c04414w, com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53);

    public abstract int A1e(int i, com.facebook.ads.redexgen.core.C04414w c04414w, com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53);

    public abstract int A1f(com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53);

    public abstract int A1g(com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53);

    public abstract int A1h(com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53);

    public abstract int A1i(com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53);

    public abstract int A1j(com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53);

    public abstract int A1k(com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53);

    public abstract android.os.Parcelable A1l();

    public abstract android.view.View A1n(android.view.View view, int i, com.facebook.ads.redexgen.core.C04414w c04414w, com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53);

    public abstract com.facebook.ads.redexgen.core.C04354p A1o();

    public abstract void A1p(int i);

    public abstract void A1q(int i, int i2, com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53, com.facebook.ads.redexgen.core.InterfaceC04324m interfaceC04324m);

    public abstract void A1r(int i, com.facebook.ads.redexgen.core.InterfaceC04324m interfaceC04324m);

    public abstract void A1s(android.os.Parcelable parcelable);

    public abstract void A1u(com.facebook.ads.redexgen.core.C04414w c04414w, com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53);

    public abstract void A1x(com.facebook.ads.redexgen.core.FL fl, com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53, int i);

    public abstract boolean A1z();

    public abstract boolean A20();

    public abstract boolean A21();

    public abstract boolean A22();

    static {
        A08();
    }

    public static int A00(int i, int i2, int i3) {
        int mode = android.view.View.MeasureSpec.getMode(i);
        int size = android.view.View.MeasureSpec.getSize(i);
        switch (mode) {
            case Integer.MIN_VALUE:
                int iMax = java.lang.Math.max(i2, i3);
                int size2 = A0J[1].length();
                if (size2 != 8) {
                    throw new java.lang.RuntimeException();
                }
                A0J[1] = "W1fJ2ceK";
                int mode2 = java.lang.Math.min(size, iMax);
                return mode2;
            case 1073741824:
                return size;
            default:
                int mode3 = java.lang.Math.max(i2, i3);
                return mode3;
        }
    }

    public static int A01(int i, int i2, int i3, int i4, boolean z) {
        int iMax = java.lang.Math.max(0, i - i3);
        int i5 = 0;
        int resultMode = 0;
        if (z) {
            if (i4 >= 0) {
                i5 = i4;
                resultMode = 1073741824;
            } else if (i4 == -1) {
                switch (i2) {
                    case Integer.MIN_VALUE:
                    case 1073741824:
                        i5 = iMax;
                        resultMode = i2;
                        break;
                    case 0:
                        i5 = 0;
                        resultMode = 0;
                        break;
                }
            } else if (i4 == -2) {
                i5 = 0;
                resultMode = 0;
            }
        } else if (i4 >= 0) {
            i5 = i4;
            resultMode = 1073741824;
        } else if (i4 == -1) {
            i5 = iMax;
            resultMode = i2;
        } else if (i4 == -2) {
            i5 = iMax;
            resultMode = (i2 == Integer.MIN_VALUE || i2 == 1073741824) ? Integer.MIN_VALUE : 0;
        }
        int size = android.view.View.MeasureSpec.makeMeasureSpec(i5, resultMode);
        return size;
    }

    private final int A02(android.view.View view) {
        return ((com.facebook.ads.redexgen.core.C04354p) view.getLayoutParams()).A03.bottom;
    }

    private final int A03(android.view.View view) {
        return ((com.facebook.ads.redexgen.core.C04354p) view.getLayoutParams()).A03.left;
    }

    private final int A04(android.view.View view) {
        return ((com.facebook.ads.redexgen.core.C04354p) view.getLayoutParams()).A03.right;
    }

    private final int A05(android.view.View view) {
        return ((com.facebook.ads.redexgen.core.C04354p) view.getLayoutParams()).A03.top;
    }

    private final int A06(com.facebook.ads.redexgen.core.C04414w c04414w, com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53) {
        return 0;
    }

    private final void A09(int i) {
        A0C(i, A0t(i));
    }

    private final void A0A(int i) {
        android.view.View child = A0t(i);
        if (child != null) {
            this.A01.A0D(i);
        }
    }

    private final void A0B(int i, int i2) {
        android.view.View view = A0t(i);
        if (view != null) {
            A09(i);
            A0E(view, i2);
            java.lang.String[] strArr = A0J;
            if (strArr[2].charAt(30) != strArr[5].charAt(30)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0J;
            strArr2[0] = "fev5lwy8caKDFGGcVLFTWETO5UF90dOq";
            strArr2[7] = "EDoCIrgXqzBYQTf4WlngJinORtzJmrfl";
            return;
        }
        throw new java.lang.IllegalArgumentException(A07(85, 44, 81) + i + this.A03.toString());
    }

    private void A0C(int i, android.view.View view) {
        this.A01.A0C(i);
    }

    private final void A0D(android.view.View view) {
        this.A01.A0F(view);
    }

    private final void A0E(android.view.View view, int i) {
        A0F(view, i, (com.facebook.ads.redexgen.core.C04354p) view.getLayoutParams());
    }

    private final void A0F(android.view.View view, int i, com.facebook.ads.redexgen.core.C04354p c04354p) {
        com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56A0F = com.facebook.ads.redexgen.core.FL.A0F(view);
        if (anonymousClass56A0F.A0a()) {
            this.A03.A0t.A09(anonymousClass56A0F);
        } else {
            this.A03.A0t.A0A(anonymousClass56A0F);
        }
        this.A01.A0H(view, i, c04354p, anonymousClass56A0F.A0a());
    }

    private void A0G(android.view.View view, int i, boolean z) {
        com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56A0F = com.facebook.ads.redexgen.core.FL.A0F(view);
        if (z || anonymousClass56A0F.A0a()) {
            this.A03.A0t.A09(anonymousClass56A0F);
        } else {
            this.A03.A0t.A0A(anonymousClass56A0F);
        }
        com.facebook.ads.redexgen.core.C04354p c04354p = (com.facebook.ads.redexgen.core.C04354p) view.getLayoutParams();
        if (anonymousClass56A0F.A0g() || anonymousClass56A0F.A0b()) {
            if (anonymousClass56A0F.A0b()) {
                anonymousClass56A0F.A0S();
            } else {
                anonymousClass56A0F.A0O();
            }
            this.A01.A0H(view, i, view.getLayoutParams(), false);
        } else {
            android.view.ViewParent parent = view.getParent();
            com.facebook.ads.redexgen.core.FL fl = this.A03;
            if (A0J[3].charAt(19) == 'k') {
                throw new java.lang.RuntimeException();
            }
            A0J[4] = "uqKRxBtg59XPGVJDkfwEUsBOgdJYSppJ";
            if (parent == fl) {
                int currentIndex = this.A01.A07(view);
                if (i == -1) {
                    i = this.A01.A05();
                }
                if (currentIndex != -1) {
                    if (currentIndex != i) {
                        this.A03.A06.A0B(currentIndex, i);
                    }
                } else {
                    throw new java.lang.IllegalStateException(A07(0, 85, 14) + this.A03.indexOfChild(view) + this.A03.A1H());
                }
            } else {
                this.A01.A0I(view, i, false);
                c04354p.A01 = true;
                com.facebook.ads.redexgen.core.AnonymousClass51 anonymousClass51 = this.A02;
                if (A0J[4].charAt(12) == 'v') {
                    throw new java.lang.RuntimeException();
                }
                A0J[6] = "si9YLNjLFs";
                if (anonymousClass51 != null && this.A02.A0F()) {
                    this.A02.A0C(view);
                }
            }
        }
        if (c04354p.A02) {
            android.view.View view2 = anonymousClass56A0F.A0H;
            if (A0J[1].length() != 8) {
                throw new java.lang.RuntimeException();
            }
            A0J[1] = "bg493IDm";
            view2.invalidate();
            c04354p.A02 = false;
        }
    }

    private final void A0H(android.view.View view, android.graphics.Rect rect) {
        com.facebook.ads.redexgen.core.FL.A0o(view, rect);
    }

    private void A0J(com.facebook.ads.redexgen.core.C04414w c04414w, int i, android.view.View view) {
        com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56A0F = com.facebook.ads.redexgen.core.FL.A0F(view);
        if (anonymousClass56A0F.A0f()) {
            return;
        }
        if (anonymousClass56A0F.A0Z()) {
            boolean zA0a = anonymousClass56A0F.A0a();
            if (A0J[3].charAt(19) == 'k') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0J;
            strArr[2] = "wfzQKDpvqCerNRZHLtQvgaB031c5C1YU";
            strArr[5] = "KgFz3HBRwd8cETJWtdM1PF8pjKUjBKYl";
            if (!zA0a && !this.A03.A04.A0A()) {
                A0A(i);
                c04414w.A0X(anonymousClass56A0F);
                return;
            }
        }
        A09(i);
        c04414w.A0S(view);
        this.A03.A0t.A0C(anonymousClass56A0F);
    }

    private final void A0K(com.facebook.ads.redexgen.core.C04414w c04414w, com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (this.A03 == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!this.A03.canScrollVertically(1) && !this.A03.canScrollVertically(-1) && !this.A03.canScrollHorizontally(-1) && !this.A03.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        if (this.A03.A04 != null) {
            accessibilityEvent.setItemCount(this.A03.A04.A0E());
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005b  */
    /* JADX WARN: Code duplicated, block: B:8:0x002d  */
    private final void A0L(com.facebook.ads.redexgen.core.C04414w c04414w, com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53, com.facebook.ads.redexgen.core.C04133s c04133s) {
        if (this.A03.canScrollVertically(-1)) {
            c04133s.A0N(8192);
            c04133s.A0R(true);
        } else {
            boolean zCanScrollHorizontally = this.A03.canScrollHorizontally(-1);
            if (A0J[3].charAt(19) == 'k') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0J;
            strArr[2] = "KDPDh71uiY9dw6lSrmH00w2HuhKAvOYl";
            strArr[5] = "F84YzGx02ov8ufnexIEGkhiaGhnINbYS";
            if (zCanScrollHorizontally) {
                c04133s.A0N(8192);
                c04133s.A0R(true);
            }
        }
        if (this.A03.canScrollVertically(1)) {
            c04133s.A0N(4096);
            c04133s.A0R(true);
        } else {
            com.facebook.ads.redexgen.core.FL fl = this.A03;
            if (A0J[3].charAt(19) != 'k') {
                A0J[6] = "8s5rDkFpP";
                if (fl.canScrollHorizontally(1)) {
                    c04133s.A0N(4096);
                    c04133s.A0R(true);
                }
            } else {
                java.lang.String[] strArr2 = A0J;
                strArr2[2] = "3WqpoC752q4h2Wya5fT3BPHdY3ZkhgYP";
                strArr2[5] = "HauWKBzmz4VUJQZuXSWVI1MWGOc6zBYt";
                if (fl.canScrollHorizontally(1)) {
                    c04133s.A0N(4096);
                    c04133s.A0R(true);
                }
            }
        }
        com.facebook.ads.redexgen.core.C04103p collectionInfo = com.facebook.ads.redexgen.core.C04103p.A00(A0r(c04414w, anonymousClass53), A0q(c04414w, anonymousClass53), A0P(c04414w, anonymousClass53), A06(c04414w, anonymousClass53));
        c04133s.A0P(collectionInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M(com.facebook.ads.redexgen.core.AnonymousClass51 anonymousClass51) {
        if (this.A02 == anonymousClass51) {
            this.A02 = null;
        }
    }

    private final boolean A0N() {
        return this.A02 != null && this.A02.A0F();
    }

    public static boolean A0O(int i, int i2, int i3) {
        int mode = android.view.View.MeasureSpec.getMode(i2);
        int size = android.view.View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        switch (mode) {
            case Integer.MIN_VALUE:
                return size >= i;
            case 0:
                return true;
            case 1073741824:
                return size == i;
            default:
                return false;
        }
    }

    private final boolean A0P(com.facebook.ads.redexgen.core.C04414w c04414w, com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53) {
        return false;
    }

    private final boolean A0Q(com.facebook.ads.redexgen.core.C04414w c04414w, com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53, int i, android.os.Bundle bundle) {
        if (this.A03 == null) {
            return false;
        }
        int hScroll = 0;
        int i2 = 0;
        switch (i) {
            case 4096:
                if (this.A03.canScrollVertically(1)) {
                    int hScroll2 = A0X();
                    int vScroll = A0g();
                    int hScroll3 = hScroll2 - vScroll;
                    int vScroll2 = A0d();
                    hScroll = hScroll3 - vScroll2;
                }
                if (this.A03.canScrollHorizontally(1)) {
                    int iA0h = A0h();
                    int vScroll3 = A0e();
                    int i3 = iA0h - vScroll3;
                    int vScroll4 = A0f();
                    i2 = i3 - vScroll4;
                }
                break;
            case 8192:
                if (this.A03.canScrollVertically(-1)) {
                    int hScroll4 = A0X();
                    int vScroll5 = A0g();
                    int hScroll5 = hScroll4 - vScroll5;
                    int vScroll6 = A0d();
                    hScroll = -(hScroll5 - vScroll6);
                }
                if (this.A03.canScrollHorizontally(-1)) {
                    int iA0h2 = A0h();
                    int vScroll7 = A0e();
                    int i4 = iA0h2 - vScroll7;
                    int vScroll8 = A0f();
                    i2 = -(i4 - vScroll8);
                }
                break;
        }
        if (hScroll == 0 && i2 == 0) {
            return false;
        }
        this.A03.scrollBy(i2, hScroll);
        return true;
    }

    private final boolean A0R(com.facebook.ads.redexgen.core.C04414w c04414w, com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53, android.view.View view, int i, android.os.Bundle bundle) {
        return false;
    }

    private boolean A0S(com.facebook.ads.redexgen.core.FL fl, int i, int i2) {
        android.view.View focusedChild = fl.getFocusedChild();
        if (focusedChild == null) {
            return false;
        }
        int parentBottom = A0e();
        int parentRight = A0g();
        int parentTop = A0h();
        int parentTop2 = parentTop - A0f();
        int parentLeft = A0X();
        int parentLeft2 = parentLeft - A0d();
        android.graphics.Rect rect = this.A03.A0p;
        A0H(focusedChild, rect);
        if (rect.left - i >= parentTop2 || rect.right - i <= parentBottom || rect.top - i2 >= parentLeft2 || rect.bottom - i2 <= parentRight) {
            return false;
        }
        return true;
    }

    @java.lang.Deprecated
    private final boolean A0T(com.facebook.ads.redexgen.core.FL fl, android.view.View view, android.view.View view2) {
        return A0N() || fl.A1q();
    }

    private int[] A0U(android.view.View view, android.graphics.Rect rect) {
        int[] iArr = new int[2];
        int offScreenRight = A0e();
        int offScreenTop = A0g();
        int dy = A0h() - A0f();
        int offScreenLeft = A0X() - A0d();
        int childBottom = (view.getLeft() + rect.left) - view.getScrollX();
        int childRight = (view.getTop() + rect.top) - view.getScrollY();
        int childLeft = rect.width() + childBottom;
        int parentLeft = rect.height();
        int parentBottom = java.lang.Math.min(0, childBottom - offScreenRight);
        int parentRight = java.lang.Math.min(0, childRight - offScreenTop);
        int parentTop = java.lang.Math.max(0, childLeft - dy);
        int parentLeft2 = java.lang.Math.max(0, (parentLeft + childRight) - offScreenLeft);
        if (A0a() == 1) {
            if (parentTop == 0) {
                parentTop = java.lang.Math.max(parentBottom, childLeft - dy);
            }
        } else {
            parentTop = parentBottom != 0 ? parentBottom : java.lang.Math.min(childBottom - offScreenRight, parentTop);
        }
        if (parentRight == 0) {
            parentRight = java.lang.Math.min(childRight - offScreenTop, parentLeft2);
        }
        iArr[0] = parentTop;
        iArr[1] = parentRight;
        return iArr;
    }

    public final int A0V() {
        return -1;
    }

    public final int A0W() {
        if (this.A01 != null) {
            return this.A01.A05();
        }
        return 0;
    }

    public final int A0X() {
        return this.A0A;
    }

    public final int A0Y() {
        return this.A0B;
    }

    public final int A0Z() {
        com.facebook.ads.redexgen.core.AbstractC04224c a2;
        if (this.A03 != null) {
            com.facebook.ads.redexgen.core.FL fl = this.A03;
            if (A0J[3].charAt(19) == 'k') {
                throw new java.lang.RuntimeException();
            }
            A0J[4] = "NhHtbEzlhB3n2IblVpNcmlHtdyAdrFMd";
            a2 = fl.getAdapter();
        } else {
            a2 = null;
        }
        if (a2 != null) {
            return a2.A0E();
        }
        return 0;
    }

    public final int A0a() {
        return com.facebook.ads.redexgen.core.C3T.A01(this.A03);
    }

    public final int A0b() {
        return com.facebook.ads.redexgen.core.C3T.A02(this.A03);
    }

    public final int A0c() {
        return com.facebook.ads.redexgen.core.C3T.A03(this.A03);
    }

    public final int A0d() {
        if (this.A03 != null) {
            return this.A03.getPaddingBottom();
        }
        return 0;
    }

    public final int A0e() {
        if (this.A03 != null) {
            return this.A03.getPaddingLeft();
        }
        return 0;
    }

    public final int A0f() {
        if (this.A03 != null) {
            return this.A03.getPaddingRight();
        }
        return 0;
    }

    public final int A0g() {
        if (this.A03 != null) {
            return this.A03.getPaddingTop();
        }
        return 0;
    }

    public final int A0h() {
        return this.A0C;
    }

    public final int A0i() {
        return this.A0D;
    }

    public final int A0j(android.view.View view) {
        return view.getBottom() + A02(view);
    }

    public final int A0k(android.view.View view) {
        return view.getLeft() - A03(view);
    }

    public final int A0l(android.view.View view) {
        android.graphics.Rect rect = ((com.facebook.ads.redexgen.core.C04354p) view.getLayoutParams()).A03;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public final int A0m(android.view.View view) {
        android.graphics.Rect rect = ((com.facebook.ads.redexgen.core.C04354p) view.getLayoutParams()).A03;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public final int A0n(android.view.View view) {
        return view.getRight() + A04(view);
    }

    public final int A0o(android.view.View view) {
        return view.getTop() - A05(view);
    }

    public final int A0p(android.view.View view) {
        return ((com.facebook.ads.redexgen.core.C04354p) view.getLayoutParams()).A00();
    }

    public int A0q(com.facebook.ads.redexgen.core.C04414w c04414w, com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53) {
        if (this.A03 == null || this.A03.A04 == null || !A20()) {
            return 1;
        }
        return this.A03.A04.A0E();
    }

    public int A0r(com.facebook.ads.redexgen.core.C04414w c04414w, com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53) {
        if (this.A03 == null || this.A03.A04 == null || !A21()) {
            return 1;
        }
        return this.A03.A04.A0E();
    }

    public final android.view.View A0s() {
        android.view.View focusedChild;
        if (this.A03 == null || (focusedChild = this.A03.getFocusedChild()) == null || this.A01.A0K(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    public final android.view.View A0t(int i) {
        if (this.A01 != null) {
            return this.A01.A09(i);
        }
        return null;
    }

    public final android.view.View A0u(android.view.View view, int i) {
        return null;
    }

    public com.facebook.ads.redexgen.core.C04354p A0v(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new com.facebook.ads.redexgen.core.C04354p(context, attributeSet);
    }

    public com.facebook.ads.redexgen.core.C04354p A0w(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof com.facebook.ads.redexgen.core.C04354p) {
            return new com.facebook.ads.redexgen.core.C04354p((com.facebook.ads.redexgen.core.C04354p) layoutParams);
        }
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            return new com.facebook.ads.redexgen.core.C04354p((android.view.ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new com.facebook.ads.redexgen.core.C04354p(layoutParams);
    }

    public final void A0x() {
        if (this.A02 != null) {
            this.A02.A09();
        }
    }

    public final void A0y() {
        if (this.A03 != null) {
            this.A03.requestLayout();
        }
    }

    public final void A0z(int i) {
        if (this.A03 != null) {
            this.A03.A1T(i);
        }
    }

    public final void A10(int i) {
        if (this.A03 != null) {
            this.A03.A1U(i);
        }
    }

    public final void A11(int i, int i2) {
        this.A0C = android.view.View.MeasureSpec.getSize(i);
        this.A0D = android.view.View.MeasureSpec.getMode(i);
        if (this.A0D == 0 && !com.facebook.ads.redexgen.core.FL.A1B) {
            this.A0C = 0;
        }
        this.A0A = android.view.View.MeasureSpec.getSize(i2);
        this.A0B = android.view.View.MeasureSpec.getMode(i2);
        if (this.A0B == 0 && !com.facebook.ads.redexgen.core.FL.A1B) {
            this.A0A = 0;
        }
    }

    public final void A12(int i, int i2) {
        int iA0W = A0W();
        if (iA0W == 0) {
            this.A03.A1a(i, i2);
            java.lang.String[] strArr = A0J;
            java.lang.String str = strArr[2];
            java.lang.String str2 = strArr[5];
            int iCharAt = str.charAt(30);
            int count = str2.charAt(30);
            if (iCharAt != count) {
                throw new java.lang.RuntimeException();
            }
            A0J[1] = "XwkGDyjU";
            return;
        }
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;
        int maxX = Integer.MIN_VALUE;
        for (int i5 = 0; i5 < iA0W; i5++) {
            android.view.View viewA0t = A0t(i5);
            android.graphics.Rect rect = this.A03.A0p;
            A0H(viewA0t, rect);
            int count2 = rect.left;
            if (count2 < i3) {
                i3 = rect.left;
            }
            int count3 = rect.right;
            if (count3 > maxY) {
                maxY = rect.right;
            }
            int count4 = rect.top;
            if (count4 < i4) {
                i4 = rect.top;
            }
            int count5 = rect.bottom;
            if (count5 > maxX) {
                maxX = rect.bottom;
            }
        }
        this.A03.A0p.set(i3, i4, maxY, maxX);
        A15(this.A03.A0p, i, i2);
    }

    public final void A13(int i, int i2) {
        this.A03.setMeasuredDimension(i, i2);
    }

    public final void A14(int i, com.facebook.ads.redexgen.core.C04414w c04414w) {
        android.view.View view = A0t(i);
        A0A(i);
        c04414w.A0T(view);
    }

    public void A15(android.graphics.Rect rect, int i, int i2) {
        int usedHeight = rect.width() + A0e() + A0f();
        int iHeight = rect.height();
        int usedWidth = A0g();
        int i3 = iHeight + usedWidth;
        int usedWidth2 = A0d();
        int width = i3 + usedWidth2;
        int usedWidth3 = A0c();
        int usedHeight2 = A00(i, usedHeight, usedWidth3);
        int usedWidth4 = A0b();
        A13(usedHeight2, A00(i2, width, usedWidth4));
    }

    public final void A16(android.view.View view) {
        A18(view, -1);
    }

    public final void A17(android.view.View view) {
        A19(view, -1);
    }

    public final void A18(android.view.View view, int i) {
        A0G(view, i, true);
    }

    public final void A19(android.view.View view, int i) {
        A0G(view, i, false);
    }

    public final void A1A(android.view.View view, int i, int i2) {
        com.facebook.ads.redexgen.core.C04354p c04354p = (com.facebook.ads.redexgen.core.C04354p) view.getLayoutParams();
        android.graphics.Rect rectA1D = this.A03.A1D(view);
        int i3 = i + rectA1D.left + rectA1D.right;
        int i4 = i2 + rectA1D.top + rectA1D.bottom;
        int iA01 = A01(A0h(), A0i(), A0e() + A0f() + c04354p.leftMargin + c04354p.rightMargin + i3, c04354p.width, A20());
        int iA0X = A0X();
        int iA0Y = A0Y();
        int widthSpec = A0g();
        int iA02 = A01(iA0X, iA0Y, widthSpec + A0d() + c04354p.topMargin + c04354p.bottomMargin + i4, c04354p.height, A21());
        if (A1W(view, iA01, iA02, c04354p)) {
            view.measure(iA01, iA02);
        }
    }

    public final void A1B(android.view.View view, int i, int i2, int i3, int i4) {
        com.facebook.ads.redexgen.core.C04354p c04354p = (com.facebook.ads.redexgen.core.C04354p) view.getLayoutParams();
        android.graphics.Rect rect = c04354p.A03;
        view.layout(rect.left + i + c04354p.leftMargin, rect.top + i2 + c04354p.topMargin, (i3 - rect.right) - c04354p.rightMargin, (i4 - rect.bottom) - c04354p.bottomMargin);
    }

    public final void A1C(android.view.View view, com.facebook.ads.redexgen.core.C04133s c04133s) {
        com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56A0F = com.facebook.ads.redexgen.core.FL.A0F(view);
        if (anonymousClass56A0F != null) {
            boolean zA0a = anonymousClass56A0F.A0a();
            if (A0J[4].charAt(12) == 'v') {
                throw new java.lang.RuntimeException();
            }
            A0J[1] = "uJMRqraa";
            if (!zA0a && !this.A01.A0K(anonymousClass56A0F.A0H)) {
                A1K(this.A03.A0r, this.A03.A0s, view, c04133s);
            }
        }
    }

    public final void A1D(android.view.View view, com.facebook.ads.redexgen.core.C04414w c04414w) {
        A0D(view);
        c04414w.A0T(view);
    }

    public final void A1E(android.view.View view, boolean z, android.graphics.Rect rect) {
        android.graphics.Matrix matrix;
        if (z) {
            android.graphics.Rect rect2 = ((com.facebook.ads.redexgen.core.C04354p) view.getLayoutParams()).A03;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        } else {
            rect.set(0, 0, view.getWidth(), view.getHeight());
        }
        com.facebook.ads.redexgen.core.FL fl = this.A03;
        java.lang.String[] strArr = A0J;
        if (strArr[0].charAt(23) != strArr[7].charAt(23)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0J;
        strArr2[0] = "0LJ8GvUexdNG1AG11Ii0XfPOyD5lBlCr";
        strArr2[7] = "NwYNIOYDHD2wNBVOHxFlNgVOQtOI4Jp5";
        if (fl != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            android.graphics.RectF rectF = this.A03.A0q;
            rectF.set(rect);
            matrix.mapRect(rectF);
            int iFloor = (int) java.lang.Math.floor(rectF.left);
            int iFloor2 = (int) java.lang.Math.floor(rectF.top);
            double d = rectF.right;
            if (A0J[6].length() == 15) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr3 = A0J;
            strArr3[0] = "AxZOVdXnwoPa2hByvRQIxFpOdsFmpigD";
            strArr3[7] = "eNbgBcin3tlOsNhY3b3xdMmObUbY1NrP";
            rect.set(iFloor, iFloor2, (int) java.lang.Math.ceil(d), (int) java.lang.Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final void A1F(com.facebook.ads.redexgen.core.C04133s c04133s) {
        A0L(this.A03.A0r, this.A03.A0s, c04133s);
    }

    public final void A1G(com.facebook.ads.redexgen.core.C04414w c04414w) {
        int iA0E = c04414w.A0E();
        for (int i = iA0E - 1; i >= 0; i--) {
            android.view.View viewA0F = c04414w.A0F(i);
            com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56A0F = com.facebook.ads.redexgen.core.FL.A0F(viewA0F);
            if (!anonymousClass56A0F.A0f()) {
                anonymousClass56A0F.A0X(false);
                if (anonymousClass56A0F.A0c()) {
                    this.A03.removeDetachedView(viewA0F, false);
                }
                if (this.A03.A05 != null) {
                    this.A03.A05.A0K(anonymousClass56A0F);
                }
                anonymousClass56A0F.A0X(true);
                c04414w.A0R(viewA0F);
            }
        }
        c04414w.A0L();
        if (iA0E > 0) {
            this.A03.invalidate();
        }
    }

    public final void A1H(com.facebook.ads.redexgen.core.C04414w c04414w) {
        int childCount = A0W();
        for (int i = childCount - 1; i >= 0; i--) {
            A0J(c04414w, i, A0t(i));
        }
    }

    public final void A1I(com.facebook.ads.redexgen.core.C04414w c04414w) {
        for (int iA0W = A0W() - 1; iA0W >= 0; iA0W--) {
            if (!com.facebook.ads.redexgen.core.FL.A0F(A0t(iA0W)).A0f()) {
                A14(iA0W, c04414w);
            }
        }
    }

    public void A1J(com.facebook.ads.redexgen.core.C04414w c04414w, com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53, int i, int i2) {
        this.A03.A1a(i, i2);
    }

    public void A1K(com.facebook.ads.redexgen.core.C04414w c04414w, com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53, android.view.View view, com.facebook.ads.redexgen.core.C04133s c04133s) {
        com.facebook.ads.redexgen.core.C04113q itemInfo = com.facebook.ads.redexgen.core.C04113q.A00(A21() ? A0p(view) : 0, 1, A20() ? A0p(view) : 0, 1, false, false);
        c04133s.A0Q(itemInfo);
    }

    public final void A1L(com.facebook.ads.redexgen.core.AnonymousClass51 anonymousClass51) {
        if (this.A02 != null) {
            com.facebook.ads.redexgen.core.AnonymousClass51 anonymousClass52 = this.A02;
            if (A0J[4].charAt(12) == 'v') {
                throw new java.lang.RuntimeException();
            }
            A0J[6] = com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_G;
            if (anonymousClass51 != anonymousClass52 && this.A02.A0F()) {
                com.facebook.ads.redexgen.core.AnonymousClass51 anonymousClass53 = this.A02;
                if (A0J[6].length() != 15) {
                    A0J[3] = "jdqDA9lv9LoPYcF6nkiuFYbBQf2p3Jna";
                    anonymousClass53.A09();
                } else {
                    java.lang.String[] strArr = A0J;
                    strArr[0] = "CfhUeeIqQu1BzHSX9SgRD70OnW7YoiZA";
                    strArr[7] = "rBLjTriW7e2LTgD4knhZEnVORkWVeovT";
                    anonymousClass53.A09();
                }
            }
        }
        this.A02 = anonymousClass51;
        this.A02.A0D(this.A03, this);
    }

    public void A1M(com.facebook.ads.redexgen.core.FL fl) {
    }

    public final void A1N(com.facebook.ads.redexgen.core.FL fl) {
        this.A07 = true;
    }

    public final void A1O(com.facebook.ads.redexgen.core.FL fl) {
        A11(android.view.View.MeasureSpec.makeMeasureSpec(fl.getWidth(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(fl.getHeight(), 1073741824));
    }

    public final void A1P(com.facebook.ads.redexgen.core.FL fl) {
        if (fl == null) {
            this.A03 = null;
            this.A01 = null;
            this.A0C = 0;
            this.A0A = 0;
        } else {
            this.A03 = fl;
            this.A01 = fl.A01;
            this.A0C = fl.getWidth();
            this.A0A = fl.getHeight();
        }
        this.A0D = 1073741824;
        this.A0B = 1073741824;
    }

    public final void A1Q(com.facebook.ads.redexgen.core.FL fl, com.facebook.ads.redexgen.core.C04414w c04414w) {
        this.A07 = false;
        A1w(fl, c04414w);
    }

    public final void A1R(boolean z) {
        this.A06 = z;
    }

    public final boolean A1S() {
        int iA0W = A0W();
        for (int i = 0; i < iA0W; i++) {
            android.view.ViewGroup.LayoutParams layoutParams = A0t(i).getLayoutParams();
            int childCount = layoutParams.width;
            if (childCount < 0) {
                int childCount2 = layoutParams.height;
                if (childCount2 < 0) {
                    return true;
                }
            }
        }
        if (A0J[4].charAt(12) == 'v') {
            throw new java.lang.RuntimeException();
        }
        A0J[3] = "WAOKNqtGQ8ovYE750tJA7vys4k4qcWl2";
        return false;
    }

    public final boolean A1T() {
        return this.A03 != null && this.A03.A0B;
    }

    public final boolean A1U() {
        return this.A0E;
    }

    public final boolean A1V(int i, android.os.Bundle bundle) {
        return A0Q(this.A03.A0r, this.A03.A0s, i, bundle);
    }

    public final boolean A1W(android.view.View view, int i, int i2, com.facebook.ads.redexgen.core.C04354p c04354p) {
        if (!view.isLayoutRequested()) {
            boolean z = this.A0F;
            java.lang.String[] strArr = A0J;
            if (strArr[0].charAt(23) != strArr[7].charAt(23)) {
                throw new java.lang.RuntimeException();
            }
            A0J[4] = "WuiXnf3Uz62WBJXd3E4QIRzbwyGUV3fL";
            if (z && A0O(view.getWidth(), i, c04354p.width) && A0O(view.getHeight(), i2, c04354p.height)) {
                return false;
            }
        }
        return true;
    }

    public final boolean A1X(android.view.View view, int i, android.os.Bundle bundle) {
        return A0R(this.A03.A0r, this.A03.A0s, view, i, bundle);
    }

    public boolean A1Y(com.facebook.ads.redexgen.core.C04354p c04354p) {
        return c04354p != null;
    }

    public final boolean A1Z(com.facebook.ads.redexgen.core.FL fl, android.view.View view, android.graphics.Rect rect, boolean z) {
        return A1a(fl, view, rect, z, false);
    }

    public final boolean A1a(com.facebook.ads.redexgen.core.FL fl, android.view.View view, android.graphics.Rect rect, boolean z, boolean z2) {
        int[] scrollAmount = A0U(view, rect);
        int i = scrollAmount[0];
        int i2 = scrollAmount[1];
        if ((z2 && !A0S(fl, i, i2)) || (i == 0 && i2 == 0)) {
            return false;
        }
        if (z) {
            fl.scrollBy(i, i2);
        } else {
            fl.A1c(i, i2);
        }
        return true;
    }

    public final boolean A1b(com.facebook.ads.redexgen.core.FL fl, com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53, android.view.View view, android.view.View view2) {
        return A0T(fl, view, view2);
    }

    public final boolean A1c(com.facebook.ads.redexgen.core.FL fl, java.util.ArrayList<android.view.View> views, int i, int i2) {
        return false;
    }

    public android.view.View A1m(int i) {
        int iA0W = A0W();
        for (int i2 = 0; i2 < iA0W; i2++) {
            android.view.View child = A0t(i2);
            com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56A0F = com.facebook.ads.redexgen.core.FL.A0F(child);
            if (anonymousClass56A0F != null) {
                int childCount = anonymousClass56A0F.A0I();
                if (childCount == i && !anonymousClass56A0F.A0f() && (this.A03.A0s.A07() || !anonymousClass56A0F.A0a())) {
                    return child;
                }
            }
        }
        return null;
    }

    public void A1t(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        A0K(this.A03.A0r, this.A03.A0s, accessibilityEvent);
    }

    public void A1v(com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53) {
    }

    public void A1w(com.facebook.ads.redexgen.core.FL fl, com.facebook.ads.redexgen.core.C04414w c04414w) {
    }

    public void A1y(java.lang.String str) {
        if (this.A03 != null) {
            this.A03.A1l(str);
        }
    }
}
