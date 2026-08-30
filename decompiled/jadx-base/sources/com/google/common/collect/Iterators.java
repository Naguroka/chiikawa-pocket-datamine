package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class Iterators {
    private Iterators() {
    }

    static <T> com.google.common.collect.UnmodifiableIterator<T> emptyIterator() {
        return emptyListIterator();
    }

    static <T> com.google.common.collect.UnmodifiableListIterator<T> emptyListIterator() {
        return (com.google.common.collect.UnmodifiableListIterator<T>) com.google.common.collect.Iterators.ArrayItr.EMPTY;
    }

    private enum EmptyModifiableIterator implements java.util.Iterator<java.lang.Object> {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public java.lang.Object next() {
            throw new java.util.NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            com.google.common.collect.CollectPreconditions.checkRemove(false);
        }
    }

    static <T> java.util.Iterator<T> emptyModifiableIterator() {
        return com.google.common.collect.Iterators.EmptyModifiableIterator.INSTANCE;
    }

    public static <T> com.google.common.collect.UnmodifiableIterator<T> unmodifiableIterator(final java.util.Iterator<? extends T> iterator) {
        com.google.common.base.Preconditions.checkNotNull(iterator);
        if (iterator instanceof com.google.common.collect.UnmodifiableIterator) {
            return (com.google.common.collect.UnmodifiableIterator) iterator;
        }
        return new com.google.common.collect.UnmodifiableIterator<T>() { // from class: com.google.common.collect.Iterators.1
            @Override // java.util.Iterator
            public boolean hasNext() {
                return iterator.hasNext();
            }

            @Override // java.util.Iterator
            @com.google.common.collect.ParametricNullness
            public T next() {
                return (T) iterator.next();
            }
        };
    }

    @java.lang.Deprecated
    public static <T> com.google.common.collect.UnmodifiableIterator<T> unmodifiableIterator(com.google.common.collect.UnmodifiableIterator<T> iterator) {
        return (com.google.common.collect.UnmodifiableIterator) com.google.common.base.Preconditions.checkNotNull(iterator);
    }

    public static int size(java.util.Iterator<?> iterator) {
        long j = 0;
        while (iterator.hasNext()) {
            iterator.next();
            j++;
        }
        return com.google.common.primitives.Ints.saturatedCast(j);
    }

    public static boolean contains(java.util.Iterator<?> iterator, @javax.annotation.CheckForNull java.lang.Object element) {
        if (element == null) {
            while (iterator.hasNext()) {
                if (iterator.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (iterator.hasNext()) {
            if (element.equals(iterator.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean removeAll(java.util.Iterator<?> removeFrom, java.util.Collection<?> elementsToRemove) {
        com.google.common.base.Preconditions.checkNotNull(elementsToRemove);
        boolean z = false;
        while (removeFrom.hasNext()) {
            if (elementsToRemove.contains(removeFrom.next())) {
                removeFrom.remove();
                z = true;
            }
        }
        return z;
    }

    public static <T> boolean removeIf(java.util.Iterator<T> removeFrom, com.google.common.base.Predicate<? super T> predicate) {
        com.google.common.base.Preconditions.checkNotNull(predicate);
        boolean z = false;
        while (removeFrom.hasNext()) {
            if (predicate.apply(removeFrom.next())) {
                removeFrom.remove();
                z = true;
            }
        }
        return z;
    }

    public static boolean retainAll(java.util.Iterator<?> removeFrom, java.util.Collection<?> elementsToRetain) {
        com.google.common.base.Preconditions.checkNotNull(elementsToRetain);
        boolean z = false;
        while (removeFrom.hasNext()) {
            if (!elementsToRetain.contains(removeFrom.next())) {
                removeFrom.remove();
                z = true;
            }
        }
        return z;
    }

    public static boolean elementsEqual(java.util.Iterator<?> iterator1, java.util.Iterator<?> iterator2) {
        while (iterator1.hasNext()) {
            if (!iterator2.hasNext() || !com.google.common.base.Objects.equal(iterator1.next(), iterator2.next())) {
                return false;
            }
        }
        return !iterator2.hasNext();
    }

    public static java.lang.String toString(java.util.Iterator<?> iterator) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(com.ironsource.y8.i.d);
        boolean z = true;
        while (iterator.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(iterator.next());
            z = false;
        }
        return sb.append(']').toString();
    }

    @com.google.common.collect.ParametricNullness
    public static <T> T getOnlyElement(java.util.Iterator<T> iterator) {
        T next = iterator.next();
        if (!iterator.hasNext()) {
            return next;
        }
        java.lang.StringBuilder sbAppend = new java.lang.StringBuilder("expected one element but was: <").append(next);
        for (int i = 0; i < 4 && iterator.hasNext(); i++) {
            sbAppend.append(", ").append(iterator.next());
        }
        if (iterator.hasNext()) {
            sbAppend.append(", ...");
        }
        sbAppend.append(kotlin.text.Typography.greater);
        throw new java.lang.IllegalArgumentException(sbAppend.toString());
    }

    @com.google.common.collect.ParametricNullness
    public static <T> T getOnlyElement(java.util.Iterator<? extends T> it, @com.google.common.collect.ParametricNullness T t) {
        return it.hasNext() ? (T) getOnlyElement(it) : t;
    }

    public static <T> T[] toArray(java.util.Iterator<? extends T> it, java.lang.Class<T> cls) {
        return (T[]) com.google.common.collect.Iterables.toArray(com.google.common.collect.Lists.newArrayList(it), cls);
    }

    public static <T> boolean addAll(java.util.Collection<T> addTo, java.util.Iterator<? extends T> iterator) {
        com.google.common.base.Preconditions.checkNotNull(addTo);
        com.google.common.base.Preconditions.checkNotNull(iterator);
        boolean zAdd = false;
        while (iterator.hasNext()) {
            zAdd |= addTo.add(iterator.next());
        }
        return zAdd;
    }

    public static int frequency(java.util.Iterator<?> iterator, @javax.annotation.CheckForNull java.lang.Object element) {
        int i = 0;
        while (contains(iterator, element)) {
            i++;
        }
        return i;
    }

    public static <T> java.util.Iterator<T> cycle(final java.lang.Iterable<T> iterable) {
        com.google.common.base.Preconditions.checkNotNull(iterable);
        return new java.util.Iterator<T>() { // from class: com.google.common.collect.Iterators.2
            java.util.Iterator<T> iterator = com.google.common.collect.Iterators.emptyModifiableIterator();

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.iterator.hasNext() || iterable.iterator().hasNext();
            }

            @Override // java.util.Iterator
            @com.google.common.collect.ParametricNullness
            public T next() {
                if (!this.iterator.hasNext()) {
                    java.util.Iterator<T> it = iterable.iterator();
                    this.iterator = it;
                    if (!it.hasNext()) {
                        throw new java.util.NoSuchElementException();
                    }
                }
                return this.iterator.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.iterator.remove();
            }
        };
    }

    @java.lang.SafeVarargs
    public static <T> java.util.Iterator<T> cycle(T... elements) {
        return cycle(com.google.common.collect.Lists.newArrayList(elements));
    }

    private static <I extends java.util.Iterator<?>> java.util.Iterator<I> consumingForArray(final I... iArr) {
        return new com.google.common.collect.UnmodifiableIterator<I>() { // from class: com.google.common.collect.Iterators.3
            int index = 0;

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < iArr.length;
            }

            /* JADX WARN: Incorrect return type in method signature: ()TI; */
            @Override // java.util.Iterator
            public java.util.Iterator next() {
                if (!hasNext()) {
                    throw new java.util.NoSuchElementException();
                }
                java.util.Iterator it = (java.util.Iterator) java.util.Objects.requireNonNull(iArr[this.index]);
                java.util.Iterator[] itArr = iArr;
                int i = this.index;
                itArr[i] = null;
                this.index = i + 1;
                return it;
            }
        };
    }

    public static <T> java.util.Iterator<T> concat(java.util.Iterator<? extends T> a2, java.util.Iterator<? extends T> b) {
        com.google.common.base.Preconditions.checkNotNull(a2);
        com.google.common.base.Preconditions.checkNotNull(b);
        return concat(consumingForArray(a2, b));
    }

    public static <T> java.util.Iterator<T> concat(java.util.Iterator<? extends T> a2, java.util.Iterator<? extends T> b, java.util.Iterator<? extends T> c) {
        com.google.common.base.Preconditions.checkNotNull(a2);
        com.google.common.base.Preconditions.checkNotNull(b);
        com.google.common.base.Preconditions.checkNotNull(c);
        return concat(consumingForArray(a2, b, c));
    }

    public static <T> java.util.Iterator<T> concat(java.util.Iterator<? extends T> a2, java.util.Iterator<? extends T> b, java.util.Iterator<? extends T> c, java.util.Iterator<? extends T> d) {
        com.google.common.base.Preconditions.checkNotNull(a2);
        com.google.common.base.Preconditions.checkNotNull(b);
        com.google.common.base.Preconditions.checkNotNull(c);
        com.google.common.base.Preconditions.checkNotNull(d);
        return concat(consumingForArray(a2, b, c, d));
    }

    public static <T> java.util.Iterator<T> concat(java.util.Iterator<? extends T>... inputs) {
        return concatNoDefensiveCopy((java.util.Iterator[]) java.util.Arrays.copyOf(inputs, inputs.length));
    }

    public static <T> java.util.Iterator<T> concat(java.util.Iterator<? extends java.util.Iterator<? extends T>> inputs) {
        return new com.google.common.collect.Iterators.ConcatenatedIterator(inputs);
    }

    static <T> java.util.Iterator<T> concatNoDefensiveCopy(java.util.Iterator<? extends T>... inputs) {
        for (java.util.Iterator it : (java.util.Iterator[]) com.google.common.base.Preconditions.checkNotNull(inputs)) {
            com.google.common.base.Preconditions.checkNotNull(it);
        }
        return concat(consumingForArray(inputs));
    }

    public static <T> com.google.common.collect.UnmodifiableIterator<java.util.List<T>> partition(java.util.Iterator<T> iterator, int size) {
        return partitionImpl(iterator, size, false);
    }

    public static <T> com.google.common.collect.UnmodifiableIterator<java.util.List<T>> paddedPartition(java.util.Iterator<T> iterator, int size) {
        return partitionImpl(iterator, size, true);
    }

    private static <T> com.google.common.collect.UnmodifiableIterator<java.util.List<T>> partitionImpl(final java.util.Iterator<T> iterator, final int size, final boolean pad) {
        com.google.common.base.Preconditions.checkNotNull(iterator);
        com.google.common.base.Preconditions.checkArgument(size > 0);
        return new com.google.common.collect.UnmodifiableIterator<java.util.List<T>>() { // from class: com.google.common.collect.Iterators.4
            @Override // java.util.Iterator
            public boolean hasNext() {
                return iterator.hasNext();
            }

            @Override // java.util.Iterator
            public java.util.List<T> next() {
                if (!hasNext()) {
                    throw new java.util.NoSuchElementException();
                }
                java.lang.Object[] objArr = new java.lang.Object[size];
                int i = 0;
                while (i < size && iterator.hasNext()) {
                    objArr[i] = iterator.next();
                    i++;
                }
                for (int i2 = i; i2 < size; i2++) {
                    objArr[i2] = null;
                }
                java.util.List<T> listUnmodifiableList = java.util.Collections.unmodifiableList(java.util.Arrays.asList(objArr));
                return (pad || i == size) ? listUnmodifiableList : listUnmodifiableList.subList(0, i);
            }
        };
    }

    public static <T> com.google.common.collect.UnmodifiableIterator<T> filter(final java.util.Iterator<T> unfiltered, final com.google.common.base.Predicate<? super T> retainIfTrue) {
        com.google.common.base.Preconditions.checkNotNull(unfiltered);
        com.google.common.base.Preconditions.checkNotNull(retainIfTrue);
        return new com.google.common.collect.AbstractIterator<T>() { // from class: com.google.common.collect.Iterators.5
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.google.common.collect.AbstractIterator
            @javax.annotation.CheckForNull
            protected T computeNext() {
                while (unfiltered.hasNext()) {
                    T t = (T) unfiltered.next();
                    if (retainIfTrue.apply(t)) {
                        return t;
                    }
                }
                return endOfData();
            }
        };
    }

    public static <T> com.google.common.collect.UnmodifiableIterator<T> filter(java.util.Iterator<?> unfiltered, java.lang.Class<T> desiredType) {
        return filter(unfiltered, com.google.common.base.Predicates.instanceOf(desiredType));
    }

    public static <T> boolean any(java.util.Iterator<T> iterator, com.google.common.base.Predicate<? super T> predicate) {
        return indexOf(iterator, predicate) != -1;
    }

    public static <T> boolean all(java.util.Iterator<T> iterator, com.google.common.base.Predicate<? super T> predicate) {
        com.google.common.base.Preconditions.checkNotNull(predicate);
        while (iterator.hasNext()) {
            if (!predicate.apply(iterator.next())) {
                return false;
            }
        }
        return true;
    }

    @com.google.common.collect.ParametricNullness
    public static <T> T find(java.util.Iterator<T> iterator, com.google.common.base.Predicate<? super T> predicate) {
        com.google.common.base.Preconditions.checkNotNull(iterator);
        com.google.common.base.Preconditions.checkNotNull(predicate);
        while (iterator.hasNext()) {
            T next = iterator.next();
            if (predicate.apply(next)) {
                return next;
            }
        }
        throw new java.util.NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    @javax.annotation.CheckForNull
    public static <T> T find(java.util.Iterator<? extends T> it, com.google.common.base.Predicate<? super T> predicate, @javax.annotation.CheckForNull T t) {
        com.google.common.base.Preconditions.checkNotNull(it);
        com.google.common.base.Preconditions.checkNotNull(predicate);
        while (it.hasNext()) {
            T next = it.next();
            if (predicate.apply(next)) {
                return next;
            }
        }
        return t;
    }

    public static <T> com.google.common.base.Optional<T> tryFind(java.util.Iterator<T> iterator, com.google.common.base.Predicate<? super T> predicate) {
        com.google.common.base.Preconditions.checkNotNull(iterator);
        com.google.common.base.Preconditions.checkNotNull(predicate);
        while (iterator.hasNext()) {
            T next = iterator.next();
            if (predicate.apply(next)) {
                return com.google.common.base.Optional.of(next);
            }
        }
        return com.google.common.base.Optional.absent();
    }

    public static <T> int indexOf(java.util.Iterator<T> iterator, com.google.common.base.Predicate<? super T> predicate) {
        com.google.common.base.Preconditions.checkNotNull(predicate, "predicate");
        int i = 0;
        while (iterator.hasNext()) {
            if (predicate.apply(iterator.next())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static <F, T> java.util.Iterator<T> transform(java.util.Iterator<F> fromIterator, final com.google.common.base.Function<? super F, ? extends T> function) {
        com.google.common.base.Preconditions.checkNotNull(function);
        return new com.google.common.collect.TransformedIterator<F, T>(fromIterator) { // from class: com.google.common.collect.Iterators.6
            @Override // com.google.common.collect.TransformedIterator
            @com.google.common.collect.ParametricNullness
            T transform(@com.google.common.collect.ParametricNullness F f) {
                return (T) function.apply(f);
            }
        };
    }

    @com.google.common.collect.ParametricNullness
    public static <T> T get(java.util.Iterator<T> iterator, int position) {
        checkNonnegative(position);
        int iAdvance = advance(iterator, position);
        if (!iterator.hasNext()) {
            throw new java.lang.IndexOutOfBoundsException("position (" + position + ") must be less than the number of elements that remained (" + iAdvance + ")");
        }
        return iterator.next();
    }

    @com.google.common.collect.ParametricNullness
    public static <T> T get(java.util.Iterator<? extends T> it, int i, @com.google.common.collect.ParametricNullness T t) {
        checkNonnegative(i);
        advance(it, i);
        return (T) getNext(it, t);
    }

    static void checkNonnegative(int position) {
        if (position < 0) {
            throw new java.lang.IndexOutOfBoundsException("position (" + position + ") must not be negative");
        }
    }

    @com.google.common.collect.ParametricNullness
    public static <T> T getNext(java.util.Iterator<? extends T> iterator, @com.google.common.collect.ParametricNullness T defaultValue) {
        return iterator.hasNext() ? iterator.next() : defaultValue;
    }

    @com.google.common.collect.ParametricNullness
    public static <T> T getLast(java.util.Iterator<T> iterator) {
        T next;
        do {
            next = iterator.next();
        } while (iterator.hasNext());
        return next;
    }

    @com.google.common.collect.ParametricNullness
    public static <T> T getLast(java.util.Iterator<? extends T> it, @com.google.common.collect.ParametricNullness T t) {
        return it.hasNext() ? (T) getLast(it) : t;
    }

    public static int advance(java.util.Iterator<?> iterator, int numberToAdvance) {
        com.google.common.base.Preconditions.checkNotNull(iterator);
        int i = 0;
        com.google.common.base.Preconditions.checkArgument(numberToAdvance >= 0, "numberToAdvance must be nonnegative");
        while (i < numberToAdvance && iterator.hasNext()) {
            iterator.next();
            i++;
        }
        return i;
    }

    public static <T> java.util.Iterator<T> limit(final java.util.Iterator<T> iterator, final int limitSize) {
        com.google.common.base.Preconditions.checkNotNull(iterator);
        com.google.common.base.Preconditions.checkArgument(limitSize >= 0, "limit is negative");
        return new java.util.Iterator<T>() { // from class: com.google.common.collect.Iterators.7
            private int count;

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.count < limitSize && iterator.hasNext();
            }

            @Override // java.util.Iterator
            @com.google.common.collect.ParametricNullness
            public T next() {
                if (!hasNext()) {
                    throw new java.util.NoSuchElementException();
                }
                this.count++;
                return (T) iterator.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                iterator.remove();
            }
        };
    }

    public static <T> java.util.Iterator<T> consumingIterator(final java.util.Iterator<T> iterator) {
        com.google.common.base.Preconditions.checkNotNull(iterator);
        return new com.google.common.collect.UnmodifiableIterator<T>() { // from class: com.google.common.collect.Iterators.8
            public java.lang.String toString() {
                return "Iterators.consumingIterator(...)";
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return iterator.hasNext();
            }

            @Override // java.util.Iterator
            @com.google.common.collect.ParametricNullness
            public T next() {
                T t = (T) iterator.next();
                iterator.remove();
                return t;
            }
        };
    }

    @javax.annotation.CheckForNull
    static <T> T pollNext(java.util.Iterator<T> iterator) {
        if (!iterator.hasNext()) {
            return null;
        }
        T next = iterator.next();
        iterator.remove();
        return next;
    }

    static void clear(java.util.Iterator<?> iterator) {
        com.google.common.base.Preconditions.checkNotNull(iterator);
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
    }

    @java.lang.SafeVarargs
    public static <T> com.google.common.collect.UnmodifiableIterator<T> forArray(T... array) {
        return forArrayWithPosition(array, 0);
    }

    static <T> com.google.common.collect.UnmodifiableListIterator<T> forArrayWithPosition(T[] array, int position) {
        if (array.length == 0) {
            com.google.common.base.Preconditions.checkPositionIndex(position, array.length);
            return emptyListIterator();
        }
        return new com.google.common.collect.Iterators.ArrayItr(array, position);
    }

    private static final class ArrayItr<T> extends com.google.common.collect.AbstractIndexedListIterator<T> {
        static final com.google.common.collect.UnmodifiableListIterator<java.lang.Object> EMPTY = new com.google.common.collect.Iterators.ArrayItr(new java.lang.Object[0], 0);
        private final T[] array;

        ArrayItr(T[] array, int position) {
            super(array.length, position);
            this.array = array;
        }

        @Override // com.google.common.collect.AbstractIndexedListIterator
        @com.google.common.collect.ParametricNullness
        protected T get(int index) {
            return this.array[index];
        }
    }

    public static <T> com.google.common.collect.UnmodifiableIterator<T> singletonIterator(@com.google.common.collect.ParametricNullness T value) {
        return new com.google.common.collect.Iterators.SingletonIterator(value);
    }

    private static final class SingletonIterator<T> extends com.google.common.collect.UnmodifiableIterator<T> {
        private static final java.lang.Object SENTINEL = new java.lang.Object();
        private java.lang.Object valueOrSentinel;

        SingletonIterator(T value) {
            this.valueOrSentinel = value;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.valueOrSentinel != SENTINEL;
        }

        @Override // java.util.Iterator
        @com.google.common.collect.ParametricNullness
        public T next() {
            T t = (T) this.valueOrSentinel;
            java.lang.Object obj = SENTINEL;
            if (t == obj) {
                throw new java.util.NoSuchElementException();
            }
            this.valueOrSentinel = obj;
            return t;
        }
    }

    public static <T> com.google.common.collect.UnmodifiableIterator<T> forEnumeration(final java.util.Enumeration<T> enumeration) {
        com.google.common.base.Preconditions.checkNotNull(enumeration);
        return new com.google.common.collect.UnmodifiableIterator<T>() { // from class: com.google.common.collect.Iterators.9
            @Override // java.util.Iterator
            public boolean hasNext() {
                return enumeration.hasMoreElements();
            }

            @Override // java.util.Iterator
            @com.google.common.collect.ParametricNullness
            public T next() {
                return (T) enumeration.nextElement();
            }
        };
    }

    public static <T> java.util.Enumeration<T> asEnumeration(final java.util.Iterator<T> iterator) {
        com.google.common.base.Preconditions.checkNotNull(iterator);
        return new java.util.Enumeration<T>() { // from class: com.google.common.collect.Iterators.10
            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return iterator.hasNext();
            }

            @Override // java.util.Enumeration
            @com.google.common.collect.ParametricNullness
            public T nextElement() {
                return (T) iterator.next();
            }
        };
    }

    private static class PeekingImpl<E> implements com.google.common.collect.PeekingIterator<E> {
        private boolean hasPeeked;
        private final java.util.Iterator<? extends E> iterator;

        @javax.annotation.CheckForNull
        private E peekedElement;

        public PeekingImpl(java.util.Iterator<? extends E> iterator) {
            this.iterator = (java.util.Iterator) com.google.common.base.Preconditions.checkNotNull(iterator);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.hasPeeked || this.iterator.hasNext();
        }

        @Override // com.google.common.collect.PeekingIterator, java.util.Iterator
        @com.google.common.collect.ParametricNullness
        public E next() {
            if (!this.hasPeeked) {
                return this.iterator.next();
            }
            E e = (E) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(this.peekedElement);
            this.hasPeeked = false;
            this.peekedElement = null;
            return e;
        }

        @Override // com.google.common.collect.PeekingIterator, java.util.Iterator
        public void remove() {
            com.google.common.base.Preconditions.checkState(!this.hasPeeked, "Can't remove after you've peeked at next");
            this.iterator.remove();
        }

        @Override // com.google.common.collect.PeekingIterator
        @com.google.common.collect.ParametricNullness
        public E peek() {
            if (!this.hasPeeked) {
                this.peekedElement = this.iterator.next();
                this.hasPeeked = true;
            }
            return (E) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(this.peekedElement);
        }
    }

    public static <T> com.google.common.collect.PeekingIterator<T> peekingIterator(java.util.Iterator<? extends T> iterator) {
        if (iterator instanceof com.google.common.collect.Iterators.PeekingImpl) {
            return (com.google.common.collect.Iterators.PeekingImpl) iterator;
        }
        return new com.google.common.collect.Iterators.PeekingImpl(iterator);
    }

    @java.lang.Deprecated
    public static <T> com.google.common.collect.PeekingIterator<T> peekingIterator(com.google.common.collect.PeekingIterator<T> iterator) {
        return (com.google.common.collect.PeekingIterator) com.google.common.base.Preconditions.checkNotNull(iterator);
    }

    public static <T> com.google.common.collect.UnmodifiableIterator<T> mergeSorted(java.lang.Iterable<? extends java.util.Iterator<? extends T>> iterators, java.util.Comparator<? super T> comparator) {
        com.google.common.base.Preconditions.checkNotNull(iterators, "iterators");
        com.google.common.base.Preconditions.checkNotNull(comparator, "comparator");
        return new com.google.common.collect.Iterators.MergingIterator(iterators, comparator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class MergingIterator<T> extends com.google.common.collect.UnmodifiableIterator<T> {
        final java.util.Queue<com.google.common.collect.PeekingIterator<T>> queue;

        public MergingIterator(java.lang.Iterable<? extends java.util.Iterator<? extends T>> iterators, final java.util.Comparator<? super T> itemComparator) {
            this.queue = new java.util.PriorityQueue(2, new java.util.Comparator() { // from class: com.google.common.collect.Iterators$MergingIterator$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                    return itemComparator.compare(((com.google.common.collect.PeekingIterator) obj).peek(), ((com.google.common.collect.PeekingIterator) obj2).peek());
                }
            });
            for (java.util.Iterator<? extends T> it : iterators) {
                if (it.hasNext()) {
                    this.queue.add(com.google.common.collect.Iterators.peekingIterator(it));
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.queue.isEmpty();
        }

        @Override // java.util.Iterator
        @com.google.common.collect.ParametricNullness
        public T next() {
            com.google.common.collect.PeekingIterator<T> peekingIteratorRemove = this.queue.remove();
            T next = peekingIteratorRemove.next();
            if (peekingIteratorRemove.hasNext()) {
                this.queue.add(peekingIteratorRemove);
            }
            return next;
        }
    }

    private static class ConcatenatedIterator<T> implements java.util.Iterator<T> {
        private java.util.Iterator<? extends T> iterator = com.google.common.collect.Iterators.emptyIterator();

        @javax.annotation.CheckForNull
        private java.util.Deque<java.util.Iterator<? extends java.util.Iterator<? extends T>>> metaIterators;

        @javax.annotation.CheckForNull
        private java.util.Iterator<? extends T> toRemove;

        @javax.annotation.CheckForNull
        private java.util.Iterator<? extends java.util.Iterator<? extends T>> topMetaIterator;

        ConcatenatedIterator(java.util.Iterator<? extends java.util.Iterator<? extends T>> metaIterator) {
            this.topMetaIterator = (java.util.Iterator) com.google.common.base.Preconditions.checkNotNull(metaIterator);
        }

        @javax.annotation.CheckForNull
        private java.util.Iterator<? extends java.util.Iterator<? extends T>> getTopMetaIterator() {
            while (true) {
                java.util.Iterator<? extends java.util.Iterator<? extends T>> it = this.topMetaIterator;
                if (it == null || !it.hasNext()) {
                    java.util.Deque<java.util.Iterator<? extends java.util.Iterator<? extends T>>> deque = this.metaIterators;
                    if (deque == null || deque.isEmpty()) {
                        return null;
                    }
                    this.topMetaIterator = this.metaIterators.removeFirst();
                } else {
                    return this.topMetaIterator;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (!((java.util.Iterator) com.google.common.base.Preconditions.checkNotNull(this.iterator)).hasNext()) {
                java.util.Iterator<? extends java.util.Iterator<? extends T>> topMetaIterator = getTopMetaIterator();
                this.topMetaIterator = topMetaIterator;
                if (topMetaIterator == null) {
                    return false;
                }
                java.util.Iterator<? extends T> next = topMetaIterator.next();
                this.iterator = next;
                if (next instanceof com.google.common.collect.Iterators.ConcatenatedIterator) {
                    com.google.common.collect.Iterators.ConcatenatedIterator concatenatedIterator = (com.google.common.collect.Iterators.ConcatenatedIterator) next;
                    this.iterator = concatenatedIterator.iterator;
                    if (this.metaIterators == null) {
                        this.metaIterators = new java.util.ArrayDeque();
                    }
                    this.metaIterators.addFirst(this.topMetaIterator);
                    if (concatenatedIterator.metaIterators != null) {
                        while (!concatenatedIterator.metaIterators.isEmpty()) {
                            this.metaIterators.addFirst(concatenatedIterator.metaIterators.removeLast());
                        }
                    }
                    this.topMetaIterator = concatenatedIterator.topMetaIterator;
                }
            }
            return true;
        }

        @Override // java.util.Iterator
        @com.google.common.collect.ParametricNullness
        public T next() {
            if (hasNext()) {
                java.util.Iterator<? extends T> it = this.iterator;
                this.toRemove = it;
                return it.next();
            }
            throw new java.util.NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            java.util.Iterator<? extends T> it = this.toRemove;
            if (it == null) {
                throw new java.lang.IllegalStateException("no calls to next() since the last call to remove()");
            }
            it.remove();
            this.toRemove = null;
        }
    }
}
