package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
class EmptyImmutableListMultimap extends com.google.common.collect.ImmutableListMultimap<java.lang.Object, java.lang.Object> {
    static final com.google.common.collect.EmptyImmutableListMultimap INSTANCE = new com.google.common.collect.EmptyImmutableListMultimap();
    private static final long serialVersionUID = 0;

    private EmptyImmutableListMultimap() {
        super(com.google.common.collect.ImmutableMap.of(), 0);
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public com.google.common.collect.ImmutableMap<java.lang.Object, java.util.Collection<java.lang.Object>> asMap() {
        return super.asMap();
    }

    private java.lang.Object readResolve() {
        return INSTANCE;
    }
}
