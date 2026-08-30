package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class HashMultiset<E> extends com.google.common.collect.AbstractMapBasedMultiset<E> {
    private static final long serialVersionUID = 0;

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ boolean contains(@javax.annotation.CheckForNull java.lang.Object element) {
        return super.contains(element);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ java.util.Set elementSet() {
        return super.elementSet();
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ java.util.Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public static <E> com.google.common.collect.HashMultiset<E> create() {
        return create(3);
    }

    public static <E> com.google.common.collect.HashMultiset<E> create(int distinctElements) {
        return new com.google.common.collect.HashMultiset<>(distinctElements);
    }

    public static <E> com.google.common.collect.HashMultiset<E> create(java.lang.Iterable<? extends E> elements) {
        com.google.common.collect.HashMultiset<E> hashMultisetCreate = create(com.google.common.collect.Multisets.inferDistinctElements(elements));
        com.google.common.collect.Iterables.addAll(hashMultisetCreate, elements);
        return hashMultisetCreate;
    }

    HashMultiset(int distinctElements) {
        super(distinctElements);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultiset
    com.google.common.collect.ObjectCountHashMap<E> newBackingMap(int distinctElements) {
        return new com.google.common.collect.ObjectCountHashMap<>(distinctElements);
    }
}
