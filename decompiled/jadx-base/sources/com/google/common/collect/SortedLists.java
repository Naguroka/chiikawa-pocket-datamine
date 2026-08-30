package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class SortedLists {

    enum KeyAbsentBehavior {
        NEXT_LOWER { // from class: com.google.common.collect.SortedLists.KeyAbsentBehavior.1
            @Override // com.google.common.collect.SortedLists.KeyAbsentBehavior
            int resultIndex(int higherIndex) {
                return higherIndex - 1;
            }
        },
        NEXT_HIGHER { // from class: com.google.common.collect.SortedLists.KeyAbsentBehavior.2
            @Override // com.google.common.collect.SortedLists.KeyAbsentBehavior
            public int resultIndex(int higherIndex) {
                return higherIndex;
            }
        },
        INVERTED_INSERTION_INDEX { // from class: com.google.common.collect.SortedLists.KeyAbsentBehavior.3
            @Override // com.google.common.collect.SortedLists.KeyAbsentBehavior
            public int resultIndex(int higherIndex) {
                return ~higherIndex;
            }
        };

        abstract int resultIndex(int higherIndex);
    }

    enum KeyPresentBehavior {
        ANY_PRESENT { // from class: com.google.common.collect.SortedLists.KeyPresentBehavior.1
            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            <E> int resultIndex(java.util.Comparator<? super E> comparator, @com.google.common.collect.ParametricNullness E key, java.util.List<? extends E> list, int foundIndex) {
                return foundIndex;
            }
        },
        LAST_PRESENT { // from class: com.google.common.collect.SortedLists.KeyPresentBehavior.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            <E> int resultIndex(java.util.Comparator<? super E> comparator, @com.google.common.collect.ParametricNullness E e, java.util.List<? extends E> list, int i) {
                int size = list.size() - 1;
                while (i < size) {
                    int i2 = ((i + size) + 1) >>> 1;
                    if (comparator.compare(list.get(i2), e) > 0) {
                        size = i2 - 1;
                    } else {
                        i = i2;
                    }
                }
                return i;
            }
        },
        FIRST_PRESENT { // from class: com.google.common.collect.SortedLists.KeyPresentBehavior.3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            <E> int resultIndex(java.util.Comparator<? super E> comparator, @com.google.common.collect.ParametricNullness E e, java.util.List<? extends E> list, int i) {
                int i2 = 0;
                while (i2 < i) {
                    int i3 = (i2 + i) >>> 1;
                    if (comparator.compare(list.get(i3), e) < 0) {
                        i2 = i3 + 1;
                    } else {
                        i = i3;
                    }
                }
                return i2;
            }
        },
        FIRST_AFTER { // from class: com.google.common.collect.SortedLists.KeyPresentBehavior.4
            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            public <E> int resultIndex(java.util.Comparator<? super E> comparator, @com.google.common.collect.ParametricNullness E key, java.util.List<? extends E> list, int foundIndex) {
                return LAST_PRESENT.resultIndex(comparator, key, list, foundIndex) + 1;
            }
        },
        LAST_BEFORE { // from class: com.google.common.collect.SortedLists.KeyPresentBehavior.5
            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            public <E> int resultIndex(java.util.Comparator<? super E> comparator, @com.google.common.collect.ParametricNullness E key, java.util.List<? extends E> list, int foundIndex) {
                return FIRST_PRESENT.resultIndex(comparator, key, list, foundIndex) - 1;
            }
        };

        abstract <E> int resultIndex(java.util.Comparator<? super E> comparator, @com.google.common.collect.ParametricNullness E key, java.util.List<? extends E> list, int foundIndex);
    }

    private SortedLists() {
    }

    public static <E extends java.lang.Comparable> int binarySearch(java.util.List<? extends E> list, E e, com.google.common.collect.SortedLists.KeyPresentBehavior presentBehavior, com.google.common.collect.SortedLists.KeyAbsentBehavior absentBehavior) {
        com.google.common.base.Preconditions.checkNotNull(e);
        return binarySearch(list, e, com.google.common.collect.Ordering.natural(), presentBehavior, absentBehavior);
    }

    public static <E, K extends java.lang.Comparable> int binarySearch(java.util.List<E> list, com.google.common.base.Function<? super E, K> keyFunction, K key, com.google.common.collect.SortedLists.KeyPresentBehavior presentBehavior, com.google.common.collect.SortedLists.KeyAbsentBehavior absentBehavior) {
        com.google.common.base.Preconditions.checkNotNull(key);
        return binarySearch(list, keyFunction, key, com.google.common.collect.Ordering.natural(), presentBehavior, absentBehavior);
    }

    public static <E, K> int binarySearch(java.util.List<E> list, com.google.common.base.Function<? super E, K> keyFunction, @com.google.common.collect.ParametricNullness K key, java.util.Comparator<? super K> keyComparator, com.google.common.collect.SortedLists.KeyPresentBehavior presentBehavior, com.google.common.collect.SortedLists.KeyAbsentBehavior absentBehavior) {
        return binarySearch((java.util.List<? extends K>) com.google.common.collect.Lists.transform(list, keyFunction), key, keyComparator, presentBehavior, absentBehavior);
    }

    public static <E> int binarySearch(java.util.List<? extends E> list, @com.google.common.collect.ParametricNullness E e, java.util.Comparator<? super E> comparator, com.google.common.collect.SortedLists.KeyPresentBehavior keyPresentBehavior, com.google.common.collect.SortedLists.KeyAbsentBehavior keyAbsentBehavior) {
        com.google.common.base.Preconditions.checkNotNull(comparator);
        com.google.common.base.Preconditions.checkNotNull(list);
        com.google.common.base.Preconditions.checkNotNull(keyPresentBehavior);
        com.google.common.base.Preconditions.checkNotNull(keyAbsentBehavior);
        if (!(list instanceof java.util.RandomAccess)) {
            list = com.google.common.collect.Lists.newArrayList(list);
        }
        int size = list.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            int iCompare = comparator.compare(e, list.get(i2));
            if (iCompare < 0) {
                size = i2 - 1;
            } else {
                if (iCompare <= 0) {
                    return i + keyPresentBehavior.resultIndex(comparator, e, list.subList(i, size + 1), i2 - i);
                }
                i = i2 + 1;
            }
        }
        return keyAbsentBehavior.resultIndex(i);
    }
}
