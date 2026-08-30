package kotlin.text;

/* JADX INFO: compiled from: UHexExtensions.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0002\u0010\u0005\u001a\u001c\u0010\u0006\u001a\u00020\u0007*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0002\u0010\b\u001a\u001c\u0010\t\u001a\u00020\n*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0002\u0010\u000b\u001a\u001c\u0010\f\u001a\u00020\r*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0002\u0010\u000e\u001a\u001c\u0010\u000f\u001a\u00020\u0010*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0002\u0010\u0011\u001a\u001e\u0010\u0012\u001a\u00020\u0002*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a2\u0010\u0012\u001a\u00020\u0002*\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001e\u0010\u0012\u001a\u00020\u0002*\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001e\u0010\u0012\u001a\u00020\u0002*\u00020\n2\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001e\u0010\u0012\u001a\u00020\u0002*\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001e\u0010\u0012\u001a\u00020\u0002*\u00020\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"hexToUByte", "Lkotlin/UByte;", "", "format", "Lkotlin/text/HexFormat;", "(Ljava/lang/String;Lkotlin/text/HexFormat;)B", "hexToUByteArray", "Lkotlin/UByteArray;", "(Ljava/lang/String;Lkotlin/text/HexFormat;)[B", "hexToUInt", "Lkotlin/UInt;", "(Ljava/lang/String;Lkotlin/text/HexFormat;)I", "hexToULong", "Lkotlin/ULong;", "(Ljava/lang/String;Lkotlin/text/HexFormat;)J", "hexToUShort", "Lkotlin/UShort;", "(Ljava/lang/String;Lkotlin/text/HexFormat;)S", "toHexString", "toHexString-ZQbaR00", "(BLkotlin/text/HexFormat;)Ljava/lang/String;", "startIndex", "", "endIndex", "toHexString-lZCiFrA", "([BIILkotlin/text/HexFormat;)Ljava/lang/String;", "toHexString-zHuV2wU", "([BLkotlin/text/HexFormat;)Ljava/lang/String;", "toHexString-8M7LxHw", "(ILkotlin/text/HexFormat;)Ljava/lang/String;", "toHexString-8UJCm-I", "(JLkotlin/text/HexFormat;)Ljava/lang/String;", "toHexString-r3ox_E0", "(SLkotlin/text/HexFormat;)Ljava/lang/String;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class UHexExtensionsKt {
    /* JADX INFO: renamed from: toHexString-zHuV2wU, reason: not valid java name */
    private static final java.lang.String m2612toHexStringzHuV2wU(byte[] toHexString, kotlin.text.HexFormat format) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toHexString, "$this$toHexString");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        return kotlin.text.HexExtensionsKt.toHexString(toHexString, format);
    }

    /* JADX INFO: renamed from: toHexString-zHuV2wU$default, reason: not valid java name */
    static /* synthetic */ java.lang.String m2613toHexStringzHuV2wU$default(byte[] toHexString, kotlin.text.HexFormat format, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            format = kotlin.text.HexFormat.INSTANCE.getDefault();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toHexString, "$this$toHexString");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        return kotlin.text.HexExtensionsKt.toHexString(toHexString, format);
    }

    /* JADX INFO: renamed from: toHexString-lZCiFrA$default, reason: not valid java name */
    static /* synthetic */ java.lang.String m2609toHexStringlZCiFrA$default(byte[] toHexString, int i, int i2, kotlin.text.HexFormat format, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = kotlin.UByteArray.m1379getSizeimpl(toHexString);
        }
        if ((i3 & 4) != 0) {
            format = kotlin.text.HexFormat.INSTANCE.getDefault();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toHexString, "$this$toHexString");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        return kotlin.text.HexExtensionsKt.toHexString(toHexString, i, i2, format);
    }

    /* JADX INFO: renamed from: toHexString-lZCiFrA, reason: not valid java name */
    private static final java.lang.String m2608toHexStringlZCiFrA(byte[] toHexString, int i, int i2, kotlin.text.HexFormat format) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toHexString, "$this$toHexString");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        return kotlin.text.HexExtensionsKt.toHexString(toHexString, i, i2, format);
    }

    static /* synthetic */ byte[] hexToUByteArray$default(java.lang.String str, kotlin.text.HexFormat format, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            format = kotlin.text.HexFormat.INSTANCE.getDefault();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        return kotlin.UByteArray.m1373constructorimpl(kotlin.text.HexExtensionsKt.hexToByteArray(str, format));
    }

    private static final byte[] hexToUByteArray(java.lang.String str, kotlin.text.HexFormat format) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        return kotlin.UByteArray.m1373constructorimpl(kotlin.text.HexExtensionsKt.hexToByteArray(str, format));
    }

    /* JADX INFO: renamed from: toHexString-ZQbaR00, reason: not valid java name */
    private static final java.lang.String m2606toHexStringZQbaR00(byte b, kotlin.text.HexFormat format) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        return kotlin.text.HexExtensionsKt.toHexString(b, format);
    }

    /* JADX INFO: renamed from: toHexString-ZQbaR00$default, reason: not valid java name */
    static /* synthetic */ java.lang.String m2607toHexStringZQbaR00$default(byte b, kotlin.text.HexFormat format, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            format = kotlin.text.HexFormat.INSTANCE.getDefault();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        return kotlin.text.HexExtensionsKt.toHexString(b, format);
    }

    private static final byte hexToUByte(java.lang.String str, kotlin.text.HexFormat format) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        return kotlin.UByte.m1319constructorimpl(kotlin.text.HexExtensionsKt.hexToByte(str, format));
    }

    static /* synthetic */ byte hexToUByte$default(java.lang.String str, kotlin.text.HexFormat format, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            format = kotlin.text.HexFormat.INSTANCE.getDefault();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        return kotlin.UByte.m1319constructorimpl(kotlin.text.HexExtensionsKt.hexToByte(str, format));
    }

    /* JADX INFO: renamed from: toHexString-r3ox_E0, reason: not valid java name */
    private static final java.lang.String m2610toHexStringr3ox_E0(short s, kotlin.text.HexFormat format) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        return kotlin.text.HexExtensionsKt.toHexString(s, format);
    }

    /* JADX INFO: renamed from: toHexString-r3ox_E0$default, reason: not valid java name */
    static /* synthetic */ java.lang.String m2611toHexStringr3ox_E0$default(short s, kotlin.text.HexFormat format, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            format = kotlin.text.HexFormat.INSTANCE.getDefault();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        return kotlin.text.HexExtensionsKt.toHexString(s, format);
    }

    private static final short hexToUShort(java.lang.String str, kotlin.text.HexFormat format) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        return kotlin.UShort.m1583constructorimpl(kotlin.text.HexExtensionsKt.hexToShort(str, format));
    }

    static /* synthetic */ short hexToUShort$default(java.lang.String str, kotlin.text.HexFormat format, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            format = kotlin.text.HexFormat.INSTANCE.getDefault();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        return kotlin.UShort.m1583constructorimpl(kotlin.text.HexExtensionsKt.hexToShort(str, format));
    }

    /* JADX INFO: renamed from: toHexString-8M7LxHw, reason: not valid java name */
    private static final java.lang.String m2602toHexString8M7LxHw(int i, kotlin.text.HexFormat format) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        return kotlin.text.HexExtensionsKt.toHexString(i, format);
    }

    /* JADX INFO: renamed from: toHexString-8M7LxHw$default, reason: not valid java name */
    static /* synthetic */ java.lang.String m2603toHexString8M7LxHw$default(int i, kotlin.text.HexFormat format, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            format = kotlin.text.HexFormat.INSTANCE.getDefault();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        return kotlin.text.HexExtensionsKt.toHexString(i, format);
    }

    private static final int hexToUInt(java.lang.String str, kotlin.text.HexFormat format) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        return kotlin.UInt.m1397constructorimpl(kotlin.text.HexExtensionsKt.hexToInt(str, format));
    }

    static /* synthetic */ int hexToUInt$default(java.lang.String str, kotlin.text.HexFormat format, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            format = kotlin.text.HexFormat.INSTANCE.getDefault();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        return kotlin.UInt.m1397constructorimpl(kotlin.text.HexExtensionsKt.hexToInt(str, format));
    }

    /* JADX INFO: renamed from: toHexString-8UJCm-I, reason: not valid java name */
    private static final java.lang.String m2604toHexString8UJCmI(long j, kotlin.text.HexFormat format) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        return kotlin.text.HexExtensionsKt.toHexString(j, format);
    }

    /* JADX INFO: renamed from: toHexString-8UJCm-I$default, reason: not valid java name */
    static /* synthetic */ java.lang.String m2605toHexString8UJCmI$default(long j, kotlin.text.HexFormat format, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            format = kotlin.text.HexFormat.INSTANCE.getDefault();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        return kotlin.text.HexExtensionsKt.toHexString(j, format);
    }

    private static final long hexToULong(java.lang.String str, kotlin.text.HexFormat format) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        return kotlin.ULong.m1476constructorimpl(kotlin.text.HexExtensionsKt.hexToLong(str, format));
    }

    static /* synthetic */ long hexToULong$default(java.lang.String str, kotlin.text.HexFormat format, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            format = kotlin.text.HexFormat.INSTANCE.getDefault();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        return kotlin.ULong.m1476constructorimpl(kotlin.text.HexExtensionsKt.hexToLong(str, format));
    }
}
