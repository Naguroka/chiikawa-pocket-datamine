package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
final class ag extends android.widget.ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static android.graphics.Bitmap[] f196a = new android.graphics.Bitmap[2];
    private static com.amoad.ag.a b = null;
    private static java.lang.String g = "https://i.amoad.com/creatives/shared/icon_i_l.png";
    private static java.lang.String h = "https://i.amoad.com/creatives/shared/icon_i_ads.png";
    private final float c;
    private android.graphics.Bitmap d;
    private android.widget.Scroller e;
    private final android.graphics.Rect f;

    static class a extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.HashSet<com.amoad.ag> f198a = new java.util.HashSet<>();

        a(com.amoad.ag agVar) {
            a(agVar);
        }

        final void a(com.amoad.ag agVar) {
            this.f198a.add(agVar);
        }

        @Override // android.os.AsyncTask
        protected final /* synthetic */ java.lang.Boolean doInBackground(java.lang.Void[] voidArr) {
            com.amoad.Logger.d("InfoButton", "load bitmap...");
            if (com.amoad.ag.f196a[0] == null) {
                com.amoad.ag.f196a[0] = com.amoad.ag.b(com.amoad.ag.g);
            }
            if (com.amoad.ag.f196a[1] == null) {
                com.amoad.ag.f196a[1] = com.amoad.ag.b(com.amoad.ag.h);
            }
            return java.lang.Boolean.valueOf(com.amoad.ag.g());
        }

        @Override // android.os.AsyncTask
        protected final /* synthetic */ void onPostExecute(java.lang.Boolean bool) {
            java.lang.Boolean bool2 = bool;
            com.amoad.ag.e();
            if (bool2.booleanValue()) {
                java.util.Iterator<com.amoad.ag> it = this.f198a.iterator();
                while (it.hasNext()) {
                    it.next().f();
                }
            }
            com.amoad.Logger.d("InfoButton", bool2.booleanValue() ? "load bitmap : success" : "load bitmap : failure");
        }
    }

    ag(android.content.Context context, float f) {
        super(context);
        this.f = new android.graphics.Rect();
        this.e = new android.widget.Scroller(context);
        float f2 = f / 2.0f;
        this.c = f2;
        setScaleType(android.widget.ImageView.ScaleType.MATRIX);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postScale(f2, f2);
        setImageMatrix(matrix);
        if (g()) {
            return;
        }
        h();
    }

    private int a(android.graphics.Bitmap bitmap) {
        if (bitmap != null) {
            return (int) (bitmap.getWidth() * this.c);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:47:0x006b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0054 A[EXC_TOP_SPLITTER, PHI: r2
  0x0054: PHI (r2v6 java.io.InputStream) = (r2v5 java.io.InputStream), (r2v7 java.io.InputStream) binds: [B:41:0x0063, B:33:0x0052] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.net.HttpURLConnection] */
    public static final android.graphics.Bitmap b(java.lang.String str) throws java.lang.Throwable {
        java.io.InputStream inputStream;
        ?? r1 = 0;
        ?? r2 = 0;
        try {
            try {
                str = (java.net.HttpURLConnection) new java.net.URL(str).openConnection();
                try {
                    str.setConnectTimeout(5000);
                    str.setReadTimeout(5000);
                    if (str.getResponseCode() != 200) {
                        if (str != 0) {
                            str.disconnect();
                        }
                        return null;
                    }
                    inputStream = str.getInputStream();
                    try {
                        android.graphics.Bitmap bitmapDecodeStream = android.graphics.BitmapFactory.decodeStream(inputStream);
                        if (str != 0) {
                            str.disconnect();
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (java.io.IOException unused) {
                            }
                        }
                        return bitmapDecodeStream;
                    } catch (java.lang.Exception e) {
                        e = e;
                    } catch (java.lang.OutOfMemoryError e2) {
                        e = e2;
                        com.amoad.Logger.w("InfoButton", e);
                        if (str != 0) {
                            str.disconnect();
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (java.io.IOException unused2) {
                            }
                        }
                        return null;
                    }
                } catch (java.lang.Exception e3) {
                    e = e3;
                    inputStream = null;
                } catch (java.lang.OutOfMemoryError e4) {
                    e = e4;
                    inputStream = null;
                } catch (java.lang.Throwable th) {
                    th = th;
                    r1 = str;
                    if (r1 != 0) {
                        r1.disconnect();
                    }
                    if (r1 != 0) {
                        try {
                            (r2 == true ? 1 : 0).close();
                        } catch (java.io.IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        } catch (java.lang.Exception e5) {
            e = e5;
            str = 0;
            inputStream = null;
        } catch (java.lang.OutOfMemoryError e6) {
            e = e6;
            str = 0;
            inputStream = null;
        } catch (java.lang.Throwable th3) {
            th = th3;
            if (r1 != 0) {
                r1.disconnect();
            }
            if (r1 != 0) {
                (r2 == true ? 1 : 0).close();
            }
            throw th;
        }
        com.amoad.Logger.w("InfoButton", e);
        if (str != 0) {
            str.disconnect();
        }
        if (inputStream != null) {
            inputStream.close();
        }
        return null;
    }

    static /* synthetic */ com.amoad.ag.a e() {
        b = null;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        int currX = this.e.getCurrX();
        this.e.forceFinished(true);
        this.e.startScroll(currX, 0, -currX, 0, 1000);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean g() {
        android.graphics.Bitmap[] bitmapArr = f196a;
        return (bitmapArr[0] == null || bitmapArr[1] == null) ? false : true;
    }

    private void h() {
        com.amoad.ag.a aVar = b;
        if (aVar != null) {
            aVar.a(this);
            return;
        }
        com.amoad.ag.a aVar2 = new com.amoad.ag.a(this);
        b = aVar2;
        aVar2.execute(new java.lang.Void[0]);
    }

    private boolean i() {
        return this.e.getCurrX() == 0;
    }

    @Override // android.view.View
    public final void computeScroll() {
        android.graphics.Bitmap bitmap;
        if (this.e.computeScrollOffset()) {
            int currX = this.e.getCurrX();
            int iA = a(f196a[0]);
            int iA2 = a(f196a[1]);
            if (i()) {
                bitmap = f196a[0];
                setImageBitmap(bitmap);
            } else {
                bitmap = f196a[1];
            }
            if (this.d != bitmap) {
                this.d = bitmap;
                setImageBitmap(bitmap);
            }
            setPadding((iA2 * 2) - iA, 0, 0, 0);
            scrollTo(currX + iA2, 0);
            postInvalidate();
        }
    }

    @Override // android.view.View
    public final void getHitRect(android.graphics.Rect rect) {
        super.getHitRect(rect);
        if (i()) {
            rect.left += a(f196a[1]) / 2;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (g()) {
            f();
        } else {
            h();
        }
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f.set(i, i2, i3, i4);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i, int i2) {
        int iA = a(f196a[1]);
        setMeasuredDimension(iA, iA / 2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            android.graphics.Rect rect = new android.graphics.Rect();
            super.getHitRect(rect);
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (!(this.e.getCurrX() == a(f196a[1]) - a(f196a[0]))) {
                rect.left += a(f196a[1]) / 2;
                if (rect.contains(x + this.f.left, y + this.f.top)) {
                    if (g()) {
                        int currX = this.e.getCurrX();
                        int iA = a(f196a[0]);
                        int iA2 = a(f196a[1]);
                        this.e.forceFinished(true);
                        this.e.startScroll(currX, 0, (iA2 - iA) - currX, 0, 0);
                        invalidate();
                        postDelayed(new java.lang.Runnable() { // from class: com.amoad.ag.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.amoad.ag.this.f();
                            }
                        }, 2500L);
                    }
                    return true;
                }
            } else if (rect.contains(x + this.f.left, y + this.f.top)) {
                try {
                    com.amoad.Logger.d("InfoButton", "openGuidePage()https://www.amoad.com/sp/guideline/");
                    android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("https://www.amoad.com/sp/guideline/"));
                    intent.addFlags(268435456);
                    getContext().startActivity(intent);
                } catch (android.content.ActivityNotFoundException e) {
                    com.amoad.Logger.w("InfoButton", e);
                }
                return true;
            }
        }
        return false;
    }
}
