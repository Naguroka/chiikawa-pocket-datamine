package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public class LazyField extends androidx.datastore.preferences.protobuf.LazyFieldLite {
    private final androidx.datastore.preferences.protobuf.MessageLite defaultInstance;

    public LazyField(androidx.datastore.preferences.protobuf.MessageLite defaultInstance, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry, androidx.datastore.preferences.protobuf.ByteString bytes) {
        super(extensionRegistry, bytes);
        this.defaultInstance = defaultInstance;
    }

    @Override // androidx.datastore.preferences.protobuf.LazyFieldLite
    public boolean containsDefaultInstance() {
        return super.containsDefaultInstance() || this.value == this.defaultInstance;
    }

    public androidx.datastore.preferences.protobuf.MessageLite getValue() {
        return getValue(this.defaultInstance);
    }

    @Override // androidx.datastore.preferences.protobuf.LazyFieldLite
    public int hashCode() {
        return getValue().hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.LazyFieldLite
    public boolean equals(java.lang.Object obj) {
        return getValue().equals(obj);
    }

    public java.lang.String toString() {
        return getValue().toString();
    }

    static class LazyEntry<K> implements java.util.Map.Entry<K, java.lang.Object> {
        private java.util.Map.Entry<K, androidx.datastore.preferences.protobuf.LazyField> entry;

        private LazyEntry(java.util.Map.Entry<K, androidx.datastore.preferences.protobuf.LazyField> entry) {
            this.entry = entry;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.entry.getKey();
        }

        @Override // java.util.Map.Entry
        public java.lang.Object getValue() {
            androidx.datastore.preferences.protobuf.LazyField value = this.entry.getValue();
            if (value == null) {
                return null;
            }
            return value.getValue();
        }

        public androidx.datastore.preferences.protobuf.LazyField getField() {
            return this.entry.getValue();
        }

        @Override // java.util.Map.Entry
        public java.lang.Object setValue(java.lang.Object value) {
            if (!(value instanceof androidx.datastore.preferences.protobuf.MessageLite)) {
                throw new java.lang.IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            return this.entry.getValue().setValue((androidx.datastore.preferences.protobuf.MessageLite) value);
        }
    }

    static class LazyIterator<K> implements java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> {
        private java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> iterator;

        public LazyIterator(java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> iterator) {
            this.iterator = iterator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public java.util.Map.Entry<K, java.lang.Object> next() {
            java.util.Map.Entry<K, java.lang.Object> next = this.iterator.next();
            return next.getValue() instanceof androidx.datastore.preferences.protobuf.LazyField ? new androidx.datastore.preferences.protobuf.LazyField.LazyEntry(next) : next;
        }

        @Override // java.util.Iterator
        public void remove() {
            this.iterator.remove();
        }
    }
}
