package androidx.core.graphics;

/* JADX INFO: compiled from: Rect.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010\u0000\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\f\u001a\r\u0010\u0004\u001a\u00020\u0005*\u00020\u0001H\u0086\n\u001a\r\u0010\u0004\u001a\u00020\u0006*\u00020\u0003H\u0086\n\u001a\r\u0010\u0007\u001a\u00020\u0005*\u00020\u0001H\u0086\n\u001a\r\u0010\u0007\u001a\u00020\u0006*\u00020\u0003H\u0086\n\u001a\r\u0010\b\u001a\u00020\u0005*\u00020\u0001H\u0086\n\u001a\r\u0010\b\u001a\u00020\u0006*\u00020\u0003H\u0086\n\u001a\r\u0010\t\u001a\u00020\u0005*\u00020\u0001H\u0086\n\u001a\r\u0010\t\u001a\u00020\u0006*\u00020\u0003H\u0086\n\u001a\u0015\u0010\n\u001a\u00020\u000b*\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0086\n\u001a\u0015\u0010\n\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\f\u001a\u00020\u000eH\u0086\n\u001a\u0015\u0010\u000f\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\rH\u0086\n\u001a\u0015\u0010\u000f\u001a\u00020\u0011*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u000f\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0005H\u0086\n\u001a\u0015\u0010\u000f\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000eH\u0086\n\u001a\u0015\u0010\u000f\u001a\u00020\u0011*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010\u000f\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0006H\u0086\n\u001a\u0015\u0010\u0012\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\f\u001a\u0015\u0010\u0012\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\f\u001a\u0015\u0010\u0013\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\rH\u0086\n\u001a\u0015\u0010\u0013\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u0013\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0005H\u0086\n\u001a\u0015\u0010\u0013\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000eH\u0086\n\u001a\u0015\u0010\u0013\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010\u0013\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0006H\u0086\n\u001a\u0015\u0010\u0014\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0005H\u0086\n\u001a\u0015\u0010\u0014\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0006H\u0086\n\u001a\u0015\u0010\u0014\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0005H\u0086\n\u001a\r\u0010\u0016\u001a\u00020\u0001*\u00020\u0003H\u0086\b\u001a\r\u0010\u0017\u001a\u00020\u0003*\u00020\u0001H\u0086\b\u001a\r\u0010\u0018\u001a\u00020\u0011*\u00020\u0001H\u0086\b\u001a\r\u0010\u0018\u001a\u00020\u0011*\u00020\u0003H\u0086\b\u001a\u0015\u0010\u0019\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bH\u0086\b\u001a\u0015\u0010\u001c\u001a\u00020\u0011*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\f\u001a\u0015\u0010\u001c\u001a\u00020\u0011*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\f¨\u0006\u001d"}, d2 = {"and", "Landroid/graphics/Rect;", com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, "Landroid/graphics/RectF;", "component1", "", "", "component2", "component3", "component4", "contains", "", androidx.media3.extractor.text.ttml.TtmlNode.TAG_P, "Landroid/graphics/Point;", "Landroid/graphics/PointF;", "minus", "xy", "Landroid/graphics/Region;", "or", "plus", "times", "factor", "toRect", "toRectF", "toRegion", "transform", "m", "Landroid/graphics/Matrix;", "xor", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class RectKt {
    public static final int component1(android.graphics.Rect rect) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rect, "<this>");
        return rect.left;
    }

    public static final int component2(android.graphics.Rect rect) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rect, "<this>");
        return rect.top;
    }

    public static final int component3(android.graphics.Rect rect) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rect, "<this>");
        return rect.right;
    }

    public static final int component4(android.graphics.Rect rect) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rect, "<this>");
        return rect.bottom;
    }

    public static final float component1(android.graphics.RectF rectF) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rectF, "<this>");
        return rectF.left;
    }

    public static final float component2(android.graphics.RectF rectF) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rectF, "<this>");
        return rectF.top;
    }

    public static final float component3(android.graphics.RectF rectF) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rectF, "<this>");
        return rectF.right;
    }

    public static final float component4(android.graphics.RectF rectF) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rectF, "<this>");
        return rectF.bottom;
    }

    public static final android.graphics.Rect plus(android.graphics.Rect rect, android.graphics.Rect r) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rect, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r, "r");
        android.graphics.Rect rect2 = new android.graphics.Rect(rect);
        rect2.union(r);
        return rect2;
    }

    public static final android.graphics.RectF plus(android.graphics.RectF rectF, android.graphics.RectF r) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rectF, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r, "r");
        android.graphics.RectF rectF2 = new android.graphics.RectF(rectF);
        rectF2.union(r);
        return rectF2;
    }

    public static final android.graphics.Rect plus(android.graphics.Rect rect, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rect, "<this>");
        android.graphics.Rect rect2 = new android.graphics.Rect(rect);
        rect2.offset(i, i);
        return rect2;
    }

    public static final android.graphics.RectF plus(android.graphics.RectF rectF, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rectF, "<this>");
        android.graphics.RectF rectF2 = new android.graphics.RectF(rectF);
        rectF2.offset(f, f);
        return rectF2;
    }

    public static final android.graphics.Rect plus(android.graphics.Rect rect, android.graphics.Point xy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rect, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(xy, "xy");
        android.graphics.Rect rect2 = new android.graphics.Rect(rect);
        rect2.offset(xy.x, xy.y);
        return rect2;
    }

    public static final android.graphics.RectF plus(android.graphics.RectF rectF, android.graphics.PointF xy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rectF, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(xy, "xy");
        android.graphics.RectF rectF2 = new android.graphics.RectF(rectF);
        rectF2.offset(xy.x, xy.y);
        return rectF2;
    }

    public static final android.graphics.Region minus(android.graphics.Rect rect, android.graphics.Rect r) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rect, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r, "r");
        android.graphics.Region region = new android.graphics.Region(rect);
        region.op(r, android.graphics.Region.Op.DIFFERENCE);
        return region;
    }

    public static final android.graphics.Region minus(android.graphics.RectF rectF, android.graphics.RectF r) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rectF, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r, "r");
        android.graphics.Rect rect = new android.graphics.Rect();
        rectF.roundOut(rect);
        android.graphics.Region region = new android.graphics.Region(rect);
        android.graphics.Rect rect2 = new android.graphics.Rect();
        r.roundOut(rect2);
        region.op(rect2, android.graphics.Region.Op.DIFFERENCE);
        return region;
    }

    public static final android.graphics.Rect minus(android.graphics.Rect rect, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rect, "<this>");
        android.graphics.Rect rect2 = new android.graphics.Rect(rect);
        int i2 = -i;
        rect2.offset(i2, i2);
        return rect2;
    }

    public static final android.graphics.RectF minus(android.graphics.RectF rectF, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rectF, "<this>");
        android.graphics.RectF rectF2 = new android.graphics.RectF(rectF);
        float f2 = -f;
        rectF2.offset(f2, f2);
        return rectF2;
    }

    public static final android.graphics.Rect minus(android.graphics.Rect rect, android.graphics.Point xy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rect, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(xy, "xy");
        android.graphics.Rect rect2 = new android.graphics.Rect(rect);
        rect2.offset(-xy.x, -xy.y);
        return rect2;
    }

    public static final android.graphics.RectF minus(android.graphics.RectF rectF, android.graphics.PointF xy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rectF, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(xy, "xy");
        android.graphics.RectF rectF2 = new android.graphics.RectF(rectF);
        rectF2.offset(-xy.x, -xy.y);
        return rectF2;
    }

    public static final android.graphics.Rect times(android.graphics.Rect rect, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rect, "<this>");
        android.graphics.Rect rect2 = new android.graphics.Rect(rect);
        rect2.top *= i;
        rect2.left *= i;
        rect2.right *= i;
        rect2.bottom *= i;
        return rect2;
    }

    public static final android.graphics.RectF times(android.graphics.RectF rectF, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rectF, "<this>");
        android.graphics.RectF rectF2 = new android.graphics.RectF(rectF);
        rectF2.top *= f;
        rectF2.left *= f;
        rectF2.right *= f;
        rectF2.bottom *= f;
        return rectF2;
    }

    public static final android.graphics.Rect and(android.graphics.Rect rect, android.graphics.Rect r) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rect, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r, "r");
        android.graphics.Rect rect2 = new android.graphics.Rect(rect);
        rect2.intersect(r);
        return rect2;
    }

    public static final android.graphics.RectF and(android.graphics.RectF rectF, android.graphics.RectF r) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rectF, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r, "r");
        android.graphics.RectF rectF2 = new android.graphics.RectF(rectF);
        rectF2.intersect(r);
        return rectF2;
    }

    public static final android.graphics.Region xor(android.graphics.Rect rect, android.graphics.Rect r) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rect, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r, "r");
        android.graphics.Region region = new android.graphics.Region(rect);
        region.op(r, android.graphics.Region.Op.XOR);
        return region;
    }

    public static final android.graphics.Region xor(android.graphics.RectF rectF, android.graphics.RectF r) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rectF, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r, "r");
        android.graphics.Rect rect = new android.graphics.Rect();
        rectF.roundOut(rect);
        android.graphics.Region region = new android.graphics.Region(rect);
        android.graphics.Rect rect2 = new android.graphics.Rect();
        r.roundOut(rect2);
        region.op(rect2, android.graphics.Region.Op.XOR);
        return region;
    }

    public static final boolean contains(android.graphics.Rect rect, android.graphics.Point p) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rect, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p, "p");
        return rect.contains(p.x, p.y);
    }

    public static final boolean contains(android.graphics.RectF rectF, android.graphics.PointF p) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rectF, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p, "p");
        return rectF.contains(p.x, p.y);
    }

    public static final android.graphics.RectF toRectF(android.graphics.Rect rect) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rect, "<this>");
        return new android.graphics.RectF(rect);
    }

    public static final android.graphics.Rect toRect(android.graphics.RectF rectF) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rectF, "<this>");
        android.graphics.Rect rect = new android.graphics.Rect();
        rectF.roundOut(rect);
        return rect;
    }

    public static final android.graphics.Region toRegion(android.graphics.Rect rect) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rect, "<this>");
        return new android.graphics.Region(rect);
    }

    public static final android.graphics.Region toRegion(android.graphics.RectF rectF) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rectF, "<this>");
        android.graphics.Rect rect = new android.graphics.Rect();
        rectF.roundOut(rect);
        return new android.graphics.Region(rect);
    }

    public static final android.graphics.RectF transform(android.graphics.RectF rectF, android.graphics.Matrix m) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rectF, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m, "m");
        m.mapRect(rectF);
        return rectF;
    }

    public static final android.graphics.RectF times(android.graphics.RectF rectF, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rectF, "<this>");
        float f = i;
        android.graphics.RectF rectF2 = new android.graphics.RectF(rectF);
        rectF2.top *= f;
        rectF2.left *= f;
        rectF2.right *= f;
        rectF2.bottom *= f;
        return rectF2;
    }

    public static final android.graphics.Rect or(android.graphics.Rect rect, android.graphics.Rect r) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rect, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r, "r");
        android.graphics.Rect rect2 = new android.graphics.Rect(rect);
        rect2.union(r);
        return rect2;
    }

    public static final android.graphics.RectF or(android.graphics.RectF rectF, android.graphics.RectF r) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rectF, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r, "r");
        android.graphics.RectF rectF2 = new android.graphics.RectF(rectF);
        rectF2.union(r);
        return rectF2;
    }
}
