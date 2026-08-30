package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes3.dex */
final class AdapterHelper implements androidx.recyclerview.widget.OpReorderer.Callback {
    private static final boolean DEBUG = false;
    static final int POSITION_TYPE_INVISIBLE = 0;
    static final int POSITION_TYPE_NEW_OR_LAID_OUT = 1;
    private static final java.lang.String TAG = "AHT";
    final androidx.recyclerview.widget.AdapterHelper.Callback mCallback;
    final boolean mDisableRecycler;
    private int mExistingUpdateTypes;
    java.lang.Runnable mOnItemProcessedCallback;
    final androidx.recyclerview.widget.OpReorderer mOpReorderer;
    final java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper.UpdateOp> mPendingUpdates;
    final java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper.UpdateOp> mPostponedList;
    private androidx.core.util.Pools.Pool<androidx.recyclerview.widget.AdapterHelper.UpdateOp> mUpdateOpPool;

    interface Callback {
        androidx.recyclerview.widget.RecyclerView.ViewHolder findViewHolder(int i);

        void markViewHoldersUpdated(int i, int i2, java.lang.Object obj);

        void offsetPositionsForAdd(int i, int i2);

        void offsetPositionsForMove(int i, int i2);

        void offsetPositionsForRemovingInvisible(int i, int i2);

        void offsetPositionsForRemovingLaidOutOrNewView(int i, int i2);

        void onDispatchFirstPass(androidx.recyclerview.widget.AdapterHelper.UpdateOp updateOp);

        void onDispatchSecondPass(androidx.recyclerview.widget.AdapterHelper.UpdateOp updateOp);
    }

    AdapterHelper(androidx.recyclerview.widget.AdapterHelper.Callback callback) {
        this(callback, false);
    }

    AdapterHelper(androidx.recyclerview.widget.AdapterHelper.Callback callback, boolean z) {
        this.mUpdateOpPool = new androidx.core.util.Pools.SimplePool(30);
        this.mPendingUpdates = new java.util.ArrayList<>();
        this.mPostponedList = new java.util.ArrayList<>();
        this.mExistingUpdateTypes = 0;
        this.mCallback = callback;
        this.mDisableRecycler = z;
        this.mOpReorderer = new androidx.recyclerview.widget.OpReorderer(this);
    }

    androidx.recyclerview.widget.AdapterHelper addUpdateOp(androidx.recyclerview.widget.AdapterHelper.UpdateOp... updateOpArr) {
        java.util.Collections.addAll(this.mPendingUpdates, updateOpArr);
        return this;
    }

    void reset() {
        recycleUpdateOpsAndClearList(this.mPendingUpdates);
        recycleUpdateOpsAndClearList(this.mPostponedList);
        this.mExistingUpdateTypes = 0;
    }

