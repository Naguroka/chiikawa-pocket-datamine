package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class MinMaxPriorityQueue<E> extends java.util.AbstractQueue<E> {
    private static final int DEFAULT_CAPACITY = 11;
    private static final int EVEN_POWERS_OF_TWO = 1431655765;
    private static final int ODD_POWERS_OF_TWO = -1431655766;
    private final com.google.common.collect.MinMaxPriorityQueue<E>.Heap maxHeap;
    final int maximumSize;
    private final com.google.common.collect.MinMaxPriorityQueue<E>.Heap minHeap;
    private int modCount;
    private java.lang.Object[] queue;
    private int size;

    public static <E extends java.lang.Comparable<E>> com.google.common.collect.MinMaxPriorityQueue<E> create() {
        return new com.google.common.collect.MinMaxPriorityQueue.Builder(com.google.common.collect.Ordering.natural()).create();
    }

    public static <E extends java.lang.Comparable<E>> com.google.common.collect.MinMaxPriorityQueue<E> create(java.lang.Iterable<? extends E> initialContents) {
        return new com.google.common.collect.MinMaxPriorityQueue.Builder(com.google.common.collect.Ordering.natural()).create(initialContents);
    }

    public static <B> com.google.common.collect.MinMaxPriorityQueue.Builder<B> orderedBy(java.util.Comparator<B> comparator) {
        return new com.google.common.collect.MinMaxPriorityQueue.Builder<>(comparator);
    }

    public static com.google.common.collect.MinMaxPriorityQueue.Builder<java.lang.Comparable> expectedSize(int expectedSize) {
        return new com.google.common.collect.MinMaxPriorityQueue.Builder(com.google.common.collect.Ordering.natural()).expectedSize(expectedSize);
    }

    public static com.google.common.collect.MinMaxPriorityQueue.Builder<java.lang.Comparable> maximumSize(int maximumSize) {
        return new com.google.common.collect.MinMaxPriorityQueue.Builder(com.google.common.collect.Ordering.natural()).maximumSize(maximumSize);
    }

    public static final class Builder<B> {
        private static final int UNSET_EXPECTED_SIZE = -1;
        private final java.util.Comparator<B> comparator;
        private int expectedSize;
        private int maximumSize;

        private Builder(java.util.Comparator<B> comparator) {
            this.expectedSize = -1;
            this.maximumSize = Integer.MAX_VALUE;
            this.comparator = (java.util.Comparator) com.google.common.base.Preconditions.checkNotNull(comparator);
        }

        public com.google.common.collect.MinMaxPriorityQueue.Builder<B> expectedSize(int expectedSize) {
            com.google.common.base.Preconditions.checkArgument(expectedSize >= 0);
            this.expectedSize = expectedSize;
            return this;
        }

        public com.google.common.collect.MinMaxPriorityQueue.Builder<B> maximumSize(int maximumSize) {
            com.google.common.base.Preconditions.checkArgument(maximumSize > 0);
            this.maximumSize = maximumSize;
            return this;
        }

        public <T extends B> com.google.common.collect.MinMaxPriorityQueue<T> create() {
            return create(java.util.Collections.emptySet());
        }

        public <T extends B> com.google.common.collect.MinMaxPriorityQueue<T> create(java.lang.Iterable<? extends T> initialContents) {
            com.google.common.collect.MinMaxPriorityQueue<T> minMaxPriorityQueue = new com.google.common.collect.MinMaxPriorityQueue<>(this, com.google.common.collect.MinMaxPriorityQueue.initialQueueSize(this.expectedSize, this.maximumSize, initialContents));
            java.util.Iterator<? extends T> it = initialContents.iterator();
            while (it.hasNext()) {
                minMaxPriorityQueue.offer(it.next());
            }
            return minMaxPriorityQueue;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public <T extends B> com.google.common.collect.Ordering<T> ordering() {
            return com.google.common.collect.Ordering.from(this.comparator);
        }
    }

    private MinMaxPriorityQueue(com.google.common.collect.MinMaxPriorityQueue.Builder<? super E> builder, int queueSize) {
        com.google.common.collect.Ordering ordering = builder.ordering();
        com.google.common.collect.MinMaxPriorityQueue<E>.Heap heap = new com.google.common.collect.MinMaxPriorityQueue.Heap(ordering);
        this.minHeap = heap;
        com.google.common.collect.MinMaxPriorityQueue<E>.Heap heap2 = new com.google.common.collect.MinMaxPriorityQueue.Heap(ordering.reverse());
        this.maxHeap = heap2;
        heap.otherHeap = heap2;
        heap2.otherHeap = heap;
        this.maximumSize = ((com.google.common.collect.MinMaxPriorityQueue.Builder) builder).maximumSize;
        this.queue = new java.lang.Object[queueSize];
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.size;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(E element) {
        offer(element);
        return true;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public boolean addAll(java.util.Collection<? extends E> newElements) {
        java.util.Iterator<? extends E> it = newElements.iterator();
        boolean z = false;
        while (it.hasNext()) {
            offer(it.next());
            z = true;
        }
        return z;
    }

    @Override // java.util.Queue
    public boolean offer(E element) {
        com.google.common.base.Preconditions.checkNotNull(element);
        this.modCount++;
        int i = this.size;
        this.size = i + 1;
        growIfNeeded();
        heapForIndex(i).bubbleUp(i, element);
        return this.size <= this.maximumSize || pollLast() != element;
    }

    @Override // java.util.Queue
    @javax.annotation.CheckForNull
    public E poll() {
        if (isEmpty()) {
            return null;
        }
        return removeAndGet(0);
    }

    E elementData(int i) {
        return (E) java.util.Objects.requireNonNull(this.queue[i]);
    }

    @Override // java.util.Queue
    @javax.annotation.CheckForNull
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return elementData(0);
    }

    private int getMaxElementIndex() {
        int i = this.size;
        if (i != 1) {
            return (i == 2 || this.maxHeap.compareElements(1, 2) <= 0) ? 1 : 2;
        }
        return 0;
    }

    @javax.annotation.CheckForNull
    public E pollFirst() {
        return poll();
    }

    public E removeFirst() {
        return remove();
    }

    @javax.annotation.CheckForNull
    public E peekFirst() {
        return peek();
    }

    @javax.annotation.CheckForNull
    public E pollLast() {
        if (isEmpty()) {
            return null;
        }
        return removeAndGet(getMaxElementIndex());
    }

    public E removeLast() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException();
        }
        return removeAndGet(getMaxElementIndex());
    }

    @javax.annotation.CheckForNull
    public E peekLast() {
        if (isEmpty()) {
            return null;
        }
        return elementData(getMaxElementIndex());
    }

    @javax.annotation.CheckForNull
    com.google.common.collect.MinMaxPriorityQueue.MoveDesc<E> removeAt(int index) {
        com.google.common.base.Preconditions.checkPositionIndex(index, this.size);
        this.modCount++;
        int i = this.size - 1;
        this.size = i;
        if (i == index) {
            this.queue[i] = null;
            return null;
        }
        E eElementData = elementData(i);
        int iSwapWithConceptuallyLastElement = heapForIndex(this.size).swapWithConceptuallyLastElement(eElementData);
        if (iSwapWithConceptuallyLastElement == index) {
            this.queue[this.size] = null;
            return null;
        }
        E eElementData2 = elementData(this.size);
        this.queue[this.size] = null;
        com.google.common.collect.MinMaxPriorityQueue.MoveDesc<E> moveDescFillHole = fillHole(index, eElementData2);
        if (iSwapWithConceptuallyLastElement >= index) {
            return moveDescFillHole;
        }
        if (moveDescFillHole == null) {
            return new com.google.common.collect.MinMaxPriorityQueue.MoveDesc<>(eElementData, eElementData2);
        }
        return new com.google.common.collect.MinMaxPriorityQueue.MoveDesc<>(eElementData, moveDescFillHole.replaced);
    }

    @javax.annotation.CheckForNull
    private com.google.common.collect.MinMaxPriorityQueue.MoveDesc<E> fillHole(int index, E toTrickle) {
        com.google.common.collect.MinMaxPriorityQueue<E>.Heap heapHeapForIndex = heapForIndex(index);
        int iFillHoleAt = heapHeapForIndex.fillHoleAt(index);
        int iBubbleUpAlternatingLevels = heapHeapForIndex.bubbleUpAlternatingLevels(iFillHoleAt, toTrickle);
        if (iBubbleUpAlternatingLevels == iFillHoleAt) {
            return heapHeapForIndex.tryCrossOverAndBubbleUp(index, iFillHoleAt, toTrickle);
        }
        if (iBubbleUpAlternatingLevels < index) {
            return new com.google.common.collect.MinMaxPriorityQueue.MoveDesc<>(toTrickle, elementData(index));
        }
        return null;
    }

    static class MoveDesc<E> {
        final E replaced;
        final E toTrickle;

        MoveDesc(E toTrickle, E replaced) {
            this.toTrickle = toTrickle;
            this.replaced = replaced;
        }
    }

    private E removeAndGet(int index) {
        E eElementData = elementData(index);
        removeAt(index);
        return eElementData;
    }

    private com.google.common.collect.MinMaxPriorityQueue<E>.Heap heapForIndex(int i) {
        return isEvenLevel(i) ? this.minHeap : this.maxHeap;
    }

    static boolean isEvenLevel(int index) {
        int i = ~(~(index + 1));
        com.google.common.base.Preconditions.checkState(i > 0, "negative index");
        return (EVEN_POWERS_OF_TWO & i) > (i & ODD_POWERS_OF_TWO);
    }

    boolean isIntact() {
        for (int i = 1; i < this.size; i++) {
            if (!heapForIndex(i).verifyIndex(i)) {
                return false;
            }
        }
        return true;
    }

    class Heap {
        final com.google.common.collect.Ordering<E> ordering;
        com.google.common.collect.MinMaxPriorityQueue<E>.Heap otherHeap;

        private int getLeftChildIndex(int i) {
            return (i * 2) + 1;
        }

        private int getRightChildIndex(int i) {
            return (i * 2) + 2;
        }

        Heap(com.google.common.collect.Ordering<E> ordering) {
            this.ordering = ordering;
        }

        int compareElements(int i, int i2) {
            return this.ordering.compare((E) com.google.common.collect.MinMaxPriorityQueue.this.elementData(i), (E) com.google.common.collect.MinMaxPriorityQueue.this.elementData(i2));
        }

        @javax.annotation.CheckForNull
        com.google.common.collect.MinMaxPriorityQueue.MoveDesc<E> tryCrossOverAndBubbleUp(int removeIndex, int vacated, E toTrickle) {
            java.lang.Object objElementData;
            int iCrossOver = crossOver(vacated, toTrickle);
            if (iCrossOver == vacated) {
                return null;
            }
            if (iCrossOver < removeIndex) {
                objElementData = com.google.common.collect.MinMaxPriorityQueue.this.elementData(removeIndex);
            } else {
                objElementData = com.google.common.collect.MinMaxPriorityQueue.this.elementData(getParentIndex(removeIndex));
            }
            if (this.otherHeap.bubbleUpAlternatingLevels(iCrossOver, toTrickle) < removeIndex) {
                return new com.google.common.collect.MinMaxPriorityQueue.MoveDesc<>(toTrickle, objElementData);
            }
            return null;
        }

        void bubbleUp(int index, E x) {
            com.google.common.collect.MinMaxPriorityQueue.Heap heap;
            int iCrossOverUp = crossOverUp(index, x);
            if (iCrossOverUp == index) {
                iCrossOverUp = index;
                heap = this;
            } else {
                heap = this.otherHeap;
            }
            heap.bubbleUpAlternatingLevels(iCrossOverUp, x);
        }

        int bubbleUpAlternatingLevels(int i, E e) {
            while (i > 2) {
                int grandparentIndex = getGrandparentIndex(i);
                java.lang.Object objElementData = com.google.common.collect.MinMaxPriorityQueue.this.elementData(grandparentIndex);
                if (this.ordering.compare((E) objElementData, e) <= 0) {
                    break;
                }
                com.google.common.collect.MinMaxPriorityQueue.this.queue[i] = objElementData;
                i = grandparentIndex;
            }
            com.google.common.collect.MinMaxPriorityQueue.this.queue[i] = e;
            return i;
        }

        int findMin(int index, int len) {
            if (index >= com.google.common.collect.MinMaxPriorityQueue.this.size) {
                return -1;
            }
            com.google.common.base.Preconditions.checkState(index > 0);
            int iMin = java.lang.Math.min(index, com.google.common.collect.MinMaxPriorityQueue.this.size - len) + len;
            for (int i = index + 1; i < iMin; i++) {
                if (compareElements(i, index) < 0) {
                    index = i;
                }
            }
            return index;
        }

        int findMinChild(int index) {
            return findMin(getLeftChildIndex(index), 2);
        }

        int findMinGrandChild(int index) {
            int leftChildIndex = getLeftChildIndex(index);
            if (leftChildIndex < 0) {
                return -1;
            }
            return findMin(getLeftChildIndex(leftChildIndex), 4);
        }

        int crossOverUp(int i, E e) {
            int rightChildIndex;
            if (i == 0) {
                com.google.common.collect.MinMaxPriorityQueue.this.queue[0] = e;
                return 0;
            }
            int parentIndex = getParentIndex(i);
            java.lang.Object objElementData = com.google.common.collect.MinMaxPriorityQueue.this.elementData(parentIndex);
            if (parentIndex != 0 && (rightChildIndex = getRightChildIndex(getParentIndex(parentIndex))) != parentIndex && getLeftChildIndex(rightChildIndex) >= com.google.common.collect.MinMaxPriorityQueue.this.size) {
                java.lang.Object objElementData2 = com.google.common.collect.MinMaxPriorityQueue.this.elementData(rightChildIndex);
                if (this.ordering.compare((E) objElementData2, (E) objElementData) < 0) {
                    parentIndex = rightChildIndex;
                    objElementData = objElementData2;
                }
            }
            if (this.ordering.compare((E) objElementData, e) < 0) {
                com.google.common.collect.MinMaxPriorityQueue.this.queue[i] = objElementData;
                com.google.common.collect.MinMaxPriorityQueue.this.queue[parentIndex] = e;
                return parentIndex;
            }
            com.google.common.collect.MinMaxPriorityQueue.this.queue[i] = e;
            return i;
        }

        int swapWithConceptuallyLastElement(E e) {
            int rightChildIndex;
            int parentIndex = getParentIndex(com.google.common.collect.MinMaxPriorityQueue.this.size);
            if (parentIndex != 0 && (rightChildIndex = getRightChildIndex(getParentIndex(parentIndex))) != parentIndex && getLeftChildIndex(rightChildIndex) >= com.google.common.collect.MinMaxPriorityQueue.this.size) {
                java.lang.Object objElementData = com.google.common.collect.MinMaxPriorityQueue.this.elementData(rightChildIndex);
                if (this.ordering.compare((E) objElementData, e) < 0) {
                    com.google.common.collect.MinMaxPriorityQueue.this.queue[rightChildIndex] = e;
                    com.google.common.collect.MinMaxPriorityQueue.this.queue[com.google.common.collect.MinMaxPriorityQueue.this.size] = objElementData;
                    return rightChildIndex;
                }
            }
            return com.google.common.collect.MinMaxPriorityQueue.this.size;
        }

        int crossOver(int i, E e) {
            int iFindMinChild = findMinChild(i);
            if (iFindMinChild > 0 && this.ordering.compare((E) com.google.common.collect.MinMaxPriorityQueue.this.elementData(iFindMinChild), e) < 0) {
                com.google.common.collect.MinMaxPriorityQueue.this.queue[i] = com.google.common.collect.MinMaxPriorityQueue.this.elementData(iFindMinChild);
                com.google.common.collect.MinMaxPriorityQueue.this.queue[iFindMinChild] = e;
                return iFindMinChild;
            }
            return crossOverUp(i, e);
        }

        int fillHoleAt(int index) {
            while (true) {
                int iFindMinGrandChild = findMinGrandChild(index);
                if (iFindMinGrandChild <= 0) {
                    return index;
                }
                com.google.common.collect.MinMaxPriorityQueue.this.queue[index] = com.google.common.collect.MinMaxPriorityQueue.this.elementData(iFindMinGrandChild);
                index = iFindMinGrandChild;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean verifyIndex(int i) {
            if (getLeftChildIndex(i) < com.google.common.collect.MinMaxPriorityQueue.this.size && compareElements(i, getLeftChildIndex(i)) > 0) {
                return false;
            }
            if (getRightChildIndex(i) < com.google.common.collect.MinMaxPriorityQueue.this.size && compareElements(i, getRightChildIndex(i)) > 0) {
                return false;
            }
            if (i <= 0 || compareElements(i, getParentIndex(i)) <= 0) {
                return i <= 2 || compareElements(getGrandparentIndex(i), i) <= 0;
            }
            return false;
        }

        private int getParentIndex(int i) {
            return (i - 1) / 2;
        }

        private int getGrandparentIndex(int i) {
            return getParentIndex(getParentIndex(i));
        }
    }

    private class QueueIterator implements java.util.Iterator<E> {
        private boolean canRemove;
        private int cursor;
        private int expectedModCount;

        @javax.annotation.CheckForNull
        private java.util.Queue<E> forgetMeNot;

        @javax.annotation.CheckForNull
        private E lastFromForgetMeNot;
        private int nextCursor;

        @javax.annotation.CheckForNull
        private java.util.List<E> skipMe;

        private QueueIterator() {
            this.cursor = -1;
            this.nextCursor = -1;
            this.expectedModCount = com.google.common.collect.MinMaxPriorityQueue.this.modCount;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            checkModCount();
            nextNotInSkipMe(this.cursor + 1);
            if (this.nextCursor < com.google.common.collect.MinMaxPriorityQueue.this.size()) {
                return true;
            }
            java.util.Queue<E> queue = this.forgetMeNot;
            return (queue == null || queue.isEmpty()) ? false : true;
        }

        @Override // java.util.Iterator
        public E next() {
            checkModCount();
            nextNotInSkipMe(this.cursor + 1);
            if (this.nextCursor < com.google.common.collect.MinMaxPriorityQueue.this.size()) {
                int i = this.nextCursor;
                this.cursor = i;
                this.canRemove = true;
                return (E) com.google.common.collect.MinMaxPriorityQueue.this.elementData(i);
            }
            if (this.forgetMeNot != null) {
                this.cursor = com.google.common.collect.MinMaxPriorityQueue.this.size();
                E ePoll = this.forgetMeNot.poll();
                this.lastFromForgetMeNot = ePoll;
                if (ePoll != null) {
                    this.canRemove = true;
                    return ePoll;
                }
            }
            throw new java.util.NoSuchElementException("iterator moved past last element in queue.");
        }

        @Override // java.util.Iterator
        public void remove() {
            com.google.common.collect.CollectPreconditions.checkRemove(this.canRemove);
            checkModCount();
            this.canRemove = false;
            this.expectedModCount++;
            if (this.cursor < com.google.common.collect.MinMaxPriorityQueue.this.size()) {
                com.google.common.collect.MinMaxPriorityQueue.MoveDesc<E> moveDescRemoveAt = com.google.common.collect.MinMaxPriorityQueue.this.removeAt(this.cursor);
                if (moveDescRemoveAt != null) {
                    if (this.forgetMeNot == null || this.skipMe == null) {
                        this.forgetMeNot = new java.util.ArrayDeque();
                        this.skipMe = new java.util.ArrayList(3);
                    }
                    if (!foundAndRemovedExactReference(this.skipMe, moveDescRemoveAt.toTrickle)) {
                        this.forgetMeNot.add(moveDescRemoveAt.toTrickle);
                    }
                    if (!foundAndRemovedExactReference(this.forgetMeNot, moveDescRemoveAt.replaced)) {
                        this.skipMe.add(moveDescRemoveAt.replaced);
                    }
                }
                this.cursor--;
                this.nextCursor--;
                return;
            }
            com.google.common.base.Preconditions.checkState(removeExact(java.util.Objects.requireNonNull(this.lastFromForgetMeNot)));
            this.lastFromForgetMeNot = null;
        }

        private boolean foundAndRemovedExactReference(java.lang.Iterable<E> elements, E target) {
            java.util.Iterator<E> it = elements.iterator();
            while (it.hasNext()) {
                if (it.next() == target) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        private boolean removeExact(java.lang.Object target) {
            for (int i = 0; i < com.google.common.collect.MinMaxPriorityQueue.this.size; i++) {
                if (com.google.common.collect.MinMaxPriorityQueue.this.queue[i] == target) {
                    com.google.common.collect.MinMaxPriorityQueue.this.removeAt(i);
                    return true;
                }
            }
            return false;
        }

        private void checkModCount() {
            if (com.google.common.collect.MinMaxPriorityQueue.this.modCount != this.expectedModCount) {
                throw new java.util.ConcurrentModificationException();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void nextNotInSkipMe(int c) {
            if (this.nextCursor < c) {
                if (this.skipMe != null) {
                    while (c < com.google.common.collect.MinMaxPriorityQueue.this.size() && foundAndRemovedExactReference(this.skipMe, com.google.common.collect.MinMaxPriorityQueue.this.elementData(c))) {
                        c++;
                    }
                }
                this.nextCursor = c;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<E> iterator() {
        return new com.google.common.collect.MinMaxPriorityQueue.QueueIterator();
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        for (int i = 0; i < this.size; i++) {
            this.queue[i] = null;
        }
        this.size = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public java.lang.Object[] toArray() {
        int i = this.size;
        java.lang.Object[] objArr = new java.lang.Object[i];
        java.lang.System.arraycopy(this.queue, 0, objArr, 0, i);
        return objArr;
    }

    public java.util.Comparator<? super E> comparator() {
        return this.minHeap.ordering;
    }

    int capacity() {
        return this.queue.length;
    }

    static int initialQueueSize(int configuredExpectedSize, int maximumSize, java.lang.Iterable<?> initialContents) {
        if (configuredExpectedSize == -1) {
            configuredExpectedSize = 11;
        }
        if (initialContents instanceof java.util.Collection) {
            configuredExpectedSize = java.lang.Math.max(configuredExpectedSize, ((java.util.Collection) initialContents).size());
        }
        return capAtMaximumSize(configuredExpectedSize, maximumSize);
    }

    private void growIfNeeded() {
        if (this.size > this.queue.length) {
            java.lang.Object[] objArr = new java.lang.Object[calculateNewCapacity()];
            java.lang.Object[] objArr2 = this.queue;
            java.lang.System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.queue = objArr;
        }
    }

    private int calculateNewCapacity() {
        int length = this.queue.length;
        return capAtMaximumSize(length < 64 ? (length + 1) * 2 : com.google.common.math.IntMath.checkedMultiply(length / 2, 3), this.maximumSize);
    }

    private static int capAtMaximumSize(int queueSize, int maximumSize) {
        return java.lang.Math.min(queueSize - 1, maximumSize) + 1;
    }
}
