package com.google.android.material.appbar;

/* JADX INFO: loaded from: classes5.dex */
class ViewUtilsLollipop {
    private static final int[] STATE_LIST_ANIM_ATTRS = {android.R.attr.stateListAnimator};

    ViewUtilsLollipop() {
    }

    static void setBoundsViewOutlineProvider(android.view.View view) {
        view.setOutlineProvider(android.view.ViewOutlineProvider.BOUNDS);
    }

    static void setStateListAnimatorFromAttrs(android.view.View view, android.util.AttributeSet attributeSet, int i, int i2) {
        android.content.Context context = view.getContext();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(context, attributeSet, STATE_LIST_ANIM_ATTRS, i, i2, new int[0]);
        try {
            if (typedArrayObtainStyledAttributes.hasValue(0)) {
                view.setStateListAnimator(android.animation.AnimatorInflater.loadStateListAnimator(context, typedArrayObtainStyledAttributes.getResourceId(0, 0)));
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static void setDefaultAppBarLayoutStateListAnimator(android.view.View view, float f) {
        int integer = view.getResources().getInteger(com.google.android.material.R.integer.app_bar_elevation_anim_duration);
        android.animation.StateListAnimator stateListAnimator = new android.animation.StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{android.R.attr.state_enabled, com.google.android.material.R.attr.state_liftable, -com.google.android.material.R.attr.state_lifted}, android.animation.ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{android.R.attr.state_enabled}, android.animation.ObjectAnimator.ofFloat(view, "elevation", f).setDuration(j));
        stateListAnimator.addState(new int[0], android.animation.ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }
}
