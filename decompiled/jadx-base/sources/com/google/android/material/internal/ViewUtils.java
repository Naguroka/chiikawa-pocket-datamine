package com.google.android.material.internal;

/* JADX INFO: loaded from: classes5.dex */
public class ViewUtils {

    public interface OnApplyWindowInsetsListener {
        androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat, com.google.android.material.internal.ViewUtils.RelativePadding relativePadding);
    }

    private ViewUtils() {
    }

    public static android.graphics.PorterDuff.Mode parseTintMode(int i, android.graphics.PorterDuff.Mode mode) {
        if (i == 3) {
            return android.graphics.PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return android.graphics.PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return android.graphics.PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return android.graphics.PorterDuff.Mode.MULTIPLY;
            case 15:
                return android.graphics.PorterDuff.Mode.SCREEN;
            case 16:
                return android.graphics.PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static boolean isLayoutRtl(android.view.View view) {
        return androidx.core.view.ViewCompat.getLayoutDirection(view) == 1;
    }

    public static float dpToPx(android.content.Context context, int i) {
        return android.util.TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static void requestFocusAndShowKeyboard(final android.view.View view) {
        view.requestFocus();
        view.post(new java.lang.Runnable() { // from class: com.google.android.material.internal.ViewUtils.1
            @Override // java.lang.Runnable
            public void run() {
                ((android.view.inputmethod.InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
            }
        });
    }

    public static void hideKeyboard(android.view.View view) {
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) androidx.core.content.ContextCompat.getSystemService(view.getContext(), android.view.inputmethod.InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static class RelativePadding {
        public int bottom;
        public int end;
        public int start;
        public int top;

        public RelativePadding(int i, int i2, int i3, int i4) {
            this.start = i;
            this.top = i2;
            this.end = i3;
            this.bottom = i4;
        }

        public RelativePadding(com.google.android.material.internal.ViewUtils.RelativePadding relativePadding) {
            this.start = relativePadding.start;
            this.top = relativePadding.top;
            this.end = relativePadding.end;
            this.bottom = relativePadding.bottom;
        }

        public void applyToView(android.view.View view) {
            androidx.core.view.ViewCompat.setPaddingRelative(view, this.start, this.top, this.end, this.bottom);
        }
    }

    public static void doOnApplyWindowInsets(android.view.View view, android.util.AttributeSet attributeSet, int i, int i2) {
        doOnApplyWindowInsets(view, attributeSet, i, i2, null);
    }

    public static void doOnApplyWindowInsets(android.view.View view, android.util.AttributeSet attributeSet, int i, int i2, final com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.Insets, i, i2);
        final boolean z = typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Insets_paddingBottomSystemWindowInsets, false);
        final boolean z2 = typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Insets_paddingLeftSystemWindowInsets, false);
        final boolean z3 = typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Insets_paddingRightSystemWindowInsets, false);
        typedArrayObtainStyledAttributes.recycle();
        doOnApplyWindowInsets(view, new com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.internal.ViewUtils.2
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            public androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View view2, androidx.core.view.WindowInsetsCompat windowInsetsCompat, com.google.android.material.internal.ViewUtils.RelativePadding relativePadding) {
                if (z) {
                    relativePadding.bottom += windowInsetsCompat.getSystemWindowInsetBottom();
                }
                boolean zIsLayoutRtl = com.google.android.material.internal.ViewUtils.isLayoutRtl(view2);
                if (z2) {
                    if (zIsLayoutRtl) {
                        relativePadding.end += windowInsetsCompat.getSystemWindowInsetLeft();
                    } else {
                        relativePadding.start += windowInsetsCompat.getSystemWindowInsetLeft();
                    }
                }
                if (z3) {
                    if (zIsLayoutRtl) {
                        relativePadding.start += windowInsetsCompat.getSystemWindowInsetRight();
                    } else {
                        relativePadding.end += windowInsetsCompat.getSystemWindowInsetRight();
                    }
                }
                relativePadding.applyToView(view2);
                com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener onApplyWindowInsetsListener2 = onApplyWindowInsetsListener;
                return onApplyWindowInsetsListener2 != null ? onApplyWindowInsetsListener2.onApplyWindowInsets(view2, windowInsetsCompat, relativePadding) : windowInsetsCompat;
            }
        });
    }

    public static void doOnApplyWindowInsets(android.view.View view, final com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        final com.google.android.material.internal.ViewUtils.RelativePadding relativePadding = new com.google.android.material.internal.ViewUtils.RelativePadding(androidx.core.view.ViewCompat.getPaddingStart(view), view.getPaddingTop(), androidx.core.view.ViewCompat.getPaddingEnd(view), view.getPaddingBottom());
        androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(view, new androidx.core.view.OnApplyWindowInsetsListener() { // from class: com.google.android.material.internal.ViewUtils.3
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View view2, androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
                return onApplyWindowInsetsListener.onApplyWindowInsets(view2, windowInsetsCompat, new com.google.android.material.internal.ViewUtils.RelativePadding(relativePadding));
            }
        });
        requestApplyInsetsWhenAttached(view);
    }

    public static void requestApplyInsetsWhenAttached(android.view.View view) {
        if (androidx.core.view.ViewCompat.isAttachedToWindow(view)) {
            androidx.core.view.ViewCompat.requestApplyInsets(view);
        } else {
            view.addOnAttachStateChangeListener(new android.view.View.OnAttachStateChangeListener() { // from class: com.google.android.material.internal.ViewUtils.4
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(android.view.View view2) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(android.view.View view2) {
                    view2.removeOnAttachStateChangeListener(this);
                    androidx.core.view.ViewCompat.requestApplyInsets(view2);
                }
            });
        }
    }

    public static float getParentAbsoluteElevation(android.view.View view) {
        float elevation = 0.0f;
        for (android.view.ViewParent parent = view.getParent(); parent instanceof android.view.View; parent = parent.getParent()) {
            elevation += androidx.core.view.ViewCompat.getElevation((android.view.View) parent);
        }
        return elevation;
    }

    public static com.google.android.material.internal.ViewOverlayImpl getOverlay(android.view.View view) {
        if (view == null) {
            return null;
        }
        return new com.google.android.material.internal.ViewOverlayApi18(view);
    }

    public static android.view.ViewGroup getContentView(android.view.View view) {
        if (view == null) {
            return null;
        }
        android.view.View rootView = view.getRootView();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) rootView.findViewById(android.R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof android.view.ViewGroup)) {
            return null;
        }
        return (android.view.ViewGroup) rootView;
    }

    public static com.google.android.material.internal.ViewOverlayImpl getContentViewOverlay(android.view.View view) {
        return getOverlay(getContentView(view));
    }

    public static void addOnGlobalLayoutListener(android.view.View view, android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static void removeOnGlobalLayoutListener(android.view.View view, android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            removeOnGlobalLayoutListener(view.getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    public static void removeOnGlobalLayoutListener(android.view.ViewTreeObserver viewTreeObserver, android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static java.lang.Integer getBackgroundColor(android.view.View view) {
        if (view.getBackground() instanceof android.graphics.drawable.ColorDrawable) {
            return java.lang.Integer.valueOf(((android.graphics.drawable.ColorDrawable) view.getBackground()).getColor());
        }
        return null;
    }
}
