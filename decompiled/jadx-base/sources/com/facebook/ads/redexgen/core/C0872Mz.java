package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0872Mz extends android.widget.ImageView {
    public static java.lang.String[] A01 = {"zJ2", "QjUwZCbDUlfOcmdTeXyvd13", "pmgXUgQY3G9embGve5GBnFw0VEVT9oeH", "awdDomzwyqRyeOiEyYHeXSv00pR55TnX", "BJj1MoNnpM6JKdO5Mh8uM61yAFI5TCy", "1E", "dRD1sNctYpeCeu2V1pPS6WM", "8C9irfg3VZNd6lZFm"};
    public android.widget.ImageView.ScaleType A00;

    public C0872Mz(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        super(c1199Zs);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX WARN: Code duplicated, block: B:13:0x002d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x0048  */
    /* JADX WARN: Code duplicated, block: B:20:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    /* JADX WARN: Code duplicated, block: B:23:0x005b  */
    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int heightSpecSize;
        int mode;
        int widthSpecSize;
        int size = android.view.View.MeasureSpec.getSize(i2);
        int size2 = android.view.View.MeasureSpec.getSize(i);
        int heightSpecSize2 = android.view.View.MeasureSpec.getMode(i);
        if (heightSpecSize2 == 1073741824) {
            int heightSpecSize3 = android.view.View.MeasureSpec.getMode(i2);
            if (heightSpecSize3 == 1073741824) {
                int heightSpecSize4 = java.lang.Math.min(size2, size);
                setMeasuredDimension(heightSpecSize4, heightSpecSize4);
            } else {
                heightSpecSize = android.view.View.MeasureSpec.getMode(i);
                if (heightSpecSize == 1073741824) {
                    if (size > 0) {
                        size2 = java.lang.Math.min(size2, size);
                    }
                    setMeasuredDimension(size2, size2);
                } else {
                    mode = android.view.View.MeasureSpec.getMode(i2);
                    widthSpecSize = A01[6].length();
                    if (widthSpecSize != 25) {
                        throw new java.lang.RuntimeException();
                    }
                    A01[7] = "z6sTWRHNr9jgarJvj";
                    if (mode == 1073741824) {
                        if (size2 > 0) {
                            size = java.lang.Math.min(size2, size);
                        }
                        setMeasuredDimension(size, size);
                    } else {
                        super.onMeasure(i, i2);
                    }
                }
            }
        } else {
            heightSpecSize = android.view.View.MeasureSpec.getMode(i);
            if (heightSpecSize == 1073741824) {
                if (size > 0) {
                    size2 = java.lang.Math.min(size2, size);
                }
                setMeasuredDimension(size2, size2);
            } else {
                mode = android.view.View.MeasureSpec.getMode(i2);
                widthSpecSize = A01[6].length();
                if (widthSpecSize != 25) {
                    throw new java.lang.RuntimeException();
                }
                A01[7] = "z6sTWRHNr9jgarJvj";
                if (mode == 1073741824) {
                    if (size2 > 0) {
                        size = java.lang.Math.min(size2, size);
                    }
                    setMeasuredDimension(size, size);
                } else {
                    super.onMeasure(i, i2);
                }
            }
        }
        if (this.A00 != null) {
            super.setScaleType(this.A00);
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(android.widget.ImageView.ScaleType scaleType) {
        this.A00 = scaleType;
    }
}
