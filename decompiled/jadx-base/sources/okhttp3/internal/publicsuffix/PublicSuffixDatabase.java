package okhttp3.internal.publicsuffix;

/* JADX INFO: compiled from: PublicSuffixDatabase.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\fJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\u0016\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "()V", "listRead", "Ljava/util/concurrent/atomic/AtomicBoolean;", "publicSuffixExceptionListBytes", "", "publicSuffixListBytes", "readCompleteLatch", "Ljava/util/concurrent/CountDownLatch;", "findMatchingRule", "", "", "domainLabels", "getEffectiveTldPlusOne", com.ironsource.y8.i.D, "readTheList", "", "readTheListUninterruptibly", "setListBytes", "splitDomain", "Companion", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PublicSuffixDatabase {
    private static final char EXCEPTION_MARKER = '!';
    public static final java.lang.String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
    private byte[] publicSuffixExceptionListBytes;
    private byte[] publicSuffixListBytes;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion INSTANCE = new okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion(null);
    private static final byte[] WILDCARD_LABEL = {42};
    private static final java.util.List<java.lang.String> PREVAILING_RULE = kotlin.collections.CollectionsKt.listOf(androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES);
    private static final okhttp3.internal.publicsuffix.PublicSuffixDatabase instance = new okhttp3.internal.publicsuffix.PublicSuffixDatabase();
    private final java.util.concurrent.atomic.AtomicBoolean listRead = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.concurrent.CountDownLatch readCompleteLatch = new java.util.concurrent.CountDownLatch(1);

    public final java.lang.String getEffectiveTldPlusOne(java.lang.String domain) {
        int size;
        int size2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domain, "domain");
        java.lang.String unicodeDomain = java.net.IDN.toUnicode(domain);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unicodeDomain, "unicodeDomain");
        java.util.List<java.lang.String> listSplitDomain = splitDomain(unicodeDomain);
        java.util.List<java.lang.String> listFindMatchingRule = findMatchingRule(listSplitDomain);
        if (listSplitDomain.size() == listFindMatchingRule.size() && listFindMatchingRule.get(0).charAt(0) != '!') {
            return null;
        }
        if (listFindMatchingRule.get(0).charAt(0) == '!') {
            size = listSplitDomain.size();
            size2 = listFindMatchingRule.size();
        } else {
            size = listSplitDomain.size();
            size2 = listFindMatchingRule.size() + 1;
        }
        return kotlin.sequences.SequencesKt.joinToString$default(kotlin.sequences.SequencesKt.drop(kotlin.collections.CollectionsKt.asSequence(splitDomain(domain)), size - size2), ".", null, null, 0, null, null, 62, null);
    }

    private final java.util.List<java.lang.String> splitDomain(java.lang.String domain) {
        java.util.List<java.lang.String> listSplit$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) domain, new char[]{'.'}, false, 0, 6, (java.lang.Object) null);
        return kotlin.jvm.internal.Intrinsics.areEqual(kotlin.collections.CollectionsKt.last((java.util.List) listSplit$default), "") ? kotlin.collections.CollectionsKt.dropLast(listSplit$default, 1) : listSplit$default;
    }

    private final java.util.List<java.lang.String> findMatchingRule(java.util.List<java.lang.String> domainLabels) {
        java.lang.String str;
        java.lang.String strBinarySearch;
        java.lang.String strBinarySearch2;
        java.util.List<java.lang.String> listEmptyList;
        java.util.List<java.lang.String> listEmptyList2;
        if (!this.listRead.get() && this.listRead.compareAndSet(false, true)) {
            readTheListUninterruptibly();
        } else {
            try {
                this.readCompleteLatch.await();
            } catch (java.lang.InterruptedException unused) {
                java.lang.Thread.currentThread().interrupt();
            }
        }
        if (!(this.publicSuffixListBytes != null)) {
            throw new java.lang.IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
        }
        int size = domainLabels.size();
        byte[][] bArr = new byte[size][];
        for (int i = 0; i < size; i++) {
            java.lang.String str2 = domainLabels.get(i);
            java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            byte[] bytes = str2.getBytes(UTF_8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i] = bytes;
        }
        byte[][] bArr2 = bArr;
        int length = bArr2.length;
        int i2 = 0;
        while (true) {
            str = null;
            if (i2 >= length) {
                strBinarySearch = null;
                break;
            }
            okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion companion = INSTANCE;
            byte[] bArr3 = this.publicSuffixListBytes;
            if (bArr3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("publicSuffixListBytes");
                bArr3 = null;
            }
            strBinarySearch = companion.binarySearch(bArr3, bArr, i2);
            if (strBinarySearch != null) {
                break;
            }
            i2++;
        }
        if (bArr2.length <= 1) {
            strBinarySearch2 = null;
            break;
        }
        byte[][] bArr4 = (byte[][]) bArr2.clone();
        int length2 = bArr4.length - 1;
        int i3 = 0;
        while (true) {
            if (i3 >= length2) {
                strBinarySearch2 = null;
                break;
            }
            bArr4[i3] = WILDCARD_LABEL;
            okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion companion2 = INSTANCE;
            byte[] bArr5 = this.publicSuffixListBytes;
            if (bArr5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("publicSuffixListBytes");
                bArr5 = null;
            }
            strBinarySearch2 = companion2.binarySearch(bArr5, bArr4, i3);
            if (strBinarySearch2 != null) {
                break;
            }
            i3++;
        }
        if (strBinarySearch2 != null) {
            int length3 = bArr2.length - 1;
            for (int i4 = 0; i4 < length3; i4++) {
                okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion companion3 = INSTANCE;
                byte[] bArr6 = this.publicSuffixExceptionListBytes;
                if (bArr6 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("publicSuffixExceptionListBytes");
                    bArr6 = null;
                }
                java.lang.String strBinarySearch3 = companion3.binarySearch(bArr6, bArr, i4);
                if (strBinarySearch3 != null) {
                    str = strBinarySearch3;
                    break;
                }
            }
        }
        if (str != null) {
            return kotlin.text.StringsKt.split$default((java.lang.CharSequence) ("!" + str), new char[]{'.'}, false, 0, 6, (java.lang.Object) null);
        }
        if (strBinarySearch == null && strBinarySearch2 == null) {
            return PREVAILING_RULE;
        }
        if (strBinarySearch == null || (listEmptyList = kotlin.text.StringsKt.split$default((java.lang.CharSequence) strBinarySearch, new char[]{'.'}, false, 0, 6, (java.lang.Object) null)) == null) {
            listEmptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        if (strBinarySearch2 == null || (listEmptyList2 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) strBinarySearch2, new char[]{'.'}, false, 0, 6, (java.lang.Object) null)) == null) {
            listEmptyList2 = kotlin.collections.CollectionsKt.emptyList();
        }
        return listEmptyList.size() > listEmptyList2.size() ? listEmptyList : listEmptyList2;
    }

    private final void readTheListUninterruptibly() {
        boolean z = false;
        while (true) {
            try {
                try {
                    readTheList();
                    break;
                } catch (java.io.InterruptedIOException unused) {
                    java.lang.Thread.interrupted();
                    z = true;
                } catch (java.io.IOException e) {
                    okhttp3.internal.platform.Platform.INSTANCE.get().log("Failed to read public suffix list", 5, e);
                    if (z) {
                        java.lang.Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (java.lang.Throwable th) {
                if (z) {
                    java.lang.Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            java.lang.Thread.currentThread().interrupt();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [T, byte[]] */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, byte[]] */
    private final void readTheList() throws java.io.IOException {
        try {
            kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
            kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
            java.io.InputStream resourceAsStream = okhttp3.internal.publicsuffix.PublicSuffixDatabase.class.getResourceAsStream(PUBLIC_SUFFIX_RESOURCE);
            if (resourceAsStream != null) {
                okio.BufferedSource bufferedSourceBuffer = okio.Okio.buffer(new okio.GzipSource(okio.Okio.source(resourceAsStream)));
                try {
                    okio.BufferedSource bufferedSource = bufferedSourceBuffer;
                    objectRef.element = bufferedSource.readByteArray(bufferedSource.readInt());
                    objectRef2.element = bufferedSource.readByteArray(bufferedSource.readInt());
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    kotlin.io.CloseableKt.closeFinally(bufferedSourceBuffer, null);
                    synchronized (this) {
                        T t = objectRef.element;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(t);
                        this.publicSuffixListBytes = (byte[]) t;
                        T t2 = objectRef2.element;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(t2);
                        this.publicSuffixExceptionListBytes = (byte[]) t2;
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    }
                    this.readCompleteLatch.countDown();
                    return;
                } catch (java.lang.Throwable th) {
                    try {
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        kotlin.io.CloseableKt.closeFinally(bufferedSourceBuffer, th);
                        throw th2;
                    }
                }
            }
            this.readCompleteLatch.countDown();
        } catch (java.lang.Throwable th3) {
            this.readCompleteLatch.countDown();
            throw th3;
        }
    }

    public final void setListBytes(byte[] publicSuffixListBytes, byte[] publicSuffixExceptionListBytes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicSuffixListBytes, "publicSuffixListBytes");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicSuffixExceptionListBytes, "publicSuffixExceptionListBytes");
        this.publicSuffixListBytes = publicSuffixListBytes;
        this.publicSuffixExceptionListBytes = publicSuffixExceptionListBytes;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }

    /* JADX INFO: compiled from: PublicSuffixDatabase.kt */
    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\fJ)\u0010\u000e\u001a\u0004\u0018\u00010\u0007*\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$Companion;", "", "()V", "EXCEPTION_MARKER", "", "PREVAILING_RULE", "", "", "PUBLIC_SUFFIX_RESOURCE", "WILDCARD_LABEL", "", com.json.j5.p, "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "get", "binarySearch", "labels", "", "labelIndex", "", "([B[[BI)Ljava/lang/String;", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final okhttp3.internal.publicsuffix.PublicSuffixDatabase get() {
            return okhttp3.internal.publicsuffix.PublicSuffixDatabase.instance;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final java.lang.String binarySearch(byte[] bArr, byte[][] bArr2, int i) {
            int i2;
            boolean z;
            int iAnd;
            int iAnd2;
            int length = bArr.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = (i3 + length) / 2;
                while (i4 > -1 && bArr[i4] != 10) {
                    i4--;
                }
                int i5 = i4 + 1;
                int i6 = 1;
                while (true) {
                    i2 = i5 + i6;
                    if (bArr[i2] == 10) {
                        break;
                    }
                    i6++;
                }
                int i7 = i2 - i5;
                int i8 = i;
                boolean z2 = false;
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    if (z2) {
                        iAnd = 46;
                        z = false;
                    } else {
                        z = z2;
                        iAnd = okhttp3.internal.Util.and(bArr2[i8][i9], 255);
                    }
                    iAnd2 = iAnd - okhttp3.internal.Util.and(bArr[i5 + i10], 255);
                    if (iAnd2 != 0) {
                        break;
                    }
                    i10++;
                    i9++;
                    if (i10 == i7) {
                        break;
                    }
                    if (bArr2[i8].length != i9) {
                        z2 = z;
                    } else {
                        if (i8 == bArr2.length - 1) {
                            break;
                        }
                        i8++;
                        i9 = -1;
                        z2 = true;
                    }
                }
                if (iAnd2 >= 0) {
                    if (iAnd2 <= 0) {
                        int i11 = i7 - i10;
                        int length2 = bArr2[i8].length - i9;
                        int length3 = bArr2.length;
                        for (int i12 = i8 + 1; i12 < length3; i12++) {
                            length2 += bArr2[i12].length;
                        }
                        if (length2 >= i11) {
                            if (length2 <= i11) {
                                java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                                return new java.lang.String(bArr, i5, i7, UTF_8);
                            }
                        }
                    }
                    i3 = i2 + 1;
                }
                length = i5 - 1;
            }
            return null;
        }
    }
}
