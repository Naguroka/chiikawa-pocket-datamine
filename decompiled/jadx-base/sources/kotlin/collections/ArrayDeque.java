package kotlin.collections;

/* JADX INFO: compiled from: ArrayDeque.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u0000 P*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001PB\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0007\b\u0016¢\u0006\u0002\u0010\u0006B\u0015\b\u0016\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\u0010\tJ\u0015\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0016J\u001d\u0010\u0013\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0019J\u001e\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0016\u0010\u001a\u001a\u00020\u00142\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0013\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0002\u0010\u001cJ\b\u0010\u001e\u001a\u00020\u0017H\u0016J\u0016\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0016J\u001e\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0004H\u0002J\u0010\u0010$\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0010\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u0004H\u0002J\u001d\u0010'\u001a\u00020\u00142\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140)H\u0082\bJ\u000b\u0010*\u001a\u00028\u0000¢\u0006\u0002\u0010+J\r\u0010,\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010+J\u0016\u0010-\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0002\u0010.J\u0010\u0010/\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0015\u00100\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00101J\u0016\u00102\u001a\u00028\u00002\u0006\u0010!\u001a\u00020\u0004H\u0083\b¢\u0006\u0002\u0010.J\u0011\u0010!\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0083\bJM\u00103\u001a\u00020\u00172>\u00104\u001a:\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(\u000e\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b¢\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u001705H\u0000¢\u0006\u0002\b8J\b\u00109\u001a\u00020\u0014H\u0016J\u000b\u0010:\u001a\u00028\u0000¢\u0006\u0002\u0010+J\u0015\u0010;\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00101J\r\u0010<\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010+J\u0010\u0010=\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0010\u0010>\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0015\u0010?\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0016J\u0016\u0010@\u001a\u00020\u00142\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0015\u0010A\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0002\u0010.J\u000b\u0010B\u001a\u00028\u0000¢\u0006\u0002\u0010+J\r\u0010C\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010+J\u000b\u0010D\u001a\u00028\u0000¢\u0006\u0002\u0010+J\r\u0010E\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010+J\u0016\u0010F\u001a\u00020\u00142\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u001e\u0010G\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010HJ\u0017\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0000¢\u0006\u0004\bJ\u0010KJ)\u0010I\u001a\b\u0012\u0004\u0012\u0002HL0\u000b\"\u0004\b\u0001\u0010L2\f\u0010M\u001a\b\u0012\u0004\u0012\u0002HL0\u000bH\u0000¢\u0006\u0004\bJ\u0010NJ\u0015\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0002\u0010KJ'\u0010O\u001a\b\u0012\u0004\u0012\u0002HL0\u000b\"\u0004\b\u0001\u0010L2\f\u0010M\u001a\b\u0012\u0004\u0012\u0002HL0\u000bH\u0016¢\u0006\u0002\u0010NR\u0018\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006Q"}, d2 = {"Lkotlin/collections/ArrayDeque;", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "Lkotlin/collections/AbstractMutableList;", "initialCapacity", "", "(I)V", "()V", "elements", "", "(Ljava/util/Collection;)V", "elementData", "", "", "[Ljava/lang/Object;", androidx.media3.extractor.text.ttml.TtmlNode.TAG_HEAD, "<set-?>", "size", "getSize", "()I", "add", "", "element", "(Ljava/lang/Object;)Z", "", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "(ILjava/lang/Object;)V", "addAll", "addFirst", "(Ljava/lang/Object;)V", "addLast", "clear", "contains", "copyCollectionElements", "internalIndex", "copyElements", "newCapacity", "decremented", "ensureCapacity", "minCapacity", "filterInPlace", "predicate", "Lkotlin/Function1;", "first", "()Ljava/lang/Object;", "firstOrNull", "get", "(I)Ljava/lang/Object;", "incremented", "indexOf", "(Ljava/lang/Object;)I", "internalGet", "internalStructure", "structure", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "internalStructure$kotlin_stdlib", "isEmpty", "last", "lastIndexOf", "lastOrNull", "negativeMod", "positiveMod", "remove", "removeAll", "removeAt", "removeFirst", "removeFirstOrNull", "removeLast", "removeLastOrNull", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "testToArray", "testToArray$kotlin_stdlib", "()[Ljava/lang/Object;", "T", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "toArray", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ArrayDeque<E> extends kotlin.collections.AbstractMutableList<E> {
    private static final int defaultMinCapacity = 10;
    private java.lang.Object[] elementData;
    private int head;
    private int size;
    private static final java.lang.Object[] emptyElementData = new java.lang.Object[0];

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
        return this.size;
    }

    public ArrayDeque(int i) {
        java.lang.Object[] objArr;
        if (i == 0) {
            objArr = emptyElementData;
        } else if (i > 0) {
            objArr = new java.lang.Object[i];
        } else {
            throw new java.lang.IllegalArgumentException("Illegal Capacity: " + i);
        }
        this.elementData = objArr;
    }

    public ArrayDeque() {
        this.elementData = emptyElementData;
    }

    public ArrayDeque(java.util.Collection<? extends E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "elements");
        java.lang.Object[] array = elements.toArray(new java.lang.Object[0]);
        this.elementData = array;
        this.size = array.length;
        if (array.length == 0) {
            this.elementData = emptyElementData;
        }
    }

    private final void ensureCapacity(int minCapacity) {
        if (minCapacity < 0) {
            throw new java.lang.IllegalStateException("Deque is too big.");
        }
        java.lang.Object[] objArr = this.elementData;
        if (minCapacity <= objArr.length) {
            return;
        }
        if (objArr == emptyElementData) {
            this.elementData = new java.lang.Object[kotlin.ranges.RangesKt.coerceAtLeast(minCapacity, 10)];
        } else {
            copyElements(kotlin.collections.AbstractList.INSTANCE.newCapacity$kotlin_stdlib(this.elementData.length, minCapacity));
        }
    }

    private final void copyElements(int newCapacity) {
        java.lang.Object[] objArr = new java.lang.Object[newCapacity];
        java.lang.Object[] objArr2 = this.elementData;
        kotlin.collections.ArraysKt.copyInto(objArr2, objArr, 0, this.head, objArr2.length);
        java.lang.Object[] objArr3 = this.elementData;
        int length = objArr3.length;
        int i = this.head;
        kotlin.collections.ArraysKt.copyInto(objArr3, objArr, length - i, 0, i);
        this.head = 0;
        this.elementData = objArr;
    }

    private final E internalGet(int internalIndex) {
        return (E) this.elementData[internalIndex];
    }

    private final int positiveMod(int index) {
        java.lang.Object[] objArr = this.elementData;
        return index >= objArr.length ? index - objArr.length : index;
    }

    private final int negativeMod(int index) {
        return index < 0 ? index + this.elementData.length : index;
    }

    private final int internalIndex(int index) {
        return positiveMod(this.head + index);
    }

    private final int incremented(int index) {
        if (index == kotlin.collections.ArraysKt.getLastIndex(this.elementData)) {
            return 0;
        }
        return index + 1;
    }

    private final int decremented(int index) {
        return index == 0 ? kotlin.collections.ArraysKt.getLastIndex(this.elementData) : index - 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    public final E first() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.elementData[this.head];
    }

    public final E firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.elementData[this.head];
    }

    public final E last() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.elementData[positiveMod(this.head + kotlin.collections.CollectionsKt.getLastIndex(this))];
    }

    public final E lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.elementData[positiveMod(this.head + kotlin.collections.CollectionsKt.getLastIndex(this))];
    }

    public final void addFirst(E element) {
        ensureCapacity(size() + 1);
        int iDecremented = decremented(this.head);
        this.head = iDecremented;
        this.elementData[iDecremented] = element;
        this.size = size() + 1;
    }

    public final void addLast(E element) {
        ensureCapacity(size() + 1);
        this.elementData[positiveMod(this.head + size())] = element;
        this.size = size() + 1;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException("ArrayDeque is empty.");
        }
        java.lang.Object[] objArr = this.elementData;
        int i = this.head;
        E e = (E) objArr[i];
        objArr[i] = null;
        this.head = incremented(i);
        this.size = size() - 1;
        return e;
    }

    public final E removeFirstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException("ArrayDeque is empty.");
        }
        int iPositiveMod = positiveMod(this.head + kotlin.collections.CollectionsKt.getLastIndex(this));
        java.lang.Object[] objArr = this.elementData;
        E e = (E) objArr[iPositiveMod];
        objArr[iPositiveMod] = null;
        this.size = size() - 1;
        return e;
    }

    public final E removeLastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E element) {
        addLast(element);
        return true;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int index, E element) {
        kotlin.collections.AbstractList.INSTANCE.checkPositionIndex$kotlin_stdlib(index, size());
        if (index == size()) {
            addLast(element);
            return;
        }
        if (index == 0) {
            addFirst(element);
            return;
        }
        ensureCapacity(size() + 1);
        int iPositiveMod = positiveMod(this.head + index);
        if (index < ((size() + 1) >> 1)) {
            int iDecremented = decremented(iPositiveMod);
            int iDecremented2 = decremented(this.head);
            int i = this.head;
            if (iDecremented >= i) {
                java.lang.Object[] objArr = this.elementData;
                objArr[iDecremented2] = objArr[i];
                kotlin.collections.ArraysKt.copyInto(objArr, objArr, i, i + 1, iDecremented + 1);
            } else {
                java.lang.Object[] objArr2 = this.elementData;
                kotlin.collections.ArraysKt.copyInto(objArr2, objArr2, i - 1, i, objArr2.length);
                java.lang.Object[] objArr3 = this.elementData;
                objArr3[objArr3.length - 1] = objArr3[0];
                kotlin.collections.ArraysKt.copyInto(objArr3, objArr3, 0, 1, iDecremented + 1);
            }
            this.elementData[iDecremented] = element;
            this.head = iDecremented2;
        } else {
            int iPositiveMod2 = positiveMod(this.head + size());
            if (iPositiveMod < iPositiveMod2) {
                java.lang.Object[] objArr4 = this.elementData;
                kotlin.collections.ArraysKt.copyInto(objArr4, objArr4, iPositiveMod + 1, iPositiveMod, iPositiveMod2);
            } else {
                java.lang.Object[] objArr5 = this.elementData;
                kotlin.collections.ArraysKt.copyInto(objArr5, objArr5, 1, 0, iPositiveMod2);
                java.lang.Object[] objArr6 = this.elementData;
                objArr6[0] = objArr6[objArr6.length - 1];
                kotlin.collections.ArraysKt.copyInto(objArr6, objArr6, iPositiveMod + 1, iPositiveMod, objArr6.length - 1);
            }
            this.elementData[iPositiveMod] = element;
        }
        this.size = size() + 1;
    }

    private final void copyCollectionElements(int internalIndex, java.util.Collection<? extends E> elements) {
        java.util.Iterator<? extends E> it = elements.iterator();
        int length = this.elementData.length;
        while (internalIndex < length && it.hasNext()) {
            this.elementData[internalIndex] = it.next();
            internalIndex++;
        }
        int i = this.head;
        for (int i2 = 0; i2 < i && it.hasNext(); i2++) {
            this.elementData[i2] = it.next();
        }
        this.size = size() + elements.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection<? extends E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        ensureCapacity(size() + elements.size());
        copyCollectionElements(positiveMod(this.head + size()), elements);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, java.util.Collection<? extends E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "elements");
        kotlin.collections.AbstractList.INSTANCE.checkPositionIndex$kotlin_stdlib(index, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (index == size()) {
            return addAll(elements);
        }
        ensureCapacity(size() + elements.size());
        int iPositiveMod = positiveMod(this.head + size());
        int iPositiveMod2 = positiveMod(this.head + index);
        int size = elements.size();
        if (index < ((size() + 1) >> 1)) {
            int i = this.head;
            int length = i - size;
            if (iPositiveMod2 < i) {
                java.lang.Object[] objArr = this.elementData;
                kotlin.collections.ArraysKt.copyInto(objArr, objArr, length, i, objArr.length);
                if (size >= iPositiveMod2) {
                    java.lang.Object[] objArr2 = this.elementData;
                    kotlin.collections.ArraysKt.copyInto(objArr2, objArr2, objArr2.length - size, 0, iPositiveMod2);
                } else {
                    java.lang.Object[] objArr3 = this.elementData;
                    kotlin.collections.ArraysKt.copyInto(objArr3, objArr3, objArr3.length - size, 0, size);
                    java.lang.Object[] objArr4 = this.elementData;
                    kotlin.collections.ArraysKt.copyInto(objArr4, objArr4, 0, size, iPositiveMod2);
                }
            } else if (length >= 0) {
                java.lang.Object[] objArr5 = this.elementData;
                kotlin.collections.ArraysKt.copyInto(objArr5, objArr5, length, i, iPositiveMod2);
            } else {
                java.lang.Object[] objArr6 = this.elementData;
                length += objArr6.length;
                int i2 = iPositiveMod2 - i;
                int length2 = objArr6.length - length;
                if (length2 >= i2) {
                    kotlin.collections.ArraysKt.copyInto(objArr6, objArr6, length, i, iPositiveMod2);
                } else {
                    kotlin.collections.ArraysKt.copyInto(objArr6, objArr6, length, i, i + length2);
                    java.lang.Object[] objArr7 = this.elementData;
                    kotlin.collections.ArraysKt.copyInto(objArr7, objArr7, 0, this.head + length2, iPositiveMod2);
                }
            }
            this.head = length;
            copyCollectionElements(negativeMod(iPositiveMod2 - size), elements);
        } else {
            int i3 = iPositiveMod2 + size;
            if (iPositiveMod2 < iPositiveMod) {
                int i4 = size + iPositiveMod;
                java.lang.Object[] objArr8 = this.elementData;
                if (i4 <= objArr8.length) {
                    kotlin.collections.ArraysKt.copyInto(objArr8, objArr8, i3, iPositiveMod2, iPositiveMod);
                } else if (i3 >= objArr8.length) {
                    kotlin.collections.ArraysKt.copyInto(objArr8, objArr8, i3 - objArr8.length, iPositiveMod2, iPositiveMod);
                } else {
                    int length3 = iPositiveMod - (i4 - objArr8.length);
                    kotlin.collections.ArraysKt.copyInto(objArr8, objArr8, 0, length3, iPositiveMod);
                    java.lang.Object[] objArr9 = this.elementData;
                    kotlin.collections.ArraysKt.copyInto(objArr9, objArr9, i3, iPositiveMod2, length3);
                }
            } else {
                java.lang.Object[] objArr10 = this.elementData;
                kotlin.collections.ArraysKt.copyInto(objArr10, objArr10, size, 0, iPositiveMod);
                java.lang.Object[] objArr11 = this.elementData;
                if (i3 >= objArr11.length) {
                    kotlin.collections.ArraysKt.copyInto(objArr11, objArr11, i3 - objArr11.length, iPositiveMod2, objArr11.length);
                } else {
                    kotlin.collections.ArraysKt.copyInto(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    java.lang.Object[] objArr12 = this.elementData;
                    kotlin.collections.ArraysKt.copyInto(objArr12, objArr12, i3, iPositiveMod2, objArr12.length - size);
                }
            }
            copyCollectionElements(iPositiveMod2, elements);
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int index) {
        kotlin.collections.AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(index, size());
        return (E) this.elementData[positiveMod(this.head + index)];
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public E set(int index, E element) {
        kotlin.collections.AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(index, size());
        int iPositiveMod = positiveMod(this.head + index);
        java.lang.Object[] objArr = this.elementData;
        E e = (E) objArr[iPositiveMod];
        objArr[iPositiveMod] = element;
        return e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(java.lang.Object element) {
        return indexOf(element) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(java.lang.Object element) {
        int i;
        int iPositiveMod = positiveMod(this.head + size());
        int length = this.head;
        if (length < iPositiveMod) {
            while (length < iPositiveMod) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(element, this.elementData[length])) {
                    i = this.head;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iPositiveMod) {
            return -1;
        }
        int length2 = this.elementData.length;
        while (length < length2) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(element, this.elementData[length])) {
                i = this.head;
            } else {
                length++;
            }
        }
        for (int i2 = 0; i2 < iPositiveMod; i2++) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(element, this.elementData[i2])) {
                length = i2 + this.elementData.length;
                i = this.head;
            }
        }
        return -1;
        return length - i;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(java.lang.Object element) {
        int lastIndex;
        int i;
        int iPositiveMod = positiveMod(this.head + size());
        int i2 = this.head;
        if (i2 < iPositiveMod) {
            lastIndex = iPositiveMod - 1;
            if (i2 <= lastIndex) {
                while (!kotlin.jvm.internal.Intrinsics.areEqual(element, this.elementData[lastIndex])) {
                    if (lastIndex != i2) {
                        lastIndex--;
                    }
                }
                i = this.head;
                return lastIndex - i;
            }
            return -1;
        }
        if (i2 > iPositiveMod) {
            for (int i3 = iPositiveMod - 1; -1 < i3; i3--) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(element, this.elementData[i3])) {
                    lastIndex = i3 + this.elementData.length;
                    i = this.head;
                    return lastIndex - i;
                }
            }
            lastIndex = kotlin.collections.ArraysKt.getLastIndex(this.elementData);
            int i4 = this.head;
            if (i4 <= lastIndex) {
                while (!kotlin.jvm.internal.Intrinsics.areEqual(element, this.elementData[lastIndex])) {
                    if (lastIndex != i4) {
                        lastIndex--;
                    }
                }
                i = this.head;
                return lastIndex - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(java.lang.Object element) {
        int iIndexOf = indexOf(element);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // kotlin.collections.AbstractMutableList
    public E removeAt(int index) {
        kotlin.collections.AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(index, size());
        kotlin.collections.ArrayDeque<E> arrayDeque = this;
        if (index == kotlin.collections.CollectionsKt.getLastIndex(arrayDeque)) {
            return removeLast();
        }
        if (index == 0) {
            return removeFirst();
        }
        int iPositiveMod = positiveMod(this.head + index);
        E e = (E) this.elementData[iPositiveMod];
        if (index < (size() >> 1)) {
            int i = this.head;
            if (iPositiveMod >= i) {
                java.lang.Object[] objArr = this.elementData;
                kotlin.collections.ArraysKt.copyInto(objArr, objArr, i + 1, i, iPositiveMod);
            } else {
                java.lang.Object[] objArr2 = this.elementData;
                kotlin.collections.ArraysKt.copyInto(objArr2, objArr2, 1, 0, iPositiveMod);
                java.lang.Object[] objArr3 = this.elementData;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i2 = this.head;
                kotlin.collections.ArraysKt.copyInto(objArr3, objArr3, i2 + 1, i2, objArr3.length - 1);
            }
            java.lang.Object[] objArr4 = this.elementData;
            int i3 = this.head;
            objArr4[i3] = null;
            this.head = incremented(i3);
        } else {
            int iPositiveMod2 = positiveMod(this.head + kotlin.collections.CollectionsKt.getLastIndex(arrayDeque));
            if (iPositiveMod <= iPositiveMod2) {
                java.lang.Object[] objArr5 = this.elementData;
                kotlin.collections.ArraysKt.copyInto(objArr5, objArr5, iPositiveMod, iPositiveMod + 1, iPositiveMod2 + 1);
            } else {
                java.lang.Object[] objArr6 = this.elementData;
                kotlin.collections.ArraysKt.copyInto(objArr6, objArr6, iPositiveMod, iPositiveMod + 1, objArr6.length);
                java.lang.Object[] objArr7 = this.elementData;
                objArr7[objArr7.length - 1] = objArr7[0];
                kotlin.collections.ArraysKt.copyInto(objArr7, objArr7, 0, 1, iPositiveMod2 + 1);
            }
            this.elementData[iPositiveMod2] = null;
        }
        this.size = size() - 1;
        return e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean filterInPlace(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> predicate) {
        int iPositiveMod;
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty()) {
            if ((this.elementData.length == 0) == false) {
                int iPositiveMod2 = positiveMod(this.head + size());
                int i = this.head;
                if (i < iPositiveMod2) {
                    iPositiveMod = i;
                    while (i < iPositiveMod2) {
                        java.lang.Object obj = this.elementData[i];
                        if (predicate.invoke(obj).booleanValue()) {
                            this.elementData[iPositiveMod] = obj;
                            iPositiveMod++;
                        } else {
                            z = true;
                        }
                        i++;
                    }
                    kotlin.collections.ArraysKt.fill(this.elementData, (java.lang.Object) null, iPositiveMod, iPositiveMod2);
                } else {
                    int length = this.elementData.length;
                    boolean z2 = false;
                    int i2 = i;
                    while (i < length) {
                        java.lang.Object[] objArr = this.elementData;
                        java.lang.Object obj2 = objArr[i];
                        objArr[i] = null;
                        if (predicate.invoke(obj2).booleanValue()) {
                            this.elementData[i2] = obj2;
                            i2++;
                        } else {
                            z2 = true;
                        }
                        i++;
                    }
                    iPositiveMod = positiveMod(i2);
                    for (int i3 = 0; i3 < iPositiveMod2; i3++) {
                        java.lang.Object[] objArr2 = this.elementData;
                        java.lang.Object obj3 = objArr2[i3];
                        objArr2[i3] = null;
                        if (predicate.invoke(obj3).booleanValue()) {
                            this.elementData[iPositiveMod] = obj3;
                            iPositiveMod = incremented(iPositiveMod);
                        } else {
                            z2 = true;
                        }
                    }
                    z = z2;
                }
                if (z) {
                    this.size = negativeMod(iPositiveMod - this.head);
                }
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int iPositiveMod = positiveMod(this.head + size());
        int i = this.head;
        if (i < iPositiveMod) {
            kotlin.collections.ArraysKt.fill(this.elementData, (java.lang.Object) null, i, iPositiveMod);
        } else if (!isEmpty()) {
            java.lang.Object[] objArr = this.elementData;
            kotlin.collections.ArraysKt.fill(objArr, (java.lang.Object) null, this.head, objArr.length);
            kotlin.collections.ArraysKt.fill(this.elementData, (java.lang.Object) null, 0, iPositiveMod);
        }
        this.head = 0;
        this.size = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "array");
        if (array.length < size()) {
            array = (T[]) kotlin.collections.ArraysKt.arrayOfNulls(array, size());
        }
        int iPositiveMod = positiveMod(this.head + size());
        int i = this.head;
        if (i < iPositiveMod) {
            kotlin.collections.ArraysKt.copyInto$default(this.elementData, array, 0, i, iPositiveMod, 2, (java.lang.Object) null);
        } else if (!isEmpty()) {
            java.lang.Object[] objArr = this.elementData;
            kotlin.collections.ArraysKt.copyInto(objArr, array, 0, this.head, objArr.length);
            java.lang.Object[] objArr2 = this.elementData;
            kotlin.collections.ArraysKt.copyInto(objArr2, array, objArr2.length - this.head, 0, iPositiveMod);
        }
        return (T[]) kotlin.collections.CollectionsKt.terminateCollectionToArray(size(), array);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public java.lang.Object[] toArray() {
        return toArray(new java.lang.Object[size()]);
    }

    public final <T> T[] testToArray$kotlin_stdlib(T[] array) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) toArray(array);
    }

    public final java.lang.Object[] testToArray$kotlin_stdlib() {
        return toArray();
    }

    public final void internalStructure$kotlin_stdlib(kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Object[], kotlin.Unit> structure) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(structure, "structure");
        structure.invoke(java.lang.Integer.valueOf((isEmpty() || (i = this.head) < positiveMod(this.head + size())) ? this.head : i - this.elementData.length), toArray());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(java.util.Collection<? extends java.lang.Object> elements) {
        int iPositiveMod;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty()) {
            if ((this.elementData.length == 0) == false) {
                int iPositiveMod2 = positiveMod(this.head + size());
                int i = this.head;
                if (i < iPositiveMod2) {
                    iPositiveMod = i;
                    while (i < iPositiveMod2) {
                        java.lang.Object obj = this.elementData[i];
                        if (!elements.contains(obj)) {
                            this.elementData[iPositiveMod] = obj;
                            iPositiveMod++;
                        } else {
                            z = true;
                        }
                        i++;
                    }
                    kotlin.collections.ArraysKt.fill(this.elementData, (java.lang.Object) null, iPositiveMod, iPositiveMod2);
                } else {
                    int length = this.elementData.length;
                    boolean z2 = false;
                    int i2 = i;
                    while (i < length) {
                        java.lang.Object[] objArr = this.elementData;
                        java.lang.Object obj2 = objArr[i];
                        objArr[i] = null;
                        if (!elements.contains(obj2)) {
                            this.elementData[i2] = obj2;
                            i2++;
                        } else {
                            z2 = true;
                        }
                        i++;
                    }
                    iPositiveMod = positiveMod(i2);
                    for (int i3 = 0; i3 < iPositiveMod2; i3++) {
                        java.lang.Object[] objArr2 = this.elementData;
                        java.lang.Object obj3 = objArr2[i3];
                        objArr2[i3] = null;
                        if (!elements.contains(obj3)) {
                            this.elementData[iPositiveMod] = obj3;
                            iPositiveMod = incremented(iPositiveMod);
                        } else {
                            z2 = true;
                        }
                    }
                    z = z2;
                }
                if (z) {
                    this.size = negativeMod(iPositiveMod - this.head);
                }
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(java.util.Collection<? extends java.lang.Object> elements) {
        int iPositiveMod;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty()) {
            if ((this.elementData.length == 0) == false) {
                int iPositiveMod2 = positiveMod(this.head + size());
                int i = this.head;
                if (i < iPositiveMod2) {
                    iPositiveMod = i;
                    while (i < iPositiveMod2) {
                        java.lang.Object obj = this.elementData[i];
                        if (elements.contains(obj)) {
                            this.elementData[iPositiveMod] = obj;
                            iPositiveMod++;
                        } else {
                            z = true;
                        }
                        i++;
                    }
                    kotlin.collections.ArraysKt.fill(this.elementData, (java.lang.Object) null, iPositiveMod, iPositiveMod2);
                } else {
                    int length = this.elementData.length;
                    boolean z2 = false;
                    int i2 = i;
                    while (i < length) {
                        java.lang.Object[] objArr = this.elementData;
                        java.lang.Object obj2 = objArr[i];
                        objArr[i] = null;
                        if (elements.contains(obj2)) {
                            this.elementData[i2] = obj2;
                            i2++;
                        } else {
                            z2 = true;
                        }
                        i++;
                    }
                    iPositiveMod = positiveMod(i2);
                    for (int i3 = 0; i3 < iPositiveMod2; i3++) {
                        java.lang.Object[] objArr2 = this.elementData;
                        java.lang.Object obj3 = objArr2[i3];
                        objArr2[i3] = null;
                        if (elements.contains(obj3)) {
                            this.elementData[iPositiveMod] = obj3;
                            iPositiveMod = incremented(iPositiveMod);
                        } else {
                            z2 = true;
                        }
                    }
                    z = z2;
                }
                if (z) {
                    this.size = negativeMod(iPositiveMod - this.head);
                }
            }
        }
        return z;
    }
}
