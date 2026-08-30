package androidx.browser.browseractions;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
class BrowserActionsFallbackMenuDialog extends android.app.Dialog {
    private static final long ENTER_ANIMATION_DURATION_MS = 250;
    private static final long EXIT_ANIMATION_DURATION_MS = 150;
    private final android.view.View mContentView;

    BrowserActionsFallbackMenuDialog(android.content.Context context, android.view.View view) {
        super(context);
        this.mContentView = view;
    }

    @Override // android.app.Dialog
    public void show() {
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        startAnimation(true);
        super.show();
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        startAnimation(false);
    }

    private void startAnimation(final boolean z) {
        float f = z ? 0.0f : 1.0f;
        float f2 = z ? 1.0f : 0.0f;
        long j = z ? ENTER_ANIMATION_DURATION_MS : 150L;
        this.mContentView.setScaleX(f);
        this.mContentView.setScaleY(f);
        this.mContentView.animate().scaleX(f2).scaleY(f2).setDuration(j).setInterpolator(new androidx.interpolator.view.animation.LinearOutSlowInInterpolator()).setListener(new android.animation.AnimatorListenerAdapter() { // from class: androidx.browser.browseractions.BrowserActionsFallbackMenuDialog.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                if (z) {
                    return;
                }
                androidx.browser.browseractions.BrowserActionsFallbackMenuDialog.super.dismiss();
            }
        }).start();
    }
}
