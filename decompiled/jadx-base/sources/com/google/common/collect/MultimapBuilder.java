package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class MultimapBuilder<K0, V0> {
    private static final int DEFAULT_EXPECTED_KEYS = 8;

    public abstract <K extends K0, V extends V0> com.google.common.collect.Multimap<K, V> build();

    private MultimapBuilder() {
    }

    public static com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys<java.lang.Object> hashKeys() {
        return hashKeys(8);
    }

    public static com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys<java.lang.Object> hashKeys(final int expectedKeys) {
        com.google.common.collect.CollectPreconditions.checkNonnegative(expectedKeys, "expectedKeys");
        return new com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys<java.lang.Object>() { // from class: com.google.common.collect.MultimapBuilder.1
            @Override // com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys
            <K, V> java.util.Map<K, java.util.Collection<V>> createMap() {
                return com.google.common.collect.Platform.newHashMapWithExpectedSize(expectedKeys);
            }
        };
    }

    public static com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys<java.lang.Object> linkedHashKeys() {
        return linkedHashKeys(8);
    }

    public static com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys<java.lang.Object> linkedHashKeys(final int expectedKeys) {
        com.google.common.collect.CollectPreconditions.checkNonnegative(expectedKeys, "expectedKeys");
        return new com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys<java.lang.Object>() { // from class: com.google.common.collect.MultimapBuilder.2
            @Override // com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys
            <K, V> java.util.Map<K, java.util.Collection<V>> createMap() {
                return com.google.common.collect.Platform.newLinkedHashMapWithExpectedSize(expectedKeys);
            }
        };
    }

    public static com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys<java.lang.Comparable> treeKeys() {
        return treeKeys(com.google.common.collect.Ordering.natural());
    }

    public static <K0> com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys<K0> treeKeys(final java.util.Comparator<K0> comparator) {
        com.google.common.base.Preconditions.checkNotNull(comparator);
        return new com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys<K0>() { // from class: com.google.common.collect.MultimapBuilder.3
            @Override // com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys
            <K extends K0, V> java.util.Map<K, java.util.Collection<V>> createMap() {
                return new java.util.TreeMap(comparator);
            }
        };
    }

    public static <K0 extends java.lang.Enum<K0>> com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys<K0> enumKeys(final java.lang.Class<K0> keyClass) {
        com.google.common.base.Preconditions.checkNotNull(keyClass);
        return new com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys<K0>() { // from class: com.google.common.collect.MultimapBuilder.4
            @Override // com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys
            <K extends K0, V> java.util.Map<K, java.util.Collection<V>> createMap() {
                return new java.util.EnumMap(keyClass);
            }
        };
    }

    private static final class ArrayListSupplier<V> implements com.google.common.base.Supplier<java.util.List<V>>, java.io.Serializable {
        private final int expectedValuesPerKey;

        ArrayListSupplier(int expectedValuesPerKey) {
            this.expectedValuesPerKey = com.google.common.collect.CollectPreconditions.checkNonnegative(expectedValuesPerKey, "expectedValuesPerKey");
        }

        @Override // com.google.common.base.Supplier
        public java.util.List<V> get() {
            return new java.util.ArrayList(this.expectedValuesPerKey);
        }
    }

    private enum LinkedListSupplier implements com.google.common.base.Supplier<java.util.List<?>> {
        INSTANCE;

        public static <V> com.google.common.base.Supplier<java.util.List<V>> instance() {
            return INSTANCE;
        }

        @Override // com.google.common.base.Supplier
        public java.util.List<?> get() {
            return new java.util.LinkedList();
        }
    }

    private static final class HashSetSupplier<V> implements com.google.common.base.Supplier<java.util.Set<V>>, java.io.Serializable {
        private final int expectedValuesPerKey;

        HashSetSupplier(int expectedValuesPerKey) {
            this.expectedValuesPerKey = com.google.common.collect.CollectPreconditions.checkNonnegative(expectedValuesPerKey, "expectedValuesPerKey");
        }

        @Override // com.google.common.base.Supplier
        public java.util.Set<V> get() {
            return com.google.common.collect.Platform.newHashSetWithExpectedSize(this.expectedValuesPerKey);
        }
    }

    private static final class LinkedHashSetSupplier<V> implements com.google.common.base.Supplier<java.util.Set<V>>, java.io.Serializable {
        private final int expectedValuesPerKey;

        LinkedHashSetSupplier(int expectedValuesPerKey) {
            this.expectedValuesPerKey = com.google.common.collect.CollectPreconditions.checkNonnegative(expectedValuesPerKey, "expectedValuesPerKey");
        }

        @Override // com.google.common.base.Supplier
        public java.util.Set<V> get() {
            return com.google.common.collect.Platform.newLinkedHashSetWithExpectedSize(this.expectedValuesPerKey);
        }
    }

    private static final class TreeSetSupplier<V> implements com.google.common.base.Supplier<java.util.SortedSet<V>>, java.io.Serializable {
        private final java.util.Comparator<? super V> comparator;

        TreeSetSupplier(java.util.Comparator<? super V> comparator) {
            this.comparator = (java.util.Comparator) com.google.common.base.Preconditions.checkNotNull(comparator);
        }

        @Override // com.google.common.base.Supplier
        public java.util.SortedSet<V> get() {
            return new java.util.TreeSet(this.comparator);
        }
    }

    private static final class EnumSetSupplier<V extends java.lang.Enum<V>> implements com.google.common.base.Supplier<java.util.Set<V>>, java.io.Serializable {
        private final java.lang.Class<V> clazz;

        EnumSetSupplier(java.lang.Class<V> clazz) {
            this.clazz = (java.lang.Class) com.google.common.base.Preconditions.checkNotNull(clazz);
        }

        @Override // com.google.common.base.Supplier
        public java.util.Set<V> get() {
            return java.util.EnumSet.noneOf(this.clazz);
        }
    }

    public static abstract class MultimapBuilderWithKeys<K0> {
        private static final int DEFAULT_EXPECTED_VALUES_PER_KEY = 2;

        abstract <K extends K0, V> java.util.Map<K, java.util.Collection<V>> createMap();

        MultimapBuilderWithKeys() {
        }

        public com.google.common.collect.MultimapBuilder.ListMultimapBuilder<K0, java.lang.Object> arrayListValues() {
            return arrayListValues(2);
        }

        public com.google.common.collect.MultimapBuilder.ListMultimapBuilder<K0, java.lang.Object> arrayListValues(final int expectedValuesPerKey) {
            com.google.common.collect.CollectPreconditions.checkNonnegative(expectedValuesPerKey, "expectedValuesPerKey");
            return new com.google.common.collect.MultimapBuilder.ListMultimapBuilder<K0, java.lang.Object>() { // from class: com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys.1
                @Override // com.google.common.collect.MultimapBuilder.ListMultimapBuilder, com.google.common.collect.MultimapBuilder
                public <K extends K0, V> com.google.common.collect.ListMultimap<K, V> build() {
                    return com.google.common.collect.Multimaps.newListMultimap(com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys.this.createMap(), new com.google.common.collect.MultimapBuilder.ArrayListSupplier(expectedValuesPerKey));
                }
            };
        }

        public com.google.common.collect.MultimapBuilder.ListMultimapBuilder<K0, java.lang.Object> linkedListValues() {
            return new com.google.common.collect.MultimapBuilder.ListMultimapBuilder<K0, java.lang.Object>() { // from class: com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys.2
                @Override // com.google.common.collect.MultimapBuilder.ListMultimapBuilder, com.google.common.collect.MultimapBuilder
                public <K extends K0, V> com.google.common.collect.ListMultimap<K, V> build() {
                    return com.google.common.collect.Multimaps.newListMultimap(com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys.this.createMap(), com.google.common.collect.MultimapBuilder.LinkedListSupplier.instance());
                }
            };
        }

        public com.google.common.collect.MultimapBuilder.SetMultimapBuilder<K0, java.lang.Object> hashSetValues() {
            return hashSetValues(2);
        }

        public com.google.common.collect.MultimapBuilder.SetMultimapBuilder<K0, java.lang.Object> hashSetValues(final int expectedValuesPerKey) {
            com.google.common.collect.CollectPreconditions.checkNonnegative(expectedValuesPerKey, "expectedValuesPerKey");
            return new com.google.common.collect.MultimapBuilder.SetMultimapBuilder<K0, java.lang.Object>() { // from class: com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys.3
                @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
                public <K extends K0, V> com.google.common.collect.SetMultimap<K, V> build() {
                    return com.google.common.collect.Multimaps.newSetMultimap(com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys.this.createMap(), new com.google.common.collect.MultimapBuilder.HashSetSupplier(expectedValuesPerKey));
                }
            };
        }

        public com.google.common.collect.MultimapBuilder.SetMultimapBuilder<K0, java.lang.Object> linkedHashSetValues() {
            return linkedHashSetValues(2);
        }

        public com.google.common.collect.MultimapBuilder.SetMultimapBuilder<K0, java.lang.Object> linkedHashSetValues(final int expectedValuesPerKey) {
            com.google.common.collect.CollectPreconditions.checkNonnegative(expectedValuesPerKey, "expectedValuesPerKey");
            return new com.google.common.collect.MultimapBuilder.SetMultimapBuilder<K0, java.lang.Object>() { // from class: com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys.4
                @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
                public <K extends K0, V> com.google.common.collect.SetMultimap<K, V> build() {
                    return com.google.common.collect.Multimaps.newSetMultimap(com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys.this.createMap(), new com.google.common.collect.MultimapBuilder.LinkedHashSetSupplier(expectedValuesPerKey));
                }
            };
        }

        public com.google.common.collect.MultimapBuilder.SortedSetMultimapBuilder<K0, java.lang.Comparable> treeSetValues() {
            return treeSetValues(com.google.common.collect.Ordering.natural());
        }

        public <V0> com.google.common.collect.MultimapBuilder.SortedSetMultimapBuilder<K0, V0> treeSetValues(final java.util.Comparator<V0> comparator) {
            com.google.common.base.Preconditions.checkNotNull(comparator, "comparator");
            return new com.google.common.collect.MultimapBuilder.SortedSetMultimapBuilder<K0, V0>() { // from class: com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys.5
                @Override // com.google.common.collect.MultimapBuilder.SortedSetMultimapBuilder, com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
                public <K extends K0, V extends V0> com.google.common.collect.SortedSetMultimap<K, V> build() {
                    return com.google.common.collect.Multimaps.newSortedSetMultimap(com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys.this.createMap(), new com.google.common.collect.MultimapBuilder.TreeSetSupplier(comparator));
                }
            };
        }

        public <V0 extends java.lang.Enum<V0>> com.google.common.collect.MultimapBuilder.SetMultimapBuilder<K0, V0> enumSetValues(final java.lang.Class<V0> valueClass) {
            com.google.common.base.Preconditions.checkNotNull(valueClass, "valueClass");
            return new com.google.common.collect.MultimapBuilder.SetMultimapBuilder<K0, V0>() { // from class: com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys.6
                @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
                public <K extends K0, V extends V0> com.google.common.collect.SetMultimap<K, V> build() {
                    return com.google.common.collect.Multimaps.newSetMultimap(com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys.this.createMap(), new com.google.common.collect.MultimapBuilder.EnumSetSupplier(valueClass));
                }
            };
        }
    }

    public <K extends K0, V extends V0> com.google.common.collect.Multimap<K, V> build(com.google.common.collect.Multimap<? extends K, ? extends V> multimap) {
        com.google.common.collect.Multimap<K, V> multimapBuild = build();
        multimapBuild.putAll(multimap);
        return multimapBuild;
    }

    public static abstract class ListMultimapBuilder<K0, V0> extends com.google.common.collect.MultimapBuilder<K0, V0> {
        @Override // com.google.common.collect.MultimapBuilder
        public abstract <K extends K0, V extends V0> com.google.common.collect.ListMultimap<K, V> build();

        ListMultimapBuilder() {
            super();
        }

        @Override // com.google.common.collect.MultimapBuilder
        public <K extends K0, V extends V0> com.google.common.collect.ListMultimap<K, V> build(com.google.common.collect.Multimap<? extends K, ? extends V> multimap) {
            return (com.google.common.collect.ListMultimap) super.build((com.google.common.collect.Multimap) multimap);
        }
    }

    public static abstract class SetMultimapBuilder<K0, V0> extends com.google.common.collect.MultimapBuilder<K0, V0> {
        @Override // com.google.common.collect.MultimapBuilder
        public abstract <K extends K0, V extends V0> com.google.common.collect.SetMultimap<K, V> build();

        SetMultimapBuilder() {
            super();
        }

        @Override // com.google.common.collect.MultimapBuilder
        public <K extends K0, V extends V0> com.google.common.collect.SetMultimap<K, V> build(com.google.common.collect.Multimap<? extends K, ? extends V> multimap) {
            return (com.google.common.collect.SetMultimap) super.build((com.google.common.collect.Multimap) multimap);
        }
    }

    public static abstract class SortedSetMultimapBuilder<K0, V0> extends com.google.common.collect.MultimapBuilder.SetMultimapBuilder<K0, V0> {
        @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
        public abstract <K extends K0, V extends V0> com.google.common.collect.SortedSetMultimap<K, V> build();

        SortedSetMultimapBuilder() {
        }

        @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
        public <K extends K0, V extends V0> com.google.common.collect.SortedSetMultimap<K, V> build(com.google.common.collect.Multimap<? extends K, ? extends V> multimap) {
            return (com.google.common.collect.SortedSetMultimap) super.build((com.google.common.collect.Multimap) multimap);
        }
    }
}
