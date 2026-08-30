package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
class SampleDataQueue {
    private static final int INITIAL_SCRATCH_SIZE = 32;
    private final int allocationLength;
    private final androidx.media3.exoplayer.upstream.Allocator allocator;
    private androidx.media3.exoplayer.source.SampleDataQueue.AllocationNode firstAllocationNode;
    private androidx.media3.exoplayer.source.SampleDataQueue.AllocationNode readAllocationNode;
    private final androidx.media3.common.util.ParsableByteArray scratch;
    private long totalBytesWritten;
    private androidx.media3.exoplayer.source.SampleDataQueue.AllocationNode writeAllocationNode;

    public SampleDataQueue(androidx.media3.exoplayer.upstream.Allocator allocator) {
        this.allocator = allocator;
        int individualAllocationLength = allocator.getIndividualAllocationLength();
        this.allocationLength = individualAllocationLength;
        this.scratch = new androidx.media3.common.util.ParsableByteArray(32);
        androidx.media3.exoplayer.source.SampleDataQueue.AllocationNode allocationNode = new androidx.media3.exoplayer.source.SampleDataQueue.AllocationNode(0L, individualAllocationLength);
        this.firstAllocationNode = allocationNode;
        this.readAllocationNode = allocationNode;
        this.writeAllocationNode = allocationNode;
    }

    public void reset() {
        clearAllocationNodes(this.firstAllocationNode);
        this.firstAllocationNode.reset(0L, this.allocationLength);
        androidx.media3.exoplayer.source.SampleDataQueue.AllocationNode allocationNode = this.firstAllocationNode;
        this.readAllocationNode = allocationNode;
        this.writeAllocationNode = allocationNode;
        this.totalBytesWritten = 0L;
        this.allocator.trim();
    }

    public void discardUpstreamSampleBytes(long j) {
        androidx.media3.common.util.Assertions.checkArgument(j <= this.totalBytesWritten);
        this.totalBytesWritten = j;
        if (j == 0 || j == this.firstAllocationNode.startPosition) {
            clearAllocationNodes(this.firstAllocationNode);
            androidx.media3.exoplayer.source.SampleDataQueue.AllocationNode allocationNode = new androidx.media3.exoplayer.source.SampleDataQueue.AllocationNode(this.totalBytesWritten, this.allocationLength);
            this.firstAllocationNode = allocationNode;
            this.readAllocationNode = allocationNode;
            this.writeAllocationNode = allocationNode;
            return;
        }
        androidx.media3.exoplayer.source.SampleDataQueue.AllocationNode allocationNode2 = this.firstAllocationNode;
        while (this.totalBytesWritten > allocationNode2.endPosition) {
            allocationNode2 = allocationNode2.next;
        }
        androidx.media3.exoplayer.source.SampleDataQueue.AllocationNode allocationNode3 = (androidx.media3.exoplayer.source.SampleDataQueue.AllocationNode) androidx.media3.common.util.Assertions.checkNotNull(allocationNode2.next);
        clearAllocationNodes(allocationNode3);
        allocationNode2.next = new androidx.media3.exoplayer.source.SampleDataQueue.AllocationNode(allocationNode2.endPosition, this.allocationLength);
        this.writeAllocationNode = this.totalBytesWritten == allocationNode2.endPosition ? allocationNode2.next : allocationNode2;
        if (this.readAllocationNode == allocationNode3) {
            this.readAllocationNode = allocationNode2.next;
        }
    }

    public void rewind() {
        this.readAllocationNode = this.firstAllocationNode;
    }

    public void readToBuffer(androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer, androidx.media3.exoplayer.source.SampleQueue.SampleExtrasHolder sampleExtrasHolder) {
        this.readAllocationNode = readSampleData(this.readAllocationNode, decoderInputBuffer, sampleExtrasHolder, this.scratch);
    }

    public void peekToBuffer(androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer, androidx.media3.exoplayer.source.SampleQueue.SampleExtrasHolder sampleExtrasHolder) {
        readSampleData(this.readAllocationNode, decoderInputBuffer, sampleExtrasHolder, this.scratch);
    }

    public void discardDownstreamTo(long j) {
        if (j == -1) {
            return;
        }
        while (j >= this.firstAllocationNode.endPosition) {
            this.allocator.release(this.firstAllocationNode.allocation);
            this.firstAllocationNode = this.firstAllocationNode.clear();
        }
        if (this.readAllocationNode.startPosition < this.firstAllocationNode.startPosition) {
            this.readAllocationNode = this.firstAllocationNode;
        }
    }

    public long getTotalBytesWritten() {
        return this.totalBytesWritten;
    }

    public int sampleData(androidx.media3.common.DataReader dataReader, int i, boolean z) throws java.io.IOException {
        int i2 = dataReader.read(this.writeAllocationNode.allocation.data, this.writeAllocationNode.translateOffset(this.totalBytesWritten), preAppend(i));
        if (i2 != -1) {
            postAppend(i2);
            return i2;
        }
        if (z) {
            return -1;
        }
        throw new java.io.EOFException();
    }

