package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ImmutableMultiset<E> extends com.google.common.collect.ImmutableMultisetGwtSerializationDependencies<E> implements com.google.common.collect.Multiset<E> {
    private static final long serialVersionUID = 912559;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.ImmutableList<E> asList;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.ImmutableSet<com.google.common.collect.Multiset.Entry<E>> entrySet;

    static /* synthetic */ int lambda$toImmutableMultiset$0(java.lang.Object obj) {
        return 1;
    }

    @Override // com.google.common.collect.Multiset
    public abstract com.google.common.collect.ImmutableSet<E> elementSet();

    abstract com.google.common.collect.Multiset.Entry<E> getEntry(int index);

    @Override // com.google.common.collect.ImmutableCollection
    abstract java.lang.Object writeReplace();

    static <E> java.util.stream.Collector<E, ?, com.google.common.collect.ImmutableMultiset<E>> toImmutableMultiset() {
        return com.google.common.collect.CollectCollectors.toImmutableMultiset(java.util.function.Function.identity(), new java.util.function.ToIntFunction() { // from class: com.google.common.collect.ImmutableMultiset$$ExternalSyntheticLambda0
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(java.lang.Object obj) {
                return com.google.common.collect.ImmutableMultiset.lambda$toImmutableMultiset$0(obj);
            }
        });
    }

    static <T, E> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableMultiset<E>> toImmutableMultiset(java.util.function.Function<? super T, ? extends E> elementFunction, java.util.function.ToIntFunction<? super T> countFunction) {
        return com.google.common.collect.CollectCollectors.toImmutableMultiset(elementFunction, countFunction);
    }

    public static <E> com.google.common.collect.ImmutableMultiset<E> of() {
        return com.google.common.collect.RegularImmutableMultiset.EMPTY;
    }

    public static <E> com.google.common.collect.ImmutableMultiset<E> of(E element) {
        return copyFromElements(element);
    }

    public static <E> com.google.common.collect.ImmutableMultiset<E> of(E e1, E e2) {
        return copyFromElements(e1, e2);
    }

    public static <E> com.google.common.collect.ImmutableMultiset<E> of(E e1, E e2, E e3) {
        return copyFromElements(e1, e2, e3);
    }

    public static <E> com.google.common.collect.ImmutableMultiset<E> of(E e1, E e2, E e3, E e4) {
        return copyFromElements(e1, e2, e3, e4);
    }

    public static <E> com.google.common.collect.ImmutableMultiset<E> of(E e1, E e2, E e3, E e4, E e5) {
        return copyFromElements(e1, e2, e3, e4, e5);
    }

    public static <E> com.google.common.collect.ImmutableMultiset<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E... others) {
        return new com.google.common.collect.ImmutableMultiset.Builder().add((java.lang.Object) e1).add((java.lang.Object) e2).add((java.lang.Object) e3).add((java.lang.Object) e4).add((java.lang.Object) e5).add((java.lang.Object) e6).add((java.lang.Object[]) others).build();
    }

    public static <E> com.google.common.collect.ImmutableMultiset<E> copyOf(E[] elements) {
        return copyFromElements(elements);
    }

    public static <E> com.google.common.collect.ImmutableMultiset<E> copyOf(java.lang.Iterable<? extends E> elements) {
        if (elements instanceof com.google.common.collect.ImmutableMultiset) {
            com.google.common.collect.ImmutableMultiset<E> immutableMultiset = (com.google.common.collect.ImmutableMultiset) elements;
            if (!immutableMultiset.isPartialView()) {
                return immutableMultiset;
            }
        }
        com.google.common.collect.ImmutableMultiset.Builder builder = new com.google.common.collect.ImmutableMultiset.Builder(com.google.common.collect.Multisets.inferDistinctElements(elements));
        builder.addAll((java.lang.Iterable) elements);
        return builder.build();
    }

    public static <E> com.google.common.collect.ImmutableMultiset<E> copyOf(java.util.Iterator<? extends E> elements) {
        return new com.google.common.collect.ImmutableMultiset.Builder().addAll((java.util.Iterator) elements).build();
    }

    private static <E> com.google.common.collect.ImmutableMultiset<E> copyFromElements(E... elements) {
        return new com.google.common.collect.ImmutableMultiset.Builder().add((java.lang.Object[]) elements).build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E> com.google.common.collect.ImmutableMultiset<E> copyFromEntries(java.util.Collection<? extends com.google.common.collect.Multiset.Entry<? extends E>> entries) {
        com.google.common.collect.ImmutableMultiset.Builder builder = new com.google.common.collect.ImmutableMultiset.Builder(entries.size());
        for (com.google.common.collect.Multiset.Entry<? extends E> entry : entries) {
            builder.addCopies(entry.getElement(), entry.getCount());
        }
        return builder.build();
    }

    ImmutableMultiset() {
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public com.google.common.collect.UnmodifiableIterator<E> iterator() {
        final com.google.common.collect.UnmodifiableIterator<com.google.common.collect.Multiset.Entry<E>> it = entrySet().iterator();
        return new com.google.common.collect.UnmodifiableIterator<E>(this) { // from class: com.google.common.collect.ImmutableMultiset.1

            @javax.annotation.CheckForNull
            E element;
            int remaining;

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.remaining > 0 || it.hasNext();
            }

            @Override // java.util.Iterator
            public E next() {
                if (this.remaining <= 0) {
                    com.google.common.collect.Multiset.Entry entry = (com.google.common.collect.Multiset.Entry) it.next();
                    this.element = (E) entry.getElement();
                    this.remaining = entry.getCount();
                }
                this.remaining--;
                return (E) java.util.Objects.requireNonNull(this.element);
            }
        };
    }

    @Override // com.google.common.collect.ImmutableCollection
    public com.google.common.collect.ImmutableList<E> asList() {
        com.google.common.collect.ImmutableList<E> immutableList = this.asList;
        if (immutableList != null) {
            return immutableList;
        }
        com.google.common.collect.ImmutableList<E> immutableListAsList = super.asList();
        this.asList = immutableListAsList;
        return immutableListAsList;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object object) {
        return count(object) > 0;
    }

    @Override // com.google.common.collect.Multiset
    @java.lang.Deprecated
    public final int add(E element, int occurrences) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Multiset
    @java.lang.Deprecated
    public final int remove(@javax.annotation.CheckForNull java.lang.Object element, int occurrences) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Multiset
    @java.lang.Deprecated
    public final int setCount(E element, int count) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Multiset
    @java.lang.Deprecated
    public final boolean setCount(E element, int oldCount, int newCount) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    int copyIntoArray(java.lang.Object[] dst, int offset) {
        com.google.common.collect.UnmodifiableIterator<com.google.common.collect.Multiset.Entry<E>> it = entrySet().iterator();
        while (it.hasNext()) {
            com.google.common.collect.Multiset.Entry<E> next = it.next();
            java.util.Arrays.fill(dst, offset, next.getCount() + offset, next.getElement());
            offset += next.getCount();
        }
        return offset;
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        return com.google.common.collect.Multisets.equalsImpl(this, object);
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public int hashCode() {
        return com.google.common.collect.Sets.hashCodeImpl(entrySet());
    }

    @Override // java.util.AbstractCollection, com.google.common.collect.Multiset
    public java.lang.String toString() {
        return entrySet().toString();
    }

    @Override // com.google.common.collect.Multiset
    public com.google.common.collect.ImmutableSet<com.google.common.collect.Multiset.Entry<E>> entrySet() {
        com.google.common.collect.ImmutableSet<com.google.common.collect.Multiset.Entry<E>> immutableSet = this.entrySet;
        if (immutableSet != null) {
            return immutableSet;
        }
        com.google.common.collect.ImmutableSet<com.google.common.collect.Multiset.Entry<E>> immutableSetCreateEntrySet = createEntrySet();
        this.entrySet = immutableSetCreateEntrySet;
        return immutableSetCreateEntrySet;
    }

    private com.google.common.collect.ImmutableSet<com.google.common.collect.Multiset.Entry<E>> createEntrySet() {
        return isEmpty() ? com.google.common.collect.ImmutableSet.of() : new com.google.common.collect.ImmutableMultiset.EntrySet();
    }

    private final class EntrySet extends com.google.common.collect.IndexedImmutableSet<com.google.common.collect.Multiset.Entry<E>> {
        private static final long serialVersionUID = 0;

        private EntrySet() {
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
            return com.google.common.collect.ImmutableMultiset.this.isPartialView();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.IndexedImmutableSet
        public com.google.common.collect.Multiset.Entry<E> get(int index) {
            return com.google.common.collect.ImmutableMultiset.this.getEntry(index);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return com.google.common.collect.ImmutableMultiset.this.elementSet().size();
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object o) {
            if (!(o instanceof com.google.common.collect.Multiset.Entry)) {
                return false;
            }
            com.google.common.collect.Multiset.Entry entry = (com.google.common.collect.Multiset.Entry) o;
            return entry.getCount() > 0 && com.google.common.collect.ImmutableMultiset.this.count(entry.getElement()) == entry.getCount();
        }

        @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return com.google.common.collect.ImmutableMultiset.this.hashCode();
        }

        @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        java.lang.Object writeReplace() {
            return new com.google.common.collect.ImmutableMultiset.EntrySetSerializedForm(com.google.common.collect.ImmutableMultiset.this);
        }

        private void readObject(java.io.ObjectInputStream stream) throws java.io.InvalidObjectException {
            throw new java.io.InvalidObjectException("Use EntrySetSerializedForm");
        }
    }

    static class EntrySetSerializedForm<E> implements java.io.Serializable {
        final com.google.common.collect.ImmutableMultiset<E> multiset;

        EntrySetSerializedForm(com.google.common.collect.ImmutableMultiset<E> multiset) {
            this.multiset = multiset;
        }

        java.lang.Object readResolve() {
            return this.multiset.entrySet();
        }
    }

    private void readObject(java.io.ObjectInputStream stream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }

    public static <E> com.google.common.collect.ImmutableMultiset.Builder<E> builder() {
        return new com.google.common.collect.ImmutableMultiset.Builder<>();
    }

    public static class Builder<E> extends com.google.common.collect.ImmutableCollection.Builder<E> {
        boolean buildInvoked;

        @javax.annotation.CheckForNull
        com.google.common.collect.ObjectCountHashMap<E> contents;
        boolean isLinkedHash;

        public Builder() {
            this(4);
        }

        Builder(int estimatedDistinct) {
            this.buildInvoked = false;
            this.isLinkedHash = false;
            this.contents = com.google.common.collect.ObjectCountHashMap.createWithExpectedSize(estimatedDistinct);
        }

        Builder(boolean forSubtype) {
            this.buildInvoked = false;
            this.isLinkedHash = false;
            this.contents = null;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableMultiset.Builder<E> add(E element) {
            return addCopies(element, 1);
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableMultiset.Builder<E> add(E... elements) {
            super.add((java.lang.Object[]) elements);
            return this;
        }

        public com.google.common.collect.ImmutableMultiset.Builder<E> addCopies(E element, int occurrences) {
            java.util.Objects.requireNonNull(this.contents);
            if (occurrences == 0) {
                return this;
            }
            if (this.buildInvoked) {
                this.contents = new com.google.common.collect.ObjectCountHashMap<>(this.contents);
                this.isLinkedHash = false;
            }
            this.buildInvoked = false;
            com.google.common.base.Preconditions.checkNotNull(element);
            com.google.common.collect.ObjectCountHashMap<E> objectCountHashMap = this.contents;
            objectCountHashMap.put(element, occurrences + objectCountHashMap.get(element));
            return this;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public com.google.common.collect.ImmutableMultiset.Builder<E> setCount(E e, int i) {
            java.util.Objects.requireNonNull(this.contents);
            if (i == 0 && !this.isLinkedHash) {
                this.contents = new com.google.common.collect.ObjectCountLinkedHashMap(this.contents);
                this.isLinkedHash = true;
            } else if (this.buildInvoked) {
                this.contents = new com.google.common.collect.ObjectCountHashMap<>(this.contents);
                this.isLinkedHash = false;
            }
            this.buildInvoked = false;
            com.google.common.base.Preconditions.checkNotNull(e);
            if (i == 0) {
                this.contents.remove(e);
            } else {
                this.contents.put((E) com.google.common.base.Preconditions.checkNotNull(e), i);
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableMultiset.Builder<E> addAll(java.lang.Iterable<? extends E> elements) {
            java.util.Objects.requireNonNull(this.contents);
            if (elements instanceof com.google.common.collect.Multiset) {
                com.google.common.collect.Multiset multisetCast = com.google.common.collect.Multisets.cast(elements);
                com.google.common.collect.ObjectCountHashMap objectCountHashMapTryGetMap = tryGetMap(multisetCast);
                if (objectCountHashMapTryGetMap != null) {
                    com.google.common.collect.ObjectCountHashMap<E> objectCountHashMap = this.contents;
                    objectCountHashMap.ensureCapacity(java.lang.Math.max(objectCountHashMap.size(), objectCountHashMapTryGetMap.size()));
                    for (int iFirstIndex = objectCountHashMapTryGetMap.firstIndex(); iFirstIndex >= 0; iFirstIndex = objectCountHashMapTryGetMap.nextIndex(iFirstIndex)) {
                        addCopies(objectCountHashMapTryGetMap.getKey(iFirstIndex), objectCountHashMapTryGetMap.getValue(iFirstIndex));
                    }
                } else {
                    java.util.Set<com.google.common.collect.Multiset.Entry<E>> setEntrySet = multisetCast.entrySet();
                    com.google.common.collect.ObjectCountHashMap<E> objectCountHashMap2 = this.contents;
                    objectCountHashMap2.ensureCapacity(java.lang.Math.max(objectCountHashMap2.size(), setEntrySet.size()));
                    for (com.google.common.collect.Multiset.Entry<E> entry : multisetCast.entrySet()) {
                        addCopies(entry.getElement(), entry.getCount());
                    }
                }
            } else {
                super.addAll((java.lang.Iterable) elements);
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableMultiset.Builder<E> addAll(java.util.Iterator<? extends E> elements) {
            super.addAll((java.util.Iterator) elements);
            return this;
        }

        @javax.annotation.CheckForNull
        static <T> com.google.common.collect.ObjectCountHashMap<T> tryGetMap(java.lang.Iterable<T> iterable) {
            if (iterable instanceof com.google.common.collect.RegularImmutableMultiset) {
                return ((com.google.common.collect.RegularImmutableMultiset) iterable).contents;
            }
            if (iterable instanceof com.google.common.collect.AbstractMapBasedMultiset) {
                return ((com.google.common.collect.AbstractMapBasedMultiset) iterable).backingMap;
            }
            return null;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableMultiset<E> build() {
            java.util.Objects.requireNonNull(this.contents);
            if (this.contents.size() == 0) {
                return com.google.common.collect.ImmutableMultiset.of();
            }
            if (this.isLinkedHash) {
                this.contents = new com.google.common.collect.ObjectCountHashMap<>(this.contents);
                this.isLinkedHash = false;
            }
            this.buildInvoked = true;
            return new com.google.common.collect.RegularImmutableMultiset(this.contents);
        }
    }
}
