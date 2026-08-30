package com.bytedance.adsdk.ugeno.Kg;

/* JADX INFO: loaded from: classes3.dex */
public class bX extends android.view.ViewGroup {
    private boolean ApA;
    private int CQc;
    private boolean DDQ;
    private int Dt;
    private int Dxa;
    private float Fy;
    private com.bytedance.adsdk.ugeno.Kg.bX.eqN GZ;
    private boolean GvG;
    private boolean JAA;
    private boolean Ja;
    private final com.bytedance.adsdk.ugeno.Kg.bX.IL Kg;
    private float LKE;
    private float LZ;
    private java.util.List<java.lang.Object> Ld;
    private com.bytedance.adsdk.ugeno.Kg.bX.ldr Lq;
    private java.lang.ClassLoader PX;
    private boolean Pae;
    private android.widget.EdgeEffect RJ;
    private final java.lang.Runnable RiO;
    private android.widget.Scroller Ta;
    private boolean Uq;
    private int Uw;
    private android.os.Parcelable VB;
    private int VJ;
    private int VW;
    private int VzQ;
    private final android.graphics.Rect WR;
    private java.util.ArrayList<android.view.View> Ys;
    private float ZQc;
    private int aGH;
    private float ayS;
    private com.bytedance.adsdk.ugeno.Kg.bX.eqN bCU;
    private int bN;
    com.bytedance.adsdk.ugeno.Kg.IL bX;
    private int bg;
    private int cZH;
    private float daV;
    private int eo;
    int eqN;
    private java.util.List<com.bytedance.adsdk.ugeno.Kg.bX.eqN> gXn;
    private final java.util.ArrayList<com.bytedance.adsdk.ugeno.Kg.bX.IL> iR;
    private int jz;
    private boolean kMt;
    private int lM;
    private int qC;
    private int rri;
    private boolean sVc;
    private int tC;
    private int tuV;
    private android.widget.EdgeEffect txA;
    private android.view.VelocityTracker uu;
    private int vb;
    private com.bytedance.adsdk.ugeno.Kg.bX.zx wS;
    private android.graphics.drawable.Drawable xxp;
    private boolean yDt;
    private int zCS;
    static final int[] IL = {android.R.attr.layout_gravity};
    private static final java.util.Comparator<com.bytedance.adsdk.ugeno.Kg.bX.IL> zx = new java.util.Comparator<com.bytedance.adsdk.ugeno.Kg.bX.IL>() { // from class: com.bytedance.adsdk.ugeno.Kg.bX.1
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
        public int compare(com.bytedance.adsdk.ugeno.Kg.bX.IL il, com.bytedance.adsdk.ugeno.Kg.bX.IL il2) {
            return il.IL - il2.IL;
        }
    };
    private static final android.view.animation.Interpolator ldr = new android.view.animation.Interpolator() { // from class: com.bytedance.adsdk.ugeno.Kg.bX.2
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    private static final com.bytedance.adsdk.ugeno.Kg.bX.Kg dS = new com.bytedance.adsdk.ugeno.Kg.bX.Kg();

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
    @java.lang.annotation.Inherited
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface bg {
    }

    public interface eqN {
        void Kg(int i);

        void bg(int i, float f, int i2);
    }

    public interface zx {
        void bg(android.view.View view, float f);
    }

    static class IL {
        int IL;
        boolean bX;
        java.lang.Object bg;
        float eqN;
        float zx;

        IL() {
        }
    }

    public bX(android.content.Context context) {
        super(context);
        this.iR = new java.util.ArrayList<>();
        this.Kg = new com.bytedance.adsdk.ugeno.Kg.bX.IL();
        this.WR = new android.graphics.Rect();
        this.eo = -1;
        this.VB = null;
        this.PX = null;
        this.Fy = -3.4028235E38f;
        this.LZ = Float.MAX_VALUE;
        this.Uw = 1;
        this.CQc = -1;
        this.sVc = true;
        this.ApA = false;
        this.RiO = new java.lang.Runnable() { // from class: com.bytedance.adsdk.ugeno.Kg.bX.3
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.adsdk.ugeno.Kg.bX.this.setScrollState(0);
                com.bytedance.adsdk.ugeno.Kg.bX.this.bX();
            }
        };
        this.Dt = 0;
        bg();
    }

