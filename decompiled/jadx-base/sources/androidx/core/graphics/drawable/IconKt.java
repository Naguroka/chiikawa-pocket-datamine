package androidx.core.graphics.drawable;

/* JADX INFO: compiled from: Icon.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0004H\u0087\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0005H\u0087\b¨\u0006\u0006"}, d2 = {"toAdaptiveIcon", "Landroid/graphics/drawable/Icon;", "Landroid/graphics/Bitmap;", "toIcon", "Landroid/net/Uri;", "", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class IconKt {
    public static final android.graphics.drawable.Icon toAdaptiveIcon(android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "<this>");
        android.graphics.drawable.Icon iconCreateWithAdaptiveBitmap = android.graphics.drawable.Icon.createWithAdaptiveBitmap(bitmap);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(iconCreateWithAdaptiveBitmap, "createWithAdaptiveBitmap(this)");
        return iconCreateWithAdaptiveBitmap;
    }

    public static final android.graphics.drawable.Icon toIcon(android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "<this>");
        android.graphics.drawable.Icon iconCreateWithBitmap = android.graphics.drawable.Icon.createWithBitmap(bitmap);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(iconCreateWithBitmap, "createWithBitmap(this)");
        return iconCreateWithBitmap;
    }

    public static final android.graphics.drawable.Icon toIcon(android.net.Uri uri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "<this>");
        android.graphics.drawable.Icon iconCreateWithContentUri = android.graphics.drawable.Icon.createWithContentUri(uri);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(iconCreateWithContentUri, "createWithContentUri(this)");
        return iconCreateWithContentUri;
    }

    public static final android.graphics.drawable.Icon toIcon(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "<this>");
        android.graphics.drawable.Icon iconCreateWithData = android.graphics.drawable.Icon.createWithData(bArr, 0, bArr.length);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(iconCreateWithData, "createWithData(this, 0, size)");
        return iconCreateWithData;
    }
}
