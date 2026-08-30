package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: BufferedChannel.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* synthetic */ class BufferedChannel$onReceiveCatching$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function3<kotlinx.coroutines.channels.BufferedChannel<?>, kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, kotlin.Unit> {
    public static final kotlinx.coroutines.channels.BufferedChannel$onReceiveCatching$1 INSTANCE = new kotlinx.coroutines.channels.BufferedChannel$onReceiveCatching$1();

    BufferedChannel$onReceiveCatching$1() {
        super(3, kotlinx.coroutines.channels.BufferedChannel.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ kotlin.Unit invoke(kotlinx.coroutines.channels.BufferedChannel<?> bufferedChannel, kotlinx.coroutines.selects.SelectInstance<?> selectInstance, java.lang.Object obj) {
        invoke2(bufferedChannel, selectInstance, obj);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(kotlinx.coroutines.channels.BufferedChannel<?> bufferedChannel, kotlinx.coroutines.selects.SelectInstance<?> selectInstance, java.lang.Object obj) {
        bufferedChannel.registerSelectForReceive(selectInstance, obj);
    }
}
