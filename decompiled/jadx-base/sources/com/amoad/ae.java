package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
final class ae extends android.widget.ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.amoad.ae.a f192a;
    private com.amoad.ac b;
    private int c;

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f193a;

        private a() {
        }

        /* synthetic */ a(com.amoad.ae aeVar, byte b) {
            this();
        }

        private synchronized boolean b() {
            return this.f193a;
        }

        final synchronized void a() {
            this.f193a = true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f193a = false;
            com.amoad.ac acVar = com.amoad.ae.this.b;
            int i = acVar.d;
            int i2 = acVar.b;
            int i3 = 0;
            do {
                int i4 = com.amoad.ae.this.c;
                while (i4 < i) {
                    final android.graphics.Bitmap bitmapA = acVar.a(i4);
                    int i5 = (i4 < 0 || i4 >= acVar.d) ? -1 : acVar.c.get(i4).b;
                    com.amoad.ae.this.post(new java.lang.Runnable() { // from class: com.amoad.ae.a.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            android.graphics.Bitmap bitmap = bitmapA;
                            if (bitmap == null || bitmap.isRecycled()) {
                                return;
                            }
                            com.amoad.ae.this.setImageBitmap(bitmapA);
                        }
                    });
                    try {
                        java.lang.Thread.sleep(i5);
                    } catch (java.lang.InterruptedException unused) {
                        com.amoad.Logger.d("GifView", "GifView interrupted");
                    }
                    if (b()) {
                        com.amoad.ae.this.c = i4;
                        return;
                    }
                    i4++;
                }
                com.amoad.ae.this.c = 0;
                if (i2 != 0) {
                    i3++;
                }
                if (b()) {
                    return;
                }
            } while (i3 <= i2);
        }
    }

    public ae(android.content.Context context) {
        super(context);
    }

    private void a() {
        com.amoad.ae.a aVar = this.f192a;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void a(com.amoad.ac acVar) {
        if (acVar == null) {
            return;
        }
        byte b = 0;
        if (!acVar.equals(this.b)) {
            this.b = acVar;
            this.c = 0;
        }
        a();
        if (acVar.f189a == 0) {
            com.amoad.ae.a aVar = new com.amoad.ae.a(this, b);
            this.f192a = aVar;
            com.amoad.bc.b((java.lang.Runnable) aVar);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(android.view.View view, int i) {
        try {
            java.lang.reflect.Method method = getClass().getSuperclass().getMethod("onVisibilityChanged", android.view.View.class, java.lang.Integer.TYPE);
            if (method != null) {
                method.invoke(this, method, java.lang.Integer.valueOf(i));
                if (isShown()) {
                    a(this.b);
                } else {
                    a();
                }
            }
        } catch (java.lang.Exception e) {
            com.amoad.Logger.w("GifView", e);
        }
    }
}
