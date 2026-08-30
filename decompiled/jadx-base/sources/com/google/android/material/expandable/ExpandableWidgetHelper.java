package com.google.android.material.expandable;

/* JADX INFO: loaded from: classes5.dex */
public final class ExpandableWidgetHelper {
    private boolean expanded = false;
    private int expandedComponentIdHint = 0;
    private final android.view.View widget;

    /* JADX WARN: Multi-variable type inference failed */
    public ExpandableWidgetHelper(com.google.android.material.expandable.ExpandableWidget expandableWidget) {
        this.widget = (android.view.View) expandableWidget;
    }

    public boolean setExpanded(boolean z) {
        if (this.expanded == z) {
            return false;
        }
        this.expanded = z;
        dispatchExpandedStateChanged();
        return true;
    }

    public boolean isExpanded() {
        return this.expanded;
    }

    public android.os.Bundle onSaveInstanceState() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("expanded", this.expanded);
        bundle.putInt("expandedComponentIdHint", this.expandedComponentIdHint);
        return bundle;
    }

    public void onRestoreInstanceState(android.os.Bundle bundle) {
        this.expanded = bundle.getBoolean("expanded", false);
        this.expandedComponentIdHint = bundle.getInt("expandedComponentIdHint", 0);
        if (this.expanded) {
            dispatchExpandedStateChanged();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        this.expandedComponentIdHint = i;
    }

    public int getExpandedComponentIdHint() {
        return this.expandedComponentIdHint;
    }

    private void dispatchExpandedStateChanged() {
        android.view.ViewParent parent = this.widget.getParent();
        if (parent instanceof androidx.coordinatorlayout.widget.CoordinatorLayout) {
            ((androidx.coordinatorlayout.widget.CoordinatorLayout) parent).dispatchDependentViewsChanged(this.widget);
        }
    }
}
