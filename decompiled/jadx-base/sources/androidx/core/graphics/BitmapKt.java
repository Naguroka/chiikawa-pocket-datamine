package androidx.core.graphics;

/* JADX INFO: compiled from: Bitmap.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0086\b\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b\u001a)\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010H\u0086\bø\u0001\u0000\u001a\u0015\u0010\u0011\u001a\u00020\b*\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0013H\u0086\n\u001a\u0015\u0010\u0011\u001a\u00020\b*\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0014H\u0086\n\u001a\u001d\u0010\u0015\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003H\u0086\n\u001a'\u0010\u0018\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\bH\u0086\b\u001a'\u0010\u001a\u001a\u00020\u000f*\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\b\b\u0001\u0010\u001b\u001a\u00020\u0003H\u0086\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001c"}, d2 = {"createBitmap", "Landroid/graphics/Bitmap;", "width", "", "height", "config", "Landroid/graphics/Bitmap$Config;", "hasAlpha", "", "colorSpace", "Landroid/graphics/ColorSpace;", "applyCanvas", "block", "Lkotlin/Function1;", "Landroid/graphics/Canvas;", "", "Lkotlin/ExtensionFunctionType;", "contains", androidx.media3.extractor.text.ttml.TtmlNode.TAG_P, "Landroid/graphics/Point;", "Landroid/graphics/PointF;", "get", "x", "y", "scale", "filter", "set", "color", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class BitmapKt {
    public static final android.graphics.Bitmap applyCanvas(android.graphics.Bitmap bitmap, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        block.invoke(new android.graphics.Canvas(bitmap));
        return bitmap;
    }

    public static final int get(android.graphics.Bitmap bitmap, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "<this>");
        return bitmap.getPixel(i, i2);
    }

    public static final void set(android.graphics.Bitmap bitmap, int i, int i2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "<this>");
        bitmap.setPixel(i, i2, i3);
    }

    public static /* synthetic */ android.graphics.Bitmap scale$default(android.graphics.Bitmap bitmap, int i, int i2, boolean z, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            z = true;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "<this>");
        android.graphics.Bitmap bitmapCreateScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, i, i2, z);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "createScaledBitmap(this, width, height, filter)");
        return bitmapCreateScaledBitmap;
    }

    public static final android.graphics.Bitmap scale(android.graphics.Bitmap bitmap, int i, int i2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "<this>");
        android.graphics.Bitmap bitmapCreateScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, i, i2, z);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "createScaledBitmap(this, width, height, filter)");
        return bitmapCreateScaledBitmap;
    }

    public static /* synthetic */ android.graphics.Bitmap createBitmap$default(int i, int i2, android.graphics.Bitmap.Config config, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            config = android.graphics.Bitmap.Config.ARGB_8888;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(i, i2, config);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(width, height, config)");
        return bitmapCreateBitmap;
    }

    public static final android.graphics.Bitmap createBitmap(int i, int i2, android.graphics.Bitmap.Config config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(i, i2, config);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(width, height, config)");
        return bitmapCreateBitmap;
    }

    public static /* synthetic */ android.graphics.Bitmap createBitmap$default(int i, int i2, android.graphics.Bitmap.Config config, boolean z, android.graphics.ColorSpace colorSpace, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            config = android.graphics.Bitmap.Config.ARGB_8888;
        }
        if ((i3 & 8) != 0) {
            z = true;
        }
        if ((i3 & 16) != 0) {
            colorSpace = android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.SRGB);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(colorSpace, "get(ColorSpace.Named.SRGB)");
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(i, i2, config, z, colorSpace);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(width, heig…ig, hasAlpha, colorSpace)");
        return bitmapCreateBitmap;
    }

    public static final android.graphics.Bitmap createBitmap(int i, int i2, android.graphics.Bitmap.Config config, boolean z, android.graphics.ColorSpace colorSpace) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(i, i2, config, z, colorSpace);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(width, heig…ig, hasAlpha, colorSpace)");
        return bitmapCreateBitmap;
    }

    public static final boolean contains(android.graphics.Bitmap bitmap, android.graphics.Point p) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p, "p");
        int width = bitmap.getWidth();
        int i = p.x;
        return (i >= 0 && i < width) && p.y >= 0 && p.y < bitmap.getHeight();
    }

    public static final boolean contains(android.graphics.Bitmap bitmap, android.graphics.PointF p) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p, "p");
        return p.x >= 0.0f && p.x < ((float) bitmap.getWidth()) && p.y >= 0.0f && p.y < ((float) bitmap.getHeight());
    }
}
