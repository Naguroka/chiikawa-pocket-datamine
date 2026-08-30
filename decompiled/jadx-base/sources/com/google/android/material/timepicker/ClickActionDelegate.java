package com.google.android.material.timepicker;

/* JADX INFO: loaded from: classes5.dex */
class ClickActionDelegate extends androidx.core.view.AccessibilityDelegateCompat {
    private final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat clickAction;

    public ClickActionDelegate(android.content.Context context, int i) {
        this.clickAction = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, context.getString(i));
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityNodeInfo(android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.addAction(this.clickAction);
    }
}