    public void sampleData(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i) {
        while (i > 0) {
            int iPreAppend = preAppend(i);
            parsableByteArray.readBytes(this.writeAllocationNode.allocation.data, this.writeAllocationNode.translateOffset(this.totalBytesWritten), iPreAppend);
            i -= iPreAppend;
            postAppend(iPreAppend);
        }
    }

    private void clearAllocationNodes(androidx.media3.exoplayer.source.SampleDataQueue.AllocationNode allocationNode) {
        if (allocationNode.allocation == null) {
            return;
        }
        this.allocator.release(allocationNode);
        allocationNode.clear();
    }

    private int preAppend(int i) {
        if (this.writeAllocationNode.allocation == null) {
            this.writeAllocationNode.initialize(this.allocator.allocate(), new androidx.media3.exoplayer.source.SampleDataQueue.AllocationNode(this.writeAllocationNode.endPosition, this.allocationLength));
        }
        return java.lang.Math.min(i, (int) (this.writeAllocationNode.endPosition - this.totalBytesWritten));
    }

    private void postAppend(int i) {
        long j = this.totalBytesWritten + ((long) i);
        this.totalBytesWritten = j;
        if (j == this.writeAllocationNode.endPosition) {
            this.writeAllocationNode = this.writeAllocationNode.next;
        }
    }

    private static androidx.media3.exoplayer.source.SampleDataQueue.AllocationNode readSampleData(androidx.media3.exoplayer.source.SampleDataQueue.AllocationNode allocationNode, androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer, androidx.media3.exoplayer.source.SampleQueue.SampleExtrasHolder sampleExtrasHolder, androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        if (decoderInputBuffer.isEncrypted()) {
            allocationNode = readEncryptionData(allocationNode, decoderInputBuffer, sampleExtrasHolder, parsableByteArray);
        }
        if (decoderInputBuffer.hasSupplementalData()) {
            parsableByteArray.reset(4);
            androidx.media3.exoplayer.source.SampleDataQueue.AllocationNode data = readData(allocationNode, sampleExtrasHolder.offset, parsableByteArray.getData(), 4);
            int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            sampleExtrasHolder.offset += 4;
            sampleExtrasHolder.size -= 4;
            decoderInputBuffer.ensureSpaceForWrite(unsignedIntToInt);
            androidx.media3.exoplayer.source.SampleDataQueue.AllocationNode data2 = readData(data, sampleExtrasHolder.offset, decoderInputBuffer.data, unsignedIntToInt);
            sampleExtrasHolder.offset += (long) unsignedIntToInt;
            sampleExtrasHolder.size -= unsignedIntToInt;
            decoderInputBuffer.resetSupplementalData(sampleExtrasHolder.size);
            return readData(data2, sampleExtrasHolder.offset, decoderInputBuffer.supplementalData, sampleExtrasHolder.size);
        }
        decoderInputBuffer.ensureSpaceForWrite(sampleExtrasHolder.size);
        return readData(allocationNode, sampleExtrasHolder.offset, decoderInputBuffer.data, sampleExtrasHolder.size);
    }

