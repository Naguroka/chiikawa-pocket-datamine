package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: BufferedChannel.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* synthetic */ class BufferedChannel$onSend$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function3<kotlinx.coroutines.channels.BufferedChannel<?>, java.lang.Object, java.lang.Object, java.lang.Object> {
    public static final kotlinx.coroutines.channels.BufferedChannel$onSend$2 INSTANCE = new kotlinx.coroutines.channels.BufferedChannel$onSend$2();

    BufferedChannel$onSend$2() {
        super(3, kotlinx.coroutines.channels.BufferedChannel.class, "processResultSelectSend", "processResultSelectSend(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public final java.lang.Object invoke(kotlinx.coroutines.channels.BufferedChannel<?> bufferedChannel, java.lang.Object obj, java.lang.Object obj2) {
        return bufferedChannel.processResultSelectSend(obj, obj2);
    }
}
