package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes3.dex */
class ViewInfoStore {
    private static final boolean DEBUG = false;
    final androidx.collection.SimpleArrayMap<androidx.recyclerview.widget.RecyclerView.ViewHolder, androidx.recyclerview.widget.ViewInfoStore.InfoRecord> mLayoutHolderMap = new androidx.collection.SimpleArrayMap<>();
    final androidx.collection.LongSparseArray<androidx.recyclerview.widget.RecyclerView.ViewHolder> mOldChangedHolders = new androidx.collection.LongSparseArray<>();

    interface ProcessCallback {
        void processAppeared(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        void processDisappeared(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        void processPersistent(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        void unused(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder);
    }

    ViewInfoStore() {
    }

    void clear() {
        this.mLayoutHolderMap.clear();
        this.mOldChangedHolders.clear();
    }

    void addToPreLayout(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        androidx.recyclerview.widget.ViewInfoStore.InfoRecord infoRecordObtain = this.mLayoutHolderMap.get(viewHolder);
        if (infoRecordObtain == null) {
            infoRecordObtain = androidx.recyclerview.widget.ViewInfoStore.InfoRecord.obtain();
            this.mLayoutHolderMap.put(viewHolder, infoRecordObtain);
        }
        infoRecordObtain.preInfo = itemHolderInfo;
        infoRecordObtain.flags |= 4;
    }

    boolean isDisappearing(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        androidx.recyclerview.widget.ViewInfoStore.InfoRecord infoRecord = this.mLayoutHolderMap.get(viewHolder);
        return (infoRecord == null || (infoRecord.flags & 1) == 0) ? false : true;
    }

    androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo popFromPreLayout(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        return popFromLayoutStep(viewHolder, 4);
    }

    androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo popFromPostLayout(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        return popFromLayoutStep(viewHolder, 8);
    }

    private androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo popFromLayoutStep(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i) {
        androidx.recyclerview.widget.ViewInfoStore.InfoRecord infoRecordValueAt;
        androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo;
        int iIndexOfKey = this.mLayoutHolderMap.indexOfKey(viewHolder);
        if (iIndexOfKey < 0 || (infoRecordValueAt = this.mLayoutHolderMap.valueAt(iIndexOfKey)) == null || (infoRecordValueAt.flags & i) == 0) {
            return null;
        }
        infoRecordValueAt.flags &= ~i;
        if (i == 4) {
            itemHolderInfo = infoRecordValueAt.preInfo;
        } else if (i == 8) {
            itemHolderInfo = infoRecordValueAt.postInfo;
        } else {
            throw new java.lang.IllegalArgumentException("Must provide flag PRE or POST");
        }
        if ((infoRecordValueAt.flags & 12) == 0) {
            this.mLayoutHolderMap.removeAt(iIndexOfKey);
            androidx.recyclerview.widget.ViewInfoStore.InfoRecord.recycle(infoRecordValueAt);
        }
        return itemHolderInfo;
    }

    void addToOldChangeHolders(long j, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        this.mOldChangedHolders.put(j, viewHolder);
    }

    void addToAppearedInPreLayoutHolders(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        androidx.recyclerview.widget.ViewInfoStore.InfoRecord infoRecordObtain = this.mLayoutHolderMap.get(viewHolder);
        if (infoRecordObtain == null) {
            infoRecordObtain = androidx.recyclerview.widget.ViewInfoStore.InfoRecord.obtain();
            this.mLayoutHolderMap.put(viewHolder, infoRecordObtain);
        }
        infoRecordObtain.flags |= 2;
        infoRecordObtain.preInfo = itemHolderInfo;
    }

    boolean isInPreLayout(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        androidx.recyclerview.widget.ViewInfoStore.InfoRecord infoRecord = this.mLayoutHolderMap.get(viewHolder);
        return (infoRecord == null || (infoRecord.flags & 4) == 0) ? false : true;
    }

    androidx.recyclerview.widget.RecyclerView.ViewHolder getFromOldChangeHolders(long j) {
        return this.mOldChangedHolders.get(j);
    }

    void addToPostLayout(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        androidx.recyclerview.widget.ViewInfoStore.InfoRecord infoRecordObtain = this.mLayoutHolderMap.get(viewHolder);
        if (infoRecordObtain == null) {
            infoRecordObtain = androidx.recyclerview.widget.ViewInfoStore.InfoRecord.obtain();
            this.mLayoutHolderMap.put(viewHolder, infoRecordObtain);
        }
        infoRecordObtain.postInfo = itemHolderInfo;
        infoRecordObtain.flags |= 8;
    }

    void addToDisappearedInLayout(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        androidx.recyclerview.widget.ViewInfoStore.InfoRecord infoRecordObtain = this.mLayoutHolderMap.get(viewHolder);
        if (infoRecordObtain == null) {
            infoRecordObtain = androidx.recyclerview.widget.ViewInfoStore.InfoRecord.obtain();
            this.mLayoutHolderMap.put(viewHolder, infoRecordObtain);
        }
        infoRecordObtain.flags |= 1;
    }

    void removeFromDisappearedInLayout(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        androidx.recyclerview.widget.ViewInfoStore.InfoRecord infoRecord = this.mLayoutHolderMap.get(viewHolder);
        if (infoRecord == null) {
            return;
        }
        infoRecord.flags &= -2;
    }

    void process(androidx.recyclerview.widget.ViewInfoStore.ProcessCallback processCallback) {
        for (int size = this.mLayoutHolderMap.size() - 1; size >= 0; size--) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolderKeyAt = this.mLayoutHolderMap.keyAt(size);
            androidx.recyclerview.widget.ViewInfoStore.InfoRecord infoRecordRemoveAt = this.mLayoutHolderMap.removeAt(size);
            if ((infoRecordRemoveAt.flags & 3) == 3) {
                processCallback.unused(viewHolderKeyAt);
            } else if ((infoRecordRemoveAt.flags & 1) != 0) {
                if (infoRecordRemoveAt.preInfo == null) {
                    processCallback.unused(viewHolderKeyAt);
                } else {
                    processCallback.processDisappeared(viewHolderKeyAt, infoRecordRemoveAt.preInfo, infoRecordRemoveAt.postInfo);
                }
            } else if ((infoRecordRemoveAt.flags & 14) == 14) {
                processCallback.processAppeared(viewHolderKeyAt, infoRecordRemoveAt.preInfo, infoRecordRemoveAt.postInfo);
            } else if ((infoRecordRemoveAt.flags & 12) == 12) {
                processCallback.processPersistent(viewHolderKeyAt, infoRecordRemoveAt.preInfo, infoRecordRemoveAt.postInfo);
            } else if ((infoRecordRemoveAt.flags & 4) != 0) {
                processCallback.processDisappeared(viewHolderKeyAt, infoRecordRemoveAt.preInfo, null);
            } else if ((infoRecordRemoveAt.flags & 8) != 0) {
                processCallback.processAppeared(viewHolderKeyAt, infoRecordRemoveAt.preInfo, infoRecordRemoveAt.postInfo);
            } else {
                int i = infoRecordRemoveAt.flags;
            }
            androidx.recyclerview.widget.ViewInfoStore.InfoRecord.recycle(infoRecordRemoveAt);
        }
    }

    void removeViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        for (int size = this.mOldChangedHolders.size() - 1; size >= 0; size--) {
            if (viewHolder == this.mOldChangedHolders.valueAt(size)) {
                this.mOldChangedHolders.removeAt(size);
                break;
            }
        }
        androidx.recyclerview.widget.ViewInfoStore.InfoRecord infoRecordRemove = this.mLayoutHolderMap.remove(viewHolder);
        if (infoRecordRemove != null) {
            androidx.recyclerview.widget.ViewInfoStore.InfoRecord.recycle(infoRecordRemove);
        }
    }

