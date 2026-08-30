package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
final class SpannedData<V> {
    private int memoizedReadIndex;
    private final androidx.media3.common.util.Consumer<V> removeCallback;
    private final android.util.SparseArray<V> spans;

    static /* synthetic */ void lambda$new$0(java.lang.Object obj) {
    }

    public SpannedData() {
        this(new androidx.media3.common.util.Consumer() { // from class: androidx.media3.exoplayer.source.SpannedData$$ExternalSyntheticLambda0
            @Override // androidx.media3.common.util.Consumer
            public final void accept(java.lang.Object obj) {
                androidx.media3.exoplayer.source.SpannedData.lambda$new$0(obj);
            }
        });
    }

    public SpannedData(androidx.media3.common.util.Consumer<V> consumer) {
        this.spans = new android.util.SparseArray<>();
        this.removeCallback = consumer;
        this.memoizedReadIndex = -1;
    }

    public V get(int i) {
        if (this.memoizedReadIndex == -1) {
            this.memoizedReadIndex = 0;
        }
        while (true) {
            int i2 = this.memoizedReadIndex;
            if (i2 <= 0 || i >= this.spans.keyAt(i2)) {
                break;
            }
            this.memoizedReadIndex--;
        }
        while (this.memoizedReadIndex < this.spans.size() - 1 && i >= this.spans.keyAt(this.memoizedReadIndex + 1)) {
            this.memoizedReadIndex++;
        }
        return this.spans.valueAt(this.memoizedReadIndex);
    }

    public void appendSpan(int i, V v) {
        if (this.memoizedReadIndex == -1) {
            androidx.media3.common.util.Assertions.checkState(this.spans.size() == 0);
            this.memoizedReadIndex = 0;
        }
        if (this.spans.size() > 0) {
            android.util.SparseArray<V> sparseArray = this.spans;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            androidx.media3.common.util.Assertions.checkArgument(i >= iKeyAt);
            if (iKeyAt == i) {
                androidx.media3.common.util.Consumer<V> consumer = this.removeCallback;
                android.util.SparseArray<V> sparseArray2 = this.spans;
                consumer.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.spans.append(i, v);
    }

    public V getEndValue() {
        android.util.SparseArray<V> sparseArray = this.spans;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public void discardTo(int i) {
        int i2 = 0;
        while (i2 < this.spans.size() - 1) {
            int i3 = i2 + 1;
            if (i < this.spans.keyAt(i3)) {
                return;
            }
            this.removeCallback.accept(this.spans.valueAt(i2));
            this.spans.removeAt(i2);
            int i4 = this.memoizedReadIndex;
            if (i4 > 0) {
                this.memoizedReadIndex = i4 - 1;
            }
            i2 = i3;
        }
    }

    public void discardFrom(int i) {
        for (int size = this.spans.size() - 1; size >= 0 && i < this.spans.keyAt(size); size--) {
            this.removeCallback.accept(this.spans.valueAt(size));
            this.spans.removeAt(size);
        }
        this.memoizedReadIndex = this.spans.size() > 0 ? java.lang.Math.min(this.memoizedReadIndex, this.spans.size() - 1) : -1;
    }

    public void clear() {
        for (int i = 0; i < this.spans.size(); i++) {
            this.removeCallback.accept(this.spans.valueAt(i));
        }
        this.memoizedReadIndex = -1;
        this.spans.clear();
    }

    public boolean isEmpty() {
        return this.spans.size() == 0;
    }
}
