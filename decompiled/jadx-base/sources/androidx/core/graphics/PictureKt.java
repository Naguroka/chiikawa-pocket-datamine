package androidx.core.graphics;

/* JADX INFO: compiled from: Picture.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a9\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"record", "Landroid/graphics/Picture;", "width", "", "height", "block", "Lkotlin/Function1;", "Landroid/graphics/Canvas;", "", "Lkotlin/ExtensionFunctionType;", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class PictureKt {
    public static final android.graphics.Picture record(android.graphics.Picture picture, int i, int i2, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(picture, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        android.graphics.Canvas canvasBeginRecording = picture.beginRecording(i, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(canvasBeginRecording, "beginRecording(width, height)");
        try {
            block.invoke(canvasBeginRecording);
            return picture;
        } finally {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            picture.endRecording();
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        }
    }
}
