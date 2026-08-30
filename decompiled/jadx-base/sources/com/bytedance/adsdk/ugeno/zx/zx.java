package com.bytedance.adsdk.ugeno.zx;

/* JADX INFO: loaded from: classes3.dex */
public class zx extends android.view.ViewGroup implements com.bytedance.adsdk.ugeno.zx.bg {
    private int IL;
    private android.graphics.drawable.Drawable Kg;
    private com.bytedance.adsdk.ugeno.zx.eqN Lq;
    private int PX;
    private int[] Ta;
    private int VB;
    private com.bytedance.adsdk.ugeno.zx.eqN.bg VzQ;
    private int WR;
    private int bX;
    private int bg;
    private int eo;
    private int eqN;
    private android.graphics.drawable.Drawable iR;
    private int ldr;
    private java.util.List<com.bytedance.adsdk.ugeno.zx.bX> vb;
    private com.bytedance.adsdk.ugeno.bX xxp;
    private android.util.SparseIntArray yDt;
    private int zx;

    @Override // com.bytedance.adsdk.ugeno.zx.bg
    public int bg(android.view.View view) {
        return 0;
    }

    public zx(android.content.Context context) {
        super(context, null);
        this.ldr = -1;
        this.Lq = new com.bytedance.adsdk.ugeno.zx.eqN(this);
        this.vb = new java.util.ArrayList();
        this.VzQ = new com.bytedance.adsdk.ugeno.zx.eqN.bg();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        com.bytedance.adsdk.ugeno.bX bXVar = this.xxp;
        if (bXVar != null) {
            int[] iArrBg = bXVar.bg(i, i2);
            bg(iArrBg[0], iArrBg[1]);
        } else {
            bg(i, i2);
        }
        com.bytedance.adsdk.ugeno.bX bXVar2 = this.xxp;
        if (bXVar2 != null) {
            bXVar2.zx();
        }
    }

    private void bg(int i, int i2) {
        if (this.yDt == null) {
            this.yDt = new android.util.SparseIntArray(getChildCount());
        }
        if (this.Lq.IL(this.yDt)) {
            this.Ta = this.Lq.bg(this.yDt);
        }
        int i3 = this.bg;
        if (i3 == 0 || i3 == 1) {
            IL(i, i2);
        } else {
            if (i3 == 2 || i3 == 3) {
                bX(i, i2);
                return;
            }
            throw new java.lang.IllegalStateException("Invalid value for the flex direction is set: " + this.bg);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.zx.bg
    public int getFlexItemCount() {
        return getChildCount();
    }

    @Override // com.bytedance.adsdk.ugeno.zx.bg
    public android.view.View bg(int i) {
        return getChildAt(i);
    }

    public android.view.View bX(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.Ta;
        if (i >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i]);
    }

    @Override // com.bytedance.adsdk.ugeno.zx.bg
    public android.view.View IL(int i) {
        return bX(i);
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        if (this.yDt == null) {
            this.yDt = new android.util.SparseIntArray(getChildCount());
        }
        this.Ta = this.Lq.bg(view, i, layoutParams, this.yDt);
        super.addView(view, i, layoutParams);
    }

    private void IL(int i, int i2) {
        this.vb.clear();
        this.VzQ.bg();
        this.Lq.bg(this.VzQ, i, i2);
        this.vb = this.VzQ.bg;
        this.Lq.bg(i, i2);
        if (this.eqN == 3) {
            for (com.bytedance.adsdk.ugeno.zx.bX bXVar : this.vb) {
                int iMax = Integer.MIN_VALUE;
                for (int i3 = 0; i3 < bXVar.Kg; i3++) {
                    android.view.View viewBX = bX(bXVar.Lq + i3);
                    if (viewBX != null && viewBX.getVisibility() != 8) {
                        com.bytedance.adsdk.ugeno.zx.zx.bg bgVar = (com.bytedance.adsdk.ugeno.zx.zx.bg) viewBX.getLayoutParams();
                        if (this.IL != 2) {
                            iMax = java.lang.Math.max(iMax, viewBX.getMeasuredHeight() + java.lang.Math.max(bXVar.PX - viewBX.getBaseline(), bgVar.topMargin) + bgVar.bottomMargin);
                        } else {
                            iMax = java.lang.Math.max(iMax, viewBX.getMeasuredHeight() + bgVar.topMargin + java.lang.Math.max((bXVar.PX - viewBX.getMeasuredHeight()) + viewBX.getBaseline(), bgVar.bottomMargin));
                        }
                    }
                }
                bXVar.iR = iMax;
            }
        }
        this.Lq.IL(i, i2, getPaddingTop() + getPaddingBottom());
        this.Lq.bg();
        bg(this.bg, i, i2, this.VzQ.IL);
    }

    private void bX(int i, int i2) {
        this.vb.clear();
        this.VzQ.bg();
        this.Lq.IL(this.VzQ, i, i2);
        this.vb = this.VzQ.bg;
        this.Lq.bg(i, i2);
        this.Lq.IL(i, i2, getPaddingLeft() + getPaddingRight());
        this.Lq.bg();
        bg(this.bg, i, i2, this.VzQ.IL);
    }

    private void bg(int i, int i2, int i3, int i4) {
        int sumOfCrossSize;
        int largestMainSize;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = android.view.View.MeasureSpec.getMode(i2);
        int size = android.view.View.MeasureSpec.getSize(i2);
        int mode2 = android.view.View.MeasureSpec.getMode(i3);
        int size2 = android.view.View.MeasureSpec.getSize(i3);
        if (i == 0 || i == 1) {
            sumOfCrossSize = getSumOfCrossSize() + getPaddingTop() + getPaddingBottom();
            largestMainSize = getLargestMainSize();
        } else if (i == 2 || i == 3) {
            sumOfCrossSize = getLargestMainSize();
            largestMainSize = getSumOfCrossSize() + getPaddingLeft() + getPaddingRight();
        } else {
            throw new java.lang.IllegalArgumentException("Invalid flex direction: ".concat(java.lang.String.valueOf(i)));
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i4 = android.view.View.combineMeasuredStates(i4, 16777216);
            } else {
                size = largestMainSize;
            }
            iResolveSizeAndState = android.view.View.resolveSizeAndState(size, i2, i4);
        } else if (mode == 0) {
            iResolveSizeAndState = android.view.View.resolveSizeAndState(largestMainSize, i2, i4);
        } else if (mode == 1073741824) {
            if (size < largestMainSize) {
                i4 = android.view.View.combineMeasuredStates(i4, 16777216);
            }
            iResolveSizeAndState = android.view.View.resolveSizeAndState(size, i2, i4);
        } else {
            throw new java.lang.IllegalStateException("Unknown width mode is set: ".concat(java.lang.String.valueOf(mode)));
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < sumOfCrossSize) {
                i4 = android.view.View.combineMeasuredStates(i4, 256);
            } else {
                size2 = sumOfCrossSize;
            }
            iResolveSizeAndState2 = android.view.View.resolveSizeAndState(size2, i3, i4);
        } else if (mode2 == 0) {
            iResolveSizeAndState2 = android.view.View.resolveSizeAndState(sumOfCrossSize, i3, i4);
        } else if (mode2 == 1073741824) {
            if (size2 < sumOfCrossSize) {
                i4 = android.view.View.combineMeasuredStates(i4, 256);
            }
            iResolveSizeAndState2 = android.view.View.resolveSizeAndState(size2, i3, i4);
        } else {
            throw new java.lang.IllegalStateException("Unknown height mode is set: ".concat(java.lang.String.valueOf(mode2)));
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    @Override // com.bytedance.adsdk.ugeno.zx.bg
    public int getLargestMainSize() {
        java.util.Iterator<com.bytedance.adsdk.ugeno.zx.bX> it = this.vb.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it.hasNext()) {
            iMax = java.lang.Math.max(iMax, it.next().zx);
        }
        return iMax;
    }

