package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class SharedElementCallback {
    private static final java.lang.String BUNDLE_SNAPSHOT_BITMAP = "sharedElement:snapshot:bitmap";
    private static final java.lang.String BUNDLE_SNAPSHOT_IMAGE_MATRIX = "sharedElement:snapshot:imageMatrix";
    private static final java.lang.String BUNDLE_SNAPSHOT_IMAGE_SCALETYPE = "sharedElement:snapshot:imageScaleType";
    private static final int MAX_IMAGE_SIZE = 1048576;
    private android.graphics.Matrix mTempMatrix;

    public interface OnSharedElementsReadyListener {
        void onSharedElementsReady();
    }

    public void onMapSharedElements(java.util.List<java.lang.String> list, java.util.Map<java.lang.String, android.view.View> map) {
    }

    public void onRejectSharedElements(java.util.List<android.view.View> list) {
    }

    public void onSharedElementEnd(java.util.List<java.lang.String> list, java.util.List<android.view.View> list2, java.util.List<android.view.View> list3) {
    }

    public void onSharedElementStart(java.util.List<java.lang.String> list, java.util.List<android.view.View> list2, java.util.List<android.view.View> list3) {
    }

    public android.os.Parcelable onCaptureSharedElementSnapshot(android.view.View view, android.graphics.Matrix matrix, android.graphics.RectF rectF) {
        android.graphics.Bitmap bitmapCreateDrawableBitmap;
        if (view instanceof android.widget.ImageView) {
            android.widget.ImageView imageView = (android.widget.ImageView) view;
            android.graphics.drawable.Drawable drawable = imageView.getDrawable();
            android.graphics.drawable.Drawable background = imageView.getBackground();
            if (drawable != null && background == null && (bitmapCreateDrawableBitmap = createDrawableBitmap(drawable)) != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putParcelable(BUNDLE_SNAPSHOT_BITMAP, bitmapCreateDrawableBitmap);
                bundle.putString(BUNDLE_SNAPSHOT_IMAGE_SCALETYPE, imageView.getScaleType().toString());
                if (imageView.getScaleType() == android.widget.ImageView.ScaleType.MATRIX) {
                    float[] fArr = new float[9];
                    imageView.getImageMatrix().getValues(fArr);
                    bundle.putFloatArray(BUNDLE_SNAPSHOT_IMAGE_MATRIX, fArr);
                }
                return bundle;
            }
        }
        int iRound = java.lang.Math.round(rectF.width());
        int iRound2 = java.lang.Math.round(rectF.height());
        if (iRound <= 0 || iRound2 <= 0) {
            return null;
        }
        float fMin = java.lang.Math.min(1.0f, 1048576.0f / (iRound * iRound2));
        int i = (int) (iRound * fMin);
        int i2 = (int) (iRound2 * fMin);
        if (this.mTempMatrix == null) {
            this.mTempMatrix = new android.graphics.Matrix();
        }
        this.mTempMatrix.set(matrix);
        this.mTempMatrix.postTranslate(-rectF.left, -rectF.top);
        this.mTempMatrix.postScale(fMin, fMin);
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(i, i2, android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
        canvas.concat(this.mTempMatrix);
        view.draw(canvas);
        return bitmapCreateBitmap;
    }

    private static android.graphics.Bitmap createDrawableBitmap(android.graphics.drawable.Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return null;
        }
        float fMin = java.lang.Math.min(1.0f, 1048576.0f / (intrinsicWidth * intrinsicHeight));
        if ((drawable instanceof android.graphics.drawable.BitmapDrawable) && fMin == 1.0f) {
            return ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap();
        }
        int i = (int) (intrinsicWidth * fMin);
        int i2 = (int) (intrinsicHeight * fMin);
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(i, i2, android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
        android.graphics.Rect bounds = drawable.getBounds();
        int i3 = bounds.left;
        int i4 = bounds.top;
        int i5 = bounds.right;
        int i6 = bounds.bottom;
        drawable.setBounds(0, 0, i, i2);
        drawable.draw(canvas);
        drawable.setBounds(i3, i4, i5, i6);
        return bitmapCreateBitmap;
    }

    public android.view.View onCreateSnapshotView(android.content.Context context, android.os.Parcelable parcelable) {
        if (parcelable instanceof android.os.Bundle) {
            android.os.Bundle bundle = (android.os.Bundle) parcelable;
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) bundle.getParcelable(BUNDLE_SNAPSHOT_BITMAP);
            if (bitmap == null) {
                return null;
            }
            android.widget.ImageView imageView = new android.widget.ImageView(context);
            imageView.setImageBitmap(bitmap);
            imageView.setScaleType(android.widget.ImageView.ScaleType.valueOf(bundle.getString(BUNDLE_SNAPSHOT_IMAGE_SCALETYPE)));
            if (imageView.getScaleType() != android.widget.ImageView.ScaleType.MATRIX) {
                return imageView;
            }
            float[] floatArray = bundle.getFloatArray(BUNDLE_SNAPSHOT_IMAGE_MATRIX);
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.setValues(floatArray);
            imageView.setImageMatrix(matrix);
            return imageView;
        }
        if (!(parcelable instanceof android.graphics.Bitmap)) {
            return null;
        }
        android.widget.ImageView imageView2 = new android.widget.ImageView(context);
        imageView2.setImageBitmap((android.graphics.Bitmap) parcelable);
        return imageView2;
    }

    public void onSharedElementsArrived(java.util.List<java.lang.String> list, java.util.List<android.view.View> list2, androidx.core.app.SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
        onSharedElementsReadyListener.onSharedElementsReady();
    }
}
