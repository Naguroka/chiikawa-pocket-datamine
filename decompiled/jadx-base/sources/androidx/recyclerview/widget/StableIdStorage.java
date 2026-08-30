package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes3.dex */
interface StableIdStorage {

    public interface StableIdLookup {
        long localToGlobal(long j);
    }

    androidx.recyclerview.widget.StableIdStorage.StableIdLookup createStableIdLookup();

    public static class NoStableIdStorage implements androidx.recyclerview.widget.StableIdStorage {
        private final androidx.recyclerview.widget.StableIdStorage.StableIdLookup mNoIdLookup = new androidx.recyclerview.widget.StableIdStorage.StableIdLookup() { // from class: androidx.recyclerview.widget.StableIdStorage.NoStableIdStorage.1
            @Override // androidx.recyclerview.widget.StableIdStorage.StableIdLookup
            public long localToGlobal(long j) {
                return -1L;
            }
        };

        @Override // androidx.recyclerview.widget.StableIdStorage
        public androidx.recyclerview.widget.StableIdStorage.StableIdLookup createStableIdLookup() {
            return this.mNoIdLookup;
        }
    }

    public static class SharedPoolStableIdStorage implements androidx.recyclerview.widget.StableIdStorage {
        private final androidx.recyclerview.widget.StableIdStorage.StableIdLookup mSameIdLookup = new androidx.recyclerview.widget.StableIdStorage.StableIdLookup() { // from class: androidx.recyclerview.widget.StableIdStorage.SharedPoolStableIdStorage.1
            @Override // androidx.recyclerview.widget.StableIdStorage.StableIdLookup
            public long localToGlobal(long j) {
                return j;
            }
        };

        @Override // androidx.recyclerview.widget.StableIdStorage
        public androidx.recyclerview.widget.StableIdStorage.StableIdLookup createStableIdLookup() {
            return this.mSameIdLookup;
        }
    }

    public static class IsolatedStableIdStorage implements androidx.recyclerview.widget.StableIdStorage {
        long mNextStableId = 0;

        long obtainId() {
            long j = this.mNextStableId;
            this.mNextStableId = 1 + j;
            return j;
        }

        @Override // androidx.recyclerview.widget.StableIdStorage
        public androidx.recyclerview.widget.StableIdStorage.StableIdLookup createStableIdLookup() {
            return new androidx.recyclerview.widget.StableIdStorage.IsolatedStableIdStorage.WrapperStableIdLookup();
        }

        class WrapperStableIdLookup implements androidx.recyclerview.widget.StableIdStorage.StableIdLookup {
            private final androidx.collection.LongSparseArray<java.lang.Long> mLocalToGlobalLookup = new androidx.collection.LongSparseArray<>();

            WrapperStableIdLookup() {
            }

            @Override // androidx.recyclerview.widget.StableIdStorage.StableIdLookup
            public long localToGlobal(long j) {
                java.lang.Long lValueOf = this.mLocalToGlobalLookup.get(j);
                if (lValueOf == null) {
                    lValueOf = java.lang.Long.valueOf(androidx.recyclerview.widget.StableIdStorage.IsolatedStableIdStorage.this.obtainId());
                    this.mLocalToGlobalLookup.put(j, lValueOf);
                }
                return lValueOf.longValue();
            }
        }
    }
}
