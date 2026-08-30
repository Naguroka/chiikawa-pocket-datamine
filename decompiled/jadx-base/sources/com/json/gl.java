package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0002J%\u0010\t\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0003\u0010\nJ\u0006\u0010\u000b\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\u0007R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/ironsource/gl;", "", "", "b", "", "Ljava/lang/StackTraceElement;", "stackTrace", "", "depth", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "([Ljava/lang/StackTraceElement;I)Ljava/lang/String;", "c", "Ljava/lang/String;", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, "I", "logLevel", "<init>", "(Ljava/lang/String;I)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class gl {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String message;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int logLevel;

    public gl(java.lang.String str, int i) {
        this.message = str;
        this.logLevel = i;
    }

    private final java.lang.String a(java.lang.StackTraceElement[] stackTrace, int depth) {
        java.util.List listEmptyList;
        java.util.List listEmptyList2;
        if (stackTrace.length <= depth) {
            return "";
        }
        java.lang.String className = stackTrace[depth].getClassName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className, "stackTrace[depth]\n              .className");
        java.util.List<java.lang.String> listSplit = new kotlin.text.Regex("\\.").split(className, 0);
        if (!listSplit.isEmpty()) {
            java.util.ListIterator<java.lang.String> listIterator = listSplit.listIterator(listSplit.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    listEmptyList = kotlin.collections.CollectionsKt.emptyList();
                    break;
                }
                if (!(listIterator.previous().length() == 0)) {
                    listEmptyList = kotlin.collections.CollectionsKt.take(listSplit, listIterator.nextIndex() + 1);
                    break;
                }
            }
        } else {
            listEmptyList = kotlin.collections.CollectionsKt.emptyList();
            break;
        }
        java.lang.String[] strArr = (java.lang.String[]) listEmptyList.toArray(new java.lang.String[0]);
        java.lang.String str = strArr[strArr.length - 1];
        if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "$", false, 2, (java.lang.Object) null)) {
            return str;
        }
        java.util.List<java.lang.String> listSplit2 = new kotlin.text.Regex("\\$").split(str, 0);
        if (listSplit2.isEmpty()) {
            listEmptyList2 = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.ListIterator<java.lang.String> listIterator2 = listSplit2.listIterator(listSplit2.size());
            while (listIterator2.hasPrevious()) {
                if (!(listIterator2.previous().length() == 0)) {
                    listEmptyList2 = kotlin.collections.CollectionsKt.take(listSplit2, listIterator2.nextIndex() + 1);
                }
            }
            listEmptyList2 = kotlin.collections.CollectionsKt.emptyList();
        }
        return ((java.lang.String[]) listEmptyList2.toArray(new java.lang.String[0]))[0];
    }

    private final java.lang.String b() {
        java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stackTrace, "stackTrace");
        java.lang.String strA = a(stackTrace, 6);
        java.lang.String strB = b(stackTrace, 6);
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String str = java.lang.String.format("%s %s", java.util.Arrays.copyOf(new java.lang.Object[]{strA, strB}, 2));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        return str;
    }

    private final java.lang.String b(java.lang.StackTraceElement[] stackTrace, int depth) {
        java.util.List listEmptyList;
        int i;
        java.util.List listEmptyList2;
        java.lang.StringBuilder sbAppend;
        java.util.List listEmptyList3;
        if (stackTrace.length <= depth) {
            return "";
        }
        java.lang.String className = stackTrace[depth].getClassName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className, "stackTrace[depth]\n              .className");
        java.util.List<java.lang.String> listSplit = new kotlin.text.Regex("\\.").split(className, 0);
        if (!listSplit.isEmpty()) {
            java.util.ListIterator<java.lang.String> listIterator = listSplit.listIterator(listSplit.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    listEmptyList = kotlin.collections.CollectionsKt.emptyList();
                    break;
                }
                if (!(listIterator.previous().length() == 0)) {
                    listEmptyList = kotlin.collections.CollectionsKt.take(listSplit, listIterator.nextIndex() + 1);
                    break;
                }
            }
        } else {
            listEmptyList = kotlin.collections.CollectionsKt.emptyList();
            break;
        }
        java.lang.String[] strArr = (java.lang.String[]) listEmptyList.toArray(new java.lang.String[0]);
        java.lang.String str = strArr[strArr.length - 1];
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "$", false, 2, (java.lang.Object) null)) {
            java.util.List<java.lang.String> listSplit2 = new kotlin.text.Regex("\\$").split(str, 0);
            if (!listSplit2.isEmpty()) {
                java.util.ListIterator<java.lang.String> listIterator2 = listSplit2.listIterator(listSplit2.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        listEmptyList3 = kotlin.collections.CollectionsKt.emptyList();
                        break;
                    }
                    if (!(listIterator2.previous().length() == 0)) {
                        listEmptyList3 = kotlin.collections.CollectionsKt.take(listSplit2, listIterator2.nextIndex() + 1);
                        break;
                    }
                }
            } else {
                listEmptyList3 = kotlin.collections.CollectionsKt.emptyList();
                break;
            }
            sbAppend = new java.lang.StringBuilder().append(((java.lang.String[]) listEmptyList3.toArray(new java.lang.String[0]))[1]).append('.').append(stackTrace[depth].getMethodName());
        } else {
            java.lang.String methodName = stackTrace[depth].getMethodName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(methodName, "stackTrace[depth].methodName");
            if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) methodName, (java.lang.CharSequence) "$", false, 2, (java.lang.Object) null) || stackTrace.length <= (i = depth + 1)) {
                java.lang.String methodName2 = stackTrace[depth].getMethodName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(methodName2, "stackTrace[depth].methodName");
                return methodName2;
            }
            java.lang.String className2 = stackTrace[i].getClassName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className2, "stackTrace[depth + 1]\n                .className");
            java.util.List<java.lang.String> listSplit3 = new kotlin.text.Regex("\\$").split(className2, 0);
            if (!listSplit3.isEmpty()) {
                java.util.ListIterator<java.lang.String> listIterator3 = listSplit3.listIterator(listSplit3.size());
                while (true) {
                    if (!listIterator3.hasPrevious()) {
                        listEmptyList2 = kotlin.collections.CollectionsKt.emptyList();
                        break;
                    }
                    if (!(listIterator3.previous().length() == 0)) {
                        listEmptyList2 = kotlin.collections.CollectionsKt.take(listSplit3, listIterator3.nextIndex() + 1);
                        break;
                    }
                }
            } else {
                listEmptyList2 = kotlin.collections.CollectionsKt.emptyList();
                break;
            }
            java.lang.String[] strArr2 = (java.lang.String[]) listEmptyList2.toArray(new java.lang.String[0]);
            if (strArr2.length <= 1) {
                java.lang.String methodName3 = stackTrace[i].getMethodName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(methodName3, "{\n              stackTra….methodName\n            }");
                return methodName3;
            }
            sbAppend = new java.lang.StringBuilder().append(strArr2[1]).append('.').append(stackTrace[i].getMethodName());
        }
        return sbAppend.toString();
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getLogLevel() {
        return this.logLevel;
    }

    public final java.lang.String c() {
        java.lang.String str = this.message;
        return str == null || str.length() == 0 ? b() : b() + " - " + this.message;
    }
}
