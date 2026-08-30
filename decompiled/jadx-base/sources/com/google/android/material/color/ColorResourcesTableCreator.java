package com.google.android.material.color;

/* JADX INFO: loaded from: classes5.dex */
final class ColorResourcesTableCreator {
    private static final byte ANDROID_PACKAGE_ID = 1;
    private static final byte APPLICATION_PACKAGE_ID = 127;
    private static final short HEADER_TYPE_PACKAGE = 512;
    private static final short HEADER_TYPE_RES_TABLE = 2;
    private static final short HEADER_TYPE_STRING_POOL = 1;
    private static final short HEADER_TYPE_TYPE = 513;
    private static final short HEADER_TYPE_TYPE_SPEC = 514;
    private static final java.lang.String RESOURCE_TYPE_NAME_COLOR = "color";
    private static byte typeIdColor;
    private static final com.google.android.material.color.ColorResourcesTableCreator.PackageInfo ANDROID_PACKAGE_INFO = new com.google.android.material.color.ColorResourcesTableCreator.PackageInfo(1, "android");
    private static final java.util.Comparator<com.google.android.material.color.ColorResourcesTableCreator.ColorResource> COLOR_RESOURCE_COMPARATOR = new java.util.Comparator<com.google.android.material.color.ColorResourcesTableCreator.ColorResource>() { // from class: com.google.android.material.color.ColorResourcesTableCreator.1
        @Override // java.util.Comparator
        public int compare(com.google.android.material.color.ColorResourcesTableCreator.ColorResource colorResource, com.google.android.material.color.ColorResourcesTableCreator.ColorResource colorResource2) {
            return colorResource.entryId - colorResource2.entryId;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] charToByteArray(char c) {
        return new byte[]{(byte) (c & 255), (byte) ((c >> '\b') & 255)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] intToByteArray(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] shortToByteArray(short s) {
        return new byte[]{(byte) (s & 255), (byte) ((s >> 8) & 255)};
    }

    private ColorResourcesTableCreator() {
    }

    static byte[] create(android.content.Context context, java.util.Map<java.lang.Integer, java.lang.Integer> map) throws java.io.IOException {
        com.google.android.material.color.ColorResourcesTableCreator.PackageInfo packageInfo;
        if (map.entrySet().isEmpty()) {
            throw new java.lang.IllegalArgumentException("No color resources provided for harmonization.");
        }
        com.google.android.material.color.ColorResourcesTableCreator.PackageInfo packageInfo2 = new com.google.android.material.color.ColorResourcesTableCreator.PackageInfo(127, context.getPackageName());
        java.util.HashMap map2 = new java.util.HashMap();
        com.google.android.material.color.ColorResourcesTableCreator.ColorResource colorResource = null;
        for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry : map.entrySet()) {
            com.google.android.material.color.ColorResourcesTableCreator.ColorResource colorResource2 = new com.google.android.material.color.ColorResourcesTableCreator.ColorResource(entry.getKey().intValue(), context.getResources().getResourceName(entry.getKey().intValue()), entry.getValue().intValue());
            if (!context.getResources().getResourceTypeName(entry.getKey().intValue()).equals("color")) {
                throw new java.lang.IllegalArgumentException("Non color resource found: name=" + colorResource2.name + ", typeId=" + java.lang.Integer.toHexString(colorResource2.typeId & 255));
            }
            if (colorResource2.packageId == 1) {
                packageInfo = ANDROID_PACKAGE_INFO;
            } else {
                if (colorResource2.packageId != 127) {
                    throw new java.lang.IllegalArgumentException("Not supported with unknown package id: " + ((int) colorResource2.packageId));
                }
                packageInfo = packageInfo2;
            }
            if (!map2.containsKey(packageInfo)) {
                map2.put(packageInfo, new java.util.ArrayList());
            }
            ((java.util.List) map2.get(packageInfo)).add(colorResource2);
            colorResource = colorResource2;
        }
        byte b = colorResource.typeId;
        typeIdColor = b;
        if (b == 0) {
            throw new java.lang.IllegalArgumentException("No color resources found for harmonization.");
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        new com.google.android.material.color.ColorResourcesTableCreator.ResTable(map2).writeTo(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    private static class ResTable {
        private static final short HEADER_SIZE = 12;
        private final com.google.android.material.color.ColorResourcesTableCreator.ResChunkHeader header;
        private final int packageCount;
        private final java.util.List<com.google.android.material.color.ColorResourcesTableCreator.PackageChunk> packageChunks = new java.util.ArrayList();
        private final com.google.android.material.color.ColorResourcesTableCreator.StringPoolChunk stringPool = new com.google.android.material.color.ColorResourcesTableCreator.StringPoolChunk(new java.lang.String[0]);

        ResTable(java.util.Map<com.google.android.material.color.ColorResourcesTableCreator.PackageInfo, java.util.List<com.google.android.material.color.ColorResourcesTableCreator.ColorResource>> map) {
            this.packageCount = map.size();
            for (java.util.Map.Entry<com.google.android.material.color.ColorResourcesTableCreator.PackageInfo, java.util.List<com.google.android.material.color.ColorResourcesTableCreator.ColorResource>> entry : map.entrySet()) {
                java.util.List<com.google.android.material.color.ColorResourcesTableCreator.ColorResource> value = entry.getValue();
                java.util.Collections.sort(value, com.google.android.material.color.ColorResourcesTableCreator.COLOR_RESOURCE_COMPARATOR);
                this.packageChunks.add(new com.google.android.material.color.ColorResourcesTableCreator.PackageChunk(entry.getKey(), value));
            }
            this.header = new com.google.android.material.color.ColorResourcesTableCreator.ResChunkHeader((short) 2, (short) 12, getOverallSize());
        }

        void writeTo(java.io.ByteArrayOutputStream byteArrayOutputStream) throws java.io.IOException {
            this.header.writeTo(byteArrayOutputStream);
            byteArrayOutputStream.write(com.google.android.material.color.ColorResourcesTableCreator.intToByteArray(this.packageCount));
            this.stringPool.writeTo(byteArrayOutputStream);
            java.util.Iterator<com.google.android.material.color.ColorResourcesTableCreator.PackageChunk> it = this.packageChunks.iterator();
            while (it.hasNext()) {
                it.next().writeTo(byteArrayOutputStream);
            }
        }

        private int getOverallSize() {
            java.util.Iterator<com.google.android.material.color.ColorResourcesTableCreator.PackageChunk> it = this.packageChunks.iterator();
            int chunkSize = 0;
            while (it.hasNext()) {
                chunkSize += it.next().getChunkSize();
            }
            return this.stringPool.getChunkSize() + 12 + chunkSize;
        }
    }

    private static class ResChunkHeader {
        private final int chunkSize;
        private final short headerSize;
        private final short type;

        ResChunkHeader(short s, short s2, int i) {
            this.type = s;
            this.headerSize = s2;
            this.chunkSize = i;
        }

        void writeTo(java.io.ByteArrayOutputStream byteArrayOutputStream) throws java.io.IOException {
            byteArrayOutputStream.write(com.google.android.material.color.ColorResourcesTableCreator.shortToByteArray(this.type));
            byteArrayOutputStream.write(com.google.android.material.color.ColorResourcesTableCreator.shortToByteArray(this.headerSize));
            byteArrayOutputStream.write(com.google.android.material.color.ColorResourcesTableCreator.intToByteArray(this.chunkSize));
        }
    }

    private static class StringPoolChunk {
        private static final int FLAG_UTF8 = 256;
        private static final short HEADER_SIZE = 28;
        private static final int STYLED_SPAN_LIST_END = -1;
        private final int chunkSize;
        private final com.google.android.material.color.ColorResourcesTableCreator.ResChunkHeader header;
        private final int stringCount;
        private final java.util.List<java.lang.Integer> stringIndex;
        private final java.util.List<byte[]> strings;
        private final int stringsPaddingSize;
        private final int stringsStart;
        private final int styledSpanCount;
        private final java.util.List<java.lang.Integer> styledSpanIndex;
        private final java.util.List<java.util.List<com.google.android.material.color.ColorResourcesTableCreator.StringStyledSpan>> styledSpans;
        private final int styledSpansStart;
        private final boolean utf8Encode;

        StringPoolChunk(java.lang.String... strArr) {
            this(false, strArr);
        }

        StringPoolChunk(boolean z, java.lang.String... strArr) {
            this.stringIndex = new java.util.ArrayList();
            this.styledSpanIndex = new java.util.ArrayList();
            this.strings = new java.util.ArrayList();
            this.styledSpans = new java.util.ArrayList();
            this.utf8Encode = z;
            int length = 0;
            for (java.lang.String str : strArr) {
                android.util.Pair<byte[], java.util.List<com.google.android.material.color.ColorResourcesTableCreator.StringStyledSpan>> pairProcessString = processString(str);
                this.stringIndex.add(java.lang.Integer.valueOf(length));
                length += ((byte[]) pairProcessString.first).length;
                this.strings.add((byte[]) pairProcessString.first);
                this.styledSpans.add((java.util.List) pairProcessString.second);
            }
            int size = 0;
            for (java.util.List<com.google.android.material.color.ColorResourcesTableCreator.StringStyledSpan> list : this.styledSpans) {
                for (com.google.android.material.color.ColorResourcesTableCreator.StringStyledSpan stringStyledSpan : list) {
                    this.stringIndex.add(java.lang.Integer.valueOf(length));
                    length += stringStyledSpan.styleString.length;
                    this.strings.add(stringStyledSpan.styleString);
                }
                this.styledSpanIndex.add(java.lang.Integer.valueOf(size));
                size += (list.size() * 12) + 4;
            }
            int i = length % 4;
            int i2 = i == 0 ? 0 : 4 - i;
            this.stringsPaddingSize = i2;
            int size2 = this.strings.size();
            this.stringCount = size2;
            this.styledSpanCount = this.strings.size() - strArr.length;
            boolean z2 = this.strings.size() - strArr.length > 0;
            if (!z2) {
                this.styledSpanIndex.clear();
                this.styledSpans.clear();
            }
            int size3 = (size2 * 4) + 28 + (this.styledSpanIndex.size() * 4);
            this.stringsStart = size3;
            int i3 = length + i2;
            this.styledSpansStart = z2 ? size3 + i3 : 0;
            int i4 = size3 + i3 + (z2 ? size : 0);
            this.chunkSize = i4;
            this.header = new com.google.android.material.color.ColorResourcesTableCreator.ResChunkHeader((short) 1, HEADER_SIZE, i4);
        }

        void writeTo(java.io.ByteArrayOutputStream byteArrayOutputStream) throws java.io.IOException {
            this.header.writeTo(byteArrayOutputStream);
            byteArrayOutputStream.write(com.google.android.material.color.ColorResourcesTableCreator.intToByteArray(this.stringCount));
            byteArrayOutputStream.write(com.google.android.material.color.ColorResourcesTableCreator.intToByteArray(this.styledSpanCount));
            byteArrayOutputStream.write(com.google.android.material.color.ColorResourcesTableCreator.intToByteArray(this.utf8Encode ? 256 : 0));
            byteArrayOutputStream.write(com.google.android.material.color.ColorResourcesTableCreator.intToByteArray(this.stringsStart));
            byteArrayOutputStream.write(com.google.android.material.color.ColorResourcesTableCreator.intToByteArray(this.styledSpansStart));
            java.util.Iterator<java.lang.Integer> it = this.stringIndex.iterator();
            while (it.hasNext()) {
                byteArrayOutputStream.write(com.google.android.material.color.ColorResourcesTableCreator.intToByteArray(it.next().intValue()));
            }
            java.util.Iterator<java.lang.Integer> it2 = this.styledSpanIndex.iterator();
            while (it2.hasNext()) {
                byteArrayOutputStream.write(com.google.android.material.color.ColorResourcesTableCreator.intToByteArray(it2.next().intValue()));
            }
            java.util.Iterator<byte[]> it3 = this.strings.iterator();
            while (it3.hasNext()) {
                byteArrayOutputStream.write(it3.next());
            }
            int i = this.stringsPaddingSize;
            if (i > 0) {
                byteArrayOutputStream.write(new byte[i]);
            }
            java.util.Iterator<java.util.List<com.google.android.material.color.ColorResourcesTableCreator.StringStyledSpan>> it4 = this.styledSpans.iterator();
            while (it4.hasNext()) {
                java.util.Iterator<com.google.android.material.color.ColorResourcesTableCreator.StringStyledSpan> it5 = it4.next().iterator();
                while (it5.hasNext()) {
                    it5.next().writeTo(byteArrayOutputStream);
                }
                byteArrayOutputStream.write(com.google.android.material.color.ColorResourcesTableCreator.intToByteArray(-1));
            }
        }

        int getChunkSize() {
            return this.chunkSize;
        }

        private android.util.Pair<byte[], java.util.List<com.google.android.material.color.ColorResourcesTableCreator.StringStyledSpan>> processString(java.lang.String str) {
            return new android.util.Pair<>(this.utf8Encode ? com.google.android.material.color.ColorResourcesTableCreator.stringToByteArrayUtf8(str) : com.google.android.material.color.ColorResourcesTableCreator.stringToByteArray(str), java.util.Collections.emptyList());
        }
    }

    private static class StringStyledSpan {
        private int firstCharacterIndex;
        private int lastCharacterIndex;
        private int nameReference;
        private byte[] styleString;

        private StringStyledSpan() {
        }

        void writeTo(java.io.ByteArrayOutputStream byteArrayOutputStream) throws java.io.IOException {
            byteArrayOutputStream.write(com.google.android.material.color.ColorResourcesTableCreator.intToByteArray(this.nameReference));
            byteArrayOutputStream.write(com.google.android.material.color.ColorResourcesTableCreator.intToByteArray(this.firstCharacterIndex));
            byteArrayOutputStream.write(com.google.android.material.color.ColorResourcesTableCreator.intToByteArray(this.lastCharacterIndex));
        }
    }

    private static class PackageChunk {
        private static final short HEADER_SIZE = 288;
        private static final int PACKAGE_NAME_MAX_LENGTH = 128;
        private final com.google.android.material.color.ColorResourcesTableCreator.ResChunkHeader header;
        private final com.google.android.material.color.ColorResourcesTableCreator.StringPoolChunk keyStrings;
        private final com.google.android.material.color.ColorResourcesTableCreator.PackageInfo packageInfo;
        private final com.google.android.material.color.ColorResourcesTableCreator.TypeSpecChunk typeSpecChunk;
        private final com.google.android.material.color.ColorResourcesTableCreator.StringPoolChunk typeStrings = new com.google.android.material.color.ColorResourcesTableCreator.StringPoolChunk(false, "?1", "?2", "?3", "?4", "?5", "color");

        PackageChunk(com.google.android.material.color.ColorResourcesTableCreator.PackageInfo packageInfo, java.util.List<com.google.android.material.color.ColorResourcesTableCreator.ColorResource> list) {
            this.packageInfo = packageInfo;
            java.lang.String[] strArr = new java.lang.String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                strArr[i] = list.get(i).name;
            }
            this.keyStrings = new com.google.android.material.color.ColorResourcesTableCreator.StringPoolChunk(true, strArr);
            this.typeSpecChunk = new com.google.android.material.color.ColorResourcesTableCreator.TypeSpecChunk(list);
            this.header = new com.google.android.material.color.ColorResourcesTableCreator.ResChunkHeader(com.google.android.material.color.ColorResourcesTableCreator.HEADER_TYPE_PACKAGE, HEADER_SIZE, getChunkSize());
        }

        void writeTo(java.io.ByteArrayOutputStream byteArrayOutputStream) throws java.io.IOException {
            this.header.writeTo(byteArrayOutputStream);
            byteArrayOutputStream.write(com.google.android.material.color.ColorResourcesTableCreator.intToByteArray(this.packageInfo.id));
            char[] charArray = this.packageInfo.name.toCharArray();
            for (int i = 0; i < 128; i++) {
                if (i < charArray.length) {
                    byteArrayOutputStream.write(com.google.android.material.color.ColorResourcesTableCreator.charToByteArray(charArray[i]));
                } else {
                    byteArrayOutputStream.write(com.google.android.material.color.ColorResourcesTableCreator.charToByteArray((char) 0));
                }
            }
            byteArrayOutputStream.write(com.google.android.material.color.ColorResourcesTableCreator.intToByteArray(288));
            byteArrayOutputStream.write(com.google.android.material.color.ColorResourcesTableCreator.intToByteArray(0));
            byteArrayOutputStream.write(com.google.android.material.color.ColorResourcesTableCreator.intToByteArray(this.typeStrings.getChunkSize() + 288));
            byteArrayOutputStream.write(com.google.android.material.color.ColorResourcesTableCreator.intToByteArray(0));
            byteArrayOutputStream.write(com.google.android.material.color.ColorResourcesTableCreator.intToByteArray(0));
            this.typeStrings.writeTo(byteArrayOutputStream);
            this.keyStrings.writeTo(byteArrayOutputStream);
            this.typeSpecChunk.writeTo(byteArrayOutputStream);
        }

        int getChunkSize() {
            return this.typeStrings.getChunkSize() + 288 + this.keyStrings.getChunkSize() + this.typeSpecChunk.getChunkSizeWithTypeChunk();
        }
    }

    private static class TypeSpecChunk {
        private static final short HEADER_SIZE = 16;
        private static final int SPEC_PUBLIC = 1073741824;
        private final int entryCount;
        private final int[] entryFlags;
        private final com.google.android.material.color.ColorResourcesTableCreator.ResChunkHeader header;
        private final com.google.android.material.color.ColorResourcesTableCreator.TypeChunk typeChunk;

        TypeSpecChunk(java.util.List<com.google.android.material.color.ColorResourcesTableCreator.ColorResource> list) {
            this.entryCount = list.get(list.size() - 1).entryId + 1;
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.Iterator<com.google.android.material.color.ColorResourcesTableCreator.ColorResource> it = list.iterator();
            while (it.hasNext()) {
                hashSet.add(java.lang.Short.valueOf(it.next().entryId));
            }
            this.entryFlags = new int[this.entryCount];
            for (short s = 0; s < this.entryCount; s = (short) (s + 1)) {
                if (hashSet.contains(java.lang.Short.valueOf(s))) {
                    this.entryFlags[s] = 1073741824;
                }
            }
            this.header = new com.google.android.material.color.ColorResourcesTableCreator.ResChunkHeader(com.google.android.material.color.ColorResourcesTableCreator.HEADER_TYPE_TYPE_SPEC, (short) 16, getChunkSize());
            this.typeChunk = new com.google.android.material.color.ColorResourcesTableCreator.TypeChunk(list, hashSet, this.entryCount);
        }

        void writeTo(java.io.ByteArrayOutputStream byteArrayOutputStream) throws java.io.IOException {
            this.header.writeTo(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{com.google.android.material.color.ColorResourcesTableCreator.typeIdColor, 0, 0, 0});
            byteArrayOutputStream.write(com.google.android.material.color.ColorResourcesTableCreator.intToByteArray(this.entryCount));
            for (int i : this.entryFlags) {
                byteArrayOutputStream.write(com.google.android.material.color.ColorResourcesTableCreator.intToByteArray(i));
            }
            this.typeChunk.writeTo(byteArrayOutputStream);
        }

        int getChunkSizeWithTypeChunk() {
            return getChunkSize() + this.typeChunk.getChunkSize();
        }

        private int getChunkSize() {
            return (this.entryCount * 4) + 16;
        }
    }

    private static class TypeChunk {
        private static final byte CONFIG_SIZE = 64;
        private static final short HEADER_SIZE = 84;
        private static final int OFFSET_NO_ENTRY = -1;
        private final byte[] config;
        private final int entryCount;
        private final com.google.android.material.color.ColorResourcesTableCreator.ResChunkHeader header;
        private final int[] offsetTable;
        private final com.google.android.material.color.ColorResourcesTableCreator.ResEntry[] resEntries;

        TypeChunk(java.util.List<com.google.android.material.color.ColorResourcesTableCreator.ColorResource> list, java.util.Set<java.lang.Short> set, int i) {
            byte[] bArr = new byte[64];
            this.config = bArr;
            this.entryCount = i;
            bArr[0] = 64;
            this.resEntries = new com.google.android.material.color.ColorResourcesTableCreator.ResEntry[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                this.resEntries[i2] = new com.google.android.material.color.ColorResourcesTableCreator.ResEntry(i2, list.get(i2).value);
            }
            this.offsetTable = new int[i];
            int i3 = 0;
            for (short s = 0; s < i; s = (short) (s + 1)) {
                if (set.contains(java.lang.Short.valueOf(s))) {
                    this.offsetTable[s] = i3;
                    i3 += 16;
                } else {
                    this.offsetTable[s] = -1;
                }
            }
            this.header = new com.google.android.material.color.ColorResourcesTableCreator.ResChunkHeader(com.google.android.material.color.ColorResourcesTableCreator.HEADER_TYPE_TYPE, HEADER_SIZE, getChunkSize());
        }

        void writeTo(java.io.ByteArrayOutputStream byteArrayOutputStream) throws java.io.IOException {
            this.header.writeTo(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{com.google.android.material.color.ColorResourcesTableCreator.typeIdColor, 0, 0, 0});
            byteArrayOutputStream.write(com.google.android.material.color.ColorResourcesTableCreator.intToByteArray(this.entryCount));
            byteArrayOutputStream.write(com.google.android.material.color.ColorResourcesTableCreator.intToByteArray(getEntryStart()));
            byteArrayOutputStream.write(this.config);
            for (int i : this.offsetTable) {
                byteArrayOutputStream.write(com.google.android.material.color.ColorResourcesTableCreator.intToByteArray(i));
            }
            for (com.google.android.material.color.ColorResourcesTableCreator.ResEntry resEntry : this.resEntries) {
                resEntry.writeTo(byteArrayOutputStream);
            }
        }

        int getChunkSize() {
            return getEntryStart() + (this.resEntries.length * 16);
        }

        private int getEntryStart() {
            return getOffsetTableSize() + 84;
        }

        private int getOffsetTableSize() {
            return this.offsetTable.length * 4;
        }
    }

    private static class ResEntry {
        private static final byte DATA_TYPE_AARRGGBB = 28;
        private static final short ENTRY_SIZE = 8;
        private static final short FLAG_PUBLIC = 2;
        private static final int SIZE = 16;
        private static final short VALUE_SIZE = 8;
        private final int data;
        private final int keyStringIndex;

        ResEntry(int i, int i2) {
            this.keyStringIndex = i;
            this.data = i2;
        }

        void writeTo(java.io.ByteArrayOutputStream byteArrayOutputStream) throws java.io.IOException {
            byteArrayOutputStream.write(com.google.android.material.color.ColorResourcesTableCreator.shortToByteArray((short) 8));
            byteArrayOutputStream.write(com.google.android.material.color.ColorResourcesTableCreator.shortToByteArray((short) 2));
            byteArrayOutputStream.write(com.google.android.material.color.ColorResourcesTableCreator.intToByteArray(this.keyStringIndex));
            byteArrayOutputStream.write(com.google.android.material.color.ColorResourcesTableCreator.shortToByteArray((short) 8));
            byteArrayOutputStream.write(new byte[]{0, 28});
            byteArrayOutputStream.write(com.google.android.material.color.ColorResourcesTableCreator.intToByteArray(this.data));
        }
    }

    static class PackageInfo {
        private final int id;
        private final java.lang.String name;

        PackageInfo(int i, java.lang.String str) {
            this.id = i;
            this.name = str;
        }
    }

    static class ColorResource {
        private final short entryId;
        private final java.lang.String name;
        private final byte packageId;
        private final byte typeId;
        private final int value;

        ColorResource(int i, java.lang.String str, int i2) {
            this.name = str;
            this.value = i2;
            this.entryId = (short) (65535 & i);
            this.typeId = (byte) ((i >> 16) & 255);
            this.packageId = (byte) ((i >> 24) & 255);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] stringToByteArray(java.lang.String str) {
        char[] charArray = str.toCharArray();
        int length = (charArray.length * 2) + 4;
        byte[] bArr = new byte[length];
        byte[] bArrShortToByteArray = shortToByteArray((short) charArray.length);
        bArr[0] = bArrShortToByteArray[0];
        bArr[1] = bArrShortToByteArray[1];
        for (int i = 0; i < charArray.length; i++) {
            byte[] bArrCharToByteArray = charToByteArray(charArray[i]);
            int i2 = i * 2;
            bArr[i2 + 2] = bArrCharToByteArray[0];
            bArr[i2 + 3] = bArrCharToByteArray[1];
        }
        bArr[length - 2] = 0;
        bArr[length - 1] = 0;
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] stringToByteArrayUtf8(java.lang.String str) {
        byte[] bytes = str.getBytes(java.nio.charset.Charset.forName(com.adjust.sdk.Constants.ENCODING));
        byte length = (byte) bytes.length;
        int length2 = bytes.length + 3;
        byte[] bArr = new byte[length2];
        java.lang.System.arraycopy(bytes, 0, bArr, 2, length);
        bArr[1] = length;
        bArr[0] = length;
        bArr[length2 - 1] = 0;
        return bArr;
    }
}
