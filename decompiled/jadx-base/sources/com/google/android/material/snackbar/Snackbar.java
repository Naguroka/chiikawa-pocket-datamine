package com.google.android.material.snackbar;

/* JADX INFO: loaded from: classes5.dex */
public class Snackbar extends com.google.android.material.snackbar.BaseTransientBottomBar<com.google.android.material.snackbar.Snackbar> {
    private static final int[] SNACKBAR_BUTTON_STYLE_ATTR = {com.google.android.material.R.attr.snackbarButtonStyle};
    private static final int[] SNACKBAR_CONTENT_STYLE_ATTRS = {com.google.android.material.R.attr.snackbarButtonStyle, com.google.android.material.R.attr.snackbarTextViewStyle};
    private final android.view.accessibility.AccessibilityManager accessibilityManager;
    private com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback<com.google.android.material.snackbar.Snackbar> callback;
    private boolean hasAction;

    public static class Callback extends com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback<com.google.android.material.snackbar.Snackbar> {
        public static final int DISMISS_EVENT_ACTION = 1;
        public static final int DISMISS_EVENT_CONSECUTIVE = 4;
        public static final int DISMISS_EVENT_MANUAL = 3;
        public static final int DISMISS_EVENT_SWIPE = 0;
        public static final int DISMISS_EVENT_TIMEOUT = 2;

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback
        public void onDismissed(com.google.android.material.snackbar.Snackbar snackbar, int i) {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback
        public void onShown(com.google.android.material.snackbar.Snackbar snackbar) {
        }
    }

