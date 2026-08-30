package com.bytedance.sdk.component.adexpress.ldr;

/* JADX INFO: loaded from: classes3.dex */
public class zx extends android.widget.FrameLayout {
    private android.animation.AnimatorSet IL;
    private android.widget.ImageView bg;

    public zx(android.content.Context context) {
        super(context);
        bX();
        eqN();
    }

    private void bX() {
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        this.bg = imageView;
        imageView.setImageResource(com.bytedance.sdk.component.utils.Fy.eqN(getContext(), "tt_white_hand"));
        int iBg = (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(getContext(), 20.0f);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(iBg, iBg);
        layoutParams.gravity = 17;
        addView(this.bg, layoutParams);
    }

    private void eqN() {
        this.IL = new android.animation.AnimatorSet();
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this.bg, "scaleX", 1.0f, 1.5f, 1.0f, 1.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(2000L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(this.bg, "scaleY", 1.0f, 1.5f, 1.0f, 1.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(2000L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.IL.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    public void bg() {
        android.animation.AnimatorSet animatorSet = this.IL;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    public void IL() {
        android.animation.AnimatorSet animatorSet = this.IL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }
}
