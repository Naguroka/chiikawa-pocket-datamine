package com.google.android.material.behavior;

/* JADX INFO: loaded from: classes5.dex */
public class SwipeDismissBehavior<V extends android.view.View> extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<V> {
    private static final float DEFAULT_ALPHA_END_DISTANCE = 0.5f;
    private static final float DEFAULT_ALPHA_START_DISTANCE = 0.0f;
    private static final float DEFAULT_DRAG_DISMISS_THRESHOLD = 0.5f;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    public static final int SWIPE_DIRECTION_ANY = 2;
    public static final int SWIPE_DIRECTION_END_TO_START = 1;
    public static final int SWIPE_DIRECTION_START_TO_END = 0;
    private boolean interceptingEvents;
    com.google.android.material.behavior.SwipeDismissBehavior.OnDismissListener listener;
    private boolean sensitivitySet;
    androidx.customview.widget.ViewDragHelper viewDragHelper;
    private float sensitivity = 0.0f;
    int swipeDirection = 2;
    float dragDismissThreshold = 0.5f;
    float alphaStartSwipeDistance = 0.0f;
    float alphaEndSwipeDistance = 0.5f;
    private final androidx.customview.widget.ViewDragHelper.Callback dragCallback = new androidx.customview.widget.ViewDragHelper.Callback() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.1
        private static final int INVALID_POINTER_ID = -1;
        private int activePointerId = -1;
        private int originalCapturedViewLeft;

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(android.view.View view, int i) {
            int i2 = this.activePointerId;
            return (i2 == -1 || i2 == i) && com.google.android.material.behavior.SwipeDismissBehavior.this.canSwipeDismissView(view);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewCaptured(android.view.View view, int i) {
            this.activePointerId = i;
            this.originalCapturedViewLeft = view.getLeft();
            android.view.ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int i) {
            if (com.google.android.material.behavior.SwipeDismissBehavior.this.listener != null) {
                com.google.android.material.behavior.SwipeDismissBehavior.this.listener.onDragStateChanged(i);
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001d  */
        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewReleased(android.view.View view, float f, float f2) {
            int i;
            boolean z;
            this.activePointerId = -1;
            int width = view.getWidth();
            if (shouldDismiss(view, f)) {
                if (f >= 0.0f) {
                    int left = view.getLeft();
                    int i2 = this.originalCapturedViewLeft;
                    if (left < i2) {
                        i = this.originalCapturedViewLeft - width;
                    } else {
                        i = i2 + width;
                    }
                } else {
                    i = this.originalCapturedViewLeft - width;
                }
                z = true;
            } else {
                i = this.originalCapturedViewLeft;
                z = false;
            }
            if (com.google.android.material.behavior.SwipeDismissBehavior.this.viewDragHelper.settleCapturedViewAt(i, view.getTop())) {
                androidx.core.view.ViewCompat.postOnAnimation(view, new com.google.android.material.behavior.SwipeDismissBehavior.SettleRunnable(view, z));
            } else {
                if (!z || com.google.android.material.behavior.SwipeDismissBehavior.this.listener == null) {
                    return;
                }
                com.google.android.material.behavior.SwipeDismissBehavior.this.listener.onDismiss(view);
            }
        }

        private boolean shouldDismiss(android.view.View view, float f) {
            if (f == 0.0f) {
                return java.lang.Math.abs(view.getLeft() - this.originalCapturedViewLeft) >= java.lang.Math.round(((float) view.getWidth()) * com.google.android.material.behavior.SwipeDismissBehavior.this.dragDismissThreshold);
            }
            boolean z = androidx.core.view.ViewCompat.getLayoutDirection(view) == 1;
            if (com.google.android.material.behavior.SwipeDismissBehavior.this.swipeDirection == 2) {
                return true;
            }
            if (com.google.android.material.behavior.SwipeDismissBehavior.this.swipeDirection == 0) {
                if (z) {
                    if (f >= 0.0f) {
                        return false;
                    }
                } else if (f <= 0.0f) {
                    return false;
                }
                return true;
            }
            if (com.google.android.material.behavior.SwipeDismissBehavior.this.swipeDirection != 1) {
                return false;
            }
            if (z) {
                if (f <= 0.0f) {
                    return false;
                }
            } else if (f >= 0.0f) {
                return false;
            }
            return true;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int getViewHorizontalDragRange(android.view.View view) {
            return view.getWidth();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(android.view.View view, int i, int i2) {
            int width;
            int width2;
            int width3;
            boolean z = androidx.core.view.ViewCompat.getLayoutDirection(view) == 1;
            if (com.google.android.material.behavior.SwipeDismissBehavior.this.swipeDirection == 0) {
                if (z) {
                    width = this.originalCapturedViewLeft - view.getWidth();
                    width2 = this.originalCapturedViewLeft;
                } else {
                    width = this.originalCapturedViewLeft;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (com.google.android.material.behavior.SwipeDismissBehavior.this.swipeDirection != 1) {
                width = this.originalCapturedViewLeft - view.getWidth();
                width2 = view.getWidth() + this.originalCapturedViewLeft;
            } else if (z) {
                width = this.originalCapturedViewLeft;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.originalCapturedViewLeft - view.getWidth();
                width2 = this.originalCapturedViewLeft;
            }
            return com.google.android.material.behavior.SwipeDismissBehavior.clamp(width, i, width2);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(android.view.View view, int i, int i2) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewPositionChanged(android.view.View view, int i, int i2, int i3, int i4) {
            float width = this.originalCapturedViewLeft + (view.getWidth() * com.google.android.material.behavior.SwipeDismissBehavior.this.alphaStartSwipeDistance);
            float width2 = this.originalCapturedViewLeft + (view.getWidth() * com.google.android.material.behavior.SwipeDismissBehavior.this.alphaEndSwipeDistance);
            float f = i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(com.google.android.material.behavior.SwipeDismissBehavior.clamp(0.0f, 1.0f - com.google.android.material.behavior.SwipeDismissBehavior.fraction(width, width2, f), 1.0f));
            }
        }
    };

    public interface OnDismissListener {
        void onDismiss(android.view.View view);

        void onDragStateChanged(int i);
    }

    static float fraction(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    public boolean canSwipeDismissView(android.view.View view) {
        return true;
    }

    public void setListener(com.google.android.material.behavior.SwipeDismissBehavior.OnDismissListener onDismissListener) {
        this.listener = onDismissListener;
    }

    public com.google.android.material.behavior.SwipeDismissBehavior.OnDismissListener getListener() {
        return this.listener;
    }

    public void setSwipeDirection(int i) {
        this.swipeDirection = i;
    }

    public void setDragDismissDistance(float f) {
        this.dragDismissThreshold = clamp(0.0f, f, 1.0f);
    }

    public void setStartAlphaSwipeDistance(float f) {
        this.alphaStartSwipeDistance = clamp(0.0f, f, 1.0f);
    }

    public void setEndAlphaSwipeDistance(float f) {
        this.alphaEndSwipeDistance = clamp(0.0f, f, 1.0f);
    }

    public void setSensitivity(float f) {
        this.sensitivity = f;
        this.sensitivitySet = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, int i) {
        boolean zOnLayoutChild = super.onLayoutChild(coordinatorLayout, v, i);
        if (androidx.core.view.ViewCompat.getImportantForAccessibility(v) == 0) {
            androidx.core.view.ViewCompat.setImportantForAccessibility(v, 1);
            updateAccessibilityActions(v);
        }
        return zOnLayoutChild;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.MotionEvent motionEvent) {
        boolean zIsPointInChildBounds = this.interceptingEvents;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zIsPointInChildBounds = coordinatorLayout.isPointInChildBounds(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.interceptingEvents = zIsPointInChildBounds;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.interceptingEvents = false;
        }
        if (!zIsPointInChildBounds) {
            return false;
        }
        ensureViewDragHelper(coordinatorLayout);
        return this.viewDragHelper.shouldInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.MotionEvent motionEvent) {
        androidx.customview.widget.ViewDragHelper viewDragHelper = this.viewDragHelper;
        if (viewDragHelper == null) {
            return false;
        }
        viewDragHelper.processTouchEvent(motionEvent);
        return true;
    }

    private void ensureViewDragHelper(android.view.ViewGroup viewGroup) {
        androidx.customview.widget.ViewDragHelper viewDragHelperCreate;
        if (this.viewDragHelper == null) {
            if (this.sensitivitySet) {
                viewDragHelperCreate = androidx.customview.widget.ViewDragHelper.create(viewGroup, this.sensitivity, this.dragCallback);
            } else {
                viewDragHelperCreate = androidx.customview.widget.ViewDragHelper.create(viewGroup, this.dragCallback);
            }
            this.viewDragHelper = viewDragHelperCreate;
        }
    }

    private class SettleRunnable implements java.lang.Runnable {
        private final boolean dismiss;
        private final android.view.View view;

        SettleRunnable(android.view.View view, boolean z) {
            this.view = view;
            this.dismiss = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.google.android.material.behavior.SwipeDismissBehavior.this.viewDragHelper != null && com.google.android.material.behavior.SwipeDismissBehavior.this.viewDragHelper.continueSettling(true)) {
                androidx.core.view.ViewCompat.postOnAnimation(this.view, this);
            } else {
                if (!this.dismiss || com.google.android.material.behavior.SwipeDismissBehavior.this.listener == null) {
                    return;
                }
                com.google.android.material.behavior.SwipeDismissBehavior.this.listener.onDismiss(this.view);
            }
        }
    }

    private void updateAccessibilityActions(android.view.View view) {
        androidx.core.view.ViewCompat.removeAccessibilityAction(view, 1048576);
        if (canSwipeDismissView(view)) {
            androidx.core.view.ViewCompat.replaceAccessibilityAction(view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, null, new androidx.core.view.accessibility.AccessibilityViewCommand() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.2
                @Override // androidx.core.view.accessibility.AccessibilityViewCommand
                public boolean perform(android.view.View view2, androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments commandArguments) {
                    boolean z = false;
                    if (!com.google.android.material.behavior.SwipeDismissBehavior.this.canSwipeDismissView(view2)) {
                        return false;
                    }
                    boolean z2 = androidx.core.view.ViewCompat.getLayoutDirection(view2) == 1;
                    if ((com.google.android.material.behavior.SwipeDismissBehavior.this.swipeDirection == 0 && z2) || (com.google.android.material.behavior.SwipeDismissBehavior.this.swipeDirection == 1 && !z2)) {
                        z = true;
                    }
                    int width = view2.getWidth();
                    if (z) {
                        width = -width;
                    }
                    androidx.core.view.ViewCompat.offsetLeftAndRight(view2, width);
                    view2.setAlpha(0.0f);
                    if (com.google.android.material.behavior.SwipeDismissBehavior.this.listener != null) {
                        com.google.android.material.behavior.SwipeDismissBehavior.this.listener.onDismiss(view2);
                    }
                    return true;
                }
            });
        }
    }

    static float clamp(float f, float f2, float f3) {
        return java.lang.Math.min(java.lang.Math.max(f, f2), f3);
    }

    static int clamp(int i, int i2, int i3) {
        return java.lang.Math.min(java.lang.Math.max(i, i2), i3);
    }

    public int getDragState() {
        androidx.customview.widget.ViewDragHelper viewDragHelper = this.viewDragHelper;
        if (viewDragHelper != null) {
            return viewDragHelper.getViewDragState();
        }
        return 0;
    }
}
