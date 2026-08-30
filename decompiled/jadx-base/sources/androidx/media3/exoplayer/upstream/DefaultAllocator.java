package androidx.media3.exoplayer.upstream;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultAllocator implements androidx.media3.exoplayer.upstream.Allocator {
    private static final int AVAILABLE_EXTRA_CAPACITY = 100;
    private int allocatedCount;
    private androidx.media3.exoplayer.upstream.Allocation[] availableAllocations;
    private int availableCount;
    private final int individualAllocationSize;
    private final byte[] initialAllocationBlock;
    private int targetBufferSize;
    private final boolean trimOnReset;

    public DefaultAllocator(boolean z, int i) {
        this(z, i, 0);
    }

    public DefaultAllocator(boolean z, int i, int i2) {
        androidx.media3.common.util.Assertions.checkArgument(i > 0);
        androidx.media3.common.util.Assertions.checkArgument(i2 >= 0);
        this.trimOnReset = z;
        this.individualAllocationSize = i;
        this.availableCount = i2;
        this.availableAllocations = new androidx.media3.exoplayer.upstream.Allocation[i2 + 100];
        if (i2 > 0) {
            this.initialAllocationBlock = new byte[i2 * i];
            for (int i3 = 0; i3 < i2; i3++) {
                this.availableAllocations[i3] = new androidx.media3.exoplayer.upstream.Allocation(this.initialAllocationBlock, i3 * i);
            }
            return;
        }
        this.initialAllocationBlock = null;
    }

    public synchronized void reset() {
        if (this.trimOnReset) {
            setTargetBufferSize(0);
        }
    }

    public synchronized void setTargetBufferSize(int i) {
        boolean z = i < this.targetBufferSize;
        this.targetBufferSize = i;
        if (z) {
            trim();
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Allocator
    public synchronized androidx.media3.exoplayer.upstream.Allocation allocate() {
        androidx.media3.exoplayer.upstream.Allocation allocation;
        this.allocatedCount++;
        int i = this.availableCount;
        if (i > 0) {
            androidx.media3.exoplayer.upstream.Allocation[] allocationArr = this.availableAllocations;
            int i2 = i - 1;
            this.availableCount = i2;
            allocation = (androidx.media3.exoplayer.upstream.Allocation) androidx.media3.common.util.Assertions.checkNotNull(allocationArr[i2]);
            this.availableAllocations[this.availableCount] = null;
        } else {
            allocation = new androidx.media3.exoplayer.upstream.Allocation(new byte[this.individualAllocationSize], 0);
            int i3 = this.allocatedCount;
            androidx.media3.exoplayer.upstream.Allocation[] allocationArr2 = this.availableAllocations;
            if (i3 > allocationArr2.length) {
                this.availableAllocations = (androidx.media3.exoplayer.upstream.Allocation[]) java.util.Arrays.copyOf(allocationArr2, allocationArr2.length * 2);
            }
        }
        return allocation;
    }

    @Override // androidx.media3.exoplayer.upstream.Allocator
    public synchronized void release(androidx.media3.exoplayer.upstream.Allocation allocation) {
        androidx.media3.exoplayer.upstream.Allocation[] allocationArr = this.availableAllocations;
        int i = this.availableCount;
        this.availableCount = i + 1;
        allocationArr[i] = allocation;
        this.allocatedCount--;
        notifyAll();
    }

    @Override // androidx.media3.exoplayer.upstream.Allocator
    public synchronized void release(androidx.media3.exoplayer.upstream.Allocator.AllocationNode allocationNode) {
        while (allocationNode != null) {
            androidx.media3.exoplayer.upstream.Allocation[] allocationArr = this.availableAllocations;
            int i = this.availableCount;
            this.availableCount = i + 1;
            allocationArr[i] = allocationNode.getAllocation();
            this.allocatedCount--;
            allocationNode = allocationNode.next();
        }
        notifyAll();
    }

    @Override // androidx.media3.exoplayer.upstream.Allocator
    public synchronized void trim() {
        int i = 0;
        int iMax = java.lang.Math.max(0, androidx.media3.common.util.Util.ceilDivide(this.targetBufferSize, this.individualAllocationSize) - this.allocatedCount);
        int i2 = this.availableCount;
        if (iMax >= i2) {
            return;
        }
        if (this.initialAllocationBlock != null) {
            int i3 = i2 - 1;
            while (i <= i3) {
                androidx.media3.exoplayer.upstream.Allocation allocation = (androidx.media3.exoplayer.upstream.Allocation) androidx.media3.common.util.Assertions.checkNotNull(this.availableAllocations[i]);
                if (allocation.data == this.initialAllocationBlock) {
                    i++;
                } else {
                    androidx.media3.exoplayer.upstream.Allocation allocation2 = (androidx.media3.exoplayer.upstream.Allocation) androidx.media3.common.util.Assertions.checkNotNull(this.availableAllocations[i3]);
                    if (allocation2.data != this.initialAllocationBlock) {
                        i3--;
                    } else {
                        androidx.media3.exoplayer.upstream.Allocation[] allocationArr = this.availableAllocations;
                        allocationArr[i] = allocation2;
                        allocationArr[i3] = allocation;
                        i3--;
                        i++;
                    }
                }
            }
            iMax = java.lang.Math.max(iMax, i);
            if (iMax >= this.availableCount) {
                return;
            }
        }
        java.util.Arrays.fill(this.availableAllocations, iMax, this.availableCount, (java.lang.Object) null);
        this.availableCount = iMax;
    }

    @Override // androidx.media3.exoplayer.upstream.Allocator
    public synchronized int getTotalBytesAllocated() {
        return this.allocatedCount * this.individualAllocationSize;
    }

    @Override // androidx.media3.exoplayer.upstream.Allocator
    public int getIndividualAllocationLength() {
        return this.individualAllocationSize;
    }
}
