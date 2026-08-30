package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes3.dex */
interface ViewTypeStorage {

    public interface ViewTypeLookup {
        void dispose();

        int globalToLocal(int i);

        int localToGlobal(int i);
    }

    androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup createViewTypeWrapper(androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper);

    androidx.recyclerview.widget.NestedAdapterWrapper getWrapperForGlobalType(int i);

    public static class SharedIdRangeViewTypeStorage implements androidx.recyclerview.widget.ViewTypeStorage {
        android.util.SparseArray<java.util.List<androidx.recyclerview.widget.NestedAdapterWrapper>> mGlobalTypeToWrapper = new android.util.SparseArray<>();

        @Override // androidx.recyclerview.widget.ViewTypeStorage
        public androidx.recyclerview.widget.NestedAdapterWrapper getWrapperForGlobalType(int i) {
            java.util.List<androidx.recyclerview.widget.NestedAdapterWrapper> list = this.mGlobalTypeToWrapper.get(i);
            if (list == null || list.isEmpty()) {
                throw new java.lang.IllegalArgumentException("Cannot find the wrapper for global view type " + i);
            }
            return list.get(0);
        }

        @Override // androidx.recyclerview.widget.ViewTypeStorage
        public androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup createViewTypeWrapper(androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper) {
            return new androidx.recyclerview.widget.ViewTypeStorage.SharedIdRangeViewTypeStorage.WrapperViewTypeLookup(nestedAdapterWrapper);
        }

        void removeWrapper(androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper) {
            for (int size = this.mGlobalTypeToWrapper.size() - 1; size >= 0; size--) {
                java.util.List<androidx.recyclerview.widget.NestedAdapterWrapper> listValueAt = this.mGlobalTypeToWrapper.valueAt(size);
                if (listValueAt.remove(nestedAdapterWrapper) && listValueAt.isEmpty()) {
                    this.mGlobalTypeToWrapper.removeAt(size);
                }
            }
        }

        class WrapperViewTypeLookup implements androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup {
            final androidx.recyclerview.widget.NestedAdapterWrapper mWrapper;

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public int globalToLocal(int i) {
                return i;
            }

            WrapperViewTypeLookup(androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper) {
                this.mWrapper = nestedAdapterWrapper;
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public int localToGlobal(int i) {
                java.util.List<androidx.recyclerview.widget.NestedAdapterWrapper> arrayList = androidx.recyclerview.widget.ViewTypeStorage.SharedIdRangeViewTypeStorage.this.mGlobalTypeToWrapper.get(i);
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList<>();
                    androidx.recyclerview.widget.ViewTypeStorage.SharedIdRangeViewTypeStorage.this.mGlobalTypeToWrapper.put(i, arrayList);
                }
                if (!arrayList.contains(this.mWrapper)) {
                    arrayList.add(this.mWrapper);
                }
                return i;
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public void dispose() {
                androidx.recyclerview.widget.ViewTypeStorage.SharedIdRangeViewTypeStorage.this.removeWrapper(this.mWrapper);
            }
        }
    }

    public static class IsolatedViewTypeStorage implements androidx.recyclerview.widget.ViewTypeStorage {
        android.util.SparseArray<androidx.recyclerview.widget.NestedAdapterWrapper> mGlobalTypeToWrapper = new android.util.SparseArray<>();
        int mNextViewType = 0;

        int obtainViewType(androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper) {
            int i = this.mNextViewType;
            this.mNextViewType = i + 1;
            this.mGlobalTypeToWrapper.put(i, nestedAdapterWrapper);
            return i;
        }

        @Override // androidx.recyclerview.widget.ViewTypeStorage
        public androidx.recyclerview.widget.NestedAdapterWrapper getWrapperForGlobalType(int i) {
            androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper = this.mGlobalTypeToWrapper.get(i);
            if (nestedAdapterWrapper != null) {
                return nestedAdapterWrapper;
            }
            throw new java.lang.IllegalArgumentException("Cannot find the wrapper for global view type " + i);
        }

        @Override // androidx.recyclerview.widget.ViewTypeStorage
        public androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup createViewTypeWrapper(androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper) {
            return new androidx.recyclerview.widget.ViewTypeStorage.IsolatedViewTypeStorage.WrapperViewTypeLookup(nestedAdapterWrapper);
        }

        void removeWrapper(androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper) {
            for (int size = this.mGlobalTypeToWrapper.size() - 1; size >= 0; size--) {
                if (this.mGlobalTypeToWrapper.valueAt(size) == nestedAdapterWrapper) {
                    this.mGlobalTypeToWrapper.removeAt(size);
                }
            }
        }

        class WrapperViewTypeLookup implements androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup {
            final androidx.recyclerview.widget.NestedAdapterWrapper mWrapper;
            private android.util.SparseIntArray mLocalToGlobalMapping = new android.util.SparseIntArray(1);
            private android.util.SparseIntArray mGlobalToLocalMapping = new android.util.SparseIntArray(1);

            WrapperViewTypeLookup(androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper) {
                this.mWrapper = nestedAdapterWrapper;
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public int localToGlobal(int i) {
                int iIndexOfKey = this.mLocalToGlobalMapping.indexOfKey(i);
                if (iIndexOfKey > -1) {
                    return this.mLocalToGlobalMapping.valueAt(iIndexOfKey);
                }
                int iObtainViewType = androidx.recyclerview.widget.ViewTypeStorage.IsolatedViewTypeStorage.this.obtainViewType(this.mWrapper);
                this.mLocalToGlobalMapping.put(i, iObtainViewType);
                this.mGlobalToLocalMapping.put(iObtainViewType, i);
                return iObtainViewType;
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public int globalToLocal(int i) {
                int iIndexOfKey = this.mGlobalToLocalMapping.indexOfKey(i);
                if (iIndexOfKey < 0) {
                    throw new java.lang.IllegalStateException("requested global type " + i + " does not belong to the adapter:" + this.mWrapper.adapter);
                }
                return this.mGlobalToLocalMapping.valueAt(iIndexOfKey);
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public void dispose() {
                androidx.recyclerview.widget.ViewTypeStorage.IsolatedViewTypeStorage.this.removeWrapper(this.mWrapper);
            }
        }
    }
}
