package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes3.dex */
public class AsyncListUtil<T> {
    static final boolean DEBUG = false;
    static final java.lang.String TAG = "AsyncListUtil";
    boolean mAllowScrollHints;
    private final androidx.recyclerview.widget.ThreadUtil.BackgroundCallback<T> mBackgroundCallback;
    final androidx.recyclerview.widget.ThreadUtil.BackgroundCallback<T> mBackgroundProxy;
    final androidx.recyclerview.widget.AsyncListUtil.DataCallback<T> mDataCallback;
    private final androidx.recyclerview.widget.ThreadUtil.MainThreadCallback<T> mMainThreadCallback;
    final androidx.recyclerview.widget.ThreadUtil.MainThreadCallback<T> mMainThreadProxy;
    final java.lang.Class<T> mTClass;
    final androidx.recyclerview.widget.TileList<T> mTileList;
    final int mTileSize;
    final androidx.recyclerview.widget.AsyncListUtil.ViewCallback mViewCallback;
    final int[] mTmpRange = new int[2];
    final int[] mPrevRange = new int[2];
    final int[] mTmpRangeExtended = new int[2];
    private int mScrollHint = 0;
    int mItemCount = 0;
    int mDisplayedGeneration = 0;
    int mRequestedGeneration = 0;
    final android.util.SparseIntArray mMissingPositions = new android.util.SparseIntArray();

    public static abstract class DataCallback<T> {
        public abstract void fillData(T[] tArr, int i, int i2);

        public int getMaxCachedTiles() {
            return 10;
        }

        public void recycleData(T[] tArr, int i) {
        }

        public abstract int refreshData();
    }

    void log(java.lang.String str, java.lang.Object... objArr) {
        android.util.Log.d(TAG, "[MAIN] " + java.lang.String.format(str, objArr));
    }