    private Snackbar(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view, com.google.android.material.snackbar.ContentViewCallback contentViewCallback) {
        super(context, viewGroup, view, contentViewCallback);
        this.accessibilityManager = (android.view.accessibility.AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void show() {
        super.show();
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void dismiss() {
        super.dismiss();
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public boolean isShown() {
        return super.isShown();
    }

    public static com.google.android.material.snackbar.Snackbar make(android.view.View view, java.lang.CharSequence charSequence, int i) {
        return makeInternal(null, view, charSequence, i);
    }

    public static com.google.android.material.snackbar.Snackbar make(android.content.Context context, android.view.View view, java.lang.CharSequence charSequence, int i) {
        return makeInternal(context, view, charSequence, i);
    }

    private static com.google.android.material.snackbar.Snackbar makeInternal(android.content.Context context, android.view.View view, java.lang.CharSequence charSequence, int i) {
        int i2;
        android.view.ViewGroup viewGroupFindSuitableParent = findSuitableParent(view);
        if (viewGroupFindSuitableParent == null) {
            throw new java.lang.IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        if (context == null) {
            context = viewGroupFindSuitableParent.getContext();
        }
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(context);
        if (hasSnackbarContentStyleAttrs(context)) {
            i2 = com.google.android.material.R.layout.mtrl_layout_snackbar_include;
        } else {
            i2 = com.google.android.material.R.layout.design_layout_snackbar_include;
        }
        com.google.android.material.snackbar.SnackbarContentLayout snackbarContentLayout = (com.google.android.material.snackbar.SnackbarContentLayout) layoutInflaterFrom.inflate(i2, viewGroupFindSuitableParent, false);
        com.google.android.material.snackbar.Snackbar snackbar = new com.google.android.material.snackbar.Snackbar(context, viewGroupFindSuitableParent, snackbarContentLayout, snackbarContentLayout);
        snackbar.setText(charSequence);
        snackbar.setDuration(i);
        return snackbar;
    }

    @java.lang.Deprecated
    protected static boolean hasSnackbarButtonStyleAttr(android.content.Context context) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(SNACKBAR_BUTTON_STYLE_ATTR);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    private static boolean hasSnackbarContentStyleAttrs(android.content.Context context) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(SNACKBAR_CONTENT_STYLE_ATTRS);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        return (resourceId == -1 || resourceId2 == -1) ? false : true;
    }

    public static com.google.android.material.snackbar.Snackbar make(android.view.View view, int i, int i2) {
        return make(view, view.getResources().getText(i), i2);
    }

    private static android.view.ViewGroup findSuitableParent(android.view.View view) {
        android.view.ViewGroup viewGroup = null;
        while (!(view instanceof androidx.coordinatorlayout.widget.CoordinatorLayout)) {
            if (view instanceof android.widget.FrameLayout) {
                if (view.getId() == 16908290) {
                    return (android.view.ViewGroup) view;
                }
                viewGroup = (android.view.ViewGroup) view;
            }
            if (view != null) {
                java.lang.Object parent = view.getParent();
                view = parent instanceof android.view.View ? (android.view.View) parent : null;
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (android.view.ViewGroup) view;
    }

    public com.google.android.material.snackbar.Snackbar setText(java.lang.CharSequence charSequence) {
        getMessageView().setText(charSequence);
        return this;
    }

    public com.google.android.material.snackbar.Snackbar setText(int i) {
        return setText(getContext().getText(i));
    }

    public com.google.android.material.snackbar.Snackbar setAction(int i, android.view.View.OnClickListener onClickListener) {
        return setAction(getContext().getText(i), onClickListener);
    }

    public com.google.android.material.snackbar.Snackbar setAction(java.lang.CharSequence charSequence, final android.view.View.OnClickListener onClickListener) {
        android.widget.Button actionView = getActionView();
        if (android.text.TextUtils.isEmpty(charSequence) || onClickListener == null) {
            actionView.setVisibility(8);
            actionView.setOnClickListener(null);
            this.hasAction = false;
        } else {
            this.hasAction = true;
            actionView.setVisibility(0);
            actionView.setText(charSequence);
            actionView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.material.snackbar.Snackbar$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    this.f$0.m774lambda$setAction$0$comgoogleandroidmaterialsnackbarSnackbar(onClickListener, view);
                }
            });
        }
        return this;
    }

    /* JADX INFO: renamed from: lambda$setAction$0$com-google-android-material-snackbar-Snackbar, reason: not valid java name */
    /* synthetic */ void m774lambda$setAction$0$comgoogleandroidmaterialsnackbarSnackbar(android.view.View.OnClickListener onClickListener, android.view.View view) {
        onClickListener.onClick(view);
        dispatchDismiss(1);
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public int getDuration() {
        int duration = super.getDuration();
        if (duration == -2) {
            return -2;
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return this.accessibilityManager.getRecommendedTimeoutMillis(duration, (this.hasAction ? 4 : 0) | 1 | 2);
        }
        if (this.hasAction && this.accessibilityManager.isTouchExplorationEnabled()) {
            return -2;
        }
        return duration;
    }

    public com.google.android.material.snackbar.Snackbar setTextColor(android.content.res.ColorStateList colorStateList) {
        getMessageView().setTextColor(colorStateList);
        return this;
    }

    public com.google.android.material.snackbar.Snackbar setTextColor(int i) {
        getMessageView().setTextColor(i);
        return this;
    }

    public com.google.android.material.snackbar.Snackbar setTextMaxLines(int i) {
        getMessageView().setMaxLines(i);
        return this;
    }

    public com.google.android.material.snackbar.Snackbar setActionTextColor(android.content.res.ColorStateList colorStateList) {
        getActionView().setTextColor(colorStateList);
        return this;
    }

    public com.google.android.material.snackbar.Snackbar setMaxInlineActionWidth(int i) {
        getContentLayout().setMaxInlineActionWidth(i);
        return this;
    }

    public com.google.android.material.snackbar.Snackbar setActionTextColor(int i) {
        getActionView().setTextColor(i);
        return this;
    }

    public com.google.android.material.snackbar.Snackbar setBackgroundTint(int i) {
        return setBackgroundTintList(android.content.res.ColorStateList.valueOf(i));
    }

    public com.google.android.material.snackbar.Snackbar setBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        this.view.setBackgroundTintList(colorStateList);
        return this;
    }

    public com.google.android.material.snackbar.Snackbar setBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        this.view.setBackgroundTintMode(mode);
        return this;
    }

    @java.lang.Deprecated
    public com.google.android.material.snackbar.Snackbar setCallback(com.google.android.material.snackbar.Snackbar.Callback callback) {
        com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback<com.google.android.material.snackbar.Snackbar> baseCallback = this.callback;
        if (baseCallback != null) {
            removeCallback(baseCallback);
        }
        if (callback != null) {
            addCallback(callback);
        }
        this.callback = callback;
        return this;
    }

    public static final class SnackbarLayout extends com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout {
        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(android.graphics.drawable.Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(android.content.res.ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(android.view.View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }

        public SnackbarLayout(android.content.Context context) {
            super(context);
        }

        public SnackbarLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                android.view.View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }
    }

    private android.widget.TextView getMessageView() {
        return getContentLayout().getMessageView();
    }

    private android.widget.Button getActionView() {
        return getContentLayout().getActionView();
    }

    private com.google.android.material.snackbar.SnackbarContentLayout getContentLayout() {
        return (com.google.android.material.snackbar.SnackbarContentLayout) this.view.getChildAt(0);
    }
}
