package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
final class RopeByteString extends com.google.protobuf.ByteString {
    static final int[] minLengthByDepth = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, org.objectweb.asm.Opcodes.D2F, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private static final long serialVersionUID = 1;
    private final com.google.protobuf.ByteString left;
    private final int leftLength;
    private final com.google.protobuf.ByteString right;
    private final int totalLength;
    private final int treeDepth;

    private RopeByteString(com.google.protobuf.ByteString byteString, com.google.protobuf.ByteString byteString2) {
        this.left = byteString;
        this.right = byteString2;
        int size = byteString.size();
        this.leftLength = size;
        this.totalLength = size + byteString2.size();
        this.treeDepth = java.lang.Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1;
    }

    static com.google.protobuf.ByteString concatenate(com.google.protobuf.ByteString byteString, com.google.protobuf.ByteString byteString2) {
        if (byteString2.size() == 0) {
            return byteString;
        }
        if (byteString.size() == 0) {
            return byteString2;
        }
        int size = byteString.size() + byteString2.size();
        if (size < 128) {
            return concatenateBytes(byteString, byteString2);
        }
        if (byteString instanceof com.google.protobuf.RopeByteString) {
            com.google.protobuf.RopeByteString ropeByteString = (com.google.protobuf.RopeByteString) byteString;
            if (ropeByteString.right.size() + byteString2.size() < 128) {
                return new com.google.protobuf.RopeByteString(ropeByteString.left, concatenateBytes(ropeByteString.right, byteString2));
            }
            if (ropeByteString.left.getTreeDepth() > ropeByteString.right.getTreeDepth() && ropeByteString.getTreeDepth() > byteString2.getTreeDepth()) {
                return new com.google.protobuf.RopeByteString(ropeByteString.left, new com.google.protobuf.RopeByteString(ropeByteString.right, byteString2));
            }
        }
        if (size >= minLength(java.lang.Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1)) {
            return new com.google.protobuf.RopeByteString(byteString, byteString2);
        }
        return new com.google.protobuf.RopeByteString.Balancer().balance(byteString, byteString2);
    }

    private static com.google.protobuf.ByteString concatenateBytes(com.google.protobuf.ByteString byteString, com.google.protobuf.ByteString byteString2) {
        int size = byteString.size();
        int size2 = byteString2.size();
        byte[] bArr = new byte[size + size2];
        byteString.copyTo(bArr, 0, 0, size);
        byteString2.copyTo(bArr, 0, size, size2);
        return com.google.protobuf.ByteString.wrap(bArr);
    }

    static com.google.protobuf.RopeByteString newInstanceForTest(com.google.protobuf.ByteString byteString, com.google.protobuf.ByteString byteString2) {
        return new com.google.protobuf.RopeByteString(byteString, byteString2);
    }