    @Override // com.bytedance.adsdk.ugeno.zx.bg
    public int getSumOfCrossSize() {
        int i;
        int i2;
        int size = this.vb.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            com.bytedance.adsdk.ugeno.zx.bX bXVar = this.vb.get(i4);
            if (eqN(i4)) {
                if (bg()) {
                    i2 = this.VB;
                } else {
                    i2 = this.PX;
                }
                i3 += i2;
            }
            if (ldr(i4)) {
                if (bg()) {
                    i = this.VB;
                } else {
                    i = this.PX;
                }
                i3 += i;
            }
            i3 += bXVar.iR;
        }
        return i3;
    }

    @Override // com.bytedance.adsdk.ugeno.zx.bg
    public boolean bg() {
        int i = this.bg;
        return i == 0 || i == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        com.bytedance.adsdk.ugeno.bX bXVar = this.xxp;
        if (bXVar != null) {
            bXVar.ldr();
        }
        int iBg = com.bytedance.adsdk.ugeno.iR.iR.bg(this);
        int i5 = this.bg;
        if (i5 == 0) {
            bg(iBg == 1, i, i2, i3, i4);
        } else if (i5 == 1) {
            bg(iBg != 1, i, i2, i3, i4);
        } else if (i5 == 2) {
            z2 = iBg == 1;
            bg(this.IL == 2 ? !z2 : z2, false, i, i2, i3, i4);
        } else if (i5 == 3) {
            z2 = iBg == 1;
            bg(this.IL == 2 ? !z2 : z2, true, i, i2, i3, i4);
        } else {
            throw new java.lang.IllegalStateException("Invalid flex direction is set: " + this.bg);
        }
        com.bytedance.adsdk.ugeno.bX bXVar2 = this.xxp;
        if (bXVar2 != null) {
            bXVar2.bg(i, i2, i3, i4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00de  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:49:0x0105  */
    /* JADX WARN: Code duplicated, block: B:52:0x010e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0116  */
    /* JADX WARN: Code duplicated, block: B:55:0x011b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0124 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0126  */
    /* JADX WARN: Code duplicated, block: B:61:0x0157  */
    /* JADX WARN: Code duplicated, block: B:62:0x0181  */
    /* JADX WARN: Code duplicated, block: B:64:0x018e  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:68:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:69:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:71:0x0200  */
    /* JADX WARN: Code duplicated, block: B:72:0x020b  */
    private void bg(boolean z, int i, int i2, int i3, int i4) {
        float measuredWidth;
        int i5;
        float f;
        float f2;
        float fMax;
        int i6;
        int i7;
        android.view.View viewBX;
        int i8;
        int i9;
        int i10;
        char c;
        com.bytedance.adsdk.ugeno.zx.zx.bg bgVar;
        float f3;
        float f4;
        float f5;
        int i11;
        char c2;
        int i12;
        com.bytedance.adsdk.ugeno.zx.zx.bg bgVar2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i13 = i3 - i;
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        int paddingTop = getPaddingTop();
        int size = this.vb.size();
        int i14 = 0;
        while (i14 < size) {
            com.bytedance.adsdk.ugeno.zx.bX bXVar = this.vb.get(i14);
            if (eqN(i14)) {
                int i15 = this.VB;
                paddingBottom -= i15;
                paddingTop += i15;
            }
            int i16 = this.bX;
            char c3 = 4;
            int i17 = 1;
            if (i16 != 0) {
                if (i16 == 1) {
                    measuredWidth = (i13 - bXVar.zx) + paddingRight;
                    i5 = bXVar.zx - paddingLeft;
                } else if (i16 == 2) {
                    measuredWidth = paddingLeft + ((i13 - bXVar.zx) / 2.0f);
                    f = (i13 - paddingRight) - ((i13 - bXVar.zx) / 2.0f);
                    f2 = 0.0f;
                } else if (i16 == 3) {
                    measuredWidth = paddingLeft;
                    int iIL = bXVar.IL();
                    f2 = (i13 - bXVar.zx) / (iIL != 1 ? iIL - 1 : 1.0f);
                    f = i13 - paddingRight;
                } else if (i16 == 4) {
                    int iIL2 = bXVar.IL();
                    f2 = iIL2 != 0 ? (i13 - bXVar.zx) / iIL2 : 0.0f;
                    float f6 = f2 / 2.0f;
                    measuredWidth = paddingLeft + f6;
                    f = (i13 - paddingRight) - f6;
                } else if (i16 == 5) {
                    int iIL3 = bXVar.IL();
                    f2 = iIL3 != 0 ? (i13 - bXVar.zx) / (iIL3 + 1) : 0.0f;
                    measuredWidth = paddingLeft + f2;
                    f = (i13 - paddingRight) - f2;
                } else {
                    throw new java.lang.IllegalStateException("Invalid justifyContent is set: " + this.bX);
                }
                fMax = java.lang.Math.max(f2, 0.0f);
                i6 = 0;
                while (i6 < bXVar.Kg) {
                    i7 = bXVar.Lq + i6;
                    viewBX = bX(i7);
                    if (viewBX != null) {
                        i8 = paddingLeft;
                        i9 = i17;
                        i10 = i6;
                        c = c3;
                    } else if (viewBX.getVisibility() != 8) {
                        bgVar = (com.bytedance.adsdk.ugeno.zx.zx.bg) viewBX.getLayoutParams();
                        f3 = measuredWidth + bgVar.leftMargin;
                        f4 = f - bgVar.rightMargin;
                        if (eqN(i7, i6)) {
                            int i18 = this.PX;
                            float f7 = i18;
                            f3 += f7;
                            i11 = i18;
                            f5 = f4 - f7;
                        } else {
                            f5 = f4;
                            i11 = 0;
                        }
                        if (i6 == bXVar.Kg - i17) {
                            c2 = 4;
                            i12 = (this.eo & 4) > 0 ? this.PX : 0;
                            if (this.IL == 2) {
                                i8 = paddingLeft;
                                i9 = i17;
                                i10 = i6;
                                bgVar2 = bgVar;
                                c = c2;
                                if (z) {
                                    this.Lq.bg(viewBX, bXVar, java.lang.Math.round(f5) - viewBX.getMeasuredWidth(), paddingTop, java.lang.Math.round(f5), paddingTop + viewBX.getMeasuredHeight());
                                } else {
                                    this.Lq.bg(viewBX, bXVar, java.lang.Math.round(f3), paddingTop, java.lang.Math.round(f3) + viewBX.getMeasuredWidth(), paddingTop + viewBX.getMeasuredHeight());
                                }
                            } else if (z) {
                                i9 = i17;
                                i10 = i6;
                                i8 = paddingLeft;
                                bgVar2 = bgVar;
                                c = c2;
                                this.Lq.bg(viewBX, bXVar, java.lang.Math.round(f5) - viewBX.getMeasuredWidth(), paddingBottom - viewBX.getMeasuredHeight(), java.lang.Math.round(f5), paddingBottom);
                            } else {
                                i8 = paddingLeft;
                                i9 = i17;
                                i10 = i6;
                                bgVar2 = bgVar;
                                c = c2;
                                this.Lq.bg(viewBX, bXVar, java.lang.Math.round(f3), paddingBottom - viewBX.getMeasuredHeight(), java.lang.Math.round(f3) + viewBX.getMeasuredWidth(), paddingBottom);
                            }
                            measuredWidth = f3 + viewBX.getMeasuredWidth() + fMax + bgVar2.rightMargin;
                            float measuredWidth2 = f5 - ((viewBX.getMeasuredWidth() + fMax) + bgVar2.leftMargin);
                            if (z) {
                                bXVar.bg(viewBX, i12, 0, i11, 0);
                            } else {
                                bXVar.bg(viewBX, i11, 0, i12, 0);
                            }
                            f = measuredWidth2;
                        } else {
                            c2 = 4;
                        }
                        if (this.IL == 2) {
                            i8 = paddingLeft;
                            i9 = i17;
                            i10 = i6;
                            bgVar2 = bgVar;
                            c = c2;
                            if (z) {
                                this.Lq.bg(viewBX, bXVar, java.lang.Math.round(f5) - viewBX.getMeasuredWidth(), paddingTop, java.lang.Math.round(f5), paddingTop + viewBX.getMeasuredHeight());
                            } else {
                                this.Lq.bg(viewBX, bXVar, java.lang.Math.round(f3), paddingTop, java.lang.Math.round(f3) + viewBX.getMeasuredWidth(), paddingTop + viewBX.getMeasuredHeight());
                            }
                        } else if (z) {
                            i9 = i17;
                            i10 = i6;
                            i8 = paddingLeft;
                            bgVar2 = bgVar;
                            c = c2;
                            this.Lq.bg(viewBX, bXVar, java.lang.Math.round(f5) - viewBX.getMeasuredWidth(), paddingBottom - viewBX.getMeasuredHeight(), java.lang.Math.round(f5), paddingBottom);
                        } else {
                            i8 = paddingLeft;
                            i9 = i17;
                            i10 = i6;
                            bgVar2 = bgVar;
                            c = c2;
                            this.Lq.bg(viewBX, bXVar, java.lang.Math.round(f3), paddingBottom - viewBX.getMeasuredHeight(), java.lang.Math.round(f3) + viewBX.getMeasuredWidth(), paddingBottom);
                        }
                        measuredWidth = f3 + viewBX.getMeasuredWidth() + fMax + bgVar2.rightMargin;
                        float measuredWidth3 = f5 - ((viewBX.getMeasuredWidth() + fMax) + bgVar2.leftMargin);
                        if (z) {
                            bXVar.bg(viewBX, i12, 0, i11, 0);
                        } else {
                            bXVar.bg(viewBX, i11, 0, i12, 0);
                        }
                        f = measuredWidth3;
                    } else {
                        i8 = paddingLeft;
                        i9 = i17;
                        i10 = i6;
                        c = 4;
                    }
                    i6 = i10 + 1;
                    paddingLeft = i8;
                    i17 = i9;
                    c3 = c;
                }
                paddingTop += bXVar.iR;
                paddingBottom -= bXVar.iR;
                i14++;
                paddingLeft = paddingLeft;
            } else {
                measuredWidth = paddingLeft;
                i5 = i13 - paddingRight;
            }
            f = i5;
            f2 = 0.0f;
            fMax = java.lang.Math.max(f2, 0.0f);
            i6 = 0;
            while (i6 < bXVar.Kg) {
                i7 = bXVar.Lq + i6;
                viewBX = bX(i7);
                if (viewBX != null) {
                    i8 = paddingLeft;
                    i9 = i17;
                    i10 = i6;
                    c = c3;
                } else if (viewBX.getVisibility() != 8) {
                    bgVar = (com.bytedance.adsdk.ugeno.zx.zx.bg) viewBX.getLayoutParams();
                    f3 = measuredWidth + bgVar.leftMargin;
                    f4 = f - bgVar.rightMargin;
                    if (eqN(i7, i6)) {
                        int i19 = this.PX;
                        float f8 = i19;
                        f3 += f8;
                        i11 = i19;
                        f5 = f4 - f8;
                    } else {
                        f5 = f4;
                        i11 = 0;
                    }
                    if (i6 == bXVar.Kg - i17) {
                        c2 = 4;
                        if ((this.eo & 4) > 0) {
                        }
                        if (this.IL == 2) {
                            i8 = paddingLeft;
                            i9 = i17;
                            i10 = i6;
                            bgVar2 = bgVar;
                            c = c2;
                            if (z) {
                                this.Lq.bg(viewBX, bXVar, java.lang.Math.round(f5) - viewBX.getMeasuredWidth(), paddingTop, java.lang.Math.round(f5), paddingTop + viewBX.getMeasuredHeight());
                            } else {
                                this.Lq.bg(viewBX, bXVar, java.lang.Math.round(f3), paddingTop, java.lang.Math.round(f3) + viewBX.getMeasuredWidth(), paddingTop + viewBX.getMeasuredHeight());
                            }
                        } else if (z) {
                            i9 = i17;
                            i10 = i6;
                            i8 = paddingLeft;
                            bgVar2 = bgVar;
                            c = c2;
                            this.Lq.bg(viewBX, bXVar, java.lang.Math.round(f5) - viewBX.getMeasuredWidth(), paddingBottom - viewBX.getMeasuredHeight(), java.lang.Math.round(f5), paddingBottom);
                        } else {
                            i8 = paddingLeft;
                            i9 = i17;
                            i10 = i6;
                            bgVar2 = bgVar;
                            c = c2;
                            this.Lq.bg(viewBX, bXVar, java.lang.Math.round(f3), paddingBottom - viewBX.getMeasuredHeight(), java.lang.Math.round(f3) + viewBX.getMeasuredWidth(), paddingBottom);
                        }
                        measuredWidth = f3 + viewBX.getMeasuredWidth() + fMax + bgVar2.rightMargin;
                        float measuredWidth4 = f5 - ((viewBX.getMeasuredWidth() + fMax) + bgVar2.leftMargin);
                        if (z) {
                            bXVar.bg(viewBX, i12, 0, i11, 0);
                        } else {
                            bXVar.bg(viewBX, i11, 0, i12, 0);
                        }
                        f = measuredWidth4;
                    } else {
                        c2 = 4;
                    }
                    if (this.IL == 2) {
                        i8 = paddingLeft;
                        i9 = i17;
                        i10 = i6;
                        bgVar2 = bgVar;
                        c = c2;
                        if (z) {
                            this.Lq.bg(viewBX, bXVar, java.lang.Math.round(f5) - viewBX.getMeasuredWidth(), paddingTop, java.lang.Math.round(f5), paddingTop + viewBX.getMeasuredHeight());
                        } else {
                            this.Lq.bg(viewBX, bXVar, java.lang.Math.round(f3), paddingTop, java.lang.Math.round(f3) + viewBX.getMeasuredWidth(), paddingTop + viewBX.getMeasuredHeight());
                        }
                    } else if (z) {
                        i9 = i17;
                        i10 = i6;
                        i8 = paddingLeft;
                        bgVar2 = bgVar;
                        c = c2;
                        this.Lq.bg(viewBX, bXVar, java.lang.Math.round(f5) - viewBX.getMeasuredWidth(), paddingBottom - viewBX.getMeasuredHeight(), java.lang.Math.round(f5), paddingBottom);
                    } else {
                        i8 = paddingLeft;
                        i9 = i17;
                        i10 = i6;
                        bgVar2 = bgVar;
                        c = c2;
                        this.Lq.bg(viewBX, bXVar, java.lang.Math.round(f3), paddingBottom - viewBX.getMeasuredHeight(), java.lang.Math.round(f3) + viewBX.getMeasuredWidth(), paddingBottom);
                    }
                    measuredWidth = f3 + viewBX.getMeasuredWidth() + fMax + bgVar2.rightMargin;
                    float measuredWidth5 = f5 - ((viewBX.getMeasuredWidth() + fMax) + bgVar2.leftMargin);
                    if (z) {
                        bXVar.bg(viewBX, i12, 0, i11, 0);
                    } else {
                        bXVar.bg(viewBX, i11, 0, i12, 0);
                    }
                    f = measuredWidth5;
                } else {
                    i8 = paddingLeft;
                    i9 = i17;
                    i10 = i6;
                    c = 4;
                }
                i6 = i10 + 1;
                paddingLeft = i8;
                i17 = i9;
                c3 = c;
            }
            paddingTop += bXVar.iR;
            paddingBottom -= bXVar.iR;
            i14++;
            paddingLeft = paddingLeft;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:49:0x0105  */
    /* JADX WARN: Code duplicated, block: B:52:0x0111  */
    /* JADX WARN: Code duplicated, block: B:54:0x0119  */
    /* JADX WARN: Code duplicated, block: B:55:0x011e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0124 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x0126  */
    /* JADX WARN: Code duplicated, block: B:60:0x0155  */
    /* JADX WARN: Code duplicated, block: B:61:0x017d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0187  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:67:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:70:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:71:0x0205  */
    private void bg(boolean z, boolean z2, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        float f2;
        float f3;
        float fMax;
        int i6;
        int i7;
        android.view.View viewBX;
        int i8;
        boolean z3;
        char c;
        com.bytedance.adsdk.ugeno.zx.zx.bg bgVar;
        float f4;
        float f5;
        float f6;
        float f7;
        int i9;
        char c2;
        int i10;
        com.bytedance.adsdk.ugeno.zx.zx.bg bgVar2;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingRight = getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int i11 = i4 - i2;
        int i12 = (i3 - i) - paddingRight;
        int size = this.vb.size();
        for (int i13 = 0; i13 < size; i13++) {
            com.bytedance.adsdk.ugeno.zx.bX bXVar = this.vb.get(i13);
            if (eqN(i13)) {
                int i14 = this.PX;
                paddingLeft += i14;
                i12 -= i14;
            }
            int i15 = this.bX;
            char c3 = 4;
            boolean z4 = true;
            if (i15 != 0) {
                if (i15 == 1) {
                    f = (i11 - bXVar.zx) + paddingBottom;
                    i5 = bXVar.zx - paddingTop;
                } else if (i15 == 2) {
                    f = ((i11 - bXVar.zx) / 2.0f) + paddingTop;
                    f2 = (i11 - paddingBottom) - ((i11 - bXVar.zx) / 2.0f);
                    f3 = 0.0f;
                } else if (i15 == 3) {
                    f = paddingTop;
                    int iIL = bXVar.IL();
                    f3 = (i11 - bXVar.zx) / (iIL != 1 ? iIL - 1 : 1.0f);
                    f2 = i11 - paddingBottom;
                } else if (i15 == 4) {
                    int iIL2 = bXVar.IL();
                    f3 = iIL2 != 0 ? (i11 - bXVar.zx) / iIL2 : 0.0f;
                    float f8 = f3 / 2.0f;
                    f = paddingTop + f8;
                    f2 = (i11 - paddingBottom) - f8;
                } else if (i15 == 5) {
                    int iIL3 = bXVar.IL();
                    f3 = iIL3 != 0 ? (i11 - bXVar.zx) / (iIL3 + 1) : 0.0f;
                    f = paddingTop + f3;
                    f2 = (i11 - paddingBottom) - f3;
                } else {
                    throw new java.lang.IllegalStateException("Invalid justifyContent is set: " + this.bX);
                }
                fMax = java.lang.Math.max(f3, 0.0f);
                i6 = 0;
                while (i6 < bXVar.Kg) {
                    i7 = bXVar.Lq + i6;
                    viewBX = bX(i7);
                    if (viewBX != null) {
                        i8 = i6;
                        z3 = z4;
                        c = c3;
                    } else if (viewBX.getVisibility() != 8) {
                        bgVar = (com.bytedance.adsdk.ugeno.zx.zx.bg) viewBX.getLayoutParams();
                        f4 = f + bgVar.topMargin;
                        f5 = f2 - bgVar.bottomMargin;
                        if (eqN(i7, i6)) {
                            int i16 = this.VB;
                            float f9 = i16;
                            f6 = f4 + f9;
                            i9 = i16;
                            f7 = f5 - f9;
                        } else {
                            f6 = f4;
                            f7 = f5;
                            i9 = 0;
                        }
                        if (i6 == bXVar.Kg - 1) {
                            c2 = 4;
                            i10 = (this.WR & 4) > 0 ? this.VB : 0;
                            if (z) {
                                i8 = i6;
                                z3 = true;
                                bgVar2 = bgVar;
                                c = c2;
                                if (z2) {
                                    this.Lq.bg(viewBX, bXVar, false, paddingLeft, java.lang.Math.round(f7) - viewBX.getMeasuredHeight(), paddingLeft + viewBX.getMeasuredWidth(), java.lang.Math.round(f7));
                                } else {
                                    this.Lq.bg(viewBX, bXVar, false, paddingLeft, java.lang.Math.round(f6), paddingLeft + viewBX.getMeasuredWidth(), java.lang.Math.round(f6) + viewBX.getMeasuredHeight());
                                }
                            } else if (z2) {
                                i8 = i6;
                                z3 = true;
                                bgVar2 = bgVar;
                                c = c2;
                                this.Lq.bg(viewBX, bXVar, true, i12 - viewBX.getMeasuredWidth(), java.lang.Math.round(f7) - viewBX.getMeasuredHeight(), i12, java.lang.Math.round(f7));
                            } else {
                                i8 = i6;
                                z3 = true;
                                bgVar2 = bgVar;
                                c = c2;
                                this.Lq.bg(viewBX, bXVar, true, i12 - viewBX.getMeasuredWidth(), java.lang.Math.round(f6), i12, java.lang.Math.round(f6) + viewBX.getMeasuredHeight());
                            }
                            com.bytedance.adsdk.ugeno.zx.zx.bg bgVar3 = bgVar2;
                            float measuredHeight = f6 + viewBX.getMeasuredHeight() + fMax + bgVar3.bottomMargin;
                            float measuredHeight2 = f7 - ((viewBX.getMeasuredHeight() + fMax) + bgVar3.topMargin);
                            if (z2) {
                                bXVar.bg(viewBX, 0, i10, 0, i9);
                            } else {
                                bXVar.bg(viewBX, 0, i9, 0, i10);
                            }
                            f = measuredHeight;
                            f2 = measuredHeight2;
                        } else {
                            c2 = 4;
                        }
                        if (z) {
                            i8 = i6;
                            z3 = true;
                            bgVar2 = bgVar;
                            c = c2;
                            if (z2) {
                                this.Lq.bg(viewBX, bXVar, false, paddingLeft, java.lang.Math.round(f7) - viewBX.getMeasuredHeight(), paddingLeft + viewBX.getMeasuredWidth(), java.lang.Math.round(f7));
                            } else {
                                this.Lq.bg(viewBX, bXVar, false, paddingLeft, java.lang.Math.round(f6), paddingLeft + viewBX.getMeasuredWidth(), java.lang.Math.round(f6) + viewBX.getMeasuredHeight());
                            }
                        } else if (z2) {
                            i8 = i6;
                            z3 = true;
                            bgVar2 = bgVar;
                            c = c2;
                            this.Lq.bg(viewBX, bXVar, true, i12 - viewBX.getMeasuredWidth(), java.lang.Math.round(f7) - viewBX.getMeasuredHeight(), i12, java.lang.Math.round(f7));
                        } else {
                            i8 = i6;
                            z3 = true;
                            bgVar2 = bgVar;
                            c = c2;
                            this.Lq.bg(viewBX, bXVar, true, i12 - viewBX.getMeasuredWidth(), java.lang.Math.round(f6), i12, java.lang.Math.round(f6) + viewBX.getMeasuredHeight());
                        }
                        com.bytedance.adsdk.ugeno.zx.zx.bg bgVar4 = bgVar2;
                        float measuredHeight3 = f6 + viewBX.getMeasuredHeight() + fMax + bgVar4.bottomMargin;
                        float measuredHeight4 = f7 - ((viewBX.getMeasuredHeight() + fMax) + bgVar4.topMargin);
                        if (z2) {
                            bXVar.bg(viewBX, 0, i10, 0, i9);
                        } else {
                            bXVar.bg(viewBX, 0, i9, 0, i10);
                        }
                        f = measuredHeight3;
                        f2 = measuredHeight4;
                    } else {
                        i8 = i6;
                        z3 = true;
                        c = 4;
                    }
                    i6 = i8 + 1;
                    z4 = z3;
                    c3 = c;
                }
                paddingLeft += bXVar.iR;
                i12 -= bXVar.iR;
            } else {
                f = paddingTop;
                i5 = i11 - paddingBottom;
            }
            f2 = i5;
            f3 = 0.0f;
            fMax = java.lang.Math.max(f3, 0.0f);
            i6 = 0;
            while (i6 < bXVar.Kg) {
                i7 = bXVar.Lq + i6;
                viewBX = bX(i7);
                if (viewBX != null) {
                    i8 = i6;
                    z3 = z4;
                    c = c3;
                } else if (viewBX.getVisibility() != 8) {
                    bgVar = (com.bytedance.adsdk.ugeno.zx.zx.bg) viewBX.getLayoutParams();
                    f4 = f + bgVar.topMargin;
                    f5 = f2 - bgVar.bottomMargin;
                    if (eqN(i7, i6)) {
                        int i17 = this.VB;
                        float f10 = i17;
                        f6 = f4 + f10;
                        i9 = i17;
                        f7 = f5 - f10;
                    } else {
                        f6 = f4;
                        f7 = f5;
                        i9 = 0;
                    }
                    if (i6 == bXVar.Kg - 1) {
                        c2 = 4;
                        if ((this.WR & 4) > 0) {
                        }
                        if (z) {
                            i8 = i6;
                            z3 = true;
                            bgVar2 = bgVar;
                            c = c2;
                            if (z2) {
                                this.Lq.bg(viewBX, bXVar, false, paddingLeft, java.lang.Math.round(f7) - viewBX.getMeasuredHeight(), paddingLeft + viewBX.getMeasuredWidth(), java.lang.Math.round(f7));
                            } else {
                                this.Lq.bg(viewBX, bXVar, false, paddingLeft, java.lang.Math.round(f6), paddingLeft + viewBX.getMeasuredWidth(), java.lang.Math.round(f6) + viewBX.getMeasuredHeight());
                            }
                        } else if (z2) {
                            i8 = i6;
                            z3 = true;
                            bgVar2 = bgVar;
                            c = c2;
                            this.Lq.bg(viewBX, bXVar, true, i12 - viewBX.getMeasuredWidth(), java.lang.Math.round(f7) - viewBX.getMeasuredHeight(), i12, java.lang.Math.round(f7));
                        } else {
                            i8 = i6;
                            z3 = true;
                            bgVar2 = bgVar;
                            c = c2;
                            this.Lq.bg(viewBX, bXVar, true, i12 - viewBX.getMeasuredWidth(), java.lang.Math.round(f6), i12, java.lang.Math.round(f6) + viewBX.getMeasuredHeight());
                        }
                        com.bytedance.adsdk.ugeno.zx.zx.bg bgVar5 = bgVar2;
                        float measuredHeight5 = f6 + viewBX.getMeasuredHeight() + fMax + bgVar5.bottomMargin;
                        float measuredHeight6 = f7 - ((viewBX.getMeasuredHeight() + fMax) + bgVar5.topMargin);
                        if (z2) {
                            bXVar.bg(viewBX, 0, i10, 0, i9);
                        } else {
                            bXVar.bg(viewBX, 0, i9, 0, i10);
                        }
                        f = measuredHeight5;
                        f2 = measuredHeight6;
                    } else {
                        c2 = 4;
                    }
                    if (z) {
                        i8 = i6;
                        z3 = true;
                        bgVar2 = bgVar;
                        c = c2;
                        if (z2) {
                            this.Lq.bg(viewBX, bXVar, false, paddingLeft, java.lang.Math.round(f7) - viewBX.getMeasuredHeight(), paddingLeft + viewBX.getMeasuredWidth(), java.lang.Math.round(f7));
                        } else {
                            this.Lq.bg(viewBX, bXVar, false, paddingLeft, java.lang.Math.round(f6), paddingLeft + viewBX.getMeasuredWidth(), java.lang.Math.round(f6) + viewBX.getMeasuredHeight());
                        }
                    } else if (z2) {
                        i8 = i6;
                        z3 = true;
                        bgVar2 = bgVar;
                        c = c2;
                        this.Lq.bg(viewBX, bXVar, true, i12 - viewBX.getMeasuredWidth(), java.lang.Math.round(f7) - viewBX.getMeasuredHeight(), i12, java.lang.Math.round(f7));
                    } else {
                        i8 = i6;
                        z3 = true;
                        bgVar2 = bgVar;
                        c = c2;
                        this.Lq.bg(viewBX, bXVar, true, i12 - viewBX.getMeasuredWidth(), java.lang.Math.round(f6), i12, java.lang.Math.round(f6) + viewBX.getMeasuredHeight());
                    }
                    com.bytedance.adsdk.ugeno.zx.zx.bg bgVar6 = bgVar2;
                    float measuredHeight7 = f6 + viewBX.getMeasuredHeight() + fMax + bgVar6.bottomMargin;
                    float measuredHeight8 = f7 - ((viewBX.getMeasuredHeight() + fMax) + bgVar6.topMargin);
                    if (z2) {
                        bXVar.bg(viewBX, 0, i10, 0, i9);
                    } else {
                        bXVar.bg(viewBX, 0, i9, 0, i10);
                    }
                    f = measuredHeight7;
                    f2 = measuredHeight8;
                } else {
                    i8 = i6;
                    z3 = true;
                    c = 4;
                }
                i6 = i8 + 1;
                z4 = z3;
                c3 = c;
            }
            paddingLeft += bXVar.iR;
            i12 -= bXVar.iR;
        }
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        if (this.Kg == null && this.iR == null) {
            return;
        }
        if (this.WR == 0 && this.eo == 0) {
            return;
        }
        int iBg = com.bytedance.adsdk.ugeno.iR.iR.bg(this);
        int i = this.bg;
        if (i == 0) {
            bg(canvas, iBg == 1, this.IL == 2);
            return;
        }
        if (i == 1) {
            bg(canvas, iBg != 1, this.IL == 2);
            return;
        }
        if (i == 2) {
            boolean z = iBg == 1;
            if (this.IL == 2) {
                z = !z;
            }
            IL(canvas, z, false);
            return;
        }
        if (i != 3) {
            return;
        }
        boolean z2 = iBg == 1;
        if (this.IL == 2) {
            z2 = !z2;
        }
        IL(canvas, z2, true);
    }

    private void bg(android.graphics.Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int right;
        int left;
        int paddingLeft = getPaddingLeft();
        int iMax = java.lang.Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.vb.size();
        for (int i3 = 0; i3 < size; i3++) {
            com.bytedance.adsdk.ugeno.zx.bX bXVar = this.vb.get(i3);
            for (int i4 = 0; i4 < bXVar.Kg; i4++) {
                int i5 = bXVar.Lq + i4;
                android.view.View viewBX = bX(i5);
                if (viewBX != null && viewBX.getVisibility() != 8) {
                    com.bytedance.adsdk.ugeno.zx.zx.bg bgVar = (com.bytedance.adsdk.ugeno.zx.zx.bg) viewBX.getLayoutParams();
                    if (eqN(i5, i4)) {
                        if (z) {
                            left = viewBX.getRight() + bgVar.rightMargin;
                        } else {
                            left = (viewBX.getLeft() - bgVar.leftMargin) - this.PX;
                        }
                        bg(canvas, left, bXVar.IL, bXVar.iR);
                    }
                    if (i4 == bXVar.Kg - 1 && (this.eo & 4) > 0) {
                        if (z) {
                            right = (viewBX.getLeft() - bgVar.leftMargin) - this.PX;
                        } else {
                            right = viewBX.getRight() + bgVar.rightMargin;
                        }
                        bg(canvas, right, bXVar.IL, bXVar.iR);
                    }
                }
            }
            if (eqN(i3)) {
                if (z2) {
                    i2 = bXVar.eqN;
                } else {
                    i2 = bXVar.IL - this.VB;
                }
                IL(canvas, paddingLeft, i2, iMax);
            }
            if (ldr(i3) && (this.WR & 4) > 0) {
                if (z2) {
                    i = bXVar.IL - this.VB;
                } else {
                    i = bXVar.eqN;
                }
                IL(canvas, paddingLeft, i, iMax);
            }
        }
    }

    private void IL(android.graphics.Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int bottom;
        int top;
        int paddingTop = getPaddingTop();
        int iMax = java.lang.Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.vb.size();
        for (int i3 = 0; i3 < size; i3++) {
            com.bytedance.adsdk.ugeno.zx.bX bXVar = this.vb.get(i3);
            for (int i4 = 0; i4 < bXVar.Kg; i4++) {
                int i5 = bXVar.Lq + i4;
                android.view.View viewBX = bX(i5);
                if (viewBX != null && viewBX.getVisibility() != 8) {
                    com.bytedance.adsdk.ugeno.zx.zx.bg bgVar = (com.bytedance.adsdk.ugeno.zx.zx.bg) viewBX.getLayoutParams();
                    if (eqN(i5, i4)) {
                        if (z2) {
                            top = viewBX.getBottom() + bgVar.bottomMargin;
                        } else {
                            top = (viewBX.getTop() - bgVar.topMargin) - this.VB;
                        }
                        IL(canvas, bXVar.bg, top, bXVar.iR);
                    }
                    if (i4 == bXVar.Kg - 1 && (this.WR & 4) > 0) {
                        if (z2) {
                            bottom = (viewBX.getTop() - bgVar.topMargin) - this.VB;
                        } else {
                            bottom = viewBX.getBottom() + bgVar.bottomMargin;
                        }
                        IL(canvas, bXVar.bg, bottom, bXVar.iR);
                    }
                }
            }
            if (eqN(i3)) {
                if (z) {
                    i2 = bXVar.bX;
                } else {
                    i2 = bXVar.bg - this.PX;
                }
                bg(canvas, i2, paddingTop, iMax);
            }
            if (ldr(i3) && (this.eo & 4) > 0) {
                if (z) {
                    i = bXVar.bg - this.PX;
                } else {
                    i = bXVar.bX;
                }
                bg(canvas, i, paddingTop, iMax);
            }
        }
    }

    private void bg(android.graphics.Canvas canvas, int i, int i2, int i3) {
        android.graphics.drawable.Drawable drawable = this.Kg;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, this.PX + i, i3 + i2);
        this.Kg.draw(canvas);
    }

    private void IL(android.graphics.Canvas canvas, int i, int i2, int i3) {
        android.graphics.drawable.Drawable drawable = this.iR;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, i3 + i, this.VB + i2);
        this.iR.draw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof com.bytedance.adsdk.ugeno.zx.zx.bg;
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof com.bytedance.adsdk.ugeno.zx.zx.bg) {
            return new com.bytedance.adsdk.ugeno.zx.zx.bg((com.bytedance.adsdk.ugeno.zx.zx.bg) layoutParams);
        }
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            return new com.bytedance.adsdk.ugeno.zx.zx.bg((android.view.ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new com.bytedance.adsdk.ugeno.zx.zx.bg(layoutParams);
    }

    @Override // com.bytedance.adsdk.ugeno.zx.bg
    public int getFlexDirection() {
        return this.bg;
    }

    public void setFlexDirection(int i) {
        if (this.bg != i) {
            this.bg = i;
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.zx.bg
    public int getFlexWrap() {
        return this.IL;
    }

    public void setFlexWrap(int i) {
        if (this.IL != i) {
            this.IL = i;
            requestLayout();
        }
    }

    public int getJustifyContent() {
        return this.bX;
    }

    public void setJustifyContent(int i) {
        if (this.bX != i) {
            this.bX = i;
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.zx.bg
    public int getAlignItems() {
        return this.eqN;
    }

    public void setAlignItems(int i) {
        if (this.eqN != i) {
            this.eqN = i;
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.zx.bg
    public int getAlignContent() {
        return this.zx;
    }

    public void setAlignContent(int i) {
        if (this.zx != i) {
            this.zx = i;
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.zx.bg
    public int getMaxLine() {
        return this.ldr;
    }

    public void setMaxLine(int i) {
        if (this.ldr != i) {
            this.ldr = i;
            requestLayout();
        }
    }

    public java.util.List<com.bytedance.adsdk.ugeno.zx.bX> getFlexLines() {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.vb.size());
        for (com.bytedance.adsdk.ugeno.zx.bX bXVar : this.vb) {
            if (bXVar.IL() != 0) {
                arrayList.add(bXVar);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.adsdk.ugeno.zx.bg
    public int bg(android.view.View view, int i, int i2) {
        int i3;
        int i4;
        if (bg()) {
            i3 = eqN(i, i2) ? 0 + this.PX : 0;
            if ((this.eo & 4) <= 0) {
                return i3;
            }
            i4 = this.PX;
        } else {
            i3 = eqN(i, i2) ? 0 + this.VB : 0;
            if ((this.WR & 4) <= 0) {
                return i3;
            }
            i4 = this.VB;
        }
        return i3 + i4;
    }

    @Override // com.bytedance.adsdk.ugeno.zx.bg
    public void bg(com.bytedance.adsdk.ugeno.zx.bX bXVar) {
        if (bg()) {
            if ((this.eo & 4) > 0) {
                bXVar.zx += this.PX;
                bXVar.ldr += this.PX;
                return;
            }
            return;
        }
        if ((this.WR & 4) > 0) {
            bXVar.zx += this.VB;
            bXVar.ldr += this.VB;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.zx.bg
    public int bg(int i, int i2, int i3) {
        return getChildMeasureSpec(i, i2, i3);
    }

    @Override // com.bytedance.adsdk.ugeno.zx.bg
    public int IL(int i, int i2, int i3) {
        return getChildMeasureSpec(i, i2, i3);
    }

    @Override // com.bytedance.adsdk.ugeno.zx.bg
    public void bg(android.view.View view, int i, int i2, com.bytedance.adsdk.ugeno.zx.bX bXVar) {
        if (eqN(i, i2)) {
            if (bg()) {
                bXVar.zx += this.PX;
                bXVar.ldr += this.PX;
            } else {
                bXVar.zx += this.VB;
                bXVar.ldr += this.VB;
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.zx.bg
    public void setFlexLines(java.util.List<com.bytedance.adsdk.ugeno.zx.bX> list) {
        this.vb = list;
    }

    @Override // com.bytedance.adsdk.ugeno.zx.bg
    public java.util.List<com.bytedance.adsdk.ugeno.zx.bX> getFlexLinesInternal() {
        return this.vb;
    }

    public android.graphics.drawable.Drawable getDividerDrawableHorizontal() {
        return this.iR;
    }

    public android.graphics.drawable.Drawable getDividerDrawableVertical() {
        return this.Kg;
    }

    public void setDividerDrawable(android.graphics.drawable.Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(android.graphics.drawable.Drawable drawable) {
        if (drawable == this.iR) {
            return;
        }
        this.iR = drawable;
        if (drawable != null) {
            this.VB = drawable.getIntrinsicHeight();
        } else {
            this.VB = 0;
        }
        IL();
        requestLayout();
    }

    public void setDividerDrawableVertical(android.graphics.drawable.Drawable drawable) {
        if (drawable == this.Kg) {
            return;
        }
        this.Kg = drawable;
        if (drawable != null) {
            this.PX = drawable.getIntrinsicWidth();
        } else {
            this.PX = 0;
        }
        IL();
        requestLayout();
    }

    public int getShowDividerVertical() {
        return this.eo;
    }

    public int getShowDividerHorizontal() {
        return this.WR;
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerVertical(int i) {
        if (i != this.eo) {
            this.eo = i;
            requestLayout();
        }
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.WR) {
            this.WR = i;
            requestLayout();
        }
    }

    private void IL() {
        if (this.iR == null && this.Kg == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    private boolean eqN(int i, int i2) {
        if (zx(i, i2)) {
            if (bg()) {
                return (this.eo & 1) != 0;
            }
            return (this.WR & 1) != 0;
        }
        if (bg()) {
            return (this.eo & 2) != 0;
        }
        return (this.WR & 2) != 0;
    }

    private boolean zx(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            android.view.View viewBX = bX(i - i3);
            if (viewBX != null && viewBX.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    private boolean eqN(int i) {
        if (i >= 0 && i < this.vb.size()) {
            if (zx(i)) {
                if (bg()) {
                    return (this.WR & 1) != 0;
                }
                return (this.eo & 1) != 0;
            }
            if (bg()) {
                return (this.WR & 2) != 0;
            }
            if ((this.eo & 2) != 0) {
                return true;
            }
        }
        return false;
    }

    private boolean zx(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (this.vb.get(i2).IL() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean ldr(int i) {
        if (i >= 0 && i < this.vb.size()) {
            for (int i2 = i + 1; i2 < this.vb.size(); i2++) {
                if (this.vb.get(i2).IL() > 0) {
                    return false;
                }
            }
            if (bg()) {
                return (this.WR & 4) != 0;
            }
            if ((this.eo & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    public static class bg extends android.view.ViewGroup.MarginLayoutParams implements com.bytedance.adsdk.ugeno.zx.IL {
        public static final android.os.Parcelable.Creator<com.bytedance.adsdk.ugeno.zx.zx.bg> CREATOR = new android.os.Parcelable.Creator<com.bytedance.adsdk.ugeno.zx.zx.bg>() { // from class: com.bytedance.adsdk.ugeno.zx.zx.bg.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
            public com.bytedance.adsdk.ugeno.zx.zx.bg createFromParcel(android.os.Parcel parcel) {
                return new com.bytedance.adsdk.ugeno.zx.zx.bg(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
            public com.bytedance.adsdk.ugeno.zx.zx.bg[] newArray(int i) {
                return new com.bytedance.adsdk.ugeno.zx.zx.bg[i];
            }
        };
        private float IL;
        private int Kg;
        private int WR;
        private float bX;
        private int bg;
        private boolean eo;
        private int eqN;
        private int iR;
        private int ldr;
        private float zx;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public bg(com.bytedance.adsdk.ugeno.zx.zx.bg bgVar) {
            super((android.view.ViewGroup.MarginLayoutParams) bgVar);
            this.bg = 1;
            this.IL = 0.0f;
            this.bX = 0.0f;
            this.eqN = -1;
            this.zx = -1.0f;
            this.ldr = -1;
            this.iR = -1;
            this.Kg = androidx.core.view.ViewCompat.MEASURED_SIZE_MASK;
            this.WR = androidx.core.view.ViewCompat.MEASURED_SIZE_MASK;
            this.bg = bgVar.bg;
            this.IL = bgVar.IL;
            this.bX = bgVar.bX;
            this.eqN = bgVar.eqN;
            this.zx = bgVar.zx;
            this.ldr = bgVar.ldr;
            this.iR = bgVar.iR;
            this.Kg = bgVar.Kg;
            this.WR = bgVar.WR;
            this.eo = bgVar.eo;
        }

        public bg(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.bg = 1;
            this.IL = 0.0f;
            this.bX = 0.0f;
            this.eqN = -1;
            this.zx = -1.0f;
            this.ldr = -1;
            this.iR = -1;
            this.Kg = androidx.core.view.ViewCompat.MEASURED_SIZE_MASK;
            this.WR = androidx.core.view.ViewCompat.MEASURED_SIZE_MASK;
        }

        public bg(int i, int i2) {
            super(new android.view.ViewGroup.LayoutParams(i, i2));
            this.bg = 1;
            this.IL = 0.0f;
            this.bX = 0.0f;
            this.eqN = -1;
            this.zx = -1.0f;
            this.ldr = -1;
            this.iR = -1;
            this.Kg = androidx.core.view.ViewCompat.MEASURED_SIZE_MASK;
            this.WR = androidx.core.view.ViewCompat.MEASURED_SIZE_MASK;
        }

        public bg(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.bg = 1;
            this.IL = 0.0f;
            this.bX = 0.0f;
            this.eqN = -1;
            this.zx = -1.0f;
            this.ldr = -1;
            this.iR = -1;
            this.Kg = androidx.core.view.ViewCompat.MEASURED_SIZE_MASK;
            this.WR = androidx.core.view.ViewCompat.MEASURED_SIZE_MASK;
        }

        @Override // com.bytedance.adsdk.ugeno.zx.IL
        public int bg() {
            return this.width;
        }

        @Override // com.bytedance.adsdk.ugeno.zx.IL
        public int IL() {
            return this.height;
        }

        @Override // com.bytedance.adsdk.ugeno.zx.IL
        public int bX() {
            return this.bg;
        }

        public void bX(int i) {
            this.bg = i;
        }

        @Override // com.bytedance.adsdk.ugeno.zx.IL
        public float eqN() {
            return this.IL;
        }

        public void bg(float f) {
            this.IL = f;
        }

        @Override // com.bytedance.adsdk.ugeno.zx.IL
        public float zx() {
            return this.bX;
        }

        public void IL(float f) {
            this.bX = f;
        }

        @Override // com.bytedance.adsdk.ugeno.zx.IL
        public int ldr() {
            return this.eqN;
        }

        public void eqN(int i) {
            this.eqN = i;
        }

        @Override // com.bytedance.adsdk.ugeno.zx.IL
        public int iR() {
            return this.ldr;
        }

        @Override // com.bytedance.adsdk.ugeno.zx.IL
        public void bg(int i) {
            this.ldr = i;
        }

        @Override // com.bytedance.adsdk.ugeno.zx.IL
        public int Kg() {
            return this.iR;
        }

        @Override // com.bytedance.adsdk.ugeno.zx.IL
        public void IL(int i) {
            this.iR = i;
        }

        @Override // com.bytedance.adsdk.ugeno.zx.IL
        public int WR() {
            return this.Kg;
        }

        @Override // com.bytedance.adsdk.ugeno.zx.IL
        public int eo() {
            return this.WR;
        }

        @Override // com.bytedance.adsdk.ugeno.zx.IL
        public boolean VB() {
            return this.eo;
        }

        @Override // com.bytedance.adsdk.ugeno.zx.IL
        public float PX() {
            return this.zx;
        }

        public void bX(float f) {
            this.zx = f;
        }

        @Override // com.bytedance.adsdk.ugeno.zx.IL
        public int Ta() {
            return this.leftMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.zx.IL
        public int yDt() {
            return this.topMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.zx.IL
        public int Lq() {
            return this.rightMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.zx.IL
        public int vb() {
            return this.bottomMargin;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeInt(this.bg);
            parcel.writeFloat(this.IL);
            parcel.writeFloat(this.bX);
            parcel.writeInt(this.eqN);
            parcel.writeFloat(this.zx);
            parcel.writeInt(this.ldr);
            parcel.writeInt(this.iR);
            parcel.writeInt(this.Kg);
            parcel.writeInt(this.WR);
            parcel.writeByte(this.eo ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }

        protected bg(android.os.Parcel parcel) {
            super(0, 0);
            this.bg = 1;
            this.IL = 0.0f;
            this.bX = 0.0f;
            this.eqN = -1;
            this.zx = -1.0f;
            this.ldr = -1;
            this.iR = -1;
            this.Kg = androidx.core.view.ViewCompat.MEASURED_SIZE_MASK;
            this.WR = androidx.core.view.ViewCompat.MEASURED_SIZE_MASK;
            this.bg = parcel.readInt();
            this.IL = parcel.readFloat();
            this.bX = parcel.readFloat();
            this.eqN = parcel.readInt();
            this.zx = parcel.readFloat();
            this.ldr = parcel.readInt();
            this.iR = parcel.readInt();
            this.Kg = parcel.readInt();
            this.WR = parcel.readInt();
            this.eo = parcel.readByte() != 0;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }
    }

    public void bg(com.bytedance.adsdk.ugeno.IL.bX bXVar) {
        this.xxp = bXVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.bX bXVar = this.xxp;
        if (bXVar != null) {
            bXVar.iR();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.bX bXVar = this.xxp;
        if (bXVar != null) {
            bXVar.Kg();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        com.bytedance.adsdk.ugeno.bX bXVar = this.xxp;
        if (bXVar != null) {
            bXVar.IL(i, i2, i3, i4);
        }
    }
}
