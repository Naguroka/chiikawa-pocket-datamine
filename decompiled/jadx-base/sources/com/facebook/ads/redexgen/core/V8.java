package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class V8 extends com.facebook.ads.redexgen.core.OU {
    public static java.lang.String[] A01 = {"Er9uQMazYAvywc84qssi8CcPD5K", "bpAOsy1ZAool4ZO", "456cLSbicHverE2", "OQn0GSeoKkB55mmrW6XfcsGu8yTW4vwY", "5C5KK7QE3ZVmFSCl85soxjy8aya", "FZZqXqYfqR5sLOGe", "aaYiwVUQ6XuTYr3PnCNNWh", "fICxnQOCOsz8JBbFc5EZnQUEppLIkjem"};
    public android.widget.ImageView.ScaleType A00;

    public V8(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        super(c1199Zs);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0036  */
    /* JADX WARN: Code duplicated, block: B:15:0x003c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0046  */
    /* JADX WARN: Code duplicated, block: B:20:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0056  */
    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int heightSpecSize;
        int heightSpecSize2;
        int size = android.view.View.MeasureSpec.getSize(i2);
        int size2 = android.view.View.MeasureSpec.getSize(i);
        int heightSpecSize3 = android.view.View.MeasureSpec.getMode(i);
        if (heightSpecSize3 == 1073741824) {
            int heightSpecSize4 = android.view.View.MeasureSpec.getMode(i2);
            if (heightSpecSize4 == 1073741824) {
                int heightSpecSize5 = java.lang.Math.min(size2, size);
                setMeasuredDimension(heightSpecSize5, heightSpecSize5);
            } else {
                heightSpecSize = android.view.View.MeasureSpec.getMode(i);
                if (heightSpecSize == 1073741824) {
                    if (size > 0) {
                        size2 = java.lang.Math.min(size2, size);
                    }
                    setMeasuredDimension(size2, size2);
                } else {
                    heightSpecSize2 = android.view.View.MeasureSpec.getMode(i2);
                    if (heightSpecSize2 == 1073741824) {
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
                heightSpecSize2 = android.view.View.MeasureSpec.getMode(i2);
                if (heightSpecSize2 == 1073741824) {
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
            android.widget.ImageView.ScaleType scaleType = this.A00;
            int widthSpecSize = A01[2].length();
            if (widthSpecSize != 15) {
                throw new java.lang.RuntimeException();
            }
            A01[0] = "1TQeY3NJoCywMKTf";
            super.setScaleType(scaleType);
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(android.widget.ImageView.ScaleType scaleType) {
        this.A00 = scaleType;
    }
}