    static int minLength(int i) {
        int[] iArr = minLengthByDepth;
        if (i >= iArr.length) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    @Override // com.google.protobuf.ByteString
    public byte byteAt(int i) {
        checkIndex(i, this.totalLength);
        return internalByteAt(i);
    }

    @Override // com.google.protobuf.ByteString
    byte internalByteAt(int i) {
        int i2 = this.leftLength;
        if (i < i2) {
            return this.left.internalByteAt(i);
        }
        return this.right.internalByteAt(i - i2);
    }

    @Override // com.google.protobuf.ByteString
    public int size() {
        return this.totalLength;
    }

    @Override // com.google.protobuf.ByteString, java.lang.Iterable
    /* JADX INFO: renamed from: iterator */
    public java.util.Iterator<java.lang.Byte> iterator2() {
        return new com.google.protobuf.ByteString.AbstractByteIterator() { // from class: com.google.protobuf.RopeByteString.1
            com.google.protobuf.ByteString.ByteIterator current = nextPiece();
            final com.google.protobuf.RopeByteString.PieceIterator pieces;

            {
                this.pieces = new com.google.protobuf.RopeByteString.PieceIterator(com.google.protobuf.RopeByteString.this);
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [com.google.protobuf.ByteString$ByteIterator] */
            private com.google.protobuf.ByteString.ByteIterator nextPiece() {
                if (this.pieces.hasNext()) {
                    return this.pieces.next().iterator();
                }
                return null;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.current != null;
            }

            @Override // com.google.protobuf.ByteString.ByteIterator
            public byte nextByte() {
                com.google.protobuf.ByteString.ByteIterator byteIterator = this.current;
                if (byteIterator == null) {
                    throw new java.util.NoSuchElementException();
                }
                byte bNextByte = byteIterator.nextByte();
                if (!this.current.hasNext()) {
                    this.current = nextPiece();
                }
                return bNextByte;
            }
        };
    }

    @Override // com.google.protobuf.ByteString
    protected int getTreeDepth() {
        return this.treeDepth;
    }

    @Override // com.google.protobuf.ByteString
    protected boolean isBalanced() {
        return this.totalLength >= minLength(this.treeDepth);
    }

    @Override // com.google.protobuf.ByteString
    public com.google.protobuf.ByteString substring(int i, int i2) {
        int iCheckRange = checkRange(i, i2, this.totalLength);
        if (iCheckRange == 0) {
            return com.google.protobuf.ByteString.EMPTY;
        }
        if (iCheckRange == this.totalLength) {
            return this;
        }
        int i3 = this.leftLength;
        if (i2 <= i3) {
            return this.left.substring(i, i2);
        }
        if (i >= i3) {
            return this.right.substring(i - i3, i2 - i3);
        }
        return new com.google.protobuf.RopeByteString(this.left.substring(i), this.right.substring(0, i2 - this.leftLength));
    }

    @Override // com.google.protobuf.ByteString
    protected void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            this.left.copyToInternal(bArr, i, i2, i3);
        } else {
            if (i >= i5) {
                this.right.copyToInternal(bArr, i - i5, i2, i3);
                return;
            }
            int i6 = i5 - i;
            this.left.copyToInternal(bArr, i, i2, i6);
            this.right.copyToInternal(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    @Override // com.google.protobuf.ByteString
    public void copyTo(java.nio.ByteBuffer byteBuffer) {
        this.left.copyTo(byteBuffer);
        this.right.copyTo(byteBuffer);
    }

    @Override // com.google.protobuf.ByteString
    public java.nio.ByteBuffer asReadOnlyByteBuffer() {
        return java.nio.ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
    public java.util.List<java.nio.ByteBuffer> asReadOnlyByteBufferList() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.google.protobuf.RopeByteString.PieceIterator pieceIterator = new com.google.protobuf.RopeByteString.PieceIterator(this);
        while (pieceIterator.hasNext()) {
            arrayList.add(pieceIterator.next().asReadOnlyByteBuffer());
        }
        return arrayList;
    }

    @Override // com.google.protobuf.ByteString
    public void writeTo(java.io.OutputStream outputStream) throws java.io.IOException {
        this.left.writeTo(outputStream);
        this.right.writeTo(outputStream);
    }

    @Override // com.google.protobuf.ByteString
    void writeToInternal(java.io.OutputStream outputStream, int i, int i2) throws java.io.IOException {
        int i3 = i + i2;
        int i4 = this.leftLength;
        if (i3 <= i4) {
            this.left.writeToInternal(outputStream, i, i2);
        } else {
            if (i >= i4) {
                this.right.writeToInternal(outputStream, i - i4, i2);
                return;
            }
            int i5 = i4 - i;
            this.left.writeToInternal(outputStream, i, i5);
            this.right.writeToInternal(outputStream, 0, i2 - i5);
        }
    }

    @Override // com.google.protobuf.ByteString
    void writeTo(com.google.protobuf.ByteOutput byteOutput) throws java.io.IOException {
        this.left.writeTo(byteOutput);
        this.right.writeTo(byteOutput);
    }

    @Override // com.google.protobuf.ByteString
    void writeToReverse(com.google.protobuf.ByteOutput byteOutput) throws java.io.IOException {
        this.right.writeToReverse(byteOutput);
        this.left.writeToReverse(byteOutput);
    }

    @Override // com.google.protobuf.ByteString
    protected java.lang.String toStringInternal(java.nio.charset.Charset charset) {
        return new java.lang.String(toByteArray(), charset);
    }

    @Override // com.google.protobuf.ByteString
    public boolean isValidUtf8() {
        int iPartialIsValidUtf8 = this.left.partialIsValidUtf8(0, 0, this.leftLength);
        com.google.protobuf.ByteString byteString = this.right;
        return byteString.partialIsValidUtf8(iPartialIsValidUtf8, 0, byteString.size()) == 0;
    }

    @Override // com.google.protobuf.ByteString
    protected int partialIsValidUtf8(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            return this.left.partialIsValidUtf8(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.right.partialIsValidUtf8(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.right.partialIsValidUtf8(this.left.partialIsValidUtf8(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.protobuf.ByteString
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.protobuf.ByteString)) {
            return false;
        }
        com.google.protobuf.ByteString byteString = (com.google.protobuf.ByteString) obj;
        if (this.totalLength != byteString.size()) {
            return false;
        }
        if (this.totalLength == 0) {
            return true;
        }
        int iPeekCachedHashCode = peekCachedHashCode();
        int iPeekCachedHashCode2 = byteString.peekCachedHashCode();
        if (iPeekCachedHashCode == 0 || iPeekCachedHashCode2 == 0 || iPeekCachedHashCode == iPeekCachedHashCode2) {
            return equalsFragments(byteString);
        }
        return false;
    }

    private boolean equalsFragments(com.google.protobuf.ByteString byteString) {
        boolean zEqualsRange;
        com.google.protobuf.ByteString.LeafByteString next;
        com.google.protobuf.RopeByteString.PieceIterator pieceIterator = new com.google.protobuf.RopeByteString.PieceIterator(this);
        com.google.protobuf.ByteString.LeafByteString next2 = pieceIterator.next();
        com.google.protobuf.RopeByteString.PieceIterator pieceIterator2 = new com.google.protobuf.RopeByteString.PieceIterator(byteString);
        com.google.protobuf.ByteString.LeafByteString next3 = pieceIterator2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = next2.size() - i;
            int size2 = next3.size() - i2;
            int iMin = java.lang.Math.min(size, size2);
            if (i == 0) {
                zEqualsRange = next2.equalsRange(next3, i2, iMin);
            } else {
                zEqualsRange = next3.equalsRange(next2, i, iMin);
            }
            if (!zEqualsRange) {
                return false;
            }
            i3 += iMin;
            int i4 = this.totalLength;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new java.lang.IllegalStateException();
            }
            if (iMin == size) {
                next = pieceIterator.next();
                i = 0;
            } else {
                i += iMin;
            }
            if (iMin == size2) {
                next2 = next2;
                next2 = next;
                next3 = pieceIterator2.next();
                i2 = 0;
            } else {
                next2 = next2;
                next2 = next;
                i2 += iMin;
            }
        }
    }

    @Override // com.google.protobuf.ByteString
    protected int partialHash(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            return this.left.partialHash(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.right.partialHash(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.right.partialHash(this.left.partialHash(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.protobuf.ByteString
    public com.google.protobuf.CodedInputStream newCodedInput() {
        return com.google.protobuf.CodedInputStream.newInstance((java.lang.Iterable<java.nio.ByteBuffer>) asReadOnlyByteBufferList(), true);
    }

    @Override // com.google.protobuf.ByteString
    public java.io.InputStream newInput() {
        return new com.google.protobuf.RopeByteString.RopeInputStream();
    }

    private static class Balancer {
        private final java.util.ArrayDeque<com.google.protobuf.ByteString> prefixesStack;

        private Balancer() {
            this.prefixesStack = new java.util.ArrayDeque<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.google.protobuf.ByteString balance(com.google.protobuf.ByteString byteString, com.google.protobuf.ByteString byteString2) {
            doBalance(byteString);
            doBalance(byteString2);
            com.google.protobuf.ByteString byteStringPop = this.prefixesStack.pop();
            while (!this.prefixesStack.isEmpty()) {
                byteStringPop = new com.google.protobuf.RopeByteString(this.prefixesStack.pop(), byteStringPop);
            }
            return byteStringPop;
        }

        private void doBalance(com.google.protobuf.ByteString byteString) {
            if (byteString.isBalanced()) {
                insert(byteString);
            } else {
                if (byteString instanceof com.google.protobuf.RopeByteString) {
                    com.google.protobuf.RopeByteString ropeByteString = (com.google.protobuf.RopeByteString) byteString;
                    doBalance(ropeByteString.left);
                    doBalance(ropeByteString.right);
                    return;
                }
                throw new java.lang.IllegalArgumentException("Has a new type of ByteString been created? Found " + byteString.getClass());
            }
        }

        private void insert(com.google.protobuf.ByteString byteString) {
            int depthBinForLength = getDepthBinForLength(byteString.size());
            int iMinLength = com.google.protobuf.RopeByteString.minLength(depthBinForLength + 1);
            if (this.prefixesStack.isEmpty() || this.prefixesStack.peek().size() >= iMinLength) {
                this.prefixesStack.push(byteString);
                return;
            }
            int iMinLength2 = com.google.protobuf.RopeByteString.minLength(depthBinForLength);
            com.google.protobuf.ByteString byteStringPop = this.prefixesStack.pop();
            while (true) {
                if (this.prefixesStack.isEmpty() || this.prefixesStack.peek().size() >= iMinLength2) {
                    break;
                } else {
                    byteStringPop = new com.google.protobuf.RopeByteString(this.prefixesStack.pop(), byteStringPop);
                }
            }
            com.google.protobuf.RopeByteString ropeByteString = new com.google.protobuf.RopeByteString(byteStringPop, byteString);
            while (!this.prefixesStack.isEmpty()) {
                if (this.prefixesStack.peek().size() >= com.google.protobuf.RopeByteString.minLength(getDepthBinForLength(ropeByteString.size()) + 1)) {
                    break;
                } else {
                    ropeByteString = new com.google.protobuf.RopeByteString(this.prefixesStack.pop(), ropeByteString);
                }
            }
            this.prefixesStack.push(ropeByteString);
        }

        private int getDepthBinForLength(int i) {
            int iBinarySearch = java.util.Arrays.binarySearch(com.google.protobuf.RopeByteString.minLengthByDepth, i);
            return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
        }
    }

    private static final class PieceIterator implements java.util.Iterator<com.google.protobuf.ByteString.LeafByteString> {
        private final java.util.ArrayDeque<com.google.protobuf.RopeByteString> breadCrumbs;
        private com.google.protobuf.ByteString.LeafByteString next;

        private PieceIterator(com.google.protobuf.ByteString byteString) {
            if (byteString instanceof com.google.protobuf.RopeByteString) {
                com.google.protobuf.RopeByteString ropeByteString = (com.google.protobuf.RopeByteString) byteString;
                java.util.ArrayDeque<com.google.protobuf.RopeByteString> arrayDeque = new java.util.ArrayDeque<>(ropeByteString.getTreeDepth());
                this.breadCrumbs = arrayDeque;
                arrayDeque.push(ropeByteString);
                this.next = getLeafByLeft(ropeByteString.left);
                return;
            }
            this.breadCrumbs = null;
            this.next = (com.google.protobuf.ByteString.LeafByteString) byteString;
        }

        private com.google.protobuf.ByteString.LeafByteString getLeafByLeft(com.google.protobuf.ByteString byteString) {
            while (byteString instanceof com.google.protobuf.RopeByteString) {
                com.google.protobuf.RopeByteString ropeByteString = (com.google.protobuf.RopeByteString) byteString;
                this.breadCrumbs.push(ropeByteString);
                byteString = ropeByteString.left;
            }
            return (com.google.protobuf.ByteString.LeafByteString) byteString;
        }

        private com.google.protobuf.ByteString.LeafByteString getNextNonEmptyLeaf() {
            com.google.protobuf.ByteString.LeafByteString leafByLeft;
            do {
                java.util.ArrayDeque<com.google.protobuf.RopeByteString> arrayDeque = this.breadCrumbs;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    return null;
                }
                leafByLeft = getLeafByLeft(this.breadCrumbs.pop().right);
            } while (leafByLeft.isEmpty());
            return leafByLeft;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.next != null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public com.google.protobuf.ByteString.LeafByteString next() {
            com.google.protobuf.ByteString.LeafByteString leafByteString = this.next;
            if (leafByteString == null) {
                throw new java.util.NoSuchElementException();
            }
            this.next = getNextNonEmptyLeaf();
            return leafByteString;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    java.lang.Object writeReplace() {
        return com.google.protobuf.ByteString.wrap(toByteArray());
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException {
        throw new java.io.InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    private class RopeInputStream extends java.io.InputStream {
        private com.google.protobuf.ByteString.LeafByteString currentPiece;
        private int currentPieceIndex;
        private int currentPieceOffsetInRope;
        private int currentPieceSize;
        private int mark;
        private com.google.protobuf.RopeByteString.PieceIterator pieceIterator;

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        public RopeInputStream() {
            initialize();
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            bArr.getClass();
            if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
                throw new java.lang.IndexOutOfBoundsException();
            }
            int skipInternal = readSkipInternal(bArr, i, i2);
            if (skipInternal != 0) {
                return skipInternal;
            }
            if (i2 > 0 || availableInternal() == 0) {
                return -1;
            }
            return skipInternal;
        }

        @Override // java.io.InputStream
        public long skip(long j) {
            if (j < 0) {
                throw new java.lang.IndexOutOfBoundsException();
            }
            if (j > 2147483647L) {
                j = 2147483647L;
            }
            return readSkipInternal(null, 0, (int) j);
        }

        private int readSkipInternal(byte[] bArr, int i, int i2) {
            int i3 = i2;
            while (i3 > 0) {
                advanceIfCurrentPieceFullyRead();
                if (this.currentPiece == null) {
                    break;
                }
                int iMin = java.lang.Math.min(this.currentPieceSize - this.currentPieceIndex, i3);
                if (bArr != null) {
                    this.currentPiece.copyTo(bArr, this.currentPieceIndex, i, iMin);
                    i += iMin;
                }
                this.currentPieceIndex += iMin;
                i3 -= iMin;
            }
            return i2 - i3;
        }

        @Override // java.io.InputStream
        public int read() throws java.io.IOException {
            advanceIfCurrentPieceFullyRead();
            com.google.protobuf.ByteString.LeafByteString leafByteString = this.currentPiece;
            if (leafByteString == null) {
                return -1;
            }
            int i = this.currentPieceIndex;
            this.currentPieceIndex = i + 1;
            return leafByteString.byteAt(i) & 255;
        }

        @Override // java.io.InputStream
        public int available() throws java.io.IOException {
            return availableInternal();
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            this.mark = this.currentPieceOffsetInRope + this.currentPieceIndex;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            initialize();
            readSkipInternal(null, 0, this.mark);
        }

        private void initialize() {
            com.google.protobuf.RopeByteString.PieceIterator pieceIterator = new com.google.protobuf.RopeByteString.PieceIterator(com.google.protobuf.RopeByteString.this);
            this.pieceIterator = pieceIterator;
            com.google.protobuf.ByteString.LeafByteString next = pieceIterator.next();
            this.currentPiece = next;
            this.currentPieceSize = next.size();
            this.currentPieceIndex = 0;
            this.currentPieceOffsetInRope = 0;
        }

        private void advanceIfCurrentPieceFullyRead() {
            if (this.currentPiece != null) {
                int i = this.currentPieceIndex;
                int i2 = this.currentPieceSize;
                if (i == i2) {
                    this.currentPieceOffsetInRope += i2;
                    this.currentPieceIndex = 0;
                    if (this.pieceIterator.hasNext()) {
                        com.google.protobuf.ByteString.LeafByteString next = this.pieceIterator.next();
                        this.currentPiece = next;
                        this.currentPieceSize = next.size();
                    } else {
                        this.currentPiece = null;
                        this.currentPieceSize = 0;
                    }
                }
            }
        }

        private int availableInternal() {
            return com.google.protobuf.RopeByteString.this.size() - (this.currentPieceOffsetInRope + this.currentPieceIndex);
        }
    }
}
