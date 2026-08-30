package okio;

/* JADX INFO: compiled from: Segment.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B/\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u0004\u0018\u00010\u0000J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0000J\u0006\u0010\u0013\u001a\u00020\u0000J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0006J\u0006\u0010\u0016\u001a\u00020\u0000J\u0016\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0006R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lokio/Segment;", "", "()V", "data", "", "pos", "", "limit", "shared", "", "owner", "([BIIZZ)V", "next", "prev", "compact", "", "pop", com.adjust.sdk.Constants.PUSH, com.json.y3.i, "sharedCopy", "split", "byteCount", "unsharedCopy", "writeTo", "sink", "Companion", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Segment {
    public static final int SHARE_MINIMUM = 1024;
    public static final int SIZE = 8192;
    public final byte[] data;
    public int limit;
    public okio.Segment next;
    public boolean owner;
    public int pos;
    public okio.Segment prev;
    public boolean shared;

    public Segment() {
        this.data = new byte[8192];
        this.owner = true;
        this.shared = false;
    }

    public Segment(byte[] data, int i, int i2, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
        this.pos = i;
        this.limit = i2;
        this.shared = z;
        this.owner = z2;
    }

    public final okio.Segment sharedCopy() {
        this.shared = true;
        return new okio.Segment(this.data, this.pos, this.limit, true, false);
    }

    public final okio.Segment unsharedCopy() {
        byte[] bArr = this.data;
        byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
        return new okio.Segment(bArrCopyOf, this.pos, this.limit, false, true);
    }

    public final okio.Segment pop() {
        okio.Segment segment = this.next;
        if (segment == this) {
            segment = null;
        }
        okio.Segment segment2 = this.prev;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
        segment2.next = this.next;
        okio.Segment segment3 = this.next;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment3);
        segment3.prev = this.prev;
        this.next = null;
        this.prev = null;
        return segment;
    }

    public final okio.Segment push(okio.Segment segment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(segment, "segment");
        segment.prev = this;
        segment.next = this.next;
        okio.Segment segment2 = this.next;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
        segment2.prev = segment;
        this.next = segment;
        return segment;
    }

    public final okio.Segment split(int byteCount) {
        okio.Segment segmentTake;
        if (!(byteCount > 0 && byteCount <= this.limit - this.pos)) {
            throw new java.lang.IllegalArgumentException("byteCount out of range".toString());
        }
        if (byteCount >= 1024) {
            segmentTake = sharedCopy();
        } else {
            segmentTake = okio.SegmentPool.take();
            byte[] bArr = this.data;
            byte[] bArr2 = segmentTake.data;
            int i = this.pos;
            kotlin.collections.ArraysKt.copyInto$default(bArr, bArr2, 0, i, i + byteCount, 2, (java.lang.Object) null);
        }
        segmentTake.limit = segmentTake.pos + byteCount;
        this.pos += byteCount;
        okio.Segment segment = this.prev;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        segment.push(segmentTake);
        return segmentTake;
    }

    public final void compact() {
        okio.Segment segment = this.prev;
        int i = 0;
        if (!(segment != this)) {
            throw new java.lang.IllegalStateException("cannot compact".toString());
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        if (segment.owner) {
            int i2 = this.limit - this.pos;
            okio.Segment segment2 = this.prev;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
            int i3 = 8192 - segment2.limit;
            okio.Segment segment3 = this.prev;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment3);
            if (!segment3.shared) {
                okio.Segment segment4 = this.prev;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment4);
                i = segment4.pos;
            }
            if (i2 > i3 + i) {
                return;
            }
            okio.Segment segment5 = this.prev;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment5);
            writeTo(segment5, i2);
            pop();
            okio.SegmentPool.recycle(this);
        }
    }

    public final void writeTo(okio.Segment sink, int byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        if (!sink.owner) {
            throw new java.lang.IllegalStateException("only owner can write".toString());
        }
        int i = sink.limit;
        if (i + byteCount > 8192) {
            if (sink.shared) {
                throw new java.lang.IllegalArgumentException();
            }
            int i2 = sink.pos;
            if ((i + byteCount) - i2 > 8192) {
                throw new java.lang.IllegalArgumentException();
            }
            byte[] bArr = sink.data;
            kotlin.collections.ArraysKt.copyInto$default(bArr, bArr, 0, i2, i, 2, (java.lang.Object) null);
            sink.limit -= sink.pos;
            sink.pos = 0;
        }
        byte[] bArr2 = this.data;
        byte[] bArr3 = sink.data;
        int i3 = sink.limit;
        int i4 = this.pos;
        kotlin.collections.ArraysKt.copyInto(bArr2, bArr3, i3, i4, i4 + byteCount);
        sink.limit += byteCount;
        this.pos += byteCount;
    }
}
