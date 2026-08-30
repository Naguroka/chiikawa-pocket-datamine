package com.bytedance.adsdk.ugeno.zx;

/* JADX INFO: loaded from: classes3.dex */
class eqN {
    static final /* synthetic */ boolean bX = true;
    long[] IL;
    int[] bg;
    private final com.bytedance.adsdk.ugeno.zx.bg eqN;
    private long[] ldr;
    private boolean[] zx;

    int IL(long j) {
        return (int) (j >> 32);
    }

    long IL(int i, int i2) {
        return (((long) i) & androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE) | (((long) i2) << 32);
    }

    int bg(long j) {
        return (int) j;
    }

    eqN(com.bytedance.adsdk.ugeno.zx.bg bgVar) {
        this.eqN = bgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    int[] bg(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams, android.util.SparseIntArray sparseIntArray) {
        int flexItemCount = this.eqN.getFlexItemCount();
        java.util.List<com.bytedance.adsdk.ugeno.zx.eqN.IL> listIL = IL(flexItemCount);
        com.bytedance.adsdk.ugeno.zx.eqN.IL il = new com.bytedance.adsdk.ugeno.zx.eqN.IL();
        if (view != null && (layoutParams instanceof com.bytedance.adsdk.ugeno.zx.IL)) {
            il.IL = ((com.bytedance.adsdk.ugeno.zx.IL) layoutParams).bX();
        } else {
            il.IL = 1;
        }
        if (i != -1 && i != flexItemCount && i < this.eqN.getFlexItemCount()) {
            il.bg = i;
            while (i < flexItemCount) {
                listIL.get(i).bg++;
                i++;
            }
        } else {
            il.bg = flexItemCount;
        }
        listIL.add(il);
        return bg(flexItemCount + 1, listIL, sparseIntArray);
    }

    int[] bg(android.util.SparseIntArray sparseIntArray) {
        int flexItemCount = this.eqN.getFlexItemCount();
        return bg(flexItemCount, IL(flexItemCount), sparseIntArray);
    }

    private java.util.List<com.bytedance.adsdk.ugeno.zx.eqN.IL> IL(int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            com.bytedance.adsdk.ugeno.zx.IL il = (com.bytedance.adsdk.ugeno.zx.IL) this.eqN.bg(i2).getLayoutParams();
            com.bytedance.adsdk.ugeno.zx.eqN.IL il2 = new com.bytedance.adsdk.ugeno.zx.eqN.IL();
            il2.IL = il.bX();
            il2.bg = i2;
            arrayList.add(il2);
        }
        return arrayList;
    }

