package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public class LinkedListMultimap<K, V> extends com.google.common.collect.AbstractMultimap<K, V> implements com.google.common.collect.ListMultimap<K, V>, java.io.Serializable {
    private static final long serialVersionUID = 0;

    @javax.annotation.CheckForNull
    private transient com.google.common.collect.LinkedListMultimap.Node<K, V> head;
    private transient java.util.Map<K, com.google.common.collect.LinkedListMultimap.KeyList<K, V>> keyToKeyList;
    private transient int modCount;
    private transient int size;

    @javax.annotation.CheckForNull
    private transient com.google.common.collect.LinkedListMultimap.Node<K, V> tail;

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ java.util.Map asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean containsEntry(@javax.annotation.CheckForNull java.lang.Object key, @javax.annotation.CheckForNull java.lang.Object value) {
        return super.containsEntry(key, value);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        return super.equals(object);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Set keySet() {
        return super.keySet();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ com.google.common.collect.Multiset keys() {
        return super.keys();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean putAll(com.google.common.collect.Multimap multimap) {
        return super.putAll(multimap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean putAll(@com.google.common.collect.ParametricNullness java.lang.Object key, java.lang.Iterable values) {
        return super.putAll(key, values);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean remove(@javax.annotation.CheckForNull java.lang.Object key, @javax.annotation.CheckForNull java.lang.Object value) {
        return super.remove(key, value);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public /* bridge */ /* synthetic */ java.lang.String toString() {
        return super.toString();
    }

    static final class Node<K, V> extends com.google.common.collect.AbstractMapEntry<K, V> {

        @com.google.common.collect.ParametricNullness
        final K key;

        @javax.annotation.CheckForNull
        com.google.common.collect.LinkedListMultimap.Node<K, V> next;

        @javax.annotation.CheckForNull
        com.google.common.collect.LinkedListMultimap.Node<K, V> nextSibling;

        @javax.annotation.CheckForNull
        com.google.common.collect.LinkedListMultimap.Node<K, V> previous;

        @javax.annotation.CheckForNull
        com.google.common.collect.LinkedListMultimap.Node<K, V> previousSibling;

        @com.google.common.collect.ParametricNullness
        V value;

        Node(@com.google.common.collect.ParametricNullness K key, @com.google.common.collect.ParametricNullness V value) {
            this.key = key;
            this.value = value;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @com.google.common.collect.ParametricNullness
        public K getKey() {
            return this.key;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @com.google.common.collect.ParametricNullness
        public V getValue() {
            return this.value;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @com.google.common.collect.ParametricNullness
        public V setValue(@com.google.common.collect.ParametricNullness V newValue) {
            V v = this.value;
            this.value = newValue;
            return v;
        }
    }

    private static class KeyList<K, V> {
        int count;
        com.google.common.collect.LinkedListMultimap.Node<K, V> head;
        com.google.common.collect.LinkedListMultimap.Node<K, V> tail;

        KeyList(com.google.common.collect.LinkedListMultimap.Node<K, V> firstNode) {
            this.head = firstNode;
            this.tail = firstNode;
            firstNode.previousSibling = null;
            firstNode.nextSibling = null;
            this.count = 1;
        }
    }

    public static <K, V> com.google.common.collect.LinkedListMultimap<K, V> create() {
        return new com.google.common.collect.LinkedListMultimap<>();
    }

    public static <K, V> com.google.common.collect.LinkedListMultimap<K, V> create(int expectedKeys) {
        return new com.google.common.collect.LinkedListMultimap<>(expectedKeys);
    }

    public static <K, V> com.google.common.collect.LinkedListMultimap<K, V> create(com.google.common.collect.Multimap<? extends K, ? extends V> multimap) {
        return new com.google.common.collect.LinkedListMultimap<>(multimap);
    }

    LinkedListMultimap() {
        this(12);
    }

    private LinkedListMultimap(int expectedKeys) {
        this.keyToKeyList = com.google.common.collect.Platform.newHashMapWithExpectedSize(expectedKeys);
    }

    private LinkedListMultimap(com.google.common.collect.Multimap<? extends K, ? extends V> multimap) {
        this(multimap.keySet().size());
        putAll(multimap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.common.collect.LinkedListMultimap.Node<K, V> addNode(@com.google.common.collect.ParametricNullness K key, @com.google.common.collect.ParametricNullness V value, @javax.annotation.CheckForNull com.google.common.collect.LinkedListMultimap.Node<K, V> nextSibling) {
        com.google.common.collect.LinkedListMultimap.Node<K, V> node = new com.google.common.collect.LinkedListMultimap.Node<>(key, value);
        if (this.head == null) {
            this.tail = node;
            this.head = node;
            this.keyToKeyList.put(key, new com.google.common.collect.LinkedListMultimap.KeyList<>(node));
            this.modCount++;
        } else if (nextSibling == null) {
            ((com.google.common.collect.LinkedListMultimap.Node) java.util.Objects.requireNonNull(this.tail)).next = node;
            node.previous = this.tail;
            this.tail = node;
            com.google.common.collect.LinkedListMultimap.KeyList<K, V> keyList = this.keyToKeyList.get(key);
            if (keyList == null) {
                this.keyToKeyList.put(key, new com.google.common.collect.LinkedListMultimap.KeyList<>(node));
                this.modCount++;
            } else {
                keyList.count++;
                com.google.common.collect.LinkedListMultimap.Node<K, V> node2 = keyList.tail;
                node2.nextSibling = node;
                node.previousSibling = node2;
                keyList.tail = node;
            }
        } else {
            com.google.common.collect.LinkedListMultimap.KeyList keyList2 = (com.google.common.collect.LinkedListMultimap.KeyList) java.util.Objects.requireNonNull(this.keyToKeyList.get(key));
            keyList2.count++;
            node.previous = nextSibling.previous;
            node.previousSibling = nextSibling.previousSibling;
            node.next = nextSibling;
            node.nextSibling = nextSibling;
            if (nextSibling.previousSibling == null) {
                keyList2.head = node;
            } else {
                nextSibling.previousSibling.nextSibling = node;
            }
            if (nextSibling.previous == null) {
                this.head = node;
            } else {
                nextSibling.previous.next = node;
            }
            nextSibling.previous = node;
            nextSibling.previousSibling = node;
        }
        this.size++;
        return node;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeNode(com.google.common.collect.LinkedListMultimap.Node<K, V> node) {
        if (node.previous != null) {
            node.previous.next = node.next;
        } else {
            this.head = node.next;
        }
        if (node.next != null) {
            node.next.previous = node.previous;
        } else {
            this.tail = node.previous;
        }
        if (node.previousSibling == null && node.nextSibling == null) {
            ((com.google.common.collect.LinkedListMultimap.KeyList) java.util.Objects.requireNonNull(this.keyToKeyList.remove(node.key))).count = 0;
            this.modCount++;
        } else {
            com.google.common.collect.LinkedListMultimap.KeyList keyList = (com.google.common.collect.LinkedListMultimap.KeyList) java.util.Objects.requireNonNull(this.keyToKeyList.get(node.key));
            keyList.count--;
            if (node.previousSibling == null) {
                keyList.head = (com.google.common.collect.LinkedListMultimap.Node) java.util.Objects.requireNonNull(node.nextSibling);
            } else {
                node.previousSibling.nextSibling = node.nextSibling;
            }
            if (node.nextSibling == null) {
                keyList.tail = (com.google.common.collect.LinkedListMultimap.Node) java.util.Objects.requireNonNull(node.previousSibling);
            } else {
                node.nextSibling.previousSibling = node.previousSibling;
            }
        }
        this.size--;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAllNodes(@com.google.common.collect.ParametricNullness K key) {
        com.google.common.collect.Iterators.clear(new com.google.common.collect.LinkedListMultimap.ValueForKeyIterator(key));
    }

    private class NodeIterator implements java.util.ListIterator<java.util.Map.Entry<K, V>> {

        @javax.annotation.CheckForNull
        com.google.common.collect.LinkedListMultimap.Node<K, V> current;
        int expectedModCount;

        @javax.annotation.CheckForNull
        com.google.common.collect.LinkedListMultimap.Node<K, V> next;
        int nextIndex;

        @javax.annotation.CheckForNull
        com.google.common.collect.LinkedListMultimap.Node<K, V> previous;

        NodeIterator(int index) {
            this.expectedModCount = com.google.common.collect.LinkedListMultimap.this.modCount;
            int size = com.google.common.collect.LinkedListMultimap.this.size();
            com.google.common.base.Preconditions.checkPositionIndex(index, size);
            if (index >= size / 2) {
                this.previous = com.google.common.collect.LinkedListMultimap.this.tail;
                this.nextIndex = size;
                while (true) {
                    int i = index + 1;
                    if (index >= size) {
                        break;
                    }
                    previous();
                    index = i;
                }
            } else {
                this.next = com.google.common.collect.LinkedListMultimap.this.head;
                while (true) {
                    int i2 = index - 1;
                    if (index <= 0) {
                        break;
                    }
                    next();
                    index = i2;
                }
            }
            this.current = null;
        }

        private void checkForConcurrentModification() {
            if (com.google.common.collect.LinkedListMultimap.this.modCount != this.expectedModCount) {
                throw new java.util.ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            checkForConcurrentModification();
            return this.next != null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public com.google.common.collect.LinkedListMultimap.Node<K, V> next() {
            checkForConcurrentModification();
            com.google.common.collect.LinkedListMultimap.Node<K, V> node = this.next;
            if (node == null) {
                throw new java.util.NoSuchElementException();
            }
            this.current = node;
            this.previous = node;
            this.next = node.next;
            this.nextIndex++;
            return this.current;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            checkForConcurrentModification();
            com.google.common.base.Preconditions.checkState(this.current != null, "no calls to next() since the last call to remove()");
            com.google.common.collect.LinkedListMultimap.Node<K, V> node = this.current;
            if (node != this.next) {
                this.previous = node.previous;
                this.nextIndex--;
            } else {
                this.next = node.next;
            }
            com.google.common.collect.LinkedListMultimap.this.removeNode(this.current);
            this.current = null;
            this.expectedModCount = com.google.common.collect.LinkedListMultimap.this.modCount;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            checkForConcurrentModification();
            return this.previous != null;
        }

        @Override // java.util.ListIterator
        public com.google.common.collect.LinkedListMultimap.Node<K, V> previous() {
            checkForConcurrentModification();
            com.google.common.collect.LinkedListMultimap.Node<K, V> node = this.previous;
            if (node == null) {
                throw new java.util.NoSuchElementException();
            }
            this.current = node;
            this.next = node;
            this.previous = node.previous;
            this.nextIndex--;
            return this.current;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.nextIndex;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.nextIndex - 1;
        }

        @Override // java.util.ListIterator
        public void set(java.util.Map.Entry<K, V> e) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public void add(java.util.Map.Entry<K, V> e) {
            throw new java.lang.UnsupportedOperationException();
        }

        void setValue(@com.google.common.collect.ParametricNullness V value) {
            com.google.common.base.Preconditions.checkState(this.current != null);
            this.current.value = value;
        }
    }

    private class DistinctKeyIterator implements java.util.Iterator<K> {

        @javax.annotation.CheckForNull
        com.google.common.collect.LinkedListMultimap.Node<K, V> current;
        int expectedModCount;

        @javax.annotation.CheckForNull
        com.google.common.collect.LinkedListMultimap.Node<K, V> next;
        final java.util.Set<K> seenKeys;

        private DistinctKeyIterator() {
            this.seenKeys = com.google.common.collect.Sets.newHashSetWithExpectedSize(com.google.common.collect.LinkedListMultimap.this.keySet().size());
            this.next = com.google.common.collect.LinkedListMultimap.this.head;
            this.expectedModCount = com.google.common.collect.LinkedListMultimap.this.modCount;
        }

        private void checkForConcurrentModification() {
            if (com.google.common.collect.LinkedListMultimap.this.modCount != this.expectedModCount) {
                throw new java.util.ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            checkForConcurrentModification();
            return this.next != null;
        }

        @Override // java.util.Iterator
        @com.google.common.collect.ParametricNullness
        public K next() {
            com.google.common.collect.LinkedListMultimap.Node<K, V> node;
            checkForConcurrentModification();
            com.google.common.collect.LinkedListMultimap.Node<K, V> node2 = this.next;
            if (node2 == null) {
                throw new java.util.NoSuchElementException();
            }
            this.current = node2;
            this.seenKeys.add(node2.key);
            do {
                node = this.next.next;
                this.next = node;
                if (node == null) {
                    break;
                }
            } while (!this.seenKeys.add(node.key));
            return this.current.key;
        }

        @Override // java.util.Iterator
        public void remove() {
            checkForConcurrentModification();
            com.google.common.base.Preconditions.checkState(this.current != null, "no calls to next() since the last call to remove()");
            com.google.common.collect.LinkedListMultimap.this.removeAllNodes(this.current.key);
            this.current = null;
            this.expectedModCount = com.google.common.collect.LinkedListMultimap.this.modCount;
        }
    }

    private class ValueForKeyIterator implements java.util.ListIterator<V> {

        @javax.annotation.CheckForNull
        com.google.common.collect.LinkedListMultimap.Node<K, V> current;

        @com.google.common.collect.ParametricNullness
        final K key;

        @javax.annotation.CheckForNull
        com.google.common.collect.LinkedListMultimap.Node<K, V> next;
        int nextIndex;

        @javax.annotation.CheckForNull
        com.google.common.collect.LinkedListMultimap.Node<K, V> previous;

        ValueForKeyIterator(K key) {
            this.key = key;
            com.google.common.collect.LinkedListMultimap.KeyList keyList = (com.google.common.collect.LinkedListMultimap.KeyList) com.google.common.collect.LinkedListMultimap.this.keyToKeyList.get(key);
            this.next = keyList == null ? null : keyList.head;
        }

        public ValueForKeyIterator(K key, int index) {
            com.google.common.collect.LinkedListMultimap.KeyList keyList = (com.google.common.collect.LinkedListMultimap.KeyList) com.google.common.collect.LinkedListMultimap.this.keyToKeyList.get(key);
            int i = keyList == null ? 0 : keyList.count;
            com.google.common.base.Preconditions.checkPositionIndex(index, i);
            if (index >= i / 2) {
                this.previous = keyList == null ? null : keyList.tail;
                this.nextIndex = i;
                while (true) {
                    int i2 = index + 1;
                    if (index >= i) {
                        break;
                    }
                    previous();
                    index = i2;
                }
            } else {
                this.next = keyList == null ? null : keyList.head;
                while (true) {
                    int i3 = index - 1;
                    if (index <= 0) {
                        break;
                    }
                    next();
                    index = i3;
                }
            }
            this.key = key;
            this.current = null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.next != null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        @com.google.common.collect.ParametricNullness
        public V next() {
            com.google.common.collect.LinkedListMultimap.Node<K, V> node = this.next;
            if (node == null) {
                throw new java.util.NoSuchElementException();
            }
            this.current = node;
            this.previous = node;
            this.next = node.nextSibling;
            this.nextIndex++;
            return this.current.value;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.previous != null;
        }

        @Override // java.util.ListIterator
        @com.google.common.collect.ParametricNullness
        public V previous() {
            com.google.common.collect.LinkedListMultimap.Node<K, V> node = this.previous;
            if (node == null) {
                throw new java.util.NoSuchElementException();
            }
            this.current = node;
            this.next = node;
            this.previous = node.previousSibling;
            this.nextIndex--;
            return this.current.value;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.nextIndex;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.nextIndex - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            com.google.common.base.Preconditions.checkState(this.current != null, "no calls to next() since the last call to remove()");
            com.google.common.collect.LinkedListMultimap.Node<K, V> node = this.current;
            if (node != this.next) {
                this.previous = node.previousSibling;
                this.nextIndex--;
            } else {
                this.next = node.nextSibling;
            }
            com.google.common.collect.LinkedListMultimap.this.removeNode(this.current);
            this.current = null;
        }

        @Override // java.util.ListIterator
        public void set(@com.google.common.collect.ParametricNullness V value) {
            com.google.common.base.Preconditions.checkState(this.current != null);
            this.current.value = value;
        }

        @Override // java.util.ListIterator
        public void add(@com.google.common.collect.ParametricNullness V value) {
            this.previous = com.google.common.collect.LinkedListMultimap.this.addNode(this.key, value, this.next);
            this.nextIndex++;
            this.current = null;
        }
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
        return this.size;
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public boolean isEmpty() {
        return this.head == null;
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object key) {
        return this.keyToKeyList.containsKey(key);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public boolean containsValue(@javax.annotation.CheckForNull java.lang.Object value) {
        return values().contains(value);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public boolean put(@com.google.common.collect.ParametricNullness K key, @com.google.common.collect.ParametricNullness V value) {
        addNode(key, value, null);
        return true;
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.List<V> replaceValues(@com.google.common.collect.ParametricNullness K key, java.lang.Iterable<? extends V> values) {
        java.util.List<V> copy = getCopy(key);
        com.google.common.collect.LinkedListMultimap.ValueForKeyIterator valueForKeyIterator = new com.google.common.collect.LinkedListMultimap.ValueForKeyIterator(key);
        java.util.Iterator<? extends V> it = values.iterator();
        while (valueForKeyIterator.hasNext() && it.hasNext()) {
            valueForKeyIterator.next();
            valueForKeyIterator.set(it.next());
        }
        while (valueForKeyIterator.hasNext()) {
            valueForKeyIterator.next();
            valueForKeyIterator.remove();
        }
        while (it.hasNext()) {
            valueForKeyIterator.add(it.next());
        }
        return copy;
    }

    private java.util.List<V> getCopy(@com.google.common.collect.ParametricNullness K key) {
        return java.util.Collections.unmodifiableList(com.google.common.collect.Lists.newArrayList(new com.google.common.collect.LinkedListMultimap.ValueForKeyIterator(key)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.List<V> removeAll(@javax.annotation.CheckForNull java.lang.Object key) {
        java.util.List<V> copy = getCopy(key);
        removeAllNodes(key);
        return copy;
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
        this.head = null;
        this.tail = null;
        this.keyToKeyList.clear();
        this.size = 0;
        this.modCount++;
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.List<V> get(@com.google.common.collect.ParametricNullness final K key) {
        return new java.util.AbstractSequentialList<V>() { // from class: com.google.common.collect.LinkedListMultimap.1
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                com.google.common.collect.LinkedListMultimap.KeyList keyList = (com.google.common.collect.LinkedListMultimap.KeyList) com.google.common.collect.LinkedListMultimap.this.keyToKeyList.get(key);
                if (keyList == null) {
                    return 0;
                }
                return keyList.count;
            }

            @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
            public java.util.ListIterator<V> listIterator(int index) {
                return new com.google.common.collect.LinkedListMultimap.ValueForKeyIterator(key, index);
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultimap
    java.util.Set<K> createKeySet() {
        return new com.google.common.collect.Sets.ImprovedAbstractSet<K>() { // from class: com.google.common.collect.LinkedListMultimap.1KeySetImpl
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return com.google.common.collect.LinkedListMultimap.this.keyToKeyList.size();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public java.util.Iterator<K> iterator() {
                return new com.google.common.collect.LinkedListMultimap.DistinctKeyIterator();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@javax.annotation.CheckForNull java.lang.Object key) {
                return com.google.common.collect.LinkedListMultimap.this.containsKey(key);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@javax.annotation.CheckForNull java.lang.Object o) {
                return !com.google.common.collect.LinkedListMultimap.this.removeAll(o).isEmpty();
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultimap
    com.google.common.collect.Multiset<K> createKeys() {
        return new com.google.common.collect.Multimaps.Keys(this);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public java.util.List<V> values() {
        return (java.util.List) super.values();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMultimap
    public java.util.List<V> createValues() {
        return new java.util.AbstractSequentialList<V>() { // from class: com.google.common.collect.LinkedListMultimap.1ValuesImpl
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return com.google.common.collect.LinkedListMultimap.this.size;
            }

            @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
            public java.util.ListIterator<V> listIterator(int index) {
                final com.google.common.collect.LinkedListMultimap.NodeIterator nodeIterator = new com.google.common.collect.LinkedListMultimap.NodeIterator(index);
                return new com.google.common.collect.TransformedListIterator<java.util.Map.Entry<K, V>, V>(this, nodeIterator) { // from class: com.google.common.collect.LinkedListMultimap.1ValuesImpl.1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    @Override // com.google.common.collect.TransformedIterator
                    @com.google.common.collect.ParametricNullness
                    public V transform(java.util.Map.Entry<K, V> entry) {
                        return entry.getValue();
                    }

                    @Override // com.google.common.collect.TransformedListIterator, java.util.ListIterator
                    public void set(@com.google.common.collect.ParametricNullness V value) {
                        nodeIterator.setValue(value);
                    }
                };
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public java.util.List<java.util.Map.Entry<K, V>> entries() {
        return (java.util.List) super.entries();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMultimap
    public java.util.List<java.util.Map.Entry<K, V>> createEntries() {
        return new java.util.AbstractSequentialList<java.util.Map.Entry<K, V>>() { // from class: com.google.common.collect.LinkedListMultimap.1EntriesImpl
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return com.google.common.collect.LinkedListMultimap.this.size;
            }

            @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
            public java.util.ListIterator<java.util.Map.Entry<K, V>> listIterator(int index) {
                return new com.google.common.collect.LinkedListMultimap.NodeIterator(index);
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultimap
    java.util.Iterator<java.util.Map.Entry<K, V>> entryIterator() {
        throw new java.lang.AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractMultimap
    java.util.Map<K, java.util.Collection<V>> createAsMap() {
        return new com.google.common.collect.Multimaps.AsMap(this);
    }

    private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
        stream.defaultWriteObject();
        stream.writeInt(size());
        for (java.util.Map.Entry<K, V> entry : entries()) {
            stream.writeObject(entry.getKey());
            stream.writeObject(entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(java.io.ObjectInputStream stream) throws java.lang.ClassNotFoundException, java.io.IOException {
        stream.defaultReadObject();
        this.keyToKeyList = com.google.common.collect.CompactLinkedHashMap.create();
        int i = stream.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            put(stream.readObject(), stream.readObject());
        }
    }
}
