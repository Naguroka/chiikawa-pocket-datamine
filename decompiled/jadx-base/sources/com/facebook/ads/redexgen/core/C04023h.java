package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C04023h extends android.view.ViewGroup {
    public static byte[] A0s;
    public static java.lang.String[] A0t = {"e0WzfCgg5XcVfGi", "ISw7K0NC0JjGKw3aqLZnEeCyQmnJarTP", "Hy7VicQaJFFlWaz3OdTjA4ZWS7Vff8v7", "WcFZxi67WO2ZtzqmgJX02c4dryVYoE5T", "rF0iooiSTOADQgiXw4j324HAbDkNAAle", "vgT88YiEWUZNicvmty9GpsXkAZSLF8rx", "LdGmA2eGd1B3SK0OmViQAh3pNWcZcixS", "9ZqOeGgvX4TfhHbWbTIbZxI4Pt81j06N"};
    public static final int[] A0u;
    public static final android.view.animation.Interpolator A0v;
    public static final com.facebook.ads.redexgen.core.C04013g A0w;
    public static final java.util.Comparator<com.facebook.ads.redexgen.core.C3Z> A0x;
    public int A00;
    public com.facebook.ads.redexgen.core.C3E A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public android.graphics.drawable.Drawable A0S;
    public android.os.Parcelable A0T;
    public android.view.VelocityTracker A0U;
    public android.widget.EdgeEffect A0V;
    public android.widget.EdgeEffect A0W;
    public android.widget.Scroller A0X;
    public com.facebook.ads.redexgen.core.InterfaceC03973c A0Y;
    public com.facebook.ads.redexgen.core.C03993e A0Z;
    public java.lang.ClassLoader A0a;
    public java.util.ArrayList<android.view.View> A0b;
    public java.util.List<com.facebook.ads.internal.androidx.support.v4.view.ViewPager.OnAdapterChangeListener> A0c;
    public java.util.List<com.facebook.ads.redexgen.core.InterfaceC03973c> A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public final android.graphics.Rect A0o;
    public final com.facebook.ads.redexgen.core.C3Z A0p;
    public final java.lang.Runnable A0q;
    public final java.util.ArrayList<com.facebook.ads.redexgen.core.C3Z> A0r;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private com.facebook.ads.redexgen.core.C3Z A03() {
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f = clientWidth > 0 ? this.A0M / clientWidth : 0.0f;
        int i = -1;
        float f2 = 0.0f;
        float f3 = 0.0f;
        boolean z = true;
        com.facebook.ads.redexgen.core.C3Z c3z = null;
        int i2 = 0;
        while (i2 < this.A0r.size()) {
            com.facebook.ads.redexgen.core.C3Z c3z2 = this.A0r.get(i2);
            if (!z && c3z2.A02 != i + 1) {
                c3z2 = this.A0p;
                c3z2.A00 = f2 + f3 + f;
                c3z2.A02 = i + 1;
                c3z2.A01 = this.A01.A00(c3z2.A02);
                i2--;
            }
            f2 = c3z2.A00;
            float f4 = c3z2.A01 + f2;
            java.lang.String[] strArr = A0t;
            if (strArr[4].charAt(21) != strArr[2].charAt(21)) {
                throw new java.lang.RuntimeException();
            }
            A0t[0] = "anv8UthCgv3bxkb";
            float f5 = f4 + f;
            if (!z && scrollX < f2) {
                return c3z;
            }
            if (scrollX < f5 || i2 == this.A0r.size() - 1) {
                return c3z2;
            }
            z = false;
            i = c3z2.A02;
            f3 = c3z2.A01;
            c3z = c3z2;
            i2++;
        }
        return c3z;
    }

    public static java.lang.String A08(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0s, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 113);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A0C() {
        A0s = new byte[]{-32, -3, -2, -32, -6, 42, 59, 65, okio.Utf8.REPLACEMENT_BYTE, 76, -6, kotlin.io.encoding.Base64.padSymbol, 70, 59, 77, 77, 20, -6, -88, -40, -23, -17, -19, -6, -88, -15, -20, -62, -88, 11, 59, 93, 90, 77, 87, 80, 88, 76, 95, 84, 78, 11, 76, 79, 76, 91, 95, 80, 93, 37, 11, -66, 18, 13, 13, -66, 17, 11, -1, 10, 10, -39, -66, 2, 3, 4, -1, 19, 10, 18, 7, 12, 5, -66, 18, 13, -66, 16, 4, 74, 83, 89, 82, 72, 30, 4, -49, -19, -6, -6, -5, 0, -84, -19, -16, -16, -84, -4, -19, -13, -15, -2, -84, -16, -15, -17, -5, -2, -84, 2, -11, -15, 3, -84, -16, 1, -2, -11, -6, -13, -84, -8, -19, 5, -5, 1, 0, kotlin.io.encoding.Base64.padSymbol, 80, 92, 96, 80, 94, 95, 80, 79, 11, 90, 81, 81, 94, 78, 93, 80, 80, 89, 11, 91, 76, 82, 80, 11, 87, 84, 88, 84, 95, 11, -57, -37, -40, -109, -44, -29, -29, -33, -36, -42, -44, -25, -36, -30, -31, -102, -26, -109, -61, -44, -38, -40, -27, -76, -41, -44, -29, -25, -40, -27, -109, -42, -37, -44, -31, -38, -40, -41, -109, -25, -37, -40, -109, -44, -41, -44, -29, -25, -40, -27, -102, -26, -109, -42, -30, -31, -25, -40, -31, -25, -26, -109, -22, -36, -25, -37, -30, -24, -25, -109, -42, -44, -33, -33, -36, -31, -38, -109, -61, -44, -38, -40, -27, -76, -41, -44, -29, -25, -40, -27, -106, -31, -30, -25, -36, -39, -20, -73, -44, -25, -44, -58, -40, -25, -74, -37, -44, -31, -38, -40, -41, -108, -109, -72, -21, -29, -40, -42, -25, -40, -41, -109, -44, -41, -44, -29, -25, -40, -27, -109, -36, -25, -40, -32, -109, -42, -30, -24, -31, -25, -83, -109, 16, 35, 31, 49, 10, 27, 33, 31, 44, -3, 14, 14, 11, 19, -17, -1, 14, 11, 8, 8, -68, 16, 14, 5, 1, 0, -68, 16, 11, -68, 2, 5, 10, 0, -68, 2, 11, -1, 17, 15, -68, -2, -3, 15, 1, 0, -68, 11, 10, -68, 10, 11, 10, -55, -1, 4, 5, 8, 0, -68, -1, 17, 14, 14, 1, 10, 16, -68, 2, 11, -1, 17, 15, 1, 0, -68, 18, 5, 1, 19, -68, 67, 66, 21, 56, 53, 68, 72, 57, 70, 23, 60, 53, 66, 59, 57, 56, 1, 0, -30, -13, -7, -9, -27, -11, 4, 1, -2, -2, -9, -10, -78, -10, -5, -10, -78, 0, 1, 6, -78, -11, -13, -2, -2, -78, 5, 7, 2, -9, 4, -11, -2, -13, 5, 5, -78, -5, -1, 2, -2, -9, -1, -9, 0, 6, -13, 6, -5, 1, 0, 96, 94, 77, 90, 95, 82, 91, 94, 89, 60, 77, 83, 81};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final void A0J(int i, int i2, int i3) {
        int scrollX;
        int iAbs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if ((this.A0X == null || this.A0X.isFinished()) ? false : true) {
            scrollX = this.A0j ? this.A0X.getCurrX() : this.A0X.getStartX();
            this.A0X.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int scrollY = getScrollY();
        int i4 = i - scrollX;
        if (A0t[6].charAt(18) == '5') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A0t;
        strArr[4] = "Z0LZClJ0au8nSBm1r5wZo4UlFxtb531d";
        strArr[2] = "ZltNMTIOlLDzNXpQzZy3241df7YiJdYF";
        int i5 = i2 - scrollY;
        if (i4 == 0 && i5 == 0) {
            A0R(false);
            A0f();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i6 = clientWidth / 2;
        float fA00 = i6 + (i6 * A00(java.lang.Math.min(1.0f, (java.lang.Math.abs(i4) * 1.0f) / clientWidth)));
        int iAbs2 = java.lang.Math.abs(i3);
        if (iAbs2 > 0) {
            iAbs = java.lang.Math.round(java.lang.Math.abs(fA00 / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) ((1.0f + (java.lang.Math.abs(i4) / (this.A0M + (clientWidth * this.A01.A00(this.A00))))) * 100.0f);
        }
        int iMin = java.lang.Math.min(iAbs, 600);
        this.A0j = false;
        this.A0X.startScroll(scrollX, scrollY, i4, i5, iMin);
        com.facebook.ads.redexgen.core.C3T.A07(this);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(java.util.ArrayList<android.view.View> arrayList) {
        com.facebook.ads.redexgen.core.C3Z c3zA07;
        for (int i = 0; i < getChildCount(); i++) {
            android.view.View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (c3zA07 = A07(childAt)) != null && c3zA07.A02 == this.A00) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0092  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        com.facebook.ads.redexgen.core.C03953a c03953a;
        com.facebook.ads.redexgen.core.C03953a c03953a2;
        boolean z;
        int i3;
        int i4;
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.A0I = java.lang.Math.min(measuredWidth / 10, this.A0E);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            android.view.View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8 && (c03953a2 = (com.facebook.ads.redexgen.core.C03953a) childAt.getLayoutParams()) != null && c03953a2.A05) {
                int i6 = c03953a2.A04 & 7;
                int i7 = c03953a2.A04 & 112;
                int i8 = Integer.MIN_VALUE;
                int i9 = Integer.MIN_VALUE;
                boolean z2 = i7 == 48 || i7 == 80;
                if (i6 == 3) {
                    z = true;
                } else {
                    if (A0t[0].length() != 15) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr = A0t;
                    strArr[1] = "9a0FyoC52B3yBXBi2GxtutV5LsdNQe1M";
                    strArr[7] = "xl5cJkQWQfSP6Zwlt45arSi0METJpEUG";
                    if (i6 == 5) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (z2) {
                    i8 = 1073741824;
                } else if (z) {
                    i9 = 1073741824;
                }
                if (c03953a2.width != -2) {
                    i8 = 1073741824;
                    i3 = c03953a2.width != -1 ? c03953a2.width : paddingLeft;
                } else {
                    i3 = paddingLeft;
                }
                if (c03953a2.height != -2) {
                    i9 = 1073741824;
                    i4 = c03953a2.height != -1 ? c03953a2.height : measuredHeight;
                } else {
                    i4 = measuredHeight;
                }
                childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(i3, i8), android.view.View.MeasureSpec.makeMeasureSpec(i4, i9));
                if (z2) {
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    if (A0t[0].length() != 15) {
                        measuredHeight -= measuredHeight2;
                    } else {
                        A0t[6] = "EqasZ8zwVhCwMRvet1jUrx6TZdyGyQkK";
                        measuredHeight -= measuredHeight2;
                    }
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
        }
        this.A0B = android.view.View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.A0A = android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.A0h = true;
        A0f();
        this.A0h = false;
        int childCount2 = getChildCount();
        for (int i10 = 0; i10 < childCount2; i10++) {
            android.view.View childAt2 = getChildAt(i10);
            if (childAt2.getVisibility() != 8 && ((c03953a = (com.facebook.ads.redexgen.core.C03953a) childAt2.getLayoutParams()) == null || !c03953a.A05)) {
                childAt2.measure(android.view.View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * c03953a.A00), 1073741824), this.A0A);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x0164 A[PHI: r1 r2 r5
  0x0164: PHI (r1v14 float) = (r1v13 float), (r1v25 float) binds: [B:56:0x01c3, B:44:0x0162] A[DONT_GENERATE, DONT_INLINE]
  0x0164: PHI (r2v11 float) = (r2v10 float), (r2v16 float) binds: [B:56:0x01c3, B:44:0x0162] A[DONT_GENERATE, DONT_INLINE]
  0x0164: PHI (r5v4 float) = (r5v3 float), (r5v5 float) binds: [B:56:0x01c3, B:44:0x0162] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x0168  */
    /* JADX WARN: Code duplicated, block: B:49:0x0175  */
    /* JADX WARN: Code duplicated, block: B:54:0x0199  */
    /* JADX WARN: Code duplicated, block: B:58:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:60:0x01de  */
    /* JADX WARN: Code duplicated, block: B:63:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:65:0x01f6  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        float fAbs;
        float y;
        float fAbs2;
        float f;
        java.lang.String[] strArr;
        android.view.ViewParent parent;
        if (this.A0f) {
            return true;
        }
        if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            return false;
        }
        com.facebook.ads.redexgen.core.C3E c3e = this.A01;
        java.lang.String[] strArr2 = A0t;
        if (strArr2[1].charAt(20) != strArr2[7].charAt(20)) {
            A0t[0] = "LvXhlgkzmvNssd6";
            if (c3e == null || this.A01.A01() == 0) {
                return false;
            }
            if (this.A0U == null) {
                this.A0U = android.view.VelocityTracker.obtain();
            }
            this.A0U.addMovement(motionEvent);
            boolean zA0U = false;
            switch (motionEvent.getAction() & 255) {
                case 0:
                    this.A0X.abortAnimation();
                    this.A0m = false;
                    A0f();
                    float x = motionEvent.getX();
                    this.A03 = x;
                    this.A05 = x;
                    float y2 = motionEvent.getY();
                    this.A04 = y2;
                    this.A06 = y2;
                    this.A08 = motionEvent.getPointerId(0);
                    if (zA0U) {
                        com.facebook.ads.redexgen.core.C3T.A07(this);
                    }
                    return true;
                case 1:
                    if (this.A0i) {
                        android.view.VelocityTracker velocityTracker = this.A0U;
                        velocityTracker.computeCurrentVelocity(1000, this.A0J);
                        int xVelocity = (int) velocityTracker.getXVelocity(this.A08);
                        this.A0m = true;
                        int clientWidth = getClientWidth();
                        int scrollX = getScrollX();
                        com.facebook.ads.redexgen.core.C3Z c3zA03 = A03();
                        A0O(A01(c3zA03.A02, ((scrollX / clientWidth) - c3zA03.A00) / (c3zA03.A01 + (this.A0M / clientWidth)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.A08)) - this.A03)), true, true, xVelocity);
                        zA0U = A0U();
                    }
                    if (zA0U) {
                        com.facebook.ads.redexgen.core.C3T.A07(this);
                    }
                    return true;
                case 2:
                    if (!this.A0i) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.A08);
                        if (iFindPointerIndex == -1) {
                            zA0U = A0U();
                        } else {
                            float x2 = motionEvent.getX(iFindPointerIndex);
                            float f2 = this.A05;
                            if (A0t[6].charAt(18) != '5') {
                                A0t[6] = "4VLsr63NxXDsBxSO9qPsxtMfhqSOrFpj";
                                fAbs = java.lang.Math.abs(x2 - f2);
                                y = motionEvent.getY(iFindPointerIndex);
                                fAbs2 = java.lang.Math.abs(y - this.A06);
                                if (fAbs > this.A0R) {
                                    if (fAbs > fAbs2) {
                                        this.A0i = true;
                                        A0T(true);
                                        if (x2 - this.A03 > 0.0f) {
                                            f = this.A03 + this.A0R;
                                        } else {
                                            f = this.A03 - this.A0R;
                                        }
                                        this.A05 = f;
                                        this.A06 = y;
                                        strArr = A0t;
                                        if (strArr[4].charAt(21) == strArr[2].charAt(21)) {
                                            java.lang.String[] strArr3 = A0t;
                                            strArr3[5] = "e7fI1kGLNvpqtNm7aDmxtkJeXMvTP5FY";
                                            strArr3[3] = "XvYFrHQXjTrYZxGmpAYONm66bvHDiRqC";
                                            setScrollState(1);
                                            setScrollingCacheEnabled(true);
                                            parent = getParent();
                                            if (parent != null) {
                                                parent.requestDisallowInterceptTouchEvent(true);
                                            }
                                        }
                                    }
                                }
                            } else {
                                java.lang.String[] strArr4 = A0t;
                                strArr4[4] = "ontN6EF9kNoPk4JOa0rpD46Vxb17myeK";
                                strArr4[2] = "q3u6R9yrNwStVG1gWFMVX4nkPMMF7Bi5";
                                fAbs = java.lang.Math.abs(x2 - f2);
                                y = motionEvent.getY(iFindPointerIndex);
                                fAbs2 = java.lang.Math.abs(y - this.A06);
                                if (fAbs > this.A0R) {
                                    if (fAbs > fAbs2) {
                                        this.A0i = true;
                                        A0T(true);
                                        if (x2 - this.A03 > 0.0f) {
                                            f = this.A03 + this.A0R;
                                        } else {
                                            f = this.A03 - this.A0R;
                                        }
                                        this.A05 = f;
                                        this.A06 = y;
                                        strArr = A0t;
                                        if (strArr[4].charAt(21) == strArr[2].charAt(21)) {
                                            java.lang.String[] strArr5 = A0t;
                                            strArr5[5] = "e7fI1kGLNvpqtNm7aDmxtkJeXMvTP5FY";
                                            strArr5[3] = "XvYFrHQXjTrYZxGmpAYONm66bvHDiRqC";
                                            setScrollState(1);
                                            setScrollingCacheEnabled(true);
                                            parent = getParent();
                                            if (parent != null) {
                                                parent.requestDisallowInterceptTouchEvent(true);
                                            }
                                        }
                                    }
                                }
                            }
                            if (this.A0i) {
                                zA0U = false | A0X(motionEvent.getX(motionEvent.findPointerIndex(this.A08)));
                            }
                        }
                    } else if (this.A0i) {
                        zA0U = false | A0X(motionEvent.getX(motionEvent.findPointerIndex(this.A08)));
                    }
                    if (zA0U) {
                        com.facebook.ads.redexgen.core.C3T.A07(this);
                    }
                    return true;
                case 3:
                    if (this.A0i) {
                        A0M(this.A00, true, 0, false);
                        java.lang.String[] strArr6 = A0t;
                        if (strArr6[1].charAt(20) == strArr6[7].charAt(20)) {
                            throw new java.lang.RuntimeException();
                        }
                        A0t[0] = "8Tm9By8OJxOMqui";
                        zA0U = A0U();
                    }
                    if (zA0U) {
                        com.facebook.ads.redexgen.core.C3T.A07(this);
                    }
                    return true;
                case 4:
                default:
                    if (zA0U) {
                        com.facebook.ads.redexgen.core.C3T.A07(this);
                    }
                    return true;
                case 5:
                    int actionIndex = motionEvent.getActionIndex();
                    this.A05 = motionEvent.getX(actionIndex);
                    this.A08 = motionEvent.getPointerId(actionIndex);
                    if (zA0U) {
                        com.facebook.ads.redexgen.core.C3T.A07(this);
                    }
                    return true;
                case 6:
                    A0P(motionEvent);
                    this.A05 = motionEvent.getX(motionEvent.findPointerIndex(this.A08));
                    if (zA0U) {
                        com.facebook.ads.redexgen.core.C3T.A07(this);
                    }
                    return true;
            }
        }
        throw new java.lang.RuntimeException();
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [com.facebook.ads.redexgen.X.3g] */
    static {
        A0C();
        A0u = new int[]{android.R.attr.layout_gravity};
        A0x = new java.util.Comparator<com.facebook.ads.redexgen.core.C3Z>() { // from class: com.facebook.ads.redexgen.X.3V
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final int compare(com.facebook.ads.redexgen.core.C3Z c3z, com.facebook.ads.redexgen.core.C3Z c3z2) {
                return c3z.A02 - c3z2.A02;
            }
        };
        A0v = new android.view.animation.Interpolator() { // from class: com.facebook.ads.redexgen.X.3W
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        };
        A0w = new java.util.Comparator<android.view.View>() { // from class: com.facebook.ads.redexgen.X.3g
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final int compare(android.view.View view, android.view.View view2) {
                com.facebook.ads.redexgen.core.C03953a c03953a = (com.facebook.ads.redexgen.core.C03953a) view.getLayoutParams();
                com.facebook.ads.redexgen.core.C03953a c03953a2 = (com.facebook.ads.redexgen.core.C03953a) view2.getLayoutParams();
                if (c03953a.A05 != c03953a2.A05) {
                    return c03953a.A05 ? 1 : -1;
                }
                return c03953a.A02 - c03953a2.A02;
            }
        };
    }

    public C04023h(android.content.Context context) {
        super(context);
        this.A0r = new java.util.ArrayList<>();
        this.A0p = new com.facebook.ads.redexgen.core.C3Z();
        this.A0o = new android.graphics.Rect();
        this.A0O = -1;
        this.A0T = null;
        this.A0a = null;
        this.A02 = -3.4028235E38f;
        this.A07 = Float.MAX_VALUE;
        this.A0L = 1;
        this.A08 = -1;
        this.A0g = true;
        this.A0l = false;
        this.A0q = new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.3X
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.setScrollState(0);
                this.A00.A0f();
            }
        };
        this.A0P = 0;
        A0D();
    }

    private final float A00(float f) {
        return (float) java.lang.Math.sin((f - 0.5f) * 0.47123894f);
    }

    private int A01(int i, float f, int i2, int i3) {
        if (java.lang.Math.abs(i3) > this.A0H && java.lang.Math.abs(i2) > this.A0K) {
            if (i2 <= 0) {
                i++;
            }
        } else {
            int targetPage = this.A00;
            float truncator = i >= targetPage ? 0.4f : 0.6f;
            i = ((int) (f + truncator)) + i;
        }
        int targetPage2 = this.A0r.size();
        if (targetPage2 > 0) {
            com.facebook.ads.redexgen.core.C3Z lastItem = this.A0r.get(0);
            java.util.ArrayList<com.facebook.ads.redexgen.core.C3Z> arrayList = this.A0r;
            int targetPage3 = this.A0r.size();
            com.facebook.ads.redexgen.core.C3Z c3z = arrayList.get(targetPage3 - 1);
            int i4 = lastItem.A02;
            int targetPage4 = c3z.A02;
            return java.lang.Math.max(i4, java.lang.Math.min(i, targetPage4));
        }
        return i;
    }

    private android.graphics.Rect A02(android.graphics.Rect rect, android.view.View view) {
        if (rect == null) {
            rect = new android.graphics.Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        android.view.ViewParent parent = view.getParent();
        while ((parent instanceof android.view.ViewGroup) && parent != this) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            int i = rect.bottom;
            java.lang.String[] strArr = A0t;
            if (strArr[5].charAt(3) == strArr[3].charAt(3)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0t;
            strArr2[5] = "TxsWzRbkVVm53KJb0hYxYLTaFP4RvuCR";
            strArr2[3] = "7IWTmTKlEE0GT3GusYYvAPWFxogbhPhf";
            rect.bottom = i + viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private final com.facebook.ads.redexgen.core.C3Z A04(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            com.facebook.ads.redexgen.core.C3Z c3z = this.A0r.get(i2);
            int i3 = c3z.A02;
            if (A0t[6].charAt(18) == '5') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0t;
            strArr[5] = "FTW8lMLV1WF1uT7A98mx1WW44JTpX4mD";
            strArr[3] = "8smTuGxWqqiqky02WbAruJcj0nAU8eAT";
            if (i3 == i) {
                return c3z;
            }
        }
        return null;
    }

    private final com.facebook.ads.redexgen.core.C3Z A05(int i, int i2) {
        com.facebook.ads.redexgen.core.C3Z c3z = new com.facebook.ads.redexgen.core.C3Z();
        c3z.A02 = i;
        c3z.A03 = this.A01.A04(this, i);
        c3z.A01 = this.A01.A00(i);
        if (i2 < 0 || i2 >= this.A0r.size()) {
            this.A0r.add(c3z);
        } else {
            this.A0r.add(i2, c3z);
        }
        return c3z;
    }

    private final com.facebook.ads.redexgen.core.C3Z A06(android.view.View view) {
        while (true) {
            java.lang.Object parent = view.getParent();
            if (A0t[0].length() != 15) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0t;
            strArr[4] = "Cp8HLsoEDfOeEYMqWHrr049HoHROoinV";
            strArr[2] = "T0VfZL8wtEwZV1iGxV5Hd4QPubsH4Hu8";
            if (parent != this) {
                if (parent == null || !(parent instanceof android.view.View)) {
                    return null;
                }
                view = (android.view.View) parent;
            } else {
                return A07(view);
            }
        }
    }

    private final com.facebook.ads.redexgen.core.C3Z A07(android.view.View view) {
        for (int i = 0; i < i; i++) {
            com.facebook.ads.redexgen.core.C3Z c3z = this.A0r.get(i);
            if (this.A01.A08(view, c3z.A03)) {
                return c3z;
            }
        }
        return null;
    }

    private void A09() {
        this.A0i = false;
        this.A0k = false;
        if (this.A0U != null) {
            this.A0U.recycle();
            this.A0U = null;
        }
    }

    private void A0A() {
        int i = 0;
        while (i < i) {
            if (!((com.facebook.ads.redexgen.core.C03953a) getChildAt(i).getLayoutParams()).A05) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    private void A0B() {
        if (this.A0F != 0) {
            if (this.A0b == null) {
                this.A0b = new java.util.ArrayList<>();
            } else {
                this.A0b.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.A0b.add(getChildAt(i));
            }
            java.util.Collections.sort(this.A0b, A0w);
        }
    }

    private final void A0D() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        android.content.Context context = getContext();
        this.A0X = new android.widget.Scroller(context, A0v);
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.A0R = viewConfiguration.getScaledPagingTouchSlop();
        this.A0K = (int) (400.0f * f);
        this.A0J = viewConfiguration.getScaledMaximumFlingVelocity();
        this.A0V = new android.widget.EdgeEffect(context);
        this.A0W = new android.widget.EdgeEffect(context);
        this.A0H = (int) (25.0f * f);
        this.A0C = (int) (2.0f * f);
        this.A0E = (int) (16.0f * f);
        com.facebook.ads.redexgen.core.C3T.A0B(this, new com.facebook.ads.redexgen.core.C1271b4(this));
        if (com.facebook.ads.redexgen.core.C3T.A00(this) == 0) {
            com.facebook.ads.redexgen.core.C3T.A09(this, 1);
        }
        com.facebook.ads.redexgen.core.C3T.A0C(this, new com.facebook.ads.redexgen.core.C1272b5(this));
    }

    private void A0E(int i) {
        java.util.List<com.facebook.ads.redexgen.core.InterfaceC03973c> list = this.A0d;
        java.lang.String[] strArr = A0t;
        if (strArr[5].charAt(3) == strArr[3].charAt(3)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0t;
        strArr2[1] = "BVTy00cMA02UZPGNllJjIH3AYkDj1BkJ";
        strArr2[7] = "OotLKoFjxgYdGdzuGdwdV1ikaCSVhdo5";
        if (list != null) {
            int z = this.A0d.size();
            for (int i2 = 0; i2 < z; i2++) {
                this.A0d.get(i2);
            }
        }
    }

    private void A0F(int i) {
        if (this.A0d != null) {
            int z = this.A0d.size();
            for (int i2 = 0; i2 < z; i2++) {
                this.A0d.get(i2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0229  */
    /* JADX WARN: Code duplicated, block: B:121:0x0244  */
    /* JADX WARN: Code duplicated, block: B:123:0x0255  */
    /* JADX WARN: Code duplicated, block: B:124:0x025e  */
    /* JADX WARN: Code duplicated, block: B:130:0x027d  */
    /* JADX WARN: Code duplicated, block: B:132:0x0283  */
    /* JADX WARN: Code duplicated, block: B:134:0x0289  */
    /* JADX WARN: Code duplicated, block: B:139:0x0296  */
    /* JADX WARN: Code duplicated, block: B:141:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:145:0x02ad A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:147:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:158:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x02ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:89:0x0188  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:93:0x01af  */
    /* JADX WARN: Code duplicated, block: B:96:0x01b9  */
    private final void A0G(int i) {
        java.lang.String hexString;
        int childCount;
        int i2;
        android.view.View viewFindFocus;
        com.facebook.ads.redexgen.core.C3Z c3zA06;
        int i3;
        int curIndex;
        com.facebook.ads.redexgen.core.C3Z c3zA07;
        int i4;
        int curIndex2;
        int i5;
        int curIndex3;
        com.facebook.ads.redexgen.core.C03953a c03953a;
        com.facebook.ads.redexgen.core.C3Z c3zA08;
        com.facebook.ads.redexgen.core.C3Z c3z;
        float f;
        com.facebook.ads.redexgen.core.C3Z ii;
        float leftWidthNeeded;
        int size;
        float f2;
        int iCharAt;
        int curIndex4;
        com.facebook.ads.redexgen.core.C3Z c3zA04 = null;
        if (this.A00 != i) {
            c3zA04 = A04(this.A00);
            this.A00 = i;
        }
        if (this.A01 == null) {
            A0B();
            return;
        }
        if (this.A0m) {
            A0B();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        int i6 = this.A0L;
        int pos = java.lang.Math.max(0, this.A00 - i6);
        int N = this.A01.A01();
        int startPos = java.lang.Math.min(N - 1, this.A00 + i6);
        if (N == this.A0G) {
            com.facebook.ads.redexgen.core.C3Z ii2 = null;
            int i7 = 0;
            while (i7 < curIndex) {
                com.facebook.ads.redexgen.core.C3Z c3z2 = this.A0r.get(i7);
                int i8 = c3z2.A02;
                int curIndex5 = this.A00;
                if (i8 >= curIndex5) {
                    int i9 = c3z2.A02;
                    int curIndex6 = this.A00;
                    if (i9 != curIndex6) {
                        break;
                    }
                    ii2 = c3z2;
                    break;
                }
                i7++;
            }
            if (ii2 == null && N > 0) {
                int curIndex7 = this.A00;
                ii2 = A05(curIndex7, i7);
            }
            if (ii2 != null) {
                float f3 = 0.0f;
                int i10 = i7 - 1;
                if (i10 >= 0) {
                    c3z = this.A0r.get(i10);
                } else {
                    c3z = null;
                }
                int clientWidth = getClientWidth();
                if (clientWidth <= 0) {
                    f = 0.0f;
                } else {
                    float f4 = 2.0f - ii2.A01;
                    int curIndex8 = getPaddingLeft();
                    f = f4 + (curIndex8 / clientWidth);
                }
                int curIndex9 = this.A00;
                for (int i11 = curIndex9 - 1; i11 >= 0; i11--) {
                    if (f3 >= f && i11 < pos) {
                        if (c3z == null) {
                            break;
                        }
                        int curIndex10 = c3z.A02;
                        if (i11 == curIndex10 && !c3z.A04) {
                            this.A0r.remove(i10);
                            this.A01.A07(this, i11, c3z.A03);
                            i10--;
                            i7--;
                            c3z = i10 >= 0 ? this.A0r.get(i10) : null;
                        }
                    } else if (c3z != null) {
                        int curIndex11 = c3z.A02;
                        if (i11 == curIndex11) {
                            f3 += c3z.A01;
                            i10--;
                            c3z = i10 >= 0 ? this.A0r.get(i10) : null;
                        } else {
                            int curIndex12 = i10 + 1;
                            f2 = A05(i11, curIndex12).A01;
                            java.lang.String[] strArr = A0t;
                            java.lang.String str = strArr[5];
                            java.lang.String str2 = strArr[3];
                            iCharAt = str.charAt(3);
                            curIndex4 = str2.charAt(3);
                            if (iCharAt != curIndex4) {
                                java.lang.String[] strArr2 = A0t;
                                strArr2[4] = "dloXpWDXOKz7FwqtlWspO43tyknOTTlF";
                                strArr2[2] = "sCPq7B1Nle5jSSIhAv3Hb4nKNO5mS7KT";
                                f3 += f2;
                                i7++;
                                if (i10 >= 0) {
                                    c3z = this.A0r.get(i10);
                                } else {
                                    c3z = null;
                                }
                            }
                        }
                    } else {
                        int curIndex13 = i10 + 1;
                        f2 = A05(i11, curIndex13).A01;
                        java.lang.String[] strArr3 = A0t;
                        java.lang.String str3 = strArr3[5];
                        java.lang.String str4 = strArr3[3];
                        iCharAt = str3.charAt(3);
                        curIndex4 = str4.charAt(3);
                        if (iCharAt != curIndex4) {
                            java.lang.String[] strArr4 = A0t;
                            strArr4[4] = "dloXpWDXOKz7FwqtlWspO43tyknOTTlF";
                            strArr4[2] = "sCPq7B1Nle5jSSIhAv3Hb4nKNO5mS7KT";
                            f3 += f2;
                            i7++;
                            if (i10 >= 0) {
                                c3z = this.A0r.get(i10);
                            } else {
                                c3z = null;
                            }
                        }
                    }
                }
                float extraWidthLeft = ii2.A01;
                int itemIndex = i7 + 1;
                if (extraWidthLeft < 2.0f) {
                    int curIndex14 = this.A0r.size();
                    if (itemIndex < curIndex14) {
                        ii = this.A0r.get(itemIndex);
                    } else {
                        ii = null;
                    }
                    if (clientWidth <= 0) {
                        leftWidthNeeded = 0.0f;
                    } else {
                        int curIndex15 = getPaddingRight();
                        float f5 = curIndex15;
                        float rightWidthNeeded = clientWidth;
                        if (A0t[0].length() != 15) {
                            throw new java.lang.RuntimeException();
                        }
                        java.lang.String[] strArr5 = A0t;
                        strArr5[5] = "yjiSNpko5C4HRuH1DqNZIljIP1AyIB8Y";
                        strArr5[3] = "4BabcLoEiYQllUHdwQ0JBCE7juXq8SlJ";
                        leftWidthNeeded = (f5 / rightWidthNeeded) + 2.0f;
                    }
                    int curIndex16 = this.A00;
                    for (int i12 = curIndex16 + 1; i12 < N; i12++) {
                        if (extraWidthLeft >= leftWidthNeeded && i12 > startPos) {
                            if (ii == null) {
                                break;
                            }
                            int curIndex17 = ii.A02;
                            if (i12 == curIndex17 && !ii.A04) {
                                this.A0r.remove(itemIndex);
                                this.A01.A07(this, i12, ii.A03);
                                int curIndex18 = this.A0r.size();
                                ii = itemIndex < curIndex18 ? this.A0r.get(itemIndex) : null;
                            }
                        } else if (ii != null) {
                            int curIndex19 = ii.A02;
                            if (i12 == curIndex19) {
                                extraWidthLeft += ii.A01;
                                itemIndex++;
                                int curIndex20 = this.A0r.size();
                                if (itemIndex < curIndex20) {
                                    com.facebook.ads.redexgen.core.C3Z ii3 = this.A0r.get(itemIndex);
                                    java.lang.String[] strArr6 = A0t;
                                    java.lang.String str5 = strArr6[5];
                                    java.lang.String str6 = strArr6[3];
                                    int iCharAt2 = str5.charAt(3);
                                    int curIndex21 = str6.charAt(3);
                                    if (iCharAt2 != curIndex21) {
                                        java.lang.String[] strArr7 = A0t;
                                        strArr7[4] = "IsA4bkdSyqEuCzjIc9UrR46Q3omYxVKd";
                                        strArr7[2] = "uQMdRRPHCTPdIeSYH7tJM435sOxxqF9X";
                                        ii = ii3;
                                    } else {
                                        A0t[0] = "Vvaq8MYPG9MCZuQ";
                                        ii = ii3;
                                    }
                                } else {
                                    ii = null;
                                }
                            } else {
                                com.facebook.ads.redexgen.core.C3Z c3zA05 = A05(i12, itemIndex);
                                itemIndex++;
                                extraWidthLeft += c3zA05.A01;
                                size = this.A0r.size();
                                if (A0t[0].length() != 15) {
                                    A0t[0] = "BbpcE6tkf1K6OjJ";
                                    if (itemIndex < size) {
                                        ii = this.A0r.get(itemIndex);
                                    } else {
                                        ii = null;
                                    }
                                } else if (itemIndex < size) {
                                    ii = this.A0r.get(itemIndex);
                                } else {
                                    ii = null;
                                }
                            }
                        } else {
                            com.facebook.ads.redexgen.core.C3Z c3zA09 = A05(i12, itemIndex);
                            itemIndex++;
                            extraWidthLeft += c3zA09.A01;
                            size = this.A0r.size();
                            if (A0t[0].length() != 15) {
                                A0t[0] = "BbpcE6tkf1K6OjJ";
                                if (itemIndex < size) {
                                    ii = this.A0r.get(itemIndex);
                                } else {
                                    ii = null;
                                }
                            } else if (itemIndex < size) {
                                ii = this.A0r.get(itemIndex);
                            } else {
                                ii = null;
                            }
                        }
                    }
                }
                A0Q(ii2, i7, c3zA04);
                childCount = getChildCount();
                for (i2 = 0; i2 < childCount; i2++) {
                    android.view.View childAt = getChildAt(i2);
                    c03953a = (com.facebook.ads.redexgen.core.C03953a) childAt.getLayoutParams();
                    c03953a.A01 = i2;
                    if (c03953a.A05 && c03953a.A00 == 0.0f && (c3zA08 = A07(childAt)) != null) {
                        c03953a.A00 = c3zA08.A01;
                        java.lang.String[] strArr8 = A0t;
                        java.lang.String str7 = strArr8[4];
                        java.lang.String str8 = strArr8[2];
                        int iCharAt3 = str7.charAt(21);
                        int curIndex22 = str8.charAt(21);
                        if (iCharAt3 == curIndex22) {
                            java.lang.String[] strArr9 = A0t;
                            strArr9[5] = "EyT6xwfDNG2S3e9LtZYytN0s3Xm8cKUy";
                            strArr9[3] = "L43v13w7qHrePnOf1vJtqhkFr9Wez5bL";
                            int curIndex23 = c3zA08.A02;
                            c03953a.A02 = curIndex23;
                        }
                    }
                }
                A0B();
                if (hasFocus()) {
                    viewFindFocus = findFocus();
                    if (viewFindFocus != null) {
                        c3zA06 = A06(viewFindFocus);
                    } else {
                        c3zA06 = null;
                    }
                    if (c3zA06 != null) {
                        i5 = c3zA06.A02;
                        curIndex3 = this.A00;
                        if (i5 == curIndex3) {
                            return;
                        }
                    }
                    for (i3 = 0; i3 < curIndex; i3++) {
                        android.view.View childAt2 = getChildAt(i3);
                        c3zA07 = A07(childAt2);
                        if (c3zA07 != null) {
                            i4 = c3zA07.A02;
                            curIndex2 = this.A00;
                            if (i4 == curIndex2 && childAt2.requestFocus(2)) {
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            childCount = getChildCount();
            while (i2 < childCount) {
                android.view.View childAt3 = getChildAt(i2);
                c03953a = (com.facebook.ads.redexgen.core.C03953a) childAt3.getLayoutParams();
                c03953a.A01 = i2;
                if (c03953a.A05) {
                }
            }
            A0B();
            if (hasFocus()) {
                viewFindFocus = findFocus();
                if (viewFindFocus != null) {
                    c3zA06 = A06(viewFindFocus);
                } else {
                    c3zA06 = null;
                }
                if (c3zA06 != null) {
                    i5 = c3zA06.A02;
                    curIndex3 = this.A00;
                    if (i5 == curIndex3) {
                        return;
                    }
                }
                while (i3 < curIndex) {
                    android.view.View childAt4 = getChildAt(i3);
                    c3zA07 = A07(childAt4);
                    if (c3zA07 != null) {
                        i4 = c3zA07.A02;
                        curIndex2 = this.A00;
                        if (i4 == curIndex2) {
                            continue;
                        }
                    }
                }
                return;
            }
            return;
            throw new java.lang.RuntimeException();
        }
        try {
            android.content.res.Resources resources = getResources();
            int curIndex24 = getId();
            hexString = resources.getResourceName(curIndex24);
        } catch (android.content.res.Resources.NotFoundException unused) {
            int curIndex25 = getId();
            hexString = java.lang.Integer.toHexString(curIndex25);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String resName = A08(158, org.objectweb.asm.Opcodes.D2I, 2);
        java.lang.StringBuilder sbAppend = sb.append(resName).append(this.A0G);
        java.lang.String resName2 = A08(77, 9, 115);
        java.lang.StringBuilder sbAppend2 = sbAppend.append(resName2).append(N);
        java.lang.String resName3 = A08(18, 11, 23);
        java.lang.StringBuilder sbAppend3 = sbAppend2.append(resName3).append(hexString);
        java.lang.String resName4 = A08(4, 14, 105);
        java.lang.StringBuilder sbAppend4 = sbAppend3.append(resName4).append(getClass());
        java.lang.String resName5 = A08(29, 22, 122);
        throw new java.lang.IllegalStateException(sbAppend4.append(resName5).append(this.A01.getClass()).toString());
    }

    private void A0H(int i, float f, int i2) {
        if (this.A0d != null) {
            int z = this.A0d.size();
            for (int i3 = 0; i3 < z; i3++) {
                this.A0d.get(i3);
            }
        }
    }

    private final void A0I(int i, float f, int i2) {
        int iMax;
        if (this.A0D > 0) {
            int childLeft = getScrollX();
            int paddingLeft = getPaddingLeft();
            int childLeft2 = getPaddingRight();
            int hgrav = getWidth();
            int i3 = getChildCount();
            for (int childCount = 0; childCount < i3; childCount++) {
                android.view.View childAt = getChildAt(childCount);
                com.facebook.ads.redexgen.core.C03953a lp = (com.facebook.ads.redexgen.core.C03953a) childAt.getLayoutParams();
                int paddingLeft2 = A0t[6].charAt(18);
                if (paddingLeft2 != 53) {
                    A0t[0] = "eLb4kWjiyFzQgYZ";
                    if (lp.A05) {
                        int scrollX = lp.A04;
                        switch (scrollX & 7) {
                            case 1:
                                int scrollX2 = childAt.getMeasuredWidth();
                                iMax = java.lang.Math.max((hgrav - scrollX2) / 2, paddingLeft);
                                break;
                            case 2:
                            case 4:
                            default:
                                iMax = paddingLeft;
                                break;
                            case 3:
                                iMax = paddingLeft;
                                int scrollX3 = childAt.getWidth();
                                paddingLeft += scrollX3;
                                break;
                            case 5:
                                int scrollX4 = childAt.getMeasuredWidth();
                                iMax = (hgrav - childLeft2) - scrollX4;
                                int scrollX5 = childAt.getMeasuredWidth();
                                childLeft2 += scrollX5;
                                break;
                        }
                        int scrollX6 = childAt.getLeft();
                        int i4 = (iMax + childLeft) - scrollX6;
                        java.lang.String[] strArr = A0t;
                        java.lang.String str = strArr[4];
                        java.lang.String str2 = strArr[2];
                        int paddingLeft3 = str.charAt(21);
                        int scrollX7 = str2.charAt(21);
                        if (paddingLeft3 == scrollX7) {
                            java.lang.String[] strArr2 = A0t;
                            strArr2[5] = "8dfGriTrd9bOdESwE5mGPvbaI7ots8HA";
                            strArr2[3] = "OX1hZuxAiPsPngs8SIDO4tRfQKy4SqJm";
                            if (i4 != 0) {
                                childAt.offsetLeftAndRight(i4);
                            }
                        }
                    }
                }
                throw new java.lang.RuntimeException();
            }
        }
        A0H(i, f, i2);
        if (0 != 0) {
            getScrollX();
            int childCount2 = getChildCount();
            for (int i5 = 0; i5 < childCount2; i5++) {
                android.view.View childAt2 = getChildAt(i5);
                java.lang.String[] strArr3 = A0t;
                java.lang.String str3 = strArr3[5];
                java.lang.String str4 = strArr3[3];
                int childCount3 = str3.charAt(3);
                int scrollX8 = str4.charAt(3);
                if (childCount3 == scrollX8) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr4 = A0t;
                strArr4[4] = "xqiTxeHFqkAvCvaAoyIYw4ze8LixE8Bg";
                strArr4[2] = "dxU2iatDRuS97WdbX1MSD4wOgw4tArLe";
                if (!((com.facebook.ads.redexgen.core.C03953a) childAt2.getLayoutParams()).A05) {
                    childAt2.getLeft();
                    getClientWidth();
                    throw new java.lang.NullPointerException(A08(450, 13, 123));
                }
            }
        }
        this.A0e = true;
    }

    private void A0K(int i, int i2, int i3, int i4) {
        if (i2 > 0 && !this.A0r.isEmpty()) {
            if (!this.A0X.isFinished()) {
                this.A0X.setFinalX(getCurrentItem() * getClientWidth());
                return;
            }
            int paddingLeft = ((i - getPaddingLeft()) - getPaddingRight()) + i3;
            int widthWithMargin = getPaddingLeft();
            int i5 = i2 - widthWithMargin;
            int widthWithMargin2 = getPaddingRight();
            int i6 = (i5 - widthWithMargin2) + i4;
            int widthWithMargin3 = getScrollX();
            int oldWidthWithMargin = (int) (paddingLeft * (widthWithMargin3 / i6));
            int widthWithMargin4 = getScrollY();
            scrollTo(oldWidthWithMargin, widthWithMargin4);
            return;
        }
        int i7 = this.A00;
        java.lang.String[] strArr = A0t;
        if (strArr[4].charAt(21) != strArr[2].charAt(21)) {
            throw new java.lang.RuntimeException();
        }
        A0t[6] = "zbIyuU4nFdtSfTRFogYOf2jKfKMbfeaA";
        com.facebook.ads.redexgen.core.C3Z ii = A04(i7);
        float scrollOffset = ii != null ? java.lang.Math.min(ii.A00, this.A07) : 0.0f;
        int paddingLeft2 = (int) (((i - getPaddingLeft()) - getPaddingRight()) * scrollOffset);
        if (paddingLeft2 == getScrollX()) {
            return;
        }
        A0R(false);
        scrollTo(paddingLeft2, getScrollY());
    }

    private final void A0L(int i, boolean z) {
        this.A0m = false;
        A0N(i, z, false);
    }

    private void A0M(int i, boolean z, int i2, boolean z2) {
        com.facebook.ads.redexgen.core.C3Z c3zA04 = A04(i);
        int destX = 0;
        if (c3zA04 != null) {
            destX = (int) (getClientWidth() * java.lang.Math.max(this.A02, java.lang.Math.min(c3zA04.A00, this.A07)));
        }
        if (z) {
            A0J(destX, 0, i2);
            if (z2) {
                A0E(i);
                return;
            }
            return;
        }
        if (z2) {
            A0E(i);
        }
        A0R(false);
        scrollTo(destX, 0);
        A0Z(destX);
    }

    private final void A0N(int i, boolean z, boolean z2) {
        A0O(i, z, z2, 0);
    }

    private final void A0O(int i, boolean z, boolean z2, int i2) {
        if (this.A01 == null || this.A01.A01() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.A00 == i) {
            int size = this.A0r.size();
            java.lang.String[] strArr = A0t;
            if (strArr[5].charAt(3) == strArr[3].charAt(3)) {
                throw new java.lang.RuntimeException();
            }
            A0t[0] = "caHeuZPLB8pjODm";
            if (size != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.A01.A01()) {
            i = this.A01.A01() - 1;
        }
        int i3 = this.A0L;
        if (i > this.A00 + i3 || i < this.A00 - i3) {
            for (int i4 = 0; i4 < this.A0r.size(); i4++) {
                this.A0r.get(i4).A04 = true;
            }
        }
        boolean z3 = this.A00 != i;
        boolean dispatchSelected = this.A0g;
        if (dispatchSelected) {
            this.A00 = i;
            if (z3) {
                A0E(i);
            }
            requestLayout();
            return;
        }
        A0G(i);
        A0M(i, z, i2, z3);
    }

    private void A0P(android.view.MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        int pointerIndex = this.A08;
        if (pointerId != pointerIndex) {
            return;
        }
        int pointerId2 = actionIndex == 0 ? 1 : 0;
        this.A05 = motionEvent.getX(pointerId2);
        int pointerIndex2 = motionEvent.getPointerId(pointerId2);
        this.A08 = pointerIndex2;
        if (this.A0U != null) {
            android.view.VelocityTracker velocityTracker = this.A0U;
            int pointerId3 = A0t[6].charAt(18);
            if (pointerId3 == 53) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0t;
            strArr[4] = "bDxXC3oviTuOT7HziZkEX4OVFsay8yQk";
            strArr[2] = "Td40sAmtginQL7DIEYzsL4IjnbfuGR0u";
            velocityTracker.clear();
        }
    }

    private void A0Q(com.facebook.ads.redexgen.core.C3Z c3z, int i, com.facebook.ads.redexgen.core.C3Z c3z2) {
        float f;
        float f2;
        int pos;
        com.facebook.ads.redexgen.core.C3Z c3z3;
        com.facebook.ads.redexgen.core.C3Z c3z4;
        int iA01 = this.A01.A01();
        int width = getClientWidth();
        if (width > 0) {
            int N = this.A0M;
            f = N / width;
        } else {
            f = 0.0f;
        }
        if (c3z2 != null) {
            int width2 = c3z2.A02;
            int N2 = c3z.A02;
            if (width2 < N2) {
                int itemIndex = 0;
                float fA00 = c3z2.A00 + c3z2.A01 + f;
                int i2 = width2 + 1;
                while (i2 <= N) {
                    int N3 = this.A0r.size();
                    if (itemIndex >= N3) {
                        break;
                    }
                    com.facebook.ads.redexgen.core.C3Z c3z5 = this.A0r.get(itemIndex);
                    while (true) {
                        c3z4 = c3z5;
                        int i3 = c3z4.A02;
                        java.lang.String[] strArr = A0t;
                        java.lang.String str = strArr[4];
                        java.lang.String str2 = strArr[2];
                        int width3 = str.charAt(21);
                        int N4 = str2.charAt(21);
                        if (width3 == N4) {
                            A0t[0] = "mMCGHDWlxFgMsjt";
                            if (i2 <= i3) {
                                break;
                            }
                            int N5 = this.A0r.size();
                            if (itemIndex >= N5 - 1) {
                                break;
                            }
                            itemIndex++;
                            c3z5 = this.A0r.get(itemIndex);
                            java.lang.String[] strArr2 = A0t;
                            java.lang.String str3 = strArr2[1];
                            java.lang.String str4 = strArr2[7];
                            int width4 = str3.charAt(20);
                            int N6 = str4.charAt(20);
                            if (width4 == N6) {
                                throw new java.lang.RuntimeException();
                            }
                            java.lang.String[] strArr3 = A0t;
                            strArr3[4] = "0GRoiU6ng6hdQPVw3EwHp4l2hIIYcNtn";
                            strArr3[2] = "8Y3rzgV9nzp3iIaIDQEcr4upuD8fyeiC";
                        } else {
                            throw new java.lang.RuntimeException();
                        }
                    }
                    while (i2 < N) {
                        fA00 += this.A01.A00(i2) + f;
                        i2++;
                    }
                    c3z4.A00 = fA00;
                    fA00 += c3z4.A01 + f;
                    i2++;
                }
            } else {
                int N7 = c3z.A02;
                if (width2 > N7) {
                    int N8 = this.A0r.size();
                    int i4 = N8 - 1;
                    float fA01 = c3z2.A00;
                    int itemIndex2 = width2 - 1;
                    while (itemIndex2 >= N && i4 >= 0) {
                        com.facebook.ads.redexgen.core.C3Z c3z6 = this.A0r.get(i4);
                        java.lang.String[] strArr4 = A0t;
                        java.lang.String str5 = strArr4[1];
                        java.lang.String str6 = strArr4[7];
                        int width5 = str5.charAt(20);
                        int N9 = str6.charAt(20);
                        if (width5 != N9) {
                            java.lang.String[] strArr5 = A0t;
                            strArr5[4] = "sG2D1AU9vQNSSAZRjoe3z4C00Dqdfrqj";
                            strArr5[2] = "Rdd7cBladgYGVcjrx8uRB4qQBDUzOR2E";
                        }
                        while (true) {
                            c3z3 = c3z6;
                            int N10 = c3z3.A02;
                            if (itemIndex2 >= N10 || i4 <= 0) {
                                break;
                            }
                            i4--;
                            c3z6 = this.A0r.get(i4);
                        }
                        while (itemIndex2 > N) {
                            fA01 -= this.A01.A00(itemIndex2) + f;
                            itemIndex2--;
                        }
                        fA01 -= c3z3.A01 + f;
                        c3z3.A00 = fA01;
                        itemIndex2--;
                    }
                }
            }
        }
        int size = this.A0r.size();
        float offset = c3z.A00;
        int N11 = c3z.A02;
        int itemCount = N11 - 1;
        int N12 = c3z.A02;
        this.A02 = N12 == 0 ? c3z.A00 : -3.4028235E38f;
        int N13 = iA01 - 1;
        if (c3z.A02 == N13) {
            float f3 = c3z.A00;
            if (A0t[6].charAt(18) != 53) {
                java.lang.String[] strArr6 = A0t;
                strArr6[5] = "UG1gT2jUNjrId2t7MfTS74a15LtMOaPg";
                strArr6[3] = "2ozfqeZF2OaiC2JUfBmasK4DPIGaXMZO";
                f2 = (f3 + c3z.A01) - 1.0f;
            } else {
                f2 = (f3 + c3z.A01) - 1.0f;
            }
        } else {
            f2 = Float.MAX_VALUE;
        }
        this.A07 = f2;
        java.lang.String[] strArr7 = A0t;
        java.lang.String str7 = strArr7[5];
        java.lang.String str8 = strArr7[3];
        int width6 = str7.charAt(3);
        int N14 = str8.charAt(3);
        if (width6 != N14) {
            java.lang.String[] strArr8 = A0t;
            strArr8[5] = "icTatsUiht4AjRSLPfh6XPjJPbhUZ0sF";
            strArr8[3] = "b2D116l90T5me9fMxsyBUu50CZtZWawR";
            pos = i - 1;
        } else {
            A0t[0] = "QtgdpK39IRmx84t";
            pos = i - 1;
        }
        while (pos >= 0) {
            com.facebook.ads.redexgen.core.C3Z c3z7 = this.A0r.get(pos);
            while (itemCount > N) {
                offset -= this.A01.A00(itemCount) + f;
                itemCount--;
            }
            float f4 = c3z7.A01 + f;
            java.lang.String[] strArr9 = A0t;
            java.lang.String str9 = strArr9[4];
            java.lang.String str10 = strArr9[2];
            int width7 = str9.charAt(21);
            int N15 = str10.charAt(21);
            if (width7 != N15) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr10 = A0t;
            strArr10[5] = "SgZGqUZOfUbRscKwt61ZJH2C2qxkKaaL";
            strArr10[3] = "iEhLnshzYOduKlFOAhFClgc41xkECprr";
            offset -= f4;
            c3z7.A00 = offset;
            int N16 = c3z7.A02;
            if (N16 == 0) {
                this.A02 = offset;
            }
            pos--;
            itemCount--;
        }
        float fA02 = c3z.A00 + c3z.A01 + f;
        int N17 = c3z.A02;
        int i5 = N17 + 1;
        int pos2 = i + 1;
        while (pos2 < size) {
            com.facebook.ads.redexgen.core.C3Z c3z8 = this.A0r.get(pos2);
            while (i5 < N) {
                fA02 += this.A01.A00(i5) + f;
                i5++;
            }
            int N18 = iA01 - 1;
            if (c3z8.A02 == N18) {
                this.A07 = (c3z8.A01 + fA02) - 1.0f;
            }
            c3z8.A00 = fA02;
            fA02 += c3z8.A01 + f;
            pos2++;
            i5++;
        }
        this.A0l = false;
    }

    private void A0R(boolean z) {
        boolean z2 = this.A0P == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            boolean needPopulate = this.A0X.isFinished();
            if (!needPopulate) {
                this.A0X.abortAnimation();
                int scrollX = getScrollX();
                int oldX = getScrollY();
                int currX = this.A0X.getCurrX();
                int currY = this.A0X.getCurrY();
                if (scrollX != currX || oldX != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        A0Z(currX);
                    }
                }
            }
        }
        this.A0m = false;
        for (int i = 0; i < this.A0r.size(); i++) {
            com.facebook.ads.redexgen.core.C3Z c3z = this.A0r.get(i);
            boolean needPopulate2 = c3z.A04;
            if (needPopulate2) {
                z2 = true;
                c3z.A04 = false;
            }
        }
        if (z2) {
            if (z) {
                com.facebook.ads.redexgen.core.C3T.A0D(this, this.A0q);
            } else {
                this.A0q.run();
            }
        }
    }

    private void A0S(boolean z) {
        int layerType;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (z) {
                layerType = this.A0N;
            } else {
                layerType = 0;
            }
            getChildAt(i).setLayerType(layerType, null);
        }
    }

    private void A0T(boolean z) {
        android.view.ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private boolean A0U() {
        this.A08 = -1;
        A09();
        this.A0V.onRelease();
        this.A0W.onRelease();
        return this.A0V.isFinished() || this.A0W.isFinished();
    }

    private final boolean A0V() {
        if (this.A00 > 0) {
            A0L(this.A00 - 1, true);
            return true;
        }
        return false;
    }

    private final boolean A0W() {
        if (this.A01 != null && this.A00 < this.A01.A01() - 1) {
            A0L(this.A00 + 1, true);
            return true;
        }
        return false;
    }

    private boolean A0X(float f) {
        boolean z = false;
        float f2 = this.A05 - f;
        this.A05 = f;
        float scrollX = getScrollX() + f2;
        int clientWidth = getClientWidth();
        float f3 = clientWidth * this.A02;
        float leftBound = clientWidth;
        float leftBound2 = leftBound * this.A07;
        boolean rightAbsolute = true;
        boolean leftAbsolute = true;
        com.facebook.ads.redexgen.core.C3Z c3z = this.A0r.get(0);
        com.facebook.ads.redexgen.core.C3Z c3z2 = this.A0r.get(this.A0r.size() - 1);
        if (c3z.A02 != 0) {
            rightAbsolute = false;
            f3 = c3z.A00 * clientWidth;
        }
        if (c3z2.A02 != this.A01.A01() - 1) {
            leftAbsolute = false;
            float leftBound3 = c3z2.A00;
            leftBound2 = leftBound3 * clientWidth;
        }
        if (scrollX < f3) {
            if (rightAbsolute) {
                float scrollX2 = f3 - scrollX;
                if (A0t[6].charAt(18) == '5') {
                    throw new java.lang.RuntimeException();
                }
                A0t[6] = "BqGUV6FWN85Kb3W2SyX26JGUB7qlw7kS";
                this.A0V.onPull(java.lang.Math.abs(scrollX2) / clientWidth);
                z = true;
            }
            scrollX = f3;
        } else if (scrollX > leftBound2) {
            if (leftAbsolute) {
                android.widget.EdgeEffect edgeEffect = this.A0W;
                float over = java.lang.Math.abs(scrollX - leftBound2);
                edgeEffect.onPull(over / clientWidth);
                z = true;
            }
            scrollX = leftBound2;
        }
        this.A05 += scrollX - ((int) scrollX);
        scrollTo((int) scrollX, getScrollY());
        A0Z((int) scrollX);
        return z;
    }

    private final boolean A0Y(float f, float f2) {
        return (f < ((float) this.A0I) && f2 > 0.0f) || (f > ((float) (getWidth() - this.A0I)) && f2 < 0.0f);
    }

    private boolean A0Z(int i) {
        int size = this.A0r.size();
        java.lang.String strA08 = A08(397, 53, 33);
        if (size == 0) {
            if (this.A0g) {
                return false;
            }
            this.A0e = false;
            A0I(0, 0.0f, 0);
            if (this.A0e) {
                return false;
            }
            throw new java.lang.IllegalStateException(strA08);
        }
        com.facebook.ads.redexgen.core.C3Z c3zA03 = A03();
        int currentPage = getClientWidth();
        int widthWithMargin = this.A0M + currentPage;
        float f = this.A0M / currentPage;
        int i2 = c3zA03.A02;
        float f2 = ((i / currentPage) - c3zA03.A00) / (c3zA03.A01 + f);
        this.A0e = false;
        A0I(i2, f2, (int) (widthWithMargin * f2));
        if (this.A0e) {
            return true;
        }
        throw new java.lang.IllegalStateException(strA08);
    }

    private final boolean A0a(int i) {
        android.view.View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        } else if (viewFindFocus != null) {
            boolean z = false;
            for (android.view.ViewParent parent = viewFindFocus.getParent(); parent instanceof android.view.ViewGroup; parent = parent.getParent()) {
                if (parent == this) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(viewFindFocus.getClass().getSimpleName());
                for (android.view.ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof android.view.ViewGroup; parent2 = parent2.getParent()) {
                    sb.append(A08(0, 4, 79)).append(parent2.getClass().getSimpleName());
                }
                android.util.Log.e(A08(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT, 9, 73), A08(309, 72, 43) + sb.toString());
                viewFindFocus = null;
            }
        }
        boolean zA0V = false;
        android.view.View nextFocused = android.view.FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        if (nextFocused != null && nextFocused != viewFindFocus) {
            if (i == 17) {
                zA0V = (viewFindFocus == null || A02(this.A0o, nextFocused).left < A02(this.A0o, viewFindFocus).left) ? nextFocused.requestFocus() : A0V();
            } else if (i == 66) {
                zA0V = (viewFindFocus == null || A02(this.A0o, nextFocused).left > A02(this.A0o, viewFindFocus).left) ? nextFocused.requestFocus() : A0W();
            }
        } else if (i == 17 || i == 1) {
            zA0V = A0V();
        } else if (i == 66 || i == 2) {
            zA0V = A0W();
        }
        if (zA0V) {
            playSoundEffect(android.view.SoundEffectConstants.getContantForFocusDirection(i));
        }
        return zA0V;
    }

    private final boolean A0b(android.view.KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        switch (keyEvent.getKeyCode()) {
            case 21:
                boolean handled = keyEvent.hasModifiers(2);
                if (handled) {
                    return A0V();
                }
                return A0a(17);
            case 22:
                boolean handled2 = keyEvent.hasModifiers(2);
                if (handled2) {
                    return A0W();
                }
                return A0a(66);
            case 61:
                boolean handled3 = keyEvent.hasNoModifiers();
                if (handled3) {
                    return A0a(2);
                }
                boolean handled4 = keyEvent.hasModifiers(1);
                if (!handled4) {
                    return false;
                }
                return A0a(1);
            default:
                return false;
        }
    }

    public static boolean A0c(android.view.View view) {
        return view.getClass().getAnnotation(com.facebook.ads.internal.androidx.support.v4.view.ViewPager$DecorView.class) != null;
    }

    private final boolean A0d(android.view.View view, boolean z, int i, int i2, int i3) {
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int count = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                android.view.View childAt = viewGroup.getChildAt(childCount);
                if (i2 + count >= childAt.getLeft() && i2 + count < childAt.getRight() && i3 + scrollY >= childAt.getTop() && i3 + scrollY < childAt.getBottom() && A0d(childAt, true, i, (i2 + count) - childAt.getLeft(), (i3 + scrollY) - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0062  */
    /* JADX WARN: Code duplicated, block: B:20:0x0065  */
    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    /* JADX WARN: Code duplicated, block: B:25:0x007f  */
    /* JADX WARN: Code duplicated, block: B:26:0x008d  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x002a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0030  */
    public final void A0e() {
        boolean z;
        int i;
        boolean z2;
        int i2;
        int adapterCount;
        int childCount;
        int newCurrItem;
        com.facebook.ads.redexgen.core.C03953a c03953a;
        com.facebook.ads.redexgen.core.C3Z c3z;
        int newPos;
        int i3;
        int iCharAt;
        int adapterCount2;
        int i4;
        int adapterCount3;
        int iCharAt2;
        int adapterCount4;
        int i5;
        int adapterCount5;
        int iA01 = this.A01.A01();
        this.A0G = iA01;
        int size = this.A0r.size();
        int adapterCount6 = this.A0L;
        if (size < (adapterCount6 * 2) + 1) {
            int size2 = this.A0r.size();
            if (A0t[0].length() == 15) {
                java.lang.String[] strArr = A0t;
                strArr[1] = "NUxzbYKB38C8830aSHSoc7rOuvQ6KKjw";
                strArr[7] = "E23nb8MxwjqpvKiqrD17l4bR7FdWFUoL";
                if (size2 < iA01) {
                    z = true;
                } else {
                    z = false;
                }
                i = this.A00;
                z2 = false;
                i2 = 0;
                while (i2 < adapterCount) {
                    c3z = this.A0r.get(i2);
                    newPos = this.A01.A02(c3z.A03);
                    if (newPos != -1) {
                        if (newPos == -2) {
                            this.A0r.remove(i2);
                            i2--;
                            if (!z2) {
                                z2 = true;
                            }
                            this.A01.A07(this, c3z.A02, c3z.A03);
                            z = true;
                            i5 = this.A00;
                            adapterCount5 = c3z.A02;
                            if (i5 == adapterCount5) {
                                int adapterCount7 = iA01 - 1;
                                i = java.lang.Math.max(0, java.lang.Math.min(this.A00, adapterCount7));
                                z = true;
                            }
                        } else {
                            i3 = c3z.A02;
                            java.lang.String[] strArr2 = A0t;
                            java.lang.String str = strArr2[1];
                            java.lang.String str2 = strArr2[7];
                            iCharAt = str.charAt(20);
                            adapterCount2 = str2.charAt(20);
                            if (iCharAt != adapterCount2) {
                                A0t[6] = "CXZhbfMOsfHqdudS8oUHBRPLwe0MhJzA";
                                if (i3 != newPos) {
                                    i4 = c3z.A02;
                                    adapterCount3 = this.A00;
                                    if (i4 == adapterCount3) {
                                        i = newPos;
                                    }
                                    c3z.A02 = newPos;
                                    java.lang.String[] strArr3 = A0t;
                                    java.lang.String str3 = strArr3[5];
                                    java.lang.String str4 = strArr3[3];
                                    iCharAt2 = str3.charAt(3);
                                    adapterCount4 = str4.charAt(3);
                                    if (iCharAt2 != adapterCount4) {
                                        throw new java.lang.RuntimeException();
                                    }
                                    java.lang.String[] strArr4 = A0t;
                                    strArr4[5] = "nuby1bZs8jKJK7rkqs9ajCRBcIxNm0YN";
                                    strArr4[3] = "0Rmx2JLm7aBulgdoCmfHMSHVIg2nPwRL";
                                    z = true;
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                    i2++;
                }
                java.util.Collections.sort(this.A0r, A0x);
                if (z) {
                    childCount = getChildCount();
                    for (newCurrItem = 0; newCurrItem < childCount; newCurrItem++) {
                        c03953a = (com.facebook.ads.redexgen.core.C03953a) getChildAt(newCurrItem).getLayoutParams();
                        if (!c03953a.A05) {
                            c03953a.A00 = 0.0f;
                        }
                    }
                    A0N(i, false, true);
                    requestLayout();
                    return;
                }
                return;
            }
        } else {
            z = false;
            i = this.A00;
            z2 = false;
            i2 = 0;
            while (i2 < adapterCount) {
                c3z = this.A0r.get(i2);
                newPos = this.A01.A02(c3z.A03);
                if (newPos != -1) {
                    if (newPos == -2) {
                        this.A0r.remove(i2);
                        i2--;
                        if (!z2) {
                            z2 = true;
                        }
                        this.A01.A07(this, c3z.A02, c3z.A03);
                        z = true;
                        i5 = this.A00;
                        adapterCount5 = c3z.A02;
                        if (i5 == adapterCount5) {
                            int adapterCount8 = iA01 - 1;
                            i = java.lang.Math.max(0, java.lang.Math.min(this.A00, adapterCount8));
                            z = true;
                        }
                    } else {
                        i3 = c3z.A02;
                        java.lang.String[] strArr5 = A0t;
                        java.lang.String str5 = strArr5[1];
                        java.lang.String str6 = strArr5[7];
                        iCharAt = str5.charAt(20);
                        adapterCount2 = str6.charAt(20);
                        if (iCharAt != adapterCount2) {
                            A0t[6] = "CXZhbfMOsfHqdudS8oUHBRPLwe0MhJzA";
                            if (i3 != newPos) {
                                i4 = c3z.A02;
                                adapterCount3 = this.A00;
                                if (i4 == adapterCount3) {
                                    i = newPos;
                                }
                                c3z.A02 = newPos;
                                java.lang.String[] strArr6 = A0t;
                                java.lang.String str7 = strArr6[5];
                                java.lang.String str8 = strArr6[3];
                                iCharAt2 = str7.charAt(3);
                                adapterCount4 = str8.charAt(3);
                                if (iCharAt2 != adapterCount4) {
                                    throw new java.lang.RuntimeException();
                                }
                                java.lang.String[] strArr7 = A0t;
                                strArr7[5] = "nuby1bZs8jKJK7rkqs9ajCRBcIxNm0YN";
                                strArr7[3] = "0Rmx2JLm7aBulgdoCmfHMSHVIg2nPwRL";
                                z = true;
                            } else {
                                continue;
                            }
                        }
                    }
                }
                i2++;
            }
            java.util.Collections.sort(this.A0r, A0x);
            if (z) {
                childCount = getChildCount();
                while (newCurrItem < childCount) {
                    c03953a = (com.facebook.ads.redexgen.core.C03953a) getChildAt(newCurrItem).getLayoutParams();
                    if (!c03953a.A05) {
                        c03953a.A00 = 0.0f;
                    }
                }
                A0N(i, false, true);
                requestLayout();
                return;
            }
            return;
        }
        throw new java.lang.RuntimeException();
    }

    public final void A0f() {
        A0G(this.A00);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(java.util.ArrayList<android.view.View> views, int i, int i2) {
        com.facebook.ads.redexgen.core.C3Z c3zA07;
        int size = views.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            int i3 = 0;
            while (true) {
                int childCount = getChildCount();
                int descendantFocusability2 = A0t[6].charAt(18);
                if (descendantFocusability2 == 53) {
                    throw new java.lang.RuntimeException();
                }
                A0t[0] = "IpvXuWuZmfdtaN6";
                if (i3 >= childCount) {
                    break;
                }
                android.view.View childAt = getChildAt(i3);
                int focusableCount = childAt.getVisibility();
                if (focusableCount == 0 && (c3zA07 = A07(childAt)) != null) {
                    int descendantFocusability3 = c3zA07.A02;
                    int focusableCount2 = this.A00;
                    if (descendantFocusability3 == focusableCount2) {
                        childAt.addFocusables(views, i, i2);
                    }
                }
                i3++;
            }
        }
        if (descendantFocusability == 262144) {
            int focusableCount3 = views.size();
            if (size != focusableCount3) {
                return;
            }
        }
        if (!isFocusable()) {
            return;
        }
        int descendantFocusability4 = i2 & 1;
        if ((descendantFocusability4 != 1 || !isInTouchMode() || isFocusableInTouchMode()) && views != null) {
            views.add(this);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        com.facebook.ads.redexgen.core.C03953a c03953a = (com.facebook.ads.redexgen.core.C03953a) layoutParams;
        boolean z = c03953a.A05;
        java.lang.String[] strArr = A0t;
        if (strArr[4].charAt(21) != strArr[2].charAt(21)) {
            throw new java.lang.RuntimeException();
        }
        A0t[6] = "0hKurRTmjdCHvNVYXWivI507L49T3Iz9";
        c03953a.A05 = z | A0c(view);
        if (this.A0h) {
            if (c03953a == null || !c03953a.A05) {
                c03953a.A03 = true;
                addViewInLayout(view, i, layoutParams);
                return;
            }
            throw new java.lang.IllegalStateException(A08(86, 41, 27));
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.A01 == null) {
            return false;
        }
        int width = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            return scrollX > ((int) (((float) width) * this.A02));
        }
        return i > 0 && scrollX < ((int) (((float) width) * this.A07));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof com.facebook.ads.redexgen.core.C03953a) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.A0j = true;
        if (!this.A0X.isFinished() && this.A0X.computeScrollOffset()) {
            int scrollX = getScrollX();
            int y = getScrollY();
            int x = this.A0X.getCurrX();
            int oldY = this.A0X.getCurrY();
            if (scrollX != x || y != oldY) {
                scrollTo(x, oldY);
                if (!A0Z(x)) {
                    this.A0X.abortAnimation();
                    scrollTo(0, oldY);
                }
            }
            com.facebook.ads.redexgen.core.C3T.A07(this);
            return;
        }
        A0R(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || A0b(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            boolean zDispatchPopulateAccessibilityEvent = super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
            java.lang.String[] strArr = A0t;
            if (strArr[1].charAt(20) != strArr[7].charAt(20)) {
                java.lang.String[] strArr2 = A0t;
                strArr2[5] = "SnNuJhKin8DS21TzQefDZ7b1qeceX1Jv";
                strArr2[3] = "R0wvzxNXSAt5doStTJlFm1lxESFLXhHC";
                return zDispatchPopulateAccessibilityEvent;
            }
        } else {
            int childCount = getChildCount();
            if (A0t[0].length() == 15) {
                A0t[6] = "LA2rc0K0poOotSQUO6QKpLGNHvEBCZdG";
                for (int i = 0; i < childCount; i++) {
                    android.view.View childAt = getChildAt(i);
                    int childCount2 = childAt.getVisibility();
                    if (childCount2 == 0) {
                        com.facebook.ads.redexgen.core.C3Z c3zA07 = A07(childAt);
                        java.lang.String[] strArr3 = A0t;
                        java.lang.String str = strArr3[1];
                        java.lang.String str2 = strArr3[7];
                        int i2 = str.charAt(20);
                        int childCount3 = str2.charAt(20);
                        if (i2 == childCount3) {
                            throw new java.lang.RuntimeException();
                        }
                        java.lang.String[] strArr4 = A0t;
                        strArr4[1] = "08daBwAiC3e1eMunN04MWwSicEkZtb5w";
                        strArr4[7] = "VX7AcKsgdRXMMXDzaUN7bbmrPcZJNGdB";
                        if (c3zA07 != null) {
                            int i3 = c3zA07.A02;
                            int childCount4 = this.A00;
                            if (i3 == childCount4 && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                                return true;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                return false;
            }
        }
        throw new java.lang.RuntimeException();
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas canvas) {
        super.draw(canvas);
        boolean z = false;
        int overScrollMode = getOverScrollMode();
        if (overScrollMode == 0 || (overScrollMode == 1 && this.A01 != null && this.A01.A01() > 1)) {
            android.widget.EdgeEffect edgeEffect = this.A0V;
            int overScrollMode2 = A0t[0].length();
            if (overScrollMode2 != 15) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0t;
            strArr[4] = "05N514BeFeDJgHlm81yP34LPQc7rkHPA";
            strArr[2] = "pzL9ltF7r1sXjfs3WepY84pTO2WENAbf";
            boolean needsInvalidate = edgeEffect.isFinished();
            if (!needsInvalidate) {
                int iSave = canvas.save();
                int width = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int height = getWidth();
                canvas.rotate(270.0f);
                int overScrollMode3 = -width;
                canvas.translate(overScrollMode3 + getPaddingTop(), this.A02 * height);
                this.A0V.setSize(width, height);
                boolean needsInvalidate2 = this.A0V.draw(canvas);
                z = false | needsInvalidate2;
                canvas.restoreToCount(iSave);
            }
            boolean needsInvalidate3 = this.A0W.isFinished();
            if (!needsInvalidate3) {
                int width2 = canvas.save();
                int width3 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.A07 + 1.0f)) * width3);
                this.A0W.setSize(height2, width3);
                boolean needsInvalidate4 = this.A0W.draw(canvas);
                z |= needsInvalidate4;
                canvas.restoreToCount(width2);
            }
        } else {
            this.A0V.finish();
            this.A0W.finish();
        }
        if (z) {
            com.facebook.ads.redexgen.core.C3T.A07(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        android.graphics.drawable.Drawable drawable = this.A0S;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new com.facebook.ads.redexgen.core.C03953a();
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new com.facebook.ads.redexgen.core.C03953a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public com.facebook.ads.redexgen.core.C3E getAdapter() {
        return this.A01;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int result = this.A0F == 2 ? (i - 1) - i2 : i2;
        int index = ((com.facebook.ads.redexgen.core.C03953a) this.A0b.get(result).getLayoutParams()).A01;
        return index;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public int getCurrentItem() {
        return this.A00;
    }

    public int getOffscreenPageLimit() {
        return this.A0L;
    }

    public int getPageMargin() {
        return this.A0M;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0g = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.A0q);
        if (this.A0X != null && !this.A0X.isFinished()) {
            this.A0X.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        float f;
        super.onDraw(canvas);
        if (this.A0M > 0 && this.A0S != null && this.A0r.size() > 0 && this.A01 != null) {
            int scrollX = getScrollX();
            int pos = getWidth();
            float f2 = this.A0M / pos;
            int firstPos = 0;
            com.facebook.ads.redexgen.core.C3Z c3z = this.A0r.get(0);
            float marginOffset = c3z.A00;
            int itemCount = this.A0r.size();
            int i = this.A0r.get(itemCount - 1).A02;
            for (int i2 = c3z.A02; i2 < i; i2++) {
                while (i2 > c3z.A02 && firstPos < itemCount) {
                    firstPos++;
                    c3z = this.A0r.get(firstPos);
                }
                if (i2 == c3z.A02) {
                    f = (c3z.A00 + c3z.A01) * pos;
                    float marginOffset2 = c3z.A00;
                    marginOffset = marginOffset2 + c3z.A01 + f2;
                } else {
                    float fA00 = this.A01.A00(i2);
                    f = (marginOffset + fA00) * pos;
                    marginOffset += fA00 + f2;
                }
                if (this.A0M + f > scrollX) {
                    android.graphics.drawable.Drawable drawable = this.A0S;
                    int iRound = java.lang.Math.round(f);
                    int i3 = this.A0Q;
                    int width = java.lang.Math.round(this.A0M + f);
                    drawable.setBounds(iRound, i3, width, this.A09);
                    this.A0S.draw(canvas);
                }
                if (f > scrollX + pos) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0073 A[PHI: r1
  0x0073: PHI (r1v19 float) = (r1v12 float), (r1v20 float) binds: [B:35:0x00a0, B:27:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        float f;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            A0U();
            return false;
        }
        if (action != 0) {
            if (this.A0i) {
                return true;
            }
            if (this.A0k) {
                return false;
            }
        }
        switch (action) {
            case 0:
                float x = motionEvent.getX();
                this.A03 = x;
                this.A05 = x;
                float y = motionEvent.getY();
                this.A04 = y;
                this.A06 = y;
                this.A08 = motionEvent.getPointerId(0);
                this.A0k = false;
                this.A0j = true;
                this.A0X.computeScrollOffset();
                if (this.A0P != 2 || java.lang.Math.abs(this.A0X.getFinalX() - this.A0X.getCurrX()) <= this.A0C) {
                    A0R(false);
                    this.A0i = false;
                } else {
                    this.A0X.abortAnimation();
                    this.A0m = false;
                    A0f();
                    this.A0i = true;
                    A0T(true);
                    setScrollState(1);
                }
                break;
            case 2:
                int i = this.A08;
                if (i != -1) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i);
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    float f2 = x2 - this.A05;
                    float fAbs = java.lang.Math.abs(f2);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    float y3 = java.lang.Math.abs(y2 - this.A04);
                    if (A0t[0].length() != 15) {
                        f = 0.0f;
                        if (f2 != 0.0f) {
                            if (!A0Y(this.A05, f2) && A0d(this, false, (int) f2, (int) x2, (int) y2)) {
                                this.A05 = x2;
                                this.A06 = y2;
                                this.A0k = true;
                                return false;
                            }
                        }
                    } else {
                        java.lang.String[] strArr = A0t;
                        strArr[1] = "2mSFRFxNhkhE5V58FIjiOaI1HMcnWaQH";
                        strArr[7] = "DD1Vl4odvM0LFeMw4Y0kpPn9PiY9Pgji";
                        f = 0.0f;
                        if (f2 != 0.0f) {
                            if (!A0Y(this.A05, f2)) {
                                this.A05 = x2;
                                this.A06 = y2;
                                this.A0k = true;
                                return false;
                            }
                        }
                    }
                    if (fAbs > this.A0R && 0.5f * fAbs > y3) {
                        this.A0i = true;
                        A0T(true);
                        setScrollState(1);
                        this.A05 = f2 > f ? this.A03 + this.A0R : this.A03 - this.A0R;
                        this.A06 = y2;
                        setScrollingCacheEnabled(true);
                    } else if (y3 > this.A0R) {
                        this.A0k = true;
                    }
                    if (this.A0i && A0X(x2)) {
                        com.facebook.ads.redexgen.core.C3T.A07(this);
                    }
                }
                break;
            case 6:
                A0P(motionEvent);
                break;
        }
        android.view.VelocityTracker velocityTracker = this.A0U;
        if (A0t[0].length() != 15) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0t;
        strArr2[5] = "Ahq8EZKp9TCcvWp5KGK4NZLMSiBqs7aW";
        strArr2[3] = "zhUlAvocS2Bx9TU9L2ybIINdNSgG3BiY";
        if (velocityTracker == null) {
            this.A0U = android.view.VelocityTracker.obtain();
        }
        this.A0U.addMovement(motionEvent);
        return this.A0i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        com.facebook.ads.redexgen.core.C3Z c3zA07;
        int paddingRight;
        int count;
        int scrollX = getChildCount();
        int childTop = i3 - i;
        int childWidth = i4 - i2;
        int vgrav = getPaddingLeft();
        int width = getPaddingTop();
        int childLeft = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int hgrav = getScrollX();
        int i5 = 0;
        int paddingTop = 0;
        while (true) {
            int count2 = 8;
            if (paddingTop < scrollX) {
                android.view.View childAt = getChildAt(paddingTop);
                if (childAt.getVisibility() != 8) {
                    com.facebook.ads.redexgen.core.C03953a c03953a = (com.facebook.ads.redexgen.core.C03953a) childAt.getLayoutParams();
                    if (c03953a.A05) {
                        int count3 = c03953a.A04 & 7;
                        int childTop2 = c03953a.A04 & 112;
                        switch (count3) {
                            case 1:
                                paddingRight = java.lang.Math.max((childTop - childAt.getMeasuredWidth()) / 2, vgrav);
                                break;
                            case 2:
                            case 4:
                            default:
                                paddingRight = vgrav;
                                break;
                            case 3:
                                paddingRight = vgrav;
                                int paddingBottom2 = childAt.getMeasuredWidth();
                                java.lang.String[] strArr = A0t;
                                java.lang.String str = strArr[1];
                                java.lang.String str2 = strArr[7];
                                int count4 = str.charAt(20);
                                if (count4 == str2.charAt(20)) {
                                    throw new java.lang.RuntimeException();
                                }
                                A0t[0] = "4DhY9NaEfbkSZ9C";
                                vgrav += paddingBottom2;
                                break;
                                break;
                            case 5:
                                int paddingRight2 = childTop - childLeft;
                                paddingRight = paddingRight2 - childAt.getMeasuredWidth();
                                childLeft += childAt.getMeasuredWidth();
                                break;
                        }
                        switch (childTop2) {
                            case 16:
                                count = java.lang.Math.max((childWidth - childAt.getMeasuredHeight()) / 2, width);
                                break;
                            case 48:
                                count = width;
                                width += childAt.getMeasuredHeight();
                                break;
                            case 80:
                                int count5 = childWidth - paddingBottom;
                                count = count5 - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                                break;
                            default:
                                count = width;
                                break;
                        }
                        int paddingRight3 = paddingRight + hgrav;
                        childAt.layout(paddingRight3, count, paddingRight3 + childAt.getMeasuredWidth(), childAt.getMeasuredHeight() + count);
                        i5++;
                    } else {
                        continue;
                    }
                }
                paddingTop++;
            } else {
                int childLeft2 = (childTop - vgrav) - childLeft;
                int paddingBottom3 = 0;
                while (paddingBottom3 < scrollX) {
                    android.view.View childAt2 = getChildAt(paddingBottom3);
                    if (childAt2.getVisibility() != count2) {
                        com.facebook.ads.redexgen.core.C03953a c03953a2 = (com.facebook.ads.redexgen.core.C03953a) childAt2.getLayoutParams();
                        if (!c03953a2.A05 && (c3zA07 = A07(childAt2)) != null) {
                            int i6 = vgrav + ((int) (childLeft2 * c3zA07.A00));
                            if (c03953a2.A03) {
                                c03953a2.A03 = false;
                                int widthSpec = android.view.View.MeasureSpec.makeMeasureSpec((int) (childLeft2 * c03953a2.A00), 1073741824);
                                childAt2.measure(widthSpec, android.view.View.MeasureSpec.makeMeasureSpec((childWidth - width) - paddingBottom, 1073741824));
                            }
                            int childTop3 = childAt2.getMeasuredWidth() + i6;
                            width = width;
                            int height = childAt2.getMeasuredHeight() + width;
                            java.lang.String[] strArr2 = A0t;
                            java.lang.String str3 = strArr2[1];
                            java.lang.String str4 = strArr2[7];
                            int widthSpec2 = str3.charAt(20);
                            if (widthSpec2 != str4.charAt(20)) {
                                java.lang.String[] strArr3 = A0t;
                                strArr3[1] = "z1EGVKAINgCK1pWg9AJjq4tA4jzMvRMS";
                                strArr3[7] = "NHHZP3L5Wb2TlMM1gmFw9TkZDHFcmZzw";
                                childAt2.layout(i6, width, childTop3, height);
                            } else {
                                childAt2.layout(i6, width, childTop3, height);
                            }
                        }
                    }
                    paddingBottom3++;
                    count2 = 8;
                }
                this.A0Q = width;
                this.A09 = childWidth - paddingBottom;
                this.A0D = i5;
                if (this.A0g) {
                    z2 = false;
                    A0M(this.A00, false, 0, false);
                } else {
                    z2 = false;
                }
                this.A0g = z2;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, android.graphics.Rect rect) {
        int i2;
        int end;
        com.facebook.ads.redexgen.core.C3Z c3zA07;
        int childCount = getChildCount();
        int count = i & 2;
        if (count != 0) {
            i2 = 0;
            end = 1;
        } else {
            i2 = childCount - 1;
            end = -1;
            childCount = -1;
        }
        while (i2 != childCount) {
            android.view.View childAt = getChildAt(i2);
            int count2 = childAt.getVisibility();
            if (count2 == 0 && (c3zA07 = A07(childAt)) != null) {
                int index = c3zA07.A02;
                int count3 = this.A00;
                if (index == count3 && childAt.requestFocus(i, rect)) {
                    int index2 = A0t[6].charAt(18);
                    if (index2 == 53) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr = A0t;
                    strArr[4] = "Znu0WDOQkx79zIIXKJQFb47iIrfdw3ED";
                    strArr[2] = "SboSqac50StP5vJHTPKGX42Xta1ZIbyJ";
                    return true;
                }
            }
            i2 += end;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof com.facebook.ads.internal.util.parcelable.WrappedParcelable)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        java.lang.ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            classLoader = getContext().getClassLoader();
        }
        android.os.Parcelable state = ((com.facebook.ads.internal.util.parcelable.WrappedParcelable) parcelable).unwrap(classLoader);
        if (!(state instanceof com.facebook.ads.internal.androidx.support.v4.view.ViewPager$SavedState)) {
            super.onRestoreInstanceState(state);
            return;
        }
        com.facebook.ads.internal.androidx.support.v4.view.ViewPager$SavedState viewPager$SavedState = (com.facebook.ads.internal.androidx.support.v4.view.ViewPager$SavedState) state;
        super.onRestoreInstanceState(viewPager$SavedState.A02());
        if (this.A01 != null) {
            A0N(viewPager$SavedState.A00, false, true);
            return;
        }
        this.A0O = viewPager$SavedState.A00;
        this.A0T = viewPager$SavedState.A01;
        this.A0a = viewPager$SavedState.A02;
    }

    @Override // android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
        android.os.Parcelable superState = super.onSaveInstanceState();
        com.facebook.ads.internal.androidx.support.v4.view.ViewPager$SavedState ss = new com.facebook.ads.internal.androidx.support.v4.view.ViewPager$SavedState(superState);
        ss.A00 = this.A00;
        if (this.A01 != null) {
            android.os.Parcelable superState2 = this.A01.A03();
            ss.A01 = superState2;
        }
        android.os.Parcelable superState3 = new com.facebook.ads.internal.util.parcelable.WrappedParcelable(ss);
        return superState3;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            A0K(i, i3, this.A0M, this.A0M);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(android.view.View view) {
        if (this.A0h) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [com.facebook.ads.redexgen.X.3e] */
    public void setAdapter(com.facebook.ads.redexgen.core.C3E c3e) {
        if (this.A01 != null) {
            this.A01.A06(null);
            for (int i = 0; i < i; i++) {
                com.facebook.ads.redexgen.core.C3Z c3z = this.A0r.get(i);
                this.A01.A07(this, c3z.A02, c3z.A03);
            }
            java.util.ArrayList<com.facebook.ads.redexgen.core.C3Z> arrayList = this.A0r;
            java.lang.String[] strArr = A0t;
            if (strArr[5].charAt(3) == strArr[3].charAt(3)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0t;
            strArr2[5] = "5tjoWE4Q5tO0E95pkDqQ6gCRa23v2VF9";
            strArr2[3] = "zPJLPuVWeZXbdPcD4tg2pz6GDm3T23cV";
            arrayList.clear();
            A0A();
            this.A00 = 0;
            scrollTo(0, 0);
        }
        this.A01 = c3e;
        this.A0G = 0;
        com.facebook.ads.redexgen.core.C3E oldAdapter = this.A01;
        if (oldAdapter != null) {
            if (this.A0Z == null) {
                this.A0Z = new android.database.DataSetObserver() { // from class: com.facebook.ads.redexgen.X.3e
                    @Override // android.database.DataSetObserver
                    public final void onChanged() {
                        this.A00.A0e();
                    }

                    @Override // android.database.DataSetObserver
                    public final void onInvalidated() {
                        this.A00.A0e();
                    }
                };
            }
            this.A01.A06(this.A0Z);
            this.A0m = false;
            boolean z = this.A0g;
            this.A0g = true;
            com.facebook.ads.redexgen.core.C3E oldAdapter2 = this.A01;
            this.A0G = oldAdapter2.A01();
            if (this.A0O >= 0) {
                A0N(this.A0O, false, true);
                this.A0O = -1;
                this.A0T = null;
                this.A0a = null;
            } else if (!z) {
                A0f();
            } else {
                requestLayout();
            }
        }
        if (this.A0c != null && !this.A0c.isEmpty() && 0 < this.A0c.size()) {
            this.A0c.get(0);
            throw new java.lang.NullPointerException(A08(381, 16, 99));
        }
    }

    public void setCurrentItem(int i) {
        this.A0m = false;
        A0N(i, !this.A0g, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            android.util.Log.w(A08(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT, 9, 73), A08(127, 31, 122) + i + A08(51, 26, 45) + 1);
            i = 1;
        }
        if (i != this.A0L) {
            this.A0L = i;
            A0f();
        }
    }

    @java.lang.Deprecated
    public void setOnPageChangeListener(com.facebook.ads.redexgen.core.InterfaceC03973c interfaceC03973c) {
        this.A0Y = interfaceC03973c;
    }

    public void setPageMargin(int i) {
        int width = this.A0M;
        this.A0M = i;
        int oldMargin = getWidth();
        A0K(oldMargin, oldMargin, i, width);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(com.facebook.ads.redexgen.core.AbstractC03792k.A00(getContext(), i));
    }

    public void setPageMarginDrawable(android.graphics.drawable.Drawable drawable) {
        this.A0S = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i) {
        if (this.A0P == i) {
            return;
        }
        this.A0P = i;
        if (0 != 0) {
            A0S(i != 0);
        }
        A0F(i);
        if (A0t[6].charAt(18) == '5') {
            throw new java.lang.RuntimeException();
        }
        A0t[0] = "blMFZWDPlO2VlWf";
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.A0n != z) {
            this.A0n = z;
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.A0S;
    }
}
