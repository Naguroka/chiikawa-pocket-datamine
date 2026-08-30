package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class ConsumingQueueIterator<T> extends com.google.common.collect.AbstractIterator<T> {
    private final java.util.Queue<T> queue;

    ConsumingQueueIterator(java.util.Queue<T> queue) {
        this.queue = (java.util.Queue) com.google.common.base.Preconditions.checkNotNull(queue);
    }

    @Override // com.google.common.collect.AbstractIterator
    @javax.annotation.CheckForNull
    protected T computeNext() {
        if (this.queue.isEmpty()) {
            return endOfData();
        }
        return this.queue.remove();
    }
}
