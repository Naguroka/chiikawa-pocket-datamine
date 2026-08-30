package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class RopeByteString extends androidx.datastore.preferences.protobuf.ByteString {
    static final int[] minLengthByDepth = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, org.objectweb.asm.Opcodes.D2F, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private static final long serialVersionUID = 1;
    private final androidx.datastore.preferences.protobuf.ByteString left;
    private final int leftLength;
    private final androidx.datastore.preferences.protobuf.ByteString right;
    private final int totalLength;
    private final int treeDepth;

    private RopeByteString(androidx.datastore.preferences.protobuf.ByteString left, androidx.datastore.preferences.protobuf.ByteString right) {
        this.left = left;
        this.right = right;
        int size = left.size();
        this.leftLength = size;
        this.totalLength = size + right.size();
        this.treeDepth = java.lang.Math.max(left.getTreeDepth(), right.getTreeDepth()) + 1;
    }

    static androidx.datastore.preferences.protobuf.ByteString concatenate(androidx.datastore.preferences.protobuf.ByteString left, androidx.datastore.preferences.protobuf.ByteString right) {
        if (right.size() == 0) {
            return left;
        }
        if (left.size() == 0) {
            return right;
        }
        int size = left.size() + right.size();
        if (size < 128) {
            return concatenateBytes(left, right);
        }
        if (left instanceof androidx.datastore.preferences.protobuf.RopeByteString) {
            androidx.datastore.preferences.protobuf.RopeByteString ropeByteString = (androidx.datastore.preferences.protobuf.RopeByteString) left;
            if (ropeByteString.right.size() + right.size() < 128) {
                return new androidx.datastore.preferences.protobuf.RopeByteString(ropeByteString.left, concatenateBytes(ropeByteString.right, right));
            }
            if (ropeByteString.left.getTreeDepth() > ropeByteString.right.getTreeDepth() && ropeByteString.getTreeDepth() > right.getTreeDepth()) {
                return new androidx.datastore.preferences.protobuf.RopeByteString(ropeByteString.left, new androidx.datastore.preferences.protobuf.RopeByteString(ropeByteString.right, right));
            }
        }
        if (size >= minLength(java.lang.Math.max(left.getTreeDepth(), right.getTreeDepth()) + 1)) {
            return new androidx.datastore.preferences.protobuf.RopeByteString(left, right);
        }
        return new androidx.datastore.preferences.protobuf.RopeByteString.Balancer().balance(left, right);
    }

    private static androidx.datastore.preferences.protobuf.ByteString concatenateBytes(androidx.datastore.preferences.protobuf.ByteString left, androidx.datastore.preferences.protobuf.ByteString right) {
        int size = left.size();
        int size2 = right.size();
        byte[] bArr = new byte[size + size2];
        left.copyTo(bArr, 0, 0, size);
        right.copyTo(bArr, 0, size, size2);
        return androidx.datastore.preferences.protobuf.ByteString.wrap(bArr);
    }

    static androidx.datastore.preferences.protobuf.RopeByteString newInstanceForTest(androidx.datastore.preferences.protobuf.ByteString left, androidx.datastore.preferences.protobuf.ByteString right) {
        return new androidx.datastore.preferences.protobuf.RopeByteString(left, right);
    }

    static int minLength(int depth) {
        int[] iArr = minLengthByDepth;
        if (depth >= iArr.length) {
            return Integer.MAX_VALUE;
        }
        return iArr[depth];
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public byte byteAt(int index) {
        checkIndex(index, this.totalLength);
        return internalByteAt(index);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    byte internalByteAt(int index) {
        int i = this.leftLength;
        if (index < i) {
            return this.left.internalByteAt(index);
        }
        return this.right.internalByteAt(index - i);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public int size() {
        return this.totalLength;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString, java.lang.Iterable
    /* JADX INFO: renamed from: iterator */
    public java.util.Iterator<java.lang.Byte> iterator2() {
        return new androidx.datastore.preferences.protobuf.ByteString.AbstractByteIterator() { // from class: androidx.datastore.preferences.protobuf.RopeByteString.1
            androidx.datastore.preferences.protobuf.ByteString.ByteIterator current = nextPiece();
            final androidx.datastore.preferences.protobuf.RopeByteString.PieceIterator pieces;

            {
                this.pieces = new androidx.datastore.preferences.protobuf.RopeByteString.PieceIterator(androidx.datastore.preferences.protobuf.RopeByteString.this);
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [androidx.datastore.preferences.protobuf.ByteString$ByteIterator] */
            private androidx.datastore.preferences.protobuf.ByteString.ByteIterator nextPiece() {
                if (this.pieces.hasNext()) {
                    return this.pieces.next().iterator();
                }
                return null;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.current != null;
            }

            @Override // androidx.datastore.preferences.protobuf.ByteString.ByteIterator
            public byte nextByte() {
                androidx.datastore.preferences.protobuf.ByteString.ByteIterator byteIterator = this.current;
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

    @Override // androidx.datastore.preferences.protobuf.ByteString
    protected int getTreeDepth() {
        return this.treeDepth;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    protected boolean isBalanced() {
        return this.totalLength >= minLength(this.treeDepth);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public androidx.datastore.preferences.protobuf.ByteString substring(int beginIndex, int endIndex) {
        int iCheckRange = checkRange(beginIndex, endIndex, this.totalLength);
        if (iCheckRange == 0) {
            return androidx.datastore.preferences.protobuf.ByteString.EMPTY;
        }
        if (iCheckRange == this.totalLength) {
            return this;
        }
        int i = this.leftLength;
        if (endIndex <= i) {
            return this.left.substring(beginIndex, endIndex);
        }
        if (beginIndex >= i) {
            return this.right.substring(beginIndex - i, endIndex - i);
        }
        return new androidx.datastore.preferences.protobuf.RopeByteString(this.left.substring(beginIndex), this.right.substring(0, endIndex - this.leftLength));
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    protected void copyToInternal(byte[] target, int sourceOffset, int targetOffset, int numberToCopy) {
        int i = sourceOffset + numberToCopy;
        int i2 = this.leftLength;
        if (i <= i2) {
            this.left.copyToInternal(target, sourceOffset, targetOffset, numberToCopy);
        } else {
            if (sourceOffset >= i2) {
                this.right.copyToInternal(target, sourceOffset - i2, targetOffset, numberToCopy);
                return;
            }
            int i3 = i2 - sourceOffset;
            this.left.copyToInternal(target, sourceOffset, targetOffset, i3);
            this.right.copyToInternal(target, 0, targetOffset + i3, numberToCopy - i3);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void copyTo(java.nio.ByteBuffer target) {
        this.left.copyTo(target);
        this.right.copyTo(target);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public java.nio.ByteBuffer asReadOnlyByteBuffer() {
        return java.nio.ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public java.util.List<java.nio.ByteBuffer> asReadOnlyByteBufferList() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        androidx.datastore.preferences.protobuf.RopeByteString.PieceIterator pieceIterator = new androidx.datastore.preferences.protobuf.RopeByteString.PieceIterator(this);
        while (pieceIterator.hasNext()) {
            arrayList.add(pieceIterator.next().asReadOnlyByteBuffer());
        }
        return arrayList;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void writeTo(java.io.OutputStream outputStream) throws java.io.IOException {
        this.left.writeTo(outputStream);
        this.right.writeTo(outputStream);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    void writeToInternal(java.io.OutputStream out, int sourceOffset, int numberToWrite) throws java.io.IOException {
        int i = sourceOffset + numberToWrite;
        int i2 = this.leftLength;
        if (i <= i2) {
            this.left.writeToInternal(out, sourceOffset, numberToWrite);
        } else {
            if (sourceOffset >= i2) {
                this.right.writeToInternal(out, sourceOffset - i2, numberToWrite);
                return;
            }
            int i3 = i2 - sourceOffset;
            this.left.writeToInternal(out, sourceOffset, i3);
            this.right.writeToInternal(out, 0, numberToWrite - i3);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    void writeTo(androidx.datastore.preferences.protobuf.ByteOutput output) throws java.io.IOException {
        this.left.writeTo(output);
        this.right.writeTo(output);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    void writeToReverse(androidx.datastore.preferences.protobuf.ByteOutput output) throws java.io.IOException {
        this.right.writeToReverse(output);
        this.left.writeToReverse(output);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    protected java.lang.String toStringInternal(java.nio.charset.Charset charset) {
        return new java.lang.String(toByteArray(), charset);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public boolean isValidUtf8() {
        int iPartialIsValidUtf8 = this.left.partialIsValidUtf8(0, 0, this.leftLength);
        androidx.datastore.preferences.protobuf.ByteString byteString = this.right;
        return byteString.partialIsValidUtf8(iPartialIsValidUtf8, 0, byteString.size()) == 0;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    protected int partialIsValidUtf8(int state, int offset, int length) {
        int i = offset + length;
        int i2 = this.leftLength;
        if (i <= i2) {
            return this.left.partialIsValidUtf8(state, offset, length);
        }
        if (offset >= i2) {
            return this.right.partialIsValidUtf8(state, offset - i2, length);
        }
        int i3 = i2 - offset;
        return this.right.partialIsValidUtf8(this.left.partialIsValidUtf8(state, offset, i3), 0, length - i3);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public boolean equals(java.lang.Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof androidx.datastore.preferences.protobuf.ByteString)) {
            return false;
        }
        androidx.datastore.preferences.protobuf.ByteString byteString = (androidx.datastore.preferences.protobuf.ByteString) other;
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

    private boolean equalsFragments(androidx.datastore.preferences.protobuf.ByteString byteString) {
        boolean zEqualsRange;
        androidx.datastore.preferences.protobuf.ByteString.LeafByteString next;
        androidx.datastore.preferences.protobuf.RopeByteString.PieceIterator pieceIterator = new androidx.datastore.preferences.protobuf.RopeByteString.PieceIterator(this);
        androidx.datastore.preferences.protobuf.ByteString.LeafByteString next2 = pieceIterator.next();
        androidx.datastore.preferences.protobuf.RopeByteString.PieceIterator pieceIterator2 = new androidx.datastore.preferences.protobuf.RopeByteString.PieceIterator(byteString);
        androidx.datastore.preferences.protobuf.ByteString.LeafByteString next3 = pieceIterator2.next();
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

    @Override // androidx.datastore.preferences.protobuf.ByteString
    protected int partialHash(int h, int offset, int length) {
        int i = offset + length;
        int i2 = this.leftLength;
        if (i <= i2) {
            return this.left.partialHash(h, offset, length);
        }
        if (offset >= i2) {
            return this.right.partialHash(h, offset - i2, length);
        }
        int i3 = i2 - offset;
        return this.right.partialHash(this.left.partialHash(h, offset, i3), 0, length - i3);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public androidx.datastore.preferences.protobuf.CodedInputStream newCodedInput() {
        return androidx.datastore.preferences.protobuf.CodedInputStream.newInstance((java.lang.Iterable<java.nio.ByteBuffer>) asReadOnlyByteBufferList(), true);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public java.io.InputStream newInput() {
        return new androidx.datastore.preferences.protobuf.RopeByteString.RopeInputStream();
    }

    private static class Balancer {
        private final java.util.ArrayDeque<androidx.datastore.preferences.protobuf.ByteString> prefixesStack;

        private Balancer() {
            this.prefixesStack = new java.util.ArrayDeque<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public androidx.datastore.preferences.protobuf.ByteString balance(androidx.datastore.preferences.protobuf.ByteString left, androidx.datastore.preferences.protobuf.ByteString right) {
            doBalance(left);
            doBalance(right);
            androidx.datastore.preferences.protobuf.ByteString byteStringPop = this.prefixesStack.pop();
            while (!this.prefixesStack.isEmpty()) {
                byteStringPop = new androidx.datastore.preferences.protobuf.RopeByteString(this.prefixesStack.pop(), byteStringPop);
            }
            return byteStringPop;
        }

        private void doBalance(androidx.datastore.preferences.protobuf.ByteString root) {
            if (root.isBalanced()) {
                insert(root);
            } else {
                if (root instanceof androidx.datastore.preferences.protobuf.RopeByteString) {
                    androidx.datastore.preferences.protobuf.RopeByteString ropeByteString = (androidx.datastore.preferences.protobuf.RopeByteString) root;
                    doBalance(ropeByteString.left);
                    doBalance(ropeByteString.right);
                    return;
                }
                throw new java.lang.IllegalArgumentException("Has a new type of ByteString been created? Found " + root.getClass());
            }
        }

        private void insert(androidx.datastore.preferences.protobuf.ByteString byteString) {
            int depthBinForLength = getDepthBinForLength(byteString.size());
            int iMinLength = androidx.datastore.preferences.protobuf.RopeByteString.minLength(depthBinForLength + 1);
            if (this.prefixesStack.isEmpty() || this.prefixesStack.peek().size() >= iMinLength) {
                this.prefixesStack.push(byteString);
                return;
            }
            int iMinLength2 = androidx.datastore.preferences.protobuf.RopeByteString.minLength(depthBinForLength);
            androidx.datastore.preferences.protobuf.ByteString byteStringPop = this.prefixesStack.pop();
            while (true) {
                if (this.prefixesStack.isEmpty() || this.prefixesStack.peek().size() >= iMinLength2) {
                    break;
                } else {
                    byteStringPop = new androidx.datastore.preferences.protobuf.RopeByteString(this.prefixesStack.pop(), byteStringPop);
                }
            }
            androidx.datastore.preferences.protobuf.RopeByteString ropeByteString = new androidx.datastore.preferences.protobuf.RopeByteString(byteStringPop, byteString);
            while (!this.prefixesStack.isEmpty()) {
                if (this.prefixesStack.peek().size() >= androidx.datastore.preferences.protobuf.RopeByteString.minLength(getDepthBinForLength(ropeByteString.size()) + 1)) {
                    break;
                } else {
                    ropeByteString = new androidx.datastore.preferences.protobuf.RopeByteString(this.prefixesStack.pop(), ropeByteString);
                }
            }
            this.prefixesStack.push(ropeByteString);
        }

        private int getDepthBinForLength(int length) {
            int iBinarySearch = java.util.Arrays.binarySearch(androidx.datastore.preferences.protobuf.RopeByteString.minLengthByDepth, length);
            return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
        }
    }

    private static final class PieceIterator implements java.util.Iterator<androidx.datastore.preferences.protobuf.ByteString.LeafByteString> {
        private final java.util.ArrayDeque<androidx.datastore.preferences.protobuf.RopeByteString> breadCrumbs;
        private androidx.datastore.preferences.protobuf.ByteString.LeafByteString next;

        private PieceIterator(androidx.datastore.preferences.protobuf.ByteString root) {
            if (root instanceof androidx.datastore.preferences.protobuf.RopeByteString) {
                androidx.datastore.preferences.protobuf.RopeByteString ropeByteString = (androidx.datastore.preferences.protobuf.RopeByteString) root;
                java.util.ArrayDeque<androidx.datastore.preferences.protobuf.RopeByteString> arrayDeque = new java.util.ArrayDeque<>(ropeByteString.getTreeDepth());
                this.breadCrumbs = arrayDeque;
                arrayDeque.push(ropeByteString);
                this.next = getLeafByLeft(ropeByteString.left);
                return;
            }
            this.breadCrumbs = null;
            this.next = (androidx.datastore.preferences.protobuf.ByteString.LeafByteString) root;
        }

        private androidx.datastore.preferences.protobuf.ByteString.LeafByteString getLeafByLeft(androidx.datastore.preferences.protobuf.ByteString root) {
            while (root instanceof androidx.datastore.preferences.protobuf.RopeByteString) {
                androidx.datastore.preferences.protobuf.RopeByteString ropeByteString = (androidx.datastore.preferences.protobuf.RopeByteString) root;
                this.breadCrumbs.push(ropeByteString);
                root = ropeByteString.left;
            }
            return (androidx.datastore.preferences.protobuf.ByteString.LeafByteString) root;
        }

        private androidx.datastore.preferences.protobuf.ByteString.LeafByteString getNextNonEmptyLeaf() {
            androidx.datastore.preferences.protobuf.ByteString.LeafByteString leafByLeft;
            do {
                java.util.ArrayDeque<androidx.datastore.preferences.protobuf.RopeByteString> arrayDeque = this.breadCrumbs;
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
        public androidx.datastore.preferences.protobuf.ByteString.LeafByteString next() {
            androidx.datastore.preferences.protobuf.ByteString.LeafByteString leafByteString = this.next;
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
        return androidx.datastore.preferences.protobuf.ByteString.wrap(toByteArray());
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException {
        throw new java.io.InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    private class RopeInputStream extends java.io.InputStream {
        private androidx.datastore.preferences.protobuf.ByteString.LeafByteString currentPiece;
        private int currentPieceIndex;
        private int currentPieceOffsetInRope;
        private int currentPieceSize;
        private int mark;
        private androidx.datastore.preferences.protobuf.RopeByteString.PieceIterator pieceIterator;

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        public RopeInputStream() {
            initialize();
        }

        @Override // java.io.InputStream
        public int read(byte[] b, int offset, int length) {
            b.getClass();
            if (offset < 0 || length < 0 || length > b.length - offset) {
                throw new java.lang.IndexOutOfBoundsException();
            }
            int skipInternal = readSkipInternal(b, offset, length);
            if (skipInternal != 0) {
                return skipInternal;
            }
            if (length > 0 || availableInternal() == 0) {
                return -1;
            }
            return skipInternal;
        }

        @Override // java.io.InputStream
        public long skip(long length) {
            if (length < 0) {
                throw new java.lang.IndexOutOfBoundsException();
            }
            if (length > 2147483647L) {
                length = 2147483647L;
            }
            return readSkipInternal(null, 0, (int) length);
        }

        private int readSkipInternal(byte[] b, int offset, int length) {
            int i = length;
            while (i > 0) {
                advanceIfCurrentPieceFullyRead();
                if (this.currentPiece == null) {
                    break;
                }
                int iMin = java.lang.Math.min(this.currentPieceSize - this.currentPieceIndex, i);
                if (b != null) {
                    this.currentPiece.copyTo(b, this.currentPieceIndex, offset, iMin);
                    offset += iMin;
                }
                this.currentPieceIndex += iMin;
                i -= iMin;
            }
            return length - i;
        }

        @Override // java.io.InputStream
        public int read() throws java.io.IOException {
            advanceIfCurrentPieceFullyRead();
            androidx.datastore.preferences.protobuf.ByteString.LeafByteString leafByteString = this.currentPiece;
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
        public void mark(int readAheadLimit) {
            this.mark = this.currentPieceOffsetInRope + this.currentPieceIndex;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            initialize();
            readSkipInternal(null, 0, this.mark);
        }

        private void initialize() {
            androidx.datastore.preferences.protobuf.RopeByteString.PieceIterator pieceIterator = new androidx.datastore.preferences.protobuf.RopeByteString.PieceIterator(androidx.datastore.preferences.protobuf.RopeByteString.this);
            this.pieceIterator = pieceIterator;
            androidx.datastore.preferences.protobuf.ByteString.LeafByteString next = pieceIterator.next();
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
                        androidx.datastore.preferences.protobuf.ByteString.LeafByteString next = this.pieceIterator.next();
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
            return androidx.datastore.preferences.protobuf.RopeByteString.this.size() - (this.currentPieceOffsetInRope + this.currentPieceIndex);
        }
    }
}
