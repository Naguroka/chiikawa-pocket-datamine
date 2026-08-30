package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes.dex */
public class ViewTransitionController {
    java.util.ArrayList<androidx.constraintlayout.motion.widget.ViewTransition.Animate> animations;
    private final androidx.constraintlayout.motion.widget.MotionLayout mMotionLayout;
    private java.util.HashSet<android.view.View> mRelatedViews;
    private java.util.ArrayList<androidx.constraintlayout.motion.widget.ViewTransition> viewTransitions = new java.util.ArrayList<>();
    private java.lang.String TAG = "ViewTransitionController";
    java.util.ArrayList<androidx.constraintlayout.motion.widget.ViewTransition.Animate> removeList = new java.util.ArrayList<>();

    public ViewTransitionController(androidx.constraintlayout.motion.widget.MotionLayout layout) {
        this.mMotionLayout = layout;
    }

    public void add(androidx.constraintlayout.motion.widget.ViewTransition viewTransition) {
        this.viewTransitions.add(viewTransition);
        this.mRelatedViews = null;
        if (viewTransition.getStateTransition() == 4) {
            listenForSharedVariable(viewTransition, true);
        } else if (viewTransition.getStateTransition() == 5) {
            listenForSharedVariable(viewTransition, false);
        }
    }

    void remove(int id) {
        androidx.constraintlayout.motion.widget.ViewTransition next;
        java.util.Iterator<androidx.constraintlayout.motion.widget.ViewTransition> it = this.viewTransitions.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (next.getId() != id);
        if (next != null) {
            this.mRelatedViews = null;
            this.viewTransitions.remove(next);
        }
    }

    private void viewTransition(androidx.constraintlayout.motion.widget.ViewTransition vt, android.view.View... view) {
        int currentState = this.mMotionLayout.getCurrentState();
        if (vt.mViewTransitionMode == 2) {
            vt.applyTransition(this, this.mMotionLayout, currentState, null, view);
            return;
        }
        if (currentState == -1) {
            android.util.Log.w(this.TAG, "No support for ViewTransition within transition yet. Currently: " + this.mMotionLayout.toString());
            return;
        }
        androidx.constraintlayout.widget.ConstraintSet constraintSet = this.mMotionLayout.getConstraintSet(currentState);
        if (constraintSet == null) {
            return;
        }
        vt.applyTransition(this, this.mMotionLayout, currentState, constraintSet, view);
    }

    void enableViewTransition(int id, boolean enable) {
        for (androidx.constraintlayout.motion.widget.ViewTransition viewTransition : this.viewTransitions) {
            if (viewTransition.getId() == id) {
                viewTransition.setEnabled(enable);
                return;
            }
        }
    }

    boolean isViewTransitionEnabled(int id) {
        for (androidx.constraintlayout.motion.widget.ViewTransition viewTransition : this.viewTransitions) {
            if (viewTransition.getId() == id) {
                return viewTransition.isEnabled();
            }
        }
        return false;
    }