    public AsyncListUtil(java.lang.Class<T> cls, int i, androidx.recyclerview.widget.AsyncListUtil.DataCallback<T> dataCallback, androidx.recyclerview.widget.AsyncListUtil.ViewCallback viewCallback) {
        androidx.recyclerview.widget.ThreadUtil.MainThreadCallback<T> mainThreadCallback = new androidx.recyclerview.widget.ThreadUtil.MainThreadCallback<T>() { // from class: androidx.recyclerview.widget.AsyncListUtil.1
            @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
            public void updateItemCount(int i2, int i3) {
                if (isRequestedGeneration(i2)) {
                    androidx.recyclerview.widget.AsyncListUtil.this.mItemCount = i3;
                    androidx.recyclerview.widget.AsyncListUtil.this.mViewCallback.onDataRefresh();
                    androidx.recyclerview.widget.AsyncListUtil asyncListUtil = androidx.recyclerview.widget.AsyncListUtil.this;
                    asyncListUtil.mDisplayedGeneration = asyncListUtil.mRequestedGeneration;
                    recycleAllTiles();
                    androidx.recyclerview.widget.AsyncListUtil.this.mAllowScrollHints = false;
                    androidx.recyclerview.widget.AsyncListUtil.this.updateRange();
                }
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
            public void addTile(int i2, androidx.recyclerview.widget.TileList.Tile<T> tile) {
                if (!isRequestedGeneration(i2)) {
                    androidx.recyclerview.widget.AsyncListUtil.this.mBackgroundProxy.recycleTile(tile);
                    return;
                }
                androidx.recyclerview.widget.TileList.Tile<T> tileAddOrReplace = androidx.recyclerview.widget.AsyncListUtil.this.mTileList.addOrReplace(tile);
                if (tileAddOrReplace != null) {
                    android.util.Log.e(androidx.recyclerview.widget.AsyncListUtil.TAG, "duplicate tile @" + tileAddOrReplace.mStartPosition);
                    androidx.recyclerview.widget.AsyncListUtil.this.mBackgroundProxy.recycleTile(tileAddOrReplace);
                }
                int i3 = tile.mStartPosition + tile.mItemCount;
                int i4 = 0;
                while (i4 < androidx.recyclerview.widget.AsyncListUtil.this.mMissingPositions.size()) {
                    int iKeyAt = androidx.recyclerview.widget.AsyncListUtil.this.mMissingPositions.keyAt(i4);
                    if (tile.mStartPosition > iKeyAt || iKeyAt >= i3) {
                        i4++;
                    } else {
                        androidx.recyclerview.widget.AsyncListUtil.this.mMissingPositions.removeAt(i4);
                        androidx.recyclerview.widget.AsyncListUtil.this.mViewCallback.onItemLoaded(iKeyAt);
                    }
                }
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
            public void removeTile(int i2, int i3) {
                if (isRequestedGeneration(i2)) {
                    androidx.recyclerview.widget.TileList.Tile<T> tileRemoveAtPos = androidx.recyclerview.widget.AsyncListUtil.this.mTileList.removeAtPos(i3);
                    if (tileRemoveAtPos == null) {
                        android.util.Log.e(androidx.recyclerview.widget.AsyncListUtil.TAG, "tile not found @" + i3);
                    } else {
                        androidx.recyclerview.widget.AsyncListUtil.this.mBackgroundProxy.recycleTile(tileRemoveAtPos);
                    }
                }
            }

            private void recycleAllTiles() {
                for (int i2 = 0; i2 < androidx.recyclerview.widget.AsyncListUtil.this.mTileList.size(); i2++) {
                    androidx.recyclerview.widget.AsyncListUtil.this.mBackgroundProxy.recycleTile(androidx.recyclerview.widget.AsyncListUtil.this.mTileList.getAtIndex(i2));
                }
                androidx.recyclerview.widget.AsyncListUtil.this.mTileList.clear();
            }

            private boolean isRequestedGeneration(int i2) {
                return i2 == androidx.recyclerview.widget.AsyncListUtil.this.mRequestedGeneration;
            }
        };
        this.mMainThreadCallback = mainThreadCallback;
        androidx.recyclerview.widget.ThreadUtil.BackgroundCallback<T> backgroundCallback = new androidx.recyclerview.widget.ThreadUtil.BackgroundCallback<T>() { // from class: androidx.recyclerview.widget.AsyncListUtil.2
            private int mFirstRequiredTileStart;
            private int mGeneration;
            private int mItemCount;
            private int mLastRequiredTileStart;
            final android.util.SparseBooleanArray mLoadedTiles = new android.util.SparseBooleanArray();
            private androidx.recyclerview.widget.TileList.Tile<T> mRecycledRoot;

            @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
            public void refresh(int i2) {
                this.mGeneration = i2;
                this.mLoadedTiles.clear();
                this.mItemCount = androidx.recyclerview.widget.AsyncListUtil.this.mDataCallback.refreshData();
                androidx.recyclerview.widget.AsyncListUtil.this.mMainThreadProxy.updateItemCount(this.mGeneration, this.mItemCount);
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
            public void updateRange(int i2, int i3, int i4, int i5, int i6) {
                if (i2 > i3) {
                    return;
                }
                int tileStart = getTileStart(i2);
                int tileStart2 = getTileStart(i3);
                this.mFirstRequiredTileStart = getTileStart(i4);
                int tileStart3 = getTileStart(i5);
                this.mLastRequiredTileStart = tileStart3;
                if (i6 == 1) {
                    requestTiles(this.mFirstRequiredTileStart, tileStart2, i6, true);
                    requestTiles(tileStart2 + androidx.recyclerview.widget.AsyncListUtil.this.mTileSize, this.mLastRequiredTileStart, i6, false);
                } else {
                    requestTiles(tileStart, tileStart3, i6, false);
                    requestTiles(this.mFirstRequiredTileStart, tileStart - androidx.recyclerview.widget.AsyncListUtil.this.mTileSize, i6, true);
                }
            }

            private int getTileStart(int i2) {
                return i2 - (i2 % androidx.recyclerview.widget.AsyncListUtil.this.mTileSize);
            }

            private void requestTiles(int i2, int i3, int i4, boolean z) {
                int i5 = i2;
                while (i5 <= i3) {
                    androidx.recyclerview.widget.AsyncListUtil.this.mBackgroundProxy.loadTile(z ? (i3 + i2) - i5 : i5, i4);
                    i5 += androidx.recyclerview.widget.AsyncListUtil.this.mTileSize;
                }
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
            public void loadTile(int i2, int i3) {
                if (isTileLoaded(i2)) {
                    return;
                }
                androidx.recyclerview.widget.TileList.Tile<T> tileAcquireTile = acquireTile();
                tileAcquireTile.mStartPosition = i2;
                tileAcquireTile.mItemCount = java.lang.Math.min(androidx.recyclerview.widget.AsyncListUtil.this.mTileSize, this.mItemCount - tileAcquireTile.mStartPosition);
                androidx.recyclerview.widget.AsyncListUtil.this.mDataCallback.fillData(tileAcquireTile.mItems, tileAcquireTile.mStartPosition, tileAcquireTile.mItemCount);
                flushTileCache(i3);
                addTile(tileAcquireTile);
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
            public void recycleTile(androidx.recyclerview.widget.TileList.Tile<T> tile) {
                androidx.recyclerview.widget.AsyncListUtil.this.mDataCallback.recycleData(tile.mItems, tile.mItemCount);
                tile.mNext = this.mRecycledRoot;
                this.mRecycledRoot = tile;
            }

            private androidx.recyclerview.widget.TileList.Tile<T> acquireTile() {
                androidx.recyclerview.widget.TileList.Tile<T> tile = this.mRecycledRoot;
                if (tile != null) {
                    this.mRecycledRoot = tile.mNext;
                    return tile;
                }
                return new androidx.recyclerview.widget.TileList.Tile<>(androidx.recyclerview.widget.AsyncListUtil.this.mTClass, androidx.recyclerview.widget.AsyncListUtil.this.mTileSize);
            }

            private boolean isTileLoaded(int i2) {
                return this.mLoadedTiles.get(i2);
            }

            private void addTile(androidx.recyclerview.widget.TileList.Tile<T> tile) {
                this.mLoadedTiles.put(tile.mStartPosition, true);
                androidx.recyclerview.widget.AsyncListUtil.this.mMainThreadProxy.addTile(this.mGeneration, tile);
            }

            private void removeTile(int i2) {
                this.mLoadedTiles.delete(i2);
                androidx.recyclerview.widget.AsyncListUtil.this.mMainThreadProxy.removeTile(this.mGeneration, i2);
            }

            private void flushTileCache(int i2) {
                int maxCachedTiles = androidx.recyclerview.widget.AsyncListUtil.this.mDataCallback.getMaxCachedTiles();
                while (this.mLoadedTiles.size() >= maxCachedTiles) {
                    int iKeyAt = this.mLoadedTiles.keyAt(0);
                    android.util.SparseBooleanArray sparseBooleanArray = this.mLoadedTiles;
                    int iKeyAt2 = sparseBooleanArray.keyAt(sparseBooleanArray.size() - 1);
                    int i3 = this.mFirstRequiredTileStart - iKeyAt;
                    int i4 = iKeyAt2 - this.mLastRequiredTileStart;
                    if (i3 > 0 && (i3 >= i4 || i2 == 2)) {
                        removeTile(iKeyAt);
                    } else {
                        if (i4 <= 0) {
                            return;
                        }
                        if (i3 >= i4 && i2 != 1) {
                            return;
                        } else {
                            removeTile(iKeyAt2);
                        }
                    }
                }
            }

            private void log(java.lang.String str, java.lang.Object... objArr) {
                android.util.Log.d(androidx.recyclerview.widget.AsyncListUtil.TAG, "[BKGR] " + java.lang.String.format(str, objArr));
            }
        };
        this.mBackgroundCallback = backgroundCallback;
        this.mTClass = cls;
        this.mTileSize = i;
        this.mDataCallback = dataCallback;
        this.mViewCallback = viewCallback;
        this.mTileList = new androidx.recyclerview.widget.TileList<>(i);
        androidx.recyclerview.widget.MessageThreadUtil messageThreadUtil = new androidx.recyclerview.widget.MessageThreadUtil();
        this.mMainThreadProxy = messageThreadUtil.getMainThreadProxy(mainThreadCallback);
        this.mBackgroundProxy = messageThreadUtil.getBackgroundProxy(backgroundCallback);
        refresh();
    }

    private boolean isRefreshPending() {
        return this.mRequestedGeneration != this.mDisplayedGeneration;
    }

    public void onRangeChanged() {
        if (isRefreshPending()) {
            return;
        }
        updateRange();
        this.mAllowScrollHints = true;
    }

    public void refresh() {
        this.mMissingPositions.clear();
        androidx.recyclerview.widget.ThreadUtil.BackgroundCallback<T> backgroundCallback = this.mBackgroundProxy;
        int i = this.mRequestedGeneration + 1;
        this.mRequestedGeneration = i;
        backgroundCallback.refresh(i);
    }

    public T getItem(int i) {
        if (i < 0 || i >= this.mItemCount) {
            throw new java.lang.IndexOutOfBoundsException(i + " is not within 0 and " + this.mItemCount);
        }
        T itemAt = this.mTileList.getItemAt(i);
        if (itemAt == null && !isRefreshPending()) {
            this.mMissingPositions.put(i, 0);
        }
        return itemAt;
    }

    public int getItemCount() {
        return this.mItemCount;
    }

    void updateRange() {
        int i;
        this.mViewCallback.getItemRangeInto(this.mTmpRange);
        int[] iArr = this.mTmpRange;
        int i2 = iArr[0];
        int i3 = iArr[1];
        if (i2 > i3 || i2 < 0 || i3 >= this.mItemCount) {
            return;
        }
        if (!this.mAllowScrollHints) {
            this.mScrollHint = 0;
        } else {
            int[] iArr2 = this.mPrevRange;
            if (i2 > iArr2[1] || (i = iArr2[0]) > i3) {
                this.mScrollHint = 0;
            } else if (i2 < i) {
                this.mScrollHint = 1;
            } else if (i2 > i) {
                this.mScrollHint = 2;
            }
        }
        int[] iArr3 = this.mPrevRange;
        iArr3[0] = i2;
        iArr3[1] = i3;
        this.mViewCallback.extendRangeInto(iArr, this.mTmpRangeExtended, this.mScrollHint);
        int[] iArr4 = this.mTmpRangeExtended;
        iArr4[0] = java.lang.Math.min(this.mTmpRange[0], java.lang.Math.max(iArr4[0], 0));
        int[] iArr5 = this.mTmpRangeExtended;
        iArr5[1] = java.lang.Math.max(this.mTmpRange[1], java.lang.Math.min(iArr5[1], this.mItemCount - 1));
        androidx.recyclerview.widget.ThreadUtil.BackgroundCallback<T> backgroundCallback = this.mBackgroundProxy;
        int[] iArr6 = this.mTmpRange;
        int i4 = iArr6[0];
        int i5 = iArr6[1];
        int[] iArr7 = this.mTmpRangeExtended;
        backgroundCallback.updateRange(i4, i5, iArr7[0], iArr7[1], this.mScrollHint);
    }

    public static abstract class ViewCallback {
        public static final int HINT_SCROLL_ASC = 2;
        public static final int HINT_SCROLL_DESC = 1;
        public static final int HINT_SCROLL_NONE = 0;

        public abstract void getItemRangeInto(int[] iArr);

        public abstract void onDataRefresh();

        public abstract void onItemLoaded(int i);

        public void extendRangeInto(int[] iArr, int[] iArr2, int i) {
            int i2 = iArr[1];
            int i3 = iArr[0];
            int i4 = (i2 - i3) + 1;
            int i5 = i4 / 2;
            iArr2[0] = i3 - (i == 1 ? i4 : i5);
            if (i != 2) {
                i4 = i5;
            }
            iArr2[1] = i2 + i4;
        }
    }
}
