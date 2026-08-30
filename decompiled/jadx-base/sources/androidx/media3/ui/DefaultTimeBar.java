package androidx.media3.ui;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultTimeBar extends android.view.View implements androidx.media3.ui.TimeBar {
    private static final java.lang.String ACCESSIBILITY_CLASS_NAME = "android.widget.SeekBar";
    public static final int BAR_GRAVITY_BOTTOM = 1;
    public static final int BAR_GRAVITY_CENTER = 0;
    public static final int DEFAULT_AD_MARKER_COLOR = -1291845888;
    public static final int DEFAULT_AD_MARKER_WIDTH_DP = 4;
    public static final int DEFAULT_BAR_HEIGHT_DP = 4;
    public static final int DEFAULT_BUFFERED_COLOR = -855638017;
    private static final int DEFAULT_INCREMENT_COUNT = 20;
    public static final int DEFAULT_PLAYED_AD_MARKER_COLOR = 872414976;
    public static final int DEFAULT_PLAYED_COLOR = -1;
    public static final int DEFAULT_SCRUBBER_COLOR = -1;
    public static final int DEFAULT_SCRUBBER_DISABLED_SIZE_DP = 0;
    public static final int DEFAULT_SCRUBBER_DRAGGED_SIZE_DP = 16;
    public static final int DEFAULT_SCRUBBER_ENABLED_SIZE_DP = 12;
    public static final int DEFAULT_TOUCH_TARGET_HEIGHT_DP = 26;
    public static final int DEFAULT_UNPLAYED_COLOR = 872415231;
    private static final int FINE_SCRUB_RATIO = 3;
    private static final int FINE_SCRUB_Y_THRESHOLD_DP = -50;
    private static final float HIDDEN_SCRUBBER_SCALE = 0.0f;
    private static final float SHOWN_SCRUBBER_SCALE = 1.0f;
    private static final long STOP_SCRUBBING_TIMEOUT_MS = 1000;
    private int adGroupCount;
    private long[] adGroupTimesMs;
    private final android.graphics.Paint adMarkerPaint;
    private final int adMarkerWidth;
    private final int barGravity;
    private final int barHeight;
    private final android.graphics.Rect bufferedBar;
    private final android.graphics.Paint bufferedPaint;
    private long bufferedPosition;
    private final float density;
    private long duration;
    private final int fineScrubYThreshold;
    private final java.lang.StringBuilder formatBuilder;
    private final java.util.Formatter formatter;
    private int keyCountIncrement;
    private long keyTimeIncrement;
    private int lastCoarseScrubXPosition;
    private android.graphics.Rect lastExclusionRectangle;
    private final java.util.concurrent.CopyOnWriteArraySet<androidx.media3.ui.TimeBar.OnScrubListener> listeners;
    private boolean[] playedAdGroups;
    private final android.graphics.Paint playedAdMarkerPaint;
    private final android.graphics.Paint playedPaint;
    private long position;
    private final android.graphics.Rect progressBar;
    private long scrubPosition;
    private final android.graphics.Rect scrubberBar;
    private final int scrubberDisabledSize;
    private final int scrubberDraggedSize;
    private final android.graphics.drawable.Drawable scrubberDrawable;
    private final int scrubberEnabledSize;
    private final int scrubberPadding;
    private boolean scrubberPaddingDisabled;
    private final android.graphics.Paint scrubberPaint;
    private float scrubberScale;
    private android.animation.ValueAnimator scrubberScalingAnimator;
    private boolean scrubbing;
    private final android.graphics.Rect seekBounds;
    private final java.lang.Runnable stopScrubbingRunnable;
    private final android.graphics.Point touchPosition;
    private final int touchTargetHeight;
    private final android.graphics.Paint unplayedPaint;

    private static int dpToPx(float f, int i) {
        return (int) ((i * f) + 0.5f);
    }

    private static int pxToDp(float f, int i) {
        return (int) (i / f);
    }

    public DefaultTimeBar(android.content.Context context) {
        this(context, null);
    }

    public DefaultTimeBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DefaultTimeBar(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public DefaultTimeBar(android.content.Context context, android.util.AttributeSet attributeSet, int i, android.util.AttributeSet attributeSet2) {
        this(context, attributeSet, i, attributeSet2, 0);
    }

    public DefaultTimeBar(android.content.Context context, android.util.AttributeSet attributeSet, int i, android.util.AttributeSet attributeSet2, int i2) {
        super(context, attributeSet, i);
        this.seekBounds = new android.graphics.Rect();
        this.progressBar = new android.graphics.Rect();
        this.bufferedBar = new android.graphics.Rect();
        this.scrubberBar = new android.graphics.Rect();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.playedPaint = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.bufferedPaint = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.unplayedPaint = paint3;
        android.graphics.Paint paint4 = new android.graphics.Paint();
        this.adMarkerPaint = paint4;
        android.graphics.Paint paint5 = new android.graphics.Paint();
        this.playedAdMarkerPaint = paint5;
        android.graphics.Paint paint6 = new android.graphics.Paint();
        this.scrubberPaint = paint6;
        paint6.setAntiAlias(true);
        this.listeners = new java.util.concurrent.CopyOnWriteArraySet<>();
        this.touchPosition = new android.graphics.Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.density = f;
        this.fineScrubYThreshold = dpToPx(f, FINE_SCRUB_Y_THRESHOLD_DP);
        int iDpToPx = dpToPx(f, 4);
        int iDpToPx2 = dpToPx(f, 26);
        int iDpToPx3 = dpToPx(f, 4);
        int iDpToPx4 = dpToPx(f, 12);
        int iDpToPx5 = dpToPx(f, 0);
        int iDpToPx6 = dpToPx(f, 16);
        if (attributeSet2 != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, androidx.media3.ui.R.styleable.DefaultTimeBar, i, i2);
            try {
                android.graphics.drawable.Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(androidx.media3.ui.R.styleable.DefaultTimeBar_scrubber_drawable);
                this.scrubberDrawable = drawable;
                if (drawable != null) {
                    setDrawableLayoutDirection(drawable);
                    iDpToPx2 = java.lang.Math.max(drawable.getMinimumHeight(), iDpToPx2);
                }
                this.barHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.media3.ui.R.styleable.DefaultTimeBar_bar_height, iDpToPx);
                this.touchTargetHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.media3.ui.R.styleable.DefaultTimeBar_touch_target_height, iDpToPx2);
                this.barGravity = typedArrayObtainStyledAttributes.getInt(androidx.media3.ui.R.styleable.DefaultTimeBar_bar_gravity, 0);
                this.adMarkerWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.media3.ui.R.styleable.DefaultTimeBar_ad_marker_width, iDpToPx3);
                this.scrubberEnabledSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.media3.ui.R.styleable.DefaultTimeBar_scrubber_enabled_size, iDpToPx4);
                this.scrubberDisabledSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.media3.ui.R.styleable.DefaultTimeBar_scrubber_disabled_size, iDpToPx5);
                this.scrubberDraggedSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.media3.ui.R.styleable.DefaultTimeBar_scrubber_dragged_size, iDpToPx6);
                int i3 = typedArrayObtainStyledAttributes.getInt(androidx.media3.ui.R.styleable.DefaultTimeBar_played_color, -1);
                int i4 = typedArrayObtainStyledAttributes.getInt(androidx.media3.ui.R.styleable.DefaultTimeBar_scrubber_color, -1);
                int i5 = typedArrayObtainStyledAttributes.getInt(androidx.media3.ui.R.styleable.DefaultTimeBar_buffered_color, DEFAULT_BUFFERED_COLOR);
                int i6 = typedArrayObtainStyledAttributes.getInt(androidx.media3.ui.R.styleable.DefaultTimeBar_unplayed_color, DEFAULT_UNPLAYED_COLOR);
                int i7 = typedArrayObtainStyledAttributes.getInt(androidx.media3.ui.R.styleable.DefaultTimeBar_ad_marker_color, DEFAULT_AD_MARKER_COLOR);
                int i8 = typedArrayObtainStyledAttributes.getInt(androidx.media3.ui.R.styleable.DefaultTimeBar_played_ad_marker_color, DEFAULT_PLAYED_AD_MARKER_COLOR);
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
            this.barHeight = iDpToPx;
            this.touchTargetHeight = iDpToPx2;
            this.barGravity = 0;
            this.adMarkerWidth = iDpToPx3;
            this.scrubberEnabledSize = iDpToPx4;
            this.scrubberDisabledSize = iDpToPx5;
            this.scrubberDraggedSize = iDpToPx6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(DEFAULT_BUFFERED_COLOR);
            paint3.setColor(DEFAULT_UNPLAYED_COLOR);
            paint4.setColor(DEFAULT_AD_MARKER_COLOR);
            paint5.setColor(DEFAULT_PLAYED_AD_MARKER_COLOR);
            this.scrubberDrawable = null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        this.formatBuilder = sb;
        this.formatter = new java.util.Formatter(sb, java.util.Locale.getDefault());
        this.stopScrubbingRunnable = new java.lang.Runnable() { // from class: androidx.media3.ui.DefaultTimeBar$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m443lambda$new$0$androidxmedia3uiDefaultTimeBar();
            }
        };
        android.graphics.drawable.Drawable drawable2 = this.scrubberDrawable;
        if (drawable2 != null) {
            this.scrubberPadding = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.scrubberPadding = (java.lang.Math.max(this.scrubberDisabledSize, java.lang.Math.max(this.scrubberEnabledSize, this.scrubberDraggedSize)) + 1) / 2;
        }
        this.scrubberScale = 1.0f;
        android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
        this.scrubberScalingAnimator = valueAnimator;
        valueAnimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.DefaultTimeBar$$ExternalSyntheticLambda1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                this.f$0.m444lambda$new$1$androidxmedia3uiDefaultTimeBar(valueAnimator2);
            }
        });
        this.duration = androidx.media3.common.C.TIME_UNSET;
        this.keyTimeIncrement = androidx.media3.common.C.TIME_UNSET;
        this.keyCountIncrement = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* JADX INFO: renamed from: lambda$new$0$androidx-media3-ui-DefaultTimeBar, reason: not valid java name */
    /* synthetic */ void m443lambda$new$0$androidxmedia3uiDefaultTimeBar() {
        stopScrubbing(false);
    }

    /* JADX INFO: renamed from: lambda$new$1$androidx-media3-ui-DefaultTimeBar, reason: not valid java name */
    /* synthetic */ void m444lambda$new$1$androidxmedia3uiDefaultTimeBar(android.animation.ValueAnimator valueAnimator) {
        this.scrubberScale = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate(this.seekBounds);
    }

    public void showScrubber() {
        if (this.scrubberScalingAnimator.isStarted()) {
            this.scrubberScalingAnimator.cancel();
        }
        this.scrubberPaddingDisabled = false;
        this.scrubberScale = 1.0f;
        invalidate(this.seekBounds);
    }

    public void showScrubber(long j) {
        if (this.scrubberScalingAnimator.isStarted()) {
            this.scrubberScalingAnimator.cancel();
        }
        this.scrubberPaddingDisabled = false;
        this.scrubberScalingAnimator.setFloatValues(this.scrubberScale, 1.0f);
        this.scrubberScalingAnimator.setDuration(j);
        this.scrubberScalingAnimator.start();
    }

    public void hideScrubber(boolean z) {
        if (this.scrubberScalingAnimator.isStarted()) {
            this.scrubberScalingAnimator.cancel();
        }
        this.scrubberPaddingDisabled = z;
        this.scrubberScale = 0.0f;
        invalidate(this.seekBounds);
    }

    public void hideScrubber(long j) {
        if (this.scrubberScalingAnimator.isStarted()) {
            this.scrubberScalingAnimator.cancel();
        }
        this.scrubberScalingAnimator.setFloatValues(this.scrubberScale, 0.0f);
        this.scrubberScalingAnimator.setDuration(j);
        this.scrubberScalingAnimator.start();
    }

    public void setPlayedColor(int i) {
        this.playedPaint.setColor(i);
        invalidate(this.seekBounds);
    }

    public void setScrubberColor(int i) {
        this.scrubberPaint.setColor(i);
        invalidate(this.seekBounds);
    }

    public void setBufferedColor(int i) {
        this.bufferedPaint.setColor(i);
        invalidate(this.seekBounds);
    }

    public void setUnplayedColor(int i) {
        this.unplayedPaint.setColor(i);
        invalidate(this.seekBounds);
    }

    public void setAdMarkerColor(int i) {
        this.adMarkerPaint.setColor(i);
        invalidate(this.seekBounds);
    }

    public void setPlayedAdMarkerColor(int i) {
        this.playedAdMarkerPaint.setColor(i);
        invalidate(this.seekBounds);
    }

    @Override // androidx.media3.ui.TimeBar
    public void addListener(androidx.media3.ui.TimeBar.OnScrubListener onScrubListener) {
        androidx.media3.common.util.Assertions.checkNotNull(onScrubListener);
        this.listeners.add(onScrubListener);
    }

    @Override // androidx.media3.ui.TimeBar
    public void removeListener(androidx.media3.ui.TimeBar.OnScrubListener onScrubListener) {
        this.listeners.remove(onScrubListener);
    }

    @Override // androidx.media3.ui.TimeBar
    public void setKeyTimeIncrement(long j) {
        androidx.media3.common.util.Assertions.checkArgument(j > 0);
        this.keyCountIncrement = -1;
        this.keyTimeIncrement = j;
    }

    @Override // androidx.media3.ui.TimeBar
    public void setKeyCountIncrement(int i) {
        androidx.media3.common.util.Assertions.checkArgument(i > 0);
        this.keyCountIncrement = i;
        this.keyTimeIncrement = androidx.media3.common.C.TIME_UNSET;
    }

    @Override // androidx.media3.ui.TimeBar
    public void setPosition(long j) {
        if (this.position == j) {
            return;
        }
        this.position = j;
        setContentDescription(getProgressText());
        update();
    }

    @Override // androidx.media3.ui.TimeBar
    public void setBufferedPosition(long j) {
        if (this.bufferedPosition == j) {
            return;
        }
        this.bufferedPosition = j;
        update();
    }

    @Override // androidx.media3.ui.TimeBar
    public void setDuration(long j) {
        if (this.duration == j) {
            return;
        }
        this.duration = j;
        if (this.scrubbing && j == androidx.media3.common.C.TIME_UNSET) {
            stopScrubbing(true);
        }
        update();
    }

    @Override // androidx.media3.ui.TimeBar
    public long getPreferredUpdateDelay() {
        int iPxToDp = pxToDp(this.density, this.progressBar.width());
        if (iPxToDp != 0) {
            long j = this.duration;
            if (j != 0 && j != androidx.media3.common.C.TIME_UNSET) {
                return j / ((long) iPxToDp);
            }
        }
        return Long.MAX_VALUE;
    }

    @Override // androidx.media3.ui.TimeBar
    public void setAdGroupTimesMs(long[] jArr, boolean[] zArr, int i) {
        androidx.media3.common.util.Assertions.checkArgument(i == 0 || !(jArr == null || zArr == null));
        this.adGroupCount = i;
        this.adGroupTimesMs = jArr;
        this.playedAdGroups = zArr;
        update();
    }

    @Override // android.view.View, androidx.media3.ui.TimeBar
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.scrubbing || z) {
            return;
        }
        stopScrubbing(true);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        canvas.save();
        drawTimeBar(canvas);
        drawPlayhead(canvas);
        canvas.restore();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (isEnabled() && this.duration > 0) {
            android.graphics.Point pointResolveRelativeTouchPosition = resolveRelativeTouchPosition(motionEvent);
            int i = pointResolveRelativeTouchPosition.x;
            int i2 = pointResolveRelativeTouchPosition.y;
            int action = motionEvent.getAction();
            if (action == 0) {
                float f = i;
                if (isInSeekBar(f, i2)) {
                    positionScrubber(f);
                    startScrubbing(getScrubberPosition());
                    update();
                    invalidate();
                    return true;
                }
            } else if (action == 1) {
                if (this.scrubbing) {
                    stopScrubbing(motionEvent.getAction() == 3);
                    return true;
                }
            } else if (action != 2) {
                if (action == 3) {
                    if (this.scrubbing) {
                        stopScrubbing(motionEvent.getAction() == 3);
                        return true;
                    }
                }
            } else if (this.scrubbing) {
                if (i2 < this.fineScrubYThreshold) {
                    int i3 = this.lastCoarseScrubXPosition;
                    positionScrubber(i3 + ((i - i3) / 3));
                } else {
                    this.lastCoarseScrubXPosition = i;
                    positionScrubber(i);
                }
                updateScrubbing(getScrubberPosition());
                update();
                invalidate();
                return true;
            }
        }
        return false;
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
                        if (scrubIncrementally(positionIncrement)) {
                            removeCallbacks(this.stopScrubbingRunnable);
                            postDelayed(this.stopScrubbingRunnable, 1000L);
                            return true;
                        }
                        break;
                    case 22:
                        if (scrubIncrementally(positionIncrement)) {
                            removeCallbacks(this.stopScrubbingRunnable);
                            postDelayed(this.stopScrubbingRunnable, 1000L);
                            return true;
                        }
                        break;
                    case 23:
                        if (this.scrubbing) {
                            stopScrubbing(false);
                            return true;
                        }
                        break;
                }
            } else if (this.scrubbing) {
                stopScrubbing(false);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z, int i, android.graphics.Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!this.scrubbing || z) {
            return;
        }
        stopScrubbing(false);
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        updateDrawableState();
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        android.graphics.drawable.Drawable drawable = this.scrubberDrawable;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = android.view.View.MeasureSpec.getMode(i2);
        int size = android.view.View.MeasureSpec.getSize(i2);
        if (mode == 0) {
            size = this.touchTargetHeight;
        } else if (mode != 1073741824) {
            size = java.lang.Math.min(this.touchTargetHeight, size);
        }
        setMeasuredDimension(android.view.View.MeasureSpec.getSize(i), size);
        updateDrawableState();
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingBottom;
        int iMax;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i5 - getPaddingRight();
        int i7 = this.scrubberPaddingDisabled ? 0 : this.scrubberPadding;
        if (this.barGravity == 1) {
            paddingBottom = (i6 - getPaddingBottom()) - this.touchTargetHeight;
            int paddingBottom2 = i6 - getPaddingBottom();
            int i8 = this.barHeight;
            iMax = (paddingBottom2 - i8) - java.lang.Math.max(i7 - (i8 / 2), 0);
        } else {
            paddingBottom = (i6 - this.touchTargetHeight) / 2;
            iMax = (i6 - this.barHeight) / 2;
        }
        this.seekBounds.set(paddingLeft, paddingBottom, paddingRight, this.touchTargetHeight + paddingBottom);
        this.progressBar.set(this.seekBounds.left + i7, iMax, this.seekBounds.right - i7, this.barHeight + iMax);
        if (androidx.media3.common.util.Util.SDK_INT >= 29) {
            setSystemGestureExclusionRectsV29(i5, i6);
        }
        update();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        android.graphics.drawable.Drawable drawable = this.scrubberDrawable;
        if (drawable == null || !setDrawableLayoutDirection(drawable, i)) {
            return;
        }
        invalidate();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_CLASS_NAME);
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.duration <= 0) {
            return;
        }
        if (androidx.media3.common.util.Util.SDK_INT >= 21) {
            accessibilityNodeInfo.addAction(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        } else {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i, android.os.Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.duration <= 0) {
            return false;
        }
        if (i == 8192) {
            if (scrubIncrementally(-getPositionIncrement())) {
                stopScrubbing(false);
            }
        } else {
            if (i != 4096) {
                return false;
            }
            if (scrubIncrementally(getPositionIncrement())) {
                stopScrubbing(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    private void startScrubbing(long j) {
        this.scrubPosition = j;
        this.scrubbing = true;
        setPressed(true);
        android.view.ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        java.util.Iterator<androidx.media3.ui.TimeBar.OnScrubListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onScrubStart(this, j);
        }
    }

    private void updateScrubbing(long j) {
        if (this.scrubPosition == j) {
            return;
        }
        this.scrubPosition = j;
        java.util.Iterator<androidx.media3.ui.TimeBar.OnScrubListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onScrubMove(this, j);
        }
    }

    private void stopScrubbing(boolean z) {
        removeCallbacks(this.stopScrubbingRunnable);
        this.scrubbing = false;
        setPressed(false);
        android.view.ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        java.util.Iterator<androidx.media3.ui.TimeBar.OnScrubListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onScrubStop(this, this.scrubPosition, z);
        }
    }

    private boolean scrubIncrementally(long j) {
        long j2 = this.duration;
        if (j2 <= 0) {
            return false;
        }
        long j3 = this.scrubbing ? this.scrubPosition : this.position;
        long jConstrainValue = androidx.media3.common.util.Util.constrainValue(j3 + j, 0L, j2);
        if (jConstrainValue == j3) {
            return false;
        }
        if (!this.scrubbing) {
            startScrubbing(jConstrainValue);
        } else {
            updateScrubbing(jConstrainValue);
        }
        update();
        return true;
    }

    private void update() {
        this.bufferedBar.set(this.progressBar);
        this.scrubberBar.set(this.progressBar);
        long j = this.scrubbing ? this.scrubPosition : this.position;
        if (this.duration > 0) {
            this.bufferedBar.right = java.lang.Math.min(this.progressBar.left + ((int) ((((long) this.progressBar.width()) * this.bufferedPosition) / this.duration)), this.progressBar.right);
            this.scrubberBar.right = java.lang.Math.min(this.progressBar.left + ((int) ((((long) this.progressBar.width()) * j) / this.duration)), this.progressBar.right);
        } else {
            this.bufferedBar.right = this.progressBar.left;
            this.scrubberBar.right = this.progressBar.left;
        }
        invalidate(this.seekBounds);
    }

    private void positionScrubber(float f) {
        this.scrubberBar.right = androidx.media3.common.util.Util.constrainValue((int) f, this.progressBar.left, this.progressBar.right);
    }

    private android.graphics.Point resolveRelativeTouchPosition(android.view.MotionEvent motionEvent) {
        this.touchPosition.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.touchPosition;
    }

    private long getScrubberPosition() {
        if (this.progressBar.width() <= 0 || this.duration == androidx.media3.common.C.TIME_UNSET) {
            return 0L;
        }
        return (((long) this.scrubberBar.width()) * this.duration) / ((long) this.progressBar.width());
    }

    private boolean isInSeekBar(float f, float f2) {
        return this.seekBounds.contains((int) f, (int) f2);
    }

    private void drawTimeBar(android.graphics.Canvas canvas) {
        int iHeight = this.progressBar.height();
        int iCenterY = this.progressBar.centerY() - (iHeight / 2);
        int i = iHeight + iCenterY;
        if (this.duration <= 0) {
            canvas.drawRect(this.progressBar.left, iCenterY, this.progressBar.right, i, this.unplayedPaint);
            return;
        }
        int i2 = this.bufferedBar.left;
        int i3 = this.bufferedBar.right;
        int iMax = java.lang.Math.max(java.lang.Math.max(this.progressBar.left, i3), this.scrubberBar.right);
        if (iMax < this.progressBar.right) {
            canvas.drawRect(iMax, iCenterY, this.progressBar.right, i, this.unplayedPaint);
        }
        int iMax2 = java.lang.Math.max(i2, this.scrubberBar.right);
        if (i3 > iMax2) {
            canvas.drawRect(iMax2, iCenterY, i3, i, this.bufferedPaint);
        }
        if (this.scrubberBar.width() > 0) {
            canvas.drawRect(this.scrubberBar.left, iCenterY, this.scrubberBar.right, i, this.playedPaint);
        }
        if (this.adGroupCount == 0) {
            return;
        }
        long[] jArr = (long[]) androidx.media3.common.util.Assertions.checkNotNull(this.adGroupTimesMs);
        boolean[] zArr = (boolean[]) androidx.media3.common.util.Assertions.checkNotNull(this.playedAdGroups);
        int i4 = this.adMarkerWidth / 2;
        for (int i5 = 0; i5 < this.adGroupCount; i5++) {
            int iMin = this.progressBar.left + java.lang.Math.min(this.progressBar.width() - this.adMarkerWidth, java.lang.Math.max(0, ((int) ((((long) this.progressBar.width()) * androidx.media3.common.util.Util.constrainValue(jArr[i5], 0L, this.duration)) / this.duration)) - i4));
            canvas.drawRect(iMin, iCenterY, iMin + this.adMarkerWidth, i, zArr[i5] ? this.playedAdMarkerPaint : this.adMarkerPaint);
        }
    }

    private void drawPlayhead(android.graphics.Canvas canvas) {
        int i;
        if (this.duration <= 0) {
            return;
        }
        int iConstrainValue = androidx.media3.common.util.Util.constrainValue(this.scrubberBar.right, this.scrubberBar.left, this.progressBar.right);
        int iCenterY = this.scrubberBar.centerY();
        android.graphics.drawable.Drawable drawable = this.scrubberDrawable;
        if (drawable == null) {
            if (this.scrubbing || isFocused()) {
                i = this.scrubberDraggedSize;
            } else {
                i = isEnabled() ? this.scrubberEnabledSize : this.scrubberDisabledSize;
            }
            canvas.drawCircle(iConstrainValue, iCenterY, (int) ((i * this.scrubberScale) / 2.0f), this.scrubberPaint);
            return;
        }
        int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.scrubberScale)) / 2;
        int intrinsicHeight = ((int) (this.scrubberDrawable.getIntrinsicHeight() * this.scrubberScale)) / 2;
        this.scrubberDrawable.setBounds(iConstrainValue - intrinsicWidth, iCenterY - intrinsicHeight, iConstrainValue + intrinsicWidth, iCenterY + intrinsicHeight);
        this.scrubberDrawable.draw(canvas);
    }

    private void updateDrawableState() {
        android.graphics.drawable.Drawable drawable = this.scrubberDrawable;
        if (drawable != null && drawable.isStateful() && this.scrubberDrawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    private void setSystemGestureExclusionRectsV29(int i, int i2) {
        android.graphics.Rect rect = this.lastExclusionRectangle;
        if (rect != null && rect.width() == i && this.lastExclusionRectangle.height() == i2) {
            return;
        }
        android.graphics.Rect rect2 = new android.graphics.Rect(0, 0, i, i2);
        this.lastExclusionRectangle = rect2;
        setSystemGestureExclusionRects(java.util.Collections.singletonList(rect2));
    }

    private java.lang.String getProgressText() {
        return androidx.media3.common.util.Util.getStringForTime(this.formatBuilder, this.formatter, this.position);
    }

    private long getPositionIncrement() {
        long j = this.keyTimeIncrement;
        if (j != androidx.media3.common.C.TIME_UNSET) {
            return j;
        }
        long j2 = this.duration;
        if (j2 == androidx.media3.common.C.TIME_UNSET) {
            return 0L;
        }
        return j2 / ((long) this.keyCountIncrement);
    }

    private boolean setDrawableLayoutDirection(android.graphics.drawable.Drawable drawable) {
        return androidx.media3.common.util.Util.SDK_INT >= 23 && setDrawableLayoutDirection(drawable, getLayoutDirection());
    }

    private static boolean setDrawableLayoutDirection(android.graphics.drawable.Drawable drawable, int i) {
        return androidx.media3.common.util.Util.SDK_INT >= 23 && drawable.setLayoutDirection(i);
    }
}
