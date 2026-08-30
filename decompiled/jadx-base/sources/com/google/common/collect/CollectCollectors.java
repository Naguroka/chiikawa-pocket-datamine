package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class CollectCollectors {
    private static final java.util.stream.Collector<java.lang.Object, ?, com.google.common.collect.ImmutableList<java.lang.Object>> TO_IMMUTABLE_LIST = java.util.stream.Collector.of(new java.util.function.Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda18
        @Override // java.util.function.Supplier
        public final java.lang.Object get() {
            return com.google.common.collect.ImmutableList.builder();
        }
    }, new java.util.function.BiConsumer() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda21
        @Override // java.util.function.BiConsumer
        public final void accept(java.lang.Object obj, java.lang.Object obj2) {
            ((com.google.common.collect.ImmutableList.Builder) obj).add(obj2);
        }
    }, new java.util.function.BinaryOperator() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda23
        @Override // java.util.function.BiFunction
        public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
            return ((com.google.common.collect.ImmutableList.Builder) obj).combine((com.google.common.collect.ImmutableList.Builder) obj2);
        }
    }, new java.util.function.Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda24
        @Override // java.util.function.Function
        public final java.lang.Object apply(java.lang.Object obj) {
            return ((com.google.common.collect.ImmutableList.Builder) obj).build();
        }
    }, new java.util.stream.Collector.Characteristics[0]);
    private static final java.util.stream.Collector<java.lang.Object, ?, com.google.common.collect.ImmutableSet<java.lang.Object>> TO_IMMUTABLE_SET = java.util.stream.Collector.of(new java.util.function.Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda25
        @Override // java.util.function.Supplier
        public final java.lang.Object get() {
            return com.google.common.collect.ImmutableSet.builder();
        }
    }, new java.util.function.BiConsumer() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda26
        @Override // java.util.function.BiConsumer
        public final void accept(java.lang.Object obj, java.lang.Object obj2) {
            ((com.google.common.collect.ImmutableSet.Builder) obj).add(obj2);
        }
    }, new java.util.function.BinaryOperator() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda27
        @Override // java.util.function.BiFunction
        public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
            return ((com.google.common.collect.ImmutableSet.Builder) obj).combine((com.google.common.collect.ImmutableSet.Builder) obj2);
        }
    }, new java.util.function.Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda28
        @Override // java.util.function.Function
        public final java.lang.Object apply(java.lang.Object obj) {
            return ((com.google.common.collect.ImmutableSet.Builder) obj).build();
        }
    }, new java.util.stream.Collector.Characteristics[0]);
    private static final java.util.stream.Collector<com.google.common.collect.Range<java.lang.Comparable<?>>, ?, com.google.common.collect.ImmutableRangeSet<java.lang.Comparable<?>>> TO_IMMUTABLE_RANGE_SET = java.util.stream.Collector.of(new java.util.function.Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda29
        @Override // java.util.function.Supplier
        public final java.lang.Object get() {
            return com.google.common.collect.ImmutableRangeSet.builder();
        }
    }, new java.util.function.BiConsumer() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda30
        @Override // java.util.function.BiConsumer
        public final void accept(java.lang.Object obj, java.lang.Object obj2) {
            ((com.google.common.collect.ImmutableRangeSet.Builder) obj).add((com.google.common.collect.Range) obj2);
        }
    }, new java.util.function.BinaryOperator() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda19
        @Override // java.util.function.BiFunction
        public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
            return ((com.google.common.collect.ImmutableRangeSet.Builder) obj).combine((com.google.common.collect.ImmutableRangeSet.Builder) obj2);
        }
    }, new java.util.function.Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda20
        @Override // java.util.function.Function
        public final java.lang.Object apply(java.lang.Object obj) {
            return ((com.google.common.collect.ImmutableRangeSet.Builder) obj).build();
        }
    }, new java.util.stream.Collector.Characteristics[0]);

    public static /* synthetic */ java.util.LinkedHashMap $r8$lambda$Rr5wHpoNM5boD4b5K8greFBFLF8() {
        return new java.util.LinkedHashMap();
    }

    static <E> java.util.stream.Collector<E, ?, com.google.common.collect.ImmutableList<E>> toImmutableList() {
        return (java.util.stream.Collector<E, ?, com.google.common.collect.ImmutableList<E>>) TO_IMMUTABLE_LIST;
    }

    static <E> java.util.stream.Collector<E, ?, com.google.common.collect.ImmutableSet<E>> toImmutableSet() {
        return (java.util.stream.Collector<E, ?, com.google.common.collect.ImmutableSet<E>>) TO_IMMUTABLE_SET;
    }

    static <E> java.util.stream.Collector<E, ?, com.google.common.collect.ImmutableSortedSet<E>> toImmutableSortedSet(final java.util.Comparator<? super E> comparator) {
        com.google.common.base.Preconditions.checkNotNull(comparator);
        return java.util.stream.Collector.of(new java.util.function.Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda65
            @Override // java.util.function.Supplier
            public final java.lang.Object get() {
                return com.google.common.collect.CollectCollectors.lambda$toImmutableSortedSet$0(comparator);
            }
        }, new java.util.function.BiConsumer() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda67
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.common.collect.ImmutableSortedSet.Builder) obj).add(obj2);
            }
        }, new java.util.function.BinaryOperator() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda68
            @Override // java.util.function.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return ((com.google.common.collect.ImmutableSortedSet.Builder) obj).combine((com.google.common.collect.ImmutableSet.Builder) obj2);
            }
        }, new java.util.function.Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda69
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return ((com.google.common.collect.ImmutableSortedSet.Builder) obj).build();
            }
        }, new java.util.stream.Collector.Characteristics[0]);
    }

    static /* synthetic */ com.google.common.collect.ImmutableSortedSet.Builder lambda$toImmutableSortedSet$0(java.util.Comparator comparator) {
        return new com.google.common.collect.ImmutableSortedSet.Builder(comparator);
    }

    static <E extends java.lang.Enum<E>> java.util.stream.Collector<E, ?, com.google.common.collect.ImmutableSet<E>> toImmutableEnumSet() {
        return (java.util.stream.Collector<E, ?, com.google.common.collect.ImmutableSet<E>>) com.google.common.collect.CollectCollectors.EnumSetAccumulator.TO_IMMUTABLE_ENUM_SET;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E extends java.lang.Enum<E>> java.util.stream.Collector<E, com.google.common.collect.CollectCollectors.EnumSetAccumulator<E>, com.google.common.collect.ImmutableSet<E>> toImmutableEnumSetGeneric() {
        return java.util.stream.Collector.of(new java.util.function.Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda46
            @Override // java.util.function.Supplier
            public final java.lang.Object get() {
                return com.google.common.collect.CollectCollectors.lambda$toImmutableEnumSetGeneric$1();
            }
        }, new java.util.function.BiConsumer() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda47
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.common.collect.CollectCollectors.EnumSetAccumulator) obj).add((java.lang.Enum) obj2);
            }
        }, new java.util.function.BinaryOperator() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda48
            @Override // java.util.function.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return ((com.google.common.collect.CollectCollectors.EnumSetAccumulator) obj).combine((com.google.common.collect.CollectCollectors.EnumSetAccumulator) obj2);
            }
        }, new java.util.function.Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda49
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return ((com.google.common.collect.CollectCollectors.EnumSetAccumulator) obj).toImmutableSet();
            }
        }, java.util.stream.Collector.Characteristics.UNORDERED);
    }

    static /* synthetic */ com.google.common.collect.CollectCollectors.EnumSetAccumulator lambda$toImmutableEnumSetGeneric$1() {
        return new com.google.common.collect.CollectCollectors.EnumSetAccumulator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class EnumSetAccumulator<E extends java.lang.Enum<E>> {
        static final java.util.stream.Collector<java.lang.Enum<?>, ?, com.google.common.collect.ImmutableSet<? extends java.lang.Enum<?>>> TO_IMMUTABLE_ENUM_SET = com.google.common.collect.CollectCollectors.toImmutableEnumSetGeneric();

        @javax.annotation.CheckForNull
        private java.util.EnumSet<E> set;

        private EnumSetAccumulator() {
        }

        void add(E e) {
            java.util.EnumSet<E> enumSet = this.set;
            if (enumSet == null) {
                this.set = java.util.EnumSet.of((java.lang.Enum) e);
            } else {
                enumSet.add(e);
            }
        }

        com.google.common.collect.CollectCollectors.EnumSetAccumulator<E> combine(com.google.common.collect.CollectCollectors.EnumSetAccumulator<E> other) {
            java.util.EnumSet<E> enumSet = this.set;
            if (enumSet == null) {
                return other;
            }
            java.util.EnumSet<E> enumSet2 = other.set;
            if (enumSet2 == null) {
                return this;
            }
            enumSet.addAll(enumSet2);
            return this;
        }

        com.google.common.collect.ImmutableSet<E> toImmutableSet() {
            java.util.EnumSet<E> enumSet = this.set;
            if (enumSet == null) {
                return com.google.common.collect.ImmutableSet.of();
            }
            com.google.common.collect.ImmutableSet<E> immutableSetAsImmutable = com.google.common.collect.ImmutableEnumSet.asImmutable(enumSet);
            this.set = null;
            return immutableSetAsImmutable;
        }
    }

    static <E extends java.lang.Comparable<? super E>> java.util.stream.Collector<com.google.common.collect.Range<E>, ?, com.google.common.collect.ImmutableRangeSet<E>> toImmutableRangeSet() {
        return (java.util.stream.Collector<com.google.common.collect.Range<E>, ?, com.google.common.collect.ImmutableRangeSet<E>>) TO_IMMUTABLE_RANGE_SET;
    }

    static <T, E> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableMultiset<E>> toImmutableMultiset(final java.util.function.Function<? super T, ? extends E> elementFunction, final java.util.function.ToIntFunction<? super T> countFunction) {
        com.google.common.base.Preconditions.checkNotNull(elementFunction);
        com.google.common.base.Preconditions.checkNotNull(countFunction);
        return java.util.stream.Collector.of(new java.util.function.Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda4
            @Override // java.util.function.Supplier
            public final java.lang.Object get() {
                return com.google.common.collect.LinkedHashMultiset.create();
            }
        }, new java.util.function.BiConsumer() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda5
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.common.collect.Multiset) obj).add(com.google.common.base.Preconditions.checkNotNull(elementFunction.apply(obj2)), countFunction.applyAsInt(obj2));
            }
        }, new java.util.function.BinaryOperator() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda6
            @Override // java.util.function.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return com.google.common.collect.CollectCollectors.lambda$toImmutableMultiset$3((com.google.common.collect.Multiset) obj, (com.google.common.collect.Multiset) obj2);
            }
        }, new java.util.function.Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda7
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.common.collect.ImmutableMultiset.copyFromEntries(((com.google.common.collect.Multiset) obj).entrySet());
            }
        }, new java.util.stream.Collector.Characteristics[0]);
    }

    static /* synthetic */ com.google.common.collect.Multiset lambda$toImmutableMultiset$3(com.google.common.collect.Multiset multiset, com.google.common.collect.Multiset multiset2) {
        multiset.addAll(multiset2);
        return multiset;
    }

    static <T, E, M extends com.google.common.collect.Multiset<E>> java.util.stream.Collector<T, ?, M> toMultiset(final java.util.function.Function<? super T, E> elementFunction, final java.util.function.ToIntFunction<? super T> countFunction, java.util.function.Supplier<M> multisetSupplier) {
        com.google.common.base.Preconditions.checkNotNull(elementFunction);
        com.google.common.base.Preconditions.checkNotNull(countFunction);
        com.google.common.base.Preconditions.checkNotNull(multisetSupplier);
        return java.util.stream.Collector.of(multisetSupplier, new java.util.function.BiConsumer() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda0
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.common.collect.Multiset) obj).add(elementFunction.apply(obj2), countFunction.applyAsInt(obj2));
            }
        }, new java.util.function.BinaryOperator() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda11
            @Override // java.util.function.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return com.google.common.collect.CollectCollectors.lambda$toMultiset$6((com.google.common.collect.Multiset) obj, (com.google.common.collect.Multiset) obj2);
            }
        }, new java.util.stream.Collector.Characteristics[0]);
    }

    static /* synthetic */ com.google.common.collect.Multiset lambda$toMultiset$6(com.google.common.collect.Multiset multiset, com.google.common.collect.Multiset multiset2) {
        multiset.addAll(multiset2);
        return multiset;
    }

    static <T, K, V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableMap<K, V>> toImmutableMap(final java.util.function.Function<? super T, ? extends K> keyFunction, final java.util.function.Function<? super T, ? extends V> valueFunction) {
        com.google.common.base.Preconditions.checkNotNull(keyFunction);
        com.google.common.base.Preconditions.checkNotNull(valueFunction);
        return java.util.stream.Collector.of(new java.util.function.Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda50
            @Override // java.util.function.Supplier
            public final java.lang.Object get() {
                return new com.google.common.collect.ImmutableMap.Builder();
            }
        }, new java.util.function.BiConsumer() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda51
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.common.collect.ImmutableMap.Builder) obj).put(keyFunction.apply(obj2), valueFunction.apply(obj2));
            }
        }, new java.util.function.BinaryOperator() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda52
            @Override // java.util.function.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return ((com.google.common.collect.ImmutableMap.Builder) obj).combine((com.google.common.collect.ImmutableMap.Builder) obj2);
            }
        }, new java.util.function.Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda53
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return ((com.google.common.collect.ImmutableMap.Builder) obj).buildOrThrow();
            }
        }, new java.util.stream.Collector.Characteristics[0]);
    }

    static <T, K, V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableMap<K, V>> toImmutableMap(java.util.function.Function<? super T, ? extends K> keyFunction, java.util.function.Function<? super T, ? extends V> valueFunction, java.util.function.BinaryOperator<V> mergeFunction) {
        com.google.common.base.Preconditions.checkNotNull(keyFunction);
        com.google.common.base.Preconditions.checkNotNull(valueFunction);
        com.google.common.base.Preconditions.checkNotNull(mergeFunction);
        return java.util.stream.Collectors.collectingAndThen(java.util.stream.Collectors.toMap(keyFunction, valueFunction, mergeFunction, new java.util.function.Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda2
            @Override // java.util.function.Supplier
            public final java.lang.Object get() {
                return com.google.common.collect.CollectCollectors.$r8$lambda$Rr5wHpoNM5boD4b5K8greFBFLF8();
            }
        }), new java.util.function.Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda3
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.common.collect.ImmutableMap.copyOf((java.util.Map) obj);
            }
        });
    }

    static <T, K, V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableSortedMap<K, V>> toImmutableSortedMap(final java.util.Comparator<? super K> comparator, final java.util.function.Function<? super T, ? extends K> keyFunction, final java.util.function.Function<? super T, ? extends V> valueFunction) {
        com.google.common.base.Preconditions.checkNotNull(comparator);
        com.google.common.base.Preconditions.checkNotNull(keyFunction);
        com.google.common.base.Preconditions.checkNotNull(valueFunction);
        return java.util.stream.Collector.of(new java.util.function.Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda57
            @Override // java.util.function.Supplier
            public final java.lang.Object get() {
                return com.google.common.collect.CollectCollectors.lambda$toImmutableSortedMap$8(comparator);
            }
        }, new java.util.function.BiConsumer() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda58
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.common.collect.ImmutableSortedMap.Builder) obj).put(keyFunction.apply(obj2), valueFunction.apply(obj2));
            }
        }, new java.util.function.BinaryOperator() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda59
            @Override // java.util.function.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return ((com.google.common.collect.ImmutableSortedMap.Builder) obj).combine((com.google.common.collect.ImmutableSortedMap.Builder) obj2);
            }
        }, new java.util.function.Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda60
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return ((com.google.common.collect.ImmutableSortedMap.Builder) obj).buildOrThrow();
            }
        }, java.util.stream.Collector.Characteristics.UNORDERED);
    }

    static /* synthetic */ com.google.common.collect.ImmutableSortedMap.Builder lambda$toImmutableSortedMap$8(java.util.Comparator comparator) {
        return new com.google.common.collect.ImmutableSortedMap.Builder(comparator);
    }

    static <T, K, V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableSortedMap<K, V>> toImmutableSortedMap(final java.util.Comparator<? super K> comparator, java.util.function.Function<? super T, ? extends K> keyFunction, java.util.function.Function<? super T, ? extends V> valueFunction, java.util.function.BinaryOperator<V> mergeFunction) {
        com.google.common.base.Preconditions.checkNotNull(comparator);
        com.google.common.base.Preconditions.checkNotNull(keyFunction);
        com.google.common.base.Preconditions.checkNotNull(valueFunction);
        com.google.common.base.Preconditions.checkNotNull(mergeFunction);
        return java.util.stream.Collectors.collectingAndThen(java.util.stream.Collectors.toMap(keyFunction, valueFunction, mergeFunction, new java.util.function.Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda22
            @Override // java.util.function.Supplier
            public final java.lang.Object get() {
                return com.google.common.collect.CollectCollectors.lambda$toImmutableSortedMap$10(comparator);
            }
        }), new java.util.function.Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda33
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.common.collect.ImmutableSortedMap.copyOfSorted((java.util.TreeMap) obj);
            }
        });
    }

    static /* synthetic */ java.util.TreeMap lambda$toImmutableSortedMap$10(java.util.Comparator comparator) {
        return new java.util.TreeMap(comparator);
    }

    static <T, K, V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableBiMap<K, V>> toImmutableBiMap(final java.util.function.Function<? super T, ? extends K> keyFunction, final java.util.function.Function<? super T, ? extends V> valueFunction) {
        com.google.common.base.Preconditions.checkNotNull(keyFunction);
        com.google.common.base.Preconditions.checkNotNull(valueFunction);
        return java.util.stream.Collector.of(new java.util.function.Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda14
            @Override // java.util.function.Supplier
            public final java.lang.Object get() {
                return new com.google.common.collect.ImmutableBiMap.Builder();
            }
        }, new java.util.function.BiConsumer() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda15
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.common.collect.ImmutableBiMap.Builder) obj).put(keyFunction.apply(obj2), valueFunction.apply(obj2));
            }
        }, new java.util.function.BinaryOperator() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda16
            @Override // java.util.function.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return ((com.google.common.collect.ImmutableBiMap.Builder) obj).combine((com.google.common.collect.ImmutableMap.Builder) obj2);
            }
        }, new java.util.function.Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda17
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return ((com.google.common.collect.ImmutableBiMap.Builder) obj).buildOrThrow();
            }
        }, new java.util.stream.Collector.Characteristics[0]);
    }

    static <T, K extends java.lang.Enum<K>, V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableMap<K, V>> toImmutableEnumMap(final java.util.function.Function<? super T, ? extends K> keyFunction, final java.util.function.Function<? super T, ? extends V> valueFunction) {
        com.google.common.base.Preconditions.checkNotNull(keyFunction);
        com.google.common.base.Preconditions.checkNotNull(valueFunction);
        return java.util.stream.Collector.of(new java.util.function.Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda8
            @Override // java.util.function.Supplier
            public final java.lang.Object get() {
                return com.google.common.collect.CollectCollectors.lambda$toImmutableEnumMap$13();
            }
        }, new java.util.function.BiConsumer() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda9
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.common.collect.CollectCollectors.EnumMapAccumulator) obj).put((java.lang.Enum) com.google.common.base.Preconditions.checkNotNull((java.lang.Enum) keyFunction.apply(obj2), "Null key for input %s", obj2), com.google.common.base.Preconditions.checkNotNull(valueFunction.apply(obj2), "Null value for input %s", obj2));
            }
        }, new com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda10(), new com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda12(), java.util.stream.Collector.Characteristics.UNORDERED);
    }

    static /* synthetic */ com.google.common.collect.CollectCollectors.EnumMapAccumulator lambda$toImmutableEnumMap$13() {
        return new com.google.common.collect.CollectCollectors.EnumMapAccumulator(new java.util.function.BinaryOperator() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda1
            @Override // java.util.function.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return com.google.common.collect.CollectCollectors.lambda$toImmutableEnumMap$12(obj, obj2);
            }
        });
    }

    static /* synthetic */ java.lang.Object lambda$toImmutableEnumMap$12(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.IllegalArgumentException("Multiple values for key: " + obj + ", " + obj2);
    }

    static <T, K extends java.lang.Enum<K>, V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableMap<K, V>> toImmutableEnumMap(final java.util.function.Function<? super T, ? extends K> keyFunction, final java.util.function.Function<? super T, ? extends V> valueFunction, final java.util.function.BinaryOperator<V> mergeFunction) {
        com.google.common.base.Preconditions.checkNotNull(keyFunction);
        com.google.common.base.Preconditions.checkNotNull(valueFunction);
        com.google.common.base.Preconditions.checkNotNull(mergeFunction);
        return java.util.stream.Collector.of(new java.util.function.Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda54
            @Override // java.util.function.Supplier
            public final java.lang.Object get() {
                return com.google.common.collect.CollectCollectors.lambda$toImmutableEnumMap$15(mergeFunction);
            }
        }, new java.util.function.BiConsumer() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda56
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.common.collect.CollectCollectors.EnumMapAccumulator) obj).put((java.lang.Enum) com.google.common.base.Preconditions.checkNotNull((java.lang.Enum) keyFunction.apply(obj2), "Null key for input %s", obj2), com.google.common.base.Preconditions.checkNotNull(valueFunction.apply(obj2), "Null value for input %s", obj2));
            }
        }, new com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda10(), new com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda12(), new java.util.stream.Collector.Characteristics[0]);
    }

    static /* synthetic */ com.google.common.collect.CollectCollectors.EnumMapAccumulator lambda$toImmutableEnumMap$15(java.util.function.BinaryOperator binaryOperator) {
        return new com.google.common.collect.CollectCollectors.EnumMapAccumulator(binaryOperator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class EnumMapAccumulator<K extends java.lang.Enum<K>, V> {

        @javax.annotation.CheckForNull
        private java.util.EnumMap<K, V> map = null;
        private final java.util.function.BinaryOperator<V> mergeFunction;

        EnumMapAccumulator(java.util.function.BinaryOperator<V> mergeFunction) {
            this.mergeFunction = mergeFunction;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void put(K key, V value) {
            java.util.EnumMap<K, V> enumMap = this.map;
            if (enumMap == null) {
                this.map = new java.util.EnumMap<>(java.util.Collections.singletonMap(key, value));
            } else {
                enumMap.merge(key, value, this.mergeFunction);
            }
        }

        com.google.common.collect.CollectCollectors.EnumMapAccumulator<K, V> combine(com.google.common.collect.CollectCollectors.EnumMapAccumulator<K, V> other) {
            if (this.map == null) {
                return other;
            }
            java.util.EnumMap<K, V> enumMap = other.map;
            if (enumMap == null) {
                return this;
            }
            enumMap.forEach(new java.util.function.BiConsumer() { // from class: com.google.common.collect.CollectCollectors$EnumMapAccumulator$$ExternalSyntheticLambda0
                @Override // java.util.function.BiConsumer
                public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                    this.f$0.put((java.lang.Enum) obj, obj2);
                }
            });
            return this;
        }

        com.google.common.collect.ImmutableMap<K, V> toImmutableMap() {
            java.util.EnumMap<K, V> enumMap = this.map;
            return enumMap == null ? com.google.common.collect.ImmutableMap.of() : com.google.common.collect.ImmutableEnumMap.asImmutable(enumMap);
        }
    }

    static <T, K extends java.lang.Comparable<? super K>, V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableRangeMap<K, V>> toImmutableRangeMap(final java.util.function.Function<? super T, com.google.common.collect.Range<K>> keyFunction, final java.util.function.Function<? super T, ? extends V> valueFunction) {
        com.google.common.base.Preconditions.checkNotNull(keyFunction);
        com.google.common.base.Preconditions.checkNotNull(valueFunction);
        return java.util.stream.Collector.of(new java.util.function.Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda41
            @Override // java.util.function.Supplier
            public final java.lang.Object get() {
                return com.google.common.collect.ImmutableRangeMap.builder();
            }
        }, new java.util.function.BiConsumer() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda42
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.common.collect.ImmutableRangeMap.Builder) obj).put((com.google.common.collect.Range) keyFunction.apply(obj2), valueFunction.apply(obj2));
            }
        }, new java.util.function.BinaryOperator() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda43
            @Override // java.util.function.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return ((com.google.common.collect.ImmutableRangeMap.Builder) obj).combine((com.google.common.collect.ImmutableRangeMap.Builder) obj2);
            }
        }, new java.util.function.Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda45
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return ((com.google.common.collect.ImmutableRangeMap.Builder) obj).build();
            }
        }, new java.util.stream.Collector.Characteristics[0]);
    }

    static <T, K, V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableListMultimap<K, V>> toImmutableListMultimap(final java.util.function.Function<? super T, ? extends K> keyFunction, final java.util.function.Function<? super T, ? extends V> valueFunction) {
        com.google.common.base.Preconditions.checkNotNull(keyFunction, "keyFunction");
        com.google.common.base.Preconditions.checkNotNull(valueFunction, "valueFunction");
        return java.util.stream.Collector.of(new java.util.function.Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda61
            @Override // java.util.function.Supplier
            public final java.lang.Object get() {
                return com.google.common.collect.ImmutableListMultimap.builder();
            }
        }, new java.util.function.BiConsumer() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda62
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.common.collect.ImmutableListMultimap.Builder) obj).put(keyFunction.apply(obj2), valueFunction.apply(obj2));
            }
        }, new java.util.function.BinaryOperator() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda63
            @Override // java.util.function.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return ((com.google.common.collect.ImmutableListMultimap.Builder) obj).combine((com.google.common.collect.ImmutableMultimap.Builder) obj2);
            }
        }, new java.util.function.Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda64
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return ((com.google.common.collect.ImmutableListMultimap.Builder) obj).build();
            }
        }, new java.util.stream.Collector.Characteristics[0]);
    }

    static <T, K, V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableListMultimap<K, V>> flatteningToImmutableListMultimap(final java.util.function.Function<? super T, ? extends K> keyFunction, final java.util.function.Function<? super T, ? extends java.util.stream.Stream<? extends V>> valuesFunction) {
        com.google.common.base.Preconditions.checkNotNull(keyFunction);
        com.google.common.base.Preconditions.checkNotNull(valuesFunction);
        java.util.function.Function function = new java.util.function.Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda44
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.common.base.Preconditions.checkNotNull(keyFunction.apply(obj));
            }
        };
        java.util.function.Function function2 = new java.util.function.Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda55
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return ((java.util.stream.Stream) valuesFunction.apply(obj)).peek(new com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda13());
            }
        };
        final com.google.common.collect.MultimapBuilder.ListMultimapBuilder<java.lang.Object, java.lang.Object> listMultimapBuilderArrayListValues = com.google.common.collect.MultimapBuilder.linkedHashKeys().arrayListValues();
        java.util.Objects.requireNonNull(listMultimapBuilderArrayListValues);
        return java.util.stream.Collectors.collectingAndThen(flatteningToMultimap(function, function2, new java.util.function.Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda66
            @Override // java.util.function.Supplier
            public final java.lang.Object get() {
                return listMultimapBuilderArrayListValues.build();
            }
        }), new java.util.function.Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda72
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.common.collect.ImmutableListMultimap.copyOf((com.google.common.collect.Multimap) obj);
            }
        });
    }

    static <T, K, V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableSetMultimap<K, V>> toImmutableSetMultimap(final java.util.function.Function<? super T, ? extends K> keyFunction, final java.util.function.Function<? super T, ? extends V> valueFunction) {
        com.google.common.base.Preconditions.checkNotNull(keyFunction, "keyFunction");
        com.google.common.base.Preconditions.checkNotNull(valueFunction, "valueFunction");
        return java.util.stream.Collector.of(new java.util.function.Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda36
            @Override // java.util.function.Supplier
            public final java.lang.Object get() {
                return com.google.common.collect.ImmutableSetMultimap.builder();
            }
        }, new java.util.function.BiConsumer() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda37
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.common.collect.ImmutableSetMultimap.Builder) obj).put(keyFunction.apply(obj2), valueFunction.apply(obj2));
            }
        }, new java.util.function.BinaryOperator() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda38
            @Override // java.util.function.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return ((com.google.common.collect.ImmutableSetMultimap.Builder) obj).combine((com.google.common.collect.ImmutableMultimap.Builder) obj2);
            }
        }, new java.util.function.Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda39
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return ((com.google.common.collect.ImmutableSetMultimap.Builder) obj).build();
            }
        }, new java.util.stream.Collector.Characteristics[0]);
    }

    static <T, K, V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableSetMultimap<K, V>> flatteningToImmutableSetMultimap(final java.util.function.Function<? super T, ? extends K> keyFunction, final java.util.function.Function<? super T, ? extends java.util.stream.Stream<? extends V>> valuesFunction) {
        com.google.common.base.Preconditions.checkNotNull(keyFunction);
        com.google.common.base.Preconditions.checkNotNull(valuesFunction);
        java.util.function.Function function = new java.util.function.Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda31
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.common.base.Preconditions.checkNotNull(keyFunction.apply(obj));
            }
        };
        java.util.function.Function function2 = new java.util.function.Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda32
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return ((java.util.stream.Stream) valuesFunction.apply(obj)).peek(new com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda13());
            }
        };
        final com.google.common.collect.MultimapBuilder.SetMultimapBuilder<java.lang.Object, java.lang.Object> setMultimapBuilderLinkedHashSetValues = com.google.common.collect.MultimapBuilder.linkedHashKeys().linkedHashSetValues();
        java.util.Objects.requireNonNull(setMultimapBuilderLinkedHashSetValues);
        return java.util.stream.Collectors.collectingAndThen(flatteningToMultimap(function, function2, new java.util.function.Supplier() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda34
            @Override // java.util.function.Supplier
            public final java.lang.Object get() {
                return setMultimapBuilderLinkedHashSetValues.build();
            }
        }), new java.util.function.Function() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda35
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.common.collect.ImmutableSetMultimap.copyOf((com.google.common.collect.Multimap) obj);
            }
        });
    }

    static <T, K, V, M extends com.google.common.collect.Multimap<K, V>> java.util.stream.Collector<T, ?, M> toMultimap(final java.util.function.Function<? super T, ? extends K> keyFunction, final java.util.function.Function<? super T, ? extends V> valueFunction, java.util.function.Supplier<M> multimapSupplier) {
        com.google.common.base.Preconditions.checkNotNull(keyFunction);
        com.google.common.base.Preconditions.checkNotNull(valueFunction);
        com.google.common.base.Preconditions.checkNotNull(multimapSupplier);
        return java.util.stream.Collector.of(multimapSupplier, new java.util.function.BiConsumer() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda70
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.common.collect.Multimap) obj).put(keyFunction.apply(obj2), valueFunction.apply(obj2));
            }
        }, new java.util.function.BinaryOperator() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda71
            @Override // java.util.function.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return com.google.common.collect.CollectCollectors.lambda$toMultimap$25((com.google.common.collect.Multimap) obj, (com.google.common.collect.Multimap) obj2);
            }
        }, new java.util.stream.Collector.Characteristics[0]);
    }

    static /* synthetic */ com.google.common.collect.Multimap lambda$toMultimap$25(com.google.common.collect.Multimap multimap, com.google.common.collect.Multimap multimap2) {
        multimap.putAll(multimap2);
        return multimap;
    }

    static <T, K, V, M extends com.google.common.collect.Multimap<K, V>> java.util.stream.Collector<T, ?, M> flatteningToMultimap(final java.util.function.Function<? super T, ? extends K> keyFunction, final java.util.function.Function<? super T, ? extends java.util.stream.Stream<? extends V>> valueFunction, java.util.function.Supplier<M> multimapSupplier) {
        com.google.common.base.Preconditions.checkNotNull(keyFunction);
        com.google.common.base.Preconditions.checkNotNull(valueFunction);
        com.google.common.base.Preconditions.checkNotNull(multimapSupplier);
        return java.util.stream.Collector.of(multimapSupplier, new java.util.function.BiConsumer() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda73
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.common.collect.CollectCollectors.lambda$flatteningToMultimap$26(keyFunction, valueFunction, (com.google.common.collect.Multimap) obj, obj2);
            }
        }, new java.util.function.BinaryOperator() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda74
            @Override // java.util.function.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return com.google.common.collect.CollectCollectors.lambda$flatteningToMultimap$27((com.google.common.collect.Multimap) obj, (com.google.common.collect.Multimap) obj2);
            }
        }, new java.util.stream.Collector.Characteristics[0]);
    }

    static /* synthetic */ void lambda$flatteningToMultimap$26(java.util.function.Function function, java.util.function.Function function2, com.google.common.collect.Multimap multimap, java.lang.Object obj) {
        final java.util.Collection collection = multimap.get(function.apply(obj));
        java.util.stream.Stream stream = (java.util.stream.Stream) function2.apply(obj);
        java.util.Objects.requireNonNull(collection);
        stream.forEachOrdered(new java.util.function.Consumer() { // from class: com.google.common.collect.CollectCollectors$$ExternalSyntheticLambda40
            @Override // java.util.function.Consumer
            public final void accept(java.lang.Object obj2) {
                collection.add(obj2);
            }
        });
    }

    static /* synthetic */ com.google.common.collect.Multimap lambda$flatteningToMultimap$27(com.google.common.collect.Multimap multimap, com.google.common.collect.Multimap multimap2) {
        multimap.putAll(multimap2);
        return multimap;
    }

    private CollectCollectors() {
    }
}
