package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class RegularImmutableMap<K, V> extends com.google.common.collect.ImmutableMap<K, V> {
    private static final byte ABSENT = -1;
    private static final int BYTE_MASK = 255;
    private static final int BYTE_MAX_SIZE = 128;
    static final com.google.common.collect.ImmutableMap<java.lang.Object, java.lang.Object> EMPTY = new com.google.common.collect.RegularImmutableMap(null, new java.lang.Object[0], 0);
    private static final int SHORT_MASK = 65535;
    private static final int SHORT_MAX_SIZE = 32768;
    private static final long serialVersionUID = 0;
    final transient java.lang.Object[] alternatingKeysAndValues;

    @javax.annotation.CheckForNull
    private final transient java.lang.Object hashTable;
    private final transient int size;

    @Override // com.google.common.collect.ImmutableMap
    boolean isPartialView() {
        return false;
    }

    static <K, V> com.google.common.collect.RegularImmutableMap<K, V> create(int n, java.lang.Object[] alternatingKeysAndValues) {
        return create(n, alternatingKeysAndValues, null);
    }

    static <K, V> com.google.common.collect.RegularImmutableMap<K, V> create(int n, java.lang.Object[] alternatingKeysAndValues, com.google.common.collect.ImmutableMap.Builder<K, V> builder) {
        if (n == 0) {
            return (com.google.common.collect.RegularImmutableMap) EMPTY;
        }
        if (n == 1) {
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(java.util.Objects.requireNonNull(alternatingKeysAndValues[0]), java.util.Objects.requireNonNull(alternatingKeysAndValues[1]));
            return new com.google.common.collect.RegularImmutableMap<>(null, alternatingKeysAndValues, 1);
        }
        com.google.common.base.Preconditions.checkPositionIndex(n, alternatingKeysAndValues.length >> 1);
        java.lang.Object objCreateHashTable = createHashTable(alternatingKeysAndValues, n, com.google.common.collect.ImmutableSet.chooseTableSize(n), 0);
        if (objCreateHashTable instanceof java.lang.Object[]) {
            java.lang.Object[] objArr = (java.lang.Object[]) objCreateHashTable;
            com.google.common.collect.ImmutableMap.Builder.DuplicateKey duplicateKey = (com.google.common.collect.ImmutableMap.Builder.DuplicateKey) objArr[2];
            if (builder == null) {
                throw duplicateKey.exception();
            }
            builder.duplicateKey = duplicateKey;
            java.lang.Object obj = objArr[0];
            int iIntValue = ((java.lang.Integer) objArr[1]).intValue();
            alternatingKeysAndValues = java.util.Arrays.copyOf(alternatingKeysAndValues, iIntValue * 2);
            objCreateHashTable = obj;
            n = iIntValue;
        }
        return new com.google.common.collect.RegularImmutableMap<>(objCreateHashTable, alternatingKeysAndValues, n);
    }

    @javax.annotation.CheckForNull
    private static java.lang.Object createHashTable(java.lang.Object[] alternatingKeysAndValues, int n, int tableSize, int keyOffset) {
        com.google.common.collect.ImmutableMap.Builder.DuplicateKey duplicateKey = null;
        if (n == 1) {
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(java.util.Objects.requireNonNull(alternatingKeysAndValues[keyOffset]), java.util.Objects.requireNonNull(alternatingKeysAndValues[keyOffset ^ 1]));
            return null;
        }
        int i = tableSize - 1;
        int i2 = -1;
        if (tableSize <= 128) {
            byte[] bArr = new byte[tableSize];
            java.util.Arrays.fill(bArr, (byte) -1);
            int i3 = 0;
            for (int i4 = 0; i4 < n; i4++) {
                int i5 = (i4 * 2) + keyOffset;
                int i6 = (i3 * 2) + keyOffset;
                java.lang.Object objRequireNonNull = java.util.Objects.requireNonNull(alternatingKeysAndValues[i5]);
                java.lang.Object objRequireNonNull2 = java.util.Objects.requireNonNull(alternatingKeysAndValues[i5 ^ 1]);
                com.google.common.collect.CollectPreconditions.checkEntryNotNull(objRequireNonNull, objRequireNonNull2);
                int iSmear = com.google.common.collect.Hashing.smear(objRequireNonNull.hashCode());
                while (true) {
                    int i7 = iSmear & i;
                    int i8 = bArr[i7] & 255;
                    if (i8 == 255) {
                        bArr[i7] = (byte) i6;
                        if (i3 < i4) {
                            alternatingKeysAndValues[i6] = objRequireNonNull;
                            alternatingKeysAndValues[i6 ^ 1] = objRequireNonNull2;
                        }
                        i3++;
                        break;
                    }
                    if (objRequireNonNull.equals(alternatingKeysAndValues[i8])) {
                        int i9 = i8 ^ 1;
                        duplicateKey = new com.google.common.collect.ImmutableMap.Builder.DuplicateKey(objRequireNonNull, objRequireNonNull2, java.util.Objects.requireNonNull(alternatingKeysAndValues[i9]));
                        alternatingKeysAndValues[i9] = objRequireNonNull2;
                        break;
                    }
                    iSmear = i7 + 1;
                }
            }
            return i3 == n ? bArr : new java.lang.Object[]{bArr, java.lang.Integer.valueOf(i3), duplicateKey};
        }
        if (tableSize <= 32768) {
            short[] sArr = new short[tableSize];
            java.util.Arrays.fill(sArr, (short) -1);
            int i10 = 0;
            for (int i11 = 0; i11 < n; i11++) {
                int i12 = (i11 * 2) + keyOffset;
                int i13 = (i10 * 2) + keyOffset;
                java.lang.Object objRequireNonNull3 = java.util.Objects.requireNonNull(alternatingKeysAndValues[i12]);
                java.lang.Object objRequireNonNull4 = java.util.Objects.requireNonNull(alternatingKeysAndValues[i12 ^ 1]);
                com.google.common.collect.CollectPreconditions.checkEntryNotNull(objRequireNonNull3, objRequireNonNull4);
                int iSmear2 = com.google.common.collect.Hashing.smear(objRequireNonNull3.hashCode());
                while (true) {
                    int i14 = iSmear2 & i;
                    int i15 = sArr[i14] & kotlin.UShort.MAX_VALUE;
                    if (i15 == 65535) {
                        sArr[i14] = (short) i13;
                        if (i10 < i11) {
                            alternatingKeysAndValues[i13] = objRequireNonNull3;
                            alternatingKeysAndValues[i13 ^ 1] = objRequireNonNull4;
                        }
                        i10++;
                        break;
                    }
                    if (objRequireNonNull3.equals(alternatingKeysAndValues[i15])) {
                        int i16 = i15 ^ 1;
                        duplicateKey = new com.google.common.collect.ImmutableMap.Builder.DuplicateKey(objRequireNonNull3, objRequireNonNull4, java.util.Objects.requireNonNull(alternatingKeysAndValues[i16]));
                        alternatingKeysAndValues[i16] = objRequireNonNull4;
                        break;
                    }
                    iSmear2 = i14 + 1;
                }
            }
            return i10 == n ? sArr : new java.lang.Object[]{sArr, java.lang.Integer.valueOf(i10), duplicateKey};
        }
        int[] iArr = new int[tableSize];
        java.util.Arrays.fill(iArr, -1);
        int i17 = 0;
        int i18 = 0;
        while (i17 < n) {
            int i19 = (i17 * 2) + keyOffset;
            int i20 = (i18 * 2) + keyOffset;
            java.lang.Object objRequireNonNull5 = java.util.Objects.requireNonNull(alternatingKeysAndValues[i19]);
            java.lang.Object objRequireNonNull6 = java.util.Objects.requireNonNull(alternatingKeysAndValues[i19 ^ 1]);
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(objRequireNonNull5, objRequireNonNull6);
            int iSmear3 = com.google.common.collect.Hashing.smear(objRequireNonNull5.hashCode());
            while (true) {
                int i21 = iSmear3 & i;
                int i22 = iArr[i21];
                if (i22 == i2) {
                    iArr[i21] = i20;
                    if (i18 < i17) {
                        alternatingKeysAndValues[i20] = objRequireNonNull5;
                        alternatingKeysAndValues[i20 ^ 1] = objRequireNonNull6;
                    }
                    i18++;
                    break;
                }
                if (objRequireNonNull5.equals(alternatingKeysAndValues[i22])) {
                    int i23 = i22 ^ 1;
                    duplicateKey = new com.google.common.collect.ImmutableMap.Builder.DuplicateKey(objRequireNonNull5, objRequireNonNull6, java.util.Objects.requireNonNull(alternatingKeysAndValues[i23]));
                    alternatingKeysAndValues[i23] = objRequireNonNull6;
                    break;
                }
                iSmear3 = i21 + 1;
                i2 = -1;
            }
            i17++;
            i2 = -1;
        }
        return i18 == n ? iArr : new java.lang.Object[]{iArr, java.lang.Integer.valueOf(i18), duplicateKey};
    }

    @javax.annotation.CheckForNull
    static java.lang.Object createHashTableOrThrow(java.lang.Object[] alternatingKeysAndValues, int n, int tableSize, int keyOffset) {
        java.lang.Object objCreateHashTable = createHashTable(alternatingKeysAndValues, n, tableSize, keyOffset);
        if (objCreateHashTable instanceof java.lang.Object[]) {
            throw ((com.google.common.collect.ImmutableMap.Builder.DuplicateKey) ((java.lang.Object[]) objCreateHashTable)[2]).exception();
        }
        return objCreateHashTable;
    }

    private RegularImmutableMap(@javax.annotation.CheckForNull java.lang.Object hashTable, java.lang.Object[] alternatingKeysAndValues, int size) {
        this.hashTable = hashTable;
        this.alternatingKeysAndValues = alternatingKeysAndValues;
        this.size = size;
    }

    @Override // java.util.Map
    public int size() {
        return this.size;
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    @javax.annotation.CheckForNull
    public V get(@javax.annotation.CheckForNull java.lang.Object obj) {
        V v = (V) get(this.hashTable, this.alternatingKeysAndValues, this.size, 0, obj);
        if (v == null) {
            return null;
        }
        return v;
    }

    @javax.annotation.CheckForNull
    static java.lang.Object get(@javax.annotation.CheckForNull java.lang.Object hashTableObject, java.lang.Object[] alternatingKeysAndValues, int size, int keyOffset, @javax.annotation.CheckForNull java.lang.Object key) {
        if (key == null) {
            return null;
        }
        if (size == 1) {
            if (java.util.Objects.requireNonNull(alternatingKeysAndValues[keyOffset]).equals(key)) {
                return java.util.Objects.requireNonNull(alternatingKeysAndValues[keyOffset ^ 1]);
            }
            return null;
        }
        if (hashTableObject == null) {
            return null;
        }
        if (hashTableObject instanceof byte[]) {
            byte[] bArr = (byte[]) hashTableObject;
            int length = bArr.length - 1;
            int iSmear = com.google.common.collect.Hashing.smear(key.hashCode());
            while (true) {
                int i = iSmear & length;
                int i2 = bArr[i] & 255;
                if (i2 == 255) {
                    return null;
                }
                if (key.equals(alternatingKeysAndValues[i2])) {
                    return alternatingKeysAndValues[i2 ^ 1];
                }
                iSmear = i + 1;
            }
        } else if (hashTableObject instanceof short[]) {
            short[] sArr = (short[]) hashTableObject;
            int length2 = sArr.length - 1;
            int iSmear2 = com.google.common.collect.Hashing.smear(key.hashCode());
            while (true) {
                int i3 = iSmear2 & length2;
                int i4 = sArr[i3] & kotlin.UShort.MAX_VALUE;
                if (i4 == 65535) {
                    return null;
                }
                if (key.equals(alternatingKeysAndValues[i4])) {
                    return alternatingKeysAndValues[i4 ^ 1];
                }
                iSmear2 = i3 + 1;
            }
        } else {
            int[] iArr = (int[]) hashTableObject;
            int length3 = iArr.length - 1;
            int iSmear3 = com.google.common.collect.Hashing.smear(key.hashCode());
            while (true) {
                int i5 = iSmear3 & length3;
                int i6 = iArr[i5];
                if (i6 == -1) {
                    return null;
                }
                if (key.equals(alternatingKeysAndValues[i6])) {
                    return alternatingKeysAndValues[i6 ^ 1];
                }
                iSmear3 = i5 + 1;
            }
        }
    }

    @Override // com.google.common.collect.ImmutableMap
    com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> createEntrySet() {
        return new com.google.common.collect.RegularImmutableMap.EntrySet(this, this.alternatingKeysAndValues, 0, this.size);
    }

    static class EntrySet<K, V> extends com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> {
        private final transient java.lang.Object[] alternatingKeysAndValues;
        private final transient int keyOffset;
        private final transient com.google.common.collect.ImmutableMap<K, V> map;
        private final transient int size;

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
            return true;
        }

        EntrySet(com.google.common.collect.ImmutableMap<K, V> map, java.lang.Object[] alternatingKeysAndValues, int keyOffset, int size) {
            this.map = map;
            this.alternatingKeysAndValues = alternatingKeysAndValues;
            this.keyOffset = keyOffset;
            this.size = size;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, V>> iterator() {
            return asList().iterator();
        }

        @Override // com.google.common.collect.ImmutableCollection
        int copyIntoArray(java.lang.Object[] dst, int offset) {
            return asList().copyIntoArray(dst, offset);
        }

        @Override // com.google.common.collect.ImmutableSet
        com.google.common.collect.ImmutableList<java.util.Map.Entry<K, V>> createAsList() {
            return new com.google.common.collect.ImmutableList<java.util.Map.Entry<K, V>>() { // from class: com.google.common.collect.RegularImmutableMap.EntrySet.1
                @Override // com.google.common.collect.ImmutableCollection
                public boolean isPartialView() {
                    return true;
                }

                @Override // java.util.List
                public java.util.Map.Entry<K, V> get(int index) {
                    com.google.common.base.Preconditions.checkElementIndex(index, com.google.common.collect.RegularImmutableMap.EntrySet.this.size);
                    int i = index * 2;
                    return new java.util.AbstractMap.SimpleImmutableEntry(java.util.Objects.requireNonNull(com.google.common.collect.RegularImmutableMap.EntrySet.this.alternatingKeysAndValues[com.google.common.collect.RegularImmutableMap.EntrySet.this.keyOffset + i]), java.util.Objects.requireNonNull(com.google.common.collect.RegularImmutableMap.EntrySet.this.alternatingKeysAndValues[i + (com.google.common.collect.RegularImmutableMap.EntrySet.this.keyOffset ^ 1)]));
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                    return com.google.common.collect.RegularImmutableMap.EntrySet.this.size;
                }

                @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
                java.lang.Object writeReplace() {
                    return super.writeReplace();
                }
            };
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object object) {
            if (!(object instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) object;
            java.lang.Object key = entry.getKey();
            java.lang.Object value = entry.getValue();
            return value != null && value.equals(this.map.get(key));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.size;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        java.lang.Object writeReplace() {
            return super.writeReplace();
        }
    }

    @Override // com.google.common.collect.ImmutableMap
    com.google.common.collect.ImmutableSet<K> createKeySet() {
        return new com.google.common.collect.RegularImmutableMap.KeySet(this, new com.google.common.collect.RegularImmutableMap.KeysOrValuesAsList(this.alternatingKeysAndValues, 0, this.size));
    }

    static final class KeysOrValuesAsList extends com.google.common.collect.ImmutableList<java.lang.Object> {
        private final transient java.lang.Object[] alternatingKeysAndValues;
        private final transient int offset;
        private final transient int size;

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
            return true;
        }

        KeysOrValuesAsList(java.lang.Object[] alternatingKeysAndValues, int offset, int size) {
            this.alternatingKeysAndValues = alternatingKeysAndValues;
            this.offset = offset;
            this.size = size;
        }

        @Override // java.util.List
        public java.lang.Object get(int index) {
            com.google.common.base.Preconditions.checkElementIndex(index, this.size);
            return java.util.Objects.requireNonNull(this.alternatingKeysAndValues[(index * 2) + this.offset]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.size;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        java.lang.Object writeReplace() {
            return super.writeReplace();
        }
    }

    static final class KeySet<K> extends com.google.common.collect.ImmutableSet<K> {
        private final transient com.google.common.collect.ImmutableList<K> list;
        private final transient com.google.common.collect.ImmutableMap<K, ?> map;

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
            return true;
        }

        KeySet(com.google.common.collect.ImmutableMap<K, ?> map, com.google.common.collect.ImmutableList<K> list) {
            this.map = map;
            this.list = list;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public com.google.common.collect.UnmodifiableIterator<K> iterator() {
            return asList().iterator();
        }

        @Override // com.google.common.collect.ImmutableCollection
        int copyIntoArray(java.lang.Object[] dst, int offset) {
            return asList().copyIntoArray(dst, offset);
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public com.google.common.collect.ImmutableList<K> asList() {
            return this.list;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object object) {
            return this.map.get(object) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.map.size();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        java.lang.Object writeReplace() {
            return super.writeReplace();
        }
    }

    @Override // com.google.common.collect.ImmutableMap
    com.google.common.collect.ImmutableCollection<V> createValues() {
        return new com.google.common.collect.RegularImmutableMap.KeysOrValuesAsList(this.alternatingKeysAndValues, 1, this.size);
    }

    @Override // com.google.common.collect.ImmutableMap
    java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
