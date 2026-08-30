package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public class LazyStringArrayList extends androidx.datastore.preferences.protobuf.AbstractProtobufList<java.lang.String> implements androidx.datastore.preferences.protobuf.LazyStringList, java.util.RandomAccess {

    @java.lang.Deprecated
    public static final androidx.datastore.preferences.protobuf.LazyStringList EMPTY;
    private static final androidx.datastore.preferences.protobuf.LazyStringArrayList EMPTY_LIST;
    private final java.util.List<java.lang.Object> list;

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(java.lang.Object o) {
        return super.equals(o);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, androidx.datastore.preferences.protobuf.Internal.ProtobufList
    public /* bridge */ /* synthetic */ boolean isModifiable() {
        return super.isModifiable();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(java.lang.Object o) {
        return super.remove(o);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(java.util.Collection c) {
        return super.removeAll(c);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(java.util.Collection c) {
        return super.retainAll(c);
    }

    static {
        androidx.datastore.preferences.protobuf.LazyStringArrayList lazyStringArrayList = new androidx.datastore.preferences.protobuf.LazyStringArrayList(false);
        EMPTY_LIST = lazyStringArrayList;
        EMPTY = lazyStringArrayList;
    }

    public static androidx.datastore.preferences.protobuf.LazyStringArrayList emptyList() {
        return EMPTY_LIST;
    }

    public LazyStringArrayList() {
        this(10);
    }

    private LazyStringArrayList(boolean isMutable) {
        super(isMutable);
        this.list = java.util.Collections.emptyList();
    }

    public LazyStringArrayList(int initialCapacity) {
        this((java.util.ArrayList<java.lang.Object>) new java.util.ArrayList(initialCapacity));
    }

    public LazyStringArrayList(androidx.datastore.preferences.protobuf.LazyStringList from) {
        this.list = new java.util.ArrayList(from.size());
        addAll(from);
    }

    public LazyStringArrayList(java.util.List<java.lang.String> from) {
        this((java.util.ArrayList<java.lang.Object>) new java.util.ArrayList(from));
    }

    private LazyStringArrayList(java.util.ArrayList<java.lang.Object> list) {
        this.list = list;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public androidx.datastore.preferences.protobuf.LazyStringArrayList mutableCopyWithCapacity2(int capacity) {
        if (capacity < size()) {
            throw new java.lang.IllegalArgumentException();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(capacity);
        arrayList.addAll(this.list);
        return new androidx.datastore.preferences.protobuf.LazyStringArrayList((java.util.ArrayList<java.lang.Object>) arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.String get(int index) {
        java.lang.Object obj = this.list.get(index);
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        if (obj instanceof androidx.datastore.preferences.protobuf.ByteString) {
            androidx.datastore.preferences.protobuf.ByteString byteString = (androidx.datastore.preferences.protobuf.ByteString) obj;
            java.lang.String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.list.set(index, stringUtf8);
            }
            return stringUtf8;
        }
        byte[] bArr = (byte[]) obj;
        java.lang.String stringUtf9 = androidx.datastore.preferences.protobuf.Internal.toStringUtf8(bArr);
        if (androidx.datastore.preferences.protobuf.Internal.isValidUtf8(bArr)) {
            this.list.set(index, stringUtf9);
        }
        return stringUtf9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.list.size();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public java.lang.String set(int index, java.lang.String s) {
        ensureIsMutable();
        return asString(this.list.set(index, s));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int index, java.lang.String element) {
        ensureIsMutable();
        this.list.add(index, element);
        this.modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void add(int index, androidx.datastore.preferences.protobuf.ByteString element) {
        ensureIsMutable();
        this.list.add(index, element);
        this.modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void add(int index, byte[] element) {
        ensureIsMutable();
        this.list.add(index, element);
        this.modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(java.lang.String element) {
        ensureIsMutable();
        this.list.add(element);
        this.modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public void add(androidx.datastore.preferences.protobuf.ByteString element) {
        ensureIsMutable();
        this.list.add(element);
        this.modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public void add(byte[] element) {
        ensureIsMutable();
        this.list.add(element);
        this.modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection<? extends java.lang.String> c) {
        return addAll(size(), c);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public boolean addAll(int index, java.util.Collection<? extends java.lang.String> c) {
        ensureIsMutable();
        if (c instanceof androidx.datastore.preferences.protobuf.LazyStringList) {
            c = ((androidx.datastore.preferences.protobuf.LazyStringList) c).getUnderlyingElements();
        }
        boolean zAddAll = this.list.addAll(index, c);
        this.modCount++;
        return zAddAll;
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public boolean addAllByteString(java.util.Collection<? extends androidx.datastore.preferences.protobuf.ByteString> values) {
        ensureIsMutable();
        boolean zAddAll = this.list.addAll(values);
        this.modCount++;
        return zAddAll;
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public boolean addAllByteArray(java.util.Collection<byte[]> c) {
        ensureIsMutable();
        boolean zAddAll = this.list.addAll(c);
        this.modCount++;
        return zAddAll;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public java.lang.String remove(int index) {
        ensureIsMutable();
        java.lang.Object objRemove = this.list.remove(index);
        this.modCount++;
        return asString(objRemove);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        ensureIsMutable();
        this.list.clear();
        this.modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public java.lang.Object getRaw(int index) {
        return this.list.get(index);
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public androidx.datastore.preferences.protobuf.ByteString getByteString(int index) {
        java.lang.Object obj = this.list.get(index);
        androidx.datastore.preferences.protobuf.ByteString byteStringAsByteString = asByteString(obj);
        if (byteStringAsByteString != obj) {
            this.list.set(index, byteStringAsByteString);
        }
        return byteStringAsByteString;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public byte[] getByteArray(int i) {
        java.lang.Object obj = this.list.get(i);
        byte[] bArrAsByteArray = asByteArray(obj);
        if (bArrAsByteArray != obj) {
            this.list.set(i, bArrAsByteArray);
        }
        return bArrAsByteArray;
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public void set(int index, androidx.datastore.preferences.protobuf.ByteString s) {
        setAndReturn(index, s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.Object setAndReturn(int index, androidx.datastore.preferences.protobuf.ByteString s) {
        ensureIsMutable();
        return this.list.set(index, s);
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public void set(int index, byte[] s) {
        setAndReturn(index, s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.Object setAndReturn(int index, byte[] s) {
        ensureIsMutable();
        return this.list.set(index, s);
    }

    private static java.lang.String asString(java.lang.Object o) {
        if (o instanceof java.lang.String) {
            return (java.lang.String) o;
        }
        if (o instanceof androidx.datastore.preferences.protobuf.ByteString) {
            return ((androidx.datastore.preferences.protobuf.ByteString) o).toStringUtf8();
        }
        return androidx.datastore.preferences.protobuf.Internal.toStringUtf8((byte[]) o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static androidx.datastore.preferences.protobuf.ByteString asByteString(java.lang.Object o) {
        if (o instanceof androidx.datastore.preferences.protobuf.ByteString) {
            return (androidx.datastore.preferences.protobuf.ByteString) o;
        }
        if (o instanceof java.lang.String) {
            return androidx.datastore.preferences.protobuf.ByteString.copyFromUtf8((java.lang.String) o);
        }
        return androidx.datastore.preferences.protobuf.ByteString.copyFrom((byte[]) o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] asByteArray(java.lang.Object o) {
        if (o instanceof byte[]) {
            return (byte[]) o;
        }
        if (o instanceof java.lang.String) {
            return androidx.datastore.preferences.protobuf.Internal.toByteArray((java.lang.String) o);
        }
        return ((androidx.datastore.preferences.protobuf.ByteString) o).toByteArray();
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public java.util.List<?> getUnderlyingElements() {
        return java.util.Collections.unmodifiableList(this.list);
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public void mergeFrom(androidx.datastore.preferences.protobuf.LazyStringList other) {
        ensureIsMutable();
        for (java.lang.Object obj : other.getUnderlyingElements()) {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                this.list.add(java.util.Arrays.copyOf(bArr, bArr.length));
            } else {
                this.list.add(obj);
            }
        }
    }

    private static class ByteArrayListView extends java.util.AbstractList<byte[]> implements java.util.RandomAccess {
        private final androidx.datastore.preferences.protobuf.LazyStringArrayList list;

        ByteArrayListView(androidx.datastore.preferences.protobuf.LazyStringArrayList list) {
            this.list = list;
        }

        @Override // java.util.AbstractList, java.util.List
        public byte[] get(int index) {
            return this.list.getByteArray(index);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.list.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public byte[] set(int index, byte[] s) {
            java.lang.Object andReturn = this.list.setAndReturn(index, s);
            this.modCount++;
            return androidx.datastore.preferences.protobuf.LazyStringArrayList.asByteArray(andReturn);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int index, byte[] s) {
            this.list.add(index, s);
            this.modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        public byte[] remove(int index) {
            java.lang.String strRemove = this.list.remove(index);
            this.modCount++;
            return androidx.datastore.preferences.protobuf.LazyStringArrayList.asByteArray(strRemove);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public java.util.List<byte[]> asByteArrayList() {
        return new androidx.datastore.preferences.protobuf.LazyStringArrayList.ByteArrayListView(this);
    }

    private static class ByteStringListView extends java.util.AbstractList<androidx.datastore.preferences.protobuf.ByteString> implements java.util.RandomAccess {
        private final androidx.datastore.preferences.protobuf.LazyStringArrayList list;

        ByteStringListView(androidx.datastore.preferences.protobuf.LazyStringArrayList list) {
            this.list = list;
        }

        @Override // java.util.AbstractList, java.util.List
        public androidx.datastore.preferences.protobuf.ByteString get(int index) {
            return this.list.getByteString(index);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.list.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public androidx.datastore.preferences.protobuf.ByteString set(int index, androidx.datastore.preferences.protobuf.ByteString s) {
            java.lang.Object andReturn = this.list.setAndReturn(index, s);
            this.modCount++;
            return androidx.datastore.preferences.protobuf.LazyStringArrayList.asByteString(andReturn);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int index, androidx.datastore.preferences.protobuf.ByteString s) {
            this.list.add(index, s);
            this.modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        public androidx.datastore.preferences.protobuf.ByteString remove(int index) {
            java.lang.String strRemove = this.list.remove(index);
            this.modCount++;
            return androidx.datastore.preferences.protobuf.LazyStringArrayList.asByteString(strRemove);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.ProtocolStringList
    public java.util.List<androidx.datastore.preferences.protobuf.ByteString> asByteStringList() {
        return new androidx.datastore.preferences.protobuf.LazyStringArrayList.ByteStringListView(this);
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public androidx.datastore.preferences.protobuf.LazyStringList getUnmodifiableView() {
        return isModifiable() ? new androidx.datastore.preferences.protobuf.UnmodifiableLazyStringList(this) : this;
    }
}
