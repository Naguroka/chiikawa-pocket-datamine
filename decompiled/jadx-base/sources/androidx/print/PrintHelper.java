package androidx.print;

/* JADX INFO: loaded from: classes3.dex */
public final class PrintHelper {
    public static final int COLOR_MODE_COLOR = 2;
    public static final int COLOR_MODE_MONOCHROME = 1;
    private static final java.lang.String LOG_TAG = "PrintHelper";
    private static final int MAX_PRINT_SIZE = 3500;
    public static final int ORIENTATION_LANDSCAPE = 1;
    public static final int ORIENTATION_PORTRAIT = 2;
    public static final int SCALE_MODE_FILL = 2;
    public static final int SCALE_MODE_FIT = 1;
    final android.content.Context mContext;
    static final boolean PRINT_ACTIVITY_RESPECTS_ORIENTATION = true;
    static final boolean IS_MIN_MARGINS_HANDLING_CORRECT = true;
    android.graphics.BitmapFactory.Options mDecodeOptions = null;
    final java.lang.Object mLock = new java.lang.Object();
    int mScaleMode = 2;
    int mColorMode = 2;
    int mOrientation = 1;

    public interface OnPrintFinishCallback {
        void onFinish();
    }

    public static boolean systemSupportsPrint() {
        return true;
    }

    public PrintHelper(android.content.Context context) {
        this.mContext = context;
    }

    public void setScaleMode(int i) {
        this.mScaleMode = i;
    }

    public int getScaleMode() {
        return this.mScaleMode;
    }

    public void setColorMode(int i) {
        this.mColorMode = i;
    }

    public int getColorMode() {
        return this.mColorMode;
    }

    public void setOrientation(int i) {
        this.mOrientation = i;
    }

