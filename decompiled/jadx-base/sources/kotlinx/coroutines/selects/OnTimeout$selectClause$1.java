package kotlinx.coroutines.selects;

/* JADX INFO: compiled from: OnTimeout.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* synthetic */ class OnTimeout$selectClause$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function3<kotlinx.coroutines.selects.OnTimeout, kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, kotlin.Unit> {
    public static final kotlinx.coroutines.selects.OnTimeout$selectClause$1 INSTANCE = new kotlinx.coroutines.selects.OnTimeout$selectClause$1();

    OnTimeout$selectClause$1() {
        super(3, kotlinx.coroutines.selects.OnTimeout.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ kotlin.Unit invoke(kotlinx.coroutines.selects.OnTimeout onTimeout, kotlinx.coroutines.selects.SelectInstance<?> selectInstance, java.lang.Object obj) {
        invoke2(onTimeout, selectInstance, obj);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(kotlinx.coroutines.selects.OnTimeout onTimeout, kotlinx.coroutines.selects.SelectInstance<?> selectInstance, java.lang.Object obj) {
        onTimeout.register(selectInstance, obj);
    }
}
