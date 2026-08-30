package com.google.android.material.internal;

/* JADX INFO: loaded from: classes5.dex */
public class ToolbarUtils {
    private static final java.util.Comparator<android.view.View> VIEW_TOP_COMPARATOR = new java.util.Comparator<android.view.View>() { // from class: com.google.android.material.internal.ToolbarUtils.1
        @Override // java.util.Comparator
        public int compare(android.view.View view, android.view.View view2) {
            return view.getTop() - view2.getTop();
        }
    };

    private ToolbarUtils() {
    }

    public static android.widget.TextView getTitleTextView(androidx.appcompat.widget.Toolbar toolbar) {
        java.util.List<android.widget.TextView> textViewsWithText = getTextViewsWithText(toolbar, toolbar.getTitle());
        if (textViewsWithText.isEmpty()) {
            return null;
        }
        return (android.widget.TextView) java.util.Collections.min(textViewsWithText, VIEW_TOP_COMPARATOR);
    }

    public static android.widget.TextView getSubtitleTextView(androidx.appcompat.widget.Toolbar toolbar) {
        java.util.List<android.widget.TextView> textViewsWithText = getTextViewsWithText(toolbar, toolbar.getSubtitle());
        if (textViewsWithText.isEmpty()) {
            return null;
        }
        return (android.widget.TextView) java.util.Collections.max(textViewsWithText, VIEW_TOP_COMPARATOR);
    }

    private static java.util.List<android.widget.TextView> getTextViewsWithText(androidx.appcompat.widget.Toolbar toolbar, java.lang.CharSequence charSequence) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            android.view.View childAt = toolbar.getChildAt(i);
            if (childAt instanceof android.widget.TextView) {
                android.widget.TextView textView = (android.widget.TextView) childAt;
                if (android.text.TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static android.widget.ImageView getLogoImageView(androidx.appcompat.widget.Toolbar toolbar) {
        return getImageView(toolbar, toolbar.getLogo());
    }

    private static android.widget.ImageView getImageView(androidx.appcompat.widget.Toolbar toolbar, android.graphics.drawable.Drawable drawable) {
        android.widget.ImageView imageView;
        android.graphics.drawable.Drawable drawable2;
        if (drawable == null) {
            return null;
        }
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            android.view.View childAt = toolbar.getChildAt(i);
            if ((childAt instanceof android.widget.ImageView) && (drawable2 = (imageView = (android.widget.ImageView) childAt).getDrawable()) != null && drawable2.getConstantState() != null && drawable2.getConstantState().equals(drawable.getConstantState())) {
                return imageView;
            }
        }
        return null;
    }

    public static android.view.View getSecondaryActionMenuItemView(androidx.appcompat.widget.Toolbar toolbar) {
        androidx.appcompat.widget.ActionMenuView actionMenuView = getActionMenuView(toolbar);
        if (actionMenuView == null || actionMenuView.getChildCount() <= 1) {
            return null;
        }
        return actionMenuView.getChildAt(0);
    }

    public static androidx.appcompat.widget.ActionMenuView getActionMenuView(androidx.appcompat.widget.Toolbar toolbar) {
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            android.view.View childAt = toolbar.getChildAt(i);
            if (childAt instanceof androidx.appcompat.widget.ActionMenuView) {
                return (androidx.appcompat.widget.ActionMenuView) childAt;
            }
        }
        return null;
    }

    public static android.widget.ImageButton getNavigationIconButton(androidx.appcompat.widget.Toolbar toolbar) {
        android.graphics.drawable.Drawable navigationIcon = toolbar.getNavigationIcon();
        if (navigationIcon == null) {
            return null;
        }
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            android.view.View childAt = toolbar.getChildAt(i);
            if (childAt instanceof android.widget.ImageButton) {
                android.widget.ImageButton imageButton = (android.widget.ImageButton) childAt;
                if (imageButton.getDrawable() == navigationIcon) {
                    return imageButton;
                }
            }
        }
        return null;
    }

    public static androidx.appcompat.view.menu.ActionMenuItemView getActionMenuItemView(androidx.appcompat.widget.Toolbar toolbar, int i) {
        androidx.appcompat.widget.ActionMenuView actionMenuView = getActionMenuView(toolbar);
        if (actionMenuView == null) {
            return null;
        }
        for (int i2 = 0; i2 < actionMenuView.getChildCount(); i2++) {
            android.view.View childAt = actionMenuView.getChildAt(i2);
            if (childAt instanceof androidx.appcompat.view.menu.ActionMenuItemView) {
                androidx.appcompat.view.menu.ActionMenuItemView actionMenuItemView = (androidx.appcompat.view.menu.ActionMenuItemView) childAt;
                if (actionMenuItemView.getItemData().getItemId() == i) {
                    return actionMenuItemView;
                }
            }
        }
        return null;
    }
}
