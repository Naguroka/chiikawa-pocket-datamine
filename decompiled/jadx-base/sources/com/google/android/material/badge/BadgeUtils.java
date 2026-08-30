package com.google.android.material.badge;

/* JADX INFO: loaded from: classes5.dex */
public class BadgeUtils {
    private static final java.lang.String LOG_TAG = "BadgeUtils";
    public static final boolean USE_COMPAT_PARENT = false;

    private BadgeUtils() {
    }

    public static void updateBadgeBounds(android.graphics.Rect rect, float f, float f2, float f3, float f4) {
        rect.set((int) (f - f3), (int) (f2 - f4), (int) (f + f3), (int) (f2 + f4));
    }

    public static void attachBadgeDrawable(com.google.android.material.badge.BadgeDrawable badgeDrawable, android.view.View view) {
        attachBadgeDrawable(badgeDrawable, view, (android.widget.FrameLayout) null);
    }

    public static void attachBadgeDrawable(com.google.android.material.badge.BadgeDrawable badgeDrawable, android.view.View view, android.widget.FrameLayout frameLayout) {
        setBadgeDrawableBounds(badgeDrawable, view, frameLayout);
        if (badgeDrawable.getCustomBadgeParent() != null) {
            badgeDrawable.getCustomBadgeParent().setForeground(badgeDrawable);
        } else {
            if (USE_COMPAT_PARENT) {
                throw new java.lang.IllegalArgumentException("Trying to reference null customBadgeParent");
            }
            view.getOverlay().add(badgeDrawable);
        }
    }

    public static void attachBadgeDrawable(com.google.android.material.badge.BadgeDrawable badgeDrawable, androidx.appcompat.widget.Toolbar toolbar, int i) {
        attachBadgeDrawable(badgeDrawable, toolbar, i, null);
    }

