package androidx.core.graphics.drawable;

/* JADX INFO: compiled from: ColorDrawable.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0003H\u0086\b¨\u0006\u0004"}, d2 = {"toDrawable", "Landroid/graphics/drawable/ColorDrawable;", "Landroid/graphics/Color;", "", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class ColorDrawableKt {
    public static final android.graphics.drawable.ColorDrawable toDrawable(int i) {
        return new android.graphics.drawable.ColorDrawable(i);
    }

    public static final android.graphics.drawable.ColorDrawable toDrawable(android.graphics.Color color) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color, "<this>");
        return new android.graphics.drawable.ColorDrawable(color.toArgb());
    }
}
