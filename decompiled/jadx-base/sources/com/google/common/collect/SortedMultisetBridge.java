package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
interface SortedMultisetBridge<E> extends com.google.common.collect.Multiset<E> {
    @Override // com.google.common.collect.Multiset
    java.util.SortedSet<E> elementSet();
}