    void bg() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        android.content.Context context = getContext();
        this.Ta = new android.widget.Scroller(context, ldr);
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.VJ = viewConfiguration.getScaledPagingTouchSlop();
        this.qC = (int) (400.0f * f);
        this.Dxa = viewConfiguration.getScaledMaximumFlingVelocity();
        this.RJ = new android.widget.EdgeEffect(context);
        this.txA = new android.widget.EdgeEffect(context);
        this.bN = (int) (25.0f * f);
        this.jz = (int) (2.0f * f);
        this.aGH = (int) (f * 16.0f);
    }

    public void setScroller(android.widget.Scroller scroller) {
        this.Ta = scroller;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.RiO);
        android.widget.Scroller scroller = this.Ta;
        if (scroller != null && !scroller.isFinished()) {
            this.Ta.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    void setScrollState(int i) {
        if (this.Dt == i) {
            return;
        }
        this.Dt = i;
        if (this.wS != null) {
            IL(i != 0);
        }
        ldr(i);
    }

    public void setAdapter(com.bytedance.adsdk.ugeno.Kg.IL il) {
        com.bytedance.adsdk.ugeno.Kg.IL il2 = this.bX;
        if (il2 != null) {
            il2.bg((android.database.DataSetObserver) null);
            for (int i = 0; i < this.iR.size(); i++) {
                com.bytedance.adsdk.ugeno.Kg.bX.IL il3 = this.iR.get(i);
                this.bX.bg((android.view.ViewGroup) this, il3.IL, il3.bg);
            }
            this.iR.clear();
            ldr();
            this.eqN = 0;
            scrollTo(0, 0);
        }
        this.bX = il;
        this.bg = 0;
        if (il != null) {
            if (this.Lq == null) {
                this.Lq = new com.bytedance.adsdk.ugeno.Kg.bX.ldr();
            }
            this.bX.bg((android.database.DataSetObserver) this.Lq);
            this.Ja = false;
            boolean z = this.sVc;
            this.sVc = true;
            this.bg = this.bX.bg();
            int i2 = this.eo;
            if (i2 >= 0) {
                bg(i2, false, true);
                this.eo = -1;
                this.VB = null;
                this.PX = null;
            } else if (!z) {
                bX();
            } else {
                requestLayout();
            }
        }
        java.util.List<java.lang.Object> list = this.Ld;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.Ld.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.Ld.get(i3);
        }
    }

    private void ldr() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((com.bytedance.adsdk.ugeno.Kg.bX.C0082bX) getChildAt(i).getLayoutParams()).bg) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    public com.bytedance.adsdk.ugeno.Kg.IL getAdapter() {
        return this.bX;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public void setCurrentItem(int i) {
        this.Ja = false;
        bg(i, !this.sVc, false);
    }

    public void bg(int i, boolean z) {
        this.Ja = false;
        bg(i, z, false);
    }

    public int getCurrentItem() {
        return this.eqN;
    }

    void bg(int i, boolean z, boolean z2) {
        bg(i, z, z2, 0);
    }

    void bg(int i, boolean z, boolean z2, int i2) {
        com.bytedance.adsdk.ugeno.Kg.IL il = this.bX;
        if (il == null || il.bg() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.eqN == i && this.iR.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.bX.bg()) {
            i = this.bX.bg() - 1;
        }
        int i3 = this.Uw;
        int i4 = this.eqN;
        if (i > i4 + i3 || i < i4 - i3) {
            for (int i5 = 0; i5 < this.iR.size(); i5++) {
                this.iR.get(i5).bX = true;
            }
        }
        boolean z3 = this.eqN != i;
        if (this.sVc) {
            this.eqN = i;
            if (z3) {
                zx(i);
            }
            requestLayout();
            return;
        }
        bg(i);
        bg(i, z, i2, z3);
    }

    private void bg(int i, boolean z, int i2, boolean z2) {
        com.bytedance.adsdk.ugeno.Kg.bX.IL IL2 = IL(i);
        int clientWidth = IL2 != null ? (int) (getClientWidth() * java.lang.Math.max(this.Fy, java.lang.Math.min(IL2.zx, this.LZ))) : 0;
        if (z) {
            bg(clientWidth, 0, i2);
            if (z2) {
                zx(i);
                return;
            }
            return;
        }
        if (z2) {
            zx(i);
        }
        bg(false);
        scrollTo(clientWidth, 0);
        eqN(clientWidth);
    }

    @java.lang.Deprecated
    public void setOnPageChangeListener(com.bytedance.adsdk.ugeno.Kg.bX.eqN eqn) {
        this.GZ = eqn;
    }

    public void bg(com.bytedance.adsdk.ugeno.Kg.bX.eqN eqn) {
        if (this.gXn == null) {
            this.gXn = new java.util.ArrayList();
        }
        this.gXn.add(eqn);
    }

    public void bg(boolean z, com.bytedance.adsdk.ugeno.Kg.bX.zx zxVar) {
        bg(z, zxVar, 2);
    }

    public void bg(boolean z, com.bytedance.adsdk.ugeno.Kg.bX.zx zxVar, int i) {
        boolean z2 = zxVar != null;
        boolean z3 = z2 != (this.wS != null);
        this.wS = zxVar;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            this.zCS = z ? 2 : 1;
            this.cZH = i;
        } else {
            this.zCS = 0;
        }
        if (z3) {
            bX();
        }
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        if (this.zCS == 2) {
            i2 = (i - 1) - i2;
        }
        return ((com.bytedance.adsdk.ugeno.Kg.bX.C0082bX) this.Ys.get(i2).getLayoutParams()).ldr;
    }

    public int getOffscreenPageLimit() {
        return this.Uw;
    }

    public void setOffscreenPageLimit(int i) {
        if (i <= 0) {
            android.util.Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to 1");
            i = 1;
        }
        if (i != this.Uw) {
            this.Uw = i;
            bX();
        }
    }

    public void setPageMargin(int i) {
        int i2 = this.vb;
        this.vb = i;
        int width = getWidth();
        bg(width, width, i, i2);
        requestLayout();
    }

    public int getPageMargin() {
        return this.vb;
    }

    public void setPageMarginDrawable(android.graphics.drawable.Drawable drawable) {
        this.xxp = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i));
    }

    @Override // android.view.View
    protected boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.xxp;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        android.graphics.drawable.Drawable drawable = this.xxp;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    float bg(float f) {
        return (float) java.lang.Math.sin((f - 0.5f) * 0.47123894f);
    }

    void bg(int i, int i2, int i3) {
        int scrollX;
        int iAbs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        android.widget.Scroller scroller = this.Ta;
        if ((scroller == null || scroller.isFinished()) ? false : true) {
            scrollX = this.yDt ? this.Ta.getCurrX() : this.Ta.getStartX();
            this.Ta.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i4 = scrollX;
        int scrollY = getScrollY();
        int i5 = i - i4;
        int i6 = i2 - scrollY;
        if (i5 == 0 && i6 == 0) {
            bg(false);
            bX();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i7 = clientWidth / 2;
        float f = clientWidth;
        float f2 = i7;
        float fBg = f2 + (bg(java.lang.Math.min(1.0f, (java.lang.Math.abs(i5) * 1.0f) / f)) * f2);
        int iAbs2 = java.lang.Math.abs(i3);
        if (iAbs2 > 0) {
            iAbs = java.lang.Math.round(java.lang.Math.abs(fBg / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((java.lang.Math.abs(i5) / ((f * this.bX.bg(this.eqN)) + this.vb)) + 1.0f) * 100.0f);
        }
        int iMin = java.lang.Math.min(iAbs, 600);
        this.yDt = false;
        this.Ta.startScroll(i4, scrollY, i5, i6, iMin);
        postInvalidateOnAnimation();
    }

    com.bytedance.adsdk.ugeno.Kg.bX.IL bg(int i, int i2) {
        com.bytedance.adsdk.ugeno.Kg.bX.IL il = new com.bytedance.adsdk.ugeno.Kg.bX.IL();
        il.IL = i;
        il.bg = this.bX.bg((android.view.ViewGroup) this, i);
        il.eqN = this.bX.bg(i);
        if (i2 < 0 || i2 >= this.iR.size()) {
            this.iR.add(il);
        } else {
            this.iR.add(i2, il);
        }
        return il;
    }

    void IL() {
        int iBg = this.bX.bg();
        this.bg = iBg;
        boolean z = this.iR.size() < (this.Uw * 2) + 1 && this.iR.size() < iBg;
        int iMax = this.eqN;
        int i = 0;
        while (i < this.iR.size()) {
            com.bytedance.adsdk.ugeno.Kg.bX.IL il = this.iR.get(i);
            int iBg2 = this.bX.bg(il.bg);
            if (iBg2 != -1) {
                if (iBg2 == -2) {
                    this.iR.remove(i);
                    i--;
                    this.bX.bg((android.view.ViewGroup) this, il.IL, il.bg);
                    if (this.eqN == il.IL) {
                        iMax = java.lang.Math.max(0, java.lang.Math.min(this.eqN, iBg - 1));
                    }
                } else if (il.IL != iBg2) {
                    if (il.IL == this.eqN) {
                        iMax = iBg2;
                    }
                    il.IL = iBg2;
                }
                z = true;
            }
            i++;
        }
        java.util.Collections.sort(this.iR, zx);
        if (z) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                com.bytedance.adsdk.ugeno.Kg.bX.C0082bX c0082bX = (com.bytedance.adsdk.ugeno.Kg.bX.C0082bX) getChildAt(i2).getLayoutParams();
                if (!c0082bX.bg) {
                    c0082bX.bX = 0.0f;
                }
            }
            bg(iMax, false, true);
            requestLayout();
        }
    }

    void bX() {
        bg(this.eqN);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00f5 A[PHI: r7 r10 r15
  0x00f5: PHI (r7v6 int) = (r7v5 int), (r7v4 int), (r7v9 int) binds: [B:62:0x00ea, B:59:0x00d4, B:53:0x00be] A[DONT_GENERATE, DONT_INLINE]
  0x00f5: PHI (r10v9 int) = (r10v1 int), (r10v8 int), (r10v12 int) binds: [B:62:0x00ea, B:59:0x00d4, B:53:0x00be] A[DONT_GENERATE, DONT_INLINE]
  0x00f5: PHI (r15v7 float) = (r15v5 float), (r15v6 float), (r15v4 float) binds: [B:62:0x00ea, B:59:0x00d4, B:53:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    void bg(int i) {
        com.bytedance.adsdk.ugeno.Kg.bX.IL IL2;
        java.lang.String hexString;
        com.bytedance.adsdk.ugeno.Kg.bX.IL ilBg;
        com.bytedance.adsdk.ugeno.Kg.bX.IL ilBg2;
        com.bytedance.adsdk.ugeno.Kg.bX.IL il;
        int i2 = this.eqN;
        if (i2 != i) {
            IL2 = IL(i2);
            this.eqN = i;
        } else {
            IL2 = null;
        }
        if (this.bX == null) {
            iR();
            return;
        }
        if (this.Ja) {
            iR();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        int i3 = this.Uw;
        int iMax = java.lang.Math.max(0, this.eqN - i3);
        int iBg = this.bX.bg();
        int iMin = java.lang.Math.min(iBg - 1, this.eqN + i3);
        if (iBg != this.bg) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (android.content.res.Resources.NotFoundException unused) {
                hexString = java.lang.Integer.toHexString(getId());
            }
            throw new java.lang.IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.bg + ", found: " + iBg + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.bX.getClass());
        }
        int i4 = 0;
        while (true) {
            if (i4 < this.iR.size()) {
                ilBg = this.iR.get(i4);
                if (ilBg.IL >= this.eqN) {
                    if (ilBg.IL != this.eqN) {
                        break;
                    } else {
                        break;
                    }
                }
                i4++;
            }
            ilBg = null;
            break;
        }
        if (ilBg == null && iBg > 0) {
            ilBg = bg(this.eqN, i4);
        }
        if (ilBg != null) {
            int i5 = i4 - 1;
            com.bytedance.adsdk.ugeno.Kg.bX.IL il2 = i5 >= 0 ? this.iR.get(i5) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (2.0f - ilBg.eqN) + (getPaddingLeft() / clientWidth);
            float f = 0.0f;
            for (int i6 = this.eqN - 1; i6 >= 0; i6--) {
                if (f >= paddingLeft && i6 < iMax) {
                    if (il2 == null) {
                        break;
                    }
                    if (i6 == il2.IL && !il2.bX) {
                        this.iR.remove(i5);
                        this.bX.bg((android.view.ViewGroup) this, i6, il2.bg);
                        i5--;
                        i4--;
                        if (i5 >= 0) {
                            il = this.iR.get(i5);
                        } else {
                            il = null;
                        }
                        il2 = il;
                    }
                } else {
                    if (il2 != null && i6 == il2.IL) {
                        f += il2.eqN;
                        i5--;
                        if (i5 >= 0) {
                            il = this.iR.get(i5);
                        } else {
                            il = null;
                        }
                    } else {
                        f += bg(i6, i5 + 1).eqN;
                        i4++;
                        if (i5 >= 0) {
                            il = this.iR.get(i5);
                        } else {
                            il = null;
                        }
                    }
                    il2 = il;
                }
            }
            float f2 = ilBg.eqN;
            int i7 = i4 + 1;
            if (f2 < 2.0f) {
                com.bytedance.adsdk.ugeno.Kg.bX.IL il3 = i7 < this.iR.size() ? this.iR.get(i7) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i8 = this.eqN;
                while (true) {
                    i8++;
                    if (i8 >= iBg) {
                        break;
                    }
                    if (f2 >= paddingRight && i8 > iMin) {
                        if (il3 == null) {
                            break;
                        }
                        if (i8 == il3.IL && !il3.bX) {
                            this.iR.remove(i7);
                            this.bX.bg((android.view.ViewGroup) this, i8, il3.bg);
                            if (i7 < this.iR.size()) {
                                il3 = this.iR.get(i7);
                            }
                        }
                    } else if (il3 != null && i8 == il3.IL) {
                        f2 += il3.eqN;
                        i7++;
                        if (i7 < this.iR.size()) {
                            il3 = this.iR.get(i7);
                        }
                    } else {
                        com.bytedance.adsdk.ugeno.Kg.bX.IL ilBg3 = bg(i8, i7);
                        i7++;
                        f2 += ilBg3.eqN;
                        il3 = i7 < this.iR.size() ? this.iR.get(i7) : null;
                    }
                }
            }
            bg(ilBg, i4, IL2);
        }
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            android.view.View childAt = getChildAt(i9);
            com.bytedance.adsdk.ugeno.Kg.bX.C0082bX c0082bX = (com.bytedance.adsdk.ugeno.Kg.bX.C0082bX) childAt.getLayoutParams();
            c0082bX.ldr = i9;
            if (!c0082bX.bg && c0082bX.bX == 0.0f && (ilBg2 = bg(childAt)) != null) {
                c0082bX.bX = ilBg2.eqN;
                c0082bX.zx = ilBg2.IL;
            }
        }
        iR();
        if (hasFocus()) {
            android.view.View viewFindFocus = findFocus();
            com.bytedance.adsdk.ugeno.Kg.bX.IL IL3 = viewFindFocus != null ? IL(viewFindFocus) : null;
            if (IL3 == null || IL3.IL != this.eqN) {
                for (int i10 = 0; i10 < getChildCount(); i10++) {
                    android.view.View childAt2 = getChildAt(i10);
                    com.bytedance.adsdk.ugeno.Kg.bX.IL ilBg4 = bg(childAt2);
                    if (ilBg4 != null && ilBg4.IL == this.eqN && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    private void iR() {
        if (this.zCS != 0) {
            java.util.ArrayList<android.view.View> arrayList = this.Ys;
            if (arrayList == null) {
                this.Ys = new java.util.ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.Ys.add(getChildAt(i));
            }
            java.util.Collections.sort(this.Ys, dS);
        }
    }

    private void bg(com.bytedance.adsdk.ugeno.Kg.bX.IL il, int i, com.bytedance.adsdk.ugeno.Kg.bX.IL il2) {
        com.bytedance.adsdk.ugeno.Kg.bX.IL il3;
        com.bytedance.adsdk.ugeno.Kg.bX.IL il4;
        int iBg = this.bX.bg();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? this.vb / clientWidth : 0.0f;
        if (il2 != null) {
            int i2 = il2.IL;
            if (i2 < il.IL) {
                float fBg = il2.zx + il2.eqN + f;
                int i3 = i2 + 1;
                int i4 = 0;
                while (i3 <= il.IL && i4 < this.iR.size()) {
                    com.bytedance.adsdk.ugeno.Kg.bX.IL il5 = this.iR.get(i4);
                    while (true) {
                        il4 = il5;
                        if (i3 <= il4.IL || i4 >= this.iR.size() - 1) {
                            break;
                        }
                        i4++;
                        il5 = this.iR.get(i4);
                    }
                    while (i3 < il4.IL) {
                        fBg += this.bX.bg(i3) + f;
                        i3++;
                    }
                    il4.zx = fBg;
                    fBg += il4.eqN + f;
                    i3++;
                }
            } else if (i2 > il.IL) {
                int size = this.iR.size() - 1;
                float fBg2 = il2.zx;
                while (true) {
                    i2--;
                    if (i2 < il.IL || size < 0) {
                        break;
                    }
                    com.bytedance.adsdk.ugeno.Kg.bX.IL il6 = this.iR.get(size);
                    while (true) {
                        il3 = il6;
                        if (i2 >= il3.IL || size <= 0) {
                            break;
                        }
                        size--;
                        il6 = this.iR.get(size);
                    }
                    while (i2 > il3.IL) {
                        fBg2 -= this.bX.bg(i2) + f;
                        i2--;
                    }
                    fBg2 -= il3.eqN + f;
                    il3.zx = fBg2;
                }
            }
        }
        int size2 = this.iR.size();
        float fBg3 = il.zx;
        int i5 = il.IL - 1;
        this.Fy = il.IL == 0 ? il.zx : -3.4028235E38f;
        int i6 = iBg - 1;
        this.LZ = il.IL == i6 ? (il.zx + il.eqN) - 1.0f : Float.MAX_VALUE;
        int i7 = i - 1;
        while (i7 >= 0) {
            com.bytedance.adsdk.ugeno.Kg.bX.IL il7 = this.iR.get(i7);
            while (i5 > il7.IL) {
                fBg3 -= this.bX.bg(i5) + f;
                i5--;
            }
            fBg3 -= il7.eqN + f;
            il7.zx = fBg3;
            if (il7.IL == 0) {
                this.Fy = fBg3;
            }
            i7--;
            i5--;
        }
        float fBg4 = il.zx + il.eqN + f;
        int i8 = il.IL + 1;
        int i9 = i + 1;
        while (i9 < size2) {
            com.bytedance.adsdk.ugeno.Kg.bX.IL il8 = this.iR.get(i9);
            while (i8 < il8.IL) {
                fBg4 += this.bX.bg(i8) + f;
                i8++;
            }
            if (il8.IL == i6) {
                this.LZ = (il8.eqN + fBg4) - 1.0f;
            }
            il8.zx = fBg4;
            fBg4 += il8.eqN + f;
            i9++;
            i8++;
        }
        this.ApA = false;
    }

    public static class iR extends com.bytedance.adsdk.ugeno.Kg.bg {
        public static final android.os.Parcelable.Creator<com.bytedance.adsdk.ugeno.Kg.bX.iR> CREATOR = new android.os.Parcelable.ClassLoaderCreator<com.bytedance.adsdk.ugeno.Kg.bX.iR>() { // from class: com.bytedance.adsdk.ugeno.Kg.bX.iR.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
            public com.bytedance.adsdk.ugeno.Kg.bX.iR createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
                return new com.bytedance.adsdk.ugeno.Kg.bX.iR(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
            public com.bytedance.adsdk.ugeno.Kg.bX.iR createFromParcel(android.os.Parcel parcel) {
                return new com.bytedance.adsdk.ugeno.Kg.bX.iR(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
            public com.bytedance.adsdk.ugeno.Kg.bX.iR[] newArray(int i) {
                return new com.bytedance.adsdk.ugeno.Kg.bX.iR[i];
            }
        };
        int IL;
        android.os.Parcelable bX;
        java.lang.ClassLoader eqN;

        public iR(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        @Override // com.bytedance.adsdk.ugeno.Kg.bg, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.IL);
            parcel.writeParcelable(this.bX, i);
        }

        public java.lang.String toString() {
            return "FragmentPager.SavedState{" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " position=" + this.IL + "}";
        }

        iR(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.IL = parcel.readInt();
            this.bX = parcel.readParcelable(classLoader);
            this.eqN = classLoader;
        }
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        com.bytedance.adsdk.ugeno.Kg.bX.iR iRVar = new com.bytedance.adsdk.ugeno.Kg.bX.iR(super.onSaveInstanceState());
        iRVar.IL = this.eqN;
        com.bytedance.adsdk.ugeno.Kg.IL il = this.bX;
        if (il != null) {
            iRVar.bX = il.IL();
        }
        return iRVar;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof com.bytedance.adsdk.ugeno.Kg.bX.iR)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.bytedance.adsdk.ugeno.Kg.bX.iR iRVar = (com.bytedance.adsdk.ugeno.Kg.bX.iR) parcelable;
        super.onRestoreInstanceState(iRVar.bg());
        if (this.bX != null) {
            bg(iRVar.IL, false, true);
            return;
        }
        this.eo = iRVar.IL;
        this.VB = iRVar.bX;
        this.PX = iRVar.eqN;
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        com.bytedance.adsdk.ugeno.Kg.bX.C0082bX c0082bX = (com.bytedance.adsdk.ugeno.Kg.bX.C0082bX) layoutParams;
        c0082bX.bg |= bX(view);
        if (this.kMt) {
            if (c0082bX != null && c0082bX.bg) {
                throw new java.lang.IllegalStateException("Cannot add pager decor view during layout");
            }
            c0082bX.eqN = true;
            addViewInLayout(view, i, layoutParams);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    private static boolean bX(android.view.View view) {
        return view.getClass().getAnnotation(com.bytedance.adsdk.ugeno.Kg.bX.bg.class) != null;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(android.view.View view) {
        if (this.kMt) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    com.bytedance.adsdk.ugeno.Kg.bX.IL bg(android.view.View view) {
        for (int i = 0; i < this.iR.size(); i++) {
            com.bytedance.adsdk.ugeno.Kg.bX.IL il = this.iR.get(i);
            if (this.bX.bg(view, il.bg)) {
                return il;
            }
        }
        return null;
    }

    com.bytedance.adsdk.ugeno.Kg.bX.IL IL(android.view.View view) {
        while (true) {
            java.lang.Object parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof android.view.View)) {
                    return null;
                }
                view = (android.view.View) parent;
            } else {
                return bg(view);
            }
        }
    }

    com.bytedance.adsdk.ugeno.Kg.bX.IL IL(int i) {
        for (int i2 = 0; i2 < this.iR.size(); i2++) {
            com.bytedance.adsdk.ugeno.Kg.bX.IL il = this.iR.get(i2);
            if (il.IL == i) {
                return il;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.sVc = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        com.bytedance.adsdk.ugeno.Kg.bX.C0082bX c0082bX;
        com.bytedance.adsdk.ugeno.Kg.bX.C0082bX c0082bX2;
        int i3;
        int i4;
        int i5;
        boolean z = false;
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.VW = java.lang.Math.min(measuredWidth / 10, this.aGH);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            boolean z2 = true;
            int i7 = 1073741824;
            if (i6 >= childCount) {
                break;
            }
            android.view.View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8 && (c0082bX2 = (com.bytedance.adsdk.ugeno.Kg.bX.C0082bX) childAt.getLayoutParams()) != null && c0082bX2.bg) {
                int i8 = c0082bX2.IL & 7;
                int i9 = c0082bX2.IL & 112;
                boolean z3 = (i9 == 48 || i9 == 80) ? true : z;
                if (i8 != 3 && i8 != 5) {
                    z2 = z;
                }
                int i10 = Integer.MIN_VALUE;
                if (z3) {
                    i3 = Integer.MIN_VALUE;
                    i10 = 1073741824;
                } else {
                    i3 = z2 ? 1073741824 : Integer.MIN_VALUE;
                }
                if (c0082bX2.width != -2) {
                    i4 = c0082bX2.width != -1 ? c0082bX2.width : paddingLeft;
                    i10 = 1073741824;
                } else {
                    i4 = paddingLeft;
                }
                if (c0082bX2.height != -2) {
                    i5 = c0082bX2.height != -1 ? c0082bX2.height : measuredHeight;
                } else {
                    i5 = measuredHeight;
                    i7 = i3;
                }
                childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(i4, i10), android.view.View.MeasureSpec.makeMeasureSpec(i5, i7));
                if (z3) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z2) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i6++;
            z = false;
        }
        this.tC = android.view.View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.rri = android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.kMt = true;
        bX();
        this.kMt = false;
        int childCount2 = getChildCount();
        for (int i11 = 0; i11 < childCount2; i11++) {
            android.view.View childAt2 = getChildAt(i11);
            if (childAt2.getVisibility() != 8 && ((c0082bX = (com.bytedance.adsdk.ugeno.Kg.bX.C0082bX) childAt2.getLayoutParams()) == null || !c0082bX.bg)) {
                childAt2.measure(android.view.View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * c0082bX.bX), 1073741824), this.rri);
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.vb;
            bg(i, i3, i5, i5);
        }
    }

    private void bg(int i, int i2, int i3, int i4) {
        if (i2 > 0 && !this.iR.isEmpty()) {
            if (!this.Ta.isFinished()) {
                this.Ta.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3)), getScrollY());
                return;
            }
        }
        com.bytedance.adsdk.ugeno.Kg.bX.IL IL2 = IL(this.eqN);
        int iMin = (int) ((IL2 != null ? java.lang.Math.min(IL2.zx, this.LZ) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            bg(false);
            scrollTo(iMin, getScrollY());
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0073  */
    /* JADX WARN: Code duplicated, block: B:24:0x0077  */
    /* JADX WARN: Code duplicated, block: B:26:0x007b  */
    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    /* JADX WARN: Code duplicated, block: B:28:0x008a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0090  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        com.bytedance.adsdk.ugeno.Kg.bX.IL ilBg;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            android.view.View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                com.bytedance.adsdk.ugeno.Kg.bX.C0082bX c0082bX = (com.bytedance.adsdk.ugeno.Kg.bX.C0082bX) childAt.getLayoutParams();
                if (c0082bX.bg) {
                    int i9 = c0082bX.IL & 7;
                    int i10 = c0082bX.IL & 112;
                    if (i9 == 1) {
                        iMax = java.lang.Math.max((i5 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    } else {
                        if (i9 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i9 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i5 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i10 != 16) {
                            iMax2 = java.lang.Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        } else {
                            if (i10 != 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i10 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i6 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i11 = paddingLeft + scrollX;
                            childAt.layout(i11, paddingTop, childAt.getMeasuredWidth() + i11, paddingTop + childAt.getMeasuredHeight());
                            i7++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        }
                        int i12 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i12;
                        int i13 = paddingLeft + scrollX;
                        childAt.layout(i13, paddingTop, childAt.getMeasuredWidth() + i13, paddingTop + childAt.getMeasuredHeight());
                        i7++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    }
                    int i14 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i14;
                    if (i10 != 16) {
                        iMax2 = java.lang.Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    } else {
                        if (i10 != 48) {
                            measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                        } else if (i10 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            iMax2 = (i6 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                        }
                        int i15 = paddingLeft + scrollX;
                        childAt.layout(i15, paddingTop, childAt.getMeasuredWidth() + i15, paddingTop + childAt.getMeasuredHeight());
                        i7++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    }
                    int i16 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i16;
                    int i17 = paddingLeft + scrollX;
                    childAt.layout(i17, paddingTop, childAt.getMeasuredWidth() + i17, paddingTop + childAt.getMeasuredHeight());
                    i7++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
        }
        int i18 = (i5 - paddingLeft) - paddingRight;
        for (int i19 = 0; i19 < childCount; i19++) {
            android.view.View childAt2 = getChildAt(i19);
            if (childAt2.getVisibility() != 8) {
                com.bytedance.adsdk.ugeno.Kg.bX.C0082bX c0082bX2 = (com.bytedance.adsdk.ugeno.Kg.bX.C0082bX) childAt2.getLayoutParams();
                if (!c0082bX2.bg && (ilBg = bg(childAt2)) != null) {
                    float f = i18;
                    int i20 = ((int) (ilBg.zx * f)) + paddingLeft;
                    if (c0082bX2.eqN) {
                        c0082bX2.eqN = false;
                        childAt2.measure(android.view.View.MeasureSpec.makeMeasureSpec((int) (f * c0082bX2.bX), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec((i6 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i20, paddingTop, childAt2.getMeasuredWidth() + i20, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.VzQ = paddingTop;
        this.tuV = i6 - paddingBottom;
        this.lM = i7;
        if (this.sVc) {
            z2 = false;
            bg(this.eqN, false, 0, false);
        } else {
            z2 = false;
        }
        this.sVc = z2;
    }

    @Override // android.view.View
    public void computeScroll() {
        this.yDt = true;
        if (!this.Ta.isFinished() && this.Ta.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.Ta.getCurrX();
            int currY = this.Ta.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!eqN(currX)) {
                    this.Ta.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            postInvalidateOnAnimation();
            return;
        }
        bg(true);
    }

    private boolean eqN(int i) {
        if (this.iR.size() == 0) {
            if (this.sVc) {
                return false;
            }
            this.GvG = false;
            bg(0, 0.0f, 0);
            if (this.GvG) {
                return false;
            }
            throw new java.lang.IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        com.bytedance.adsdk.ugeno.Kg.bX.IL ilWR = WR();
        int clientWidth = getClientWidth();
        int i2 = this.vb;
        int i3 = clientWidth + i2;
        float f = clientWidth;
        int i4 = ilWR.IL;
        float f2 = ((i / f) - ilWR.zx) / (ilWR.eqN + (i2 / f));
        this.GvG = false;
        bg(i4, f2, (int) (i3 * f2));
        if (this.GvG) {
            return true;
        }
        throw new java.lang.IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0063  */
    protected void bg(int i, float f, int i2) {
        int iMax;
        int width;
        int left;
        if (this.lM > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                android.view.View childAt = getChildAt(i3);
                com.bytedance.adsdk.ugeno.Kg.bX.C0082bX c0082bX = (com.bytedance.adsdk.ugeno.Kg.bX.C0082bX) childAt.getLayoutParams();
                if (c0082bX.bg) {
                    int i4 = c0082bX.IL & 7;
                    if (i4 == 1) {
                        iMax = java.lang.Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    } else {
                        if (i4 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i4 != 5) {
                            width = paddingLeft;
                        } else {
                            iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = width;
                    }
                    int i5 = iMax;
                    width = paddingLeft;
                    paddingLeft = i5;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = width;
                }
            }
        }
        IL(i, f, i2);
        if (this.wS != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i6 = 0; i6 < childCount2; i6++) {
                android.view.View childAt2 = getChildAt(i6);
                if (!((com.bytedance.adsdk.ugeno.Kg.bX.C0082bX) childAt2.getLayoutParams()).bg) {
                    this.wS.bg(childAt2, (childAt2.getLeft() - scrollX2) / getClientWidth());
                }
            }
        }
        this.GvG = true;
    }

    private void IL(int i, float f, int i2) {
        com.bytedance.adsdk.ugeno.Kg.bX.eqN eqn = this.GZ;
        if (eqn != null) {
            eqn.bg(i, f, i2);
        }
        java.util.List<com.bytedance.adsdk.ugeno.Kg.bX.eqN> list = this.gXn;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                com.bytedance.adsdk.ugeno.Kg.bX.eqN eqn2 = this.gXn.get(i3);
                if (eqn2 != null) {
                    eqn2.bg(i, f, i2);
                }
            }
        }
        com.bytedance.adsdk.ugeno.Kg.bX.eqN eqn3 = this.bCU;
        if (eqn3 != null) {
            eqn3.bg(i, f, i2);
        }
    }

    private void zx(int i) {
        com.bytedance.adsdk.ugeno.Kg.bX.eqN eqn = this.GZ;
        if (eqn != null) {
            eqn.Kg(i);
        }
        java.util.List<com.bytedance.adsdk.ugeno.Kg.bX.eqN> list = this.gXn;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                com.bytedance.adsdk.ugeno.Kg.bX.eqN eqn2 = this.gXn.get(i2);
                if (eqn2 != null) {
                    eqn2.Kg(i);
                }
            }
        }
        com.bytedance.adsdk.ugeno.Kg.bX.eqN eqn3 = this.bCU;
        if (eqn3 != null) {
            eqn3.Kg(i);
        }
    }

    private void ldr(int i) {
        java.util.List<com.bytedance.adsdk.ugeno.Kg.bX.eqN> list = this.gXn;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.gXn.get(i2);
            }
        }
    }

    private void bg(boolean z) {
        boolean z2 = this.Dt == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.Ta.isFinished()) {
                this.Ta.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.Ta.getCurrX();
                int currY = this.Ta.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        eqN(currX);
                    }
                }
            }
        }
        this.Ja = false;
        for (int i = 0; i < this.iR.size(); i++) {
            com.bytedance.adsdk.ugeno.Kg.bX.IL il = this.iR.get(i);
            if (il.bX) {
                il.bX = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                postOnAnimation(this.RiO);
            } else {
                this.RiO.run();
            }
        }
    }

    private boolean bg(float f, float f2) {
        if (f >= this.VW || f2 <= 0.0f) {
            return f > ((float) (getWidth() - this.VW)) && f2 < 0.0f;
        }
        return true;
    }

    private void IL(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setLayerType(z ? this.cZH : 0, null);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        int iFindPointerIndex;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            Kg();
            return false;
        }
        if (action != 0) {
            if (this.DDQ) {
                return true;
            }
            if (this.Uq) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.ZQc = x;
            this.daV = x;
            float y = motionEvent.getY();
            this.LKE = y;
            this.ayS = y;
            this.CQc = motionEvent.getPointerId(0);
            this.Uq = false;
            this.yDt = true;
            this.Ta.computeScrollOffset();
            if (this.Dt == 2 && java.lang.Math.abs(this.Ta.getFinalX() - this.Ta.getCurrX()) > this.jz) {
                this.Ta.abortAnimation();
                this.Ja = false;
                bX();
                this.DDQ = true;
                bX(true);
                setScrollState(1);
            } else {
                bg(false);
                this.DDQ = false;
            }
        } else if (action == 2) {
            int i = this.CQc;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                float x2 = motionEvent.getX(iFindPointerIndex);
                float f = x2 - this.daV;
                float fAbs = java.lang.Math.abs(f);
                float y2 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = java.lang.Math.abs(y2 - this.LKE);
                if (f != 0.0f && !bg(this.daV, f) && bg(this, false, (int) f, (int) x2, (int) y2)) {
                    this.daV = x2;
                    this.ayS = y2;
                    this.Uq = true;
                    return false;
                }
                int i2 = this.VJ;
                if (fAbs > i2 && fAbs * 0.5f > fAbs2) {
                    this.DDQ = true;
                    bX(true);
                    setScrollState(1);
                    float f2 = this.ZQc;
                    float f3 = this.VJ;
                    this.daV = f > 0.0f ? f2 + f3 : f2 - f3;
                    this.ayS = y2;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i2) {
                    this.Uq = true;
                }
                if (this.DDQ && IL(x2)) {
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            bg(motionEvent);
        }
        if (this.uu == null) {
            this.uu = android.view.VelocityTracker.obtain();
        }
        this.uu.addMovement(motionEvent);
        return this.DDQ;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        com.bytedance.adsdk.ugeno.Kg.IL il;
        int iFindPointerIndex;
        if (this.Pae) {
            return true;
        }
        boolean zKg = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (il = this.bX) == null || il.bg() == 0) {
            return false;
        }
        if (this.uu == null) {
            this.uu = android.view.VelocityTracker.obtain();
        }
        this.uu.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.Ta.abortAnimation();
            this.Ja = false;
            bX();
            float x = motionEvent.getX();
            this.ZQc = x;
            this.daV = x;
            float y = motionEvent.getY();
            this.LKE = y;
            this.ayS = y;
            this.CQc = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (actionIndex != -1) {
                            this.daV = motionEvent.getX(actionIndex);
                            this.CQc = motionEvent.getPointerId(actionIndex);
                        }
                    } else if (action == 6) {
                        bg(motionEvent);
                        int iFindPointerIndex2 = motionEvent.findPointerIndex(this.CQc);
                        if (iFindPointerIndex2 != -1) {
                            this.daV = motionEvent.getX(iFindPointerIndex2);
                        }
                    }
                } else if (this.DDQ) {
                    bg(this.eqN, true, 0, false);
                    zKg = Kg();
                }
            } else if (!this.DDQ) {
                int iFindPointerIndex3 = motionEvent.findPointerIndex(this.CQc);
                if (iFindPointerIndex3 == -1) {
                    zKg = Kg();
                } else {
                    float x2 = motionEvent.getX(iFindPointerIndex3);
                    float fAbs = java.lang.Math.abs(x2 - this.daV);
                    float y2 = motionEvent.getY(iFindPointerIndex3);
                    float fAbs2 = java.lang.Math.abs(y2 - this.ayS);
                    if (fAbs > this.VJ && fAbs > fAbs2) {
                        this.DDQ = true;
                        bX(true);
                        float f = this.ZQc;
                        this.daV = x2 - f > 0.0f ? f + this.VJ : f - this.VJ;
                        this.ayS = y2;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        android.view.ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.DDQ) {
                        zKg = false | IL(motionEvent.getX(iFindPointerIndex));
                    }
                }
            } else if (this.DDQ && (iFindPointerIndex = motionEvent.findPointerIndex(this.CQc)) != -1) {
                zKg = false | IL(motionEvent.getX(iFindPointerIndex));
            }
        } else if (this.DDQ) {
            android.view.VelocityTracker velocityTracker = this.uu;
            velocityTracker.computeCurrentVelocity(1000, this.Dxa);
            int xVelocity = (int) velocityTracker.getXVelocity(this.CQc);
            this.Ja = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            com.bytedance.adsdk.ugeno.Kg.bX.IL ilWR = WR();
            float f2 = clientWidth;
            float f3 = this.vb / f2;
            int i = ilWR.IL;
            float f4 = ((scrollX / f2) - ilWR.zx) / (ilWR.eqN + f3);
            int iFindPointerIndex4 = motionEvent.findPointerIndex(this.CQc);
            if (iFindPointerIndex4 != -1) {
                bg(bg(i, f4, xVelocity, (int) (motionEvent.getX(iFindPointerIndex4) - this.ZQc)), true, true, xVelocity);
                zKg = Kg();
            }
        }
        if (zKg) {
            postInvalidateOnAnimation();
        }
        return true;
    }

    private boolean Kg() {
        this.CQc = -1;
        eo();
        this.RJ.onRelease();
        this.txA.onRelease();
        return this.RJ.isFinished() || this.txA.isFinished();
    }

    private void bX(boolean z) {
        android.view.ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private boolean IL(float f) {
        boolean z;
        boolean z2;
        float f2 = this.daV - f;
        this.daV = f;
        float scrollX = getScrollX() + f2;
        float clientWidth = getClientWidth();
        float f3 = this.Fy * clientWidth;
        float f4 = this.LZ * clientWidth;
        boolean z3 = false;
        com.bytedance.adsdk.ugeno.Kg.bX.IL il = this.iR.get(0);
        java.util.ArrayList<com.bytedance.adsdk.ugeno.Kg.bX.IL> arrayList = this.iR;
        com.bytedance.adsdk.ugeno.Kg.bX.IL il2 = arrayList.get(arrayList.size() - 1);
        if (il.IL != 0) {
            f3 = il.zx * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (il2.IL != this.bX.bg() - 1) {
            f4 = il2.zx * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.RJ.onPull(java.lang.Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.txA.onPull(java.lang.Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.daV += scrollX - i;
        scrollTo(i, getScrollY());
        eqN(i);
        return z3;
    }

    private com.bytedance.adsdk.ugeno.Kg.bX.IL WR() {
        int i;
        int clientWidth = getClientWidth();
        float f = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f2 = clientWidth > 0 ? this.vb / clientWidth : 0.0f;
        int i2 = 0;
        boolean z = true;
        com.bytedance.adsdk.ugeno.Kg.bX.IL il = null;
        int i3 = -1;
        float f3 = 0.0f;
        while (i2 < this.iR.size()) {
            com.bytedance.adsdk.ugeno.Kg.bX.IL il2 = this.iR.get(i2);
            if (!z && il2.IL != (i = i3 + 1)) {
                il2 = this.Kg;
                il2.zx = f + f3 + f2;
                il2.IL = i;
                il2.eqN = this.bX.bg(il2.IL);
                i2--;
            }
            com.bytedance.adsdk.ugeno.Kg.bX.IL il3 = il2;
            f = il3.zx;
            float f4 = il3.eqN + f + f2;
            if (!z && scrollX < f) {
                return il;
            }
            if (scrollX < f4 || i2 == this.iR.size() - 1) {
                return il3;
            }
            int i4 = il3.IL;
            float f5 = il3.eqN;
            i2++;
            z = false;
            i3 = i4;
            f3 = f5;
            il = il3;
        }
        return il;
    }

    private int bg(int i, float f, int i2, int i3) {
        if (java.lang.Math.abs(i3) <= this.bN || java.lang.Math.abs(i2) <= this.qC) {
            i += (int) (f + (i >= this.eqN ? 0.4f : 0.6f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.iR.size() <= 0) {
            return i;
        }
        com.bytedance.adsdk.ugeno.Kg.bX.IL il = this.iR.get(0);
        java.util.ArrayList<com.bytedance.adsdk.ugeno.Kg.bX.IL> arrayList = this.iR;
        return java.lang.Math.max(il.IL, java.lang.Math.min(i, arrayList.get(arrayList.size() - 1).IL));
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        com.bytedance.adsdk.ugeno.Kg.IL il;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (il = this.bX) != null && il.bg() > 1)) {
            if (!this.RJ.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.Fy * width);
                this.RJ.setSize(height, width);
                zDraw = false | this.RJ.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.txA.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.LZ + 1.0f)) * width2);
                this.txA.setSize(height2, width2);
                zDraw |= this.txA.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.RJ.finish();
            this.txA.finish();
        }
        if (zDraw) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        float f;
        float f2;
        super.onDraw(canvas);
        if (this.vb <= 0 || this.xxp == null || this.iR.size() <= 0 || this.bX == null) {
            return;
        }
        int scrollX = getScrollX();
        int width = getWidth();
        float f3 = width;
        float f4 = this.vb / f3;
        int i = 0;
        com.bytedance.adsdk.ugeno.Kg.bX.IL il = this.iR.get(0);
        float f5 = il.zx;
        int size = this.iR.size();
        int i2 = il.IL;
        int i3 = this.iR.get(size - 1).IL;
        while (i2 < i3) {
            while (i2 > il.IL && i < size) {
                i++;
                il = this.iR.get(i);
            }
            if (i2 == il.IL) {
                f2 = (il.zx + il.eqN) * f3;
                f = il.zx + il.eqN + f4;
            } else {
                float fBg = this.bX.bg(i2);
                float f6 = (f5 + fBg) * f3;
                f = f5 + fBg + f4;
                f2 = f6;
            }
            if (this.vb + f2 > scrollX) {
                this.xxp.setBounds(java.lang.Math.round(f2), this.VzQ, java.lang.Math.round(this.vb + f2), this.tuV);
                this.xxp.draw(canvas);
            }
            if (f2 > scrollX + width) {
                return;
            }
            i2++;
            f5 = f;
            f4 = f4;
        }
    }

    private void bg(android.view.MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.CQc) {
            int i = actionIndex == 0 ? 1 : 0;
            this.daV = motionEvent.getX(i);
            this.CQc = motionEvent.getPointerId(i);
            android.view.VelocityTracker velocityTracker = this.uu;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void eo() {
        this.DDQ = false;
        this.Uq = false;
        android.view.VelocityTracker velocityTracker = this.uu;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.uu = null;
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.JAA != z) {
            this.JAA = z;
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.bX == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            return scrollX > ((int) (((float) clientWidth) * this.Fy));
        }
        return i > 0 && scrollX < ((int) (((float) clientWidth) * this.LZ));
    }

    protected boolean bg(android.view.View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                android.view.View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && bg(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || bg(keyEvent);
    }

    public boolean bg(android.view.KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                if (keyEvent.hasModifiers(2)) {
                    return eqN();
                }
                return bX(17);
            }
            if (keyCode == 22) {
                if (keyEvent.hasModifiers(2)) {
                    return zx();
                }
                return bX(66);
            }
            if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return bX(2);
                }
                if (keyEvent.hasModifiers(1)) {
                    return bX(1);
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00bd  */
    public boolean bX(int i) {
        boolean z;
        android.view.View viewFindFocus = findFocus();
        boolean zEqN = false;
        if (viewFindFocus == this) {
            viewFindFocus = null;
        } else if (viewFindFocus != null) {
            android.view.ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof android.view.ViewGroup)) {
                    z = false;
                    break;
                }
                if (parent == this) {
                    z = true;
                    break;
                }
                parent = parent.getParent();
            }
            if (!z) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(viewFindFocus.getClass().getSimpleName());
                for (android.view.ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof android.view.ViewGroup; parent2 = parent2.getParent()) {
                    sb.append(" => ").append(parent2.getClass().getSimpleName());
                }
                android.util.Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
                viewFindFocus = null;
            }
        }
        android.view.View viewFindNextFocus = android.view.FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        if (viewFindNextFocus == null || viewFindNextFocus == viewFindFocus) {
            if (i == 17 || i == 1) {
                zEqN = eqN();
            } else if (i == 66 || i == 2) {
                zEqN = zx();
            }
        } else if (i == 17) {
            int i2 = bg(this.WR, viewFindNextFocus).left;
            int i3 = bg(this.WR, viewFindFocus).left;
            if (viewFindFocus != null && i2 >= i3) {
                zEqN = eqN();
            } else {
                zEqN = viewFindNextFocus.requestFocus();
            }
        } else if (i == 66) {
            int i4 = bg(this.WR, viewFindNextFocus).left;
            int i5 = bg(this.WR, viewFindFocus).left;
            if (viewFindFocus == null || i4 > i5) {
                zEqN = viewFindNextFocus.requestFocus();
            } else {
                zEqN = zx();
            }
        }
        if (zEqN) {
            playSoundEffect(android.view.SoundEffectConstants.getContantForFocusDirection(i));
        }
        return zEqN;
    }

    private android.graphics.Rect bg(android.graphics.Rect rect, android.view.View view) {
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
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    boolean eqN() {
        int i = this.eqN;
        if (i <= 0) {
            return false;
        }
        bg(i - 1, true);
        return true;
    }

    boolean zx() {
        com.bytedance.adsdk.ugeno.Kg.IL il = this.bX;
        if (il == null || this.eqN >= il.bg() - 1) {
            return false;
        }
        bg(this.eqN + 1, true);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(java.util.ArrayList<android.view.View> arrayList, int i, int i2) {
        com.bytedance.adsdk.ugeno.Kg.bX.IL ilBg;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                android.view.View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (ilBg = bg(childAt)) != null && ilBg.IL == this.eqN) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if (((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) || arrayList == null) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(java.util.ArrayList<android.view.View> arrayList) {
        com.bytedance.adsdk.ugeno.Kg.bX.IL ilBg;
        for (int i = 0; i < getChildCount(); i++) {
            android.view.View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (ilBg = bg(childAt)) != null && ilBg.IL == this.eqN) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, android.graphics.Rect rect) {
        int i2;
        int i3;
        int i4;
        com.bytedance.adsdk.ugeno.Kg.bX.IL ilBg;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = childCount;
            i2 = 0;
            i4 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i3) {
            android.view.View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (ilBg = bg(childAt)) != null && ilBg.IL == this.eqN && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        com.bytedance.adsdk.ugeno.Kg.bX.IL ilBg;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (ilBg = bg(childAt)) != null && ilBg.IL == this.eqN && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new com.bytedance.adsdk.ugeno.Kg.bX.C0082bX();
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof com.bytedance.adsdk.ugeno.Kg.bX.C0082bX) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new com.bytedance.adsdk.ugeno.Kg.bX.C0082bX(getContext(), attributeSet);
    }

    private class ldr extends android.database.DataSetObserver {
        ldr() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            com.bytedance.adsdk.ugeno.Kg.bX.this.IL();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            com.bytedance.adsdk.ugeno.Kg.bX.this.IL();
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.Kg.bX$bX, reason: collision with other inner class name */
    public static class C0082bX extends android.view.ViewGroup.LayoutParams {
        public int IL;
        float bX;
        public boolean bg;
        boolean eqN;
        int ldr;
        int zx;

        public C0082bX() {
            super(-1, -1);
            this.bX = 0.0f;
        }

        public C0082bX(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.bX = 0.0f;
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.bytedance.adsdk.ugeno.Kg.bX.IL);
            this.IL = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static class Kg implements java.util.Comparator<android.view.View> {
        Kg() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
        public int compare(android.view.View view, android.view.View view2) {
            com.bytedance.adsdk.ugeno.Kg.bX.C0082bX c0082bX = (com.bytedance.adsdk.ugeno.Kg.bX.C0082bX) view.getLayoutParams();
            com.bytedance.adsdk.ugeno.Kg.bX.C0082bX c0082bX2 = (com.bytedance.adsdk.ugeno.Kg.bX.C0082bX) view2.getLayoutParams();
            if (c0082bX.bg != c0082bX2.bg) {
                return c0082bX.bg ? 1 : -1;
            }
            return c0082bX.zx - c0082bX2.zx;
        }
    }
}
