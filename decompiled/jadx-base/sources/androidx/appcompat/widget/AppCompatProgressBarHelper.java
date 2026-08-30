package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class AppCompatProgressBarHelper {
    private static final int[] TINT_ATTRS = {android.R.attr.indeterminateDrawable, android.R.attr.progressDrawable};
    private android.graphics.Bitmap mSampleTile;
    private final android.widget.ProgressBar mView;

    AppCompatProgressBarHelper(android.widget.ProgressBar progressBar) {
        this.mView = progressBar;
    }

    void loadFromAttributes(android.util.AttributeSet attributeSet, int i) {
        androidx.appcompat.widget.TintTypedArray tintTypedArrayObtainStyledAttributes = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(this.mView.getContext(), attributeSet, TINT_ATTRS, i, 0);
        android.graphics.drawable.Drawable drawableIfKnown = tintTypedArrayObtainStyledAttributes.getDrawableIfKnown(0);
        if (drawableIfKnown != null) {
            this.mView.setIndeterminateDrawable(tileifyIndeterminate(drawableIfKnown));
        }
        android.graphics.drawable.Drawable drawableIfKnown2 = tintTypedArrayObtainStyledAttributes.getDrawableIfKnown(1);
        if (drawableIfKnown2 != null) {
            this.mView.setProgressDrawable(tileify(drawableIfKnown2, false));
        }
        tintTypedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    android.graphics.drawable.Drawable tileify(android.graphics.drawable.Drawable drawable, boolean z) {
        if (drawable instanceof androidx.core.graphics.drawable.WrappedDrawable) {
            androidx.core.graphics.drawable.WrappedDrawable wrappedDrawable = (androidx.core.graphics.drawable.WrappedDrawable) drawable;
            android.graphics.drawable.Drawable wrappedDrawable2 = wrappedDrawable.getWrappedDrawable();
            if (wrappedDrawable2 != null) {
                wrappedDrawable.setWrappedDrawable(tileify(wrappedDrawable2, z));
            }
        } else {
            if (drawable instanceof android.graphics.drawable.LayerDrawable) {
                android.graphics.drawable.LayerDrawable layerDrawable = (android.graphics.drawable.LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                android.graphics.drawable.Drawable[] drawableArr = new android.graphics.drawable.Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = tileify(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                android.graphics.drawable.LayerDrawable layerDrawable2 = new android.graphics.drawable.LayerDrawable(drawableArr);
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    layerDrawable2.setId(i2, layerDrawable.getId(i2));
                    androidx.appcompat.widget.AppCompatProgressBarHelper.Api23Impl.transferLayerProperties(layerDrawable, layerDrawable2, i2);
                }
                return layerDrawable2;
            }
            if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
                android.graphics.drawable.BitmapDrawable bitmapDrawable = (android.graphics.drawable.BitmapDrawable) drawable;
                android.graphics.Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.mSampleTile == null) {
                    this.mSampleTile = bitmap;
                }
                android.graphics.drawable.ShapeDrawable shapeDrawable = new android.graphics.drawable.ShapeDrawable(getDrawableShape());
                shapeDrawable.getPaint().setShader(new android.graphics.BitmapShader(bitmap, android.graphics.Shader.TileMode.REPEAT, android.graphics.Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z ? new android.graphics.drawable.ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    private android.graphics.drawable.Drawable tileifyIndeterminate(android.graphics.drawable.Drawable drawable) {
        if (!(drawable instanceof android.graphics.drawable.AnimationDrawable)) {
            return drawable;
        }
        android.graphics.drawable.AnimationDrawable animationDrawable = (android.graphics.drawable.AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        android.graphics.drawable.AnimationDrawable animationDrawable2 = new android.graphics.drawable.AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i = 0; i < numberOfFrames; i++) {
            android.graphics.drawable.Drawable drawableTileify = tileify(animationDrawable.getFrame(i), true);
            drawableTileify.setLevel(10000);
            animationDrawable2.addFrame(drawableTileify, animationDrawable.getDuration(i));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    private android.graphics.drawable.shapes.Shape getDrawableShape() {
        return new android.graphics.drawable.shapes.RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    android.graphics.Bitmap getSampleTile() {
        return this.mSampleTile;
    }

    private static class Api23Impl {
        private Api23Impl() {
        }

        public static void transferLayerProperties(android.graphics.drawable.LayerDrawable layerDrawable, android.graphics.drawable.LayerDrawable layerDrawable2, int i) {
            layerDrawable2.setLayerGravity(i, layerDrawable.getLayerGravity(i));
            layerDrawable2.setLayerWidth(i, layerDrawable.getLayerWidth(i));
            layerDrawable2.setLayerHeight(i, layerDrawable.getLayerHeight(i));
            layerDrawable2.setLayerInsetLeft(i, layerDrawable.getLayerInsetLeft(i));
            layerDrawable2.setLayerInsetRight(i, layerDrawable.getLayerInsetRight(i));
            layerDrawable2.setLayerInsetTop(i, layerDrawable.getLayerInsetTop(i));
            layerDrawable2.setLayerInsetBottom(i, layerDrawable.getLayerInsetBottom(i));
            layerDrawable2.setLayerInsetStart(i, layerDrawable.getLayerInsetStart(i));
            layerDrawable2.setLayerInsetEnd(i, layerDrawable.getLayerInsetEnd(i));
        }
    }
}
