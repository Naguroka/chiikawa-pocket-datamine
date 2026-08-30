package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractConcatenatedTimeline extends androidx.media3.common.Timeline {
    private final int childCount;
    private final boolean isAtomic;
    private final androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder;

    protected abstract int getChildIndexByChildUid(java.lang.Object obj);

    protected abstract int getChildIndexByPeriodIndex(int i);

    protected abstract int getChildIndexByWindowIndex(int i);

    protected abstract java.lang.Object getChildUidByChildIndex(int i);

    protected abstract int getFirstPeriodIndexByChildIndex(int i);

    protected abstract int getFirstWindowIndexByChildIndex(int i);

    protected abstract androidx.media3.common.Timeline getTimelineByChildIndex(int i);

    public static java.lang.Object getChildTimelineUidFromConcatenatedUid(java.lang.Object obj) {
        return ((android.util.Pair) obj).first;
    }

    public static java.lang.Object getChildPeriodUidFromConcatenatedUid(java.lang.Object obj) {
        return ((android.util.Pair) obj).second;
    }

    public static java.lang.Object getConcatenatedUid(java.lang.Object obj, java.lang.Object obj2) {
        return android.util.Pair.create(obj, obj2);
    }

    public AbstractConcatenatedTimeline(boolean z, androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder) {
        this.isAtomic = z;
        this.shuffleOrder = shuffleOrder;
        this.childCount = shuffleOrder.getLength();
    }

    @Override // androidx.media3.common.Timeline
    public int getNextWindowIndex(int i, int i2, boolean z) {
        if (this.isAtomic) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int childIndexByWindowIndex = getChildIndexByWindowIndex(i);
        int firstWindowIndexByChildIndex = getFirstWindowIndexByChildIndex(childIndexByWindowIndex);
        int nextWindowIndex = getTimelineByChildIndex(childIndexByWindowIndex).getNextWindowIndex(i - firstWindowIndexByChildIndex, i2 != 2 ? i2 : 0, z);
        if (nextWindowIndex != -1) {
            return firstWindowIndexByChildIndex + nextWindowIndex;
        }
        int nextChildIndex = getNextChildIndex(childIndexByWindowIndex, z);
        while (nextChildIndex != -1 && getTimelineByChildIndex(nextChildIndex).isEmpty()) {
            nextChildIndex = getNextChildIndex(nextChildIndex, z);
        }
        if (nextChildIndex != -1) {
            return getFirstWindowIndexByChildIndex(nextChildIndex) + getTimelineByChildIndex(nextChildIndex).getFirstWindowIndex(z);
        }
        if (i2 == 2) {
            return getFirstWindowIndex(z);
        }
        return -1;
    }

    @Override // androidx.media3.common.Timeline
    public int getPreviousWindowIndex(int i, int i2, boolean z) {
        if (this.isAtomic) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int childIndexByWindowIndex = getChildIndexByWindowIndex(i);
        int firstWindowIndexByChildIndex = getFirstWindowIndexByChildIndex(childIndexByWindowIndex);
        int previousWindowIndex = getTimelineByChildIndex(childIndexByWindowIndex).getPreviousWindowIndex(i - firstWindowIndexByChildIndex, i2 != 2 ? i2 : 0, z);
        if (previousWindowIndex != -1) {
            return firstWindowIndexByChildIndex + previousWindowIndex;
        }
        int previousChildIndex = getPreviousChildIndex(childIndexByWindowIndex, z);
        while (previousChildIndex != -1 && getTimelineByChildIndex(previousChildIndex).isEmpty()) {
            previousChildIndex = getPreviousChildIndex(previousChildIndex, z);
        }
        if (previousChildIndex != -1) {
            return getFirstWindowIndexByChildIndex(previousChildIndex) + getTimelineByChildIndex(previousChildIndex).getLastWindowIndex(z);
        }
        if (i2 == 2) {
            return getLastWindowIndex(z);
        }
        return -1;
    }

    @Override // androidx.media3.common.Timeline
    public int getLastWindowIndex(boolean z) {
        int i = this.childCount;
        if (i == 0) {
            return -1;
        }
        if (this.isAtomic) {
            z = false;
        }
        int lastIndex = z ? this.shuffleOrder.getLastIndex() : i - 1;
        while (getTimelineByChildIndex(lastIndex).isEmpty()) {
            lastIndex = getPreviousChildIndex(lastIndex, z);
            if (lastIndex == -1) {
                return -1;
            }
        }
        return getFirstWindowIndexByChildIndex(lastIndex) + getTimelineByChildIndex(lastIndex).getLastWindowIndex(z);
    }

    @Override // androidx.media3.common.Timeline
    public int getFirstWindowIndex(boolean z) {
        if (this.childCount == 0) {
            return -1;
        }
        if (this.isAtomic) {
            z = false;
        }
        int firstIndex = z ? this.shuffleOrder.getFirstIndex() : 0;
        while (getTimelineByChildIndex(firstIndex).isEmpty()) {
            firstIndex = getNextChildIndex(firstIndex, z);
            if (firstIndex == -1) {
                return -1;
            }
        }
        return getFirstWindowIndexByChildIndex(firstIndex) + getTimelineByChildIndex(firstIndex).getFirstWindowIndex(z);
    }

    @Override // androidx.media3.common.Timeline
    public final androidx.media3.common.Timeline.Window getWindow(int i, androidx.media3.common.Timeline.Window window, long j) {
        int childIndexByWindowIndex = getChildIndexByWindowIndex(i);
        int firstWindowIndexByChildIndex = getFirstWindowIndexByChildIndex(childIndexByWindowIndex);
        int firstPeriodIndexByChildIndex = getFirstPeriodIndexByChildIndex(childIndexByWindowIndex);
        getTimelineByChildIndex(childIndexByWindowIndex).getWindow(i - firstWindowIndexByChildIndex, window, j);
        java.lang.Object childUidByChildIndex = getChildUidByChildIndex(childIndexByWindowIndex);
        if (!androidx.media3.common.Timeline.Window.SINGLE_WINDOW_UID.equals(window.uid)) {
            childUidByChildIndex = getConcatenatedUid(childUidByChildIndex, window.uid);
        }
        window.uid = childUidByChildIndex;
        window.firstPeriodIndex += firstPeriodIndexByChildIndex;
        window.lastPeriodIndex += firstPeriodIndexByChildIndex;
        return window;
    }

    @Override // androidx.media3.common.Timeline
    public final androidx.media3.common.Timeline.Period getPeriodByUid(java.lang.Object obj, androidx.media3.common.Timeline.Period period) {
        java.lang.Object childTimelineUidFromConcatenatedUid = getChildTimelineUidFromConcatenatedUid(obj);
        java.lang.Object childPeriodUidFromConcatenatedUid = getChildPeriodUidFromConcatenatedUid(obj);
        int childIndexByChildUid = getChildIndexByChildUid(childTimelineUidFromConcatenatedUid);
        int firstWindowIndexByChildIndex = getFirstWindowIndexByChildIndex(childIndexByChildUid);
        getTimelineByChildIndex(childIndexByChildUid).getPeriodByUid(childPeriodUidFromConcatenatedUid, period);
        period.windowIndex += firstWindowIndexByChildIndex;
        period.uid = obj;
        return period;
    }

    @Override // androidx.media3.common.Timeline
    public final androidx.media3.common.Timeline.Period getPeriod(int i, androidx.media3.common.Timeline.Period period, boolean z) {
        int childIndexByPeriodIndex = getChildIndexByPeriodIndex(i);
        int firstWindowIndexByChildIndex = getFirstWindowIndexByChildIndex(childIndexByPeriodIndex);
        getTimelineByChildIndex(childIndexByPeriodIndex).getPeriod(i - getFirstPeriodIndexByChildIndex(childIndexByPeriodIndex), period, z);
        period.windowIndex += firstWindowIndexByChildIndex;
        if (z) {
            period.uid = getConcatenatedUid(getChildUidByChildIndex(childIndexByPeriodIndex), androidx.media3.common.util.Assertions.checkNotNull(period.uid));
        }
        return period;
    }

    @Override // androidx.media3.common.Timeline
    public final int getIndexOfPeriod(java.lang.Object obj) {
        int indexOfPeriod;
        if (!(obj instanceof android.util.Pair)) {
            return -1;
        }
        java.lang.Object childTimelineUidFromConcatenatedUid = getChildTimelineUidFromConcatenatedUid(obj);
        java.lang.Object childPeriodUidFromConcatenatedUid = getChildPeriodUidFromConcatenatedUid(obj);
        int childIndexByChildUid = getChildIndexByChildUid(childTimelineUidFromConcatenatedUid);
        if (childIndexByChildUid == -1 || (indexOfPeriod = getTimelineByChildIndex(childIndexByChildUid).getIndexOfPeriod(childPeriodUidFromConcatenatedUid)) == -1) {
            return -1;
        }
        return getFirstPeriodIndexByChildIndex(childIndexByChildUid) + indexOfPeriod;
    }

    @Override // androidx.media3.common.Timeline
    public final java.lang.Object getUidOfPeriod(int i) {
        int childIndexByPeriodIndex = getChildIndexByPeriodIndex(i);
        return getConcatenatedUid(getChildUidByChildIndex(childIndexByPeriodIndex), getTimelineByChildIndex(childIndexByPeriodIndex).getUidOfPeriod(i - getFirstPeriodIndexByChildIndex(childIndexByPeriodIndex)));
    }

    private int getNextChildIndex(int i, boolean z) {
        if (z) {
            return this.shuffleOrder.getNextIndex(i);
        }
        if (i < this.childCount - 1) {
            return i + 1;
        }
        return -1;
    }

    private int getPreviousChildIndex(int i, boolean z) {
        if (z) {
            return this.shuffleOrder.getPreviousIndex(i);
        }
        if (i > 0) {
            return i - 1;
        }
        return -1;
    }
}
