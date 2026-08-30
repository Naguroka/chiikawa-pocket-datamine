package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
final class ad extends android.widget.RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    android.widget.ImageView f191a;
    android.widget.TextView b;
    android.widget.TextView c;
    int[] d;
    int[] e;
    int f;
    int g;

    ad(android.content.Context context) {
        super(context);
        this.d = new int[]{Integer.MIN_VALUE, 0};
        this.e = new int[]{-2130706433, androidx.core.view.ViewCompat.MEASURED_SIZE_MASK};
        android.widget.TextView textView = new android.widget.TextView(context);
        this.b = textView;
        textView.setMinLines(2);
        this.b.setMaxLines(2);
        addView(this.b);
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        this.f191a = imageView;
        imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        this.f191a.setAdjustViewBounds(true);
        addView(this.f191a);
        android.widget.TextView textView2 = new android.widget.TextView(context);
        this.c = textView2;
        textView2.setText("Ads by AMoAd");
        addView(this.c);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        float f = i5 / this.f;
        int i6 = (int) (38.0f * f);
        int i7 = (int) (6.0f * f);
        int i8 = i6 + i7;
        this.f191a.layout(i7, i7, i8, i8);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i9 = i4 - i2;
        int i10 = i7 * 2;
        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec((i5 - i6) - (i7 * 3), Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(i9 - i10, Integer.MIN_VALUE);
        this.c.setTextSize(0, 8.0f * f);
        this.c.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        android.widget.TextView textView = this.c;
        textView.layout((measuredWidth - textView.getMeasuredWidth()) - i7, measuredHeight - this.c.getMeasuredHeight(), measuredWidth - i7, measuredHeight);
        this.b.setTextSize(0, f * 14.0f);
        this.b.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        android.widget.TextView textView2 = this.b;
        int i11 = i10 + i6;
        textView2.layout(i11, i7, textView2.getMeasuredWidth() + i11, this.b.getMeasuredHeight() + i7);
    }
}
