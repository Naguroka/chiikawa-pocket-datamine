package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
final class C1709f extends android.view.SurfaceView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f3918a;
    private com.unity3d.player.UnityPlayer b;

    public C1709f(android.content.Context context, com.unity3d.player.UnityPlayer unityPlayer) {
        super(context);
        this.b = unityPlayer;
    }

    public final void a(float f) {
        this.f3918a = f;
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int i = f <= 0.0f ? -1 : -2;
        layoutParams.width = i;
        layoutParams.height = i;
        setLayoutParams(layoutParams);
    }

    public final boolean a() {
        return this.f3918a > 0.0f;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(android.view.MotionEvent motionEvent) {
        if (a()) {
            return this.b.injectEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.f3918a <= 0.0f) {
            super.onMeasure(i, i2);
            return;
        }
        int size = android.view.View.MeasureSpec.getSize(i);
        int size2 = android.view.View.MeasureSpec.getSize(i2);
        if (size <= 0 || size2 <= 0 || android.view.View.MeasureSpec.getMode(i) != Integer.MIN_VALUE || android.view.View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            super.onMeasure(i, i2);
            return;
        }
        float f = size;
        float f2 = size2;
        float f3 = f / f2;
        float f4 = this.f3918a;
        if (f3 < f4) {
            size2 = (int) (f / f4);
        } else {
            size = (int) (f2 * f4);
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (a()) {
            return this.b.injectEvent(motionEvent);
        }
        return false;
    }
}