    public int getOrientation() {
        int i = this.mOrientation;
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public void printBitmap(java.lang.String str, android.graphics.Bitmap bitmap) {
        printBitmap(str, bitmap, (androidx.print.PrintHelper.OnPrintFinishCallback) null);
    }

    public void printBitmap(java.lang.String str, android.graphics.Bitmap bitmap, androidx.print.PrintHelper.OnPrintFinishCallback onPrintFinishCallback) {
        android.print.PrintAttributes.MediaSize mediaSize;
        if (bitmap == null) {
            return;
        }
        android.print.PrintManager printManager = (android.print.PrintManager) this.mContext.getSystemService("print");
        if (isPortrait(bitmap)) {
            mediaSize = android.print.PrintAttributes.MediaSize.UNKNOWN_PORTRAIT;
        } else {
            mediaSize = android.print.PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE;
        }
        printManager.print(str, new androidx.print.PrintHelper.PrintBitmapAdapter(str, this.mScaleMode, bitmap, onPrintFinishCallback), new android.print.PrintAttributes.Builder().setMediaSize(mediaSize).setColorMode(this.mColorMode).build());
    }

    private class PrintBitmapAdapter extends android.print.PrintDocumentAdapter {
        private android.print.PrintAttributes mAttributes;
        private final android.graphics.Bitmap mBitmap;
        private final androidx.print.PrintHelper.OnPrintFinishCallback mCallback;
        private final int mFittingMode;
        private final java.lang.String mJobName;

        PrintBitmapAdapter(java.lang.String str, int i, android.graphics.Bitmap bitmap, androidx.print.PrintHelper.OnPrintFinishCallback onPrintFinishCallback) {
            this.mJobName = str;
            this.mFittingMode = i;
            this.mBitmap = bitmap;
            this.mCallback = onPrintFinishCallback;
        }

        @Override // android.print.PrintDocumentAdapter
        public void onLayout(android.print.PrintAttributes printAttributes, android.print.PrintAttributes printAttributes2, android.os.CancellationSignal cancellationSignal, android.print.PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, android.os.Bundle bundle) {
            this.mAttributes = printAttributes2;
            layoutResultCallback.onLayoutFinished(new android.print.PrintDocumentInfo.Builder(this.mJobName).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
        }

        @Override // android.print.PrintDocumentAdapter
        public void onWrite(android.print.PageRange[] pageRangeArr, android.os.ParcelFileDescriptor parcelFileDescriptor, android.os.CancellationSignal cancellationSignal, android.print.PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            androidx.print.PrintHelper.this.writeBitmap(this.mAttributes, this.mFittingMode, this.mBitmap, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }

        @Override // android.print.PrintDocumentAdapter
        public void onFinish() {
            androidx.print.PrintHelper.OnPrintFinishCallback onPrintFinishCallback = this.mCallback;
            if (onPrintFinishCallback != null) {
                onPrintFinishCallback.onFinish();
            }
        }
    }

    public void printBitmap(java.lang.String str, android.net.Uri uri) throws java.io.FileNotFoundException {
        printBitmap(str, uri, (androidx.print.PrintHelper.OnPrintFinishCallback) null);
    }

    public void printBitmap(java.lang.String str, android.net.Uri uri, androidx.print.PrintHelper.OnPrintFinishCallback onPrintFinishCallback) throws java.io.FileNotFoundException {
        androidx.print.PrintHelper.PrintUriAdapter printUriAdapter = new androidx.print.PrintHelper.PrintUriAdapter(str, uri, onPrintFinishCallback, this.mScaleMode);
        android.print.PrintManager printManager = (android.print.PrintManager) this.mContext.getSystemService("print");
        android.print.PrintAttributes.Builder builder = new android.print.PrintAttributes.Builder();
        builder.setColorMode(this.mColorMode);
        int i = this.mOrientation;
        if (i == 1 || i == 0) {
            builder.setMediaSize(android.print.PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE);
        } else if (i == 2) {
            builder.setMediaSize(android.print.PrintAttributes.MediaSize.UNKNOWN_PORTRAIT);
        }
        printManager.print(str, printUriAdapter, builder.build());
    }

    private class PrintUriAdapter extends android.print.PrintDocumentAdapter {
        android.print.PrintAttributes mAttributes;
        android.graphics.Bitmap mBitmap = null;
        final androidx.print.PrintHelper.OnPrintFinishCallback mCallback;
        final int mFittingMode;
        final android.net.Uri mImageFile;
        final java.lang.String mJobName;
        android.os.AsyncTask<android.net.Uri, java.lang.Boolean, android.graphics.Bitmap> mLoadBitmap;

        PrintUriAdapter(java.lang.String str, android.net.Uri uri, androidx.print.PrintHelper.OnPrintFinishCallback onPrintFinishCallback, int i) {
            this.mJobName = str;
            this.mImageFile = uri;
            this.mCallback = onPrintFinishCallback;
            this.mFittingMode = i;
        }

        /* JADX WARN: Type inference failed for: r11v3, types: [androidx.print.PrintHelper$PrintUriAdapter$1] */
        @Override // android.print.PrintDocumentAdapter
        public void onLayout(final android.print.PrintAttributes printAttributes, final android.print.PrintAttributes printAttributes2, final android.os.CancellationSignal cancellationSignal, final android.print.PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, android.os.Bundle bundle) {
            synchronized (this) {
                this.mAttributes = printAttributes2;
            }
            if (cancellationSignal.isCanceled()) {
                layoutResultCallback.onLayoutCancelled();
            } else if (this.mBitmap != null) {
                layoutResultCallback.onLayoutFinished(new android.print.PrintDocumentInfo.Builder(this.mJobName).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
            } else {
                this.mLoadBitmap = new android.os.AsyncTask<android.net.Uri, java.lang.Boolean, android.graphics.Bitmap>() { // from class: androidx.print.PrintHelper.PrintUriAdapter.1
                    @Override // android.os.AsyncTask
                    protected void onPreExecute() {
                        cancellationSignal.setOnCancelListener(new android.os.CancellationSignal.OnCancelListener() { // from class: androidx.print.PrintHelper.PrintUriAdapter.1.1
                            @Override // android.os.CancellationSignal.OnCancelListener
                            public void onCancel() {
                                androidx.print.PrintHelper.PrintUriAdapter.this.cancelLoad();
                                cancel(false);
                            }
                        });
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // android.os.AsyncTask
                    public android.graphics.Bitmap doInBackground(android.net.Uri... uriArr) {
                        try {
                            return androidx.print.PrintHelper.this.loadConstrainedBitmap(androidx.print.PrintHelper.PrintUriAdapter.this.mImageFile);
                        } catch (java.io.FileNotFoundException unused) {
                            return null;
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // android.os.AsyncTask
                    public void onPostExecute(android.graphics.Bitmap bitmap) {
                        android.print.PrintAttributes.MediaSize mediaSize;
                        super.onPostExecute(bitmap);
                        if (bitmap != null && (!androidx.print.PrintHelper.PRINT_ACTIVITY_RESPECTS_ORIENTATION || androidx.print.PrintHelper.this.mOrientation == 0)) {
                            synchronized (this) {
                                mediaSize = androidx.print.PrintHelper.PrintUriAdapter.this.mAttributes.getMediaSize();
                            }
                            if (mediaSize != null && mediaSize.isPortrait() != androidx.print.PrintHelper.isPortrait(bitmap)) {
                                android.graphics.Matrix matrix = new android.graphics.Matrix();
                                matrix.postRotate(90.0f);
                                bitmap = android.graphics.Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                            }
                        }
                        androidx.print.PrintHelper.PrintUriAdapter.this.mBitmap = bitmap;
                        if (bitmap != null) {
                            layoutResultCallback.onLayoutFinished(new android.print.PrintDocumentInfo.Builder(androidx.print.PrintHelper.PrintUriAdapter.this.mJobName).setContentType(1).setPageCount(1).build(), true ^ printAttributes2.equals(printAttributes));
                        } else {
                            layoutResultCallback.onLayoutFailed(null);
                        }
                        androidx.print.PrintHelper.PrintUriAdapter.this.mLoadBitmap = null;
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // android.os.AsyncTask
                    public void onCancelled(android.graphics.Bitmap bitmap) {
                        layoutResultCallback.onLayoutCancelled();
                        androidx.print.PrintHelper.PrintUriAdapter.this.mLoadBitmap = null;
                    }
                }.execute(new android.net.Uri[0]);
            }
        }

        void cancelLoad() {
            synchronized (androidx.print.PrintHelper.this.mLock) {
                if (androidx.print.PrintHelper.this.mDecodeOptions != null) {
                    androidx.print.PrintHelper.this.mDecodeOptions = null;
                }
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onFinish() {
            super.onFinish();
            cancelLoad();
            android.os.AsyncTask<android.net.Uri, java.lang.Boolean, android.graphics.Bitmap> asyncTask = this.mLoadBitmap;
            if (asyncTask != null) {
                asyncTask.cancel(true);
            }
            androidx.print.PrintHelper.OnPrintFinishCallback onPrintFinishCallback = this.mCallback;
            if (onPrintFinishCallback != null) {
                onPrintFinishCallback.onFinish();
            }
            android.graphics.Bitmap bitmap = this.mBitmap;
            if (bitmap != null) {
                bitmap.recycle();
                this.mBitmap = null;
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onWrite(android.print.PageRange[] pageRangeArr, android.os.ParcelFileDescriptor parcelFileDescriptor, android.os.CancellationSignal cancellationSignal, android.print.PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            androidx.print.PrintHelper.this.writeBitmap(this.mAttributes, this.mFittingMode, this.mBitmap, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }
    }

    static boolean isPortrait(android.graphics.Bitmap bitmap) {
        return bitmap.getWidth() <= bitmap.getHeight();
    }

    private static android.print.PrintAttributes.Builder copyAttributes(android.print.PrintAttributes printAttributes) {
        android.print.PrintAttributes.Builder minMargins = new android.print.PrintAttributes.Builder().setMediaSize(printAttributes.getMediaSize()).setResolution(printAttributes.getResolution()).setMinMargins(printAttributes.getMinMargins());
        if (printAttributes.getColorMode() != 0) {
            minMargins.setColorMode(printAttributes.getColorMode());
        }
        if (printAttributes.getDuplexMode() != 0) {
            minMargins.setDuplexMode(printAttributes.getDuplexMode());
        }
        return minMargins;
    }

    static android.graphics.Matrix getMatrix(int i, int i2, android.graphics.RectF rectF, int i3) {
        float fMin;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        float f = i;
        float fWidth = rectF.width() / f;
        if (i3 == 2) {
            fMin = java.lang.Math.max(fWidth, rectF.height() / i2);
        } else {
            fMin = java.lang.Math.min(fWidth, rectF.height() / i2);
        }
        matrix.postScale(fMin, fMin);
        matrix.postTranslate((rectF.width() - (f * fMin)) / 2.0f, (rectF.height() - (i2 * fMin)) / 2.0f);
        return matrix;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.print.PrintHelper$1] */
    void writeBitmap(final android.print.PrintAttributes printAttributes, final int i, final android.graphics.Bitmap bitmap, final android.os.ParcelFileDescriptor parcelFileDescriptor, final android.os.CancellationSignal cancellationSignal, final android.print.PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
        final android.print.PrintAttributes printAttributesBuild = IS_MIN_MARGINS_HANDLING_CORRECT ? printAttributes : copyAttributes(printAttributes).setMinMargins(new android.print.PrintAttributes.Margins(0, 0, 0, 0)).build();
        new android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Throwable>() { // from class: androidx.print.PrintHelper.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public java.lang.Throwable doInBackground(java.lang.Void... voidArr) {
                android.graphics.RectF rectF;
                try {
                    if (cancellationSignal.isCanceled()) {
                        return null;
                    }
                    android.print.pdf.PrintedPdfDocument printedPdfDocument = new android.print.pdf.PrintedPdfDocument(androidx.print.PrintHelper.this.mContext, printAttributesBuild);
                    android.graphics.Bitmap bitmapConvertBitmapForColorMode = androidx.print.PrintHelper.convertBitmapForColorMode(bitmap, printAttributesBuild.getColorMode());
                    if (cancellationSignal.isCanceled()) {
                        return null;
                    }
                    try {
                        android.graphics.pdf.PdfDocument.Page pageStartPage = printedPdfDocument.startPage(1);
                        if (androidx.print.PrintHelper.IS_MIN_MARGINS_HANDLING_CORRECT) {
                            rectF = new android.graphics.RectF(pageStartPage.getInfo().getContentRect());
                        } else {
                            android.print.pdf.PrintedPdfDocument printedPdfDocument2 = new android.print.pdf.PrintedPdfDocument(androidx.print.PrintHelper.this.mContext, printAttributes);
                            android.graphics.pdf.PdfDocument.Page pageStartPage2 = printedPdfDocument2.startPage(1);
                            android.graphics.RectF rectF2 = new android.graphics.RectF(pageStartPage2.getInfo().getContentRect());
                            printedPdfDocument2.finishPage(pageStartPage2);
                            printedPdfDocument2.close();
                            rectF = rectF2;
                        }
                        android.graphics.Matrix matrix = androidx.print.PrintHelper.getMatrix(bitmapConvertBitmapForColorMode.getWidth(), bitmapConvertBitmapForColorMode.getHeight(), rectF, i);
                        if (!androidx.print.PrintHelper.IS_MIN_MARGINS_HANDLING_CORRECT) {
                            matrix.postTranslate(rectF.left, rectF.top);
                            pageStartPage.getCanvas().clipRect(rectF);
                        }
                        pageStartPage.getCanvas().drawBitmap(bitmapConvertBitmapForColorMode, matrix, null);
                        printedPdfDocument.finishPage(pageStartPage);
                        if (cancellationSignal.isCanceled()) {
                            return null;
                        }
                        printedPdfDocument.writeTo(new java.io.FileOutputStream(parcelFileDescriptor.getFileDescriptor()));
                        return null;
                    } finally {
                        printedPdfDocument.close();
                        android.os.ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptor;
                        if (parcelFileDescriptor2 != null) {
                            try {
                                parcelFileDescriptor2.close();
                            } catch (java.io.IOException unused) {
                            }
                        }
                        if (bitmapConvertBitmapForColorMode != bitmap) {
                            bitmapConvertBitmapForColorMode.recycle();
                        }
                    }
                } catch (java.lang.Throwable th) {
                    return th;
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public void onPostExecute(java.lang.Throwable th) {
                if (cancellationSignal.isCanceled()) {
                    writeResultCallback.onWriteCancelled();
                } else if (th == null) {
                    writeResultCallback.onWriteFinished(new android.print.PageRange[]{android.print.PageRange.ALL_PAGES});
                } else {
                    android.util.Log.e(androidx.print.PrintHelper.LOG_TAG, "Error writing printed content", th);
                    writeResultCallback.onWriteFailed(null);
                }
            }
        }.execute(new java.lang.Void[0]);
    }

    android.graphics.Bitmap loadConstrainedBitmap(android.net.Uri uri) throws java.lang.Throwable {
        android.graphics.BitmapFactory.Options options;
        if (uri == null || this.mContext == null) {
            throw new java.lang.IllegalArgumentException("bad argument to getScaledBitmap");
        }
        android.graphics.BitmapFactory.Options options2 = new android.graphics.BitmapFactory.Options();
        options2.inJustDecodeBounds = true;
        loadBitmap(uri, options2);
        int i = options2.outWidth;
        int i2 = options2.outHeight;
        if (i > 0 && i2 > 0) {
            int iMax = java.lang.Math.max(i, i2);
            int i3 = 1;
            while (iMax > 3500) {
                iMax >>>= 1;
                i3 <<= 1;
            }
            if (i3 > 0 && java.lang.Math.min(i, i2) / i3 > 0) {
                synchronized (this.mLock) {
                    android.graphics.BitmapFactory.Options options3 = new android.graphics.BitmapFactory.Options();
                    this.mDecodeOptions = options3;
                    options3.inMutable = true;
                    this.mDecodeOptions.inSampleSize = i3;
                    options = this.mDecodeOptions;
                }
                try {
                    android.graphics.Bitmap bitmapLoadBitmap = loadBitmap(uri, options);
                    synchronized (this.mLock) {
                        this.mDecodeOptions = null;
                    }
                    return bitmapLoadBitmap;
                } catch (java.lang.Throwable th) {
                    synchronized (this.mLock) {
                        this.mDecodeOptions = null;
                        throw th;
                    }
                }
            }
        }
        return null;
    }

    private android.graphics.Bitmap loadBitmap(android.net.Uri uri, android.graphics.BitmapFactory.Options options) throws java.lang.Throwable {
        android.content.Context context;
        if (uri == null || (context = this.mContext) == null) {
            throw new java.lang.IllegalArgumentException("bad argument to loadBitmap");
        }
        java.io.InputStream inputStream = null;
        try {
            java.io.InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            try {
                android.graphics.Bitmap bitmapDecodeStream = android.graphics.BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (java.io.IOException e) {
                        android.util.Log.w(LOG_TAG, "close fail ", e);
                    }
                }
                return bitmapDecodeStream;
            } catch (java.lang.Throwable th) {
                th = th;
                inputStream = inputStreamOpenInputStream;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.io.IOException e2) {
                        android.util.Log.w(LOG_TAG, "close fail ", e2);
                    }
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    static android.graphics.Bitmap convertBitmapForColorMode(android.graphics.Bitmap bitmap, int i) {
        if (i != 1) {
            return bitmap;
        }
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
        android.graphics.Paint paint = new android.graphics.Paint();
        android.graphics.ColorMatrix colorMatrix = new android.graphics.ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new android.graphics.ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }
}