    void viewTransition(int id, android.view.View... views) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        androidx.constraintlayout.motion.widget.ViewTransition viewTransition = null;
        for (androidx.constraintlayout.motion.widget.ViewTransition viewTransition2 : this.viewTransitions) {
            if (viewTransition2.getId() == id) {
                for (android.view.View view : views) {
                    if (viewTransition2.checkTags(view)) {
                        arrayList.add(view);
                    }
                }
                if (!arrayList.isEmpty()) {
                    viewTransition(viewTransition2, (android.view.View[]) arrayList.toArray(new android.view.View[0]));
                    arrayList.clear();
                }
                viewTransition = viewTransition2;
            }
        }
        if (viewTransition == null) {
            android.util.Log.e(this.TAG, " Could not find ViewTransition");
        }
    }

    void touchEvent(android.view.MotionEvent event) {
        int currentState = this.mMotionLayout.getCurrentState();
        if (currentState == -1) {
            return;
        }
        if (this.mRelatedViews == null) {
            this.mRelatedViews = new java.util.HashSet<>();
            for (androidx.constraintlayout.motion.widget.ViewTransition viewTransition : this.viewTransitions) {
                int childCount = this.mMotionLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    android.view.View childAt = this.mMotionLayout.getChildAt(i);
                    if (viewTransition.matchesView(childAt)) {
                        childAt.getId();
                        this.mRelatedViews.add(childAt);
                    }
                }
            }
        }
        float x = event.getX();
        float y = event.getY();
        android.graphics.Rect rect = new android.graphics.Rect();
        int action = event.getAction();
        java.util.ArrayList<androidx.constraintlayout.motion.widget.ViewTransition.Animate> arrayList = this.animations;
        if (arrayList != null && !arrayList.isEmpty()) {
            java.util.Iterator<androidx.constraintlayout.motion.widget.ViewTransition.Animate> it = this.animations.iterator();
            while (it.hasNext()) {
                it.next().reactTo(action, x, y);
            }
        }
        if (action == 0 || action == 1) {
            androidx.constraintlayout.widget.ConstraintSet constraintSet = this.mMotionLayout.getConstraintSet(currentState);
            java.util.Iterator<androidx.constraintlayout.motion.widget.ViewTransition> it2 = this.viewTransitions.iterator();
            while (it2.hasNext()) {
                androidx.constraintlayout.motion.widget.ViewTransition next = it2.next();
                if (next.supports(action)) {
                    for (android.view.View view : this.mRelatedViews) {
                        if (next.matchesView(view)) {
                            view.getHitRect(rect);
                            if (rect.contains((int) x, (int) y)) {
                                next.applyTransition(this, this.mMotionLayout, currentState, constraintSet, view);
                            }
                            next = next;
                        }
                    }
                }
            }
        }
    }

    void addAnimation(androidx.constraintlayout.motion.widget.ViewTransition.Animate animation) {
        if (this.animations == null) {
            this.animations = new java.util.ArrayList<>();
        }
        this.animations.add(animation);
    }

    void removeAnimation(androidx.constraintlayout.motion.widget.ViewTransition.Animate animation) {
        this.removeList.add(animation);
    }

    void animate() {
        java.util.ArrayList<androidx.constraintlayout.motion.widget.ViewTransition.Animate> arrayList = this.animations;
        if (arrayList == null) {
            return;
        }
        java.util.Iterator<androidx.constraintlayout.motion.widget.ViewTransition.Animate> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().mutate();
        }
        this.animations.removeAll(this.removeList);
        this.removeList.clear();
        if (this.animations.isEmpty()) {
            this.animations = null;
        }
    }

    void invalidate() {
        this.mMotionLayout.invalidate();
    }

    boolean applyViewTransition(int viewTransitionId, androidx.constraintlayout.motion.widget.MotionController motionController) {
        for (androidx.constraintlayout.motion.widget.ViewTransition viewTransition : this.viewTransitions) {
            if (viewTransition.getId() == viewTransitionId) {
                viewTransition.mKeyFrames.addAllFrames(motionController);
                return true;
            }
        }
        return false;
    }

    private void listenForSharedVariable(final androidx.constraintlayout.motion.widget.ViewTransition viewTransition, final boolean isSet) {
        final int sharedValueID = viewTransition.getSharedValueID();
        final int sharedValue = viewTransition.getSharedValue();
        androidx.constraintlayout.widget.ConstraintLayout.getSharedValues().addListener(viewTransition.getSharedValueID(), new androidx.constraintlayout.widget.SharedValues.SharedValuesListener() { // from class: androidx.constraintlayout.motion.widget.ViewTransitionController.1
            @Override // androidx.constraintlayout.widget.SharedValues.SharedValuesListener
            public void onNewValue(int id, int value, int oldValue) {
                int sharedValueCurrent = viewTransition.getSharedValueCurrent();
                viewTransition.setSharedValueCurrent(value);
                if (sharedValueID != id || sharedValueCurrent == value) {
                    return;
                }
                if (isSet) {
                    if (sharedValue == value) {
                        int childCount = androidx.constraintlayout.motion.widget.ViewTransitionController.this.mMotionLayout.getChildCount();
                        for (int i = 0; i < childCount; i++) {
                            android.view.View childAt = androidx.constraintlayout.motion.widget.ViewTransitionController.this.mMotionLayout.getChildAt(i);
                            if (viewTransition.matchesView(childAt)) {
                                int currentState = androidx.constraintlayout.motion.widget.ViewTransitionController.this.mMotionLayout.getCurrentState();
                                androidx.constraintlayout.widget.ConstraintSet constraintSet = androidx.constraintlayout.motion.widget.ViewTransitionController.this.mMotionLayout.getConstraintSet(currentState);
                                androidx.constraintlayout.motion.widget.ViewTransition viewTransition2 = viewTransition;
                                androidx.constraintlayout.motion.widget.ViewTransitionController viewTransitionController = androidx.constraintlayout.motion.widget.ViewTransitionController.this;
                                viewTransition2.applyTransition(viewTransitionController, viewTransitionController.mMotionLayout, currentState, constraintSet, childAt);
                            }
                        }
                        return;
                    }
                    return;
                }
                if (sharedValue != value) {
                    int childCount2 = androidx.constraintlayout.motion.widget.ViewTransitionController.this.mMotionLayout.getChildCount();
                    for (int i2 = 0; i2 < childCount2; i2++) {
                        android.view.View childAt2 = androidx.constraintlayout.motion.widget.ViewTransitionController.this.mMotionLayout.getChildAt(i2);
                        if (viewTransition.matchesView(childAt2)) {
                            int currentState2 = androidx.constraintlayout.motion.widget.ViewTransitionController.this.mMotionLayout.getCurrentState();
                            androidx.constraintlayout.widget.ConstraintSet constraintSet2 = androidx.constraintlayout.motion.widget.ViewTransitionController.this.mMotionLayout.getConstraintSet(currentState2);
                            androidx.constraintlayout.motion.widget.ViewTransition viewTransition3 = viewTransition;
                            androidx.constraintlayout.motion.widget.ViewTransitionController viewTransitionController2 = androidx.constraintlayout.motion.widget.ViewTransitionController.this;
                            viewTransition3.applyTransition(viewTransitionController2, viewTransitionController2.mMotionLayout, currentState2, constraintSet2, childAt2);
                        }
                    }
                }
            }
        });
    }
}
