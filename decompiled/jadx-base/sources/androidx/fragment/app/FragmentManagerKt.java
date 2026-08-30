package androidx.fragment.app;

/* JADX INFO: compiled from: FragmentManager.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000\u001a3\u0010\t\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000\u001a=\u0010\n\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, d2 = {"commit", "", "Landroidx/fragment/app/FragmentManager;", "allowStateLoss", "", "body", "Lkotlin/Function1;", "Landroidx/fragment/app/FragmentTransaction;", "Lkotlin/ExtensionFunctionType;", "commitNow", "transaction", "now", "fragment-ktx_release"}, k = 2, mv = {1, 4, 1})
public final class FragmentManagerKt {
    public static /* synthetic */ void commit$default(androidx.fragment.app.FragmentManager commit, boolean z, kotlin.jvm.functions.Function1 body, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commit, "$this$commit");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = commit.beginTransaction();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction()");
        body.invoke(fragmentTransactionBeginTransaction);
        if (z) {
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        } else {
            fragmentTransactionBeginTransaction.commit();
        }
    }

    public static final void commit(androidx.fragment.app.FragmentManager commit, boolean z, kotlin.jvm.functions.Function1<? super androidx.fragment.app.FragmentTransaction, kotlin.Unit> body) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commit, "$this$commit");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = commit.beginTransaction();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction()");
        body.invoke(fragmentTransactionBeginTransaction);
        if (z) {
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        } else {
            fragmentTransactionBeginTransaction.commit();
        }
    }

    public static /* synthetic */ void commitNow$default(androidx.fragment.app.FragmentManager commitNow, boolean z, kotlin.jvm.functions.Function1 body, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commitNow, "$this$commitNow");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = commitNow.beginTransaction();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction()");
        body.invoke(fragmentTransactionBeginTransaction);
        if (z) {
            fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
        } else {
            fragmentTransactionBeginTransaction.commitNow();
        }
    }

    public static final void commitNow(androidx.fragment.app.FragmentManager commitNow, boolean z, kotlin.jvm.functions.Function1<? super androidx.fragment.app.FragmentTransaction, kotlin.Unit> body) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commitNow, "$this$commitNow");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = commitNow.beginTransaction();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction()");
        body.invoke(fragmentTransactionBeginTransaction);
        if (z) {
            fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
        } else {
            fragmentTransactionBeginTransaction.commitNow();
        }
    }

    public static /* synthetic */ void transaction$default(androidx.fragment.app.FragmentManager transaction, boolean z, boolean z2, kotlin.jvm.functions.Function1 body, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transaction, "$this$transaction");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = transaction.beginTransaction();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction()");
        body.invoke(fragmentTransactionBeginTransaction);
        if (z) {
            if (z2) {
                fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
                return;
            } else {
                fragmentTransactionBeginTransaction.commitNow();
                return;
            }
        }
        if (z2) {
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        } else {
            fragmentTransactionBeginTransaction.commit();
        }
    }

    @kotlin.Deprecated(message = "Use commit { .. } or commitNow { .. } extensions")
    public static final void transaction(androidx.fragment.app.FragmentManager transaction, boolean z, boolean z2, kotlin.jvm.functions.Function1<? super androidx.fragment.app.FragmentTransaction, kotlin.Unit> body) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transaction, "$this$transaction");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = transaction.beginTransaction();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction()");
        body.invoke(fragmentTransactionBeginTransaction);
        if (z) {
            if (z2) {
                fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
                return;
            } else {
                fragmentTransactionBeginTransaction.commitNow();
                return;
            }
        }
        if (z2) {
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        } else {
            fragmentTransactionBeginTransaction.commit();
        }
    }
}
