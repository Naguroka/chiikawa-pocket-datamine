package com.google.android.material.dialog;

/* JADX INFO: loaded from: classes5.dex */
public class InsetDialogOnTouchListener implements android.view.View.OnTouchListener {
    private final android.app.Dialog dialog;
    private final int leftInset;
    private final int prePieSlop;
    private final int topInset;

    public InsetDialogOnTouchListener(android.app.Dialog dialog, android.graphics.Rect rect) {
        this.dialog = dialog;
        this.leftInset = rect.left;
        this.topInset = rect.top;
        this.prePieSlop = android.view.ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        android.view.View viewFindViewById = view.findViewById(android.R.id.content);
        int left = this.leftInset + viewFindViewById.getLeft();
        int width = viewFindViewById.getWidth() + left;
        int top = this.topInset + viewFindViewById.getTop();
        if (new android.graphics.RectF(left, top, width, viewFindViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (android.os.Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i = this.prePieSlop;
            motionEventObtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.dialog.onTouchEvent(motionEventObtain);
    }
}
