package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class ForwardingListener implements android.view.View.OnTouchListener, android.view.View.OnAttachStateChangeListener {
    private int mActivePointerId;
    private java.lang.Runnable mDisallowIntercept;
    private boolean mForwarding;
    private final int mLongPressTimeout;
    private final float mScaledTouchSlop;
    final android.view.View mSrc;
    private final int mTapTimeout;
    private final int[] mTmpLocation = new int[2];
    private java.lang.Runnable mTriggerLongPress;

    public abstract androidx.appcompat.view.menu.ShowableListMenu getPopup();

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
    }

    public ForwardingListener(android.view.View view) {
        this.mSrc = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.mScaledTouchSlop = android.view.ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = android.view.ViewConfiguration.getTapTimeout();
        this.mTapTimeout = tapTimeout;
        this.mLongPressTimeout = (tapTimeout + android.view.ViewConfiguration.getLongPressTimeout()) / 2;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.mForwarding;
        if (z2) {
            z = onTouchForwarded(motionEvent) || !onForwardingStopped();
        } else {
            z = onTouchObserved(motionEvent) && onForwardingStarted();
            if (z) {
                long jUptimeMillis = android.os.SystemClock.uptimeMillis();
                android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.mSrc.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.mForwarding = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        this.mForwarding = false;
        this.mActivePointerId = -1;
        java.lang.Runnable runnable = this.mDisallowIntercept;
        if (runnable != null) {
            this.mSrc.removeCallbacks(runnable);
        }
    }

    protected boolean onForwardingStarted() {
        androidx.appcompat.view.menu.ShowableListMenu popup = getPopup();
        if (popup == null || popup.isShowing()) {
            return true;
        }
        popup.show();
        return true;
    }

    protected boolean onForwardingStopped() {
        androidx.appcompat.view.menu.ShowableListMenu popup = getPopup();
        if (popup == null || !popup.isShowing()) {
            return true;
        }
        popup.dismiss();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    private boolean onTouchObserved(android.view.MotionEvent motionEvent) {
        android.view.View view = this.mSrc;
        if (!view.isEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mActivePointerId = motionEvent.getPointerId(0);
            if (this.mDisallowIntercept == null) {
                this.mDisallowIntercept = new androidx.appcompat.widget.ForwardingListener.DisallowIntercept();
            }
            view.postDelayed(this.mDisallowIntercept, this.mTapTimeout);
            if (this.mTriggerLongPress == null) {
                this.mTriggerLongPress = new androidx.appcompat.widget.ForwardingListener.TriggerLongPress();
            }
            view.postDelayed(this.mTriggerLongPress, this.mLongPressTimeout);
        } else if (actionMasked == 1) {
            clearCallbacks();
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
            if (iFindPointerIndex >= 0 && !pointInView(view, motionEvent.getX(iFindPointerIndex), motionEvent.getY(iFindPointerIndex), this.mScaledTouchSlop)) {
                clearCallbacks();
                view.getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
        } else if (actionMasked == 3) {
            clearCallbacks();
        }
        return false;
    }

    private void clearCallbacks() {
        java.lang.Runnable runnable = this.mTriggerLongPress;
        if (runnable != null) {
            this.mSrc.removeCallbacks(runnable);
        }
        java.lang.Runnable runnable2 = this.mDisallowIntercept;
        if (runnable2 != null) {
            this.mSrc.removeCallbacks(runnable2);
        }
    }

    void onLongPress() {
        clearCallbacks();
        android.view.View view = this.mSrc;
        if (view.isEnabled() && !view.isLongClickable() && onForwardingStarted()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = android.os.SystemClock.uptimeMillis();
            android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.mForwarding = true;
        }
    }

    private boolean onTouchForwarded(android.view.MotionEvent motionEvent) {
        androidx.appcompat.widget.DropDownListView dropDownListView;
        android.view.View view = this.mSrc;
        androidx.appcompat.view.menu.ShowableListMenu popup = getPopup();
        if (popup == null || !popup.isShowing() || (dropDownListView = (androidx.appcompat.widget.DropDownListView) popup.getListView()) == null || !dropDownListView.isShown()) {
            return false;
        }
        android.view.MotionEvent motionEventObtainNoHistory = android.view.MotionEvent.obtainNoHistory(motionEvent);
        toGlobalMotionEvent(view, motionEventObtainNoHistory);
        toLocalMotionEvent(dropDownListView, motionEventObtainNoHistory);
        boolean zOnForwardedEvent = dropDownListView.onForwardedEvent(motionEventObtainNoHistory, this.mActivePointerId);
        motionEventObtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return zOnForwardedEvent && (actionMasked != 1 && actionMasked != 3);
    }

    private static boolean pointInView(android.view.View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    private boolean toLocalMotionEvent(android.view.View view, android.view.MotionEvent motionEvent) {
        int[] iArr = this.mTmpLocation;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(-iArr[0], -iArr[1]);
        return true;
    }

    private boolean toGlobalMotionEvent(android.view.View view, android.view.MotionEvent motionEvent) {
        int[] iArr = this.mTmpLocation;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(iArr[0], iArr[1]);
        return true;
    }

    private class DisallowIntercept implements java.lang.Runnable {
        DisallowIntercept() {
        }

        @Override // java.lang.Runnable
        public void run() {
            android.view.ViewParent parent = androidx.appcompat.widget.ForwardingListener.this.mSrc.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    private class TriggerLongPress implements java.lang.Runnable {
        TriggerLongPress() {
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.appcompat.widget.ForwardingListener.this.onLongPress();
        }
    }
}
