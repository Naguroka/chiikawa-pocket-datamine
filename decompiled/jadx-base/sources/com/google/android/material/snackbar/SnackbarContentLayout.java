package com.google.android.material.snackbar;

/* JADX INFO: loaded from: classes5.dex */
public class SnackbarContentLayout extends android.widget.LinearLayout implements com.google.android.material.snackbar.ContentViewCallback {
    private android.widget.Button actionView;
    private int maxInlineActionWidth;
    private android.widget.TextView messageView;

    public SnackbarContentLayout(android.content.Context context) {
        this(context, null);
    }

    public SnackbarContentLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.messageView = (android.widget.TextView) findViewById(com.google.android.material.R.id.snackbar_text);
        this.actionView = (android.widget.Button) findViewById(com.google.android.material.R.id.snackbar_action);
    }

    public android.widget.TextView getMessageView() {
        return this.messageView;
    }

    public android.widget.Button getActionView() {
        return this.actionView;
    }

    void updateActionTextColorAlphaIfNeeded(float f) {
        if (f != 1.0f) {
            this.actionView.setTextColor(com.google.android.material.color.MaterialColors.layer(com.google.android.material.color.MaterialColors.getColor(this, com.google.android.material.R.attr.colorSurface), this.actionView.getCurrentTextColor(), f));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0055  */
    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean z = true;
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.google.android.material.R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(com.google.android.material.R.dimen.design_snackbar_padding_vertical);
        android.text.Layout layout = this.messageView.getLayout();
        boolean z2 = layout != null && layout.getLineCount() > 1;
        if (z2 && this.maxInlineActionWidth > 0 && this.actionView.getMeasuredWidth() > this.maxInlineActionWidth) {
            if (!updateViewsWithinLayout(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
                z = false;
            }
        } else {
            if (!z2) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!updateViewsWithinLayout(0, dimensionPixelSize, dimensionPixelSize)) {
                z = false;
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
    }

    private boolean updateViewsWithinLayout(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.messageView.getPaddingTop() == i2 && this.messageView.getPaddingBottom() == i3) {
            return z;
        }
        updateTopBottomPadding(this.messageView, i2, i3);
        return true;
    }

    private static void updateTopBottomPadding(android.view.View view, int i, int i2) {
        if (androidx.core.view.ViewCompat.isPaddingRelative(view)) {
            androidx.core.view.ViewCompat.setPaddingRelative(view, androidx.core.view.ViewCompat.getPaddingStart(view), i, androidx.core.view.ViewCompat.getPaddingEnd(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    @Override // com.google.android.material.snackbar.ContentViewCallback
    public void animateContentIn(int i, int i2) {
        this.messageView.setAlpha(0.0f);
        long j = i2;
        long j2 = i;
        this.messageView.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        if (this.actionView.getVisibility() == 0) {
            this.actionView.setAlpha(0.0f);
            this.actionView.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    @Override // com.google.android.material.snackbar.ContentViewCallback
    public void animateContentOut(int i, int i2) {
        this.messageView.setAlpha(1.0f);
        long j = i2;
        long j2 = i;
        this.messageView.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        if (this.actionView.getVisibility() == 0) {
            this.actionView.setAlpha(1.0f);
            this.actionView.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    public void setMaxInlineActionWidth(int i) {
        this.maxInlineActionWidth = i;
    }
}
