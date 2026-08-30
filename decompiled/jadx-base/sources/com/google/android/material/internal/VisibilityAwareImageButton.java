package com.google.android.material.internal;

/* JADX INFO: loaded from: classes5.dex */
public class VisibilityAwareImageButton extends android.widget.ImageButton {
    private int userSetVisibility;

    public VisibilityAwareImageButton(android.content.Context context) {
        this(context, null);
    }

    public VisibilityAwareImageButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VisibilityAwareImageButton(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.userSetVisibility = getVisibility();
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        internalSetVisibility(i, true);
    }

    public final void internalSetVisibility(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.userSetVisibility = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.userSetVisibility;
    }
}
