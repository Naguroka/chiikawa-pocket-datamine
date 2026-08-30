package androidx.core.graphics;

/* JADX INFO: compiled from: Region.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0007\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\f\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\f\u001a\u0015\u0010\u0004\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0086\n\u001a3\u0010\b\u001a\u00020\t*\u00020\u00012!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\t0\u000bH\u0086\bø\u0001\u0000\u001a\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010*\u00020\u0001H\u0086\u0002\u001a\u0015\u0010\u0011\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010\u0011\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\r\u0010\u0012\u001a\u00020\u0001*\u00020\u0001H\u0086\n\u001a\u0015\u0010\u0013\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\f\u001a\u0015\u0010\u0013\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\f\u001a\u0015\u0010\u0014\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010\u0014\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\r\u0010\u0015\u001a\u00020\u0001*\u00020\u0001H\u0086\n\u001a\u0015\u0010\u0016\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\f\u001a\u0015\u0010\u0016\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"and", "Landroid/graphics/Region;", com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, "Landroid/graphics/Rect;", "contains", "", androidx.media3.extractor.text.ttml.TtmlNode.TAG_P, "Landroid/graphics/Point;", "forEach", "", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "rect", "iterator", "", "minus", "not", "or", "plus", "unaryMinus", "xor", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class RegionKt {
    public static final boolean contains(android.graphics.Region region, android.graphics.Point p) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(region, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p, "p");
        return region.contains(p.x, p.y);
    }

    public static final android.graphics.Region plus(android.graphics.Region region, android.graphics.Rect r) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(region, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r, "r");
        android.graphics.Region region2 = new android.graphics.Region(region);
        region2.union(r);
        return region2;
    }

    public static final android.graphics.Region plus(android.graphics.Region region, android.graphics.Region r) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(region, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r, "r");
        android.graphics.Region region2 = new android.graphics.Region(region);
        region2.op(r, android.graphics.Region.Op.UNION);
        return region2;
    }

    public static final android.graphics.Region minus(android.graphics.Region region, android.graphics.Rect r) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(region, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r, "r");
        android.graphics.Region region2 = new android.graphics.Region(region);
        region2.op(r, android.graphics.Region.Op.DIFFERENCE);
        return region2;
    }

    public static final android.graphics.Region minus(android.graphics.Region region, android.graphics.Region r) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(region, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r, "r");
        android.graphics.Region region2 = new android.graphics.Region(region);
        region2.op(r, android.graphics.Region.Op.DIFFERENCE);
        return region2;
    }

    public static final android.graphics.Region unaryMinus(android.graphics.Region region) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(region, "<this>");
        android.graphics.Region region2 = new android.graphics.Region(region.getBounds());
        region2.op(region, android.graphics.Region.Op.DIFFERENCE);
        return region2;
    }

    public static final android.graphics.Region and(android.graphics.Region region, android.graphics.Rect r) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(region, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r, "r");
        android.graphics.Region region2 = new android.graphics.Region(region);
        region2.op(r, android.graphics.Region.Op.INTERSECT);
        return region2;
    }

    public static final android.graphics.Region and(android.graphics.Region region, android.graphics.Region r) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(region, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r, "r");
        android.graphics.Region region2 = new android.graphics.Region(region);
        region2.op(r, android.graphics.Region.Op.INTERSECT);
        return region2;
    }

    public static final android.graphics.Region xor(android.graphics.Region region, android.graphics.Rect r) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(region, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r, "r");
        android.graphics.Region region2 = new android.graphics.Region(region);
        region2.op(r, android.graphics.Region.Op.XOR);
        return region2;
    }

    public static final android.graphics.Region xor(android.graphics.Region region, android.graphics.Region r) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(region, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r, "r");
        android.graphics.Region region2 = new android.graphics.Region(region);
        region2.op(r, android.graphics.Region.Op.XOR);
        return region2;
    }

    public static final void forEach(android.graphics.Region region, kotlin.jvm.functions.Function1<? super android.graphics.Rect, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(region, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        android.graphics.RegionIterator regionIterator = new android.graphics.RegionIterator(region);
        while (true) {
            android.graphics.Rect rect = new android.graphics.Rect();
            if (!regionIterator.next(rect)) {
                return;
            } else {
                action.invoke(rect);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.core.graphics.RegionKt$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: Region.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\b\u001a\u00020\u0004H\u0096\u0002J\t\u0010\t\u001a\u00020\u0002H\u0096\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"androidx/core/graphics/RegionKt$iterator$1", "", "Landroid/graphics/Rect;", "hasMore", "", "iterator", "Landroid/graphics/RegionIterator;", "rect", "hasNext", "next", "core-ktx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 implements java.util.Iterator<android.graphics.Rect>, kotlin.jvm.internal.markers.KMappedMarker {
        private boolean hasMore;
        private final android.graphics.RegionIterator iterator;
        private final android.graphics.Rect rect;

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        AnonymousClass1(android.graphics.Region region) {
            android.graphics.RegionIterator regionIterator = new android.graphics.RegionIterator(region);
            this.iterator = regionIterator;
            android.graphics.Rect rect = new android.graphics.Rect();
            this.rect = rect;
            this.hasMore = regionIterator.next(rect);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.hasMore;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public android.graphics.Rect next() {
            if (this.hasMore) {
                android.graphics.Rect rect = new android.graphics.Rect(this.rect);
                this.hasMore = this.iterator.next(this.rect);
                return rect;
            }
            throw new java.lang.IndexOutOfBoundsException();
        }
    }

    public static final java.util.Iterator<android.graphics.Rect> iterator(android.graphics.Region region) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(region, "<this>");
        return new androidx.core.graphics.RegionKt.AnonymousClass1(region);
    }

    public static final android.graphics.Region not(android.graphics.Region region) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(region, "<this>");
        android.graphics.Region region2 = new android.graphics.Region(region.getBounds());
        region2.op(region, android.graphics.Region.Op.DIFFERENCE);
        return region2;
    }

    public static final android.graphics.Region or(android.graphics.Region region, android.graphics.Rect r) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(region, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r, "r");
        android.graphics.Region region2 = new android.graphics.Region(region);
        region2.union(r);
        return region2;
    }

    public static final android.graphics.Region or(android.graphics.Region region, android.graphics.Region r) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(region, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r, "r");
        android.graphics.Region region2 = new android.graphics.Region(region);
        region2.op(r, android.graphics.Region.Op.UNION);
        return region2;
    }
}
