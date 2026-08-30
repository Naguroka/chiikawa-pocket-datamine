package kotlin.text;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Indent.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000b\u001a!\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0002\b\u0004\u001a\u0011\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0002¢\u0006\u0002\b\u0007\u001a\u0014\u0010\b\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001aJ\u0010\t\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\u0082\b¢\u0006\u0002\b\u000e\u001a\u0014\u0010\u000f\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u001a\u001e\u0010\u0011\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u001a\f\u0010\u0013\u001a\u00020\u0002*\u00020\u0002H\u0007\u001a\u0016\u0010\u0014\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002H\u0007¨\u0006\u0015"}, d2 = {"getIndentFunction", "Lkotlin/Function1;", "", "indent", "getIndentFunction$StringsKt__IndentKt", "indentWidth", "", "indentWidth$StringsKt__IndentKt", "prependIndent", "reindent", "", "resultSizeEstimate", "indentAddFunction", "indentCutFunction", "reindent$StringsKt__IndentKt", "replaceIndent", "newIndent", "replaceIndentByMargin", "marginPrefix", "trimIndent", "trimMargin", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/StringsKt")
public class StringsKt__IndentKt extends kotlin.text.StringsKt__AppendableKt {
    public static /* synthetic */ java.lang.String trimMargin$default(java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str2 = "|";
        }
        return kotlin.text.StringsKt.trimMargin(str, str2);
    }

    public static final java.lang.String trimMargin(java.lang.String str, java.lang.String marginPrefix) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marginPrefix, "marginPrefix");
        return kotlin.text.StringsKt.replaceIndentByMargin(str, "", marginPrefix);
    }

    public static /* synthetic */ java.lang.String replaceIndentByMargin$default(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str2 = "";
        }
        if ((i & 2) != 0) {
            str3 = "|";
        }
        return kotlin.text.StringsKt.replaceIndentByMargin(str, str2, str3);
    }

    public static final java.lang.String replaceIndentByMargin(java.lang.String str, java.lang.String newIndent, java.lang.String marginPrefix) {
        int i;
        java.lang.String strInvoke;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newIndent, "newIndent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marginPrefix, "marginPrefix");
        if (!(!kotlin.text.StringsKt.isBlank(marginPrefix))) {
            throw new java.lang.IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
        java.util.List<java.lang.String> listLines = kotlin.text.StringsKt.lines(str);
        int length = str.length() + (newIndent.length() * listLines.size());
        kotlin.jvm.functions.Function1<java.lang.String, java.lang.String> indentFunction$StringsKt__IndentKt = getIndentFunction$StringsKt__IndentKt(newIndent);
        int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(listLines);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i2 = 0;
        for (java.lang.Object obj : listLines) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            java.lang.String str2 = (java.lang.String) obj;
            java.lang.String strSubstring = null;
            if ((i2 == 0 || i2 == lastIndex) && kotlin.text.StringsKt.isBlank(str2)) {
                str2 = null;
            } else {
                java.lang.String str3 = str2;
                int length2 = str3.length();
                int i4 = 0;
                while (true) {
                    if (i4 >= length2) {
                        i = -1;
                        break;
                    }
                    if (!kotlin.text.CharsKt.isWhitespace(str3.charAt(i4))) {
                        i = i4;
                        break;
                    }
                    i4++;
                }
                if (i != -1) {
                    int i5 = i;
                    if (kotlin.text.StringsKt.startsWith$default(str2, marginPrefix, i, false, 4, (java.lang.Object) null)) {
                        int length3 = i5 + marginPrefix.length();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(str2, "null cannot be cast to non-null type java.lang.String");
                        strSubstring = str2.substring(length3);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    }
                }
                if (strSubstring != null && (strInvoke = indentFunction$StringsKt__IndentKt.invoke(strSubstring)) != null) {
                    str2 = strInvoke;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i2 = i3;
        }
        java.lang.String string = ((java.lang.StringBuilder) kotlin.collections.CollectionsKt.joinTo(arrayList, new java.lang.StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) != 0 ? "" : null, (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final java.lang.String trimIndent(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return kotlin.text.StringsKt.replaceIndent(str, "");
    }

    public static /* synthetic */ java.lang.String replaceIndent$default(java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str2 = "";
        }
        return kotlin.text.StringsKt.replaceIndent(str, str2);
    }

    public static final java.lang.String replaceIndent(java.lang.String str, java.lang.String newIndent) {
        java.lang.String strInvoke;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newIndent, "newIndent");
        java.util.List<java.lang.String> listLines = kotlin.text.StringsKt.lines(str);
        java.util.List<java.lang.String> list = listLines;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (!kotlin.text.StringsKt.isBlank((java.lang.String) obj)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(java.lang.Integer.valueOf(indentWidth$StringsKt__IndentKt((java.lang.String) it.next())));
        }
        java.lang.Integer num = (java.lang.Integer) kotlin.collections.CollectionsKt.minOrNull((java.lang.Iterable) arrayList3);
        int i = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        int length = str.length() + (newIndent.length() * listLines.size());
        kotlin.jvm.functions.Function1<java.lang.String, java.lang.String> indentFunction$StringsKt__IndentKt = getIndentFunction$StringsKt__IndentKt(newIndent);
        int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(listLines);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            java.lang.String str2 = (java.lang.String) obj2;
            if ((i == 0 || i == lastIndex) && kotlin.text.StringsKt.isBlank(str2)) {
                str2 = null;
            } else {
                java.lang.String strDrop = kotlin.text.StringsKt.drop(str2, iIntValue);
                if (strDrop != null && (strInvoke = indentFunction$StringsKt__IndentKt.invoke(strDrop)) != null) {
                    str2 = strInvoke;
                }
            }
            if (str2 != null) {
                arrayList4.add(str2);
            }
            i = i2;
        }
        java.lang.String string = ((java.lang.StringBuilder) kotlin.collections.CollectionsKt.joinTo(arrayList4, new java.lang.StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) != 0 ? "" : null, (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ java.lang.String prependIndent$default(java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str2 = "    ";
        }
        return kotlin.text.StringsKt.prependIndent(str, str2);
    }

    public static final java.lang.String prependIndent(java.lang.String str, final java.lang.String indent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(indent, "indent");
        return kotlin.sequences.SequencesKt.joinToString$default(kotlin.sequences.SequencesKt.map(kotlin.text.StringsKt.lineSequence(str), new kotlin.jvm.functions.Function1<java.lang.String, java.lang.String>() { // from class: kotlin.text.StringsKt__IndentKt.prependIndent.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final java.lang.String invoke(java.lang.String it) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                if (kotlin.text.StringsKt.isBlank(it)) {
                    return it.length() < indent.length() ? indent : it;
                }
                return indent + it;
            }
        }), "\n", null, null, 0, null, null, 62, null);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    /* JADX WARN: Code duplicated, block: B:15:? A[RETURN, SYNTHETIC] */
    private static final int indentWidth$StringsKt__IndentKt(java.lang.String str) {
        java.lang.String str2 = str;
        int length = str2.length();
        int i = 0;
        while (i < length) {
            if (!kotlin.text.CharsKt.isWhitespace(str2.charAt(i))) {
                if (i == -1) {
                    return str.length();
                }
                return i;
            }
            i++;
        }
        i = -1;
        if (i == -1) {
            return str.length();
        }
        return i;
    }

    private static final kotlin.jvm.functions.Function1<java.lang.String, java.lang.String> getIndentFunction$StringsKt__IndentKt(final java.lang.String str) {
        return str.length() == 0 ? new kotlin.jvm.functions.Function1<java.lang.String, java.lang.String>() { // from class: kotlin.text.StringsKt__IndentKt$getIndentFunction$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.String invoke(java.lang.String line) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(line, "line");
                return line;
            }
        } : new kotlin.jvm.functions.Function1<java.lang.String, java.lang.String>() { // from class: kotlin.text.StringsKt__IndentKt$getIndentFunction$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final java.lang.String invoke(java.lang.String line) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(line, "line");
                return str + line;
            }
        };
    }

    private static final java.lang.String reindent$StringsKt__IndentKt(java.util.List<java.lang.String> list, int i, kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.String> function1, kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.String> function2) {
        java.lang.String strInvoke;
        int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(list);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i2 = 0;
        for (java.lang.Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                if (!kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new java.lang.ArithmeticException("Index overflow has happened.");
                }
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            java.lang.String str = (java.lang.String) obj;
            if ((i2 == 0 || i2 == lastIndex) && kotlin.text.StringsKt.isBlank(str)) {
                str = null;
            } else {
                java.lang.String strInvoke2 = function2.invoke(str);
                if (strInvoke2 != null && (strInvoke = function1.invoke(strInvoke2)) != null) {
                    str = strInvoke;
                }
            }
            if (str != null) {
                arrayList.add(str);
            }
            i2 = i3;
        }
        java.lang.String string = ((java.lang.StringBuilder) kotlin.collections.CollectionsKt.joinTo(arrayList, new java.lang.StringBuilder(i), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) != 0 ? "" : null, (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