    void onDetach() {
        androidx.recyclerview.widget.ViewInfoStore.InfoRecord.drainCache();
    }

    public void onViewDetached(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        removeFromDisappearedInLayout(viewHolder);
    }

    static class InfoRecord {
        static final int FLAG_APPEAR = 2;
        static final int FLAG_APPEAR_AND_DISAPPEAR = 3;
        static final int FLAG_APPEAR_PRE_AND_POST = 14;
        static final int FLAG_DISAPPEARED = 1;
        static final int FLAG_POST = 8;
        static final int FLAG_PRE = 4;
        static final int FLAG_PRE_AND_POST = 12;
        static androidx.core.util.Pools.Pool<androidx.recyclerview.widget.ViewInfoStore.InfoRecord> sPool = new androidx.core.util.Pools.SimplePool(20);
        int flags;
        androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo postInfo;
        androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo preInfo;

        private InfoRecord() {
        }

        static androidx.recyclerview.widget.ViewInfoStore.InfoRecord obtain() {
            androidx.recyclerview.widget.ViewInfoStore.InfoRecord infoRecordAcquire = sPool.acquire();
            return infoRecordAcquire == null ? new androidx.recyclerview.widget.ViewInfoStore.InfoRecord() : infoRecordAcquire;
        }

        static void recycle(androidx.recyclerview.widget.ViewInfoStore.InfoRecord infoRecord) {
            infoRecord.flags = 0;
            infoRecord.preInfo = null;
            infoRecord.postInfo = null;
            sPool.release(infoRecord);
        }

        static void drainCache() {
            while (sPool.acquire() != null) {
            }
        }
    }
}
