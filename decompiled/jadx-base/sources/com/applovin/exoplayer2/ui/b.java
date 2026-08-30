package com.applovin.exoplayer2.ui;

/* JADX INFO: loaded from: classes3.dex */
public class b extends android.view.View implements com.applovin.exoplayer2.ui.i {
    private final float A;
    private int B;
    private long C;
    private int D;
    private android.graphics.Rect E;
    private android.animation.ValueAnimator F;
    private float G;
    private boolean H;
    private boolean I;
    private long J;
    private long K;
    private long L;
    private long M;
    private int N;
    private long[] O;
    private boolean[] P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.graphics.Rect f560a;
    private final android.graphics.Rect b;
    private final android.graphics.Rect c;
    private final android.graphics.Rect d;
    private final android.graphics.Paint f;
    private final android.graphics.Paint g;
    private final android.graphics.Paint h;
    private final android.graphics.Paint i;
    private final android.graphics.Paint j;
    private final android.graphics.Paint k;
    private final android.graphics.drawable.Drawable l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;
    private final int s;
    private final int t;
    private final int u;
    private final java.lang.StringBuilder v;
    private final java.util.Formatter w;
    private final java.lang.Runnable x;
    private final java.util.concurrent.CopyOnWriteArraySet y;
    private final android.graphics.Point z;

    public b(android.content.Context context, android.util.AttributeSet attributeSet, int i, android.util.AttributeSet attributeSet2) {
        this(context, attributeSet, i, attributeSet2, 0);
    }

    private static int a(float f, int i) {
        return (int) ((i * f) + 0.5f);
    }

    private static int b(float f, int i) {
        return (int) (i / f);
    }

    private void c(long j) {
        if (this.J == j) {
            return;
        }
        this.J = j;
        java.util.Iterator it = this.y.iterator();
        while (it.hasNext()) {
            ((com.applovin.exoplayer2.ui.i.a) it.next()).b(this, j);
        }
    }

    private long getPositionIncrement() {
        long j = this.C;
        if (j != androidx.media3.common.C.TIME_UNSET) {
            return j;
        }
        long j2 = this.K;
        if (j2 == androidx.media3.common.C.TIME_UNSET) {
            return 0L;
        }
        return j2 / ((long) this.B);
    }

    private java.lang.String getProgressText() {
        return com.applovin.impl.xp.a(this.v, this.w, this.L);
    }

    private long getScrubberPosition() {
        if (this.b.width() <= 0 || this.K == androidx.media3.common.C.TIME_UNSET) {
            return 0L;
        }
        return (((long) this.d.width()) * this.K) / ((long) this.b.width());
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        c();
    }