    public static void attachBadgeDrawable(final com.google.android.material.badge.BadgeDrawable badgeDrawable, final androidx.appcompat.widget.Toolbar toolbar, final int i, final android.widget.FrameLayout frameLayout) {
        toolbar.post(new java.lang.Runnable() { // from class: com.google.android.material.badge.BadgeUtils.1
            @Override // java.lang.Runnable
            public void run() {
                androidx.appcompat.view.menu.ActionMenuItemView actionMenuItemView = com.google.android.material.internal.ToolbarUtils.getActionMenuItemView(toolbar, i);
                if (actionMenuItemView != null) {
                    com.google.android.material.badge.BadgeUtils.setToolbarOffset(badgeDrawable, toolbar.getResources());
                    com.google.android.material.badge.BadgeUtils.attachBadgeDrawable(badgeDrawable, actionMenuItemView, frameLayout);
                    com.google.android.material.badge.BadgeUtils.attachBadgeContentDescription(badgeDrawable, actionMenuItemView);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void attachBadgeContentDescription(final com.google.android.material.badge.BadgeDrawable badgeDrawable, android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 29 && androidx.core.view.ViewCompat.hasAccessibilityDelegate(view)) {
            androidx.core.view.ViewCompat.setAccessibilityDelegate(view, new androidx.core.view.AccessibilityDelegateCompat(view.getAccessibilityDelegate()) { // from class: com.google.android.material.badge.BadgeUtils.2
                @Override // androidx.core.view.AccessibilityDelegateCompat
                public void onInitializeAccessibilityNodeInfo(android.view.View view2, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                    accessibilityNodeInfoCompat.setContentDescription(badgeDrawable.getContentDescription());
                }
            });
        } else {
            androidx.core.view.ViewCompat.setAccessibilityDelegate(view, new androidx.core.view.AccessibilityDelegateCompat() { // from class: com.google.android.material.badge.BadgeUtils.3
                @Override // androidx.core.view.AccessibilityDelegateCompat
                public void onInitializeAccessibilityNodeInfo(android.view.View view2, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                    accessibilityNodeInfoCompat.setContentDescription(badgeDrawable.getContentDescription());
                }
            });
        }
    }

    public static void detachBadgeDrawable(com.google.android.material.badge.BadgeDrawable badgeDrawable, android.view.View view) {
        if (badgeDrawable == null) {
            return;
        }
        if (USE_COMPAT_PARENT || badgeDrawable.getCustomBadgeParent() != null) {
            badgeDrawable.getCustomBadgeParent().setForeground(null);
        } else {
            view.getOverlay().remove(badgeDrawable);
        }
    }

    public static void detachBadgeDrawable(com.google.android.material.badge.BadgeDrawable badgeDrawable, androidx.appcompat.widget.Toolbar toolbar, int i) {
        if (badgeDrawable == null) {
            return;
        }
        androidx.appcompat.view.menu.ActionMenuItemView actionMenuItemView = com.google.android.material.internal.ToolbarUtils.getActionMenuItemView(toolbar, i);
        if (actionMenuItemView != null) {
            removeToolbarOffset(badgeDrawable);
            detachBadgeDrawable(badgeDrawable, actionMenuItemView);
            detachBadgeContentDescription(actionMenuItemView);
            return;
        }
        android.util.Log.w(LOG_TAG, "Trying to remove badge from a null menuItemView: " + i);
    }

    private static void detachBadgeContentDescription(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 29 && androidx.core.view.ViewCompat.hasAccessibilityDelegate(view)) {
            androidx.core.view.ViewCompat.setAccessibilityDelegate(view, new androidx.core.view.AccessibilityDelegateCompat(view.getAccessibilityDelegate()) { // from class: com.google.android.material.badge.BadgeUtils.4
                @Override // androidx.core.view.AccessibilityDelegateCompat
                public void onInitializeAccessibilityNodeInfo(android.view.View view2, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                    accessibilityNodeInfoCompat.setContentDescription(null);
                }
            });
        } else {
            androidx.core.view.ViewCompat.setAccessibilityDelegate(view, null);
        }
    }

    static void setToolbarOffset(com.google.android.material.badge.BadgeDrawable badgeDrawable, android.content.res.Resources resources) {
        badgeDrawable.setAdditionalHorizontalOffset(resources.getDimensionPixelOffset(com.google.android.material.R.dimen.mtrl_badge_toolbar_action_menu_item_horizontal_offset));
        badgeDrawable.setAdditionalVerticalOffset(resources.getDimensionPixelOffset(com.google.android.material.R.dimen.mtrl_badge_toolbar_action_menu_item_vertical_offset));
    }

    static void removeToolbarOffset(com.google.android.material.badge.BadgeDrawable badgeDrawable) {
        badgeDrawable.setAdditionalHorizontalOffset(0);
        badgeDrawable.setAdditionalVerticalOffset(0);
    }

    public static void setBadgeDrawableBounds(com.google.android.material.badge.BadgeDrawable badgeDrawable, android.view.View view, android.widget.FrameLayout frameLayout) {
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getDrawingRect(rect);
        badgeDrawable.setBounds(rect);
        badgeDrawable.updateBadgeCoordinates(view, frameLayout);
    }

    public static com.google.android.material.internal.ParcelableSparseArray createParcelableBadgeStates(android.util.SparseArray<com.google.android.material.badge.BadgeDrawable> sparseArray) {
        com.google.android.material.internal.ParcelableSparseArray parcelableSparseArray = new com.google.android.material.internal.ParcelableSparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            int iKeyAt = sparseArray.keyAt(i);
            com.google.android.material.badge.BadgeDrawable badgeDrawableValueAt = sparseArray.valueAt(i);
            if (badgeDrawableValueAt == null) {
                throw new java.lang.IllegalArgumentException("badgeDrawable cannot be null");
            }
            parcelableSparseArray.put(iKeyAt, badgeDrawableValueAt.getSavedState());
        }
        return parcelableSparseArray;
    }

    public static android.util.SparseArray<com.google.android.material.badge.BadgeDrawable> createBadgeDrawablesFromSavedStates(android.content.Context context, com.google.android.material.internal.ParcelableSparseArray parcelableSparseArray) {
        android.util.SparseArray<com.google.android.material.badge.BadgeDrawable> sparseArray = new android.util.SparseArray<>(parcelableSparseArray.size());
        for (int i = 0; i < parcelableSparseArray.size(); i++) {
            int iKeyAt = parcelableSparseArray.keyAt(i);
            com.google.android.material.badge.BadgeState.State state = (com.google.android.material.badge.BadgeState.State) parcelableSparseArray.valueAt(i);
            if (state == null) {
                throw new java.lang.IllegalArgumentException("BadgeDrawable's savedState cannot be null");
            }
            sparseArray.put(iKeyAt, com.google.android.material.badge.BadgeDrawable.createFromSavedState(context, state));
        }
        return sparseArray;
    }
}