    boolean IL(android.util.SparseIntArray sparseIntArray) {
        int flexItemCount = this.eqN.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i = 0; i < flexItemCount; i++) {
            android.view.View viewBg = this.eqN.bg(i);
            if (viewBg != null && ((com.bytedance.adsdk.ugeno.zx.IL) viewBg.getLayoutParams()).bX() != sparseIntArray.get(i)) {
                return true;
            }
        }
        return false;
    }

    private int[] bg(int i, java.util.List<com.bytedance.adsdk.ugeno.zx.eqN.IL> list, android.util.SparseIntArray sparseIntArray) {
        java.util.Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        int i2 = 0;
        for (com.bytedance.adsdk.ugeno.zx.eqN.IL il : list) {
            iArr[i2] = il.bg;
            sparseIntArray.append(il.bg, il.IL);
            i2++;
        }
        return iArr;
    }

    void bg(com.bytedance.adsdk.ugeno.zx.eqN.bg bgVar, int i, int i2) {
        bg(bgVar, i, i2, Integer.MAX_VALUE, 0, -1, (java.util.List<com.bytedance.adsdk.ugeno.zx.bX>) null);
    }

    void IL(com.bytedance.adsdk.ugeno.zx.eqN.bg bgVar, int i, int i2) {
        bg(bgVar, i2, i, Integer.MAX_VALUE, 0, -1, (java.util.List<com.bytedance.adsdk.ugeno.zx.bX>) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    void bg(com.bytedance.adsdk.ugeno.zx.eqN.bg bgVar, int i, int i2, int i3, int i4, int i5, java.util.List<com.bytedance.adsdk.ugeno.zx.bX> list) {
        int i6;
        int i7;
        java.util.List<com.bytedance.adsdk.ugeno.zx.bX> list2;
        int i8;
        android.view.View view;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = i2;
        int i16 = i5;
        boolean zBg = this.eqN.bg();
        int mode = android.view.View.MeasureSpec.getMode(i);
        int size = android.view.View.MeasureSpec.getSize(i);
        java.util.List<com.bytedance.adsdk.ugeno.zx.bX> arrayList = list == null ? new java.util.ArrayList() : list;
        bgVar.bg = arrayList;
        int i17 = i16 == -1 ? 1 : 0;
        int iBg = bg(zBg);
        int iIL = IL(zBg);
        int iBX = bX(zBg);
        int iEqN = eqN(zBg);
        com.bytedance.adsdk.ugeno.zx.bX bXVar = new com.bytedance.adsdk.ugeno.zx.bX();
        int i18 = i4;
        bXVar.Lq = i18;
        int i19 = iIL + iBg;
        bXVar.zx = i19;
        int flexItemCount = this.eqN.getFlexItemCount();
        int i20 = i17;
        int i21 = Integer.MIN_VALUE;
        int i22 = 0;
        int iCombineMeasuredStates = 0;
        int i23 = 0;
        while (i18 < flexItemCount) {
            android.view.View viewIL = this.eqN.IL(i18);
            if (viewIL == null) {
                if (bg(i18, flexItemCount, bXVar)) {
                    bg(arrayList, bXVar, i18, i22);
                }
            } else {
                if (viewIL.getVisibility() == 8) {
                    bXVar.WR++;
                    bXVar.Kg++;
                    if (bg(i18, flexItemCount, bXVar)) {
                        bg(arrayList, bXVar, i18, i22);
                    }
                } else {
                    if (viewIL instanceof android.widget.CompoundButton) {
                        bg((android.widget.CompoundButton) viewIL);
                    }
                    com.bytedance.adsdk.ugeno.zx.IL il = (com.bytedance.adsdk.ugeno.zx.IL) viewIL.getLayoutParams();
                    int i24 = flexItemCount;
                    if (il.ldr() == 4) {
                        bXVar.yDt.add(java.lang.Integer.valueOf(i18));
                    }
                    int iBg2 = bg(il, zBg);
                    if (il.PX() != -1.0f && mode == 1073741824) {
                        iBg2 = java.lang.Math.round(size * il.PX());
                    }
                    if (zBg) {
                        int iBg3 = this.eqN.bg(i, i19 + bX(il, true) + eqN(il, true), iBg2);
                        int iIL2 = this.eqN.IL(i15, iBX + iEqN + zx(il, true) + ldr(il, true) + i22, IL(il, true));
                        viewIL.measure(iBg3, iIL2);
                        bg(i18, iBg3, iIL2, viewIL);
                        i7 = iBg3;
                    } else {
                        int iBg4 = this.eqN.bg(i15, iBX + iEqN + zx(il, false) + ldr(il, false) + i22, IL(il, false));
                        int iIL3 = this.eqN.IL(i, bX(il, false) + i19 + eqN(il, false), iBg2);
                        viewIL.measure(iBg4, iIL3);
                        bg(i18, iBg4, iIL3, viewIL);
                        i7 = iIL3;
                    }
                    bg(viewIL, i18);
                    iCombineMeasuredStates = android.view.View.combineMeasuredStates(iCombineMeasuredStates, viewIL.getMeasuredState());
                    int i25 = bXVar.zx;
                    int i26 = i22;
                    int i27 = i19;
                    com.bytedance.adsdk.ugeno.zx.bX bXVar2 = bXVar;
                    int i28 = size;
                    int i29 = i18;
                    list2 = arrayList;
                    int i30 = i7;
                    if (bg(viewIL, mode, i28, i25, eqN(il, zBg) + bg(viewIL, zBg) + bX(il, zBg), il, i29, i23, arrayList.size())) {
                        if (bXVar2.IL() > 0) {
                            bg(list2, bXVar2, i29 > 0 ? i29 - 1 : 0, i26);
                            i22 = bXVar2.iR + i26;
                        } else {
                            i22 = i26;
                        }
                        if (zBg) {
                            if (il.IL() == -1) {
                                com.bytedance.adsdk.ugeno.zx.bg bgVar2 = this.eqN;
                                i8 = i2;
                                i18 = i29;
                                view = viewIL;
                                view.measure(i30, bgVar2.IL(i8, bgVar2.getPaddingTop() + this.eqN.getPaddingBottom() + il.yDt() + il.vb() + i22, il.IL()));
                                bg(view, i18);
                            } else {
                                i8 = i2;
                                view = viewIL;
                                i18 = i29;
                            }
                        } else {
                            i8 = i2;
                            view = viewIL;
                            i18 = i29;
                            if (il.bg() == -1) {
                                com.bytedance.adsdk.ugeno.zx.bg bgVar3 = this.eqN;
                                view.measure(bgVar3.bg(i8, bgVar3.getPaddingLeft() + this.eqN.getPaddingRight() + il.Ta() + il.Lq() + i22, il.bg()), i30);
                                bg(view, i18);
                            }
                        }
                        bXVar = new com.bytedance.adsdk.ugeno.zx.bX();
                        i10 = 1;
                        bXVar.Kg = 1;
                        i9 = i27;
                        bXVar.zx = i9;
                        bXVar.Lq = i18;
                        i12 = Integer.MIN_VALUE;
                        i11 = 0;
                    } else {
                        i8 = i2;
                        view = viewIL;
                        i18 = i29;
                        bXVar = bXVar2;
                        i9 = i27;
                        i10 = 1;
                        bXVar.Kg++;
                        i11 = i23 + 1;
                        i22 = i26;
                        i12 = i21;
                    }
                    bXVar.xxp = (bXVar.xxp ? 1 : 0) | (il.eqN() != 0.0f ? i10 : 0);
                    bXVar.VzQ = (bXVar.VzQ ? 1 : 0) | (il.zx() != 0.0f ? i10 : 0);
                    int[] iArr = this.bg;
                    if (iArr != null) {
                        iArr[i18] = list2.size();
                    }
                    bXVar.zx += bg(view, zBg) + bX(il, zBg) + eqN(il, zBg);
                    bXVar.eo += il.eqN();
                    bXVar.VB += il.zx();
                    this.eqN.bg(view, i18, i11, bXVar);
                    int iMax = java.lang.Math.max(i12, IL(view, zBg) + zx(il, zBg) + ldr(il, zBg) + this.eqN.bg(view));
                    bXVar.iR = java.lang.Math.max(bXVar.iR, iMax);
                    if (zBg) {
                        if (this.eqN.getFlexWrap() != 2) {
                            bXVar.PX = java.lang.Math.max(bXVar.PX, view.getBaseline() + il.yDt());
                        } else {
                            bXVar.PX = java.lang.Math.max(bXVar.PX, (view.getMeasuredHeight() - view.getBaseline()) + il.vb());
                        }
                    }
                    i13 = i24;
                    if (bg(i18, i13, bXVar)) {
                        bg(list2, bXVar, i18, i22);
                        i22 += bXVar.iR;
                    }
                    i14 = i5;
                    if (i14 != -1 && list2.size() > 0 && list2.get(list2.size() - i10).vb >= i14 && i18 >= i14 && i20 == 0) {
                        i22 = -bXVar.bg();
                        i20 = i10;
                    }
                    if (i22 > i3 && i20 != 0) {
                        i6 = iCombineMeasuredStates;
                        bgVar.IL = i6;
                    } else {
                        i23 = i11;
                        i21 = iMax;
                    }
                }
                i18++;
                flexItemCount = i13;
                i15 = i8;
                i19 = i9;
                arrayList = list2;
                size = size;
                i16 = i14;
                mode = mode;
            }
            size = size;
            mode = mode;
            i8 = i15;
            i14 = i16;
            list2 = arrayList;
            i9 = i19;
            i13 = flexItemCount;
            i18++;
            flexItemCount = i13;
            i15 = i8;
            i19 = i9;
            arrayList = list2;
            size = size;
            i16 = i14;
            mode = mode;
        }
        i6 = iCombineMeasuredStates;
        bgVar.IL = i6;
    }

    private void bg(android.widget.CompoundButton compoundButton) {
        com.bytedance.adsdk.ugeno.zx.IL il = (com.bytedance.adsdk.ugeno.zx.IL) compoundButton.getLayoutParams();
        int iIR = il.iR();
        int iKg = il.Kg();
        android.graphics.drawable.Drawable drawableBg = com.bytedance.adsdk.ugeno.iR.zx.bg(compoundButton);
        int minimumWidth = drawableBg == null ? 0 : drawableBg.getMinimumWidth();
        int minimumHeight = drawableBg != null ? drawableBg.getMinimumHeight() : 0;
        if (iIR == -1) {
            iIR = minimumWidth;
        }
        il.bg(iIR);
        if (iKg == -1) {
            iKg = minimumHeight;
        }
        il.IL(iKg);
    }

    private int bg(boolean z) {
        if (z) {
            return this.eqN.getPaddingStart();
        }
        return this.eqN.getPaddingTop();
    }

    private int IL(boolean z) {
        if (z) {
            return this.eqN.getPaddingEnd();
        }
        return this.eqN.getPaddingBottom();
    }

    private int bX(boolean z) {
        if (z) {
            return this.eqN.getPaddingTop();
        }
        return this.eqN.getPaddingStart();
    }

    private int eqN(boolean z) {
        if (z) {
            return this.eqN.getPaddingBottom();
        }
        return this.eqN.getPaddingEnd();
    }

    private int bg(android.view.View view, boolean z) {
        if (z) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    private int IL(android.view.View view, boolean z) {
        if (z) {
            return view.getMeasuredHeight();
        }
        return view.getMeasuredWidth();
    }

    private int bg(com.bytedance.adsdk.ugeno.zx.IL il, boolean z) {
        if (z) {
            return il.bg();
        }
        return il.IL();
    }

    private int IL(com.bytedance.adsdk.ugeno.zx.IL il, boolean z) {
        if (z) {
            return il.IL();
        }
        return il.bg();
    }

    private int bX(com.bytedance.adsdk.ugeno.zx.IL il, boolean z) {
        if (z) {
            return il.Ta();
        }
        return il.yDt();
    }

    private int eqN(com.bytedance.adsdk.ugeno.zx.IL il, boolean z) {
        if (z) {
            return il.Lq();
        }
        return il.vb();
    }

    private int zx(com.bytedance.adsdk.ugeno.zx.IL il, boolean z) {
        if (z) {
            return il.yDt();
        }
        return il.Ta();
    }

    private int ldr(com.bytedance.adsdk.ugeno.zx.IL il, boolean z) {
        if (z) {
            return il.vb();
        }
        return il.Lq();
    }

    private boolean bg(android.view.View view, int i, int i2, int i3, int i4, com.bytedance.adsdk.ugeno.zx.IL il, int i5, int i6, int i7) {
        if (this.eqN.getFlexWrap() == 0) {
            return false;
        }
        if (il.VB()) {
            return true;
        }
        if (i == 0) {
            return false;
        }
        int maxLine = this.eqN.getMaxLine();
        if (maxLine != -1 && maxLine <= i7 + 1) {
            return false;
        }
        int iBg = this.eqN.bg(view, i5, i6);
        if (iBg > 0) {
            i4 += iBg;
        }
        return i2 < i3 + i4;
    }

    private boolean bg(int i, int i2, com.bytedance.adsdk.ugeno.zx.bX bXVar) {
        return i == i2 - 1 && bXVar.IL() != 0;
    }

    private void bg(java.util.List<com.bytedance.adsdk.ugeno.zx.bX> list, com.bytedance.adsdk.ugeno.zx.bX bXVar, int i, int i2) {
        bXVar.Ta = i2;
        this.eqN.bg(bXVar);
        bXVar.vb = i;
        list.add(bXVar);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    private void bg(android.view.View view, int i) {
        boolean z;
        com.bytedance.adsdk.ugeno.zx.IL il = (com.bytedance.adsdk.ugeno.zx.IL) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean z2 = true;
        if (measuredWidth < il.iR()) {
            measuredWidth = il.iR();
        } else {
            if (measuredWidth > il.WR()) {
                measuredWidth = il.WR();
            } else {
                z = false;
            }
            if (measuredHeight < il.Kg()) {
                measuredHeight = il.Kg();
            } else if (measuredHeight > il.eo()) {
                measuredHeight = il.eo();
            } else {
                z2 = z;
            }
            if (z2) {
                int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                int iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                bg(i, iMakeMeasureSpec, iMakeMeasureSpec2, view);
            }
        }
        z = true;
        if (measuredHeight < il.Kg()) {
            measuredHeight = il.Kg();
        } else if (measuredHeight > il.eo()) {
            measuredHeight = il.eo();
        } else {
            z2 = z;
        }
        if (z2) {
            int iMakeMeasureSpec3 = android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int iMakeMeasureSpec4 = android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
            bg(i, iMakeMeasureSpec3, iMakeMeasureSpec4, view);
        }
    }

    void bg(int i, int i2) {
        bg(i, i2, 0);
    }

    void bg(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        bX(this.eqN.getFlexItemCount());
        if (i3 >= this.eqN.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.eqN.getFlexDirection();
        int flexDirection2 = this.eqN.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = android.view.View.MeasureSpec.getMode(i);
            size = android.view.View.MeasureSpec.getSize(i);
            int largestMainSize = this.eqN.getLargestMainSize();
            if (mode != 1073741824) {
                size = java.lang.Math.min(largestMainSize, size);
            }
            paddingLeft = this.eqN.getPaddingLeft();
            paddingRight = this.eqN.getPaddingRight();
        } else if (flexDirection2 == 2 || flexDirection2 == 3) {
            int mode2 = android.view.View.MeasureSpec.getMode(i2);
            size = android.view.View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                size = this.eqN.getLargestMainSize();
            }
            paddingLeft = this.eqN.getPaddingTop();
            paddingRight = this.eqN.getPaddingBottom();
        } else {
            throw new java.lang.IllegalArgumentException("Invalid flex direction: ".concat(java.lang.String.valueOf(flexDirection)));
        }
        int i4 = paddingLeft + paddingRight;
        int[] iArr = this.bg;
        java.util.List<com.bytedance.adsdk.ugeno.zx.bX> flexLinesInternal = this.eqN.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        for (int i5 = iArr != null ? iArr[i3] : 0; i5 < size2; i5++) {
            com.bytedance.adsdk.ugeno.zx.bX bXVar = flexLinesInternal.get(i5);
            if (bXVar.zx < size && bXVar.xxp) {
                bg(i, i2, bXVar, size, i4, false);
            } else if (bXVar.zx > size && bXVar.VzQ) {
                IL(i, i2, bXVar, size, i4, false);
            }
        }
    }

    private void bX(int i) {
        boolean[] zArr = this.zx;
        if (zArr == null) {
            this.zx = new boolean[java.lang.Math.max(i, 10)];
        } else if (zArr.length < i) {
            this.zx = new boolean[java.lang.Math.max(zArr.length * 2, i)];
        } else {
            java.util.Arrays.fill(zArr, false);
        }
    }

    private void bg(int i, int i2, com.bytedance.adsdk.ugeno.zx.bX bXVar, int i3, int i4, boolean z) {
        int i5;
        int iMax;
        double d;
        int i6;
        double d2;
        float f = 0.0f;
        if (bXVar.eo <= 0.0f || i3 < bXVar.zx) {
            return;
        }
        int i7 = bXVar.zx;
        float f2 = (i3 - bXVar.zx) / bXVar.eo;
        bXVar.zx = i4 + bXVar.ldr;
        if (!z) {
            bXVar.iR = Integer.MIN_VALUE;
        }
        int i8 = 0;
        float f3 = 0.0f;
        boolean z2 = false;
        int i9 = 0;
        while (i8 < bXVar.Kg) {
            int i10 = bXVar.Lq + i8;
            android.view.View viewIL = this.eqN.IL(i10);
            if (viewIL == null || viewIL.getVisibility() == 8) {
                i5 = i7;
            } else {
                com.bytedance.adsdk.ugeno.zx.IL il = (com.bytedance.adsdk.ugeno.zx.IL) viewIL.getLayoutParams();
                int flexDirection = this.eqN.getFlexDirection();
                if (flexDirection == 0 || flexDirection == 1) {
                    int i11 = i7;
                    int measuredWidth = viewIL.getMeasuredWidth();
                    long[] jArr = this.ldr;
                    if (jArr != null) {
                        measuredWidth = bg(jArr[i10]);
                    }
                    int measuredHeight = viewIL.getMeasuredHeight();
                    long[] jArr2 = this.ldr;
                    i5 = i11;
                    if (jArr2 != null) {
                        measuredHeight = IL(jArr2[i10]);
                    }
                    if (!this.zx[i10] && il.eqN() > 0.0f) {
                        float fEqN = measuredWidth + (il.eqN() * f2);
                        if (i8 == bXVar.Kg - 1) {
                            fEqN += f3;
                            f3 = 0.0f;
                        }
                        int iRound = java.lang.Math.round(fEqN);
                        if (iRound > il.WR()) {
                            iRound = il.WR();
                            this.zx[i10] = true;
                            bXVar.eo -= il.eqN();
                            z2 = true;
                        } else {
                            f3 += fEqN - iRound;
                            double d3 = f3;
                            if (d3 > 1.0d) {
                                iRound++;
                                d = d3 - 1.0d;
                            } else if (d3 < -1.0d) {
                                iRound--;
                                d = d3 + 1.0d;
                            }
                            f3 = (float) d;
                        }
                        int iIL = IL(i2, il, bXVar.Ta);
                        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewIL.measure(iMakeMeasureSpec, iIL);
                        int measuredWidth2 = viewIL.getMeasuredWidth();
                        int measuredHeight2 = viewIL.getMeasuredHeight();
                        bg(i10, iMakeMeasureSpec, iIL, viewIL);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = java.lang.Math.max(i9, measuredHeight + il.yDt() + il.vb() + this.eqN.bg(viewIL));
                    bXVar.zx += measuredWidth + il.Ta() + il.Lq();
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewIL.getMeasuredHeight();
                    long[] jArr3 = this.ldr;
                    if (jArr3 != null) {
                        measuredHeight3 = IL(jArr3[i10]);
                    }
                    int measuredWidth3 = viewIL.getMeasuredWidth();
                    long[] jArr4 = this.ldr;
                    if (jArr4 != null) {
                        measuredWidth3 = bg(jArr4[i10]);
                    }
                    if (this.zx[i10] || il.eqN() <= f) {
                        i6 = i7;
                    } else {
                        float fEqN2 = measuredHeight3 + (il.eqN() * f2);
                        if (i8 == bXVar.Kg - 1) {
                            fEqN2 += f3;
                            f3 = f;
                        }
                        int iRound2 = java.lang.Math.round(fEqN2);
                        if (iRound2 > il.eo()) {
                            iRound2 = il.eo();
                            this.zx[i10] = true;
                            bXVar.eo -= il.eqN();
                            i6 = i7;
                            z2 = true;
                        } else {
                            f3 += fEqN2 - iRound2;
                            i6 = i7;
                            double d4 = f3;
                            if (d4 > 1.0d) {
                                iRound2++;
                                d2 = d4 - 1.0d;
                            } else if (d4 < -1.0d) {
                                iRound2--;
                                d2 = d4 + 1.0d;
                            }
                            f3 = (float) d2;
                        }
                        int iBg = bg(i, il, bXVar.Ta);
                        int iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewIL.measure(iBg, iMakeMeasureSpec2);
                        measuredWidth3 = viewIL.getMeasuredWidth();
                        int measuredHeight4 = viewIL.getMeasuredHeight();
                        bg(i10, iBg, iMakeMeasureSpec2, viewIL);
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = java.lang.Math.max(i9, measuredWidth3 + il.Ta() + il.Lq() + this.eqN.bg(viewIL));
                    bXVar.zx += measuredHeight3 + il.yDt() + il.vb();
                    i5 = i6;
                }
                bXVar.iR = java.lang.Math.max(bXVar.iR, iMax);
                i9 = iMax;
            }
            i8++;
            i7 = i5;
            f = 0.0f;
        }
        int i12 = i7;
        if (!z2 || i12 == bXVar.zx) {
            return;
        }
        bg(i, i2, bXVar, i3, i4, true);
    }

    private void IL(int i, int i2, com.bytedance.adsdk.ugeno.zx.bX bXVar, int i3, int i4, boolean z) {
        int i5;
        int iMax;
        int i6 = bXVar.zx;
        float f = 0.0f;
        if (bXVar.VB <= 0.0f || i3 > bXVar.zx) {
            return;
        }
        float f2 = (bXVar.zx - i3) / bXVar.VB;
        bXVar.zx = i4 + bXVar.ldr;
        if (!z) {
            bXVar.iR = Integer.MIN_VALUE;
        }
        int i7 = 0;
        float f3 = 0.0f;
        boolean z2 = false;
        int i8 = 0;
        while (i7 < bXVar.Kg) {
            int i9 = bXVar.Lq + i7;
            android.view.View viewIL = this.eqN.IL(i9);
            if (viewIL == null || viewIL.getVisibility() == 8) {
                i5 = i7;
            } else {
                com.bytedance.adsdk.ugeno.zx.IL il = (com.bytedance.adsdk.ugeno.zx.IL) viewIL.getLayoutParams();
                int flexDirection = this.eqN.getFlexDirection();
                if (flexDirection == 0 || flexDirection == 1) {
                    i5 = i7;
                    int measuredWidth = viewIL.getMeasuredWidth();
                    long[] jArr = this.ldr;
                    if (jArr != null) {
                        measuredWidth = bg(jArr[i9]);
                    }
                    int measuredHeight = viewIL.getMeasuredHeight();
                    long[] jArr2 = this.ldr;
                    if (jArr2 != null) {
                        measuredHeight = IL(jArr2[i9]);
                    }
                    if (!this.zx[i9] && il.zx() > 0.0f) {
                        float fZx = measuredWidth - (il.zx() * f2);
                        if (i5 == bXVar.Kg - 1) {
                            fZx += f3;
                            f3 = 0.0f;
                        }
                        int iRound = java.lang.Math.round(fZx);
                        if (iRound < il.iR()) {
                            iRound = il.iR();
                            this.zx[i9] = true;
                            bXVar.VB -= il.zx();
                            z2 = true;
                        } else {
                            f3 += fZx - iRound;
                            double d = f3;
                            if (d > 1.0d) {
                                iRound++;
                                f3 -= 1.0f;
                            } else if (d < -1.0d) {
                                iRound--;
                                f3 += 1.0f;
                            }
                        }
                        int iIL = IL(i2, il, bXVar.Ta);
                        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewIL.measure(iMakeMeasureSpec, iIL);
                        int measuredWidth2 = viewIL.getMeasuredWidth();
                        int measuredHeight2 = viewIL.getMeasuredHeight();
                        bg(i9, iMakeMeasureSpec, iIL, viewIL);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = java.lang.Math.max(i8, measuredHeight + il.yDt() + il.vb() + this.eqN.bg(viewIL));
                    bXVar.zx += measuredWidth + il.Ta() + il.Lq();
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewIL.getMeasuredHeight();
                    long[] jArr3 = this.ldr;
                    if (jArr3 != null) {
                        measuredHeight3 = IL(jArr3[i9]);
                    }
                    int measuredWidth3 = viewIL.getMeasuredWidth();
                    long[] jArr4 = this.ldr;
                    if (jArr4 != null) {
                        measuredWidth3 = bg(jArr4[i9]);
                    }
                    if (this.zx[i9] || il.zx() <= f) {
                        i5 = i7;
                    } else {
                        float fZx2 = measuredHeight3 - (il.zx() * f2);
                        if (i7 == bXVar.Kg - 1) {
                            fZx2 += f3;
                            f3 = f;
                        }
                        int iRound2 = java.lang.Math.round(fZx2);
                        if (iRound2 < il.Kg()) {
                            iRound2 = il.Kg();
                            this.zx[i9] = true;
                            bXVar.VB -= il.zx();
                            i5 = i7;
                            z2 = true;
                        } else {
                            f3 += fZx2 - iRound2;
                            i5 = i7;
                            double d2 = f3;
                            if (d2 > 1.0d) {
                                iRound2++;
                                f3 -= 1.0f;
                            } else if (d2 < -1.0d) {
                                iRound2--;
                                f3 += 1.0f;
                            }
                        }
                        int iBg = bg(i, il, bXVar.Ta);
                        int iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewIL.measure(iBg, iMakeMeasureSpec2);
                        measuredWidth3 = viewIL.getMeasuredWidth();
                        int measuredHeight4 = viewIL.getMeasuredHeight();
                        bg(i9, iBg, iMakeMeasureSpec2, viewIL);
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = java.lang.Math.max(i8, measuredWidth3 + il.Ta() + il.Lq() + this.eqN.bg(viewIL));
                    bXVar.zx += measuredHeight3 + il.yDt() + il.vb();
                }
                bXVar.iR = java.lang.Math.max(bXVar.iR, iMax);
                i8 = iMax;
            }
            i7 = i5 + 1;
            f = 0.0f;
        }
        if (!z2 || i6 == bXVar.zx) {
            return;
        }
        IL(i, i2, bXVar, i3, i4, true);
    }

    private int bg(int i, com.bytedance.adsdk.ugeno.zx.IL il, int i2) {
        com.bytedance.adsdk.ugeno.zx.bg bgVar = this.eqN;
        int iBg = bgVar.bg(i, bgVar.getPaddingLeft() + this.eqN.getPaddingRight() + il.Ta() + il.Lq() + i2, il.bg());
        int size = android.view.View.MeasureSpec.getSize(iBg);
        if (size > il.WR()) {
            return android.view.View.MeasureSpec.makeMeasureSpec(il.WR(), android.view.View.MeasureSpec.getMode(iBg));
        }
        return size < il.iR() ? android.view.View.MeasureSpec.makeMeasureSpec(il.iR(), android.view.View.MeasureSpec.getMode(iBg)) : iBg;
    }

    private int IL(int i, com.bytedance.adsdk.ugeno.zx.IL il, int i2) {
        com.bytedance.adsdk.ugeno.zx.bg bgVar = this.eqN;
        int iIL = bgVar.IL(i, bgVar.getPaddingTop() + this.eqN.getPaddingBottom() + il.yDt() + il.vb() + i2, il.IL());
        int size = android.view.View.MeasureSpec.getSize(iIL);
        if (size > il.eo()) {
            return android.view.View.MeasureSpec.makeMeasureSpec(il.eo(), android.view.View.MeasureSpec.getMode(iIL));
        }
        return size < il.Kg() ? android.view.View.MeasureSpec.makeMeasureSpec(il.Kg(), android.view.View.MeasureSpec.getMode(iIL)) : iIL;
    }

    void IL(int i, int i2, int i3) {
        int mode;
        int size;
        int flexDirection = this.eqN.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode2 = android.view.View.MeasureSpec.getMode(i2);
            int size2 = android.view.View.MeasureSpec.getSize(i2);
            mode = mode2;
            size = size2;
        } else if (flexDirection == 2 || flexDirection == 3) {
            mode = android.view.View.MeasureSpec.getMode(i);
            size = android.view.View.MeasureSpec.getSize(i);
        } else {
            throw new java.lang.IllegalArgumentException("Invalid flex direction: ".concat(java.lang.String.valueOf(flexDirection)));
        }
        java.util.List<com.bytedance.adsdk.ugeno.zx.bX> flexLinesInternal = this.eqN.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = this.eqN.getSumOfCrossSize() + i3;
            int i4 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).iR = size - i3;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = this.eqN.getAlignContent();
                if (alignContent == 1) {
                    int i5 = size - sumOfCrossSize;
                    com.bytedance.adsdk.ugeno.zx.bX bXVar = new com.bytedance.adsdk.ugeno.zx.bX();
                    bXVar.iR = i5;
                    flexLinesInternal.add(0, bXVar);
                    return;
                }
                if (alignContent == 2) {
                    this.eqN.setFlexLines(bg(flexLinesInternal, size, sumOfCrossSize));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize < size) {
                        float size3 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        int size4 = flexLinesInternal.size();
                        float f = 0.0f;
                        while (i4 < size4) {
                            arrayList.add(flexLinesInternal.get(i4));
                            if (i4 != flexLinesInternal.size() - 1) {
                                com.bytedance.adsdk.ugeno.zx.bX bXVar2 = new com.bytedance.adsdk.ugeno.zx.bX();
                                if (i4 == flexLinesInternal.size() - 2) {
                                    bXVar2.iR = java.lang.Math.round(f + size3);
                                    f = 0.0f;
                                } else {
                                    bXVar2.iR = java.lang.Math.round(size3);
                                }
                                f += size3 - bXVar2.iR;
                                if (f > 1.0f) {
                                    bXVar2.iR++;
                                    f -= 1.0f;
                                } else if (f < -1.0f) {
                                    bXVar2.iR--;
                                    f += 1.0f;
                                }
                                arrayList.add(bXVar2);
                            }
                            i4++;
                        }
                        this.eqN.setFlexLines(arrayList);
                        return;
                    }
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        this.eqN.setFlexLines(bg(flexLinesInternal, size, sumOfCrossSize));
                        return;
                    }
                    int size5 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    com.bytedance.adsdk.ugeno.zx.bX bXVar3 = new com.bytedance.adsdk.ugeno.zx.bX();
                    bXVar3.iR = size5;
                    for (com.bytedance.adsdk.ugeno.zx.bX bXVar4 : flexLinesInternal) {
                        arrayList2.add(bXVar3);
                        arrayList2.add(bXVar4);
                        arrayList2.add(bXVar3);
                    }
                    this.eqN.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size6 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size7 = flexLinesInternal.size();
                    float f2 = 0.0f;
                    while (i4 < size7) {
                        com.bytedance.adsdk.ugeno.zx.bX bXVar5 = flexLinesInternal.get(i4);
                        float f3 = bXVar5.iR + size6;
                        if (i4 == flexLinesInternal.size() - 1) {
                            f3 += f2;
                            f2 = 0.0f;
                        }
                        int iRound = java.lang.Math.round(f3);
                        f2 += f3 - iRound;
                        if (f2 > 1.0f) {
                            iRound++;
                            f2 -= 1.0f;
                        } else if (f2 < -1.0f) {
                            iRound--;
                            f2 += 1.0f;
                        }
                        bXVar5.iR = iRound;
                        i4++;
                    }
                }
            }
        }
    }

    private java.util.List<com.bytedance.adsdk.ugeno.zx.bX> bg(java.util.List<com.bytedance.adsdk.ugeno.zx.bX> list, int i, int i2) {
        int i3 = (i - i2) / 2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.bytedance.adsdk.ugeno.zx.bX bXVar = new com.bytedance.adsdk.ugeno.zx.bX();
        bXVar.iR = i3;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 == 0) {
                arrayList.add(bXVar);
            }
            arrayList.add(list.get(i4));
            if (i4 == list.size() - 1) {
                arrayList.add(bXVar);
            }
        }
        return arrayList;
    }

    void bg() {
        bg(0);
    }

    void bg(int i) {
        android.view.View viewIL;
        if (i >= this.eqN.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.eqN.getFlexDirection();
        if (this.eqN.getAlignItems() == 4) {
            int[] iArr = this.bg;
            java.util.List<com.bytedance.adsdk.ugeno.zx.bX> flexLinesInternal = this.eqN.getFlexLinesInternal();
            int size = flexLinesInternal.size();
            for (int i2 = iArr != null ? iArr[i] : 0; i2 < size; i2++) {
                com.bytedance.adsdk.ugeno.zx.bX bXVar = flexLinesInternal.get(i2);
                int i3 = bXVar.Kg;
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = bXVar.Lq + i4;
                    if (i4 < this.eqN.getFlexItemCount() && (viewIL = this.eqN.IL(i5)) != null && viewIL.getVisibility() != 8) {
                        com.bytedance.adsdk.ugeno.zx.IL il = (com.bytedance.adsdk.ugeno.zx.IL) viewIL.getLayoutParams();
                        if (il.ldr() == -1 || il.ldr() == 4) {
                            if (flexDirection == 0 || flexDirection == 1) {
                                bg(viewIL, bXVar.iR, i5);
                            } else if (flexDirection == 2 || flexDirection == 3) {
                                IL(viewIL, bXVar.iR, i5);
                            } else {
                                throw new java.lang.IllegalArgumentException("Invalid flex direction: ".concat(java.lang.String.valueOf(flexDirection)));
                            }
                        }
                    }
                }
            }
            return;
        }
        for (com.bytedance.adsdk.ugeno.zx.bX bXVar2 : this.eqN.getFlexLinesInternal()) {
            for (java.lang.Integer num : bXVar2.yDt) {
                android.view.View viewIL2 = this.eqN.IL(num.intValue());
                if (flexDirection == 0 || flexDirection == 1) {
                    bg(viewIL2, bXVar2.iR, num.intValue());
                } else if (flexDirection == 2 || flexDirection == 3) {
                    IL(viewIL2, bXVar2.iR, num.intValue());
                } else {
                    throw new java.lang.IllegalArgumentException("Invalid flex direction: ".concat(java.lang.String.valueOf(flexDirection)));
                }
            }
        }
    }

    private void bg(android.view.View view, int i, int i2) {
        int measuredWidth;
        com.bytedance.adsdk.ugeno.zx.IL il = (com.bytedance.adsdk.ugeno.zx.IL) view.getLayoutParams();
        int iMin = java.lang.Math.min(java.lang.Math.max(((i - il.yDt()) - il.vb()) - this.eqN.bg(view), il.Kg()), il.eo());
        long[] jArr = this.ldr;
        if (jArr != null) {
            measuredWidth = bg(jArr[i2]);
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        bg(i2, iMakeMeasureSpec, iMakeMeasureSpec2, view);
    }

    private void IL(android.view.View view, int i, int i2) {
        int measuredHeight;
        com.bytedance.adsdk.ugeno.zx.IL il = (com.bytedance.adsdk.ugeno.zx.IL) view.getLayoutParams();
        int iMin = java.lang.Math.min(java.lang.Math.max(((i - il.Ta()) - il.Lq()) - this.eqN.bg(view), il.iR()), il.WR());
        long[] jArr = this.ldr;
        if (jArr != null) {
            measuredHeight = IL(jArr[i2]);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        bg(i2, iMakeMeasureSpec2, iMakeMeasureSpec, view);
    }

    void bg(android.view.View view, com.bytedance.adsdk.ugeno.zx.bX bXVar, int i, int i2, int i3, int i4) {
        com.bytedance.adsdk.ugeno.zx.IL il = (com.bytedance.adsdk.ugeno.zx.IL) view.getLayoutParams();
        int alignItems = this.eqN.getAlignItems();
        if (il.ldr() != -1) {
            alignItems = il.ldr();
        }
        int i5 = bXVar.iR;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (this.eqN.getFlexWrap() != 2) {
                    int i6 = i2 + i5;
                    view.layout(i, (i6 - view.getMeasuredHeight()) - il.vb(), i3, i6 - il.vb());
                    return;
                } else {
                    view.layout(i, (i2 - i5) + view.getMeasuredHeight() + il.yDt(), i3, (i4 - i5) + view.getMeasuredHeight() + il.yDt());
                    return;
                }
            }
            if (alignItems == 2) {
                int measuredHeight = (((i5 - view.getMeasuredHeight()) + il.yDt()) - il.vb()) / 2;
                if (this.eqN.getFlexWrap() != 2) {
                    int i7 = i2 + measuredHeight;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    return;
                } else {
                    int i8 = i2 - measuredHeight;
                    view.layout(i, i8, i3, view.getMeasuredHeight() + i8);
                    return;
                }
            }
            if (alignItems == 3) {
                if (this.eqN.getFlexWrap() != 2) {
                    int iMax = java.lang.Math.max(bXVar.PX - view.getBaseline(), il.yDt());
                    view.layout(i, i2 + iMax, i3, i4 + iMax);
                    return;
                } else {
                    int iMax2 = java.lang.Math.max((bXVar.PX - view.getMeasuredHeight()) + view.getBaseline(), il.vb());
                    view.layout(i, i2 - iMax2, i3, i4 - iMax2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (this.eqN.getFlexWrap() != 2) {
            view.layout(i, i2 + il.yDt(), i3, i4 + il.yDt());
        } else {
            view.layout(i, i2 - il.vb(), i3, i4 - il.vb());
        }
    }

    void bg(android.view.View view, com.bytedance.adsdk.ugeno.zx.bX bXVar, boolean z, int i, int i2, int i3, int i4) {
        com.bytedance.adsdk.ugeno.zx.IL il = (com.bytedance.adsdk.ugeno.zx.IL) view.getLayoutParams();
        int alignItems = this.eqN.getAlignItems();
        if (il.ldr() != -1) {
            alignItems = il.ldr();
        }
        int i5 = bXVar.iR;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z) {
                    view.layout(((i + i5) - view.getMeasuredWidth()) - il.Lq(), i2, ((i3 + i5) - view.getMeasuredWidth()) - il.Lq(), i4);
                    return;
                } else {
                    view.layout((i - i5) + view.getMeasuredWidth() + il.Ta(), i2, (i3 - i5) + view.getMeasuredWidth() + il.Ta(), i4);
                    return;
                }
            }
            if (alignItems == 2) {
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int measuredWidth = (((i5 - view.getMeasuredWidth()) + com.bytedance.adsdk.ugeno.iR.ldr.bg(marginLayoutParams)) - com.bytedance.adsdk.ugeno.iR.ldr.IL(marginLayoutParams)) / 2;
                if (!z) {
                    view.layout(i + measuredWidth, i2, i3 + measuredWidth, i4);
                    return;
                } else {
                    view.layout(i - measuredWidth, i2, i3 - measuredWidth, i4);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (!z) {
            view.layout(i + il.Ta(), i2, i3 + il.Ta(), i4);
        } else {
            view.layout(i - il.Lq(), i2, i3 - il.Lq(), i4);
        }
    }

    private void bg(int i, int i2, int i3, android.view.View view) {
        long[] jArr = this.IL;
        if (jArr != null) {
            jArr[i] = IL(i2, i3);
        }
        long[] jArr2 = this.ldr;
        if (jArr2 != null) {
            jArr2[i] = IL(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    private static class IL implements java.lang.Comparable<com.bytedance.adsdk.ugeno.zx.eqN.IL> {
        int IL;
        int bg;

        private IL() {
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
        public int compareTo(com.bytedance.adsdk.ugeno.zx.eqN.IL il) {
            int i = this.IL;
            int i2 = il.IL;
            return i != i2 ? i - i2 : this.bg - il.bg;
        }

        public java.lang.String toString() {
            return "Order{order=" + this.IL + ", index=" + this.bg + '}';
        }
    }

    static class bg {
        int IL;
        java.util.List<com.bytedance.adsdk.ugeno.zx.bX> bg;

        bg() {
        }

        void bg() {
            this.bg = null;
            this.IL = 0;
        }
    }
}
