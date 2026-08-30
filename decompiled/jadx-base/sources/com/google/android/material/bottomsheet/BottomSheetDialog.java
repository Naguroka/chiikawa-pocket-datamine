package com.google.android.material.bottomsheet;

/* JADX INFO: loaded from: classes5.dex */
public class BottomSheetDialog extends androidx.appcompat.app.AppCompatDialog {
    private com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout> behavior;
    private android.widget.FrameLayout bottomSheet;
    private com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback bottomSheetCallback;
    boolean cancelable;
    private boolean canceledOnTouchOutside;
    private boolean canceledOnTouchOutsideSet;
    private android.widget.FrameLayout container;
    private androidx.coordinatorlayout.widget.CoordinatorLayout coordinator;
    boolean dismissWithAnimation;
    private com.google.android.material.bottomsheet.BottomSheetDialog.EdgeToEdgeCallback edgeToEdgeCallback;
    private boolean edgeToEdgeEnabled;

    public BottomSheetDialog(android.content.Context context) {
        this(context, 0);
        this.edgeToEdgeEnabled = getContext().getTheme().obtainStyledAttributes(new int[]{com.google.android.material.R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    public BottomSheetDialog(android.content.Context context, int i) {
        super(context, getThemeResId(context, i));
        this.cancelable = true;
        this.canceledOnTouchOutside = true;
        this.bottomSheetCallback = new com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback() { // from class: com.google.android.material.bottomsheet.BottomSheetDialog.5
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onSlide(android.view.View view, float f) {
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onStateChanged(android.view.View view, int i2) {
                if (i2 == 5) {
                    com.google.android.material.bottomsheet.BottomSheetDialog.this.cancel();
                }
            }
        };
        supportRequestWindowFeature(1);
        this.edgeToEdgeEnabled = getContext().getTheme().obtainStyledAttributes(new int[]{com.google.android.material.R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    protected BottomSheetDialog(android.content.Context context, boolean z, android.content.DialogInterface.OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
        this.cancelable = true;
        this.canceledOnTouchOutside = true;
        this.bottomSheetCallback = new com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback() { // from class: com.google.android.material.bottomsheet.BottomSheetDialog.5
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onSlide(android.view.View view, float f) {
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onStateChanged(android.view.View view, int i2) {
                if (i2 == 5) {
                    com.google.android.material.bottomsheet.BottomSheetDialog.this.cancel();
                }
            }
        };
        supportRequestWindowFeature(1);
        this.cancelable = z;
        this.edgeToEdgeEnabled = getContext().getTheme().obtainStyledAttributes(new int[]{com.google.android.material.R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(int i) {
        super.setContentView(wrapInBottomSheet(i, null, null));
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(android.view.View view) {
        super.setContentView(wrapInBottomSheet(0, view, null));
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        super.setContentView(wrapInBottomSheet(0, view, layoutParams));
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.cancelable != z) {
            this.cancelable = z;
            com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout> bottomSheetBehavior = this.behavior;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setHideable(z);
            }
        }
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    protected void onStart() {
        super.onStart();
        com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout> bottomSheetBehavior = this.behavior;
        if (bottomSheetBehavior == null || bottomSheetBehavior.getState() != 5) {
            return;
        }
        this.behavior.setState(4);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        android.view.Window window = getWindow();
        if (window != null) {
            boolean z = this.edgeToEdgeEnabled && android.graphics.Color.alpha(window.getNavigationBarColor()) < 255;
            android.widget.FrameLayout frameLayout = this.container;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout = this.coordinator;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            androidx.core.view.WindowCompat.setDecorFitsSystemWindows(window, !z);
            com.google.android.material.bottomsheet.BottomSheetDialog.EdgeToEdgeCallback edgeToEdgeCallback = this.edgeToEdgeCallback;
            if (edgeToEdgeCallback != null) {
                edgeToEdgeCallback.setWindow(window);
            }
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        com.google.android.material.bottomsheet.BottomSheetDialog.EdgeToEdgeCallback edgeToEdgeCallback = this.edgeToEdgeCallback;
        if (edgeToEdgeCallback != null) {
            edgeToEdgeCallback.setWindow(null);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout> behavior = getBehavior();
        if (!this.dismissWithAnimation || behavior.getState() == 5) {
            super.cancel();
        } else {
            behavior.setState(5);
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.cancelable) {
            this.cancelable = true;
        }
        this.canceledOnTouchOutside = z;
        this.canceledOnTouchOutsideSet = true;
    }

    public com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout> getBehavior() {
        if (this.behavior == null) {
            ensureContainerAndBehavior();
        }
        return this.behavior;
    }

    public void setDismissWithAnimation(boolean z) {
        this.dismissWithAnimation = z;
    }

    public boolean getDismissWithAnimation() {
        return this.dismissWithAnimation;
    }

    public boolean getEdgeToEdgeEnabled() {
        return this.edgeToEdgeEnabled;
    }

    private android.widget.FrameLayout ensureContainerAndBehavior() {
        if (this.container == null) {
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) android.view.View.inflate(getContext(), com.google.android.material.R.layout.design_bottom_sheet_dialog, null);
            this.container = frameLayout;
            this.coordinator = (androidx.coordinatorlayout.widget.CoordinatorLayout) frameLayout.findViewById(com.google.android.material.R.id.coordinator);
            android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) this.container.findViewById(com.google.android.material.R.id.design_bottom_sheet);
            this.bottomSheet = frameLayout2;
            com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout> bottomSheetBehaviorFrom = com.google.android.material.bottomsheet.BottomSheetBehavior.from(frameLayout2);
            this.behavior = bottomSheetBehaviorFrom;
            bottomSheetBehaviorFrom.addBottomSheetCallback(this.bottomSheetCallback);
            this.behavior.setHideable(this.cancelable);
        }
        return this.container;
    }

    private android.view.View wrapInBottomSheet(int i, android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        ensureContainerAndBehavior();
        androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout = (androidx.coordinatorlayout.widget.CoordinatorLayout) this.container.findViewById(com.google.android.material.R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (android.view.ViewGroup) coordinatorLayout, false);
        }
        if (this.edgeToEdgeEnabled) {
            androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(this.bottomSheet, new androidx.core.view.OnApplyWindowInsetsListener() { // from class: com.google.android.material.bottomsheet.BottomSheetDialog.1
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View view2, androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
                    if (com.google.android.material.bottomsheet.BottomSheetDialog.this.edgeToEdgeCallback != null) {
                        com.google.android.material.bottomsheet.BottomSheetDialog.this.behavior.removeBottomSheetCallback(com.google.android.material.bottomsheet.BottomSheetDialog.this.edgeToEdgeCallback);
                    }
                    if (windowInsetsCompat != null) {
                        com.google.android.material.bottomsheet.BottomSheetDialog.this.edgeToEdgeCallback = new com.google.android.material.bottomsheet.BottomSheetDialog.EdgeToEdgeCallback(com.google.android.material.bottomsheet.BottomSheetDialog.this.bottomSheet, windowInsetsCompat);
                        com.google.android.material.bottomsheet.BottomSheetDialog.this.edgeToEdgeCallback.setWindow(com.google.android.material.bottomsheet.BottomSheetDialog.this.getWindow());
                        com.google.android.material.bottomsheet.BottomSheetDialog.this.behavior.addBottomSheetCallback(com.google.android.material.bottomsheet.BottomSheetDialog.this.edgeToEdgeCallback);
                    }
                    return windowInsetsCompat;
                }
            });
        }
        this.bottomSheet.removeAllViews();
        if (layoutParams == null) {
            this.bottomSheet.addView(view);
        } else {
            this.bottomSheet.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(com.google.android.material.R.id.touch_outside).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.material.bottomsheet.BottomSheetDialog.2
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view2) {
                if (com.google.android.material.bottomsheet.BottomSheetDialog.this.cancelable && com.google.android.material.bottomsheet.BottomSheetDialog.this.isShowing() && com.google.android.material.bottomsheet.BottomSheetDialog.this.shouldWindowCloseOnTouchOutside()) {
                    com.google.android.material.bottomsheet.BottomSheetDialog.this.cancel();
                }
            }
        });
        androidx.core.view.ViewCompat.setAccessibilityDelegate(this.bottomSheet, new androidx.core.view.AccessibilityDelegateCompat() { // from class: com.google.android.material.bottomsheet.BottomSheetDialog.3
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(android.view.View view2, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                if (com.google.android.material.bottomsheet.BottomSheetDialog.this.cancelable) {
                    accessibilityNodeInfoCompat.addAction(1048576);
                    accessibilityNodeInfoCompat.setDismissable(true);
                } else {
                    accessibilityNodeInfoCompat.setDismissable(false);
                }
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public boolean performAccessibilityAction(android.view.View view2, int i2, android.os.Bundle bundle) {
                if (i2 == 1048576 && com.google.android.material.bottomsheet.BottomSheetDialog.this.cancelable) {
                    com.google.android.material.bottomsheet.BottomSheetDialog.this.cancel();
                    return true;
                }
                return super.performAccessibilityAction(view2, i2, bundle);
            }
        });
        this.bottomSheet.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.google.android.material.bottomsheet.BottomSheetDialog.4
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(android.view.View view2, android.view.MotionEvent motionEvent) {
                return true;
            }
        });
        return this.container;
    }

    boolean shouldWindowCloseOnTouchOutside() {
        if (!this.canceledOnTouchOutsideSet) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{android.R.attr.windowCloseOnTouchOutside});
            this.canceledOnTouchOutside = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
            this.canceledOnTouchOutsideSet = true;
        }
        return this.canceledOnTouchOutside;
    }

    private static int getThemeResId(android.content.Context context, int i) {
        if (i != 0) {
            return i;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (context.getTheme().resolveAttribute(com.google.android.material.R.attr.bottomSheetDialogTheme, typedValue, true)) {
            return typedValue.resourceId;
        }
        return com.google.android.material.R.style.Theme_Design_Light_BottomSheetDialog;
    }

    void removeDefaultCallback() {
        this.behavior.removeBottomSheetCallback(this.bottomSheetCallback);
    }

    private static class EdgeToEdgeCallback extends com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback {
        private final androidx.core.view.WindowInsetsCompat insetsCompat;
        private final java.lang.Boolean lightBottomSheet;
        private boolean lightStatusBar;
        private android.view.Window window;

        private EdgeToEdgeCallback(android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
            android.content.res.ColorStateList backgroundTintList;
            this.insetsCompat = windowInsetsCompat;
            com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable = com.google.android.material.bottomsheet.BottomSheetBehavior.from(view).getMaterialShapeDrawable();
            if (materialShapeDrawable != null) {
                backgroundTintList = materialShapeDrawable.getFillColor();
            } else {
                backgroundTintList = androidx.core.view.ViewCompat.getBackgroundTintList(view);
            }
            if (backgroundTintList != null) {
                this.lightBottomSheet = java.lang.Boolean.valueOf(com.google.android.material.color.MaterialColors.isColorLight(backgroundTintList.getDefaultColor()));
            } else if (view.getBackground() instanceof android.graphics.drawable.ColorDrawable) {
                this.lightBottomSheet = java.lang.Boolean.valueOf(com.google.android.material.color.MaterialColors.isColorLight(((android.graphics.drawable.ColorDrawable) view.getBackground()).getColor()));
            } else {
                this.lightBottomSheet = null;
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(android.view.View view, int i) {
            setPaddingForPosition(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(android.view.View view, float f) {
            setPaddingForPosition(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        void onLayout(android.view.View view) {
            setPaddingForPosition(view);
        }

        void setWindow(android.view.Window window) {
            if (this.window == window) {
                return;
            }
            this.window = window;
            if (window != null) {
                this.lightStatusBar = androidx.core.view.WindowCompat.getInsetsController(window, window.getDecorView()).isAppearanceLightStatusBars();
            }
        }

        private void setPaddingForPosition(android.view.View view) {
            if (view.getTop() < this.insetsCompat.getSystemWindowInsetTop()) {
                android.view.Window window = this.window;
                if (window != null) {
                    java.lang.Boolean bool = this.lightBottomSheet;
                    com.google.android.material.internal.EdgeToEdgeUtils.setLightStatusBar(window, bool == null ? this.lightStatusBar : bool.booleanValue());
                }
                view.setPadding(view.getPaddingLeft(), this.insetsCompat.getSystemWindowInsetTop() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
                return;
            }
            if (view.getTop() != 0) {
                android.view.Window window2 = this.window;
                if (window2 != null) {
                    com.google.android.material.internal.EdgeToEdgeUtils.setLightStatusBar(window2, this.lightStatusBar);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }
    }

    @java.lang.Deprecated
    public static void setLightStatusBar(android.view.View view, boolean z) {
        int systemUiVisibility = view.getSystemUiVisibility();
        view.setSystemUiVisibility(z ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
    }
}
