package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends android.widget.FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.widget.ImageView f305a;
    private com.amoad.ae b;
    private android.graphics.Bitmap c;
    private com.amoad.ac d;
    private android.widget.ImageView.ScaleType e;

    public f(android.content.Context context) {
        super(context);
        this.f305a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = android.widget.ImageView.ScaleType.FIT_START;
    }

    final void a() {
        com.amoad.ac acVar;
        com.amoad.ae aeVar = this.b;
        if (aeVar == null || (acVar = this.d) == null) {
            this.f305a.setImageBitmap(this.c);
        } else {
            aeVar.a(acVar);
        }
    }

    final void setImage(com.amoad.d dVar) {
        removeAllViews();
        this.c = null;
        this.d = null;
        this.f305a = null;
        this.b = null;
        if (dVar == null) {
            return;
        }
        this.c = dVar.f300a;
        this.d = dVar.b;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        if (this.d != null) {
            com.amoad.ae aeVar = new com.amoad.ae(getContext());
            this.b = aeVar;
            aeVar.setScaleType(this.e);
            addView(this.b, layoutParams);
            return;
        }
        if (this.c != null) {
            android.widget.ImageView imageView = new android.widget.ImageView(getContext());
            this.f305a = imageView;
            imageView.setScaleType(this.e);
            addView(this.f305a, layoutParams);
        }
    }

    final void setScaleType(android.widget.ImageView.ScaleType scaleType) {
        this.e = scaleType;
        com.amoad.ae aeVar = this.b;
        if (aeVar != null) {
            aeVar.setScaleType(scaleType);
        }
        android.widget.ImageView imageView = this.f305a;
        if (imageView != null) {
            imageView.setScaleType(this.e);
        }
    }
}
