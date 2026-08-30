package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
abstract class e extends android.widget.ImageView {
    private static final java.lang.String f = "e";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f301a;
    protected int b;
    protected final float c;
    protected java.lang.String[] d;
    protected android.graphics.Bitmap[] e;

    protected interface a {
        void a(android.graphics.Bitmap[] bitmapArr);
    }

    static class b extends android.os.AsyncTask<java.lang.String, java.lang.Void, android.graphics.Bitmap[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final java.lang.String f303a = "b";
        private static final int b = (int) java.util.concurrent.TimeUnit.SECONDS.toMillis(5);
        private final com.amoad.e.a c;

        private b(com.amoad.e.a aVar) {
            this.c = aVar;
        }

        /* synthetic */ b(com.amoad.e.a aVar, byte b2) {
            this(aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public android.graphics.Bitmap[] doInBackground(java.lang.String... strArr) {
            android.graphics.Bitmap[] bitmapArr = new android.graphics.Bitmap[strArr.length];
            for (int i = 0; i < strArr.length && !isCancelled(); i++) {
                java.io.InputStream inputStream = null;
                try {
                    try {
                        try {
                            java.net.URLConnection uRLConnectionOpenConnection = new java.net.URL(strArr[i]).openConnection();
                            int i2 = b;
                            uRLConnectionOpenConnection.setConnectTimeout(i2);
                            uRLConnectionOpenConnection.setReadTimeout(i2);
                            inputStream = uRLConnectionOpenConnection.getInputStream();
                            bitmapArr[i] = android.graphics.BitmapFactory.decodeStream(inputStream);
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (java.lang.Exception unused) {
                                }
                            }
                        } catch (java.lang.Throwable th) {
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (java.lang.Exception unused2) {
                                }
                            }
                            throw th;
                        }
                    } catch (java.io.IOException e) {
                        com.amoad.Logger.w(f303a, e);
                        if (inputStream != null) {
                        }
                    }
                } catch (java.lang.OutOfMemoryError e2) {
                    com.amoad.Logger.w(f303a, e2);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (java.lang.Exception unused3) {
                        }
                    }
                    return bitmapArr;
                }
            }
            return bitmapArr;
        }

        @Override // android.os.AsyncTask
        protected /* synthetic */ void onPostExecute(android.graphics.Bitmap[] bitmapArr) {
            this.c.a(bitmapArr);
        }
    }

    static class c extends android.graphics.drawable.StateListDrawable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f304a = 1711276032;

        public c(android.graphics.drawable.Drawable drawable) {
            addState(new int[]{android.R.attr.state_pressed}, drawable);
            addState(new int[0], drawable);
        }

        @Override // android.graphics.drawable.StateListDrawable, android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
        public final boolean isStateful() {
            return true;
        }

        @Override // android.graphics.drawable.StateListDrawable, android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
        protected final boolean onStateChange(int[] iArr) {
            boolean z = false;
            for (int i : iArr) {
                if (i == 16842919) {
                    z = true;
                    break;
                }
            }
            if (z) {
                setColorFilter(this.f304a, android.graphics.PorterDuff.Mode.SRC_ATOP);
            } else {
                clearColorFilter();
            }
            return super.onStateChange(iArr);
        }
    }

    public e(android.content.Context context, int i, int i2) {
        super(context);
        this.f301a = i;
        this.b = i2;
        float fA = com.amoad.x.a(context) / 2.0f;
        this.c = fA;
        setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postScale(fA, fA);
        setImageMatrix(matrix);
        a();
    }

    private android.graphics.Bitmap a(int i) {
        if (c()) {
            return this.e[i];
        }
        return null;
    }

    private boolean c() {
        android.graphics.Bitmap[] bitmapArr;
        java.lang.String[] strArr = this.d;
        return (strArr == null || (bitmapArr = this.e) == null || strArr.length != bitmapArr.length) ? false : true;
    }

    public final android.graphics.Bitmap a(java.lang.String str) {
        return a(java.util.Arrays.asList(this.d).indexOf(str));
    }

    protected abstract void a();

    final void a(int i, int i2) {
        this.b = i2;
        this.f301a = i;
        float f2 = this.c;
        setMeasuredDimension((int) (i * f2), (int) (i2 * f2));
    }

    protected final void a(java.lang.String str, com.amoad.e.a aVar) {
        a(new java.lang.String[]{str}, aVar);
    }

    protected final void a(java.lang.String[] strArr, final com.amoad.e.a aVar) {
        this.d = strArr;
        this.e = null;
        new com.amoad.e.b(new com.amoad.e.a() { // from class: com.amoad.e.1
            @Override // com.amoad.e.a
            public final void a(android.graphics.Bitmap[] bitmapArr) {
                com.amoad.e.this.e = new android.graphics.Bitmap[bitmapArr.length];
                java.lang.System.arraycopy(bitmapArr, 0, com.amoad.e.this.e, 0, bitmapArr.length);
                aVar.a(com.amoad.e.this.e);
            }
        }, (byte) 0).execute(strArr);
    }

    public final android.graphics.Bitmap b() {
        return a(0);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        float f2 = this.f301a;
        float f3 = this.c;
        setMeasuredDimension((int) (f2 * f3), (int) (this.b * f3));
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap bitmap) {
        setImageDrawable(new com.amoad.e.c(new android.graphics.drawable.BitmapDrawable(android.content.res.Resources.getSystem(), bitmap)));
    }
}
