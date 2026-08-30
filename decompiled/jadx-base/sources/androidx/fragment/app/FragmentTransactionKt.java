package androidx.fragment.app;

/* JADX INFO: compiled from: FragmentTransaction.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0086\b\u001a-\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0086\b\u001a;\u0010\n\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0086\b¨\u0006\u000b"}, d2 = {"add", "Landroidx/fragment/app/FragmentTransaction;", "F", "Landroidx/fragment/app/Fragment;", "containerViewId", "", "tag", "", "args", "Landroid/os/Bundle;", "replace", "fragment-ktx_release"}, k = 2, mv = {1, 4, 1})
public final class FragmentTransactionKt {
    public static /* synthetic */ androidx.fragment.app.FragmentTransaction add$default(androidx.fragment.app.FragmentTransaction add, int i, java.lang.String str, android.os.Bundle bundle, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            bundle = null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(add, "$this$add");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "F");
        androidx.fragment.app.FragmentTransaction fragmentTransactionAdd = add.add(i, androidx.fragment.app.Fragment.class, bundle, str);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fragmentTransactionAdd, "add(containerViewId, F::class.java, args, tag)");
        return fragmentTransactionAdd;
    }

    public static final /* synthetic */ <F extends androidx.fragment.app.Fragment> androidx.fragment.app.FragmentTransaction add(androidx.fragment.app.FragmentTransaction add, int i, java.lang.String str, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(add, "$this$add");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "F");
        androidx.fragment.app.FragmentTransaction fragmentTransactionAdd = add.add(i, androidx.fragment.app.Fragment.class, bundle, str);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fragmentTransactionAdd, "add(containerViewId, F::class.java, args, tag)");
        return fragmentTransactionAdd;
    }

    public static /* synthetic */ androidx.fragment.app.FragmentTransaction add$default(androidx.fragment.app.FragmentTransaction add, java.lang.String tag, android.os.Bundle bundle, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(add, "$this$add");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "F");
        androidx.fragment.app.FragmentTransaction fragmentTransactionAdd = add.add(androidx.fragment.app.Fragment.class, bundle, tag);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fragmentTransactionAdd, "add(F::class.java, args, tag)");
        return fragmentTransactionAdd;
    }

    public static final /* synthetic */ <F extends androidx.fragment.app.Fragment> androidx.fragment.app.FragmentTransaction add(androidx.fragment.app.FragmentTransaction add, java.lang.String tag, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(add, "$this$add");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "F");
        androidx.fragment.app.FragmentTransaction fragmentTransactionAdd = add.add(androidx.fragment.app.Fragment.class, bundle, tag);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fragmentTransactionAdd, "add(F::class.java, args, tag)");
        return fragmentTransactionAdd;
    }

    public static /* synthetic */ androidx.fragment.app.FragmentTransaction replace$default(androidx.fragment.app.FragmentTransaction replace, int i, java.lang.String str, android.os.Bundle bundle, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            bundle = null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replace, "$this$replace");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "F");
        androidx.fragment.app.FragmentTransaction fragmentTransactionReplace = replace.replace(i, androidx.fragment.app.Fragment.class, bundle, str);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fragmentTransactionReplace, "replace(containerViewId, F::class.java, args, tag)");
        return fragmentTransactionReplace;
    }

    public static final /* synthetic */ <F extends androidx.fragment.app.Fragment> androidx.fragment.app.FragmentTransaction replace(androidx.fragment.app.FragmentTransaction replace, int i, java.lang.String str, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replace, "$this$replace");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "F");
        androidx.fragment.app.FragmentTransaction fragmentTransactionReplace = replace.replace(i, androidx.fragment.app.Fragment.class, bundle, str);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fragmentTransactionReplace, "replace(containerViewId, F::class.java, args, tag)");
        return fragmentTransactionReplace;
    }
}