    private static androidx.media3.exoplayer.source.SampleDataQueue.AllocationNode readEncryptionData(androidx.media3.exoplayer.source.SampleDataQueue.AllocationNode allocationNode, androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer, androidx.media3.exoplayer.source.SampleQueue.SampleExtrasHolder sampleExtrasHolder, androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        long j = sampleExtrasHolder.offset;
        int unsignedShort = 1;
        parsableByteArray.reset(1);
        androidx.media3.exoplayer.source.SampleDataQueue.AllocationNode data = readData(allocationNode, j, parsableByteArray.getData(), 1);
        long j2 = j + 1;
        byte b = parsableByteArray.getData()[0];
        boolean z = (b & 128) != 0;
        int i = b & 127;
        androidx.media3.decoder.CryptoInfo cryptoInfo = decoderInputBuffer.cryptoInfo;
        if (cryptoInfo.iv == null) {
            cryptoInfo.iv = new byte[16];
        } else {
            java.util.Arrays.fill(cryptoInfo.iv, (byte) 0);
        }
        androidx.media3.exoplayer.source.SampleDataQueue.AllocationNode data2 = readData(data, j2, cryptoInfo.iv, i);
        long j3 = j2 + ((long) i);
        if (z) {
            parsableByteArray.reset(2);
            data2 = readData(data2, j3, parsableByteArray.getData(), 2);
            j3 += 2;
            unsignedShort = parsableByteArray.readUnsignedShort();
        }
        int i2 = unsignedShort;
        int[] iArr = cryptoInfo.numBytesOfClearData;
        if (iArr == null || iArr.length < i2) {
            iArr = new int[i2];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 == null || iArr3.length < i2) {
            iArr3 = new int[i2];
        }
        int[] iArr4 = iArr3;
        if (z) {
            int i3 = i2 * 6;
            parsableByteArray.reset(i3);
            data2 = readData(data2, j3, parsableByteArray.getData(), i3);
            j3 += (long) i3;
            parsableByteArray.setPosition(0);
            for (int i4 = 0; i4 < i2; i4++) {
                iArr2[i4] = parsableByteArray.readUnsignedShort();
                iArr4[i4] = parsableByteArray.readUnsignedIntToInt();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = sampleExtrasHolder.size - ((int) (j3 - sampleExtrasHolder.offset));
        }
        androidx.media3.extractor.TrackOutput.CryptoData cryptoData = (androidx.media3.extractor.TrackOutput.CryptoData) androidx.media3.common.util.Util.castNonNull(sampleExtrasHolder.cryptoData);
        cryptoInfo.set(i2, iArr2, iArr4, cryptoData.encryptionKey, cryptoInfo.iv, cryptoData.cryptoMode, cryptoData.encryptedBlocks, cryptoData.clearBlocks);
        int i5 = (int) (j3 - sampleExtrasHolder.offset);
        sampleExtrasHolder.offset += (long) i5;
        sampleExtrasHolder.size -= i5;
        return data2;
    }

    private static androidx.media3.exoplayer.source.SampleDataQueue.AllocationNode readData(androidx.media3.exoplayer.source.SampleDataQueue.AllocationNode allocationNode, long j, java.nio.ByteBuffer byteBuffer, int i) {
        androidx.media3.exoplayer.source.SampleDataQueue.AllocationNode nodeContainingPosition = getNodeContainingPosition(allocationNode, j);
        while (i > 0) {
            int iMin = java.lang.Math.min(i, (int) (nodeContainingPosition.endPosition - j));
            byteBuffer.put(nodeContainingPosition.allocation.data, nodeContainingPosition.translateOffset(j), iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == nodeContainingPosition.endPosition) {
                nodeContainingPosition = nodeContainingPosition.next;
            }
        }
        return nodeContainingPosition;
    }

    private static androidx.media3.exoplayer.source.SampleDataQueue.AllocationNode readData(androidx.media3.exoplayer.source.SampleDataQueue.AllocationNode allocationNode, long j, byte[] bArr, int i) {
        androidx.media3.exoplayer.source.SampleDataQueue.AllocationNode nodeContainingPosition = getNodeContainingPosition(allocationNode, j);
        int i2 = i;
        while (i2 > 0) {
            int iMin = java.lang.Math.min(i2, (int) (nodeContainingPosition.endPosition - j));
            java.lang.System.arraycopy(nodeContainingPosition.allocation.data, nodeContainingPosition.translateOffset(j), bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == nodeContainingPosition.endPosition) {
                nodeContainingPosition = nodeContainingPosition.next;
            }
        }
        return nodeContainingPosition;
    }

    private static androidx.media3.exoplayer.source.SampleDataQueue.AllocationNode getNodeContainingPosition(androidx.media3.exoplayer.source.SampleDataQueue.AllocationNode allocationNode, long j) {
        while (j >= allocationNode.endPosition) {
            allocationNode = allocationNode.next;
        }
        return allocationNode;
    }

    private static final class AllocationNode implements androidx.media3.exoplayer.upstream.Allocator.AllocationNode {
        public androidx.media3.exoplayer.upstream.Allocation allocation;
        public long endPosition;
        public androidx.media3.exoplayer.source.SampleDataQueue.AllocationNode next;
        public long startPosition;

        public AllocationNode(long j, int i) {
            reset(j, i);
        }

        public void reset(long j, int i) {
            androidx.media3.common.util.Assertions.checkState(this.allocation == null);
            this.startPosition = j;
            this.endPosition = j + ((long) i);
        }

        public void initialize(androidx.media3.exoplayer.upstream.Allocation allocation, androidx.media3.exoplayer.source.SampleDataQueue.AllocationNode allocationNode) {
            this.allocation = allocation;
            this.next = allocationNode;
        }

        public int translateOffset(long j) {
            return ((int) (j - this.startPosition)) + this.allocation.offset;
        }

        public androidx.media3.exoplayer.source.SampleDataQueue.AllocationNode clear() {
            this.allocation = null;
            androidx.media3.exoplayer.source.SampleDataQueue.AllocationNode allocationNode = this.next;
            this.next = null;
            return allocationNode;
        }

        @Override // androidx.media3.exoplayer.upstream.Allocator.AllocationNode
        public androidx.media3.exoplayer.upstream.Allocation getAllocation() {
            return (androidx.media3.exoplayer.upstream.Allocation) androidx.media3.common.util.Assertions.checkNotNull(this.allocation);
        }

        @Override // androidx.media3.exoplayer.upstream.Allocator.AllocationNode
        public androidx.media3.exoplayer.upstream.Allocator.AllocationNode next() {
            androidx.media3.exoplayer.source.SampleDataQueue.AllocationNode allocationNode = this.next;
            if (allocationNode == null || allocationNode.allocation == null) {
                return null;
            }
            return allocationNode;
        }
    }
}
