package okhttp3.internal.http2;

/* JADX INFO: compiled from: Hpack.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005J\u0014\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u0019\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/http2/Hpack;", "", "()V", "NAME_TO_FIRST_INDEX", "", "Lokio/ByteString;", "", "getNAME_TO_FIRST_INDEX", "()Ljava/util/Map;", "PREFIX_4_BITS", "PREFIX_5_BITS", "PREFIX_6_BITS", "PREFIX_7_BITS", "SETTINGS_HEADER_TABLE_SIZE", "SETTINGS_HEADER_TABLE_SIZE_LIMIT", "STATIC_HEADER_TABLE", "", "Lokhttp3/internal/http2/Header;", "getSTATIC_HEADER_TABLE", "()[Lokhttp3/internal/http2/Header;", "[Lokhttp3/internal/http2/Header;", "checkLowercase", "name", "nameToFirstIndex", "Reader", "Writer", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Hpack {
    public static final okhttp3.internal.http2.Hpack INSTANCE;
    private static final java.util.Map<okio.ByteString, java.lang.Integer> NAME_TO_FIRST_INDEX;
    private static final int PREFIX_4_BITS = 15;
    private static final int PREFIX_5_BITS = 31;
    private static final int PREFIX_6_BITS = 63;
    private static final int PREFIX_7_BITS = 127;
    private static final int SETTINGS_HEADER_TABLE_SIZE = 4096;
    private static final int SETTINGS_HEADER_TABLE_SIZE_LIMIT = 16384;
    private static final okhttp3.internal.http2.Header[] STATIC_HEADER_TABLE;

    private Hpack() {
    }

    public final okhttp3.internal.http2.Header[] getSTATIC_HEADER_TABLE() {
        return STATIC_HEADER_TABLE;
    }

    static {
        okhttp3.internal.http2.Hpack hpack = new okhttp3.internal.http2.Hpack();
        INSTANCE = hpack;
        STATIC_HEADER_TABLE = new okhttp3.internal.http2.Header[]{new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.TARGET_AUTHORITY, ""), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.TARGET_METHOD, "GET"), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.TARGET_METHOD, "POST"), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.TARGET_PATH, "/"), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.TARGET_PATH, "/index.html"), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.TARGET_SCHEME, androidx.webkit.ProxyConfig.MATCH_HTTP), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.TARGET_SCHEME, "https"), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.RESPONSE_STATUS, "200"), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.RESPONSE_STATUS, "204"), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.RESPONSE_STATUS, "206"), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.RESPONSE_STATUS, "304"), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.RESPONSE_STATUS, "400"), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.RESPONSE_STATUS, "404"), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.RESPONSE_STATUS, "500"), new okhttp3.internal.http2.Header("accept-charset", ""), new okhttp3.internal.http2.Header("accept-encoding", "gzip, deflate"), new okhttp3.internal.http2.Header("accept-language", ""), new okhttp3.internal.http2.Header("accept-ranges", ""), new okhttp3.internal.http2.Header("accept", ""), new okhttp3.internal.http2.Header("access-control-allow-origin", ""), new okhttp3.internal.http2.Header(com.json.mediationsdk.IronSourceSegment.AGE, ""), new okhttp3.internal.http2.Header("allow", ""), new okhttp3.internal.http2.Header("authorization", ""), new okhttp3.internal.http2.Header("cache-control", ""), new okhttp3.internal.http2.Header("content-disposition", ""), new okhttp3.internal.http2.Header("content-encoding", ""), new okhttp3.internal.http2.Header("content-language", ""), new okhttp3.internal.http2.Header("content-length", ""), new okhttp3.internal.http2.Header("content-location", ""), new okhttp3.internal.http2.Header("content-range", ""), new okhttp3.internal.http2.Header("content-type", ""), new okhttp3.internal.http2.Header("cookie", ""), new okhttp3.internal.http2.Header("date", ""), new okhttp3.internal.http2.Header("etag", ""), new okhttp3.internal.http2.Header("expect", ""), new okhttp3.internal.http2.Header("expires", ""), new okhttp3.internal.http2.Header("from", ""), new okhttp3.internal.http2.Header("host", ""), new okhttp3.internal.http2.Header("if-match", ""), new okhttp3.internal.http2.Header("if-modified-since", ""), new okhttp3.internal.http2.Header("if-none-match", ""), new okhttp3.internal.http2.Header("if-range", ""), new okhttp3.internal.http2.Header("if-unmodified-since", ""), new okhttp3.internal.http2.Header("last-modified", ""), new okhttp3.internal.http2.Header("link", ""), new okhttp3.internal.http2.Header(com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION, ""), new okhttp3.internal.http2.Header("max-forwards", ""), new okhttp3.internal.http2.Header("proxy-authenticate", ""), new okhttp3.internal.http2.Header("proxy-authorization", ""), new okhttp3.internal.http2.Header("range", ""), new okhttp3.internal.http2.Header("referer", ""), new okhttp3.internal.http2.Header("refresh", ""), new okhttp3.internal.http2.Header("retry-after", ""), new okhttp3.internal.http2.Header(com.json.dm.f2587a, ""), new okhttp3.internal.http2.Header("set-cookie", ""), new okhttp3.internal.http2.Header("strict-transport-security", ""), new okhttp3.internal.http2.Header("transfer-encoding", ""), new okhttp3.internal.http2.Header("user-agent", ""), new okhttp3.internal.http2.Header("vary", ""), new okhttp3.internal.http2.Header("via", ""), new okhttp3.internal.http2.Header("www-authenticate", "")};
        NAME_TO_FIRST_INDEX = hpack.nameToFirstIndex();
    }

    public final java.util.Map<okio.ByteString, java.lang.Integer> getNAME_TO_FIRST_INDEX() {
        return NAME_TO_FIRST_INDEX;
    }

    /* JADX INFO: compiled from: Hpack.kt */
    @kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0002J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u001aJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\u0018\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\nH\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010!\u001a\u00020\u0005H\u0002J\u0006\u0010\"\u001a\u00020\u001cJ\u0006\u0010#\u001a\u00020\u0013J\u0010\u0010$\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\u0016\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u0005J\u0010\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u0005H\u0002J\b\u0010*\u001a\u00020\u0013H\u0002J\u0010\u0010+\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\b\u0010,\u001a\u00020\u0013H\u0002R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lokhttp3/internal/http2/Hpack$Reader;", "", "source", "Lokio/Source;", "headerTableSizeSetting", "", "maxDynamicTableByteCount", "(Lokio/Source;II)V", "dynamicTable", "", "Lokhttp3/internal/http2/Header;", "[Lokhttp3/internal/http2/Header;", "dynamicTableByteCount", "headerCount", "headerList", "", "nextHeaderIndex", "Lokio/BufferedSource;", "adjustDynamicTableByteCount", "", "clearDynamicTable", "dynamicTableIndex", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "evictToRecoverBytes", "bytesToRecover", "getAndResetHeaderList", "", "getName", "Lokio/ByteString;", "insertIntoDynamicTable", "entry", "isStaticHeader", "", "readByte", "readByteString", "readHeaders", "readIndexedHeader", "readInt", "firstByte", "prefixMask", "readLiteralHeaderWithIncrementalIndexingIndexedName", "nameIndex", "readLiteralHeaderWithIncrementalIndexingNewName", "readLiteralHeaderWithoutIndexingIndexedName", "readLiteralHeaderWithoutIndexingNewName", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Reader {
        public okhttp3.internal.http2.Header[] dynamicTable;
        public int dynamicTableByteCount;
        public int headerCount;
        private final java.util.List<okhttp3.internal.http2.Header> headerList;
        private final int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final okio.BufferedSource source;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Reader(okio.Source source, int i) {
            this(source, i, 0, 4, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        }

        public Reader(okio.Source source, int i, int i2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            this.headerTableSizeSetting = i;
            this.maxDynamicTableByteCount = i2;
            this.headerList = new java.util.ArrayList();
            this.source = okio.Okio.buffer(source);
            okhttp3.internal.http2.Header[] headerArr = new okhttp3.internal.http2.Header[8];
            this.dynamicTable = headerArr;
            this.nextHeaderIndex = headerArr.length - 1;
        }

        public /* synthetic */ Reader(okio.Source source, int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(source, i, (i3 & 4) != 0 ? i : i2);
        }

        public final java.util.List<okhttp3.internal.http2.Header> getAndResetHeaderList() {
            java.util.List<okhttp3.internal.http2.Header> list = kotlin.collections.CollectionsKt.toList(this.headerList);
            this.headerList.clear();
            return list;
        }

        /* JADX INFO: renamed from: maxDynamicTableByteCount, reason: from getter */
        public final int getMaxDynamicTableByteCount() {
            return this.maxDynamicTableByteCount;
        }

        private final void adjustDynamicTableByteCount() {
            int i = this.maxDynamicTableByteCount;
            int i2 = this.dynamicTableByteCount;
            if (i < i2) {
                if (i == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i2 - i);
                }
            }
        }

        private final void clearDynamicTable() {
            kotlin.collections.ArraysKt.fill$default(this.dynamicTable, (java.lang.Object) null, 0, 0, 6, (java.lang.Object) null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int evictToRecoverBytes(int bytesToRecover) {
            int i;
            int i2 = 0;
            if (bytesToRecover > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i = this.nextHeaderIndex;
                    if (length < i || bytesToRecover <= 0) {
                        break;
                    }
                    okhttp3.internal.http2.Header header = this.dynamicTable[length];
                    kotlin.jvm.internal.Intrinsics.checkNotNull(header);
                    bytesToRecover -= header.hpackSize;
                    this.dynamicTableByteCount -= header.hpackSize;
                    this.headerCount--;
                    i2++;
                }
                okhttp3.internal.http2.Header[] headerArr = this.dynamicTable;
                java.lang.System.arraycopy(headerArr, i + 1, headerArr, i + 1 + i2, this.headerCount);
                this.nextHeaderIndex += i2;
            }
            return i2;
        }

        public final void readHeaders() throws java.io.IOException {
            while (!this.source.exhausted()) {
                int iAnd = okhttp3.internal.Util.and(this.source.readByte(), 255);
                if (iAnd == 128) {
                    throw new java.io.IOException("index == 0");
                }
                if ((iAnd & 128) == 128) {
                    readIndexedHeader(readInt(iAnd, 127) - 1);
                } else if (iAnd == 64) {
                    readLiteralHeaderWithIncrementalIndexingNewName();
                } else if ((iAnd & 64) == 64) {
                    readLiteralHeaderWithIncrementalIndexingIndexedName(readInt(iAnd, 63) - 1);
                } else if ((iAnd & 32) == 32) {
                    int i = readInt(iAnd, 31);
                    this.maxDynamicTableByteCount = i;
                    if (i < 0 || i > this.headerTableSizeSetting) {
                        throw new java.io.IOException("Invalid dynamic table size update " + this.maxDynamicTableByteCount);
                    }
                    adjustDynamicTableByteCount();
                } else if (iAnd == 16 || iAnd == 0) {
                    readLiteralHeaderWithoutIndexingNewName();
                } else {
                    readLiteralHeaderWithoutIndexingIndexedName(readInt(iAnd, 15) - 1);
                }
            }
        }

        private final void readIndexedHeader(int index) throws java.io.IOException {
            if (isStaticHeader(index)) {
                this.headerList.add(okhttp3.internal.http2.Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[index]);
                return;
            }
            int iDynamicTableIndex = dynamicTableIndex(index - okhttp3.internal.http2.Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (iDynamicTableIndex >= 0) {
                okhttp3.internal.http2.Header[] headerArr = this.dynamicTable;
                if (iDynamicTableIndex < headerArr.length) {
                    java.util.List<okhttp3.internal.http2.Header> list = this.headerList;
                    okhttp3.internal.http2.Header header = headerArr[iDynamicTableIndex];
                    kotlin.jvm.internal.Intrinsics.checkNotNull(header);
                    list.add(header);
                    return;
                }
            }
            throw new java.io.IOException("Header index too large " + (index + 1));
        }

        private final int dynamicTableIndex(int index) {
            return this.nextHeaderIndex + 1 + index;
        }

        private final void readLiteralHeaderWithoutIndexingIndexedName(int index) throws java.io.IOException {
            this.headerList.add(new okhttp3.internal.http2.Header(getName(index), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingNewName() throws java.io.IOException {
            this.headerList.add(new okhttp3.internal.http2.Header(okhttp3.internal.http2.Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        private final void readLiteralHeaderWithIncrementalIndexingIndexedName(int nameIndex) throws java.io.IOException {
            insertIntoDynamicTable(-1, new okhttp3.internal.http2.Header(getName(nameIndex), readByteString()));
        }

        private final void readLiteralHeaderWithIncrementalIndexingNewName() throws java.io.IOException {
            insertIntoDynamicTable(-1, new okhttp3.internal.http2.Header(okhttp3.internal.http2.Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        private final okio.ByteString getName(int index) throws java.io.IOException {
            if (isStaticHeader(index)) {
                return okhttp3.internal.http2.Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[index].name;
            }
            int iDynamicTableIndex = dynamicTableIndex(index - okhttp3.internal.http2.Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (iDynamicTableIndex >= 0) {
                okhttp3.internal.http2.Header[] headerArr = this.dynamicTable;
                if (iDynamicTableIndex < headerArr.length) {
                    okhttp3.internal.http2.Header header = headerArr[iDynamicTableIndex];
                    kotlin.jvm.internal.Intrinsics.checkNotNull(header);
                    return header.name;
                }
            }
            throw new java.io.IOException("Header index too large " + (index + 1));
        }

        private final boolean isStaticHeader(int index) {
            return index >= 0 && index <= okhttp3.internal.http2.Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length - 1;
        }

        private final void insertIntoDynamicTable(int index, okhttp3.internal.http2.Header entry) {
            this.headerList.add(entry);
            int i = entry.hpackSize;
            if (index != -1) {
                okhttp3.internal.http2.Header header = this.dynamicTable[dynamicTableIndex(index)];
                kotlin.jvm.internal.Intrinsics.checkNotNull(header);
                i -= header.hpackSize;
            }
            int i2 = this.maxDynamicTableByteCount;
            if (i > i2) {
                clearDynamicTable();
                return;
            }
            int iEvictToRecoverBytes = evictToRecoverBytes((this.dynamicTableByteCount + i) - i2);
            if (index == -1) {
                int i3 = this.headerCount + 1;
                okhttp3.internal.http2.Header[] headerArr = this.dynamicTable;
                if (i3 > headerArr.length) {
                    okhttp3.internal.http2.Header[] headerArr2 = new okhttp3.internal.http2.Header[headerArr.length * 2];
                    java.lang.System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                    this.nextHeaderIndex = this.dynamicTable.length - 1;
                    this.dynamicTable = headerArr2;
                }
                int i4 = this.nextHeaderIndex;
                this.nextHeaderIndex = i4 - 1;
                this.dynamicTable[i4] = entry;
                this.headerCount++;
            } else {
                this.dynamicTable[index + dynamicTableIndex(index) + iEvictToRecoverBytes] = entry;
            }
            this.dynamicTableByteCount += i;
        }

        private final int readByte() throws java.io.IOException {
            return okhttp3.internal.Util.and(this.source.readByte(), 255);
        }

        public final int readInt(int firstByte, int prefixMask) throws java.io.IOException {
            int i = firstByte & prefixMask;
            if (i < prefixMask) {
                return i;
            }
            int i2 = 0;
            while (true) {
                int i3 = readByte();
                if ((i3 & 128) == 0) {
                    return prefixMask + (i3 << i2);
                }
                prefixMask += (i3 & 127) << i2;
                i2 += 7;
            }
        }

        public final okio.ByteString readByteString() throws java.io.IOException {
            int i = readByte();
            boolean z = (i & 128) == 128;
            long j = readInt(i, 127);
            if (z) {
                okio.Buffer buffer = new okio.Buffer();
                okhttp3.internal.http2.Huffman.INSTANCE.decode(this.source, j, buffer);
                return buffer.readByteString();
            }
            return this.source.readByteString(j);
        }
    }

    private final java.util.Map<okio.ByteString, java.lang.Integer> nameToFirstIndex() {
        okhttp3.internal.http2.Header[] headerArr = STATIC_HEADER_TABLE;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(headerArr.length);
        int length = headerArr.length;
        for (int i = 0; i < length; i++) {
            okhttp3.internal.http2.Header[] headerArr2 = STATIC_HEADER_TABLE;
            if (!linkedHashMap.containsKey(headerArr2[i].name)) {
                linkedHashMap.put(headerArr2[i].name, java.lang.Integer.valueOf(i));
            }
        }
        java.util.Map<okio.ByteString, java.lang.Integer> mapUnmodifiableMap = java.util.Collections.unmodifiableMap(linkedHashMap);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(result)");
        return mapUnmodifiableMap;
    }

    /* JADX INFO: compiled from: Hpack.kt */
    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003H\u0002J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u000bH\u0002J\u000e\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dJ\u0014\u0010\u001e\u001a\u00020\u00142\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0 J\u001e\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0003R\u001c\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\fR\u0012\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lokhttp3/internal/http2/Hpack$Writer;", "", "headerTableSizeSetting", "", "useCompression", "", "out", "Lokio/Buffer;", "(IZLokio/Buffer;)V", "dynamicTable", "", "Lokhttp3/internal/http2/Header;", "[Lokhttp3/internal/http2/Header;", "dynamicTableByteCount", "emitDynamicTableSizeUpdate", "headerCount", "maxDynamicTableByteCount", "nextHeaderIndex", "smallestHeaderTableSizeSetting", "adjustDynamicTableByteCount", "", "clearDynamicTable", "evictToRecoverBytes", "bytesToRecover", "insertIntoDynamicTable", "entry", "resizeHeaderTable", "writeByteString", "data", "Lokio/ByteString;", "writeHeaders", "headerBlock", "", "writeInt", "value", "prefixMask", "bits", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Writer {
        public okhttp3.internal.http2.Header[] dynamicTable;
        public int dynamicTableByteCount;
        private boolean emitDynamicTableSizeUpdate;
        public int headerCount;
        public int headerTableSizeSetting;
        public int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final okio.Buffer out;
        private int smallestHeaderTableSizeSetting;
        private final boolean useCompression;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Writer(int i, okio.Buffer out) {
            this(i, false, out, 2, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "out");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Writer(okio.Buffer out) {
            this(0, false, out, 3, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "out");
        }

        public Writer(int i, boolean z, okio.Buffer out) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "out");
            this.headerTableSizeSetting = i;
            this.useCompression = z;
            this.out = out;
            this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
            this.maxDynamicTableByteCount = i;
            okhttp3.internal.http2.Header[] headerArr = new okhttp3.internal.http2.Header[8];
            this.dynamicTable = headerArr;
            this.nextHeaderIndex = headerArr.length - 1;
        }

        public /* synthetic */ Writer(int i, boolean z, okio.Buffer buffer, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 4096 : i, (i2 & 2) != 0 ? true : z, buffer);
        }

        private final void clearDynamicTable() {
            kotlin.collections.ArraysKt.fill$default(this.dynamicTable, (java.lang.Object) null, 0, 0, 6, (java.lang.Object) null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int evictToRecoverBytes(int bytesToRecover) {
            int i;
            int i2 = 0;
            if (bytesToRecover > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i = this.nextHeaderIndex;
                    if (length < i || bytesToRecover <= 0) {
                        break;
                    }
                    okhttp3.internal.http2.Header header = this.dynamicTable[length];
                    kotlin.jvm.internal.Intrinsics.checkNotNull(header);
                    bytesToRecover -= header.hpackSize;
                    int i3 = this.dynamicTableByteCount;
                    okhttp3.internal.http2.Header header2 = this.dynamicTable[length];
                    kotlin.jvm.internal.Intrinsics.checkNotNull(header2);
                    this.dynamicTableByteCount = i3 - header2.hpackSize;
                    this.headerCount--;
                    i2++;
                }
                okhttp3.internal.http2.Header[] headerArr = this.dynamicTable;
                java.lang.System.arraycopy(headerArr, i + 1, headerArr, i + 1 + i2, this.headerCount);
                okhttp3.internal.http2.Header[] headerArr2 = this.dynamicTable;
                int i4 = this.nextHeaderIndex;
                java.util.Arrays.fill(headerArr2, i4 + 1, i4 + 1 + i2, (java.lang.Object) null);
                this.nextHeaderIndex += i2;
            }
            return i2;
        }

        private final void insertIntoDynamicTable(okhttp3.internal.http2.Header entry) {
            int i = entry.hpackSize;
            int i2 = this.maxDynamicTableByteCount;
            if (i > i2) {
                clearDynamicTable();
                return;
            }
            evictToRecoverBytes((this.dynamicTableByteCount + i) - i2);
            int i3 = this.headerCount + 1;
            okhttp3.internal.http2.Header[] headerArr = this.dynamicTable;
            if (i3 > headerArr.length) {
                okhttp3.internal.http2.Header[] headerArr2 = new okhttp3.internal.http2.Header[headerArr.length * 2];
                java.lang.System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = headerArr2;
            }
            int i4 = this.nextHeaderIndex;
            this.nextHeaderIndex = i4 - 1;
            this.dynamicTable[i4] = entry;
            this.headerCount++;
            this.dynamicTableByteCount += i;
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0082  */
        /* JADX WARN: Code duplicated, block: B:29:0x0089  */
        /* JADX WARN: Code duplicated, block: B:31:0x0091  */
        /* JADX WARN: Code duplicated, block: B:33:0x00a0  */
        /* JADX WARN: Code duplicated, block: B:36:0x00bb A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:37:0x00bd  */
        /* JADX WARN: Code duplicated, block: B:40:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:41:0x00d6  */
        /* JADX WARN: Code duplicated, block: B:43:0x00da  */
        /* JADX WARN: Code duplicated, block: B:44:0x00e9  */
        /* JADX WARN: Code duplicated, block: B:49:0x0102  */
        /* JADX WARN: Code duplicated, block: B:57:0x00af A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:60:0x00c9 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:61:0x00c9 A[SYNTHETIC] */
        public final void writeHeaders(java.util.List<okhttp3.internal.http2.Header> headerBlock) throws java.io.IOException {
            int length;
            int length2;
            int i;
            int length3;
            okhttp3.internal.http2.Header header;
            okhttp3.internal.http2.Header header2;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            if (this.emitDynamicTableSizeUpdate) {
                int i2 = this.smallestHeaderTableSizeSetting;
                if (i2 < this.maxDynamicTableByteCount) {
                    writeInt(i2, 31, 32);
                }
                this.emitDynamicTableSizeUpdate = false;
                this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
                writeInt(this.maxDynamicTableByteCount, 31, 32);
            }
            int size = headerBlock.size();
            for (int i3 = 0; i3 < size; i3++) {
                okhttp3.internal.http2.Header header3 = headerBlock.get(i3);
                okio.ByteString asciiLowercase = header3.name.toAsciiLowercase();
                okio.ByteString byteString = header3.value;
                java.lang.Integer num = okhttp3.internal.http2.Hpack.INSTANCE.getNAME_TO_FIRST_INDEX().get(asciiLowercase);
                if (num != null) {
                    length = num.intValue() + 1;
                    if (!(2 <= length && length < 8)) {
                        length2 = length;
                        length = -1;
                    } else if (!kotlin.jvm.internal.Intrinsics.areEqual(okhttp3.internal.http2.Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[length - 1].value, byteString)) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(okhttp3.internal.http2.Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[length].value, byteString)) {
                            length2 = length;
                            length++;
                        } else {
                            length2 = length;
                            length = -1;
                        }
                    }
                    if (length == -1) {
                        length3 = this.dynamicTable.length;
                        for (i = this.nextHeaderIndex + 1; i < length3; i++) {
                            header = this.dynamicTable[i];
                            kotlin.jvm.internal.Intrinsics.checkNotNull(header);
                            if (kotlin.jvm.internal.Intrinsics.areEqual(header.name, asciiLowercase)) {
                                header2 = this.dynamicTable[i];
                                kotlin.jvm.internal.Intrinsics.checkNotNull(header2);
                                if (kotlin.jvm.internal.Intrinsics.areEqual(header2.value, byteString)) {
                                    length = okhttp3.internal.http2.Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length + (i - this.nextHeaderIndex);
                                    break;
                                } else if (length2 == -1) {
                                    length2 = (i - this.nextHeaderIndex) + okhttp3.internal.http2.Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length;
                                }
                            }
                        }
                    }
                    if (length != -1) {
                        writeInt(length, 127, 128);
                    } else if (length2 == -1) {
                        this.out.writeByte(64);
                        writeByteString(asciiLowercase);
                        writeByteString(byteString);
                        insertIntoDynamicTable(header3);
                    } else if (!asciiLowercase.startsWith(okhttp3.internal.http2.Header.PSEUDO_PREFIX) && !kotlin.jvm.internal.Intrinsics.areEqual(okhttp3.internal.http2.Header.TARGET_AUTHORITY, asciiLowercase)) {
                        writeInt(length2, 15, 0);
                        writeByteString(byteString);
                    } else {
                        writeInt(length2, 63, 64);
                        writeByteString(byteString);
                        insertIntoDynamicTable(header3);
                    }
                } else {
                    length = -1;
                }
                length2 = length;
                if (length == -1) {
                    length3 = this.dynamicTable.length;
                    while (i < length3) {
                        header = this.dynamicTable[i];
                        kotlin.jvm.internal.Intrinsics.checkNotNull(header);
                        if (kotlin.jvm.internal.Intrinsics.areEqual(header.name, asciiLowercase)) {
                            header2 = this.dynamicTable[i];
                            kotlin.jvm.internal.Intrinsics.checkNotNull(header2);
                            if (kotlin.jvm.internal.Intrinsics.areEqual(header2.value, byteString)) {
                                length = okhttp3.internal.http2.Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length + (i - this.nextHeaderIndex);
                                break;
                            } else if (length2 == -1) {
                                length2 = (i - this.nextHeaderIndex) + okhttp3.internal.http2.Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length;
                            }
                        }
                    }
                }
                if (length != -1) {
                    writeInt(length, 127, 128);
                } else if (length2 == -1) {
                    this.out.writeByte(64);
                    writeByteString(asciiLowercase);
                    writeByteString(byteString);
                    insertIntoDynamicTable(header3);
                } else if (!asciiLowercase.startsWith(okhttp3.internal.http2.Header.PSEUDO_PREFIX)) {
                    writeInt(length2, 63, 64);
                    writeByteString(byteString);
                    insertIntoDynamicTable(header3);
                } else {
                    writeInt(length2, 63, 64);
                    writeByteString(byteString);
                    insertIntoDynamicTable(header3);
                }
            }
        }

        public final void writeInt(int value, int prefixMask, int bits) {
            if (value < prefixMask) {
                this.out.writeByte(value | bits);
                return;
            }
            this.out.writeByte(bits | prefixMask);
            int i = value - prefixMask;
            while (i >= 128) {
                this.out.writeByte(128 | (i & 127));
                i >>>= 7;
            }
            this.out.writeByte(i);
        }

        public final void writeByteString(okio.ByteString data) throws java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
            if (this.useCompression && okhttp3.internal.http2.Huffman.INSTANCE.encodedLength(data) < data.size()) {
                okio.Buffer buffer = new okio.Buffer();
                okhttp3.internal.http2.Huffman.INSTANCE.encode(data, buffer);
                okio.ByteString byteString = buffer.readByteString();
                writeInt(byteString.size(), 127, 128);
                this.out.write(byteString);
                return;
            }
            writeInt(data.size(), 127, 0);
            this.out.write(data);
        }

        public final void resizeHeaderTable(int headerTableSizeSetting) {
            this.headerTableSizeSetting = headerTableSizeSetting;
            int iMin = java.lang.Math.min(headerTableSizeSetting, 16384);
            int i = this.maxDynamicTableByteCount;
            if (i == iMin) {
                return;
            }
            if (iMin < i) {
                this.smallestHeaderTableSizeSetting = java.lang.Math.min(this.smallestHeaderTableSizeSetting, iMin);
            }
            this.emitDynamicTableSizeUpdate = true;
            this.maxDynamicTableByteCount = iMin;
            adjustDynamicTableByteCount();
        }

        private final void adjustDynamicTableByteCount() {
            int i = this.maxDynamicTableByteCount;
            int i2 = this.dynamicTableByteCount;
            if (i < i2) {
                if (i == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i2 - i);
                }
            }
        }
    }

    public final okio.ByteString checkLowercase(okio.ByteString name) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        int size = name.size();
        for (int i = 0; i < size; i++) {
            byte b = name.getByte(i);
            if (65 <= b && b < 91) {
                throw new java.io.IOException("PROTOCOL_ERROR response malformed: mixed case name: " + name.utf8());
            }
        }
        return name;
    }
}
