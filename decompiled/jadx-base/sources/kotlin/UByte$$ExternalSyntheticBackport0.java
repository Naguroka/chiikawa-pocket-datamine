package kotlin;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class UByte$$ExternalSyntheticBackport0 {
    public static /* synthetic */ int m(int i, int i2) {
        return (int) ((((long) i) & androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE) % (((long) i2) & androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE));
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ long m1370m(long j, long j2) {
        if (j2 < 0) {
            return (j ^ Long.MIN_VALUE) < (j2 ^ Long.MIN_VALUE) ? j : j - j2;
        }
        if (j >= 0) {
            return j % j2;
        }
        long j3 = j - ((((j >>> 1) / j2) << 1) * j2);
        if ((j3 ^ Long.MIN_VALUE) < (j2 ^ Long.MIN_VALUE)) {
            j2 = 0;
        }
        return j3 - j2;
    }

    public static /* synthetic */ java.lang.String m(java.lang.CharSequence charSequence, java.lang.Iterable iterable) {
        if (charSequence == null) {
            throw new java.lang.NullPointerException(androidx.media3.extractor.text.ttml.TtmlNode.RUBY_DELIMITER);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator it = iterable.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((java.lang.CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append(charSequence);
            }
        }
        return sb.toString();
    }

    public static /* synthetic */ java.lang.String m(java.lang.CharSequence charSequence, java.lang.CharSequence[] charSequenceArr) {
        if (charSequence == null) {
            throw new java.lang.NullPointerException(androidx.media3.extractor.text.ttml.TtmlNode.RUBY_DELIMITER);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (charSequenceArr.length > 0) {
            sb.append(charSequenceArr[0]);
            for (int i = 1; i < charSequenceArr.length; i++) {
                sb.append(charSequence);
                sb.append(charSequenceArr[i]);
            }
        }
        return sb.toString();
    }

    public static /* synthetic */ boolean m(java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.Object obj, java.lang.Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean m(java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray, int i, java.lang.Object obj, java.lang.Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i, obj, obj2)) {
            if (atomicReferenceArray.get(i) != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean m(java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, obj3)) {
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean m(sun.misc.Unsafe unsafe, java.lang.Object obj, long j, java.lang.Object obj2, java.lang.Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ int m$1(int i, int i2) {
        return (int) ((((long) i) & androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE) / (((long) i2) & androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE));
    }

    public static /* synthetic */ long m$1(long j, long j2) {
        if (j2 < 0) {
            return (j ^ Long.MIN_VALUE) < (j2 ^ Long.MIN_VALUE) ? 0L : 1L;
        }
        if (j >= 0) {
            return j / j2;
        }
        long j3 = ((j >>> 1) / j2) << 1;
        return j3 + ((long) (((j - (j3 * j2)) ^ Long.MIN_VALUE) < (j2 ^ Long.MIN_VALUE) ? 0 : 1));
    }
}
