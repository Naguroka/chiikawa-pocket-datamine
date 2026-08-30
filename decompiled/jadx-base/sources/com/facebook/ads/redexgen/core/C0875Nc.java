package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0875Nc extends android.view.ViewGroup {
    public static java.lang.String[] A01 = {"NZkFYUXBqTyLE0uJAv5x9NXUc2VI7sJS", "uR57PzkU", "rJSYxMTue9BrtOECqhcg2GfuYah", "YyZf9NPrzEzMWmx1W7C7iqaeo0zUpAtl", "DTiQjOeLHS2Pt5vxV6oLe4amAnidYBVC", "lHnCa3run773rLwZ2hjgCXNXpXLX76yu", "KbQZcAmLw4PS1PAelm", "IRe5OrXcLx0wSVTSjdWVVTt7WICaTRCE"};
    public static final int A02 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 8.0f);
    public int A00;

    public C0875Nc(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        super(c1199Zs);
        setMotionEventSplittingEnabled(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int childWidth = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i6 = 0; i6 < width; i6++) {
            android.view.View childAt = getChildAt(i6);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i7 = childWidth + measuredWidth;
            int xPos = A01[4].charAt(29);
            if (xPos != 66) {
                throw new java.lang.RuntimeException();
            }
            A01[4] = "OfxBdDbwWwaKkhkWo9ENaAyC2bgPxB1w";
            if (i7 > i5) {
                childWidth = getPaddingLeft();
                int width = this.A00;
                paddingTop += width;
            }
            int xPos2 = childWidth + measuredWidth;
            int width2 = paddingTop + measuredHeight;
            childAt.layout(childWidth, paddingTop, xPos2, width2);
            int width3 = A02;
            childWidth += width3 + measuredWidth;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int childHeightMeasureSpec = (android.view.View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int size = android.view.View.MeasureSpec.getSize(i2);
        int width = getPaddingTop();
        int i3 = size - width;
        int width2 = getPaddingBottom();
        int height = i3 - width2;
        int paddingLeft = getPaddingLeft();
        int i4 = 0;
        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE);
        int width3 = getChildCount();
        int childWidth = width3 > 0 ? 1 : 0;
        for (int lineHeight = 0; lineHeight < width; lineHeight++) {
            android.view.View childAt = getChildAt(lineHeight);
            int width4 = android.view.View.MeasureSpec.makeMeasureSpec(childHeightMeasureSpec, Integer.MIN_VALUE);
            childAt.measure(width4, iMakeMeasureSpec);
            int xPos = childAt.getMeasuredWidth();
            int height2 = childAt.getMeasuredHeight();
            int width5 = A02;
            i4 = java.lang.Math.max(i4, height2 + width5);
            int width6 = paddingLeft + xPos;
            if (width6 > childHeightMeasureSpec) {
                childWidth++;
                paddingLeft = getPaddingLeft();
            }
            int i5 = A02 + xPos;
            java.lang.String[] strArr = A01;
            java.lang.String str = strArr[5];
            java.lang.String str2 = strArr[0];
            int height3 = str.charAt(28);
            int width7 = str2.charAt(28);
            if (height3 != width7) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A01;
            strArr2[5] = "n9Mm7W7nMoMcqU3dmLdt8wDmLs9m7g2q";
            strArr2[0] = "514SZhPsQ7DKXYFFbCEhDr5q0ZnH7KeP";
            paddingLeft += i5;
        }
        this.A00 = i4;
        int height4 = this.A00;
        int width8 = A02;
        setMeasuredDimension(childHeightMeasureSpec, (height4 * childWidth) + width8);
    }
}
