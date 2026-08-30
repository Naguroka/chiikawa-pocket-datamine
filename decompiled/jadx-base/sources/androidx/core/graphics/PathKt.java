package androidx.core.graphics;

/* JADX INFO: compiled from: Path.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007\u001a\u0015\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\t\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010\n\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f¨\u0006\f"}, d2 = {"and", "Landroid/graphics/Path;", androidx.media3.extractor.text.ttml.TtmlNode.TAG_P, "flatten", "", "Landroidx/core/graphics/PathSegment;", "error", "", "minus", "or", "plus", "xor", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class PathKt {
    public static /* synthetic */ java.lang.Iterable flatten$default(android.graphics.Path path, float f, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = 0.5f;
        }
        return flatten(path, f);
    }

    public static final java.lang.Iterable<androidx.core.graphics.PathSegment> flatten(android.graphics.Path path, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        java.util.Collection<androidx.core.graphics.PathSegment> collectionFlatten = androidx.core.graphics.PathUtils.flatten(path, f);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(collectionFlatten, "flatten(this, error)");
        return collectionFlatten;
    }

    public static final android.graphics.Path plus(android.graphics.Path path, android.graphics.Path p) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p, "p");
        android.graphics.Path path2 = new android.graphics.Path(path);
        path2.op(p, android.graphics.Path.Op.UNION);
        return path2;
    }

    public static final android.graphics.Path minus(android.graphics.Path path, android.graphics.Path p) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p, "p");
        android.graphics.Path path2 = new android.graphics.Path(path);
        path2.op(p, android.graphics.Path.Op.DIFFERENCE);
        return path2;
    }

    public static final android.graphics.Path and(android.graphics.Path path, android.graphics.Path p) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p, "p");
        android.graphics.Path path2 = new android.graphics.Path();
        path2.op(path, p, android.graphics.Path.Op.INTERSECT);
        return path2;
    }

    public static final android.graphics.Path xor(android.graphics.Path path, android.graphics.Path p) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p, "p");
        android.graphics.Path path2 = new android.graphics.Path(path);
        path2.op(p, android.graphics.Path.Op.XOR);
        return path2;
    }

    public static final android.graphics.Path or(android.graphics.Path path, android.graphics.Path p) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p, "p");
        android.graphics.Path path2 = new android.graphics.Path(path);
        path2.op(p, android.graphics.Path.Op.UNION);
        return path2;
    }
}
