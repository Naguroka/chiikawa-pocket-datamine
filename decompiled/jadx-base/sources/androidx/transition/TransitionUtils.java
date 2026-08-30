package androidx.transition;

/* JADX INFO: loaded from: classes3.dex */
class TransitionUtils {
    private static final boolean HAS_IS_ATTACHED_TO_WINDOW = true;
    private static final boolean HAS_OVERLAY = true;
    private static final boolean HAS_PICTURE_BITMAP;
    private static final int MAX_IMAGE_SIZE = 1048576;

    static {
        HAS_PICTURE_BITMAP = android.os.Build.VERSION.SDK_INT >= 28;
    }

    static android.view.View copyViewImage(android.view.ViewGroup viewGroup, android.view.View view, android.view.View view2) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setTranslate(-view2.getScrollX(), -view2.getScrollY());
        androidx.transition.ViewUtils.transformMatrixToGlobal(view, matrix);
        androidx.transition.ViewUtils.transformMatrixToLocal(viewGroup, matrix);
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        matrix.mapRect(rectF);
        int iRound = java.lang.Math.round(rectF.left);
        int iRound2 = java.lang.Math.round(rectF.top);
        int iRound3 = java.lang.Math.round(rectF.right);
        int iRound4 = java.lang.Math.round(rectF.bottom);
        android.widget.ImageView imageView = new android.widget.ImageView(view.getContext());
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        android.graphics.Bitmap bitmapCreateViewBitmap = createViewBitmap(view, matrix, rectF, viewGroup);
        if (bitmapCreateViewBitmap != null) {
            imageView.setImageBitmap(bitmapCreateViewBitmap);
        }
        imageView.measure(android.view.View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
        imageView.layout(iRound, iRound2, iRound3, iRound4);
        return imageView;
    }

    private static android.graphics.Bitmap createViewBitmap(android.view.View view, android.graphics.Matrix matrix, android.graphics.RectF rectF, android.view.ViewGroup viewGroup) {
        boolean z;
        boolean zIsAttachedToWindow;
        int iIndexOfChild;
        android.view.ViewGroup viewGroup2;
        if (HAS_IS_ATTACHED_TO_WINDOW) {
            z = !view.isAttachedToWindow();
            zIsAttachedToWindow = viewGroup == null ? false : viewGroup.isAttachedToWindow();
        } else {
            z = false;
            zIsAttachedToWindow = false;
        }
        boolean z2 = HAS_OVERLAY;
        android.graphics.Bitmap bitmapCreateBitmap = null;
        if (!z2 || !z) {
            iIndexOfChild = 0;
            viewGroup2 = null;
        } else {
            if (!zIsAttachedToWindow) {
                return null;
            }
            viewGroup2 = (android.view.ViewGroup) view.getParent();
            iIndexOfChild = viewGroup2.indexOfChild(view);
            viewGroup.getOverlay().add(view);
        }
        int iRound = java.lang.Math.round(rectF.width());
        int iRound2 = java.lang.Math.round(rectF.height());
        if (iRound > 0 && iRound2 > 0) {
            float fMin = java.lang.Math.min(1.0f, 1048576.0f / (iRound * iRound2));
            int iRound3 = java.lang.Math.round(iRound * fMin);
            int iRound4 = java.lang.Math.round(iRound2 * fMin);
            matrix.postTranslate(-rectF.left, -rectF.top);
            matrix.postScale(fMin, fMin);
            if (HAS_PICTURE_BITMAP) {
                android.graphics.Picture picture = new android.graphics.Picture();
                android.graphics.Canvas canvasBeginRecording = picture.beginRecording(iRound3, iRound4);
                canvasBeginRecording.concat(matrix);
                view.draw(canvasBeginRecording);
                picture.endRecording();
                bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(picture);
            } else {
                bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(iRound3, iRound4, android.graphics.Bitmap.Config.ARGB_8888);
                android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
                canvas.concat(matrix);
                view.draw(canvas);
            }
        }
        if (z2 && z) {
            viewGroup.getOverlay().remove(view);
            viewGroup2.addView(view, iIndexOfChild);
        }
        return bitmapCreateBitmap;
    }

    static android.animation.Animator mergeAnimators(android.animation.Animator animator, android.animation.Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(animator, animator2);
        return animatorSet;
    }

    static class MatrixEvaluator implements android.animation.TypeEvaluator<android.graphics.Matrix> {
        final float[] mTempStartValues = new float[9];
        final float[] mTempEndValues = new float[9];
        final android.graphics.Matrix mTempMatrix = new android.graphics.Matrix();

        MatrixEvaluator() {
        }

        @Override // android.animation.TypeEvaluator
        public android.graphics.Matrix evaluate(float f, android.graphics.Matrix matrix, android.graphics.Matrix matrix2) {
            matrix.getValues(this.mTempStartValues);
            matrix2.getValues(this.mTempEndValues);
            for (int i = 0; i < 9; i++) {
                float[] fArr = this.mTempEndValues;
                float f2 = fArr[i];
                float f3 = this.mTempStartValues[i];
                fArr[i] = f3 + ((f2 - f3) * f);
            }
            this.mTempMatrix.setValues(this.mTempEndValues);
            return this.mTempMatrix;
        }
    }

    private TransitionUtils() {
    }
}
