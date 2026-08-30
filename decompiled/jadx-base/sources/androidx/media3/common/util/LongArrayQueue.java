package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public final class LongArrayQueue {
    public static final int DEFAULT_INITIAL_CAPACITY = 16;
    private long[] data;
    private int headIndex;
    private int size;
    private int tailIndex;
    private int wrapAroundMask;

    public LongArrayQueue() {
        this(16);
    }

    public LongArrayQueue(int i) {
        androidx.media3.common.util.Assertions.checkArgument(i >= 0 && i <= 1073741824);
        i = i == 0 ? 1 : i;
        i = java.lang.Integer.bitCount(i) != 1 ? java.lang.Integer.highestOneBit(i - 1) << 1 : i;
        this.headIndex = 0;
        this.tailIndex = -1;
        this.size = 0;
        long[] jArr = new long[i];
        this.data = jArr;
        this.wrapAroundMask = jArr.length - 1;
    }

    public void add(long j) {
        if (this.size == this.data.length) {
            doubleArraySize();
        }
        int i = (this.tailIndex + 1) & this.wrapAroundMask;
        this.tailIndex = i;
        this.data[i] = j;
        this.size++;
    }

    public long remove() {
        int i = this.size;
        if (i == 0) {
            throw new java.util.NoSuchElementException();
        }
        long[] jArr = this.data;
        int i2 = this.headIndex;
        long j = jArr[i2];
        this.headIndex = this.wrapAroundMask & (i2 + 1);
        this.size = i - 1;
        return j;
    }

    public long element() {
        if (this.size == 0) {
            throw new java.util.NoSuchElementException();
        }
        return this.data[this.headIndex];
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void clear() {
        this.headIndex = 0;
        this.tailIndex = -1;
        this.size = 0;
    }

    int capacity() {
        return this.data.length;
    }

    private void doubleArraySize() {
        long[] jArr = this.data;
        int length = jArr.length << 1;
        if (length < 0) {
            throw new java.lang.IllegalStateException();
        }
        long[] jArr2 = new long[length];
        int length2 = jArr.length;
        int i = this.headIndex;
        int i2 = length2 - i;
        java.lang.System.arraycopy(jArr, i, jArr2, 0, i2);
        java.lang.System.arraycopy(this.data, 0, jArr2, i2, i);
        this.headIndex = 0;
        this.tailIndex = this.size - 1;
        this.data = jArr2;
        this.wrapAroundMask = jArr2.length - 1;
    }
}
