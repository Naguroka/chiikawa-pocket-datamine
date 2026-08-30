package okio;

/* JADX INFO: compiled from: SegmentPool.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000eH\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0006H\u0007J\b\u0010\u0014\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u001e\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000e0\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000f¨\u0006\u0015"}, d2 = {"Lokio/SegmentPool;", "", "()V", "HASH_BUCKET_COUNT", "", "LOCK", "Lokio/Segment;", "MAX_SIZE", "getMAX_SIZE", "()I", "byteCount", "getByteCount", "hashBuckets", "", "Ljava/util/concurrent/atomic/AtomicReference;", "[Ljava/util/concurrent/atomic/AtomicReference;", "firstRef", "recycle", "", com.json.y3.i, "take", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SegmentPool {
    private static final int HASH_BUCKET_COUNT;
    private static final java.util.concurrent.atomic.AtomicReference<okio.Segment>[] hashBuckets;
    public static final okio.SegmentPool INSTANCE = new okio.SegmentPool();
    private static final int MAX_SIZE = 65536;
    private static final okio.Segment LOCK = new okio.Segment(new byte[0], 0, 0, false, false);

    private SegmentPool() {
    }

    static {
        int iHighestOneBit = java.lang.Integer.highestOneBit((java.lang.Runtime.getRuntime().availableProcessors() * 2) - 1);
        HASH_BUCKET_COUNT = iHighestOneBit;
        java.util.concurrent.atomic.AtomicReference<okio.Segment>[] atomicReferenceArr = new java.util.concurrent.atomic.AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new java.util.concurrent.atomic.AtomicReference<>();
        }
        hashBuckets = atomicReferenceArr;
    }

    public final int getMAX_SIZE() {
        return MAX_SIZE;
    }

    public final int getByteCount() {
        okio.Segment segment = firstRef().get();
        if (segment == null) {
            return 0;
        }
        return segment.limit;
    }

    @kotlin.jvm.JvmStatic
    public static final okio.Segment take() {
        java.util.concurrent.atomic.AtomicReference<okio.Segment> atomicReferenceFirstRef = INSTANCE.firstRef();
        okio.Segment segment = LOCK;
        okio.Segment andSet = atomicReferenceFirstRef.getAndSet(segment);
        if (andSet == segment) {
            return new okio.Segment();
        }
        if (andSet == null) {
            atomicReferenceFirstRef.set(null);
            return new okio.Segment();
        }
        atomicReferenceFirstRef.set(andSet.next);
        andSet.next = null;
        andSet.limit = 0;
        return andSet;
    }

    @kotlin.jvm.JvmStatic
    public static final void recycle(okio.Segment segment) {
        java.util.concurrent.atomic.AtomicReference<okio.Segment> atomicReferenceFirstRef;
        okio.Segment segment2;
        okio.Segment andSet;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(segment, "segment");
        if (!(segment.next == null && segment.prev == null)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        if (segment.shared || (andSet = (atomicReferenceFirstRef = INSTANCE.firstRef()).getAndSet((segment2 = LOCK))) == segment2) {
            return;
        }
        int i = andSet != null ? andSet.limit : 0;
        if (i >= MAX_SIZE) {
            atomicReferenceFirstRef.set(andSet);
            return;
        }
        segment.next = andSet;
        segment.pos = 0;
        segment.limit = i + 8192;
        atomicReferenceFirstRef.set(segment);
    }

    private final java.util.concurrent.atomic.AtomicReference<okio.Segment> firstRef() {
        return hashBuckets[(int) (java.lang.Thread.currentThread().getId() & (((long) HASH_BUCKET_COUNT) - 1))];
    }
}
