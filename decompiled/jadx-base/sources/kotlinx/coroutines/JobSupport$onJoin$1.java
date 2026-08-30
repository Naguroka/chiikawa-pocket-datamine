package kotlinx.coroutines;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* synthetic */ class JobSupport$onJoin$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function3<kotlinx.coroutines.JobSupport, kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, kotlin.Unit> {
    public static final kotlinx.coroutines.JobSupport$onJoin$1 INSTANCE = new kotlinx.coroutines.JobSupport$onJoin$1();

    JobSupport$onJoin$1() {
        super(3, kotlinx.coroutines.JobSupport.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ kotlin.Unit invoke(kotlinx.coroutines.JobSupport jobSupport, kotlinx.coroutines.selects.SelectInstance<?> selectInstance, java.lang.Object obj) {
        invoke2(jobSupport, selectInstance, obj);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(kotlinx.coroutines.JobSupport jobSupport, kotlinx.coroutines.selects.SelectInstance<?> selectInstance, java.lang.Object obj) {
        jobSupport.registerSelectForOnJoin(selectInstance, obj);
    }
}
