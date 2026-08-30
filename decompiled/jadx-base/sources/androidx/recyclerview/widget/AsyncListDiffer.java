package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes3.dex */
public class AsyncListDiffer<T> {
    private static final java.util.concurrent.Executor sMainThreadExecutor = new androidx.recyclerview.widget.AsyncListDiffer.MainThreadExecutor();
    final androidx.recyclerview.widget.AsyncDifferConfig<T> mConfig;
    private java.util.List<T> mList;
    private final java.util.List<androidx.recyclerview.widget.AsyncListDiffer.ListListener<T>> mListeners;
    java.util.concurrent.Executor mMainThreadExecutor;
    int mMaxScheduledGeneration;
    private java.util.List<T> mReadOnlyList;
    private final androidx.recyclerview.widget.ListUpdateCallback mUpdateCallback;

    public interface ListListener<T> {
        void onCurrentListChanged(java.util.List<T> list, java.util.List<T> list2);
    }

    private static class MainThreadExecutor implements java.util.concurrent.Executor {
        final android.os.Handler mHandler = new android.os.Handler(android.os.Looper.getMainLooper());

        MainThreadExecutor() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable runnable) {
            this.mHandler.post(runnable);
        }
    }

    public AsyncListDiffer(androidx.recyclerview.widget.RecyclerView.Adapter adapter, androidx.recyclerview.widget.DiffUtil.ItemCallback<T> itemCallback) {
        this(new androidx.recyclerview.widget.AdapterListUpdateCallback(adapter), new androidx.recyclerview.widget.AsyncDifferConfig.Builder(itemCallback).build());
    }

    public AsyncListDiffer(androidx.recyclerview.widget.ListUpdateCallback listUpdateCallback, androidx.recyclerview.widget.AsyncDifferConfig<T> asyncDifferConfig) {
        this.mListeners = new java.util.concurrent.CopyOnWriteArrayList();
        this.mReadOnlyList = java.util.Collections.emptyList();
        this.mUpdateCallback = listUpdateCallback;
        this.mConfig = asyncDifferConfig;
        if (asyncDifferConfig.getMainThreadExecutor() != null) {
            this.mMainThreadExecutor = asyncDifferConfig.getMainThreadExecutor();
        } else {
            this.mMainThreadExecutor = sMainThreadExecutor;
        }
    }

    public java.util.List<T> getCurrentList() {
        return this.mReadOnlyList;
    }

    public void submitList(java.util.List<T> list) {
        submitList(list, null);
    }

    public void submitList(final java.util.List<T> list, final java.lang.Runnable runnable) {
        final int i = this.mMaxScheduledGeneration + 1;
        this.mMaxScheduledGeneration = i;
        final java.util.List<T> list2 = this.mList;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        java.util.List<T> list3 = this.mReadOnlyList;
        if (list == null) {
            int size = list2.size();
            this.mList = null;
            this.mReadOnlyList = java.util.Collections.emptyList();
            this.mUpdateCallback.onRemoved(0, size);
            onCurrentListChanged(list3, runnable);
            return;
        }
        if (list2 == null) {
            this.mList = list;
            this.mReadOnlyList = java.util.Collections.unmodifiableList(list);
            this.mUpdateCallback.onInserted(0, list.size());
            onCurrentListChanged(list3, runnable);
            return;
        }
        this.mConfig.getBackgroundThreadExecutor().execute(new java.lang.Runnable() { // from class: androidx.recyclerview.widget.AsyncListDiffer.1
            @Override // java.lang.Runnable
            public void run() {
                final androidx.recyclerview.widget.DiffUtil.DiffResult diffResultCalculateDiff = androidx.recyclerview.widget.DiffUtil.calculateDiff(new androidx.recyclerview.widget.DiffUtil.Callback() { // from class: androidx.recyclerview.widget.AsyncListDiffer.1.1
                    @Override // androidx.recyclerview.widget.DiffUtil.Callback
                    public int getOldListSize() {
                        return list2.size();
                    }

                    @Override // androidx.recyclerview.widget.DiffUtil.Callback
                    public int getNewListSize() {
                        return list.size();
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // androidx.recyclerview.widget.DiffUtil.Callback
                    public boolean areItemsTheSame(int i2, int i3) {
                        java.lang.Object obj = list2.get(i2);
                        java.lang.Object obj2 = list.get(i3);
                        if (obj == null || obj2 == null) {
                            return obj == null && obj2 == null;
                        }
                        return androidx.recyclerview.widget.AsyncListDiffer.this.mConfig.getDiffCallback().areItemsTheSame(obj, obj2);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // androidx.recyclerview.widget.DiffUtil.Callback
                    public boolean areContentsTheSame(int i2, int i3) {
                        java.lang.Object obj = list2.get(i2);
                        java.lang.Object obj2 = list.get(i3);
                        if (obj != null && obj2 != null) {
                            return androidx.recyclerview.widget.AsyncListDiffer.this.mConfig.getDiffCallback().areContentsTheSame(obj, obj2);
                        }
                        if (obj == null && obj2 == null) {
                            return true;
                        }
                        throw new java.lang.AssertionError();
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // androidx.recyclerview.widget.DiffUtil.Callback
                    public java.lang.Object getChangePayload(int i2, int i3) {
                        java.lang.Object obj = list2.get(i2);
                        java.lang.Object obj2 = list.get(i3);
                        if (obj != null && obj2 != null) {
                            return androidx.recyclerview.widget.AsyncListDiffer.this.mConfig.getDiffCallback().getChangePayload(obj, obj2);
                        }
                        throw new java.lang.AssertionError();
                    }
                });
                androidx.recyclerview.widget.AsyncListDiffer.this.mMainThreadExecutor.execute(new java.lang.Runnable() { // from class: androidx.recyclerview.widget.AsyncListDiffer.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (androidx.recyclerview.widget.AsyncListDiffer.this.mMaxScheduledGeneration == i) {
                            androidx.recyclerview.widget.AsyncListDiffer.this.latchList(list, diffResultCalculateDiff, runnable);
                        }
                    }
                });
            }
        });
    }

    void latchList(java.util.List<T> list, androidx.recyclerview.widget.DiffUtil.DiffResult diffResult, java.lang.Runnable runnable) {
        java.util.List<T> list2 = this.mReadOnlyList;
        this.mList = list;
        this.mReadOnlyList = java.util.Collections.unmodifiableList(list);
        diffResult.dispatchUpdatesTo(this.mUpdateCallback);
        onCurrentListChanged(list2, runnable);
    }

    private void onCurrentListChanged(java.util.List<T> list, java.lang.Runnable runnable) {
        java.util.Iterator<androidx.recyclerview.widget.AsyncListDiffer.ListListener<T>> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().onCurrentListChanged(list, this.mReadOnlyList);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void addListListener(androidx.recyclerview.widget.AsyncListDiffer.ListListener<T> listListener) {
        this.mListeners.add(listListener);
    }

    public void removeListListener(androidx.recyclerview.widget.AsyncListDiffer.ListListener<T> listListener) {
        this.mListeners.remove(listListener);
    }
}