    @Override // com.applovin.exoplayer2.ui.i
    public long getPreferredUpdateDelay() {
        int iB = b(this.A, this.b.width());
        if (iB != 0) {
            long j = this.K;
            if (j != 0 && j != androidx.media3.common.C.TIME_UNSET) {
                return j / ((long) iB);
            }
        }
        return Long.MAX_VALUE;
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        android.graphics.drawable.Drawable drawable = this.l;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        canvas.save();
        b(canvas);
        a(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z, int i, android.graphics.Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!this.I || z) {
            return;
        }
        a(false);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.K <= 0) {
            return;
        }
        if (com.applovin.impl.xp.f1515a >= 21) {
            accessibilityNodeInfo.addAction(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        } else {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:15:0x002b  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
        if (isEnabled()) {
            long positionIncrement = getPositionIncrement();
            if (i != 66) {
                switch (i) {
                    case 21:
                        positionIncrement = -positionIncrement;
                        if (a(positionIncrement)) {
                            removeCallbacks(this.x);
                            postDelayed(this.x, 1000L);
                            return true;
                        }
                        break;
                    case 22:
                        if (a(positionIncrement)) {
                            removeCallbacks(this.x);
                            postDelayed(this.x, 1000L);
                            return true;
                        }
                        break;
                    case 23:
                        if (this.I) {
                            a(false);
                            return true;
                        }
                        break;
                }
            } else if (this.I) {
                a(false);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingBottom;
        int iMax;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i5 - getPaddingRight();
        int i7 = this.H ? 0 : this.t;
        if (this.o == 1) {
            paddingBottom = (i6 - getPaddingBottom()) - this.n;
            int paddingBottom2 = i6 - getPaddingBottom();
            int i8 = this.m;
            iMax = (paddingBottom2 - i8) - java.lang.Math.max(i7 - (i8 / 2), 0);
        } else {
            paddingBottom = (i6 - this.n) / 2;
            iMax = (i6 - this.m) / 2;
        }
        this.f560a.set(paddingLeft, paddingBottom, paddingRight, this.n + paddingBottom);
        android.graphics.Rect rect = this.b;
        android.graphics.Rect rect2 = this.f560a;
        rect.set(rect2.left + i7, iMax, rect2.right - i7, this.m + iMax);
        if (com.applovin.impl.xp.f1515a >= 29) {
            a(i5, i6);
        }
        b();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = android.view.View.MeasureSpec.getMode(i2);
        int size = android.view.View.MeasureSpec.getSize(i2);
        if (mode == 0) {
            size = this.n;
        } else if (mode != 1073741824) {
            size = java.lang.Math.min(this.n, size);
        }
        setMeasuredDimension(android.view.View.MeasureSpec.getSize(i), size);
        c();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        android.graphics.drawable.Drawable drawable = this.l;
        if (drawable == null || !a(drawable, i)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (isEnabled() && this.K > 0) {
            android.graphics.Point pointA = a(motionEvent);
            int i = pointA.x;
            int i2 = pointA.y;
            int action = motionEvent.getAction();
            if (action == 0) {
                float f = i;
                if (a(f, i2)) {
                    a(f);
                    b(getScrubberPosition());
                    b();
                    invalidate();
                    return true;
                }
            } else if (action == 1) {
                if (this.I) {
                    a(motionEvent.getAction() == 3);
                    return true;
                }
            } else if (action != 2) {
                if (action == 3) {
                    if (this.I) {
                        a(motionEvent.getAction() == 3);
                        return true;
                    }
                }
            } else if (this.I) {
                if (i2 < this.u) {
                    int i3 = this.D;
                    a(i3 + ((i - i3) / 3));
                } else {
                    this.D = i;
                    a(i);
                }
                c(getScrubberPosition());
                b();
                invalidate();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i, android.os.Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.K <= 0) {
            return false;
        }
        if (i == 8192) {
            if (a(-getPositionIncrement())) {
                a(false);
            }
        } else {
            if (i != 4096) {
                return false;
            }
            if (a(getPositionIncrement())) {
                a(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i) {
        this.i.setColor(i);
        invalidate(this.f560a);
    }

    public void setBufferedColor(int i) {
        this.g.setColor(i);
        invalidate(this.f560a);
    }

    @Override // com.applovin.exoplayer2.ui.i
    public void setBufferedPosition(long j) {
        if (this.M == j) {
            return;
        }
        this.M = j;
        b();
    }

    @Override // com.applovin.exoplayer2.ui.i
    public void setDuration(long j) {
        if (this.K == j) {
            return;
        }
        this.K = j;
        if (this.I && j == androidx.media3.common.C.TIME_UNSET) {
            a(true);
        }
        b();
    }

    @Override // android.view.View, com.applovin.exoplayer2.ui.i
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.I || z) {
            return;
        }
        a(true);
    }

    public void setKeyCountIncrement(int i) {
        com.applovin.impl.b1.a(i > 0);
        this.B = i;
        this.C = androidx.media3.common.C.TIME_UNSET;
    }

    public void setKeyTimeIncrement(long j) {
        com.applovin.impl.b1.a(j > 0);
        this.B = -1;
        this.C = j;
    }

    public void setPlayedAdMarkerColor(int i) {
        this.j.setColor(i);
        invalidate(this.f560a);
    }

    public void setPlayedColor(int i) {
        this.f.setColor(i);
        invalidate(this.f560a);
    }

    @Override // com.applovin.exoplayer2.ui.i
    public void setPosition(long j) {
        if (this.L == j) {
            return;
        }
        this.L = j;
        setContentDescription(getProgressText());
        b();
    }

    public void setScrubberColor(int i) {
        this.k.setColor(i);
        invalidate(this.f560a);
    }

    public void setUnplayedColor(int i) {
        this.h.setColor(i);
        invalidate(this.f560a);
    }

    public b(android.content.Context context, android.util.AttributeSet attributeSet, int i, android.util.AttributeSet attributeSet2, int i2) {
        super(context, attributeSet, i);
        this.f560a = new android.graphics.Rect();
        this.b = new android.graphics.Rect();
        this.c = new android.graphics.Rect();
        this.d = new android.graphics.Rect();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.g = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.h = paint3;
        android.graphics.Paint paint4 = new android.graphics.Paint();
        this.i = paint4;
        android.graphics.Paint paint5 = new android.graphics.Paint();
        this.j = paint5;
        android.graphics.Paint paint6 = new android.graphics.Paint();
        this.k = paint6;
        paint6.setAntiAlias(true);
        this.y = new java.util.concurrent.CopyOnWriteArraySet();
        this.z = new android.graphics.Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.A = f;
        this.u = a(f, -50);
        int iA = a(f, 4);
        int iA2 = a(f, 26);
        int iA3 = a(f, 4);
        int iA4 = a(f, 12);
        int iA5 = a(f, 0);
        int iA6 = a(f, 16);
        if (attributeSet2 != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, com.applovin.sdk.R.styleable.AppLovinDefaultTimeBar, i, i2);
            try {
                android.graphics.drawable.Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(com.applovin.sdk.R.styleable.AppLovinDefaultTimeBar_al_scrubber_drawable);
                this.l = drawable;
                if (drawable != null) {
                    a(drawable);
                    iA2 = java.lang.Math.max(drawable.getMinimumHeight(), iA2);
                }
                this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.applovin.sdk.R.styleable.AppLovinDefaultTimeBar_al_bar_height, iA);
                this.n = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.applovin.sdk.R.styleable.AppLovinDefaultTimeBar_al_touch_target_height, iA2);
                this.o = typedArrayObtainStyledAttributes.getInt(com.applovin.sdk.R.styleable.AppLovinDefaultTimeBar_al_bar_gravity, 0);
                this.p = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.applovin.sdk.R.styleable.AppLovinDefaultTimeBar_al_ad_marker_width, iA3);
                this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.applovin.sdk.R.styleable.AppLovinDefaultTimeBar_al_scrubber_enabled_size, iA4);
                this.r = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.applovin.sdk.R.styleable.AppLovinDefaultTimeBar_al_scrubber_disabled_size, iA5);
                this.s = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.applovin.sdk.R.styleable.AppLovinDefaultTimeBar_al_scrubber_dragged_size, iA6);
                int i3 = typedArrayObtainStyledAttributes.getInt(com.applovin.sdk.R.styleable.AppLovinDefaultTimeBar_al_played_color, -1);
                int i4 = typedArrayObtainStyledAttributes.getInt(com.applovin.sdk.R.styleable.AppLovinDefaultTimeBar_al_scrubber_color, -1);
                int i5 = typedArrayObtainStyledAttributes.getInt(com.applovin.sdk.R.styleable.AppLovinDefaultTimeBar_al_buffered_color, androidx.media3.ui.DefaultTimeBar.DEFAULT_BUFFERED_COLOR);
                int i6 = typedArrayObtainStyledAttributes.getInt(com.applovin.sdk.R.styleable.AppLovinDefaultTimeBar_al_unplayed_color, androidx.media3.ui.DefaultTimeBar.DEFAULT_UNPLAYED_COLOR);
                int i7 = typedArrayObtainStyledAttributes.getInt(com.applovin.sdk.R.styleable.AppLovinDefaultTimeBar_al_ad_marker_color, androidx.media3.ui.DefaultTimeBar.DEFAULT_AD_MARKER_COLOR);
                int i8 = typedArrayObtainStyledAttributes.getInt(com.applovin.sdk.R.styleable.AppLovinDefaultTimeBar_al_played_ad_marker_color, androidx.media3.ui.DefaultTimeBar.DEFAULT_PLAYED_AD_MARKER_COLOR);
                paint.setColor(i3);
                paint6.setColor(i4);
                paint2.setColor(i5);
                paint3.setColor(i6);
                paint4.setColor(i7);
                paint5.setColor(i8);
                typedArrayObtainStyledAttributes.recycle();
            } catch (java.lang.Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            this.m = iA;
            this.n = iA2;
            this.o = 0;
            this.p = iA3;
            this.q = iA4;
            this.r = iA5;
            this.s = iA6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(androidx.media3.ui.DefaultTimeBar.DEFAULT_BUFFERED_COLOR);
            paint3.setColor(androidx.media3.ui.DefaultTimeBar.DEFAULT_UNPLAYED_COLOR);
            paint4.setColor(androidx.media3.ui.DefaultTimeBar.DEFAULT_AD_MARKER_COLOR);
            paint5.setColor(androidx.media3.ui.DefaultTimeBar.DEFAULT_PLAYED_AD_MARKER_COLOR);
            this.l = null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        this.v = sb;
        this.w = new java.util.Formatter(sb, java.util.Locale.getDefault());
        this.x = new java.lang.Runnable() { // from class: com.applovin.exoplayer2.ui.b$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a();
            }
        };
        android.graphics.drawable.Drawable drawable2 = this.l;
        if (drawable2 != null) {
            this.t = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.t = (java.lang.Math.max(this.r, java.lang.Math.max(this.q, this.s)) + 1) / 2;
        }
        this.G = 1.0f;
        android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
        this.F = valueAnimator;
        valueAnimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.applovin.exoplayer2.ui.b$$ExternalSyntheticLambda1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                this.f$0.a(valueAnimator2);
            }
        });
        this.K = androidx.media3.common.C.TIME_UNSET;
        this.C = androidx.media3.common.C.TIME_UNSET;
        this.B = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        a(false);
    }

    private void b(long j) {
        this.J = j;
        this.I = true;
        setPressed(true);
        android.view.ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        java.util.Iterator it = this.y.iterator();
        while (it.hasNext()) {
            ((com.applovin.exoplayer2.ui.i.a) it.next()).a(this, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(android.animation.ValueAnimator valueAnimator) {
        this.G = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate(this.f560a);
    }

    @Override // com.applovin.exoplayer2.ui.i
    public void a(com.applovin.exoplayer2.ui.i.a aVar) {
        com.applovin.impl.b1.a(aVar);
        this.y.add(aVar);
    }

    private void c() {
        android.graphics.drawable.Drawable drawable = this.l;
        if (drawable != null && drawable.isStateful() && this.l.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // com.applovin.exoplayer2.ui.i
    public void a(long[] jArr, boolean[] zArr, int i) {
        com.applovin.impl.b1.a(i == 0 || !(jArr == null || zArr == null));
        this.N = i;
        this.O = jArr;
        this.P = zArr;
        b();
    }

    private void b() {
        this.c.set(this.b);
        this.d.set(this.b);
        long j = this.I ? this.J : this.L;
        if (this.K > 0) {
            int iWidth = (int) ((((long) this.b.width()) * this.M) / this.K);
            android.graphics.Rect rect = this.c;
            android.graphics.Rect rect2 = this.b;
            rect.right = java.lang.Math.min(rect2.left + iWidth, rect2.right);
            int iWidth2 = (int) ((((long) this.b.width()) * j) / this.K);
            android.graphics.Rect rect3 = this.d;
            android.graphics.Rect rect4 = this.b;
            rect3.right = java.lang.Math.min(rect4.left + iWidth2, rect4.right);
        } else {
            android.graphics.Rect rect5 = this.c;
            int i = this.b.left;
            rect5.right = i;
            this.d.right = i;
        }
        invalidate(this.f560a);
    }

    private void a(boolean z) {
        removeCallbacks(this.x);
        this.I = false;
        setPressed(false);
        android.view.ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        java.util.Iterator it = this.y.iterator();
        while (it.hasNext()) {
            ((com.applovin.exoplayer2.ui.i.a) it.next()).a(this, this.J, z);
        }
    }

    private boolean a(long j) {
        long j2 = this.K;
        if (j2 <= 0) {
            return false;
        }
        long j3 = this.I ? this.J : this.L;
        long jB = com.applovin.impl.xp.b(j3 + j, 0L, j2);
        if (jB == j3) {
            return false;
        }
        if (!this.I) {
            b(jB);
        } else {
            c(jB);
        }
        b();
        return true;
    }

    private void b(android.graphics.Canvas canvas) {
        int iHeight = this.b.height();
        int iCenterY = this.b.centerY() - (iHeight / 2);
        int i = iHeight + iCenterY;
        if (this.K <= 0) {
            android.graphics.Rect rect = this.b;
            canvas.drawRect(rect.left, iCenterY, rect.right, i, this.h);
            return;
        }
        android.graphics.Rect rect2 = this.c;
        int i2 = rect2.left;
        int i3 = rect2.right;
        int iMax = java.lang.Math.max(java.lang.Math.max(this.b.left, i3), this.d.right);
        int i4 = this.b.right;
        if (iMax < i4) {
            canvas.drawRect(iMax, iCenterY, i4, i, this.h);
        }
        int iMax2 = java.lang.Math.max(i2, this.d.right);
        if (i3 > iMax2) {
            canvas.drawRect(iMax2, iCenterY, i3, i, this.g);
        }
        if (this.d.width() > 0) {
            android.graphics.Rect rect3 = this.d;
            canvas.drawRect(rect3.left, iCenterY, rect3.right, i, this.f);
        }
        if (this.N == 0) {
            return;
        }
        long[] jArr = (long[]) com.applovin.impl.b1.a(this.O);
        boolean[] zArr = (boolean[]) com.applovin.impl.b1.a(this.P);
        int i5 = this.p / 2;
        for (int i6 = 0; i6 < this.N; i6++) {
            int iWidth = ((int) ((((long) this.b.width()) * com.applovin.impl.xp.b(jArr[i6], 0L, this.K)) / this.K)) - i5;
            android.graphics.Rect rect4 = this.b;
            int iMin = rect4.left + java.lang.Math.min(rect4.width() - this.p, java.lang.Math.max(0, iWidth));
            canvas.drawRect(iMin, iCenterY, iMin + this.p, i, zArr[i6] ? this.j : this.i);
        }
    }

    private void a(float f) {
        android.graphics.Rect rect = this.d;
        android.graphics.Rect rect2 = this.b;
        rect.right = com.applovin.impl.xp.a((int) f, rect2.left, rect2.right);
    }

    private android.graphics.Point a(android.view.MotionEvent motionEvent) {
        this.z.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.z;
    }

    private boolean a(float f, float f2) {
        return this.f560a.contains((int) f, (int) f2);
    }

    private void a(android.graphics.Canvas canvas) {
        int i;
        if (this.K <= 0) {
            return;
        }
        android.graphics.Rect rect = this.d;
        int iA = com.applovin.impl.xp.a(rect.right, rect.left, this.b.right);
        int iCenterY = this.d.centerY();
        android.graphics.drawable.Drawable drawable = this.l;
        if (drawable == null) {
            if (!this.I && !isFocused()) {
                i = isEnabled() ? this.q : this.r;
            } else {
                i = this.s;
            }
            canvas.drawCircle(iA, iCenterY, (int) ((i * this.G) / 2.0f), this.k);
            return;
        }
        int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.G)) / 2;
        int intrinsicHeight = ((int) (this.l.getIntrinsicHeight() * this.G)) / 2;
        this.l.setBounds(iA - intrinsicWidth, iCenterY - intrinsicHeight, iA + intrinsicWidth, iCenterY + intrinsicHeight);
        this.l.draw(canvas);
    }

    private void a(int i, int i2) {
        android.graphics.Rect rect = this.E;
        if (rect != null && rect.width() == i && this.E.height() == i2) {
            return;
        }
        android.graphics.Rect rect2 = new android.graphics.Rect(0, 0, i, i2);
        this.E = rect2;
        setSystemGestureExclusionRects(java.util.Collections.singletonList(rect2));
    }

    private boolean a(android.graphics.drawable.Drawable drawable) {
        return com.applovin.impl.xp.f1515a >= 23 && a(drawable, getLayoutDirection());
    }

    private static boolean a(android.graphics.drawable.Drawable drawable, int i) {
        return com.applovin.impl.xp.f1515a >= 23 && drawable.setLayoutDirection(i);
    }
}
