package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class TableCollectors {
    static <T, R, C, V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableTable<R, C, V>> toImmutableTable(final java.util.function.Function<? super T, ? extends R> rowFunction, final java.util.function.Function<? super T, ? extends C> columnFunction, final java.util.function.Function<? super T, ? extends V> valueFunction) {
        com.google.common.base.Preconditions.checkNotNull(rowFunction, "rowFunction");
        com.google.common.base.Preconditions.checkNotNull(columnFunction, "columnFunction");
        com.google.common.base.Preconditions.checkNotNull(valueFunction, "valueFunction");
        return java.util.stream.Collector.of(new java.util.function.Supplier() { // from class: com.google.common.collect.TableCollectors$$ExternalSyntheticLambda3
            @Override // java.util.function.Supplier
            public final java.lang.Object get() {
                return new com.google.common.collect.ImmutableTable.Builder();
            }
        }, new java.util.function.BiConsumer() { // from class: com.google.common.collect.TableCollectors$$ExternalSyntheticLambda4
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.common.collect.ImmutableTable.Builder) obj).put(rowFunction.apply(obj2), columnFunction.apply(obj2), valueFunction.apply(obj2));
            }
        }, new java.util.function.BinaryOperator() { // from class: com.google.common.collect.TableCollectors$$ExternalSyntheticLambda5
            @Override // java.util.function.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return ((com.google.common.collect.ImmutableTable.Builder) obj).combine((com.google.common.collect.ImmutableTable.Builder) obj2);
            }
        }, new java.util.function.Function() { // from class: com.google.common.collect.TableCollectors$$ExternalSyntheticLambda6
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return ((com.google.common.collect.ImmutableTable.Builder) obj).build();
            }
        }, new java.util.stream.Collector.Characteristics[0]);
    }

    static <T, R, C, V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableTable<R, C, V>> toImmutableTable(final java.util.function.Function<? super T, ? extends R> rowFunction, final java.util.function.Function<? super T, ? extends C> columnFunction, final java.util.function.Function<? super T, ? extends V> valueFunction, final java.util.function.BinaryOperator<V> mergeFunction) {
        com.google.common.base.Preconditions.checkNotNull(rowFunction, "rowFunction");
        com.google.common.base.Preconditions.checkNotNull(columnFunction, "columnFunction");
        com.google.common.base.Preconditions.checkNotNull(valueFunction, "valueFunction");
        com.google.common.base.Preconditions.checkNotNull(mergeFunction, "mergeFunction");
        return java.util.stream.Collector.of(new java.util.function.Supplier() { // from class: com.google.common.collect.TableCollectors$$ExternalSyntheticLambda8
            @Override // java.util.function.Supplier
            public final java.lang.Object get() {
                return com.google.common.collect.TableCollectors.lambda$toImmutableTable$1();
            }
        }, new java.util.function.BiConsumer() { // from class: com.google.common.collect.TableCollectors$$ExternalSyntheticLambda9
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.common.collect.TableCollectors.ImmutableTableCollectorState immutableTableCollectorState = (com.google.common.collect.TableCollectors.ImmutableTableCollectorState) obj;
                immutableTableCollectorState.put(rowFunction.apply(obj2), columnFunction.apply(obj2), valueFunction.apply(obj2), mergeFunction);
            }
        }, new java.util.function.BinaryOperator() { // from class: com.google.common.collect.TableCollectors$$ExternalSyntheticLambda10
            @Override // java.util.function.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return ((com.google.common.collect.TableCollectors.ImmutableTableCollectorState) obj).combine((com.google.common.collect.TableCollectors.ImmutableTableCollectorState) obj2, mergeFunction);
            }
        }, new java.util.function.Function() { // from class: com.google.common.collect.TableCollectors$$ExternalSyntheticLambda1
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return ((com.google.common.collect.TableCollectors.ImmutableTableCollectorState) obj).toTable();
            }
        }, new java.util.stream.Collector.Characteristics[0]);
    }

    static /* synthetic */ com.google.common.collect.TableCollectors.ImmutableTableCollectorState lambda$toImmutableTable$1() {
        return new com.google.common.collect.TableCollectors.ImmutableTableCollectorState();
    }

    static <T, R, C, V, I extends com.google.common.collect.Table<R, C, V>> java.util.stream.Collector<T, ?, I> toTable(java.util.function.Function<? super T, ? extends R> rowFunction, java.util.function.Function<? super T, ? extends C> columnFunction, java.util.function.Function<? super T, ? extends V> valueFunction, java.util.function.Supplier<I> tableSupplier) {
        return toTable(rowFunction, columnFunction, valueFunction, new java.util.function.BinaryOperator() { // from class: com.google.common.collect.TableCollectors$$ExternalSyntheticLambda7
            @Override // java.util.function.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return com.google.common.collect.TableCollectors.lambda$toTable$5(obj, obj2);
            }
        }, tableSupplier);
    }

    static /* synthetic */ java.lang.Object lambda$toTable$5(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.IllegalStateException("Conflicting values " + obj + " and " + obj2);
    }

    static <T, R, C, V, I extends com.google.common.collect.Table<R, C, V>> java.util.stream.Collector<T, ?, I> toTable(final java.util.function.Function<? super T, ? extends R> rowFunction, final java.util.function.Function<? super T, ? extends C> columnFunction, final java.util.function.Function<? super T, ? extends V> valueFunction, final java.util.function.BinaryOperator<V> mergeFunction, java.util.function.Supplier<I> tableSupplier) {
        com.google.common.base.Preconditions.checkNotNull(rowFunction);
        com.google.common.base.Preconditions.checkNotNull(columnFunction);
        com.google.common.base.Preconditions.checkNotNull(valueFunction);
        com.google.common.base.Preconditions.checkNotNull(mergeFunction);
        com.google.common.base.Preconditions.checkNotNull(tableSupplier);
        return java.util.stream.Collector.of(tableSupplier, new java.util.function.BiConsumer() { // from class: com.google.common.collect.TableCollectors$$ExternalSyntheticLambda0
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.common.collect.Table table = (com.google.common.collect.Table) obj;
                com.google.common.collect.TableCollectors.mergeTables(table, rowFunction.apply(obj2), columnFunction.apply(obj2), valueFunction.apply(obj2), mergeFunction);
            }
        }, new java.util.function.BinaryOperator() { // from class: com.google.common.collect.TableCollectors$$ExternalSyntheticLambda2
            @Override // java.util.function.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return com.google.common.collect.TableCollectors.lambda$toTable$7(mergeFunction, (com.google.common.collect.Table) obj, (com.google.common.collect.Table) obj2);
            }
        }, new java.util.stream.Collector.Characteristics[0]);
    }

    static /* synthetic */ com.google.common.collect.Table lambda$toTable$7(java.util.function.BinaryOperator binaryOperator, com.google.common.collect.Table table, com.google.common.collect.Table table2) {
        for (com.google.common.collect.Table.Cell cell : table2.cellSet()) {
            mergeTables(table, cell.getRowKey(), cell.getColumnKey(), cell.getValue(), binaryOperator);
        }
        return table;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class ImmutableTableCollectorState<R, C, V> {
        final java.util.List<com.google.common.collect.TableCollectors.MutableCell<R, C, V>> insertionOrder;
        final com.google.common.collect.Table<R, C, com.google.common.collect.TableCollectors.MutableCell<R, C, V>> table;

        private ImmutableTableCollectorState() {
            this.insertionOrder = new java.util.ArrayList();
            this.table = com.google.common.collect.HashBasedTable.create();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void put(R row, C column, V value, java.util.function.BinaryOperator<V> merger) {
            com.google.common.collect.TableCollectors.MutableCell<R, C, V> mutableCell = this.table.get(row, column);
            if (mutableCell == null) {
                com.google.common.collect.TableCollectors.MutableCell<R, C, V> mutableCell2 = new com.google.common.collect.TableCollectors.MutableCell<>(row, column, value);
                this.insertionOrder.add(mutableCell2);
                this.table.put(row, column, mutableCell2);
                return;
            }
            mutableCell.merge(value, merger);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public com.google.common.collect.TableCollectors.ImmutableTableCollectorState<R, C, V> combine(com.google.common.collect.TableCollectors.ImmutableTableCollectorState<R, C, V> other, java.util.function.BinaryOperator<V> merger) {
            for (com.google.common.collect.TableCollectors.MutableCell<R, C, V> mutableCell : other.insertionOrder) {
                put(mutableCell.getRowKey(), mutableCell.getColumnKey(), mutableCell.getValue(), merger);
            }
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public com.google.common.collect.ImmutableTable<R, C, V> toTable() {
            return com.google.common.collect.ImmutableTable.copyOf(this.insertionOrder);
        }
    }

    private static final class MutableCell<R, C, V> extends com.google.common.collect.Tables.AbstractCell<R, C, V> {
        private final C column;
        private final R row;
        private V value;

        MutableCell(R r, C c, V v) {
            this.row = (R) com.google.common.base.Preconditions.checkNotNull(r, "row");
            this.column = (C) com.google.common.base.Preconditions.checkNotNull(c, "column");
            this.value = (V) com.google.common.base.Preconditions.checkNotNull(v, "value");
        }

        @Override // com.google.common.collect.Table.Cell
        public R getRowKey() {
            return this.row;
        }

        @Override // com.google.common.collect.Table.Cell
        public C getColumnKey() {
            return this.column;
        }

        @Override // com.google.common.collect.Table.Cell
        public V getValue() {
            return this.value;
        }

        void merge(V v, java.util.function.BinaryOperator<V> binaryOperator) {
            com.google.common.base.Preconditions.checkNotNull(v, "value");
            this.value = (V) com.google.common.base.Preconditions.checkNotNull(binaryOperator.apply(this.value, v), "mergeFunction.apply");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static <R, C, V> void mergeTables(com.google.common.collect.Table<R, C, V> table, @com.google.common.collect.ParametricNullness R row, @com.google.common.collect.ParametricNullness C column, @com.google.common.collect.ParametricNullness V value, java.util.function.BinaryOperator<V> mergeFunction) {
        com.google.common.base.Preconditions.checkNotNull(value);
        V v = table.get(row, column);
        if (v == null) {
            table.put(row, column, value);
            return;
        }
        java.lang.Object objApply = mergeFunction.apply(v, value);
        if (objApply == null) {
            table.remove(row, column);
        } else {
            table.put(row, column, objApply);
        }
    }

    private TableCollectors() {
    }
}
