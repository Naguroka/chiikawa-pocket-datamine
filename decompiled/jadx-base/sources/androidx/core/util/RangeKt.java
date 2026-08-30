package androidx.core.util;

/* JADX INFO: compiled from: Range.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0087\f\u001a6\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0006\u001a\u0002H\u0002H\u0087\n¢\u0006\u0002\u0010\u0007\u001a7\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0087\n\u001a0\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\u0002H\u00022\u0006\u0010\t\u001a\u0002H\u0002H\u0087\f¢\u0006\u0002\u0010\n\u001a(\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\f\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0007\u001a(\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\fH\u0007¨\u0006\u000e"}, d2 = {"and", "Landroid/util/Range;", "T", "", "other", "plus", "value", "(Landroid/util/Range;Ljava/lang/Comparable;)Landroid/util/Range;", "rangeTo", "that", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Landroid/util/Range;", "toClosedRange", "Lkotlin/ranges/ClosedRange;", "toRange", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class RangeKt {
    public static final <T extends java.lang.Comparable<? super T>> android.util.Range<T> rangeTo(T t, T that) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(that, "that");
        return new android.util.Range<>(t, that);
    }

    public static final <T extends java.lang.Comparable<? super T>> android.util.Range<T> plus(android.util.Range<T> range, T value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        android.util.Range<T> rangeExtend = range.extend(value);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(rangeExtend, "extend(value)");
        return rangeExtend;
    }

    public static final <T extends java.lang.Comparable<? super T>> android.util.Range<T> plus(android.util.Range<T> range, android.util.Range<T> other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        android.util.Range<T> rangeExtend = range.extend(other);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(rangeExtend, "extend(other)");
        return rangeExtend;
    }

    public static final <T extends java.lang.Comparable<? super T>> android.util.Range<T> and(android.util.Range<T> range, android.util.Range<T> other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        android.util.Range<T> rangeIntersect = range.intersect(other);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(rangeIntersect, "intersect(other)");
        return rangeIntersect;
    }

    public static final <T extends java.lang.Comparable<? super T>> kotlin.ranges.ClosedRange<T> toClosedRange(final android.util.Range<T> range) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "<this>");
        return (kotlin.ranges.ClosedRange) new kotlin.ranges.ClosedRange<T>() { // from class: androidx.core.util.RangeKt.toClosedRange.1
            /* JADX WARN: Incorrect types in method signature: (TT;)Z */
            @Override // kotlin.ranges.ClosedRange
            public boolean contains(java.lang.Comparable comparable) {
                return kotlin.ranges.ClosedRange.DefaultImpls.contains(this, comparable);
            }

            @Override // kotlin.ranges.ClosedRange
            public boolean isEmpty() {
                return kotlin.ranges.ClosedRange.DefaultImpls.isEmpty(this);
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // kotlin.ranges.ClosedRange
            public java.lang.Comparable getEndInclusive() {
                return range.getUpper();
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // kotlin.ranges.ClosedRange
            public java.lang.Comparable getStart() {
                return range.getLower();
            }
        };
    }

    public static final <T extends java.lang.Comparable<? super T>> android.util.Range<T> toRange(kotlin.ranges.ClosedRange<T> closedRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return new android.util.Range<>(closedRange.getStart(), closedRange.getEndInclusive());
    }
}
