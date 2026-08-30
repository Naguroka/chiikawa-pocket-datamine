package okio;

/* JADX INFO: compiled from: Options.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u0015B\u001f\b\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0011\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u000eH\u0096\u0002R\u001e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0006X\u0080\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lokio/Options;", "Lkotlin/collections/AbstractList;", "Lokio/ByteString;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "byteStrings", "", "trie", "", "([Lokio/ByteString;[I)V", "getByteStrings$okio", "()[Lokio/ByteString;", "[Lokio/ByteString;", "size", "", "getSize", "()I", "getTrie$okio", "()[I", "get", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "Companion", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Options extends kotlin.collections.AbstractList<okio.ByteString> implements java.util.RandomAccess {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final okio.Options.Companion INSTANCE = new okio.Options.Companion(null);
    private final okio.ByteString[] byteStrings;
    private final int[] trie;

    public /* synthetic */ Options(okio.ByteString[] byteStringArr, int[] iArr, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(byteStringArr, iArr);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.Options of(okio.ByteString... byteStringArr) {
        return INSTANCE.of(byteStringArr);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (obj instanceof okio.ByteString) {
            return contains((okio.ByteString) obj);
        }
        return false;
    }

    public /* bridge */ boolean contains(okio.ByteString byteString) {
        return super.contains(byteString);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(java.lang.Object obj) {
        if (obj instanceof okio.ByteString) {
            return indexOf((okio.ByteString) obj);
        }
        return -1;
    }

    public /* bridge */ int indexOf(okio.ByteString byteString) {
        return super.indexOf(byteString);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object obj) {
        if (obj instanceof okio.ByteString) {
            return lastIndexOf((okio.ByteString) obj);
        }
        return -1;
    }

    public /* bridge */ int lastIndexOf(okio.ByteString byteString) {
        return super.lastIndexOf(byteString);
    }

    /* JADX INFO: renamed from: getByteStrings$okio, reason: from getter */
    public final okio.ByteString[] getByteStrings() {
        return this.byteStrings;
    }

    /* JADX INFO: renamed from: getTrie$okio, reason: from getter */
    public final int[] getTrie() {
        return this.trie;
    }

    private Options(okio.ByteString[] byteStringArr, int[] iArr) {
        this.byteStrings = byteStringArr;
        this.trie = iArr;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.byteStrings.length;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public okio.ByteString get(int index) {
        return this.byteStrings[index];
    }

    /* JADX INFO: compiled from: Options.kt */
    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JT\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0002J!\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u0016\"\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0017R\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lokio/Options$Companion;", "", "()V", "intCount", "", "Lokio/Buffer;", "getIntCount", "(Lokio/Buffer;)J", "buildTrieRecursive", "", "nodeOffset", "node", "byteStringOffset", "", "byteStrings", "", "Lokio/ByteString;", "fromIndex", "toIndex", "indexes", "of", "Lokio/Options;", "", "([Lokio/ByteString;)Lokio/Options;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final okio.Options of(okio.ByteString... byteStrings) throws java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteStrings, "byteStrings");
            int i = 0;
            kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
            if (byteStrings.length == 0) {
                return new okio.Options(new okio.ByteString[0], new int[]{0, -1}, defaultConstructorMarker);
            }
            java.util.List mutableList = kotlin.collections.ArraysKt.toMutableList(byteStrings);
            kotlin.collections.CollectionsKt.sort(mutableList);
            java.util.ArrayList arrayList = new java.util.ArrayList(byteStrings.length);
            for (okio.ByteString byteString : byteStrings) {
                arrayList.add(-1);
            }
            java.lang.Integer[] numArr = (java.lang.Integer[]) arrayList.toArray(new java.lang.Integer[0]);
            java.util.List listMutableListOf = kotlin.collections.CollectionsKt.mutableListOf(java.util.Arrays.copyOf(numArr, numArr.length));
            int length = byteStrings.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                listMutableListOf.set(kotlin.collections.CollectionsKt.binarySearch$default(mutableList, byteStrings[i2], 0, 0, 6, (java.lang.Object) null), java.lang.Integer.valueOf(i3));
                i2++;
                i3++;
            }
            if (!(((okio.ByteString) mutableList.get(0)).size() > 0)) {
                throw new java.lang.IllegalArgumentException("the empty byte string is not a supported option".toString());
            }
            int i4 = 0;
            while (i4 < mutableList.size()) {
                okio.ByteString byteString2 = (okio.ByteString) mutableList.get(i4);
                int i5 = i4 + 1;
                int i6 = i5;
                while (i6 < mutableList.size()) {
                    okio.ByteString byteString3 = (okio.ByteString) mutableList.get(i6);
                    if (!byteString3.startsWith(byteString2)) {
                        break;
                    }
                    if (!(byteString3.size() != byteString2.size())) {
                        throw new java.lang.IllegalArgumentException(("duplicate option: " + byteString3).toString());
                    }
                    if (((java.lang.Number) listMutableListOf.get(i6)).intValue() > ((java.lang.Number) listMutableListOf.get(i4)).intValue()) {
                        mutableList.remove(i6);
                        listMutableListOf.remove(i6);
                    } else {
                        i6++;
                    }
                }
                i4 = i5;
            }
            okio.Buffer buffer = new okio.Buffer();
            buildTrieRecursive$default(this, 0L, buffer, 0, mutableList, 0, 0, listMutableListOf, 53, null);
            int[] iArr = new int[(int) getIntCount(buffer)];
            while (!buffer.exhausted()) {
                iArr[i] = buffer.readInt();
                i++;
            }
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(byteStrings, byteStrings.length);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
            return new okio.Options((okio.ByteString[]) objArrCopyOf, iArr, defaultConstructorMarker);
        }

        static /* synthetic */ void buildTrieRecursive$default(okio.Options.Companion companion, long j, okio.Buffer buffer, int i, java.util.List list, int i2, int i3, java.util.List list2, int i4, java.lang.Object obj) throws java.io.IOException {
            companion.buildTrieRecursive((i4 & 1) != 0 ? 0L : j, buffer, (i4 & 4) != 0 ? 0 : i, list, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? list.size() : i3, list2);
        }

        private final void buildTrieRecursive(long nodeOffset, okio.Buffer node, int byteStringOffset, java.util.List<? extends okio.ByteString> byteStrings, int fromIndex, int toIndex, java.util.List<java.lang.Integer> indexes) throws java.io.IOException {
            int i;
            int i2;
            int i3;
            int i4 = byteStringOffset;
            if (!(fromIndex < toIndex)) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            for (int i5 = fromIndex; i5 < toIndex; i5++) {
                if (!(byteStrings.get(i5).size() >= i4)) {
                    throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
                }
            }
            okio.ByteString byteString = byteStrings.get(fromIndex);
            okio.ByteString byteString2 = byteStrings.get(toIndex - 1);
            if (i4 == byteString.size()) {
                int iIntValue = indexes.get(fromIndex).intValue();
                int i6 = fromIndex + 1;
                okio.ByteString byteString3 = byteStrings.get(i6);
                i = i6;
                i2 = iIntValue;
                byteString = byteString3;
            } else {
                i = fromIndex;
                i2 = -1;
            }
            if (byteString.getByte(i4) != byteString2.getByte(i4)) {
                int i7 = 1;
                for (int i8 = i + 1; i8 < toIndex; i8++) {
                    if (byteStrings.get(i8 - 1).getByte(i4) != byteStrings.get(i8).getByte(i4)) {
                        i7++;
                    }
                }
                long intCount = nodeOffset + getIntCount(node) + ((long) 2) + ((long) (i7 * 2));
                node.writeInt(i7);
                node.writeInt(i2);
                for (int i9 = i; i9 < toIndex; i9++) {
                    byte b = byteStrings.get(i9).getByte(i4);
                    if (i9 == i || b != byteStrings.get(i9 - 1).getByte(i4)) {
                        node.writeInt(b & 255);
                    }
                }
                okio.Buffer buffer = new okio.Buffer();
                while (i < toIndex) {
                    byte b2 = byteStrings.get(i).getByte(i4);
                    int i10 = i + 1;
                    int i11 = i10;
                    while (true) {
                        if (i11 >= toIndex) {
                            i3 = toIndex;
                            break;
                        } else {
                            if (b2 != byteStrings.get(i11).getByte(i4)) {
                                i3 = i11;
                                break;
                            }
                            i11++;
                        }
                    }
                    if (i10 == i3 && i4 + 1 == byteStrings.get(i).size()) {
                        node.writeInt(indexes.get(i).intValue());
                    } else {
                        node.writeInt(((int) (intCount + getIntCount(buffer))) * (-1));
                        buildTrieRecursive(intCount, buffer, i4 + 1, byteStrings, i, i3, indexes);
                    }
                    i = i3;
                    buffer = buffer;
                }
                node.writeAll(buffer);
                return;
            }
            int iMin = java.lang.Math.min(byteString.size(), byteString2.size());
            int i12 = 0;
            for (int i13 = i4; i13 < iMin && byteString.getByte(i13) == byteString2.getByte(i13); i13++) {
                i12++;
            }
            long intCount2 = nodeOffset + getIntCount(node) + ((long) 2) + ((long) i12) + 1;
            node.writeInt(-i12);
            node.writeInt(i2);
            int i14 = i4 + i12;
            while (i4 < i14) {
                node.writeInt(byteString.getByte(i4) & 255);
                i4++;
            }
            if (i + 1 == toIndex) {
                if (!(i14 == byteStrings.get(i).size())) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                node.writeInt(indexes.get(i).intValue());
            } else {
                okio.Buffer buffer2 = new okio.Buffer();
                node.writeInt(((int) (getIntCount(buffer2) + intCount2)) * (-1));
                buildTrieRecursive(intCount2, buffer2, i14, byteStrings, i, toIndex, indexes);
                node.writeAll(buffer2);
            }
        }

        private final long getIntCount(okio.Buffer buffer) {
            return buffer.size() / ((long) 4);
        }
    }
}
