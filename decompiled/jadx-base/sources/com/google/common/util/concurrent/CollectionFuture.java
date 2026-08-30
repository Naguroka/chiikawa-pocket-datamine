package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
abstract class CollectionFuture<V, C> extends com.google.common.util.concurrent.AggregateFuture<V, C> {

    @javax.annotation.CheckForNull
    private java.util.List<com.google.common.util.concurrent.CollectionFuture.Present<V>> values;

    abstract C combine(java.util.List<com.google.common.util.concurrent.CollectionFuture.Present<V>> values);

    CollectionFuture(com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> futures, boolean allMustSucceed) {
        java.util.List<com.google.common.util.concurrent.CollectionFuture.Present<V>> listNewArrayListWithCapacity;
        super(futures, allMustSucceed, true);
        if (futures.isEmpty()) {
            listNewArrayListWithCapacity = java.util.Collections.emptyList();
        } else {
            listNewArrayListWithCapacity = com.google.common.collect.Lists.newArrayListWithCapacity(futures.size());
        }
        for (int i = 0; i < futures.size(); i++) {
            listNewArrayListWithCapacity.add(null);
        }
        this.values = listNewArrayListWithCapacity;
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    final void collectOneValue(int index, @com.google.common.util.concurrent.ParametricNullness V returnValue) {
        java.util.List<com.google.common.util.concurrent.CollectionFuture.Present<V>> list = this.values;
        if (list != null) {
            list.set(index, new com.google.common.util.concurrent.CollectionFuture.Present<>(returnValue));
        }
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    final void handleAllCompleted() {
        java.util.List<com.google.common.util.concurrent.CollectionFuture.Present<V>> list = this.values;
        if (list != null) {
            set(combine(list));
        }
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    void releaseResources(com.google.common.util.concurrent.AggregateFuture.ReleaseResourcesReason reason) {
        super.releaseResources(reason);
        this.values = null;
    }

    static final class ListFuture<V> extends com.google.common.util.concurrent.CollectionFuture<V, java.util.List<V>> {
        ListFuture(com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> futures, boolean allMustSucceed) {
            super(futures, allMustSucceed);
            init();
        }

        @Override // com.google.common.util.concurrent.CollectionFuture
        public java.util.List<V> combine(java.util.List<com.google.common.util.concurrent.CollectionFuture.Present<V>> values) {
            java.util.ArrayList arrayListNewArrayListWithCapacity = com.google.common.collect.Lists.newArrayListWithCapacity(values.size());
            java.util.Iterator<com.google.common.util.concurrent.CollectionFuture.Present<V>> it = values.iterator();
            while (it.hasNext()) {
                com.google.common.util.concurrent.CollectionFuture.Present<V> next = it.next();
                arrayListNewArrayListWithCapacity.add(next != null ? next.value : null);
            }
            return java.util.Collections.unmodifiableList(arrayListNewArrayListWithCapacity);
        }
    }

    private static final class Present<V> {

        @com.google.common.util.concurrent.ParametricNullness
        final V value;

        Present(@com.google.common.util.concurrent.ParametricNullness V value) {
            this.value = value;
        }
    }
}
