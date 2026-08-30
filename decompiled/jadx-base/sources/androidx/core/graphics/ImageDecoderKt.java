package androidx.core.graphics;

/* JADX INFO: compiled from: ImageDecoder.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aU\u0010\u0000\u001a\u00020\u0001*\u00020\u00022C\b\u0004\u0010\u0003\u001a=\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0002\b\fH\u0087\bø\u0001\u0000\u001aU\u0010\r\u001a\u00020\u000e*\u00020\u00022C\b\u0004\u0010\u0003\u001a=\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0002\b\fH\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, d2 = {"decodeBitmap", "Landroid/graphics/Bitmap;", "Landroid/graphics/ImageDecoder$Source;", "action", "Lkotlin/Function3;", "Landroid/graphics/ImageDecoder;", "Landroid/graphics/ImageDecoder$ImageInfo;", "Lkotlin/ParameterName;", "name", "info", "source", "", "Lkotlin/ExtensionFunctionType;", "decodeDrawable", "Landroid/graphics/drawable/Drawable;", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class ImageDecoderKt {
    public static final android.graphics.Bitmap decodeBitmap(android.graphics.ImageDecoder.Source source, final kotlin.jvm.functions.Function3<? super android.graphics.ImageDecoder, ? super android.graphics.ImageDecoder.ImageInfo, ? super android.graphics.ImageDecoder.Source, kotlin.Unit> action) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        android.graphics.Bitmap bitmapDecodeBitmap = android.graphics.ImageDecoder.decodeBitmap(source, new android.graphics.ImageDecoder.OnHeaderDecodedListener() { // from class: androidx.core.graphics.ImageDecoderKt.decodeBitmap.1
            @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
            public final void onHeaderDecoded(android.graphics.ImageDecoder decoder, android.graphics.ImageDecoder.ImageInfo info, android.graphics.ImageDecoder.Source source2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "decoder");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "info");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source2, "source");
                action.invoke(decoder, info, source2);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bitmapDecodeBitmap, "crossinline action: Imag…ction(info, source)\n    }");
        return bitmapDecodeBitmap;
    }

    public static final android.graphics.drawable.Drawable decodeDrawable(android.graphics.ImageDecoder.Source source, final kotlin.jvm.functions.Function3<? super android.graphics.ImageDecoder, ? super android.graphics.ImageDecoder.ImageInfo, ? super android.graphics.ImageDecoder.Source, kotlin.Unit> action) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        android.graphics.drawable.Drawable drawableDecodeDrawable = android.graphics.ImageDecoder.decodeDrawable(source, new android.graphics.ImageDecoder.OnHeaderDecodedListener() { // from class: androidx.core.graphics.ImageDecoderKt.decodeDrawable.1
            @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
            public final void onHeaderDecoded(android.graphics.ImageDecoder decoder, android.graphics.ImageDecoder.ImageInfo info, android.graphics.ImageDecoder.Source source2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "decoder");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "info");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source2, "source");
                action.invoke(decoder, info, source2);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(drawableDecodeDrawable, "crossinline action: Imag…ction(info, source)\n    }");
        return drawableDecodeDrawable;
    }
}
