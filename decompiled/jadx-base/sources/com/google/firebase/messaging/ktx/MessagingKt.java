package com.google.firebase.messaging.ktx;

/* JADX INFO: compiled from: Messaging.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a/\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0019\b\u0004\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\u0087\bø\u0001\u0000\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e"}, d2 = {"messaging", "Lcom/google/firebase/messaging/FirebaseMessaging;", "Lcom/google/firebase/ktx/Firebase;", "getMessaging", "(Lcom/google/firebase/ktx/Firebase;)Lcom/google/firebase/messaging/FirebaseMessaging;", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO, "", com.ironsource.y8.a.f, "Lkotlin/Function1;", "Lcom/google/firebase/messaging/RemoteMessage$Builder;", "", "Lkotlin/ExtensionFunctionType;", "com.google.firebase-firebase-messaging"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class MessagingKt {
    public static final com.google.firebase.messaging.FirebaseMessaging getMessaging(com.google.firebase.ktx.Firebase firebase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebase, "<this>");
        com.google.firebase.messaging.FirebaseMessaging firebaseMessaging = com.google.firebase.messaging.FirebaseMessaging.getInstance();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(firebaseMessaging, "getInstance()");
        return firebaseMessaging;
    }

    @kotlin.Deprecated(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public static final com.google.firebase.messaging.RemoteMessage remoteMessage(java.lang.String to, kotlin.jvm.functions.Function1<? super com.google.firebase.messaging.RemoteMessage.Builder, kotlin.Unit> init) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(to, "to");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(init, "init");
        com.google.firebase.messaging.RemoteMessage.Builder builder = new com.google.firebase.messaging.RemoteMessage.Builder(to);
        init.invoke(builder);
        com.google.firebase.messaging.RemoteMessage remoteMessageBuild = builder.build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(remoteMessageBuild, "builder.build()");
        return remoteMessageBuild;
    }
}
