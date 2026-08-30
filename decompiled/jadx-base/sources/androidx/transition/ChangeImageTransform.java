package androidx.transition;

/* JADX INFO: loaded from: classes3.dex */
public class ChangeImageTransform extends androidx.transition.Transition {
    private static final java.lang.String PROPNAME_MATRIX = "android:changeImageTransform:matrix";
    private static final java.lang.String PROPNAME_BOUNDS = "android:changeImageTransform:bounds";
    private static final java.lang.String[] sTransitionProperties = {PROPNAME_MATRIX, PROPNAME_BOUNDS};
    private static final android.animation.TypeEvaluator<android.graphics.Matrix> NULL_MATRIX_EVALUATOR = new android.animation.TypeEvaluator<android.graphics.Matrix>() { // from class: androidx.transition.ChangeImageTransform.1
        @Override // android.animation.TypeEvaluator
        public android.graphics.Matrix evaluate(float f, android.graphics.Matrix matrix, android.graphics.Matrix matrix2) {
            return null;
        }
    };
    private static final android.util.Property<android.widget.ImageView, android.graphics.Matrix> ANIMATED_TRANSFORM_PROPERTY = new android.util.Property<android.widget.ImageView, android.graphics.Matrix>(android.graphics.Matrix.class, "animatedTransform") { // from class: androidx.transition.ChangeImageTransform.2
        @Override // android.util.Property
        public android.graphics.Matrix get(android.widget.ImageView imageView) {
            return null;
        }

        @Override // android.util.Property
        public void set(android.widget.ImageView imageView, android.graphics.Matrix matrix) {
            androidx.transition.ImageViewUtils.animateTransform(imageView, matrix);
        }
    };

    public ChangeImageTransform() {
    }

    public ChangeImageTransform(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void captureValues(androidx.transition.TransitionValues transitionValues) {
        android.view.View view = transitionValues.view;
        if ((view instanceof android.widget.ImageView) && view.getVisibility() == 0) {
            android.widget.ImageView imageView = (android.widget.ImageView) view;
            if (imageView.getDrawable() == null) {
                return;
            }
            java.util.Map<java.lang.String, java.lang.Object> map = transitionValues.values;
            map.put(PROPNAME_BOUNDS, new android.graphics.Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            map.put(PROPNAME_MATRIX, copyImageMatrix(imageView));
        }
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(androidx.transition.TransitionValues transitionValues) {
        captureValues(transitionValues);
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(androidx.transition.TransitionValues transitionValues) {
        captureValues(transitionValues);
    }

    @Override // androidx.transition.Transition
    public java.lang.String[] getTransitionProperties() {
        return sTransitionProperties;
    }

    @Override // androidx.transition.Transition
    public android.animation.Animator createAnimator(android.view.ViewGroup viewGroup, androidx.transition.TransitionValues transitionValues, androidx.transition.TransitionValues transitionValues2) {
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        android.graphics.Rect rect = (android.graphics.Rect) transitionValues.values.get(PROPNAME_BOUNDS);
        android.graphics.Rect rect2 = (android.graphics.Rect) transitionValues2.values.get(PROPNAME_BOUNDS);
        if (rect == null || rect2 == null) {
            return null;
        }
        android.graphics.Matrix matrix = (android.graphics.Matrix) transitionValues.values.get(PROPNAME_MATRIX);
        android.graphics.Matrix matrix2 = (android.graphics.Matrix) transitionValues2.values.get(PROPNAME_MATRIX);
        boolean z = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
        if (rect.equals(rect2) && z) {
            return null;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) transitionValues2.view;
        android.graphics.drawable.Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return createNullAnimator(imageView);
        }
        if (matrix == null) {
            matrix = androidx.transition.MatrixUtils.IDENTITY_MATRIX;
        }
        if (matrix2 == null) {
            matrix2 = androidx.transition.MatrixUtils.IDENTITY_MATRIX;
        }
        ANIMATED_TRANSFORM_PROPERTY.set(imageView, matrix);
        return createMatrixAnimator(imageView, matrix, matrix2);
    }

    private android.animation.ObjectAnimator createNullAnimator(android.widget.ImageView imageView) {
        return android.animation.ObjectAnimator.ofObject(imageView, (android.util.Property<android.widget.ImageView, V>) ANIMATED_TRANSFORM_PROPERTY, (android.animation.TypeEvaluator) NULL_MATRIX_EVALUATOR, (java.lang.Object[]) new android.graphics.Matrix[]{androidx.transition.MatrixUtils.IDENTITY_MATRIX, androidx.transition.MatrixUtils.IDENTITY_MATRIX});
    }

    private android.animation.ObjectAnimator createMatrixAnimator(android.widget.ImageView imageView, android.graphics.Matrix matrix, android.graphics.Matrix matrix2) {
        return android.animation.ObjectAnimator.ofObject(imageView, (android.util.Property<android.widget.ImageView, V>) ANIMATED_TRANSFORM_PROPERTY, (android.animation.TypeEvaluator) new androidx.transition.TransitionUtils.MatrixEvaluator(), (java.lang.Object[]) new android.graphics.Matrix[]{matrix, matrix2});
    }

    private static android.graphics.Matrix copyImageMatrix(android.widget.ImageView imageView) {
        android.graphics.drawable.Drawable drawable = imageView.getDrawable();
        if (drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
            int i = androidx.transition.ChangeImageTransform.AnonymousClass3.$SwitchMap$android$widget$ImageView$ScaleType[imageView.getScaleType().ordinal()];
            if (i == 1) {
                return fitXYMatrix(imageView);
            }
            if (i == 2) {
                return centerCropMatrix(imageView);
            }
            return new android.graphics.Matrix(imageView.getImageMatrix());
        }
        return new android.graphics.Matrix(imageView.getImageMatrix());
    }

    /* JADX INFO: renamed from: androidx.transition.ChangeImageTransform$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$android$widget$ImageView$ScaleType;

        static {
            int[] iArr = new int[android.widget.ImageView.ScaleType.values().length];
            $SwitchMap$android$widget$ImageView$ScaleType = iArr;
            try {
                iArr[android.widget.ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    private static android.graphics.Matrix fitXYMatrix(android.widget.ImageView imageView) {
        android.graphics.drawable.Drawable drawable = imageView.getDrawable();
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postScale(imageView.getWidth() / drawable.getIntrinsicWidth(), imageView.getHeight() / drawable.getIntrinsicHeight());
        return matrix;
    }

    private static android.graphics.Matrix centerCropMatrix(android.widget.ImageView imageView) {
        android.graphics.drawable.Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        float width = imageView.getWidth();
        float f = intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float height = imageView.getHeight();
        float f2 = intrinsicHeight;
        float fMax = java.lang.Math.max(width / f, height / f2);
        int iRound = java.lang.Math.round((width - (f * fMax)) / 2.0f);
        int iRound2 = java.lang.Math.round((height - (f2 * fMax)) / 2.0f);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postScale(fMax, fMax);
        matrix.postTranslate(iRound, iRound2);
        return matrix;
    }
}
