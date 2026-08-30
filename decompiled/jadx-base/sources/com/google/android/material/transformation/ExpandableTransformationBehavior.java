package com.google.android.material.transformation;

/* JADX INFO: loaded from: classes5.dex */
@java.lang.Deprecated
public abstract class ExpandableTransformationBehavior extends com.google.android.material.transformation.ExpandableBehavior {
    private android.animation.AnimatorSet currentAnimation;

    protected abstract android.animation.AnimatorSet onCreateExpandedStateChangeAnimation(android.view.View view, android.view.View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    protected boolean onExpandedStateChange(android.view.View view, android.view.View view2, boolean z, boolean z2) {
        android.animation.AnimatorSet animatorSet = this.currentAnimation;
        boolean z3 = animatorSet != null;
        if (z3) {
            animatorSet.cancel();
        }
        android.animation.AnimatorSet animatorSetOnCreateExpandedStateChangeAnimation = onCreateExpandedStateChangeAnimation(view, view2, z, z3);
        this.currentAnimation = animatorSetOnCreateExpandedStateChangeAnimation;
        animatorSetOnCreateExpandedStateChangeAnimation.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.transformation.ExpandableTransformationBehavior.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                com.google.android.material.transformation.ExpandableTransformationBehavior.this.currentAnimation = null;
            }
        });
        this.currentAnimation.start();
        if (!z2) {
            this.currentAnimation.end();
        }
        return true;
    }
}
