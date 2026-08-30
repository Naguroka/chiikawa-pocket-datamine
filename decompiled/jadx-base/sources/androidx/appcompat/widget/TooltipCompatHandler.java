package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class TooltipCompatHandler implements android.view.View.OnLongClickListener, android.view.View.OnHoverListener, android.view.View.OnAttachStateChangeListener {
    private static final long HOVER_HIDE_TIMEOUT_MS = 15000;
    private static final long HOVER_HIDE_TIMEOUT_SHORT_MS = 3000;
    private static final long LONG_CLICK_HIDE_TIMEOUT_MS = 2500;
    private static final java.lang.String TAG = "TooltipCompatHandler";
    private static androidx.appcompat.widget.TooltipCompatHandler sActiveHandler;
    private static androidx.appcompat.widget.TooltipCompatHandler sPendingHandler;
    private final android.view.View mAnchor;
    private int mAnchorX;
    private int mAnchorY;
    private boolean mForceNextChangeSignificant;
    private boolean mFromTouch;
    private final int mHoverSlop;
    private androidx.appcompat.widget.TooltipPopup mPopup;
    private final java.lang.CharSequence mTooltipText;
    private final java.lang.Runnable mShowRunnable = new java.lang.Runnable() { // from class: androidx.appcompat.widget.TooltipCompatHandler$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.m7lambda$new$0$androidxappcompatwidgetTooltipCompatHandler();
        }
    };
    private final java.lang.Runnable mHideRunnable = new java.lang.Runnable() { // from class: androidx.appcompat.widget.TooltipCompatHandler$$ExternalSyntheticLambda1
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.hide();
        }
    };

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
    }

    /* JADX INFO: renamed from: lambda$new$0$androidx-appcompat-widget-TooltipCompatHandler, reason: not valid java name */
    /* synthetic */ void m7lambda$new$0$androidxappcompatwidgetTooltipCompatHandler() {
        show(false);
    }

    public static void setTooltipText(android.view.View view, java.lang.CharSequence charSequence) {
        androidx.appcompat.widget.TooltipCompatHandler tooltipCompatHandler = sPendingHandler;
        if (tooltipCompatHandler != null && tooltipCompatHandler.mAnchor == view) {
            setPendingHandler(null);
        }
        if (android.text.TextUtils.isEmpty(charSequence)) {
            androidx.appcompat.widget.TooltipCompatHandler tooltipCompatHandler2 = sActiveHandler;
            if (tooltipCompatHandler2 != null && tooltipCompatHandler2.mAnchor == view) {
                tooltipCompatHandler2.hide();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new androidx.appcompat.widget.TooltipCompatHandler(view, charSequence);
    }

    private TooltipCompatHandler(android.view.View view, java.lang.CharSequence charSequence) {
        this.mAnchor = view;
        this.mTooltipText = charSequence;
        this.mHoverSlop = androidx.core.view.ViewConfigurationCompat.getScaledHoverSlop(android.view.ViewConfiguration.get(view.getContext()));
        forceNextChangeSignificant();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        this.mAnchorX = view.getWidth() / 2;
        this.mAnchorY = view.getHeight() / 2;
        show(true);
        return true;
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(android.view.View view, android.view.MotionEvent motionEvent) {
        if (this.mPopup != null && this.mFromTouch) {
            return false;
        }
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) this.mAnchor.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                forceNextChangeSignificant();
                hide();
            }
        } else if (this.mAnchor.isEnabled() && this.mPopup == null && updateAnchorPos(motionEvent)) {
            setPendingHandler(this);
        }
        return false;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        hide();
    }

    void show(boolean z) {
        long longPressTimeout;
        long j;
        long j2;
        if (androidx.core.view.ViewCompat.isAttachedToWindow(this.mAnchor)) {
            setPendingHandler(null);
            androidx.appcompat.widget.TooltipCompatHandler tooltipCompatHandler = sActiveHandler;
            if (tooltipCompatHandler != null) {
                tooltipCompatHandler.hide();
            }
            sActiveHandler = this;
            this.mFromTouch = z;
            androidx.appcompat.widget.TooltipPopup tooltipPopup = new androidx.appcompat.widget.TooltipPopup(this.mAnchor.getContext());
            this.mPopup = tooltipPopup;
            tooltipPopup.show(this.mAnchor, this.mAnchorX, this.mAnchorY, this.mFromTouch, this.mTooltipText);
            this.mAnchor.addOnAttachStateChangeListener(this);
            if (this.mFromTouch) {
                j2 = LONG_CLICK_HIDE_TIMEOUT_MS;
            } else {
                if ((androidx.core.view.ViewCompat.getWindowSystemUiVisibility(this.mAnchor) & 1) == 1) {
                    longPressTimeout = android.view.ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = android.view.ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            this.mAnchor.removeCallbacks(this.mHideRunnable);
            this.mAnchor.postDelayed(this.mHideRunnable, j2);
        }
    }

    void hide() {
        if (sActiveHandler == this) {
            sActiveHandler = null;
            androidx.appcompat.widget.TooltipPopup tooltipPopup = this.mPopup;
            if (tooltipPopup != null) {
                tooltipPopup.hide();
                this.mPopup = null;
                forceNextChangeSignificant();
                this.mAnchor.removeOnAttachStateChangeListener(this);
            } else {
                android.util.Log.e(TAG, "sActiveHandler.mPopup == null");
            }
        }
        if (sPendingHandler == this) {
            setPendingHandler(null);
        }
        this.mAnchor.removeCallbacks(this.mHideRunnable);
    }

    private static void setPendingHandler(androidx.appcompat.widget.TooltipCompatHandler tooltipCompatHandler) {
        androidx.appcompat.widget.TooltipCompatHandler tooltipCompatHandler2 = sPendingHandler;
        if (tooltipCompatHandler2 != null) {
            tooltipCompatHandler2.cancelPendingShow();
        }
        sPendingHandler = tooltipCompatHandler;
        if (tooltipCompatHandler != null) {
            tooltipCompatHandler.scheduleShow();
        }
    }

    private void scheduleShow() {
        this.mAnchor.postDelayed(this.mShowRunnable, android.view.ViewConfiguration.getLongPressTimeout());
    }

    private void cancelPendingShow() {
        this.mAnchor.removeCallbacks(this.mShowRunnable);
    }

    private boolean updateAnchorPos(android.view.MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (!this.mForceNextChangeSignificant && java.lang.Math.abs(x - this.mAnchorX) <= this.mHoverSlop && java.lang.Math.abs(y - this.mAnchorY) <= this.mHoverSlop) {
            return false;
        }
        this.mAnchorX = x;
        this.mAnchorY = y;
        this.mForceNextChangeSignificant = false;
        return true;
    }

    private void forceNextChangeSignificant() {
        this.mForceNextChangeSignificant = true;
    }
}
