package androidx.core.graphics.drawable;

/* JADX INFO: loaded from: classes.dex */
public final class RoundedBitmapDrawableFactory {
    private static final java.lang.String TAG = "RoundedBitmapDrawableFa";

    private static class DefaultRoundedBitmapDrawable extends androidx.core.graphics.drawable.RoundedBitmapDrawable {
        DefaultRoundedBitmapDrawable(android.content.res.Resources resources, android.graphics.Bitmap bitmap) {
            super(resources, bitmap);
        }

        @Override // androidx.core.graphics.drawable.RoundedBitmapDrawable
        public void setMipMap(boolean z) {
            if (this.mBitmap != null) {
                androidx.core.graphics.BitmapCompat.setHasMipMap(this.mBitmap, z);
                invalidateSelf();
            }
        }

        @Override // androidx.core.graphics.drawable.RoundedBitmapDrawable
        public boolean hasMipMap() {
            return this.mBitmap != null && androidx.core.graphics.BitmapCompat.hasMipMap(this.mBitmap);
        }

        @Override // androidx.core.graphics.drawable.RoundedBitmapDrawable
        void gravityCompatApply(int i, int i2, int i3, android.graphics.Rect rect, android.graphics.Rect rect2) {
            androidx.core.view.GravityCompat.apply(i, i2, i3, rect, rect2, 0);
        }
    }

    public static androidx.core.graphics.drawable.RoundedBitmapDrawable create(android.content.res.Resources resources, android.graphics.Bitmap bitmap) {
        return new androidx.core.graphics.drawable.RoundedBitmapDrawable21(resources, bitmap);
    }

    public static androidx.core.graphics.drawable.RoundedBitmapDrawable create(android.content.res.Resources resources, java.lang.String str) {
        androidx.core.graphics.drawable.RoundedBitmapDrawable roundedBitmapDrawableCreate = create(resources, android.graphics.BitmapFactory.decodeFile(str));
        if (roundedBitmapDrawableCreate.getBitmap() == null) {
            android.util.Log.w(TAG, "RoundedBitmapDrawable cannot decode " + str);
        }
        return roundedBitmapDrawableCreate;
    }

    public static androidx.core.graphics.drawable.RoundedBitmapDrawable create(android.content.res.Resources resources, java.io.InputStream inputStream) {
        androidx.core.graphics.drawable.RoundedBitmapDrawable roundedBitmapDrawableCreate = create(resources, android.graphics.BitmapFactory.decodeStream(inputStream));
        if (roundedBitmapDrawableCreate.getBitmap() == null) {
            android.util.Log.w(TAG, "RoundedBitmapDrawable cannot decode " + inputStream);
        }
        return roundedBitmapDrawableCreate;
    }

    private RoundedBitmapDrawableFactory() {
    }
}
