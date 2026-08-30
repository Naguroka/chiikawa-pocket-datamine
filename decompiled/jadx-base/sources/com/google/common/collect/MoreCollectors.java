package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class MoreCollectors {
    private static final java.util.stream.Collector<java.lang.Object, ?, java.util.Optional<java.lang.Object>> TO_OPTIONAL = java.util.stream.Collector.of(new java.util.function.Supplier() { // from class: com.google.common.collect.MoreCollectors$$ExternalSyntheticLambda0
        @Override // java.util.function.Supplier
        public final java.lang.Object get() {
            return new com.google.common.collect.MoreCollectors.ToOptionalState();
        }
    }, new java.util.function.BiConsumer() { // from class: com.google.common.collect.MoreCollectors$$ExternalSyntheticLambda1
        @Override // java.util.function.BiConsumer
        public final void accept(java.lang.Object obj, java.lang.Object obj2) {
            ((com.google.common.collect.MoreCollectors.ToOptionalState) obj).add(obj2);
        }
    }, new java.util.function.BinaryOperator() { // from class: com.google.common.collect.MoreCollectors$$ExternalSyntheticLambda2
        @Override // java.util.function.BiFunction
        public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
            return ((com.google.common.collect.MoreCollectors.ToOptionalState) obj).combine((com.google.common.collect.MoreCollectors.ToOptionalState) obj2);
        }
    }, new java.util.function.Function() { // from class: com.google.common.collect.MoreCollectors$$ExternalSyntheticLambda3
        @Override // java.util.function.Function
        public final java.lang.Object apply(java.lang.Object obj) {
            return ((com.google.common.collect.MoreCollectors.ToOptionalState) obj).getOptional();
        }
    }, java.util.stream.Collector.Characteristics.UNORDERED);
    private static final java.lang.Object NULL_PLACEHOLDER = new java.lang.Object();
    private static final java.util.stream.Collector<java.lang.Object, ?, java.lang.Object> ONLY_ELEMENT = java.util.stream.Collector.of(new java.util.function.Supplier() { // from class: com.google.common.collect.MoreCollectors$$ExternalSyntheticLambda0
        @Override // java.util.function.Supplier
        public final java.lang.Object get() {
            return new com.google.common.collect.MoreCollectors.ToOptionalState();
        }
    }, new java.util.function.BiConsumer() { // from class: com.google.common.collect.MoreCollectors$$ExternalSyntheticLambda4
        @Override // java.util.function.BiConsumer
        public final void accept(java.lang.Object obj, java.lang.Object obj2) {
            com.google.common.collect.MoreCollectors.lambda$static$0((com.google.common.collect.MoreCollectors.ToOptionalState) obj, obj2);
        }
    }, new java.util.function.BinaryOperator() { // from class: com.google.common.collect.MoreCollectors$$ExternalSyntheticLambda2
        @Override // java.util.function.BiFunction
        public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
            return ((com.google.common.collect.MoreCollectors.ToOptionalState) obj).combine((com.google.common.collect.MoreCollectors.ToOptionalState) obj2);
        }
    }, new java.util.function.Function() { // from class: com.google.common.collect.MoreCollectors$$ExternalSyntheticLambda5
        @Override // java.util.function.Function
        public final java.lang.Object apply(java.lang.Object obj) {
            return com.google.common.collect.MoreCollectors.lambda$static$1((com.google.common.collect.MoreCollectors.ToOptionalState) obj);
        }
    }, java.util.stream.Collector.Characteristics.UNORDERED);

    public static <T> java.util.stream.Collector<T, ?, java.util.Optional<T>> toOptional() {
        return (java.util.stream.Collector<T, ?, java.util.Optional<T>>) TO_OPTIONAL;
    }

    static /* synthetic */ void lambda$static$0(com.google.common.collect.MoreCollectors.ToOptionalState toOptionalState, java.lang.Object obj) {
        if (obj == null) {
            obj = NULL_PLACEHOLDER;
        }
        toOptionalState.add(obj);
    }

    static /* synthetic */ java.lang.Object lambda$static$1(com.google.common.collect.MoreCollectors.ToOptionalState toOptionalState) {
        java.lang.Object element = toOptionalState.getElement();
        if (element == NULL_PLACEHOLDER) {
            return null;
        }
        return element;
    }

    public static <T> java.util.stream.Collector<T, ?, T> onlyElement() {
        return (java.util.stream.Collector<T, ?, T>) ONLY_ELEMENT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class ToOptionalState {
        static final int MAX_EXTRAS = 4;

        @javax.annotation.CheckForNull
        java.lang.Object element = null;
        java.util.List<java.lang.Object> extras = java.util.Collections.emptyList();

        ToOptionalState() {
        }

        java.lang.IllegalArgumentException multiples(boolean overflow) {
            java.lang.StringBuilder sbAppend = new java.lang.StringBuilder("expected one element but was: <").append(this.element);
            java.util.Iterator<java.lang.Object> it = this.extras.iterator();
            while (it.hasNext()) {
                sbAppend.append(", ").append(it.next());
            }
            if (overflow) {
                sbAppend.append(", ...");
            }
            sbAppend.append(kotlin.text.Typography.greater);
            throw new java.lang.IllegalArgumentException(sbAppend.toString());
        }

        void add(java.lang.Object o) {
            com.google.common.base.Preconditions.checkNotNull(o);
            if (this.element == null) {
                this.element = o;
                return;
            }
            if (this.extras.isEmpty()) {
                java.util.ArrayList arrayList = new java.util.ArrayList(4);
                this.extras = arrayList;
                arrayList.add(o);
            } else {
                if (this.extras.size() < 4) {
                    this.extras.add(o);
                    return;
                }
                throw multiples(true);
            }
        }

        com.google.common.collect.MoreCollectors.ToOptionalState combine(com.google.common.collect.MoreCollectors.ToOptionalState other) {
            if (this.element == null) {
                return other;
            }
            if (other.element == null) {
                return this;
            }
            if (this.extras.isEmpty()) {
                this.extras = new java.util.ArrayList();
            }
            this.extras.add(other.element);
            this.extras.addAll(other.extras);
            if (this.extras.size() <= 4) {
                return this;
            }
            java.util.List<java.lang.Object> list = this.extras;
            list.subList(4, list.size()).clear();
            throw multiples(true);
        }

        java.util.Optional<java.lang.Object> getOptional() {
            if (this.extras.isEmpty()) {
                return java.util.Optional.ofNullable(this.element);
            }
            throw multiples(false);
        }

        java.lang.Object getElement() {
            if (this.element == null) {
                throw new java.util.NoSuchElementException();
            }
            if (this.extras.isEmpty()) {
                return this.element;
            }
            throw multiples(false);
        }
    }

    private MoreCollectors() {
    }
}