    void preProcess() {
        this.mOpReorderer.reorderOps(this.mPendingUpdates);
        int size = this.mPendingUpdates.size();
        for (int i = 0; i < size; i++) {
            androidx.recyclerview.widget.AdapterHelper.UpdateOp updateOp = this.mPendingUpdates.get(i);
            int i2 = updateOp.cmd;
            if (i2 == 1) {
                applyAdd(updateOp);
            } else if (i2 == 2) {
                applyRemove(updateOp);
            } else if (i2 == 4) {
                applyUpdate(updateOp);
            } else if (i2 == 8) {
                applyMove(updateOp);
            }
            java.lang.Runnable runnable = this.mOnItemProcessedCallback;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.mPendingUpdates.clear();
    }

    void consumePostponedUpdates() {
        int size = this.mPostponedList.size();
        for (int i = 0; i < size; i++) {
            this.mCallback.onDispatchSecondPass(this.mPostponedList.get(i));
        }
        recycleUpdateOpsAndClearList(this.mPostponedList);
        this.mExistingUpdateTypes = 0;
    }

    private void applyMove(androidx.recyclerview.widget.AdapterHelper.UpdateOp updateOp) {
        postponeAndUpdateViewHolders(updateOp);
    }

    private void applyRemove(androidx.recyclerview.widget.AdapterHelper.UpdateOp updateOp) {
        boolean z;
        byte b;
        int i = updateOp.positionStart;
        int i2 = updateOp.positionStart + updateOp.itemCount;
        int i3 = updateOp.positionStart;
        byte b2 = -1;
        int i4 = 0;
        while (i3 < i2) {
            if (this.mCallback.findViewHolder(i3) != null || canFindInPreLayout(i3)) {
                if (b2 == 0) {
                    dispatchAndUpdateViewHolders(obtainUpdateOp(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                b = 1;
            } else {
                if (b2 == 1) {
                    postponeAndUpdateViewHolders(obtainUpdateOp(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                b = 0;
            }
            if (z) {
                i3 -= i4;
                i2 -= i4;
                i4 = 1;
            } else {
                i4++;
            }
            i3++;
            b2 = b;
        }
        if (i4 != updateOp.itemCount) {
            recycleUpdateOp(updateOp);
            updateOp = obtainUpdateOp(2, i, i4, null);
        }
        if (b2 == 0) {
            dispatchAndUpdateViewHolders(updateOp);
        } else {
            postponeAndUpdateViewHolders(updateOp);
        }
    }

    private void applyUpdate(androidx.recyclerview.widget.AdapterHelper.UpdateOp updateOp) {
        int i = updateOp.positionStart;
        int i2 = updateOp.positionStart + updateOp.itemCount;
        byte b = -1;
        int i3 = 0;
        for (int i4 = updateOp.positionStart; i4 < i2; i4++) {
            if (this.mCallback.findViewHolder(i4) != null || canFindInPreLayout(i4)) {
                if (b == 0) {
                    dispatchAndUpdateViewHolders(obtainUpdateOp(4, i, i3, updateOp.payload));
                    i = i4;
                    i3 = 0;
                }
                b = 1;
            } else {
                if (b == 1) {
                    postponeAndUpdateViewHolders(obtainUpdateOp(4, i, i3, updateOp.payload));
                    i = i4;
                    i3 = 0;
                }
                b = 0;
            }
            i3++;
        }
        if (i3 != updateOp.itemCount) {
            java.lang.Object obj = updateOp.payload;
            recycleUpdateOp(updateOp);
            updateOp = obtainUpdateOp(4, i, i3, obj);
        }
        if (b == 0) {
            dispatchAndUpdateViewHolders(updateOp);
        } else {
            postponeAndUpdateViewHolders(updateOp);
        }
    }

    private void dispatchAndUpdateViewHolders(androidx.recyclerview.widget.AdapterHelper.UpdateOp updateOp) {
        int i;
        if (updateOp.cmd == 1 || updateOp.cmd == 8) {
            throw new java.lang.IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iUpdatePositionWithPostponed = updatePositionWithPostponed(updateOp.positionStart, updateOp.cmd);
        int i2 = updateOp.positionStart;
        int i3 = updateOp.cmd;
        if (i3 == 2) {
            i = 0;
        } else {
            if (i3 != 4) {
                throw new java.lang.IllegalArgumentException("op should be remove or update." + updateOp);
            }
            i = 1;
        }
        int i4 = 1;
        for (int i5 = 1; i5 < updateOp.itemCount; i5++) {
            int iUpdatePositionWithPostponed2 = updatePositionWithPostponed(updateOp.positionStart + (i * i5), updateOp.cmd);
            int i6 = updateOp.cmd;
            if (i6 == 2 ? iUpdatePositionWithPostponed2 == iUpdatePositionWithPostponed : i6 == 4 && iUpdatePositionWithPostponed2 == iUpdatePositionWithPostponed + 1) {
                i4++;
            } else {
                androidx.recyclerview.widget.AdapterHelper.UpdateOp updateOpObtainUpdateOp = obtainUpdateOp(updateOp.cmd, iUpdatePositionWithPostponed, i4, updateOp.payload);
                dispatchFirstPassAndUpdateViewHolders(updateOpObtainUpdateOp, i2);
                recycleUpdateOp(updateOpObtainUpdateOp);
                if (updateOp.cmd == 4) {
                    i2 += i4;
                }
                i4 = 1;
                iUpdatePositionWithPostponed = iUpdatePositionWithPostponed2;
            }
        }
        java.lang.Object obj = updateOp.payload;
        recycleUpdateOp(updateOp);
        if (i4 > 0) {
            androidx.recyclerview.widget.AdapterHelper.UpdateOp updateOpObtainUpdateOp2 = obtainUpdateOp(updateOp.cmd, iUpdatePositionWithPostponed, i4, obj);
            dispatchFirstPassAndUpdateViewHolders(updateOpObtainUpdateOp2, i2);
            recycleUpdateOp(updateOpObtainUpdateOp2);
        }
    }

    void dispatchFirstPassAndUpdateViewHolders(androidx.recyclerview.widget.AdapterHelper.UpdateOp updateOp, int i) {
        this.mCallback.onDispatchFirstPass(updateOp);
        int i2 = updateOp.cmd;
        if (i2 == 2) {
            this.mCallback.offsetPositionsForRemovingInvisible(i, updateOp.itemCount);
        } else {
            if (i2 == 4) {
                this.mCallback.markViewHoldersUpdated(i, updateOp.itemCount, updateOp.payload);
                return;
            }
            throw new java.lang.IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    private int updatePositionWithPostponed(int i, int i2) {
        int i3;
        int i4;
        for (int size = this.mPostponedList.size() - 1; size >= 0; size--) {
            androidx.recyclerview.widget.AdapterHelper.UpdateOp updateOp = this.mPostponedList.get(size);
            if (updateOp.cmd == 8) {
                if (updateOp.positionStart < updateOp.itemCount) {
                    i3 = updateOp.positionStart;
                    i4 = updateOp.itemCount;
                } else {
                    i3 = updateOp.itemCount;
                    i4 = updateOp.positionStart;
                }
                if (i >= i3 && i <= i4) {
                    if (i3 == updateOp.positionStart) {
                        if (i2 == 1) {
                            updateOp.itemCount++;
                        } else if (i2 == 2) {
                            updateOp.itemCount--;
                        }
                        i++;
                    } else {
                        if (i2 == 1) {
                            updateOp.positionStart++;
                        } else if (i2 == 2) {
                            updateOp.positionStart--;
                        }
                        i--;
                    }
                } else if (i < updateOp.positionStart) {
                    if (i2 == 1) {
                        updateOp.positionStart++;
                        updateOp.itemCount++;
                    } else if (i2 == 2) {
                        updateOp.positionStart--;
                        updateOp.itemCount--;
                    }
                }
            } else if (updateOp.positionStart <= i) {
                if (updateOp.cmd == 1) {
                    i -= updateOp.itemCount;
                } else if (updateOp.cmd == 2) {
                    i += updateOp.itemCount;
                }
            } else if (i2 == 1) {
                updateOp.positionStart++;
            } else if (i2 == 2) {
                updateOp.positionStart--;
            }
        }
        for (int size2 = this.mPostponedList.size() - 1; size2 >= 0; size2--) {
            androidx.recyclerview.widget.AdapterHelper.UpdateOp updateOp2 = this.mPostponedList.get(size2);
            if (updateOp2.cmd == 8) {
                if (updateOp2.itemCount == updateOp2.positionStart || updateOp2.itemCount < 0) {
                    this.mPostponedList.remove(size2);
                    recycleUpdateOp(updateOp2);
                }
            } else if (updateOp2.itemCount <= 0) {
                this.mPostponedList.remove(size2);
                recycleUpdateOp(updateOp2);
            }
        }
        return i;
    }

    private boolean canFindInPreLayout(int i) {
        int size = this.mPostponedList.size();
        for (int i2 = 0; i2 < size; i2++) {
            androidx.recyclerview.widget.AdapterHelper.UpdateOp updateOp = this.mPostponedList.get(i2);
            if (updateOp.cmd == 8) {
                if (findPositionOffset(updateOp.itemCount, i2 + 1) == i) {
                    return true;
                }
            } else if (updateOp.cmd == 1) {
                int i3 = updateOp.positionStart + updateOp.itemCount;
                for (int i4 = updateOp.positionStart; i4 < i3; i4++) {
                    if (findPositionOffset(i4, i2 + 1) == i) {
                        return true;
                    }
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private void applyAdd(androidx.recyclerview.widget.AdapterHelper.UpdateOp updateOp) {
        postponeAndUpdateViewHolders(updateOp);
    }

    private void postponeAndUpdateViewHolders(androidx.recyclerview.widget.AdapterHelper.UpdateOp updateOp) {
        this.mPostponedList.add(updateOp);
        int i = updateOp.cmd;
        if (i == 1) {
            this.mCallback.offsetPositionsForAdd(updateOp.positionStart, updateOp.itemCount);
            return;
        }
        if (i == 2) {
            this.mCallback.offsetPositionsForRemovingLaidOutOrNewView(updateOp.positionStart, updateOp.itemCount);
        } else if (i == 4) {
            this.mCallback.markViewHoldersUpdated(updateOp.positionStart, updateOp.itemCount, updateOp.payload);
        } else {
            if (i == 8) {
                this.mCallback.offsetPositionsForMove(updateOp.positionStart, updateOp.itemCount);
                return;
            }
            throw new java.lang.IllegalArgumentException("Unknown update op type for " + updateOp);
        }
    }

    boolean hasPendingUpdates() {
        return this.mPendingUpdates.size() > 0;
    }

    boolean hasAnyUpdateTypes(int i) {
        return (i & this.mExistingUpdateTypes) != 0;
    }

    int findPositionOffset(int i) {
        return findPositionOffset(i, 0);
    }

    int findPositionOffset(int i, int i2) {
        int size = this.mPostponedList.size();
        while (i2 < size) {
            androidx.recyclerview.widget.AdapterHelper.UpdateOp updateOp = this.mPostponedList.get(i2);
            if (updateOp.cmd == 8) {
                if (updateOp.positionStart == i) {
                    i = updateOp.itemCount;
                } else {
                    if (updateOp.positionStart < i) {
                        i--;
                    }
                    if (updateOp.itemCount <= i) {
                        i++;
                    }
                }
            } else if (updateOp.positionStart > i) {
                continue;
            } else if (updateOp.cmd == 2) {
                if (i < updateOp.positionStart + updateOp.itemCount) {
                    return -1;
                }
                i -= updateOp.itemCount;
            } else if (updateOp.cmd == 1) {
                i += updateOp.itemCount;
            }
            i2++;
        }
        return i;
    }

    boolean onItemRangeChanged(int i, int i2, java.lang.Object obj) {
        if (i2 < 1) {
            return false;
        }
        this.mPendingUpdates.add(obtainUpdateOp(4, i, i2, obj));
        this.mExistingUpdateTypes |= 4;
        return this.mPendingUpdates.size() == 1;
    }

    boolean onItemRangeInserted(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.mPendingUpdates.add(obtainUpdateOp(1, i, i2, null));
        this.mExistingUpdateTypes |= 1;
        return this.mPendingUpdates.size() == 1;
    }

    boolean onItemRangeRemoved(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.mPendingUpdates.add(obtainUpdateOp(2, i, i2, null));
        this.mExistingUpdateTypes |= 2;
        return this.mPendingUpdates.size() == 1;
    }

    boolean onItemRangeMoved(int i, int i2, int i3) {
        if (i == i2) {
            return false;
        }
        if (i3 != 1) {
            throw new java.lang.IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.mPendingUpdates.add(obtainUpdateOp(8, i, i2, null));
        this.mExistingUpdateTypes |= 8;
        return this.mPendingUpdates.size() == 1;
    }

    void consumeUpdatesInOnePass() {
        consumePostponedUpdates();
        int size = this.mPendingUpdates.size();
        for (int i = 0; i < size; i++) {
            androidx.recyclerview.widget.AdapterHelper.UpdateOp updateOp = this.mPendingUpdates.get(i);
            int i2 = updateOp.cmd;
            if (i2 == 1) {
                this.mCallback.onDispatchSecondPass(updateOp);
                this.mCallback.offsetPositionsForAdd(updateOp.positionStart, updateOp.itemCount);
            } else if (i2 == 2) {
                this.mCallback.onDispatchSecondPass(updateOp);
                this.mCallback.offsetPositionsForRemovingInvisible(updateOp.positionStart, updateOp.itemCount);
            } else if (i2 == 4) {
                this.mCallback.onDispatchSecondPass(updateOp);
                this.mCallback.markViewHoldersUpdated(updateOp.positionStart, updateOp.itemCount, updateOp.payload);
            } else if (i2 == 8) {
                this.mCallback.onDispatchSecondPass(updateOp);
                this.mCallback.offsetPositionsForMove(updateOp.positionStart, updateOp.itemCount);
            }
            java.lang.Runnable runnable = this.mOnItemProcessedCallback;
            if (runnable != null) {
                runnable.run();
            }
        }
        recycleUpdateOpsAndClearList(this.mPendingUpdates);
        this.mExistingUpdateTypes = 0;
    }

    public int applyPendingUpdatesToPosition(int i) {
        int size = this.mPendingUpdates.size();
        for (int i2 = 0; i2 < size; i2++) {
            androidx.recyclerview.widget.AdapterHelper.UpdateOp updateOp = this.mPendingUpdates.get(i2);
            int i3 = updateOp.cmd;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 8) {
                        if (updateOp.positionStart == i) {
                            i = updateOp.itemCount;
                        } else {
                            if (updateOp.positionStart < i) {
                                i--;
                            }
                            if (updateOp.itemCount <= i) {
                                i++;
                            }
                        }
                    }
                } else if (updateOp.positionStart > i) {
                    continue;
                } else {
                    if (updateOp.positionStart + updateOp.itemCount > i) {
                        return -1;
                    }
                    i -= updateOp.itemCount;
                }
            } else if (updateOp.positionStart <= i) {
                i += updateOp.itemCount;
            }
        }
        return i;
    }

    boolean hasUpdates() {
        return (this.mPostponedList.isEmpty() || this.mPendingUpdates.isEmpty()) ? false : true;
    }

    static final class UpdateOp {
        static final int ADD = 1;
        static final int MOVE = 8;
        static final int POOL_SIZE = 30;
        static final int REMOVE = 2;
        static final int UPDATE = 4;
        int cmd;
        int itemCount;
        java.lang.Object payload;
        int positionStart;

        UpdateOp(int i, int i2, int i3, java.lang.Object obj) {
            this.cmd = i;
            this.positionStart = i2;
            this.itemCount = i3;
            this.payload = obj;
        }

        java.lang.String cmdToString() {
            int i = this.cmd;
            if (i == 1) {
                return "add";
            }
            if (i == 2) {
                return "rm";
            }
            if (i != 4) {
                return i != 8 ? "??" : "mv";
            }
            return "up";
        }

        public java.lang.String toString() {
            return java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + com.ironsource.y8.i.d + cmdToString() + ",s:" + this.positionStart + "c:" + this.itemCount + ",p:" + this.payload + com.ironsource.y8.i.e;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.recyclerview.widget.AdapterHelper.UpdateOp)) {
                return false;
            }
            androidx.recyclerview.widget.AdapterHelper.UpdateOp updateOp = (androidx.recyclerview.widget.AdapterHelper.UpdateOp) obj;
            int i = this.cmd;
            if (i != updateOp.cmd) {
                return false;
            }
            if (i == 8 && java.lang.Math.abs(this.itemCount - this.positionStart) == 1 && this.itemCount == updateOp.positionStart && this.positionStart == updateOp.itemCount) {
                return true;
            }
            if (this.itemCount != updateOp.itemCount || this.positionStart != updateOp.positionStart) {
                return false;
            }
            java.lang.Object obj2 = this.payload;
            if (obj2 != null) {
                if (!obj2.equals(updateOp.payload)) {
                    return false;
                }
            } else if (updateOp.payload != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.cmd * 31) + this.positionStart) * 31) + this.itemCount;
        }
    }

    @Override // androidx.recyclerview.widget.OpReorderer.Callback
    public androidx.recyclerview.widget.AdapterHelper.UpdateOp obtainUpdateOp(int i, int i2, int i3, java.lang.Object obj) {
        androidx.recyclerview.widget.AdapterHelper.UpdateOp updateOpAcquire = this.mUpdateOpPool.acquire();
        if (updateOpAcquire == null) {
            return new androidx.recyclerview.widget.AdapterHelper.UpdateOp(i, i2, i3, obj);
        }
        updateOpAcquire.cmd = i;
        updateOpAcquire.positionStart = i2;
        updateOpAcquire.itemCount = i3;
        updateOpAcquire.payload = obj;
        return updateOpAcquire;
    }

    @Override // androidx.recyclerview.widget.OpReorderer.Callback
    public void recycleUpdateOp(androidx.recyclerview.widget.AdapterHelper.UpdateOp updateOp) {
        if (this.mDisableRecycler) {
            return;
        }
        updateOp.payload = null;
        this.mUpdateOpPool.release(updateOp);
    }

    void recycleUpdateOpsAndClearList(java.util.List<androidx.recyclerview.widget.AdapterHelper.UpdateOp> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            recycleUpdateOp(list.get(i));
        }
        list.clear();
    }
}
