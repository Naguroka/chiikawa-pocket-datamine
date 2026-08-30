package com.bytedance.adsdk.ugeno.ldr;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bg<T> extends android.widget.FrameLayout implements com.bytedance.adsdk.ugeno.Kg.bX.eqN {
    private final java.lang.Runnable Fy;
    protected com.bytedance.adsdk.ugeno.Kg.bX IL;
    private java.lang.String Kg;
    private final java.lang.Runnable LZ;
    private int Lq;
    private boolean PX;
    private boolean Ta;
    private boolean VB;
    private com.bytedance.adsdk.ugeno.ldr.bg.C0093bg VzQ;
    private float WR;
    private int bX;
    protected java.util.List<T> bg;
    private boolean eo;
    private int eqN;
    private int iR;
    private int ldr;
    private com.bytedance.adsdk.ugeno.ldr.bX tuV;
    private int vb;
    private com.bytedance.adsdk.ugeno.ldr.bg.bg xxp;
    private int yDt;
    private int zx;

    public abstract android.view.View iR(int i);

    public bg(android.content.Context context) {
        super(context);
        this.bg = new java.util.concurrent.CopyOnWriteArrayList();
        this.bX = 2000;
        this.eqN = 500;
        this.zx = 10;
        this.ldr = -1;
        this.iR = -1;
        this.Kg = com.adjust.sdk.Constants.NORMAL;
        this.WR = 1.0f;
        this.eo = true;
        this.VB = true;
        this.PX = true;
        this.Ta = true;
        this.yDt = 0;
        this.Lq = 0;
        this.vb = 0;
        this.Fy = new java.lang.Runnable() { // from class: com.bytedance.adsdk.ugeno.ldr.bg.1
            @Override // java.lang.Runnable
            public void run() {
                int currentItem = com.bytedance.adsdk.ugeno.ldr.bg.this.IL.getCurrentItem() + 1;
                if (com.bytedance.adsdk.ugeno.ldr.bg.this.PX) {
                    if (currentItem >= Integer.MAX_VALUE) {
                        com.bytedance.adsdk.ugeno.ldr.bg.this.IL.bg(kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK, false);
                        return;
                    } else {
                        com.bytedance.adsdk.ugeno.ldr.bg.this.IL.bg(currentItem, true);
                        return;
                    }
                }
                if (currentItem >= com.bytedance.adsdk.ugeno.ldr.bg.this.IL.getAdapter().bg()) {
                    com.bytedance.adsdk.ugeno.ldr.bg.this.IL.bg(0, false);
                } else {
                    com.bytedance.adsdk.ugeno.ldr.bg.this.IL.bg(currentItem, true);
                }
            }
        };
        this.LZ = new java.lang.Runnable() { // from class: com.bytedance.adsdk.ugeno.ldr.bg.2
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.adsdk.ugeno.ldr.bg.this.VB) {
                    int currentItem = com.bytedance.adsdk.ugeno.ldr.bg.this.IL.getCurrentItem() + 1;
                    if (com.bytedance.adsdk.ugeno.ldr.bg.this.PX) {
                        if (currentItem >= Integer.MAX_VALUE) {
                            com.bytedance.adsdk.ugeno.ldr.bg.this.IL.bg(kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK, false);
                        } else {
                            com.bytedance.adsdk.ugeno.ldr.bg.this.IL.bg(currentItem, true);
                        }
                        com.bytedance.adsdk.ugeno.ldr.bg bgVar = com.bytedance.adsdk.ugeno.ldr.bg.this;
                        bgVar.postDelayed(bgVar.LZ, com.bytedance.adsdk.ugeno.ldr.bg.this.bX);
                        return;
                    }
                    if (currentItem >= com.bytedance.adsdk.ugeno.ldr.bg.this.IL.getAdapter().bg()) {
                        com.bytedance.adsdk.ugeno.ldr.bg.this.IL.bg(0, false);
                        com.bytedance.adsdk.ugeno.ldr.bg bgVar2 = com.bytedance.adsdk.ugeno.ldr.bg.this;
                        bgVar2.postDelayed(bgVar2.LZ, com.bytedance.adsdk.ugeno.ldr.bg.this.bX);
                    } else {
                        com.bytedance.adsdk.ugeno.ldr.bg.this.IL.bg(currentItem, true);
                        com.bytedance.adsdk.ugeno.ldr.bg bgVar3 = com.bytedance.adsdk.ugeno.ldr.bg.this;
                        bgVar3.postDelayed(bgVar3.LZ, com.bytedance.adsdk.ugeno.ldr.bg.this.bX);
                    }
                }
            }
        };
        this.IL = new com.bytedance.adsdk.ugeno.ldr.bg.IL(context);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(this.IL, layoutParams);
        com.bytedance.adsdk.ugeno.ldr.bg.bg bgVar = new com.bytedance.adsdk.ugeno.ldr.bg.bg(context);
        this.xxp = bgVar;
        addView(bgVar);
    }

    public com.bytedance.adsdk.ugeno.ldr.bg bg(boolean z) {
        this.VB = z;
        IL();
        return this;
    }

    public com.bytedance.adsdk.ugeno.ldr.bg bg(int i) {
        this.bX = i;
        IL();
        return this;
    }

    public com.bytedance.adsdk.ugeno.ldr.bg IL(boolean z) {
        this.eo = z;
        return this;
    }

    public com.bytedance.adsdk.ugeno.ldr.bg IL(int i) {
        this.xxp.setSelectedColor(i);
        return this;
    }

    public com.bytedance.adsdk.ugeno.ldr.bg bX(int i) {
        this.xxp.setUnSelectedColor(i);
        return this;
    }

    public com.bytedance.adsdk.ugeno.ldr.bg bX(boolean z) {
        this.xxp.setLoop(z);
        if (this.PX != z) {
            int iBg = com.bytedance.adsdk.ugeno.ldr.eqN.bg(z, this.IL.getCurrentItem(), this.bg.size());
            this.PX = z;
            com.bytedance.adsdk.ugeno.ldr.bg.C0093bg c0093bg = this.VzQ;
            if (c0093bg != null) {
                c0093bg.bX();
                this.IL.setCurrentItem(iBg);
            }
        }
        return this;
    }

    public com.bytedance.adsdk.ugeno.ldr.bg bg(float f) {
        this.WR = f;
        return this;
    }

    public com.bytedance.adsdk.ugeno.ldr.bg bg(java.lang.String str) {
        this.Kg = str;
        bg(str, this.zx, this.ldr, this.iR, true);
        return this;
    }

    public com.bytedance.adsdk.ugeno.ldr.bg eqN(int i) {
        this.zx = i;
        bg(this.Kg, i, this.ldr, this.iR, true);
        return this;
    }

    public com.bytedance.adsdk.ugeno.ldr.bg zx(int i) {
        this.ldr = i;
        bg(this.Kg, this.zx, i, this.iR, true);
        return this;
    }

    public com.bytedance.adsdk.ugeno.ldr.bg ldr(int i) {
        this.iR = i;
        bg(this.Kg, this.zx, this.ldr, i, true);
        return this;
    }

    public void bg(java.lang.String str, int i, int i2, int i3, boolean z) {
        com.bytedance.adsdk.ugeno.ldr.bg.C0093bg c0093bg = this.VzQ;
        if (c0093bg != null) {
            c0093bg.bX();
        }
        setClipChildren(false);
        this.IL.setClipChildren(false);
        this.IL.setPageMargin(i);
        android.view.ViewGroup.LayoutParams layoutParams = this.IL.getLayoutParams();
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = i2 + i;
            marginLayoutParams.rightMargin = i3 + i;
            this.IL.setLayoutParams(layoutParams);
        }
        if (android.text.TextUtils.equals(str, "linear")) {
            this.IL.bg(false, (com.bytedance.adsdk.ugeno.Kg.bX.zx) new com.bytedance.adsdk.ugeno.ldr.IL.bg());
        } else {
            this.IL.bg(false, (com.bytedance.adsdk.ugeno.Kg.bX.zx) null);
        }
        this.IL.setOffscreenPageLimit((int) this.WR);
    }

    public void bg() {
        int i;
        bg(this.Kg, this.zx, this.ldr, this.iR, true);
        if (this.VzQ == null) {
            this.VzQ = new com.bytedance.adsdk.ugeno.ldr.bg.C0093bg();
            this.IL.bg((com.bytedance.adsdk.ugeno.Kg.bX.eqN) this);
            this.IL.setAdapter(this.VzQ);
        }
        int i2 = this.yDt;
        if (i2 < 0 || i2 >= this.bg.size()) {
            this.yDt = 0;
        }
        if (this.PX) {
            i = this.yDt + kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
        } else {
            i = this.yDt;
        }
        this.IL.bg(i, true);
        if (!this.PX) {
            Kg(i);
        }
        if (this.VB) {
            IL();
        }
    }

    public android.view.View bg(int i, int i2) {
        if (this.bg.size() == 0) {
            return new android.view.View(getContext());
        }
        android.view.View viewIR = iR(i2);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        if (viewIR instanceof android.view.ViewGroup) {
            frameLayout.setClipChildren(true);
        }
        if (viewIR.getParent() instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) viewIR.getParent()).removeView(viewIR);
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout.addView(viewIR, layoutParams);
        frameLayout.addView(new android.view.View(getContext()), new android.widget.FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    public com.bytedance.adsdk.ugeno.ldr.bg<T> bg(T t) {
        if (t != null) {
            this.bg.add(t);
            if (this.eo) {
                this.xxp.IL();
            }
        }
        com.bytedance.adsdk.ugeno.ldr.bg.C0093bg c0093bg = this.VzQ;
        if (c0093bg != null) {
            c0093bg.bX();
            this.xxp.bg(this.yDt, this.IL.getCurrentItem());
        }
        return this;
    }

    @Override // com.bytedance.adsdk.ugeno.Kg.bX.eqN
    public void bg(int i, float f, int i2) {
        if (this.tuV != null) {
            com.bytedance.adsdk.ugeno.ldr.eqN.bg(this.PX, i, this.bg.size());
        }
    }

    @Override // com.bytedance.adsdk.ugeno.Kg.bX.eqN
    public void Kg(int i) {
        if (this.tuV != null) {
            int iBg = com.bytedance.adsdk.ugeno.ldr.eqN.bg(this.PX, i, this.bg.size());
            this.tuV.bg(this.PX, iBg, i, iBg == 0, iBg == this.bg.size() - 1);
        }
        if (this.eo) {
            this.xxp.bg(i);
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ldr.bg$bg, reason: collision with other inner class name */
    class C0093bg extends com.bytedance.adsdk.ugeno.Kg.IL {
        @Override // com.bytedance.adsdk.ugeno.Kg.IL
        public int bg(java.lang.Object obj) {
            return -2;
        }

        @Override // com.bytedance.adsdk.ugeno.Kg.IL
        public boolean bg(android.view.View view, java.lang.Object obj) {
            return view == obj;
        }

        C0093bg() {
        }

        @Override // com.bytedance.adsdk.ugeno.Kg.IL
        public int bg() {
            if (com.bytedance.adsdk.ugeno.ldr.bg.this.PX) {
                return Integer.MAX_VALUE;
            }
            return com.bytedance.adsdk.ugeno.ldr.bg.this.bg.size();
        }

        @Override // com.bytedance.adsdk.ugeno.Kg.IL
        public java.lang.Object bg(android.view.ViewGroup viewGroup, int i) {
            android.view.View viewBg = com.bytedance.adsdk.ugeno.ldr.bg.this.bg(i, com.bytedance.adsdk.ugeno.ldr.eqN.bg(com.bytedance.adsdk.ugeno.ldr.bg.this.PX, i, com.bytedance.adsdk.ugeno.ldr.bg.this.bg.size()));
            viewGroup.addView(viewBg);
            return viewBg;
        }

        @Override // com.bytedance.adsdk.ugeno.Kg.IL
        public void bg(android.view.ViewGroup viewGroup, int i, java.lang.Object obj) {
            viewGroup.removeView((android.view.View) obj);
        }

        @Override // com.bytedance.adsdk.ugeno.Kg.IL
        public float bg(int i) {
            if (com.bytedance.adsdk.ugeno.ldr.bg.this.WR <= 0.0f) {
                return 1.0f;
            }
            return 1.0f / com.bytedance.adsdk.ugeno.ldr.bg.this.WR;
        }
    }

    public void IL() {
        removeCallbacks(this.LZ);
        postDelayed(this.LZ, this.bX);
    }

    public void bX() {
        removeCallbacks(this.LZ);
    }

    public void WR(int i) {
        bg(this.Kg, this.zx, this.ldr, this.iR, true);
        if (this.VzQ == null) {
            this.VzQ = new com.bytedance.adsdk.ugeno.ldr.bg.C0093bg();
            this.IL.bg((com.bytedance.adsdk.ugeno.Kg.bX.eqN) this);
            this.IL.setAdapter(this.VzQ);
        }
        if (this.PX) {
            if (i >= Integer.MAX_VALUE) {
                this.IL.bg(kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK, false);
                return;
            } else {
                this.IL.bg(i, true);
                return;
            }
        }
        if (i < 0 || i >= this.bg.size()) {
            return;
        }
        this.IL.bg(i, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.VB) {
            int action = motionEvent.getAction();
            if (action == 1 || action == 3 || action == 4) {
                IL();
            } else if (action == 0) {
                bX();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getCurrentItem() {
        return this.IL.getCurrentItem();
    }

    public com.bytedance.adsdk.ugeno.Kg.IL getAdapter() {
        return this.IL.getAdapter();
    }

    public com.bytedance.adsdk.ugeno.Kg.bX getViewPager() {
        return this.IL;
    }

    public void setOnPageChangeListener(com.bytedance.adsdk.ugeno.ldr.bX bXVar) {
        this.tuV = bXVar;
    }

    class IL extends com.bytedance.adsdk.ugeno.Kg.bX {
        public IL(android.content.Context context) {
            super(context);
        }

        @Override // com.bytedance.adsdk.ugeno.Kg.bX, android.view.ViewGroup
        public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
            if (!com.bytedance.adsdk.ugeno.ldr.bg.this.Ta) {
                return false;
            }
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (java.lang.IllegalArgumentException unused) {
                return false;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.Kg.bX, android.view.View
        public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
            if (!com.bytedance.adsdk.ugeno.ldr.bg.this.Ta) {
                return false;
            }
            try {
                return super.onTouchEvent(motionEvent);
            } catch (java.lang.IllegalArgumentException unused) {
                return false;
            }
        }
    }
}
