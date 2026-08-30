package com.google.android.material.transformation;

/* JADX INFO: loaded from: classes5.dex */
@java.lang.Deprecated
public abstract class ExpandableBehavior extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<android.view.View> {
    private static final int STATE_COLLAPSED = 2;
    private static final int STATE_EXPANDED = 1;
    private static final int STATE_UNINITIALIZED = 0;
    private int currentState;

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public abstract boolean layoutDependsOn(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2);

    protected abstract boolean onExpandedStateChange(android.view.View view, android.view.View view2, boolean z, boolean z2);

    public ExpandableBehavior() {
        this.currentState = 0;
    }

    public ExpandableBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.currentState = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, final android.view.View view, int i) {
        final com.google.android.material.expandable.ExpandableWidget expandableWidgetFindExpandableWidget;
        if (androidx.core.view.ViewCompat.isLaidOut(view) || (expandableWidgetFindExpandableWidget = findExpandableWidget(coordinatorLayout, view)) == null || !didStateChange(expandableWidgetFindExpandableWidget.isExpanded())) {
            return false;
        }
        final int i2 = expandableWidgetFindExpandableWidget.isExpanded() ? 1 : 2;
        this.currentState = i2;
        view.getViewTreeObserver().addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener() { // from class: com.google.android.material.transformation.ExpandableBehavior.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                if (com.google.android.material.transformation.ExpandableBehavior.this.currentState == i2) {
                    com.google.android.material.transformation.ExpandableBehavior expandableBehavior = com.google.android.material.transformation.ExpandableBehavior.this;
                    com.google.android.material.expandable.ExpandableWidget expandableWidget = expandableWidgetFindExpandableWidget;
                    expandableBehavior.onExpandedStateChange((android.view.View) expandableWidget, view, expandableWidget.isExpanded(), false);
                }
                return false;
            }
        });
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onDependentViewChanged(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2) {
        com.google.android.material.expandable.ExpandableWidget expandableWidget = (com.google.android.material.expandable.ExpandableWidget) view2;
        if (!didStateChange(expandableWidget.isExpanded())) {
            return false;
        }
        this.currentState = expandableWidget.isExpanded() ? 1 : 2;
        return onExpandedStateChange((android.view.View) expandableWidget, view, expandableWidget.isExpanded(), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected com.google.android.material.expandable.ExpandableWidget findExpandableWidget(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view) {
        java.util.List<android.view.View> dependencies = coordinatorLayout.getDependencies(view);
        int size = dependencies.size();
        for (int i = 0; i < size; i++) {
            android.view.View view2 = dependencies.get(i);
            if (layoutDependsOn(coordinatorLayout, view, view2)) {
                return (com.google.android.material.expandable.ExpandableWidget) view2;
            }
        }
        return null;
    }

    private boolean didStateChange(boolean z) {
        if (!z) {
            return this.currentState == 1;
        }
        int i = this.currentState;
        return i == 0 || i == 2;
    }

    public static <T extends com.google.android.material.transformation.ExpandableBehavior> T from(android.view.View view, java.lang.Class<T> cls) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams)) {
            throw new java.lang.IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior = ((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
        if (!(behavior instanceof com.google.android.material.transformation.ExpandableBehavior)) {
            throw new java.lang.IllegalArgumentException("The view is not associated with ExpandableBehavior");
        }
        return cls.cast(behavior);
    }
}
